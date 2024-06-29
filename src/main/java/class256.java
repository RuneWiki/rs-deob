import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class256 {

    @OriginalMember(owner = "client!bn", name = "z", descriptor = "I")
    private int field4163 = 0;

    @OriginalMember(owner = "client!bn", name = "s", descriptor = "I")
    public int field4156;

    @OriginalMember(owner = "client!bn", name = "v", descriptor = "[Ltf;")
    public class161[] field4159;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field4142 = 0;

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "Z")
    public static boolean field4149 = true;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "[Lkf;")
    public static class136[] field4144 = new class136[8];

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!bn", name = "r", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!bn", name = "t", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!bn", name = "x", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!bn", name = "A", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!bn", name = "C", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!bn", name = "q", descriptor = "J")
    private long field4154;

    @OriginalMember(owner = "client!bn", name = "p", descriptor = "Ltf;")
    private class161 field4153;

    @OriginalMember(owner = "client!bn", name = "y", descriptor = "Ltf;")
    private class161 field4162;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "Ljm;")
    public static class409 field4141;

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "Lmo;")
    public static class447 field4151;

    @OriginalMember(owner = "client!bn", name = "w", descriptor = "Lmo;")
    public static class447 field4160;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "[I")
    public static int[] field4147;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)I")
    public final int method1763(byte arg0) {
        field4150++;
        if (arg0 < 16) {
            field4142 = 85;
        }
        return this.field4156;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
    public final void method1764(int arg0) {
        for (int var2 = 0; var2 < this.field4156; var2++) {
            class161 var3 = this.field4159[var2];
            while (true) {
                class161 var4 = var3.field2537;
                if (var3 == var4) {
                    break;
                }
                var4.method1120(76);
            }
        }
        if (arg0 <= 77) {
            method1769(-28, (int[]) null, (byte) 50, 66, 86);
        }
        field4165++;
        this.field4153 = null;
        this.field4162 = null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IZI)Ljava/lang/String;")
    public static final String method1765(int arg0, boolean arg1, int arg2) {
        field4152++;
        if (arg1 && arg2 >= 0) {
            if (arg0 != 10) {
                method1775(2, (byte) -15);
            }
            return class252.method1748(106, 10, arg1, arg2);
        } else {
            return Integer.toString(arg2);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(JLtf;I)V")
    public final void method1766(long arg0, class161 arg1, int arg2) {
        int var5 = -11 % ((4 - arg2) / 47);
        if (arg1.field2536 != null) {
            arg1.method1120(-103);
        }
        field4158++;
        class161 var6 = this.field4159[(int) ((long) (this.field4156 - 1) & arg0)];
        arg1.field2537 = var6;
        arg1.field2536 = var6.field2536;
        arg1.field2536.field2537 = arg1;
        arg1.field2539 = arg0;
        arg1.field2537.field2536 = arg1;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ltm;[I[I[IZ)V")
    public static final void method1767(class219 arg0, int[] arg1, int[] arg2, int[] arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg1[var5];
            int var8 = arg3[var5];
            int var9 = 0;
            while (var7 != 0 && arg0.field1835.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field1835[var9] = null;
                    } else {
                        class417 var10 = class156.method1099(var6, 56);
                        int var11 = var10.field6172;
                        class318 var12 = arg0.field1835[var9];
                        if (var12 != null) {
                            if (var12.field4982 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field1835[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field4973 = var8;
                                    var12.field4976 = 0;
                                    var12.field4980 = 0;
                                    var12.field4981 = 1;
                                    var12.field4977 = 0;
                                    class196.method1374(arg0.field722, (byte) -104, 0, arg0.field724, class261.field4201 == arg0, var10);
                                } else if (var11 == 2) {
                                    var12.field4980 = 0;
                                }
                            } else if (var10.field6166 >= class156.method1099(var12.field4982, 111).field6166) {
                                var12 = arg0.field1835[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class318 var13 = arg0.field1835[var9] = new class318();
                            var13.field4981 = 1;
                            var13.field4976 = 0;
                            var13.field4982 = var6;
                            var13.field4973 = var8;
                            var13.field4977 = 0;
                            var13.field4980 = 0;
                            class196.method1374(arg0.field722, (byte) -104, 0, arg0.field724, class261.field4201 == arg0, var10);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        if (arg4) {
            field4141 = null;
        }
        field4139++;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1768(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4164++;
        class359 var10 = null;
        for (class359 var11 = (class359) class235.field3928.method253((byte) -6); var11 != null; var11 = (class359) class235.field3928.method247((byte) 31)) {
            if (var11.field5488 == arg2 && var11.field5490 == arg4 && var11.field5498 == arg9 && var11.field5492 == arg5) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class359();
            var10.field5492 = arg5;
            var10.field5488 = arg2;
            var10.field5490 = arg4;
            var10.field5498 = arg9;
            class326.method2170((byte) 75, var10);
            class235.field3928.method245(500, var10);
        }
        var10.field5491 = arg8;
        var10.field5497 = arg0;
        var10.field5502 = arg1;
        var10.field5503 = arg6;
        var10.field5493 = arg7;
        if (arg3 != 0) {
            field4144 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I[IBII)V")
    public static final void method1769(int arg0, int[] arg1, byte arg2, int arg3, int arg4) {
        field4155++;
        arg4--;
        if (arg2 <= 44) {
            field4151 = null;
        }
        int var6 = arg0 - 1;
        int var5 = var6 - 7;
        while (var5 > arg4) {
            int var7 = arg4 + 1;
            arg1[var7] = arg3;
            int var8 = var7 + 1;
            arg1[var8] = arg3;
            int var9 = var8 + 1;
            arg1[var9] = arg3;
            int var10 = var9 + 1;
            arg1[var10] = arg3;
            int var11 = var10 + 1;
            arg1[var11] = arg3;
            int var12 = var11 + 1;
            arg1[var12] = arg3;
            int var13 = var12 + 1;
            arg1[var13] = arg3;
            arg4 = var13 + 1;
            arg1[arg4] = arg3;
        }
        while (var6 > arg4) {
            arg4++;
            arg1[arg4] = arg3;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IJ)Ltf;")
    public final class161 method1770(int arg0, long arg1) {
        if (arg0 != -880) {
            return null;
        }
        field4145++;
        this.field4154 = arg1;
        class161 var4 = this.field4159[(int) ((long) (this.field4156 - 1) & arg1)];
        for (this.field4153 = var4.field2537; this.field4153 != var4; this.field4153 = this.field4153.field2537) {
            if (this.field4153.field2539 == arg1) {
                class161 var5 = this.field4153;
                this.field4153 = this.field4153.field2537;
                return var5;
            }
        }
        this.field4153 = null;
        return null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)Ltf;")
    public final class161 method1771(boolean arg0) {
        if (arg0) {
            field4160 = null;
        }
        field4138++;
        if (this.field4153 == null) {
            return null;
        }
        class161 var2 = this.field4159[(int) (this.field4154 & (long) (this.field4156 - 1))];
        while (this.field4153 != var2) {
            if (this.field4153.field2539 == this.field4154) {
                class161 var3 = this.field4153;
                this.field4153 = this.field4153.field2537;
                return var3;
            }
            this.field4153 = this.field4153.field2537;
        }
        this.field4153 = null;
        return null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B[Ltf;)I")
    public final int method1772(byte arg0, class161[] arg1) {
        field4148++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4156; var4++) {
            class161 var6 = this.field4159[var4];
            for (class161 var7 = var6.field2537; var7 != var6; var7 = var7.field2537) {
                arg1[var3++] = var7;
            }
        }
        int var5 = 10 % ((arg0 - 7) / 58);
        return var3;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)Ltf;")
    public final class161 method1773(int arg0) {
        field4161++;
        if (arg0 > ~this.field4163 && this.field4159[this.field4163 - 1] != this.field4162) {
            class161 var2 = this.field4162;
            this.field4162 = var2.field2537;
            return var2;
        }
        while (this.field4156 > this.field4163) {
            class161 var3 = this.field4159[this.field4163++].field2537;
            if (this.field4159[this.field4163 - 1] != var3) {
                this.field4162 = var3.field2537;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lmo;Luj;Lmo;ILmo;)Z")
    public static final boolean method1774(class447 arg0, class214 arg1, class447 arg2, int arg3, class447 arg4) {
        if (arg3 != -1) {
            method1765(-82, false, 99);
        }
        class241.field3994 = arg4;
        class413.field6114 = arg2;
        class415.field6131 = arg0;
        field4140++;
        class285.field4582 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IB)Lic;")
    public static final class415 method1775(int arg0, byte arg1) {
        if (arg1 > -13) {
            field4142 = -8;
        }
        field4146++;
        class415 var2 = (class415) class300.field4763.method1660(2, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class377.field5700.method2771(arg0, 0, 3);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class415 var4 = class182.method1247((byte) -63, var3);
            class300.field4763.method1655(false, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(Z)Ltf;")
    public final class161 method1776(boolean arg0) {
        this.field4163 = 0;
        field4157++;
        return arg0 ? this.method1773(-1) : null;
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V")
    public static void method1777(int arg0) {
        field4144 = null;
        field4160 = null;
        int var1 = -90 / ((arg0 - 84) / 39);
        field4141 = null;
        field4151 = null;
        field4147 = null;
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(I)V")
    public class256(int arg0) {
        this.field4156 = arg0;
        this.field4159 = new class161[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class161 var3 = this.field4159[var2] = new class161();
            var3.field2536 = var3;
            var3.field2537 = var3;
        }
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "(I)I")
    public final int method1778(int arg0) {
        field4143++;
        int var2 = 0;
        for (int var3 = arg0; var3 < this.field4156; var3++) {
            class161 var4 = this.field4159[var3];
            for (class161 var5 = var4.field2537; var5 != var4; var5 = var5.field2537) {
                var2++;
            }
        }
        return var2;
    }
}
