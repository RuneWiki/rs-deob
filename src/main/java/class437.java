import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class437 extends class481 {

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "I")
    public static int field6276 = 1337;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    public static int field6272;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "[Lrg;")
    public static class395[] field6277;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
    public static void method2594(int arg0) {
        int var1 = 32 / ((-arg0 - 78) / 34);
        field6277 = null;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)V")
    public static final void method2595(int arg0, int arg1) {
        field6274++;
        class80.field957 = -1;
        class128.field1581 = null;
        class199.field2766 = -1;
        class175.field2099 = arg1;
        if (arg0 <= 90) {
            method2594(-8);
        }
        class142.field1712 = 1;
        class269.field3862 = 0;
        class349.field5020 = false;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIILqo;Lcj;BLcu;I)V")
    public static final void method2596(int arg0, int arg1, int arg2, class137 arg3, class198 arg4, byte arg5, class415 arg6, int arg7) {
        field6272++;
        class399 var8 = new class399();
        var8.field5668 = arg1;
        var8.field5680 = arg7 * 128;
        var8.field5672 = arg2 * 128;
        if (arg5 != -93) {
            return;
        }
        if (arg6 != null) {
            var8.field5685 = arg6;
            int var10 = arg6.field5939;
            int var11 = arg6.field5927;
            if (arg0 == 1 || arg0 == 3) {
                var10 = arg6.field5927;
                var11 = arg6.field5939;
            }
            var8.field5674 = arg6.field5997;
            var8.field5670 = arg6.field5923;
            var8.field5677 = arg6.field5917;
            var8.field5675 = arg6.field5938;
            var8.field5691 = arg6.field5999;
            var8.field5681 = (arg7 + var10) * 128;
            var8.field5687 = arg6.field5930 * 128;
            var8.field5686 = (arg2 + var11) * 128;
            if (arg6.field5951 != null) {
                var8.field5678 = true;
                var8.method2386(0);
            }
            if (var8.field5675 != null) {
                var8.field5689 = var8.field5674 + (int) (Math.random() * (double) (var8.field5691 - var8.field5674));
            }
            class445.field6339.method803(var8, 50);
            return;
        }
        if (arg3 != null) {
            var8.field5671 = arg3;
            class476 var9 = arg3.field1643;
            if (var9.field6694 != null) {
                var8.field5678 = true;
                var9 = var9.method2812(class75.field909, true);
            }
            if (var9 != null) {
                var8.field5681 = (arg7 + var9.field6695) * 128;
                var8.field5686 = (var9.field6695 + arg2) * 128;
                var8.field5677 = class349.method2116(105, arg3);
                var8.field5687 = var9.field6721 * 128;
                var8.field5670 = var9.field6690;
            }
            class53.field689.method803(var8, 50);
            return;
        }
        if (arg4 == null) {
            return;
        }
        var8.field5669 = arg4;
        var8.field5681 = (arg4.method1012(false) + arg7) * 128;
        var8.field5686 = (arg4.method1012(false) + arg2) * 128;
        var8.field5677 = class62.method318(arg5 + 102, arg4);
        var8.field5670 = arg4.field2725;
        var8.field5687 = arg4.field2737 * 128;
        class350.field5031.method234(-45, (long) arg4.field2457, var8);
        return;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIB)V")
    public static final void method2597(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 <= 3) {
            field6276 = 59;
        }
        field6275++;
        class140.field1686 = new byte[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BB)C")
    public static final char method2598(byte arg0, byte arg1) {
        field6273++;
        int var2 = arg0 & 0xFF;
        if (arg1 != -49) {
            return (char) 65475;
        } else if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else {
            if (var2 >= 128 && var2 < 160) {
                char var3 = class185.field2430[var2 - 128];
                if (var3 == '\u0000') {
                    var3 = '?';
                }
                var2 = var3;
            }
            return (char) var2;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZI)V")
    public static final void method2599(boolean arg0, int arg1) {
        int var2 = -4 / ((arg1 - 13) / 60);
        class198.field2745 = arg0;
        field6278++;
        if (class173.field2084 != null) {
            class173.field2084.method2294(0, !class420.method2503((byte) 126));
        }
    }

    static {
        new class40("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
    }
}
