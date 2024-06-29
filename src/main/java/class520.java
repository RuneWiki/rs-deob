import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hja")
public class class520 {

    @OriginalMember(owner = "client!hja", name = "c", descriptor = "Lui;")
    private class251 field7591 = new class251(64);

    @OriginalMember(owner = "client!hja", name = "d", descriptor = "Llga;")
    private class47 field7590;

    @OriginalMember(owner = "client!hja", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7594 = new String[] { method3959(method3958("rx@*M2")), method3959(method3958("rx@*H2")), method3959(method3958("rx@*K2")), method3959(method3958("tgMh")), method3959(method3958("a<\u000f*r")), method3959(method3958("rx@*L2")), method3959(method3958("rx@*3s|Hp12")), method3959(method3958("rx@*I2")), method3959(method3958("rx@*N2")), method3959(method3958("rx@*J2")) };

    @OriginalMember(owner = "client!hja", name = "h", descriptor = "Ldp;")
    public static class514 field7588 = new class514();

    @OriginalMember(owner = "client!hja", name = "b", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!hja", name = "f", descriptor = "I")
    public static int field7586;

    @OriginalMember(owner = "client!hja", name = "i", descriptor = "I")
    public static int field7587;

    @OriginalMember(owner = "client!hja", name = "e", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!hja", name = "j", descriptor = "I")
    public static int field7592;

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "I")
    public static int field7593;

    @OriginalMember(owner = "client!hja", name = "g", descriptor = "Lcd;")
    public static class161 field7584;

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(BI)Ldv;")
    public final class32 method3951(byte arg0, int arg1) {
        try {
            field7587++;
            class251 var3 = this.field7591;
            class32 var4;
            synchronized (this.field7591) {
                var4 = (class32) this.field7591.method2053(0, (long) arg1);
            }
            if (var4 != null) {
                return var4;
            }
            class47 var5 = this.field7590;
            byte[] var6;
            synchronized (this.field7590) {
                var6 = this.field7590.method512(arg1, 54, (byte) -111);
            }
            class32 var7 = new class32();
            if (var6 != null) {
                var7.method341(1024, new class711(var6));
            }
            if (arg0 > -100) {
                field7588 = null;
            }
            class251 var8 = this.field7591;
            synchronized (this.field7591) {
                this.field7591.method2051((long) arg1, var7, 93);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field7594[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(Lfl;I[[B)V")
    public static final void method3952(class794 arg0, int arg1, byte[][] arg2) {
        try {
            for (int var3 = 0; var3 < arg0.field440; var3++) {
                class635.method4633(89);
                for (int var4 = 0; var4 < class625.field8929 >> 3; var4++) {
                    for (int var5 = 0; var5 < (class14.field187 >> 3); var5++) {
                        int var6 = class634.field8995[var3][var4][var5];
                        if (var6 != -1) {
                            int var7 = var6 >> 24 & 0x3;
                            if (!arg0.field458 || var7 == 0) {
                                int var8 = var6 >> 1 & 0x3;
                                int var9 = var6 >> 14 & 0x3FF;
                                int var10 = (var6 & 0x3FFD) >> 3;
                                int var11 = (var9 / 8 << 8) + (var10 / 8);
                                for (int var12 = 0; var12 < class136.field1754.length; var12++) {
                                    if (class136.field1754[var12] == var11 && arg2[var12] != null) {
                                        class711 var13 = new class711(arg2[var12]);
                                        arg0.method365(var5 * 8, true, var10, var7, var13, var9, var4 * 8, class195.field2919, var3, var8);
                                        arg0.method5721(var13, var8, var9, var10, var7, var4 * 8, class236.field3418, (byte) 100, var3, var5 * 8);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            field7593++;
            int var14 = 0;
            if (arg1 != 3967) {
                field7588 = null;
            }
            while (var14 < arg0.field440) {
                class635.method4633(92);
                for (int var15 = 0; var15 < class625.field8929 >> 3; var15++) {
                    for (int var16 = 0; var16 < (class14.field187 >> 3); var16++) {
                        int var17 = class634.field8995[var14][var15][var16];
                        if (var17 == -1) {
                            arg0.method369(8, var14, var16 * 8, var15 * 8, -1, 8);
                        }
                    }
                }
                var14++;
            }
        } catch (RuntimeException var19) {
            throw class665.method4799(var19, field7594[7] + (arg0 == null ? field7594[3] : field7594[4]) + ',' + arg1 + ',' + (arg2 == null ? field7594[3] : field7594[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(BLha;ZI)Lee;")
    public static final class488 method3953(byte arg0, class18 arg1, boolean arg2, int arg3) {
        try {
            if (arg0 != 40) {
                return null;
            }
            field7585++;
            if (arg3 == -1) {
                return null;
            }
            if (class15.field198 != null) {
                for (int var4 = 0; var4 < class15.field198.length; var4++) {
                    if (class15.field198[var4] == arg3) {
                        return class467.field6810[var4];
                    }
                }
            }
            class488 var5 = (class488) class550.field8036.method2053(0, (long) arg3);
            if (var5 != null) {
                if (arg2 && var5.field7159 == null) {
                    class161 var6 = class692.method4940(arg3, class234.field3383, 3);
                    if (var6 == null) {
                        return null;
                    }
                    var5.field7159 = var6;
                }
                return var5;
            }
            class66[] var7 = class66.method702(class796.field11569, arg3);
            if (var7 == null) {
                return null;
            }
            class161 var8 = class692.method4940(arg3, class234.field3383, 3);
            if (var8 == null) {
                return null;
            }
            class488 var9;
            if (arg2) {
                var9 = new class488(arg1.method145(var8, var7, true), var8);
            } else {
                var9 = new class488(arg1.method145(var8, var7, true));
            }
            class550.field8036.method2051((long) arg3, var9, 93);
            return var9;
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field7594[2] + arg0 + ',' + (arg1 == null ? field7594[3] : field7594[4]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!hja", name = "c", descriptor = "(I)V")
    public static void method3954(int arg0) {
        try {
            if (arg0 != -676427229) {
                field7588 = null;
            }
            field7584 = null;
            field7588 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7594[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hja", name = "b", descriptor = "(I)V")
    public final void method3955(int arg0) {
        try {
            class251 var2 = this.field7591;
            synchronized (this.field7591) {
                this.field7591.method2043(false);
                if (arg0 != -4578) {
                    field7584 = null;
                }
            }
            field7592++;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7594[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(I)V")
    public final void method3956(int arg0) {
        try {
            field7589++;
            class251 var2 = this.field7591;
            synchronized (this.field7591) {
                this.field7591.method2047(11914);
            }
            if (arg0 > -4) {
                this.field7590 = null;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7594[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(II)V")
    public final void method3957(int arg0, int arg1) {
        try {
            class251 var3 = this.field7591;
            synchronized (this.field7591) {
                this.field7591.method2038(arg0, arg1);
            }
            field7586++;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field7594[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hja", name = "<init>", descriptor = "(Lfs;ILlga;)V")
    public class520(class796 arg0, int arg1, class47 arg2) {
        try {
            this.field7590 = arg2;
            if (this.field7590 != null) {
                this.field7590.method509(true, 54);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7594[6] + (arg0 == null ? field7594[3] : field7594[4]) + ',' + arg1 + ',' + (arg2 == null ? field7594[3] : field7594[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!hja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3958(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xF);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3959(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 26;
                    break;
                case 1:
                    var10005 = 18;
                    break;
                case 2:
                    var10005 = 33;
                    break;
                case 3:
                    var10005 = 4;
                    break;
                default:
                    var10005 = 15;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
