import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class252 {

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field4363 = 0;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    public static int field4368 = -1;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "[I")
    public static int[] field4364 = new int[32];

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "Ln;")
    public static class138 field4359;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "Ln;")
    public static class138 field4367;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "Lua;")
    public static class240 field4362;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Lnh;")
    public static class57 field4358;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public static void method1679(byte arg0) {
        field4359 = null;
        field4362 = null;
        field4358 = null;
        field4367 = null;
        field4364 = null;
        if (arg0 < 18) {
            field4362 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLta;)V")
    public static final void method1680(byte arg0, class105 arg1) {
        if (arg0 <= 21) {
            return;
        }
        field4361++;
        class105 var2 = class139.method888(arg1, true);
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class208.field3538;
            var3 = class49.field867;
        } else {
            var3 = var2.field1977;
            var4 = var2.field1952;
        }
        class125.method774(var4, arg1, false, 12345678, var3);
        class57.method345(var3, var4, arg1, (byte) 104);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
    public static final void method1681(int arg0, int arg1, int arg2) {
        field4360++;
        int var3 = arg2--;
        if (var3 > 25) {
            var3 = 25;
        }
        int var4 = class120.field2188[arg2];
        int var5 = class40.field659[arg2];
        if (arg1 == 0) {
            class176.field2935.method664((byte) 90, 208);
            class176.field2935.method1443(var3 + var3 + 3, 0);
            class83.field1458++;
        }
        if (arg1 == 1) {
            class176.field2935.method664((byte) 20, 74);
            class212.field3578++;
            class176.field2935.method1443(var3 + var3 + 3 + 14, 0);
        }
        if (arg1 == 2) {
            class255.field4476++;
            class176.field2935.method664((byte) 30, 170);
            class176.field2935.method1443(var3 + var3 + 3, 0);
        }
        class176.field2935.method1451(class78.field1367 + var4, (byte) -127);
        class176.field2935.method1466(class213.field3595[82] ? 1 : 0, -10);
        class117.field2145 = class120.field2188[0];
        class67.field1213 = class40.field659[0];
        for (int var6 = arg0; var6 < var3; var6++) {
            arg2--;
            class176.field2935.method1443(class40.field659[arg2] - var5, 0);
            class176.field2935.method1443(class120.field2188[arg2] - var4, 0);
        }
        class176.field2935.method1476(class192.field3267 + var5, -74);
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V")
    public static final void method1682(byte arg0) {
        class186.field3167 = class250.field4334;
        class225.field3834 = class149.field2609;
        class253.field4446 = class227.field3972;
        class59.field1091 = class193.field3297;
        class91.field1567 = class242.field4203;
        class142.field2444 = class103.field1803;
        class91.field1555 = class36.field595;
        class58.field1077 = class231.field4039;
        class70.field1229 = class13.field253;
        class44.field726 = class184.field3131;
        class44.field738 = class31.field493;
        class227.field3961 = class87.field1502;
        class86.field1491 = class33.field542;
        class42.field694 = class43.field714;
        class54.field945 = class63.field1151;
        class203.field3464 = class156.field2674;
        class76.field1320 = class152.field2643;
        class173.field2888 = class76.field1327;
        class191.field3242 = class116.field2132;
        class45.field764 = class261.field4542;
        class245.field4271 = class36.field598;
        class195.field3323 = class125.field2238;
        class169.field2833 = class248.field4313;
        class57.field1053 = class116.field2122;
        class112.field2079 = class133.field2309;
        class198.field3400 = class191.field3245;
        class118.field2148 = class34.field587;
        client.field1445 = class106.field1992;
        class258.field4514 = class37.field615;
        class188.field3196 = class34.field565;
        class160.field2700 = class86.field1493;
        class69.field1228 = class16.field291;
        class79.field1385 = class185.field3149;
        class21.field370 = class95.field1647;
        if (arg0 != 94) {
            field4359 = null;
        }
        class232.field4048 = class125.field2236;
        class46.field819 = class240.field4172;
        class165.field2772 = class229.field3996;
        class182.field3103 = class108.field2032;
        class73.field1286 = class41.field682;
        class61.field1128 = class254.field4458;
        class216.field3648 = class75.field1311;
        class248.field4316 = class198.field3404;
        class101.field1782 = class242.field4207;
        class70.field1233 = class28.field462;
        class191.field3253 = class238.field4140;
        class147.field2549 = class187.field3184;
        class133.field2310 = class178.field3006;
        class260.field4537 = class143.field2463;
        class213.field3599 = class67.field1215;
        class87.field1512 = class41.field681;
        class128.field2261 = class119.field2168;
        class83.field1464 = class2.field32;
        field4366++;
        class120.field2178 = class43.field710;
        class120.field2194 = class21.field369;
        class23.field396 = class184.field3138;
        class161.field2721 = class195.field3312;
        class57.field1058 = class168.field2827;
        class18.field314 = class229.field3999;
        class172.field2881 = class173.field2893;
        class10.field215 = class221.field3752;
        class256.field4483 = class69.field1225;
        class40.field651 = class87.field1514;
        class253.field4445 = class227.field3972;
        class236.field4096 = class10.field186;
        class223.field3791 = class167.field2787;
        class83.field1457 = class2.field32;
        class73.field1283 = class100.field1758;
        class27.field445 = class160.field2701;
        class24.field403 = class25.field416;
        class88.field1529 = class243.field4231;
        class37.field614 = class19.field324;
        class225.field3813 = class171.field2865;
        class71.field1253 = class140.field2424;
        class120.field2181 = class12.field240;
        class220.field3724 = class213.field3606;
        class216.field3640 = class115.field2104;
        class193.field3289 = class186.field3162;
        class54.field941 = class85.field1475;
        class226.field3871 = class203.field3466;
        class151.field2630 = class61.field1125;
        class261.field4544 = class220.field3720;
        class57.field1048 = class168.field2827;
        class8.field159 = class255.field4477;
        class120.field2179 = class214.field3620;
        class78.field1372 = class94.field1635;
        class125.field2248 = class18.field309;
        class179.field3075 = class210.field3561;
        class15.field287 = class185.field3143;
        class200.field3434 = class98.field1711;
        class181.field3100 = class218.field3655;
        class14.field264 = class230.field4027;
        class88.field1523 = class73.field1296;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILn;I)Lwh;")
    public static final class163 method1683(int arg0, int arg1, class138 arg2, int arg3) {
        field4357++;
        if (arg3 == -2) {
            return class123.method760(arg2, arg1, arg0, 120) ? class215.method1368(true) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)I")
    public static final int method1684(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)V")
    public static final void method1685(int arg0, int arg1) {
        field4371++;
        class151 var2 = (class151) class42.field688.method1298(-119, (long) arg1);
        if (var2 == null) {
            return;
        }
        int var3 = 0;
        if (arg0 != 255) {
            return;
        }
        while (var2.field2625.length > var3) {
            var2.field2625[var3] = -1;
            var2.field2626[var3] = 0;
            var3++;
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)Lnf;")
    public static final class213 method1686(byte arg0) {
        byte[] var1 = class26.field427[0];
        int var2 = class214.field3613[0] * class177.field2982[0];
        if (arg0 >= -14) {
            return null;
        }
        field4365++;
        int[] var3 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = class63.field1153[class76.method446(255, var1[var4])];
        }
        class163 var5 = new class163(class161.field2727, class241.field4197, class58.field1068[0], class176.field2934[0], class177.field2982[0], class214.field3613[0], var3);
        class57.method350((byte) -83);
        return var5;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Z")
    public static final boolean method1687(int arg0) {
        field4369++;
        class11 var1 = class134.field2341;
        synchronized (class134.field2341) {
            if (class99.field1737 == class60.field1119) {
                return false;
            }
            class99.field1721 = class118.field2149[class60.field1119];
            class143.field2457 = class89.field1538[class60.field1119];
            if (arg0 <= 43) {
                method1682((byte) -13);
            }
            class60.field1119 = class60.field1119 + 1 & 0x7F;
            return true;
        }
    }
}
