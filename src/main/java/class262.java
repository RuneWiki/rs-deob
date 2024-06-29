import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class262 extends class168 {

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public int field3291;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public int field3297;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "Lmg;")
    public static class151 field3296 = new class151();

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "Lbf;")
    public static class539 field3298 = new class539(14, 0);

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "Lbf;")
    public static class539 field3299 = new class539(15, 4);

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "Lbf;")
    public static class539 field3300 = new class539(16, -2);

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "Lbf;")
    public static class539 field3301 = new class539(17, 0);

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "Lbf;")
    public static class539 field3302 = new class539(18, -2);

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "Lbf;")
    public static class539 field3303 = new class539(19, -2);

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "Lbf;")
    public static class539 field3304 = new class539(22, -2);

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "Lbf;")
    public static class539 field3305 = new class539(23, 4);

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "Lbf;")
    public static class539 field3306 = new class539(24, -1);

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "Lbf;")
    public static class539 field3307 = new class539(26, 0);

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "Lbf;")
    public static class539 field3308 = new class539(27, 0);

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "Lbf;")
    public static class539 field3309 = new class539(28, -2);

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "[Lbf;")
    private static class539[] field3310 = new class539[32];

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "Lcha;")
    public static class220 field3313;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3311;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)Z")
    public final boolean method1569(int arg0) {
        field3294++;
        if (arg0 != -1) {
            this.method1569(98);
        }
        return (this.field3291 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Z")
    public final boolean method1570(int arg0, int arg1) {
        if (arg1 != 0) {
            field3303 = null;
        }
        field3288++;
        return (this.field3291 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)I")
    public final int method1571(boolean arg0) {
        if (arg0) {
            field3311 = null;
        }
        field3295++;
        return class118.method917(false, this.field3291);
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
    public static void method1572(int arg0) {
        field3299 = null;
        field3296 = null;
        field3303 = null;
        field3300 = null;
        field3304 = null;
        field3302 = null;
        field3311 = null;
        field3298 = null;
        field3308 = null;
        field3307 = null;
        if (arg0 < 32) {
            method1572(-6);
        }
        field3305 = null;
        field3313 = null;
        field3306 = null;
        field3301 = null;
        field3310 = null;
        field3309 = null;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)I")
    public final int method1573(int arg0) {
        field3292++;
        return arg0 == 0 ? this.field3291 >> 18 & 0x7 : -54;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)V")
    public static final void method1574(boolean arg0) {
        if (class547.field7642 == 1 || class547.field7642 == 3 || class547.field7642 != class365.field4710 && (class547.field7642 == 0 || class365.field4710 == 0)) {
            class54.field752 = 0;
            class646.field8947 = 0;
            class207.field2745.method1161(false);
        }
        if (!arg0) {
            method1572(31);
        }
        field3289++;
        class365.field4710 = class547.field7642;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(Z)Z")
    public final boolean method1575(boolean arg0) {
        field3293++;
        if (!arg0) {
            field3298 = null;
        }
        return (this.field3291 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)Z")
    public final boolean method1576(byte arg0) {
        if (arg0 <= 37) {
            this.method1570(-69, -33);
        }
        field3290++;
        return (this.field3291 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(II)V")
    public class262(int arg0, int arg1) {
        this.field3291 = arg0;
        this.field3297 = arg1;
    }

    static {
        class539[] var0 = class240.method1500((byte) -82);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field3310[var0[var1].field7471] = var0[var1];
        }
        field3313 = new class220(11, 8);
    }
}
