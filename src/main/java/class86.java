import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class86 extends class197 {

    @OriginalMember(owner = "client!li", name = "M", descriptor = "Loh;")
    private static class258 field1451 = class153.method1046("Select", 97);

    @OriginalMember(owner = "client!li", name = "R", descriptor = "I")
    public static int field1456 = -1;

    @OriginalMember(owner = "client!li", name = "N", descriptor = "[I")
    public static int[] field1452 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!li", name = "X", descriptor = "Loh;")
    public static class258 field1462 = field1451;

    @OriginalMember(owner = "client!li", name = "S", descriptor = "Loh;")
    public static class258 field1457 = class153.method1046("Zugewiesener Speicher)3", 92);

    @OriginalMember(owner = "client!li", name = "fb", descriptor = "Loh;")
    public static class258 field1470 = class153.method1046("::serverjs5drop", 85);

    @OriginalMember(owner = "client!li", name = "db", descriptor = "I")
    public static int field1468 = 0;

    @OriginalMember(owner = "client!li", name = "O", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!li", name = "P", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!li", name = "Q", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!li", name = "T", descriptor = "I")
    private int field1458;

    @OriginalMember(owner = "client!li", name = "U", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!li", name = "V", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!li", name = "W", descriptor = "I")
    private int field1461;

    @OriginalMember(owner = "client!li", name = "Y", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!li", name = "Z", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!li", name = "ab", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!li", name = "bb", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!li", name = "cb", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!li", name = "eb", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!li", name = "gb", descriptor = "I")
    private int field1471;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(IB)Loh;", line = 14)
    public static final class258 method616(int arg0, byte arg1) {
        field1454++;
        if (arg0 < 100000) {
            return class100.method755(arg1 ^ 0x51, new class258[] { class303.field5171, class218.method1481(54, arg0), class244.field4229 });
        } else if (arg1 == -85) {
            return arg0 < 10000000 ? class100.method755(-6, new class258[] { class140.field2380, class218.method1481(75, arg0 / 1000), class214.field3719, class244.field4229 }) : class100.method755(-6, new class258[] { class299.field5117, class218.method1481(-55, arg0 / 1000000), class6.field88, class244.field4229 });
        } else {
            return (class258) null;
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(I)V", line = 36)
    private class86(int arg0) {
        super(0, false);
        this.method622(true, arg0);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lgb;BLgb;)V", line = 49)
    public static final void method617(class213 arg0, byte arg1, class213 arg2) {
        field1467++;
        class79.field1355 = class128.method923(arg0, 1, 0, class124.field2191, arg2);
        if (arg1 >= -122) {
            field1468 = 87;
        }
        if (class257.field4390) {
            class263.field4577 = class83.method602(0, (byte) 122, class124.field2191, arg2, arg0);
        } else {
            class263.field4577 = (class216) class79.field1355;
        }
        class44.field662 = class128.method923(arg0, 1, 0, class225.field3862, arg2);
        class123.field2180 = class128.method923(arg0, 1, 0, class232.field4025, arg2);
    }

    @OriginalMember(owner = "client!li", name = "g", descriptor = "(B)I", line = 67)
    public static final int method618(byte arg0) {
        if (arg0 != 71) {
            field1457 = (class258) null;
        }
        field1459++;
        return ((class186.field3307 == 0 ? 0 : 1) << 20) + ((class197.field3463 ? 1 : 0) << 19) + (class58.field917 & 0x3 << 17) + ((class57.field896 ? 1 : 0) << 16) + ((class20.field239 ? 1 : 0) << 15) + ((class4.field62 ? 1 : 0) << 13) + ((class90.field1587 ? 1 : 0) << 10) + ((class50.field743 ? 1 : 0) << 9) + ((class173.field3101 ? 1 : 0) << 6) + ((class45.field672 ? 1 : 0) << 4) + ((class151.field2557 & 0x7) - (-((class108.field1918 ? 1 : 0) << 3) + -((class119.field2110 ? 1 : 0) << 5))) + (((class146.field2477 ? 1 : 0) << 7) - -((class271.field4697 ? 1 : 0) << 8) - (-(class250.field4312 & 0x3 << 11) + (-((class244.field4233 == 0 ? 0 : 1) << 21) - ((class317.field5345 == 0 ? 0 : 1) << 22))));
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V", line = 86)
    public class86() {
        this(0);
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V", line = 99)
    public static final void method619(int arg0) {
        if (arg0 != -29436) {
            method618((byte) -1);
        }
        field1463++;
        for (class179 var1 = (class179) class169.field2857.method83(-54); var1 != null; var1 = (class179) class169.field2857.method87((byte) -80)) {
            if (var1.field3205 > 0) {
                var1.field3205--;
            }
            if (var1.field3205 != 0) {
                if (var1.field3193 > 0) {
                    var1.field3193--;
                }
                if (var1.field3193 == 0 && var1.field3208 >= 1 && var1.field3207 >= 1 && var1.field3208 <= 102 && var1.field3207 <= 102 && (var1.field3199 < 0 || class178.method1224(var1.field3204, var1.field3199, (byte) 123))) {
                    class258.method1780(var1.field3198, var1.field3197, var1.field3208, true, var1.field3202, var1.field3204, var1.field3207, var1.field3199);
                    var1.field3193 = -1;
                    if (var1.field3203 == var1.field3199 && var1.field3203 == -1) {
                        var1.method1054((byte) 89);
                    } else if (var1.field3203 == var1.field3199 && var1.field3206 == var1.field3197 && var1.field3204 == var1.field3196) {
                        var1.method1054((byte) 94);
                    }
                }
            } else if (var1.field3203 < 0 || class178.method1224(var1.field3196, var1.field3203, (byte) 110)) {
                class258.method1780(var1.field3198, var1.field3206, var1.field3208, true, var1.field3202, var1.field3196, var1.field3207, var1.field3203);
                var1.method1054((byte) 112);
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILva;I)V", line = 159)
    public final void method98(int arg0, class235 arg1, int arg2) {
        if (arg2 == 0) {
            this.method622(true, arg1.method1602(18160));
        }
        if (arg0 != 7955) {
            field1456 = -58;
        }
        field1466++;
    }

    @OriginalMember(owner = "client!li", name = "h", descriptor = "(B)V", line = 183)
    public static void method620(byte arg0) {
        field1451 = null;
        if (arg0 <= -78) {
            field1452 = null;
            field1462 = null;
            field1457 = null;
            field1470 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(II)[B", line = 210)
    public static final byte[] method621(int arg0, int arg1) {
        field1464++;
        class57 var2 = (class57) class256.field4383.method701((long) arg0, 1);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class285.method1996(1, var4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class57(var3);
            class256.field4383.method698((long) arg0, (byte) 86, var2);
        }
        if (arg1 < 63) {
            field1457 = (class258) null;
        }
        return var2.field905;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)[[I", line = 260)
    public final int[][] method101(int arg0, byte arg1) {
        int[][] var3 = this.field3461.method1936(arg0, 17174);
        if (this.field3461.field4765) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class190.field3362; var7++) {
                var5[var7] = this.field1461;
                var4[var7] = this.field1458;
                var6[var7] = this.field1471;
            }
        }
        field1469++;
        int var8 = -25 % ((1 - arg1) / 37);
        return var3;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZI)V", line = 304)
    private final void method622(boolean arg0, int arg1) {
        this.field1461 = arg1 >> 12 & 0xFF0;
        this.field1458 = arg1 >> 4 & 0xFF0;
        field1453++;
        this.field1471 = (arg1 & 0xFF) << 4;
        if (!arg0) {
            method617((class213) null, (byte) 64, (class213) null);
        }
    }
}
