import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class25 extends class29 {

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "I")
    public static int field322 = 0;

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "Lph;")
    public static class229 field323 = class266.method1858("", 0);

    @OriginalMember(owner = "client!wg", name = "P", descriptor = "Lo;")
    public static class227 field330 = new class227();

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "Lvm;")
    public static class202 field333 = new class202(20);

    @OriginalMember(owner = "client!wg", name = "U", descriptor = "Lph;")
    private static class229 field335 = class266.method1858("Members object", 0);

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "Lph;")
    public static class229 field334 = field335;

    @OriginalMember(owner = "client!wg", name = "W", descriptor = "Lph;")
    public static class229 field337 = class266.method1858(" ", 0);

    @OriginalMember(owner = "client!wg", name = "V", descriptor = "Z")
    public static boolean field336 = false;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!wg", name = "O", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!wg", name = "Q", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "Lph;")
    public class229 field319;

    @OriginalMember(owner = "client!wg", name = "R", descriptor = "Lka;")
    public static class293 field332;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "[I")
    public int[] field316;

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "[I")
    public int[] field318;

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "[I")
    public int[] field321;

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "[I")
    public int[] field328;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "(I)V", line = 4)
    public static final void method153(int arg0) {
        class243.field4004 = new class97(32);
        if (arg0 == 2) {
            field315++;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)I", line = 25)
    public final int method154(int arg0, int arg1) {
        field327++;
        if (this.field316 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field316.length; var3++) {
            if (this.field328[var3] == arg0) {
                return this.field316[var3];
            }
        }
        if (arg1 != -5) {
            this.field328 = (int[]) null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(II)Lqe;", line = 56)
    public static final class313 method155(int arg0, int arg1) {
        field324++;
        class313 var2 = (class313) class12.field169.method1413((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class124.field2079.method523(-84, class29.method229(arg0, false), class279.method1922(1247254535, arg0));
        class313 var4 = new class313();
        var4.field5272 = arg0;
        if (var3 != null) {
            var4.method2120(new class164(var3), -96);
        }
        var4.method2126((byte) 109);
        if (arg1 > -25) {
            method157(-44, 11, (class301) null, -100);
        }
        class12.field169.method1419((long) arg0, 5216, var4);
        return var4;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V", line = 87)
    public final void method156(byte arg0) {
        field325++;
        if (this.field318 != null) {
            for (int var2 = 0; var2 < this.field318.length; var2++) {
                this.field318[var2] = class201.method1410(this.field318[var2], 32768);
            }
        }
        if (this.field316 != null) {
            for (int var3 = 0; var3 < this.field316.length; var3++) {
                this.field316[var3] = class201.method1410(this.field316[var3], 32768);
            }
        }
        int var4 = -93 % ((-arg0 - 56) / 44);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILri;I)V", line = 115)
    public static final void method157(int arg0, int arg1, class301 arg2, int arg3) {
        if (arg0 != 0) {
            return;
        }
        field317++;
        if (class314.field5337 < 2 && class317.field5381 == 0 && !class8.field103) {
            return;
        }
        class229 var4;
        if (class317.field5381 == 1 && class314.field5337 < 2) {
            var4 = class248.method1746(8528, new class229[] { class143.field2321, class250.field4162, class208.field3431, class192.field3170 });
        } else if (class8.field103 && class314.field5337 < 2) {
            var4 = class248.method1746(8528, new class229[] { class116.field1965, class250.field4162, class205.field3388, class192.field3170 });
        } else if (field336 && class94.field1583[81] && class314.field5337 > 2) {
            var4 = class263.method1834(class314.field5337 - 2, (byte) -128);
        } else {
            var4 = class263.method1834(class314.field5337 - 1, (byte) -123);
        }
        if (class314.field5337 > 2) {
            var4 = class248.method1746(8528, new class229[] { var4, class164.field2633, class50.method354(0, class314.field5337 - 2), class168.field2778 });
        }
        if (arg2 == null) {
            int var6 = class213.field3517.method239(var4, arg1 + 4, arg3 + 15, 16777215, 0, class186.field3031, class33.field545);
            class329.method2253(var6 + class213.field3517.method258(var4), false, 15, arg1 + 4, arg3);
            return;
        }
        class31 var5 = arg2.method2019(class260.field4346, true);
        if (var5 == null) {
            var5 = class213.field3517;
        }
        var5.method252(var4, arg1, arg3, arg2.field4923, arg2.field4882, arg2.field4926, arg2.field4925, arg2.field5021, arg2.field4915, class186.field3031, class33.field545, class174.field2860);
        class329.method2253(class174.field2860[2], false, class174.field2860[3], class174.field2860[0], class174.field2860[1]);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILhb;I)V", line = 166)
    private final void method158(int arg0, class164 arg1, int arg2) {
        if (arg2 == 1) {
            this.field319 = arg1.method1190(0);
        } else if (arg2 == 2) {
            int var7 = arg1.method1178(8);
            this.field316 = new int[var7];
            this.field328 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field316[var8] = arg1.method1161(true);
                int var9 = arg1.method1178(8);
                if (var9 == 0) {
                    this.field328[var8] = -1;
                } else {
                    this.field328[var8] = var9;
                }
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method1178(8);
            this.field318 = new int[var4];
            this.field321 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field318[var5] = arg1.method1161(true);
                int var6 = arg1.method1178(8);
                if (var6 == 0) {
                    this.field321[var5] = -1;
                } else {
                    this.field321[var5] = var6;
                }
            }
        } else if (arg2 == 4) {
        }
        if (arg0 != 0) {
            this.method161((class164) null, -7);
        }
        field331++;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)I", line = 238)
    public final int method159(byte arg0, int arg1) {
        field329++;
        if (this.field318 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field318.length; var3++) {
            if (this.field321[var3] == arg1) {
                return this.field318[var3];
            }
        }
        if (arg0 < 125) {
            return 126;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILsi;)V", line = 268)
    public static final void method160(int arg0, class66 arg1) {
        if (arg0 == -3) {
            field320++;
            class223.field3671 = arg1;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lhb;I)V", line = 283)
    public final void method161(class164 arg0, int arg1) {
        int var3 = 5 % ((-arg1 - 58) / 35);
        field326++;
        while (true) {
            int var4 = arg0.method1178(8);
            if (var4 == 0) {
                return;
            }
            this.method158(0, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(B)V", line = 302)
    public static void method162(byte arg0) {
        field323 = null;
        field334 = null;
        field333 = null;
        field330 = null;
        field337 = null;
        field332 = null;
        int var1 = 42 / ((arg0 - 46) / 53);
        field335 = null;
    }
}
