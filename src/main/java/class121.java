import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class121 extends class21 {

    @OriginalMember(owner = "client!kk", name = "U", descriptor = "I")
    private int field2098 = 3072;

    @OriginalMember(owner = "client!kk", name = "T", descriptor = "I")
    private int field2097 = 2048;

    @OriginalMember(owner = "client!kk", name = "Y", descriptor = "I")
    private int field2102 = 1024;

    @OriginalMember(owner = "client!kk", name = "P", descriptor = "Z")
    public static boolean field2093 = false;

    @OriginalMember(owner = "client!kk", name = "V", descriptor = "J")
    public static long field2099 = 0L;

    @OriginalMember(owner = "client!kk", name = "X", descriptor = "[S")
    public static short[] field2101 = new short[256];

    @OriginalMember(owner = "client!kk", name = "N", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!kk", name = "O", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!kk", name = "Q", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!kk", name = "R", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!kk", name = "S", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!kk", name = "W", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!kk", name = "Z", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!kk", name = "ab", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "(B)V", line = 7)
    public static final void method782(byte arg0) {
        while (true) {
            if (class190.field3082.method78(arg0 - 22791, class250.field3926) >= 27) {
                int var1 = class190.field3082.method81(7, 15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class8.field179[var1] == null) {
                        class8.field179[var1] = new class255();
                        var2 = true;
                    }
                    class255 var3 = class8.field179[var1];
                    class131.field2226[class285.field4417++] = var1;
                    var3.field1855 = class25.field494;
                    if (var3.field3991 != null && var3.field3991.method334(false)) {
                        class134.method877(var3, arg0 ^ 0xFFFFE831);
                    }
                    int var4 = class190.field3082.method81(arg0 + 103, 5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    var3.method1713((byte) -77, class19.method130(class190.field3082.method81(7, 14), -5881));
                    int var5 = class190.field3082.method81(7, 1);
                    if (var5 == 1) {
                        class130.field2206[class248.field3865++] = var1;
                    }
                    int var6 = class190.field3082.method81(7, 1);
                    int var7 = class154.field2515[class190.field3082.method81(arg0 + 103, 3)];
                    if (var2) {
                        var3.field1886 = var3.field1927 = var7;
                    }
                    int var8 = class190.field3082.method81(7, 5);
                    var3.method697(var3.field3991.field882, -2424);
                    var3.field1859 = var3.field3991.field839;
                    if (var3.field1859 == 0) {
                        var3.field1927 = 0;
                    }
                    var3.field1902 = var3.field3991.field889;
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.method706(class66.field1265.field1899[0] + var4, var3.method710(-1), 0, var6 == 1, class66.field1265.field1871[0] + var8);
                    if (var3.field3991.method334(false)) {
                        class142.method921(var3.field1871[0], (class31) null, var3, var3.field1899[0], (class278) null, 0, false, class289.field4438);
                    }
                    continue;
                }
            }
            if (arg0 != -96) {
                return;
            }
            field2094++;
            class190.field3082.method84(arg0 - 19);
            return;
        }
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)V", line = 87)
    public static void method783(int arg0) {
        int var1 = 83 % ((arg0 - 6) / 63);
        field2101 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IILag;)V", line = 103)
    public final void method178(int arg0, int arg1, class202 arg2) {
        if (arg0 != -318) {
            this.field2098 = -39;
        }
        if (arg1 == 0) {
            this.field2102 = arg2.method1315(arg0 ^ 0xFFFFC913);
        } else if (arg1 == 1) {
            this.field2098 = arg2.method1315(14289);
        } else if (arg1 == 2) {
            this.field444 = arg2.method1317((byte) -99) == 1;
        }
        field2103++;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)Lub;", line = 145)
    public static final class74 method784(int arg0, int arg1) {
        field2100++;
        class74 var2 = (class74) class80.field1569.method2367((long) arg1, -12270);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class326.field4989.method2036(arg0, arg1, (byte) 90);
        class74 var4 = new class74();
        if (var3 != null) {
            var4.method560(arg0 ^ 0xB, new class202(var3));
        }
        class80.field1569.method2369((long) arg1, -28759, var4);
        return var4;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)[I", line = 168)
    public final int[] method177(int arg0, int arg1) {
        field2091++;
        int[] var3 = this.field443.method1040(arg1, false);
        int var4 = 110 / ((33 - arg0) / 36);
        if (this.field443.field2637) {
            int[] var5 = this.method171(0, -123, arg1);
            for (int var6 = 0; var6 < class294.field4489; var6++) {
                var3[var6] = (var5[var6] * this.field2097 >> 12) + this.field2102;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(IB)[[I", line = 207)
    public final int[][] method175(int arg0, byte arg1) {
        int[][] var3 = this.field441.method220(arg0, 17433);
        field2095++;
        if (this.field441.field532) {
            int[][] var4 = this.method173(0, arg0, (byte) 117);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class294.field4489; var11++) {
                var10[var11] = (var5[var11] * this.field2097 >> 12) + this.field2102;
                var9[var11] = this.field2102 + (var7[var11] * this.field2097 >> 12);
                var8[var11] = (var6[var11] * this.field2097 >> 12) + this.field2102;
            }
        }
        if (arg1 <= 16) {
            method783(-64);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V", line = 248)
    public class121() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(B)V", line = 259)
    public final void method183(byte arg0) {
        field2104++;
        if (arg0 > 82) {
            this.field2097 = this.field2098 - this.field2102;
        }
    }

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "(B)V", line = 283)
    public static final void method785(byte arg0) {
        class147.field2415.method1884(-22054);
        field2096++;
        if (arg0 <= 89) {
            method782((byte) 53);
        }
    }
}
