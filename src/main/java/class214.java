import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class214 extends InputStream {

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Lke;")
    public static class256 field3818 = class316.method2202(":assistreq:", 27626);

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Lke;")
    public static class256 field3823 = class316.method2202("(U4", 27626);

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "S")
    public static short field3822 = 256;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!cb", name = "read", descriptor = "()I", line = 14)
    public final int read() {
        class46.method381(30000L, -128);
        field3824++;
        return -1;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)Z", line = 31)
    public static final boolean method1497(int arg0, int arg1) {
        if (arg1 != 1) {
            field3823 = (class256) null;
        }
        field3819++;
        return (arg0 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Z", line = 48)
    public static final boolean method1498(int arg0) {
        field3817++;
        try {
            if (arg0 != 30138) {
                method1501(-17);
            }
            return class70.method539(arg0 ^ 0xFFFF8A06);
        } catch (IOException var5) {
            class84.method617((byte) -125);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class9.field141 + "," + class231.field3966 + "," + class167.field2954 + " - " + class290.field5027 + "," + (class121.field2124.field1215[0] + class134.field2336) + "," + (class121.field2124.field1254[0] + class10.field147) + " - ";
            for (int var4 = 0; class290.field5027 > var4 && var4 < 50; var4++) {
                var3 = var3 + class23.field302.field772[var4] + ",";
            }
            class7.method48(var3, (byte) 105, var6);
            class241.method1615((byte) -24);
            return true;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V", line = 77)
    public static void method1499(int arg0) {
        if (arg0 != 30000) {
            field3818 = (class256) null;
        }
        field3818 = null;
        field3823 = null;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)Z", line = 88)
    public static final boolean method1500(int arg0, int arg1) {
        if (arg1 != -32112) {
            method1502(78);
        }
        field3825++;
        return (arg0 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V", line = 99)
    public static final void method1501(int arg0) {
        class100.field1785.method2076(106);
        if (arg0 > -72) {
            field3818 = (class256) null;
        }
        field3821++;
        class14.field183.method2076(102);
        class45.field837.method2076(95);
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V", line = 118)
    public static final void method1502(int arg0) {
        field3820++;
        class209.field3775.method2076(arg0 + 99);
        class254.field4357.method2076(arg0 ^ 0x5C);
        class111.field1939.method2076(108);
        class132.field2286.method2076(109);
        if (arg0 != 0) {
            field3823 = (class256) null;
        }
    }
}
