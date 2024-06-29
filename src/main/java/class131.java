import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class131 {

    @OriginalMember(owner = "client!w", name = "a", descriptor = "La;")
    public static class1 field3200 = class113.method934(-11538, "Abbrechen");

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3201 = new CRC32();

    @OriginalMember(owner = "client!w", name = "f", descriptor = "La;")
    private static class1 field3205 = class113.method934(-11538, "Please reload this page)3");

    @OriginalMember(owner = "client!w", name = "g", descriptor = "La;")
    public static class1 field3206 = class113.method934(-11538, " x ");

    @OriginalMember(owner = "client!w", name = "i", descriptor = "La;")
    public static class1 field3208 = field3205;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public static int field3207 = 128;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Lu;")
    public static class120 field3203;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V", line = 15)
    public static void method1030(byte arg0) {
        field3203 = null;
        field3201 = null;
        field3200 = null;
        field3208 = null;
        if (arg0 >= -10) {
            field3207 = 31;
        }
        field3206 = null;
        field3205 = null;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V", line = 32)
    public static final void method1031(byte arg0) {
        int var1 = -125 % ((arg0 - 2) / 56);
        field3209++;
        class35.field926.method1057((byte) 90);
        class50.field1349 = class27.method363(class50.field1349);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 68)
    public static final void method1032(int arg0) {
        field3204++;
        if (class9.field312 == null) {
            return;
        }
        class45.method477(arg0 - 191);
        if (arg0 != 104) {
            return;
        }
        if (class62.field1551 > 0) {
            class9.field312.method305(256, 0);
            class62.field1551 = 0;
        }
        class9.field312.method304((byte) 101);
        class9.field312 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V", line = 94)
    public static final void method1033(boolean arg0) {
        class117.field2933 = new int[104];
        class34.field911 = new byte[4][104][104];
        field3202++;
        class11.field413 = new int[4][105][105];
        if (!arg0) {
            field3200 = null;
        }
        class129.field3178 = 99;
        class37.field1004 = new byte[4][105][105];
        class52.field1388 = new int[104];
        class133.field3249 = new int[104];
        class32.field857 = new int[104];
        class47.field1249 = new int[105][105];
        class122.field3056 = new byte[4][104][104];
        class116.field2909 = new int[104];
        class75.field1875 = new byte[4][104][104];
        class85.field2134 = new byte[4][104][104];
    }
}
