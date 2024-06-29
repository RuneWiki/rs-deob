import java.awt.Canvas;
import java.awt.Container;
import java.awt.Insets;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public abstract class class312 {

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public int field4911 = -1;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "Z")
    public static boolean field4910 = false;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "Ldj;")
    public static class190 field4907 = new class190();

    @OriginalMember(owner = "client!e", name = "t", descriptor = "Z")
    public static boolean field4925 = false;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "Lbn;")
    public static class256 field4924 = new class256(64);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4916;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIII)V", line = 5)
    public final void method2083(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 <= 52) {
            this.method565();
        }
        this.method647(arg3, arg1, arg5, arg2, arg4, 1);
        field4912++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lah;Lap;ILjava/awt/Canvas;II)Le;", line = 24)
    public static final synchronized class312 method2084(class215 arg0, class279 arg1, int arg2, Canvas arg3, int arg4, int arg5) {
        field4906++;
        int var6 = -1;
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class426.field6276[var7]) {
                var6 = var7;
                break;
            }
        }
        if (arg2 == var6) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        class312 var9;
        if (arg5 == 0) {
            var9 = class56.method369((byte) -104, var6, arg0, arg3);
        } else if (arg5 == 1) {
            var9 = class368.method2366((byte) 72, arg0, arg1, arg4, arg3, var6);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class426.field6276[var6] = true;
        return var9;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IBIII)V", line = 67)
    public final void method2085(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field4914++;
        this.method560(arg0, arg3, arg2, arg4, 1);
        int var6 = 34 % ((arg1 + 5) / 61);
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(IIIIII)V", line = 88)
    public final void method2086(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 == -765) {
            this.method563(arg1, arg5, arg0, arg2, arg3, 1);
            field4909++;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IZIII)V", line = 104)
    public final void method2087(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!arg1) {
            this.method563(-1, 57, 91, 44, -45, -102);
        }
        field4919++;
        this.method684(arg3, arg2, arg4, arg0, 1);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)V", line = 116)
    public static final void method2088(boolean arg0) {
        field4922++;
        class375.method2396(9712, arg0);
        if (class12.field178 >= 0 && class12.field178 != 0) {
            class221.method1586(-1009, class12.field178);
            class12.field178 = -1;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V", line = 134)
    public static void method2089(byte arg0) {
        field4924 = null;
        field4907 = null;
        int var1 = 16 % ((-arg0 - 60) / 34);
        field4916 = null;
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(IIIIII)V", line = 145)
    public final void method2090(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4915++;
        if (arg0 == 0) {
            this.method651(arg3, arg2, arg1, arg4, arg5, 1);
        }
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V", line = 219)
    public final void method2091(int arg0) {
        class426.field6276[this.field4911] = false;
        field4917++;
        if (arg0 != -15001) {
            field4916 = null;
        }
        this.method715();
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILap;ZLjava/lang/String;Z)V", line = 237)
    public static final void method2092(int arg0, class279 arg1, boolean arg2, String arg3, boolean arg4) {
        field4923++;
        if (arg4) {
            if (class279.field4459.startsWith("win") && class279.field4460 != 3) {
                String var5 = null;
                if (arg1.field4464 != null) {
                    var5 = arg1.field4464.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class26 var6 = class340.method2234(arg3, 0, 26153, arg1);
                    class328.field5141 = arg1;
                    class344.field5295 = arg3;
                    class432.field6376 = var6;
                    return;
                }
            }
            if (class279.field4459.startsWith("mac")) {
                String var7 = null;
                if (arg1.field4464 != null) {
                    var7 = arg1.field4464.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg2) {
                    class340.method2234(arg3, 1, 26153, arg1);
                    return;
                }
            }
            class340.method2234(arg3, 2, 26153, arg1);
        } else {
            class340.method2234(arg3, 3, arg0 + 26150, arg1);
        }
        if (arg0 != 3) {
            method2089((byte) -65);
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(III)V", line = 305)
    public static final void method2093(int arg0, int arg1, int arg2) {
        class142.field2254 = new class52(arg2);
        field4908++;
        if (arg0 == -2) {
            class102.field1417 = new class52(arg1);
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(IZIII)V", line = 327)
    public final void method2094(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!arg1) {
            this.method705(-50, 7, 35, -45, 71, -46, (byte[]) null, 50, -81);
        }
        this.method631(arg4, arg0, arg2, arg3, 1);
        field4918++;
    }

    @OriginalMember(owner = "client!e", name = "finalize", descriptor = "()V", line = 338)
    protected final void finalize() {
        this.method2091(-15001);
        field4920++;
    }

    @OriginalMember(owner = "client!e", name = "h", descriptor = "(I)V", line = 351)
    public static final void method2095(int arg0) {
        field4913++;
        if (class395.field5920 != null) {
            return;
        }
        Container var1;
        if (class47.field587 == null) {
            var1 = class63.field822.field4464;
        } else {
            var1 = class47.field587;
        }
        class318.field4984 = var1.getSize().width;
        class284.field4567 = var1.getSize().height;
        if (class47.field587 == var1) {
            Insets var2 = class47.field587.getInsets();
            class284.field4567 -= var2.top + var2.bottom;
            class318.field4984 -= var2.right + var2.left;
        }
        if (class199.method1386((byte) 115) == 1) {
            class108.field1512 = 0;
            class430.field6324 = 503;
            class13.field192 = (class318.field4984 - 765) / 2;
            class369.field5615 = 765;
        } else if (class27.field314 < 96 && class128.field2035 == 0) {
            int var3 = class318.field4984 > 1024 ? 1024 : class318.field4984;
            class13.field192 = (class318.field4984 - var3) / 2;
            class369.field5615 = var3;
            int var4 = class284.field4567 <= 768 ? class284.field4567 : 768;
            class108.field1512 = 0;
            class430.field6324 = var4;
        } else {
            class108.field1512 = 0;
            class430.field6324 = class284.field4567;
            class13.field192 = 0;
            class369.field5615 = class318.field4984;
        }
        if (arg0 >= -75) {
            return;
        }
        if (class141.field2184 != 0) {
            boolean var10000;
            if (class369.field5615 < 1024 && class430.field6324 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class86.field1073.setSize(class369.field5615, class430.field6324);
        if (class284.field4547 != null) {
            class284.field4547.method566();
        }
        if (class47.field587 == var1) {
            Insets var5 = class47.field587.getInsets();
            class86.field1073.setLocation(class13.field192 + var5.left, class108.field1512 + var5.top);
        } else {
            class86.field1073.setLocation(class13.field192, class108.field1512);
        }
        if (class306.field4847 != -1) {
            class354.method2307(114, true);
        }
        class403.method2537(-12029);
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "()V")
    public abstract void method626();

    @OriginalMember(owner = "client!e", name = "e", descriptor = "()Z")
    public abstract boolean method621();

    @OriginalMember(owner = "client!e", name = "f", descriptor = "()I")
    public abstract int method702();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III[I)V")
    public abstract void method573(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIII)V")
    public abstract void method560(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method630(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lgh;[Lvp;Z)Lmp;")
    public abstract class452 method612(class325 arg0, class100[] arg1, boolean arg2);

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(IIIIII)Lma;")
    public abstract class8 method601(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lka;)V")
    public abstract void method578(class275 arg0);

    @OriginalMember(owner = "client!e", name = "g", descriptor = "()F")
    public abstract float method629();

    @OriginalMember(owner = "client!e", name = "h", descriptor = "()F")
    public abstract float method583();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public abstract void method635(int arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II[I[I)Lq;")
    public abstract class245 method597(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!e", name = "i", descriptor = "()Z")
    public abstract boolean method568();

    @OriginalMember(owner = "client!e", name = "j", descriptor = "()V")
    public abstract void method661();

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
    public abstract void method567(int arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)[I")
    public abstract int[] method675(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!e", name = "k", descriptor = "()Z")
    public abstract boolean method594();

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(IIII)V")
    public abstract void method682(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lma;Lma;FLma;)Lma;")
    public abstract class8 method689(class8 arg0, class8 arg1, float arg2, class8 arg3);

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(IIIIII)V")
    public abstract void method563(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V")
    public abstract void method582(int arg0, int arg1);

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(II)I")
    public abstract int method720(int arg0, int arg1);

    @OriginalMember(owner = "client!e", name = "l", descriptor = "()I")
    public abstract int method690();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lid;Ljp;Lpg;Lcd;I)V")
    public abstract void method561(class348 arg0, class198 arg1, class435 arg2, class170 arg3, int arg4);

    @OriginalMember(owner = "client!e", name = "m", descriptor = "()V")
    public abstract void method566();

    @OriginalMember(owner = "client!e", name = "n", descriptor = "()V")
    public abstract void method591();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(F)V")
    public abstract void method714(float arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljp;)V")
    public abstract void method624(class198 arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([Lid;Lpg;[Lcd;I)V")
    public abstract void method668(class348[] arg0, class435 arg1, class170[] arg2, int arg3);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I[Lej;)V")
    public abstract void method613(int arg0, class62[] arg1);

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(Z)V")
    public abstract void method652(boolean arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
    public abstract void method575(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIII[BII)V")
    public abstract void method705(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(Z)V")
    public abstract void method596(boolean arg0);

    @OriginalMember(owner = "client!e", name = "o", descriptor = "()I")
    public abstract int method643();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([Lid;Ljp;Lpg;[Lcd;I)V")
    public abstract void method687(class348[] arg0, class198 arg1, class435 arg2, class170[] arg3, int arg4);

    @OriginalMember(owner = "client!e", name = "p", descriptor = "()V")
    public abstract void method673();

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
    public abstract void method674(int arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([I)V")
    public abstract void method654(int[] arg0);

    @OriginalMember(owner = "client!e", name = "q", descriptor = "()Z")
    public abstract boolean method581();

    @OriginalMember(owner = "client!e", name = "r", descriptor = "()I")
    public abstract int method606();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method585(Canvas arg0);

    @OriginalMember(owner = "client!e", name = "s", descriptor = "()V")
    public abstract void method715();

    @OriginalMember(owner = "client!e", name = "t", descriptor = "()Z")
    public abstract boolean method660();

    @OriginalMember(owner = "client!e", name = "u", descriptor = "()V")
    public abstract void method609();

    @OriginalMember(owner = "client!e", name = "v", descriptor = "()Z")
    public abstract boolean method648();

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)Lka;")
    public abstract class275 method696(int arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method665(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!e", name = "f", descriptor = "(IIIIII)V")
    public abstract void method647(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lpg;)V")
    public abstract void method693(class435 arg0);

    @OriginalMember(owner = "client!e", name = "w", descriptor = "()Lpg;")
    public abstract class435 method713();

    @OriginalMember(owner = "client!e", name = "x", descriptor = "()I")
    public abstract int method618();

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(IIIII)V")
    public abstract void method684(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lg;IIII)Lid;")
    public abstract class348 method639(class86 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(II)I")
    public abstract int method579(int arg0, int arg1);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II[[I[[IIII)Llf;")
    public abstract class129 method623(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!e", name = "y", descriptor = "()Z")
    public abstract boolean method657();

    @OriginalMember(owner = "client!e", name = "z", descriptor = "()V")
    public abstract void method590();

    @OriginalMember(owner = "client!e", name = "A", descriptor = "()V")
    public abstract void method558();

    @OriginalMember(owner = "client!e", name = "B", descriptor = "()Z")
    public abstract boolean method710();

    @OriginalMember(owner = "client!e", name = "C", descriptor = "()Z")
    public abstract boolean method676();

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(Z)V")
    public abstract void method571(boolean arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lvp;Z)Lgl;")
    public abstract class356 method641(class100 arg0, boolean arg1);

    @OriginalMember(owner = "client!e", name = "f", descriptor = "(I)V")
    public abstract void method637(int arg0);

    @OriginalMember(owner = "client!e", name = "D", descriptor = "()Z")
    public abstract boolean method711();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(FF)V")
    public abstract void method619(float arg0, float arg1);

    @OriginalMember(owner = "client!e", name = "E", descriptor = "()Z")
    public abstract boolean method615();

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(II)V")
    public abstract void method692(int arg0, int arg1);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILq;II)V")
    public abstract void method632(int arg0, class245 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(IIIII)V")
    public abstract void method631(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([IIIII)Lgl;")
    public abstract class356 method703(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!e", name = "F", descriptor = "()Z")
    public abstract boolean method634();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lma;)V")
    public abstract void method694(class8 arg0);

    @OriginalMember(owner = "client!e", name = "g", descriptor = "(I)V")
    public abstract void method636(int arg0);

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(IIII)V")
    public abstract void method671(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!e", name = "g", descriptor = "(IIIIII)Z")
    public abstract boolean method708(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!e", name = "G", descriptor = "()I")
    public abstract int method625();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(FFF)V")
    public abstract void method655(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!e", name = "H", descriptor = "()Z")
    public abstract boolean method706();

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(IIII)V")
    public abstract void method589(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIILq;II)V")
    public abstract void method602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class245 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IFFFFF)V")
    public abstract void method683(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIZ)Lgl;")
    public abstract class356 method686(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!e", name = "I", descriptor = "()V")
    public abstract void method718();

    @OriginalMember(owner = "client!e", name = "J", descriptor = "()Z")
    public abstract boolean method616();

    @OriginalMember(owner = "client!e", name = "K", descriptor = "()Lpg;")
    public abstract class435 method704();

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(III)V")
    public abstract void method659(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!e", name = "L", descriptor = "()Z")
    public abstract boolean method565();

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(IIII)V")
    public abstract void method642(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!e", name = "h", descriptor = "(IIIIII)V")
    public abstract void method651(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method617(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);
}
