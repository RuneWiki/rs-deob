import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class46 {

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Lwd;")
    public static class150 field1228 = class2.method9(true, "backvmid3");

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field1234 = 10;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Lwd;")
    public static class150 field1229 = class2.method9(true, "Bitte benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Lwd;")
    public static class150 field1230 = class2.method9(true, "Lade Eingabe)2Steuerungsprogramm)3)3)3");

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "Lwd;")
    public static class150 field1240 = class2.method9(true, "An:");

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "Lwd;")
    public static class150 field1245 = class2.method9(true, "Diese Welt ist voll)3");

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Lwd;")
    public static class150 field1243 = class2.method9(true, "Hidden)2use");

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "Lwd;")
    public static class150 field1242 = class2.method9(true, "Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "Lwd;")
    private static class150 field1247 = class2.method9(true, "Trade)4compete");

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "Lwd;")
    public static class150 field1241 = field1247;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "Li;")
    public static class56 field1233 = new class56(20);

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "Lwd;")
    public static class150 field1249 = class2.method9(true, "Einloggen");

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public static int field1251 = 0;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "Lqa;")
    public static class111 field1244;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "Lva;")
    public static class141 field1250;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLva;I)Lwd;")
    public static final class150 method344(byte arg0, class141 arg1, int arg2) {
        field1231++;
        if (!class101.method693(class124.method942(arg1, true), arg2, (byte) -116)) {
            return null;
        } else if (arg1.field3324 == null || arg1.field3324.length <= arg2 || arg1.field3324[arg2] == null || arg1.field3324[arg2].method1201(true).method1174((byte) -120) == 0) {
            return class118.field2690 ? class111.method786((byte) -119, new class150[] { class130.field3073, class29.method239(arg0 ^ 0x3F3, arg2) }) : null;
        } else if (arg0 == 27) {
            return arg1.field3324[arg2];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static void method345(int arg0) {
        field1244 = null;
        if (arg0 != 0) {
            field1229 = null;
        }
        field1241 = null;
        field1229 = null;
        field1245 = null;
        field1233 = null;
        field1247 = null;
        field1230 = null;
        field1228 = null;
        field1250 = null;
        field1243 = null;
        field1249 = null;
        field1242 = null;
        field1240 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)Z")
    public static final boolean method346(byte arg0) {
        field1235++;
        try {
            if (class18.field490 == 2) {
                if (class136.field3195 == null) {
                    class136.field3195 = class75.method563(class5.field106, class74.field1846, class66.field1690);
                    if (class136.field3195 == null) {
                        return false;
                    }
                }
                if (class149.field3639 == null) {
                    class149.field3639 = new class99(class40.field1066, class18.field480);
                }
                if (class49.field1312.method775(class136.field3195, 113, 22050, class142.field3437, class149.field3639)) {
                    class49.field1312.method745((byte) -83);
                    class49.field1312.method772(1827801319, class37.field1016);
                    class49.field1312.method750(0, class130.field3066, class136.field3195);
                    class5.field106 = null;
                    class18.field490 = 0;
                    class149.field3639 = null;
                    class136.field3195 = null;
                    return true;
                }
            }
            if (arg0 > -52) {
                method347(88);
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class49.field1312.method762((byte) 60);
            class136.field3195 = null;
            class149.field3639 = null;
            class5.field106 = null;
            class18.field490 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)Lqd;")
    public static final class114 method347(int arg0) {
        field1236++;
        class114 var1 = new class114();
        var1.field2653 = class111.field2574[0];
        var1.field2647 = class103.field2337[0];
        if (arg0 != -2658) {
            field1246 = 12;
        }
        var1.field2649 = class10.field250[0];
        var1.field2654 = class15.field414;
        var1.field2648 = class17.field457;
        var1.field2650 = class43.field1173[0];
        var1.field2651 = class113.field2638[0];
        var1.field2652 = class134.field3162;
        class37.method276(0);
        return var1;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lff;Lwd;BLwd;)Lv;")
    public static final class140 method348(class42 arg0, class150 arg1, byte arg2, class150 arg3) {
        if (arg2 < 97) {
            field1247 = null;
        }
        field1237++;
        int var4 = arg0.method310((byte) 14, arg3);
        int var5 = arg0.method323((byte) -120, var4, arg1);
        return class2.method14(var5, arg0, 0, var4);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
    public static final void method349(boolean arg0) {
        class58.method445((byte) -31, class108.field2450);
        field1232++;
        if (class144.field3476 != -1) {
            class58.method445((byte) -31, class144.field3476);
        }
        class128.field3030 = 0;
        class41.field1071.method546(80);
        class60.method454();
        class120.method878();
        class148.method1135(0, class108.field2450, (byte) 118, 765, 0, 0, 503);
        if (class144.field3476 != -1) {
            class148.method1135(0, class144.field3476, (byte) 118, 765, 0, 0, 503);
        }
        if (class145.field3517) {
            class135.method1004(-107);
        } else {
            class42.method311(false);
            class101.method688(16836);
        }
        try {
            Graphics var1 = class142.field3439.getGraphics();
            class41.field1071.method287(var1, arg0, 0, 0);
        } catch (Exception var2) {
            class142.field3439.repaint();
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Z")
    public static final boolean method350(int arg0, int arg1) {
        field1238++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class66.field1687[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (var2 == 21) {
            return true;
        } else {
            if (arg0 != -9786) {
                method348(null, null, (byte) -1, null);
            }
            return false;
        }
    }
}
