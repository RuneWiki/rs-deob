import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class645 extends class335 {

    @OriginalMember(owner = "client!cfa", name = "C", descriptor = "Ltt;")
    public static class338 field8925 = new class338(49, 3);

    @OriginalMember(owner = "client!cfa", name = "B", descriptor = "I")
    public static int field8924;

    @OriginalMember(owner = "client!cfa", name = "D", descriptor = "I")
    public static int field8926;

    @OriginalMember(owner = "client!cfa", name = "E", descriptor = "I")
    public static int field8927;

    @OriginalMember(owner = "client!cfa", name = "F", descriptor = "I")
    public static int field8928;

    @OriginalMember(owner = "client!cfa", name = "G", descriptor = "I")
    public static int field8929;

    @OriginalMember(owner = "client!cfa", name = "H", descriptor = "I")
    public static int field8930;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lwv;B)Lwv;", line = 4)
    public static final class423 method3586(class423 arg0, byte arg1) {
        if (arg1 >= -121) {
            return null;
        } else {
            ++field8926;
            class423 var2 = client.method3861(arg0);
            if (var2 == null) {
                var2 = arg0.field5660;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "()V", line = 22)
    public class645() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IILjava/lang/String;)I", line = 30)
    public static final int method3587(int arg0, int arg1, String arg2) {
        if (arg0 <= 109) {
            field8927 = 33;
        }
        ++field8930;
        return class110.method598(arg2, arg1, -115, true);
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ZI)[I", line = 43)
    public final int[] method3(boolean arg0, int arg1) {
        ++field8929;
        if (!arg0) {
            return null;
        } else {
            int[] var3 = super.field4525.method2344(-2, arg1);
            if (super.field4525.field5435) {
                int[][] var4 = this.method1968(arg1, 3, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                for (int var8 = 0; ~var8 > ~class649.field8968; ++var8) {
                    var3[var8] = (var5[var8] - -var6[var8] - -var7[var8]) / 3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "d", descriptor = "(I)V", line = 83)
    public static void method3588(int arg0) {
        if (arg0 >= -62) {
            method3586((class423) null, (byte) 26);
        }
        field8925 = null;
    }

    @OriginalMember(owner = "client!cfa", name = "e", descriptor = "(I)V", line = 95)
    public static final void method3589(int arg0) {
        ++field8928;
        int var1 = 125 / ((-22 - arg0) / 48);
        if (~class391.field5236 == -2 || class391.field5236 == 3 || class71.field843 != class391.field5236 && (class391.field5236 == 0 || ~class71.field843 == -1)) {
            class468.field6163 = 0;
            class289.field3820 = 0;
            class296.field3921.method3063((byte) -12);
        }
        class71.field843 = class391.field5236;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIZ)V", line = 114)
    public static final void method3590(int arg0, int arg1, boolean arg2) {
        ++field8924;
        class16 var3 = class351.method2078(0, arg2, arg0);
        if (var3 != null) {
            for (int var4 = arg1; var4 < var3.field213.length; ++var4) {
                var3.field213[var4] = -1;
                var3.field212[var4] = 0;
            }
        }
    }
}
