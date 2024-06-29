import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class218 {

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "Lve;")
    private static class255 field3688 = class87.method607(43, "wishes to trade with you)3");

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field3689 = 0;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "Lve;")
    public static class255 field3684 = field3688;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field3691 = 0;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "Lfg;")
    public static class203 field3692 = new class203();

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "Lve;")
    private static class255 field3694 = class87.method607(125, "slide:");

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "Lve;")
    public static class255 field3699 = field3694;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "Lve;")
    public static class255 field3696 = class87.method607(99, ":clan:");

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "Lve;")
    public static class255 field3693 = field3694;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "Ltl;")
    public static class197 field3690;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "[[Z")
    public static boolean[][] field3698;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)J", line = 6)
    public static final synchronized long method1541(int arg0) {
        field3685++;
        long var1 = System.currentTimeMillis();
        int var3 = 24 % ((arg0 + 8) / 39);
        if (var1 < class153.field2605) {
            class129.field2137 += class153.field2605 - var1;
        }
        class153.field2605 = var1;
        return var1 + class129.field2137;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIII)V", line = 32)
    public static final void method1542(int arg0, int arg1, int arg2, int arg3) {
        field3687++;
        class53 var4 = class303.method2112(-1155040160, arg2, 4);
        var4.method325((byte) -48);
        var4.field819 = arg0;
        if (arg3 < -64) {
            var4.field824 = arg1;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V", line = 47)
    public static void method1543(int arg0) {
        field3684 = null;
        field3696 = null;
        field3693 = null;
        if (arg0 != 29808) {
            method1544(false);
        }
        field3699 = null;
        field3694 = null;
        field3688 = null;
        field3698 = (boolean[][]) null;
        field3690 = null;
        field3692 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V", line = 70)
    public static final void method1544(boolean arg0) {
        class304.field5202.method553(116);
        if (arg0) {
            method1542(90, -68, 0, 18);
        }
        field3686++;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIILme;JLme;Lme;)V", line = 91)
    public static final void method1545(int arg0, int arg1, int arg2, int arg3, class177 arg4, long arg5, class177 arg6, class177 arg7) {
        class293 var9 = new class293();
        var9.field5039 = arg4;
        var9.field5034 = arg1 * 128 + 64;
        var9.field5032 = arg2 * 128 + 64;
        var9.field5035 = arg3;
        var9.field5030 = arg5;
        var9.field5033 = arg6;
        var9.field5031 = arg7;
        int var10 = 0;
        class249 var11 = class118.field1984[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field4188; var12++) {
                class250 var13 = var11.field4182[var12];
                if ((var13.field4206 & 0x400000L) == 4194304L) {
                    int var14 = var13.field4215.method176();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field5029 = -var10;
        if (class118.field1984[arg0][arg1][arg2] == null) {
            class118.field1984[arg0][arg1][arg2] = new class249(arg0, arg1, arg2);
        }
        class118.field1984[arg0][arg1][arg2].field4200 = var9;
    }
}
