import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class80 extends class227 {

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "I")
    private int field981 = 4096;

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "I")
    private int field984 = 4096;

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "I")
    private int field980 = 4096;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "Ljc;")
    public static class305 field979 = new class305("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "(I)Z", line = 6)
    public static final boolean method452(int arg0) {
        ++field977;
        try {
            if (class97.field1260 == 2) {
                if (class462.field6888 == null) {
                    class462.field6888 = class129.method776(class476.field7045, class435.field6349, class212.field2841);
                    if (class462.field6888 == null) {
                        return false;
                    }
                }
                if (class385.field5597 == null) {
                    class385.field5597 = new class92(class68.field781, class287.field3777);
                }
                if (class246.field3235.method601(false, class385.field5597, 22050, class462.field6888, class456.field6814)) {
                    class246.field3235.method563(-641364184);
                    class246.field3235.method595(class204.field2703, 10542);
                    class246.field3235.method581(class481.field7112, class462.field6888, true);
                    class476.field7045 = null;
                    class385.field5597 = null;
                    class97.field1260 = 0;
                    class462.field6888 = null;
                    return true;
                }
            }
            if (arg0 != 31192) {
                field979 = null;
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class246.field3235.method593(16256);
            class385.field5597 = null;
            class476.field7045 = null;
            class462.field6888 = null;
            class97.field1260 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V", line = 56)
    public static void method453(byte arg0) {
        if (arg0 <= 88) {
            method452(94);
        }
        field979 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZ)[[I", line = 66)
    public final int[][] method112(int arg0, boolean arg1) {
        ++field982;
        int[][] var3 = super.field3059.method28((byte) 105, arg0);
        if (!arg1) {
            this.field984 = -63;
        }
        if (super.field3059.field57) {
            int[][] var4 = this.method1460(arg0, 0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class446.field6486; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var13 == var14) {
                    var8[var11] = this.field980 * var12 >> 12;
                    var9[var11] = this.field984 * var13 >> 12;
                    var10[var11] = this.field981 * var14 >> 12;
                } else {
                    var8[var11] = this.field980;
                    var9[var11] = this.field984;
                    var10[var11] = this.field981;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(II)Z", line = 131)
    public static final boolean method454(int arg0, int arg1) {
        if (arg0 != -8) {
            field979 = null;
        }
        ++field978;
        return ~arg1 == -4 || ~arg1 == -8 || arg1 == 10;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lug;II)V", line = 142)
    public final void method61(class396 arg0, int arg1, int arg2) {
        ++field983;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field981 = arg0.method2386(arg1 + -487238764);
                }
            } else {
                this.field984 = arg0.method2386(-23648);
            }
        } else {
            this.field980 = arg0.method2386(arg1 + -487238764);
        }
        if (arg1 != 487215116) {
            this.field981 = 2;
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V", line = 187)
    public class80() {
        super(1, false);
    }
}
