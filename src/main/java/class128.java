import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class128 {

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    private int field2247 = 0;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    private int field2245 = -1;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "Lwe;")
    private class15 field2241 = new class15();

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "Z")
    public boolean field2258 = false;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
    private int field2257;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    private int field2250;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "[Lhe;")
    private class19[] field2251;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "[[I")
    private int[][] field2246;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    public static int field2249 = 0;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "Ljd;")
    public static class85 field2242 = class221.method1499("gr-Un:", (byte) 104);

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "Ljd;")
    public static class85 field2238 = class221.method1499(" zuerst von Ihrer Freunde)2Liste(Q", (byte) 116);

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "[I")
    public static int[] field2253;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)[[I")
    public final int[][] method864(byte arg0) {
        field2239++;
        if (arg0 != -98) {
            return null;
        } else if (this.field2257 == this.field2250) {
            for (int var2 = 0; var2 < this.field2257; var2++) {
                this.field2251[var2] = class2.field23;
            }
            return this.field2246;
        } else {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public static final void method865(int arg0) {
        class94.field1715.method1262(17244);
        class178.field3039.method1262(17244);
        if (arg0 != 20806) {
            field2253 = null;
        }
        class6.field74.method1262(arg0 ^ 0x121A);
        field2254++;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
    public static void method866(int arg0) {
        field2253 = null;
        field2238 = null;
        field2242 = null;
        if (arg0 > -59) {
            method872(123, -91, -52, -88, -65, -11, 107);
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)I")
    public static final int method867(int arg0) {
        field2255++;
        if ((double) class11.field165 == 3.0D) {
            return 37;
        } else if (arg0 != 100) {
            return -50;
        } else if ((double) class11.field165 == 4.0D) {
            return 50;
        } else if ((double) class11.field165 == 6.0D) {
            return 75;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)[I")
    public final int[] method868(int arg0, byte arg1) {
        int var3 = 110 / ((arg1 - 56) / 43);
        field2240++;
        if (this.field2257 == this.field2250) {
            this.field2258 = this.field2251[arg0] == null;
            this.field2251[arg0] = class2.field23;
            return this.field2246[arg0];
        } else if (this.field2257 == 1) {
            this.field2258 = this.field2245 != arg0;
            this.field2245 = arg0;
            return this.field2246[0];
        } else {
            class19 var4 = this.field2251[arg0];
            if (var4 == null) {
                this.field2258 = true;
                if (this.field2247 < this.field2257) {
                    var4 = new class19(arg0, this.field2247);
                    this.field2247++;
                } else {
                    class19 var5 = (class19) this.field2241.method113(44);
                    var4 = new class19(arg0, var5.field271);
                    this.field2251[var5.field272] = null;
                    var5.method1753(137);
                }
                this.field2251[arg0] = var4;
            } else {
                this.field2258 = false;
            }
            this.field2241.method108(var4, 6266);
            return this.field2246[var4.field271];
        }
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)V")
    public static final void method869(int arg0) {
        if (arg0 != 0) {
            field2249 = 22;
        }
        class189.field3247.method1262(17244);
        class199.field3454.method1262(17244);
        field2248++;
    }

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)V")
    public final void method870(int arg0) {
        if (arg0 != 2) {
            field2238 = null;
        }
        for (int var2 = 0; var2 < this.field2257; var2++) {
            this.field2246[var2] = null;
        }
        this.field2251 = null;
        this.field2246 = null;
        field2243++;
        this.field2241.method112(90);
        this.field2241 = null;
    }

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "(I)V")
    public static final void method871(int arg0) {
        field2252++;
        class172.field2975 = new class204(arg0);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIII)I")
    public static final int method872(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2244++;
        if (arg5 < 27) {
            field2242 = null;
        }
        int var7 = arg1 & 0x3;
        if ((arg2 & 0x1) == 1) {
            int var8 = arg0;
            arg0 = arg3;
            arg3 = var8;
        }
        if (var7 == 0) {
            return arg4;
        } else if (var7 == 1) {
            return arg6;
        } else if (var7 == 2) {
            return 7 - (arg4 - (1 - arg0));
        } else {
            return 7 - arg6 - (arg3 + -1);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)Lpe;")
    public static final class233 method873(int arg0, int arg1, int arg2) {
        class208 var3 = class99.field1780[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class233 var4 = var3.field3656;
            var3.field3656 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(III)V")
    public class128(int arg0, int arg1, int arg2) {
        this.field2257 = arg0;
        this.field2250 = arg1;
        this.field2251 = new class19[this.field2250];
        this.field2246 = new int[this.field2257][arg2];
    }
}
