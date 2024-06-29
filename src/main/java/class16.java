import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class16 {

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "Lla;")
    public static class77 field362 = new class77(5000);

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field373 = 0;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "Lrd;")
    public static class117 field377 = class95.method812("@or2@", (byte) 8);

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field375 = 0;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "Lrd;")
    public static class117 field379 = class95.method812("Ihr Spielkonto wurde deaktiviert)3", (byte) 8);

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "J")
    public static long field381 = 0L;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "Lrd;")
    private static class117 field382 = class95.method812("shake:", (byte) 8);

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "Lrd;")
    public static class117 field374 = field382;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "Lrd;")
    public static class117 field378 = class95.method812("Zu viele Anmelde)2Versuche von Ihrer Adresse", (byte) 8);

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
    public static int field383 = 255;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "Lrd;")
    public static class117 field384 = class95.method812("mapdots", (byte) 8);

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "Lrd;")
    private static class117 field380 = class95.method812("Loading game screen )2 ", (byte) 8);

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "Lrd;")
    public static class117 field370 = field380;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "Lrd;")
    public static class117 field371 = field382;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "Lga;")
    public static class44 field385;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I[BI)I")
    public static final int method176(int arg0, byte[] arg1, int arg2) {
        if (arg2 == -14792) {
            field366++;
            return class2.method23(0, arg2 - 725937328, arg1, arg0);
        } else {
            return -6;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method177(int arg0, String arg1) throws ClassNotFoundException {
        field365++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg0 != 254) {
            return null;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method178(int arg0) {
        field379 = null;
        field370 = null;
        if (arg0 != 1716) {
            field382 = null;
        }
        field362 = null;
        field371 = null;
        field380 = null;
        field384 = null;
        field377 = null;
        field378 = null;
        field382 = null;
        field374 = null;
        field385 = null;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
    public static final void method179(int arg0) {
        field363++;
        Object var1 = class118.field2904;
        synchronized (class118.field2904) {
            if (class27.field810 == 0) {
                class4.field104.method66(5, new class42(), true);
            }
            class27.field810 = 600;
        }
        int var2 = -86 / ((12 - arg0) / 46);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lge;Lge;Ljava/awt/Component;B)V")
    public static final void method180(class47 arg0, class47 arg1, Component arg2, byte arg3) {
        field367++;
        if (class53.field1503) {
            return;
        }
        class107.field2671 = class80.method749(128, -325, 265, arg2);
        class145.method1159();
        class86.field2241 = class80.method749(128, -325, 265, arg2);
        class145.method1159();
        class144.field3431 = class80.method749(509, -325, 171, arg2);
        class145.method1159();
        class118.field2913 = class80.method749(360, -325, 132, arg2);
        class145.method1159();
        class147.field3597 = class80.method749(360, -325, 200, arg2);
        class145.method1159();
        class143.field3409 = class80.method749(202, -325, 238, arg2);
        class145.method1159();
        class148.field3632 = class80.method749(203, -325, 238, arg2);
        class145.method1159();
        class53.field1499 = class80.method749(74, -325, 94, arg2);
        class145.method1159();
        class101.field2532 = class80.method749(75, -325, 94, arg2);
        class145.method1159();
        byte[] var4 = arg0.method520(class56.field1570, false, class107.field2667);
        class76 var5 = new class76(var4, arg2);
        class107.field2671.method488(-7913);
        var5.method715(0, 0);
        class86.field2241.method488(-7913);
        var5.method715(-637, 0);
        class144.field3431.method488(-7913);
        var5.method715(-128, 0);
        class118.field2913.method488(-7913);
        var5.method715(-202, -371);
        class147.field3597.method488(-7913);
        var5.method715(-202, -171);
        class143.field3409.method488(-7913);
        var5.method715(0, -265);
        class148.field3632.method488(-7913);
        var5.method715(-562, -265);
        class53.field1499.method488(-7913);
        var5.method715(-128, -171);
        class101.field2532.method488(-7913);
        var5.method715(-562, -171);
        int[] var6 = new int[var5.field2087];
        for (int var7 = 0; var7 < var5.field2084; var7++) {
            for (int var24 = 0; var24 < var5.field2087; var24++) {
                var6[var24] = var5.field2085[var5.field2087 * var7 + var5.field2087 - var24 - 1];
            }
            for (int var25 = 0; var25 < var5.field2087; var25++) {
                var5.field2085[var25 + var5.field2087 * var7] = var6[var25];
            }
        }
        class107.field2671.method488(-7913);
        var5.method715(382, 0);
        class86.field2241.method488(-7913);
        var5.method715(-255, 0);
        class144.field3431.method488(-7913);
        var5.method715(254, 0);
        class118.field2913.method488(-7913);
        var5.method715(180, -371);
        class147.field3597.method488(-7913);
        var5.method715(180, -171);
        class143.field3409.method488(-7913);
        var5.method715(382, -265);
        class148.field3632.method488(-7913);
        var5.method715(-180, -265);
        class53.field1499.method488(-7913);
        var5.method715(254, -171);
        class101.field2532.method488(-7913);
        var5.method715(-180, -171);
        class76 var8 = class102.method856(class56.field1570, 11, arg1, class49.field1378);
        class144.field3431.method488(-7913);
        var8.method712(254 - var8.field2087 / 2, 18);
        int var9 = -16 % ((32 - arg3) / 55);
        class68.field1930 = class127.method1008(class90.field2313, arg1, (byte) -111, class56.field1570);
        class96.field2418 = class127.method1008(class148.field3622, arg1, (byte) -32, class56.field1570);
        class119.field2929 = class65.method649(class56.field1570, arg1, true, class136.field3268);
        class90.field2305 = class65.method649(class56.field1570, arg1, true, class124.field2997);
        class61.field1729 = new class76(128, 265);
        class128.field3116 = new class76(128, 265);
        for (int var10 = 0; var10 < 33920; var10++) {
            class61.field1729.field2085[var10] = class107.field2671.field1250[var10];
        }
        for (int var11 = 0; var11 < 33920; var11++) {
            class128.field3116.field2085[var11] = class86.field2241.field1250[var11];
        }
        class2.field51 = new int[256];
        for (int var12 = 0; var12 < 64; var12++) {
            class2.field51[var12] = var12 * 262144;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            class2.field51[var13 + 64] = var13 * 1024 + 16711680;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class2.field51[var14 + 128] = var14 * 4 + 16776960;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class2.field51[var15 + 192] = 16777215;
        }
        class41.field1183 = new int[256];
        for (int var16 = 0; var16 < 64; var16++) {
            class41.field1183[var16] = var16 * 1024;
        }
        for (int var17 = 0; var17 < 64; var17++) {
            class41.field1183[var17 + 64] = var17 * 4 + 65280;
        }
        for (int var18 = 0; var18 < 64; var18++) {
            class41.field1183[var18 + 128] = var18 * 262144 + 65535;
        }
        for (int var19 = 0; var19 < 64; var19++) {
            class41.field1183[var19 + 192] = 16777215;
        }
        class124.field2998 = new int[256];
        for (int var20 = 0; var20 < 64; var20++) {
            class124.field2998[var20] = var20 * 4;
        }
        for (int var21 = 0; var21 < 64; var21++) {
            class124.field2998[var21 + 64] = var21 * 262144 + 255;
        }
        for (int var22 = 0; var22 < 64; var22++) {
            class124.field2998[var22 + 128] = var22 * 1024 + 16711935;
        }
        for (int var23 = 0; var23 < 64; var23++) {
            class124.field2998[var23 + 192] = 16777215;
        }
        class101.field2546 = new int[32768];
        class100.field2489 = new int[32768];
        class52.field1476 = new int[256];
        class13.method110(null, (byte) -103);
        class101.field2531 = new int[32768];
        class56.field1575 = class56.field1570;
        class56.field1562 = class56.field1570;
        class94.field2354 = new int[32768];
        if (field383 == 0) {
            class72.field2003 = true;
        } else {
            class72.field2003 = false;
        }
        class116.field2824 = 0;
        if (class72.field2003) {
            class40.method466(2, (byte) 21);
        } else {
            class84.method764((byte) -103, 2, class56.field1570, class22.field643, class71.field1980, false, 255);
        }
        class59.method606(4096, false);
        class109.field2727 = true;
        class53.field1503 = true;
        class117.method959((byte) -79);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)Lrd;")
    public static final class117 method181(int arg0, int arg1) {
        field369++;
        if (arg1 < 100000) {
            return class142.method1131(arg1, true);
        } else if (arg1 < 10000000) {
            return class18.method193(new class117[] { class142.method1131(arg1 / 1000, true), class65.field1852 }, 55);
        } else {
            int var2 = -80 / ((arg0 - 45) / 48);
            return class18.method193(new class117[] { class142.method1131(arg1 / 1000000, true), class1.field16 }, 64);
        }
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
    public static final void method182(int arg0) {
        field368++;
        class87.field2276.method488(-7913);
        class25.field695.method929(0, 0);
        if (arg0 == 18) {
            class36.field1063 = class129.method1053(class36.field1063);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method183(int arg0, Component arg1) {
        field364++;
        arg1.removeKeyListener(class72.field2001);
        arg1.removeFocusListener(class72.field2001);
        if (arg0 != 21057) {
            field376 = -10;
        }
    }
}
