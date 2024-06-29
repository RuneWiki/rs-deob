import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class120 {

    @OriginalMember(owner = "client!km", name = "b", descriptor = "[Lot;")
    public class210[] field1554 = null;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "Lmu;")
    public class422 field1553 = null;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "[Lot;")
    public class210[] field1556 = null;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "Lmu;")
    public class422 field1558 = null;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "Lmu;")
    public class422 field1559 = null;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "Z")
    public boolean field1555;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "Z")
    public static boolean field1561;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "Lqc;")
    public static class325 field1560;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "[I")
    public static int[] field1557;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V")
    public static void method734(boolean arg0) {
        if (arg0) {
            method734(false);
        }
        field1560 = null;
        field1557 = null;
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Los;)V")
    public class120(class468 arg0) {
        this.field1555 = arg0.field7025;
        class179.method1194(arg0, 2);
        if (this.field1555) {
            byte[] var2 = class568.method3317(class223.field3288, (byte) 51, false);
            this.field1559 = new class422(arg0, 6410, 128, 128, 16, var2, 6410);
            byte[] var3 = class568.method3317(class370.field5343, (byte) 51, false);
            this.field1558 = new class422(arg0, 6410, 128, 128, 16, var3, 6410);
            class235 var4 = arg0.field6960;
            if (var4.method1524(true)) {
                byte[] var5 = class568.method3317(class42.field473, (byte) 51, false);
                this.field1553 = new class422(arg0, 6408, 128, 128, 16);
                class422 var6 = new class422(arg0, 6409, 128, 128, 16, var5, 6409);
                if (var4.method1522(var6, 80, this.field1553, 2.0F)) {
                    this.field1553.method3183((byte) -99);
                } else {
                    this.field1553.method3175(-128);
                    this.field1553 = null;
                }
                var6.method3175(-126);
                return;
            }
        } else {
            this.field1556 = new class210[16];
            for (int var7 = 0; var7 < 16; var7++) {
                byte[] var10 = class231.method1509(32768, class223.field3288, 4096, var7 * 128 * 128 * 2);
                this.field1556[var7] = new class210(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
            }
            this.field1554 = new class210[16];
            for (int var8 = 0; var8 < 16; var8++) {
                byte[] var9 = class231.method1509(32768, class370.field5343, 4096, var8 * 128 * 256);
                this.field1554[var8] = new class210(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
            }
        }
    }

    static {
        new class487("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
        field1561 = true;
        field1560 = new class325(8);
    }
}
