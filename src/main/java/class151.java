import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class151 {

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "[B")
    private byte[] field2838 = new byte[4];

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "Lud;")
    private class198 field2826;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    private int field2836;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "J")
    private long field2839;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "Lhh;")
    public static class163 field2829 = class137.method1065("Fertigkeit)2", 17);

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "[I")
    public static int[] field2831 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "Lhh;")
    private static class163 field2834 = class137.method1065("World", 17);

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "Lhh;")
    public static class163 field2825 = field2834;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    private int field2830;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
    private int field2840;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field2824;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "[B")
    private byte[] field2832;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "[[[B")
    public static byte[][][] field2828;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)Lrh;")
    public static final class242 method1121(int arg0) {
        field2833++;
        class242 var1 = new class242(class107.field2043, class2.field36, class65.field1107[0], class180.field3267[0], class256.field4478[0], class257.field4505[0], class223.field4070[arg0], class111.field2097);
        class67.method463(arg0 - 37);
        return var1;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIIIIIIZ)Z")
    public static final boolean method1122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var32 = 0; var32 < 104; var32++) {
                class140.field2668[var12][var32] = 0;
                class180.field3256[var12][var32] = 99999999;
            }
        }
        field2835++;
        class140.field2668[arg10][arg6] = 99;
        int var13 = arg6;
        class180.field3256[arg10][arg6] = 0;
        byte var14 = 0;
        int var15 = arg10;
        class197.field3552[var14] = arg10;
        int var16 = 95 % ((arg4 - 53) / 38);
        int var33 = var14 + 1;
        class96.field1816[var14] = arg6;
        boolean var17 = false;
        int var18 = 0;
        int[][] var19 = class140.field2670[class20.field323].field11;
        while (var33 != var18) {
            var13 = class96.field1816[var18];
            var15 = class197.field3552[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg0 == var15 && arg3 == var13) {
                var17 = true;
                break;
            }
            if (arg1 != 0) {
                if ((arg1 < 5 || arg1 == 10) && class140.field2670[class20.field323].method12(var15, arg0, arg3, 1, arg1 - 1, true, arg5, var13)) {
                    var17 = true;
                    break;
                }
                if (arg1 < 10 && class140.field2670[class20.field323].method10(arg3, arg1 - 1, var15, arg0, arg5, 1, var13, 0)) {
                    var17 = true;
                    break;
                }
            }
            if (arg9 != 0 && arg8 != 0 && class140.field2670[class20.field323].method1(arg9, var15, var13, arg8, 1, arg3, -127, arg7, arg0)) {
                var17 = true;
                break;
            }
            int var31 = class180.field3256[var15][var13] + 1;
            if (var15 > 0 && class140.field2668[var15 - 1][var13] == 0 && (var19[var15 - 1][var13] & 0x12C0108) == 0) {
                class197.field3552[var33] = var15 - 1;
                class96.field1816[var33] = var13;
                var33 = var33 + 1 & 0xFFF;
                class140.field2668[var15 - 1][var13] = 2;
                class180.field3256[var15 - 1][var13] = var31;
            }
            if (var15 < 103 && class140.field2668[var15 + 1][var13] == 0 && (var19[var15 + 1][var13] & 0x12C0180) == 0) {
                class197.field3552[var33] = var15 + 1;
                class96.field1816[var33] = var13;
                var33 = var33 + 1 & 0xFFF;
                class140.field2668[var15 + 1][var13] = 8;
                class180.field3256[var15 + 1][var13] = var31;
            }
            if (var13 > 0 && class140.field2668[var15][var13 - 1] == 0 && (var19[var15][var13 - 1] & 0x12C0102) == 0) {
                class197.field3552[var33] = var15;
                class96.field1816[var33] = var13 - 1;
                class140.field2668[var15][var13 - 1] = 1;
                class180.field3256[var15][var13 - 1] = var31;
                var33 = var33 + 1 & 0xFFF;
            }
            if (var13 < 103 && class140.field2668[var15][var13 + 1] == 0 && (var19[var15][var13 + 1] & 0x12C0120) == 0) {
                class197.field3552[var33] = var15;
                class96.field1816[var33] = var13 + 1;
                var33 = var33 + 1 & 0xFFF;
                class140.field2668[var15][var13 + 1] = 4;
                class180.field3256[var15][var13 + 1] = var31;
            }
            if (var15 > 0 && var13 > 0 && class140.field2668[var15 - 1][var13 - 1] == 0 && (var19[var15 - 1][var13 - 1] & 0x12C010E) == 0 && (var19[var15 - 1][var13] & 0x12C0108) == 0 && (var19[var15][var13 - 1] & 0x12C0102) == 0) {
                class197.field3552[var33] = var15 - 1;
                class96.field1816[var33] = var13 - 1;
                class140.field2668[var15 - 1][var13 - 1] = 3;
                class180.field3256[var15 - 1][var13 - 1] = var31;
                var33 = var33 + 1 & 0xFFF;
            }
            if (var15 < 103 && var13 > 0 && class140.field2668[var15 + 1][var13 - 1] == 0 && (var19[var15 + 1][var13 - 1] & 0x12C0183) == 0 && (var19[var15 + 1][var13] & 0x12C0180) == 0 && (var19[var15][var13 - 1] & 0x12C0102) == 0) {
                class197.field3552[var33] = var15 + 1;
                class96.field1816[var33] = var13 - 1;
                var33 = var33 + 1 & 0xFFF;
                class140.field2668[var15 + 1][var13 - 1] = 9;
                class180.field3256[var15 + 1][var13 - 1] = var31;
            }
            if (var15 > 0 && var13 < 103 && class140.field2668[var15 - 1][var13 + 1] == 0 && (var19[var15 - 1][var13 + 1] & 0x12C0138) == 0 && (var19[var15 - 1][var13] & 0x12C0108) == 0 && (var19[var15][var13 + 1] & 0x12C0120) == 0) {
                class197.field3552[var33] = var15 - 1;
                class96.field1816[var33] = var13 + 1;
                class140.field2668[var15 - 1][var13 + 1] = 6;
                var33 = var33 + 1 & 0xFFF;
                class180.field3256[var15 - 1][var13 + 1] = var31;
            }
            if (var15 < 103 && var13 < 103 && class140.field2668[var15 + 1][var13 + 1] == 0 && (var19[var15 + 1][var13 + 1] & 0x12C01E0) == 0 && (var19[var15 + 1][var13] & 0x12C0180) == 0 && (var19[var15][var13 + 1] & 0x12C0120) == 0) {
                class197.field3552[var33] = var15 + 1;
                class96.field1816[var33] = var13 + 1;
                var33 = var33 + 1 & 0xFFF;
                class140.field2668[var15 + 1][var13 + 1] = 12;
                class180.field3256[var15 + 1][var13 + 1] = var31;
            }
        }
        class260.field4551 = 0;
        if (!var17) {
            if (!arg11) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg0 - var22; var23 <= (arg0 + var22); var23++) {
                for (int var24 = arg3 - var22; var24 <= (arg3 + var22); var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class180.field3256[var23][var24] < 100) {
                        int var25 = 0;
                        if (var24 < arg3) {
                            var25 = arg3 - var24;
                        } else if (var24 > (arg8 + arg3 - 1)) {
                            var25 = var24 - (arg3 + arg8 - 1);
                        }
                        int var26 = 0;
                        if (var23 < arg0) {
                            var26 = arg0 - var23;
                        } else if ((arg9 + arg0 - 1) < var23) {
                            var26 = var23 + 1 - arg0 - arg9;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var20 || var20 == var27 && class180.field3256[var23][var24] < var21) {
                            var20 = var27;
                            var15 = var23;
                            var21 = class180.field3256[var23][var24];
                            var13 = var24;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg10 == var15 && arg6 == var13) {
                return false;
            }
            class260.field4551 = 1;
        }
        byte var28 = 0;
        class197.field3552[var28] = var15;
        int var34 = var28 + 1;
        class96.field1816[var28] = var13;
        int var29;
        int var30 = var29 = class140.field2668[var15][var13];
        while (arg10 != var15 || arg6 != var13) {
            if (var29 != var30) {
                var29 = var30;
                class197.field3552[var34] = var15;
                class96.field1816[var34++] = var13;
            }
            if ((var30 & 0x1) != 0) {
                var13++;
            } else if ((var30 & 0x4) != 0) {
                var13--;
            }
            if ((var30 & 0x2) != 0) {
                var15++;
            } else if ((var30 & 0x8) != 0) {
                var15--;
            }
            var30 = class140.field2668[var15][var13];
        }
        if (var34 > 0) {
            class248.method1703(var34, arg2, 3);
            return true;
        } else if (arg2 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
    public static void method1123(int arg0) {
        field2828 = null;
        field2834 = null;
        field2829 = null;
        field2831 = null;
        int var1 = 8 / ((arg0 - 72) / 47);
        field2825 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lta;III)V")
    public static final void method1124(class165 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class58.field948) {
            class144 var4 = class259.field4542[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field2736 != null && var4.field2736.field3828.method295()) {
                arg0.method306(var4.field2736.field3828, 128, 0, 0, true);
            }
        }
        if (arg3 < class58.field948) {
            class144 var5 = class259.field4542[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field2736 != null && var5.field2736.field3828.method295()) {
                arg0.method306(var5.field2736.field3828, 0, 0, 128, true);
            }
        }
        if (arg2 < class58.field948 && arg3 < class106.field2033) {
            class144 var6 = class259.field4542[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field2736 != null && var6.field2736.field3828.method295()) {
                arg0.method306(var6.field2736.field3828, 128, 0, 128, true);
            }
        }
        if (arg2 < class58.field948 && arg3 > 0) {
            class144 var7 = class259.field4542[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field2736 != null && var7.field2736.field3828.method295()) {
                arg0.method306(var7.field2736.field3828, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)[B")
    public final byte[] method1125(byte arg0) throws IOException {
        field2827++;
        if (arg0 != 23) {
            method1123(-74);
        }
        if (class7.method55(0) > this.field2839) {
            throw new IOException("fdt");
        }
        if (this.field2836 == 0) {
            if (this.field2826.field3566 == 2) {
                throw new IOException("fds");
            }
            if (this.field2826.field3566 == 1) {
                this.field2836 = 1;
                this.field2824 = (DataInputStream) this.field2826.field3563;
            }
        }
        if (this.field2836 == 1) {
            int var2 = this.field2824.available();
            if (var2 > 0) {
                if ((this.field2830 + var2) > 4) {
                    var2 = 4 - this.field2830;
                }
                this.field2830 += this.field2824.read(this.field2838, this.field2830, var2);
                if (this.field2830 == 4) {
                    int var3 = (new class81(this.field2838)).method620((byte) -82);
                    this.field2836 = 2;
                    this.field2832 = new byte[var3];
                }
            }
        }
        if (this.field2836 == 2) {
            int var4 = this.field2824.available();
            if (var4 > 0) {
                if (this.field2840 + var4 > this.field2832.length) {
                    var4 = this.field2832.length - this.field2840;
                }
                this.field2840 += this.field2824.read(this.field2832, this.field2840, var4);
                if (this.field2832.length == this.field2840) {
                    return this.field2832;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lpc;Ljava/net/URL;)V")
    public class151(class166 arg0, URL arg1) {
        this.field2826 = arg0.method1251(arg1, 4);
        this.field2836 = 0;
        this.field2839 = class7.method55(0) + 30000L;
    }
}
