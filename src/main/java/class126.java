import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class126 extends class279 {

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "[I")
    private final int[] field2098 = new int[this.field4667];

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "Lbe;")
    public static class283 field2089 = class153.method941(125, "Benutzen");

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "Lbe;")
    public static class283 field2086 = class153.method941(127, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "[I")
    public static int[] field2082 = new int[4096];

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "I")
    public static int field2094 = 0;

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "Lbe;")
    public static class283 field2090 = class153.method941(6, " weitere Optionen");

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
    private int field2085;

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
    private int field2097;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "Lnh;")
    public static class107 field2093;

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "Lue;")
    public static class14 field2101;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "[B")
    private byte[] field2079;

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "[Lqb;")
    public static class95[] field2091;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "[Z")
    public static boolean[] field2080;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(Z)V", line = 6)
    public final void method786(boolean arg0) {
        this.field2097 = Math.abs(this.field2097);
        field2083++;
        if (this.field2097 >= 4096) {
            this.field2097 = 4095;
        }
        if (!arg0) {
            this.method261(this.field2085++, (byte) (this.field2097 >> 4));
            this.field2097 = 0;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)V", line = 24)
    public void method261(int arg0, byte arg1) {
        this.field2079[this.field2085++] = (byte) (class178.method1174(arg1 >> 1, 127) + 127);
        field2088++;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(Z)V", line = 36)
    public static void method787(boolean arg0) {
        field2089 = null;
        field2080 = null;
        if (!arg0) {
            return;
        }
        field2086 = null;
        field2093 = null;
        field2082 = null;
        field2090 = null;
        field2101 = null;
        field2091 = null;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(IIIIIF)V", line = 52)
    public class126(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field4667; var7++) {
            this.field2098[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V", line = 73)
    public final void method788(byte arg0) {
        if (arg0 != 60) {
            field2090 = (class283) null;
        }
        this.field2085 = 0;
        field2087++;
        this.field2097 = 0;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lkg;III)V", line = 85)
    public static final void method789(class69 arg0, int arg1, int arg2, int arg3) {
        field2095++;
        if (class166.field2772 != 0 && class166.field2772 != 3 || !arg0.method442((byte) -122)) {
            return;
        }
        int var4 = arg0.field1009[arg1];
        if (var4 > arg3 || arg3 > (arg0.field1080[arg1] + var4)) {
            return;
        }
        int var5 = arg1 - arg0.field1085 / 2;
        int var6 = arg3 - arg0.field1069 / 2;
        if (arg2 <= 27) {
            field2086 = (class283) null;
        }
        int var7 = class88.field1497 + class203.field3477 & 0x7FF;
        int var8 = class139.field2309[var7];
        int var9 = class139.field2316[var7];
        int var10 = (class24.field358 + 256) * var8 >> 8;
        int var11 = (class24.field358 + 256) * var9 >> 8;
        int var12 = var5 * var10 + (var6 * var11) >> 11;
        int var13 = class213.field3624.field1193 + var12 >> 7;
        int var14 = var5 * var11 - (var6 * var10) >> 11;
        int var15 = class213.field3624.field1210 - var14 >> 7;
        if (class299.field5067 > 0 && class246.field4178[82] && class246.field4178[81]) {
            class166.method1021(1998761094, class61.field850, class107.field1833 + var15, class214.field3637 + var13);
            return;
        }
        boolean var16 = class53.method335(class213.field3624.field1150[0], 0, 0, 1, class213.field3624.field1178[0], var15, var13, 0, true, 0, 1, 0);
        if (!var16) {
            return;
        }
        class228.field3831.method1499(true, var6);
        class228.field3831.method1499(true, var5);
        class228.field3831.method1510((byte) 66, class203.field3477);
        class228.field3831.method1499(true, 57);
        class228.field3831.method1499(true, class88.field1497);
        class228.field3831.method1499(true, class24.field358);
        class228.field3831.method1499(true, 89);
        class228.field3831.method1510((byte) 40, class213.field3624.field1193);
        class228.field3831.method1510((byte) 97, class213.field3624.field1210);
        class228.field3831.method1499(true, class216.field3658);
        class228.field3831.method1499(true, 63);
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)I", line = 169)
    public static final int method790(int arg0, int arg1) {
        if (arg0 >= -89) {
            method787(false);
        }
        field2081++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIZ)V", line = 188)
    public static final void method791(int arg0, int arg1, boolean arg2) {
        class72.field1264 = class197.field3370[arg0][arg1].field2427;
        field2099++;
        if (arg2) {
            method790(84, 92);
        }
        class86.field1444 = class197.field3370[arg0][arg1].field2430;
        class284.field4855 = class197.field3370[arg0][arg1].field2433;
        class59.method386((float) class72.field1264, (float) class86.field1444, (float) class284.field4855);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)V", line = 212)
    public final void method792(int arg0, int arg1, int arg2) {
        field2096++;
        int var4 = -103 % ((arg1 + 54) / 56);
        this.field2097 += this.field2098[arg0] * arg2 >> 12;
    }
}
