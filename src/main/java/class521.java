import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class521 {

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Lmg;")
    public static class530 field7643 = new class530();

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "J")
    public static long field7645 = 0L;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Lrb;")
    public static class283 field7646 = new class283(43, 6);

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field7642;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field7644;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
    public static final void method3101(boolean arg0) {
        field7642++;
        class374.field5376 = 0;
        int var1 = class508.field7414.method1844(-121);
        int var2 = class508.field7414.method1882(-18851);
        boolean var3 = class508.field7414.method1876((byte) -123) == 1;
        int var4 = class508.field7414.method1876((byte) -120);
        class409.method2398(0);
        class2.method15(var4, -87);
        int var5 = (class399.field5722 - class508.field7414.field4360) / 16;
        class44.field633 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class44.field633[var6][var10] = class508.field7414.method1863(-1);
            }
        }
        class196.field2873 = new int[var5];
        class236.field3273 = new byte[var5][];
        class137.field2065 = new byte[var5][];
        class278.field3779 = new int[var5];
        class100.field1585 = null;
        class94.field1536 = new byte[var5][];
        class142.field2119 = null;
        class463.field6689 = new int[var5];
        class302.field4119 = new int[var5];
        class397.field5706 = new byte[var5][];
        if (arg0) {
            field7644 = 122;
        }
        class98.field1560 = new int[var5];
        int var7 = 0;
        for (int var8 = (var2 - (class9.field111 >> 4)) / 8; var8 <= ((class9.field111 >> 4) + var2) / 8; var8++) {
            for (int var9 = (var1 - (class192.field2809 >> 4)) / 8; var9 <= (((class192.field2809 >> 4) + var1) / 8); var9++) {
                class463.field6689[var7] = (var8 << 8) + var9;
                class196.field2873[var7] = class103.field1618.method2488("m" + var8 + "_" + var9, false);
                class98.field1560[var7] = class103.field1618.method2488("l" + var8 + "_" + var9, false);
                class302.field4119[var7] = class103.field1618.method2488("um" + var8 + "_" + var9, false);
                class278.field3779[var7] = class103.field1618.method2488("ul" + var8 + "_" + var9, arg0);
                var7++;
            }
        }
        class219.method1369(10, var2, var3, var1, -124);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
    public static void method3102(byte arg0) {
        field7646 = null;
        if (arg0 != -57) {
            field7643 = null;
        }
        field7643 = null;
    }
}
