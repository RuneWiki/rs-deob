import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class95 {

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "Z")
    public static boolean field1505 = false;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "Lci;")
    public static class320 field1506;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Z)J")
    public static final long method725(boolean arg0) {
        field1508++;
        if (arg0) {
            method726((byte) -99, 9);
        }
        return class375.field5394.method537(16711935);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(BI)V")
    public static final void method726(byte arg0, int arg1) {
        field1507++;
        if (arg0 != -98) {
            method727(-14);
        }
        class275 var2 = class213.method1433((byte) 70, 6, arg1);
        var2.method1774((byte) 77);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V")
    public static void method727(int arg0) {
        field1506 = null;
        if (arg0 < 109) {
            method725(false);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method728(int arg0, int arg1) {
        field1504++;
        if (arg0 != -2561) {
            method726((byte) 18, 123);
        }
        if (arg1 == 100 && class485.field7031 > 0) {
            byte[] var2 = class28.field387[--class485.field7031];
            class28.field387[class485.field7031] = null;
            return var2;
        } else if (arg1 == 5000 && class192.field2801 > 0) {
            byte[] var3 = class199.field3055[--class192.field2801];
            class199.field3055[class192.field2801] = null;
            return var3;
        } else if (arg1 == 30000 && class38.field807 > 0) {
            byte[] var4 = class161.field2454[--class38.field807];
            class161.field2454[class38.field807] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }
}
