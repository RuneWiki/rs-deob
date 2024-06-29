import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class163 {

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "Lhj;")
    public static class69 field3009 = class181.method1318("Ladevorgang )2 bitte warten Sie)3", (byte) -108);

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "[J")
    public static long[] field3008 = new long[32];

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "[I")
    public static int[] field3010 = new int[] { 0, 5, 0, 6, -1, -2, 0, 0, -2, 0, 2, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 12, 0, 0, 0, 1, 0, 0, 0, 6, 10, 14, 0, 6, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, -1, 0, 0, 6, 5, 7, 0, -1, 0, 0, 0, 0, 0, 0, 3, 0, 0, 4, 14, -1, 0, 0, 0, 0, 0, 0, 10, 0, -2, 0, 3, -1, 0, 7, 0, 0, -1, 8, 24, 0, 0, 0, 0, 4, 0, 0, 3, 0, 0, 0, 6, 0, 0, -1, 0, -1, -2, 0, -1, -1, 0, -2, 0, 8, 6, 0, 0, 0, 0, 0, 5, 12, 0, 0, 0, 0, 0, 0, 0, 0, 7, 5, 0, 1, 10, 0, 0, 0, 0, 0, 7, 0, 0, 0, -1, 6, 0, 0, 0, 0, 0, 0, 0, 0, -2, -2, 2, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 2, 0, 5, 0, 0, 0, 0, 4, 0, 0, 0, 4, 20, 0, 6, 0, 0, 0, 0, 0, 0, 0, 9, 1, 0, 0, 3, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, -1, 2, 6, -1, -2, 0, -1, 0, 1, 0, -2, 0, 0, -2, 5, 5, 6, 10, 0, 0, 2, 0, 2, 8, 0, 3, 0, 0, 0, 0, 1, 4, 0, 2, 15, 0, 0, -2, 15, 0, 0, 8, 0, -2, 0, 10, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field3016 = 0;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "[I")
    public static int[] field3014 = new int[5];

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "[Ljd;")
    public static class85[] field3018 = new class85[100];

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "Lhj;")
    public static class69 field3017 = class181.method1318("not yet implemented", (byte) -112);

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public static int field3020 = 0;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "[I")
    public static int[] field3013;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
    public static void method1212(byte arg0) {
        field3017 = null;
        field3008 = null;
        field3018 = null;
        field3014 = null;
        field3013 = null;
        field3010 = null;
        field3009 = null;
        if (arg0 >= -79) {
            field3014 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method1213(byte arg0, Component arg1) {
        if (arg0 != -61) {
            method1212((byte) -72);
        }
        field3019++;
        Method var2 = class42.field612;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class141.field2626);
        arg1.addFocusListener(class141.field2626);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static final void method1214(int arg0) {
        class98.field1860 = new class243();
        if (arg0 != 15943) {
            field3008 = null;
        }
        field3007++;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)Z")
    public static final boolean method1215(int arg0) {
        if (arg0 <= 68) {
            field3016 = 13;
        }
        field3011++;
        return class151.field2790;
    }
}
