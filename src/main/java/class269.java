import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public abstract class class269 {

    @OriginalMember(owner = "client!vq", name = "s", descriptor = "I")
    public int field3936 = -1;

    @OriginalMember(owner = "client!vq", name = "n", descriptor = "Lpm;")
    public static class349 field3931 = new class349("Hidden", "Versteckt", "Caché", "Oculto");

    @OriginalMember(owner = "client!vq", name = "r", descriptor = "Z")
    public static boolean field3935;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!vq", name = "l", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!vq", name = "m", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!vq", name = "o", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!vq", name = "p", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "Ltj;")
    public static class108 field3920;

    @OriginalMember(owner = "client!vq", name = "q", descriptor = "Ltj;")
    public static class108 field3934;

    static {
        new class349("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
        field3935 = false;
    }

    @OriginalMember(owner = "client!vq", name = "finalize", descriptor = "()V", line = 8)
    protected final void finalize() {
        field3928++;
        this.method1831((byte) 86);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIII)V", line = 16)
    public final void method1828(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method901(arg0, arg3, arg2, arg1, 1);
        field3933++;
        if (arg4 != -21915) {
            field3935 = false;
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(II)V", line = 34)
    public static final void method1829(int arg0, int arg1) {
        field3923++;
        class276 var2 = class264.method1816((byte) -114, arg1, arg0);
        var2.method1870((byte) 126);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ILbk;Ljava/awt/Canvas;BLml;I)Lvq;", line = 47)
    public static final synchronized class269 method1830(int arg0, class211 arg1, Canvas arg2, byte arg3, class219 arg4, int arg5) {
        field3929++;
        int var6 = -1;
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class371.field5295[var7]) {
                var6 = var7;
                break;
            }
        }
        if (arg3 >= -33) {
            field3920 = null;
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        class269 var9;
        if (arg0 == 0) {
            var9 = class8.method38(arg2, arg1, var6, -68);
        } else if (arg0 == 1) {
            var9 = class59.method392(var6, -1, arg1, arg4, arg2, arg5);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class371.field5295[var6] = true;
        return var9;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V", line = 92)
    public final void method1831(byte arg0) {
        if (arg0 <= 61) {
            this.field3936 = 44;
        }
        field3924++;
        class371.field5295[this.field3936] = false;
        this.method970();
    }

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(IIIIII)V", line = 123)
    public final void method1832(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1012(arg0, arg4, arg2, arg5, arg1, arg3);
        field3922++;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(BILbr;I)V", line = 131)
    public static final void method1833(byte arg0, int arg1, class223 arg2, int arg3) {
        field3918++;
        if (arg2.field3343 == 0) {
            arg2.field3187 = arg2.field3254;
        } else if (arg2.field3343 == 1) {
            arg2.field3187 = (arg3 - arg2.field3250) / 2 + arg2.field3254;
        } else if (arg2.field3343 == 2) {
            arg2.field3187 = arg3 - arg2.field3250 - arg2.field3254;
        } else if (arg2.field3343 == 3) {
            arg2.field3187 = arg2.field3254 * arg3 >> 14;
        } else if (arg2.field3343 == 4) {
            arg2.field3187 = (arg2.field3254 * arg3 >> 14) + (arg3 - arg2.field3250) / 2;
        } else {
            arg2.field3187 = arg3 - arg2.field3250 - (arg2.field3254 * arg3 >> 14);
        }
        if (arg2.field3216 == 0) {
            arg2.field3191 = arg2.field3337;
        } else if (arg2.field3216 == 1) {
            arg2.field3191 = (arg1 - arg2.field3282) / 2 + arg2.field3337;
        } else if (arg2.field3216 == 2) {
            arg2.field3191 = arg1 - arg2.field3337 - arg2.field3282;
        } else if (arg2.field3216 == 3) {
            arg2.field3191 = arg2.field3337 * arg1 >> 14;
        } else if (arg2.field3216 == 4) {
            arg2.field3191 = (arg2.field3337 * arg1 >> 14) + (arg1 - arg2.field3282) / 2;
        } else {
            arg2.field3191 = arg1 - arg2.field3282 - (arg2.field3337 * arg1 >> 14);
        }
        if (class450.field6455 && (client.method1168(arg2).field1055 != 0 || arg2.field3208 == 0)) {
            if (arg2.field3187 < 0) {
                arg2.field3187 = 0;
            } else if (arg2.field3250 + arg2.field3187 > arg3) {
                arg2.field3187 = arg3 - arg2.field3250;
            }
            if (arg2.field3191 < 0) {
                arg2.field3191 = 0;
            } else if (arg2.field3282 + arg2.field3191 > arg1) {
                arg2.field3191 = arg1 - arg2.field3282;
            }
        }
        if (arg0 != 88) {
            field3931 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "(II)Lcf;", line = 218)
    public static final class361 method1834(int arg0, int arg1) {
        field3930++;
        class15 var2 = class449.field6404;
        class361 var3;
        synchronized (class449.field6404) {
            var3 = (class361) class449.field6404.method99(true, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class43.field587.method643(class215.method1502(arg0, (byte) -121), class421.method2645(false, arg0), true);
        class361 var5 = new class361();
        if (var4 != null) {
            var5.method2351(new class130(var4), (byte) -51);
        }
        class15 var6 = class449.field6404;
        synchronized (class449.field6404) {
            class449.field6404.method90(var5, (long) arg0, arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "(IIIIII)V", line = 251)
    public final void method1835(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method869(arg0, arg5, arg1, arg4, arg2, arg3);
        field3927++;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I[J[III)V", line = 278)
    public static final void method1836(int arg0, long[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg0 > -120) {
            return;
        }
        if (arg3 > arg4) {
            int var5 = (arg4 + arg3) / 2;
            int var6 = arg4;
            long var7 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var7;
            int var9 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var9;
            for (int var10 = arg4; var10 < arg3; var10++) {
                if (arg1[var10] < (long) (var10 & 0x1) + var7) {
                    long var11 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6] = var11;
                    int var13 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6++] = var13;
                }
            }
            arg1[arg3] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg3] = arg2[var6];
            arg2[var6] = var9;
            method1836(-126, arg1, arg2, var6 - 1, arg4);
            method1836(-123, arg1, arg2, arg3, var6 + 1);
        }
        field3926++;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIBI)V", line = 341)
    public final void method1837(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        this.method983(arg5, arg0, arg2, arg1, arg3, 1);
        if (arg4 != -106) {
            field3931 = null;
        }
        field3921++;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIB)V", line = 360)
    public static final void method1838(int arg0, int arg1, byte arg2) {
        field3919++;
        class361 var3 = method1834(arg1, 0);
        int var4 = var3.field5206;
        int var5 = var3.field5199;
        int var6 = var3.field5205;
        int var7 = class136.field2107[var6 - var5];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        if (arg2 > -21) {
            method1834(109, -127);
        }
        class312.method2097(arg0 << var5 & var8 | class150.field2254[var4] & ~var8, var4, 0);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIBI)V", line = 394)
    public final void method1839(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 <= 64) {
            this.method960();
        }
        field3932++;
        this.method946(arg0, arg4, arg1, arg2, 1);
    }

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "(I)V", line = 413)
    public static void method1840(int arg0) {
        field3920 = null;
        if (arg0 == -643) {
            field3934 = null;
            field3931 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(BIIII)V", line = 429)
    public final void method1841(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field3925++;
        if (arg0 != -20) {
            this.method950();
        }
        this.method990(arg1, arg4, arg3, arg2, 1);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)V")
    public abstract void method980(int arg0, int arg1);

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ls;)V")
    public abstract void method973(class154 arg0);

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "()V")
    public abstract void method900();

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "()Z")
    public abstract boolean method920();

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIII)V")
    public abstract void method1003(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "()Z")
    public abstract boolean method952();

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(F)V")
    public abstract void method883(float arg0);

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(II[I[I)Lsg;")
    public abstract class226 method1022(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "()V")
    public abstract void method911();

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(IIII)V")
    public abstract void method924(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method985(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(FFF)V")
    public abstract void method965(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "()Z")
    public abstract boolean method976();

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "()V")
    public abstract void method932();

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "()Z")
    public abstract boolean method930();

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lbc;)V")
    public abstract void method999(class205 arg0);

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "()Z")
    public abstract boolean method887();

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Z)V")
    public abstract void method984(boolean arg0);

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lk;Z)Lvj;")
    public abstract class256 method870(class337 arg0, boolean arg1);

    @OriginalMember(owner = "client!vq", name = "l", descriptor = "()V")
    public abstract void method897();

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "([IIIII)Lvj;")
    public abstract class256 method876(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vq", name = "m", descriptor = "()Z")
    public abstract boolean method964();

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(IIII)V")
    public abstract void method1004(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1012(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!vq", name = "n", descriptor = "()I")
    public abstract int method892();

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(IIIIII)Z")
    public abstract boolean method998(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIII[BII)V")
    public abstract void method955(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!vq", name = "o", descriptor = "()Z")
    public abstract boolean method957();

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(III)V")
    public abstract void method1006(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(II[[I[[IIII)Luh;")
    public abstract class92 method997(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!vq", name = "p", descriptor = "()V")
    public abstract void method950();

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
    public abstract void method1007(int arg0);

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lbb;[Lk;Z)Lug;")
    public abstract class335 method1024(class182 arg0, class337[] arg1, boolean arg2);

    @OriginalMember(owner = "client!vq", name = "q", descriptor = "()I")
    public abstract int method896();

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(II)I")
    public abstract int method944(int arg0, int arg1);

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)Lbc;")
    public abstract class205 method934(int arg0);

    @OriginalMember(owner = "client!vq", name = "r", descriptor = "()Z")
    public abstract boolean method1011();

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "([I)V")
    public abstract void method904(int[] arg0);

    @OriginalMember(owner = "client!vq", name = "s", descriptor = "()I")
    public abstract int method906();

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(FF)V")
    public abstract void method956(float arg0, float arg1);

    @OriginalMember(owner = "client!vq", name = "t", descriptor = "()F")
    public abstract float method988();

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "(II)V")
    public abstract void method989(int arg0, int arg1);

    @OriginalMember(owner = "client!vq", name = "u", descriptor = "()Ls;")
    public abstract class154 method1016();

    @OriginalMember(owner = "client!vq", name = "v", descriptor = "()Ls;")
    public abstract class154 method884();

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(IIIII)V")
    public abstract void method990(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vq", name = "w", descriptor = "()I")
    public abstract int method959();

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "(IIII)V")
    public abstract void method937(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vq", name = "x", descriptor = "()Z")
    public abstract boolean method1026();

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "([Lni;Ls;[Lrh;I)V")
    public abstract void method917(class305[] arg0, class154 arg1, class144[] arg2, int arg3);

    @OriginalMember(owner = "client!vq", name = "y", descriptor = "()Z")
    public abstract boolean method864();

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lrm;)V")
    public abstract void method928(class235 arg0);

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "([Lni;Lrm;Ls;[Lrh;I)V")
    public abstract void method1008(class305[] arg0, class235 arg1, class154 arg2, class144[] arg3, int arg4);

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIILsg;II)V")
    public abstract void method933(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class226 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I[Lpc;)V")
    public abstract void method945(int arg0, class402[] arg1);

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lqf;IIII)Lni;")
    public abstract class305 method905(class406 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lro;Lro;FLro;)Lro;")
    public abstract class1 method993(class1 arg0, class1 arg1, float arg2, class1 arg3);

    @OriginalMember(owner = "client!vq", name = "z", descriptor = "()V")
    public abstract void method967();

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ILsg;II)V")
    public abstract void method871(int arg0, class226 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vq", name = "A", descriptor = "()V")
    public abstract void method931();

    @OriginalMember(owner = "client!vq", name = "B", descriptor = "()V")
    public abstract void method879();

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(IIIII)V")
    public abstract void method946(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(Z)V")
    public abstract void method877(boolean arg0);

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1017(Canvas arg0);

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)V")
    public abstract void method886(int arg0);

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "(IIIII)V")
    public abstract void method901(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vq", name = "C", descriptor = "()I")
    public abstract int method895();

    @OriginalMember(owner = "client!vq", name = "D", descriptor = "()Z")
    public abstract boolean method880();

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIZ)Lvj;")
    public abstract class256 method1027(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!vq", name = "E", descriptor = "()F")
    public abstract float method866();

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "(IIIIII)Lro;")
    public abstract class1 method1014(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!vq", name = "F", descriptor = "()Z")
    public abstract boolean method918();

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "(I)V")
    public abstract void method936(int arg0);

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lro;)V")
    public abstract void method948(class1 arg0);

    @OriginalMember(owner = "client!vq", name = "G", descriptor = "()Z")
    public abstract boolean method891();

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(III)V")
    public abstract void method893(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "(II)I")
    public abstract int method863(int arg0, int arg1);

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "(I)V")
    public abstract void method890(int arg0);

    @OriginalMember(owner = "client!vq", name = "H", descriptor = "()I")
    public abstract int method953();

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IFFFFF)V")
    public abstract void method873(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(III[I)V")
    public abstract void method914(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method903(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method1025(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "(IIIIII)V")
    public abstract void method869(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "(IIII)[I")
    public abstract int[] method898(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vq", name = "I", descriptor = "()V")
    public abstract void method970();

    @OriginalMember(owner = "client!vq", name = "J", descriptor = "()Z")
    public abstract boolean method960();

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "(I)V")
    public abstract void method1005(int arg0);

    @OriginalMember(owner = "client!vq", name = "K", descriptor = "()V")
    public abstract void method882();

    @OriginalMember(owner = "client!vq", name = "L", descriptor = "()Z")
    public abstract boolean method971();

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(Z)V")
    public abstract void method874(boolean arg0);

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "(IIIIII)V")
    public abstract void method983(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lni;Lrm;Ls;Lrh;I)V")
    public abstract void method1013(class305 arg0, class235 arg1, class154 arg2, class144 arg3, int arg4);
}
