import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class214 extends class152 {

    @OriginalMember(owner = "client!cb", name = "V", descriptor = "I")
    private int field3632 = -1;

    @OriginalMember(owner = "client!cb", name = "hb", descriptor = "Z")
    public static boolean field3644 = true;

    @OriginalMember(owner = "client!cb", name = "Z", descriptor = "[Lce;")
    public static class126[] field3636 = new class126[500];

    @OriginalMember(owner = "client!cb", name = "gb", descriptor = "Lce;")
    public static class126 field3643 = class206.method1445(-7923, "null");

    @OriginalMember(owner = "client!cb", name = "eb", descriptor = "Lce;")
    private static class126 field3641 = class206.method1445(-7923, "Connection lost)3");

    @OriginalMember(owner = "client!cb", name = "jb", descriptor = "J")
    public static long field3646 = 0L;

    @OriginalMember(owner = "client!cb", name = "T", descriptor = "Lce;")
    public static class126 field3630 = field3641;

    @OriginalMember(owner = "client!cb", name = "R", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!cb", name = "S", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!cb", name = "U", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!cb", name = "W", descriptor = "I")
    public int field3633;

    @OriginalMember(owner = "client!cb", name = "X", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!cb", name = "Y", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!cb", name = "ab", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!cb", name = "bb", descriptor = "I")
    public int field3638;

    @OriginalMember(owner = "client!cb", name = "db", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!cb", name = "fb", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!cb", name = "ib", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!cb", name = "kb", descriptor = "[I")
    public int[] field3647;

    @OriginalMember(owner = "client!cb", name = "cb", descriptor = "[[[B")
    public static byte[][][] field3639;

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V", line = 10)
    public class214() {
        super(0, false);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILcc;I)Lvj;", line = 17)
    public static final class184 method1483(int arg0, int arg1, class313 arg2, int arg3) {
        field3634++;
        if (class298.method2012(arg1, (byte) -110, arg2, arg3)) {
            if (arg0 != -5048) {
                method1488(-32);
            }
            return class13.method79((byte) 73);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)Z", line = 45)
    public final boolean method1484(int arg0) {
        field3645++;
        if (this.field3647 != null) {
            return true;
        } else if (this.field3632 < 0) {
            int var2 = -11 % ((arg0 + 65) / 41);
            return false;
        } else {
            class184 var3 = class289.field4799 < 0 ? class65.method473(this.field3632, 5056, class220.field3709) : class68.method500(class289.field4799, this.field3632, -121, class220.field3709);
            var3.method1337();
            this.field3633 = var3.field4595;
            this.field3638 = var3.field4601;
            this.field3647 = var3.field3196;
            return true;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLce;I)V", line = 71)
    public static final void method1485(byte arg0, class126 arg1, int arg2) {
        field3631++;
        class126 var3 = arg1.method849(1).method869(127);
        boolean var4 = false;
        int var5 = 0;
        if (arg0 > -83) {
            method1488(-11);
        }
        while (var5 < class239.field4036) {
            class301 var6 = class85.field1352[class166.field2958[var5]];
            if (var6 != null && var6.field5019 != null && var6.field5019.method881(var3, (byte) 92)) {
                class151.method1123(2, 1, -9, 0, 0, false, 1, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var6.field2460[0], var6.field2471[0]);
                if (arg2 == 1) {
                    class134.field2345++;
                    class103.field1645.method1238(147, 63);
                    class103.field1645.method974(class166.field2958[var5], (byte) 26);
                } else if (arg2 == 4) {
                    class262.field4384++;
                    class103.field1645.method1238(178, 98);
                    class103.field1645.method974(class166.field2958[var5], (byte) 26);
                } else if (arg2 == 5) {
                    class57.field894++;
                    class103.field1645.method1238(174, 70);
                    class103.field1645.method935(class166.field2958[var5], 1668921832);
                } else if (arg2 == 6) {
                    class103.field1645.method1238(203, 74);
                    class103.field1645.method974(class166.field2958[var5], (byte) 26);
                    class94.field1469++;
                } else if (arg2 == 7) {
                    class103.field1645.method1238(56, 114);
                    class103.field1645.method974(class166.field2958[var5], (byte) 26);
                    class117.field1980++;
                }
                var4 = true;
                break;
            }
            var5++;
        }
        if (!var4) {
            class73.method530(class224.field3772, (byte) 100, 0, class12.method69(new class126[] { class304.field5092, var3 }, (byte) 121));
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)I", line = 146)
    public final int method1127(int arg0) {
        field3628++;
        if (arg0 != -1) {
            method1488(-85);
        }
        return this.field3632;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(III)J", line = 159)
    public static final long method1486(int arg0, int arg1, int arg2) {
        class5 var3 = class297.field4940[arg0][arg1][arg2];
        return var3 == null || var3.field46 == null ? 0L : var3.field46.field2230;
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(II)[[I", line = 176)
    public int[][] method26(int arg0, int arg1) {
        field3635++;
        if (arg0 != 0) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field2775.method319(arg0 + 86, arg1);
        if (this.field2775.field775 && this.method1484(arg0 ^ 0x26)) {
            int[] var4 = var3[2];
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int var7 = this.field3633 * (class143.field2599 == this.field3638 ? arg1 : this.field3638 * arg1 / class143.field2599);
            if (class244.field4133 == this.field3633) {
                for (int var11 = 0; var11 < class244.field4133; var11++) {
                    int var12 = this.field3647[var7++];
                    var4[var11] = class47.method289(var12, 255) << 4;
                    var5[var11] = class47.method289(var12 >> 4, 4080);
                    var6[var11] = class47.method289(16711680, var12) >> 12;
                }
            } else {
                for (int var8 = 0; var8 < class244.field4133; var8++) {
                    int var9 = this.field3633 * var8 / class244.field4133;
                    int var10 = this.field3647[var7 + var9];
                    var4[var8] = class47.method289(var10, 255) << 4;
                    var5[var8] = class47.method289(var10 >> 4, 4080);
                    var6[var8] = class47.method289(var10, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILbb;)V", line = 249)
    public final void method5(int arg0, int arg1, class134 arg2) {
        field3637++;
        if (arg0 != 8) {
            method1483(-74, -6, (class313) null, -11);
        }
        if (arg1 == 0) {
            this.field3632 = arg2.method942(true);
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V", line = 268)
    public final void method544(int arg0) {
        field3629++;
        super.method544(arg0);
        this.field3647 = null;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(Z)V", line = 291)
    public static void method1487(boolean arg0) {
        field3636 = null;
        field3641 = null;
        field3639 = (byte[][][]) null;
        field3630 = null;
        if (!arg0) {
            method1487(false);
        }
        field3643 = null;
    }

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "(I)[Lie;", line = 305)
    public static final class2[] method1488(int arg0) {
        field3640++;
        class2[] var1 = new class2[class185.field3205];
        if (arg0 != 3121) {
            method1486(-120, 112, 107);
        }
        for (int var2 = 0; var2 < class185.field3205; var2++) {
            var1[var2] = new class2(class307.field5187, class290.field4802, class27.field386[var2], class63.field1032[var2], class279.field4643[var2], class263.field4389[var2], class190.field3255[var2], class241.field4062);
        }
        class197.method1395((byte) 127);
        return var1;
    }
}
