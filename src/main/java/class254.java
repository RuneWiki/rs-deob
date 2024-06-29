import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public abstract class class254 extends class29 {

    @OriginalMember(owner = "client!uh", name = "A", descriptor = "Lvm;")
    public static class202 field4238 = new class202(64);

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "I")
    public static int field4239 = 3353893;

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "Lja;")
    public static class143 field4240 = new class143(64);

    @OriginalMember(owner = "client!uh", name = "I", descriptor = "Lph;")
    private static class229 field4246 = class266.method1858("green:", 0);

    @OriginalMember(owner = "client!uh", name = "H", descriptor = "Lph;")
    public static class229 field4245 = field4246;

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "Lph;")
    private static class229 field4248 = class266.method1858("Checking for updates )2 ", 0);

    @OriginalMember(owner = "client!uh", name = "G", descriptor = "Lph;")
    public static class229 field4244 = field4248;

    @OriginalMember(owner = "client!uh", name = "F", descriptor = "Lph;")
    public static class229 field4243 = field4246;

    @OriginalMember(owner = "client!uh", name = "D", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!uh", name = "E", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!uh", name = "L", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "Lri;")
    public static class301 field4247;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "(I)V", line = 13)
    public static final void method1773(int arg0) {
        int var1 = -76 / ((-arg0 - 3) / 39);
        class224.field3685.method437(-48);
        class170.field2802 = 1;
        field4241++;
        class133.field2154 = null;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V", line = 30)
    public static final void method1774(byte arg0) {
        class239.method1685(-31, false);
        field4242++;
        boolean var1 = true;
        class190.field3083 = 0;
        for (int var2 = 0; var2 < class178.field2932.length; var2++) {
            if (class139.field2264[var2] != -1 && class178.field2932[var2] == null) {
                class178.field2932[var2] = class131.field2130.method523(-39, 0, class139.field2264[var2]);
                if (class178.field2932[var2] == null) {
                    class190.field3083++;
                    var1 = false;
                }
            }
            if (class71.field1195[var2] != -1 && class131.field2132[var2] == null) {
                class131.field2132[var2] = class131.field2130.method493(class15.field188[var2], class71.field1195[var2], 0, 93);
                if (class131.field2132[var2] == null) {
                    var1 = false;
                    class190.field3083++;
                }
            }
            if (class99.field1675) {
                if (class321.field5434[var2] != -1 && class277.field4608[var2] == null) {
                    class277.field4608[var2] = class131.field2130.method523(-58, 0, class321.field5434[var2]);
                    if (class277.field4608[var2] == null) {
                        class190.field3083++;
                        var1 = false;
                    }
                }
                if (class153.field2501[var2] != -1 && class36.field590[var2] == null) {
                    class36.field590[var2] = class131.field2130.method523(-25, 0, class153.field2501[var2]);
                    if (class36.field590[var2] == null) {
                        var1 = false;
                        class190.field3083++;
                    }
                }
            }
            if (class306.field5148 != null && class178.field2930[var2] == null && class306.field5148[var2] != -1) {
                class178.field2930[var2] = class131.field2130.method493(class15.field188[var2], class306.field5148[var2], 0, 78);
                if (class178.field2930[var2] == null) {
                    class190.field3083++;
                    var1 = false;
                }
            }
        }
        if (class84.field1441 == null) {
            if (class183.field2976 == null || !class228.field3752.method505(class248.method1746(8528, new class229[] { class183.field2976.field3874, class323.field5521 }), (byte) 74)) {
                class84.field1441 = new class61(0);
            } else if (class228.field3752.method508((byte) 87, class248.method1746(8528, new class229[] { class183.field2976.field3874, class323.field5521 }))) {
                class84.field1441 = class165.method1215(class228.field3752, -1, class248.method1746(8528, new class229[] { class183.field2976.field3874, class323.field5521 }));
            } else {
                class190.field3083++;
                var1 = false;
            }
        }
        if (!var1) {
            class196.field3280 = 1;
            return;
        }
        class295.field4828 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class178.field2932.length; var4++) {
            byte[] var5 = class131.field2132[var4];
            if (var5 != null) {
                int var6 = (class287.field4723[var4] >> 8) * 64 - class1.field9;
                int var7 = (class287.field4723[var4] & 0xFF) * 64 - class1.field1;
                if (class124.field2083) {
                    var7 = 10;
                    var6 = 10;
                }
                var3 &= class228.method1588(var5, var6, var7, 113);
            }
            if (class99.field1675) {
                byte[] var8 = class36.field590[var4];
                if (var8 != null) {
                    int var9 = (class287.field4723[var4] >> 8) * 64 - class1.field9;
                    int var10 = (class287.field4723[var4] & 0xFF) * 64 - class1.field1;
                    if (class124.field2083) {
                        var9 = 10;
                        var10 = 10;
                    }
                    var3 &= class228.method1588(var8, var9, var10, 106);
                }
            }
        }
        if (!var3) {
            class196.field3280 = 2;
            return;
        }
        if (class196.field3280 != 0) {
            class10.method71((byte) -85, true, class248.method1746(8528, new class229[] { class138.field2233, class6.field73 }));
        }
        class53.method364(14874);
        boolean var11 = false;
        class252.method1769((byte) -8);
        if (class99.field1675 && class281.field4661) {
            for (int var12 = 0; var12 < class178.field2932.length; var12++) {
                if (class36.field590[var12] != null || class277.field4608[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class113.method860(4, 104, 104, class99.field1675 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class160.field2592[var13].method818(-107);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class245.field4050[var14][var15][var16] = 0;
                }
            }
        }
        class162.method1145(false, (byte) 16);
        if (class99.field1675) {
            class137.field2225.method269();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class137.field2223[var17][var18].field1315 = true;
                }
            }
        }
        if (class99.field1675) {
            class62.method420();
        }
        if (class99.field1675) {
            class228.method1590((byte) 121);
        }
        class53.method364(14874);
        System.gc();
        class239.method1685(-31, true);
        class272.method1883(-112, false);
        if (!class124.field2083) {
            class221.method1548(18933, false);
            class239.method1685(-31, true);
            if (class99.field1675) {
                int var19 = class230.field3820.field5159[0] >> 3;
                int var20 = class230.field3820.field5104[0] >> 3;
                class225.method1564(false, var19, var20);
            }
            class10.method70(false, (byte) -108);
            if (class178.field2930 != null) {
                class114.method866(false);
            }
        }
        if (class124.field2083) {
            class166.method1216(55, false);
            class239.method1685(-31, true);
            if (class99.field1675) {
                int var21 = class230.field3820.field5104[0] >> 3;
                int var22 = class230.field3820.field5159[0] >> 3;
                class225.method1564(false, var22, var21);
            }
            class113.method857(false, (byte) 80);
        }
        int var23 = -22 / ((68 - arg0) / 38);
        class252.method1769((byte) -8);
        class239.method1685(-31, true);
        class59.method393(class160.field2592, (byte) -103, false);
        if (class99.field1675) {
            class62.method421();
        }
        class239.method1685(-31, true);
        int var24 = class229.field3796;
        if (var24 > class298.field4849) {
            var24 = class298.field4849;
        }
        if (class298.field4849 - 1 > var24) {
            int var25 = class298.field4849 - 1;
        }
        if (class61.method415((byte) 68)) {
            class15.method88(0);
        } else {
            class15.method88(class229.field3796);
        }
        class132.method940((byte) 45);
        if (class99.field1675 && var11) {
            class110.method840(true);
            class272.method1883(40, true);
            if (!class124.field2083) {
                class221.method1548(18933, true);
                class239.method1685(-31, true);
                class10.method70(true, (byte) 40);
            }
            if (class124.field2083) {
                class166.method1216(58, true);
                class239.method1685(-31, true);
                class113.method857(true, (byte) 80);
            }
            class252.method1769((byte) -8);
            class239.method1685(-31, true);
            class59.method393(class160.field2592, (byte) -127, true);
            class239.method1685(-31, true);
            class132.method940((byte) 45);
            class110.method840(false);
        }
        if (class99.field1675) {
            for (int var26 = 0; var26 < 13; var26++) {
                for (int var27 = 0; var27 < 13; var27++) {
                    class137.field2223[var26][var27].method592(class192.field3174[0], var26 * 8, var27 * 8);
                }
            }
        }
        for (int var28 = 0; var28 < 104; var28++) {
            for (int var29 = 0; var29 < 104; var29++) {
                class69.method543(128, var29, var28);
            }
        }
        class227.method1572(32);
        class53.method364(14874);
        class190.method1324(113);
        class252.method1769((byte) -8);
        class145.field2350 = false;
        if (class160.field2590 != null && class121.field2031 != null && class169.field2786 == 25) {
            class121.field2033.method37(16, 221);
            class290.field4756++;
            class121.field2033.method1168(1057001181, (byte) -111);
        }
        if (!class124.field2083) {
            int var30 = (class122.field2054 - 6) / 8;
            int var31 = (class95.field1611 - 6) / 8;
            int var32 = (class122.field2054 + 6) / 8;
            int var33 = (class95.field1611 + 6) / 8;
            for (int var34 = var30 - 1; var34 <= var32 + 1; var34++) {
                for (int var35 = var31 - 1; var35 <= (var33 + 1); var35++) {
                    if (var30 > var34 || var34 > var32 || var31 > var35 || var35 > var33) {
                        class131.field2130.method511(100, class248.method1746(8528, new class229[] { class44.field673, class50.method354(0, var34), class289.field4736, class50.method354(0, var35) }));
                        class131.field2130.method511(100, class248.method1746(8528, new class229[] { class204.field3360, class50.method354(0, var34), class289.field4736, class50.method354(0, var35) }));
                    }
                }
            }
        }
        if (class169.field2786 == 28) {
            class80.method595(10, (byte) -126);
        } else {
            class80.method595(30, (byte) -126);
            if (class121.field2031 != null) {
                class121.field2033.method37(69, 32);
            }
        }
        class126.method927(31315);
        class53.method364(14874);
        class221.method1546((byte) -125);
    }

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "(I)V", line = 525)
    public static void method1775(int arg0) {
        field4246 = null;
        field4245 = null;
        field4248 = null;
        field4247 = null;
        field4244 = null;
        field4240 = null;
        if (arg0 == 13) {
            field4238 = null;
            field4243 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method15(byte arg0);

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "(I)Z")
    public abstract boolean method16(int arg0);
}
