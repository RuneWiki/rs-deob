import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class51 extends class44 {

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "[S")
    public static short[] field807 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "[S")
    public static short[] field811 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "Z")
    public static boolean field813 = true;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "Luf;")
    public static class176 field806;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "Luf;")
    public static class176 field808;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
    public static void method422(int arg0) {
        field808 = null;
        field807 = null;
        field811 = null;
        if (arg0 != 0) {
            field810 = -117;
        }
        field806 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILnc;Lnc;)V")
    public static final void method423(int arg0, class86 arg1, class86 arg2) {
        if (arg1.field1414 != null) {
            arg1.method693(-60);
        }
        arg1.field1407 = arg2;
        field812++;
        if (arg0 == 957) {
            arg1.field1414 = arg2.field1414;
            arg1.field1414.field1407 = arg1;
            arg1.field1407.field1414 = arg1;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)V")
    public static final void method424(int arg0, int arg1) {
        field809++;
        short var2 = 256;
        if (arg1 > var2) {
            arg1 = var2;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class257.field3945 += arg1 * 128;
        if (class65.field1028.length < class257.field3945) {
            class257.field3945 -= class65.field1028.length;
            int var3 = (int) (Math.random() * 12.0D);
            class32.method258(-33, class217.field3413[var3]);
        }
        int var4 = arg1 * 128;
        int var5 = 0;
        int var6 = (var2 - arg1) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var26 = class130.field2024[var5 + var4] - (class65.field1028[class65.field1028.length - 1 & var5 - -class257.field3945] * arg1 / 6);
            if (var26 < 0) {
                var26 = 0;
            }
            class130.field2024[var5++] = var26;
        }
        for (int var8 = var2 - arg1; var8 < var2; var8++) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; var24++) {
                int var25 = (int) (Math.random() * 100.0D);
                if (var25 < 50 && var24 > 10 && var24 < 118) {
                    class130.field2024[var24 + var23] = 255;
                } else {
                    class130.field2024[var23 + var24] = 0;
                }
            }
        }
        for (int var9 = arg0; var9 < (var2 - arg1); var9++) {
            class289.field4559[var9] = class289.field4559[arg1 + var9];
        }
        for (int var10 = var2 - arg1; var10 < var2; var10++) {
            class289.field4559[var10] = (int) (Math.sin((double) class268.field4270 / 14.0D) * 16.0D + Math.sin((double) class268.field4270 / 15.0D) * 14.0D + Math.sin((double) class268.field4270 / 16.0D) * 12.0D);
            class268.field4270++;
        }
        class48.field792 += arg1;
        int var11 = (arg1 + (class267.field4256 & 0x1)) / 2;
        if (var11 <= 0) {
            return;
        }
        for (int var12 = 0; var12 < class48.field792; var12++) {
            int var21 = (int) (Math.random() * 124.0D) + 2;
            int var22 = (int) (Math.random() * 128.0D) + 128;
            class130.field2024[(var22 << 7) + var21] = 192;
        }
        class48.field792 = 0;
        for (int var13 = 0; var13 < var2; var13++) {
            int var18 = var13 * 128;
            int var19 = 0;
            for (int var20 = -var11; var20 < 128; var20++) {
                if ((var11 + var20) < 128) {
                    var19 += class130.field2024[var20 + var11 + var18];
                }
                if ((var20 - var11 - 1) >= 0) {
                    var19 -= class130.field2024[var20 + var18 - var11 - 1];
                }
                if (var20 >= 0) {
                    class87.field1427[var18 + var20] = var19 / (var11 * 2 + 1);
                }
            }
        }
        for (int var14 = 0; var14 < 128; var14++) {
            int var15 = 0;
            for (int var16 = -var11; var16 < var2; var16++) {
                int var17 = var16 * 128;
                if ((var11 + var16) < var2) {
                    var15 += class87.field1427[var11 * 128 + var14 + var17];
                }
                if (var16 - var11 - 1 >= 0) {
                    var15 -= class87.field1427[var14 + var17 - var11 * 128 - 128];
                }
                if (var16 >= 0) {
                    class130.field2024[var14 + var17] = var15 / (var11 * 2 + 1);
                }
            }
        }
    }
}
