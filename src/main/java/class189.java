import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class189 extends class313 {

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "I")
    private int field3161 = 81;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "I")
    private int field3165 = 1024;

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "I")
    private int field3164 = 4;

    @OriginalMember(owner = "client!rd", name = "U", descriptor = "I")
    private int field3172 = 204;

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "I")
    private int field3166 = 8;

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "I")
    private int field3162 = 409;

    @OriginalMember(owner = "client!rd", name = "ab", descriptor = "I")
    private int field3178 = 0;

    @OriginalMember(owner = "client!rd", name = "Y", descriptor = "I")
    private int field3176 = 1024;

    @OriginalMember(owner = "client!rd", name = "Z", descriptor = "Z")
    public static boolean field3177 = false;

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "I")
    private int field3169;

    @OriginalMember(owner = "client!rd", name = "S", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!rd", name = "V", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!rd", name = "W", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!rd", name = "bb", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!rd", name = "cb", descriptor = "I")
    private int field3180;

    @OriginalMember(owner = "client!rd", name = "db", descriptor = "I")
    private int field3181;

    @OriginalMember(owner = "client!rd", name = "eb", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!rd", name = "fb", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "Lcg;")
    public static class49 field3167;

    @OriginalMember(owner = "client!rd", name = "X", descriptor = "[I")
    private int[] field3175;

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "[[I")
    private int[][] field3163;

    @OriginalMember(owner = "client!rd", name = "T", descriptor = "[[I")
    private int[][] field3171;

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V", line = 133)
    public class189() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)[I", line = 17)
    public final int[] method111(int arg0, int arg1) {
        int[] var3 = this.field4961.method1520(-1908965694, arg1);
        if (arg0 != 4) {
            field3182 = -104;
        }
        if (this.field4961.field3451) {
            int var4 = 0;
            int var5;
            for (var5 = class1.field6[arg1] + this.field3178; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field3166 > var4 && this.field3175[var4] <= var5) {
                var4++;
            }
            boolean var6 = (var4 & 0x1) == 0;
            int var7 = this.field3175[var4 - 1];
            int var8 = this.field3175[var4];
            int var9 = var4 - 1;
            if (var5 > var7 + this.field3181 && (var8 - this.field3181) > var5) {
                for (int var10 = 0; var10 < class133.field2269; var10++) {
                    int var11 = 0;
                    int var12 = var6 ? this.field3176 : -this.field3176;
                    int var13;
                    for (var13 = (this.field3180 * var12 >> 12) + class8.field104[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (var11 < this.field3164 && this.field3171[var9][var11] <= var13) {
                        var11++;
                    }
                    int var14 = this.field3171[var9][var11];
                    int var15 = var11 - 1;
                    int var16 = this.field3171[var9][var15];
                    if (this.field3181 + var16 < var13 && (var14 - this.field3181) > var13) {
                        var3[var10] = this.field3163[var9][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class345.method2422(var3, 0, class133.field2269, 0);
            }
        }
        field3183++;
        return var3;
    }

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "(I)V", line = 141)
    private final void method1437(int arg0) {
        field3170++;
        Random var2 = new Random((long) this.field3166);
        this.field3180 = 4096 / this.field3164;
        int var3 = this.field3180 / 2;
        this.field3171 = new int[this.field3166][this.field3164 + 1];
        this.field3169 = 4096 / this.field3166;
        this.field3163 = new int[this.field3166][this.field3164];
        this.field3175 = new int[this.field3166 + 1];
        int var4 = this.field3169 / 2;
        this.field3175[0] = arg0;
        this.field3181 = this.field3161 / 2;
        for (int var5 = 0; var5 < this.field3166; var5++) {
            if (var5 > 0) {
                int var6 = this.field3169;
                int var7 = (class129.method1075(4096, 19192, var2) - 2048) * this.field3172 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field3175[var5] = this.field3175[var5 - 1] + var8;
            }
            this.field3171[var5][0] = 0;
            for (int var9 = 0; var9 < this.field3164; var9++) {
                if (var9 > 0) {
                    int var10 = this.field3180;
                    int var11 = (class129.method1075(4096, 19192, var2) - 2048) * this.field3162 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field3171[var5][var9] = this.field3171[var5][var9 - 1] + var12;
                }
                this.field3163[var5][var9] = this.field3165 <= 0 ? 4096 : 4096 - class129.method1075(this.field3165, class289.method1969(arg0, 19192), var2);
            }
            this.field3171[var5][this.field3164] = 4096;
        }
        this.field3175[this.field3166] = 4096;
    }

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "(I)V", line = 202)
    public static void method1438(int arg0) {
        field3167 = null;
        if (arg0 != 4) {
            method1438(110);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IILpi;)V", line = 224)
    public final void method185(int arg0, int arg1, class336 arg2) {
        field3168++;
        if (arg0 == 0) {
            this.field3164 = arg2.method2364(-9069);
        } else if (arg0 == 1) {
            this.field3166 = arg2.method2364(-9069);
        } else if (arg0 == 2) {
            this.field3162 = arg2.method2339((byte) -46);
        } else if (arg0 == 3) {
            this.field3172 = arg2.method2339((byte) -46);
        } else if (arg0 == 4) {
            this.field3176 = arg2.method2339((byte) -46);
        } else if (arg0 == 5) {
            this.field3178 = arg2.method2339((byte) -46);
        } else if (arg0 == 6) {
            this.field3161 = arg2.method2339((byte) -46);
        } else if (arg0 == 7) {
            this.field3165 = arg2.method2339((byte) -46);
        }
        if (arg1 != -17848) {
            this.method111(79, 5);
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V", line = 315)
    public final void method182(int arg0) {
        this.method1437(0);
        field3173++;
        if (arg0 != 25833) {
            this.method1437(49);
        }
    }
}
