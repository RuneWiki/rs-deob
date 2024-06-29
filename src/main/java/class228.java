import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class228 {

    @OriginalMember(owner = "client!df", name = "e", descriptor = "[Lii;")
    public static class330[] field3321;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "Lnq;")
    public static class268 field3322;

    static {
        new class442("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
        field3321 = new class330[50];
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)Z", line = 18)
    public static final boolean method1577(int arg0, int arg1) {
        field3320++;
        if ((short) arg1 == arg0 || arg0 == 12 || arg0 == 10 || arg0 == 49 || arg0 == 1011) {
            return true;
        } else {
            return arg0 == 17 || arg0 == 1003;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IJ)V", line = 33)
    public static final void method1578(int arg0, long arg1) {
        field3319++;
        int var3 = class51.field702;
        if (class67.field999 != var3) {
            int var4 = var3 - class67.field999;
            int var5 = (int) ((long) var4 * arg1 / 320L);
            if (var4 <= 0) {
                if (var5 == 0) {
                    var5 = -1;
                } else if (var4 > var5) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = 1;
            } else if (var4 < var5) {
                var5 = var4;
            }
            class67.field999 += var5;
        }
        int var6 = class76.field1100;
        if (arg0 != 8) {
            return;
        }
        if (class447.field6265 != var6) {
            int var7 = var6 - class447.field6265;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class447.field6265 += var8;
        }
        if (!class133.field1916) {
            class333.field4599 += (float) arg1 * class305.field4209 / 40.0F * 8.0F;
            class24.field416 += (float) arg1 * class51.field721 / 40.0F * 8.0F;
        }
        class3.method14((byte) 126);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 117)
    public static final void method1579(int arg0) {
        class135.field1965++;
        int var1 = -53 % ((arg0 - 35) / 32);
        field3318++;
        class46.field648.method1178(63, 192);
        class46.field648.method173(class405.method2542(-1), 255);
        class46.field648.method191(class47.field661, -108);
        class46.field648.method191(class214.field2993, -103);
        class46.field648.method173(class403.field5720, 255);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V", line = 133)
    public static final void method1580(int arg0) {
        class341.field4664.method144(class30.field493, class75.field1075, class163.field2264);
        if (arg0 <= 68) {
            method1580(-6);
        }
        field3323++;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V", line = 148)
    public static void method1581(int arg0) {
        field3321 = null;
        field3322 = null;
        if (arg0 != -710382752) {
            field3322 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BII)V", line = 160)
    public static final void method1582(byte arg0, int arg1, int arg2) {
        field3317++;
        class239 var3 = class436.method2740(5, arg2, arg0 - 323285812);
        if (arg0 == 20) {
            var3.method1622(-89);
            var3.field3399 = arg1;
        }
    }
}
