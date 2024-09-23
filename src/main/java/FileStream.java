import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("wb")
public class FileStream {

    @OriginalMember(owner = "wb", name = "b", descriptor = "I")
    private int field856 = 901;

    @OriginalMember(owner = "wb", name = "g", descriptor = "I")
    public int field861 = 65000;

    @OriginalMember(owner = "wb", name = "f", descriptor = "I")
    public int field860;

    @OriginalMember(owner = "wb", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field858;

    @OriginalMember(owner = "wb", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field859;

    @OriginalMember(owner = "wb", name = "c", descriptor = "[B")
    public static byte[] field857 = new byte[520];

    @OriginalMember(owner = "wb", name = "a", descriptor = "I")
    private int field855;

    @OriginalMember(owner = "wb", name = "<init>", descriptor = "(BLjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;II)V")
    public FileStream(byte arg0, RandomAccessFile arg1, RandomAccessFile arg2, int arg3, int arg4) {
        this.field860 = arg4;
        if (arg0 != 61) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field858 = arg1;
        this.field859 = arg2;
        this.field861 = arg3;
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method301(int arg0, int arg1) {
        int var3 = 83 / arg0;
        try {
            this.method304(arg1 * 6, (byte) 2, this.field859);
            int var5;
            for (int var4 = 0; var4 < 6; var4 += var5) {
                var5 = this.field859.read(field857, var4, 6 - var4);
                if (var5 == -1) {
                    return null;
                }
            }
            int var6 = (field857[2] & 0xFF) + ((field857[0] & 0xFF) << 16) + ((field857[1] & 0xFF) << 8);
            int var7 = (field857[5] & 0xFF) + ((field857[3] & 0xFF) << 16) + ((field857[4] & 0xFF) << 8);
            if (var6 < 0 || var6 > this.field861) {
                return null;
            } else if (var7 > 0 && (long) var7 <= this.field858.length() / 520L) {
                byte[] var8 = new byte[var6];
                int var9 = 0;
                int var10 = 0;
                while (var9 < var6) {
                    if (var7 == 0) {
                        return null;
                    }
                    this.method304(var7 * 520, (byte) 2, this.field858);
                    int var11 = 0;
                    int var12 = var6 - var9;
                    if (var12 > 512) {
                        var12 = 512;
                    }
                    while (var11 < var12 + 8) {
                        int var13 = this.field858.read(field857, var11, var12 + 8 - var11);
                        if (var13 == -1) {
                            return null;
                        }
                        var11 += var13;
                    }
                    int var14 = ((field857[0] & 0xFF) << 8) + (field857[1] & 0xFF);
                    int var15 = ((field857[2] & 0xFF) << 8) + (field857[3] & 0xFF);
                    int var16 = (field857[6] & 0xFF) + ((field857[4] & 0xFF) << 16) + ((field857[5] & 0xFF) << 8);
                    int var17 = field857[7] & 0xFF;
                    if (arg1 == var14 && var10 == var15 && this.field860 == var17) {
                        if (var16 >= 0 && (long) var16 <= this.field858.length() / 520L) {
                            for (int var18 = 0; var18 < var12; var18++) {
                                var8[var9++] = field857[var18 + 8];
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

    @OriginalMember(owner = "wb", name = "a", descriptor = "(I[BBI)Z")
    public synchronized boolean method302(int arg0, byte[] arg1, byte arg2, int arg3) {
        if (arg2 != 8) {
            throw new NullPointerException();
        }
        boolean var5 = false;
        boolean var6 = this.method303(true, arg1, 0, arg0, arg3);
        if (!var6) {
            var6 = this.method303(false, arg1, 0, arg0, arg3);
        }
        return var6;
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(Z[BIII)Z")
    private synchronized boolean method303(boolean arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 0) {
            this.field856 = -459;
        }
        try {
            int var8;
            if (arg0) {
                this.method304(arg3 * 6, (byte) 2, this.field859);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field859.read(field857, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field857[5] & 0xFF) + ((field857[3] & 0xFF) << 16) + ((field857[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field858.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field858.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field857[0] = (byte) (arg4 >> 16);
            field857[1] = (byte) (arg4 >> 8);
            field857[2] = (byte) arg4;
            field857[3] = (byte) (var8 >> 16);
            field857[4] = (byte) (var8 >> 8);
            field857[5] = (byte) var8;
            this.method304(arg3 * 6, (byte) 2, this.field859);
            this.field859.write(field857, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg4) {
                int var11 = 0;
                if (arg0) {
                    this.method304(var8 * 520, (byte) 2, this.field858);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field858.read(field857, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label110: {
                            int var14 = ((field857[0] & 0xFF) << 8) + (field857[1] & 0xFF);
                            int var15 = ((field857[2] & 0xFF) << 8) + (field857[3] & 0xFF);
                            var11 = (field857[6] & 0xFF) + ((field857[4] & 0xFF) << 16) + ((field857[5] & 0xFF) << 8);
                            int var16 = field857[7] & 0xFF;
                            if (arg3 == var14 && var10 == var15 && this.field860 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field858.length() / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var11 == 0) {
                    arg0 = false;
                    var11 = (int) ((this.field858.length() + 519L) / 520L);
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
                field857[0] = (byte) (arg3 >> 8);
                field857[1] = (byte) arg3;
                field857[2] = (byte) (var10 >> 8);
                field857[3] = (byte) var10;
                field857[4] = (byte) (var11 >> 16);
                field857[5] = (byte) (var11 >> 8);
                field857[6] = (byte) var11;
                field857[7] = (byte) this.field860;
                this.method304(var8 * 520, (byte) 2, this.field858);
                this.field858.write(field857, 0, 8);
                int var17 = arg4 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field858.write(arg1, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(IBLjava/io/RandomAccessFile;)V")
    public synchronized void method304(int arg0, byte arg1, RandomAccessFile arg2) throws IOException {
        if (arg0 < 0 || arg0 > 62914560) {
            System.out.println("Badseek - pos:" + arg0 + " len:" + arg2.length());
            arg0 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var5) {
            }
        }
        arg2.seek((long) arg0);
        if (arg1 == 2) {
            boolean var4 = false;
        } else {
            this.field855 = -331;
        }
    }
}
