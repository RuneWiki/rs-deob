import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("vb")
public class FileStream {

    @OriginalMember(owner = "vb", name = "e", descriptor = "I")
    public int field865 = 65000;

    @OriginalMember(owner = "vb", name = "d", descriptor = "I")
    public int field864;

    @OriginalMember(owner = "vb", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field862;

    @OriginalMember(owner = "vb", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field863;

    @OriginalMember(owner = "vb", name = "a", descriptor = "[B")
    public static byte[] field861 = new byte[520];

    @OriginalMember(owner = "vb", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;IIILjava/io/RandomAccessFile;)V")
    public FileStream(RandomAccessFile arg0, int arg1, int arg2, int arg3, RandomAccessFile arg4) {
        this.field864 = arg3;
        this.field862 = arg0;
        this.field863 = arg4;
        this.field865 = arg2;
        if (arg1 < 2 || arg1 > 2) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method291(int arg0, int arg1) {
        if (arg1 != 8) {
            throw new NullPointerException();
        }
        try {
            this.method294(this.field863, (byte) -38, arg0 * 6);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field863.read(field861, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field861[2] & 0xFF) + ((field861[0] & 0xFF) << 16) + ((field861[1] & 0xFF) << 8);
            int var6 = (field861[5] & 0xFF) + ((field861[3] & 0xFF) << 16) + ((field861[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field865) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field862.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method294(this.field862, (byte) -38, var6 * 520);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field862.read(field861, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field861[0] & 0xFF) << 8) + (field861[1] & 0xFF);
                    int var14 = ((field861[2] & 0xFF) << 8) + (field861[3] & 0xFF);
                    int var15 = (field861[6] & 0xFF) + ((field861[4] & 0xFF) << 16) + ((field861[5] & 0xFF) << 8);
                    int var16 = field861[7] & 0xFF;
                    if (arg0 == var13 && var9 == var14 && this.field864 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field862.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field861[var17 + 8];
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

    @OriginalMember(owner = "vb", name = "a", descriptor = "(I[BII)Z")
    public synchronized boolean method292(int arg0, byte[] arg1, int arg2, int arg3) {
        boolean var5 = this.method293(-12880, true, arg2, arg1, arg3);
        if (arg0 != 7) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (!var5) {
            var5 = this.method293(-12880, false, arg2, arg1, arg3);
        }
        return var5;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IZI[BI)Z")
    private synchronized boolean method293(int arg0, boolean arg1, int arg2, byte[] arg3, int arg4) {
        if (arg0 != -12880) {
            throw new NullPointerException();
        }
        try {
            int var8;
            if (arg1) {
                this.method294(this.field863, (byte) -38, arg2 * 6);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field863.read(field861, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field861[5] & 0xFF) + ((field861[3] & 0xFF) << 16) + ((field861[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field862.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field862.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field861[0] = (byte) (arg4 >> 16);
            field861[1] = (byte) (arg4 >> 8);
            field861[2] = (byte) arg4;
            field861[3] = (byte) (var8 >> 16);
            field861[4] = (byte) (var8 >> 8);
            field861[5] = (byte) var8;
            this.method294(this.field863, (byte) -38, arg2 * 6);
            this.field863.write(field861, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg4) {
                int var11 = 0;
                if (arg1) {
                    this.method294(this.field862, (byte) -38, var8 * 520);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field862.read(field861, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label110: {
                            int var14 = ((field861[0] & 0xFF) << 8) + (field861[1] & 0xFF);
                            int var15 = ((field861[2] & 0xFF) << 8) + (field861[3] & 0xFF);
                            var11 = (field861[6] & 0xFF) + ((field861[4] & 0xFF) << 16) + ((field861[5] & 0xFF) << 8);
                            int var16 = field861[7] & 0xFF;
                            if (arg2 == var14 && var10 == var15 && this.field864 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field862.length() / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var11 == 0) {
                    arg1 = false;
                    var11 = (int) ((this.field862.length() + 519L) / 520L);
                    if (var11 == 0) {
                        var11++;
                    }
                    if (var8 == var11) {
                        var11++;
                    }
                }
                if (arg4 - var9 <= 512) {
                    var11 = 0;
                }
                field861[0] = (byte) (arg2 >> 8);
                field861[1] = (byte) arg2;
                field861[2] = (byte) (var10 >> 8);
                field861[3] = (byte) var10;
                field861[4] = (byte) (var11 >> 16);
                field861[5] = (byte) (var11 >> 8);
                field861[6] = (byte) var11;
                field861[7] = (byte) this.field864;
                this.method294(this.field862, (byte) -38, var8 * 520);
                this.field862.write(field861, 0, 8);
                int var17 = arg4 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field862.write(arg3, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Ljava/io/RandomAccessFile;BI)V")
    public synchronized void method294(RandomAccessFile arg0, byte arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg2 > 62914560) {
            System.out.println("Badseek - pos:" + arg2 + " len:" + arg0.length());
            arg2 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg0.seek((long) arg2);
        if (arg1 == -38) {
            ;
        }
    }
}
