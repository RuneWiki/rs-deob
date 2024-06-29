import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class124 {

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public int field2057;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public int field2048;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public int field2051;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public int field2054;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field2055 = 0;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "Lmh;")
    public static class62 field2056 = class201.method1405(true, " weitere Optionen");

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "Lga;")
    public static class147 field2049;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "[I")
    public static int[] field2053;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V", line = 16)
    public static void method941(byte arg0) {
        field2049 = null;
        field2056 = null;
        field2053 = null;
        if (arg0 != -84) {
            field2055 = 115;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IILna;I)V", line = 28)
    public static final void method942(int arg0, int arg1, class153 arg2, int arg3) {
        if (arg2.field3836 == arg3 && arg3 != -1) {
            class96 var4 = class151.method1085(arg3, (byte) 98);
            int var5 = var4.field1571;
            if (var5 == 1) {
                arg2.field3849 = 0;
                arg2.field3872 = 0;
                arg2.field3843 = arg1;
                arg2.field3826 = 0;
                class113.method881(var4, arg2.field3821, arg2.field3814, class268.field4551 == arg2, (byte) -42, arg2.field3872);
            }
            if (var5 == 2) {
                arg2.field3826 = 0;
            }
        } else if (arg3 == -1 || arg2.field3836 == -1 || class151.method1085(arg3, (byte) 99).field1562 >= class151.method1085(arg2.field3836, (byte) 119).field1562) {
            arg2.field3843 = arg1;
            arg2.field3836 = arg3;
            arg2.field3826 = 0;
            arg2.field3872 = 0;
            arg2.field3824 = arg2.field3808;
            arg2.field3849 = 0;
            if (arg2.field3836 != -1) {
                class113.method881(class151.method1085(arg2.field3836, (byte) 114), arg2.field3821, arg2.field3814, class268.field4551 == arg2, (byte) -85, arg2.field3872);
            }
        }
        field2052++;
        if (arg0 <= 70) {
            field2056 = (class62) null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIZ)I", line = 79)
    public static final int method943(int arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg2 & 0x3;
        field2058++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg1;
        } else {
            if (arg3) {
                method941((byte) 56);
            }
            return var4 == 2 ? 7 - arg0 : -arg1 + 7;
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V", line = 134)
    public class124() {
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lmd;)V", line = 136)
    public class124(class124 arg0) {
        this.field2057 = arg0.field2057;
        this.field2048 = arg0.field2048;
        this.field2051 = arg0.field2051;
        this.field2054 = arg0.field2054;
    }
}
