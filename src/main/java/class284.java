import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class284 extends class46 {

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public static int field4501 = 0;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "[I")
    public static int[] field4506 = new int[32768];

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "I")
    public int field4508;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "Ljava/lang/String;")
    public String field4500;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "Ljava/lang/String;")
    public String field4507;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(I)Lw;")
    public final class146 method1907(int arg0) {
        ++field4503;
        return arg0 != 0 ? null : class58.field953[super.field654];
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZI)[B")
    public static final byte[] method1908(boolean arg0, int arg1) {
        ++field4502;
        class155 var2 = (class155) class198.field3120.method728((long) arg1, (byte) -117);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; ~var5 > -256; ++var5) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; ~var6 > -256; ++var6) {
                int var7 = 255 - var6;
                int var8 = class129.method896(var7, var4, !arg0);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[-var6 + 511] = var9;
            }
            var2 = new class155(var3);
            class198.field3120.method737((long) arg1, 0, var2);
        }
        return !arg0 ? null : var2.field2410;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIII)V")
    public static final void method1909(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4504;
        int var6 = arg3 - arg0;
        int var7 = arg5 - arg4;
        if (~var6 != -1) {
            if (var7 == 0) {
                class168.method1134(arg3, arg1, arg4, arg0, arg2 + -78);
            } else {
                if (var7 < 0) {
                    var7 = -var7;
                }
                if (var6 < 0) {
                    var6 = -var6;
                }
                boolean var8 = ~var6 > ~var7;
                if (var8) {
                    int var9 = arg0;
                    arg0 = arg4;
                    arg4 = var9;
                    int var10 = arg3;
                    arg3 = arg5;
                    arg5 = var10;
                }
                if (~arg3 > ~arg0) {
                    int var11 = arg4;
                    int var12 = arg0;
                    arg4 = arg5;
                    arg0 = arg3;
                    arg5 = var11;
                    arg3 = var12;
                }
                int var13 = -arg0 + arg3;
                int var14 = -arg4 + arg5;
                if (~var14 > arg2) {
                    var14 = -var14;
                }
                int var15 = -(var13 >> 1);
                int var16 = arg4;
                int var17 = arg5 > arg4 ? 1 : -1;
                if (var8) {
                    for (int var18 = arg0; ~arg3 <= ~var18; ++var18) {
                        var15 += var14;
                        class154.field2406[var18][var16] = arg1;
                        if (~var15 < -1) {
                            var16 += var17;
                            var15 -= var13;
                        }
                    }
                } else {
                    for (int var19 = arg0; ~var19 >= ~arg3; ++var19) {
                        var15 += var14;
                        class154.field2406[var16][var19] = arg1;
                        if (var15 > 0) {
                            var15 -= var13;
                            var16 += var17;
                        }
                    }
                }
            }
        } else {
            if (~var7 != -1) {
                class125.method872(true, arg0, arg1, arg4, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lre;I)Ljava/lang/String;")
    public static final String method1910(class228 arg0, int arg1) {
        ++field4509;
        if (client.method1059(arg0).method1828(-126) == arg1) {
            return null;
        } else if (arg0.field3607 != null && arg0.field3607.trim().length() != 0) {
            return arg0.field3607;
        } else {
            return class170.field2647 ? "Hidden-use" : null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method1911(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        ++field4505;
        if (arg6) {
            field4501 = 100;
        }
        class228 var7 = class31.method239(arg3, -1, arg5);
        if (var7 != null && var7.field3562 != null) {
            class116 var8 = new class116();
            var8.field1895 = var7.field3562;
            var8.field1892 = var7;
            class44.method322(var8, 200000);
        }
        class139.field2132 = arg3;
        class102.field1704 = arg5;
        class122.field1960 = true;
        class4.field31 = arg0;
        class170.field2644 = arg1;
        class258.field4123 = arg4;
        class248.field4020 = arg2;
        class82.method591(var7, arg6);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
    public static final void method1912(boolean arg0) {
        if (arg0) {
            class269.field4298 = class52.field798;
            class66.field1107 = class116.field1890;
        } else {
            class269.field4298 = class116.field1899;
            class66.field1107 = class5.field60;
        }
        class217.field3352 = class269.field4298.length;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(B)V")
    public static void method1913(byte arg0) {
        field4506 = null;
        if (arg0 != -91) {
            method1909(-8, 12, 66, 64, -105, 59);
        }
    }
}
