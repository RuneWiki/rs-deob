import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class106 extends class90 {

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
    public static int field2206 = 0;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
    public static int field2202 = 2;

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "[I")
    public static int[] field2207 = new int[100];

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "Lrf;")
    public static class163 field2203 = class53.method392(-119, "-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!lb", name = "E", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "Llb;")
    public class106 field2199;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "Llb;")
    public class106 field2201;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "Lig;")
    public static class84 field2205;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
    public static final void method720(int arg0) {
        class72.field1505.method399(false);
        field2200++;
        int var1 = -128 % ((arg0 - 3) / 51);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIZ)V")
    public static final void method721(int arg0, int arg1, int arg2, boolean arg3) {
        field2208++;
        if (arg2 < 128 || arg0 < 128 || arg2 > 13056 || arg0 > 13056) {
            class61.field1282 = -1;
            class168.field3405 = -1;
            return;
        }
        int var4 = class175.method1186(arg2, class60.field1227, arg0, 1) - arg1;
        int var5 = var4 - class33.field644;
        int var6 = arg2 - class86.field1882;
        int var7 = class1.field8[class44.field894];
        int var8 = class1.field21[class44.field894];
        int var9 = arg0 - class90.field1939;
        int var10 = class1.field21[class64.field1354];
        int var11 = class1.field8[class64.field1354];
        int var12 = var6 * var11 + var9 * var10 >> 16;
        int var13 = var9 * var11 - var6 * var10 >> 16;
        int var15 = var5 * var7 - var8 * var13 >> 16;
        if (arg3) {
            field2206 = 119;
        }
        int var16 = var5 * var8 + var7 * var13 >> 16;
        if (var16 >= 50) {
            class61.field1282 = (var15 << 9) / var16 + 167;
            class168.field3405 = (var12 << 9) / var16 + 256;
        } else {
            class61.field1282 = -1;
            class168.field3405 = -1;
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)V")
    public final void method722(byte arg0) {
        field2204++;
        if (this.field2201 == null) {
            return;
        }
        this.field2201.field2199 = this.field2199;
        this.field2199.field2201 = this.field2201;
        if (arg0 < 17) {
            method721(-50, -20, -122, true);
        }
        this.field2199 = null;
        this.field2201 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIII)V")
    public static final void method723(int arg0, int arg1, int arg2, int arg3) {
        class111 var4 = class97.field2054[arg0][arg1][arg2];
        if (var4 != null) {
            class97.field2054[arg0][arg1][arg2].field2354 = arg3;
        }
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)V")
    public static void method724(int arg0) {
        field2205 = null;
        field2207 = null;
        field2203 = null;
        int var1 = -116 / ((arg0 - 4) / 60);
    }
}
