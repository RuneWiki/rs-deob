import java.awt.Rectangle;
import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class26 extends class97 {

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
    public volatile int field341 = -1;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "Ljava/lang/String;")
    public volatile String field328;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "[I")
    public static int[] field339;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "[I")
    public static int[] field338;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field344;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "[[Z")
    public static boolean[][] field345;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "Z")
    public static boolean field346;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "Luq;")
    public static class221 field347;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "Liq;")
    public static class134 field329;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field343;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V")
    public static void method156(int arg0) {
        field329 = null;
        field338 = null;
        field339 = null;
        if (arg0 == 511) {
            field343 = null;
            field344 = null;
            field345 = null;
            field347 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)V")
    public static final void method157(int arg0) {
        if (arg0 != 512) {
            method158(-118, (class119) null);
        }
        field335++;
        if (class74.field998 == 0) {
            return;
        }
        try {
            if (++class187.field2808 > 1500) {
                if (class301.field4543 != null) {
                    class301.field4543.method2163(true);
                    class301.field4543 = null;
                }
                if (class154.field2113 >= 1) {
                    class298.field4511 = -5;
                    class74.field998 = 0;
                    return;
                }
                if (class244.field3661 == class141.field1898) {
                    class244.field3661 = class264.field4032;
                } else {
                    class244.field3661 = class141.field1898;
                }
                class74.field998 = 1;
                class187.field2808 = 0;
                class154.field2113++;
            }
            if (class74.field998 == 1) {
                class1.field22 = class79.field1043.method1450((byte) -71, class244.field3661, class98.field1355);
                class74.field998 = 2;
            }
            if (class74.field998 == 2) {
                if (class1.field22.field3172 == 2) {
                    throw new IOException();
                }
                if (class1.field22.field3172 != 1) {
                    return;
                }
                class301.field4543 = new class359((Socket) class1.field22.field3175, class79.field1043);
                class1.field22 = null;
                class301.field4543.method2164(0, (byte) -35, class189.field2840.field5666, class189.field2840.field5685);
                if (class245.field3670 != null) {
                    class245.field3670.method247(arg0 ^ 0x5D0);
                }
                if (class236.field3536 != null) {
                    class236.field3536.method247(2000);
                }
                int var1 = class301.field4543.method2156(true);
                if (class245.field3670 != null) {
                    class245.field3670.method247(2000);
                }
                if (class236.field3536 != null) {
                    class236.field3536.method247(2000);
                }
                if (var1 != 101) {
                    class298.field4511 = var1;
                    class74.field998 = 0;
                    class301.field4543.method2163(true);
                    class301.field4543 = null;
                    return;
                }
                class74.field998 = 3;
            }
            if (class74.field998 == 3 && class301.field4543.method2158(false) >= 2) {
                int var2 = class301.field4543.method2156(true) << 8 | class301.field4543.method2156(true);
                class238.method1434(var2, 23730);
                if (class414.field6149 == -1) {
                    class298.field4511 = 6;
                    class74.field998 = 0;
                    class301.field4543.method2163(true);
                    class301.field4543 = null;
                } else {
                    class74.field998 = 0;
                    class301.field4543.method2163(true);
                    class301.field4543 = null;
                    class292.method1812(-115);
                }
            }
        } catch (IOException var3) {
            if (class301.field4543 != null) {
                class301.field4543.method2163(true);
                class301.field4543 = null;
            }
            if (class154.field2113 < 1) {
                class74.field998 = 1;
                class154.field2113++;
                class187.field2808 = 0;
                if (class244.field3661 == class141.field1898) {
                    class244.field3661 = class264.field4032;
                } else {
                    class244.field3661 = class141.field1898;
                }
            } else {
                class74.field998 = 0;
                class298.field4511 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILjk;)V")
    public static final void method158(int arg0, class119 arg1) {
        if (arg0 != -13859) {
            return;
        }
        for (int var2 = 0; var2 < class109.field1441; var2++) {
            int var3 = class133.field1729[var2];
            class169 var4 = class140.field1883[var3];
            int var5 = arg1.method2343(255);
            if ((var5 & 0x1) != 0) {
                var5 += arg1.method2343(arg0 + 14114) << 8;
            }
            class98.method630(-126, var4, var3, arg1, var5);
        }
        field340++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZZIBI)V")
    public static final void method159(boolean arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        class38.method218(arg2, arg4, 0, arg1, class205.field3072.length - 1, arg0, true);
        field330++;
        class15.field191 = null;
        class30.field383 = 0;
        if (arg3 > -63) {
            method157(127);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)[B")
    public static final byte[] method160(int arg0, int arg1) {
        field342++;
        if (arg1 != -26541) {
            field333 = 127;
        }
        class63 var2 = (class63) class276.field4209.method927((long) arg0, -121);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class330.method2028(90, var7, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class63(var3);
            class276.field4209.method929((long) arg0, var2, false);
        }
        return var2.field794;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class26(String arg0) {
        this.field328 = arg0;
    }

    static {
        new class151("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
        field333 = 0;
        field332 = 0;
        field339 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };
        field336 = field337 >> 2;
        field338 = new int[14];
        field344 = new Rectangle[100];
        field345 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };
        field334 = field337;
        field346 = false;
        field347 = new class221();
        new class151((String) null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", (String) null, (String) null);
    }
}
