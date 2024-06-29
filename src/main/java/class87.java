import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class87 implements Runnable {

    @OriginalMember(owner = "client!p", name = "g", descriptor = "Z")
    public boolean field1291 = true;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field1288 = new Object();

    @OriginalMember(owner = "client!p", name = "i", descriptor = "[I")
    public int[] field1293 = new int[500];

    @OriginalMember(owner = "client!p", name = "j", descriptor = "[I")
    public int[] field1294 = new int[500];

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public int field1292 = 0;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "[I")
    public static int[] field1286 = new int[32];

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "[I")
    public static int[] field1295;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V", line = 4)
    public static void method603(int arg0) {
        field1295 = null;
        if (arg0 < 2) {
            method605(-69, 93, 108);
        }
        field1286 = null;
    }

    @OriginalMember(owner = "client!p", name = "run", descriptor = "()V", line = 16)
    public final void run() {
        while (this.field1291) {
            Object var1 = this.field1288;
            synchronized (this.field1288) {
                if (this.field1292 < 500) {
                    this.field1293[this.field1292] = class132.field2036;
                    this.field1294[this.field1292] = class237.field3557;
                    this.field1292++;
                }
            }
            class93.method662(-553, 50L);
        }
        field1289++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V", line = 44)
    public static final void method604(byte arg0) {
        if (arg0 > -48) {
            method604((byte) 55);
        }
        class265.field4064.method2182(false);
        class73.field951.method2182(false);
        field1285++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(III)V", line = 58)
    public static final void method605(int arg0, int arg1, int arg2) {
        if (class61.field821 > 0) {
            class267.method1876(class61.field821, -118);
            class61.field821 = 0;
        }
        field1287++;
        short var3 = 256;
        if (arg1 != 9103) {
            field1290 = 117;
        }
        int var4 = 0;
        int var5 = class46.field580 * arg2;
        int var6 = 0;
        for (int var7 = 1; var7 < (var3 - 1); var7++) {
            int var8 = (var3 - var7) * class317.field4778[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var6 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class123.field1928[var6++];
                int var11 = class46.field577[arg0 + (var5++)];
                if (var10 == 0) {
                    class223.field3401.field1983[var4++] = var11;
                } else {
                    int var12 = var10 + 18;
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = 256 - (var10 + 18);
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = class180.field2691[var10];
                    class223.field3401.field1983[var4++] = class124.method893(var12 * class124.method893(16711935, var14) + (class124.method893(16711935, var11) * var13), -16711936) + class124.method893(16711680, var12 * class124.method893(var14, 65280) + (var13 * class124.method893(var11, 65280))) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class223.field3401.field1983[var4++] = class46.field577[arg0 + var5++];
            }
            var5 += class46.field580 - 128;
        }
        if (class117.field1817) {
            class308.method2120(class223.field3401.field1983, arg0, arg2, class223.field3401.field3533, class223.field3401.field3537);
        } else {
            class223.field3401.method932(arg0, arg2);
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1286[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
