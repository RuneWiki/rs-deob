import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class105 extends class3 implements class453 {

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    private int field1535;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "[Lfk;")
    public static class462[] field1539;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "Lcu;")
    public static class145 field1549;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "[C")
    public static char[] field1551;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
    public static final void method729(int arg0) {
        if (arg0 != 50) {
            field1551 = null;
        }
        ++field1544;
        if (class299.field3959) {
            while (true) {
                while (~class391.field5303.length < ~class420.field5752) {
                    class386 var1 = class391.field5303[class420.field5752];
                    if (var1 != null && var1.field5253 == -1) {
                        if (class224.field3018 == null) {
                            class224.field3018 = class321.field4199.method664((byte) -53, var1.field5248);
                        }
                        int var2 = class224.field3018.field379;
                        if (var2 == -1) {
                            return;
                        }
                        ++class420.field5752;
                        var1.field5253 = var2;
                        class224.field3018 = null;
                    } else {
                        ++class420.field5752;
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B[BII)V")
    public final void method730(byte arg0, byte[] arg1, int arg2, int arg3) {
        this.method21(arg1, arg3);
        ++field1542;
        this.field1535 = arg2;
        if (arg0 <= 28) {
            this.field1535 = 100;
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V")
    public static void method731(byte arg0) {
        field1549 = null;
        field1539 = null;
        field1551 = null;
        if (arg0 < 106) {
            field1539 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)J")
    public final long method732(int arg0) {
        if (arg0 != -7561) {
            return -30L;
        } else {
            ++field1537;
            return super.field108.method2520();
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)V")
    public static final void method733(byte arg0) {
        class455.field6216 = class422.method2431(2048, 8, 8, true, 0.4F, true, 4, 35);
        ++field1540;
        if (arg0 < 76) {
            method731((byte) -9);
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)I")
    public final int method734(int arg0) {
        ++field1545;
        return arg0 < 69 ? 0 : 0;
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)Lms;")
    public static final class530 method735(int arg0) {
        int var1 = -49 % ((arg0 - -70) / 53);
        ++field1550;
        try {
            return (class530) Class.forName("km").newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)I")
    public final int method736(byte arg0) {
        ++field1541;
        if (arg0 != -19) {
            field1536 = 115;
        }
        return this.field1535;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lbo;I[BI)V")
    public class105(class511 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field1535 = arg1;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method737(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        ++field1538;
        if (arg4 != 110) {
            field1551 = null;
        }
        int var8 = 0;
        int var9 = arg3;
        int var10 = 0;
        int var11 = -arg6 + arg7;
        int var12 = -arg6 + arg3;
        int var13 = arg7 * arg7;
        int var14 = arg3 * arg3;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg3 << 1;
        int var22 = var12 << 1;
        int var23 = (-var21 + 1) * var13 + var17;
        int var24 = -((var21 - 1) * var18) + var14;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - (var22 + -1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 + -3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg3 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 + -1) * var29;
        int[] var39 = class457.field6299[arg5];
        class427.method2465(var39, arg1 - var11, -arg7 + arg1, -7, arg2);
        class427.method2465(var39, arg1 + var11, -var11 + arg1, arg4 + -117, arg0);
        class427.method2465(var39, arg1 + arg7, arg1 - -var11, -7, arg2);
        while (~var9 < -1) {
            boolean var40 = var12 >= var9;
            if (var23 < 0) {
                while (~var23 > -1) {
                    var23 += var31;
                    var24 += var35;
                    var31 += var28;
                    ++var8;
                    var35 += var28;
                }
            }
            if (var40) {
                if (~var25 > -1) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var33 += var30;
                        var37 += var30;
                        ++var10;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var33 += var30;
                    ++var10;
                    var37 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var34 -= var29;
                var38 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var35 += var28;
                var31 += var28;
                ++var8;
            }
            var24 += -var32;
            var23 += -var36;
            --var9;
            var36 -= var27;
            var32 -= var27;
            int var41 = -var9 + arg5;
            int var42 = arg5 + var9;
            int var43 = arg1 + var8;
            int var44 = -var8 + arg1;
            if (!var40) {
                class427.method2465(class457.field6299[var41], var43, var44, -7, arg2);
                class427.method2465(class457.field6299[var42], var43, var44, -7, arg2);
            } else {
                int var45 = arg1 + var10;
                int var46 = -var10 + arg1;
                class427.method2465(class457.field6299[var41], var46, var44, -7, arg2);
                class427.method2465(class457.field6299[var41], var45, var46, -7, arg0);
                class427.method2465(class457.field6299[var41], var43, var45, -7, arg2);
                class427.method2465(class457.field6299[var42], var46, var44, -7, arg2);
                class427.method2465(class457.field6299[var42], var45, var46, -7, arg0);
                class427.method2465(class457.field6299[var42], var43, var45, arg4 ^ -105, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)I")
    public static final int method738(int arg0, byte arg1) {
        if (arg1 != 74) {
            return 100;
        } else {
            ++field1547;
            int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
            int var3 = arg0 * 6 + -61440;
            int var4 = (arg0 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIILqa;III)Lc;")
    public static final class121 method739(int arg0, int arg1, int arg2, class162 arg3, int arg4, int arg5, int arg6) {
        ++field1548;
        long var7 = (long) arg2;
        class121 var9 = (class121) class457.field6297.method1456(var7, 112);
        short var10 = 2055;
        if (var9 == null) {
            class118 var11 = class116.method798(class505.field6946, 0, arg2, (byte) -97);
            if (var11 == null) {
                return null;
            }
            if (var11.field1734 < 13) {
                var11.method824(-28256, 0);
            }
            var9 = arg3.method531(var11, var10, class391.field5306, 64, 768);
            class457.field6297.method1462(var9, var7, -98);
        }
        class121 var12 = var9.method863((byte) 2, var10, true);
        if (arg1 != 0) {
            var12.method838(arg1);
        }
        if (arg0 != arg5) {
            var12.method868(arg0);
        }
        if (~arg6 != -1) {
            var12.method869(arg6);
        }
        if (~arg4 != -1) {
            var12.method879(0, arg4, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lbo;ILjaggl/memory/NativeBuffer;)V")
    public class105(class511 arg0, int arg1, NativeBuffer arg2) {
        super(arg0, arg2);
        this.field1535 = arg1;
    }

    static {
        new class304("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
        field1539 = new class462[30];
        field1536 = 0;
        field1546 = 16777215;
        field1543 = -1;
        field1549 = new class145(43, 18);
        field1551 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
    }
}
