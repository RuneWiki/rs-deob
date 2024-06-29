import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class39 extends class67 {

    @OriginalMember(owner = "client!de", name = "F", descriptor = "Li;")
    private static class88 field688 = class208.method1425(105, "flash3:");

    @OriginalMember(owner = "client!de", name = "H", descriptor = "Li;")
    public static class88 field690 = class208.method1425(105, "hint_mapedge");

    @OriginalMember(owner = "client!de", name = "G", descriptor = "Li;")
    public static class88 field689 = class208.method1425(105, "title)3jpg");

    @OriginalMember(owner = "client!de", name = "N", descriptor = "Li;")
    public static class88 field696 = field688;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "Li;")
    public static class88 field683 = field688;

    @OriginalMember(owner = "client!de", name = "P", descriptor = "I")
    public static int field698 = 0;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "I")
    public int field679;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "I")
    public int field682;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!de", name = "I", descriptor = "I")
    public int field691;

    @OriginalMember(owner = "client!de", name = "J", descriptor = "I")
    public int field692;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!de", name = "L", descriptor = "I")
    public int field694;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!de", name = "O", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!de", name = "B", descriptor = "Lnb;")
    public static class144 field684;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "Lq;")
    public class174 field676;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "Lq;")
    public class174 field678;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "Li;")
    public class88 field677;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "Z")
    public boolean field686;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "[Ljava/lang/Object;")
    public Object[] field681;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IZI)I")
    public static final int method255(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method255(-34, false, -102);
        }
        field695++;
        class177 var3 = (class177) class64.field1163.method1051(-1, (long) arg2);
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && arg0 < var3.field3555.length) {
            return var3.field3555[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
    public static final void method256(int arg0) {
        if (arg0 >= -78) {
            field698 = 58;
        }
        field699++;
        for (class20 var1 = (class20) class167.field3222.method1612(false); var1 != null; var1 = (class20) class167.field3222.method1621(82)) {
            class77 var2 = var1.field315;
            if (class149.field2909 != var2.field1390 || class117.field2115 > var2.field1407) {
                var1.method460(true);
            } else if (var2.field1371 <= class117.field2115) {
                if (var2.field1387 > 0) {
                    class191 var3 = class225.field4225[var2.field1387 - 1];
                    if (var3 != null && var3.field4138 >= 0 && var3.field4138 < 13312 && var3.field4123 >= 0 && var3.field4123 < 13312) {
                        var2.method520(var3.field4138, class117.field2115, class239.method1586(var3.field4138, var3.field4123, 2, var2.field1390) - var2.field1396, -14596, var3.field4123);
                    }
                }
                if (var2.field1387 < 0) {
                    int var4 = -var2.field1387 - 1;
                    class44 var5;
                    if (class220.field4166 == var4) {
                        var5 = class240.field4458;
                    } else {
                        var5 = class244.field4493[var4];
                    }
                    if (var5 != null && var5.field4138 >= 0 && var5.field4138 < 13312 && var5.field4123 >= 0 && var5.field4123 < 13312) {
                        var2.method520(var5.field4138, class117.field2115, class239.method1586(var5.field4138, var5.field4123, 2, var2.field1390) - var2.field1396, -14596, var5.field4123);
                    }
                }
                var2.method517(0, class17.field261);
                class126.method861(class149.field2909, (int) var2.field1406, (int) var2.field1391, (int) var2.field1375, 60, var2, var2.field1381, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
    public static void method257(int arg0) {
        field690 = null;
        field696 = null;
        field684 = null;
        if (arg0 != 17478) {
            method256(124);
        }
        field688 = null;
        field683 = null;
        field689 = null;
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
    public static final void method258(int arg0) {
        field680++;
        int var1 = class234.field4385;
        int var2 = class86.field1549;
        int var3 = 6116423;
        int var4 = class237.field4423;
        int var5 = class47.field889;
        class72.method478(var2, var1, var4, var5, var3);
        class72.method478(var2 + 1, var1 + 1, var4 - 2, 16, 0);
        class72.method476(var2 + 1, var1 + 18, var4 - 2, var5 - 19, 0);
        class54.field1011.method154(class25.field398, var2 + 3, var1 + 14, var3, -1);
        int var6 = class28.field471;
        int var7 = class239.field4451;
        if (arg0 <= 41) {
            method258(43);
        }
        for (int var8 = 0; var8 < class203.field3864; var8++) {
            int var9 = var1 + (class203.field3864 - var8 - 1) * 15 + 31;
            int var10 = 16777215;
            if (var2 < var6 && var6 < var2 + var4 && var7 > var9 - 13 && var7 < var9 + 3) {
                var10 = 16776960;
            }
            class54.field1011.method154(class78.method525(var8, true), var2 + 3, var9, var10, 0);
        }
        class129.method876(class86.field1549, class47.field889, 0, class237.field4423, class234.field4385);
    }
}
