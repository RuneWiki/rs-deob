import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class190 {

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    public static int field2233 = 0;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "J")
    public static long field2225 = -1L;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "Lts;")
    public static class33 field2227;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
    public static void method1176(int arg0) {
        field2227 = null;
        if (arg0 != 0) {
            field2233 = -34;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "([BI)Lpe;")
    public static final class107 method1177(byte[] arg0, int arg1) {
        field2228++;
        class107 var2 = new class107();
        class242 var3 = new class242(arg0);
        var3.field3211 = var3.field3188.length - 2;
        int var4 = var3.method1587((byte) -102);
        int var5 = var3.field3188.length - var4 - 12 - 2;
        var3.field3211 = var5;
        int var6 = var3.method1576((byte) 127);
        var2.field1285 = var3.method1587((byte) -102);
        if (arg1 != -40) {
            return null;
        }
        var2.field1278 = var3.method1587((byte) -102);
        var2.field1276 = var3.method1587((byte) -102);
        var2.field1281 = var3.method1587((byte) -102);
        int var7 = var3.method1563(-128);
        if (var7 > 0) {
            var2.field1282 = new class349[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method1587((byte) -102);
                class349 var10 = new class349(class39.method249(var9, true));
                var2.field1282[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method1576((byte) 126);
                    int var12 = var3.method1576((byte) 121);
                    var10.method2227(new class369(var12), arg1 - 8178, (long) var11);
                }
            }
        }
        var3.field3211 = 0;
        var2.field1279 = var3.method1543(arg1 + 27738);
        var2.field1283 = new String[var6];
        var2.field1284 = new int[var6];
        var2.field1280 = new int[var6];
        int var13 = 0;
        while (var3.field3211 < var5) {
            int var14 = var3.method1587((byte) -102);
            if (var14 == 3) {
                var2.field1283[var13] = var3.method1565(-97).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field1284[var13] = var3.method1563(-128);
            } else {
                var2.field1284[var13] = var3.method1576((byte) 121);
            }
            var2.field1280[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lbb;ILuo;IZ)V")
    public static final void method1178(class270 arg0, int arg1, class118 arg2, int arg3, boolean arg4) {
        if (arg4) {
            method1176(50);
        }
        field2232++;
        class141.field1663.method1701(!arg4);
        if (class39.field466) {
            return;
        }
        for (class278 var5 = (class278) arg0.method1690((byte) -123); var5 != null; var5 = (class278) arg0.method1699((byte) 82)) {
            class222 var6 = class339.method2178(arg4, var5.field3596);
            if (class288.method1839(64, var6)) {
                boolean var7 = class2.method7(var5, var6, false, arg3, arg1, arg2);
                if (var7) {
                    class183.method1141(var5, var6, arg2, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILjava/lang/String;ZLak;)V")
    public static final void method1179(int arg0, String arg1, boolean arg2, class31 arg3) {
        field2235++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class236.field3101.method2209(0, arg1, 250, (class436[]) null);
        int var8 = class236.field3101.method2207(arg1, (class436[]) null, 250, false) * 13;
        class267.field3454.method789(var5 - var4, -var4 + var6, var7 + var4 + var4, var4 + var4 + var8, -16777216, 0);
        class267.field3454.method748(var5 - var4, -var4 + var6, var4 + var4 + var7, var8 - -var4 + var4, -1, 0);
        arg3.method200(1, 23897, (int[]) null, var8, var6, arg0, -1, (class436[]) null, var7, 1, arg1, 0, var5, 0, -1, (class423) null);
        class31.method203(var4 + var8 + var4, var4 + var7 + var4, var6 - var4, -var4 + var5, 174);
        if (arg2) {
            class267.field3454.method757();
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lwo;I)V")
    public static final void method1180(class285 arg0, int arg1) {
        if (arg1 != -32654) {
            method1176(112);
        }
        field2234++;
        class288.field3786 = arg0;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILwo;)V")
    public static final void method1181(int arg0, class285 arg1) {
        class266.field3433 = 0;
        field2229++;
        class161.field1877 = 0;
        if (arg0 != 1024) {
            field2231 = 7;
        }
        class220.field2722 = new class288();
        class276.field3579 = new class58[1024];
        class75.method445(arg1, -26311);
        class119.method797(true, arg1);
    }
}
