import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class233 {

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    private int field3598 = 0;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "Ldb;")
    private class39 field3599;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field3602 = 2;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "Z")
    public static boolean field3601 = false;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "Lug;")
    private class181 field3597;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)Lug;")
    public final class181 method1584(int arg0) {
        field3603++;
        this.field3598 = arg0;
        return this.method1586(0);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZIIIII)V")
    public static final void method1585(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 - arg5;
        field3600++;
        int var7 = arg4 - arg3;
        if (var6 == 0) {
            if (var7 != 0) {
                class15.method103(arg3, arg1, arg4, 0, arg5);
            }
        } else if (var7 == 0) {
            class155.method1048(arg0, arg2, arg3, arg1, arg5);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg3 - (arg5 * var8 >> 12);
            int var10;
            int var11;
            if (arg5 < class196.field2961) {
                var10 = class196.field2961;
                var11 = (class196.field2961 * var8 >> 12) + var9;
            } else if (arg5 > class84.field1287) {
                var10 = class84.field1287;
                var11 = (class84.field1287 * var8 >> 12) + var9;
            } else {
                var10 = arg5;
                var11 = arg3;
            }
            if (class175.field2557 > var11) {
                var11 = class175.field2557;
                var10 = (class175.field2557 - var9 << 12) / var8;
            } else if (var11 > class91.field1381) {
                var10 = (class91.field1381 - var9 << 12) / var8;
                var11 = class91.field1381;
            }
            int var12;
            int var13;
            if (class196.field2961 > arg2) {
                var12 = class196.field2961;
                var13 = (class196.field2961 * var8 >> 12) + var9;
            } else if (class84.field1287 < arg2) {
                var13 = (class84.field1287 * var8 >> 12) + var9;
                var12 = class84.field1287;
            } else {
                var12 = arg2;
                var13 = arg4;
            }
            if (var13 < class175.field2557) {
                var12 = (class175.field2557 - var9 << 12) / var8;
                var13 = class175.field2557;
            } else if (class91.field1381 < var13) {
                var13 = class91.field1381;
                var12 = (class91.field1381 - var9 << 12) / var8;
            }
            class55.method461(var12, arg1, var13, var11, arg0, var10);
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Ldb;)V")
    public class233(class39 arg0) {
        this.field3599 = arg0;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)Lug;")
    public final class181 method1586(int arg0) {
        field3604++;
        if (this.field3598 > arg0 && this.field3599.field696[this.field3598 - 1] != this.field3597) {
            class181 var2 = this.field3597;
            this.field3597 = var2.field2633;
            return var2;
        }
        while (this.field3598 < this.field3599.field703) {
            class181 var3 = this.field3599.field696[this.field3598++].field2633;
            if (this.field3599.field696[this.field3598 - 1] != var3) {
                this.field3597 = var3.field2633;
                return var3;
            }
        }
        return null;
    }
}
