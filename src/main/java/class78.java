import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class78 extends class40 {

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "[I")
    private int[] field1287 = new int[16];

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "[I")
    private int[] field1286 = new int[16];

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "[I")
    private int[] field1304 = new int[16];

    @OriginalMember(owner = "client!ne", name = "lb", descriptor = "I")
    private int field1316 = 1000000;

    @OriginalMember(owner = "client!ne", name = "kb", descriptor = "[I")
    private int[] field1315 = new int[16];

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "[I")
    private int[] field1307 = new int[16];

    @OriginalMember(owner = "client!ne", name = "rb", descriptor = "[I")
    private int[] field1322 = new int[16];

    @OriginalMember(owner = "client!ne", name = "tb", descriptor = "[I")
    private int[] field1324 = new int[16];

    @OriginalMember(owner = "client!ne", name = "jb", descriptor = "[I")
    private int[] field1314 = new int[16];

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "[I")
    public int[] field1302 = new int[16];

    @OriginalMember(owner = "client!ne", name = "Ab", descriptor = "[I")
    public int[] field1331 = new int[16];

    @OriginalMember(owner = "client!ne", name = "pb", descriptor = "[I")
    private int[] field1320 = new int[16];

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "[I")
    private int[] field1271 = new int[16];

    @OriginalMember(owner = "client!ne", name = "hb", descriptor = "[I")
    public int[] field1312 = new int[16];

    @OriginalMember(owner = "client!ne", name = "vb", descriptor = "[I")
    private int[] field1326 = new int[16];

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
    private int field1272 = 256;

    @OriginalMember(owner = "client!ne", name = "ib", descriptor = "[I")
    private int[] field1313 = new int[16];

    @OriginalMember(owner = "client!ne", name = "Jb", descriptor = "[I")
    private int[] field1340 = new int[16];

    @OriginalMember(owner = "client!ne", name = "qb", descriptor = "[[Ltj;")
    private class10[][] field1321 = new class10[16][128];

    @OriginalMember(owner = "client!ne", name = "Pb", descriptor = "[[Ltj;")
    private class10[][] field1346 = new class10[16][128];

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "Lca;")
    private class130 field1289 = new class130();

    @OriginalMember(owner = "client!ne", name = "Qb", descriptor = "Ltc;")
    private class250 field1347 = new class250(this);

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "Li;")
    private class112 field1282 = new class112(128);

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1306 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ne", name = "Hb", descriptor = "[[S")
    public static short[][] field1338 = new short[][] { { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 } };

    @OriginalMember(owner = "client!ne", name = "Gb", descriptor = "[I")
    public static int[] field1337 = new int[2];

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!ne", name = "db", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!ne", name = "eb", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!ne", name = "fb", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!ne", name = "gb", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!ne", name = "mb", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!ne", name = "nb", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!ne", name = "ob", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!ne", name = "sb", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!ne", name = "ub", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!ne", name = "wb", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!ne", name = "xb", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!ne", name = "yb", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!ne", name = "zb", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!ne", name = "Cb", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!ne", name = "Db", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!ne", name = "Eb", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!ne", name = "Ib", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!ne", name = "Kb", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!ne", name = "Mb", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!ne", name = "Nb", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!ne", name = "Ob", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!ne", name = "Sb", descriptor = "I")
    private int field1349;

    @OriginalMember(owner = "client!ne", name = "Tb", descriptor = "I")
    private int field1350;

    @OriginalMember(owner = "client!ne", name = "Xb", descriptor = "I")
    private int field1354;

    @OriginalMember(owner = "client!ne", name = "Rb", descriptor = "J")
    private long field1348;

    @OriginalMember(owner = "client!ne", name = "Ub", descriptor = "J")
    private long field1351;

    @OriginalMember(owner = "client!ne", name = "Fb", descriptor = "Lvh;")
    public static class108 field1336;

    @OriginalMember(owner = "client!ne", name = "Wb", descriptor = "Leb;")
    private class34 field1353;

    @OriginalMember(owner = "client!ne", name = "Vb", descriptor = "Z")
    private boolean field1352;

    @OriginalMember(owner = "client!ne", name = "Yb", descriptor = "Z")
    private boolean field1355;

    @OriginalMember(owner = "client!ne", name = "Bb", descriptor = "[I")
    public static int[] field1332;

    @OriginalMember(owner = "client!ne", name = "Lb", descriptor = "[[[I")
    public static int[][][] field1342;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V")
    public final synchronized void method473(int arg0) {
        this.method502((byte) 66, true);
        field1290++;
        if (arg0 != 32) {
            this.method496((byte) 17, true);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZIII)V")
    private final void method474(boolean arg0, int arg1, int arg2, int arg3) {
        field1311++;
        this.method483(arg3, arg1, (byte) 122, 64);
        if ((this.field1302[arg1] & 0x2) != 0) {
            for (class10 var5 = (class10) this.field1347.field4098.method376((byte) 63); var5 != null; var5 = (class10) this.field1347.field4098.method372(113)) {
                if (var5.field132 == arg1 && var5.field125 < 0) {
                    this.field1321[arg1][var5.field135] = null;
                    this.field1321[arg1][arg3] = var5;
                    int var6 = (var5.field136 * var5.field129 >> 12) + var5.field130;
                    var5.field136 = 4096;
                    var5.field130 += arg3 - var5.field135 << 8;
                    var5.field135 = arg3;
                    var5.field129 = var6 - var5.field130;
                    return;
                }
            }
        }
        class248 var7 = (class248) this.field1282.method779(79, (long) this.field1320[arg1]);
        if (var7 == null || !arg0) {
            return;
        }
        class202 var8 = var7.field4078[arg3];
        if (var8 == null) {
            return;
        }
        class10 var9 = new class10();
        var9.field132 = arg1;
        var9.field128 = var7;
        var9.field131 = var8;
        var9.field138 = var7.field4076[arg3];
        var9.field137 = var7.field4065[arg3];
        var9.field135 = arg3;
        var9.field145 = var7.field4071[arg3] * arg2 * var7.field4073 * arg2 + 1024 >> 11;
        var9.field141 = var7.field4068[arg3] & 0xFF;
        var9.field130 = (arg3 << 8) - (var7.field4067[arg3] & 0x7FFF);
        var9.field124 = 0;
        var9.field133 = 0;
        var9.field134 = 0;
        var9.field125 = -1;
        var9.field139 = 0;
        if (this.field1331[arg1] == 0) {
            var9.field142 = class284.method1861(var8, this.method489(-13462, var9), this.method492((byte) 116, var9), this.method495(var9, 16384));
        } else {
            var9.field142 = class284.method1861(var8, this.method489(-13462, var9), 0, this.method495(var9, 16384));
            this.method475(-71, ~var7.field4067[arg3] > -1, var9);
        }
        if (var7.field4067[arg3] < 0) {
            var9.field142.method1900(-1);
        }
        if (var9.field137 >= 0) {
            class10 var10 = this.field1346[arg1][var9.field137];
            if (var10 != null && var10.field125 < 0) {
                this.field1321[arg1][var10.field135] = null;
                var10.field125 = 0;
            }
            this.field1346[arg1][var9.field137] = var9;
        }
        this.field1347.field4098.method374(-1, var9);
        this.field1321[arg1][arg3] = var9;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZLtj;)V")
    public final void method475(int arg0, boolean arg1, class10 arg2) {
        int var4 = arg2.field131.field3316.length;
        int var6;
        if (arg1 && arg2.field131.field3313) {
            int var5 = var4 + var4 - arg2.field131.field3315;
            var6 = (int) ((long) this.field1331[arg2.field132] * (long) var5 >> 6);
            int var7 = var4 << 8;
            if (var6 >= var7) {
                var6 = var7 + var7 - var6 - 1;
                arg2.field142.method1868(true);
            }
        } else {
            var6 = (int) ((long) this.field1331[arg2.field132] * (long) var4 >> 6);
        }
        arg2.field142.method1866(var6);
        field1341++;
        if (arg0 >= -47) {
            field1332 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ltj;[IIII)Z")
    public final boolean method476(class10 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        arg0.field143 = class81.field1478 / 100;
        field1292++;
        if (arg0.field125 >= 0 && arg0.field142 == null || arg0.field142.method1862()) {
            arg0.method69(false);
            arg0.method547(10026);
            if (arg0.field137 > 0 && this.field1346[arg0.field132][arg0.field137] == arg0) {
                this.field1346[arg0.field132][arg0.field137] = null;
            }
            return true;
        }
        int var6 = arg0.field136;
        boolean var7 = false;
        if (var6 > 0) {
            int var8 = var6 - (int) (Math.pow(2.0D, (double) this.field1287[arg0.field132] * 4.921259842519685E-4D) * 16.0D + 0.5D);
            if (var8 < 0) {
                var8 = 0;
            }
            arg0.field136 = var8;
        }
        arg0.field142.method1895(this.method489(-13462, arg0));
        class111 var9 = arg0.field138;
        arg0.field123++;
        arg0.field150 += var9.field2001;
        double var10 = (double) ((arg0.field135 - 60 << 8) + (arg0.field136 * arg0.field129 >> 12)) * 5.086263020833333E-6D;
        if (arg3 > ~var9.field1994) {
            if (var9.field1993 > 0) {
                arg0.field139 += (int) (Math.pow(2.0D, (double) var9.field1993 * var10) * 128.0D + 0.5D);
            } else {
                arg0.field139 += 128;
            }
            if ((arg0.field139 * var9.field1994) >= 819200) {
                var7 = true;
            }
        }
        if (var9.field1995 != null) {
            if (var9.field2004 > 0) {
                arg0.field124 += (int) (Math.pow(2.0D, (double) var9.field2004 * var10) * 128.0D + 0.5D);
            } else {
                arg0.field124 += 128;
            }
            while (arg0.field133 < (var9.field1995.length - 2) && arg0.field124 > (var9.field1995[arg0.field133 + 2] & 0xFF << 8)) {
                arg0.field133 += 2;
            }
            if (var9.field1995.length - 2 == arg0.field133 && var9.field1995[arg0.field133 + 1] == 0) {
                var7 = true;
            }
        }
        if (arg0.field125 >= 0 && var9.field2002 != null && (this.field1302[arg0.field132] & 0x1) == 0 && (arg0.field137 < 0 || this.field1346[arg0.field132][arg0.field137] != arg0)) {
            if (var9.field1998 <= 0) {
                arg0.field125 += 128;
            } else {
                arg0.field125 += (int) (Math.pow(2.0D, (double) var9.field1998 * var10) * 128.0D + 0.5D);
            }
            while (var9.field2002.length - 2 > arg0.field134 && arg0.field125 > (var9.field2002[arg0.field134 + 2] & 0xFF) << 8) {
                arg0.field134 += 2;
            }
            if ((var9.field2002.length - 2) == arg0.field134) {
                var7 = true;
            }
        }
        if (!var7) {
            arg0.field142.method1876(arg0.field143, this.method492((byte) 118, arg0), this.method495(arg0, arg3 + 16385));
            return false;
        }
        arg0.field142.method1891(arg0.field143);
        if (arg1 == null) {
            arg0.field142.method253(arg4);
        } else {
            arg0.field142.method257(arg1, arg2, arg4);
        }
        if (arg0.field142.method1884()) {
            this.field1347.field4103.method254(arg0.field142);
        }
        arg0.method69(false);
        if (arg0.field125 >= 0) {
            arg0.method547(10026);
            if (arg0.field137 > 0 && this.field1346[arg0.field132][arg0.field137] == arg0) {
                this.field1346[arg0.field132][arg0.field137] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V")
    private final void method477(int arg0, int arg1, int arg2) {
        field1294++;
        if (arg0 >= -95) {
            this.field1302 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(III)V")
    private final void method478(int arg0, int arg1, int arg2) {
        field1323++;
        this.field1326[arg2] = arg1;
        if (arg0 != -11809) {
            this.field1326 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V")
    private final void method479(int arg0, int arg1) {
        field1284++;
        if (arg1 < 0) {
            for (int var3 = 0; var3 < 16; var3++) {
                this.method479(0, var3);
            }
            return;
        }
        this.field1324[arg1] = 12800;
        this.field1313[arg1] = 8192;
        this.field1315[arg1] = 16383;
        this.field1326[arg1] = 8192;
        this.field1307[arg1] = 0;
        this.field1287[arg1] = 8192;
        if (arg0 != 0) {
            this.field1355 = true;
        }
        this.method491(false, arg1);
        this.method487(arg1, (byte) -43);
        this.field1302[arg1] = 0;
        this.field1314[arg1] = 32767;
        this.field1286[arg1] = 256;
        this.field1331[arg1] = 0;
        this.method484(15020, arg1, 8192);
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(III)V")
    private final void method480(int arg0, int arg1, int arg2) {
        field1300++;
        this.field1271[arg1] = arg0;
        this.field1304[arg1] = class113.method791(-128, arg0);
        this.method503(arg0, arg1, -1095);
        if (arg2 != -15128) {
            this.field1320 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)I")
    public final int method481(byte arg0) {
        if (arg0 != -104) {
            field1306 = null;
        }
        field1335++;
        return this.field1272;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lvh;I)Z")
    public static final boolean method482(class108 arg0, int arg1) {
        if (arg1 != 192) {
            method511(true, -123);
        }
        field1344++;
        return arg0.method727(class1.field14, (byte) -83);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "()I")
    public final synchronized int method256() {
        field1299++;
        return 0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIBI)V")
    private final void method483(int arg0, int arg1, byte arg2, int arg3) {
        field1291++;
        if (arg2 < 45) {
            this.method476((class10) null, (int[]) null, -49, -33, 80);
        }
        class10 var5 = this.field1321[arg1][arg0];
        if (var5 == null) {
            return;
        }
        this.field1321[arg1][arg0] = null;
        if ((this.field1302[arg1] & 0x2) == 0) {
            var5.field125 = 0;
            return;
        }
        for (class10 var6 = (class10) this.field1347.field4098.method379(6347); var6 != null; var6 = (class10) this.field1347.field4098.method378(32)) {
            if (var5.field132 == var6.field132 && var6.field125 < 0 && var5 != var6) {
                var5.field125 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(III)V")
    private final void method484(int arg0, int arg1, int arg2) {
        field1310++;
        if (arg0 != 15020) {
            this.field1302 = null;
        }
        this.field1340[arg1] = arg2;
        this.field1312[arg1] = (int) (Math.pow(2.0D, (double) arg2 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method485(String arg0, int arg1, int arg2) {
        field1288++;
        String var3 = class9.method55((byte) 77, class170.method1147(arg0, (byte) 53));
        boolean var4 = false;
        if (arg2 != 6952) {
            field1342 = null;
        }
        for (int var5 = 0; var5 < class157.field2624; var5++) {
            class288 var6 = class105.field1874[class280.field4458[var5]];
            if (var6 != null && var6.field4601 != null && var6.field4601.equalsIgnoreCase(var3)) {
                if (arg1 == 1) {
                    class168.field2778.method199(221, 123);
                    class168.field2778.method697(arg2 + 9924, 0);
                    class168.field2778.method690(class280.field4458[var5], 117);
                    class256.field4181++;
                } else if (arg1 == 4) {
                    class168.field2778.method199(158, arg2 - 6829);
                    class168.field2778.method697(16876, 0);
                    class46.field811++;
                    class168.field2778.method690(class280.field4458[var5], 98);
                } else if (arg1 == 5) {
                    class168.field2778.method199(197, -94);
                    class153.field2560++;
                    class168.field2778.method697(16876, 0);
                    class168.field2778.method690(class280.field4458[var5], arg2 ^ 0x1B75);
                } else if (arg1 == 6) {
                    class168.field2778.method199(114, arg2 ^ 0xFFFFE4B6);
                    class159.field2665++;
                    class168.field2778.method688(-128, class280.field4458[var5]);
                    class168.field2778.method699(-23266, 0);
                } else if (arg1 == 7) {
                    class99.field1704++;
                    class168.field2778.method199(230, 115);
                    class168.field2778.method690(class280.field4458[var5], arg2 - 6835);
                    class168.field2778.method697(arg2 ^ 0x5AC4, 0);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class97.method612(class79.field1361 + var3, -1, 0, "");
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lna;B)V")
    public static final void method486(class146 arg0, byte arg1) {
        class252.field4132 = arg0;
        field1329++;
        if (arg1 != -119) {
            method482((class108) null, 84);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)V")
    private final void method487(int arg0, byte arg1) {
        if (arg1 != -43) {
            return;
        }
        field1285++;
        if ((this.field1302[arg0] & 0x4) == 0) {
            return;
        }
        for (class10 var3 = (class10) this.field1347.field4098.method379(6347); var3 != null; var3 = (class10) this.field1347.field4098.method378(-107)) {
            if (var3.field132 == arg0) {
                var3.field122 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Leb;IZZ)V")
    private final synchronized void method488(class34 arg0, int arg1, boolean arg2, boolean arg3) {
        field1303++;
        this.method502((byte) 68, arg3);
        this.field1289.method901(arg0.field485);
        this.field1351 = 0L;
        this.field1352 = arg2;
        if (arg1 != 10245) {
            this.method509((byte) 35);
        }
        int var5 = this.field1289.method899();
        for (int var6 = 0; var6 < var5; var6++) {
            this.field1289.method892(var6);
            this.field1289.method898(var6);
            this.field1289.method890(var6);
        }
        this.field1349 = this.field1289.method893();
        this.field1350 = this.field1289.field2273[this.field1349];
        this.field1348 = this.field1289.method889(this.field1350);
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "()Lok;")
    public final synchronized class40 method251() {
        field1293++;
        return this.field1347;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILtj;)I")
    private final int method489(int arg0, class10 arg1) {
        field1328++;
        class111 var3 = arg1.field138;
        if (arg0 != -13462) {
            this.method475(90, false, (class10) null);
        }
        int var4 = (arg1.field136 * arg1.field129 >> 12) + arg1.field130;
        int var5 = ((this.field1326[arg1.field132] - 8192) * this.field1286[arg1.field132] >> 12) + var4;
        if (var3.field2001 > 0 && (var3.field2006 > 0 || this.field1307[arg1.field132] > 0)) {
            int var6 = var3.field2008 << 1;
            int var7 = var3.field2006 << 2;
            if (arg1.field123 < var6) {
                var7 = arg1.field123 * var7 / var6;
            }
            int var8 = (this.field1307[arg1.field132] >> 7) + var7;
            double var9 = Math.sin((double) (arg1.field150 & 0x1FF) * 0.01227184630308513D);
            var5 += (int) ((double) var8 * var9);
        }
        int var11 = (int) ((double) (arg1.field131.field3317 * 256) * Math.pow(2.0D, (double) var5 * 3.255208333333333E-4D) / (double) class81.field1478 + 0.5D);
        return var11 < 1 ? 1 : var11;
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)V")
    public final synchronized void method490(int arg0) {
        if (arg0 == 20715) {
            for (class248 var2 = (class248) this.field1282.method782(0); var2 != null; var2 = (class248) this.field1282.method788(true)) {
                var2.method547(10026);
            }
            field1325++;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZI)V")
    private final void method491(boolean arg0, int arg1) {
        if ((this.field1302[arg1] & 0x2) != 0) {
            for (class10 var3 = (class10) this.field1347.field4098.method379(6347); var3 != null; var3 = (class10) this.field1347.field4098.method378(-71)) {
                if (var3.field132 == arg1 && this.field1321[arg1][var3.field135] == null && var3.field125 < 0) {
                    var3.field125 = 0;
                }
            }
        }
        if (!arg0) {
            field1345++;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLtj;)I")
    private final int method492(byte arg0, class10 arg1) {
        field1317++;
        if (this.field1322[arg1.field132] == 0) {
            return 0;
        }
        class111 var3 = arg1.field138;
        int var4 = this.field1324[arg1.field132] * this.field1315[arg1.field132] + 4096 >> 13;
        int var5 = var4 * var4 + 16384 >> 15;
        int var6 = arg1.field145 * var5 + 16384 >> 15;
        int var7 = this.field1272 * var6 + 128 >> 8;
        int var8 = this.field1322[arg1.field132] * var7 + 128 >> 8;
        if (var3.field1994 > 0) {
            var8 = (int) ((double) var8 * Math.pow(0.5D, (double) arg1.field139 * 1.953125E-5D * (double) var3.field1994) + 0.5D);
        }
        if (var3.field1995 != null) {
            int var9 = var3.field1995[arg1.field133 + 1];
            int var10 = arg1.field124;
            if (var3.field1995.length - 2 > arg1.field133) {
                int var11 = var3.field1995[arg1.field133] & 0xFF << 8;
                int var12 = var3.field1995[arg1.field133 + 2] & 0xFF << 8;
                var9 += (var3.field1995[arg1.field133 + 3] - var9) * (var10 - var11) / (var12 - var11);
            }
            var8 = var8 * var9 + 32 >> 6;
        }
        if (arg1.field125 > 0 && var3.field2002 != null) {
            int var13 = arg1.field125;
            int var14 = var3.field2002[arg1.field134 + 1];
            if (arg1.field134 < (var3.field2002.length - 2)) {
                int var15 = (var3.field2002[arg1.field134] & 0xFF) << 8;
                int var16 = var3.field2002[arg1.field134 + 2] & 0xFF << 8;
                var14 += (var13 - var15) * (var3.field2002[arg1.field134 + 3] - var14) / (var16 - var15);
            }
            var8 = var8 * var14 + 32 >> 6;
        }
        int var17 = -89 % ((72 - arg0) / 41);
        return var8;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Leb;IZ)V")
    public final synchronized void method493(class34 arg0, int arg1, boolean arg2) {
        if (arg1 != 15006) {
            field1342 = null;
        }
        this.method488(arg0, 10245, arg2, true);
        field1275++;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V")
    public final synchronized void method253(int arg0) {
        field1339++;
        if (this.field1289.method891()) {
            int var2 = this.field1289.field2278 * this.field1316 / class81.field1478;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field1351;
                if ((this.field1348 - var3) >= 0L) {
                    this.field1351 = var3;
                    break;
                }
                int var5 = (int) ((this.field1348 - this.field1351 - (-((long) var2) + 1L)) / (long) var2);
                arg0 -= var5;
                this.field1351 += (long) var2 * (long) var5;
                this.field1347.method253(var5);
                this.method500((byte) -68);
            } while (this.field1289.method891());
        }
        this.field1347.method253(arg0);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(IIII)V")
    private final void method494(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 18 % ((-arg1 - 16) / 42);
        field1333++;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ltj;I)I")
    private final int method495(class10 arg0, int arg1) {
        int var3 = this.field1313[arg0.field132];
        field1343++;
        if (arg1 != 16384) {
            field1306 = null;
        }
        return var3 < 8192 ? arg0.field141 * var3 + 32 >> 6 : 16384 - ((128 - arg0.field141) * (16384 - var3) + 32 >> 6);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BZ)V")
    private final void method496(byte arg0, boolean arg1) {
        if (arg1) {
            this.method514((byte) 126, -1);
        } else {
            this.method510(-1, (byte) -116);
        }
        this.method479(0, -1);
        field1278++;
        if (arg0 != 56) {
            return;
        }
        for (int var3 = 0; var3 < 16; var3++) {
            this.field1320[var3] = this.field1271[var3];
        }
        for (int var4 = 0; var4 < 16; var4++) {
            this.field1304[var4] = class113.method791(this.field1271[var4], -128);
        }
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)V")
    public final synchronized void method497(int arg0) {
        for (class248 var2 = (class248) this.field1282.method782(0); var2 != null; var2 = (class248) this.field1282.method788(true)) {
            var2.method1657(arg0 ^ 0xFFFFC8A3);
        }
        field1276++;
        if (arg0 != -15516) {
            this.method256();
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([III)V")
    public final synchronized void method257(int[] arg0, int arg1, int arg2) {
        field1280++;
        if (this.field1289.method891()) {
            int var4 = this.field1289.field2278 * this.field1316 / class81.field1478;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field1351;
                if (this.field1348 - var5 >= 0L) {
                    this.field1351 = var5;
                    break;
                }
                int var7 = (int) ((this.field1348 - (this.field1351 + 1L - ((long) var4))) / (long) var4);
                this.field1351 += (long) var4 * (long) var7;
                this.field1347.method257(arg0, arg1, var7);
                this.method500((byte) -68);
                arg1 += var7;
                arg2 -= var7;
            } while (this.field1289.method891());
        }
        this.field1347.method257(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)V")
    public final synchronized void method498(int arg0, int arg1) {
        this.field1272 = arg0;
        int var3 = 116 % ((-arg1 - 23) / 52);
        field1283++;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
    public static void method499(byte arg0) {
        field1337 = null;
        int var1 = -42 / ((arg0 + 12) / 56);
        field1336 = null;
        field1338 = null;
        field1342 = null;
        field1332 = null;
        field1306 = null;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V")
    private final void method500(byte arg0) {
        field1305++;
        int var2 = this.field1350;
        int var3 = this.field1349;
        long var4 = this.field1348;
        if (this.field1353 != null && this.field1354 == var2) {
            this.method488(this.field1353, 10245, this.field1352, this.field1355);
            this.method500((byte) -68);
            return;
        }
        while (this.field1350 == var2) {
            while (this.field1289.field2273[var3] == var2) {
                this.field1289.method892(var3);
                int var6 = this.field1289.method894(var3);
                if (var6 == 1) {
                    this.field1289.method903();
                    this.field1289.method890(var3);
                    if (this.field1289.method896()) {
                        if (this.field1353 != null) {
                            this.method493(this.field1353, 15006, this.field1352);
                            this.method500((byte) -68);
                            return;
                        }
                        if (!this.field1352 || var2 == 0) {
                            this.method496((byte) 56, true);
                            this.field1289.method888();
                            return;
                        }
                        this.field1289.method895(var4);
                    }
                    break;
                }
                if ((var6 & 0x80) != 0) {
                    this.method513(var6, -128);
                }
                this.field1289.method898(var3);
                this.field1289.method890(var3);
            }
            var3 = this.field1289.method893();
            var2 = this.field1289.field2273[var3];
            var4 = this.field1289.method889(var2);
        }
        this.field1348 = var4;
        this.field1349 = var3;
        this.field1350 = var2;
        if (arg0 != -68) {
            this.field1324 = null;
        }
        if (this.field1353 != null && var2 > this.field1354) {
            this.field1350 = this.field1354;
            this.field1349 = -1;
            this.field1348 = this.field1289.method889(this.field1350);
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(Ltj;I)Z")
    public final boolean method501(class10 arg0, int arg1) {
        int var3 = -128 % ((-arg1 - 71) / 49);
        field1274++;
        if (arg0.field142 != null) {
            return false;
        }
        if (arg0.field125 >= 0) {
            arg0.method547(10026);
            if (arg0.field137 > 0 && this.field1346[arg0.field132][arg0.field137] == arg0) {
                this.field1346[arg0.field132][arg0.field137] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(BZ)V")
    private final synchronized void method502(byte arg0, boolean arg1) {
        if (arg0 > 24) {
            this.field1289.method888();
            this.field1353 = null;
            this.method496((byte) 56, arg1);
            field1297++;
        }
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(III)V")
    private final void method503(int arg0, int arg1, int arg2) {
        field1330++;
        if (arg2 != -1095) {
            this.field1321 = null;
        }
        if (this.field1320[arg1] != arg0) {
            this.field1320[arg1] = arg0;
            for (int var4 = 0; var4 < 128; var4++) {
                this.field1346[arg1][var4] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)I")
    public static final int method504(byte arg0) {
        field1295++;
        if (arg0 <= 44) {
            method486((class146) null, (byte) -61);
        }
        return class119.field2117 && class12.field169[81] && class275.field4399 > 2 ? class291.field4653[class275.field4399 - 2] : class291.field4653[class275.field4399 - 1];
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZIILdl;)V")
    public static final void method505(int arg0, boolean arg1, int arg2, int arg3, class46 arg4) {
        if (class264.field4293 < 3) {
            ((class197) class212.field3569).method1300(arg3, arg0, arg4.field701, arg4.field715, class212.field3569.field1218 / 2, class212.field3569.field1229 / 2, (int) class106.field1900, 256, arg4.field671, arg4.field714);
        } else {
            class283.method1843(arg3, arg0, 0, arg4.field671, arg4.field714);
        }
        field1308++;
        class239.field3937[arg2] = arg1;
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(III)V")
    private final synchronized void method506(int arg0, int arg1, int arg2) {
        field1279++;
        if (arg0 > -42) {
            return;
        }
        if (arg1 >= 0) {
            this.field1322[arg1] = arg2;
        } else {
            for (int var4 = 0; var4 < 16; var4++) {
                this.field1322[var4] = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIZ)V")
    public final synchronized void method507(int arg0, int arg1, boolean arg2) {
        field1298++;
        this.method480(arg0, arg1, -15128);
        if (!arg2) {
            this.field1286 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lgb;ZLvh;Lvh;B)V")
    public static final void method508(class64 arg0, boolean arg1, class108 arg2, class108 arg3, byte arg4) {
        class107.field1912 = arg1;
        if (arg4 != 69) {
            method508((class64) null, false, (class108) null, (class108) null, (byte) 105);
        }
        class10.field127 = arg2;
        class215.field3629 = arg3;
        field1318++;
        int var5 = class10.field127.method757(-1) - 1;
        class23.field354 = var5 * 256 + class10.field127.method754(117, var5);
        class114.field2049 = arg0;
        class185.field3001 = new String[] { null, null, null, null, class239.field3920 };
        class250.field4102 = new String[] { null, null, class96.field1655, null, null };
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(B)Z")
    public final synchronized boolean method509(byte arg0) {
        field1319++;
        return arg0 == 65 ? this.field1289.method891() : true;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(IB)V")
    private final void method510(int arg0, byte arg1) {
        if (arg1 > -110) {
            this.method475(76, false, (class10) null);
        }
        for (class10 var3 = (class10) this.field1347.field4098.method379(6347); var3 != null; var3 = (class10) this.field1347.field4098.method378(-44)) {
            if ((arg0 < 0 || var3.field132 == arg0) && var3.field125 < 0) {
                this.field1321[var3.field132][var3.field135] = null;
                var3.field125 = 0;
            }
        }
        field1309++;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(ZI)V")
    public static final void method511(boolean arg0, int arg1) {
        class97.method614(arg1 ^ 0x6222);
        field1296++;
        if (class59.field1026 != 30 && class59.field1026 != 25) {
            return;
        }
        class205.field3361++;
        if (class205.field3361 < 50 && !arg0) {
            return;
        }
        class205.field3361 = 0;
        if (!class35.field506 && class194.field3131 != null) {
            class168.field2778.method199(245, arg1 - 7909);
            class216.field3642++;
            try {
                class194.field3131.method1382(class168.field2778.field1730, class168.field2778.field1762, 0, (byte) -104);
                class168.field2778.field1762 = 0;
            } catch (IOException var2) {
                class35.field506 = true;
            }
        }
        class97.method614(32067);
        if (arg1 != 8033) {
            method499((byte) -60);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILug;Lvh;ILeb;)Z")
    public final synchronized boolean method512(int arg0, class185 arg1, class108 arg2, int arg3, class34 arg4) {
        field1273++;
        arg4.method223();
        if (arg3 < 91) {
            this.field1316 = -8;
        }
        boolean var6 = true;
        int[] var7 = null;
        if (arg0 > 0) {
            var7 = new int[] { arg0 };
        }
        for (class209 var8 = (class209) arg4.field484.method782(0); var8 != null; var8 = (class209) arg4.field484.method788(true)) {
            int var9 = (int) var8.field1515;
            class248 var10 = (class248) this.field1282.method779(-84, (long) var9);
            if (var10 == null) {
                var10 = class80.method517(true, var9, arg2);
                if (var10 == null) {
                    var6 = false;
                    continue;
                }
                this.field1282.method780((byte) -78, (long) var9, var10);
            }
            if (!var10.method1661(var7, var8.field3545, false, arg1)) {
                var6 = false;
            }
        }
        if (var6) {
            arg4.method224();
        }
        return var6;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(II)V")
    private final void method513(int arg0, int arg1) {
        field1277++;
        int var3 = arg0 & 0xF0;
        if (var3 == 128) {
            int var4 = arg0 & 0xF;
            int var5 = arg0 >> 8 & 0x7F;
            int var6 = (arg0 & 0x7F500C) >> 16;
            this.method483(var5, var4, (byte) 63, var6);
        } else if (var3 == 144) {
            int var7 = (arg0 & 0x7F04) >> 8;
            int var8 = arg0 & 0xF;
            int var9 = arg0 >> 16 & 0x7F;
            if (var9 <= 0) {
                this.method483(var7, var8, (byte) 60, 64);
            } else {
                this.method474(true, var8, var9, var7);
            }
        } else if (var3 == 160) {
            int var10 = arg0 & 0xF;
            int var11 = arg0 >> 8 & 0x7F;
            int var12 = (arg0 & 0x7F2966) >> 16;
            this.method494(var12, -94, var11, var10);
        } else {
            int var13 = 55 % ((arg1 - 28) / 53);
            if (var3 == 176) {
                int var14 = arg0 & 0xF;
                int var15 = arg0 >> 16 & 0x7F;
                int var16 = (arg0 & 0x7F9E) >> 8;
                if (var16 == 0) {
                    this.field1304[var14] = class113.method791(this.field1304[var14], -2080769) + (var15 << 14);
                }
                if (var16 == 32) {
                    this.field1304[var14] = class113.method791(-16257, this.field1304[var14]) + (var15 << 7);
                }
                if (var16 == 1) {
                    this.field1307[var14] = (var15 << 7) + class113.method791(this.field1307[var14], -16257);
                }
                if (var16 == 33) {
                    this.field1307[var14] = class113.method791(-128, this.field1307[var14]) + var15;
                }
                if (var16 == 5) {
                    this.field1287[var14] = (var15 << 7) + class113.method791(this.field1287[var14], -16257);
                }
                if (var16 == 37) {
                    this.field1287[var14] = class113.method791(-128, this.field1287[var14]) + var15;
                }
                if (var16 == 7) {
                    this.field1324[var14] = class113.method791(this.field1324[var14], -16257) + (var15 << 7);
                }
                if (var16 == 39) {
                    this.field1324[var14] = var15 + class113.method791(this.field1324[var14], -128);
                }
                if (var16 == 10) {
                    this.field1313[var14] = class113.method791(-16257, this.field1313[var14]) + (var15 << 7);
                }
                if (var16 == 42) {
                    this.field1313[var14] = var15 + class113.method791(this.field1313[var14], -128);
                }
                if (var16 == 11) {
                    this.field1315[var14] = class113.method791(-16257, this.field1315[var14]) + (var15 << 7);
                }
                if (var16 == 43) {
                    this.field1315[var14] = class113.method791(this.field1315[var14], -128) + var15;
                }
                if (var16 == 64) {
                    if (var15 < 64) {
                        this.field1302[var14] = class113.method791(this.field1302[var14], -2);
                    } else {
                        this.field1302[var14] = class112.method789(this.field1302[var14], 1);
                    }
                }
                if (var16 == 65) {
                    if (var15 < 64) {
                        this.method491(false, var14);
                        this.field1302[var14] = class113.method791(this.field1302[var14], -3);
                    } else {
                        this.field1302[var14] = class112.method789(this.field1302[var14], 2);
                    }
                }
                if (var16 == 99) {
                    this.field1314[var14] = (var15 << 7) + class113.method791(127, this.field1314[var14]);
                }
                if (var16 == 98) {
                    this.field1314[var14] = var15 + class113.method791(16256, this.field1314[var14]);
                }
                if (var16 == 101) {
                    this.field1314[var14] = class113.method791(127, this.field1314[var14]) + (var15 << 7) + 16384;
                }
                if (var16 == 100) {
                    this.field1314[var14] = class113.method791(this.field1314[var14], 16256) + var15 + 16384;
                }
                if (var16 == 120) {
                    this.method514((byte) 123, var14);
                }
                if (var16 == 121) {
                    this.method479(0, var14);
                }
                if (var16 == 123) {
                    this.method510(var14, (byte) -126);
                }
                if (var16 == 6) {
                    int var17 = this.field1314[var14];
                    if (var17 == 16384) {
                        this.field1286[var14] = (var15 << 7) + class113.method791(this.field1286[var14], -16257);
                    }
                }
                if (var16 == 38) {
                    int var18 = this.field1314[var14];
                    if (var18 == 16384) {
                        this.field1286[var14] = class113.method791(-128, this.field1286[var14]) + var15;
                    }
                }
                if (var16 == 16) {
                    this.field1331[var14] = class113.method791(-16257, this.field1331[var14]) + (var15 << 7);
                }
                if (var16 == 48) {
                    this.field1331[var14] = class113.method791(this.field1331[var14], -128) + var15;
                }
                if (var16 == 81) {
                    if (var15 >= 64) {
                        this.field1302[var14] = class112.method789(this.field1302[var14], 4);
                    } else {
                        this.method487(var14, (byte) -43);
                        this.field1302[var14] = class113.method791(this.field1302[var14], -5);
                    }
                }
                if (var16 == 17) {
                    this.method484(15020, var14, (var15 << 7) + (this.field1340[var14] & 0xFFFFC07F));
                }
                if (var16 == 49) {
                    this.method484(15020, var14, (this.field1340[var14] & 0xFFFFFF80) + var15);
                }
            } else if (var3 == 192) {
                int var19 = (arg0 & 0x7FC3) >> 8;
                int var20 = arg0 & 0xF;
                this.method503(this.field1304[var20] + var19, var20, -1095);
            } else if (var3 == 208) {
                int var21 = arg0 & 0xF;
                int var22 = (arg0 & 0x7FAE) >> 8;
                this.method477(-106, var22, var21);
            } else if (var3 == 224) {
                int var23 = arg0 & 0xF;
                int var24 = ((arg0 & 0x7F0029) >> 9) + ((arg0 & 0x7FD1) >> 8);
                this.method478(-11809, var24, var23);
            } else {
                int var25 = arg0 & 0xFF;
                if (var25 == 255) {
                    this.method496((byte) 56, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "()Lok;")
    public final synchronized class40 method252() {
        field1281++;
        return null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BI)V")
    private final void method514(byte arg0, int arg1) {
        for (class10 var3 = (class10) this.field1347.field4098.method379(6347); var3 != null; var3 = (class10) this.field1347.field4098.method378(82)) {
            if (arg1 < 0 || var3.field132 == arg1) {
                if (var3.field142 != null) {
                    var3.field142.method1891(class81.field1478 / 100);
                    if (var3.field142.method1884()) {
                        this.field1347.field4103.method254(var3.field142);
                    }
                    var3.method69(false);
                }
                if (var3.field125 < 0) {
                    this.field1321[var3.field132][var3.field135] = null;
                }
                var3.method547(10026);
            }
        }
        field1327++;
        if (arg0 <= 121) {
            method508((class64) null, false, (class108) null, (class108) null, (byte) 114);
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    public class78() {
        this.method506(-49, -1, 256);
        this.method496((byte) 56, true);
    }
}
