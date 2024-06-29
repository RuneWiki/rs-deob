import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class214 {

    @OriginalMember(owner = "client!of", name = "f", descriptor = "[I")
    public static int[] field3454 = new int[2500];

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1435(byte arg0, String arg1) {
        int var2 = -62 % ((-arg0 - 79) / 43);
        field3453++;
        int var3 = class181.method1250((byte) 84, arg1);
        if (var3 != -1) {
            int[] var4 = class247.field3968.method871(-8251, (class225.field3572.field1088[var3] & 0x31917AAB) >> 28, class225.field3572.field1088[var3] & 0x3FFF, class225.field3572.field1088[var3] >> 14 & 0x3FFF);
            class62.method478(-1, var4[2], var4[1]);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static void method1436(int arg0) {
        if (arg0 != 2) {
            method1437(-85, 71, -105, -21, -92);
        }
        field3454 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIII)V")
    public static final void method1437(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3452++;
        class168.method1184(128, arg2 + arg3, -arg3 + arg2, arg4, class85.field1162[arg1]);
        int var5 = -arg3;
        int var6 = arg0;
        int var7 = arg3;
        int var8 = -1;
        while (var6 < var7) {
            var8 += 2;
            var6++;
            var5 += var8;
            if (var5 >= 0) {
                var7--;
                var5 -= var7 << 1;
                int[] var9 = class85.field1162[arg1 + var7];
                int var10 = arg2 + var6;
                int var11 = arg2 - var6;
                int[] var12 = class85.field1162[arg1 - var7];
                class168.method1184(128, var10, var11, arg4, var9);
                class168.method1184(128, var10, var11, arg4, var12);
            }
            int var13 = arg2 + var7;
            int var14 = arg2 - var7;
            int[] var15 = class85.field1162[arg1 + var6];
            int[] var16 = class85.field1162[arg1 - var6];
            class168.method1184(128, var13, var14, arg4, var15);
            class168.method1184(128, var13, var14, arg4, var16);
        }
    }
}
