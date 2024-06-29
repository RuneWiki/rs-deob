import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class216 extends class7 {

    @OriginalMember(owner = "client!vg", name = "S", descriptor = "Z")
    private boolean field4110 = true;

    @OriginalMember(owner = "client!vg", name = "Z", descriptor = "Z")
    private boolean field4117 = true;

    @OriginalMember(owner = "client!vg", name = "X", descriptor = "Lpi;")
    public static class158 field4115 = new class158();

    @OriginalMember(owner = "client!vg", name = "eb", descriptor = "I")
    public static int field4122 = 0;

    @OriginalMember(owner = "client!vg", name = "fb", descriptor = "Lob;")
    private static class141 field4123 = class175.method1195(40, "Press (Wrecover a locked account(W on front page)3");

    @OriginalMember(owner = "client!vg", name = "db", descriptor = "Lob;")
    public static class141 field4121 = field4123;

    @OriginalMember(owner = "client!vg", name = "R", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!vg", name = "T", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!vg", name = "U", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!vg", name = "V", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!vg", name = "W", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!vg", name = "Y", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!vg", name = "ab", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!vg", name = "bb", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!vg", name = "cb", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIILra;I)V")
    public static final void method1406(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class170 arg6, int arg7) {
        ++field4111;
        if (class42.field824) {
            class53.field1008 = 32;
        } else {
            class53.field1008 = 0;
        }
        class42.field824 = false;
        if (class125.field2395 != 0) {
            if (arg4 <= arg2 && ~arg2 > ~(arg4 - -16) && arg7 <= arg1 && ~(arg7 + 16) < ~arg1) {
                arg6.field3383 -= 4;
                class38.method252(arg6, -96);
            } else if (~arg4 >= ~arg2 && ~(arg4 + 16) < ~arg2 && arg7 - 16 + arg5 <= arg1 && ~arg1 > ~(arg7 - -arg5)) {
                arg6.field3383 += 4;
                class38.method252(arg6, -78);
            } else if (~(-class53.field1008 + arg4) >= ~arg2 && ~(class53.field1008 + arg4 - -16) < ~arg2 && arg1 >= arg7 + 16 && ~arg1 > ~(arg5 + arg7 + -16)) {
                int var8 = (arg5 + -32) * arg5 / arg0;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = -var8 + arg5 + -32;
                int var10 = -16 - var8 / 2 + (arg1 - arg7);
                arg6.field3383 = (-arg5 + arg0) * var10 / var9;
                class38.method252(arg6, arg3 ^ 82);
                class42.field824 = true;
            }
        }
        if (arg3 == -16) {
            if (~class26.field507 != -1) {
                int var11 = arg6.field3299;
                if (-var11 + arg4 <= arg2 && ~arg7 >= ~arg1 && ~arg2 > ~(arg4 + 16) && arg5 + arg7 >= arg1) {
                    arg6.field3383 += class26.field507 * 45;
                    class38.method252(arg6, arg3 + -89);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(IB)[[I")
    public final int[][] method51(int arg0, byte arg1) {
        int var3 = -112 % ((-42 - arg1) / 41);
        ++field4112;
        int[][] var4 = super.field97.method1396(arg0, (byte) 45);
        if (super.field97.field4093) {
            int[][] var5 = this.method42(!this.field4117 ? arg0 : -arg0 + class54.field1050, -40, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            if (!this.field4110) {
                for (int var12 = 0; ~var12 > ~class117.field2272; ++var12) {
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                    var11[var12] = var8[var12];
                }
            } else {
                for (int var13 = 0; var13 < class117.field2272; ++var13) {
                    var9[var13] = var6[-var13 + class106.field2030];
                    var10[var13] = var7[-var13 + class106.field2030];
                    var11[var13] = var8[class106.field2030 - var13];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        int var4 = 57 % ((arg1 - 66) / 57);
        ++field4109;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field99 = arg2.method991(255) == 1;
                }
            } else {
                this.field4117 = ~arg2.method991(255) == -2;
            }
        } else {
            this.field4110 = ~arg2.method991(255) == -2;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLog;)V")
    public static final void method1407(byte arg0, class146 arg1) {
        if (arg0 != -128) {
            method1408((class170) null, 24, -13, 125);
        }
        ++field4120;
        byte[] var2 = new byte[24];
        if (class165.field3200 != null) {
            try {
                class165.field3200.method619((byte) 14, 0L);
                class165.field3200.method613(arg0 + 231, var2);
                int var3;
                for (var3 = 0; ~var3 > -25 && var2[var3] == 0; ++var3) {
                }
                if (~var3 <= -25) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; ++var4) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method987(24, var2, 2, 0);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        ++field4116;
        int[] var3 = super.field100.method842(arg1, 12);
        if (super.field100.field2534) {
            int[] var4 = this.method52(!this.field4117 ? arg1 : -arg1 + class54.field1050, 0, 81);
            if (this.field4110) {
                for (int var5 = 0; class117.field2272 > var5; ++var5) {
                    var3[var5] = var4[-var5 + class106.field2030];
                }
            } else {
                class149.method1042(var4, 0, var3, 0, class117.field2272);
            }
        }
        return arg0 < 13 ? null : var3;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lra;III)V")
    public static final void method1408(class170 arg0, int arg1, int arg2, int arg3) {
        ++field4119;
        if (class66.field1275 == null && !class114.field2180) {
            if (arg3 > -27) {
                field4123 = null;
            }
            if (arg0 != null && class65.method436((byte) -111, arg0) != null) {
                class66.field1275 = arg0;
                class204.field3915 = class65.method436((byte) 48, arg0);
                class17.field311 = 0;
                class202.field3826 = false;
                class213.field4069 = arg1;
                class195.field3732 = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "(I)V")
    public static final void method1409(int arg0) {
        ++field4114;
        if (arg0 == -16) {
            System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
            System.exit(1);
        }
    }

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "(I)V")
    public static void method1410(int arg0) {
        field4123 = null;
        field4115 = null;
        field4121 = null;
        if (arg0 != -3) {
            field4121 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZI)V")
    public static final void method1411(int arg0, boolean arg1, int arg2) {
        ++field4118;
        if (class66.method443(arg1, arg2)) {
            class224.method1440(arg0, class224.field4232[arg2], -15562);
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
    public class216() {
        super(1, false);
    }
}
