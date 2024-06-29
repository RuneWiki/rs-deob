import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class128 {

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "J")
    public static long field2625 = 0L;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "Lrf;")
    private static class163 field2626 = class53.method392(-103, "Unable to connect)3");

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field2620 = 0;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "Lrf;")
    public static class163 field2627 = field2626;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "Lrf;")
    public static class163 field2628 = field2626;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "Lrf;")
    public static class163 field2634 = class53.method392(-97, ":tradereq:");

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "Lfa;")
    public static class52 field2619 = new class52(8);

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "Lrf;")
    private static class163 field2635 = class53.method392(92, "To create a new account you need to");

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "Lrf;")
    public static class163 field2637 = field2635;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "Lrf;")
    public static class163 field2636 = class53.method392(121, "");

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "Lu;")
    public static class184 field2629;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "Lue;")
    public static class189 field2624;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "Lig;")
    public static class84 field2631;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2630;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public static void method842(int arg0) {
        field2628 = null;
        field2627 = null;
        field2624 = null;
        field2626 = null;
        field2619 = null;
        field2634 = null;
        field2631 = null;
        if (arg0 != 32) {
            method845(111, 60, -33);
        }
        field2637 = null;
        field2629 = null;
        field2635 = null;
        field2636 = null;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
    public static final void method843(int arg0) {
        if (arg0 > -85) {
            field2629 = null;
        }
        field2621++;
        while (class105.field2195.method332(class74.field1554, 124) >= 11) {
            int var1 = class105.field2195.method331(11, -2055311549);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class121.field2553[var1] == null) {
                class121.field2553[var1] = new class38();
                if (class44.field899[var1] != null) {
                    class121.field2553[var1].method242(class44.field899[var1], -1);
                }
                var2 = true;
            }
            class27.field504[class112.field2377++] = var1;
            class38 var3 = class121.field2553[var1];
            var3.field711 = class51.field1023;
            int var4 = class105.field2195.method331(5, -2055311549);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class58.field1176[class105.field2195.method331(3, -2055311549)];
            if (var2) {
                var3.field737 = var3.field727 = var5;
            }
            int var6 = class105.field2195.method331(1, -2055311549);
            int var7 = class105.field2195.method331(1, -2055311549);
            if (var7 == 1) {
                class52.field1088[class181.field3638++] = var1;
            }
            int var8 = class105.field2195.method331(5, -2055311549);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method225(class56.field1136.field718[0] + var4, class56.field1136.field692[0] + var8, -77, ~var6 == -2);
        }
        class105.field2195.method334(-7);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "([BLfa;I)V")
    public final void method844(byte[] arg0, class52 arg1, int arg2) {
        if (arg2 != -16228) {
            method843(-2);
        }
        field2622++;
        if (arg1.field1054[arg1.field1033] != 31 || arg1.field1054[arg1.field1033 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2630 == null) {
            this.field2630 = new Inflater(true);
        }
        try {
            this.field2630.setInput(arg1.field1054, arg1.field1033 + 10, arg1.field1054.length + -8 + -10 + -arg1.field1033);
            this.field2630.inflate(arg0);
        } catch (Exception var4) {
            this.field2630.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2630.reset();
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
    public class128() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)I")
    public static final int method845(int arg0, int arg1, int arg2) {
        field2633++;
        if (arg2 <= 114) {
            method845(-84, 29, -101);
        }
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg1 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(III)V")
    private class128(int arg0, int arg1, int arg2) {
    }
}
