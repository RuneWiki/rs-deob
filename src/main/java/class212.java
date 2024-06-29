import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class212 {

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3177 = new CRC32();

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3180 = "Drop";

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Lsb;")
    public static class230 field3179;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)V")
    public static final void method1354(int arg0, int arg1) {
        field3176++;
        if (arg1 == -7478) {
            class187 var2 = class120.method762((byte) -112, 3, arg0);
            var2.method1162(1);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lqa;B)V")
    public static final void method1355(class153 arg0, byte arg1) {
        field3175++;
        int var2 = arg0.field2262 - class270.field4058;
        int var3 = arg0.field2224 * 128 + (arg0.method676(-30217) * 64);
        int var4 = arg0.field2252 * 128 + (arg0.method676(arg1 ^ 0x767C) * 64);
        arg0.field2234 += (var4 - arg0.field2234) / var2;
        arg0.field2219 = 0;
        if (arg0.field2293 == 0) {
            arg0.field2233 = 1024;
        }
        arg0.field2251 += (var3 - arg0.field2251) / var2;
        if (arg0.field2293 == 1) {
            arg0.field2233 = 1536;
        }
        if (arg1 != -117) {
            field3180 = null;
        }
        if (arg0.field2293 == 2) {
            arg0.field2233 = 0;
        }
        if (arg0.field2293 == 3) {
            arg0.field2233 = 512;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
    public static final void method1356(byte arg0) {
        field3178++;
        if (arg0 != 127) {
            field3179 = null;
        }
        class241.field3604.method1782(0);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method1357(int arg0) {
        field3177 = null;
        field3180 = null;
        field3179 = null;
        if (arg0 != 4) {
            field3179 = null;
        }
    }
}
