import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class27 {

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    private int field344;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field343 = -1;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLoa;)V")
    public static final void method124(byte arg0, class638 arg1) {
        class229.field3276 = class353.method2095(true, (byte) 44, class459.field6499, arg1);
        field348++;
        class424.field5975 = class460.method2649(class459.field6499, arg1, (byte) 67);
        class668.field9418 = class353.method2095(true, (byte) 53, class97.field1322, arg1);
        class226.field3256 = class460.method2649(class97.field1322, arg1, (byte) -79);
        class548.field7419 = class353.method2095(true, (byte) 122, class235.field3396, arg1);
        class432.field6119 = class460.method2649(class235.field3396, arg1, (byte) -109);
        if (arg0 > -117) {
            field343 = -71;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BII)Z")
    public static final boolean method125(byte arg0, int arg1, int arg2) {
        field347++;
        if (arg0 > -27) {
            field343 = -33;
        }
        return (arg2 & 0x60000) != 0 | class683.method3767(arg2, arg1, (byte) 81) || class298.method1859(arg1, 19308, arg2) || class92.method684(-1, arg2, arg1);
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(II)V")
    public class27(int arg0, int arg1) {
        this.field344 = arg0;
    }

    @OriginalMember(owner = "client!uc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field342++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI)I")
    public static final int method126(boolean arg0, int arg1) {
        field345++;
        if (!arg0) {
            return -78;
        }
        int var2 = arg1 & 0x3F;
        int var3 = (arg1 & 0xE4) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)I")
    public final int method127(int arg0) {
        if (arg0 == 15633) {
            field346++;
            return this.field344;
        } else {
            return -105;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(JILjava/lang/String;Z)V")
    public static final void method128(long arg0, int arg1, String arg2, boolean arg3) {
        field341++;
        if (arg3) {
            class208.method1374(arg1 ^ 0xFFFFCD82);
            if (class683.field9609.equals("")) {
                class17.field262 = 39;
                return;
            }
        }
        class96 var5 = new class96(576);
        var5.method746((byte) -88, 10);
        var5.method731(-2045573048, (int) (Math.random() * 65535.0D));
        var5.method725((byte) 36, arg0);
        var5.method731(-2045573048, arg3 ? class174.field2608 : class287.field3995);
        var5.method708(100, arg2);
        var5.method725((byte) 36, arg3 ? class451.field6293 : class531.field7245);
        if (arg3) {
            var5.method725((byte) 36, class482.method2727(12544, class683.field9609));
            try {
                var5.method725((byte) 36, Long.parseLong(class110.field1492));
            } catch (Exception var6) {
                class17.field262 = 39;
                return;
            }
        } else {
            var5.method741((int) (Math.random() * 9.9999999E7D), (byte) 27);
            var5.method741((int) (Math.random() * 9.9999999E7D), (byte) 27);
            var5.method741((int) (Math.random() * 9.9999999E7D), (byte) 27);
            var5.method741((int) (Math.random() * 9.9999999E7D), (byte) 27);
        }
        var5.method741((int) (Math.random() * 9.9999999E7D), (byte) 27);
        var5.method716((byte) -118, class65.field864, class496.field6827);
        class288.field4014.field1301 = 0;
        class288.field4014.method746((byte) -123, arg3 ? class599.field8322.field2617 : class599.field8319.field2617);
        if (arg1 != 19995) {
            method124((byte) 2, null);
        }
        class288.field4014.method731(arg1 - 2045593043, var5.field1301 + 28);
        class288.field4014.method731(-2045573048, 614);
        class288.field4014.method746((byte) -109, class666.field9377);
        class288.field4014.method746((byte) -116, class158.field2374.field9181);
        class496.method2776(class288.field4014, 0);
        class288.field4014.method724(var5.field1301, -16054, var5.field1316, 0);
        class179.field2650 = 0;
        class394.field5486 = 0;
        class17.field262 = -3;
        class595.field8273 = 1;
    }
}
