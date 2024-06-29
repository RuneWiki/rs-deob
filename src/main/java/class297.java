import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class297 {

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field5026 = 0;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field5029 = 0;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "Lbe;")
    public static class283 field5030 = class153.method941(11, ":tradereq:");

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field5033 = 0;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "Lbe;")
    public static class283 field5031 = class153.method941(-18, "Konfig geladen)3");

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "Lbe;")
    private static class283 field5028 = class153.method941(-28, "Loading title screen )2 ");

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "Lbe;")
    public static class283 field5032 = field5028;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "Ltf;")
    public static class242 field5036 = new class242(4);

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "Z")
    public static boolean field5037 = false;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "Lbe;")
    public static class283 field5038 = class153.method941(127, "Fallen lassen");

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public static int field5039 = 0;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V", line = 23)
    public static void method2015(byte arg0) {
        field5038 = null;
        field5031 = null;
        field5030 = null;
        field5036 = null;
        field5032 = null;
        if (arg0 != -20) {
            field5029 = -1;
        }
        field5028 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIII)V", line = 40)
    public static final void method2016(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5035++;
        if (arg4 <= 111) {
            field5026 = -62;
        }
        if (arg2 >= class269.field4551 && arg3 <= class166.field2765 && class217.field3677 <= arg1 && arg0 <= class247.field4220) {
            class26.method177(arg5, arg3, arg1, arg0, true, arg2);
        } else {
            class299.method2028(arg5, arg2, arg0, (byte) 103, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILbe;Lkg;)Lbe;", line = 76)
    public static final class283 method2017(int arg0, class283 arg1, class69 arg2) {
        if (arg0 <= 30) {
            method2015((byte) -43);
        }
        if (arg1.method1951(class34.field507, (byte) 22) != -1) {
            label66: while (true) {
                int var3 = arg1.method1951(class138.field2308, (byte) 22);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.method1951(class283.field4835, (byte) 22);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.method1951(class10.field98, (byte) 22);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.method1951(class140.field2338, (byte) 22);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.method1951(class160.field2612, (byte) 22);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.method1951(class259.field4402, (byte) 22);
                                                        if (var8 == -1) {
                                                            break label66;
                                                        }
                                                        class283 var9 = class213.field3616;
                                                        if (class270.field4561 != null) {
                                                            var9 = class58.method377(class270.field4561.field5292, 8);
                                                            try {
                                                                if (class270.field4561.field5296 != null) {
                                                                    byte[] var10 = ((String) class270.field4561.field5296).getBytes("ISO-8859-1");
                                                                    var9 = class219.method1440(159, var10.length, var10, 0);
                                                                }
                                                            } catch (UnsupportedEncodingException var12) {
                                                            }
                                                        }
                                                        arg1 = class299.method2022(new class283[] { arg1.method1936(-63, 0, var8), var9, arg1.method1914((byte) -43, var8 + 4) }, (byte) 69);
                                                    }
                                                }
                                                arg1 = class299.method2022(new class283[] { arg1.method1936(-63, 0, var7), class277.method1852(class12.method63((byte) -124, 4, arg2), false), arg1.method1914((byte) -125, var7 + 2) }, (byte) 30);
                                            }
                                        }
                                        arg1 = class299.method2022(new class283[] { arg1.method1936(-63, 0, var6), class277.method1852(class12.method63((byte) 107, 3, arg2), false), arg1.method1914((byte) -126, var6 + 2) }, (byte) 125);
                                    }
                                }
                                arg1 = class299.method2022(new class283[] { arg1.method1936(-63, 0, var5), class277.method1852(class12.method63((byte) 94, 2, arg2), false), arg1.method1914((byte) -61, var5 + 2) }, (byte) 76);
                            }
                        }
                        arg1 = class299.method2022(new class283[] { arg1.method1936(-63, 0, var4), class277.method1852(class12.method63((byte) 127, 1, arg2), false), arg1.method1914((byte) -105, var4 + 2) }, (byte) 99);
                    }
                }
                arg1 = class299.method2022(new class283[] { arg1.method1936(-63, 0, var3), class277.method1852(class12.method63((byte) -26, 0, arg2), false), arg1.method1914((byte) -65, var3 + 2) }, (byte) 35);
            }
        }
        field5025++;
        return arg1;
    }
}
