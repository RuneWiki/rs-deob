import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class118 {

    @OriginalMember(owner = "client!n", name = "f", descriptor = "Lhb;")
    public class67 field2298 = new class67();

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    public static int field2307 = 0;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Lob;")
    public static class129 field2299;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "Lwc;")
    public static class202 field2294;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Lhb;")
    private class67 field2304;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILhb;Lhb;)V")
    public final void method745(int arg0, class67 arg1, class67 arg2) {
        field2300++;
        if (arg2.field1343 != null) {
            arg2.method417(104);
        }
        arg2.field1356 = arg1;
        int var4 = -124 % ((arg0 - 28) / 43);
        arg2.field1343 = arg1.field1343;
        arg2.field1343.field1356 = arg2;
        arg2.field1356.field1343 = arg2;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIILnb;IZ)V")
    public static final void method746(int arg0, int arg1, int arg2, class120 arg3, int arg4, boolean arg5) {
        if (!arg5) {
            method748(-94, 55);
        }
        field2303++;
        int var6 = arg1 * arg1 + arg4 * arg4;
        if (var6 <= 4225 || var6 >= 90000) {
            class174.method1096(arg4, arg3, arg0, arg2, arg1, 2755);
            return;
        }
        int var7 = class204.field3967 + class142.field2933 & 0x7FF;
        int var8 = class135.field2798[var7];
        int var9 = class135.field2797[var7];
        int var10 = var9 * 256 / (class54.field1091 + 256);
        int var11 = var8 * 256 / (class54.field1091 + 256);
        int var12 = arg4 * var11 - arg1 * var10 >> 16;
        int var13 = arg1 * var11 + arg4 * var10 >> 16;
        double var14 = Math.atan2((double) var13, (double) var12);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        class19.field325.method773(arg0 + var16 + 94 - 6, arg2 - 20 + -var17 + 83, 20, 20, 15, 15, var14, 256);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)Lhb;")
    public final class67 method747(int arg0) {
        if (arg0 >= -66) {
            return null;
        }
        field2297++;
        class67 var2 = this.field2304;
        if (this.field2298 == var2) {
            this.field2304 = null;
            return null;
        } else {
            this.field2304 = var2.field1343;
            return var2;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V")
    public static final void method748(int arg0, int arg1) {
        int[] var2 = class9.field161.field2388;
        int var3 = var2.length;
        field2295++;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 1;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (52736 - var5 * 512) * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class15.field232[arg1][var21][var5] & 0x18) == 0) {
                    class137.field2842.method1151(var2, var20, 512, arg1, var21, var5);
                }
                if (arg1 < 3 && (class15.field232[arg1 + 1][var21][var5] & 0x8) != 0) {
                    class137.field2842.method1151(var2, var20, 512, arg1 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        class9.field161.method779();
        int var6 = ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class15.field232[arg1][var19][var8] & 0x18) == 0) {
                    class1.method1(var6, var19, 102, var8, var7, arg1);
                }
                if (arg1 < 3 && (class15.field232[arg1 + 1][var19][var8] & 0x8) != 0) {
                    class1.method1(var6, var19, arg0 ^ 0xFFFFFFA7, var8, var7, arg1 + 1);
                }
            }
        }
        if (arg0 != -1) {
            method750(null, -98);
        }
        class38.field717 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = class137.field2842.method1136(class93.field1839, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class92.method592(var12, (byte) 65).field402;
                    if (var13 >= 0) {
                        int var14 = var9;
                        int var15 = var10;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class147.field3011[class93.field1839].field3094;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var14 > 0 && var14 > var9 - 3 && (var16[var14 - 1][var15] & 0x12C0108) == 0) {
                                    var14--;
                                }
                                if (var18 == 1 && var14 < 103 && var9 + 3 > var14 && (var16[var14 + 1][var15] & 0x12C0180) == 0) {
                                    var14++;
                                }
                                if (var18 == 2 && var15 > 0 && var10 - 3 < var15 && (var16[var14][var15 - 1] & 0x12C0102) == 0) {
                                    var15--;
                                }
                                if (var18 == 3 && var15 < 103 && var15 < var10 + 3 && (var16[var14][var15 + 1] & 0x12C0120) == 0) {
                                    var15++;
                                }
                            }
                        }
                        class107.field2057[class38.field717] = class77.field1540[var13];
                        class142.field2934[class38.field717] = var14;
                        class144.field2969[class38.field717] = var15;
                        class38.field717++;
                    }
                }
            }
        }
        class154.field3132.method921((byte) -40);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)Lhb;")
    public final class67 method749(byte arg0) {
        field2302++;
        if (arg0 < 81) {
            this.method752(null, -107);
        }
        class67 var2 = this.field2298.field1343;
        if (this.field2298 == var2) {
            this.field2304 = null;
            return null;
        } else {
            this.field2304 = var2.field1343;
            return var2;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method750(Component arg0, int arg1) {
        arg0.removeKeyListener(class144.field2959);
        field2301++;
        arg0.removeFocusListener(class144.field2959);
        if (arg1 > -94) {
            method746(29, -96, -47, null, 88, false);
        }
        class193.field3741 = -1;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
    public final void method751(int arg0) {
        if (arg0 != -15085) {
            field2299 = null;
        }
        field2309++;
        while (true) {
            class67 var2 = this.field2298.field1356;
            if (this.field2298 == var2) {
                return;
            }
            var2.method417(-91);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lhb;I)V")
    public final void method752(class67 arg0, int arg1) {
        if (arg0.field1343 != null) {
            arg0.method417(112);
        }
        field2296++;
        if (arg1 == 22) {
            arg0.field1356 = this.field2298.field1356;
            arg0.field1343 = this.field2298;
            arg0.field1343.field1356 = arg0;
            arg0.field1356.field1343 = arg0;
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)Lhb;")
    public final class67 method753(int arg0) {
        field2305++;
        class67 var2 = this.field2298.field1356;
        if (arg0 != -26703) {
            this.field2304 = null;
        }
        if (this.field2298 == var2) {
            this.field2304 = null;
            return null;
        } else {
            this.field2304 = var2.field1356;
            return var2;
        }
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V")
    public static void method754(int arg0) {
        field2294 = null;
        field2299 = null;
        if (arg0 != -4) {
            method748(-43, -66);
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(B)Lhb;")
    public final class67 method755(byte arg0) {
        field2293++;
        class67 var2 = this.field2304;
        if (arg0 <= 113) {
            this.method745(114, null, null);
        }
        if (this.field2298 == var2) {
            this.field2304 = null;
            return null;
        } else {
            this.field2304 = var2.field1356;
            return var2;
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
    public class118() {
        this.field2298.field1343 = this.field2298;
        this.field2298.field1356 = this.field2298;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILhb;)V")
    public final void method756(int arg0, class67 arg1) {
        if (arg1.field1343 != null) {
            arg1.method417(arg0 - 25424);
        }
        arg1.field1356 = this.field2298;
        if (arg0 == 25541) {
            field2306++;
            arg1.field1343 = this.field2298.field1343;
            arg1.field1343.field1356 = arg1;
            arg1.field1356.field1343 = arg1;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)Lhb;")
    public final class67 method757(boolean arg0) {
        field2308++;
        class67 var2 = this.field2298.field1356;
        if (arg0) {
            field2307 = 87;
        }
        if (this.field2298 == var2) {
            return null;
        } else {
            var2.method417(121);
            return var2;
        }
    }
}
