import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class392 extends class255 implements class196 {

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "Ljo;")
    public class255 field5955;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "Lqo;")
    public static class141 field5964 = new class141(64);

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "[Ljava/lang/String;")
    public static String[] field5968 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
    public static int field5954;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
    public static int field5959;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "I")
    public static int field5960;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
    public static int field5962;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
    public static int field5963;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
    public static int field5965;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
    public static int field5966;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "Lmc;")
    public static class242 field5950;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(ILqa;)V")
    public static final void method2409(int arg0, class496 arg1) {
        field5961++;
        if (!(class12.field201 >= 2 || class500.field7455) || class362.field5615 != null) {
            return;
        }
        String var2;
        if (class500.field7455 && class12.field201 < 2) {
            var2 = class266.field3714 + class158.field2313.method2335((byte) -100, class288.field4292) + class509.field7572 + " ->";
        } else if (class99.field1426 && class382.field5821.method705((byte) 43, 81) && class12.field201 > 2) {
            var2 = class82.method528(-111, (class32) class96.field1395.field4498.field6803.field6803);
        } else {
            class32 var3 = (class32) class96.field1395.field4498.field6803;
            var2 = class82.method528(-79, var3);
            int[] var4 = null;
            if (class84.method550(115, var3.field485)) {
                var4 = class84.field1154.method2451(-1, (int) var3.field493).field863;
            } else if (var3.field498 != -1) {
                var4 = class84.field1154.method2451(-1, var3.field498).field863;
            } else if (class111.method730(var3.field485, (byte) -40)) {
                class194 var5 = class151.field2174[(int) var3.field493];
                if (var5 != null) {
                    class329 var6 = var5.field2768;
                    if (var6.field5068 != null) {
                        var6 = var6.method2125(class36.field583, false);
                    }
                    if (var6 != null) {
                        var4 = var6.field5035;
                    }
                }
            } else if (class441.method2665(var3.field485, -26)) {
                Object var7 = null;
                class130 var8;
                if (var3.field485 == 1006) {
                    var8 = class56.field755.method2031(-15, (int) var3.field493);
                } else {
                    var8 = class56.field755.method2031(-83, (int) (var3.field493 >>> 32 & 0x7FFFFFFFL));
                }
                if (var8.field1823 != null) {
                    var8 = var8.method832((byte) -128, class36.field583);
                }
                if (var8 != null) {
                    var4 = var8.field1870;
                }
            }
            if (var4 != null) {
                var2 = var2 + class156.method1011(var4, 0);
            }
        }
        if (class12.field201 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class12.field201 - 2) + class141.field2054.method2335((byte) -100, class288.field4292);
        }
        if (arg0 >= -31) {
            return;
        }
        if (class430.field6398 != null) {
            class33 var9 = class430.field6398.method2978((byte) -96, arg1);
            if (var9 == null) {
                var9 = class104.field1497;
            }
            var9.method248(class213.field2983, var2, class430.field6398.field7351, class430.field6398.field7386, class227.field3257, -1, class430.field6398.field7421, class430.field6398.field7391, class430.field6398.field7348, class55.field748, class430.field6398.field7427, class459.field6742, class459.field6743, class529.field7812, class14.field244);
            class244.method1627(class227.field3257[2], class227.field3257[1], class227.field3257[3], class227.field3257[0], (byte) -31);
        } else if (class337.field5333 != null && class393.field5983 == class23.field352) {
            int var10 = class104.field1497.method252(var2, class320.field4912 + 16, class459.field6743, 0, 16777215, class55.field748, class286.field4273 + 4, class529.field7812, class213.field2983, -111);
            class244.method1627(class472.field6901.method45(var2, (byte) -126) + var10, class320.field4912, 16, class286.field4273 + 4, (byte) -31);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILqa;B)Lc;")
    public final class201 method53(int arg0, class496 arg1, byte arg2) {
        field5951++;
        int var4 = 2 / ((arg2 + 62) / 39);
        return null;
    }

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)I")
    public final int method509(int arg0) {
        field5954++;
        if (arg0 != -4) {
            this.method51(null, 63);
        }
        return 0;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(B)V")
    public final void method59(byte arg0) {
        field5966++;
        int var2 = 20 / ((27 - arg0) / 63);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILqa;)V")
    public final void method67(int arg0, class496 arg1) {
        field5949++;
        int var3 = 59 / ((59 - arg0) / 60);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIB)I")
    public static final int method2410(int arg0, int arg1, byte arg2) {
        if (arg2 != 6) {
            field5968 = null;
        }
        field5963++;
        return arg0 == 4 || arg0 == 5 ? class510.field7587[arg1 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)I")
    public final int method66(int arg0) {
        field5960++;
        if (arg0 != -7234) {
            field5964 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IBLns;I)Lse;")
    public static final class4 method2411(int arg0, byte arg1, class438 arg2, int arg3) {
        field5953++;
        byte[] var4 = arg2.method2650(arg3, -105, arg0);
        if (arg1 >= -65) {
            return null;
        } else if (var4 == null) {
            return null;
        } else {
            return new class4(var4);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIILqa;)Z")
    public final boolean method56(int arg0, int arg1, int arg2, class496 arg3) {
        field5958++;
        if (arg1 != 3) {
            field5950 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILpi;)V")
    public static final void method2412(int arg0, class231 arg1) {
        if (arg0 != 1006) {
            field5968 = null;
        }
        arg1.field3288 = null;
        field5959++;
        if (class35.field573 < 20) {
            class458.field6721.method2353(arg1, -9798);
            class35.field573++;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)Z")
    public final boolean method60(byte arg0) {
        field5952++;
        if (arg0 > -108) {
            method2411(-86, (byte) 21, null, 101);
        }
        return false;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(IIIIILjo;)V")
    public class392(int arg0, int arg1, int arg2, int arg3, int arg4, class255 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class434.method2604(90, arg1, arg0));
        this.field5955 = arg5;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)I")
    public final int method50(int arg0) {
        if (arg0 != 25707) {
            method2410(28, -42, (byte) 80);
        }
        field5957++;
        return 0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lqa;I)Lpj;")
    public final class507 method51(class496 arg0, int arg1) {
        field5956++;
        return arg1 == -150 ? null : null;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(BLqa;)V")
    public final void method62(byte arg0, class496 arg1) {
        field5962++;
        if (arg0 != -126) {
            this.method67(-109, null);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)I")
    public final int method63(byte arg0) {
        if (arg0 != 63) {
            field5968 = null;
        }
        field5965++;
        return 0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLqa;)V")
    public final void method55(byte arg0, class496 arg1) {
        field5967++;
        if (arg0 > -31) {
            field5950 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "(I)V")
    public static void method2413(int arg0) {
        field5968 = null;
        field5964 = null;
        if (arg0 == 20) {
            field5950 = null;
        }
    }
}
