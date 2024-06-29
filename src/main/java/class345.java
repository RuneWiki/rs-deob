import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public abstract class class345 {

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "I")
    public int field4704 = -1;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field4696 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "I")
    public static int field4692 = 127;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "Lnq;")
    public static class268 field4691;

    static {
        new class442("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V", line = 13)
    public static void method2180(byte arg0) {
        field4691 = null;
        field4696 = null;
        if (arg0 != 57) {
            method2184(-126);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIII)V", line = 41)
    public final void method2181(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -23605) {
            this.method105((class238) null, false);
        }
        this.method138(arg4, arg3, arg0, arg2, 1);
        field4701++;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIII)V", line = 52)
    public final void method2182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4702++;
        this.method56(arg0, arg1, arg2, arg5, arg3, 1);
        int var7 = -38 % ((-arg4 - 8) / 47);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/awt/Canvas;ILko;ILja;I)Luo;", line = 66)
    public static final synchronized class345 method2183(Canvas arg0, int arg1, class294 arg2, int arg3, class152 arg4, int arg5) {
        field4700++;
        int var6 = -1;
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class150.field2130[var7]) {
                var6 = var7;
                break;
            }
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        class345 var9;
        if (arg3 == 0) {
            var9 = class386.method2449(arg0, var6, 0, arg4);
        } else if (arg3 == 1) {
            var9 = class415.method2602(arg5, (byte) 120, arg2, arg0, arg4, var6);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class150.field2130[var6] = true;
        if (arg1 > -95) {
            method2186((byte) -78);
        }
        return var9;
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)V", line = 112)
    public static final void method2184(int arg0) {
        field4698++;
        class328.field4540.method905((byte) 79);
        if (arg0 < 85) {
            method2186((byte) -85);
        }
    }

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(IIIII)Lck;", line = 169)
    public static final class384 method2185(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4706++;
        class176[] var5 = null;
        class415 var6 = class387.method2452(27545, arg0);
        if (arg2 != 0) {
            method2180((byte) 101);
        }
        if (var6.field5894 != null) {
            var5 = new class176[var6.field5894.length];
            for (int var7 = 0; var7 < var5.length; var7++) {
                class431 var8 = class275.method1795(var6.field5894[var7], arg2 + 30);
                var5[var7] = new class176(var8.field6093, var8.field6094, var8.field6086, var8.field6089, var8.field6088, var8.field6095, var8.field6096, var8.field6098);
            }
        }
        return new class384(var6.field5899, var5, var6.field5887, arg4, arg1, arg3);
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)V", line = 211)
    public static final void method2186(byte arg0) {
        field4693++;
        class406.field5775.method888(-111);
        int var1 = -37 / ((34 - arg0) / 62);
        class126.field1780.method888(127);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIBI)V", line = 229)
    public final void method2187(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        this.method119(arg3, arg0, arg2, arg1, arg5, 1);
        int var7 = 27 / ((-arg4 - 5) / 62);
        field4695++;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIB)V", line = 243)
    public final void method2188(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        this.method59(arg2, arg3, arg0, arg1, arg4, 1);
        field4697++;
        if (arg5 != -34) {
            field4692 = 107;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BIIII)V", line = 264)
    public final void method2189(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method42(arg4, arg2, arg1, arg3, 1);
        field4705++;
        if (arg0 > -73) {
            field4691 = null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "finalize", descriptor = "()V", line = 280)
    protected final void finalize() {
        field4694++;
        this.method2190(false);
    }

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(Z)V", line = 296)
    public final void method2190(boolean arg0) {
        class150.field2130[this.field4704] = arg0;
        field4703++;
        this.method100();
    }

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "(IIIII)V", line = 307)
    public final void method2191(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4699++;
        this.method133(arg1, arg4, arg0, arg3, 1);
        if (arg2 > -15) {
            field4691 = null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Z)V")
    public abstract void method55(boolean arg0);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "([I)V")
    public abstract void method107(int[] arg0);

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "()Z")
    public abstract boolean method69();

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "()F")
    public abstract float method97();

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "()I")
    public abstract int method145();

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V")
    public abstract void method103(int arg0);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IFFFFF)V")
    public abstract void method67(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "()Z")
    public abstract boolean method51();

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "()V")
    public abstract void method100();

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lbr;IIII)Lmj;")
    public abstract class394 method62(class223 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)V")
    public abstract void method114(int arg0);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIILep;II)V")
    public abstract void method132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class241 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "()Z")
    public abstract boolean method93();

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lk;[Llg;Z)Lai;")
    public abstract class357 method76(class337 arg0, class238[] arg1, boolean arg2);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIII)V")
    public abstract void method45(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "()Z")
    public abstract boolean method125();

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method81(Canvas arg0);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(F)V")
    public abstract void method90(float arg0);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)I")
    public abstract int method139(int arg0, int arg1);

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "()Z")
    public abstract boolean method124();

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(IIIII)V")
    public abstract void method133(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "()V")
    public abstract void method70();

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "()V")
    public abstract void method135();

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(IIIIII)V")
    public abstract void method56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(IIIII)V")
    public abstract void method138(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(II[[I[[IIII)Lij;")
    public abstract class242 method88(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "()V")
    public abstract void method43();

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(IIIIII)V")
    public abstract void method119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(IIII)V")
    public abstract void method136(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(I)V")
    public abstract void method110(int arg0);

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "()Z")
    public abstract boolean method99();

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(II)V")
    public abstract void method120(int arg0, int arg1);

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "()Z")
    public abstract boolean method78();

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(II[I[I)Lep;")
    public abstract class241 method61(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "([IIIII)Lsg;")
    public abstract class226 method128(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!uo", name = "q", descriptor = "()Z")
    public abstract boolean method52();

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIZ)Lsg;")
    public abstract class226 method117(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "(I)V")
    public abstract void method94(int arg0);

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "(I)Lip;")
    public abstract class423 method65(int arg0);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I[Lbh;)V")
    public abstract void method113(int arg0, class24[] arg1);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(III)V")
    public abstract void method57(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lqe;Lqe;FLqe;)Lqe;")
    public abstract class275 method82(class275 arg0, class275 arg1, float arg2, class275 arg3);

    @OriginalMember(owner = "client!uo", name = "r", descriptor = "()V")
    public abstract void method143();

    @OriginalMember(owner = "client!uo", name = "s", descriptor = "()V")
    public abstract void method95();

    @OriginalMember(owner = "client!uo", name = "t", descriptor = "()V")
    public abstract void method60();

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "(I)V")
    public abstract void method98(int arg0);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILep;II)V")
    public abstract void method86(int arg0, class241 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lic;)V")
    public abstract void method126(class417 arg0);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(III[I)V")
    public abstract void method115(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lqe;)V")
    public abstract void method130(class275 arg0);

    @OriginalMember(owner = "client!uo", name = "u", descriptor = "()V")
    public abstract void method129();

    @OriginalMember(owner = "client!uo", name = "v", descriptor = "()Z")
    public abstract boolean method109();

    @OriginalMember(owner = "client!uo", name = "w", descriptor = "()I")
    public abstract int method49();

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lmj;Lmr;Lic;Lvf;I)V")
    public abstract void method72(class394 arg0, class77 arg1, class417 arg2, class84 arg3, int arg4);

    @OriginalMember(owner = "client!uo", name = "x", descriptor = "()Lic;")
    public abstract class417 method84();

    @OriginalMember(owner = "client!uo", name = "y", descriptor = "()I")
    public abstract int method131();

    @OriginalMember(owner = "client!uo", name = "z", descriptor = "()F")
    public abstract float method106();

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lip;)V")
    public abstract void method77(class423 arg0);

    @OriginalMember(owner = "client!uo", name = "A", descriptor = "()Lic;")
    public abstract class417 method101();

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(IIII)V")
    public abstract void method53(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(FF)V")
    public abstract void method80(float arg0, float arg1);

    @OriginalMember(owner = "client!uo", name = "B", descriptor = "()Z")
    public abstract boolean method127();

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIII[BII)V")
    public abstract void method116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(II)I")
    public abstract int method108(int arg0, int arg1);

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "(IIIII)V")
    public abstract void method42(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!uo", name = "C", descriptor = "()Z")
    public abstract boolean method102();

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "([Lmj;Lic;[Lvf;I)V")
    public abstract void method79(class394[] arg0, class417 arg1, class84[] arg2, int arg3);

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(Z)V")
    public abstract void method96(boolean arg0);

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(IIII)V")
    public abstract void method63(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method92(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!uo", name = "D", descriptor = "()I")
    public abstract int method64();

    @OriginalMember(owner = "client!uo", name = "E", descriptor = "()I")
    public abstract int method48();

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "(IIII)[I")
    public abstract int[] method142(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(Z)V")
    public abstract void method137(boolean arg0);

    @OriginalMember(owner = "client!uo", name = "F", descriptor = "()V")
    public abstract void method75();

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "([Lmj;Lmr;Lic;[Lvf;I)V")
    public abstract void method123(class394[] arg0, class77 arg1, class417 arg2, class84[] arg3, int arg4);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(FFF)V")
    public abstract void method144(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(IIIIII)Lqe;")
    public abstract class275 method50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lmr;)V")
    public abstract void method83(class77 arg0);

    @OriginalMember(owner = "client!uo", name = "G", descriptor = "()V")
    public abstract void method118();

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(II)V")
    public abstract void method47(int arg0, int arg1);

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "(IIIIII)Z")
    public abstract boolean method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "(IIIIII)V")
    public abstract void method59(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!uo", name = "H", descriptor = "()I")
    public abstract int method85();

    @OriginalMember(owner = "client!uo", name = "I", descriptor = "()Z")
    public abstract boolean method140();

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Llg;Z)Lsg;")
    public abstract class226 method105(class238 arg0, boolean arg1);

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(III)V")
    public abstract void method111(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!uo", name = "J", descriptor = "()Z")
    public abstract boolean method141();

    @OriginalMember(owner = "client!uo", name = "K", descriptor = "()Z")
    public abstract boolean method66();

    @OriginalMember(owner = "client!uo", name = "L", descriptor = "()Z")
    public abstract boolean method91();
}
