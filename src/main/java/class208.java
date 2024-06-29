import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class208 {

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "Lge;")
    private class511 field3153 = new class511(64);

    @OriginalMember(owner = "client!wt", name = "o", descriptor = "Lge;")
    public class511 field3164 = new class511(2);

    @OriginalMember(owner = "client!wt", name = "k", descriptor = "Lci;")
    private class320 field3160;

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "Lci;")
    public class320 field3155;

    @OriginalMember(owner = "client!wt", name = "i", descriptor = "Lqv;")
    public static class316 field3158 = new class316(113, 10);

    @OriginalMember(owner = "client!wt", name = "j", descriptor = "Lqt;")
    public static class459 field3159 = new class459(73, 4);

    @OriginalMember(owner = "client!wt", name = "l", descriptor = "I")
    public static int field3161 = -2;

    @OriginalMember(owner = "client!wt", name = "n", descriptor = "[Lkg;")
    public static class183[] field3163 = new class183[14];

    @OriginalMember(owner = "client!wt", name = "m", descriptor = "Lqt;")
    public static class459 field3162 = new class459(18, -1);

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)V")
    public final void method1415(byte arg0) {
        field3151++;
        if (arg0 < 19) {
            this.field3164 = null;
        }
        class511 var2 = this.field3153;
        synchronized (this.field3153) {
            this.field3153.method2990((byte) -109);
        }
        class511 var3 = this.field3164;
        synchronized (this.field3164) {
            this.field3164.method2990((byte) -120);
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IZIIFIIII)[[I")
    public static final int[][] method1416(int arg0, boolean arg1, int arg2, int arg3, float arg4, int arg5, int arg6, int arg7, int arg8) {
        field3156++;
        int[][] var9 = new int[arg0][arg8];
        class442 var10 = new class442();
        var10.field6289 = arg1;
        var10.field6295 = arg5;
        var10.field6299 = (int) (arg4 * 4096.0F);
        var10.field6291 = arg7;
        var10.field6308 = arg3;
        var10.method66((byte) 112);
        class203.method1401((byte) 55, arg8, arg0);
        for (int var11 = 0; var11 < arg0; var11++) {
            var10.method2603(var9[var11], var11, -81);
        }
        return arg6 == -29719 ? var9 : null;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
    public static void method1417(int arg0) {
        field3158 = null;
        field3163 = null;
        if (arg0 > 18) {
            field3162 = null;
            field3159 = null;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(II)V")
    public final void method1418(int arg0, int arg1) {
        class511 var3 = this.field3153;
        synchronized (this.field3153) {
            this.field3153.method2989(false, arg0);
        }
        field3157++;
        if (arg1 == 113) {
            class511 var4 = this.field3164;
            synchronized (this.field3164) {
                this.field3164.method2989(false, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(B)V")
    public final void method1419(byte arg0) {
        int var2 = 58 % ((-arg0 - 42) / 55);
        class511 var3 = this.field3153;
        synchronized (this.field3153) {
            this.field3153.method2980(-182819096);
        }
        field3150++;
        class511 var4 = this.field3164;
        synchronized (this.field3164) {
            this.field3164.method2980(-182819096);
        }
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(II)Lpe;")
    public final class441 method1420(int arg0, int arg1) {
        field3152++;
        class511 var3 = this.field3153;
        class441 var4;
        synchronized (this.field3153) {
            var4 = (class441) this.field3153.method2982(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class320 var5 = this.field3160;
        byte[] var6;
        synchronized (this.field3160) {
            if (arg0 != -12616) {
                field3158 = null;
            }
            var6 = this.field3160.method2037(arg1, (byte) 46, 33);
        }
        class441 var7 = new class441();
        var7.field6286 = this;
        if (var6 != null) {
            var7.method2594((byte) -71, new class519(var6));
        }
        class511 var8 = this.field3153;
        synchronized (this.field3153) {
            this.field3153.method2981(var7, 97, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lsn;ILci;Lci;)V")
    public class208(class453 arg0, int arg1, class320 arg2, class320 arg3) {
        this.field3160 = arg2;
        this.field3155 = arg3;
        this.field3160.method2030(-10914, 33);
    }
}
