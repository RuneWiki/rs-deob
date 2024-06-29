import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class203 extends class42 {

    @OriginalMember(owner = "client!vt", name = "o", descriptor = "Lgw;")
    public class118 field3128 = new class118();

    @OriginalMember(owner = "client!vt", name = "s", descriptor = "I")
    public static int field3132 = 0;

    @OriginalMember(owner = "client!vt", name = "t", descriptor = "[I")
    public static int[] field3133 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!vt", name = "p", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!vt", name = "q", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!vt", name = "r", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!vt", name = "u", descriptor = "I")
    public static int field3134;

    static {
        new class44("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(BII)V", line = 5)
    public static final void method1401(byte arg0, int arg1, int arg2) {
        if (class174.field2597 != arg1) {
            class539.field7939 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class539.field7939[var3] = (var3 << 12) / arg1;
            }
            class529.field7783 = arg1 - 1;
            class56.field1007 = arg1 * 32;
            class174.field2597 = arg1;
        }
        field3131++;
        if (arg0 != 55) {
            method1402(null, -19L, 81);
        }
        if (class362.field5263 == arg2) {
            return;
        }
        if (class174.field2597 == arg2) {
            class448.field6442 = class539.field7939;
        } else {
            class448.field6442 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class448.field6442[var4] = (var4 << 12) / arg2;
            }
        }
        class362.field5263 = arg2;
        class293.field4364 = arg2 - 1;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lqa;JI)V", line = 52)
    public static final void method1402(class167 arg0, long arg1, int arg2) {
        field3130++;
        class485.field7028 = 0;
        class51.field942 = class196.field2870;
        class196.field2870 = arg2;
        long var4 = class165.method1188((byte) 26);
        for (class115 var6 = (class115) class235.field3503.method904(false); var6 != null; var6 = (class115) class235.field3503.method907(arg2 - 1)) {
            if (var6.method811(arg0, arg1)) {
                class485.field7028++;
            }
        }
        if (class476.field6937 && (arg1 % 100L) == 0L) {
            System.out.println("Particle system count: " + class235.field3503.method903(-1) + ", running: " + class485.field7028 + ". Particles: " + class196.field2870 + ". Time taken: " + (class165.method1188((byte) 26) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)I", line = 84)
    public static final int method1403(int arg0, int arg1) {
        field3129++;
        int var2 = arg0 & 0x3F;
        int var3 = (arg0 & 0xC4) >> 6;
        if (arg1 > -6) {
            return 2;
        }
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V", line = 137)
    public static void method1404(byte arg0) {
        if (arg0 < 84) {
            method1402(null, 6L, 54);
        }
        field3133 = null;
    }
}
