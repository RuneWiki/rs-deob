import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class400 {

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "Luo;")
    public class397 field5781 = new class397();

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "Z")
    public boolean field5789 = false;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field5788 = 0;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Lil;")
    public static class274 field5777 = new class274(9, 3);

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field5782;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field5784;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public static int field5785;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public int field5786;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public int field5787;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "Z")
    public static boolean field5790;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "[I")
    public static int[] field5779;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)V")
    public static final void method2498(int arg0, int arg1) {
        field5778++;
        class2.method22(arg1);
        int var2 = class265.method1824(16, arg0).field132;
        if (var2 == 0) {
            return;
        }
        int var3 = class31.field426[arg0];
        if (arg1 == var2) {
            class24.field332 = var3;
        }
        if (var2 == 6) {
            class161.field2149 = var3;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lfp;Lje;IIIII)V")
    public static final void method2499(class9 arg0, class309 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class204.field2870 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class329.field4899) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class380.field5590 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class369 var15 = class178.field2530[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class215.field3069[var12].method1429(var13, var14) + class215.field3069[var12].method1429(var13 + 1, var14) + class215.field3069[var12].method1429(var13, var14 + 1) + class215.field3069[var12].method1429(var13 + 1, var14 + 1)) / 4 - (class215.field3069[arg2].method1429(arg3, arg4) + class215.field3069[arg2].method1429(arg3 + 1, arg4) + class215.field3069[arg2].method1429(arg3, arg4 + 1) + class215.field3069[arg2].method1429(arg3 + 1, arg4 + 1)) / 4;
                                    class422 var17 = var15.field5335;
                                    class422 var18 = var15.field5332;
                                    if (var17 != null && var17.method34((byte) 50)) {
                                        arg1.method32(arg0, var17, var7, var16, (var13 - arg3) * class100.field1271 + (1 - arg5) * class135.field1852, -90, (var14 - arg4) * class100.field1271 + (1 - arg6) * class135.field1852);
                                    }
                                    if (var18 != null && var18.method34((byte) 94)) {
                                        arg1.method32(arg0, var18, var7, var16, (var13 - arg3) * class100.field1271 + (1 - arg5) * class135.field1852, -55, (var14 - arg4) * class100.field1271 + (1 - arg6) * class135.field1852);
                                    }
                                    for (class206 var19 = var15.field5345; var19 != null; var19 = var19.field2882) {
                                        class336 var20 = var19.field2880;
                                        if (var20 != null && var20.method34((byte) 71) && (var20.field4961 == var13 || var8 == var13) && (var20.field4959 == var14 || var10 == var14)) {
                                            int var21 = var20.field4957 + 1 - var20.field4961;
                                            int var22 = var20.field4950 + 1 - var20.field4959;
                                            arg1.method32(arg0, var20, var7, var16, (var20.field4961 - arg3) * class100.field1271 + (var21 - arg5) * class135.field1852, -61, (var20.field4959 - arg4) * class100.field1271 + (var22 - arg6) * class135.field1852);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static final void method2500(int arg0) {
        field5784++;
        class86.method585(0);
        class388.field5677 = null;
        class271.field4017 = null;
        if (arg0 > -18) {
            method2502(57, 82, -1);
        }
        class202.field2846 = null;
        class432.field6296 = null;
        class332.field4933 = null;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V")
    public static final void method2501(int arg0) {
        class363 var1 = class303.field4440;
        synchronized (class303.field4440) {
            class303.field4440.method2307(-98);
        }
        field5780++;
        class363 var2 = class9.field123;
        synchronized (class9.field123) {
            if (arg0 != 5219) {
                field5779 = null;
            }
            class9.field123.method2307(-114);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)V")
    public static final void method2502(int arg0, int arg1, int arg2) {
        class4.field68 = arg2 - class66.field860;
        field5782++;
        class71.field929 = arg1 - class66.field870;
        if (arg0 >= -91) {
            method2500(-26);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIII)V")
    public static final void method2503(int arg0, int arg1, int arg2, int arg3) {
        field5785++;
        class125 var4 = class56.method428(arg0, 11, -3636);
        var4.method846(26848);
        var4.field1654 = arg3;
        var4.field1657 = arg2;
        if (arg1 != -1) {
            method2504((byte) -99);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public static void method2504(byte arg0) {
        field5777 = null;
        field5779 = null;
        if (arg0 != 127) {
            field5779 = null;
        }
    }
}
