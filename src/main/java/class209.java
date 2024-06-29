import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class209 {

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Z")
    public boolean field3129;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "Lrha;")
    public static class235 field3127 = new class235("WTQA", "office", "_qa", 2);

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "Lta;")
    public class226 field3126;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "Lta;")
    public class226 field3130;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Z")
    public boolean field3123;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V", line = 6)
    public final void method1468(byte arg0) {
        if (this.field3126 != null) {
            this.field3126.method1543(-21647);
        }
        field3125++;
        this.field3123 = false;
        int var2 = 19 / ((9 - arg0) / 56);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIII)Lqj;", line = 20)
    public static final class537 method1469(int arg0, int arg1, int arg2, int arg3) {
        field3124++;
        class537 var4 = null;
        if (arg2 == 0) {
            var4 = class476.method2729(class112.field2088, (byte) -46, class551.field7498);
            class241.field3422++;
        }
        if (arg1 == arg2) {
            var4 = class476.method2729(class178.field2811, (byte) -46, class551.field7498);
            class322.field4382++;
        }
        var4.field7295.method791(-550441944, arg0 + class400.field5510);
        var4.field7295.method790(class217.field3198 + arg3, arg1 + 65279);
        var4.field7295.method780(class789.field10821.method1531(117, 82) ? 1 : 0, true);
        class231.field3356 = arg3;
        class392.field5380 = arg0;
        class625.field8714 = false;
        class414.method2445(-8688);
        return var4;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 50)
    public static void method1470(int arg0) {
        if (arg0 != 0) {
            field3127 = null;
        }
        field3127 = null;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Z)V", line = 67)
    public class209(boolean arg0) {
        this.field3129 = arg0;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)Z", line = 76)
    public final boolean method1471(byte arg0) {
        int var2 = 108 % ((arg0 - 52) / 37);
        field3128++;
        return this.field3123 && !this.field3129;
    }
}
