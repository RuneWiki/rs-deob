import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class5 implements class685 {

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "Ljava/lang/String;")
    private String field127;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "Lwu;")
    private class376 field130;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "[Ljava/awt/Color;")
    public static Color[] field126 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "Lhda;")
    public static class752 field128 = new class752(36, 6);

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "[F")
    public static float[] field131 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public static int field132 = -1;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "J")
    public static long field122;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "Ltj;")
    public static class198 field124;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V", line = 3)
    public static void method76(boolean arg0) {
        field126 = null;
        field128 = null;
        field131 = null;
        if (arg0) {
            field124 = null;
        }
        field124 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)Lsaa;", line = 26)
    public final class331 method77(byte arg0) {
        if (arg0 >= -120) {
            this.field130 = null;
        }
        field129++;
        return class331.field4720;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)I", line = 38)
    public final int method78(int arg0) {
        field121++;
        if (arg0 == -20701) {
            return this.field130.method2225(this.field127, arg0 ^ 0x50DC) ? 100 : 0;
        } else {
            return -85;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZ)Z", line = 58)
    public static final boolean method79(int arg0, boolean arg1) {
        field133++;
        if (arg1) {
            return arg0 >= 4 && arg0 <= 8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lbha;Z)V", line = 70)
    public static final void method80(class575 arg0, boolean arg1) {
        field123++;
        if (!arg1) {
            field124 = null;
        }
        arg0.field7551 = null;
        if (class168.field2590 < 20) {
            class330.field4713.method3870(arg0, 0);
            class168.field2590++;
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lwu;Ljava/lang/String;)V", line = 92)
    public class5(class376 arg0, String arg1) {
        this.field127 = arg1;
        this.field130 = arg0;
    }
}
