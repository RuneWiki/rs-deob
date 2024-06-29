import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class52 extends class62 {

    @OriginalMember(owner = "client!nr", name = "G", descriptor = "Ljs;")
    public static class277 field605 = new class277();

    @OriginalMember(owner = "client!nr", name = "I", descriptor = "Ltda;")
    public static class546 field607 = new class546(12, 0, 1, 0);

    @OriginalMember(owner = "client!nr", name = "L", descriptor = "I")
    public static int field610 = 0;

    @OriginalMember(owner = "client!nr", name = "K", descriptor = "Lada;")
    public static class144 field609 = new class144(13, 8);

    @OriginalMember(owner = "client!nr", name = "M", descriptor = "Lada;")
    public static class144 field611 = new class144(113, 0);

    @OriginalMember(owner = "client!nr", name = "D", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!nr", name = "E", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!nr", name = "F", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!nr", name = "H", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!nr", name = "J", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "(I)V")
    public static final void method309(int arg0) {
        if (class446.method2706(true)) {
            if (class540.field8106 == null) {
                class287.method1780(-78660991);
            }
            class293.field4042 = true;
            class538.field8011 = 0;
            try {
                class146.field2126 = class460.field6511.getToolkit().getSystemClipboard();
            } catch (Exception var1) {
            }
        }
        ++field604;
        if (arg0 != 26557) {
            method312((class231) null, 43, 119, false);
        }
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(II)[I")
    public final int[] method13(int arg0, int arg1) {
        ++field603;
        if (arg1 != 656024161) {
            return null;
        } else {
            int[] var3 = super.field774.method3086(arg0, -2);
            if (super.field774.field7499) {
                int[][] var4 = this.method407(0, (byte) 41, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                for (int var8 = 0; ~var8 > ~class438.field5847; ++var8) {
                    var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "()V")
    public class52() {
        super(1, true);
    }

    @OriginalMember(owner = "client!nr", name = "i", descriptor = "(I)V")
    public static void method310(int arg0) {
        field609 = null;
        field607 = null;
        if (arg0 != 0) {
            method310(116);
        }
        field605 = null;
        field611 = null;
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(IBI)Z")
    public static final boolean method311(int arg0, byte arg1, int arg2) {
        int var3 = -117 / ((arg1 - 44) / 52);
        ++field602;
        return ~(2048 & arg0) != -1;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lup;IIZ)J")
    public static final long method312(class231 arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            method312((class231) null, -95, -8, false);
        }
        ++field608;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class145 var10 = class216.field3172.method1505(-24044, arg0.method183(-19248));
        long var11 = (long) (1073741824 | arg1 | arg2 << 7 | arg0.method173((byte) -123) << 14 | arg0.method170(-121) << 20);
        if (var10.field2056 == 0) {
            var11 |= var8;
        }
        if (var10.field2038 == 1) {
            var11 |= var4;
        }
        if (var10.field2035) {
            var11 |= var6;
        }
        return var11 | (long) arg0.method183(-19248) << 32;
    }
}
