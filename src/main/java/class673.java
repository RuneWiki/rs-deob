import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class673 {

    @OriginalMember(owner = "client!og", name = "c", descriptor = "[I")
    public static int[] field9015 = new int[6];

    @OriginalMember(owner = "client!og", name = "d", descriptor = "[I")
    public static int[] field9016 = new int[4096];

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field9013;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field9014;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field9017;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field9018;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field9019;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)I", line = 7)
    public final int method3710(int arg0, int arg1, int arg2) {
        field9014++;
        int var4 = arg1 >= class460.field6558 ? arg1 : class460.field6558;
        if (arg0 != 0) {
            field9016 = null;
        }
        if (class193.field2513 == this) {
            return 0;
        } else if (class375.field5487 == this) {
            return var4 - arg2;
        } else if (class760.field10443 == this) {
            return (var4 - arg2) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V", line = 29)
    public static void method3711(byte arg0) {
        if (arg0 != 51) {
            field9015 = null;
        }
        field9015 = null;
        field9016 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BI)Lmr;", line = 49)
    public static final class154 method3712(byte arg0, int arg1) {
        field9018++;
        if (arg0 < 75) {
            field9015 = null;
        }
        return class436.field6310 && arg1 >= class488.field6803 && class187.field2449 >= arg1 ? class447.field6426[arg1 - class488.field6803] : null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIZZ)I", line = 65)
    public static final int method3713(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        field9019++;
        class358 var5 = class559.method3192(arg0, arg4, Integer.MIN_VALUE);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = arg2; var7 < var5.field5210.length; var7++) {
            if (var5.field5210[var7] >= 0 && var5.field5210[var7] < class16.field156.field4654) {
                class369 var8 = class16.field156.method2121(var5.field5210[var7], 25928);
                int var9 = var8.method2312(class315.field4447.method3515(arg1, arg2).field7679, arg1, (byte) 109);
                if (arg3) {
                    var6 += var5.field5213[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIZLofa;Laa;Lhh;)V", line = 102)
    public static final void method3714(int arg0, int arg1, int arg2, int arg3, boolean arg4, class347 arg5, class512 arg6, class140 arg7) {
        field9017++;
        if (arg7 == null) {
            return;
        }
        int var8;
        if (class697.field9252 == 4) {
            var8 = (int) class514.field7144 & 0x3FFF;
        } else {
            var8 = (int) class514.field7144 + class551.field7614 & 0x3FFF;
        }
        int var9 = Math.max(arg5.field4986 / 2, arg5.field4940 / 2) + 10;
        int var10 = arg0 * arg0 + arg1 * arg1;
        if ((var9 * var9) < var10 || arg4) {
            return;
        }
        int var11 = class110.field1524[var8];
        int var12 = class110.field1523[var8];
        if (class697.field9252 != 4) {
            var11 = var11 * 256 / (class767.field10544 + 256);
            var12 = var12 * 256 / (class767.field10544 + 256);
        }
        int var13 = arg0 * var11 + arg1 * var12 >> 14;
        int var14 = arg0 * var12 - (arg1 * var11) >> 14;
        arg7.method352(arg5.field4986 / 2 + arg2 + var13 - (arg7.method343() / 2), arg3 - -(arg5.field4940 / 2) - (var14 + arg7.method340() / 2), arg6, arg2, arg3);
    }

    @OriginalMember(owner = "client!og", name = "toString", descriptor = "()Ljava/lang/String;", line = 144)
    public final String toString() {
        field9013++;
        throw new IllegalStateException();
    }
}
