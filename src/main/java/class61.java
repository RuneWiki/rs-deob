import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class61 extends class466 {

    @OriginalMember(owner = "client!pv", name = "F", descriptor = "I")
    private int field1067 = 4096;

    @OriginalMember(owner = "client!pv", name = "G", descriptor = "I")
    private int field1068 = 4096;

    @OriginalMember(owner = "client!pv", name = "H", descriptor = "I")
    private int field1069 = 4096;

    @OriginalMember(owner = "client!pv", name = "L", descriptor = "Ldv;")
    public static class566 field1073;

    @OriginalMember(owner = "client!pv", name = "O", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!pv", name = "N", descriptor = "F")
    public static float field1075;

    @OriginalMember(owner = "client!pv", name = "E", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!pv", name = "I", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!pv", name = "J", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!pv", name = "K", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!pv", name = "M", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method531(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class214.field3027 = arg4;
        if (arg3 == 28405) {
            class513.field7228 = arg1;
            class157.field2329 = arg0;
            class462.field6490 = arg6;
            ++field1074;
            class333.field4458 = arg2;
            if (arg5 && class157.field2329 >= 100) {
                class563.field7794 = class462.field6490 * 128 + 64;
                class462.field6488 = class333.field4458 * 128 + 64;
                class117.field1930 = class183.method1144(89, class563.field7794, class462.field6488, class206.field2901) - class214.field3027;
            }
            class107.field1653 = 2;
        }
    }

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "(I)V")
    public static void method532(int arg0) {
        if (arg0 != 4096) {
            method532(-10);
        }
        field1073 = null;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method33(int arg0, boolean arg1) {
        ++field1066;
        if (arg1) {
            this.method33(50, false);
        }
        int[][] var3 = super.field6569.method828((byte) -28, arg0);
        if (super.field6569.field1934) {
            int[][] var4 = this.method2719(0, arg0, 5);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class312.field4207 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && ~var13 == ~var14) {
                    var8[var11] = this.field1069 * var12 >> 12;
                    var9[var11] = this.field1068 * var13 >> 12;
                    var10[var11] = this.field1067 * var14 >> 12;
                } else {
                    var8[var11] = this.field1069;
                    var9[var11] = this.field1068;
                    var10[var11] = this.field1067;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "()V")
    public class61() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILjava/io/File;Ljava/lang/String;)V")
    public static final void method533(int arg0, File arg1, String arg2) {
        ++field1072;
        if (arg0 == 1) {
            class469.field6604.put(arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        if (arg1 == -5062) {
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (arg2 == 2) {
                        this.field1067 = arg0.method93((byte) 79);
                    }
                } else {
                    this.field1068 = arg0.method93((byte) 105);
                }
            } else {
                this.field1069 = arg0.method93((byte) 123);
            }
            ++field1071;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZLom;Lqa;)I")
    public static final int method534(boolean arg0, class312 arg1, class207 arg2) {
        ++field1070;
        if (arg0) {
            return 81;
        } else if (arg1.field4206 == -1) {
            if (~arg1.field4204 != 0) {
                class211 var3 = arg2.field2924.method190((byte) -89, arg2.method1340() ? arg1.field4204 : arg1.field4213);
                if (!var3.field2969) {
                    return var3.field2967;
                }
            }
            return arg1.field4200;
        } else {
            return arg1.field4206;
        }
    }

    static {
        new class104("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
        field1073 = new class566(78, -1);
        new class104("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
        field1076 = 0;
    }
}
