import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class116 {

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "Ldj;")
    public class129 field1981 = new class129();

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "J")
    public static long field1982 = 0L;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field1983 = 0;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "Leg;")
    public static class37 field1985 = class174.method1167("(U5", -22);

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field1986 = -1;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "Z")
    public static boolean field1979;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
    public static final void method830(byte arg0) {
        field1980++;
        class248.method1713((byte) -98, false);
        boolean var1 = true;
        class52.field814 = 0;
        for (int var2 = 0; var2 < class47.field740.length; var2++) {
            if (class230.field3944[var2] != -1 && class47.field740[var2] == null) {
                class47.field740[var2] = class50.field783.method666(0, class230.field3944[var2], (byte) -51);
                if (class47.field740[var2] == null) {
                    class52.field814++;
                    var1 = false;
                }
            }
            if (class165.field2747[var2] != -1 && class115.field1941[var2] == null) {
                class115.field1941[var2] = class50.field783.method675(class39.field634[var2], class165.field2747[var2], 0, (byte) -22);
                if (class115.field1941[var2] == null) {
                    class52.field814++;
                    var1 = false;
                }
            }
            if (class143.field2440 != null && class288.field5089[var2] == null && class143.field2440[var2] != -1) {
                class288.field5089[var2] = class50.field783.method675(class39.field634[var2], class143.field2440[var2], 0, (byte) -22);
                if (class288.field5089[var2] == null) {
                    class52.field814++;
                    var1 = false;
                }
            }
        }
        if (class27.field393 == null) {
            if (class260.field4603 == null || !class215.field3714.method680(arg0 - 19, class156.method1061((byte) -59, new class37[] { class260.field4603.field114, class108.field1744 }))) {
                class27.field393 = new class4(0);
            } else if (class215.field3714.method678(class156.method1061((byte) 65, new class37[] { class260.field4603.field114, class108.field1744 }), 0)) {
                class27.field393 = client.method794(class156.method1061((byte) -59, new class37[] { class260.field4603.field114, class108.field1744 }), 24021, class215.field3714);
            } else {
                class52.field814++;
                var1 = false;
            }
        }
        if (!var1) {
            class171.field2881 = 1;
            return;
        }
        class137.field2353 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class47.field740.length; var4++) {
            byte[] var20 = class115.field1941[var4];
            if (var20 != null) {
                int var21 = (class210.field3615[var4] >> 8) * 64 - class40.field642;
                int var22 = (class210.field3615[var4] & 0xFF) * 64 - class144.field2456;
                if (class277.field4910) {
                    var21 = 10;
                    var22 = 10;
                }
                var3 &= class277.method1862(var21, var20, (byte) -15, var22);
            }
        }
        if (!var3) {
            class171.field2881 = 2;
            return;
        }
        if (class171.field2881 != 0) {
            class115.method824((byte) -44, class156.method1061((byte) -92, new class37[] { class228.field3926, class21.field277 }), true);
        }
        boolean var5 = false;
        class126.method898((byte) 83);
        class241.method1655((byte) 115);
        class94.method613(4, 104, 104, 25, var5);
        if (arg0 != 20) {
            field1983 = -83;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            class215.field3719[var6].method1101(false);
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var18 = 0; var18 < 104; var18++) {
                for (int var19 = 0; var19 < 104; var19++) {
                    class241.field4312[var7][var18][var19] = 0;
                }
            }
        }
        class221.method1548(120, false);
        class126.method898((byte) 83);
        System.gc();
        class248.method1713((byte) -128, true);
        class256.method1745(-98, false);
        if (!class277.field4910) {
            class123.method883(true, false);
            class248.method1713((byte) -118, true);
            class280.method1883(-82, false);
            if (class288.field5089 != null) {
                class202.method1398(arg0 ^ 0xD);
            }
        }
        if (class277.field4910) {
            class150.method1029(false, (byte) 45);
            class248.method1713((byte) -125, true);
            class213.method1516((byte) 99, false);
        }
        class241.method1655((byte) 55);
        class248.method1713((byte) -116, true);
        class235.method1614(class215.field3719, false, (byte) 93);
        class248.method1713((byte) -119, true);
        int var8 = class271.field4758;
        if (class237.field4140 < var8) {
            var8 = class237.field4140;
        }
        if (class237.field4140 - 1 > var8) {
            int var9 = class237.field4140 - 1;
        }
        if (class72.method492(-2001)) {
            class64.method450(0);
        } else {
            class64.method450(class271.field4758);
        }
        class9.method53(-15033);
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class50.method324(var17, var10, (byte) 21);
            }
        }
        client.method790(-113);
        class126.method898((byte) 83);
        class87.method580(-70);
        class241.method1655((byte) 61);
        if (class71.field1114 != null && class187.field3190 != null && class232.field4011 == 25) {
            class40.field649++;
            class273.field4778.method1697(221, 113);
            class273.field4778.method1272(arg0 + 27842, 1057001181);
        }
        if (!class277.field4910) {
            int var11 = (class260.field4598 - 6) / 8;
            int var12 = (class260.field4598 + 6) / 8;
            int var13 = (class68.field1073 - 6) / 8;
            int var14 = (class68.field1073 + 6) / 8;
            for (int var15 = var11 - 1; var15 <= (var12 + 1); var15++) {
                for (int var16 = var13 - 1; var16 <= var14 + 1; var16++) {
                    if (var15 < var11 || var12 < var15 || var16 < var13 || var16 > var14) {
                        class50.field783.method682(class156.method1061((byte) 111, new class37[] { class188.field3207, class163.method1096(var15, (byte) -35), class246.field4426, class163.method1096(var16, (byte) -35) }), false);
                        class50.field783.method682(class156.method1061((byte) -85, new class37[] { class73.field1156, class163.method1096(var15, (byte) -35), class246.field4426, class163.method1096(var16, (byte) -35) }), false);
                    }
                }
            }
        }
        if (class232.field4011 == 28) {
            class102.method683(10, false);
        } else {
            class102.method683(30, false);
            if (class187.field3190 != null) {
                class273.field4778.method1697(32, 93);
            }
        }
        class8.method48(-16);
        class126.method898((byte) 83);
        class18.method122(arg0 ^ 0x14);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static void method831(int arg0) {
        if (arg0 >= 119) {
            field1985 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
    public final void method832(int arg0) {
        if (arg0 != 104) {
            return;
        }
        field1984++;
        while (true) {
            class129 var2 = this.field1981.field2156;
            if (this.field1981 == var2) {
                return;
            }
            var2.method913((byte) 99);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLdj;)V")
    public final void method833(byte arg0, class129 arg1) {
        if (arg1.field2148 != null) {
            arg1.method913((byte) 113);
        }
        field1977++;
        arg1.field2156 = this.field1981;
        if (arg0 != 18) {
            this.field1981 = null;
        }
        arg1.field2148 = this.field1981.field2148;
        arg1.field2148.field2156 = arg1;
        arg1.field2156.field2148 = arg1;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
    public class116() {
        this.field1981.field2148 = this.field1981;
        this.field1981.field2156 = this.field1981;
    }
}
