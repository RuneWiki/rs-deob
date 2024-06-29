import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class16 extends class245 {

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "Lsg;")
    public static class30 field327 = class167.method1221((byte) 33, "(R");

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "Lbi;")
    public static class66 field330;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "Ljava/awt/Font;")
    public static Font field332;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "[[[B")
    public static byte[][][] field329;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
    public static final void method161(int arg0) {
        if (arg0 != 11) {
            field330 = null;
        }
        field333++;
        while (class59.field1289.method1277(class163.field3041, 8) >= 11) {
            int var1 = class59.field1289.method1270(arg0 - 116, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class75.field1670[var1] == null) {
                var2 = true;
                class75.field1670[var1] = new class120();
                if (class106.field2124[var1] != null) {
                    class75.field1670[var1].method912(false, class106.field2124[var1]);
                }
            }
            class183.field3378[class28.field528++] = var1;
            class120 var3 = class75.field1670[var1];
            var3.field1391 = class133.field2617;
            int var4 = class59.field1289.method1270(arg0 ^ 0xFFFFFFCD, 5);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class59.field1289.method1270(-57, 5);
            int var6 = class59.field1289.method1270(-118, 1);
            int var7 = class59.field1289.method1270(-122, 1);
            if (var5 > 15) {
                var5 -= 32;
            }
            if (var7 == 1) {
                class116.field2293[class168.field3158++] = var1;
            }
            int var8 = class119.field2323[class59.field1289.method1270(-61, 3)];
            if (var2) {
                var3.field1337 = var3.field1389 = var8;
            }
            var3.method914(class247.field4394.field1349[0] + var5, class247.field4394.field1372[0] + var4, var6 == 1, 0);
        }
        class59.field1289.method1271((byte) 127);
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V")
    public static void method162(int arg0) {
        if (arg0 != 0) {
            method161(-96);
        }
        field329 = null;
        field327 = null;
        field330 = null;
        field332 = null;
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)V")
    public static final void method163(int arg0) {
        field328++;
        class121.method926(-1, 5);
        class160.method1190(0, 5);
        class33.method333((byte) 10, 5);
        class112.method884(5, 1);
        class223.method1602(5, 6813);
        class268.method1842(5, arg0 - 11847);
        if (arg0 != 11849) {
            field332 = null;
        }
        class229.method1631((byte) 74, 5);
        class135.method1019(124, 5);
        class23.method209(5, arg0 - 11947);
        class151.method1106(19905, 5);
        class155.method1161(arg0 ^ 0xFFFF8C3E, 5);
        class249.method1744(50, false);
        class71.method662((byte) -102, 5);
        class124.method937(5, (byte) -126);
        class90.field1811.method1642(5, arg0 - 11758);
    }

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)I")
    public static final int method164(int arg0) {
        field331++;
        if (arg0 > -52) {
            field329 = null;
        }
        return ((class246.field4382 == 0 ? 0 : 1) << 21) + ((class142.field2749 ? 1 : 0) << 19) + ((class177.field3277 ? 1 : 0) << 16) + ((class50.field1136 ? 1 : 0) << 15) + ((class113.field2240 ? 1 : 0) << 10) + ((class104.field2102 ? 1 : 0) << 9) + ((class185.field3392 ? 1 : 0) << 6) + (class123.field2416 & 0x7) + ((class13.field238 ? 1 : 0) << 3) + ((class238.field4243 ? 1 : 0) << 4) + ((class197.field3569 ? 1 : 0) << 5) - (-((class39.field928 ? 1 : 0) << 7) + (-((class261.field4610 ? 1 : 0) << 8) - (class22.field409 & 0x3 << 11)) + (-((class209.field3755 ? 1 : 0) << 13) - (class117.field2316 & 0x3 << 17) - ((class169.field3184 == 0 ? 0 : 1) << 20)) + -((class169.field3185 == 0 ? 0 : 1) << 22));
    }
}
