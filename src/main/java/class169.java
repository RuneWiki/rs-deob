import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class169 extends class7 {

    @OriginalMember(owner = "client!r", name = "fb", descriptor = "I")
    private int field3258 = -1;

    @OriginalMember(owner = "client!r", name = "eb", descriptor = "I")
    public static int field3257 = 0;

    @OriginalMember(owner = "client!r", name = "ib", descriptor = "I")
    public static int field3261 = -1;

    @OriginalMember(owner = "client!r", name = "S", descriptor = "I")
    public int field3245;

    @OriginalMember(owner = "client!r", name = "T", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!r", name = "U", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!r", name = "V", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!r", name = "W", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!r", name = "Y", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!r", name = "ab", descriptor = "I")
    public int field3253;

    @OriginalMember(owner = "client!r", name = "bb", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!r", name = "cb", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!r", name = "db", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!r", name = "gb", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!r", name = "hb", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!r", name = "X", descriptor = "J")
    public static long field3250;

    @OriginalMember(owner = "client!r", name = "R", descriptor = "[I")
    public static int[] field3244;

    @OriginalMember(owner = "client!r", name = "Z", descriptor = "[I")
    public int[] field3252;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
    public final void method50(boolean arg0) {
        ++field3249;
        super.method50(arg0);
        this.field3252 = null;
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(I)I")
    public final int method45(int arg0) {
        ++field3254;
        return arg0 != -24089 ? 77 : this.field3258;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IB)[[I")
    public int[][] method51(int arg0, byte arg1) {
        int var3 = 121 / ((-42 - arg1) / 41);
        ++field3259;
        int[][] var4 = super.field97.method1396(arg0, (byte) 45);
        if (super.field97.field4093 && this.method1159(26239)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int var7 = (class60.field1174 != this.field3253 ? this.field3253 * arg0 / class60.field1174 : arg0) * this.field3245;
            int[] var8 = var4[2];
            if (~class117.field2272 != ~this.field3245) {
                for (int var9 = 0; class117.field2272 > var9; ++var9) {
                    int var10 = this.field3245 * var9 / class117.field2272;
                    int var11 = this.field3252[var7 - -var10];
                    var8[var9] = class15.method94(var11, 255) << 4;
                    var6[var9] = class15.method94(var11 >> 4, 4080);
                    var5[var9] = class15.method94(4080, var11 >> 12);
                }
            } else {
                for (int var12 = 0; ~var12 > ~class117.field2272; ++var12) {
                    int var13 = this.field3252[var7++];
                    var8[var12] = class15.method94(var13, 255) << 4;
                    var6[var12] = class15.method94(var13 >> 4, 4080);
                    var5[var12] = class15.method94(16711680, var13) >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        if (arg0 == 0) {
            this.field3258 = arg2.method1007(86);
        }
        ++field3247;
        int var4 = 104 % ((66 - arg1) / 57);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILpe;I)Lkc;")
    private static final class102 method1156(int arg0, class154 arg1, int arg2) {
        if (arg2 <= 26) {
            field3257 = -126;
        }
        ++field3248;
        return !class12.method76((byte) 98, arg1, arg0) ? null : class206.method1362((byte) -118);
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
    public class169() {
        super(0, false);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IJ)V")
    public static final void method1157(int arg0, long arg1) {
        ++field3246;
        if (~arg1 != -1L) {
            if (class96.field1912 >= 100) {
                class131.method836(0, (byte) -112, class111.field2128, client.field604);
            } else {
                class141 var3 = class206.method1361(arg1, 0).method898(117);
                for (int var4 = arg0; ~var4 > ~class96.field1912; ++var4) {
                    if (class154.field2999[var4] == arg1) {
                        class131.method836(0, (byte) -96, class111.field2128, class220.method1422(new class141[] { var3, class70.field1424 }, -3));
                        return;
                    }
                }
                for (int var5 = 0; var5 < class88.field1750; ++var5) {
                    if (class131.field2499[var5] == arg1) {
                        class131.method836(0, (byte) -104, class111.field2128, class220.method1422(new class141[] { class191.field3687, var3, class108.field2091 }, arg0 + -3));
                        return;
                    }
                }
                if (var3.method922((byte) 28, class114.field2176.field773)) {
                    class131.method836(0, (byte) -107, class111.field2128, class4.field43);
                } else {
                    ++class66.field1269;
                    class154.field2999[class96.field1912] = arg1;
                    class166.field3217[class96.field1912++] = class206.method1361(arg1, 0);
                    class1.field11 = class174.field3461;
                    class7.field120.method32(10, 12885);
                    class7.field120.method978(-111, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
    public static void method1158(byte arg0) {
        field3244 = null;
        if (arg0 != 106) {
            field3257 = 21;
        }
    }

    @OriginalMember(owner = "client!r", name = "i", descriptor = "(I)Z")
    public final boolean method1159(int arg0) {
        ++field3260;
        if (this.field3252 != null) {
            return true;
        } else if (arg0 != 26239) {
            return true;
        } else if (~this.field3258 <= -1) {
            class102 var2 = method1156(this.field3258, class108.field2093, 91);
            var2.method679();
            this.field3253 = var2.field1981;
            this.field3245 = var2.field1985;
            this.field3252 = var2.field1983;
            return true;
        } else {
            return false;
        }
    }
}
