import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class358 extends class395 {

    @OriginalMember(owner = "client!un", name = "o", descriptor = "[I")
    private int[] field4813 = new int[this.field5619];

    @OriginalMember(owner = "client!un", name = "u", descriptor = "Lcba;")
    public static class471 field4819 = new class471(45, -1);

    @OriginalMember(owner = "client!un", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field4822 = new String[100];

    @OriginalMember(owner = "client!un", name = "A", descriptor = "[I")
    public static int[] field4825 = new int[2048];

    @OriginalMember(owner = "client!un", name = "B", descriptor = "Lej;")
    public static class104 field4826 = new class104("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!un", name = "q", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!un", name = "r", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!un", name = "s", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!un", name = "t", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!un", name = "v", descriptor = "I")
    private int field4820;

    @OriginalMember(owner = "client!un", name = "w", descriptor = "I")
    private int field4821;

    @OriginalMember(owner = "client!un", name = "z", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!un", name = "C", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!un", name = "y", descriptor = "Lcu;")
    public static class185 field4823;

    @OriginalMember(owner = "client!un", name = "p", descriptor = "[B")
    private byte[] field4814;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(BI)I")
    public static final int method2142(byte arg0, int arg1) {
        if (arg0 != 84) {
            field4823 = null;
        }
        ++field4818;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)V")
    public final void method915(byte arg0) {
        if (arg0 == 96) {
            ++field4827;
            this.field4821 = Math.abs(this.field4821);
            if (this.field4821 >= 4096) {
                this.field4821 = 4095;
            }
            this.method1916(this.field4820++, (byte) (this.field4821 >> 4), (byte) 104);
            this.field4821 = 0;
        }
    }

    @OriginalMember(owner = "client!un", name = "d", descriptor = "(I)V")
    public static void method2143(int arg0) {
        if (arg0 == 21102) {
            field4823 = null;
            field4826 = null;
            field4822 = null;
            field4819 = null;
            field4825 = null;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IBB)V")
    public void method1916(int arg0, byte arg1, byte arg2) {
        ++field4824;
        if (arg2 < 42) {
            this.field4821 = -20;
        }
        this.field4814[this.field4820++] = (byte) (127 + class589.method3454(127, arg1 >> 1));
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(IIIIIF)V")
    public class358(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~super.field5619 < ~var7; ++var7) {
            this.field4813[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(BII)V")
    public final void method919(byte arg0, int arg1, int arg2) {
        ++field4816;
        if (arg0 == -104) {
            this.field4821 += this.field4813[arg1] * arg2 >> 12;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(CI)Z")
    public static final boolean method2144(char arg0, int arg1) {
        if (arg1 >= -16) {
            return false;
        } else {
            ++field4817;
            return ~arg0 == -161 || arg0 == ' ' || ~arg0 == -96 || ~arg0 == -46;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V")
    public final void method917(int arg0) {
        ++field4815;
        this.field4821 = 0;
        if (arg0 != -28503) {
            this.field4821 = -63;
        }
        this.field4820 = 0;
    }
}
