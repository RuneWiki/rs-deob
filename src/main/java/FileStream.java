import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("vb")
public class FileStream {

    @OriginalMember(owner = "vb", name = "e", descriptor = "I")
    public int field856 = 65000;

    @OriginalMember(owner = "vb", name = "d", descriptor = "I")
    public int field855;

    @OriginalMember(owner = "vb", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field853;

    @OriginalMember(owner = "vb", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field854;

    @OriginalMember(owner = "vb", name = "a", descriptor = "[B")
    public static byte[] field852 = new byte[520];

    @OriginalMember(owner = "vb", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;BLjava/io/RandomAccessFile;II)V")
    public FileStream(RandomAccessFile arg0, byte arg1, RandomAccessFile arg2, int arg3, int arg4) {
        this.field855 = arg3;
        if (arg1 != 80) {
            throw new NullPointerException();
        }
        this.field853 = arg0;
        this.field854 = arg2;
        this.field856 = arg4;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method291(int arg0, int arg1) {
        int var3 = 67 / arg1;
        try {
            this.method294(this.field854, arg0 * 6, (byte) -115);
            int var5;
            for (int var4 = 0; var4 < 6; var4 += var5) {
                var5 = this.field854.read(field852, var4, 6 - var4);
                if (var5 == -1) {
                    return null;
                }
            }
            int var6 = (field852[2] & 0xFF) + ((field852[0] & 0xFF) << 16) + ((field852[1] & 0xFF) << 8);
            int var7 = (field852[5] & 0xFF) + ((field852[3] & 0xFF) << 16) + ((field852[4] & 0xFF) << 8);
            if (var6 < 0 || var6 > this.field856) {
                return null;
            } else if (var7 > 0 && (long) var7 <= this.field853.length() / 520L) {
                byte[] var8 = new byte[var6];
                int var9 = 0;
                int var10 = 0;
                while (var9 < var6) {
                    if (var7 == 0) {
                        return null;
                    }
                    this.method294(this.field853, var7 * 520, (byte) -115);
                    int var11 = 0;
                    int var12 = var6 - var9;
                    if (var12 > 512) {
                        var12 = 512;
                    }
                    while (var11 < var12 + 8) {
                        int var13 = this.field853.read(field852, var11, var12 + 8 - var11);
                        if (var13 == -1) {
                            return null;
                        }
                        var11 += var13;
                    }
                    int var14 = ((field852[0] & 0xFF) << 8) + (field852[1] & 0xFF);
                    int var15 = ((field852[2] & 0xFF) << 8) + (field852[3] & 0xFF);
                    int var16 = (field852[6] & 0xFF) + ((field852[4] & 0xFF) << 16) + ((field852[5] & 0xFF) << 8);
                    int var17 = field852[7] & 0xFF;
                    if (arg0 == var14 && var10 == var15 && this.field855 == var17) {
                        if (var16 >= 0 && (long) var16 <= this.field853.length() / 520L) {
                            for (int var18 = 0; var18 < var12; var18++) {
                                var8[var9++] = field852[var18 + 8];
                            }
                            var7 = var16;
                            var10++;
                            continue;
                        }
                        return null;
                    }
                    return null;
                }
                return var8;
            } else {
                return null;
            }
        } catch (IOException var19) {
            return null;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(II[BI)Z")
    public synchronized boolean method292(int arg0, int arg1, byte[] arg2, int arg3) {
        boolean var5 = this.method293(arg3, arg1, 0, arg2, true);
        if (arg0 != 6) {
            throw new NullPointerException();
        }
        if (!var5) {
            var5 = this.method293(arg3, arg1, 0, arg2, false);
        }
        return var5;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(III[BZ)Z")
    private synchronized boolean method293(int arg0, int arg1, int arg2, byte[] arg3, boolean arg4) {
        if (arg2 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        try {
            int var9;
            if (arg4) {
                this.method294(this.field854, arg1 * 6, (byte) -115);
                int var8;
                for (int var7 = 0; var7 < 6; var7 += var8) {
                    var8 = this.field854.read(field852, var7, 6 - var7);
                    if (var8 == -1) {
                        return false;
                    }
                }
                var9 = (field852[5] & 0xFF) + ((field852[3] & 0xFF) << 16) + ((field852[4] & 0xFF) << 8);
                if (var9 <= 0 || (long) var9 > this.field853.length() / 520L) {
                    return false;
                }
            } else {
                var9 = (int) ((this.field853.length() + 519L) / 520L);
                if (var9 == 0) {
                    var9 = 1;
                }
            }
            field852[0] = (byte) (arg0 >> 16);
            field852[1] = (byte) (arg0 >> 8);
            field852[2] = (byte) arg0;
            field852[3] = (byte) (var9 >> 16);
            field852[4] = (byte) (var9 >> 8);
            field852[5] = (byte) var9;
            this.method294(this.field854, arg1 * 6, (byte) -115);
            this.field854.write(field852, 0, 6);
            int var10 = 0;
            int var11 = 0;
            while (var10 < arg0) {
                int var12 = 0;
                if (arg4) {
                    this.method294(this.field853, var9 * 520, (byte) -115);
                    int var13;
                    int var14;
                    for (var13 = 0; var13 < 8; var13 += var14) {
                        var14 = this.field853.read(field852, var13, 8 - var13);
                        if (var14 == -1) {
                            break;
                        }
                    }
                    if (var13 == 8) {
                        label117: {
                            int var15 = ((field852[0] & 0xFF) << 8) + (field852[1] & 0xFF);
                            int var16 = ((field852[2] & 0xFF) << 8) + (field852[3] & 0xFF);
                            var12 = (field852[6] & 0xFF) + ((field852[4] & 0xFF) << 16) + ((field852[5] & 0xFF) << 8);
                            int var17 = field852[7] & 0xFF;
                            if (arg1 == var15 && var11 == var16 && this.field855 == var17) {
                                if (var12 >= 0 && (long) var12 <= this.field853.length() / 520L) {
                                    break label117;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var12 == 0) {
                    arg4 = false;
                    var12 = (int) ((this.field853.length() + 519L) / 520L);
                    if (var12 == 0) {
                        var12++;
                    }
                    if (var9 == var12) {
                        var12++;
                    }
                }
                if (arg0 - var10 <= 512) {
                    var12 = 0;
                }
                field852[0] = (byte) (arg1 >> 8);
                field852[1] = (byte) arg1;
                field852[2] = (byte) (var11 >> 8);
                field852[3] = (byte) var11;
                field852[4] = (byte) (var12 >> 16);
                field852[5] = (byte) (var12 >> 8);
                field852[6] = (byte) var12;
                field852[7] = (byte) this.field855;
                this.method294(this.field853, var9 * 520, (byte) -115);
                this.field853.write(field852, 0, 8);
                int var18 = arg0 - var10;
                if (var18 > 512) {
                    var18 = 512;
                }
                this.field853.write(arg3, var10, var18);
                var10 += var18;
                var9 = var12;
                var11++;
            }
            return true;
        } catch (IOException var19) {
            return false;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Ljava/io/RandomAccessFile;IB)V")
    public synchronized void method294(RandomAccessFile arg0, int arg1, byte arg2) throws IOException {
        if (arg2 != -115) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg1 < 0 || arg1 > 62914560) {
            System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
            arg1 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var5) {
            }
        }
        arg0.seek((long) arg1);
    }
}
