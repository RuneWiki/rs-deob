import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class160 extends class195 {

    @OriginalMember(owner = "client!sg", name = "Z", descriptor = "I")
    public static int field2484 = 0;

    @OriginalMember(owner = "client!sg", name = "fb", descriptor = "Ljava/lang/String;")
    public static String field2490 = "Loaded config";

    @OriginalMember(owner = "client!sg", name = "ab", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!sg", name = "bb", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!sg", name = "cb", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!sg", name = "db", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!sg", name = "eb", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!sg", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field2483;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)[[I")
    public final int[][] method143(int arg0, int arg1) {
        ++field2489;
        if (arg1 != 6) {
            field2486 = 41;
        }
        int[][] var3 = super.field1390.method1902(-124, arg0);
        if (super.field1390.field4428 && this.method1380(arg1 + 10655)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int var6 = arg0 % super.field2877 * super.field2877;
            int[] var7 = var3[1];
            for (int var8 = 0; var8 < class206.field3032; ++var8) {
                int var9 = super.field2870[var8 % super.field2868 + var6];
                var5[var8] = class301.method2056(var9, 255) << 4;
                var7[var8] = class301.method2056(var9, 65280) >> 4;
                var4[var8] = class301.method2056(4080, var9 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "(B)V")
    public static void method1161(byte arg0) {
        field2483 = null;
        if (arg0 <= 80) {
            field2483 = null;
        }
        field2490 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIII)V")
    public static final void method1162(int arg0, int arg1, int arg2, int arg3) {
        class313 var4 = class223.field3286[arg0][arg1][arg2];
        if (var4 != null) {
            class272 var5 = var4.field5023;
            if (var5 != null) {
                var5.field4398 = var5.field4398 * arg3 / 16;
                var5.field4406 = var5.field4406 * arg3 / 16;
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "(I)I")
    public static final int method1163(int arg0) {
        if (arg0 != 0) {
            field2483 = null;
        }
        ++field2485;
        if (class108.field1829) {
            return 0;
        } else if (!class273.method1903(100)) {
            return 1;
        } else {
            return !class51.field705 ? 1 : 2;
        }
    }

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "(B)[Llf;")
    public static final class94[] method1164(byte arg0) {
        ++field2488;
        class94[] var1 = new class94[class223.field3270];
        if (arg0 != -109) {
            method1162(104, 77, 36, -65);
        }
        for (int var2 = 0; var2 < class223.field3270; ++var2) {
            int var3 = class283.field4559[var2] * class165.field2534[var2];
            byte[] var4 = class280.field4506[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; ~var6 > ~var3; ++var6) {
                var5[var6] = class53.field748[class301.method2056(var4[var6], 255)];
            }
            var1[var2] = new class148(class250.field3792, class19.field202, class32.field399[var2], class297.field4765[var2], class165.field2534[var2], class283.field4559[var2], var5);
        }
        class137.method1032(-126);
        return var1;
    }
}
