import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class8 {

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    private int field127 = 128;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
    private int field142 = 0;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "Z")
    public boolean field141 = false;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    private int field137 = 0;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "I")
    private int field143 = 0;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public int field131 = -1;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "I")
    private int field149 = 128;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field129 = 0;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "Z")
    public static boolean field126 = true;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "[[S")
    public static short[][] field135 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
    public static int field139 = 0;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "Leb;")
    public static class230 field145 = class68.method589(0, "0");

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "[[I")
    public static int[][] field150 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    private int field130;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "I")
    public int field147;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "[S")
    private short[] field125;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "[S")
    private short[] field128;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "[S")
    private short[] field140;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "[S")
    private short[] field146;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)Lrk;")
    public final class257 method77(int arg0, int arg1) {
        class257 var3 = (class257) class247.field4381.method1125((long) this.field147, true);
        field144++;
        if (var3 == null) {
            class250 var4 = class250.method1770(class105.field1909, this.field130, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field128 != null) {
                for (int var5 = 0; var5 < this.field128.length; var5++) {
                    var4.method1750(this.field128[var5], this.field125[var5]);
                }
            }
            if (this.field146 != null) {
                for (int var6 = 0; var6 < this.field146.length; var6++) {
                    var4.method1751(this.field146[var6], this.field140[var6]);
                }
            }
            var3 = var4.method1746(this.field137 + 64, this.field143 + 850, -30, -50, -30);
            class247.field4381.method1129((long) this.field147, true, var3);
        }
        class257 var7;
        if (this.field131 == -1 || arg1 == -1) {
            var7 = var3.method764(true, true);
        } else {
            var7 = class237.method1667(this.field131, arg0 + 68).method1737(65535, arg1, var3);
        }
        if (this.field149 != 128 || this.field127 != 128) {
            var7.method763(this.field149, this.field127, this.field149);
        }
        if (this.field142 != arg0) {
            if (this.field142 == 90) {
                var7.method741();
            }
            if (this.field142 == 180) {
                var7.method748();
            }
            if (this.field142 == 270) {
                var7.method758();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILfk;)V")
    public final void method78(int arg0, class14 arg1) {
        if (arg0 != 16531) {
            this.method77(-71, 74);
        }
        field132++;
        while (true) {
            int var3 = arg1.method200(255);
            if (var3 == 0) {
                return;
            }
            this.method82(var3, 31986, arg1);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V")
    public static final void method79(boolean arg0) {
        class102.field1865.method1122(10);
        field138++;
        if (arg0) {
            field126 = false;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZI)V")
    public static final void method80(boolean arg0, int arg1) {
        if (arg1 != 180) {
            method81(-2, 12, -124, -59, -38, 125, -54, -85);
        }
        field133++;
        if (class67.field1264 != arg0) {
            class67.field1264 = arg0;
            class146.method1111((byte) -116);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILfk;)V")
    private final void method82(int arg0, int arg1, class14 arg2) {
        if (arg1 != 31986) {
            method83(-87);
        }
        field134++;
        if (arg0 == 1) {
            this.field130 = arg2.method161(4);
        } else if (arg0 == 2) {
            this.field131 = arg2.method161(4);
        } else if (arg0 == 4) {
            this.field149 = arg2.method161(4);
        } else if (arg0 == 5) {
            this.field127 = arg2.method161(arg1 - 31982);
        } else if (arg0 == 6) {
            this.field142 = arg2.method161(4);
        } else if (arg0 == 7) {
            this.field137 = arg2.method200(arg1 ^ 0x7C0D);
        } else if (arg0 == 8) {
            this.field143 = arg2.method200(255);
        } else if (arg0 == 9) {
            this.field141 = true;
        } else if (arg0 == 40) {
            int var6 = arg2.method200(255);
            this.field125 = new short[var6];
            this.field128 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field128[var7] = (short) arg2.method161(class168.method1239(arg1, 31990));
                this.field125[var7] = (short) arg2.method161(4);
            }
        } else if (arg0 == 41) {
            int var4 = arg2.method200(255);
            this.field146 = new short[var4];
            this.field140 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field146[var5] = (short) arg2.method161(4);
                this.field140[var5] = (short) arg2.method161(arg1 - 31982);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
    public static void method83(int arg0) {
        if (arg0 == 8526) {
            field135 = null;
            field150 = null;
            field145 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lka;ZI)V")
    public static final void method84(class245 arg0, boolean arg1, int arg2) {
        if (arg2 >= -28) {
            method81(81, -60, 42, -47, 127, -100, -117, -117);
        }
        field148++;
        int var3 = arg0.field4298 == 0 ? arg0.field4325 : arg0.field4298;
        int var4 = arg0.field4339 == 0 ? arg0.field4307 : arg0.field4339;
        class49.method407(var4, var3, 7087, arg1, class99.field1839[arg0.field4362 >> 16], arg0.field4362);
        if (arg0.field4318 != null) {
            class49.method407(var4, var3, 7087, arg1, arg0.field4318, arg0.field4362);
        }
        class150 var5 = (class150) client.field2708.method394((long) arg0.field4362, -21083);
        if (var5 != null) {
            class138.method1063(var4, -1, var3, arg1, var5.field2681);
        }
    }
}
