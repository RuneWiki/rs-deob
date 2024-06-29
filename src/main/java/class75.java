import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class75 extends class273 {

    @OriginalMember(owner = "client!jk", name = "J", descriptor = "Lak;")
    public static class19 field1226 = null;

    @OriginalMember(owner = "client!jk", name = "O", descriptor = "Ljava/lang/String;")
    public static String field1231 = "Loaded config";

    @OriginalMember(owner = "client!jk", name = "Q", descriptor = "[I")
    public static int[] field1233 = new int[14];

    @OriginalMember(owner = "client!jk", name = "S", descriptor = "Ljava/lang/String;")
    public static String field1235 = "Please remove ";

    @OriginalMember(owner = "client!jk", name = "K", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!jk", name = "L", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!jk", name = "M", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!jk", name = "N", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!jk", name = "P", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!jk", name = "R", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!jk", name = "T", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BII)V")
    private final void method597(byte arg0, int arg1, int arg2) {
        ++field1230;
        int var4 = class265.field4234[arg1];
        if (arg0 >= -58) {
            this.method3(-11, 2);
        }
        int var5 = class255.field4068[arg2];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class85.field1391 = arg2;
            class295.field4681 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class295.field4681 = arg2;
            class85.field1391 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class85.field1391 = arg1;
            class295.field4681 = class26.field458 - arg2;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class295.field4681 = arg1;
            class85.field1391 = class67.field1129 - arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class295.field4681 = -arg1 + class26.field458;
            class85.field1391 = -arg2 + class67.field1129;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class295.field4681 = -arg2 + class26.field458;
            class85.field1391 = class67.field1129 - arg1;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class295.field4681 = arg2;
            class85.field1391 = -arg1 + class67.field1129;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class295.field4681 = -arg1 + class26.field458;
            class85.field1391 = arg2;
        }
        class85.field1391 &= class145.field2392;
        class295.field4681 &= client.field4573;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(III)Lge;")
    public static final class249 method598(int arg0, int arg1, int arg2) {
        class129 var3 = class26.field455[arg0][arg1][arg2];
        return var3 != null && var3.field2133 != null ? var3.field2133 : null;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
    public class75() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        ++field1227;
        if (~arg1 == -1) {
            super.field4358 = arg0.method1012(arg2 ^ 1) == 1;
        }
        if (arg2 != 5) {
            field1231 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        ++field1232;
        if (arg0) {
            field1231 = null;
        }
        int[] var3 = super.field4359.method387((byte) -116, arg1);
        if (super.field4359.field833) {
            for (int var4 = 0; ~class26.field458 < ~var4; ++var4) {
                this.method597((byte) -119, var4, arg1);
                int[] var5 = this.method1850(class85.field1391, 0, (byte) 61);
                var3[var4] = var5[class295.field4681];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method599(int arg0, Component arg1) {
        if (arg0 == -11987) {
            ++field1228;
            arg1.removeKeyListener(class229.field3651);
            arg1.removeFocusListener(class229.field3651);
            class104.field1593 = -1;
        }
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(B)V")
    public static void method600(byte arg0) {
        if (arg0 >= -84) {
            field1233 = null;
        }
        field1231 = null;
        field1235 = null;
        field1233 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)[[I")
    public final int[][] method3(int arg0, int arg1) {
        ++field1229;
        if (arg0 <= 122) {
            return null;
        } else {
            int[][] var3 = super.field4357.method1949(true, arg1);
            if (super.field4357.field4631) {
                int[] var4 = var3[2];
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                for (int var7 = 0; ~class26.field458 < ~var7; ++var7) {
                    this.method597((byte) -73, var7, arg1);
                    int[][] var8 = this.method1853(0, class85.field1391, (byte) 8);
                    var5[var7] = var8[0][class295.field4681];
                    var6[var7] = var8[1][class295.field4681];
                    var4[var7] = var8[2][class295.field4681];
                }
            }
            return var3;
        }
    }
}
