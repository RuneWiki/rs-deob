import java.security.MessageDigest;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public abstract class class42 {

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Le;")
    public static class191 field735 = class54.method368("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", 2047);

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "[I")
    public static int[] field734 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Le;")
    public static class191 field742 = class54.method368("Zugewiesener Speicher)3", 2047);

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "Le;")
    public static class191 field741 = class54.method368("zap", 2047);

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "[Z")
    public static boolean[] field743 = new boolean[200];

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field739 = 0;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Lre;")
    public static class221 field733;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Lfg;")
    public static class39 field740;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method274(int arg0) {
        field741 = null;
        if (arg0 > -60) {
            field745 = -97;
        }
        field740 = null;
        field743 = null;
        field742 = null;
        field733 = null;
        field734 = null;
        field735 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILng;Lng;)V")
    public static final void method275(int arg0, class121 arg1, class121 arg2) {
        if (arg0 != -21) {
            field739 = 121;
        }
        class33.field568 = arg1;
        class39.field705 = arg2;
        field737++;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)[B")
    public abstract byte[] method276(int arg0);

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([BI)V")
    public abstract void method277(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Le;Z)Z")
    public static final boolean method278(class191 arg0, boolean arg1) {
        field738++;
        try {
            int var2 = arg0.method1338(44, 1476);
            if (var2 == -1) {
                return false;
            }
            class191 var3 = arg0.method1330(0, -78, var2);
            class191 var4 = arg0.method1315(var2 + 1, (byte) -112);
            MessageDigest var5 = MessageDigest.getInstance("SHA");
            var5.reset();
            var5.update(var3.method1308(115));
            byte[] var6 = var5.digest();
            byte[] var7 = var4.method1312(-68);
            class225 var8 = new class225(5000);
            var8.method1566(var7, 3, var7.length, 0);
            var8.field3996 = 0;
            var8.method1615(5104, class164.field2768, class154.field2644);
            if (var8.field3995[0] != 1) {
                return false;
            }
            int var9 = 0;
            if (!arg1) {
                field745 = 73;
            }
            while (var9 < 20) {
                if (var8.field3995[var9 + 1] != var6[var9]) {
                    return false;
                }
                var9++;
            }
            return true;
        } catch (Exception var10) {
            return false;
        }
    }
}
