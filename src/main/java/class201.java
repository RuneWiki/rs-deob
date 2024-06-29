import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class201 {

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static volatile int field3441 = -1;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field3444 = 0;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "[I")
    public static int[] field3443 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "Lia;")
    public static class257 field3448 = class28.method234(103, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "Lia;")
    public static class257 field3445 = class28.method234(-61, ")2");

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field3449 = 0;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "[Lte;")
    public static class184[] field3446;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public static void method1349(byte arg0) {
        field3443 = null;
        field3445 = null;
        field3446 = null;
        if (arg0 != 64) {
            field3449 = 84;
        }
        field3448 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZILhb;)V")
    public static final void method1350(boolean arg0, int arg1, class157 arg2) {
        field3447++;
        int var3 = (int) arg2.field573;
        int var4 = arg2.field2746;
        arg2.method254(arg1 - 2097150);
        if (arg0) {
            class45.method354(var4, (byte) 102);
        }
        class219.method1448(var4, (byte) 122);
        class44 var5 = class221.method1456(var3, (byte) -100);
        if (var5 != null) {
            class257.method1718(false, var5);
        }
        class199.field3407 = 0;
        if (arg1 != 2097151) {
            field3443 = null;
        }
        class216.field3663 = false;
        class82.method617(class207.field3547, class182.field3152, (byte) -122, class169.field2920, class213.field3644);
        if (class5.field114 != -1) {
            class253.method1652(-15970, class5.field114, 1);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static final void method1351(int arg0) {
        class117.field2098++;
        class205.field3524.method908(false, 33);
        class205.field3524.method1044(false, 0L);
        field3439++;
        int var1 = 7 % ((arg0 - 11) / 61);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLmb;Llf;Lmb;Z)V")
    public static final void method1352(byte arg0, class178 arg1, class240 arg2, class178 arg3, boolean arg4) {
        class20.field416 = arg3;
        class208.field3556 = arg4;
        field3440++;
        class187.field3247 = arg1;
        int var5 = class20.field416.method1202(-101) - 1;
        if (arg0 != -48) {
            field3445 = null;
        }
        class148.field2573 = var5 * 256 + class20.field416.method1220((byte) -63, var5);
        class177.field3006 = arg2;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lia;IZ)V")
    public static final void method1353(class257 arg0, int arg1, boolean arg2) {
        field3442++;
        class202 var3 = class222.method1466(2, -31, arg1);
        var3.method1354(124);
        var3.field3456 = arg0;
        if (arg2) {
            field3445 = null;
        }
    }
}
