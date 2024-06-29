import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class629 {

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public int field8446;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "[B")
    private byte[] field8451;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field8447 = 1337;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "Lmga;")
    public static class30 field8454 = new class30("WTQA", "office", "_qa", 2);

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field8443;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public int field8448;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public int field8450;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public static int field8458;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    public static int field8460;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
    public int field8461;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "Lnp;")
    public class756 field8444;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "[I")
    public int[] field8445;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "[I")
    public int[] field8452;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "[I")
    public int[] field8453;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "[I")
    public int[] field8455;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "[I")
    public int[] field8456;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "[I")
    public int[] field8457;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "[Lnp;")
    public class756[] field8442;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "[[B")
    public byte[][] field8459;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "[[I")
    public int[][] field8449;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "[[I")
    public int[][] field8462;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([BB)V")
    private final void method3536(byte[] arg0, byte arg1) {
        field8443++;
        class63 var3 = new class63(class26.method150(-1, arg0));
        int var4 = var3.method505((byte) -119);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field8450 = 0;
        } else {
            this.field8450 = var3.method457(-14532);
        }
        int var5 = var3.method505((byte) -119);
        boolean var6 = (var5 & 0x1) != 0;
        this.field8448 = var3.method482(-772591672);
        boolean var7 = (var5 & 0x2) != 0;
        int var8 = 0;
        this.field8455 = new int[this.field8448];
        int var9 = -1;
        if (arg1 != -115) {
            method3537(-104, -120, -37);
        }
        for (int var10 = 0; var10 < this.field8448; var10++) {
            this.field8455[var10] = var8 += var3.method482(-772591672);
            if (this.field8455[var10] > var9) {
                var9 = this.field8455[var10];
            }
        }
        this.field8461 = var9 + 1;
        this.field8456 = new int[this.field8461];
        this.field8457 = new int[this.field8461];
        if (var7) {
            this.field8459 = new byte[this.field8461][];
        }
        this.field8453 = new int[this.field8461];
        this.field8462 = new int[this.field8461][];
        this.field8445 = new int[this.field8461];
        if (var6) {
            this.field8452 = new int[this.field8461];
            for (int var11 = 0; var11 < this.field8461; var11++) {
                this.field8452[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field8448; var12++) {
                this.field8452[this.field8455[var12]] = var3.method457(-14532);
            }
            this.field8444 = new class756(this.field8452);
        }
        for (int var13 = 0; var13 < this.field8448; var13++) {
            this.field8456[this.field8455[var13]] = var3.method457(arg1 - 14417);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field8448; var14++) {
                byte[] var15 = new byte[64];
                var3.method449(0, 64, var15, (byte) -110);
                this.field8459[this.field8455[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field8448; var16++) {
            this.field8453[this.field8455[var16]] = var3.method457(arg1 - 14417);
        }
        for (int var17 = 0; var17 < this.field8448; var17++) {
            this.field8457[this.field8455[var17]] = var3.method482(-772591672);
        }
        for (int var18 = 0; var18 < this.field8448; var18++) {
            int var25 = this.field8455[var18];
            int var26 = 0;
            int var27 = this.field8457[var25];
            int var28 = -1;
            this.field8462[var25] = new int[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = this.field8462[var25][var29] = var26 += var3.method482(arg1 - 772591557);
                if (var28 < var30) {
                    var28 = var30;
                }
            }
            this.field8445[var25] = var28 + 1;
            if ((var28 + 1) == var27) {
                this.field8462[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field8449 = new int[var9 + 1][];
        this.field8442 = new class756[var9 + 1];
        for (int var19 = 0; var19 < this.field8448; var19++) {
            int var20 = this.field8455[var19];
            int var21 = this.field8457[var20];
            this.field8449[var20] = new int[this.field8445[var20]];
            for (int var22 = 0; var22 < this.field8445[var20]; var22++) {
                this.field8449[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field8462[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field8462[var20][var23];
                }
                this.field8449[var20][var24] = var3.method457(-14532);
            }
            this.field8442[var20] = new class756(this.field8449[var20]);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)Z")
    public static final boolean method3537(int arg0, int arg1, int arg2) {
        field8460++;
        if (arg1 != 64) {
            method3538(-10);
        }
        return class425.method2645(arg2, (byte) -33, arg0) || class35.method192(-101, arg2, arg0);
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "([BI[B)V")
    public class629(byte[] arg0, int arg1, byte[] arg2) {
        this.field8446 = class129.method807(true, arg0, arg0.length);
        if (this.field8446 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field8451 = class383.method2407((byte) -78, 0, arg0, arg0.length);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field8451[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method3536(arg0, (byte) -115);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static void method3538(int arg0) {
        if (arg0 == 0) {
            field8454 = null;
        }
    }
}
