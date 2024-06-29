import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public abstract class class417 {

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "Lir;")
    public static class19 field5927;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "Lnq;")
    public static class268 field5930;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILkh;)Lls;", line = 4)
    public static final class74 method2617(int arg0, class11 arg1) {
        int var2 = 42 / ((-arg0 - 29) / 36);
        field5931++;
        return new class74(arg1.method207(7124), arg1.method207(7124), arg1.method207(7124), arg1.method207(7124), arg1.method207(7124), arg1.method207(7124), arg1.method207(7124), arg1.method207(7124), arg1.method208(27308), arg1.method172((byte) 52));
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLij;[[IIZ[[BI[[B[[BILij;[[BLuo;)V", line = 24)
    public static final void method2618(byte arg0, class242 arg1, int[][] arg2, int arg3, boolean arg4, byte[][] arg5, int arg6, byte[][] arg7, byte[][] arg8, int arg9, class242 arg10, byte[][] arg11, class345 arg12) {
        field5928++;
        if (arg0 != -29) {
            method2617(80, (class11) null);
        }
        if (class326.field4462 == 0 && !class175.field2397) {
            class241.method1636(arg12, arg7, arg11, (byte) 3, arg10, arg9, arg4, arg2, arg3, arg6, arg8, arg1, arg5);
        } else {
            class279.method1824(arg3, (byte) 117, arg7, arg2, arg1, arg10, arg6, arg4, arg5, arg12, arg8, arg11, arg9);
        }
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V", line = 42)
    public static final void method2619(int arg0) {
        field5926++;
        class261.field3648.method644(false);
        for (class87 var1 = (class87) class121.field1699.method646(48); var1 != null; var1 = (class87) class121.field1699.method641(false)) {
            if (var1.field1217 < 1000) {
                var1.method2467((byte) -87);
                class261.field3648.method643(var1, -117);
            }
        }
        class261.field3648.method635(class121.field1699, 101);
        int var2 = -113 % ((19 - arg0) / 44);
        if (class432.field6109 != null || class395.field5654 > 0) {
            return;
        }
        int var3 = -1;
        if (class212.field2958 != null) {
            var3 = class212.field2958.method388(127);
        }
        if (!class271.field3762) {
            if (class420.field5952 >= 0) {
                var3 = class420.field5952;
            }
            class420.field5952 = -1;
            if (var3 == 0 && (class382.field5456 == 1 && class90.field1260 > 2 || class54.method448(-29170))) {
                var3 = 2;
            }
            if (var3 == 2 && class90.field1260 > 0) {
                if (class212.field2958 == null) {
                    class296.method1933((byte) -8, class361.field5001, class141.field2024);
                } else {
                    class296.method1933((byte) -8, class212.field2958.method383(6), class212.field2958.method384(3));
                }
            }
            if (var3 != 0 || class90.field1260 <= 0) {
                return;
            }
            class151.method1020(-3);
            return;
        }
        if (var3 == -1) {
            int var4 = class239.field3410.method1071((byte) -12);
            int var5 = class239.field3410.method1068((byte) -92);
            if (var4 < (class18.field330 - 10) || (class18.field330 + class151.field2135 + 10) < var4 || var5 < class211.field2952 - 10 || var5 > class432.field6101 + class211.field2952 + 10) {
                class271.field3762 = false;
                class285.method1861(class432.field6101, 28659, class211.field2952, class18.field330, class151.field2135);
            }
        }
        if (var3 != 0) {
            return;
        }
        int var6 = class18.field330;
        int var7 = class211.field2952;
        int var8 = class151.field2135;
        int var9 = class212.field2958.method384(3);
        int var10 = class212.field2958.method383(6);
        int var11 = -1;
        for (int var12 = 0; var12 < class90.field1260; var12++) {
            if (class173.field2367) {
                int var16 = (class90.field1260 - var12 - 1) * 16 + var7 + 33;
                if (var9 > var6 && var9 < (var6 + var8) && var16 - 13 < var10 && (var16 + 4) > var10) {
                    var11 = var12;
                }
            } else {
                int var17 = (class90.field1260 - var12 - 1) * 16 + var7 + 31;
                if (var9 > var6 && var6 + var8 > var9 && (var17 - 13) < var10 && var10 < var17 + 3) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class434 var14 = new class434(class121.field1699);
            for (class87 var15 = (class87) var14.method2730(-1); var15 != null; var15 = (class87) var14.method2727((byte) 93)) {
                if (var11 == var13) {
                    class19.method267(var15, 0);
                }
                var13++;
            }
        }
        class271.field3762 = false;
        class285.method1861(class432.field6101, 28659, class211.field2952, class18.field330, class151.field2135);
        return;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V", line = 193)
    public static void method2620(boolean arg0) {
        field5930 = null;
        if (arg0) {
            field5927 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lnq;BLnq;)V", line = 216)
    public static final void method2621(class268 arg0, byte arg1, class268 arg2) {
        field5925++;
        class366.field5160 = arg2;
        int var3 = -21 % ((arg1 - 63) / 55);
        class403.field5723 = arg0;
        class352.field4826 = class366.field5160.method1739(93, 3);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public abstract void method701(int arg0);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III[I)V")
    public abstract void method692(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public abstract void method704(int arg0);

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
    public abstract void method700(int arg0);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([I)V")
    public abstract void method703(int[] arg0);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "()V")
    public abstract void method693();

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V")
    public abstract void method695(int arg0);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V")
    public abstract void method696(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(III)V")
    public abstract void method702(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)V")
    public abstract void method698(int arg0);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIII)V")
    public abstract void method694(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lic;)V")
    public abstract void method699(class417 arg0);
}
