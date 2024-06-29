import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class333 extends class502 {

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "[Z")
    public static boolean[] field4504 = new boolean[8];

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "[I")
    public static int[] field4505 = new int[1000];

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "Lvl;")
    public static class15 field4500 = new class15(49, 3);

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "Lrha;")
    public static class235 field4510 = new class235("WTWIP", "office", "_wip", 3);

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "Lkc;")
    public static class145 field4511;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "Lfh;")
    public static class678 field4502;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(B)V", line = 4)
    public static void method2091(byte arg0) {
        field4500 = null;
        field4504 = null;
        field4511 = null;
        field4502 = null;
        field4510 = null;
        if (arg0 >= -52) {
            method2094(52);
        }
        field4505 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V", line = 19)
    public final void method58(boolean arg0) {
        ++field4498;
        if (!arg0) {
            field4511 = null;
        }
        if (super.field6863.method2824((byte) 72).method193(0) < 96) {
            super.field6865 = 0;
        }
        if (~super.field6865 > -1 || ~super.field6865 < -3) {
            super.field6865 = this.method55(-2);
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(ILeka;)V", line = 39)
    public class333(int arg0, class492 arg1) {
        super(arg0, arg1);
        class72.method633((byte) -6, super.field6865);
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)Z", line = 48)
    public final boolean method2092(int arg0) {
        ++field4506;
        return ~super.field6863.method2824((byte) 76).method193(arg0) <= -97;
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(II)V", line = 59)
    public final void method52(int arg0, int arg1) {
        if (arg1 == 0) {
            ++field4507;
            super.field6865 = arg0;
            class72.method633((byte) -6, super.field6865);
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)V", line = 71)
    public static final void method2093(int arg0) {
        ++field4508;
        if (arg0 != 49) {
            field4510 = null;
        }
        for (class430 var1 = (class430) class524.field7128.method335(-29067); var1 != null; var1 = (class430) class524.field7128.method336(88)) {
            class768.method4227(-18974, var1.field5867);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)I", line = 93)
    public final int method57(int arg0, int arg1) {
        ++field4499;
        return ~super.field6863.method2824((byte) 80).method193(arg1 + arg1) > -97 ? 3 : 1;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Leka;)V", line = 104)
    public class333(class492 arg0) {
        super(arg0);
        class72.method633((byte) -6, super.field6865);
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)Lqj;", line = 114)
    public static final class537 method2094(int arg0) {
        ++field4501;
        if (arg0 != 3) {
            field4500 = null;
        }
        class537 var1 = class198.method1428(-16316);
        var1.field7302 = null;
        var1.field7297 = 0;
        var1.field7295 = new class329(5000);
        return var1;
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(B)I", line = 131)
    public final int method2095(byte arg0) {
        ++field4503;
        return arg0 <= 49 ? -80 : super.field6865;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)I", line = 142)
    public final int method55(int arg0) {
        ++field4509;
        if (arg0 != -2) {
            return 99;
        } else {
            return ~super.field6863.method2824((byte) 119).method193(0) > -97 ? 0 : 2;
        }
    }
}
