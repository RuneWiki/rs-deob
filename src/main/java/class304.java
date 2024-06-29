import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public abstract class class304 {

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    private int field4763 = 4;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    private int field4767 = 4;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "[S")
    private short[] field4769 = new short[512];

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
    public int field4774 = 4;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    private int field4772 = 0;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    private int field4761 = 4;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public static int field4764 = 2301979;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "[[S")
    public static short[][] field4765 = new short[][] { { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 } };

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "Ljava/lang/String;")
    public static String field4776 = "flash2:";

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "[B")
    public static byte[] field4766 = new byte[520];

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "Lak;")
    public static class172 field4759;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "Lak;")
    public static class172 field4762;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "Lak;")
    public static class172 field4777;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "[S")
    private short[] field4775;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)I", line = 6)
    public static final int method2164(byte arg0) {
        if (arg0 != 82) {
            field4776 = (String) null;
        }
        field4773++;
        if (class20.field289 == null) {
            return -1;
        }
        while (class88.field1222 < class20.field289.field3270) {
            if (class20.field289.method1471(arg0 ^ 0x52, class88.field1222)) {
                return class88.field1222++;
            }
            class88.field1222++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IBII)V", line = 30)
    public final void method2165(int arg0, byte arg1, int arg2, int arg3) {
        field4768++;
        if (arg1 != 85) {
            field4758 = 65;
        }
        int[] var5 = new int[arg3];
        int[] var6 = new int[arg2];
        int[] var7 = new int[arg0];
        for (int var8 = 0; var8 < arg3; var8++) {
            var5[var8] = (var8 << 12) / arg3;
        }
        for (int var9 = 0; var9 < arg0; var9++) {
            var7[var9] = (var9 << 12) / arg0;
        }
        for (int var10 = 0; var10 < arg2; var10++) {
            var6[var10] = (var10 << 12) / arg2;
        }
        this.method423(21260);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg0; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field4774; var14++) {
                        int var15 = this.field4775[var14] << 12;
                        int var16 = this.field4761 * var15 >> 12;
                        int var17 = var6[var11] * var15 >> 12;
                        int var18 = this.field4763 * var17;
                        int var19 = var18 >> 12;
                        int var20 = var19 + 1;
                        int var21 = var5[var13] * var15 >> 12;
                        int var22 = this.field4761 * var21;
                        int var23 = var19 & 0xFF;
                        int var24 = this.field4763 * var15 >> 12;
                        int var25 = this.field4767 * var15 >> 12;
                        int var26;
                        if (var24 <= var20) {
                            var26 = 0;
                        } else {
                            var26 = var20 & 0xFF;
                        }
                        short var27 = this.field4769[var23];
                        int var28 = var7[var12] * var15 >> 12;
                        int var29 = this.field4767 * var28;
                        int var30 = var29 >> 12;
                        int var31 = var30 + 1;
                        short var32 = this.field4769[var26];
                        int var33 = var22 >> 12;
                        int var34 = var18 & 0xFFF;
                        int var35 = var22 & 0xFFF;
                        int var36 = var34 - 4096;
                        int var37 = var33 + 1;
                        int var38 = var30 & 0xFF;
                        int var39;
                        if (var31 >= var25) {
                            var39 = 0;
                        } else {
                            var39 = var31 & 0xFF;
                        }
                        int var40 = var35 - 4096;
                        int var41 = class116.field1763[var35];
                        short var42 = this.field4769[var32 + var38];
                        int var43 = class116.field1763[var34];
                        int var44;
                        if (var37 >= var16) {
                            var44 = 0;
                        } else {
                            var44 = var37 & 0xFF;
                        }
                        short var45 = this.field4769[var27 + var39];
                        short var46 = this.field4769[var32 + var39];
                        int var47 = var33 & 0xFF;
                        short var48 = this.field4769[var27 + var38];
                        int var49 = var29 & 0xFFF;
                        int var50 = class116.field1763[var49];
                        int var51 = var49 - 4096;
                        int var52 = class224.method1587(var35, arg1 ^ 0xFFFFD142, this.field4769[var47 + var48], var34, var49);
                        int var53 = class224.method1587(var40, -12009, this.field4769[var44 + var48], var34, var49);
                        int var54 = ((var53 - var52) * var41 >> 12) + var52;
                        int var55 = class224.method1587(var35, arg1 - 12094, this.field4769[var45 + var47], var34, var51);
                        int var56 = class224.method1587(var40, arg1 ^ 0xFFFFD142, this.field4769[var44 + var45], var34, var51);
                        int var57 = ((var56 - var55) * var41 >> 12) + var55;
                        int var58 = class224.method1587(var35, -12009, this.field4769[var42 + var47], var36, var49);
                        int var59 = ((var57 - var54) * var50 >> 12) + var54;
                        int var60 = class224.method1587(var40, -12009, this.field4769[var44 + var42], var36, var49);
                        int var61 = ((var60 - var58) * var41 >> 12) + var58;
                        int var62 = class224.method1587(var35, arg1 - 12094, this.field4769[var46 + var47], var36, var51);
                        int var63 = class224.method1587(var40, arg1 - 12094, this.field4769[var44 - -var46], var36, var51);
                        int var64 = var62 + ((var63 - var62) * var41 >> 12);
                        int var65 = ((var64 - var61) * var50 >> 12) + var61;
                        this.method418(((var65 - var59) * var43 >> 12) + var59, var14, 6952);
                    }
                    this.method416((byte) -4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)V", line = 197)
    private final void method2166(byte arg0) {
        field4770++;
        Random var2 = new Random((long) this.field4772);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field4769[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class158.method1138(var5, true, var2);
            short var7 = this.field4769[var6];
            this.field4769[var6] = this.field4769[var5];
            this.field4769[var5] = this.field4769[var5 + 256] = var7;
        }
        if (arg0 <= 86) {
            field4762 = (class172) null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIII)V", line = 234)
    public static final void method2167(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 20589) {
            field4762 = (class172) null;
        }
        field4760++;
        class344 var4 = class110.method759(9, arg0, false);
        var4.method2390((byte) -88);
        var4.field5354 = arg2;
        var4.field5349 = arg3;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "()V", line = 255)
    public static final void method2168() {
        class64.field926 = 0;
        label194: for (int var0 = 0; var0 < class336.field5259; var0++) {
            class20 var1 = class261.field4167[var0];
            if (class18.field238 != null) {
                for (int var2 = 0; var2 < class18.field238.length; var2++) {
                    if (class18.field238[var2] != -1000000 && (var1.field290 <= class18.field238[var2] || var1.field275 <= class18.field238[var2]) && (var1.field272 <= client.field1657[var2] || var1.field285 <= client.field1657[var2]) && (var1.field272 >= class309.field4810[var2] || var1.field285 >= class309.field4810[var2]) && (var1.field274 <= class80.field1114[var2] || var1.field294 <= class80.field1114[var2]) && (var1.field274 >= class122.field1918[var2] || var1.field294 >= class122.field1918[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field280 == 1) {
                int var3 = var1.field279 + class116.field1765 - class224.field3578;
                if (var3 >= 0 && var3 <= class116.field1765 + class116.field1765) {
                    int var4 = var1.field296 + class116.field1765 - class177.field2951;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field278 + class116.field1765 - class177.field2951;
                    if (var5 > class116.field1765 + class116.field1765) {
                        var5 = class116.field1765 + class116.field1765;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class213.field3485[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class298.field4704 - var1.field272;
                        if (var7 > 32) {
                            var1.field295 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field295 = 2;
                            var7 = -var7;
                        }
                        var1.field282 = (var1.field274 - class172.field2866 << 8) / var7;
                        var1.field298 = (var1.field294 - class172.field2866 << 8) / var7;
                        var1.field281 = (var1.field290 - class165.field2753 << 8) / var7;
                        var1.field293 = (var1.field275 - class165.field2753 << 8) / var7;
                        class81.field1135[class64.field926++] = var1;
                    }
                }
            } else if (var1.field280 == 2) {
                int var8 = var1.field296 + class116.field1765 - class177.field2951;
                if (var8 >= 0 && var8 <= class116.field1765 + class116.field1765) {
                    int var9 = var1.field279 + class116.field1765 - class224.field3578;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field273 + class116.field1765 - class224.field3578;
                    if (var10 > class116.field1765 + class116.field1765) {
                        var10 = class116.field1765 + class116.field1765;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class213.field3485[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class172.field2866 - var1.field274;
                        if (var12 > 32) {
                            var1.field295 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field295 = 4;
                            var12 = -var12;
                        }
                        var1.field288 = (var1.field272 - class298.field4704 << 8) / var12;
                        var1.field283 = (var1.field285 - class298.field4704 << 8) / var12;
                        var1.field281 = (var1.field290 - class165.field2753 << 8) / var12;
                        var1.field293 = (var1.field275 - class165.field2753 << 8) / var12;
                        class81.field1135[class64.field926++] = var1;
                    }
                }
            } else if (var1.field280 == 4) {
                int var13 = var1.field290 - class165.field2753;
                if (var13 > 128) {
                    int var14 = var1.field296 + class116.field1765 - class177.field2951;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field278 + class116.field1765 - class177.field2951;
                    if (var15 > class116.field1765 + class116.field1765) {
                        var15 = class116.field1765 + class116.field1765;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field279 + class116.field1765 - class224.field3578;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field273 + class116.field1765 - class224.field3578;
                        if (var17 > class116.field1765 + class116.field1765) {
                            var17 = class116.field1765 + class116.field1765;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class213.field3485[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field295 = 5;
                            var1.field288 = (var1.field272 - class298.field4704 << 8) / var13;
                            var1.field283 = (var1.field285 - class298.field4704 << 8) / var13;
                            var1.field282 = (var1.field274 - class172.field2866 << 8) / var13;
                            var1.field298 = (var1.field294 - class172.field2866 << 8) / var13;
                            class81.field1135[class64.field926++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V", line = 478)
    public static void method2169(int arg0) {
        field4766 = null;
        if (arg0 != 90) {
            return;
        }
        field4776 = null;
        field4777 = null;
        field4765 = (short[][]) null;
        field4762 = null;
        field4759 = null;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V", line = 496)
    private final void method2170(int arg0) {
        field4771++;
        this.field4775 = new short[this.field4774];
        for (int var2 = arg0; var2 < this.field4774; var2++) {
            this.field4775[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(IIIII)V", line = 561)
    public class304(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4763 = arg4;
        this.field4772 = arg0;
        this.field4761 = arg2;
        this.field4767 = arg3;
        this.field4774 = arg1;
        this.method2170(0);
        this.method2166((byte) 117);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)V")
    public abstract void method418(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(B)V")
    public abstract void method416(byte arg0);

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V")
    public abstract void method423(int arg0);
}
