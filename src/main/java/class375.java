import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class375 {

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
    public int field4734;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "[B")
    private byte[] field4729;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "Lsfa;")
    public static class291 field4728 = new class291();

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    public int field4724;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    public int field4725;

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "I")
    public int field4736;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "Lid;")
    public class242 field4730;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "[I")
    public int[] field4721;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "[I")
    public int[] field4722;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "[I")
    public int[] field4726;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "[I")
    public int[] field4733;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "[I")
    public int[] field4735;

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "[I")
    public int[] field4737;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "[Lid;")
    public class242[] field4731;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "[[B")
    public byte[][] field4732;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "[[I")
    public int[][] field4723;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "[[I")
    public int[][] field4727;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I[B)V")
    private final void method2039(int arg0, byte[] arg1) {
        field4720++;
        class630 var3 = new class630(class568.method3132(0, arg1));
        int var4 = var3.method3501(-9268);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field4724 = var3.method3483(arg0 + 58);
        } else {
            this.field4724 = 0;
        }
        int var5 = var3.method3501(-9268);
        boolean var6 = (var5 & 0x1) != 0;
        boolean var7 = (var5 & 0x2) != 0;
        this.field4736 = var3.method3470(13111);
        int var8 = 0;
        this.field4726 = new int[this.field4736];
        int var9 = -1;
        for (int var10 = 0; var10 < this.field4736; var10++) {
            this.field4726[var10] = var8 += var3.method3470(13111);
            if (this.field4726[var10] > var9) {
                var9 = this.field4726[var10];
            }
        }
        this.field4725 = var9 + 1;
        this.field4723 = new int[this.field4725][];
        this.field4737 = new int[this.field4725];
        this.field4735 = new int[this.field4725];
        this.field4721 = new int[this.field4725];
        this.field4722 = new int[this.field4725];
        if (var7) {
            this.field4732 = new byte[this.field4725][];
        }
        if (var6) {
            this.field4733 = new int[this.field4725];
            for (int var11 = 0; var11 < this.field4725; var11++) {
                this.field4733[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field4736; var12++) {
                this.field4733[this.field4726[var12]] = var3.method3483(118);
            }
            this.field4730 = new class242(this.field4733);
        }
        for (int var13 = arg0; var13 < this.field4736; var13++) {
            this.field4735[this.field4726[var13]] = var3.method3483(68);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field4736; var14++) {
                byte[] var15 = new byte[64];
                var3.method3522(var15, true, 64, 0);
                this.field4732[this.field4726[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field4736; var16++) {
            this.field4721[this.field4726[var16]] = var3.method3483(64);
        }
        for (int var17 = 0; var17 < this.field4736; var17++) {
            this.field4737[this.field4726[var17]] = var3.method3470(13111);
        }
        for (int var18 = 0; var18 < this.field4736; var18++) {
            int var25 = this.field4726[var18];
            int var26 = this.field4737[var25];
            int var27 = 0;
            int var28 = -1;
            this.field4723[var25] = new int[var26];
            for (int var29 = 0; var29 < var26; var29++) {
                int var30 = this.field4723[var25][var29] = var27 += var3.method3470(13111);
                if (var28 < var30) {
                    var28 = var30;
                }
            }
            this.field4722[var25] = var28 + 1;
            if ((var28 + 1) == var26) {
                this.field4723[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field4731 = new class242[var9 + 1];
        this.field4727 = new int[var9 + 1][];
        for (int var19 = 0; var19 < this.field4736; var19++) {
            int var20 = this.field4726[var19];
            int var21 = this.field4737[var20];
            this.field4727[var20] = new int[this.field4722[var20]];
            for (int var22 = 0; var22 < this.field4722[var20]; var22++) {
                this.field4727[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field4723[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field4723[var20][var23];
                }
                this.field4727[var20][var24] = var3.method3483(57);
            }
            this.field4731[var20] = new class242(this.field4727[var20]);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
    public static void method2040(int arg0) {
        field4728 = null;
        if (arg0 != -27718) {
            method2040(-109);
        }
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "([BI[B)V")
    public class375(byte[] arg0, int arg1, byte[] arg2) {
        this.field4734 = class528.method2871(arg0, (byte) -95, arg0.length);
        if (this.field4734 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field4729 = class357.method1969(arg0.length, arg0, 127, 0);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field4729[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method2039(0, arg0);
    }
}
