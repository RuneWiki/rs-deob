import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public abstract class class44 extends class21 {

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "Lii;")
    public class521 field648;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
    public int field642;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public int field633;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field623 = 0;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    private static int field640 = 0;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    public static int field638 = 0;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field629 = 0;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field620 = 0;

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "I")
    public static int field650 = 0;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
    public static int field639 = 0;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    private static int field625 = 0;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public int field626;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    private static int field630;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public int field634;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    private static int field636;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    private static int field637;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    public int field641;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "I")
    public int field646;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
    private static int field651;

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "[I")
    private int[] field631;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIII)V", line = 6)
    public final void method105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field648.method3098()) {
            throw new IllegalStateException();
        }
        if (this.field631 == null) {
            this.field631 = new int[4];
        }
        this.field648.method2163(this.field631);
        this.field648.method2090(this.field648.field7291, this.field648.field7309, arg0 + arg2, arg1 + arg3);
        int var8 = this.method116();
        int var9 = this.method108();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method104(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field648.method2097(this.field631[0], this.field631[1], this.field631[2], this.field631[3]);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(FFFFFF)Z", line = 54)
    private final boolean method300(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field642 + this.field626 + this.field634;
        int var8 = this.field646 + this.field633 + this.field641;
        if (this.field642 != var7 || this.field633 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field646 * var11;
            float var14 = (float) this.field646 * var12;
            float var15 = (float) this.field626 * var9;
            float var16 = (float) this.field626 * var10;
            float var17 = (float) this.field634 * -var9;
            float var18 = (float) this.field634 * -var10;
            float var19 = (float) this.field641 * -var11;
            float var20 = (float) this.field641 * -var12;
            arg0 += var13 + var15;
            arg1 += var14 + var16;
            arg2 += var13 + var17;
            arg3 += var14 + var18;
            arg4 += var15 + var19;
            arg5 += var16 + var20;
        }
        float var21 = arg2 + arg4 - arg0;
        float var22 = arg5 + arg3 - arg1;
        float var23;
        float var24;
        if (arg0 < arg2) {
            var23 = arg0;
            var24 = arg2;
        } else {
            var23 = arg2;
            var24 = arg0;
        }
        if (arg4 < var23) {
            var23 = arg4;
        }
        if (var21 < var23) {
            var23 = var21;
        }
        if (arg4 > var24) {
            var24 = arg4;
        }
        if (var21 > var24) {
            var24 = var21;
        }
        float var25;
        float var26;
        if (arg1 < arg3) {
            var25 = arg1;
            var26 = arg3;
        } else {
            var25 = arg3;
            var26 = arg1;
        }
        if (arg5 < var25) {
            var25 = arg5;
        }
        if (var22 < var25) {
            var25 = var22;
        }
        if (arg5 > var26) {
            var26 = arg5;
        }
        if (var22 > var26) {
            var26 = var22;
        }
        if (var23 < (float) this.field648.field7291) {
            var23 = this.field648.field7291;
        }
        if (var24 > (float) this.field648.field7283) {
            var24 = this.field648.field7283;
        }
        if (var25 < (float) this.field648.field7309) {
            var25 = this.field648.field7309;
        }
        if (var26 > (float) this.field648.field7320) {
            var26 = this.field648.field7320;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field644 = this.field648.field7315;
        field628 = (int) ((float) ((int) var25 * field644) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field621 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field642 / var29);
        field649 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field633 / var30);
        field622 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field642 / var30);
        field643 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field633 / var29);
        field636 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field651 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field624 = (this.field642 >> 1 << 12) + (field651 * field622 >> 4);
        field635 = (this.field633 >> 1 << 12) + (field651 * field643 >> 4);
        field627 = field636 * field621 >> 4;
        field645 = field649 * field636 >> 4;
        field637 = (int) var23;
        field632 = (int) var27;
        field630 = (int) var25;
        field647 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(IIII)V", line = 191)
    public final void method106(int arg0, int arg1, int arg2, int arg3) {
        this.field626 = arg0;
        this.field646 = arg1;
        this.field634 = arg2;
        this.field641 = arg3;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 197)
    public final void method103(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class571 arg7, int arg8, int arg9) {
        if (this.field648.method3098()) {
            throw new IllegalStateException();
        } else if (this.method300(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class293 var11 = (class293) arg7;
            this.method301(var11.field3826, var11.field3828, field637 - arg8, -arg9 - (field647 - field630));
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "()I", line = 211)
    public final int method116() {
        return this.field642 + this.field626 + this.field634;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(FFFFFFIIII)V", line = 226)
    public final void method123(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field648.method3098()) {
            throw new IllegalStateException();
        } else if (this.method300(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field652 = arg7;
            if (arg6 != 1) {
                field638 = arg7 >>> 24;
                field623 = 256 - field638;
                if (arg6 == 0) {
                    field639 = (arg7 & 0xFF0000) >> 16;
                    field629 = (arg7 & 0xFF00) >> 8;
                    field620 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field625 = arg7 >>> 24;
                    field640 = 256 - field625;
                    int var11 = (arg7 & 0xFF00FF) * field640 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field640 & 0xFF0000;
                    field650 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method302(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method302(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method302(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method302(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method302(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method302(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method302(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method302(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method302(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method302(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method302(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method302(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "()I", line = 327)
    public final int method115() {
        return this.field642;
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "()I", line = 337)
    public final int method117() {
        return this.field633;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "()I", line = 351)
    public final int method108() {
        return this.field646 + this.field633 + this.field641;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lii;II)V", line = 354)
    public class44(class521 arg0, int arg1, int arg2) {
        this.field648 = arg0;
        this.field642 = arg1;
        this.field633 = arg2;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method119(int arg0, int arg1, class571 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([I[III)V")
    public abstract void method301(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIII)V")
    public abstract void method104(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)V")
    public abstract void method302(int arg0, int arg1);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);
}
