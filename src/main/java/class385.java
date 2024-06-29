import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class385 {

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "Ljava/lang/String;")
    private String field5599 = "null";

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "Ljava/lang/String;")
    public static String field5594 = null;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "Z")
    public static boolean field5604 = false;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "Z")
    public static boolean field5605 = false;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "C")
    public char field5587;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "C")
    public char field5595;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    private int field5598;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    private int field5601;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "Ltca;")
    public class184 field5593;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "Ltca;")
    private class184 field5597;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    private final void method2390(byte arg0) {
        field5590++;
        this.field5597 = new class184(this.field5593.method1250(true));
        class445 var2 = (class445) this.field5593.method1249((byte) -103);
        if (arg0 < 89) {
            field5604 = false;
        }
        while (var2 != null) {
            class445 var3 = new class445((int) var2.field2146);
            this.field5597.method1247(4070, (long) var2.field6408, var3);
            var2 = (class445) this.field5593.method1246(true);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)I")
    public static final int method2391(int arg0, byte arg1) {
        field5586++;
        return arg1 >= -34 ? -119 : arg0 >>> 7;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static void method2392(int arg0) {
        field5594 = null;
        if (arg0 != 0) {
            method2392(84);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)I")
    public final int method2393(int arg0, int arg1) {
        if (arg1 >= -91) {
            return 9;
        }
        field5591++;
        if (this.field5593 == null) {
            return this.field5598;
        } else {
            class445 var3 = (class445) this.field5593.method1248(126, (long) arg0);
            return var3 == null ? this.field5598 : var3.field6408;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method2394(int arg0, String arg1) {
        field5589++;
        if (this.field5593 == null) {
            return false;
        }
        if (this.field5597 == null) {
            this.method2397((byte) 123);
        }
        for (class660 var3 = (class660) this.field5597.method1248(100, class135.method946(arg1, arg0 ^ 0xC740C4CF)); var3 != null; var3 = (class660) this.field5597.method1243(127)) {
            if (var3.field8888.equals(arg1)) {
                return true;
            }
        }
        return arg0 != -952056665;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(II)Z")
    public final boolean method2395(int arg0, int arg1) {
        field5602++;
        if (this.field5593 == null) {
            return false;
        }
        if (this.field5597 == null) {
            this.method2390((byte) 91);
        }
        if (arg1 != -17150) {
            method2392(-42);
        }
        class445 var3 = (class445) this.field5597.method1248(104, (long) arg0);
        return var3 != null;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(II)Ljava/lang/String;")
    public final String method2396(int arg0, int arg1) {
        field5600++;
        if (this.field5593 == null) {
            return this.field5599;
        }
        class553 var3 = (class553) this.field5593.method1248(122, (long) arg0);
        if (arg1 != 27180) {
            this.method2393(-5, -25);
        }
        return var3 == null ? this.field5599 : var3.field7630;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
    private final void method2397(byte arg0) {
        int var2 = -49 % ((57 - arg0) / 34);
        this.field5597 = new class184(this.field5593.method1250(true));
        field5588++;
        for (class553 var3 = (class553) this.field5593.method1249((byte) -101); var3 != null; var3 = (class553) this.field5593.method1246(true)) {
            class660 var4 = new class660(var3.field7630, (int) var3.field2146);
            this.field5597.method1247(4070, class135.method946(var3.field7630, -33), var4);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ldt;II)V")
    private final void method2398(class254 arg0, int arg1, int arg2) {
        if (arg2 != 5) {
            this.method2397((byte) -125);
        }
        if (arg1 == 1) {
            this.field5595 = class207.method1357(true, arg0.method1737(true));
        } else if (arg1 == 2) {
            this.field5587 = class207.method1357(true, arg0.method1737(true));
        } else if (arg1 == 3) {
            this.field5599 = arg0.method1699(-94);
        } else if (arg1 == 4) {
            this.field5598 = arg0.method1672(arg2 ^ 0xFFFFBF79);
        } else if (arg1 == 5 || arg1 == 6) {
            this.field5601 = arg0.method1728((byte) 75);
            this.field5593 = new class184(class8.method45(23714, this.field5601));
            for (int var4 = 0; var4 < this.field5601; var4++) {
                int var5 = arg0.method1672(-16516);
                class159 var6;
                if (arg1 == 5) {
                    var6 = new class553(arg0.method1699(-72));
                } else {
                    var6 = new class445(arg0.method1672(-16516));
                }
                this.field5593.method1247(arg2 ^ 0xFE3, (long) var5, var6);
            }
        }
        field5592++;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
    public static final void method2399(int arg0) {
        field5603++;
        if (arg0 != 5 || !class191.field2476) {
            return;
        }
        while (true) {
            while (class193.field2511 < class310.field4388.length) {
                class154 var1 = class310.field4388[class193.field2511];
                if (var1 != null && var1.field2084 == -1) {
                    if (class200.field2600 == null) {
                        class200.field2600 = class773.field10621.method1529(var1.field2085, false);
                    }
                    int var2 = class200.field2600.field9211;
                    if (var2 == -1) {
                        return;
                    }
                    class193.field2511++;
                    class200.field2600 = null;
                    var1.field2084 = var2;
                } else {
                    class193.field2511++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ldt;B)V")
    public final void method2400(class254 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1731((byte) 64);
            if (var3 == 0) {
                if (arg1 != 115) {
                    return;
                }
                field5596++;
                return;
            }
            this.method2398(arg0, var3, 5);
        }
    }
}
