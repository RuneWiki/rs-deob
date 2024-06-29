import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class148 extends class5 {

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "Ljava/lang/String;")
    public String field2247;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "[I")
    public static int[] field2248 = new int[100];

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    public static volatile int field2246 = 0;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILjd;II)[Ljn;", line = 8)
    private static final class327[] method1113(int arg0, class95 arg1, int arg2, int arg3) {
        field2245++;
        if (class31.method233(arg2, 0, arg0, arg1)) {
            return arg3 == 1 ? class338.method2357((byte) 93) : (class327[]) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 23)
    public static final void method1114(boolean arg0, String arg1) {
        field2249++;
        int var2 = class34.method265(arg1, (byte) 108);
        if (var2 == -1) {
            return;
        }
        if (arg0) {
            field2246 = -26;
        }
        int[] var3 = class163.field2649.method1842(class228.field3489.field289[var2] >> 14 & 0x3FFF, class228.field3489.field289[var2] >> 28 & 0x3, class228.field3489.field289[var2] & 0x3FFF, (byte) -5);
        class103.method787(-10858, var3[1], var3[2]);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILjd;)V", line = 50)
    public static final void method1115(int arg0, class95 arg1) {
        field2244++;
        class43.field618 = class99.method751((byte) -70, 0, class180.field2857, arg1);
        class336.field5232 = class309.method2118(class277.field4300, 0, arg1, 0);
        class163.field2642 = class309.method2118(class10.field140, 0, arg1, 0);
        class279.field4335 = class309.method2118(class78.field1143, 0, arg1, 0);
        class49.field673 = class309.method2118(class320.field4955, 0, arg1, 0);
        class320.field4949 = class309.method2118(class178.field2836, 0, arg1, 0);
        class311.field4828 = class309.method2118(class205.field3144, 0, arg1, 0);
        class102.field1470 = class290.method2005(client.field1991, 0, arg1, (byte) 11);
        class170.field2754 = class67.method481(arg1, class79.field1155, 0, 0);
        class345.field5347 = class67.method481(arg1, class160.field2435, 0, arg0);
        class198.field3037 = method1113(class87.field1247, arg1, 0, arg0 + 1);
        class241.field3676 = method1113(class171.field2762, arg1, 0, 1);
        class300.field4623.method2277(class241.field3676, (int[]) null);
        class265.field4128.method2277(class241.field3676, (int[]) null);
        class167.field2703.method2277(class241.field3676, (int[]) null);
        if (class73.field1058) {
            class125.field1891 = class210.method1501(class303.field4632, 0, false, arg1);
            for (int var2 = 0; var2 < class125.field1891.length; var2++) {
                class125.field1891[var2].method329();
            }
        }
        class195 var3 = class2.method11(class15.field199, 0, arg1, 103);
        var3.method1423();
        if (class73.field1058) {
            class39.field574 = new class44(var3);
        } else {
            class39.field574 = var3;
        }
        class195[] var4 = class99.method751((byte) -81, 0, class4.field59, arg1);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method1423();
        }
        if (class73.field1058) {
            class81.field1194 = new class269[var4.length];
            for (int var6 = 0; var6 < var4.length; var6++) {
                class81.field1194[var6] = new class44(var4[var6]);
            }
        } else {
            class81.field1194 = var4;
        }
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 41.0D) - 20;
        for (int var11 = arg0; var11 < class43.field618.length; var11++) {
            class43.field618[var11].method1431(var7 + var10, var8 + var10, var9 + var10);
        }
        if (class73.field1058) {
            class98.field1405 = new class269[class43.field618.length];
            for (int var12 = 0; var12 < class43.field618.length; var12++) {
                class98.field1405[var12] = new class44(class43.field618[var12]);
            }
        } else {
            class98.field1405 = class43.field618;
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V", line = 149)
    public class148() {
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 151)
    public class148(String arg0, int arg1) {
        this.field2247 = arg0;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V", line = 162)
    public static void method1116(byte arg0) {
        field2248 = null;
        if (arg0 < 36) {
            field2246 = 30;
        }
    }
}
