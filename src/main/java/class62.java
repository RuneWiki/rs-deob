import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WSLQJCTU")
public class class62 {

    @OriginalMember(owner = "client!WSLQJCTU", name = "a", descriptor = "Z")
    private boolean field1598 = true;

    @OriginalMember(owner = "client!WSLQJCTU", name = "b", descriptor = "I")
    private int field1599 = -27531;

    @OriginalMember(owner = "client!WSLQJCTU", name = "c", descriptor = "Z")
    private boolean field1600 = false;

    @OriginalMember(owner = "client!WSLQJCTU", name = "h", descriptor = "I")
    public int field1605 = 65000;

    @OriginalMember(owner = "client!WSLQJCTU", name = "g", descriptor = "I")
    public int field1604;

    @OriginalMember(owner = "client!WSLQJCTU", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1602;

    @OriginalMember(owner = "client!WSLQJCTU", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1603;

    @OriginalMember(owner = "client!WSLQJCTU", name = "d", descriptor = "[B")
    public static byte[] field1601 = new byte[520];

    @OriginalMember(owner = "client!WSLQJCTU", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;IZLjava/io/RandomAccessFile;)V")
    public class62(int arg0, RandomAccessFile arg1, int arg2, boolean arg3, RandomAccessFile arg4) {
        this.field1604 = arg2;
        if (arg3) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field1602 = arg4;
        this.field1603 = arg1;
        this.field1605 = arg0;
    }

    @OriginalMember(owner = "client!WSLQJCTU", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method548(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field1600 = !this.field1600;
        }
        try {
            this.method551(this.field1603, arg0 * 6, 100);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field1603.read(field1601, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field1601[2] & 0xFF) + ((field1601[0] & 0xFF) << 16) + ((field1601[1] & 0xFF) << 8);
            int var6 = (field1601[5] & 0xFF) + ((field1601[3] & 0xFF) << 16) + ((field1601[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field1605) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field1602.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method551(this.field1602, var6 * 520, 100);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field1602.read(field1601, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field1601[0] & 0xFF) << 8) + (field1601[1] & 0xFF);
                    int var14 = ((field1601[2] & 0xFF) << 8) + (field1601[3] & 0xFF);
                    int var15 = (field1601[6] & 0xFF) + ((field1601[4] & 0xFF) << 16) + ((field1601[5] & 0xFF) << 8);
                    int var16 = field1601[7] & 0xFF;
                    if (arg0 == var13 && var9 == var14 && this.field1604 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field1602.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field1601[var17 + 8];
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

    @OriginalMember(owner = "client!WSLQJCTU", name = "a", descriptor = "([BIII)Z")
    public synchronized boolean method549(byte[] arg0, int arg1, int arg2, int arg3) {
        if (this.field1599 != arg1) {
            throw new NullPointerException();
        }
        boolean var5 = this.method550(true, arg0, true, arg2, arg3);
        if (!var5) {
            var5 = this.method550(true, arg0, false, arg2, arg3);
        }
        return var5;
    }

    @OriginalMember(owner = "client!WSLQJCTU", name = "a", descriptor = "(Z[BZII)Z")
    private synchronized boolean method550(boolean arg0, byte[] arg1, boolean arg2, int arg3, int arg4) {
        if (!arg0) {
            throw new NullPointerException();
        }
        try {
            int var8;
            if (arg2) {
                this.method551(this.field1603, arg3 * 6, 100);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field1603.read(field1601, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field1601[5] & 0xFF) + ((field1601[3] & 0xFF) << 16) + ((field1601[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field1602.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field1602.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field1601[0] = (byte) (arg4 >> 16);
            field1601[1] = (byte) (arg4 >> 8);
            field1601[2] = (byte) arg4;
            field1601[3] = (byte) (var8 >> 16);
            field1601[4] = (byte) (var8 >> 8);
            field1601[5] = (byte) var8;
            this.method551(this.field1603, arg3 * 6, 100);
            this.field1603.write(field1601, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg4) {
                int var11 = 0;
                if (arg2) {
                    this.method551(this.field1602, var8 * 520, 100);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field1602.read(field1601, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label110: {
                            int var14 = ((field1601[0] & 0xFF) << 8) + (field1601[1] & 0xFF);
                            int var15 = ((field1601[2] & 0xFF) << 8) + (field1601[3] & 0xFF);
                            var11 = (field1601[6] & 0xFF) + ((field1601[4] & 0xFF) << 16) + ((field1601[5] & 0xFF) << 8);
                            int var16 = field1601[7] & 0xFF;
                            if (arg3 == var14 && var10 == var15 && this.field1604 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field1602.length() / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var11 == 0) {
                    arg2 = false;
                    var11 = (int) ((this.field1602.length() + 519L) / 520L);
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
                field1601[0] = (byte) (arg3 >> 8);
                field1601[1] = (byte) arg3;
                field1601[2] = (byte) (var10 >> 8);
                field1601[3] = (byte) var10;
                field1601[4] = (byte) (var11 >> 16);
                field1601[5] = (byte) (var11 >> 8);
                field1601[6] = (byte) var11;
                field1601[7] = (byte) this.field1604;
                this.method551(this.field1602, var8 * 520, 100);
                this.field1602.write(field1601, 0, 8);
                int var17 = arg4 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field1602.write(arg1, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "client!WSLQJCTU", name = "a", descriptor = "(Ljava/io/RandomAccessFile;II)V")
    public synchronized void method551(RandomAccessFile arg0, int arg1, int arg2) throws IOException {
        if (arg1 < 0 || arg1 > 62914560) {
            System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
            arg1 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var5) {
            }
        }
        arg0.seek((long) arg1);
        int var4 = 19 / arg2;
    }
}
