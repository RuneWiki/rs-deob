import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class187 implements Runnable {

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "Z")
    public boolean field3083 = true;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Ljava/lang/Object;")
    public Object field3085 = new Object();

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public int field3087 = 0;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "[I")
    public int[] field3088 = new int[500];

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "[I")
    public int[] field3089 = new int[500];

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3086 = "slide:";

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!ad", name = "run", descriptor = "()V", line = 7)
    public final void run() {
        field3080++;
        while (this.field3083) {
            Object var1 = this.field3085;
            synchronized (this.field3085) {
                if (this.field3087 < 500) {
                    this.field3088[this.field3087] = class70.field995;
                    this.field3089[this.field3087] = class233.field3738;
                    this.field3087++;
                }
            }
            class121.method867((byte) 93, 50L);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 28)
    public static void method1393(byte arg0) {
        if (arg0 > 0) {
            field3086 = (String) null;
        }
        field3086 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)I", line = 38)
    public static final int method1394(int arg0, int arg1) {
        field3081++;
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) ((arg0 & 0xFF38) >> 8) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (arg1 < 121) {
            return -100;
        }
        if (var4 > var2) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = (var8 + var10) / 2.0D;
        double var16 = 0.0D;
        if (var8 != var10) {
            if (var14 < 0.5D) {
                var16 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var14 >= 0.5D) {
                var16 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var16 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var14 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var21 >> 5 << 7) + (var20 >> 2 << 10) + (var22 >> 1);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIII)V", line = 141)
    public static final void method1395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 >= -115) {
            method1394(-90, 8);
        }
        class146.field2271[0].method1856(arg4, arg3);
        int var6 = (arg0 - 32) * arg0 / arg5;
        class146.field2271[1].method1856(arg4, arg3 - (16 - arg0));
        field3082++;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg0 - var6 - 32) * arg2 / (arg5 - arg0);
        if (!class232.field3690) {
            class59.method382(arg4, arg3 + 16, 16, arg0 - 32, class304.field4764);
            class59.method382(arg4, var7 + arg3 + 16, 16, var6, class8.field111);
            class59.method383(arg4, arg3 + var7 + 16, var6, class126.field1965);
            class59.method383(arg4 + 1, arg3 - -16 + var7, var6, class126.field1965);
            class59.method400(arg4, arg3 + var7 + 16, 16, class126.field1965);
            class59.method400(arg4, arg3 + var7 + 17, 16, class126.field1965);
            class59.method383(arg4 + 15, arg3 + var7 - -16, var6, class152.field2350);
            class59.method383(arg4 + 14, arg3 + 17 + var7, var6 - 1, class152.field2350);
            class59.method400(arg4, arg3 + var7 + var6 + 15, 16, class152.field2350);
            class59.method400(arg4 + 1, arg3 - -var6 + var7 + 14, 15, class152.field2350);
            return;
        }
        class75.method505(arg4, arg3 + 16, 16, arg0 - 32, class304.field4764);
        class75.method505(arg4, var7 + arg3 + 16, 16, var6, class8.field111);
        class75.method499(arg4, arg3 + var7 + 16, var6, class126.field1965);
        class75.method499(arg4 + 1, arg3 - -16 + var7, var6, class126.field1965);
        class75.method496(arg4, arg3 + var7 + 16, 16, class126.field1965);
        class75.method496(arg4, arg3 + var7 + 17, 16, class126.field1965);
        class75.method499(arg4 + 15, arg3 - -16 + var7, var6, class152.field2350);
        class75.method499(arg4 + 14, arg3 + 17 + var7, var6 - 1, class152.field2350);
        class75.method496(arg4, var6 + var7 + arg3 + 15, 16, class152.field2350);
        class75.method496(arg4 + 1, arg3 + 14 + var6 + var7, 15, class152.field2350);
    }
}
