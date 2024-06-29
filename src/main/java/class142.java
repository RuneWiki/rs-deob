import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class142 extends class317 {

    @OriginalMember(owner = "client!fg", name = "J", descriptor = "[I")
    private int[] field1937 = new int[3];

    @OriginalMember(owner = "client!fg", name = "Q", descriptor = "I")
    private int field1943 = 3216;

    @OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
    private int field1938 = 4096;

    @OriginalMember(owner = "client!fg", name = "S", descriptor = "I")
    private int field1945 = 3216;

    @OriginalMember(owner = "client!fg", name = "M", descriptor = "[I")
    public static int[] field1939 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!fg", name = "P", descriptor = "I")
    public static int field1942 = -1;

    @OriginalMember(owner = "client!fg", name = "O", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!fg", name = "R", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!fg", name = "T", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!fg", name = "U", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!fg", name = "V", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!fg", name = "N", descriptor = "[[[Lpi;")
    public static class202[][][] field1940;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lcg;II)V", line = 5)
    public final void method60(class316 arg0, int arg1, int arg2) {
        int var4 = -45 % ((-arg1 - 17) / 40);
        field1948++;
        if (arg2 == 0) {
            this.field1938 = arg0.method2220((byte) 89);
        } else if (arg2 == 1) {
            this.field1945 = arg0.method2220((byte) 62);
        } else if (arg2 == 2) {
            this.field1943 = arg0.method2220((byte) 75);
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(BI)Ljl;", line = 45)
    public static final class287 method1023(byte arg0, int arg1) {
        field1944++;
        class287 var2 = (class287) class129.field1778.method365((long) arg1, 35);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class98.field1332.method955(1, arg1, arg0 - 21880);
        } else {
            var3 = class10.field88.method955(1, arg1 & 0x7FFF, arg0 - 21880);
        }
        class287 var4 = new class287();
        if (var3 != null) {
            var4.method1976(-1, new class316(var3));
        }
        if (arg1 >= 32768) {
            var4.method1978(true);
        }
        if (arg0 != 27) {
            method1025(-83, -60, -57, -59, (class132) null, (class132) null, 66, 18, -112L);
        }
        class129.field1778.method369(arg0 ^ 0x1B, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V", line = 251)
    public class142() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)V", line = 80)
    public final void method546(int arg0) {
        field1946++;
        this.method1024(4096);
        if (arg0 != -21522) {
            method1023((byte) -20, -80);
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)[I", line = 91)
    public final int[] method140(int arg0, int arg1) {
        field1947++;
        int[] var3 = this.field4847.method1387(arg1, (byte) -70);
        if (arg0 != 542) {
            method1026((byte) -96);
        }
        if (this.field4847.field2751) {
            int var4 = class209.field3025 * this.field1938 >> 12;
            int[] var5 = this.method2225((byte) 66, 0, class202.field2889 & arg1 - 1);
            int[] var6 = this.method2225((byte) 66, 0, arg1);
            int[] var7 = this.method2225((byte) 66, 0, arg1 + 1 & class202.field2889);
            for (int var8 = 0; var8 < class326.field4933; var8++) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[class246.field3548 & var8 - 1] - var6[class246.field3548 & var8 + 1]) * var4 >> 12;
                int var11 = var9 >> 4;
                int var12 = var10 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                int var13 = class111.field1502[((var11 + 1) * var11 >> 1) + var12] & 0xFF;
                int var14 = var9 * var13 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = this.field1937[0] * var15 >> 12;
                int var17 = this.field1937[1] * var14 >> 12;
                int var18 = var13 * 4096 >> 8;
                int var19 = this.field1937[2] * var18 >> 12;
                var3[var8] = var17 + var19 + var16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "(I)V", line = 173)
    private final void method1024(int arg0) {
        field1941++;
        double var2 = Math.cos((double) ((float) this.field1943 / 4096.0F));
        this.field1937[0] = (int) (Math.sin((double) ((float) this.field1945 / 4096.0F)) * var2 * 4096.0D);
        this.field1937[1] = (int) (Math.cos((double) ((float) this.field1945 / 4096.0F)) * 4096.0D * var2);
        this.field1937[2] = (int) ((double) arg0 * Math.sin((double) ((float) this.field1943 / 4096.0F)));
        int var4 = this.field1937[1] * this.field1937[1] >> 12;
        int var5 = this.field1937[2] * this.field1937[2] >> 12;
        int var6 = this.field1937[0] * this.field1937[0] >> 12;
        int var7 = (int) (Math.sqrt((double) (var5 + var6 + var4 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field1937[0] = (this.field1937[0] << 12) / var7;
            this.field1937[1] = (this.field1937[1] << 12) / var7;
            this.field1937[2] = (this.field1937[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIILdn;Ldn;IIJ)V", line = 200)
    public static final void method1025(int arg0, int arg1, int arg2, int arg3, class132 arg4, class132 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class7 var10 = new class7();
        var10.field69 = arg8;
        var10.field62 = arg1 * 128 + 64;
        var10.field60 = arg2 * 128 + 64;
        var10.field68 = arg3;
        var10.field57 = arg4;
        var10.field55 = arg5;
        var10.field56 = arg6;
        var10.field71 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (field1940[var11][arg1][arg2] == null) {
                field1940[var11][arg1][arg2] = new class202(var11, arg1, arg2);
            }
        }
        field1940[arg0][arg1][arg2].field2873 = var10;
    }

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "(B)V", line = 234)
    public static void method1026(byte arg0) {
        field1939 = null;
        if (arg0 <= 20) {
            field1940 = (class202[][][]) ((class202[][][]) null);
        }
        field1940 = (class202[][][]) null;
    }
}
