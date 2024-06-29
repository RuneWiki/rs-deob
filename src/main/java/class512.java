import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class512 extends class466 {

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
    private int field7195 = 0;

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "I")
    private int field7204 = 0;

    @OriginalMember(owner = "client!rj", name = "T", descriptor = "I")
    private int field7207 = 0;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "Loca;")
    public static class221 field7196 = new class221(13, 0, 1, 0);

    @OriginalMember(owner = "client!rj", name = "X", descriptor = "Lbi;")
    public static class408 field7211 = new class408(2);

    @OriginalMember(owner = "client!rj", name = "bb", descriptor = "J")
    public static long field7215 = -1L;

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
    public static int field7194;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
    public static int field7197;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "I")
    public static int field7198;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    public static int field7199;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    private int field7200;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "I")
    public static int field7201;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
    private int field7202;

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "I")
    private int field7203;

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "I")
    private int field7205;

    @OriginalMember(owner = "client!rj", name = "S", descriptor = "I")
    public static int field7206;

    @OriginalMember(owner = "client!rj", name = "U", descriptor = "I")
    private int field7208;

    @OriginalMember(owner = "client!rj", name = "V", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!rj", name = "W", descriptor = "I")
    public static int field7210;

    @OriginalMember(owner = "client!rj", name = "Z", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!rj", name = "cb", descriptor = "I")
    private int field7216;

    @OriginalMember(owner = "client!rj", name = "ab", descriptor = "Ljava/lang/Object;")
    public static Object field7214;

    @OriginalMember(owner = "client!rj", name = "Y", descriptor = "[S")
    public static short[] field7212;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "(III)Z")
    public static final boolean method2962(int arg0, int arg1, int arg2) {
        ++field7209;
        if (arg1 != -22395) {
            method2965((byte) -43);
        }
        return ~(1024 & arg2) != -1;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method33(int arg0, boolean arg1) {
        ++field7201;
        if (arg1) {
            return null;
        } else {
            int[][] var3 = super.field6569.method828((byte) 127, arg0);
            if (super.field6569.field1934) {
                int[][] var4 = this.method2719(0, arg0, 5);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class312.field4207 < ~var11; ++var11) {
                    this.method2964(var7[var11], var5[var11], arg1, var6[var11]);
                    this.field7202 += this.field7207;
                    this.field7216 += this.field7195;
                    this.field7203 += this.field7204;
                    while (this.field7216 < 0) {
                        this.field7216 += 4096;
                    }
                    while (this.field7216 > 4096) {
                        this.field7216 -= 4096;
                    }
                    if (this.field7202 < 0) {
                        this.field7202 = 0;
                    }
                    if (this.field7203 < 0) {
                        this.field7203 = 0;
                    }
                    if (this.field7202 > 4096) {
                        this.field7202 = 4096;
                    }
                    if (this.field7203 > 4096) {
                        this.field7203 = 4096;
                    }
                    this.method2968(this.field7202, this.field7203, this.field7216, 1572544588);
                    var8[var11] = this.field7208;
                    var9[var11] = this.field7205;
                    var10[var11] = this.field7200;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZIII)V")
    public static final void method2963(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class303.field4138 = 0L;
        ++field7210;
        if (arg3 != -4) {
            method2966((class21) null, 20);
        }
        int var5 = class486.method2827(76);
        if (arg0 == 3 || ~var5 == -4) {
            arg1 = true;
        }
        if (!class69.field1165.method1273()) {
            arg1 = true;
        }
        class453.method2660((byte) -105, arg1, arg4, arg0, var5, arg2);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIZI)V")
    private final void method2964(int arg0, int arg1, boolean arg2, int arg3) {
        ++field7206;
        int var5 = arg1 <= arg3 ? arg3 : arg1;
        if (arg2) {
            method2962(-91, -94, -37);
        }
        int var6 = ~arg1 > ~arg3 ? arg1 : arg3;
        int var7 = arg0 > var5 ? arg0 : var5;
        int var8 = ~arg0 <= ~var6 ? var6 : arg0;
        this.field7203 = (var7 + var8) / 2;
        int var9 = -var8 + var7;
        if (this.field7203 > 0 && ~this.field7203 > -4097) {
            this.field7202 = (var9 << 12) / (this.field7203 > 2048 ? 8192 - this.field7203 * 2 : this.field7203 * 2);
        } else {
            this.field7202 = 0;
        }
        if (var9 > 0) {
            int var10 = (-arg1 + var7 << 12) / var9;
            int var11 = (-arg3 + var7 << 12) / var9;
            int var12 = (-arg0 + var7 << 12) / var9;
            if (~arg1 == ~var7) {
                this.field7216 = arg3 == var8 ? var12 + 20480 : -var11 + 4096;
            } else if (arg3 != var7) {
                this.field7216 = arg1 != var8 ? -var10 + 20480 : var11 + 12288;
            } else {
                this.field7216 = ~arg0 != ~var8 ? -var12 + 12288 : var10 + 4096;
            }
            this.field7216 /= 6;
        } else {
            this.field7216 = 0;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field7204 = (arg0.method67(65280) << 12) / 100;
                }
            } else {
                this.field7207 = (arg0.method67(65280) << 12) / 100;
            }
        } else {
            this.field7195 = arg0.method111(-126);
        }
        ++field7213;
        if (arg1 != -5062) {
            this.field7205 = -59;
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V")
    public class512() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)V")
    public static void method2965(byte arg0) {
        field7212 = null;
        field7196 = null;
        int var1 = 74 % ((arg0 - -47) / 37);
        field7214 = null;
        field7211 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lan;I)V")
    public static final void method2966(class21 arg0, int arg1) {
        class150.field2285 = arg0.method252((byte) -74, "titlebg");
        ++field7199;
        class427.field6067 = arg0.method252((byte) -76, "logo");
        if (arg1 != -3991) {
            field7215 = 111L;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lqa;B)V")
    public static final void method2967(class207 arg0, byte arg1) {
        int var2 = -83 % ((79 - arg1) / 47);
        for (class475 var3 = (class475) class150.field2281.method3150(16); var3 != null; var3 = (class475) class150.field2281.method3147(16)) {
            var3.method2766(arg0);
        }
        ++field7197;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIII)V")
    private final void method2968(int arg0, int arg1, int arg2, int arg3) {
        ++field7194;
        if (arg3 != 1572544588) {
            this.field7216 = -49;
        }
        int var5 = arg1 > 2048 ? arg1 - -arg0 + -(arg0 * arg1 >> 12) : (arg0 + 4096) * arg1 >> 12;
        if (~var5 < -1) {
            int var6 = arg2 * 6;
            int var7 = arg1 + arg1 + -var5;
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (var9 == 0) {
                this.field7208 = var5;
                this.field7205 = var14;
                this.field7200 = var7;
                return;
            }
            if (var9 == 1) {
                this.field7208 = var15;
                this.field7205 = var5;
                this.field7200 = var7;
                return;
            }
            if (var9 == 2) {
                this.field7208 = var7;
                this.field7205 = var5;
                this.field7200 = var14;
                return;
            }
            if (var9 == 3) {
                this.field7205 = var15;
                this.field7200 = var5;
                this.field7208 = var7;
                return;
            }
            if (var9 == 4) {
                this.field7200 = var5;
                this.field7205 = var7;
                this.field7208 = var14;
                return;
            }
            if (var9 == 5) {
                this.field7200 = var15;
                this.field7208 = var5;
                this.field7205 = var7;
                return;
            }
        } else {
            this.field7208 = this.field7205 = this.field7200 = arg1;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIB)Lmc;")
    public static final class114 method2969(int arg0, int arg1, byte arg2) {
        if (arg2 < 85) {
            method2963(-26, false, 98, 0, -59);
        }
        ++field7198;
        class114 var3 = class612.method3584(arg0, 0);
        if (arg1 == -1) {
            return var3;
        } else {
            return var3 != null && var3.field1886 != null && var3.field1886.length > arg1 ? var3.field1886[arg1] : null;
        }
    }

    static {
        new class104("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
    }
}
