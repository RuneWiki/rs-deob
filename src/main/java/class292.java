import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class292 {

    @OriginalMember(owner = "client!re", name = "b", descriptor = "[I")
    public static int[] field4597 = new int[1000];

    @OriginalMember(owner = "client!re", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4600 = "level: ";

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field4598 = -1;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4596 = null;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field4603 = 0;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(JI)V", line = 16)
    public static final void method2044(long arg0, int arg1) {
        field4601++;
        if (arg1 != 19641) {
            field4598 = 85;
        }
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lag;I)V", line = 39)
    public static final void method2045(class123 arg0, int arg1) {
        field4602++;
        for (int var2 = arg1; var2 < class339.field5258.length; var2++) {
            class339.field5258[var2] = 0;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) (Math.random() * 128.0D * (double) var3);
            class339.field5258[var5] = (int) (Math.random() * 284.0D);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < (var3 - 1); var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = (var7 << 7) + var8;
                    class198.field3254[var9] = (class339.field5258[var9 + 1] + class339.field5258[var9 - 128] + class339.field5258[var9 + -1] + class339.field5258[var9 + 128]) / 4;
                }
            }
            int[] var10 = class339.field5258;
            class339.field5258 = class198.field3254;
            class198.field3254 = var10;
        }
        if (arg0 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0.field4039; var12++) {
            for (int var13 = 0; var13 < arg0.field4037; var13++) {
                if (arg0.field1853[var11++] != 0) {
                    int var14 = var12 + arg0.field4031 + 16;
                    int var15 = var13 + arg0.field4034 + 16;
                    int var16 = (var14 << 7) + var15;
                    class339.field5258[var16] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 133)
    public static void method2046(int arg0) {
        field4600 = null;
        if (arg0 != -19969) {
            field4598 = 60;
        }
        field4596 = null;
        field4597 = null;
    }
}
