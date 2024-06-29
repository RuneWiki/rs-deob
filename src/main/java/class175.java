import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class175 extends class166 {

    @OriginalMember(owner = "client!te", name = "C", descriptor = "Z")
    public static boolean field3489 = false;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "Lcd;")
    private static class23 field3476 = class54.method414("You can(Wt add yourself to your own friend list)3", -1);

    @OriginalMember(owner = "client!te", name = "D", descriptor = "Lcd;")
    public static class23 field3490 = field3476;

    @OriginalMember(owner = "client!te", name = "F", descriptor = "Ldh;")
    public static class36 field3492 = new class36(4096);

    @OriginalMember(owner = "client!te", name = "K", descriptor = "Lcd;")
    public static class23 field3497 = class54.method414("<col=c0ff00>", -1);

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    public int field3487;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!te", name = "I", descriptor = "I")
    public int field3495;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "J")
    public static long field3494;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "[I")
    public int[] field3483;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "[I")
    public int[] field3486;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "[I")
    public int[] field3491;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "[Ldd;")
    public class32[] field3478;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "[Ldd;")
    public class32[] field3496;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "[[[B")
    public byte[][][] field3481;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V")
    public static final void method1097(boolean arg0) {
        field3493++;
        if (!arg0) {
            return;
        }
        if (class41.field874 != null) {
            class41.field874.method1251(arg0);
        }
        if (class75.field1713 != null) {
            class75.field1713.method1251(true);
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V")
    public static void method1098(int arg0) {
        field3490 = null;
        field3476 = null;
        field3492 = null;
        if (arg0 != 1) {
            method1104(null, 90, false, -79, 21, 87, (byte) -74);
        }
        field3497 = null;
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V")
    public static final void method1099(int arg0) {
        field3484++;
        class200 var1 = class160.field3194;
        synchronized (class160.field3194) {
            class105.field2277 = class145.field2966;
            class78.field1724 = class178.field3538;
            class64.field1518 = class136.field2811;
            class43.field911 = class157.field3137;
            class65.field1535 = class68.field1592;
            class43.field912 = class16.field344;
            class145.field2954 = class63.field1492;
            class157.field3137 = arg0;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I[B)V")
    public static final void method1100(int arg0, byte[] arg1) {
        field3477++;
        class189 var2 = new class189(arg1);
        var2.field3752 = arg1.length - 2;
        class79.field1730 = var2.method1197(-1);
        class15.field329 = new int[class79.field1730];
        class107.field2287 = new int[class79.field1730];
        class129.field2698 = new byte[class79.field1730][];
        class109.field2311 = new int[class79.field1730];
        class72.field1652 = new int[class79.field1730];
        var2.field3752 = arg1.length - class79.field1730 * 8 - 7;
        class167.field3328 = var2.method1197(-1);
        class194.field3836 = var2.method1197(-1);
        int var3 = (var2.method1202(103) & 0xFF) + 1;
        for (int var4 = 0; var4 < class79.field1730; var4++) {
            class107.field2287[var4] = var2.method1197(-1);
        }
        for (int var5 = 0; var5 < class79.field1730; var5++) {
            class15.field329[var5] = var2.method1197(-1);
        }
        for (int var6 = 0; var6 < class79.field1730; var6++) {
            class72.field1652[var6] = var2.method1197(-1);
        }
        for (int var7 = 0; var7 < class79.field1730; var7++) {
            class109.field2311[var7] = var2.method1197(-1);
        }
        var2.field3752 = arg1.length - class79.field1730 * 8 - (var3 + -1) * 3 - 7;
        class133.field2756 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class133.field2756[var8] = var2.method1177(true);
            if (class133.field2756[var8] == 0) {
                class133.field2756[var8] = 1;
            }
        }
        var2.field3752 = 0;
        for (int var9 = 0; var9 < class79.field1730; var9++) {
            int var11 = class72.field1652[var9];
            int var12 = class109.field2311[var9];
            int var13 = var11 * var12;
            byte[] var14 = new byte[var13];
            class129.field2698[var9] = var14;
            int var15 = var2.method1202(106);
            if (var15 == 0) {
                for (int var16 = 0; var16 < var13; var16++) {
                    var14[var16] = var2.method1204(true);
                }
            } else if (var15 == 1) {
                for (int var17 = 0; var17 < var11; var17++) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        var14[var11 * var18 + var17] = var2.method1204(true);
                    }
                }
            }
        }
        int var10 = -14 % ((-arg0 - 69) / 34);
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V")
    public static final void method1101(int arg0) {
        class15.field329 = null;
        class109.field2311 = null;
        if (arg0 > -93) {
            method1098(21);
        }
        class129.field2698 = null;
        class133.field2756 = null;
        field3488++;
        class72.field1652 = null;
        class107.field2287 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILkh;ZLkh;I)Laa;")
    public static final class2 method1102(int arg0, class97 arg1, boolean arg2, class97 arg3, int arg4) {
        field3485++;
        boolean var5 = true;
        int[] var6 = arg3.method644(arg4, (byte) 122);
        for (int var7 = arg0; var7 < var6.length; var7++) {
            byte[] var8 = arg3.method654(0, var6[var7], arg4);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg2) {
                    var10 = arg1.method654(0, var9, 0);
                } else {
                    var10 = arg1.method654(0, 0, var9);
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
            return new class2(arg3, arg1, arg4, arg2);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IBI)I")
    public static final int method1103(int arg0, byte arg1, int arg2) {
        if (arg1 != 122) {
            method1101(46);
        }
        field3480++;
        class191 var3 = (class191) class204.field4021.method260((long) arg2, (byte) 28);
        if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && var3.field3786.length > arg0) {
            return var3.field3786[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lkh;IZIIIB)V")
    public static final void method1104(class97 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, byte arg6) {
        class124.field2540 = arg0;
        field3479++;
        class102.field2185 = arg2;
        class91.field1951 = arg5;
        class138.field2854 = arg4;
        class74.field1683 = arg3;
        class58.field1371 = arg1;
        if (arg6 != 26) {
            field3489 = true;
        }
        class190.field3775 = 1;
    }
}
