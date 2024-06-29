import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public class class153 {

    @OriginalMember(owner = "client!sia", name = "n", descriptor = "I")
    public int field2109;

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "[B")
    private byte[] field2096;

    @OriginalMember(owner = "client!sia", name = "p", descriptor = "Lqk;")
    public static class148 field2111 = new class148(20, -1);

    @OriginalMember(owner = "client!sia", name = "c", descriptor = "I")
    public int field2098;

    @OriginalMember(owner = "client!sia", name = "d", descriptor = "I")
    public int field2099;

    @OriginalMember(owner = "client!sia", name = "e", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!sia", name = "f", descriptor = "I")
    public int field2101;

    @OriginalMember(owner = "client!sia", name = "q", descriptor = "Lqt;")
    public class502 field2112;

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "[I")
    public int[] field2097;

    @OriginalMember(owner = "client!sia", name = "g", descriptor = "[I")
    public int[] field2102;

    @OriginalMember(owner = "client!sia", name = "i", descriptor = "[I")
    public int[] field2104;

    @OriginalMember(owner = "client!sia", name = "j", descriptor = "[I")
    public int[] field2105;

    @OriginalMember(owner = "client!sia", name = "m", descriptor = "[I")
    public int[] field2108;

    @OriginalMember(owner = "client!sia", name = "r", descriptor = "[I")
    public int[] field2113;

    @OriginalMember(owner = "client!sia", name = "k", descriptor = "[Lqt;")
    public class502[] field2106;

    @OriginalMember(owner = "client!sia", name = "l", descriptor = "[[B")
    public byte[][] field2107;

    @OriginalMember(owner = "client!sia", name = "h", descriptor = "[[I")
    public int[][] field2103;

    @OriginalMember(owner = "client!sia", name = "o", descriptor = "[[I")
    public int[][] field2110;

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(I[B)V")
    private final void method974(int arg0, byte[] arg1) {
        field2100++;
        class26 var3 = new class26(class165.method1023(arg1, (byte) 89));
        int var4 = var3.method194((byte) 119);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field2101 = var3.method189(255);
        } else {
            this.field2101 = 0;
        }
        int var5 = var3.method194((byte) 119);
        boolean var6 = (var5 & 0x1) != 0;
        boolean var7 = (var5 & 0x2) != 0;
        this.field2098 = var3.method193(2);
        int var8 = 0;
        int var9 = -1;
        this.field2097 = new int[this.field2098];
        for (int var10 = 0; var10 < this.field2098; var10++) {
            this.field2097[var10] = var8 += var3.method193(class450.method2703(arg0, 879));
            if (this.field2097[var10] > var9) {
                var9 = this.field2097[var10];
            }
        }
        this.field2099 = var9 + 1;
        this.field2108 = new int[this.field2099];
        this.field2105 = new int[this.field2099];
        this.field2104 = new int[this.field2099];
        if (var7) {
            this.field2107 = new byte[this.field2099][];
        }
        this.field2103 = new int[this.field2099][];
        this.field2113 = new int[this.field2099];
        if (var6) {
            this.field2102 = new int[this.field2099];
            for (int var11 = 0; var11 < this.field2099; var11++) {
                this.field2102[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field2098; var12++) {
                this.field2102[this.field2097[var12]] = var3.method189(255);
            }
            this.field2112 = new class502(this.field2102);
        }
        for (int var13 = 0; var13 < this.field2098; var13++) {
            this.field2113[this.field2097[var13]] = var3.method189(class450.method2703(arg0, 914));
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field2098; var14++) {
                byte[] var15 = new byte[64];
                var3.method149(var15, 0, (byte) -63, 64);
                this.field2107[this.field2097[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field2098; var16++) {
            this.field2105[this.field2097[var16]] = var3.method189(255);
        }
        if (arg0 != 877) {
            this.field2105 = null;
        }
        for (int var17 = 0; var17 < this.field2098; var17++) {
            this.field2108[this.field2097[var17]] = var3.method193(class450.method2703(arg0, 879));
        }
        for (int var18 = 0; var18 < this.field2098; var18++) {
            int var25 = this.field2097[var18];
            int var26 = 0;
            int var27 = this.field2108[var25];
            int var28 = -1;
            this.field2103[var25] = new int[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = this.field2103[var25][var29] = var26 += var3.method193(2);
                if (var28 < var30) {
                    var28 = var30;
                }
            }
            this.field2104[var25] = var28 + 1;
            if ((var28 + 1) == var27) {
                this.field2103[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field2106 = new class502[var9 + 1];
        this.field2110 = new int[var9 + 1][];
        for (int var19 = 0; var19 < this.field2098; var19++) {
            int var20 = this.field2097[var19];
            int var21 = this.field2108[var20];
            this.field2110[var20] = new int[this.field2104[var20]];
            for (int var22 = 0; var22 < this.field2104[var20]; var22++) {
                this.field2110[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field2103[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field2103[var20][var23];
                }
                this.field2110[var20][var24] = var3.method189(255);
            }
            this.field2106[var20] = new class502(this.field2110[var20]);
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(I)V")
    public static void method975(int arg0) {
        if (arg0 >= -107) {
            field2111 = null;
        }
        field2111 = null;
    }

    @OriginalMember(owner = "client!sia", name = "<init>", descriptor = "([BI[B)V")
    public class153(byte[] arg0, int arg1, byte[] arg2) {
        this.field2109 = class627.method3662(arg0, -57, arg0.length);
        if (this.field2109 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field2096 = class175.method1103(arg0.length, 0, (byte) 91, arg0);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field2096[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method974(877, arg0);
    }
}
