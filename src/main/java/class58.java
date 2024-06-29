import java.awt.Canvas;
import java.awt.Rectangle;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class58 {

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "Ld;")
    public class149 field1084;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public int field1071;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field1077 = 0;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field1072 = 0;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "Lqaa;")
    public static class27 field1074 = new class27(12, 4);

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "Lfs;")
    public static class552 field1091 = new class552(16);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
    public abstract void method522(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILaa;II)V")
    public abstract void method523(int arg0, class484 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
    public abstract void method524(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
    public final void method525(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method528(arg4, arg0, arg1, arg2, 1);
        field1069++;
        if (arg3 != -3482) {
            this.method567();
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public abstract void method526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class484 arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public abstract void method527(int arg0);

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
    public abstract void method528(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method529(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()Lkd;")
    public abstract class280 method530();

    @OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
    public abstract int method531();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
    public abstract void method532(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()V")
    public abstract void method533();

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
    public abstract int method534();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public abstract void method535(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()V")
    public abstract void method536();

    @OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
    public abstract void method537(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lkd;)V")
    public abstract void method538(class280 arg0);

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
    public abstract void method539(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;II)V")
    public final void method540(Rectangle[] arg0, int arg1, int arg2) throws class701 {
        field1076++;
        this.method628(arg0, arg1, 0, 0);
        int var4 = -121 / ((arg2 + 29) / 58);
    }

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
    public abstract void method541(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)V")
    public final void method542(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1087++;
        this.method630(arg5, arg4, arg1, arg0, arg3, 1);
        if (arg2 != 3854) {
            this.method558();
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public static void method543(byte arg0) {
        field1074 = null;
        field1091 = null;
        int var1 = -128 / ((arg0 - 4) / 49);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lc;Lvi;)Luaa;")
    public abstract class116 method544(class185 arg0, class536 arg1);

    @OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
    public abstract void method545(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method546(String arg0, int arg1, int arg2) {
        field1070++;
        int var3 = class206.field2950;
        int[] var4 = class209.field3013;
        boolean var5 = false;
        for (int var6 = arg2; var6 < var3; var6++) {
            class349 var7 = class165.field2442[var4[var6]];
            if (var7 != null && class468.field6748 != var7 && var7.field4939 != null && var7.field4939.equalsIgnoreCase(arg0)) {
                var5 = true;
                if (arg1 == 1) {
                    class366.field5111++;
                    class135 var12 = class273.method1801(class459.field6629, class684.field9652, 2);
                    var12.field2109.method285(-128, var4[var6]);
                    var12.field2109.method281(-29331, 0);
                    class539.method3178(var12, -18925);
                } else if (arg1 == 4) {
                    class583.field8231++;
                    class135 var11 = class273.method1801(class459.field6629, class706.field9896, 2);
                    var11.field2109.method281(-29331, 0);
                    var11.field2109.method223(1493807496, var4[var6]);
                    class539.method3178(var11, -18925);
                } else if (arg1 == 5) {
                    class232.field3296++;
                    class135 var10 = class273.method1801(class459.field6629, class136.field2125, 2);
                    var10.field2109.method226((byte) -126, var4[var6]);
                    var10.field2109.method263((byte) -81, 0);
                    class539.method3178(var10, arg2 - 18925);
                } else if (arg1 == 6) {
                    class69.field1239++;
                    class135 var8 = class273.method1801(class459.field6629, class148.field2252, 2);
                    var8.field2109.method229(-22416, 0);
                    var8.field2109.method223(1493807496, var4[var6]);
                    class539.method3178(var8, -18925);
                } else if (arg1 == 7) {
                    class265.field3856++;
                    class135 var9 = class273.method1801(class459.field6629, class241.field3389, 2);
                    var9.field2109.method281(-29331, 0);
                    var9.field2109.method226((byte) -126, var4[var6]);
                    class539.method3178(var9, -18925);
                }
                break;
            }
        }
        if (!var5) {
            class570.method3327((byte) 76, 4, class281.field3962.method1839((byte) 45, class744.field10426) + arg0);
        }
    }

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
    public abstract int[] method547();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public abstract void method548(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public static final void method549(int arg0) {
        int var1 = 40 % ((arg0 - 62) / 45);
        class80.method786((byte) 45);
        field1075++;
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()Z")
    public abstract boolean method550();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Lvi;")
    public abstract class536 method551(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
    public abstract void method552(float arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V")
    public abstract void method553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)V")
    public abstract void method554(int arg0, int arg1) throws class701;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lkr;B)V")
    public final void method555(class743 arg0, byte arg1) {
        this.method610(this.method544(arg0, this.method551(arg0.method93(), arg0.method95())));
        field1088++;
        if (arg1 < 98) {
            this.method532(-92, 104, 44, -73, 1.3588915860231416D);
        }
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
    public abstract void method556(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V")
    protected void finalize() {
        field1068++;
        this.method623(-1);
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)V")
    public static final void method557(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1073++;
        int var6 = arg2;
        int var7 = arg1;
        int var8 = arg5 * arg5;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((arg2 << 1) + 3) * var10;
        int var18 = ((arg1 << 1) - 3) * var11;
        int var19 = (arg2 + 1) * var16;
        class399.method2472(27113, arg4 - arg5, arg4 + arg5, arg3, class329.field4651[arg0]);
        int var20 = (arg1 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var19 += var16;
                    var6++;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                var6++;
                var17 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            var7--;
            var20 -= var15;
            var18 -= var15;
            int var21 = arg0 - var7;
            int var22 = arg0 + var7;
            int var23 = arg4 + var6;
            int var24 = arg4 - var6;
            class399.method2472(27113, var24, var23, arg3, class329.field4651[var21]);
            class399.method2472(27113, var24, var23, arg3, class329.field4651[var22]);
        }
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()Lkd;")
    public abstract class280 method558();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public abstract void method559(int arg0);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "()Z")
    public abstract boolean method560();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[IIIII)Lkr;")
    public final class743 method561(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < 25) {
            return null;
        } else {
            field1078++;
            return this.method620(arg1, arg2, arg0, arg3, arg5, true);
        }
    }

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "()Z")
    public abstract boolean method562();

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "()Z")
    public abstract boolean method563();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
    public abstract void method564(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "()V")
    public abstract void method565();

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
    public abstract void method566(int arg0);

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "()V")
    public abstract void method567();

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)Lza;")
    public abstract class411 method568(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZIIII)V")
    public final void method569(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0) {
            this.field1084 = null;
        }
        field1083++;
        this.method541(arg1, arg3, arg4, arg2, 1);
    }

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
    public abstract void method570(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lsfa;Lsfa;FLsfa;)Lsfa;")
    public abstract class693 method571(class693 arg0, class693 arg1, float arg2, class693 arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method572(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Laa;")
    public abstract class484 method573(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
    public abstract int[] method574(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Lbh;)V")
    public abstract void method575(int arg0, class36[] arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Lkr;")
    public abstract class743 method576(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Lbh;")
    public abstract class36 method577(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lza;)V")
    public abstract void method578(class411 arg0);

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "()Z")
    public abstract boolean method579();

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
    public abstract void method580(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Lkr;")
    public abstract class743 method581(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
    public final void method582(int arg0) throws class701 {
        if (arg0 != 3593) {
            this.method551(40, -125);
        }
        field1090++;
        this.method554(0, 0);
    }

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
    public abstract void method583(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
    public abstract void method584(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
    public abstract int method585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)V")
    public final void method586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1079++;
        this.method616(arg5, arg1, arg4, arg3, arg0, 1);
        if (arg2 != 12) {
            this.field1071 = 14;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lsfa;)V")
    public abstract void method587(class693 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;II)V")
    public abstract void method588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class484 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "()Z")
    public abstract boolean method589();

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "()V")
    public abstract void method590();

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
    public abstract void method591(int arg0);

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
    public abstract void method592(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Loo;)V")
    public abstract void method593(class624 arg0);

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
    public abstract int method594();

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "()V")
    public abstract void method595();

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
    public abstract void method596(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZLd;IILjava/awt/Canvas;Leq;II)Lha;")
    public static final synchronized class58 method597(boolean arg0, class149 arg1, int arg2, int arg3, Canvas arg4, class209 arg5, int arg6, int arg7) {
        field1080++;
        if (arg3 == 0) {
            return class329.method2099(-25877, arg4, arg6, arg1, arg2);
        } else if (arg3 == 2) {
            return class330.method2111((byte) 117, arg6, arg2, arg4, arg1);
        } else if (arg3 == 1) {
            return class711.method3975(arg1, -22023, arg7, arg4);
        } else if (arg3 == 5) {
            return class290.method1872(arg7, (byte) 67, arg5, arg1, arg4);
        } else {
            if (!arg0) {
                method543((byte) -76);
            }
            if (arg3 != 3) {
                throw new IllegalArgumentException("UM");
            }
            return class572.method3333(arg4, (byte) 24, arg5, arg1, arg7);
        }
    }

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
    public abstract int method598();

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "()Lsia;")
    public abstract class732 method599();

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "()Z")
    public abstract boolean method600();

    @OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
    public abstract void method601();

    @OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
    public abstract int method602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
    public abstract void method603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
    public abstract void method604(int arg0);

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "()Z")
    public abstract boolean method605();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
    public abstract void method606(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method607(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "(I)V")
    public abstract void method608(int arg0);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(IIIIII)Lsfa;")
    public abstract class693 method609(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Luaa;)V")
    public abstract void method610(class116 arg0);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)I")
    public abstract int method611(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "()Lkd;")
    public abstract class280 method612();

    @OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
    public abstract void method613();

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)I")
    public abstract int method614(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "()I")
    public abstract int method615();

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(IIIIII)V")
    public abstract void method616(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
    public abstract void method617(int arg0);

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "()Z")
    public abstract boolean method618();

    @OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
    public abstract void method619();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Lkr;")
    public abstract class743 method620(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public abstract class278 method621(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "()Z")
    public abstract boolean method622();

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "(I)V")
    public final void method623(int arg0) {
        field1081++;
        class73.field1289[this.field1071] = false;
        if (arg0 == -1) {
            this.method638();
        }
    }

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
    public abstract void method624(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
    public abstract void method625(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method626(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "()Z")
    public abstract boolean method627();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public abstract void method628(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class701;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZIIII)V")
    public final void method629(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field1085++;
        this.method553(arg3, arg5, arg2, arg0, arg4, 1);
        if (arg1) {
            this.method545(-79, 11, 93, -8);
        }
    }

    @OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
    public abstract void method630(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
    public abstract void method631(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lfp;[Lfw;Z)Lda;")
    public abstract class59 method632(class323 arg0, class55[] arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIII)V")
    public final void method633(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method640(arg4, arg3, arg1, arg2, 1);
        field1089++;
        int var6 = 78 / ((51 - arg0) / 45);
    }

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "()Z")
    public abstract boolean method634();

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "()Z")
    public abstract boolean method635();

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
    public abstract void method636(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lfw;Z)Lkr;")
    public abstract class743 method637(class55 arg0, boolean arg1);

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "()V")
    public abstract void method638();

    @OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
    public abstract void method639(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
    public abstract void method640(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
    public abstract int method641();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLud;)V")
    public static final void method642(byte arg0, class35 arg1) {
        if (arg0 > -126) {
            method597(false, null, 72, 26, null, null, 65, -39);
        }
        field1086++;
        byte[] var2 = new byte[24];
        if (class218.field3110 != null) {
            try {
                class218.field3110.method3019(0L, 117);
                class218.field3110.method3021(var2, (byte) -50);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method283(0, (byte) -83, var2, 24);
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ld;)V")
    public class58(class149 arg0) {
        this.field1084 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class73.field1289[var3]) {
                class73.field1289[var3] = true;
                var2 = var3;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field1071 = var2;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Loo;I)V")
    public abstract void method643(class624 arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)Lc;")
    public abstract class185 method644(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method645(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lww;IIII)Lka;")
    public abstract class469 method646(class729 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method647(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);
}
