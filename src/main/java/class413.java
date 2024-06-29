import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class413 {

    @OriginalMember(owner = "client!naa", name = "l", descriptor = "I")
    public int field5792;

    @OriginalMember(owner = "client!naa", name = "f", descriptor = "[B")
    private byte[] field5786;

    @OriginalMember(owner = "client!naa", name = "g", descriptor = "Lcb;")
    public static class318 field5787 = new class318(25, 3);

    @OriginalMember(owner = "client!naa", name = "t", descriptor = "Lcb;")
    public static class318 field5800 = new class318(78, 6);

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "I")
    public int field5782;

    @OriginalMember(owner = "client!naa", name = "j", descriptor = "I")
    public int field5790;

    @OriginalMember(owner = "client!naa", name = "k", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!naa", name = "q", descriptor = "I")
    public int field5797;

    @OriginalMember(owner = "client!naa", name = "r", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!naa", name = "s", descriptor = "Lcf;")
    public class65 field5799;

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "[I")
    public int[] field5783;

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "[I")
    public int[] field5784;

    @OriginalMember(owner = "client!naa", name = "e", descriptor = "[I")
    public int[] field5785;

    @OriginalMember(owner = "client!naa", name = "h", descriptor = "[I")
    public int[] field5788;

    @OriginalMember(owner = "client!naa", name = "o", descriptor = "[I")
    public int[] field5795;

    @OriginalMember(owner = "client!naa", name = "p", descriptor = "[I")
    public int[] field5796;

    @OriginalMember(owner = "client!naa", name = "u", descriptor = "[Lcf;")
    public class65[] field5801;

    @OriginalMember(owner = "client!naa", name = "i", descriptor = "[[B")
    public byte[][] field5789;

    @OriginalMember(owner = "client!naa", name = "m", descriptor = "[[I")
    public int[][] field5793;

    @OriginalMember(owner = "client!naa", name = "n", descriptor = "[[I")
    public int[][] field5794;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "([BI)V")
    private final void method2418(byte[] arg0, int arg1) {
        field5791++;
        class138 var3 = new class138(class541.method3048((byte) 72, arg0));
        int var4 = var3.method957((byte) -74);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field5797 = 0;
        } else {
            this.field5797 = var3.method943(-116);
        }
        int var5 = var3.method957((byte) -115);
        boolean var6 = (var5 & 0x1) != 0;
        this.field5782 = var3.method922((byte) -124);
        boolean var7 = (var5 & 0x2) != 0;
        int var8 = 0;
        this.field5784 = new int[this.field5782];
        int var9 = -1;
        if (arg1 <= 14) {
            return;
        }
        for (int var10 = 0; var10 < this.field5782; var10++) {
            this.field5784[var10] = var8 += var3.method922((byte) -116);
            if (this.field5784[var10] > var9) {
                var9 = this.field5784[var10];
            }
        }
        this.field5790 = var9 + 1;
        this.field5796 = new int[this.field5790];
        this.field5788 = new int[this.field5790];
        this.field5794 = new int[this.field5790][];
        if (var7) {
            this.field5789 = new byte[this.field5790][];
        }
        this.field5795 = new int[this.field5790];
        this.field5785 = new int[this.field5790];
        if (var6) {
            this.field5783 = new int[this.field5790];
            for (int var11 = 0; var11 < this.field5790; var11++) {
                this.field5783[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field5782; var12++) {
                this.field5783[this.field5784[var12]] = var3.method943(-117);
            }
            this.field5799 = new class65(this.field5783);
        }
        for (int var13 = 0; var13 < this.field5782; var13++) {
            this.field5795[this.field5784[var13]] = var3.method943(-119);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field5782; var14++) {
                byte[] var15 = new byte[64];
                var3.method934(8, 0, 64, var15);
                this.field5789[this.field5784[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field5782; var16++) {
            this.field5785[this.field5784[var16]] = var3.method943(-117);
        }
        for (int var17 = 0; var17 < this.field5782; var17++) {
            this.field5788[this.field5784[var17]] = var3.method922((byte) -116);
        }
        for (int var18 = 0; var18 < this.field5782; var18++) {
            int var25 = this.field5784[var18];
            int var26 = 0;
            int var27 = this.field5788[var25];
            this.field5794[var25] = new int[var27];
            int var28 = -1;
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = this.field5794[var25][var29] = var26 += var3.method922((byte) -114);
                if (var28 < var30) {
                    var28 = var30;
                }
            }
            this.field5796[var25] = var28 + 1;
            if ((var28 + 1) == var27) {
                this.field5794[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field5793 = new int[var9 + 1][];
        this.field5801 = new class65[var9 + 1];
        for (int var19 = 0; var19 < this.field5782; var19++) {
            int var20 = this.field5784[var19];
            int var21 = this.field5788[var20];
            this.field5793[var20] = new int[this.field5796[var20]];
            for (int var22 = 0; var22 < this.field5796[var20]; var22++) {
                this.field5793[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field5794[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field5794[var20][var23];
                }
                this.field5793[var20][var24] = var3.method943(-108);
            }
            this.field5801[var20] = new class65(this.field5793[var20]);
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(II)Ldf;")
    public static final class544 method2419(int arg0, int arg1) {
        if (arg0 >= -48) {
            field5800 = null;
        }
        field5781++;
        return new class544(arg1, false);
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(I)V")
    public static void method2420(int arg0) {
        if (arg0 == 0) {
            field5787 = null;
            field5800 = null;
        }
    }

    @OriginalMember(owner = "client!naa", name = "<init>", descriptor = "([BI[B)V")
    public class413(byte[] arg0, int arg1, byte[] arg2) {
        this.field5792 = class185.method1191(arg0, (byte) -99, arg0.length);
        if (this.field5792 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field5786 = class666.method3699((byte) 0, arg0.length, 0, arg0);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field5786[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method2418(arg0, 45);
    }
}
