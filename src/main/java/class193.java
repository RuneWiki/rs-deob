import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class193 extends class61 {

    @OriginalMember(owner = "client!pl", name = "W", descriptor = "Lwm;")
    private class152 field3074 = class245.field4103;

    @OriginalMember(owner = "client!pl", name = "J", descriptor = "Lwm;")
    public static class152 field3061 = class157.method1048(" )2> ", 120);

    @OriginalMember(owner = "client!pl", name = "I", descriptor = "I")
    public static int field3060 = 128;

    @OriginalMember(owner = "client!pl", name = "O", descriptor = "I")
    public static int field3066 = 0;

    @OriginalMember(owner = "client!pl", name = "T", descriptor = "Lwm;")
    private static class152 field3071 = class157.method1048("K", 104);

    @OriginalMember(owner = "client!pl", name = "L", descriptor = "Lwm;")
    public static class152 field3063 = field3071;

    @OriginalMember(owner = "client!pl", name = "V", descriptor = "Lwm;")
    public static class152 field3073 = class157.method1048("::wm0", 124);

    @OriginalMember(owner = "client!pl", name = "ab", descriptor = "I")
    public static int field3078 = 0;

    @OriginalMember(owner = "client!pl", name = "D", descriptor = "[I")
    public static int[] field3055 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!pl", name = "db", descriptor = "Lwm;")
    public static class152 field3081 = field3071;

    @OriginalMember(owner = "client!pl", name = "Y", descriptor = "Lwm;")
    public static class152 field3076 = class157.method1048("clignotant2:", 118);

    @OriginalMember(owner = "client!pl", name = "bb", descriptor = "Lwm;")
    public static class152 field3079 = class157.method1048("mapflag", 96);

    @OriginalMember(owner = "client!pl", name = "E", descriptor = "I")
    public int field3056;

    @OriginalMember(owner = "client!pl", name = "F", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!pl", name = "G", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!pl", name = "H", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!pl", name = "M", descriptor = "I")
    private int field3064;

    @OriginalMember(owner = "client!pl", name = "N", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!pl", name = "P", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!pl", name = "Q", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!pl", name = "R", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!pl", name = "S", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!pl", name = "U", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!pl", name = "Z", descriptor = "I")
    public int field3077;

    @OriginalMember(owner = "client!pl", name = "cb", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!pl", name = "eb", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!pl", name = "fb", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!pl", name = "K", descriptor = "Lol;")
    public class231 field3062;

    @OriginalMember(owner = "client!pl", name = "X", descriptor = "Lol;")
    private class231 field3075;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BI)Lwm;", line = 13)
    public final class152 method1287(byte arg0, int arg1) {
        if (arg0 != -8) {
            return (class152) null;
        }
        field3067++;
        if (this.field3062 == null) {
            return this.field3074;
        } else {
            class74 var3 = (class74) this.field3062.method1586((long) arg1, -76);
            return var3 == null ? this.field3074 : var3.field1074;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZLoe;)V", line = 35)
    public static final void method1288(int arg0, boolean arg1, class127 arg2) {
        field3069++;
        if (arg0 < 115) {
            method1288(-99, true, (class127) null);
        }
        int var3 = arg2.field1915 == 0 ? arg2.field1921 : arg2.field1915;
        int var4 = arg2.field1875 == 0 ? arg2.field1876 : arg2.field1875;
        class50.method347(class215.field3501[arg2.field1868 >> 16], var3, arg1, 0, arg2.field1868, var4);
        if (arg2.field1937 != null) {
            class50.method347(arg2.field1937, var3, arg1, 0, arg2.field1868, var4);
        }
        class122 var5 = (class122) class107.field1519.method1586((long) arg2.field1868, -120);
        if (var5 != null) {
            class248.method1699(var5.field1724, -1, arg1, var4, var3);
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)V", line = 60)
    private final void method1289(byte arg0) {
        if (arg0 <= 62) {
            return;
        }
        field3070++;
        this.field3075 = new class231(this.field3062.method1588((byte) 114));
        for (class74 var2 = (class74) this.field3062.method1585(-1506054736); var2 != null; var2 = (class74) this.field3062.method1581((byte) 106)) {
            class50 var3 = new class50(var2.field1074, (int) var2.field4689);
            this.field3075.method1593(var2.field1074.method986(92), var3, 27497);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lwm;I)Z", line = 82)
    public final boolean method1290(class152 arg0, int arg1) {
        field3059++;
        if (arg1 >= -4) {
            this.method1295(-59);
        }
        if (this.field3062 == null) {
            return false;
        }
        if (this.field3075 == null) {
            this.method1289((byte) 89);
        }
        for (class50 var3 = (class50) this.field3075.method1586(arg0.method986(92), -53); var3 != null; var3 = (class50) this.field3075.method1590(false)) {
            if (var3.field779.method992(23292, arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)I", line = 114)
    public final int method1291(int arg0, int arg1) {
        field3080++;
        if (this.field3062 == null) {
            return this.field3064;
        } else {
            int var3 = 124 % ((-arg0 - 66) / 42);
            class114 var4 = (class114) this.field3062.method1586((long) arg1, -110);
            return var4 == null ? this.field3064 : var4.field1616;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lhi;B)V", line = 133)
    public final void method1292(class291 arg0, byte arg1) {
        field3065++;
        if (arg1 > -87) {
            return;
        }
        while (true) {
            int var3 = arg0.method2011(-40);
            if (var3 == 0) {
                return;
            }
            this.method1296(arg0, var3, 0);
        }
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(B)V", line = 155)
    public static void method1293(byte arg0) {
        if (arg0 >= -110) {
            method1293((byte) -31);
        }
        field3071 = null;
        field3076 = null;
        field3055 = null;
        field3061 = null;
        field3081 = null;
        field3073 = null;
        field3063 = null;
        field3079 = null;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(II)Z", line = 174)
    public final boolean method1294(int arg0, int arg1) {
        field3083++;
        if (this.field3062 == null) {
            return false;
        }
        if (this.field3075 == null) {
            this.method1295(7);
        }
        class114 var3 = (class114) this.field3075.method1586((long) arg1, -99);
        if (arg0 != 0) {
            this.field3062 = (class231) null;
        }
        return var3 != null;
    }

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "(I)V", line = 207)
    private final void method1295(int arg0) {
        this.field3075 = new class231(this.field3062.method1588((byte) 114));
        field3058++;
        if (arg0 == 7) {
            for (class114 var2 = (class114) this.field3062.method1585(-1506054736); var2 != null; var2 = (class114) this.field3062.method1581((byte) 114)) {
                class114 var3 = new class114((int) var2.field4689);
                this.field3075.method1593((long) var2.field1616, var3, 27497);
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(Lhi;II)V", line = 249)
    private final void method1296(class291 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3056 = arg0.method2011(-46);
        } else if (arg1 == 2) {
            this.field3077 = arg0.method2011(-30);
        } else if (arg1 == 3) {
            this.field3074 = arg0.method2017(true);
        } else if (arg1 == 4) {
            this.field3064 = arg0.method1969((byte) -16);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method2021((byte) 74);
            this.field3062 = new class231(class270.method1847(var4, 96));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1969((byte) -16);
                class273 var7;
                if (arg1 == 5) {
                    var7 = new class74(arg0.method2017(true));
                } else {
                    var7 = new class114(arg0.method1969((byte) -16));
                }
                this.field3062.method1593((long) var6, var7, 27497);
            }
        }
        if (arg2 != 0) {
            field3079 = (class152) null;
        }
        field3057++;
    }
}
