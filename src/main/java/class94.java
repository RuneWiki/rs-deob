import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class94 extends class116 {

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "Lic;")
    public static class59 field2399 = class59.method433(0, "und loggen sich dann erneut ein)3");

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
    public static int field2400 = 1;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "I")
    public static int field2406 = -1;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "I")
    public static int field2408 = 0;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "Lic;")
    private static class59 field2397 = class59.method433(0, "red:");

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "Lic;")
    public static class59 field2402 = field2397;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "Lic;")
    private static class59 field2401 = class59.method433(0, "This computers address has been blocked");

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "I")
    public static int field2409 = 0;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
    public static int field2405 = -1;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "Lic;")
    public static class59 field2410 = field2401;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "Lic;")
    public static class59 field2403 = class59.method433(0, " loggt sich ein)3");

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "Lic;")
    public static class59 field2398 = field2397;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "Llf;")
    public static class82 field2407 = new class82(100);

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "J")
    public static long field2404;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "Lic;")
    public class59 field2393;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)I")
    public static final int method780(int arg0, byte arg1) {
        field2394++;
        int var7 = arg0 - 1;
        if (arg1 != 82) {
            field2404 = -57L;
        }
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIZILdd;I)V")
    public static final void method781(int arg0, int arg1, boolean arg2, int arg3, class26 arg4, int arg5) {
        class41.field1047 = 10000;
        class127.field2877 = arg1;
        if (arg3 >= -14) {
            field2406 = 13;
        }
        class76.field1861 = arg4;
        class125.field2849 = 1;
        class149.field3265 = arg0;
        class100.field2479 = arg2;
        class63.field1603 = arg5;
        field2396++;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
    public static void method782(int arg0) {
        field2401 = null;
        field2398 = null;
        field2407 = null;
        field2397 = null;
        field2399 = null;
        field2402 = null;
        field2410 = null;
        if (arg0 != -22464) {
            method781(-64, -46, true, -101, null, 96);
        }
        field2403 = null;
    }
}
