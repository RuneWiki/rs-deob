import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class94 {

    @OriginalMember(owner = "client!se", name = "b", descriptor = "Leg;")
    public static class37 field1479 = class174.method1167("::", 102);

    @OriginalMember(owner = "client!se", name = "d", descriptor = "[I")
    public static int[] field1481 = new int[32];

    @OriginalMember(owner = "client!se", name = "f", descriptor = "Leg;")
    private static class37 field1483 = class174.method1167("rot:", -27);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Ljl;")
    public static class101 field1482;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIZ)V")
    public static final void method613(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class175.field2936 = arg1;
        class160.field2675 = arg2;
        class257.field4562 = arg3;
        class88.field1394 = new class111[arg0][class175.field2936][class160.field2675];
        class177.field2958 = new int[arg0][class175.field2936 + 1][class160.field2675 + 1];
        if (arg4) {
            class233.field4031 = new class111[1][class175.field2936][class160.field2675];
            class167.field2800 = new int[class175.field2936][class160.field2675];
            class39.field635 = new int[1][class175.field2936 + 1][class160.field2675 + 1];
        } else {
            class233.field4031 = null;
            class167.field2800 = null;
            class39.field635 = null;
        }
        class31.method181(false);
        class66.field1054 = new class256[500];
        class152.field2561 = 0;
        class187.field3195 = new class256[500];
        class59.field969 = 0;
        class44.field684 = new int[arg0][class175.field2936 + 1][class160.field2675 + 1];
        class134.field2320 = new class27[5000];
        class224.field3839 = 0;
        class108.field1735 = new class27[100];
        class181.field3036 = new boolean[class257.field4562 + class257.field4562 + 1][class257.field4562 + class257.field4562 + 1];
        client.field1884 = new boolean[class257.field4562 + class257.field4562 + 2][class257.field4562 + class257.field4562 + 2];
        class19.field257 = new byte[arg0][class175.field2936][class160.field2675];
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public static void method614(int arg0) {
        field1481 = null;
        field1479 = null;
        if (arg0 == 1723) {
            field1482 = null;
            field1483 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(JB)V")
    public static final void method615(long arg0, byte arg1) {
        field1478++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class242.field4363 < 100 || class125.field2094) || class242.field4363 >= 200) {
            class274.method1839((byte) -98, 0, class179.field2989, class276.field4894);
            return;
        }
        if (arg1 >= -81) {
            field1480 = -122;
        }
        class37 var3 = class35.method201(arg0, 2).method227(-98);
        for (int var4 = 0; var4 < class242.field4363; var4++) {
            if (class58.field941[var4] == arg0) {
                class274.method1839((byte) -81, 0, class179.field2989, class156.method1061((byte) 68, new class37[] { var3, class48.field763 }));
                return;
            }
        }
        for (int var5 = 0; var5 < class62.field1028; var5++) {
            if (class68.field1068[var5] == arg0) {
                class274.method1839((byte) -83, 0, class179.field2989, class156.method1061((byte) -96, new class37[] { class99.field1532, var3, class67.field1065 }));
                return;
            }
        }
        if (var3.method223(class82.field1285.field3235, (byte) 63)) {
            class274.method1839((byte) -113, 0, class179.field2989, class147.field2500);
            return;
        }
        class80.field1249++;
        class22.field289[class242.field4363] = var3;
        class58.field941[class242.field4363] = arg0;
        class77.field1203[class242.field4363] = 0;
        class174.field2911[class242.field4363] = class179.field2989;
        class213.field3681[class242.field4363] = 0;
        class119.field2013[class242.field4363] = false;
        class242.field4363++;
        class218.field3750 = class221.field3804;
        class273.field4778.method1697(26, 114);
        class273.field4778.method1256(arg0, (byte) 84);
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
    public static final void method616(int arg0) {
        class86.field1361 = class179.field2982;
        class267.field4684 = class144.field2468;
        class144.field2464 = class40.field640;
        class93.field1468 = class203.field3470;
        class55.field835 = class120.field2031;
        class1.field10 = class31.field462;
        class260.field4601 = class36.field518;
        class173.field2899 = class79.field1231;
        class146.field2485 = class127.field2134;
        class24.field310 = class47.field742;
        class223.field3831 = class189.field3256;
        class241.field4346 = class29.field424;
        class48.field763 = class270.field4729;
        class99.field1529 = class30.field435;
        class129.field2155 = class88.field1393;
        class21.field276 = class69.field1097;
        class154.field2596 = class42.field660;
        class289.field5102 = class171.field2867;
        class36.field531 = class227.field3897;
        class181.field3032 = class184.field3098;
        class62.field1009 = class196.field3338;
        class22.field287 = class44.field677;
        class145.field2475 = class67.field1058;
        class129.field2144 = class47.field735;
        class163.field2698 = class226.field3878;
        class95.field1493 = class52.field810;
        int var1 = -76 % ((arg0 + 19) / 62);
        class40.field644 = class196.field3342;
        class265.field4653 = class247.field4440;
        class30.field443 = class123.field2071;
        class7.field122 = class241.field4328;
        class99.field1532 = class30.field435;
        class278.field4923 = class217.field3728;
        class197.field3349 = class244.field4383;
        class47.field753 = class290.field5112;
        class29.field419 = class95.field1492;
        class59.field974 = field1483;
        class244.field4402 = class20.field265;
        class29.field423 = class274.field4816;
        class59.field965 = class36.field512;
        class274.field4801 = class181.field3029;
        class24.field325 = class162.field2677;
        class59.field971 = class181.field3037;
        class189.field3247 = class260.field4605;
        class67.field1065 = class259.field4582;
        class18.field248 = class236.field4057;
        class147.field2499 = class33.field486;
        class291.field5123 = class284.field5015;
        class59.field957 = class36.field512;
        class145.field2474 = class33.field487;
        class93.field1456 = class256.field4547;
        class137.field2352 = class187.field3191;
        class139.field2394 = class231.field3956;
        class22.field285 = class51.field796;
        field1484++;
        class159.field2651 = class140.field2404;
        class263.field4633 = class64.field1046;
        class147.field2500 = class78.field1215;
        class133.field2249 = class36.field516;
        class182.field3046 = class23.field295;
        class131.field2192 = class109.field1806;
        class60.field992 = class18.field249;
        class111.field1851 = class86.field1357;
        class280.field4948 = class130.field2169;
        class19.field256 = class289.field5103;
        class249.field4480 = class102.field1602;
        class33.field488 = class45.field702;
        class99.field1545 = class189.field3245;
        class228.field3926 = class175.field2935;
        class147.field2498 = class257.field4557;
        class49.field777 = class27.field388;
        class203.field3464 = class68.field1069;
        class4.field65 = class28.field405;
        class247.field4442 = class126.field2111;
        class238.field4234 = class63.field1039;
        class181.field3022 = class123.field2069;
        class154.field2594 = class180.field3005;
        class246.field4417 = class160.field2662;
        class267.field4682 = class144.field2468;
        class72.field1136 = class231.field3961;
        class118.field2008 = class134.field2327;
        class83.field1308 = class104.field1619;
        class276.field4894 = class244.field4400;
        class233.field4032 = class208.field3525;
        class61.field1002 = class46.field714;
        class259.field4591 = class194.field3328;
        class86.field1365 = class240.field4269;
        class10.field167 = class102.field1597;
        class150.field2527 = class273.field4787;
        class62.field1024 = class197.field3351;
        class47.field750 = class112.field1915;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)I")
    public static int method617(int arg0, int arg1) {
        return arg0 | arg1;
    }
}
