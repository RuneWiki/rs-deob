import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class98 {

    @OriginalMember(owner = "client!r", name = "h", descriptor = "Lfa;")
    public class615 field1459;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public int field1463;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "[I")
    public static int[] field1455 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!r", name = "g", descriptor = "[I")
    public static int[] field1458 = new int[2048];

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field1454 = -1;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BLf;)V", line = 14)
    public final void method745(byte arg0, class257 arg1) {
        this.method68(arg1, true);
        field1462++;
        if (arg0 != 39) {
            field1454 = -56;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V", line = 30)
    public final void method750(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method817(arg2, arg0, arg3, arg4, 1);
        if (arg1 == 24708) {
            field1452++;
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V", line = 46)
    public final void method753(int arg0) {
        if (arg0 != 1) {
            field1464 = 47;
        }
        class493.field7076[this.field1463] = false;
        field1466++;
        this.method105();
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lis;I)V", line = 66)
    public static final void method759(class101 arg0, int arg1) {
        if (arg0.field1584 == 5 && arg0.field1565 != -1) {
            class167.method1260(-16777216, class637.field9048, arg0);
        }
        field1453++;
        if (arg1 != -1) {
            method759(null, -54);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BILvo;Ljava/awt/Canvas;ILfa;)Lr;", line = 81)
    public static final synchronized class98 method761(byte arg0, int arg1, class345 arg2, Canvas arg3, int arg4, class615 arg5) {
        field1456++;
        if (arg1 == 0) {
            return class673.method3812(arg3, (byte) -51, arg5);
        } else if (arg1 == 2) {
            return class25.method246((byte) -126, arg3, arg5);
        } else if (arg1 == 1) {
            return class72.method584(arg3, arg4, 90, arg5);
        } else if (arg1 == 5) {
            return class282.method1752(arg2, arg0 ^ 0x4A, arg4, arg5, arg3);
        } else if (arg1 == 3) {
            return class185.method1324(arg0 ^ 0x2DFA, arg5, arg3, arg4, arg2);
        } else {
            if (arg0 != -117) {
                field1454 = -12;
            }
            throw new IllegalArgumentException("UM");
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIB)V", line = 119)
    public final void method762(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var7 = -97 / ((-arg5 - 35) / 38);
        this.method791(arg4, arg0, arg1, arg3, arg2, 1);
        field1460++;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIII)V", line = 150)
    public final void method773(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1467++;
        if (arg1 != 128) {
            field1458 = null;
        }
        this.method741(arg4, arg0, arg2, arg3, 1);
    }

    @OriginalMember(owner = "client!r", name = "finalize", descriptor = "()V", line = 188)
    protected void finalize() {
        this.method753(1);
        field1465++;
    }

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(I)V", line = 201)
    public static void method790(int arg0) {
        if (arg0 != 1) {
            method790(-59);
        }
        field1455 = null;
        field1458 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBIIII)V", line = 215)
    public final void method792(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != -88) {
            method759(null, -22);
        }
        field1470++;
        this.method824(arg5, arg3, arg2, arg0, arg4, 1);
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(IIIIII)V", line = 261)
    public final void method813(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method782(arg5, arg2, arg0, arg4, arg1, 1);
        field1457++;
        if (arg3 < 82) {
            this.method144();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIBII)V", line = 274)
    public final void method815(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1469++;
        this.method747(arg3, arg0, arg4, arg1, 1);
        if (arg2 > -5) {
            this.field1459 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lfa;)V", line = 309)
    public class98(class615 arg0) {
        this.field1459 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class493.field7076[var3]) {
                var2 = var3;
                class493.field7076[var3] = true;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field1463 = var2;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lqg;)V")
    public abstract void method737(class272 arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)I")
    public abstract int method738(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()Z")
    public abstract boolean method739();

    @OriginalMember(owner = "client!r", name = "c", descriptor = "()V")
    public abstract void method137();

    @OriginalMember(owner = "client!r", name = "d", descriptor = "()Lq;")
    public abstract class152 method740();

    @OriginalMember(owner = "client!r", name = "XA", descriptor = "(IIIII)V")
    public abstract void method741(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "e", descriptor = "()Z")
    public abstract boolean method742();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method743(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lpa;)V")
    public abstract void method744(class587 arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
    public abstract void method108(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
    public abstract int method746();

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIII)V")
    public abstract void method747(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II[I[I)Lua;")
    public abstract class591 method748(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIZ)Lf;")
    public abstract class257 method749(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!r", name = "DA", descriptor = "()I")
    public abstract int method144();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public abstract void method751(int arg0);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public abstract void method752(int arg0);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)I")
    public abstract int method754(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lq;)V")
    public abstract void method755(class152 arg0);

    @OriginalMember(owner = "client!r", name = "VA", descriptor = "(IFFFFF)V")
    public abstract void method756(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!r", name = "f", descriptor = "()Z")
    public abstract boolean method757();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method758(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "CA", descriptor = "(IIII)V")
    public abstract void method760(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method93(Rectangle[] arg0, int arg1) throws class300;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(FFF)V")
    public abstract void method80(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!r", name = "pa", descriptor = "(III)V")
    public abstract void method763(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!r", name = "oa", descriptor = "([I)V")
    public abstract void method764(int[] arg0);

    @OriginalMember(owner = "client!r", name = "GA", descriptor = "(II)V")
    public abstract void method765(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "g", descriptor = "()Z")
    public abstract boolean method766();

    @OriginalMember(owner = "client!r", name = "h", descriptor = "()Z")
    public abstract boolean method767();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II[[I[[IIII)Li;")
    public abstract class682 method768(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
    public abstract void method97(boolean arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([I)V")
    public abstract void method769(int[] arg0);

    @OriginalMember(owner = "client!r", name = "ZA", descriptor = "(Z)V")
    public abstract void method770(boolean arg0);

    @OriginalMember(owner = "client!r", name = "da", descriptor = "(IIII)V")
    public abstract void method771(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "i", descriptor = "()Z")
    public abstract boolean method100();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lfda;Z)Lf;")
    public abstract class257 method772(class628 arg0, boolean arg1);

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
    public abstract void method774(int arg0);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "()I")
    public abstract int method775();

    @OriginalMember(owner = "client!r", name = "ja", descriptor = "(I)V")
    public abstract void method118(int arg0);

    @OriginalMember(owner = "client!r", name = "j", descriptor = "()V")
    public abstract void method776();

    @OriginalMember(owner = "client!r", name = "k", descriptor = "()Lq;")
    public abstract class152 method777();

    @OriginalMember(owner = "client!r", name = "l", descriptor = "()Z")
    public abstract boolean method778();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIILua;II)V")
    public abstract void method779(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class591 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!r", name = "m", descriptor = "()Lsr;")
    public abstract class568 method77();

    @OriginalMember(owner = "client!r", name = "FA", descriptor = "(ILua;II)V")
    public abstract void method780(int arg0, class591 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "va", descriptor = "(I)V")
    public abstract void method781(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lpa;Lpa;FLpa;)Lpa;")
    public abstract class587 method83(class587 arg0, class587 arg1, float arg2, class587 arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V")
    public abstract void method782(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(I)Le;")
    public abstract class698 method783(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIF)Lam;")
    public abstract class289 method784(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!r", name = "n", descriptor = "()Z")
    public abstract boolean method785();

    @OriginalMember(owner = "client!r", name = "o", descriptor = "()Z")
    public abstract boolean method786();

    @OriginalMember(owner = "client!r", name = "ya", descriptor = "()V")
    public abstract void method138();

    @OriginalMember(owner = "client!r", name = "MA", descriptor = "(III[I)V")
    public abstract void method787(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!r", name = "O", descriptor = "(IIIIII)Z")
    public abstract boolean method788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "p", descriptor = "()V")
    public abstract void method105();

    @OriginalMember(owner = "client!r", name = "IA", descriptor = "(IIIIII[BII)V")
    public abstract void method789(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIIII)V")
    public abstract void method791(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V")
    public abstract void method793(boolean arg0);

    @OriginalMember(owner = "client!r", name = "ra", descriptor = "(F)V")
    public abstract void method794(float arg0);

    @OriginalMember(owner = "client!r", name = "q", descriptor = "()V")
    public abstract void method87() throws class300;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lcr;IIII)Lda;")
    public abstract class397 method795(class163 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "T", descriptor = "()I")
    public abstract int method796();

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(IIIIII)Lpa;")
    public abstract class587 method797(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "r", descriptor = "()V")
    public abstract void method128();

    @OriginalMember(owner = "client!r", name = "s", descriptor = "()Z")
    public abstract boolean method798();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lqg;I)V")
    public abstract void method799(class272 arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method800(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "t", descriptor = "()Z")
    public abstract boolean method801();

    @OriginalMember(owner = "client!r", name = "u", descriptor = "()I")
    public abstract int method802();

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method803(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lll;[Lfda;Z)Lla;")
    public abstract class395 method804(class490 arg0, class628[] arg1, boolean arg2);

    @OriginalMember(owner = "client!r", name = "JA", descriptor = "()V")
    public abstract void method805();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([IIIII)Lf;")
    public abstract class257 method806(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
    public abstract void method807(int arg0);

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method808(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "YA", descriptor = "(IIII)V")
    public abstract void method809(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "AA", descriptor = "(III[I)V")
    public abstract void method810(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method811(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!r", name = "w", descriptor = "()Lq;")
    public abstract class152 method812();

    @OriginalMember(owner = "client!r", name = "x", descriptor = "()V")
    public abstract void method88();

    @OriginalMember(owner = "client!r", name = "y", descriptor = "()Z")
    public abstract boolean method814();

    @OriginalMember(owner = "client!r", name = "z", descriptor = "()Z")
    public abstract boolean method816();

    @OriginalMember(owner = "client!r", name = "m", descriptor = "(IIIII)V")
    public abstract void method817(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "V", descriptor = "(IIII)V")
    public abstract void method818(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "la", descriptor = "(IIII)V")
    public abstract void method819(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "BA", descriptor = "()I")
    public abstract int method820();

    @OriginalMember(owner = "client!r", name = "L", descriptor = "()V")
    public abstract void method821();

    @OriginalMember(owner = "client!r", name = "h", descriptor = "(IIII)[I")
    public abstract int[] method133(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lf;Z)V")
    public abstract void method68(class257 arg0, boolean arg1);

    @OriginalMember(owner = "client!r", name = "A", descriptor = "()V")
    public abstract void method102();

    @OriginalMember(owner = "client!r", name = "B", descriptor = "()Z")
    public abstract boolean method95();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Le;)V")
    public abstract void method822(class698 arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I[Lam;)V")
    public abstract void method823(int arg0, class289[] arg1);

    @OriginalMember(owner = "client!r", name = "h", descriptor = "(I)V")
    public abstract void method147(int arg0);

    @OriginalMember(owner = "client!r", name = "C", descriptor = "()V")
    public abstract void method67();

    @OriginalMember(owner = "client!r", name = "J", descriptor = "(IIIIII)V")
    public abstract void method824(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZ)Lf;")
    public abstract class257 method825(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!r", name = "v", descriptor = "()[I")
    public abstract int[] method826();
}
