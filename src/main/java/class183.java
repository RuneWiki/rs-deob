import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class183 {

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "Lha;")
    private static class46 field3279 = class271.method1828("Started 3d Library", -46);

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field3284 = 0;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "[Luf;")
    public static class154[] field3282 = new class154[4];

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Lha;")
    public static class46 field3280 = class271.method1828("::clientdrop", -46);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Z")
    public static volatile boolean field3278 = false;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "Lha;")
    public static class46 field3286 = field3279;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILpi;ILpi;Z)Lqf;")
    public static final class77 method1330(int arg0, class181 arg1, int arg2, class181 arg3, boolean arg4) {
        boolean var5 = true;
        field3287++;
        if (arg0 != 24082) {
            field3284 = 53;
        }
        int[] var6 = arg3.method1318(5, arg2);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg3.method1309(arg2, var6[var7], (byte) 39);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg4) {
                    var10 = arg1.method1309(0, var9, (byte) 39);
                } else {
                    var10 = arg1.method1309(var9, 0, (byte) 39);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class77(arg3, arg1, arg2, arg4);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z[B)V")
    public static final void method1331(boolean arg0, byte[] arg1) {
        field3281++;
        class75 var2 = new class75(arg1);
        var2.field1380 = arg1.length - 2;
        class246.field4365 = var2.method545((byte) 64);
        class87.field1650 = new byte[class246.field4365][];
        class238.field4231 = new boolean[class246.field4365];
        class118.field2209 = new int[class246.field4365];
        class56.field939 = new int[class246.field4365];
        class219.field3858 = new int[class246.field4365];
        class215.field3816 = new int[class246.field4365];
        class273.field4765 = new byte[class246.field4365][];
        var2.field1380 = arg1.length - (class246.field4365 * 8) - 7;
        class222.field3911 = var2.method545((byte) 98);
        class3.field45 = var2.method545((byte) -62);
        int var3 = (var2.method558(1) & 0xFF) + 1;
        for (int var4 = 0; var4 < class246.field4365; var4++) {
            class56.field939[var4] = var2.method545((byte) 117);
        }
        for (int var5 = 0; var5 < class246.field4365; var5++) {
            class215.field3816[var5] = var2.method545((byte) 99);
        }
        if (!arg0) {
            return;
        }
        for (int var6 = 0; var6 < class246.field4365; var6++) {
            class219.field3858[var6] = var2.method545((byte) 83);
        }
        for (int var7 = 0; var7 < class246.field4365; var7++) {
            class118.field2209[var7] = var2.method545((byte) -89);
        }
        var2.field1380 = arg1.length - (class246.field4365 * 8) - ((var3 - 1) * 3) - 7;
        class107.field1980 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class107.field1980[var8] = var2.method559(-1);
            if (class107.field1980[var8] == 0) {
                class107.field1980[var8] = 1;
            }
        }
        var2.field1380 = 0;
        for (int var9 = 0; var9 < class246.field4365; var9++) {
            int var10 = class118.field2209[var9];
            int var11 = class219.field3858[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class273.field4765[var9] = var13;
            byte[] var14 = new byte[var12];
            class87.field1650[var9] = var14;
            boolean var15 = false;
            int var16 = var2.method558(1);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var12; var22++) {
                    var13[var22] = var2.method569((byte) -110);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var12; var23++) {
                        byte var24 = var14[var23] = var2.method569((byte) -110);
                        var15 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label92: while (true) {
                    if (var11 <= var17) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var18 = 0;
                        while (true) {
                            if (var18 >= var11) {
                                break label92;
                            }
                            for (int var19 = 0; var19 < var10; var19++) {
                                byte var20 = var14[var11 * var19 + var18] = var2.method569((byte) -110);
                                var15 |= var20 != -1;
                            }
                            var18++;
                        }
                    }
                    for (int var21 = 0; var21 < var10; var21++) {
                        var13[var11 * var21 + var17] = var2.method569((byte) -110);
                    }
                    var17++;
                }
            }
            class238.field4231[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static void method1332(int arg0) {
        field3280 = null;
        field3286 = null;
        int var1 = 39 / ((38 - arg0) / 49);
        field3282 = null;
        field3279 = null;
    }
}
