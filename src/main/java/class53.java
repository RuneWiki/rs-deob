import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class53 {

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "Lmb;")
    public static class132 field891 = class166.method1092("(U3", 124);

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "Lmb;")
    private static class132 field896 = class166.method1092("skill)2", 114);

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "Lmb;")
    public static class132 field899 = class166.method1092(": ", 111);

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "Lmb;")
    public static class132 field901 = field896;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "Lmb;")
    public static class132 field890 = class166.method1092("RuneScape wurde aktualisiert(Q", 116);

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "D")
    public static double field902;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public int field889;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public int field892;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public int field893;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public int field894;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public int field897;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    public int field900;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "I")
    public int field905;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "Lji;")
    public static class107 field895;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "[B")
    public byte[] field898;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "[B")
    public byte[] field903;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static void method362(int arg0) {
        field899 = null;
        field891 = null;
        field890 = null;
        if (arg0 >= 57) {
            field901 = null;
            field895 = null;
            field896 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIZ)V")
    public static final void method363(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field904++;
        for (class77 var5 = (class77) class90.field1585.method119(arg4); var5 != null; var5 = (class77) class90.field1585.method125((byte) -43)) {
            if (var5.field1329 != -1 || var5.field1330 != null) {
                int var6 = 0;
                if (var5.field1337 < arg3) {
                    var6 += arg3 - var5.field1337;
                } else if (arg3 < var5.field1319) {
                    var6 += var5.field1319 - arg3;
                }
                if (var5.field1311 < arg0) {
                    var6 += arg0 - var5.field1311;
                } else if (arg0 < var5.field1332) {
                    var6 += var5.field1332 - arg0;
                }
                if (var5.field1312 < var6 - 64 || class89.field1567 == 0 || var5.field1324 != arg1) {
                    if (var5.field1308 != null) {
                        class36.field586.method1268(var5.field1308);
                        var5.field1308 = null;
                    }
                    if (var5.field1310 != null) {
                        class36.field586.method1268(var5.field1310);
                        var5.field1310 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field1312 - var6) * class89.field1567 / var5.field1312;
                    if (var5.field1308 != null) {
                        var5.field1308.method1421(var7);
                    } else if (var5.field1329 >= 0) {
                        class51 var8 = class51.method348(class139.field2600, var5.field1329, 0);
                        if (var8 != null) {
                            class177 var9 = var8.method349().method1148(class144.field2683);
                            class223 var10 = class223.method1406(var9, 100, var7);
                            var10.method1430(-1);
                            class36.field586.method1267(var10);
                            var5.field1308 = var10;
                        }
                    }
                    if (var5.field1310 != null) {
                        var5.field1310.method1421(var7);
                        if (!var5.field1310.method996((byte) 85)) {
                            var5.field1310 = null;
                        }
                    } else if (var5.field1330 != null && (var5.field1331 -= arg2) <= 0) {
                        int var11 = (int) ((double) var5.field1330.length * Math.random());
                        class51 var12 = class51.method348(class139.field2600, var5.field1330[var11], 0);
                        if (var12 != null) {
                            class177 var13 = var12.method349().method1148(class144.field2683);
                            class223 var14 = class223.method1406(var13, 100, var7);
                            var14.method1430(0);
                            class36.field586.method1267(var14);
                            var5.field1331 = (int) (Math.random() * (double) (var5.field1325 - var5.field1335)) + var5.field1335;
                            var5.field1310 = var14;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)J")
    public static final long method364(int arg0, int arg1, int arg2) {
        class169 var3 = class101.field1900[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field3096; var4++) {
            class78 var5 = var3.field3103[var4];
            if ((var5.field1355 >> 29 & 0x3L) == 2L && var5.field1353 == arg1 && var5.field1362 == arg2) {
                return var5.field1355;
            }
        }
        return 0L;
    }
}
