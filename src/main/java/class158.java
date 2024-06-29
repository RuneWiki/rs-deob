import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class158 extends class35 {

    @OriginalMember(owner = "client!qh", name = "lc", descriptor = "I")
    public static int field2823 = 0;

    @OriginalMember(owner = "client!qh", name = "tc", descriptor = "Ltg;")
    public static class184 field2831 = class135.method812("Fehler beim Laden Ihres Spielcharakters)3", 3);

    @OriginalMember(owner = "client!qh", name = "qc", descriptor = "J")
    public static long field2828 = 0L;

    @OriginalMember(owner = "client!qh", name = "kc", descriptor = "Ltg;")
    private static class184 field2822 = class135.method812("Malformed login packet)3", 3);

    @OriginalMember(owner = "client!qh", name = "nc", descriptor = "I")
    public static int field2825 = 0;

    @OriginalMember(owner = "client!qh", name = "wc", descriptor = "Ltg;")
    public static class184 field2834 = class135.method812("", 3);

    @OriginalMember(owner = "client!qh", name = "vc", descriptor = "J")
    public static long field2833 = 0L;

    @OriginalMember(owner = "client!qh", name = "yc", descriptor = "Ltg;")
    public static class184 field2836 = field2822;

    @OriginalMember(owner = "client!qh", name = "oc", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!qh", name = "sc", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!qh", name = "xc", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!qh", name = "rc", descriptor = "Loe;")
    public static class137 field2829;

    @OriginalMember(owner = "client!qh", name = "pc", descriptor = "Lvb;")
    public static class197 field2827;

    @OriginalMember(owner = "client!qh", name = "uc", descriptor = "Lea;")
    public class41 field2832;

    @OriginalMember(owner = "client!qh", name = "mc", descriptor = "[I")
    public static int[] field2824;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method289(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field2830;
        if (this.field2832 != null) {
            class188 var11 = super.field612 != -1 && ~super.field630 == -1 ? class83.method465(super.field612, -1) : null;
            class188 var12 = ~super.field655 == 0 || super.field655 == super.field596 && var11 != null ? null : class83.method465(super.field655, -1);
            class140 var13 = this.field2832.method232((byte) -120, super.field600, var12, var11, super.field643);
            if (var13 != null) {
                var13.method870();
                super.field949 = var13.field949;
                if (~this.field2832.field787 != -1 && this.field2832.field762 != 0) {
                    int var14 = class23.field422[arg0];
                    short var15 = this.field2832.field762;
                    short var16 = this.field2832.field787;
                    int var17 = class23.field434[arg0];
                    int var18 = -var16 / 2;
                    int var19 = -var15 / 2;
                    int var20 = var14 * var19 + var17 * var18 >> 16;
                    int var21 = var17 * var19 + -(var14 * var18) >> 16;
                    int var22 = class115.method706(super.field635 + var20, class47.field892, 127, super.field614 + var21);
                    int var23 = -var15 / 2;
                    int var24 = var16 / 2;
                    int var25 = var14 * var23 + var17 * var24 >> 16;
                    int var26 = var17 * var23 + -(var14 * var24) >> 16;
                    int var27 = class115.method706(super.field635 + var25, class47.field892, 127, super.field614 - -var26);
                    int var28 = -var16 / 2;
                    int var29 = var15 / 2;
                    int var30 = var14 * var29 + var17 * var28 >> 16;
                    int var31 = var17 * var29 - var14 * var28 >> 16;
                    int var32 = class115.method706(super.field635 + var30, class47.field892, 127, super.field614 + var31);
                    int var33 = var16 / 2;
                    int var34 = var15 / 2;
                    int var35 = var14 * var34 + var17 * var33 >> 16;
                    int var36 = var17 * var34 + -(var14 * var33) >> 16;
                    int var37 = class115.method706(super.field635 - -var35, class47.field892, 127, super.field614 + var36);
                    int var38 = ~var22 > ~var27 ? var22 : var27;
                    int var39 = var27 >= var37 ? var37 : var27;
                    int var40 = var37 <= var32 ? var37 : var32;
                    int var41 = var32 > var22 ? var22 : var32;
                    int var42 = (var38 - -var39 + var40 + var41) / 4;
                    int var43 = (int) (320.0D * Math.atan2((double) (-var40 + var38), (double) var15)) & 2047;
                    var13.method862(var43);
                    int var44 = (int) (320.0D * Math.atan2((double) (-var39 + var41), (double) var16)) & 2047;
                    var13.method871(var44);
                    var13.method869(0, -super.field599 + var42, 0);
                }
                class140 var45 = null;
                if (super.field619 != -1 && super.field660 != -1) {
                    var45 = class74.method438((byte) 119, super.field619).method304(super.field660, 217);
                    if (var45 != null) {
                        var45.method869(0, -super.field638, 0);
                    }
                }
                if (var45 != null) {
                    var13 = ((class95) var13).method556(var45);
                }
                if (this.field2832.field784 == 1) {
                    var13.field2537 = true;
                }
                var13.method289(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V")
    public static final void method953(int arg0, int arg1) {
        class90 var2 = class190.field3704[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class90 var4 = class190.field3704[var3][arg0][arg1] = class190.field3704[var3 + 1][arg0][arg1];
            if (var4 != null) {
                --var4.field1672;
                for (int var5 = 0; var5 < var4.field1680; ++var5) {
                    class164 var6 = var4.field1686[var5];
                    if ((var6.field2934 >> 29 & 3L) == 2L && var6.field2954 == arg0 && var6.field2945 == arg1) {
                        --var6.field2941;
                    }
                }
            }
        }
        if (class190.field3704[0][arg0][arg1] == null) {
            class190.field3704[0][arg0][arg1] = new class90(0, arg0, arg1);
        }
        class190.field3704[0][arg0][arg1].field1675 = var2;
        class190.field3704[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(Z)V")
    public static void method954(boolean arg0) {
        field2827 = null;
        field2822 = null;
        field2824 = null;
        if (arg0) {
            field2822 = null;
        }
        field2831 = null;
        field2836 = null;
        field2829 = null;
        field2834 = null;
    }

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "(I)Z")
    public final boolean method213(int arg0) {
        if (arg0 != -30610) {
            method954(false);
        }
        ++field2835;
        return this.field2832 != null;
    }

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "(I)V")
    public static final void method955(int arg0) {
        ++field2826;
        if (arg0 < -99) {
            class65.field1244.method770(false);
        }
    }
}
