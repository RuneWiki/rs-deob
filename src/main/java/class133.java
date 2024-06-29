import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class133 {

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Lvp;")
    public static class123 field2042 = new class123();

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "Llt;")
    public static class475 field2044 = new class475("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "Lri;")
    public static class73 field2045 = new class73(98, 6);

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field2046 = 0;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Lf;")
    public static class529 field2040;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method886(String arg0, int arg1) {
        field2041++;
        if (!class61.field932) {
            return;
        }
        boolean var2 = false;
        int var3 = class74.field1105;
        int[] var4 = class272.field3948;
        if (arg1 < 108) {
            method887(-81);
        }
        for (int var5 = 0; var5 < var3; var5++) {
            class239 var6 = class44.field707[var4[var5]];
            if (var6 != null && class500.field7365 != var6 && var6.field3548 != null && var6.field3548.equalsIgnoreCase(arg0)) {
                class326.field4647++;
                class291.method1861((byte) -104, class496.field7331);
                class356.field5471.method1457((byte) 57, class266.field3893);
                class356.field5471.method1429((byte) -88, class49.field785);
                class356.field5471.method1429((byte) 116, var4[var5]);
                class356.field5471.method1408(0, -1244);
                class356.field5471.method1439(120, class267.field3903);
                var2 = true;
                class343.method2105(var6.field1996[0], var6.method847(-1), var6.field1997[0], var6.method847(-1), (byte) 123, true, 0, 0, -2);
                break;
            }
        }
        if (!var2) {
            class61.method359(class337.field4740.method2838(false, class143.field2137) + arg0, (byte) -51);
        }
        if (class61.field932) {
            class138.method920((byte) -43);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)Lcn;")
    public static final class355 method887(int arg0) {
        field2039++;
        if (arg0 <= 4) {
            return null;
        } else if (class460.field6814 == null || class398.field5965 == null) {
            return null;
        } else {
            class398.field5965.method1845(-10156, class460.field6814);
            class355 var1 = (class355) class398.field5965.method1842((byte) -125);
            if (var1 == null) {
                return null;
            } else {
                class158 var2 = class460.field6804.method539(var1.field5459, (byte) 60);
                return var2 != null && var2.field2312 && var2.method1011(109, class460.field6798) ? var1 : class418.method2510(16711935);
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
    public static final void method888(int arg0) {
        field2043++;
        if (~class451.field6717 > arg0) {
            return;
        }
        long var1 = class256.method1708((byte) 118);
        class451.field6717 = (int) ((long) class451.field6717 - (var1 - class321.field4606));
        if (class451.field6717 > 0) {
            int var3 = (class451.field6717 << 8) / class229.field3426;
            int var4 = 255 - var3;
            float var5 = (float) var3 / 255.0F;
            float var6 = 1.0F - var5;
            class343.field4966 = ((class424.field6372 & 0xFF00) * var3 + (class261.field3839.field3475 & 0xFF00) * var4 & 0xFF0000) + ((class424.field6372 & 0xFF00FF) * var3 + (class261.field3839.field3475 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
            class242.field3576 = ((class141.field2116 & 0xFF00) * var3 + (class261.field3839.field3478 & 0xFF00) * var4 & 0xFF0000) + ((class141.field2116 & 0xFF00FF) * var3 + (class261.field3839.field3478 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
            class381.field5777 = (class261.field3839.field3471 - class20.field227) * var6 + class20.field227;
            class293.field4194 = (class261.field3839.field3468 - class62.field936) * var6 + class62.field936;
            class43.field677 = (class261.field3839.field3472 - class289.field4158) * var6 + class289.field4158;
            class357.field5492 = class92.field1374 * var3 + class261.field3839.field3479 * var4 >> 8;
            class169.field2506 = (class261.field3839.field3467 - class429.field6413) * var6 + class429.field6413;
            class369.field5648 = (class261.field3839.field3464 - class509.field7431) * var6 + class509.field7431;
            class202.field2926 = (class261.field3839.field3465 - class317.field4538) * var6 + class317.field4538;
            if (class419.field6306 != class261.field3839.field3476) {
                class246.field3628 = class33.field345.method1086(class419.field6306, class261.field3839.field3476, var6, class246.field3628);
            }
        } else {
            class43.field677 = class261.field3839.field3472;
            class381.field5777 = class261.field3839.field3471;
            class357.field5492 = class261.field3839.field3479;
            class246.field3628 = class261.field3839.field3476;
            class242.field3576 = class261.field3839.field3478;
            class369.field5648 = class261.field3839.field3464;
            class202.field2926 = class261.field3839.field3465;
            class169.field2506 = class261.field3839.field3467;
            class343.field4966 = class261.field3839.field3475;
            class451.field6717 = -1;
            class293.field4194 = class261.field3839.field3468;
        }
        class321.field4606 = var1;
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V")
    public static void method889(int arg0) {
        field2040 = null;
        field2044 = null;
        field2045 = null;
        if (arg0 >= -42) {
            field2045 = null;
        }
        field2042 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static final void method890(byte arg0) {
        class162.field2368.method1356(128);
        field2038++;
        class54.field838.method1746((byte) -113);
        if (class450.field6709 != null) {
            class450.field6709.method35((byte) 76, class364.field5570);
        }
        class436.field6522.method1558((byte) -25);
        class364.field5570.setBackground(Color.black);
        class518.field7545 = -1;
        class162.field2368 = class404.method2431(arg0 ^ 0xFFFFFFC2, class364.field5570);
        class54.field838 = class59.method351(class364.field5570, false, true);
        if (arg0 != -3) {
            field2045 = null;
        }
        if (class450.field6709 != null) {
            class450.field6709.method33(false, class364.field5570);
        }
    }
}
