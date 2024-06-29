import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class58 {

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "Ltl;")
    public static class59 field847 = class85.method639("<img=0>", 9588);

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "S")
    public static short field854 = 256;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "Ltl;")
    public static class59 field850 = class85.method639("Verbindung abgebrochen)3", 9588);

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field855 = 1;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field852 = 0;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field849;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLs;[B)V", line = 18)
    public final void method446(byte arg0, class170 arg1, byte[] arg2) {
        field846++;
        if (arg1.field2758[arg1.field2787] != 31 || arg1.field2758[arg1.field2787 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field849 == null) {
            this.field849 = new Inflater(true);
        }
        if (arg0 != -50) {
            method448(19, 59);
        }
        try {
            this.field849.setInput(arg1.field2758, arg1.field2787 + 10, -arg1.field2787 - 10 + -8 + arg1.field2758.length);
            this.field849.inflate(arg2);
        } catch (Exception var5) {
            this.field849.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field849.reset();
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([SI)[S", line = 51)
    public static final short[] method447(short[] arg0, int arg1) {
        field848++;
        if (arg0 == null) {
            return null;
        } else if (arg1 == 32) {
            short[] var2 = new short[arg0.length];
            class63.method521(arg0, 0, var2, 0, arg0.length);
            return var2;
        } else {
            return (short[]) null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)V", line = 71)
    public static final void method448(int arg0, int arg1) {
        field845++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class29.field393[arg1];
        int var3 = class40.field598[arg1];
        int var4 = class27.field363[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var5 = (int) class281.field4843[arg1];
        long var6 = class281.field4843[arg1];
        if (var4 == 51) {
            class233.field3830++;
            class234.field3888.method1768(true, 244);
            class234.field3888.method1237(true, class200.field3314);
            class234.field3888.method1211(var3, (byte) -124);
            class234.field3888.method1200(class172.field2835, 32602);
            class234.field3888.method1238(1871071368, var2);
            class234.field3888.method1217(class167.field2702, (byte) -15);
            class234.field3888.method1238(arg0 + 1871046520, var5);
            class12.field160 = 0;
            class219.field3557 = class247.method1738(false, var3);
            class172.field2831 = var2;
        }
        if (var4 == 29) {
            class13.field175++;
            boolean var8 = class28.method178(var3, 2, 0, (byte) -6, class286.field4920.field1729[0], 0, class286.field4920.field1773[0], 0, var2, 0, 0, false);
            if (!var8) {
                class28.method178(var3, 2, 0, (byte) -6, class286.field4920.field1729[0], 1, class286.field4920.field1773[0], 0, var2, 0, 1, false);
            }
            class64.field992 = 2;
            class236.field3918 = 0;
            class223.field3619 = class149.field2444;
            class127.field2088 = class231.field3794;
            class234.field3888.method1768(true, 148);
            class234.field3888.method1200(var5, arg0 ^ 0x1E4A);
            class234.field3888.method1196((byte) 78, class197.field3249 + var2);
            class234.field3888.method1237(true, var3 + class187.field3135);
        }
        if (var4 == 14) {
            class102 var10 = class211.field3438[var5];
            if (var10 != null) {
                class28.method178(var10.field1773[0], 2, 0, (byte) -6, class286.field4920.field1729[0], 1, class286.field4920.field1773[0], 0, var10.field1729[0], 0, 1, false);
                class223.field3619 = class149.field2444;
                class236.field3918 = 0;
                class127.field2088 = class231.field3794;
                class38.field581++;
                class64.field992 = 2;
                class234.field3888.method1768(true, 141);
                class234.field3888.method1196((byte) 78, var5);
            }
        }
        if (var4 == 46) {
            class124.field2052++;
            class234.field3888.method1768(true, 164);
            class234.field3888.method1213(-1, var3);
            class263 var11 = class247.method1738(false, var3);
            if (var11.field4396 != null && var11.field4396[0][0] == 5) {
                int var12 = var11.field4396[0][1];
                if (class116.field1915[var12] != var11.field4423[0]) {
                    class116.field1915[var12] = var11.field4423[0];
                    class294.method2027(var12, -10);
                }
            }
        }
        if (var4 == 42) {
            class251.field4180++;
            boolean var13 = class28.method178(var3, 2, 0, (byte) -6, class286.field4920.field1729[0], 0, class286.field4920.field1773[0], 0, var2, 0, 0, false);
            if (!var13) {
                class28.method178(var3, 2, 0, (byte) -6, class286.field4920.field1729[0], 1, class286.field4920.field1773[0], 0, var2, 0, 1, false);
            }
            class223.field3619 = class149.field2444;
            class64.field992 = 2;
            class236.field3918 = 0;
            class127.field2088 = class231.field3794;
            class234.field3888.method1768(true, 24);
            class234.field3888.method1237(true, class187.field3135 + var3);
            class234.field3888.method1238(arg0 ^ 0x6F862998, class197.field3249 + var2);
            class234.field3888.method1237(true, var5);
        }
        if (var4 == 4) {
            class311.field5277++;
            class234.field3888.method1768(true, 121);
            class234.field3888.method1200(var5, 32602);
            class234.field3888.method1213(arg0 - 24849, var3);
            class234.field3888.method1196((byte) 78, var2);
            class12.field160 = 0;
            class219.field3557 = class247.method1738(false, var3);
            class172.field2831 = var2;
        }
        if (var4 == 1) {
            class102 var15 = class211.field3438[var5];
            if (var15 != null) {
                class160.field2609++;
                class28.method178(var15.field1773[0], 2, 0, (byte) -6, class286.field4920.field1729[0], 1, class286.field4920.field1773[0], 0, var15.field1729[0], 0, 1, false);
                class236.field3918 = 0;
                class64.field992 = 2;
                class223.field3619 = class149.field2444;
                class127.field2088 = class231.field3794;
                class234.field3888.method1768(true, 171);
                class234.field3888.method1211(class27.field362, (byte) -82);
                class234.field3888.method1238(1871071368, var5);
                class234.field3888.method1200(class39.field588, 32602);
            }
        }
        if (var4 == 7) {
            class254.method1772(var3, var6, -127, var2);
            class307.field5203++;
            class234.field3888.method1768(true, 110);
            class234.field3888.method1237(true, class187.field3135 + var3);
            class234.field3888.method1238(1871071368, class197.field3249 + var2);
            class234.field3888.method1196((byte) 78, (int) (var6 >>> 32) & Integer.MAX_VALUE);
        }
        if (var4 == 2) {
            class23 var16 = class23.field311[var5];
            if (var16 != null) {
                class28.method178(var16.field1773[0], 2, 0, (byte) -6, class286.field4920.field1729[0], 1, class286.field4920.field1773[0], 0, var16.field1729[0], 0, 1, false);
                class223.field3619 = class149.field2444;
                class236.field3918 = 0;
                class96.field1522++;
                class127.field2088 = class231.field3794;
                class64.field992 = 2;
                class234.field3888.method1768(true, 229);
                class234.field3888.method1237(true, var5);
            }
        }
        if (var4 == 34) {
            class234.field3888.method1768(true, 59);
            class234.field3888.method1238(1871071368, var2);
            class234.field3888.method1196((byte) 78, var5);
            class160.field2611++;
            class234.field3888.method1213(-1, var3);
            class12.field160 = 0;
            class219.field3557 = class247.method1738(false, var3);
            class172.field2831 = var2;
        }
        if (var4 == 36 && class254.method1772(var3, var6, -97, var2)) {
            class234.field3888.method1768(true, 8);
            class234.field3888.method1196((byte) 78, class187.field3135 + var3);
            class38.field580++;
            class234.field3888.method1237(true, class39.field588);
            class234.field3888.method1237(true, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class234.field3888.method1238(1871071368, class197.field3249 + var2);
            class234.field3888.method1207(-121, class27.field362);
        }
        if (var4 == 13) {
            class23 var17 = class23.field311[var5];
            if (var17 != null) {
                class28.method178(var17.field1773[0], 2, 0, (byte) -6, class286.field4920.field1729[0], 1, class286.field4920.field1773[0], 0, var17.field1729[0], 0, 1, false);
                class223.field3619 = class149.field2444;
                class127.field2088 = class231.field3794;
                class93.field1443++;
                class64.field992 = 2;
                class236.field3918 = 0;
                class234.field3888.method1768(true, 149);
                class234.field3888.method1237(true, var5);
            }
        }
        if (var4 == 57) {
            class102 var18 = class211.field3438[var5];
            if (var18 != null) {
                class28.method178(var18.field1773[0], 2, 0, (byte) -6, class286.field4920.field1729[0], 1, class286.field4920.field1773[0], 0, var18.field1729[0], 0, 1, false);
                class236.field3918 = 0;
                class100.field1622++;
                class127.field2088 = class231.field3794;
                class64.field992 = 2;
                class223.field3619 = class149.field2444;
                class234.field3888.method1768(true, 84);
                class234.field3888.method1200(var5, 32602);
            }
        }
        if (var4 == 17) {
            class102 var19 = class211.field3438[var5];
            if (var19 != null) {
                class28.method178(var19.field1773[0], 2, 0, (byte) -6, class286.field4920.field1729[0], 1, class286.field4920.field1773[0], 0, var19.field1729[0], 0, 1, false);
                class127.field2088 = class231.field3794;
                class64.field992 = 2;
                class236.field3918 = 0;
                class235.field3904++;
                class223.field3619 = class149.field2444;
                class234.field3888.method1768(true, 183);
                class234.field3888.method1196((byte) 78, var5);
            }
        }
        if (var4 == 1002) {
            class72.field1140++;
            class254.method1772(var3, var6, 69, var2);
            class234.field3888.method1768(true, 66);
            class234.field3888.method1200((int) (var6 >>> 32) & Integer.MAX_VALUE, 32602);
            class234.field3888.method1237(true, class197.field3249 + var2);
            class234.field3888.method1237(true, class187.field3135 + var3);
        }
        if (var4 == 43) {
            class23 var20 = class23.field311[var5];
            if (var20 != null) {
                class255.field4236++;
                class28.method178(var20.field1773[0], 2, 0, (byte) -6, class286.field4920.field1729[0], 1, class286.field4920.field1773[0], 0, var20.field1729[0], 0, 1, false);
                class127.field2088 = class231.field3794;
                class64.field992 = 2;
                class223.field3619 = class149.field2444;
                class236.field3918 = 0;
                class234.field3888.method1768(true, 43);
                class234.field3888.method1237(true, var5);
            }
        }
        if (var4 == 32) {
            boolean var21 = true;
            class263 var22 = class247.method1738(false, var3);
            if (var22.field4472 > 0) {
                var21 = class137.method1000(false, var22);
            }
            if (var21) {
                class234.field3888.method1768(true, 164);
                class124.field2052++;
                class234.field3888.method1213(-1, var3);
            }
        }
        if (var4 == 47) {
            class234.field3888.method1768(true, 134);
            class234.field3888.method1196((byte) 78, var5);
            class19.field248++;
            class234.field3888.method1207(-73, var3);
            class234.field3888.method1237(true, var2);
            class12.field160 = 0;
            class219.field3557 = class247.method1738(false, var3);
            class172.field2831 = var2;
        }
        if (var4 == 25) {
            class234.field3888.method1768(true, 91);
            class8.field98++;
            class234.field3888.method1238(1871071368, var5);
            class234.field3888.method1213(arg0 ^ 0xFFFF9EEF, var3);
            class234.field3888.method1196((byte) 78, var2);
            class12.field160 = 0;
            class219.field3557 = class247.method1738(false, var3);
            class172.field2831 = var2;
        }
        if (var4 == 49 || var4 == 1007) {
            class188.method1394(class294.field5015[arg1], var2, var5, (byte) -34, var3);
        }
        if (var4 == 24) {
            class102 var23 = class211.field3438[var5];
            if (var23 != null) {
                class260.field4344++;
                class28.method178(var23.field1773[0], 2, 0, (byte) -6, class286.field4920.field1729[0], 1, class286.field4920.field1773[0], 0, var23.field1729[0], 0, 1, false);
                class127.field2088 = class231.field3794;
                class64.field992 = 2;
                class236.field3918 = 0;
                class223.field3619 = class149.field2444;
                class234.field3888.method1768(true, 177);
                class234.field3888.method1237(true, var5);
            }
        }
        if (var4 == 10) {
            class23 var24 = class23.field311[var5];
            if (var24 != null) {
                class251.field4186++;
                class28.method178(var24.field1773[0], 2, 0, (byte) -6, class286.field4920.field1729[0], 1, class286.field4920.field1773[0], 0, var24.field1729[0], 0, 1, false);
                class223.field3619 = class149.field2444;
                class64.field992 = 2;
                class236.field3918 = 0;
                class127.field2088 = class231.field3794;
                class234.field3888.method1768(true, 77);
                class234.field3888.method1196((byte) 78, var5);
            }
        }
        if (var4 == 28) {
            class102 var25 = class211.field3438[var5];
            if (var25 != null) {
                class254.field4212++;
                class28.method178(var25.field1773[0], 2, 0, (byte) -6, class286.field4920.field1729[0], 1, class286.field4920.field1773[0], 0, var25.field1729[0], 0, 1, false);
                class236.field3918 = 0;
                class64.field992 = 2;
                class127.field2088 = class231.field3794;
                class223.field3619 = class149.field2444;
                class234.field3888.method1768(true, 207);
                class234.field3888.method1196((byte) 78, var5);
            }
        }
        if (var4 == 9) {
            class102 var26 = class211.field3438[var5];
            if (var26 != null) {
                class128.field2102++;
                class28.method178(var26.field1773[0], 2, 0, (byte) -6, class286.field4920.field1729[0], 1, class286.field4920.field1773[0], 0, var26.field1729[0], 0, 1, false);
                class127.field2088 = class231.field3794;
                class64.field992 = 2;
                class236.field3918 = 0;
                class223.field3619 = class149.field2444;
                class234.field3888.method1768(true, 241);
                class234.field3888.method1200(var5, 32602);
            }
        }
        if (var4 == 1001) {
            class223.field3619 = class149.field2444;
            class296.field5082++;
            class236.field3918 = 0;
            class64.field992 = 2;
            class127.field2088 = class231.field3794;
            class234.field3888.method1768(true, 93);
            class234.field3888.method1196((byte) 78, var5);
        }
        if (var4 == 50) {
            class234.field3888.method1768(true, 4);
            class88.field1385++;
            class234.field3888.method1217(var3, (byte) -15);
            class234.field3888.method1196((byte) 78, var5);
            class234.field3888.method1238(1871071368, var2);
            class12.field160 = 0;
            class219.field3557 = class247.method1738(false, var3);
            class172.field2831 = var2;
        }
        if (var4 == 6) {
            class236.field3928++;
            boolean var27 = class28.method178(var3, 2, 0, (byte) -6, class286.field4920.field1729[0], 0, class286.field4920.field1773[0], 0, var2, 0, 0, false);
            if (!var27) {
                class28.method178(var3, 2, 0, (byte) -6, class286.field4920.field1729[0], 1, class286.field4920.field1773[0], 0, var2, 0, 1, false);
            }
            class64.field992 = 2;
            class236.field3918 = 0;
            class127.field2088 = class231.field3794;
            class223.field3619 = class149.field2444;
            class234.field3888.method1768(true, 1);
            class234.field3888.method1237(true, var5);
            class234.field3888.method1237(true, class187.field3135 + var3);
            class234.field3888.method1200(class39.field588, 32602);
            class234.field3888.method1196((byte) 78, class197.field3249 + var2);
            class234.field3888.method1217(class27.field362, (byte) -15);
        }
        if (var4 == 45) {
            class148.field2430++;
            class234.field3888.method1768(true, 29);
            class234.field3888.method1238(arg0 + 1871046520, var2);
            class234.field3888.method1217(class27.field362, (byte) -15);
            class234.field3888.method1217(var3, (byte) -15);
            class234.field3888.method1237(true, class39.field588);
        }
        if (var4 == 48) {
            class254.method1772(var3, var6, -106, var2);
            class234.field3888.method1768(true, 146);
            class282.field4864++;
            class234.field3888.method1237(true, class197.field3249 + var2);
            class234.field3888.method1200(class187.field3135 + var3, 32602);
            class234.field3888.method1237(true, Integer.MAX_VALUE & (int) (var6 >>> 32));
        }
        if (var4 == 19) {
            class86.method644(class247.field4119, var2, var3);
        }
        if (var4 == 5) {
            class99.field1589 = true;
            class86.method644(class247.field4119, var2, var3);
        }
        if (var4 == 22) {
            class234.field3888.method1768(true, 226);
            class234.field3888.method1237(true, var5);
            class234.field3888.method1196((byte) 78, var2);
            class193.field3206++;
            class234.field3888.method1207(-125, var3);
            class12.field160 = 0;
            class219.field3557 = class247.method1738(false, var3);
            class172.field2831 = var2;
        }
        if (var4 == 20) {
            class234.field3888.method1768(true, 45);
            class234.field3888.method1200(var5, arg0 + 7754);
            class82.field1285++;
            class234.field3888.method1237(true, var2);
            class234.field3888.method1207(arg0 - 24937, var3);
            class12.field160 = 0;
            class219.field3557 = class247.method1738(false, var3);
            class172.field2831 = var2;
        }
        if (var4 == 30) {
            class263 var29 = class297.method2067(var3, 53, var2);
            if (var29 != null) {
                class316.method2174(-92);
                class283.method1985(var3, var2, -72, class46.method329(127, client.method278(var29)));
                class11.field138 = 0;
                class249.field4141 = class282.method1981(var29, (byte) 112);
                if (class249.field4141 == null) {
                    class249.field4141 = class292.field4993;
                }
                if (var29.field4542) {
                    class231.field3792 = class233.method1630(new class59[] { var29.field4511, class103.field1707 }, -2883);
                } else {
                    class231.field3792 = class233.method1630(new class59[] { class262.field4371, var29.field4427, class103.field1707 }, -2883);
                }
            }
            return;
        }
        if (var4 == 8) {
            class288.field4956++;
            boolean var30 = class28.method178(var3, 2, 0, (byte) -6, class286.field4920.field1729[0], 0, class286.field4920.field1773[0], 0, var2, 0, 0, false);
            if (!var30) {
                class28.method178(var3, 2, 0, (byte) -6, class286.field4920.field1729[0], 1, class286.field4920.field1773[0], 0, var2, 0, 1, false);
            }
            class236.field3918 = 0;
            class223.field3619 = class149.field2444;
            class127.field2088 = class231.field3794;
            class64.field992 = 2;
            class234.field3888.method1768(true, 222);
            class234.field3888.method1200(var5, 32602);
            class234.field3888.method1238(arg0 ^ 0x6F862998, class187.field3135 + var3);
            class234.field3888.method1237(true, class197.field3249 + var2);
        }
        if (arg0 != 24848) {
            field850 = (class59) null;
        }
        if (var4 == 11) {
            class234.field3888.method1768(true, 74);
            class234.field3888.method1213(-1, var3);
            class234.field3888.method1238(1871071368, var2);
            class62.field960++;
            class234.field3888.method1196((byte) 78, var5);
            class12.field160 = 0;
            class219.field3557 = class247.method1738(false, var3);
            class172.field2831 = var2;
        }
        if (var4 == 23) {
            class64.field974++;
            boolean var32 = class28.method178(var3, 2, 0, (byte) -6, class286.field4920.field1729[0], 0, class286.field4920.field1773[0], 0, var2, 0, 0, false);
            if (!var32) {
                class28.method178(var3, 2, 0, (byte) -6, class286.field4920.field1729[0], 1, class286.field4920.field1773[0], 0, var2, 0, 1, false);
            }
            class236.field3918 = 0;
            class223.field3619 = class149.field2444;
            class127.field2088 = class231.field3794;
            class64.field992 = 2;
            class234.field3888.method1768(true, 76);
            class234.field3888.method1237(true, class187.field3135 + var3);
            class234.field3888.method1200(class197.field3249 + var2, 32602);
            class234.field3888.method1237(true, var5);
        }
        if (var4 == 39) {
            class64.field984++;
            class254.method1772(var3, var6, -102, var2);
            class234.field3888.method1768(true, 218);
            class234.field3888.method1237(true, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class234.field3888.method1238(1871071368, class187.field3135 + var3);
            class234.field3888.method1200(var2 + class197.field3249, arg0 + 7754);
        }
        if (var4 == 35) {
            class124.field2052++;
            class234.field3888.method1768(true, 164);
            class234.field3888.method1213(-1, var3);
            class263 var34 = class247.method1738(false, var3);
            if (var34.field4396 != null && var34.field4396[0][0] == 5) {
                int var35 = var34.field4396[0][1];
                class116.field1915[var35] = 1 - class116.field1915[var35];
                class294.method2027(var35, arg0 ^ 0xFFFF9EE6);
            }
        }
        if (var4 == 31) {
            class102 var36 = class211.field3438[var5];
            if (var36 != null) {
                class190.field3178++;
                class28.method178(var36.field1773[0], 2, 0, (byte) -6, class286.field4920.field1729[0], 1, class286.field4920.field1773[0], 0, var36.field1729[0], 0, 1, false);
                class64.field992 = 2;
                class236.field3918 = 0;
                class223.field3619 = class149.field2444;
                class127.field2088 = class231.field3794;
                class234.field3888.method1768(true, 42);
                class234.field3888.method1238(arg0 ^ 0x6F862998, var5);
            }
        }
        if (var4 == 15) {
            class234.field3888.method1768(true, 193);
            class234.field3888.method1217(var3, (byte) -15);
            class16.field208++;
            class234.field3888.method1238(1871071368, var2);
            class234.field3888.method1238(arg0 + 1871046520, var5);
            class12.field160 = 0;
            class219.field3557 = class247.method1738(false, var3);
            class172.field2831 = var2;
        }
        if (var4 == 58) {
            class130.method960(arg0 - 4815);
        }
        if (var4 == 41) {
            class69.field1067++;
            class254.method1772(var3, var6, 35, var2);
            class234.field3888.method1768(true, 143);
            class234.field3888.method1238(arg0 ^ 0x6F862998, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class234.field3888.method1238(arg0 ^ 0x6F862998, var2 + class197.field3249);
            class234.field3888.method1238(1871071368, class187.field3135 + var3);
        }
        if (var4 == 59) {
            class23 var37 = class23.field311[var5];
            if (var37 != null) {
                class28.method178(var37.field1773[0], 2, 0, (byte) -6, class286.field4920.field1729[0], 1, class286.field4920.field1773[0], 0, var37.field1729[0], 0, 1, false);
                class223.field3619 = class149.field2444;
                class64.field992 = 2;
                class236.field3918 = 0;
                class127.field2088 = class231.field3794;
                class138.field2291++;
                class234.field3888.method1768(true, 147);
                class234.field3888.method1238(arg0 ^ 0x6F862998, class200.field3314);
                class234.field3888.method1213(-1, class167.field2702);
                class234.field3888.method1196((byte) 78, class172.field2835);
                class234.field3888.method1196((byte) 78, var5);
            }
        }
        if (var4 == 40) {
            class102 var38 = class211.field3438[var5];
            if (var38 != null) {
                class239.field3981++;
                class28.method178(var38.field1773[0], 2, 0, (byte) -6, class286.field4920.field1729[0], 1, class286.field4920.field1773[0], 0, var38.field1729[0], 0, 1, false);
                class64.field992 = 2;
                class223.field3619 = class149.field2444;
                class127.field2088 = class231.field3794;
                class236.field3918 = 0;
                class234.field3888.method1768(true, 228);
                class234.field3888.method1217(class167.field2702, (byte) -15);
                class234.field3888.method1196((byte) 78, class200.field3314);
                class234.field3888.method1237(true, class172.field2835);
                class234.field3888.method1237(true, var5);
            }
        }
        if (var4 == 44) {
            class123.field2030++;
            boolean var39 = class28.method178(var3, 2, 0, (byte) -6, class286.field4920.field1729[0], 0, class286.field4920.field1773[0], 0, var2, 0, 0, false);
            if (!var39) {
                class28.method178(var3, 2, 0, (byte) -6, class286.field4920.field1729[0], 1, class286.field4920.field1773[0], 0, var2, 0, 1, false);
            }
            class236.field3918 = 0;
            class127.field2088 = class231.field3794;
            class64.field992 = 2;
            class223.field3619 = class149.field2444;
            class234.field3888.method1768(true, 139);
            class234.field3888.method1200(class200.field3314, arg0 + 7754);
            class234.field3888.method1238(1871071368, class187.field3135 + var3);
            class234.field3888.method1238(arg0 + 1871046520, var5);
            class234.field3888.method1196((byte) 78, class172.field2835);
            class234.field3888.method1196((byte) 78, class197.field3249 + var2);
            class234.field3888.method1211(class167.field2702, (byte) -102);
        }
        if (var4 == 12) {
            class171.field2807++;
            class234.field3888.method1768(true, 111);
            class234.field3888.method1237(true, var2);
            class234.field3888.method1211(var3, (byte) -124);
            class234.field3888.method1196((byte) 78, var5);
            class12.field160 = 0;
            class219.field3557 = class247.method1738(false, var3);
            class172.field2831 = var2;
        }
        if (var4 == 21) {
            class316.method2174(-110);
            class263 var41 = class247.method1738(false, var3);
            class11.field138 = 1;
            class200.field3314 = var5;
            class172.field2835 = var2;
            class167.field2702 = var3;
            class140.method1019(var41, (byte) 110);
            class211.field3464 = class233.method1630(new class59[] { class1.field6, class81.method616(var5, (byte) 25).field699, class103.field1707 }, -2883);
            if (class211.field3464 == null) {
                class211.field3464 = class279.field4773;
            }
            return;
        }
        if (var4 == 16 && class65.field998 == null) {
            class237.method1661(var2, var3, -17);
            class65.field998 = class297.method2067(var3, 97, var2);
            class140.method1019(class65.field998, (byte) 101);
        }
        if (var4 == 33) {
            class201.field3320++;
            class234.field3888.method1768(true, 57);
            class234.field3888.method1237(true, var2);
            class234.field3888.method1213(-1, var3);
            class234.field3888.method1237(true, var5);
            class234.field3888.method1211(class27.field362, (byte) -87);
            class234.field3888.method1237(true, class39.field588);
            class12.field160 = 0;
            class219.field3557 = class247.method1738(false, var3);
            class172.field2831 = var2;
        }
        if (var4 == 38) {
            class23 var42 = class23.field311[var5];
            if (var42 != null) {
                class56.field836++;
                class28.method178(var42.field1773[0], 2, 0, (byte) -6, class286.field4920.field1729[0], 1, class286.field4920.field1773[0], 0, var42.field1729[0], 0, 1, false);
                class236.field3918 = 0;
                class223.field3619 = class149.field2444;
                class64.field992 = 2;
                class127.field2088 = class231.field3794;
                class234.field3888.method1768(true, 58);
                class234.field3888.method1196((byte) 78, var5);
                class234.field3888.method1238(1871071368, class39.field588);
                class234.field3888.method1211(class27.field362, (byte) -89);
            }
        }
        if (var4 == 18) {
            class102 var43 = class211.field3438[var5];
            if (var43 != null) {
                class299.field5121++;
                class28.method178(var43.field1773[0], 2, 0, (byte) -6, class286.field4920.field1729[0], 1, class286.field4920.field1773[0], 0, var43.field1729[0], 0, 1, false);
                class236.field3918 = 0;
                class64.field992 = 2;
                class127.field2088 = class231.field3794;
                class223.field3619 = class149.field2444;
                class234.field3888.method1768(true, 237);
                class234.field3888.method1238(1871071368, var5);
            }
        }
        if (var4 == 26 && class254.method1772(var3, var6, 111, var2)) {
            class1.field17++;
            class234.field3888.method1768(true, 86);
            class234.field3888.method1237(true, class197.field3249 + var2);
            class234.field3888.method1196((byte) 78, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class234.field3888.method1200(class200.field3314, 32602);
            class234.field3888.method1237(true, class172.field2835);
            class234.field3888.method1213(-1, class167.field2702);
            class234.field3888.method1200(class187.field3135 + var3, 32602);
        }
        if (var4 == 1006) {
            class263 var44 = class247.method1738(false, var3);
            if (var44 == null || var44.field4444[var2] < 100000) {
                class234.field3888.method1768(true, 93);
                class234.field3888.method1196((byte) 78, var5);
                class296.field5082++;
            } else {
                class288.method2003(class275.field4742, 0, arg0 - 24966, class233.method1630(new class59[] { class81.method619((byte) -124, var44.field4444[var2]), class148.field2433, class81.method616(var5, (byte) 25).field699 }, arg0 ^ 0xFFFF95AD));
            }
            class12.field160 = 0;
            class219.field3557 = class247.method1738(false, var3);
            class172.field2831 = var2;
        }
        if (var4 == 3) {
            class289.field4960++;
            boolean var45 = class28.method178(var3, 2, 0, (byte) -6, class286.field4920.field1729[0], 0, class286.field4920.field1773[0], 0, var2, 0, 0, false);
            if (!var45) {
                class28.method178(var3, 2, 0, (byte) -6, class286.field4920.field1729[0], 1, class286.field4920.field1773[0], 0, var2, 0, 1, false);
            }
            class64.field992 = 2;
            class127.field2088 = class231.field3794;
            class236.field3918 = 0;
            class223.field3619 = class149.field2444;
            class234.field3888.method1768(true, 190);
            class234.field3888.method1200(class187.field3135 + var3, 32602);
            class234.field3888.method1237(true, var5);
            class234.field3888.method1238(1871071368, class197.field3249 + var2);
        }
        if (var4 == 37) {
            class23 var47 = class23.field311[var5];
            if (var47 != null) {
                class28.method178(var47.field1773[0], 2, 0, (byte) -6, class286.field4920.field1729[0], 1, class286.field4920.field1773[0], 0, var47.field1729[0], 0, 1, false);
                class22.field293++;
                class64.field992 = 2;
                class223.field3619 = class149.field2444;
                class127.field2088 = class231.field3794;
                class236.field3918 = 0;
                class234.field3888.method1768(true, 37);
                class234.field3888.method1196((byte) 78, var5);
            }
        }
        if (var4 == 1003) {
            class276.field4750++;
            class127.field2088 = class231.field3794;
            class223.field3619 = class149.field2444;
            class236.field3918 = 0;
            class64.field992 = 2;
            class234.field3888.method1768(true, 39);
            class234.field3888.method1238(arg0 ^ 0x6F862998, var5);
        }
        if (var4 == 1005) {
            class223.field3619 = class149.field2444;
            class236.field3918 = 0;
            class64.field992 = 2;
            class127.field2088 = class231.field3794;
            class23 var48 = class23.field311[var5];
            if (var48 != null) {
                class119 var49 = var48.field314;
                if (var49.field1958 != null) {
                    var49 = var49.method890(958);
                }
                if (var49 != null) {
                    class234.field3888.method1768(true, 80);
                    class234.field3888.method1238(1871071368, var49.field1983);
                    class97.field1544++;
                }
            }
        }
        if (class11.field138 != 0) {
            class11.field138 = 0;
            class140.method1019(class247.method1738(false, class167.field2702), (byte) -79);
        }
        if (class219.field3556) {
            class316.method2174(arg0 - 24927);
        }
        if (class219.field3557 != null && class12.field160 == 0) {
            class140.method1019(class219.field3557, (byte) -119);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILma;IIIII)V", line = 1046)
    public static final void method449(int arg0, int arg1, class263 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != -18297) {
            method449(76, 19, (class263) null, 74, -97, 42, 126, -88);
        }
        if (class293.field5007) {
            class30.field402 = 32;
        } else {
            class30.field402 = 0;
        }
        class293.field5007 = false;
        field851++;
        if (class59.field910 != 0) {
            if (arg6 <= arg7 && arg6 + 16 > arg7 && arg3 >= arg1 && (arg1 + 16) > arg3) {
                arg2.field4504 -= 4;
                class140.method1019(arg2, (byte) 78);
            } else if (arg7 >= arg6 && arg7 < arg6 + 16 && arg3 >= (arg1 + arg4 - 16) && arg3 < arg1 + arg4) {
                arg2.field4504 += 4;
                class140.method1019(arg2, (byte) -82);
            } else if (arg7 >= arg6 - class30.field402 && arg6 + class30.field402 + 16 > arg7 && (arg1 + 16) <= arg3 && arg3 < (arg1 + arg4 - 16)) {
                int var8 = (arg4 - 32) * arg4 / arg5;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg3 - arg1 - (var8 / 2) - 16;
                int var10 = arg4 - var8 - 32;
                arg2.field4504 = (arg5 - arg4) * var9 / var10;
                class140.method1019(arg2, (byte) 89);
                class293.field5007 = true;
            }
        }
        if (class206.field3368 == 0) {
            return;
        }
        int var11 = arg2.field4420;
        if (arg7 >= (arg6 - var11) && arg3 >= arg1 && arg6 + 16 > arg7 && arg3 <= (arg1 + arg4)) {
            arg2.field4504 += class206.field3368 * 45;
            class140.method1019(arg2, (byte) -126);
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V", line = 1118)
    public class58() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 1129)
    public static void method450(int arg0) {
        field850 = null;
        if (arg0 != 0) {
            method447((short[]) null, 34);
        }
        field847 = null;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(III)V", line = 1162)
    private class58(int arg0, int arg1, int arg2) {
    }
}
