import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public abstract class class63 {

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "Lcp;")
    public class481 field871;

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "I")
    public int field870;

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "Lct;")
    public static class285 field861 = new class285(79, 8);

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "Z")
    public static boolean field869 = false;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!tq", name = "j", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "Lui;")
    public static class451 field868;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "()V")
    public abstract void method490();

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "()Z")
    public abstract boolean method491();

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "()V")
    public abstract void method492();

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "()V")
    public abstract void method493();

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z)V")
    public abstract void method494(boolean arg0);

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "()Z")
    public abstract boolean method495();

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "()Z")
    public abstract boolean method496();

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lnb;)V")
    public static final void method497(class212 arg0) {
        if (class363.field5511 >= 65535) {
            return;
        }
        class78.field1108[class363.field5511] = arg0;
        class263.field3920[class363.field5511] = false;
        class363.field5511++;
        int var1 = arg0.field3188;
        if (arg0.field3190) {
            var1 = 0;
        }
        int var2 = arg0.field3188;
        if (arg0.field3201) {
            var2 = class344.field5192 - 1;
        }
        for (int var3 = var1; var3 <= var2; var3++) {
            int var4 = 0;
            int var5 = arg0.field3413 + class47.field683 - arg0.field3407 >> class426.field6091;
            if (var5 < 0) {
                var4 -= var5;
                var5 = 0;
            }
            int var6 = arg0.field3413 + arg0.field3407 - class47.field683 >> class426.field6091;
            if (var6 >= class315.field4743) {
                var6 = class315.field4743 - 1;
            }
            for (int var7 = var5; var7 <= var6; var7++) {
                short var8 = arg0.field3191[var4++];
                int var9 = (var8 >>> 8) + (arg0.field3414 + class47.field683 - arg0.field3407 >> class426.field6091);
                int var10 = (var8 & 0xFF) + var9 - 1;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var10 >= class412.field5957) {
                    var10 = class412.field5957 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    long var12 = class275.field4190[var3][var11][var7];
                    if ((var12 & 0xFFFFL) == 0L) {
                        class275.field4190[var3][var11][var7] = var12 | (long) class363.field5511;
                    } else if ((var12 & 0xFFFF0000L) == 0L) {
                        class275.field4190[var3][var11][var7] = var12 | (long) class363.field5511 << 16;
                    } else if ((var12 & 0xFFFF00000000L) == 0L) {
                        class275.field4190[var3][var11][var7] = var12 | (long) class363.field5511 << 32;
                    } else if ((var12 & 0xFFFF000000000000L) == 0L) {
                        class275.field4190[var3][var11][var7] = var12 | (long) class363.field5511 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Las;)V")
    public abstract void method498(class15 arg0);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILus;II)V")
    public abstract void method499(int arg0, class401 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIII)V")
    public abstract void method500(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(FF)V")
    public abstract void method501(float arg0, float arg1);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lim;)V")
    public abstract void method502(class268 arg0);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "([Lns;Lim;Lmu;[Lro;I)V")
    public abstract void method503(class57[] arg0, class268 arg1, class315 arg2, class117[] arg3, int arg4);

    @OriginalMember(owner = "client!tq", name = "j", descriptor = "()Z")
    public abstract boolean method504();

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)Lku;")
    public abstract class381 method505(int arg0);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(II[I[I)Lus;")
    public abstract class401 method506(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
    public final void method507(byte arg0) {
        class316.field4755[this.field870] = false;
        if (arg0 >= -12) {
            this.method566();
        }
        field864++;
        this.method533();
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIII)V")
    public abstract void method508(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method509(Canvas arg0);

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "()I")
    public abstract int method510();

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "()V")
    public abstract void method511();

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(IIIIII)Las;")
    public abstract class15 method512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(Z)V")
    public abstract void method513(boolean arg0);

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "()Z")
    public abstract boolean method514();

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "()Z")
    public abstract boolean method515();

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(IIII)V")
    public abstract void method516(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(IIII)V")
    public abstract void method517(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(III[I)V")
    public abstract void method518(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIII)V")
    public abstract void method519(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "()F")
    public abstract float method520();

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "(IIII)V")
    public abstract void method521(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILng;Lcp;Ljava/awt/Canvas;IZ)Ltq;")
    public static final synchronized class63 method522(int arg0, class153 arg1, class481 arg2, Canvas arg3, int arg4, boolean arg5) {
        field858++;
        int var6 = -1;
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class316.field4755[var7]) {
                var6 = var7;
                break;
            }
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        class63 var9;
        if (arg0 == 0) {
            var9 = class295.method1854(arg2, arg3, false, var6);
        } else if (arg0 == 1) {
            var9 = class491.method2867(arg4, var6, arg1, -5576, arg3, arg2);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class316.field4755[var6] = arg5;
        return var9;
    }

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "()Z")
    public abstract boolean method523();

    @OriginalMember(owner = "client!tq", name = "q", descriptor = "()I")
    public abstract int method524();

    @OriginalMember(owner = "client!tq", name = "r", descriptor = "()F")
    public abstract float method525();

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIIILus;II)V")
    public abstract void method526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class401 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(Z)V")
    public abstract void method527(boolean arg0);

    @OriginalMember(owner = "client!tq", name = "s", descriptor = "()Z")
    public abstract boolean method528();

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Las;Las;FLas;)Las;")
    public abstract class15 method529(class15 arg0, class15 arg1, float arg2, class15 arg3);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIBII)V")
    public final void method530(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        this.method508(arg4, arg2, arg5, arg0, arg1, 1);
        field860++;
        if (arg3 != 108) {
            this.method590(95, 21, (int[][]) null, (int[][]) null, -21, -45, 38);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method531(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)V")
    public abstract void method532(int arg0);

    @OriginalMember(owner = "client!tq", name = "t", descriptor = "()V")
    public abstract void method533();

    @OriginalMember(owner = "client!tq", name = "u", descriptor = "()I")
    public abstract int method534();

    @OriginalMember(owner = "client!tq", name = "v", descriptor = "()I")
    public abstract int method535();

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "([IIIII)Ldp;")
    public abstract class319 method536(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method537(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method538(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!tq", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method507((byte) -59);
        field865++;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lis;[Lff;Z)Ltr;")
    public abstract class229 method539(class1 arg0, class368[] arg1, boolean arg2);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "([I)V")
    public abstract void method540(int[] arg0);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIII[BII)V")
    public abstract void method541(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I[Lma;)V")
    public abstract void method542(int arg0, class233[] arg1);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZLui;)V")
    public static final void method543(boolean arg0, class451 arg1) {
        field859++;
        if (arg0) {
            field868 = arg1;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lmu;)V")
    public abstract void method544(class315 arg0);

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(IIIIII)V")
    public final void method545(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field857++;
        this.method551(arg3, arg4, arg5, arg1, arg2, arg0);
    }

    @OriginalMember(owner = "client!tq", name = "w", descriptor = "()V")
    public abstract void method546();

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lff;Z)Ldp;")
    public abstract class319 method547(class368 arg0, boolean arg1);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)V")
    public abstract void method548(int arg0, int arg1);

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(IIIII)V")
    public final void method549(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 48) {
            this.method562();
        }
        this.method579(arg4, arg3, arg2, arg1, 1);
        field866++;
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(IIIII)V")
    public abstract void method550(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "(IIIIII)V")
    public abstract void method551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lns;Lim;Lmu;Lro;I)V")
    public abstract void method552(class57 arg0, class268 arg1, class315 arg2, class117 arg3, int arg4);

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(I)V")
    public abstract void method553(int arg0);

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "(I)V")
    public abstract void method554(int arg0);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lvn;IIII)Lns;")
    public abstract class57 method555(class246 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!tq", name = "x", descriptor = "()Z")
    public abstract boolean method556();

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "([Lns;Lmu;[Lro;I)V")
    public abstract void method557(class57[] arg0, class315 arg1, class117[] arg2, int arg3);

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "(IIIII)V")
    public final void method558(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method519(arg2, arg4, arg0, arg3, arg1);
        field862++;
    }

    @OriginalMember(owner = "client!tq", name = "y", descriptor = "()I")
    public abstract int method559();

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "(IIII)[I")
    public abstract int[] method560(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lku;)V")
    public abstract void method561(class381 arg0);

    @OriginalMember(owner = "client!tq", name = "z", descriptor = "()I")
    public abstract int method562();

    @OriginalMember(owner = "client!tq", name = "A", descriptor = "()V")
    public abstract void method563();

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "(I)V")
    public abstract void method564(int arg0);

    @OriginalMember(owner = "client!tq", name = "B", descriptor = "()Lmu;")
    public abstract class315 method565();

    @OriginalMember(owner = "client!tq", name = "C", descriptor = "()Z")
    public abstract boolean method566();

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "(IIIIII)Z")
    public abstract boolean method567(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!tq", name = "D", descriptor = "()Z")
    public abstract boolean method568();

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "(IIIIII)V")
    public abstract void method569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "(IIII)V")
    public abstract void method570(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tq", name = "E", descriptor = "()Z")
    public abstract boolean method571();

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "(IIII)V")
    public abstract void method572(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tq", name = "F", descriptor = "()V")
    public abstract void method573();

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIZ)Ldp;")
    public abstract class319 method574(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IFFFFF)V")
    public abstract void method575(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!tq", name = "G", descriptor = "()Z")
    public abstract boolean method576();

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(II)V")
    public abstract void method577(int arg0, int arg1);

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(II)I")
    public abstract int method578(int arg0, int arg1);

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "(IIIII)V")
    public abstract void method579(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!tq", name = "H", descriptor = "()Lmu;")
    public abstract class315 method580();

    @OriginalMember(owner = "client!tq", name = "I", descriptor = "()Z")
    public abstract boolean method581();

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "(IIIII)V")
    public final void method582(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field867++;
        this.method550(arg3, arg0, arg1, arg2, 1);
        if (arg4 != -15118) {
            this.method503((class57[]) null, (class268) null, (class315) null, (class117[]) null, 39);
        }
    }

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "(II)I")
    public abstract int method583(int arg0, int arg1);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BIIIII)V")
    public final void method584(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field863++;
        this.method569(arg3, arg5, arg1, arg2, arg4, 1);
        int var7 = 51 % ((74 - arg0) / 48);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(F)V")
    public abstract void method585(float arg0);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(FFF)V")
    public abstract void method586(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!tq", name = "J", descriptor = "()V")
    public abstract void method587();

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(ILcp;)V")
    public class63(int arg0, class481 arg1) {
        this.field871 = arg1;
        this.field870 = arg0;
    }

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "(I)V")
    public static void method588(int arg0) {
        field861 = null;
        field868 = null;
        if (arg0 != 16) {
            method497((class212) null);
        }
    }

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "(I)V")
    public abstract void method589(int arg0);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(II[[I[[IIII)Lcl;")
    public abstract class48 method590(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!tq", name = "K", descriptor = "()V")
    public abstract void method591();

    @OriginalMember(owner = "client!tq", name = "L", descriptor = "()Z")
    public abstract boolean method592();
}
