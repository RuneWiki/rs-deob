import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class80 {

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Lie;")
    public static class117 field1560 = new class117(100);

    @OriginalMember(owner = "client!od", name = "h", descriptor = "[I")
    public static int[] field1565 = new int[4096];

    @OriginalMember(owner = "client!od", name = "f", descriptor = "[Lvb;")
    public static class226[] field1563 = new class226[256];

    @OriginalMember(owner = "client!od", name = "g", descriptor = "Lia;")
    public static class257 field1564 = class28.method234(-62, "; Max)2Age=");

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field1566 = 0;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "Luh;")
    public static class146 field1562 = new class146();

    @OriginalMember(owner = "client!od", name = "j", descriptor = "Lia;")
    public static class257 field1567 = class28.method234(81, "underlay)3dat");

    @OriginalMember(owner = "client!od", name = "k", descriptor = "[I")
    public static int[] field1568 = new int[200];

    @OriginalMember(owner = "client!od", name = "l", descriptor = "Lvf;")
    public static class187 field1569 = new class187();

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)J")
    public static final synchronized long method600(int arg0) {
        if (arg0 >= -28) {
            return -116L;
        }
        field1559++;
        long var1 = System.currentTimeMillis();
        if (var1 < class55.field1178) {
            class108.field2012 += class55.field1178 - var1;
        }
        class55.field1178 = var1;
        return class108.field2012 + var1;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
    public static final void method601(int arg0) {
        class104.field1944 = arg0;
        for (int var1 = 0; var1 < class140.field2491; var1++) {
            for (int var2 = 0; var2 < class73.field1427; var2++) {
                if (class75.field1463[arg0][var1][var2] == null) {
                    class75.field1463[arg0][var1][var2] = new class177(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V")
    public static void method602(boolean arg0) {
        field1563 = null;
        field1565 = null;
        field1567 = null;
        field1569 = null;
        if (arg0) {
            field1567 = null;
        }
        field1568 = null;
        field1560 = null;
        field1564 = null;
        field1562 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Lwa;")
    public static final class161 method603(int arg0, int arg1) {
        field1558++;
        class161 var2 = (class161) class20.field419.method836(-106, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class184.field3203.method1197(class229.method1494(arg1, -116), client.method591(arg1, (byte) -122), -2);
        if (arg0 > -99) {
            method600(111);
        }
        class161 var4 = new class161();
        if (var3 != null) {
            var4.method1117(new class152(var3), 0);
        }
        class20.field419.method832(var4, (long) arg1, 0);
        return var4;
    }
}
