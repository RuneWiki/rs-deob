import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class88 {

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    private int field1952 = 0;

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
    private int field1971 = -1;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "Lth;")
    private class187 field1963 = new class187();

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "Z")
    public boolean field1978 = false;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    private int field1955;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "[[[I")
    private int[][][] field1959;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    private int field1956;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "[Lq;")
    private class152[] field1964;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "Ldd;")
    public static class35 field1957 = class180.method1196((byte) 127, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
    public static int field1966 = 0;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "[Z")
    public static boolean[] field1953 = new boolean[8];

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "Ldd;")
    public static class35 field1974 = class180.method1196((byte) -16, "::fps ");

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "Ldd;")
    public static class35 field1961 = class180.method1196((byte) -89, "Hidden)2use");

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
    public static int field1965 = -1;

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "I")
    public static int field1969 = 0;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "Ldd;")
    public static class35 field1977 = class180.method1196((byte) -32, "Texturen geladen)3");

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "Ldd;")
    public static class35 field1972 = class180.method1196((byte) -50, "titlebox");

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "Ldd;")
    public static class35 field1970 = class180.method1196((byte) -68, "");

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "Ldd;")
    public static class35 field1979 = class180.method1196((byte) -95, "Verbinde mit Server)3)3)3");

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "Lpa;")
    public static class144 field1958;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
    public static void method647(int arg0) {
        if (arg0 >= -105) {
            field1972 = null;
        }
        field1970 = null;
        field1953 = null;
        field1977 = null;
        field1979 = null;
        field1958 = null;
        field1974 = null;
        field1972 = null;
        field1957 = null;
        field1961 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IBILag;)[Lba;")
    public static final class12[] method648(int arg0, byte arg1, int arg2, class8 arg3) {
        field1954++;
        if (arg1 != 124) {
            method647(-82);
        }
        return class19.method166(arg2, 61, arg3, arg0) ? class96.method731(-106) : null;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
    public final void method649(int arg0) {
        field1973++;
        for (int var2 = arg0; var2 < this.field1955; var2++) {
            this.field1959[var2][0] = null;
            this.field1959[var2][1] = null;
            this.field1959[var2][2] = null;
            this.field1959[var2] = null;
        }
        this.field1959 = null;
        this.field1964 = null;
        this.field1963.method1230(-13057);
        this.field1963 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BLag;Lae;ZLag;)V")
    public static final void method650(byte arg0, class8 arg1, class6 arg2, boolean arg3, class8 arg4) {
        int var5 = 19 % ((56 - arg0) / 47);
        class95.field2105 = arg1;
        class49.field1067 = arg4;
        class54.field1206 = arg3;
        field1951++;
        class121.field2664 = class49.field1067.method56((byte) 31, 10);
        class14.field250 = arg2;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)J")
    public static final long method651(int arg0, int arg1, int arg2) {
        class54 var3 = class191.field3853[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field1218; var4++) {
            class131 var5 = var3.field1225[var4];
            if ((var5.field2822 >> 29 & 0x3L) == 2L && var5.field2816 == arg1 && var5.field2812 == arg2) {
                return var5.field2822;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)[[[I")
    public final int[][][] method652(int arg0) {
        field1975++;
        if (arg0 < 80) {
            field1970 = null;
        }
        if (this.field1956 != this.field1955) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field1955; var2++) {
            this.field1964[var2] = class105.field2339;
        }
        return this.field1959;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)[[I")
    public final int[][] method653(int arg0, int arg1) {
        if (arg0 != -30711) {
            return null;
        }
        field1976++;
        if (this.field1956 == this.field1955) {
            this.field1978 = this.field1964[arg1] == null;
            this.field1964[arg1] = class105.field2339;
            return this.field1959[arg1];
        } else if (this.field1955 == 1) {
            this.field1978 = this.field1971 != arg1;
            this.field1971 = arg1;
            return this.field1959[0];
        } else {
            class152 var3 = this.field1964[arg1];
            if (this.field1978 = var3 == null) {
                if (this.field1955 <= this.field1952) {
                    class152 var4 = (class152) this.field1963.method1241((byte) -125);
                    var3 = new class152(arg1, var4.field3157);
                    this.field1964[var4.field3143] = null;
                    var4.method799(-24265);
                } else {
                    var3 = new class152(arg1, this.field1952);
                    this.field1952++;
                }
                this.field1964[arg1] = var3;
            }
            this.field1963.method1239((byte) 118, var3);
            return this.field1959[var3.field3157];
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(III)V")
    public class88(int arg0, int arg1, int arg2) {
        this.field1955 = arg0;
        this.field1959 = new int[arg0][3][arg2];
        this.field1956 = arg1;
        this.field1964 = new class152[arg1];
    }
}
