import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class277 extends class6 {

    @OriginalMember(owner = "client!pe", name = "Nb", descriptor = "I")
    public static int field4269 = 0;

    @OriginalMember(owner = "client!pe", name = "Tb", descriptor = "[I")
    public static int[] field4275 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!pe", name = "dc", descriptor = "I")
    public static int field4285 = 0;

    @OriginalMember(owner = "client!pe", name = "bc", descriptor = "Lrm;")
    public static class184 field4283 = new class184(64);

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "I")
    private int field4267;

    @OriginalMember(owner = "client!pe", name = "Mb", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!pe", name = "Ob", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!pe", name = "Pb", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!pe", name = "Sb", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!pe", name = "Ub", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!pe", name = "Wb", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!pe", name = "Xb", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!pe", name = "Yb", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!pe", name = "Zb", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!pe", name = "ac", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!pe", name = "cc", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!pe", name = "ec", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!pe", name = "Qb", descriptor = "Ldb;")
    private class141 field4272;

    @OriginalMember(owner = "client!pe", name = "Vb", descriptor = "Lug;")
    public static class253 field4277;

    @OriginalMember(owner = "client!pe", name = "fc", descriptor = "Lug;")
    public static class253 field4287;

    @OriginalMember(owner = "client!pe", name = "gc", descriptor = "[I")
    public static int[] field4288;

    @OriginalMember(owner = "client!pe", name = "Rb", descriptor = "[S")
    public static short[] field4273;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "(II)I", line = 8)
    public final int method1940(int arg0, int arg1) {
        field4280++;
        if (arg1 != -8703) {
            this.field4272 = (class141) null;
        }
        return arg0 * 8 - this.field4267;
    }

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "(I)V", line = 19)
    public final void method1941(int arg0) {
        field4271++;
        this.field4267 = this.field111 * 8;
        if (arg0 != 128) {
            this.method1941(52);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIZ[B)V", line = 37)
    public final void method1942(int arg0, int arg1, boolean arg2, byte[] arg3) {
        for (int var5 = 0; var5 < arg0; var5++) {
            arg3[arg1 + var5] = (byte) (this.field115[this.field111++] - this.field4272.method1053((byte) -105));
        }
        field4278++;
        if (arg2) {
            field4275 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(I)V", line = 52)
    public class277(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "(I)V", line = 57)
    public static final void method1943(int arg0) {
        class9.field171 = 0;
        field4285 = arg0;
        field4281++;
        class240.method1711(false);
        class222.method1625(-44);
        class157.method1142(110);
        for (int var1 = 0; var1 < class9.field171; var1++) {
            int var2 = class263.field4121[var1];
            if (class229.field3595 != class59.field870[var2].field4718) {
                if (class59.field870[var2].field3346.method1191(arg0 ^ 0x0)) {
                    class298.method2075(class59.field870[var2], -86);
                }
                class59.field870[var2].method1541(-93, (class161) null);
                class59.field870[var2] = null;
            }
        }
        if (class61.field899 != class111.field1544.field111) {
            throw new RuntimeException("gnp1 pos:" + class111.field1544.field111 + " psize:" + class61.field899);
        }
        for (int var3 = 0; var3 < class79.field1083; var3++) {
            if (class59.field870[class85.field1157[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class79.field1083);
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "(I)V", line = 111)
    public static final void method1944(int arg0) {
        while (true) {
            if (class111.field1544.method1940(class61.field899, arg0 ^ -8694) >= 11) {
                int var1 = class111.field1544.method1950((byte) -55, 11);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class284.field4403[var1] == null) {
                        var2 = true;
                        class284.field4403[var1] = new class337();
                        if (class286.field4418[var1] != null) {
                            class284.field4403[var1].method2337(111, class286.field4418[var1]);
                        }
                    }
                    class81.field1116[class232.field3631++] = var1;
                    class337 var3 = class284.field4403[var1];
                    var3.field4718 = class229.field3595;
                    int var4 = class111.field1544.method1950((byte) 126, 1);
                    if (var4 == 1) {
                        class36.field526[field4285++] = var1;
                    }
                    int var5 = class111.field1544.method1950((byte) 75, 5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = class55.field749[class111.field1544.method1950((byte) 126, 3)];
                    if (var2) {
                        var3.field4674 = var3.field4715 = var6;
                    }
                    int var7 = class111.field1544.method1950((byte) -8, 1);
                    int var8 = class111.field1544.method1950((byte) -15, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.method2339(class146.field2310.field4675[0] + var5, true, var7 == 1, class146.field2310.field4708[0] + var8);
                    continue;
                }
            }
            field4282++;
            class111.field1544.method1945((byte) -95);
            if (arg0 != 11) {
                field4269 = -37;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "(B)V", line = 177)
    public final void method1945(byte arg0) {
        this.field111 = (this.field4267 + 7) / 8;
        if (arg0 > -87) {
            field4286 = 49;
        }
        field4279++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 189)
    public static final void method1946(String arg0, int arg1) {
        field4268++;
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        if (arg1 <= 44) {
            method1943(80);
        }
        System.exit(1);
    }

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "(BI)V", line = 211)
    public final void method1947(byte arg0, int arg1) {
        field4276++;
        int var3 = 80 / ((arg0 - 1) / 44);
        this.field115[this.field111++] = (byte) (this.field4272.method1053((byte) 116) + arg1);
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(Z)V", line = 222)
    public static void method1948(boolean arg0) {
        field4288 = null;
        field4273 = null;
        field4277 = null;
        field4283 = null;
        if (!arg0) {
            field4275 = null;
            field4287 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([IB)V", line = 238)
    public final void method1949(int[] arg0, byte arg1) {
        this.field4272 = new class141(arg0);
        field4284++;
        if (arg1 >= -8) {
            this.method1942(-11, 64, false, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "(BI)I", line = 250)
    public final int method1950(byte arg0, int arg1) {
        field4270++;
        int var3 = this.field4267 >> 3;
        int var4 = 8 - (this.field4267 & 0x7);
        int var5 = 0;
        this.field4267 += arg1;
        int var6 = -120 % ((32 - arg0) / 39);
        while (arg1 > var4) {
            var5 += (class310.field4830[var4] & this.field115[var3++]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var7;
        if (arg1 == var4) {
            var7 = (class310.field4830[var4] & this.field115[var3]) + var5;
        } else {
            var7 = (this.field115[var3] >> var4 - arg1 & class310.field4830[arg1]) + var5;
        }
        return var7;
    }

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "(I)I", line = 281)
    public final int method1951(int arg0) {
        int var2 = 56 % ((-arg0 - 10) / 60);
        field4266++;
        return this.field115[this.field111++] - this.field4272.method1053((byte) -128) & 0xFF;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIIBII)V", line = 312)
    public static final void method1952(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        field4274++;
        if (arg7 != -128) {
            field4283 = (class184) null;
        }
        if (arg4 == arg9 && arg6 == arg8 && arg2 == arg5 && arg1 == arg3) {
            class314.method2189(arg6, (byte) 13, arg3, arg5, arg0, arg4);
            return;
        }
        int var10 = arg6;
        int var11 = arg6 * 3;
        int var12 = arg4;
        int var13 = arg4 * 3;
        int var14 = arg9 * 3;
        int var15 = arg8 * 3;
        int var16 = arg1 * 3;
        int var17 = arg2 * 3;
        int var18 = var14 + arg5 - var17 - arg4;
        int var19 = arg3 + var15 - var16 - arg6;
        int var20 = var16 + var11 - var15 - var15;
        int var21 = var17 + var13 - var14 - var14;
        int var22 = var14 - var13;
        int var23 = var15 - var11;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var19 * var26;
            int var28 = var18 * var26;
            int var29 = var21 * var25;
            int var30 = var20 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = (var28 + var29 + var31 >> 12) + arg4;
            int var34 = (var27 + var32 + var30 >> 12) + arg6;
            class314.method2189(var10, (byte) 84, var34, var33, arg0, var12);
            var10 = var34;
            var12 = var33;
        }
    }
}
