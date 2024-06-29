import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class110 extends class120 {

    @OriginalMember(owner = "client!ve", name = "Y", descriptor = "I")
    private int field1548 = 0;

    @OriginalMember(owner = "client!ve", name = "U", descriptor = "I")
    private int field1545 = 0;

    @OriginalMember(owner = "client!ve", name = "lb", descriptor = "I")
    private int field1561 = 0;

    @OriginalMember(owner = "client!ve", name = "kb", descriptor = "Lok;")
    public static class41 field1560 = class137.method956("T", 45);

    @OriginalMember(owner = "client!ve", name = "db", descriptor = "I")
    public static volatile int field1553 = 0;

    @OriginalMember(owner = "client!ve", name = "ob", descriptor = "I")
    public static int field1564 = 0;

    @OriginalMember(owner = "client!ve", name = "tb", descriptor = "Lda;")
    public static class212 field1569 = new class212();

    @OriginalMember(owner = "client!ve", name = "ub", descriptor = "Lok;")
    public static class41 field1570 = class137.method956("blinken1:", 45);

    @OriginalMember(owner = "client!ve", name = "T", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!ve", name = "V", descriptor = "I")
    private int field1546;

    @OriginalMember(owner = "client!ve", name = "X", descriptor = "I")
    private int field1547;

    @OriginalMember(owner = "client!ve", name = "Z", descriptor = "I")
    private int field1549;

    @OriginalMember(owner = "client!ve", name = "ab", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!ve", name = "bb", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!ve", name = "cb", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!ve", name = "eb", descriptor = "I")
    private int field1554;

    @OriginalMember(owner = "client!ve", name = "fb", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!ve", name = "ib", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!ve", name = "jb", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!ve", name = "nb", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!ve", name = "pb", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!ve", name = "rb", descriptor = "I")
    private int field1567;

    @OriginalMember(owner = "client!ve", name = "sb", descriptor = "I")
    private int field1568;

    @OriginalMember(owner = "client!ve", name = "mb", descriptor = "Lhk;")
    public static class169 field1562;

    @OriginalMember(owner = "client!ve", name = "gb", descriptor = "Ljava/awt/Font;")
    public static Font field1556;

    @OriginalMember(owner = "client!ve", name = "hb", descriptor = "[I")
    public static int[] field1557;

    @OriginalMember(owner = "client!ve", name = "qb", descriptor = "[Ltb;")
    public static class199[] field1566;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Llb;B)Lae;", line = 22)
    public static final class16 method743(class112 arg0, byte arg1) {
        field1550++;
        if (arg1 != -34) {
            field1570 = (class41) null;
        }
        return new class16(arg0.method771(-66), arg0.method771(-100), arg0.method771(-75), arg0.method771(-120), arg0.method757(11997), arg0.method792(2));
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(IZ)[[I", line = 33)
    public final int[][] method168(int arg0, boolean arg1) {
        if (!arg1) {
            this.method30((class112) null, 10, -37);
        }
        field1558++;
        int[][] var3 = this.field1764.method876(arg1, arg0);
        if (this.field1764.field1836) {
            int[][] var4 = this.method858(0, arg0, 121);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var4[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class307.field5160; var11++) {
                this.method747(var9[var11], var5[var11], var6[var11], -50);
                this.field1567 += this.field1548;
                this.field1549 += this.field1561;
                while (this.field1567 < 0) {
                    this.field1567 += 4096;
                }
                while (this.field1567 > 4096) {
                    this.field1567 -= 4096;
                }
                if (this.field1549 < 0) {
                    this.field1549 = 0;
                }
                this.field1546 += this.field1545;
                if (this.field1546 < 0) {
                    this.field1546 = 0;
                }
                if (this.field1549 > 4096) {
                    this.field1549 = 4096;
                }
                if (this.field1546 > 4096) {
                    this.field1546 = 4096;
                }
                this.method744(this.field1546, this.field1567, -6, this.field1549);
                var7[var11] = this.field1547;
                var10[var11] = this.field1568;
                var8[var11] = this.field1554;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Llb;II)V", line = 115)
    public final void method30(class112 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field1548 = arg0.method771(-125);
        } else if (arg2 == 1) {
            this.field1561 = (arg0.method785((byte) -117) << 12) / 100;
        } else if (arg2 == 2) {
            this.field1545 = (arg0.method785((byte) -91) << 12) / 100;
        }
        if (arg1 != -1) {
            this.method747(-94, 37, 54, -116);
        }
        field1552++;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V", line = 269)
    public class110() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIII)V", line = 163)
    private final void method744(int arg0, int arg1, int arg2, int arg3) {
        field1555++;
        int var5 = arg0 <= 2048 ? (arg3 + 4096) * arg0 >> 12 : arg3 + arg0 - (arg0 * arg3 >> 12);
        if (arg2 != -6) {
            this.method168(106, true);
        }
        if (var5 <= 0) {
            this.field1547 = this.field1568 = this.field1554 = arg0;
            return;
        }
        int var6 = arg1 * 6;
        int var7 = var6 >> 12;
        int var8 = arg0 + arg0 - var5;
        int var9 = (var5 - var8 << 12) / var5;
        int var10 = var6 - (var7 << 12);
        int var12 = var9 * var5 >> 12;
        int var13 = var10 * var12 >> 12;
        int var14 = var8 + var13;
        int var15 = var5 - var13;
        if (var7 == 0) {
            this.field1554 = var8;
            this.field1547 = var5;
            this.field1568 = var14;
        } else if (var7 == 1) {
            this.field1568 = var5;
            this.field1547 = var15;
            this.field1554 = var8;
        } else if (var7 == 2) {
            this.field1554 = var14;
            this.field1547 = var8;
            this.field1568 = var5;
        } else if (var7 == 3) {
            this.field1568 = var15;
            this.field1554 = var5;
            this.field1547 = var8;
        } else if (var7 == 4) {
            this.field1547 = var14;
            this.field1554 = var5;
            this.field1568 = var8;
        } else if (var7 == 5) {
            this.field1554 = var15;
            this.field1568 = var8;
            this.field1547 = var5;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIILjc;ILrk;IIZII)Ljc;", line = 282)
    public static final class287 method745(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class287 arg6, int arg7, class205 arg8, int arg9, int arg10, boolean arg11, int arg12, int arg13) {
        field1563++;
        long var14 = ((long) arg1 << 48) + ((long) arg3 << 32) + (long) ((arg0 << 24) + (arg2 << 16) + arg13);
        class287 var16 = (class287) class70.field1060.method136(var14, true);
        if (var16 == null) {
            byte var17;
            if (arg13 == 1) {
                var17 = 9;
            } else if (arg13 == 2) {
                var17 = 12;
            } else if (arg13 == 3) {
                var17 = 15;
            } else if (arg13 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            class233 var19 = new class233(var17 * var18 + 1, var17 * 2 * var18 + -var17, 0);
            int[] var20 = new int[] { 64, 96, 128 };
            int var21 = var19.method1671(0, 0, 0);
            int[][] var22 = new int[var18][var17];
            for (int var23 = 0; var23 < var18; var23++) {
                int var24 = var20[var23];
                int var25 = var20[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = class31.field450[var27] * var24 + arg7 >> 16;
                    int var29 = arg12 + (class31.field455[var27] * var25) >> 16;
                    var22[var23][var26] = var19.method1671(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var18; var30++) {
                int var31 = (var30 * 256 + 128) / var18;
                int var32 = 256 - var31;
                byte var33 = (byte) (arg0 * var31 + arg2 * var32 >> 8);
                short var34 = (short) (((arg1 & 0x7F) * var31 + (arg3 & 0x7F) * var32 & 0x7F00) + ((arg1 & 0x380) * var31 + (arg3 & 0x380) * var32 & 0x38000) + ((arg1 & 0xFC00) * var31 + (arg3 & 0xFC00) * var32 & 0xFC0000) >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var19.method1669(var21, var22[0][(var35 + 1) % var17], var22[0][var35], (byte) 1, var34, var33);
                    } else {
                        var19.method1669(var22[var30 - 1][var35], var22[var30 - 1][(var35 + 1) % var17], var22[var30][(var35 + 1) % var17], (byte) 1, var34, var33);
                        var19.method1669(var22[var30 - 1][var35], var22[var30][(var35 + 1) % var17], var22[var30][var35], (byte) 1, var34, var33);
                    }
                }
            }
            var16 = var19.method1664(64, 768, -50, -10, -50);
            class70.field1060.method132(var14, var16, -1);
        }
        int var36 = arg13 * 64 - 1;
        int var37 = -var36;
        int var38 = var36;
        int var39 = -var36;
        int var40 = arg6.method119();
        int var41 = arg6.method103();
        int var42 = var36;
        if (arg11) {
            if (arg5 > 1152 && arg5 < 1920) {
                var38 = var36 + 128;
            }
            if (arg5 > 1664 || arg5 < 384) {
                var37 -= 128;
            }
            if (arg5 > 128 && arg5 < 896) {
                var39 -= 128;
            }
            if (arg5 > 640 && arg5 < 1408) {
                var42 = var36 + 128;
            }
        }
        int var43 = arg6.method99();
        if (var40 < var39) {
            var40 = var39;
        }
        class57 var44 = null;
        int var45 = arg6.method93();
        if (var45 > var42) {
            var45 = var42;
        }
        if (var41 > var38) {
            var41 = var38;
        }
        if (arg9 != 768) {
            method749(false);
        }
        if (arg8 != null) {
            int var46 = arg8.field3323[arg4];
            var44 = class271.method1915(var46 >> 16, 0);
            arg4 = var46 & 0xFFFF;
        }
        if (var37 > var43) {
            var43 = var37;
        }
        class287 var47;
        if (var44 == null) {
            var47 = var16.method113(true, true);
            var47.method112((var41 - var40) / 2, 128, (var45 - var43) / 2);
            var47.method105((var40 + var41) / 2, 0, (var43 + var45) / 2);
        } else {
            var47 = var16.method113(!var44.method396(arg4, -91), true);
            var47.method112((var41 - var40) / 2, 128, (var45 - var43) / 2);
            var47.method105((var40 + var41) / 2, 0, (var43 + var45) / 2);
            var47.method98(var44, arg4);
        }
        if (arg5 != 0) {
            var47.method109(arg5);
        }
        if (class166.field2625) {
            class183 var50 = (class183) var47;
            if (class140.method983((byte) 118, class55.field807, arg7 + var40, arg12 + var43) != arg10 || arg10 != class140.method983((byte) 127, class55.field807, arg7 + var41, arg12 + var45)) {
                for (int var51 = 0; var51 < var50.field2954; var51++) {
                    var50.field2955[var51] += class140.method983((byte) -126, class55.field807, var50.field2966[var51] + arg7, var50.field2951[var51] - -arg12) - arg10;
                }
                var50.field2976.field898 = false;
                var50.field2964.field3778 = false;
            }
        } else {
            class19 var48 = (class19) var47;
            if (class140.method983((byte) -127, class55.field807, arg7 + var40, arg12 + var43) != arg10 || arg10 != class140.method983((byte) -115, class55.field807, arg7 + var41, arg12 - -var45)) {
                for (int var49 = 0; var49 < var48.field252; var49++) {
                    var48.field260[var49] += class140.method983((byte) -108, class55.field807, var48.field242[var49] + arg7, var48.field254[var49] + arg12) - arg10;
                }
                var48.field248 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(II)I", line = 512)
    public static final int method746(int arg0, int arg1) {
        field1559++;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        if (arg1 != -705295902) {
            method746(-19, -123);
        }
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(IIII)V", line = 538)
    private final void method747(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 89 % ((-arg3 - 9) / 33);
        int var6 = arg1 >= arg2 ? arg1 : arg2;
        field1544++;
        int var7 = var6 < arg0 ? arg0 : var6;
        int var8 = arg1 <= arg2 ? arg1 : arg2;
        int var9 = var8 <= arg0 ? var8 : arg0;
        this.field1546 = (var7 + var9) / 2;
        int var10 = var7 - var9;
        if (this.field1546 > 0 && this.field1546 < 4096) {
            this.field1549 = (var10 << 12) / (this.field1546 <= 2048 ? this.field1546 * 2 : 8192 - (this.field1546 * 2));
        } else {
            this.field1549 = 0;
        }
        if (var10 <= 0) {
            this.field1567 = 0;
            return;
        }
        int var11 = (var7 - arg1 << 12) / var10;
        int var12 = (var7 - arg0 << 12) / var10;
        int var13 = (var7 - arg2 << 12) / var10;
        if (arg2 == var7) {
            this.field1567 = arg1 == var9 ? var12 + 20480 : -var11 + 4096;
        } else if (arg1 == var7) {
            this.field1567 = arg0 == var9 ? var13 + 4096 : -var12 + 12288;
        } else {
            this.field1567 = arg2 == var9 ? var11 + 12288 : 20480 - var13;
        }
        this.field1567 /= 6;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BJ)V", line = 589)
    public static final void method748(byte arg0, long arg1) {
        field1551++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class118.field1741; var3++) {
            if (class65.field1001[var3] == arg1) {
                class118.field1741--;
                for (int var4 = var3; var4 < class118.field1741; var4++) {
                    class78.field1147[var4] = class78.field1147[var4 + 1];
                    class159.field2496[var4] = class159.field2496[var4 + 1];
                    class278.field4547[var4] = class278.field4547[var4 + 1];
                    class65.field1001[var4] = class65.field1001[var4 + 1];
                    class109.field1521[var4] = class109.field1521[var4 + 1];
                    class238.field3813[var4] = class238.field3813[var4 + 1];
                }
                class217.field3484++;
                class275.field4508 = class33.field493;
                class285.field4642.method844(-4, 40);
                class285.field4642.method800(arg1, (byte) -113);
                break;
            }
        }
        int var5 = 49 / ((-arg0 - 68) / 33);
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(Z)V", line = 637)
    public static void method749(boolean arg0) {
        field1570 = null;
        field1569 = null;
        field1557 = null;
        field1566 = null;
        field1556 = null;
        field1560 = null;
        field1562 = null;
        if (!arg0) {
            method746(-22, 36);
        }
    }
}
