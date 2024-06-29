import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class596 extends class422 implements class498 {

    @OriginalMember(owner = "client!ow", name = "B", descriptor = "Llj;")
    private class6 field8056;

    @OriginalMember(owner = "client!ow", name = "v", descriptor = "Lft;")
    public static class285 field8050 = new class285(5, -1);

    @OriginalMember(owner = "client!ow", name = "w", descriptor = "I")
    public static int field8051;

    @OriginalMember(owner = "client!ow", name = "x", descriptor = "I")
    public static int field8052;

    @OriginalMember(owner = "client!ow", name = "y", descriptor = "I")
    public static int field8053;

    @OriginalMember(owner = "client!ow", name = "z", descriptor = "I")
    public static int field8054;

    @OriginalMember(owner = "client!ow", name = "A", descriptor = "I")
    public static int field8055;

    @OriginalMember(owner = "client!ow", name = "C", descriptor = "I")
    public static int field8057;

    @OriginalMember(owner = "client!ow", name = "D", descriptor = "I")
    public static int field8058;

    @OriginalMember(owner = "client!ow", name = "E", descriptor = "I")
    public static int field8059;

    @OriginalMember(owner = "client!ow", name = "F", descriptor = "I")
    public static int field8060;

    @OriginalMember(owner = "client!ow", name = "f", descriptor = "(I)V", line = 5)
    public static void method3230(int arg0) {
        if (arg0 <= 71) {
            method3230(67);
        }
        field8050 = null;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(III)Z", line = 18)
    public static final boolean method3231(int arg0, int arg1, int arg2) {
        if (arg1 != -32310) {
            method3230(-80);
        }
        field8055++;
        return class50.method447(arg2, arg1 + 38288, arg0) & class26.method152(arg2, arg1 + 32437, arg0);
    }

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "(I)Llj;", line = 29)
    public final class6 method2700(int arg0) {
        int var2 = -21 / ((arg0 + 61) / 36);
        field8053++;
        return this.field8056;
    }

    @OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(Lia;Llj;Z)V", line = 43)
    public class596(class27 arg0, class6 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field8056 = arg1;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIIIII)V", line = 52)
    public static final void method3232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8057++;
        int var6 = class650.method3574(class99.field1309, class165.field2061, arg4, 12);
        if (arg1 != 34963) {
            field8050 = null;
        }
        int var7 = class650.method3574(class99.field1309, class165.field2061, arg0, 111);
        int var8 = class650.method3574(class641.field8924, class265.field3552, arg3, -71);
        int var9 = class650.method3574(class641.field8924, class265.field3552, arg5, arg1 - 35038);
        for (int var10 = var6; var10 <= var7; var10++) {
            class349.method2008(var9, (byte) 52, class213.field2746[var10], var8, arg2);
        }
    }

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "(I)Z", line = 80)
    public final boolean method646(int arg0) {
        field8051++;
        return arg0 >= -100 ? false : super.method646(-125);
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;", line = 93)
    public final Buffer method647(boolean arg0, boolean arg1) {
        field8054++;
        if (arg0) {
            this.field8056 = null;
        }
        return super.method647(false, arg1);
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Z)I", line = 105)
    public final int method648(boolean arg0) {
        if (!arg0) {
            this.method648(false);
        }
        field8060++;
        return super.method648(true);
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IB)V", line = 118)
    public final void method2429(int arg0, byte arg1) {
        if (arg1 > -29) {
            method3230(101);
        }
        field8052++;
        super.method2429(this.field8056.field43 * arg0, (byte) -63);
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(ILcw;)V", line = 134)
    public static final void method3233(int arg0, class126 arg1) {
        arg1.field1632 = null;
        field8058++;
        if (arg0 < 28) {
            method3231(-19, -11, 83);
        }
        if (class683.field9392 < 20) {
            class91.field1201.method2104((byte) -22, arg1);
            class683.field9392++;
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)V", line = 152)
    public final void method645(int arg0) {
        int var2 = 113 % ((arg0 - 37) / 36);
        field8059++;
        super.method645(84);
    }
}
