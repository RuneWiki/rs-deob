import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class2 extends InputStream {

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "Ljava/lang/String;")
    public static String field11 = "Choose Option";

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "[I")
    public static int[] field12 = new int[14];

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "[[I")
    public static int[][] field15;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)[Lrb;")
    public static final class135[] method8(int arg0) {
        field9++;
        class135[] var1 = new class135[class154.field2407];
        for (int var2 = 0; var2 < class154.field2407; var2++) {
            var1[var2] = new class149(class286.field4562, class245.field4018, class40.field493[var2], class129.field2072[var2], class103.field1387[var2], class172.field2726[var2], class293.field4645[var2], class172.field2729);
        }
        int var3 = -119 % ((arg0 + 42) / 58);
        class24.method135(-91);
        return var1;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V")
    public static final void method9(boolean arg0) {
        class236.field3908.method1699(0);
        field14++;
        if (!arg0) {
            field12 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
    public static final void method10(byte arg0) {
        field7++;
        class294.field4663.method1699(0);
        if (arg0 != -90) {
            field11 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V")
    public static void method11(byte arg0) {
        field15 = null;
        field12 = null;
        field11 = null;
        int var1 = -12 / ((arg0 - 49) / 46);
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Z)V")
    public static final void method12(boolean arg0) {
        if (!arg0) {
            method13(true, -27);
        }
        class4.field57.method1932(!arg0, 206);
        class28.field395++;
        field8++;
        for (class86 var1 = (class86) class92.field1139.method710((byte) -51); var1 != null; var1 = (class86) class92.field1139.method709(false)) {
            if (var1.field1061 == 0) {
                class289.method1943(var1, false, true);
            }
        }
        if (class108.field1486 != null) {
            class129.method875((byte) -21, class108.field1486);
            class108.field1486 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "read", descriptor = "()I")
    public final int read() {
        class115.method752((byte) -62, 30000L);
        field13++;
        return -1;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZI)V")
    public static final void method13(boolean arg0, int arg1) {
        field10++;
        if (class250.field4085 == arg1) {
            return;
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (class250.field4085 == 0) {
            class272.method1824(false);
        }
        if (arg1 == 40) {
            class56.method319((byte) 122);
        }
        if (arg1 != 40 && class89.field1103 != null) {
            class89.field1103.method1210(-1);
            class89.field1103 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class204.field3224 = 0;
            class132.field2104 = 1;
            class77.field972 = 0;
            class180.field2875 = 1;
            class135.field2135 = 0;
            class5.method31(true, -117);
        }
        if (arg1 == 25 || arg1 == 10) {
            class18.method98(-72);
        }
        if (arg1 == 5) {
            class234.method1658(class147.field2302, (byte) 112);
        } else {
            class286.method1922(112);
        }
        boolean var3 = class250.field4085 == 5 || class250.field4085 == 10 || class250.field4085 == 28;
        if (var2 != var3) {
            if (var2) {
                class171.field2714 = class17.field202;
                if (class218.field3493 == 0) {
                    class152.method1040(3389, 2);
                } else {
                    class92.method500(0, 24217, class182.field2897, 255, false, class17.field202, 2);
                }
                class35.field454.method515((byte) -71, false);
            } else {
                class152.method1040(3389, 2);
                class35.field454.method515((byte) -71, true);
            }
        }
        class250.field4085 = arg1;
        if (arg0) {
            method8(-51);
        }
    }
}
