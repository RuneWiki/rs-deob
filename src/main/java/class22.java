import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class22 extends class59 {

    @OriginalMember(owner = "client!qo", name = "Ib", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field399 = new Hashtable();

    @OriginalMember(owner = "client!qo", name = "ne", descriptor = "I")
    public int field534 = 128;

    @OriginalMember(owner = "client!qo", name = "me", descriptor = "Lsn;")
    private class631 field533 = new class631();

    @OriginalMember(owner = "client!qo", name = "Ae", descriptor = "Liaa;")
    private class495 field547 = new class495();

    @OriginalMember(owner = "client!qo", name = "Ee", descriptor = "Liaa;")
    public class495 field551 = new class495();

    @OriginalMember(owner = "client!qo", name = "Ge", descriptor = "I")
    public int field553 = 3;

    @OriginalMember(owner = "client!qo", name = "Je", descriptor = "Z")
    private boolean field556 = false;

    @OriginalMember(owner = "client!qo", name = "Ie", descriptor = "I")
    public int field555 = 8;

    @OriginalMember(owner = "client!qo", name = "He", descriptor = "Luh;")
    private class168 field554 = new class168();

    @OriginalMember(owner = "client!qo", name = "Me", descriptor = "[Ltv;")
    private class560[] field559 = new class560[4];

    @OriginalMember(owner = "client!qo", name = "Ne", descriptor = "I")
    private int field560 = -1;

    @OriginalMember(owner = "client!qo", name = "Re", descriptor = "I")
    private int field564 = -1;

    @OriginalMember(owner = "client!qo", name = "Qe", descriptor = "[Ltv;")
    private class560[] field563 = new class560[4];

    @OriginalMember(owner = "client!qo", name = "Se", descriptor = "[Ltv;")
    private class560[] field565 = new class560[4];

    @OriginalMember(owner = "client!qo", name = "Ve", descriptor = "I")
    private int field568 = -1;

    @OriginalMember(owner = "client!qo", name = "Ye", descriptor = "Luh;")
    private class168 field571;

    @OriginalMember(owner = "client!qo", name = "af", descriptor = "Luh;")
    private class168 field573;

    @OriginalMember(owner = "client!qo", name = "bf", descriptor = "Luh;")
    private class168 field574;

    @OriginalMember(owner = "client!qo", name = "cf", descriptor = "Luh;")
    private class168 field575;

    @OriginalMember(owner = "client!qo", name = "df", descriptor = "Luh;")
    private class168 field576;

    @OriginalMember(owner = "client!qo", name = "ef", descriptor = "Luh;")
    private class168 field577;

    @OriginalMember(owner = "client!qo", name = "ff", descriptor = "Luh;")
    private class168 field578;

    @OriginalMember(owner = "client!qo", name = "kf", descriptor = "Liaa;")
    public class495 field582;

    @OriginalMember(owner = "client!qo", name = "qf", descriptor = "Liaa;")
    public class495 field588;

    @OriginalMember(owner = "client!qo", name = "rf", descriptor = "Liaa;")
    public class495 field589;

    @OriginalMember(owner = "client!qo", name = "uf", descriptor = "I")
    private int field592;

    @OriginalMember(owner = "client!qo", name = "Kf", descriptor = "F")
    private float field608;

    @OriginalMember(owner = "client!qo", name = "xf", descriptor = "I")
    private int field595;

    @OriginalMember(owner = "client!qo", name = "Ff", descriptor = "F")
    public float field603;

    @OriginalMember(owner = "client!qo", name = "eg", descriptor = "I")
    public int field628;

    @OriginalMember(owner = "client!qo", name = "vf", descriptor = "I")
    public int field593;

    @OriginalMember(owner = "client!qo", name = "Yf", descriptor = "F")
    private float field622;

    @OriginalMember(owner = "client!qo", name = "gg", descriptor = "I")
    private int field630;

    @OriginalMember(owner = "client!qo", name = "og", descriptor = "F")
    public float field638;

    @OriginalMember(owner = "client!qo", name = "cg", descriptor = "I")
    private int field626;

    @OriginalMember(owner = "client!qo", name = "Bg", descriptor = "F")
    private float field651;

    @OriginalMember(owner = "client!qo", name = "ig", descriptor = "I")
    public int field632;

    @OriginalMember(owner = "client!qo", name = "Eg", descriptor = "F")
    public float field654;

    @OriginalMember(owner = "client!qo", name = "xg", descriptor = "[F")
    public float[] field647;

    @OriginalMember(owner = "client!qo", name = "hg", descriptor = "I")
    public int field631;

    @OriginalMember(owner = "client!qo", name = "jg", descriptor = "[F")
    private float[] field633;

    @OriginalMember(owner = "client!qo", name = "vg", descriptor = "F")
    public float field645;

    @OriginalMember(owner = "client!qo", name = "Sf", descriptor = "I")
    public int field616;

    @OriginalMember(owner = "client!qo", name = "mg", descriptor = "I")
    private int field636;

    @OriginalMember(owner = "client!qo", name = "bh", descriptor = "I")
    private int field677;

    @OriginalMember(owner = "client!qo", name = "dh", descriptor = "F")
    private float field679;

    @OriginalMember(owner = "client!qo", name = "Lf", descriptor = "I")
    private int field609;

    @OriginalMember(owner = "client!qo", name = "fh", descriptor = "Z")
    private boolean field681;

    @OriginalMember(owner = "client!qo", name = "Wg", descriptor = "[F")
    private float[] field672;

    @OriginalMember(owner = "client!qo", name = "Xg", descriptor = "F")
    private float field673;

    @OriginalMember(owner = "client!qo", name = "yg", descriptor = "I")
    public int field648;

    @OriginalMember(owner = "client!qo", name = "hh", descriptor = "I")
    private int field683;

    @OriginalMember(owner = "client!qo", name = "lg", descriptor = "I")
    public int field635;

    @OriginalMember(owner = "client!qo", name = "ch", descriptor = "I")
    public int field678;

    @OriginalMember(owner = "client!qo", name = "oh", descriptor = "I")
    private int field690;

    @OriginalMember(owner = "client!qo", name = "Df", descriptor = "[F")
    private float[] field601;

    @OriginalMember(owner = "client!qo", name = "qh", descriptor = "Z")
    private boolean field692;

    @OriginalMember(owner = "client!qo", name = "rh", descriptor = "F")
    public float field693;

    @OriginalMember(owner = "client!qo", name = "eh", descriptor = "[Lab;")
    private class669[] field680;

    @OriginalMember(owner = "client!qo", name = "Zg", descriptor = "I")
    public int field675;

    @OriginalMember(owner = "client!qo", name = "nh", descriptor = "I")
    private int field689;

    @OriginalMember(owner = "client!qo", name = "vh", descriptor = "F")
    public float field697;

    @OriginalMember(owner = "client!qo", name = "uh", descriptor = "F")
    public float field696;

    @OriginalMember(owner = "client!qo", name = "Ug", descriptor = "I")
    public int field670;

    @OriginalMember(owner = "client!qo", name = "xh", descriptor = "[F")
    private float[] field699;

    @OriginalMember(owner = "client!qo", name = "Gf", descriptor = "I")
    public int field604;

    @OriginalMember(owner = "client!qo", name = "Wf", descriptor = "Lgh;")
    public class548 field620;

    @OriginalMember(owner = "client!qo", name = "zh", descriptor = "[B")
    public byte[] field701;

    @OriginalMember(owner = "client!qo", name = "Ah", descriptor = "[I")
    public int[] field702;

    @OriginalMember(owner = "client!qo", name = "Dh", descriptor = "[I")
    public int[] field705;

    @OriginalMember(owner = "client!qo", name = "Ch", descriptor = "[I")
    public int[] field704;

    @OriginalMember(owner = "client!qo", name = "Fc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field448;

    @OriginalMember(owner = "client!qo", name = "Gb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field397;

    @OriginalMember(owner = "client!qo", name = "oe", descriptor = "I")
    public int field535;

    @OriginalMember(owner = "client!qo", name = "rd", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field486;

    @OriginalMember(owner = "client!qo", name = "kb", descriptor = "J")
    private long field375;

    @OriginalMember(owner = "client!qo", name = "Pc", descriptor = "J")
    private long field458;

    @OriginalMember(owner = "client!qo", name = "zf", descriptor = "Z")
    public boolean field597;

    @OriginalMember(owner = "client!qo", name = "kg", descriptor = "I")
    public int field634;

    @OriginalMember(owner = "client!qo", name = "Of", descriptor = "Ljava/lang/String;")
    private String field612;

    @OriginalMember(owner = "client!qo", name = "th", descriptor = "Z")
    private boolean field695;

    @OriginalMember(owner = "client!qo", name = "Dg", descriptor = "Z")
    public boolean field653;

    @OriginalMember(owner = "client!qo", name = "qg", descriptor = "Z")
    public boolean field640;

    @OriginalMember(owner = "client!qo", name = "Jg", descriptor = "Z")
    public boolean field659;

    @OriginalMember(owner = "client!qo", name = "Tg", descriptor = "Z")
    public boolean field669;

    @OriginalMember(owner = "client!qo", name = "ph", descriptor = "Z")
    private boolean field691;

    @OriginalMember(owner = "client!qo", name = "Rg", descriptor = "Ljava/lang/String;")
    private String field667;

    @OriginalMember(owner = "client!qo", name = "sg", descriptor = "Z")
    public boolean field642;

    @OriginalMember(owner = "client!qo", name = "yf", descriptor = "Z")
    private boolean field596;

    @OriginalMember(owner = "client!qo", name = "ye", descriptor = "Leo;")
    private class299 field545;

    @OriginalMember(owner = "client!qo", name = "Le", descriptor = "Lqi;")
    public class567 field558;

    @OriginalMember(owner = "client!qo", name = "ve", descriptor = "Lhh;")
    private class131 field542;

    @OriginalMember(owner = "client!qo", name = "we", descriptor = "Lrda;")
    private class662 field543;

    @OriginalMember(owner = "client!qo", name = "ie", descriptor = "Lmea;")
    private class431 field529;

    @OriginalMember(owner = "client!qo", name = "td", descriptor = "I")
    public static int field488 = 503;

    @OriginalMember(owner = "client!qo", name = "lb", descriptor = "Lej;")
    public static class124 field376 = new class124(52, 4);

    @OriginalMember(owner = "client!qo", name = "qe", descriptor = "Lej;")
    public static class124 field537 = new class124(58, 4);

    @OriginalMember(owner = "client!qo", name = "xe", descriptor = "I")
    public static int field544 = 0;

    @OriginalMember(owner = "client!qo", name = "sf", descriptor = "F")
    public float field590;

    @OriginalMember(owner = "client!qo", name = "Qf", descriptor = "F")
    public float field614;

    @OriginalMember(owner = "client!qo", name = "wg", descriptor = "F")
    private float field646;

    @OriginalMember(owner = "client!qo", name = "Cg", descriptor = "F")
    public float field652;

    @OriginalMember(owner = "client!qo", name = "Hg", descriptor = "F")
    public float field657;

    @OriginalMember(owner = "client!qo", name = "Ig", descriptor = "F")
    public float field658;

    @OriginalMember(owner = "client!qo", name = "Og", descriptor = "F")
    private float field664;

    @OriginalMember(owner = "client!qo", name = "ah", descriptor = "F")
    private float field676;

    @OriginalMember(owner = "client!qo", name = "sh", descriptor = "F")
    public float field694;

    @OriginalMember(owner = "client!qo", name = "x", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!qo", name = "y", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!qo", name = "z", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!qo", name = "A", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!qo", name = "B", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!qo", name = "C", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!qo", name = "D", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!qo", name = "E", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!qo", name = "F", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!qo", name = "G", descriptor = "I")
    private int field345;

    @OriginalMember(owner = "client!qo", name = "H", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!qo", name = "I", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!qo", name = "J", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!qo", name = "K", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!qo", name = "L", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!qo", name = "M", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!qo", name = "N", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!qo", name = "O", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!qo", name = "P", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!qo", name = "Q", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!qo", name = "R", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!qo", name = "S", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!qo", name = "T", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!qo", name = "U", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!qo", name = "V", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!qo", name = "W", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!qo", name = "X", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!qo", name = "Y", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!qo", name = "Z", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!qo", name = "ab", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!qo", name = "bb", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!qo", name = "cb", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!qo", name = "db", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!qo", name = "eb", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!qo", name = "fb", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!qo", name = "gb", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!qo", name = "hb", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!qo", name = "ib", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!qo", name = "jb", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!qo", name = "mb", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!qo", name = "nb", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!qo", name = "ob", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!qo", name = "pb", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!qo", name = "qb", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!qo", name = "rb", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!qo", name = "sb", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!qo", name = "tb", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!qo", name = "ub", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!qo", name = "vb", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!qo", name = "wb", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!qo", name = "xb", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!qo", name = "yb", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!qo", name = "zb", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!qo", name = "Ab", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!qo", name = "Bb", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!qo", name = "Cb", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!qo", name = "Db", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!qo", name = "Eb", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!qo", name = "Fb", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!qo", name = "Hb", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!qo", name = "Jb", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!qo", name = "Kb", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!qo", name = "Lb", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!qo", name = "Mb", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!qo", name = "Nb", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!qo", name = "Ob", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!qo", name = "Pb", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!qo", name = "Qb", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!qo", name = "Rb", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!qo", name = "Sb", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!qo", name = "Tb", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!qo", name = "Ub", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!qo", name = "Vb", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!qo", name = "Wb", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!qo", name = "Xb", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!qo", name = "Yb", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!qo", name = "Zb", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!qo", name = "ac", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!qo", name = "bc", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!qo", name = "cc", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!qo", name = "dc", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!qo", name = "ec", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!qo", name = "fc", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!qo", name = "gc", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!qo", name = "hc", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!qo", name = "ic", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!qo", name = "jc", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!qo", name = "kc", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!qo", name = "lc", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!qo", name = "mc", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!qo", name = "nc", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!qo", name = "oc", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!qo", name = "pc", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!qo", name = "qc", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!qo", name = "rc", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!qo", name = "sc", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!qo", name = "tc", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!qo", name = "uc", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!qo", name = "vc", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!qo", name = "wc", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!qo", name = "xc", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!qo", name = "yc", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!qo", name = "zc", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!qo", name = "Ac", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!qo", name = "Bc", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!qo", name = "Cc", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!qo", name = "Dc", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!qo", name = "Ec", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!qo", name = "Gc", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!qo", name = "Hc", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!qo", name = "Ic", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!qo", name = "Jc", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!qo", name = "Kc", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!qo", name = "Lc", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!qo", name = "Mc", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!qo", name = "Nc", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!qo", name = "Oc", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!qo", name = "Qc", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!qo", name = "Rc", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!qo", name = "Sc", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!qo", name = "Tc", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!qo", name = "Uc", descriptor = "I")
    public int field463;

    @OriginalMember(owner = "client!qo", name = "Vc", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!qo", name = "Wc", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!qo", name = "Xc", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!qo", name = "Yc", descriptor = "I")
    private int field467;

    @OriginalMember(owner = "client!qo", name = "Zc", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!qo", name = "ad", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!qo", name = "bd", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!qo", name = "cd", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!qo", name = "dd", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!qo", name = "ed", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!qo", name = "fd", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!qo", name = "gd", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!qo", name = "hd", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!qo", name = "id", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!qo", name = "jd", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!qo", name = "kd", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!qo", name = "ld", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!qo", name = "md", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!qo", name = "nd", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!qo", name = "od", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!qo", name = "pd", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!qo", name = "qd", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!qo", name = "sd", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!qo", name = "ud", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!qo", name = "vd", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!qo", name = "wd", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!qo", name = "xd", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!qo", name = "yd", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!qo", name = "zd", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!qo", name = "Ad", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!qo", name = "Bd", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!qo", name = "Cd", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!qo", name = "Dd", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!qo", name = "Ed", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!qo", name = "Fd", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!qo", name = "Gd", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!qo", name = "Hd", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!qo", name = "Id", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!qo", name = "Jd", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!qo", name = "Kd", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!qo", name = "Ld", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!qo", name = "Md", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!qo", name = "Nd", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!qo", name = "Od", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!qo", name = "Pd", descriptor = "I")
    public int field510;

    @OriginalMember(owner = "client!qo", name = "Qd", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!qo", name = "Rd", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!qo", name = "Sd", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!qo", name = "Td", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!qo", name = "Ud", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!qo", name = "Vd", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!qo", name = "Wd", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!qo", name = "Xd", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!qo", name = "Yd", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!qo", name = "Zd", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!qo", name = "ae", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!qo", name = "be", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!qo", name = "ce", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!qo", name = "de", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!qo", name = "ee", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!qo", name = "fe", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!qo", name = "ge", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!qo", name = "he", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!qo", name = "je", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!qo", name = "ke", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!qo", name = "le", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!qo", name = "pe", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!qo", name = "re", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!qo", name = "se", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!qo", name = "te", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!qo", name = "ue", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!qo", name = "ze", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!qo", name = "Be", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!qo", name = "Ce", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!qo", name = "De", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!qo", name = "Ke", descriptor = "I")
    public int field557;

    @OriginalMember(owner = "client!qo", name = "We", descriptor = "I")
    public int field569;

    @OriginalMember(owner = "client!qo", name = "Xe", descriptor = "I")
    public int field570;

    @OriginalMember(owner = "client!qo", name = "Ze", descriptor = "I")
    private int field572;

    @OriginalMember(owner = "client!qo", name = "mf", descriptor = "I")
    private int field584;

    @OriginalMember(owner = "client!qo", name = "of", descriptor = "I")
    private int field586;

    @OriginalMember(owner = "client!qo", name = "pf", descriptor = "I")
    private int field587;

    @OriginalMember(owner = "client!qo", name = "wf", descriptor = "I")
    public int field594;

    @OriginalMember(owner = "client!qo", name = "Bf", descriptor = "I")
    public int field599;

    @OriginalMember(owner = "client!qo", name = "Mf", descriptor = "I")
    public int field610;

    @OriginalMember(owner = "client!qo", name = "Nf", descriptor = "I")
    private int field611;

    @OriginalMember(owner = "client!qo", name = "Tf", descriptor = "I")
    public int field617;

    @OriginalMember(owner = "client!qo", name = "Uf", descriptor = "I")
    private int field618;

    @OriginalMember(owner = "client!qo", name = "Xf", descriptor = "I")
    private int field621;

    @OriginalMember(owner = "client!qo", name = "rg", descriptor = "I")
    private int field641;

    @OriginalMember(owner = "client!qo", name = "Lg", descriptor = "I")
    private int field661;

    @OriginalMember(owner = "client!qo", name = "ih", descriptor = "I")
    private int field684;

    @OriginalMember(owner = "client!qo", name = "lh", descriptor = "I")
    private int field687;

    @OriginalMember(owner = "client!qo", name = "wh", descriptor = "I")
    private int field698;

    @OriginalMember(owner = "client!qo", name = "yh", descriptor = "I")
    private int field700;

    @OriginalMember(owner = "client!qo", name = "Bh", descriptor = "I")
    private int field703;

    @OriginalMember(owner = "client!qo", name = "gf", descriptor = "J")
    private long field579;

    @OriginalMember(owner = "client!qo", name = "tf", descriptor = "Ldp;")
    private class3 field591;

    @OriginalMember(owner = "client!qo", name = "Vf", descriptor = "Lhca;")
    private class490 field619;

    @OriginalMember(owner = "client!qo", name = "Yg", descriptor = "Lhca;")
    private class490 field674;

    @OriginalMember(owner = "client!qo", name = "pg", descriptor = "Lni;")
    private class522 field639;

    @OriginalMember(owner = "client!qo", name = "zg", descriptor = "Ltp;")
    public class533 field649;

    @OriginalMember(owner = "client!qo", name = "Te", descriptor = "Lnda;")
    private class557 field566;

    @OriginalMember(owner = "client!qo", name = "Pe", descriptor = "Ltv;")
    private class560 field562;

    @OriginalMember(owner = "client!qo", name = "Ue", descriptor = "Ltv;")
    private class560 field567;

    @OriginalMember(owner = "client!qo", name = "Af", descriptor = "Leba;")
    private class588 field598;

    @OriginalMember(owner = "client!qo", name = "Ef", descriptor = "Lpaa;")
    public class624 field602;

    @OriginalMember(owner = "client!qo", name = "Jf", descriptor = "Lpaa;")
    public class624 field607;

    @OriginalMember(owner = "client!qo", name = "ag", descriptor = "Lpaa;")
    public class624 field624;

    @OriginalMember(owner = "client!qo", name = "bg", descriptor = "Lpaa;")
    public class624 field625;

    @OriginalMember(owner = "client!qo", name = "tg", descriptor = "Lpaa;")
    public class624 field643;

    @OriginalMember(owner = "client!qo", name = "Gg", descriptor = "Lpaa;")
    public class624 field656;

    @OriginalMember(owner = "client!qo", name = "Kg", descriptor = "Lpaa;")
    public class624 field660;

    @OriginalMember(owner = "client!qo", name = "Mg", descriptor = "Lpaa;")
    public class624 field662;

    @OriginalMember(owner = "client!qo", name = "Qg", descriptor = "Lpaa;")
    public class624 field666;

    @OriginalMember(owner = "client!qo", name = "kh", descriptor = "Lpaa;")
    public class624 field686;

    @OriginalMember(owner = "client!qo", name = "Oe", descriptor = "Lrg;")
    private class643 field561;

    @OriginalMember(owner = "client!qo", name = "Cf", descriptor = "Lrg;")
    public class643 field600;

    @OriginalMember(owner = "client!qo", name = "Fg", descriptor = "Lnh;")
    public class744 field655;

    @OriginalMember(owner = "client!qo", name = "Vg", descriptor = "Lnh;")
    public class744 field671;

    @OriginalMember(owner = "client!qo", name = "Fe", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field552;

    @OriginalMember(owner = "client!qo", name = "hf", descriptor = "Z")
    private boolean field580;

    @OriginalMember(owner = "client!qo", name = "jf", descriptor = "Z")
    private boolean field581;

    @OriginalMember(owner = "client!qo", name = "lf", descriptor = "Z")
    private boolean field583;

    @OriginalMember(owner = "client!qo", name = "nf", descriptor = "Z")
    private boolean field585;

    @OriginalMember(owner = "client!qo", name = "Hf", descriptor = "Z")
    public boolean field605;

    @OriginalMember(owner = "client!qo", name = "If", descriptor = "Z")
    private boolean field606;

    @OriginalMember(owner = "client!qo", name = "Pf", descriptor = "Z")
    public boolean field613;

    @OriginalMember(owner = "client!qo", name = "Rf", descriptor = "Z")
    public boolean field615;

    @OriginalMember(owner = "client!qo", name = "Zf", descriptor = "Z")
    private boolean field623;

    @OriginalMember(owner = "client!qo", name = "dg", descriptor = "Z")
    private boolean field627;

    @OriginalMember(owner = "client!qo", name = "fg", descriptor = "Z")
    public boolean field629;

    @OriginalMember(owner = "client!qo", name = "ng", descriptor = "Z")
    public boolean field637;

    @OriginalMember(owner = "client!qo", name = "ug", descriptor = "Z")
    private boolean field644;

    @OriginalMember(owner = "client!qo", name = "Ng", descriptor = "Z")
    public boolean field663;

    @OriginalMember(owner = "client!qo", name = "Pg", descriptor = "Z")
    private boolean field665;

    @OriginalMember(owner = "client!qo", name = "Sg", descriptor = "Z")
    public boolean field668;

    @OriginalMember(owner = "client!qo", name = "gh", descriptor = "Z")
    private boolean field682;

    @OriginalMember(owner = "client!qo", name = "jh", descriptor = "Z")
    public boolean field685;

    @OriginalMember(owner = "client!qo", name = "mh", descriptor = "Z")
    private boolean field688;

    @OriginalMember(owner = "client!qo", name = "Ag", descriptor = "[Lud;")
    private class36[] field650;

    @OriginalMember(owner = "client!qo", name = "L", descriptor = "(III)V", line = 5)
    public final void method172(int arg0, int arg1, int arg2) {
        if (~this.field678 != ~arg0 || ~this.field604 != ~arg1 || this.field635 != arg2) {
            this.field604 = arg1;
            this.field678 = arg0;
            this.field635 = arg2;
            this.method346(16711680);
            this.method180(92);
        }
        ++field516;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZI)V", line = 25)
    public final void method173(boolean arg0, int arg1) {
        if (this.field606 != arg0) {
            this.field606 = arg0;
            this.method250((byte) -121);
            this.field587 &= -8;
        }
        if (arg1 < 18) {
            this.field626 = -98;
        }
        ++field505;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lbh;IIII)Lka;", line = 46)
    public final class472 method174(class37 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field401;
        return new class624(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IBI)V", line = 55)
    public final void method175(int arg0, byte arg1, int arg2) {
        if (this.field698 != 0) {
            OpenGL.glTexEnvi(8960, 34161, arg0);
            OpenGL.glTexEnvi(8960, 34162, arg2);
        } else {
            boolean var4 = false;
            if (this.field626 != arg0) {
                OpenGL.glTexEnvi(8960, 34161, arg0);
                var4 = true;
                this.field626 = arg0;
            }
            if (~this.field683 != ~arg2) {
                OpenGL.glTexEnvi(8960, 34162, arg2);
                this.field683 = arg2;
                var4 = true;
            }
            if (var4) {
                this.field587 &= -30;
            }
        }
        int var5 = -14 / ((arg1 - 46) / 46);
        ++field477;
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(B)V", line = 97)
    private final void method176(byte arg0) {
        OpenGL.glMatrixMode(5889);
        ++field515;
        OpenGL.glLoadMatrixf(this.field601, 0);
        OpenGL.glMatrixMode(5888);
        if (arg0 <= 113) {
            this.method249(-64);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lwh;)V", line = 111)
    public final void method177(class149 arg0) {
        ++field372;
        this.field591 = (class3) arg0;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZI[BI)Lhca;", line = 119)
    public final class490 method178(int arg0, boolean arg1, int arg2, byte[] arg3, int arg4) {
        if (arg0 != 2) {
            this.method286((byte) -13, 54);
        }
        ++field352;
        return (class490) (!this.field695 || arg1 && !this.field691 ? new class182(this, arg2, arg3, arg4) : new class106(this, arg2, arg3, arg4, arg1));
    }

    @OriginalMember(owner = "client!qo", name = "DA", descriptor = "(IIII)V", line = 136)
    public final void method179(int arg0, int arg1, int arg2, int arg3) {
        this.field593 = arg2;
        this.field616 = arg3;
        this.field632 = arg1;
        this.field675 = arg0;
        ++field380;
        this.method354(96);
        this.method260((byte) 124);
        if (this.field687 == 3) {
            this.method203((byte) -63);
        } else if (~this.field687 == -3) {
            this.method176((byte) 119);
        }
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)V", line = 159)
    private final void method180(int arg0) {
        if (this.field623 && this.field604 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        int var2 = 96 % (arg0 / 63);
        ++field451;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(III[BZ)Lni;", line = 174)
    public final class522 method181(int arg0, int arg1, int arg2, byte[] arg3, boolean arg4) {
        ++field387;
        if (arg1 >= -2) {
            this.method193();
        }
        return (class522) (!this.field695 || arg4 && !this.field691 ? new class35(this, arg0, arg3, arg2) : new class47(this, arg0, arg3, arg2, arg4));
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(Z)V", line = 192)
    public final void method182(boolean arg0) {
        OpenGL.glPopMatrix();
        ++field518;
        if (!arg0) {
            this.field594 = 37;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIIF)Lab;", line = 204)
    public final class669 method183(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field381;
        return new class465(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "(I)V", line = 214)
    public final void method184(int arg0) {
        if (arg0 != 9473) {
            this.method268(-10, -73, (int[]) null, (int[]) null);
        }
        if (~this.field587 != -5) {
            this.method240(arg0 ^ 12801);
            this.method357(false, 2);
            this.method173(false, 79);
            this.method215(arg0 ^ 9594, false);
            this.method205(0, false);
            this.method229(-2, -111);
            this.method222(1, 1);
            this.field587 = 4;
        }
        ++field336;
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(B)V", line = 237)
    public static void method185(byte arg0) {
        field376 = null;
        field537 = null;
        if (arg0 < 27) {
            field537 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "XA", descriptor = "()I", line = 251)
    public final int method186() {
        ++field528;
        return this.field636;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIIILaa;II)V", line = 264)
    public final void method187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class487 arg6, int arg7, int arg8) {
        ++field549;
        class683 var10 = (class683) arg6;
        class588 var11 = var10.field9252;
        this.method314(110);
        this.method256((byte) -88, var10.field9252);
        this.method222(arg5, 1);
        this.method175(7681, (byte) 97, 8448);
        this.method239(34167, 768, (byte) -87, 0);
        float var12 = var11.field8014 / (float) var11.field8017;
        float var13 = var11.field8015 / (float) var11.field8016;
        float var14 = (float) arg2 - (float) arg0;
        float var15 = (float) arg3 - (float) arg1;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var14 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var18 = var15 * var16;
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var17 + 0.35F, (float) arg3 + var18 + 0.35F);
        OpenGL.glEnd();
        this.method239(5890, 768, (byte) -87, 0);
    }

    @OriginalMember(owner = "client!qo", name = "Y", descriptor = "()[I", line = 304)
    public final int[] method188() {
        ++field526;
        return new int[] { this.field675, this.field632, this.field593, this.field616 };
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(IBI)V", line = 312)
    public final synchronized void method189(int arg0, byte arg1, int arg2) {
        ++field498;
        class113 var4 = new class113(arg2);
        var4.field5204 = (long) arg0;
        int var5 = -124 / ((arg1 - 79) / 39);
        this.field574.method1273(var4, -20180);
    }

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "(II)V", line = 332)
    public final void method190(int arg0, int arg1) {
        if (arg0 != -15039) {
            this.field650 = null;
        }
        if (this.field698 != arg1) {
            OpenGL.glActiveTexture(arg1 + 33984);
            this.field698 = arg1;
        }
        ++field348;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILjaclib/memory/Buffer;ZII)Lhca;", line = 350)
    public final class490 method191(int arg0, Buffer arg1, boolean arg2, int arg3, int arg4) {
        if (arg0 != 8448) {
            this.field666 = null;
        }
        ++field427;
        return (class490) (!this.field695 || arg2 && !this.field691 ? new class182(this, arg3, arg1) : new class106(this, arg3, arg1, arg4, arg2));
    }

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "(I)V", line = 370)
    private final void method192(int arg0) {
        if (~this.field687 != -3) {
            this.field687 = 2;
            this.method176((byte) 125);
            this.method223((byte) 90);
            this.field587 &= -8;
        }
        if (arg0 != -14388) {
            this.field557 = -85;
        }
        ++field500;
    }

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "()Z", line = 389)
    public final boolean method193() {
        ++field378;
        return true;
    }

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "(I)Lq;", line = 397)
    public final class429 method194(int arg0) {
        ++field403;
        if (arg0 != 444720536) {
            this.field645 = 0.28610376F;
        }
        return this.field591 != null ? this.field591.method9((byte) -121) : null;
    }

    @OriginalMember(owner = "client!qo", name = "HA", descriptor = "(IIII[I)V", line = 409)
    public final void method195(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field503;
        float var6 = (float) arg2 * this.field582.field6883 + (float) arg0 * this.field582.field6855 + (float) arg1 * this.field582.field6853 + this.field582.field6850;
        if (!((float) this.field648 > var6) && !((float) this.field636 < var6)) {
            int var7 = (int) (((float) arg2 * this.field582.field6880 + (float) arg0 * this.field582.field6869 + (float) arg1 * this.field582.field6849 + this.field582.field6846) * (float) this.field593 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field582.field6861 + (float) arg0 * this.field582.field6860 + (float) arg1 * this.field582.field6868 + this.field582.field6871) * (float) this.field616 / (float) arg3);
            if ((float) var7 >= this.field694 && this.field657 >= (float) var7 && this.field658 <= (float) var8 && this.field652 >= (float) var8) {
                arg4[2] = (int) var6;
                arg4[1] = (int) ((float) var8 + -this.field658);
                arg4[0] = (int) ((float) var7 + -this.field694);
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!qo", name = "EA", descriptor = "(IIII)V", line = 440)
    public final void method196(int arg0, int arg1, int arg2, int arg3) {
        ++field354;
        if (!this.field668) {
            throw new RuntimeException("");
        } else {
            this.field610 = arg0;
            this.field628 = arg1;
            this.field670 = arg2;
            this.field631 = arg3;
            if (this.field681) {
                this.field529.field6170.method365(false);
                this.field529.field6170.method370(34336);
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "(I)V", line = 462)
    private final void method197(int arg0) {
        ++field460;
        if (~this.field687 != -4) {
            this.field687 = 3;
            this.method203((byte) -63);
            this.method223((byte) 89);
            this.field587 &= -8;
        }
        if (arg0 != 3) {
            this.field621 = -50;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(BLdb;)V", line = 482)
    public static final void method198(byte arg0, class324 arg1) {
        ++field508;
        if (arg0 != 6) {
            field537 = null;
        }
        if (arg1 != null) {
            class528.field7301.method1273(arg1, -20180);
            ++class192.field2844;
            Object var2 = null;
            class462 var5;
            if (!arg1.field4508 && !"".equals(arg1.field4498)) {
                long var3 = arg1.field4497;
                for (var5 = (class462) class324.field4500.method1465(var3, -6008); var5 != null && !var5.field6499.equals(arg1.field4498); var5 = (class462) class324.field4500.method1461(true)) {
                }
                if (var5 == null) {
                    var5 = (class462) class318.field4387.method992(var3, arg0 ^ 58);
                    if (var5 != null && !var5.field6499.equals(arg1.field4498)) {
                        var5 = null;
                    }
                    if (var5 == null) {
                        var5 = new class462(arg1.field4498);
                    }
                    class324.field4500.method1468((byte) 71, var3, var5);
                    ++class436.field6235;
                }
            } else {
                var5 = new class462(arg1.field4498);
                ++class436.field6235;
            }
            if (var5.method2730(arg1, -21)) {
                class164.method1245((byte) -39, var5);
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "()Z", line = 539)
    public final boolean method199() {
        ++field525;
        return true;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(FIF)V", line = 548)
    public final void method200(float arg0, int arg1, float arg2) {
        if (arg1 != 770) {
            this.field614 = 0.31055084F;
        }
        ++field393;
        this.field608 = arg0;
        this.field679 = arg2;
        this.method346(16711680);
    }

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "(B)V", line = 567)
    private final void method201(byte arg0) {
        ++field502;
        if (this.field397 != null) {
            Dimension var2 = this.field397.getSize();
            this.field467 = var2.width;
            this.field345 = var2.height;
        } else {
            this.field467 = this.field345 = 0;
        }
        if (arg0 > 61) {
            if (this.field562 == null) {
                this.field510 = this.field467;
                this.field463 = this.field345;
                this.method360(true);
            }
            this.method224(-32);
            this.method305();
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZIZI)V", line = 600)
    public final void method202(boolean arg0, int arg1, boolean arg2, int arg3) {
        ++field453;
        if (~this.field618 != ~arg1 || this.field681 == !this.field668) {
            class533 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = !this.field668 ? 0 : 3;
            if (arg1 < 0) {
                this.method246(-21974);
            } else {
                var5 = this.field545.method1956(arg1, 256);
                class739 var10 = super.field1170.method1180(arg1, -6662);
                if (var10.field9940 == 0 && var10.field9953 == 0) {
                    this.method246(-21974);
                } else {
                    int var11 = var10.field9941 ? 64 : 128;
                    int var12 = var11 * 50;
                    this.method335((float) (this.field557 % var12 * var10.field9953) / (float) var12, 0.0F, (float) (this.field557 % var12 * var10.field9940) / (float) var12, (byte) 126);
                }
                if (!this.field668) {
                    var9 = var10.field9955;
                    var8 = var10.field9948;
                    var7 = var10.field9944;
                }
                var6 = var10.field9945;
            }
            this.field529.method2618(var7, arg0, var9, var8, (byte) 12, arg2);
            if (!this.field529.method2619(var6, (byte) -124, var5)) {
                this.method256((byte) -86, var5);
                this.method237(0, var6);
            }
            this.field681 = this.field668;
            this.field618 = arg1;
        }
        if (arg3 <= 111) {
            this.method303(59, -107, -128, -14);
        }
        this.field587 &= -8;
    }

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "(B)V", line = 664)
    private final void method203(byte arg0) {
        ++field419;
        float var2 = (float) (-this.field675) * this.field673 / (float) this.field593;
        float var3 = (float) (-this.field632) * this.field673 / (float) this.field616;
        float var4 = (float) (-this.field675 + this.field510) * this.field673 / (float) this.field593;
        float var5 = (float) (this.field463 - this.field632) * this.field673 / (float) this.field616;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field648, (double) this.field636);
        }
        OpenGL.glMatrixMode(5888);
        if (arg0 != -63) {
            this.field617 = 67;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "()Z", line = 691)
    public final boolean method204() {
        ++field364;
        return this.field543 != null && (~this.field535 >= -2 || this.field644);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZ)V", line = 702)
    public final void method205(int arg0, boolean arg1) {
        ++field532;
        if (this.field581 != arg1) {
            this.field581 = arg1;
            this.method321(-30199);
            this.field587 &= -32;
        }
        if (arg0 != 0) {
            this.method264(-58, (class560) null);
        }
    }

    @OriginalMember(owner = "client!qo", name = "K", descriptor = "([I)V", line = 725)
    public final void method206(int[] arg0) {
        arg0[1] = this.field595;
        arg0[3] = this.field609;
        arg0[0] = this.field690;
        ++field402;
        arg0[2] = this.field677;
    }

    @OriginalMember(owner = "client!qo", name = "Q", descriptor = "(IIIIII[BII)V", line = 739)
    public final void method207(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field362;
        float var10;
        float var11;
        if (this.field598 != null && ~this.field598.field7334 <= ~arg2 && ~this.field598.field7338 <= ~arg3) {
            this.field598.method3072(0, 0, arg2, false, 0, arg3, 6406, 123, arg6, 0);
            var10 = (float) arg3 * this.field598.field8015 / (float) this.field598.field7338;
            var11 = (float) arg2 * this.field598.field8014 / (float) this.field598.field7334;
        } else {
            this.field598 = class412.method2551(false, arg6, 6406, arg3, this, -45, 6406, arg2);
            this.field598.method3067(false, false, 10243);
            var10 = this.field598.field8015;
            var11 = this.field598.field8014;
        }
        this.method314(58);
        this.method256((byte) -117, this.field598);
        this.method222(arg8, 1);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method358(arg5, 120);
        this.method175(34165, (byte) 101, 34165);
        this.method239(34166, 768, (byte) -87, 0);
        this.method239(5890, 770, (byte) -87, 2);
        this.method274(false, 0, 770, 34166);
        this.method274(false, 2, 770, 5890);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(var12, var13);
        OpenGL.glTexCoord2f(0.0F, var11);
        OpenGL.glVertex2f(var12, var15);
        OpenGL.glTexCoord2f(var10, var11);
        OpenGL.glVertex2f(var14, var15);
        OpenGL.glTexCoord2f(var10, 0.0F);
        OpenGL.glVertex2f(var14, var13);
        OpenGL.glEnd();
        this.method239(5890, 768, (byte) -87, 0);
        this.method239(34166, 770, (byte) -87, 2);
        this.method274(false, 0, 770, 5890);
        this.method274(false, 2, 770, 34166);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lmda;)V", line = 801)
    public final void method208(class266 arg0) {
        this.field533.method3604(this, (byte) -119, -1, arg0);
        ++field391;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(FFFBF)V", line = 815)
    public final void method209(float arg0, float arg1, float arg2, byte arg3, float arg4) {
        class696.field9403[2] = arg2;
        if (arg3 <= 45) {
            this.method254(-35L, false);
        }
        ++field398;
        class696.field9403[0] = arg1;
        class696.field9403[1] = arg4;
        class696.field9403[3] = arg0;
        OpenGL.glTexEnvfv(8960, 8705, class696.field9403, 0);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lbca;)V", line = 835)
    public final void method210(class661 arg0) {
        ++field371;
        this.field582.method778(arg0);
        this.field588.method778(this.field582);
        this.field588.method2914(3128);
        this.field589.method2918(this.field588, -7929);
        if (~this.field687 != -2) {
            this.method223((byte) 89);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILhca;)V", line = 851)
    public final void method211(int arg0, class490 arg1) {
        if (arg0 <= 39) {
            this.field604 = 120;
        }
        if (this.field674 != arg1) {
            if (this.field695) {
                OpenGL.glBindBufferARB(34962, arg1.method962(true));
            }
            this.field674 = arg1;
        }
        ++field374;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 872)
    public final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.method282((byte) -123);
        ++field389;
        this.method222(arg12, 1);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
        OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, (float) arg2);
        OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
        OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, (float) arg5);
        OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
        OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, (float) arg8);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "()V", line = 894)
    public final void method213() {
        ++field524;
        if (this.field642) {
            if (this.field561 != this.field562) {
                throw new RuntimeException();
            }
            this.field561.method3646(2983, 0);
            this.field561.method3646(2983, 8);
            this.method255(-422613672, this.field561);
        } else {
            if (!this.field688) {
                throw new RuntimeException("");
            }
            this.field566.method1193(0, 0, this.field510, this.field463, 0, 0);
            this.field486.setSurface(this.field458);
        }
        this.field510 = this.field467;
        this.field566 = null;
        this.field463 = this.field345;
        this.method224(-32);
        this.method360(true);
        this.method305();
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ltv;I)V", line = 928)
    public final void method214(class560 arg0, int arg1) {
        ++field370;
        if (this.field564 >= 3) {
            throw new RuntimeException();
        } else {
            int var3 = 67 % ((-4 - arg1) / 46);
            if (this.field564 >= 0) {
                this.field559[this.field564].method3218(-32502);
            }
            this.field562 = this.field559[++this.field564] = arg0;
            this.field562.method3215(-11421);
        }
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(IZ)V", line = 947)
    public final void method215(int arg0, boolean arg1) {
        if (!arg1 != !this.field585) {
            if (!arg1) {
                OpenGL.glDisable(2929);
            } else {
                OpenGL.glEnable(2929);
            }
            this.field585 = arg1;
            this.field587 &= -32;
        }
        if (arg0 <= 106) {
            this.method242((byte) 118, 75);
        }
        ++field548;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Loea;[Lrh;Z)Lda;", line = 970)
    public final class60 method216(class597 arg0, class267[] arg1, boolean arg2) {
        ++field396;
        return new class596(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qo", name = "aa", descriptor = "(IIIIII)V", line = 980)
    public final void method217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field423;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method282((byte) -127);
        float var10 = (float) arg3 + var8;
        this.method222(arg5, 1);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field665) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field665) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!qo", name = "ZA", descriptor = "(IFFFFF)V", line = 1013)
    public final void method218(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field455;
        boolean var7 = ~this.field630 != ~arg0;
        if (var7 || this.field654 != arg1 || this.field693 != arg2) {
            this.field654 = arg1;
            this.field630 = arg0;
            this.field693 = arg2;
            if (var7) {
                this.field645 = (float) (this.field630 & 255) / 255.0F;
                this.field603 = (float) (16711680 & this.field630) / 1.671168E7F;
                this.field638 = (float) (65280 & this.field630) / 65280.0F;
                this.method297(-93);
            }
            this.method283(29890);
        }
        if (this.field672[0] != arg3 || this.field672[1] != arg4 || this.field672[2] != arg5) {
            this.field672[2] = arg5;
            this.field672[1] = arg4;
            this.field672[0] = arg3;
            this.field699[0] = -arg3;
            this.field699[2] = -arg5;
            this.field699[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field647[0] = arg3 * var8;
            this.field647[2] = arg5 * var8;
            this.field647[1] = arg4 * var8;
            this.field633[2] = -this.field647[2];
            this.field633[1] = -this.field647[1];
            this.field633[0] = -this.field647[0];
            this.method326(16384);
            this.field599 = (int) (arg5 * 256.0F / arg4);
            this.field594 = (int) (arg3 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "(II)I", line = 1062)
    public final int method219(int arg0, int arg1) {
        ++field456;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!qo", name = "GA", descriptor = "(I)V", line = 1070)
    public final void method220(int arg0) {
        ++field414;
        this.method222(0, 1);
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)V", line = 1082)
    public final void method221(int arg0) {
        ++field468;
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;I)V", line = 1090)
    public class22(Canvas arg0, class152 arg1, int arg2) {
        super(arg1);
        new class368();
        new class213(16);
        this.field571 = new class168();
        this.field573 = new class168();
        this.field574 = new class168();
        this.field575 = new class168();
        this.field576 = new class168();
        this.field577 = new class168();
        this.field578 = new class168();
        this.field582 = new class495();
        this.field588 = new class495();
        this.field589 = new class495();
        this.field592 = 0;
        this.field608 = 0.0F;
        this.field595 = 0;
        this.field603 = 1.0F;
        this.field628 = -1;
        this.field593 = 512;
        this.field622 = -1.0F;
        this.field630 = -1;
        this.field638 = 1.0F;
        this.field626 = 8448;
        this.field651 = -1.0F;
        this.field632 = 0;
        this.field654 = -1.0F;
        this.field647 = new float[4];
        this.field631 = 0;
        this.field633 = new float[4];
        this.field645 = 1.0F;
        this.field616 = 512;
        this.field636 = 3584;
        this.field677 = 0;
        this.field679 = 1.0F;
        this.field609 = 0;
        this.field681 = false;
        this.field672 = new float[4];
        this.field673 = 1.0F;
        this.field648 = 50;
        this.field683 = 8448;
        this.field635 = 0;
        this.field678 = -1;
        this.field690 = 0;
        this.field601 = new float[16];
        this.field692 = true;
        this.field693 = -1.0F;
        this.field680 = new class669[class291.field4071];
        this.field675 = 0;
        this.field689 = 0;
        this.field697 = 3584.0F;
        this.field696 = 3584.0F;
        this.field670 = -1;
        this.field699 = new float[4];
        this.field604 = -1;
        this.field620 = new class548(8192);
        this.field701 = new byte[16384];
        this.field702 = new int[1];
        this.field705 = new int[1];
        this.field704 = new int[1];
        this.field397 = this.field448 = arg0;
        this.field535 = arg2;
        if (!class98.method915(-30282, "jaclib")) {
            throw new RuntimeException("");
        } else if (!class98.method915(-30282, "jaggl")) {
            throw new RuntimeException("");
        } else {
            try {
                this.field486 = new OpenGL();
                this.field458 = this.field375 = this.field486.init(arg0, 8, 8, 8, 24, 0, this.field535);
                if (~this.field375 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method275(22544);
                    int var4 = this.method265((byte) -62);
                    if (~var4 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field634 = this.field597 ? 33639 : 5121;
                        if (this.field612.indexOf("radeon") != -1) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class728.method4031(' ', true, this.field612.replace('/', ' '));
                            for (int var9 = 0; var9 < var8.length; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (~var10.length() < -1) {
                                        if (var10.charAt(0) == 'x' && ~var10.length() <= -4 && class142.method1130(var10.substring(1, 3), 111)) {
                                            var10 = var10.substring(1);
                                            var7 = true;
                                        }
                                        if (var10.equals("hd")) {
                                            var6 = true;
                                        } else {
                                            if (var10.startsWith("hd")) {
                                                var6 = true;
                                                var10 = var10.substring(2);
                                            }
                                            if (~var10.length() <= -5 && class142.method1130(var10.substring(0, 4), 47)) {
                                                var5 = class432.method2626(true, var10.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var7 && !var6) {
                                if (~var5 <= -7001 && var5 <= 7999) {
                                    this.field695 = false;
                                }
                                if (var5 >= 7000 && ~var5 >= -9251) {
                                    this.field653 = false;
                                }
                            }
                            if (!var6 || ~var5 > -4001) {
                                this.field640 = false;
                            }
                            this.field659 &= this.field486.method3569("GL_ARB_half_float_pixel");
                            this.field669 = true;
                            this.field691 = this.field695;
                        }
                        if (this.field667.indexOf("intel") != -1) {
                            this.field642 = false;
                        }
                        this.field596 = !this.field667.equals("s3 graphics");
                        if (this.field695) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class78.method721(false, true, (byte) -128);
                        this.field556 = true;
                        this.field545 = new class299(this, super.field1170);
                        this.method296(false);
                        this.field558 = new class567(this);
                        this.field542 = new class131(this);
                        if (this.field542.method1085(1)) {
                            this.field543 = new class662(this);
                            if (!this.field543.method3722((byte) 104)) {
                                this.field543.method390((byte) -124);
                                this.field543 = null;
                            }
                        }
                        this.field529 = new class431(this);
                        this.method313(25858);
                        this.method201((byte) 123);
                        this.method252();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method251();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "(II)V", line = 1242)
    public final void method222(int arg0, int arg1) {
        if (arg1 != 1) {
            this.field659 = false;
        }
        if (this.field586 != arg0) {
            boolean var3;
            byte var4;
            boolean var5;
            if (~arg0 == -2) {
                var3 = true;
                var4 = 1;
                var5 = true;
            } else if (arg0 != 2) {
                if (~arg0 != -129) {
                    var5 = false;
                    var4 = 0;
                    var3 = true;
                } else {
                    var4 = 3;
                    var3 = true;
                    var5 = true;
                }
            } else {
                var3 = true;
                var4 = 2;
                var5 = false;
            }
            if (!this.field580 != !var3) {
                OpenGL.glColorMask(var3, var3, var3, true);
                this.field580 = var3;
            }
            if (!var5 != !this.field583) {
                if (!var5) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field583 = var5;
            }
            if (~this.field584 != ~var4) {
                if (var4 == 1) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                } else if (var4 == 2) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(1, 1);
                } else if (var4 == 3) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(774, 1);
                } else {
                    OpenGL.glDisable(3042);
                }
                this.field584 = var4;
            }
            this.field586 = arg0;
            this.field587 &= -29;
        }
        ++field413;
    }

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "(B)V", line = 1336)
    private final void method223(byte arg0) {
        ++field511;
        if (arg0 > 77) {
            OpenGL.glLoadIdentity();
            OpenGL.glMultMatrixf(this.field588.method2912(1), 0);
            if (this.field681) {
                this.field529.field6170.method365(false);
            }
            this.method326(16384);
            this.method292(0);
        }
    }

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "(I)V", line = 1354)
    public final void method224(int arg0) {
        if (this.field687 != 0) {
            this.field587 &= -32;
            this.field687 = 0;
        }
        if (arg0 == -32) {
            ++field530;
        }
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(IIII)V", line = 1371)
    public final void method225(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= 32) {
            this.field679 = -0.7407605F;
        }
        ++field377;
        OpenGL.glDrawArrays(arg1, arg2, arg0);
    }

    @OriginalMember(owner = "client!qo", name = "U", descriptor = "(IIIII)V", line = 1385)
    public final void method226(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method282((byte) -119);
        ++field347;
        this.method222(arg4, 1);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "(I)V", line = 1405)
    public final void method227(int arg0) {
        ++field457;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            this.field534 = arg0;
            this.field545.method1952((byte) -110);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qo", name = "xa", descriptor = "(F)V", line = 1420)
    public final void method228(float arg0) {
        if (this.field590 != arg0) {
            this.field590 = arg0;
            this.method297(-105);
        }
        ++field490;
    }

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "(II)V", line = 1437)
    public final void method229(int arg0, int arg1) {
        this.method342(true, arg0, -104);
        ++field471;
        if (arg1 > -43) {
            this.method250((byte) 85);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZLiaa;)V", line = 1449)
    public final void method230(boolean arg0, class495 arg1) {
        OpenGL.glPushMatrix();
        if (arg0) {
            this.method221(51);
        }
        ++field475;
        OpenGL.glMultMatrixf(arg1.method2912(1), 0);
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(IIIIZ)Lmi;", line = 1464)
    public final class496 method231(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field404;
        return new class557(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIILni;I)V", line = 1475)
    public final void method232(int arg0, int arg1, int arg2, class522 arg3, int arg4) {
        ++field441;
        int var6 = arg3.method447(-5711);
        if (arg1 >= -127) {
            this.field529 = null;
        }
        int var7 = arg4 * this.method294(var6, 4);
        this.method316(1, arg3);
        OpenGL.glDrawElements(arg2, arg0, var6, arg3.method445((byte) 78) + (long) var7);
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)V", line = 1494)
    public final synchronized void method233(int arg0) {
        ++field521;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field573.method1276((byte) 18)) {
            class113 var12 = (class113) this.field573.method1271(8);
            class720.field9796[var2++] = (int) var12.field5204;
            this.field569 -= var12.field1945;
            if (var2 == 1000) {
                OpenGL.glDeleteBuffersARB(var2, class720.field9796, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class720.field9796, 0);
            var2 = 0;
        }
        while (!this.field574.method1276((byte) 18)) {
            class113 var11 = (class113) this.field574.method1271(8);
            class720.field9796[var2++] = (int) var11.field5204;
            this.field570 -= var11.field1945;
            if (var2 == 1000) {
                OpenGL.glDeleteTextures(var2, class720.field9796, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteTextures(var2, class720.field9796, 0);
            var2 = 0;
        }
        while (!this.field575.method1276((byte) 18)) {
            class113 var10 = (class113) this.field575.method1271(8);
            class720.field9796[var2++] = var10.field1945;
            if (~var2 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var2, class720.field9796, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var2, class720.field9796, 0);
            var2 = 0;
        }
        while (!this.field576.method1276((byte) 18)) {
            class113 var9 = (class113) this.field576.method1271(8);
            class720.field9796[var2++] = (int) var9.field5204;
            this.field572 -= var9.field1945;
            if (~var2 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class720.field9796, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class720.field9796, 0);
            boolean var4 = false;
        }
        while (!this.field571.method1276((byte) 18)) {
            class113 var8 = (class113) this.field571.method1271(8);
            OpenGL.glDeleteLists((int) var8.field5204, var8.field1945);
        }
        while (!this.field577.method1276((byte) 18)) {
            class362 var7 = this.field577.method1271(8);
            OpenGL.glDeleteProgramARB((int) var7.field5204);
        }
        while (!this.field578.method1276((byte) 18)) {
            class362 var6 = this.field578.method1271(8);
            OpenGL.glDeleteObjectARB(var6.field5204);
        }
        while (!this.field571.method1276((byte) 18)) {
            class113 var5 = (class113) this.field571.method1271(8);
            OpenGL.glDeleteLists((int) var5.field5204, var5.field1945);
        }
        this.field545.method1958(8218);
        if (~this.method339() < -100663297 && this.field579 + 60000L < class554.method3190(-96)) {
            System.gc();
            this.field579 = class554.method3190(-91);
        }
        this.field557 = var3;
    }

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "(IIIIII)V", line = 1658)
    public final void method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method282((byte) -124);
        ++field433;
        this.method222(arg5, 1);
        float var7 = (float) arg2 - (float) arg0;
        float var8 = (float) (-arg1) + (float) arg3;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var9 = var7 * var10;
            var8 *= var10;
        }
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + var9 + 0.35F, (float) arg3 + var8 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(IIIID)V", line = 1690)
    public final void method235(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field357;
    }

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "(I)V", line = 1698)
    public final void method236(int arg0) {
        if (arg0 != 1) {
            this.method232(65, 117, -33, (class522) null, -33);
        }
        ++field465;
        if (~this.field587 != -17) {
            this.method197(3);
            this.method357(true, 2);
            this.method215(122, true);
            this.method205(0, true);
            this.method222(1, arg0);
            this.field587 = 16;
        }
    }

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "(II)V", line = 1721)
    public final void method237(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field573 = null;
        }
        ++field476;
        if (~arg1 == -2) {
            this.method175(7681, (byte) 114, 7681);
        } else if (arg1 == 0) {
            this.method175(8448, (byte) 107, 8448);
        } else if (arg1 != 2) {
            if (~arg1 != -4) {
                if (arg1 == 4) {
                    this.method175(34023, (byte) 123, 34023);
                    return;
                }
            } else {
                this.method175(260, (byte) 97, 8448);
            }
        } else {
            this.method175(34165, (byte) 126, 7681);
        }
    }

    @OriginalMember(owner = "client!qo", name = "u", descriptor = "()Z", line = 1750)
    public final boolean method238() {
        ++field369;
        return true;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIBI)V", line = 1761)
    public final void method239(int arg0, int arg1, byte arg2, int arg3) {
        ++field493;
        OpenGL.glTexEnvi(8960, 34176 - -arg3, arg0);
        OpenGL.glTexEnvi(8960, arg3 + 34192, arg1);
        if (arg2 != -87) {
            this.method333(48, 67, -20, 106, -89, 67, 104);
        }
    }

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "(I)V", line = 1773)
    private final void method240(int arg0) {
        ++field338;
        if (this.field687 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field510 < -1 && this.field463 > 0) {
                OpenGL.glOrtho(0.0D, (double) this.field510, (double) this.field463, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field687 = 1;
            this.field587 &= -25;
        }
        if (arg0 != 5888) {
            this.method240(-122);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILtv;)V", line = 1798)
    public final void method241(int arg0, class560 arg1) {
        ++field408;
        if (~this.field564 <= -1 && this.field559[this.field564] == arg1) {
            this.field559[this.field564--] = null;
            if (arg0 != -17083) {
                this.field566 = null;
            }
            arg1.method3218(-32502);
            if (this.field564 < 0) {
                this.field562 = null;
            } else {
                this.field562 = this.field559[this.field564];
                this.field562.method3215(-11421);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(BI)V", line = 1822)
    public final synchronized void method242(byte arg0, int arg1) {
        ++field388;
        class362 var3 = new class362();
        var3.field5204 = (long) arg1;
        if (arg0 <= 64) {
            this.method295((class266) null, -38);
        }
        this.field577.method1273(var3, -20180);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(BLiaa;)V", line = 1836)
    public final void method243(byte arg0, class495 arg1) {
        ++field445;
        OpenGL.glLoadMatrixf(arg1.method2912(arg0 + -54), 0);
        if (arg0 != 55) {
            this.method287((class560) null, -47);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(FFF)V", line = 1849)
    public final void method244(float arg0, float arg1, float arg2) {
        class73.field1334 = arg2;
        class165.field2596 = arg0;
        ++field507;
        class85.field1536 = arg1;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 1861)
    public final void method245(Canvas arg0) {
        ++field496;
        if (this.field448 == arg0) {
            throw new RuntimeException();
        } else if (this.field399.containsKey(arg0)) {
            Long var2 = (Long) this.field399.get(arg0);
            this.field486.releaseSurface(arg0, var2);
            this.field399.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "(I)V", line = 1881)
    private final void method246(int arg0) {
        if (arg0 != -21974) {
            this.field566 = null;
        }
        ++field421;
        if (this.field682) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field682 = false;
        }
    }

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "()Z", line = 1900)
    public final boolean method247() {
        ++field379;
        return true;
    }

    @OriginalMember(owner = "client!qo", name = "za", descriptor = "(IIIII)V", line = 1908)
    public final void method248(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        ++field550;
        if (~(arg0 + arg2) <= ~this.field690 && this.field677 >= -arg2 + arg0 && this.field595 <= arg1 + arg2 && ~this.field609 <= ~(-arg2 + arg1)) {
            this.method282((byte) -117);
            this.method222(arg4, 1);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if (this.field651 > (float) var8) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if (this.field622 >= (float) var8) {
                OpenGL.glEnable(2832);
                OpenGL.glPointSize((float) var8);
                OpenGL.glBegin(0);
                OpenGL.glVertex2f(var6, var7);
                OpenGL.glEnd();
                OpenGL.glDisable(2832);
            } else {
                OpenGL.glBegin(6);
                OpenGL.glVertex2f(var6, var7);
                int var9 = 262144 / (arg2 * 6);
                if (var9 > 64) {
                    if (var9 > 512) {
                        var9 = 512;
                    }
                } else {
                    var9 = 64;
                }
                int var10 = class230.method1605(var9, 4096);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = -var10 + 16384; ~var11 < -1; var11 -= var10) {
                    OpenGL.glVertex2f(class734.field9904[var11] * (float) arg2 + var6, class734.field9902[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "(I)V", line = 1984)
    public final void method249(int arg0) {
        this.method275(22544);
        ++field363;
    }

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "(B)V", line = 1993)
    private final void method250(byte arg0) {
        ++field341;
        if (arg0 >= -69) {
            this.field624 = null;
        }
        if (this.field606 && !this.field627) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "()V", line = 2008)
    public final void method251() {
        for (class362 var1 = this.field554.method1269(4); var1 != null; var1 = this.field554.method1264((byte) 55)) {
            ((class599) var1).method3410(-82);
        }
        ++field385;
        if (this.field542 != null) {
            this.field542.method1084((byte) -126);
        }
        if (this.field486 != null) {
            this.method331(0);
            Enumeration var2 = this.field399.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field399.get(var3);
                this.field486.releaseSurface(var3, var4);
            }
            this.field486.release();
            this.field486 = null;
        }
        if (this.field556) {
            class365.method2326(true, 12, false);
            this.field556 = false;
        }
    }

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "()V", line = 2054)
    public final void method252() {
        ++field390;
        if (this.field596 && ~this.field510 < -1 && ~this.field463 < -1) {
            int var1 = this.field690;
            int var2 = this.field677;
            int var3 = this.field595;
            int var4 = this.field609;
            this.method305();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method224(-32);
            this.method357(false, 2);
            this.method173(false, 86);
            this.method215(112, false);
            this.method205(0, false);
            this.method256((byte) -91, (class36) null);
            this.method229(-2, -88);
            this.method237(0, 1);
            this.method222(0, 1);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field510, this.field463, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method303(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(IIIIII)Lwh;", line = 2103)
    public final class149 method253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field337;
        return this.field685 ? new class698(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(JZ)V", line = 2116)
    public final synchronized void method254(long arg0, boolean arg1) {
        if (arg1) {
            this.field573 = null;
        }
        ++field355;
        class362 var4 = new class362();
        var4.field5204 = arg0;
        this.field578.method1273(var4, -20180);
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(ILtv;)V", line = 2131)
    public final void method255(int arg0, class560 arg1) {
        ++field420;
        if (this.field637) {
            this.method351(8387, arg1);
            this.method241(-17083, arg1);
        } else {
            if (this.field568 < 0 || this.field565[this.field568] != arg1) {
                throw new RuntimeException();
            }
            this.field565[this.field568--] = null;
            arg1.method3216(46);
            if (~this.field568 > -1) {
                this.field567 = this.field562 = null;
            } else {
                this.field567 = this.field562 = this.field565[this.field568];
                this.field567.method3214(-11762);
            }
        }
        if (arg0 != -422613672) {
            this.field610 = 30;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(BLud;)V", line = 2165)
    public final void method256(byte arg0, class36 arg1) {
        ++field495;
        if (arg0 > -74) {
            this.method271(38, (class487) null, 4, -3);
        }
        class36 var3 = this.field650[this.field698];
        if (arg1 != var3) {
            if (arg1 == null) {
                OpenGL.glDisable(var3.field868);
            } else {
                if (var3 != null) {
                    if (~arg1.field868 != ~var3.field868) {
                        OpenGL.glDisable(var3.field868);
                        OpenGL.glEnable(arg1.field868);
                    }
                } else {
                    OpenGL.glEnable(arg1.field868);
                }
                OpenGL.glBindTexture(arg1.field868, arg1.method452(41));
            }
            this.field650[this.field698] = arg1;
        }
        this.field587 &= -2;
    }

    @OriginalMember(owner = "client!qo", name = "A", descriptor = "()V", line = 2204)
    public final void method257() {
        if (this.field543 != null && this.field543.method387((byte) 1)) {
            this.field542.method1083(this.field543, true);
            this.field545.method1952((byte) -110);
        }
        ++field434;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIIIIII)V", line = 2219)
    public final void method258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field478;
        if (~arg0 != ~arg2 || arg1 != arg3) {
            this.method282((byte) -119);
            this.method222(arg5, 1);
            float var10 = (float) arg2 - (float) arg0;
            float var11 = (float) arg3 - (float) arg1;
            float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            float var13 = var10 * var12;
            float var14 = var11 * var12;
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            int var15 = arg8 % (arg6 + arg7);
            float var16 = (float) arg6 * var13;
            float var17 = (float) arg6 * var14;
            float var18 = 0.0F;
            float var19 = 0.0F;
            float var20 = var16;
            float var21 = var17;
            if (var15 <= arg6) {
                var21 = (float) (-var15 + arg6) * var14;
                var20 = (float) (-var15 + arg6) * var13;
            } else {
                var19 = (float) (arg6 + arg7 - var15) * var14;
                var18 = (float) (arg6 + arg7 - var15) * var13;
            }
            float var22 = (float) arg0 + 0.35F + var18;
            float var23 = (float) arg1 + 0.35F + var19;
            float var24 = (float) arg7 * var13;
            float var25 = (float) arg7 * var14;
            while (true) {
                if (~arg2 >= ~arg0) {
                    if ((float) arg2 + 0.35F > var22) {
                        break;
                    }
                    if (var20 + var22 < (float) arg2) {
                        var20 = (float) arg2 + -var22;
                    }
                } else {
                    if (var22 > (float) arg2 + 0.35F) {
                        break;
                    }
                    if (var20 + var22 > (float) arg2) {
                        var20 = (float) arg2 + -var22;
                    }
                }
                if (arg1 >= arg3) {
                    if ((float) arg3 + 0.35F > var23) {
                        break;
                    }
                    if (var21 + var23 < (float) arg3) {
                        var21 = (float) arg3 - var23;
                    }
                } else {
                    if ((float) arg3 + 0.35F < var23) {
                        break;
                    }
                    if (var21 + var23 > (float) arg3) {
                        var21 = (float) arg3 + -var23;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glVertex2f(var22, var23);
                OpenGL.glVertex2f(var20 + var22, var21 + var23);
                OpenGL.glEnd();
                var23 += var21 + var25;
                var22 += var20 + var24;
                var20 = var16;
                var21 = var17;
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 2330)
    public final void method259(Canvas arg0, int arg1, int arg2) {
        ++field366;
        if (this.field448 == arg0) {
            throw new RuntimeException();
        } else if (!this.field399.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var8) {
                }
                long var6 = this.field486.prepareSurface(arg0);
                if (var6 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field399.put(arg0, new Long(var6));
                }
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "(B)V", line = 2367)
    private final void method260(byte arg0) {
        this.field657 = (float) (-this.field675 + this.field677);
        ++field531;
        this.field694 = (float) (-this.field675 + this.field690);
        this.field658 = (float) (-this.field632 + this.field595);
        if (arg0 < 123) {
            this.method267(-79);
        }
        this.field652 = (float) (-this.field632 + this.field609);
    }

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "(I)Lza;", line = 2381)
    public final class415 method261(int arg0) {
        ++field360;
        class599 var2 = new class599(arg0);
        this.field554.method1273(var2, -20180);
        return var2;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 2392)
    public final class281 method262(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field422;
        return new class704(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "()Z", line = 2402)
    public final boolean method263() {
        ++field527;
        return true;
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(ILtv;)V", line = 2413)
    public final void method264(int arg0, class560 arg1) {
        ++field439;
        if (arg0 != -1) {
            this.field667 = null;
        }
        if (this.field637) {
            this.method287(arg1, 327685);
            this.method214(arg1, arg0 ^ -80);
        } else if (this.field568 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field568 <= -1) {
                this.field565[this.field568].method3216(-76);
            }
            this.field567 = this.field562 = this.field565[++this.field568] = arg1;
            this.field567.method3214(-11762);
        }
    }

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "(B)I", line = 2443)
    private final int method265(byte arg0) {
        ++field340;
        int var2 = 0;
        this.field667 = OpenGL.glGetString(7936).toLowerCase();
        this.field612 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field667.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (this.field667.indexOf("brian paul") != -1 || this.field667.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class728.method4031(' ', true, var3.replace('.', ' '));
        if (var4.length >= 2) {
            try {
                int var5 = class432.method2626(true, var4[0]);
                int var6 = class432.method2626(true, var4[1]);
                this.field611 = var5 * 10 - -var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (~this.field611 > -13) {
            var2 |= 2;
        }
        if (!this.field486.method3569("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field486.method3569("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        if (arg0 > -58) {
            return 48;
        } else {
            int[] var7 = new int[1];
            OpenGL.glGetIntegerv(34018, var7, 0);
            this.field617 = var7[0];
            OpenGL.glGetIntegerv(34929, var7, 0);
            this.field621 = var7[0];
            OpenGL.glGetIntegerv(34930, var7, 0);
            this.field641 = var7[0];
            if (this.field617 < 2 || ~this.field621 > -3 || ~this.field641 > -3) {
                var2 |= 16;
            }
            this.field597 = Stream.method3789();
            this.field688 = this.field486.arePbuffersAvailable();
            this.field695 = this.field486.method3569("GL_ARB_vertex_buffer_object");
            this.field665 = this.field486.method3569("GL_ARB_multisample");
            this.field663 = this.field486.method3569("GL_ARB_vertex_program");
            this.field486.method3569("GL_ARB_fragment_program");
            this.field613 = this.field486.method3569("GL_ARB_vertex_shader");
            this.field605 = this.field486.method3569("GL_ARB_fragment_shader");
            this.field653 = this.field486.method3569("GL_EXT_texture3D");
            this.field659 = this.field486.method3569("GL_ARB_texture_rectangle");
            this.field685 = this.field486.method3569("GL_ARB_texture_cube_map");
            this.field640 = this.field486.method3569("GL_ARB_texture_float");
            this.field615 = false;
            this.field642 = this.field486.method3569("GL_EXT_framebuffer_object");
            this.field637 = this.field486.method3569("GL_EXT_framebuffer_blit");
            this.field629 = this.field486.method3569("GL_EXT_framebuffer_multisample");
            this.field644 = this.field629 & this.field637;
            OpenGL.glGetFloatv(2834, class696.field9403, 0);
            this.field651 = class696.field9403[0];
            this.field622 = class696.field9403[1];
            return var2 != 0 ? var2 : 0;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 2529)
    public final void method266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class487 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field440;
        if (arg0 != arg2 || ~arg1 != ~arg3) {
            class683 var13 = (class683) arg6;
            class588 var14 = var13.field9252;
            this.method314(90);
            this.method256((byte) -122, var13.field9252);
            this.method222(arg5, 1);
            this.method175(7681, (byte) -61, 8448);
            this.method239(34167, 768, (byte) -87, 0);
            float var15 = var14.field8014 / (float) var14.field8017;
            float var16 = var14.field8015 / (float) var14.field8016;
            float var17 = (float) (-arg0) + (float) arg2;
            float var18 = (float) arg3 - (float) arg1;
            float var19 = (float) (1.0D / Math.sqrt((double) (var17 * var17 + var18 * var18)));
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var20 = var17 * var19;
            float var21 = var18 * var19;
            int var22 = arg11 % (arg9 + arg10);
            float var23 = (float) arg9 * var20;
            float var24 = (float) arg9 * var21;
            float var25 = 0.0F;
            float var26 = 0.0F;
            float var27 = var23;
            float var28 = var24;
            if (var22 <= arg9) {
                var27 = (float) (-var22 + arg9) * var20;
                var28 = (float) (-var22 + arg9) * var21;
            } else {
                var26 = (float) (arg9 - -arg10 + -var22) * var21;
                var25 = (float) (arg9 - -arg10 - var22) * var20;
            }
            float var29 = (float) arg0 + 0.35F + var25;
            float var30 = (float) arg1 + 0.35F + var26;
            float var31 = (float) arg10 * var20;
            float var32 = (float) arg10 * var21;
            while (true) {
                if (~arg2 < ~arg0) {
                    if (var29 > (float) arg2 + 0.35F) {
                        break;
                    }
                    if ((float) arg2 < var27 + var29) {
                        var27 = (float) arg2 - var29;
                    }
                } else {
                    if ((float) arg2 + 0.35F > var29) {
                        break;
                    }
                    if ((float) arg2 > var27 + var29) {
                        var27 = (float) arg2 + -var29;
                    }
                }
                if (arg3 <= arg1) {
                    if ((float) arg3 + 0.35F > var30) {
                        break;
                    }
                    if ((float) arg3 > var28 + var30) {
                        var28 = (float) arg3 - var30;
                    }
                } else {
                    if (var30 > (float) arg3 + 0.35F) {
                        break;
                    }
                    if ((float) arg3 < var28 + var30) {
                        var28 = (float) arg3 - var30;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glTexCoord2f(((float) (-arg7) + var29) * var15, ((float) (-arg8) + var30) * var16);
                OpenGL.glVertex2f(var29, var30);
                OpenGL.glTexCoord2f((var27 + var29 - (float) arg7) * var15, (var28 + var30 + (float) (-arg8)) * var16);
                OpenGL.glVertex2f(var27 + var29, var28 + var30);
                OpenGL.glEnd();
                var29 += var27 + var31;
                var30 += var28 + var32;
                var28 = var24;
                var27 = var23;
            }
            this.method239(5890, 768, (byte) -87, 0);
        }
    }

    @OriginalMember(owner = "client!qo", name = "X", descriptor = "(I)V", line = 2656)
    public final void method267(int arg0) {
        this.field553 = 0;
        ++field343;
        while (~arg0 < -2) {
            ++this.field553;
            arg0 >>= 1;
        }
        this.field555 = 1 << this.field553;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(II[I[I)Laa;", line = 2679)
    public final class487 method268(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field411;
        return class274.method1807(arg0, arg2, arg3, 0, this, arg1);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "([I)V", line = 2687)
    public final void method269(int[] arg0) {
        arg0[0] = this.field510;
        ++field497;
        arg0[1] = this.field463;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lza;)V", line = 2697)
    public final void method270(class415 arg0) {
        this.field552 = ((class599) arg0).field8213;
        ++field395;
        if (this.field619 == null) {
            class548 var2 = new class548(80);
            if (!this.field597) {
                var2.method3156(18291, -1.0F);
                var2.method3156(18291, -1.0F);
                var2.method3156(18291, 0.0F);
                var2.method3156(18291, 0.0F);
                var2.method3156(18291, 1.0F);
                var2.method3156(18291, 1.0F);
                var2.method3156(18291, -1.0F);
                var2.method3156(18291, 0.0F);
                var2.method3156(18291, 1.0F);
                var2.method3156(18291, 1.0F);
                var2.method3156(18291, 1.0F);
                var2.method3156(18291, 1.0F);
                var2.method3156(18291, 0.0F);
                var2.method3156(18291, 1.0F);
                var2.method3156(18291, 0.0F);
                var2.method3156(18291, -1.0F);
                var2.method3156(18291, 1.0F);
                var2.method3156(18291, 0.0F);
                var2.method3156(18291, 0.0F);
                var2.method3156(18291, 0.0F);
            } else {
                var2.method3157(-1.0F, (byte) -122);
                var2.method3157(-1.0F, (byte) -103);
                var2.method3157(0.0F, (byte) -113);
                var2.method3157(0.0F, (byte) -112);
                var2.method3157(1.0F, (byte) -124);
                var2.method3157(1.0F, (byte) -99);
                var2.method3157(-1.0F, (byte) -95);
                var2.method3157(0.0F, (byte) -94);
                var2.method3157(1.0F, (byte) -118);
                var2.method3157(1.0F, (byte) -112);
                var2.method3157(1.0F, (byte) -89);
                var2.method3157(1.0F, (byte) -102);
                var2.method3157(0.0F, (byte) -109);
                var2.method3157(1.0F, (byte) -109);
                var2.method3157(0.0F, (byte) -112);
                var2.method3157(-1.0F, (byte) -101);
                var2.method3157(1.0F, (byte) -93);
                var2.method3157(0.0F, (byte) -123);
                var2.method3157(0.0F, (byte) -110);
                var2.method3157(0.0F, (byte) -113);
            }
            this.field619 = this.method178(2, false, 20, var2.field3066, var2.field3109);
            this.field671 = new class744(this.field619, 5126, 3, 0);
            this.field655 = new class744(this.field619, 5126, 2, 12);
            this.field533.method3607(643267468, this);
        }
    }

    @OriginalMember(owner = "client!qo", name = "A", descriptor = "(ILaa;II)V", line = 2763)
    public final void method271(int arg0, class487 arg1, int arg2, int arg3) {
        ++field517;
        class683 var5 = (class683) arg1;
        class588 var6 = var5.field9252;
        this.method314(119);
        this.method256((byte) -88, var5.field9252);
        this.method222(1, 1);
        this.method175(7681, (byte) -103, 8448);
        this.method239(34167, 768, (byte) -87, 0);
        float var7 = var6.field8014 / (float) var6.field8017;
        float var8 = var6.field8015 / (float) var6.field8016;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field690) * var7, (float) (-arg3 + this.field595) * var8);
        OpenGL.glVertex2i(this.field690, this.field595);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field690) * var7, (float) (-arg3 + this.field609) * var8);
        OpenGL.glVertex2i(this.field690, this.field609);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field677) * var7, (float) (-arg3 + this.field609) * var8);
        OpenGL.glVertex2i(this.field677, this.field609);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field677) * var7, (float) (-arg3 + this.field595) * var8);
        OpenGL.glVertex2i(this.field677, this.field595);
        OpenGL.glEnd();
        this.method239(5890, 768, (byte) -87, 0);
    }

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "()Z", line = 2795)
    public final boolean method272() {
        ++field415;
        return false;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)Lvm;", line = 2803)
    public final class686 method273(int arg0, int arg1) {
        ++field501;
        return null;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZIII)V", line = 2811)
    public final void method274(boolean arg0, int arg1, int arg2, int arg3) {
        ++field353;
        if (arg0) {
            this.method193();
        }
        OpenGL.glTexEnvi(8960, arg1 + 34184, arg3);
        OpenGL.glTexEnvi(8960, arg1 + 34200, arg2);
    }

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "(I)V", line = 2824)
    private final void method275(int arg0) {
        ++field431;
        if (arg0 != 22544) {
            this.field552 = null;
        }
        int var2 = 0;
        while (!this.field486.method3568()) {
            if (~(var2++) < -6) {
                throw new RuntimeException("");
            }
            class700.method3916((byte) -3, 1000L);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIIII)V", line = 2847)
    public final void method276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field484;
        OpenGL.glLineWidth((float) arg5);
        this.method234(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!qo", name = "ra", descriptor = "(IIII)V", line = 2859)
    public final void method277(int arg0, int arg1, int arg2, int arg3) {
        ++field482;
        this.field610 = arg0;
        this.field670 = arg2;
        this.field628 = arg1;
        this.field668 = true;
        this.field631 = arg3;
    }

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "(I)V", line = 2878)
    private final void method278(int arg0) {
        ++field454;
        this.field601[10] = this.field676;
        this.field601[14] = this.field664;
        this.field697 = (float) this.field636;
        if (arg0 != -24051) {
            this.field643 = null;
        }
        this.field696 = (this.field601[14] - (float) this.field636) / this.field601[10];
    }

    @OriginalMember(owner = "client!qo", name = "T", descriptor = "(IIII)V", line = 2898)
    public final void method279(int arg0, int arg1, int arg2, int arg3) {
        if (~this.field595 > ~arg1) {
            this.field595 = arg1;
        }
        ++field470;
        if (this.field609 > arg3) {
            this.field609 = arg3;
        }
        if (~this.field690 > ~arg0) {
            this.field690 = arg0;
        }
        if (arg2 < this.field677) {
            this.field677 = arg2;
        }
        OpenGL.glEnable(3089);
        this.method260((byte) 125);
        this.method363((byte) 11);
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 2925)
    public final void method280(Canvas arg0, int arg1, int arg2) {
        ++field523;
        long var4 = 0L;
        if (arg0 != null && this.field448 != arg0) {
            if (this.field399.containsKey(arg0)) {
                Long var6 = (Long) this.field399.get(arg0);
                var4 = var6;
            }
        } else {
            var4 = this.field375;
        }
        if (var4 == 0L) {
            throw new RuntimeException();
        } else {
            this.field486.surfaceResized(var4);
            if (this.field397 == arg0) {
                this.method201((byte) 117);
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "([IIIIIZ)Lmi;", line = 2955)
    public final class496 method281(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field344;
        return new class557(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "(B)V", line = 2965)
    private final void method282(byte arg0) {
        if (this.field587 != 1) {
            this.method240(5888);
            this.method357(false, 2);
            this.method173(false, 48);
            this.method215(107, false);
            this.method205(0, false);
            this.method256((byte) -122, (class36) null);
            this.method229(-2, -45);
            this.method237(0, 1);
            this.field587 = 1;
        }
        if (arg0 <= -115) {
            ++field416;
        }
    }

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "(I)V", line = 2988)
    private final void method283(int arg0) {
        class696.field9403[3] = 1.0F;
        ++field410;
        class696.field9403[0] = this.field654 * this.field603;
        class696.field9403[1] = this.field654 * this.field638;
        if (arg0 == 29890) {
            class696.field9403[2] = this.field654 * this.field645;
            OpenGL.glLightfv(16384, 4609, class696.field9403, 0);
            class696.field9403[2] = -this.field693 * this.field645;
            class696.field9403[3] = 1.0F;
            class696.field9403[1] = -this.field693 * this.field638;
            class696.field9403[0] = -this.field693 * this.field603;
            OpenGL.glLightfv(16385, 4609, class696.field9403, 0);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)V", line = 3009)
    public final synchronized void method284(int arg0, int arg1, int arg2) {
        ++field438;
        class113 var4 = new class113(arg0);
        var4.field5204 = (long) arg2;
        this.field573.method1273(var4, -20180);
        if (arg1 != -1) {
            this.method181(-17, -42, -40, (byte[]) null, true);
        }
    }

    @OriginalMember(owner = "client!qo", name = "M", descriptor = "()I", line = 3023)
    public final int method285() {
        ++field384;
        int var1 = this.field703;
        this.field703 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(BI)I", line = 3034)
    public final int method286(byte arg0, int arg1) {
        ++field435;
        if (~arg1 == -2) {
            return 7681;
        } else if (~arg1 == -1) {
            return 8448;
        } else if (arg1 != 2) {
            if (~arg1 != -4) {
                if (arg1 == 4) {
                    return 34023;
                } else {
                    if (arg0 != 17) {
                        this.field636 = -39;
                    }
                    throw new IllegalArgumentException();
                }
            } else {
                return 260;
            }
        } else {
            return 34165;
        }
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(Ltv;I)V", line = 3064)
    public final void method287(class560 arg0, int arg1) {
        ++field462;
        if (this.field560 >= 3) {
            throw new RuntimeException();
        } else {
            if (arg1 != 327685) {
                this.method276(-94, -9, -90, -108, 41, -52, 70);
            }
            if (this.field560 >= 0) {
                this.field563[this.field560].method3213((byte) -47);
            }
            this.field567 = this.field563[++this.field560] = arg0;
            this.field567.method3217(-27141);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIII)V", line = 3088)
    public final void method288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field437;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        this.method282((byte) -119);
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method222(arg5, 1);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field665) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field665) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!qo", name = "H", descriptor = "(III[I)V", line = 3123)
    public final void method289(int arg0, int arg1, int arg2, int[] arg3) {
        ++field459;
        float var5 = (float) arg2 * this.field582.field6883 + (float) arg0 * this.field582.field6855 + (float) arg1 * this.field582.field6853 + this.field582.field6850;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field582.field6880 + (float) arg0 * this.field582.field6869 + (float) arg1 * this.field582.field6849 + this.field582.field6846) * (float) this.field593 / var5);
            int var7 = (int) (((float) arg2 * this.field582.field6861 + (float) arg0 * this.field582.field6860 + (float) arg1 * this.field582.field6868 + this.field582.field6871) * (float) this.field616 / var5);
            arg3[0] = (int) ((float) var6 + -this.field694);
            arg3[2] = (int) var5;
            arg3[1] = (int) ((float) var7 + -this.field658);
        }
    }

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "()Lbca;", line = 3146)
    public final class661 method290() {
        ++field538;
        return new class495();
    }

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "()Z", line = 3154)
    public final boolean method291() {
        ++field492;
        if (this.field543 != null) {
            if (!this.field543.method387((byte) 1)) {
                if (!this.field542.method1079(this.field543, true)) {
                    return false;
                }
                this.field545.method1952((byte) -110);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qo", name = "u", descriptor = "(I)V", line = 3180)
    private final void method292(int arg0) {
        ++field349;
        int var2;
        for (var2 = arg0; this.field684 > var2; ++var2) {
            class669 var3 = this.field680[var2];
            class219.field3168[0] = (float) var3.method3759(-1);
            int var4 = var2 + 16386;
            class219.field3168[1] = (float) var3.method3757(127);
            class219.field3168[2] = (float) var3.method3752((byte) 77);
            class219.field3168[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class219.field3168, 0);
            int var5 = var3.method3755(-1);
            float var6 = var3.method3756(-76) / 255.0F;
            class219.field3168[2] = (float) class263.method1762(var5, 255) * var6;
            class219.field3168[0] = (float) (class263.method1762(16762087, var5) >> 16) * var6;
            class219.field3168[1] = (float) (class263.method1762(var5, 65533) >> 8) * var6;
            OpenGL.glLightfv(var4, 4609, class219.field3168, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method3758(-1) * var3.method3758(-1)));
            OpenGL.glEnable(var4);
        }
        while (~var2 > ~this.field661) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field661 = this.field684;
    }

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "(B)V", line = 3223)
    public final void method293(byte arg0) {
        if (this.field587 != 8) {
            this.method192(-14388);
            this.method357(true, 2);
            this.method215(114, true);
            this.method205(arg0 + 62, true);
            this.method222(1, 1);
            this.field587 = 8;
        }
        ++field487;
        if (arg0 != -62) {
            this.field448 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "(II)I", line = 3244)
    public final int method294(int arg0, int arg1) {
        ++field504;
        if (~arg0 != -5122 && arg0 != 5120) {
            if (arg1 != 4) {
                this.field615 = false;
            }
            if (arg0 != 5123 && arg0 != 5122) {
                if (arg0 != 5125 && arg0 != 5124 && ~arg0 != -5127) {
                    throw new IllegalArgumentException("");
                } else {
                    return 4;
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lmda;I)V", line = 3265)
    public final void method295(class266 arg0, int arg1) {
        this.field533.method3604(this, (byte) -116, arg1, arg0);
        ++field509;
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(Z)V", line = 3273)
    private final void method296(boolean arg0) {
        ++field452;
        this.field650 = new class36[this.field617];
        this.field649 = new class533(this, 3553, 6408, 1, 1);
        new class533(this, 3553, 6408, 1, 1);
        new class533(this, 3553, 6408, 1, 1);
        this.field686 = new class624(this);
        this.field660 = new class624(this);
        this.field625 = new class624(this);
        this.field656 = new class624(this);
        this.field662 = new class624(this);
        this.field602 = new class624(this);
        this.field624 = new class624(this);
        this.field643 = new class624(this);
        if (!arg0) {
            this.field666 = new class624(this);
            this.field607 = new class624(this);
            if (this.field642) {
                this.field600 = new class643(this);
                new class643(this);
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "v", descriptor = "(I)V", line = 3318)
    private final void method297(int arg0) {
        class696.field9403[3] = 1.0F;
        ++field483;
        class696.field9403[0] = this.field603 * this.field590;
        class696.field9403[2] = this.field645 * this.field590;
        class696.field9403[1] = this.field638 * this.field590;
        OpenGL.glLightModelfv(2899, class696.field9403, 0);
        if (arg0 >= -13) {
            this.field564 = 102;
        }
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "()Lfia;", line = 3333)
    public final class575 method298() {
        ++field429;
        int var1 = -1;
        if (this.field667.indexOf("nvidia") == -1) {
            if (~this.field667.indexOf("intel") != 0) {
                var1 = 32902;
            } else if (this.field667.indexOf("ati") != -1) {
                var1 = 4098;
            }
        } else {
            var1 = 4318;
        }
        return new class575(var1, "OpenGL", this.field611, this.field612, 0L);
    }

    @OriginalMember(owner = "client!qo", name = "da", descriptor = "(III[I)V", line = 3355)
    public final void method299(int arg0, int arg1, int arg2, int[] arg3) {
        ++field350;
        float var5 = (float) arg2 * this.field582.field6883 + (float) arg0 * this.field582.field6855 + (float) arg1 * this.field582.field6853 + this.field582.field6850;
        if (!(var5 < (float) this.field648) && !(var5 > (float) this.field636)) {
            int var6 = (int) (((float) arg2 * this.field582.field6880 + (float) arg0 * this.field582.field6869 + (float) arg1 * this.field582.field6849 + this.field582.field6846) * (float) this.field593 / var5);
            int var7 = (int) (((float) arg2 * this.field582.field6861 + (float) arg0 * this.field582.field6860 + (float) arg1 * this.field582.field6868 + this.field582.field6871) * (float) this.field616 / var5);
            if (this.field694 <= (float) var6 && (float) var6 <= this.field657 && this.field658 <= (float) var7 && this.field652 >= (float) var7) {
                arg3[2] = (int) var5;
                arg3[0] = (int) ((float) var6 + -this.field694);
                arg3[1] = (int) ((float) var7 + -this.field658);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!qo", name = "w", descriptor = "(I)V", line = 3389)
    public final void method300(int arg0) {
        ++field469;
        if (arg0 == -18516) {
            OpenGL.glPushMatrix();
        }
    }

    @OriginalMember(owner = "client!qo", name = "F", descriptor = "(II)V", line = 3401)
    public final void method301(int arg0, int arg1) {
        ++field541;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lis;)V", line = 3410)
    public final void method302(class503 arg0) {
        ++field412;
    }

    @OriginalMember(owner = "client!qo", name = "KA", descriptor = "(IIII)V", line = 3418)
    public final void method303(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        ++field539;
        if (~this.field510 > ~arg2) {
            arg2 = this.field510;
        }
        if (~arg0 > -1) {
            arg0 = 0;
        }
        if (~this.field463 > ~arg3) {
            arg3 = this.field463;
        }
        this.field677 = arg2;
        this.field609 = arg3;
        this.field595 = arg1;
        this.field690 = arg0;
        OpenGL.glEnable(3089);
        this.method260((byte) 126);
        this.method363((byte) 11);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(BF)V", line = 3447)
    public final void method304(byte arg0, float arg1) {
        if (this.field673 != arg1) {
            this.field673 = arg1;
            if (this.field687 == 3) {
                this.method203((byte) -63);
            }
        }
        if (arg0 <= -101) {
            ++field367;
        }
    }

    @OriginalMember(owner = "client!qo", name = "la", descriptor = "()V", line = 3466)
    public final void method305() {
        this.field595 = 0;
        ++field464;
        this.field609 = this.field463;
        this.field677 = this.field510;
        this.field690 = 0;
        OpenGL.glDisable(3089);
        this.method260((byte) 125);
    }

    @OriginalMember(owner = "client!qo", name = "C", descriptor = "(Z)V", line = 3483)
    public final void method306(boolean arg0) {
        this.field692 = arg0;
        ++field424;
        this.method321(-30199);
    }

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "()V", line = 3497)
    public final void method307() {
        ++field426;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(III)V", line = 3506)
    public final void method308(int arg0, int arg1, int arg2) {
        if (arg0 > 94) {
            ++field546;
            this.field689 = arg1;
            this.field592 = arg2;
            this.method360(true);
            this.method363((byte) 11);
        }
    }

    @OriginalMember(owner = "client!qo", name = "JA", descriptor = "(IIIIII)I", line = 3521)
    public final int method309(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field474;
        int var7 = 0;
        float var8 = (float) arg2 * this.field582.field6883 + (float) arg0 * this.field582.field6855 + (float) arg1 * this.field582.field6853 + this.field582.field6850;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field582.field6883 + (float) arg3 * this.field582.field6855 + (float) arg4 * this.field582.field6853 + this.field582.field6850;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if ((float) this.field648 > var8 && (float) this.field648 > var9) {
            var7 |= 16;
        } else if (var8 > (float) this.field636 && var9 > (float) this.field636) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field582.field6880 + (float) arg0 * this.field582.field6869 + (float) arg1 * this.field582.field6849 + this.field582.field6846) * (float) this.field593 / var8);
        int var11 = (int) (((float) arg5 * this.field582.field6880 + (float) arg3 * this.field582.field6869 + (float) arg4 * this.field582.field6849 + this.field582.field6846) * (float) this.field593 / var9);
        if ((float) var10 < this.field694 && this.field694 > (float) var11) {
            var7 |= 1;
        } else if ((float) var10 > this.field657 && (float) var11 > this.field657) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field582.field6861 + (float) arg0 * this.field582.field6860 + (float) arg1 * this.field582.field6868 + this.field582.field6871) * (float) this.field616 / var8);
        int var13 = (int) (((float) arg5 * this.field582.field6861 + (float) arg3 * this.field582.field6860 + (float) arg4 * this.field582.field6868 + this.field582.field6871) * (float) this.field616 / var9);
        if ((float) var12 < this.field658 && this.field658 > (float) var13) {
            var7 |= 4;
        } else if ((float) var12 > this.field652 && (float) var13 > this.field652) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "()Z", line = 3572)
    public final boolean method310() {
        ++field506;
        return true;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIZ)Lmi;", line = 3580)
    public final class496 method311(int arg0, int arg1, boolean arg2) {
        ++field447;
        return new class557(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "(I)V", line = 3588)
    public final void method312(int arg0) {
        ++field485;
        this.method331(0);
    }

    @OriginalMember(owner = "client!qo", name = "x", descriptor = "(I)V", line = 3599)
    private final void method313(int arg0) {
        ++field365;
        this.method229(-2, -69);
        for (int var2 = this.field617 - 1; var2 >= 0; --var2) {
            this.method190(-15039, var2);
            this.method256((byte) -88, (class36) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method175(8448, (byte) 119, 8448);
        this.method239(34168, 770, (byte) -87, 2);
        this.method246(-21974);
        this.field586 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field584 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field583 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field580 = true;
        this.method357(true, 2);
        this.method173(true, 71);
        this.method215(124, true);
        this.method205(0, true);
        this.method224(arg0 ^ -25886);
        this.field486.setSwapInterval(0);
        OpenGL.glShadeModel(7425);
        OpenGL.glClearDepth(1.0F);
        OpenGL.glDepthFunc(515);
        OpenGL.glPolygonMode(1028, 6914);
        OpenGL.glEnable(2884);
        OpenGL.glCullFace(1029);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glColorMaterial(1028, 5634);
        OpenGL.glEnable(2903);
        float[] var3 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var4 = 0; var4 < 8; ++var4) {
            int var5 = var4 + 16384;
            OpenGL.glLightfv(var5, 4608, var3, 0);
            OpenGL.glLightf(var5, 4615, 0.0F);
            OpenGL.glLightf(var5, 4616, 0.0F);
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        if (arg0 != 25858) {
            this.field686 = null;
        }
        OpenGL.glHint(3156, 4353);
        this.field630 = this.field678 = -1;
        this.method305();
    }

    @OriginalMember(owner = "client!qo", name = "y", descriptor = "(I)V", line = 3671)
    public final void method314(int arg0) {
        if (arg0 < 45) {
            this.method278(-72);
        }
        if (this.field587 != 2) {
            this.method240(5888);
            this.method357(false, 2);
            this.method173(false, 66);
            this.method215(115, false);
            this.method205(0, false);
            this.method229(-2, -67);
            this.field587 = 2;
        }
        ++field430;
    }

    @OriginalMember(owner = "client!qo", name = "I", descriptor = "()I", line = 3694)
    public final int method315() {
        ++field373;
        int var1 = this.field700;
        this.field700 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILni;)V", line = 3709)
    public final void method316(int arg0, class522 arg1) {
        if (arg0 == 1) {
            ++field382;
            if (this.field639 != arg1) {
                if (this.field695) {
                    OpenGL.glBindBufferARB(34963, arg1.method444(-23923));
                }
                this.field639 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lnh;Lnh;ILnh;Lnh;)V", line = 3728)
    public final void method317(class744 arg0, class744 arg1, int arg2, class744 arg3, class744 arg4) {
        if (arg0 != null) {
            this.method211(arg2 + 26493, arg0.field9994);
            OpenGL.glVertexPointer(arg0.field9997, arg0.field9993, this.field674.method959((byte) -97), this.field674.method964((byte) 42) - -((long) arg0.field9995));
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        ++field351;
        if (arg4 != null) {
            this.method211(56, arg4.field9994);
            OpenGL.glNormalPointer(arg4.field9993, this.field674.method959((byte) -97), this.field674.method964((byte) 42) - -((long) arg4.field9995));
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg1 != null) {
            this.method211(67, arg1.field9994);
            OpenGL.glColorPointer(arg1.field9997, arg1.field9993, this.field674.method959((byte) -97), this.field674.method964((byte) 42) + (long) arg1.field9995);
            OpenGL.glEnableClientState(32886);
        } else {
            OpenGL.glDisableClientState(32886);
        }
        if (arg2 == -26411) {
            if (arg3 != null) {
                this.method211(119, arg3.field9994);
                OpenGL.glTexCoordPointer(arg3.field9997, arg3.field9993, this.field674.method959((byte) -97), this.field674.method964((byte) 42) - -((long) arg3.field9995));
                OpenGL.glEnableClientState(32888);
            } else {
                OpenGL.glDisableClientState(32888);
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "x", descriptor = "()I", line = 3777)
    public final int method318() {
        ++field494;
        return 4;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lhe;Lvm;)Lis;", line = 3785)
    public final class503 method319(class372 arg0, class686 arg1) {
        ++field418;
        return null;
    }

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "()Lbca;", line = 3794)
    public final class661 method320() {
        ++field472;
        return this.field582;
    }

    @OriginalMember(owner = "client!qo", name = "z", descriptor = "(I)V", line = 3802)
    private final void method321(int arg0) {
        OpenGL.glDepthMask(this.field581 && this.field692);
        ++field400;
        if (arg0 != -30199) {
            this.method206((int[]) null);
        }
    }

    @OriginalMember(owner = "client!qo", name = "y", descriptor = "()Lbca;", line = 3813)
    public final class661 method322() {
        ++field409;
        return this.field547;
    }

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "()I", line = 3821)
    public final int method323() {
        ++field450;
        return this.field648;
    }

    @OriginalMember(owner = "client!qo", name = "ya", descriptor = "()V", line = 3832)
    public final void method324() {
        ++field356;
        this.method205(0, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(Z)V", line = 3843)
    public final void method325(boolean arg0) {
        ++field513;
    }

    @OriginalMember(owner = "client!qo", name = "A", descriptor = "(I)V", line = 3854)
    public final void method326(int arg0) {
        OpenGL.glLightfv(arg0, 4611, this.field647, 0);
        ++field358;
        OpenGL.glLightfv(16385, 4611, this.field633, 0);
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "()Z", line = 3863)
    public final boolean method327() {
        ++field489;
        return this.field529.method2623((byte) -91, 3);
    }

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "()Z", line = 3871)
    public final boolean method328() {
        ++field359;
        return this.field543 != null && this.field543.method387((byte) 1);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I[Lab;)V", line = 3879)
    public final void method329(int arg0, class669[] arg1) {
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field680[var3] = arg1[var3];
        }
        ++field432;
        this.field684 = arg0;
        if (~this.field687 != -2) {
            this.method292(0);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)V", line = 3900)
    public final void method330(boolean arg0) {
        ++field442;
    }

    @OriginalMember(owner = "client!qo", name = "B", descriptor = "(I)V", line = 3913)
    private final void method331(int arg0) {
        if (arg0 != 0) {
            this.field705 = null;
        }
        ++field368;
        this.field486.method3567();
    }

    @OriginalMember(owner = "client!qo", name = "pa", descriptor = "()V", line = 3924)
    public final void method332() {
        ++field346;
        this.field668 = false;
    }

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "(IIIIIII)I", line = 3940)
    public final int method333(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field491;
        float var8 = (float) arg2 * this.field582.field6883 + (float) arg0 * this.field582.field6855 + (float) arg1 * this.field582.field6853 + this.field582.field6850;
        float var9 = (float) arg5 * this.field582.field6883 + (float) arg3 * this.field582.field6855 + (float) arg4 * this.field582.field6853 + this.field582.field6850;
        int var10 = 0;
        if (var8 < (float) this.field648 && (float) this.field648 > var9) {
            var10 |= 16;
        } else if ((float) this.field636 < var8 && var9 > (float) this.field636) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field582.field6880 + (float) arg0 * this.field582.field6869 + (float) arg1 * this.field582.field6849 + this.field582.field6846) * (float) this.field593 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field582.field6880 + (float) arg3 * this.field582.field6869 + (float) arg4 * this.field582.field6849 + this.field582.field6846) * (float) this.field593 / (float) arg6);
        if (this.field694 > (float) var11 && this.field694 > (float) var12) {
            var10 |= 1;
        } else if (this.field657 < (float) var11 && (float) var12 > this.field657) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field582.field6861 + (float) arg0 * this.field582.field6860 + (float) arg1 * this.field582.field6868 + this.field582.field6871) * (float) this.field616 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field582.field6861 + (float) arg3 * this.field582.field6860 + (float) arg4 * this.field582.field6868 + this.field582.field6871) * (float) this.field616 / (float) arg6);
        if (this.field658 > (float) var13 && (float) var14 < this.field658) {
            var10 |= 4;
        } else if ((float) var13 > this.field652 && this.field652 < (float) var14) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "(II)I", line = 3987)
    public final int method334(int arg0, int arg1) {
        ++field520;
        if (arg1 != 2) {
            this.field694 = -1.3399854F;
        }
        if (arg0 != 6406 && arg0 != 6409) {
            if (~arg0 != -6411 && arg0 != 34846 && arg0 != 34844) {
                if (arg0 == 6407) {
                    return 3;
                } else if (~arg0 != -6409 && ~arg0 != -34848) {
                    if (~arg0 == -34844) {
                        return 6;
                    } else if (~arg0 == -34843) {
                        return 8;
                    } else if (arg0 == 6402) {
                        return 3;
                    } else if (~arg0 == -6402) {
                        return 1;
                    } else {
                        throw new IllegalArgumentException("");
                    }
                } else {
                    return 4;
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(FFFB)V", line = 4030)
    private final void method335(float arg0, float arg1, float arg2, byte arg3) {
        OpenGL.glMatrixMode(5890);
        ++field407;
        if (this.field682) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg2, arg0, arg1);
        int var5 = -9 / ((81 - arg3) / 44);
        OpenGL.glMatrixMode(5888);
        this.field682 = true;
    }

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "(II)V", line = 4047)
    public final synchronized void method336(int arg0, int arg1) {
        ++field392;
        class113 var3 = new class113(arg1);
        if (arg0 > 71) {
            this.field575.method1273(var3, -20180);
        }
    }

    @OriginalMember(owner = "client!qo", name = "v", descriptor = "()V", line = 4060)
    public final void method337() {
        this.field542.method1077(-53);
        ++field417;
    }

    @OriginalMember(owner = "client!qo", name = "P", descriptor = "(IIIII)V", line = 4070)
    public final void method338(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method282((byte) -124);
        ++field405;
        this.method222(arg4, 1);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!qo", name = "E", descriptor = "()I", line = 4090)
    public final int method339() {
        ++field361;
        return this.field572 + this.field570 + this.field569;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lwh;Lwh;FLwh;)Lwh;", line = 4098)
    public final class149 method340(class149 arg0, class149 arg1, float arg2, class149 arg3) {
        ++field480;
        if (arg0 != null && arg1 != null && this.field685 && this.field642) {
            class105 var5 = null;
            class3 var6 = (class3) arg0;
            class3 var7 = (class3) arg1;
            class429 var8 = var6.method9((byte) -121);
            class429 var9 = var7.method9((byte) -121);
            if (var8 != null && var9 != null) {
                int var10 = var9.field6155 >= var8.field6155 ? var9.field6155 : var8.field6155;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class105) {
                    class105 var11 = (class105) arg3;
                    if (var10 == var11.method955(65534)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class105(this, var10);
                }
                if (var5.method954(var8, arg2, 65534, var9)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 4146)
    public final void method341(Canvas arg0) {
        this.field397 = null;
        ++field443;
        this.field458 = 0L;
        if (arg0 != null && this.field448 != arg0) {
            if (this.field399.containsKey(arg0)) {
                Long var2 = (Long) this.field399.get(arg0);
                this.field458 = var2;
                this.field397 = arg0;
            }
        } else {
            this.field397 = this.field448;
            this.field458 = this.field375;
        }
        if (this.field397 != null && this.field458 != 0L) {
            this.field486.setSurface(this.field458);
            this.method201((byte) 92);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZII)V", line = 4177)
    public final void method342(boolean arg0, int arg1, int arg2) {
        int var4 = 57 / ((39 - arg2) / 52);
        ++field466;
        this.method202(arg0, arg1, true, 115);
    }

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "(II)I", line = 4188)
    public final int method343(int arg0, int arg1) {
        ++field449;
        return arg1 ^ arg0 & arg1;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 4196)
    public final void method344(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class721 {
        this.method348(arg2, arg3);
        ++field406;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(IIIIIII)V", line = 4204)
    public static final void method345(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field394;
        int var7 = class219.field3167;
        class526.field7281 = 0;
        int[] var8 = class87.field1561;
        for (int var9 = 0; ~(class738.field9939 + var7) < ~var9; ++var9) {
            class334 var37 = null;
            class390 var38;
            if (var7 > var9) {
                var38 = class49.field1040[var8[var9]];
            } else {
                var38 = ((class751) class86.field1546.method1465((long) class737.field9925[-var7 + var9], arg2 ^ -6006)).field10510;
                var37 = ((class9) var38).field126;
                if (var37.field4694 != null) {
                    var37 = var37.method2110(class390.field5635, arg2 + -3);
                    if (var37 == null) {
                        continue;
                    }
                }
            }
            if (var38.field5711 >= 0 && (~class448.field6342 == ~var38.field5727 || ~class58.field1147.field5926 == ~var38.field5926)) {
                class6.method23(var38.method58(200), arg4 >> 1, arg6, arg5, arg1 >> 1, var38, (byte) 100);
                if (class339.field4768[0] >= 0) {
                    if (var38.field5718 != null && (var7 <= var9 || ~class415.field6008 == -1 || class415.field6008 == 3 || class415.field6008 == 1 && class663.method3724(((class598) var38).field8189, (byte) -63)) && class526.field7281 < class604.field8287) {
                        class604.field8292[class526.field7281] = class140.field2316.method3389(true, var38.field5718) / 2;
                        class604.field8295[class526.field7281] = class339.field4768[0];
                        class604.field8286[class526.field7281] = class339.field4768[1];
                        class604.field8290[class526.field7281] = var38.field5627;
                        class604.field8279[class526.field7281] = var38.field5660;
                        class604.field8285[class526.field7281] = var38.field5690;
                        class604.field8291[class526.field7281] = var38.field5718;
                        ++class526.field7281;
                    }
                    int var39 = class339.field4768[1] + arg0;
                    int var50;
                    if (!var38.field5735 && ~var38.field5649 < ~class641.field8810) {
                        boolean var40 = true;
                        byte var41 = 1;
                        int var42;
                        if (~var9 <= ~var7) {
                            var42 = var37.field4690;
                            if (~var42 == 0) {
                                var42 = var38.method2445((byte) 72).field5853;
                            }
                        } else {
                            class598 var43 = class49.field1040[var8[var9]];
                            var42 = var38.method2445((byte) 72).field5853;
                            if (var43.field8199) {
                                var41 = 2;
                            }
                        }
                        class496[] var44 = class19.field294;
                        if (~var42 != 0) {
                            class496[] var45 = (class496[]) class321.field4406.method992((long) var42, arg2 ^ -122);
                            if (var45 == null) {
                                class267[] var46 = class267.method1778(class569.field7819, var42, 0);
                                if (var46 != null) {
                                    var45 = new class496[var46.length];
                                    for (int var47 = 0; var46.length > var47; ++var47) {
                                        var45[var47] = class272.field3822.method356(var46[var47], true);
                                    }
                                    class321.field4406.method991(var45, (long) var42, (byte) -94);
                                }
                            }
                            if (var45 != null && ~var45.length <= -3) {
                                var44 = var45;
                            }
                        }
                        if (~var41 <= ~var44.length) {
                            var41 = 1;
                        }
                        class496 var48 = var44[0];
                        class496 var49 = var44[var41];
                        var50 = var39 - Math.max(class140.field2316.field8155, var48.method1619());
                        int var51 = class339.field4768[0] + arg3 + -(var48.method1626() >> 1);
                        int var52 = var48.method1626() * var38.field5721 / 255;
                        int var53 = var48.method1619();
                        if (~var38.field5721 < -1 && ~var52 > -3) {
                            var52 = 2;
                        }
                        var48.method2925(var51, var50);
                        class272.field3822.method279(var51, var50, var51 + var52, var50 + var53);
                        var49.method2925(var51, var50);
                        class272.field3822.method303(arg3, arg0, arg3 - -arg4, arg0 + arg1);
                        class546.method3152(-5590, var51, var51 + var48.method1618(), var50, var50 + var53);
                    } else {
                        var50 = var39 - Math.max(class140.field2316.field8155, class19.field294[0].method1619());
                    }
                    var50 -= 2;
                    if (!var38.field5735) {
                        if (var38.field5713 > class641.field8810) {
                            class496 var54 = class294.field4119[var38.field5652 ? 2 : 0];
                            class496 var55 = class294.field4119[!var38.field5652 ? 1 : 3];
                            boolean var56 = true;
                            int var57;
                            if (var38 instanceof class9) {
                                var57 = var37.field4699;
                                if (var57 == -1) {
                                    var57 = var38.method2445((byte) 72).field5867;
                                }
                            } else {
                                var57 = var38.method2445((byte) 72).field5867;
                            }
                            if (~var57 != 0) {
                                class496[] var58 = (class496[]) class222.field3183.method992((long) var57, -45);
                                if (var58 == null) {
                                    class267[] var59 = class267.method1778(class569.field7819, var57, 0);
                                    if (var59 != null) {
                                        var58 = new class496[var59.length];
                                        for (int var60 = 0; ~var60 > ~var59.length; ++var60) {
                                            var58[var60] = class272.field3822.method356(var59[var60], true);
                                        }
                                        class222.field3183.method991(var58, (long) var57, (byte) -101);
                                    }
                                }
                                if (var58 != null && var58.length == 4) {
                                    var55 = var58[!var38.field5652 ? 1 : 3];
                                    var54 = var58[!var38.field5652 ? 0 : 2];
                                }
                            }
                            int var61 = -class641.field8810 + var38.field5713;
                            int var64;
                            if (~var38.field5653 > ~var61) {
                                int var62 = var61 - var38.field5653;
                                int var63 = ~var38.field5697 != -1 ? (var38.field5636 - var62) / var38.field5697 * var38.field5697 : 0;
                                var64 = var54.method1626() * var63 / var38.field5636;
                            } else {
                                var64 = var54.method1626();
                            }
                            int var65 = var54.method1619();
                            var50 -= var65;
                            int var66 = class339.field4768[0] + arg3 + -(var54.method1626() >> 1);
                            var54.method2925(var66, var50);
                            class272.field3822.method279(var66, var50, var66 - -var64, var50 - -var65);
                            var55.method2925(var66, var50);
                            class272.field3822.method303(arg3, arg0, arg3 + arg4, arg0 - -arg1);
                            class546.method3152(-5590, var66, var54.method1618() + var66, var50, var50 + var65);
                            var50 -= 2;
                        }
                        if (~var7 < ~var9) {
                            class598 var67 = (class598) var38;
                            if (~var67.field8185 != 0) {
                                var50 -= 25;
                                class496 var68 = class328.field4566[var67.field8185];
                                var68.method2925(arg3 + -12 + class339.field4768[0], var50);
                                class546.method3152(-5590, class339.field4768[0] + -12 + arg3, arg3 - -class339.field4768[0] + -12 + var68.method1618(), var50, var50 + var68.method1614());
                                var50 -= 2;
                            }
                            if (~var67.field8167 != 0) {
                                var50 -= 25;
                                class496 var69 = class231.field3346[var67.field8167];
                                var69.method2925(arg3 + -12 + class339.field4768[0], var50);
                                class546.method3152(-5590, class339.field4768[0] + -12 + arg3, class339.field4768[0] + arg3 - (12 + -var69.method1618()), var50, var50 - -var69.method1614());
                                var50 -= 2;
                            }
                        } else if (var37.field4692 >= 0 && ~class231.field3346.length < ~var37.field4692) {
                            class496 var70 = class231.field3346[var37.field4692];
                            var50 -= 25;
                            var70.method2925(class339.field4768[0] + arg3 + -(var70.method1626() >> 1), var50);
                            class546.method3152(-5590, class339.field4768[0] + (arg3 - (var70.method1626() >> 1)), class339.field4768[0] + (arg3 - (var70.method1626() >> 1)) + var70.method1618(), var50, var70.method1614() + var50);
                            var50 -= 2;
                        }
                    }
                    int var10000;
                    if (var38 instanceof class598) {
                        if (~var9 <= -1) {
                            int var71 = 0;
                            class741[] var72 = class55.field1118;
                            for (int var73 = 0; ~var72.length < ~var73; ++var73) {
                                class741 var75 = var72[var73];
                                if (var75 != null && var75.field9982 == 10 && ~var8[var9] == ~var75.field9975) {
                                    class496 var76 = class280.field3932[var75.field9973];
                                    if (~var76.method1619() < ~var71) {
                                        var71 = var76.method1619();
                                    }
                                    var76.method2925(class339.field4768[0] + arg3 + -12, var50 + -var76.method1619());
                                    class546.method3152(-5590, arg3 - -class339.field4768[0] + -12, arg3 + (class339.field4768[0] + -12 - -var76.method1618()), -var76.method1619() + var50, var50 + -var76.method1619() - -var76.method1614());
                                }
                            }
                            if (~var71 < -1) {
                                var10000 = var50 - (var71 + 2);
                            }
                        }
                    } else {
                        int var77 = 0;
                        class741[] var78 = class55.field1118;
                        for (int var79 = 0; var78.length > var79; ++var79) {
                            class741 var179 = var78[var79];
                            if (var179 != null && ~var179.field9982 == -2 && ~class737.field9925[var9 - var7] == ~var179.field9975) {
                                class496 var180 = class280.field3932[var179.field9973];
                                if (~var77 > ~var180.method1619()) {
                                    var77 = var180.method1619();
                                }
                                if (class641.field8810 % 20 < 10) {
                                    var180.method2925(arg3 + -12 + class339.field4768[0], var50 + -var180.method1619());
                                    class546.method3152(-5590, arg3 + -12 - -class339.field4768[0], arg3 + -12 + class339.field4768[0] - -var180.method1618(), -var180.method1619() + var50, -var180.method1619() + (var50 - -var180.method1614()));
                                }
                            }
                        }
                        if (var77 > 0) {
                            var10000 = var50 - (var77 + 2);
                        }
                    }
                    for (int var81 = 0; var81 < class58.field1145; ++var81) {
                        int var82 = var38.field5645[var81];
                        int var83 = var38.field5685[var81];
                        class589 var84 = null;
                        int var85 = 0;
                        if (var83 >= 0) {
                            if (~class641.field8810 <= ~var82) {
                                continue;
                            }
                            var84 = class192.field2850.method1919(46, var38.field5685[var81]);
                            var85 = var84.field8034;
                        } else if (~var82 > -1) {
                            continue;
                        }
                        int var86 = var38.field5730[var81];
                        class589 var87 = null;
                        if (~var86 <= -1) {
                            var87 = class192.field2850.method1919(46, var86);
                        }
                        if (-var85 + var82 <= class641.field8810) {
                            int var88 = var38.field5729[var81];
                            if (~var88 <= -1) {
                                var38.field5649 = class641.field8810 + 300;
                                var38.field5721 = var88;
                                var38.field5729[var81] = -1;
                            }
                            if (var84 == null) {
                                var38.field5645[var81] = -1;
                            } else {
                                int var89 = var38.method58(200) / 2;
                                class6.method23(var89, arg4 >> 1, arg6, arg5, arg1 >> 1, var38, (byte) -107);
                                if (class339.field4768[0] > -1) {
                                    class339.field4768[0] += class712.field9646[var81];
                                    class339.field4768[1] += class62.field1235[var81];
                                    Object var90 = null;
                                    Object var91 = null;
                                    Object var92 = null;
                                    Object var93 = null;
                                    int var94 = 0;
                                    int var95 = 0;
                                    int var96 = 0;
                                    int var97 = 0;
                                    int var98 = 0;
                                    int var99 = 0;
                                    int var100 = 0;
                                    int var101 = 0;
                                    class496 var102 = null;
                                    class496 var103 = null;
                                    class496 var104 = null;
                                    class496 var105 = null;
                                    int var106 = 0;
                                    int var107 = 0;
                                    int var108 = 0;
                                    int var109 = 0;
                                    int var110 = 0;
                                    int var111 = 0;
                                    int var112 = 0;
                                    int var113 = 0;
                                    int var114 = 0;
                                    class496 var115 = var84.method3360(class272.field3822, (byte) -96);
                                    if (var115 != null) {
                                        var94 = var115.method1626();
                                        int var116 = var115.method1619();
                                        var115.method1625(class256.field3703);
                                        if (~var116 < ~var114) {
                                            var114 = var116;
                                        }
                                        var98 = class256.field3703[0];
                                    }
                                    class496 var117 = var84.method3364(class272.field3822, (byte) -75);
                                    if (var117 != null) {
                                        var95 = var117.method1626();
                                        int var118 = var117.method1619();
                                        var117.method1625(class256.field3703);
                                        if (~var114 > ~var118) {
                                            var114 = var118;
                                        }
                                        var99 = class256.field3703[0];
                                    }
                                    class496 var119 = var84.method3357(class272.field3822, true);
                                    if (var119 != null) {
                                        var96 = var119.method1626();
                                        int var120 = var119.method1619();
                                        if (~var120 < ~var114) {
                                            var114 = var120;
                                        }
                                        var119.method1625(class256.field3703);
                                        var100 = class256.field3703[0];
                                    }
                                    class496 var121 = var84.method3358(class272.field3822, 105);
                                    if (var121 != null) {
                                        var97 = var121.method1626();
                                        int var122 = var121.method1619();
                                        var121.method1625(class256.field3703);
                                        if (~var122 < ~var114) {
                                            var114 = var122;
                                        }
                                        var101 = class256.field3703[0];
                                    }
                                    if (var87 != null) {
                                        var102 = var87.method3360(class272.field3822, (byte) 110);
                                        if (var102 != null) {
                                            var106 = var102.method1626();
                                            int var123 = var102.method1619();
                                            if (var123 > var114) {
                                                var114 = var123;
                                            }
                                            var102.method1625(class256.field3703);
                                            var110 = class256.field3703[0];
                                        }
                                        var103 = var87.method3364(class272.field3822, (byte) -80);
                                        if (var103 != null) {
                                            var107 = var103.method1626();
                                            int var124 = var103.method1619();
                                            if (var124 > var114) {
                                                var114 = var124;
                                            }
                                            var103.method1625(class256.field3703);
                                            var111 = class256.field3703[0];
                                        }
                                        var104 = var87.method3357(class272.field3822, true);
                                        if (var104 != null) {
                                            var108 = var104.method1626();
                                            int var125 = var104.method1619();
                                            var104.method1625(class256.field3703);
                                            if (~var114 > ~var125) {
                                                var114 = var125;
                                            }
                                            var112 = class256.field3703[0];
                                        }
                                        var105 = var87.method3358(class272.field3822, arg2 ^ 53);
                                        if (var105 != null) {
                                            var109 = var105.method1626();
                                            int var126 = var105.method1619();
                                            if (var126 > var114) {
                                                var114 = var126;
                                            }
                                            var105.method1625(class256.field3703);
                                            var113 = class256.field3703[0];
                                        }
                                    }
                                    class60 var127 = class214.field3046;
                                    class60 var128 = class214.field3046;
                                    class597 var129 = class635.field8727;
                                    int var130 = var84.field8035;
                                    class597 var131 = class635.field8727;
                                    if (~var130 <= -1) {
                                        class60 var132 = class747.method4168(class272.field3822, (byte) -53, true, var130);
                                        class597 var133 = class481.method2823(-25411, class272.field3822, var130);
                                        if (var132 != null && var133 != null) {
                                            var127 = var132;
                                            var129 = var133;
                                        }
                                    }
                                    if (var87 != null) {
                                        int var134 = var87.field8035;
                                        if (~var134 <= -1) {
                                            class60 var135 = class747.method4168(class272.field3822, (byte) -53, true, var134);
                                            class597 var136 = class481.method2823(-25411, class272.field3822, var134);
                                            if (var135 != null && var136 != null) {
                                                var131 = var136;
                                                var128 = var135;
                                            }
                                        }
                                    }
                                    Object var137 = null;
                                    String var138 = null;
                                    boolean var139 = false;
                                    int var140 = 0;
                                    String var141 = var84.method3366(var38.field5655[var81], 0);
                                    int var142 = var129.method3389(true, var141);
                                    if (var87 != null) {
                                        var138 = var87.method3366(var38.field5710[var81], 0);
                                        var140 = var131.method3389(true, var138);
                                    }
                                    int var143 = 0;
                                    if (var95 > 0) {
                                        var143 = var142 / var95 + 1;
                                    }
                                    int var144 = 0;
                                    if (var87 != null && var107 > 0) {
                                        var144 = var140 / var107 - -1;
                                    }
                                    int var145 = 0;
                                    int var146 = var145;
                                    if (var94 > 0) {
                                        var145 += var94;
                                    }
                                    var145 += 2;
                                    int var147 = var145;
                                    if (var96 > 0) {
                                        var145 += var96;
                                    }
                                    int var148 = var145;
                                    int var149 = var145;
                                    int var150;
                                    if (~var95 >= -1) {
                                        var150 = var142 + var145;
                                    } else {
                                        int var151 = var95 * var143;
                                        var149 = (-var142 + var151) / 2 + var145;
                                        var150 = var145 + var151;
                                    }
                                    int var152 = var150;
                                    if (~var97 < -1) {
                                        var150 += var97;
                                    }
                                    int var153 = 0;
                                    int var154 = 0;
                                    int var155 = 0;
                                    int var156 = 0;
                                    int var157 = 0;
                                    if (var87 != null) {
                                        var150 += 2;
                                        var153 = var150;
                                        if (var106 > 0) {
                                            var150 += var106;
                                        }
                                        var150 += 2;
                                        var154 = var150;
                                        if (var108 > 0) {
                                            var150 += var108;
                                        }
                                        var157 = var150;
                                        var155 = var150;
                                        if (var107 > 0) {
                                            int var158 = var107 * var144;
                                            var157 = (var158 - var140) / 2 + var150;
                                            var150 += var158;
                                        } else {
                                            var150 += var140;
                                        }
                                        var156 = var150;
                                        if (~var109 < -1) {
                                            var150 += var109;
                                        }
                                    }
                                    int var159 = var38.field5645[var81] + -class641.field8810;
                                    int var160 = -(var84.field8024 * var159 / var84.field8034) + var84.field8024;
                                    int var161 = var84.field8022 * var159 / var84.field8034 + -var84.field8022;
                                    int var162 = class339.field4768[0] + arg3 + -(var150 >> 1) - -var160;
                                    int var163 = class339.field4768[1] - -var161 + arg0 + -12;
                                    int var164 = var163;
                                    int var165 = var114 + var163;
                                    int var166 = var163 - -var84.field8020 + 15;
                                    int var167 = -var129.field8155 + var166;
                                    int var168 = var166 - -var129.field8160;
                                    if (~var167 > ~var163) {
                                        var164 = var167;
                                    }
                                    if (var165 < var168) {
                                        var165 = var168;
                                    }
                                    int var169 = 0;
                                    if (var87 != null) {
                                        var169 = var163 - -var87.field8020 + 15;
                                        int var170 = -var131.field8155 + var169;
                                        if (var170 < var164) {
                                            var164 = var170;
                                        }
                                        int var171 = var131.field8160 + var169;
                                        if (~var171 < ~var165) {
                                            var165 = var171;
                                        }
                                    }
                                    int var172 = 255;
                                    if (var84.field8026 >= 0) {
                                        var172 = (var159 << 8) / (-var84.field8026 + var84.field8034);
                                    }
                                    if (var172 >= 0 && ~var172 > -256) {
                                        int var173 = var172 << 24;
                                        int var174 = 16777215 | var173;
                                        if (var115 != null) {
                                            var115.method1200(-var98 + var146 + var162, var163, 0, var174, 1);
                                        }
                                        if (var119 != null) {
                                            var119.method1200(-var100 + var147 + var162, var163, 0, var174, 1);
                                        }
                                        if (var117 != null) {
                                            for (int var175 = 0; ~var175 > ~var143; ++var175) {
                                                var117.method1200(-var99 - -(var95 * var175) + var162 + var148, var163, 0, var174, 1);
                                            }
                                        }
                                        if (var121 != null) {
                                            var121.method1200(var152 + var162 + -var101, var163, 0, var174, 1);
                                        }
                                        var127.method639(var141, var84.field8044 | var173, var166, var149 + var162, 0, -124);
                                        if (var87 != null) {
                                            if (var102 != null) {
                                                var102.method1200(var153 + var162 - var110, var163, 0, var174, 1);
                                            }
                                            if (var104 != null) {
                                                var104.method1200(var154 + var162 + -var112, var163, 0, var174, 1);
                                            }
                                            if (var103 != null) {
                                                for (int var176 = 0; var176 < var144; ++var176) {
                                                    var103.method1200(var107 * var176 + var162 + -var111 + var155, var163, 0, var174, 1);
                                                }
                                            }
                                            if (var105 != null) {
                                                var105.method1200(var162 - -var156 + -var113, var163, 0, var174, 1);
                                            }
                                            var128.method639(var138, var173 | var87.field8044, var169, var157 + var162, 0, -125);
                                        }
                                    } else {
                                        if (var115 != null) {
                                            var115.method2925(var162 - (-var146 + var98), var163);
                                        }
                                        if (var119 != null) {
                                            var119.method2925(var162 - (-var147 - -var100), var163);
                                        }
                                        if (var117 != null) {
                                            for (int var177 = 0; var177 < var143; ++var177) {
                                                var117.method2925(var148 + var162 - (var99 - var95 * var177), var163);
                                            }
                                        }
                                        if (var121 != null) {
                                            var121.method2925(-var101 + var162 + var152, var163);
                                        }
                                        var127.method639(var141, var84.field8044 | -16777216, var166, var149 + var162, 0, arg2 ^ -117);
                                        if (var87 != null) {
                                            if (var102 != null) {
                                                var102.method2925(-var110 + var162 + var153, var163);
                                            }
                                            if (var104 != null) {
                                                var104.method2925(-var112 + var162 + var154, var163);
                                            }
                                            if (var103 != null) {
                                                for (int var178 = 0; var144 > var178; ++var178) {
                                                    var103.method2925(var107 * var178 + -var111 + var162 + var155, var163);
                                                }
                                            }
                                            if (var105 != null) {
                                                var105.method2925(var156 + var162 - var113, var163);
                                            }
                                            var128.method639(var138, var87.field8044 | -16777216, var169, var157 + var162, 0, -119);
                                        }
                                    }
                                    class546.method3152(-5590, var162, var150 + var162, var164, var165 + 1);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; ~class91.field1627 < ~var10; ++var10) {
            int var33 = class284.field3968[var10];
            class390 var34;
            if (var33 >= 2048) {
                var34 = ((class751) class86.field1546.method1465((long) (var33 + -2048), -6008)).field10510;
            } else {
                var34 = class49.field1040[var33];
            }
            int var35 = class521.field7226[var10];
            class390 var36;
            if (~var35 <= -2049) {
                var36 = ((class751) class86.field1546.method1465((long) (var35 + -2048), -6008)).field10510;
            } else {
                var36 = class49.field1040[var35];
            }
            class16.method124(--var34.field5687, (byte) 119, arg6, arg1, arg0, arg5, arg4, arg3, var36, var34);
        }
        int var11 = class140.field2316.field8160 + class140.field2316.field8155 + arg2;
        for (int var12 = 0; var12 < class526.field7281; ++var12) {
            int var13 = class604.field8295[var12];
            int var14 = class604.field8286[var12];
            int var15 = class604.field8292[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var32 = 0; var12 > var32; ++var32) {
                    if (var14 - -2 > class604.field8286[var32] + -var11 && -var11 + var14 < class604.field8286[var32] + 2 && ~(-var15 + var13) > ~(class604.field8295[var32] - -class604.field8292[var32]) && class604.field8295[var32] + -class604.field8292[var32] < var13 + var15 && ~var14 < ~(class604.field8286[var32] + -var11)) {
                        var14 = class604.field8286[var32] + -var11;
                        var16 = true;
                    }
                }
            }
            class604.field8286[var12] = var14;
            String var17 = class604.field8291[var12];
            int var18 = class140.field2316.method3389(true, var17);
            int var19 = arg3 + var13;
            int var20 = -class140.field2316.field8155 + var14 + arg0;
            int var21 = var19 - -var18;
            int var22 = arg0 + var14 - -class140.field2316.field8160;
            if (class314.field4350 != 0) {
                var19 -= var18 >> 1;
                var21 -= var18 >> 1;
                class168.field2634.method638((byte) 118, arg3 + var13, -256, var17, -16777216, arg0 + var14);
            } else {
                int var23 = 16776960;
                if (~class604.field8290[var12] > -7) {
                    var23 = class375.field5313[class604.field8290[var12]];
                }
                if (~class604.field8290[var12] == -7) {
                    var23 = class448.field6342 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class604.field8290[var12] == 7) {
                    var23 = class448.field6342 % 20 < 10 ? 255 : 65535;
                }
                if (~class604.field8290[var12] == -9) {
                    var23 = class448.field6342 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class604.field8290[var12] == 9) {
                    int var24 = -class604.field8285[var12] + 150;
                    if (~var24 > -51) {
                        var23 = var24 * 1280 + 16711680;
                    } else if (~var24 > -101) {
                        var23 = -(var24 * 327680) + 16384000 + 16776960;
                    } else if (var24 < 150) {
                        var23 = (var24 + -100) * 5 + 65280;
                    }
                }
                if (class604.field8290[var12] == 10) {
                    int var25 = 150 - class604.field8285[var12];
                    if (~var25 <= -51) {
                        if (var25 >= 100) {
                            if (var25 < 150) {
                                var23 = var25 * 327680 + (-(var25 * 5) - -500) - 32767745;
                            }
                        } else {
                            var23 = -(var25 * 327680) + 33095935;
                        }
                    } else {
                        var23 = var25 * 5 + 16711680;
                    }
                }
                if (~class604.field8290[var12] == -12) {
                    int var26 = 150 - class604.field8285[var12];
                    if (var26 >= 50) {
                        if (~var26 > -101) {
                            var23 = (var26 + -50) * 327685 + 65280;
                        } else if (var26 < 150) {
                            var23 = -((var26 - 100) * 327680) + 16777215;
                        }
                    } else {
                        var23 = -(var26 * 327685) + 16777215;
                    }
                }
                int var27 = -16777216 | var23;
                if (~class604.field8279[var12] == -1) {
                    class168.field2634.method638((byte) 115, arg3 + var13, var27, var17, -16777216, arg0 + var14);
                    var19 -= var18 >> 1;
                    var21 -= var18 >> 1;
                }
                if (class604.field8279[var12] == 1) {
                    var21 -= var18 >> 1;
                    var19 -= var18 >> 1;
                    class168.field2634.method637(var27, arg0 + var14, var17, arg3 - -var13, -16777216, class448.field6342, false);
                    var22 += 5;
                    var20 -= 5;
                }
                if (~class604.field8279[var12] == -3) {
                    var22 += 5;
                    var21 -= (var18 >> 1) + -5;
                    class168.field2634.method643(var17, var27, class448.field6342, arg0 + var14, (byte) -112, -16777216, arg3 - -var13);
                    var20 -= 5;
                    var19 -= (var18 >> 1) - -5;
                }
                if (class604.field8279[var12] == 3) {
                    var21 -= var18 >> 1;
                    var19 -= var18 >> 1;
                    var22 += 7;
                    class168.field2634.method640(class448.field6342, arg0 + var14, var17, var27, -16777216, -class604.field8285[var12] + 150, arg3 + var13, -20509);
                    var20 -= 7;
                }
                if (~class604.field8279[var12] == -5) {
                    int var28 = (-class604.field8285[var12] + 150) * (class140.field2316.method3389(true, var17) + 100) / 150;
                    class272.field3822.method279(arg3 - (-var13 - -50), arg0, arg3 + var13 + 50, arg0 - -arg1);
                    var19 += 50 - var28;
                    var21 += -var28 + 50;
                    class168.field2634.method639(var17, var27, arg0 + var14, arg3 - (-var13 - 50) - var28, -16777216, arg2 + -125);
                    class272.field3822.method303(arg3, arg0, arg3 + arg4, arg0 + arg1);
                }
                if (class604.field8279[var12] == 5) {
                    int var29 = -class604.field8285[var12] + 150;
                    int var30 = 0;
                    if (var29 >= 25) {
                        if (~var29 < -126) {
                            var30 = var29 + -125;
                        }
                    } else {
                        var30 = var29 - 25;
                    }
                    int var31 = class140.field2316.field8160 + class140.field2316.field8155;
                    class272.field3822.method279(arg3, arg0 + var14 - (var31 - -1), arg3 + arg4, var14 + 5 + arg0);
                    var19 -= var18 >> 1;
                    var22 += var30;
                    class168.field2634.method638((byte) -105, arg3 + var13, var27, var17, -16777216, arg0 + var14 + var30);
                    var20 += var30;
                    var21 -= var18 >> 1;
                    class272.field3822.method303(arg3, arg0, arg3 + arg4, arg0 + arg1);
                }
            }
            class546.method3152(arg2 + -5592, var19, var21 + 1, var20, var22 + 1);
        }
    }

    @OriginalMember(owner = "client!qo", name = "C", descriptor = "(I)V", line = 5365)
    private final void method346(int arg0) {
        this.field646 = (float) (this.field636 - this.field635) + -this.field608;
        ++field461;
        this.field614 = this.field646 - (float) this.field604 * this.field679;
        if ((float) this.field648 > this.field614) {
            this.field614 = (float) this.field648;
        }
        OpenGL.glFogf(2915, this.field614);
        OpenGL.glFogf(2916, this.field646);
        class696.field9403[0] = (float) class263.method1762(arg0, this.field678) / 1.671168E7F;
        class696.field9403[1] = (float) class263.method1762(this.field678, 65280) / 65280.0F;
        class696.field9403[2] = (float) class263.method1762(this.field678, 255) / 255.0F;
        OpenGL.glFogfv(2918, class696.field9403, 0);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZB)V", line = 5384)
    public final void method347(boolean arg0, byte arg1) {
        if (!arg0 == this.field627) {
            this.field627 = arg0;
            this.method250((byte) -117);
        }
        if (arg1 < -56) {
            ++field386;
        }
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(II)V", line = 5406)
    public final void method348(int arg0, int arg1) throws class721 {
        try {
            this.field486.swapBuffers();
        } catch (Exception var3) {
        }
        ++field446;
    }

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "(II)V", line = 5425)
    public final void method349(int arg0, int arg1) {
        ++field428;
        if (this.field648 != arg0 || this.field636 != arg1) {
            this.field648 = arg0;
            this.field636 = arg1;
            this.method354(98);
            this.method346(16711680);
            if (~this.field687 == -4) {
                this.method203((byte) -63);
                return;
            }
            if (this.field687 != 2) {
                return;
            }
            this.method176((byte) 121);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIII)V", line = 5450)
    public final void method350(int arg0, int arg1, int arg2, int arg3) {
        this.field542.method1080(arg2, arg0, arg3, arg1, -1);
        ++field473;
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(ILtv;)V", line = 5460)
    public final void method351(int arg0, class560 arg1) {
        ++field519;
        if (this.field560 >= 0 && this.field563[this.field560] == arg1) {
            this.field563[this.field560--] = null;
            arg1.method3213((byte) -47);
            if (arg0 == 8387) {
                if (this.field560 < 0) {
                    this.field567 = null;
                } else {
                    this.field567 = this.field563[this.field560];
                    this.field567.method3217(-27141);
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V", line = 5484)
    public final void method352(int arg0) {
        ++field342;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(II)Lhe;", line = 5498)
    public final class372 method353(int arg0, int arg1) {
        ++field383;
        return null;
    }

    @OriginalMember(owner = "client!qo", name = "D", descriptor = "(I)V", line = 5509)
    private final void method354(int arg0) {
        ++field436;
        float[] var2 = this.field601;
        float var3 = (float) (-this.field675 * this.field648) / (float) this.field593;
        float var4 = (float) ((this.field510 - this.field675) * this.field648) / (float) this.field593;
        if (arg0 < 28) {
            this.field598 = null;
        }
        float var5 = (float) (this.field648 * this.field632) / (float) this.field616;
        float var6 = (float) ((-this.field463 + this.field632) * this.field648) / (float) this.field616;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field648 * 2.0F;
            var2[1] = 0.0F;
            var2[5] = var7 / (var5 - var6);
            var2[9] = (var5 + var6) / (-var6 + var5);
            var2[3] = 0.0F;
            var2[4] = 0.0F;
            var2[8] = (var3 + var4) / (var4 - var3);
            var2[7] = 0.0F;
            var2[14] = this.field664 = -((float) this.field636 * var7) / (float) (-this.field648 + this.field636);
            var2[2] = 0.0F;
            var2[11] = -1.0F;
            var2[15] = 0.0F;
            var2[10] = this.field676 = (float) (-(this.field636 - -this.field648)) / (float) (-this.field648 + this.field636);
            var2[12] = 0.0F;
            var2[0] = var7 / (-var3 + var4);
            var2[13] = 0.0F;
            var2[6] = 0.0F;
        } else {
            var2[13] = 0.0F;
            var2[15] = 1.0F;
            var2[3] = 0.0F;
            var2[11] = 0.0F;
            var2[12] = 0.0F;
            var2[4] = 0.0F;
            var2[6] = 0.0F;
            var2[8] = 0.0F;
            var2[7] = 0.0F;
            var2[1] = 0.0F;
            var2[10] = 1.0F;
            var2[14] = 0.0F;
            var2[5] = 1.0F;
            var2[0] = 1.0F;
            var2[9] = 0.0F;
            var2[2] = 0.0F;
        }
        this.method278(-24051);
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "()V", line = 5576)
    public final void method355() {
        ++field514;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lrh;Z)Lmi;", line = 5584)
    public final class496 method356(class267 arg0, boolean arg1) {
        ++field479;
        int[] var3 = new int[arg0.field3784 * arg0.field3778];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field3777 != null) {
            for (int var6 = 0; arg0.field3778 > var6; ++var6) {
                for (int var7 = 0; ~arg0.field3784 < ~var7; ++var7) {
                    var3[var5++] = class418.method2577(arg0.field3777[var4] << 24, arg0.field3779[class263.method1762(arg0.field3781[var4], 255)]);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; arg0.field3778 > var8; ++var8) {
                for (int var10 = 0; ~var10 > ~arg0.field3784; ++var10) {
                    int var11 = arg0.field3779[255 & arg0.field3781[var4++]];
                    var3[var5++] = var11 == 0 ? 0 : class418.method2577(-16777216, var11);
                }
            }
        }
        class496 var9 = this.method621(arg0.field3784, var3, (byte) 94, 0, arg0.field3784, arg0.field3778);
        var9.method1615(arg0.field3785, arg0.field3782, arg0.field3780, arg0.field3783);
        return var9;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(ZI)V", line = 5645)
    public final void method357(boolean arg0, int arg1) {
        if (arg1 != 2) {
            this.field636 = -59;
        }
        ++field339;
        if (!arg0 != !this.field623) {
            this.field623 = arg0;
            this.method180(-87);
            this.field587 &= -32;
        }
    }

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "(II)V", line = 5663)
    public final void method358(int arg0, int arg1) {
        class696.field9403[2] = (float) class263.method1762(arg0, 255) / 255.0F;
        if (arg1 <= 116) {
            this.field593 = 76;
        }
        class696.field9403[3] = (float) (arg0 >>> 24) / 255.0F;
        class696.field9403[1] = (float) class263.method1762(arg0, 65280) / 65280.0F;
        ++field481;
        class696.field9403[0] = (float) class263.method1762(16711680, arg0) / 1.671168E7F;
        OpenGL.glTexEnvfv(8960, 8705, class696.field9403, 0);
    }

    @OriginalMember(owner = "client!qo", name = "na", descriptor = "(IIII)[I", line = 5685)
    public final int[] method359(int arg0, int arg1, int arg2, int arg3) {
        ++field444;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; arg3 > var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + this.field463 + -var6, arg2, 1, 32993, this.field634, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "(Z)V", line = 5707)
    private final void method360(boolean arg0) {
        OpenGL.glViewport(this.field592, this.field689, this.field510, this.field463);
        ++field540;
        if (!arg0) {
            this.field602 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "w", descriptor = "()Z", line = 5718)
    public final boolean method361() {
        ++field522;
        return this.field665 && (!this.method328() || this.field644);
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(III)V", line = 5736)
    public final synchronized void method362(int arg0, int arg1, int arg2) {
        if (arg2 < -57) {
            ++field499;
            class113 var4 = new class113(arg1);
            var4.field5204 = (long) arg0;
            this.field576.method1273(var4, -20180);
        }
    }

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "(B)V", line = 5762)
    private final void method363(byte arg0) {
        ++field512;
        if (arg0 == 11) {
            if (~this.field690 >= ~this.field677 && this.field595 <= this.field609) {
                OpenGL.glScissor(this.field690 + this.field592, this.field689 + this.field463 - this.field609, -this.field690 + this.field677, -this.field595 + this.field609);
            } else {
                OpenGL.glScissor(0, 0, 0, 0);
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "z", descriptor = "()Z", line = 5783)
    public final boolean method364() {
        ++field425;
        return false;
    }
}
