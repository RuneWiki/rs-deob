import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public class class242 {

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "Lqe;")
    public static class465 field3392 = new class465(29, -1);

    @OriginalMember(owner = "client!uha", name = "d", descriptor = "[I")
    public static int[] field3394 = new int[2];

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!uha", name = "e", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!uha", name = "f", descriptor = "Leq;")
    public static class209 field3396;

    @OriginalMember(owner = "client!uha", name = "c", descriptor = "Lda;")
    public static class59 field3393;

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(I)V", line = 3)
    public static void method1623(int arg0) {
        field3396 = null;
        field3394 = null;
        if (arg0 < 56) {
            field3396 = null;
        }
        field3392 = null;
        field3393 = null;
    }

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "(I)V", line = 18)
    public static final void method1624(int arg0) {
        if (arg0 != 11875) {
            method1625((byte) -96, -79, 9);
        }
        field3395++;
        if (class372.field5224 != null) {
            class750.field10477 = new class363();
            class750.field10477.method2263(class372.field5224.field5472.method1839((byte) 45, class744.field10426), class752.field10485, class372.field5224.field5474, class372.field5224, -727);
            class174.field2538 = new Thread(class750.field10477, "");
            class174.field2538.start();
        }
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(BII)I", line = 46)
    public static final int method1625(byte arg0, int arg1, int arg2) {
        field3391++;
        if (class440.field6145 == -1) {
            return 1;
        }
        if (arg1 != class471.field6781.field6684.method1843(27669)) {
            class416.method2539(class281.field3954.method1839((byte) 45, class744.field10426), 8, arg1, true);
            if (arg1 != class471.field6781.field6684.method1843(27669)) {
                return -1;
            }
        }
        try {
            Dimension var3 = class567.field8085.getSize();
            class379.method2375(class359.field5046, true, class281.field3954.method1839((byte) 45, class744.field10426), (byte) 126, class722.field10090, class436.field6100);
            class729 var4 = class337.method2148(-14907, class440.field6145, class423.field5926, 0);
            long var5 = class742.method4128(1);
            class359.field5046.method601();
            class57.field1066.method157(0, class252.field3600, 0);
            class359.field5046.method538(class57.field1066);
            class359.field5046.method545(var3.width / 2, var3.height / 2, 512, 512);
            class359.field5046.method552(1.0F);
            class359.field5046.method522(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            class469 var7 = class359.field5046.method646(var4, 2048, 64, 64, 768);
            int var8 = 0;
            label41: for (int var9 = 0; var9 < 500; var9++) {
                class359.field5046.method617(0);
                class359.field5046.method619();
                for (int var10 = 15; var10 >= 0; var10--) {
                    for (int var11 = 0; var11 <= var10; var11++) {
                        class25.field369.method157((int) (((float) var11 - ((float) var10 / 2.0F)) * (float) class546.field7701), 0, (var10 + 1) * class546.field7701);
                        var7.method329(class25.field369, null, 0);
                        var8++;
                        if ((class742.method4128(1) - var5) >= ((long) arg2)) {
                            break label41;
                        }
                    }
                }
            }
            int var12 = 86 / ((18 - arg0) / 34);
            class359.field5046.method590();
            long var13 = (long) (var8 * 1000) / (class742.method4128(1) - var5);
            class359.field5046.method617(0);
            class359.field5046.method619();
            return (int) var13;
        } catch (Throwable var16) {
            var16.printStackTrace();
            return -1;
        }
    }
}
