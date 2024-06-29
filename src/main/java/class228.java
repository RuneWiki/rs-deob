import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class228 extends class73 {

    @OriginalMember(owner = "client!re", name = "v", descriptor = "I")
    private int field3800;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    private int field3795;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    private int field3794;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "I")
    private int field3798;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "[I")
    public static int[] field3796 = new int[8];

    @OriginalMember(owner = "client!re", name = "o", descriptor = "Lqu;")
    public static class219 field3793 = new class219(51, -1);

    @OriginalMember(owner = "client!re", name = "w", descriptor = "Lbi;")
    public static class104 field3801 = new class104(53, -2);

    @OriginalMember(owner = "client!re", name = "x", descriptor = "Lss;")
    public static class213 field3802 = new class213("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public static void method1639(byte arg0) {
        field3793 = null;
        field3796 = null;
        field3802 = null;
        field3801 = null;
        if (arg0 > -113) {
            field3801 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZI)V")
    public final void method538(int arg0, boolean arg1, int arg2) {
        ++field3799;
        int var4 = this.field3795 * arg0 >> 12;
        int var5 = this.field3798 * arg0 >> 12;
        int var6 = this.field3794 * arg2 >> 12;
        if (arg1) {
            field3802 = null;
        }
        int var7 = this.field3800 * arg2 >> 12;
        class270.method1827(super.field1098, var6, var4, var5, var7, 353);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILhw;Ljava/lang/String;)I")
    public static final int method1640(int arg0, class208 arg1, String arg2) {
        ++field3792;
        if (arg0 != -971571636) {
            return -14;
        } else {
            int var3 = arg1.field3162;
            byte[] var4 = class6.method54(-89, arg2);
            arg1.method1476(var4.length, (byte) -106);
            arg1.field3162 += class502.field7530.method2948(var4.length, arg1.field3162, arg0 + 971552679, 0, var4, arg1.field3193);
            return -var3 + arg1.field3162;
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(IIIIII)V")
    public class228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3800 = arg3;
        this.field3795 = arg0;
        this.field3794 = arg1;
        this.field3798 = arg2;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIB)V")
    public final void method532(int arg0, int arg1, byte arg2) {
        ++field3791;
        if (arg2 != -67) {
            this.method537(35, -122, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(IIB)V")
    public final void method537(int arg0, int arg1, byte arg2) {
        if (arg2 < -78) {
            ++field3797;
        }
    }
}
