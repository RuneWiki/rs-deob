import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class class635 {

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "Le;")
    public class486 field8990;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public int field8985;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Lkfa;")
    public static class549 field8982 = new class549(42, 7);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field8979;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field8980;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field8981;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field8983;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field8984;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field8986;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field8987;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field8988;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field8989;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field8991;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field8992;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field8993;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V", line = 4)
    public final void method3548(boolean arg0) {
        class526.field7516[this.field8985] = arg0;
        field8979++;
        this.method295();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIB)V", line = 26)
    public final void method3549(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != 54) {
            this.field8985 = -103;
        }
        field8988++;
        this.method361(arg3, arg2, arg1, arg0, 1);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V", line = 39)
    public static final void method3550(boolean arg0) {
        class334.field4314.method2554(class300.field3924.method1737(true), 255);
        field8992++;
        class334.field4314.method2554(class408.field5434.method1737(true), 255);
        class334.field4314.method2554(class294.field3869.method1737(true), 255);
        class334.field4314.method2554(class443.field6110.method1737(true), 255);
        class334.field4314.method2554(class581.field8259.method1737(true), 255);
        class334.field4314.method2554(class299.field3914.method1737(true), 255);
        class334.field4314.method2554(class403.field5364.method1737(arg0), 255);
        class334.field4314.method2554(class389.field5195.method1737(true), 255);
        class334.field4314.method2554(class633.field8972.method1737(arg0), 255);
        class334.field4314.method2554(class344.field4480.method1737(true), 255);
        class334.field4314.method2554(class70.field750.method1737(true), 255);
        class334.field4314.method2554(class674.field9566.method1737(true), 255);
        class334.field4314.method2554(class178.field2179.method1737(arg0), 255);
        class334.field4314.method2554(class57.field593.method1737(true), 255);
        class334.field4314.method2554(class194.field2332.method1737(arg0), 255);
        class334.field4314.method2554(class639.field9069.method1737(true), 255);
        class334.field4314.method2554(class85.field900.method1737(true), 255);
        class334.field4314.method2554(class144.field1615.method1737(arg0), 255);
        class334.field4314.method2554(class315.field4096.method1737(arg0), 255);
        class334.field4314.method2554(class147.field1648.method1737(true), 255);
        class334.field4314.method2554(class516.field7385.method1737(true), 255);
        class334.field4314.method2554(class135.field1527.method1737(true), 255);
        class334.field4314.method2554(class314.field4050.method1737(true), 255);
        class334.field4314.method2554(class683.field9689.method1737(arg0), 255);
        class334.field4314.method2554(class386.field5156.method1737(true), 255);
        class334.field4314.method2554(class355.field4661.method1737(true), 255);
        class334.field4314.method2554(class393.field5240.method1737(true), 255);
        class334.field4314.method2554(class198.field2402.method1737(true), 255);
        class334.field4314.method2554(class67.field723.method1737(arg0), 255);
        class334.field4314.method2554(class345.field4510.method1737(true), 255);
        class334.field4314.method2554(class311.field4023.method1737(true), 255);
        class334.field4314.method2554(class457.field6380.method1737(true), 255);
        class334.field4314.method2554(class189.method1099(-128), 255);
        class334.field4314.method2554(class568.method3208(1), 255);
    }

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V", line = 83)
    protected void finalize() {
        this.method3548(false);
        field8993++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V", line = 94)
    public static void method3551(byte arg0) {
        field8982 = null;
        if (arg0 != 28) {
            field8982 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V", line = 110)
    public final void method3552(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method286(arg5, arg4, arg1, arg0, arg3, 1);
        field8983++;
        if (arg2 != 7) {
            this.method337();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII)V", line = 154)
    public final void method3553(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != -4271) {
            this.method343(-3);
        }
        field8987++;
        this.method370(arg0, arg3, arg2, arg1, 1);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V", line = 187)
    public final void method3554(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 == 6459) {
            this.method353(arg2, arg5, arg1, arg3, arg0, 1);
            field8981++;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjo;ILjava/awt/Canvas;Le;I)Loa;", line = 208)
    public static final synchronized class635 method3555(int arg0, class303 arg1, int arg2, Canvas arg3, class486 arg4, int arg5) {
        field8989++;
        if (arg5 == 0) {
            return class457.method2607(11763, arg4, false, arg3);
        }
        if (arg0 >= -63) {
            method3550(true);
        }
        if (arg5 == 2) {
            return class476.method2776(arg3, arg4, 34);
        } else if (arg5 == 4) {
            return class457.method2607(11763, arg4, true, arg3);
        } else if (arg5 == 1) {
            return class222.method1299((byte) -29, arg4, arg3, arg2);
        } else if (arg5 == 5) {
            return class426.method2299(arg2, arg1, arg3, (byte) -125, arg4);
        } else if (arg5 == 3) {
            return class290.method1638(arg3, -5696, arg2, arg4, arg1);
        } else {
            throw new IllegalArgumentException("UM");
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBIIII)V", line = 255)
    public final void method3556(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method334(arg4, arg0, arg3, arg5, arg2, 1);
        field8984++;
        if (arg1 < 13) {
            this.method313(-47, 18, -2, 127, 35, -107, null, -79, -28);
        }
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Le;)V", line = 269)
    public class635(class486 arg0) {
        this.field8990 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class526.field7516[var3]) {
                class526.field7516[var3] = true;
                var2 = var3;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field8985 = var2;
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)[Lgl;", line = 319)
    public static final class547[] method3557(int arg0) {
        field8991++;
        return arg0 == -9002 ? new class547[] { class306.field3996, class403.field5365, class526.field7523, class610.field8623, class551.field7860, class250.field3229, class176.field2099, class454.field6295, class664.field9438, class248.field3193, class24.field295, class68.field733, class357.field4678, class428.field5680, class284.field3603, class617.field8682 } : null;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIII)V", line = 346)
    public final void method3558(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8980++;
        if (arg0 >= 56) {
            this.method344(arg2, arg3, arg4, arg1, 1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)[I")
    public abstract int[] method277(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ldga;)V")
    public abstract void method384(class190 arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public abstract void method307(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Led;[Laaa;Z)Lta;")
    public abstract class195 method349(class645 arg0, class563[] arg1, boolean arg2);

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "()I")
    public abstract int method385();

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(IIII)V")
    public abstract void method278(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "ka", descriptor = "(FF)V")
    public abstract void method366(float arg0, float arg1);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public abstract void method333(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()Z")
    public abstract boolean method386();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method300(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()Z")
    public abstract boolean method310();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lod;)V")
    public abstract void method355(int arg0, class463[] arg1);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ldga;Ldga;FLdga;)Ldga;")
    public abstract class190 method290(class190 arg0, class190 arg1, float arg2, class190 arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method325(Canvas arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lqda;IIII)Lba;")
    public abstract class350 method375(class90 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()V")
    public abstract void method280();

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z")
    public abstract boolean method377();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lba;Lq;[Lmr;I)V")
    public abstract void method381(class350[] arg0, class389 arg1, class130[] arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "()V")
    public abstract void method378();

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method273(Canvas arg0);

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(III)V")
    public abstract void method363(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "(IIIIII)Z")
    public abstract boolean method357(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()V")
    public abstract void method341() throws class295;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "(I)V")
    public abstract void method343(int arg0);

    @OriginalMember(owner = "client!oa", name = "sa", descriptor = "(II)V")
    public abstract void method342(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Laaa;Z)Lxa;")
    public abstract class458 method351(class563 arg0, boolean arg1);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)V")
    public abstract void method346(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()Z")
    public abstract boolean method332();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ld;")
    public abstract class137 method282(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
    public abstract int method372(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()Lq;")
    public abstract class389 method297();

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()V")
    public abstract void method295();

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()V")
    public abstract void method305();

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()V")
    public abstract void method347();

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)Li;")
    public abstract class37 method308(int arg0);

    @OriginalMember(owner = "client!oa", name = "IA", descriptor = "()I")
    public abstract int method321();

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z")
    public abstract boolean method338();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIII)Lxa;")
    public abstract class458 method326(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "(IIII)V")
    public abstract void method306(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lod;")
    public abstract class463 method319(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
    public abstract void method322(int arg0);

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()I")
    public abstract int method352();

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(I)V")
    public abstract void method369(int arg0);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "([I)V")
    public abstract void method274(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method374(Canvas arg0);

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()V")
    public abstract void method339();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lq;)V")
    public abstract void method311(class389 arg0);

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()V")
    public abstract void method358();

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()Z")
    public abstract boolean method376();

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(IIIIII[BII)V")
    public abstract void method281(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(Z)V")
    public abstract void method293(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ltg;)V")
    public abstract void method283(class211 arg0);

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIII)V")
    public abstract void method361(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(IIIII)V")
    public abstract void method370(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()Lhl;")
    public abstract class482 method298();

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V")
    public abstract void method334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z")
    public abstract boolean method323();

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "(IIIII)V")
    public abstract void method344(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
    public abstract void method304(int arg0);

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z")
    public abstract boolean method275();

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()V")
    public abstract void method324();

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(IIIIII)Ldga;")
    public abstract class190 method365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "ca", descriptor = "(IIII)V")
    public abstract void method314(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
    public abstract void method317(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!oa", name = "LA", descriptor = "(IIII)V")
    public abstract void method299(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lba;Ltg;Lq;[Lmr;I)V")
    public abstract void method373(class350[] arg0, class211 arg1, class389 arg2, class130[] arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()Lq;")
    public abstract class389 method371();

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z")
    public abstract boolean method276();

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(III[I)V")
    public abstract void method331(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method285(Rectangle[] arg0, int arg1) throws class295;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()Z")
    public abstract boolean method360();

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIIII)V")
    public abstract void method353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Li;)V")
    public abstract void method292(class37 arg0);

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z")
    public abstract boolean method316();

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()Z")
    public abstract boolean method291();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lxa;")
    public abstract class458 method279(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(Z)V")
    public abstract void method329(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIII)V")
    public abstract void method330(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILfa;II)V")
    public abstract void method313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class213 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lba;Ltg;Lq;Lmr;I)V")
    public abstract void method301(class350 arg0, class211 arg1, class389 arg2, class130 arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(ILfa;II)V")
    public abstract void method328(int arg0, class213 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()Z")
    public abstract boolean method315();

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
    public abstract void method288(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Lfa;")
    public abstract class213 method362(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()I")
    public abstract int method302();

    @OriginalMember(owner = "client!oa", name = "YA", descriptor = "(IFFFFF)V")
    public abstract void method320(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "()Z")
    public abstract boolean method380();

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "()V")
    public abstract void method367();

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(IIIIII)V")
    public abstract void method286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "()Z")
    public abstract boolean method336();

    @OriginalMember(owner = "client!oa", name = "ha", descriptor = "(F)V")
    public abstract void method368(float arg0);

    @OriginalMember(owner = "client!oa", name = "SA", descriptor = "()I")
    public abstract int method345();

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method284(Canvas arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
    public abstract void method296(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "()I")
    public abstract int method337();

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I")
    public abstract int method312(int arg0, int arg1);
}
