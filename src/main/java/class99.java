import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class99 {

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "[I")
    public static int[] field1480 = new int[100];

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1481 = " more options";

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field1487 = 0;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method662(int arg0, int arg1, int arg2, long arg3) {
        class131 var5 = class16.field233[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field1923 != null && var5.field1923.field4555 == arg3) {
            return true;
        } else if (var5.field1928 != null && var5.field1928.field3979 == arg3) {
            return true;
        } else if (var5.field1930 != null && var5.field1930.field1578 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field1926; var6++) {
                if (var5.field1908[var6].field2350 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static final void method663(int arg0) {
        class153.field2230 = 0;
        class282.field4501 = 0;
        field1483++;
        class225.method1466((byte) 3);
        class159.method1070(-114);
        class160.method1076(16);
        for (int var1 = 0; var1 < class153.field2230; var1++) {
            int var3 = class193.field2758[var1];
            if (class82.field1267 != class82.field1268[var3].field85) {
                if (class82.field1268[var3].field1119.method1816((byte) 97)) {
                    class140.method933(class82.field1268[var3], (byte) -9);
                }
                class82.field1268[var3].method487((byte) -3, (class271) null);
                class82.field1268[var3] = null;
            }
        }
        if (class7.field140 != class68.field1071.field1673) {
            throw new RuntimeException("gnp1 pos:" + class68.field1071.field1673 + " psize:" + class7.field140);
        }
        for (int var2 = 0; var2 < class51.field756; var2++) {
            if (class82.field1268[class67.field1049[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class51.field756);
            }
        }
        if (arg0 != -10414) {
            field1487 = 41;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lkl;Z)Ljava/lang/String;")
    public static final String method664(class114 arg0, boolean arg1) {
        if (!arg1) {
            field1480 = null;
        }
        field1484++;
        return class1.method8(arg0, 32767, -1);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method665(String arg0, int arg1) {
        if (arg1 != 100) {
            method665((String) null, -116);
        }
        field1485++;
        return class80.method536(arg0, 81, true, 10);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method666(int arg0, String arg1) {
        if (arg0 > -4) {
            field1482 = 120;
        }
        field1479++;
        class146.method979(false, true);
        class118.method815(116, arg1);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public static void method667(byte arg0) {
        field1481 = null;
        field1480 = null;
        if (arg0 != 121) {
            field1480 = null;
        }
    }
}
