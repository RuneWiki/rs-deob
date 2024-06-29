import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class398 extends class375 {

    @OriginalMember(owner = "client!ku", name = "Q", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!ku", name = "P", descriptor = "Laj;")
    public static class333 field5836;

    @OriginalMember(owner = "client!ku", name = "R", descriptor = "[Liba;")
    public static class556[] field5838;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(III)V")
    public static final void method2495(int arg0, int arg1, int arg2) {
        class243 var3 = class626.field8501[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class745.method4126(var3.field3277);
        class745.method4126(var3.field3274);
        if (var3.field3277 != null) {
            var3.field3277 = null;
        }
        if (var3.field3274 != null) {
            var3.field3274 = null;
        }
    }

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "(I)V")
    public static void method2496(int arg0) {
        field5836 = null;
        field5838 = null;
        int var1 = 45 / ((-arg0 - 15) / 38);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IZ)[B")
    public static final byte[] method2497(int arg0, boolean arg1) {
        field5837++;
        if (arg1) {
            return null;
        }
        class522 var2 = (class522) class247.field3686.method713((long) arg0, 19);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class739.method4090(var4, 63, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class522(var3);
            class247.field3686.method717(var2, 127, (long) arg0);
        }
        return var2.field7159;
    }
}
