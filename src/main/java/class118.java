import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class118 {

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "[I")
    public static int[] field2680 = new int[50];

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "Lva;")
    public static class121 field2685 = class107.method797("@gr3@", -10983);

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "Lva;")
    private static class121 field2686 = class107.method797("Your account has been disabled)3", -10983);

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "Lva;")
    private static class121 field2687 = class107.method797(" has logged in)3", -10983);

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field2682 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field2676 = -1;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "Z")
    public static volatile boolean field2691 = true;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "Lva;")
    public static class121 field2675 = field2687;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "Lva;")
    public static class121 field2692 = field2686;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "Lva;")
    private static class121 field2693 = class107.method797("Press (Wrecover a locked account(W on front page)3", -10983);

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Lva;")
    public static class121 field2683 = field2693;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field2677 = -1;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Li;")
    public static class48 field2678;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "[[I")
    public static int[][] field2684;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILed;)V", line = 10)
    public static final void method906(int arg0, class29 arg1) {
        field2688++;
        if (arg1.field728 == 0) {
            return;
        }
        if (arg1.field753 != -1 && arg1.field753 < 32768) {
            class50 var2 = class8.field110[arg1.field753];
            if (var2 != null) {
                int var3 = arg1.field750 - var2.field750;
                int var4 = arg1.field742 - var2.field742;
                if (var3 != 0 || var4 != 0) {
                    arg1.field725 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field753 >= 32768) {
            int var5 = arg1.field753 - 32768;
            if (class101.field2257 == var5) {
                var5 = 2047;
            }
            class77 var6 = class127.field2895[var5];
            if (var6 != null) {
                int var7 = arg1.field750 - var6.field750;
                int var8 = arg1.field742 - var6.field742;
                if (var7 != 0 || var8 != 0) {
                    arg1.field725 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field749 != 0 || arg1.field731 != 0) && (arg1.field724 == 0 || arg1.field729 > 0)) {
            int var9 = arg1.field750 - (arg1.field749 - class129.field2977 - class129.field2977) * 64;
            int var10 = arg1.field742 - (arg1.field731 - class9.field132 - class9.field132) * 64;
            if (var9 != 0 || var10 != 0) {
                arg1.field725 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field731 = 0;
            arg1.field749 = 0;
        }
        int var11 = arg1.field725 - arg1.field739 & 0x7FF;
        if (arg0 <= 16) {
            method909((byte) -77);
        }
        if (var11 == 0) {
            return;
        }
        if (var11 < arg1.field728 || 2048 - arg1.field728 < var11) {
            arg1.field739 = arg1.field725;
        } else if (var11 > 1024) {
            arg1.field739 -= arg1.field728;
        } else {
            arg1.field739 += arg1.field728;
        }
        arg1.field739 &= 0x7FF;
        if (arg1.field777 != arg1.field740 || arg1.field739 == arg1.field725) {
            return;
        }
        if (arg1.field738 == -1) {
            arg1.field777 = arg1.field769;
            return;
        }
        arg1.field777 = arg1.field738;
        return;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V", line = 124)
    public static final void method907(byte arg0) {
        class91.field2062 = new class9();
        field2689++;
        if (arg0 != -29) {
            field2683 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lhe;ILhe;Z)V", line = 144)
    public static final void method908(class47 arg0, int arg1, class47 arg2, boolean arg3) {
        class69.field1639 = arg0;
        field2695++;
        if (arg1 != -20188) {
            method910(52, -10, -86, null);
        }
        class79.field1840 = arg2;
        class116.field2644 = arg3;
        class53.field1219 = class79.field1840.method328(10, false);
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V", line = 177)
    public static void method909(byte arg0) {
        field2683 = null;
        field2685 = null;
        if (arg0 <= 119) {
            field2675 = null;
        }
        field2693 = null;
        field2692 = null;
        field2675 = null;
        field2687 = null;
        field2686 = null;
        field2680 = null;
        field2684 = null;
        field2678 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIILhe;)[Lm;", line = 243)
    public static final class72[] method910(int arg0, int arg1, int arg2, class47 arg3) {
        field2679++;
        if (class5.method36(arg2, 29066, arg3, arg0)) {
            int var4 = 18 / ((arg1 + 66) / 44);
            return class114.method873(10);
        } else {
            return null;
        }
    }
}
