import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class120 extends class171 {

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "I")
    private int field1786;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "I")
    private int field1789;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
    private int field1773;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
    private int field1781;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "I")
    private int field1788;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    private int field1775;

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "I")
    private int field1787;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    private int field1774;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public static int field1771 = 0;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1776 = null;

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "I")
    public static int field1784 = 0;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!jl", name = "E", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!jl", name = "G", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!jl", name = "J", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "Lqe;")
    public static class218 field1791;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "Lnm;")
    public static class221 field1772;

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "[I")
    public static int[] field1794;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "[Lfo;")
    public static class239[] field1778;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V", line = 8)
    public static final void method775(int arg0) {
        for (int var1 = 0; var1 < class28.field424; var1++) {
            int var10002 = class58.field877[var1]--;
            if (class58.field877[var1] >= -10) {
                class80 var2 = class249.field3961[var1];
                if (var2 == null) {
                    var2 = class80.method542(class99.field1433, class5.field71[var1], 0);
                    if (var2 == null) {
                        continue;
                    }
                    class58.field877[var1] += var2.method540();
                    class249.field3961[var1] = var2;
                }
                if (class58.field877[var1] < 0) {
                    int var9;
                    if (class34.field515[var1] == 0) {
                        var9 = class275.field4547[var1] * class182.field2824 >> 8;
                    } else {
                        int var3 = (class34.field515[var1] & 0xFF) * 128;
                        int var4 = (class34.field515[var1] & 0xFFFA88) >> 16;
                        int var5 = var4 * 128 + 64 - class329.field5388.field4796;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = class34.field515[var1] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - class329.field5388.field4783;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var7 + var5 - 128;
                        if (var8 > var3) {
                            class58.field877[var1] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = class275.field4547[var1] * class58.field878 * (var3 - var8) / var3 >> 8;
                    }
                    if (var9 > 0) {
                        class321 var10 = var2.method543().method2307(class131.field2012);
                        class237 var11 = class237.method1632(var10, 100, var9);
                        var11.method1640(class33.field513[var1] - 1);
                        class28.field434.method1414(var11);
                    }
                    class58.field877[var1] = -100;
                }
            } else {
                class28.field424--;
                for (int var12 = var1; var12 < class28.field424; var12++) {
                    class5.field71[var12] = class5.field71[var12 + 1];
                    class249.field3961[var12] = class249.field3961[var12 + 1];
                    class33.field513[var12] = class33.field513[var12 + 1];
                    class58.field877[var12] = class58.field877[var12 + 1];
                    class34.field515[var12] = class34.field515[var12 + 1];
                    class275.field4547[var12] = class275.field4547[var12 + 1];
                }
                var1--;
            }
        }
        if (arg0 != -30854) {
            method777(false);
        }
        field1795++;
        if (class310.field5053 && !class246.method1752(0)) {
            if (class315.field5201 != 0 && class214.field3279 != -1) {
                class50.method373(false, 0, false, class310.field5042, class315.field5201, class214.field3279);
            }
            class310.field5053 = false;
        } else if (class315.field5201 != 0 && class214.field3279 != -1 && !class246.method1752(arg0 + 30854)) {
            class229.field3599++;
            class195.field2992.method250(21066, 55);
            class195.field2992.method2222(class214.field3279, 255);
            class214.field3279 = -1;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLnm;)V", line = 145)
    public static final void method776(byte arg0, class221 arg1) {
        class195.field2990 = class256.method1821(arg1, 0, class110.field1632, (byte) 112);
        field1783++;
        class105.field1521 = class256.method1821(arg1, 0, class51.field760, (byte) 84);
        class171.field2664 = class256.method1821(arg1, 0, class291.field4834, (byte) 121);
        class104.field1509 = class256.method1821(arg1, 0, class9.field109, (byte) 98);
        class243.field3837 = class256.method1821(arg1, 0, class289.field4801, (byte) 112);
        class221.field3427 = class256.method1821(arg1, 0, class81.field1186, (byte) 114);
        class75.field1133 = class45.method342(arg0 + 69, arg1, class99.field1443, 0);
        class41.field626 = class287.method2029(true, class283.field4652, 0, arg1);
        class153.field2479 = class287.method2029(true, class233.field3710, 0, arg1);
        class242.field3812 = class24.method211(class146.field2360, 0, arg1, -125);
        if (arg0 != -70) {
            method775(-14);
        }
        class13.field175 = class24.method211(class117.field1709, 0, arg1, arg0 ^ 0x35);
        class302.field4967.method1219(class13.field175, (int[]) null);
        class287.field4740.method1219(class13.field175, (int[]) null);
        class31.field471.method1219(class13.field175, (int[]) null);
        if (class245.field3886) {
            class149.field2402 = class142.method1007(class355.field5626, 0, (byte) 24, arg1);
            for (int var2 = 0; var2 < class149.field2402.length; var2++) {
                class149.field2402[var2].method1681();
            }
        }
        class137 var3 = class307.method2143(0, class198.field3047, (byte) 44, arg1);
        var3.method948();
        if (class245.field3886) {
            class139.field2184 = new class232(var3);
        } else {
            class139.field2184 = var3;
        }
        class137[] var4 = class122.method793(arg1, class177.field2774, 0, (byte) 114);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method948();
        }
        if (class245.field3886) {
            class292.field4844 = new class289[var4.length];
            for (int var6 = 0; var6 < var4.length; var6++) {
                class292.field4844[var6] = new class232(var4[var6]);
            }
        } else {
            class292.field4844 = var4;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)V", line = 213)
    public static void method777(boolean arg0) {
        field1778 = null;
        field1791 = null;
        field1772 = null;
        field1794 = null;
        if (arg0) {
            field1776 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIB)V", line = 228)
    public final void method242(int arg0, int arg1, byte arg2) {
        if (arg2 >= -105) {
            this.field1774 = -104;
        }
        field1785++;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IBI)V", line = 242)
    public final void method244(int arg0, byte arg1, int arg2) {
        if (arg1 > 93) {
            field1780++;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 255)
    public static final String method778(String arg0, byte arg1) {
        if (arg1 != -120) {
            method777(false);
        }
        field1792++;
        String var2 = class322.method2314(class265.method1872(arg0, 58), true);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLjava/lang/String;)[B", line = 271)
    public static final byte[] method779(byte arg0, String arg1) {
        field1790++;
        if (arg0 != -98) {
            return (byte[]) null;
        }
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)Lbm;", line = 422)
    public static final class49 method780(int arg0, int arg1) {
        field1782++;
        class49 var2 = (class49) class141.field2271.method652((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class216.field3334.method1504(arg1, true, arg0);
        class49 var4 = new class49();
        if (var3 != null) {
            var4.method369(new class313(var3), arg0 + 20752);
        }
        class141.field2271.method642(var4, (long) arg1, arg0 ^ 0xFFFFFFA1);
        return var4;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 442)
    public class120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field1786 = arg3;
        this.field1789 = arg6;
        this.field1773 = arg7;
        this.field1781 = arg1;
        this.field1788 = arg0;
        this.field1775 = arg2;
        this.field1787 = arg4;
        this.field1774 = arg5;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZI)V", line = 462)
    public final void method236(int arg0, boolean arg1, int arg2) {
        int var4 = this.field1788 * arg0 >> 12;
        int var5 = this.field1781 * arg2 >> 12;
        field1793++;
        int var6 = this.field1786 * arg2 >> 12;
        int var7 = this.field1787 * arg0 >> 12;
        int var8 = this.field1774 * arg2 >> 12;
        if (!arg1) {
            this.field1775 = -87;
        }
        int var9 = this.field1773 * arg2 >> 12;
        int var10 = this.field1789 * arg0 >> 12;
        int var11 = this.field1775 * arg0 >> 12;
        class91.method600(this.field2672, var6, var10, var9, var7, 20954, var4, var11, var5, var8);
    }
}
