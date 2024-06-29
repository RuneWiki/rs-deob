import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class236 {

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "[B")
    public static byte[] field3611 = new byte[520];

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3613 = "Loaded world list data";

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "[I")
    public static int[] field3615 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V", line = 13)
    public static final void method1654(int arg0, int arg1) {
        short var2 = 256;
        if (arg0 > var2) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class175.field2583 += arg0 * 128;
        field3614++;
        if (class245.field3688.length < class175.field2583) {
            class175.field2583 -= class245.field3688.length;
            int var3 = (int) (Math.random() * 12.0D);
            class276.method1935(class116.field1812[var3], (byte) -109);
        }
        int var4 = arg0 * 128;
        int var5 = 0;
        int var6 = (var2 - arg0) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = class329.field5088[var4 + var5] - (class245.field3688[var5 + class175.field2583 & class245.field3688.length + -1] * arg0 / 6);
            if (var8 < 0) {
                var8 = 0;
            }
            class329.field5088[var5++] = var8;
        }
        for (int var9 = var2 - arg0; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class329.field5088[var10 + var11] = 255;
                } else {
                    class329.field5088[var10 + var11] = 0;
                }
            }
        }
        for (int var13 = 0; var13 < (var2 - arg0); var13++) {
            class137.field2140[var13] = class137.field2140[arg0 + var13];
        }
        for (int var14 = var2 - arg0; var14 < var2; var14++) {
            class137.field2140[var14] = (int) (Math.sin((double) class209.field3297 / 14.0D) * 16.0D + Math.sin((double) class209.field3297 / 15.0D) * 14.0D + Math.sin((double) class209.field3297 / 16.0D) * 12.0D);
            class209.field3297++;
        }
        int var15 = -126 % ((arg1 - 38) / 39);
        int var16 = ((class312.field4852 & 0x1) + arg0) / 2;
        class64.field960 += arg0;
        if (var16 <= 0) {
            return;
        }
        for (int var17 = 0; var17 < class64.field960; var17++) {
            int var18 = (int) (Math.random() * 124.0D) + 2;
            int var19 = (int) (Math.random() * 128.0D) + 128;
            class329.field5088[(var19 << 7) + var18] = 192;
        }
        class64.field960 = 0;
        for (int var20 = 0; var20 < var2; var20++) {
            int var21 = 0;
            int var22 = var20 * 128;
            for (int var23 = -var16; var23 < 128; var23++) {
                if ((var16 + var23) < 128) {
                    var21 += class329.field5088[var22 + var23 + var16];
                }
                if (var23 - var16 - 1 >= 0) {
                    var21 -= class329.field5088[var22 + var23 - var16 - 1];
                }
                if (var23 >= 0) {
                    class27.field314[var22 + var23] = var21 / (var16 * 2 + 1);
                }
            }
        }
        for (int var24 = 0; var24 < 128; var24++) {
            int var25 = 0;
            for (int var26 = -var16; var26 < var2; var26++) {
                int var27 = var26 * 128;
                if ((var16 + var26) < var2) {
                    var25 += class27.field314[var16 * 128 + var24 + var27];
                }
                if (var26 - var16 - 1 >= 0) {
                    var25 -= class27.field314[var27 + var24 - ((var16 + 1) * 128)];
                }
                if (var26 >= 0) {
                    class329.field5088[var24 + var27] = var25 / (var16 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V", line = 199)
    public static void method1655(byte arg0) {
        field3615 = null;
        field3611 = null;
        field3613 = null;
        if (arg0 < 93) {
            method1656(63, true);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)Lci;", line = 214)
    public static final class200 method1656(int arg0, boolean arg1) {
        field3612++;
        class200 var2 = (class200) class243.field3660.method1432((byte) 124, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1) {
            method1656(72, false);
        }
        byte[] var3 = class113.field1775.method1507(arg0, (byte) -128, 1);
        class200 var4 = new class200();
        if (var3 != null) {
            var4.method1447(-123, new class35(var3), arg0);
        }
        class243.field3660.method1436(arg1, var4, (long) arg0);
        return var4;
    }
}
