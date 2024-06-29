import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class111 {

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    private int field2089 = 0;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    private int field2096 = 0;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    private int field2095 = 128;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    private int field2088 = 128;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    private int field2104 = 0;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public int field2093 = -1;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "Z")
    public boolean field2099 = false;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "[Lnk;")
    public static class2[] field2098 = new class2[32768];

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "Lhh;")
    private static class163 field2092 = class137.method1065("Prepared sound engine", 17);

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public static int field2106 = 0;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "Lhh;")
    public static class163 field2109 = field2092;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public int field2090;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    private int field2108;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "[I")
    public static int[] field2097;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "[S")
    private short[] field2091;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "[S")
    private short[] field2105;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "[S")
    private short[] field2107;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "[S")
    private short[] field2110;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
    public static void method884(byte arg0) {
        field2098 = null;
        field2092 = null;
        field2109 = null;
        field2097 = null;
        int var1 = 106 % ((arg0 + 25) / 36);
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
    public static final void method885(byte arg0) {
        class4.field74.method120((byte) -118);
        if (arg0 > 79) {
            field2094++;
            class210.field3813.method120((byte) -101);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILpg;I)V")
    private final void method886(int arg0, class81 arg1, int arg2) {
        int var4 = 81 / ((-arg0 - 14) / 45);
        field2101++;
        if (arg2 == 1) {
            this.field2108 = arg1.method658(-105);
        } else if (arg2 == 2) {
            this.field2093 = arg1.method658(76);
        } else if (arg2 == 4) {
            this.field2095 = arg1.method658(-96);
        } else if (arg2 == 5) {
            this.field2088 = arg1.method658(-109);
        } else if (arg2 == 6) {
            this.field2104 = arg1.method658(106);
        } else if (arg2 == 7) {
            this.field2096 = arg1.method622(true);
        } else if (arg2 == 8) {
            this.field2089 = arg1.method622(true);
        } else if (arg2 == 9) {
            this.field2099 = true;
        } else if (arg2 == 40) {
            int var7 = arg1.method622(true);
            this.field2110 = new short[var7];
            this.field2107 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2107[var8] = (short) arg1.method658(120);
                this.field2110[var8] = (short) arg1.method658(84);
            }
        } else if (arg2 == 41) {
            int var5 = arg1.method622(true);
            this.field2105 = new short[var5];
            this.field2091 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2105[var6] = (short) arg1.method658(-113);
                this.field2091[var6] = (short) arg1.method658(73);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lpg;I)V")
    public final void method887(class81 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method622(true);
            if (var3 == 0) {
                field2102++;
                if (arg1 != 0) {
                    method884((byte) 85);
                    return;
                }
                return;
            }
            this.method886(63, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)Lra;")
    public final class70 method888(int arg0, int arg1) {
        field2100++;
        class70 var3 = (class70) class32.field493.method114((long) this.field2090, 0);
        if (var3 == null) {
            class41 var4 = class41.method286(class217.field3957, this.field2108, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field2107 != null) {
                for (int var5 = 0; var5 < this.field2107.length; var5++) {
                    var4.method293(this.field2107[var5], this.field2110[var5]);
                }
            }
            if (this.field2105 != null) {
                for (int var6 = 0; var6 < this.field2105.length; var6++) {
                    var4.method285(this.field2105[var6], this.field2091[var6]);
                }
            }
            var3 = var4.method289(this.field2096 + 64, this.field2089 + 850, -30, -50, -30);
            class32.field493.method117(var3, false, (long) this.field2090);
        }
        class70 var7;
        if (this.field2093 == -1 || arg1 == -1) {
            var7 = var3.method514(true, true);
        } else {
            var7 = class212.method1511(this.field2093, arg0 ^ 0x6884).method127(var3, (byte) -96, arg1);
        }
        if (this.field2095 != 128 || this.field2088 != 128) {
            var7.method503(this.field2095, this.field2088, this.field2095);
        }
        if (this.field2104 != 0) {
            if (this.field2104 == 90) {
                var7.method515();
            }
            if (this.field2104 == 180) {
                var7.method498();
            }
            if (this.field2104 == 270) {
                var7.method512();
            }
        }
        if (arg0 != -26757) {
            this.field2095 = -28;
        }
        return var7;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BIII)I")
    public static final int method889(byte arg0, int arg1, int arg2, int arg3) {
        field2103++;
        int var4 = arg1 / arg2;
        int var5 = arg3 / arg2;
        int var6 = arg2 - 1 & arg1;
        int var7 = class210.method1506(var4, var5, 106);
        if (arg0 != 9) {
            return -70;
        }
        int var8 = class210.method1506(var4 + 1, var5, arg0 ^ 0x36);
        int var9 = arg2 - 1 & arg3;
        int var10 = class210.method1506(var4, var5 + 1, 108);
        int var11 = class210.method1506(var4 + 1, var5 - -1, 50);
        int var12 = class43.method323(var7, var6, arg2, var8, (byte) -7);
        int var13 = class43.method323(var10, var6, arg2, var11, (byte) -7);
        return class43.method323(var12, var9, arg2, var13, (byte) -7);
    }
}
