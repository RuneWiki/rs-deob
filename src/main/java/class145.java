import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class145 extends class8 {

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "I")
    private int field2324 = 1;

    @OriginalMember(owner = "client!kj", name = "M", descriptor = "I")
    private int field2326 = 204;

    @OriginalMember(owner = "client!kj", name = "W", descriptor = "I")
    private int field2335 = 1;

    @OriginalMember(owner = "client!kj", name = "R", descriptor = "I")
    public static int field2330 = -2;

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!kj", name = "N", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!kj", name = "Q", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!kj", name = "S", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!kj", name = "U", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!kj", name = "V", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!kj", name = "X", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!kj", name = "Y", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "Lqh;")
    public static class201 field2328;

    @OriginalMember(owner = "client!kj", name = "T", descriptor = "[[B")
    public static byte[][] field2332;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(II)V")
    public static final void method991(int arg0, int arg1) {
        ++field2334;
        class259 var2 = class213.method1464((byte) -92, arg0, 5);
        var2.method1772((byte) 117);
        if (arg1 < 38) {
            field2328 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field2333;
        int[] var3 = super.field110.method1585(arg0 + -3, arg1);
        if (super.field110.field3734) {
            for (int var4 = 0; class231.field3798 > var4; ++var4) {
                int var5 = class176.field2776[var4];
                int var6 = class182.field2864[arg1];
                int var7 = this.field2335 * var5 >> 12;
                int var8 = var5 % (4096 / this.field2335) * this.field2335;
                int var9 = this.field2324 * var6 >> 12;
                int var10 = var6 % (4096 / this.field2324) * this.field2324;
                if (~var10 > ~this.field2326) {
                    for (var7 -= var9; ~var7 > -1; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var8 > ~this.field2326) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field2326 < ~var8) {
                    int var11;
                    for (var11 = var7 - var9; ~var11 > -1; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        if (arg0 != 3) {
            field2330 = 95;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([Lf;II)V")
    public static final void method992(class36[] arg0, int arg1, int arg2) {
        ++field2336;
        for (int var3 = 0; ~arg0.length < ~var3; ++var3) {
            class36 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field709 == 0) {
                    if (var4.field658 != null) {
                        method992(var4.field658, 112, arg2);
                    }
                    class258 var5 = (class258) class128.field2062.method1400((long) var4.field648, true);
                    if (var5 != null) {
                        class241.method1665(arg2, var5.field4100, 0);
                    }
                }
                if (~arg2 == -1 && var4.field620 != null) {
                    class213 var6 = new class213();
                    var6.field3480 = var4;
                    var6.field3477 = var4.field620;
                    class89.method645(-113, var6);
                }
                if (~arg2 == -2 && var4.field688 != null) {
                    if (var4.field661 >= 0) {
                        class36 var7 = class64.method455(var4.field648, 592427152);
                        if (var7 == null || var7.field658 == null || ~var4.field661 <= ~var7.field658.length || var7.field658[var4.field661] != var4) {
                            continue;
                        }
                    }
                    class213 var8 = new class213();
                    var8.field3480 = var4;
                    var8.field3477 = var4.field688;
                    class89.method645(-123, var8);
                }
            }
        }
        if (arg1 <= 93) {
            field2330 = 14;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field2326 = arg1.method1521((byte) 113);
                }
            } else {
                this.field2324 = arg1.method1517((byte) -96);
            }
        } else {
            this.field2335 = arg1.method1517((byte) -96);
        }
        if (arg0 > 62) {
            ++field2329;
        }
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "(I)V")
    public static final void method993(int arg0) {
        ++field2327;
        class95.method709(false);
        class158.method1105((byte) 106);
        class76.method536(0);
        class109.method798((byte) -92);
        class224.method1576(1000);
        class204.method1406(0);
        class123.method889((byte) 22);
        class98.method721(false);
        class30.method257(118);
        class226.method1587(3);
        class146.method998(false);
        class27.method239(500);
        class245.method1687(9308);
        class287.method1925((byte) 43);
        int var1 = -15 / ((-60 - arg0) / 54);
        class107.method782(0);
        class137.method963((byte) 74);
        if (class117.field1934 != 0) {
            for (int var2 = 0; var2 < class71.field1161.length; ++var2) {
                class71.field1161[var2] = null;
            }
            class126.field2037 = 0;
        }
        class255.method1733(-121);
        class222.method1566(119);
        class40.field747.method472((byte) -63);
        ((class273) class69.field1140).method1839(true);
        class120.field1957.method1827((byte) 115);
        class280.field4435.method1369((byte) -85);
        class210.field3433.method1369((byte) -89);
        class115.field1921.method1369((byte) -91);
        class44.field806.method1369((byte) 96);
        class122.field1982.method1369((byte) 125);
        class168.field2665.method1369((byte) -47);
        class95.field1556.method1369((byte) 82);
        class222.field3687.method1369((byte) 127);
        class230.field3792.method1369((byte) 82);
        class203.field3251.method1369((byte) 78);
        class207.field3383.method1369((byte) 99);
        class70.field1158.method472((byte) -63);
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
    public class145() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "(I)V")
    public static void method994(int arg0) {
        field2328 = null;
        field2332 = null;
        if (arg0 != 0) {
            method993(-48);
        }
    }
}
