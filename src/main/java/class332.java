import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class332 {

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field5102 = new String[200];

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "[[[I")
    public static int[][][] field5101;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)V", line = 3)
    public static final void method2192(byte arg0) {
        field5103++;
        class482.method2882(72, class397.field5830.field109);
        int var1 = (class430.field6262 >> 10) + (class483.field7082 >> 3);
        int var2 = (class465.field6840 >> 3) + (class291.field4175 >> 10);
        class434.field6317 = class95.field1558.field5538 = 0;
        class95.field1558.method552(0, 8, 8);
        byte var3 = 18;
        class274.field3954 = new int[var3];
        class29.field476 = new byte[var3][];
        class98.field1597 = new byte[var3][];
        class222.field3218 = new byte[var3][];
        class379.field5653 = new byte[var3][];
        class515.field7579 = new int[var3];
        class403.field5925 = new int[var3];
        class466.field6852 = new byte[var3][];
        if (arg0 != 48) {
            method2193(-45);
        }
        class364.field5473 = new int[var3];
        class323.field4961 = new int[var3];
        class178.field2702 = new int[var3][4];
        class266.field3846 = new int[var3];
        int var4 = 0;
        for (int var5 = (var1 - (class237.field3436 >> 4)) / 8; var5 <= ((class237.field3436 >> 4) + var1) / 8; var5++) {
            for (int var7 = (var2 - (class83.field1366 >> 4)) / 8; var7 <= ((class83.field1366 >> 4) + var2) / 8; var7++) {
                int var8 = (var5 << 8) + var7;
                class274.field3954[var4] = var8;
                class515.field7579[var4] = class490.field7157.method677(class113.method838(arg0, -49), "m" + var5 + "_" + var7);
                class364.field5473[var4] = class490.field7157.method677(-1, "l" + var5 + "_" + var7);
                class403.field5925[var4] = class490.field7157.method677(-1, "n" + var5 + "_" + var7);
                class323.field4961[var4] = class490.field7157.method677(-1, "um" + var5 + "_" + var7);
                class266.field3846[var4] = class490.field7157.method677(-1, "ul" + var5 + "_" + var7);
                if (class403.field5925[var4] == -1) {
                    class515.field7579[var4] = -1;
                    class364.field5473[var4] = -1;
                    class323.field4961[var4] = -1;
                    class266.field3846[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class403.field5925.length; var6++) {
            class403.field5925[var6] = -1;
            class515.field7579[var6] = -1;
            class364.field5473[var6] = -1;
            class323.field4961[var6] = -1;
            class266.field3846[var6] = -1;
        }
        class370.method2370(var2, arg0 + 80, true, false, var1);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V", line = 94)
    public static void method2193(int arg0) {
        field5102 = null;
        field5101 = null;
        int var1 = 114 / ((64 - arg0) / 33);
    }
}
