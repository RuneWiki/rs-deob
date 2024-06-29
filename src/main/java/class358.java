import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class358 {

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "Lg;")
    private class470 field5171;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public int field5170;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "Z")
    public static boolean field5165 = false;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "Lsd;")
    public static class74 field5168 = new class74(49, 3);

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    public static int field5172 = 0;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "Lsd;")
    public static class74 field5166;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lve;I)V", line = 3)
    public static final void method2188(class331 arg0, int arg1) {
        field5173++;
        for (int var2 = 0; var2 < class468.field6579; var2++) {
            int var4 = class450.field6373[var2];
            class198 var5 = class46.field596[var4];
            int var6 = arg0.method895((byte) -74);
            if ((var6 & 0x4) != 0) {
                var6 += arg0.method895((byte) -101) << 8;
            }
            class247.method1504(var6, (byte) -97, arg0, var4, var5);
        }
        int var3 = 81 % ((arg1 - 74) / 34);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BLjava/lang/String;)V", line = 31)
    public static final void method2189(byte arg0, String arg1) {
        if (arg0 != 92) {
            field5166 = null;
        }
        field5169++;
        if (!arg1.equals("")) {
            class153.field1838++;
            class244.method1332((byte) -57, class184.field2400);
            class230.field3185.method909(class183.method995((byte) 23, arg1), -1);
            class230.field3185.method935(arg1, arg0 ^ 0x14);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 59)
    public static void method2190(int arg0) {
        field5168 = null;
        if (arg0 > 76) {
            field5166 = null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lci;ILg;)V", line = 87)
    public class358(class421 arg0, int arg1, class470 arg2) {
        new class210(64);
        this.field5171 = arg2;
        this.field5170 = this.field5171.method2755(-90, 15);
    }
}
