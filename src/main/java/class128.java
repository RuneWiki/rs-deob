import java.net.URL;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class128 extends class320 {

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2220 = new CRC32();

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
    public static int field2224 = 0;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "J")
    public long field2214;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "Lnh;")
    public class128 field2213;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "Lnh;")
    public class128 field2215;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "[Lli;")
    public static class241[] field2222;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)Z", line = 6)
    public final boolean method1065(boolean arg0) {
        field2217++;
        if (arg0) {
            return this.field2213 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BIIZZ)V", line = 21)
    public static final void method1066(byte arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        field2223++;
        class198.method1496(arg1, class212.field3573.length - 1, 0, arg2, arg3, (byte) -105, arg4);
        int var5 = -85 / ((-arg0 - 34) / 47);
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V", line = 32)
    public final void method1067(int arg0) {
        field2221++;
        if (this.field2213 == null) {
            return;
        }
        this.field2213.field2215 = this.field2215;
        this.field2215.field2213 = this.field2213;
        if (arg0 != 40000) {
            method1068(false, (String) null, true);
        }
        this.field2215 = null;
        this.field2213 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZLjava/lang/String;Z)V", line = 49)
    public static final void method1068(boolean arg0, String arg1, boolean arg2) {
        field2218++;
        if (arg2) {
            method1069(-63, -60);
        }
        if (!arg0) {
            try {
                class251.method1754("loggedout", (byte) -104, class85.field1369.field910);
            } catch (Throwable var9) {
            }
            try {
                class53.field828.getAppletContext().showDocument(new URL(class53.field828.getCodeBase(), arg1), "_top");
            } catch (Exception var8) {
            }
            return;
        }
        if (class43.field680 && class90.field1429) {
            try {
                class251.method1755(class85.field1369.field910, "openjs", new Object[] { (new URL(class53.field828.getCodeBase(), arg1)).toString() }, (byte) -108);
                return;
            } catch (Throwable var10) {
            }
        }
        try {
            class53.field828.getAppletContext().showDocument(new URL(class53.field828.getCodeBase(), arg1), "_blank");
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)I", line = 101)
    public static final int method1069(int arg0, int arg1) {
        field2216++;
        int var2 = 91 % ((60 - arg1) / 34);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)Z", line = 118)
    public static final boolean method1070(int arg0, int arg1) {
        field2212++;
        class20 var2 = class18.method186(2, arg1);
        if (var2 == null) {
            return false;
        } else if (arg0 > -121) {
            return true;
        } else if (class59.field915 == 1 || class59.field915 == 2 || class246.field3988 == 2) {
            class120.field2082 = var2.field306;
            class64.field1004 = var2.field313;
            if (class246.field3988 != 0) {
                class140.field2566 = class120.field2082 + 50000;
                class184.field3122 = class120.field2082 + 40000;
                class86.field1377 = class184.field3122;
            }
            return true;
        } else {
            String var3 = "";
            String var4 = "";
            if (class256.field4125 != null) {
                var4 = "/p=" + class256.field4125;
            }
            if (class246.field3988 != 0) {
                var3 = ":" + (var2.field306 + 7000);
            }
            String var5 = "http://" + var2.field313 + var3 + "/l=" + class5.field67 + "/a=" + class201.field3433 + var4 + "/j" + (class265.field4275 ? "1" : "0") + ",o" + (class221.field3690 ? "1" : "0") + ",a2,m" + (class255.field4109 ? "1" : "0");
            try {
                class158.field2789.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIZIIIIIII)V", line = 167)
    public static final void method1071(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (!arg2) {
            method1069(-43, 85);
        }
        field2219++;
        if (arg3 == arg5 && arg4 == arg6 && arg0 == arg1 && arg8 == arg9) {
            class176.method1363(arg8, arg7, arg0, arg5, arg4, 22608);
            return;
        }
        int var10 = arg4;
        int var11 = arg5;
        int var12 = arg5 * 3;
        int var13 = arg4 * 3;
        int var14 = arg3 * 3;
        int var15 = arg6 * 3;
        int var16 = arg1 * 3;
        int var17 = arg9 * 3;
        int var18 = arg0 + var14 - arg5 - var16;
        int var19 = var16 + var12 - var14 - var14;
        int var20 = var17 - var15 - (-var13 + var15);
        int var21 = arg8 + var15 - var17 - arg4;
        int var22 = var14 - var12;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var21 * var26;
            int var28 = var18 * var26;
            int var29 = var19 * var25;
            int var30 = var22 * var24;
            int var31 = var23 * var24;
            int var32 = var20 * var25;
            int var33 = arg5 + (var28 + var29 + var30 >> 12);
            int var34 = (var27 + var31 + var32 >> 12) + arg4;
            class176.method1363(var34, arg7, var33, var11, var10, 22608);
            var11 = var33;
            var10 = var34;
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(Z)V", line = 251)
    public static void method1072(boolean arg0) {
        field2220 = null;
        field2222 = null;
        if (arg0) {
            field2222 = (class241[]) null;
        }
    }
}
