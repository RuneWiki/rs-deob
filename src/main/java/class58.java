import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public abstract class class58 {

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public int field744 = -1;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "[Lin;")
    public static class182[] field752 = new class182[14];

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field751 = 0;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 19)
    public final void method449(byte arg0) {
        if (arg0 == -74) {
            field746++;
            class383.field5272[this.field744] = false;
            this.method267();
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIZII)V", line = 31)
    public final void method450(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field753++;
        if (arg2) {
            this.method212(arg4, arg3, arg0, arg1, 1);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BIIII)V", line = 53)
    public final void method451(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method224(arg2, arg4, arg3, arg1, 1);
        if (arg0 == -44) {
            field755++;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/awt/Canvas;Lne;IBILgf;)Lea;", line = 70)
    public static final synchronized class58 method452(Canvas arg0, class76 arg1, int arg2, byte arg3, int arg4, class202 arg5) {
        field749++;
        int var6 = -1;
        int var7 = 0;
        if (arg3 != 54) {
            method456((class316) null, 80);
        }
        while (var7 < 8) {
            if (!class383.field5272[var7]) {
                var6 = var7;
                break;
            }
            var7++;
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        class58 var9;
        if (arg4 == 0) {
            var9 = class318.method1944(var6, 122, arg0, arg5);
        } else if (arg4 == 1) {
            var9 = class419.method2585(arg1, var6, arg5, arg0, arg2, (byte) -89);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class383.field5272[var6] = true;
        return var9;
    }

    @OriginalMember(owner = "client!ea", name = "finalize", descriptor = "()V", line = 119)
    protected final void finalize() {
        this.method449((byte) -74);
        field747++;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(II)I", line = 132)
    public static final int method453(int arg0, int arg1) {
        field759++;
        return arg1 == 1 ? (arg0 & 0x3FBC7) >> 11 : -8;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(IIIIII)V", line = 160)
    public final void method454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method250(arg4, arg2, arg5, arg3, arg0, 1);
        field756++;
        if (arg1 >= -3) {
            this.method197();
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V", line = 203)
    public static final void method455(boolean arg0) {
        if (!arg0) {
            method457('-', 58);
        }
        field754++;
        class72.field1047.method2522((byte) 103);
        class442.field6208.method2522((byte) 50);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lij;I)V", line = 221)
    public static final void method456(class316 arg0, int arg1) {
        class349.field4708 = arg0;
        field748++;
        if (arg1 >= -45) {
            method458(22);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(CI)Z", line = 241)
    public static final boolean method457(char arg0, int arg1) {
        if (arg1 != 97) {
            field750 = -105;
        }
        field757++;
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V", line = 253)
    public static void method458(int arg0) {
        if (arg0 <= 6) {
            method455(false);
        }
        field752 = null;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(IIIIZ)V", line = 266)
    public final void method459(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method184(arg3, arg1, arg0, arg2, 1);
        field758++;
        if (!arg4) {
            field752 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BIIIII)V", line = 287)
    public final void method460(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method190(arg1, arg5, arg3, arg4, arg2, 1);
        if (arg0 != 48) {
            this.method264();
        }
        field745++;
    }

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "(IIIIII)V", line = 301)
    public final void method461(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method245(arg4, arg5, arg0, arg2, arg1, 1);
        if (arg3 != -91) {
            this.method256((class267) null);
        }
        field760++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II[[I[[IIII)Ldn;")
    public abstract class323 method230(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(FF)V")
    public abstract void method180(float arg0, float arg1);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIZ)Lwn;")
    public abstract class77 method177(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "()Z")
    public abstract boolean method252();

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "()V")
    public abstract void method169();

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "()Z")
    public abstract boolean method218();

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)V")
    public abstract void method194(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(IIII)V")
    public abstract void method206(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V")
    public abstract void method229(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V")
    public abstract void method176(int arg0, int arg1);

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)I")
    public abstract int method213(int arg0, int arg1);

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "()Z")
    public abstract boolean method259();

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(IIII)V")
    public abstract void method179(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "()Z")
    public abstract boolean method197();

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "()V")
    public abstract void method266();

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[Lbn;)V")
    public abstract void method247(int arg0, class155[] arg1);

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "()Lve;")
    public abstract class309 method220();

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method185(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIII)V")
    public abstract void method212(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(IIIII)V")
    public abstract void method184(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "()Z")
    public abstract boolean method166();

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lsg;)V")
    public abstract void method256(class267 arg0);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lci;[Ljf;Z)Lok;")
    public abstract class61 method262(class389 arg0, class96[] arg1, boolean arg2);

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(II)I")
    public abstract int method187(int arg0, int arg1);

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "()Z")
    public abstract boolean method211();

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILde;II)V")
    public abstract void method214(int arg0, class165 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "()V")
    public abstract void method204();

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "()Z")
    public abstract boolean method216();

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "()Z")
    public abstract boolean method263();

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lns;)V")
    public abstract void method219(class174 arg0);

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "()Z")
    public abstract boolean method205();

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIII)Z")
    public abstract boolean method261(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(IIIII)V")
    public abstract void method224(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "()Z")
    public abstract boolean method186();

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "()Lve;")
    public abstract class309 method210();

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "()I")
    public abstract int method200();

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "()V")
    public abstract void method267();

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)Llf;")
    public abstract class341 method236(int arg0);

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "()V")
    public abstract void method228();

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(II)V")
    public abstract void method238(int arg0, int arg1);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lri;IIII)Lts;")
    public abstract class116 method254(class98 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(IIII)[I")
    public abstract int[] method239(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([I)V")
    public abstract void method173(int[] arg0);

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(IIIIII)V")
    public abstract void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(IIIIII)V")
    public abstract void method245(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II[I[I)Lde;")
    public abstract class165 method193(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "()I")
    public abstract int method264();

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "()Z")
    public abstract boolean method192();

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([IIIII)Lwn;")
    public abstract class77 method232(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "()V")
    public abstract void method209();

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "()V")
    public abstract void method191();

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "()I")
    public abstract int method253();

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([Lts;Lns;Lve;[Luh;I)V")
    public abstract void method225(class116[] arg0, class174 arg1, class309 arg2, class153[] arg3, int arg4);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III[I)V")
    public abstract void method243(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(IIIIII)V")
    public abstract void method250(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "()I")
    public abstract int method258();

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "()Z")
    public abstract boolean method217();

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "()V")
    public abstract void method257();

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IFFFFF)V")
    public abstract void method171(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "()I")
    public abstract int method215();

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(F)V")
    public abstract void method248(float arg0);

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "()V")
    public abstract void method201();

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lsg;Lsg;FLsg;)Lsg;")
    public abstract class267 method255(class267 arg0, class267 arg1, float arg2, class267 arg3);

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
    public abstract void method183(int arg0);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Llf;)V")
    public abstract void method231(class341 arg0);

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "()Z")
    public abstract boolean method241();

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljf;Z)Lwn;")
    public abstract class77 method199(class96 arg0, boolean arg1);

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "()F")
    public abstract float method268();

    @OriginalMember(owner = "client!ea", name = "H", descriptor = "()F")
    public abstract float method188();

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
    public abstract void method265(int arg0);

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(III)V")
    public abstract void method175(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(FFF)V")
    public abstract void method249(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)V")
    public abstract void method165(boolean arg0);

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "(IIIIII)Lsg;")
    public abstract class267 method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lts;Lns;Lve;Luh;I)V")
    public abstract void method172(class116 arg0, class174 arg1, class309 arg2, class153 arg3, int arg4);

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "()I")
    public abstract int method203();

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([Lts;Lve;[Luh;I)V")
    public abstract void method167(class116[] arg0, class309 arg1, class153[] arg2, int arg3);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIILde;II)V")
    public abstract void method246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class165 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIII[BII)V")
    public abstract void method170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ea", name = "J", descriptor = "()Z")
    public abstract boolean method226();

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V")
    public abstract void method233(int arg0);

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(Z)V")
    public abstract void method207(boolean arg0);

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "()Z")
    public abstract boolean method223();

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lve;)V")
    public abstract void method168(class309 arg0);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method240(Canvas arg0);

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)V")
    public abstract void method181(int arg0);

    @OriginalMember(owner = "client!ea", name = "L", descriptor = "()V")
    public abstract void method202();

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "(I)V")
    public abstract void method237(int arg0);

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(IIII)V")
    public abstract void method227(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(Z)V")
    public abstract void method235(boolean arg0);
}
