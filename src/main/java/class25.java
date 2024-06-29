import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class25 {

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public int field416;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    private int field418;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "Lit;")
    public static class439 field413;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "Z")
    public static boolean field424;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BI)V", line = 5)
    public static final void method214(byte arg0, int arg1) {
        field412++;
        class338 var2 = class380.method2294((byte) 83, arg1, 1);
        int var3 = -51 / ((-arg0 - 31) / 50);
        var2.method2048(11);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V", line = 19)
    public static void method215(int arg0) {
        field413 = null;
        if (arg0 != 914818376) {
            field424 = false;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)V", line = 32)
    public final void method216(int arg0, byte arg1) {
        this.field418 = 0;
        this.field416 = arg0;
        field421++;
        if (arg1 <= 42) {
            field424 = false;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIB)Z", line = 44)
    public final boolean method217(int arg0, int arg1, int arg2, byte arg3) {
        field417++;
        int var5 = this.field418;
        if (this.field416 == arg1 && this.field418 == 0) {
            return false;
        }
        if (arg3 < 0) {
            method215(-88);
        }
        boolean var6;
        if (this.field418 == 0) {
            if (this.field416 < arg1 && (this.field416 + arg0) >= arg1 || arg1 < this.field416 && arg1 >= (this.field416 - arg0)) {
                this.field416 = arg1;
                return false;
            }
            var6 = true;
        } else if (this.field418 > 0 && arg1 > this.field416) {
            int var7 = this.field418 * this.field418 / (arg0 * 2);
            int var8 = this.field416 + var7;
            if (var8 < arg1 && var8 >= this.field416) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field418 < 0 && this.field416 > arg1) {
            int var9 = this.field418 * this.field418 / (arg0 * 2);
            int var10 = this.field416 - var9;
            if (var10 > arg1 && this.field416 >= var10) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (this.field416 >= arg1) {
                this.field418 -= arg0;
                if (arg2 != 0 && this.field418 < -arg2) {
                    this.field418 = -arg2;
                }
            } else {
                this.field418 += arg0;
                if (arg2 != 0 && arg2 < this.field418) {
                    this.field418 = arg2;
                }
            }
            if (this.field418 != var5) {
                int var11 = this.field418 * this.field418 / (arg0 * 2);
                if (arg1 <= this.field416) {
                    if (this.field416 > arg1 && arg1 > (this.field416 - var11)) {
                        this.field418 = var5;
                    }
                } else if (arg1 < (this.field416 + var11)) {
                    this.field418 = var5;
                }
            }
        } else if (this.field418 <= 0) {
            this.field418 += arg0;
            if (this.field418 > 0) {
                this.field418 = 0;
            }
        } else {
            this.field418 -= arg0;
            if (this.field418 < 0) {
                this.field418 = 0;
            }
        }
        this.field416 += this.field418 + var5 >> 1;
        return var6;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V", line = 182)
    public final void method218(int arg0) {
        int var2 = -20 % ((-arg0 - 40) / 60);
        this.field416 &= 0x3FFF;
        field423++;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "([[BBLuo;)V", line = 200)
    public static final void method219(byte[][] arg0, byte arg1, class388 arg2) {
        int var3 = 99 / ((15 - arg1) / 60);
        field414++;
        int[] var4 = new int[] { -1, 0, 0, 0, 0 };
        for (int var5 = 0; var5 < arg2.field115; var5++) {
            class498.method2992(0);
            for (int var6 = 0; var6 < (class362.field5442 >> 3); var6++) {
                for (int var7 = 0; var7 < class203.field2813 >> 3; var7++) {
                    boolean var8 = false;
                    int var9 = class159.field2072[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = var9 >> 24 & 0x3;
                        if (!arg2.field94 || var10 == 0) {
                            int var11 = (var9 & 0x6) >> 1;
                            int var12 = var9 >> 14 & 0x3FF;
                            int var13 = var9 >> 3 & 0x7FF;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; var15 < class76.field1081.length; var15++) {
                                if (class76.field1081[var15] == var14 && arg0[var15] != null) {
                                    class156 var16 = new class156(arg0[var15]);
                                    arg2.method54(var7 * 8, var10, var11, var5, var12, var13, class169.field2234, var16, -11968, var6 * 8);
                                    var8 = true;
                                    arg2.method2334(var4[0] == -1 ? var4 : null, var7 * 8, var11, var10, var5, var13, var12, var6 * 8, class481.field6937, var16, 4188);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        arg2.method53(98, var7 * 8, 8, var6 * 8, var5, 8);
                    }
                }
            }
        }
        if (var4[0] != -1) {
            class252.field3649 = class75.field1067.method2818(var4[0], class66.field988, var4[3], var4[2], 21929, var4[1]);
            class230.field3221 = var4[4];
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)Z", line = 293)
    public static final boolean method220(byte arg0) {
        field420++;
        return arg0 >= -20 ? true : class136.field1752;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 306)
    public static final String method221(int arg0, boolean arg1) {
        field419++;
        String var2 = Integer.toString(arg0);
        if (!arg1) {
            field424 = false;
        }
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class347.field5000.method1220(2969, class81.field1122) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class409.field5999.method1220(2969, class81.field1122) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)I", line = 336)
    public final int method222(int arg0) {
        field422++;
        if (arg0 != 16383) {
            method215(103);
        }
        return this.field416 & 0x3FFF;
    }
}
