import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class214 extends class32 {

    @OriginalMember(owner = "client!dr", name = "I", descriptor = "I")
    private int field3000;

    @OriginalMember(owner = "client!dr", name = "y", descriptor = "I")
    private int field2990;

    @OriginalMember(owner = "client!dr", name = "E", descriptor = "I")
    private int field2996;

    @OriginalMember(owner = "client!dr", name = "w", descriptor = "I")
    private int field2988;

    @OriginalMember(owner = "client!dr", name = "s", descriptor = "[I")
    public static int[] field2984 = new int[14];

    @OriginalMember(owner = "client!dr", name = "B", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!dr", name = "L", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!dr", name = "t", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!dr", name = "u", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!dr", name = "v", descriptor = "I")
    private int field2987;

    @OriginalMember(owner = "client!dr", name = "x", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!dr", name = "z", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!dr", name = "A", descriptor = "I")
    private int field2992;

    @OriginalMember(owner = "client!dr", name = "C", descriptor = "I")
    private int field2994;

    @OriginalMember(owner = "client!dr", name = "D", descriptor = "I")
    private int field2995;

    @OriginalMember(owner = "client!dr", name = "F", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!dr", name = "G", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!dr", name = "H", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!dr", name = "K", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!dr", name = "J", descriptor = "[B")
    private byte[] field3001;

    static {
        new class368("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
        field2993 = 0;
        field3003 = 0;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Z)V", line = 6)
    public final void method299(boolean arg0) {
        field2991++;
        this.field2994 >>= 0x4;
        this.field2988 = this.field2996;
        if (this.field2994 < 0) {
            this.field2994 = 0;
        } else if (this.field2994 > 255) {
            this.field2994 = 255;
        }
        this.method1428(this.field2987++, (byte) this.field2994);
        if (arg0) {
            field2999 = 75;
        }
        this.field2994 = 0;
    }

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "(I)V", line = 38)
    public static void method1426(int arg0) {
        if (arg0 <= 60) {
            field3003 = -89;
        }
        field2984 = null;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIB)I", line = 57)
    public static final int method1427(int arg0, int arg1, byte arg2) {
        field2985++;
        int var3 = 123 / ((arg2 + 50) / 60);
        int var4 = arg1 >> 31 & arg0 - 1;
        return ((arg1 >>> 31) + arg1) % arg0 + var4;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V", line = 71)
    public final void method291(int arg0) {
        this.field2987 = 0;
        int var2 = 86 % ((arg0 + 36) / 51);
        this.field2994 = 0;
        field2986++;
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(IIIIIFFF)V", line = 82)
    public class214(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field3000 = (int) (arg7 * 4096.0F);
        this.field2990 = (int) (arg6 * 4096.0F);
        this.field2988 = this.field2996 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IB)V", line = 92)
    public void method1428(int arg0, byte arg1) {
        field2997++;
        this.field3001[arg0] = arg1;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIZ)V", line = 108)
    public final void method293(int arg0, int arg1, boolean arg2) {
        field2989++;
        if (!arg2) {
            return;
        }
        if (arg1 == 0) {
            this.field2995 = this.field2990 - (arg0 < 0 ? -arg0 : arg0);
            this.field2992 = 4096;
            this.field2995 = this.field2995 * this.field2995 >> 12;
            this.field2994 = this.field2995;
            return;
        }
        this.field2992 = this.field3000 * this.field2995 >> 12;
        this.field2995 = this.field2990 - (arg0 >= 0 ? arg0 : -arg0);
        if (this.field2992 < 0) {
            this.field2992 = 0;
        } else if (this.field2992 > 4096) {
            this.field2992 = 4096;
        }
        this.field2995 = this.field2995 * this.field2995 >> 12;
        this.field2995 = this.field2995 * this.field2992 >> 12;
        this.field2994 += this.field2995 * this.field2988 >> 12;
        this.field2988 = this.field2996 * this.field2988 >> 12;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;I)V", line = 147)
    public static final void method1429(String arg0, int arg1, int arg2, String arg3, String arg4, int arg5) {
        field2998++;
        if (arg1 != 23653) {
            method1429((String) null, 16, -42, (String) null, (String) null, -66);
        }
        class303.method1839(arg0, -1, -1, arg5, (String) null, arg2, arg3, arg4);
    }
}
