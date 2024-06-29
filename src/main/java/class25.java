import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class25 extends class90 {

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "I")
    public static int field342 = 0;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
    public static int field331 = 0;

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "I")
    public static int field345 = 0;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "Ljava/util/Random;")
    public static Random field334 = new Random();

    @OriginalMember(owner = "client!jb", name = "ab", descriptor = "J")
    public static long field346 = 0L;

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
    public int field326;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
    public int field329;

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "I")
    public int field333;

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
    public int field337;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!jb", name = "bb", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!jb", name = "cb", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "Ljava/lang/String;")
    public String field344;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "[I")
    public int[] field325;

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "[I")
    public int[] field328;

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "[Lh;")
    public class190[] field343;

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "[Ljava/lang/String;")
    public String[] field330;

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "[[I")
    public static int[][] field335;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLha;)V")
    public static final void method182(byte arg0, class267 arg1) {
        field340++;
        class267 var2 = class79.method524(899, arg1);
        if (arg0 <= 113) {
            method190((byte) -21);
        }
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class250.field3813;
            var4 = class214.field3080;
        } else {
            var3 = var2.field4051;
            var4 = var2.field4177;
        }
        class56.method377((byte) -40, var4, arg1, var3, false);
        class181.method1172(arg1, var4, var3, (byte) -3);
    }

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)V")
    public static final void method183(int arg0) {
        field327++;
        if (arg0 == 0) {
            class235.field3545++;
            class95.field1451.method522(184, arg0 + 28727);
            class95.field1451.method794(class30.field426, (byte) -26);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIII)V")
    public static final void method184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != -18357) {
            return;
        }
        int var6 = arg0 * arg0;
        field347++;
        int var7 = arg1 * arg1;
        int var8 = 0;
        int var9 = arg1;
        int var10 = var7 << 1;
        class183.method1181(arg5, (byte) -69, arg0 + arg4, class163.field2370[arg3], arg4 - arg0);
        int var11 = arg1 << 1;
        int var12 = (1 - var11) * var6 + var10;
        int var13 = var6 << 1;
        int var14 = var6 << 2;
        int var15 = var7 - ((var11 - 1) * var13);
        int var16 = var7 << 2;
        int var17 = ((arg1 << 1) - 3) * var13;
        int var18 = ((var8 << 1) + 3) * var10;
        int var19 = (var8 + 1) * var16;
        int var20 = (arg1 - 1) * var14;
        while (var9 > 0) {
            if (var12 < 0) {
                while (var12 < 0) {
                    var8++;
                    var15 += var19;
                    var19 += var16;
                    var12 += var18;
                    var18 += var16;
                }
            }
            var9--;
            int var21 = arg3 - var9;
            int var22 = arg3 + var9;
            if (var15 < 0) {
                var8++;
                var15 += var19;
                var19 += var16;
                var12 += var18;
                var18 += var16;
            }
            var12 += -var20;
            var15 += -var17;
            var20 -= var14;
            int var23 = arg4 + var8;
            int var24 = arg4 - var8;
            class183.method1181(arg5, (byte) -69, var23, class163.field2370[var21], var24);
            var17 -= var14;
            class183.method1181(arg5, (byte) -69, var23, class163.field2370[var22], var24);
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(Z)V")
    private static final void method185(boolean arg0) {
        field348++;
        class218.field3224.method260(0);
        if (!arg0) {
            method189(-96, 36, -5);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZII)I")
    public static final int method186(boolean arg0, int arg1, int arg2) {
        field324++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            if (arg0) {
                field334 = null;
            }
            int var3 = (arg1 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "(I)V")
    public static void method187(int arg0) {
        if (arg0 == 26580) {
            field334 = null;
            field335 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(III)J")
    public static final long method188(int arg0, int arg1, int arg2) {
        class131 var3 = class16.field233[arg0][arg1][arg2];
        return var3 == null || var3.field1928 == null ? 0L : var3.field1928.field3979;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(III)Lhc;")
    public static final class151 method189(int arg0, int arg1, int arg2) {
        class151 var3 = new class151();
        class225 var4 = (class225) class14.field216.method656(93);
        if (arg2 > -58) {
            field346 = 68L;
        }
        while (var4 != null) {
            if (var4.field3384 && var4.method1471(arg1, arg0, -6)) {
                var3.method1028(false, var4);
            }
            var4 = (class225) class14.field216.method650(125);
        }
        field336++;
        return var3;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public static final void method190(byte arg0) {
        field339++;
        class27.method199(0);
        class153.method1035((byte) 0);
        class65.method449(1);
        class158.method1063(false);
        class171.method1131((byte) 99);
        class37.method261(arg0 ^ 0xFFFFFF8F);
        class154.method1042(64);
        class268.method1796(19283);
        class247.method1631(arg0 ^ 0xFFFFECC6);
        class229.method1496(arg0 - 113);
        method185(true);
        class109.method713((byte) -77);
        class243.method1579(arg0 - 181);
        class226.method1477(arg0 - 112);
        class182.method1177((byte) -116);
        class155.method1046((byte) 30);
        if (class118.field1732 != 0) {
            for (int var1 = 0; var1 < class195.field2811.length; var1++) {
                class195.field2811[var1] = null;
            }
            class256.field3887 = 0;
        }
        class96.method645(false);
        class89.method603((byte) -124);
        class242.field3625.method260(arg0 ^ 0x70);
        if (arg0 != 112) {
            field346 = -96L;
        }
        ((class242) class18.field252).method1577((byte) 82);
        class187.field2659.method1500(false);
        class118.field1727.method1513(arg0 - 112);
        class246.field3675.method1513(0);
        class181.field2597.method1513(arg0 ^ 0x70);
        class67.field1040.method1513(arg0 - 112);
        class136.field1971.method1513(0);
        class53.field777.method1513(arg0 ^ 0x70);
        class26.field378.method1513(0);
        class45.field634.method1513(0);
        class37.field557.method1513(0);
        class211.field3030.method1513(0);
        class236.field3557.method1513(0);
        class268.field4193.method260(0);
    }
}
