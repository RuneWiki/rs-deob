import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class150 {

    @OriginalMember(owner = "client!em", name = "f", descriptor = "Lpk;")
    private class133 field2121;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "Lpn;")
    public static class523 field2118 = new class523("", 17);

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field2123 = 0;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "Lvu;")
    private class223 field2120;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)Lvu;", line = 5)
    public final class223 method1081(boolean arg0) {
        field2119++;
        if (!arg0) {
            return null;
        }
        class223 var2 = this.field2121.field1918.field3275;
        if (this.field2121.field1918 == var2) {
            this.field2120 = null;
            return null;
        } else {
            this.field2120 = var2.field3275;
            return var2;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)Lvu;", line = 25)
    public final class223 method1082(byte arg0) {
        if (arg0 <= 39) {
            method1084(-123);
        }
        field2125++;
        class223 var2 = this.field2120;
        if (this.field2121.field1918 == var2) {
            this.field2120 = null;
            return null;
        } else {
            this.field2120 = var2.field3275;
            return var2;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IBI)Z", line = 49)
    public static final boolean method1083(int arg0, byte arg1, int arg2) {
        int var3 = -30 / ((arg1 - 46) / 60);
        field2117++;
        return (arg0 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)Lhp;", line = 62)
    public static final class215 method1084(int arg0) {
        if (arg0 != 0) {
            method1086(-51);
        }
        field2124++;
        class215 var1 = (class215) class334.field4636.method537((byte) 87);
        if (var1 != null) {
            var1.method1525((byte) -78);
            var1.method2307((byte) 121);
            return var1;
        }
        class215 var2;
        do {
            var2 = (class215) class526.field7730.method537((byte) 87);
            if (var2 == null) {
                return null;
            }
            if (var2.method1472(arg0 - 1162) > class437.method2644(-128)) {
                return null;
            }
            var2.method1525((byte) -48);
            var2.method2307((byte) -114);
        } while ((var2.field5561 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lpk;I)V", line = 102)
    public final void method1085(class133 arg0, int arg1) {
        if (arg1 < -88) {
            field2122++;
            this.field2121 = arg0;
        }
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V", line = 118)
    public static void method1086(int arg0) {
        if (arg0 != 17) {
            method1083(86, (byte) -27, 100);
        }
        field2118 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(III)V", line = 133)
    public static final void method1087(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field2123 = 37;
        }
        field2116++;
        class186.field2597++;
        class32.method258(-97, class225.field3299);
        class472.field6970.method592((byte) -99, arg2);
        class472.field6970.method618(arg0, (byte) 94);
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V", line = 152)
    public class150() {
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lpk;)V", line = 155)
    public class150(class133 arg0) {
        this.field2121 = arg0;
    }
}
