import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class177 extends class74 {

    @OriginalMember(owner = "client!wg", name = "V", descriptor = "I")
    private int field2659 = 4096;

    @OriginalMember(owner = "client!wg", name = "P", descriptor = "I")
    public static int field2653 = 0;

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "I")
    public static int field2656 = 0;

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!wg", name = "O", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!wg", name = "Q", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!wg", name = "R", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!wg", name = "W", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!wg", name = "X", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!wg", name = "U", descriptor = "Luf;")
    public static class176 field2658;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(II)V")
    public static final void method1180(int arg0, int arg1) {
        --class220.field3450;
        ++field2660;
        if (class220.field3450 != arg0) {
            class236.method1583(class231.field3597, arg0 - -1, class231.field3597, arg0, -arg0 + class220.field3450);
            class236.method1583(class63.field1008, arg0 - -1, class63.field1008, arg0, -arg0 + class220.field3450);
            if (arg1 <= -52) {
                class236.method1585(class42.field686, arg0 + 1, class42.field686, arg0, -arg0 + class220.field3450);
                class236.method1589(class80.field1341, arg0 - -1, class80.field1341, arg0, -arg0 + class220.field3450);
                class236.method1584(class13.field222, arg0 + 1, class13.field222, arg0, class220.field3450 - arg0);
                class236.method1585(class211.field3279, arg0 - -1, class211.field3279, arg0, -arg0 + class220.field3450);
                class236.method1585(class290.field4570, arg0 + 1, class290.field4570, arg0, class220.field3450 - arg0);
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(II)V")
    public static final void method1181(int arg0, int arg1) {
        class26.field399.method1778(arg1, arg0 ^ -61);
        ++field2657;
        if (arg0 != 0) {
            field2651 = -103;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class100 var7 = new class100();
        var7.field1596 = arg1 / 128;
        var7.field1604 = arg2 / 128;
        var7.field1591 = arg3 / 128;
        var7.field1590 = arg4 / 128;
        var7.field1613 = arg0;
        var7.field1600 = arg1;
        var7.field1601 = arg2;
        var7.field1598 = arg3;
        var7.field1595 = arg4;
        var7.field1597 = arg5;
        var7.field1594 = arg6;
        class61.field990[class173.field2576++] = var7;
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)V")
    public static void method1183(int arg0) {
        field2658 = null;
        if (arg0 != -30105) {
            method1185((byte) 89, 53, 24, (String[]) null);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        int[] var3 = super.field1254.method1328((byte) -108, arg1);
        if (arg0 != 4) {
            this.method448(-112, 124);
        }
        if (super.field1254.field3118) {
            int[] var4 = this.method590(0, 0, arg1 + -1 & class218.field3419);
            int[] var5 = this.method590(0, 0, arg1);
            int[] var6 = this.method590(0, 0, arg1 + 1 & class218.field3419);
            for (int var7 = 0; class178.field2662 > var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field2659;
                int var9 = (var5[var7 - -1 & class129.field2012] + -var5[class129.field2012 & var7 - 1]) * this.field2659;
                int var10 = var8 >> 12;
                int var11 = var10 * var10 >> 12;
                int var12 = var9 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var11 + var13 - -4096) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        ++field2655;
        return var3;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(IIIIIII)V")
    public static final void method1184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 69) {
            method1185((byte) -124, -91, -75, (String[]) null);
        }
        ++field2661;
        class188 var7 = class32.method261(arg4, arg0, 117);
        if (var7 != null && var7.field2834 != null) {
            class39 var8 = new class39();
            var8.field657 = var7;
            var8.field647 = var7.field2834;
            class243.method1648((byte) 123, var8);
        }
        class71.field1135 = arg5;
        class217.field3369 = arg0;
        class179.field2678 = true;
        class87.field1421 = arg3;
        class10.field197 = arg4;
        class119.field1835 = arg1;
        class258.field3951 = arg6;
        class246.method1663(255, var7);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BII[Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1185(byte arg0, int arg1, int arg2, String[] arg3) {
        ++field2652;
        if (~arg1 == -1) {
            return "";
        } else if (arg1 == 1) {
            String var4 = arg3[arg2];
            return var4 != null ? var4.toString() : "null";
        } else {
            int var5 = arg1 + arg2;
            int var6 = 81 % ((arg0 - -16) / 36);
            int var7 = 0;
            for (int var8 = arg2; var8 < var5; ++var8) {
                String var12 = arg3[var8];
                if (var12 == null) {
                    var7 += 4;
                } else {
                    var7 += var12.length();
                }
            }
            StringBuffer var9 = new StringBuffer(var7);
            for (int var10 = arg2; var10 < var5; ++var10) {
                String var11 = arg3[var10];
                if (var11 == null) {
                    var9.append("null");
                } else {
                    var9.append(var11);
                }
            }
            return var9.toString();
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIBI)V")
    public static final void method1186(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (~class122.field1874 > -101) {
            class31.method248((byte) -106);
        }
        ++field2650;
        class201.method1351(arg0, arg1, arg0 + arg2, arg1 + arg4);
        if (~class122.field1874 > -101) {
            int var5 = arg2 / 2 + arg0;
            byte var6 = 20;
            int var7 = arg4 / 2 + arg1 + -var6 + -18;
            class201.method1333(arg0, arg1, arg2, arg4, 0);
            class201.method1340(var5 + -152, var7, 304, 34, 9179409);
            class201.method1340(var5 + -151, var7 + 1, 302, 32, 0);
            class201.method1333(var5 + -150, var7 - -2, class122.field1874 * 3, 30, 9179409);
            class201.method1333(var5 - (-(class122.field1874 * 3) + 150), var7 + 2, 300 - class122.field1874 * 3, 30, 0);
            class123.field1925.method12(class220.field3452, var5, var6 + var7, 16777215, -1);
        } else {
            class263.field4111 = (int) ((float) (arg4 * 2) / class134.field2075);
            class103.field1637 = -((int) ((float) arg2 / class134.field2075)) + class140.field2155;
            int var8 = -((int) ((float) arg2 / class134.field2075)) + class140.field2155;
            int var9 = -((int) ((float) arg4 / class134.field2075)) + class250.field3848;
            class77.field1305 = -((int) ((float) arg4 / class134.field2075)) + class250.field3848;
            int var10 = class140.field2155 - -((int) ((float) arg2 / class134.field2075));
            class69.field1098 = (int) ((float) (arg2 * 2) / class134.field2075);
            int var11 = (int) ((float) arg4 / class134.field2075) + class250.field3848;
            class68.method531(var10, arg1 + arg4, var11, (byte) -52, arg0 - -arg2, var8, arg0, arg1, var9);
            class234.method1561(var9, var11, arg0, class249.field3844, var10, (byte) 88, var8, arg0 - -arg2, arg1 - -arg4, arg1);
            if (arg3 != 34) {
                field2658 = null;
            }
            class123.method884(arg1 - -arg4, var11, var10, var8, 0, arg1, var9, arg0 - -arg2, arg0);
            if (~class217.field3414 < -1) {
                --class242.field3748;
                if (~class242.field3748 == -1) {
                    class242.field3748 = 20;
                    --class217.field3414;
                }
            }
            if (class186.field2799) {
                int var12 = arg0 - 5 + arg2;
                int var13 = arg4 + -8 + arg1;
                class124.field1953.method9("Fps:" + class175.field2607, var12, var13, 16776960, -1);
                int var17 = var13 - 15;
                Runtime var14 = Runtime.getRuntime();
                int var15 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
                int var16 = 16776960;
                if (var15 > 65536) {
                    var16 = 16711680;
                }
                class124.field1953.method9("Mem:" + var15 + "k", var12, var17, var16, -1);
                var13 = var17 - 15;
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        ++field2654;
        if (arg0 != -79) {
            method1180(95, 40);
        }
        if (~arg2 == -1) {
            this.field2659 = arg1.method293(-116);
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
    public class177() {
        super(1, true);
    }
}
