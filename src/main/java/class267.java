import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class267 extends class224 {

    @OriginalMember(owner = "client!ka", name = "ab", descriptor = "Z")
    private boolean field4503 = true;

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "Z")
    private boolean field4495 = true;

    @OriginalMember(owner = "client!ka", name = "bb", descriptor = "Luf;")
    public static class168 field4504 = class148.method1019(-1720, "(U5");

    @OriginalMember(owner = "client!ka", name = "db", descriptor = "I")
    public static int field4506 = 1;

    @OriginalMember(owner = "client!ka", name = "hb", descriptor = "Luf;")
    private static class168 field4510 = class148.method1019(-1720, "Players");

    @OriginalMember(owner = "client!ka", name = "cb", descriptor = "Luf;")
    public static class168 field4505 = field4510;

    @OriginalMember(owner = "client!ka", name = "ib", descriptor = "I")
    public static int field4511 = 0;

    @OriginalMember(owner = "client!ka", name = "X", descriptor = "Lej;")
    public static class204 field4500 = new class204(64);

    @OriginalMember(owner = "client!ka", name = "jb", descriptor = "Z")
    public static boolean field4512 = false;

    @OriginalMember(owner = "client!ka", name = "kb", descriptor = "I")
    public static int field4513 = 0;

    @OriginalMember(owner = "client!ka", name = "lb", descriptor = "J")
    public static long field4514 = 0L;

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!ka", name = "W", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!ka", name = "Y", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!ka", name = "Z", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!ka", name = "eb", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!ka", name = "fb", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!ka", name = "gb", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!ka", name = "U", descriptor = "Lfl;")
    public static class81 field4497;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(Z)I", line = 4)
    public static final int method1855(boolean arg0) {
        if (!arg0) {
            return -127;
        }
        field4508++;
        if (class8.field98 == null) {
            return class12.field133 ? 1 : 0;
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)V", line = 29)
    public static void method1856(int arg0) {
        field4497 = null;
        field4500 = null;
        if (arg0 < 58) {
            method1855(true);
        }
        field4510 = null;
        field4505 = null;
        field4504 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZLj;)V", line = 53)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        if (arg0 == 0) {
            this.field4503 = arg2.method1042((byte) 91) == 1;
        } else if (arg0 == 1) {
            this.field4495 = arg2.method1042((byte) 124) == 1;
        } else if (arg0 == 2) {
            this.field3610 = arg2.method1042((byte) 118) == 1;
        }
        if (arg1) {
            this.method18((byte) -4, -76);
        }
        field4507++;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lj;I)Lt;", line = 95)
    public static final class224 method1857(class153 arg0, int arg1) {
        field4494++;
        arg0.method1042((byte) -25);
        int var2 = arg0.method1042((byte) -88);
        class224 var3 = class103.method772((byte) 9, var2);
        var3.field3630 = arg0.method1042((byte) -50);
        int var4 = arg0.method1042((byte) -92);
        for (int var5 = arg1; var5 < var4; var5++) {
            int var6 = arg0.method1042((byte) -23);
            var3.method19(var6, false, arg0);
        }
        var3.method80(false);
        return var3;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Luf;ZB)V", line = 127)
    public static final void method1858(class168 arg0, boolean arg1, byte arg2) {
        field4502++;
        if (arg1) {
            if (class297.field5019) {
                try {
                    class97.method738(arg2 ^ 0xFFFFC53D, class51.field622.field1000, new Object[] { arg0.method1206(class71.field949.getCodeBase(), (byte) 95).toString() }, "openjs");
                    return;
                } catch (Throwable var8) {
                }
            }
            try {
                class71.field949.getAppletContext().showDocument(arg0.method1206(class71.field949.getCodeBase(), (byte) 63), "_blank");
            } catch (Exception var6) {
            }
        } else {
            try {
                class71.field949.getAppletContext().showDocument(arg0.method1206(class71.field949.getCodeBase(), (byte) 127), "_top");
            } catch (Exception var7) {
            }
        }
        if (arg2 != -125) {
            method1860(-45, 116, -65, -43, 47, -44);
        }
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(B)V", line = 170)
    public static final void method1859(byte arg0) {
        if (arg0 != 71) {
            field4504 = (class168) null;
        }
        class8.field100 = null;
        class26.field321 = null;
        class31.field388 = null;
        field4509++;
        class145.field2252 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIII)V", line = 187)
    public static final void method1860(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4501++;
        int var6 = class54.method301(class44.field538, arg0, class9.field112, -123);
        int var7 = class54.method301(class44.field538, arg1, class9.field112, 85);
        int var8 = class54.method301(class65.field874, arg5, class150.field2331, -116);
        int var9 = class54.method301(class65.field874, arg2, class150.field2331, 117);
        if (arg3 == 3821) {
            for (int var10 = var6; var10 <= var7; var10++) {
                class133.method925(14678, var8, arg4, var9, class284.field4810[var10]);
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)[[I", line = 221)
    public final int[][] method17(int arg0, byte arg1) {
        field4498++;
        int[][] var3 = this.field3631.method1587(arg0, arg1 + 9881);
        if (arg1 != -77) {
            return (int[][]) ((int[][]) null);
        }
        if (this.field3631.field3756) {
            int[][] var4 = this.method1535(0, 3, this.field4495 ? class169.field2777 - arg0 : arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field4503) {
                for (int var12 = 0; var12 < class187.field2961; var12++) {
                    var7[var12] = var5[class205.field3363 - var12];
                    var9[var12] = var6[class205.field3363 - var12];
                    var10[var12] = var8[class205.field3363 - var12];
                }
            } else {
                for (int var11 = 0; var11 < class187.field2961; var11++) {
                    var7[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var8[var11];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)[I", line = 287)
    public final int[] method18(byte arg0, int arg1) {
        int[] var3 = this.field3613.method1866(1, arg1);
        int var4 = -43 % ((20 - arg0) / 51);
        field4496++;
        if (this.field3613.field4531) {
            int[] var5 = this.method1537(this.field4495 ? class169.field2777 - arg1 : arg1, 0, 0);
            if (this.field4503) {
                for (int var6 = 0; var6 < class187.field2961; var6++) {
                    var3[var6] = var5[class205.field3363 - var6];
                }
            } else {
                class185.method1310(var5, 0, var3, 0, class187.field2961);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V", line = 346)
    public class267() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIILf;IJIIII)Z", line = 349)
    public static final boolean method1861(int arg0, int arg1, int arg2, int arg3, class231 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class150.method1033(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }
}
