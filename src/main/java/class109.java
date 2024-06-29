import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public abstract class class109 {

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "Lfn;")
    public static class52 field1541 = new class52(103, -1);

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "Z")
    public static boolean field1543 = false;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field1545 = 0;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "Lfn;")
    public static class52 field1547 = new class52(68, 3);

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "Lfn;")
    public static class52 field1548 = new class52(41, 3);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "[[[I")
    public static int[][][] field1544;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)I")
    public static final int method677(int arg0, int arg1, int arg2) {
        field1546++;
        if (arg1 == 4 || arg1 == 5) {
            return class448.field6179[arg2 & 0x3];
        } else {
            int var3 = -42 % ((arg0 + 62) / 53);
            return 256;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLuf;)Luf;")
    public abstract class31 method678(byte arg0, class31 arg1);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public static void method679(int arg0) {
        field1541 = null;
        if (arg0 == 4) {
            field1547 = null;
            field1544 = null;
            field1548 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method680(String arg0, int arg1) {
        if (class345.field4714 == null) {
            class138.method844((byte) 54);
        }
        if (arg1 != 12245) {
            method680((String) null, -50);
        }
        field1540++;
        String[] var2 = class326.method1958((byte) 126, arg0, '\n');
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class389.field5490; var4 > 0; var4--) {
                class345.field4714[var4] = class345.field4714[var4 - 1];
            }
            class345.field4714[0] = var2[var3];
            if (class345.field4714.length - 1 > class389.field5490) {
                if (class240.field3381 > 0) {
                    class240.field3381++;
                }
                class389.field5490++;
            }
        }
    }
}
