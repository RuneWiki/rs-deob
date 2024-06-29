import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class143 extends RuntimeException {

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "Ljava/lang/String;")
    public String field2192;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2193;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "Z")
    public static boolean field2194 = false;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "Lnga;")
    public static class510 field2191 = new class510(30);

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "Lqaa;")
    public static class27 field2196 = new class27(64, 8);

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V", line = 3)
    public static void method1120(int arg0) {
        field2196 = null;
        if (arg0 == -29421) {
            field2191 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "([[B[B[I[I[[BIBI)I", line = 17)
    public static final int method1121(byte[][] arg0, byte[] arg1, int[] arg2, int[] arg3, byte[][] arg4, int arg5, byte arg6, int arg7) {
        field2190++;
        int var8 = arg2[arg7];
        int var9 = var8 + arg3[arg7];
        int var10 = arg2[arg5];
        int var11 = var10 + arg3[arg5];
        int var12 = var8;
        if (var8 < var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg1[arg7] & 0xFF;
        if (var14 > (arg1[arg5] & 0xFF)) {
            var14 = arg1[arg5] & 0xFF;
        }
        byte[] var15 = arg0[arg7];
        byte[] var16 = arg4[arg5];
        int var17 = var12 - var8;
        if (arg6 < 68) {
            field2194 = true;
        }
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var15[var17++] + var16[var18++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V", line = 73)
    public static final void method1122(byte arg0) {
        if (arg0 >= -105) {
            field2191 = null;
        }
        class469.field6759++;
        field2195++;
        class135 var1 = class273.method1801(class459.field6629, class65.field1180, 2);
        var1.field2109.method223(1493807496, class241.field3385);
        class539.method3178(var1, -18925);
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 93)
    public class143(Throwable arg0, String arg1) {
        this.field2192 = arg1;
        this.field2193 = arg0;
    }
}
