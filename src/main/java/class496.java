import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class496 extends class462 {

    @OriginalMember(owner = "client!gu", name = "bb", descriptor = "I")
    public static int field6896;

    @OriginalMember(owner = "client!gu", name = "O", descriptor = "I")
    public static int field6894;

    @OriginalMember(owner = "client!gu", name = "ab", descriptor = "I")
    public static int field6895;

    static {
        new class180("Player ", "Spieler ", "Joueur ", "Jogador ");
        field6896 = 0;
        new class180("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(II)[[I", line = 12)
    public final int[][] method481(int arg0, int arg1) {
        ++field6894;
        if (arg0 != 1000) {
            return null;
        } else {
            int[][] var3 = super.field992.method3178(arg1, 0);
            if (super.field992.field7962 && this.method2690((byte) -98)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = arg1 % super.field6377 * super.field6377;
                for (int var8 = 0; var8 < class629.field9033; ++var8) {
                    int var9 = super.field6376[var8 % super.field6382 + var7];
                    var6[var8] = class288.method1624(var9 << 4, 4080);
                    var5[var8] = class288.method1624(var9 >> 4, 4080);
                    var4[var8] = class288.method1624(var9 >> 12, 4080);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(B)V", line = 64)
    public static final void method2865(byte arg0) {
        int var1 = -123 % ((arg0 - 43) / 59);
        ++field6895;
        class528.field7394.method2642(true);
        class69.field660.method2642(true);
    }
}
