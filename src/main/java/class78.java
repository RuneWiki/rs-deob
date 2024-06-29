import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class78 extends class667 {

    @OriginalMember(owner = "client!kl", name = "G", descriptor = "[I")
    public static int[] field1463 = new int[1000];

    @OriginalMember(owner = "client!kl", name = "I", descriptor = "I")
    public static int field1465 = 0;

    @OriginalMember(owner = "client!kl", name = "J", descriptor = "F")
    public static float field1466;

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!kl", name = "C", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!kl", name = "E", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!kl", name = "F", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!kl", name = "H", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!kl", name = "K", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!kl", name = "L", descriptor = "I")
    private int field1468;

    @OriginalMember(owner = "client!kl", name = "M", descriptor = "I")
    private int field1469;

    @OriginalMember(owner = "client!kl", name = "N", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!kl", name = "O", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!kl", name = "P", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!kl", name = "Q", descriptor = "I")
    private int field1473;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)V", line = 3)
    private final void method775(int arg0, int arg1) {
        this.field1473 = arg1 >> 12 & 4080;
        this.field1468 = (arg1 & 255) << 4;
        ++field1462;
        if (arg0 == 1067112364) {
            this.field1469 = (arg1 & 65280) >> 4;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BIIIII)Z", line = 16)
    public static final boolean method776(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1460;
        for (int var6 = arg2; var6 <= arg3; ++var6) {
            for (int var8 = arg1; arg4 >= var8; ++var8) {
                if (~class36.field542[var6][var8] == ~arg5 && ~class125.field1916[var6][var8] >= -2) {
                    return true;
                }
            }
        }
        int var7 = 17 / ((-63 - arg0) / 37);
        return false;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZI)[[I", line = 49)
    public final int[][] method777(boolean arg0, int arg1) {
        if (arg0) {
            return null;
        } else {
            ++field1470;
            int[][] var3 = super.field9357.method2314((byte) 41, arg1);
            if (super.field9357.field5178) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; var7 < class77.field1455; ++var7) {
                    var4[var7] = this.field1473;
                    var5[var7] = this.field1469;
                    var6[var7] = this.field1468;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V", line = 92)
    public class78() {
        this(0);
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V", line = 95)
    public static void method778(int arg0) {
        if (arg0 > -86) {
            method778(97);
        }
        field1463 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIIIII)Z", line = 105)
    public static final boolean method779(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 != 1275) {
            field1466 = -1.1520462F;
        }
        ++field1472;
        if (arg0 + arg6 > arg5 && ~(arg4 + arg5) < ~arg6) {
            return arg3 < arg2 + arg8 && arg8 < arg3 + arg7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(I)V", line = 126)
    private class78(int arg0) {
        super(0, false);
        this.method775(1067112364, arg0);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lud;II)V", line = 141)
    public final void method116(class35 arg0, int arg1, int arg2) {
        ++field1459;
        if (arg1 == 3) {
            if (arg2 == 0) {
                this.method775(1067112364, arg0.method239(arg1 ^ -128));
            }
        }
    }
}
