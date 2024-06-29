import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class44 {

    @OriginalMember(owner = "client!vo", name = "o", descriptor = "Lkb;")
    private class721 field501;

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "Lgca;")
    private class261 field495;

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "I")
    public int field488;

    @OriginalMember(owner = "client!vo", name = "l", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "[B")
    public byte[] field491;

    @OriginalMember(owner = "client!vo", name = "q", descriptor = "I")
    private int field499;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
    private int field485;

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
    private int field483;

    @OriginalMember(owner = "client!vo", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field502 = new String[] { method456(method455("'9<I")), method456(method455("?#~a;")), method456(method455("2b~\u000bn")), method456(method455("?#~f;")), method456(method455("?#~\u0019z'%$\u001b;")), method456(method455("?#~`;")), method456(method455("?#~g;")), method456(method455("?#~b;")), method456(method455("?#~c;")), method456(method455("?#~m;")), method456(method455("?#~d;")) };

    @OriginalMember(owner = "client!vo", name = "p", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!vo", name = "n", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!vo", name = "m", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!vo", name = "r", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!vo", name = "s", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "[[Ldba;")
    private class98[][] field498;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)V", line = 6)
    public final void method447(int arg0) {
        try {
            field484++;
            this.field498 = new class98[this.field485][this.field483];
            for (int var2 = 0; var2 < this.field483; var2++) {
                for (int var3 = 0; var3 < this.field485; var3++) {
                    this.field498[var3][var2] = new class98(this.field495, this, this.field501, var3, var2, this.field499, var3 * 128 + 1, var2 * 128 + 1);
                    if (this.field498[var3][var2].field1442 == 0) {
                        this.field498[var3][var2] = null;
                    }
                }
            }
            int var4 = 24 % ((-arg0 - 3) / 58);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field502[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)V", line = 39)
    public static final void method448(int arg0) {
        try {
            field497++;
            if (arg0 > -117) {
                field494 = -21;
            }
            class563.field8190 = true;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field502[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIILr;)Z", line = 50)
    public final boolean method449(int arg0, int arg1, int arg2, class192 arg3) {
        try {
            field496++;
            class254 var5 = (class254) arg3;
            arg2 += var5.field3868 + 1;
            arg0 += var5.field3876 + 1;
            int var6 = arg0 + (this.field488 * arg2);
            int var7 = var5.field3872;
            int var8 = var5.field3878;
            if (arg2 <= 0) {
                int var9 = 1 - arg2;
                arg2 = 1;
                var7 -= var9;
                var6 += this.field488 * var9;
            }
            int var10 = this.field488 - var8;
            if (this.field487 <= arg2 + var7) {
                int var11 = var7 + arg2 + 1 - this.field487;
                var7 -= var11;
            }
            if (arg0 <= 0) {
                int var12 = 1 - arg0;
                var8 -= var12;
                arg0 = 1;
                var6 += var12;
                var10 += var12;
            }
            if ((arg0 + var8) >= this.field488) {
                int var13 = var8 + arg0 + 1 - this.field488;
                var10 += var13;
                var8 -= var13;
            }
            if (var8 <= 0 || var7 <= 0) {
                return false;
            }
            byte var14 = 8;
            if (arg1 > -91) {
                return false;
            } else {
                int var15 = (var14 - 1) * this.field488 + var10;
                return class111.method1018((byte) -80, var7, var8, var15, var14, var6, this.field491);
            }
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field502[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field502[0] : field502[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILr;ZI)V", line = 122)
    public final void method450(int arg0, class192 arg1, boolean arg2, int arg3) {
        try {
            field500++;
            if (!arg2) {
                this.field491 = null;
            }
            class254 var5 = (class254) arg1;
            arg3 += var5.field3876 + 1;
            arg0 += var5.field3868 + 1;
            int var6 = this.field488 * arg0 + arg3;
            int var7 = 0;
            int var8 = var5.field3872;
            int var9 = var5.field3878;
            int var10 = this.field488 - var9;
            if (arg0 <= 0) {
                int var11 = 1 - arg0;
                arg0 = 1;
                var7 += var9 * var11;
                var8 -= var11;
                var6 += this.field488 * var11;
            }
            int var12 = 0;
            if (this.field487 <= arg0 + var8) {
                int var13 = arg0 + var8 + 1 - this.field487;
                var8 -= var13;
            }
            if (arg3 <= 0) {
                int var14 = 1 - arg3;
                var6 += var14;
                var7 += var14;
                var9 -= var14;
                arg3 = 1;
                var12 += var14;
                var10 += var14;
            }
            if (this.field488 <= (arg3 + var9)) {
                int var15 = var9 + arg3 + 1 - this.field488;
                var12 += var15;
                var10 += var15;
                var9 -= var15;
            }
            if (var9 > 0 && var8 > 0) {
                class148.method1350(var8, var7, var10, 3, var9, this.field491, var12, var5.field3877, var6);
                this.method451(arg3, var8, -26, arg0, var9);
            }
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field502[6] + arg0 + ',' + (arg1 == null ? field502[0] : field502[2]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIII)V", line = 194)
    private final void method451(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field489++;
            if (this.field498 != null) {
                int var6 = 41 % ((arg2 - 41) / 51);
                int var7 = arg0 - 1 >> 7;
                int var8 = arg0 + arg4 - 1 - 1 >> 7;
                int var9 = arg3 - 1 >> 7;
                int var10 = arg1 + arg3 - 2 >> 7;
                for (int var11 = var7; var11 <= var8; var11++) {
                    class98[] var12 = this.field498[var11];
                    for (int var13 = var9; var13 <= var10; var13++) {
                        if (var12[var13] != null) {
                            var12[var13].field1451 = true;
                        }
                    }
                }
            }
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field502[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V", line = 237)
    public static final void method452(int arg0) {
        try {
            field490++;
            class679.method4946(-12284);
            int var1 = class623.field8996.field6366.method4750(true);
            if (var1 == 2) {
                class309.method2648(class662.field9437, class333.field5444, 100, arg0, class64.field881, 100);
            } else if (var1 == 3) {
                class263.method2289(0, class64.field881, class697.field10037, 2, class662.field9437, 2, class333.field5444, class606.field8737);
            }
            if (class623.field8996.field6366.method4752(3)) {
                class297.method2564(class442.field6902, 3);
            }
            if (class662.field9437 != null) {
                class279.method2394(-10660);
            }
            class200.field3163 = class623.field8996.field6366.method4750(true) != 0;
            class316.field5141 = class623.field8996.field6366.method4752(3);
            if (arg0 != 1) {
                method452(-36);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field502[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BILr;I)V", line = 289)
    public final void method453(byte arg0, int arg1, class192 arg2, int arg3) {
        try {
            field493++;
            class254 var5 = (class254) arg2;
            arg1 += var5.field3876 + 1;
            arg3 += var5.field3868 + 1;
            if (arg0 == -46) {
                int var6 = this.field488 * arg3 + arg1;
                int var7 = 0;
                int var8 = var5.field3872;
                int var9 = var5.field3878;
                int var10 = this.field488 - var9;
                if (arg3 <= 0) {
                    int var11 = 1 - arg3;
                    var7 += var9 * var11;
                    var6 += this.field488 * var11;
                    var8 -= var11;
                    arg3 = 1;
                }
                int var12 = 0;
                if (this.field487 <= arg3 + var8) {
                    int var13 = arg3 + var8 + 1 - this.field487;
                    var8 -= var13;
                }
                if (arg1 <= 0) {
                    int var14 = 1 - arg1;
                    var7 += var14;
                    var6 += var14;
                    var9 -= var14;
                    arg1 = 1;
                    var12 += var14;
                    var10 += var14;
                }
                if (arg1 + var9 >= this.field488) {
                    int var15 = arg1 + var9 + 1 - this.field488;
                    var12 += var15;
                    var10 += var15;
                    var9 -= var15;
                }
                if (var9 > 0 && var8 > 0) {
                    class10.method76(var12, var9, (byte) 68, var8, var5.field3877, var6, this.field491, var7, var10);
                    this.method451(arg1, var8, -20, arg3, var9);
                }
            }
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field502[7] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field502[0] : field502[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lgca;Lkb;)V", line = 361)
    public class44(class261 arg0, class721 arg1) {
        try {
            this.field501 = arg1;
            this.field495 = arg0;
            this.field488 = (this.field501.field4704 * this.field501.field4702 >> this.field495.field4210) + 2;
            this.field487 = (this.field501.field4702 * this.field501.field4697 >> this.field495.field4210) + 2;
            this.field491 = new byte[this.field488 * this.field487];
            this.field499 = this.field495.field4210 + 7 - this.field501.field4706;
            this.field485 = this.field501.field4704 >> this.field499;
            this.field483 = this.field501.field4697 >> this.field499;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field502[4] + (arg0 == null ? field502[0] : field502[2]) + ',' + (arg1 == null ? field502[0] : field502[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZIIII[[Z)V", line = 376)
    public final void method454(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean[][] arg5) {
        try {
            field492++;
            this.field495.method2241((byte) -30, false);
            this.field495.method2230((byte) 119, false);
            this.field495.method2254(1, 124);
            this.field495.method2258(arg1, (byte) -114);
            this.field495.method2263(false, -2, (byte) 93, false);
            float var7 = 1.0F / (float) (this.field495.field4159 * 128);
            if (arg0) {
                for (int var26 = 0; var26 < this.field483; var26++) {
                    int var27 = var26 << this.field499;
                    int var28 = var26 + 1 << this.field499;
                    label117: for (int var29 = 0; var29 < this.field485; var29++) {
                        if (this.field498[var29][var26] != null) {
                            int var30 = var29 << this.field499;
                            int var31 = var29 + 1 << this.field499;
                            for (int var32 = var30; var32 < var31; var32++) {
                                if ((-arg3) <= (var32 - arg2) && arg3 >= var32 - arg2) {
                                    for (int var33 = var27; var33 < var28; var33++) {
                                        if ((-arg3) <= (var33 - arg4) && var33 - arg4 <= arg3 && arg5[arg3 + var32 - arg2][var33 + arg3 - arg4]) {
                                            class615 var34 = this.field495.method2208((byte) -88);
                                            var34.method4486(6, var7, var7, 1.0F);
                                            var34.method2480(-var29, -var26, 0);
                                            this.field495.method2252(class428.field6751, true);
                                            this.field498[var29][var26].method940(arg1 - 1);
                                            continue label117;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                for (int var8 = 0; var8 < this.field483; var8++) {
                    int var9 = var8 << this.field499;
                    int var10 = var8 + 1 << this.field499;
                    for (int var11 = 0; var11 < this.field485; var11++) {
                        class98 var12 = this.field498[var11][var8];
                        if (var12 != null) {
                            class414 var13 = this.field495.method2276(arg1 - 116, var12.field1442 * 3);
                            Buffer var14 = var13.method3305(-117, true);
                            if (var14 != null) {
                                Stream var15 = this.field495.method2227(var14, (byte) 64);
                                int var16 = 0;
                                int var17 = var11 << this.field499;
                                int var18 = var11 + 1 << this.field499;
                                for (int var19 = var9; var19 < var10; var19++) {
                                    if (-arg3 <= var19 - arg4 && arg3 >= var19 - arg4) {
                                        int var20 = this.field501.field4704 * var19 + var17;
                                        for (int var21 = var17; var21 < var18; var21++) {
                                            if (var21 - arg2 >= -arg3 && arg3 >= (var21 - arg2) && arg5[var21 + arg3 - arg2][arg3 + var19 - arg4]) {
                                                short[] var22 = this.field501.field10553[var20];
                                                if (var22 != null) {
                                                    if (Stream.method5108()) {
                                                        for (int var24 = 0; var24 < var22.length; var24++) {
                                                            var15.method5104(var22[var24] & 0xFFFF);
                                                            var16++;
                                                        }
                                                    } else {
                                                        for (int var23 = 0; var23 < var22.length; var23++) {
                                                            var16++;
                                                            var15.method5101(var22[var23] & 0xFFFF);
                                                        }
                                                    }
                                                }
                                            }
                                            var20++;
                                        }
                                    }
                                }
                                var15.method5097();
                                if (var13.method3307(121) && var16 > 0) {
                                    class615 var25 = this.field495.method2208((byte) -58);
                                    var25.method4486(6, var7, var7, 1.0F);
                                    var25.method2480(-var11, -var8, 0);
                                    this.field495.method2252(class428.field6751, true);
                                    var12.method937((byte) -21, var13, var16 / 3);
                                }
                            }
                        }
                    }
                }
            }
            this.field495.method2238(arg1 - 32024);
        } catch (RuntimeException var36) {
            throw class590.method4333(var36, field502[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field502[0] : field502[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!vo", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method455(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x13);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vo", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method456(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 73;
                    break;
                case 1:
                    var10005 = 76;
                    break;
                case 2:
                    var10005 = 80;
                    break;
                case 3:
                    var10005 = 37;
                    break;
                default:
                    var10005 = 19;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
