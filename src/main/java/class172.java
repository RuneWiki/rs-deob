import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class172 {

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public int field2698 = -1;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field2692 = 0;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2702 = "Examine";

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "[I")
    public static int[] field2697 = new int[4096];

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "Z")
    public static boolean field2700 = false;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "Lp;")
    public class285 field2708;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "[I")
    public int[] field2694;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "[Lgf;")
    public static class124[] field2706;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "[Ljava/lang/String;")
    public String[] field2701;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)V")
    public static final void method1211(int arg0, int arg1, int arg2) {
        field2703++;
        if (arg0 != 127) {
            field2695 = -30;
        }
        if (class219.field3553 != 0 && arg1 != -1) {
            class184.method1282(arg1, class219.field3553, 0, false, arg0 ^ 0xE, class261.field4209);
            class284.field4509 = true;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public static void method1212(int arg0) {
        field2702 = null;
        field2706 = null;
        field2697 = null;
        if (arg0 > -10) {
            method1214(-51, (class123) null);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BI)I")
    public static final int method1213(byte arg0, int arg1) {
        if (arg0 != 16) {
            field2693 = -95;
        }
        field2704++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILdl;)V")
    public static final void method1214(int arg0, class123 arg1) {
        class96.field1492 = arg1;
        if (arg0 != 0) {
            method1211(-35, 33, 124);
        }
        field2707++;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILbd;)V")
    public static final void method1215(int arg0, class186 arg1) {
        field2705++;
        class190 var2 = (class190) class290.field4573.method665((byte) 95, class162.method1116(arg1.field2912, (byte) 109));
        if (arg0 < 117 || var2 == null) {
            return;
        }
        if (var2.field2986 != null) {
            class130.field1907.method716(var2.field2986);
            var2.field2986 = null;
        }
        var2.method784(false);
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)Z")
    public static final boolean method1216(int arg0) {
        field2699++;
        class130 var1 = class103.field1597;
        synchronized (class103.field1597) {
            if (arg0 != -26170) {
                field2696 = 81;
            }
            if (class278.field4415 == class204.field3195) {
                return false;
            } else {
                class194.field3061 = class253.field4054[class204.field3195];
                class141.field2069 = class182.field2885[class204.field3195];
                class204.field3195 = class204.field3195 + 1 & 0x7F;
                return true;
            }
        }
    }
}
