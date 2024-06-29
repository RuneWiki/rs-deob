import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class305 {

    @OriginalMember(owner = "client!vea", name = "f", descriptor = "[F")
    public static float[] field4524 = new float[4];

    @OriginalMember(owner = "client!vea", name = "e", descriptor = "Lvg;")
    public static class622 field4523 = new class622(71, 6);

    @OriginalMember(owner = "client!vea", name = "g", descriptor = "[I")
    public static int[] field4525 = new int[4];

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "F")
    public static float field4521;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!vea", name = "d", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(BII)I")
    public final int method1916(byte arg0, int arg1, int arg2) {
        field4522++;
        int var4 = arg1 >= class425.field6218 ? arg1 : class425.field6218;
        if (class410.field6109 == this) {
            return 0;
        } else if (class529.field7808 == this) {
            return var4 - arg2;
        } else {
            int var5 = -124 % ((74 - arg0) / 36);
            return class258.field3348 == this ? (var4 - arg2) / 2 : 0;
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(IIILr;II)V")
    public static final void method1917(int arg0, int arg1, int arg2, class98 arg3, int arg4, int arg5) {
        arg3.method652(arg5, arg4, arg1 + arg5, arg0 + arg4);
        field4519++;
        arg3.method710(arg4, 22339, -16777216, arg1, arg5, arg0);
        if (class87.field1348 < 100) {
            return;
        }
        float var6 = (float) class55.field869 / (float) class55.field851;
        int var7 = arg1;
        int var8 = arg0;
        if (var6 < 1.0F) {
            var8 = (int) ((float) arg1 * var6);
        } else {
            var7 = (int) ((float) arg0 / var6);
        }
        int var9 = (arg1 - var7) / 2 + arg5;
        int var10 = (arg0 - var8) / 2 + arg4;
        if (class612.field8825 == null || class612.field8825.method48() != arg1 || class612.field8825.method56() != arg0) {
            class55.method329(class55.field865, class55.field869 + class55.field866, class55.field865 + class55.field851, class55.field866, var9, var10, var7 + var9, var10 - -var8);
            class55.method337(arg3);
            class612.field8825 = arg3.method688(var9, var10, var7, var8, false);
        }
        class612.field8825.method1534(var9, var10);
        int var11 = class530.field7814 * var7 / class55.field851;
        int var12 = class583.field8469 * var8 / class55.field869;
        int var13 = class678.field9597 * var7 / class55.field851 + var9;
        if (arg2 != 4) {
            return;
        }
        int var14 = var10 - ((class436.field6375 * var8 / class55.field869) + var12 - var8);
        int var15 = -1996554240;
        if (class478.field6840 == class132.field1922) {
            var15 = -1996488705;
        }
        arg3.method700(var13, var14, var11, var12, var15, 1);
        arg3.method633(var13, var14, var11, var12, var15, 0);
        if (class606.field8764 <= 0) {
            return;
        }
        int var16;
        if (class405.field6057 <= 50) {
            var16 = class405.field6057 * 5;
        } else {
            var16 = 500 - (class405.field6057 * 5);
        }
        for (class415 var17 = (class415) class55.field841.method1904(false); var17 != null; var17 = (class415) class55.field841.method1901(98)) {
            class168 var18 = class55.field834.method2757(var17.field6142, (byte) -46);
            if (class456.method2672((byte) -122, var18)) {
                if (class164.field2305 == var17.field6142) {
                    int var21 = var17.field6143 * var7 / class55.field851 + var9;
                    int var22 = var10 + ((class55.field869 - var17.field6145) * var8 / class55.field869);
                    arg3.method710(var22 - 2, 22339, var16 << 24 | 0xFFFF00, 4, var21 - 2, 4);
                } else if (class280.field3710 != -1 && class280.field3710 == var18.field2380) {
                    int var19 = var17.field6143 * var7 / class55.field851 + var9;
                    int var20 = (class55.field869 - var17.field6145) * var8 / class55.field869 + var10;
                    arg3.method710(var20 - 2, 22339, var16 << 24 | 0xFFFF00, 4, var19 - 2, 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vea", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4520++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(I)V")
    public static void method1918(int arg0) {
        field4525 = null;
        field4524 = null;
        field4523 = null;
        if (arg0 <= 34) {
            field4525 = null;
        }
    }
}
