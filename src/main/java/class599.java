import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class599 {

    @OriginalMember(owner = "client!it", name = "s", descriptor = "I")
    public int field8540;

    @OriginalMember(owner = "client!it", name = "k", descriptor = "[B")
    private byte[] field8532;

    @OriginalMember(owner = "client!it", name = "p", descriptor = "Lrl;")
    public static class672 field8537 = new class672(53, 8);

    @OriginalMember(owner = "client!it", name = "t", descriptor = "I")
    public static int field8541 = 0;

    @OriginalMember(owner = "client!it", name = "u", descriptor = "S")
    public static short field8542 = 256;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "I")
    public static int field8527;

    @OriginalMember(owner = "client!it", name = "h", descriptor = "I")
    public int field8529;

    @OriginalMember(owner = "client!it", name = "l", descriptor = "I")
    public int field8533;

    @OriginalMember(owner = "client!it", name = "o", descriptor = "I")
    public static int field8536;

    @OriginalMember(owner = "client!it", name = "q", descriptor = "I")
    public int field8538;

    @OriginalMember(owner = "client!it", name = "i", descriptor = "Lsq;")
    public class163 field8530;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "[I")
    public int[] field8522;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "[I")
    public int[] field8523;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "[I")
    public int[] field8524;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "[I")
    public int[] field8525;

    @OriginalMember(owner = "client!it", name = "m", descriptor = "[I")
    public int[] field8534;

    @OriginalMember(owner = "client!it", name = "r", descriptor = "[I")
    public int[] field8539;

    @OriginalMember(owner = "client!it", name = "g", descriptor = "[Lsq;")
    public class163[] field8528;

    @OriginalMember(owner = "client!it", name = "n", descriptor = "[[B")
    public byte[][] field8535;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "[[I")
    public int[][] field8526;

    @OriginalMember(owner = "client!it", name = "j", descriptor = "[[I")
    public int[][] field8531;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V")
    public static final void method3497(int arg0) {
        class252.field4036.method232(-27382);
        field8527++;
        class20.field332 = arg0;
        class386.field6000 = null;
        class474.field7018 = null;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V")
    public static void method3498(int arg0) {
        field8537 = null;
        if (arg0 != -16902) {
            field8537 = null;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I[B)V")
    private final void method3499(int arg0, byte[] arg1) {
        field8536++;
        class6 var3 = new class6(class186.method1504(arg1, true));
        int var4 = var3.method70(-9059);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field8533 = 0;
        } else {
            this.field8533 = var3.method72(-78);
        }
        int var5 = var3.method70(-9059);
        boolean var6 = (var5 & 0x1) != 0;
        boolean var7 = (var5 & 0x2) != 0;
        this.field8538 = var3.method67(12021);
        int var8 = 0;
        int var9 = -1;
        this.field8523 = new int[this.field8538];
        if (arg0 <= 14) {
            this.field8535 = null;
        }
        for (int var10 = 0; var10 < this.field8538; var10++) {
            this.field8523[var10] = var8 += var3.method67(12021);
            if (var9 < this.field8523[var10]) {
                var9 = this.field8523[var10];
            }
        }
        this.field8529 = var9 + 1;
        this.field8525 = new int[this.field8529];
        this.field8539 = new int[this.field8529];
        this.field8534 = new int[this.field8529];
        this.field8522 = new int[this.field8529];
        this.field8526 = new int[this.field8529][];
        if (var7) {
            this.field8535 = new byte[this.field8529][];
        }
        if (var6) {
            this.field8524 = new int[this.field8529];
            for (int var11 = 0; var11 < this.field8529; var11++) {
                this.field8524[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field8538; var12++) {
                this.field8524[this.field8523[var12]] = var3.method72(-98);
            }
            this.field8530 = new class163(this.field8524);
        }
        for (int var13 = 0; var13 < this.field8538; var13++) {
            this.field8525[this.field8523[var13]] = var3.method72(-70);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field8538; var14++) {
                byte[] var15 = new byte[64];
                var3.method50(var15, 0, 64, (byte) 19);
                this.field8535[this.field8523[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field8538; var16++) {
            this.field8539[this.field8523[var16]] = var3.method72(-19);
        }
        for (int var17 = 0; var17 < this.field8538; var17++) {
            this.field8522[this.field8523[var17]] = var3.method67(12021);
        }
        for (int var18 = 0; var18 < this.field8538; var18++) {
            int var25 = this.field8523[var18];
            int var26 = 0;
            int var27 = this.field8522[var25];
            int var28 = -1;
            this.field8526[var25] = new int[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = this.field8526[var25][var29] = var26 += var3.method67(12021);
                if (var28 < var30) {
                    var28 = var30;
                }
            }
            this.field8534[var25] = var28 + 1;
            if (var28 + 1 == var27) {
                this.field8526[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field8528 = new class163[var9 + 1];
        this.field8531 = new int[var9 + 1][];
        for (int var19 = 0; var19 < this.field8538; var19++) {
            int var20 = this.field8523[var19];
            int var21 = this.field8522[var20];
            this.field8531[var20] = new int[this.field8534[var20]];
            for (int var22 = 0; var22 < this.field8534[var20]; var22++) {
                this.field8531[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field8526[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field8526[var20][var23];
                }
                this.field8531[var20][var24] = var3.method72(-53);
            }
            this.field8528[var20] = new class163(this.field8531[var20]);
        }
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "([BI[B)V")
    public class599(byte[] arg0, int arg1, byte[] arg2) {
        this.field8540 = class530.method3208(false, arg0.length, arg0);
        if (this.field8540 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field8532 = class275.method1931(arg0, arg0.length, 0, 29654);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field8532[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method3499(95, arg0);
    }
}
