import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class511 extends InputStream {

    @OriginalMember(owner = "client!th", name = "d", descriptor = "[I")
    public static int[] field7235 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field7232;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field7233;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field7234;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lgn;)V", line = 8)
    public static final void method2938(class598 arg0) {
        for (int var1 = arg0.field8653; var1 <= arg0.field8663; var1++) {
            for (int var2 = arg0.field8650; var2 <= arg0.field8654; var2++) {
                class349 var3 = class383.field5070[arg0.field8660][var1][var2];
                if (var3 != null) {
                    class61 var4 = var3.field4499;
                    class61 var5 = null;
                    while (var4 != null) {
                        if (var4.field589 == arg0) {
                            if (var5 == null) {
                                var3.field4499 = var4.field595;
                            } else {
                                var5.field595 = var4.field595;
                            }
                            var4.method349(24898);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field595;
                    }
                    var3.field4514 = 0;
                    for (class61 var6 = var3.field4499; var6 != null; var6 = var6.field595) {
                        var3.field4514 = (byte) (var3.field4514 | var6.field591);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "read", descriptor = "()I", line = 63)
    public final int read() {
        class462.method2688(30000L, (byte) 110);
        field7233++;
        return -1;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B[FI)[F", line = 76)
    public static final float[] method2939(byte arg0, float[] arg1, int arg2) {
        field7232++;
        float[] var3 = new float[arg2];
        if (arg0 != -9) {
            method2938(null);
        }
        class345.method1930(arg1, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V", line = 90)
    public static void method2940(int arg0) {
        field7235 = null;
        int var1 = 83 % ((arg0 - 1) / 52);
    }
}
