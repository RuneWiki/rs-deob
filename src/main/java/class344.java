import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class344 {

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "Ltg;")
    public static class605 field5093 = new class605();

    @OriginalMember(owner = "client!daa", name = "e", descriptor = "I")
    public static int field5097 = 0;

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)V")
    public static final void method2205(int arg0) {
        for (int var1 = 0; var1 < class19.field199; var1++) {
            class666.field9463[var1] = null;
        }
        field5094++;
        class19.field199 = 0;
        for (int var2 = 0; var2 < class386.field5782; var2++) {
            for (int var42 = 0; var42 < class42.field727; var42++) {
                for (int var43 = 0; var43 < class54.field870; var43++) {
                    class114 var44 = class488.field7062[var2][var43][var42];
                    if (var44 != null) {
                        if (var44.field1773 > 0) {
                            var44.field1773 = (short) (var44.field1773 * -1);
                        }
                        if (var44.field1765 > 0) {
                            var44.field1765 = (short) (var44.field1765 * -1);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < class386.field5782; var3++) {
            for (int var4 = 0; var4 < class42.field727; var4++) {
                for (int var5 = 0; var5 < class54.field870; var5++) {
                    class114 var6 = class488.field7062[var3][var5][var4];
                    if (var6 != null) {
                        boolean var7 = class488.field7062[0][var5][var4] != null && class488.field7062[0][var5][var4].field1776 != null;
                        if (var6.field1765 < 0) {
                            int var8 = var4;
                            int var9 = var4;
                            int var11 = var3;
                            class114 var12 = class488.field7062[var3][var5][var4 - 1];
                            int var13 = class121.field1867[var3].method2160(-99, var4, var5);
                            while (var8 > 0 && var12 != null && var12.field1765 < 0 && var6.field1765 == var12.field1765 && var6.field1760 == var12.field1760 && var13 == class121.field1867[var3].method2160(-123, var8 - 1, var5) && (var8 - 1 <= 0 || class121.field1867[var3].method2160(-104, var8 - 2, var5) == var13)) {
                                var8--;
                                var12 = class488.field7062[var3][var5][var8 - 1];
                            }
                            for (class114 var14 = class488.field7062[var3][var5][var4 + 1]; var9 < class54.field870 && var14 != null && var14.field1765 < 0 && var6.field1765 == var14.field1765 && var6.field1760 == var14.field1760 && var13 == class121.field1867[var3].method2160(arg0 + 3558, var9 + 1, var5) && (var9 + 1 >= class54.field870 || var13 == class121.field1867[var3].method2160(-120, var9 + 2, var5)); var14 = class488.field7062[var3][var5][var9 + 1]) {
                                var9++;
                            }
                            int var15 = var3 + 1 - var3;
                            int var16 = class121.field1867[var7 ? var3 + 1 : var3].method2160(arg0 ^ 0xE60, var8, var5);
                            int var17 = var6.field1765 * var15 + var16;
                            int var18 = class121.field1867[var7 ? var3 + 1 : var3].method2160(-82, var9 + 1, var5);
                            int var19 = var6.field1765 * var15 + var18;
                            int var20 = var5 << class662.field9425;
                            int var21 = var8 << class662.field9425;
                            int var22 = (var9 << class662.field9425) + class382.field5732;
                            class666.field9463[class19.field199++] = new class328(1, var3, var6.field1760 + var20, var20 - -var6.field1760, var6.field1760 + var20, var6.field1760 + var20, var16, var18, var19, var17, var21, var22, var22, var21);
                            for (int var23 = var3; var23 <= var11; var23++) {
                                for (int var24 = var8; var24 <= var9; var24++) {
                                    class488.field7062[var23][var5][var24].field1765 = (short) (class488.field7062[var23][var5][var24].field1765 * -1);
                                }
                            }
                        }
                        if (var6.field1773 < 0) {
                            int var25 = var5;
                            int var26 = var5;
                            int var28 = var3;
                            class114 var29 = class488.field7062[var3][var5 - 1][var4];
                            int var30 = class121.field1867[var3].method2160(-106, var4, var5);
                            while (var25 > 0 && var29 != null && var29.field1773 < 0 && var6.field1773 == var29.field1773 && var6.field1770 == var29.field1770 && class121.field1867[var3].method2160(-74, var4, var25 - 1) == var30 && ((var25 - 1) <= 0 || class121.field1867[var3].method2160(-117, var4, var25 - 2) == var30)) {
                                var25--;
                                var29 = class488.field7062[var3][var25 - 1][var4];
                            }
                            for (class114 var31 = class488.field7062[var3][var5 + 1][var4]; class42.field727 > var26 && var31 != null && var31.field1773 < 0 && var6.field1773 == var31.field1773 && var6.field1770 == var31.field1770 && var30 == class121.field1867[var3].method2160(-92, var4, var26 + 1) && (class42.field727 <= var26 + 1 || class121.field1867[var3].method2160(arg0 + 3523, var4, var26 + 2) == var30); var31 = class488.field7062[var3][var26 + 1][var4]) {
                                var26++;
                            }
                            int var32 = var3 + 1 - var3;
                            int var33 = class121.field1867[var7 ? var3 + 1 : var3].method2160(-123, var4, var25);
                            int var34 = var6.field1773 * var32 + var33;
                            int var35 = class121.field1867[var7 ? var3 + 1 : var3].method2160(-125, var4, var26 + 1);
                            int var36 = var6.field1773 * var32 + var35;
                            int var37 = var25 << class662.field9425;
                            int var38 = (var26 << class662.field9425) + class382.field5732;
                            int var39 = var4 << class662.field9425;
                            class666.field9463[class19.field199++] = new class328(2, var3, var37, var38, var38, var37, var33, var35, var36, var34, var39 + var6.field1770, var39 - -var6.field1770, var39 + var6.field1770, var6.field1770 + var39);
                            for (int var40 = var3; var40 <= var28; var40++) {
                                for (int var41 = var25; var41 <= var26; var41++) {
                                    class488.field7062[var40][var41][var4].field1773 = (short) (class488.field7062[var40][var41][var4].field1773 * -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != -3639) {
            field5097 = 89;
        }
        class118.field1810 = true;
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(I)V")
    public static void method2206(int arg0) {
        int var1 = 79 % ((-arg0 - 53) / 47);
        field5093 = null;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "([SII)[S")
    public static final short[] method2207(short[] arg0, int arg1, int arg2) {
        field5096++;
        short[] var3 = new short[arg2];
        class571.method3312(arg0, 0, var3, arg1, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lfc;Lla;B)V")
    public static final void method2208(class731 arg0, class422 arg1, byte arg2) {
        field5095++;
        class131.field2136 = arg1;
        class544.field7771 = arg0;
        class64.field1032 = "";
        if (class616.field8695.startsWith("win")) {
            class64.field1032 = class64.field1032 + "windows/";
        } else if (class616.field8695.startsWith("linux")) {
            class64.field1032 = class64.field1032 + "linux/";
        } else if (class616.field8695.startsWith("mac")) {
            class64.field1032 = class64.field1032 + "macos/";
        }
        int var3 = -84 / ((arg2 - 85) / 41);
        if (class544.field7771.field10262) {
            class64.field1032 = class64.field1032 + "msjava/";
        } else if (class616.field8697.startsWith("amd64") || class616.field8697.startsWith("x86_64")) {
            class64.field1032 = class64.field1032 + "x86_64/";
        } else if (class616.field8697.startsWith("i386") || class616.field8697.startsWith("i486") || class616.field8697.startsWith("i586") || class616.field8697.startsWith("x86")) {
            class64.field1032 = class64.field1032 + "x86/";
        } else if (class616.field8697.startsWith("ppc")) {
            class64.field1032 = class64.field1032 + "ppc/";
        } else {
            class64.field1032 = class64.field1032 + "universal/";
        }
    }
}
