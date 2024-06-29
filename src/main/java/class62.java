import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class62 extends class145 {

    @OriginalMember(owner = "client!pv", name = "F", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!pv", name = "G", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!pv", name = "H", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!pv", name = "I", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!pv", name = "J", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!pv", name = "K", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "()V", line = 3)
    public class62() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IB)V", line = 7)
    public static final void method441(int arg0, byte arg1) {
        if (arg1 == 2) {
            ++field708;
            if (arg0 < 0 || arg0 > 2) {
                arg0 = 0;
            }
            class178.field2192 = arg0;
            class324.field4682 = new class211[class535.field7726[class178.field2192] + 1];
            class31.field350 = 0;
            class158.field1956 = 0;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(BI)[[I", line = 27)
    public final int[][] method75(byte arg0, int arg1) {
        ++field705;
        int[][] var3 = super.field1792.method1826(arg1, -16486);
        if (arg0 >= -28) {
            this.method75((byte) -67, 36);
        }
        if (super.field1792.field3917) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class647.field9368; ++var7) {
                this.method443(false, arg1, var7);
                int[][] var8 = this.method866(0, class5.field52, (byte) -120);
                var4[var7] = var8[0][class591.field8485];
                var5[var7] = var8[1][class591.field8485];
                var6[var7] = var8[2][class591.field8485];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIIIIII)V", line = 70)
    public static final void method442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field706;
        int var8 = class132.method818((byte) -93, arg4, class418.field6298, class461.field6877);
        int var9 = class132.method818((byte) -93, arg6, class418.field6298, class461.field6877);
        int var10 = class132.method818((byte) -93, arg2, class113.field1385, class4.field43);
        int var11 = class132.method818((byte) -93, arg7, class113.field1385, class4.field43);
        int var12 = class132.method818((byte) -93, arg4 - -arg0, class418.field6298, class461.field6877);
        int var13 = class132.method818((byte) -93, -arg0 + arg6, class418.field6298, class461.field6877);
        if (arg5 == 1) {
            for (int var14 = var8; ~var12 < ~var14; ++var14) {
                class645.method3675(103, class402.field6087[var14], arg3, var10, var11);
            }
            for (int var15 = var9; ~var15 < ~var13; --var15) {
                class645.method3675(111, class402.field6087[var15], arg3, var10, var11);
            }
            int var16 = class132.method818((byte) -93, arg0 + arg2, class113.field1385, class4.field43);
            int var17 = class132.method818((byte) -93, -arg0 + arg7, class113.field1385, class4.field43);
            for (int var18 = var12; ~var13 <= ~var18; ++var18) {
                int[] var19 = class402.field6087[var18];
                class645.method3675(arg5 ^ 116, var19, arg3, var10, var16);
                class645.method3675(106, var19, arg1, var16, var17);
                class645.method3675(arg5 ^ 97, var19, arg3, var17, var11);
            }
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IILrt;)V", line = 123)
    public final void method28(int arg0, int arg1, class194 arg2) {
        if (~arg0 == -1) {
            super.field1790 = arg2.method1177(255) == 1;
        }
        if (arg1 <= -67) {
            ++field704;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZI)[I", line = 139)
    public final int[] method27(boolean arg0, int arg1) {
        ++field707;
        if (arg0) {
            return null;
        } else {
            int[] var3 = super.field1779.method2069(-2, arg1);
            if (super.field1779.field4602) {
                for (int var4 = 0; ~class647.field9368 < ~var4; ++var4) {
                    this.method443(false, arg1, var4);
                    int[] var5 = this.method865(0, class5.field52, (byte) 71);
                    var3[var4] = var5[class591.field8485];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZII)V", line = 174)
    private final void method443(boolean arg0, int arg1, int arg2) {
        ++field703;
        int var4 = class601.field8779[arg2];
        int var5 = class573.field8270[arg1];
        if (!arg0) {
            float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class5.field52 = arg1;
                class591.field8485 = arg2;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class5.field52 = arg2;
                class591.field8485 = arg1;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class5.field52 = arg2;
                class591.field8485 = -arg1 + class647.field9368;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class5.field52 = -arg1 + class441.field6574;
                class591.field8485 = arg2;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class5.field52 = -arg1 + class441.field6574;
                class591.field8485 = -arg2 + class647.field9368;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class5.field52 = class441.field6574 - arg2;
                class591.field8485 = -arg1 + class647.field9368;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class591.field8485 = arg1;
                class5.field52 = class441.field6574 - arg2;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class591.field8485 = -arg2 + class647.field9368;
                class5.field52 = arg1;
            }
            class5.field52 &= class444.field6649;
            class591.field8485 &= class619.field8980;
        }
    }
}
