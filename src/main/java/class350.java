import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class350 extends class17 {

    @OriginalMember(owner = "client!pba", name = "s", descriptor = "[I")
    private int[] field4896 = new int[this.field308];

    @OriginalMember(owner = "client!pba", name = "u", descriptor = "I")
    public static int field4898 = 104;

    @OriginalMember(owner = "client!pba", name = "t", descriptor = "F")
    public static float field4897;

    @OriginalMember(owner = "client!pba", name = "o", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!pba", name = "q", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!pba", name = "r", descriptor = "I")
    private int field4895;

    @OriginalMember(owner = "client!pba", name = "v", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!pba", name = "w", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!pba", name = "x", descriptor = "I")
    private int field4901;

    @OriginalMember(owner = "client!pba", name = "y", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!pba", name = "z", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!pba", name = "A", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!pba", name = "p", descriptor = "[B")
    private byte[] field4893;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)V", line = 8)
    public final void method162(int arg0) {
        this.field4901 = Math.abs(this.field4901);
        ++field4903;
        if (this.field4901 >= 4096) {
            this.field4901 = 4095;
        }
        this.method1039(this.field4895++, (byte) (this.field4901 >> 4), 255);
        this.field4901 = arg0;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(B)V", line = 23)
    public final void method157(byte arg0) {
        ++field4894;
        this.field4901 = 0;
        int var2 = -9 % ((arg0 - 1) / 43);
        this.field4895 = 0;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IBI)V", line = 34)
    public void method1039(int arg0, byte arg1, int arg2) {
        ++field4904;
        this.field4893[this.field4895++] = (byte) (127 + (class702.method3977(arg1, arg2) >> 1));
    }

    @OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(IIIIIF)V", line = 49)
    public class350(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; super.field308 > var7; ++var7) {
            this.field4896[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IZI)V", line = 66)
    public final void method159(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.field4901 += this.field4896[arg0] * arg2 >> 12;
            ++field4899;
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IZLrca;)Z", line = 80)
    public static final boolean method2218(int arg0, boolean arg1, class478 arg2) {
        class27.field400.method1885(arg2.field6712[arg0], arg2.field6711[arg0], arg2.field6717[arg0], class520.field7342);
        ++field4902;
        if (!arg1) {
            method2219((byte) -6);
        }
        int var3 = class520.field7342[2];
        if (var3 < 50) {
            return false;
        } else {
            arg2.field6713[arg0] = (short) (class520.field7342[0] * class348.field4874 / var3 + class244.field3631);
            arg2.field6707[arg0] = (short) (class520.field7342[1] * class662.field9215 / var3 + class284.field4195);
            arg2.field6719[arg0] = (short) var3;
            return true;
        }
    }

    @OriginalMember(owner = "client!pba", name = "d", descriptor = "(B)V", line = 100)
    public static final void method2219(byte arg0) {
        ++field4892;
        class256.field3768.method2909((byte) -2);
        class757.method4205((byte) -110);
        class556.field7934 = null;
        class625.field8754 = 0;
        class110.field1640.field7042 = 0;
        class467.field6559 = null;
        class518.field7312 = null;
        class154.field2189 = 0;
        class182.method1295(-109);
        class393.field5405 = null;
        class762.field10501 = null;
        class500.field7110 = 0;
        class459.field6423 = null;
        int var1 = -72 / ((71 - arg0) / 48);
        class187.field2886 = 0;
        class195.field2999 = null;
        class22.field365 = 0;
    }
}
