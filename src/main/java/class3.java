import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class3 extends class240 {

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
    private int field21 = 1;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "I")
    private int field20 = 1;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "I")
    private int field22 = 204;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "Lcd;")
    public static class64 field18 = class44.method335((byte) 71, "headicons_prayer");

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "Lcd;")
    public static class64 field25 = class44.method335((byte) 71, "::rebuild");

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "Lcd;")
    public static class64 field24 = class44.method335((byte) 71, "gelb:");

    @OriginalMember(owner = "client!pd", name = "ab", descriptor = "Lcd;")
    public static class64 field29 = class44.method335((byte) 71, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!pd", name = "cb", descriptor = "Z")
    public static boolean field31 = false;

    @OriginalMember(owner = "client!pd", name = "eb", descriptor = "I")
    public static int field33 = 0;

    @OriginalMember(owner = "client!pd", name = "db", descriptor = "Lcd;")
    public static class64 field32 = class44.method335((byte) 71, "(U");

    @OriginalMember(owner = "client!pd", name = "fb", descriptor = "[[[I")
    public static int[][][] field34 = new int[2][][];

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!pd", name = "Z", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!pd", name = "bb", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!pd", name = "gb", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "Lqm;")
    public static class222 field17;

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "Lbh;")
    public static class261 field26;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)[I", line = 8)
    public final int[] method12(int arg0, int arg1) {
        int[] var3 = this.field4094.method179(arg1, true);
        if (this.field4094.field344) {
            for (int var4 = 0; var4 < class169.field2936; var4++) {
                int var5 = class268.field4615[arg1];
                int var6 = this.field20 * var5 >> 12;
                int var7 = class74.field1408[var4];
                int var8 = var7 % (4096 / this.field21) * this.field21;
                int var9 = var5 % (4096 / this.field20) * this.field20;
                int var10 = this.field21 * var7 >> 12;
                if (var9 < this.field22) {
                    for (var10 -= var6; var10 < 0; var10 += 4) {
                    }
                    while (var10 > 3) {
                        var10 -= 4;
                    }
                    if (var10 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var8 < this.field22) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field22 > var8) {
                    int var11;
                    for (var11 = var10 - var6; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        field23++;
        if (arg0 != 64) {
            field18 = (class64) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V", line = 300)
    public class3() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(B)V", line = 99)
    public static final void method13(byte arg0) {
        field28++;
        int var1 = -113 / ((arg0 - 44) / 63);
        class241.field4162.method1142(27467);
        class77.field1455.method1696(26846);
        class312.field5285.method1696(26846);
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)V", line = 113)
    public static void method14(int arg0) {
        field29 = null;
        field34 = (int[][][]) null;
        field26 = null;
        field24 = null;
        field17 = null;
        field32 = null;
        field25 = null;
        field18 = null;
        if (arg0 != -6002) {
            field34 = (int[][][]) ((int[][][]) null);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZS)Z", line = 133)
    public static final boolean method15(boolean arg0, short arg1) {
        if (!arg0) {
            field17 = (class222) null;
        }
        field19++;
        if (arg1 == 6 || arg1 == 30 || arg1 == 15 || arg1 == 46 || arg1 == 39 || arg1 == 40 || arg1 == 4 || arg1 == 22) {
            return true;
        } else if (arg1 == 57 || arg1 == 8 || arg1 == 1003 || arg1 == 1002) {
            return true;
        } else if (arg1 == 32 || arg1 == 50 || arg1 == 21 || arg1 == 17 || arg1 == 1) {
            return true;
        } else {
            return arg1 == 20 || arg1 == 2 || arg1 == 33 || arg1 == 58 || arg1 == 5 || arg1 == 29;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IILkh;)V", line = 159)
    public final void method16(int arg0, int arg1, class13 arg2) {
        if (arg0 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.field21 = arg2.method152((byte) -85);
        } else if (arg1 == 1) {
            this.field20 = arg2.method152((byte) -125);
        } else if (arg1 == 2) {
            this.field22 = arg2.method112((byte) 92);
        }
        field30++;
    }

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "(I)[Lqd;", line = 223)
    public static final class40[] method17(int arg0) {
        field27++;
        class40[] var1 = new class40[class265.field4554];
        for (int var2 = arg0; var2 < class265.field4554; var2++) {
            int var3 = class310.field5263[var2] * class223.field3811[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class58.field969[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class236.field3985[class224.method1614(255, var5[var6])];
            }
            if (class123.field2216) {
                var1[var2] = new class136(class24.field400, class46.field755, class234.field3959[var2], class251.field4365[var2], class223.field3811[var2], class310.field5263[var2], var4);
            } else {
                var1[var2] = new class127(class24.field400, class46.field755, class234.field3959[var2], class251.field4365[var2], class223.field3811[var2], class310.field5263[var2], var4);
            }
        }
        class251.method1803(-1);
        return var1;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IZIIIII)I", line = 272)
    public static final int method18(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field35++;
        int var7 = arg0 & 0x3;
        if (arg1) {
            field34 = (int[][][]) ((int[][][]) null);
        }
        if ((arg4 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg3;
            arg3 = var8;
        }
        if (var7 == 0) {
            return arg2;
        } else if (var7 == 1) {
            return 7 + 1 - arg6 - arg5;
        } else if (var7 == 2) {
            return 7 + 1 - arg2 - arg3;
        } else {
            return arg6;
        }
    }
}
