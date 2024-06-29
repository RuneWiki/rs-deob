import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class258 extends class144 {

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "I")
    private int field3747 = 4096;

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "I")
    private int field3751 = 4096;

    @OriginalMember(owner = "client!ij", name = "O", descriptor = "I")
    private int field3753 = 4096;

    @OriginalMember(owner = "client!ij", name = "P", descriptor = "Ljava/lang/String;")
    public static String field3754 = "shake:";

    @OriginalMember(owner = "client!ij", name = "R", descriptor = "Z")
    public static boolean field3756 = false;

    @OriginalMember(owner = "client!ij", name = "T", descriptor = "Ljava/lang/String;")
    public static String field3758 = "Allocated memory";

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!ij", name = "N", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!ij", name = "Q", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!ij", name = "U", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!ij", name = "S", descriptor = "La;")
    public static class154 field3757;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BI)[[I")
    public final int[][] method8(byte arg0, int arg1) {
        if (arg0 != 5) {
            this.field3747 = -25;
        }
        int[][] var3 = super.field2053.method1542(98, arg1);
        if (super.field2053.field3408) {
            int[][] var4 = this.method927(arg1, true, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class104.field1411; ++var11) {
                int var12 = var7[var11];
                int var13 = var6[var11];
                int var14 = var5[var11];
                if (~var12 == ~var13 && var12 == var14) {
                    var9[var11] = this.field3753 * var13 >> 12;
                    var8[var11] = this.field3747 * var12 >> 12;
                    var10[var11] = this.field3751 * var14 >> 12;
                } else {
                    var9[var11] = this.field3753;
                    var8[var11] = this.field3747;
                    var10[var11] = this.field3751;
                }
            }
        }
        ++field3755;
        return var3;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        if (arg2 == 20630) {
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (~arg0 == -3) {
                        this.field3751 = arg1.method1380(true);
                    }
                } else {
                    this.field3747 = arg1.method1380(true);
                }
            } else {
                this.field3753 = arg1.method1380(true);
            }
            ++field3752;
        }
    }

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "(I)V")
    public static void method1650(int arg0) {
        field3754 = null;
        field3757 = null;
        if (arg0 == 1001211884) {
            field3758 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
    public class258() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(BI)V")
    public static final void method1651(byte arg0, int arg1) {
        if (arg0 == 65) {
            class243.field3544.method62(-67, arg1);
            ++field3749;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lbc;[Lpg;B)V")
    public static final void method1652(class282 arg0, class187[] arg1, byte arg2) {
        class161.field2316 = arg0;
        ++field3759;
        class190.field2742 = arg1;
        class24.field290 = new boolean[class190.field2742.length];
        class28.field342.method1898(93);
        int var3 = class161.field2316.method1844("details", 97);
        int[] var4 = class161.field2316.method1851(1, var3);
        int var5 = 0;
        int var6 = 52 % ((arg2 - 28) / 35);
        while (var4.length > var5) {
            class28.field342.method1894(-1, class17.method102(var4[var5], -3, new class216(class161.field2316.method1861(var4[var5], var3, 1))), (long) var4[var5]);
            ++var5;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
    public static final boolean method1653(String arg0, int arg1, String arg2) {
        int var3 = arg2.length();
        ++field3750;
        int var4 = arg0.length();
        if (var3 < var4) {
            return false;
        } else {
            for (int var5 = arg1; ~var4 < ~var5; ++var5) {
                char var6 = arg2.charAt(var5);
                char var7 = arg0.charAt(var5);
                if (var6 != var7 && Character.toLowerCase(var6) != Character.toLowerCase(var7) && ~Character.toUpperCase(var6) != ~Character.toUpperCase(var7)) {
                    return false;
                }
            }
            return true;
        }
    }
}
