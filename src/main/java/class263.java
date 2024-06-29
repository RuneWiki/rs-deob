import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class263 {

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "Lok;")
    public static class146 field4373 = class235.method1724(-12908, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "Loh;")
    public static class15 field4371;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V", line = 6)
    public static final void method1899(boolean arg0) {
        if (arg0) {
            field4373 = (class146) null;
        }
        for (int var1 = 0; var1 < class182.field3045; var1++) {
            int var2 = class228.field3809[var1];
            class282 var3 = class173.field2906[var2];
            int var4 = client.field4080.method368(96);
            if ((var4 & 0x4) != 0) {
                int var5 = client.field4080.method357((byte) -66);
                int var6 = client.field4080.method368(-107);
                var3.method2214(var5, class203.field3385, var6, (byte) 37);
                var3.field5410 = class203.field3385 + 300;
                var3.field5376 = client.field4080.method341((byte) -89);
            }
            if ((var4 & 0x10) != 0) {
                int var7 = client.field4080.method336(-2);
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = client.field4080.method366(true);
                boolean var9 = true;
                if (var7 != -1 && var3.field5441 != -1 && class306.method2156(125, class73.method540((byte) -125, var7).field2329).field4907 < class306.method2156(122, class73.method540((byte) 3, var3.field5441).field2329).field4907) {
                    var9 = false;
                }
                if (var9) {
                    var3.field5371 = var8 >> 16;
                    var3.field5387 = 0;
                    var3.field5423 = class203.field3385 + (var8 & 0xFFFF);
                    if (class203.field3385 < var3.field5423) {
                        var3.field5387 = -1;
                    }
                    var3.field5441 = var7;
                    var3.field5399 = 0;
                    if (var3.field5441 != -1 && class203.field3385 == var3.field5423) {
                        int var10 = class73.method540((byte) 89, var3.field5441).field2329;
                        if (var10 != -1) {
                            class287 var11 = class306.method2156(119, var10);
                            if (var11 != null && var11.field4904 != null) {
                                class11.method70(false, false, var11, var3.field5409, 0, var3.field5380);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field5445 = client.field4080.method337(-1);
                var3.field5411 = 100;
            }
            if ((var4 & 0x80) != 0) {
                var3.field5428 = client.field4080.method360(-1);
                if (var3.field5428 == 65535) {
                    var3.field5428 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field5400 = client.field4080.method336(-2);
                var3.field5383 = client.field4080.method379(-2);
            }
            if ((var4 & 0x1) != 0) {
                int var12 = client.field4080.method357((byte) -66);
                int var13 = client.field4080.method357((byte) -66);
                var3.method2214(var12, class203.field3385, var13, (byte) 90);
            }
            if ((var4 & 0x8) != 0) {
                if (var3.field4838.method2128(-1)) {
                    class207.method1567(57, var3);
                }
                var3.method2044(class218.method1610(client.field4080.method360(-1), (byte) -33), (byte) 104);
                var3.method2216(var3.field4838.field5150, 101);
                var3.field5389 = var3.field4838.field5097;
                var3.field5433 = var3.field4838.field5108;
                var3.field5384 = var3.field4838.field5104;
                var3.field5381 = var3.field4838.field5107;
                var3.field5398 = var3.field4838.field5105;
                var3.field5372 = var3.field4838.field5118;
                var3.field5370 = var3.field4838.field5132;
                var3.field5418 = var3.field4838.field5139;
                if (var3.field4838.method2128(-1)) {
                    class62.method473(var3, class203.field3387, 0, var3.field5419[0], 0, var3.field5432[0], (class5) null, (class234) null);
                }
            }
            if ((var4 & 0x40) != 0) {
                int var14 = client.field4080.method379(-2);
                int var15 = client.field4080.method346((byte) -1);
                if (var14 == 65535) {
                    var14 = -1;
                }
                class148.method1141(-419, var15, var3, var14);
            }
        }
        field4368++;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB)Lwk;", line = 162)
    public static final class169 method1900(int arg0, byte arg1) {
        field4369++;
        if (arg1 != -68) {
            field4371 = (class15) null;
        }
        class169 var2 = (class169) class144.field2393.method1511((long) arg0, 76);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class238.field3977.method92(class124.method853(arg0, (byte) -22), 0, class212.method1590(arg0, -16499));
        class169 var4 = new class169();
        if (var3 != null) {
            var4.method1312(new class47(var3), 111);
        }
        class144.field2393.method1509((long) arg0, 72, var4);
        return var4;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V", line = 185)
    public static void method1901(int arg0) {
        field4373 = null;
        field4371 = null;
        if (arg0 < 37) {
            field4374 = 117;
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V", line = 209)
    public static final void method1902(int arg0) {
        field4370++;
        class177.field3004 = -1;
        class47.field820.field857 = 0;
        class166.field2802 = 0;
        client.field4080.field857 = 0;
        class57.field1012 = 0;
        class268.field4616 = -1;
        class37.field682 = -1;
        class295.field4998 = false;
        class46.field781 = 0;
        class230.field3854 = 0;
        class99.field1603 = 0;
        class199.field3331 = -1;
        class45.field763 = 0;
        if (arg0 <= 15) {
            method1899(false);
        }
        for (int var1 = 0; var1 < class75.field1215.length; var1++) {
            if (class75.field1215[var1] != null) {
                class75.field1215[var1].field5428 = -1;
            }
        }
        for (int var2 = 0; var2 < class173.field2906.length; var2++) {
            if (class173.field2906[var2] != null) {
                class173.field2906[var2].field5428 = -1;
            }
        }
        class235.method1723((byte) -125);
        class302.field5172 = 1;
        class1.method4(-41, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class14.field264[var3] = true;
        }
        class93.method644(0);
    }
}
