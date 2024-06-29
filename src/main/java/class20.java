import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class20 extends class227 {

    @OriginalMember(owner = "client!an", name = "J", descriptor = "Z")
    public static boolean field180 = true;

    @OriginalMember(owner = "client!an", name = "M", descriptor = "I")
    public static int field183 = -1;

    @OriginalMember(owner = "client!an", name = "G", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!an", name = "I", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!an", name = "K", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!an", name = "L", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!an", name = "N", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!an", name = "O", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!an", name = "H", descriptor = "Lqj;")
    public static class355 field178;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lug;II)V", line = 6)
    public final void method61(class396 arg0, int arg1, int arg2) {
        if (~arg2 == -1) {
            super.field3066 = arg0.method2388((byte) -122) == 1;
        }
        if (arg1 != 487215116) {
            this.method61((class396) null, -127, 17);
        }
        ++field179;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IZ)[[I", line = 23)
    public final int[][] method112(int arg0, boolean arg1) {
        ++field177;
        int[][] var3 = super.field3059.method28((byte) -107, arg0);
        if (!arg1) {
            method115(-67);
        }
        if (super.field3059.field57) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class446.field6486 < ~var7; ++var7) {
                this.method113(-57, arg0, var7);
                int[][] var8 = this.method1460(class123.field1604, 0, 0);
                var4[var7] = var8[0][class380.field5497];
                var5[var7] = var8[1][class380.field5497];
                var6[var7] = var8[2][class380.field5497];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(III)V", line = 65)
    private final void method113(int arg0, int arg1, int arg2) {
        ++field184;
        int var4 = class4.field37[arg2];
        if (arg0 > -33) {
            this.method62(-7, -100);
        }
        int var5 = class190.field2457[arg1];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class123.field1604 = arg1;
            class380.field5497 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class123.field1604 = arg2;
            class380.field5497 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class380.field5497 = class446.field6486 - arg1;
            class123.field1604 = arg2;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class123.field1604 = -arg1 + class305.field4055;
            class380.field5497 = arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class123.field1604 = class305.field4055 - arg1;
            class380.field5497 = -arg2 + class446.field6486;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class123.field1604 = -arg2 + class305.field4055;
            class380.field5497 = -arg1 + class446.field6486;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class123.field1604 = class305.field4055 - arg2;
            class380.field5497 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class123.field1604 = arg1;
            class380.field5497 = -arg2 + class446.field6486;
        }
        class123.field1604 &= class115.field1508;
        class380.field5497 &= class102.field1388;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(II)[I", line = 142)
    public final int[] method62(int arg0, int arg1) {
        ++field181;
        int[] var3 = super.field3068.method1970(arg1, (byte) 21);
        if (super.field3068.field4480) {
            for (int var4 = 0; var4 < class446.field6486; ++var4) {
                this.method113(-92, arg1, var4);
                int[] var5 = this.method1459(class123.field1604, 115, 0);
                var3[var4] = var5[class380.field5497];
            }
        }
        if (arg0 != 15811) {
            method115(14);
        }
        return var3;
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V", line = 175)
    public class20() {
        super(1, false);
    }

    @OriginalMember(owner = "client!an", name = "j", descriptor = "(I)V", line = 183)
    public static final void method114(int arg0) {
        class413.field5893.method1477((byte) 82);
        ++field182;
        class148.field1951.method351(-126);
        if (class452.field6754 != null) {
            class452.field6754.method604((byte) 77, class60.field701);
        }
        class216.field2949.method1817(arg0 ^ -6528);
        class60.field701.setBackground(Color.black);
        class6.field60 = arg0;
        class413.field5893 = class47.method269(false, class60.field701);
        class148.field1951 = class354.method2074(class60.field701, (byte) 89, true);
        if (class452.field6754 != null) {
            class452.field6754.method610(256, class60.field701);
        }
    }

    @OriginalMember(owner = "client!an", name = "k", descriptor = "(I)V", line = 205)
    public static void method115(int arg0) {
        field178 = null;
        if (arg0 != -7514) {
            field183 = 43;
        }
    }
}
