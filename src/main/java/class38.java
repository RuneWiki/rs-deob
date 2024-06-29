import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import jagex3.graphics2.hw.NativeInterface;
import java.awt.Canvas;
import java.awt.Dimension;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public abstract class class38 extends class544 {

    @OriginalMember(owner = "client!pj", name = "fc", descriptor = "Ltg;")
    private class605 field459 = new class605();

    @OriginalMember(owner = "client!pj", name = "Td", descriptor = "Z")
    public boolean field551 = true;

    @OriginalMember(owner = "client!pj", name = "Pd", descriptor = "Lga;")
    public class341 field547 = new class341();

    @OriginalMember(owner = "client!pj", name = "ke", descriptor = "Lga;")
    public class341 field568 = new class341();

    @OriginalMember(owner = "client!pj", name = "le", descriptor = "Lga;")
    public class341 field569 = new class341();

    @OriginalMember(owner = "client!pj", name = "me", descriptor = "Lga;")
    public class341 field570 = new class341();

    @OriginalMember(owner = "client!pj", name = "ne", descriptor = "Lga;")
    private class341 field571 = new class341();

    @OriginalMember(owner = "client!pj", name = "oe", descriptor = "Lga;")
    private class341 field572 = new class341();

    @OriginalMember(owner = "client!pj", name = "re", descriptor = "I")
    public int field575 = 0;

    @OriginalMember(owner = "client!pj", name = "Ae", descriptor = "Z")
    public boolean field584 = false;

    @OriginalMember(owner = "client!pj", name = "Je", descriptor = "F")
    public float field593 = 1.0F;

    @OriginalMember(owner = "client!pj", name = "Ze", descriptor = "I")
    private int field609 = 0;

    @OriginalMember(owner = "client!pj", name = "Ue", descriptor = "Z")
    public boolean field604 = false;

    @OriginalMember(owner = "client!pj", name = "Ie", descriptor = "Z")
    private boolean field592 = false;

    @OriginalMember(owner = "client!pj", name = "Ve", descriptor = "Lnf;")
    public class19 field605 = class340.field4996;

    @OriginalMember(owner = "client!pj", name = "cf", descriptor = "F")
    public float field612 = 3584.0F;

    @OriginalMember(owner = "client!pj", name = "He", descriptor = "I")
    public int field591 = 0;

    @OriginalMember(owner = "client!pj", name = "ye", descriptor = "I")
    private int field582 = 1;

    @OriginalMember(owner = "client!pj", name = "Pe", descriptor = "I")
    private int field599 = -1;

    @OriginalMember(owner = "client!pj", name = "Oe", descriptor = "Z")
    public boolean field598 = true;

    @OriginalMember(owner = "client!pj", name = "we", descriptor = "[F")
    private float[] field580 = new float[16];

    @OriginalMember(owner = "client!pj", name = "Me", descriptor = "F")
    private float field596 = 1.0F;

    @OriginalMember(owner = "client!pj", name = "af", descriptor = "F")
    public float field610 = 3584.0F;

    @OriginalMember(owner = "client!pj", name = "xf", descriptor = "F")
    public float field632 = -1.0F;

    @OriginalMember(owner = "client!pj", name = "ff", descriptor = "I")
    public int field615 = 128;

    @OriginalMember(owner = "client!pj", name = "sf", descriptor = "I")
    private int field627 = 0;

    @OriginalMember(owner = "client!pj", name = "hf", descriptor = "I")
    public int field617 = 0;

    @OriginalMember(owner = "client!pj", name = "Ke", descriptor = "[F")
    private float[] field594 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!pj", name = "pf", descriptor = "I")
    public int field624 = 0;

    @OriginalMember(owner = "client!pj", name = "uf", descriptor = "[F")
    private float[] field629 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!pj", name = "If", descriptor = "Z")
    private boolean field643 = false;

    @OriginalMember(owner = "client!pj", name = "Gf", descriptor = "Z")
    private boolean field641 = false;

    @OriginalMember(owner = "client!pj", name = "Jf", descriptor = "I")
    private int field644 = 0;

    @OriginalMember(owner = "client!pj", name = "lf", descriptor = "F")
    public float field620 = -1.0F;

    @OriginalMember(owner = "client!pj", name = "We", descriptor = "[Loca;")
    private class279[] field606 = new class279[10];

    @OriginalMember(owner = "client!pj", name = "zf", descriptor = "I")
    public int field634 = 50;

    @OriginalMember(owner = "client!pj", name = "Se", descriptor = "[F")
    private float[] field602 = new float[16];

    @OriginalMember(owner = "client!pj", name = "Qf", descriptor = "F")
    public float field651 = 1.0F;

    @OriginalMember(owner = "client!pj", name = "Af", descriptor = "[F")
    private float[] field635 = new float[16];

    @OriginalMember(owner = "client!pj", name = "jf", descriptor = "I")
    public int field618 = -1;

    @OriginalMember(owner = "client!pj", name = "Wf", descriptor = "Z")
    public boolean field657 = true;

    @OriginalMember(owner = "client!pj", name = "rf", descriptor = "F")
    public float field626 = 1.0F;

    @OriginalMember(owner = "client!pj", name = "Ef", descriptor = "Z")
    public boolean field639 = false;

    @OriginalMember(owner = "client!pj", name = "Cf", descriptor = "I")
    private int field637 = 0;

    @OriginalMember(owner = "client!pj", name = "Lf", descriptor = "I")
    public int field646 = 0;

    @OriginalMember(owner = "client!pj", name = "Bf", descriptor = "I")
    public int field636 = -1;

    @OriginalMember(owner = "client!pj", name = "Nf", descriptor = "I")
    public int field648 = 512;

    @OriginalMember(owner = "client!pj", name = "cg", descriptor = "Z")
    public boolean field663 = false;

    @OriginalMember(owner = "client!pj", name = "Xf", descriptor = "I")
    public int field658 = 3;

    @OriginalMember(owner = "client!pj", name = "dg", descriptor = "I")
    private int field664 = -1;

    @OriginalMember(owner = "client!pj", name = "Uf", descriptor = "I")
    public int field655 = 0;

    @OriginalMember(owner = "client!pj", name = "ag", descriptor = "F")
    public float field661 = 1.0F;

    @OriginalMember(owner = "client!pj", name = "Pf", descriptor = "Z")
    public boolean field650 = true;

    @OriginalMember(owner = "client!pj", name = "xe", descriptor = "I")
    public int field581 = 3584;

    @OriginalMember(owner = "client!pj", name = "Mf", descriptor = "I")
    public int field647 = 0;

    @OriginalMember(owner = "client!pj", name = "bg", descriptor = "I")
    private int field662 = 16777215;

    @OriginalMember(owner = "client!pj", name = "Rf", descriptor = "Z")
    public boolean field652 = true;

    @OriginalMember(owner = "client!pj", name = "Xe", descriptor = "I")
    public int field607 = 0;

    @OriginalMember(owner = "client!pj", name = "Kf", descriptor = "Lbea;")
    public class539 field645 = class560.field7946;

    @OriginalMember(owner = "client!pj", name = "hg", descriptor = "Z")
    private boolean field668 = false;

    @OriginalMember(owner = "client!pj", name = "pe", descriptor = "[F")
    public float[] field573 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!pj", name = "ig", descriptor = "Z")
    private boolean field669 = false;

    @OriginalMember(owner = "client!pj", name = "Yf", descriptor = "I")
    public int field659 = 512;

    @OriginalMember(owner = "client!pj", name = "ef", descriptor = "I")
    public int field614 = 0;

    @OriginalMember(owner = "client!pj", name = "Tf", descriptor = "I")
    private int field654 = -1;

    @OriginalMember(owner = "client!pj", name = "Hf", descriptor = "[F")
    public float[] field642 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!pj", name = "kg", descriptor = "Z")
    public boolean field671 = true;

    @OriginalMember(owner = "client!pj", name = "vf", descriptor = "I")
    public int field630 = 8;

    @OriginalMember(owner = "client!pj", name = "gg", descriptor = "[F")
    private float[] field667 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!pj", name = "Ce", descriptor = "[F")
    public float[] field586 = this.field667;

    @OriginalMember(owner = "client!pj", name = "bf", descriptor = "I")
    public int field611 = 0;

    @OriginalMember(owner = "client!pj", name = "yf", descriptor = "Z")
    private boolean field633 = false;

    @OriginalMember(owner = "client!pj", name = "of", descriptor = "Ljaclib/memory/Stream;")
    private Stream field623 = new Stream();

    @OriginalMember(owner = "client!pj", name = "ng", descriptor = "Lga;")
    private class341 field674 = new class341();

    @OriginalMember(owner = "client!pj", name = "od", descriptor = "Ljava/lang/Object;")
    public Object field520;

    @OriginalMember(owner = "client!pj", name = "Ob", descriptor = "Ljava/lang/Object;")
    private Object field442;

    @OriginalMember(owner = "client!pj", name = "te", descriptor = "I")
    public int field577;

    @OriginalMember(owner = "client!pj", name = "qb", descriptor = "Lla;")
    public class422 field418;

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "Ljava/awt/Canvas;")
    public Canvas field391;

    @OriginalMember(owner = "client!pj", name = "U", descriptor = "Ljava/awt/Canvas;")
    private Canvas field396;

    @OriginalMember(owner = "client!pj", name = "Qc", descriptor = "I")
    private int field496;

    @OriginalMember(owner = "client!pj", name = "ic", descriptor = "I")
    public int field462;

    @OriginalMember(owner = "client!pj", name = "Mb", descriptor = "I")
    private int field440;

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "I")
    public int field378;

    @OriginalMember(owner = "client!pj", name = "tf", descriptor = "I")
    public int field628;

    @OriginalMember(owner = "client!pj", name = "sc", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field472;

    @OriginalMember(owner = "client!pj", name = "Ge", descriptor = "Ltia;")
    private class710 field590;

    @OriginalMember(owner = "client!pj", name = "be", descriptor = "Z")
    public static boolean field559 = false;

    @OriginalMember(owner = "client!pj", name = "De", descriptor = "F")
    public float field587;

    @OriginalMember(owner = "client!pj", name = "Fe", descriptor = "F")
    public float field589;

    @OriginalMember(owner = "client!pj", name = "Te", descriptor = "F")
    public float field603;

    @OriginalMember(owner = "client!pj", name = "mf", descriptor = "F")
    public float field621;

    @OriginalMember(owner = "client!pj", name = "Ff", descriptor = "F")
    private float field640;

    @OriginalMember(owner = "client!pj", name = "Sf", descriptor = "F")
    public float field653;

    @OriginalMember(owner = "client!pj", name = "Vf", descriptor = "F")
    private float field656;

    @OriginalMember(owner = "client!pj", name = "fg", descriptor = "F")
    public float field666;

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!pj", name = "F", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!pj", name = "G", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!pj", name = "R", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!pj", name = "S", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!pj", name = "T", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!pj", name = "V", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!pj", name = "W", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!pj", name = "X", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!pj", name = "Y", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!pj", name = "Z", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!pj", name = "ab", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!pj", name = "bb", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!pj", name = "cb", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!pj", name = "db", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!pj", name = "eb", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!pj", name = "fb", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!pj", name = "gb", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!pj", name = "hb", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!pj", name = "ib", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!pj", name = "jb", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!pj", name = "kb", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!pj", name = "lb", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!pj", name = "mb", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!pj", name = "nb", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!pj", name = "ob", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!pj", name = "pb", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!pj", name = "rb", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!pj", name = "sb", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!pj", name = "tb", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!pj", name = "ub", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!pj", name = "vb", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!pj", name = "wb", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!pj", name = "xb", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!pj", name = "yb", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!pj", name = "zb", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!pj", name = "Ab", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!pj", name = "Bb", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!pj", name = "Cb", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!pj", name = "Db", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!pj", name = "Eb", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!pj", name = "Fb", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!pj", name = "Gb", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!pj", name = "Ib", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!pj", name = "Jb", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!pj", name = "Kb", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!pj", name = "Lb", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!pj", name = "Nb", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!pj", name = "Pb", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!pj", name = "Qb", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!pj", name = "Rb", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!pj", name = "Sb", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!pj", name = "Tb", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!pj", name = "Ub", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!pj", name = "Vb", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!pj", name = "Wb", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!pj", name = "Xb", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!pj", name = "Yb", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!pj", name = "Zb", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!pj", name = "ac", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!pj", name = "bc", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!pj", name = "cc", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!pj", name = "dc", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!pj", name = "ec", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!pj", name = "gc", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!pj", name = "jc", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!pj", name = "kc", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!pj", name = "lc", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!pj", name = "mc", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!pj", name = "nc", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!pj", name = "oc", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!pj", name = "pc", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!pj", name = "qc", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!pj", name = "rc", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!pj", name = "tc", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!pj", name = "uc", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!pj", name = "vc", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!pj", name = "wc", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!pj", name = "xc", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!pj", name = "yc", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!pj", name = "zc", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!pj", name = "Ac", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!pj", name = "Bc", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!pj", name = "Cc", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!pj", name = "Dc", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!pj", name = "Ec", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!pj", name = "Fc", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!pj", name = "Gc", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!pj", name = "Hc", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!pj", name = "Ic", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!pj", name = "Jc", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!pj", name = "Kc", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!pj", name = "Lc", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!pj", name = "Mc", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!pj", name = "Nc", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!pj", name = "Oc", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!pj", name = "Pc", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!pj", name = "Rc", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!pj", name = "Sc", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!pj", name = "Tc", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!pj", name = "Uc", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!pj", name = "Vc", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!pj", name = "Wc", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!pj", name = "Xc", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!pj", name = "Yc", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!pj", name = "Zc", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!pj", name = "ad", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!pj", name = "bd", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!pj", name = "cd", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!pj", name = "dd", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!pj", name = "ed", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!pj", name = "fd", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!pj", name = "gd", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!pj", name = "hd", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!pj", name = "id", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!pj", name = "jd", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!pj", name = "kd", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!pj", name = "ld", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!pj", name = "md", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!pj", name = "nd", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!pj", name = "pd", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!pj", name = "qd", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!pj", name = "rd", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!pj", name = "td", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!pj", name = "ud", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!pj", name = "vd", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!pj", name = "wd", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!pj", name = "xd", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!pj", name = "zd", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!pj", name = "Ad", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!pj", name = "Bd", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!pj", name = "Cd", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!pj", name = "Dd", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!pj", name = "Ed", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!pj", name = "Fd", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!pj", name = "Gd", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!pj", name = "Hd", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!pj", name = "Id", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!pj", name = "Jd", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!pj", name = "Kd", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!pj", name = "Ld", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!pj", name = "Md", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!pj", name = "Nd", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!pj", name = "Od", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!pj", name = "Qd", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!pj", name = "Rd", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!pj", name = "Sd", descriptor = "I")
    public int field550;

    @OriginalMember(owner = "client!pj", name = "Ud", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!pj", name = "Vd", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!pj", name = "Wd", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!pj", name = "Xd", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!pj", name = "Yd", descriptor = "I")
    public int field556;

    @OriginalMember(owner = "client!pj", name = "Zd", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!pj", name = "ae", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!pj", name = "ce", descriptor = "I")
    public int field560;

    @OriginalMember(owner = "client!pj", name = "de", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!pj", name = "ee", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!pj", name = "fe", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!pj", name = "ge", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!pj", name = "he", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!pj", name = "ie", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!pj", name = "je", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!pj", name = "se", descriptor = "I")
    public int field576;

    @OriginalMember(owner = "client!pj", name = "ue", descriptor = "I")
    public int field578;

    @OriginalMember(owner = "client!pj", name = "ve", descriptor = "I")
    public int field579;

    @OriginalMember(owner = "client!pj", name = "Ne", descriptor = "I")
    public int field597;

    @OriginalMember(owner = "client!pj", name = "Qe", descriptor = "I")
    public int field600;

    @OriginalMember(owner = "client!pj", name = "Ye", descriptor = "I")
    public int field608;

    @OriginalMember(owner = "client!pj", name = "Of", descriptor = "I")
    public int field649;

    @OriginalMember(owner = "client!pj", name = "Zf", descriptor = "I")
    private int field660;

    @OriginalMember(owner = "client!pj", name = "jg", descriptor = "I")
    public int field670;

    @OriginalMember(owner = "client!pj", name = "lg", descriptor = "I")
    private int field672;

    @OriginalMember(owner = "client!pj", name = "Kg", descriptor = "I")
    private int field697;

    @OriginalMember(owner = "client!pj", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!pj", name = "og", descriptor = "Llu;")
    public class191 field675;

    @OriginalMember(owner = "client!pj", name = "sg", descriptor = "Llu;")
    public class191 field679;

    @OriginalMember(owner = "client!pj", name = "wg", descriptor = "Llu;")
    public class191 field683;

    @OriginalMember(owner = "client!pj", name = "xg", descriptor = "Llu;")
    public class191 field684;

    @OriginalMember(owner = "client!pj", name = "yg", descriptor = "Llu;")
    public class191 field685;

    @OriginalMember(owner = "client!pj", name = "zg", descriptor = "Llu;")
    public class191 field686;

    @OriginalMember(owner = "client!pj", name = "Bg", descriptor = "Llu;")
    public class191 field688;

    @OriginalMember(owner = "client!pj", name = "Cg", descriptor = "Llu;")
    public class191 field689;

    @OriginalMember(owner = "client!pj", name = "Eg", descriptor = "Llu;")
    public class191 field691;

    @OriginalMember(owner = "client!pj", name = "Ig", descriptor = "Llu;")
    public class191 field695;

    @OriginalMember(owner = "client!pj", name = "Re", descriptor = "Loca;")
    private class279 field601;

    @OriginalMember(owner = "client!pj", name = "pg", descriptor = "Lfk;")
    public class313 field676;

    @OriginalMember(owner = "client!pj", name = "qg", descriptor = "Lfk;")
    public class313 field677;

    @OriginalMember(owner = "client!pj", name = "tg", descriptor = "Lfk;")
    private class313 field680;

    @OriginalMember(owner = "client!pj", name = "vg", descriptor = "Lfk;")
    public class313 field682;

    @OriginalMember(owner = "client!pj", name = "Ag", descriptor = "Lfk;")
    private class313 field687;

    @OriginalMember(owner = "client!pj", name = "Dg", descriptor = "Lfk;")
    private class313 field690;

    @OriginalMember(owner = "client!pj", name = "Fg", descriptor = "Lfk;")
    public class313 field692;

    @OriginalMember(owner = "client!pj", name = "wf", descriptor = "Ltu;")
    private class476 field631;

    @OriginalMember(owner = "client!pj", name = "nf", descriptor = "Liu;")
    public class506 field622;

    @OriginalMember(owner = "client!pj", name = "rg", descriptor = "Lfb;")
    private class669 field678;

    @OriginalMember(owner = "client!pj", name = "ug", descriptor = "Lfb;")
    private class669 field681;

    @OriginalMember(owner = "client!pj", name = "Gg", descriptor = "Lfb;")
    private class669 field693;

    @OriginalMember(owner = "client!pj", name = "Hb", descriptor = "Lno;")
    public class67 field435;

    @OriginalMember(owner = "client!pj", name = "Hg", descriptor = "Loq;")
    private class743 field694;

    @OriginalMember(owner = "client!pj", name = "Be", descriptor = "Lgq;")
    private class92 field585;

    @OriginalMember(owner = "client!pj", name = "yd", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field530;

    @OriginalMember(owner = "client!pj", name = "hc", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field461;

    @OriginalMember(owner = "client!pj", name = "sd", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field524;

    @OriginalMember(owner = "client!pj", name = "qe", descriptor = "Z")
    public boolean field574;

    @OriginalMember(owner = "client!pj", name = "ze", descriptor = "Z")
    public boolean field583;

    @OriginalMember(owner = "client!pj", name = "Le", descriptor = "Z")
    public boolean field595;

    @OriginalMember(owner = "client!pj", name = "kf", descriptor = "Z")
    public boolean field619;

    @OriginalMember(owner = "client!pj", name = "eg", descriptor = "Z")
    public boolean field665;

    @OriginalMember(owner = "client!pj", name = "Jg", descriptor = "Z")
    public boolean field696;

    @OriginalMember(owner = "client!pj", name = "gf", descriptor = "[Lga;")
    public class341[] field616;

    @OriginalMember(owner = "client!pj", name = "df", descriptor = "[Lwe;")
    public class357[] field613;

    @OriginalMember(owner = "client!pj", name = "qf", descriptor = "[Lht;")
    public class393[] field625;

    @OriginalMember(owner = "client!pj", name = "mg", descriptor = "[Lht;")
    public class393[] field673;

    @OriginalMember(owner = "client!pj", name = "Df", descriptor = "[Liu;")
    private class506[] field638;

    @OriginalMember(owner = "client!pj", name = "Ee", descriptor = "[Lvt;")
    public class759[] field588;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)V")
    public abstract void method214(int arg0);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILiu;)V")
    public final void method215(int arg0, class506 arg1) {
        if (arg0 != 8) {
            this.field654 = 37;
        }
        ++field421;
        if (this.field638[this.field617] != arg1) {
            this.field638[this.field617] = arg1;
            if (arg1 == null) {
                this.method304(26467);
            } else {
                arg1.method195(-78);
            }
            this.field672 &= -2;
        }
    }

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "(I)V")
    public final void method216(int arg0) {
        ++field438;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            if (this.field590 != null) {
                this.field590.method3931(32);
            }
            this.field615 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pj", name = "Y", descriptor = "()[I")
    public final int[] method217() {
        ++field401;
        return new int[] { this.field575, this.field647, this.field648, this.field659 };
    }

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "()Z")
    public final boolean method218() {
        ++field457;
        return this.field619;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I[Lbl;)Lfk;")
    public abstract class313 method219(int arg0, class468[] arg1);

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "()Z")
    public final boolean method220() {
        ++field448;
        return true;
    }

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "(II)Loq;")
    public final class743 method221(int arg0, int arg1) {
        if (~(arg0 * 2) < ~this.field694.method695((byte) 45)) {
            this.field694.method924((byte) -117, arg0);
        }
        int var3 = -123 % ((-25 - arg1) / 34);
        ++field425;
        return this.field694;
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(Z)V")
    private final void method222(boolean arg0) {
        if (!this.field643) {
            float[] var2 = this.field635;
            float var3 = (float) this.field634;
            float var4 = (float) this.field581;
            float var5 = (float) (-this.field647) * this.field596 / (float) this.field659;
            float var6 = (float) (-this.field575) * this.field596 / (float) this.field648;
            float var7 = (float) (-this.field575 + this.field378) * this.field596 / (float) this.field648;
            float var8 = (float) (this.field462 - this.field647) * this.field596 / (float) this.field659;
            if (var6 != var7 && var5 != var8) {
                var2[1] = 0.0F;
                var2[2] = 0.0F;
                var2[6] = 0.0F;
                var2[0] = 2.0F / (-var6 + var7);
                var2[7] = 0.0F;
                var2[5] = 2.0F / (var8 - var5);
                var2[8] = 0.0F;
                var2[13] = (var5 + var8) / (-var5 + var8);
                var2[15] = 1.0F;
                var2[3] = 0.0F;
                var2[14] = var3 / (var3 - var4);
                var2[12] = (var6 + var7) / (-var7 + var6);
                var2[4] = 0.0F;
                var2[11] = 0.0F;
                var2[10] = 1.0F / (var3 - var4);
                var2[9] = 0.0F;
            } else {
                var2[7] = 0.0F;
                var2[1] = 0.0F;
                var2[6] = 0.0F;
                var2[0] = 1.0F;
                var2[13] = 0.0F;
                var2[9] = 0.0F;
                var2[14] = 0.0F;
                var2[4] = 0.0F;
                var2[11] = 0.0F;
                var2[5] = 1.0F;
                var2[15] = 1.0F;
                var2[10] = 1.0F;
                var2[2] = 0.0F;
                var2[12] = 0.0F;
                var2[8] = 0.0F;
                var2[3] = 0.0F;
            }
            this.method299(93);
            this.field643 = true;
        }
        if (!arg0) {
            this.field593 = -0.8782751F;
        }
        ++field449;
    }

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "(II)V")
    public final void method223(int arg0, int arg1) {
        ++field554;
        if (this.field634 != arg0 || this.field581 != arg1) {
            this.field581 = arg1;
            this.field634 = arg0;
            this.method367(0);
            this.method274(5);
            this.method234(12);
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(IIIIII)V")
    public final void method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field428;
        float var7 = this.method325(5484);
        this.method323(3);
        this.method228(2, arg4);
        this.method321(class327.field4819, 0, (byte) -95);
        this.method227(0, class327.field4819, 70);
        this.method314(arg5, (byte) 21);
        this.field547.method2179((float) (arg3 + -1), 1.0F, true, (float) (arg2 - 1));
        this.field547.method2190((byte) 51, (float) arg1 + -var7, 0.0F, (float) arg0 - var7);
        this.method309((byte) 122);
        this.method396(-122, false);
        this.method251(class468.field6809, 0, 4);
        this.method396(-51, true);
        this.method227(0, class388.field5817, 70);
        this.method321(class388.field5817, 0, (byte) -95);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(FFFZFFF)Z")
    private final boolean method225(float arg0, float arg1, float arg2, boolean arg3, float arg4, float arg5, float arg6) {
        ++field528;
        Buffer var8 = this.field693.method692(arg3, -31414);
        if (var8 == null) {
            return false;
        } else {
            Stream var9 = this.method368((byte) -121, var8);
            if (!Stream.method2572()) {
                var9.method2579(arg1);
                var9.method2579(arg2);
                var9.method2579(arg4);
                var9.method2579(arg0);
                var9.method2579(arg5);
                var9.method2579(arg6);
            } else {
                var9.method2576(arg1);
                var9.method2576(arg2);
                var9.method2576(arg4);
                var9.method2576(arg0);
                var9.method2576(arg5);
                var9.method2576(arg6);
            }
            var9.method2573();
            return this.field693.method696(-11404);
        }
    }

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "(I)V")
    private final void method226(int arg0) {
        if (arg0 != 27529) {
            this.field648 = -26;
        }
        ++field383;
        if (!this.field669) {
            float[] var2 = this.field580;
            this.field669 = true;
            if (this.field378 != 0 && ~this.field462 != -1) {
                var2[2] = 0.0F;
                var2[10] = 0.5F;
                var2[13] = 1.0F;
                var2[7] = 0.0F;
                var2[15] = 1.0F;
                var2[1] = 0.0F;
                var2[5] = -2.0F / (float) this.field462;
                var2[14] = 0.5F;
                var2[11] = 0.0F;
                var2[9] = 0.0F;
                var2[8] = 0.0F;
                var2[6] = 0.0F;
                var2[12] = -1.0F;
                var2[4] = 0.0F;
                var2[3] = 0.0F;
                var2[0] = 2.0F / (float) this.field378;
            } else {
                var2[4] = 0.0F;
                var2[5] = 1.0F;
                var2[0] = 1.0F;
                var2[13] = 0.0F;
                var2[15] = 1.0F;
                var2[2] = 0.0F;
                var2[7] = 0.0F;
                var2[9] = 0.0F;
                var2[11] = 0.0F;
                var2[10] = 1.0F;
                var2[3] = 0.0F;
                var2[6] = 0.0F;
                var2[8] = 0.0F;
                var2[14] = 0.0F;
                var2[12] = 0.0F;
                var2[1] = 0.0F;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILmq;I)V")
    public final void method227(int arg0, class592 arg1, int arg2) {
        this.method369(arg1, false, arg0, arg2 ^ -35);
        ++field389;
        if (arg2 != 70) {
            this.field697 = -8;
        }
    }

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "(II)V")
    public final void method228(int arg0, int arg1) {
        if (~this.field600 != ~arg1) {
            this.field600 = arg1;
            this.method318(false);
        }
        ++field463;
        if (arg0 != 2) {
            this.method282(23, -35, (int[]) null, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "(I)V")
    public final void method229(int arg0) {
        ++field429;
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(Z)V")
    private final void method230(boolean arg0) {
        if (!arg0) {
            this.method325(82);
        }
        this.method307(-1);
        ++field512;
        if (this.field601 != null) {
            this.field601.method436(0);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([IIIIIZ)Lit;")
    public final class34 method231(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field393;
        return new class721(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZB)V")
    public final void method232(boolean arg0, byte arg1) {
        if (!arg0 == this.field665) {
            this.field665 = arg0;
            this.method319(true);
            this.field672 &= -32;
        }
        ++field531;
        int var3 = 27 / (arg1 / 39);
    }

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "(Z)V")
    public final void method233(boolean arg0) {
        this.method251(class255.field4027, 0, 2);
        if (arg0) {
            this.field696 = true;
        }
        ++field527;
    }

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "(I)V")
    private final void method234(int arg0) {
        if (this.field601 != null) {
            this.field601.method439(-6910);
        }
        ++field432;
        if (arg0 == 12) {
            this.method311(-126);
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)[F")
    public final float[] method235(byte arg0) {
        ++field478;
        int var2 = -5 / ((35 - arg0) / 47);
        return this.field667;
    }

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "()Ltc;")
    public final class73 method236() {
        ++field388;
        return this.field568;
    }

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "(I)V")
    public final void method237(int arg0) {
        if (~this.field672 != -5) {
            this.method296(-98);
            this.method232(false, (byte) 79);
            this.method384(-92, false);
            this.method258(false, 1);
            this.method394(arg0 ^ 23375, false);
            this.method421(false, 15, -2, false);
            this.method314(1, (byte) 21);
            this.method405(0, (byte) 121);
            this.field672 = 4;
        }
        if (arg0 != 26736) {
            this.method257(-107);
        }
        ++field533;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lvm;)V")
    public final void method238(class72 arg0) {
        ++field506;
        this.field585 = (class92) arg0;
    }

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "()Z")
    public final boolean method239() {
        ++field545;
        return true;
    }

    @OriginalMember(owner = "client!pj", name = "KA", descriptor = "(IIII)V")
    public final void method240(int arg0, int arg1, int arg2, int arg3) {
        ++field475;
        if (~arg0 >= -1 && ~arg2 <= ~(this.field378 + -1) && arg1 <= 0 && ~arg3 <= ~(this.field462 + -1)) {
            this.method374();
        } else {
            this.field607 = ~this.field378 <= ~arg2 ? arg2 : 0;
            this.field611 = ~this.field378 > ~arg3 ? 0 : arg3;
            this.field614 = arg1 < 0 ? 0 : arg1;
            this.field591 = arg0 >= 0 ? arg0 : 0;
            if (!this.field696) {
                this.field696 = true;
                this.method397(0);
            }
            this.method359(-8);
            this.method373((byte) 53);
        }
    }

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "(II)V")
    public abstract void method241(int arg0, int arg1);

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(B)V")
    private final void method242(byte arg0) {
        ++field412;
        this.field592 = false;
        if (arg0 <= -69) {
            if (this.field601 != null) {
                this.field601.method433(114);
            }
            this.method286(83);
        }
    }

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "(I)V")
    private final void method243(int arg0) {
        ++field553;
        this.field681 = this.method293(false, 6);
        this.field681.method693(true, 3096, 12);
        for (int var2 = 0; ~var2 > -5; ++var2) {
            Buffer var3 = this.field681.method692(true, arg0 ^ 14851);
            if (var3 != null) {
                Stream var4 = this.method368((byte) -121, var3);
                var4.method2576(0.0F);
                var4.method2576(0.0F);
                var4.method2576(0.0F);
                for (int var5 = 0; var5 <= 256; ++var5) {
                    double var6 = (double) (var5 * 2) * 3.141592653589793D / 256.0D;
                    float var8 = (float) Math.cos(var6);
                    float var9 = (float) Math.sin(var6);
                    if (!Stream.method2572()) {
                        var4.method2579(var9);
                        var4.method2579(var8);
                        var4.method2579(0.0F);
                    } else {
                        var4.method2576(var9);
                        var4.method2576(var8);
                        var4.method2576(0.0F);
                    }
                }
                var4.method2573();
                if (this.field681.method696(-11404)) {
                    break;
                }
            }
        }
        this.field680 = this.method219(arg0 ^ -16565, new class468[] { new class468(class531.field7629) });
        if (arg0 != -16567) {
            this.field622 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ltc;)V")
    public final void method244(class73 arg0) {
        this.field568 = (class341) arg0;
        ++field566;
        this.field570.method673(this.field568);
        this.field570.method2187(-2);
        this.field571.method2186(this.field570, -127);
        this.field569.method2186(this.field568, -112);
        if (this.field605.method115(0)) {
            this.method242((byte) -97);
        }
    }

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "(I)V")
    private final void method245(int arg0) {
        ++field536;
        if (arg0 != 16) {
            this.method391((byte[]) null, -80, true, (class233) null, -9, 52);
        }
        this.field678 = this.method293(false, 6);
        this.field678.method693(true, 140, 28);
        for (int var2 = 0; ~var2 > -5; ++var2) {
            Buffer var3 = this.field678.method692(true, arg0 + -31430);
            if (var3 != null) {
                Stream var4 = this.method368((byte) -121, var3);
                if (!Stream.method2572()) {
                    var4.method2579(0.0F);
                    var4.method2579(0.0F);
                    var4.method2579(0.0F);
                    var4.method2579(0.0F);
                    var4.method2579(0.0F);
                    var4.method2579(0.0F);
                    var4.method2579(0.0F);
                    var4.method2579(0.0F);
                    var4.method2579(1.0F);
                    var4.method2579(0.0F);
                    var4.method2579(0.0F);
                    var4.method2579(1.0F);
                    var4.method2579(0.0F);
                    var4.method2579(1.0F);
                    var4.method2579(1.0F);
                    var4.method2579(1.0F);
                    var4.method2579(0.0F);
                    var4.method2579(1.0F);
                    var4.method2579(1.0F);
                    var4.method2579(1.0F);
                    var4.method2579(1.0F);
                    var4.method2579(1.0F);
                    var4.method2579(0.0F);
                    var4.method2579(0.0F);
                    var4.method2579(1.0F);
                    var4.method2579(0.0F);
                    var4.method2579(1.0F);
                    var4.method2579(0.0F);
                    var4.method2579(0.0F);
                    var4.method2579(0.0F);
                    var4.method2579(0.0F);
                    var4.method2579(0.0F);
                    var4.method2579(0.0F);
                    var4.method2579(0.0F);
                    var4.method2579(0.0F);
                } else {
                    var4.method2576(0.0F);
                    var4.method2576(0.0F);
                    var4.method2576(0.0F);
                    var4.method2576(0.0F);
                    var4.method2576(0.0F);
                    var4.method2576(0.0F);
                    var4.method2576(0.0F);
                    var4.method2576(0.0F);
                    var4.method2576(1.0F);
                    var4.method2576(0.0F);
                    var4.method2576(0.0F);
                    var4.method2576(1.0F);
                    var4.method2576(0.0F);
                    var4.method2576(1.0F);
                    var4.method2576(1.0F);
                    var4.method2576(1.0F);
                    var4.method2576(0.0F);
                    var4.method2576(1.0F);
                    var4.method2576(1.0F);
                    var4.method2576(1.0F);
                    var4.method2576(1.0F);
                    var4.method2576(1.0F);
                    var4.method2576(0.0F);
                    var4.method2576(0.0F);
                    var4.method2576(1.0F);
                    var4.method2576(0.0F);
                    var4.method2576(1.0F);
                    var4.method2576(0.0F);
                    var4.method2576(0.0F);
                    var4.method2576(0.0F);
                    var4.method2576(0.0F);
                    var4.method2576(0.0F);
                    var4.method2576(0.0F);
                    var4.method2576(0.0F);
                    var4.method2576(0.0F);
                }
                var4.method2573();
                if (this.field678.method696(arg0 ^ -11420)) {
                    break;
                }
            }
        }
        this.field687 = this.method219(2, new class468[] { new class468(new class531[] { class531.field7629, class531.field7637, class531.field7637 }) });
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(Z)V")
    public final void method246(boolean arg0) {
        ++field480;
    }

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "(I)Lga;")
    public final class341 method247(int arg0) {
        if (arg0 != -20019) {
            this.field587 = -1.1203138F;
        }
        ++field485;
        return this.field571;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "()V")
    public void method248() {
        ++field563;
        if (!this.field641) {
            for (class65 var1 = this.field459.method3463((byte) -50); var1 != null; var1 = this.field459.method3469((byte) 107)) {
                ((class558) var1).method3244(true);
            }
            Enumeration var2 = this.field524.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method422((byte) -62, var3, this.field524.get(var3));
            }
            class342.method2203(true, false, 5438);
            this.field472.release();
            this.field641 = true;
        }
    }

    @OriginalMember(owner = "client!pj", name = "da", descriptor = "(III[I)V")
    public final void method249(int arg0, int arg1, int arg2, int[] arg3) {
        ++field567;
        float var5 = this.field568.method2192((float) arg1, 16383, (float) arg2, (float) arg0);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field575;
            var7 = this.field647;
        } else {
            var6 = (int) ((float) this.field648 * this.field568.method2182((float) arg2, (float) arg1, (byte) 40, (float) arg0) / var5);
            var7 = (int) ((float) this.field659 * this.field568.method2185((float) arg1, (float) arg0, 0, (float) arg2) / var5);
        }
        arg3[1] = (int) ((float) var7 - this.field587);
        arg3[2] = (int) var5;
        arg3[0] = (int) ((float) var6 + -this.field603);
    }

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "(I)V")
    public final void method250(int arg0) {
        if (this.field613[this.field617] != class243.field3916) {
            this.field613[this.field617] = class243.field3916;
            this.field616[this.field617].method677();
            this.method418((byte) -122);
        }
        ++field466;
        int var2 = -78 % ((arg0 - -43) / 34);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lri;II)V")
    private final void method251(class342 arg0, int arg1, int arg2) {
        ++field477;
        this.method327(this.field678, arg1, 0);
        this.method330(19661, this.field687);
        this.method403(arg2, arg0, false, 0);
    }

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "(I)V")
    private final void method252(int arg0) {
        ++field549;
        this.field693 = this.method293(true, 6);
        if (arg0 == 29977) {
            this.field693.method693(true, 24, 12);
            this.field690 = this.method219(2, new class468[] { new class468(class531.field7629) });
        }
    }

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "(III)V")
    public final void method253(int arg0, int arg1, int arg2) {
        if (~this.field618 != ~arg0 || this.field636 != arg1 || this.field646 != arg2) {
            this.field636 = arg1;
            this.field646 = arg2;
            this.field618 = arg0;
            this.method234(12);
            this.method319(true);
        }
        ++field499;
    }

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "()Z")
    public final boolean method254() {
        ++field510;
        return true;
    }

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "(I)V")
    public abstract void method255(int arg0);

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "(Z)V")
    public final void method256(boolean arg0) {
        ++field523;
        if (!arg0) {
            this.field605 = null;
        }
        if (~this.field672 != -3) {
            this.method296(-104);
            this.method232(false, (byte) 59);
            this.method384(-68, false);
            this.method258(false, 1);
            this.method394(13119, false);
            this.method421(false, 15, -2, false);
            this.field672 = 2;
        }
    }

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "(I)V")
    private final void method257(int arg0) {
        ++field502;
        this.field602[14] = this.field640;
        this.field602[arg0] = this.field656;
        this.field610 = (this.field602[14] - (float) this.field581) / this.field602[10];
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZI)V")
    public final void method258(boolean arg0, int arg1) {
        ++field414;
        if (arg1 != 1) {
            this.method240(-89, 94, -27, 68);
        }
        if (!this.field663 == arg0) {
            this.field663 = arg0;
            this.method378(-123);
            this.field672 &= -32;
        }
    }

    @OriginalMember(owner = "client!pj", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method259(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field508;
        boolean var7 = this.field662 != arg0;
        if (var7 || this.field632 != arg1 || this.field620 != arg2) {
            this.field632 = arg1;
            this.field620 = arg2;
            this.field662 = arg0;
            if (var7) {
                this.field593 = (float) (this.field662 & 65280) / 65280.0F;
                this.field626 = (float) (this.field662 & 16711680) / 1.671168E7F;
                this.field661 = (float) (this.field662 & 255) / 255.0F;
                this.method346((byte) -50);
            }
            this.field472.setSunColour(this.field626, this.field593, this.field661, arg1, arg2);
            this.method372(0);
        }
        if (this.field629[0] != arg3 || this.field629[1] != arg4 || this.field629[2] != arg5) {
            this.field629[1] = arg4;
            this.field629[2] = arg5;
            this.field629[0] = arg3;
            this.field594[2] = -arg5;
            this.field594[1] = -arg4;
            this.field594[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field642[1] = arg4 * var8;
            this.field642[2] = arg5 * var8;
            this.field642[0] = arg3 * var8;
            this.field573[1] = -this.field642[1];
            this.field573[0] = -this.field642[0];
            this.field573[2] = -this.field642[2];
            this.field472.setSunDirection(this.field642[0], this.field642[1], this.field642[2]);
            this.method341(29069);
            this.field576 = (int) (arg3 * 256.0F / arg4);
            this.field670 = (int) (arg5 * 256.0F / arg4);
        }
        this.method334(0);
    }

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "(I)Lza;")
    public final class254 method260(int arg0) {
        ++field469;
        class558 var2 = new class558(arg0);
        this.field459.method3472(106, var2);
        return var2;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
    public void method261(int arg0) {
        if (this.field590 != null) {
            this.field590.method3929(-9100);
        }
        ++field390;
        this.field649 = arg0 & Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "(I)V")
    public final void method262(int arg0) {
        ++field557;
        if (class340.field4996 != this.field605) {
            class19 var2 = this.field605;
            this.field605 = class340.field4996;
            if (var2.method115(0)) {
                this.method242((byte) -106);
            }
            this.field672 &= -32;
            this.field586 = this.field667;
        }
        if (arg0 < 26) {
            this.method354(58, -4, -42, 25, -69, -76, 54, 55, -123);
        }
    }

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "(Z)Lga;")
    public final class341 method263(boolean arg0) {
        ++field433;
        return arg0 ? null : this.field616[this.field617];
    }

    @OriginalMember(owner = "client!pj", name = "U", descriptor = "(IIIII)V")
    public final void method264(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method315(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
        ++field464;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZI[II)Lrm;")
    public final class90 method265(int arg0, boolean arg1, int arg2, int[] arg3, int arg4) {
        if (arg4 != 0) {
            this.field663 = false;
        }
        ++field409;
        return this.method407(0, arg0, 0, arg3, arg2, 68, arg1);
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(IIIIII)Lvm;")
    public final class72 method266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field562;
        return new class508(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "(Z)V")
    private final void method267(boolean arg0) {
        if (arg0) {
            this.field571 = null;
        }
        if (this.field396 == null) {
            this.field440 = this.field496 = 1;
        } else {
            Dimension var2 = this.field396.getSize();
            this.field496 = var2.height;
            this.field440 = var2.width;
        }
        ++field426;
        this.field462 = this.field496;
        this.field378 = this.field440;
        this.method366(1464);
        this.method367(0);
        this.method274(5);
        this.method214(71);
        this.method373((byte) 53);
        this.method262(103);
        this.method374();
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "()Z")
    public final boolean method268() {
        ++field468;
        return true;
    }

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "(I)Lga;")
    public final class341 method269(int arg0) {
        ++field509;
        return arg0 != 1 ? null : this.field616[this.field617];
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIZ)Lit;")
    public final class34 method270(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field511;
        class721 var6 = new class721(this, arg2, arg3, arg4);
        var6.method47(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(B)V")
    public abstract void method271(byte arg0);

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(ZI)V")
    public final void method272(boolean arg0, int arg1) {
        ++field529;
        if (arg1 != 32) {
            this.method399(-101, (class121) null, (class233) null);
        }
        if (this.field671 != arg0) {
            this.field671 = arg0;
            this.method362((byte) -46);
        }
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(II)I")
    public final int method273(int arg0, int arg1) {
        ++field413;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "(I)V")
    private final void method274(int arg0) {
        this.field643 = false;
        ++field460;
        this.method222(true);
        if (arg0 == 5) {
            if (class138.field2162 == this.field605) {
                this.method230(true);
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method275(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field503;
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(B)V")
    public abstract void method276(byte arg0);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)Loca;")
    public class279 method277(int arg0, byte arg1) {
        if (arg1 != -79) {
            this.method389(22);
        }
        ++field515;
        if (arg0 != 6) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    return arg0 == 7 ? new class126(this) : new class148(this);
                } else {
                    return new class367(this, this.field435);
                }
            } else {
                return new class501(this);
            }
        } else {
            return new class212(this);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
    public abstract void method278(Object arg0, byte arg1, Canvas arg2);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III[FZLlw;)Lrm;")
    public final class90 method279(int arg0, int arg1, int arg2, float[] arg3, boolean arg4, class233 arg5) {
        if (arg2 != -21176) {
            this.field678 = null;
        }
        ++field488;
        return this.method415(arg3, arg0, arg4, arg2 ^ -21182, arg5, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([I)V")
    public final void method280(int[] arg0) {
        arg0[1] = this.field462;
        ++field561;
        arg0[0] = this.field378;
    }

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "(B)V")
    public void method281(byte arg0) {
        this.method344((byte) 87);
        ++field476;
        if (arg0 != 8) {
            this.field462 = 91;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II[I[I)Laa;")
    public final class570 method282(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field430;
        return class471.method2873(this, arg2, arg0, 0, arg3, arg1);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIII)V")
    public final void method283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field436;
    }

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "(B)V")
    public abstract void method284(byte arg0);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lza;)V")
    public final void method285(class254 arg0) {
        ++field516;
        this.field530 = ((class558) arg0).field7921;
        this.field461 = this.field530.method2591(32768, false);
    }

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "(I)V")
    public abstract void method286(int arg0);

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "(ILaa;II)V")
    public final void method287(int arg0, class570 arg1, int arg2, int arg3) {
        ++field526;
        class281 var5 = (class281) arg1;
        class90 var6 = var5.field4364;
        this.method256(true);
        this.method215(8, var6);
        this.method314(1, (byte) 21);
        this.method365(class750.field10454, class750.field10454, (byte) -122);
        this.method321(class327.field4819, 0, (byte) -95);
        this.method228(2, arg0);
        this.field547.method2179((float) this.field462, 0.0F, true, (float) this.field378);
        this.method309((byte) 104);
        this.field616[0].method2179(var6.method591(127, (float) this.field462), 1.0F, true, var6.method590(103, (float) this.field378));
        this.field616[0].method2190((byte) 51, var6.method591(117, (float) (-arg3)), 0.0F, var6.method590(68, (float) (-arg2)));
        this.field613[0] = class673.field9518;
        this.method418((byte) -122);
        this.method233(false);
        this.method250(89);
        this.method321(class388.field5817, 0, (byte) -95);
    }

    @OriginalMember(owner = "client!pj", name = "DA", descriptor = "(IIII)V")
    public final void method288(int arg0, int arg1, int arg2, int arg3) {
        this.field647 = arg1;
        this.field648 = arg2;
        this.field659 = arg3;
        ++field431;
        this.field575 = arg0;
        this.method274(5);
        this.method367(0);
        this.method262(101);
        this.method373((byte) 53);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIILoq;ILri;I)V")
    public abstract void method289(int arg0, int arg1, int arg2, class743 arg3, int arg4, class342 arg5, int arg6);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class570 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field521;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BB)V")
    public final void method291(byte arg0, byte arg1) {
        ++field454;
        this.method228(2, arg0 << 16 | arg0 << 24 | arg0 << 8 | arg0);
        if (arg1 <= 59) {
            this.method285((class254) null);
        }
    }

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "(IIIII)V")
    public final void method292(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field406;
        this.method315(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(ZI)Lfb;")
    public abstract class669 method293(boolean arg0, int arg1);

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "()I")
    public final int method294() {
        ++field518;
        return this.field634;
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(I)V")
    public final void method295(int arg0) {
        ++field458;
    }

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "(I)V")
    private final void method296(int arg0) {
        ++field481;
        int var2 = -115 / ((arg0 - -6) / 47);
        if (class460.field6667 != this.field605) {
            class19 var3 = this.field605;
            this.field605 = class460.field6667;
            if (var3.method115(0)) {
                this.method242((byte) -114);
            }
            this.method226(27529);
            this.field586 = this.field580;
            this.method230(true);
            this.field672 &= -25;
        }
    }

    @OriginalMember(owner = "client!pj", name = "JA", descriptor = "(IIIIII)I")
    public final int method297(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field422;
        int var7 = 0;
        float var8 = (float) arg2 * this.field568.field5037 + (float) arg0 * this.field568.field5032 + (float) arg1 * this.field568.field5029 + this.field568.field5048;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field568.field5037 + (float) arg3 * this.field568.field5032 + (float) arg4 * this.field568.field5029 + this.field568.field5048;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if ((float) this.field634 > var8 && var9 < (float) this.field634) {
            var7 |= 16;
        } else if ((float) this.field581 < var8 && var9 > (float) this.field581) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field568.field5015 + (float) arg0 * this.field568.field5023 + (float) arg1 * this.field568.field5045 + this.field568.field5009) * (float) this.field648 / var8);
        int var11 = (int) (((float) arg5 * this.field568.field5015 + (float) arg3 * this.field568.field5023 + (float) arg4 * this.field568.field5045 + this.field568.field5009) * (float) this.field648 / var9);
        if (this.field603 > (float) var10 && (float) var11 < this.field603) {
            var7 |= 1;
        } else if (this.field666 < (float) var10 && this.field666 < (float) var11) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field568.field5027 + (float) arg0 * this.field568.field5024 + (float) arg1 * this.field568.field5036 + this.field568.field5001) * (float) this.field659 / var8);
        int var13 = (int) (((float) arg5 * this.field568.field5027 + (float) arg3 * this.field568.field5024 + (float) arg4 * this.field568.field5036 + this.field568.field5001) * (float) this.field659 / var9);
        if ((float) var12 < this.field587 && this.field587 > (float) var13) {
            var7 |= 4;
        } else if (this.field589 < (float) var12 && this.field589 < (float) var13) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!pj", name = "T", descriptor = "(IIII)V")
    public final void method298(int arg0, int arg1, int arg2, int arg3) {
        ++field467;
        boolean var5 = false;
        if (~this.field591 > ~arg0) {
            var5 = true;
            this.field591 = arg0;
        }
        if (~this.field607 < ~arg2) {
            this.field607 = arg2;
            var5 = true;
        }
        if (~arg1 < ~this.field614) {
            var5 = true;
            this.field614 = arg1;
        }
        if (this.field611 > arg3) {
            this.field611 = arg3;
            var5 = true;
        }
        if (var5) {
            if (!this.field696) {
                this.field696 = true;
                this.method397(0);
            }
            this.method359(-8);
            this.method373((byte) 53);
        }
    }

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "(I)V")
    private final void method299(int arg0) {
        if (arg0 < 47) {
            this.field661 = -0.33293933F;
        }
        ++field443;
        this.field612 = (float) this.field581;
    }

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "()I")
    public final int method300() {
        ++field507;
        return this.field697;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lb;IIII)Lka;")
    public final class282 method301(class352 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field500;
        return new class191(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "(I)V")
    public final void method302(int arg0) {
        if (arg0 != Integer.MAX_VALUE) {
            this.field573 = null;
        }
        ++field439;
        if (this.field672 != 16) {
            this.method385(-8);
            this.method232(true, (byte) -73);
            this.method258(true, 1);
            this.method394(13119, true);
            this.method314(1, (byte) 21);
            this.field672 = 16;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lga;B)V")
    public final void method303(class341 arg0, byte arg1) {
        this.field547.method673(arg0);
        if (arg1 != 117) {
            this.method292(-99, 112, 115, -56, 126);
        }
        ++field453;
        this.field551 = false;
        this.method401(arg1 + -116);
    }

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "(I)V")
    public abstract void method304(int arg0);

    @OriginalMember(owner = "client!pj", name = "pa", descriptor = "()V")
    public final void method305() {
        ++field495;
        this.field595 = false;
    }

    @OriginalMember(owner = "client!pj", name = "B", descriptor = "(I)I")
    public final int method306(int arg0) {
        ++field387;
        if (arg0 != 1) {
            this.method372(124);
        }
        return this.field617;
    }

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "(I)V")
    public abstract void method307(int arg0);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method308(Canvas arg0, int arg1, int arg2) {
        ++field423;
        if (this.field391 == arg0) {
            throw new RuntimeException();
        } else if (!this.field524.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var7) {
                }
                Object var6 = this.method324(arg0, (byte) 104);
                if (var6 == null) {
                    throw new RuntimeException();
                } else {
                    this.field524.put(arg0, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "(B)V")
    public final void method309(byte arg0) {
        this.field551 = false;
        ++field399;
        this.method401(1);
        int var2 = -63 % ((arg0 - 35) / 57);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lgu;Z)Lit;")
    public final class34 method310(class726 arg0, boolean arg1) {
        ++field505;
        class34 var9;
        if (~arg0.field10184 != -1 && arg0.field10186 != 0) {
            int[] var3 = new int[arg0.field10186 * arg0.field10184];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field10185 != null) {
                for (int var6 = 0; arg0.field10186 > var6; ++var6) {
                    for (int var7 = 0; ~arg0.field10184 < ~var7; ++var7) {
                        var3[var5++] = class112.method903(arg0.field10183[class636.method3603(arg0.field10181[var4], 255)], arg0.field10185[var4] << 24);
                        ++var4;
                    }
                }
            } else {
                for (int var8 = 0; var8 < arg0.field10186; ++var8) {
                    for (int var10 = 0; ~var10 > ~arg0.field10184; ++var10) {
                        int var11 = arg0.field10183[255 & arg0.field10181[var4++]];
                        var3[var5++] = ~var11 != -1 ? class112.method903(-16777216, var11) : 0;
                    }
                }
            }
            var9 = this.method3185(0, var3, false, arg0.field10186, arg0.field10184, arg0.field10184);
        } else {
            var9 = this.method3185(0, new int[1], false, 1, 1, 1);
        }
        var9.method185(arg0.field10179, arg0.field10182, arg0.field10187, arg0.field10180);
        return var9;
    }

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "(I)V")
    public abstract void method311(int arg0);

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "(Z)V")
    private final void method312(boolean arg0) {
        if (arg0) {
            ++field397;
            this.method327(this.field693, 0, 0);
            this.method330(19661, this.field690);
            this.method403(1, class338.field4931, false, 0);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III[B)[B")
    public static final byte[] method313(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field384;
        byte[] var4;
        if (~arg2 >= -1) {
            var4 = arg3;
        } else {
            var4 = new byte[arg0];
            for (int var5 = 0; var5 < arg0; ++var5) {
                var4[var5] = arg3[arg2 + var5];
            }
        }
        class112 var6 = new class112();
        var6.method904(255);
        if (arg1 != 23863) {
            method313(64, -126, 72, (byte[]) null);
        }
        var6.method902(var4, (long) (arg0 * 8), 119);
        byte[] var7 = new byte[64];
        var6.method905(var7, 0, 125);
        return var7;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(IB)V")
    public final void method314(int arg0, byte arg1) {
        if (arg1 != 21) {
            this.field580 = null;
        }
        if (~this.field582 != ~arg0) {
            boolean var3;
            class539 var4;
            boolean var5;
            if (~arg0 == -2) {
                var3 = true;
                var4 = class560.field7946;
                var5 = true;
            } else if (arg0 != 2) {
                if (~arg0 == -129) {
                    var3 = true;
                    var5 = true;
                    var4 = class182.field3072;
                } else {
                    var5 = false;
                    var4 = class547.field7813;
                    var3 = false;
                }
            } else {
                var4 = class682.field9654;
                var3 = false;
                var5 = true;
            }
            if (!var3 == this.field652) {
                this.field652 = var3;
                this.method364(23698);
            }
            if (this.field650 != var5) {
                this.field650 = var5;
                this.method357((byte) -73);
            }
            if (this.field645 != var4) {
                this.field645 = var4;
                this.method347(8);
            }
            this.field582 = arg0;
            this.field672 &= -29;
        }
        ++field484;
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(IIIIII)V")
    public final void method315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field424;
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) arg3 - (float) arg1;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var9 = var7 * var10;
            var8 *= var10;
        }
        if (this.method225((float) arg2 + var9, (float) arg0, (float) arg1, true, 0.0F, (float) arg3 + var8, 0.0F)) {
            this.method323(3);
            this.method228(2, arg4);
            this.method321(class327.field4819, 0, (byte) -95);
            this.method227(0, class327.field4819, 70);
            this.method314(arg5, (byte) 21);
            this.method432(5);
            this.method396(-78, false);
            this.method312(true);
            this.method396(-46, true);
            this.method227(0, class388.field5817, 70);
            this.method321(class388.field5817, 0, (byte) -95);
        }
    }

    @OriginalMember(owner = "client!pj", name = "za", descriptor = "(IIIII)V")
    public final void method316(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method323(3);
        ++field379;
        this.method228(2, arg3);
        this.method321(class327.field4819, 0, (byte) -95);
        this.method227(0, class327.field4819, 70);
        this.method314(arg4, (byte) 21);
        this.field547.method2179((float) arg2, 1.0F, true, (float) arg2);
        this.field547.method671(arg0, arg1, 0);
        this.method309((byte) -103);
        this.method396(-93, false);
        this.method327(this.field681, 0, 0);
        this.method330(19661, this.field680);
        this.method403(256, class255.field4027, false, 0);
        this.method396(-95, true);
        this.method227(0, class388.field5817, 70);
        this.method321(class388.field5817, 0, (byte) -95);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method317(Canvas arg0) {
        this.field396 = null;
        ++field452;
        this.field442 = null;
        if (arg0 != null && this.field391 != arg0) {
            if (this.field524.containsKey(arg0)) {
                this.field442 = this.field524.get(arg0);
                this.field396 = arg0;
            }
        } else {
            this.field442 = this.field520;
            this.field396 = this.field391;
        }
        if (this.field396 != null && this.field442 != null) {
            this.method278(this.field442, (byte) -16, this.field396);
            this.method267(false);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "(Z)V")
    public abstract void method318(boolean arg0);

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "(Z)V")
    public abstract void method319(boolean arg0);

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "()Z")
    public final boolean method320() {
        ++field519;
        return false;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lmq;IB)V")
    public final void method321(class592 arg0, int arg1, byte arg2) {
        if (arg2 != -95) {
            this.method404(-47);
        }
        this.method338(arg1, arg0, false, false, arg2 + 31276);
        ++field494;
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V")
    public final void method322(int arg0) {
        ++field540;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "(I)V")
    private final void method323(int arg0) {
        if (arg0 != 3) {
            this.field628 = -95;
        }
        ++field483;
        if (~this.field672 != -2) {
            this.method296(-69);
            this.method232(false, (byte) 67);
            this.method384(-69, false);
            this.method258(false, 1);
            this.method394(arg0 ^ 13116, false);
            this.method421(false, arg0 ^ 12, -2, false);
            this.method405(1, (byte) 121);
            this.method215(8, this.field622);
            this.field672 = 1;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;")
    public abstract Object method324(Canvas arg0, byte arg1);

    @OriginalMember(owner = "client!pj", name = "F", descriptor = "(I)F")
    public abstract float method325(int arg0);

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "(Z)V")
    public final void method326(boolean arg0) {
        this.field598 = arg0;
        ++field398;
        this.method276((byte) 74);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lfb;II)V")
    public abstract void method327(class669 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pj", name = "xa", descriptor = "(F)V")
    public final void method328(float arg0) {
        ++field405;
        if (this.field651 != arg0) {
            this.field651 = arg0;
            this.field472.setAmbient(arg0);
            this.method346((byte) -50);
            this.method334(0);
        }
    }

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "(B)V")
    public abstract void method329(byte arg0);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILfk;)V")
    public abstract void method330(int arg0, class313 arg1);

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "([I)V")
    public final void method331(int[] arg0) {
        ++field538;
        arg0[0] = this.field591;
        arg0[3] = this.field611;
        arg0[1] = this.field614;
        arg0[2] = this.field607;
    }

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "()I")
    public final int method332() {
        ++field380;
        return this.field556 - (-this.field560 + -this.field550);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZLqg;)V")
    public abstract void method333(boolean arg0, class266 arg1);

    @OriginalMember(owner = "client!pj", name = "G", descriptor = "(I)V")
    public abstract void method334(int arg0);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B[F)[F")
    public final float[] method335(byte arg0, float[] arg1) {
        arg1[8] = this.field586[2];
        ++field404;
        arg1[12] = this.field586[3];
        arg1[0] = this.field586[0];
        arg1[4] = this.field586[1];
        arg1[13] = this.field586[7];
        arg1[5] = this.field586[5];
        arg1[1] = this.field586[4];
        arg1[9] = this.field586[6];
        arg1[2] = this.field586[8];
        arg1[6] = this.field586[9];
        arg1[3] = this.field586[12];
        arg1[10] = this.field586[10];
        arg1[7] = this.field586[13];
        arg1[14] = this.field586[11];
        arg1[15] = this.field586[15];
        arg1[11] = this.field586[14];
        if (arg0 != -74) {
            this.method373((byte) -39);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "(Z)V")
    public final void method336(boolean arg0) {
        ++field486;
        if (!arg0) {
            if (~this.field672 != -9) {
                this.method345(true);
                this.method232(true, (byte) -88);
                this.method258(true, 1);
                this.method394(13119, true);
                this.method314(1, (byte) 21);
                this.field672 = 8;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "(III[I)V")
    public final void method337(int arg0, int arg1, int arg2, int[] arg3) {
        ++field392;
        float var5 = this.field568.method2192((float) arg1, 16383, (float) arg2, (float) arg0);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field647;
            var7 = this.field575;
        } else {
            var7 = (int) ((float) this.field648 * this.field568.method2182((float) arg2, (float) arg1, (byte) 40, (float) arg0) / var5);
            var6 = (int) ((float) this.field659 * this.field568.method2185((float) arg1, (float) arg0, 0, (float) arg2) / var5);
        }
        arg3[1] = (int) ((float) var6 + -this.field587);
        arg3[2] = (int) var5;
        arg3[0] = (int) ((float) var7 - this.field603);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILmq;ZZI)V")
    public abstract void method338(int arg0, class592 arg1, boolean arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I[Lvt;)V")
    public final void method339(int arg0, class759[] arg1) {
        for (int var3 = 0; ~var3 > ~arg0; ++var3) {
            this.field588[var3] = arg1[var3];
        }
        ++field546;
        this.field578 = arg0;
        if (this.field605.method115(0)) {
            this.method412(15);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
    public abstract void method340(Object arg0, int arg1, Canvas arg2);

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "(I)V")
    public abstract void method341(int arg0);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLwe;)V")
    public final void method342(byte arg0, class357 arg1) {
        this.field613[this.field617] = arg1;
        ++field427;
        int var3 = 14 % ((-73 - arg0) / 47);
        this.method418((byte) -122);
    }

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "()Ltc;")
    public final class73 method343() {
        ++field474;
        return this.field674;
    }

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "(B)V")
    private final void method344(byte arg0) {
        this.method346((byte) -50);
        ++field450;
        this.method372(0);
        this.method358((byte) -21);
        this.method412(15);
        this.method341(29069);
        this.method334(0);
        this.method362((byte) -46);
        this.method378(-48);
        this.method276((byte) -124);
        this.method319(true);
        this.method311(76);
        this.method357((byte) -53);
        this.method347(8);
        this.method364(23698);
        int var2 = this.field597 - 1;
        int var3 = 3 % ((-20 - arg0) / 50);
        while (var2 >= 0) {
            this.method411(var2, (byte) -83);
            this.method425(21);
            this.method255(-88);
            this.method250(1);
            --var2;
        }
        this.method318(false);
        this.method214(127);
        this.method307(-1);
        this.method271((byte) -98);
        this.method286(110);
    }

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "(Z)V")
    private final void method345(boolean arg0) {
        if (!arg0) {
            this.method408((byte[]) null, (byte) 20, (class233) null, 75, -49, -37);
        }
        ++field498;
        if (class290.field4455 != this.field605) {
            class19 var2 = this.field605;
            this.field605 = class290.field4455;
            if (!var2.method115(0)) {
                this.method242((byte) -105);
            }
            this.method375(-87);
            this.field586 = this.field602;
            this.method230(true);
            this.field672 &= -8;
        }
    }

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "(B)V")
    public abstract void method346(byte arg0);

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "(I)V")
    public abstract void method347(int arg0);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class570 arg6, int arg7, int arg8) {
        ++field415;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILlw;I[BIIZ)Lrm;")
    public abstract class90 method349(int arg0, int arg1, class233 arg2, int arg3, byte[] arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!pj", name = "ra", descriptor = "(IIII)V")
    public final void method350(int arg0, int arg1, int arg2, int arg3) {
        this.field637 = arg3;
        this.field660 = arg0;
        this.field595 = true;
        this.field599 = arg2;
        ++field465;
        this.field654 = arg1;
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(II)I")
    public final int method351(int arg0, int arg1) {
        ++field403;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!pj", name = "HA", descriptor = "(IIII[I)V")
    public final void method352(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field517;
        float var6 = this.field568.method2192((float) arg1, 16383, (float) arg2, (float) arg0);
        if (!(var6 < (float) this.field634) && !(var6 > (float) this.field581)) {
            int var7 = (int) ((float) this.field648 * this.field568.method2182((float) arg2, (float) arg1, (byte) 40, (float) arg0) / (float) arg3);
            int var8 = (int) ((float) this.field659 * this.field568.method2185((float) arg1, (float) arg0, 0, (float) arg2) / (float) arg3);
            arg4[0] = (int) ((float) var7 - this.field603);
            arg4[2] = (int) var6;
            arg4[1] = (int) ((float) var8 - this.field587);
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "(I)V")
    public final void method353(int arg0) {
        this.field625 = new class393[this.field597];
        ++field548;
        this.field638 = new class506[this.field597];
        this.field613 = new class357[this.field597];
        this.field616 = new class341[this.field597];
        this.field673 = new class393[this.field597];
        int var2 = 0;
        if (arg0 < -67) {
            while (~this.field597 < ~var2) {
                this.field625[var2] = class333.field4884;
                this.field673[var2] = class333.field4884;
                this.field613[var2] = class243.field3916;
                this.field616[var2] = new class341();
                ++var2;
            }
            this.field588 = new class759[this.field579 + -2];
            this.field622 = this.method417(class238.field3830, 3, 1, class121.field1859, 1);
            this.method285(new class558(262144));
            this.field692 = this.method219(2, new class468[] { new class468(new class531[] { class531.field7629, class531.field7637 }) });
            this.field676 = this.method219(2, new class468[] { new class468(new class531[] { class531.field7629, class531.field7635 }) });
            this.field677 = this.method219(2, new class468[] { new class468(class531.field7629), new class468(class531.field7635), new class468(class531.field7637), new class468(class531.field7634) });
            this.field682 = this.method219(2, new class468[] { new class468(class531.field7629), new class468(class531.field7635), new class468(class531.field7637) });
            this.field689 = new class191(this, 0, 0, false, false);
            this.field691 = new class191(this, 0, 0, true, true);
            this.field683 = new class191(this, 0, 0, false, false);
            this.field675 = new class191(this, 0, 0, true, true);
            this.field688 = new class191(this, 0, 0, false, false);
            this.field679 = new class191(this, 0, 0, true, true);
            this.field695 = new class191(this, 0, 0, false, false);
            this.field686 = new class191(this, 0, 0, true, true);
            this.field685 = new class191(this, 0, 0, false, false);
            this.field684 = new class191(this, 0, 0, true, true);
            this.field631 = new class476(this);
            this.field694 = this.method428(-123, true);
            this.method382((byte) 66);
            this.field435 = new class67(this);
            this.field606[1] = this.method277(1, (byte) -79);
            this.field606[2] = this.method277(2, (byte) -79);
            this.field606[4] = this.method277(4, (byte) -79);
            this.field606[5] = this.method277(5, (byte) -79);
            this.field606[6] = this.method277(6, (byte) -79);
            this.field606[7] = this.method277(7, (byte) -79);
            this.field606[3] = this.method277(3, (byte) -79);
            this.field606[8] = this.method277(8, (byte) -79);
            this.field606[9] = this.method277(9, (byte) -79);
            if (!this.field606[2].method438((byte) -71)) {
                this.field606[2] = this.method277(0, (byte) -79);
            }
            if (!this.field606[4].method438((byte) -112)) {
                this.field606[4] = this.field606[2];
            }
            if (!this.field606[8].method438((byte) -43)) {
                this.field606[8] = this.field606[4];
            }
            if (!this.field606[9].method438((byte) -125)) {
                this.field606[9] = this.field606[8];
            }
            this.method281((byte) 8);
            this.method374();
            this.method1265();
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field446;
        float var10 = (float) arg2 - (float) arg0;
        float var11 = (float) arg3 - (float) arg1;
        float var12;
        if (var10 == 0.0F && var11 == 0.0F) {
            var12 = 1.0F;
        } else {
            float var13 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            var12 = var10 * var13;
            var11 *= var13;
        }
        this.method323(3);
        this.method228(2, arg4);
        this.method321(class327.field4819, 0, (byte) -95);
        this.method227(0, class327.field4819, 70);
        this.method314(arg5, (byte) 21);
        this.method432(5);
        this.method396(-122, false);
        int var14 = arg8 % (arg6 + arg7);
        float var15 = (float) arg6 * var12;
        float var16 = (float) arg6 * var11;
        float var17 = 0.0F;
        float var18 = 0.0F;
        float var19 = var15;
        float var20 = var16;
        if (~var14 < ~arg6) {
            var18 = (float) (arg6 - (-arg7 + var14)) * var11;
            var17 = (float) (arg6 - (-arg7 - -var14)) * var12;
        } else {
            var19 = (float) (-var14 + arg6) * var12;
            var20 = (float) (-var14 + arg6) * var11;
        }
        float var21 = (float) arg0 + var17;
        float var22 = (float) arg1 + var18;
        float var23 = (float) arg7 * var12;
        float var24 = (float) arg7 * var11;
        while (true) {
            if (~arg2 >= ~arg0) {
                if (var21 < (float) arg2) {
                    break;
                }
                if ((float) arg2 > var19 + var21) {
                    var19 = (float) arg2 + -var21;
                }
            } else {
                if ((float) arg2 < var21) {
                    break;
                }
                if (var19 + var21 > (float) arg2) {
                    var19 = (float) arg2 - var21;
                }
            }
            if (arg3 > arg1) {
                if (var22 > (float) arg3) {
                    break;
                }
                if (var20 + var22 > (float) arg3) {
                    var20 = (float) arg3 - var22;
                }
            } else {
                if ((float) arg3 > var22) {
                    break;
                }
                if ((float) arg3 > var20 + var22) {
                    var20 = (float) arg3 - var22;
                }
            }
            if (!this.method225(var19 + var21, var21, var22, true, 0.0F, var20 + var22, 0.0F)) {
                return;
            }
            this.method312(true);
            var21 += var19 + var23;
            var22 += var20 + var24;
            var19 = var15;
            var20 = var16;
        }
        this.method396(-126, true);
        this.method227(0, class388.field5817, 70);
        this.method321(class388.field5817, 0, (byte) -95);
    }

    @OriginalMember(owner = "client!pj", name = "EA", descriptor = "(IIII)V")
    public final void method355(int arg0, int arg1, int arg2, int arg3) {
        ++field514;
        if (!this.field595) {
            throw new RuntimeException("");
        } else {
            this.field637 = arg3;
            this.field654 = arg1;
            this.field599 = arg2;
            this.field660 = arg0;
            if (this.field633) {
                this.field606[3].method1818((byte) 112);
                this.field606[3].method439(-6910);
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "()I")
    public final int method356() {
        ++field456;
        return this.field579 + -2;
    }

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "(B)V")
    public abstract void method357(byte arg0);

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "(B)V")
    public abstract void method358(byte arg0);

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "(I)V")
    public abstract void method359(int arg0);

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "(I)I")
    public final int method360(int arg0) {
        ++field382;
        if (arg0 != 0) {
            this.field634 = 66;
        }
        return this.field660;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method361(Canvas arg0, int arg1, int arg2) {
        ++field395;
        Object var4 = null;
        if (arg0 != null && this.field391 != arg0) {
            if (this.field524.containsKey(arg0)) {
                var4 = this.field524.get(arg0);
            }
        } else {
            var4 = this.field442;
        }
        if (var4 == null) {
            throw new RuntimeException();
        } else {
            this.method340(var4, 5, arg0);
            if (this.field396 == arg0) {
                this.method267(false);
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "(B)V")
    public abstract void method362(byte arg0);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([[IBIZ)Lqn;")
    public abstract class295 method363(int[][] arg0, byte arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "(I)V")
    public abstract void method364(int arg0);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lht;Lht;B)V")
    public final void method365(class393 arg0, class393 arg1, byte arg2) {
        ++field504;
        boolean var4 = false;
        if (this.field673[this.field617] != arg0) {
            this.field673[this.field617] = arg0;
            this.method425(arg2 + 224);
            var4 = true;
        }
        if (this.field625[this.field617] != arg1) {
            this.field625[this.field617] = arg1;
            this.method255(-114);
            var4 = true;
        }
        if (var4) {
            this.field672 &= -30;
        }
        if (arg2 != -122) {
            this.method244((class73) null);
        }
    }

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "(I)V")
    private final void method366(int arg0) {
        ++field416;
        this.field669 = false;
        if (class460.field6667 == this.field605) {
            this.method226(27529);
            this.method230(true);
        }
        if (arg0 != 1464) {
            this.method275(-57, -119, 40, -58, 98, 2, 66, -58, -57, 78, -23, -41, 81);
        }
    }

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "(I)V")
    private final void method367(int arg0) {
        ++field555;
        this.field668 = false;
        this.method375(arg0 + -38);
        if (arg0 != 0) {
            this.field579 = 123;
        }
        if (class290.field4455 == this.field605) {
            this.method230(true);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLjaclib/memory/Buffer;)Ljaclib/memory/Stream;")
    public final Stream method368(byte arg0, Buffer arg1) {
        ++field492;
        if (arg0 != -121) {
            this.method330(-85, (class313) null);
        }
        this.field623.method2575(arg1);
        return this.field623;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lmq;ZII)V")
    public abstract void method369(class592 arg0, boolean arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "()Z")
    public final boolean method370() {
        ++field420;
        return true;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(ZB)V")
    public final void method371(boolean arg0, byte arg1) {
        if (arg1 > -122) {
            this.field583 = true;
        }
        ++field501;
        if (!this.field657 != !arg0) {
            this.field657 = arg0;
            this.method319(true);
        }
    }

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "(I)V")
    public abstract void method372(int arg0);

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "(B)V")
    private final void method373(byte arg0) {
        if (arg0 == 53) {
            ++field535;
            this.field603 = (float) (this.field591 - this.field575);
            this.field589 = (float) (-this.field647 + this.field611);
            this.field587 = (float) (-this.field647 + this.field614);
            this.field666 = (float) (this.field607 - this.field575);
        }
    }

    @OriginalMember(owner = "client!pj", name = "la", descriptor = "()V")
    public final void method374() {
        this.field611 = this.field462;
        ++field394;
        this.field614 = 0;
        this.field607 = this.field378;
        this.field591 = 0;
        if (this.field696) {
            this.field696 = false;
            this.method397(0);
        }
        this.method373((byte) 53);
    }

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "(I)V")
    private final void method375(int arg0) {
        if (!this.field668) {
            float[] var2 = this.field602;
            float var3 = (float) (-this.field575 * this.field634) / (float) this.field648;
            float var4 = (float) ((this.field378 - this.field575) * this.field634) / (float) this.field648;
            float var5 = (float) (this.field647 * this.field634) / (float) this.field659;
            float var6 = (float) ((-this.field462 + this.field647) * this.field634) / (float) this.field659;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field634 * 2.0F;
                var2[10] = this.field656 = (float) this.field581 / (float) (-this.field581 + this.field634);
                var2[2] = 0.0F;
                var2[15] = 0.0F;
                var2[14] = this.field640 = (float) (this.field634 * this.field581) / (float) (this.field634 - this.field581);
                var2[11] = -1.0F;
                var2[1] = 0.0F;
                var2[3] = 0.0F;
                var2[12] = 0.0F;
                var2[7] = 0.0F;
                var2[5] = var7 / (-var6 + var5);
                var2[4] = 0.0F;
                var2[8] = (var3 + var4) / (var4 - var3);
                var2[0] = var7 / (-var3 + var4);
                var2[9] = (var5 + var6) / (var5 - var6);
                var2[6] = 0.0F;
                var2[13] = 0.0F;
            } else {
                var2[8] = 0.0F;
                var2[12] = 0.0F;
                var2[9] = 0.0F;
                var2[6] = 0.0F;
                var2[3] = 0.0F;
                var2[11] = 0.0F;
                var2[7] = 0.0F;
                var2[4] = 0.0F;
                var2[5] = 1.0F;
                var2[10] = 1.0F;
                var2[15] = 1.0F;
                var2[14] = 0.0F;
                var2[0] = 1.0F;
                var2[1] = 0.0F;
                var2[2] = 0.0F;
                var2[13] = 0.0F;
            }
            this.method257(10);
            this.field668 = true;
        }
        if (arg0 <= -37) {
            ++field402;
        }
    }

    @OriginalMember(owner = "client!pj", name = "R", descriptor = "(I)I")
    public final int method376(int arg0) {
        ++field410;
        return arg0 > -107 ? 104 : this.field654;
    }

    @OriginalMember(owner = "client!pj", name = "XA", descriptor = "()I")
    public final int method377() {
        ++field386;
        return this.field581;
    }

    @OriginalMember(owner = "client!pj", name = "S", descriptor = "(I)V")
    public abstract void method378(int arg0);

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "()Z")
    public final boolean method379() {
        ++field534;
        return false;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lmp;I)V")
    public final void method380(class315 arg0, int arg1) {
        this.field631.method2897(this, arg1, arg0, false);
        ++field385;
    }

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "()Z")
    public final boolean method381() {
        ++field437;
        return true;
    }

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "(B)V")
    public final void method382(byte arg0) {
        ++field493;
        Hashtable var2 = new Hashtable();
        int var3 = -84 / ((arg0 - -45) / 62);
        if (this.field524 != null && !this.field524.isEmpty()) {
            Enumeration var4 = this.field524.keys();
            while (var4.hasMoreElements()) {
                Canvas var5 = (Canvas) var4.nextElement();
                var2.put(var5, this.method324(var5, (byte) -100));
            }
        }
        this.field524 = var2;
        this.method245(16);
        this.method252(29977);
        this.method243(-16567);
        this.field631.method2898(this, 786336);
    }

    @OriginalMember(owner = "client!pj", name = "T", descriptor = "(I)I")
    public final int method383(int arg0) {
        ++field482;
        if (arg0 != 1) {
            this.method389(17);
        }
        return this.field599;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)V")
    public final void method384(int arg0, boolean arg1) {
        if (arg1 == !this.field584) {
            this.field584 = arg1;
            this.method358((byte) -21);
            this.field672 &= -8;
        }
        if (arg0 >= -22) {
            this.field583 = false;
        }
        ++field381;
    }

    @OriginalMember(owner = "client!pj", name = "U", descriptor = "(I)V")
    private final void method385(int arg0) {
        ++field447;
        if (arg0 == -8) {
            if (class138.field2162 != this.field605) {
                class19 var2 = this.field605;
                this.field605 = class138.field2162;
                if (!var2.method115(arg0 ^ -8)) {
                    this.method242((byte) -94);
                }
                this.method222(true);
                this.field586 = this.field635;
                this.method230(true);
                this.field672 &= -8;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(FB)V")
    public final void method386(float arg0, byte arg1) {
        int var3 = 5 % ((-35 - arg1) / 58);
        if (this.field596 != arg0) {
            this.field596 = arg0;
            this.method274(5);
        }
        ++field471;
    }

    @OriginalMember(owner = "client!pj", name = "V", descriptor = "(I)V")
    public final void method387(int arg0) {
        if (arg0 > -91) {
            this.method244((class73) null);
        }
        this.method262(106);
        ++field497;
        this.method230(true);
    }

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method388(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field565;
    }

    @OriginalMember(owner = "client!pj", name = "W", descriptor = "(I)Lqn;")
    public final class295 method389(int arg0) {
        ++field470;
        if (arg0 < 68) {
            return null;
        } else {
            return this.field585 == null ? null : this.field585.method773(2835);
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method390(Canvas arg0) {
        ++field539;
        if (this.field391 == arg0) {
            throw new RuntimeException();
        } else if (this.field524.containsKey(arg0)) {
            this.method422((byte) -86, arg0, this.field524.get(arg0));
            this.field524.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([BIZLlw;II)Lrm;")
    public final class90 method391(byte[] arg0, int arg1, boolean arg2, class233 arg3, int arg4, int arg5) {
        ++field490;
        int var7 = 37 / ((56 - arg5) / 62);
        return this.method349(0, -1, arg3, arg4, arg0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "()Z")
    public final boolean method392() {
        ++field532;
        return false;
    }

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "(B)V")
    public final void method393(byte arg0) {
        ++field419;
        Enumeration var2 = this.field524.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method422((byte) -36, var3, this.field524.get(var3));
        }
        this.field678.method697(-18934);
        this.field693.method697(-18934);
        this.field681.method697(-18934);
        this.field691.method1440((byte) 127);
        if (arg0 <= 11) {
            this.field672 = -70;
        }
        this.field675.method1440((byte) 104);
        this.field679.method1440((byte) -87);
        this.field686.method1440((byte) -101);
        this.field684.method1440((byte) 31);
        this.field631.method2892(false);
        this.field694.method697(-18934);
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(IZ)V")
    public final void method394(int arg0, boolean arg1) {
        if (arg1 == !this.field604) {
            this.field604 = arg1;
            this.method276((byte) 69);
            this.field672 &= -32;
        }
        ++field417;
        if (arg0 != 13119) {
            this.method423(25);
        }
    }

    @OriginalMember(owner = "client!pj", name = "X", descriptor = "(I)V")
    public final void method395(int arg0) {
        this.field658 = 0;
        ++field525;
        while (~arg0 < -2) {
            ++this.field658;
            arg0 >>= 1;
        }
        this.field630 = 1 << this.field658;
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(IZ)V")
    public abstract void method396(int arg0, boolean arg1);

    @OriginalMember(owner = "client!pj", name = "Y", descriptor = "(I)V")
    public abstract void method397(int arg0);

    @OriginalMember(owner = "client!pj", name = "Z", descriptor = "(I)Lga;")
    public final class341 method398(int arg0) {
        if (!this.field592) {
            this.field572.method2195(this.field570, this.field547);
            this.field592 = true;
        }
        if (arg0 != 3535) {
            this.method334(23);
        }
        ++field455;
        return this.field572;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILal;Llw;)Z")
    public abstract boolean method399(int arg0, class121 arg1, class233 arg2);

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "()Z")
    public final boolean method400() {
        ++field544;
        return this.field606[3].method438((byte) -102);
    }

    @OriginalMember(owner = "client!pj", name = "ab", descriptor = "(I)V")
    private final void method401(int arg0) {
        if (class460.field6667 == this.field605) {
            float var2 = this.method325(5484);
            this.field547.method2190((byte) 51, var2, 0.0F, var2);
        }
        if (arg0 != 1) {
            this.field644 = -67;
        }
        ++field441;
        this.field592 = false;
        this.method271((byte) -98);
        if (this.field601 != null) {
            this.field601.method440(false);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZZBII)V")
    private final void method402(int arg0, boolean arg1, boolean arg2, byte arg3, int arg4, int arg5) {
        if (arg3 >= -28) {
            this.method317((Canvas) null);
        }
        ++field537;
        boolean var7 = arg2 & this.method400();
        if (!var7 && (~arg0 == -5 || ~arg0 == -9 || ~arg0 == -10)) {
            arg0 = 2;
            arg5 = arg0 != 4 ? 1 : arg4 & 1;
            arg4 = 0;
        }
        if (arg0 != 0 && arg1) {
            arg0 |= Integer.MIN_VALUE;
        }
        if (this.field644 != arg0) {
            if (~this.field644 != -1) {
                this.field606[Integer.MAX_VALUE & this.field644].method442(false);
            }
            if (arg0 == 0) {
                this.field601 = null;
            } else {
                this.field601 = this.field606[Integer.MAX_VALUE & arg0];
                this.field601.method435(arg1, 2048);
                this.field601.method441((byte) 9, arg1);
                this.field601.method443(arg4, 0, arg5);
            }
            this.field609 = arg4;
            this.field627 = arg5;
            this.field644 = arg0;
        } else if (~this.field644 != -1) {
            this.field606[this.field644 & Integer.MAX_VALUE].method441((byte) 9, arg1);
            if (this.field609 != arg4 || this.field627 != arg5) {
                this.field606[Integer.MAX_VALUE & this.field644].method443(arg4, 0, arg5);
                this.field627 = arg5;
                this.field609 = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILri;ZI)V")
    public abstract void method403(int arg0, class342 arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!pj", name = "bb", descriptor = "(I)Lga;")
    public final class341 method404(int arg0) {
        if (arg0 != -1) {
            this.method390((Canvas) null);
        }
        ++field407;
        return this.field570;
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(IB)V")
    public final void method405(int arg0, byte arg1) {
        ++field542;
        if (~arg0 == -2) {
            this.method365(class750.field10454, class750.field10454, (byte) -122);
        } else if (~arg0 == -1) {
            this.method365(class333.field4884, class333.field4884, (byte) -122);
        } else if (arg0 != 2) {
            if (~arg0 != -4) {
                if (arg0 == 4) {
                    this.method365(class570.field8091, class570.field8091, (byte) -122);
                }
            } else {
                this.method365(class200.field3408, class333.field4884, (byte) -122);
            }
        } else {
            this.method365(class107.field1555, class750.field10454, (byte) -122);
        }
        if (arg1 != 121) {
            this.method222(true);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIZ)Lit;")
    public final class34 method406(int arg0, int arg1, boolean arg2) {
        ++field491;
        return new class721(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III[IIIZ)Lrm;")
    public abstract class90 method407(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([BBLlw;III)Luc;")
    public abstract class123 method408(byte[] arg0, byte arg1, class233 arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIF)Lvt;")
    public final class759 method409(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field543;
        return new class91(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!pj", name = "aa", descriptor = "(IIIIII)V")
    public final void method410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method323(3);
        ++field451;
        this.method228(2, arg4);
        this.method321(class327.field4819, 0, (byte) -95);
        this.method227(0, class327.field4819, 70);
        this.method314(arg5, (byte) 21);
        this.field547.method2179((float) arg3, 1.0F, true, (float) arg2);
        this.field547.method671(arg0, arg1, 0);
        this.method309((byte) 108);
        this.method396(-67, false);
        this.method233(false);
        this.method396(-123, true);
        this.method227(0, class388.field5817, 70);
        this.method321(class388.field5817, 0, (byte) -95);
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(IB)V")
    public final void method411(int arg0, byte arg1) {
        if (arg1 > -80) {
            this.method318(false);
        }
        ++field513;
        if (this.field617 != arg0) {
            this.field617 = arg0;
            this.method329((byte) 18);
        }
    }

    @OriginalMember(owner = "client!pj", name = "cb", descriptor = "(I)V")
    public void method412(int arg0) {
        this.field608 = this.field578;
        ++field522;
        if (arg0 != 15) {
            this.field687 = null;
        }
        this.field578 = 0;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZZ)V")
    public final void method413(boolean arg0, boolean arg1) {
        ++field558;
        if (!arg0 == this.field639) {
            this.field639 = arg0;
            this.method358((byte) -21);
        }
        if (!arg1) {
            this.method214(11);
        }
    }

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "()Ltc;")
    public final class73 method414() {
        ++field487;
        return new class341();
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([FIZILlw;III)Lrm;")
    public abstract class90 method415(float[] arg0, int arg1, boolean arg2, int arg3, class233 arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "(IIIIIII)I")
    public final int method416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field541;
        int var8 = 0;
        float var9 = (float) arg2 * this.field568.field5037 + (float) arg0 * this.field568.field5032 + (float) arg1 * this.field568.field5029 + this.field568.field5048;
        float var10 = (float) arg5 * this.field568.field5037 + (float) arg3 * this.field568.field5032 + (float) arg4 * this.field568.field5029 + this.field568.field5048;
        if ((float) this.field634 > var9 && (float) this.field634 > var10) {
            var8 |= 16;
        } else if ((float) this.field581 < var9 && (float) this.field581 < var10) {
            var8 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field568.field5015 + (float) arg0 * this.field568.field5023 + (float) arg1 * this.field568.field5045 + this.field568.field5009) * (float) this.field648 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field568.field5015 + (float) arg3 * this.field568.field5023 + (float) arg4 * this.field568.field5045 + this.field568.field5009) * (float) this.field648 / (float) arg6);
        if (this.field603 > (float) var11 && (float) var12 < this.field603) {
            var8 |= 1;
        } else if ((float) var11 > this.field666 && (float) var12 > this.field666) {
            var8 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field568.field5027 + (float) arg0 * this.field568.field5024 + (float) arg1 * this.field568.field5036 + this.field568.field5001) * (float) this.field659 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field568.field5027 + (float) arg3 * this.field568.field5024 + (float) arg4 * this.field568.field5036 + this.field568.field5001) * (float) this.field659 / (float) arg6);
        if ((float) var13 < this.field587 && (float) var14 < this.field587) {
            var8 |= 4;
        } else if ((float) var13 > this.field589 && this.field589 < (float) var14) {
            var8 |= 8;
        }
        return var8;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Llw;IILal;I)Lrm;")
    public abstract class90 method417(class233 arg0, int arg1, int arg2, class121 arg3, int arg4);

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "(B)V")
    private final void method418(byte arg0) {
        ++field473;
        this.method284((byte) -98);
        if (this.field601 != null) {
            this.field601.method434(arg0 + 121);
        }
        if (arg0 != -122) {
            this.field608 = -40;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class339 method419(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field408;
        return new class63(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lmp;)V")
    public final void method420(class315 arg0) {
        ++field479;
        this.field631.method2897(this, -1, arg0, false);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZIIZ)V")
    public final void method421(boolean arg0, int arg1, int arg2, boolean arg3) {
        ++field489;
        if (~this.field664 != ~arg2 || this.field595 == !this.field633) {
            class90 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = this.field595 ? 3 : 0;
            if (~arg2 > -1) {
                this.method250(92);
            } else {
                var5 = this.field590.method3934(-121, arg2);
                class569 var10 = super.field7764.method1774(94, arg2);
                if (~var10.field8058 == -1 && var10.field8066 == 0) {
                    this.method250(42);
                } else {
                    int var11 = var10.field8067 ? 64 : 128;
                    int var12 = var11 * 50;
                    class341 var13 = this.method269(arg1 ^ 14);
                    var13.method2181((float) (this.field649 % var12 * var10.field8058) / (float) var12, arg1 ^ 14, (float) (this.field649 % var12 * var10.field8066) / (float) var12, 0.0F);
                    this.method342((byte) 127, class673.field9518);
                }
                if (!this.field595) {
                    var7 = var10.field8065;
                    var8 = var10.field8080;
                    var9 = var10.field8079;
                }
                var6 = var10.field8074;
            }
            this.method402(var9, arg3, arg0, (byte) -124, var7, var8);
            if (this.field601 != null) {
                this.field601.method437(var6, false, var5);
            } else {
                this.method215(8, var5);
                this.method405(var6, (byte) 121);
            }
            this.field633 = this.field595;
            this.field664 = arg2;
        }
        this.field672 &= -8;
        if (arg1 != 15) {
            this.method234(12);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method422(byte arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public final void method423(int arg0) {
        ++field445;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lpia;[Lgu;Z)Lda;")
    public final class400 method424(class54 arg0, class726[] arg1, boolean arg2) {
        ++field411;
        return new class623(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Lla;II)V")
    public class38(Canvas arg0, Object arg1, class267 arg2, class422 arg3, int arg4, int arg5) {
        super(arg2);
        try {
            this.field442 = this.field520 = arg1;
            this.field577 = arg4;
            this.field418 = arg3;
            this.field396 = this.field391 = arg0;
            Dimension var7 = arg0.getSize();
            this.field462 = this.field496 = var7.height;
            this.field378 = this.field440 = var7.width;
            this.field628 = arg5;
            class614.method3506(true, (byte) 80, false);
            if (super.field7764 == null) {
                this.field472 = new NativeInterface(0, this.field628);
                this.field590 = null;
            } else {
                this.field590 = new class710(this, super.field7764);
                this.field472 = new NativeInterface(super.field7764.method1773(true), this.field628);
                for (int var8 = 0; super.field7764.method1773(true) > var8; ++var8) {
                    class569 var9 = super.field7764.method1774(93, var8);
                    if (var9 != null) {
                        this.field472.initTextureMetrics(var8, var9.field8069, var9.field8077);
                    }
                }
            }
        } catch (Throwable var11) {
            var11.printStackTrace();
            this.method3190((byte) 83);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!pj", name = "db", descriptor = "(I)V")
    public abstract void method425(int arg0);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZII)Ljaclib/memory/heap/NativeHeapBuffer;")
    public final NativeHeapBuffer method426(boolean arg0, int arg1, int arg2) {
        if (arg2 < 15) {
            this.field617 = 36;
        }
        ++field552;
        return this.field530.method2591(arg1, arg0);
    }

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "()V")
    public final void method427() {
        if (this.field590 != null) {
            this.field590.method3931(32);
        }
        ++field444;
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(IZ)Loq;")
    public abstract class743 method428(int arg0, boolean arg1);

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "(B)I")
    public final int method429(byte arg0) {
        if (arg0 < 108) {
            this.method302(50);
        }
        ++field564;
        return this.field637;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILlw;Lal;)Z")
    public abstract boolean method430(int arg0, class233 arg1, class121 arg2);

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "(B)Lga;")
    public final class341 method431(byte arg0) {
        int var2 = 75 / ((-40 - arg0) / 61);
        ++field400;
        return this.field547;
    }

    @OriginalMember(owner = "client!pj", name = "eb", descriptor = "(I)V")
    public final void method432(int arg0) {
        this.field547.method677();
        ++field434;
        this.field551 = true;
        if (arg0 != 5) {
            this.method297(59, -58, -70, 97, 38, -72);
        }
        this.method401(1);
    }
}
