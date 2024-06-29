import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class379 extends class96 {

    @OriginalMember(owner = "client!kp", name = "K", descriptor = "I")
    private int field4908 = 2048;

    @OriginalMember(owner = "client!kp", name = "U", descriptor = "I")
    private int field4918 = 0;

    @OriginalMember(owner = "client!kp", name = "Q", descriptor = "I")
    private int field4914 = 10;

    @OriginalMember(owner = "client!kp", name = "R", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!kp", name = "T", descriptor = "[I")
    public static int[] field4917;

    @OriginalMember(owner = "client!kp", name = "S", descriptor = "Lpi;")
    public static class340 field4916;

    @OriginalMember(owner = "client!kp", name = "W", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!kp", name = "L", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!kp", name = "M", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!kp", name = "P", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!kp", name = "V", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!kp", name = "N", descriptor = "[I")
    private int[] field4911;

    @OriginalMember(owner = "client!kp", name = "O", descriptor = "[I")
    private int[] field4912;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "(B)V")
    private final void method2208(byte arg0) {
        ++field4919;
        this.field4911 = new int[this.field4914 + 1];
        int var2 = 0;
        this.field4912 = new int[this.field4914 + 1];
        int var3 = 4096 / this.field4914;
        int var4 = this.field4908 * var3 >> 12;
        for (int var5 = 0; ~var5 > ~this.field4914; ++var5) {
            this.field4912[var5] = var2;
            this.field4911[var5] = var2 + var4;
            var2 += var3;
        }
        this.field4912[this.field4914] = 4096;
        if (arg0 != 12) {
            field4916 = null;
        }
        this.field4911[this.field4914] = this.field4911[0] + 4096;
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        if (arg1 != 255) {
            field4917 = null;
        }
        ++field4909;
        int[] var3 = super.field1331.method397((byte) -110, arg0);
        if (super.field1331.field863) {
            int var4 = class74.field933[arg0];
            if (~this.field4918 == -1) {
                short var5 = 0;
                for (int var6 = 0; this.field4914 > var6; ++var6) {
                    if (~var4 <= ~this.field4912[var6] && this.field4912[var6 + 1] > var4) {
                        if (var4 < this.field4911[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class526.method3111(var3, 0, class269.field3403, var5);
            } else {
                for (int var7 = 0; class269.field3403 > var7; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class510.field7476[var7];
                    int var11 = this.field4918;
                    if (~var11 != -2) {
                        if (~var11 != -3) {
                            if (~var11 == -4) {
                                var8 = 2048 - -(-var4 + var10 >> 1);
                            }
                        } else {
                            var8 = (var10 - -var4 - 4096 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; ~var12 > ~this.field4914; ++var12) {
                        if (this.field4912[var12] <= var8 && ~this.field4912[var12 + 1] < ~var8) {
                            if (~var8 > ~this.field4911[var12]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IILbt;)V")
    public final void method31(int arg0, int arg1, class88 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field4918 = arg2.method617(arg1 + 3);
                }
            } else {
                this.field4908 = arg2.method568((byte) 110);
            }
        } else {
            this.field4914 = arg2.method617(2);
        }
        if (arg1 != -1) {
            this.method390(-110);
        }
        ++field4910;
    }

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "(I)V")
    public final void method390(int arg0) {
        this.method2208((byte) 12);
        ++field4913;
        if (arg0 < 15) {
            this.method31(-49, -28, (class88) null);
        }
    }

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "(B)V")
    public static void method2209(byte arg0) {
        int var1 = -69 % ((arg0 - 49) / 37);
        field4916 = null;
        field4917 = null;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V")
    public class379() {
        super(0, true);
    }

    static {
        new class169("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field4915 = 0;
        field4917 = new int[25];
        field4916 = new class340(5, 28);
        field4920 = 0;
        new class169((String) null, "bevor du die Option 'Regelverstoß melden' benutzt.", (String) null, (String) null);
    }
}
