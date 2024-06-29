import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class13 {

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Z")
    public boolean field180 = false;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Lqk;")
    private static class207 field182 = class24.method212(255, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "Z")
    public static boolean field183 = false;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "Lqk;")
    public static class207 field186 = class24.method212(255, "");

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "Lqk;")
    public static class207 field190 = class24.method212(255, "Fermer");

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "I")
    public static int field193 = 0;

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "Lqk;")
    public static class207 field195 = class24.method212(255, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "I")
    public static int field196 = 0;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "Lqk;")
    public static class207 field189 = field182;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "Lqk;")
    private static class207 field197 = class24.method212(255, " is already on your friend list)3");

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "Lqk;")
    public static class207 field179 = field197;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public int field185;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public int field188;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "Lpk;")
    public static class99 field191;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)Z")
    public static final boolean method72(int arg0, int arg1) {
        byte var2 = 0;
        field181++;
        byte var3 = 0;
        if (class169.field2961 == null) {
            if (class144.field2485 == null) {
                class169.field2961 = new class139(512, 512);
            } else {
                class169.field2961 = (class139) class144.field2485;
            }
            int[] var4 = class169.field2961.field2399;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var3 + 1; var7 < 104 - var3 - 1; var7++) {
                int var21 = ((var3 + 103 - var7) * 2048) + 24628;
                for (int var22 = var2 + 1; var22 < 103 - var2; var22++) {
                    if ((class271.field4791[arg0][var22][var7] & 0x18) == 0) {
                        class156.method1141(var4, var21, 512, arg0, var22, var7);
                    }
                    if (arg0 < 3 && (class271.field4791[arg0 + 1][var22][var7] & 0x8) != 0) {
                        class156.method1141(var4, var21, 512, arg0 + 1, var22, var7);
                    }
                    var21 += 4;
                }
            }
            class237.field4374 = 0;
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var9 = 0; var9 < 104; var9++) {
                    long var10 = class237.method1689(class93.field1645, var2 + var8, var3 + var9);
                    if (var10 != 0L) {
                        class22 var12 = class33.method251(0, (int) (var10 >>> 32) & Integer.MAX_VALUE);
                        int var13 = var12.field362;
                        if (var12.field428 != null) {
                            for (int var14 = 0; var14 < var12.field428.length; var14++) {
                                if (var12.field428[var14] != -1) {
                                    class22 var15 = class33.method251(0, var12.field428[var14]);
                                    if (var15.field362 >= 0) {
                                        var13 = var15.field362;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var13 >= 0) {
                            int var16 = var2 + var8;
                            int var17 = var3 + var9;
                            if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                                int[][] var18 = class133.field2303[class93.field1645].field2721;
                                for (int var19 = 0; var19 < 10; var19++) {
                                    int var20 = (int) (Math.random() * 4.0D);
                                    if (var20 == 0 && var16 > 0 && (var8 - 3) < var16 && (var18[var16 - 1][var17] & 0x12C0108) == 0) {
                                        var16--;
                                    }
                                    if (var20 == 1 && var16 < 103 && var16 < (var8 + 3) && (var18[var16 + 1][var17] & 0x12C0180) == 0) {
                                        var16++;
                                    }
                                    if (var20 == 2 && var17 > 0 && var17 > var9 - 3 && (var18[var16][var17 - 1] & 0x12C0102) == 0) {
                                        var17--;
                                    }
                                    if (var20 == 3 && var17 < 103 && var9 + 3 > var17 && (var18[var16][var17 + 1] & 0x12C0120) == 0) {
                                        var17++;
                                    }
                                }
                            }
                            class217.field3855[class237.field4374] = var12.field375;
                            class247.field4487[class237.field4374] = var16 - var2;
                            class113.field1964[class237.field4374] = var17 - var3;
                            class237.field4374++;
                        }
                    }
                }
            }
        }
        int var23 = (int) (Math.random() * 20.0D) + (((int) (Math.random() * 20.0D) + 238 - 10 << 16) + -10 - -((int) (Math.random() * 20.0D) + 238 - 10 << 8)) + 238;
        int var24 = 238 - (10 - ((int) (Math.random() * 20.0D))) << 16;
        class169.field2961.method965();
        int var25 = -125 % ((arg1 - 7) / 59);
        for (int var26 = 1; var26 < 103; var26++) {
            for (int var27 = 1; var27 < 103; var27++) {
                if ((class271.field4791[arg0][var27 + var2][var3 + var26] & 0x18) == 0 && !class273.method1855(16769, var2, var23, var24, arg0, var3, var26, var27)) {
                    class86.field1565.method818((byte) 79);
                    return false;
                }
                if (arg0 < 3 && (class271.field4791[arg0 + 1][var2 + var27][var26 + var3] & 0x8) != 0 && !class273.method1855(16769, var2, var23, var24, arg0 + 1, var3, var26, var27)) {
                    class86.field1565.method818((byte) 79);
                    return false;
                }
            }
        }
        class144.field2485 = class169.field2961;
        class86.field1565.method818((byte) 79);
        class169.field2961 = null;
        return true;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field184++;
        if (arg2 <= 101) {
            method77(false);
        }
        if ((arg3 - arg5) >= class124.field2158 && (arg3 + arg5) <= class88.field1599 && class204.field3580 <= (arg4 - arg5) && arg4 + arg5 <= class204.field3602) {
            class78.method595((byte) 37, arg4, arg3, arg0, arg6, arg1, arg5);
        } else {
            class10.method56(arg6, arg0, arg5, arg4, arg1, -1, arg3);
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(II)Lob;")
    public final class130 method74(int arg0, int arg1) {
        if (arg0 != 11230) {
            field197 = null;
        }
        class130 var3 = (class130) class115.field1993.method1387((long) (this.field188 | arg1 << 16), 125);
        field178++;
        if (var3 != null) {
            return var3;
        }
        class243.field4418.method723(this.field188, true);
        class130 var4 = class1.method4(this.field188, class243.field4418, 0, -105);
        if (var4 != null) {
            var4.method908(class124.field2164, class25.field526, class70.field1252);
            var4.field669 = var4.field658;
            var4.field663 = var4.field661;
            for (int var5 = 0; var5 < arg1; var5++) {
                var4.method914();
            }
            class115.field1993.method1385((long) (arg1 << 16 | this.field188), var4, (byte) -127);
        }
        return var4;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IILv;)V")
    public final void method75(int arg0, int arg1, class149 arg2) {
        if (arg1 != 20) {
            return;
        }
        while (true) {
            int var4 = arg2.method1045((byte) 111);
            if (var4 == 0) {
                field194++;
                return;
            }
            this.method76(arg0, var4, arg2, (byte) -123);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IILv;B)V")
    private final void method76(int arg0, int arg1, class149 arg2, byte arg3) {
        field177++;
        if (arg1 == 1) {
            this.field188 = arg2.method1050(1272006568);
        } else if (arg1 == 2) {
            this.field185 = arg2.method1065((byte) 84);
        } else if (arg1 == 3) {
            this.field180 = true;
        } else if (arg1 == 4) {
            this.field188 = -1;
        }
        if (arg3 > -67) {
            this.field185 = 66;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V")
    public static void method77(boolean arg0) {
        field186 = null;
        field189 = null;
        field190 = null;
        field197 = null;
        field182 = null;
        field191 = null;
        field195 = null;
        field179 = null;
        if (!arg0) {
            field193 = 109;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static final void method78(int arg0) {
        class256.field4580.method1382(arg0 ^ 0x7A72);
        if (arg0 == 0) {
            field187++;
        }
    }
}
