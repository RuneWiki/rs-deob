import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class83 {

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field1510 = 0;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "Lke;")
    public static class256 field1514 = class316.method2202(":clan:", 27626);

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field1503 = 0;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public static int field1518 = 0;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "Lke;")
    public static class256 field1521 = class316.method2202("Benutzen", 27626);

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public int field1509;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public int field1516;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    private int field1520;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "Lng;")
    public static class138 field1519;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "Z")
    public static boolean field1504;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "Z")
    public static boolean field1515;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "[I")
    public static int[] field1513;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)I", line = 4)
    public static final int method610(byte arg0, int arg1) {
        field1505++;
        if (arg0 >= -87) {
            method610((byte) 69, 14);
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILng;I)Z", line = 18)
    public static final boolean method611(int arg0, int arg1, class138 arg2, int arg3) {
        field1511++;
        byte[] var4 = arg2.method1016(arg3, 100, arg0);
        if (var4 == null) {
            return false;
        } else {
            class45.method375(-108, var4);
            int var5 = 10 % ((31 - arg1) / 56);
            return true;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)Lj;", line = 35)
    public final class227 method612(int arg0) {
        field1508++;
        class227 var2 = (class227) class114.field2008.method2077(-13408, (long) this.field1520);
        if (var2 != null) {
            return var2;
        }
        class227 var3 = class307.method2135(this.field1520, (byte) 15, arg0, class303.field5245);
        if (var3 != null) {
            class114.field2008.method2074(var3, (long) this.field1520, -1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V", line = 53)
    public static void method613(int arg0) {
        field1514 = null;
        field1513 = null;
        field1521 = null;
        field1519 = null;
        if (arg0 != 19962) {
            method610((byte) -28, -25);
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V", line = 73)
    public static final void method614(int arg0) {
        field1512++;
        for (class187 var1 = (class187) class246.field4191.method1270((byte) -121); var1 != null; var1 = (class187) class246.field4191.method1277(1)) {
            if (var1.field3291) {
                var1.method1352(128);
            }
        }
        int var2 = 7 / ((arg0 + 19) / 55);
        for (class187 var3 = (class187) class186.field3272.method1270((byte) -121); var3 != null; var3 = (class187) class186.field3272.method1277(1)) {
            if (var3.field3291) {
                var3.method1352(128);
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILra;II)V", line = 114)
    private final void method615(int arg0, class41 arg1, int arg2, int arg3) {
        field1517++;
        if (arg0 <= 112) {
            return;
        }
        if (arg3 == 1) {
            this.field1520 = arg1.method346(-16);
        } else if (arg3 == 2) {
            this.field1509 = arg1.method357(false);
            this.field1516 = arg1.method357(false);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILra;I)V", line = 144)
    public final void method616(int arg0, class41 arg1, int arg2) {
        if (arg0 != -14024) {
            return;
        }
        while (true) {
            int var4 = arg1.method357(false);
            if (var4 == 0) {
                field1507++;
                return;
            }
            this.method615(arg0 ^ 0xFFFFC945, arg1, arg2, var4);
        }
    }
}
