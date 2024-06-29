import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YSPVLGYE")
public class class65 {

    @OriginalMember(owner = "client!YSPVLGYE", name = "a", descriptor = "Z")
    private boolean field1555 = false;

    @OriginalMember(owner = "client!YSPVLGYE", name = "f", descriptor = "I")
    public int field1560 = 65000;

    @OriginalMember(owner = "client!YSPVLGYE", name = "e", descriptor = "I")
    public int field1559;

    @OriginalMember(owner = "client!YSPVLGYE", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1557;

    @OriginalMember(owner = "client!YSPVLGYE", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1558;

    @OriginalMember(owner = "client!YSPVLGYE", name = "b", descriptor = "[B")
    public static byte[] field1556 = new byte[520];

    @OriginalMember(owner = "client!YSPVLGYE", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;ILjava/io/RandomAccessFile;I)V")
    public class65(int arg0, RandomAccessFile arg1, int arg2, RandomAccessFile arg3, int arg4) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        this.field1559 = arg4;
        this.field1557 = arg1;
        this.field1558 = arg3;
        this.field1560 = arg2;
    }

    @OriginalMember(owner = "client!YSPVLGYE", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method500(int arg0, int arg1) {
        if (arg0 != 1016) {
            throw new NullPointerException();
        }
        try {
            this.method503(arg1 * 6, this.field1558, true);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field1558.read(field1556, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field1556[2] & 0xFF) + ((field1556[0] & 0xFF) << 16) + ((field1556[1] & 0xFF) << 8);
            int var6 = (field1556[5] & 0xFF) + ((field1556[3] & 0xFF) << 16) + ((field1556[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field1560) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field1557.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method503(var6 * 520, this.field1557, true);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field1557.read(field1556, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field1556[0] & 0xFF) << 8) + (field1556[1] & 0xFF);
                    int var14 = ((field1556[2] & 0xFF) << 8) + (field1556[3] & 0xFF);
                    int var15 = (field1556[6] & 0xFF) + ((field1556[4] & 0xFF) << 16) + ((field1556[5] & 0xFF) << 8);
                    int var16 = field1556[7] & 0xFF;
                    if (arg1 == var13 && var9 == var14 && this.field1559 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field1557.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field1556[var17 + 8];
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

    @OriginalMember(owner = "client!YSPVLGYE", name = "a", descriptor = "([BIII)Z")
    public synchronized boolean method501(byte[] arg0, int arg1, int arg2, int arg3) {
        boolean var5 = this.method502(3, true, arg1, arg2, arg0);
        if (arg3 >= 0) {
            throw new NullPointerException();
        }
        if (!var5) {
            var5 = this.method502(3, false, arg1, arg2, arg0);
        }
        return var5;
    }

    @OriginalMember(owner = "client!YSPVLGYE", name = "a", descriptor = "(IZII[B)Z")
    private synchronized boolean method502(int arg0, boolean arg1, int arg2, int arg3, byte[] arg4) {
        if (arg0 != 3) {
            this.field1555 = !this.field1555;
        }
        try {
            int var8;
            if (arg1) {
                this.method503(arg3 * 6, this.field1558, true);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field1558.read(field1556, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field1556[5] & 0xFF) + ((field1556[3] & 0xFF) << 16) + ((field1556[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field1557.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field1557.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field1556[0] = (byte) (arg2 >> 16);
            field1556[1] = (byte) (arg2 >> 8);
            field1556[2] = (byte) arg2;
            field1556[3] = (byte) (var8 >> 16);
            field1556[4] = (byte) (var8 >> 8);
            field1556[5] = (byte) var8;
            this.method503(arg3 * 6, this.field1558, true);
            this.field1558.write(field1556, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg2) {
                int var11 = 0;
                if (arg1) {
                    this.method503(var8 * 520, this.field1557, true);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field1557.read(field1556, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label117: {
                            int var14 = ((field1556[0] & 0xFF) << 8) + (field1556[1] & 0xFF);
                            int var15 = ((field1556[2] & 0xFF) << 8) + (field1556[3] & 0xFF);
                            var11 = (field1556[6] & 0xFF) + ((field1556[4] & 0xFF) << 16) + ((field1556[5] & 0xFF) << 8);
                            int var16 = field1556[7] & 0xFF;
                            if (arg3 == var14 && var10 == var15 && this.field1559 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field1557.length() / 520L) {
                                    break label117;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var11 == 0) {
                    arg1 = false;
                    var11 = (int) ((this.field1557.length() + 519L) / 520L);
                    if (var11 == 0) {
                        var11++;
                    }
                    if (var8 == var11) {
                        var11++;
                    }
                }
                if (arg2 - var9 <= 512) {
                    var11 = 0;
                }
                field1556[0] = (byte) (arg3 >> 8);
                field1556[1] = (byte) arg3;
                field1556[2] = (byte) (var10 >> 8);
                field1556[3] = (byte) var10;
                field1556[4] = (byte) (var11 >> 16);
                field1556[5] = (byte) (var11 >> 8);
                field1556[6] = (byte) var11;
                field1556[7] = (byte) this.field1559;
                this.method503(var8 * 520, this.field1557, true);
                this.field1557.write(field1556, 0, 8);
                int var17 = arg2 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field1557.write(arg4, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "client!YSPVLGYE", name = "a", descriptor = "(ILjava/io/RandomAccessFile;Z)V")
    public synchronized void method503(int arg0, RandomAccessFile arg1, boolean arg2) throws IOException {
        if (arg0 < 0 || arg0 > 62914560) {
            System.out.println("Badseek - pos:" + arg0 + " len:" + arg1.length());
            arg0 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg1.seek((long) arg0);
        if (arg2) {
            ;
        }
    }
}
