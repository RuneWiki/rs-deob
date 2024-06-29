import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class105 extends class182 {

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "Lrd;")
    public class190 field1909;

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "I")
    public static int field1913 = -1;

    @OriginalMember(owner = "client!jg", name = "N", descriptor = "Lkh;")
    private static class117 field1914 = class224.method1450((byte) 120, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "Lkh;")
    public static class117 field1912 = field1914;

    @OriginalMember(owner = "client!jg", name = "K", descriptor = "Leg;")
    public static class52 field1911 = new class52(5000);

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "Lkh;")
    private static class117 field1920 = class224.method1450((byte) 117, "Starting 3d library");

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "Lkh;")
    public static class117 field1916 = field1920;

    @OriginalMember(owner = "client!jg", name = "Q", descriptor = "[[I")
    public static int[][] field1917 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "[S")
    public static short[] field1919 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "Lkh;")
    public static class117 field1918 = class224.method1450((byte) 127, "Ung-Ultiger Benutzername");

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "Lai;")
    public static class10 field1915;

    @OriginalMember(owner = "client!jg", name = "U", descriptor = "[[B")
    public static byte[][] field1921;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public static final void method704(int arg0) {
        class84.method590(false, 0);
        field1910++;
        boolean var1 = true;
        class85.field1610 = 0;
        for (int var2 = 0; var2 < class30.field718.length; var2++) {
            if (class179.field3241[var2] != -1 && class30.field718[var2] == null) {
                class30.field718[var2] = class78.field1486.method104(-72, class179.field3241[var2], 0);
                if (class30.field718[var2] == null) {
                    var1 = false;
                    class85.field1610++;
                }
            }
            if (class196.field3504[var2] != -1 && class13.field412[var2] == null) {
                class13.field412[var2] = class78.field1486.method94(class165.field2981[var2], (byte) 82, 0, class196.field3504[var2]);
                if (class13.field412[var2] == null) {
                    class85.field1610++;
                    var1 = false;
                }
            }
        }
        if (!var1) {
            class23.field582 = 1;
            return;
        }
        if (arg0 > -54) {
            field1915 = null;
        }
        class4.field50 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class30.field718.length; var4++) {
            byte[] var19 = class13.field412[var4];
            if (var19 != null) {
                int var20 = (class216.field3936[var4] >> 8) * 64 - class143.field2591;
                int var21 = (class216.field3936[var4] & 0xFF) * 64 - class184.field3319;
                if (class70.field1342) {
                    var20 = 10;
                    var21 = 10;
                }
                var3 &= class177.method1230(var20, var21, true, var19);
            }
        }
        if (!var3) {
            class23.field582 = 2;
            return;
        }
        if (class23.field582 != 0) {
            class223.method1448(class36.method316((byte) -34, new class117[] { class61.field1220, class215.field3913 }), 1, true);
        }
        class93.method637(10000);
        class156.method1110(0);
        class28.method239();
        for (int var5 = 0; var5 < 4; var5++) {
            class173.field3123[var5].method17(-1);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var17 = 0; var17 < 104; var17++) {
                for (int var18 = 0; var18 < 104; var18++) {
                    class233.field4200[var6][var17][var18] = 0;
                }
            }
        }
        class54.method419(-417);
        class93.method637(10000);
        System.gc();
        class93.method637(10000);
        class84.method590(true, 0);
        class215.method1414(-15459, false);
        if (!class70.field1342) {
            class215.method1416(false, (byte) 50);
            class84.method590(true, 0);
            class99.method674(-97, false);
        }
        if (class70.field1342) {
            class155.method1105(false, 0);
            class84.method590(true, 0);
            class106.method706(false, 0);
        }
        class156.method1110(0);
        class84.method590(true, 0);
        class93.method637(10000);
        class231.method1494(true, class173.field3123, false);
        class84.method590(true, 0);
        class93.method637(10000);
        int var7 = class33.field770;
        if (class203.field3675 < var7) {
            var7 = class203.field3675;
        }
        if (var7 < class203.field3675 - 1) {
            int var8 = class203.field3675 - 1;
        }
        if (class167.field3021) {
            class160.method1139(class33.field770);
        } else {
            class160.method1139(0);
        }
        class103.method693(0);
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class139.method948(var16, (byte) 113, var9);
            }
        }
        class93.method637(10000);
        class38.method334(60);
        class156.method1110(0);
        if (class108.field2011 != null) {
            class157.field2848++;
            field1911.method400(198, 8);
            field1911.method1024(-60, 1057001181);
        }
        if (!class70.field1342) {
            int var10 = (class38.field880 - 6) / 8;
            int var11 = (class150.field2733 + 6) / 8;
            int var12 = (class38.field880 + 6) / 8;
            int var13 = (class150.field2733 - 6) / 8;
            for (int var14 = var13 - 1; var14 <= var11 + 1; var14++) {
                for (int var15 = var10 - 1; var15 <= var12 + 1; var15++) {
                    if (var13 > var14 || var11 < var14 || var10 > var15 || var12 < var15) {
                        class78.field1486.method80(0, class36.method316((byte) -34, new class117[] { class11.field380, class42.method358(var14, (byte) 34), class181.field3266, class42.method358(var15, (byte) 34) }));
                        class78.field1486.method80(0, class36.method316((byte) -34, new class117[] { class92.field1699, class42.method358(var14, (byte) 34), class181.field3266, class42.method358(var15, (byte) 34) }));
                    }
                }
            }
        }
        class94.method647(30, (byte) 97);
        class93.method637(10000);
        field1911.method400(213, 8);
        class55.method423(0);
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V")
    public static void method705(int arg0) {
        field1912 = null;
        field1916 = null;
        field1917 = null;
        field1915 = null;
        field1920 = null;
        field1921 = null;
        field1918 = null;
        field1911 = null;
        if (arg0 != 7719) {
            field1916 = null;
        }
        field1914 = null;
        field1919 = null;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lrd;)V")
    public class105(class190 arg0) {
        this.field1909 = arg0;
    }
}
