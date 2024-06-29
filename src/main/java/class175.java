import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class175 {

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    private int field2471;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    private int field2472;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "[[I")
    private int[][] field2470;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field2461 = 2301979;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "[Lrb;")
    public static class275[] field2463 = new class275[8];

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "Z")
    public static boolean field2462 = false;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "Lhc;")
    public static class235 field2464;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)V")
    public static final void method1149(int arg0, int arg1) {
        field2459++;
        int var2 = class41.field618;
        int var3 = class89.field1252;
        int var4 = class275.field4265;
        int var5 = class246.field3773;
        int var6 = class239.field3645;
        int var7 = (int) class68.field912 + class42.field636 & 0x7FF;
        int var8 = (int) class78.field1091;
        if (class236.field3596 / 256 > var8) {
            var8 = class236.field3596 / 256;
        }
        if (arg1 >= -79) {
            field2462 = false;
        }
        if (class46.field673[4] && class122.field1700[4] + 128 > var8) {
            var8 = class122.field1700[4] + 128;
        }
        class287.method1935(class221.field3314, class275.method1836(class295.field4642, class217.field3280.field4085, class217.field3280.field4019, -122) - 50, var7, class240.field3679, var8 * 3 + 600, -1, var8, arg0);
        if (class41.field618 == var2 && class246.field3773 == var5 && class89.field1252 == var3 && class275.field4265 == var4 && class239.field3645 == var6) {
            class51.field734 = 1;
            return;
        }
        class15.field155 = 10;
        class221.field3324 = 10;
        if (var5 < class246.field3773) {
            var5 += (class246.field3773 - var5) * class221.field3324 / 1000 + class15.field155;
            if (var5 < class246.field3773) {
                class246.field3773 = var5;
            }
        }
        if (var5 > class246.field3773) {
            int var9 = var5 - ((var5 - class246.field3773) * class221.field3324 / 1000 + class15.field155);
            if (class246.field3773 < var9) {
                class246.field3773 = var9;
            }
        }
        if (var2 < class41.field618) {
            var2 += (class41.field618 - var2) * class221.field3324 / 1000 + class15.field155;
            if (class41.field618 > var2) {
                class41.field618 = var2;
            }
        }
        class48.field694 = 10;
        if (class89.field1252 > var3) {
            var3 += (class89.field1252 - var3) * class221.field3324 / 1000 + class15.field155;
            if (class89.field1252 > var3) {
                class89.field1252 = var3;
            }
        }
        if (var2 > class41.field618) {
            int var10 = var2 - ((var2 - class41.field618) * class221.field3324 / 1000 + class15.field155);
            if (var10 > class41.field618) {
                class41.field618 = var10;
            }
        }
        if (var3 > class89.field1252) {
            int var11 = var3 - ((var3 - class89.field1252) * class221.field3324 / 1000 + class15.field155);
            if (class89.field1252 < var11) {
                class89.field1252 = var11;
            }
        }
        class200.field2780 = 10;
        int var12 = class239.field3645 - var6;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (class275.field4265 > var4) {
            var4 += (class275.field4265 - var4) * class200.field2780 / 1000 + class48.field694;
            if (var4 < class275.field4265) {
                class275.field4265 = var4;
            }
        }
        if (var4 > class275.field4265) {
            int var13 = var4 - ((var4 - class275.field4265) * class200.field2780 / 1000 + class48.field694);
            if (var13 > class275.field4265) {
                class275.field4265 = var13;
            }
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            int var14 = class200.field2780 * var12 / 1000 + class48.field694 + var6;
            var6 = var14 & 0x7FF;
        }
        if (var12 < 0) {
            int var15 = var6 - (-var12 * class200.field2780 / 1000 + class48.field694);
            var6 = var15 & 0x7FF;
        }
        int var16 = class239.field3645 - var6;
        if (var16 > 1024) {
            var16 -= 2048;
        }
        if (var16 < -1024) {
            var16 += 2048;
        }
        if (var16 >= 0 || var12 <= 0 || var16 > 0 && var12 < 0) {
            class239.field3645 = var6;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLse;)Z")
    public static final boolean method1150(byte arg0, class211 arg1) {
        field2460++;
        if (arg1.field3055 == null) {
            return false;
        }
        int var2 = 0;
        if (arg0 != 75) {
            field2458 = -6;
        }
        while (arg1.field3055.length > var2) {
            int var3 = class39.method255(arg1, var2, arg0 - 87);
            int var4 = arg1.field3117[var2];
            if (arg1.field3055[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field3055[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg1.field3055[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
            var2++;
        }
        return true;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZ)I")
    public final int method1151(int arg0, boolean arg1) {
        if (this.field2470 != null) {
            arg0 = (int) ((long) this.field2471 * (long) arg0 / (long) this.field2472) + 6;
        }
        field2469++;
        if (arg1) {
            field2464 = null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)I")
    public static final int method1152(int arg0, int arg1) {
        if (arg0 != 0) {
            method1150((byte) -102, (class211) null);
        }
        field2467++;
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B[B)[B")
    public final byte[] method1153(byte arg0, byte[] arg1) {
        if (this.field2470 != null) {
            int var3 = 0;
            int var4 = (int) ((long) arg1.length * (long) this.field2471 / (long) this.field2472) + 14;
            int var5 = 0;
            int[] var6 = new int[var4];
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field2470[var5];
                for (int var12 = 0; var12 < 14; var12++) {
                    var6[var3 + var12] += var11[var12] * var10;
                }
                int var13 = this.field2471 + var5;
                int var14 = var13 / this.field2472;
                var3 += var14;
                var5 = var13 - this.field2472 * var14;
            }
            arg1 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9 = var6[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        int var15 = -103 % ((-arg0 - 37) / 62);
        field2466++;
        return arg1;
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(II)I")
    public final int method1154(int arg0, int arg1) {
        if (arg1 != 4875) {
            return 11;
        }
        field2468++;
        if (this.field2470 != null) {
            arg0 = (int) ((long) this.field2471 * (long) arg0 / (long) this.field2472);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
    public static void method1155(byte arg0) {
        field2464 = null;
        field2463 = null;
        if (arg0 != -57) {
            field2462 = true;
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(II)V")
    public class175(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class204.method1300(arg0, 255, arg1);
            int var4 = arg1 / var3;
            this.field2471 = var4;
            int var5 = arg0 / var3;
            this.field2472 = var5;
            this.field2470 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                double var7 = (double) var6 / (double) var5 + 6.0D;
                int[] var9 = this.field2470[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var7 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var10 < var11) {
                    double var14 = var12;
                    double var16 = ((double) var10 - var7) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var12 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
