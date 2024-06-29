import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class322 extends class271 {

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "Lri;")
    public static class73 field4614 = new class73(29, 3);

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "[B")
    public static byte[] field4616 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "Lwa;")
    private class433 field4609;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "([BIB)[B")
    public static final byte[] method1995(byte[] arg0, int arg1, byte arg2) {
        field4612++;
        byte[] var3 = new byte[arg1];
        if (arg2 > -49) {
            method1995(null, 92, (byte) -21);
        }
        class520.method3071(arg0, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILdh;)V")
    private final void method1996(int arg0, int arg1, class209 arg2) {
        field4611++;
        if (arg1 >= -22) {
            this.field4609 = null;
        }
        if (arg0 != 249) {
            return;
        }
        int var4 = arg2.method1428(32122);
        if (this.field4609 == null) {
            int var5 = class476.method2841(var4, true);
            this.field4609 = new class433(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg2.method1428(32122) == 1;
            int var8 = arg2.method1458((byte) -10);
            class337 var9;
            if (var7) {
                var9 = new class141(arg2.method1449(76));
            } else {
                var9 = new class427(arg2.method1452(65280));
            }
            this.field4609.method2606(var9, (long) var8, 0);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILdt;Lqa;IILcn;)Z")
    public static final boolean method1997(int arg0, class158 arg1, class162 arg2, int arg3, int arg4, class355 arg5) {
        field4613++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg1.field2327 != null) {
            var8 = class460.field6826 - ((arg1.field2342 + arg5.field5458 - class460.field6835) * (class460.field6826 - class460.field6828) / (class460.field6834 - class460.field6835));
            var6 = (arg5.field5465 + arg1.field2310 - class460.field6817) * (class460.field6822 - class460.field6836) / (class460.field6832 - class460.field6817) + class460.field6836;
            var9 = class460.field6826 - (class460.field6826 - class460.field6828) * (arg5.field5458 + arg1.field2302 - class460.field6835) / (class460.field6834 - class460.field6835);
            var7 = (arg1.field2306 + arg5.field5465 - class460.field6817) * (class460.field6822 - class460.field6836) / (class460.field6832 - class460.field6817) + class460.field6836;
        }
        class529 var10 = null;
        int var11 = 0;
        int var12 = arg0;
        int var13 = 0;
        int var14 = 0;
        if (arg1.field2315 != -1) {
            if (arg5.field5463 && arg1.field2329 != -1) {
                var10 = arg1.method1007(arg2, -25598, true);
            } else {
                var10 = arg1.method1007(arg2, -25598, false);
            }
            if (var10 != null) {
                var11 = arg5.field5466 - (var10.method105() + 1 >> 1);
                var12 = arg5.field5466 + (var10.method105() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                if (var7 < var12) {
                    var7 = var12;
                }
                var13 = arg5.field5462 - (var10.method100() + 1 >> 1);
                if (var8 > var13) {
                    var8 = var13;
                }
                var14 = arg5.field5462 + (var10.method100() + 1 >> 1);
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class362 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg1.field2339 != null) {
            var15 = class342.method2087(true, arg1.field2314);
            if (var15 != null) {
                var16 = class343.field4952.method1805(arg0 ^ 0xFFFFFF9B, null, arg1.field2339, null, class34.field361);
                int var23 = arg5.field5462;
                if (var10 == null) {
                    var17 = var23 - var16 * var15.method2258() / 2;
                } else {
                    var17 = var23 - ((var10.method100() >> 1) + var15.method2256() * var16);
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class34.field361[var24];
                    if (var16 - 1 > var24) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method2259(var25);
                    if (var26 > var18) {
                        var18 = var26;
                    }
                }
                var19 = arg3 + arg5.field5466 - (var18 / 2);
                if (var6 > var19) {
                    var6 = var19;
                }
                var20 = var18 / 2 + arg5.field5466 + arg3;
                var21 = arg4 + var17;
                if (var20 > var7) {
                    var7 = var20;
                }
                var22 = arg4 + var15.method2256() * var16 + var17;
                if (var8 > var21) {
                    var8 = var21;
                }
                if (var22 > var9) {
                    var9 = var22;
                }
            }
        }
        if (class460.field6836 > var7 || class460.field6822 < var6 || var9 < class460.field6828 || class460.field6826 < var8) {
            return true;
        }
        if (arg1.field2327 != null) {
            int[] var27 = new int[arg1.field2327.length];
            for (int var28 = 0; var28 < (var27.length / 2); var28++) {
                int var30 = arg1.field2327[var28 * 2] + arg5.field5465;
                int var31 = arg1.field2327[var28 * 2 + 1] + arg5.field5458;
                var27[var28 * 2] = (var30 - class460.field6817) * (class460.field6822 - class460.field6836) / (class460.field6832 - class460.field6817) + class460.field6836;
                var27[var28 * 2 + 1] = class460.field6826 - ((var31 - class460.field6835) * (class460.field6826 - class460.field6828) / (class460.field6834 - class460.field6835));
            }
            class206.method1389(arg2, var27, arg1.field2305);
            for (int var29 = 0; var29 < var27.length / 2 - 1; var29++) {
                arg2.method1029(var27[var29 * 2 + 2], var27[var29 * 2 + 1], (byte) 65, var27[var29 * 2], var27[var29 * 2 + 3], arg1.field2341);
            }
            arg2.method1029(var27[0], var27[var27.length - 1], (byte) 65, var27[var27.length - 2], var27[1], arg1.field2341);
        }
        if (var10 != null) {
            if (class259.field3816 > 0 && (class497.field7333 != -1 && class497.field7333 == arg5.field5459 || class101.field1467 != -1 && class101.field1467 == arg1.field2319)) {
                int var32;
                if (class116.field1759 <= 50) {
                    var32 = class116.field1759 * 2;
                } else {
                    var32 = 200 - (class116.field1759 * 2);
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg2.method1046(var10.method108() / 2 + 7, 23304, arg5.field5466, arg5.field5462, var33);
                arg2.method1046(var10.method108() / 2 + 5, 23304, arg5.field5466, arg5.field5462, var33);
                arg2.method1046(var10.method108() / 2 + 3, 23304, arg5.field5466, arg5.field5462, var33);
                arg2.method1046(var10.method108() / 2 + 1, 23304, arg5.field5466, arg5.field5462, var33);
                arg2.method1046(var10.method108() / 2, 23304, arg5.field5466, arg5.field5462, var33);
            }
            var10.method3121(arg5.field5466 - (var10.method105() >> 1), arg5.field5462 - (var10.method100() >> 1));
        }
        if (arg1.field2339 != null && var15 != null) {
            class366.method2275(var18, var17, arg5, arg2, arg1, var15, var16, (byte) -99);
        }
        if (arg1.field2315 != -1 || arg1.field2339 != null) {
            class325 var34 = new class325(arg5);
            var34.field4641 = var13;
            var34.field4639 = var21;
            var34.field4634 = var14;
            var34.field4645 = var12;
            var34.field4633 = var11;
            var34.field4632 = var22;
            var34.field4643 = var20;
            var34.field4635 = var19;
            class365.field5583.method809(var34, false);
        }
        return false;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V")
    public static final void method1998(boolean arg0) {
        if (arg0) {
            method1995(null, -108, (byte) -47);
        }
        field4608++;
        if (!class444.field6615) {
            return;
        }
        while (true) {
            while (class474.field6986 < class92.field1377.length) {
                class412 var1 = class92.field1377[class474.field6986];
                if (var1 != null && var1.field6191 == -1) {
                    if (class367.field5610 == null) {
                        class367.field5610 = class458.field6776.method1346(var1.field6193, (byte) 127);
                    }
                    int var2 = class367.field5610.field1794;
                    if (var2 == -1) {
                        return;
                    }
                    class367.field5610 = null;
                    class474.field6986++;
                    var1.field6191 = var2;
                } else {
                    class474.field6986++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZI)I")
    public final int method1999(int arg0, boolean arg1, int arg2) {
        field4610++;
        if (this.field4609 == null) {
            return arg0;
        } else if (arg1) {
            return -77;
        } else {
            class427 var4 = (class427) this.field4609.method2605(arg1, (long) arg2);
            return var4 == null ? arg0 : var4.field6402;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public static void method2000(int arg0) {
        field4614 = null;
        if (arg0 <= 6) {
            method1997(3, null, null, -105, 80, null);
        }
        field4616 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILdh;)V")
    public final void method2001(int arg0, class209 arg1) {
        while (true) {
            int var3 = arg1.method1428(32122);
            if (var3 == 0) {
                field4607++;
                int var4 = -9 / ((arg0 - 13) / 33);
                return;
            }
            this.method1996(var3, -28, arg1);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
    public final String method2002(String arg0, int arg1, int arg2) {
        if (arg1 != 2) {
            field4616 = null;
        }
        field4615++;
        if (this.field4609 == null) {
            return arg0;
        } else {
            class141 var4 = (class141) this.field4609.method2605(false, (long) arg2);
            return var4 == null ? arg0 : var4.field2110;
        }
    }

    static {
        new class475("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
    }
}
