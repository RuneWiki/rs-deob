import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class14 extends class142 {

    @OriginalMember(owner = "client!bc", name = "Q", descriptor = "I")
    private int field222 = 4096;

    @OriginalMember(owner = "client!bc", name = "X", descriptor = "I")
    private int field229 = 0;

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "Lai;")
    private static class10 field224 = class44.method278("Loaded interfaces", -62);

    @OriginalMember(owner = "client!bc", name = "V", descriptor = "Lai;")
    public static class10 field227 = field224;

    @OriginalMember(owner = "client!bc", name = "ab", descriptor = "Z")
    public static boolean field232 = false;

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!bc", name = "W", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!bc", name = "Z", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!bc", name = "bb", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!bc", name = "Y", descriptor = "Lte;")
    public static class177 field230;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)[I")
    public final int[] method6(boolean arg0, int arg1) {
        ++field225;
        if (arg0) {
            method90(115, 28);
        }
        int[] var3 = super.field2683.method1186((byte) -114, arg1);
        if (super.field2683.field3516) {
            int[] var4 = this.method963((byte) -121, 0, arg1);
            for (int var5 = 0; var5 < class133.field2499; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field229 >= ~var6 && this.field222 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        ++field231;
        if (arg2 >= -34) {
            this.method78((class114) null, 110, (byte) -78);
        }
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field222 = arg0.method762((byte) 125);
            }
        } else {
            this.field229 = arg0.method762((byte) 103);
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(B)V")
    public static void method88(byte arg0) {
        field230 = null;
        field224 = null;
        field227 = null;
        if (arg0 < 111) {
            method88((byte) 119);
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
    public class14() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(BI)Lkb;")
    public static final class93 method89(byte arg0, int arg1) {
        ++field228;
        class93 var2 = (class93) class155.field3003.method222(115, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class185.field3521.method159((byte) 86, arg1, 8);
            class93 var4 = new class93();
            if (var3 != null) {
                var4.method613(new class114(var3), 0);
            }
            if (arg0 >= -50) {
                return null;
            } else {
                class155.field3003.method225(-21284, (long) arg1, var4);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(II)V")
    public static final void method90(int arg0, int arg1) {
        ++field233;
        if (arg1 != -1) {
            if (class42.method270(arg1, (byte) -88)) {
                int var2 = 120 % ((-27 - arg0) / 55);
                class200[] var3 = class205.field3990[arg1];
                for (int var4 = 0; ~var4 > ~var3.length; ++var4) {
                    class200 var5 = var3[var4];
                    if (var5.field3872 != null) {
                        class5 var6 = new class5();
                        var6.field55 = var5;
                        var6.field53 = var5.field3872;
                        class162.method1074(116, 2000000, var6);
                    }
                }
            }
        }
    }
}
