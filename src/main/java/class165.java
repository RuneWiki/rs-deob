import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class165 extends class304 {

    @OriginalMember(owner = "client!wk", name = "y", descriptor = "Lcd;")
    public static class64 field2893 = class44.method335((byte) 71, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!wk", name = "D", descriptor = "Lcd;")
    public static class64 field2898 = class44.method335((byte) 71, " )2>");

    @OriginalMember(owner = "client!wk", name = "G", descriptor = "Lcd;")
    public static class64 field2901 = class44.method335((byte) 71, "Stufe:");

    @OriginalMember(owner = "client!wk", name = "E", descriptor = "J")
    public static volatile long field2899 = 0L;

    @OriginalMember(owner = "client!wk", name = "B", descriptor = "Lig;")
    public static class168 field2896 = new class168(64);

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!wk", name = "x", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!wk", name = "A", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!wk", name = "F", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!wk", name = "C", descriptor = "Loi;")
    public static class306 field2897;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V", line = 8)
    public static final void method1179(int arg0) {
        field2892++;
        class313 var1 = new class313();
        if (arg0 != 64) {
            return;
        }
        for (int var2 = 0; var2 < 13; var2++) {
            for (int var3 = 0; var3 < 13; var3++) {
                class157.field2770[var2][var3] = var1;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BI)I", line = 40)
    public static final int method1180(byte arg0, int arg1) {
        int var2 = (arg1 >>> 1 & 0xD5555555) + (arg1 & 0x55555555);
        int var3 = (var2 >>> 2 & 0xB3333333) + (var2 & 0x33333333);
        field2894++;
        if (arg0 <= 40) {
            return 103;
        } else {
            int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
            int var5 = (var4 >>> 8) + var4;
            int var6 = (var5 >>> 16) + var5;
            return var6 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 59)
    public static final void method1181(byte arg0, Component arg1) {
        if (arg0 <= 119) {
            method1179(39);
        }
        arg1.addMouseListener(class163.field2873);
        arg1.addMouseMotionListener(class163.field2873);
        field2891++;
        arg1.addFocusListener(class163.field2873);
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(Z)V", line = 74)
    public static void method1182(boolean arg0) {
        if (arg0) {
            method1180((byte) -78, -57);
        }
        field2898 = null;
        field2897 = null;
        field2893 = null;
        field2896 = null;
        field2901 = null;
    }
}
