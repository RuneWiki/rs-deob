import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class175 extends class1 {

    @OriginalMember(owner = "client!ei", name = "R", descriptor = "I")
    public int field2669 = 12800;

    @OriginalMember(owner = "client!ei", name = "S", descriptor = "Z")
    public boolean field2670 = true;

    @OriginalMember(owner = "client!ei", name = "X", descriptor = "I")
    public int field2674 = -1;

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "I")
    public int field2664 = -1;

    @OriginalMember(owner = "client!ei", name = "V", descriptor = "I")
    public int field2673 = 0;

    @OriginalMember(owner = "client!ei", name = "U", descriptor = "I")
    public int field2672 = 12800;

    @OriginalMember(owner = "client!ei", name = "T", descriptor = "I")
    public int field2671 = 0;

    @OriginalMember(owner = "client!ei", name = "Z", descriptor = "Ljava/lang/String;")
    public String field2676;

    @OriginalMember(owner = "client!ei", name = "cb", descriptor = "Ljava/lang/String;")
    public String field2679;

    @OriginalMember(owner = "client!ei", name = "Y", descriptor = "I")
    public int field2675;

    @OriginalMember(owner = "client!ei", name = "P", descriptor = "I")
    public int field2667;

    @OriginalMember(owner = "client!ei", name = "eb", descriptor = "Lgk;")
    public class159 field2681;

    @OriginalMember(owner = "client!ei", name = "H", descriptor = "I")
    public static int field2659 = 0;

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "Z")
    public static boolean field2662 = false;

    @OriginalMember(owner = "client!ei", name = "G", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!ei", name = "I", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!ei", name = "O", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!ei", name = "Q", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!ei", name = "ab", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!ei", name = "bb", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!ei", name = "db", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!ei", name = "fb", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "[I")
    public static int[] field2661;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "(I)V")
    public static void method1079(int arg0) {
        field2661 = null;
        if (arg0 != 2) {
            field2680 = 85;
        }
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(B)V")
    public final void method1080(byte arg0) {
        this.field2672 = 12800;
        field2660++;
        this.field2671 = 0;
        this.field2673 = 0;
        this.field2669 = 12800;
        if (arg0 <= 71) {
            return;
        }
        for (class137 var2 = (class137) this.field2681.method983(7); var2 != null; var2 = (class137) this.field2681.method985((byte) 116)) {
            if (var2.field2009 < this.field2669) {
                this.field2669 = var2.field2009;
            }
            if (this.field2672 > var2.field2015) {
                this.field2672 = var2.field2015;
            }
            if (this.field2671 < var2.field2021) {
                this.field2671 = var2.field2021;
            }
            if (var2.field2018 > this.field2673) {
                this.field2673 = var2.field2018;
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "(I)V")
    public static final void method1081(int arg0) {
        class196.field2979.method1106(208, false);
        field2668++;
        for (class199 var1 = (class199) class229.field3449.method1665(16); var1 != null; var1 = (class199) class229.field3449.method1659((byte) -118)) {
            if (var1.field3024 == 0) {
                class80.method528(var1, true, (byte) 57);
            }
        }
        if (class224.field3355 != null) {
            class295.method1980(class224.field3355, 0);
            class224.field3355 = null;
        }
        if (arg0 == 5885) {
            class154.field2316++;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIII)[I")
    public final int[] method1082(int arg0, int arg1, int arg2, int arg3) {
        field2682++;
        if (arg0 <= 112) {
            this.method1085(22, -25, -36);
        }
        for (class137 var5 = (class137) this.field2681.method983(7); var5 != null; var5 = (class137) this.field2681.method985((byte) -82)) {
            if (var5.method839(-109, arg2, arg3, arg1)) {
                return var5.method837(92, arg1, arg2);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BII)V")
    public static final void method1083(byte arg0, int arg1, int arg2) {
        if (arg0 < 47) {
            method1088(-10, 78, -112, 5, 53, -5, -112, 99);
        }
        class187 var3 = class120.method762((byte) 49, 12, arg1);
        field2677++;
        var3.method1167(-120);
        var3.field2844 = arg2;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)[I")
    public final int[] method1084(int arg0, int arg1, int arg2) {
        if (arg2 <= 59) {
            this.field2676 = null;
        }
        field2678++;
        for (class137 var4 = (class137) this.field2681.method983(7); var4 != null; var4 = (class137) this.field2681.method985((byte) -37)) {
            if (var4.method840((byte) -78, arg1, arg0)) {
                return var4.method837(127, arg0, arg1);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(III)[I")
    public final int[] method1085(int arg0, int arg1, int arg2) {
        field2665++;
        for (class137 var4 = (class137) this.field2681.method983(7); var4 != null; var4 = (class137) this.field2681.method985((byte) 127)) {
            if (var4.method833(arg1, arg2, 2047)) {
                return var4.method835(false, arg1, arg2);
            }
        }
        int var5 = -49 / ((arg0 + 63) / 41);
        return null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)Z")
    public static final boolean method1086(int arg0, byte arg1) {
        int var2 = -35 % ((arg1 - 49) / 60);
        field2666++;
        byte var3 = 0;
        byte var4 = 0;
        if (class36.field497 == null) {
            if (class134.field1959 == null) {
                class36.field497 = new class201(512, 512);
            } else {
                class36.field497 = (class201) class134.field1959;
            }
            int[] var5 = class36.field497.field3047;
            int var6 = var5.length;
            for (int var7 = 0; var7 < var6; var7++) {
                var5[var7] = 1;
            }
            for (int var8 = var4 + 1; var8 < 104 - var4 - 1; var8++) {
                int var22 = (var4 + 103 - var8) * 512 * 4 + 24628;
                for (int var23 = var3 + 1; var23 < (104 - var3 - 1); var23++) {
                    if ((class221.field3333[arg0][var23][var8] & 0x18) == 0) {
                        class130.method810(var5, var22, 512, arg0, var23, var8);
                    }
                    if (arg0 < 3 && (class221.field3333[arg0 + 1][var23][var8] & 0x8) != 0) {
                        class130.method810(var5, var22, 512, arg0 + 1, var23, var8);
                    }
                    var22 += 4;
                }
            }
            class184.field2793 = 0;
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    long var11 = class92.method590(class99.field1557, var3 + var9, var4 + var10);
                    if (var11 != 0L) {
                        class288 var13 = class274.method1816(57, (int) (var11 >>> 32) & Integer.MAX_VALUE);
                        int var14 = var13.field4358;
                        if (var13.field4336 != null) {
                            for (int var15 = 0; var15 < var13.field4336.length; var15++) {
                                if (var13.field4336[var15] != -1) {
                                    class288 var16 = class274.method1816(89, var13.field4336[var15]);
                                    if (var16.field4358 >= 0) {
                                        var14 = var16.field4358;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var14 >= 0) {
                            int var17 = var3 + var9;
                            int var18 = var4 + var10;
                            if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                                int[][] var19 = class202.field3052[class99.field1557].field460;
                                for (int var20 = 0; var20 < 10; var20++) {
                                    int var21 = (int) (Math.random() * 4.0D);
                                    if (var21 == 0 && var17 > 0 && (var9 - 3) < var17 && (var19[var17 - 1][var18] & 0x2C0108) == 0) {
                                        var17--;
                                    }
                                    if (var21 == 1 && var17 < 103 && var17 < (var9 + 3) && (var19[var17 + 1][var18] & 0x2C0180) == 0) {
                                        var17++;
                                    }
                                    if (var21 == 2 && var18 > 0 && var18 > (var10 - 3) && (var19[var17][var18 - 1] & 0x2C0102) == 0) {
                                        var18--;
                                    }
                                    if (var21 == 3 && var18 < 103 && var18 < (var10 + 3) && (var19[var17][var18 + 1] & 0x2C0120) == 0) {
                                        var18++;
                                    }
                                }
                            }
                            class77.field1243[class184.field2793] = var13.field4323;
                            class93.field1482[class184.field2793] = var17 - var3;
                            class188.field2875[class184.field2793] = var18 - var4;
                            class184.field2793++;
                        }
                    }
                }
            }
        }
        class36.field497.method1272();
        int var24 = 238 - (10 - ((int) (Math.random() * 20.0D))) << 16;
        int var25 = (((int) (Math.random() * 20.0D)) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) - 10) + 238;
        for (int var26 = 1; var26 < 103; var26++) {
            for (int var27 = 1; var27 < 103; var27++) {
                if ((class221.field3333[arg0][var3 + var27][var4 + var26] & 0x18) == 0 && !class287.method1889(var27, var25, var26, var4, -17755, var3, arg0, var24)) {
                    class273.field4109.method1077(-73);
                    return false;
                }
                if (arg0 < 3 && (class221.field3333[arg0 + 1][var3 + var27][var4 + var26] & 0x8) != 0 && !class287.method1889(var27, var25, var26, var4, -17755, var3, arg0 + 1, var24)) {
                    class273.field4109.method1077(101);
                    return false;
                }
            }
        }
        class134.field1959 = class36.field497;
        class273.field4109.method1077(50);
        class36.field497 = null;
        return true;
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(III)Z")
    public final boolean method1087(int arg0, int arg1, int arg2) {
        if (arg0 > -126) {
            this.field2664 = 49;
        }
        field2658++;
        for (class137 var4 = (class137) this.field2681.method983(7); var4 != null; var4 = (class137) this.field2681.method985((byte) 123)) {
            if (var4.method840((byte) -83, arg2, arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1088(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 1) {
            return;
        }
        field2663++;
        if (arg0 < 1 || arg1 < 1 || arg0 > 102 || arg1 > 102) {
            return;
        }
        if (!class266.method1772(-93) && (class221.field3333[0][arg0][arg1] & 0x2) == 0) {
            int var8 = arg2;
            if ((class221.field3333[arg2][arg0][arg1] & 0x8) != 0) {
                var8 = 0;
            }
            if (class79.field1273 != var8) {
                return;
            }
        }
        int var9 = arg2;
        if (arg2 < 3 && (class221.field3333[1][arg0][arg1] & 0x2) == 2) {
            var9 = arg2 + 1;
        }
        class57.method387((byte) 103, var9, class202.field3052[arg2], arg4, arg2, arg1, arg0);
        if (arg5 < 0) {
            return;
        }
        boolean var10 = class213.field3188;
        class213.field3188 = true;
        class65.method444(arg2, arg7, class202.field3052[arg2], arg0, arg5, arg3, var9, false, false, 0, arg1);
        class213.field3188 = var10;
        return;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
    public class175(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field2676 = arg1;
        this.field2674 = arg4;
        this.field2679 = arg2;
        this.field2675 = arg3;
        this.field2667 = arg0;
        this.field2664 = arg6;
        this.field2670 = arg5;
        if (this.field2664 == 255) {
            this.field2664 = 0;
        }
        this.field2681 = new class159();
    }
}
