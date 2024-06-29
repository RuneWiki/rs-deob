import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class54 extends class69 {

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public int field761 = 0;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "Ljava/lang/String;")
    public static String field757 = "white:";

    @OriginalMember(owner = "client!de", name = "B", descriptor = "Lui;")
    public static class239 field765 = new class239(64);

    @OriginalMember(owner = "client!de", name = "I", descriptor = "[I")
    public static int[] field772 = new int[50];

    @OriginalMember(owner = "client!de", name = "J", descriptor = "I")
    public static int field773 = -1;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "Ljava/lang/String;")
    public static String field774 = "Connecting to update server";

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public int field748;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public int field751;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "I")
    public int field752;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public int field754;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public int field755;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "I")
    public int field758;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    public int field759;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "I")
    public int field762;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "I")
    public int field763;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "I")
    public int field766;

    @OriginalMember(owner = "client!de", name = "F", descriptor = "I")
    public int field769;

    @OriginalMember(owner = "client!de", name = "H", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "Lfi;")
    public class235 field768;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "Lhk;")
    public class275 field750;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "Ltc;")
    public class35 field749;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "Ltc;")
    public class35 field764;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "Lvj;")
    public class94 field767;

    @OriginalMember(owner = "client!de", name = "G", descriptor = "Z")
    public boolean field770;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "[I")
    public int[] field760;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)Z")
    public static final boolean method418(int arg0, int arg1, int arg2) {
        int var3 = class44.field521[arg0][arg1][arg2];
        if (-class136.field2263 == var3) {
            return false;
        } else if (class136.field2263 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class93.method651(var4 + 1, class229.field3641[arg0][arg1][arg2], var5 + 1) && class93.method651(var4 + 128 - 1, class229.field3641[arg0][arg1 + 1][arg2], var5 + 1) && class93.method651(var4 + 128 - 1, class229.field3641[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class93.method651(var4 + 1, class229.field3641[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class44.field521[arg0][arg1][arg2] = class136.field2263;
                return true;
            } else {
                class44.field521[arg0][arg1][arg2] = -class136.field2263;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public final void method419(byte arg0) {
        field753++;
        int var2 = this.field759;
        if (arg0 >= -50) {
            return;
        }
        if (this.field767 != null) {
            class94 var3 = this.field767.method658(3834);
            if (var3 == null) {
                this.field759 = -1;
                this.field763 = 0;
                this.field760 = null;
                this.field754 = 0;
                this.field758 = 0;
                this.field769 = 0;
            } else {
                this.field754 = var3.field1401 * 128;
                this.field758 = var3.field1344;
                this.field769 = var3.field1405;
                this.field760 = var3.field1399;
                this.field759 = var3.field1357;
                this.field763 = var3.field1385;
            }
        } else if (this.field750 != null) {
            int var4 = class9.method58(this.field750, false);
            if (var2 != var4) {
                this.field759 = var4;
                class265 var5 = this.field750.field4439;
                if (var5.field4271 != null) {
                    var5 = var5.method1794(-8159);
                }
                if (var5 == null) {
                    this.field758 = this.field754 = 0;
                } else {
                    this.field758 = var5.field4287;
                    this.field754 = var5.field4252 * 128;
                }
            }
        } else if (this.field768 != null) {
            this.field759 = class142.method966((byte) -104, this.field768);
            this.field754 = this.field768.field3752 * 128;
            this.field758 = this.field768.field3743;
        }
        if (this.field759 != var2 && this.field749 != null) {
            class215.field3464.method454(this.field749);
            this.field749 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method420(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field756++;
        int var8 = -99 % ((17 - arg2) / 45);
        int var9 = 0;
        int var10 = 0;
        int var11 = arg6 - arg0;
        int var12 = arg3 * arg3;
        int var13 = arg3 - arg0;
        int var14 = arg6 * arg6;
        int var15 = var13 * var13;
        int var16 = arg6;
        int var17 = var12 << 1;
        int var18 = var11 * var11;
        int var19 = var14 << 1;
        int var20 = var18 << 1;
        int var21 = var15 << 1;
        int var22 = var11 << 1;
        int var23 = arg6 << 1;
        int var24 = (1 - var22) * var15 + var20;
        int var25 = var14 - ((var23 - 1) * var17);
        int var26 = var18 - (var22 - 1) * var21;
        int var27 = (1 - var23) * var12 + var19;
        int var28 = var12 << 2;
        int var29 = var14 << 2;
        int var30 = var15 << 2;
        int var31 = var18 << 2;
        int var32 = var19 * 3;
        int var33 = (var23 - 3) * var17;
        int var34 = var20 * 3;
        int var35 = (var22 - 3) * var21;
        int var36 = (arg6 - 1) * var28;
        int var37 = var29;
        int var38 = var31;
        int var39 = (var11 - 1) * var30;
        int[] var40 = class85.field1162[arg4];
        class168.method1184(128, arg7 - var13, arg7 - arg3, arg1, var40);
        class168.method1184(128, arg7 + var13, arg7 - var13, arg5, var40);
        class168.method1184(128, arg3 + arg7, arg7 - -var13, arg1, var40);
        while (var16 > 0) {
            if (var27 < 0) {
                while (var27 < 0) {
                    var27 += var32;
                    var9++;
                    var25 += var37;
                    var32 += var29;
                    var37 += var29;
                }
            }
            boolean var41 = var11 >= var16;
            if (var41) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var26 += var38;
                        var24 += var34;
                        var10++;
                        var34 += var31;
                        var38 += var31;
                    }
                }
                if (var26 < 0) {
                    var26 += var38;
                    var38 += var31;
                    var24 += var34;
                    var34 += var31;
                    var10++;
                }
                var24 += -var39;
                var26 += -var35;
                var39 -= var30;
                var35 -= var30;
            }
            var16--;
            if (var25 < 0) {
                var25 += var37;
                var9++;
                var37 += var29;
                var27 += var32;
                var32 += var29;
            }
            int var42 = arg4 - var16;
            var27 += -var36;
            var36 -= var28;
            int var43 = arg7 - var9;
            int var44 = arg7 + var9;
            int var45 = arg4 + var16;
            var25 += -var33;
            if (var41) {
                int var46 = arg7 + var10;
                int var47 = arg7 - var10;
                class168.method1184(128, var47, var43, arg1, class85.field1162[var42]);
                class168.method1184(128, var46, var47, arg5, class85.field1162[var42]);
                class168.method1184(128, var44, var46, arg1, class85.field1162[var42]);
                class168.method1184(128, var47, var43, arg1, class85.field1162[var45]);
                class168.method1184(128, var46, var47, arg5, class85.field1162[var45]);
                class168.method1184(128, var44, var46, arg1, class85.field1162[var45]);
            } else {
                class168.method1184(128, var44, var43, arg1, class85.field1162[var42]);
                class168.method1184(128, var44, var43, arg1, class85.field1162[var45]);
            }
            var33 -= var28;
        }
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
    public static void method421(int arg0) {
        field772 = null;
        field765 = null;
        field757 = null;
        field774 = null;
        if (arg0 <= 23) {
            field765 = null;
        }
    }
}
