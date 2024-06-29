import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class387 {

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "Lhf;")
    private class413 field5517;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "I")
    private int field5520;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
    private int field5516;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "Ltga;")
    private class64 field5507;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Z")
    public static boolean field5502 = false;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field5504;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "[I")
    public static int[] field5515;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/Object;IJ)V")
    public final void method2362(Object arg0, int arg1, long arg2) {
        this.method2368(true, arg2, 1, arg0);
        if (arg1 != 0) {
            field5502 = false;
        }
        field5504++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(JB)V")
    private final void method2363(long arg0, byte arg1) {
        field5518++;
        class85 var4 = (class85) this.field5507.method380((byte) -3, arg0);
        this.method2367(var4, (byte) -6);
        if (arg1 < 97) {
            this.field5520 = 18;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public final void method2364(int arg0) {
        field5501++;
        if (arg0 != 1) {
            this.method2363(49L, (byte) -2);
        }
        this.field5517.method2477(true);
        this.field5507.method387(-21125);
        this.field5516 = this.field5520;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method2365(byte arg0) {
        if (arg0 != 59) {
            this.method2363(-52L, (byte) -55);
        }
        field5514++;
        class85 var2 = (class85) this.field5507.method391(37);
        while (var2 != null) {
            Object var3 = var2.method599(27585);
            if (var3 != null) {
                return var3;
            }
            class85 var4 = var2;
            var2 = (class85) this.field5507.method391(37);
            var4.method3117((byte) 105);
            var4.method1512(false);
            this.field5516 += var4.field1110;
        }
        return null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)V")
    public final void method2366(int arg0, int arg1) {
        if (class264.field3730 != null) {
            for (class85 var3 = (class85) this.field5517.method2480(381); var3 != null; var3 = (class85) this.field5517.method2476((byte) 18)) {
                if (var3.method598((byte) 104)) {
                    if (var3.method599(27585) == null) {
                        var3.method3117((byte) -107);
                        var3.method1512(false);
                        this.field5516 += var3.field1110;
                    }
                } else if ((++var3.field3123) > ((long) arg0)) {
                    class85 var4 = class264.field3730.method2286(var3, (byte) 22);
                    this.field5507.method384(var3.field7577, var4, false);
                    class649.method3709(var3, var4, -28407);
                    var3.method3117((byte) -125);
                    var3.method1512(false);
                }
            }
        }
        field5506++;
        if (arg1 <= 104) {
            this.method2370((byte) -61);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ldha;B)V")
    private final void method2367(class85 arg0, byte arg1) {
        field5519++;
        if (arg0 != null) {
            arg0.method3117((byte) -119);
            arg0.method1512(false);
            this.field5516 += arg0.field1110;
        }
        if (arg1 != -6) {
            field5502 = true;
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(I)V")
    public class387(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZJILjava/lang/Object;)V")
    public final void method2368(boolean arg0, long arg1, int arg2, Object arg3) {
        if (!arg0) {
            this.field5516 = 77;
        }
        field5512++;
        if (this.field5520 < arg2) {
            throw new IllegalStateException("s>cs");
        }
        this.method2363(arg1, (byte) 124);
        this.field5516 -= arg2;
        while (this.field5516 < 0) {
            class85 var7 = (class85) this.field5517.method2481((byte) 65);
            this.method2367(var7, (byte) -6);
        }
        class213 var6 = new class213(arg3, arg2);
        this.field5507.method384(arg1, var6, !arg0);
        this.field5517.method2475(var6, -19680);
        var6.field3123 = 0L;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
    public final void method2369(int arg0) {
        if (arg0 != -1) {
            this.method2370((byte) 88);
        }
        for (class85 var2 = (class85) this.field5517.method2480(381); var2 != null; var2 = (class85) this.field5517.method2476((byte) 18)) {
            if (var2.method598((byte) 104)) {
                var2.method3117((byte) -124);
                var2.method1512(false);
                this.field5516 += var2.field1110;
            }
        }
        field5521++;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)I")
    public final int method2370(byte arg0) {
        field5510++;
        if (arg0 != -7) {
            field5502 = false;
        }
        return this.field5516;
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V")
    public static final void method2371(int arg0) {
        field5509++;
        class153.field2277++;
        int var1 = -17 % ((34 - arg0) / 49);
        class747.field10380 = 0;
        class276.field3843 = 0;
        class686.method3874((byte) -114);
        class161.method1269(0);
        class463.method2747(-10405);
        boolean var2 = false;
        for (int var3 = 0; var3 < class276.field3843; var3++) {
            int var6 = class113.field1415[var3];
            class14 var7 = (class14) class543.field7606.method380((byte) -3, (long) var6);
            class645 var8 = var7.field262;
            if (class422.field5962 && class645.method3690(-122, var6)) {
                class486.method2837(-116);
            }
            if (class153.field2277 != var8.field6401) {
                if (var8.field9071.method1807((byte) -121)) {
                    class179.method1355(false, var8);
                }
                var8.method3686(null, (byte) -52);
                var7.method3117((byte) -92);
                var2 = true;
            }
        }
        if (var2) {
            class662.field9292 = class543.field7606.method381(65);
            class543.field7606.method385(0, class642.field9044);
        }
        if (class440.field6294 != class26.field371.field1521) {
            throw new RuntimeException("gnp1 pos:" + class26.field371.field1521 + " psize:" + class440.field6294);
        }
        for (int var4 = 0; var4 < class26.field379; var4++) {
            if (class543.field7606.method380((byte) -3, (long) class790.field10846[var4]) == null) {
                throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class26.field379);
            }
        }
        if (class662.field9292 - class26.field379 != 0) {
            throw new RuntimeException("gnp3 mis:" + (class662.field9292 - class26.field379));
        }
        for (int var5 = 0; var5 < class662.field9292; var5++) {
            if (class153.field2277 != class642.field9044[var5].field262.field6401) {
                throw new RuntimeException("gnp4 uk:" + class642.field9044[var5].field262.field6361);
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)I")
    public final int method2372(int arg0) {
        if (arg0 != -27651) {
            this.field5507 = null;
        }
        field5508++;
        return this.field5520;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(JI)Ljava/lang/Object;")
    public final Object method2373(long arg0, int arg1) {
        if (arg1 != 103) {
            return null;
        }
        field5511++;
        class85 var4 = (class85) this.field5507.method380((byte) -3, arg0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method599(27585);
        if (var5 == null) {
            var4.method3117((byte) -89);
            var4.method1512(false);
            this.field5516 += var4.field1110;
            return null;
        }
        if (var4.method598((byte) 104)) {
            class213 var6 = new class213(var5, var4.field1110);
            this.field5507.method384(var4.field7577, var6, false);
            this.field5517.method2475(var6, -19680);
            var6.field3123 = 0L;
            var4.method3117((byte) -20);
            var4.method1512(false);
        } else {
            this.field5517.method2475(var4, -19680);
            var4.field3123 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIII)I")
    public static final int method2374(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 1) {
            method2374(-72, 102, -53, -5);
        }
        field5505++;
        if (arg2 <= arg1) {
            return arg1 > arg3 ? arg3 : arg1;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public final Object method2375(int arg0) {
        field5503++;
        class85 var2 = (class85) this.field5507.method382(0);
        while (var2 != null) {
            Object var3 = var2.method599(27585);
            if (var3 != null) {
                return var3;
            }
            class85 var4 = var2;
            var2 = (class85) this.field5507.method391(37);
            var4.method3117((byte) 71);
            var4.method1512(false);
            this.field5516 += var4.field1110;
        }
        return arg0 >= -24 ? null : null;
    }

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "(I)V")
    public static void method2376(int arg0) {
        field5515 = null;
        if (arg0 != 0) {
            field5515 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(II)V")
    public class387(int arg0, int arg1) {
        this.field5517 = new class413();
        this.field5520 = arg0;
        this.field5516 = arg0;
        int var3;
        for (var3 = 1; arg0 > (var3 + var3) && var3 < arg1; var3 += var3) {
        }
        this.field5507 = new class64(var3);
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(B)I")
    public final int method2377(byte arg0) {
        field5513++;
        int var2 = 0;
        if (arg0 != -97) {
            return -52;
        }
        for (class85 var3 = (class85) this.field5517.method2480(381); var3 != null; var3 = (class85) this.field5517.method2476((byte) 18)) {
            if (!var3.method598((byte) 104)) {
                var2++;
            }
        }
        return var2;
    }
}
