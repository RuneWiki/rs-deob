import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class151 {

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "Llc;")
    private class112 field2861 = new class112(256);

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "Llc;")
    private class112 field2873 = new class112(256);

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Lbc;")
    private class14 field2863;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "Lbc;")
    private class14 field2866;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "Z")
    public static boolean field2859 = false;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "Lrd;")
    private static class173 field2862 = class133.method843(" ", -115);

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Lrd;")
    public static class173 field2857 = field2862;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "Lrd;")
    public static class173 field2864 = class133.method843("::qa_op_test", -120);

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "Lrd;")
    public static class173 field2872 = class133.method843("Fehler bei der Verbindung zum Server)3", 96);

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "Lrd;")
    public static class173 field2869 = class133.method843("Ihr Spielkonto wurde deaktiviert)3", -123);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[II)Loc;")
    public final class142 method988(int arg0, int[] arg1, int arg2) {
        field2858++;
        if (arg2 != -1) {
            this.method988(0, null, -101);
        }
        if (this.field2866.method132(false) == 1) {
            return this.method993(0, arg0, arg1, arg2 + 11);
        } else if (this.field2866.method138(arg0, true) == 1) {
            return this.method993(arg0, 0, arg1, 10);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(JB)Lrd;")
    public static final class173 method989(long arg0, byte arg1) {
        int var3 = -77 % ((43 - arg1) / 62);
        field2871++;
        return class173.method1117(arg0, -1, 10, false);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB[I)Loc;")
    public final class142 method990(int arg0, byte arg1, int[] arg2) {
        if (arg1 <= 94) {
            method989(40L, (byte) -88);
        }
        field2856++;
        if (this.field2863.method132(false) == 1) {
            return this.method995(256, 0, arg2, arg0);
        } else if (this.field2863.method138(arg0, true) == 1) {
            return this.method995(256, arg0, arg2, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIBI)I")
    public static final int method991(int arg0, int arg1, byte arg2, int arg3) {
        field2868++;
        if ((class21.field462[arg1][arg3][arg0] & 0x8) != 0) {
            return 0;
        } else if (arg2 == -120) {
            return arg1 <= 0 || (class21.field462[1][arg3][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return -25;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
    public static void method992(boolean arg0) {
        field2862 = null;
        field2872 = null;
        if (arg0) {
            method996(24, -43L);
        }
        field2857 = null;
        field2864 = null;
        field2869 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II[II)Loc;")
    private final class142 method993(int arg0, int arg1, int[] arg2, int arg3) {
        field2865++;
        int var5 = arg1 ^ (arg0 >>> 12 | (arg0 & 0x50000FFF) << 4);
        int var6 = var5 | arg0 << 16;
        if (arg3 != 10) {
            return null;
        }
        long var7 = (long) var6 ^ 0x100000000L;
        class142 var9 = (class142) this.field2873.method677(-2755, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class128 var10 = (class128) this.field2861.method677(-2755, var7);
            if (var10 == null) {
                var10 = class128.method821(this.field2866, arg0, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field2861.method675(var7, var10, false);
            }
            class142 var11 = var10.method815(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method824((byte) -127);
                this.field2873.method675(var7, var11, false);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)V")
    public static final void method994(boolean arg0) {
        class181.field3549.method53(-51);
        if (arg0) {
            field2870++;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(II[II)Loc;")
    private final class142 method995(int arg0, int arg1, int[] arg2, int arg3) {
        field2860++;
        int var5 = arg3 ^ (arg1 >>> 12 | (arg1 & 0x60000FFF) << 4);
        if (arg0 != 256) {
            return null;
        }
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class142 var9 = (class142) this.field2873.method677(-2755, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class154 var10 = class154.method1017(this.field2863, arg1, arg3);
            if (var10 == null) {
                return null;
            }
            class142 var11 = var10.method1016();
            this.field2873.method675(var7, var11, false);
            if (arg2 != null) {
                arg2[0] -= var11.field2670.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IJ)V")
    public static final void method996(int arg0, long arg1) {
        field2855++;
        if (arg0 != 12121) {
            field2872 = null;
        }
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class173.method1148(arg1 - 1L, 0);
            class173.method1148(1L, arg0 ^ 0x2F59);
        } else {
            class173.method1148(arg1, 0);
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lbc;Lbc;)V")
    public class151(class14 arg0, class14 arg1) {
        this.field2863 = arg0;
        this.field2866 = arg1;
    }
}
