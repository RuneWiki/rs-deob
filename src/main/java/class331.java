import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class331 extends class525 implements class253 {

    @OriginalMember(owner = "client!so", name = "n", descriptor = "I")
    private int field4959;

    @OriginalMember(owner = "client!so", name = "r", descriptor = "[[I")
    public static int[][] field4963 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!so", name = "u", descriptor = "[[Z")
    public static boolean[][] field4966 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!so", name = "o", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!so", name = "p", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!so", name = "q", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!so", name = "s", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!so", name = "t", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!so", name = "v", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!so", name = "w", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!so", name = "x", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!so", name = "y", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIIIIB)V", line = 5)
    public static final void method2095(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (arg7 == 16) {
            ++field4968;
            int var8 = arg3 + arg6;
            int var9 = arg5 - arg3;
            for (int var10 = arg6; ~var10 > ~var8; ++var10) {
                class359.method2255((byte) -70, class416.field6200[var10], arg0, arg4, arg2);
            }
            for (int var11 = arg5; var9 < var11; --var11) {
                class359.method2255((byte) -118, class416.field6200[var11], arg0, arg4, arg2);
            }
            int var12 = arg3 + arg4;
            int var13 = -arg3 + arg0;
            for (int var14 = var8; ~var14 >= ~var9; ++var14) {
                int[] var15 = class416.field6200[var14];
                class359.method2255((byte) -92, var15, var12, arg4, arg2);
                class359.method2255((byte) -123, var15, var13, var12, arg1);
                class359.method2255((byte) -104, var15, arg0, var13, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(BI)V", line = 50)
    public static final void method2096(byte arg0, int arg1) {
        class46.field595 = arg1;
        ++field4969;
        class100.field1426.method93((byte) 105);
        if (arg0 > -38) {
            method2096((byte) 74, -38);
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(I)J", line = 63)
    public final long method784(int arg0) {
        if (arg0 != 17555) {
            this.field4959 = 17;
        }
        ++field4964;
        return 0L;
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(Z)V", line = 74)
    public static final void method2097(boolean arg0) {
        ++field4962;
        class238.field3819.method1756(-67);
        int var1 = class238.field3819.method1760(8, true);
        if (~var1 > ~class167.field2471) {
            for (int var2 = var1; class167.field2471 > var2; ++var2) {
                class274.field4189[class185.field2806++] = class470.field6797[var2];
            }
        }
        if (~var1 < ~class167.field2471) {
            throw new RuntimeException("gnpov1");
        } else {
            class167.field2471 = 0;
            for (int var3 = 0; ~var3 > ~var1; ++var3) {
                int var4 = class470.field6797[var3];
                class116 var5 = class153.field2265[var4];
                int var6 = class238.field3819.method1760(1, true);
                if (var6 == 0) {
                    class470.field6797[class167.field2471++] = var4;
                    var5.field1882 = class475.field6854;
                } else {
                    int var7 = class238.field3819.method1760(2, true);
                    if (~var7 == -1) {
                        class470.field6797[class167.field2471++] = var4;
                        var5.field1882 = class475.field6854;
                        class10.field140[class121.field1827++] = var4;
                    } else if (var7 == 1) {
                        class470.field6797[class167.field2471++] = var4;
                        var5.field1882 = class475.field6854;
                        int var8 = class238.field3819.method1760(3, !arg0);
                        var5.method886(var8, 1, 96);
                        int var9 = class238.field3819.method1760(1, true);
                        if (~var9 == -2) {
                            class10.field140[class121.field1827++] = var4;
                        }
                    } else if (var7 == 2) {
                        class470.field6797[class167.field2471++] = var4;
                        var5.field1882 = class475.field6854;
                        if (~class238.field3819.method1760(1, !arg0) != -2) {
                            int var10 = class238.field3819.method1760(3, true);
                            var5.method886(var10, 0, 123);
                        } else {
                            int var11 = class238.field3819.method1760(3, !arg0);
                            var5.method886(var11, 2, 115);
                            int var12 = class238.field3819.method1760(3, true);
                            var5.method886(var12, 2, 104);
                        }
                        int var13 = class238.field3819.method1760(1, !arg0);
                        if (~var13 == -2) {
                            class10.field140[class121.field1827++] = var4;
                        }
                    } else if (var7 == 3) {
                        class274.field4189[class185.field2806++] = var4;
                    }
                }
            }
            if (arg0) {
                field4966 = null;
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "c", descriptor = "(I)V", line = 186)
    public final void method160(int arg0) {
        ++field4961;
        if (arg0 == -20485) {
            super.field7681.method1255((byte) 96, this);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)I", line = 197)
    public final int method782(int arg0) {
        ++field4965;
        if (arg0 != -10485) {
            field4963 = null;
        }
        return this.field4959;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "([BIIZ)V", line = 210)
    public final void method781(byte[] arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            ++field4967;
            this.method3116(arg0, -115, arg1);
            this.field4959 = arg2;
        }
    }

    @OriginalMember(owner = "client!so", name = "e", descriptor = "(I)V", line = 222)
    public static final void method2098(int arg0) {
        ++field4970;
        if (arg0 == 3) {
            class508.field7444.method88(93);
        }
    }

    @OriginalMember(owner = "client!so", name = "c", descriptor = "(Z)V", line = 238)
    public static void method2099(boolean arg0) {
        if (arg0) {
            field4963 = null;
        }
        field4966 = null;
        field4963 = null;
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lkd;I[BIZ)V", line = 249)
    public class331(class188 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field4959 = arg1;
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lkd;ILjaggl/memory/NativeBuffer;IZ)V", line = 262)
    public class331(class188 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field4959 = arg1;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)I", line = 271)
    public final int method780(boolean arg0) {
        if (!arg0) {
            return -102;
        } else {
            ++field4960;
            return super.field7679;
        }
    }
}
