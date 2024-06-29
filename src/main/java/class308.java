import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class308 extends class7 {

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "Lal;")
    public static class52 field4876 = new class52(64);

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "[I")
    public static int[] field4881 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!lh", name = "B", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "Lmo;")
    public static class447 field4878;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)V")
    public static final void method2065(int arg0) {
        field4873++;
        class124.method915(class386.field5835, (byte) -32);
        int var1 = (class427.field6301 >> 10) + (class409.field6048 >> 3);
        int var2 = (class444.field6481 >> 3) + (class290.field4631 >> 10);
        if (arg0 != -1) {
            method2065(-64);
        }
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 8;
        byte var6 = 18;
        class71.field876 = new int[var6];
        class376.field5693 = new byte[var6][];
        class254.field4123 = new byte[var6][];
        class102.field1425 = new int[var6];
        class246.field4031 = new byte[var6][];
        class440.field6449 = new int[var6][4];
        class376.field5690 = new byte[var6][];
        class362.field5524 = new int[var6];
        class436.field6417 = new int[var6];
        class236.field3945 = new int[var6];
        class52.field640 = new int[var6];
        class431.field6341 = new byte[var6][];
        int var7 = 0;
        for (int var8 = (var1 - (class80.field1003 >> 4)) / 8; var8 <= ((class80.field1003 >> 4) + var1) / 8; var8++) {
            for (int var10 = (var2 - (class380.field5751 >> 4)) / 8; var10 <= ((var2 + (class380.field5751 >> 4)) / 8); var10++) {
                int var11 = (var8 << 8) + var10;
                class52.field640[var7] = var11;
                class362.field5524[var7] = class212.field3401.method2791((byte) 81, "m" + var8 + "_" + var10);
                class436.field6417[var7] = class212.field3401.method2791((byte) 97, "l" + var8 + "_" + var10);
                class71.field876[var7] = class212.field3401.method2791((byte) -92, "n" + var8 + "_" + var10);
                class102.field1425[var7] = class212.field3401.method2791((byte) 55, "um" + var8 + "_" + var10);
                class236.field3945[var7] = class212.field3401.method2791((byte) 114, "ul" + var8 + "_" + var10);
                if (class71.field876[var7] == -1) {
                    class362.field5524[var7] = -1;
                    class436.field6417[var7] = -1;
                    class102.field1425[var7] = -1;
                    class236.field3945[var7] = -1;
                }
                var7++;
            }
        }
        for (int var9 = var7; var9 < class71.field876.length; var9++) {
            class71.field876[var9] = -1;
            class362.field5524[var9] = -1;
            class436.field6417[var9] = -1;
            class102.field1425[var9] = -1;
            class236.field3945[var9] = -1;
        }
        class414.method2589(true, (byte) -77, var3, var1, false, var4, var5, var2);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZIIII)I")
    public static final int method2066(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field4875++;
        if (arg0) {
            method2067(-120);
        }
        int var5 = arg4 & 0xF;
        int var6 = var5 < 8 ? arg1 : arg2;
        int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg1 : arg3) : arg2;
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "(I)V")
    public static void method2067(int arg0) {
        field4878 = null;
        field4876 = null;
        int var1 = 27 / ((38 - arg0) / 34);
        field4881 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IBIIII)V")
    public static final void method2068(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field4874++;
        int var9 = arg3 + 1;
        class256.method1769(arg0, class277.field4414[arg3], (byte) 50, arg4, arg5);
        int var8 = arg2 - 1;
        class256.method1769(arg0, class277.field4414[arg2], (byte) 54, arg4, arg5);
        int var6 = var9;
        if (arg1 < 7) {
            method2065(21);
        }
        while (var6 <= var8) {
            int[] var7 = class277.field4414[var6];
            var7[arg5] = var7[arg0] = arg4;
            var6++;
        }
    }
}
