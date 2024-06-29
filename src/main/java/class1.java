import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!a")
public class class1 extends class10 {

    @OriginalMember(owner = "mapview!a", name = "n", descriptor = "Lw;")
    public static class38 field1 = class35.method219("Amulet Shop", true);

    @OriginalMember(owner = "mapview!a", name = "q", descriptor = "Lw;")
    public static class38 field4 = class35.method219("mapfunction", true);

    @OriginalMember(owner = "mapview!a", name = "r", descriptor = "Lw;")
    public static class38 field5 = class35.method219("Dungeon", true);

    @OriginalMember(owner = "mapview!a", name = "o", descriptor = "Lw;")
    public static class38 field2 = class35.method219("uitext has incorrect number of strings", true);

    @OriginalMember(owner = "mapview!a", name = "t", descriptor = "Lw;")
    public static class38 field7 = class35.method219("Archery Shop", true);

    @OriginalMember(owner = "mapview!a", name = "v", descriptor = "Lw;")
    public static class38 field9 = class35.method219("Altar", true);

    @OriginalMember(owner = "mapview!a", name = "u", descriptor = "Lw;")
    public static class38 field8 = class35.method219("Short)2cut", true);

    @OriginalMember(owner = "mapview!a", name = "p", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "mapview!a", name = "x", descriptor = "[B")
    public static byte[] field11;

    @OriginalMember(owner = "mapview!a", name = "w", descriptor = "[I")
    public static int[] field10;

    @OriginalMember(owner = "mapview!a", name = "s", descriptor = "[I")
    public static int[] field6;

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(IJ)V", line = 10)
    public static final void method1(int arg0, long arg1) {
        try {
            if (arg0 != 6272) {
                return;
            }
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "mapview!a", name = "d", descriptor = "(B)V", line = 35)
    public static void method2(byte arg0) {
        field8 = null;
        field9 = null;
        field10 = null;
        int var1 = 55 / ((-arg0 - 56) / 51);
        field4 = null;
        field6 = null;
        field5 = null;
        field11 = null;
        field1 = null;
        field2 = null;
        field7 = null;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(I)V", line = 73)
    public static final void method3(int arg0) {
        class33 var1 = class27.field374;
        synchronized (class27.field374) {
            class24.field340 = class3.field14;
            if (class18.field181 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class26.field372[var2] = false;
                }
                class18.field181 = class9.field76;
            } else {
                while (class9.field76 != class18.field181) {
                    int var3 = class24.field346[class9.field76];
                    class9.field76 = class9.field76 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class26.field372[var3] = true;
                    } else {
                        class26.field372[~var3] = false;
                    }
                }
            }
            class3.field14 = class35.field483;
            if (arg0 > -87) {
                method2((byte) 123);
            }
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 134)
    public static final void method4(byte arg0, Component arg1) {
        if (arg0 <= 92) {
            method1(-50, 82L);
        }
        arg1.removeKeyListener(class27.field374);
        arg1.removeFocusListener(class27.field374);
    }
}
