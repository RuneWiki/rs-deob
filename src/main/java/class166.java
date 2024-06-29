import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class166 extends class89 {

    @OriginalMember(owner = "client!ob", name = "Y", descriptor = "Lha;")
    public static class46 field2934 = class271.method1828("Spielwelt erstellt)3", -46);

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "Lha;")
    public static class46 field2929 = class271.method1828("http:)4)4", -46);

    @OriginalMember(owner = "client!ob", name = "bb", descriptor = "[J")
    public static long[] field2937 = new long[100];

    @OriginalMember(owner = "client!ob", name = "db", descriptor = "Lha;")
    public static class46 field2939 = class271.method1828("RuneScape wird geladen )2 bitte warten)3)3)3", -46);

    @OriginalMember(owner = "client!ob", name = "ab", descriptor = "[[B")
    public static byte[][] field2936 = new byte[1000][];

    @OriginalMember(owner = "client!ob", name = "R", descriptor = "Lha;")
    private static class46 field2927 = class271.method1828("Please wait)3)3)3", -46);

    @OriginalMember(owner = "client!ob", name = "S", descriptor = "Lha;")
    public static class46 field2928 = field2927;

    @OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!ob", name = "V", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!ob", name = "W", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!ob", name = "X", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!ob", name = "Z", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!ob", name = "cb", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!ob", name = "eb", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(BI)Lnf;")
    public static final class13 method1184(byte arg0, int arg1) {
        if (arg0 != -39) {
            field2936 = null;
        }
        ++field2931;
        class13 var2 = (class13) class7.field113.method1364((long) arg1, arg0 + -21948);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class261.field4545.method1293(arg1, 5, (byte) 39);
            class13 var4 = new class13();
            if (var3 != null) {
                var4.method72(new class75(var3), 0);
            }
            class7.field113.method1366(true, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        ++field2930;
        int[][] var3 = super.field1695.method843((byte) -25, arg0);
        if (arg1 != 25) {
            field2936 = null;
        }
        if (super.field1695.field2028) {
            int[] var4 = this.method685(-80, arg0, 2);
            int[][] var5 = this.method689((byte) 95, 0, arg0);
            int[][] var6 = this.method689((byte) 95, 1, arg0);
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var5[1];
            int[] var11 = var5[2];
            int[] var12 = var6[0];
            int[] var13 = var5[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; class241.field4284 > var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var7[var16] = var13[var16];
                    var9[var16] = var10[var16];
                    var8[var16] = var11[var16];
                } else if (var17 == 0) {
                    var7[var16] = var12[var16];
                    var9[var16] = var14[var16];
                    var8[var16] = var15[var16];
                } else {
                    int var18 = -var17 + 4096;
                    var7[var16] = var12[var16] * var18 + var13[var16] * var17 >> 12;
                    var9[var16] = var10[var16] * var17 + var14[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)I")
    public static final int method1185(int arg0, int arg1) {
        if (arg0 >= -49) {
            field2936 = null;
        }
        ++field2933;
        if (arg1 < 0) {
            return 0;
        } else {
            class80 var2 = (class80) class126.field2308.method1601(85, (long) arg1);
            if (var2 == null) {
                return method1184((byte) -39, arg1).field203;
            } else {
                int var3 = 0;
                for (int var4 = 0; var4 < var2.field1522.length; ++var4) {
                    if (var2.field1522[var4] == -1) {
                        ++var3;
                    }
                }
                return var3 + (method1184((byte) -39, arg1).field203 - var2.field1522.length);
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        if (arg1 != -641641492) {
            method1185(-14, 46);
        }
        if (~arg2 == -1) {
            super.field1683 = ~arg0.method558(1) == -2;
        }
        ++field2932;
    }

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(B)V")
    public static final void method1186(byte arg0) {
        ++field2935;
        client.method1812((byte) 55);
        if (arg0 < 16) {
            method1184((byte) -43, 33);
        }
        System.gc();
        class83.method661(25, 0);
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
    public class166() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(IB)[I")
    public final int[] method12(int arg0, byte arg1) {
        ++field2940;
        int var3 = 34 / ((51 - arg1) / 44);
        int[] var4 = super.field1688.method936(1, arg0);
        if (super.field1688.field2200) {
            int[] var5 = this.method685(61, arg0, 0);
            int[] var6 = this.method685(-114, arg0, 1);
            int[] var7 = this.method685(-87, arg0, 2);
            for (int var8 = 0; class241.field4284 > var8; ++var8) {
                int var9 = var7[var8];
                if (~var9 == -4097) {
                    var4[var8] = var5[var8];
                } else if (var9 != 0) {
                    var4[var8] = (-var9 + 4096) * var6[var8] + var5[var8] * var9 >> 12;
                } else {
                    var4[var8] = var6[var8];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V")
    public static void method1187(int arg0) {
        field2928 = null;
        field2939 = null;
        if (arg0 == 24357) {
            field2936 = null;
            field2927 = null;
            field2934 = null;
            field2929 = null;
            field2937 = null;
        }
    }
}
