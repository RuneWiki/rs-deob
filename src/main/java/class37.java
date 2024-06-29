import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class37 {

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "[B")
    private byte[] field853 = new byte[4];

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "Lfi;")
    private class65 field859;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    private int field857;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "J")
    private long field852;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "Lkh;")
    public static class117 field856 = null;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "[I")
    public static int[] field847 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field855 = 0;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "S")
    public static short field858 = 1;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "Lkh;")
    public static class117 field861 = class224.method1450((byte) -58, ":");

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    private int field846;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    private int field850;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Lkb;")
    public static class111 field848;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field854;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "[B")
    private byte[] field860;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIIIIIZII)Z")
    public static final boolean method327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
        field849++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class7.field108[var12][var31] = 0;
                class44.field965[var12][var31] = 99999999;
            }
        }
        class7.field108[arg2][arg6] = 99;
        class44.field965[arg2][arg6] = 0;
        int var13 = arg6;
        int var14 = arg2;
        byte var15 = 0;
        class24.field602[var15] = arg2;
        int var32 = var15 + 1;
        class240.field4336[var15] = arg6;
        if (arg4 != 1) {
            method327(77, 117, -69, -33, -116, -61, -109, 88, -90, false, 81, -84);
        }
        int var16 = 0;
        int[][] var17 = class173.field3123[class203.field3675].field45;
        boolean var18 = false;
        while (var32 != var16) {
            var14 = class24.field602[var16];
            var13 = class240.field4336[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg11 == var14 && arg0 == var13) {
                var18 = true;
                break;
            }
            if (arg7 != 0) {
                if ((arg7 < 5 || arg7 == 10) && class173.field3123[class203.field3675].method11(arg0, arg10, var13, arg7 - 1, var14, 1, (byte) 107, arg11)) {
                    var18 = true;
                    break;
                }
                if (arg7 < 10 && class173.field3123[class203.field3675].method27(-57, var14, 1, arg7 - 1, arg0, var13, arg10, arg11)) {
                    var18 = true;
                    break;
                }
            }
            if (arg1 != 0 && arg3 != 0 && class173.field3123[class203.field3675].method22(-66, arg3, 1, arg0, var13, arg11, arg8, arg1, var14)) {
                var18 = true;
                break;
            }
            int var30 = class44.field965[var14][var13] + 1;
            if (var14 > 0 && class7.field108[var14 - 1][var13] == 0 && (var17[var14 - 1][var13] & 0x12C0108) == 0) {
                class24.field602[var32] = var14 - 1;
                class240.field4336[var32] = var13;
                var32 = var32 + 1 & 0xFFF;
                class7.field108[var14 - 1][var13] = 2;
                class44.field965[var14 - 1][var13] = var30;
            }
            if (var14 < 103 && class7.field108[var14 + 1][var13] == 0 && (var17[var14 + 1][var13] & 0x12C0180) == 0) {
                class24.field602[var32] = var14 + 1;
                class240.field4336[var32] = var13;
                class7.field108[var14 + 1][var13] = 8;
                class44.field965[var14 + 1][var13] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 > 0 && class7.field108[var14][var13 - 1] == 0 && (var17[var14][var13 - 1] & 0x12C0102) == 0) {
                class24.field602[var32] = var14;
                class240.field4336[var32] = var13 - 1;
                var32 = var32 + 1 & 0xFFF;
                class7.field108[var14][var13 - 1] = 1;
                class44.field965[var14][var13 - 1] = var30;
            }
            if (var13 < 103 && class7.field108[var14][var13 + 1] == 0 && (var17[var14][var13 + 1] & 0x12C0120) == 0) {
                class24.field602[var32] = var14;
                class240.field4336[var32] = var13 + 1;
                class7.field108[var14][var13 + 1] = 4;
                class44.field965[var14][var13 + 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 > 0 && var13 > 0 && class7.field108[var14 - 1][var13 - 1] == 0 && (var17[var14 - 1][var13 - 1] & 0x12C010E) == 0 && (var17[var14 - 1][var13] & 0x12C0108) == 0 && (var17[var14][var13 - 1] & 0x12C0102) == 0) {
                class24.field602[var32] = var14 - 1;
                class240.field4336[var32] = var13 - 1;
                class7.field108[var14 - 1][var13 - 1] = 3;
                var32 = var32 + 1 & 0xFFF;
                class44.field965[var14 - 1][var13 - 1] = var30;
            }
            if (var14 < 103 && var13 > 0 && class7.field108[var14 + 1][var13 - 1] == 0 && (var17[var14 + 1][var13 - 1] & 0x12C0183) == 0 && (var17[var14 + 1][var13] & 0x12C0180) == 0 && (var17[var14][var13 - 1] & 0x12C0102) == 0) {
                class24.field602[var32] = var14 + 1;
                class240.field4336[var32] = var13 - 1;
                class7.field108[var14 + 1][var13 - 1] = 9;
                var32 = var32 + 1 & 0xFFF;
                class44.field965[var14 + 1][var13 - 1] = var30;
            }
            if (var14 > 0 && var13 < 103 && class7.field108[var14 - 1][var13 + 1] == 0 && (var17[var14 - 1][var13 + 1] & 0x12C0138) == 0 && (var17[var14 - 1][var13] & 0x12C0108) == 0 && (var17[var14][var13 + 1] & 0x12C0120) == 0) {
                class24.field602[var32] = var14 - 1;
                class240.field4336[var32] = var13 + 1;
                var32 = var32 + 1 & 0xFFF;
                class7.field108[var14 - 1][var13 + 1] = 6;
                class44.field965[var14 - 1][var13 + 1] = var30;
            }
            if (var14 < 103 && var13 < 103 && class7.field108[var14 + 1][var13 + 1] == 0 && (var17[var14 + 1][var13 + 1] & 0x12C01E0) == 0 && (var17[var14 + 1][var13] & 0x12C0180) == 0 && (var17[var14][var13 + 1] & 0x12C0120) == 0) {
                class24.field602[var32] = var14 + 1;
                class240.field4336[var32] = var13 + 1;
                var32 = var32 + 1 & 0xFFF;
                class7.field108[var14 + 1][var13 + 1] = 12;
                class44.field965[var14 + 1][var13 + 1] = var30;
            }
        }
        class216.field3931 = 0;
        if (!var18) {
            if (!arg9) {
                return false;
            }
            int var19 = 100;
            int var20 = 1000;
            byte var21 = 10;
            for (int var22 = arg11 - var21; var22 <= arg11 + var21; var22++) {
                for (int var23 = arg0 - var21; var23 <= arg0 + var21; var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class44.field965[var22][var23] < 100) {
                        int var24 = 0;
                        if (var22 < arg11) {
                            var24 = arg11 - var22;
                        } else if (arg1 + arg11 - 1 < var22) {
                            var24 = var22 + 1 - arg11 - arg1;
                        }
                        int var25 = 0;
                        if (var23 < arg0) {
                            var25 = arg0 - var23;
                        } else if (var23 > arg3 + arg0 - 1) {
                            var25 = var23 + 1 - arg0 - arg3;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var26 < var20 || var20 == var26 && class44.field965[var22][var23] < var19) {
                            var14 = var22;
                            var20 = var26;
                            var13 = var23;
                            var19 = class44.field965[var22][var23];
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg2 == var14 && arg6 == var13) {
                return false;
            }
            class216.field3931 = 1;
        }
        byte var27 = 0;
        class24.field602[var27] = var14;
        int var33 = var27 + 1;
        class240.field4336[var27] = var13;
        int var28;
        int var29 = var28 = class7.field108[var14][var13];
        while (arg2 != var14 || arg6 != var13) {
            if (var28 != var29) {
                class24.field602[var33] = var14;
                var28 = var29;
                class240.field4336[var33++] = var13;
            }
            if ((var29 & 0x2) != 0) {
                var14++;
            } else if ((var29 & 0x8) != 0) {
                var14--;
            }
            if ((var29 & 0x1) != 0) {
                var13++;
            } else if ((var29 & 0x4) != 0) {
                var13--;
            }
            var29 = class7.field108[var14][var13];
        }
        if (var33 > 0) {
            class103.method692(arg5, class240.field4336, 82, var33, class24.field602);
            return true;
        } else if (arg5 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILai;)V")
    public static final void method328(int arg0, class10 arg1) {
        if (arg0 <= -2) {
            field845++;
            class26.field662 = arg1;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static void method329(int arg0) {
        field848 = null;
        field861 = null;
        field847 = null;
        field856 = null;
        if (arg0 != -1) {
            field847 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lmc;Ljava/net/URL;)V")
    public class37(class134 arg0, URL arg1) {
        this.field859 = arg0.method897(0, arg1);
        this.field857 = 0;
        this.field852 = class4.method31((byte) 47) + 30000L;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)[B")
    public final byte[] method330(byte arg0) throws IOException {
        field851++;
        if (class4.method31((byte) 47) > this.field852) {
            throw new IOException("fdt");
        }
        if (this.field857 == 0) {
            if (this.field859.field1262 == 2) {
                throw new IOException("fds");
            }
            if (this.field859.field1262 == 1) {
                this.field857 = 1;
                this.field854 = (DataInputStream) this.field859.field1259;
            }
        }
        if (this.field857 == 1) {
            int var2 = this.field854.available();
            if (var2 > 0) {
                if (this.field850 + var2 > 4) {
                    var2 = 4 - this.field850;
                }
                this.field850 += this.field854.read(this.field853, this.field850, var2);
                if (this.field850 == 4) {
                    int var3 = (new class145(this.field853)).method1018(-1068451600);
                    this.field857 = 2;
                    this.field860 = new byte[var3];
                }
            }
        }
        int var4 = 105 / ((arg0 + 72) / 44);
        if (this.field857 == 2) {
            int var5 = this.field854.available();
            if (var5 > 0) {
                if (this.field846 + var5 > this.field860.length) {
                    var5 = this.field860.length - this.field846;
                }
                this.field846 += this.field854.read(this.field860, this.field846, var5);
                if (this.field860.length == this.field846) {
                    return this.field860;
                }
            }
        }
        return null;
    }
}
