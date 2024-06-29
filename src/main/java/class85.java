import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class85 {

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public static int field1351 = 0;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "Lhd;")
    public static class117 field1348 = new class117(30);

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "Lok;")
    public static class146 field1355 = class235.method1724(-12908, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "[I")
    public static int[] field1353 = new int[2];

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "Z")
    public static boolean field1357 = false;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "[S")
    public static short[] field1358 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "Lok;")
    public static class146 field1356 = class235.method1724(-12908, "Veuillez patienter )2 tentative de r-Btablissement)3");

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "[[B")
    public static byte[][] field1352;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIIIII)V", line = 20)
    public static final void method592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1347++;
        if (arg0 == arg6) {
            class173.method1341(0, arg3, arg5, arg2, arg0, arg7, arg4);
            return;
        }
        if (class151.field2564 <= arg5 - arg0 && class126.field2058 >= arg0 + arg5 && class123.field2008 <= arg2 - arg6 && (arg2 + arg6) <= class318.field5394) {
            class70.method523(-22130, arg7, arg6, arg2, arg3, arg4, arg0, arg5);
        } else {
            class224.method1651(arg2, 256, arg7, arg5, arg6, arg4, arg3, arg0);
        }
        if (arg1 != 896) {
            field1356 = (class146) null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)Z", line = 44)
    public static final boolean method593(int arg0) {
        field1344++;
        if (class305.field5226) {
            try {
                return !(Boolean) class66.field1109.method1084(-91, class232.field3876.field2162);
            } catch (Throwable var2) {
            }
        }
        if (arg0 < 44) {
            method593(37);
        }
        return true;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BILoh;)[Lan;", line = 66)
    public static final class315[] method594(byte arg0, int arg1, class15 arg2) {
        field1350++;
        if (class52.method426(0, arg1, arg2)) {
            return arg0 > -78 ? (class315[]) null : class134.method991(false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILtd;)V", line = 106)
    public static final void method595(int arg0, class234 arg1) {
        field1346++;
        class206 var2 = (class206) class199.field3324.method810((byte) -95, arg1.field3891.method1123(-13726));
        if (var2 == null) {
            class62.method473((class282) null, class203.field3387, 0, arg1.field5419[0], 0, arg1.field5432[0], (class5) null, arg1);
        } else {
            var2.method1566(11279);
        }
        int var3 = 105 / ((arg0 + 42) / 62);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)V", line = 125)
    public static final void method596(int arg0, int arg1) {
        if (arg1 != 384) {
            field1357 = false;
        }
        class311.field5304.method794(-17435, arg0);
        field1349++;
        class13.field244.method794(-17435, arg0);
        class200.field3344.method794(arg1 - 17819, arg0);
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V", line = 140)
    public static void method597(int arg0) {
        field1358 = null;
        field1356 = null;
        field1348 = null;
        field1352 = (byte[][]) null;
        field1353 = null;
        field1355 = null;
        if (arg0 != 17666) {
            field1355 = (class146) null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIILbf;IJZ)Z", line = 154)
    public static final boolean method598(int arg0, int arg1, int arg2, int arg3, int arg4, class322 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class148.method1138(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIILbf;JLbf;Lbf;)V", line = 196)
    public static final void method599(int arg0, int arg1, int arg2, int arg3, class322 arg4, long arg5, class322 arg6, class322 arg7) {
        class241 var9 = new class241();
        var9.field4007 = arg4;
        var9.field4006 = arg1 * 128 + 64;
        var9.field4000 = arg2 * 128 + 64;
        var9.field4005 = arg3;
        var9.field4012 = arg5;
        var9.field4002 = arg6;
        var9.field4011 = arg7;
        int var10 = 0;
        class11 var11 = class203.field3382[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field218; var12++) {
                class311 var13 = var11.field217[var12];
                if ((var13.field5289 & 0x400000L) == 4194304L) {
                    int var14 = var13.field5300.method325();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field3999 = -var10;
        if (class203.field3382[arg0][arg1][arg2] == null) {
            class203.field3382[arg0][arg1][arg2] = new class11(arg0, arg1, arg2);
        }
        class203.field3382[arg0][arg1][arg2].field213 = var9;
    }
}
