import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class110 extends class47 {

    @OriginalMember(owner = "client!pm", name = "y", descriptor = "I")
    private int field1542 = -32768;

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "I")
    private int field1535 = 0;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "Ltb;")
    private class234 field1528 = null;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "Z")
    private boolean field1534 = true;

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "I")
    private int field1537 = 0;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "Z")
    private boolean field1533 = false;

    @OriginalMember(owner = "client!pm", name = "N", descriptor = "I")
    private int field1557 = -1;

    @OriginalMember(owner = "client!pm", name = "I", descriptor = "I")
    private int field1552 = -1;

    @OriginalMember(owner = "client!pm", name = "M", descriptor = "I")
    private int field1556 = 0;

    @OriginalMember(owner = "client!pm", name = "G", descriptor = "I")
    private int field1550;

    @OriginalMember(owner = "client!pm", name = "O", descriptor = "I")
    private int field1558;

    @OriginalMember(owner = "client!pm", name = "T", descriptor = "I")
    private int field1563;

    @OriginalMember(owner = "client!pm", name = "D", descriptor = "I")
    private int field1547;

    @OriginalMember(owner = "client!pm", name = "x", descriptor = "I")
    private int field1541;

    @OriginalMember(owner = "client!pm", name = "U", descriptor = "I")
    private int field1564;

    @OriginalMember(owner = "client!pm", name = "C", descriptor = "Lqm;")
    private class247 field1546;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
    private int field1530;

    @OriginalMember(owner = "client!pm", name = "A", descriptor = "I")
    private int field1544;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    private int field1527;

    @OriginalMember(owner = "client!pm", name = "F", descriptor = "I")
    private int field1549;

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "I")
    public static int field1538 = 0;

    @OriginalMember(owner = "client!pm", name = "w", descriptor = "Lcc;")
    public static class263 field1540 = null;

    @OriginalMember(owner = "client!pm", name = "R", descriptor = "Lnc;")
    public static class154 field1561 = null;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!pm", name = "E", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!pm", name = "H", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!pm", name = "J", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!pm", name = "K", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!pm", name = "L", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!pm", name = "P", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!pm", name = "S", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!pm", name = "Q", descriptor = "Llc;")
    public static class175 field1560;

    @OriginalMember(owner = "client!pm", name = "z", descriptor = "Lid;")
    private class274 field1543;

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "Lod;")
    public static class28 field1536;

    @OriginalMember(owner = "client!pm", name = "B", descriptor = "[[B")
    public static byte[][] field1545;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(III)V", line = 11)
    public static final void method752(int arg0, int arg1, int arg2) {
        if (class118.field1671 == 2) {
            class30.field380 = arg2;
            class323.field4975 = arg1;
        }
        field1562++;
        class184.field2664 = (float) arg2;
        if (arg0 == 6751) {
            class280.field4344 = (float) arg1;
            class38.method226(true);
            class90.field1125 = true;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILfc;III)V", line = 42)
    public static final void method753(int arg0, class238 arg1, int arg2, int arg3, int arg4) {
        field1554++;
        for (class298 var5 = (class298) class68.field895.method2331((byte) 73); var5 != null; var5 = (class298) class68.field895.method2332(-55)) {
            if (var5.field4641 == arg4 && arg0 * 128 == var5.field4639 && (arg2 * 128) == var5.field4635 && var5.field4633.field3548 == arg1.field3548) {
                if (var5.field4650 != null) {
                    class19.field255.method27(var5.field4650);
                    var5.field4650 = null;
                }
                if (var5.field4638 != null) {
                    class19.field255.method27(var5.field4638);
                    var5.field4638 = null;
                }
                var5.method2285(true);
                return;
            }
        }
        if (arg3 != -11204) {
            field1545 = (byte[][]) ((byte[][]) null);
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(IIIIIIIZLen;)V", line = 498)
    public class110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class47 arg8) {
        this.field1550 = arg0;
        this.field1558 = arg5;
        this.field1563 = arg2;
        this.field1547 = arg1;
        this.field1541 = arg4;
        this.field1564 = arg3;
        if (class250.field3787 && arg8 != null) {
            if (arg8 instanceof class110) {
                ((class110) arg8).method756(-20915);
            } else {
                class238 var10 = class142.method951(this.field1550, 26915);
                if (var10.field3525 != null) {
                    var10 = var10.method1706(true);
                }
                if (var10 != null) {
                    class50.method304(this.field1558, this.field1563, this.field1547, this.field1541, 0, 0, 2, this.field1564, var10);
                }
            }
        }
        if (arg6 != -1) {
            this.field1546 = class185.method1289(arg6, (byte) 116);
            this.field1530 = 0;
            if (this.field1546.field3734.length > 1) {
                this.field1544 = 1;
            } else {
                this.field1544 = 0;
            }
            this.field1527 = class38.field463 - 1;
            this.field1549 = 1;
            if (this.field1546.field3729 == 0 && arg8 != null && arg8 instanceof class110) {
                class110 var11 = (class110) arg8;
                if (this.field1546 == var11.field1546) {
                    this.field1544 = var11.field1544;
                    this.field1530 = var11.field1530;
                    this.field1527 = var11.field1527;
                    this.field1549 = var11.field1549;
                    return;
                }
            }
            if (arg7 && this.field1546.field3753 != -1) {
                this.field1530 = (int) ((double) this.field1546.field3734.length * Math.random());
                this.field1544 = this.field1530 + 1;
                if (this.field1544 >= this.field1546.field3734.length) {
                    this.field1544 -= this.field1546.field3753;
                    if (this.field1544 < 0 || this.field1544 >= this.field1546.field3734.length) {
                        this.field1544 = -1;
                    }
                }
                this.field1549 = (int) ((double) this.field1546.field3746[this.field1530] * Math.random()) + 1;
                this.field1527 = class38.field463 - this.field1549;
            }
        }
        if (class250.field3787 && arg8 != null) {
            this.method755(true, 0);
        }
        if (arg8 == null) {
            class238 var12 = class142.method951(this.field1550, 26915);
            if (var12.field3525 != null) {
                this.field1533 = true;
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)Len;", line = 106)
    public final class47 method754(byte arg0) {
        field1548++;
        return arg0 >= -103 ? (class47) null : this.method755(false, 0);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIII)V", line = 120)
    public final void method12(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class250.field3787) {
            this.method755(true, 0);
        } else {
            this.method757(arg4, arg3, -1);
        }
        field1555++;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIIIIJILid;)V", line = 143)
    public final void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class274 arg10) {
        field1531++;
        class47 var13 = this.method754((byte) -125);
        if (var13 != null) {
            var13.method8(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1543);
        }
    }

    @OriginalMember(owner = "client!pm", name = "finalize", descriptor = "()V", line = 164)
    protected final void finalize() {
        field1559++;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZI)Len;", line = 172)
    private final class47 method755(boolean arg0, int arg1) {
        boolean var3 = class74.field957 != class167.field2324;
        field1532++;
        class238 var4 = class142.method951(this.field1550, arg1 ^ 0x6923);
        int var5 = var4.field3503;
        if (var4.field3525 != null) {
            var4 = var4.method1706(true);
        }
        if (var4 == null) {
            if (class250.field3787 && !var3) {
                this.method756(-20915);
            }
            return null;
        }
        if (class249.field3769 != 0 && this.field1533 && (this.field1546 == null || this.field1546 != null && this.field1546.field3739 != var4.field3503)) {
            int var6 = var4.field3503;
            if (var4.field3503 == -1) {
                var6 = var5;
            }
            if (var6 == -1) {
                this.field1546 = null;
            } else {
                this.field1546 = class185.method1289(var6, (byte) 119);
            }
            if (this.field1546 != null) {
                if (var4.field3563 && this.field1546.field3753 != -1) {
                    this.field1530 = (int) ((double) this.field1546.field3734.length * Math.random());
                    this.field1527 -= (int) ((double) this.field1546.field3746[this.field1530] * Math.random());
                } else {
                    this.field1530 = 0;
                    this.field1527 = class38.field463 - 1;
                }
            }
        }
        int var7 = this.field1563 & 0x3;
        int var8;
        int var9;
        if (var7 == 1 || var7 == 3) {
            var9 = var4.field3489;
            var8 = var4.field3532;
        } else {
            var8 = var4.field3489;
            var9 = var4.field3532;
        }
        int var10 = (var8 >> 1) + this.field1541;
        int var11 = (var8 + 1 >> 1) + this.field1541;
        int var12 = (var9 >> 1) + this.field1558;
        int var13 = (var9 + 1 >> 1) + this.field1558;
        this.method757(var12 * 128, var10 * 128, -1);
        boolean var14 = !var3 && var4.field3560 && (this.field1557 != var4.field3548 || (this.field1552 != this.field1530 || this.field1546 != null && (this.field1546.field3757 || class37.field445) && this.field1544 != this.field1530) && class345.field5352 >= 2);
        if (arg0 && !var14) {
            return null;
        }
        int[][] var15 = class167.field2324[this.field1564];
        int var16 = var15[var10][var13] + var15[var11][var12] + var15[var10][var12] + var15[var11][var13] >> 2;
        int[][] var17 = (int[][]) null;
        int var18 = (this.field1558 << 7) + (var9 << 6);
        int var19 = (this.field1541 << 7) + (var8 << 6);
        if (arg1 != 0) {
            this.field1533 = true;
        }
        if (var3) {
            var17 = class74.field957[0];
        } else if (this.field1564 < 3) {
            var17 = class167.field2324[this.field1564 + 1];
        }
        if (class250.field3787 && var14) {
            class178.method1228(this.field1528, this.field1537, this.field1535, this.field1556);
        }
        boolean var20 = this.field1528 == null;
        class42 var21;
        if (this.field1546 == null) {
            var21 = var4.method1701(var17, this.field1547, (byte) -106, var15, this.field1563, false, var14, var20 ? class31.field389 : this.field1528, var16, var18, var19);
        } else {
            var21 = var4.method1695(this.field1547, this.field1544, var15, this.field1549, this.field1530, var16, var17, var14, this.field1563, var19, (byte) 90, var20 ? class31.field389 : this.field1528, var18, this.field1546);
        }
        if (var21 == null) {
            return null;
        }
        if (class250.field3787 && var14) {
            if (var20) {
                class31.field389 = var21.field497;
            }
            int var22 = 0;
            if (this.field1564 != 0) {
                int[][] var23 = class167.field2324[0];
                var22 = var16 - (var23[var10][var13] + var23[var11][var13] + var23[var10][var12] + var23[var11][var12] >> 2);
            }
            class234 var24 = var21.field497;
            if (this.field1534 && class178.method1233(var24, var19, var22, var18)) {
                this.field1534 = false;
            }
            if (!this.field1534) {
                class178.method1219(var24, var19, var22, var18);
                if (var20) {
                    class31.field389 = null;
                }
                this.field1537 = var19;
                this.field1528 = var24;
                this.field1535 = var22;
                this.field1556 = var18;
            }
            this.field1552 = this.field1530;
            this.field1557 = var4.field3548;
        }
        return var21.field496;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 337)
    public final void method756(int arg0) {
        if (this.field1528 != null) {
            class178.method1228(this.field1528, this.field1537, this.field1535, this.field1556);
        }
        field1553++;
        this.field1528 = null;
        this.field1552 = -1;
        this.field1557 = -1;
        if (arg0 != -20915) {
            this.field1564 = 101;
        }
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(III)V", line = 364)
    private final void method757(int arg0, int arg1, int arg2) {
        if (this.field1546 != null) {
            int var4 = class38.field463 - this.field1527;
            if (var4 > 100 && this.field1546.field3753 > 0) {
                int var5 = this.field1546.field3734.length - this.field1546.field3753;
                while (this.field1530 < var5 && var4 > this.field1546.field3746[this.field1530]) {
                    var4 -= this.field1546.field3746[this.field1530];
                    this.field1530++;
                }
                if (var5 <= this.field1530) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field1546.field3734.length; var7++) {
                        var6 += this.field1546.field3746[var7];
                    }
                    var4 %= var6;
                }
                this.field1544 = this.field1530 + 1;
                if (this.field1544 >= this.field1546.field3734.length) {
                    this.field1544 -= this.field1546.field3753;
                    if (this.field1544 < 0 || this.field1544 >= this.field1546.field3734.length) {
                        this.field1544 = -1;
                    }
                }
            }
            while (this.field1546.field3746[this.field1530] < var4) {
                class337.method2329(false, this.field1546, (byte) -97, arg1, arg0, this.field1530);
                var4 -= this.field1546.field3746[this.field1530];
                this.field1530++;
                if (this.field1546.field3734.length <= this.field1530) {
                    this.field1530 -= this.field1546.field3753;
                    if (this.field1530 < 0 || this.field1530 >= this.field1546.field3734.length) {
                        this.field1546 = null;
                        break;
                    }
                }
                this.field1544 = this.field1530 + 1;
                if (this.field1546.field3734.length <= this.field1544) {
                    this.field1544 -= this.field1546.field3753;
                    if (this.field1544 < 0 || this.field1544 >= this.field1546.field3734.length) {
                        this.field1544 = -1;
                    }
                }
            }
            this.field1549 = var4;
            this.field1527 = class38.field463 - var4;
        }
        field1539++;
        if (arg2 != -1) {
            method758((byte) -67);
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "()I", line = 452)
    public final int method11() {
        field1551++;
        return this.field1542;
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(B)V", line = 462)
    public static void method758(byte arg0) {
        field1536 = null;
        field1540 = null;
        field1545 = (byte[][]) null;
        field1560 = null;
        if (arg0 >= -17) {
            method758((byte) -71);
        }
    }
}
