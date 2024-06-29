import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class295 {

    @OriginalMember(owner = "client!za", name = "b", descriptor = "I")
    public int field3976;

    @OriginalMember(owner = "client!za", name = "n", descriptor = "Ll;")
    public class127 field3988;

    @OriginalMember(owner = "client!za", name = "j", descriptor = "[Lwh;")
    public static class420[] field3984 = new class420[14];

    @OriginalMember(owner = "client!za", name = "d", descriptor = "I")
    public static int field3978 = 0;

    @OriginalMember(owner = "client!za", name = "a", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!za", name = "c", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!za", name = "e", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!za", name = "f", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!za", name = "g", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!za", name = "h", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!za", name = "i", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!za", name = "k", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!za", name = "l", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!za", name = "m", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!za", name = "o", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!za", name = "p", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!za", name = "q", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!za", name = "r", descriptor = "Lru;")
    public static class376 field3992;

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(ILat;)V", line = 12)
    public static final void method1704(int arg0, class444 arg1) {
        if (arg0 != -20215) {
            method1705(true, null);
        }
        if (arg1.field6477 == 5 && arg1.field6481 != -1) {
            class109.method834(arg1, class275.field3737, (byte) -125);
        }
        field3977++;
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(ZLat;)Ljava/lang/String;", line = 32)
    public static final String method1705(boolean arg0, class444 arg1) {
        field3981++;
        if (client.method3067(arg1).method2554(-101) == 0) {
            return null;
        } else if (arg1.field6505 == null || arg1.field6505.trim().length() == 0) {
            return class181.field2693 ? "Hidden-use" : null;
        } else {
            if (!arg0) {
                field3991 = 105;
            }
            return arg1.field6505;
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(ZIIIII)V", line = 55)
    public final void method1706(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method552(arg4, arg2, arg1, arg3, arg5, 1);
        field3975++;
        if (!arg0) {
            this.method478(-122, -48, -54, null);
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(BIIIII)V", line = 75)
    public final void method1707(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3983++;
        this.method527(arg5, arg3, arg2, arg4, arg1, 1);
        if (arg0 != 55) {
            field3984 = null;
        }
    }

    @OriginalMember(owner = "client!za", name = "finalize", descriptor = "()V", line = 118)
    protected void finalize() {
        field3989++;
        this.method1713(-1);
    }

    @OriginalMember(owner = "client!za", name = "e", descriptor = "(I)V", line = 140)
    public static void method1708(int arg0) {
        field3992 = null;
        field3984 = null;
        int var1 = -117 % ((9 - arg0) / 62);
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIII)V", line = 158)
    public final void method1709(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3987++;
        if (arg2 == 12581) {
            this.method460(arg1, arg4, arg3, arg0, 1);
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIZILet;I[IIIIIIII[I)I", line = 182)
    public static final int method1710(int arg0, int arg1, boolean arg2, int arg3, class466 arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int[] arg14) {
        field3982++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class338.field4911[var15][var35] = 0;
                class75.field1059[var15][var35] = 99999999;
            }
        }
        boolean var16;
        if (arg11 == 1) {
            var16 = class120.method884(arg5, arg4, arg9, arg10, arg12, arg0, arg8, arg1, arg3, -1, arg7);
        } else if (arg11 == 2) {
            var16 = class200.method1303(arg4, arg10, arg3, (byte) 82, arg0, arg12, arg8, arg1, arg7, arg9, arg5);
        } else {
            var16 = class243.method1472(arg0, arg3, arg10, arg8, arg12, arg1, arg11, arg7, arg9, arg4, arg5, -1);
        }
        int var17 = arg3 - 64;
        int var18 = arg0 - 64;
        int var19 = class32.field490;
        int var20 = class211.field3012;
        if (!var16) {
            if (!arg2) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg8 - var23; var24 <= arg8 + var23; var24++) {
                for (int var25 = arg1 - var23; var25 <= arg1 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class75.field1059[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg8 > var24) {
                            var28 = arg8 - var24;
                        } else if ((arg8 + arg7 - 1) < var24) {
                            var28 = var24 + 1 - arg7 - arg8;
                        }
                        int var29 = 0;
                        if (var25 < arg1) {
                            var29 = arg1 - var25;
                        } else if (var25 > (arg1 + arg12 - 1)) {
                            var29 = var25 + 1 - arg12 - arg1;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var21 > var30 || var21 == var30 && var22 > class75.field1059[var26][var27]) {
                            var21 = var30;
                            var20 = var25;
                            var22 = class75.field1059[var26][var27];
                            var19 = var24;
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg3 == var19 && arg0 == var20) {
            return 0;
        }
        byte var31 = 0;
        class126.field1966[var31] = var19;
        int var37 = var31 + 1;
        class3.field37[var31] = var20;
        int var32;
        int var33 = var32 = class338.field4911[var19 - var17][var20 - var18];
        if (arg13 >= -96) {
            field3992 = null;
        }
        while (arg3 != var19 || arg0 != var20) {
            if (var32 != var33) {
                class126.field1966[var37] = var19;
                var32 = var33;
                class3.field37[var37++] = var20;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            var33 = class338.field4911[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg14[var34] = class126.field1966[var37];
            arg6[var34++] = class3.field37[var37];
            if (var34 >= arg14.length) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(BIIII)V", line = 359)
    public final void method1711(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field3979++;
        this.method543(arg4, arg3, arg1, arg2, 1);
        if (arg0 < 83) {
            this.method460(-102, 47, -63, 56, 65);
        }
    }

    @OriginalMember(owner = "client!za", name = "c", descriptor = "(IIIIII)V", line = 372)
    public final void method1712(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method508(arg5, arg4, arg3, arg0, arg2, 1);
        if (arg1 != 0) {
            this.field3988 = null;
        }
        field3980++;
    }

    @OriginalMember(owner = "client!za", name = "g", descriptor = "(I)V", line = 398)
    public final void method1713(int arg0) {
        class297.field4070[this.field3976] = false;
        if (arg0 != -1) {
            this.method470();
        }
        field3990++;
        this.method560();
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIB)V", line = 418)
    public final void method1714(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.method556(arg0, arg1, arg3, arg2, 1);
        if (arg4 == -24) {
            field3986++;
        }
    }

    @OriginalMember(owner = "client!za", name = "<init>", descriptor = "(ILl;)V", line = 432)
    public class295(int arg0, class127 arg1) {
        this.field3976 = arg0;
        this.field3988 = arg1;
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IILjava/awt/Canvas;Ll;Lor;B)Lza;", line = 459)
    public static final synchronized class295 method1715(int arg0, int arg1, Canvas arg2, class127 arg3, class173 arg4, byte arg5) {
        field3985++;
        int var6 = -1;
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class297.field4070[var7]) {
                var6 = var7;
                break;
            }
        }
        if (arg5 <= 51) {
            return null;
        } else if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        } else {
            Object var8 = null;
            class295 var9;
            if (arg0 == 0) {
                var9 = class447.method2634(arg3, var6, arg2, 84);
            } else if (arg0 == 1) {
                var9 = class420.method2483(arg4, arg3, 90, var6, arg2, arg1);
            } else if (arg0 == 2) {
                var9 = class108.method825(var6, arg4, arg2, arg3, -117);
            } else {
                throw new IllegalArgumentException("UM");
            }
            class297.field4070[var6] = true;
            return var9;
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "()Z")
    public abstract boolean method550();

    @OriginalMember(owner = "client!za", name = "b", descriptor = "()Z")
    public abstract boolean method500();

    @OriginalMember(owner = "client!za", name = "t", descriptor = "(I)V")
    public abstract void method467(int arg0);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Z)V")
    public abstract void method521(boolean arg0);

    @OriginalMember(owner = "client!za", name = "da", descriptor = "(FF)V")
    public abstract void method462(float arg0, float arg1);

    @OriginalMember(owner = "client!za", name = "MA", descriptor = "([I)V")
    public abstract void method495(int[] arg0);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(I)V")
    public abstract void method504(int arg0);

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(I)V")
    public abstract void method513(int arg0);

    @OriginalMember(owner = "client!za", name = "c", descriptor = "()V")
    public abstract void method560();

    @OriginalMember(owner = "client!za", name = "d", descriptor = "()V")
    public abstract void method490();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIII)Lks;")
    public abstract class23 method540(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!za", name = "HA", descriptor = "(IIII)V")
    public abstract void method515(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(II)I")
    public abstract int method459(int arg0, int arg1);

    @OriginalMember(owner = "client!za", name = "ma", descriptor = "(IIIII)V")
    public abstract void method543(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Lvk;)V")
    public abstract void method533(class334 arg0);

    @OriginalMember(owner = "client!za", name = "n", descriptor = "()V")
    public abstract void method488();

    @OriginalMember(owner = "client!za", name = "JA", descriptor = "(F)V")
    public abstract void method554(float arg0);

    @OriginalMember(owner = "client!za", name = "pa", descriptor = "()I")
    public abstract int method473();

    @OriginalMember(owner = "client!za", name = "e", descriptor = "()V")
    public abstract void method485();

    @OriginalMember(owner = "client!za", name = "c", descriptor = "(I)Ln;")
    public abstract class391 method539(int arg0);

    @OriginalMember(owner = "client!za", name = "f", descriptor = "()Z")
    public abstract boolean method519();

    @OriginalMember(owner = "client!za", name = "g", descriptor = "()Z")
    public abstract boolean method514();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "([Le;Lc;[Lrr;I)V")
    public abstract void method457(class285[] arg0, class512 arg1, class305[] arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "ya", descriptor = "(I)V")
    public abstract void method547(int arg0);

    @OriginalMember(owner = "client!za", name = "d", descriptor = "(I)V")
    public abstract void method484(int arg0);

    @OriginalMember(owner = "client!za", name = "h", descriptor = "()V")
    public abstract void method516();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method509(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIZ)Lo;")
    public abstract class359 method565(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(II)I")
    public abstract int method525(int arg0, int arg1);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method463(Canvas arg0);

    @OriginalMember(owner = "client!za", name = "i", descriptor = "()Z")
    public abstract boolean method542();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(FFF)V")
    public abstract void method505(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!za", name = "AA", descriptor = "()I")
    public abstract int method520();

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method535(Canvas arg0);

    @OriginalMember(owner = "client!za", name = "VA", descriptor = "(IIIIII)Z")
    public abstract boolean method522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!za", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method454(Canvas arg0);

    @OriginalMember(owner = "client!za", name = "s", descriptor = "(IIII)V")
    public abstract void method517(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "d", descriptor = "(II)V")
    public abstract void method512(int arg0, int arg1);

    @OriginalMember(owner = "client!za", name = "j", descriptor = "()V")
    public abstract void method491();

    @OriginalMember(owner = "client!za", name = "k", descriptor = "()Z")
    public abstract boolean method466();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "([IIIII)Lo;")
    public abstract class359 method510(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!za", name = "l", descriptor = "()Z")
    public abstract boolean method531();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Lks;Lks;FLks;)Lks;")
    public abstract class23 method465(class23 arg0, class23 arg1, float arg2, class23 arg3);

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(IIIIII)V")
    public abstract void method552(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!za", name = "ra", descriptor = "(ILta;II)V")
    public abstract void method523(int arg0, class336 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "m", descriptor = "()Z")
    public abstract boolean method561();

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(IIII)V")
    public abstract void method474(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Lqq;IIII)Le;")
    public abstract class285 method501(class496 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(Z)V")
    public abstract void method524(boolean arg0);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Ln;)V")
    public abstract void method497(class391 arg0);

    @OriginalMember(owner = "client!za", name = "c", descriptor = "(Z)V")
    public abstract void method528(boolean arg0);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method476(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(I[Lsa;)V")
    public abstract void method503(int arg0, class447[] arg1);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIII)V")
    public abstract void method482(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Lkt;[Lau;Z)Lla;")
    public abstract class306 method529(class61 arg0, class396[] arg1, boolean arg2);

    @OriginalMember(owner = "client!za", name = "OA", descriptor = "()I")
    public abstract int method507();

    @OriginalMember(owner = "client!za", name = "o", descriptor = "()Z")
    public abstract boolean method551();

    @OriginalMember(owner = "client!za", name = "q", descriptor = "()Lc;")
    public abstract class512 method541();

    @OriginalMember(owner = "client!za", name = "K", descriptor = "(IIIIII[BII)V")
    public abstract void method563(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!za", name = "s", descriptor = "()Z")
    public abstract boolean method492();

    @OriginalMember(owner = "client!za", name = "Y", descriptor = "()I")
    public abstract int method470();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIF)Lsa;")
    public abstract class447 method518(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!za", name = "t", descriptor = "()Z")
    public abstract boolean method498();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIILta;II)V")
    public abstract void method526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class336 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!za", name = "f", descriptor = "(I)V")
    public abstract void method494(int arg0);

    @OriginalMember(owner = "client!za", name = "aa", descriptor = "()F")
    public abstract float method472();

    @OriginalMember(owner = "client!za", name = "u", descriptor = "()Z")
    public abstract boolean method475();

    @OriginalMember(owner = "client!za", name = "ba", descriptor = "(IIII)V")
    public abstract void method511(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Lau;Z)Lo;")
    public abstract class359 method555(class396 arg0, boolean arg1);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(II[I[I)Lta;")
    public abstract class336 method562(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Le;Lvk;Lc;Lrr;I)V")
    public abstract void method553(class285 arg0, class334 arg1, class512 arg2, class305 arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "v", descriptor = "()Z")
    public abstract boolean method564();

    @OriginalMember(owner = "client!za", name = "GA", descriptor = "(IIII)V")
    public abstract void method471(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "w", descriptor = "()I")
    public abstract int method502();

    @OriginalMember(owner = "client!za", name = "va", descriptor = "()V")
    public abstract void method477();

    @OriginalMember(owner = "client!za", name = "x", descriptor = "()Z")
    public abstract boolean method549();

    @OriginalMember(owner = "client!za", name = "IA", descriptor = "(IIIII)V")
    public abstract void method556(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "B", descriptor = "(IFFFFF)V")
    public abstract void method534(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!za", name = "v", descriptor = "(III[I)V")
    public abstract void method478(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "([Le;Lvk;Lc;[Lrr;I)V")
    public abstract void method499(class285[] arg0, class334 arg1, class512 arg2, class305[] arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(II[[I[[IIII)Lya;")
    public abstract class11 method506(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!za", name = "T", descriptor = "()F")
    public abstract float method461();

    @OriginalMember(owner = "client!za", name = "y", descriptor = "()V")
    public abstract void method532();

    @OriginalMember(owner = "client!za", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method486(Canvas arg0);

    @OriginalMember(owner = "client!za", name = "ZA", descriptor = "(IIIII)V")
    public abstract void method460(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "sa", descriptor = "(IIII)[I")
    public abstract int[] method537(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Lks;)V")
    public abstract void method480(class23 arg0);

    @OriginalMember(owner = "client!za", name = "SA", descriptor = "(Lc;)V")
    public abstract void method548(class512 arg0);

    @OriginalMember(owner = "client!za", name = "z", descriptor = "()V")
    public abstract void method536();

    @OriginalMember(owner = "client!za", name = "A", descriptor = "()Z")
    public abstract boolean method557();

    @OriginalMember(owner = "client!za", name = "h", descriptor = "(I)V")
    public abstract void method493(int arg0);

    @OriginalMember(owner = "client!za", name = "r", descriptor = "()I")
    public abstract int method464();

    @OriginalMember(owner = "client!za", name = "P", descriptor = "(IIIIII)V")
    public abstract void method508(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!za", name = "d", descriptor = "(IIIIII)V")
    public abstract void method527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!za", name = "B", descriptor = "()Lc;")
    public abstract class512 method489();

    @OriginalMember(owner = "client!za", name = "Q", descriptor = "(III)V")
    public abstract void method558(int arg0, int arg1, int arg2);
}
