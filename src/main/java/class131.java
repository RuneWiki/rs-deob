import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class131 extends class242 {

    @OriginalMember(owner = "client!fh", name = "S", descriptor = "Lp;")
    public static class280 field2327 = class18.method140((byte) -126, " x ");

    @OriginalMember(owner = "client!fh", name = "Y", descriptor = "Lka;")
    public static class253 field2333 = new class253(128);

    @OriginalMember(owner = "client!fh", name = "bb", descriptor = "I")
    public static int field2336 = -1;

    @OriginalMember(owner = "client!fh", name = "cb", descriptor = "Lp;")
    public static class280 field2337 = class18.method140((byte) -119, "Chargement de la liste des serveurs");

    @OriginalMember(owner = "client!fh", name = "W", descriptor = "F")
    public static float field2331;

    @OriginalMember(owner = "client!fh", name = "R", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!fh", name = "T", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!fh", name = "U", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!fh", name = "V", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!fh", name = "X", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!fh", name = "Z", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!fh", name = "ab", descriptor = "Lak;")
    public static class137 field2335;

    @OriginalMember(owner = "client!fh", name = "db", descriptor = "Ltg;")
    public static class180 field2338;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "(I)V")
    public static void method908(int arg0) {
        field2338 = null;
        if (arg0 == -32769) {
            field2335 = null;
            field2337 = null;
            field2333 = null;
            field2327 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)Lc;")
    public static final class105 method909(int arg0, int arg1) {
        ++field2328;
        class105 var2 = (class105) class120.field2129.method1699((long) arg1, 103);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3;
            if (arg1 < 32768) {
                var3 = class55.field904.method1258(0, arg1, (byte) 117);
            } else {
                var3 = class1.field52.method1258(0, 32767 & arg1, (byte) 119);
            }
            if (arg0 != 10766) {
                return null;
            } else {
                class105 var4 = new class105();
                if (var3 != null) {
                    var4.method738((byte) -120, new class25(var3));
                }
                if (~arg1 <= -32769) {
                    var4.method739(18608);
                }
                class120.field2129.method1703(var4, (byte) 111, (long) arg1);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)Lp;")
    public static final class280 method910(byte arg0) {
        ++field2334;
        class280 var1;
        if (class112.field1836 == 1 && ~class157.field2745 > -3) {
            var1 = class30.method266(new class280[] { class182.field3199, class158.field2760, class48.field791, class210.field3612 }, (byte) -87);
        } else if (class263.field4647 && class157.field2745 < 2) {
            var1 = class30.method266(new class280[] { class90.field1473, class158.field2760, class268.field4702, class210.field3612 }, (byte) -87);
        } else if (class73.field1206 && class88.field1431[81] && ~class157.field2745 < -3) {
            var1 = class199.method1366(class157.field2745 - 2, -1);
        } else {
            var1 = class199.method1366(class157.field2745 + -1, -1);
        }
        if (~class157.field2745 < -3) {
            var1 = class30.method266(new class280[] { var1, class6.field129, class249.method1685((byte) -88, class157.field2745 + -2), class187.field3282 }, (byte) -87);
        }
        int var2 = 2 / ((arg0 - 5) / 50);
        return var1;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)[I")
    public final int[] method54(int arg0, int arg1) {
        int var3 = -41 % ((73 - arg1) / 41);
        ++field2330;
        int[] var4 = super.field4251.method1417((byte) 116, arg0);
        if (super.field4251.field3655) {
            int[][] var5 = this.method1648(26484, arg0, 0);
            int[] var6 = var5[2];
            int[] var7 = var5[0];
            int[] var8 = var5[1];
            for (int var9 = 0; class264.field4654 > var9; ++var9) {
                var4[var9] = (var6[var9] + var8[var9] + var7[var9]) / 3;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
    public class131() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BI)Lej;")
    public static final class50 method911(byte arg0, int arg1) {
        ++field2332;
        class50 var2 = (class50) class150.field2591.method1699((long) arg1, 96);
        if (var2 != null) {
            return var2;
        } else if (arg0 >= -114) {
            return null;
        } else {
            byte[] var3 = class20.field372.method1258(26, arg1, (byte) 99);
            class50 var4 = new class50();
            if (var3 != null) {
                var4.method369(new class25(var3), (byte) 126);
            }
            class150.field2591.method1703(var4, (byte) 111, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(III)Lek;")
    public static final class163 method912(int arg0, int arg1, int arg2) {
        class162 var3 = class220.field3787[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class163 var4 = var3.field2849;
            var3.field2849 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z[B)[B")
    public static final byte[] method913(boolean arg0, byte[] arg1) {
        ++field2329;
        if (!arg0) {
            method909(111, 12);
        }
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class143.method989(arg1, 0, var3, 0, var2);
        return var3;
    }
}
