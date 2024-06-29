import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class118 implements Runnable {

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "[Lgh;")
    public volatile class62[] field2570 = new class62[2];

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "Z")
    public volatile boolean field2571 = false;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "Z")
    public volatile boolean field2567 = false;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "[I")
    public static int[] field2568 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "Lea;")
    public static class38 field2572 = class9.method46((byte) 118, "sl_arrows");

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Lod;")
    public class129 field2565;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "Lef;")
    public static class43 field2569;

    @OriginalMember(owner = "client!nb", name = "run", descriptor = "()V")
    public final void run() {
        this.field2567 = true;
        try {
            while (!this.field2571) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class62 var2 = this.field2570[var1];
                    if (var2 != null) {
                        var2.method444(79);
                    }
                }
                class132.method969(10L, (byte) 58);
                class202.method1328((byte) -115, null, this.field2565);
            }
        } catch (Exception var9) {
            class17.method95(-53, null, var9);
        } finally {
            Object var6 = null;
            this.field2567 = false;
        }
        field2566++;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILfa;)V")
    public static final void method909(int arg0, class47 arg1) {
        field2564++;
        for (int var2 = 0; var2 < class68.field1720.length; var2++) {
            class68.field1720[var2] = 0;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var3 * Math.random() * 128.0D);
            class68.field1720[var16] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class100.field2234[var15] = (class68.field1720[var15 - 1] + class68.field1720[var15 - 128] + class68.field1720[var15 + 1] + class68.field1720[var15 + 128]) / 4;
                }
            }
            int[] var13 = class68.field1720;
            class68.field1720 = class100.field2234;
            class100.field2234 = var13;
        }
        if (arg1 != null) {
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.field1144; var7++) {
                for (int var8 = 0; var8 < arg1.field1147; var8++) {
                    if (arg1.field1142[var6++] != 0) {
                        int var9 = var8 + arg1.field1145 + 16;
                        int var10 = var7 + arg1.field1143 + 16;
                        int var11 = (var10 << 7) + var9;
                        class68.field1720[var11] = 0;
                    }
                }
            }
        }
        if (arg0 != -4999) {
            field2569 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method910(int arg0) {
        field2568 = null;
        field2572 = null;
        field2569 = null;
        if (arg0 != 2) {
            method909(-115, null);
        }
    }
}
