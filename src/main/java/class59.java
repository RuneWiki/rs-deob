import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class59 {

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "Ld;")
    public class152 field717;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public int field721;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field706 = 1405;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field710 = 2;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III[B)I", line = 14)
    public static final int method399(int arg0, int arg1, int arg2, byte[] arg3) {
        field711++;
        int var4 = -1;
        int var5 = -11 / ((arg0 + 37) / 56);
        for (int var6 = arg2; var6 < arg1; var6++) {
            var4 = var4 >>> 8 ^ class180.field2727[(arg3[var6] ^ var4) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIBLd;Lwu;ILjava/awt/Canvas;)Lha;", line = 72)
    public static final synchronized class59 method422(int arg0, int arg1, int arg2, byte arg3, class152 arg4, class376 arg5, int arg6, Canvas arg7) {
        field707++;
        if (arg6 == 0) {
            return class378.method2240((byte) -126, arg0, arg4, arg1, arg7);
        } else if (arg6 == 2) {
            return class282.method1743(arg0, arg1, arg7, (byte) -79, arg4);
        } else if (arg6 == 1) {
            return class260.method1578(arg4, false, arg2, arg7);
        } else if (arg6 == 5) {
            return class267.method1615((byte) -104, arg5, arg4, arg7, arg2);
        } else if (arg3 >= -80) {
            return null;
        } else if (arg6 == 3) {
            return class342.method2049((byte) 95, arg2, arg7, arg4, arg5);
        } else {
            throw new IllegalArgumentException("UM");
        }
    }

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V", line = 112)
    protected void finalize() {
        this.method487(103);
        field725++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIBI)V", line = 123)
    public final void method427(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field722++;
        this.method412(arg5, arg2, arg0, arg1, arg3, 1);
        if (arg4 != 49) {
            this.method483(53, 124, 84, 54, 0.11584457203673405D);
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V", line = 141)
    public final void method434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field718++;
        this.method455(arg5, arg4, arg2, arg0, arg1, 1);
        if (arg3 <= 102) {
            field706 = -40;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBI[III)Lhu;", line = 175)
    public final class133 method450(int arg0, byte arg1, int arg2, int[] arg3, int arg4, int arg5) {
        if (arg1 != 99) {
            field706 = -105;
        }
        field715++;
        return this.method495(arg3, arg4, arg5, arg2, arg0, true);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIZI)V", line = 190)
    public final void method453(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field713++;
        if (arg3) {
            this.method416(arg4, arg1, arg2, arg0, 1);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V", line = 209)
    public static final void method461(byte arg0) {
        field714++;
        class399.method2347(class137.field2182, 2260);
        class587.field7672++;
        if (class700.field9719 && class463.field6373) {
            int var1 = 0;
            int var2 = 0;
            if (class24.field412) {
                var1 = class367.method2167(-2);
                var2 = class672.method3717((byte) -27);
            }
            int var3 = class569.field7492.method780((byte) -109) + var1;
            int var4 = var2 + class569.field7492.method772(60);
            int var5 = var3 - class228.field3253;
            int var6 = 58 % ((-arg0 - 25) / 56);
            int var7 = var4 - class568.field7466;
            if (var5 < class362.field5100) {
                var5 = class362.field5100;
            }
            if ((class362.field5100 + class758.field10549.field9287) < (class137.field2182.field9287 + var5)) {
                var5 = class362.field5100 + class758.field10549.field9287 - class137.field2182.field9287;
            }
            if (var7 < class352.field4941) {
                var7 = class352.field4941;
            }
            if ((class352.field4941 + class758.field10549.field9178) < (class137.field2182.field9178 + var7)) {
                var7 = class352.field4941 + class758.field10549.field9178 - class137.field2182.field9178;
            }
            int var8 = var5 + class758.field10549.field9216 - class362.field5100;
            int var9 = var7 + class758.field10549.field9226 - class352.field4941;
            if (class569.field7492.method771(-128)) {
                if (class137.field2182.field9166 < class587.field7672) {
                    int var11 = var5 - class736.field10180;
                    int var12 = var7 - class277.field3856;
                    if (var11 > class137.field2182.field9202 || var11 < -class137.field2182.field9202 || class137.field2182.field9202 < var12 || -class137.field2182.field9202 > var12) {
                        class442.field6096 = true;
                    }
                }
                if (class137.field2182.field9280 != null && class442.field6096) {
                    class309 var13 = new class309();
                    var13.field4435 = class137.field2182;
                    var13.field4443 = var8;
                    var13.field4437 = var9;
                    var13.field4439 = class137.field2182.field9280;
                    class182.method1249(var13);
                }
            } else {
                if (class442.field6096) {
                    class617.method3377((byte) 5);
                    if (class137.field2182.field9314 != null) {
                        class309 var10 = new class309();
                        var10.field4443 = var8;
                        var10.field4435 = class137.field2182;
                        var10.field4437 = var9;
                        var10.field4439 = class137.field2182.field9314;
                        var10.field4444 = class366.field5132;
                        class182.method1249(var10);
                    }
                    if (class366.field5132 != null && client.method1873(class137.field2182) != null) {
                        class92.method695((byte) -112, class137.field2182, class366.field5132);
                    }
                } else if ((class536.field7066 == 1 || class281.method1733(-555)) && class181.field2730 > 2) {
                    class262.method1588(class568.field7466 + class277.field3856, 2, class736.field10180 + class228.field3253);
                } else if (class263.method1598(-1)) {
                    class262.method1588(class568.field7466 + class277.field3856, 2, class736.field10180 + class228.field3253);
                }
                class137.field2182 = null;
            }
        } else if (class587.field7672 > 1) {
            class137.field2182 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lhu;I)V", line = 337)
    public final void method464(class133 arg0, int arg1) {
        field716++;
        if (arg1 == 25109) {
            this.method444(this.method463(arg0, this.method394(arg0.method1042(), arg0.method1043())));
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V", line = 350)
    public final void method467(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = -68 / ((-arg0 - 30) / 43);
        field708++;
        this.method480(arg3, arg1, arg2, arg4, 1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;II)V", line = 363)
    public final void method470(Rectangle[] arg0, int arg1, int arg2) throws class149 {
        field723++;
        this.method446(arg0, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V", line = 398)
    public final void method487(int arg0) {
        class394.field5495[this.field721] = false;
        field709++;
        this.method458();
        if (arg0 < 20) {
            this.method405(11, -42);
        }
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(IIIIII)V", line = 412)
    public final void method489(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method504(arg4, arg3, arg0, arg2, arg5, 1);
        field724++;
        if (arg1 < 6) {
            this.field717 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V", line = 437)
    public final void method498(int arg0) throws class149 {
        this.method465(0, 0);
        field719++;
        if (arg0 != 5) {
            this.field721 = 79;
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ld;)V", line = 463)
    public class59(class152 arg0) {
        this.field717 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class394.field5495[var3]) {
                class394.field5495[var3] = true;
                var2 = var3;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field721 = var2;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIII)V", line = 492)
    public final void method509(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method428(arg4, arg3, arg2, arg0, arg1);
        field720++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()Z")
    public abstract boolean method390();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()Z")
    public abstract boolean method391();

    @OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
    public abstract void method392(int arg0);

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
    public abstract void method393(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Lbba;")
    public abstract class115 method394(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method395(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
    public abstract int method396();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()Lkea;")
    public abstract class240 method397();

    @OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
    public abstract void method398(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
    public abstract int method400(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lur;IIII)Lka;")
    public abstract class475 method401(class538 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
    public abstract int method402();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
    public abstract void method403(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)I")
    public abstract int method405(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
    public abstract void method406(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Luj;I)V")
    public abstract void method407(class388 arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)Lza;")
    public abstract class418 method408(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Lhu;")
    public abstract class133 method409(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)I")
    public abstract int method410(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;II)V")
    public abstract void method411(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class490 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)V")
    public abstract void method412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Ltn;")
    public abstract class87 method413(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()Z")
    public abstract boolean method414();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljn;Z)Lhu;")
    public abstract class133 method415(class720 arg0, boolean arg1);

    @OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
    public abstract void method416(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)Lmj;")
    public abstract class655 method417(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Lhu;")
    public abstract class133 method418(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
    public abstract void method419(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public abstract void method420(int arg0);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()Lofa;")
    public abstract class333 method421();

    @OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
    public abstract void method423(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
    public abstract int method424();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lrc;[Ljn;Z)Lda;")
    public abstract class60 method425(class539 arg0, class720[] arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "()Z")
    public abstract boolean method426();

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
    public abstract void method428(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ltea;Ltea;FLtea;)Ltea;")
    public abstract class241 method429(class241 arg0, class241 arg1, float arg2, class241 arg3);

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
    public abstract void method430(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "()V")
    public abstract void method431();

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILaa;II)V")
    public abstract void method432(int arg0, class490 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
    public abstract void method433(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
    public abstract void method435();

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "()Z")
    public abstract boolean method436();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public abstract void method437(int arg0);

    @OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
    public abstract int method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "()V")
    public abstract void method439();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ltea;)V")
    public abstract void method440(class241 arg0);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
    public abstract void method441(int arg0);

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "()Z")
    public abstract boolean method442();

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "()Z")
    public abstract boolean method443();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lnc;)V")
    public abstract void method444(class23 arg0);

    @OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
    public abstract void method445(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public abstract void method446(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class149;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public abstract void method447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class490 arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
    public abstract int method448();

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "()Z")
    public abstract boolean method449();

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "()Lofa;")
    public abstract class333 method451();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public abstract class282 method452(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
    public abstract void method454();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)V")
    public abstract void method455(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public abstract void method456(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lza;)V")
    public abstract void method457(class418 arg0);

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "()V")
    public abstract void method458();

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "()Z")
    public abstract boolean method459();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Ltn;)V")
    public abstract void method460(int arg0, class87[] arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public abstract void method462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lmj;Lbba;)Lnc;")
    public abstract class23 method463(class655 arg0, class115 arg1);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)V")
    public abstract void method465(int arg0, int arg1) throws class149;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "()I")
    public abstract int method466();

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "()Z")
    public abstract boolean method468();

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
    public abstract int[] method469();

    @OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
    public abstract void method471(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method472(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
    public abstract int[] method473(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "()Lofa;")
    public abstract class333 method474();

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "()V")
    public abstract void method475();

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
    public abstract void method476(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)Ltea;")
    public abstract class241 method477(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
    public abstract void method478();

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
    public abstract void method479(int arg0);

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
    public abstract void method480(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lofa;)V")
    public abstract void method481(class333 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
    public abstract void method482(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
    public abstract void method483(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method484(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "()Z")
    public abstract boolean method485();

    @OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
    public abstract void method486(float arg0);

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
    public abstract int method488();

    @OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
    public abstract void method490(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
    public abstract void method491(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
    public abstract void method492(int arg0);

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
    public abstract void method493(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
    public abstract void method494(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Lhu;")
    public abstract class133 method495(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
    public abstract void method496(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
    public abstract void method497(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method499(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "()V")
    public abstract void method500();

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "(I)V")
    public abstract void method501(int arg0);

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
    public abstract void method502(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "()V")
    public abstract void method503();

    @OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
    public abstract void method504(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "()Z")
    public abstract boolean method505();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Laa;")
    public abstract class490 method506(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method507(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Luj;)V")
    public abstract void method508(class388 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
    public abstract void method510(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "()V")
    public abstract void method511();

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "()Z")
    public abstract boolean method512();
}
