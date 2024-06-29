import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class138 extends class496 {

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "[B")
    public byte[] field1820;

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "[B")
    public static byte[] field1822;

    @OriginalMember(owner = "client!mp", name = "m", descriptor = "Lqu;")
    public static class364 field1823;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "Lao;")
    public static class369 field1821;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V")
    public static void method842(byte arg0) {
        if (arg0 == 80) {
            field1821 = null;
            field1823 = null;
            field1822 = null;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IB)[B")
    public static final byte[] method843(int arg0, byte arg1) {
        field1819++;
        class479 var2 = (class479) class580.field8541.method227((long) arg0, (byte) 97);
        if (arg1 != 126) {
            field1822 = null;
        }
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class296.method1832(false, var7, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class479(var3);
            class580.field8541.method230((long) arg0, var2, 50);
        }
        return var2.field7275;
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "([B)V")
    public class138(byte[] arg0) {
        this.field1820 = arg0;
    }

    static {
        new class487(" days.", " Tage.", " jours.", " dias.");
        new class487("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
        field1822 = new byte[32896];
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field1822[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field1823 = new class364(0, 11);
    }
}
