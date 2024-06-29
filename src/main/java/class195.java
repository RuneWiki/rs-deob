import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class195 {

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "J")
    public long field3273 = 0L;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field3249 = 0;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "Ldf;")
    public static class51 field3256 = class46.method233("(U0a )2 non)2existant gosub script)2num: ", 100);

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public static int field3261 = 0;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "Ldf;")
    private static class51 field3255 = class46.method233("http:)4)4advert)3runescape)3com)4banner)3ws?size=729", 100);

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "I")
    public static int field3270 = 0;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "Ldf;")
    public static class51 field3269 = field3255;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public int field3251;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public int field3253;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public int field3254;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public int field3259;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    public int field3266;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "I")
    public int field3271;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "I")
    public int field3272;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "Lu;")
    public static class111 field3267;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "Lkb;")
    public class49 field3252;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "Lkb;")
    public class49 field3268;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "Ljava/awt/Frame;")
    public static Frame field3265;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "[I")
    public static int[] field3262;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "[Lcg;")
    public static class156[] field3264;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "[[[B")
    public static byte[][][] field3263;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
    public static void method1379(byte arg0) {
        field3263 = null;
        field3267 = null;
        field3255 = null;
        field3269 = null;
        field3265 = null;
        if (arg0 != 74) {
            method1379((byte) -85);
        }
        field3256 = null;
        field3264 = null;
        field3262 = null;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V")
    public static final void method1380(byte arg0) {
        if (arg0 >= -91) {
            return;
        }
        class257.field4495.method1353(-111);
        field3250++;
        class30.field428.method1353(-122);
        class79.field1260.method1353(-117);
        class29.field421.method1353(-85);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIII)V")
    public static final void method1381(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 > arg2) {
            for (int var5 = arg2; var5 < arg3; var5++) {
                class80.field1324[var5][arg0] = arg1;
            }
        } else {
            for (int var6 = arg3; var6 < arg2; var6++) {
                class80.field1324[var6][arg0] = arg1;
            }
        }
        if (arg4 > -96) {
            method1380((byte) 3);
        }
        field3257++;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIIILkb;IZJ)Z")
    public static final boolean method1382(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class49 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class87.field1454 == class172.field2820;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class48.field758 || var24 >= class192.field3229) {
                    return false;
                }
                class97 var25 = class27.field395[arg0][var15][var24];
                if (var25 != null && var25.field1620 >= 5) {
                    return false;
                }
            }
        }
        class33 var16 = new class33();
        var16.field477 = arg11;
        var16.field482 = arg0;
        var16.field475 = arg5;
        var16.field474 = arg6;
        var16.field493 = arg7;
        var16.field488 = arg8;
        var16.field484 = arg9;
        var16.field492 = arg1;
        var16.field491 = arg2;
        var16.field495 = arg1 + arg3 - 1;
        var16.field478 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class27.field395[var22][var17][var20] == null) {
                        class27.field395[var22][var17][var20] = new class97(var22, var17, var20);
                    }
                }
                class97 var23 = class27.field395[arg0][var17][var20];
                var23.field1632[var23.field1620] = var16;
                var23.field1609[var23.field1620] = var21;
                var23.field1624 |= var21;
                var23.field1620++;
                if (var13 && class264.field4619[var17][var20] != 0) {
                    var14 = class264.field4619[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class264.field4619[var18][var19] == 0) {
                        class264.field4619[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class216.field3752[class16.field256++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)I")
    public static final int method1383(int arg0) {
        field3258++;
        return arg0 == 31305 ? ((class218.field3801 == 0 ? 0 : 1) << 22) + ((~class261.field4551 == -1 ? 0 : 1) << 20) + ((class205.field3429 & 0x3) << 17) + ((class20.field272 ? 1 : 0) << 15) + ((class263.field4602 ? 1 : 0) << 13) + ((class174.field2860 ? 1 : 0) << 10) + (((class120.field2000 ? 1 : 0) << 6) + ((class193.field3244 ? 1 : 0) << 5) + ((class234.field4104 ? 1 : 0) << 3) + (class40.field623 & 0x7) + ((class142.field2376 ? 1 : 0) << 4) - -((class35.field517 ? 1 : 0) << 7) - -((class98.field1636 ? 1 : 0) << 8)) - (-((class190.field3182 ? 1 : 0) << 9) - ((class103.field1699 & 0x3) << 11) - ((class66.field1075 ? 1 : 0) << 16) - (((class212.field3522 ? 1 : 0) << 19) - -((class26.field381 == 0 ? 0 : 1) << 21))) : -6;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)Lai;")
    public static final class82 method1384(int arg0, int arg1) {
        field3260++;
        class82 var2 = (class82) class97.field1600.method1357((byte) -82, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class115.field1950.method828(class79.method558(arg0, 105), (byte) 127, class31.method159(arg0, (byte) -69));
        class82 var4 = new class82();
        var4.field1377 = arg0;
        if (arg1 != 0) {
            method1382(-109, -17, -78, 125, -107, 98, -4, 1, (class49) null, -82, false, -71L);
        }
        if (var3 != null) {
            var4.method640(31712, new class121(var3));
        }
        class97.field1600.method1351(var4, 2, (long) arg0);
        return var4;
    }
}
