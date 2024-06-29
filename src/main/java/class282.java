import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class282 {

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4357 = "Cancel";

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field4352 = -1;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "Lqf;")
    public static class311 field4361 = new class311(512);

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "[I")
    public static int[] field4366 = new int[2];

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "[S")
    public static short[] field4365 = new short[500];

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "[I")
    public static int[] field4364 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "Lug;")
    public static class253 field4367;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "[I")
    public static int[] field4363;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)Loi;", line = 4)
    public static final class34 method1997(byte arg0) {
        field4353++;
        if (arg0 != 2) {
            method1999(19, 4, 118, -87, (byte) 44, 77, 30, 109);
        }
        class34 var1 = (class34) class224.field3555.method2198(200);
        if (var1 != null) {
            var1.method2028(13329);
            var1.method1960(-27621);
            return var1;
        }
        class34 var2;
        do {
            var2 = (class34) class79.field1082.method2198(arg0 ^ 0xCA);
            if (var2 == null) {
                return null;
            }
            if (var2.method304((byte) -32) > class219.method1609(arg0 - 900)) {
                return null;
            }
            var2.method2028(13329);
            var2.method1960(-27621);
        } while ((Long.MIN_VALUE & var2.field4294) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 48)
    public static void method1998(int arg0) {
        field4363 = null;
        field4366 = null;
        field4361 = null;
        field4367 = null;
        field4357 = null;
        field4364 = null;
        field4365 = null;
        if (arg0 != -1) {
            field4362 = 2;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIBIII)V", line = 70)
    public static final void method1999(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field4355++;
        int var8 = arg3 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class81.field1112 - class113.field1567) * var8 / 100 + class113.field1567;
        int var10 = arg2 * var9 >> 8;
        int var11 = 2048 - arg1 & 0x7FF;
        int var12 = 2048 - arg5 & 0x7FF;
        int var13 = 0;
        int var14 = 0;
        if (arg4 < 27) {
            return;
        }
        int var15 = var10;
        if (var11 != 0) {
            int var16 = class31.field467[var11];
            int var17 = class31.field451[var11];
            var14 = -var10 * var16 >> 16;
            var15 = var10 * var17 >> 16;
        }
        if (var12 != 0) {
            int var18 = class31.field467[var12];
            int var19 = class31.field451[var12];
            var13 = var15 * var18 >> 16;
            var15 = var15 * var19 >> 16;
        }
        class295.field4572 = arg6 - var13;
        class317.field5018 = arg7 - var15;
        class185.field2999 = arg5;
        class43.field588 = arg0 - var14;
        class293.field4536 = arg1;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)I", line = 128)
    public static final int method2000(int arg0, int arg1) {
        field4360++;
        if (arg0 > 0) {
            return 1;
        } else {
            if (arg1 != 5771) {
                field4368 = -86;
            }
            return arg0 >= 0 ? 0 : -1;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V", line = 152)
    public static final void method2001(int arg0) {
        if (arg0 != 2047) {
            field4352 = -64;
        }
        class146.field2314 = null;
        class110.field1521 = null;
        class317.field5020 = null;
        class71.field980 = null;
        field4351++;
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)[Lwf;", line = 165)
    public static final class56[] method2002(int arg0) {
        if (class231.field3611 == null) {
            class56[] var1 = class10.method127(class42.field581, false);
            class56[] var2 = new class56[var1.length];
            int var3 = 0;
            label56: for (int var4 = 0; var4 < var1.length; var4++) {
                class56 var5 = var1[var4];
                if ((var5.field772 <= 0 || var5.field772 >= 24) && var5.field784 >= 800 && var5.field780 >= 600) {
                    for (int var6 = 0; var6 < var3; var6++) {
                        class56 var7 = var2[var6];
                        if (var5.field784 == var7.field784 && var5.field780 == var7.field780) {
                            if (var5.field772 > var7.field772) {
                                var2[var6] = var5;
                            }
                            continue label56;
                        }
                    }
                    var2[var3] = var5;
                    var3++;
                }
            }
            class231.field3611 = new class56[var3];
            class54.method420(var2, 0, class231.field3611, 0, var3);
            int[] var8 = new int[class231.field3611.length];
            for (int var9 = 0; var9 < class231.field3611.length; var9++) {
                class56 var10 = class231.field3611[var9];
                var8[var9] = var10.field784 * var10.field780;
            }
            class83.method606(true, var8, class231.field3611);
        }
        if (arg0 <= 35) {
            return (class56[]) null;
        } else {
            field4359++;
            return class231.field3611;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BI)V", line = 247)
    public static final void method2003(byte arg0, int arg1) {
        field4354++;
        if (arg0 <= 22) {
            method1997((byte) 97);
        }
        class2.field17.method1353(-1, arg1);
        class138.field2203.method1353(-1, arg1);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 264)
    public static final boolean method2004(String arg0, int arg1) {
        field4356++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class301.field4626; var2++) {
            if (arg0.equalsIgnoreCase(class55.field768[var2])) {
                return true;
            }
        }
        if (arg1 != 21216) {
            method2003((byte) -126, -83);
        }
        if (arg0.equalsIgnoreCase(class146.field2310.field5277)) {
            return true;
        } else {
            return false;
        }
    }
}
