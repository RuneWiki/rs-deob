import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class240 extends class53 {

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    public int field4203 = 0;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "S")
    public static short field4197 = 256;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "[[B")
    public static byte[][] field4201 = new byte[50][];

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "Ltg;")
    public static class180 field4204;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZLlj;)V")
    public final void method1629(boolean arg0, class25 arg1) {
        if (arg0) {
            return;
        }
        field4198++;
        while (true) {
            int var3 = arg1.method189((byte) -103);
            if (var3 == 0) {
                return;
            }
            this.method1630(arg1, -3, var3);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Llj;II)V")
    private final void method1630(class25 arg0, int arg1, int arg2) {
        field4200++;
        if (~arg2 == arg1) {
            this.field4203 = arg0.method193((byte) 77);
        }
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)V")
    public static void method1631(int arg0) {
        if (arg0 != 16) {
            field4197 = -60;
        }
        field4204 = null;
        field4201 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1632(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class182.field3204 * arg3 + class158.field2762 * arg0 >> 16;
        int var6 = class158.field2762 * arg3 - class182.field3204 * arg0 >> 16;
        int var7 = class66.field1112 * var6 + class113.field1960 * arg1 >> 16;
        int var8 = class66.field1112 * arg1 - class113.field1960 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class66.field1112 * var6 + class113.field1960 * arg2 >> 16;
        int var12 = class66.field1112 * arg2 - class113.field1960 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class37.field663 && var13 < class37.field663) {
            return false;
        } else if (var9 > class162.field2831 && var13 > class162.field2831) {
            return false;
        } else if (var10 < class13.field262 && var14 < class13.field262) {
            return false;
        } else {
            return var10 <= class211.field3623 || var14 <= class211.field3623;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)V")
    public static final void method1633(int arg0, int arg1) {
        if (arg1 == 16) {
            field4199++;
            if (arg0 >= 0 && arg0 < class101.field1647.length) {
                class101.field1647[arg0] = !class101.field1647[arg0];
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)V")
    public static final void method1634(int arg0) {
        if (arg0 <= -109) {
            field4202++;
            class24.field434.method146(-1);
            class264.field4652.method270((byte) 50);
            class49.field805.method270((byte) 77);
        }
    }
}
