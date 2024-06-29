import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class310 extends class3 {

    @OriginalMember(owner = "client!og", name = "F", descriptor = "Z")
    private boolean field5040 = true;

    @OriginalMember(owner = "client!og", name = "K", descriptor = "Z")
    private boolean field5045 = true;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "Z")
    public static boolean field5053 = false;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "[Lfh;")
    public static class313[] field5051 = new class313[2048];

    @OriginalMember(owner = "client!og", name = "G", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!og", name = "L", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!og", name = "M", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!og", name = "N", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!og", name = "O", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!og", name = "H", descriptor = "Lnm;")
    public static class221 field5042;

    @OriginalMember(owner = "client!og", name = "I", descriptor = "Lnm;")
    public static class221 field5043;

    @OriginalMember(owner = "client!og", name = "J", descriptor = "[Lnc;")
    public static class16[] field5044;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)[[I", line = 7)
    public final int[][] method22(int arg0, int arg1) {
        field5041++;
        if (arg0 != -21194) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field20.method2435(arg1, false);
        if (this.field20.field5556) {
            int[][] var4 = this.method16(this.field5040 ? class129.field1970 - arg1 : arg1, 0, (byte) -102);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field5045) {
                for (int var11 = 0; var11 < class326.field5342; var11++) {
                    var8[var11] = var5[class5.field70 - var11];
                    var9[var11] = var6[class5.field70 - var11];
                    var10[var11] = var7[class5.field70 - var11];
                }
            } else {
                for (int var12 = 0; var12 < class326.field5342; var12++) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(II)V", line = 74)
    public static final void method2165(int arg0, int arg1) {
        field5052++;
        if (class346.field5553 == arg1) {
            return;
        }
        if (class346.field5553 == 0) {
            class322.method2308((byte) -9);
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (arg1 == 40) {
            class31.method263(19130);
        }
        if (arg1 != 40 && class139.field2183 != null) {
            class139.field2183.method674((byte) -83);
            class139.field2183 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class104.field1508 = 1;
            class120.field1771 = 0;
            client.field2060 = 1;
            class248.field3948 = 0;
            class92.field1335 = 0;
            class183.method1270(true, arg0 - 6);
        }
        if (arg1 == 25 || arg1 == 10) {
            class255.method1815(5424);
        }
        if (arg1 == 5) {
            class285.method2014(-1, class69.field1073);
        } else {
            class111.method738(80);
        }
        boolean var3 = class346.field5553 == 5 || class346.field5553 == 10 || class346.field5553 == 28;
        if (var3 != var2) {
            if (var2) {
                class214.field3279 = class281.field4625;
                if (class315.field5201 == 0) {
                    class223.method1522(2, 1);
                } else {
                    class261.method1833(0, field5042, 2, -116, class281.field4625, 255, false);
                }
                class267.field4400.method2069(false, (byte) 112);
            } else {
                class223.method1522(2, 1);
                class267.field4400.method2069(true, (byte) 112);
            }
        }
        if (arg0 != 5) {
            method2167((class312) null, -78, (class34) null, 64, true, (class148) null, 73, false);
        }
        if (class245.field3886 && (arg1 == 25 || arg1 == 28 || arg1 == 40)) {
            class245.method1715();
        }
        class346.field5553 = arg1;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V", line = 152)
    public class310() {
        super(1, false);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V", line = 159)
    public static void method2166(boolean arg0) {
        field5051 = null;
        field5044 = null;
        field5043 = null;
        field5042 = null;
        if (!arg0) {
            field5042 = (class221) null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BI)[I", line = 184)
    public final int[] method25(byte arg0, int arg1) {
        int[] var3 = this.field21.method1258(arg1, 0);
        if (this.field21.field2808) {
            int[] var4 = this.method24(this.field5040 ? class129.field1970 - arg1 : arg1, 1, 0);
            if (this.field5045) {
                for (int var5 = 0; var5 < class326.field5342; var5++) {
                    var3[var5] = var4[class5.field70 - var5];
                }
            } else {
                class298.method2100(var4, 0, var3, 0, class326.field5342);
            }
        }
        if (arg0 <= 57) {
            return (int[]) null;
        } else {
            field5048++;
            return var3;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lpl;ILwc;IZLbb;IZ)V", line = 221)
    public static final void method2167(class312 arg0, int arg1, class34 arg2, int arg3, boolean arg4, class148 arg5, int arg6, boolean arg7) {
        class176 var8 = null;
        if (arg0.field5073 == 0) {
            if ((double) class88.field1259 == 3.0D) {
                var8 = class40.field610;
            }
            if ((double) class88.field1259 == 4.0D) {
                var8 = class256.field4056;
            }
            if ((double) class88.field1259 == 6.0D) {
                var8 = class196.field3015;
            }
            if ((double) class88.field1259 >= 8.0D) {
                var8 = class99.field1447;
            }
        } else if (arg0.field5073 == 1) {
            if ((double) class88.field1259 == 3.0D) {
                var8 = class196.field3015;
            }
            if ((double) class88.field1259 == 4.0D) {
                var8 = class99.field1447;
            }
            if ((double) class88.field1259 == 6.0D) {
                var8 = class223.field3436;
            }
            if ((double) class88.field1259 >= 8.0D) {
                var8 = class355.field5630;
            }
        } else if (arg0.field5073 == 2) {
            if ((double) class88.field1259 == 3.0D) {
                var8 = class223.field3436;
            }
            if ((double) class88.field1259 == 4.0D) {
                var8 = class355.field5630;
            }
            if ((double) class88.field1259 == 6.0D) {
                var8 = class32.field487;
            }
            if ((double) class88.field1259 >= 8.0D) {
                var8 = class339.field5460;
            }
        }
        if (arg7) {
            method2167((class312) null, 12, (class34) null, -29, true, (class148) null, -60, false);
        }
        field5046++;
        if (var8 == null) {
            return;
        }
        int var9 = arg0.field5087;
        if (arg5.field2376 && arg0.field5085 != -1) {
            var9 = arg0.field5085;
        }
        int var10 = 0;
        int var11 = class302.field4967.method1212(arg0.field5104, (int[]) null, class4.field50);
        int var12 = arg5.field2379;
        int var13;
        if (arg4) {
            var13 = var12 - var8.method1234() * var11 / 2;
        } else {
            var13 = var12 - (arg1 + ((var11 - 1) * var8.method1238() + (var8.method1234() / 2)));
        }
        int var14 = var13 - var8.method1234();
        int var15 = var13 + var8.method1234() / 2;
        for (int var16 = 0; var16 < var11; var16++) {
            String var17 = class4.field50[var16];
            if ((var11 - 1) > var16) {
                var17 = var17.substring(0, var17.length() - 4);
            }
            int var18 = var8.method1237(var17);
            if (var10 < var18) {
                var10 = var18;
            }
        }
        arg2.field522 = var10 / 2 + arg5.field2389 + arg6;
        arg2.field523 = arg5.field2389 + arg6 - (var10 / 2);
        arg2.field514 = var14 + arg3;
        arg2.field519 = var14 + var8.method1238() * var11 + arg3;
        int var19 = var14 + 2;
        int var20 = arg5.field2389 - (var10 / 2) - 5;
        if (arg0.field5070 != 0) {
            class317.method2270(var20, var19, var10 + 10, -var19 + var14 + var11 * var8.method1238() + 1, arg0.field5070, arg0.field5070 >>> 24);
        }
        if (arg0.field5084 != 0) {
            class317.method2286(var20, var19, var10 + 10, -var19 + var8.method1238() * var11 + (var14 - -1), arg0.field5084, arg0.field5084 >>> 24);
        }
        for (int var21 = 0; var21 < var11; var21++) {
            String var22 = class4.field50[var21];
            if (var21 < (var11 - 1)) {
                var22 = var22.substring(0, var22.length() - 4);
            }
            int var23 = var8.method1237(var22);
            if (var10 < var23) {
                var10 = var23;
            }
            var8.method1242(var22, arg5.field2389, var15, var9, true);
            var15 += var8.method1238();
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILnm;IB)Lfo;", line = 368)
    public static final class239 method2168(int arg0, class221 arg1, int arg2, byte arg3) {
        field5049++;
        int var4 = -109 / ((arg3 - 12) / 52);
        return class334.method2361(arg2, arg1, 16836, arg0) ? class152.method1100(0) : null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lfh;IZ)V", line = 393)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        if (arg1 == 0) {
            this.field5045 = arg0.method2224(-124) == 1;
        } else if (arg1 == 1) {
            this.field5040 = arg0.method2224(-122) == 1;
        } else if (arg1 == 2) {
            this.field34 = arg0.method2224(-123) == 1;
        }
        field5047++;
        if (arg2) {
            field5044 = (class16[]) null;
        }
    }
}
