import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class519 extends class9 {

    @OriginalMember(owner = "client!iq", name = "B", descriptor = "[B")
    public byte[] field7304;

    @OriginalMember(owner = "client!iq", name = "z", descriptor = "[I")
    public static int[] field7302 = new int[2048];

    @OriginalMember(owner = "client!iq", name = "y", descriptor = "Ljs;")
    public static class275 field7301 = new class275(10, 2, 2, 0);

    @OriginalMember(owner = "client!iq", name = "C", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!iq", name = "w", descriptor = "I")
    public static int field7299;

    @OriginalMember(owner = "client!iq", name = "x", descriptor = "I")
    public static int field7300;

    @OriginalMember(owner = "client!iq", name = "A", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)V")
    public static void method2962(byte arg0) {
        if (arg0 < -91) {
            field7301 = null;
            field7302 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lav;I)I")
    public static final int method2963(class545 arg0, int arg1) {
        field7300++;
        int var2 = arg0.field8010;
        class352 var3 = arg0.method2704(arg1 + arg1);
        if (arg0.field6430) {
            var2 = arg0.field8018;
        } else if (arg0.field6474 == var3.field4543 || arg0.field6474 == var3.field4565 || arg0.field6474 == var3.field4546 || arg0.field6474 == var3.field4574) {
            var2 = arg0.field8004;
        } else if (arg0.field6474 == var3.field4557 || arg0.field6474 == var3.field4575 || arg0.field6474 == var3.field4558 || arg0.field6474 == var3.field4547) {
            var2 = arg0.field8024;
        }
        return var2;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method2964(String arg0, byte arg1) {
        field7299++;
        if (arg1 <= 45) {
            field7301 = null;
        }
        for (int var2 = 0; var2 < class6.field51.length; var2++) {
            if (class6.field51[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lkj;I)V")
    public static final void method2965(class484 arg0, int arg1) {
        if (arg1 != 1349069767) {
            method2963(null, -3);
        }
        field7303++;
        arg0.method2806(arg1 - 1349069768);
        int var2 = class82.field1003;
        class545 var3 = class103.field1265 = class459.field6329[var2] = new class545();
        var3.field6399 = var2;
        int var4 = arg0.method2813(30, 8);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (var4 & 0xFFFC376) >> 14;
        var3.field6483[0] = var6 - class632.field9113;
        int var7 = var4 & 0x3FFF;
        var3.field8661 = (var3.field6483[0] << 7) + (var3.method2694(28146) << 6);
        var3.field6491[0] = var7 - class119.field1504;
        var3.field8652 = (var3.field6491[0] << 7) + (var3.method2694(28146) << 6);
        class442.field6099 = var3.field8660 = var5;
        if (class639.field9194[var2] != null) {
            var3.method3192(-19939, class639.field9194[var2]);
        }
        class370.field4878 = 0;
        field7302[class370.field4878++] = var2;
        class385.field5080[var2] = 0;
        class207.field2496 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg0.method2813(18, -121);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 0xFF;
                int var12 = var9 & 0xFF;
                class253 var13 = class57.field529[var8] = new class253();
                var13.field3269 = 0;
                var13.field3265 = (var10 << 28) + (var11 << 14) + var12;
                var13.field3270 = -1;
                var13.field3268 = false;
                class537.field7631[class207.field2496++] = var8;
                class385.field5080[var8] = 0;
            }
        }
        arg0.method2814((byte) 53);
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "([B)V")
    public class519(byte[] arg0) {
        this.field7304 = arg0;
    }

    static {
        new class180("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        field7305 = 1;
    }
}
