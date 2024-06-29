import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class66 {

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "Ld;")
    public class162 field890;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public int field904;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "Llf;")
    public static class251 field895 = new class251(0, 1);

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "Z")
    public static boolean field909 = false;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "Llja;")
    public static class744 field910 = new class744(44, 8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V", line = 11)
    public final void method559(byte arg0) {
        class333.field4125[this.field904] = false;
        field897++;
        if (arg0 == 1) {
            this.method53();
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BI)I", line = 45)
    public static final int method575(byte arg0, int arg1) {
        field903++;
        if (arg0 <= 39) {
            field909 = false;
        }
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BIIII)V", line = 57)
    public final void method577(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 114) {
            this.method616();
        }
        this.method563(arg3, arg1, arg4, arg2, 1);
        field902++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V", line = 74)
    public final void method580(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < -83) {
            this.method593(arg0, arg1, arg4, arg3, 1);
            field892++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V", line = 100)
    public final void method591(byte arg0) throws class677 {
        int var2 = 125 / ((-arg0 - 5) / 62);
        this.method5(0, 0);
        field899++;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIII)V", line = 112)
    public final void method594(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 0) {
            field910 = null;
        }
        field891++;
        this.method597(arg1, arg2, arg3, arg0, 1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(JI)V", line = 124)
    public static final void method596(long arg0, int arg1) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        if (arg1 <= 119) {
            field909 = true;
        }
        field905++;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V", line = 141)
    public final void method598(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field898++;
        if (arg2 >= 123) {
            this.method633(arg3, arg1, arg0, arg4, arg5, 1);
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)V", line = 157)
    public final void method600(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method645(arg0, arg1, arg5, arg4, arg3, 1);
        field908++;
        if (arg2 != 785580130) {
            this.method592(-80, 3, -23, 75, 16, -109);
        }
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)V", line = 169)
    public static final void method602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field889++;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg2 * arg2;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        if (arg1 >= -88) {
            field910 = null;
        }
        int var12 = arg5 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg5 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (arg0 >= class187.field2268 && class461.field6480 >= arg0) {
            int var20 = class155.method1103(class471.field6572, arg2 + arg4, false, class223.field2604);
            int var21 = class155.method1103(class471.field6572, arg4 - arg2, false, class223.field2604);
            class455.method2755(arg3, class4.field49[arg0], (byte) 76, var20, var21);
        }
        int var22 = (arg5 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var19 += var16;
                    var6++;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var6++;
                var17 += var16;
                var19 += var16;
            }
            var14 += -var18;
            var13 += -var22;
            var22 -= var15;
            var18 -= var15;
            var7--;
            int var23 = arg0 - var7;
            int var24 = arg0 + var7;
            if (var24 >= class187.field2268 && var23 <= class461.field6480) {
                int var25 = class155.method1103(class471.field6572, arg4 + var6, false, class223.field2604);
                int var26 = class155.method1103(class471.field6572, arg4 - var6, false, class223.field2604);
                if (var23 >= class187.field2268) {
                    class455.method2755(arg3, class4.field49[var23], (byte) 44, var25, var26);
                }
                if (class461.field6480 >= var24) {
                    class455.method2755(arg3, class4.field49[var24], (byte) 39, var25, var26);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V", line = 282)
    protected void finalize() {
        field894++;
        this.method559((byte) 1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILd;Lbt;IIILjava/awt/Canvas;B)Lha;", line = 315)
    public static final synchronized class66 method618(int arg0, class162 arg1, class48 arg2, int arg3, int arg4, int arg5, Canvas arg6, byte arg7) {
        field906++;
        if (arg3 == 0) {
            return class32.method305(arg5, arg0, true, arg1, arg6);
        } else if (arg3 == 2) {
            return class358.method2099(true, arg5, arg0, arg6, arg1);
        } else if (arg7 <= 60) {
            return null;
        } else if (arg3 == 1) {
            return class112.method896(arg1, arg6, arg4, (byte) -102);
        } else if (arg3 == 5) {
            return class328.method1948((byte) -125, arg4, arg6, arg1, arg2);
        } else if (arg3 == 3) {
            return class492.method2902(arg6, arg2, false, arg1, arg4);
        } else {
            throw new IllegalArgumentException("UM");
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIII)Ltf;", line = 362)
    public final class312 method623(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field893++;
        if (arg2 != 1) {
            this.method599();
        }
        return this.method652(arg0, arg5, arg3, arg4, arg1, true);
    }

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V", line = 374)
    public static void method624(int arg0) {
        if (arg0 != 0) {
            field895 = null;
        }
        field910 = null;
        field895 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;II)V", line = 398)
    public final void method630(Rectangle[] arg0, int arg1, int arg2) throws class677 {
        this.method92(arg0, arg2, 0, 0);
        if (arg1 > -69) {
            this.method562();
        }
        field907++;
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(IIIIII)V", line = 412)
    public final void method631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field896++;
        if (arg2 == -9665) {
            this.method592(arg4, arg0, arg1, arg3, arg5, 1);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ltf;B)V", line = 432)
    public final void method636(class312 arg0, byte arg1) {
        field900++;
        if (arg1 != 101) {
            this.method643(62, 66, null, null);
        }
        this.method67(this.method70(arg0, this.method52(arg0.method1640(), arg0.method1637())));
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BII)Z", line = 450)
    public static final boolean method641(byte arg0, int arg1, int arg2) {
        if (arg0 < 23) {
            method575((byte) -113, 54);
        }
        field901++;
        return (arg1 & 0xC580) != 0;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ld;)V", line = 461)
    public class66(class162 arg0) {
        this.field890 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class333.field4125[var3]) {
                var2 = var3;
                class333.field4125[var3] = true;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field904 = var2;
    }

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
    public abstract void method553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public abstract void method554(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12);

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
    public abstract void method555(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
    public abstract void method556(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public abstract class296 method557(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljia;)V")
    public abstract void method558(class645 arg0);

    @OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
    public abstract void method560(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()Z")
    public abstract boolean method561();

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
    public abstract int method562();

    @OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
    public abstract void method563(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
    public abstract void method564();

    @OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
    public abstract int[] method87(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
    public abstract void method565(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
    public abstract void method566(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lso;IIII)Lka;")
    public abstract class498 method567(class496 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
    public abstract int method568();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()V")
    public abstract void method2();

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
    public abstract int[] method569();

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
    public abstract void method570(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
    public abstract void method571(int arg0);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
    public abstract int method572(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()Z")
    public abstract boolean method71();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Lkp;")
    public abstract class515 method573(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()Lnh;")
    public abstract class778 method574();

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()Lnh;")
    public abstract class778 method576();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
    public abstract void method40(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
    public abstract void method578(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
    public abstract void method69(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lbq;[Lcr;Z)Lda;")
    public abstract class67 method579(class307 arg0, class600[] arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lza;)V")
    public abstract void method581(class435 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Lsea;")
    public abstract class726 method44(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Laf;)V")
    public abstract void method582(class460 arg0);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "()I")
    public abstract int method583();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public abstract void method584(int arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)Lza;")
    public abstract class435 method585(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public abstract void method586(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Lkp;)V")
    public abstract void method587(int arg0, class515[] arg1);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
    public abstract void method50(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public abstract void method589(int arg0);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "()V")
    public abstract void method25();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Laf;I)V")
    public abstract void method590(class460 arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)V")
    public abstract void method592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
    public abstract void method593(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method595(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
    public abstract void method13(int arg0);

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
    public abstract void method597(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "()Z")
    public abstract boolean method599();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
    public abstract void method31(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "()Z")
    public abstract boolean method601();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
    public abstract void method61(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "()Z")
    public abstract boolean method603();

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "()Z")
    public abstract boolean method604();

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
    public abstract void method605(int arg0);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
    public abstract void method606(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
    public abstract void method607(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method608(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
    public abstract void method609(int arg0);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
    public abstract int method610();

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(IIIIII)Ljia;")
    public abstract class645 method611(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)Lup;")
    public abstract class292 method52(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "()Z")
    public abstract boolean method612();

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "()Lub;")
    public abstract class22 method60();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method613(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lnm;)V")
    public abstract void method67(class499 arg0);

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "()Lnh;")
    public abstract class778 method614();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lsea;Lup;)Lnm;")
    public abstract class499 method70(class726 arg0, class292 arg1);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)V")
    public abstract void method5(int arg0, int arg1) throws class677;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
    public abstract void method615(int arg0);

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
    public abstract int method616();

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILaa;II)V")
    public abstract void method617(int arg0, class513 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;II)V")
    public abstract void method619(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class513 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)I")
    public abstract int method620(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public abstract void method621(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class513 arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "()V")
    public abstract void method53();

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "()Z")
    public abstract boolean method622();

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
    public abstract int method81();

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "()Z")
    public abstract boolean method625();

    @OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
    public abstract void method626(float arg0);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
    public abstract void method56(int arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method627(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lnh;)V")
    public abstract void method628(class778 arg0);

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "()V")
    public abstract void method20();

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "()Z")
    public abstract boolean method629();

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "()Z")
    public abstract boolean method54();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljia;Ljia;FLjia;)Ljia;")
    public abstract class645 method65(class645 arg0, class645 arg1, float arg2, class645 arg3);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)I")
    public abstract int method632(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public abstract void method92(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class677;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(IIIIII)V")
    public abstract void method633(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
    public abstract void method634();

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
    public abstract void method635(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method637(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Ltf;")
    public abstract class312 method638(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "()Z")
    public abstract boolean method639();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lcr;Z)Ltf;")
    public abstract class312 method640(class600 arg0, boolean arg1);

    @OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
    public abstract void method642(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "()V")
    public abstract void method32();

    @OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
    public abstract void method6();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Laa;")
    public abstract class513 method643(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Ltf;")
    public abstract class312 method644(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
    public abstract void method645(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "()Z")
    public abstract boolean method646();

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "()V")
    public abstract void method36();

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "()V")
    public abstract void method647();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
    public abstract void method648(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
    public abstract int method649(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
    public abstract void method650(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
    public abstract void method651(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Ltf;")
    public abstract class312 method652(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);
}
