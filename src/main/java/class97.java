import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class97 extends class44 {

    @OriginalMember(owner = "client!qa", name = "Hb", descriptor = "I")
    public int field2407 = 0;

    @OriginalMember(owner = "client!qa", name = "vb", descriptor = "I")
    public static int field2395 = 0;

    @OriginalMember(owner = "client!qa", name = "Cb", descriptor = "I")
    public static int field2402 = 0;

    @OriginalMember(owner = "client!qa", name = "Ab", descriptor = "[I")
    public static int[] field2400 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!qa", name = "Eb", descriptor = "La;")
    private static class1 field2404 = class113.method934(-11538, "Hide");

    @OriginalMember(owner = "client!qa", name = "xb", descriptor = "La;")
    private static class1 field2397 = class113.method934(-11538, "button near the top of that page)3");

    @OriginalMember(owner = "client!qa", name = "Bb", descriptor = "La;")
    private static class1 field2401 = class113.method934(-11538, "yellow:");

    @OriginalMember(owner = "client!qa", name = "ub", descriptor = "La;")
    public static class1 field2394 = field2401;

    @OriginalMember(owner = "client!qa", name = "Fb", descriptor = "Z")
    public static volatile boolean field2405 = true;

    @OriginalMember(owner = "client!qa", name = "wb", descriptor = "La;")
    public static class1 field2396 = field2404;

    @OriginalMember(owner = "client!qa", name = "Db", descriptor = "La;")
    public static class1 field2403 = field2397;

    @OriginalMember(owner = "client!qa", name = "zb", descriptor = "I")
    public static volatile int field2399 = 0;

    @OriginalMember(owner = "client!qa", name = "sb", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!qa", name = "tb", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!qa", name = "yb", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!qa", name = "Gb", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lnb;Z)V", line = 3)
    public static final void method838(class80 arg0, boolean arg1) {
        if (arg1) {
            method840(-48);
        }
        int var2 = arg0.field2002 * 128 + arg0.field1973 * 64;
        int var3 = arg0.field1989 - class82.field2066;
        if (arg0.field1950 == 0) {
            arg0.field1957 = 1024;
        }
        field2393++;
        if (arg0.field1950 == 1) {
            arg0.field1957 = 1536;
        }
        if (arg0.field1950 == 2) {
            arg0.field1957 = 0;
        }
        int var4 = arg0.field1973 * 64 + arg0.field1958 * 128;
        arg0.field1975 += (var2 - arg0.field1975) / var3;
        if (arg0.field1950 == 3) {
            arg0.field1957 = 512;
        }
        arg0.field1951 = 0;
        arg0.field1966 += (var4 - arg0.field1966) / var3;
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V", line = 45)
    public static void method839(int arg0) {
        field2401 = null;
        field2397 = null;
        if (arg0 != -1) {
            return;
        }
        field2404 = null;
        field2403 = null;
        field2394 = null;
        field2400 = null;
        field2396 = null;
    }

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V", line = 68)
    public static final void method840(int arg0) {
        if (arg0 != -1) {
            return;
        }
        for (int var1 = 0; var1 < class80.field2030; var1++) {
            int var2 = class50.field1350[var1];
            class2 var3 = class80.field2033[var2];
            int var4 = class15.field489.method145(false);
            if ((var4 & 0x2) != 0) {
                var4 += class15.field489.method145(false) << 8;
            }
            class4.method103(var3, (byte) 51, var4, var2);
        }
        field2406++;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lba;I)V", line = 101)
    public final void method841(class8 arg0, int arg1) {
        field2398++;
        while (true) {
            int var3 = arg0.method145(false);
            if (var3 == 0) {
                if (arg1 == 0) {
                    return;
                } else {
                    method839(6);
                    return;
                }
            }
            this.method842(var3, 512, arg0);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILba;)V", line = 150)
    private final void method842(int arg0, int arg1, class8 arg2) {
        if (arg1 != 512) {
            method838(null, true);
        }
        if (arg0 == 5) {
            this.field2407 = arg2.method146(arg1 ^ 0xFD00);
        }
        field2392++;
    }
}
