import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public class class364 {

    @OriginalMember(owner = "client!uia", name = "u", descriptor = "I")
    public int field5259;

    @OriginalMember(owner = "client!uia", name = "g", descriptor = "[B")
    private byte[] field5245;

    @OriginalMember(owner = "client!uia", name = "f", descriptor = "[I")
    public static int[] field5244 = new int[1];

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "I")
    public int field5240;

    @OriginalMember(owner = "client!uia", name = "i", descriptor = "I")
    public int field5247;

    @OriginalMember(owner = "client!uia", name = "j", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!uia", name = "m", descriptor = "I")
    public int field5251;

    @OriginalMember(owner = "client!uia", name = "p", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!uia", name = "r", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!uia", name = "k", descriptor = "Lgo;")
    public class630 field5249;

    @OriginalMember(owner = "client!uia", name = "v", descriptor = "Ljava/lang/Object;")
    public static Object field5260;

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "[I")
    public int[] field5239;

    @OriginalMember(owner = "client!uia", name = "c", descriptor = "[I")
    public int[] field5241;

    @OriginalMember(owner = "client!uia", name = "d", descriptor = "[I")
    public static int[] field5242;

    @OriginalMember(owner = "client!uia", name = "e", descriptor = "[I")
    public int[] field5243;

    @OriginalMember(owner = "client!uia", name = "h", descriptor = "[I")
    public int[] field5246;

    @OriginalMember(owner = "client!uia", name = "n", descriptor = "[I")
    public int[] field5252;

    @OriginalMember(owner = "client!uia", name = "q", descriptor = "[I")
    public int[] field5255;

    @OriginalMember(owner = "client!uia", name = "t", descriptor = "[Lgo;")
    public class630[] field5258;

    @OriginalMember(owner = "client!uia", name = "o", descriptor = "[[B")
    public byte[][] field5253;

    @OriginalMember(owner = "client!uia", name = "l", descriptor = "[[I")
    public int[][] field5250;

    @OriginalMember(owner = "client!uia", name = "s", descriptor = "[[I")
    public int[][] field5257;

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(B[B)V", line = 8)
    private final void method2254(byte arg0, byte[] arg1) {
        field5248++;
        class645 var3 = new class645(class243.method1623((byte) 18, arg1));
        int var4 = var3.method3745(-6314);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field5251 = 0;
        } else {
            this.field5251 = var3.method3720(-19541);
        }
        int var5 = var3.method3745(-6314);
        boolean var6 = (var5 & 0x1) != 0;
        this.field5240 = var3.method3712((byte) 98);
        boolean var7 = (var5 & 0x2) != 0;
        int var8 = 0;
        int var9 = -1;
        this.field5239 = new int[this.field5240];
        for (int var10 = 0; var10 < this.field5240; var10++) {
            this.field5239[var10] = var8 += var3.method3712((byte) -111);
            if (this.field5239[var10] > var9) {
                var9 = this.field5239[var10];
            }
        }
        this.field5247 = var9 + 1;
        this.field5252 = new int[this.field5247];
        this.field5250 = new int[this.field5247][];
        this.field5241 = new int[this.field5247];
        this.field5246 = new int[this.field5247];
        this.field5243 = new int[this.field5247];
        if (var7) {
            this.field5253 = new byte[this.field5247][];
        }
        if (var6) {
            this.field5255 = new int[this.field5247];
            for (int var11 = 0; var11 < this.field5247; var11++) {
                this.field5255[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field5240; var12++) {
                this.field5255[this.field5239[var12]] = var3.method3720(-19541);
            }
            this.field5249 = new class630(this.field5255);
        }
        for (int var13 = 0; var13 < this.field5240; var13++) {
            this.field5252[this.field5239[var13]] = var3.method3720(-19541);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field5240; var14++) {
                byte[] var15 = new byte[64];
                var3.method3736(-119, var15, 64, 0);
                this.field5253[this.field5239[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field5240; var16++) {
            this.field5241[this.field5239[var16]] = var3.method3720(arg0 - 19610);
        }
        int var17 = 0;
        if (arg0 != 69) {
            this.field5240 = -16;
        }
        while (this.field5240 > var17) {
            this.field5243[this.field5239[var17]] = var3.method3712((byte) -108);
            var17++;
        }
        for (int var18 = 0; var18 < this.field5240; var18++) {
            int var25 = this.field5239[var18];
            int var26 = this.field5243[var25];
            int var27 = 0;
            this.field5250[var25] = new int[var26];
            int var28 = -1;
            for (int var29 = 0; var29 < var26; var29++) {
                int var30 = this.field5250[var25][var29] = var27 += var3.method3712((byte) 17);
                if (var30 > var28) {
                    var28 = var30;
                }
            }
            this.field5246[var25] = var28 + 1;
            if (var28 + 1 == var26) {
                this.field5250[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field5258 = new class630[var9 + 1];
        this.field5257 = new int[var9 + 1][];
        for (int var19 = 0; var19 < this.field5240; var19++) {
            int var20 = this.field5239[var19];
            int var21 = this.field5243[var20];
            this.field5257[var20] = new int[this.field5246[var20]];
            for (int var22 = 0; var22 < this.field5246[var20]; var22++) {
                this.field5257[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field5250[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field5250[var20][var23];
                }
                this.field5257[var20][var24] = var3.method3720(-19541);
            }
            this.field5258[var20] = new class630(this.field5257[var20]);
        }
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(B)V", line = 212)
    public static void method2255(byte arg0) {
        field5242 = null;
        field5244 = null;
        field5260 = null;
        if (arg0 != -50) {
            method2255((byte) -87);
        }
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(I)V", line = 236)
    public static final void method2256(int arg0) {
        class601.field8505.method2289(1393);
        field5256++;
        if (arg0 > -27) {
            method2256(-3);
        }
    }

    @OriginalMember(owner = "client!uia", name = "<init>", descriptor = "([BI[B)V", line = 250)
    public class364(byte[] arg0, int arg1, byte[] arg2) {
        this.field5259 = class210.method1420(arg0, arg0.length, 0);
        if (this.field5259 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field5245 = class587.method3396(0, arg0, arg0.length, (byte) 70);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field5245[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method2254((byte) 69, arg0);
    }
}
