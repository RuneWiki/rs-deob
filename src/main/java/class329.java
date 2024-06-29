import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class329 implements class480 {

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "Lri;")
    private class97 field5093;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "Lla;")
    public static class418 field5095;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "(I)V", line = 4)
    public static void method2211(int arg0) {
        field5095 = null;
        if (arg0 < 115) {
            field5095 = null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)Lcj;", line = 15)
    public final class644 method1779(int arg0) {
        field5094++;
        int var2 = 96 / ((-arg0 - 38) / 40);
        return class644.field9053;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(II)I", line = 25)
    public static final int method2212(int arg0, int arg1) {
        if (arg1 > -29) {
            method2212(-119, 0);
        }
        field5097++;
        if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        } else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else if (arg0 == 6409 || arg0 == 34846) {
            return 6409;
        } else if (arg0 == 6410 || arg0 == 34847) {
            return 6410;
        } else if (arg0 == 6402) {
            return 6402;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)I", line = 59)
    public final int method1781(int arg0) {
        field5096++;
        if (this.field5093.method916(100)) {
            return 100;
        } else {
            int var2 = 126 / ((arg0 - 29) / 57);
            return this.field5093.method945((byte) 119);
        }
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lri;)V", line = 72)
    public class329(class97 arg0) {
        this.field5093 = arg0;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V", line = 83)
    public static final void method2213(byte arg0) {
        field5092++;
        if (arg0 != -21) {
            return;
        }
        if (class682.field9564 == 3) {
            class68.method715(4, (byte) -127);
        } else if (class682.field9564 == 7) {
            class68.method715(8, (byte) -54);
        } else if (class682.field9564 == 10) {
            class68.method715(11, (byte) -87);
        }
    }
}
