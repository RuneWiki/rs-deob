import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class470 extends class34 {

    @OriginalMember(owner = "client!vs", name = "H", descriptor = "I")
    private int field6780 = 4;

    @OriginalMember(owner = "client!vs", name = "F", descriptor = "I")
    private int field6778 = 4;

    @OriginalMember(owner = "client!vs", name = "D", descriptor = "I")
    public static int field6776 = -1;

    @OriginalMember(owner = "client!vs", name = "C", descriptor = "I")
    public static int field6775;

    @OriginalMember(owner = "client!vs", name = "E", descriptor = "I")
    public static int field6777;

    @OriginalMember(owner = "client!vs", name = "G", descriptor = "I")
    public static int field6779;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        ++field6779;
        int var3 = 54 % (-arg1 / 50);
        int[] var4 = super.field537.method1780(arg0, (byte) 110);
        if (super.field537.field4191) {
            int var5 = class383.field5502 / this.field6780;
            int var6 = class494.field7150 / this.field6778;
            int[] var8;
            if (~var6 < -1) {
                int var7 = arg0 % var6;
                var8 = this.method252(false, class494.field7150 * var7 / var6, 0);
            } else {
                var8 = this.method252(false, 0, 0);
            }
            for (int var9 = 0; var9 < class383.field5502; ++var9) {
                if (var5 > 0) {
                    int var10 = var9 % var5;
                    var4[var9] = var8[class383.field5502 * var10 / var5];
                } else {
                    var4[var9] = var8[0];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "()V")
    public class470() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(BI)[[I")
    public final int[][] method66(byte arg0, int arg1) {
        ++field6775;
        if (arg0 != -11) {
            field6776 = -48;
        }
        int[][] var3 = super.field536.method337(arg1, (byte) 75);
        if (super.field536.field726) {
            int var4 = class383.field5502 / this.field6780;
            int var5 = class494.field7150 / this.field6778;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method254(arg0 ^ -11, 0, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method254(0, 0, class494.field7150 * var7 / var5);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class383.field5502; ++var14) {
                int var16;
                if (~var4 < -1) {
                    int var15 = var14 % var4;
                    var16 = class383.field5502 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lsv;II)V")
    public final void method69(class319 arg0, int arg1, int arg2) {
        ++field6777;
        if (arg1 < 16) {
            this.field6780 = 76;
        }
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field6778 = arg0.method1869(-87);
            }
        } else {
            this.field6780 = arg0.method1869(-77);
        }
    }

    static {
        new class157("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
    }
}
