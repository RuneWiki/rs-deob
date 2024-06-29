import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class228 extends class157 {

    @OriginalMember(owner = "client!ui", name = "P", descriptor = "Lcc;")
    public static class209 field4154 = class95.method669(118, "(Y");

    @OriginalMember(owner = "client!ui", name = "O", descriptor = "[Z")
    public static boolean[] field4153 = new boolean[112];

    @OriginalMember(owner = "client!ui", name = "U", descriptor = "I")
    public static int field4159 = 0;

    @OriginalMember(owner = "client!ui", name = "V", descriptor = "Lcc;")
    public static class209 field4160 = class95.method669(88, "Wordpack geladen)3");

    @OriginalMember(owner = "client!ui", name = "N", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!ui", name = "Q", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!ui", name = "R", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!ui", name = "S", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!ui", name = "T", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI)V")
    public static final void method1599(boolean arg0, int arg1) {
        ++field4156;
        byte var2 = 4;
        byte[][] var3 = class10.field202;
        int var4 = 16 % ((arg1 - 20) / 51);
        for (int var5 = 0; var2 > var5; ++var5) {
            class117.method831(-413981948);
            for (int var6 = 0; var6 < 13; ++var6) {
                for (int var7 = 0; ~var7 > -14; ++var7) {
                    boolean var8 = false;
                    int var9 = class34.field604[var5][var6][var7];
                    if (~var9 != 0) {
                        int var10 = var9 >> 24 & 3;
                        if (!arg0 || var10 == 0) {
                            int var11 = (var9 & 16770715) >> 14;
                            int var12 = 3 & var9 >> 1;
                            int var13 = 2047 & var9 >> 3;
                            int var14 = (var11 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; class47.field913.length > var15; ++var15) {
                                if (class47.field913[var15] == var14 && var3[var15] != null) {
                                    var8 = true;
                                    class163.method1128(var5, var6 * 8, arg0, var3[var15], var7 * 8, var12, class122.field2404, (7 & var13) * 8, var10, (7 & var11) * 8, false);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class80.method565(0, 8, 8, var5, var6 * 8, var7 * 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BI)[I")
    public final int[] method4(byte arg0, int arg1) {
        ++field4152;
        if (arg0 != -98) {
            field4160 = null;
        }
        int[] var3 = super.field2879.method1269(arg1, arg0 + 17983);
        if (super.field2879.field3363) {
            int[][] var4 = this.method1093(arg1, 0, 64);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            for (int var8 = 0; class226.field4124 > var8; ++var8) {
                var3[var8] = (var6[var8] - -var5[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
    public class228() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIII)V")
    public static final void method1600(int arg0, int arg1, int arg2, int arg3) {
        if (class75.field1406 != 0 && ~arg2 != -1 && ~class88.field1748 > -51 && ~arg1 != 0) {
            class153.field2790[class88.field1748] = arg1;
            class126.field2439[class88.field1748] = arg2;
            class238.field4313[class88.field1748] = arg3;
            class165.field2988[class88.field1748] = null;
            class132.field2527[class88.field1748] = 0;
            ++class88.field1748;
        }
        ++field4155;
        int var4 = -119 % ((arg0 - -39) / 49);
    }

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "(I)V")
    public static void method1601(int arg0) {
        field4154 = null;
        if (arg0 != 0) {
            field4153 = null;
        }
        field4153 = null;
        field4160 = null;
    }
}
