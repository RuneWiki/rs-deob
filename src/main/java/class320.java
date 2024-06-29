import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public abstract class class320 extends class577 {

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "I")
    public static int field4449 = 1;

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "I")
    public static int field4452 = 0;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "Z")
    public static boolean field4450 = false;

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "Lda;")
    public static class402 field4451;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "Loia;")
    public static class52 field4453;

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "Ljava/applet/Applet;")
    public static Applet field4445;

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "[I")
    public static int[] field4444;

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "[[[Lve;")
    public static class262[][][] field4443;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method2065(int arg0, int arg1, int arg2) {
        field4446++;
        if (!class25.field320) {
            return false;
        }
        int var3 = arg0 >> 16;
        int var4 = arg0 & 0xFFFF;
        if (class266.field3900[var3] == null || class266.field3900[var3][var4] == null) {
            return false;
        }
        class755 var5 = class266.field3900[var3][var4];
        if (arg1 == arg2 && var5.field10416 == 0) {
            for (class558 var6 = (class558) class290.field4161.method3618(107); var6 != null; var6 = (class558) class290.field4161.method3619(0)) {
                if (var6.field7754 == 5 || var6.field7754 == 1002 || var6.field7754 == 21 || var6.field7754 == 44 || var6.field7754 == 2) {
                    for (class755 var7 = class189.method1182(var6.field7752, (byte) -101); var7 != null; var7 = class528.method3138(0, var7)) {
                        if (var5.field10445 == var7.field10445) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class558 var8 = (class558) class290.field4161.method3618(119); var8 != null; var8 = (class558) class290.field4161.method3619(0)) {
                if (var8.field7756 == arg1 && var5.field10445 == var8.field7752 && (var8.field7754 == 5 || var8.field7754 == 1002 || var8.field7754 == 21 || var8.field7754 == 44 || var8.field7754 == 2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V", line = 71)
    public static final void method2066(byte arg0) {
        class332.field4707.method2158(1, class332.field4707.field4759, -15);
        field4448++;
        class332.field4707.method2158(1, class332.field4707.field4774, -15);
        class332.field4707.method2158(2, class332.field4707.field4763, -15);
        class332.field4707.method2158(2, class332.field4707.field4793, -15);
        class332.field4707.method2158(1, class332.field4707.field4779, -15);
        class332.field4707.method2158(1, class332.field4707.field4752, -15);
        class332.field4707.method2158(1, class332.field4707.field4769, -15);
        class332.field4707.method2158(1, class332.field4707.field4799, -15);
        class332.field4707.method2158(1, class332.field4707.field4757, -15);
        class332.field4707.method2158(1, class332.field4707.field4792, -15);
        class332.field4707.method2158(2, class332.field4707.field4787, -15);
        class332.field4707.method2158(1, class332.field4707.field4764, -15);
        class332.field4707.method2158(2, class332.field4707.field4791, -15);
        class332.field4707.method2158(1, class332.field4707.field4765, -15);
        class332.field4707.method2158(0, class332.field4707.field4756, -15);
        class332.field4707.method2158(0, class332.field4707.field4773, -15);
        class332.field4707.method2158(2, class332.field4707.field4800, -15);
        class332.field4707.method2158(0, class332.field4707.field4770, -15);
        class332.field4707.method2158(0, class332.field4707.field4767, -15);
        class274.method1843(20084);
        class332.field4707.method2158(0, class332.field4707.field4758, -15);
        class332.field4707.method2158(4, class332.field4707.field4785, -15);
        class211.method1261(18388);
        class124.method777((byte) -68);
        if (arg0 >= -118) {
            field4451 = null;
        }
        class641.field8597 = true;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)V", line = 115)
    public static void method2067(byte arg0) {
        field4444 = null;
        field4451 = null;
        field4453 = null;
        field4443 = null;
        if (arg0 != 27) {
            field4445 = null;
        }
        field4445 = null;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V", line = 134)
    public static final void method2068(int arg0) {
        if (arg0 >= -63) {
            method2068(24);
        }
        class542.method3207(true);
        field4447++;
        class25.field320 = false;
        class282.method1882((byte) 34, class178.field2450, class686.field9524, class746.field10270, class401.field5750);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)Lpda;")
    public abstract class492 method638(boolean arg0);
}
