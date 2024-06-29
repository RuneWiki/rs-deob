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

@OriginalClass("client!ch")
public abstract class class38 extends class543 {

    @OriginalMember(owner = "client!ch", name = "Kb", descriptor = "Lmr;")
    private class611 field411 = new class611();

    @OriginalMember(owner = "client!ch", name = "Wd", descriptor = "Z")
    public boolean field527 = true;

    @OriginalMember(owner = "client!ch", name = "be", descriptor = "Lbt;")
    public class417 field532 = new class417();

    @OriginalMember(owner = "client!ch", name = "ce", descriptor = "Lbt;")
    public class417 field533 = new class417();

    @OriginalMember(owner = "client!ch", name = "de", descriptor = "Lbt;")
    public class417 field534 = new class417();

    @OriginalMember(owner = "client!ch", name = "ee", descriptor = "Lbt;")
    public class417 field535 = new class417();

    @OriginalMember(owner = "client!ch", name = "fe", descriptor = "Lbt;")
    private class417 field536 = new class417();

    @OriginalMember(owner = "client!ch", name = "ge", descriptor = "Lbt;")
    private class417 field537 = new class417();

    @OriginalMember(owner = "client!ch", name = "ne", descriptor = "F")
    private float field544 = 1.0F;

    @OriginalMember(owner = "client!ch", name = "Be", descriptor = "Z")
    private boolean field558 = false;

    @OriginalMember(owner = "client!ch", name = "je", descriptor = "Z")
    public boolean field540 = true;

    @OriginalMember(owner = "client!ch", name = "He", descriptor = "I")
    public int field564 = 128;

    @OriginalMember(owner = "client!ch", name = "Oe", descriptor = "I")
    public int field571 = 0;

    @OriginalMember(owner = "client!ch", name = "ue", descriptor = "F")
    public float field551 = 1.0F;

    @OriginalMember(owner = "client!ch", name = "Ae", descriptor = "I")
    public int field557 = 512;

    @OriginalMember(owner = "client!ch", name = "De", descriptor = "Z")
    public boolean field560 = true;

    @OriginalMember(owner = "client!ch", name = "Ke", descriptor = "I")
    public int field567 = 0;

    @OriginalMember(owner = "client!ch", name = "ve", descriptor = "F")
    public float field552 = 1.0F;

    @OriginalMember(owner = "client!ch", name = "se", descriptor = "F")
    public float field549 = 1.0F;

    @OriginalMember(owner = "client!ch", name = "hf", descriptor = "I")
    public int field590 = 0;

    @OriginalMember(owner = "client!ch", name = "Te", descriptor = "Z")
    public boolean field576 = true;

    @OriginalMember(owner = "client!ch", name = "oe", descriptor = "I")
    private int field545 = -1;

    @OriginalMember(owner = "client!ch", name = "qf", descriptor = "I")
    public int field598 = 512;

    @OriginalMember(owner = "client!ch", name = "Re", descriptor = "Z")
    public boolean field574 = false;

    @OriginalMember(owner = "client!ch", name = "jf", descriptor = "[F")
    private float[] field591 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!ch", name = "ef", descriptor = "I")
    private int field587 = 0;

    @OriginalMember(owner = "client!ch", name = "Ie", descriptor = "Lwg;")
    public class613 field565 = class704.field9922;

    @OriginalMember(owner = "client!ch", name = "Le", descriptor = "Z")
    public boolean field568 = false;

    @OriginalMember(owner = "client!ch", name = "gf", descriptor = "Z")
    public boolean field589 = true;

    @OriginalMember(owner = "client!ch", name = "Ve", descriptor = "F")
    public float field578 = 3584.0F;

    @OriginalMember(owner = "client!ch", name = "zf", descriptor = "Z")
    private boolean field607 = false;

    @OriginalMember(owner = "client!ch", name = "we", descriptor = "Z")
    private boolean field553 = false;

    @OriginalMember(owner = "client!ch", name = "ff", descriptor = "I")
    public int field588 = 3;

    @OriginalMember(owner = "client!ch", name = "Je", descriptor = "[F")
    private float[] field566 = new float[16];

    @OriginalMember(owner = "client!ch", name = "lf", descriptor = "I")
    private int field593 = 0;

    @OriginalMember(owner = "client!ch", name = "Gf", descriptor = "Z")
    public boolean field614 = false;

    @OriginalMember(owner = "client!ch", name = "he", descriptor = "I")
    public int field538 = 50;

    @OriginalMember(owner = "client!ch", name = "of", descriptor = "I")
    public int field596 = 8;

    @OriginalMember(owner = "client!ch", name = "Ff", descriptor = "I")
    public int field613 = 0;

    @OriginalMember(owner = "client!ch", name = "Bf", descriptor = "[F")
    public float[] field609 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!ch", name = "af", descriptor = "I")
    public int field583 = 0;

    @OriginalMember(owner = "client!ch", name = "Ef", descriptor = "I")
    public int field612 = 0;

    @OriginalMember(owner = "client!ch", name = "te", descriptor = "Lae;")
    public class351 field550 = class143.field1949;

    @OriginalMember(owner = "client!ch", name = "re", descriptor = "Z")
    private boolean field548 = false;

    @OriginalMember(owner = "client!ch", name = "Ue", descriptor = "[F")
    private float[] field577 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!ch", name = "tf", descriptor = "I")
    public int field601 = 0;

    @OriginalMember(owner = "client!ch", name = "Pf", descriptor = "I")
    private int field623 = -1;

    @OriginalMember(owner = "client!ch", name = "Nf", descriptor = "I")
    public int field621 = -1;

    @OriginalMember(owner = "client!ch", name = "Fe", descriptor = "I")
    public int field562 = 3584;

    @OriginalMember(owner = "client!ch", name = "Xe", descriptor = "Z")
    private boolean field580 = false;

    @OriginalMember(owner = "client!ch", name = "kf", descriptor = "[Lsha;")
    private class545[] field592 = new class545[10];

    @OriginalMember(owner = "client!ch", name = "Qf", descriptor = "I")
    private int field624 = 0;

    @OriginalMember(owner = "client!ch", name = "Df", descriptor = "[F")
    private float[] field611 = new float[16];

    @OriginalMember(owner = "client!ch", name = "mf", descriptor = "F")
    public float field594 = -1.0F;

    @OriginalMember(owner = "client!ch", name = "rf", descriptor = "F")
    public float field599 = -1.0F;

    @OriginalMember(owner = "client!ch", name = "ke", descriptor = "F")
    public float field541 = 1.0F;

    @OriginalMember(owner = "client!ch", name = "Sf", descriptor = "I")
    private int field626 = -1;

    @OriginalMember(owner = "client!ch", name = "Rf", descriptor = "[F")
    public float[] field625 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!ch", name = "If", descriptor = "I")
    public int field616 = 0;

    @OriginalMember(owner = "client!ch", name = "Se", descriptor = "I")
    public int field575 = -1;

    @OriginalMember(owner = "client!ch", name = "yf", descriptor = "[F")
    private float[] field606 = new float[16];

    @OriginalMember(owner = "client!ch", name = "Yf", descriptor = "I")
    private int field632 = 0;

    @OriginalMember(owner = "client!ch", name = "Xf", descriptor = "[F")
    public float[] field631 = this.field591;

    @OriginalMember(owner = "client!ch", name = "pf", descriptor = "Z")
    public boolean field597 = false;

    @OriginalMember(owner = "client!ch", name = "Of", descriptor = "I")
    public int field622 = 0;

    @OriginalMember(owner = "client!ch", name = "Pe", descriptor = "I")
    public int field572 = 0;

    @OriginalMember(owner = "client!ch", name = "ag", descriptor = "I")
    private int field634 = 16777215;

    @OriginalMember(owner = "client!ch", name = "Uf", descriptor = "I")
    private int field628 = 1;

    @OriginalMember(owner = "client!ch", name = "Mf", descriptor = "[F")
    private float[] field620 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!ch", name = "dg", descriptor = "F")
    public float field637 = 3584.0F;

    @OriginalMember(owner = "client!ch", name = "cg", descriptor = "Z")
    private boolean field636 = false;

    @OriginalMember(owner = "client!ch", name = "Tf", descriptor = "Z")
    public boolean field627 = true;

    @OriginalMember(owner = "client!ch", name = "Ne", descriptor = "Ljaclib/memory/Stream;")
    private Stream field570 = new Stream();

    @OriginalMember(owner = "client!ch", name = "jg", descriptor = "Lbt;")
    private class417 field643 = new class417();

    @OriginalMember(owner = "client!ch", name = "Xc", descriptor = "Lla;")
    public class423 field476;

    @OriginalMember(owner = "client!ch", name = "Wf", descriptor = "I")
    public int field630;

    @OriginalMember(owner = "client!ch", name = "fd", descriptor = "Ljava/lang/Object;")
    public Object field484;

    @OriginalMember(owner = "client!ch", name = "hc", descriptor = "Ljava/lang/Object;")
    private Object field434;

    @OriginalMember(owner = "client!ch", name = "rd", descriptor = "Ljava/awt/Canvas;")
    public Canvas field496;

