import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class315 {

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "Lhs;")
    public class329 field4247 = new class329();

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "Lea;")
    public static class547 field4248 = new class547(110, -1);

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "Lhaa;")
    public static class82 field4249 = new class82();

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "Lkba;")
    public static class108 field4251 = new class108();

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "Z")
    public static boolean field4252 = true;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "[I")
    public static int[] field4253 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "Lhs;")
    private class329 field4250;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)Lhs;")
    public final class329 method1881(int arg0) {
        if (arg0 < 18) {
            return null;
        }
        field4244++;
        class329 var2 = this.field4250;
        if (this.field4247 == var2) {
            this.field4250 = null;
            return null;
        } else {
            this.field4250 = var2.field4446;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Z)I")
    public final int method1882(boolean arg0) {
        field4241++;
        if (!arg0) {
            return 36;
        }
        int var2 = 0;
        for (class329 var3 = this.field4247.field4446; var3 != this.field4247; var3 = var3.field4446) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
    public final void method1883(byte arg0) {
        while (true) {
            class329 var2 = this.field4247.field4446;
            if (this.field4247 == var2) {
                field4240++;
                int var3 = -22 % ((arg0 + 58) / 39);
                this.field4250 = null;
                return;
            }
            var2.method1955(-74);
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
    public static final void method1884(int arg0) {
        class100.field1322 = class478.method2685(35, 2048, 0.4F, 4, true, true, 8, 8);
        field4242++;
        if (arg0 != 110) {
            method1886(-6, -105, false);
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(B)V")
    public static void method1885(byte arg0) {
        field4253 = null;
        if (arg0 != -3) {
            method1886(-15, -67, false);
        }
        field4251 = null;
        field4248 = null;
        field4249 = null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method1886(int arg0, int arg1, boolean arg2) {
        field4245++;
        if (arg2) {
            field4253 = null;
        }
        if (arg0 == 11) {
            arg0 = 10;
        }
        class685 var3 = class707.field9894.method4109(arg1, (byte) 119);
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method3876((byte) 49, arg0);
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(B)Lhs;")
    public final class329 method1887(byte arg0) {
        if (arg0 != 71) {
            return null;
        }
        field4246++;
        class329 var2 = this.field4247.field4446;
        if (this.field4247 == var2) {
            this.field4250 = null;
            return null;
        } else {
            this.field4250 = var2.field4446;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lhs;I)V")
    public final void method1888(class329 arg0, int arg1) {
        field4243++;
        if (arg0.field4449 != null) {
            arg0.method1955(-102);
        }
        arg0.field4446 = this.field4247;
        if (arg1 != 8) {
            this.method1881(51);
        }
        arg0.field4449 = this.field4247.field4449;
        arg0.field4449.field4446 = arg0;
        arg0.field4446.field4449 = arg0;
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V")
    public class315() {
        this.field4247.field4449 = this.field4247;
        this.field4247.field4446 = this.field4247;
    }
}
