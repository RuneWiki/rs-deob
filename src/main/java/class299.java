import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class299 {

    @OriginalMember(owner = "client!za", name = "a", descriptor = "Ll;")
    public class127 field4588;

    @OriginalMember(owner = "client!za", name = "c", descriptor = "I")
    public int field4590;

    @OriginalMember(owner = "client!za", name = "l", descriptor = "Lpn;")
    public static class49 field4599 = new class49(57, 3);

    @OriginalMember(owner = "client!za", name = "q", descriptor = "Lvg;")
    public static class56 field4604 = new class56(16);

    @OriginalMember(owner = "client!za", name = "r", descriptor = "Ljp;")
    public static class55 field4605 = new class55(5, 0);

    @OriginalMember(owner = "client!za", name = "s", descriptor = "I")
    public static int field4606 = 0;

    @OriginalMember(owner = "client!za", name = "b", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!za", name = "d", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!za", name = "e", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!za", name = "f", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!za", name = "g", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!za", name = "h", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!za", name = "i", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!za", name = "j", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!za", name = "k", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!za", name = "m", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!za", name = "n", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!za", name = "o", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!za", name = "p", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIII)V", line = 11)
    public final void method1986(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4601++;
        this.method566(arg2, arg4, arg3, arg1, arg0);
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(BIIII)V", line = 35)
    public final void method1987(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 <= -72) {
            field4598++;
            this.method548(arg4, arg3, arg2, arg1, 1);
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(B)V", line = 50)
    public final void method1988(byte arg0) {
        field4603++;
        class33.field395[this.field4590] = false;
        this.method556();
        if (arg0 != -48) {
            this.method567(29);
        }
    }

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(IIIII)V", line = 77)
    public final void method1989(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method565(arg1, arg0, arg2, arg3, 1);
        field4592++;
        if (arg4 >= -75) {
            this.method603(null, null, null, 100);
        }
    }

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(B)V", line = 95)
    public static void method1990(byte arg0) {
        field4605 = null;
        if (arg0 >= -80) {
            field4605 = null;
        }
        field4604 = null;
        field4599 = null;
    }

    @OriginalMember(owner = "client!za", name = "c", descriptor = "(IIIIII)V", line = 132)
    public final void method1991(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method506(arg5, arg0, arg2, arg3, arg1, 1);
        if (arg4 <= 17) {
            this.field4590 = 72;
        }
        field4597++;
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IBIIII)V", line = 145)
    public final void method1992(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field4595++;
        this.method602(arg0, arg2, arg3, arg4, arg5, 1);
        int var7 = -70 / ((arg1 - 30) / 55);
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(ZI)Z", line = 167)
    public static final boolean method1993(boolean arg0, int arg1) {
        if (!arg0) {
            field4599 = null;
        }
        field4589++;
        if (arg1 == 30 || arg1 == 22 || arg1 == 20 || arg1 == 10 || arg1 == 1004) {
            return true;
        } else {
            return arg1 == 49 || arg1 == 1003;
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IZII)I", line = 191)
    public static final int method1994(int arg0, boolean arg1, int arg2, int arg3) {
        field4600++;
        class100 var4 = class48.method323(Integer.MIN_VALUE, arg1, arg0);
        if (var4 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = arg3; var6 < var4.field1534.length; var6++) {
                if (var4.field1532[var6] == arg2) {
                    var5 += var4.field1534[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!za", name = "<init>", descriptor = "(ILl;)V", line = 236)
    public class299(int arg0, class127 arg1) {
        this.field4588 = arg1;
        this.field4590 = arg0;
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Ll;ILjava/awt/Canvas;ILgt;I)Lza;", line = 253)
    public static final synchronized class299 method1995(class127 arg0, int arg1, Canvas arg2, int arg3, class66 arg4, int arg5) {
        field4596++;
        int var6 = -1;
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class33.field395[var7]) {
                var6 = var7;
                break;
            }
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        class299 var9;
        if (arg5 == 0) {
            var9 = class489.method2953(arg0, arg2, var6, (byte) -115);
        } else if (arg5 == 1) {
            var9 = class122.method907(0, arg4, arg0, arg2, arg3, var6);
        } else if (arg5 == 2) {
            var9 = class389.method2461(arg0, false, var6, arg4, arg2);
        } else {
            throw new IllegalArgumentException("UM");
        }
        if (arg1 < 57) {
            return null;
        } else {
            class33.field395[var6] = true;
            return var9;
        }
    }

    @OriginalMember(owner = "client!za", name = "e", descriptor = "(IIIIII)V", line = 303)
    public final void method1996(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 6853) {
            this.method590();
        }
        this.method555(arg3, arg1, arg2, arg0, arg4, 1);
        field4591++;
    }

    @OriginalMember(owner = "client!za", name = "finalize", descriptor = "()V", line = 321)
    protected void finalize() {
        this.method1988((byte) -48);
        field4594++;
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "()Z")
    public abstract boolean method553();

    @OriginalMember(owner = "client!za", name = "b", descriptor = "()V")
    public abstract void method530();

    @OriginalMember(owner = "client!za", name = "v", descriptor = "(III[I)V")
    public abstract void method592(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIII)V")
    public abstract void method602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!za", name = "c", descriptor = "()Z")
    public abstract boolean method528();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(I)Ln;")
    public abstract class393 method605(int arg0);

    @OriginalMember(owner = "client!za", name = "d", descriptor = "()V")
    public abstract void method499();

    @OriginalMember(owner = "client!za", name = "pa", descriptor = "()I")
    public abstract int method543();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Z)V")
    public abstract void method591(boolean arg0);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(FFF)V")
    public abstract void method517(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!za", name = "e", descriptor = "()Z")
    public abstract boolean method573();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Ln;)V")
    public abstract void method535(class393 arg0);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIII)V")
    public abstract void method561(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Lbn;Lbn;FLbn;)Lbn;")
    public abstract class307 method550(class307 arg0, class307 arg1, float arg2, class307 arg3);

    @OriginalMember(owner = "client!za", name = "r", descriptor = "()I")
    public abstract int method547();

    @OriginalMember(owner = "client!za", name = "f", descriptor = "()Z")
    public abstract boolean method562();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Lbn;)V")
    public abstract void method526(class307 arg0);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!za", name = "g", descriptor = "()V")
    public abstract void method503();

    @OriginalMember(owner = "client!za", name = "ma", descriptor = "(IIIII)V")
    public abstract void method566(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(IIII)V")
    public abstract void method523(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method518(Canvas arg0);

    @OriginalMember(owner = "client!za", name = "K", descriptor = "(IIIIII[BII)V")
    public abstract void method512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!za", name = "h", descriptor = "()Z")
    public abstract boolean method522();

    @OriginalMember(owner = "client!za", name = "i", descriptor = "()Z")
    public abstract boolean method521();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!za", name = "j", descriptor = "()Z")
    public abstract boolean method581();

    @OriginalMember(owner = "client!za", name = "T", descriptor = "()F")
    public abstract float method498();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Lap;[Lrr;Z)Lla;")
    public abstract class310 method542(class29 arg0, class309[] arg1, boolean arg2);

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(I)V")
    public abstract void method549(int arg0);

    @OriginalMember(owner = "client!za", name = "k", descriptor = "()Z")
    public abstract boolean method544();

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method539(Canvas arg0);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(II[[I[[IIII)Lya;")
    public abstract class11 method540(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "([Le;Lc;[Lwg;I)V")
    public abstract void method603(class289[] arg0, class517 arg1, class41[] arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "l", descriptor = "()Z")
    public abstract boolean method508();

    @OriginalMember(owner = "client!za", name = "c", descriptor = "(I)V")
    public abstract void method504(int arg0);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(I[Lrd;)V")
    public abstract void method519(int arg0, class344[] arg1);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(II[I[I)Lta;")
    public abstract class340 method516(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!za", name = "d", descriptor = "(I)V")
    public abstract void method525(int arg0);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "([IIIII)Lo;")
    public abstract class363 method520(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "P", descriptor = "(IIIIII)V")
    public abstract void method506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!za", name = "da", descriptor = "(FF)V")
    public abstract void method606(float arg0, float arg1);

    @OriginalMember(owner = "client!za", name = "m", descriptor = "()Z")
    public abstract boolean method510();

    @OriginalMember(owner = "client!za", name = "AA", descriptor = "()I")
    public abstract int method537();

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(IIIIII)Lbn;")
    public abstract class307 method583(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!za", name = "o", descriptor = "()I")
    public abstract int method572();

    @OriginalMember(owner = "client!za", name = "q", descriptor = "()Z")
    public abstract boolean method563();

    @OriginalMember(owner = "client!za", name = "ba", descriptor = "(IIII)V")
    public abstract void method571(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "Q", descriptor = "(III)V")
    public abstract void method534(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!za", name = "e", descriptor = "(I)V")
    public abstract void method594(int arg0);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIZ)Lo;")
    public abstract class363 method601(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIF)Lrd;")
    public abstract class344 method569(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(Z)V")
    public abstract void method509(boolean arg0);

    @OriginalMember(owner = "client!za", name = "MA", descriptor = "([I)V")
    public abstract void method545(int[] arg0);

    @OriginalMember(owner = "client!za", name = "ya", descriptor = "(I)V")
    public abstract void method500(int arg0);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(II)I")
    public abstract int method589(int arg0, int arg1);

    @OriginalMember(owner = "client!za", name = "IA", descriptor = "(IIIII)V")
    public abstract void method548(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "d", descriptor = "(IIIIII)V")
    public abstract void method555(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!za", name = "s", descriptor = "()Z")
    public abstract boolean method515();

    @OriginalMember(owner = "client!za", name = "c", descriptor = "(Z)V")
    public abstract void method597(boolean arg0);

    @OriginalMember(owner = "client!za", name = "t", descriptor = "()Z")
    public abstract boolean method570();

    @OriginalMember(owner = "client!za", name = "Y", descriptor = "()I")
    public abstract int method513();

    @OriginalMember(owner = "client!za", name = "u", descriptor = "()Lc;")
    public abstract class517 method538();

    @OriginalMember(owner = "client!za", name = "ra", descriptor = "(ILta;II)V")
    public abstract void method604(int arg0, class340 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "t", descriptor = "(I)V")
    public abstract void method567(int arg0);

    @OriginalMember(owner = "client!za", name = "GA", descriptor = "(IIII)V")
    public abstract void method541(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method536(Canvas arg0);

    @OriginalMember(owner = "client!za", name = "sa", descriptor = "(IIII)[I")
    public abstract int[] method587(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Le;Lvm;Lc;Lwg;I)V")
    public abstract void method584(class289 arg0, class320 arg1, class517 arg2, class41 arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "aa", descriptor = "()F")
    public abstract float method575();

    @OriginalMember(owner = "client!za", name = "s", descriptor = "(IIII)V")
    public abstract void method511(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIILta;II)V")
    public abstract void method533(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class340 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Lrr;Z)Lo;")
    public abstract class363 method574(class309 arg0, boolean arg1);

    @OriginalMember(owner = "client!za", name = "d", descriptor = "(II)V")
    public abstract void method514(int arg0, int arg1);

    @OriginalMember(owner = "client!za", name = "B", descriptor = "(IFFFFF)V")
    public abstract void method596(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!za", name = "HA", descriptor = "(IIII)V")
    public abstract void method599(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Lvm;)V")
    public abstract void method588(class320 arg0);

    @OriginalMember(owner = "client!za", name = "v", descriptor = "()Z")
    public abstract boolean method560();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "([Le;Lvm;Lc;[Lwg;I)V")
    public abstract void method531(class289[] arg0, class320 arg1, class517 arg2, class41[] arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "SA", descriptor = "(Lc;)V")
    public abstract void method582(class517 arg0);

    @OriginalMember(owner = "client!za", name = "n", descriptor = "()V")
    public abstract void method585();

    @OriginalMember(owner = "client!za", name = "JA", descriptor = "(F)V")
    public abstract void method502(float arg0);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method501(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!za", name = "VA", descriptor = "(IIIIII)Z")
    public abstract boolean method578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!za", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method507(Canvas arg0);

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(II)I")
    public abstract int method557(int arg0, int arg1);

    @OriginalMember(owner = "client!za", name = "w", descriptor = "()Lc;")
    public abstract class517 method496();

    @OriginalMember(owner = "client!za", name = "x", descriptor = "()V")
    public abstract void method593();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Lfe;IIII)Le;")
    public abstract class289 method554(class153 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "y", descriptor = "()V")
    public abstract void method580();

    @OriginalMember(owner = "client!za", name = "f", descriptor = "(I)V")
    public abstract void method595(int arg0);

    @OriginalMember(owner = "client!za", name = "ZA", descriptor = "(IIIII)V")
    public abstract void method565(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "z", descriptor = "()V")
    public abstract void method556();

    @OriginalMember(owner = "client!za", name = "A", descriptor = "()Z")
    public abstract boolean method568();

    @OriginalMember(owner = "client!za", name = "B", descriptor = "()V")
    public abstract void method527();

    @OriginalMember(owner = "client!za", name = "OA", descriptor = "()I")
    public abstract int method590();

    @OriginalMember(owner = "client!za", name = "va", descriptor = "()V")
    public abstract void method577();
}
