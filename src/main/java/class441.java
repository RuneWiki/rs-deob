import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class441 extends class409 {

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "B")
    public byte field6275 = 5;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "[I")
    public static int[] field6277 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public int field6269;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public int field6270;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public int field6271;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public int field6272;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public int field6273;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
    public int field6276;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "Z")
    public boolean field6274;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V", line = 10)
    public static void method2655(int arg0) {
        if (arg0 == 137) {
            field6277 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lga;IIIII)V", line = 23)
    public static final void method2656(class404 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class510.field7094 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class434.field6208) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class432.field6185 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class384 var14 = class649.field8928[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class683.field9250[var11].method1851((byte) -86, var13, var12) + class683.field9250[var11].method1851((byte) -86, var13, var12 + 1) + class683.field9250[var11].method1851((byte) -86, var13 + 1, var12) + class683.field9250[var11].method1851((byte) -86, var13 + 1, var12 + 1)) / 4 - (class683.field9250[arg1].method1851((byte) -86, arg3, arg2) + class683.field9250[arg1].method1851((byte) -86, arg3, arg2 + 1) + class683.field9250[arg1].method1851((byte) -86, arg3 + 1, arg2) + class683.field9250[arg1].method1851((byte) -86, arg3 + 1, arg2 + 1)) / 4;
                                    class100 var16 = var14.field5577;
                                    class100 var17 = var14.field5574;
                                    if (var16 != null && var16.method35(-127)) {
                                        arg0.method33(class44.field982, var15, var6, var16, (var13 - arg3) * class1.field3 + (1 - arg5) * class72.field1328, (byte) -112, (var12 - arg2) * class1.field3 + (1 - arg4) * class72.field1328);
                                    }
                                    if (var17 != null && var17.method35(-100)) {
                                        arg0.method33(class44.field982, var15, var6, var17, (var13 - arg3) * class1.field3 + (1 - arg5) * class72.field1328, (byte) -115, (var12 - arg2) * class1.field3 + (1 - arg4) * class72.field1328);
                                    }
                                    for (class474 var18 = var14.field5567; var18 != null; var18 = var18.field6621) {
                                        class494 var19 = var18.field6623;
                                        if (var19 != null && var19.method35(-111) && (var19.field6831 == var12 || var7 == var12) && (var19.field6838 == var13 || var9 == var13)) {
                                            int var20 = var19.field6839 + 1 - var19.field6831;
                                            int var21 = var19.field6835 + 1 - var19.field6838;
                                            arg0.method33(class44.field982, var15, var6, var19, (var19.field6838 - arg3) * class1.field3 + (var21 - arg5) * class72.field1328, (byte) -115, (var19.field6831 - arg2) * class1.field3 + (var20 - arg4) * class72.field1328);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }
}
