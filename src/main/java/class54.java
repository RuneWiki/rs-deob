import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TPHBVXKD")
public class class54 {

    @OriginalMember(owner = "client!TPHBVXKD", name = "e", descriptor = "I")
    public int field1513 = 65000;

    @OriginalMember(owner = "client!TPHBVXKD", name = "d", descriptor = "I")
    public int field1512;

    @OriginalMember(owner = "client!TPHBVXKD", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1510;

    @OriginalMember(owner = "client!TPHBVXKD", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1511;

    @OriginalMember(owner = "client!TPHBVXKD", name = "a", descriptor = "[B")
    public static byte[] field1509 = new byte[520];

    @OriginalMember(owner = "client!TPHBVXKD", name = "<init>", descriptor = "(ZLjava/io/RandomAccessFile;IILjava/io/RandomAccessFile;)V")
    public class54(boolean arg0, RandomAccessFile arg1, int arg2, int arg3, RandomAccessFile arg4) {
        this.field1512 = arg3;
        this.field1510 = arg4;
        this.field1511 = arg1;
        this.field1513 = arg2;
        if (arg0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "client!TPHBVXKD", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method514(int arg0, int arg1) {
        if (arg0 < 7 || arg0 > 7) {
            throw new NullPointerException();
        }
        try {
            this.method517(false, this.field1511, arg1 * 6);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field1511.read(field1509, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field1509[2] & 0xFF) + ((field1509[0] & 0xFF) << 16) + ((field1509[1] & 0xFF) << 8);
            int var6 = (field1509[5] & 0xFF) + ((field1509[3] & 0xFF) << 16) + ((field1509[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field1513) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field1510.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method517(false, this.field1510, var6 * 520);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field1510.read(field1509, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field1509[0] & 0xFF) << 8) + (field1509[1] & 0xFF);
                    int var14 = ((field1509[2] & 0xFF) << 8) + (field1509[3] & 0xFF);
                    int var15 = (field1509[6] & 0xFF) + ((field1509[4] & 0xFF) << 16) + ((field1509[5] & 0xFF) << 8);
                    int var16 = field1509[7] & 0xFF;
                    if (arg1 == var13 && var9 == var14 && this.field1512 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field1510.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field1509[var17 + 8];
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

    @OriginalMember(owner = "client!TPHBVXKD", name = "a", descriptor = "(I[BIB)Z")
    public synchronized boolean method515(int arg0, byte[] arg1, int arg2, byte arg3) {
        boolean var5 = this.method516(45664, arg0, arg1, arg2, true);
        if (arg3 == 1) {
            boolean var6 = false;
        } else {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if (!var5) {
            var5 = this.method516(45664, arg0, arg1, arg2, false);
        }
        return var5;
    }

    @OriginalMember(owner = "client!TPHBVXKD", name = "a", descriptor = "(II[BIZ)Z")
    private synchronized boolean method516(int arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        if (arg0 != 45664) {
            throw new NullPointerException();
        }
        try {
            int var8;
            if (arg4) {
                this.method517(false, this.field1511, arg1 * 6);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field1511.read(field1509, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field1509[5] & 0xFF) + ((field1509[3] & 0xFF) << 16) + ((field1509[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field1510.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field1510.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field1509[0] = (byte) (arg3 >> 16);
            field1509[1] = (byte) (arg3 >> 8);
            field1509[2] = (byte) arg3;
            field1509[3] = (byte) (var8 >> 16);
            field1509[4] = (byte) (var8 >> 8);
            field1509[5] = (byte) var8;
            this.method517(false, this.field1511, arg1 * 6);
            this.field1511.write(field1509, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg3) {
                int var11 = 0;
                if (arg4) {
                    this.method517(false, this.field1510, var8 * 520);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field1510.read(field1509, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label110: {
                            int var14 = ((field1509[0] & 0xFF) << 8) + (field1509[1] & 0xFF);
                            int var15 = ((field1509[2] & 0xFF) << 8) + (field1509[3] & 0xFF);
                            var11 = (field1509[6] & 0xFF) + ((field1509[4] & 0xFF) << 16) + ((field1509[5] & 0xFF) << 8);
                            int var16 = field1509[7] & 0xFF;
                            if (arg1 == var14 && var10 == var15 && this.field1512 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field1510.length() / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var11 == 0) {
                    arg4 = false;
                    var11 = (int) ((this.field1510.length() + 519L) / 520L);
                    if (var11 == 0) {
                        var11++;
                    }
                    if (var8 == var11) {
                        var11++;
                    }
                }
                if (arg3 - var9 <= 512) {
                    var11 = 0;
                }
                field1509[0] = (byte) (arg1 >> 8);
                field1509[1] = (byte) arg1;
                field1509[2] = (byte) (var10 >> 8);
                field1509[3] = (byte) var10;
                field1509[4] = (byte) (var11 >> 16);
                field1509[5] = (byte) (var11 >> 8);
                field1509[6] = (byte) var11;
                field1509[7] = (byte) this.field1512;
                this.method517(false, this.field1510, var8 * 520);
                this.field1510.write(field1509, 0, 8);
                int var17 = arg3 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field1510.write(arg2, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "client!TPHBVXKD", name = "a", descriptor = "(ZLjava/io/RandomAccessFile;I)V")
    public synchronized void method517(boolean arg0, RandomAccessFile arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg2 > 62914560) {
            System.out.println("Badseek - pos:" + arg2 + " len:" + arg1.length());
            arg2 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg1.seek((long) arg2);
        if (!arg0) {
            ;
        }
    }
}
