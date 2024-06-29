import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class75 {

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "[I")
    public static int[] field1430 = new int[128];

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "Lvf;")
    private static class265 field1434 = class87.method582(-46, "Apr");

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "Lvf;")
    private static class265 field1437 = class87.method582(-46, "Feb");

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "Lvf;")
    private static class265 field1445 = class87.method582(-46, "Mar");

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "Lvf;")
    public static class265 field1432 = class87.method582(-46, "<img=0>");

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "Lvf;")
    private static class265 field1443 = class87.method582(-46, "Oct");

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "Lvf;")
    private static class265 field1447 = class87.method582(-46, "Dec");

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "Lvf;")
    private static class265 field1439 = class87.method582(-46, "Loaded config");

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "Lvf;")
    private static class265 field1448 = class87.method582(-46, "Jun");

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "Lvf;")
    private static class265 field1446 = class87.method582(-46, "Nov");

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "Lvf;")
    private static class265 field1436 = class87.method582(-46, "Aug");

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "Lvf;")
    public static class265 field1440 = field1439;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "Lvf;")
    private static class265 field1435 = class87.method582(-46, "May");

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "Lvf;")
    private static class265 field1453 = class87.method582(-46, "Jan");

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "Lvf;")
    private static class265 field1452 = class87.method582(-46, "Jul");

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "Lvf;")
    private static class265 field1451 = class87.method582(-46, "Sep");

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "[Lvf;")
    public static class265[] field1431 = new class265[] { field1453, field1437, field1445, field1434, field1435, field1448, field1452, field1436, field1451, field1443, field1446, field1447 };

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "Loe;")
    public static class108 field1438;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "[I")
    public static int[] field1442;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([BI)[B")
    public static final byte[] method533(byte[] arg0, int arg1) {
        int var2 = arg0.length;
        field1441++;
        byte[] var3 = new byte[var2];
        class194.method1342(arg0, 0, var3, arg1, var2);
        return var3;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Loe;")
    public static final class108 method534(int arg0) {
        field1449++;
        int var1 = class6.field127[0] * class190.field3417[0];
        byte[] var2 = class6.field230[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class268.field4715[class203.method1395(255, var2[var4])];
        }
        class88 var5 = new class88(class203.field3643, class14.field429, class207.field3737[0], class269.field4810[0], class190.field3417[0], class6.field127[arg0], var3);
        class261.method1739(26);
        return var5;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public static void method535(byte arg0) {
        field1451 = null;
        field1443 = null;
        field1447 = null;
        field1436 = null;
        field1434 = null;
        field1445 = null;
        field1439 = null;
        field1430 = null;
        field1440 = null;
        field1432 = null;
        field1431 = null;
        field1437 = null;
        field1442 = null;
        field1452 = null;
        field1453 = null;
        field1446 = null;
        field1435 = null;
        if (arg0 <= 32) {
            method533((byte[]) null, 17);
        }
        field1438 = null;
        field1448 = null;
    }
}
