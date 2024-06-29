import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class260 extends class29 {

    @OriginalMember(owner = "client!jd", name = "J", descriptor = "Z")
    public boolean field4344 = true;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "I")
    public static int field4341 = 0;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "J")
    public static long field4335 = 0L;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "Lph;")
    public static class229 field4342 = class266.method1858("www", 0);

    @OriginalMember(owner = "client!jd", name = "K", descriptor = "Lph;")
    private static class229 field4345 = class266.method1858("Continue", 0);

    @OriginalMember(owner = "client!jd", name = "M", descriptor = "Lph;")
    public static class229 field4347 = field4345;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!jd", name = "I", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!jd", name = "O", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!jd", name = "P", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!jd", name = "Q", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!jd", name = "S", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!jd", name = "T", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!jd", name = "V", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!jd", name = "X", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!jd", name = "Y", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!jd", name = "N", descriptor = "J")
    public static long field4348;

    @OriginalMember(owner = "client!jd", name = "W", descriptor = "Lsi;")
    public static class66 field4357;

    @OriginalMember(owner = "client!jd", name = "U", descriptor = "[I")
    private int[] field4355;

    @OriginalMember(owner = "client!jd", name = "Z", descriptor = "[I")
    public int[] field4360;

    @OriginalMember(owner = "client!jd", name = "L", descriptor = "[Lcc;")
    public static class220[] field4346;

    @OriginalMember(owner = "client!jd", name = "R", descriptor = "[Lph;")
    private class229[] field4352;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "[[I")
    private int[][] field4337;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILri;I)V", line = 6)
    public static final void method1803(int arg0, int arg1, class301 arg2, int arg3) {
        if (arg1 > -105) {
            field4342 = (class229) null;
        }
        if (arg2.field5039 == 0) {
            arg2.field4991 = arg2.field4896;
        } else if (arg2.field5039 == 1) {
            arg2.field4991 = (arg0 - arg2.field4882) / 2 + arg2.field4896;
        } else if (arg2.field5039 == 2) {
            arg2.field4991 = arg0 - arg2.field4882 - arg2.field4896;
        } else if (arg2.field5039 == 3) {
            arg2.field4991 = arg2.field4896 * arg0 >> 14;
        } else if (arg2.field5039 == 4) {
            arg2.field4991 = (arg2.field4896 * arg0 >> 14) + (arg0 - arg2.field4882) / 2;
        } else {
            arg2.field4991 = arg0 - (arg2.field4896 * arg0 >> 14) - arg2.field4882;
        }
        if (arg2.field4898 == 0) {
            arg2.field5049 = arg2.field4931;
        } else if (arg2.field4898 == 1) {
            arg2.field5049 = (arg3 - arg2.field4923) / 2 + arg2.field4931;
        } else if (arg2.field4898 == 2) {
            arg2.field5049 = arg3 - arg2.field4931 - arg2.field4923;
        } else if (arg2.field4898 == 3) {
            arg2.field5049 = arg2.field4931 * arg3 >> 14;
        } else if (arg2.field4898 == 4) {
            arg2.field5049 = (arg2.field4931 * arg3 >> 14) + (arg3 - arg2.field4923) / 2;
        } else {
            arg2.field5049 = arg3 - arg2.field4923 - (arg2.field4931 * arg3 >> 14);
        }
        field4358++;
        if (!class40.field647 || !(client.method2168(arg2) != 0 || arg2.field4920 == 0)) {
            return;
        }
        if (arg2.field5049 < 0) {
            arg2.field5049 = 0;
        } else if (arg3 < (arg2.field5049 + arg2.field4923)) {
            arg2.field5049 = arg3 - arg2.field4923;
        }
        if (arg2.field4991 < 0) {
            arg2.field4991 = 0;
        } else if (arg2.field4991 + arg2.field4882 > arg0) {
            arg2.field4991 = arg0 - arg2.field4882;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lhb;I[I)V", line = 86)
    public final void method1804(class164 arg0, int arg1, int[] arg2) {
        field4349++;
        if (this.field4355 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field4355.length && arg2.length > var4; var4++) {
            int var5 = class51.field735[this.method1806(arg1 ^ 0xBE4B, var4)];
            if (var5 > 0) {
                arg0.method1159((long) arg2[var4], var5, (byte) 108);
            }
        }
        if (arg1 != 11766) {
            this.method1814((byte) -4);
        }
    }

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)I", line = 126)
    public final int method1805(int arg0) {
        if (arg0 != 0) {
            field4341 = 71;
        }
        field4356++;
        return this.field4355 == null ? 0 : this.field4355.length;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)I", line = 140)
    public final int method1806(int arg0, int arg1) {
        field4350++;
        if (this.field4355 == null || arg1 < 0 || arg1 > this.field4355.length) {
            return -1;
        } else if (arg0 == 37821) {
            return this.field4355[arg1];
        } else {
            return -123;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZI)Lqa;", line = 158)
    public static final class83 method1807(boolean arg0, int arg1) {
        field4336++;
        class83 var2 = (class83) class166.field2713.method1413((long) arg1, !arg0);
        if (var2 != null) {
            return var2;
        } else if (arg0) {
            return (class83) null;
        } else {
            byte[] var3 = class27.field398.method523(-71, class171.method1246(arg1, 255), class26.method176(114, arg1));
            class83 var4 = new class83();
            var4.field1421 = arg1;
            if (var3 != null) {
                var4.method607(new class164(var3), 0);
            }
            var4.method617((byte) 109);
            if (var4.field1389) {
                var4.field1378 = 0;
                var4.field1430 = false;
            }
            if (!class124.field2084 && var4.field1409) {
                var4.field1415 = null;
            }
            class166.field2713.method1419((long) arg1, 5216, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([IB[J)V", line = 196)
    public static final void method1808(int[] arg0, byte arg1, long[] arg2) {
        if (arg1 <= 102) {
            method1812(true, 89, -6);
        }
        class198.method1397(arg0, 0, 32028, arg2.length - 1, arg2);
        field4338++;
    }

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "(I)Lph;", line = 208)
    public final class229 method1809(int arg0) {
        field4359++;
        class229 var2 = class121.method904(80, 30487);
        if (this.field4352 == null) {
            return class5.field67;
        }
        var2.method1631(this.field4352[arg0], true);
        for (int var3 = 1; var3 < this.field4352.length; var3++) {
            var2.method1631(class313.field5263, true);
            var2.method1631(this.field4352[var3], true);
        }
        return var2.method1620(-22358);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILhb;I)V", line = 235)
    private final void method1810(int arg0, class164 arg1, int arg2) {
        if (arg0 != -802) {
            field4346 = (class220[]) null;
        }
        field4339++;
        if (arg2 == 1) {
            this.field4352 = arg1.method1190(0).method1637(60, (byte) 101);
        } else if (arg2 == 2) {
            int var8 = arg1.method1178(8);
            this.field4360 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4360[var9] = arg1.method1161(true);
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method1178(8);
            this.field4355 = new int[var4];
            this.field4337 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1161(true);
                this.field4355[var5] = var6;
                this.field4337[var5] = new int[class107.field1817[var6]];
                for (int var7 = 0; var7 < class107.field1817[var6]; var7++) {
                    this.field4337[var5][var7] = arg1.method1161(true);
                }
            }
        } else if (arg2 == 4) {
            this.field4344 = false;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V", line = 301)
    public static void method1811(byte arg0) {
        if (arg0 < 66) {
            field4357 = (class66) null;
        }
        field4346 = null;
        field4357 = null;
        field4342 = null;
        field4347 = null;
        field4345 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZII)I", line = 318)
    public static final int method1812(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return 116;
        }
        field4340++;
        int var3 = class161.method1136(arg1 + 45365, 103, 4, arg2 + 91923) + (class161.method1136(arg1 + 10294, -104, 2, arg2 + 37821) - 128 >> 1) + (class161.method1136(arg1, -105, 1, arg2) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIB)I", line = 339)
    public final int method1813(int arg0, int arg1, byte arg2) {
        field4351++;
        int var4 = -82 / ((73 - arg2) / 47);
        if (this.field4355 == null || arg0 < 0 || arg0 > this.field4355.length) {
            return -1;
        } else if (this.field4337[arg0] == null || arg1 < 0 || arg1 > this.field4337[arg0].length) {
            return -1;
        } else {
            return this.field4337[arg0][arg1];
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V", line = 361)
    public final void method1814(byte arg0) {
        if (arg0 != -85) {
            method1808((int[]) null, (byte) 74, (long[]) null);
        }
        field4354++;
        if (this.field4360 != null) {
            for (int var2 = 0; var2 < this.field4360.length; var2++) {
                this.field4360[var2] = class201.method1410(this.field4360[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lhb;B)V", line = 383)
    public final void method1815(class164 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1178(8);
            if (var3 == 0) {
                field4343++;
                if (arg1 <= 3) {
                    this.field4337 = (int[][]) ((int[][]) null);
                }
                return;
            }
            this.method1810(-802, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZLhb;)Lph;", line = 419)
    public final class229 method1816(boolean arg0, class164 arg1) {
        class229 var3 = class121.method904(80, 30487);
        field4353++;
        if (this.field4355 != null) {
            for (int var4 = 0; var4 < this.field4355.length; var4++) {
                var3.method1631(this.field4352[var4], !arg0);
                var3.method1631(class39.method297(-17194, this.field4337[var4], this.field4355[var4], arg1.method1203(class306.field5157[this.field4355[var4]], 41)), !arg0);
            }
        }
        var3.method1631(this.field4352[this.field4352.length - 1], true);
        if (arg0) {
            this.field4352 = (class229[]) null;
        }
        return var3.method1620(-22358);
    }
}
