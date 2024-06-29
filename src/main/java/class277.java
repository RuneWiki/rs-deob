import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class277 extends class236 {

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "J")
    public long field4824;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    public static int field4823 = 0;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "Lsg;")
    public static class30 field4825 = class167.method1221((byte) 33, "(U(Y");

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "[I")
    public static int[] field4826 = new int[50];

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "Lsg;")
    public static class30 field4831 = class167.method1221((byte) 33, " loggt sich ein)3");

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "Lsg;")
    public static class30 field4832 = class167.method1221((byte) 33, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "Lsg;")
    public static class30 field4833 = class167.method1221((byte) 33, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "Lsg;")
    public static class30 field4835 = class167.method1221((byte) 33, "(U0a )2 in: ");

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "Llk;")
    public static class232 field4830 = new class232(64);

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "Lsg;")
    public static class30 field4837 = class167.method1221((byte) 33, "Weiter");

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "Lsg;")
    public static class30 field4836 = class167.method1221((byte) 33, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "Lud;")
    public static class235 field4838;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)V")
    public static void method1871(int arg0) {
        field4833 = null;
        field4832 = null;
        field4838 = null;
        field4837 = null;
        field4826 = null;
        field4831 = null;
        field4836 = null;
        field4830 = null;
        int var1 = 39 % ((-arg0 - 32) / 62);
        field4835 = null;
        field4825 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)V")
    public static final void method1872(byte arg0, int arg1) {
        field4834++;
        int var2 = 43 % ((-arg0 - 53) / 49);
        if (class1.method9(arg1, (byte) -13)) {
            class50.method498(0, -1, class259.field4572[arg1]);
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
    public class277() {
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(III)Lqd;")
    public static final class35 method1873(int arg0, int arg1, int arg2) {
        class195 var3 = class71.field1613[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3522; var4++) {
            class35 var5 = var3.field3540[var4];
            if ((var5.field863 >> 29 & 0x3L) == 2L && var5.field854 == arg1 && var5.field856 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(J)V")
    public class277(long arg0) {
        this.field4824 = arg0;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZII)V")
    public static final void method1874(int arg0, boolean arg1, int arg2, int arg3) {
        field4827++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class134.field2618 = arg1;
        if (arg2 != -17799) {
            field4837 = null;
        }
        class130.field2574 = arg0;
        class121.field2389 = arg3;
    }
}
