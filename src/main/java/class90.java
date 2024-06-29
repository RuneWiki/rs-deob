import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class90 {

    @OriginalMember(owner = "client!n", name = "a", descriptor = "Lac;")
    private class4 field2052 = new class4();

    @OriginalMember(owner = "client!n", name = "x", descriptor = "Lsb;")
    private class124 field2075 = new class124();

    @OriginalMember(owner = "client!n", name = "z", descriptor = "I")
    private int field2077;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "I")
    private int field2063;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "Lab;")
    private class3 field2067;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field2055 = 0;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "Loa;")
    public static class98 field2057 = class38.method349(255, "Freund hinzuf-Ugen");

    @OriginalMember(owner = "client!n", name = "b", descriptor = "J")
    public static long field2053 = 0L;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "Loa;")
    public static class98 field2059 = class38.method349(255, " loggt sich ein)3");

    @OriginalMember(owner = "client!n", name = "w", descriptor = "Loa;")
    public static class98 field2074 = class38.method349(255, "Spiel)2Engine wird gestartet)3)3)3");

    @OriginalMember(owner = "client!n", name = "n", descriptor = "Loa;")
    private static class98 field2065 = class38.method349(255, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Loa;")
    public static class98 field2056 = class38.method349(255, "Anmelde)2Limit -Uberschritten)3");

    @OriginalMember(owner = "client!n", name = "u", descriptor = "Loa;")
    public static class98 field2072 = field2065;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "Loa;")
    private static class98 field2071 = class38.method349(255, "Off");

    @OriginalMember(owner = "client!n", name = "v", descriptor = "[I")
    public static int[] field2073 = new int[32768];

    @OriginalMember(owner = "client!n", name = "F", descriptor = "Loa;")
    public static class98 field2083 = class38.method349(255, "m-Ochte sich mit Ihnen duellieren)3");

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field2061 = 0;

    @OriginalMember(owner = "client!n", name = "B", descriptor = "Loa;")
    public static class98 field2079 = field2071;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!n", name = "D", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!n", name = "E", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "Ljava/awt/Image;")
    public static Image field2069;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "[I")
    public static int[] field2060;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "[Lid;")
    public static class60[] field2068;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BJ)Lac;")
    public final class4 method730(byte arg0, long arg1) {
        if (arg0 != 35) {
            return null;
        }
        field2081++;
        class4 var4 = (class4) this.field2067.method17(-16, arg1);
        if (var4 != null) {
            this.field2075.method977(80, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)I")
    public static final int method731(byte arg0, int arg1) {
        field2076++;
        if (arg0 < 53) {
            field2061 = 122;
        }
        class114 var2 = class101.method834(81, arg1);
        int var3 = var2.field2569;
        int var4 = var2.field2562;
        int var5 = var2.field2567;
        int var6 = client.field502[var5 - var3];
        return class137.field3362[var4] >> var3 & var6;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILac;J)V")
    public final void method732(int arg0, class4 arg1, long arg2) {
        if (~this.field2077 == arg0) {
            class4 var5 = this.field2075.method985((byte) -120);
            var5.method975(-128);
            var5.method22(0);
            if (this.field2052 == var5) {
                class4 var6 = this.field2075.method985((byte) -120);
                var6.method975(arg0 - 112);
                var6.method22(0);
            }
        } else {
            this.field2077--;
        }
        this.field2067.method12(arg1, -31636, arg2);
        this.field2075.method977(43, arg1);
        field2064++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(JI)V")
    public final void method733(long arg0, int arg1) {
        field2058++;
        class4 var4 = (class4) this.field2067.method17(-16, arg0);
        if (var4 != null) {
            var4.method975(99);
            var4.method22(0);
            this.field2077++;
        }
        if (arg1 != 21853) {
            this.field2077 = -80;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public final void method734(int arg0) {
        if (arg0 != -224779128) {
            return;
        }
        field2066++;
        while (true) {
            class4 var2 = this.field2075.method985((byte) -120);
            if (var2 == null) {
                this.field2077 = this.field2063;
                return;
            }
            var2.method975(arg0 ^ 0xD65DB09);
            var2.method22(0);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ltb;BII)Lgb;")
    public static final class45 method735(class130 arg0, byte arg1, int arg2, int arg3) {
        field2062++;
        if (class106.method893((byte) -113, arg2, arg0, arg3)) {
            if (arg1 < 44) {
                field2053 = -91L;
            }
            return client.method206((byte) -78);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILoa;ZLoa;)V")
    public static final void method736(int arg0, class98 arg1, boolean arg2, class98 arg3) {
        if (arg0 == 0 && class83.field1923 != -1) {
            class39.field945 = arg1;
            class42.field976 = 0;
        }
        if (class71.field1462 == -1) {
            class15.field306 = true;
        }
        for (int var4 = 99; var4 > 0; var4--) {
            class148.field3670[var4] = class148.field3670[var4 - 1];
            class65.field1397[var4] = class65.field1397[var4 - 1];
            class141.field3449[var4] = class141.field3449[var4 - 1];
        }
        field2078++;
        if (!arg2) {
            method736(-5, null, true, null);
        }
        class65.field1397[0] = arg3;
        class148.field3670[0] = arg0;
        class141.field3449[0] = arg1;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(I)V")
    public class90(int arg0) {
        this.field2077 = arg0;
        this.field2063 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field2067 = new class3(var2);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Loa;")
    public static final class98 method737(int arg0, int arg1) {
        if (arg0 >= -6) {
            field2055 = 93;
        }
        field2070++;
        return class102.method840(new class98[] { class132.method1074(arg1 >> 24 & 0xFF, (byte) -96), class132.field3188, class132.method1074(arg1 >> 16 & 0xFF, (byte) 56), class132.field3188, class132.method1074(arg1 >> 8 & 0xFF, (byte) 63), class132.field3188, class132.method1074(arg1 & 0xFF, (byte) 90) }, 10);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
    public static void method738(byte arg0) {
        field2079 = null;
        field2072 = null;
        field2083 = null;
        field2065 = null;
        field2056 = null;
        field2074 = null;
        field2059 = null;
        field2069 = null;
        if (arg0 > -9) {
            method738((byte) -92);
        }
        field2060 = null;
        field2057 = null;
        field2068 = null;
        field2073 = null;
        field2071 = null;
    }
}
