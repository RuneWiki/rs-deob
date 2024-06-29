import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class341 {

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "F")
    public float field5315 = 1.0F;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "F")
    public float field5318 = 1.0F;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "F")
    public float field5323 = 0.25F;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public int field5322;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "Lmt;")
    public class321 field5330;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "I")
    public int field5331;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    public int field5325;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "F")
    public float field5329;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public int field5313;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "F")
    public float field5319;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public int field5321;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public int field5320;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "F")
    public float field5324;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "Lbi;")
    public static class104 field5317;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "[[S")
    public static short[][] field5328;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field5332;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILhw;)V")
    public final void method2261(int arg0, class208 arg1) {
        field5314++;
        this.field5318 = (float) (arg1.method1445(arg0 ^ 0xFFFFFD37) * 8) / 255.0F;
        this.field5323 = (float) (arg1.method1445(-98) * 8) / 255.0F;
        this.field5315 = (float) (arg1.method1445(111) * 8) / 255.0F;
        if (arg0 != 684) {
            this.field5330 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lot;IIII)V")
    public static final void method2262(class506 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class91.method635(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class252.field4075) {
            class91.method635(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class91.method635(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class131.field1773) {
            class91.method635(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class131.field1773) {
            class91.method635(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class252.field4075 && arg4 <= class131.field1773) {
            class91.method635(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class91.method635(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class252.field4075 && arg4 > 0) {
            class91.method635(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V")
    public static void method2263(boolean arg0) {
        if (arg0) {
            field5332 = null;
            field5317 = null;
            field5328 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lta;Lza;IIIIILgi;I)V")
    public static final void method2264(class453 arg0, class497 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class437 arg7, int arg8) {
        int var9 = 99 % (arg2 / 38);
        field5327++;
        class210 var10 = class457.field7049.method662(arg4, true);
        if (var10 == null || !var10.field3266 || !var10.method1489((byte) -126, class96.field1394)) {
            return;
        }
        if (var10.field3253 != null) {
            int[] var11 = new int[var10.field3253.length];
            for (int var12 = 0; var12 < var11.length / 2; var12++) {
                int var14;
                if (class334.field5222 == 4) {
                    var14 = (int) class388.field5918 & 0x3FFF;
                } else {
                    var14 = (int) class388.field5918 + class386.field5903 & 0x3FFF;
                }
                int var15 = class147.field1988[var14];
                int var16 = class147.field1986[var14];
                if (class334.field5222 != 4) {
                    var16 = var16 * 256 / (class326.field5126 + 256);
                    var15 = var15 * 256 / (class326.field5126 + 256);
                }
                var11[var12 * 2] = arg6 - (-(arg7.field6615 / 2) - ((var10.field3253[var12 * 2] * 4 + arg5) * var16 + (var10.field3253[var12 * 2 + 1] * 4 + arg3) * var15 >> 15));
                var11[var12 * 2 + 1] = arg7.field6730 / 2 + arg8 - ((var10.field3253[var12 * 2 + 1] * 4 + arg3) * var16 - ((var10.field3253[var12 * 2] * 4 + arg5) * var15) >> 15);
            }
            class288.method1941(arg1, var11, var10.field3230, arg7.field6732, arg7.field6642);
            for (int var13 = 0; var13 < (var11.length / 2 - 1); var13++) {
                arg1.method1329(var11[var13 * 2], var11[var13 * 2 + 1], var11[(var13 + 1) * 2], var11[(var13 + 1) * 2 + 1], var10.field3236, 1, arg0, arg6, arg8);
            }
            arg1.method1329(var11[var11.length - 2], var11[var11.length - 1], var11[0], var11[1], var10.field3236, 1, arg0, arg6, arg8);
        }
        class139 var17 = null;
        if (var10.field3254 != -1) {
            var17 = var10.method1485(false, (byte) 70, arg1);
            if (var17 != null) {
                class299.method2010(arg8, var17, arg5, arg7, arg6, 93, arg3, arg0);
            }
        }
        if (var10.field3249 == null) {
            return;
        }
        int var18 = 0;
        if (var17 != null) {
            var18 = var17.method622();
        }
        class299 var19 = class315.field4923;
        class340 var20 = class240.field3905;
        if (var10.field3263 == 1) {
            var19 = class128.field1741;
            var20 = class378.field5807;
        }
        if (var10.field3263 == 2) {
            var19 = class289.field4571;
            var20 = class306.field4807;
        }
        class60.method449(arg3, arg7, false, arg5, arg0, arg8, var10.field3249, var19, arg6, var18, var10.field3257, var20);
        return;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILsk;)Z")
    public final boolean method2265(int arg0, class341 arg1) {
        field5316++;
        if (arg0 > -16) {
            method2262(null, -112, -50, 52, 110);
        }
        return this.field5320 == arg1.field5320 && this.field5329 == arg1.field5329 && this.field5319 == arg1.field5319 && this.field5324 == arg1.field5324 && this.field5323 == arg1.field5323 && this.field5318 == arg1.field5318 && this.field5315 == arg1.field5315 && this.field5321 == arg1.field5321 && this.field5331 == arg1.field5331 && this.field5330 == arg1.field5330;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZILsk;I)V")
    public static final void method2266(boolean arg0, int arg1, class341 arg2, int arg3) {
        field5326++;
        class183.field2649[arg3][arg1] = arg2;
        if (arg0) {
            field5332 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V")
    public class341() {
        this.field5322 = -50;
        this.field5330 = class141.field1909;
        this.field5331 = 0;
        this.field5325 = -50;
        this.field5329 = 1.1523438F;
        this.field5313 = -60;
        this.field5319 = 0.69921875F;
        this.field5321 = class271.field4323;
        this.field5320 = class386.field5902;
        this.field5324 = 1.2F;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lhw;)V")
    public class341(class208 arg0) {
        int var2 = arg0.method1445(-93);
        if (class141.field1911.method2601((byte) -14, class452.field7013) && class307.field4813.method1324() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field5320 = class386.field5902;
            } else {
                this.field5320 = arg0.method1436((byte) 99);
            }
            if ((var2 & 0x2) == 0) {
                this.field5329 = 1.1523438F;
            } else {
                this.field5329 = (float) arg0.method1455(-3387) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field5319 = 0.69921875F;
            } else {
                this.field5319 = (float) arg0.method1455(-3387) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field5324 = 1.2F;
            } else {
                this.field5324 = (float) arg0.method1455(-3387) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method1436((byte) 107);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method1455(-3387);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method1455(-3387);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method1455(-3387);
            }
            this.field5320 = class386.field5902;
            this.field5329 = 1.1523438F;
            this.field5319 = 0.69921875F;
            this.field5324 = 1.2F;
        }
        if ((var2 & 0x10) == 0) {
            this.field5325 = -50;
            this.field5322 = -50;
            this.field5313 = -60;
        } else {
            this.field5325 = arg0.method1456(13329);
            this.field5313 = arg0.method1456(13329);
            this.field5322 = arg0.method1456(13329);
        }
        if ((var2 & 0x20) == 0) {
            this.field5321 = class271.field4323;
        } else {
            this.field5321 = arg0.method1436((byte) 89);
        }
        if ((var2 & 0x40) == 0) {
            this.field5331 = 0;
        } else {
            this.field5331 = arg0.method1455(-3387);
        }
        if ((var2 & 0x80) == 0) {
            this.field5330 = class141.field1909;
        } else {
            int var3 = arg0.method1455(-3387);
            int var4 = arg0.method1455(-3387);
            int var5 = arg0.method1455(-3387);
            int var6 = arg0.method1455(-3387);
            int var7 = arg0.method1455(-3387);
            int var8 = arg0.method1455(-3387);
            this.field5330 = class244.method1699(var7, var3, var8, (byte) -109, var5, var6, var4);
        }
    }

    static {
        new class213("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
        field5317 = new class104(55, -1);
        field5328 = new short[][] { { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 } };
    }
}
