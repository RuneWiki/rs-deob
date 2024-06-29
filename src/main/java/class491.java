import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class491 extends class307 {

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
    public static int field7251 = 0;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "Lwi;")
    public static class330 field7249 = new class330(5);

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
    public static int field7253 = -1;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "F")
    public static float field7254;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field7246;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public static int field7247;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field7248;

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
    public static int field7252;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "Lee;")
    public static class486 field7250;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
    public static final void method2929(int arg0) {
        field7248++;
        for (class266 var1 = (class266) class422.field6436.method445(33); var1 != null; var1 = (class266) class422.field6436.method451(false)) {
            class311 var2 = var1.field3707;
            if (var2.field4530) {
                var1.method25(-13489);
                var2.method1955(-16964);
            } else if (var2.field4552 <= class393.field6017) {
                var2.method1961((byte) -110, class205.field2728);
                if (var2.field4530) {
                    var1.method25(-13489);
                } else {
                    class525.method3110(var2, true);
                }
            }
        }
        if (arg0 <= 73) {
            field7252 = -91;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BI)V")
    public static final void method2930(byte arg0, int arg1) {
        field7245++;
        class177 var2 = class344.method2229(11, arg1, (byte) 85);
        var2.method1194(-59);
        int var3 = -59 / ((24 - arg0) / 44);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/util/Random;II)I")
    public static final int method2931(Random arg0, int arg1, int arg2) {
        field7247++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class152.method994(arg2, false)) {
            return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        } else {
            int var3 = arg1 - ((int) (4294967296L % (long) arg2));
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var4 >= var3);
            return class194.method1310(arg2, var4, (byte) -58);
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V")
    public static void method2932(int arg0) {
        if (arg0 != 25081) {
            field7251 = 58;
        }
        field7249 = null;
        field7250 = null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V")
    public static final void method2933(byte arg0) {
        class409.field6214.method951(1374428641);
        field7246++;
        int var1 = class409.field6214.method949(23, 8);
        if (var1 < class333.field5187) {
            for (int var2 = var1; var2 < class333.field5187; var2++) {
                class330.field5149[class24.field353++] = class224.field3114[var2];
            }
        }
        if (class333.field5187 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class333.field5187 = 0;
        if (arg0 <= 96) {
            return;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class224.field3114[var3];
            class17 var5 = ((class24) class406.field6158.method1747((long) var4, false)).field348;
            int var6 = class409.field6214.method949(74, 1);
            if (var6 == 0) {
                class224.field3114[class333.field5187++] = var4;
                var5.field3859 = class393.field6017;
            } else {
                int var7 = class409.field6214.method949(31, 2);
                if (var7 == 0) {
                    class224.field3114[class333.field5187++] = var4;
                    var5.field3859 = class393.field6017;
                    class421.field6420[class282.field4151++] = var4;
                } else if (var7 == 1) {
                    class224.field3114[class333.field5187++] = var4;
                    var5.field3859 = class393.field6017;
                    int var8 = class409.field6214.method949(59, 3);
                    var5.method178(var8, 1, (byte) -54);
                    int var9 = class409.field6214.method949(80, 1);
                    if (var9 == 1) {
                        class421.field6420[class282.field4151++] = var4;
                    }
                } else if (var7 == 2) {
                    class224.field3114[class333.field5187++] = var4;
                    var5.field3859 = class393.field6017;
                    if (class409.field6214.method949(22, 1) == 1) {
                        int var10 = class409.field6214.method949(123, 3);
                        var5.method178(var10, 2, (byte) -128);
                        int var11 = class409.field6214.method949(103, 3);
                        var5.method178(var11, 2, (byte) -52);
                    } else {
                        int var12 = class409.field6214.method949(46, 3);
                        var5.method178(var12, 0, (byte) -52);
                    }
                    int var13 = class409.field6214.method949(117, 1);
                    if (var13 == 1) {
                        class421.field6420[class282.field4151++] = var4;
                    }
                } else if (var7 == 3) {
                    class330.field5149[class24.field353++] = var4;
                }
            }
        }
    }
}
