import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class154 {

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public int field2359 = -1;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public int field2357 = -1;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "[I")
    public int[] field2354;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "[I")
    public static int[] field2358;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLti;)V")
    public final void method1116(byte arg0, class303 arg1) {
        if (arg0 != 70) {
            method1118(87);
        }
        while (true) {
            int var3 = arg1.method1918((byte) 102);
            if (var3 == 0) {
                field2355++;
                return;
            }
            this.method1117(96, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILti;I)V")
    private final void method1117(int arg0, class303 arg1, int arg2) {
        if (arg0 < 25) {
            method1119(-117);
        }
        field2356++;
        if (arg2 == 1) {
            this.field2357 = arg1.method1868(0);
        } else if (arg2 == 2) {
            this.field2354 = new int[arg1.method1918((byte) 108)];
            for (int var4 = 0; var4 < this.field2354.length; var4++) {
                this.field2354[var4] = arg1.method1868(0);
            }
            return;
        } else if (arg2 == 3) {
            this.field2359 = arg1.method1918((byte) 108);
            return;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static void method1118(int arg0) {
        field2358 = null;
        if (arg0 > -25) {
            method1118(31);
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
    public static final void method1119(int arg0) {
        class445.field6534 = 0;
        field2353++;
        int var1 = class387.field5738.method1869((byte) 103);
        boolean var2 = class387.field5738.method1918((byte) 94) == 1;
        int var3 = class387.field5738.method1869((byte) 1);
        int var4 = class387.field5738.method1918((byte) 119);
        class482.method2882(60, var4);
        int var5 = (class133.field2060 - class387.field5738.field4333) / 16;
        class178.field2702 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var11 = 0; var11 < 4; var11++) {
                class178.field2702[var6][var11] = class387.field5738.method1870(-1945262512);
            }
        }
        class266.field3846 = new int[var5];
        class323.field4961 = new int[var5];
        class364.field5473 = new int[var5];
        class379.field5653 = new byte[var5][];
        class515.field7579 = new int[var5];
        class466.field6852 = null;
        class29.field476 = new byte[var5][];
        class222.field3218 = new byte[var5][];
        int var7 = 12 / ((arg0 + 26) / 56);
        class274.field3954 = new int[var5];
        class98.field1597 = new byte[var5][];
        class403.field5925 = null;
        int var8 = 0;
        for (int var9 = (var1 - (class237.field3436 >> 4)) / 8; var9 <= ((class237.field3436 >> 4) + var1) / 8; var9++) {
            for (int var10 = (var3 - (class83.field1366 >> 4)) / 8; var10 <= (var3 + (class83.field1366 >> 4)) / 8; var10++) {
                class274.field3954[var8] = (var9 << 8) + var10;
                class515.field7579[var8] = class490.field7157.method677(-1, "m" + var9 + "_" + var10);
                class364.field5473[var8] = class490.field7157.method677(-1, "l" + var9 + "_" + var10);
                class323.field4961[var8] = class490.field7157.method677(-1, "um" + var9 + "_" + var10);
                class266.field3846[var8] = class490.field7157.method677(-1, "ul" + var9 + "_" + var10);
                var8++;
            }
        }
        class370.method2370(var3, 128, false, var2, var1);
    }
}
