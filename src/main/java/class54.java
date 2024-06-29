import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class54 extends Canvas {

    @OriginalMember(owner = "client!he", name = "p", descriptor = "Ljava/awt/Component;")
    private Component field1280;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "Lec;")
    public static class32 field1266 = class73.method594("oder ung-Ultiges Passwort)3", true);

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Lec;")
    public static class32 field1267 = class73.method594("Ung-Ultiger Benutzername", true);

    @OriginalMember(owner = "client!he", name = "h", descriptor = "Lec;")
    public static class32 field1272 = class73.method594("ams", true);

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field1277 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "I")
    public static int field1283 = 0;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "Lec;")
    private static class32 field1274 = class73.method594("This computers address has been blocked", true);

    @OriginalMember(owner = "client!he", name = "q", descriptor = "[[S")
    public static short[][] field1281 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Lec;")
    public static class32 field1273 = class73.method594("Registrierter Benutzer", true);

    @OriginalMember(owner = "client!he", name = "l", descriptor = "Lec;")
    public static class32 field1276 = field1274;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "Lec;")
    private static class32 field1270 = class73.method594("Checking for updates )2 ", true);

    @OriginalMember(owner = "client!he", name = "k", descriptor = "Lec;")
    public static class32 field1275 = field1270;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "Lnf;")
    public static class96 field1279;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "[Lhb;")
    public static class51[] field1265;

    @OriginalMember(owner = "client!he", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1280.paint(arg0);
        field1282++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V")
    public static final void method426(int arg0, int arg1) {
        field1269++;
        if (arg0 != 0) {
            field1272 = null;
        }
        if (class134.field3116 == arg1) {
            return;
        }
        if (class134.field3116 == 0) {
            class94.method747((byte) -96);
        }
        if (arg1 == 20 || arg1 == 40) {
            class132.field3035 = 0;
            class39.field939 = 0;
            class52.field1178 = 0;
        }
        if (arg1 != 20 && arg1 != 40 && class80.field1841 != null) {
            class80.field1841.method52(114);
            class80.field1841 = null;
        }
        if (class134.field3116 == 25) {
            class53.field1209 = 1;
            class37.field884 = 1;
            class119.field2841 = 0;
            class37.field880 = 0;
            class152.field3489 = 0;
        }
        if (arg1 == 5 || arg1 == 10 || arg1 == 20) {
            class112.method883(class72.field1702, (byte) -106, class30.field572, class107.field2541);
        } else {
            class23.method167((byte) -120);
        }
        class134.field3116 = arg1;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(JI)V")
    public static final void method427(long arg0, int arg1) {
        if (arg1 != -27166) {
            return;
        }
        field1268++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class73.method597(arg1 + 27064, arg0 + -1L);
            class73.method597(-99, 1L);
        } else {
            class73.method597(-126, arg0);
        }
    }

    @OriginalMember(owner = "client!he", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1280.update(arg0);
        field1278++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z[B)V")
    public static final void method428(boolean arg0, byte[] arg1) {
        field1271++;
        class66 var2 = new class66(arg1);
        var2.field1569 = arg1.length - 2;
        class92.field2112 = var2.method532(0);
        class126.field2927 = new int[class92.field2112];
        class70.field1639 = new int[class92.field2112];
        class34.field720 = new int[class92.field2112];
        class147.field3346 = new byte[class92.field2112][];
        class74.field1747 = new int[class92.field2112];
        var2.field1569 = arg1.length - class92.field2112 * 8 - 7;
        class152.field3508 = var2.method532(0);
        class128.field2967 = var2.method532(0);
        int var3 = (var2.method533(255) & 0xFF) + 1;
        for (int var4 = 0; var4 < class92.field2112; var4++) {
            class70.field1639[var4] = var2.method532(0);
        }
        for (int var5 = 0; var5 < class92.field2112; var5++) {
            class74.field1747[var5] = var2.method532(0);
        }
        for (int var6 = 0; var6 < class92.field2112; var6++) {
            class126.field2927[var6] = var2.method532(0);
        }
        for (int var7 = 0; var7 < class92.field2112; var7++) {
            class34.field720[var7] = var2.method532(0);
        }
        var2.field1569 = arg1.length - (var3 - 1) * 3 - class92.field2112 * 8 - 7;
        class31.field616 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class31.field616[var8] = var2.method518((byte) 77);
            if (class31.field616[var8] == 0) {
                class31.field616[var8] = 1;
            }
        }
        var2.field1569 = 0;
        if (arg0) {
            return;
        }
        for (int var9 = 0; var9 < class92.field2112; var9++) {
            int var10 = class126.field2927[var9];
            int var11 = class34.field720[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class147.field3346[var9] = var13;
            int var14 = var2.method533(255);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method545((byte) 96);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var10; var16++) {
                    for (int var17 = 0; var17 < var11; var17++) {
                        var13[var16 + var10 * var17] = var2.method545((byte) 83);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class54(Component arg0) {
        this.field1280 = arg0;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B[Lf;I)V")
    public static final void method429(byte arg0, class36[] arg1, int arg2) {
        field1284++;
        if (arg0 != 40) {
            method428(false, null);
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class36 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field756 == 0) {
                    if (var4.field755 != null) {
                        method429((byte) 40, var4.field755, arg2);
                    }
                    class144 var5 = (class144) class109.field2573.method1198((long) var4.field744, (byte) -106);
                    if (var5 != null) {
                        class154.method1194(var5.field3282, arg2, (byte) 120);
                    }
                }
                if (arg2 == 0 && var4.field759 != null) {
                    class12 var6 = new class12();
                    var6.field208 = var4.field759;
                    var6.field209 = var4;
                    class158.method1224(var6, (byte) -105);
                }
                if (arg2 == 1 && var4.field796 != null) {
                    if (var4.field829 >= 0) {
                        class36 var7 = class128.method993(var4.field744, -118);
                        if (var7 == null || var7.field755 == null || var7.field755.length <= var4.field829 || var7.field755[var4.field829] != var4) {
                            continue;
                        }
                    }
                    class12 var8 = new class12();
                    var8.field208 = var4.field796;
                    var8.field209 = var4;
                    class158.method1224(var8, (byte) -113);
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method430(int arg0) {
        field1276 = null;
        field1272 = null;
        field1266 = null;
        field1274 = null;
        field1265 = null;
        field1273 = null;
        field1267 = null;
        field1275 = null;
        if (arg0 != -1) {
            field1267 = null;
        }
        field1279 = null;
        field1270 = null;
        field1281 = null;
    }
}
