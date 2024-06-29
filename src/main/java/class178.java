import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class178 implements class58 {

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "Lwa;")
    private class433 field2627 = new class433(128);

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "[I")
    private int[] field2617 = new int[class377.field5753.field3708];

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "[I")
    public int[] field2619 = new int[class377.field5753.field3708];

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "[C")
    public static char[] field2622 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field2616 = 1;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "[Lcu;")
    public static class145[] field2630;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 4)
    public final void method1208(int arg0) {
        field2631++;
        for (int var2 = 0; var2 < class377.field5753.field3708; var2++) {
            class407 var3 = class377.field5753.method1668(var2, (byte) 82);
            if (var3 != null && var3.field6135 == 0) {
                this.field2617[var2] = 0;
                this.field2619[var2] = 0;
            }
        }
        if (arg0 != -25783) {
            field2622 = null;
        }
        this.field2627 = new class433(128);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V", line = 33)
    public final void method1209(int arg0, int arg1, int arg2) {
        this.field2619[arg0] = arg1;
        field2624++;
        if (arg2 != 0) {
            this.field2627 = null;
        }
        class242 var4 = (class242) this.field2627.method2605(false, (long) arg0);
        if (var4 == null) {
            class242 var5 = new class242(class256.method1708((byte) 118) + 500L);
            this.field2627.method2606(var5, (long) arg0, 0);
        } else {
            var4.field3570 = class256.method1708((byte) 118) + 500L;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZII)V", line = 56)
    public final void method1210(boolean arg0, int arg1, int arg2) {
        field2626++;
        this.field2617[arg1] = arg2;
        class242 var4 = (class242) this.field2627.method2605(arg0, (long) arg1);
        if (var4 == null) {
            class242 var5 = new class242(4611686018427387905L);
            this.field2627.method2606(var5, (long) arg1, 0);
        } else if (var4.field3570 != 4611686018427387905L) {
            var4.field3570 = class256.method1708((byte) 118) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)I", line = 81)
    public final int method350(int arg0, byte arg1) {
        field2629++;
        return arg1 == -83 ? this.field2619[arg0] : -74;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I", line = 92)
    public final int method349(int arg0, int arg1) {
        field2615++;
        class76 var3 = class64.field961.method3035(arg1, -1);
        int var4 = var3.field1127;
        int var5 = var3.field1123;
        int var6 = var3.field1124;
        int var7 = 7 / ((-arg0 - 68) / 50);
        int var8 = class43.field653[var6 - var5];
        return this.field2619[var4] >> var5 & var8;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V", line = 112)
    public static void method1211(byte arg0) {
        field2622 = null;
        field2630 = null;
        if (arg0 >= -42) {
            method1212(null, -31, 66, null, -52, -16, 14, null, null, null, null, null, null, 121, (byte) 56, 63, 19, true);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lqa;IILia;III[[[B[I[I[I[I[IIBIIZ)V", line = 127)
    public static final void method1212(class162 arg0, int arg1, int arg2, class414 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class271.field3941 = arg0;
        class80.field1219 = arg1;
        class34.field354 = arg3;
        class420.field6326 = class271.field3941.method1056() > 0;
        class381.field5776 = arg4 >> class192.field2815;
        class346.field4983 = arg6 >> class192.field2815;
        class45.field722 = arg4;
        class170.field2527 = arg6;
        class445.field6630 = arg5;
        class14.field173 = class381.field5776 - class367.field5607;
        if (class14.field173 < 0) {
            class88.field1340 = -class14.field173;
            class14.field173 = 0;
        } else {
            class88.field1340 = 0;
        }
        class23.field237 = class346.field4983 - class367.field5607;
        if (class23.field237 < 0) {
            class211.field3085 = -class23.field237;
            class23.field237 = 0;
        } else {
            class211.field3085 = 0;
        }
        class147.field2175 = class381.field5776 + class367.field5607;
        if (class147.field2175 > class361.field5554) {
            class147.field2175 = class361.field5554;
        }
        class18.field193 = class367.field5607 + class346.field4983;
        if (class18.field193 > class484.field7096) {
            class18.field193 = class484.field7096;
        }
        for (int var18 = 0; var18 < class367.field5607 + class367.field5607 + 2; var18++) {
            for (int var23 = 0; var23 < class367.field5607 + class367.field5607 + 2; var23++) {
                int var24 = class381.field5776 + var18 - class367.field5607;
                int var25 = class346.field4983 + var23 - class367.field5607;
                if (var24 >= 0 && var25 >= 0 && var24 < class361.field5554 && var25 < class484.field7096) {
                    int var26 = var24 << class192.field2815;
                    int var27 = var25 << class192.field2815;
                    int var28 = class307.field4415[class307.field4415.length - 1].method201(var24, var25) - (0x3E8 << class192.field2815 - 7);
                    int var29 = class31.field335 == null ? class307.field4415[0].method201(var24, var25) + class352.field5398 : class31.field335[0].method201(var24, var25) + class352.field5398;
                    class467.field6892[var18][var23] = class271.field3941.method1105(var26, var28, var27, var26, var29, var27);
                } else {
                    class467.field6892[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class367.field5607 + class367.field5607 + 1; var19++) {
            for (int var22 = 0; var22 < class367.field5607 + class367.field5607 + 1; var22++) {
                class329.field4682[var19][var22] = class467.field6892[var19][var22] || class467.field6892[var19 + 1][var22] || class467.field6892[var19][var22 + 1] || class467.field6892[var19 + 1][var22 + 1];
            }
        }
        class342.field4923 = arg8;
        class43.field678 = arg9;
        class518.field7548 = arg10;
        class261.field3841 = arg11;
        class29.field304 = arg12;
        class225.method1533();
        class286.method1848(12586);
        for (class405 var20 = (class405) class118.field1784.method1873((byte) 106); var20 != null; var20 = (class405) class118.field1784.method1880(-61)) {
            var20.method2289((byte) -55);
            class421.method2537(var20, (byte) 57);
        }
        if (class420.field6326) {
            for (int var21 = 0; var21 < class44.field711; var21++) {
                class517.field7540[var21].method2519(2, arg17, arg1);
            }
        }
        if (arg2 > 1) {
            class271.field3941.method1100(0);
            if (class42.field640 == null || class42.field640 instanceof class143) {
                class42.field640 = new class176();
            }
        } else if (class42.field640 == null || class42.field640 instanceof class176) {
            class42.field640 = new class143();
        }
        class42.field640.method947(arg2, 2);
        class42.field640.method949(38);
        if (class508.field7423 != null) {
            class158.method1008(true);
            class42.field640.method950(22, (byte) 41);
            class374.method2295(arg2, null, 0, (byte) 0, arg15, arg16);
            class42.field640.method949(38);
            class42.field640.method950(23, (byte) 41);
            class158.method1008(false);
        }
        class374.method2295(arg2, arg7, arg13, arg14, arg15, arg16);
        class42.field640.method949(38);
        class42.field640.method945((byte) -14);
        class42.field640.method949(38);
        if (arg2 > 1) {
            class271.field3941.method1103(0);
        }
        class271.field3941.method1068(0, null);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B[BIIIII)Z", line = 282)
    public static final boolean method1213(byte arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2620++;
        int var7 = arg3 % arg6;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg6 - var7;
        }
        int var9 = -((arg2 + arg6 - 1) / arg6);
        if (arg0 <= 85) {
            field2630 = null;
        }
        int var10 = -((arg3 + arg6 - 1) / arg6);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg1[arg5] == 0) {
                    return true;
                }
                arg5 += arg6;
            }
            int var13 = arg5 - var8;
            if (arg1[var13 - 1] == 0) {
                return true;
            }
            arg5 = arg4 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(III)V", line = 335)
    public final void method1214(int arg0, int arg1, int arg2) {
        field2623++;
        class76 var4 = class64.field961.method3035(arg2, arg0);
        int var5 = var4.field1127;
        int var6 = var4.field1123;
        int var7 = var4.field1124;
        int var8 = class43.field653[var7 - var6];
        if (arg1 < 0 || arg1 > var8) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method1210(false, var5, ~var9 & this.field2617[var5] | arg1 << var6 & var9);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIZI)V", line = 363)
    public static final void method1215(int arg0, int arg1, boolean arg2, int arg3) {
        int var4 = arg1 << 3;
        int var5 = arg3 << 3;
        int var6 = arg0 << 3;
        field2621++;
        if (class140.field2103 == 2) {
            class296.field4216 = var5;
            class18.field195 = var6;
            class259.field3812 = var4;
        }
        class24.field262 = var6;
        class382.field5792 = var4;
        class11.method75(-93);
        class264.field3869 = arg2;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ)I", line = 397)
    public final int method1216(int arg0, boolean arg1) {
        if (arg0 != 0) {
            method1218((byte) -92, -18, 104);
        }
        field2625++;
        long var3 = class256.method1708((byte) 118);
        for (class242 var5 = arg1 ? (class242) this.field2627.method2608(true) : (class242) this.field2627.method2603(49); var5 != null; var5 = (class242) this.field2627.method2603(93)) {
            if ((var5.field3570 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field3570 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field4736;
                    this.field2619[var6] = this.field2617[var6];
                    var5.method2049(arg0 - 63);
                    return var6;
                }
                var5.method2049(arg0 ^ 0xFFFFFF9B);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(III)V", line = 439)
    public final void method1217(int arg0, int arg1, int arg2) {
        field2628++;
        class76 var4 = class64.field961.method3035(arg1, arg2 - 1);
        int var5 = var4.field1127;
        int var6 = var4.field1123;
        int var7 = var4.field1124;
        int var8 = class43.field653[var7 - var6];
        if (arg0 < 0 || var8 < arg0) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method1209(var5, var9 & arg0 << var6 | ~var9 & this.field2619[var5], arg2);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BII)V", line = 467)
    public static final void method1218(byte arg0, int arg1, int arg2) {
        if (arg0 >= 26) {
            field2618++;
            class338 var3 = class230.method1580(12, -1332166328, arg2);
            var3.method2053(-110);
            var3.field4756 = arg1;
        }
    }
}
