import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public abstract class class11 {

    @OriginalMember(owner = "client!b", name = "c", descriptor = "Ltg;")
    public static class184 field195 = class135.method812("Bitte warten Sie eine Minute", 3);

    @OriginalMember(owner = "client!b", name = "a", descriptor = "[Ldi;")
    public static class39[] field193 = new class39[50];

    @OriginalMember(owner = "client!b", name = "b", descriptor = "Ltg;")
    public static class184 field194 = class135.method812("<col=ff3000>", 3);

    @OriginalMember(owner = "client!b", name = "h", descriptor = "Ltg;")
    private static class184 field200 = class135.method812("Examine", 3);

    @OriginalMember(owner = "client!b", name = "f", descriptor = "Ltg;")
    public static class184 field198 = field200;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "Ltg;")
    private static class184 field203 = class135.method812("Loading sprites )2 ", 3);

    @OriginalMember(owner = "client!b", name = "e", descriptor = "Ltg;")
    public static class184 field197 = field203;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "[S")
    public static short[] field204 = new short[] { 16, 30, 40, 43, 5, 39, 36, 1 };

    @OriginalMember(owner = "client!b", name = "n", descriptor = "Ltg;")
    public static class184 field206 = class135.method812("blinken3:", 3);

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field199 = 0;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    public static int field207 = 0;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)I")
    public abstract int method65(int arg0);

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method66(Component arg0, int arg1);

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILka;)V")
    public static final void method67(int arg0, class97 arg1) {
        if (class19.field376 != null) {
            try {
                class19.field376.method883((byte) -11, 0L);
                class19.field376.method889(arg1.field1834, (byte) -106, 24, arg1.field1809);
            } catch (Exception var2) {
            }
        }
        arg1.field1834 += 24;
        if (arg0 != 112) {
            method70(-40);
        }
        field202++;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
    public static final void method68(int arg0) {
        class38 var1 = class46.field866;
        synchronized (class46.field866) {
            class62.field1172 = class138.field2505;
            if (class38.field727 >= 0) {
                while (class38.field727 != class129.field2345) {
                    int var3 = class122.field2195[class129.field2345];
                    class129.field2345 = class129.field2345 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class120.field2163[var3] = true;
                    } else {
                        class120.field2163[~var3] = false;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class120.field2163[var2] = false;
                }
                class38.field727 = class129.field2345;
            }
            class138.field2505 = class62.field1176;
        }
        if (arg0 == -1) {
            field208++;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method69(int arg0, Component arg1);

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
    public static void method70(int arg0) {
        field206 = null;
        field194 = null;
        field197 = null;
        field200 = null;
        field198 = null;
        field195 = null;
        field193 = null;
        field203 = null;
        if (arg0 < -116) {
            field204 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    public static final void method71(byte arg0) {
        field205++;
        class172.method1068(0);
        class177.method1084(-89);
        class123.method752(10838);
        class114.method703(-128);
        class182.method1127((byte) 93);
        class62.method348(4096);
        class97.method612(false);
        class107.method668(104);
        class145.method894(4096);
        class158.method955(-100);
        class172.method1069((byte) -68);
        class105.method655(2047);
        ((class64) class23.field427).method358(2000);
        class10.field179.method770(false);
        class164.field2953.method1262(9677);
        class200.field3884.method1262(9677);
        class170.field3229.method1262(9677);
        class7.field128.method1262(9677);
        class17.field324.method1262(9677);
        class180.field3427.method1262(9677);
        class3.field62.method1262(9677);
        class117.field2124.method1262(9677);
        class126.field2270.method1262(9677);
        class14.field279.method1262(9677);
        class174.field3291.method1262(9677);
        if (arg0 <= 52) {
            method72((byte) 96);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V")
    public static final void method72(byte arg0) {
        if (class147.field2651.toLowerCase().indexOf("microsoft") == -1) {
            class156.field2792[91] = 42;
            class156.field2792[59] = 57;
            if (class147.field2645 == null) {
                class156.field2792[222] = 59;
                class156.field2792[192] = 58;
            } else {
                class156.field2792[192] = 28;
                class156.field2792[222] = 58;
                class156.field2792[520] = 59;
            }
            class156.field2792[93] = 43;
            class156.field2792[46] = 72;
            class156.field2792[47] = 73;
            class156.field2792[45] = 26;
            class156.field2792[61] = 27;
            class156.field2792[44] = 71;
            class156.field2792[92] = 74;
        } else {
            class156.field2792[189] = 26;
            class156.field2792[219] = 42;
            class156.field2792[187] = 27;
            class156.field2792[223] = 28;
            class156.field2792[221] = 43;
            class156.field2792[191] = 73;
            class156.field2792[186] = 57;
            class156.field2792[192] = 58;
            class156.field2792[190] = 72;
            class156.field2792[222] = 59;
            class156.field2792[220] = 74;
            class156.field2792[188] = 71;
        }
        field201++;
        if (arg0 <= 107) {
            field199 = -66;
        }
    }
}
