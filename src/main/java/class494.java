import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class494 extends class337 {

    @OriginalMember(owner = "client!dq", name = "C", descriptor = "I")
    private int field7122 = 1365;

    @OriginalMember(owner = "client!dq", name = "B", descriptor = "I")
    private int field7121 = 0;

    @OriginalMember(owner = "client!dq", name = "F", descriptor = "I")
    private int field7124 = 20;

    @OriginalMember(owner = "client!dq", name = "G", descriptor = "I")
    private int field7125 = 0;

    @OriginalMember(owner = "client!dq", name = "M", descriptor = "I")
    public static int field7129 = 64;

    @OriginalMember(owner = "client!dq", name = "J", descriptor = "Lhn;")
    public static class509 field7127 = new class509(71, -1);

    @OriginalMember(owner = "client!dq", name = "P", descriptor = "[I")
    public static int[] field7132 = new int[16];

    @OriginalMember(owner = "client!dq", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field7133 = new String[100];

    @OriginalMember(owner = "client!dq", name = "O", descriptor = "Lob;")
    public static class521 field7131 = new class521(23, 7);

    @OriginalMember(owner = "client!dq", name = "E", descriptor = "I")
    public static int field7123;

    @OriginalMember(owner = "client!dq", name = "I", descriptor = "I")
    public static int field7126;

    @OriginalMember(owner = "client!dq", name = "K", descriptor = "I")
    public static int field7128;

    @OriginalMember(owner = "client!dq", name = "N", descriptor = "Lbo;")
    public static class515 field7130;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IB)[I", line = 3)
    public final int[] method179(int arg0, byte arg1) {
        ++field7128;
        int[] var3 = super.field5007.method512(arg0, 0);
        if (arg1 != -11) {
            field7130 = null;
        }
        if (super.field5007.field687) {
            for (int var4 = 0; ~class402.field5977 < ~var4; ++var4) {
                int var5 = (class109.field1530[var4] << 12) / this.field7122 + this.field7121;
                int var6 = (class505.field7381[arg0] << 12) / this.field7122 + this.field7125;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (~(var11 + var12) > -16385 && ~this.field7124 < ~var13) {
                    var10 = (var9 * var10 >> 12) * 2 - -var8;
                    var9 = var7 + var11 + -var12;
                    var11 = var9 * var9 >> 12;
                    ++var13;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = var13 >= this.field7124 + -1 ? 0 : (var13 << 12) / this.field7124;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(BILhp;)V", line = 63)
    public final void method177(byte arg0, int arg1, class217 arg2) {
        int var4 = 119 / ((arg0 - 82) / 40);
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 == -4) {
                        this.field7125 = arg2.method1511(81);
                    }
                } else {
                    this.field7121 = arg2.method1511(98);
                }
            } else {
                this.field7124 = arg2.method1511(119);
            }
        } else {
            this.field7122 = arg2.method1511(118);
        }
        ++field7123;
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V", line = 116)
    public class494() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIIIII)V", line = 147)
    public static final void method2938(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7126;
        class403.method2523((byte) 122, arg6);
        int var7 = arg1;
        int var8 = -arg0 + arg6;
        if (~var8 > -1) {
            var8 = 0;
        }
        int var9 = arg6;
        int var10 = -arg6;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class416.field6200[arg2];
        int var16 = -var8 + arg4;
        class359.method2255((byte) -105, var15, var16, -arg6 + arg4, arg3);
        int var17 = arg4 + var8;
        class359.method2255((byte) -96, var15, var17, var16, arg5);
        class359.method2255((byte) -65, var15, arg4 + arg6, var17, arg3);
        while (~var9 < ~var7) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class150.field2249[var11] = var7;
                --var11;
                var12 -= var11 << 1;
            }
            ++var7;
            if (~var10 <= -1) {
                --var9;
                if (var8 <= var9) {
                    int[] var18 = class416.field6200[arg2 + var9];
                    int[] var19 = class416.field6200[-var9 + arg2];
                    int var20 = arg4 - -var7;
                    int var21 = -var7 + arg4;
                    class359.method2255((byte) -73, var18, var20, var21, arg3);
                    class359.method2255((byte) -116, var19, var20, var21, arg3);
                } else {
                    int[] var22 = class416.field6200[arg2 + var9];
                    int[] var23 = class416.field6200[-var9 + arg2];
                    int var24 = class150.field2249[var9];
                    int var25 = arg4 + var7;
                    int var26 = -var7 + arg4;
                    int var27 = arg4 - -var24;
                    int var28 = -var24 + arg4;
                    class359.method2255((byte) -81, var22, var28, var26, arg3);
                    class359.method2255((byte) -91, var22, var27, var28, arg5);
                    class359.method2255((byte) -127, var22, var25, var27, arg3);
                    class359.method2255((byte) -76, var23, var28, var26, arg3);
                    class359.method2255((byte) -87, var23, var27, var28, arg5);
                    class359.method2255((byte) -110, var23, var25, var27, arg3);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class416.field6200[arg2 + var7];
            int[] var30 = class416.field6200[-var7 + arg2];
            int var31 = arg4 + var9;
            int var32 = arg4 - var9;
            if (var7 >= var8) {
                class359.method2255((byte) -74, var29, var31, var32, arg3);
                class359.method2255((byte) -108, var30, var31, var32, arg3);
            } else {
                int var33 = ~var11 <= ~var7 ? var11 : class150.field2249[var7];
                int var34 = arg4 - -var33;
                int var35 = -var33 + arg4;
                class359.method2255((byte) -104, var29, var35, var32, arg3);
                class359.method2255((byte) -80, var29, var34, var35, arg5);
                class359.method2255((byte) -122, var29, var31, var34, arg3);
                class359.method2255((byte) -100, var30, var35, var32, arg3);
                class359.method2255((byte) -108, var30, var34, var35, arg5);
                class359.method2255((byte) -121, var30, var31, var34, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "(I)V", line = 273)
    public static void method2939(int arg0) {
        if (arg0 != 0) {
            field7130 = null;
        }
        field7127 = null;
        field7133 = null;
        field7132 = null;
        field7131 = null;
        field7130 = null;
    }
}
