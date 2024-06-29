import java.awt.Canvas;
import java.awt.Rectangle;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class class162 {

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "Lm;")
    public class126 field2312;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public int field2310;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Lfg;")
    public static class83 field2305 = new class83("M", "M", "M", "M");

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public static int field2313 = 1338;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "[[I")
    public static int[][] field2319;

    @OriginalMember(owner = "client!qa", name = "XA", descriptor = "(IFFFFF)V")
    public abstract void method520(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public abstract void method527(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILea;II)V")
    public abstract void method537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class382 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "ba", descriptor = "(IIII)V")
    public abstract void method466(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method461(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "(FF)V")
    public abstract void method440(float arg0, float arg1);

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
    protected void finalize() {
        this.method1001((byte) -126);
        field2301++;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public abstract void method500(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static final long method998(byte arg0, String arg1) {
        field2311++;
        long var2 = 0L;
        if (arg0 != 109) {
            field2319 = null;
        }
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 - 64);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 - 96);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 - 21);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lmp;Z)Lf;")
    public abstract class529 method482(class531 arg0, boolean arg1);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)V")
    public abstract void method431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "xa", descriptor = "()I")
    public abstract int method509();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()Z")
    public abstract boolean method441();

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()Z")
    public abstract boolean method474();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lc;Lqb;Lia;[Lnh;I)V")
    public abstract void method457(class121[] arg0, class148 arg1, class415 arg2, class525[] arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)V")
    public final void method999(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2306++;
        if (arg3 == 20754) {
            this.method530(arg2, arg0, arg4, arg1, 1);
        }
    }

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "([I)V")
    public abstract void method514(int[] arg0);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)Ll;")
    public abstract class16 method501(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
    public abstract void method483(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Lpe;")
    public abstract class432 method455(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "()V")
    public abstract void method505();

    @OriginalMember(owner = "client!qa", name = "NA", descriptor = "(IIIIII)V")
    public abstract void method459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "()V")
    public abstract void method535();

    @OriginalMember(owner = "client!qa", name = "JA", descriptor = "(II)V")
    public abstract void method458(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "IA", descriptor = "(IIII)[I")
    public abstract int[] method443(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "aa", descriptor = "(IIIIII[BII)V")
    public abstract void method479(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)Lpv;")
    public abstract class50 method521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "()V")
    public abstract void method446();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lwk;IIII)Lc;")
    public abstract class121 method540(class94 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
    public abstract void method451(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
    public abstract int method463(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLjava/lang/Throwable;Ljava/lang/String;)V")
    public static final void method1000(byte arg0, Throwable arg1, String arg2) {
        field2308++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class121.method788(arg1, 16383);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class193.method1178(var3, 98);
            String var4 = class418.method2508(false, ":", var3, "%3a");
            String var5 = class418.method2508(false, "@", var4, "%40");
            String var6 = class418.method2508(false, "&", var5, "%26");
            String var7 = class418.method2508(false, "#", var6, "%23");
            if (class124.field1691.field5516 != null) {
                class409 var8 = class124.field1691.method2273(true, new URL(class124.field1691.field5516.getCodeBase(), "clienterror.ws?c=" + class238.field3270 + "&u=" + class56.field770 + "&v1=" + class397.field5520 + "&v2=" + class397.field5525 + "&e=" + var7));
                int var9 = 2 % ((arg0 + 41) / 42);
                while (var8.field5652 == 0) {
                    class496.method2931((byte) 127, 1L);
                }
                if (var8.field5652 == 1) {
                    DataInputStream var10 = (DataInputStream) var8.field5654;
                    var10.read();
                    var10.close();
                }
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "()Z")
    public abstract boolean method515();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lqb;)V")
    public abstract void method436(class148 arg0);

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "()Z")
    public abstract boolean method450();

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "()V")
    public abstract void method435();

    @OriginalMember(owner = "client!qa", name = "va", descriptor = "()V")
    public abstract void method526();

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIIII)V")
    public abstract void method504(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "()Z")
    public abstract boolean method531();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method473(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
    public abstract void method486(int arg0);

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "()Lia;")
    public abstract class415 method539();

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I")
    public abstract int method472(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "na", descriptor = "(I)V")
    public abstract void method522(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lpv;)V")
    public abstract void method524(class50 arg0);

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "(IIII)V")
    public abstract void method516(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "()Z")
    public abstract boolean method470();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
    public final void method1001(byte arg0) {
        field2314++;
        if (arg0 > -125) {
            this.field2310 = -59;
        }
        class71.field1071[this.field2310] = false;
        this.method535();
    }

    @OriginalMember(owner = "client!qa", name = "fa", descriptor = "(IIII)V")
    public abstract void method502(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Lf;")
    public abstract class529 method454(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "()Lia;")
    public abstract class415 method491();

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "()V")
    public abstract void method510();

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "(IIIII)V")
    public abstract void method530(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "()Z")
    public abstract boolean method536();

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
    public abstract void method442(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lc;Lia;[Lnh;I)V")
    public abstract void method453(class121[] arg0, class415 arg1, class525[] arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lgv;[Lmp;Z)Loa;")
    public abstract class490 method519(class56 arg0, class531[] arg1, boolean arg2);

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "(ILea;II)V")
    public abstract void method517(int arg0, class382 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V")
    public final void method1002(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2307++;
        int var6 = 89 / ((-arg4 - 79) / 42);
        this.method511(arg3, arg0, arg1, arg2, 1);
    }

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "()Z")
    public abstract boolean method481();

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "()V")
    public abstract void method508();

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(IIIIII)V")
    public final void method1003(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2309++;
        this.method431(arg3, arg4, arg5, arg1, arg0, arg2);
    }

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "()Z")
    public abstract boolean method529();

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V")
    public abstract void method534(int arg0);

    @OriginalMember(owner = "client!qa", name = "da", descriptor = "(IIIII)V")
    public abstract void method511(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lpe;)V")
    public abstract void method490(int arg0, class432[] arg1);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILkj;ILjava/awt/Canvas;ILm;)Lqa;")
    public static final synchronized class162 method1004(int arg0, class397 arg1, int arg2, Canvas arg3, int arg4, class126 arg5) {
        field2303++;
        int var6 = -1;
        for (int var7 = arg0; var7 < 8; var7++) {
            if (!class71.field1071[var7]) {
                var6 = var7;
                break;
            }
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        class162 var9;
        if (arg4 == 0) {
            var9 = class364.method2052(127, arg5, var6, arg3);
        } else if (arg4 == 1) {
            var9 = class143.method922(arg1, var6, arg5, arg3, arg0 - 23, arg2);
        } else if (arg4 == 2) {
            var9 = class12.method100(arg5, var6, arg0 - 53, arg1, arg3);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class71.field1071[var6] = true;
        return var9;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method503(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "FA", descriptor = "()I")
    public abstract int method484();

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "()Z")
    public abstract boolean method487();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ll;)V")
    public abstract void method478(class16 arg0);

    @OriginalMember(owner = "client!qa", name = "la", descriptor = "()F")
    public abstract float method499();

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "()I")
    public abstract int method460();

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "(Lia;)V")
    public abstract void method437(class415 arg0);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method538(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "V", descriptor = "(III)V")
    public abstract void method448(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "()Z")
    public abstract boolean method495();

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(ILm;)V")
    public class162(int arg0, class126 arg1) {
        this.field2312 = arg1;
        this.field2310 = arg0;
    }

    @OriginalMember(owner = "client!qa", name = "ua", descriptor = "(F)V")
    public abstract void method525(float arg0);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
    public abstract void method469(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "()Z")
    public abstract boolean method485();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lpv;Lpv;FLpv;)Lpv;")
    public abstract class50 method464(class50 arg0, class50 arg1, float arg2, class50 arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lc;Lqb;Lia;Lnh;I)V")
    public abstract void method512(class121 arg0, class148 arg1, class415 arg2, class525 arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "()F")
    public abstract float method439();

    @OriginalMember(owner = "client!qa", name = "SA", descriptor = "(IIIIII)Z")
    public abstract boolean method507(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "ia", descriptor = "(III[I)V")
    public abstract void method533(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "()V")
    public abstract void method498();

    @OriginalMember(owner = "client!qa", name = "GA", descriptor = "(IIII)V")
    public abstract void method467(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "(IIIII)V")
    public abstract void method506(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
    public abstract void method496(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Lf;")
    public abstract class529 method476(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "()V")
    public abstract void method433();

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(II)I")
    public static final int method1005(int arg0, int arg1) {
        field2302++;
        if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        } else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else if (arg1 >= -25) {
            return -92;
        } else if (arg0 == 6409 || arg0 == 34846) {
            return 6409;
        } else if (arg0 == 6410 || arg0 == 34847) {
            return 6410;
        } else if (arg0 == 6402) {
            return 6402;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
    public abstract void method493(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "()I")
    public abstract int method432();

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "()I")
    public abstract int method447();

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(IIIIII)V")
    public final void method1006(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2315++;
        this.method459(arg0, arg2, arg5, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "()Z")
    public abstract boolean method471();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lea;")
    public abstract class382 method434(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "()Z")
    public abstract boolean method465();

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
    public static void method1007(int arg0) {
        if (arg0 != 4252) {
            method1000((byte) 82, null, null);
        }
        field2319 = null;
        field2305 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lna;")
    public abstract class35 method518(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBIIII)V")
    public final void method1008(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field2318++;
        this.method504(arg5, arg2, arg3, arg0, arg4, 1);
        int var7 = 80 % ((-arg1 - 53) / 39);
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method449(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIII)V")
    public final void method1009(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method506(arg2, arg3, arg0, arg4, 1);
        field2317++;
        if (arg1 != -29464) {
            field2319 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "()Z")
    public abstract boolean method513();

    @OriginalMember(owner = "client!qa", name = "pa", descriptor = "(IIII)V")
    public abstract void method462(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "()I")
    public abstract int method528();

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "(I)V")
    public abstract void method532(int arg0);
}
