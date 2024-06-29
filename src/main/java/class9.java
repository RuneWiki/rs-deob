import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public abstract class class9 {

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "I")
    public int field120 = -1;

    @OriginalMember(owner = "client!fp", name = "m", descriptor = "I")
    public static int field124 = 0;

    @OriginalMember(owner = "client!fp", name = "l", descriptor = "Lbt;")
    public static class363 field123 = new class363(30);

    @OriginalMember(owner = "client!fp", name = "q", descriptor = "I")
    public static int field128 = 0;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!fp", name = "k", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!fp", name = "n", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!fp", name = "o", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!fp", name = "p", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "()V")
    public abstract void method67();

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I[Lap;)V")
    public abstract void method68(int arg0, class298[] arg1);

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "()Z")
    public abstract boolean method69();

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lci;)V")
    public abstract void method70(class400 arg0);

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(II[I[I)Ltm;")
    public abstract class195 method71(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "()V")
    public abstract void method72();

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIII)[I")
    public abstract int[] method73(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(III)V")
    public abstract void method74(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(FFF)V")
    public abstract void method75(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "([I)V")
    public abstract void method76(int[] arg0);

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(IIII)V")
    public abstract void method77(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "()Z")
    public abstract boolean method78();

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Z)V")
    public abstract void method79(boolean arg0);

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "()I")
    public abstract int method80();

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(FF)V")
    public abstract void method81(float arg0, float arg1);

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIIII)Lsd;")
    public abstract class71 method82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "()V")
    public abstract void method83();

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "()Lm;")
    public abstract class187 method84();

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(II)I")
    public abstract int method85(int arg0, int arg1);

    @OriginalMember(owner = "client!fp", name = "k", descriptor = "()Z")
    public abstract boolean method86();

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
    public abstract void method87(int arg0);

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(IIIIII)V")
    public final void method88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field112++;
        if (arg5 > -69) {
            field127 = -92;
        }
        this.method156(arg1, arg4, arg3, arg0, arg2, 1);
    }

    @OriginalMember(owner = "client!fp", name = "l", descriptor = "()Z")
    public abstract boolean method89();

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIIIBIIII)V")
    public static final void method90(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 != 79) {
            method90(42, 119, 113, -52, 59, (byte) 95, -90, -93, -117, -38);
        }
        if (arg3 == arg9 && arg6 == arg7 && arg2 == arg8 && arg0 == arg1) {
            class75.method529(arg2, arg0, arg5 ^ 0x31, arg3, arg7, arg4);
        } else {
            int var10 = arg3;
            int var11 = arg7;
            int var12 = arg3 * 3;
            int var13 = arg7 * 3;
            int var14 = arg9 * 3;
            int var15 = arg6 * 3;
            int var16 = arg8 * 3;
            int var17 = arg1 * 3;
            int var18 = arg2 - (var16 - var14) - arg3;
            int var19 = arg0 + var15 - var17 - arg7;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var29 + var31 + var27 >> 12) + arg3;
                int var34 = arg7 + (var28 + var32 + var30 >> 12);
                class75.method529(var33, var34, arg5 - 186, var10, var11, arg4);
                var11 = var34;
                var10 = var33;
            }
        }
        field122++;
    }

    @OriginalMember(owner = "client!fp", name = "m", descriptor = "()I")
    public abstract int method91();

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(II[[I[[IIII)Lui;")
    public abstract class378 method92(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(II)V")
    public abstract void method93(int arg0, int arg1);

    @OriginalMember(owner = "client!fp", name = "n", descriptor = "()Z")
    public abstract boolean method94();

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V")
    public static void method95(byte arg0) {
        if (arg0 > -90) {
            method90(-82, -20, -25, -48, 1, (byte) -53, 62, 43, -91, -12);
        }
        field123 = null;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIIIILtm;II)V")
    public abstract void method96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class195 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIII)V")
    public abstract void method97(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "([IIIII)Lae;")
    public abstract class285 method98(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)Lmk;")
    public abstract class161 method99(int arg0);

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ltr;Z)Lae;")
    public abstract class285 method100(class144 arg0, boolean arg1);

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(IIII)V")
    public abstract void method101(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!fp", name = "o", descriptor = "()V")
    public abstract void method102();

    @OriginalMember(owner = "client!fp", name = "p", descriptor = "()I")
    public abstract int method103();

    @OriginalMember(owner = "client!fp", name = "q", descriptor = "()I")
    public abstract int method104();

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILtm;II)V")
    public abstract void method105(int arg0, class195 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(IIIII)V")
    public abstract void method106(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lm;)V")
    public abstract void method107(class187 arg0);

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "([Lbi;Lci;Lm;[Loo;I)V")
    public abstract void method108(class143[] arg0, class400 arg1, class187 arg2, class396[] arg3, int arg4);

    @OriginalMember(owner = "client!fp", name = "r", descriptor = "()Z")
    public abstract boolean method109();

    @OriginalMember(owner = "client!fp", name = "s", descriptor = "()Z")
    public abstract boolean method110();

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(I)V")
    public abstract void method111(int arg0);

    @OriginalMember(owner = "client!fp", name = "t", descriptor = "()I")
    public abstract int method112();

    @OriginalMember(owner = "client!fp", name = "u", descriptor = "()Z")
    public abstract boolean method113();

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(III[I)V")
    public abstract void method114(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(IIIII)V")
    public abstract void method115(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(IIIIII)Z")
    public abstract boolean method116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!fp", name = "v", descriptor = "()Z")
    public abstract boolean method117();

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lsd;)V")
    public abstract void method118(class71 arg0);

    @OriginalMember(owner = "client!fp", name = "w", descriptor = "()V")
    public abstract void method119();

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lat;I)V")
    public static final void method120(class256 arg0, int arg1) {
        for (int var2 = arg1; var2 < class228.field3434; var2++) {
            int var3 = arg0.method1740(128);
            int var4 = arg0.method1767(arg1 + 1930493576);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class388.field5675[var3] != null) {
                class388.field5675[var3].field1838 = var4;
            }
        }
        field116++;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lhi;[Ltr;Z)Ldf;")
    public abstract class85 method122(class365 arg0, class144[] arg1, boolean arg2);

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIIZ)Lae;")
    public abstract class285 method123(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!fp", name = "x", descriptor = "()V")
    public abstract void method124();

    @OriginalMember(owner = "client!fp", name = "y", descriptor = "()V")
    public abstract void method125();

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "(IIIII)V")
    public final void method126(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 2702) {
            field123 = null;
        }
        field118++;
        this.method115(arg0, arg4, arg2, arg1, 1);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lmk;)V")
    public abstract void method127(class161 arg0);

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIBI)V")
    public final void method128(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var6 = -10 % ((arg3 + 26) / 61);
        field117++;
        this.method106(arg2, arg1, arg0, arg4, 1);
    }

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "(I)V")
    public abstract void method129(int arg0);

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIIBI)V")
    public final void method130(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        this.method137(arg1, arg3, arg5, arg2, arg0, 1);
        if (arg4 < 87) {
            this.method160();
        }
        field121++;
    }

    @OriginalMember(owner = "client!fp", name = "z", descriptor = "()V")
    public abstract void method131();

    @OriginalMember(owner = "client!fp", name = "A", descriptor = "()F")
    public abstract float method132();

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IFFFFF)V")
    public abstract void method133(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!fp", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method136(123);
        field114++;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!fp", name = "B", descriptor = "()Z")
    public abstract boolean method135();

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "(I)V")
    public final void method136(int arg0) {
        field119++;
        if (arg0 > 37) {
            class248.field3650[this.field120] = false;
            this.method124();
        }
    }

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "(IIIIII)V")
    public abstract void method137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "(I)V")
    public abstract void method138(int arg0);

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(II)I")
    public abstract int method139(int arg0, int arg1);

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "(II)V")
    public abstract void method140(int arg0, int arg1);

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILge;I)V")
    public static final void method141(int arg0, class108 arg1, int arg2) {
        field125++;
        if (arg2 < 85) {
            field123 = null;
        }
        class282.field4147 = false;
        class367.field5309 = 0;
        class466.method2872(59, arg1);
        class465.method2867(100, arg1);
        if (class282.field4147) {
            System.out.println("---endgpp---");
        }
        if (arg1.field3762 != arg0) {
            throw new RuntimeException("gpi1 pos:" + arg1.field3762 + " psize:" + arg0);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lsd;Lsd;FLsd;)Lsd;")
    public abstract class71 method142(class71 arg0, class71 arg1, float arg2, class71 arg3);

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method143(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "(I)V")
    public abstract void method144(int arg0);

    @OriginalMember(owner = "client!fp", name = "C", descriptor = "()Lm;")
    public abstract class187 method145();

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(Z)V")
    public abstract void method146(boolean arg0);

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "([Lbi;Lm;[Loo;I)V")
    public abstract void method147(class143[] arg0, class187 arg1, class396[] arg2, int arg3);

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(Z)V")
    public abstract void method148(boolean arg0);

    @OriginalMember(owner = "client!fp", name = "D", descriptor = "()F")
    public abstract float method149();

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "(IIIIII)V")
    public final void method150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method164(arg2, arg1, arg5, arg3, arg4, 1);
        field113++;
        if (arg0 >= -6) {
            this.method101(-48, 81, -79, -69);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIILic;Lgt;Ljava/awt/Canvas;)Lfp;")
    public static final synchronized class9 method151(int arg0, int arg1, int arg2, class235 arg3, class341 arg4, Canvas arg5) {
        field115++;
        if (arg2 != 65535) {
            method95((byte) -8);
        }
        int var6 = -1;
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class248.field3650[var7]) {
                var6 = var7;
                break;
            }
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        class9 var9;
        if (arg0 == 0) {
            var9 = class55.method421(arg5, true, arg3, var6);
        } else if (arg0 == 1) {
            var9 = class187.method1279(arg5, var6, arg1, arg4, (byte) 51, arg3);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class248.field3650[var6] = true;
        return var9;
    }

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "(IIII)V")
    public abstract void method152(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!fp", name = "F", descriptor = "()I")
    public abstract int method153();

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(III)V")
    public abstract void method154(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "(IIIII)V")
    public final void method155(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field126++;
        this.method97(arg0, arg4, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "(IIIIII)V")
    public abstract void method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method157(Canvas arg0);

    @OriginalMember(owner = "client!fp", name = "G", descriptor = "()V")
    public abstract void method158();

    @OriginalMember(owner = "client!fp", name = "H", descriptor = "()Z")
    public abstract boolean method159();

    @OriginalMember(owner = "client!fp", name = "I", descriptor = "()Z")
    public abstract boolean method160();

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(F)V")
    public abstract void method161(float arg0);

    @OriginalMember(owner = "client!fp", name = "J", descriptor = "()V")
    public abstract void method162();

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Le;IIII)Lbi;")
    public abstract class143 method163(class100 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "(IIIIII)V")
    public abstract void method164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!fp", name = "K", descriptor = "()Z")
    public abstract boolean method165();

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lbi;Lci;Lm;Loo;I)V")
    public abstract void method166(class143 arg0, class400 arg1, class187 arg2, class396 arg3, int arg4);

    @OriginalMember(owner = "client!fp", name = "L", descriptor = "()Z")
    public abstract boolean method167();

    @OriginalMember(owner = "client!fp", name = "M", descriptor = "()Z")
    public abstract boolean method168();

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIIII[BII)V")
    public abstract void method169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "(IIII)V")
    public abstract void method170(int arg0, int arg1, int arg2, int arg3);
}