    @OriginalMember(owner = "client!ch", name = "Yb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field425;

    @OriginalMember(owner = "client!ch", name = "Vc", descriptor = "I")
    private int field474;

    @OriginalMember(owner = "client!ch", name = "hd", descriptor = "I")
    public int field486;

    @OriginalMember(owner = "client!ch", name = "xf", descriptor = "I")
    public int field605;

    @OriginalMember(owner = "client!ch", name = "Dc", descriptor = "I")
    private int field456;

    @OriginalMember(owner = "client!ch", name = "jc", descriptor = "I")
    public int field436;

    @OriginalMember(owner = "client!ch", name = "Cf", descriptor = "Lek;")
    private class597 field610;

    @OriginalMember(owner = "client!ch", name = "ec", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field431;

    @OriginalMember(owner = "client!ch", name = "Zb", descriptor = "Lwg;")
    public static class613 field426 = new class613();

    @OriginalMember(owner = "client!ch", name = "vd", descriptor = "[I")
    public static int[] field500 = new int[2048];

    @OriginalMember(owner = "client!ch", name = "id", descriptor = "D")
    public static double field487;

    @OriginalMember(owner = "client!ch", name = "Ed", descriptor = "F")
    public static float field509;

    @OriginalMember(owner = "client!ch", name = "me", descriptor = "F")
    public float field543;

    @OriginalMember(owner = "client!ch", name = "pe", descriptor = "F")
    public float field546;

    @OriginalMember(owner = "client!ch", name = "xe", descriptor = "F")
    public float field554;

    @OriginalMember(owner = "client!ch", name = "ze", descriptor = "F")
    private float field556;

    @OriginalMember(owner = "client!ch", name = "Ge", descriptor = "F")
    public float field563;

    @OriginalMember(owner = "client!ch", name = "vf", descriptor = "F")
    public float field603;

    @OriginalMember(owner = "client!ch", name = "Jf", descriptor = "F")
    public float field617;

    @OriginalMember(owner = "client!ch", name = "eg", descriptor = "F")
    private float field638;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!ch", name = "V", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!ch", name = "W", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!ch", name = "X", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!ch", name = "Z", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!ch", name = "ab", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!ch", name = "bb", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!ch", name = "cb", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!ch", name = "db", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!ch", name = "eb", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!ch", name = "fb", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!ch", name = "gb", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!ch", name = "hb", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!ch", name = "ib", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!ch", name = "jb", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!ch", name = "kb", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!ch", name = "mb", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!ch", name = "nb", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!ch", name = "ob", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!ch", name = "pb", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!ch", name = "qb", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!ch", name = "rb", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!ch", name = "sb", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!ch", name = "tb", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!ch", name = "ub", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!ch", name = "vb", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!ch", name = "wb", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!ch", name = "xb", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!ch", name = "yb", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!ch", name = "zb", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!ch", name = "Ab", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!ch", name = "Bb", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!ch", name = "Cb", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!ch", name = "Db", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!ch", name = "Eb", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!ch", name = "Fb", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!ch", name = "Gb", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!ch", name = "Hb", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!ch", name = "Ib", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!ch", name = "Jb", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!ch", name = "Lb", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!ch", name = "Mb", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!ch", name = "Nb", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!ch", name = "Ob", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!ch", name = "Pb", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!ch", name = "Qb", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!ch", name = "Rb", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!ch", name = "Sb", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!ch", name = "Tb", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!ch", name = "Ub", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!ch", name = "Vb", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!ch", name = "Wb", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!ch", name = "Xb", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!ch", name = "ac", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!ch", name = "bc", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!ch", name = "cc", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!ch", name = "dc", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!ch", name = "fc", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!ch", name = "gc", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!ch", name = "ic", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!ch", name = "kc", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!ch", name = "mc", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!ch", name = "oc", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!ch", name = "pc", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!ch", name = "qc", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!ch", name = "rc", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!ch", name = "sc", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!ch", name = "tc", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!ch", name = "uc", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!ch", name = "vc", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!ch", name = "wc", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!ch", name = "xc", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!ch", name = "yc", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!ch", name = "zc", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!ch", name = "Ac", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!ch", name = "Bc", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!ch", name = "Cc", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!ch", name = "Ec", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!ch", name = "Fc", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!ch", name = "Gc", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!ch", name = "Hc", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!ch", name = "Ic", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!ch", name = "Jc", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!ch", name = "Kc", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!ch", name = "Lc", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!ch", name = "Mc", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!ch", name = "Nc", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!ch", name = "Oc", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!ch", name = "Pc", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!ch", name = "Qc", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!ch", name = "Rc", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!ch", name = "Sc", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!ch", name = "Tc", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!ch", name = "Uc", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!ch", name = "Wc", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!ch", name = "Yc", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!ch", name = "Zc", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!ch", name = "ad", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!ch", name = "bd", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!ch", name = "cd", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!ch", name = "dd", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!ch", name = "ed", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!ch", name = "gd", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!ch", name = "jd", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!ch", name = "kd", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!ch", name = "ld", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!ch", name = "md", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!ch", name = "nd", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!ch", name = "od", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!ch", name = "pd", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!ch", name = "qd", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!ch", name = "sd", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!ch", name = "td", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!ch", name = "ud", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!ch", name = "wd", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!ch", name = "xd", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!ch", name = "yd", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!ch", name = "zd", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!ch", name = "Ad", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!ch", name = "Bd", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!ch", name = "Cd", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!ch", name = "Dd", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!ch", name = "Fd", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!ch", name = "Gd", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!ch", name = "Hd", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!ch", name = "Id", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!ch", name = "Jd", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!ch", name = "Kd", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!ch", name = "Ld", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!ch", name = "Md", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!ch", name = "Nd", descriptor = "I")
    public int field518;

    @OriginalMember(owner = "client!ch", name = "Od", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!ch", name = "Pd", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!ch", name = "Qd", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!ch", name = "Rd", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!ch", name = "Sd", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!ch", name = "Td", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!ch", name = "Ud", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!ch", name = "Vd", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!ch", name = "Xd", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!ch", name = "Yd", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!ch", name = "Zd", descriptor = "I")
    public int field530;

    @OriginalMember(owner = "client!ch", name = "ae", descriptor = "I")
    public int field531;

    @OriginalMember(owner = "client!ch", name = "ie", descriptor = "I")
    public int field539;

    @OriginalMember(owner = "client!ch", name = "ye", descriptor = "I")
    public int field555;

    @OriginalMember(owner = "client!ch", name = "Ee", descriptor = "I")
    private int field561;

    @OriginalMember(owner = "client!ch", name = "Ye", descriptor = "I")
    public int field581;

    @OriginalMember(owner = "client!ch", name = "cf", descriptor = "I")
    public int field585;

    @OriginalMember(owner = "client!ch", name = "Af", descriptor = "I")
    public int field608;

    @OriginalMember(owner = "client!ch", name = "Kf", descriptor = "I")
    private int field618;

    @OriginalMember(owner = "client!ch", name = "Lf", descriptor = "I")
    public int field619;

    @OriginalMember(owner = "client!ch", name = "Zf", descriptor = "I")
    public int field633;

    @OriginalMember(owner = "client!ch", name = "bg", descriptor = "I")
    public int field635;

    @OriginalMember(owner = "client!ch", name = "Cg", descriptor = "I")
    private int field662;

    @OriginalMember(owner = "client!ch", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!ch", name = "qe", descriptor = "Lec;")
    public class101 field547;

    @OriginalMember(owner = "client!ch", name = "hg", descriptor = "Llu;")
    public class192 field641;

    @OriginalMember(owner = "client!ch", name = "ig", descriptor = "Llu;")
    public class192 field642;

    @OriginalMember(owner = "client!ch", name = "mg", descriptor = "Llu;")
    public class192 field646;

    @OriginalMember(owner = "client!ch", name = "og", descriptor = "Llu;")
    public class192 field648;

    @OriginalMember(owner = "client!ch", name = "pg", descriptor = "Llu;")
    public class192 field649;

    @OriginalMember(owner = "client!ch", name = "qg", descriptor = "Llu;")
    public class192 field650;

    @OriginalMember(owner = "client!ch", name = "sg", descriptor = "Llu;")
    public class192 field652;

    @OriginalMember(owner = "client!ch", name = "ug", descriptor = "Llu;")
    public class192 field654;

    @OriginalMember(owner = "client!ch", name = "vg", descriptor = "Llu;")
    public class192 field655;

    @OriginalMember(owner = "client!ch", name = "wg", descriptor = "Llu;")
    public class192 field656;

    @OriginalMember(owner = "client!ch", name = "gg", descriptor = "Lrr;")
    private class33 field640;

    @OriginalMember(owner = "client!ch", name = "ng", descriptor = "Lfg;")
    private class436 field647;

    @OriginalMember(owner = "client!ch", name = "tg", descriptor = "Lfg;")
    private class436 field653;

    @OriginalMember(owner = "client!ch", name = "yg", descriptor = "Lfg;")
    private class436 field658;

    @OriginalMember(owner = "client!ch", name = "fg", descriptor = "Leu;")
    private class448 field639;

    @OriginalMember(owner = "client!ch", name = "kg", descriptor = "Leu;")
    public class448 field644;

    @OriginalMember(owner = "client!ch", name = "lg", descriptor = "Leu;")
    public class448 field645;

    @OriginalMember(owner = "client!ch", name = "rg", descriptor = "Leu;")
    public class448 field651;

    @OriginalMember(owner = "client!ch", name = "xg", descriptor = "Leu;")
    private class448 field657;

    @OriginalMember(owner = "client!ch", name = "zg", descriptor = "Leu;")
    public class448 field659;

    @OriginalMember(owner = "client!ch", name = "Ag", descriptor = "Leu;")
    private class448 field660;

    @OriginalMember(owner = "client!ch", name = "Me", descriptor = "Lbn;")
    private class496 field569;

    @OriginalMember(owner = "client!ch", name = "Ze", descriptor = "Lsha;")
    private class545 field582;

    @OriginalMember(owner = "client!ch", name = "lb", descriptor = "Lur;")
    public class617 field386;

    @OriginalMember(owner = "client!ch", name = "df", descriptor = "Lub;")
    private class81 field586;

    @OriginalMember(owner = "client!ch", name = "lc", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field438;

    @OriginalMember(owner = "client!ch", name = "Y", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field373;

    @OriginalMember(owner = "client!ch", name = "nc", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field440;

    @OriginalMember(owner = "client!ch", name = "le", descriptor = "Z")
    public boolean field542;

    @OriginalMember(owner = "client!ch", name = "We", descriptor = "Z")
    public boolean field579;

    @OriginalMember(owner = "client!ch", name = "sf", descriptor = "Z")
    public boolean field600;

    @OriginalMember(owner = "client!ch", name = "uf", descriptor = "Z")
    public boolean field602;

    @OriginalMember(owner = "client!ch", name = "Hf", descriptor = "Z")
    public boolean field615;

    @OriginalMember(owner = "client!ch", name = "Bg", descriptor = "Z")
    public boolean field661;

    @OriginalMember(owner = "client!ch", name = "wf", descriptor = "[Lec;")
    private class101[] field604;

    @OriginalMember(owner = "client!ch", name = "nf", descriptor = "[Luia;")
    public class272[] field595;

    @OriginalMember(owner = "client!ch", name = "Qe", descriptor = "[Lwh;")
    public class40[] field573;

    @OriginalMember(owner = "client!ch", name = "bf", descriptor = "[Lbt;")
    public class417[] field584;

    @OriginalMember(owner = "client!ch", name = "Ce", descriptor = "[Lwk;")
    public class431[] field559;

    @OriginalMember(owner = "client!ch", name = "Vf", descriptor = "[Lwk;")
    public class431[] field629;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
    public final void method194(byte arg0) {
        ++field369;
        if (arg0 != -99) {
            this.field563 = 0.35912466F;
        }
        if (class704.field9922 != this.field565) {
            class613 var2 = this.field565;
            this.field565 = class704.field9922;
            if (var2.method3570(120)) {
                this.method401(120);
            }
            this.field618 &= -32;
            this.field631 = this.field591;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "()V")
    public void method195() {
        if (!this.field636) {
            for (class430 var1 = this.field411.method3565(-25); var1 != null; var1 = this.field411.method3561((byte) 91)) {
                ((class376) var1).method2334(-70);
            }
            Enumeration var2 = this.field440.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method392(var3, -32355, this.field440.get(var3));
            }
            class512.method3110(false, false, true);
            this.field431.release();
            this.field636 = true;
        }
        ++field458;
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(Z)V")
    public abstract void method196(boolean arg0);

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "(II)V")
    public abstract void method197(int arg0, int arg1);

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)I")
    public final int method198(int arg0) {
        ++field515;
        if (arg0 < 82) {
            field509 = -0.15113918F;
        }
        return this.field613;
    }

    @OriginalMember(owner = "client!ch", name = "za", descriptor = "(IIIII)V")
    public final void method199(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method294(-29513);
        ++field433;
        this.method213(arg3, 3);
        this.method230(class231.field3462, 0, 20);
        this.method242((byte) -116, class231.field3462, 0);
        this.method355(arg4, (byte) -115);
        this.field532.method2522((float) arg2, 1.0F, 125, (float) arg2);
        this.field532.method849(arg0, arg1, 0);
        this.method384((byte) 19);
        this.method240(true, false);
        this.method405(this.field653, 0, (byte) 11);
        this.method265(this.field660, (byte) -116);
        this.method399(class575.field8272, 256, 0, (byte) -52);
        this.method240(true, true);
        this.method242((byte) -113, class234.field3509, 0);
        this.method230(class234.field3509, 0, 108);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BZ)V")
    public final void method200(byte arg0, boolean arg1) {
        if (arg0 < 106) {
            this.field642 = null;
        }
        ++field363;
        if (this.field614 != arg1) {
            this.field614 = arg1;
            this.method391(0);
        }
    }

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "(I)Lbt;")
    public final class417 method201(int arg0) {
        if (arg0 < 35) {
            this.method279(-37);
        }
        ++field483;
        return this.field536;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lffa;Z)Ltd;")
    public final class515 method202(class676 arg0, boolean arg1) {
        ++field384;
        class515 var9;
        if (~arg0.field9614 != -1 && ~arg0.field9618 != -1) {
            int[] var3 = new int[arg0.field9618 * arg0.field9614];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field9616 != null) {
                for (int var6 = 0; arg0.field9618 > var6; ++var6) {
                    for (int var7 = 0; var7 < arg0.field9614; ++var7) {
                        var3[var5++] = class430.method2658(arg0.field9616[var4] << 24, arg0.field9615[class368.method2314(arg0.field9612[var4], 255)]);
                        ++var4;
                    }
                }
            } else {
                for (int var8 = 0; ~var8 > ~arg0.field9618; ++var8) {
                    for (int var10 = 0; arg0.field9614 > var10; ++var10) {
                        int var11 = arg0.field9615[arg0.field9612[var4++] & 255];
                        var3[var5++] = var11 != 0 ? class430.method2658(-16777216, var11) : 0;
                    }
                }
            }
            var9 = this.method3265(var3, arg0.field9618, arg0.field9614, arg0.field9614, 0, (byte) 50);
        } else {
            var9 = this.method3265(new int[1], 1, 1, 1, 0, (byte) 50);
        }
        var9.method783(arg0.field9613, arg0.field9610, arg0.field9617, arg0.field9611);
        return var9;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)V")
    public abstract void method203(byte arg0);

    @OriginalMember(owner = "client!ch", name = "pa", descriptor = "()V")
    public final void method204() {
        ++field427;
        this.field602 = false;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)Lza;")
    public final class254 method205(int arg0) {
        ++field375;
        class376 var2 = new class376(arg0);
        this.field411.method3559(var2, (byte) 12);
        return var2;
    }

    @OriginalMember(owner = "client!ch", name = "EA", descriptor = "(IIII)V")
    public final void method206(int arg0, int arg1, int arg2, int arg3) {
        ++field399;
        if (!this.field602) {
            throw new RuntimeException("");
        } else {
            this.field561 = arg0;
            this.field545 = arg2;
            this.field593 = arg3;
            this.field623 = arg1;
            if (this.field607) {
                this.field592[3].method456(0);
                this.field592[3].method453(0);
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "()Z")
    public final boolean method207() {
        ++field444;
        return true;
    }

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "(II)V")
    public final void method208(int arg0, int arg1) {
        ++field408;
        if (~this.field613 != ~arg1) {
            this.field613 = arg1;
            this.method278(0);
        }
        if (arg0 != 8) {
            this.method326(-67, (Canvas) null, (Object) null);
        }
    }

    @OriginalMember(owner = "client!ch", name = "ra", descriptor = "(IIII)V")
    public final void method209(int arg0, int arg1, int arg2, int arg3) {
        ++field471;
        this.field561 = arg0;
        this.field602 = true;
        this.field623 = arg1;
        this.field545 = arg2;
        this.field593 = arg3;
    }

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "(Z)V")
    public abstract void method210(boolean arg0);

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "()Z")
    public final boolean method211() {
        ++field381;
        return false;
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(B)V")
    private final void method212(byte arg0) {
        this.field611[14] = this.field556;
        ++field485;
        int var2 = 39 / ((arg0 - -11) / 51);
        this.field611[10] = this.field638;
        this.field637 = (this.field611[14] - (float) this.field562) / this.field611[10];
    }

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "(II)V")
    public final void method213(int arg0, int arg1) {
        if (arg1 == 3) {
            ++field415;
            if (this.field555 != arg0) {
                this.field555 = arg0;
                this.method196(false);
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Leea;)V")
    public final void method214(class458 arg0) {
        this.field569.method3015(-32747, -1, arg0, this);
        ++field404;
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(B)V")
    private final void method215(byte arg0) {
        if (arg0 > -50) {
            this.method200((byte) -99, false);
        }
        ++field413;
        this.field548 = false;
        if (class757.field10544 == this.field565) {
            this.method302((byte) 21);
            this.method352(true);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Leea;I)V")
    public final void method216(class458 arg0, int arg1) {
        this.field569.method3015(-32747, arg1, arg0, this);
        ++field403;
    }

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "()Z")
    public final boolean method217() {
        ++field420;
        return this.field542;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
    public abstract Object method218(Canvas arg0, int arg1);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II[I[I)Laa;")
    public final class569 method219(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field529;
        return class544.method3274(arg2, arg0, 0, arg1, arg3, this);
    }

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "(B)I")
    public final int method220(byte arg0) {
        if (arg0 != 45) {
            this.field537 = null;
        }
        ++field424;
        return this.field593;
    }

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "(B)V")
    private final void method221(byte arg0) {
        this.method263((byte) 58);
        ++field398;
        if (this.field582 != null) {
            this.field582.method1741(12);
        }
        if (arg0 != -95) {
            this.field570 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field432;
        float var10 = (float) arg2 - (float) arg0;
        float var11 = (float) (-arg1) + (float) arg3;
        float var12;
        if (var10 == 0.0F && var11 == 0.0F) {
            var12 = 1.0F;
        } else {
            float var13 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            var12 = var10 * var13;
            var11 *= var13;
        }
        this.method294(-29513);
        this.method213(arg4, 3);
        this.method230(class231.field3462, 0, 100);
        this.method242((byte) -116, class231.field3462, 0);
        this.method355(arg5, (byte) -12);
        this.method289(false);
        this.method240(true, false);
        int var14 = arg8 % (arg6 + arg7);
        float var15 = (float) arg6 * var12;
        float var16 = (float) arg6 * var11;
        float var17 = 0.0F;
        float var18 = 0.0F;
        float var19 = var15;
        float var20 = var16;
        if (~arg6 <= ~var14) {
            var20 = (float) (-var14 + arg6) * var11;
            var19 = (float) (arg6 - var14) * var12;
        } else {
            var18 = (float) (arg7 - var14 + arg6) * var11;
            var17 = (float) (arg6 + arg7 + -var14) * var12;
        }
        float var21 = (float) arg0 + var17;
        float var22 = (float) arg1 + var18;
        float var23 = (float) arg7 * var12;
        float var24 = (float) arg7 * var11;
        while (true) {
            if (~arg0 <= ~arg2) {
                if (var21 < (float) arg2) {
                    break;
                }
                if (var19 + var21 < (float) arg2) {
                    var19 = (float) arg2 - var21;
                }
            } else {
                if (var21 > (float) arg2) {
                    break;
                }
                if ((float) arg2 < var19 + var21) {
                    var19 = (float) arg2 - var21;
                }
            }
            if (arg3 > arg1) {
                if ((float) arg3 < var22) {
                    break;
                }
                if ((float) arg3 < var20 + var22) {
                    var20 = (float) arg3 + -var22;
                }
            } else {
                if (var22 < (float) arg3) {
                    break;
                }
                if (var20 + var22 < (float) arg3) {
                    var20 = (float) arg3 + -var22;
                }
            }
            if (!this.method287(0.0F, var22, var21, 0.0F, var20 + var22, var19 + var21, 26400)) {
                return;
            }
            var21 += var19 + var23;
            this.method370(32563);
            var22 += var20 + var24;
            var19 = var15;
            var20 = var16;
        }
        this.method240(true, true);
        this.method242((byte) -112, class234.field3509, 0);
        this.method230(class234.field3509, 0, 120);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZZZI)V")
    public final void method223(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        if (~this.field626 != ~arg3 || this.field602 == !this.field607) {
            class60 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = !this.field602 ? 0 : 3;
            if (~arg3 > -1) {
                this.method389((byte) -2);
            } else {
                var5 = this.field610.method3494(arg3, 5);
                class679 var10 = super.field7881.method962(arg3, 2904);
                if (~var10.field9638 == -1 && var10.field9640 == 0) {
                    this.method389((byte) -2);
                } else {
                    int var11 = !var10.field9636 ? 128 : 64;
                    int var12 = var11 * 50;
                    class417 var13 = this.method381((byte) 42);
                    var13.method2521(0.0F, (byte) 106, (float) (this.field585 % var12 * var10.field9638) / (float) var12, (float) (this.field585 % var12 * var10.field9640) / (float) var12);
                    this.method238(126, class549.field7982);
                }
                var6 = var10.field9649;
                if (!this.field602) {
                    var8 = var10.field9645;
                    var7 = var10.field9646;
                    var9 = var10.field9648;
                }
            }
            this.method231(var9, var8, arg0, (byte) -120, var7, arg1);
            if (this.field582 != null) {
                this.field582.method455(2, var6, var5);
            } else {
                this.method264(var5, -2);
                this.method411(17024, var6);
            }
            this.field607 = this.field602;
            this.field626 = arg3;
        }
        ++field445;
        this.field618 &= -8;
        if (arg2) {
            this.field575 = -47;
        }
    }

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "(I)V")
    public final void method224(int arg0) {
        ++field479;
        this.method194((byte) -99);
        this.method352(true);
        if (arg0 != -26906) {
            this.field609 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI[[IZ)Lau;")
    public abstract class245 method225(byte arg0, int arg1, int[][] arg2, boolean arg3);

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "(Z)V")
    private final void method226(boolean arg0) {
        if (!arg0) {
            ++field400;
            if (class757.field10544 != this.field565) {
                class613 var2 = this.field565;
                this.field565 = class757.field10544;
                if (var2.method3570(112)) {
                    this.method401(123);
                }
                this.method302((byte) 21);
                this.field631 = this.field606;
                this.method352(true);
                this.field618 &= -25;
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "XA", descriptor = "()I")
    public final int method227() {
        ++field465;
        return this.field562;
    }

    @OriginalMember(owner = "client!ch", name = "JA", descriptor = "(IIIIII)I")
    public final int method228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field366;
        int var7 = 0;
        float var8 = (float) arg2 * this.field533.field5961 + (float) arg0 * this.field533.field5939 + (float) arg1 * this.field533.field5968 + this.field533.field5945;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field533.field5961 + (float) arg3 * this.field533.field5939 + (float) arg4 * this.field533.field5968 + this.field533.field5945;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field538 && var9 < (float) this.field538) {
            var7 |= 16;
        } else if ((float) this.field562 < var8 && var9 > (float) this.field562) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field533.field5927 + (float) arg0 * this.field533.field5948 + (float) arg1 * this.field533.field5923 + this.field533.field5950) * (float) this.field598 / var8);
        int var11 = (int) (((float) arg5 * this.field533.field5927 + (float) arg3 * this.field533.field5948 + (float) arg4 * this.field533.field5923 + this.field533.field5950) * (float) this.field598 / var9);
        if ((float) var10 < this.field554 && (float) var11 < this.field554) {
            var7 |= 1;
        } else if (this.field603 < (float) var10 && this.field603 < (float) var11) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field533.field5938 + (float) arg0 * this.field533.field5946 + (float) arg1 * this.field533.field5940 + this.field533.field5957) * (float) this.field557 / var8);
        int var13 = (int) (((float) arg5 * this.field533.field5938 + (float) arg3 * this.field533.field5946 + (float) arg4 * this.field533.field5940 + this.field533.field5957) * (float) this.field557 / var9);
        if ((float) var12 < this.field543 && this.field543 > (float) var13) {
            var7 |= 4;
        } else if (this.field617 < (float) var12 && this.field617 < (float) var13) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIII)V")
    public final void method229(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field481;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Laf;II)V")
    public final void method230(class13 arg0, int arg1, int arg2) {
        if (arg2 < 14) {
            this.field556 = 0.10028613F;
        }
        this.method282(false, false, (byte) -60, arg1, arg0);
        ++field376;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIZBIZ)V")
    private final void method231(int arg0, int arg1, boolean arg2, byte arg3, int arg4, boolean arg5) {
        ++field372;
        boolean var7 = arg2 & this.method296();
        if (!var7 && (~arg0 == -5 || ~arg0 == -9 || arg0 == 9)) {
            arg0 = 2;
            arg1 = arg0 == 4 ? 1 & arg4 : 1;
            arg4 = 0;
        }
        if (arg3 < -110) {
            if (arg0 != 0 && arg5) {
                arg0 |= Integer.MIN_VALUE;
            }
            if (this.field587 == arg0) {
                if (this.field587 != 0) {
                    this.field592[Integer.MAX_VALUE & this.field587].method454(arg5, false);
                    if (this.field624 != arg4 || this.field632 != arg1) {
                        this.field592[Integer.MAX_VALUE & this.field587].method451(0, arg1, arg4);
                        this.field632 = arg1;
                        this.field624 = arg4;
                    }
                    return;
                }
            } else {
                if (~this.field587 != -1) {
                    this.field592[this.field587 & Integer.MAX_VALUE].method452(2);
                }
                if (arg0 == 0) {
                    this.field582 = null;
                } else {
                    this.field582 = this.field592[arg0 & Integer.MAX_VALUE];
                    this.field582.method457((byte) 105, arg5);
                    this.field582.method454(arg5, false);
                    this.field582.method451(0, arg1, arg4);
                }
                this.field632 = arg1;
                this.field624 = arg4;
                this.field587 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)Lsha;")
    public class545 method232(byte arg0, int arg1) {
        ++field343;
        if (arg0 >= -30) {
            this.field641 = null;
        }
        if (arg1 != 6) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    return ~arg1 == -8 ? new class487(this) : new class477(this);
                } else {
                    return new class572(this, this.field386);
                }
            } else {
                return new class542(this);
            }
        } else {
            return new class118(this);
        }
    }

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "(I)V")
    private final void method233(int arg0) {
        ++field374;
        this.field653 = this.method327(false, false);
        this.field653.method1101(-32376, 12, 3096);
        int var2 = -41 / ((arg0 - 60) / 58);
        for (int var3 = 0; ~var3 > -5; ++var3) {
            Buffer var4 = this.field653.method1103((byte) 73, true);
            if (var4 != null) {
                Stream var5 = this.method325((byte) -120, var4);
                var5.method2557(0.0F);
                var5.method2557(0.0F);
                var5.method2557(0.0F);
                for (int var6 = 0; var6 <= 256; ++var6) {
                    double var7 = (double) (var6 * 2) * 3.141592653589793D / 256.0D;
                    float var9 = (float) Math.cos(var7);
                    float var10 = (float) Math.sin(var7);
                    if (Stream.method2551()) {
                        var5.method2557(var10);
                        var5.method2557(var9);
                        var5.method2557(0.0F);
                    } else {
                        var5.method2564(var10);
                        var5.method2564(var9);
                        var5.method2564(0.0F);
                    }
                }
                var5.method2554();
                if (this.field653.method1099((byte) -108)) {
                    break;
                }
            }
        }
        this.field660 = this.method334(21011, new class109[] { new class109(class697.field9848) });
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field353;
    }

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "(Z)V")
    public final void method235(boolean arg0) {
        this.field576 = arg0;
        ++field491;
        this.method275((byte) 115);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
    public abstract void method236(Object arg0, Canvas arg1, byte arg2);

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "(B)I")
    public final int method237(byte arg0) {
        if (arg0 != -50) {
            return -123;
        } else {
            ++field525;
            return this.field561;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILuia;)V")
    public final void method238(int arg0, class272 arg1) {
        if (arg0 <= 105) {
            this.method329(47, -46, (byte) -120, (class674) null, (class755) null);
        }
        ++field452;
        this.field595[this.field613] = arg1;
        this.method221((byte) -95);
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method239(Canvas arg0) {
        ++field388;
        if (this.field496 == arg0) {
            throw new RuntimeException();
        } else if (this.field440.containsKey(arg0)) {
            this.method392(arg0, -32355, this.field440.get(arg0));
            this.field440.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZZ)V")
    public abstract void method240(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "(Z)V")
    public abstract void method241(boolean arg0);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLaf;I)V")
    public final void method242(byte arg0, class13 arg1, int arg2) {
        this.method253(arg1, arg2, -27183, false);
        if (arg0 > -109) {
            this.field438 = null;
        }
        ++field468;
    }

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "(I)V")
    public final void method243(int arg0) {
        if (~this.field618 != -17) {
            this.method341(-63);
            this.method252((byte) 91, true);
            this.method266(33, true);
            this.method308(0, true);
            this.method355(1, (byte) -44);
            this.field618 = 16;
        }
        ++field357;
        if (arg0 < 80) {
            this.method402(115, 117, -4, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "(I)Lbt;")
    public final class417 method244(int arg0) {
        if (arg0 != 1) {
            this.method247();
        }
        if (!this.field558) {
            this.field537.method2533(this.field535, this.field532);
            this.field558 = true;
        }
        ++field512;
        return this.field537;
    }

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "(B)V")
    public abstract void method245(byte arg0);

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "(B)V")
    private final void method246(byte arg0) {
        if (class19.field179 != this.field565) {
            class613 var2 = this.field565;
            this.field565 = class19.field179;
            if (!var2.method3570(116)) {
                this.method401(116);
            }
            this.method280(6);
            this.field631 = this.field611;
            this.method352(true);
            this.field618 &= -8;
        }
        if (arg0 >= -123) {
            this.method254(33);
        }
        ++field464;
    }

    @OriginalMember(owner = "client!ch", name = "Y", descriptor = "()[I")
    public final int[] method247() {
        ++field358;
        return new int[] { this.field622, this.field590, this.field598, this.field557 };
    }

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "(I)V")
    public final void method248(int arg0) {
        if (~this.field618 != -9) {
            this.method246((byte) -125);
            this.method252((byte) 102, true);
            this.method266(25, true);
            this.method308(0, true);
            this.method355(1, (byte) -102);
            this.field618 = 8;
        }
        if (arg0 != 22301) {
            this.field569 = null;
        }
        ++field414;
    }

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "(I)V")
    private final void method249(int arg0) {
        if (arg0 != 8) {
            this.field660 = null;
        }
        this.field578 = (float) this.field562;
        ++field516;
    }

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "()V")
    public final void method250() {
        if (this.field610 != null) {
            this.field610.method3491((byte) 102);
        }
        ++field359;
    }

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "(I)V")
    public final void method251(int arg0) {
        ++field396;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(BZ)V")
    public final void method252(byte arg0, boolean arg1) {
        if (arg0 < 18) {
            this.method299(true, true);
        }
        if (arg1 == !this.field579) {
            this.field579 = arg1;
            this.method344(true);
            this.field618 &= -32;
        }
        ++field406;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Laf;IIZ)V")
    public abstract void method253(class13 arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "(I)V")
    private final void method254(int arg0) {
        this.field553 = false;
        ++field412;
        this.method382((byte) -83);
        if (field426 == this.field565) {
            this.method352(true);
        }
        if (arg0 != 0) {
            this.field593 = -96;
        }
    }

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "()Z")
    public final boolean method255() {
        ++field422;
        return true;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILkca;Lwq;)Z")
    public abstract boolean method256(int arg0, class755 arg1, class674 arg2);

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "(I)[F")
    public final float[] method257(int arg0) {
        ++field401;
        if (arg0 != 2) {
            this.field626 = 61;
        }
        return this.field591;
    }

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "(B)V")
    public abstract void method258(byte arg0);

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "(B)V")
    public final void method259(byte arg0) {
        if (this.field618 != 2) {
            this.method226(false);
            this.method252((byte) 50, false);
            this.method299(true, false);
            this.method266(arg0 ^ 8, false);
            this.method308(0, false);
            this.method223(false, false, false, -2);
            this.field618 = 2;
        }
        ++field410;
        if (arg0 != -93) {
            this.field638 = -1.3225513F;
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V")
    public void method260(int arg0) {
        if (this.field610 != null) {
            this.field610.method3492(true);
        }
        ++field521;
        this.field585 = Integer.MAX_VALUE & arg0;
    }

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "(B)V")
    private final void method261(byte arg0) {
        int var2 = 58 / ((71 - arg0) / 46);
        if (this.field582 != null) {
            this.field582.method453(0);
        }
        ++field429;
        this.method210(false);
    }

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "(I)V")
    private final void method262(int arg0) {
        this.field658 = this.method327(false, false);
        ++field390;
        this.field658.method1101(-32376, 28, 140);
        int var2 = 0;
        if (arg0 < 118) {
            this.field530 = 88;
        }
        while (var2 < 4) {
            Buffer var3 = this.field658.method1103((byte) 73, true);
            if (var3 != null) {
                Stream var4 = this.method325((byte) -120, var3);
                if (Stream.method2551()) {
                    var4.method2557(0.0F);
                    var4.method2557(0.0F);
                    var4.method2557(0.0F);
                    var4.method2557(0.0F);
                    var4.method2557(0.0F);
                    var4.method2557(0.0F);
                    var4.method2557(0.0F);
                    var4.method2557(0.0F);
                    var4.method2557(1.0F);
                    var4.method2557(0.0F);
                    var4.method2557(0.0F);
                    var4.method2557(1.0F);
                    var4.method2557(0.0F);
                    var4.method2557(1.0F);
                    var4.method2557(1.0F);
                    var4.method2557(1.0F);
                    var4.method2557(0.0F);
                    var4.method2557(1.0F);
                    var4.method2557(1.0F);
                    var4.method2557(1.0F);
                    var4.method2557(1.0F);
                    var4.method2557(1.0F);
                    var4.method2557(0.0F);
                    var4.method2557(0.0F);
                    var4.method2557(1.0F);
                    var4.method2557(0.0F);
                    var4.method2557(1.0F);
                    var4.method2557(0.0F);
                    var4.method2557(0.0F);
                    var4.method2557(0.0F);
                    var4.method2557(0.0F);
                    var4.method2557(0.0F);
                    var4.method2557(0.0F);
                    var4.method2557(0.0F);
                    var4.method2557(0.0F);
                } else {
                    var4.method2564(0.0F);
                    var4.method2564(0.0F);
                    var4.method2564(0.0F);
                    var4.method2564(0.0F);
                    var4.method2564(0.0F);
                    var4.method2564(0.0F);
                    var4.method2564(0.0F);
                    var4.method2564(0.0F);
                    var4.method2564(1.0F);
                    var4.method2564(0.0F);
                    var4.method2564(0.0F);
                    var4.method2564(1.0F);
                    var4.method2564(0.0F);
                    var4.method2564(1.0F);
                    var4.method2564(1.0F);
                    var4.method2564(1.0F);
                    var4.method2564(0.0F);
                    var4.method2564(1.0F);
                    var4.method2564(1.0F);
                    var4.method2564(1.0F);
                    var4.method2564(1.0F);
                    var4.method2564(1.0F);
                    var4.method2564(0.0F);
                    var4.method2564(0.0F);
                    var4.method2564(1.0F);
                    var4.method2564(0.0F);
                    var4.method2564(1.0F);
                    var4.method2564(0.0F);
                    var4.method2564(0.0F);
                    var4.method2564(0.0F);
                    var4.method2564(0.0F);
                    var4.method2564(0.0F);
                    var4.method2564(0.0F);
                    var4.method2564(0.0F);
                    var4.method2564(0.0F);
                }
                var4.method2554();
                if (this.field658.method1099((byte) -119)) {
                    break;
                }
            }
            ++var2;
        }
        this.field639 = this.method334(21011, new class109[] { new class109(new class697[] { class697.field9848, class697.field9852, class697.field9852 }) });
    }

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "(B)V")
    public abstract void method263(byte arg0);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lec;I)V")
    public final void method264(class101 arg0, int arg1) {
        if (arg1 != -2) {
            this.method282(true, true, (byte) -58, 58, (class13) null);
        }
        ++field389;
        if (this.field604[this.field613] != arg0) {
            this.field604[this.field613] = arg0;
            if (arg0 != null) {
                arg0.method617((byte) 111);
            } else {
                this.method409(0);
            }
            this.field618 &= -2;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Leu;B)V")
    public abstract void method265(class448 arg0, byte arg1);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZ)V")
    public final void method266(int arg0, boolean arg1) {
        if (this.field568 == !arg1) {
            this.field568 = arg1;
            this.method408((byte) -118);
            this.field618 &= -32;
        }
        ++field514;
        int var3 = 56 / ((arg0 - -21) / 33);
    }

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field480;
    }

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "(IIIII)V")
    public final void method268(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method380(arg0, arg1, arg0, arg1 - -arg2, arg3, arg4);
        ++field354;
    }

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "(Z)V")
    public final void method269(boolean arg0) {
        if (this.field618 != 4) {
            this.method226(false);
            this.method252((byte) 106, false);
            this.method299(true, false);
            this.method266(72, false);
            this.method308(0, false);
            this.method223(false, false, false, -2);
            this.method355(1, (byte) -82);
            this.method411(17024, 0);
            this.field618 = 4;
        }
        ++field497;
        if (arg0) {
            this.field628 = -109;
        }
    }

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "()I")
    public final int method270() {
        ++field355;
        return this.field635 - 2;
    }

    @OriginalMember(owner = "client!ch", name = "xa", descriptor = "(F)V")
    public final void method271(float arg0) {
        ++field459;
        if (this.field551 != arg0) {
            this.field551 = arg0;
            this.field431.setAmbient(arg0);
            this.method285(-75);
            this.method406(-6911);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLrf;I)V")
    private final void method272(byte arg0, class749 arg1, int arg2) {
        ++field502;
        int var4 = 120 % ((arg0 - -31) / 51);
        this.method405(this.field658, 0, (byte) 11);
        this.method265(this.field639, (byte) -66);
        this.method399(arg1, arg2, 0, (byte) -113);
    }

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "(B)V")
    public abstract void method273(byte arg0);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V")
    public final void method274(boolean arg0) {
        ++field449;
    }

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "(B)V")
    public abstract void method275(byte arg0);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class569 arg6, int arg7, int arg8) {
        ++field492;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[Lwh;)V")
    public final void method277(int arg0, class40[] arg1) {
        for (int var3 = 0; arg0 > var3; ++var3) {
            this.field573[var3] = arg1[var3];
        }
        ++field361;
        this.field608 = arg0;
        if (this.field565.method3570(109)) {
            this.method356((byte) -55);
        }
    }

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "(I)V")
    public abstract void method278(int arg0);

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "(I)V")
    public final void method279(int arg0) {
        ++field442;
        if (arg0 >= 128 && arg0 <= 1024) {
            if (this.field610 != null) {
                this.field610.method3491((byte) -90);
            }
            this.field564 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "(I)V")
    private final void method280(int arg0) {
        if (arg0 == 6) {
            if (!this.field580) {
                float[] var2 = this.field611;
                float var3 = (float) (-this.field622 * this.field538) / (float) this.field598;
                float var4 = (float) ((-this.field622 + this.field486) * this.field538) / (float) this.field598;
                float var5 = (float) (this.field590 * this.field538) / (float) this.field557;
                float var6 = (float) ((-this.field436 + this.field590) * this.field538) / (float) this.field557;
                if (var3 != var4 && var5 != var6) {
                    float var7 = (float) this.field538 * 2.0F;
                    var2[8] = (var3 + var4) / (-var3 + var4);
                    var2[0] = var7 / (var4 - var3);
                    var2[6] = 0.0F;
                    var2[5] = var7 / (var5 - var6);
                    var2[7] = 0.0F;
                    var2[1] = 0.0F;
                    var2[3] = 0.0F;
                    var2[4] = 0.0F;
                    var2[12] = 0.0F;
                    var2[11] = -1.0F;
                    var2[13] = 0.0F;
                    var2[15] = 0.0F;
                    var2[14] = this.field556 = (float) (this.field562 * this.field538) / (float) (-this.field562 + this.field538);
                    var2[2] = 0.0F;
                    var2[10] = this.field638 = (float) this.field562 / (float) (-this.field562 + this.field538);
                    var2[9] = (var5 + var6) / (-var6 + var5);
                } else {
                    var2[2] = 0.0F;
                    var2[7] = 0.0F;
                    var2[10] = 1.0F;
                    var2[0] = 1.0F;
                    var2[15] = 1.0F;
                    var2[12] = 0.0F;
                    var2[8] = 0.0F;
                    var2[9] = 0.0F;
                    var2[6] = 0.0F;
                    var2[11] = 0.0F;
                    var2[3] = 0.0F;
                    var2[4] = 0.0F;
                    var2[5] = 1.0F;
                    var2[14] = 0.0F;
                    var2[1] = 0.0F;
                    var2[13] = 0.0F;
                }
                this.method212((byte) 48);
                this.field580 = true;
            }
            ++field475;
        }
    }

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "(II)V")
    public final void method281(int arg0, int arg1) {
        ++field371;
        if (this.field538 != arg0 || ~this.field562 != ~arg1) {
            this.field562 = arg1;
            this.field538 = arg0;
            this.method319(123);
            this.method254(0);
            this.method261((byte) -65);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZZBILaf;)V")
    public abstract void method282(boolean arg0, boolean arg1, byte arg2, int arg3, class13 arg4);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILwq;Lkca;)Z")
    public abstract boolean method283(int arg0, class674 arg1, class755 arg2);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLew;)V")
    public abstract void method284(byte arg0, class683 arg1);

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "(I)V")
    public abstract void method285(int arg0);

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "(I)V")
    public abstract void method286(int arg0);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(FFFFFFI)Z")
    private final boolean method287(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6) {
        ++field478;
        Buffer var8 = this.field647.method1103((byte) 73, true);
        if (var8 == null) {
            return false;
        } else {
            Stream var9 = this.method325((byte) -120, var8);
            if (Stream.method2551()) {
                var9.method2557(arg2);
                var9.method2557(arg1);
                var9.method2557(arg3);
                var9.method2557(arg5);
                var9.method2557(arg4);
                var9.method2557(arg0);
            } else {
                var9.method2564(arg2);
                var9.method2564(arg1);
                var9.method2564(arg3);
                var9.method2564(arg5);
                var9.method2564(arg4);
                var9.method2564(arg0);
            }
            if (arg6 != 26400) {
                this.field484 = null;
            }
            var9.method2554();
            return this.field647.method1099((byte) -123);
        }
    }

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "(B)V")
    private final void method288(byte arg0) {
        if (arg0 < -24) {
            ++field367;
            if (this.field425 != null) {
                Dimension var2 = this.field425.getSize();
                this.field474 = var2.width;
                this.field456 = var2.height;
            } else {
                this.field474 = this.field456 = 1;
            }
            this.field486 = this.field474;
            this.field436 = this.field456;
            this.method215((byte) -121);
            this.method319(120);
            this.method254(0);
            this.method403(-1);
            this.method301(5);
            this.method194((byte) -99);
            this.method328();
        }
    }

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "(Z)V")
    public final void method289(boolean arg0) {
        ++field345;
        this.field532.method851();
        if (arg0) {
            this.method275((byte) -95);
        }
        this.field527 = true;
        this.method346(true);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIZI[III)Lug;")
    public abstract class60 method290(int arg0, int arg1, boolean arg2, int arg3, int[] arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B[F)[F")
    public final float[] method291(byte arg0, float[] arg1) {
        arg1[0] = this.field631[0];
        ++field416;
        arg1[8] = this.field631[2];
        arg1[4] = this.field631[1];
        arg1[12] = this.field631[3];
        arg1[5] = this.field631[5];
        if (arg0 != -32) {
            this.method239((Canvas) null);
        }
        arg1[2] = this.field631[8];
        arg1[13] = this.field631[7];
        arg1[9] = this.field631[6];
        arg1[1] = this.field631[4];
        arg1[6] = this.field631[9];
        arg1[10] = this.field631[10];
        arg1[7] = this.field631[13];
        arg1[14] = this.field631[11];
        arg1[3] = this.field631[12];
        arg1[15] = this.field631[15];
        arg1[11] = this.field631[14];
        return arg1;
    }

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "()Z")
    public final boolean method292() {
        ++field395;
        return true;
    }

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "(ILaa;II)V")
    public final void method293(int arg0, class569 arg1, int arg2, int arg3) {
        ++field387;
        class628 var5 = (class628) arg1;
        class60 var6 = var5.field8902;
        this.method259((byte) -93);
        this.method264(var6, -2);
        this.method355(1, (byte) -100);
        this.method386((byte) -115, class567.field8198, class567.field8198);
        this.method230(class231.field3462, 0, 19);
        this.method213(arg0, 3);
        this.field532.method2522((float) this.field436, 0.0F, 123, (float) this.field486);
        this.method384((byte) 19);
        this.field584[0].method2522(var6.method567((float) this.field436, 17714), 1.0F, 123, var6.method561((byte) 89, (float) this.field486));
        this.field584[0].method2538(var6.method561((byte) -105, (float) (-arg2)), var6.method567((float) (-arg3), 17714), 0.0F, 17831);
        this.field595[0] = class549.field7982;
        this.method221((byte) -95);
        this.method337((byte) 18);
        this.method389((byte) -2);
        this.method230(class234.field3509, 0, 74);
    }

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "(I)V")
    private final void method294(int arg0) {
        if (arg0 == -29513) {
            ++field504;
            if (~this.field618 != -2) {
                this.method226(false);
                this.method252((byte) 84, false);
                this.method299(true, false);
                this.method266(-77, false);
                this.method308(0, false);
                this.method223(false, false, false, -2);
                this.method411(17024, 1);
                this.method264(this.field547, arg0 ^ 29513);
                this.field618 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lkca;IIB[BIZI)Lug;")
    public abstract class60 method295(class755 arg0, int arg1, int arg2, byte arg3, byte[] arg4, int arg5, boolean arg6, int arg7);

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "()Z")
    public final boolean method296() {
        ++field392;
        return this.field592[3].method459(69);
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Lla;II)V")
    public class38(Canvas arg0, Object arg1, class267 arg2, class423 arg3, int arg4, int arg5) {
        super(arg2);
        this.field476 = arg3;
        this.field630 = arg4;
        this.field434 = this.field484 = arg1;
        this.field425 = this.field496 = arg0;
        Dimension var7 = arg0.getSize();
        this.field486 = this.field474 = var7.width;
        this.field605 = arg5;
        this.field436 = this.field456 = var7.height;
        class705.method3955(false, true, -1);
        if (super.field7881 != null) {
            this.field610 = new class597(this, super.field7881);
            this.field431 = new NativeInterface(super.field7881.method969((byte) 107), this.field605);
            for (int var8 = 0; super.field7881.method969((byte) 54) > var8; ++var8) {
                class679 var9 = super.field7881.method962(var8, 2904);
                if (var9 != null) {
                    this.field431.initTextureMetrics(var8, var9.field9637, var9.field9651);
                }
            }
        } else {
            this.field431 = new NativeInterface(0, this.field605);
            this.field610 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "KA", descriptor = "(IIII)V")
    public final void method297(int arg0, int arg1, int arg2, int arg3) {
        ++field419;
        if (arg0 <= 0 && this.field486 + -1 <= arg2 && arg1 <= 0 && this.field436 + -1 <= arg3) {
            this.method328();
        } else {
            this.field583 = arg3 > this.field486 ? 0 : arg3;
            this.field572 = ~arg1 <= -1 ? arg1 : 0;
            this.field571 = arg2 > this.field486 ? 0 : arg2;
            this.field616 = arg0 < 0 ? 0 : arg0;
            if (!this.field661) {
                this.field661 = true;
                this.method360(-46);
            }
            this.method258((byte) 73);
            this.method301(5);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIII)Lss;")
    public final class506 method298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field494;
        return new class705(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(ZZ)V")
    public final void method299(boolean arg0, boolean arg1) {
        ++field513;
        if (arg0) {
            if (!arg1 != !this.field597) {
                this.field597 = arg1;
                this.method391(0);
                this.field618 &= -8;
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "(II)I")
    public final int method300(int arg0, int arg1) {
        ++field450;
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "(I)V")
    private final void method301(int arg0) {
        ++field467;
        this.field603 = (float) (this.field571 - this.field622);
        this.field617 = (float) (-this.field590 + this.field583);
        this.field554 = (float) (-this.field622 + this.field616);
        this.field543 = (float) (-this.field590 + this.field572);
        if (arg0 != 5) {
            this.field607 = true;
        }
    }

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "(B)V")
    private final void method302(byte arg0) {
        if (!this.field548) {
            float[] var2 = this.field606;
            this.field548 = true;
            if (~this.field486 != -1 && this.field436 != 0) {
                var2[8] = 0.0F;
                var2[1] = 0.0F;
                var2[2] = 0.0F;
                var2[6] = 0.0F;
                var2[3] = 0.0F;
                var2[12] = -1.0F;
                var2[0] = 2.0F / (float) this.field486;
                var2[10] = 0.5F;
                var2[9] = 0.0F;
                var2[7] = 0.0F;
                var2[4] = 0.0F;
                var2[13] = 1.0F;
                var2[15] = 1.0F;
                var2[14] = 0.5F;
                var2[11] = 0.0F;
                var2[5] = -2.0F / (float) this.field436;
            } else {
                var2[0] = 1.0F;
                var2[7] = 0.0F;
                var2[1] = 0.0F;
                var2[3] = 0.0F;
                var2[5] = 1.0F;
                var2[10] = 1.0F;
                var2[2] = 0.0F;
                var2[4] = 0.0F;
                var2[6] = 0.0F;
                var2[15] = 1.0F;
                var2[11] = 0.0F;
                var2[12] = 0.0F;
                var2[14] = 0.0F;
                var2[9] = 0.0F;
                var2[8] = 0.0F;
                var2[13] = 0.0F;
            }
        }
        ++field528;
        if (arg0 != 21) {
            this.method237((byte) -108);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZII[II)Lug;")
    public final class60 method303(boolean arg0, int arg1, int arg2, int[] arg3, int arg4) {
        ++field364;
        return arg4 != -5 ? null : this.method290(0, 0, arg0, arg2, arg3, 10, arg1);
    }

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "()Lsk;")
    public final class121 method304() {
        ++field510;
        return this.field533;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(IIIIII)V")
    public final void method305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field409;
        float var7 = this.method347((byte) -124);
        this.method294(-29513);
        this.method213(arg4, 3);
        this.method230(class231.field3462, 0, 59);
        this.method242((byte) -125, class231.field3462, 0);
        this.method355(arg5, (byte) -92);
        this.field532.method2522((float) (arg3 + -1), 1.0F, 123, (float) (arg2 + -1));
        this.field532.method2538((float) arg0 + -var7, (float) arg1 + -var7, 0.0F, 17831);
        this.method384((byte) 19);
        this.method240(true, false);
        this.method272((byte) 95, class631.field8925, 4);
        this.method240(true, true);
        this.method242((byte) -120, class234.field3509, 0);
        this.method230(class234.field3509, 0, 16);
    }

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "(B)V")
    public final void method306(byte arg0) {
        ++field507;
        Hashtable var2 = new Hashtable();
        if (this.field440 != null && !this.field440.isEmpty()) {
            Enumeration var3 = this.field440.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method218(var4, arg0 ^ -93));
            }
        }
        this.field440 = var2;
        if (arg0 != -93) {
            this.method203((byte) -47);
        }
        this.method262(124);
        this.method315(arg0 ^ -81);
        this.method233(arg0 ^ 5);
        this.field569.method3020(arg0 + -1984952311, this);
    }

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "(I)V")
    public abstract void method307(int arg0);

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(IZ)V")
    public final void method308(int arg0, boolean arg1) {
        ++field520;
        if (!arg1 == this.field574) {
            this.field574 = arg1;
            this.method275((byte) 50);
            this.field618 &= -32;
        }
        if (arg0 != 0) {
            this.field608 = -33;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIF)Lwh;")
    public final class40 method309(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field391;
        return new class455(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lkca;BII[BI)Liv;")
    public abstract class24 method310(class755 arg0, byte arg1, int arg2, int arg3, byte[] arg4, int arg5);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class339 method311(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field448;
        return new class443(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BF)V")
    public final void method312(byte arg0, float arg1) {
        if (arg0 != 30) {
            this.method266(7, true);
        }
        ++field428;
        if (this.field544 != arg1) {
            this.field544 = arg1;
            this.method254(arg0 + -30);
        }
    }

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "(I)V")
    public abstract void method313(int arg0);

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method314(Canvas arg0, int arg1, int arg2) {
        ++field499;
        Object var4 = null;
        if (arg0 != null && this.field496 != arg0) {
            if (this.field440.containsKey(arg0)) {
                var4 = this.field440.get(arg0);
            }
        } else {
            var4 = this.field434;
        }
        if (var4 == null) {
            throw new RuntimeException();
        } else {
            this.method236(var4, arg0, (byte) -114);
            if (this.field425 == arg0) {
                this.method288((byte) -46);
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "(I)V")
    private final void method315(int arg0) {
        this.field647 = this.method327(true, false);
        ++field397;
        this.field647.method1101(-32376, arg0, 24);
        this.field657 = this.method334(21011, new class109[] { new class109(class697.field9848) });
    }

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "(I)V")
    public abstract void method316(int arg0);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IB)V")
    public final void method317(int arg0, byte arg1) {
        this.method213(arg1 | arg1 << 8 | arg1 << 24 | arg1 << 16, 3);
        ++field506;
        if (arg0 > -97) {
            this.method250();
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method318(Canvas arg0, int arg1, int arg2) {
        ++field383;
        if (this.field496 == arg0) {
            throw new RuntimeException();
        } else if (!this.field440.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var7) {
                }
                Object var6 = this.method218(arg0, 0);
                if (var6 == null) {
                    throw new RuntimeException();
                } else {
                    this.field440.put(arg0, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "(I)V")
    private final void method319(int arg0) {
        ++field418;
        this.field580 = false;
        this.method280(6);
        if (arg0 <= 119) {
            this.field623 = 67;
        }
        if (class19.field179 == this.field565) {
            this.method352(true);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZB)V")
    public final void method320(boolean arg0, byte arg1) {
        ++field463;
        if (arg1 > -80) {
            this.method307(-117);
        }
        if (this.field589 == !arg0) {
            this.field589 = arg0;
            this.method344(true);
        }
    }

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "(I)V")
    public abstract void method321(int arg0);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lqt;[Lffa;Z)Lda;")
    public final class400 method322(class502 arg0, class676[] arg1, boolean arg2) {
        ++field439;
        return new class210(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "(B)Lbt;")
    public final class417 method323(byte arg0) {
        if (arg0 != -26) {
            this.method201(66);
        }
        ++field394;
        return this.field535;
    }

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "(IIIIIII)I")
    public final int method324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field447;
        int var8 = 0;
        float var9 = (float) arg2 * this.field533.field5961 + (float) arg0 * this.field533.field5939 + (float) arg1 * this.field533.field5968 + this.field533.field5945;
        float var10 = (float) arg5 * this.field533.field5961 + (float) arg3 * this.field533.field5939 + (float) arg4 * this.field533.field5968 + this.field533.field5945;
        if ((float) this.field538 > var9 && var10 < (float) this.field538) {
            var8 |= 16;
        } else if ((float) this.field562 < var9 && (float) this.field562 < var10) {
            var8 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field533.field5927 + (float) arg0 * this.field533.field5948 + (float) arg1 * this.field533.field5923 + this.field533.field5950) * (float) this.field598 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field533.field5927 + (float) arg3 * this.field533.field5948 + (float) arg4 * this.field533.field5923 + this.field533.field5950) * (float) this.field598 / (float) arg6);
        if ((float) var11 < this.field554 && this.field554 > (float) var12) {
            var8 |= 1;
        } else if ((float) var11 > this.field603 && (float) var12 > this.field603) {
            var8 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field533.field5938 + (float) arg0 * this.field533.field5946 + (float) arg1 * this.field533.field5940 + this.field533.field5957) * (float) this.field557 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field533.field5938 + (float) arg3 * this.field533.field5946 + (float) arg4 * this.field533.field5940 + this.field533.field5957) * (float) this.field557 / (float) arg6);
        if (this.field543 > (float) var13 && (float) var14 < this.field543) {
            var8 |= 4;
        } else if (this.field617 < (float) var13 && this.field617 < (float) var14) {
            var8 |= 8;
        }
        return var8;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLjaclib/memory/Buffer;)Ljaclib/memory/Stream;")
    public final Stream method325(byte arg0, Buffer arg1) {
        ++field342;
        this.field570.method2556(arg1);
        if (arg0 != -120) {
            this.method314((Canvas) null, -56, -97);
        }
        return this.field570;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method326(int arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(ZZ)Lfg;")
    public abstract class436 method327(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!ch", name = "la", descriptor = "()V")
    public final void method328() {
        this.field616 = 0;
        this.field572 = 0;
        ++field489;
        this.field571 = this.field486;
        this.field583 = this.field436;
        if (this.field661) {
            this.field661 = false;
            this.method360(123);
        }
        this.method301(5);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIBLwq;Lkca;)Lug;")
    public abstract class60 method329(int arg0, int arg1, byte arg2, class674 arg3, class755 arg4);

    @OriginalMember(owner = "client!ch", name = "da", descriptor = "(III[I)V")
    public final void method330(int arg0, int arg1, int arg2, int[] arg3) {
        ++field370;
        float var5 = this.field533.method2516((float) arg0, (float) arg2, (float) arg1, 1);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field590;
            var7 = this.field622;
        } else {
            var7 = (int) ((float) this.field598 * this.field533.method2523((float) arg0, (float) arg2, (float) arg1, false) / var5);
            var6 = (int) ((float) this.field557 * this.field533.method2526((byte) 56, (float) arg2, (float) arg1, (float) arg0) / var5);
        }
        arg3[1] = (int) ((float) var6 + -this.field543);
        arg3[0] = (int) ((float) var7 - this.field554);
        arg3[2] = (int) var5;
    }

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "()I")
    public final int method331() {
        ++field356;
        return this.field518 - -this.field531 + this.field530;
    }

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "()I")
    public final int method332() {
        ++field490;
        return this.field662;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILbt;)V")
    public final void method333(int arg0, class417 arg1) {
        ++field523;
        this.field532.method841(arg1);
        if (arg0 != -13267) {
            this.method215((byte) 48);
        }
        this.field527 = false;
        this.method346(true);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[Len;)Leu;")
    public abstract class448 method334(int arg0, class109[] arg1);

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "(IIII)V")
    public final void method335(int arg0, int arg1, int arg2, int arg3) {
        ++field351;
        boolean var5 = false;
        if (~this.field616 > ~arg0) {
            var5 = true;
            this.field616 = arg0;
        }
        if (~this.field571 < ~arg2) {
            this.field571 = arg2;
            var5 = true;
        }
        if (arg1 > this.field572) {
            this.field572 = arg1;
            var5 = true;
        }
        if (~arg3 > ~this.field583) {
            this.field583 = arg3;
            var5 = true;
        }
        if (var5) {
            if (!this.field661) {
                this.field661 = true;
                this.method360(-99);
            }
            this.method258((byte) 73);
            this.method301(5);
        }
    }

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "(I)V")
    public final void method336(int arg0) {
        ++field430;
        Enumeration var2 = this.field440.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method392(var3, -32355, this.field440.get(var3));
        }
        this.field658.method175(92);
        this.field647.method175(-85);
        this.field653.method175(-120);
        this.field654.method1355(4);
        this.field646.method1355(4);
        this.field649.method1355(4);
        this.field641.method1355(4);
        this.field656.method1355(4);
        this.field569.method3013(-120);
        if (arg0 <= -10) {
            this.field640.method175(-97);
        }
    }

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "(B)V")
    public final void method337(byte arg0) {
        if (arg0 != 18) {
            this.field604 = null;
        }
        ++field446;
        this.method272((byte) -103, class575.field8272, 2);
    }

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "(B)V")
    public void method338(byte arg0) {
        ++field457;
        if (arg0 != -46) {
            this.field572 = 9;
        }
        this.method371(-4403);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "([IIIIIZ)Ltd;")
    public final class515 method339(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field352;
        return new class753(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "(I)V")
    public final void method340(int arg0) {
        ++field441;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "(I)V")
    private final void method341(int arg0) {
        int var2 = 48 % ((29 - arg0) / 40);
        if (field426 != this.field565) {
            class613 var3 = this.field565;
            this.field565 = field426;
            if (!var3.method3570(124)) {
                this.method401(118);
            }
            this.method382((byte) -83);
            this.field631 = this.field566;
            this.method352(true);
            this.field618 &= -8;
        }
        ++field453;
    }

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "()Lsk;")
    public final class121 method342() {
        ++field380;
        return this.field643;
    }

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "()Z")
    public final boolean method343() {
        ++field477;
        return false;
    }

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "(Z)V")
    public abstract void method344(boolean arg0);

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "(I)Lbt;")
    public final class417 method345(int arg0) {
        if (arg0 != 0) {
            this.field531 = -115;
        }
        ++field455;
        return this.field532;
    }

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "(Z)V")
    private final void method346(boolean arg0) {
        ++field382;
        if (class757.field10544 == this.field565) {
            float var2 = this.method347((byte) -128);
            this.field532.method2538(var2, var2, 0.0F, 17831);
        }
        if (!arg0) {
            field426 = null;
        }
        this.field558 = false;
        this.method245((byte) 118);
        if (this.field582 != null) {
            this.field582.method1739(-4);
        }
    }

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "(B)F")
    public abstract float method347(byte arg0);

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "()Lsk;")
    public final class121 method348() {
        ++field501;
        return new class417();
    }

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "(B)Lbt;")
    public final class417 method349(byte arg0) {
        ++field522;
        return arg0 != 25 ? null : this.field584[this.field613];
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[BZIILkca;)Lug;")
    public final class60 method350(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4, class755 arg5) {
        ++field365;
        if (arg3 >= -93) {
            this.method347((byte) -37);
        }
        return this.method295(arg5, 0, arg0, (byte) 127, arg1, 0, arg2, arg4);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZII)Ljaclib/memory/heap/NativeHeapBuffer;")
    public final NativeHeapBuffer method351(boolean arg0, int arg1, int arg2) {
        if (arg2 < 8) {
            this.field568 = false;
        }
        ++field435;
        return this.field438.method2568(arg1, arg0);
    }

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "(Z)V")
    private final void method352(boolean arg0) {
        this.method372(84);
        ++field405;
        if (arg0) {
            if (this.field582 != null) {
                this.field582.method1740(false);
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lss;)V")
    public final void method353(class506 arg0) {
        this.field586 = (class81) arg0;
        ++field482;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lrf;IIILrr;II)V")
    public abstract void method354(class749 arg0, int arg1, int arg2, int arg3, class33 arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(IB)V")
    public final void method355(int arg0, byte arg1) {
        ++field517;
        if (arg1 >= -5) {
            this.method218((Canvas) null, 57);
        }
        if (this.field628 != arg0) {
            boolean var3;
            boolean var4;
            class351 var5;
            if (~arg0 == -2) {
                var3 = true;
                var4 = true;
                var5 = class143.field1949;
            } else if (arg0 == 2) {
                var3 = false;
                var5 = class548.field7963;
                var4 = true;
            } else if (arg0 != 128) {
                var3 = false;
                var4 = false;
                var5 = class691.field9799;
            } else {
                var4 = true;
                var3 = true;
                var5 = class131.field1814;
            }
            if (this.field560 == !var3) {
                this.field560 = var3;
                this.method313(115);
            }
            if (this.field540 == !var4) {
                this.field540 = var4;
                this.method321(119);
            }
            if (this.field550 != var5) {
                this.field550 = var5;
                this.method203((byte) 76);
            }
            this.field618 &= -29;
            this.field628 = arg0;
        }
    }

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "(B)V")
    public void method356(byte arg0) {
        this.field581 = this.field608;
        ++field472;
        this.field608 = 0;
        if (arg0 != -55) {
            this.method270();
        }
    }

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "(IIIII)V")
    public final void method357(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field402;
        this.method380(arg0, arg1, arg0 - -arg2, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "([I)V")
    public final void method358(int[] arg0) {
        ++field503;
        arg0[1] = this.field572;
        arg0[3] = this.field583;
        arg0[0] = this.field616;
        arg0[2] = this.field571;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIZ)Ltd;")
    public final class515 method359(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field362;
        class753 var6 = new class753(this, arg2, arg3, arg4);
        var6.method807(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "(I)V")
    public abstract void method360(int arg0);

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "(II)Lrr;")
    public final class33 method361(int arg0, int arg1) {
        if (~(arg1 * 2) < ~this.field640.method1105(false)) {
            this.field640.method174(arg1, (byte) 39);
        }
        ++field519;
        if (arg0 > -20) {
            this.method348();
        }
        return this.field640;
    }

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "(I)V")
    public abstract void method362(int arg0);

    @OriginalMember(owner = "client!ch", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method363(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field360;
        boolean var7 = ~this.field634 != ~arg0;
        if (var7 || this.field599 != arg1 || this.field594 != arg2) {
            this.field634 = arg0;
            this.field594 = arg2;
            this.field599 = arg1;
            if (var7) {
                this.field549 = (float) (255 & this.field634) / 255.0F;
                this.field552 = (float) (65280 & this.field634) / 65280.0F;
                this.field541 = (float) (16711680 & this.field634) / 1.671168E7F;
                this.method285(-92);
            }
            this.field431.setSunColour(this.field541, this.field552, this.field549, arg1, arg2);
            this.method307(-119);
        }
        if (this.field620[0] != arg3 || this.field620[1] != arg4 || this.field620[2] != arg5) {
            this.field620[0] = arg3;
            this.field620[1] = arg4;
            this.field620[2] = arg5;
            this.field577[0] = -arg3;
            this.field577[2] = -arg5;
            this.field577[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field609[0] = arg3 * var8;
            this.field609[2] = arg5 * var8;
            this.field609[1] = arg4 * var8;
            this.field625[1] = -this.field609[1];
            this.field625[2] = -this.field609[2];
            this.field625[0] = -this.field609[0];
            this.field431.setSunDirection(this.field609[0], this.field609[1], this.field609[2]);
            this.method241(false);
            this.field539 = (int) (arg5 * 256.0F / arg4);
            this.field633 = (int) (arg3 * 256.0F / arg4);
        }
        this.method406(-6911);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lsk;)V")
    public final void method364(class121 arg0) {
        ++field417;
        this.field533 = (class417) arg0;
        this.field535.method841(this.field533);
        this.field535.method2519((byte) -125);
        this.field536.method2531(this.field535, -65);
        this.field534.method2531(this.field533, -123);
        if (this.field565.method3570(109)) {
            this.method401(116);
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "()Z")
    public final boolean method365() {
        ++field378;
        return true;
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(BZ)Lrr;")
    public abstract class33 method366(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZLkca;II[FB)Lug;")
    public final class60 method367(boolean arg0, class755 arg1, int arg2, int arg3, float[] arg4, byte arg5) {
        if (arg5 >= -100) {
            this.method232((byte) -128, -14);
        }
        ++field461;
        return this.method376(0, 0, (byte) -26, arg0, arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class569 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field423;
    }

    @OriginalMember(owner = "client!ch", name = "X", descriptor = "(I)V")
    public final void method369(int arg0) {
        ++field344;
        this.field588 = 0;
        while (arg0 > 1) {
            ++this.field588;
            arg0 >>= 1;
        }
        this.field596 = 1 << this.field588;
    }

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "(I)V")
    private final void method370(int arg0) {
        ++field368;
        this.method405(this.field647, 0, (byte) 11);
        this.method265(this.field657, (byte) -91);
        if (arg0 == 32563) {
            this.method399(class112.field1580, 1, 0, (byte) -102);
        }
    }

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "(I)V")
    private final void method371(int arg0) {
        this.method285(-82);
        ++field393;
        this.method307(-95);
        this.method391(0);
        this.method356((byte) -55);
        this.method241(false);
        this.method406(-6911);
        this.method362(-121);
        this.method408((byte) -118);
        this.method275((byte) 22);
        this.method344(true);
        this.method210(false);
        this.method321(109);
        this.method203((byte) 25);
        this.method313(119);
        for (int var2 = this.field619 + -1; ~var2 <= -1; --var2) {
            this.method208(8, var2);
            this.method273((byte) -100);
            this.method286(arg0 ^ -4422);
            this.method389((byte) -2);
        }
        if (arg0 == -4403) {
            this.method196(false);
            this.method403(-1);
            this.method372(-61);
            this.method245((byte) 64);
            this.method316(-1455);
        }
    }

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "(I)V")
    public abstract void method372(int arg0);

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "(B)V")
    public final void method373(byte arg0) {
        this.field595 = new class272[this.field619];
        ++field524;
        this.field559 = new class431[this.field619];
        this.field629 = new class431[this.field619];
        this.field584 = new class417[this.field619];
        this.field604 = new class101[this.field619];
        if (arg0 != 111) {
            this.field527 = true;
        }
        for (int var2 = 0; ~var2 > ~this.field619; ++var2) {
            this.field559[var2] = class281.field3934;
            this.field629[var2] = class281.field3934;
            this.field595[var2] = class656.field9402;
            this.field584[var2] = new class417();
        }
        this.field573 = new class40[this.field635 - 2];
        this.field547 = this.method329(1, 1, (byte) -91, class674.field9590, class482.field6922);
        this.method393(new class376(262144));
        this.field645 = this.method334(21011, new class109[] { new class109(new class697[] { class697.field9848, class697.field9852 }) });
        this.field644 = this.method334(21011, new class109[] { new class109(new class697[] { class697.field9848, class697.field9850 }) });
        this.field651 = this.method334(21011, new class109[] { new class109(class697.field9848), new class109(class697.field9850), new class109(class697.field9852), new class109(class697.field9849) });
        this.field659 = this.method334(21011, new class109[] { new class109(class697.field9848), new class109(class697.field9850), new class109(class697.field9852) });
        this.field652 = new class192(this, 0, 0, false, false);
        this.field654 = new class192(this, 0, 0, true, true);
        this.field655 = new class192(this, 0, 0, false, false);
        this.field646 = new class192(this, 0, 0, true, true);
        this.field650 = new class192(this, 0, 0, false, false);
        this.field649 = new class192(this, 0, 0, true, true);
        this.field642 = new class192(this, 0, 0, false, false);
        this.field641 = new class192(this, 0, 0, true, true);
        this.field648 = new class192(this, 0, 0, false, false);
        this.field656 = new class192(this, 0, 0, true, true);
        this.field569 = new class496(this);
        this.field640 = this.method366((byte) 84, true);
        this.method306((byte) -93);
        this.field386 = new class617(this);
        this.field592[1] = this.method232((byte) -92, 1);
        this.field592[2] = this.method232((byte) -89, 2);
        this.field592[4] = this.method232((byte) -87, 4);
        this.field592[5] = this.method232((byte) -60, 5);
        this.field592[6] = this.method232((byte) -83, 6);
        this.field592[7] = this.method232((byte) -71, 7);
        this.field592[3] = this.method232((byte) -53, 3);
        this.field592[8] = this.method232((byte) -72, 8);
        this.field592[9] = this.method232((byte) -84, 9);
        if (!this.field592[2].method459(arg0 ^ 34)) {
            this.field592[2] = this.method232((byte) -71, 0);
        }
        if (!this.field592[4].method459(106)) {
            this.field592[4] = this.field592[2];
        }
        if (!this.field592[8].method459(arg0 + 12)) {
            this.field592[8] = this.field592[4];
        }
        if (!this.field592[9].method459(77)) {
            this.field592[9] = this.field592[8];
        }
        this.method338((byte) -46);
        this.method328();
        this.method1222();
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)I")
    public final int method374(int arg0, int arg1) {
        ++field451;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ch", name = "HA", descriptor = "(IIII[I)V")
    public final void method375(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field460;
        float var6 = this.field533.method2516((float) arg0, (float) arg2, (float) arg1, 1);
        if (!((float) this.field538 > var6) && !(var6 > (float) this.field562)) {
            int var7 = (int) ((float) this.field598 * this.field533.method2523((float) arg0, (float) arg2, (float) arg1, false) / (float) arg3);
            int var8 = (int) ((float) this.field557 * this.field533.method2526((byte) 56, (float) arg2, (float) arg1, (float) arg0) / (float) arg3);
            arg4[2] = (int) var6;
            arg4[0] = (int) ((float) var7 - this.field554);
            arg4[1] = (int) ((float) var8 - this.field543);
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIBZIILkca;[F)Lug;")
    public abstract class60 method376(int arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5, class755 arg6, float[] arg7);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIZ)Ltd;")
    public final class515 method377(int arg0, int arg1, boolean arg2) {
        ++field508;
        return new class753(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method378(Canvas arg0) {
        this.field434 = null;
        ++field511;
        this.field425 = null;
        if (arg0 != null && this.field496 != arg0) {
            if (this.field440.containsKey(arg0)) {
                this.field434 = this.field440.get(arg0);
                this.field425 = arg0;
            }
        } else {
            this.field425 = this.field496;
            this.field434 = this.field484;
        }
        if (this.field425 != null && this.field434 != null) {
            this.method326(-108, this.field425, this.field434);
            this.method288((byte) -79);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "(I)V")
    public final void method379(int arg0) {
        ++field340;
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(IIIIII)V")
    public final void method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field350;
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) (-arg1) + (float) arg3;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var9 = var7 * var10;
            var8 *= var10;
        }
        if (this.method287(0.0F, (float) arg1, (float) arg0, 0.0F, (float) arg3 + var8, (float) arg2 + var9, 26400)) {
            this.method294(-29513);
            this.method213(arg4, 3);
            this.method230(class231.field3462, 0, 31);
            this.method242((byte) -120, class231.field3462, 0);
            this.method355(arg5, (byte) -21);
            this.method289(false);
            this.method240(true, false);
            this.method370(32563);
            this.method240(true, true);
            this.method242((byte) -121, class234.field3509, 0);
            this.method230(class234.field3509, 0, 78);
        }
    }

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "(B)Lbt;")
    public final class417 method381(byte arg0) {
        ++field349;
        return arg0 != 42 ? null : this.field584[this.field613];
    }

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "(B)V")
    private final void method382(byte arg0) {
        if (arg0 != -83) {
            this.method322((class502) null, (class676[]) null, true);
        }
        ++field347;
        if (!this.field553) {
            float[] var2 = this.field566;
            float var3 = (float) this.field538;
            float var4 = (float) this.field562;
            float var5 = (float) (-this.field590) * this.field544 / (float) this.field557;
            float var6 = (float) (-this.field622) * this.field544 / (float) this.field598;
            float var7 = (float) (this.field486 - this.field622) * this.field544 / (float) this.field598;
            float var8 = (float) (-this.field590 + this.field436) * this.field544 / (float) this.field557;
            if (var6 != var7 && var5 != var8) {
                var2[10] = 1.0F / (var3 - var4);
                var2[3] = 0.0F;
                var2[5] = 2.0F / (var8 - var5);
                var2[6] = 0.0F;
                var2[0] = 2.0F / (-var6 + var7);
                var2[2] = 0.0F;
                var2[11] = 0.0F;
                var2[7] = 0.0F;
                var2[13] = (var5 + var8) / (var8 - var5);
                var2[9] = 0.0F;
                var2[1] = 0.0F;
                var2[8] = 0.0F;
                var2[14] = var3 / (-var4 + var3);
                var2[15] = 1.0F;
                var2[4] = 0.0F;
                var2[12] = (var6 + var7) / (-var7 + var6);
            } else {
                var2[9] = 0.0F;
                var2[4] = 0.0F;
                var2[13] = 0.0F;
                var2[6] = 0.0F;
                var2[2] = 0.0F;
                var2[7] = 0.0F;
                var2[8] = 0.0F;
                var2[11] = 0.0F;
                var2[0] = 1.0F;
                var2[3] = 0.0F;
                var2[15] = 1.0F;
                var2[12] = 0.0F;
                var2[14] = 0.0F;
                var2[1] = 0.0F;
                var2[10] = 1.0F;
                var2[5] = 1.0F;
            }
            this.method249(8);
            this.field553 = true;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
    public final void method383(int arg0) {
        ++field466;
    }

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "(B)V")
    public final void method384(byte arg0) {
        this.field527 = false;
        ++field473;
        if (arg0 == 19) {
            this.method346(true);
        }
    }

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "(I)Lau;")
    public final class245 method385(int arg0) {
        if (arg0 != 3) {
            this.field645 = null;
        }
        ++field493;
        return this.field586 != null ? this.field586.method656((byte) -115) : null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLwk;Lwk;)V")
    public final void method386(byte arg0, class431 arg1, class431 arg2) {
        ++field348;
        int var4 = 33 % ((arg0 - -67) / 43);
        boolean var5 = false;
        if (this.field629[this.field613] != arg2) {
            this.field629[this.field613] = arg2;
            this.method273((byte) -100);
            var5 = true;
        }
        if (this.field559[this.field613] != arg1) {
            this.field559[this.field613] = arg1;
            var5 = true;
            this.method286(126);
        }
        if (var5) {
            this.field618 &= -30;
        }
    }

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "()I")
    public final int method387() {
        ++field379;
        return this.field538;
    }

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "(III)V")
    public final void method388(int arg0, int arg1, int arg2) {
        if (~this.field575 != ~arg0 || ~this.field621 != ~arg1 || ~this.field601 != ~arg2) {
            this.field601 = arg2;
            this.field621 = arg1;
            this.field575 = arg0;
            this.method261((byte) -108);
            this.method344(true);
        }
        ++field505;
    }

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "(B)V")
    public final void method389(byte arg0) {
        ++field462;
        if (arg0 == -2) {
            if (this.field595[this.field613] != class656.field9402) {
                this.field595[this.field613] = class656.field9402;
                this.field584[this.field613].method851();
                this.method221((byte) -95);
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "([I)V")
    public final void method390(int[] arg0) {
        ++field437;
        arg0[1] = this.field436;
        arg0[0] = this.field486;
    }

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "(I)V")
    public abstract void method391(int arg0);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
    public abstract void method392(Canvas arg0, int arg1, Object arg2);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lza;)V")
    public final void method393(class254 arg0) {
        ++field454;
        this.field438 = ((class376) arg0).field5439;
        this.field373 = this.field438.method2568(32768, false);
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(BZ)V")
    public final void method394(byte arg0, boolean arg1) {
        ++field377;
        if (this.field627 != arg1) {
            this.field627 = arg1;
            this.method362(-103);
        }
        int var3 = 111 / ((36 - arg0) / 40);
    }

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "()Z")
    public final boolean method395() {
        ++field443;
        return false;
    }

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "(I)V")
    public static void method396(int arg0) {
        field500 = null;
        field426 = null;
        if (arg0 > -16) {
            method396(120);
        }
    }

    @OriginalMember(owner = "client!ch", name = "aa", descriptor = "(IIIIII)V")
    public final void method397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field526;
        this.method294(-29513);
        this.method213(arg4, 3);
        this.method230(class231.field3462, 0, 48);
        this.method242((byte) -127, class231.field3462, 0);
        this.method355(arg5, (byte) -78);
        this.field532.method2522((float) arg3, 1.0F, 124, (float) arg2);
        this.field532.method849(arg0, arg1, 0);
        this.method384((byte) 19);
        this.method240(true, false);
        this.method337((byte) 18);
        this.method240(true, true);
        this.method242((byte) -122, class234.field3509, 0);
        this.method230(class234.field3509, 0, 33);
    }

    @OriginalMember(owner = "client!ch", name = "DA", descriptor = "(IIII)V")
    public final void method398(int arg0, int arg1, int arg2, int arg3) {
        this.field598 = arg2;
        this.field622 = arg0;
        this.field590 = arg1;
        this.field557 = arg3;
        ++field469;
        this.method254(0);
        this.method319(125);
        this.method194((byte) -99);
        this.method301(5);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lrf;IIB)V")
    public abstract void method399(class749 arg0, int arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "(I)I")
    public final int method400(int arg0) {
        ++field341;
        if (arg0 != -226058728) {
            this.field564 = 115;
        }
        return this.field545;
    }

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "(I)V")
    private final void method401(int arg0) {
        this.field558 = false;
        ++field346;
        if (arg0 < 115) {
            this.field660 = null;
        }
        if (this.field582 != null) {
            this.field582.method1742(-971);
        }
        this.method316(-1455);
    }

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "(III[I)V")
    public final void method402(int arg0, int arg1, int arg2, int[] arg3) {
        ++field498;
        float var5 = this.field533.method2516((float) arg0, (float) arg2, (float) arg1, 1);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field622;
            var7 = this.field590;
        } else {
            var6 = (int) ((float) this.field598 * this.field533.method2523((float) arg0, (float) arg2, (float) arg1, false) / var5);
            var7 = (int) ((float) this.field557 * this.field533.method2526((byte) 56, (float) arg2, (float) arg1, (float) arg0) / var5);
        }
        arg3[1] = (int) ((float) var7 - this.field543);
        arg3[2] = (int) var5;
        arg3[0] = (int) ((float) var6 - this.field554);
    }

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "(I)V")
    public abstract void method403(int arg0);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lfu;IIII)Lka;")
    public final class282 method404(class637 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field470;
        return new class192(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lfg;IB)V")
    public abstract void method405(class436 arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "(I)V")
    public abstract void method406(int arg0);

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "()Z")
    public final boolean method407() {
        ++field407;
        return true;
    }

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "(B)V")
    public abstract void method408(byte arg0);

    @OriginalMember(owner = "client!ch", name = "V", descriptor = "(I)V")
    public abstract void method409(int arg0);

    @OriginalMember(owner = "client!ch", name = "W", descriptor = "(I)I")
    public final int method410(int arg0) {
        ++field421;
        if (arg0 < 54) {
            this.field634 = -56;
        }
        return this.field623;
    }

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "(II)V")
    public final void method411(int arg0, int arg1) {
        if (arg0 == 17024) {
            ++field488;
            if (arg1 == 1) {
                this.method386((byte) -127, class567.field8198, class567.field8198);
            } else if (arg1 == 0) {
                this.method386((byte) 43, class281.field3934, class281.field3934);
            } else if (arg1 == 2) {
                this.method386((byte) 63, class567.field8198, class596.field8472);
            } else if (~arg1 == -4) {
                this.method386((byte) 84, class281.field3934, class684.field9720);
            } else if (~arg1 == -5) {
                this.method386((byte) -121, class757.field10537, class757.field10537);
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "()Z")
    public final boolean method412() {
        ++field385;
        return true;
    }
}
