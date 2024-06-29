import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class133 {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field2361 = 0;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "Lcd;")
    public static class64 field2363 = class44.method335((byte) 71, " loggt sich ein)3");

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "Lnm;")
    public static class176 field2362 = null;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Lcd;")
    public static class64 field2366 = class44.method335((byte) 71, "<br>(X");

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Lcd;")
    public static class64 field2364 = class44.method335((byte) 71, ":clanreq:");

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BJ)V", line = 17)
    public static final void method950(byte arg0, long arg1) {
        field2365++;
        if (arg1 == 0L) {
            return;
        }
        class240.field4097++;
        class17.field353.method1214(-24, 8);
        class17.field353.method161((byte) 88, arg1);
        if (arg0 != -113) {
            method951((byte) -38);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V", line = 40)
    public static void method951(byte arg0) {
        field2362 = null;
        field2363 = null;
        field2364 = null;
        field2366 = null;
        if (arg0 > -23) {
            method951((byte) -11);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILsa;)V", line = 70)
    public static final void method952(int arg0, class103 arg1) {
        if (arg0 > -80) {
            field2364 = (class64) null;
        }
        int var2 = arg1.field1888 - class29.field482;
        field2367++;
        int var3 = arg1.field1908 * 128 + (arg1.method325(-12808) * 64);
        int var4 = arg1.field1870 * 128 + arg1.method325(-12808) * 64;
        arg1.field1859 += (var3 - arg1.field1859) / var2;
        arg1.field1890 = 0;
        arg1.field1865 += (var4 - arg1.field1865) / var2;
        if (arg1.field1906 == 0) {
            arg1.field1889 = 1024;
        }
        if (arg1.field1906 == 1) {
            arg1.field1889 = 1536;
        }
        if (arg1.field1906 == 2) {
            arg1.field1889 = 0;
        }
        if (arg1.field1906 == 3) {
            arg1.field1889 = 512;
        }
    }
}
