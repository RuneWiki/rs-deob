import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class174 extends class631 {

    @OriginalMember(owner = "client!cda", name = "r", descriptor = "Ltba;")
    public static class165 field2414 = new class165(16);

    @OriginalMember(owner = "client!cda", name = "l", descriptor = "F")
    public float field2408;

    @OriginalMember(owner = "client!cda", name = "n", descriptor = "F")
    public float field2410;

    @OriginalMember(owner = "client!cda", name = "o", descriptor = "F")
    public float field2411;

    @OriginalMember(owner = "client!cda", name = "p", descriptor = "F")
    public float field2412;

    @OriginalMember(owner = "client!cda", name = "z", descriptor = "F")
    public float field2422;

    @OriginalMember(owner = "client!cda", name = "B", descriptor = "F")
    public float field2424;

    @OriginalMember(owner = "client!cda", name = "D", descriptor = "F")
    public float field2426;

    @OriginalMember(owner = "client!cda", name = "I", descriptor = "F")
    public float field2431;

    @OriginalMember(owner = "client!cda", name = "L", descriptor = "F")
    public float field2434;

    @OriginalMember(owner = "client!cda", name = "M", descriptor = "F")
    public float field2435;

    @OriginalMember(owner = "client!cda", name = "P", descriptor = "F")
    public float field2438;

    @OriginalMember(owner = "client!cda", name = "Q", descriptor = "F")
    public float field2439;

    @OriginalMember(owner = "client!cda", name = "m", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!cda", name = "q", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!cda", name = "s", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!cda", name = "t", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!cda", name = "u", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!cda", name = "v", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!cda", name = "w", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!cda", name = "x", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!cda", name = "y", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!cda", name = "A", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!cda", name = "C", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!cda", name = "E", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!cda", name = "F", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!cda", name = "G", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!cda", name = "H", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!cda", name = "K", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!cda", name = "N", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!cda", name = "O", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!cda", name = "J", descriptor = "Lrea;")
    public static class210 field2432;

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "(III[I)V", line = 4)
    public final void method599(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg0 - this.field2411);
        int var6 = (int) ((float) arg2 - this.field2434);
        field2436++;
        int var7 = (int) ((float) arg1 - this.field2408);
        arg3[0] = (int) ((float) var6 * this.field2412 + (float) var5 * this.field2422 + (float) var7 * this.field2438);
        arg3[2] = (int) ((float) var6 * this.field2426 + (float) var5 * this.field2431 + (float) var7 * this.field2410);
        arg3[1] = (int) ((float) var6 * this.field2435 + (float) var5 * this.field2424 + (float) var7 * this.field2439);
    }

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "(I)V", line = 21)
    public final void method601(int arg0) {
        field2427++;
        float var2 = class66.field946[arg0 & 0x3FFF];
        float var3 = class66.field951[arg0 & 0x3FFF];
        float var4 = this.field2438;
        float var5 = this.field2439;
        float var6 = this.field2410;
        float var7 = this.field2408;
        this.field2438 = var2 * var4 - this.field2412 * var3;
        this.field2412 = this.field2412 * var2 + var3 * var4;
        this.field2439 = var2 * var5 - (this.field2435 * var3);
        this.field2435 = this.field2435 * var2 + var3 * var5;
        this.field2410 = var2 * var6 - this.field2426 * var3;
        this.field2426 = this.field2426 * var2 + var3 * var6;
        this.field2408 = var2 * var7 - this.field2434 * var3;
        this.field2434 = this.field2434 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lpda;)V", line = 62)
    public final void method604(class631 arg0) {
        field2417++;
        class174 var2 = (class174) arg0;
        this.field2435 = var2.field2435;
        this.field2426 = var2.field2426;
        this.field2439 = var2.field2439;
        this.field2411 = var2.field2411;
        this.field2434 = var2.field2434;
        this.field2431 = var2.field2431;
        this.field2410 = var2.field2410;
        this.field2424 = var2.field2424;
        this.field2422 = var2.field2422;
        this.field2408 = var2.field2408;
        this.field2412 = var2.field2412;
        this.field2438 = var2.field2438;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "()Lpda;", line = 83)
    public final class631 method611() {
        field2428++;
        class174 var1 = new class174();
        var1.field2438 = this.field2438;
        var1.field2424 = this.field2424;
        var1.field2412 = this.field2412;
        var1.field2431 = this.field2431;
        var1.field2434 = this.field2434;
        var1.field2411 = this.field2411;
        var1.field2435 = this.field2435;
        var1.field2426 = this.field2426;
        var1.field2408 = this.field2408;
        var1.field2439 = this.field2439;
        var1.field2410 = this.field2410;
        var1.field2422 = this.field2422;
        return var1;
    }

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "()V", line = 106)
    public final void method595() {
        this.field2422 = this.field2439 = this.field2426 = 1.0F;
        field2437++;
        this.field2438 = this.field2412 = this.field2424 = this.field2435 = this.field2431 = this.field2410 = this.field2411 = this.field2408 = this.field2434 = 0.0F;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(III)V", line = 115)
    public final void method596(int arg0, int arg1, int arg2) {
        this.field2408 = arg1;
        this.field2438 = this.field2412 = this.field2424 = this.field2435 = this.field2431 = this.field2410 = 0.0F;
        this.field2422 = this.field2439 = this.field2426 = 1.0F;
        field2419++;
        this.field2411 = arg0;
        this.field2434 = arg2;
    }

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "(III[I)V", line = 131)
    public final void method593(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field2410 + (float) arg0 * this.field2438 + (float) arg1 * this.field2439);
        arg3[2] = (int) ((float) arg2 * this.field2426 + (float) arg0 * this.field2412 + (float) arg1 * this.field2435);
        arg3[0] = (int) ((float) arg2 * this.field2431 + (float) arg0 * this.field2422 + (float) arg1 * this.field2424);
        field2421++;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V", line = 142)
    public final void method594(int arg0) {
        field2416++;
        float var2 = class66.field946[arg0 & 0x3FFF];
        float var3 = class66.field951[arg0 & 0x3FFF];
        float var4 = this.field2422;
        float var5 = this.field2424;
        float var6 = this.field2431;
        float var7 = this.field2411;
        this.field2422 = this.field2412 * var3 + var2 * var4;
        this.field2424 = this.field2435 * var3 + var2 * var5;
        this.field2412 = this.field2412 * var2 - var3 * var4;
        this.field2435 = this.field2435 * var2 - var3 * var5;
        this.field2431 = this.field2426 * var3 + var2 * var6;
        this.field2411 = this.field2434 * var3 + var2 * var7;
        this.field2426 = this.field2426 * var2 - (var3 * var6);
        this.field2434 = this.field2434 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(III[I)V", line = 171)
    public final void method606(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field2431 + (float) arg0 * this.field2422 + (float) arg1 * this.field2424 + this.field2411);
        field2425++;
        arg3[2] = (int) ((float) arg2 * this.field2426 + (float) arg0 * this.field2412 + (float) arg1 * this.field2435 + this.field2434);
        arg3[1] = (int) ((float) arg2 * this.field2410 + (float) arg0 * this.field2438 + (float) arg1 * this.field2439 + this.field2408);
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIIIII)V", line = 197)
    public final void method592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2409++;
        float var7 = class66.field946[arg3 & 0x3FFF];
        float var8 = class66.field951[arg3 & 0x3FFF];
        float var9 = class66.field946[arg4 & 0x3FFF];
        float var10 = class66.field951[arg4 & 0x3FFF];
        float var11 = class66.field946[arg5 & 0x3FFF];
        float var12 = class66.field951[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field2426 = var7 * var9;
        this.field2412 = var7 * var10;
        this.field2435 = -var8;
        this.field2438 = -var9 * var12 + var10 * var13;
        this.field2439 = var7 * var11;
        this.field2410 = var9 * var13 + var10 * var12;
        this.field2424 = var7 * var12;
        this.field2422 = var9 * var11 + var10 * var14;
        this.field2431 = -var10 * var11 + var9 * var14;
        this.field2408 = (float) (-arg0) * this.field2438 - ((float) arg1 * this.field2439) - (float) arg2 * this.field2410;
        this.field2411 = (float) (-arg0) * this.field2422 - (float) arg1 * this.field2424 - (float) arg2 * this.field2431;
        this.field2434 = (float) (-arg0) * this.field2412 - ((float) arg1 * this.field2435) - ((float) arg2 * this.field2426);
    }

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "(I)V", line = 233)
    public final void method590(int arg0) {
        this.field2422 = 1.0F;
        field2413++;
        this.field2439 = this.field2426 = class66.field946[arg0 & 0x3FFF];
        this.field2435 = class66.field951[arg0 & 0x3FFF];
        this.field2410 = -this.field2435;
        this.field2424 = this.field2431 = this.field2411 = this.field2438 = this.field2408 = this.field2412 = this.field2434 = 0.0F;
    }

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "(III)V", line = 246)
    public final void method600(int arg0, int arg1, int arg2) {
        this.field2408 += arg1;
        field2430++;
        this.field2411 += arg0;
        this.field2434 += arg2;
    }

    @OriginalMember(owner = "client!cda", name = "h", descriptor = "(I)V", line = 258)
    public static void method1196(int arg0) {
        field2432 = null;
        field2414 = null;
        if (arg0 <= 45) {
            method1196(66);
        }
    }

    @OriginalMember(owner = "client!cda", name = "g", descriptor = "(I)V", line = 269)
    public final void method608(int arg0) {
        field2418++;
        float var2 = class66.field946[arg0 & 0x3FFF];
        float var3 = class66.field951[arg0 & 0x3FFF];
        float var4 = this.field2422;
        float var5 = this.field2424;
        float var6 = this.field2431;
        float var7 = this.field2411;
        this.field2422 = var2 * var4 - this.field2438 * var3;
        this.field2424 = var2 * var5 - this.field2439 * var3;
        this.field2438 = this.field2438 * var2 + var3 * var4;
        this.field2439 = this.field2439 * var2 + var3 * var5;
        this.field2431 = var2 * var6 - (this.field2410 * var3);
        this.field2411 = var2 * var7 - this.field2408 * var3;
        this.field2410 = this.field2410 * var2 + var3 * var6;
        this.field2408 = this.field2408 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(ILvl;Z)V", line = 302)
    public static final void method1197(int arg0, class13 arg1, boolean arg2) {
        field2429++;
        class738 var3 = arg1.method94((byte) -125);
        if (arg1.field263 == 0) {
            arg1.field268 = 0;
            class550.field7691 = -1;
            class751.field10492 = 0;
            return;
        }
        if (arg1.field153 != -1 && arg1.field171 == 0) {
            class56 var4 = class66.field941.method1299((byte) -85, arg1.field153);
            if (arg1.field266 > 0 && var4.field780 == 0) {
                arg1.field268++;
                class550.field7691 = -1;
                class751.field10492 = 0;
                return;
            }
            if (arg1.field266 <= 0 && var4.field778 == 0) {
                arg1.field268++;
                class751.field10492 = 0;
                class550.field7691 = -1;
                return;
            }
        }
        if (arg1.field160 != -1 && arg1.field229 <= class463.field6224) {
            class164 var5 = class234.field3057.method2095(arg1.field160, (byte) -125);
            if (var5.field2267 && var5.field2276 != -1) {
                class56 var6 = class66.field941.method1299((byte) -117, var5.field2276);
                if (arg1.field266 > 0 && var6.field780 == 0) {
                    class550.field7691 = -1;
                    arg1.field268++;
                    class751.field10492 = 0;
                    return;
                }
                if (arg1.field266 <= 0 && var6.field778 == 0) {
                    class751.field10492 = 0;
                    class550.field7691 = -1;
                    arg1.field268++;
                    return;
                }
            }
        }
        if (arg1.field160 != -1 && arg1.field229 <= class463.field6224) {
            class164 var7 = class234.field3057.method2095(arg1.field160, (byte) 60);
            if (var7.field2267 && var7.field2276 != -1) {
                class56 var8 = class66.field941.method1299((byte) -124, var7.field2276);
                if (arg1.field266 > 0 && var8.field780 == 0) {
                    arg1.field268++;
                    class550.field7691 = -1;
                    class751.field10492 = 0;
                    return;
                }
                if (arg1.field266 <= 0 && var8.field778 == 0) {
                    class751.field10492 = 0;
                    class550.field7691 = -1;
                    arg1.field268++;
                    return;
                }
            }
        }
        int var9 = arg1.field5801;
        int var10 = arg1.field5797;
        int var11 = arg1.field264[arg1.field263 - 1] * 512 + arg1.method82((byte) 49) * 256;
        int var12 = arg1.field260[arg1.field263 - 1] * 512 + arg1.method82((byte) 49) * 256;
        if (arg0 != -11299) {
            return;
        }
        if (var9 < var11) {
            if (var12 > var10) {
                arg1.method90(10240, (byte) -18);
            } else if (var10 <= var12) {
                arg1.method90(12288, (byte) -18);
            } else {
                arg1.method90(14336, (byte) -18);
            }
        } else if (var9 <= var11) {
            if (var12 > var10) {
                arg1.method90(8192, (byte) -18);
            } else if (var10 > var12) {
                arg1.method90(0, (byte) -18);
            }
        } else if (var10 < var12) {
            arg1.method90(6144, (byte) -18);
        } else if (var10 <= var12) {
            arg1.method90(4096, (byte) -18);
        } else {
            arg1.method90(2048, (byte) -18);
        }
        byte var13 = arg1.field259[arg1.field263 - 1];
        if (!arg2 && var11 - var9 > 1024 || (var11 - var9) < -1024 || var12 - var10 > 1024 || var12 - var10 < -1024) {
            arg1.field5801 = var11;
            arg1.field5797 = var12;
            arg1.method86(-7554, false, arg1.field194);
            class751.field10492 = 0;
            if (arg1.field266 > 0) {
                arg1.field266--;
            }
            class550.field7691 = -1;
            arg1.field263--;
            return;
        }
        int var14 = 16;
        boolean var15 = true;
        if (arg1 instanceof class733) {
            var15 = ((class733) arg1).field10192.field1875;
        }
        if (var15) {
            int var16 = arg1.field194 - arg1.field256.field2032;
            if (var16 != 0 && arg1.field221 == -1 && arg1.field253 != 0) {
                var14 = 8;
            }
            if (!arg2 && arg1.field263 > 2) {
                var14 = 24;
            }
            if (!arg2 && arg1.field263 > 3) {
                var14 = 32;
            }
        } else {
            if (!arg2 && arg1.field263 > 1) {
                var14 = 24;
            }
            if (!arg2 && arg1.field263 > 2) {
                var14 = 32;
            }
        }
        if (arg1.field268 > 0 && arg1.field263 > 1) {
            arg1.field268--;
            var14 = 32;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        if (var3.field10271 != -1) {
            int var17 = var14 << 9;
            if (arg1.field263 == 1) {
                int var18 = arg1.field265 * arg1.field265;
                int var19 = (var11 < arg1.field5801 ? arg1.field5801 - var11 : -arg1.field5801 + var11) << 9;
                int var20 = (var12 >= arg1.field5797 ? var12 - arg1.field5797 : -var12 + arg1.field5797) << 9;
                int var21 = var19 <= var20 ? var20 : var19;
                int var22 = var3.field10271 * 2 * var21;
                if (var18 > var22) {
                    arg1.field265 /= 2;
                } else if (var21 < var18 / 2) {
                    arg1.field265 -= var3.field10271;
                    if (arg1.field265 < 0) {
                        arg1.field265 = 0;
                    }
                } else if (var17 > arg1.field265) {
                    arg1.field265 += var3.field10271;
                    if (arg1.field265 > var17) {
                        arg1.field265 = var17;
                    }
                }
            } else if (arg1.field265 < var17) {
                arg1.field265 += var3.field10271;
                if (arg1.field265 > var17) {
                    arg1.field265 = var17;
                }
            } else if (arg1.field265 > 0) {
                arg1.field265 -= var3.field10271;
                if (arg1.field265 < 0) {
                    arg1.field265 = 0;
                }
            }
            var14 = arg1.field265 >> 9;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        class751.field10492 = 0;
        if (var9 == var11 && var10 == var12) {
            class550.field7691 = -1;
        } else {
            if (var11 > var9) {
                arg1.field5801 += var14;
                class751.field10492 |= 0x4;
                if (var11 < arg1.field5801) {
                    arg1.field5801 = var11;
                }
            } else if (var9 > var11) {
                arg1.field5801 -= var14;
                class751.field10492 |= 0x8;
                if (var11 > arg1.field5801) {
                    arg1.field5801 = var11;
                }
            }
            if (var12 > var10) {
                arg1.field5797 += var14;
                class751.field10492 |= 0x1;
                if (var12 < arg1.field5797) {
                    arg1.field5797 = var12;
                }
            } else if (var10 > var12) {
                arg1.field5797 -= var14;
                class751.field10492 |= 0x2;
                if (var12 > arg1.field5797) {
                    arg1.field5797 = var12;
                }
            }
            if (var14 < 32) {
                class550.field7691 = var13;
            } else {
                class550.field7691 = 2;
            }
        }
        if (arg1.field5801 != var11 || arg1.field5797 != var12) {
            return;
        }
        arg1.field263--;
        if (arg1.field266 > 0) {
            arg1.field266--;
            return;
        }
    }

    @OriginalMember(owner = "client!cda", name = "f", descriptor = "(I)V", line = 647)
    public final void method610(int arg0) {
        this.field2426 = 1.0F;
        field2433++;
        this.field2422 = this.field2439 = class66.field946[arg0 & 0x3FFF];
        this.field2438 = class66.field951[arg0 & 0x3FFF];
        this.field2424 = -this.field2438;
        this.field2431 = this.field2411 = this.field2410 = this.field2408 = this.field2412 = this.field2435 = this.field2434 = 0.0F;
    }

    @OriginalMember(owner = "client!cda", name = "e", descriptor = "(I)V", line = 665)
    public final void method598(int arg0) {
        this.field2439 = 1.0F;
        field2420++;
        this.field2422 = this.field2426 = class66.field946[arg0 & 0x3FFF];
        this.field2431 = class66.field951[arg0 & 0x3FFF];
        this.field2412 = -this.field2431;
        this.field2424 = this.field2411 = this.field2438 = this.field2410 = this.field2408 = this.field2435 = this.field2434 = 0.0F;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "([I)V", line = 677)
    public final void method597(int[] arg0) {
        field2423++;
        float var2 = (float) arg0[0] - this.field2411;
        float var3 = (float) arg0[1] - this.field2408;
        float var4 = (float) arg0[2] - this.field2434;
        arg0[2] = (int) (this.field2426 * var4 + this.field2431 * var2 + this.field2410 * var3);
        arg0[0] = (int) (this.field2412 * var4 + this.field2438 * var3 + this.field2422 * var2);
        arg0[1] = (int) (this.field2435 * var4 + this.field2439 * var3 + this.field2424 * var2);
    }

    @OriginalMember(owner = "client!cda", name = "<init>", descriptor = "()V", line = 694)
    public class174() {
        this.method595();
    }
}
