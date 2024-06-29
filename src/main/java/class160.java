import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class160 extends class113 {

    @OriginalMember(owner = "client!rh", name = "M", descriptor = "I")
    public int field3203 = 0;

    @OriginalMember(owner = "client!rh", name = "P", descriptor = "Lcd;")
    private static class23 field3206 = class54.method414("Examine", -1);

    @OriginalMember(owner = "client!rh", name = "L", descriptor = "[I")
    public static int[] field3202 = new int[2048];

    @OriginalMember(owner = "client!rh", name = "O", descriptor = "Lcd;")
    public static class23 field3205 = field3206;

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "Lwc;")
    public static class200 field3194 = new class200();

    @OriginalMember(owner = "client!rh", name = "U", descriptor = "Lcd;")
    public static class23 field3211 = class54.method414("Die Verbindung konnte", -1);

    @OriginalMember(owner = "client!rh", name = "S", descriptor = "I")
    public static int field3209 = 127;

    @OriginalMember(owner = "client!rh", name = "T", descriptor = "Lcd;")
    public static class23 field3210 = class54.method414("Fehler bei der Verbindung zum Server)3", -1);

    @OriginalMember(owner = "client!rh", name = "V", descriptor = "I")
    public static int field3212 = 0;

    @OriginalMember(owner = "client!rh", name = "Z", descriptor = "Lcd;")
    public static class23 field3216 = class54.method414("leuchten1:", -1);

    @OriginalMember(owner = "client!rh", name = "R", descriptor = "I")
    public static int field3208 = -2;

    @OriginalMember(owner = "client!rh", name = "ab", descriptor = "[I")
    public static int[] field3217 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!rh", name = "W", descriptor = "Lcd;")
    private static class23 field3213 = class54.method414("cyan:", -1);

    @OriginalMember(owner = "client!rh", name = "Y", descriptor = "Lcd;")
    public static class23 field3215 = class54.method414("(Y<)4col>", -1);

    @OriginalMember(owner = "client!rh", name = "X", descriptor = "Lcd;")
    public static class23 field3214 = field3213;

    @OriginalMember(owner = "client!rh", name = "bb", descriptor = "Z")
    public static boolean field3218 = false;

    @OriginalMember(owner = "client!rh", name = "Q", descriptor = "Lcd;")
    public static class23 field3207 = field3213;

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!rh", name = "G", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!rh", name = "J", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IILlf;IIB)V")
    public static final void method981(int arg0, int arg1, class104 arg2, int arg3, int arg4, byte arg5) {
        field3197++;
        class154 var6 = new class154();
        var6.field3095 = arg0 * 128;
        if (arg5 != -9) {
            field3209 = -116;
        }
        var6.field3073 = arg1 * 128;
        var6.field3075 = arg2.field2251 * 128;
        var6.field3084 = arg2.field2233;
        var6.field3085 = arg2.field2261;
        var6.field3092 = arg4;
        var6.field3076 = arg2.field2246;
        var6.field3086 = arg2.field2265;
        int var7 = arg2.field2205;
        int var8 = arg2.field2232;
        if (arg3 == 1 || arg3 == 3) {
            var8 = arg2.field2205;
            var7 = arg2.field2232;
        }
        var6.field3083 = (arg0 + var8) * 128;
        var6.field3072 = (arg1 + var7) * 128;
        if (arg2.field2238 != null) {
            var6.field3090 = arg2;
            var6.method951((byte) -13);
        }
        class154.field3096.method186(var6, -26692);
        if (var6.field3076 != null) {
            var6.field3081 = (int) (Math.random() * (double) (var6.field3084 - var6.field3086)) + var6.field3086;
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(Z)V")
    public static void method982(boolean arg0) {
        if (!arg0) {
            return;
        }
        field3216 = null;
        field3215 = null;
        field3206 = null;
        field3194 = null;
        field3214 = null;
        field3211 = null;
        field3205 = null;
        field3207 = null;
        field3217 = null;
        field3210 = null;
        field3213 = null;
        field3202 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lva;I)V")
    public final void method983(class189 arg0, int arg1) {
        field3199++;
        if (arg1 != 0) {
            field3214 = null;
        }
        while (true) {
            int var3 = arg0.method1202(-49);
            if (var3 == 0) {
                return;
            }
            this.method986(arg0, var3, (byte) -56);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IBI)I")
    public static final int method984(int arg0, byte arg1, int arg2) {
        if (arg1 > -86) {
            return 15;
        }
        field3204++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 / 128;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public static final void method985(Component arg0, boolean arg1) {
        field3196++;
        if (!arg1) {
            method984(111, (byte) 30, 114);
        }
        Method var2 = class137.field2829;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg0.addKeyListener(class176.field3499);
        arg0.addFocusListener(class176.field3499);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lva;IB)V")
    private final void method986(class189 arg0, int arg1, byte arg2) {
        if (arg2 != -56) {
            field3210 = null;
        }
        field3200++;
        if (arg1 == 5) {
            this.field3203 = arg0.method1197(-1);
        }
    }
}
