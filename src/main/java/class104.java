import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class104 {

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field1545 = 0;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1549 = new CRC32();

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "Lma;")
    public static class5 field1553 = class12.method119("Hidden)2use", (byte) 62);

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "[S")
    public static short[] field1554 = new short[500];

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "Lni;")
    public static class202 field1552;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLni;)V", line = 5)
    public static final void method658(byte arg0, class202 arg1) {
        field1544++;
        if (arg0 != -114) {
            field1549 = (CRC32) null;
        }
        class46.field703 = arg1;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V", line = 18)
    public static void method659(int arg0) {
        if (arg0 != 847877904) {
            method662(-89);
        }
        field1549 = null;
        field1553 = null;
        field1552 = null;
        field1554 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIIZII)V", line = 35)
    public static final void method660(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        field1547++;
        int var9 = arg5 - arg7;
        int var10 = arg0 - arg2;
        int var11 = (arg8 - arg3 << 16) / var9;
        if (arg6) {
            int var12 = (arg1 - arg4 << 16) / var10;
            class89.method584(arg0, arg4, arg5, arg2, 0, arg3, var12, arg7, 0, (byte) -82, var11);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V", line = 53)
    public static final void method661(int arg0) {
        field1551++;
        if (arg0 < 91) {
            method659(100);
        }
        if (!class265.field4539) {
            return;
        }
        class253 var1 = class282.method1911(class114.field1698, class218.field3528, -16037);
        if (var1 != null && var1.field4239 != null) {
            class256 var2 = new class256();
            var2.field4372 = var1.field4239;
            var2.field4382 = var1;
            class12.method122(var2, (byte) -104);
        }
        class265.field4539 = false;
        class29.method205(var1, (byte) 105);
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)[Lla;", line = 82)
    public static final class178[] method662(int arg0) {
        field1548++;
        if (arg0 <= 25) {
            return (class178[]) null;
        }
        class178[] var1 = new class178[class79.field1221];
        for (int var2 = 0; var2 < class79.field1221; var2++) {
            var1[var2] = new class178(class282.field4786, class281.field4765, class88.field1315[var2], class287.field4836[var2], class112.field1665[var2], class179.field2718[var2], class37.field590[var2], class268.field4610);
        }
        class207.method1365(9);
        return var1;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)Lma;", line = 124)
    public static final class5 method663(int arg0, int arg1) {
        field1550++;
        return arg0 >= class20.field344[arg1].method36(30673) ? class118.field1786[arg1] : class288.method1940((byte) 95, new class5[] { class118.field1786[arg1], class241.field4022, class20.field344[arg1] });
    }
}
