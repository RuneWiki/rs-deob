import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class345 extends class258 {

    @OriginalMember(owner = "client!qfa", name = "t", descriptor = "Luw;")
    public static class208 field4224 = new class208(82, 17);

    @OriginalMember(owner = "client!qfa", name = "m", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!qfa", name = "n", descriptor = "I")
    private int field4218;

    @OriginalMember(owner = "client!qfa", name = "p", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!qfa", name = "r", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!qfa", name = "s", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!qfa", name = "u", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!qfa", name = "v", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!qfa", name = "w", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!qfa", name = "q", descriptor = "Luw;")
    public static class208 field4221;

    @OriginalMember(owner = "client!qfa", name = "x", descriptor = "Ld;")
    public static class284 field4228;

    @OriginalMember(owner = "client!qfa", name = "y", descriptor = "Ld;")
    public static class284 field4229;

    @OriginalMember(owner = "client!qfa", name = "o", descriptor = "Ljava/lang/String;")
    private String field4219;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lid;Lka;IIIB)V", line = 3)
    public static final void method1997(class486 arg0, class299 arg1, int arg2, int arg3, int arg4, byte arg5) {
        field4226++;
        if (arg5 <= 82) {
            field4221 = null;
        }
        if (arg1 != null) {
            arg0.method2724(arg1.method1231(), arg2, arg1.method1260(), arg4, arg3, arg1.method1261(), arg1.method1290(), arg1.method1300(), -11, arg1.method1245(), arg1.method1279());
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)V", line = 20)
    public static void method1998(int arg0) {
        field4229 = null;
        field4224 = null;
        field4221 = null;
        if (arg0 == -22391) {
            field4228 = null;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 34)
    public static final boolean method1999(int arg0, String arg1) {
        field4217++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 <= 118) {
            field4228 = null;
        }
        for (int var2 = 0; var2 < class703.field9297; var2++) {
            if (arg1.equalsIgnoreCase(class176.field2319[var2])) {
                return true;
            }
        }
        return arg1.equalsIgnoreCase(class422.field5564.field375);
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lck;IB[IIZII)Lrc;", line = 66)
    public static final class59 method2000(class733 arg0, int arg1, byte arg2, int[] arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (arg2 >= -9) {
            return null;
        }
        field4225++;
        if (!arg0.field9891 && (!class735.method3997(arg6, (byte) -115) || !class735.method3997(arg7, (byte) -103))) {
            return arg0.field9876 ? new class59(arg0, 34037, arg6, arg7, arg5, arg3, arg4, arg1) : new class59(arg0, arg6, arg7, class483.method2714(arg6, (byte) -119), class483.method2714(arg7, (byte) -119), arg3);
        } else {
            return new class59(arg0, 3553, arg6, arg7, arg5, arg3, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(BLmc;)V", line = 89)
    public final void method546(byte arg0, class234 arg1) {
        this.field4218 = arg1.method1497((byte) 63);
        field4227++;
        int var3 = 69 / ((7 - arg0) / 41);
        this.field4219 = arg1.method1540((byte) -128);
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lim;B)V", line = 103)
    public final void method547(class652 arg0, byte arg1) {
        field4223++;
        if (arg1 < 123) {
            this.field4218 = 31;
        }
        arg0.method3518(this.field4219, true, this.field4218);
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIIIIIIII)V", line = 115)
    public static final void method2001(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4220++;
        if (arg6 < 512 || arg2 < 512 || arg6 > (class240.field3280 * 512 - 1024) || arg2 > ((class276.field3602 - 2) * 512)) {
            class128.field1716[0] = class128.field1716[1] = -1;
            return;
        }
        int var10 = class512.method2831(arg9, (byte) -59, arg6, arg2) - arg5;
        if (class602.field7657) {
            class784.method4301(true, 0);
        } else {
            class129.field1724.method450(arg8, 0, 0);
            class576.field7320.method991(class129.field1724);
        }
        if (class653.field8360) {
            class576.field7320.method923(arg6, var10, arg2, class628.field7974, class128.field1716);
        } else {
            class576.field7320.method987(arg6, var10, arg2, class128.field1716);
        }
        if (arg3 != -4263) {
            field4221 = null;
        }
        if (class602.field7657) {
            class679.method3652(-1);
        } else {
            class129.field1724.method450(-arg8, 0, 0);
            class576.field7320.method991(class129.field1724);
        }
    }
}
