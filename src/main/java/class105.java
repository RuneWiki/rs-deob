import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class105 extends class129 {

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "[I")
    public int[] field1950 = new int[5];

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "[Lad;")
    public class5[] field1948 = new class5[5];

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public int field1943 = 0;

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "I")
    public int field1951;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
    public int field1947;

    @OriginalMember(owner = "client!kf", name = "W", descriptor = "I")
    public int field1966;

    @OriginalMember(owner = "client!kf", name = "Q", descriptor = "I")
    public int field1960;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "Lrd;")
    public static class173 field1939 = class133.method843("Sichtbare Karte vorbereitet)3", 127);

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "Lqf;")
    public static class165 field1941 = null;

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "[I")
    public static int[] field1955 = new int[5];

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "Laf;")
    public static class7 field1938 = new class7(64);

    @OriginalMember(owner = "client!kf", name = "Y", descriptor = "I")
    public static int field1968 = 0;

    @OriginalMember(owner = "client!kf", name = "ab", descriptor = "I")
    public static int field1970 = 0;

    @OriginalMember(owner = "client!kf", name = "bb", descriptor = "[Lgg;")
    public static class67[] field1971 = new class67[4];

    @OriginalMember(owner = "client!kf", name = "X", descriptor = "Lrd;")
    public static class173 field1967 = class133.method843("; Expires=", -109);

    @OriginalMember(owner = "client!kf", name = "db", descriptor = "I")
    public static int field1973 = 2;

    @OriginalMember(owner = "client!kf", name = "Z", descriptor = "Lrd;")
    public static class173 field1969 = class133.method843("Ung-Ultige Session)2ID)3", 52);

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public int field1940;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    public int field1945;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
    public int field1946;

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "I")
    public int field1953;

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!kf", name = "R", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!kf", name = "S", descriptor = "I")
    public int field1962;

    @OriginalMember(owner = "client!kf", name = "cb", descriptor = "I")
    public int field1972;

    @OriginalMember(owner = "client!kf", name = "T", descriptor = "Lkf;")
    public class105 field1963;

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "Lkh;")
    public class107 field1959;

    @OriginalMember(owner = "client!kf", name = "U", descriptor = "Lnc;")
    public class132 field1964;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "Loi;")
    public class148 field1952;

    @OriginalMember(owner = "client!kf", name = "eb", descriptor = "Lqf;")
    public static class165 field1974;

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "Lw;")
    public class216 field1957;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "Lca;")
    public class22 field1954;

    @OriginalMember(owner = "client!kf", name = "V", descriptor = "Lfa;")
    public class52 field1965;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "Z")
    public boolean field1942;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "Z")
    public boolean field1944;

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "Z")
    public boolean field1949;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "[I")
    public static int[] field1937;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lmb;I)Lga;")
    public static final class62 method646(class121 arg0, int arg1) {
        field1956++;
        if (arg1 != 22337) {
            method649(-25);
        }
        return new class62(arg0.method782(true), arg0.method782(true), arg0.method782(true), arg0.method782(true), arg0.method780(16711680), arg0.method751((byte) -115));
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IB)I")
    public static final int method647(int arg0, byte arg1) {
        class131 var2 = class23.method188(arg0, (byte) 89);
        field1961++;
        int var3 = var2.field2468;
        int var4 = var2.field2471;
        if (arg1 != 71) {
            method649(-106);
        }
        int var5 = var2.field2477;
        int var6 = class11.field188[var5 - var3];
        return var6 & class45.field913[var4] >> var3;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(III)V")
    public class105(int arg0, int arg1, int arg2) {
        this.field1951 = arg1;
        this.field1966 = this.field1947 = arg0;
        this.field1960 = arg2;
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)V")
    public static final void method648(int arg0) {
        field1936++;
        if (arg0 != -30906) {
            return;
        }
        for (class46 var1 = (class46) class184.field3609.method915(-1); var1 != null; var1 = (class46) class184.field3609.method910((byte) 88)) {
            if (class172.field3347 != var1.field974 || var1.field972 < class217.field4203) {
                var1.method824((byte) -124);
            } else if (class217.field4203 >= var1.field952) {
                if (var1.field958 > 0) {
                    class120 var2 = client.field632[var1.field958 - 1];
                    if (var2 != null && var2.field2820 >= 0 && var2.field2820 < 13312 && var2.field2801 >= 0 && var2.field2801 < 13312) {
                        var1.method324(false, var2.field2820, class56.method361(var1.field974, var2.field2801, (byte) 118, var2.field2820) - var1.field963, class217.field4203, var2.field2801);
                    }
                }
                if (var1.field958 < 0) {
                    int var3 = -var1.field958 - 1;
                    class212 var4;
                    if (class33.field733 == var3) {
                        var4 = class175.field3447;
                    } else {
                        var4 = class183.field3600[var3];
                    }
                    if (var4 != null && var4.field2820 >= 0 && var4.field2820 < 13312 && var4.field2801 >= 0 && var4.field2801 < 13312) {
                        var1.method324(false, var4.field2820, class56.method361(var1.field974, var4.field2801, (byte) 117, var4.field2820) - var1.field963, class217.field4203, var4.field2801);
                    }
                }
                var1.method323(class171.field3305, -34);
                class55.method357(class172.field3347, (int) var1.field983, (int) var1.field968, (int) var1.field986, 60, var1, var1.field989, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)V")
    public static final void method649(int arg0) {
        if (arg0 != -1) {
            field1967 = null;
        }
        for (int var1 = 0; var1 < class66.field1291; var1++) {
            int var2 = class139.field2597[var1];
            class120 var3 = client.field632[var2];
            if (var3 != null) {
                class145.method924(var3.field2215.field929, var3, -592620052);
            }
        }
        field1958++;
    }

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "(I)V")
    public static void method650(int arg0) {
        field1955 = null;
        field1939 = null;
        field1974 = null;
        field1969 = null;
        field1937 = null;
        field1971 = null;
        field1938 = null;
        field1941 = null;
        field1967 = null;
        if (arg0 != 0) {
            method647(-77, (byte) 28);
        }
    }
}
