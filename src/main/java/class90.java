import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class90 {

    @OriginalMember(owner = "client!om", name = "e", descriptor = "J")
    public long field1402 = 0L;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public static int field1400 = 0;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field1408 = new String[8];

    @OriginalMember(owner = "client!om", name = "l", descriptor = "I")
    public static int field1409 = -1;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "[I")
    public static int[] field1415 = new int[5];

    @OriginalMember(owner = "client!om", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1404 = "shake:";

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public int field1399;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public int field1403;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "I")
    public int field1405;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public int field1406;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    public int field1407;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "I")
    public int field1411;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "I")
    public int field1412;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!om", name = "q", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!om", name = "t", descriptor = "I")
    public int field1417;

    @OriginalMember(owner = "client!om", name = "u", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!om", name = "v", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!om", name = "w", descriptor = "I")
    public int field1420;

    @OriginalMember(owner = "client!om", name = "x", descriptor = "I")
    public int field1421;

    @OriginalMember(owner = "client!om", name = "y", descriptor = "I")
    public int field1422;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "Lgi;")
    public static class164 field1401;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "Lrg;")
    public static class248 field1410;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "Lie;")
    public class34 field1416;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
    public static void method624(int arg0) {
        if (arg0 != 127) {
            method625((byte) -128);
        }
        field1404 = null;
        field1415 = null;
        field1408 = null;
        field1410 = null;
        field1401 = null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V")
    public static final void method625(byte arg0) {
        class253 var1 = class171.field2801;
        synchronized (class171.field2801) {
            class62.field946++;
            class281.field4573 = class296.field4834;
            if (class242.field3842 >= 0) {
                while (class81.field1309 != class242.field3842) {
                    int var3 = class275.field4498[class81.field1309];
                    class81.field1309 = class81.field1309 + 1 & 0x7F;
                    if (var3 < 0) {
                        class8.field170[~var3] = false;
                    } else {
                        class8.field170[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class8.field170[var2] = false;
                }
                class242.field3842 = class81.field1309;
            }
            if (arg0 != -74) {
                method624(3);
            }
            class296.field4834 = class252.field4139;
        }
        field1413++;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)Log;")
    public static final class241 method626(int arg0, int arg1) {
        if (arg1 != -32260) {
            method624(37);
        }
        field1418++;
        return class273.field4420 && arg0 >= class231.field3618 && class112.field1718 >= arg0 ? class120.field1898[arg0 - class231.field3618] : null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I[Ljava/lang/String;IZ)Ljava/lang/String;")
    public static final String method627(int arg0, String[] arg1, int arg2, boolean arg3) {
        field1398++;
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var4 = arg1[arg0];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg2;
            int var6 = 0;
            for (int var7 = arg0; var7 < var5; var7++) {
                String var11 = arg1[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg0; var9 < var5; var9++) {
                String var10 = arg1[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            if (!arg3) {
                method627(-91, (String[]) null, -54, true);
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)Z")
    public static final boolean method628(int arg0) {
        field1419++;
        if (arg0 != 0) {
            return true;
        }
        if (class203.field3293) {
            try {
                class216.method1481(-93, class44.field659.field1105, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }
}
