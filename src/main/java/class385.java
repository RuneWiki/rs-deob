import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class385 extends class331 {

    @OriginalMember(owner = "client!rg", name = "T", descriptor = "Ldj;")
    public class190 field5440;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "Lci;")
    public class261 field5430;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "[I")
    public static int[] field5433 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "I")
    public static int field5435 = 0;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public int field5426;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public int field5428;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    public int field5429;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    public int field5432;

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!rg", name = "P", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!rg", name = "Q", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!rg", name = "R", descriptor = "I")
    public static int field5438;

    @OriginalMember(owner = "client!rg", name = "S", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!rg", name = "U", descriptor = "I")
    public int field5441;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "Leo;")
    public static class162 field5427;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)Lbj;")
    public static final class130 method2468(int arg0) {
        if (arg0 != 6) {
            field5437 = -20;
        }
        field5434++;
        return class355.field5009.length > class170.field2357 ? class355.field5009[class170.field2357++] : null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZBI)I")
    public static final int method2469(int arg0, boolean arg1, byte arg2, int arg3) {
        field5436++;
        class411 var4 = class144.method878(arg1, arg0, -78);
        int var5 = 32 / ((-arg2 - 25) / 55);
        if (var4 == null) {
            return 0;
        } else if (arg3 >= 0 && arg3 < var4.field5902.length) {
            return var4.field5902[arg3];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "(I)V")
    public static void method2470(int arg0) {
        if (arg0 != 3) {
            method2468(-39);
        }
        field5427 = null;
        field5433 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIII)I")
    public static final int method2471(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5438++;
        int var7 = arg2 & 0x3;
        if ((arg5 & arg1) == 1) {
            int var8 = arg3;
            arg3 = arg6;
            arg6 = var8;
        }
        if (var7 == 0) {
            return arg4;
        } else if (var7 == 1) {
            return 7 + 1 - arg0 - arg3;
        } else if (var7 == 2) {
            return 1 + 7 - arg6 - arg4;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(B)V")
    public static final void method2472(byte arg0) {
        field5431++;
        class20 var1 = class369.method2351((byte) 71, 15, 0);
        var1.method148(-11806);
        if (arg0 < 10) {
            method2470(-97);
        }
    }

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "(I)V")
    public final void method2473(int arg0) {
        this.field5429 = this.field5440.field2736;
        this.field5428 = this.field5440.field2732;
        field5439++;
        this.field5432 = this.field5440.field2734;
        if (arg0 > -118) {
            return;
        }
        if (this.field5440.field2733 != null) {
            this.field5440.field2733.method122(this.field5430.field3726, this.field5430.field3716, this.field5430.field3724, class235.field3297);
        }
        this.field5426 = class235.field3297[0];
        this.field5441 = class235.field3297[2];
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Ldj;Lom;)V")
    public class385(class190 arg0, class209 arg1) {
        this.field5440 = arg0;
        this.field5430 = class8.method63(arg0.field2740, true);
        this.method2473(-124);
    }
}
