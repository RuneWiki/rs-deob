import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class127 {

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "Lve;")
    public static class255 field2094 = class87.method607(110, "showingVideoAd");

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field2099 = 0;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "Lve;")
    public static class255 field2098 = class87.method607(56, "Abbrechen");

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "[S")
    public static short[] field2097 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "Lma;")
    public static class274 field2092 = new class274();

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public static int field2101 = 0;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "[Lud;")
    public static class269[] field2095;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V", line = 7)
    public static void method941(byte arg0) {
        field2095 = null;
        field2098 = null;
        if (arg0 < -87) {
            field2097 = null;
            field2094 = null;
            field2092 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILtg;I)V", line = 24)
    public static final void method942(int arg0, class301 arg1, int arg2) {
        if (arg1.field5134 > class277.field4768) {
            class280.method1951((byte) -78, arg1);
        } else if (class277.field4768 <= arg1.field5174) {
            class192.method1322(arg1, (byte) -68);
        } else {
            class116.method882(arg1, false);
        }
        if (arg1.field5130 < 128 || arg1.field5173 < 128 || arg1.field5130 >= 13184 || arg1.field5173 >= 13184) {
            arg1.field5174 = 0;
            arg1.field5166 = -1;
            arg1.field5164 = -1;
            arg1.field5134 = 0;
            arg1.field5130 = arg1.field5125[0] * 128 + arg1.method1680(-106) * 64;
            arg1.field5173 = arg1.field5154[0] * 128 + arg1.method1680(-100) * 64;
            arg1.method2101(arg0 ^ 0xFFFFFFB6);
        }
        if (class276.field4742 == arg1 && (arg1.field5130 < 1536 || arg1.field5173 < 1536 || arg1.field5130 >= 11776 || arg1.field5173 >= 11776)) {
            arg1.field5166 = -1;
            arg1.field5174 = 0;
            arg1.field5134 = 0;
            arg1.field5164 = -1;
            arg1.field5130 = arg1.field5125[0] * 128 + arg1.method1680(-120) * 64;
            arg1.field5173 = arg1.field5154[0] * 128 + (arg1.method1680(-98) * 64);
            arg1.method2101(arg0 - 91);
        }
        class9.method49(arg1, true);
        class121.method898(arg1, -1);
        if (arg0 != 2) {
            field2092 = (class274) null;
        }
        field2091++;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)I", line = 78)
    public static int method943(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)I", line = 86)
    public static final int method944(int arg0, byte arg1) {
        field2093++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= -33) {
            method941((byte) -28);
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lve;BI)V", line = 146)
    public static final void method945(class255 arg0, byte arg1, int arg2) {
        field2100++;
        class59.field909++;
        if (arg1 == -84) {
            class255.field4318.method1523(22260, 201);
            class255.field4318.method424(25745, arg2);
            class255.field4318.method449(16711680, arg0.method1764((byte) 62));
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 170)
    public static final void method946(Component arg0, byte arg1) {
        Method var2 = class40.field634;
        field2096++;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(class60.field917);
        if (arg1 == -79) {
            arg0.addFocusListener(class60.field917);
        }
    }
}
