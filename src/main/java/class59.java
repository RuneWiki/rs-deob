import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class59 extends class184 {

    @OriginalMember(owner = "client!tn", name = "E", descriptor = "I")
    private int field761 = -1;

    @OriginalMember(owner = "client!tn", name = "P", descriptor = "Lup;")
    public static class181 field770 = new class181(13, 5);

    @OriginalMember(owner = "client!tn", name = "S", descriptor = "F")
    public static float field773 = 0.0F;

    @OriginalMember(owner = "client!tn", name = "T", descriptor = "Lap;")
    public static class335 field774 = new class335("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!tn", name = "F", descriptor = "I")
    public int field762;

    @OriginalMember(owner = "client!tn", name = "G", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!tn", name = "H", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!tn", name = "J", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!tn", name = "K", descriptor = "I")
    public int field766;

    @OriginalMember(owner = "client!tn", name = "M", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!tn", name = "N", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!tn", name = "O", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!tn", name = "Q", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!tn", name = "R", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!tn", name = "U", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!tn", name = "D", descriptor = "[I")
    public int[] field760;

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V")
    public class59() {
        super(0, false);
    }

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "(I)Z")
    public final boolean method545(int arg0) {
        if (arg0 != -1929842396) {
            field774 = null;
        }
        ++field775;
        if (this.field760 != null) {
            return true;
        } else if (this.field761 >= 0) {
            class311 var2 = ~class533.field7843 <= -1 ? class311.method1816(class505.field7280, class533.field7843, this.field761) : class311.method1825(class505.field7280, this.field761);
            var2.method1824();
            this.field760 = var2.method1814();
            this.field766 = var2.field3980;
            this.field762 = var2.field3974;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "(I)V")
    public static void method546(int arg0) {
        int var1 = -123 % ((arg0 - -30) / 48);
        field770 = null;
        field774 = null;
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(II)[[I")
    public int[][] method13(int arg0, int arg1) {
        ++field765;
        if (arg1 != 1) {
            return null;
        } else {
            int[][] var3 = super.field2416.method3031(-28526, arg0);
            if (super.field2416.field7271 && this.method545(arg1 + -1929842397)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = (class79.field1026 == this.field766 ? arg0 : this.field766 * arg0 / class79.field1026) * this.field762;
                if (~class245.field3167 == ~this.field762) {
                    for (int var8 = 0; class245.field3167 > var8; ++var8) {
                        int var9 = this.field760[var7++];
                        var6[var8] = class378.method2145(4080, var9 << 4);
                        var5[var8] = class378.method2145(4080, var9 >> 4);
                        var4[var8] = class378.method2145(var9 >> 12, 4080);
                    }
                } else {
                    for (int var10 = 0; ~var10 > ~class245.field3167; ++var10) {
                        int var11 = this.field762 * var10 / class245.field3167;
                        int var12 = this.field760[var7 - -var11];
                        var6[var10] = class378.method2145(255, var12) << 4;
                        var5[var10] = class378.method2145(4080, var12 >> 4);
                        var4[var10] = class378.method2145(16711680, var12) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lfh;Ljava/lang/String;B)I")
    public static final int method547(class463 arg0, String arg1, byte arg2) {
        ++field763;
        int var3 = arg0.field6631;
        byte[] var4 = class78.method669((byte) -89, arg1);
        arg0.method2740(var4.length, 123);
        arg0.field6631 += class49.field643.method1012(arg0.field6618, var4.length, 0, var4, -105, arg0.field6631);
        if (arg2 >= -68) {
            field774 = null;
        }
        return -var3 + arg0.field6631;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)I")
    public final int method548(byte arg0) {
        int var2 = -86 / ((arg0 - 54) / 44);
        ++field768;
        return this.field761;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BILfh;)V")
    public final void method7(byte arg0, int arg1, class463 arg2) {
        if (~arg1 == -1) {
            this.field761 = arg2.method2758((byte) 79);
        }
        ++field771;
        int var4 = -100 / ((-13 - arg0) / 51);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
    public final void method549(int arg0) {
        super.method549(arg0);
        ++field767;
        this.field760 = null;
    }
}
