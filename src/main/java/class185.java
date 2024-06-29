import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class185 {

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Lmi;")
    private class259 field3321 = new class259();

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "Laf;")
    private class68 field3340 = new class68();

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    private int field3342;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    private int field3341;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "Lta;")
    private class255 field3337;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "[[I")
    public static int[][] field3325 = new int[104][104];

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public static int field3329 = 0;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public static int field3333 = 0;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "Lcc;")
    public static class209 field3339 = class95.method669(97, "M");

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    public static int field3343 = 0;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "Lsj;")
    public static class49 field3326;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "Z")
    public static boolean field3338;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "[I")
    public static int[] field3332;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "[Lij;")
    public static class194[] field3336;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "[S")
    public static short[] field3328;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "()V")
    public static final void method1256() {
        if (class48.field926 != null) {
            for (int var0 = 0; var0 < class48.field926.length; var0++) {
                for (int var1 = 0; var1 < class56.field1154; var1++) {
                    for (int var2 = 0; var2 < class277.field4879; var2++) {
                        class48.field926[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class22.field412 != null) {
            for (int var3 = 0; var3 < class22.field412.length; var3++) {
                for (int var4 = 0; var4 < class56.field1154; var4++) {
                    for (int var5 = 0; var5 < class277.field4879; var5++) {
                        class22.field412[var3][var4][var5] = null;
                    }
                }
            }
        }
        class117.field2358 = 0;
        if (class124.field2420 != null) {
            for (int var6 = 0; var6 < class117.field2358; var6++) {
                class124.field2420[var6] = null;
            }
        }
        if (class122.field2410 != null) {
            for (int var7 = 0; var7 < class228.field4159; var7++) {
                class122.field2410[var7] = null;
            }
            class228.field4159 = 0;
        }
        if (class195.field3513 != null) {
            for (int var8 = 0; var8 < class195.field3513.length; var8++) {
                class195.field3513[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(JI)Lmi;")
    public final class259 method1257(long arg0, int arg1) {
        field3324++;
        if (arg1 > -19) {
            return null;
        }
        class259 var4 = (class259) this.field3337.method1755(arg0, (byte) -95);
        if (var4 != null) {
            this.field3340.method501(var4, true);
        }
        return var4;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLsj;IIIII)V")
    public static final void method1258(boolean arg0, class49 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 > -9) {
            return;
        }
        class54.field1067 = arg3;
        class65.field1264 = arg1;
        class61.field1220 = arg5;
        class244.field4428 = 1;
        class99.field1930 = arg4;
        class262.field4724 = arg2;
        class131.field2513 = arg0;
        field3322++;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(JLmi;Z)V")
    public final void method1259(long arg0, class259 arg1, boolean arg2) {
        if (arg2) {
            this.field3321 = null;
        }
        if (this.field3342 == 0) {
            class259 var5 = this.field3340.method500(31480);
            var5.method269(-214950896);
            var5.method1796(-42);
            if (this.field3321 == var5) {
                class259 var6 = this.field3340.method500(31480);
                var6.method269(-214950896);
                var6.method1796(-97);
            }
        } else {
            this.field3342--;
        }
        field3320++;
        this.field3337.method1762(arg1, arg0, (byte) 73);
        this.field3340.method501(arg1, !arg2);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
    public final void method1260(boolean arg0) {
        this.field3340.method506((byte) -92);
        field3327++;
        if (arg0) {
            method1261(-91);
        }
        this.field3337.method1757(-29914);
        this.field3321 = new class259();
        this.field3342 = this.field3341;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static void method1261(int arg0) {
        field3326 = null;
        field3328 = null;
        field3336 = null;
        field3332 = null;
        field3325 = null;
        field3339 = null;
        if (arg0 != 0) {
            field3329 = 81;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)I")
    public static final int method1262(int arg0, byte arg1) {
        if (arg1 < 108) {
            field3338 = true;
        }
        field3331++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)Lva;")
    public final class34 method1263(byte arg0) {
        if (arg0 == 40) {
            field3335++;
            return this.field3337.method1759((byte) 43);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)Lva;")
    public final class34 method1264(int arg0) {
        field3334++;
        if (arg0 > -20) {
            this.method1263((byte) -113);
        }
        return this.field3337.method1767((byte) 41);
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(I)V")
    public class185(int arg0) {
        int var2 = 1;
        this.field3342 = arg0;
        while (arg0 > (var2 + var2)) {
            var2 += var2;
        }
        this.field3341 = arg0;
        this.field3337 = new class255(var2);
    }
}
