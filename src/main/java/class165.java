import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class165 {

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "Lod;")
    public class130 field3141 = new class130();

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Lsd;")
    public static class166 field3128 = class135.method935("ams", 0);

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "Lsd;")
    private static class166 field3144 = class135.method935("Create a free account", 0);

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "Lsd;")
    public static class166 field3140 = field3144;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "Lod;")
    private class130 field3145;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Lg;")
    public static class56 field3139;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public final void method1104(int arg0) {
        int var2 = 115 % ((arg0 + 44) / 35);
        field3133++;
        while (true) {
            class130 var3 = this.field3141.field2552;
            if (this.field3141 == var3) {
                return;
            }
            var3.method915(0);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILod;)V")
    public final void method1105(int arg0, class130 arg1) {
        if (arg1.field2546 != null) {
            arg1.method915(0);
        }
        if (arg0 != 1208005) {
            this.method1114(false);
        }
        arg1.field2552 = this.field3141.field2552;
        field3136++;
        arg1.field2546 = this.field3141;
        arg1.field2546.field2552 = arg1;
        arg1.field2552.field2546 = arg1;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)Lod;")
    public final class130 method1106(boolean arg0) {
        if (arg0) {
            return null;
        }
        field3135++;
        class130 var2 = this.field3145;
        if (this.field3141 == var2) {
            this.field3145 = null;
            return null;
        } else {
            this.field3145 = var2.field2546;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
    public static void method1107(int arg0) {
        field3144 = null;
        field3140 = null;
        field3128 = null;
        if (arg0 != -1250931468) {
            method1107(12);
        }
        field3139 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Z")
    public static final boolean method1108(int arg0, int arg1) {
        if (arg0 != -19531) {
            field3128 = null;
        }
        field3131++;
        return (arg1 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)Lod;")
    public final class130 method1109(byte arg0) {
        if (arg0 > -59) {
            return null;
        }
        field3138++;
        class130 var2 = this.field3141.field2552;
        if (this.field3141 == var2) {
            this.field3145 = null;
            return null;
        } else {
            this.field3145 = var2.field2552;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1110(int arg0, Component arg1) {
        if (arg0 != -1) {
            field3144 = null;
        }
        field3132++;
        Method var2 = class80.field1628;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class4.field80);
        arg1.addFocusListener(class4.field80);
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)Lod;")
    public final class130 method1111(int arg0) {
        field3129++;
        int var2 = 16 % ((-arg0 - 48) / 39);
        class130 var3 = this.field3141.field2546;
        if (this.field3141 == var3) {
            this.field3145 = null;
            return null;
        } else {
            this.field3145 = var3.field2546;
            return var3;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(ILod;)V")
    public final void method1112(int arg0, class130 arg1) {
        field3142++;
        if (arg1.field2546 != null) {
            arg1.method915(arg0 + 1250931468);
        }
        if (arg0 != -1250931468) {
            this.field3145 = null;
        }
        arg1.field2552 = this.field3141;
        arg1.field2546 = this.field3141.field2546;
        arg1.field2546.field2552 = arg1;
        arg1.field2552.field2546 = arg1;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lod;Lod;I)V")
    public final void method1113(class130 arg0, class130 arg1, int arg2) {
        field3134++;
        if (arg0.field2546 != null) {
            arg0.method915(arg2 - 1208005);
        }
        arg0.field2552 = arg1;
        arg0.field2546 = arg1.field2546;
        arg0.field2546.field2552 = arg0;
        arg0.field2552.field2546 = arg0;
        if (arg2 != 1208005) {
            this.method1105(-6, null);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(Z)Lod;")
    public final class130 method1114(boolean arg0) {
        field3137++;
        if (!arg0) {
            field3130 = 90;
        }
        class130 var2 = this.field3141.field2552;
        if (this.field3141 == var2) {
            return null;
        } else {
            var2.method915(0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)Lod;")
    public final class130 method1115(byte arg0) {
        field3143++;
        int var2 = 100 / ((arg0 + 6) / 38);
        class130 var3 = this.field3145;
        if (this.field3141 == var3) {
            this.field3145 = null;
            return null;
        } else {
            this.field3145 = var3.field2552;
            return var3;
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
    public class165() {
        this.field3141.field2546 = this.field3141;
        this.field3141.field2552 = this.field3141;
    }
}
