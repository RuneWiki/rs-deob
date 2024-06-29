import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class317 extends class2 {

    @OriginalMember(owner = "client!sl", name = "M", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!sl", name = "O", descriptor = "Lel;")
    public static class382 field4541;

    @OriginalMember(owner = "client!sl", name = "V", descriptor = "Lcv;")
    public static class398 field4546;

    @OriginalMember(owner = "client!sl", name = "R", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!sl", name = "S", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!sl", name = "T", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!sl", name = "U", descriptor = "[Lf;")
    public static class528[] field4545;

    static {
        new class180("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
        field4540 = 0;
        field4541 = new class382(8192);
        field4546 = new class398(16);
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(II)Z", line = 3)
    public static final boolean method1989(int arg0, int arg1) {
        class473.field6978 = arg0 + arg1 & 0xFFFF;
        field4542++;
        class51.field750 = true;
        return true;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IBI)V", line = 15)
    public static final void method1990(int arg0, byte arg1, int arg2) {
        field4543++;
        class434 var3 = class483.method2888(0, 80, 15);
        var3.method2632((byte) 81);
        if (arg1 <= -74) {
            var3.field6314 = arg2;
            var3.field6310 = arg0;
        }
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)V", line = 41)
    public static void method1991(int arg0) {
        field4546 = null;
        if (arg0 == -15838) {
            field4545 = null;
            field4541 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILob;II)Lss;", line = 56)
    public static final class295 method1992(int arg0, class516 arg1, int arg2, int arg3) {
        field4544++;
        int var4 = arg2 << 8 | arg1.field7585;
        class295 var5 = (class295) class373.field5580.method797(50, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class334.field5125.method680(true, class334.field5125.method681(70, var4));
        if (var6 == null) {
            int var8 = arg3 + 65536 << 8 | arg1.field7585;
            class295 var9 = (class295) class373.field5580.method797(50, (long) var8 << 16);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class334.field5125.method680(true, class334.field5125.method681(124, var8));
            if (var10 == null) {
                int var12 = arg1.field7585 | 0xFFFF00;
                class295 var13 = (class295) class373.field5580.method797(50, (long) var12 << 16);
                if (var13 != null) {
                    return var13;
                }
                if (arg0 > -44) {
                    field4546 = null;
                }
                byte[] var14 = class334.field5125.method680(true, class334.field5125.method681(-45, var12));
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class295 var15 = class466.method2777(var14, -22);
                    var15.field4207 = arg1;
                    class373.field5580.method793((byte) -91, var15, (long) var12 << 16);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class295 var11 = class466.method2777(var10, -22);
                var11.field4207 = arg1;
                class373.field5580.method793((byte) -91, var11, (long) var8 << 16);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class295 var7 = class466.method2777(var6, -22);
            var7.field4207 = arg1;
            class373.field5580.method793((byte) -91, var7, (long) var4 << 16);
            return var7;
        }
    }
}
