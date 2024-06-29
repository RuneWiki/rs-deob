import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class30 {

    @OriginalMember(owner = "client!i", name = "d", descriptor = "Lk;")
    public static class365 field401 = new class365(0);

    @OriginalMember(owner = "client!i", name = "f", descriptor = "Lus;")
    public static class1 field403 = new class1(44, 12);

    @OriginalMember(owner = "client!i", name = "g", descriptor = "[Lvo;")
    public static class31[] field404 = new class31[14];

    @OriginalMember(owner = "client!i", name = "h", descriptor = "[I")
    public static int[] field405 = new int[2];

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "Z")
    public static boolean field400;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "[I")
    public static int[] field406;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public static void method213(byte arg0) {
        field404 = null;
        field403 = null;
        if (arg0 != -84) {
            method215(-78, false);
        }
        field401 = null;
        field405 = null;
        field406 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method214(String arg0, int arg1) {
        field398++;
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = arg1; var2 < class237.field3564; var2++) {
            if (arg0.equalsIgnoreCase(class24.field310[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IZ)[B")
    public static final synchronized byte[] method215(int arg0, boolean arg1) {
        field402++;
        if (!arg1) {
            return null;
        } else if (arg0 == 100 && class359.field5174 > 0) {
            byte[] var2 = class419.field5859[--class359.field5174];
            class419.field5859[class359.field5174] = null;
            return var2;
        } else if (arg0 == 5000 && class45.field647 > 0) {
            byte[] var3 = class440.field6095[--class45.field647];
            class440.field6095[class45.field647] = null;
            return var3;
        } else if (arg0 == 30000 && class472.field6644 > 0) {
            byte[] var4 = class15.field183[--class472.field6644];
            class15.field183[class472.field6644] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static final void method216(int arg0) {
        field399++;
        if (!class466.field6560) {
            return;
        }
        int var1 = 69 % ((arg0 - 21) / 35);
        while (true) {
            while (class105.field1339 < class156.field2323.length) {
                class42 var2 = class156.field2323[class105.field1339];
                if (var2 != null && var2.field622 == -1) {
                    if (class206.field3159 == null) {
                        class206.field3159 = class403.field5689.method1505((byte) -121, var2.field617);
                    }
                    int var3 = class206.field3159.field4286;
                    if (var3 == -1) {
                        return;
                    }
                    class206.field3159 = null;
                    class105.field1339++;
                    var2.field622 = var3;
                } else {
                    class105.field1339++;
                }
            }
            return;
        }
    }
}
