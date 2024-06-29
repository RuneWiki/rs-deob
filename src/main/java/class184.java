import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class184 extends class27 {

    @OriginalMember(owner = "client!uc", name = "X", descriptor = "Z")
    private boolean field3633 = true;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "Z")
    private boolean field3624 = true;

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "I")
    public static int field3623 = 0;

    @OriginalMember(owner = "client!uc", name = "R", descriptor = "I")
    public static int field3627 = 0;

    @OriginalMember(owner = "client!uc", name = "S", descriptor = "[I")
    public static int[] field3628 = new int[25];

    @OriginalMember(owner = "client!uc", name = "U", descriptor = "Lkb;")
    public static class93 field3630 = class76.method390("Fallen lassen", 0);

    @OriginalMember(owner = "client!uc", name = "Z", descriptor = "I")
    public static int field3635 = 0;

    @OriginalMember(owner = "client!uc", name = "Q", descriptor = "Lkb;")
    public static class93 field3626 = class76.method390("Bitte warten Sie eine Minute", 0);

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!uc", name = "T", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!uc", name = "V", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!uc", name = "W", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!uc", name = "ab", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!uc", name = "bb", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!uc", name = "cb", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!uc", name = "Y", descriptor = "Lse;")
    public static class168 field3634;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIILdd;)V")
    public static final void method1193(int arg0, int arg1, int arg2, class34 arg3) {
        int var4 = 52 % ((arg1 - -7) / 56);
        ++field3636;
        if (~arg3.field2077 == ~arg2 && arg2 != -1) {
            int var5 = class39.method213(-10639, arg2).field604;
            if (var5 == 1) {
                arg3.field2062 = arg0;
                arg3.field2070 = 0;
                arg3.field2039 = 0;
                arg3.field2012 = 0;
            }
            if (var5 == 2) {
                arg3.field2070 = 0;
                return;
            }
        } else if (arg2 == -1 || ~arg3.field2077 == 0 || class39.method213(-10639, arg2).field607 >= class39.method213(-10639, arg3.field2077).field607) {
            arg3.field2050 = arg3.field2060;
            arg3.field2039 = 0;
            arg3.field2077 = arg2;
            arg3.field2062 = arg0;
            arg3.field2012 = 0;
            arg3.field2070 = 0;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        if (arg0 > 106) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (~arg1 == -3) {
                        super.field435 = ~arg2.method1054(128) == -2;
                    }
                } else {
                    this.field3633 = ~arg2.method1054(128) == -2;
                }
            } else {
                this.field3624 = arg2.method1054(128) == 1;
            }
            ++field3631;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)[[I")
    public final int[][] method19(int arg0, int arg1) {
        ++field3632;
        int var3 = -10 / ((arg0 - 42) / 54);
        int[][] var4 = super.field436.method537(0, arg1);
        if (super.field436.field1771) {
            int[][] var5 = this.method152(!this.field3633 ? arg1 : -arg1 + class190.field3715, 0, 100);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var4[0];
            int[] var9 = var5[2];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            if (this.field3624) {
                for (int var12 = 0; ~var12 > ~class159.field3209; ++var12) {
                    var8[var12] = var6[class78.field1402 - var12];
                    var10[var12] = var7[-var12 + class78.field1402];
                    var11[var12] = var9[-var12 + class78.field1402];
                }
            } else {
                for (int var13 = 0; class159.field3209 > var13; ++var13) {
                    var8[var13] = var6[var13];
                    var10[var13] = var7[var13];
                    var11[var13] = var9[var13];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V")
    public static void method1194(int arg0) {
        if (arg0 != 10734) {
            method1193(65, -68, 112, (class34) null);
        }
        field3630 = null;
        field3626 = null;
        field3628 = null;
        field3634 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)[I")
    public final int[] method55(int arg0, boolean arg1) {
        int[] var3 = super.field447.method1238(arg1, arg0);
        if (super.field447.field3737) {
            int[] var4 = this.method145(0, (byte) 121, this.field3633 ? -arg0 + class190.field3715 : arg0);
            if (!this.field3624) {
                class90.method472(var4, 0, var3, 0, class159.field3209);
            } else {
                for (int var5 = 0; ~var5 > ~class159.field3209; ++var5) {
                    var3[var5] = var4[class78.field1402 - var5];
                }
            }
        }
        ++field3637;
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
    public class184() {
        super(1, false);
    }
}
