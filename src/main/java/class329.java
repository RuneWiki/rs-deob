import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class329 {

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "Ljava/lang/String;")
    public static String field5228 = "Drop";

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field5238 = 0;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field5239 = 0;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "[I")
    public static int[] field5241 = new int[50];

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "[I")
    public static int[] field5243 = new int[5];

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "Lua;")
    public static class101 field5244 = new class101();

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    public static int field5245 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "Z")
    public static boolean field5247 = true;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public int field5230;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public int field5234;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public int field5237;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "Llg;")
    public static class137 field5242;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "Ljg;")
    public static class326 field5236;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)Z", line = 7)
    public final boolean method2280(int arg0) {
        if (arg0 != 0) {
            field5228 = (String) null;
        }
        field5240++;
        return (this.field5230 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)V", line = 19)
    public static final void method2281(int arg0, int arg1) {
        field5231++;
        if (arg1 == -1 || !class356.field5615[arg1]) {
            return;
        }
        class51.field803.method445(arg1, -61);
        if (class109.field1852[arg1] == null) {
            return;
        }
        if (arg0 != 1023) {
            field5236 = (class326) null;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class109.field1852[arg1].length; var3++) {
            if (class109.field1852[arg1][var3] != null) {
                if (class109.field1852[arg1][var3].field2490 == 2) {
                    var2 = false;
                } else {
                    class109.field1852[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class109.field1852[arg1] = null;
        }
        class356.field5615[arg1] = false;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V", line = 69)
    public static final void method2282(boolean arg0) {
        if (!arg0) {
            method2282(false);
        }
        int var1 = class215.field3613 * 128 + 64;
        field5235++;
        int var2 = class81.field1325 * 128 + 64;
        int var3 = class223.method1627((byte) -127, var1, var2, class205.field3497) - class78.field1261;
        if (class304.field4821 >= 100) {
            class269.field4309 = class81.field1325 * 128 + 64;
            class32.field454 = class215.field3613 * 128 + 64;
            class139.field2563 = class223.method1627((byte) -124, class32.field454, class269.field4309, class205.field3497) - class78.field1261;
        } else {
            if (var2 > class269.field4309) {
                class269.field4309 += (var2 - class269.field4309) * class304.field4821 / 1000 + class304.field4812;
                if (var2 < class269.field4309) {
                    class269.field4309 = var2;
                }
            }
            if (var1 > class32.field454) {
                class32.field454 += (var1 - class32.field454) * class304.field4821 / 1000 + class304.field4812;
                if (var1 < class32.field454) {
                    class32.field454 = var1;
                }
            }
            if (class32.field454 > var1) {
                class32.field454 -= (class32.field454 - var1) * class304.field4821 / 1000 + class304.field4812;
                if (class32.field454 < var1) {
                    class32.field454 = var1;
                }
            }
            if (class269.field4309 > var2) {
                class269.field4309 -= (class269.field4309 - var2) * class304.field4821 / 1000 + class304.field4812;
                if (var2 > class269.field4309) {
                    class269.field4309 = var2;
                }
            }
            if (class139.field2563 < var3) {
                class139.field2563 += (var3 - class139.field2563) * class304.field4821 / 1000 + class304.field4812;
                if (class139.field2563 > var3) {
                    class139.field2563 = var3;
                }
            }
            if (class139.field2563 > var3) {
                class139.field2563 -= (class139.field2563 - var3) * class304.field4821 / 1000 + class304.field4812;
                if (class139.field2563 < var3) {
                    class139.field2563 = var3;
                }
            }
        }
        int var4 = class248.field4028 * 128 + 64;
        int var5 = class168.field2930 * 128 + 64;
        int var6 = class223.method1627((byte) -123, var4, var5, class205.field3497) - class349.field5544;
        int var7 = var6 - class139.field2563;
        int var8 = var5 - class269.field4309;
        int var9 = var4 - class32.field454;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + (var9 * var9)));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (Math.atan2((double) var8, (double) var9) * -325.949D) & 0x7FF;
        if (class141.field2592 < var11) {
            class141.field2592 += (var11 - class141.field2592) * class286.field4550 / 1000 + class303.field4789;
            if (class141.field2592 > var11) {
                class141.field2592 = var11;
            }
        }
        if (class141.field2592 > var11) {
            class141.field2592 -= (class141.field2592 - var11) * class286.field4550 / 1000 + class303.field4789;
            if (var11 > class141.field2592) {
                class141.field2592 = var11;
            }
        }
        int var13 = var12 - class311.field4924;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class311.field4924 += class286.field4550 * var13 / 1000 + class303.field4789;
            class311.field4924 &= 0x7FF;
        }
        if (var13 < 0) {
            class311.field4924 -= -var13 * class286.field4550 / 1000 + class303.field4789;
            class311.field4924 &= 0x7FF;
        }
        int var14 = var12 - class311.field4924;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class311.field4924 = var12;
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V", line = 246)
    public static void method2283(int arg0) {
        field5241 = null;
        field5242 = null;
        field5244 = null;
        field5228 = null;
        field5236 = null;
        field5243 = null;
        if (arg0 != 0) {
            field5243 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)Z", line = 273)
    public final boolean method2284(int arg0) {
        field5233++;
        if (arg0 != -1) {
            this.method2284(94);
        }
        return (this.field5230 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)Z", line = 284)
    public final boolean method2285(int arg0) {
        field5246++;
        if (arg0 != 0) {
            method2281(16, -65);
        }
        return (this.field5230 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)V", line = 301)
    public static final void method2286(int arg0, int arg1) {
        class259.field4198.method469(-11815, arg0);
        if (arg1 != -16088) {
            method2281(105, -108);
        }
        field5229++;
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)Z", line = 313)
    public final boolean method2287(int arg0) {
        int var2 = -1 / ((-arg0 - 65) / 51);
        field5232++;
        return (this.field5230 & 0x4) != 0;
    }
}
