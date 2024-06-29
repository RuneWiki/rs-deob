import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class206 {

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field3527 = 0;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "Lce;")
    public static class126 field3536 = method1445(-7923, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "Lce;")
    public static class126 field3533 = method1445(-7923, "Connexion perdue)3");

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "Lce;")
    public static class126 field3531 = method1445(-7923, "");

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field3528 = 0;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "Lce;")
    private static class126 field3534 = method1445(-7923, "red:");

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "Lce;")
    public static class126 field3537 = field3534;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "Z")
    public static boolean field3538 = false;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "Lce;")
    public static class126 field3526 = field3534;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILjava/lang/String;)Lce;", line = 4)
    public static final class126 method1445(int arg0, String arg1) {
        if (arg0 != -7923) {
            return (class126) null;
        }
        field3532++;
        int var2 = 0;
        byte[] var3 = arg1.getBytes();
        int var4 = var3.length;
        class126 var5 = new class126();
        var5.field2158 = new byte[var4];
        while (var2 < var4) {
            int var6 = var3[var2++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var2 >= var4) {
                    break;
                }
                int var7 = var3[var2++] & 0xFF;
                var5.field2158[var5.field2140++] = (byte) ((var6 - 40) * 43 + (var7 - 48));
            } else if (var6 != 0) {
                var5.field2158[var5.field2140++] = (byte) var6;
            }
        }
        var5.method850(false);
        return var5.method846(122);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIJ[I)Lce;", line = 48)
    public static final class126 method1446(int arg0, int arg1, long arg2, int[] arg3) {
        field3539++;
        if (class22.field313 != null) {
            class126 var5 = class22.field313.method1479(arg2, arg3, arg1 ^ 0xFFFFFFFE, arg0);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg0 == 5) {
            return class250.method1696(false, arg2).method869(125);
        } else {
            if (arg1 != 1) {
                field3531 = (class126) null;
            }
            return class98.method665(arg2, arg1 - 106);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V", line = 139)
    public static final void method1447(boolean arg0) {
        class266.field4512++;
        class103.field1645.method1238(7, 93);
        class103.field1645.method959(108, class63.field1035);
        if (arg0) {
            method1445(69, (String) null);
        }
        field3530++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V", line = 154)
    public static void method1448(int arg0) {
        field3536 = null;
        field3533 = null;
        field3534 = null;
        field3537 = null;
        field3526 = null;
        if (arg0 == 255) {
            field3531 = null;
        }
    }
}
