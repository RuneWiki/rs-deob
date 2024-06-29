import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public abstract class class334 extends class381 {

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
    private int field4864;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public int field4853;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
    private int field4860;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
    public int field4859;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "F")
    public float field4848;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    public int field4858;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "[[Z")
    public static boolean[][] field4849 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "F")
    public static float field4850;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "Lvg;")
    public static class622 field4862;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 5)
    public static void method2043(int arg0) {
        int var1 = 119 / ((68 - arg0) / 43);
        field4862 = null;
        field4849 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lmv;III)Lida;", line = 20)
    public static final class604 method2044(class295 arg0, int arg1, int arg2, int arg3) {
        field4852++;
        class540 var4 = new class540(arg0.method1844(arg1, 31330, arg2));
        class604 var5 = new class604(arg2, var4.method3145((byte) -121), var4.method3145((byte) -121), var4.method3160(false), var4.method3160(false), arg3 == ~var4.method3115(arg3 ^ 0xFFFF8B51), var4.method3115(29871), var4.method3115(29871));
        int var6 = var4.method3115(29871);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field8739.method1909(new class468(var4.method3115(29871), var4.method3169(26488), var4.method3169(26488), var4.method3169(26488), var4.method3169(arg3 ^ 0xFFFF9886), var4.method3169(26488), var4.method3169(26488), var4.method3169(26488), var4.method3169(26488)), (byte) -81);
        }
        var5.method3444((byte) 125);
        return var5;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)I", line = 48)
    public final int method2045(int arg0) {
        if (arg0 != 0) {
            this.field4860 = 72;
        }
        field4857++;
        return this.field4859;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)I", line = 59)
    public final int method2046(boolean arg0) {
        if (!arg0) {
            field4850 = 0.06026687F;
        }
        field4855++;
        return this.field4853;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)Z", line = 77)
    public static final boolean method2047(int arg0, int arg1, int arg2) {
        field4863++;
        if (arg2 != 0) {
            field4850 = 1.2566695F;
        }
        return (class454.method2663(arg1, arg0, (byte) -107) | class78.method450(arg0, -23951, arg1) | class172.method1194(arg1, (byte) -92, arg0)) & class65.method392(arg1, 2048, arg0);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IB)I", line = 88)
    public static final int method2048(int arg0, byte arg1) {
        field4854++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        if (arg1 > -27) {
            return 105;
        } else {
            int var7 = var6 | var6 >>> 16;
            return arg0 & ~var7;
        }
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)I", line = 109)
    public final int method2049(int arg0) {
        if (arg0 != 0) {
            field4862 = null;
        }
        field4861++;
        return this.field4864;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)I", line = 123)
    public final int method2050(byte arg0) {
        if (arg0 > -2) {
            this.field4864 = -52;
        }
        field4866++;
        return this.field4858;
    }

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)I", line = 135)
    public final int method2051(int arg0) {
        if (arg0 == -520326527) {
            field4856++;
            return this.field4860;
        } else {
            return 66;
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(IIIIIF)V", line = 147)
    public class334(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field4864 = arg4;
        this.field4853 = arg2;
        this.field4860 = arg3;
        this.field4859 = arg1;
        this.field4848 = arg5;
        this.field4858 = arg0;
    }

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)[Lsg;", line = 161)
    public static final class432[] method2052(int arg0) {
        field4865++;
        if (arg0 <= 104) {
            return null;
        }
        if (class139.field2021 == null) {
            class432[] var1 = class654.method3697(-2, class61.field978);
            class432[] var2 = new class432[var1.length];
            int var3 = 0;
            int var4 = class335.field4872.method3437(false, class62.field996);
            label73: for (int var5 = 0; var5 < var1.length; var5++) {
                class432 var9 = var1[var5];
                if ((var9.field6272 <= 0 || var9.field6272 >= 24) && var9.field6273 >= 800 && var9.field6274 >= 600 && (var4 != 2 || var9.field6273 <= 800 && var9.field6274 <= 600) && (var4 != 1 || var9.field6273 <= 1024 && var9.field6274 <= 768)) {
                    for (int var10 = 0; var10 < var3; var10++) {
                        class432 var11 = var2[var10];
                        if (var9.field6273 == var11.field6273 && var9.field6274 == var11.field6274) {
                            if (var9.field6272 > var11.field6272) {
                                var2[var10] = var9;
                            }
                            continue label73;
                        }
                    }
                    var2[var3] = var9;
                    var3++;
                }
            }
            class139.field2021 = new class432[var3];
            class667.method3744(var2, 0, class139.field2021, 0, var3);
            int[] var6 = new int[class139.field2021.length];
            for (int var7 = 0; var7 < class139.field2021.length; var7++) {
                class432 var8 = class139.field2021[var7];
                var6[var7] = var8.field6274 * var8.field6273;
            }
            class220.method1382(class139.field2021, (byte) -78, var6);
        }
        return class139.field2021;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)F", line = 249)
    public final float method2053(byte arg0) {
        if (arg0 < 105) {
            return 0.025308266F;
        } else {
            field4851++;
            return this.field4848;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(FB)V")
    public abstract void method1165(float arg0, byte arg1);

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIII)V")
    public abstract void method1166(int arg0, int arg1, int arg2, int arg3);
}
