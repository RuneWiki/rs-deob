import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class237 extends class360 {

    @OriginalMember(owner = "client!ee", name = "bb", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!ee", name = "cb", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!ee", name = "db", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!ee", name = "ab", descriptor = "Lph;")
    public static class361 field3552;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(IB)V", line = 6)
    public static final void method1763(int arg0, byte arg1) {
        field3555++;
        if (arg0 == -1 || !class256.method1887(arg0, -1)) {
            return;
        }
        class359[] var2 = class119.field1677[arg0];
        if (arg1 != 11) {
            method1763(-6, (byte) -45);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class359 var4 = var2[var3];
            if (var4.field5537 != null) {
                class300 var5 = new class300();
                var5.field4494 = var4.field5537;
                var5.field4491 = var4;
                class83.method677(-9435, 2000000, var5);
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)[[I", line = 48)
    public final int[][] method19(int arg0, int arg1) {
        field3553++;
        int[][] var3 = this.field379.method668(arg1, arg0 ^ arg0);
        if (this.field379.field1171 && this.method2502(-799)) {
            int[] var4 = var3[1];
            int var5 = arg1 % this.field5675 * this.field5675;
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class209.field3053; var8++) {
                int var9 = this.field5676[var5 + (var8 % this.field5678)];
                var7[var8] = class287.method2076(var9, 255) << 4;
                var4[var8] = class287.method2076(65280, var9) >> 4;
                var6[var8] = class287.method2076(16711680, var9) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "(I)V", line = 93)
    public static void method1764(int arg0) {
        field3552 = null;
        if (arg0 != -8348) {
            field3554 = 78;
        }
    }
}
