import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class109 extends class83 {

    @OriginalMember(owner = "client!hj", name = "H", descriptor = "I")
    public int field1975 = 0;

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "[Lvj;")
    public class173[] field1961 = new class173[5];

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "[I")
    public int[] field1979 = new int[5];

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "I")
    public int field1970;

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "I")
    public int field1973;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
    public int field1959;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "I")
    public int field1958;

    @OriginalMember(owner = "client!hj", name = "G", descriptor = "[[I")
    public static int[][] field1974 = new int[5][5000];

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "Ljava/lang/String;")
    public static String field1981 = "Loading textures - ";

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "I")
    public int field1962;

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "I")
    public int field1966;

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "I")
    public int field1967;

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "I")
    public int field1968;

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "I")
    public int field1969;

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "Lhj;")
    public class109 field1980;

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "Llg;")
    public class11 field1978;

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "Lfb;")
    public class20 field1982;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "Lmk;")
    public class212 field1957;

    @OriginalMember(owner = "client!hj", name = "D", descriptor = "Lqi;")
    public class216 field1971;

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "Lfa;")
    public class223 field1976;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "Lsl;")
    public class251 field1956;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "Z")
    public boolean field1955;

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "Z")
    public boolean field1963;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "Z")
    public boolean field1964;

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(III)V")
    public class109(int arg0, int arg1, int arg2) {
        this.field1970 = arg1;
        this.field1959 = this.field1973 = arg0;
        this.field1958 = arg2;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V")
    public static void method761(byte arg0) {
        field1974 = null;
        int var1 = -12 / ((14 - arg0) / 61);
        field1981 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILvh;Lvh;Lvh;Lvh;)V")
    public static final void method762(int arg0, class108 arg1, class108 arg2, class108 arg3, class108 arg4) {
        int var5 = -33 / ((-arg0 - 2) / 45);
        class84.field1518 = arg3;
        field1972++;
        class146.field2492 = arg1;
        class166.field2720 = arg2;
        class62.field1077 = arg4;
        class115.field2068 = new class46[class84.field1518.method757(-1)][];
        class63.field1095 = new boolean[class84.field1518.method757(-1)];
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IB)V")
    public static final void method763(int arg0, byte arg1) {
        if (arg1 < -104) {
            class24.field382.method63(0, arg0);
            field1977++;
            class247.field4056.method63(0, arg0);
            class229.field3855.method63(0, arg0);
        }
    }
}
