import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class41 implements class399 {

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "[Lkj;")
    public static class236[] field642 = new class236[14];

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "[Z")
    public static boolean[] field645 = new boolean[100];

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "[I")
    public static int[] field647 = new int[100];

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)V")
    public static final void method311(int arg0, int arg1, int arg2) {
        if (arg2 != 11) {
            method315(false, -86, 109);
        }
        field649++;
        class262 var3 = class416.field6195[arg0][arg1];
        if (var3 != null) {
            class425.field6327 = var3.field3812;
            class197.field2813 = var3.field3820;
            class384.field5752 = var3.field3814;
        }
        class126.method861(arg2 ^ 0x7FF4);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public static void method312(int arg0) {
        field642 = null;
        if (arg0 != 10) {
            method313(-49, 101);
        }
        field645 = null;
        field647 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V")
    public static final void method313(int arg0, int arg1) {
        field641++;
        class256 var2 = class363.method2385(arg0, arg1, (byte) 1);
        var2.method1611(arg0 - 77);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([IIIJ)Ljava/lang/String;")
    public final String method314(int[] arg0, int arg1, int arg2, long arg3) {
        field646++;
        int var6 = -80 / ((-arg2 - 12) / 52);
        if (arg1 == 0) {
            class421 var7 = class15.method108(256, arg0[0]);
            return var7.method2711((byte) -49, (int) arg3);
        } else if (arg1 == 1 || arg1 == 10) {
            class193 var8 = class166.method1031((int) arg3, false);
            return var8.field2729;
        } else if (arg1 == 6 || arg1 == 7 || arg1 == 11) {
            return class15.method108(256, arg0[0]).method2711((byte) -49, (int) arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZII)V")
    public static final void method315(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field643 = 56;
        }
        field648++;
        int var3 = class407.field6101 * arg2 >> 8;
        if (arg1 == -1 && !class164.field2139) {
            class97.method639((byte) -109);
        } else if (arg1 != -1 && (class280.field4128 != arg1 || !class151.method985(0)) && var3 != 0 && !class164.field2139) {
            class419.method2696(var3, class328.field4711, (byte) 104, 0, false, 2, arg1);
        }
        class280.field4128 = arg1;
    }
}
