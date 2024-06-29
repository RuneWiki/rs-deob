import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class class167 {

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "Ll;")
    public class16 field2505;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public int field2503;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Lqv;")
    public static class316 field2509 = new class316(100, 0);

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "Lsn;")
    public static class453 field2519 = new class453("stellardawn", 1);

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "Lqv;")
    public static class316 field2520 = new class316(31, -1);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "[I")
    public static int[] field2517;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)V", line = 16)
    public final void method1191(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 == -256) {
            field2512++;
            this.method293(arg3, arg0, arg4, arg1, 1);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIII)Z", line = 79)
    public static final boolean method1192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg8 != 1) {
            method1192(64, -38, 46, -13, -46, 82, 82, -69, -4);
        }
        field2513++;
        if (arg2 + arg0 > arg4 && arg4 + arg5 > arg2) {
            return arg3 < arg6 + arg1 && arg3 + arg7 > arg6;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)V", line = 108)
    public final void method1193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method215(arg2, arg1, arg3, arg4, arg5, arg0);
        field2507++;
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V", line = 124)
    public static final void method1194(int arg0) {
        if (arg0 != 31) {
            method1196(51, null, null, null, -99, -50);
        }
        class157.field2402.method314(class540.field7953, class220.field3371.field2571 ? class196.field2866 + 256 << 0 : -1, 256);
        field2506++;
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(IIIIII)V", line = 137)
    public final void method1195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2518++;
        if (arg2 != -1) {
            this.method324(-61, 68, -20, 36, 64);
        }
        this.method242(arg3, arg0, arg1, arg4, arg5, 1);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILl;Lul;Ljava/awt/Canvas;II)Lqa;", line = 150)
    public static final synchronized class167 method1196(int arg0, class16 arg1, class411 arg2, Canvas arg3, int arg4, int arg5) {
        field2516++;
        int var6 = -1;
        int var7 = 0;
        if (arg4 != -32568) {
            field2517 = null;
        }
        while (var7 < 8) {
            if (!class528.field7722[var7]) {
                var6 = var7;
                break;
            }
            var7++;
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        class167 var9;
        if (arg0 == 0) {
            var9 = class171.method1209(9, arg1, arg3, var6);
        } else if (arg0 == 1) {
            var9 = class15.method86(arg2, arg5, var6, 1001, arg1, arg3);
        } else if (arg0 == 2) {
            var9 = class263.method1698(arg3, -86, arg2, arg1, var6);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class528.field7722[var6] = true;
        return var9;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V", line = 206)
    public final void method1197(byte arg0) {
        if (arg0 != -48) {
            field2520 = null;
        }
        class528.field7722[this.field2503] = false;
        field2504++;
        this.method300();
    }

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V", line = 231)
    protected void finalize() {
        this.method1197((byte) -48);
        field2515++;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)V", line = 244)
    public static void method1198(byte arg0) {
        if (arg0 > -126) {
            method1198((byte) -35);
        }
        field2509 = null;
        field2520 = null;
        field2517 = null;
        field2519 = null;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V", line = 264)
    public final void method1199(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2508++;
        if (arg3 != 17136) {
            this.method242(107, 91, 103, -75, 34, -125);
        }
        this.method324(arg2, arg0, arg4, arg1, 1);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZIIIII)V", line = 279)
    public final void method1200(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2514++;
        if (!arg0) {
            this.method305();
        }
        this.method327(arg2, arg1, arg4, arg5, arg3, 1);
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(ILl;)V", line = 296)
    public class167(int arg0, class16 arg1) {
        this.field2505 = arg1;
        this.field2503 = arg0;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIII)V", line = 316)
    public final void method1201(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method361(arg0, arg4, arg1, arg3, 1);
        if (arg2 != 6565) {
            field2517 = null;
        }
        field2510++;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public abstract void method198(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lho;Z)Laa;")
    public abstract class343 method308(class104 arg0, boolean arg1);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method362(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "(IIII)V")
    public abstract void method190(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()Z")
    public abstract boolean method350();

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()Z")
    public abstract boolean method326();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lkv;Lkv;FLkv;)Lkv;")
    public abstract class181 method238(class181 arg0, class181 arg1, float arg2, class181 arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lch;IIII)Lka;")
    public abstract class336 method225(class330 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "sa", descriptor = "()I")
    public abstract int method237();

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "()V")
    public abstract void method283();

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "()V")
    public abstract void method241();

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "()Z")
    public abstract boolean method292();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lka;Lwg;Ln;Lwc;I)V")
    public abstract void method332(class336 arg0, class300 arg1, class15 arg2, class48 arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "()V")
    public abstract void method280();

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method270(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIII)V")
    public abstract void method325(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "(II)V")
    public abstract void method306(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
    public abstract void method213(int arg0);

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "()Z")
    public abstract boolean method346();

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "()Z")
    public abstract boolean method336();

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method311(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "()Z")
    public abstract boolean method184();

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
    public abstract void method192(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lka;Ln;[Lwc;I)V")
    public abstract void method323(class336[] arg0, class15 arg1, class48[] arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)Lw;")
    public abstract class200 method262(int arg0);

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "()Z")
    public abstract boolean method189();

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "()V")
    public abstract void method300();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lgg;[Lho;Z)Lba;")
    public abstract class269 method279(class119 arg0, class104[] arg1, boolean arg2);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Laa;")
    public abstract class343 method284(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "(IIII)[I")
    public abstract int[] method304(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public abstract void method269(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "()I")
    public abstract int method360();

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "([I)V")
    public abstract void method246(int[] arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)Lkv;")
    public abstract class181 method218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Laa;")
    public abstract class343 method255(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method259(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "(I)V")
    public abstract void method233(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lw;)V")
    public abstract void method299(class200 arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V")
    public abstract void method231(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
    public abstract void method251(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ln;)V")
    public abstract void method209(class15 arg0);

    @OriginalMember(owner = "client!qa", name = "GA", descriptor = "(ILi;II)V")
    public abstract void method322(int arg0, class31 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
    public abstract int method252(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "xa", descriptor = "()I")
    public abstract int method358();

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(IIIII)V")
    public abstract void method293(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lkv;)V")
    public abstract void method294(class181 arg0);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
    public abstract void method265(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILi;II)V")
    public abstract void method228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class31 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "()Z")
    public abstract boolean method187();

    @OriginalMember(owner = "client!qa", name = "na", descriptor = "()I")
    public abstract int method197();

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "()Z")
    public abstract boolean method220();

    @OriginalMember(owner = "client!qa", name = "KA", descriptor = "(IIII)V")
    public abstract void method203(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "()F")
    public abstract float method272();

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method264(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIIII)V")
    public abstract void method327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method206(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "()F")
    public abstract float method212();

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "()Z")
    public abstract boolean method318();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lka;Lwg;Ln;[Lwc;I)V")
    public abstract void method274(class336[] arg0, class300 arg1, class15 arg2, class48[] arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Li;")
    public abstract class31 method224(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lni;)V")
    public abstract void method226(int arg0, class369[] arg1);

    @OriginalMember(owner = "client!qa", name = "PA", descriptor = "(FF)V")
    public abstract void method221(float arg0, float arg1);

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "()V")
    public abstract void method268();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
    public abstract void method247(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!qa", name = "IA", descriptor = "(IIII)V")
    public abstract void method185(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lwg;)V")
    public abstract void method253(class300 arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Lni;")
    public abstract class369 method334(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "()V")
    public abstract void method305();

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "(I)V")
    public abstract void method351(int arg0);

    @OriginalMember(owner = "client!qa", name = "BA", descriptor = "(IIIII)V")
    public abstract void method324(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "ua", descriptor = "(IIIIII[BII)V")
    public abstract void method335(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "(IIIIII)V")
    public abstract void method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "()V")
    public abstract void method250();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lo;")
    public abstract class24 method223(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "()I")
    public abstract int method338();

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "()Z")
    public abstract boolean method329();

    @OriginalMember(owner = "client!qa", name = "MA", descriptor = "(F)V")
    public abstract void method331(float arg0);

    @OriginalMember(owner = "client!qa", name = "ha", descriptor = "(III)V")
    public abstract void method314(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "()V")
    public abstract void method179();

    @OriginalMember(owner = "client!qa", name = "XA", descriptor = "(III[I)V")
    public abstract void method359(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "la", descriptor = "(IFFFFF)V")
    public abstract void method194(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "()Ln;")
    public abstract class15 method312();

    @OriginalMember(owner = "client!qa", name = "TA", descriptor = "(IIIIII)Z")
    public abstract boolean method328(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "()Z")
    public abstract boolean method236();

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "(IIIII)V")
    public abstract void method361(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "()Z")
    public abstract boolean method354();

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(IIIIII)V")
    public abstract void method242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "()V")
    public abstract void method316();

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
    public abstract void method317(int arg0);

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "()Z")
    public abstract boolean method340();

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "()Z")
    public abstract boolean method182();

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "(IIII)V")
    public abstract void method345(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I")
    public abstract int method217(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "()Ln;")
    public abstract class15 method245();

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "()I")
    public abstract int method303();

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
    public abstract void method273(boolean arg0);
}
