import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class75 extends class148 {

    @OriginalMember(owner = "client!jj", name = "O", descriptor = "I")
    private int field1112 = -1;

    @OriginalMember(owner = "client!jj", name = "R", descriptor = "Lso;")
    public static class327 field1115;

    @OriginalMember(owner = "client!jj", name = "J", descriptor = "I")
    private int field1107;

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "I")
    private int field1110;

    @OriginalMember(owner = "client!jj", name = "N", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!jj", name = "P", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!jj", name = "Q", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!jj", name = "S", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!jj", name = "T", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!jj", name = "U", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!jj", name = "K", descriptor = "[I")
    private int[] field1108;

    static {
        new class475("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field1115 = new class327(8, 7);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILdh;I)V", line = 4)
    public final void method23(int arg0, class209 arg1, int arg2) {
        int var4 = -84 / ((-88 - arg2) / 33);
        if (~arg0 == -1) {
            this.field1112 = arg1.method1450((byte) 30);
        }
        ++field1111;
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(B)V", line = 17)
    public final void method424(byte arg0) {
        super.method424((byte) 56);
        int var2 = 73 / ((-41 - arg0) / 39);
        ++field1114;
        this.field1108 = null;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V", line = 31)
    public class75() {
        super(0, false);
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(I)V", line = 34)
    public static void method425(int arg0) {
        if (arg0 != -1788807324) {
            field1116 = -7;
        }
        field1115 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZI)[[I", line = 44)
    public final int[][] method27(boolean arg0, int arg1) {
        ++field1117;
        int[][] var3 = super.field2189.method2422(-2, arg1);
        if (super.field2189.field6033) {
            int var4 = this.field1107 * (~class238.field3506 == ~this.field1110 ? arg1 : this.field1110 * arg1 / class238.field3506);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class320.field4579 == ~this.field1107) {
                for (int var8 = 0; class320.field4579 > var8; ++var8) {
                    int var9 = this.field1108[var4++];
                    var7[var8] = class286.method1847(var9, 255) << 4;
                    var6[var8] = class286.method1847(65280, var9) >> 4;
                    var5[var8] = class286.method1847(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; ~var10 > ~class320.field4579; ++var10) {
                    int var11 = this.field1107 * var10 / class320.field4579;
                    int var12 = this.field1108[var4 + var11];
                    var7[var10] = class286.method1847(4080, var12 << 4);
                    var6[var10] = class286.method1847(65280, var12) >> 4;
                    var5[var10] = class286.method1847(16711680, var12) >> 12;
                }
            }
        }
        return !arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)I", line = 110)
    public final int method426(byte arg0) {
        int var2 = -35 / ((arg0 - 37) / 44);
        ++field1118;
        return this.field1112;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)Lnf;", line = 120)
    public static final class405 method427(int arg0, int arg1) {
        ++field1113;
        if (arg1 != 0) {
            return null;
        } else {
            class296[] var2 = class350.field5373;
            synchronized (class350.field5373) {
                class405 var3;
                if (~class350.field5373.length < ~arg0 && !class350.field5373[arg0].method1877(arg1 ^ -26266)) {
                    var3 = (class405) class350.field5373[arg0].method1874(false);
                    var3.method2289((byte) -55);
                    int var10002 = class308.field4435[arg0]--;
                } else {
                    var3 = new class405();
                    var3.field6108 = new class247[arg0];
                    for (int var4 = 0; ~arg0 < ~var4; ++var4) {
                        var3.field6108[var4] = new class247();
                    }
                }
                return var3;
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBI)V", line = 154)
    public final void method428(int arg0, byte arg1, int arg2) {
        super.method428(arg0, (byte) -128, arg2);
        ++field1109;
        int var4 = 53 / ((arg1 - -94) / 32);
        if (this.field1112 >= 0 && class470.field6933 != null) {
            int var5 = class470.field6933.method838(true, this.field1112).field4590 ? 64 : 128;
            this.field1108 = class470.field6933.method837(var5, false, var5, 1.0F, (byte) -72, this.field1112);
            this.field1110 = var5;
            this.field1107 = var5;
        }
    }
}
