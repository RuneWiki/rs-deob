import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class283 extends class136 {

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "I")
    private int field4110 = 585;

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "Lfs;")
    public static class387 field4117;

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "Lwn;")
    public static class507 field4116;

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "[Lta;")
    public static class142[] field4115;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIBII)V")
    public static final void method1803(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field4112;
        if (arg2 < 28) {
            method1807(21, (String[]) null, (short[]) null);
        }
        class215 var5 = class171.method1208(arg3, (byte) 117, 10);
        var5.method1465(-25852);
        var5.field3081 = arg1;
        var5.field3077 = arg4;
        var5.field3082 = arg0;
    }

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "(I)V")
    public static void method1804(int arg0) {
        field4115 = null;
        field4116 = null;
        field4117 = null;
        if (arg0 != 0) {
            method1804(1);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILiv;)V")
    public final void method268(int arg0, int arg1, class65 arg2) {
        if (arg0 != 4) {
            method1806(-5);
        }
        if (~arg1 == -1) {
            this.field4110 = arg2.method623((byte) 118);
        }
        ++field4118;
    }

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "(I)V")
    public static final void method1805(int arg0) {
        if (arg0 != -22855) {
            field4116 = null;
        }
        ++field4120;
        if (!class411.field6112) {
            if (class478.field7044.field3352) {
                class328.field4588 = (float) (-128 & (int) class328.field4588 + 191);
            } else {
                class434.field6365 += (24.0F - class434.field6365) / 2.0F;
            }
            class531.field7820 = true;
            class411.field6112 = true;
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
    public class283() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "(I)V")
    public static final void method1806(int arg0) {
        class75.method709(4095, false);
        if (arg0 == 2048) {
            ++field4113;
            if (class149.field2114 >= 0 && class149.field2114 != 0) {
                class88.method780(class149.field2114, (byte) 52);
                class149.field2114 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I[Ljava/lang/String;[S)V")
    public static final void method1807(int arg0, String[] arg1, short[] arg2) {
        ++field4114;
        class12.method83(118, arg2, arg1, arg0, arg1.length + -1);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)[I")
    public final int[] method82(int arg0, int arg1) {
        ++field4119;
        int[] var3 = super.field1957.method2887((byte) -112, arg1);
        if (super.field1957.field7031) {
            int var4 = class290.field4168[arg1];
            for (int var5 = 0; ~var5 > ~class467.field6889; ++var5) {
                int var6 = class453.field6672[var5];
                if (~var6 < ~this.field4110 && -this.field4110 + 4096 > var6 && ~(2048 - this.field4110) > ~var4 && ~(2048 - -this.field4110) < ~var4) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 <= -1 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field4110 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~var6 < ~(-this.field4110 + 2048) && ~(2048 - -this.field4110) < ~var6) {
                    int var11 = var4 + -2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field4110;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field4110 + 2048);
                } else if (var4 >= this.field4110 && ~var4 >= ~(-this.field4110 + 4096)) {
                    if (~var6 <= ~this.field4110 && -this.field4110 + 4096 >= var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field4110 + 2048);
                        var3[var5] = 4096 - var18;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field4110;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field4110);
                }
            }
        }
        int var23 = 109 % ((67 - arg0) / 50);
        return var3;
    }

    static {
        new class331((String) null, "Spieler nicht auf deiner Freunde-Liste.", (String) null, (String) null);
    }
}
