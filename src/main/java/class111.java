import java.awt.Canvas;
import java.awt.event.FocusListener;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class111 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public static int field1867 = 0;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "Lve;")
    public static class255 field1873 = class87.method607(51, "underlay");

    @OriginalMember(owner = "client!el", name = "j", descriptor = "[I")
    public static int[] field1870 = new int[1000];

    @OriginalMember(owner = "client!el", name = "l", descriptor = "Lve;")
    private static class255 field1872 = class87.method607(82, "Loading sprites )2 ");

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public static int field1874 = 0;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "Lve;")
    public static class255 field1861 = field1872;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "Lve;")
    public static class255 field1877 = class87.method607(32, "gelb:");

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "[Lid;")
    public static class248[] field1879;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)Lve;", line = 20)
    public static final class255 method846(int arg0, int arg1, int arg2) {
        field1878++;
        int var3 = arg0 - arg2;
        if (var3 < -9) {
            return class191.field3056;
        } else if (var3 >= -6) {
            if (arg1 != 50) {
                field1870 = (int[]) null;
            }
            if (var3 < -3) {
                return class11.field153;
            } else if (var3 < 0) {
                return class10.field136;
            } else if (var3 > 9) {
                return class216.field3675;
            } else if (var3 > 6) {
                return class54.field842;
            } else if (var3 > 3) {
                return class159.field2682;
            } else if (var3 > 0) {
                return class231.field3834;
            } else {
                return class206.field3540;
            }
        } else {
            return class47.field725;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILrg;Lrg;Lrg;)V", line = 67)
    public static final void method847(int arg0, class88 arg1, class88 arg2, class88 arg3) {
        field1863++;
        class125.field2083 = arg3;
        if (arg0 != 20674) {
            method847(72, (class88) null, (class88) null, (class88) null);
        }
        class165.field2782 = arg2;
        class120.field2003 = arg1;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IILta;I)V", line = 80)
    public static final void method848(int arg0, int arg1, class186 arg2, int arg3) {
        if (arg2.field5166 == arg0 && arg0 != -1) {
            class271 var4 = class181.method1269(110, arg0);
            int var5 = var4.field4674;
            if (var5 == 1) {
                arg2.field5123 = 0;
                arg2.field5116 = arg3;
                arg2.field5177 = 0;
                arg2.field5135 = 0;
                class232.method1609(false, arg2.field5130, arg2.field5123, var4, arg2.field5173, 26694);
            }
            if (var5 == 2) {
                arg2.field5135 = 0;
            }
        } else if (arg0 == -1 || arg2.field5166 == -1 || class181.method1269(84, arg0).field4651 >= class181.method1269(117, arg2.field5166).field4651) {
            arg2.field5123 = 0;
            arg2.field5177 = 0;
            arg2.field5124 = arg2.field5127;
            arg2.field5116 = arg3;
            arg2.field5135 = 0;
            arg2.field5166 = arg0;
            if (arg2.field5166 != -1) {
                class232.method1609(false, arg2.field5130, arg2.field5123, class181.method1269(107, arg2.field5166), arg2.field5173, 26694);
            }
        }
        if (arg1 < 14) {
            method850(68);
        }
        field1864++;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZB)V", line = 173)
    public static final void method849(boolean arg0, byte arg1) {
        class118.method885(true);
        field1875++;
        if (class18.field281 != 30 && class18.field281 != 25) {
            return;
        }
        if (arg1 <= 61) {
            method847(70, (class88) null, (class88) null, (class88) null);
        }
        class16.field235++;
        if (class16.field235 < 50 && !arg0) {
            return;
        }
        class16.field235 = 0;
        if (!class23.field350 && client.field4041 != null) {
            class291.field5006++;
            class255.field4318.method1523(22260, 130);
            try {
                client.field4041.method1653(0, class255.field4318.field1066, (byte) -128, class255.field4318.field1068);
                class255.field4318.field1068 = 0;
            } catch (IOException var3) {
                class23.field350 = true;
            }
        }
        class118.method885(true);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V", line = 224)
    public static final void method850(int arg0) {
        if (arg0 != -3) {
            return;
        }
        class187.field3027 = null;
        field1862++;
        class131.field2167 = null;
        class298.field5098 = null;
        class132.field2173 = null;
        class282.field4849 = (byte[][]) null;
        class18.field296 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V", line = 258)
    public static void method851(boolean arg0) {
        if (arg0) {
            field1879 = (class248[]) null;
        }
        field1872 = null;
        field1877 = null;
        field1879 = null;
        field1861 = null;
        field1873 = null;
        field1870 = null;
    }
}
