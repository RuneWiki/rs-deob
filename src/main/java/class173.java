import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class173 extends class32 {

    @OriginalMember(owner = "client!hq", name = "x", descriptor = "[I")
    private int[] field2314 = new int[this.field464];

    @OriginalMember(owner = "client!hq", name = "w", descriptor = "I")
    public static int field2313 = 0;

    @OriginalMember(owner = "client!hq", name = "q", descriptor = "[I")
    public static int[] field2307 = new int[5];

    @OriginalMember(owner = "client!hq", name = "z", descriptor = "Ljava/lang/String;")
    public static String field2316 = "Please wait...";

    @OriginalMember(owner = "client!hq", name = "p", descriptor = "[I")
    public static int[] field2306 = new int[4096];

    @OriginalMember(owner = "client!hq", name = "A", descriptor = "F")
    public static float field2317;

    @OriginalMember(owner = "client!hq", name = "r", descriptor = "I")
    private int field2308;

    @OriginalMember(owner = "client!hq", name = "s", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!hq", name = "t", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!hq", name = "u", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!hq", name = "v", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!hq", name = "y", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!hq", name = "B", descriptor = "I")
    private int field2318;

    @OriginalMember(owner = "client!hq", name = "D", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!hq", name = "E", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "Z")
    public static boolean field2305;

    @OriginalMember(owner = "client!hq", name = "C", descriptor = "[B")
    private byte[] field2319;

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(IIIIIF)V")
    public class173(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~super.field464 < ~var7; ++var7) {
            this.field2314[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "(I)V")
    public static void method1067(int arg0) {
        if (arg0 < 6) {
            field2317 = -0.6261936F;
        }
        field2316 = null;
        field2306 = null;
        field2307 = null;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
    public final void method199(int arg0) {
        if (arg0 != 255) {
            this.method578(-112, (byte) -74);
        }
        this.field2318 = Math.abs(this.field2318);
        ++field2309;
        if (~this.field2318 <= -4097) {
            this.field2318 = 4095;
        }
        this.method578(this.field2308++, (byte) (this.field2318 >> 4));
        this.field2318 = 0;
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V")
    public final void method197(int arg0) {
        this.field2318 = 0;
        this.field2308 = 0;
        ++field2311;
        if (arg0 <= 50) {
            this.field2314 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "(I)V")
    public static final void method1068(int arg0) {
        ++field2312;
        if (arg0 != 127) {
            method1067(-98);
        }
        class366.field5296 = null;
        class398.field5925 = null;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IB)V")
    public void method578(int arg0, byte arg1) {
        ++field2321;
        this.field2319[this.field2308++] = (byte) (127 + class183.method1117(arg1 >> 1, 127));
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IBI)V")
    public final void method195(int arg0, byte arg1, int arg2) {
        ++field2315;
        this.field2318 += this.field2314[arg0] * arg2 >> 12;
        int var4 = -58 / ((-79 - arg1) / 42);
    }
}
