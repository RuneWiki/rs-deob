import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class123 {

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Z")
    public boolean field2142 = false;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "Z")
    public static boolean field2154 = false;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "[Lhi;")
    public static class82[] field2149 = new class82[1000];

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "Z")
    public static boolean field2144 = false;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field2155 = 0;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public int field2148;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public int field2151;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    public int field2158;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "J")
    public long field2153;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "Lrm;")
    public class175 field2150;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "[[B")
    public static byte[][] field2147;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)V", line = 12)
    public static final void method838(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class62.field974; var3++) {
            for (int var4 = 0; var4 < class89.field1605; var4++) {
                for (int var5 = 0; var5 < class38.field658; var5++) {
                    class16 var6 = class15.field120[var3][var4][var5];
                    if (var6 != null) {
                        class90 var7 = var6.field171;
                        if (var7 != null && var7.field1626.method234()) {
                            class256.method1831(var7.field1626, var3, var4, var5, 1, 1);
                            if (var7.field1617 != null && var7.field1617.method234()) {
                                class256.method1831(var7.field1617, var3, var4, var5, 1, 1);
                                var7.field1626.method192(var7.field1617, 0, 0, 0, false);
                                var7.field1617 = var7.field1617.method223(arg0, arg1, arg2);
                            }
                            var7.field1626 = var7.field1626.method223(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field165; var8++) {
                            class69 var9 = var6.field158[var8];
                            if (var9 != null && var9.field1075.method234()) {
                                class256.method1831(var9.field1075, var3, var4, var5, var9.field1068 + 1 - var9.field1076, var9.field1083 - var9.field1080 + 1);
                                var9.field1075 = var9.field1075.method223(arg0, arg1, arg2);
                            }
                        }
                        class123 var10 = var6.field161;
                        if (var10 != null && var10.field2150.method234()) {
                            class238.method1679(var10.field2150, var3, var4, var5);
                            var10.field2150 = var10.field2150.method223(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILtg;IBIII)V", line = 82)
    public static final void method839(int arg0, class93 arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field2152++;
        if (arg3 <= -8) {
            class194.method1346(arg1.field1685, arg2, arg0, -120, arg1.field1689, arg4, arg5, arg6);
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(III)I", line = 103)
    public static final int method840(int arg0, int arg1, int arg2) {
        field2157++;
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg1 >>= 0x1;
            arg2 *= arg2;
        }
        if (arg1 == 1) {
            return arg2 * var3;
        } else if (arg0 < 41) {
            return -62;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)Z", line = 131)
    public static final boolean method841(boolean arg0) {
        field2146++;
        if (arg0) {
            method843((class222) null, (class222) null, -20);
        }
        return class147.field2485 ? true : class146.field2468;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I[B)V", line = 154)
    public static final void method842(int arg0, byte[] arg1) {
        field2156++;
        class153 var2 = new class153(arg1);
        var2.field2611 = arg1.length - 2;
        class212.field3714 = var2.method1090(false);
        class260.field4453 = new byte[class212.field3714][];
        class195.field3315 = new boolean[class212.field3714];
        class28.field371 = new byte[class212.field3714][];
        class107.field1897 = new int[class212.field3714];
        class20.field262 = new int[class212.field3714];
        class42.field747 = new int[class212.field3714];
        class86.field1536 = new int[class212.field3714];
        var2.field2611 = arg1.length - class212.field3714 * 8 - 7;
        class285.field4793 = var2.method1090(false);
        class28.field381 = var2.method1090(false);
        int var3 = (var2.method1082(-106) & 0xFF) + 1;
        for (int var4 = 0; var4 < class212.field3714; var4++) {
            class86.field1536[var4] = var2.method1090(false);
        }
        for (int var5 = 0; var5 < class212.field3714; var5++) {
            class20.field262[var5] = var2.method1090(false);
        }
        for (int var6 = arg0; var6 < class212.field3714; var6++) {
            class107.field1897[var6] = var2.method1090(false);
        }
        for (int var7 = 0; var7 < class212.field3714; var7++) {
            class42.field747[var7] = var2.method1090(false);
        }
        var2.field2611 = arg1.length - (class212.field3714 * 8 + ((var3 - 1) * 3)) - 7;
        class142.field2427 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class142.field2427[var8] = var2.method1107((byte) 82);
            if (class142.field2427[var8] == 0) {
                class142.field2427[var8] = 1;
            }
        }
        var2.field2611 = 0;
        for (int var9 = 0; var9 < class212.field3714; var9++) {
            int var10 = class107.field1897[var9];
            int var11 = class42.field747[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            boolean var14 = false;
            byte[] var15 = new byte[var12];
            class260.field4453[var9] = var13;
            class28.field371[var9] = var15;
            int var16 = var2.method1082(arg0 ^ 0xFFFFFFAA);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var12; var22++) {
                    var13[var22] = var2.method1104(-1);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var12; var23++) {
                        byte var24 = var15[var23] = var2.method1104(-1);
                        var14 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label89: while (true) {
                    if (var17 >= var10) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var19 = 0;
                        while (true) {
                            if (var10 <= var19) {
                                break label89;
                            }
                            for (int var20 = 0; var20 < var11; var20++) {
                                byte var21 = var15[var19 + (var10 * var20)] = var2.method1104(-1);
                                var14 |= var21 != -1;
                            }
                            var19++;
                        }
                    }
                    for (int var18 = 0; var18 < var11; var18++) {
                        var13[var10 * var18 + var17] = var2.method1104(arg0 - 1);
                    }
                    var17++;
                }
            }
            class195.field3315[var9] = var14;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lum;Lum;I)I", line = 322)
    public static final int method843(class222 arg0, class222 arg1, int arg2) {
        int var3 = arg2;
        if (arg0.method1598(class21.field290, -1)) {
            var3 = arg2 + 1;
        }
        if (arg0.method1598(class87.field1556, -1)) {
            var3++;
        }
        field2145++;
        if (arg0.method1598(class21.field280, ~arg2)) {
            var3++;
        }
        if (arg1.method1598(class21.field290, -1)) {
            var3++;
        }
        if (arg1.method1598(class87.field1556, ~arg2)) {
            var3++;
        }
        if (arg1.method1598(class21.field280, arg2 - 1)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 362)
    public static void method844(int arg0) {
        if (arg0 <= 35) {
            field2155 = -123;
        }
        field2149 = null;
        field2147 = (byte[][]) null;
    }
}
