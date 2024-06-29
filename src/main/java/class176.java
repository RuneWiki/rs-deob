import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class176 extends class213 {

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "Z")
    public static boolean field3293 = false;

    @OriginalMember(owner = "client!qh", name = "Q", descriptor = "[[[I")
    public static int[][][] field3295 = new int[4][105][105];

    @OriginalMember(owner = "client!qh", name = "W", descriptor = "Laj;")
    public static class11 field3301 = new class11();

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!qh", name = "P", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!qh", name = "R", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!qh", name = "V", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!qh", name = "X", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!qh", name = "Y", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!qh", name = "Z", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!qh", name = "ab", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!qh", name = "cb", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!qh", name = "db", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!qh", name = "eb", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!qh", name = "bb", descriptor = "Lab;")
    public static class3 field3306;

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "[I")
    private int[] field3292;

    @OriginalMember(owner = "client!qh", name = "S", descriptor = "[I")
    public int[] field3297;

    @OriginalMember(owner = "client!qh", name = "U", descriptor = "[Lvd;")
    private class222[] field3299;

    @OriginalMember(owner = "client!qh", name = "T", descriptor = "[[I")
    private int[][] field3298;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLfa;)V")
    public static final void method1107(byte arg0, class56 arg1) {
        field3307++;
        if (arg0 != 66) {
            field3301 = null;
        }
        long var2 = 0L;
        if (arg1.field1055 == 0) {
            var2 = class146.method921(arg1.field1043, arg1.field1058, arg1.field1057);
        }
        if (arg1.field1055 == 1) {
            var2 = class56.method413(arg1.field1043, arg1.field1058, arg1.field1057);
        }
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1.field1055 == 2) {
            var2 = class200.method1280(arg1.field1043, arg1.field1058, arg1.field1057);
        }
        if (arg1.field1055 == 3) {
            var2 = class94.method603(arg1.field1043, arg1.field1058, arg1.field1057);
        }
        if (var2 != 0L) {
            var5 = (int) var2 >> 14 & 0x1F;
            var6 = (int) var2 >> 20 & 0x3;
            var4 = Integer.MAX_VALUE & (int) (var2 >>> 32);
        }
        arg1.field1048 = var6;
        arg1.field1046 = var4;
        arg1.field1052 = var5;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLka;)V")
    public final void method1108(byte arg0, class109 arg1) {
        field3291++;
        if (arg0 != -78) {
            this.method1116(-92);
        }
        while (true) {
            int var3 = arg1.method662((byte) -107);
            if (var3 == 0) {
                return;
            }
            this.method1109(var3, arg1, (byte) 84);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILka;B)V")
    private final void method1109(int arg0, class109 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field3299 = arg1.method674(-111).method1440(60, true);
        } else if (arg0 == 2) {
            int var8 = arg1.method662((byte) -98);
            this.field3297 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3297[var9] = arg1.method675(2);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method662((byte) -113);
            this.field3292 = new int[var4];
            this.field3298 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method675(2);
                this.field3292[var5] = var6;
                this.field3298[var5] = new int[class228.field4293[var6]];
                for (int var7 = 0; var7 < class228.field4293[var6]; var7++) {
                    this.field3298[var5][var7] = arg1.method675(2);
                }
            }
        }
        int var10 = 21 % ((arg2 - 10) / 49);
        field3294++;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIII)V")
    public static final void method1110(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3300++;
        if (arg2 >= class112.field2107 && arg2 <= class127.field2448) {
            int var5 = class22.method209(class129.field2514, arg1, arg3 ^ 0x7E33, class230.field4322);
            int var6 = class22.method209(class129.field2514, arg0, -88, class230.field4322);
            class127.method804((byte) -67, var6, arg4, arg2, var5);
        }
        if (arg3 != 32357) {
            method1110(-101, 114, 127, -32, -18);
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V")
    public static void method1111(byte arg0) {
        field3306 = null;
        field3301 = null;
        if (arg0 <= 71) {
            field3306 = null;
        }
        field3295 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)I")
    public final int method1112(int arg0, byte arg1) {
        field3309++;
        int var3 = 61 % ((45 - arg1) / 41);
        return this.field3292 == null || arg0 < 0 || arg0 > this.field3292.length ? -1 : this.field3292[arg0];
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IBI)I")
    public final int method1113(int arg0, byte arg1, int arg2) {
        field3303++;
        if (this.field3292 == null || arg0 < 0 || this.field3292.length < arg0) {
            return -1;
        } else if (arg1 < 90) {
            return 3;
        } else if (this.field3298[arg0] == null || arg2 < 0 || this.field3298[arg0].length < arg2) {
            return -1;
        } else {
            return this.field3298[arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lka;B)Lvd;")
    public final class222 method1114(class109 arg0, byte arg1) {
        if (arg1 >= -23) {
            return null;
        }
        field3296++;
        class222 var3 = class218.method1386(192, 80);
        if (this.field3292 != null) {
            for (int var4 = 0; var4 < this.field3292.length; var4++) {
                var3.method1448(this.field3299[var4], 7);
                var3.method1448(class22.method208(this.field3292[var4], this.field3298[var4], -16409, arg0.method703(class185.field3419[this.field3292[var4]], -16850)), 7);
            }
        }
        var3.method1448(this.field3299[this.field3299.length - 1], 7);
        return var3.method1430((byte) 121);
    }

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)I")
    public final int method1115(int arg0) {
        if (arg0 == 0) {
            field3308++;
            return this.field3292 == null ? 0 : this.field3292.length;
        } else {
            return 104;
        }
    }

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "(I)Lvd;")
    public final class222 method1116(int arg0) {
        field3305++;
        class222 var2 = class218.method1386(192, 80);
        var2.method1448(this.field3299[0], 7);
        if (arg0 >= -85) {
            return null;
        }
        for (int var3 = 1; var3 < this.field3299.length; var3++) {
            var2.method1448(class104.field1934, 7);
            var2.method1448(this.field3299[var3], 7);
        }
        return var2.method1430((byte) -81);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILvd;I)V")
    public static final void method1117(int arg0, class222 arg1, int arg2) {
        field3302++;
        if (arg2 < 105) {
            field3295 = null;
        }
        class42.field895.method1347((byte) -122, 240);
        class77.field1492++;
        class42.field895.method666((byte) 119, arg1.method1428(15109));
        class42.field895.method665((byte) 32, arg0);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lka;I[I)V")
    public final void method1118(class109 arg0, int arg1, int[] arg2) {
        field3304++;
        if (this.field3292 == null) {
            return;
        }
        for (int var4 = 0; this.field3292.length > var4 && arg2.length > var4; var4++) {
            int var5 = class65.field1210[this.method1112(var4, (byte) -93)];
            if (var5 > 0) {
                arg0.method696(var5, (byte) 103, (long) arg2[var4]);
            }
        }
        int var6 = 60 / ((arg1 + 37) / 59);
    }
}
