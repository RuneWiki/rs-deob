import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class221 {

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field3455 = 20;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "Lta;")
    public static class262 field3457 = new class262(64);

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "Z")
    public static boolean field3462 = true;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "Luf;")
    public static class176 field3459;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "Luf;")
    public static class176 field3461;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "[I")
    public static int[] field3454;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "[I")
    public static int[] field3456;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static final void method1479(int arg0) {
        field3463++;
        class5.field88.method1782(106);
        if (arg0 >= -21) {
            method1481(64);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method1480(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class113.field1777 * 128) {
            arg0 = class113.field1777 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class191.field3032 * 128) {
            arg2 = class191.field3032 * 128 - 1;
        }
        class84.field1385 = class97.field1557[arg3];
        class127.field1993 = class97.field1556[arg3];
        class224.field3526 = class97.field1557[arg4];
        class75.field1257 = class97.field1556[arg4];
        class102.field1630 = arg0;
        class58.field894 = arg1;
        class239.field3713 = arg2;
        class117.field1818 = arg0 / 128;
        class195.field3076 = arg2 / 128;
        class19.field297 = class117.field1818 - class227.field3557;
        if (class19.field297 < 0) {
            class19.field297 = 0;
        }
        class202.field3161 = class195.field3076 - class227.field3557;
        if (class202.field3161 < 0) {
            class202.field3161 = 0;
        }
        class41.field670 = class227.field3557 + class117.field1818;
        if (class41.field670 > class113.field1777) {
            class41.field670 = class113.field1777;
        }
        class47.field780 = class227.field3557 + class195.field3076;
        if (class47.field780 > class191.field3032) {
            class47.field780 = class191.field3032;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class227.field3557 + class227.field3557 + 2; var16++) {
            for (int var19 = 0; var19 < class227.field3557 + class227.field3557 + 2; var19++) {
                int var20 = (var16 - class227.field3557 << 7) - (class102.field1630 & 0x7F);
                int var21 = (var19 - class227.field3557 << 7) - (class239.field3713 & 0x7F);
                int var22 = class117.field1818 + var16 - class227.field3557;
                int var23 = class195.field3076 + var19 - class227.field3557;
                if (var22 >= 0 && var23 >= 0 && var22 < class113.field1777 && var23 < class191.field3032) {
                    int var24;
                    if (class118.field1825 == null) {
                        var24 = class214.field3307[0][var22][var23] + 128 - class58.field894;
                    } else {
                        var24 = class118.field1825[0][var22][var23] + 128 - class58.field894;
                    }
                    int var25 = class214.field3307[3][var22][var23] - class58.field894 - 1000;
                    class176.field2648[var16][var19] = class153.method1027(var20, var25, var24, var21, var15);
                } else {
                    class176.field2648[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class227.field3557 + class227.field3557 + 1; var17++) {
            for (int var18 = 0; var18 < class227.field3557 + class227.field3557 + 1; var18++) {
                class256.field3918[var17][var18] = class176.field2648[var17][var18] || class176.field2648[var17 + 1][var18] || class176.field2648[var17][var18 + 1] || class176.field2648[var17 + 1][var18 + 1];
            }
        }
        class215.field3318 = arg6;
        class205.field3185 = arg7;
        class119.field1834 = arg8;
        class280.field4381 = arg9;
        class266.field4251 = arg10;
        class202.method1354();
        if (class88.field1439 != null) {
            class19.method169(true);
            class75.method598(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class19.method169(false);
        }
        class75.method598(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
    public static void method1481(int arg0) {
        field3456 = null;
        field3459 = null;
        field3457 = null;
        field3454 = null;
        field3461 = null;
        int var1 = 74 / ((arg0 - 52) / 41);
    }
}
