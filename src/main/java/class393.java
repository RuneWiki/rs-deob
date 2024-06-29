import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class393 {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "Lnc;")
    public static class126 field5503 = new class126(0, -1);

    @OriginalMember(owner = "client!o", name = "e", descriptor = "[Lkq;")
    public static class89[] field5507 = new class89[6];

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field5504;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)C", line = 3)
    public static final char method2421(byte arg0, int arg1) {
        field5504++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (arg1 != 20483) {
            field5503 = null;
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class43.field645[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V", line = 39)
    public static void method2422(byte arg0) {
        field5503 = null;
        if (arg0 != 113) {
            field5506 = 91;
        }
        field5507 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BLpe;IILbi;)V", line = 56)
    public static final void method2423(byte arg0, class391 arg1, int arg2, int arg3, class139 arg4) {
        if (arg4.field2023 == 2) {
            for (int var5 = arg3; var5 <= arg2; var5++) {
                int var6 = arg4.field2101[var5] - 1;
                if (var6 != -1) {
                    if (class363.field5021 == 1 && class22.field413 == var5 && class272.field3661 == arg4.field1968) {
                        boolean var7 = class191.method1376(-128, arg1, (class24) null, arg4.field2071[var5], 2, 0, var6, arg4.field1962) == null;
                        if (var7) {
                            class260.field3509.method1249(new class200(var6, arg4.field2071[var5], 2, 0, arg4.field1962, false), (byte) -127);
                        }
                    } else {
                        boolean var8 = class191.method1376(-115, arg1, (class24) null, arg4.field2071[var5], 1, -13623264, var6, arg4.field1962) == null;
                        if (var8) {
                            class260.field3509.method1249(new class200(var6, arg4.field2071[var5], 1, -13623264, arg4.field1962, false), (byte) -120);
                        }
                    }
                }
            }
        } else if (arg4.field2023 == 5) {
            boolean var9 = class191.method1376(-114, arg1, arg4.field2013 ? class95.field1379.field4608 : null, arg4.field2003, arg4.field2001, arg4.field2076 | 0xFF000000, arg4.field2034, arg4.field1962) == null;
            if (var9) {
                class260.field3509.method1249(new class200(arg4.field2034, arg4.field2003, arg4.field2001, arg4.field2076 | 0xFF000000, arg4.field1962, arg4.field2013), (byte) -115);
            }
        }
        if (arg0 != 112) {
            method2423((byte) 13, (class391) null, 52, -117, (class139) null);
        }
        field5505++;
    }
}
