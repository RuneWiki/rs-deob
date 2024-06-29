import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class512 {

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "Lqu;")
    public static class219 field7608 = new class219(56, -1);

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field7606;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field7607;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field7609;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Lhw;")
    public static class208 field7610;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIII)I")
    public static final int method3089(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (~(arg3 & 0x1) == arg4) {
            int var7 = arg0;
            arg0 = arg2;
            arg2 = var7;
        }
        int var8 = arg1 & 0x3;
        field7607++;
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return 1 + 7 - arg0 - arg5;
        } else if (var8 == 2) {
            return 7 - (arg6 - 1) - arg2;
        } else {
            return arg5;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
    public static void method3090(boolean arg0) {
        if (arg0) {
            method3090(false);
        }
        field7608 = null;
        field7610 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([[[Lce;I)V")
    public static final void method3091(class409[][][] arg0, int arg1) {
        field7606++;
        if (arg1 > -98) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class409[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class409 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field6176 instanceof class267) {
                            ((class267) var6.field6176).method100(false);
                        }
                        if (var6.field6189 instanceof class267) {
                            ((class267) var6.field6189).method100(false);
                        }
                        if (var6.field6192 instanceof class267) {
                            ((class267) var6.field6192).method100(false);
                        }
                        if (var6.field6180 instanceof class267) {
                            ((class267) var6.field6180).method100(false);
                        }
                        if (var6.field6188 instanceof class267) {
                            ((class267) var6.field6188).method100(false);
                        }
                        for (class192 var7 = var6.field6175; var7 != null; var7 = var7.field2841) {
                            class423 var8 = var7.field2845;
                            if (var8 instanceof class267) {
                                ((class267) var8).method100(false);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method3092(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (class178.field2609 <= arg3 && arg3 <= class460.field7096 && class178.field2609 <= arg2 && arg2 <= class460.field7096 && arg1 >= class178.field2609 && arg1 <= class460.field7096 && class178.field2609 <= arg7 && class460.field7096 >= arg7 && class462.field7105 <= arg0 && class222.field3750 >= arg0 && class462.field7105 <= arg8 && class222.field3750 >= arg8 && arg5 >= class462.field7105 && arg5 <= class222.field3750 && class462.field7105 <= arg9 && class222.field3750 >= arg9) {
            class530.method3152(arg9, arg3, arg0, arg2, arg8, arg7, arg1, 3, arg5, arg4);
        } else {
            class262.method1787(arg7, arg3, arg4, (byte) -85, arg8, arg0, arg1, arg9, arg2, arg5);
        }
        if (arg6 == 0) {
            field7609++;
        }
    }
}
