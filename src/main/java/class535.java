import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class535 {

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public int field7647;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public int field7645;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public int field7643;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "S")
    public short field7641;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public int field7654;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public int field7653;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "S")
    public short field7639;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "Z")
    public boolean field7651;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "S")
    public short field7649;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "B")
    public byte field7646;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "Z")
    public static volatile boolean field7644 = true;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field7650 = new String[8];

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field7640;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field7642;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public static int field7648;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field7652;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public static void method3042(int arg0) {
        int var1 = 71 % ((arg0 + 1) / 61);
        field7650 = null;
        field7652 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(FIFFB)F")
    public static final float method3043(float arg0, int arg1, float arg2, float arg3, byte arg4) {
        field7640++;
        float[] var5 = class566.field8021[arg1];
        return arg4 == -120 ? var5[2] * arg2 + var5[0] * arg0 + var5[1] * arg3 : -0.13882686F;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)I")
    public static final int method3044(int arg0, int arg1) {
        return class217.field2625 == null ? 0 : class217.field2625[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class535(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field7647 = arg2;
        this.field7645 = arg1;
        this.field7643 = arg11;
        this.field7641 = (short) arg5;
        this.field7654 = arg3;
        this.field7653 = arg0;
        this.field7639 = (short) arg4;
        this.field7651 = arg10;
        this.field7649 = (short) arg6;
        this.field7646 = (byte) arg8;
    }
}
