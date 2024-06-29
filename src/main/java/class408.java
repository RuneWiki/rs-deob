import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class408 {

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public int field6035;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "Lmo;")
    public static class271 field6037 = new class271(12, 6);

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "Ljp;")
    public static class55 field6038 = new class55(57, 0);

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "Z")
    public static boolean field6040 = false;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "Lum;")
    public static class83 field6039;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lta;IIILo;ILfi;I)V")
    public static final void method2574(class340 arg0, int arg1, int arg2, int arg3, class363 arg4, int arg5, class38 arg6, int arg7) {
        field6034++;
        if (arg4 == null) {
            return;
        }
        int var8;
        if (class33.field401 == 4) {
            var8 = (int) class434.field6466 & 0x3FFF;
        } else {
            var8 = (int) class434.field6466 + class484.field7096 & 0x3FFF;
        }
        int var9 = Math.max(arg6.field629 / 2, arg6.field591 / 2) + 10;
        int var10 = arg1 * arg1 + arg7 * arg7;
        if (var10 > (var9 * var9)) {
            return;
        }
        int var11 = class58.field891[var8];
        if (arg2 != -32068) {
            field6038 = null;
        }
        int var12 = class58.field889[var8];
        if (class33.field401 != 4) {
            var11 = var11 * 256 / (class195.field3064 + 256);
            var12 = var12 * 256 / (class195.field3064 + 256);
        }
        int var13 = arg1 * var12 + arg7 * var11 >> 15;
        int var14 = arg7 * var12 - (arg1 * var11) >> 15;
        arg4.method397(arg5 + var13 - (-(arg6.field629 / 2) - -(arg4.method394() / 2)), arg3 - -(arg6.field591 / 2) + -var14 - arg4.method396() / 2, arg0, arg5, arg3);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    public static void method2575(int arg0) {
        if (arg0 != 16383) {
            field6038 = null;
        }
        field6037 = null;
        field6038 = null;
        field6039 = null;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class408(String arg0, int arg1) {
        this.field6035 = arg1;
    }

    @OriginalMember(owner = "client!nj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6033++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)I")
    public final int method2576(int arg0) {
        field6032++;
        return arg0 == 10 ? this.field6035 : -43;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)Z")
    public static final boolean method2577(byte arg0) {
        int var1 = -85 / ((arg0 + 71) / 55);
        field6036++;
        try {
            return class426.method2659((byte) 121);
        } catch (IOException var5) {
            class176.method1248((byte) 114);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + (class136.field2073 == null ? -1 : class136.field2073.method355(-123)) + "," + (class498.field7255 == null ? -1 : class498.field7255.method355(-123)) + "," + (class404.field5966 == null ? -1 : class404.field5966.method355(-87)) + " - " + class429.field6369 + "," + (class116.field1781.field7654[0] + class422.field6201) + "," + (class116.field1781.field7653[0] + class23.field273) + " - ";
            for (int var4 = 0; var4 < class429.field6369 && var4 < 50; var4++) {
                var3 = var3 + class424.field6231.field2973[var4] + ",";
            }
            class197.method1407(true, var3, var6);
            class405.method2550(false, -115);
            return true;
        }
    }
}
