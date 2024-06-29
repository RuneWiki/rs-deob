import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class240 extends class104 {

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "J")
    public long field4272;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "Le;")
    public static class191 field4261 = class54.method368("gr-Un:", 2047);

    @OriginalMember(owner = "client!fh", name = "F", descriptor = "Le;")
    private static class191 field4269 = class54.method368("wave2:", 2047);

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "I")
    public static int field4263 = -2;

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "Le;")
    public static class191 field4267 = field4269;

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "Le;")
    public static class191 field4268 = field4269;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "Le;")
    public static class191 field4262 = class54.method368("Clientscript error )2 check log for details", 2047);

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "Le;")
    public static class191 field4265 = class54.method368(": ", 2047);

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!fh", name = "H", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "[Z")
    public static boolean[] field4273;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)V")
    public static void method1683(int arg0) {
        field4265 = null;
        field4262 = null;
        int var1 = -27 / ((arg0 - 51) / 60);
        field4268 = null;
        field4267 = null;
        field4273 = null;
        field4269 = null;
        field4261 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II[BIIIIII[Lai;Z)V")
    public static final void method1684(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class220[] arg9, boolean arg10) {
        if (arg3 != -22149) {
            method1686((class191) null, (byte) -75);
        }
        field4264++;
        int var11 = -1;
        class225 var12 = new class225(arg2);
        while (true) {
            int var13 = var12.method1564((byte) 48);
            if (var13 == 0) {
                return;
            }
            int var14 = 0;
            var11 += var13;
            while (true) {
                int var15 = var12.method1577(false);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = (var14 & 0xFFF) >> 6;
                int var18 = var14 >> 12;
                int var19 = var12.method1580(arg3 ^ 0x56C1);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg7 == var18 && var17 >= arg8 && var17 < (arg8 + 8) && arg6 <= var16 && arg6 + 8 > var16) {
                    class102 var22 = class31.method216(var11, (byte) 119);
                    int var23 = class170.method1148(-104, var16 & 0x7, var17 & 0x7, var21, arg5, var22.field1652, var22.field1686) + arg1;
                    int var24 = arg4 + class62.method418(var21, var22.field1652, var22.field1686, arg5, var17 & 0x7, var16 & 0x7, 1);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class220 var25 = null;
                        if (!arg10) {
                            int var26 = arg0;
                            if ((class270.field4755[1][var23][var24] & 0x2) == 2) {
                                var26 = arg0 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg9[var26];
                            }
                        }
                        class228.method1630(arg0, var24, arg0, arg3 ^ 0xFFFFA93F, arg10, var23, arg5 + var21 & 0x3, var25, !arg10, var11, var20);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)V")
    public static final void method1685(byte arg0) {
        if (arg0 != 118) {
            field4271 = 107;
        }
        class70.field1233.method6(-6660);
        field4274++;
        for (int var1 = 0; var1 < 32; var1++) {
            class57.field1064[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class95.field1544[var2] = 0L;
        }
        class181.field3111 = 0;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Le;B)V")
    public static final void method1686(class191 arg0, byte arg1) {
        int var2 = class37.method252(arg0, 4291);
        if (arg1 >= -90) {
            method1684(40, 116, (byte[]) null, 64, -3, 10, 8, -24, -61, (class220[]) null, true);
        }
        field4270++;
        if (var2 == -1) {
            return;
        }
        class225.field4008 = class110.field1849.field823[var2] - class54.field1009;
        int var3 = class225.field4008 - ((int) ((float) class3.field23.field537 / class115.field1905));
        class270.field4767 = class76.field1319 + class161.field2728 - class110.field1849.field826[var2] - 1;
        int var4 = (int) ((float) class3.field23.field537 / class115.field1905) + class225.field4008;
        if (var3 < 0) {
            class225.field4008 = (int) ((float) class3.field23.field537 / class115.field1905);
        }
        int var5 = class270.field4767 + ((int) ((float) class3.field23.field561 / class115.field1905));
        if (class189.field3327 < var4) {
            class225.field4008 = class189.field3327 - ((int) ((float) class3.field23.field537 / class115.field1905));
        }
        int var6 = class270.field4767 - ((int) ((float) class3.field23.field561 / class115.field1905));
        if (var6 < 0) {
            class270.field4767 = (int) ((float) class3.field23.field561 / class115.field1905);
        }
        if (class161.field2728 < var5) {
            class270.field4767 = class161.field2728 - (int) ((float) class3.field23.field561 / class115.field1905);
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
    public class240() {
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(J)V")
    public class240(long arg0) {
        this.field4272 = arg0;
    }
}
