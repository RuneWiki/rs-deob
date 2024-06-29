import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class652 extends class555 {

    @OriginalMember(owner = "client!oo", name = "n", descriptor = "I")
    private int field8793 = 0;

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field8792 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!oo", name = "p", descriptor = "I")
    public static int field8795 = 0;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "[Lkp;")
    public static class514[] field8790 = new class514[6];

    @OriginalMember(owner = "client!oo", name = "q", descriptor = "[C")
    public static char[] field8796 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
    public static int field8791;

    @OriginalMember(owner = "client!oo", name = "o", descriptor = "I")
    public static int field8794;

    @OriginalMember(owner = "client!oo", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field8797;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "([Ljava/lang/Object;[JB)V", line = 3)
    public static final void method3628(Object[] arg0, long[] arg1, byte arg2) {
        class563.method3206(arg1, arg0, false, arg1.length - 1, 0);
        ++field8791;
        int var3 = -96 / ((19 - arg2) / 35);
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Luq;Lea;)V", line = 131)
    public class652(class172 arg0, class572 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZI)V", line = 27)
    public final void method209(boolean arg0, int arg1) {
        ++field8794;
        int var3 = super.field7648.field5527.method3710(0, class67.field933, super.field7651.method343()) + super.field7648.field5533;
        if (arg1 != 7582) {
            field8796 = null;
        }
        int var4 = super.field7648.field5529.method3920(super.field7651.method340(), class187.field2450, arg1 + -7623) - -super.field7648.field5531;
        super.field7651.method973((float) (var3 + super.field7651.method343() / 2), (float) (super.field7651.method340() / 2 + var4), 4096, this.field8793);
        this.field8793 += ((class572) super.field7648).field7790;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "()V", line = 44)
    public static final void method3629() {
        byte var0 = 10;
        byte var1 = 30;
        if (class289.field4127 != 0 && class157.field2118 != null) {
            class34.field372.method467(class759.field10405);
            for (int var2 = 0; var2 < class641.field8642.length; ++var2) {
                class34.field372.method457(class641.field8642[var2] + class533.field7398[var2], -256, 0, class759.field10405[1], class759.field10405[3] - class759.field10405[1]);
            }
            for (int var3 = 0; var3 < class346.field4859; ++var3) {
                class378 var11 = class561.field7690[var3];
                class34.field372.method552(var11.field5517[0], var11.field5515[0], var11.field5516[0], class666.field8929);
                class34.field372.method552(var11.field5517[1], var11.field5515[1], var11.field5516[1], class628.field8506);
                class34.field372.method552(var11.field5517[2], var11.field5515[2], var11.field5516[2], class61.field782);
                class34.field372.method552(var11.field5517[3], var11.field5515[3], var11.field5516[3], class261.field3865);
                if (class666.field8929[2] != -1 && class628.field8506[2] != -1 && class61.field782[2] != -1 && class261.field3865[2] != -1) {
                    int var12 = -65536;
                    if (var11.field5524 == 4) {
                        var12 = -16776961;
                    }
                    class34.field372.method438(class666.field8929[1], var12, class628.field8506[0], class666.field8929[0], (byte) -82, class628.field8506[1]);
                    class34.field372.method438(class628.field8506[1], var12, class61.field782[0], class628.field8506[0], (byte) -98, class61.field782[1]);
                    class34.field372.method438(class61.field782[1], var12, class261.field3865[0], class61.field782[0], (byte) -3, class261.field3865[1]);
                    class34.field372.method438(class261.field3865[1], var12, class666.field8929[0], class261.field3865[0], (byte) -91, class666.field8929[1]);
                    class34.field372.method438(class666.field8929[1], var12, class61.field782[0], class666.field8929[0], (byte) 3, class61.field782[1]);
                }
            }
            class157.field2118.method568(-256, var0, var1 + 45, "Dynamic: " + class25.field250 + "/" + 5000, -16777216, true);
            class157.field2118.method568(-256, var0, var1 + 60, "Total Opaque Onscreen: " + class781.field10714 + "/" + 10000, -16777216, true);
            class157.field2118.method568(-256, var0, var1 + 75, "Total Trans Onscreen: " + class683.field9124 + "/" + 5000, -16777216, true);
            class157.field2118.method568(-256, var0, var1 + 90, "Occluders: " + (class586.field7974 + class583.field7922) + " Active: " + class346.field4859, -16777216, true);
            class157.field2118.method568(-256, var0, var1 + 105, "Occluded: Ground:" + class271.field3953 + " Walls: " + class723.field9819 + " CPs: " + class479.field6729 + " Pixels: " + class267.field3915, -16777216, true);
            class157.field2118.method568(-256, var0, var1 + 120, "Occlude Calc Took: " + class338.field4738 / 1000L + "us", -16777216, true);
            if (class289.field4127 == 2 && class99.field1448 != null) {
                for (int var4 = 0; var4 < class99.field1448.length; ++var4) {
                    float var6 = (float) class99.field1448[var4];
                    float var7 = var6 / 4194304.0F;
                    if (var7 > 1.0F) {
                        var7 = 1.0F;
                    }
                    float var8 = var7 * 255.0F;
                    float var9 = 255.0F - var8;
                    int var10 = (int) var9;
                    class99.field1448[var4] = var10 | var10 << 8 | var10 << 16 | -16777216;
                }
                class140 var5 = class34.field372.method446(class99.field1448, -115, class151.field2054, class493.field6934, class151.field2054, 0);
                var5.method358(var0, 170, 1, 0, 0);
            }
        }
    }

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "(I)V", line = 137)
    public static void method3630(int arg0) {
        if (arg0 != 2) {
            method3628((Object[]) null, (long[]) null, (byte) -47);
        }
        field8796 = null;
        field8797 = null;
        field8790 = null;
        field8792 = null;
    }
}
