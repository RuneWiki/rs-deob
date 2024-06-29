import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class557 extends class265 implements class532 {

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "Lbk;")
    private class106 field8179;

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "I")
    public static int field8180 = 0;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "Liba;")
    public static class211 field8175 = new class211(14, 4);

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "Liba;")
    public static class211 field8182 = new class211(72, 2);

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "I")
    public static int field8185 = 0;

    @OriginalMember(owner = "client!ed", name = "I", descriptor = "Z")
    public static boolean field8183 = false;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public static int field8170;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
    public static int field8171;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    public static int field8172;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
    public static int field8173;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "I")
    public static int field8174;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "I")
    public static int field8176;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "I")
    public static int field8177;

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "I")
    public static int field8178;

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "I")
    public static int field8181;

    @OriginalMember(owner = "client!ed", name = "J", descriptor = "I")
    public static int field8184;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(Z)Z", line = 4)
    public final boolean method986(boolean arg0) {
        ++field8171;
        if (!arg0) {
            field8184 = 51;
        }
        return super.method1588(super.field3469.field9941, 122);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V", line = 21)
    public final void method984(int arg0, int arg1) {
        if (arg1 < 119) {
            method3233(true, 37);
        }
        super.method984(this.field8179.field1564 * arg0, 124);
        ++field8181;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V", line = 34)
    public static final void method3232(int arg0) {
        ++field8176;
        class9.field253.method1995((byte) -123);
        if (arg0 != -3044) {
            method3234((byte) 41);
        }
        class248.field3266.method1125(true);
        class487.field6925.method1125(true);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)I", line = 50)
    public final int method963(boolean arg0) {
        ++field8174;
        if (arg0) {
            field8175 = null;
        }
        return super.method963(false);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZI)I", line = 61)
    public static final int method3233(boolean arg0, int arg1) {
        if (!arg0) {
            method3232(-115);
        }
        ++field8178;
        return arg1 & 127;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(Z)Lbk;", line = 76)
    public final class106 method988(boolean arg0) {
        if (arg0) {
            field8183 = true;
        }
        ++field8172;
        return this.field8179;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V", line = 92)
    public static void method3234(byte arg0) {
        field8175 = null;
        if (arg0 < -54) {
            field8182 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;", line = 103)
    public final Buffer method985(byte arg0, boolean arg1) {
        ++field8170;
        int var3 = 39 % ((1 - arg0) / 39);
        return super.method1593(super.field3469.field9941, arg1, (byte) -37);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V", line = 116)
    public final void method987(int arg0) {
        ++field8173;
        int var2 = 125 % ((-81 - arg0) / 33);
        super.method987(93);
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lkd;Lbk;Z)V", line = 129)
    public class557(class700 arg0, class106 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field8179 = arg1;
    }
}
