import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class85 {

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public int field1239 = -1;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public int field1243 = -1;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "Lkl;")
    public static class55 field1240;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1245;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "[I")
    public int[] field1238;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BI[FIIIIIFI)V")
    public static final void method581(byte arg0, int arg1, float[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float arg8, int arg9) {
        int var10 = arg1 - arg7;
        int var11 = arg4 - arg9;
        field1241++;
        int var12 = arg5 - arg3;
        float var13 = arg2[2] * (float) var12 + arg2[1] * (float) var11 + arg2[0] * (float) var10;
        float var14 = arg2[5] * (float) var12 + arg2[4] * (float) var11 + arg2[3] * (float) var10;
        float var15 = arg2[8] * (float) var12 + arg2[7] * (float) var11 + arg2[6] * (float) var10;
        if (arg0 != -88) {
            return;
        }
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = (float) Math.asin((double) (var14 / var16)) / 3.1415927F + arg8 + 0.5F;
        if (arg6 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg6 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg6 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class369.field5626 = var18;
        class417.field6363 = var17;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static final void method582(int arg0) {
        field1244++;
        if (arg0 != 15662 || class203.field2716.method16(class378.field5771, -95) != 2) {
            return;
        }
        byte var1 = (byte) (class206.field2765 - 4 & 0xFF);
        int var2 = class206.field2765 % class398.field6071;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class528.field7734; var16++) {
                class304.field4438[var3][var2][var16] = var1;
            }
        }
        if (class367.field5618 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class394.field6021[var4] = -1000000;
            class282.field4153[var4] = 1000000;
            class78.field1127[var4] = 0;
            class390.field5958[var4] = 1000000;
            class102.field1476[var4] = 0;
        }
        if (class340.field5269 != 1) {
            int var15 = class352.method2264(-97, class367.field5618, class140.field1869, class199.field2646);
            if ((var15 - class26.field384) >= 800 || (class178.field2382[class367.field5618][class199.field2646 >> 7][class140.field1869 >> 7] & 0x4) == 0) {
                return;
            }
            class470.method2820(1, class443.field6672, class140.field1869 >> 7, class199.field2646 >> 7, false, -14646);
            return;
        }
        if ((class178.field2382[class367.field5618][class56.field800.field1867 >> 7][class56.field800.field1862 >> 7] & 0x4) != 0) {
            class470.method2820(0, class443.field6672, class56.field800.field1862 >> 7, class56.field800.field1867 >> 7, false, -14646);
        }
        if (class296.field4378 >= 2560) {
            return;
        }
        int var5 = class199.field2646 >> 7;
        int var6 = class140.field1869 >> 7;
        int var7 = class56.field800.field1867 >> 7;
        int var8 = class56.field800.field1862 >> 7;
        int var9;
        if (var7 <= var5) {
            var9 = var5 - var7;
        } else {
            var9 = var7 - var5;
        }
        int var10;
        if (var6 < var8) {
            var10 = var8 - var6;
        } else {
            var10 = var6 - var8;
        }
        if ((var9 != 0 || var10 != 0) && var9 > -class398.field6071 && var9 < class398.field6071 && var10 > (-class528.field7734) && var10 < class528.field7734) {
            if (var10 >= var9) {
                int var11 = var9 * 65536 / var10;
                int var12 = 32768;
                while (var6 != var8) {
                    if (var6 < var8) {
                        var6++;
                    } else if (var8 < var6) {
                        var6--;
                    }
                    if ((class178.field2382[class367.field5618][var5][var6] & 0x4) != 0) {
                        class470.method2820(1, class443.field6672, var6, var5, false, -14646);
                        return;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var5 < var7) {
                            var5++;
                        } else if (var5 > var7) {
                            var5--;
                        }
                        if ((class178.field2382[class367.field5618][var5][var6] & 0x4) != 0) {
                            class470.method2820(1, class443.field6672, var6, var5, false, arg0 ^ 0xFFFFFBE4);
                            return;
                        }
                    }
                }
                return;
            }
            int var13 = var10 * 65536 / var9;
            int var14 = 32768;
            while (var5 != var7) {
                if (var5 < var7) {
                    var5++;
                } else if (var5 > var7) {
                    var5--;
                }
                if ((class178.field2382[class367.field5618][var5][var6] & 0x4) != 0) {
                    class470.method2820(1, class443.field6672, var6, var5, false, -14646);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    if (var8 > var6) {
                        var6++;
                    } else if (var8 < var6) {
                        var6--;
                    }
                    var14 -= 65536;
                    if ((class178.field2382[class367.field5618][var5][var6] & 0x4) != 0) {
                        class470.method2820(1, class443.field6672, var6, var5, false, -14646);
                        return;
                    }
                }
            }
            return;
        }
        class395.method2457("RC: " + var5 + "," + var6 + " " + var7 + "," + var8 + " " + class331.field5162 + "," + class328.field5099, null, 1);
        return;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IILnj;)V")
    private final void method583(int arg0, int arg1, class164 arg2) {
        if (arg1 == 1) {
            this.field1243 = arg2.method1074(-635989152);
        } else if (arg1 == 2) {
            this.field1238 = new int[arg2.method1087(false)];
            for (int var4 = 0; var4 < this.field1238.length; var4++) {
                this.field1238[var4] = arg2.method1074(arg0 - 635979601);
            }
        } else if (arg1 == 3) {
            this.field1239 = arg2.method1087(false);
        }
        field1242++;
        if (arg0 != -9551) {
            this.method585((byte) -37, null);
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
    public static void method584(int arg0) {
        if (arg0 >= -81) {
            method582(125);
        }
        field1240 = null;
        field1245 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLnj;)V")
    public final void method585(byte arg0, class164 arg1) {
        field1246++;
        while (true) {
            int var3 = arg1.method1087(false);
            if (var3 == 0) {
                int var4 = 99 % ((24 - arg0) / 60);
                return;
            }
            this.method583(-9551, var3, arg1);
        }
    }
}
