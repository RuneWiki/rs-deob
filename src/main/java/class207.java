import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class207 {

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "Ljt;")
    public static class104 field2435 = new class104("", 10);

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "[Lhu;")
    public static class131[] field2436;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)V")
    public static void method1233(int arg0) {
        field2436 = null;
        field2435 = null;
        if (arg0 != 100) {
            method1234((byte) -90);
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(B)V")
    public static final void method1234(byte arg0) {
        class248.field3008.method1108(-100);
        field2437++;
        int var1 = class248.field3008.method1102(255, 8);
        if (class302.field3784 > var1) {
            for (int var2 = var1; var2 < class302.field3784; var2++) {
                class524.field7481[class122.field1267++] = class272.field3359[var2];
            }
        }
        if (var1 > class302.field3784) {
            throw new RuntimeException("gnpov1");
        }
        class302.field3784 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var5 = class272.field3359[var3];
            class197 var6 = ((class151) class253.field3052.method1754(false, (long) var5)).field1661;
            int var7 = class248.field3008.method1102(255, 1);
            if (var7 == 0) {
                class272.field3359[class302.field3784++] = var5;
                var6.field7127 = class698.field9818;
            } else {
                int var8 = class248.field3008.method1102(255, 2);
                if (var8 == 0) {
                    class272.field3359[class302.field3784++] = var5;
                    var6.field7127 = class698.field9818;
                    class128.field1347[class702.field9897++] = var5;
                } else if (var8 == 1) {
                    class272.field3359[class302.field3784++] = var5;
                    var6.field7127 = class698.field9818;
                    int var9 = class248.field3008.method1102(255, 3);
                    var6.method1183(-15651, var9, 1);
                    int var10 = class248.field3008.method1102(255, 1);
                    if (var10 == 1) {
                        class128.field1347[class702.field9897++] = var5;
                    }
                } else if (var8 == 2) {
                    class272.field3359[class302.field3784++] = var5;
                    var6.field7127 = class698.field9818;
                    if (class248.field3008.method1102(255, 1) == 1) {
                        int var11 = class248.field3008.method1102(255, 3);
                        var6.method1183(-15651, var11, 2);
                        int var12 = class248.field3008.method1102(255, 3);
                        var6.method1183(-15651, var12, 2);
                    } else {
                        int var13 = class248.field3008.method1102(255, 3);
                        var6.method1183(-15651, var13, 0);
                    }
                    int var14 = class248.field3008.method1102(255, 1);
                    if (var14 == 1) {
                        class128.field1347[class702.field9897++] = var5;
                    }
                } else if (var8 == 3) {
                    class524.field7481[class122.field1267++] = var5;
                }
            }
        }
        int var4 = 2 % ((arg0 - 49) / 44);
    }
}
