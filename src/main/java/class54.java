import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class54 extends class105 {

    @OriginalMember(owner = "client!ff", name = "eb", descriptor = "Z")
    public static boolean field1046 = false;

    @OriginalMember(owner = "client!ff", name = "bb", descriptor = "[Ldg;")
    public static class37[] field1043 = new class37[4];

    @OriginalMember(owner = "client!ff", name = "hb", descriptor = "Leh;")
    public static class47 field1049 = class195.method1282((byte) -4, "headicons_pk");

    @OriginalMember(owner = "client!ff", name = "Y", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!ff", name = "ab", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!ff", name = "db", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!ff", name = "gb", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!ff", name = "ib", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!ff", name = "cb", descriptor = "Lmf;")
    public static class114 field1044;

    @OriginalMember(owner = "client!ff", name = "fb", descriptor = "[S")
    public static short[] field1047;

    @OriginalMember(owner = "client!ff", name = "Z", descriptor = "[[B")
    public static byte[][] field1041;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBLhd;)Leh;")
    public static final class47 method472(int arg0, byte arg1, class68 arg2) {
        ++field1048;
        try {
            class47 var3 = new class47();
            var3.field940 = arg2.method603((byte) -127);
            if (arg0 < var3.field940) {
                var3.field940 = arg0;
            }
            var3.field960 = new byte[var3.field940];
            arg2.field1454 += class110.field2288.method1267(true, arg2.field1454, arg2.field1495, var3.field960, var3.field940, 0);
            if (arg1 <= 74) {
                field1043 = null;
            }
            return var3;
        } catch (Exception var4) {
            return class178.field3415;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)[I")
    public final int[] method92(int arg0, byte arg1) {
        ++field1042;
        if (arg1 <= 78) {
            return null;
        } else {
            int[] var3 = super.field2192.method336(-83, arg0);
            if (super.field2192.field770) {
                int[][] var4 = this.method854(0, (byte) -72, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[2];
                int[] var7 = var4[1];
                for (int var8 = 0; ~var8 > ~class149.field2928; ++var8) {
                    var3[var8] = (var5[var8] + var7[var8] + var6[var8]) / 3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)V")
    public static void method473(byte arg0) {
        field1047 = null;
        field1041 = null;
        field1049 = null;
        field1044 = null;
        field1043 = null;
        if (arg0 != -75) {
            method472(48, (byte) -68, (class68) null);
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
    public class54() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(B)V")
    public static final void method474(byte arg0) {
        class195.field3803 = 99;
        class131.field2600 = new int[104];
        class2.field27 = new int[104];
        if (arg0 <= -32) {
            ++field1050;
            class197.field3846 = new byte[4][105][105];
            class67.field1440 = new byte[4][104][104];
            class33.field645 = new int[104];
            class123.field2488 = new byte[4][104][104];
            class67.field1432 = new int[104];
            class133.field2629 = new int[104];
            class105.field2191 = new byte[4][104][104];
            class148.field2911 = new int[4][105][105];
            class57.field1129 = new byte[4][104][104];
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)V")
    public static final void method475(int arg0, int arg1) {
        if (arg0 == 105) {
            ++field1040;
            class154.field3024 = arg1;
        }
    }
}
