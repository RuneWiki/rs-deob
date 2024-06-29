import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public abstract class class175 {

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field3019 = 0;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field3021 = 0;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Lbe;")
    public static class283 field3020 = class153.method941(-69, "rect_debug=");

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field3023 = -1;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "Lek;")
    public static class172 field3022;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "Z")
    public static boolean field3016;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V", line = 8)
    public static final void method1153(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field3018++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class42.field589 - 1); var2++) {
                if (class110.field1868[var2] < 1000 && class110.field1868[var2 + 1] > 1000) {
                    class283 var3 = class216.field3656[var2];
                    var1 = false;
                    class216.field3656[var2] = class216.field3656[var2 + 1];
                    class216.field3656[var2 + 1] = var3;
                    class283 var4 = class103.field1752[var2];
                    class103.field1752[var2] = class103.field1752[var2 + 1];
                    class103.field1752[var2 + 1] = var4;
                    int var5 = class135.field2257[var2];
                    class135.field2257[var2] = class135.field2257[var2 + 1];
                    class135.field2257[var2 + 1] = var5;
                    int var6 = class215.field3647[var2];
                    class215.field3647[var2] = class215.field3647[var2 + 1];
                    class215.field3647[var2 + 1] = var6;
                    short var7 = class110.field1868[var2];
                    class110.field1868[var2] = class110.field1868[var2 + 1];
                    class110.field1868[var2 + 1] = var7;
                    long var8 = class76.field1320[var2];
                    class76.field1320[var2] = class76.field1320[var2 + 1];
                    class76.field1320[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V", line = 81)
    public static void method1154(int arg0) {
        if (arg0 == 0) {
            field3022 = null;
            field3020 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIBII)V", line = 92)
    public static final void method1155(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field3017++;
        class119.method762(arg2, 123);
        int var7 = 0;
        int var8 = arg2;
        int var9 = arg2 - arg3;
        if (arg4 != -107) {
            method1155(42, 21, 56, 75, (byte) -91, -57, 52);
        }
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = -arg2;
        int var11 = var9;
        int var12 = -var9;
        int var13 = -1;
        if (class217.field3677 <= arg0 && arg0 <= class247.field4220) {
            int[] var14 = class97.field1636[arg0];
            int var15 = class44.method263(class166.field2765, arg1 - arg2, (byte) -123, class269.field4551);
            int var16 = class44.method263(class166.field2765, arg1 + arg2, (byte) -120, class269.field4551);
            int var17 = class44.method263(class166.field2765, arg1 - var9, (byte) -59, class269.field4551);
            int var18 = class44.method263(class166.field2765, arg1 + var9, (byte) -99, class269.field4551);
            class114.method742(arg4 + 30304, var15, var14, var17, arg6);
            class114.method742(30197, var17, var14, var18, arg5);
            class114.method742(30197, var18, var14, var16, arg6);
        }
        int var19 = -1;
        while (var8 > var7) {
            var19 += 2;
            var10 += var19;
            var13 += 2;
            var12 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class79.field1367[var11] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var8--;
                int var20 = arg0 - var8;
                var10 -= var8 << 1;
                int var21 = arg0 + var8;
                if (var21 >= class217.field3677 && class247.field4220 >= var20) {
                    if (var8 >= var9) {
                        int var22 = class44.method263(class166.field2765, arg1 + var7, (byte) -120, class269.field4551);
                        int var23 = class44.method263(class166.field2765, arg1 - var7, (byte) -47, class269.field4551);
                        if (class247.field4220 >= var21) {
                            class114.method742(arg4 ^ 0xFFFF8A60, var23, class97.field1636[var21], var22, arg6);
                        }
                        if (class217.field3677 <= var20) {
                            class114.method742(arg4 + 30304, var23, class97.field1636[var20], var22, arg6);
                        }
                    } else {
                        int var24 = class79.field1367[var8];
                        int var25 = class44.method263(class166.field2765, arg1 + var7, (byte) -46, class269.field4551);
                        int var26 = class44.method263(class166.field2765, arg1 - var7, (byte) -43, class269.field4551);
                        int var27 = class44.method263(class166.field2765, arg1 + var24, (byte) -41, class269.field4551);
                        int var28 = class44.method263(class166.field2765, arg1 - var24, (byte) -89, class269.field4551);
                        if (class247.field4220 >= var21) {
                            int[] var29 = class97.field1636[var21];
                            class114.method742(30197, var26, var29, var28, arg6);
                            class114.method742(30197, var28, var29, var27, arg5);
                            class114.method742(30197, var27, var29, var25, arg6);
                        }
                        if (var20 >= class217.field3677) {
                            int[] var30 = class97.field1636[var20];
                            class114.method742(arg4 ^ 0xFFFF8A60, var26, var30, var28, arg6);
                            class114.method742(30197, var28, var30, var27, arg5);
                            class114.method742(30197, var27, var30, var25, arg6);
                        }
                    }
                }
            }
            int var31 = arg0 - var7;
            int var32 = arg0 + var7;
            if (class217.field3677 <= var32 && var31 <= class247.field4220) {
                int var33 = arg1 + var8;
                int var34 = arg1 - var8;
                if (var33 >= class269.field4551 && var34 <= class166.field2765) {
                    int var35 = class44.method263(class166.field2765, var33, (byte) -63, class269.field4551);
                    int var36 = class44.method263(class166.field2765, var34, (byte) -47, class269.field4551);
                    if (var7 < var9) {
                        int var37 = var7 > var11 ? class79.field1367[var7] : var11;
                        int var38 = class44.method263(class166.field2765, arg1 + var37, (byte) -113, class269.field4551);
                        int var39 = class44.method263(class166.field2765, arg1 - var37, (byte) -49, class269.field4551);
                        if (class247.field4220 >= var32) {
                            int[] var40 = class97.field1636[var32];
                            class114.method742(arg4 + 30304, var36, var40, var39, arg6);
                            class114.method742(30197, var39, var40, var38, arg5);
                            class114.method742(30197, var38, var40, var35, arg6);
                        }
                        if (class217.field3677 <= var31) {
                            int[] var41 = class97.field1636[var31];
                            class114.method742(arg4 ^ 0xFFFF8A60, var36, var41, var39, arg6);
                            class114.method742(30197, var39, var41, var38, arg5);
                            class114.method742(30197, var38, var41, var35, arg6);
                        }
                    } else {
                        if (var32 <= class247.field4220) {
                            class114.method742(30197, var36, class97.field1636[var32], var35, arg6);
                        }
                        if (var31 >= class217.field3677) {
                            class114.method742(30197, var36, class97.field1636[var31], var35, arg6);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B[B)V")
    public abstract void method1156(byte arg0, byte[] arg1);

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)[B")
    public abstract byte[] method1157(byte arg0);
}
