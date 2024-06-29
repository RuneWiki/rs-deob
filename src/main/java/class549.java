import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class549 {

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Lnd;")
    private class547 field7677;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    private int field7675;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "[Z")
    private boolean[] field7673;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "[[I")
    private int[][] field7680;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field7672;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field7674;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field7676;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field7678;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field7679;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)Ljca;", line = 3)
    public final class686 method3190(byte arg0, int arg1) {
        field7674++;
        byte[] var3 = this.field7677.method3153(arg1, 0, 1);
        class686 var4 = new class686();
        int var5 = 112 % ((30 - arg0) / 44);
        var4.method3857(1, new class461(var3));
        return var4;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)Z", line = 21)
    public final boolean method3191(int arg0) {
        field7676++;
        if (arg0 <= 37) {
            this.field7677 = null;
        }
        return this.field7675 != -1;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)[I", line = 35)
    public final int[] method3192(int arg0, byte arg1) {
        field7679++;
        if (arg0 < 0 || arg0 >= this.field7680.length) {
            return this.field7675 == -1 ? new int[0] : new int[] { this.field7675 };
        } else if (!this.field7673[arg0] || this.field7680[arg0].length <= 1) {
            return this.field7680[arg0];
        } else if (arg1 > -54) {
            return null;
        } else {
            int var3 = this.field7675 == -1 ? 0 : 1;
            Random var4 = new Random();
            int[] var5 = new int[this.field7680[arg0].length];
            class135.method995(this.field7680[arg0], 0, var5, 0, var5.length);
            for (int var6 = var3; var6 < var5.length; var6++) {
                int var7 = var3 + class596.method3377(var5.length - var3, var4, -102);
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)Ljava/lang/String;", line = 80)
    public static final String method3193(byte arg0) {
        field7678++;
        if (class14.field276 || class438.field5836 == null) {
            return "";
        } else if ((class438.field5836.field3475 == null || class438.field5836.field3475.length() == 0) && class438.field5836.field3482 != null && class438.field5836.field3482.length() > 0) {
            return class438.field5836.field3482;
        } else {
            if (arg0 >= -3) {
                field7672 = -68;
            }
            return class438.field5836.field3475;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lr;III[Z)V", line = 108)
    public static final void method3194(class185 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class395.field5009 == class195.field2669) {
            return;
        }
        int var5 = class707.field9826[arg1].method1676(arg2, true, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class282 var7 = class707.field9826[var6];
                if (var7 != null) {
                    var7.method1685(arg0, arg2, var5 - var7.method1676(arg2, true, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lal;ILnd;)V", line = 135)
    public class549(class102 arg0, int arg1, class547 arg2) {
        this.field7677 = arg2;
        this.field7677.method3178((byte) 113, 1);
        class461 var4 = new class461(this.field7677.method3153(0, 0, 0));
        int var5 = var4.method2600((byte) -126);
        if (var5 > 3) {
            this.field7680 = new int[0][];
            this.field7673 = new boolean[0];
            this.field7675 = -1;
        } else {
            int var6 = var4.method2600((byte) -124);
            class223[] var7 = class587.method3334((byte) -108);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method2600((byte) -126);
                    if (var7[var9].field2983 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method2600((byte) -125);
                int var12 = var4.method2600((byte) -127);
                if (var5 <= 2) {
                    this.field7675 = -1;
                } else {
                    this.field7675 = var4.method2577(2);
                }
                this.field7673 = new boolean[var12 + 1];
                this.field7680 = new int[var12 + 1][];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method2600((byte) -126);
                    this.field7673[var15] = var4.method2600((byte) -123) == 1;
                    int var16 = var4.method2566(-2);
                    if (this.field7675 == -1) {
                        this.field7680[var15] = new int[var16];
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field7680[var15][var18] = var4.method2566(-2);
                        }
                    } else {
                        this.field7680[var15] = new int[var16 + 1];
                        this.field7680[var15][0] = this.field7675;
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field7680[var15][var17 + 1] = var4.method2566(-2);
                        }
                    }
                }
                for (int var14 = 0; var14 < (var12 + 1); var14++) {
                    if (this.field7680[var14] == null) {
                        if (this.field7675 == -1) {
                            this.field7680[var14] = new int[0];
                        } else {
                            this.field7680[var14] = new int[] { this.field7675 };
                        }
                    }
                }
            } else {
                this.field7680 = new int[0][];
                this.field7675 = -1;
                this.field7673 = new boolean[0];
            }
        }
    }
}
