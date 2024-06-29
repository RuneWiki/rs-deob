import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class90 {

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "Lma;")
    public static class5 field1343 = class12.method119(")1", (byte) 123);

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "Z")
    public static boolean field1349 = false;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "[I")
    public static int[] field1345 = new int[128];

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field1350 = 0;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "Lma;")
    public static class5 field1346 = class12.method119(" (X", (byte) 100);

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "[Lrj;")
    public static class237[] field1344;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lci;I)I", line = 33)
    public static final int method590(class177 arg0, int arg1) {
        field1342++;
        if (arg1 != -20990) {
            field1349 = true;
        }
        class288 var2 = arg0.field2699;
        if (var2.field4891 != null) {
            var2 = var2.method1938((byte) 34);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field4866;
        if (arg0.field202 == arg0.field173) {
            var3 = var2.field4907;
        } else if (arg0.field184 == arg0.field173) {
            var3 = var2.field4870;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)I", line = 76)
    public static final int method591(byte arg0) {
        field1340++;
        if (class213.field3393 == 0) {
            return 0;
        } else {
            if (arg0 != -14) {
                method590((class177) null, 71);
            }
            return class101.field1508[class213.field3393].method17();
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 126)
    public static final void method592(int arg0) {
        if (class257.field4404 == null || class195.field3043 == null) {
            class257.field4404 = new int[256];
            class195.field3043 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class257.field4404[var1] = (int) (Math.sin(var2) * 4096.0D);
                class195.field3043[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field1347++;
        if (arg0 != 0) {
            field1346 = (class5) null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V", line = 175)
    public static final void method593(int arg0, int arg1) {
        field1341++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class294.field4963[arg0];
        int var3 = class240.field3989[arg0];
        int var4 = class104.field1554[arg0];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        long var5 = class213.field3392[arg0];
        int var7 = (int) class213.field3392[arg0];
        if (var4 == 16) {
            class155.field2300++;
            class147.field2127.method1389((byte) 104, 245);
            class147.field2127.method1534((byte) -70, var3);
            class147.field2127.method1502(119, var2);
            class147.field2127.method1557(var7, -7351);
            class111.field1648 = 0;
            class264.field4493 = class172.method1140(var3, arg1 + 3);
            class39.field598 = var2;
        }
        if (var4 == 38) {
            class177 var8 = class119.field1804[var7];
            if (var8 != null) {
                class149.method939(0, 0, var8.field175[0], 1, 1, 0, 125, 2, var8.field186[0], false, class151.field2183.field186[0], class151.field2183.field175[0]);
                class33.field507 = class289.field4915;
                class48.field738 = 2;
                class213.field3385 = class104.field1545;
                class40.field604++;
                class98.field1474 = 0;
                class147.field2127.method1389((byte) 123, 126);
                class147.field2127.method1557(var7, -7351);
            }
        }
        if (var4 == 1006) {
            class48.field738 = 2;
            class98.field1474 = 0;
            class213.field3385 = class104.field1545;
            class33.field507 = class289.field4915;
            class177 var9 = class119.field1804[var7];
            if (var9 != null) {
                class288 var10 = var9.field2699;
                if (var10.field4891 != null) {
                    var10 = var10.method1938((byte) 34);
                }
                if (var10 != null) {
                    class138.field2042++;
                    class147.field2127.method1389((byte) -121, 75);
                    class147.field2127.method1526(arg1 ^ 0x68CC, var10.field4887);
                }
            }
        }
        if (var4 == 26) {
            class18.field312++;
            class147.field2127.method1389((byte) -71, 231);
            class147.field2127.method1539(var7, false);
            class147.field2127.method1539(var2, false);
            class147.field2127.method1550(var3, (byte) 97);
            class111.field1648 = 0;
            class264.field4493 = class172.method1140(var3, -118);
            class39.field598 = var2;
        }
        if (var4 == 21) {
            class147.field2127.method1389((byte) 125, 74);
            class72.field1126++;
            class147.field2127.method1513(var3, false);
            class253 var11 = class172.method1140(var3, arg1 + 58);
            if (var11.field4337 != null && var11.field4337[0][0] == 5) {
                int var12 = var11.field4337[0][1];
                class149.field2149[var12] = 1 - class149.field2149[var12];
                class179.method1167(var12, -24523764);
            }
        }
        if (var4 == 41) {
            class284.field4813++;
            class276.method1875(var3, var5, 4160231, var2);
            class147.field2127.method1389((byte) 121, 37);
            class147.field2127.method1557(var3 + class74.field1158, arg1 + -7351);
            class147.field2127.method1526(26828, class193.field3017 + var2);
            class147.field2127.method1557((int) (var5 >>> 32) & Integer.MAX_VALUE, -7351);
        }
        if (var4 == 3) {
            class127.field1904++;
            boolean var13 = class149.method939(0, 0, var2, 0, 0, 0, 126, 2, var3, false, class151.field2183.field186[0], class151.field2183.field175[0]);
            if (!var13) {
                class149.method939(0, 0, var2, 1, 1, 0, 126, 2, var3, false, class151.field2183.field186[0], class151.field2183.field175[0]);
            }
            class48.field738 = 2;
            class98.field1474 = 0;
            class33.field507 = class289.field4915;
            class213.field3385 = class104.field1545;
            class147.field2127.method1389((byte) -18, 222);
            class147.field2127.method1526(26828, class193.field3017 + var2);
            class147.field2127.method1526(26828, var7);
            class147.field2127.method1502(-68, class74.field1158 + var3);
        }
        if (var4 == 9) {
            class177 var15 = class119.field1804[var7];
            if (var15 != null) {
                class57.field901++;
                class149.method939(0, 0, var15.field175[0], 1, 1, 0, 126, 2, var15.field186[0], false, class151.field2183.field186[0], class151.field2183.field175[0]);
                class98.field1474 = 0;
                class33.field507 = class289.field4915;
                class48.field738 = 2;
                class213.field3385 = class104.field1545;
                class147.field2127.method1389((byte) 102, 160);
                class147.field2127.method1502(-8, var7);
            }
        }
        if (var4 == 1001) {
            class253 var16 = class172.method1140(var3, -119);
            if (var16 == null || var16.field4317[var2] < 100000) {
                class192.field2989++;
                class147.field2127.method1389((byte) 11, 181);
                class147.field2127.method1539(var7, false);
            } else {
                class69.method497(24077, class250.field4145, 0, class288.method1940((byte) 82, new class5[] { class175.method1148(var16.field4317[var2], false), class249.field4129, class235.method1664(arg1 ^ 0x5E, var7).field3062 }));
            }
            class111.field1648 = 0;
            class264.field4493 = class172.method1140(var3, arg1 + 36);
            class39.field598 = var2;
        }
        if (var4 == 36) {
            class147.field2127.method1389((byte) -3, 194);
            class147.field2127.method1519(var3, 1948485776);
            class198.field3153++;
            class147.field2127.method1539(var2, false);
            class147.field2127.method1539(var7, false);
            class111.field1648 = 0;
            class264.field4493 = class172.method1140(var3, 62);
            class39.field598 = var2;
        }
        if (var4 == 49 && class73.field1145 == null) {
            class240.method1699(var2, 0, var3);
            class73.field1145 = class282.method1911(var3, var2, -16037);
            class29.method205(class73.field1145, (byte) 123);
        }
        if (var4 == 57) {
            class275.field4684++;
            boolean var17 = class149.method939(0, 0, var2, 0, 0, 0, 123, 2, var3, false, class151.field2183.field186[0], class151.field2183.field175[0]);
            if (!var17) {
                class149.method939(0, 0, var2, 1, 1, 0, 127, 2, var3, false, class151.field2183.field186[0], class151.field2183.field175[0]);
            }
            class48.field738 = 2;
            class33.field507 = class289.field4915;
            class213.field3385 = class104.field1545;
            class98.field1474 = 0;
            class147.field2127.method1389((byte) 110, 33);
            class147.field2127.method1502(arg1 ^ 0xFFFFFFBE, var7);
            class147.field2127.method1526(26828, class193.field3017 + var2);
            class147.field2127.method1502(115, class74.field1158 + var3);
        }
        if (var4 == 47) {
            class46.method349(class276.field4701, var2, var3);
        }
        if (var4 == 1007) {
            class192.field2989++;
            class98.field1474 = 0;
            class33.field507 = class289.field4915;
            class213.field3385 = class104.field1545;
            class48.field738 = 2;
            class147.field2127.method1389((byte) 122, 181);
            class147.field2127.method1539(var7, false);
        }
        if (var4 == 1004) {
            class276.method1875(var3, var5, 4160231, var2);
            class147.field2127.method1389((byte) -100, 57);
            class147.field2127.method1557(class193.field3017 + var2, arg1 ^ 0xFFFFE349);
            class80.field1245++;
            class147.field2127.method1557(class74.field1158 + var3, -7351);
            class147.field2127.method1526(26828, (int) (var5 >>> 32) & Integer.MAX_VALUE);
        }
        if (var4 == 31) {
            class91 var19 = class267.field4593[var7];
            if (var19 != null) {
                class149.method939(0, 0, var19.field175[0], 1, 1, 0, 124, 2, var19.field186[0], false, class151.field2183.field186[0], class151.field2183.field175[0]);
                class33.field507 = class289.field4915;
                class98.field1474 = 0;
                class255.field4359++;
                class213.field3385 = class104.field1545;
                class48.field738 = 2;
                class147.field2127.method1389((byte) -12, 99);
                class147.field2127.method1539(var7, false);
            }
        }
        if (var4 == 15) {
            class177 var20 = class119.field1804[var7];
            if (var20 != null) {
                class153.field2241++;
                class149.method939(0, 0, var20.field175[0], 1, 1, 0, 123, 2, var20.field186[0], false, class151.field2183.field186[0], class151.field2183.field175[0]);
                class48.field738 = 2;
                class98.field1474 = 0;
                class213.field3385 = class104.field1545;
                class33.field507 = class289.field4915;
                class147.field2127.method1389((byte) 101, 237);
                class147.field2127.method1539(var7, false);
                class147.field2127.method1526(26828, class218.field3528);
                class147.field2127.method1519(class114.field1698, arg1 ^ 0x74238890);
            }
        }
        if (var4 == 22) {
            class91 var21 = class267.field4593[var7];
            if (var21 != null) {
                class252.field4170++;
                class149.method939(0, 0, var21.field175[0], 1, 1, 0, arg1 ^ 0x7D, 2, var21.field186[0], false, class151.field2183.field186[0], class151.field2183.field175[0]);
                class98.field1474 = 0;
                class213.field3385 = class104.field1545;
                class33.field507 = class289.field4915;
                class48.field738 = 2;
                class147.field2127.method1389((byte) 114, 243);
                class147.field2127.method1557(var7, -7351);
            }
        }
        if (var4 == 5 && class276.method1875(var3, var5, 4160231, var2)) {
            class13.field243++;
            class147.field2127.method1389((byte) 103, 82);
            class147.field2127.method1557(class193.field3017 + var2, -7351);
            class147.field2127.method1526(26828, class74.field1158 + var3);
            class147.field2127.method1526(arg1 ^ 0x68CC, class39.field602);
            class147.field2127.method1534((byte) -70, class85.field1289);
            class147.field2127.method1526(26828, Integer.MAX_VALUE & (int) (var5 >>> 32));
            class147.field2127.method1557(class20.field333, -7351);
        }
        if (var4 == 46) {
            class189.field2957++;
            boolean var22 = class149.method939(0, 0, var2, 0, 0, 0, arg1 + 125, 2, var3, false, class151.field2183.field186[0], class151.field2183.field175[0]);
            if (!var22) {
                class149.method939(0, 0, var2, 1, 1, 0, arg1 + 126, 2, var3, false, class151.field2183.field186[0], class151.field2183.field175[0]);
            }
            class98.field1474 = 0;
            class33.field507 = class289.field4915;
            class48.field738 = 2;
            class213.field3385 = class104.field1545;
            class147.field2127.method1389((byte) 96, 4);
            class147.field2127.method1539(var7, false);
            class147.field2127.method1539(class193.field3017 + var2, false);
            class147.field2127.method1557(class74.field1158 + var3, -7351);
        }
        if (var4 == 14) {
            class8.field127++;
            class147.field2127.method1389((byte) -35, 106);
            class147.field2127.method1550(class85.field1289, (byte) 97);
            class147.field2127.method1539(class39.field602, false);
            class147.field2127.method1526(26828, class20.field333);
            class147.field2127.method1526(26828, var2);
            class147.field2127.method1539(var7, false);
            class147.field2127.method1534((byte) -70, var3);
            class111.field1648 = 0;
            class264.field4493 = class172.method1140(var3, -119);
            class39.field598 = var2;
        }
        if (var4 == 43) {
            class244.field4049++;
            class147.field2127.method1389((byte) -3, 22);
            class147.field2127.method1557(class218.field3528, arg1 ^ 0xFFFFE349);
            class147.field2127.method1526(26828, var2);
            class147.field2127.method1513(class114.field1698, false);
            class147.field2127.method1513(var3, false);
        }
        if (var4 == 7 && class276.method1875(var3, var5, 4160231, var2)) {
            class201.field3194++;
            class147.field2127.method1389((byte) -37, 148);
            class147.field2127.method1539(class218.field3528, false);
            class147.field2127.method1557((int) (var5 >>> 32) & Integer.MAX_VALUE, -7351);
            class147.field2127.method1502(-118, class193.field3017 + var2);
            class147.field2127.method1526(26828, class74.field1158 + var3);
            class147.field2127.method1550(class114.field1698, (byte) 97);
        }
        if (var4 == 39) {
            class147.field2127.method1389((byte) -18, 1);
            class147.field2127.method1557(var2, -7351);
            class147.field2127.method1539(var7, false);
            class147.field2127.method1550(var3, (byte) 97);
            class111.field1648 = 0;
            class264.field4493 = class172.method1140(var3, -127);
            class39.field598 = var2;
            class240.field3979++;
        }
        if (var4 == 32) {
            class91 var24 = class267.field4593[var7];
            if (var24 != null) {
                class149.method939(0, 0, var24.field175[0], 1, 1, 0, 123, 2, var24.field186[0], false, class151.field2183.field186[0], class151.field2183.field175[0]);
                class33.field507 = class289.field4915;
                class114.field1709++;
                class213.field3385 = class104.field1545;
                class98.field1474 = 0;
                class48.field738 = 2;
                class147.field2127.method1389((byte) -116, 31);
                class147.field2127.method1526(arg1 + 26828, var7);
            }
        }
        if (var4 == 37) {
            class147.field2127.method1389((byte) 122, 165);
            class93.field1415++;
            class147.field2127.method1513(var3, false);
            class147.field2127.method1557(var7, -7351);
            class147.field2127.method1502(-58, var2);
            class111.field1648 = 0;
            class264.field4493 = class172.method1140(var3, 67);
            class39.field598 = var2;
        }
        if (var4 == 11) {
            class91 var25 = class267.field4593[var7];
            if (var25 != null) {
                class149.method939(0, 0, var25.field175[0], 1, 1, 0, 123, 2, var25.field186[0], false, class151.field2183.field186[0], class151.field2183.field175[0]);
                class48.field738 = 2;
                class33.field507 = class289.field4915;
                class213.field3385 = class104.field1545;
                class98.field1474 = 0;
                class261.field4457++;
                class147.field2127.method1389((byte) -43, 3);
                class147.field2127.method1557(var7, arg1 - 7351);
            }
        }
        if (var4 == 17) {
            class145.field2102++;
            class147.field2127.method1389((byte) 125, 178);
            class147.field2127.method1526(26828, var7);
            class147.field2127.method1534((byte) -70, var3);
            class147.field2127.method1526(arg1 ^ 0x68CC, var2);
            class111.field1648 = 0;
            class264.field4493 = class172.method1140(var3, 89);
            class39.field598 = var2;
        }
        if (var4 == 45) {
            class147.field2127.method1389((byte) 95, 39);
            class147.field2127.method1557(var7, -7351);
            class147.field2127.method1534((byte) -70, var3);
            class147.field2127.method1526(arg1 + 26828, var2);
            class111.field1648 = 0;
            class264.field4493 = class172.method1140(var3, -114);
            class39.field598 = var2;
            class153.field2247++;
        }
        if (var4 == 8) {
            class276.method1875(var3, var5, 4160231, var2);
            class235.field3874++;
            class147.field2127.method1389((byte) -40, 109);
            class147.field2127.method1557((int) (var5 >>> 32) & Integer.MAX_VALUE, arg1 ^ 0xFFFFE349);
            class147.field2127.method1502(-34, var2 + class193.field3017);
            class147.field2127.method1557(class74.field1158 + var3, -7351);
        }
        if (var4 == 25) {
            class91 var26 = class267.field4593[var7];
            if (var26 != null) {
                class2.field22++;
                class149.method939(0, 0, var26.field175[0], 1, 1, 0, 123, 2, var26.field186[0], false, class151.field2183.field186[0], class151.field2183.field175[0]);
                class213.field3385 = class104.field1545;
                class48.field738 = 2;
                class98.field1474 = 0;
                class33.field507 = class289.field4915;
                class147.field2127.method1389((byte) -86, 55);
                class147.field2127.method1539(var7, false);
            }
        }
        if (var4 == 33) {
            class147.field2127.method1389((byte) -25, 68);
            class282.field4770++;
            class147.field2127.method1513(var3, false);
            class147.field2127.method1526(26828, var2);
            class147.field2127.method1557(var7, -7351);
            class111.field1648 = 0;
            class264.field4493 = class172.method1140(var3, arg1 ^ 0x36);
            class39.field598 = var2;
        }
        if (var4 == 19) {
            class177 var27 = class119.field1804[var7];
            if (var27 != null) {
                class13.field252++;
                class149.method939(0, 0, var27.field175[0], 1, 1, 0, 123, 2, var27.field186[0], false, class151.field2183.field186[0], class151.field2183.field175[0]);
                class33.field507 = class289.field4915;
                class98.field1474 = 0;
                class213.field3385 = class104.field1545;
                class48.field738 = 2;
                class147.field2127.method1389((byte) 95, 104);
                class147.field2127.method1539(var7, false);
            }
        }
        if (var4 == 1) {
            class141.field2073++;
            class147.field2127.method1389((byte) -65, 96);
            class147.field2127.method1526(arg1 + 26828, var7);
            class147.field2127.method1519(var3, arg1 + 1948485776);
            class147.field2127.method1526(26828, var2);
            class111.field1648 = 0;
            class264.field4493 = class172.method1140(var3, -112);
            class39.field598 = var2;
        }
        if (var4 == 29) {
            class78.field1214++;
            class276.method1875(var3, var5, 4160231, var2);
            class147.field2127.method1389((byte) 112, 93);
            class147.field2127.method1526(26828, class193.field3017 + var2);
            class147.field2127.method1557(class74.field1158 + var3, -7351);
            class147.field2127.method1539(Integer.MAX_VALUE & (int) (var5 >>> 32), false);
        }
        if (var4 == 40) {
            class157.field2346++;
            boolean var28 = class149.method939(0, 0, var2, 0, 0, 0, arg1 + 124, 2, var3, false, class151.field2183.field186[0], class151.field2183.field175[0]);
            if (!var28) {
                class149.method939(0, 0, var2, 1, 1, 0, 124, 2, var3, false, class151.field2183.field186[0], class151.field2183.field175[0]);
            }
            class213.field3385 = class104.field1545;
            class33.field507 = class289.field4915;
            class98.field1474 = 0;
            class48.field738 = 2;
            class147.field2127.method1389((byte) 123, 246);
            class147.field2127.method1502(106, var7);
            class147.field2127.method1502(arg1 ^ 0x74, class193.field3017 + var2);
            class147.field2127.method1539(var3 + class74.field1158, false);
        }
        if (var4 == 24) {
            class104.method661(117);
            class253 var30 = class172.method1140(var3, 39);
            class85.field1289 = var3;
            class20.field333 = var2;
            class39.field602 = var7;
            class96.field1431 = 1;
            class29.method205(var30, (byte) 86);
            class59.field922 = class288.method1940((byte) 119, new class5[] { class181.field2768, class235.method1664(arg1 ^ 0x5E, var7).field3062, class197.field3135 });
            if (class59.field922 == null) {
                class59.field922 = class81.field1265;
            }
            return;
        }
        if (var4 == 51) {
            boolean var31 = class149.method939(0, 0, var2, 0, 0, 0, 127, 2, var3, false, class151.field2183.field186[0], class151.field2183.field175[0]);
            class91.field1363++;
            if (!var31) {
                class149.method939(0, 0, var2, 1, 1, 0, arg1 ^ 0x7D, 2, var3, false, class151.field2183.field186[0], class151.field2183.field175[0]);
            }
            class213.field3385 = class104.field1545;
            class98.field1474 = 0;
            class33.field507 = class289.field4915;
            class48.field738 = 2;
            class147.field2127.method1389((byte) -42, 234);
            class147.field2127.method1502(-67, class218.field3528);
            class147.field2127.method1502(arg1 ^ 0x78, var3 + class74.field1158);
            class147.field2127.method1519(class114.field1698, 1948485776);
            class147.field2127.method1526(26828, class193.field3017 + var2);
            class147.field2127.method1557(var7, -7351);
        }
        if (var4 == 12) {
            class276.method1875(var3, var5, 4160231, var2);
            class98.field1467++;
            class147.field2127.method1389((byte) 114, 199);
            class147.field2127.method1539((int) (var5 >>> 32) & Integer.MAX_VALUE, false);
            class147.field2127.method1502(arg1 + 119, var3 - -class74.field1158);
            class147.field2127.method1502(-93, class193.field3017 + var2);
        }
        if (var4 == 28) {
            class91 var33 = class267.field4593[var7];
            if (var33 != null) {
                class290.field4922++;
                class149.method939(0, 0, var33.field175[0], 1, 1, 0, 126, 2, var33.field186[0], false, class151.field2183.field186[0], class151.field2183.field175[0]);
                class48.field738 = 2;
                class213.field3385 = class104.field1545;
                class33.field507 = class289.field4915;
                class98.field1474 = 0;
                class147.field2127.method1389((byte) 119, 34);
                class147.field2127.method1550(class114.field1698, (byte) 97);
                class147.field2127.method1557(var7, -7351);
                class147.field2127.method1539(class218.field3528, false);
            }
        }
        if (var4 == 2) {
            class253 var34 = class282.method1911(var3, var2, -16037);
            if (var34 != null) {
                class104.method661(99);
                class29.method211(var2, var3, class8.method89(71, client.method767(var34)), (byte) -89);
                class96.field1431 = 0;
                class23.field405 = class170.method1128(109, var34);
                if (class23.field405 == null) {
                    class23.field405 = class135.field1992;
                }
                if (var34.field4265) {
                    class110.field1634 = class288.method1940((byte) 68, new class5[] { var34.field4225, class197.field3135 });
                } else {
                    class110.field1634 = class288.method1940((byte) 125, new class5[] { class105.field1558, var34.field4200, class197.field3135 });
                }
            }
            return;
        }
        if (var4 == 6) {
            class91 var35 = class267.field4593[var7];
            if (var35 != null) {
                class261.field4454++;
                class149.method939(0, 0, var35.field175[0], 1, 1, 0, 123, 2, var35.field186[0], false, class151.field2183.field186[0], class151.field2183.field175[0]);
                class33.field507 = class289.field4915;
                class98.field1474 = 0;
                class213.field3385 = class104.field1545;
                class48.field738 = 2;
                class147.field2127.method1389((byte) -70, 51);
                class147.field2127.method1502(arg1 ^ 0x74, var7);
            }
        }
        if (var4 == 58) {
            class91 var36 = class267.field4593[var7];
            if (var36 != null) {
                class117.field1776++;
                class149.method939(0, 0, var36.field175[0], 1, 1, 0, 126, 2, var36.field186[0], false, class151.field2183.field186[0], class151.field2183.field175[0]);
                class48.field738 = 2;
                class33.field507 = class289.field4915;
                class213.field3385 = class104.field1545;
                class98.field1474 = 0;
                class147.field2127.method1389((byte) 125, 59);
                class147.field2127.method1526(26828, var7);
            }
        }
        if (var4 == 44) {
            class177 var37 = class119.field1804[var7];
            if (var37 != null) {
                class149.method939(0, 0, var37.field175[0], 1, 1, 0, arg1 ^ 0x7C, 2, var37.field186[0], false, class151.field2183.field186[0], class151.field2183.field175[0]);
                class33.field507 = class289.field4915;
                class98.field1474 = 0;
                class48.field738 = 2;
                class198.field3164++;
                class213.field3385 = class104.field1545;
                class147.field2127.method1389((byte) 104, 184);
                class147.field2127.method1539(var7, false);
            }
        }
        if (var4 == 1002) {
            class170.field2616++;
            class213.field3385 = class104.field1545;
            class33.field507 = class289.field4915;
            class48.field738 = 2;
            class98.field1474 = 0;
            class147.field2127.method1389((byte) 103, 107);
            class147.field2127.method1557(var7, arg1 ^ 0xFFFFE349);
        }
        if (var4 == 18) {
            class91 var38 = class267.field4593[var7];
            if (var38 != null) {
                class149.method939(0, 0, var38.field175[0], 1, 1, 0, 123, 2, var38.field186[0], false, class151.field2183.field186[0], class151.field2183.field175[0]);
                class48.field738 = 2;
                class213.field3385 = class104.field1545;
                class98.field1474 = 0;
                class14.field260++;
                class33.field507 = class289.field4915;
                class147.field2127.method1389((byte) 127, 188);
                class147.field2127.method1557(var7, arg1 - 7351);
            }
        }
        if (var4 == 30) {
            class177 var39 = class119.field1804[var7];
            if (var39 != null) {
                class133.field1979++;
                class149.method939(0, 0, var39.field175[0], 1, 1, 0, arg1 ^ 0x7D, 2, var39.field186[0], false, class151.field2183.field186[0], class151.field2183.field175[0]);
                class98.field1474 = 0;
                class213.field3385 = class104.field1545;
                class33.field507 = class289.field4915;
                class48.field738 = 2;
                class147.field2127.method1389((byte) 124, 244);
                class147.field2127.method1539(class39.field602, false);
                class147.field2127.method1539(class20.field333, false);
                class147.field2127.method1502(arg1 ^ 0x7E, var7);
                class147.field2127.method1513(class85.field1289, false);
            }
        }
        if (var4 == 13) {
            boolean var40 = class149.method939(0, 0, var2, 0, 0, 0, 127, 2, var3, false, class151.field2183.field186[0], class151.field2183.field175[0]);
            if (!var40) {
                class149.method939(0, 0, var2, 1, 1, 0, 124, 2, var3, false, class151.field2183.field186[0], class151.field2183.field175[0]);
            }
            class33.field507 = class289.field4915;
            class170.field2612++;
            class98.field1474 = 0;
            class213.field3385 = class104.field1545;
            class48.field738 = 2;
            class147.field2127.method1389((byte) 110, 225);
            class147.field2127.method1502(-88, class193.field3017 + var2);
            class147.field2127.method1539(class39.field602, false);
            class147.field2127.method1550(class85.field1289, (byte) 97);
            class147.field2127.method1539(class20.field333, false);
            class147.field2127.method1502(arg1 ^ 0x68, class74.field1158 + var3);
            class147.field2127.method1557(var7, -7351);
        }
        if (var4 == 42) {
            boolean var42 = class149.method939(0, 0, var2, 0, 0, 0, arg1 + 123, 2, var3, false, class151.field2183.field186[0], class151.field2183.field175[0]);
            class133.field1970++;
            if (!var42) {
                class149.method939(0, 0, var2, 1, 1, 0, arg1 ^ 0x7B, 2, var3, false, class151.field2183.field186[0], class151.field2183.field175[0]);
            }
            class98.field1474 = 0;
            class48.field738 = 2;
            class33.field507 = class289.field4915;
            class213.field3385 = class104.field1545;
            class147.field2127.method1389((byte) 0, 211);
            class147.field2127.method1557(class193.field3017 + var2, arg1 + -7351);
            class147.field2127.method1539(class74.field1158 + var3, false);
            class147.field2127.method1539(var7, false);
        }
        if (var4 == 10) {
            class147.field2127.method1389((byte) 111, 74);
            class72.field1126++;
            class147.field2127.method1513(var3, false);
            class253 var44 = class172.method1140(var3, 108);
            if (var44.field4337 != null && var44.field4337[0][0] == 5) {
                int var45 = var44.field4337[0][1];
                if (class149.field2149[var45] != var44.field4291[0]) {
                    class149.field2149[var45] = var44.field4291[0];
                    class179.method1167(var45, -24523764);
                }
            }
        }
        if (var4 == 35) {
            class253 var46 = class172.method1140(var3, arg1 ^ 0x76);
            boolean var47 = true;
            if (var46.field4238 > 0) {
                var47 = class252.method1762((byte) -65, var46);
            }
            if (var47) {
                class147.field2127.method1389((byte) -100, 74);
                class147.field2127.method1513(var3, false);
                class72.field1126++;
            }
        }
        if (var4 == 4) {
            class91 var48 = class267.field4593[var7];
            if (var48 != null) {
                class149.method939(0, 0, var48.field175[0], 1, 1, 0, 126, 2, var48.field186[0], false, class151.field2183.field186[0], class151.field2183.field175[0]);
                class98.field1474 = 0;
                client.field1748++;
                class213.field3385 = class104.field1545;
                class48.field738 = 2;
                class33.field507 = class289.field4915;
                class147.field2127.method1389((byte) -78, 239);
                class147.field2127.method1557(class39.field602, -7351);
                class147.field2127.method1526(arg1 ^ 0x68CC, var7);
                class147.field2127.method1526(26828, class20.field333);
                class147.field2127.method1550(class85.field1289, (byte) 97);
            }
        }
        if (var4 == 50 || var4 == 1005) {
            class287.method1932(class20.field344[arg0], (byte) -97, var2, var7, var3);
        }
        if (var4 == 48) {
            class46.field695++;
            class147.field2127.method1389((byte) 103, 156);
            class147.field2127.method1557(var2, -7351);
            class147.field2127.method1539(var7, false);
            class147.field2127.method1534((byte) -70, var3);
            class111.field1648 = 0;
            class264.field4493 = class172.method1140(var3, 127);
            class39.field598 = var2;
        }
        if (var4 == 34) {
            class147.field2127.method1389((byte) -10, 255);
            class234.field3873++;
            class147.field2127.method1539(class218.field3528, false);
            class147.field2127.method1534((byte) -70, class114.field1698);
            class147.field2127.method1539(var2, false);
            class147.field2127.method1502(109, var7);
            class147.field2127.method1519(var3, 1948485776);
            class111.field1648 = 0;
            class264.field4493 = class172.method1140(var3, 47);
            class39.field598 = var2;
        }
        if (var4 == 23) {
            class281.method1905(-54);
        }
        if (var4 == 20) {
            class177 var49 = class119.field1804[var7];
            if (var49 != null) {
                class219.field3532++;
                class149.method939(0, 0, var49.field175[0], 1, 1, 0, 123, 2, var49.field186[0], false, class151.field2183.field186[0], class151.field2183.field175[0]);
                class33.field507 = class289.field4915;
                class48.field738 = 2;
                class98.field1474 = 0;
                class213.field3385 = class104.field1545;
                class147.field2127.method1389((byte) 107, 176);
                class147.field2127.method1502(113, var7);
            }
        }
        if (class96.field1431 != 0) {
            class96.field1431 = 0;
            class29.method205(class172.method1140(class85.field1289, -119), (byte) 127);
        }
        if (arg1 != 0) {
            field1343 = (class5) null;
        }
        if (class265.field4539) {
            class104.method661(117);
        }
        if (class264.field4493 != null && class111.field1648 == 0) {
            class29.method205(class264.field4493, (byte) 104);
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V", line = 1197)
    public static void method594(byte arg0) {
        field1346 = null;
        field1343 = null;
        if (arg0 >= -108) {
            method591((byte) 27);
        }
        field1345 = null;
        field1344 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIILki;I)V", line = 1236)
    public static final void method595(int arg0, int arg1, int arg2, class288 arg3, int arg4) {
        field1348++;
        if (class282.field4794 >= 400) {
            return;
        }
        if (arg3.field4891 != null) {
            arg3 = arg3.method1938((byte) 34);
        }
        if (arg3 == null || !arg3.field4879) {
            return;
        }
        class5 var5 = arg3.field4884;
        if (arg3.field4909 != 0) {
            var5 = class288.method1940((byte) 92, new class5[] { var5, class47.method353(arg3.field4909, class151.field2183.field1380, true), field1346, class275.field4691, class175.method1148(arg3.field4909, false), class141.field2074 });
        }
        int var6 = 123 / ((arg4 - 47) / 63);
        if (class96.field1431 == 1) {
            class137.method890(arg1, class288.method1940((byte) 63, new class5[] { class59.field922, class186.field2932, var5 }), 29639, class274.field4669, arg0, (short) 30, (long) arg2);
            class286.field4818++;
        } else if (!class265.field4539) {
            class5[] var7 = arg3.field4854;
            class232.field3854++;
            if (class177.field2696) {
                var7 = class13.method127((byte) -127, var7);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class275.field4690 != 0 || !var7[var8].method29(61, class69.field1099))) {
                        class257.field4391++;
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 44;
                        }
                        if (var8 == 1) {
                            var9 = 38;
                        }
                        if (var8 == 2) {
                            var9 = 19;
                        }
                        if (var8 == 3) {
                            var9 = 20;
                        }
                        if (var8 == 4) {
                            var9 = 9;
                        }
                        class137.method890(arg1, class288.method1940((byte) 94, new class5[] { class230.field3827, var5 }), 29639, var7[var8], arg0, var9, (long) arg2);
                    }
                }
            }
            if (class275.field4690 == 0 && var7 != null) {
                for (int var10 = 4; var10 >= 0; var10--) {
                    if (var7[var10] != null && var7[var10].method29(61, class69.field1099)) {
                        class46.field699++;
                        short var11 = 0;
                        short var12 = 0;
                        if (arg3.field4909 > class151.field2183.field1380) {
                            var11 = 2000;
                        }
                        if (var10 == 0) {
                            var12 = 44;
                        }
                        if (var10 == 1) {
                            var12 = 38;
                        }
                        if (var10 == 2) {
                            var12 = 19;
                        }
                        if (var10 == 3) {
                            var12 = 20;
                        }
                        if (var10 == 4) {
                            var12 = 9;
                        }
                        if (var12 != 0) {
                            var12 += var11;
                        }
                        class137.method890(arg1, class288.method1940((byte) 100, new class5[] { class230.field3827, var5 }), 29639, var7[var10], arg0, var12, (long) arg2);
                    }
                }
            }
            class137.method890(arg1, class288.method1940((byte) 67, new class5[] { class230.field3827, var5 }), 29639, class158.field2393, arg0, (short) 1006, (long) arg2);
        } else if ((class157.field2347 & 0x2) == 2) {
            class137.method890(arg1, class288.method1940((byte) 102, new class5[] { class110.field1634, class186.field2932, var5 }), 29639, class23.field405, arg0, (short) 15, (long) arg2);
            class296.field4983++;
        }
    }
}
