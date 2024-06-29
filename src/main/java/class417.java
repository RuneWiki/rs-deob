import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public abstract class class417 extends class8 {

    @OriginalMember(owner = "client!nu", name = "k", descriptor = "S")
    public short field6226;

    @OriginalMember(owner = "client!nu", name = "m", descriptor = "I")
    public int field6228;

    @OriginalMember(owner = "client!nu", name = "j", descriptor = "Z")
    public boolean field6225;

    @OriginalMember(owner = "client!nu", name = "p", descriptor = "S")
    public short field6231;

    @OriginalMember(owner = "client!nu", name = "l", descriptor = "B")
    public byte field6227;

    @OriginalMember(owner = "client!nu", name = "w", descriptor = "S")
    public short field6238;

    @OriginalMember(owner = "client!nu", name = "r", descriptor = "I")
    public int field6233;

    @OriginalMember(owner = "client!nu", name = "q", descriptor = "B")
    public byte field6232;

    @OriginalMember(owner = "client!nu", name = "t", descriptor = "S")
    public short field6235;

    @OriginalMember(owner = "client!nu", name = "o", descriptor = "I")
    public int field6230;

    @OriginalMember(owner = "client!nu", name = "x", descriptor = "[I")
    public static int[] field6239;

    @OriginalMember(owner = "client!nu", name = "i", descriptor = "I")
    public int field6224;

    @OriginalMember(owner = "client!nu", name = "n", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!nu", name = "s", descriptor = "I")
    public static int field6234;

    @OriginalMember(owner = "client!nu", name = "u", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!nu", name = "v", descriptor = "I")
    public static int field6237;

    @OriginalMember(owner = "client!nu", name = "y", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "(B)V")
    public void method808(byte arg0) {
        field6240++;
        if (arg0 != 45) {
            method2524(null, null, null, null, -108);
        }
    }

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "(I)I")
    public abstract int method547(int arg0);

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lua;Lbu;Lbu;Lbu;I)Z")
    public static final boolean method2524(class470 arg0, class17 arg1, class17 arg2, class17 arg3, int arg4) {
        class253.field3639 = arg1;
        field6237++;
        int var5 = 31 / ((arg4 + 4) / 60);
        class221.field3174 = arg2;
        class294.field4193 = arg3;
        class315.field4741 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "(I)V")
    public static void method2525(int arg0) {
        field6239 = null;
        if (arg0 != 32) {
            method2524(null, null, null, null, -20);
        }
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class417(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field6226 = (short) arg7;
        this.field6228 = arg1;
        this.field6225 = arg8;
        this.field6231 = (short) arg4;
        this.field6227 = arg9;
        this.field6238 = (short) arg6;
        this.field6233 = arg3;
        this.field6232 = (byte) arg0;
        this.field6235 = (short) arg5;
        this.field6230 = arg2;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method2526(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field6229++;
        int var8 = class9.method50(class70.field1213, arg6, class389.field5859, true);
        int var9 = class9.method50(class70.field1213, arg4, class389.field5859, true);
        int var10 = class9.method50(class315.field4754, arg7, class156.field2455, true);
        int var11 = class9.method50(class315.field4754, arg3, class156.field2455, true);
        int var12 = class9.method50(class70.field1213, arg0 + arg6, class389.field5859, true);
        int var13 = class9.method50(class70.field1213, arg4 - arg0, class389.field5859, true);
        int var14 = -117 % ((-arg5 - 59) / 54);
        for (int var15 = var8; var15 < var12; var15++) {
            class179.method1269(class21.field430[var15], arg1, var10, var11, 26985);
        }
        for (int var16 = var9; var16 > var13; var16--) {
            class179.method1269(class21.field430[var16], arg1, var10, var11, 26985);
        }
        int var17 = class9.method50(class315.field4754, arg7 + arg0, class156.field2455, true);
        int var18 = class9.method50(class315.field4754, arg3 - arg0, class156.field2455, true);
        for (int var19 = var12; var19 <= var13; var19++) {
            int[] var20 = class21.field430[var19];
            class179.method1269(var20, arg1, var10, var17, 26985);
            class179.method1269(var20, arg2, var17, var18, 26985);
            class179.method1269(var20, arg1, var18, var11, 26985);
        }
    }

    static {
        new class342("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
        field6239 = new int[32];
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field6239[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
