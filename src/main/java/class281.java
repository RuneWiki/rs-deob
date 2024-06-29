import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class281 {

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "[I")
    private int[] field4450;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "[I")
    private int[] field4455;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "Lrj;")
    private class8 field4457;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "Lrj;")
    private class8 field4458;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "[Lrj;")
    private class8[] field4446;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4448 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field4452 = -1;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "Z")
    public static boolean field4459 = true;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "Lje;")
    public static class183 field4453;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static void method1891(int arg0) {
        field4448 = null;
        field4453 = null;
        if (arg0 > -126) {
            field4448 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
    public static final void method1892(int arg0) {
        for (class97 var1 = (class97) class247.field3937.method843(104); var1 != null; var1 = (class97) class247.field3937.method852((byte) 123)) {
            if (var1.field1577) {
                var1.method715(-22);
            }
        }
        class97 var2 = (class97) class263.field4188.method843(-92);
        int var3 = 77 % ((arg0 + 51) / 52);
        while (var2 != null) {
            if (var2.field1577) {
                var2.method715(-67);
            }
            var2 = (class97) class263.field4188.method852((byte) 123);
        }
        field4445++;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V")
    public static final void method1893(int arg0) {
        if (class165.field2614.toLowerCase().indexOf("microsoft") == -1) {
            class278.field4389[46] = 72;
            class278.field4389[61] = 27;
            if (class165.field2627 == null) {
                class278.field4389[222] = 59;
                class278.field4389[192] = 58;
            } else {
                class278.field4389[520] = 59;
                class278.field4389[192] = 28;
                class278.field4389[222] = 58;
            }
            class278.field4389[45] = 26;
            class278.field4389[59] = 57;
            class278.field4389[47] = 73;
            class278.field4389[91] = 42;
            class278.field4389[92] = 74;
            class278.field4389[44] = 71;
            class278.field4389[93] = 43;
        } else {
            class278.field4389[191] = 73;
            class278.field4389[192] = 58;
            class278.field4389[221] = 43;
            class278.field4389[188] = 71;
            class278.field4389[220] = 74;
            class278.field4389[187] = 27;
            class278.field4389[190] = 72;
            class278.field4389[222] = 59;
            class278.field4389[189] = 26;
            class278.field4389[186] = 57;
            class278.field4389[219] = 42;
            class278.field4389[223] = 28;
        }
        if (arg0 == 74) {
            field4444++;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Loj;Lqh;I)Z")
    public final boolean method1894(class159 arg0, class201 arg1, int arg2) {
        field4451++;
        if (class199.field3174 > 0) {
            for (int var4 = 0; var4 < this.field4450.length; var4++) {
                if (!arg1.method1371((byte) -112, class199.field3174, this.field4450[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field4450.length; var5++) {
                if (!arg1.method1353(-10, this.field4450[var5])) {
                    return false;
                }
            }
        }
        if (arg2 != -1) {
            return true;
        }
        for (int var6 = 0; var6 < this.field4455.length; var6++) {
            if (!arg0.method1114(this.field4455[var6], 0)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILqh;Loj;IZZID)[I")
    public final int[] method1895(int arg0, class201 arg1, class159 arg2, int arg3, boolean arg4, boolean arg5, int arg6, double arg7) {
        class280.method1885(arg7, 118);
        class157.field2545 = arg1;
        class71.field1163 = arg2;
        if (arg6 != -1123900600) {
            method1891(-90);
        }
        class275.method1860(arg0, arg6 ^ 0x42FD5CE8, arg3);
        field4449++;
        int[] var10 = new int[arg0 * arg3];
        for (int var11 = 0; var11 < this.field4446.length; var11++) {
            this.field4446[var11].method62((byte) 19, arg0, arg3);
        }
        int var12;
        byte var13;
        int var14;
        if (arg4) {
            var13 = -1;
            var12 = -1;
            var14 = arg3 - 1;
        } else {
            var12 = arg3;
            var13 = 1;
            var14 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg0; var16++) {
            if (arg5) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field4457.field115) {
                int[] var18 = this.field4457.method44(arg6 + 1123900603, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field4457.method65(var16, (byte) 99);
                var21 = var22[1];
                var19 = var22[0];
                var20 = var22[2];
            }
            for (int var23 = var14; var23 != var12; var23 += var13) {
                int var24 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class95.field1564[var24];
                int var26 = var21[var23] >> 4;
                int var27 = var20[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                if (var27 > 255) {
                    var27 = 255;
                }
                if (var27 < 0) {
                    var27 = 0;
                }
                int var28 = class95.field1564[var27];
                int var29 = class95.field1564[var26];
                var10[var15++] = (var25 << 16) + (var29 << 8) + var28;
                if (arg5) {
                    var15 += arg3 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field4446.length; var17++) {
            this.field4446[var17].method59((byte) -115);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lwe;B)I")
    public static final int method1896(class15 arg0, byte arg1) {
        field4447++;
        class107 var2 = arg0.field258;
        if (var2.field1716 != null) {
            var2 = var2.method775(false);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg1 > -55) {
            field4453 = null;
        }
        int var3 = var2.field1726;
        class252 var4 = arg0.method1435(0);
        if (arg0.field3338 == var4.field3988) {
            var3 = var2.field1758;
        } else if (arg0.field3338 == var4.field4021 || arg0.field3338 == var4.field4016 || arg0.field3338 == var4.field3996 || arg0.field3338 == var4.field3998) {
            var3 = var2.field1721;
        } else if (arg0.field3338 == var4.field4001 || arg0.field3338 == var4.field4023 || arg0.field3338 == var4.field4000 || arg0.field3338 == var4.field3992) {
            var3 = var2.field1727;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
    public class281() {
        this.field4450 = new int[0];
        this.field4455 = new int[0];
        this.field4457 = new class51();
        this.field4457.field114 = 1;
        this.field4458 = new class51();
        this.field4458.field114 = 1;
        this.field4446 = new class8[] { this.field4457, this.field4458 };
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1897(byte arg0, String arg1) {
        field4454++;
        if (arg0 < 76) {
            method1897((byte) 122, (String) null);
        }
        int var2 = class12.method90(arg1, 57);
        if (var2 != -1) {
            class167.method1154(class153.field2479.field276[var2], (byte) 93, class153.field2479.field264[var2]);
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Log;)V")
    public class281(class221 arg0) {
        int var2 = arg0.method1517((byte) -96);
        this.field4446 = new class8[var2];
        int var3 = 0;
        int[][] var4 = new int[var2][];
        int var5 = 0;
        for (int var6 = 0; var6 < var2; var6++) {
            class8 var16 = class207.method1433(arg0, (byte) -80);
            if (var16.method58((byte) 112) >= 0) {
                var3++;
            }
            if (var16.method63((byte) -55) >= 0) {
                var5++;
            }
            int var17 = var16.field111.length;
            var4[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var4[var6][var18] = arg0.method1517((byte) -96);
            }
            this.field4446[var6] = var16;
        }
        this.field4450 = new int[var3];
        this.field4455 = new int[var5];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class8 var11 = this.field4446[var9];
            int var12 = var11.field111.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field111[var13] = this.field4446[var4[var9][var13]];
            }
            int var14 = var11.method58((byte) 112);
            int var15 = var11.method63((byte) 117);
            if (var14 > 0) {
                this.field4450[var7++] = var14;
            }
            if (var15 > 0) {
                this.field4455[var8++] = var15;
            }
            var4[var9] = null;
        }
        Object var10 = null;
        this.field4457 = this.field4446[arg0.method1517((byte) -96)];
        this.field4458 = this.field4446[arg0.method1517((byte) -96)];
    }
}
