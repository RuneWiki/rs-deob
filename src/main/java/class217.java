import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class217 {

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "Lkh;")
    private static class117 field3945 = class224.method1450((byte) -91, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "Lkh;")
    public static class117 field3946 = field3945;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "Lge;")
    public static class71 field3938 = new class71(64);

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "Lkh;")
    private static class117 field3952 = class224.method1450((byte) -97, "Walk here");

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public static int field3951 = -1;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "Lkh;")
    public static class117 field3954 = class224.method1450((byte) 108, "Okay");

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "[I")
    public static int[] field3953 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "Lkh;")
    public static class117 field3947 = class224.method1450((byte) 112, "<col=00ff00>");

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "Lkh;")
    private static class117 field3955 = class224.method1450((byte) -121, "Loaded fonts");

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "Lkh;")
    public static class117 field3948 = class224.method1450((byte) -14, "Hierhin gehen");

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "Lkh;")
    public static class117 field3950 = field3955;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "Lkh;")
    public static class117 field3957 = field3952;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIZI)V")
    public static final void method1422(int arg0, int arg1, boolean arg2, int arg3) {
        field3941++;
        if (arg1 != -1579) {
            return;
        }
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class66.field1271 = arg2;
        class214.field3883 = arg3;
        class233.field4204 = arg0;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIZ)I")
    public static final int method1423(int arg0, int arg1, boolean arg2) {
        field3944++;
        if (arg1 > arg0) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        if (!arg2) {
            method1425(69);
        }
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZBZ)I")
    public static final int method1424(boolean arg0, byte arg1, boolean arg2) {
        int var3 = 0;
        if (arg1 != 70) {
            method1422(23, -72, false, -23);
        }
        if (arg0) {
            var3 += class45.field968 + class186.field3334;
        }
        field3942++;
        if (arg2) {
            var3 += class34.field799 + class216.field3933;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    public static void method1425(int arg0) {
        if (arg0 != -2382) {
            return;
        }
        field3953 = null;
        field3954 = null;
        field3947 = null;
        field3952 = null;
        field3957 = null;
        field3950 = null;
        field3946 = null;
        field3948 = null;
        field3955 = null;
        field3945 = null;
        field3938 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B[B)V")
    public static final void method1426(byte arg0, byte[] arg1) {
        int var2 = -122 / ((arg0 - 17) / 63);
        int var3 = 0;
        field3940++;
        while (true) {
            while (var3 < arg1.length) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class80.field1501;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class173.field3116;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class237.field4284 && var5 + 64 < class33.field773) {
                    int var6 = var4 >> 6;
                    int var7 = class33.field773 - var5 - 1 >> 6;
                    for (int var8 = 0; var8 < 64; var8++) {
                        for (int var9 = -64; var9 < 0; var9++) {
                            byte var10 = arg1[var3++];
                            if (var10 != 0) {
                                if (class165.field2982[var6][var7] == null) {
                                    class165.field2982[var6][var7] = new byte[4096];
                                }
                                class165.field2982[var6][var7][(-(var9 + 1) << 6) + var8] = var10;
                                byte var11 = arg1[var3++];
                                if (class203.field3671[var6][var7] == null) {
                                    class203.field3671[var6][var7] = new byte[4096];
                                }
                                class203.field3671[var6][var7][(-(var9 + 1) << 6) + var8] = var11;
                            }
                        }
                    }
                } else {
                    for (int var12 = -4096; var12 < 0; var12++) {
                        byte var13 = arg1[var3++];
                        if (var13 != 0) {
                            var3++;
                        }
                    }
                }
            }
            return;
        }
    }
}
