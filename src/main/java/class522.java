import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class522 {

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "I")
    public int field7724 = 43594;

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "Z")
    public boolean field7726 = false;

    @OriginalMember(owner = "client!vt", name = "j", descriptor = "I")
    public int field7728 = 443;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "Lss;")
    public static class213 field7719 = new class213("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "Lss;")
    public static class213 field7723 = new class213("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "I")
    public static int field7720;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "I")
    public int field7722;

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "I")
    public static int field7727;

    @OriginalMember(owner = "client!vt", name = "k", descriptor = "I")
    public static int field7729;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "Ljava/lang/String;")
    public String field7721;

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "[Lo;")
    public static class139[] field7725;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lvt;B)Z")
    public final boolean method3120(class522 arg0, byte arg1) {
        int var3 = -91 / ((-arg1 - 62) / 63);
        field7729++;
        if (arg0 == null) {
            return false;
        } else {
            return this.field7722 == arg0.field7722 && this.field7721.equals(arg0.field7721);
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
    public static void method3121(int arg0) {
        field7723 = null;
        if (arg0 <= -75) {
            field7719 = null;
            field7725 = null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7727++;
        int var8 = 0;
        int var9 = arg3;
        int var10 = 0;
        int var11 = arg2 - arg6;
        int var12 = arg3 - arg6;
        int var13 = arg2 * arg2;
        int var14 = arg3 * arg3;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg3 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = arg7 * var19;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg3 - 1) * var27;
        int var37 = var30;
        if (arg0 >= class462.field7105 && arg0 <= class222.field3750) {
            int[] var38 = class103.field1521[arg0];
            int var39 = class405.method2598(class460.field7096, class178.field2609, arg5 - arg2, (byte) 96);
            int var40 = class405.method2598(class460.field7096, class178.field2609, arg2 + arg5, (byte) 100);
            int var41 = class405.method2598(class460.field7096, class178.field2609, arg5 - var11, (byte) 78);
            int var42 = class405.method2598(class460.field7096, class178.field2609, arg5 + var11, (byte) 96);
            class280.method1888(var39, var41, (byte) 82, var38, arg1);
            class280.method1888(var41, var42, (byte) 82, var38, arg4);
            class280.method1888(var42, var40, (byte) 82, var38, arg1);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var10++;
                        var33 += var30;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var10++;
                    var37 += var30;
                    var33 += var30;
                }
                var26 += -var34;
                var25 += -var43;
                var34 -= var29;
                var43 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var35 += var28;
                    var31 += var28;
                    var8++;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var8++;
                var35 += var28;
                var31 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var32 -= var27;
            var9--;
            var36 -= var27;
            int var45 = arg0 - var9;
            int var46 = arg0 + var9;
            if (var46 >= class462.field7105 && class222.field3750 >= var45) {
                int var47 = class405.method2598(class460.field7096, class178.field2609, arg5 + var8, (byte) 100);
                int var48 = class405.method2598(class460.field7096, class178.field2609, arg5 - var8, (byte) 101);
                if (var44) {
                    int var49 = class405.method2598(class460.field7096, class178.field2609, arg5 + var10, (byte) 78);
                    int var50 = class405.method2598(class460.field7096, class178.field2609, arg5 - var10, (byte) 115);
                    if (class462.field7105 <= var45) {
                        int[] var51 = class103.field1521[var45];
                        class280.method1888(var48, var50, (byte) 82, var51, arg1);
                        class280.method1888(var50, var49, (byte) 82, var51, arg4);
                        class280.method1888(var49, var47, (byte) 82, var51, arg1);
                    }
                    if (var46 <= class222.field3750) {
                        int[] var52 = class103.field1521[var46];
                        class280.method1888(var48, var50, (byte) 82, var52, arg1);
                        class280.method1888(var50, var49, (byte) 82, var52, arg4);
                        class280.method1888(var49, var47, (byte) 82, var52, arg1);
                    }
                } else {
                    if (class462.field7105 <= var45) {
                        class280.method1888(var48, var47, (byte) 82, class103.field1521[var45], arg1);
                    }
                    if (var46 <= class222.field3750) {
                        class280.method1888(var48, var47, (byte) 82, class103.field1521[var46], arg1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)I")
    public final int method3123(boolean arg0) {
        field7720++;
        if (arg0) {
            return this.field7726 ? this.field7728 : this.field7724;
        } else {
            return -45;
        }
    }
}
