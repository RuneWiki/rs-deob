import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class68 {

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Led;")
    public static class43 field1363 = class191.method1219("", false);

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Led;")
    public static class43 field1361 = field1363;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "Led;")
    public static class43 field1368 = field1363;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Led;")
    public static class43 field1358 = field1363;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Led;")
    private static class43 field1372 = class191.method1219("Malformed login packet)3", false);

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field1365 = 0;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Led;")
    public static class43 field1366 = field1363;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "Led;")
    public static class43 field1371 = field1363;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field1370 = 0;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "Led;")
    public static class43 field1369 = class191.method1219(" )2> <col=ff9040>", false);

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Led;")
    public static class43 field1360 = field1372;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "Led;")
    public static class43 field1374 = field1363;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Led;")
    public static class43 field1367 = class191.method1219(" zuerst von Ihrer Freunde)2Liste(Q", false);

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "Ljg;")
    public static class89 field1359;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)Z")
    public static final boolean method423(byte arg0) {
        field1375++;
        try {
            if (class158.field3206 == 2) {
                if (class77.field1542 == null) {
                    class77.field1542 = class113.method693(class5.field113, class153.field3108, class1.field32);
                    if (class77.field1542 == null) {
                        return false;
                    }
                }
                if (class187.field3676 == null) {
                    class187.field3676 = new class60(class125.field2493, class138.field2854);
                }
                if (class38.field725.method703(22050, class131.field2746, class77.field1542, 0, class187.field3676)) {
                    class38.field725.method715(arg0 - 6285);
                    class38.field725.method722(class7.field152, 1);
                    class38.field725.method700(class77.field1542, 115, class92.field1825);
                    class158.field3206 = 0;
                    class77.field1542 = null;
                    class187.field3676 = null;
                    class5.field113 = null;
                    return true;
                }
            }
            if (arg0 != -71) {
                field1372 = null;
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class38.field725.method729(arg0 ^ 0x18);
            class77.field1542 = null;
            class158.field3206 = 0;
            class187.field3676 = null;
            class5.field113 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static void method424(int arg0) {
        field1359 = null;
        field1372 = null;
        field1369 = null;
        field1374 = null;
        field1360 = null;
        field1363 = null;
        field1366 = null;
        field1371 = null;
        field1368 = null;
        if (arg0 != -5694) {
            field1367 = null;
        }
        field1367 = null;
        field1361 = null;
        field1358 = null;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
    public static final void method425(int arg0) {
        field1362++;
        for (class16 var1 = (class16) class1.field31.method753(-26703); var1 != null; var1 = (class16) class1.field31.method755((byte) 123)) {
            if (var1.field259 != null) {
                class185.field3638.method1181(var1.field259);
                var1.field259 = null;
            }
            if (var1.field265 != null) {
                class185.field3638.method1181(var1.field265);
                var1.field265 = null;
            }
        }
        if (arg0 != 0) {
            field1368 = null;
        }
        class1.field31.method751(-15085);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lga;ILga;ZI)Lla;")
    public static final class101 method426(class58 arg0, int arg1, class58 arg2, boolean arg3, int arg4) {
        field1364++;
        boolean var5 = true;
        int[] var6 = arg2.method356(arg4 + 16816, arg1);
        for (int var7 = arg4; var7 < var6.length; var7++) {
            byte[] var8 = arg2.method346(arg1, ~arg4, var6[var7]);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg3) {
                    var10 = arg0.method346(0, -1, var9);
                } else {
                    var10 = arg0.method346(var9, -1, 0);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class101(arg2, arg0, arg1, arg3);
        } catch (Exception var11) {
            return null;
        }
    }
}
