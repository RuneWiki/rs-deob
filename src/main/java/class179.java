import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public abstract class class179 extends class98 {

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "Lmb;")
    public static class96 field3090 = class243.method1708("Schrifts-=tze geladen)3", (byte) 126);

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "Lmb;")
    public static class96 field3088 = class243.method1708("null", (byte) 104);

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
    public static int field3093 = -1;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "Lce;")
    public static class111 field3094;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
    public static final void method1272(int arg0) {
        field3089++;
        int var1 = class42.field712 * 128 + 64;
        int var2 = class110.field2030 * 128 + 64;
        int var3 = class137.method1025(class216.field3712, var2, var1, (byte) -94) - class93.field1541;
        if (class225.field3830 >= 100) {
            class22.field389 = class110.field2030 * 128 + 64;
            class178.field3078 = class42.field712 * 128 + 64;
            class105.field1767 = class137.method1025(class216.field3712, class22.field389, class178.field3078, (byte) -94) - class93.field1541;
        } else {
            if (var3 > class105.field1767) {
                class105.field1767 += (var3 - class105.field1767) * class225.field3830 / 1000 + class256.field4458;
                if (var3 < class105.field1767) {
                    class105.field1767 = var3;
                }
            }
            if (var1 > class178.field3078) {
                class178.field3078 += (var1 - class178.field3078) * class225.field3830 / 1000 + class256.field4458;
                if (class178.field3078 > var1) {
                    class178.field3078 = var1;
                }
            }
            if (var2 > class22.field389) {
                class22.field389 += (var2 - class22.field389) * class225.field3830 / 1000 + class256.field4458;
                if (class22.field389 > var2) {
                    class22.field389 = var2;
                }
            }
            if (var1 < class178.field3078) {
                class178.field3078 -= (class178.field3078 - var1) * class225.field3830 / 1000 + class256.field4458;
                if (var1 > class178.field3078) {
                    class178.field3078 = var1;
                }
            }
            if (var3 < class105.field1767) {
                class105.field1767 -= (class105.field1767 - var3) * class225.field3830 / 1000 + class256.field4458;
                if (class105.field1767 < var3) {
                    class105.field1767 = var3;
                }
            }
            if (class22.field389 > var2) {
                class22.field389 -= (class22.field389 - var2) * class225.field3830 / 1000 + class256.field4458;
                if (var2 > class22.field389) {
                    class22.field389 = var2;
                }
            }
        }
        int var4 = class200.field3467 * 128 + 64;
        int var5 = class49.field865 * 128 + 64;
        int var6 = class137.method1025(class216.field3712, var5, var4, (byte) -94) - class249.field4315;
        int var7 = var4 - class178.field3078;
        int var8 = var6 - class105.field1767;
        int var9 = var5 - class22.field389;
        if (arg0 < 19) {
            return;
        }
        int var10 = (int) Math.sqrt((double) (var7 * var7 + (var9 * var9)));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (-325.949D * Math.atan2((double) var7, (double) var9)) & 0x7FF;
        int var13 = var12 - class23.field392;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var11 < 128) {
            var11 = 128;
        }
        if (var13 > 0) {
            class23.field392 += class268.field4665 * var13 / 1000 + class9.field155;
            class23.field392 &= 0x7FF;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (class140.field2501 < var11) {
            class140.field2501 += (var11 - class140.field2501) * class268.field4665 / 1000 + class9.field155;
            if (var11 < class140.field2501) {
                class140.field2501 = var11;
            }
        }
        if (class140.field2501 > var11) {
            class140.field2501 -= (class140.field2501 - var11) * class268.field4665 / 1000 + class9.field155;
            if (var11 > class140.field2501) {
                class140.field2501 = var11;
            }
        }
        if (var13 < 0) {
            class23.field392 -= -var13 * class268.field4665 / 1000 + class9.field155;
            class23.field392 &= 0x7FF;
        }
        int var14 = var12 - class23.field392;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class23.field392 = var12;
        }
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(B)Z")
    public abstract boolean method411(byte arg0);

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method413(byte arg0);

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V")
    public static void method1273(int arg0) {
        field3094 = null;
        field3090 = null;
        field3088 = null;
        if (arg0 != 22739) {
            method1273(8);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII[Lsi;IIIZ[BB)V")
    public static final void method1274(int arg0, int arg1, int arg2, int arg3, class207[] arg4, int arg5, int arg6, int arg7, boolean arg8, byte[] arg9, byte arg10) {
        if (arg10 < 1) {
            return;
        }
        field3092++;
        class239 var11 = new class239(arg9);
        int var12 = -1;
        while (true) {
            int var13 = var11.method1616((byte) -66);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method1666(24348);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var11.method1651(4139);
                int var20 = var19 & 0x3;
                int var21 = var19 >> 2;
                if (arg7 == var18 && var17 >= arg1 && (arg1 + 8) > var17 && arg5 <= var16 && (arg5 + 8) > var16) {
                    class196 var22 = class132.method995(var12, 0);
                    int var23 = arg3 + class138.method1027(arg6, var22.field3388, var17 & 0x7, var16 & 0x7, var22.field3415, var20, (byte) -65);
                    int var24 = class197.method1379(var22.field3415, var20, var17 & 0x7, var16 & 0x7, 7, arg6, var22.field3388) + arg0;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class207 var25 = null;
                        if (!arg8) {
                            int var26 = arg2;
                            if ((class132.field2376[1][var23][var24] & 0x2) == 2) {
                                var26 = arg2 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg4[var26];
                            }
                        }
                        class121.method929(arg8, 4, arg2, arg6 + var20 & 0x3, arg2, var12, var25, var23, !arg8, var24, var21);
                    }
                }
            }
        }
    }
}
