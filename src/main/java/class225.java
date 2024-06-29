import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class225 extends class137 {

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    public static int field4072 = 0;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "Lhh;")
    public static class163 field4074 = class137.method1065("mapfunction", 17);

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "Lhh;")
    public static class163 field4080 = class137.method1065("Hierhin gehen", 17);

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
    public static int field4077 = -1;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public int field4071;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    public int field4075;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
    public int field4078;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
    public int field4083;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
    public int field4084;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "Lhh;")
    public class163 field4082;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "Lqh;")
    public class69 field4076;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "Lqh;")
    public class69 field4081;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "Lfb;")
    public static class80 field4085;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "Z")
    public boolean field4086;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "[Ljava/lang/Object;")
    public Object[] field4079;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lsh;I)V")
    public static final void method1579(class202 arg0, int arg1) {
        if (arg0.field3642 == 0) {
            arg0.field3654 = 1024;
        }
        field4073++;
        arg0.field3640 = 0;
        int var2 = arg0.field3639 - class227.field4092;
        if (~arg0.field3642 == arg1) {
            arg0.field3654 = 1536;
        }
        if (arg0.field3642 == 2) {
            arg0.field3654 = 0;
        }
        int var3 = arg0.field3672 * 128 + arg0.field3645 * 64;
        arg0.field3615 += (var3 - arg0.field3615) / var2;
        if (arg0.field3642 == 3) {
            arg0.field3654 = 512;
        }
        int var4 = arg0.field3662 * 128 + arg0.field3645 * 64;
        arg0.field3633 += (var4 - arg0.field3633) / var2;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V")
    public static void method1580(boolean arg0) {
        field4074 = null;
        field4085 = null;
        if (!arg0) {
            field4072 = 5;
        }
        field4080 = null;
    }
}
