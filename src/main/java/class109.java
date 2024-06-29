import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class109 {

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "Lvg;")
    private class8 field1609 = new class8();

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "Lbl;")
    private class191 field1626 = new class191();

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    private int field1621;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    private int field1627;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "Lcd;")
    private class69 field1623;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1612 = "Loaded input handler";

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1613 = "level: ";

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V", line = 11)
    public final void method747(byte arg0) {
        this.field1626.method1418(0);
        if (arg0 != -8) {
            method748(117, 57);
        }
        this.field1623.method453((byte) 100);
        field1618++;
        this.field1609 = new class8();
        this.field1621 = this.field1627;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)V", line = 25)
    public static final void method748(int arg0, int arg1) {
        if (arg1 == -129) {
            field1617++;
            class110.field1637.method708(arg0, true);
            class157.field2529.method708(arg0, true);
            class193.field3141.method708(arg0, true);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZ)I", line = 38)
    public static final int method749(int arg0, boolean arg1) {
        field1624++;
        if (!arg1) {
            method756((byte) 50, 74);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lvg;JI)V", line = 50)
    public final void method750(class8 arg0, long arg1, int arg2) {
        field1614++;
        if (this.field1621 == 0) {
            class8 var5 = this.field1626.method1413(arg2 + 18339);
            var5.method1212((byte) 121);
            var5.method42((byte) -116);
            if (this.field1609 == var5) {
                class8 var6 = this.field1626.method1413(0);
                var6.method1212((byte) 114);
                var6.method42((byte) -120);
            }
        } else {
            this.field1621--;
        }
        if (arg2 == -18339) {
            this.field1623.method461(arg2 ^ 0xFFFFB814, arg1, arg0);
            this.field1626.method1412(arg0, (byte) -2);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 91)
    public static final void method751(int arg0) {
        class229.method1626();
        class5.field79 = -1;
        field1610++;
        class327.field5064 = null;
        class115.method795((byte) -92);
        class328.field5067.method747((byte) -8);
        class97.field1381 = new class67();
        ((class130) class170.field2814).method939(-123);
        class266.method1892();
        class118.field1784 = new class48[255];
        class118.field1793 = 0;
        class163.method1172();
        class241.method1737();
        class197.method1451((byte) 77);
        class115.method793(false, (byte) -34);
        class243.method1748((byte) -123);
        class222.method1582((byte) 92);
        for (int var1 = 0; var1 < 2048; var1++) {
            class334 var2 = class74.field1049[var1];
            if (var2 != null) {
                var2.field4189 = null;
            }
        }
        if (class232.field3690) {
            class241.method1740(104, 104);
            class127.method924(class79.field1111, (byte) 71);
            class294.method2102();
        }
        class74.method493(class76.field1061, 0, class130.field2034);
        class141.method1043(class130.field2034, -27431);
        class14.field161 = null;
        class60.field847 = null;
        class14.field162 = null;
        class26.field361 = null;
        class307.field4788 = null;
        if (arg0 != 12508) {
            field1625 = -29;
        }
        if (class5.field75 == 5) {
            class222.method1580(false, class130.field2034);
        }
        if (class5.field75 == 10) {
            class301.method2145((byte) 68, false);
        }
        if (class5.field75 == 30) {
            class278.method2012(25, -74);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V", line = 157)
    public static void method752(boolean arg0) {
        if (arg0) {
            field1612 = null;
            field1613 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "([III[[ILfn;I[[F[[FLhm;I[[F)V", line = 171)
    public static final void method753(int[] arg0, int arg1, int arg2, int[][] arg3, class19 arg4, int arg5, float[][] arg6, float[][] arg7, class48 arg8, int arg9, float[][] arg10) {
        int var11 = -39 % ((54 - arg5) / 38);
        int[] var12 = new int[arg0.length / 2];
        field1615++;
        for (int var13 = 0; var13 < var12.length; var13++) {
            int var14 = arg0[var13 + var13];
            int var15 = arg0[var13 + var13 + 1];
            if (arg9 == 1) {
                int var17 = var14;
                var14 = var15;
                var15 = 128 - var17;
            } else if (arg9 == 2) {
                var14 = 128 - var14;
                var15 = 128 - var15;
            } else if (arg9 == 3) {
                int var16 = var14;
                var14 = 128 - var15;
                var15 = var16;
            }
            float var18;
            float var19;
            float var20;
            if (var14 == 0 && var15 == 0) {
                var18 = arg10[arg2][arg1];
                var19 = arg7[arg2][arg1];
                var20 = arg6[arg2][arg1];
            } else if (var14 == 128 && var15 == 0) {
                var19 = arg7[arg2 + 1][arg1];
                var20 = arg6[arg2 + 1][arg1];
                var18 = arg10[arg2 + 1][arg1];
            } else if (var14 == 128 && var15 == 128) {
                var20 = arg6[arg2 + 1][arg1 + 1];
                var19 = arg7[arg2 + 1][arg1 + 1];
                var18 = arg10[arg2 + 1][arg1 + 1];
            } else if (var14 == 0 && var15 == 128) {
                var20 = arg6[arg2][arg1 + 1];
                var19 = arg7[arg2][arg1 + 1];
                var18 = arg10[arg2][arg1 + 1];
            } else {
                float var21 = arg7[arg2][arg1];
                float var22 = arg10[arg2][arg1];
                float var23 = arg6[arg2][arg1];
                float var24 = (float) var14 / 128.0F;
                float var25 = (float) var15 / 128.0F;
                float var26 = (arg10[arg2 + 1][arg1] - var22) * var24 + var22;
                float var27 = (arg6[arg2 + 1][arg1] - var23) * var24 + var23;
                float var28 = (arg7[arg2 + 1][arg1] - var21) * var24 + var21;
                float var29 = arg10[arg2][arg1 + 1];
                float var30 = (arg10[arg2 + 1][arg1 + 1] - var29) * var24 + var29;
                float var31 = arg6[arg2][arg1 + 1];
                float var32 = (arg6[arg2 + 1][arg1 + 1] - var31) * var24 + var31;
                var18 = (var30 - var26) * var25 + var26;
                var20 = (var32 - var27) * var25 + var27;
                float var33 = arg7[arg2][arg1 + 1];
                float var34 = (arg7[arg2 + 1][arg1 + 1] - var33) * var24 + var33;
                var19 = (var34 - var28) * var25 + var28;
            }
            int var35 = (arg2 << 7) + var14;
            int var36 = class156.method1115((byte) -84, var14, arg2, arg1, var15, arg3);
            int var37 = (arg1 << 7) + var15;
            var12[var13] = arg4.method102(arg8, var35, var36, var37, var20, var18, var19);
        }
        arg4.method104(var12);
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)Ltf;", line = 285)
    public final class165 method754(byte arg0) {
        field1619++;
        if (arg0 != -21) {
            this.method754((byte) 75);
        }
        return this.field1623.method455((byte) 63);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(JZ)Lvg;", line = 296)
    public final class8 method755(long arg0, boolean arg1) {
        field1620++;
        if (arg1) {
            return (class8) null;
        }
        class8 var4 = (class8) this.field1623.method451(arg0, (byte) 100);
        if (var4 != null) {
            this.field1626.method1412(var4, (byte) -2);
        }
        return var4;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(I)V", line = 399)
    public class109(int arg0) {
        this.field1621 = arg0;
        int var2 = 1;
        this.field1627 = arg0;
        while (arg0 > (var2 + var2)) {
            var2 += var2;
        }
        this.field1623 = new class69(var2);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)V", line = 335)
    public static final void method756(byte arg0, int arg1) {
        field1611++;
        class344 var2 = class110.method759(5, arg1, false);
        int var3 = -21 % ((arg0 - 44) / 43);
        var2.method2384(-27354);
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(B)Ltf;", line = 347)
    public final class165 method757(byte arg0) {
        field1616++;
        int var2 = 100 / ((-arg0 - 48) / 56);
        return this.field1623.method458((byte) -16);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZLog;I)V", line = 373)
    public static final void method758(boolean arg0, class157 arg1, int arg2) {
        field1622++;
        int var3 = arg1.field2597 == 0 ? arg1.field2468 : arg1.field2597;
        int var4 = arg1.field2528 == 0 ? arg1.field2520 : arg1.field2528;
        class168.method1224(var3, var4, arg0, arg1.field2486, class221.field3547[arg1.field2486 >> 16], (byte) 14);
        if (arg2 <= 6) {
            method753((int[]) null, 75, 90, (int[][]) ((int[][]) null), (class19) null, 39, (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), (class48) null, -5, (float[][]) ((float[][]) null));
        }
        if (arg1.field2472 != null) {
            class168.method1224(var3, var4, arg0, arg1.field2486, arg1.field2472, (byte) 14);
        }
        class90 var5 = (class90) class243.field3842.method451((long) arg1.field2486, (byte) 100);
        if (var5 != null) {
            class335.method2338(var4, -109, arg0, var5.field1249, var3);
        }
    }
}
