import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class243 extends class172 {

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "Ljava/lang/String;")
    public String field3781;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
    public static int field3787 = 0;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "[I")
    public static int[] field3783;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)I", line = 7)
    public static final int method1832(byte arg0) {
        field3782++;
        if (arg0 != 95) {
            field3786 = -25;
        }
        if (class134.field2244) {
            return 0;
        } else if (class158.method1282(false)) {
            return class274.field4252 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZI)Lso;", line = 30)
    public static final class121 method1833(boolean arg0, int arg1) {
        field3784++;
        class121 var2 = (class121) class165.field2626.method654(112, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class115.field1766.method187(0, arg1, -1);
        class121 var4 = new class121();
        if (var3 != null) {
            var4.method1055(-1, new class25(var3));
        }
        var4.method1053((byte) -127);
        class165.field2626.method652(-90, var4, (long) arg1);
        if (!arg0) {
            method1836(103);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 57)
    public static final void method1834(String arg0, byte arg1) {
        if (arg1 < -36) {
            field3788++;
            System.out.println("Error: " + class64.method633("\n", arg0, "%0a", (byte) -125));
        }
    }

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)I", line = 70)
    public static final int method1835(int arg0) {
        if (arg0 != 29619) {
            field3787 = -106;
        }
        field3785++;
        try {
            if (class111.field1697 == 0) {
                if (class208.field3210 > class156.method1273((byte) -45) - 5000L) {
                    return 0;
                }
                class207.field3180 = class340.field5234.method2288(class23.field361, class147.field2393, 85);
                class3.field41 = class156.method1273((byte) -75);
                class111.field1697 = 1;
            }
            if ((class3.field41 + 30000L) < class156.method1273((byte) -60)) {
                return class203.method1516(1000, -22574);
            }
            if (class111.field1697 == 1) {
                if (class207.field3180.field1447 == 2) {
                    return class203.method1516(1001, -22574);
                }
                if (class207.field3180.field1447 != 1) {
                    return -1;
                }
                class188.field2950 = new class344((Socket) class207.field3180.field1446, class340.field5234);
                int var1 = 0;
                if (class339.field5220) {
                    var1 = class277.field4286;
                }
                class99.field1491.field397 = 0;
                class207.field3180 = null;
                class99.field1491.method273(0, 23);
                class99.field1491.method310(arg0 ^ 0x7382, var1);
                class188.field2950.method2426(0, -28332, class99.field1491.field448, class99.field1491.field397);
                if (class94.field1434 != null) {
                    class94.field1434.method1874(0);
                }
                if (class68.field1048 != null) {
                    class68.field1048.method1874(0);
                }
                int var2 = class188.field2950.method2423(false);
                if (class94.field1434 != null) {
                    class94.field1434.method1874(0);
                }
                if (class68.field1048 != null) {
                    class68.field1048.method1874(arg0 - 29619);
                }
                if (var2 != 0) {
                    return class203.method1516(var2, -22574);
                }
                class111.field1697 = 2;
            }
            if (class111.field1697 == 2) {
                if (class188.field2950.method2424((byte) 21) < 2) {
                    return -1;
                }
                class115.field1767 = class188.field2950.method2423(false);
                class115.field1767 <<= 0x8;
                class115.field1767 += class188.field2950.method2423(false);
                class111.field1697 = 3;
                class191.field3007 = 0;
                class362.field5741 = new byte[class115.field1767];
            }
            if (class111.field1697 != 3) {
                return -1;
            }
            int var3 = class188.field2950.method2424((byte) 21);
            if (var3 < 1) {
                return -1;
            }
            if (class115.field1767 - class191.field3007 < var3) {
                var3 = class115.field1767 - class191.field3007;
            }
            class188.field2950.method2428(var3, class362.field5741, (byte) 89, class191.field3007);
            class191.field3007 += var3;
            if (class115.field1767 > class191.field3007) {
                return -1;
            } else if (class236.method1762(class362.field5741, (byte) 29)) {
                int var4 = 0;
                class31.field484 = new class316[class108.field1627];
                for (int var5 = class76.field1120; var5 <= class168.field2671; var5++) {
                    class316 var6 = class345.method2432(var5, (byte) -25);
                    if (var6 != null) {
                        class31.field484[var4++] = var6;
                    }
                }
                class188.field2950.method2429(false);
                class123.field1978 = 0;
                class362.field5741 = null;
                class111.field1697 = 0;
                class188.field2950 = null;
                class208.field3210 = class156.method1273((byte) -31);
                return 0;
            } else {
                return class203.method1516(1002, -22574);
            }
        } catch (IOException var8) {
            return class203.method1516(1003, -22574);
        }
    }

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "(I)V", line = 210)
    public static void method1836(int arg0) {
        if (arg0 != -3) {
            method1833(true, -87);
        }
        field3783 = null;
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "()V", line = 223)
    public class243() {
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 225)
    public class243(String arg0, int arg1) {
        this.field3781 = arg0;
    }
}
