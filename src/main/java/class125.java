import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class125 {

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "[I")
    public static int[] field1887 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field1885 = new Rectangle[100];

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "Lki;")
    public static class498 field1888;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "Lne;")
    public static class207 field1890;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
    public static final void method833(int arg0) {
        field1886++;
        class233.method1589(arg0 ^ 0xCBF6E907, class426.field6401.field1001);
        int var1 = (class24.field258 >> 10) + (class68.field1038 >> 3);
        int var2 = (class260.field3827 >> 10) + (class24.field259 >> 3);
        class79.field1192 = class500.field7365.field1768 = 0;
        class500.field7365.method1616(8, (byte) -124, 8);
        byte var3 = 18;
        class150.field2230 = new int[var3];
        class434.field6501 = new byte[var3][];
        class57.field878 = new int[var3];
        class257.field3788 = new int[var3];
        class480.field7048 = new int[var3];
        class424.field6364 = new int[var3];
        class13.field165 = new byte[var3][];
        class331.field4689 = new int[var3];
        class145.field2151 = new byte[var3][];
        class234.field3482 = new byte[var3][];
        class169.field2510 = new byte[var3][];
        class41.field617 = new int[var3][4];
        int var4 = 0;
        for (int var5 = (var1 - (class30.field323 >> 4)) / 8; var5 <= ((var1 + (class30.field323 >> 4)) / 8); var5++) {
            for (int var7 = (var2 - (class182.field2661 >> 4)) / 8; var7 <= ((class182.field2661 >> 4) + var2) / 8; var7++) {
                int var8 = (var5 << 8) + var7;
                class331.field4689[var4] = var8;
                class57.field878[var4] = class132.field2035.method2940("m" + var5 + "_" + var7, false);
                class424.field6364[var4] = class132.field2035.method2940("l" + var5 + "_" + var7, false);
                class150.field2230[var4] = class132.field2035.method2940("n" + var5 + "_" + var7, false);
                class480.field7048[var4] = class132.field2035.method2940("um" + var5 + "_" + var7, false);
                class257.field3788[var4] = class132.field2035.method2940("ul" + var5 + "_" + var7, false);
                if (class150.field2230[var4] == -1) {
                    class57.field878[var4] = -1;
                    class424.field6364[var4] = -1;
                    class480.field7048[var4] = -1;
                    class257.field3788[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class150.field2230.length; var6++) {
            class150.field2230[var6] = -1;
            class57.field878[var6] = -1;
            class424.field6364[var6] = -1;
            class480.field7048[var6] = -1;
            class257.field3788[var6] = -1;
        }
        class185.method1274(var2, var1, true, false, (byte) -43);
        if (arg0 != -5564) {
            field1888 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V")
    public static void method834(int arg0) {
        field1890 = null;
        field1885 = null;
        if (arg0 != 8) {
            field1885 = null;
        }
        field1887 = null;
        field1888 = null;
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field1885[var0] = new Rectangle();
        }
        field1888 = new class498(18, -1);
        field1889 = 2;
        field1890 = new class207("LIVE", 0);
    }
}
