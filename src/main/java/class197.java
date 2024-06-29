import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class197 {

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
    public int field2970 = 2048;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public int field2968 = 0;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public int field2964 = 0;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public int field2965 = 2048;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2962 = null;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "[[S")
    public static short[][] field2971 = new short[][] { { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 } };

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1339(int arg0) {
        field2969++;
        if (class78.field1095 == 0) {
            return;
        }
        if (arg0 <= 97) {
            method1343(118);
        }
        try {
            if (++class412.field5947 > 2000) {
                if (class27.field335 != null) {
                    class27.field335.method998((byte) -13);
                    class27.field335 = null;
                }
                if (class6.field95 >= 1) {
                    class78.field1095 = 0;
                    class309.field4619 = -5;
                    return;
                }
                class6.field95++;
                class78.field1095 = 1;
                if (class487.field6839 == class14.field198) {
                    class14.field198 = class94.field1289;
                } else {
                    class14.field198 = class487.field6839;
                }
                class412.field5947 = 0;
            }
            if (class78.field1095 == 1) {
                class320.field4787 = class21.field261.method1051(class14.field198, -4655, class150.field2110);
                class78.field1095 = 2;
            }
            if (class78.field1095 == 2) {
                if (class320.field4787.field5822 == 2) {
                    throw new IOException();
                }
                if (class320.field4787.field5822 != 1) {
                    return;
                }
                class27.field335 = new class147((Socket) class320.field4787.field5823, class21.field261);
                class320.field4787 = null;
                class27.field335.method1000(30000, 0, class230.field3390.field6315, class230.field3390.field6316);
                if (class395.field5816 != null) {
                    class395.field5816.method2228(0);
                }
                if (class398.field5829 != null) {
                    class398.field5829.method2228(0);
                }
                int var1 = class27.field335.method1002((byte) -55);
                if (class395.field5816 != null) {
                    class395.field5816.method2228(0);
                }
                if (class398.field5829 != null) {
                    class398.field5829.method2228(0);
                }
                if (var1 != 21) {
                    class309.field4619 = var1;
                    class78.field1095 = 0;
                    class27.field335.method998((byte) -13);
                    class27.field335 = null;
                    return;
                }
                class78.field1095 = 3;
            }
            if (class78.field1095 == 3) {
                if (class27.field335.method1005(5000) < 1) {
                    return;
                }
                class158.field2199 = new String[class27.field335.method1002((byte) 79)];
                class78.field1095 = 4;
            }
            if (class78.field1095 == 4 && class27.field335.method1005(5000) >= (class158.field2199.length * 8)) {
                class220.field3246.field6315 = 0;
                class27.field335.method996(class158.field2199.length * 8, class220.field3246.field6316, true, 0);
                for (int var2 = 0; var2 < class158.field2199.length; var2++) {
                    class158.field2199[var2] = class154.method1055(0, class220.field3246.method2632((byte) 1));
                }
                class309.field4619 = 21;
                class78.field1095 = 0;
                class27.field335.method998((byte) -13);
                class27.field335 = null;
            }
        } catch (IOException var3) {
            if (class27.field335 != null) {
                class27.field335.method998((byte) -13);
                class27.field335 = null;
            }
            if (class6.field95 < 1) {
                if (class487.field6839 == class14.field198) {
                    class14.field198 = class94.field1289;
                } else {
                    class14.field198 = class487.field6839;
                }
                class412.field5947 = 0;
                class78.field1095 = 1;
                class6.field95++;
            } else {
                class78.field1095 = 0;
                class309.field4619 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V", line = 162)
    public static void method1340(int arg0) {
        if (arg0 == 10924) {
            field2971 = null;
            field2962 = null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lre;ZI)V", line = 173)
    private final void method1341(class446 arg0, boolean arg1, int arg2) {
        field2961++;
        if (arg2 == 1) {
            this.field2968 = arg0.method2628(49152);
        } else if (arg2 == 2) {
            this.field2970 = arg0.method2631(2530);
        } else if (arg2 == 3) {
            this.field2965 = arg0.method2631(2530);
        } else if (arg2 == 4) {
            this.field2964 = arg0.method2634(-115);
        }
        if (!arg1) {
            this.field2964 = 79;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IZBIII)V", line = 211)
    public static final void method1342(int arg0, boolean arg1, byte arg2, int arg3, int arg4, int arg5) {
        field2972++;
        if (class170.field2427 == null) {
            class138.field1976.method530(arg4, -16777216, arg0, (byte) 108, arg5, arg3);
        } else if (class472.field6622.field4543 >= 0 && (class379.field5642 * 128) > class472.field6622.field4543 && class472.field6622.field4538 >= 0 && (class456.field6477 * 128) > class472.field6622.field4538) {
            class281.field4249++;
            if (class472.field6622 != null && (class472.field6622.field4543 + 64 - (class472.field6622.method1705((byte) 65) * 64) >> 7) == class37.field492 && class472.field6622.field4538 - (class472.field6622.method1705((byte) 65) * 64 - 64) >> 7 == class106.field1483) {
                class106.field1483 = -1;
                class37.field492 = -1;
                class228.method1482((byte) -6);
            }
            class332.method2038((byte) -50);
            if (!arg1) {
                class465.method2735((byte) -47);
            }
            class337.method2066(1);
            class315.method1946(arg5, arg0, false, arg4, arg3, true);
            int var6 = class172.field2459;
            if (arg2 <= -69) {
                int var7 = class205.field3107;
                int var8 = class446.field6287;
                int var9 = class9.field147;
                if (class469.field6596 == 1) {
                    int var10 = (int) class412.field5953;
                    if (var10 < (class378.field5630 >> 8)) {
                        var10 = class378.field5630 >> 8;
                    }
                    if (client.field6675[4] && var10 < (class312.field4708[4] + 128)) {
                        var10 = class312.field4708[4] + 128;
                    }
                    int var11 = (int) class384.field5682 + class465.field6555 & 0x3FFF;
                    class122.method856((var10 >> 3) * 3 + 600, class312.field4705, var11, var10, class379.field5641, var8, class25.method219(48602855, class486.field6836, class472.field6622.field4538, class472.field6622.field4543) - 50, (byte) 120);
                } else if (class469.field6596 == 4) {
                    int var12 = (int) class412.field5953;
                    if (var12 < class378.field5630 >> 8) {
                        var12 = class378.field5630 >> 8;
                    }
                    if (client.field6675[4] && class312.field4708[4] + 128 > var12) {
                        var12 = class312.field4708[4] + 128;
                    }
                    int var13 = (int) class384.field5682 & 0x3FFF;
                    class122.method856(((var12 >> 3) * 3) + 600, class312.field4705, var13, var12, class379.field5641, var8, class25.method219(48602855, class486.field6836, class492.field6932, class128.field1787) - 50, (byte) 40);
                } else if (class469.field6596 == 5) {
                    class178.method1233(var8, 124);
                }
                int var14 = class68.field920;
                int var15 = class344.field5191;
                int var16 = class200.field3027;
                int var17 = class283.field4287;
                int var18 = class433.field6156;
                for (int var19 = 0; var19 < 5; var19++) {
                    if (client.field6675[var19]) {
                        int var22 = (int) ((double) (-class229.field3372[var19]) + Math.random() * (double) (class229.field3372[var19] * 2 + 1) + Math.sin((double) class131.field1826[var19] / 100.0D * (double) class462.field6510[var19]) * (double) class312.field4708[var19]);
                        if (var19 == 2) {
                            class200.field3027 += var22;
                        }
                        if (var19 == 3) {
                            class433.field6156 = class433.field6156 + var22 & 0x3FFF;
                        }
                        if (var19 == 0) {
                            class68.field920 += var22;
                        }
                        if (var19 == 4) {
                            class283.field4287 += var22;
                            if (class283.field4287 < 1024) {
                                class283.field4287 = 1024;
                            } else if (class283.field4287 > 3072) {
                                class283.field4287 = 3072;
                            }
                        }
                        if (var19 == 1) {
                            class344.field5191 += var22;
                        }
                    }
                }
                if (class68.field920 < 0) {
                    class68.field920 = 0;
                }
                if (class200.field3027 < 0) {
                    class200.field3027 = 0;
                }
                if (class68.field920 > (class412.field5957 << 7) - 1) {
                    class68.field920 = (class412.field5957 << 7) - 1;
                }
                if (class200.field3027 > ((class315.field4743 << 7) - 1)) {
                    class200.field3027 = (class315.field4743 << 7) - 1;
                }
                class78.method655(false);
                class53.method384(22717);
                class138.field1976.method500(var7, var6, var7 + var9, var6 + var8);
                class138.field1976.method563();
                int var20 = class72.field971;
                if (class378.field5629 == null) {
                    class138.field1976.method589(var20);
                } else {
                    class378.field5629.method676(var7, class138.field1976, var20, class433.field6156, var6, class378.field5616 << 3, var9, class283.field4287, false, var8);
                }
                class418.method2483((byte) 124);
                class227.field3321.method484(class68.field920, class344.field5191, class200.field3027, -class283.field4287 & 0x3FFF, -class433.field6156 & 0x3FFF, -class32.field425 & 0x3FFF);
                class138.field1976.method544(class227.field3321);
                class138.field1976.method516(var9 / 2 + var7, var8 / 2 + var6, class331.field4964 << 1, class331.field4964 << 1);
                class452.method2695(var9 / 2 + var7, 6685, class331.field4964 << 1, class331.field4964 << 1, var8 / 2 + var6);
                class81.method669(-class283.field4287 & 0x3FFF, class344.field5191, class200.field3027, -class433.field6156 & 0x3FFF, class68.field920, -128, -class32.field425 & 0x3FFF);
                byte var21 = class337.field5038.method2213(102, class170.field2424) == 2 ? (byte) class281.field4249 : 1;
                class303.method1893(class138.field1976, class452.field6418, class83.field1175, class227.field3321, class68.field920, class344.field5191, class200.field3027, class134.field1954, class145.field2050, class31.field412, class356.field5405, class180.field2688, class225.field3262, class472.field6622.field4545 + 1, var21, class472.field6622.field4543 >> 7, class472.field6622.field4538 >> 7, !class337.field5038.field3929);
                class418.method2483((byte) 107);
                if (class316.field4752 == 30) {
                    class425.method2506(256, var9, var6, var7, var8, 256, 360664001);
                    class212.method1430(var6, var9, (byte) 99, var8, 256, 256, var7);
                    class115.method820(var7, var6, 256, (byte) -83, var8, var9, 256);
                    class344.method2121(46, var7, var8, var9, var6);
                }
                class110.method803();
                class344.field5191 = var15;
                class283.field4287 = var17;
                class200.field3027 = var16;
                class433.field6156 = var18;
                class68.field920 = var14;
                if (class179.field2673 && class154.field2154.method738(true) == 0) {
                    class179.field2673 = false;
                }
                if (class179.field2673) {
                    class138.field1976.method530(var8, -16777216, var6, (byte) 108, var7, var9);
                    class416.method2477(class226.field3314.method2036(class4.field85, (byte) -21), 123, class310.field4690, false);
                }
            }
        } else {
            class138.field1976.method530(arg4, -16777216, arg0, (byte) 108, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)I", line = 403)
    public static final int method1343(int arg0) {
        if (arg0 < 80) {
            field2962 = null;
        }
        field2966++;
        return class5.field90;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(BLre;)V", line = 417)
    public final void method1344(byte arg0, class446 arg1) {
        int var3 = -35 / ((arg0 + 10) / 38);
        while (true) {
            int var4 = arg1.method2628(49152);
            if (var4 == 0) {
                field2963++;
                return;
            }
            this.method1341(arg1, true, var4);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IZ)V", line = 448)
    public static final void method1345(int arg0, boolean arg1) {
        field2967++;
        if (arg1) {
            if (class279.field4220 != -1) {
                class427.method2514((byte) -70, class279.field4220);
            }
            for (class468 var2 = (class468) class466.field6564.method2296((byte) 39); var2 != null; var2 = (class468) class466.field6564.method2297(true)) {
                if (!var2.method282(123)) {
                    var2 = (class468) class466.field6564.method2296((byte) 39);
                    if (var2 == null) {
                        break;
                    }
                }
                class479.method2811(1711162608, false, var2, true);
            }
            class279.field4220 = -1;
            class466.field6564 = new class371(8);
            class137.method960(-18170);
            class279.field4220 = class297.field4453;
            class355.method2187(false, -1);
            class456.method2706((byte) 114);
            class477.method2795(class279.field4220);
        }
        class327.method2010(-23062);
        int var3 = 118 % ((57 - arg0) / 57);
        class261.field3873 = -1;
        class36.method289(false, class268.field3970);
        class472.field6622 = new class257();
        class472.field6622.field4538 = 6656;
        class472.field6622.field4675[0] = 52;
        class472.field6622.field4543 = 6656;
        class472.field6622.field4674[0] = 52;
        class200.field3027 = 0;
        class68.field920 = 0;
        if (class469.field6596 == 2) {
            class68.field920 = class2.field42 << 7;
            class200.field3027 = class77.field1089 << 7;
        } else {
            class287.method1834(0);
        }
        class414.method2471(0);
        if (class68.field920 == 0 || class200.field3027 == 0) {
            class144.method987((byte) 29, 10);
        } else {
            class347.method2142((byte) -96);
            class144.method987((byte) 29, 28);
        }
    }
}
