import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class181 extends class224 {

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "Lda;")
    public static class59 field2591;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1295(int arg0) {
        field2592++;
        short var1 = 1024;
        short var2 = 3072;
        if (class339.field4781) {
            if (class154.field2324) {
                var1 = 2048;
            }
            var2 = 4096;
        }
        if (class432.field6035 < (float) var1) {
            class432.field6035 = var1;
        }
        if (class432.field6035 > (float) var2) {
            class432.field6035 = var2;
        }
        while (class321.field4568 >= 16384.0F) {
            class321.field4568 -= 16384.0F;
        }
        while (class321.field4568 < 0.0F) {
            class321.field4568 += 16384.0F;
        }
        if (arg0 < 95) {
            field2587 = -65;
        }
        int var3 = class701.field9841 >> 9;
        int var4 = class246.field3437 >> 9;
        int var5 = class534.method3136(1, class312.field4409, class701.field9841, class246.field3437);
        int var6 = 0;
        if (var3 > 3 && var4 > 3 && class174.field2540 - 4 > var3 && (class716.field9999 - 4) > var4) {
            for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                    int var9 = class312.field4409;
                    if (var9 < 3 && class634.method3647(-87, var8, var7)) {
                        var9++;
                    }
                    int var10 = 0;
                    if (class274.field3909.field4316 != null && class274.field3909.field4316[var9] != null) {
                        var10 = (class274.field3909.field4316[var9][var7][var8] & 0xFF) * 8 << 2;
                    }
                    if (class138.field2153 != null && class138.field2153[var9] != null) {
                        int var11 = var5 + var10 - class138.field2153[var9].method1825(var8, -128, var7);
                        if (var11 > var6) {
                            var6 = var11;
                        }
                    }
                }
            }
        }
        int var12 = (var6 >> 2) * 1536;
        if (var12 > 786432) {
            var12 = 786432;
        }
        if (var12 < 262144) {
            var12 = 262144;
        }
        if (class359.field5048 < var12) {
            class359.field5048 += (var12 - class359.field5048) / 24;
        } else if (var12 < class359.field5048) {
            class359.field5048 += (var12 - class359.field5048) / 80;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Lud;I)Lrt;", line = 107)
    public static final class225 method1296(class35 arg0, int arg1) {
        field2593++;
        return arg1 == 18550 ? new class225(arg0.method225((byte) 111), arg0.method225((byte) 90), arg0.method225((byte) 62), arg0.method225((byte) 79), arg0.method239(-16), arg0.method239(-56), arg0.method273(255)) : null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/lang/String;ZI)V", line = 129)
    public static final void method1297(String arg0, boolean arg1, int arg2) {
        field2589++;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg1 ? 32768 : 0;
        int var7 = var6 + (arg1 ? class643.field9141.field9178 : class643.field9141.field9174);
        for (int var8 = var6; var8 < var7; var8++) {
            class372 var11 = class643.field9141.method3679(var8, 64);
            if (var11.field5225 && var11.method2338((byte) -35).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class330.field4657 = null;
                    class525.field7465 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class330.field4657 = var4;
        class271.field3882 = 0;
        class525.field7465 = var5;
        String[] var9 = new String[class525.field7465];
        for (int var10 = 0; var10 < class525.field7465; var10++) {
            var9[var10] = class643.field9141.method3679(var4[var10], 64).method2338((byte) -127);
        }
        if (arg2 != 262144) {
            method1298((byte) -111);
        }
        class426.method2592((byte) 65, class330.field4657, var9);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V", line = 200)
    public static void method1298(byte arg0) {
        if (arg0 != 49) {
            method1300(-90, -70);
        }
        field2591 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILbj;)Ljava/lang/String;", line = 211)
    public static final String method1299(int arg0, class241 arg1) {
        field2590++;
        return arg0 == 80 ? arg1.field3386 + " <col=ffffff>>" : null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V", line = 223)
    public static final void method1300(int arg0, int arg1) {
        if (arg1 == 16384) {
            field2588++;
            class486.field6884 = 1000000000L / (long) arg0;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IZLdm;I)V", line = 235)
    public static final void method1301(int arg0, boolean arg1, class50 arg2, int arg3) {
        if (!arg1) {
            method1296(null, 8);
        }
        class756.field10530 = arg2;
        field2586++;
        class12.field154 = arg3;
        class544.field7670 = arg0;
    }
}
