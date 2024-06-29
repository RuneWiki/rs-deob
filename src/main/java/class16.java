import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class16 {

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Lmb;")
    public static class132 field232 = class166.method1092("Lade Wordpack )2 ", 123);

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "[[I")
    public static int[][] field241 = new int[5][5000];

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static volatile int field231 = 0;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field235 = 0;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "Lmb;")
    public static class132 field233 = class166.method1092("k", 118);

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "Lmb;")
    public static class132 field242 = class166.method1092("(Z", 125);

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field239;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static void method82(int arg0) {
        field233 = null;
        field242 = null;
        field241 = null;
        field232 = null;
        if (arg0 != 6) {
            method86(-60, 46, -101);
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
    public static final void method83(int arg0) {
        field238++;
        for (int var1 = 0; var1 < class220.field4003; var1++) {
            int var2 = class211.field3874[var1];
            class65 var3 = class11.field145[var2];
            int var4 = class118.field2241.method716(-1308);
            if ((var4 & 0x1) != 0) {
                int var5 = class118.field2241.method711(-1795);
                int var6 = class118.field2241.method711(-1795);
                var3.method285(false, var5, class30.field460, var6);
            }
            if ((var4 & 0x80) != 0) {
                int var7 = class118.field2241.method744((byte) 93);
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = class118.field2241.method716(arg0 ^ 0x51B);
                if (var3.field695 == var7 && var7 != -1) {
                    class236 var9 = class99.method619(var7, 4);
                    int var10 = var9.field4273;
                    if (var10 == 1) {
                        var3.field699 = 0;
                        var3.field713 = var8;
                        var3.field670 = 0;
                        var3.field688 = 0;
                        class168.method1101(var3.field699, var9, var3.field673, false, var3.field723, arg0 + 1497181865);
                    }
                    if (var10 == 2) {
                        var3.field670 = 0;
                    }
                } else if (var7 == -1 || var3.field695 == -1 || class99.method619(var7, arg0 ^ 0xFFFFFFFB).field4271 >= class99.method619(var3.field695, 4).field4271) {
                    var3.field695 = var7;
                    var3.field670 = 0;
                    var3.field699 = 0;
                    var3.field725 = var3.field697;
                    var3.field688 = 0;
                    var3.field713 = var8;
                    if (var3.field695 != -1) {
                        class168.method1101(var3.field699, class99.method619(var3.field695, arg0 + 5), var3.field673, false, var3.field723, 1497181864);
                    }
                }
            }
            if ((var4 & 0x10) != 0) {
                int var11 = class118.field2241.method716(-1308);
                int var12 = class118.field2241.method732((byte) 92);
                var3.method285(false, var11, class30.field460, var12);
                var3.field672 = class30.field460 + 300;
                var3.field698 = class118.field2241.method716(arg0 ^ 0x51B);
            }
            if ((var4 & 0x8) != 0) {
                var3.field684 = class118.field2241.method730(1848);
                var3.field721 = class118.field2241.method744((byte) 103);
            }
            if ((var4 & 0x20) != 0) {
                var3.field1072 = class189.method1209((byte) 113, class118.field2241.method744((byte) 125));
                var3.field712 = var3.field1072.field3425;
                var3.field702 = var3.field1072.field3430;
                var3.field715 = var3.field1072.field3399;
                var3.field720 = var3.field1072.field3401;
                var3.field687 = var3.field1072.field3417;
                var3.field736 = var3.field1072.field3390;
                var3.field708 = var3.field1072.field3398;
                var3.field679 = var3.field1072.field3422;
                var3.field727 = var3.field1072.field3400;
            }
            if ((var4 & 0x40) != 0) {
                var3.field668 = class118.field2241.method720((byte) 47);
                var3.field729 = 100;
            }
            if ((var4 & 0x4) != 0) {
                var3.field700 = class118.field2241.method753(false);
                if (var3.field700 == 65535) {
                    var3.field700 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field731 = class118.field2241.method730(1848);
                int var13 = class118.field2241.method748(arg0 ^ 0x48FE);
                var3.field705 = (var13 & 0xFFFF) + class30.field460;
                var3.field716 = 0;
                if (var3.field731 == 65535) {
                    var3.field731 = -1;
                }
                var3.field717 = var13 >> 16;
                var3.field740 = 0;
                if (var3.field705 > class30.field460) {
                    var3.field740 = -1;
                }
            }
        }
        if (arg0 != -1) {
            field235 = 64;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([BLkd;B)V")
    public final void method84(byte[] arg0, class112 arg1, byte arg2) {
        field234++;
        if (arg1.field2157[arg1.field2133] != 31 || arg1.field2157[arg1.field2133 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field239 == null) {
            this.field239 = new Inflater(true);
        }
        try {
            if (arg2 != 87) {
                field233 = null;
            }
            this.field239.setInput(arg1.field2157, arg1.field2133 + 10, -18 - arg1.field2133 + arg1.field2157.length);
            this.field239.inflate(arg0);
        } catch (Exception var4) {
            this.field239.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field239.reset();
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)V")
    public static final void method85(int arg0, byte arg1) {
        class57.method382(113);
        class8.method32(-120);
        int var2 = class138.method936(16, arg0).field2944;
        field237++;
        if (var2 == 0) {
            return;
        }
        int var3 = class77.field1315[arg0];
        if (var2 == 1) {
            class178.field3281 = var3;
            if (class178.field3281 == 1) {
                class50.method346(0.9F);
            }
            if (class178.field3281 == 2) {
                class50.method346(0.8F);
            }
            if (class178.field3281 == 3) {
                class50.method346(0.7F);
            }
            if (class178.field3281 == 4) {
                class50.method346(0.6F);
            }
            class181.method1164((byte) 61);
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class104.field1951 != var4) {
                if (class104.field1951 == 0 && class182.field3335 != -1) {
                    class86.method538(0, var4, -96, class69.field1161, false, class182.field3335);
                    class182.field3345 = false;
                } else if (var4 == 0) {
                    class208.method1289((byte) 81);
                    class182.field3345 = false;
                } else {
                    class210.method1294(62, var4);
                }
                class104.field1951 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class203.field3730 = 127;
            }
            if (var3 == 1) {
                class203.field3730 = 96;
            }
            if (var3 == 2) {
                class203.field3730 = 64;
            }
            if (var3 == 3) {
                class203.field3730 = 32;
            }
            if (var3 == 4) {
                class203.field3730 = 0;
            }
        }
        if (var2 == 5) {
            class15.field211 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class89.field1567 = 127;
            }
            if (var3 == 1) {
                class89.field1567 = 96;
            }
            if (var3 == 2) {
                class89.field1567 = 64;
            }
            if (var3 == 3) {
                class89.field1567 = 32;
            }
            if (var3 == 4) {
                class89.field1567 = 0;
            }
        }
        if (var2 == 9) {
            class140.field2630 = var3;
        }
        if (arg1 == 37 && var2 == 6) {
            class43.field761 = var3;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)I")
    public static final int method86(int arg0, int arg1, int arg2) {
        field240++;
        if (arg0 != 6) {
            method85(43, (byte) -63);
        }
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg2 >>= 0x1;
        }
        if (arg2 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
    public class16() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(III)V")
    private class16(int arg0, int arg1, int arg2) {
    }
}
