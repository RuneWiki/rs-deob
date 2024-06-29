import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class9 extends class175 {

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "I")
    public static int field143 = 0;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
    public static int field145 = 0;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "[I")
    public static int[] field144 = new int[2];

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "Lmb;")
    private static class96 field148 = class243.method1708("Connected to update server", (byte) 116);

    @OriginalMember(owner = "client!ub", name = "Z", descriptor = "Lmb;")
    public static class96 field153 = class243.method1708(")4p=", (byte) 96);

    @OriginalMember(owner = "client!ub", name = "eb", descriptor = "Lmb;")
    public static class96 field158 = field148;

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "I")
    public static int field149 = 100;

    @OriginalMember(owner = "client!ub", name = "cb", descriptor = "Lmb;")
    public static class96 field156 = class243.method1708("", (byte) 95);

    @OriginalMember(owner = "client!ub", name = "gb", descriptor = "[I")
    public static int[] field160 = new int[128];

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
    public static int field151 = 0;

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "Lmb;")
    private static class96 field146 = class243.method1708("", (byte) 100);

    @OriginalMember(owner = "client!ub", name = "ib", descriptor = "Lmb;")
    public static class96 field162 = field146;

    @OriginalMember(owner = "client!ub", name = "jb", descriptor = "I")
    public static int field163 = 0;

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!ub", name = "Y", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!ub", name = "ab", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!ub", name = "bb", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!ub", name = "db", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!ub", name = "hb", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!ub", name = "kb", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!ub", name = "lb", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!ub", name = "fb", descriptor = "[[[B")
    public static byte[][][] field159;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(B)Lka;")
    public static final class174 method69(byte arg0) {
        ++field152;
        byte[] var1 = class217.field3724[0];
        int var2 = class31.field490[0] * class170.field2982[0];
        int[] var3 = new int[var2];
        if (arg0 >= -85) {
            field156 = null;
        }
        for (int var4 = 0; ~var2 < ~var4; ++var4) {
            var3[var4] = class139.field2492[class130.method985(255, var1[var4])];
        }
        class174 var5 = new class174(class249.field4309, class109.field2019, class241.field4187[0], class176.field3064[0], class31.field490[0], class170.field2982[0], var3);
        class192.method1344(0);
        return var5;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZB)V")
    public static final void method70(boolean arg0, byte arg1) {
        if (arg1 != 78) {
            method75(82);
        }
        ++field157;
        if (arg0 == !class177.field3072) {
            class177.field3072 = arg0;
            class276.method1866(false);
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class9() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)Lbc;")
    public static final class133 method71(int arg0, int arg1) {
        ++field161;
        class133 var2 = (class133) class122.field2250.method158((long) arg0, (byte) -100);
        if (var2 != null) {
            return var2;
        } else {
            if (arg1 != 3) {
                field153 = null;
            }
            byte[] var3 = class150.field2640.method23(arg0, 103, 5);
            class133 var4 = new class133();
            if (var3 != null) {
                var4.method1002(20270, new class239(var3));
            }
            class122.field2250.method155((long) arg0, var4, (byte) 114);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(B)V")
    public static void method72(byte arg0) {
        field156 = null;
        if (arg0 < -32) {
            field148 = null;
            field162 = null;
            field159 = null;
            field144 = null;
            field146 = null;
            field160 = null;
            field158 = null;
            field153 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lff;IZI)[Lrf;")
    public static final class30[] method73(class3 arg0, int arg1, boolean arg2, int arg3) {
        ++field150;
        if (!class224.method1530(arg1, arg3, (byte) 109, arg0)) {
            return null;
        } else {
            if (arg2) {
                method69((byte) -52);
            }
            return class44.method341((byte) 124);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)[I")
    public final int[] method1(byte arg0, int arg1) {
        ++field164;
        int[] var3 = super.field3044.method904((byte) 84, arg1);
        if (super.field3044.field2150) {
            int[][] var4 = this.method1253(arg1, -2880, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; class1.field11 > var8; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        int var9 = 5 / ((62 - arg0) / 54);
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIILhg;IBI)V")
    public static final void method74(int arg0, int arg1, int arg2, class260 arg3, int arg4, byte arg5, int arg6) {
        class201.method1409(arg3.field4533, arg2, arg6, arg3.field4511, arg4, arg1, 8639, arg0);
        if (arg5 > -69) {
            method75(-69);
        }
        ++field154;
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
    public static final void method75(int arg0) {
        for (int var1 = 0; ~var1 > ~class175.field3052; ++var1) {
            class86 var2 = class85.method621((byte) 31, var1);
            if (var2 != null && var2.field1451 == 0) {
                class44.field758[var1] = 0;
                class54.field937[var1] = 0;
            }
        }
        class245.field4257 = new class146(arg0);
        ++field147;
    }
}
