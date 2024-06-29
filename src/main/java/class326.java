import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class326 extends class86 {

    @OriginalMember(owner = "client!rq", name = "K", descriptor = "I")
    private int field4693;

    @OriginalMember(owner = "client!rq", name = "y", descriptor = "I")
    private int field4681;

    @OriginalMember(owner = "client!rq", name = "M", descriptor = "I")
    private int field4695;

    @OriginalMember(owner = "client!rq", name = "B", descriptor = "I")
    private int field4684;

    @OriginalMember(owner = "client!rq", name = "D", descriptor = "[S")
    public static short[] field4686 = new short[256];

    @OriginalMember(owner = "client!rq", name = "z", descriptor = "I")
    public static int field4682 = 0;

    @OriginalMember(owner = "client!rq", name = "A", descriptor = "Z")
    public static boolean field4683 = false;

    @OriginalMember(owner = "client!rq", name = "L", descriptor = "[I")
    public static int[] field4694 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!rq", name = "u", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!rq", name = "v", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!rq", name = "w", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!rq", name = "x", descriptor = "I")
    private int field4680;

    @OriginalMember(owner = "client!rq", name = "C", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!rq", name = "E", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!rq", name = "F", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!rq", name = "G", descriptor = "I")
    private int field4689;

    @OriginalMember(owner = "client!rq", name = "H", descriptor = "I")
    private int field4690;

    @OriginalMember(owner = "client!rq", name = "J", descriptor = "I")
    private int field4692;

    @OriginalMember(owner = "client!rq", name = "I", descriptor = "[B")
    private byte[] field4691;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(III)V")
    public final void method256(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field4690 = this.field4693 - (arg0 < 0 ? -arg0 : arg0);
            this.field4692 = 4096;
            this.field4690 = this.field4690 * this.field4690 >> 12;
            this.field4689 = this.field4690;
        } else {
            this.field4692 = this.field4690 * this.field4681 >> 12;
            if (this.field4692 < 0) {
                this.field4692 = 0;
            } else if (this.field4692 > 4096) {
                this.field4692 = 4096;
            }
            this.field4690 = this.field4693 - (arg0 >= 0 ? arg0 : -arg0);
            this.field4690 = this.field4690 * this.field4690 >> 12;
            this.field4690 = this.field4692 * this.field4690 >> 12;
            this.field4689 += this.field4690 * this.field4684 >> 12;
            this.field4684 = this.field4695 * this.field4684 >> 12;
        }
        field4677++;
        int var4 = -19 % ((arg1 - 67) / 50);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
    public final void method261(byte arg0) {
        this.field4680 = 0;
        if (arg0 == 122) {
            field4687++;
            this.field4689 = 0;
        }
    }

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "(B)V")
    public static final void method2009(byte arg0) {
        class24 var1 = class277.field4065;
        synchronized (class277.field4065) {
            if (arg0 != -114) {
                return;
            }
            class277.field4065.method212(arg0 + 23);
        }
        field4685++;
    }

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "(I)V")
    public static void method2010(int arg0) {
        field4694 = null;
        field4686 = null;
        if (arg0 != -1) {
            field4686 = null;
        }
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class326(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4693 = (int) (arg6 * 4096.0F);
        this.field4681 = (int) (arg7 * 4096.0F);
        this.field4684 = this.field4695 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(Z)V")
    public final void method255(boolean arg0) {
        if (arg0) {
            field4694 = null;
        }
        this.field4689 >>= 0x4;
        this.field4684 = this.field4695;
        field4688++;
        if (this.field4689 < 0) {
            this.field4689 = 0;
        } else if (this.field4689 > 255) {
            this.field4689 = 255;
        }
        this.method1356(this.field4680++, (byte) this.field4689);
        this.field4689 = 0;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IB)V")
    public void method1356(int arg0, byte arg1) {
        field4679++;
        this.field4691[arg0] = arg1;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2011(int arg0, String arg1) {
        field4678++;
        System.out.println("Error: " + class368.method2431(arg1, "%0a", "\n", arg0 - 4));
        if (arg0 != 4) {
            method2010(-13);
        }
    }
}
