import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class273 {

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "Z")
    public boolean field4441 = true;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public int field4438;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public int field4444;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public int field4442;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public int field4448;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public int field4440;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public int field4436;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "[Lrh;")
    public static class129[] field4434 = new class129[8];

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "[J")
    public static long[] field4439 = new long[100];

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Lvl;")
    public static class73 field4437;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static void method1897(int arg0) {
        field4439 = null;
        if (arg0 >= 86) {
            field4437 = null;
            field4434 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public static final void method1898(int arg0) {
        class183 var1 = (class183) class192.field3051.method1548(0);
        if (arg0 < 68) {
            return;
        }
        while (var1 != null) {
            if (var1.field2882 == -1) {
                var1.field2886 = 0;
                class148.method1004((byte) 3, var1);
            } else {
                var1.method1764(64);
            }
            var1 = (class183) class192.field3051.method1549(85);
        }
        field4445++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLmd;)V")
    public static final void method1899(byte arg0, class239 arg1) {
        class229.field3547 = 3;
        class288.method1965(false, true);
        class235.field3792 = 127;
        class136.field1960 = 255;
        class44.field528 = true;
        class96.field1437 = 127;
        class89.field1333 = true;
        class17.field234 = true;
        field4435++;
        class162.field2440 = true;
        class23.field295 = true;
        class64.field925 = true;
        class96.field1451 = 0;
        class22.field286 = 2;
        class274.field4452 = true;
        class250.field4053 = true;
        class73.field1106 = true;
        if (arg0 != -3) {
            return;
        }
        class312.field5005 = 0;
        class132 var2 = null;
        class118.field1707 = true;
        class299.field4762 = 0;
        class250.field4091 = 0;
        class234.field3773 = true;
        if (class200.field3157 < 96) {
            class65.method426(0);
        } else {
            class65.method426(2);
        }
        class210.field3279 = true;
        class170.field2663 = 0;
        class180.field2832 = false;
        class295.field4725 = false;
        class173.field2723 = 0;
        class306.field4876 = 0;
        class138.field1983 = false;
        try {
            class160 var3 = arg1.method1687("runescape", false);
            while (var3.field2399 == 0) {
                class7.method43(-58, 1L);
            }
            if (var3.field2399 == 1) {
                int var4 = 0;
                var2 = (class132) var3.field2401;
                byte[] var5 = new byte[(int) var2.method839((byte) 105)];
                while (var5.length > var4) {
                    int var6 = var2.method840(var5.length - var4, -1, var5, var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                    var4 += var6;
                }
                class19.method112((byte) 57, new class170(var5));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method841(arg0 - 973);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BII)V")
    public static final void method1900(byte arg0, int arg1, int arg2) {
        field4443++;
        class220 var3 = class74.field1128[class148.field2204][arg2][arg1];
        if (var3 == null) {
            class67.method448(class148.field2204, arg2, arg1);
            return;
        }
        if (arg0 != -97) {
            field4434 = null;
        }
        int var4 = -99999999;
        class212 var5 = null;
        for (class212 var6 = (class212) var3.method1548(0); var6 != null; var6 = (class212) var3.method1549(arg0 ^ 0xFFFFFFFA)) {
            class162 var13 = class104.method696((byte) -26, var6.field3303.field1527);
            int var14 = var13.field2434;
            if (var13.field2422 == 1) {
                var14 = (var6.field3303.field1528 + 1) * var14;
            }
            if (var14 > var4) {
                var4 = var14;
                var5 = var6;
            }
        }
        if (var5 == null) {
            class67.method448(class148.field2204, arg2, arg1);
            return;
        }
        var3.method1539(arg0 - 1770092495, var5);
        class105 var7 = null;
        class212 var8 = (class212) var3.method1548(0);
        class105 var9 = null;
        while (var8 != null) {
            class105 var12 = var8.field3303;
            if (var5.field3303.field1527 != var12.field1527) {
                if (var9 == null) {
                    var9 = var12;
                }
                if (var9.field1527 != var12.field1527 && var7 == null) {
                    var7 = var12;
                }
            }
            var8 = (class212) var3.method1549(-54);
        }
        long var10 = (long) ((arg1 << 7) + (arg2 + 1610612736));
        class77.method528(class148.field2204, arg2, arg1, class52.method351(-96, arg1 * 128 + 64, arg2 * 128 + 64, class148.field2204), var5.field3303, var10, var9, var7);
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field4438 = arg4;
        this.field4444 = arg5;
        this.field4442 = arg3;
        this.field4448 = arg0;
        this.field4440 = arg2;
        this.field4436 = arg1;
        this.field4441 = arg6;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZB)V")
    public static final void method1901(boolean arg0, byte arg1) {
        class211.field3289 = 99;
        field4447++;
        class169.field2601 = new int[104];
        class268.field4353 = new int[104];
        class306.field4884 = new int[104];
        class268.field4351 = new int[5];
        class46.field578 = new int[104];
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class104.field1520 = new byte[var2][104][104];
        int var3 = 3 / ((arg1 + 26) / 39);
        class150.field2211 = new byte[var2][104][104];
        class46.field562 = new int[104];
        class31.field378 = new byte[var2][104][104];
        class41.field503 = new byte[var2][105][105];
        class97.field1463 = new int[var2][105][105];
        class268.field4358 = new byte[var2][104][104];
    }
}
