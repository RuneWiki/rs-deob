import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class494 {

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field7163;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "Lmv;")
    private class688 field7161;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Lql;")
    private class165 field7154;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field7155;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "Lnu;")
    private class356 field7160;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "[I")
    public static int[] field7159 = new int[256];

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "Lsb;")
    public static class305 field7149 = new class305(38, 0);

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "Lcq;")
    public static class110 field7164 = new class110(66, 6);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field7148;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field7151;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field7153;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field7156;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field7158;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "J")
    public static long field7152;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "Lnp;")
    private class115 field7157;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "Lbp;")
    public static class88 field7165;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "[I")
    public static int[] field7162;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "[Lbd;")
    private class191[] field7150;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lat;BLat;IZ)Lbd;", line = 3)
    private final class191 method2857(class585 arg0, byte arg1, class585 arg2, int arg3, boolean arg4) {
        field7153++;
        if (this.field7157 == null) {
            throw new RuntimeException();
        } else if (arg3 < 0 || arg3 >= this.field7150.length) {
            throw new RuntimeException();
        } else if (this.field7150[arg3] == null) {
            this.field7157.field1218 = arg3 * 72 + 6;
            int var6 = this.field7157.method631(false);
            int var7 = this.field7157.method631(false);
            if (arg1 != 75) {
                method2862(-124);
            }
            byte[] var8 = new byte[64];
            this.field7157.method628(0, 64, var8, (byte) -105);
            class191 var9 = new class191(arg3, arg0, arg2, this.field7154, this.field7161, var6, var8, var7, arg4);
            this.field7150[arg3] = var9;
            return var9;
        } else {
            return this.field7150[arg3];
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BII)Z", line = 46)
    public static final boolean method2858(byte arg0, int arg1, int arg2) {
        if (arg0 <= 21) {
            field7162 = null;
        }
        field7158++;
        return (arg2 & 0x800) != 0 && (arg1 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BILat;Lat;)Lbd;", line = 69)
    public final class191 method2859(byte arg0, int arg1, class585 arg2, class585 arg3) {
        field7156++;
        if (arg0 >= -31) {
            field7165 = null;
        }
        return this.method2857(arg3, (byte) 75, arg2, arg1, true);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)Z", line = 86)
    public final boolean method2860(boolean arg0) {
        field7151++;
        if (this.field7157 != null) {
            return true;
        }
        if (this.field7160 == null) {
            if (this.field7154.method906(-21)) {
                return false;
            }
            this.field7160 = this.field7154.method903(21423, (byte) 0, 255, true, 255);
        }
        if (this.field7160.field2767) {
            return false;
        }
        class115 var2 = new class115(this.field7160.method1349(-111));
        var2.field1218 = 5;
        int var3 = var2.method620((byte) 38);
        var2.field1218 += var3 * 72;
        byte[] var4 = new byte[var2.field1269.length - var2.field1218];
        var2.method628(0, var4.length, var4, (byte) -105);
        byte[] var7;
        if (this.field7163 == null || this.field7155 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field7163, this.field7155);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class97.method533((byte) -88, var2.field1269, var2.field1218 - var4.length - 5, 5);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field7150 = new class191[var3];
        this.field7157 = var2;
        if (!arg0) {
            this.field7157 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 162)
    public final void method2861(int arg0) {
        field7148++;
        if (this.field7150 == null) {
            return;
        }
        for (int var2 = arg0; var2 < this.field7150.length; var2++) {
            if (this.field7150[var2] != null) {
                this.field7150[var2].method1165(false);
            }
        }
        for (int var3 = 0; var3 < this.field7150.length; var3++) {
            if (this.field7150[var3] != null) {
                this.field7150[var3].method1164(arg0 ^ 0x4A);
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lql;Lmv;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", line = 203)
    public class494(class165 arg0, class688 arg1, BigInteger arg2, BigInteger arg3) {
        this.field7163 = arg2;
        this.field7161 = arg1;
        this.field7154 = arg0;
        this.field7155 = arg3;
        if (!this.field7154.method906(-21)) {
            this.field7160 = this.field7154.method903(21423, (byte) 0, 255, true, 255);
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V", line = 218)
    public static void method2862(int arg0) {
        field7162 = null;
        field7159 = null;
        field7149 = null;
        if (arg0 < 81) {
            field7164 = null;
        }
        field7165 = null;
        field7164 = null;
    }
}
