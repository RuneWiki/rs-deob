import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class431 {

    @OriginalMember(owner = "client!wba", name = "l", descriptor = "Luf;")
    private class380 field5800 = new class380(64);

    @OriginalMember(owner = "client!wba", name = "p", descriptor = "Luf;")
    public class380 field5804 = new class380(2);

    @OriginalMember(owner = "client!wba", name = "i", descriptor = "Lga;")
    private class332 field5797;

    @OriginalMember(owner = "client!wba", name = "f", descriptor = "Lga;")
    public class332 field5794;

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "I")
    public static int field5790 = -1;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "I")
    public static int field5789 = 104;

    @OriginalMember(owner = "client!wba", name = "o", descriptor = "[I")
    public static int[] field5803 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!wba", name = "g", descriptor = "Ltt;")
    public static class338 field5795 = new class338(60, 2);

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!wba", name = "e", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!wba", name = "h", descriptor = "I")
    public static int field5796;

    @OriginalMember(owner = "client!wba", name = "j", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!wba", name = "k", descriptor = "I")
    public static int field5799;

    @OriginalMember(owner = "client!wba", name = "m", descriptor = "I")
    public static int field5801;

    @OriginalMember(owner = "client!wba", name = "n", descriptor = "I")
    public static int field5802;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)V", line = 4)
    public final void method2427(int arg0) {
        class380 var2 = this.field5800;
        synchronized (this.field5800) {
            this.field5800.method2172(arg0 ^ 0xFFFFC328);
        }
        field5796++;
        class380 var3 = this.field5804;
        synchronized (this.field5804) {
            this.field5804.method2172(-15112);
        }
        if (arg0 != 2000) {
            this.field5797 = null;
        }
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(I)V", line = 26)
    public static final void method2428(int arg0) {
        field5798++;
        if (class589.field8123 == 0) {
            return;
        }
        try {
            if (++class329.field4423 > arg0) {
                if (class163.field2346 != null) {
                    class163.field2346.method1164(69);
                    class163.field2346 = null;
                }
                if (class50.field585 >= 2) {
                    class279.field3685 = -5;
                    class589.field8123 = 0;
                    return;
                }
                class324.field4369.method1694(5);
                class589.field8123 = 1;
                class50.field585++;
                class329.field4423 = 0;
            }
            if (class589.field8123 == 1) {
                class242.field3186 = class324.field4369.method1689(-10520, class312.field4206);
                class589.field8123 = 2;
            }
            if (class589.field8123 == 2) {
                if (class242.field3186.field9420 == 2) {
                    throw new IOException();
                }
                if (class242.field3186.field9420 != 1) {
                    return;
                }
                class163.field2346 = class485.method2787(112, 7500, (Socket) class242.field3186.field9421);
                class242.field3186 = null;
                class493.method2814(arg0 ^ 0xFFFF8E73);
                class589.field8123 = 4;
            }
            if (class589.field8123 == 4) {
                if (!class163.field2346.method1163(arg0 - 2123, 1)) {
                    return;
                }
                class163.field2346.method1160((byte) -100, class289.field3807.field2199, 0, 1);
                int var1 = class289.field3807.field2199[0] & 0xFF;
                if (var1 != 21) {
                    class589.field8123 = 0;
                    class279.field3685 = var1;
                    class163.field2346.method1164(99);
                    class163.field2346 = null;
                    return;
                }
                class589.field8123 = 5;
            }
            if (class589.field8123 == 5) {
                if (!class163.field2346.method1163(-125, 1)) {
                    return;
                }
                class163.field2346.method1160((byte) -44, class289.field3807.field2199, 0, 1);
                class389.field5223 = new String[class289.field3807.field2199[0] & 0xFF];
                class589.field8123 = 6;
            }
            if (class589.field8123 == 6 && class163.field2346.method1163(94, class389.field5223.length * 8)) {
                class289.field3807.field2219 = 0;
                class163.field2346.method1160((byte) -54, class289.field3807.field2199, 0, class389.field5223.length * 8);
                for (int var2 = 0; var2 < class389.field5223.length; var2++) {
                    class389.field5223[var2] = class339.method1979(class50.method268(arg0, 2000), class289.field3807.method953(true));
                }
                class589.field8123 = 0;
                class279.field3685 = 21;
                class163.field2346.method1164(110);
                class163.field2346 = null;
            }
        } catch (IOException var3) {
            if (class163.field2346 != null) {
                class163.field2346.method1164(126);
                class163.field2346 = null;
            }
            if (class50.field585 >= 2) {
                class279.field3685 = -4;
                class589.field8123 = 0;
            } else {
                class324.field4369.method1694(5);
                class329.field4423 = 0;
                class589.field8123 = 1;
                class50.field585++;
            }
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)V", line = 177)
    public final void method2429(byte arg0) {
        class380 var2 = this.field5800;
        synchronized (this.field5800) {
            this.field5800.method2168((byte) -108);
        }
        field5792++;
        class380 var3 = this.field5804;
        synchronized (this.field5804) {
            this.field5804.method2168((byte) -84);
        }
        int var4 = 34 % ((62 - arg0) / 50);
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(II)V", line = 193)
    public final void method2430(int arg0, int arg1) {
        field5802++;
        class380 var3 = this.field5800;
        synchronized (this.field5800) {
            this.field5800.method2179(false, arg0);
        }
        class380 var4 = this.field5804;
        synchronized (this.field5804) {
            this.field5804.method2179(false, arg0);
            if (arg1 < 93) {
                this.method2430(90, 70);
            }
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Z)V", line = 213)
    public static void method2431(boolean arg0) {
        if (!arg0) {
            method2428(-54);
        }
        field5795 = null;
        field5803 = null;
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(II)Lim;", line = 226)
    public final class382 method2432(int arg0, int arg1) {
        field5801++;
        class380 var3 = this.field5800;
        class382 var4;
        synchronized (this.field5800) {
            var4 = (class382) this.field5800.method2176(-125, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        } else if (arg0 == 1) {
            class332 var5 = this.field5797;
            byte[] var6;
            synchronized (this.field5797) {
                var6 = this.field5797.method1938(arg1, 33, -17);
            }
            class382 var7 = new class382();
            var7.field5045 = this;
            if (var6 != null) {
                var7.method2186(new class157(var6), -126);
            }
            class380 var8 = this.field5800;
            synchronized (this.field5800) {
                this.field5800.method2174(var7, (long) arg1, (byte) 125);
                return var7;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Ljava/lang/String;IZLjava/lang/String;I)V", line = 257)
    public static final void method2433(String arg0, int arg1, boolean arg2, String arg3, int arg4) {
        class293.method1738(arg3, arg2, (byte) 91, true, arg4, arg0, -1);
        int var5 = -15 % ((-arg1 - 65) / 61);
        field5799++;
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lnq;ILga;Lga;)V", line = 280)
    public class431(class650 arg0, int arg1, class332 arg2, class332 arg3) {
        this.field5797 = arg2;
        this.field5794 = arg3;
        this.field5797.method1939(0, 33);
    }
}
