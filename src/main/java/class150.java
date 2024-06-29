import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class150 {

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field2918 = 0;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field2914 = -1;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "Li;")
    public static class88 field2920 = class208.method1425(105, "Cabbage");

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "Li;")
    private static class88 field2919 = class208.method1425(105, "Create a free account");

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Li;")
    public static class88 field2911 = class208.method1425(105, "Ung-Ultiger Benutzername");

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "Li;")
    public static class88 field2923 = field2919;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "D")
    public static double field2917;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "[I")
    public static int[] field2922;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
    public static void method1028(byte arg0) {
        if (arg0 < 93) {
            field2917 = 0.6178906857746274D;
        }
        field2922 = null;
        field2919 = null;
        field2920 = null;
        field2911 = null;
        field2923 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIILu;I)V")
    public static final void method1029(int arg0, int arg1, int arg2, int arg3, int arg4, class218 arg5, int arg6) {
        if (arg3 != -4013) {
            field2918 = 98;
        }
        field2916++;
        class97.method683(arg1, arg2, arg4, arg5.field4138, arg6, (byte) -119, arg0, arg5.field4123);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIZII)V")
    public static final void method1030(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (!arg3) {
            method1030(30, 112, -45, false, 115, -15);
        }
        field2921++;
        if (arg4 > class18.field279 || class49.field919 > arg0) {
            return;
        }
        boolean var6;
        if (class67.field1207 > arg2) {
            var6 = false;
            arg2 = class67.field1207;
        } else if (class12.field183 >= arg2) {
            var6 = true;
        } else {
            arg2 = class12.field183;
            var6 = false;
        }
        boolean var7;
        if (arg5 < class67.field1207) {
            arg5 = class67.field1207;
            var7 = false;
        } else if (class12.field183 >= arg5) {
            var7 = true;
        } else {
            arg5 = class12.field183;
            var7 = false;
        }
        if (arg4 >= class49.field919) {
            class230.method1536(arg2, arg1, -7, arg5, class3.field42[arg4++]);
        } else {
            arg4 = class49.field919;
        }
        if (arg0 <= class18.field279) {
            class230.method1536(arg2, arg1, -7, arg5, class3.field42[arg0--]);
        } else {
            arg0 = class18.field279;
        }
        if (var6 && var7) {
            for (int var8 = arg4; var8 <= arg0; var8++) {
                int[] var9 = class3.field42[var8];
                var9[arg2] = var9[arg5] = arg1;
            }
            return;
        }
        if (var6) {
            for (int var10 = arg4; var10 <= arg0; var10++) {
                class3.field42[var10][arg2] = arg1;
            }
            return;
        }
        if (var7) {
            for (int var11 = arg4; var11 <= arg0; var11++) {
                class3.field42[var11][arg5] = arg1;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([BI)V")
    public static final void method1031(byte[] arg0, int arg1) {
        int var2 = 0;
        if (arg1 != 4607) {
            field2920 = null;
        }
        while (true) {
            while (var2 < arg0.length) {
                int var3 = (arg0[var2++] & 0xFF) * 64 - class16.field239;
                int var4 = (arg0[var2++] & 0xFF) * 64 - class119.field2183;
                if (var3 > 0 && var4 > 0 && class109.field1990 > var3 + 64 && class44.field760 > var4 + 64) {
                    int var5 = var3 >> 6;
                    int var6 = class44.field760 - var4 - 1 >> 6;
                    for (int var7 = 0; var7 < 64; var7++) {
                        for (int var8 = -64; var8 < 0; var8++) {
                            byte var9 = arg0[var2++];
                            if (var9 != 0) {
                                if (class7.field105[var5][var6] == null) {
                                    class7.field105[var5][var6] = new byte[4096];
                                }
                                class7.field105[var5][var6][(-(var8 + 1) << 6) + var7] = var9;
                                byte var10 = arg0[var2++];
                                if (class97.field1788[var5][var6] == null) {
                                    class97.field1788[var5][var6] = new byte[4096];
                                }
                                class97.field1788[var5][var6][(-(var8 + 1) << 6) + var7] = var10;
                            }
                        }
                    }
                } else {
                    for (int var11 = -4096; var11 < 0; var11++) {
                        byte var12 = arg0[var2++];
                        if (var12 != 0) {
                            var2++;
                        }
                    }
                }
            }
            field2915++;
            return;
        }
    }
}
