import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class203 {

    @OriginalMember(owner = "client!i", name = "p", descriptor = "Lma;")
    private class271 field3445 = new class271();

    @OriginalMember(owner = "client!i", name = "v", descriptor = "Lic;")
    private class109 field3451 = new class109();

    @OriginalMember(owner = "client!i", name = "s", descriptor = "I")
    private int field3448;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "I")
    private int field3447;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "Lvd;")
    private class126 field3450;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "[Leg;")
    public static class285[] field3435 = new class285[5000];

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static volatile int field3439 = 0;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "[S")
    public static short[] field3437 = new short[256];

    @OriginalMember(owner = "client!i", name = "k", descriptor = "Li;")
    public static class203 field3440 = new class203(64);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([[IB)V", line = 5)
    public static final void method1502(int[][] arg0, byte arg1) {
        field3434++;
        class63.field1096 = arg0;
        if (arg1 > -125) {
            field3440 = (class203) null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V", line = 16)
    public static void method1503(int arg0) {
        field3437 = null;
        if (arg0 != -1) {
            field3440 = (class203) null;
        }
        field3440 = null;
        field3435 = null;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V", line = 34)
    public static final void method1504(int arg0) {
        class249.field4198 = new class262[class198.field3331.method1912((byte) 87)][];
        if (arg0 < 110) {
            field3437 = (short[]) null;
        }
        class218.field3721 = new boolean[class198.field3331.method1912((byte) 87)];
        field3442++;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(I)Lh;", line = 51)
    public final class206 method1505(int arg0) {
        field3436++;
        int var2 = -107 % ((-arg0 - 23) / 54);
        return this.field3450.method1009(-128);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIII)V", line = 61)
    public static final void method1506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3430++;
        if (arg1 == arg5) {
            class185.method1396(arg3, arg0, arg2 + 82, arg4, arg1);
            return;
        }
        if (class153.field2635 <= (arg3 - arg1) && class288.field4956 >= arg1 + arg3 && arg0 - arg5 >= class90.field1495 && (arg0 + arg5) <= class294.field5041) {
            class255.method1820(arg4, arg0, (byte) 47, arg5, arg1, arg3);
        } else {
            class24.method166(arg4, arg0, 0, arg1, arg5, arg3);
        }
        if (arg2 != 2) {
            field3440 = (class203) null;
        }
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(I)Lh;", line = 84)
    public final class206 method1507(int arg0) {
        if (arg0 != 1) {
            this.method1514(true, 81L);
        }
        field3443++;
        return this.field3450.method1001((byte) 33);
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(I)V", line = 100)
    public static final void method1508(int arg0) {
        class136.field2328.method88(true);
        int var1 = class136.field2328.method92(1, 8);
        field3441++;
        if (var1 == 0) {
            return;
        }
        int var2 = class136.field2328.method92(2, arg0 ^ 0xFFFFFFF7);
        if (~var2 == arg0) {
            class72.field1214[class173.field2924++] = 2047;
        } else if (var2 == 1) {
            int var10 = class136.field2328.method92(3, 8);
            class279.field4831.method1455(false, var10, -93);
            int var11 = class136.field2328.method92(1, 8);
            if (var11 == 1) {
                class72.field1214[class173.field2924++] = 2047;
            }
        } else if (var2 == 2) {
            int var7 = class136.field2328.method92(3, 8);
            class279.field4831.method1455(true, var7, arg0 - 48);
            int var8 = class136.field2328.method92(3, 8);
            class279.field4831.method1455(true, var8, arg0 ^ 0x22);
            int var9 = class136.field2328.method92(1, 8);
            if (var9 == 1) {
                class72.field1214[class173.field2924++] = 2047;
            }
        } else if (var2 == 3) {
            class67.field1174 = class136.field2328.method92(2, 8);
            int var3 = class136.field2328.method92(1, arg0 + 9);
            int var4 = class136.field2328.method92(1, 8);
            if (var4 == 1) {
                class72.field1214[class173.field2924++] = 2047;
            }
            int var5 = class136.field2328.method92(7, 8);
            int var6 = class136.field2328.method92(7, 8);
            class279.field4831.method741(var5, var6, true, var3 == 1);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(JLma;I)V", line = 177)
    public final void method1509(long arg0, class271 arg1, int arg2) {
        if (~this.field3447 == arg2) {
            class271 var5 = this.field3451.method853((byte) 105);
            var5.method1527(-76);
            var5.method1937(89);
            if (this.field3445 == var5) {
                class271 var6 = this.field3451.method853((byte) 43);
                var6.method1527(-87);
                var6.method1937(61);
            }
        } else {
            this.field3447--;
        }
        this.field3450.method1004((byte) 73, arg0, arg1);
        this.field3451.method854(true, arg1);
        field3449++;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V", line = 209)
    public final void method1510(byte arg0) {
        int var2 = -122 % ((-arg0 - 83) / 36);
        this.field3451.method855(68);
        this.field3450.method1000(true);
        this.field3445 = new class271();
        field3438++;
        this.field3447 = this.field3448;
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "(I)V", line = 221)
    public static final void method1511(int arg0) {
        field3446++;
        if (arg0 != 256 || class108.field1798 != null && class232.field3916 != null) {
            return;
        }
        class232.field3916 = new int[256];
        class108.field1798 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class108.field1798[var1] = (int) (Math.sin(var2) * 4096.0D);
            class232.field3916[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BI)[F", line = 251)
    public static final float[] method1512(byte arg0, int arg1) {
        field3433++;
        float var2 = class239.method1744() + class239.method1750();
        float var3 = 0.58823526F;
        int var4 = class239.method1747();
        float var5 = (float) (var4 & 0xFF) / 255.0F;
        float var6 = (float) (var4 >> 8 & 0xFF) / 255.0F;
        if (arg0 != -99) {
            return (float[]) null;
        }
        class93.field1513[3] = 1.0F;
        class93.field1513[2] = (float) class235.method1710(arg1, 255) / 255.0F * var5 * var3 * var2;
        float var7 = (float) (var4 >> 16 & 0xFF) / 255.0F;
        class93.field1513[0] = var2 * var3 * var7 * ((float) (class235.method1710(16740954, arg1) >> 16) / 255.0F);
        class93.field1513[1] = var2 * var3 * (float) class235.method1710(arg1 >> 8, 255) / 255.0F * var6;
        return class93.field1513;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(IIIIII)V", line = 286)
    public static final void method1513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3432++;
        if (arg4 != 8539) {
            method1511(28);
        }
        int var6 = arg3 - arg2;
        int var7 = arg5 - arg0;
        if (var7 == 0) {
            if (var6 != 0) {
                class305.method2097(arg3, arg0, arg2, 1984052364, arg1);
            }
        } else if (var6 == 0) {
            class94.method729(arg2, arg1, arg5, 2, arg0);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg5;
                arg5 = arg3;
                arg3 = var9;
                int var10 = arg0;
                arg0 = arg2;
                arg2 = var10;
            }
            if (arg5 < arg0) {
                int var11 = arg2;
                int var12 = arg0;
                arg2 = arg3;
                arg3 = var11;
                arg0 = arg5;
                arg5 = var12;
            }
            int var13 = arg2;
            int var14 = arg5 - arg0;
            int var15 = -(var14 >> 1);
            int var16 = arg3 - arg2;
            int var17 = arg3 > arg2 ? 1 : -1;
            if (var16 < 0) {
                var16 = -var16;
            }
            if (var8) {
                for (int var18 = arg0; var18 <= arg5; var18++) {
                    var15 += var16;
                    class63.field1096[var18][var13] = arg1;
                    if (var15 > 0) {
                        var15 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var19 = arg0; var19 <= arg5; var19++) {
                    var15 += var16;
                    class63.field1096[var13][var19] = arg1;
                    if (var15 > 0) {
                        var13 += var17;
                        var15 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(I)V", line = 454)
    public class203(int arg0) {
        this.field3448 = arg0;
        int var2 = 1;
        this.field3447 = arg0;
        while ((var2 + var2) < arg0) {
            var2 += var2;
        }
        this.field3450 = new class126(var2);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZJ)Lma;", line = 425)
    public final class271 method1514(boolean arg0, long arg1) {
        if (arg0) {
            method1506(-106, -44, -11, 81, -74, 88);
        }
        class271 var4 = (class271) this.field3450.method1007(arg1, -17004);
        if (var4 != null) {
            this.field3451.method854(true, var4);
        }
        field3444++;
        return var4;
    }
}
