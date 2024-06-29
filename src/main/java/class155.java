import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class155 {

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "Lqj;")
    public static class196 field2506 = class80.method502("Lade Konfiguration )2 ", -48);

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field2505 = 0;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "Z")
    public static boolean field2504;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public static void method983(int arg0) {
        field2506 = null;
        if (arg0 != -105) {
            field2506 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILqj;)V")
    public static final void method984(int arg0, class196 arg1) {
        class10 var2 = class66.method426(arg1, 12);
        int var3 = 52 % ((27 - arg0) / 54);
        field2508++;
        if (var2 == null) {
            return;
        }
        class120.field1737 = class83.field1213 + class83.field1203 - var2.field117;
        class45.field537 = var2.field124 - class212.field3809;
        int var4 = class45.field537 - (int) ((double) class12.field135.field3085 / class199.field3530);
        int var5 = class120.field1737 - (int) ((double) class12.field135.field2997 / class199.field3530);
        int var6 = class45.field537 + (int) ((double) class12.field135.field3085 / class199.field3530);
        if (var4 < 0) {
            class45.field537 = (int) ((double) class12.field135.field3085 / class199.field3530);
        }
        if (var6 > class144.field2221) {
            class45.field537 = class144.field2221 - (int) ((double) class12.field135.field3085 / class199.field3530);
        }
        int var7 = (int) ((double) class12.field135.field2997 / class199.field3530) + class120.field1737;
        if (var5 < 0) {
            class120.field1737 = (int) ((double) class12.field135.field2997 / class199.field3530);
        }
        if (class83.field1213 < var7) {
            class120.field1737 = class83.field1213 - (int) ((double) class12.field135.field2997 / class199.field3530);
        }
    }
}
