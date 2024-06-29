import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class565 {

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "Lpca;")
    private class653 field8013 = new class653(64);

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "Ljo;")
    private class303 field8008;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public int field8015;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "[Lmj;")
    public static class597[] field8016 = new class597[75];

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "Lvd;")
    public static class36 field8009 = new class36();

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "Ljq;")
    public static class468 field8017 = new class468();

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field8010;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field8011;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field8012;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field8014;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    public static int field8018;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)Z")
    public static final boolean method3194(int arg0, int arg1) {
        field8011++;
        if (arg0 > -39) {
            return false;
        } else {
            return arg1 >= 12 && arg1 <= 17;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(II)Ltu;")
    public final class316 method3195(int arg0, int arg1) {
        field8012++;
        class653 var3 = this.field8013;
        class316 var4;
        synchronized (this.field8013) {
            var4 = (class316) this.field8013.method3690((byte) 118, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class303 var5 = this.field8008;
        byte[] var6;
        synchronized (this.field8008) {
            var6 = this.field8008.method1719(arg0, arg1, 4);
        }
        class316 var7 = new class316();
        if (var6 != null) {
            var7.method1788(new class452(var6), -95);
        }
        class653 var8 = this.field8013;
        synchronized (this.field8013) {
            this.field8013.method3683(var7, (byte) -28, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "([Ljava/lang/Object;II[JZ)V")
    public static final void method3196(Object[] arg0, int arg1, int arg2, long[] arg3, boolean arg4) {
        if (arg4) {
            field8009 = null;
        }
        field8010++;
        if (arg2 <= arg1) {
            return;
        }
        int var5 = (arg1 + arg2) / 2;
        int var6 = arg1;
        long var7 = arg3[var5];
        arg3[var5] = arg3[arg2];
        arg3[arg2] = var7;
        Object var9 = arg0[var5];
        arg0[var5] = arg0[arg2];
        arg0[arg2] = var9;
        int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
        for (int var11 = arg1; var11 < arg2; var11++) {
            if (arg3[var11] < (var7 + ((long) (var10 & var11)))) {
                long var12 = arg3[var11];
                arg3[var11] = arg3[var6];
                arg3[var6] = var12;
                Object var14 = arg0[var11];
                arg0[var11] = arg0[var6];
                arg0[var6++] = var14;
            }
        }
        arg3[arg2] = arg3[var6];
        arg3[var6] = var7;
        arg0[arg2] = arg0[var6];
        arg0[var6] = var9;
        method3196(arg0, arg1, var6 - 1, arg3, false);
        method3196(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "([[[Lne;I)V")
    public static final void method3197(class287[][][] arg0, int arg1) {
        int var2 = 0;
        if (arg1 != -9655) {
            return;
        }
        while (var2 < arg0.length) {
            class287[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class287 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field3686 instanceof class670) {
                            ((class670) var6.field3686).method452(29877);
                        }
                        if (var6.field3678 instanceof class670) {
                            ((class670) var6.field3678).method452(29877);
                        }
                        if (var6.field3677 instanceof class670) {
                            ((class670) var6.field3677).method452(arg1 + 39532);
                        }
                        if (var6.field3697 instanceof class670) {
                            ((class670) var6.field3697).method452(29877);
                        }
                        if (var6.field3690 instanceof class670) {
                            ((class670) var6.field3690).method452(29877);
                        }
                        for (class60 var7 = var6.field3680; var7 != null; var7 = var7.field623) {
                            class354 var8 = var7.field625;
                            if (var8 instanceof class670) {
                                ((class670) var8).method452(29877);
                            }
                        }
                    }
                }
            }
            var2++;
        }
        field8018++;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)I")
    public static final int method3198(byte arg0) {
        if (arg0 > -61) {
            field8017 = null;
        }
        field8014++;
        return class382.field5127;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
    public static void method3199(int arg0) {
        field8009 = null;
        field8017 = null;
        if (arg0 != 12) {
            method3199(-9);
        }
        field8016 = null;
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Ljda;ILjo;)V")
    public class565(class207 arg0, int arg1, class303 arg2) {
        this.field8008 = arg2;
        this.field8015 = this.field8008.method1727(-77, 19);
    }
}
