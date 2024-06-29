import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class489 extends class139 {

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    public int field7092 = -1;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public int field7096 = -1;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "Lkfa;")
    public static class549 field7091 = new class549(78, 8);

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "Lpr;")
    public static class407 field7098 = new class407(113, 4);

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public int field7088;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public static int field7089;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    public int field7090;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public int field7093;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    public static int field7094;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    public static int field7095;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "I")
    public int field7099;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
    public static int field7100;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
    public static int field7101;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "Lxa;")
    public static class458 field7097;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V", line = 12)
    public static void method2826(int arg0) {
        field7097 = null;
        field7098 = null;
        if (arg0 != -1) {
            field7098 = null;
        }
        field7091 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)Lht;", line = 32)
    public static final class530 method2827(boolean arg0) {
        ++field7089;
        class530 var1 = (class530) class79.field814.method2769(0);
        if (var1 != null) {
            var1.method1519((byte) 121);
            var1.method1968((byte) -98);
            return var1;
        } else if (arg0) {
            return null;
        } else {
            class530 var2;
            do {
                var2 = (class530) class461.field6409.method2769(0);
                if (var2 == null) {
                    return null;
                }
                if (~var2.method3026((byte) -25) < ~class641.method3604(false)) {
                    return null;
                }
                var2.method1519((byte) 121);
                var2.method1968((byte) -119);
            } while ((Long.MIN_VALUE & var2.field4676) == 0L);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(Loa;I)Lok;", line = 74)
    public final class231 method442(class635 arg0, int arg1) {
        ++field7101;
        class389 var3 = arg0.method297();
        var3.method228(super.field1595, super.field1596 + -10, super.field1589);
        class231 var4 = class526.method2993(3, 32671);
        if (this.field7092 != -1) {
            class350 var5 = class472.field6588.method1903(this.field7092, (byte) 109).method3064(0, this.field7099, 2048, (class576) null, 128, arg0, (class223) null, -1, 0);
            if (var5 != null) {
                var5.method904(var3, var4.field2947[2], 0);
            }
        }
        if (this.field7096 != -1) {
            class350 var6 = class472.field6588.method1903(this.field7096, (byte) 34).method3064(0, this.field7093, 2048, (class576) null, 128, arg0, (class223) null, -1, 0);
            if (var6 != null) {
                var6.method904(var3, var4.field2947[1], 0);
            }
        }
        class350 var7 = class472.field6588.method1903(this.field7088, (byte) 16).method3064(0, this.field7090, 2048, (class576) null, 128, arg0, (class223) null, -1, arg1);
        if (var7 != null) {
            var7.method904(var3, var4.field2947[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(Loa;I)V", line = 113)
    public final void method451(class635 arg0, int arg1) {
        ++field7100;
        if (arg1 != 31055) {
            this.field7096 = -42;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILoa;)Lgr;", line = 123)
    public final class396 method450(int arg0, class635 arg1) {
        int var3 = 117 % ((47 - arg0) / 34);
        ++field7095;
        return null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IILoa;I)Z", line = 137)
    public final boolean method457(int arg0, int arg1, class635 arg2, int arg3) {
        ++field7094;
        class389 var5 = arg2.method297();
        var5.method228(super.field1595, super.field1596, super.field1589);
        class350 var6 = class472.field6588.method1903(this.field7088, (byte) 38).method3064(0, this.field7090, 131072, (class576) null, 128, arg2, (class223) null, -1, 0);
        if (var6 != null && var6.method910(arg3, arg0, var5, true)) {
            return true;
        } else {
            if (arg1 != 1) {
                this.method450(77, (class635) null);
            }
            if (~this.field7096 != 0) {
                class350 var7 = class472.field6588.method1903(this.field7096, (byte) -116).method3064(0, this.field7093, 131072, (class576) null, 128, arg2, (class223) null, -1, 0);
                if (var7 != null && var7.method910(arg3, arg0, var5, true)) {
                    return true;
                }
            }
            if (~this.field7092 != 0) {
                class350 var8 = class472.field6588.method1903(this.field7092, (byte) -114).method3064(0, this.field7099, 131072, (class576) null, 128, arg2, (class223) null, -1, 0);
                if (var8 != null && var8.method910(arg3, arg0, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }
}
