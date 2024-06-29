import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public abstract class class261 {

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
    public int field3971 = -1;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "Z")
    public static boolean field3963 = false;

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "Lpf;")
    public static class425 field3973 = new class425(2, 7);

    @OriginalMember(owner = "client!dr", name = "t", descriptor = "[[I")
    public static int[][] field3981 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!dr", name = "m", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!dr", name = "n", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!dr", name = "o", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!dr", name = "p", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!dr", name = "u", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!dr", name = "v", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!dr", name = "q", descriptor = "Liq;")
    public static class134 field3978;

    @OriginalMember(owner = "client!dr", name = "r", descriptor = "Ltm;")
    public static class354 field3979;

    @OriginalMember(owner = "client!dr", name = "s", descriptor = "Lwl;")
    public static class452 field3980;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "()V")
    public abstract void method440();

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "()Z")
    public abstract boolean method427();

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
    public static void method1608(int arg0) {
        field3978 = null;
        field3980 = null;
        field3979 = null;
        field3981 = null;
        field3973 = null;
        if (arg0 < 65) {
            method1618(76, (String) null, (byte) 93, 54, (String) null, (String) null);
        }
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)V")
    public abstract void method428(int arg0);

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "()I")
    public abstract int method442();

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "()Z")
    public abstract boolean method421();

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(I)V")
    public abstract void method379(int arg0);

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "()V")
    public abstract void method445();

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I[Ldt;)V")
    public abstract void method408(int arg0, class147[] arg1);

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "(I)V")
    public abstract void method403(int arg0);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IB[Lfh;)V")
    public static final void method1609(int arg0, byte arg1, class170[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class170 var4 = arg2[var3];
            if (var4 != null && var4.field2474 == arg0 && !client.method2783(var4)) {
                if (var4.field2558 == 0) {
                    method1609(var4.field2525, (byte) 102, arg2);
                    if (var4.field2625 != null) {
                        method1609(var4.field2525, (byte) 102, var4.field2625);
                    }
                    class333 var5 = (class333) class308.field4647.method2302((long) var4.field2525, 23576);
                    if (var5 != null) {
                        class114.method692((byte) -27, var5.field4965);
                    }
                }
                if (var4.field2558 == 6 && var4.field2576 != -1) {
                    class379 var6 = class98.method629(var4.field2576, (byte) -115);
                    if (var6 != null) {
                        var4.field2489 += class342.field5118;
                        while (var4.field2489 > var6.field5540[var4.field2609]) {
                            var4.field2489 -= var6.field5540[var4.field2609];
                            var4.field2609++;
                            if (var4.field2609 >= var6.field5539.length) {
                                var4.field2609 -= var6.field5527;
                                if (var4.field2609 < 0 || var4.field2609 >= var6.field5539.length) {
                                    var4.field2609 = 0;
                                }
                            }
                            var4.field2619 = var4.field2609 + 1;
                            if (var4.field2619 >= var6.field5539.length) {
                                var4.field2619 -= var6.field5527;
                                if (var4.field2619 < 0 || var6.field5539.length <= var4.field2619) {
                                    var4.field2619 = -1;
                                }
                            }
                            class405.method2543(var4, 127);
                        }
                    }
                }
            }
        }
        if (arg1 != 102) {
            method1609(-40, (byte) 16, (class170[]) null);
        }
        field3983++;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(III[I)V")
    public abstract void method402(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(III)V")
    public abstract void method364(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lgf;)V")
    public abstract void method416(class351 arg0);

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(III)V")
    public static final void method1610(int arg0, int arg1, int arg2) {
        field3965++;
        if (arg0 > -111) {
            field3979 = null;
        }
        class32 var3 = class136.method854(14, (byte) 116, arg2);
        var3.method194(false);
        var3.field404 = arg1;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lgo;[Lck;Z)Llp;")
    public abstract class137 method410(class272 arg0, class4[] arg1, boolean arg2);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIZII)V")
    public final void method1611(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        this.method418(arg3, arg1, arg0, arg4, 1);
        if (!arg2) {
            field3964++;
        }
    }

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "()I")
    public abstract int method430();

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(FF)V")
    public abstract void method423(float arg0, float arg1);

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "()Z")
    public abstract boolean method400();

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IFFFFF)V")
    public abstract void method360(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "()V")
    public abstract void method353();

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "([Lwp;Lwa;Ljd;[Lid;I)V")
    public abstract void method343(class292[] arg0, class439 arg1, class361 arg2, class158[] arg3, int arg4);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljp;IIII)Lwp;")
    public abstract class292 method390(class49 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "()V")
    public abstract void method374();

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIII)V")
    public abstract void method418(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIIII)Ltc;")
    public abstract class396 method411(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!dr", name = "m", descriptor = "()Ljd;")
    public abstract class361 method434();

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIIIILor;II)V")
    public abstract void method385(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class153 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!dr", name = "n", descriptor = "()I")
    public abstract int method381();

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Z)V")
    public abstract void method443(boolean arg0);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "([I)V")
    public abstract void method415(int[] arg0);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIII)V")
    public abstract void method436(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "(I)V")
    public abstract void method383(int arg0);

    @OriginalMember(owner = "client!dr", name = "o", descriptor = "()Z")
    public abstract boolean method420();

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(IIIIII)V")
    public abstract void method382(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BIIIII)V")
    public final void method1612(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 13) {
            field3981 = null;
        }
        this.method382(arg3, arg2, arg5, arg1, arg4, 1);
        field3982++;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljd;)V")
    public abstract void method397(class361 arg0);

    @OriginalMember(owner = "client!dr", name = "p", descriptor = "()Z")
    public abstract boolean method346();

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(IIII)[I")
    public abstract int[] method371(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)I")
    public abstract int method407(int arg0, int arg1);

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(II)I")
    public abstract int method372(int arg0, int arg1);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V")
    public static final void method1613(byte arg0) {
        field3966++;
        int var1 = -111 % ((62 - arg0) / 36);
        class241 var2 = class177.field2679;
        synchronized (class177.field2679) {
            class177.field2679.method1485(-22032);
        }
        class241 var3 = class391.field5767;
        synchronized (class391.field5767) {
            class391.field5767.method1485(-22032);
        }
    }

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(II)I")
    public static final int method1614(int arg0, int arg1) {
        if (arg0 != 19809) {
            return 15;
        }
        field3969++;
        int var2 = arg1 & 0x3F;
        int var3 = (arg1 & 0xD7) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "(I)V")
    public abstract void method437(int arg0);

    @OriginalMember(owner = "client!dr", name = "q", descriptor = "()Z")
    public abstract boolean method393();

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public abstract class143 method438(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lwp;Lwa;Ljd;Lid;I)V")
    public abstract void method369(class292 arg0, class439 arg1, class361 arg2, class158 arg3, int arg4);

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(IIIII)V")
    public abstract void method439(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIIIB)V")
    public final void method1615(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field3972++;
        if (arg5 != -119) {
            field3979 = null;
        }
        this.method358(arg3, arg4, arg0, arg2, arg1, 1);
    }

    @OriginalMember(owner = "client!dr", name = "r", descriptor = "()Z")
    public abstract boolean method345();

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(IIII)V")
    public abstract void method354(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(IIIIII)V")
    public abstract void method422(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IBIII)V")
    public final void method1616(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        this.method351(arg2, arg0, arg4, arg3, 1);
        if (arg1 >= 112) {
            field3967++;
        }
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(B)V")
    public final void method1617(byte arg0) {
        field3970++;
        class246.field3692[this.field3971] = false;
        this.method357();
        if (arg0 != -37) {
            this.method432((class396) null, (class396) null, 1.3326322F, (class396) null);
        }
    }

    @OriginalMember(owner = "client!dr", name = "s", descriptor = "()V")
    public abstract void method424();

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "(II)V")
    public abstract void method344(int arg0, int arg1);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ltc;Ltc;FLtc;)Ltc;")
    public abstract class396 method432(class396 arg0, class396 arg1, float arg2, class396 arg3);

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "(II)V")
    public abstract void method350(int arg0, int arg1);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method375(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!dr", name = "t", descriptor = "()F")
    public abstract float method413();

    @OriginalMember(owner = "client!dr", name = "u", descriptor = "()I")
    public abstract int method444();

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method347(Canvas arg0);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lck;Z)Lkr;")
    public abstract class234 method378(class4 arg0, boolean arg1);

    @OriginalMember(owner = "client!dr", name = "v", descriptor = "()V")
    public abstract void method433();

    @OriginalMember(owner = "client!dr", name = "w", descriptor = "()V")
    public abstract void method357();

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILjava/lang/String;BILjava/lang/String;Ljava/lang/String;)V")
    public static final void method1618(int arg0, String arg1, byte arg2, int arg3, String arg4, String arg5) {
        if (arg2 != 108) {
            method1620((String) null, false, -25);
        }
        class272.method1694(arg4, arg3, arg1, arg5, -1, (String) null, (byte) 111, arg0);
        field3977++;
    }

    @OriginalMember(owner = "client!dr", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1617((byte) -37);
        field3976++;
    }

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "(IIIIII)V")
    public abstract void method358(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!dr", name = "x", descriptor = "()Z")
    public abstract boolean method386();

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "([Lwp;Ljd;[Lid;I)V")
    public abstract void method431(class292[] arg0, class361 arg1, class158[] arg2, int arg3);

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(Z)V")
    public abstract void method412(boolean arg0);

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "(IIII)V")
    public abstract void method399(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(F)V")
    public abstract void method365(float arg0);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(FFF)V")
    public abstract void method367(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!dr", name = "y", descriptor = "()Z")
    public abstract boolean method387();

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ZLjava/awt/Canvas;Lsc;ILec;I)Ldr;")
    public static final synchronized class261 method1619(boolean arg0, Canvas arg1, class239 arg2, int arg3, class96 arg4, int arg5) {
        field3974++;
        int var6 = -1;
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class246.field3692[var7]) {
                var6 = var7;
                break;
            }
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        class261 var9;
        if (arg5 == 0) {
            var9 = class313.method1917(-64, arg4, var6, arg1);
        } else if (arg5 == 1) {
            var9 = class183.method1108(var6, arg3, false, arg1, arg2, arg4);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class246.field3692[var6] = arg0;
        return var9;
    }

    @OriginalMember(owner = "client!dr", name = "z", descriptor = "()V")
    public abstract void method391();

    @OriginalMember(owner = "client!dr", name = "A", descriptor = "()Z")
    public abstract boolean method425();

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method392(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
    public static final void method1620(String arg0, boolean arg1, int arg2) {
        field3968++;
        if (arg0 == null) {
            return;
        }
        if (class433.field6366 >= 100) {
            class149.method932(class314.field4759.method937((byte) -84, class27.field356), 2688);
            return;
        }
        String var3 = class171.method1054(0, arg0);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class433.field6366; var4++) {
            String var8 = class171.method1054(0, class289.field4400[var4]);
            if (var8 != null && var8.equals(var3)) {
                class149.method932(arg0 + class440.field6478.method937((byte) -67, class27.field356), arg2 ^ 0xA90);
                return;
            }
            if (class458.field6793[var4] != null) {
                String var9 = class171.method1054(0, class458.field6793[var4]);
                if (var9 != null && var9.equals(var3)) {
                    class149.method932(arg0 + class440.field6478.method937((byte) -103, class27.field356), arg2 + 2672);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class145.field1985; var5++) {
            String var6 = class171.method1054(0, class137.field1853[var5]);
            if (var6 != null && var6.equals(var3)) {
                class149.method932(class247.field3704.method937((byte) 118, class27.field356) + arg0 + class423.field6221.method937((byte) 99, class27.field356), arg2 + 2672);
                return;
            }
            if (class112.field1486[var5] != null) {
                String var7 = class171.method1054(0, class112.field1486[var5]);
                if (var7 != null && var7.equals(var3)) {
                    class149.method932(class247.field3704.method937((byte) 115, class27.field356) + arg0 + class423.field6221.method937((byte) 125, class27.field356), 2688);
                    return;
                }
            }
        }
        if (class171.method1054(0, class113.field1500.field2459).equals(var3)) {
            class149.method932(class383.field5590.method937((byte) 102, class27.field356), arg2 + 2672);
            return;
        }
        class177.method1082(class43.field545, 0);
        class103.field1377++;
        class189.field2840.method2366(class386.method2384(-4580, arg0) + 1, true);
        if (arg2 != 16) {
            field3980 = null;
        }
        class189.field2840.method2375(arg2 ^ 0x68, arg0);
        class189.field2840.method2366(arg1 ? 1 : 0, true);
    }

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(Z)V")
    public abstract void method356(boolean arg0);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIIII[BII)V")
    public abstract void method352(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!dr", name = "B", descriptor = "()Z")
    public abstract boolean method359();

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "(IIIIII)Z")
    public abstract boolean method395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "([IIIII)Lkr;")
    public abstract class234 method401(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(III)V")
    public abstract void method405(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILor;II)V")
    public abstract void method419(int arg0, class153 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "(I)Lgf;")
    public abstract class351 method417(int arg0);

    @OriginalMember(owner = "client!dr", name = "C", descriptor = "()Z")
    public abstract boolean method404();

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(IIIII)V")
    public abstract void method351(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ltc;)V")
    public abstract void method380(class396 arg0);

    @OriginalMember(owner = "client!dr", name = "E", descriptor = "()Ljd;")
    public abstract class361 method388();

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "(IIIIII)V")
    public final void method1621(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method422(arg1, arg3, arg5, arg0, arg2, 1);
        field3962++;
        if (arg4 != -17638) {
            this.method371(-66, 76, -74, -93);
        }
    }

    @OriginalMember(owner = "client!dr", name = "F", descriptor = "()Z")
    public abstract boolean method398();

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIIZ)V")
    public final void method1622(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (!arg4) {
            field3981 = null;
        }
        this.method439(arg3, arg0, arg2, arg1, 1);
        field3975++;
    }

    @OriginalMember(owner = "client!dr", name = "G", descriptor = "()I")
    public abstract int method342();

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(IIIIZ)Lkr;")
    public abstract class234 method373(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!dr", name = "H", descriptor = "()V")
    public abstract void method435();

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lwa;)V")
    public abstract void method349(class439 arg0);

    @OriginalMember(owner = "client!dr", name = "I", descriptor = "()F")
    public abstract float method366();

    @OriginalMember(owner = "client!dr", name = "J", descriptor = "()Z")
    public abstract boolean method384();

    @OriginalMember(owner = "client!dr", name = "K", descriptor = "()I")
    public abstract int method361();

    @OriginalMember(owner = "client!dr", name = "L", descriptor = "()V")
    public abstract void method429();

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "(IIII)V")
    public abstract void method396(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!dr", name = "M", descriptor = "()Z")
    public abstract boolean method376();

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(II[I[I)Lor;")
    public abstract class153 method355(int arg0, int arg1, int[] arg2, int[] arg3);
}
