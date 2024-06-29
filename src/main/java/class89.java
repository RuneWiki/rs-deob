import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public abstract class class89 {

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field1424 = 0;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "Z")
    public static boolean field1427 = false;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field1428 = 0;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field1423 = 0;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field1431 = 0;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "[I")
    public static int[] field1432 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Lgd;")
    public static class325 field1429 = new class325(30);

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "[I")
    public static int[] field1433 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "F")
    public static float field1430;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V", line = 11)
    public static void method704(boolean arg0) {
        field1433 = null;
        field1432 = null;
        field1429 = null;
        if (arg0) {
            method704(false);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 23)
    public static final void method705(int arg0) {
        class80.field1248.method1795(73);
        int var1 = class80.field1248.method1800(98, 1);
        field1425++;
        if (var1 == 0 || arg0 != 2047) {
            return;
        }
        int var2 = class80.field1248.method1800(-63, 2);
        if (var2 == 0) {
            class251.field3708[class88.field1420++] = 2047;
        } else if (var2 == 1) {
            int var11 = class80.field1248.method1800(-1, 3);
            class345.field5363.method2064(true, var11, 1);
            int var12 = class80.field1248.method1800(arg0 - 1943, 1);
            if (var12 == 1) {
                class251.field3708[class88.field1420++] = 2047;
            }
        } else if (var2 == 2) {
            if (class80.field1248.method1800(-88, 1) == 1) {
                int var7 = class80.field1248.method1800(103, 3);
                class345.field5363.method2064(true, var7, 2);
                int var8 = class80.field1248.method1800(89, 3);
                class345.field5363.method2064(true, var8, 2);
            } else {
                int var9 = class80.field1248.method1800(-124, 3);
                class345.field5363.method2064(true, var9, 0);
            }
            int var10 = class80.field1248.method1800(103, 1);
            if (var10 == 1) {
                class251.field3708[class88.field1420++] = 2047;
            }
        } else if (var2 == 3) {
            int var3 = class80.field1248.method1800(-33, 1);
            int var4 = class80.field1248.method1800(-55, 7);
            int var5 = class80.field1248.method1800(arg0 ^ 0xFFFFF860, 7);
            int var6 = class80.field1248.method1800(4, 1);
            if (var6 == 1) {
                class251.field3708[class88.field1420++] = 2047;
            }
            class75.field1153 = class80.field1248.method1800(-39, 2);
            class345.field5363.method736(var4, -2436, var5, var3 == 1);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)[B")
    public abstract byte[] method706(byte arg0, int arg1);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)I")
    public abstract int method707(int arg0, int arg1);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)Lse;")
    public abstract class13 method708(byte arg0);

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)V")
    public abstract void method709(int arg0, int arg1);
}
