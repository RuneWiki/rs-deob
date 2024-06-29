import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class75 extends class312 {

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "[S")
    public static short[] field1112 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!uh", name = "G", descriptor = "[I")
    public static int[] field1120 = new int[14];

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "I")
    public static int field1123 = -1;

    @OriginalMember(owner = "client!uh", name = "N", descriptor = "[I")
    public static int[] field1127 = new int[64];

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!uh", name = "A", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!uh", name = "D", descriptor = "I")
    public int field1117;

    @OriginalMember(owner = "client!uh", name = "F", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!uh", name = "H", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!uh", name = "I", descriptor = "I")
    public int field1122;

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "I")
    public int field1124;

    @OriginalMember(owner = "client!uh", name = "L", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!uh", name = "M", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!uh", name = "E", descriptor = "Ljava/lang/String;")
    public String field1118;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BLwf;)V", line = 5)
    public static final void method523(byte arg0, class306 arg1) {
        class215.field3402 = arg1.method2107("p11_full", (byte) 115);
        field1126++;
        if (arg0 != 6) {
            method532(true, -35, 38, -31, -38);
        }
        class95.field1452 = arg1.method2107("p12_full", (byte) 118);
        class323.field5032 = arg1.method2107("b12_full", (byte) 126);
        class218.field3478 = arg1.method2107("mapfunction", (byte) 127);
        class272.field4182 = arg1.method2107("hitmarks", (byte) 122);
        class183.field2808 = arg1.method2107("hitbar_default", (byte) 127);
        class156.field2445 = arg1.method2107("headicons_pk", (byte) 127);
        class253.field3960 = arg1.method2107("headicons_prayer", (byte) 115);
        class138.field2135 = arg1.method2107("hint_headicons", (byte) 117);
        class306.field4827 = arg1.method2107("hint_mapmarkers", (byte) 121);
        class97.field1491 = arg1.method2107("mapflag", (byte) 127);
        class89.field1360 = arg1.method2107("cross", (byte) 120);
        class274.field4217 = arg1.method2107("mapdots", (byte) 118);
        class272.field4171 = arg1.method2107("scrollbar", (byte) 121);
        class218.field3464 = arg1.method2107("name_icons", (byte) 125);
        class71.field1065 = arg1.method2107("floorshadows", (byte) 115);
        class34.field443 = arg1.method2107("compass", (byte) 123);
        class260.field4039 = arg1.method2107("hint_mapedge", (byte) 127);
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(B)V", line = 34)
    public final void method524(byte arg0) {
        field1125++;
        this.field4938 |= Long.MIN_VALUE;
        if (arg0 == 57 && this.method527(117) == 0L) {
            class234.field3763.method1824(this, (byte) -114);
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)V", line = 50)
    public static void method525(int arg0) {
        field1120 = null;
        field1112 = null;
        field1127 = null;
        if (arg0 > -38) {
            field1123 = -124;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZI)V", line = 70)
    public static final void method526(boolean arg0, int arg1) {
        if (class231.field3724 == null || class231.field3724.length < arg1) {
            class231.field3724 = new int[arg1];
        }
        field1114++;
        if (!arg0) {
            field1112 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)J", line = 90)
    public final long method527(int arg0) {
        if (arg0 < 48) {
            return 115L;
        } else {
            field1113++;
            return Long.MAX_VALUE & this.field4938;
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(BLwf;)V", line = 102)
    public static final void method528(byte arg0, class306 arg1) {
        if (arg0 == -18) {
            field1116++;
            class17.field188 = arg1;
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(Z)I", line = 118)
    public final int method529(boolean arg0) {
        field1110++;
        if (arg0) {
            field1112 = (short[]) null;
        }
        return (int) (this.field2852 >>> 32 & 0xFFL);
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)I", line = 130)
    public final int method530(int arg0) {
        if (arg0 != -8256) {
            this.method533(102);
        }
        field1111++;
        return (int) this.field2852;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)V", line = 143)
    public static final void method531(int arg0, int arg1) {
        field1115++;
        if (arg0 < -30) {
            class75 var2 = class204.method1371(9, 7, arg1);
            var2.method533(22461);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZIIII)V", line = 158)
    public static final void method532(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field1119++;
        int var5 = 0;
        int var6 = arg3;
        int var7 = -1;
        int var8 = class3.method20(class256.field3995, arg1 + arg3, class118.field1834, -27521);
        if (!arg0) {
            field1123 = -5;
        }
        int var9 = -arg3;
        int var10 = class3.method20(class256.field3995, arg1 - arg3, class118.field1834, -27521);
        class253.method1704(var10, var8, arg4, class175.field2675[arg2], 7);
        while (var6 > var5) {
            var7 += 2;
            var9 += var7;
            if (var9 > 0) {
                var6--;
                int var11 = arg2 + var6;
                var9 -= var6 << 1;
                int var12 = arg2 - var6;
                if (class323.field5030 <= var11 && class88.field1324 >= var12) {
                    int var13 = class3.method20(class256.field3995, arg1 + var5, class118.field1834, -27521);
                    int var14 = class3.method20(class256.field3995, arg1 - var5, class118.field1834, -27521);
                    if (class88.field1324 >= var11) {
                        class253.method1704(var14, var13, arg4, class175.field2675[var11], 7);
                    }
                    if (var12 >= class323.field5030) {
                        class253.method1704(var14, var13, arg4, class175.field2675[var12], 7);
                    }
                }
            }
            var5++;
            int var15 = arg2 - var5;
            int var16 = arg2 + var5;
            if (class323.field5030 <= var16 && class88.field1324 >= var15) {
                int var17 = class3.method20(class256.field3995, arg1 + var6, class118.field1834, -27521);
                int var18 = class3.method20(class256.field3995, arg1 - var6, class118.field1834, -27521);
                if (var16 <= class88.field1324) {
                    class253.method1704(var18, var17, arg4, class175.field2675[var16], 7);
                }
                if (class323.field5030 <= var15) {
                    class253.method1704(var18, var17, arg4, class175.field2675[var15], 7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(II)V", line = 233)
    public class75(int arg0, int arg1) {
        this.field2852 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "(I)V", line = 251)
    public final void method533(int arg0) {
        field1121++;
        this.field4938 = class195.method1322(arg0 - 22337) + 500L | this.field4938 & Long.MIN_VALUE;
        class51.field718.method1824(this, (byte) 121);
        if (arg0 != 22461) {
            this.method530(-50);
        }
    }
}
