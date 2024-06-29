import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class587 {

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "[B")
    public static byte[] field8348 = new byte[32896];

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field8345;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field8347;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "[Li;")
    public static class37[] field8346;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static void method3433(int arg0) {
        if (arg0 <= -51) {
            field8346 = null;
            field8348 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)V")
    public static final void method3434(int arg0, int arg1) {
        class55.field717 = -1;
        field8345++;
        if (arg1 == 37) {
            class378.field5884 = 3.0F;
        } else if (arg1 == 50) {
            class378.field5884 = 4.0F;
        } else if (arg1 == 75) {
            class378.field5884 = 6.0F;
        } else if (arg1 == 100) {
            class378.field5884 = 8.0F;
        } else if (arg1 == 200) {
            class378.field5884 = 16.0F;
        }
        class55.field717 = -1;
        if (arg0 != 50) {
            field8346 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)Z")
    public static final boolean method3435(byte arg0) {
        field8347++;
        if (arg0 != -87) {
            field8348 = null;
        }
        try {
            return class393.method2545(-124);
        } catch (IOException var4) {
            class125.method1104((byte) 28);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class253.field4038 == null ? -1 : class253.field4038.method1300(-1)) + "," + (class11.field179 == null ? -1 : class11.field179.method1300(-1)) + "," + (class437.field6668 == null ? -1 : class437.field6668.method1300(-1)) + " - " + class344.field5550 + "," + (class567.field8141.field4264[0] + class612.field8702) + "," + (class626.field8855 + class567.field8141.field4265[0]) + " - ";
            for (int var3 = 0; class344.field5550 > var3 && var3 < 50; var3++) {
                var2 = var2 + class558.field8066.field96[var3] + ",";
            }
            class660.method3790(10216, var5, var2);
            class6.method63(0, false);
            return true;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field8348[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
    }
}
