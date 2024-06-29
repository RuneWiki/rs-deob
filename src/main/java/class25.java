import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class25 {

    @OriginalMember(owner = "client!na", name = "b", descriptor = "Lbe;")
    public static class283 field373 = class153.method941(-22, "Untersuchen");

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "[Lgi;")
    public static class204[] field375;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZILvk;)V", line = 9)
    public static final void method173(boolean arg0, int arg1, class159 arg2) {
        if (arg1 != 1) {
            return;
        }
        field372++;
        int var3 = arg2.field2600;
        int var4 = (int) arg2.field1445;
        arg2.method557((byte) -89);
        if (arg0) {
            class92.method587(true, var3);
        }
        class15.method81(var3, 5673);
        class69 var5 = class65.method418(-8429, var4);
        if (var5 != null) {
            class272.method1834(var5, arg1 ^ 0x1);
        }
        int var6 = class42.field589;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class174.method1150(class110.field1868[var7], arg1 + 74)) {
                class5.method27(var7, (byte) -10);
            }
        }
        if (class42.field589 == 1) {
            class306.field5253 = false;
            class277.method1849(class47.field653, arg1 ^ 0x0, class2.field14, class87.field1472, class31.field473);
        } else {
            class277.method1849(class47.field653, 1, class2.field14, class87.field1472, class31.field473);
            int var8 = class240.field4056.method1656(class301.field5076);
            for (int var9 = 0; var9 < class42.field589; var9++) {
                int var10 = class240.field4056.method1656(class183.method1207(var9, (byte) -37));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class31.field473 = class42.field589 * 15 + 22;
            class47.field653 = var8 + 8;
        }
        if (class82.field1397 != -1) {
            class99.method654(class82.field1397, 1, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IBI)Lph;", line = 91)
    public static final class72 method174(int arg0, byte arg1, int arg2) {
        class72 var3 = (class72) class75.field1302.method1612((long) arg2 << 32 | (long) arg0, 98);
        field376++;
        if (var3 == null) {
            var3 = new class72(arg2, arg0);
            class75.field1302.method1611(var3, -1, var3.field1445);
        }
        int var4 = -96 % ((arg1 - 15) / 50);
        return var3;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V", line = 108)
    public static void method175(byte arg0) {
        field373 = null;
        if (arg0 != 0) {
            method173(true, -43, (class159) null);
        }
        field375 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIZZII[BII[Lpk;I)V", line = 125)
    public static final void method176(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, class104[] arg9, int arg10) {
        field374++;
        if (!arg2) {
            for (int var11 = 0; var11 < 8; var11++) {
                for (int var12 = 0; var12 < 8; var12++) {
                    if ((arg1 + var11) > 0 && (arg1 + var11) < 103 && (arg4 + var12) > 0 && (arg4 + var12) < 103) {
                        arg9[arg0].field1765[arg1 + var11][arg4 + var12] = class178.method1174(arg9[arg0].field1765[arg1 + var11][arg4 + var12], -16777217);
                    }
                }
            }
        }
        byte var13;
        if (arg2) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        class229 var14 = new class229(arg6);
        int var15 = 0;
        if (!arg3) {
            field375 = (class204[]) null;
        }
        while (var13 > var15) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg5 == var15 && var16 >= arg7 && (arg7 + 8) > var16 && var17 >= arg8 && arg8 + 8 > var17) {
                        class210.method1384(0, arg2, var14, 0, arg0, -26634, arg4 + class92.method590(arg10, (byte) 112, var16 & 0x7, var17 & 0x7), arg10, class34.method225(0, var16 & 0x7, var17 & 0x7, arg10) + arg1);
                    } else {
                        class210.method1384(0, arg2, var14, 0, 0, -26634, -1, 0, -1);
                    }
                }
            }
            var15++;
        }
        if (arg2) {
            return;
        }
        class149 var18 = null;
        while (true) {
            int var20;
            label98: do {
                while (var14.field3879.length > var14.field3905) {
                    int var19 = var14.method1535((byte) 104);
                    if (var19 != 0) {
                        if (var19 != 1) {
                            throw new IllegalStateException();
                        }
                        var20 = var14.method1535((byte) 95);
                        continue label98;
                    }
                    var18 = new class149(var14);
                }
                if (var18 == null) {
                    var18 = new class149();
                }
                class197.field3370[arg1 >> 3][arg4 >> 3] = var18;
                return;
            } while (var20 <= 0);
            for (int var21 = 0; var21 < var20; var21++) {
                class115 var22 = new class115(var14);
                int var23 = var22.field1947 >> 7;
                int var24 = var22.field1936 >> 7;
                if (var22.field1944 == arg5 && arg7 <= var24 && var24 < (arg7 + 8) && var23 >= arg8 && arg8 + 8 > var23) {
                    int var25 = class86.method554(-111, arg10, var22.field1947 & 0x3FF, var22.field1936 & 0x3FF) + (arg1 << 7);
                    int var26 = (arg4 << 7) + class114.method741(var22.field1947 & 0x3FF, (byte) 29, arg10, var22.field1936 & 0x3FF);
                    var22.field1947 = var26;
                    var22.field1936 = var25;
                    int var27 = var22.field1947 >> 7;
                    int var28 = var22.field1936 >> 7;
                    if (var28 >= 0 && var27 >= 0 && var28 < 104 && var27 < 104) {
                        var22.field1923 = class65.field890[var22.field1944][var28][var27] - var22.field1923;
                        class17.method104(var22);
                    }
                }
            }
        }
    }
}
