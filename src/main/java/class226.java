import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public abstract class class226 extends class32 {

    @OriginalMember(owner = "client!rg", name = "T", descriptor = "I")
    public int field4124 = 0;

    @OriginalMember(owner = "client!rg", name = "X", descriptor = "[I")
    private int[] field4128;

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "[I")
    private int[] field4118;

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "[I")
    private int[] field4119;

    @OriginalMember(owner = "client!rg", name = "bb", descriptor = "[I")
    private int[] field4132;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
    private int field4110;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "I")
    private int field4113;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "Lqk;")
    private static class207 field4109 = class24.method212(255, "shy");

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "Lqk;")
    private static class207 field4116 = class24.method212(255, "img=");

    @OriginalMember(owner = "client!rg", name = "U", descriptor = "Lqk;")
    private static class207 field4125 = class24.method212(255, "times");

    @OriginalMember(owner = "client!rg", name = "R", descriptor = "Lqk;")
    private static class207 field4122 = class24.method212(255, "reg");

    @OriginalMember(owner = "client!rg", name = "Y", descriptor = "Lqk;")
    private static class207 field4129 = class24.method212(255, "u=");

    @OriginalMember(owner = "client!rg", name = "ab", descriptor = "Lqk;")
    private static class207 field4131 = class24.method212(255, "euro");

    @OriginalMember(owner = "client!rg", name = "V", descriptor = "Lqk;")
    private static class207 field4126 = class24.method212(255, "nbsp");

    @OriginalMember(owner = "client!rg", name = "Z", descriptor = "Lqk;")
    private static class207 field4130 = class24.method212(255, "lt");

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "Lqk;")
    private static class207 field4111 = class24.method212(255, "gt");

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "Lqk;")
    private static class207 field4115 = class24.method212(255, ")4str");

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "Lqk;")
    private static class207 field4117 = class24.method212(255, "trans=");

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "Lqk;")
    private static class207 field4114 = class24.method212(255, "col=");

    @OriginalMember(owner = "client!rg", name = "gb", descriptor = "Lqk;")
    private static class207 field4137 = class24.method212(255, "shad=");

    @OriginalMember(owner = "client!rg", name = "P", descriptor = "Lqk;")
    private static class207 field4120 = class24.method212(255, ")4shad");

    @OriginalMember(owner = "client!rg", name = "hb", descriptor = "Lqk;")
    private static class207 field4138 = class24.method212(255, ")4trans");

    @OriginalMember(owner = "client!rg", name = "W", descriptor = "Lqk;")
    private static class207 field4127 = class24.method212(255, ")4col");

    @OriginalMember(owner = "client!rg", name = "ib", descriptor = "Lqk;")
    private static class207 field4139 = class24.method212(255, "u");

    @OriginalMember(owner = "client!rg", name = "fb", descriptor = "Lqk;")
    private static class207 field4136 = class24.method212(255, "shad");

    @OriginalMember(owner = "client!rg", name = "db", descriptor = "Lqk;")
    private static class207 field4134 = class24.method212(255, "str=");

    @OriginalMember(owner = "client!rg", name = "cb", descriptor = "Lqk;")
    private static class207 field4133 = class24.method212(255, "copy");

    @OriginalMember(owner = "client!rg", name = "kb", descriptor = "Lqk;")
    private static class207 field4141 = class24.method212(255, "br");

    @OriginalMember(owner = "client!rg", name = "lb", descriptor = "Lqk;")
    private static class207 field4142 = class24.method212(255, ")4u");

    @OriginalMember(owner = "client!rg", name = "mb", descriptor = "Lqk;")
    private static class207 field4143 = class24.method212(255, "str");

    @OriginalMember(owner = "client!rg", name = "jb", descriptor = "Lqk;")
    private static class207 field4140 = class191.method1335((byte) 104, 100);

    @OriginalMember(owner = "client!rg", name = "nb", descriptor = "I")
    private static int field4144 = 256;

    @OriginalMember(owner = "client!rg", name = "ob", descriptor = "I")
    private static int field4145 = -1;

    @OriginalMember(owner = "client!rg", name = "tb", descriptor = "I")
    private static int field4150 = -1;

    @OriginalMember(owner = "client!rg", name = "pb", descriptor = "I")
    private static int field4146 = 0;

    @OriginalMember(owner = "client!rg", name = "rb", descriptor = "I")
    private static int field4148 = 0;

    @OriginalMember(owner = "client!rg", name = "ub", descriptor = "[Lqk;")
    private static class207[] field4151 = new class207[100];

    @OriginalMember(owner = "client!rg", name = "qb", descriptor = "I")
    private static int field4147 = 256;

    @OriginalMember(owner = "client!rg", name = "xb", descriptor = "I")
    private static int field4154 = 0;

    @OriginalMember(owner = "client!rg", name = "wb", descriptor = "I")
    private static int field4153 = -1;

    @OriginalMember(owner = "client!rg", name = "sb", descriptor = "I")
    private static int field4149 = 0;

    @OriginalMember(owner = "client!rg", name = "vb", descriptor = "I")
    private static int field4152 = -1;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "[B")
    private byte[] field4112;

    @OriginalMember(owner = "client!rg", name = "Q", descriptor = "[I")
    private int[] field4121;

    @OriginalMember(owner = "client!rg", name = "eb", descriptor = "[I")
    private int[] field4135;

    @OriginalMember(owner = "client!rg", name = "S", descriptor = "[Lbl;")
    private class33[] field4123;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lqk;IIIIII)V")
    public final void method1592(class207 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method1603(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.field3663];
        for (int var11 = 0; var11 < arg0.field3663; var11++) {
            var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) arg5) * var8);
        }
        this.method1597(arg0, arg1 - this.method1608(arg0) / 2, arg2, (int[]) null, var10);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "()V")
    public static void method1593() {
        field4130 = null;
        field4111 = null;
        field4126 = null;
        field4109 = null;
        field4125 = null;
        field4131 = null;
        field4133 = null;
        field4122 = null;
        field4116 = null;
        field4141 = null;
        field4114 = null;
        field4127 = null;
        field4117 = null;
        field4138 = null;
        field4129 = null;
        field4139 = null;
        field4142 = null;
        field4137 = null;
        field4136 = null;
        field4120 = null;
        field4134 = null;
        field4143 = null;
        field4115 = null;
        field4140 = null;
        field4151 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIIZ)V")
    public abstract void method1417(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lqk;IIII)V")
    public final void method1594(class207 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1603(arg3, arg4);
            this.method1615(arg0, arg1 - this.method1608(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([B)V")
    private final void method1595(byte[] arg0) {
        this.field4121 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field4121.length; var2++) {
                this.field4121[var2] = arg0[var2] & 0xFF;
            }
            this.field4124 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field4121[var4] = arg0[var3++] & 0xFF;
        }
        int[] var5 = new int[256];
        int[] var6 = new int[256];
        for (int var7 = 0; var7 < 256; var7++) {
            var5[var7] = arg0[var3++] & 0xFF;
        }
        for (int var8 = 0; var8 < 256; var8++) {
            var6[var8] = arg0[var3++] & 0xFF;
        }
        byte[][] var9 = new byte[256][];
        for (int var10 = 0; var10 < 256; var10++) {
            var9[var10] = new byte[var5[var10]];
            byte var17 = 0;
            for (int var18 = 0; var18 < var9[var10].length; var18++) {
                var17 += arg0[var3++];
                var9[var10][var18] = var17;
            }
        }
        byte[][] var11 = new byte[256][];
        for (int var12 = 0; var12 < 256; var12++) {
            var11[var12] = new byte[var5[var12]];
            byte var15 = 0;
            for (int var16 = 0; var16 < var11[var12].length; var16++) {
                var15 += arg0[var3++];
                var11[var12][var16] = var15;
            }
        }
        this.field4112 = new byte[65536];
        for (int var13 = 0; var13 < 256; var13++) {
            if (var13 != 32 && var13 != 160) {
                for (int var14 = 0; var14 < 256; var14++) {
                    if (var14 != 32 && var14 != 160) {
                        this.field4112[(var13 << 8) + var14] = (byte) method1616(var9, var11, var6, this.field4121, var5, var13, var14);
                    }
                }
            }
        }
        this.field4124 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lqk;IIIII)V")
    public final void method1596(class207 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method1603(arg3, arg4);
        int[] var7 = new int[arg0.field3663];
        for (int var8 = 0; var8 < arg0.field3663; var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method1597(arg0, arg1 - this.method1608(arg0) / 2, arg2, (int[]) null, var7);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lqk;II[I[I)V")
    private final void method1597(class207 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field4124;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field3663; var10++) {
            int var11 = arg0.field3652[var10] & 0xFF;
            if (var11 == 60) {
                var7 = var10;
            } else {
                if (var11 == 62 && var7 != -1) {
                    class207 var12 = arg0.method1427(-17195, var7 + 1, var10);
                    var7 = -1;
                    if (var12.method1436(field4130, (byte) 66)) {
                        var11 = 60;
                    } else if (var12.method1436(field4111, (byte) -94)) {
                        var11 = 62;
                    } else if (var12.method1436(field4126, (byte) 67)) {
                        var11 = 160;
                    } else if (var12.method1436(field4109, (byte) 26)) {
                        var11 = 173;
                    } else if (var12.method1436(field4125, (byte) -121)) {
                        var11 = 215;
                    } else if (var12.method1436(field4131, (byte) 61)) {
                        var11 = 128;
                    } else if (var12.method1436(field4133, (byte) -119)) {
                        var11 = 169;
                    } else {
                        if (!var12.method1436(field4122, (byte) 124)) {
                            if (var12.method1453(0, field4116)) {
                                try {
                                    int var13;
                                    if (arg3 == null) {
                                        var13 = 0;
                                    } else {
                                        var13 = arg3[var9];
                                    }
                                    int var14;
                                    if (arg4 == null) {
                                        var14 = 0;
                                    } else {
                                        var14 = arg4[var9];
                                    }
                                    var9++;
                                    int var15 = var12.method1464(-23886, 4).method1442(-72);
                                    class33 var16 = this.field4123[var15];
                                    int var17 = this.field4135 == null ? var16.field669 : this.field4135[var15];
                                    if (field4144 == 256) {
                                        var16.method247(arg1 + var13, this.field4124 + var6 - var17 + var14);
                                    } else {
                                        var16.method249(arg1 + var13, this.field4124 + var6 - var17 + var14, field4144);
                                    }
                                    arg1 += var16.field663;
                                    var8 = -1;
                                } catch (Exception var23) {
                                }
                            } else {
                                this.method1598(var12);
                            }
                            continue;
                        }
                        var11 = 174;
                    }
                }
                if (var7 == -1) {
                    if (this.field4112 != null && var8 != -1) {
                        arg1 += this.field4112[(var8 << 8) + var11];
                    }
                    int var18 = this.field4119[var11];
                    int var19 = this.field4132[var11];
                    int var20;
                    if (arg3 == null) {
                        var20 = 0;
                    } else {
                        var20 = arg3[var9];
                    }
                    int var21;
                    if (arg4 == null) {
                        var21 = 0;
                    } else {
                        var21 = arg4[var9];
                    }
                    var9++;
                    if (var11 == 32) {
                        if (field4146 > 0) {
                            field4154 += field4146;
                            arg1 += field4154 >> 8;
                            field4154 &= 0xFF;
                        }
                    } else if (field4144 == 256) {
                        if (field4153 != -1) {
                            this.method1417(var11, this.field4128[var11] + arg1 + var20 + 1, this.field4118[var11] + var6 + 1 + var21, var18, var19, field4153, true);
                        }
                        this.method1417(var11, this.field4128[var11] + arg1 + var20, this.field4118[var11] + var6 + var21, var18, var19, field4148, false);
                    } else {
                        if (field4153 != -1) {
                            this.method1415(var11, this.field4128[var11] + arg1 + var20 + 1, this.field4118[var11] + var6 + 1 + var21, var18, var19, field4153, field4144, true);
                        }
                        this.method1415(var11, this.field4128[var11] + arg1 + var20, this.field4118[var11] + var6 + var21, var18, var19, field4148, field4144, false);
                    }
                    int var22 = this.field4121[var11];
                    if (field4150 != -1) {
                        class23.method161(arg1, (int) ((double) this.field4124 * 0.7D) + var6, var22, field4150);
                    }
                    if (field4145 != -1) {
                        class23.method161(arg1, this.field4124 + var6, var22, field4145);
                    }
                    arg1 += var22;
                    var8 = var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lqk;)V")
    private final void method1598(class207 arg0) {
        try {
            if (arg0.method1453(0, field4114)) {
                field4148 = arg0.method1464(-23886, 4).method1456(16, -49);
                return;
            }
            if (arg0.method1436(field4127, (byte) -123)) {
                field4148 = field4149;
                return;
            }
            if (arg0.method1453(0, field4117)) {
                field4144 = arg0.method1464(-23886, 6).method1442(-124);
                return;
            }
            if (arg0.method1436(field4138, (byte) 100)) {
                field4144 = field4147;
                return;
            }
            if (arg0.method1453(0, field4134)) {
                field4150 = arg0.method1464(-23886, 4).method1456(16, -49);
                return;
            }
            if (arg0.method1436(field4143, (byte) -87)) {
                field4150 = 8388608;
                return;
            }
            if (arg0.method1436(field4115, (byte) 116)) {
                field4150 = -1;
                return;
            }
            if (arg0.method1453(0, field4129)) {
                field4145 = arg0.method1464(-23886, 2).method1456(16, -49);
                return;
            }
            if (arg0.method1436(field4139, (byte) 111)) {
                field4145 = 0;
                return;
            }
            if (arg0.method1436(field4142, (byte) 90)) {
                field4145 = -1;
                return;
            }
            if (arg0.method1453(0, field4137)) {
                field4153 = arg0.method1464(-23886, 5).method1456(16, -49);
                return;
            }
            if (arg0.method1436(field4136, (byte) 122)) {
                field4153 = 0;
                return;
            }
            if (arg0.method1436(field4120, (byte) 70)) {
                field4153 = field4152;
                return;
            }
            if (arg0.method1436(field4141, (byte) -96)) {
                this.method1611(field4149, field4152, field4147);
                return;
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lqk;IIIIIIIIII)I")
    public final int method1599(class207 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method1611(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field4124;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field4113 + this.field4110 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method1602(arg0, var12, field4151);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field4110 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field4110 - this.field4113 - (var13 - 1) * arg10) / 2 + this.field4110 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field4113 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field4110 - this.field4113 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field4110 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method1615(field4151[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method1615(field4151[var16], arg1 + (arg3 - this.method1608(field4151[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method1615(field4151[var16], arg1 + arg3 - this.method1608(field4151[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method1615(field4151[var16], arg1, var14);
            } else {
                this.method1601(field4151[var16], arg3);
                this.method1615(field4151[var16], arg1, var14);
                field4146 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(Lqk;IIII)V")
    public final void method1600(class207 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1603(arg3, arg4);
            this.method1615(arg0, arg1 - this.method1608(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lqk;I)V")
    private final void method1601(class207 arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        for (int var5 = 0; var5 < arg0.method1450((byte) -126); var5++) {
            int var6 = arg0.method1457(var5, -12675);
            if (var6 == 60) {
                var4 = true;
            } else if (var6 == 62) {
                var4 = false;
            } else if (!var4 && var6 == 32) {
                var3++;
            }
        }
        if (var3 > 0) {
            field4146 = (arg1 - this.method1608(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lqk;[I[Lqk;)I")
    public final int method1602(class207 arg0, int[] arg1, class207[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        field4140.method1455(0, (byte) 85);
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int var7 = 0;
        byte var8 = 0;
        int var9 = -1;
        int var10 = -1;
        int var11 = 0;
        int var12 = arg0.method1450((byte) -110);
        for (int var13 = 0; var13 < var12; var13++) {
            int var14 = arg0.method1457(var13, -12675);
            if (var14 == 60) {
                var9 = var13;
            } else {
                if (var14 == 62 && var9 != -1) {
                    class207 var15 = arg0.method1427(-17195, var9 + 1, var13);
                    var9 = -1;
                    field4140.method1439(60, (byte) -118);
                    field4140.method1463(var15, false);
                    field4140.method1439(62, (byte) 25);
                    if (var15.method1436(field4141, (byte) -125)) {
                        if (arg2[var11] == null) {
                            arg2[var11] = field4140.method1427(-17195, var5, field4140.method1450((byte) -120));
                        } else {
                            arg2[var11].method1455(0, (byte) 127);
                            arg2[var11] = arg2[var11].method1468(field4140, (byte) -61, field4140.method1450((byte) 21), var5);
                        }
                        var11++;
                        var5 = field4140.method1450((byte) 124);
                        var4 = 0;
                        var6 = -1;
                        var10 = -1;
                    } else if (var15.method1436(field4130, (byte) -104)) {
                        var4 += this.method1614(60);
                        if (this.field4112 != null && var10 != -1) {
                            var4 += this.field4112[(var10 << 8) + 60];
                        }
                        var10 = 60;
                    } else if (var15.method1436(field4111, (byte) -107)) {
                        var4 += this.method1614(62);
                        if (this.field4112 != null && var10 != -1) {
                            var4 += this.field4112[(var10 << 8) + 62];
                        }
                        var10 = 62;
                    } else if (var15.method1436(field4126, (byte) 33)) {
                        var4 += this.method1614(160);
                        if (this.field4112 != null && var10 != -1) {
                            var4 += this.field4112[(var10 << 8) + 160];
                        }
                        var10 = 160;
                    } else if (var15.method1436(field4109, (byte) 28)) {
                        var4 += this.method1614(173);
                        if (this.field4112 != null && var10 != -1) {
                            var4 += this.field4112[(var10 << 8) + 173];
                        }
                        var10 = 173;
                    } else if (var15.method1436(field4125, (byte) -128)) {
                        var4 += this.method1614(215);
                        if (this.field4112 != null && var10 != -1) {
                            var4 += this.field4112[(var10 << 8) + 215];
                        }
                        var10 = 215;
                    } else if (var15.method1436(field4131, (byte) -116)) {
                        var4 += this.method1614(128);
                        if (this.field4112 != null && var10 != -1) {
                            var4 += this.field4112[(var10 << 8) + 128];
                        }
                        var10 = 128;
                    } else if (var15.method1436(field4133, (byte) -91)) {
                        var4 += this.method1614(169);
                        if (this.field4112 != null && var10 != -1) {
                            var4 += this.field4112[(var10 << 8) + 169];
                        }
                        var10 = 169;
                    } else if (var15.method1436(field4122, (byte) -118)) {
                        var4 += this.method1614(174);
                        if (this.field4112 != null && var10 != -1) {
                            var4 += this.field4112[(var10 << 8) + 174];
                        }
                        var10 = 174;
                    } else if (var15.method1453(0, field4116)) {
                        try {
                            int var16 = var15.method1464(-23886, 4).method1442(-121);
                            var4 += this.field4123[var16].field663;
                            var10 = -1;
                        } catch (Exception var17) {
                        }
                    }
                    var14 = -1;
                }
                if (var9 == -1) {
                    if (var14 != -1) {
                        field4140.method1439(var14, (byte) 123);
                        var4 += this.method1614(var14);
                        if (this.field4112 != null && var10 != -1) {
                            var4 += this.field4112[(var10 << 8) + var14];
                        }
                        var10 = var14;
                    }
                    if (var14 == 32) {
                        var6 = field4140.method1450((byte) -125);
                        var7 = var4;
                        var8 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var11 < arg1.length ? var11 : arg1.length - 1] && var6 >= 0) {
                        if (arg2[var11] == null) {
                            arg2[var11] = field4140.method1427(-17195, var5, var6 - var8);
                        } else {
                            arg2[var11].method1455(0, (byte) 55);
                            arg2[var11] = arg2[var11].method1468(field4140, (byte) -122, var6 - var8, var5);
                        }
                        var11++;
                        var5 = var6;
                        var6 = -1;
                        var4 -= var7;
                        var10 = -1;
                    }
                    if (var14 == 45) {
                        var6 = field4140.method1450((byte) -112);
                        var7 = var4;
                        var8 = 0;
                    }
                }
            }
        }
        if (field4140.method1450((byte) -112) > var5) {
            if (arg2[var11] == null) {
                arg2[var11] = field4140.method1427(-17195, var5, field4140.method1450((byte) -124));
            } else {
                arg2[var11].method1455(0, (byte) 82);
                arg2[var11] = arg2[var11].method1468(field4140, (byte) -128, field4140.method1450((byte) -111), var5);
            }
            var11++;
        }
        return var11;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)V")
    private final void method1603(int arg0, int arg1) {
        field4150 = -1;
        field4145 = -1;
        field4152 = arg1;
        field4153 = arg1;
        field4149 = arg0;
        field4148 = arg0;
        field4147 = 256;
        field4144 = 256;
        field4146 = 0;
        field4154 = 0;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(Lqk;IIIII)V")
    public final void method1604(class207 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method1603(arg3, arg4);
        int[] var7 = new int[arg0.field3663];
        int[] var8 = new int[arg0.field3663];
        for (int var9 = 0; var9 < arg0.field3663; var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method1597(arg0, arg1 - this.method1608(arg0) / 2, arg2, var7, var8);
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(Lqk;I)I")
    public final int method1605(class207 arg0, int arg1) {
        return this.method1602(arg0, new int[] { arg1 }, field4151);
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(Lqk;)Lqk;")
    public static final class207 method1606(class207 arg0) {
        int var1 = arg0.method1450((byte) -124);
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            byte var8 = arg0.field3652[var3];
            if (var8 == 60 || var8 == 62) {
                var2 += 3;
            }
        }
        class207 var4 = new class207();
        var4.field3663 = var1 + var2;
        var4.field3652 = new byte[var4.field3663];
        int var5 = 0;
        for (int var6 = 0; var6 < var1; var6++) {
            byte var7 = arg0.field3652[var6];
            if (var7 == 60) {
                var4.field3652[var5++] = 60;
                var4.field3652[var5++] = 108;
                var4.field3652[var5++] = 116;
                var4.field3652[var5++] = 62;
            } else if (var7 == 62) {
                var4.field3652[var5++] = 60;
                var4.field3652[var5++] = 103;
                var4.field3652[var5++] = 116;
                var4.field3652[var5++] = 62;
            } else {
                var4.field3652[var5++] = var7;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(Lqk;I)I")
    public final int method1607(class207 arg0, int arg1) {
        int var3 = this.method1602(arg0, new int[] { arg1 }, field4151);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method1608(field4151[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(Lqk;)I")
    public final int method1608(class207 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = -1;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.field3663; var5++) {
            int var6 = arg0.field3652[var5] & 0xFF;
            if (var6 == 60) {
                var2 = var5;
            } else {
                if (var6 == 62 && var2 != -1) {
                    class207 var7 = arg0.method1427(-17195, var2 + 1, var5);
                    var2 = -1;
                    if (var7.method1436(field4130, (byte) 77)) {
                        var6 = 60;
                    } else if (var7.method1436(field4111, (byte) 97)) {
                        var6 = 62;
                    } else if (var7.method1436(field4126, (byte) 34)) {
                        var6 = 160;
                    } else if (var7.method1436(field4109, (byte) -115)) {
                        var6 = 173;
                    } else if (var7.method1436(field4125, (byte) -105)) {
                        var6 = 215;
                    } else if (var7.method1436(field4131, (byte) -94)) {
                        var6 = 128;
                    } else if (var7.method1436(field4133, (byte) -101)) {
                        var6 = 169;
                    } else {
                        if (!var7.method1436(field4122, (byte) 31)) {
                            if (var7.method1453(0, field4116)) {
                                try {
                                    int var8 = var7.method1464(-23886, 4).method1442(-97);
                                    var4 += this.field4123[var8].field663;
                                    var3 = -1;
                                } catch (Exception var9) {
                                }
                            }
                            continue;
                        }
                        var6 = 174;
                    }
                }
                if (var2 == -1) {
                    var4 += this.field4121[var6];
                    if (this.field4112 != null && var3 != -1) {
                        var4 += this.field4112[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lqk;IIIIIIIII)I")
    public final int method1609(class207 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method1599(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([Lbl;[I)V")
    public final void method1610(class33[] arg0, int[] arg1) {
        if (arg1 != null && arg0.length != arg1.length) {
            throw new IllegalArgumentException();
        }
        this.field4123 = arg0;
        this.field4135 = arg1;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V")
    private final void method1611(int arg0, int arg1, int arg2) {
        field4150 = -1;
        field4145 = -1;
        field4152 = arg1;
        field4153 = arg1;
        field4149 = arg0;
        field4148 = arg0;
        field4147 = arg2;
        field4144 = arg2;
        field4146 = 0;
        field4154 = 0;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lqk;IIIIIIIILjava/util/Random;I[I)I")
    public final int method1612(class207 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Random arg9, int arg10, int[] arg11) {
        if (arg0 == null) {
            return 0;
        }
        arg9.setSeed((long) arg10);
        this.method1611(arg5, arg6, (arg9.nextInt() & 0x1F) + 192);
        int[] var13 = new int[arg0.field3663];
        int var14 = 0;
        for (int var15 = 0; var15 < arg0.field3663; var15++) {
            var13[var15] = var14;
            if ((arg9.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        int var16 = arg1;
        int var17 = this.field4110 + arg2;
        int var18 = -1;
        if (arg8 == 1) {
            var17 += (arg4 - this.field4110 - this.field4113) / 2;
        } else if (arg8 == 2) {
            var17 = arg2 + arg4 - this.field4113;
        }
        if (arg7 == 1) {
            var18 = this.method1608(arg0) + var14;
            var16 = (arg3 - var18) / 2 + arg1;
        } else if (arg7 == 2) {
            var18 = this.method1608(arg0) + var14;
            var16 = arg3 + arg1 - var18;
        }
        this.method1597(arg0, var16, var17, var13, (int[]) null);
        if (arg11 != null) {
            if (var18 == -1) {
                var18 = this.method1608(arg0) + var14;
            }
            arg11[0] = var16;
            arg11[1] = var17 - this.field4110;
            arg11[2] = var18;
            arg11[3] = this.field4113 + this.field4110;
        }
        return var14;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIIIZ)V")
    public abstract void method1415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(Lqk;IIII)V")
    public final void method1613(class207 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1603(arg3, arg4);
            this.method1615(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)I")
    private final int method1614(int arg0) {
        return this.field4121[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lqk;II)V")
    private final void method1615(class207 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field4124;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.field3663; var7++) {
            int var8 = arg0.field3652[var7] & 0xFF;
            if (var8 == 60) {
                var5 = var7;
            } else {
                if (var8 == 62 && var5 != -1) {
                    class207 var9 = arg0.method1427(-17195, var5 + 1, var7);
                    var5 = -1;
                    if (var9.method1436(field4130, (byte) 73)) {
                        var8 = 60;
                    } else if (var9.method1436(field4111, (byte) -91)) {
                        var8 = 62;
                    } else if (var9.method1436(field4126, (byte) -108)) {
                        var8 = 160;
                    } else if (var9.method1436(field4109, (byte) 49)) {
                        var8 = 173;
                    } else if (var9.method1436(field4125, (byte) 66)) {
                        var8 = 215;
                    } else if (var9.method1436(field4131, (byte) -101)) {
                        var8 = 128;
                    } else if (var9.method1436(field4133, (byte) -103)) {
                        var8 = 169;
                    } else {
                        if (!var9.method1436(field4122, (byte) -112)) {
                            if (var9.method1453(0, field4116)) {
                                try {
                                    int var10 = var9.method1464(-23886, 4).method1442(-58);
                                    class33 var11 = this.field4123[var10];
                                    int var12 = this.field4135 == null ? var11.field669 : this.field4135[var10];
                                    if (field4144 == 256) {
                                        var11.method247(arg1, this.field4124 + var4 - var12);
                                    } else {
                                        var11.method249(arg1, this.field4124 + var4 - var12, field4144);
                                    }
                                    arg1 += var11.field663;
                                    var6 = -1;
                                } catch (Exception var16) {
                                }
                            } else {
                                this.method1598(var9);
                            }
                            continue;
                        }
                        var8 = 174;
                    }
                }
                if (var5 == -1) {
                    if (this.field4112 != null && var6 != -1) {
                        arg1 += this.field4112[(var6 << 8) + var8];
                    }
                    int var13 = this.field4119[var8];
                    int var14 = this.field4132[var8];
                    if (var8 == 32) {
                        if (field4146 > 0) {
                            field4154 += field4146;
                            arg1 += field4154 >> 8;
                            field4154 &= 0xFF;
                        }
                    } else if (field4144 == 256) {
                        if (field4153 != -1) {
                            this.method1417(var8, this.field4128[var8] + arg1 + 1, this.field4118[var8] + var4 + 1, var13, var14, field4153, true);
                        }
                        this.method1417(var8, this.field4128[var8] + arg1, this.field4118[var8] + var4, var13, var14, field4148, false);
                    } else {
                        if (field4153 != -1) {
                            this.method1415(var8, this.field4128[var8] + arg1 + 1, this.field4118[var8] + var4 + 1, var13, var14, field4153, field4144, true);
                        }
                        this.method1415(var8, this.field4128[var8] + arg1, this.field4118[var8] + var4, var13, var14, field4148, field4144, false);
                    }
                    int var15 = this.field4121[var8];
                    if (field4150 != -1) {
                        class23.method161(arg1, (int) ((double) this.field4124 * 0.7D) + var4, var15, field4150);
                    }
                    if (field4145 != -1) {
                        class23.method161(arg1, this.field4124 + var4 + 1, var15, field4145);
                    }
                    arg1 += var15;
                    var6 = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([[B[[B[I[I[III)I")
    private static final int method1616(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
        int var7 = arg2[arg5];
        int var8 = arg4[arg5] + var7;
        int var9 = arg2[arg6];
        int var10 = arg4[arg6] + var9;
        int var11 = var7;
        if (var9 > var7) {
            var11 = var9;
        }
        int var12 = var8;
        if (var10 < var8) {
            var12 = var10;
        }
        int var13 = arg3[arg5];
        if (arg3[arg6] < var13) {
            var13 = arg3[arg6];
        }
        byte[] var14 = arg1[arg5];
        byte[] var15 = arg0[arg6];
        int var16 = var11 - var7;
        int var17 = var11 - var9;
        for (int var18 = var11; var18 < var12; var18++) {
            int var19 = var14[var16++] + var15[var17++];
            if (var19 < var13) {
                var13 = var19;
            }
        }
        return -var13;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lqk;IIIILjava/util/Random;I)I")
    public final int method1617(class207 arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method1611(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
        int[] var8 = new int[arg0.field3663];
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field3663; var10++) {
            var8[var10] = var9;
            if ((arg5.nextInt() & 0x3) == 0) {
                var9++;
            }
        }
        this.method1597(arg0, arg1, arg2, var8, (int[]) null);
        return var9;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "([B[I[I[I[I)V")
    public class226(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4) {
        this.field4128 = arg1;
        this.field4118 = arg2;
        this.field4119 = arg3;
        this.field4132 = arg4;
        this.method1595(arg0);
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        for (int var8 = 0; var8 < 256; var8++) {
            if (this.field4118[var8] < var6 && this.field4132[var8] != 0) {
                var6 = this.field4118[var8];
            }
            if (this.field4132[var8] + this.field4118[var8] > var7) {
                var7 = this.field4132[var8] + this.field4118[var8];
            }
        }
        this.field4110 = this.field4124 - var6;
        this.field4113 = var7 - this.field4124;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "([B)V")
    public class226(byte[] arg0) {
        this.method1595(arg0);
    }
}
