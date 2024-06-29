import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class50 {

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field1011 = -2;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public static int field1015 = 500;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public static int field1016 = 0;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "Lsl;")
    public static class39 field1013 = new class39(16);

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "[I")
    public static int[] field1014;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIBI)V", line = 7)
    public static final void method376(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        for (class174 var5 = (class174) class233.field3643.method424(-88); var5 != null; var5 = (class174) class233.field3643.method425(-32547)) {
            class34.method276(arg2, arg1, var5, 7, arg0, arg4);
        }
        if (arg3 != 68) {
            field1014 = (int[]) null;
        }
        for (class174 var6 = (class174) class264.field4094.method424(-55); var6 != null; var6 = (class174) class264.field4094.method425(arg3 ^ 0xFFFF8099)) {
            byte var7 = 1;
            class322 var8 = var6.field2790.method698(94);
            if (var6.field2790.field1893 == var8.field4907) {
                var7 = 0;
            } else if (var6.field2790.field1893 == var8.field4936 || var6.field2790.field1893 == var8.field4918 || var6.field2790.field1893 == var8.field4902 || var6.field2790.field1893 == var8.field4928) {
                var7 = 2;
            } else if (var6.field2790.field1893 == var8.field4910 || var6.field2790.field1893 == var8.field4920 || var6.field2790.field1893 == var8.field4931 || var6.field2790.field1893 == var8.field4934) {
                var7 = 3;
            }
            if (var6.field2792 != var7) {
                int var9 = class324.method2246(-1, var6.field2790);
                if (var6.field2786 != var9) {
                    if (var6.field2789 != null) {
                        class11.field230.method1237(var6.field2789);
                        var6.field2789 = null;
                    }
                    var6.field2786 = var9;
                }
                var6.field2792 = var7;
            }
            var6.field2791 = var6.field2790.field1869;
            var6.field2787 = var6.field2790.field1869 + (var6.field2790.method710(arg3 - 69) * 64);
            var6.field2795 = var6.field2790.field1872;
            var6.field2798 = var6.field2790.field1872 + var6.field2790.method710(-1) * 64;
            class34.method276(arg2, arg1, var6, arg3 ^ 0x43, arg0, arg4);
        }
        field1012++;
        for (class174 var10 = (class174) class200.field3197.method306(arg3 - 68); var10 != null; var10 = (class174) class200.field3197.method300(arg3 - 67)) {
            byte var11 = 1;
            class322 var12 = var10.field2788.method698(arg3 - 172);
            if (var10.field2788.field1893 == var12.field4907) {
                var11 = 0;
            } else if (var10.field2788.field1893 == var12.field4936 || var10.field2788.field1893 == var12.field4918 || var10.field2788.field1893 == var12.field4902 || var10.field2788.field1893 == var12.field4928) {
                var11 = 2;
            } else if (var10.field2788.field1893 == var12.field4910 || var10.field2788.field1893 == var12.field4920 || var10.field2788.field1893 == var12.field4931 || var10.field2788.field1893 == var12.field4934) {
                var11 = 3;
            }
            if (var10.field2792 != var11) {
                int var13 = class188.method1199(var10.field2788, arg3 + 259336424);
                if (var10.field2786 != var13) {
                    if (var10.field2789 != null) {
                        class11.field230.method1237(var10.field2789);
                        var10.field2789 = null;
                    }
                    var10.field2786 = var13;
                }
                var10.field2792 = var11;
            }
            var10.field2791 = var10.field2788.field1869;
            var10.field2787 = var10.field2788.field1869 + var10.field2788.method710(arg3 ^ 0xFFFFFFBB) * 64;
            var10.field2795 = var10.field2788.field1872;
            var10.field2798 = var10.field2788.field1872 + var10.field2788.method710(-1) * 64;
            class34.method276(arg2, arg1, var10, 7, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)Ljava/lang/String;", line = 121)
    public static final String method377(int arg0, int arg1) {
        if (arg0 == -17414) {
            field1017++;
            return class296.field4515[arg1].length() > 0 ? class256.field3998[arg1] + class52.field1045 + class296.field4515[arg1] : class256.field3998[arg1];
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V", line = 139)
    public static void method378(int arg0) {
        field1013 = null;
        field1014 = null;
        if (arg0 != 21) {
            field1016 = 0;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLbm;)V", line = 152)
    public static final void method379(byte arg0, class307 arg1) {
        field1009++;
        class303.field4585 = class277.method1865(0, arg1, (byte) 55, class79.field1564);
        class221.field3507 = class6.method60(class302.field4574, arg1, 0, false);
        class71.field1497 = class6.method60(class99.field1750, arg1, 0, false);
        class61.field1177 = class6.method60(class331.field5093, arg1, 0, false);
        class324.field4950 = class6.method60(class165.field2659, arg1, 0, false);
        class158.field2593 = class6.method60(class25.field489, arg1, 0, false);
        class62.field1197 = class6.method60(class326.field4985, arg1, 0, false);
        class256.field4001 = class146.method951(0, class190.field3083, arg1, 32);
        class225.field3554 = class239.method1583(128, 0, arg1, class68.field1306);
        class266.field4112 = class239.method1583(128, 0, arg1, class2.field42);
        class283.field4385 = class104.method677(0, arg1, 2, class174.field2783);
        class344.field5343 = class104.method677(0, arg1, 2, class222.field3515);
        class71.field1494.method2125(class344.field5343, (int[]) null);
        class33.field674.method2125(class344.field5343, (int[]) null);
        class214.field3428.method2125(class344.field5343, (int[]) null);
        if (class249.field3893) {
            class60.field1167 = class99.method655(0, arg1, -201, class306.field4632);
            for (int var2 = 0; var2 < class60.field1167.length; var2++) {
                class60.field1167[var2].method731();
            }
        }
        int var3 = -101 % ((-arg0 - 19) / 58);
        class206 var4 = class125.method823((byte) 116, class336.field5168, 0, arg1);
        var4.method1399();
        if (class249.field3893) {
            class187.field3031 = new class137(var4);
        } else {
            class187.field3031 = var4;
        }
        class206[] var5 = class277.method1865(0, arg1, (byte) 118, class135.field2269);
        for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6].method1399();
        }
        if (class249.field3893) {
            class200.field3199 = new class283[var5.length];
            for (int var7 = 0; var7 < var5.length; var7++) {
                class200.field3199[var7] = new class137(var5[var7]);
            }
        } else {
            class200.field3199 = var5;
        }
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 21.0D) - 10;
        int var11 = (int) (Math.random() * 41.0D) - 20;
        for (int var12 = 0; var12 < class303.field4585.length; var12++) {
            class303.field4585[var12].method1384(var8 + var11, var9 + var11, var10 + var11);
        }
        if (class249.field3893) {
            class12.field240 = new class283[class303.field4585.length];
            for (int var13 = 0; var13 < class303.field4585.length; var13++) {
                class12.field240[var13] = new class137(class303.field4585[var13]);
            }
        } else {
            class12.field240 = class303.field4585;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIILsc;IJZ)Z", line = 256)
    public static final boolean method380(int arg0, int arg1, int arg2, int arg3, int arg4, class19 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class196.method1262(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }
}
