import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class167 extends class150 {

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "Lrd;")
    private static class173 field3216 = class133.method843("Jun", -101);

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "Lrd;")
    private static class173 field3212 = class133.method843("Aug", -100);

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "Lrd;")
    private static class173 field3213 = class133.method843("Oct", 98);

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "[I")
    public static int[] field3215 = new int[100];

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "Lrd;")
    private static class173 field3214 = class133.method843("Dec", -90);

    @OriginalMember(owner = "client!qh", name = "A", descriptor = "Lrd;")
    private static class173 field3222 = class133.method843("Jan", -101);

    @OriginalMember(owner = "client!qh", name = "B", descriptor = "Z")
    public static boolean field3223 = false;

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "Lrd;")
    private static class173 field3220 = class133.method843("Apr", 27);

    @OriginalMember(owner = "client!qh", name = "D", descriptor = "I")
    public static int field3225 = 0;

    @OriginalMember(owner = "client!qh", name = "F", descriptor = "I")
    public static int field3227 = -1;

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "Lrd;")
    private static class173 field3230 = class133.method843("May", 30);

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "Lrd;")
    private static class173 field3217 = class133.method843("Mar", 25);

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "Lrd;")
    private static class173 field3228 = class133.method843("Nov", -73);

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "Lrd;")
    private static class173 field3232 = class133.method843("Sep", 113);

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "[Lrd;")
    public static class173[] field3231 = new class173[500];

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "Lrd;")
    private static class173 field3224 = class133.method843("Examine", 38);

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "Lrd;")
    public static class173 field3233 = field3224;

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "Lrd;")
    private static class173 field3234 = class133.method843("Feb", -67);

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "Lrd;")
    private static class173 field3221 = class133.method843("Jul", -118);

    @OriginalMember(owner = "client!qh", name = "E", descriptor = "Lrd;")
    public static class173 field3226 = class133.method843("Keine Antwort vom Server)3", -69);

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "[Lrd;")
    public static class173[] field3218 = new class173[] { field3222, field3234, field3217, field3220, field3230, field3216, field3221, field3212, field3232, field3213, field3228, field3214 };

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!qh", name = "H", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "(I)V")
    public static void method1078(int arg0) {
        field3221 = null;
        field3218 = null;
        field3228 = null;
        field3216 = null;
        field3232 = null;
        field3217 = null;
        field3214 = null;
        field3233 = null;
        field3215 = null;
        field3226 = null;
        if (arg0 < 109) {
            field3228 = null;
        }
        field3220 = null;
        field3230 = null;
        field3213 = null;
        field3234 = null;
        field3222 = null;
        field3212 = null;
        field3224 = null;
        field3231 = null;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(IB)V")
    public static final void method1079(int arg0, byte arg1) {
        class134.field2542 = arg0;
        field3235++;
        int var2 = 32 / ((arg1 + 26) / 37);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)Lri;")
    public static final class178 method1080(int arg0, int arg1) {
        field3229++;
        class178 var2 = (class178) class199.field3865.method46((long) arg1, 26580);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class202.field3916.method142(class79.method486(arg1, 16384), class11.method70(-32, arg1), (byte) 2);
        if (arg0 != 11098) {
            return null;
        }
        class178 var4 = new class178();
        if (var3 != null) {
            var4.method1194(-29, new class121(var3));
        }
        var4.method1200(102);
        class199.field3865.method52(-3583, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IBI)I")
    public static final int method1081(int arg0, byte arg1, int arg2) {
        field3219++;
        int var3 = 0;
        int var4 = 17 % (-arg1 / 46);
        while (arg0 > 0) {
            arg0--;
            var3 = arg2 & 0x1 | var3 << 1;
            arg2 >>>= 0x1;
        }
        return var3;
    }
}
