import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class26 extends class154 {

    @OriginalMember(owner = "client!dl", name = "X", descriptor = "I")
    private int field361 = 0;

    @OriginalMember(owner = "client!dl", name = "ab", descriptor = "I")
    private int field364 = 20;

    @OriginalMember(owner = "client!dl", name = "gb", descriptor = "I")
    private int field370 = 0;

    @OriginalMember(owner = "client!dl", name = "kb", descriptor = "I")
    private int field374 = 1365;

    @OriginalMember(owner = "client!dl", name = "Z", descriptor = "I")
    public static int field363 = 0;

    @OriginalMember(owner = "client!dl", name = "eb", descriptor = "[I")
    public static int[] field368 = new int[500];

    @OriginalMember(owner = "client!dl", name = "fb", descriptor = "Leg;")
    private static class37 field369 = class174.method1167("Polices charg-Bes", -117);

    @OriginalMember(owner = "client!dl", name = "bb", descriptor = "Leg;")
    public static class37 field365 = class174.method1167(":", -50);

    @OriginalMember(owner = "client!dl", name = "ob", descriptor = "Leg;")
    private static class37 field378 = class174.method1167("Attaquer", 105);

    @OriginalMember(owner = "client!dl", name = "db", descriptor = "Lmg;")
    public static class53 field367 = new class53(64);

    @OriginalMember(owner = "client!dl", name = "Y", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!dl", name = "cb", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!dl", name = "hb", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!dl", name = "ib", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!dl", name = "jb", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!dl", name = "lb", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!dl", name = "mb", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!dl", name = "nb", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "(I)V")
    public static void method149(int arg0) {
        field368 = null;
        field378 = null;
        field369 = null;
        field367 = null;
        if (arg0 == 64) {
            field365 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ID)V")
    public static final void method150(int arg0, double arg1) {
        if (arg0 != -257) {
            field363 = -69;
        }
        if (class79.field1226 != arg1) {
            for (int var3 = 0; ~var3 > -257; ++var3) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class96.field1499[var3] = var4 > 255 ? 255 : var4;
            }
            class79.field1226 = arg1;
        }
        ++field371;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        if (arg1 != -14015) {
            this.field374 = 44;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 == -4) {
                        this.field361 = arg0.method1244(false);
                    }
                } else {
                    this.field370 = arg0.method1244(false);
                }
            } else {
                this.field364 = arg0.method1244(false);
            }
        } else {
            this.field374 = arg0.method1244(false);
        }
        ++field366;
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(B)V")
    public static final void method151(byte arg0) {
        class59.field957 = class13.field210;
        class29.field423 = class43.field670;
        class62.field1024 = class2.field36;
        class265.field4653 = class62.field1020;
        class131.field2192 = class75.field1173;
        class145.field2474 = class63.field1034;
        class60.field992 = class239.field4254;
        class49.field777 = class271.field4763;
        class4.field65 = class68.field1082;
        class111.field1851 = class238.field4232;
        class48.field763 = class4.field78;
        class36.field531 = class35.field498;
        class278.field4923 = class188.field3223;
        class55.field835 = class99.field1534;
        class47.field753 = class228.field3907;
        class144.field2464 = class107.field1674;
        class62.field1009 = class280.field4951;
        class29.field419 = class35.field502;
        class1.field10 = class208.field3530;
        class24.field310 = class134.field2329;
        class238.field4234 = class279.field4927;
        class291.field5123 = class89.field1427;
        class137.field2352 = class268.field4691;
        class86.field1361 = class139.field2391;
        class86.field1365 = class112.field1913;
        class99.field1545 = class189.field3249;
        class59.field965 = class13.field210;
        class95.field1493 = class231.field3964;
        class129.field2155 = class61.field1006;
        class276.field4894 = class19.field254;
        class247.field4442 = class37.field559;
        class83.field1308 = class217.field3740;
        class93.field1456 = class1.field15;
        class241.field4346 = class25.field358;
        class67.field1065 = class82.field1296;
        class47.field750 = class154.field2595;
        class182.field3046 = class92.field1432;
        class274.field4801 = class178.field2966;
        class147.field2498 = class286.field5045;
        class21.field276 = class77.field1207;
        class33.field488 = class285.field5042;
        class154.field2594 = class20.field266;
        class154.field2596 = class285.field5032;
        class129.field2144 = field369;
        class93.field1468 = class105.field1630;
        class24.field325 = class272.field4769;
        class159.field2651 = class68.field1072;
        class150.field2527 = class254.field4515;
        class289.field5102 = class262.field4612;
        class244.field4402 = class83.field1309;
        class163.field2698 = class178.field2964;
        class10.field167 = class100.field1554;
        class267.field4682 = class173.field2905;
        class263.field4633 = class74.field1168;
        class118.field2008 = class115.field1953;
        ++field376;
        class133.field2249 = class73.field1150;
        class260.field4601 = class221.field3800;
        class147.field2499 = class68.field1080;
        class249.field4480 = class284.field5017;
        class139.field2394 = class208.field3522;
        class181.field3032 = class174.field2914;
        class59.field974 = class264.field4639;
        class246.field4417 = class143.field2433;
        if (arg0 < 101) {
            field378 = null;
        }
        class280.field4948 = class287.field5056;
        class61.field1002 = class213.field3684;
        class7.field122 = class278.field4920;
        class181.field3022 = class147.field2504;
        class203.field3464 = class69.field1095;
        class145.field2475 = class27.field385;
        class189.field3247 = field378;
        class40.field644 = class197.field3359;
        class30.field443 = class188.field3230;
        class22.field285 = class47.field743;
        class72.field1136 = class187.field3189;
        class19.field256 = class201.field3427;
        class197.field3349 = class56.field857;
        class99.field1529 = class133.field2307;
        class228.field3926 = class268.field4692;
        class267.field4684 = class173.field2905;
        class147.field2500 = class8.field138;
        class59.field971 = class8.field136;
        class22.field287 = class198.field3375;
        class223.field3831 = class111.field1850;
        class18.field248 = class225.field3860;
        class259.field4591 = class262.field4618;
        class233.field4032 = class30.field441;
        class146.field2485 = class143.field2438;
        class173.field2899 = class264.field4641;
        class99.field1532 = class133.field2307;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
    public class26() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method152(Component arg0, int arg1) {
        arg0.removeKeyListener(class4.field71);
        int var2 = -52 % ((arg1 - 37) / 47);
        arg0.removeFocusListener(class4.field71);
        ++field373;
        class236.field4058 = -1;
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(III)Z")
    public static final boolean method153(int arg0, int arg1, int arg2) {
        int var3 = -95 % ((17 - arg2) / 32);
        ++field372;
        if (~arg1 == -12) {
            arg1 = 10;
        }
        class133 var4 = class178.method1186(arg0, 0);
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var4.method950((byte) -115, arg1);
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(II)V")
    public static final void method154(int arg0, int arg1) {
        ++field362;
        class286.field5043.method1402((byte) -18, arg0);
        if (arg1 != -4742) {
            method149(77);
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        if (arg1 != 1075962732) {
            return null;
        } else {
            int[] var3 = super.field2574.method206(arg0, 10232);
            if (super.field2574.field536) {
                for (int var4 = 0; class227.field3898 > var4; ++var4) {
                    int var5 = (class239.field4263[var4] << 12) / this.field374 + this.field370;
                    int var6 = var5;
                    int var7 = (class62.field1029[arg0] << 12) / this.field374 + this.field361;
                    int var8 = var7;
                    int var9 = var5;
                    int var10 = var7;
                    int var11 = var5 * var5 >> 12;
                    int var12 = 0;
                    for (int var13 = var7 * var7 >> 12; var11 - -var13 < 16384 && ~this.field364 < ~var12; var13 = var10 * var10 >> 12) {
                        ++var12;
                        var10 = (var9 * var10 >> 12) * 2 + var8;
                        var9 = -var13 + var6 + var11;
                        var11 = var9 * var9 >> 12;
                    }
                    var3[var4] = this.field364 + -1 > var12 ? (var12 << 12) / this.field364 : 0;
                }
            }
            ++field377;
            return var3;
        }
    }
}
