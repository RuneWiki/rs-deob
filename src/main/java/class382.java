import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class382 {

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "Lqc;")
    private class325 field5576 = new class325(16);

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "Ldda;")
    private class597 field5580;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "Lqu;")
    public static class364 field5582 = new class364(64, -1);

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "Lqp;")
    public static class586 field5583 = new class586(73, -1);

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public static int field5586 = 104;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field5579;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "[I")
    public static int[] field5584;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lik;IIIII)Lml;")
    public final class36 method2310(class642 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5577++;
        class24[] var7 = null;
        class80 var8 = this.method2311(29, arg3);
        int var9 = 103 % ((arg2 + 75) / 44);
        if (var8.field915 != null) {
            var7 = new class24[var8.field915.length];
            for (int var10 = 0; var10 < var7.length; var10++) {
                class31 var11 = arg0.method3720(false, var8.field915[var10]);
                var7[var10] = new class24(var11.field317, var11.field311, var11.field314, var11.field319, var11.field308, var11.field320, var11.field316, var11.field312);
            }
        }
        return new class36(var8.field917, var7, var8.field921, arg1, arg5, arg4);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)Leb;")
    private final class80 method2311(int arg0, int arg1) {
        field5581++;
        class325 var3 = this.field5576;
        class80 var4;
        synchronized (this.field5576) {
            var4 = (class80) this.field5576.method2025((long) arg1, 2);
        }
        if (var4 != null) {
            return var4;
        }
        class597 var5 = this.field5580;
        byte[] var6;
        synchronized (this.field5580) {
            var6 = this.field5580.method3486((byte) -102, arg1, arg0);
        }
        class80 var7 = new class80();
        if (var6 != null) {
            var7.method462(new class428(var6), (byte) -80);
        }
        class325 var8 = this.field5576;
        synchronized (this.field5576) {
            this.field5576.method2029(false, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
    public final void method2312(byte arg0) {
        class325 var2 = this.field5576;
        synchronized (this.field5576) {
            if (arg0 != -117) {
                return;
            }
            this.field5576.method2024((byte) -112);
        }
        field5575++;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(II)V")
    public final void method2313(int arg0, int arg1) {
        field5574++;
        class325 var3 = this.field5576;
        synchronized (this.field5576) {
            int var4 = 23 % ((arg0 + 20) / 61);
            this.field5576.method2028(arg1, true);
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)V")
    public final void method2314(byte arg0) {
        if (arg0 >= -10) {
            return;
        }
        class325 var2 = this.field5576;
        synchronized (this.field5576) {
            this.field5576.method2037(true);
        }
        field5578++;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z[[[Lsk;)V")
    public static final void method2315(boolean arg0, class415[][][] arg1) {
        for (int var2 = 0; var2 < arg1.length; var2++) {
            class415[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class415 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field5976 instanceof class438) {
                            ((class438) var6.field5976).method154((byte) -74);
                        }
                        if (var6.field5985 instanceof class438) {
                            ((class438) var6.field5985).method154((byte) -74);
                        }
                        if (var6.field5989 instanceof class438) {
                            ((class438) var6.field5989).method154((byte) -74);
                        }
                        if (var6.field5987 instanceof class438) {
                            ((class438) var6.field5987).method154((byte) -74);
                        }
                        if (var6.field5978 instanceof class438) {
                            ((class438) var6.field5978).method154((byte) -74);
                        }
                        for (class639 var7 = var6.field5981; var7 != null; var7 = var7.field9291) {
                            class237 var8 = var7.field9288;
                            if (var8 instanceof class438) {
                                ((class438) var8).method154((byte) -74);
                            }
                        }
                    }
                }
            }
        }
        if (!arg0) {
            field5573 = 41;
        }
        field5579++;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(B)V")
    public static void method2316(byte arg0) {
        field5582 = null;
        field5584 = null;
        if (arg0 == 71) {
            field5583 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Loda;ILdda;)V")
    public class382(class559 arg0, int arg1, class597 arg2) {
        this.field5580 = arg2;
        this.field5580.method3462(29, 94);
    }
}
