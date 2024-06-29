import java.awt.Canvas;
import java.awt.event.FocusListener;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class197 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static volatile int field2957 = 0;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field2964 = -1;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "Z")
    public static boolean field2968 = true;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "Lkh;")
    public static class7 field2962 = new class7(5000);

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([FB)[F", line = 40)
    public static final float[] method1355(float[] arg0, byte arg1) {
        field2967++;
        int var2 = -44 / ((-arg1 - 56) / 36);
        if (arg0 == null) {
            return null;
        } else {
            float[] var3 = new float[arg0.length];
            class85.method590(arg0, 0, var3, 0, arg0.length);
            return var3;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI)Ljj;", line = 58)
    public static final class45 method1356(byte arg0, int arg1) {
        field2966++;
        class45 var2 = (class45) class56.field707.method2180((long) arg1, (byte) 31);
        int var3 = -119 / ((37 - arg0) / 37);
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class101.field1596.method1441(arg1, (byte) -44, 34);
        class45 var5 = new class45();
        if (var4 != null) {
            var5.method293(new class263(var4), arg1, true);
        }
        class56.field707.method2175((long) arg1, var5, -85);
        return var5;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)I", line = 94)
    public static final int method1357(int arg0) {
        field2963++;
        try {
            if (class202.field3016 == 0) {
                if (class198.field2979 > (class231.method1594(-20375) - 5000L)) {
                    return 0;
                }
                class224.field3411 = class274.field4200.method1777(class213.field3234, 0, class178.field2636);
                class10.field101 = class231.method1594(-20375);
                class202.field3016 = 1;
            }
            if (class231.method1594(-20375) > class10.field101 + 30000L) {
                return class243.method1650(1000, (byte) 104);
            }
            if (class202.field3016 == 1) {
                if (class224.field3411.field3456 == 2) {
                    return class243.method1650(1001, (byte) 104);
                }
                if (class224.field3411.field3456 != 1) {
                    return -1;
                }
                class168.field2517 = new class161((Socket) class224.field3411.field3452, class274.field4200);
                class224.field3411 = null;
                class234.field3507.field4025 = 0;
                int var1 = 0;
                if (class75.field977) {
                    var1 = class44.field539;
                }
                class234.field3507.method1813(-123, 23);
                class234.field3507.method1815(121, var1);
                class168.field2517.method1134(class234.field3507.field3986, true, class234.field3507.field4025, 0);
                if (class225.field3426 != null) {
                    class225.field3426.method1241((byte) -96);
                }
                if (class17.field211 != null) {
                    class17.field211.method1241((byte) -122);
                }
                int var2 = class168.field2517.method1141(65280);
                if (class225.field3426 != null) {
                    class225.field3426.method1241((byte) -104);
                }
                if (class17.field211 != null) {
                    class17.field211.method1241((byte) -105);
                }
                if (var2 != 0) {
                    return class243.method1650(var2, (byte) 104);
                }
                class202.field3016 = 2;
            }
            if (class202.field3016 == 2) {
                if (class168.field2517.method1137(-2266) < 2) {
                    return -1;
                }
                class37.field448 = class168.field2517.method1141(65280);
                class37.field448 <<= 0x8;
                class37.field448 += class168.field2517.method1141(65280);
                class202.field3016 = 3;
                class194.field2909 = new byte[class37.field448];
                class189.field2815 = 0;
            }
            if (arg0 != -27886) {
                field2957 = 50;
            }
            if (class202.field3016 != 3) {
                return -1;
            }
            int var3 = class168.field2517.method1137(arg0 + 25620);
            if (var3 < 1) {
                return -1;
            }
            if (class37.field448 - class189.field2815 < var3) {
                var3 = class37.field448 - class189.field2815;
            }
            class168.field2517.method1142(var3, true, class194.field2909, class189.field2815);
            class189.field2815 += var3;
            if (class37.field448 > class189.field2815) {
                return -1;
            } else if (class281.method1965(class194.field2909, arg0 ^ 0xFFFF9308)) {
                class250.field3729 = new class178[class61.field813];
                int var4 = 0;
                for (int var5 = class169.field2528; var5 <= class131.field2024; var5++) {
                    class178 var6 = class205.method1410(var5, 2586);
                    if (var6 != null) {
                        class250.field3729[var4++] = var6;
                    }
                }
                class168.field2517.method1138(arg0 - 16698978);
                class168.field2517 = null;
                class194.field2909 = null;
                class202.field3016 = 0;
                class188.field2797 = 0;
                class198.field2979 = class231.method1594(arg0 + 7511);
                return 0;
            } else {
                return class243.method1650(1002, (byte) 104);
            }
        } catch (IOException var8) {
            return class243.method1650(1003, (byte) 104);
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V", line = 235)
    public static void method1358(int arg0) {
        field2962 = null;
        if (arg0 != -3) {
            method1358(-36);
        }
    }
}
