import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class344 {

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field5339 = 2;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "F")
    public static float field5345;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "Lji;")
    public static class301 field5340;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "Lbf;")
    public static class329 field5343;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Z")
    public static boolean field5338;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIILwi;II)Lwi;", line = 6)
    public static final class221 method2379(int arg0, int arg1, int arg2, int arg3, class221 arg4, int arg5, int arg6) {
        field5341++;
        long var7 = (long) arg5;
        class221 var9 = (class221) class247.field3918.method2179(false, var7);
        if (var9 == null) {
            class42 var10 = class42.method337(class298.field4597, arg5, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method341(64, 768, -50, -10, -50);
            class247.field3918.method2173(var9, true, var7);
        }
        int var11 = arg4.method173();
        int var12 = arg4.method205();
        int var13 = arg4.method172();
        int var14 = arg4.method175();
        class221 var15 = var9.method191(true, true, true);
        if (arg2 != -8359) {
            return (class221) null;
        }
        if (arg1 != 0) {
            var15.method185(arg1);
        }
        if (class94.field1516) {
            class21 var16 = (class21) var15;
            if (arg6 != class320.method2181(arg3 + var11, arg0 + var13, arg2 ^ 0x2081, class205.field3101) || class320.method2181(arg3 + var12, arg0 + var14, -61, class205.field3101) != arg6) {
                for (int var17 = 0; var17 < var16.field303; var17++) {
                    var16.field299[var17] += class320.method2181(var16.field310[var17] + arg3, var16.field305[var17] + arg0, -22, class205.field3101) - arg6;
                }
                var16.field314.field552 = false;
                var16.field285.field5347 = false;
            }
        } else {
            class66 var18 = (class66) var15;
            if (class320.method2181(arg3 + var11, arg0 + var13, -77, class205.field3101) != arg6 || arg6 != class320.method2181(arg3 + var12, arg0 + var14, arg2 ^ 0x20C5, class205.field3101)) {
                for (int var19 = 0; var19 < var18.field1028; var19++) {
                    var18.field1051[var19] += class320.method2181(var18.field1045[var19] + arg3, var18.field1054[var19] + arg0, -108, class205.field3101) - arg6;
                }
                var18.field1033 = false;
            }
        }
        return var15;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)V", line = 94)
    public static final void method2380(int arg0, int arg1) {
        field5342++;
        class214.field3256 = (class2) class71.field1172.method1222(arg1, (long) arg0);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V", line = 113)
    public static void method2381(byte arg0) {
        field5343 = null;
        int var1 = 74 % ((51 - arg0) / 45);
        field5340 = null;
    }
}
