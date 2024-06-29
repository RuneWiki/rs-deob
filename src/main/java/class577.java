import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class577 {

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "Lqq;")
    public static class599 field8511;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field8508;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field8510;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "Ldda;")
    public static class597 field8509;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZII)I")
    public static final int method3374(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            return 19;
        }
        field8508++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
    public static void method3375(byte arg0) {
        field8511 = null;
        field8509 = null;
        if (arg0 != -44) {
            field8511 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IFFF)I")
    public static final int method3376(int arg0, float arg1, float arg2, float arg3) {
        field8510++;
        int var4 = -90 / ((90 - arg0) / 32);
        float var5 = (arg1 < 0.0F) ? -arg1 : arg1;
        float var6 = (arg2 < 0.0F) ? -arg2 : arg2;
        float var7 = (arg3 < 0.0F) ? -arg3 : arg3;
        if (var6 > var5 && var6 > var7) {
            return arg2 > 0.0F ? 0 : 1;
        } else if (var5 < var7 && var7 > var6) {
            return (arg3 > 0.0F) ? 2 : 3;
        } else if ((arg1 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }

    static {
        new class487("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
        field8511 = new class599();
    }
}
