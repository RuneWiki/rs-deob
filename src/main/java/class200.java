import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class200 extends class1 {

    @OriginalMember(owner = "client!tb", name = "gb", descriptor = "I")
    public static int field3534 = 0;

    @OriginalMember(owner = "client!tb", name = "ib", descriptor = "I")
    public static int field3536 = 0;

    @OriginalMember(owner = "client!tb", name = "hb", descriptor = "Z")
    public static volatile boolean field3535 = true;

    @OriginalMember(owner = "client!tb", name = "nb", descriptor = "I")
    public static int field3541 = 0;

    @OriginalMember(owner = "client!tb", name = "lb", descriptor = "[S")
    public static short[] field3539 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!tb", name = "jb", descriptor = "Loc;")
    private static class151 field3537 = class137.method873(2, "Login limit exceeded)3");

    @OriginalMember(owner = "client!tb", name = "rb", descriptor = "Loc;")
    public static class151 field3545 = class137.method873(2, "Hier wechseln");

    @OriginalMember(owner = "client!tb", name = "qb", descriptor = "Loc;")
    public static class151 field3544 = class137.method873(2, "Abbrechen");

    @OriginalMember(owner = "client!tb", name = "tb", descriptor = "Loc;")
    public static class151 field3547 = field3537;

    @OriginalMember(owner = "client!tb", name = "kb", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!tb", name = "ob", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!tb", name = "sb", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!tb", name = "mb", descriptor = "Lnd;")
    public static class142 field3540;

    @OriginalMember(owner = "client!tb", name = "pb", descriptor = "Lsd;")
    public static class192 field3543;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(Z)V")
    public static void method1250(boolean arg0) {
        field3545 = null;
        field3543 = null;
        field3539 = null;
        field3547 = null;
        if (arg0) {
            field3534 = -67;
        }
        field3540 = null;
        field3544 = null;
        field3537 = null;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    public class200() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lwg;IIIII)V")
    public static final void method1251(class235 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; ++var11) {
            if (class116.field2100 != var11) {
                for (int var12 = var7; var12 <= var8; ++var12) {
                    if (var12 >= 0 && var12 < class228.field4032) {
                        for (int var13 = var9; var13 <= var10; ++var13) {
                            if (var13 >= 0 && var13 < class225.field3924 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class72 var14 = class95.field1776[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class233.field4286[var11][var12 + 1][var13] + class233.field4286[var11][var12][var13] + class233.field4286[var11][var12][var13 + 1] + class233.field4286[var11][var12 + 1][var13 + 1]) / 4 - (class233.field4286[arg1][arg2 + 1][arg3] + class233.field4286[arg1][arg2][arg3] + class233.field4286[arg1][arg2][arg3 + 1] + class233.field4286[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class23 var16 = var14.field1412;
                                    if (var16 != null) {
                                        if (var16.field518.method75()) {
                                            arg0.method77(var16.field518, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field517 != null && var16.field517.method75()) {
                                            arg0.method77(var16.field517, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field1397; ++var17) {
                                        class124 var18 = var14.field1405[var17];
                                        if (var18 != null && var18.field2220.method75() && (var18.field2224 == var12 || var7 == var12) && (var18.field2214 == var13 || var9 == var13)) {
                                            int var19 = var18.field2218 - var18.field2224 + 1;
                                            int var20 = var18.field2225 - var18.field2214 + 1;
                                            arg0.method77(var18.field2220, (var18.field2224 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field2214 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                --var7;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[B)V")
    public static final void method1252(int arg0, byte[] arg1) {
        ++field3538;
        class229 var2 = new class229(arg1);
        int var3 = var2.method1490((byte) 73);
        for (int var4 = arg0; var4 < var3; ++var4) {
            class85 var5 = new class85();
            class151 var6 = var2.method1443((byte) -57);
            var5.field1599 = var2.method1490((byte) 73);
            var5.field1593 = var2.method1490((byte) 73);
            var5.field1604 = var2.method1475(255);
            var5.field1603 = var6.method965(32, 47, 0);
            var5.field1597 = var6.method953(47, -120);
            class209.field3672.method1361(var5, (byte) 71);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lsd;Loc;Loc;I)Lhh;")
    public static final class84 method1253(class192 arg0, class151 arg1, class151 arg2, int arg3) {
        if (arg3 != 22464) {
            method1253((class192) null, (class151) null, (class151) null, 1);
        }
        int var4 = arg0.method1198(25128, arg1);
        ++field3542;
        int var5 = arg0.method1202(arg2, var4, 118);
        return class85.method556(var5, arg0, 11953, var4);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)[I")
    public final int[] method11(byte arg0, int arg1) {
        if (arg0 != 107) {
            return null;
        } else {
            ++field3546;
            int[] var3 = super.field21.method1182(arg1, -31709);
            if (super.field21.field3388) {
                class145.method923(var3, 0, class202.field3603, class23.field509[arg1]);
            }
            return var3;
        }
    }
}
