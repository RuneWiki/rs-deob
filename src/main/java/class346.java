import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class346 {

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Ljga;")
    private class143 field4894 = new class143();

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Ldc;")
    public static class303 field4888 = new class303(9, 0, 4, 1);

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field4893 = -1;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Ljga;")
    private class143 field4901;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "[Lf;")
    public static class257[] field4895;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V", line = 3)
    public final void method2103(byte arg0) {
        if (arg0 != -42) {
            return;
        }
        while (true) {
            class143 var2 = this.field4894.field2473;
            if (this.field4894 == var2) {
                field4896++;
                this.field4901 = null;
                return;
            }
            var2.method1113(arg0 ^ 0xFFFF800C);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 25)
    public static final String method2104(String arg0, int arg1) {
        int var2 = 86 % ((60 - arg1) / 59);
        field4900++;
        if (class627.field8926.startsWith("win")) {
            return arg0 + ".dll";
        } else if (class627.field8926.startsWith("linux")) {
            return "lib" + arg0 + ".so";
        } else if (class627.field8926.startsWith("mac")) {
            return "lib" + arg0 + ".dylib";
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)Ljga;", line = 49)
    public final class143 method2105(int arg0) {
        field4890++;
        if (arg0 != -4488) {
            return null;
        }
        class143 var2 = this.field4894.field2473;
        if (this.field4894 == var2) {
            return null;
        } else {
            var2.method1113(32730);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/Object;III)[B", line = 69)
    public static final byte[] method2106(Object arg0, int arg1, int arg2, int arg3) {
        if (arg1 > -18) {
            method2104(null, 2);
        }
        field4897++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var4 = (byte[]) arg0;
            return class327.method1949(true, var4, arg3, arg2);
        } else if (arg0 instanceof class691) {
            class691 var5 = (class691) arg0;
            return var5.method3364(arg2, arg3, 30164);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZLjga;)V", line = 102)
    public final void method2107(boolean arg0, class143 arg1) {
        if (arg1.field2471 != null) {
            arg1.method1113(32730);
        }
        field4899++;
        arg1.field2471 = this.field4894.field2471;
        arg1.field2473 = this.field4894;
        arg1.field2471.field2473 = arg1;
        if (!arg0) {
            this.method2107(true, null);
        }
        arg1.field2473.field2471 = arg1;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljga;B)V", line = 124)
    public final void method2108(class143 arg0, byte arg1) {
        if (arg0.field2471 != null) {
            arg0.method1113(arg1 ^ 0x7FE5);
        }
        field4889++;
        arg0.field2471 = this.field4894;
        arg0.field2473 = this.field4894.field2473;
        arg0.field2471.field2473 = arg0;
        if (arg1 != 63) {
            method2113((byte) 39);
        }
        arg0.field2473.field2471 = arg0;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)Ljga;", line = 142)
    public final class143 method2109(int arg0) {
        if (arg0 > -70) {
            this.method2109(88);
        }
        field4892++;
        class143 var2 = this.field4901;
        if (this.field4894 == var2) {
            this.field4901 = null;
            return null;
        } else {
            this.field4901 = var2.field2473;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)Ljga;", line = 170)
    public final class143 method2110(int arg0) {
        field4886++;
        class143 var2 = this.field4894.field2471;
        int var3 = 122 % ((48 - arg0) / 46);
        if (this.field4894 == var2) {
            return null;
        } else {
            var2.method1113(32730);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)I", line = 188)
    public final int method2111(byte arg0) {
        field4891++;
        int var2 = 0;
        class143 var3 = this.field4894.field2473;
        if (arg0 != 31) {
            return -49;
        }
        while (this.field4894 != var3) {
            var3 = var3.field2473;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)Ljga;", line = 217)
    public final class143 method2112(byte arg0) {
        field4898++;
        class143 var2 = this.field4894.field2473;
        if (this.field4894 == var2) {
            this.field4901 = null;
            return null;
        } else {
            int var3 = -6 % ((84 - arg0) / 34);
            this.field4901 = var2.field2473;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V", line = 255)
    public class346() {
        this.field4894.field2471 = this.field4894;
        this.field4894.field2473 = this.field4894;
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)V", line = 242)
    public static void method2113(byte arg0) {
        int var1 = -100 / ((-arg0 - 26) / 53);
        field4895 = null;
        field4888 = null;
    }
}
