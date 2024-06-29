import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class199 {

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field3237 = 0;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "[I")
    public static int[] field3243 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "Z")
    public static boolean field3247 = false;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "F")
    public static float field3249;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public int field3235;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public int field3236;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public int field3240;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public int field3241;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public int field3242;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public int field3244;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    public int field3246;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "[B")
    public byte[] field3232;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "[B")
    public byte[] field3245;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIILsb;)[Lbf;")
    public static final class102[] method1349(int arg0, int arg1, int arg2, class124 arg3) {
        field3233++;
        if (arg0 != 0) {
            field3249 = -0.48563132F;
        }
        return class113.method833(arg1, arg3, arg2, arg0 + 78) ? class102.method757(0) : null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V")
    public static final void method1350(byte arg0) {
        if (arg0 >= -62) {
            method1351(-56);
        }
        field3234++;
        class48.field880 = 0;
        class106.field1615 = -3;
        class256.field4081 = 1;
        class48.field881 = false;
        class265.field4240 = -1;
        class224.field3576 = 0;
        class217.field3478 = 0;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
    public static void method1351(int arg0) {
        if (arg0 < 21) {
            field3249 = -0.80222917F;
        }
        field3243 = null;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
    public static final void method1352(int arg0) {
        field3239++;
        if (arg0 != 64) {
            field3249 = -0.7154053F;
        }
        if (class48.field878 != null && class48.field878.field2849 - (class48.field878.method1226((byte) -128) - 1) * 64 >> 7 == class71.field1191 && class48.field878.field2887 + 64 - (class48.field878.method1226((byte) -110) * 64) >> 7 == class146.field2404) {
            class71.field1191 = 0;
        }
        for (int var1 = 0; var1 < 104; var1++) {
            for (int var6 = 0; var6 < 104; var6++) {
                class258.field4112[var1][var6] = 0;
            }
        }
        for (int var2 = 0; var2 < class144.field2386; var2++) {
            class213 var5 = class191.field3129[class279.field4431[var2]];
            if (var5 != null) {
                var5.field2868 = false;
            }
        }
        for (int var3 = 0; var3 < class7.field88; var3++) {
            class139 var4 = class3.field45[class287.field4587[var3]];
            if (var4 != null) {
                var4.field2868 = false;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)I")
    public static final int method1353(byte arg0) {
        if (arg0 <= 13) {
            return 50;
        }
        field3238++;
        try {
            if (class228.field3620 == 0) {
                if (class265.field4231 > (class62.method472(59) - 5000L)) {
                    return 0;
                }
                class239.field3767 = class205.field3294.method637(class136.field2276, class213.field3423, (byte) 9);
                class257.field4088 = class62.method472(79);
                class228.field3620 = 1;
            }
            if ((class257.field4088 + 30000L) < class62.method472(55)) {
                return class259.method1735(1000, (byte) -62);
            }
            if (class228.field3620 == 1) {
                if (class239.field3767.field1937 == 2) {
                    return class259.method1735(1001, (byte) -62);
                }
                if (class239.field3767.field1937 != 1) {
                    return -1;
                }
                class23.field360 = new class35((Socket) class239.field3767.field1936, class205.field3294);
                class87.field1405.field2231 = 0;
                class239.field3767 = null;
                int var1 = 0;
                if (class185.field3037) {
                    var1 = class150.field2456;
                }
                class87.field1405.method966((byte) 102, 23);
                class87.field1405.method1029(var1, 15430);
                class23.field360.method301(class87.field1405.field2231, 0, class87.field1405.field2263, (byte) 124);
                if (class165.field2709 != null) {
                    class165.field2709.method1600(-3624);
                }
                if (class212.field3396 != null) {
                    class212.field3396.method1600(-3624);
                }
                int var2 = class23.field360.method295(-8922);
                if (class165.field2709 != null) {
                    class165.field2709.method1600(-3624);
                }
                if (class212.field3396 != null) {
                    class212.field3396.method1600(-3624);
                }
                if (var2 != 0) {
                    return class259.method1735(var2, (byte) -62);
                }
                class228.field3620 = 2;
            }
            if (class228.field3620 == 2) {
                if (class23.field360.method296(106) < 2) {
                    return -1;
                }
                class32.field539 = class23.field360.method295(-8922);
                class32.field539 <<= 0x8;
                class32.field539 += class23.field360.method295(-8922);
                class45.field825 = new byte[class32.field539];
                class37.field634 = 0;
                class228.field3620 = 3;
            }
            if (class228.field3620 != 3) {
                return -1;
            }
            int var3 = class23.field360.method296(-102);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > (class32.field539 - class37.field634)) {
                var3 = class32.field539 - class37.field634;
            }
            class23.field360.method303(-1, var3, class45.field825, class37.field634);
            class37.field634 += var3;
            if (class37.field634 < class32.field539) {
                return -1;
            } else if (class8.method41(-79, class45.field825)) {
                class143.field2362 = new class80[class35.field579];
                int var4 = 0;
                for (int var5 = class130.field2154; var5 <= class6.field74; var5++) {
                    class80 var6 = class105.method785(109, var5);
                    if (var6 != null) {
                        class143.field2362[var4++] = var6;
                    }
                }
                class23.field360.method294((byte) -113);
                class228.field3620 = 0;
                class218.field3507 = 0;
                class23.field360 = null;
                class45.field825 = null;
                class265.field4231 = class62.method472(61);
                return 0;
            } else {
                return class259.method1735(1002, (byte) -62);
            }
        } catch (IOException var7) {
            return class259.method1735(1003, (byte) -62);
        }
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(B)V")
    public static final void method1354(byte arg0) {
        field3248++;
        int var1 = 0;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var4 = 0; var4 < 104; var4++) {
                if (class276.method1866(var4, -125, class26.field455, true, var2, var1)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        int var3 = 113 / ((-arg0 - 21) / 35);
    }
}
