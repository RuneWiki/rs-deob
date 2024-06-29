import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class207 {

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Ldb;")
    public static class102 field3409 = new class102(64);

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field3412 = 0;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Z", line = 4)
    public static final boolean method1501(int arg0, int arg1) {
        field3411++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class113.field1727[arg1];
        if (arg0 != -1) {
            method1503(68);
        }
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1004;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIZI)V", line = 27)
    public static final void method1502(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        class80.method545(arg0, -73, arg1 + arg2, -arg2 + arg1, class281.field4523[arg4]);
        field3413++;
        int var5 = 0;
        int var6 = arg2;
        if (!arg3) {
            method1504(false, -49);
        }
        int var7 = -1;
        int var8 = -arg2;
        while (var5 < var6) {
            var7 += 2;
            var5++;
            var8 += var7;
            if (var8 >= 0) {
                var6--;
                int[] var9 = class281.field4523[arg4 + var6];
                var8 -= var6 << 1;
                int var10 = arg1 + var5;
                int[] var11 = class281.field4523[arg4 - var6];
                int var12 = arg1 - var5;
                class80.method545(arg0, -102, var10, var12, var9);
                class80.method545(arg0, -123, var10, var12, var11);
            }
            int var13 = arg1 + var6;
            int var14 = arg1 - var6;
            int[] var15 = class281.field4523[arg4 - var5];
            int[] var16 = class281.field4523[arg4 + var5];
            class80.method545(arg0, -107, var13, var14, var16);
            class80.method545(arg0, -55, var13, var14, var15);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 80)
    public static void method1503(int arg0) {
        field3409 = null;
        if (arg0 <= 99) {
            field3409 = (class102) null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZI)V", line = 94)
    public static final void method1504(boolean arg0, int arg1) {
        field3408++;
        byte var2;
        byte[][] var3;
        if (class232.field3690 && arg0) {
            var2 = 1;
            var3 = class4.field69;
        } else {
            var2 = 4;
            var3 = class256.field4120;
        }
        if (arg1 != 16864) {
            method1501(12, -36);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class76.method516((byte) -51);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class83.field1172[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0 || var8 == 0) {
                            int var9 = (var7 & 0x6) >> 1;
                            int var10 = (var7 & 0xFFCBD6) >> 14;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class330.field5109.length; var13++) {
                                if (class330.field5109[var13] == var12 && var3[var13] != null) {
                                    class219.method1558(var3[var13], (var11 & 0x7) * 8, var8, class126.field1964, (var10 & 0x7) * 8, var5 * 8, var9, var6 * 8, arg0, (byte) -96, var4);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
