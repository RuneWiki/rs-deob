import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public abstract class class121 {

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "Leb;")
    public static class230 field2125 = class68.method589(0, "null");

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "[I")
    public static int[] field2132 = new int[2048];

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "Leb;")
    public static class230 field2129 = class68.method589(0, ":clan:");

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "J")
    public static long field2134 = 0L;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public int field2123;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public int field2127;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public int field2130;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIII)V")
    public static final void method948(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 6) {
            return;
        }
        field2133++;
        if (arg3 >= class78.field1404 && class42.field769 >= arg1 && arg2 >= class15.field345 && arg5 <= class259.field4587) {
            class230.method1633(arg4, arg5, arg2, arg3, arg1, (byte) 19);
        } else {
            class135.method1047(arg5, arg2, (byte) 119, arg4, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)Z")
    public final boolean method949(int arg0) {
        if (arg0 != -1) {
            this.field2127 = 32;
        }
        field2126++;
        return (this.field2130 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lfh;BLjava/lang/Object;)V")
    public static final void method950(class129 arg0, byte arg1, Object arg2) {
        if (arg1 > -33) {
            return;
        }
        field2137++;
        if (arg0.field2327 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field2327.peekEvent() != null; var3++) {
            class52.method417((byte) -115, 1L);
        }
        if (arg2 != null) {
            arg0.field2327.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public static void method951(int arg0) {
        field2132 = null;
        if (arg0 == -22820) {
            field2125 = null;
            field2129 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)Z")
    public final boolean method952(int arg0) {
        field2124++;
        int var2 = -98 % ((44 - arg0) / 50);
        return (this.field2130 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)Z")
    public final boolean method953(byte arg0) {
        if (arg0 > -115) {
            field2125 = null;
        }
        field2131++;
        return (this.field2130 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIIIIIB)V")
    public static final void method954(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        field2128++;
        int var10 = 57 % ((arg9 - 24) / 40);
        if (arg3 >= class78.field1404 && arg3 <= class42.field769 && class78.field1404 <= arg1 && arg1 <= class42.field769 && class78.field1404 <= arg5 && arg5 <= class42.field769 && arg7 >= class78.field1404 && arg7 <= class42.field769 && class15.field345 <= arg8 && class259.field4587 >= arg8 && arg6 >= class15.field345 && arg6 <= class259.field4587 && arg0 >= class15.field345 && arg0 <= class259.field4587 && class15.field345 <= arg2 && class259.field4587 >= arg2) {
            class132.method1036(arg5, arg3, arg0, arg4, arg6, arg8, arg7, false, arg2, arg1);
        } else {
            class164.method1226(arg6, arg1, 29999, arg0, arg4, arg2, arg7, arg3, arg5, arg8);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)Z")
    public final boolean method955(boolean arg0) {
        if (arg0) {
            method957((class230) null, -47);
        }
        field2122++;
        return (this.field2130 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZI)I")
    public static final int method956(boolean arg0, int arg1) {
        long var2 = class201.method1419(5);
        field2121++;
        class247 var4 = arg0 ? (class247) class138.field2464.method392(0) : (class247) class138.field2464.method390(-1);
        if (arg1 != 0) {
            return -88;
        }
        while (var4 != null) {
            if (var2 > (var4.field4383 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field4383 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field1166;
                    class99.field1838[var5] = class225.field3887[var5];
                    var4.method518(100);
                    return var5;
                }
                var4.method518(106);
            }
            var4 = (class247) class138.field2464.method390(-1);
        }
        return -1;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Leb;I)V")
    public static final void method957(class230 arg0, int arg1) {
        field2138++;
        if (class30.field545 >= 2) {
            if (arg0.method1612((byte) 15, class39.field724)) {
                class205.method1441(-94);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class227.method1565((class230) null, (byte) 101, 0, class173.method1267((byte) 59, new class230[] { class103.field1879, class37.method340(var4, (byte) -26), class183.field3217 }));
            }
            if (arg0.method1612((byte) 15, class44.field782)) {
                class133.method1039(114);
            }
            if (arg0.method1612((byte) 15, class162.field2893)) {
                class56.field1040.method1374(-1);
            }
            if (arg0.method1612((byte) 15, class246.field4372)) {
                class56.field1040.method1370(89);
            }
            if (arg0.method1612((byte) 15, class274.field4816)) {
                class155.field2771 = true;
            }
            if (arg0.method1612((byte) 15, class266.field4728)) {
                class26.method260(-11, 25);
            }
            if (arg0.method1612((byte) 15, class108.field1954)) {
                class22.field432 = true;
            }
            if (arg0.method1612((byte) 15, class240.field4130)) {
                class22.field432 = false;
            }
            if (arg0.method1612((byte) 15, class252.field4518)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class112.field2007[var5].field2085[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg0.method1603(class46.field805, 0) && class269.field4768 != 0) {
                class53.method422(1, arg0.method1619(-32, 6).method1584((byte) 82));
            }
            if (arg0.method1612((byte) 15, class218.field3757) && class269.field4768 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method1603(class167.field2945, 0)) {
                class21.field428 = arg0.method1619(-112, 12).method1628(12348).method1584((byte) -124);
                class227.method1565((class230) null, (byte) 118, 0, class173.method1267((byte) 59, new class230[] { class84.field1491, class37.method340(class21.field428, (byte) -26) }));
            }
            if (arg0.method1612((byte) 15, class142.field2553)) {
                class271.field4786 = true;
            }
        }
        class182.field3168++;
        class153.field2747.method978(57, 5);
        class153.field2747.method170((byte) 111, arg0.method1635(-25) - 1);
        if (arg1 >= -125) {
            method950((class129) null, (byte) 73, (Object) null);
        }
        class153.field2747.method197(0, arg0.method1619(-65, 2));
    }
}
