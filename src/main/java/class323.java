import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class323 extends class264 {

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    public static int field4847 = 0;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "[Z")
    public static boolean[] field4845;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
    public final void method660(int arg0) {
        if (super.field3733 != 1 && super.field3733 != 0) {
            super.field3733 = this.method663((byte) -38);
        }
        ++field4849;
        int var2 = -92 / ((1 - arg0) / 41);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)I")
    public final int method666(byte arg0, int arg1) {
        ++field4846;
        if (arg0 != 112) {
            method2105(false, (class120) null);
        }
        return 1;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V")
    public static void method2103(byte arg0) {
        if (arg0 <= 91) {
            method2103((byte) -43);
        }
        field4845 = null;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)I")
    public final int method2104(byte arg0) {
        if (arg0 > -31) {
            return -31;
        } else {
            ++field4848;
            return super.field3733;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)I")
    public final int method663(byte arg0) {
        ++field4843;
        if (arg0 != -38) {
            field4845 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZLrv;)Ltu;")
    public static final class366 method2105(boolean arg0, class120 arg1) {
        ++field4850;
        int var2 = arg1.method871(23995);
        if (!arg0) {
            method2105(true, (class120) null);
        }
        return new class366(var2);
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(ILmfa;)V")
    public class323(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lmfa;)V")
    public class323(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(BI)V")
    public final void method659(byte arg0, int arg1) {
        super.field3733 = arg1;
        if (arg0 >= -114) {
            field4845 = null;
        }
        ++field4844;
    }
}
