import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class272 extends class60 {

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "[I")
    public static int[] field3207 = new int[16];

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "F")
    public static float field3203;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "[J")
    public static long[] field3202;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V")
    public final void method409(byte arg0) {
        ++field3209;
        if (super.field798.field10673.method2088(127) && super.field799 == 2) {
            super.field799 = 1;
        }
        if (~super.field799 > -1 || ~super.field799 < -3) {
            super.field799 = this.method405(false);
        }
        if (arg0 > -27) {
            this.method409((byte) -89);
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)V")
    public static void method1599(boolean arg0) {
        field3202 = null;
        if (arg0) {
            method1601(-19, 43, 71);
        }
        field3207 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)V")
    public final void method407(byte arg0, int arg1) {
        int var3 = 8 / ((arg0 - 28) / 50);
        super.field799 = arg1;
        ++field3208;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)I")
    public final int method406(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method407((byte) 43, 74);
        }
        ++field3204;
        return 1;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(ILhd;)V")
    public class272(int arg0, class773 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lhd;)V")
    public class272(class773 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)I")
    public final int method405(boolean arg0) {
        if (arg0) {
            return 113;
        } else {
            ++field3200;
            return 2;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)I")
    public final int method1600(int arg0) {
        ++field3201;
        if (arg0 != 0) {
            this.method405(true);
        }
        return super.field799;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)Z")
    public static final boolean method1601(int arg0, int arg1, int arg2) {
        if (arg1 != 1024) {
            return false;
        } else {
            ++field3206;
            return (1024 & arg0) != 0;
        }
    }
}
