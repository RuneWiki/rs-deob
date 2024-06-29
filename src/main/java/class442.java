import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class442 {

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(IBI)I")
    public static final int method2604(int arg0, byte arg1, int arg2) {
        field6197++;
        if (class694.field9819 == -1) {
            return 1;
        }
        if (class223.field2944.field633.method4191((byte) -120) != arg0) {
            class170.method1064(-11, true, class586.field8138.method3261(class416.field5920, (byte) 82), arg0);
            if (class223.field2944.field633.method4191((byte) -127) != arg0) {
                return -1;
            }
        }
        try {
            Dimension var3 = class68.field939.getSize();
            class760.method4231(true, class619.field8670, class458.field6407, class543.field7644, true, class586.field8138.method3261(class416.field5920, (byte) 82));
            class415 var4 = class566.method3193(true, 0, class694.field9819, class426.field6058);
            long var5 = class97.method654((byte) 80);
            class458.field6407.method59();
            class261.field3318.method1963(0, class5.field54, 0);
            class458.field6407.method77(class261.field3318);
            class458.field6407.method117(var3.width / 2, var3.height / 2, 512, 512);
            class458.field6407.method139(1.0F);
            class458.field6407.method85(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            class219 var7 = class458.field6407.method150(var4, 2048, 64, 64, 768);
            int var8 = 0;
            label45: for (int var9 = 0; var9 < 500; var9++) {
                class458.field6407.method166(0);
                class458.field6407.method99();
                for (int var10 = 15; var10 >= 0; var10--) {
                    for (int var11 = 0; var11 <= var10; var11++) {
                        class290.field3732.method1963((int) (((float) var11 - (float) var10 / 2.0F) * (float) class431.field6109), 0, (var10 + 1) * class431.field6109);
                        var8++;
                        var7.method1351(class290.field3732, null, 0);
                        if ((class97.method654((byte) 46) - var5) >= ((long) arg2)) {
                            break label45;
                        }
                    }
                }
            }
            if (arg1 >= -23) {
                method2604(-69, (byte) 10, -100);
            }
            class458.field6407.method172();
            long var12 = (long) (var8 * 1000) / (class97.method654((byte) 78) - var5);
            class458.field6407.method166(0);
            class458.field6407.method99();
            return (int) var12;
        } catch (Throwable var15) {
            var15.printStackTrace();
            return -1;
        }
    }
}
