import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class307 {

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "I")
    public int field4247;

    @OriginalMember(owner = "client!vw", name = "v", descriptor = "[B")
    private byte[] field4268;

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "I")
    public static int field4248 = 0;

    @OriginalMember(owner = "client!vw", name = "i", descriptor = "I")
    public int field4255;

    @OriginalMember(owner = "client!vw", name = "m", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!vw", name = "n", descriptor = "I")
    public int field4260;

    @OriginalMember(owner = "client!vw", name = "p", descriptor = "I")
    public int field4262;

    @OriginalMember(owner = "client!vw", name = "r", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!vw", name = "u", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!vw", name = "w", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!vw", name = "e", descriptor = "Lcj;")
    public class693 field4251;

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "[I")
    public int[] field4250;

    @OriginalMember(owner = "client!vw", name = "f", descriptor = "[I")
    public int[] field4252;

    @OriginalMember(owner = "client!vw", name = "g", descriptor = "[I")
    public int[] field4253;

    @OriginalMember(owner = "client!vw", name = "h", descriptor = "[I")
    public static int[] field4254;

    @OriginalMember(owner = "client!vw", name = "k", descriptor = "[I")
    public int[] field4257;

    @OriginalMember(owner = "client!vw", name = "o", descriptor = "[I")
    public int[] field4261;

    @OriginalMember(owner = "client!vw", name = "t", descriptor = "[I")
    public int[] field4266;

    @OriginalMember(owner = "client!vw", name = "s", descriptor = "[Lga;")
    public static class404[] field4265;

    @OriginalMember(owner = "client!vw", name = "j", descriptor = "[Lcj;")
    public class693[] field4256;

    @OriginalMember(owner = "client!vw", name = "l", descriptor = "[[B")
    public byte[][] field4258;

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "[[I")
    public int[][] field4249;

    @OriginalMember(owner = "client!vw", name = "q", descriptor = "[[I")
    public int[][] field4263;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(III)I")
    public static final int method2001(int arg0, int arg1, int arg2) {
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (arg0 != 0) {
            method2001(52, -11, 108);
        }
        field4269++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(B)V")
    public static void method2002(byte arg0) {
        field4254 = null;
        if (arg0 < 55) {
            field4265 = null;
        }
        field4265 = null;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(B[B)V")
    private final void method2003(byte arg0, byte[] arg1) {
        field4259++;
        class215 var3 = new class215(class432.method2628(arg1, -105));
        int var4 = var3.method1535(255);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field4260 = 0;
        } else {
            this.field4260 = var3.method1533((byte) -126);
        }
        int var5 = var3.method1535(255);
        boolean var6 = (var5 & 0x1) != 0;
        boolean var7 = (var5 & 0x2) != 0;
        this.field4255 = var3.method1478(842397944);
        int var8 = 0;
        this.field4266 = new int[this.field4255];
        int var9 = -1;
        for (int var10 = 0; var10 < this.field4255; var10++) {
            this.field4266[var10] = var8 += var3.method1478(842397944);
            if (var9 < this.field4266[var10]) {
                var9 = this.field4266[var10];
            }
        }
        this.field4262 = var9 + 1;
        if (var7) {
            this.field4258 = new byte[this.field4262][];
        }
        this.field4257 = new int[this.field4262];
        this.field4252 = new int[this.field4262];
        this.field4253 = new int[this.field4262];
        this.field4250 = new int[this.field4262];
        this.field4249 = new int[this.field4262][];
        if (var6) {
            this.field4261 = new int[this.field4262];
            for (int var11 = 0; var11 < this.field4262; var11++) {
                this.field4261[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field4255; var12++) {
                this.field4261[this.field4266[var12]] = var3.method1533((byte) -126);
            }
            this.field4251 = new class693(this.field4261);
        }
        if (arg0 >= -83) {
            this.method2003((byte) 42, null);
        }
        for (int var13 = 0; var13 < this.field4255; var13++) {
            this.field4257[this.field4266[var13]] = var3.method1533((byte) -126);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field4255; var14++) {
                byte[] var15 = new byte[64];
                var3.method1537(Integer.MAX_VALUE, 0, 64, var15);
                this.field4258[this.field4266[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field4255; var16++) {
            this.field4250[this.field4266[var16]] = var3.method1533((byte) -126);
        }
        for (int var17 = 0; var17 < this.field4255; var17++) {
            this.field4253[this.field4266[var17]] = var3.method1478(842397944);
        }
        for (int var18 = 0; var18 < this.field4255; var18++) {
            int var25 = this.field4266[var18];
            int var26 = 0;
            int var27 = this.field4253[var25];
            int var28 = -1;
            this.field4249[var25] = new int[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = this.field4249[var25][var29] = var26 += var3.method1478(842397944);
                if (var30 > var28) {
                    var28 = var30;
                }
            }
            this.field4252[var25] = var28 + 1;
            if ((var28 + 1) == var27) {
                this.field4249[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field4263 = new int[var9 + 1][];
        this.field4256 = new class693[var9 + 1];
        for (int var19 = 0; var19 < this.field4255; var19++) {
            int var20 = this.field4266[var19];
            int var21 = this.field4253[var20];
            this.field4263[var20] = new int[this.field4252[var20]];
            for (int var22 = 0; var22 < this.field4252[var20]; var22++) {
                this.field4263[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field4249[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field4249[var20][var23];
                }
                this.field4263[var20][var24] = var3.method1533((byte) -126);
            }
            this.field4256[var20] = new class693(this.field4263[var20]);
        }
    }

    @OriginalMember(owner = "client!vw", name = "<init>", descriptor = "([BI[B)V")
    public class307(byte[] arg0, int arg1, byte[] arg2) {
        this.field4247 = class241.method1672(5126, arg0.length, arg0);
        if (this.field4247 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field4268 = class208.method1434(4567, 0, arg0, arg0.length);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field4268[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method2003((byte) -120, arg0);
    }
}
