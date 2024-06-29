import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class416 {

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "I")
    public int field5690;

    @OriginalMember(owner = "client!uw", name = "f", descriptor = "Z")
    public static boolean field5695 = false;

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "I")
    public static int field5692;

    @OriginalMember(owner = "client!uw", name = "d", descriptor = "I")
    public static int field5693;

    @OriginalMember(owner = "client!uw", name = "e", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)I")
    public final int method2541(int arg0) {
        if (arg0 != -1) {
            field5695 = true;
        }
        field5693++;
        return this.field5690;
    }

    @OriginalMember(owner = "client!uw", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5691++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class416(String arg0, int arg1) {
        this.field5690 = arg1;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(B)V")
    public static final void method2542(byte arg0) {
        field5692++;
        for (int var1 = 0; var1 < 5; var1++) {
            class320.field4080[var1] = false;
        }
        class175.field2061 = class590.field8319;
        class524.field7482 = class167.field1855;
        class687.field9703 = 0;
        class649.field9278 = class152.field1670;
        class559.field7989 = class204.field2409;
        int var2 = -125 % ((arg0 + 42) / 62);
        class711.field10016 = 0;
        class357.field4583 = class27.field281;
        class242.field2882 = -1;
        class125.field1312 = -1;
        class406.field5556 = -1;
        class16.field147 = -1;
        class496.field7014 = 5;
        class676.field9581 = class392.field5398;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lpk;IILefa;ILvc;BI)V")
    public static final void method2543(class197 arg0, int arg1, int arg2, class183 arg3, int arg4, class316 arg5, byte arg6, int arg7) {
        if (arg6 > -28) {
            return;
        }
        field5694++;
        class376 var8 = new class376();
        var8.field4852 = arg7 << 9;
        var8.field4837 = arg4;
        var8.field4858 = arg1 << 9;
        if (arg5 != null) {
            var8.field4828 = arg5;
            int var10 = arg5.field4020;
            int var11 = arg5.field4050;
            if (arg2 == 1 || arg2 == 3) {
                var11 = arg5.field4020;
                var10 = arg5.field4050;
            }
            var8.field4832 = arg5.field3975 << 9;
            var8.field4851 = arg5.field4007;
            var8.field4839 = arg1 + var11 << 9;
            var8.field4829 = arg5.field4006;
            var8.field4845 = arg7 + var10 << 9;
            var8.field4842 = arg5.field3983;
            var8.field4857 = arg5.field4053;
            var8.field4847 = arg5.field4015;
            var8.field4844 = arg5.field3979;
            var8.field4841 = arg5.field4033;
            var8.field4840 = arg5.field4037;
            var8.field4838 = arg5.field4016;
            if (arg5.field4045 != null) {
                var8.field4831 = true;
                var8.method2189(122);
            }
            if (var8.field4840 != null) {
                var8.field4834 = (int) (Math.random() * (double) (var8.field4841 - var8.field4857)) + var8.field4857;
            }
            class1.field6.method1721((byte) -66, var8);
            return;
        }
        if (arg0 != null) {
            var8.field4850 = arg0;
            class326 var9 = arg0.field2293;
            if (var9.field4199 != null) {
                var8.field4831 = true;
                var9 = var9.method1939(true, class722.field10125);
            }
            if (var9 != null) {
                var8.field4845 = var9.field4227 + arg7 << 9;
                var8.field4839 = arg1 + var9.field4227 << 9;
                var8.field4847 = class147.method914(63, arg0);
                var8.field4842 = var9.field4195;
                var8.field4851 = var9.field4198;
                var8.field4844 = var9.field4205;
                var8.field4838 = var9.field4184;
                var8.field4832 = var9.field4208 << 9;
            }
            class375.field4815.method1721((byte) 115, var8);
            return;
        }
        if (arg3 == null) {
            return;
        }
        var8.field4846 = arg3;
        var8.field4845 = arg7 + arg3.method1128(-1) << 9;
        var8.field4839 = arg3.method1128(-1) + arg1 << 9;
        var8.field4847 = class183.method1131(89, arg3);
        var8.field4842 = 256;
        var8.field4838 = arg3.field2156;
        var8.field4844 = 256;
        var8.field4832 = arg3.field2185 << 9;
        var8.field4851 = arg3.field2178;
        class653.field9319.method1751(var8, 3970, (long) arg3.field7107);
        return;
    }
}
