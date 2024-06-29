import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class124 extends class200 {

    @OriginalMember(owner = "client!gf", name = "S", descriptor = "Lve;")
    public static class189 field2182 = new class189(50);

    @OriginalMember(owner = "client!gf", name = "Z", descriptor = "Lve;")
    public static class189 field2189 = new class189(64);

    @OriginalMember(owner = "client!gf", name = "bb", descriptor = "Lid;")
    public static class149 field2191 = class60.method382("zap", (byte) 8);

    @OriginalMember(owner = "client!gf", name = "eb", descriptor = "I")
    public static int field2194 = 0;

    @OriginalMember(owner = "client!gf", name = "N", descriptor = "I")
    private int field2177;

    @OriginalMember(owner = "client!gf", name = "O", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!gf", name = "P", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!gf", name = "Q", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!gf", name = "R", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!gf", name = "T", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!gf", name = "U", descriptor = "I")
    private int field2184;

    @OriginalMember(owner = "client!gf", name = "V", descriptor = "I")
    private int field2185;

    @OriginalMember(owner = "client!gf", name = "W", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!gf", name = "X", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!gf", name = "Y", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!gf", name = "db", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!gf", name = "ab", descriptor = "Lal;")
    public static class230 field2190;

    @OriginalMember(owner = "client!gf", name = "cb", descriptor = "[Lvc;")
    public static class190[] field2192;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "(I)V")
    public static final void method871(int arg0) {
        if (class270.field4860 == null || class106.field1832 == null) {
            class270.field4860 = new int[256];
            class106.field1832 = new int[256];
            for (int var1 = 0; var1 < 256; ++var1) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class270.field4860[var1] = (int) (Math.sin(var2) * 4096.0D);
                class106.field1832[var1] = (int) (4096.0D * Math.cos(var2));
            }
        }
        ++field2179;
        if (arg0 > -77) {
            field2189 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "(I)V")
    public static final void method872(int arg0) {
        class96.method696(arg0 ^ 4801);
        class11.method63(true);
        class70.method440(-66);
        ++field2181;
        class80.method601(1);
        class5.method27(-15068);
        class36.method213(true);
        class111.method785((byte) -75);
        class226.method1520(8);
        class154.method1092(arg0);
        class182.method1263(arg0 + 2);
        class104.method738((byte) -3);
        class62.method391((byte) 121);
        class159.method1147((byte) 124);
        class9.method52(arg0);
        class143.method992((byte) -115);
        class73.method473(-81);
        class261.method1811(-1);
        class133.method930(1);
        class271.field4879.method1290((byte) 110);
        class249.field4372.method1290((byte) 118);
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(II)Lid;")
    public static final class149 method873(int arg0, int arg1) {
        if (arg1 <= 97) {
            return null;
        } else {
            ++field2178;
            class149 var2 = class211.method1434(arg0, true);
            for (int var3 = -3 + var2.method1053((byte) -127); ~var3 < -1; var3 -= 3) {
                var2 = class237.method1603(new class149[] { var2.method1024(0, -5975, var3), class18.field271, var2.method1025((byte) 34, var3) }, -111);
            }
            if (var2.method1053((byte) -126) > 9) {
                return class237.method1603(new class149[] { class267.field4762, var2.method1024(0, -5975, var2.method1053((byte) 119) - 8), class227.field3985, class224.field3936, var2, class231.field4074 }, -99);
            } else {
                return ~var2.method1053((byte) -116) < -7 ? class237.method1603(new class149[] { class96.field1702, var2.method1024(0, -5975, -4 + var2.method1053((byte) 21)), class106.field1838, class224.field3936, var2, class231.field4074 }, -117) : class237.method1603(new class149[] { class169.field3131, var2, class227.field3981 }, -124);
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        ++field2187;
        if (arg2 == 0) {
            this.method875(arg0.method525(65280), 111);
        }
        if (!arg1) {
            method871(20);
        }
    }

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "(B)V")
    public static final void method874(byte arg0) {
        if (!class32.field481) {
            class284.field5032[0] = 1002;
            class60.field1092 = 1;
            class224.field3941[0] = class169.field3134;
            if (class100.field1771 != 0) {
                class189.field3383 = class276.field4937;
                class2.field32 = class214.field3797;
            } else if (~class80.field1487 == -1) {
                class2.field32 = class285.field5068;
                class189.field3383 = class49.field883;
            } else {
                class2.field32 = class159.field2921;
                class189.field3383 = class260.field4582;
            }
            class138.field2517[0] = class133.field2413;
            class78.field1456[0] = class171.field3158;
        }
        if (arg0 < 83) {
            method876((byte) 74);
        }
        ++field2180;
        if (~class11.field161 != 0) {
            class276.method1907(4, class11.field161);
        }
        for (int var1 = 0; ~var1 > ~class259.field4538; ++var1) {
            if (class94.field1664[var1]) {
                class216.field3819[var1] = true;
            }
            class16.field230[var1] = class94.field1664[var1];
            class94.field1664[var1] = false;
        }
        class35.field516 = class118.field2022;
        class268.field4815 = -1;
        class128.field2257 = null;
        class80.field1486 = -1;
        class177.field3236 = null;
        if (class11.field161 != -1) {
            class259.field4538 = 0;
            class83.method618(1);
        }
        class72.method455();
        class5.method28(-62);
        if (!class32.field481) {
            if (class128.field2257 == null) {
                if (~class80.field1486 != 0) {
                    class255.method1755(class80.field1486, (class47) null, class268.field4815, (byte) 112);
                }
            } else {
                class255.method1755(class122.field2155, class128.field2257, class288.field5144, (byte) 116);
            }
        } else if (!class23.field324) {
            class80.method606((byte) -2);
        } else {
            class193.method1312((byte) -18);
        }
        int var2 = class32.field481 ? -1 : class163.method1195(-2);
        if (~var2 == 0) {
            var2 = class9.field124;
        }
        class248.method1724(var2, true);
        if (~class286.field5076 == -2) {
            class286.field5076 = 2;
        }
        if (class191.field3421 == 1) {
            class191.field3421 = 2;
        }
        if (~class287.field5119 == -4) {
            for (int var3 = 0; class259.field4538 > var3; ++var3) {
                if (class16.field230[var3]) {
                    class72.method462(class54.field979[var3], class41.field645[var3], class157.field2887[var3], class259.field4548[var3], 16711935, 128);
                } else if (class216.field3819[var3]) {
                    class72.method462(class54.field979[var3], class41.field645[var3], class157.field2887[var3], class259.field4548[var3], 16711680, 128);
                }
            }
        }
        class52.method343((byte) 101, class277.field4948, class149.field2683, class77.field1449.field2347, class77.field1449.field2340);
        class149.field2683 = 0;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(I)V")
    private class124(int arg0) {
        super(0, false);
        this.method875(arg0, 94);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method24(boolean arg0, int arg1) {
        if (!arg0) {
            method876((byte) -113);
        }
        int[][] var3 = super.field3632.method965(arg1, 50);
        ++field2188;
        if (super.field3632.field2550) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class137.field2515; ++var7) {
                var5[var7] = this.field2185;
                var4[var7] = this.field2177;
                var6[var7] = this.field2184;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(II)V")
    private final void method875(int arg0, int arg1) {
        this.field2177 = (65280 & arg0) >> 4;
        if (arg1 < 85) {
            method876((byte) -1);
        }
        ++field2183;
        this.field2184 = 4080 & arg0 << 4;
        this.field2185 = 4080 & arg0 >> 12;
    }

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "(B)V")
    public static void method876(byte arg0) {
        if (arg0 > -91) {
            method874((byte) -110);
        }
        field2189 = null;
        field2191 = null;
        field2182 = null;
        field2192 = null;
        field2190 = null;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
    public class124() {
        this(0);
    }
}
