import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public abstract class class645 {

    @OriginalMember(owner = "client!jia", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field8786 = new String[100];

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "Llja;")
    public static class744 field8784 = new class744(52, 8);

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "I")
    public static int field8785;

    @OriginalMember(owner = "client!jia", name = "e", descriptor = "I")
    public static int field8788;

    @OriginalMember(owner = "client!jia", name = "f", descriptor = "I")
    public static int field8789;

    @OriginalMember(owner = "client!jia", name = "h", descriptor = "I")
    public static int field8791;

    @OriginalMember(owner = "client!jia", name = "g", descriptor = "Ljava/awt/Frame;")
    public static Frame field8790;

    @OriginalMember(owner = "client!jia", name = "d", descriptor = "[I")
    public static int[] field8787;

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(IBI)Z", line = 4)
    public static final boolean method3604(int arg0, byte arg1, int arg2) {
        if (arg1 > -110) {
            return false;
        } else {
            field8789++;
            return (arg0 & 0x70000) != 0 | class99.method843(arg2, -1, arg0) || class372.method2181(arg0, arg2, 10504);
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(I)V", line = 15)
    public static void method3605(int arg0) {
        field8784 = null;
        field8787 = null;
        if (arg0 < 90) {
            field8787 = null;
        }
        field8786 = null;
        field8790 = null;
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(Loaa;Lha;Lke;B)V", line = 36)
    public static final void method3606(class305 arg0, class66 arg1, class625 arg2, byte arg3) {
        field8785++;
        class312 var4 = arg0.method1766(arg1, 131072);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method1640();
        if (var5 < var4.method1637()) {
            var5 = var4.method1637();
        }
        byte var6 = 10;
        int var7 = arg2.field8576;
        int var8 = arg2.field8569;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg0.field3641 != null) {
            var9 = class620.field8388.method1818(62, null, arg0.field3641, class264.field3128, null);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class264.field3128[var12];
                if ((var9 - 1) > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class389.field5029.method1047(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = var9 * class389.field5029.method1050() + (class389.field5029.method1052() / 2);
        }
        int var15 = var5 / 2 + arg2.field8576;
        int var16 = arg2.field8569;
        if ((class9.field163 + var5) > var7) {
            var15 = var5 / 2 + var10 / 2 + class9.field163 + var6 + 5;
            var7 = class9.field163;
        } else if ((class9.field165 - var5) < var7) {
            var7 = class9.field165 - var5;
            var15 = class9.field165 - var6 - var10 / 2 - (var5 / 2) - 5;
        }
        if (class9.field164 + var5 > var8) {
            var8 = class9.field164;
            var16 = var5 / 2 + var6 + class9.field164;
        } else if (var8 > (class9.field171 - var5)) {
            var16 = class9.field171 - var6 - var11 - var5 / 2;
            var8 = class9.field171 - var5;
        }
        int var17 = (int) (Math.atan2((double) (var7 - arg2.field8576), (double) (var8 - arg2.field8569)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method1841((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg3 <= 63) {
            field8786 = null;
        }
        if (arg0.field3641 != null) {
            var19 = var16;
            var18 = var15 - (var10 / 2) - 5;
            var20 = var10 + var18 + 10;
            var21 = (var16 + (class389.field5029.method1050() * var9)) + 3;
            if (arg0.field3636 != 0) {
                arg1.method600(var18, var16, 785580130, arg0.field3636, var21 - var16, -var18 + var20);
            }
            if (arg0.field3651 != 0) {
                arg1.method598(var20 - var18, var16, 127, var18, var21 - var16, arg0.field3651);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class264.field3128[var22];
                if (var22 < (var9 - 1)) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class389.field5029.method1049(arg1, var23, var15, var16, arg0.field3649, true);
                var16 += class389.field5029.method1050();
            }
        }
        if (arg0.field3666 == -1 && arg0.field3641 == null) {
            return;
        }
        int var24 = var5 >> 1;
        class786 var25 = new class786(arg2);
        var25.field10845 = var18;
        var25.field10846 = var7 + var24;
        var25.field10850 = var19;
        var25.field10852 = var8 + var24;
        var25.field10841 = var8 - var24;
        var25.field10843 = var21;
        var25.field10848 = var7 - var24;
        var25.field10847 = var20;
        class476.field6612.method2732(var25, 21939);
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(Z)V", line = 189)
    public static final void method3607(boolean arg0) {
        class639.method3591((byte) -40);
        if (arg0) {
            field8788++;
        }
    }
}
