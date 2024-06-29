import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class533 extends class9 {

    @OriginalMember(owner = "client!go", name = "C", descriptor = "I")
    public int field7496 = 0;

    @OriginalMember(owner = "client!go", name = "F", descriptor = "[I")
    public static int[] field7499 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!go", name = "w", descriptor = "[Lqc;")
    public static class631[] field7490 = new class631[32];

    @OriginalMember(owner = "client!go", name = "A", descriptor = "Lrg;")
    public static class548 field7494 = new class548(7, 8);

    @OriginalMember(owner = "client!go", name = "x", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!go", name = "y", descriptor = "I")
    public static int field7492;

    @OriginalMember(owner = "client!go", name = "z", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!go", name = "B", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!go", name = "D", descriptor = "Ldj;")
    public static class287 field7497;

    @OriginalMember(owner = "client!go", name = "E", descriptor = "[Lmba;")
    public static class355[] field7498;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IILos;)V")
    private final void method3045(int arg0, int arg1, class374 arg2) {
        field7495++;
        if (~arg0 == arg1) {
            this.field7496 = arg2.method2136(false);
        }
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(I)V")
    public static void method3046(int arg0) {
        field7494 = null;
        field7490 = null;
        field7499 = null;
        if (arg0 != 29729) {
            field7497 = null;
        }
        field7497 = null;
        field7498 = null;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Los;I)V")
    public final void method3047(class374 arg0, int arg1) {
        field7492++;
        while (true) {
            int var3 = arg0.method2129(-127);
            if (var3 == 0) {
                if (arg1 == 28198) {
                    return;
                } else {
                    field7494 = null;
                    return;
                }
            }
            this.method3045(var3, -3, arg0);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Let;IIZ)V")
    public static final void method3048(class509 arg0, int arg1, int arg2, boolean arg3) {
        field7491++;
        if (!arg3) {
            field7494 = null;
        }
        if (class449.field6225) {
            class395 var9 = class391.field5183 == -1 ? null : class290.field3771.method2793(11, class391.field5183);
            if (!client.method1412(arg0).method1500(-26680) || (class117.field1477 & 0x20) == 0) {
                return;
            }
            if (var9 == null || arg0.method2924(class391.field5183, 118, var9.field5211) != var9.field5211) {
                class22.method139(48, true, arg0.field7045, (byte) 65, class468.field6542, arg0.field7086, class472.field6608 + " -> " + arg0.field7184, class208.field2503, 0L, false, arg0.field7082);
                class97.field1194++;
            }
            return;
        }
        for (int var4 = 9; var4 >= 5; var4--) {
            String var8 = class255.method1441(arg0, var4, -11691);
            if (var8 != null) {
                class22.method139(1009, true, arg0.field7045, (byte) 65, class503.method2904(-17570, var4, arg0), arg0.field7086, arg0.field7184, var8, (long) (var4 + 1), false, arg0.field7082);
                class527.field7383++;
            }
        }
        String var5 = class210.method1208(arg0, (byte) 42);
        if (var5 != null) {
            class22.method139(47, true, arg0.field7045, (byte) 65, arg0.field7136, arg0.field7086, arg0.field7184, var5, 0L, false, arg0.field7082);
            class333.field4315++;
        }
        for (int var6 = 4; var6 >= 0; var6--) {
            String var7 = class255.method1441(arg0, var6, -11691);
            if (var7 != null) {
                class527.field7383++;
                class22.method139(20, true, arg0.field7045, (byte) 65, class503.method2904(-17570, var6, arg0), arg0.field7086, arg0.field7184, var7, (long) (var6 + 1), false, arg0.field7082);
            }
        }
        if (!client.method1412(arg0).method1507(125)) {
            return;
        }
        class549.field8062++;
        if (arg0.field7167 == null) {
            class22.method139(30, true, arg0.field7045, (byte) 65, -1, arg0.field7086, "", class554.field8158.method987(class31.field247, 22), 0L, false, arg0.field7082);
            return;
        }
        class22.method139(30, true, arg0.field7045, (byte) 65, -1, arg0.field7086, "", arg0.field7167, 0L, false, arg0.field7082);
        return;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIBLr;I)Lso;")
    public static final class398 method3049(int arg0, int arg1, byte arg2, class157 arg3, int arg4) {
        field7493++;
        if (arg3 == null) {
            return null;
        } else {
            int var5 = -76 % ((-arg2 - 87) / 39);
            return new class398(arg1, arg0, arg4, arg3.method60(), arg3.method90(), arg3.method82(), arg3.method74(), arg3.method73(), arg3.method96(), arg3.method71());
        }
    }
}
