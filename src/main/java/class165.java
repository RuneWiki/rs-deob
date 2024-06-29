import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class class165 {

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public int field2233;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "Ll;")
    public class15 field2235;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "Lni;")
    public static class367 field2225 = new class367(57, -1);

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field2242 = new String[100];

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "[I")
    public static int[] field2241;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()Z")
    public abstract boolean method838();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lka;Lfq;Ln;[Lst;I)V")
    public abstract void method807(class334[] arg0, class137 arg1, class14 arg2, class302[] arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIB)V")
    public final void method1117(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg5 == 73) {
            field2232++;
            this.method747(arg3, arg1, arg4, arg0, arg2, 1);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Laf;")
    public static final class304 method1118(Throwable arg0, String arg1) {
        field2230++;
        class304 var2;
        if (arg0 instanceof class304) {
            var2 = (class304) arg0;
            var2.field4440 = var2.field4440 + ' ' + arg1;
        } else {
            var2 = new class304(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "(I)V")
    public abstract void method769(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public abstract void method794(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILi;II)V")
    public abstract void method819(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class30 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public abstract void method801(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
    public static final void method1119(int arg0) {
        field2226++;
        if (arg0 != 12651) {
            method1125((byte) -115);
        }
        for (class357 var1 = (class357) client.field2679.method445(33); var1 != null; var1 = (class357) client.field2679.method451(false)) {
            class467 var2 = var1.field5504;
            if (class393.field6017 > var2.field6957) {
                var1.method25(-13489);
                var2.method2807((byte) -23);
            } else if (class393.field6017 >= var2.field6993) {
                if (var2.field6971 > 0) {
                    class24 var3 = (class24) class406.field6158.method1747((long) (var2.field6971 - 1), false);
                    if (var3 != null) {
                        class17 var4 = var3.field348;
                        if (var4.field1867 >= 0 && var4.field1867 < class398.field6071 * 128 && var4.field1862 >= 0 && var4.field1862 < class528.field7734 * 128) {
                            var2.method2812(127, var4.field1862, class352.method2264(-115, var2.field1866, var4.field1862, var4.field1867) - var2.field6987, class393.field6017, var4.field1867);
                        }
                    }
                }
                if (var2.field6971 < 0) {
                    int var5 = -var2.field6971 - 1;
                    class96 var6;
                    if (class350.field5400 == var5) {
                        var6 = class56.field800;
                    } else {
                        var6 = class241.field3398[var5];
                    }
                    if (var6 != null && var6.field1867 >= 0 && (class398.field6071 * 128) > var6.field1867 && var6.field1862 >= 0 && class528.field7734 * 128 > var6.field1862) {
                        var2.method2812(127, var6.field1862, class352.method2264(-104, var2.field1866, var6.field1862, var6.field1867) - var2.field6987, class393.field6017, var6.field1867);
                    }
                }
                var2.method2806(false, class205.field2728);
                class525.method3110(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()V")
    public abstract void method845();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
    public final void method1120(byte arg0) {
        int var2 = 60 % ((-arg0 - 72) / 48);
        class23.field342[this.field2233] = false;
        field2231++;
        this.method802();
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method744(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)V")
    public final void method1121(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != -26030) {
            this.method843(false);
        }
        field2227++;
        this.method787(arg3, arg1, arg2, arg0, 1);
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "()Z")
    public abstract boolean method841();

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "()Z")
    public abstract boolean method797();

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "()Z")
    public abstract boolean method836();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Li;")
    public abstract class30 method782(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lw;)V")
    public abstract void method800(class198 arg0);

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "()F")
    public abstract float method741();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method777(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
    public abstract int method781(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "TA", descriptor = "(IIIIII)Z")
    public abstract boolean method804(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method822(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "()Z")
    public abstract boolean method786();

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method791(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "()Z")
    public abstract boolean method771();

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "(IIII)[I")
    public abstract int[] method813(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "(IIII)V")
    public abstract void method739(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BB)C")
    public static final char method1122(byte arg0, byte arg1) {
        if (arg0 > -22) {
            return (char) 65479;
        }
        field2234++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class513.field7546[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "(II)V")
    public abstract void method761(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Llo;Llo;FLlo;)Llo;")
    public abstract class539 method844(class539 arg0, class539 arg1, float arg2, class539 arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Laa;")
    public abstract class341 method816(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "()Ln;")
    public abstract class14 method795();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lfq;)V")
    public abstract void method798(class137 arg0);

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "()Z")
    public abstract boolean method778();

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "()Z")
    public abstract boolean method763();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZIIII)V")
    public final void method1123(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method772(arg2, arg0, arg5, arg4, arg3, 1);
        if (!arg1) {
            this.method766(46);
        }
        field2239++;
    }

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "([I)V")
    public abstract void method850(int[] arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)Llo;")
    public abstract class539 method746(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIILub;ILcd;ILwk;)V")
    public static final void method1124(int arg0, int arg1, int arg2, class17 arg3, int arg4, class209 arg5, int arg6, class96 arg7) {
        field2224++;
        class179 var8 = new class179();
        var8.field2406 = arg4;
        if (arg2 != -2) {
            method1124(-97, -86, -69, null, -37, null, -88, null);
        }
        var8.field2394 = arg6 << 7;
        var8.field2392 = arg1 << 7;
        if (arg5 != null) {
            var8.field2402 = arg5;
            int var9 = arg5.field2928;
            int var10 = arg5.field2925;
            if (arg0 == 1 || arg0 == 3) {
                var9 = arg5.field2925;
                var10 = arg5.field2928;
            }
            var8.field2403 = arg1 + var10 << 7;
            var8.field2393 = arg5.field2970;
            var8.field2401 = arg5.field2904;
            var8.field2405 = arg5.field2898;
            var8.field2404 = arg6 + var9 << 7;
            var8.field2407 = arg5.field2949;
            var8.field2387 = arg5.field2944;
            var8.field2384 = arg5.field2886 << 7;
            if (arg5.field2934 != null) {
                var8.field2399 = true;
                var8.method1201(-1);
            }
            if (var8.field2387 != null) {
                var8.field2385 = (int) (Math.random() * (double) (var8.field2393 - var8.field2407)) + var8.field2407;
            }
            class86.field1251.method453((byte) 120, var8);
        } else if (arg3 != null) {
            var8.field2388 = arg3;
            class258 var11 = arg3.field274;
            if (var11.field3627 != null) {
                var8.field2399 = true;
                var11 = var11.method1660(class288.field4208, (byte) 74);
            }
            if (var11 != null) {
                var8.field2403 = var11.field3586 + arg1 << 7;
                var8.field2404 = var11.field3586 + arg6 << 7;
                var8.field2401 = class221.method1487(-1, arg3);
                var8.field2405 = var11.field3576;
                var8.field2384 = var11.field3571 << 7;
            }
            class86.field1254.method453((byte) 124, var8);
        } else if (arg7 != null) {
            var8.field2386 = arg7;
            var8.field2404 = arg6 + arg7.method637((byte) 22) << 7;
            var8.field2403 = arg7.method637((byte) -1) + arg1 << 7;
            var8.field2401 = class170.method1160(-87, arg7);
            var8.field2405 = arg7.field1385;
            var8.field2384 = arg7.field1406 << 7;
            class424.field6459.method1751((long) arg7.field3882, -88, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!qa", name = "KA", descriptor = "(IIII)V")
    public abstract void method754(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Llo;)V")
    public abstract void method799(class539 arg0);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
    public abstract void method785(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lnd;IIII)Lka;")
    public abstract class334 method833(class387 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "(IIII)V")
    public abstract void method830(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lbe;)V")
    public abstract void method849(int arg0, class28[] arg1);

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "()I")
    public abstract int method811();

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "()V")
    public abstract void method852();

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "()Z")
    public abstract boolean method846();

    @OriginalMember(owner = "client!qa", name = "BA", descriptor = "(IIIII)V")
    public abstract void method787(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "()Ln;")
    public abstract class14 method751();

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "()Z")
    public abstract boolean method818();

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "()I")
    public abstract int method824();

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "()V")
    public abstract void method817();

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "()I")
    public abstract int method796();

    @OriginalMember(owner = "client!qa", name = "la", descriptor = "(IFFFFF)V")
    public abstract void method759(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "()Z")
    public abstract boolean method827();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lmn;Z)Laa;")
    public abstract class341 method774(class252 arg0, boolean arg1);

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "()V")
    public abstract void method757();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lju;[Lmn;Z)Lba;")
    public abstract class268 method839(class82 arg0, class252[] arg1, boolean arg2);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)V")
    public abstract void method810(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "sa", descriptor = "()I")
    public abstract int method820();

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIIII)V")
    public abstract void method772(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
    public abstract void method789(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "()V")
    public abstract void method753();

    @OriginalMember(owner = "client!qa", name = "IA", descriptor = "(IIII)V")
    public abstract void method828(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lka;Lfq;Ln;Lst;I)V")
    public abstract void method840(class334 arg0, class137 arg1, class14 arg2, class302 arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
    public abstract void method740(int arg0);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)V")
    public static final void method1125(byte arg0) {
        if (arg0 != 21) {
            method1125((byte) 122);
        }
        class456.field6845.method760(class375.field5702, class203.field2716.field1174 ? class91.field1320 + 256 << 0 : -1, 256);
        field2229++;
    }

    @OriginalMember(owner = "client!qa", name = "na", descriptor = "()I")
    public abstract int method756();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method805(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBIII)V")
    public final void method1126(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 > -32) {
            field2242 = null;
        }
        this.method742(arg2, arg4, arg0, arg3, 1);
        field2236++;
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)Lw;")
    public abstract class198 method749(int arg0);

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "(IIIII)V")
    public abstract void method742(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "()V")
    public abstract void method831();

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I")
    public abstract int method775(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
    protected void finalize() {
        field2228++;
        this.method1120((byte) -121);
    }

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "()V")
    public abstract void method788();

    @OriginalMember(owner = "client!qa", name = "xa", descriptor = "()I")
    public abstract int method837();

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIII)V")
    public abstract void method762(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "GA", descriptor = "(ILi;II)V")
    public abstract void method779(int arg0, class30 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
    public abstract void method766(int arg0);

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "()V")
    public abstract void method792();

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(B)V")
    public static void method1127(byte arg0) {
        field2225 = null;
        field2242 = null;
        if (arg0 <= 104) {
            method1125((byte) -69);
        }
        field2241 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
    public abstract void method790(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "(IIIIII)V")
    public abstract void method747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
    public abstract void method814(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ln;)V")
    public abstract void method821(class14 arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method851(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "()V")
    public abstract void method802();

    @OriginalMember(owner = "client!qa", name = "MA", descriptor = "(F)V")
    public abstract void method829(float arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lka;Ln;[Lst;I)V")
    public abstract void method809(class334[] arg0, class14 arg1, class302[] arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(IIIIII)V")
    public final void method1128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2223++;
        this.method810(arg0, arg5, arg4, arg1, arg2, 1);
        if (arg3 != -4) {
            this.field2235 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lo;")
    public abstract class23 method752(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V")
    public final void method1129(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method758(arg4, arg1, arg0, arg3, 1);
        if (arg2 != 43) {
            this.field2233 = 0;
        }
        field2237++;
    }

    @OriginalMember(owner = "client!qa", name = "ua", descriptor = "(IIIIII[BII)V")
    public abstract void method770(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "()Z")
    public abstract boolean method823();

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
    public abstract void method843(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Laa;")
    public abstract class341 method767(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(IIIII)V")
    public abstract void method758(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "PA", descriptor = "(FF)V")
    public abstract void method748(float arg0, float arg1);

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "(I)V")
    public abstract void method834(int arg0);

    @OriginalMember(owner = "client!qa", name = "ha", descriptor = "(III)V")
    public abstract void method760(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
    public abstract void method780(int arg0);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method826(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "()Z")
    public abstract boolean method755();

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "()F")
    public abstract float method784();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Lbe;")
    public abstract class28 method815(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!qa", name = "XA", descriptor = "(III[I)V")
    public abstract void method793(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(ILl;)V")
    public class165(int arg0, class15 arg1) {
        this.field2233 = arg0;
        this.field2235 = arg1;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ldq;IBLjava/awt/Canvas;Ll;I)Lqa;")
    public static final synchronized class165 method1130(class500 arg0, int arg1, byte arg2, Canvas arg3, class15 arg4, int arg5) {
        field2238++;
        int var6 = -1;
        int var7 = 0;
        int var8 = -16 % ((arg2 - 7) / 43);
        while (var7 < 8) {
            if (!class23.field342[var7]) {
                var6 = var7;
                break;
            }
            var7++;
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var9 = null;
        class165 var10;
        if (arg5 == 0) {
            var10 = class172.method1167(-1, var6, arg3, arg4);
        } else if (arg5 == 1) {
            var10 = class400.method2473(arg0, arg4, 32, var6, arg1, arg3);
        } else if (arg5 == 2) {
            var10 = class454.method2765(arg3, -128, var6, arg4, arg0);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class23.field342[var6] = true;
        return var10;
    }

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "()Z")
    public abstract boolean method803();

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "()Z")
    public abstract boolean method848();
}
