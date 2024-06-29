import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class390 {

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "[I")
    public int[] field5471 = new int[100];

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "[I")
    public int[] field5475 = new int[3];

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "[Lfo;")
    public class228[] field5474 = new class228[100];

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "[Lmp;")
    public class21[] field5477 = new class21[8];

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "Lfi;")
    public static class166 field5467 = new class166();

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "Lon;")
    public static class35 field5476 = new class35(64);

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public static int field5478 = -1;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public int field5473;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "Ljava/lang/Object;")
    public Object field5468;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZI)V")
    public static final void method2403(boolean arg0, int arg1) {
        field5469++;
        byte[][] var2;
        byte var3;
        if (arg0) {
            var2 = class263.field3536;
            var3 = 1;
        } else {
            var2 = class329.field4474;
            var3 = 4;
        }
        if (arg1 != 18883) {
            return;
        }
        int[] var4 = null;
        for (int var5 = 0; var5 < var3; var5++) {
            class127.method996(124);
            for (int var6 = 0; var6 < class116.field1621 >> 3; var6++) {
                for (int var7 = 0; var7 < (class385.field5425 >> 3); var7++) {
                    boolean var8 = false;
                    int var9 = class39.field602[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = var9 >> 24 & 0x3;
                        if (!arg0 || var10 == 0) {
                            int var11 = (var9 & 0x7) >> 1;
                            int var12 = (var9 & 0xFFD13F) >> 14;
                            int var13 = var9 >> 3 & 0x7FF;
                            int var14 = (var12 / 8 << 8) + (var13 / 8);
                            for (int var15 = 0; var15 < class101.field1500.length; var15++) {
                                if (class101.field1500[var15] == var14 && var2[var15] != null) {
                                    int[] var16 = class190.method1371(var5, var2[var15], true, arg0, var13, var11, class235.field3247, var12, var7 * 8, class249.field3415, var10, var6 * 8);
                                    if (var4 == null && var16 != null) {
                                        var4 = var16;
                                    }
                                    var8 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class416.method2578(var5, 8, 8, var6 * 8, -1, var7 * 8);
                    }
                }
            }
        }
        if (var4 == null) {
            class322.field4369 = null;
        } else {
            class322.field4369 = class244.method1603(var4[2], arg1 - 18880, var4[1], var4[0], var4[3]);
            class127.field1789 = var4[4];
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public static void method2404(int arg0) {
        field5467 = null;
        field5476 = null;
        int var1 = -122 / ((arg0 - 23) / 55);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)V")
    public static final void method2405(int arg0, int arg1) {
        class39.field605 = -1;
        class172.field2519 = arg0;
        field5472++;
        if (arg1 != -26014) {
            method2405(-115, 68);
        }
        class39.field605 = -1;
        class156.method1196(true);
    }
}
