import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class87 extends class337 {

    @OriginalMember(owner = "client!hw", name = "F", descriptor = "I")
    public static int field1247 = 0;

    @OriginalMember(owner = "client!hw", name = "B", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!hw", name = "D", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!hw", name = "E", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!hw", name = "G", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!hw", name = "H", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!hw", name = "I", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IB)[I", line = 3)
    public final int[] method179(int arg0, byte arg1) {
        ++field1249;
        int[] var3 = super.field5007.method512(arg0, 0);
        if (arg1 != -11) {
            this.method177((byte) -12, -112, (class217) null);
        }
        if (super.field5007.field687) {
            for (int var4 = 0; ~var4 > ~class402.field5977; ++var4) {
                this.method725(-2048, arg0, var4);
                int[] var5 = this.method2124(class443.field6514, 0, arg1 ^ 55);
                var3[var4] = var5[class229.field3739];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(BILhp;)V", line = 38)
    public final void method177(byte arg0, int arg1, class217 arg2) {
        if (arg1 == 0) {
            super.field5019 = arg2.method1515((byte) 121) == 1;
        }
        int var4 = 100 % ((82 - arg0) / 40);
        ++field1248;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)[[I", line = 52)
    public final int[][] method673(int arg0, int arg1) {
        ++field1250;
        int var3 = -28 % ((-41 - arg1) / 49);
        int[][] var4 = super.field5011.method1410(arg0, 31649);
        if (super.field5011.field3346) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class402.field5977 < ~var8; ++var8) {
                this.method725(-2048, arg0, var8);
                int[][] var9 = this.method2123(class443.field6514, 0, -113);
                var5[var8] = var9[0][class229.field3739];
                var6[var8] = var9[1][class229.field3739];
                var7[var8] = var9[2][class229.field3739];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!hw", name = "i", descriptor = "(I)Z", line = 93)
    public static final boolean method724(int arg0) {
        ++field1246;
        if (arg0 != 21326) {
            method724(-88);
        }
        return class245.field3854;
    }

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "(III)V", line = 104)
    private final void method725(int arg0, int arg1, int arg2) {
        ++field1245;
        int var4 = class109.field1530[arg2];
        int var5 = class505.field7381[arg1];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (arg0 + var5));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class229.field3739 = arg2;
            class443.field6514 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class229.field3739 = arg1;
            class443.field6514 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class443.field6514 = arg2;
            class229.field3739 = -arg1 + class402.field5977;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class229.field3739 = arg2;
            class443.field6514 = -arg1 + class329.field4952;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class229.field3739 = -arg2 + class402.field5977;
            class443.field6514 = -arg1 + class329.field4952;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class443.field6514 = -arg2 + class329.field4952;
            class229.field3739 = class402.field5977 - arg1;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class443.field6514 = -arg2 + class329.field4952;
            class229.field3739 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class229.field3739 = -arg2 + class402.field5977;
            class443.field6514 = arg1;
        }
        class229.field3739 &= class446.field6541;
        class443.field6514 &= class123.field1843;
    }

    @OriginalMember(owner = "client!hw", name = "<init>", descriptor = "()V", line = 175)
    public class87() {
        super(1, false);
    }
}
