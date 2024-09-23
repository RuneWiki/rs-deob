import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("vb")
public class FileStream {

    @OriginalMember(owner = "vb", name = "a", descriptor = "I")
    private int field855 = 1;

    @OriginalMember(owner = "vb", name = "b", descriptor = "Z")
    private boolean field856 = true;

    @OriginalMember(owner = "vb", name = "g", descriptor = "I")
    public int field861 = 65000;

    @OriginalMember(owner = "vb", name = "f", descriptor = "I")
    public int field860;

    @OriginalMember(owner = "vb", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field858;

    @OriginalMember(owner = "vb", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field859;

    @OriginalMember(owner = "vb", name = "c", descriptor = "[B")
    public static byte[] field857 = new byte[520];

    @OriginalMember(owner = "vb", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;IIILjava/io/RandomAccessFile;)V")
    public FileStream(RandomAccessFile arg0, int arg1, int arg2, int arg3, RandomAccessFile arg4) {
        this.field860 = arg1;
        this.field858 = arg4;
        this.field859 = arg0;
        if (arg2 != 7) {
            this.field855 = -464;
        }
        this.field861 = arg3;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method291(int arg0, int arg1) {
        if (arg0 <= 0) {
            this.field856 = !this.field856;
        }
        try {
            this.method294(this.field859, arg1 * 6, (byte) -73);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field859.read(field857, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field857[2] & 0xFF) + ((field857[0] & 0xFF) << 16) + ((field857[1] & 0xFF) << 8);
            int var6 = (field857[5] & 0xFF) + ((field857[3] & 0xFF) << 16) + ((field857[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field861) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field858.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method294(this.field858, var6 * 520, (byte) -73);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field858.read(field857, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field857[0] & 0xFF) << 8) + (field857[1] & 0xFF);
                    int var14 = ((field857[2] & 0xFF) << 8) + (field857[3] & 0xFF);
                    int var15 = (field857[6] & 0xFF) + ((field857[4] & 0xFF) << 16) + ((field857[5] & 0xFF) << 8);
                    int var16 = field857[7] & 0xFF;
                    if (arg1 == var13 && var9 == var14 && this.field860 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field858.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field857[var17 + 8];
                            }
                            var6 = var15;
                            var9++;
                            continue;
                        }
                        return null;
                    }
                    return null;
                }
                return var7;
            } else {
                return null;
            }
        } catch (IOException var18) {
            return null;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "([BIII)Z")
    public synchronized boolean method292(byte[] arg0, int arg1, int arg2, int arg3) {
        boolean var5 = this.method293(true, arg0, false, arg2, arg1);
        if (arg3 >= 0) {
            throw new NullPointerException();
        }
        if (!var5) {
            var5 = this.method293(false, arg0, false, arg2, arg1);
        }
        return var5;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Z[BZII)Z")
    private synchronized boolean method293(boolean arg0, byte[] arg1, boolean arg2, int arg3, int arg4) {
        if (arg2) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        try {
            int var9;
            if (arg0) {
                this.method294(this.field859, arg4 * 6, (byte) -73);
                int var8;
                for (int var7 = 0; var7 < 6; var7 += var8) {
                    var8 = this.field859.read(field857, var7, 6 - var7);
                    if (var8 == -1) {
                        return false;
                    }
                }
                var9 = (field857[5] & 0xFF) + ((field857[3] & 0xFF) << 16) + ((field857[4] & 0xFF) << 8);
                if (var9 <= 0 || (long) var9 > this.field858.length() / 520L) {
                    return false;
                }
            } else {
                var9 = (int) ((this.field858.length() + 519L) / 520L);
                if (var9 == 0) {
                    var9 = 1;
                }
            }
            field857[0] = (byte) (arg3 >> 16);
            field857[1] = (byte) (arg3 >> 8);
            field857[2] = (byte) arg3;
            field857[3] = (byte) (var9 >> 16);
            field857[4] = (byte) (var9 >> 8);
            field857[5] = (byte) var9;
            this.method294(this.field859, arg4 * 6, (byte) -73);
            this.field859.write(field857, 0, 6);
            int var10 = 0;
            int var11 = 0;
            while (var10 < arg3) {
                int var12 = 0;
                if (arg0) {
                    this.method294(this.field858, var9 * 520, (byte) -73);
                    int var13;
                    int var14;
                    for (var13 = 0; var13 < 8; var13 += var14) {
                        var14 = this.field858.read(field857, var13, 8 - var13);
                        if (var14 == -1) {
                            break;
                        }
                    }
                    if (var13 == 8) {
                        label117: {
                            int var15 = ((field857[0] & 0xFF) << 8) + (field857[1] & 0xFF);
                            int var16 = ((field857[2] & 0xFF) << 8) + (field857[3] & 0xFF);
                            var12 = (field857[6] & 0xFF) + ((field857[4] & 0xFF) << 16) + ((field857[5] & 0xFF) << 8);
                            int var17 = field857[7] & 0xFF;
                            if (arg4 == var15 && var11 == var16 && this.field860 == var17) {
                                if (var12 >= 0 && (long) var12 <= this.field858.length() / 520L) {
                                    break label117;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var12 == 0) {
                    arg0 = false;
                    var12 = (int) ((this.field858.length() + 519L) / 520L);
                    if (var12 == 0) {
                        var12++;
                    }
                    if (var9 == var12) {
                        var12++;
                    }
                }
                if (arg3 - var10 <= 512) {
                    var12 = 0;
                }
                field857[0] = (byte) (arg4 >> 8);
                field857[1] = (byte) arg4;
                field857[2] = (byte) (var11 >> 8);
                field857[3] = (byte) var11;
                field857[4] = (byte) (var12 >> 16);
                field857[5] = (byte) (var12 >> 8);
                field857[6] = (byte) var12;
                field857[7] = (byte) this.field860;
                this.method294(this.field858, var9 * 520, (byte) -73);
                this.field858.write(field857, 0, 8);
                int var18 = arg3 - var10;
                if (var18 > 512) {
                    var18 = 512;
                }
                this.field858.write(arg1, var10, var18);
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
        if (arg2 != -73) {
            this.field856 = !this.field856;
        }
        if (arg1 < 0 || arg1 > 62914560) {
            System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
            arg1 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg0.seek((long) arg1);
    }
}
