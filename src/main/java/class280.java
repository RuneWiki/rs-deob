import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class280 extends class367 implements class231 {

    @OriginalMember(owner = "client!al", name = "H", descriptor = "Lao;")
    public class367 field4091;

    @OriginalMember(owner = "client!al", name = "G", descriptor = "Liu;")
    public static class517 field4090 = new class517(33, 8);

    @OriginalMember(owner = "client!al", name = "J", descriptor = "I")
    public static int field4093 = 0;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!al", name = "x", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!al", name = "y", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!al", name = "A", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!al", name = "B", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!al", name = "C", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!al", name = "D", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!al", name = "E", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!al", name = "F", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!al", name = "I", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!al", name = "K", descriptor = "I")
    public static int field4094;

    // $FF: synthetic field
    @OriginalMember(owner = "client!al", name = "L", descriptor = "Ljava/lang/Class;")
    public static Class field4095;

    // $FF: synthetic method
    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1800(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "()V", line = 7)
    public static final void method1796() {
        for (int var0 = 0; var0 < class73.field1363; var0++) {
            if (!class93.field1644[var0]) {
                class624 var1 = class477.field6820[var0];
                class637 var2 = var1.field8805;
                int var3 = var1.field8804;
                int var4 = var2.method3683(0) - class468.field6745;
                int var5 = (var4 * 2 >> class162.field2401) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method3681(-27102) - var4 >> class162.field2401;
                int var9 = var2.method3677(-26984) - var4 >> class162.field2401;
                int var10 = var2.method3677(-26984) + var4 >> class162.field2401;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class305.field4400) {
                    var10 = class305.field4400 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field8811[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class362.field5145) {
                        var16 = class362.field5145 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class360 var19 = class460.method2691(var3, var17, var11, field4095 == null ? (field4095 = method1800("tv")) : field4095);
                        if (var19 != null && var19.field5110 != 0) {
                            if (var19.field5110 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field8811[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field8811[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field8811[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field8811[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class93.field1644[var0] = true;
                class88.field1594[var3].method687(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILqa;Z)Lr;", line = 180)
    public final class519 method254(int arg0, class167 arg1, boolean arg2) {
        if (arg2) {
            return null;
        } else {
            field4087++;
            return null;
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)I", line = 193)
    public final int method264(int arg0) {
        if (arg0 != -25792) {
            method1799(false, null);
        }
        field4081++;
        return 0;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)I", line = 204)
    public final int method269(int arg0) {
        field4082++;
        if (arg0 != -13265) {
            field4090 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(IIIIILao;)V", line = 218)
    public class280(int arg0, int arg1, int arg2, int arg3, int arg4, class367 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class562.method3201((byte) 94, arg0, arg1));
        this.field4091 = arg5;
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(I)Z", line = 230)
    public final boolean method262(int arg0) {
        field4083++;
        if (arg0 != -21131) {
            this.field4091 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZLqa;)V", line = 241)
    public final void method268(boolean arg0, class167 arg1) {
        if (!arg0) {
            this.field4091 = null;
        }
        field4089++;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)I", line = 251)
    public final int method258(byte arg0) {
        if (arg0 != -36) {
            field4093 = 38;
        }
        field4077++;
        return 0;
    }

    @OriginalMember(owner = "client!al", name = "g", descriptor = "(I)V", line = 263)
    public static void method1797(int arg0) {
        if (arg0 < -63) {
            field4090 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lqa;I)Lbi;", line = 273)
    public final class465 method267(class167 arg0, int arg1) {
        if (arg1 != 2) {
            field4093 = -57;
        }
        field4084++;
        return null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;", line = 284)
    public static final String method1798(String arg0, String arg1, int arg2, String arg3) {
        if (arg2 != -29810) {
            field4093 = -93;
        }
        field4085++;
        for (int var4 = arg0.indexOf(arg1); var4 != -1; var4 = arg0.indexOf(arg1, var4 + arg3.length())) {
            arg0 = arg0.substring(0, var4) + arg3 + arg0.substring(arg1.length() + var4);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BLqa;II)Z", line = 305)
    public final boolean method263(byte arg0, class167 arg1, int arg2, int arg3) {
        field4086++;
        if (arg0 != 29) {
            method1797(-118);
        }
        return false;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lqa;B)V", line = 318)
    public final void method266(class167 arg0, byte arg1) {
        field4080++;
        if (arg1 != -40) {
            this.method263((byte) -121, null, -77, -81);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILqa;)V", line = 328)
    public final void method255(int arg0, class167 arg1) {
        field4078++;
        int var3 = -14 / ((arg0 + 46) / 42);
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(ILqa;)Lkm;", line = 341)
    public final class120 method260(int arg0, class167 arg1) {
        if (arg0 >= -50) {
            this.field4091 = null;
        }
        field4092++;
        return this.field4091.method260(-80, arg1);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 354)
    public static final void method1799(boolean arg0, String arg1) {
        field4079++;
        if (arg1 == null) {
            return;
        }
        if (!(class404.field6020 < 100 || class153.field2297) || class404.field6020 >= 200) {
            class83.method758((byte) 125, class476.field6809.method3220(false, class538.field7500));
            return;
        }
        String var2 = class596.method3403(arg1, -92);
        if (var2 == null) {
            return;
        }
        int var3 = 0;
        if (arg0) {
            method1796();
        }
        while (var3 < class404.field6020) {
            String var7 = class596.method3403(class534.field7454[var3], -92);
            if (var7 != null && var7.equals(var2)) {
                class83.method758((byte) 125, arg1 + class217.field3281.method3220(false, class538.field7500));
                return;
            }
            if (class301.field4344[var3] != null) {
                String var8 = class596.method3403(class301.field4344[var3], -67);
                if (var8 != null && var8.equals(var2)) {
                    class83.method758((byte) 125, arg1 + class217.field3281.method3220(false, class538.field7500));
                    return;
                }
            }
            var3++;
        }
        for (int var4 = 0; var4 < class511.field7081; var4++) {
            String var5 = class596.method3403(class290.field4198[var4], -105);
            if (var5 != null && var5.equals(var2)) {
                class83.method758((byte) 125, class25.field344.method3220(false, class538.field7500) + arg1 + class360.field5118.method3220(false, class538.field7500));
                return;
            }
            if (class293.field4223[var4] != null) {
                String var6 = class596.method3403(class293.field4223[var4], -102);
                if (var6 != null && var6.equals(var2)) {
                    class83.method758((byte) 125, class25.field344.method3220(false, class538.field7500) + arg1 + class360.field5118.method3220(arg0, class538.field7500));
                    return;
                }
            }
        }
        if (class596.method3403(class644.field9367.field5958, -104).equals(var2)) {
            class83.method758((byte) 125, class433.field6372.method3220(arg0, class538.field7500));
        } else {
            class624.method3537(-106, class642.field9301);
            class168.field2450++;
            class127.field2088.method1710(class51.method441((byte) -106, arg1), 107);
            class127.field2088.method1726((byte) -52, arg1);
        }
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V", line = 452)
    public final void method270(int arg0) {
        field4094++;
        int var2 = 3 % ((-arg0 - 1) / 47);
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(B)I", line = 465)
    public final int method261(byte arg0) {
        if (arg0 >= -116) {
            this.method261((byte) 20);
        }
        field4088++;
        return 0;
    }
}
