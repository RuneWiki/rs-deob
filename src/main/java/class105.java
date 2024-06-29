import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class105 {

    @OriginalMember(owner = "client!me", name = "d", descriptor = "[I")
    public static int[] field1256 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!me", name = "b", descriptor = "Llg;")
    public static class237 field1254 = new class237(8);

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field1260 = 0;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field1261 = -1;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "Liq;")
    public static class362 field1262;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "Ltq;")
    public static class376 field1253;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(III)V")
    public static final void method577(int arg0, int arg1, int arg2) {
        if (arg2 > -18) {
            field1254 = null;
        }
        field1255++;
        class244 var3 = class414.method2636(arg1, 31392);
        int var4 = var3.field3454;
        int var5 = var3.field3461;
        int var6 = var3.field3464;
        int var7 = class127.field1543[var6 - var5];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class130.method809((byte) 59, var4, class4.field61[var4] & ~var8 | var8 & arg0 << var5);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method578(String arg0, byte arg1) {
        if (arg1 == -45) {
            class325.method2112(arg0, 0, 0, "", -27259, "");
            field1258++;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public static void method579(int arg0) {
        field1256 = null;
        if (arg0 < -117) {
            field1254 = null;
            field1262 = null;
            field1253 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IILae;IBLjh;)V")
    public static final void method580(int arg0, int arg1, class134 arg2, int arg3, byte arg4, class88 arg5) {
        field1257++;
        class334 var6 = class162.method1066(arg5.field1075, 24418);
        if (var6.field4722 == -1) {
            return;
        }
        int var7;
        if (arg5.field1025) {
            int var8 = arg5.field1006 + arg3;
            var7 = var8 & 0x3;
        } else {
            var7 = 0;
        }
        class381 var9 = var6.method2163(arg5.field1035, arg2, -82, var7);
        if (var9 == null) {
            return;
        }
        int var10 = arg5.field1008;
        int var11 = arg5.field1029;
        if ((var7 & 0x1) == 1) {
            var10 = arg5.field1029;
            var11 = arg5.field1008;
        }
        if (arg4 >= -117) {
            method578((String) null, (byte) -115);
        }
        int var12 = var9.method762();
        int var13 = var9.method761();
        if (var6.field4717) {
            var12 = var10 * 4;
            var13 = var11 * 4;
        }
        if (var6.field4720 == 0) {
            var9.method2452(arg0, arg1 - ((var11 - 1) * 4), var12, var13);
        } else {
            var9.method752(arg0, arg1 - (var11 - 1) * 4, var12, var13, 1, var6.field4720 | 0xFF000000, 1);
        }
    }

    static {
        new class362("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field1262 = new class362("level: ", "Stufe: ", "niveau ", "nível: ");
    }
}
