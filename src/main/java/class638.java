import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class638 {

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "Lfv;")
    public static class120 field8770 = new class120();

    @OriginalMember(owner = "client!wda", name = "e", descriptor = "I")
    public static int field8771 = 0;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "I")
    public static int field8767;

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "I")
    public static int field8768;

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "I")
    public static int field8769;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(ZLfp;BLjava/lang/String;)Lvd;")
    public static final class38 method3539(boolean arg0, class323 arg1, byte arg2, String arg3) {
        field8769++;
        int var4 = arg1.method2090(112, arg3);
        if (var4 == -1) {
            return new class38(0);
        }
        if (arg2 >= -53) {
            method3540(-122);
        }
        int[] var5 = arg1.method2077(var4, 0);
        class38 var6 = new class38(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field483) {
                class675 var9 = new class675(arg1.method2100(var5[var8++], (byte) 112, var4));
                int var10 = var9.method3703(100);
                int var11 = var9.method3757((byte) -65);
                int var12 = var9.method3750((byte) 35);
                if (!arg0 && var12 == 1) {
                    var6.field483--;
                } else {
                    var6.field477[var7] = var10;
                    var6.field478[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)V")
    public static void method3540(int arg0) {
        field8770 = null;
        if (arg0 != 1844) {
            method3541(50, -6, -13, -49, -82, -24, -6, -45);
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3541(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8767++;
        int var8 = arg1 + arg6;
        int var9 = arg3 - arg6;
        for (int var10 = arg1; var10 < var8; var10++) {
            class643.method3557(arg2, class445.field6320[var10], (byte) 93, arg0, arg5);
        }
        for (int var11 = arg3; var11 > var9; var11--) {
            class643.method3557(arg2, class445.field6320[var11], (byte) 72, arg0, arg5);
        }
        int var12 = arg2 + arg6;
        int var13 = arg5 - arg6;
        if (arg7 != 18397) {
            method3540(13);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class445.field6320[var14];
            class643.method3557(arg2, var15, (byte) 111, arg0, var12);
            class643.method3557(var12, var15, (byte) 106, arg4, var13);
            class643.method3557(var13, var15, (byte) 52, arg0, arg5);
        }
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(I)V")
    public static final void method3542(int arg0) {
        class136.field1978 = arg0;
        for (int var1 = 0; var1 < class492.field6939; var1++) {
            for (int var2 = 0; var2 < class365.field5171; var2++) {
                if (class553.field7776[arg0][var1][var2] == null) {
                    class553.field7776[arg0][var1][var2] = new class165(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method3543(String arg0, int arg1) {
        field8768++;
        if (arg0.equals("")) {
            return;
        }
        if (arg1 <= 26) {
            method3543(null, 84);
        }
        class444.field6315++;
        class519 var2 = class357.method2293(class427.field5994, class639.field8783, (byte) 66);
        var2.field7384.method3694(class505.method2988(arg0, 0), -1528071456);
        var2.field7384.method3747((byte) 27, arg0);
        class151.method1027(var2, -8);
    }
}
