import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class538 {

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public int field7569;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "[B")
    private byte[] field7577;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "Lht;")
    public static class607 field7571 = new class607("", 10);

    @OriginalMember(owner = "client!of", name = "u", descriptor = "Lbs;")
    public static class215 field7582 = new class215();

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public int field7564;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field7565;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public int field7567;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    public static int field7579;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "I")
    public static int field7583;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "I")
    public int field7584;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "Lvd;")
    public class355 field7563;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "[I")
    public int[] field7568;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "[I")
    public int[] field7570;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "[I")
    public int[] field7573;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "[I")
    public int[] field7576;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "[I")
    public int[] field7578;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "[I")
    public int[] field7581;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "[Lvd;")
    public class355[] field7580;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "[[B")
    public byte[][] field7574;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "[[I")
    public int[][] field7566;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "[[I")
    public int[][] field7575;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/lang/String;ZIII)V")
    public static final void method3032(String arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field7565++;
        if (arg2 != 256) {
            method3033(91, 86, (byte) 81, 107L, -87, 86, null, -47, null);
        }
        class357.method2103(-17689, arg3, false, arg4, arg1, arg0, null);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIBJIILua;ILwp;)V")
    public static final void method3033(int arg0, int arg1, byte arg2, long arg3, int arg4, int arg5, class598 arg6, int arg7, class452 arg8) {
        field7579++;
        if (arg2 < 17) {
            field7583 = -61;
        }
        int var10 = arg1 * arg1 + arg5 * arg5;
        if (arg3 < ((long) var10)) {
            return;
        }
        int var11 = Math.min(arg8.field6483 / 2, arg8.field6443 / 2);
        if (var10 <= (var11 * var11)) {
            class517.method2941(arg1, class130.field1465[arg0], arg6, arg4, arg8, 127, arg5, arg7);
            return;
        }
        var11 -= 10;
        int var12;
        if (field7572 == 4) {
            var12 = (int) class508.field7300 & 0x3FFF;
        } else {
            var12 = (int) class508.field7300 + class302.field3748 & 0x3FFF;
        }
        int var13 = class435.field6134[var12];
        int var14 = class435.field6135[var12];
        if (field7572 != 4) {
            var14 = var14 * 256 / (class373.field5085 + 256);
            var13 = var13 * 256 / (class373.field5085 + 256);
        }
        int var15 = arg1 * var13 + arg5 * var14 >> 14;
        int var16 = arg1 * var14 - (arg5 * var13) >> 14;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) (Math.sin(var17) * (double) var11);
        int var20 = (int) (Math.cos(var17) * (double) var11);
        class166.field1870[arg0].method2999((float) arg8.field6483 / 2.0F + (float) arg4 + (float) var19, (float) arg8.field6443 / 2.0F + (float) arg7 - (float) var20, 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I[B)V")
    private final void method3034(int arg0, byte[] arg1) {
        field7562++;
        class115 var3 = new class115(class178.method1086((byte) -110, arg1));
        int var4 = var3.method620((byte) -127);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field7567 = var3.method631(false);
        } else {
            this.field7567 = 0;
        }
        int var5 = var3.method620((byte) 102);
        boolean var6 = (var5 & 0x1) != 0;
        this.field7564 = var3.method643((byte) -77);
        boolean var7 = (var5 & 0x2) != 0;
        int var8 = 0;
        this.field7581 = new int[this.field7564];
        int var9 = -1;
        for (int var10 = 0; var10 < this.field7564; var10++) {
            this.field7581[var10] = var8 += var3.method643((byte) -77);
            if (var9 < this.field7581[var10]) {
                var9 = this.field7581[var10];
            }
        }
        this.field7584 = var9 + 1;
        this.field7578 = new int[this.field7584];
        this.field7576 = new int[this.field7584];
        this.field7573 = new int[this.field7584];
        this.field7566 = new int[this.field7584][];
        this.field7570 = new int[this.field7584];
        if (var7) {
            this.field7574 = new byte[this.field7584][];
        }
        if (var6) {
            this.field7568 = new int[this.field7584];
            for (int var11 = 0; var11 < this.field7584; var11++) {
                this.field7568[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field7564; var12++) {
                this.field7568[this.field7581[var12]] = var3.method631(false);
            }
            this.field7563 = new class355(this.field7568);
        }
        if (arg0 != 8130) {
            this.method3034(115, null);
        }
        for (int var13 = 0; var13 < this.field7564; var13++) {
            this.field7573[this.field7581[var13]] = var3.method631(false);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field7564; var14++) {
                byte[] var15 = new byte[64];
                var3.method628(0, 64, var15, (byte) -105);
                this.field7574[this.field7581[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field7564; var16++) {
            this.field7578[this.field7581[var16]] = var3.method631(false);
        }
        for (int var17 = 0; var17 < this.field7564; var17++) {
            this.field7570[this.field7581[var17]] = var3.method643((byte) -77);
        }
        for (int var18 = 0; var18 < this.field7564; var18++) {
            int var25 = this.field7581[var18];
            int var26 = 0;
            int var27 = this.field7570[var25];
            int var28 = -1;
            this.field7566[var25] = new int[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = this.field7566[var25][var29] = var26 += var3.method643((byte) -77);
                if (var28 < var30) {
                    var28 = var30;
                }
            }
            this.field7576[var25] = var28 + 1;
            if (var28 + 1 == var27) {
                this.field7566[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field7575 = new int[var9 + 1][];
        this.field7580 = new class355[var9 + 1];
        for (int var19 = 0; var19 < this.field7564; var19++) {
            int var20 = this.field7581[var19];
            int var21 = this.field7570[var20];
            this.field7575[var20] = new int[this.field7576[var20]];
            for (int var22 = 0; var22 < this.field7576[var20]; var22++) {
                this.field7575[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field7566[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field7566[var20][var23];
                }
                this.field7575[var20][var24] = var3.method631(false);
            }
            this.field7580[var20] = new class355(this.field7575[var20]);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public static void method3035(byte arg0) {
        if (arg0 != 114) {
            method3035((byte) -64);
        }
        field7582 = null;
        field7571 = null;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "([BI[B)V")
    public class538(byte[] arg0, int arg1, byte[] arg2) {
        this.field7569 = class130.method737(arg0.length, (byte) 100, arg0);
        if (this.field7569 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field7577 = class97.method533((byte) -54, arg0, arg0.length, 0);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field7577[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method3034(8130, arg0);
    }
}
