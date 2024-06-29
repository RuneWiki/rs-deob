import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class9 {

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "Z")
    public boolean field148 = true;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public int field152;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public int field156;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public int field160;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public int field155;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public int field147;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public int field154;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field151 = 0;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "Lke;")
    public static class65 field158 = class1.method17("", -128);

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
    public static int field164 = 0;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    public static int field162 = -1;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "[J")
    public static long[] field163 = new long[32];

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "Lke;")
    public static class65 field150 = class1.method17("Verbinde mit Server)3)3)3", -122);

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "Lke;")
    public static class65 field146 = class1.method17(": ", -121);

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "[Lta;")
    public static class112[] field165 = new class112[256];

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
    public static volatile int field166 = -1;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "Lpa;")
    public static class90 field149;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "[Lkb;")
    public static class61[] field153;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V", line = 20)
    public static final void method55(byte arg0) {
        field157++;
        class72.field1888.method834(5875);
        class57.field1509.method834(5875);
        int var1 = -105 / ((-arg0 - 1) / 45);
        class3.field62.method834(5875);
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(IIIIIIZ)V", line = 103)
    public class9(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field152 = arg3;
        this.field156 = arg1;
        this.field160 = arg2;
        this.field155 = arg4;
        this.field148 = arg6;
        this.field147 = arg5;
        this.field154 = arg0;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V", line = 78)
    public static void method56(byte arg0) {
        field163 = null;
        field158 = null;
        field165 = null;
        field149 = null;
        field146 = null;
        if (arg0 < 2) {
            method55((byte) 42);
        }
        field150 = null;
        field153 = null;
    }
}
