import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class173 extends class317 {

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "I")
    private int field2361;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "Lkm;")
    public static class133 field2349;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "Lfj;")
    public static class241 field2356;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 12)
    public static final String method1207(String arg0, byte arg1) {
        int var2 = -78 % ((25 - arg1) / 35);
        field2350++;
        int var3 = class336.method2326(arg0, -1);
        return var3 == -1 ? "" : class170.method1199(true, " ", class132.field1811.field2390[var3], "<br>");
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(B)V", line = 27)
    public static final void method1208(byte arg0) {
        field2357++;
        if (class275.field4128 == 0) {
            return;
        }
        try {
            if (++class174.field2375 > 2000) {
                if (class39.field442 != null) {
                    class39.field442.method1577((byte) -117);
                    class39.field442 = null;
                }
                if (class63.field817 >= 1) {
                    class243.field3485 = -5;
                    class275.field4128 = 0;
                    return;
                }
                class63.field817++;
                if (class54.field726 == class129.field1780) {
                    class129.field1780 = class103.field1411;
                } else {
                    class129.field1780 = class54.field726;
                }
                class174.field2375 = 0;
                class275.field4128 = 1;
            }
            if (class275.field4128 == 1) {
                class125.field1697 = class165.field2258.method618(class129.field1780, class252.field3611, 74);
                class275.field4128 = 2;
            }
            if (class275.field4128 == 2) {
                if (class125.field1697.field4241 == 2) {
                    throw new IOException();
                }
                if (class125.field1697.field4241 != 1) {
                    return;
                }
                class39.field442 = new class223((Socket) class125.field1697.field4244, class165.field2258);
                class125.field1697 = null;
                class39.field442.method1575(class90.field1264.field4777, 0, 5000, class90.field1264.field4798);
                if (class96.field1291 != null) {
                    class96.field1291.method1770((byte) -120);
                }
                if (class344.field5325 != null) {
                    class344.field5325.method1770((byte) -45);
                }
                int var1 = class39.field442.method1570((byte) 32);
                if (class96.field1291 != null) {
                    class96.field1291.method1770((byte) -117);
                }
                if (class344.field5325 != null) {
                    class344.field5325.method1770((byte) -107);
                }
                if (var1 != 21) {
                    class243.field3485 = var1;
                    class275.field4128 = 0;
                    class39.field442.method1577((byte) -102);
                    class39.field442 = null;
                    return;
                }
                class275.field4128 = 3;
            }
            if (arg0 <= 33) {
                field2356 = (class241) null;
            }
            if (class275.field4128 == 3) {
                if (class39.field442.method1572(0) < 1) {
                    return;
                }
                class231.field3271 = new String[class39.field442.method1570((byte) 103)];
                class275.field4128 = 4;
            }
            if (class275.field4128 == 4) {
                if (class39.field442.method1572(0) < (class231.field3271.length * 8)) {
                    return;
                }
                class157.field2165.field4777 = 0;
                class39.field442.method1573(class157.field2165.field4798, class231.field3271.length * 8, -19451, 0);
                for (int var2 = 0; var2 < class231.field3271.length; var2++) {
                    class231.field3271[var2] = class309.method2120(false, class157.field2165.method2175(false));
                }
                class275.field4128 = 0;
                class243.field3485 = 21;
                class39.field442.method1577((byte) -24);
                class39.field442 = null;
                return;
            }
        } catch (IOException var4) {
            if (class39.field442 != null) {
                class39.field442.method1577((byte) 115);
                class39.field442 = null;
            }
            if (class63.field817 >= 1) {
                class243.field3485 = -4;
                class275.field4128 = 0;
            } else {
                class275.field4128 = 1;
                class174.field2375 = 0;
                if (class54.field726 == class129.field1780) {
                    class129.field1780 = class103.field1411;
                } else {
                    class129.field1780 = class54.field726;
                }
                class63.field817++;
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)V", line = 182)
    public static final void method1209(boolean arg0) {
        field2352++;
        if (!class124.field1676) {
            return;
        }
        class344 var1 = class20.method128(121, class52.field697, class219.field3146);
        if (var1 != null && var1.field5314 != null) {
            class171 var2 = new class171();
            var2.field2333 = var1.field5314;
            var2.field2341 = var1;
            class314.method2145(108, var2);
        }
        class124.field1676 = false;
        class42.field485 = -1;
        class255.method1741(var1, arg0);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lcg;II)V", line = 214)
    public final void method60(class316 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field2361 = (arg0.method2219(16448) << 12) / 255;
        }
        field2358++;
        int var5 = 108 % ((arg1 + 17) / 40);
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(II)V", line = 233)
    public static final void method1210(int arg0, int arg1) {
        if (arg1 <= -102) {
            field2355++;
            class336.field5061.method720(arg0, 1088);
            class210.field3029.method720(arg0, 1088);
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I)V", line = 245)
    public class173(int arg0) {
        super(0, true);
        this.field2361 = 4096;
        this.field2361 = arg0;
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)V", line = 256)
    public static void method1211(int arg0) {
        field2356 = null;
        field2349 = null;
        if (arg0 > -66) {
            method1210(87, 124);
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V", line = 268)
    public class173() {
        this(4096);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)[I", line = 274)
    public final int[] method140(int arg0, int arg1) {
        if (arg0 != 542) {
            field2349 = (class133) null;
        }
        field2351++;
        int[] var3 = this.field4847.method1387(arg1, (byte) -31);
        if (this.field4847.field2751) {
            class281.method1944(var3, 0, class326.field4933, this.field2361);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(B)V", line = 297)
    public static final void method1212(byte arg0) {
        field2354++;
        class181.method1260(1773494991);
        class264.method1799((byte) 102);
        class306.method2082(5);
        class295.method2011((byte) 45);
        class320.method2241(126);
        class307.method2084((byte) -61);
        class179.method1243((byte) 34);
        class294.method2006(-77);
        class187.method1308(-8558);
        class45.method286(26852);
        class206.method1453((byte) 46);
        class15.method96(124);
        class135.method983(true);
        class59.method408(false);
        class132.method940(-5211);
        class236.method1627((byte) -122);
        class252.method1726(44);
        class31.method177(true);
        if (class44.field530 != 0) {
            for (int var1 = 0; var1 < class85.field1235.length; var1++) {
                class85.field1235[var1] = null;
            }
            class181.field2477 = 0;
        }
        class54.method370(110);
        class150.method1081(7);
        class140.field1918.method717((byte) 105);
        if (!class67.field908) {
            ((class204) class184.field2543).method1450((byte) 122);
        }
        if (arg0 >= -86) {
            return;
        }
        class82.field1187.method363(-51);
        class249.field3577.method958(91);
        class289.field4308.method958(124);
        class145.field2004.method958(111);
        class259.field3811.method958(110);
        class92.field1281.method958(-69);
        field2349.method958(101);
        class249.field3579.method958(115);
        class204.field2948.method958(100);
        class332.field5002.method958(-118);
        class44.field544.method958(-115);
        class20.field260.method958(119);
        class16.field196.method717((byte) 68);
    }
}
