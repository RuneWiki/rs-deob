import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class153 extends class136 {

    @OriginalMember(owner = "client!dfa", name = "m", descriptor = "I")
    public int field2408 = -1;

    @OriginalMember(owner = "client!dfa", name = "o", descriptor = "I")
    public int field2410 = -1;

    @OriginalMember(owner = "client!dfa", name = "q", descriptor = "Lgba;")
    public static class625 field2412 = null;

    @OriginalMember(owner = "client!dfa", name = "r", descriptor = "[Ljava/awt/Color;")
    public static Color[] field2413 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!dfa", name = "k", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!dfa", name = "l", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!dfa", name = "n", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!dfa", name = "p", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!dfa", name = "s", descriptor = "I")
    public int field2414;

    @OriginalMember(owner = "client!dfa", name = "t", descriptor = "I")
    public int field2415;

    @OriginalMember(owner = "client!dfa", name = "u", descriptor = "I")
    public int field2416;

    @OriginalMember(owner = "client!dfa", name = "v", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!dfa", name = "w", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!dfa", name = "y", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!dfa", name = "z", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!dfa", name = "A", descriptor = "I")
    public int field2422;

    @OriginalMember(owner = "client!dfa", name = "x", descriptor = "[Lxa;")
    public static class468[] field2419;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(BLoa;)Lpe;", line = 8)
    public final class571 method145(byte arg0, class651 arg1) {
        ++field2418;
        class397 var3 = arg1.method455();
        var3.method576(super.field2211, super.field2218 + -10, super.field2215);
        class571 var4 = class157.method1100((byte) -101, 3);
        if (~this.field2408 != 0) {
            class358 var5 = class193.field2826.method1047(this.field2408, -1).method3165((class435) null, arg1, 0, 2048, (class616) null, this.field2415, -1, (byte) -119, 0);
            if (var5 != null) {
                var5.method1947(var3, var4.field7581[2], 0);
            }
        }
        if (~this.field2410 != 0) {
            class358 var6 = class193.field2826.method1047(this.field2410, -1).method3165((class435) null, arg1, 0, 2048, (class616) null, this.field2422, -1, (byte) -101, 0);
            if (var6 != null) {
                var6.method1947(var3, var4.field7581[1], 0);
            }
        }
        class358 var7 = class193.field2826.method1047(this.field2416, arg0 ^ -125).method3165((class435) null, arg1, 0, 2048, (class616) null, this.field2414, -1, (byte) -112, 0);
        if (arg0 != 124) {
            method1078(42, -64);
        }
        if (var7 != null) {
            var7.method1947(var3, var4.field7581[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(BILoa;I)Z", line = 51)
    public final boolean method149(byte arg0, int arg1, class651 arg2, int arg3) {
        ++field2409;
        class397 var5 = arg2.method455();
        var5.method576(super.field2211, super.field2218, super.field2215);
        class358 var6 = class193.field2826.method1047(this.field2416, -1).method3165((class435) null, arg2, 0, 131072, (class616) null, this.field2414, -1, (byte) -121, 0);
        if (var6 != null && var6.method1931(arg3, arg1, var5, true)) {
            return true;
        } else {
            if (this.field2410 != -1) {
                class358 var7 = class193.field2826.method1047(this.field2410, -1).method3165((class435) null, arg2, 0, 131072, (class616) null, this.field2422, -1, (byte) -122, 0);
                if (var7 != null && var7.method1931(arg3, arg1, var5, true)) {
                    return true;
                }
            }
            int var8 = 112 % ((arg0 - -26) / 38);
            if (this.field2408 != -1) {
                class358 var9 = class193.field2826.method1047(this.field2408, -1).method3165((class435) null, arg2, 0, 131072, (class616) null, this.field2415, -1, (byte) -124, 0);
                if (var9 != null && var9.method1931(arg3, arg1, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "(I)V", line = 89)
    public static final void method1075(int arg0) {
        ++field2417;
        class409.field5528 = 0;
        int var1 = class439.field6039.method2034(255);
        boolean var2 = class439.field6039.method2028(true) == 1;
        int var3 = class439.field6039.method2001((byte) -83);
        int var4 = class439.field6039.method2001((byte) -83);
        class508.method2817(-19);
        class178.method1197((byte) 68, var1);
        int var5 = (-class439.field6039.field4619 + class269.field3754) / 16;
        class559.field7419 = new int[var5][4];
        for (int var6 = 0; var5 > var6; ++var6) {
            for (int var10 = 0; var10 < 4; ++var10) {
                class559.field7419[var6][var10] = class439.field6039.method2045(-98);
            }
        }
        class120.field2025 = new int[var5];
        class204.field2954 = null;
        class502.field6717 = new byte[var5][];
        class376.field5072 = new int[var5];
        class91.field1386 = null;
        class63.field965 = new byte[var5][];
        class373.field5046 = new int[var5];
        class214.field3061 = new byte[var5][];
        class426.field5860 = new byte[var5][];
        class3.field40 = new int[var5];
        class454.field6186 = new int[var5];
        int var7 = 0;
        if (arg0 > -110) {
            method1075(-121);
        }
        for (int var8 = (-(class34.field530 >> 4) + var4) / 8; ~var8 >= ~(((class34.field530 >> 4) + var4) / 8); ++var8) {
            for (int var9 = (var3 - (class34.field531 >> 4)) / 8; var9 <= ((class34.field531 >> 4) + var3) / 8; ++var9) {
                class376.field5072[var7] = (var8 << 8) + var9;
                class373.field5046[var7] = class243.field3403.method2523("m" + var8 + "_" + var9, (byte) 101);
                class120.field2025[var7] = class243.field3403.method2523("l" + var8 + "_" + var9, (byte) 120);
                class3.field40[var7] = class243.field3403.method2523("um" + var8 + "_" + var9, (byte) 50);
                class454.field6186[var7] = class243.field3403.method2523("ul" + var8 + "_" + var9, (byte) 77);
                ++var7;
            }
        }
        class659.method3691(11, var3, 512, var4, var2);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Loa;Z)V", line = 170)
    public final void method147(class651 arg0, boolean arg1) {
        if (arg1) {
            ++field2420;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "(I)V", line = 185)
    public static void method1076(int arg0) {
        field2412 = null;
        field2413 = null;
        field2419 = null;
        if (arg0 <= 124) {
            field2412 = null;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZI)Lqf;", line = 197)
    public static final class639 method1077(boolean arg0, int arg1) {
        ++field2421;
        if (!arg0) {
            field2419 = null;
        }
        return new class639(arg1, false);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ILoa;)Ldd;", line = 222)
    public final class660 method143(int arg0, class651 arg1) {
        if (arg0 != 31358) {
            return null;
        } else {
            ++field2411;
            return null;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(II)Lgba;", line = 235)
    public static final class625 method1078(int arg0, int arg1) {
        ++field2406;
        int var2 = arg1 >> 16;
        int var3 = arg1 & arg0;
        if (class601.field7977[var2] == null || class601.field7977[var2][var3] == null) {
            boolean var4 = class269.method1639(var2, 0);
            if (!var4) {
                return null;
            }
        }
        return class601.field7977[var2][var3];
    }
}
