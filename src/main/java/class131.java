import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class131 {

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    private int field1935;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    private int field1939;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "[[I")
    private int[][] field1930;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1941 = "Loading world list data";

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field1942 = 0;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "Lgf;")
    public static class119 field1940;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "Lug;")
    public static class253 field1944;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I[B)[B", line = 5)
    public final byte[] method966(int arg0, byte[] arg1) {
        int var3 = -78 % ((-arg0 - 20) / 44);
        if (this.field1930 != null) {
            int var4 = (int) ((long) arg1.length * (long) this.field1935 / (long) this.field1939) + 14;
            int var5 = 0;
            int[] var6 = new int[var4];
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.length; var8++) {
                byte var9 = arg1[var8];
                int[] var10 = this.field1930[var7];
                for (int var11 = 0; var11 < 14; var11++) {
                    var6[var5 + var11] += var10[var11] * var9;
                }
                int var12 = this.field1935 + var7;
                int var13 = var12 / this.field1939;
                var5 += var13;
                var7 = var12 - this.field1939 * var13;
            }
            arg1 = new byte[var4];
            for (int var14 = 0; var14 < var4; var14++) {
                int var15 = var6[var14] + 32768 >> 16;
                if (var15 < -128) {
                    arg1[var14] = -128;
                } else if (var15 > 127) {
                    arg1[var14] = 127;
                } else {
                    arg1[var14] = (byte) var15;
                }
            }
        }
        field1934++;
        return arg1;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V", line = 72)
    public static final void method967(int arg0) {
        class66.field948++;
        field1937++;
        if (arg0 != 17256) {
            return;
        }
        class183.field2965.method1947((byte) 50, 27);
        class183.field2965.method81((byte) -123, class113.method800((byte) -26));
        class183.field2965.method65((byte) -9, class127.field1841);
        class183.field2965.method65((byte) -9, class95.field1258);
        class183.field2965.method81((byte) -126, class196.field3127);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)I", line = 95)
    public final int method968(int arg0, byte arg1) {
        if (this.field1930 != null) {
            arg0 = (int) ((long) this.field1935 * (long) arg0 / (long) this.field1939);
        }
        field1931++;
        if (arg1 != -128) {
            field1944 = (class253) null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V", line = 111)
    public static void method969(byte arg0) {
        field1941 = null;
        field1944 = null;
        field1940 = null;
        if (arg0 > -26) {
            method970(-82, false);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZ)V", line = 125)
    public static final void method970(int arg0, boolean arg1) {
        class136.field2174 = (class294) class283.field4383.method2168((long) arg0, (byte) -103);
        if (arg1) {
            field1936++;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;)V", line = 143)
    public static final void method971(String arg0, byte arg1, int arg2, String arg3) {
        if (arg1 == -32) {
            field1933++;
            class214.method1563(arg2, (String) null, (byte) -37, arg3, arg0, -1);
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(II)V", line = 153)
    public class131(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class333.method2317(arg1, arg0, 127);
            int var4 = arg1 / var3;
            this.field1935 = var4;
            int var5 = arg0 / var3;
            this.field1939 = var5;
            this.field1930 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field1930[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                double var10 = (double) var4 / (double) var5;
                int var12 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                if (var12 < 0) {
                    var12 = 0;
                }
                while (var13 > var12) {
                    double var14 = ((double) var12 - var8) * 3.141592653589793D;
                    double var16 = var10;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var10 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI)I", line = 219)
    public final int method972(byte arg0, int arg1) {
        if (arg0 < 76) {
            this.field1939 = -34;
        }
        if (this.field1930 != null) {
            arg1 = (int) ((long) this.field1935 * (long) arg1 / (long) this.field1939) + 6;
        }
        field1943++;
        return arg1;
    }
}
