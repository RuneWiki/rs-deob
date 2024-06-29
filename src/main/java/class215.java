import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class215 extends class333 {

    @OriginalMember(owner = "client!tw", name = "s", descriptor = "I")
    public int field2822;

    @OriginalMember(owner = "client!tw", name = "r", descriptor = "I")
    public int field2821;

    @OriginalMember(owner = "client!tw", name = "q", descriptor = "Z")
    public static boolean field2820 = true;

    @OriginalMember(owner = "client!tw", name = "p", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!tw", name = "t", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!tw", name = "u", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIII)V")
    public static final void method1390(int arg0, int arg1, int arg2, int arg3) {
        field2824++;
        int var4 = arg2 + class120.field1625;
        int var5 = class259.field3849 + arg1;
        if (class443.field6387 == null || arg2 < 0 || arg1 < 0 || class102.field1467 <= arg2 || arg1 >= class393.field5663 || arg3 == ~class125.field1721.field5155.method591(43) && class625.field8475.field2813 != arg0) {
            return;
        }
        long var6 = (long) (var4 | var5 << 14 | arg0 << 28);
        class769 var8 = (class769) class523.field7265.method1248(arg3 + 94, var6);
        if (var8 == null) {
            class506.method2945(arg0, arg2, arg1);
            return;
        }
        class309 var9 = (class309) var8.field10592.method679((byte) -86);
        if (var9 == null) {
            class506.method2945(arg0, arg2, arg1);
            return;
        }
        class145 var10 = (class145) class506.method2945(arg0, arg2, arg1);
        if (var10 == null) {
            var10 = new class145(arg2 << 9, class645.field8694[arg0].method1898(arg1, arg2, (byte) -24), arg1 << 9, arg0, arg0);
        } else {
            var10.field1955 = var10.field1963 = -1;
        }
        var10.field1950 = var9.field4380;
        var10.field1949 = var9.field4386;
        label57: while (true) {
            class309 var11 = (class309) var8.field10592.method681(-117);
            if (var11 == null) {
                break;
            }
            if (var10.field1950 != var11.field4380) {
                var10.field1961 = var11.field4386;
                var10.field1955 = var11.field4380;
                while (true) {
                    class309 var12 = (class309) var8.field10592.method681(-79);
                    if (var12 == null) {
                        break label57;
                    }
                    if (var10.field1950 != var12.field4380 && var10.field1955 != var12.field4380) {
                        var10.field1963 = var12.field4380;
                        var10.field1968 = var12.field4386;
                    }
                }
            }
        }
        int var13 = class778.method4273((arg1 << 9) + 256, (byte) -36, (arg2 << 9) + 256, arg0);
        var10.field2813 = (byte) arg0;
        var10.field2802 = arg2 << 9;
        var10.field1962 = 0;
        var10.field2815 = var13;
        var10.field2810 = arg1 << 9;
        var10.field2809 = (byte) arg0;
        if (class49.method310(arg2, arg1, (byte) 43)) {
            var10.field2809++;
        }
        class347.method2219(arg0, arg2, arg1, var13, var10);
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Log;Lgi;IIIIIIIIII)V")
    public class215(class673 arg0, class705 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field2822 = arg10;
        this.field2821 = arg11;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(ZJ)V")
    public static final void method1391(boolean arg0, long arg1) {
        field2823++;
        if (!arg0) {
            class79.field1085.setTime(new Date(arg1));
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(B)Leo;")
    public final class313 method576(byte arg0) {
        if (arg0 != 41) {
            this.method576((byte) 38);
        }
        field2819++;
        return class374.field5471;
    }
}
