import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class376 extends class62 {

    @OriginalMember(owner = "client!vj", name = "I", descriptor = "[I")
    public static int[] field5196;

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!vj", name = "D", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!vj", name = "E", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!vj", name = "G", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!vj", name = "H", descriptor = "I")
    public static int field5195;

    static {
        new class572("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
        field5196 = new int[14];
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V", line = 4)
    public class376() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IB)[[I", line = 7)
    public final int[][] method409(int arg0, byte arg1) {
        ++field5194;
        int[][] var3 = super.field772.method2906(8, arg0);
        if (arg1 >= -20) {
            field5196 = null;
        }
        if (super.field772.field6899) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class438.field5847 > var7; ++var7) {
                this.method2247(var7, 17451, arg0);
                int[][] var8 = this.method407(0, (byte) 41, class254.field3663);
                var4[var7] = var8[0][class460.field6507];
                var5[var7] = var8[1][class460.field6507];
                var6[var7] = var8[2][class460.field6507];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(III)V", line = 52)
    private final void method2247(int arg0, int arg1, int arg2) {
        ++field5195;
        int var4 = class200.field2965[arg0];
        int var5 = class309.field4265[arg2];
        if (arg1 == 17451) {
            float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 - 2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class460.field6507 = arg0;
                class254.field3663 = arg2;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class460.field6507 = arg2;
                class254.field3663 = arg0;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class254.field3663 = arg0;
                class460.field6507 = class438.field5847 - arg2;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class460.field6507 = arg0;
                class254.field3663 = -arg2 + class14.field148;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class254.field3663 = -arg2 + class14.field148;
                class460.field6507 = -arg0 + class438.field5847;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class254.field3663 = -arg0 + class14.field148;
                class460.field6507 = -arg2 + class438.field5847;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class254.field3663 = -arg0 + class14.field148;
                class460.field6507 = arg2;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class254.field3663 = arg2;
                class460.field6507 = class438.field5847 - arg0;
            }
            class254.field3663 &= class285.field3989;
            class460.field6507 &= class410.field5604;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V", line = 132)
    public static final void method2248(byte arg0) {
        ++field5191;
        class580 var1 = (class580) class33.field397.method124((byte) 42);
        int var2 = -125 % ((arg0 - -1) / 51);
        while (var1 != null) {
            class488 var3 = var1.field8539;
            if (var3.field6945) {
                var1.method2457(-8422);
                var3.method2922((byte) -75);
            } else if (class617.field9123 >= var3.field6944) {
                var3.method2923(class647.field9402, -24);
                if (var3.field6945) {
                    var1.method2457(-8422);
                } else {
                    class320.method1933(var3, true);
                }
            }
            var1 = (class580) class33.field397.method120(19);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lgw;II)V", line = 168)
    public final void method11(class148 arg0, int arg1, int arg2) {
        ++field5192;
        if (~arg2 == arg1) {
            super.field788 = ~arg0.method1032((byte) -33) == -2;
        }
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(II)[I", line = 179)
    public final int[] method13(int arg0, int arg1) {
        if (arg1 != 656024161) {
            field5196 = null;
        }
        ++field5193;
        int[] var3 = super.field774.method3086(arg0, -2);
        if (super.field774.field7499) {
            for (int var4 = 0; var4 < class438.field5847; ++var4) {
                this.method2247(var4, 17451, arg0);
                int[] var5 = this.method408(class254.field3663, 0, (byte) -69);
                var3[var4] = var5[class460.field6507];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "(I)V", line = 216)
    public static void method2249(int arg0) {
        field5196 = null;
        if (arg0 != 22016) {
            field5196 = null;
        }
    }
}
