import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class235 extends class646 {

    @OriginalMember(owner = "client!tu", name = "J", descriptor = "I")
    private int field3477 = -1;

    @OriginalMember(owner = "client!tu", name = "P", descriptor = "Lqj;")
    public static class511 field3482 = new class511(4, 4);

    @OriginalMember(owner = "client!tu", name = "W", descriptor = "[I")
    public static int[] field3489 = new int[14];

    @OriginalMember(owner = "client!tu", name = "V", descriptor = "[Ljava/lang/String;")
    public static String[] field3488 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!tu", name = "I", descriptor = "I")
    private int field3476;

    @OriginalMember(owner = "client!tu", name = "K", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!tu", name = "L", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!tu", name = "M", descriptor = "I")
    private int field3480;

    @OriginalMember(owner = "client!tu", name = "O", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!tu", name = "Q", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!tu", name = "S", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!tu", name = "U", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!tu", name = "X", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!tu", name = "R", descriptor = "Lgm;")
    public static class509 field3484;

    @OriginalMember(owner = "client!tu", name = "T", descriptor = "[I")
    private int[] field3486;

    @OriginalMember(owner = "client!tu", name = "Y", descriptor = "[Z")
    public static boolean[] field3491;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(III)V", line = 5)
    public final void method1538(int arg0, int arg1, int arg2) {
        super.method1538(arg0, arg1, arg2);
        ++field3478;
        if (~this.field3477 <= -1 && class213.field3241 != null) {
            int var4 = !class213.field3241.method2359(arg1 + -127, this.field3477).field5222 ? 128 : 64;
            this.field3486 = class213.field3241.method2360(var4, false, this.field3477, (byte) 118, 1.0F, var4);
            this.field3480 = var4;
            this.field3476 = var4;
        }
    }

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "(III)Z", line = 25)
    public static final boolean method1539(int arg0, int arg1, int arg2) {
        ++field3483;
        if (arg2 >= -71) {
            field3484 = null;
        }
        return ~(arg0 & 458752) != -1 | class216.method1459(false, arg1, arg0) || class619.method3497(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)I", line = 36)
    public final int method1540(int arg0) {
        ++field3490;
        return arg0 != 0 ? -65 : this.field3477;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)[[I", line = 47)
    public final int[][] method298(int arg0, int arg1) {
        ++field3481;
        int[][] var3 = super.field9164.method1002(96, arg1);
        if (arg0 != -12424) {
            field3484 = null;
        }
        if (super.field9164.field2082) {
            int var4 = (~class236.field3492 == ~this.field3476 ? arg1 : this.field3476 * arg1 / class236.field3492) * this.field3480;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class89.field1330 == this.field3480) {
                for (int var8 = 0; ~var8 > ~class89.field1330; ++var8) {
                    int var9 = this.field3486[var4++];
                    var7[var8] = class248.method1593(4080, var9 << 4);
                    var6[var8] = class248.method1593(var9, 65280) >> 4;
                    var5[var8] = class248.method1593(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class89.field1330; ++var10) {
                    int var11 = this.field3480 * var10 / class89.field1330;
                    int var12 = this.field3486[var4 + var11];
                    var7[var10] = class248.method1593(var12, 255) << 4;
                    var6[var10] = class248.method1593(var12, 65280) >> 4;
                    var5[var10] = class248.method1593(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILek;)Ljava/lang/String;", line = 112)
    public static final String method1541(int arg0, class465 arg1) {
        if (arg0 != 32767) {
            return null;
        } else {
            ++field3479;
            return class435.method2551(0, arg1, 32767);
        }
    }

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "(I)V", line = 123)
    public static void method1542(int arg0) {
        field3491 = null;
        field3489 = null;
        field3484 = null;
        field3482 = null;
        field3488 = null;
        if (arg0 != 16711680) {
            field3491 = null;
        }
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "()V", line = 139)
    public class235() {
        super(0, false);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lek;IB)V", line = 142)
    public final void method295(class465 arg0, int arg1, byte arg2) {
        if (arg1 == 0) {
            this.field3477 = arg0.method2755((byte) -87);
        }
        ++field3487;
        if (arg2 < 7) {
            this.method1543(-64);
        }
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V", line = 156)
    public final void method1543(int arg0) {
        ++field3485;
        super.method1543(-122);
        int var2 = -69 % ((-49 - arg0) / 45);
        this.field3486 = null;
    }
}
