import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class531 {

    @OriginalMember(owner = "client!vv", name = "g", descriptor = "Lfs;")
    private class287 field7812 = new class287();

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "I")
    public static int field7806;

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "I")
    public static int field7807;

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "I")
    public static int field7808;

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "I")
    public static int field7809;

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "I")
    public static int field7810;

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "I")
    public static int field7811;

    @OriginalMember(owner = "client!vv", name = "h", descriptor = "I")
    public static int field7813;

    @OriginalMember(owner = "client!vv", name = "i", descriptor = "Lfs;")
    private class287 field7814;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Z)I")
    public final int method3147(boolean arg0) {
        if (arg0) {
            this.method3149(105);
        }
        field7809++;
        int var2 = 0;
        class287 var3 = this.field7812.field3888;
        while (this.field7812 != var3) {
            var3 = var3.field3888;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(Z)Lfs;")
    public final class287 method3148(boolean arg0) {
        field7811++;
        class287 var2 = this.field7812.field3888;
        if (!arg0) {
            this.field7812 = null;
        }
        if (this.field7812 == var2) {
            return null;
        } else {
            var2.method1645(83);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V")
    public final void method3149(int arg0) {
        while (true) {
            class287 var2 = this.field7812.field3888;
            if (this.field7812 == var2) {
                field7810++;
                this.field7814 = null;
                if (arg0 != 65280) {
                    this.field7812 = null;
                    return;
                }
                return;
            }
            var2.method1645(arg0 ^ 0xFFFF0093);
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(ILfs;)V")
    public final void method3150(int arg0, class287 arg1) {
        if (arg0 != 16711680) {
            return;
        }
        field7806++;
        if (arg1.field3890 != null) {
            arg1.method1645(-104);
        }
        arg1.field3888 = this.field7812;
        arg1.field3890 = this.field7812.field3890;
        arg1.field3890.field3888 = arg1;
        arg1.field3888.field3890 = arg1;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(IIII)I")
    public static final int method3151(int arg0, int arg1, int arg2, int arg3) {
        field7808++;
        int var4 = ((arg3 & 0xFF00) * arg0 & 0xFF0000 | (arg3 & 0xFF00FF) * arg0 & 0xFF00FF00) >>> 8;
        if (arg1 != 196579528) {
            method3151(-56, -82, -72, 60);
        }
        int var5 = 255 - arg0;
        return (((arg2 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg2 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "(Z)Lfs;")
    public final class287 method3152(boolean arg0) {
        field7813++;
        if (arg0) {
            method3151(44, 74, -125, 36);
        }
        class287 var2 = this.field7812.field3888;
        if (this.field7812 == var2) {
            this.field7814 = null;
            return null;
        } else {
            this.field7814 = var2.field3888;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)Lfs;")
    public final class287 method3153(byte arg0) {
        field7807++;
        class287 var2 = this.field7814;
        if (this.field7812 == var2) {
            this.field7814 = null;
            return null;
        } else {
            int var3 = 125 % ((-arg0 - 1) / 38);
            this.field7814 = var2.field3888;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "()V")
    public class531() {
        this.field7812.field3888 = this.field7812;
        this.field7812.field3890 = this.field7812;
    }
}
