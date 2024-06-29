import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class100 extends class145 {

    @OriginalMember(owner = "client!oda", name = "F", descriptor = "Z")
    private boolean field1186 = true;

    @OriginalMember(owner = "client!oda", name = "N", descriptor = "Z")
    private boolean field1193 = true;

    @OriginalMember(owner = "client!oda", name = "G", descriptor = "Z")
    public static boolean field1187 = false;

    @OriginalMember(owner = "client!oda", name = "O", descriptor = "S")
    public static short field1194 = 1;

    @OriginalMember(owner = "client!oda", name = "E", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!oda", name = "H", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!oda", name = "I", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!oda", name = "K", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!oda", name = "L", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!oda", name = "M", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!oda", name = "P", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!oda", name = "Q", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!oda", name = "R", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IILrt;)V")
    public final void method28(int arg0, int arg1, class194 arg2) {
        if (arg1 < -67) {
            ++field1196;
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (~arg0 == -3) {
                        super.field1790 = ~arg2.method1177(255) == -2;
                    }
                } else {
                    this.field1186 = ~arg2.method1177(255) == -2;
                }
            } else {
                this.field1193 = ~arg2.method1177(255) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!oda", name = "i", descriptor = "(I)V")
    public static final void method618(int arg0) {
        class108.field1302.method352(class28.field294, !class595.field8694.field6555 ? -1 : class488.field7120 + 256 << 2, 0);
        ++field1197;
        if (arg0 != -31317) {
            method621(-48, (byte) 51, (String) null, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!oda", name = "<init>", descriptor = "()V")
    public class100() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(BI)[[I")
    public final int[][] method75(byte arg0, int arg1) {
        ++field1191;
        if (arg0 > -28) {
            this.method75((byte) -65, -100);
        }
        int[][] var3 = super.field1792.method1826(arg1, -16486);
        if (super.field1792.field3917) {
            int[][] var4 = this.method866(0, this.field1186 ? -arg1 + class444.field6649 : arg1, (byte) -89);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field1193) {
                for (int var11 = 0; var11 < class647.field9368; ++var11) {
                    var8[var11] = var5[-var11 + class619.field8980];
                    var9[var11] = var6[-var11 + class619.field8980];
                    var10[var11] = var7[-var11 + class619.field8980];
                }
            } else {
                for (int var12 = 0; class647.field9368 > var12; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Lqf;BLoa;)V")
    public static final void method619(class593 arg0, byte arg1, class605 arg2) {
        ++field1188;
        if (arg1 > -102) {
            field1195 = 32;
        }
        boolean var3 = class622.field8999.method23(!arg0.field8531 ? null : class439.field6548.field9470, arg0.field8624, 3, arg0.field8578, arg0.field8527, arg0.field8599 | -16777216, arg0.field8601, arg2) == null;
        if (var3) {
            class270.field3788.method706(new class163(arg0.field8601, arg0.field8624, arg0.field8578, -16777216 | arg0.field8599, arg0.field8527, arg0.field8531), true);
            class33.method187(arg0, (byte) 124);
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(ZI)[I")
    public final int[] method27(boolean arg0, int arg1) {
        ++field1185;
        if (arg0) {
            field1187 = true;
        }
        int[] var3 = super.field1779.method2069(-2, arg1);
        if (super.field1779.field4602) {
            int[] var4 = this.method865(0, !this.field1186 ? arg1 : class444.field6649 - arg1, (byte) 94);
            if (this.field1193) {
                for (int var5 = 0; var5 < class647.field9368; ++var5) {
                    var3[var5] = var4[class619.field8980 - var5];
                }
            } else {
                class210.method1325(var4, 0, var3, 0, class647.field9368);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oda", name = "j", descriptor = "(I)V")
    public static final void method620(int arg0) {
        if (~class251.field3570 == -2 || ~class251.field3570 == -4 || ~class27.field290 != ~class251.field3570 && (~class251.field3570 == -1 || ~class27.field290 == -1)) {
            class458.field6840 = 0;
            class387.field5958 = 0;
            class42.field456.method528(-519011192);
        }
        ++field1189;
        class27.field290 = class251.field3570;
        if (arg0 != 0) {
            field1192 = 113;
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IBLjava/lang/String;[B)I")
    public static final int method621(int arg0, byte arg1, String arg2, byte[] arg3) {
        ++field1190;
        int var4 = arg0;
        int var5 = arg2.length();
        int var6 = 12 % ((arg1 - -14) / 36);
        for (int var7 = 0; ~var7 > ~var5; var7 += 4) {
            int var8 = class381.method2446(-1, arg2.charAt(var7));
            int var9 = var5 > var7 + 1 ? class381.method2446(-1, arg2.charAt(var7 + 1)) : -1;
            int var10 = ~(var7 + 2) <= ~var5 ? -1 : class381.method2446(-1, arg2.charAt(var7 - -2));
            int var11 = var7 + 3 < var5 ? class381.method2446(-1, arg2.charAt(var7 - -3)) : -1;
            arg3[arg0++] = (byte) class283.method1834(var9 >>> 4, var8 << 2);
            if (~var10 == 0) {
                break;
            }
            arg3[arg0++] = (byte) class283.method1834(var10 >>> 2, class643.method3659(var9 << 4, 240));
            if (~var11 == 0) {
                break;
            }
            arg3[arg0++] = (byte) class283.method1834(class643.method3659(var10 << 6, 192), var11);
        }
        return -var4 + arg0;
    }
}
