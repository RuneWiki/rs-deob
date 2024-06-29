import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class131 extends class147 {

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "Lna;")
    public static class26 field1993 = class69.method505("<col=ffffff>", (byte) -126);

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
    public static int field1991 = 0;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "B")
    public byte field1988;

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "I")
    public int field1996;

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "Lve;")
    public static class266 field1990;

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "Lna;")
    public class26 field1989;

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "Lna;")
    public class26 field1992;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lwa;B)Lkc;", line = 19)
    public static final class36 method885(class82 arg0, byte arg1) {
        field1994++;
        if (arg1 <= 40) {
            field1990 = (class266) null;
        }
        return new class36(arg0.method626((byte) 38), arg0.method626((byte) 51), arg0.method626((byte) 66), arg0.method626((byte) 68), arg0.method633((byte) 86), arg0.method633((byte) 86), arg0.method642((byte) -85));
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(II)Z", line = 31)
    public static final boolean method886(int arg0, int arg1) {
        int var2 = arg0;
        field1995++;
        byte var3 = 0;
        if (class322.field5536 == null) {
            if (class255.field4184 || class302.field5204 == null) {
                class322.field5536 = new class256(512, 512);
            } else {
                class322.field5536 = (class256) class302.field5204;
            }
            int[] var4 = class322.field5536.field4199;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var3 + 1; var7 < 104 - var3 - 1; var7++) {
                int var8 = (var3 + 103 - var7) * 512 * 4 + 24628;
                for (int var9 = var2 + 1; var9 < (104 - var2 - 1); var9++) {
                    if ((class92.field1492[arg1][var9][var7] & 0x18) == 0) {
                        class285.method2019(var4, var8, 512, arg1, var9, var7);
                    }
                    if (arg1 < 3 && (class92.field1492[arg1 + 1][var9][var7] & 0x8) != 0) {
                        class285.method2019(var4, var8, 512, arg1 + 1, var9, var7);
                    }
                    var8 += 4;
                }
            }
            class305.field5261 = 0;
            for (int var10 = 0; var10 < 104; var10++) {
                for (int var11 = 0; var11 < 104; var11++) {
                    long var12 = class55.method403(class279.field4651, var2 + var10, var11 - -var3);
                    if (var12 != 0L) {
                        class78 var14 = class104.method750(4, (int) (var12 >>> 32) & Integer.MAX_VALUE);
                        int var15 = var14.field1174;
                        if (var14.field1222 != null) {
                            for (int var16 = 0; var16 < var14.field1222.length; var16++) {
                                if (var14.field1222[var16] != -1) {
                                    class78 var17 = class104.method750(4, var14.field1222[var16]);
                                    if (var17.field1174 >= 0) {
                                        var15 = var17.field1174;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var15 >= 0) {
                            int var18 = var3 + var11;
                            int var19 = var2 + var10;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var20 = class218.field3479[class279.field4651].field3605;
                                for (int var21 = 0; var21 < 10; var21++) {
                                    int var22 = (int) (Math.random() * 4.0D);
                                    if (var22 == 0 && var19 > 0 && (var10 - 3) < var19 && (var20[var19 - 1][var18] & 0x12C0108) == 0) {
                                        var19--;
                                    }
                                    if (var22 == 1 && var19 < 103 && (var10 + 3) > var19 && (var20[var19 + 1][var18] & 0x12C0180) == 0) {
                                        var19++;
                                    }
                                    if (var22 == 2 && var18 > 0 && (var11 - 3) < var18 && (var20[var19][var18 - 1] & 0x12C0102) == 0) {
                                        var18--;
                                    }
                                    if (var22 == 3 && var18 < 103 && var18 < (var11 + 3) && (var20[var19][var18 + 1] & 0x12C0120) == 0) {
                                        var18++;
                                    }
                                }
                            }
                            class4.field48[class305.field5261] = var14.field1226;
                            class124.field1926[class305.field5261] = var19 - var2;
                            class94.field1542[class305.field5261] = var18 - var3;
                            class305.field5261++;
                        }
                    }
                }
            }
        }
        class322.field5536.method1804();
        int var23 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (228 - -((int) (Math.random() * 20.0D)));
        int var24 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var25 = 1; var25 < 103; var25++) {
            for (int var26 = 1; var26 < 103; var26++) {
                if ((class92.field1492[arg1][var2 + var26][var25 + var3] & 0x18) == 0 && !class26.method160(var3, var26, var23, var25, var24, var2, arg1, true)) {
                    if (class255.field4184) {
                        class34.field571 = null;
                    } else {
                        class134.field2040.method1172(0);
                    }
                    return false;
                }
                if (arg1 < 3 && (class92.field1492[arg1 + 1][var2 + var26][var3 + var25] & 0x8) != 0 && !class26.method160(var3, var26, var23, var25, var24, var2, arg1 + 1, true)) {
                    if (class255.field4184) {
                        class34.field571 = null;
                    } else {
                        class134.field2040.method1172(0);
                    }
                    return false;
                }
            }
        }
        if (class255.field4184) {
            int[] var27 = class322.field5536.field4199;
            int var28 = var27.length;
            for (int var29 = 0; var29 < var28; var29++) {
                if (var27[var29] == 0) {
                    var27[var29] = 1;
                }
            }
            class302.field5204 = new class130(class322.field5536);
        } else {
            class302.field5204 = class322.field5536;
        }
        if (class255.field4184) {
            class34.field571 = null;
        } else {
            class134.field2040.method1172(0);
        }
        class322.field5536 = null;
        return true;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(II)V", line = 264)
    public static final void method887(int arg0, int arg1) {
        field1997++;
        class174.field2723.method1985(-128, arg0);
        if (arg1 <= -109) {
            class322.field5528.method1985(-126, arg0);
        }
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V", line = 301)
    public static void method888(int arg0) {
        int var1 = 41 % ((arg0 + 70) / 32);
        field1993 = null;
        field1990 = null;
    }
}
