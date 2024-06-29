import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class330 extends class578 {

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public int field4503;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public int field4500;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    private int field4501;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "F")
    public float field4511;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    private int field4504;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public int field4513;

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4515 = new String[] { method2601(method2600("mc*!]")), method2601(method2600("mc*#]")), method2601(method2600("mc*&]")), method2601(method2600("mc*-]")), method2601(method2600("mc*\"]")), method2601(method2600("mc*/]")), method2601(method2600("mc*[\u001cwkpY]")), method2601(method2600("mc*$]")), method2601(method2600("mc*.]")) };

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    public static int field4506 = 0;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "Lsb;")
    public static class261 field4510 = new class261(10, -2);

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)I", line = 3)
    public final int method2590(byte arg0) {
        try {
            if (arg0 < 96) {
                return 62;
            } else {
                field4505++;
                return this.field4513;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4515[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)I", line = 17)
    public final int method2591(int arg0) {
        try {
            if (arg0 == 11062) {
                field4502++;
                return this.field4504;
            } else {
                return 24;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4515[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Z)I", line = 30)
    public final int method2592(boolean arg0) {
        try {
            if (!arg0) {
                this.field4511 = -1.2866424F;
            }
            field4509++;
            return this.field4500;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4515[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIII)V", line = 44)
    public static final void method2593(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field4507++;
            class505.method3861(arg1 ^ 0xFFFFFF80, arg6);
            int var7 = arg1;
            int var8 = arg6 - arg3;
            if (var8 < 0) {
                var8 = 0;
            }
            int var9 = arg6;
            int var10 = -arg6;
            int var11 = var8;
            int var12 = -var8;
            int var13 = -1;
            int var14 = -1;
            if (arg0 >= class557.field8113 && arg0 <= class50.field717) {
                int[] var15 = class529.field7682[arg0];
                int var16 = class679.method4875(class507.field7453, class335.field4844, arg4 - arg6, -1);
                int var17 = class679.method4875(class507.field7453, class335.field4844, arg4 + arg6, -1);
                int var18 = class679.method4875(class507.field7453, class335.field4844, arg4 - var8, ~arg1);
                int var19 = class679.method4875(class507.field7453, class335.field4844, arg4 + var8, arg1 + -1);
                class576.method4282(arg1 - 7, var16, arg5, var15, var18);
                class576.method4282(-7, var18, arg2, var15, var19);
                class576.method4282(-7, var19, arg5, var15, var17);
            }
            while (var7 < var9) {
                var14 += 2;
                var13 += 2;
                var12 += var14;
                var10 += var13;
                if (var12 >= 0 && var11 >= 1) {
                    var11--;
                    class740.field10522[var11] = var7;
                    var12 -= var11 << 1;
                }
                var7++;
                if (var10 >= 0) {
                    var9--;
                    var10 -= var9 << 1;
                    int var20 = arg0 - var9;
                    int var21 = arg0 + var9;
                    if (var21 >= class557.field8113 && class50.field717 >= var20) {
                        if (var9 >= var8) {
                            int var22 = class679.method4875(class507.field7453, class335.field4844, arg4 + var7, arg1 + -1);
                            int var23 = class679.method4875(class507.field7453, class335.field4844, arg4 - var7, -1);
                            if (var21 <= class50.field717) {
                                class576.method4282(-7, var23, arg5, class529.field7682[var21], var22);
                            }
                            if (var20 >= class557.field8113) {
                                class576.method4282(-7, var23, arg5, class529.field7682[var20], var22);
                            }
                        } else {
                            int var24 = class740.field10522[var9];
                            int var25 = class679.method4875(class507.field7453, class335.field4844, arg4 + var7, arg1 + -1);
                            int var26 = class679.method4875(class507.field7453, class335.field4844, arg4 - var7, -1);
                            int var27 = class679.method4875(class507.field7453, class335.field4844, arg4 + var24, -1);
                            int var28 = class679.method4875(class507.field7453, class335.field4844, arg4 - var24, -1);
                            if (class50.field717 >= var21) {
                                int[] var29 = class529.field7682[var21];
                                class576.method4282(-7, var26, arg5, var29, var28);
                                class576.method4282(-7, var28, arg2, var29, var27);
                                class576.method4282(-7, var27, arg5, var29, var25);
                            }
                            if (var20 >= class557.field8113) {
                                int[] var30 = class529.field7682[var20];
                                class576.method4282(-7, var26, arg5, var30, var28);
                                class576.method4282(-7, var28, arg2, var30, var27);
                                class576.method4282(-7, var27, arg5, var30, var25);
                            }
                        }
                    }
                }
                int var31 = arg0 - var7;
                int var32 = arg0 + var7;
                if (var32 >= class557.field8113 && var31 <= class50.field717) {
                    int var33 = arg4 + var9;
                    int var34 = arg4 - var9;
                    if (var33 >= class335.field4844 && class507.field7453 >= var34) {
                        int var35 = class679.method4875(class507.field7453, class335.field4844, var33, -1);
                        int var36 = class679.method4875(class507.field7453, class335.field4844, var34, -1);
                        if (var7 < var8) {
                            int var37 = var11 >= var7 ? var11 : class740.field10522[var7];
                            int var38 = class679.method4875(class507.field7453, class335.field4844, arg4 + var37, -1);
                            int var39 = class679.method4875(class507.field7453, class335.field4844, arg4 - var37, -1);
                            if (var32 <= class50.field717) {
                                int[] var40 = class529.field7682[var32];
                                class576.method4282(-7, var36, arg5, var40, var39);
                                class576.method4282(-7, var39, arg2, var40, var38);
                                class576.method4282(-7, var38, arg5, var40, var35);
                            }
                            if (var31 >= class557.field8113) {
                                int[] var41 = class529.field7682[var31];
                                class576.method4282(-7, var36, arg5, var41, var39);
                                class576.method4282(arg1 - 7, var39, arg2, var41, var38);
                                class576.method4282(-7, var38, arg5, var41, var35);
                            }
                        } else {
                            if (var32 <= class50.field717) {
                                class576.method4282(-7, var36, arg5, class529.field7682[var32], var35);
                            }
                            if (var31 >= class557.field8113) {
                                class576.method4282(-7, var36, arg5, class529.field7682[var31], var35);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var43) {
            throw class665.method4799(var43, field4515[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(B)I", line = 226)
    public final int method2594(byte arg0) {
        try {
            field4514++;
            if (arg0 != 21) {
                this.method2598(1.1098374F, 87);
            }
            return this.field4501;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4515[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(B)I", line = 240)
    public final int method2595(byte arg0) {
        try {
            int var2 = -6 / ((arg0 - 24) / 60);
            field4508++;
            return this.field4503;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4515[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)F", line = 256)
    public final float method2597(int arg0) {
        try {
            field4512++;
            if (arg0 != 2) {
                field4510 = null;
            }
            return this.field4511;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4515[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V", line = 270)
    public static void method2599(boolean arg0) {
        try {
            field4510 = null;
            if (!arg0) {
                field4510 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4515[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(IIIIIF)V", line = 282)
    public class330(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        try {
            this.field4503 = arg0;
            this.field4500 = arg2;
            this.field4501 = arg3;
            this.field4511 = arg5;
            this.field4504 = arg4;
            this.field4513 = arg1;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field4515[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)V")
    public abstract void method2596(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(FI)V")
    public abstract void method2598(float arg0, int arg1);

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2600(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x75);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2601(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 25;
                    break;
                case 1:
                    var10005 = 2;
                    break;
                case 2:
                    var10005 = 4;
                    break;
                case 3:
                    var10005 = 103;
                    break;
                default:
                    var10005 = 117;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
