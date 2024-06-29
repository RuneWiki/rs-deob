import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class302 extends class424 {

    @OriginalMember(owner = "client!pr", name = "M", descriptor = "Z")
    public static boolean field4118 = false;

    @OriginalMember(owner = "client!pr", name = "N", descriptor = "I")
    public static int field4119 = 0;

    @OriginalMember(owner = "client!pr", name = "P", descriptor = "Ljava/lang/String;")
    public static String field4121 = null;

    @OriginalMember(owner = "client!pr", name = "L", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!pr", name = "T", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!pr", name = "U", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!pr", name = "O", descriptor = "Lij;")
    public static class316 field4120;

    @OriginalMember(owner = "client!pr", name = "R", descriptor = "Ljava/lang/String;")
    public static String field4123;

    @OriginalMember(owner = "client!pr", name = "S", descriptor = "[I")
    public static int[] field4124;

    @OriginalMember(owner = "client!pr", name = "Q", descriptor = "[[[B")
    public static byte[][][] field4122;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(IB)[I", line = 4)
    public final int[] method43(int arg0, byte arg1) {
        ++field4117;
        int[] var3 = super.field5892.method783(arg0, (byte) -126);
        if (arg1 != -10) {
            return null;
        } else {
            if (super.field5892.field1427) {
                int[][] var4 = this.method2624(true, 0, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                for (int var8 = 0; ~class303.field4135 < ~var8; ++var8) {
                    var3[var8] = (var5[var8] + var6[var8] - -var7[var8]) / 3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "(I)V", line = 43)
    public static final void method1833(int arg0) {
        if (~class350.field4719 > -1) {
            class258.field3572 = -1;
            class24.field312 = -1;
            class350.field4719 = 0;
        }
        ++field4126;
        if (class333.field4520 < class350.field4719) {
            class258.field3572 = -1;
            class350.field4719 = class333.field4520;
            class24.field312 = -1;
        }
        if (arg0 < 48) {
            field4118 = true;
        }
        if (~class274.field3747 > -1) {
            class24.field312 = -1;
            class274.field3747 = 0;
            class258.field3572 = -1;
        }
        if (class333.field4501 < class274.field3747) {
            class24.field312 = -1;
            class258.field3572 = -1;
            class274.field3747 = class333.field4501;
        }
    }

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "(I)V", line = 93)
    public static void method1834(int arg0) {
        field4121 = null;
        field4123 = null;
        if (arg0 != 1) {
            method1835(13);
        }
        field4122 = null;
        field4120 = null;
        field4124 = null;
    }

    @OriginalMember(owner = "client!pr", name = "i", descriptor = "(I)V", line = 108)
    public static final void method1835(int arg0) {
        ++field4125;
        class149.field2171 = arg0;
        class451.field6491.method1168(126);
        class317.field4324 = false;
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "()V", line = 120)
    public class302() {
        super(1, true);
    }
}
