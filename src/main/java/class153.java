import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class153 {

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field2122 = -1;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2126 = "Loading...";

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "J")
    public static volatile long field2129 = 0L;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Lhc;")
    public static class235 field2127;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1017(byte arg0, String arg1) {
        field2124++;
        if (class297.field4694 == null) {
            return;
        }
        int var2 = 0;
        long var3 = class73.method465((byte) -124, arg1);
        if (var3 == 0L) {
            return;
        }
        while (class297.field4694.length > var2 && class297.field4694[var2].field2369 != var3) {
            var2++;
        }
        if (arg0 != 27) {
            method1019((byte) 15);
        }
        if (class297.field4694.length > var2 && class297.field4694[var2] != null) {
            class27.field356++;
            class281.field4359.method1864(76, (byte) -69);
            class281.field4359.method1451(class297.field4694[var2].field2369, (byte) -24);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lmi;I)V")
    public static final void method1018(class266 arg0, int arg1) {
        field2128++;
        if (class52.field740 == arg0.field3996 || arg0.field4040 == -1 || arg0.field3985 != 0 || arg0.field4080 + 1 > class132.method905(true, arg0.field4040).field3673[arg0.field4024]) {
            int var2 = arg0.field3996 - arg0.field4012;
            int var3 = class52.field740 - arg0.field4012;
            int var4 = arg0.field4065 * 128 + (arg0.method561(-1) * 64);
            int var5 = arg0.field4075 * 128 + arg0.method561(-1) * 64;
            int var6 = arg0.field4001 * 128 + (arg0.method561(-1) * 64);
            int var7 = arg0.field4055 * 128 + (arg0.method561(-1) * 64);
            arg0.field4085 = ((var2 - var3) * var5 + var3 * var7) / var2;
            arg0.field4019 = ((var2 - var3) * var4 + var3 * var6) / var2;
        }
        arg0.field4021 = 0;
        if (arg0.field4072 == 0) {
            arg0.field4009 = 1024;
        }
        if (arg0.field4072 == 1) {
            arg0.field4009 = 1536;
        }
        if (arg1 > -96) {
            field2129 = 104L;
        }
        if (arg0.field4072 == 2) {
            arg0.field4009 = 0;
        }
        if (arg0.field4072 == 3) {
            arg0.field4009 = 512;
        }
        arg0.field4010 = arg0.field4009;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
    public static void method1019(byte arg0) {
        if (arg0 > -81) {
            method1018((class266) null, 38);
        }
        field2126 = null;
        field2127 = null;
    }
}
