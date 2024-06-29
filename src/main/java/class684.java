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

@OriginalClass("client!bm")
public abstract class class684 extends class454 {

    @OriginalMember(owner = "client!bm", name = "Hb", descriptor = "Lqia;")
    private class547 field9424 = new class547();

    @OriginalMember(owner = "client!bm", name = "Yd", descriptor = "Z")
    public boolean field9545 = true;

    @OriginalMember(owner = "client!bm", name = "Wd", descriptor = "Ltv;")
    public class462 field9543 = new class462();

    @OriginalMember(owner = "client!bm", name = "ce", descriptor = "Ltv;")
    public class462 field9549 = new class462();

    @OriginalMember(owner = "client!bm", name = "de", descriptor = "Ltv;")
    public class462 field9550 = new class462();

    @OriginalMember(owner = "client!bm", name = "ee", descriptor = "Ltv;")
    public class462 field9551 = new class462();

    @OriginalMember(owner = "client!bm", name = "fe", descriptor = "Ltv;")
    private class462 field9552 = new class462();

    @OriginalMember(owner = "client!bm", name = "ge", descriptor = "Ltv;")
    private class462 field9553 = new class462();

    @OriginalMember(owner = "client!bm", name = "re", descriptor = "F")
    public float field9564 = 1.0F;

    @OriginalMember(owner = "client!bm", name = "te", descriptor = "[F")
    public float[] field9566 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!bm", name = "oe", descriptor = "Z")
    private boolean field9561 = false;

    @OriginalMember(owner = "client!bm", name = "ye", descriptor = "F")
    public float field9571 = 1.0F;

    @OriginalMember(owner = "client!bm", name = "De", descriptor = "F")
    private float field9576 = 1.0F;

    @OriginalMember(owner = "client!bm", name = "Ve", descriptor = "F")
    public float field9594 = 3584.0F;

    @OriginalMember(owner = "client!bm", name = "Ce", descriptor = "Z")
    private boolean field9575 = false;

    @OriginalMember(owner = "client!bm", name = "he", descriptor = "[Laia;")
    private class384[] field9554 = new class384[10];

    @OriginalMember(owner = "client!bm", name = "Re", descriptor = "I")
    public int field9590 = 0;

    @OriginalMember(owner = "client!bm", name = "Me", descriptor = "[F")
    public float[] field9585 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!bm", name = "Ye", descriptor = "Z")
    public boolean field9597 = false;

    @OriginalMember(owner = "client!bm", name = "Ne", descriptor = "I")
    public int field9586 = -1;

    @OriginalMember(owner = "client!bm", name = "Ge", descriptor = "Z")
    public boolean field9579 = false;

    @OriginalMember(owner = "client!bm", name = "Ze", descriptor = "I")
    private int field9598 = 0;

    @OriginalMember(owner = "client!bm", name = "Xe", descriptor = "I")
    public int field9596 = 0;

    @OriginalMember(owner = "client!bm", name = "ve", descriptor = "I")
    public int field9568 = 0;

    @OriginalMember(owner = "client!bm", name = "ke", descriptor = "I")
    private int field9557 = 0;

    @OriginalMember(owner = "client!bm", name = "df", descriptor = "F")
    public float field9602 = 3584.0F;

    @OriginalMember(owner = "client!bm", name = "ne", descriptor = "Z")
    private boolean field9560 = false;

    @OriginalMember(owner = "client!bm", name = "xe", descriptor = "I")
    public int field9570 = 3;

    @OriginalMember(owner = "client!bm", name = "Je", descriptor = "I")
    public int field9582 = 0;

    @OriginalMember(owner = "client!bm", name = "xf", descriptor = "I")
    private int field9621 = 0;

    @OriginalMember(owner = "client!bm", name = "Ae", descriptor = "I")
    public int field9573 = -1;

    @OriginalMember(owner = "client!bm", name = "Fe", descriptor = "Z")
    public boolean field9578 = false;

    @OriginalMember(owner = "client!bm", name = "We", descriptor = "[F")
    private float[] field9595 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!bm", name = "qe", descriptor = "[F")
    private float[] field9563 = new float[16];

    @OriginalMember(owner = "client!bm", name = "vf", descriptor = "I")
    public int field9619 = 3584;

    @OriginalMember(owner = "client!bm", name = "sf", descriptor = "I")
    public int field9616 = 0;

    @OriginalMember(owner = "client!bm", name = "hf", descriptor = "F")
    public float field9606 = 1.0F;

    @OriginalMember(owner = "client!bm", name = "uf", descriptor = "Z")
    private boolean field9618 = false;

    @OriginalMember(owner = "client!bm", name = "Cf", descriptor = "Lk;")
    public class43 field9626 = class447.field6290;

    @OriginalMember(owner = "client!bm", name = "ef", descriptor = "I")
    public int field9603 = 0;

    @OriginalMember(owner = "client!bm", name = "Jf", descriptor = "Z")
    private boolean field9633 = false;

    @OriginalMember(owner = "client!bm", name = "Oe", descriptor = "[F")
    private float[] field9587 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!bm", name = "tf", descriptor = "Z")
    public boolean field9617 = true;

    @OriginalMember(owner = "client!bm", name = "le", descriptor = "I")
    public int field9558 = 8;

    @OriginalMember(owner = "client!bm", name = "af", descriptor = "Z")
    public boolean field9599 = true;

    @OriginalMember(owner = "client!bm", name = "Ie", descriptor = "I")
    public int field9581 = 0;

    @OriginalMember(owner = "client!bm", name = "Ef", descriptor = "F")
    public float field9628 = -1.0F;

    @OriginalMember(owner = "client!bm", name = "Lf", descriptor = "[F")
    private float[] field9635 = new float[16];

    @OriginalMember(owner = "client!bm", name = "yf", descriptor = "I")
    public int field9622 = 512;

    @OriginalMember(owner = "client!bm", name = "lf", descriptor = "Z")
    private boolean field9609 = false;

    @OriginalMember(owner = "client!bm", name = "Df", descriptor = "I")
    private int field9627 = -1;

    @OriginalMember(owner = "client!bm", name = "Pf", descriptor = "Z")
    public boolean field9639 = true;

    @OriginalMember(owner = "client!bm", name = "wf", descriptor = "[F")
    private float[] field9620 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!bm", name = "me", descriptor = "I")
    public int field9559 = 50;

    @OriginalMember(owner = "client!bm", name = "Qf", descriptor = "I")
    public int field9640 = 0;

    @OriginalMember(owner = "client!bm", name = "Kf", descriptor = "I")
    private int field9634 = 0;

    @OriginalMember(owner = "client!bm", name = "Se", descriptor = "Z")
    public boolean field9591 = false;

    @OriginalMember(owner = "client!bm", name = "Af", descriptor = "Ler;")
    public class222 field9624 = class24.field401;

    @OriginalMember(owner = "client!bm", name = "Of", descriptor = "I")
    private int field9638 = 16777215;

    @OriginalMember(owner = "client!bm", name = "ag", descriptor = "F")
    public float field9650 = -1.0F;

    @OriginalMember(owner = "client!bm", name = "Hf", descriptor = "I")
    public int field9631 = 128;

    @OriginalMember(owner = "client!bm", name = "nf", descriptor = "Z")
    public boolean field9611 = true;

    @OriginalMember(owner = "client!bm", name = "Yf", descriptor = "[F")
    private float[] field9648 = new float[16];

    @OriginalMember(owner = "client!bm", name = "dg", descriptor = "I")
    public int field9653 = 0;

    @OriginalMember(owner = "client!bm", name = "Uf", descriptor = "I")
    public int field9644 = 0;

    @OriginalMember(owner = "client!bm", name = "rf", descriptor = "I")
    private int field9615 = 1;

    @OriginalMember(owner = "client!bm", name = "qf", descriptor = "I")
    public int field9614 = 512;

    @OriginalMember(owner = "client!bm", name = "cg", descriptor = "I")
    private int field9652 = -1;

    @OriginalMember(owner = "client!bm", name = "ze", descriptor = "[F")
    public float[] field9572 = this.field9620;

    @OriginalMember(owner = "client!bm", name = "Zf", descriptor = "Z")
    public boolean field9649 = true;

    @OriginalMember(owner = "client!bm", name = "bg", descriptor = "F")
    public float field9651 = 1.0F;

    @OriginalMember(owner = "client!bm", name = "Wf", descriptor = "I")
    private int field9646 = -1;

    @OriginalMember(owner = "client!bm", name = "Xf", descriptor = "Ljaclib/memory/Stream;")
    private Stream field9647 = new Stream();

    @OriginalMember(owner = "client!bm", name = "ug", descriptor = "Ltv;")
    private class462 field9670 = new class462();

    @OriginalMember(owner = "client!bm", name = "Db", descriptor = "Lkha;")
    public class687 field9420;

    @OriginalMember(owner = "client!bm", name = "Ac", descriptor = "Ljava/lang/Object;")
    public Object field9469;

    @OriginalMember(owner = "client!bm", name = "Y", descriptor = "Ljava/lang/Object;")
    private Object field9389;

    @OriginalMember(owner = "client!bm", name = "F", descriptor = "Ljava/awt/Canvas;")
    public Canvas field9370;

    @OriginalMember(owner = "client!bm", name = "V", descriptor = "Ljava/awt/Canvas;")
    private Canvas field9386;

    @OriginalMember(owner = "client!bm", name = "Qe", descriptor = "I")
    public int field9589;

    @OriginalMember(owner = "client!bm", name = "kf", descriptor = "I")
    public int field9608;

    @OriginalMember(owner = "client!bm", name = "Ed", descriptor = "I")
    private int field9525;

    @OriginalMember(owner = "client!bm", name = "hd", descriptor = "I")
    public int field9502;

    @OriginalMember(owner = "client!bm", name = "Uc", descriptor = "I")
    private int field9489;

    @OriginalMember(owner = "client!bm", name = "ld", descriptor = "I")
    public int field9506;

    @OriginalMember(owner = "client!bm", name = "we", descriptor = "Lfl;")
    private class115 field9569;

    @OriginalMember(owner = "client!bm", name = "pb", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field9406;

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "[F")
    public static float[] field9364 = new float[2];

    @OriginalMember(owner = "client!bm", name = "se", descriptor = "F")
    private float field9565;

    @OriginalMember(owner = "client!bm", name = "Ee", descriptor = "F")
    public float field9577;

    @OriginalMember(owner = "client!bm", name = "Le", descriptor = "F")
    public float field9584;

    @OriginalMember(owner = "client!bm", name = "jf", descriptor = "F")
    public float field9607;

    @OriginalMember(owner = "client!bm", name = "Ff", descriptor = "F")
    private float field9629;

    @OriginalMember(owner = "client!bm", name = "Nf", descriptor = "F")
    public float field9637;

    @OriginalMember(owner = "client!bm", name = "Sf", descriptor = "F")
    public float field9642;

    @OriginalMember(owner = "client!bm", name = "Vf", descriptor = "F")
    public float field9645;

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "I")
    public static int field9357;

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "I")
    public static int field9358;

    @OriginalMember(owner = "client!bm", name = "u", descriptor = "I")
    public static int field9359;

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "I")
    public static int field9360;

    @OriginalMember(owner = "client!bm", name = "w", descriptor = "I")
    public static int field9361;

    @OriginalMember(owner = "client!bm", name = "x", descriptor = "I")
    public static int field9362;

    @OriginalMember(owner = "client!bm", name = "y", descriptor = "I")
    public static int field9363;

    @OriginalMember(owner = "client!bm", name = "A", descriptor = "I")
    public static int field9365;

    @OriginalMember(owner = "client!bm", name = "B", descriptor = "I")
    public static int field9366;

    @OriginalMember(owner = "client!bm", name = "C", descriptor = "I")
    public static int field9367;

    @OriginalMember(owner = "client!bm", name = "D", descriptor = "I")
    public static int field9368;

    @OriginalMember(owner = "client!bm", name = "E", descriptor = "I")
    public static int field9369;

    @OriginalMember(owner = "client!bm", name = "G", descriptor = "I")
    public static int field9371;

    @OriginalMember(owner = "client!bm", name = "H", descriptor = "I")
    public static int field9372;

    @OriginalMember(owner = "client!bm", name = "I", descriptor = "I")
    public static int field9373;

    @OriginalMember(owner = "client!bm", name = "J", descriptor = "I")
    public static int field9374;

    @OriginalMember(owner = "client!bm", name = "K", descriptor = "I")
    public static int field9375;

    @OriginalMember(owner = "client!bm", name = "L", descriptor = "I")
    public static int field9376;

    @OriginalMember(owner = "client!bm", name = "M", descriptor = "I")
    public static int field9377;

    @OriginalMember(owner = "client!bm", name = "N", descriptor = "I")
    public static int field9378;

    @OriginalMember(owner = "client!bm", name = "O", descriptor = "I")
    public static int field9379;

    @OriginalMember(owner = "client!bm", name = "P", descriptor = "I")
    public static int field9380;

    @OriginalMember(owner = "client!bm", name = "Q", descriptor = "I")
    public static int field9381;

    @OriginalMember(owner = "client!bm", name = "R", descriptor = "I")
    public static int field9382;

    @OriginalMember(owner = "client!bm", name = "S", descriptor = "I")
    public static int field9383;

    @OriginalMember(owner = "client!bm", name = "T", descriptor = "I")
    public static int field9384;

    @OriginalMember(owner = "client!bm", name = "U", descriptor = "I")
    public static int field9385;

    @OriginalMember(owner = "client!bm", name = "W", descriptor = "I")
    public static int field9387;

    @OriginalMember(owner = "client!bm", name = "X", descriptor = "I")
    public static int field9388;

    @OriginalMember(owner = "client!bm", name = "Z", descriptor = "I")
    public static int field9390;

    @OriginalMember(owner = "client!bm", name = "ab", descriptor = "I")
    public static int field9391;

    @OriginalMember(owner = "client!bm", name = "bb", descriptor = "I")
    public static int field9392;

    @OriginalMember(owner = "client!bm", name = "cb", descriptor = "I")
    public static int field9393;

    @OriginalMember(owner = "client!bm", name = "db", descriptor = "I")
    public static int field9394;

    @OriginalMember(owner = "client!bm", name = "eb", descriptor = "I")
    public static int field9395;

    @OriginalMember(owner = "client!bm", name = "fb", descriptor = "I")
    public static int field9396;

    @OriginalMember(owner = "client!bm", name = "gb", descriptor = "I")
    public static int field9397;

    @OriginalMember(owner = "client!bm", name = "hb", descriptor = "I")
    public static int field9398;

    @OriginalMember(owner = "client!bm", name = "ib", descriptor = "I")
    public static int field9399;

    @OriginalMember(owner = "client!bm", name = "jb", descriptor = "I")
    public static int field9400;

    @OriginalMember(owner = "client!bm", name = "kb", descriptor = "I")
    public static int field9401;

    @OriginalMember(owner = "client!bm", name = "lb", descriptor = "I")
    public static int field9402;

    @OriginalMember(owner = "client!bm", name = "mb", descriptor = "I")
    public static int field9403;

    @OriginalMember(owner = "client!bm", name = "nb", descriptor = "I")
    public static int field9404;

    @OriginalMember(owner = "client!bm", name = "ob", descriptor = "I")
    public static int field9405;

    @OriginalMember(owner = "client!bm", name = "qb", descriptor = "I")
    public static int field9407;

    @OriginalMember(owner = "client!bm", name = "rb", descriptor = "I")
    public static int field9408;

    @OriginalMember(owner = "client!bm", name = "sb", descriptor = "I")
    public static int field9409;

    @OriginalMember(owner = "client!bm", name = "tb", descriptor = "I")
    public static int field9410;

    @OriginalMember(owner = "client!bm", name = "ub", descriptor = "I")
    public static int field9411;

    @OriginalMember(owner = "client!bm", name = "vb", descriptor = "I")
    public static int field9412;

    @OriginalMember(owner = "client!bm", name = "wb", descriptor = "I")
    public static int field9413;

    @OriginalMember(owner = "client!bm", name = "xb", descriptor = "I")
    public static int field9414;

    @OriginalMember(owner = "client!bm", name = "yb", descriptor = "I")
    public static int field9415;

    @OriginalMember(owner = "client!bm", name = "zb", descriptor = "I")
    public static int field9416;

    @OriginalMember(owner = "client!bm", name = "Ab", descriptor = "I")
    public static int field9417;

    @OriginalMember(owner = "client!bm", name = "Bb", descriptor = "I")
    public static int field9418;

    @OriginalMember(owner = "client!bm", name = "Cb", descriptor = "I")
    public static int field9419;

    @OriginalMember(owner = "client!bm", name = "Eb", descriptor = "I")
    public static int field9421;

    @OriginalMember(owner = "client!bm", name = "Fb", descriptor = "I")
    public static int field9422;

    @OriginalMember(owner = "client!bm", name = "Gb", descriptor = "I")
    public static int field9423;

    @OriginalMember(owner = "client!bm", name = "Ib", descriptor = "I")
    public static int field9425;

    @OriginalMember(owner = "client!bm", name = "Jb", descriptor = "I")
    public static int field9426;

    @OriginalMember(owner = "client!bm", name = "Kb", descriptor = "I")
    public static int field9427;

    @OriginalMember(owner = "client!bm", name = "Lb", descriptor = "I")
    public static int field9428;

    @OriginalMember(owner = "client!bm", name = "Mb", descriptor = "I")
    public static int field9429;

    @OriginalMember(owner = "client!bm", name = "Nb", descriptor = "I")
    public static int field9430;

    @OriginalMember(owner = "client!bm", name = "Ob", descriptor = "I")
    public static int field9431;

    @OriginalMember(owner = "client!bm", name = "Qb", descriptor = "I")
    public static int field9433;

    @OriginalMember(owner = "client!bm", name = "Rb", descriptor = "I")
    public static int field9434;

    @OriginalMember(owner = "client!bm", name = "Sb", descriptor = "I")
    public static int field9435;

    @OriginalMember(owner = "client!bm", name = "Tb", descriptor = "I")
    public static int field9436;

    @OriginalMember(owner = "client!bm", name = "Vb", descriptor = "I")
    public static int field9438;

    @OriginalMember(owner = "client!bm", name = "Wb", descriptor = "I")
    public static int field9439;

    @OriginalMember(owner = "client!bm", name = "Xb", descriptor = "I")
    public static int field9440;

    @OriginalMember(owner = "client!bm", name = "Yb", descriptor = "I")
    public static int field9441;

    @OriginalMember(owner = "client!bm", name = "Zb", descriptor = "I")
    public static int field9442;

    @OriginalMember(owner = "client!bm", name = "ac", descriptor = "I")
    public static int field9443;

    @OriginalMember(owner = "client!bm", name = "bc", descriptor = "I")
    public static int field9444;

    @OriginalMember(owner = "client!bm", name = "ec", descriptor = "I")
    public static int field9447;

    @OriginalMember(owner = "client!bm", name = "fc", descriptor = "I")
    public static int field9448;

    @OriginalMember(owner = "client!bm", name = "gc", descriptor = "I")
    public static int field9449;

    @OriginalMember(owner = "client!bm", name = "hc", descriptor = "I")
    public static int field9450;

    @OriginalMember(owner = "client!bm", name = "ic", descriptor = "I")
    public static int field9451;

    @OriginalMember(owner = "client!bm", name = "jc", descriptor = "I")
    public static int field9452;

    @OriginalMember(owner = "client!bm", name = "kc", descriptor = "I")
    public static int field9453;

    @OriginalMember(owner = "client!bm", name = "lc", descriptor = "I")
    public static int field9454;

    @OriginalMember(owner = "client!bm", name = "mc", descriptor = "I")
    public static int field9455;

    @OriginalMember(owner = "client!bm", name = "nc", descriptor = "I")
    public static int field9456;

    @OriginalMember(owner = "client!bm", name = "oc", descriptor = "I")
    public static int field9457;

    @OriginalMember(owner = "client!bm", name = "pc", descriptor = "I")
    public static int field9458;

    @OriginalMember(owner = "client!bm", name = "qc", descriptor = "I")
    public static int field9459;

    @OriginalMember(owner = "client!bm", name = "rc", descriptor = "I")
    public static int field9460;

    @OriginalMember(owner = "client!bm", name = "sc", descriptor = "I")
    public static int field9461;

    @OriginalMember(owner = "client!bm", name = "tc", descriptor = "I")
    public static int field9462;

    @OriginalMember(owner = "client!bm", name = "uc", descriptor = "I")
    public static int field9463;

    @OriginalMember(owner = "client!bm", name = "vc", descriptor = "I")
    public static int field9464;

    @OriginalMember(owner = "client!bm", name = "wc", descriptor = "I")
    public static int field9465;

    @OriginalMember(owner = "client!bm", name = "xc", descriptor = "I")
    public static int field9466;

    @OriginalMember(owner = "client!bm", name = "yc", descriptor = "I")
    public static int field9467;

    @OriginalMember(owner = "client!bm", name = "zc", descriptor = "I")
    public static int field9468;

    @OriginalMember(owner = "client!bm", name = "Bc", descriptor = "I")
    public static int field9470;

    @OriginalMember(owner = "client!bm", name = "Cc", descriptor = "I")
    public static int field9471;

    @OriginalMember(owner = "client!bm", name = "Dc", descriptor = "I")
    public static int field9472;

    @OriginalMember(owner = "client!bm", name = "Ec", descriptor = "I")
    public static int field9473;

    @OriginalMember(owner = "client!bm", name = "Fc", descriptor = "I")
    public static int field9474;

    @OriginalMember(owner = "client!bm", name = "Gc", descriptor = "I")
    public static int field9475;

    @OriginalMember(owner = "client!bm", name = "Hc", descriptor = "I")
    public static int field9476;

    @OriginalMember(owner = "client!bm", name = "Ic", descriptor = "I")
    public static int field9477;

    @OriginalMember(owner = "client!bm", name = "Jc", descriptor = "I")
    public static int field9478;

    @OriginalMember(owner = "client!bm", name = "Kc", descriptor = "I")
    public static int field9479;

    @OriginalMember(owner = "client!bm", name = "Lc", descriptor = "I")
    public static int field9480;

    @OriginalMember(owner = "client!bm", name = "Mc", descriptor = "I")
    public static int field9481;

    @OriginalMember(owner = "client!bm", name = "Nc", descriptor = "I")
    public static int field9482;

    @OriginalMember(owner = "client!bm", name = "Oc", descriptor = "I")
    public static int field9483;

    @OriginalMember(owner = "client!bm", name = "Pc", descriptor = "I")
    public static int field9484;

    @OriginalMember(owner = "client!bm", name = "Rc", descriptor = "I")
    public static int field9486;

    @OriginalMember(owner = "client!bm", name = "Sc", descriptor = "I")
    public static int field9487;

    @OriginalMember(owner = "client!bm", name = "Tc", descriptor = "I")
    public static int field9488;

    @OriginalMember(owner = "client!bm", name = "Vc", descriptor = "I")
    public static int field9490;

    @OriginalMember(owner = "client!bm", name = "Wc", descriptor = "I")
    public static int field9491;

    @OriginalMember(owner = "client!bm", name = "Xc", descriptor = "I")
    public static int field9492;

    @OriginalMember(owner = "client!bm", name = "Yc", descriptor = "I")
    public static int field9493;

    @OriginalMember(owner = "client!bm", name = "Zc", descriptor = "I")
    public static int field9494;

    @OriginalMember(owner = "client!bm", name = "ad", descriptor = "I")
    public static int field9495;

    @OriginalMember(owner = "client!bm", name = "bd", descriptor = "I")
    public static int field9496;

    @OriginalMember(owner = "client!bm", name = "cd", descriptor = "I")
    public static int field9497;

    @OriginalMember(owner = "client!bm", name = "dd", descriptor = "I")
    public static int field9498;

    @OriginalMember(owner = "client!bm", name = "ed", descriptor = "I")
    public static int field9499;

    @OriginalMember(owner = "client!bm", name = "fd", descriptor = "I")
    public static int field9500;

    @OriginalMember(owner = "client!bm", name = "gd", descriptor = "I")
    public static int field9501;

    @OriginalMember(owner = "client!bm", name = "id", descriptor = "I")
    public static int field9503;

    @OriginalMember(owner = "client!bm", name = "jd", descriptor = "I")
    public static int field9504;

    @OriginalMember(owner = "client!bm", name = "kd", descriptor = "I")
    public static int field9505;

    @OriginalMember(owner = "client!bm", name = "md", descriptor = "I")
    public static int field9507;

    @OriginalMember(owner = "client!bm", name = "nd", descriptor = "I")
    public static int field9508;

    @OriginalMember(owner = "client!bm", name = "od", descriptor = "I")
    public static int field9509;

    @OriginalMember(owner = "client!bm", name = "pd", descriptor = "I")
    public static int field9510;

    @OriginalMember(owner = "client!bm", name = "qd", descriptor = "I")
    public static int field9511;

    @OriginalMember(owner = "client!bm", name = "rd", descriptor = "I")
    public static int field9512;

    @OriginalMember(owner = "client!bm", name = "sd", descriptor = "I")
    public static int field9513;

    @OriginalMember(owner = "client!bm", name = "td", descriptor = "I")
    public static int field9514;

    @OriginalMember(owner = "client!bm", name = "ud", descriptor = "I")
    public static int field9515;

    @OriginalMember(owner = "client!bm", name = "vd", descriptor = "I")
    public static int field9516;

    @OriginalMember(owner = "client!bm", name = "wd", descriptor = "I")
    public static int field9517;

    @OriginalMember(owner = "client!bm", name = "xd", descriptor = "I")
    public static int field9518;

    @OriginalMember(owner = "client!bm", name = "yd", descriptor = "I")
    public static int field9519;

    @OriginalMember(owner = "client!bm", name = "zd", descriptor = "I")
    public static int field9520;

    @OriginalMember(owner = "client!bm", name = "Ad", descriptor = "I")
    public static int field9521;

    @OriginalMember(owner = "client!bm", name = "Bd", descriptor = "I")
    public static int field9522;

    @OriginalMember(owner = "client!bm", name = "Cd", descriptor = "I")
    public static int field9523;

    @OriginalMember(owner = "client!bm", name = "Dd", descriptor = "I")
    public static int field9524;

    @OriginalMember(owner = "client!bm", name = "Fd", descriptor = "I")
    public static int field9526;

    @OriginalMember(owner = "client!bm", name = "Gd", descriptor = "I")
    public static int field9527;

    @OriginalMember(owner = "client!bm", name = "Hd", descriptor = "I")
    public static int field9528;

    @OriginalMember(owner = "client!bm", name = "Id", descriptor = "I")
    public static int field9529;

    @OriginalMember(owner = "client!bm", name = "Jd", descriptor = "I")
    public static int field9530;

    @OriginalMember(owner = "client!bm", name = "Kd", descriptor = "I")
    public static int field9531;

    @OriginalMember(owner = "client!bm", name = "Ld", descriptor = "I")
    public static int field9532;

    @OriginalMember(owner = "client!bm", name = "Md", descriptor = "I")
    public static int field9533;

    @OriginalMember(owner = "client!bm", name = "Nd", descriptor = "I")
    public static int field9534;

    @OriginalMember(owner = "client!bm", name = "Od", descriptor = "I")
    public static int field9535;

    @OriginalMember(owner = "client!bm", name = "Pd", descriptor = "I")
    public static int field9536;

    @OriginalMember(owner = "client!bm", name = "Qd", descriptor = "I")
    public static int field9537;

    @OriginalMember(owner = "client!bm", name = "Rd", descriptor = "I")
    public static int field9538;

    @OriginalMember(owner = "client!bm", name = "Sd", descriptor = "I")
    public static int field9539;

    @OriginalMember(owner = "client!bm", name = "Td", descriptor = "I")
    public static int field9540;

    @OriginalMember(owner = "client!bm", name = "Ud", descriptor = "I")
    public static int field9541;

    @OriginalMember(owner = "client!bm", name = "Vd", descriptor = "I")
    public static int field9542;

    @OriginalMember(owner = "client!bm", name = "Xd", descriptor = "I")
    public int field9544;

    @OriginalMember(owner = "client!bm", name = "Zd", descriptor = "I")
    public static int field9546;

    @OriginalMember(owner = "client!bm", name = "ae", descriptor = "I")
    public int field9547;

    @OriginalMember(owner = "client!bm", name = "be", descriptor = "I")
    public int field9548;

    @OriginalMember(owner = "client!bm", name = "je", descriptor = "I")
    public int field9556;

    @OriginalMember(owner = "client!bm", name = "pe", descriptor = "I")
    private int field9562;

    @OriginalMember(owner = "client!bm", name = "ue", descriptor = "I")
    public int field9567;

    @OriginalMember(owner = "client!bm", name = "Be", descriptor = "I")
    public int field9574;

    @OriginalMember(owner = "client!bm", name = "Te", descriptor = "I")
    public int field9592;

    @OriginalMember(owner = "client!bm", name = "cf", descriptor = "I")
    public int field9601;

    @OriginalMember(owner = "client!bm", name = "mf", descriptor = "I")
    public int field9610;

    @OriginalMember(owner = "client!bm", name = "zf", descriptor = "I")
    public int field9623;

    @OriginalMember(owner = "client!bm", name = "Mf", descriptor = "I")
    private int field9636;

    @OriginalMember(owner = "client!bm", name = "Rf", descriptor = "I")
    public int field9641;

    @OriginalMember(owner = "client!bm", name = "Cg", descriptor = "I")
    private int field9678;

    @OriginalMember(owner = "client!bm", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!bm", name = "fg", descriptor = "Lru;")
    private class246 field9655;

    @OriginalMember(owner = "client!bm", name = "gf", descriptor = "Lfha;")
    private class275 field9605;

    @OriginalMember(owner = "client!bm", name = "Ue", descriptor = "Lbia;")
    public class329 field9593;

    @OriginalMember(owner = "client!bm", name = "Tf", descriptor = "Laia;")
    private class384 field9643;

    @OriginalMember(owner = "client!bm", name = "Bf", descriptor = "Lvfa;")
    private class465 field9625;

    @OriginalMember(owner = "client!bm", name = "og", descriptor = "Lu;")
    private class60 field9664;

    @OriginalMember(owner = "client!bm", name = "qg", descriptor = "Lu;")
    private class60 field9666;

    @OriginalMember(owner = "client!bm", name = "yg", descriptor = "Lu;")
    private class60 field9674;

    @OriginalMember(owner = "client!bm", name = "hg", descriptor = "Loca;")
    public class613 field9657;

    @OriginalMember(owner = "client!bm", name = "ig", descriptor = "Loca;")
    public class613 field9658;

    @OriginalMember(owner = "client!bm", name = "jg", descriptor = "Loca;")
    public class613 field9659;

    @OriginalMember(owner = "client!bm", name = "kg", descriptor = "Loca;")
    public class613 field9660;

    @OriginalMember(owner = "client!bm", name = "lg", descriptor = "Loca;")
    public class613 field9661;

    @OriginalMember(owner = "client!bm", name = "ng", descriptor = "Loca;")
    public class613 field9663;

    @OriginalMember(owner = "client!bm", name = "rg", descriptor = "Loca;")
    public class613 field9667;

    @OriginalMember(owner = "client!bm", name = "sg", descriptor = "Loca;")
    public class613 field9668;

    @OriginalMember(owner = "client!bm", name = "vg", descriptor = "Loca;")
    public class613 field9671;

    @OriginalMember(owner = "client!bm", name = "wg", descriptor = "Loca;")
    public class613 field9672;

    @OriginalMember(owner = "client!bm", name = "gg", descriptor = "Lmia;")
    private class657 field9656;

    @OriginalMember(owner = "client!bm", name = "mg", descriptor = "Lmia;")
    public class657 field9662;

    @OriginalMember(owner = "client!bm", name = "pg", descriptor = "Lmia;")
    public class657 field9665;

    @OriginalMember(owner = "client!bm", name = "tg", descriptor = "Lmia;")
    public class657 field9669;

    @OriginalMember(owner = "client!bm", name = "xg", descriptor = "Lmia;")
    public class657 field9673;

    @OriginalMember(owner = "client!bm", name = "zg", descriptor = "Lmia;")
    private class657 field9675;

    @OriginalMember(owner = "client!bm", name = "Ag", descriptor = "Lmia;")
    private class657 field9676;

    @OriginalMember(owner = "client!bm", name = "dc", descriptor = "Leb;")
    public class9 field9446;

    @OriginalMember(owner = "client!bm", name = "Qc", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field9485;

    @OriginalMember(owner = "client!bm", name = "Ub", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field9437;

    @OriginalMember(owner = "client!bm", name = "Pb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field9432;

    @OriginalMember(owner = "client!bm", name = "ie", descriptor = "Z")
    public boolean field9555;

    @OriginalMember(owner = "client!bm", name = "Ke", descriptor = "Z")
    public boolean field9583;

    @OriginalMember(owner = "client!bm", name = "bf", descriptor = "Z")
    public boolean field9600;

    @OriginalMember(owner = "client!bm", name = "ff", descriptor = "Z")
    public boolean field9604;

    @OriginalMember(owner = "client!bm", name = "of", descriptor = "Z")
    public boolean field9612;

    @OriginalMember(owner = "client!bm", name = "Bg", descriptor = "Z")
    public boolean field9677;

    @OriginalMember(owner = "client!bm", name = "Pe", descriptor = "[Lbia;")
    private class329[] field9588;

    @OriginalMember(owner = "client!bm", name = "If", descriptor = "[Lkh;")
    public class354[] field9632;

    @OriginalMember(owner = "client!bm", name = "cc", descriptor = "[Lmb;")
    public static class410[] field9445;

    @OriginalMember(owner = "client!bm", name = "Gf", descriptor = "[Lvv;")
    public class442[] field9630;

    @OriginalMember(owner = "client!bm", name = "eg", descriptor = "[Lvv;")
    public class442[] field9654;

    @OriginalMember(owner = "client!bm", name = "He", descriptor = "[Ltv;")
    public class462[] field9580;

    @OriginalMember(owner = "client!bm", name = "pf", descriptor = "[Lpk;")
    public class621[] field9613;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(I)Lsq;", line = 3)
    public final class207 method3707(int arg0) {
        if (arg0 <= 19) {
            this.field9640 = 104;
        }
        ++field9546;
        return this.field9625 != null ? this.field9625.method2752(true) : null;
    }

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "()Lwc;", line = 15)
    public final class376 method94() {
        ++field9421;
        return this.field9549;
    }

    @OriginalMember(owner = "client!bm", name = "U", descriptor = "(IIIII)V", line = 23)
    public final void method160(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method134(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
        ++field9450;
    }

    @OriginalMember(owner = "client!bm", name = "JA", descriptor = "(IIIIII)I", line = 34)
    public final int method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9470;
        int var7 = 0;
        float var8 = (float) arg2 * this.field9549.field6663 + (float) arg0 * this.field9549.field6665 + (float) arg1 * this.field9549.field6681 + this.field9549.field6695;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field9549.field6663 + (float) arg3 * this.field9549.field6665 + (float) arg4 * this.field9549.field6681 + this.field9549.field6695;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if ((float) this.field9559 > var8 && var9 < (float) this.field9559) {
            var7 |= 16;
        } else if (var8 > (float) this.field9619 && (float) this.field9619 < var9) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field9549.field6648 + (float) arg0 * this.field9549.field6662 + (float) arg1 * this.field9549.field6684 + this.field9549.field6652) * (float) this.field9622 / var8);
        int var11 = (int) (((float) arg5 * this.field9549.field6648 + (float) arg3 * this.field9549.field6662 + (float) arg4 * this.field9549.field6684 + this.field9549.field6652) * (float) this.field9622 / var9);
        if (this.field9642 > (float) var10 && this.field9642 > (float) var11) {
            var7 |= 1;
        } else if ((float) var10 > this.field9645 && (float) var11 > this.field9645) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field9549.field6687 + (float) arg0 * this.field9549.field6696 + (float) arg1 * this.field9549.field6655 + this.field9549.field6656) * (float) this.field9614 / var8);
        int var13 = (int) (((float) arg5 * this.field9549.field6687 + (float) arg3 * this.field9549.field6696 + (float) arg4 * this.field9549.field6655 + this.field9549.field6656) * (float) this.field9614 / var9);
        if (this.field9607 > (float) var12 && (float) var13 < this.field9607) {
            var7 |= 4;
        } else if (this.field9584 < (float) var12 && (float) var13 > this.field9584) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILvv;Lvv;)V", line = 87)
    public final void method3708(int arg0, class442 arg1, class442 arg2) {
        ++field9413;
        boolean var4 = false;
        if (arg0 < 80) {
            this.method150((class415) null, -56, 108, -27, -64);
        }
        if (this.field9654[this.field9568] != arg2) {
            this.field9654[this.field9568] = arg2;
            this.method1386(-3832);
            var4 = true;
        }
        if (this.field9630[this.field9568] != arg1) {
            this.field9630[this.field9568] = arg1;
            this.method1427((byte) -128);
            var4 = true;
        }
        if (var4) {
            this.field9562 &= -30;
        }
    }

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "()I", line = 119)
    public final int method147() {
        ++field9368;
        return this.field9559;
    }

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "(I)I", line = 127)
    public final int method3709(int arg0) {
        ++field9538;
        return arg0 != -11036 ? -127 : this.field9621;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILem;I[FIZ)Lbaa;", line = 143)
    public final class620 method3710(int arg0, class610 arg1, int arg2, float[] arg3, int arg4, boolean arg5) {
        int var7 = -112 / ((arg4 - 72) / 54);
        ++field9434;
        return this.method1387((byte) 24, arg2, 0, arg5, arg3, 0, arg1, arg0);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZLbia;)V", line = 153)
    public final void method3711(boolean arg0, class329 arg1) {
        if (arg0) {
            this.method3788(-75);
        }
        if (this.field9588[this.field9568] != arg1) {
            this.field9588[this.field9568] = arg1;
            if (arg1 != null) {
                arg1.method1793(3323);
            } else {
                this.method1404(13039);
            }
            this.field9562 &= -2;
        }
        ++field9429;
    }

    @OriginalMember(owner = "client!bm", name = "X", descriptor = "(I)V", line = 175)
    public final void method64(int arg0) {
        ++field9496;
        this.field9570 = 0;
        while (arg0 > 1) {
            arg0 >>= 1;
            ++this.field9570;
        }
        this.field9558 = 1 << this.field9570;
    }

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "(I)V", line = 192)
    public final void method82(int arg0) {
        ++field9397;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ltj;)V", line = 201)
    public final void method170(class662 arg0) {
        this.field9625 = (class465) arg0;
        ++field9532;
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(I)Lza;", line = 210)
    public final class702 method161(int arg0) {
        ++field9371;
        class495 var2 = new class495(arg0);
        this.field9424.method3110(var2, 1);
        return var2;
    }

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "()V", line = 235)
    public void method84() {
        ++field9357;
        if (!this.field9560) {
            for (class627 var1 = this.field9424.method3111(116); var1 != null; var1 = this.field9424.method3116(-104)) {
                ((class495) var1).method2876((byte) -105);
            }
            Enumeration var2 = this.field9432.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method1384(this.field9432.get(var3), true, var3);
            }
            class283.method1700(0, false, true);
            this.field9406.release();
            this.field9560 = true;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB)Lru;", line = 270)
    public final class246 method3712(int arg0, byte arg1) {
        if (arg1 <= 91) {
            this.field9650 = -0.91040355F;
        }
        ++field9403;
        if (~(arg0 * 2) < ~this.field9655.method819((byte) -115)) {
            this.field9655.method818(arg0, (byte) 116);
        }
        return this.field9655;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lwga;IB)V", line = 286)
    public final void method3713(class506 arg0, int arg1, byte arg2) {
        int var4 = -63 % ((arg2 - 21) / 59);
        ++field9518;
        this.method1403(arg0, false, (byte) 0, arg1);
    }

    @OriginalMember(owner = "client!bm", name = "A", descriptor = "(ILaa;II)V", line = 296)
    public final void method83(int arg0, class81 arg1, int arg2, int arg3) {
        ++field9441;
        class251 var5 = (class251) arg1;
        class620 var6 = var5.field3183;
        this.method3778(false);
        this.method3711(false, var6);
        this.method3737(3793, 1);
        this.method3708(115, class409.field5765, class409.field5765);
        this.method3777(false, 0, class663.field9083);
        this.method3717(arg0, (byte) -76);
        this.field9543.method2738((float) this.field9506, 0.0F, (float) this.field9502, 13);
        this.method3744(false);
        this.field9580[0].method2738(var6.method374((float) this.field9506, true), 1.0F, var6.method376((float) this.field9502, -31566), 13);
        this.field9580[0].method2719(-29278, var6.method376((float) (-arg2), -31566), var6.method374((float) (-arg3), true), 0.0F);
        this.field9632[0] = class641.field8858;
        this.method3728((byte) 35);
        this.method3758((byte) -120);
        this.method3734((byte) -14);
        this.method3777(false, 0, class632.field8774);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(III[BZLem;)Lbaa;", line = 323)
    public final class620 method3714(int arg0, int arg1, int arg2, byte[] arg3, boolean arg4, class610 arg5) {
        ++field9465;
        if (arg1 != 0) {
            this.field9560 = true;
        }
        return this.method1413(arg2, arg4, arg3, arg0, arg5, arg1, 0, 0);
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(B)V", line = 334)
    private final void method3715(byte arg0) {
        if (class573.field8010 != this.field9626) {
            class43 var2 = this.field9626;
            this.field9626 = class573.field8010;
            if (!var2.method362(13)) {
                this.method3719(-23987);
            }
            this.method3748(-125);
            this.field9572 = this.field9563;
            this.method3783((byte) -59);
            this.field9562 &= -8;
        }
        ++field9478;
        int var3 = 60 % ((arg0 - -74) / 44);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIIII)V", line = 359)
    public final void method145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field9453;
        float var10 = (float) arg2 - (float) arg0;
        float var11 = (float) (-arg1) + (float) arg3;
        float var12;
        if (var10 == 0.0F && var11 == 0.0F) {
            var12 = 1.0F;
        } else {
            float var13 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            var11 *= var13;
            var12 = var10 * var13;
        }
        this.method3755((byte) -8);
        this.method3717(arg4, (byte) -98);
        this.method3777(false, 0, class663.field9083);
        this.method3713(class663.field9083, 0, (byte) -122);
        this.method3737(3793, arg5);
        this.method3726((byte) 83);
        this.method1397((byte) 126, false);
        int var14 = arg8 % (arg6 + arg7);
        float var15 = (float) arg6 * var12;
        float var16 = (float) arg6 * var11;
        float var17 = 0.0F;
        float var18 = 0.0F;
        float var19 = var15;
        float var20 = var16;
        if (arg6 < var14) {
            var17 = (float) (arg6 + arg7 + -var14) * var12;
            var18 = (float) (arg6 + arg7 + -var14) * var11;
        } else {
            var20 = (float) (arg6 - var14) * var11;
            var19 = (float) (-var14 + arg6) * var12;
        }
        float var21 = (float) arg0 + var17;
        float var22 = (float) arg1 + var18;
        float var23 = (float) arg7 * var12;
        float var24 = (float) arg7 * var11;
        while (true) {
            if (arg0 >= arg2) {
                if (var21 < (float) arg2) {
                    break;
                }
                if ((float) arg2 > var19 + var21) {
                    var19 = (float) arg2 - var21;
                }
            } else {
                if ((float) arg2 < var21) {
                    break;
                }
                if (var19 + var21 > (float) arg2) {
                    var19 = (float) arg2 + -var21;
                }
            }
            if (arg3 <= arg1) {
                if (var22 < (float) arg3) {
                    break;
                }
                if (var20 + var22 < (float) arg3) {
                    var20 = (float) arg3 + -var22;
                }
            } else {
                if ((float) arg3 < var22) {
                    break;
                }
                if (var20 + var22 > (float) arg3) {
                    var20 = (float) arg3 - var22;
                }
            }
            if (!this.method3741(var21, 0.0F, var22, var20 + var22, var19 + var21, 0.0F, (byte) 80)) {
                return;
            }
            var22 += var20 + var24;
            this.method3760(1);
            var21 += var19 + var23;
            var19 = var15;
            var20 = var16;
        }
        this.method1397((byte) 123, true);
        this.method3713(class632.field8774, 0, (byte) 84);
        this.method3777(false, 0, class632.field8774);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZI)V", line = 478)
    public final void method3716(boolean arg0, int arg1) {
        if (this.field9611 != arg0) {
            this.field9611 = arg0;
            this.method1433(0);
        }
        ++field9440;
        if (arg1 > -25) {
            this.field9602 = -0.16561928F;
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(IB)V", line = 497)
    public final void method3717(int arg0, byte arg1) {
        ++field9516;
        if (arg1 < -72) {
            if (~this.field9574 != ~arg0) {
                this.field9574 = arg0;
                this.method1406(102);
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "()Z", line = 513)
    public final boolean method113() {
        ++field9514;
        return true;
    }

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "(I)Ltv;", line = 523)
    public final class462 method3718(int arg0) {
        if (arg0 >= -56) {
            return null;
        } else {
            ++field9480;
            return this.field9551;
        }
    }

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "(B)V", line = 536)
    public void method1380(byte arg0) {
        this.method3766(0);
        ++field9410;
        if (arg0 == -1) {
            ;
        }
    }

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "(I)V", line = 550)
    private final void method3719(int arg0) {
        ++field9461;
        if (arg0 != -23987) {
            this.field9657 = null;
        }
        this.field9609 = false;
        if (this.field9643 != null) {
            this.field9643.method1865(-23163);
        }
        this.method1409((byte) -40);
    }

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "(I)V", line = 569)
    public final void method68(int arg0) {
        ++field9430;
        if (arg0 >= 128 && ~arg0 >= -1025) {
            if (this.field9569 != null) {
                this.field9569.method784(0);
            }
            this.field9631 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 587)
    public final void method98(Canvas arg0, int arg1, int arg2) {
        ++field9394;
        if (this.field9370 == arg0) {
            throw new RuntimeException();
        } else if (!this.field9432.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var7) {
                }
                Object var6 = this.method1394(false, arg0);
                if (var6 == null) {
                    throw new RuntimeException();
                } else {
                    this.field9432.put(arg0, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "EA", descriptor = "(IIII)V", line = 626)
    public final void method78(int arg0, int arg1, int arg2, int arg3) {
        ++field9463;
        if (!this.field9555) {
            throw new RuntimeException("");
        } else {
            this.field9621 = arg3;
            this.field9636 = arg0;
            this.field9627 = arg1;
            this.field9652 = arg2;
            if (this.field9633) {
                this.field9554[3].method2311(1);
                this.field9554[3].method1867(-128);
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lbe;Z)Lac;", line = 649)
    public final class712 method60(class196 arg0, boolean arg1) {
        ++field9500;
        class712 var9;
        if (arg0.field2527 != 0 && arg0.field2525 != 0) {
            int[] var3 = new int[arg0.field2527 * arg0.field2525];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field2523 != null) {
                for (int var6 = 0; arg0.field2525 > var6; ++var6) {
                    for (int var7 = 0; arg0.field2527 > var7; ++var7) {
                        var3[var5++] = class216.method1308(arg0.field2529[class272.method1629(255, arg0.field2521[var4])], arg0.field2523[var4] << 24);
                        ++var4;
                    }
                }
            } else {
                for (int var8 = 0; arg0.field2525 > var8; ++var8) {
                    for (int var10 = 0; ~arg0.field2527 < ~var10; ++var10) {
                        int var11 = arg0.field2529[255 & arg0.field2521[var4++]];
                        var3[var5++] = ~var11 != -1 ? class216.method1308(-16777216, var11) : 0;
                    }
                }
            }
            var9 = this.method2666(arg0.field2525, arg0.field2527, (byte) -48, var3, 0, arg0.field2527);
        } else {
            var9 = this.method2666(1, 1, (byte) -48, new int[1], 0, 1);
        }
        var9.method1874(arg0.field2526, arg0.field2522, arg0.field2528, arg0.field2524);
        return var9;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZ)V", line = 717)
    public final void method3720(int arg0, boolean arg1) {
        if (!arg1 != !this.field9591) {
            this.field9591 = arg1;
            this.method1390((byte) 88);
            this.field9562 &= -32;
        }
        ++field9416;
        if (arg0 != 0) {
            this.method84();
        }
    }

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "(I)V", line = 738)
    public final void method164(int arg0) {
        ++field9511;
    }

    @OriginalMember(owner = "client!bm", name = "w", descriptor = "()Lwc;", line = 747)
    public final class376 method114() {
        ++field9533;
        return this.field9670;
    }

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "(I)V", line = 755)
    public void method97(int arg0) {
        ++field9474;
        if (this.field9569 != null) {
            this.field9569.method783(false);
        }
        this.field9610 = arg0 & Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 766)
    public final class402 method101(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field9460;
        return new class521(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "(I)V", line = 774)
    public final void method3721(int arg0) {
        ++field9433;
        if (this.field9562 != arg0) {
            this.method3715((byte) -118);
            this.method3730((byte) -25, true);
            this.method3720(0, true);
            this.method3765(true, arg0 ^ -16);
            this.method3737(arg0 ^ 3777, 1);
            this.field9562 = 16;
        }
    }

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "(I)V", line = 794)
    public final void method3722(int arg0) {
        if (this.field9562 != 4) {
            this.method3787(arg0 + -20221);
            this.method3730((byte) -25, false);
            this.method3745(false, 93);
            this.method3720(0, false);
            this.method3765(false, -32);
            this.method3725(false, 114, -2, false);
            this.method3737(3793, 1);
            this.method3781(-3, 0);
            this.field9562 = 4;
        }
        if (arg0 == 20330) {
            ++field9405;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lcd;I)V", line = 821)
    public final void method155(class603 arg0, int arg1) {
        ++field9427;
        this.field9605.method1648(this, arg0, 2, arg1);
    }

    @OriginalMember(owner = "client!bm", name = "la", descriptor = "()V", line = 833)
    public final void method59() {
        this.field9582 = 0;
        ++field9452;
        this.field9616 = 0;
        this.field9581 = this.field9502;
        this.field9590 = this.field9506;
        if (this.field9677) {
            this.field9677 = false;
            this.method1400(false);
        }
        this.method3754(true);
    }

    @OriginalMember(owner = "client!bm", name = "A", descriptor = "()Z", line = 856)
    public final boolean method123() {
        ++field9365;
        return true;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 865)
    public final void method95(Canvas arg0) {
        ++field9536;
        this.field9386 = null;
        this.field9389 = null;
        if (arg0 != null && this.field9370 != arg0) {
            if (this.field9432.containsKey(arg0)) {
                this.field9389 = this.field9432.get(arg0);
                this.field9386 = arg0;
            }
        } else {
            this.field9389 = this.field9469;
            this.field9386 = this.field9370;
        }
        if (this.field9386 != null && this.field9389 != null) {
            this.method1426((byte) -113, this.field9389, this.field9386);
            this.method3776(0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bm", name = "pa", descriptor = "()V", line = 895)
    public final void method179() {
        ++field9361;
        this.field9555 = false;
    }

    @OriginalMember(owner = "client!bm", name = "u", descriptor = "()Lwc;", line = 903)
    public final class376 method125() {
        ++field9447;
        return new class462();
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(ZI)V", line = 913)
    public final void method3723(boolean arg0, int arg1) {
        if (!arg0) {
            this.method3756((byte) 23);
        }
        ++field9382;
        if (~this.field9568 != ~arg1) {
            this.field9568 = arg1;
            this.method1437((byte) 124);
        }
    }

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "(IIIIIII)I", line = 930)
    public final int method180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field9521;
        int var8 = 0;
        float var9 = (float) arg2 * this.field9549.field6663 + (float) arg0 * this.field9549.field6665 + (float) arg1 * this.field9549.field6681 + this.field9549.field6695;
        float var10 = (float) arg5 * this.field9549.field6663 + (float) arg3 * this.field9549.field6665 + (float) arg4 * this.field9549.field6681 + this.field9549.field6695;
        if (var9 < (float) this.field9559 && (float) this.field9559 > var10) {
            var8 |= 16;
        } else if ((float) this.field9619 < var9 && (float) this.field9619 < var10) {
            var8 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field9549.field6648 + (float) arg0 * this.field9549.field6662 + (float) arg1 * this.field9549.field6684 + this.field9549.field6652) * (float) this.field9622 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field9549.field6648 + (float) arg3 * this.field9549.field6662 + (float) arg4 * this.field9549.field6684 + this.field9549.field6652) * (float) this.field9622 / (float) arg6);
        if (this.field9642 > (float) var11 && (float) var12 < this.field9642) {
            var8 |= 1;
        } else if ((float) var11 > this.field9645 && this.field9645 < (float) var12) {
            var8 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field9549.field6687 + (float) arg0 * this.field9549.field6696 + (float) arg1 * this.field9549.field6655 + this.field9549.field6656) * (float) this.field9614 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field9549.field6687 + (float) arg3 * this.field9549.field6696 + (float) arg4 * this.field9549.field6655 + this.field9549.field6656) * (float) this.field9614 / (float) arg6);
        if (this.field9607 > (float) var13 && (float) var14 < this.field9607) {
            var8 |= 4;
        } else if ((float) var13 > this.field9584 && this.field9584 < (float) var14) {
            var8 |= 8;
        }
        return var8;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(FI)V", line = 973)
    public final void method3724(float arg0, int arg1) {
        ++field9527;
        if (this.field9576 != arg0) {
            this.field9576 = arg0;
            this.method3739(4);
        }
        if (arg1 <= 83) {
            this.method1397((byte) 25, true);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZIIZ)V", line = 990)
    public final void method3725(boolean arg0, int arg1, int arg2, boolean arg3) {
        if (arg1 < 27) {
            this.field9621 = -80;
        }
        ++field9392;
        if (this.field9646 != arg2 || !this.field9555 != !this.field9633) {
            class620 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = this.field9555 ? 3 : 0;
            if (~arg2 > -1) {
                this.method3734((byte) -14);
            } else {
                var5 = this.field9569.method785(-127, arg2);
                class91 var10 = super.field6364.method389(9559, arg2);
                if (var10.field1148 == 0 && var10.field1161 == 0) {
                    this.method3734((byte) -14);
                } else {
                    int var11 = var10.field1159 ? 64 : 128;
                    int var12 = var11 * 50;
                    class462 var13 = this.method3729(1);
                    var13.method2723(false, (float) (this.field9610 % var12 * var10.field1161) / (float) var12, (float) (this.field9610 % var12 * var10.field1148) / (float) var12, 0.0F);
                    this.method3771(0, class641.field8858);
                }
                var6 = var10.field1154;
                if (!this.field9555) {
                    var9 = var10.field1149;
                    var7 = var10.field1160;
                    var8 = var10.field1163;
                }
            }
            this.method3746(arg0, var9, var7, arg3, var8, 1);
            if (this.field9643 != null) {
                this.field9643.method1015(var5, (byte) 80, var6);
            } else {
                this.method3711(false, var5);
                this.method3781(-3, var6);
            }
            this.field9646 = arg2;
            this.field9633 = this.field9555;
        }
        this.field9562 &= -8;
    }

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "(B)V", line = 1060)
    public final void method3726(byte arg0) {
        ++field9393;
        this.field9543.method1962();
        if (arg0 <= 69) {
            this.field9636 = -11;
        }
        this.field9545 = true;
        this.method3752(-29629);
    }

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "(I)V", line = 1073)
    public void method1439(int arg0) {
        ++field9404;
        if (arg0 != -129) {
            this.field9671 = null;
        }
        this.field9623 = this.field9641;
        this.field9641 = 0;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ltba;[Lbe;Z)Lda;", line = 1085)
    public final class423 method156(class56 arg0, class196[] arg1, boolean arg2) {
        ++field9373;
        return new class209(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "(I)Ltv;", line = 1094)
    public final class462 method3727(int arg0) {
        if (arg0 >= -110) {
            this.field9652 = 119;
        }
        ++field9428;
        return this.field9552;
    }

    @OriginalMember(owner = "client!bm", name = "M", descriptor = "()I", line = 1110)
    public final int method126() {
        ++field9422;
        return this.field9678;
    }

    @OriginalMember(owner = "client!bm", name = "Y", descriptor = "()[I", line = 1121)
    public final int[] method71() {
        ++field9464;
        return new int[] { this.field9596, this.field9603, this.field9622, this.field9614 };
    }

    @OriginalMember(owner = "client!bm", name = "xa", descriptor = "(F)V", line = 1129)
    public final void method139(float arg0) {
        if (this.field9651 != arg0) {
            this.field9651 = arg0;
            this.field9406.setAmbient(arg0);
            this.method1408(0);
            this.method1396(0);
        }
        ++field9515;
    }

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "(B)V", line = 1149)
    private final void method3728(byte arg0) {
        this.method1425((byte) 118);
        ++field9377;
        if (this.field9643 != null) {
            this.field9643.method1023((byte) -52);
        }
        if (arg0 <= 26) {
            this.method3748(-2);
        }
    }

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "()Z", line = 1167)
    public final boolean method91() {
        ++field9448;
        return true;
    }

    @OriginalMember(owner = "client!bm", name = "Q", descriptor = "(IIIIII[BII)V", line = 1175)
    public final void method63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field9387;
    }

    @OriginalMember(owner = "client!bm", name = "HA", descriptor = "(IIII[I)V", line = 1185)
    public final void method173(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field9517;
        float var6 = this.field9549.method2720((float) arg2, (byte) -97, (float) arg0, (float) arg1);
        if (!((float) this.field9559 > var6) && !(var6 > (float) this.field9619)) {
            int var7 = (int) ((float) this.field9622 * this.field9549.method2726(1, (float) arg1, (float) arg0, (float) arg2) / (float) arg3);
            int var8 = (int) ((float) this.field9614 * this.field9549.method2724((float) arg0, (float) arg2, 3, (float) arg1) / (float) arg3);
            arg4[2] = (int) var6;
            arg4[1] = (int) ((float) var8 + -this.field9607);
            arg4[0] = (int) ((float) var7 - this.field9642);
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "(I)Ltv;", line = 1212)
    public final class462 method3729(int arg0) {
        ++field9471;
        if (arg0 != 1) {
            this.field9577 = -0.8513948F;
        }
        return this.field9580[this.field9568];
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BZ)V", line = 1223)
    public final void method3730(byte arg0, boolean arg1) {
        if (arg0 != -25) {
            this.method3709(-127);
        }
        if (this.field9600 != arg1) {
            this.field9600 = arg1;
            this.method1416((byte) 123);
            this.field9562 &= -32;
        }
        ++field9499;
    }

    @OriginalMember(owner = "client!bm", name = "C", descriptor = "(Z)V", line = 1240)
    public final void method129(boolean arg0) {
        this.field9649 = arg0;
        ++field9439;
        this.method1422((byte) 116);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "([IZBII)Lbaa;", line = 1253)
    public final class620 method3731(int[] arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        ++field9524;
        if (arg2 <= 47) {
            this.field9602 = -0.3318951F;
        }
        return this.method1438(-126, arg4, arg3, arg0, arg1, 0, 0);
    }

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "(B)[F", line = 1264)
    public final float[] method3732(byte arg0) {
        if (arg0 > -79) {
            return null;
        } else {
            ++field9378;
            return this.field9620;
        }
    }

    @OriginalMember(owner = "client!bm", name = "ra", descriptor = "(IIII)V", line = 1275)
    public final void method104(int arg0, int arg1, int arg2, int arg3) {
        this.field9652 = arg2;
        this.field9621 = arg3;
        ++field9488;
        this.field9627 = arg1;
        this.field9636 = arg0;
        this.field9555 = true;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 1287)
    public final void method151(Canvas arg0, int arg1, int arg2) {
        ++field9380;
        Object var4 = null;
        if (arg0 != null && this.field9370 != arg0) {
            if (this.field9432.containsKey(arg0)) {
                var4 = this.field9432.get(arg0);
            }
        } else {
            var4 = this.field9389;
        }
        if (var4 == null) {
            throw new RuntimeException();
        } else {
            this.method1417(arg0, (byte) -91, var4);
            if (this.field9386 == arg0) {
                this.method3776(0);
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "DA", descriptor = "(IIII)V", line = 1317)
    public final void method117(int arg0, int arg1, int arg2, int arg3) {
        this.field9603 = arg1;
        this.field9622 = arg2;
        this.field9614 = arg3;
        this.field9596 = arg0;
        ++field9411;
        this.method3739(4);
        this.method3749((byte) -32);
        this.method3759((byte) 66);
        this.method3754(true);
    }

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "(B)V", line = 1333)
    private final void method3733(byte arg0) {
        if (arg0 >= 60) {
            this.field9666 = this.method1423(121, true);
            ++field9366;
            this.field9666.method472(12, 24, -2898);
            this.field9675 = this.method1434(true, new class734[] { new class734(class453.field6343) });
        }
    }

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "(B)V", line = 1354)
    public final void method3734(byte arg0) {
        if (this.field9632[this.field9568] != class738.field10334) {
            this.field9632[this.field9568] = class738.field10334;
            this.field9580[this.field9568].method1962();
            this.method3728((byte) 105);
        }
        ++field9498;
        if (arg0 != -14) {
            this.method1439(-6);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ltv;I)V", line = 1371)
    public final void method3735(class462 arg0, int arg1) {
        ++field9385;
        int var3 = -76 / ((arg1 - 22) / 47);
        this.field9543.method1961(arg0);
        this.field9545 = false;
        this.method3752(-29629);
    }

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "(B)V", line = 1384)
    public final void method3736(byte arg0) {
        if (this.field9562 != 8) {
            this.method3780(-121);
            this.method3730((byte) -25, true);
            this.method3720(0, true);
            this.method3765(true, -32);
            this.method3737(3793, 1);
            this.field9562 = 8;
        }
        ++field9360;
        if (arg0 <= 122) {
            this.field9614 = -122;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 1404)
    public final void method67(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field9492;
    }

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "()Z", line = 1413)
    public final boolean method149() {
        ++field9494;
        return true;
    }

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "(II)V", line = 1421)
    public final void method3737(int arg0, int arg1) {
        ++field9400;
        if (this.field9615 != arg1) {
            boolean var3;
            boolean var4;
            class222 var5;
            if (~arg1 == -2) {
                var3 = true;
                var4 = true;
                var5 = class24.field401;
            } else if (arg1 != 2) {
                if (~arg1 != -129) {
                    var4 = false;
                    var3 = false;
                    var5 = class386.field5381;
                } else {
                    var5 = class36.field537;
                    var3 = true;
                    var4 = true;
                }
            } else {
                var5 = class146.field1764;
                var4 = false;
                var3 = true;
            }
            if (!var4 == this.field9639) {
                this.field9639 = var4;
                this.method1411((byte) -37);
            }
            if (this.field9617 != var3) {
                this.field9617 = var3;
                this.method1432(-7467);
            }
            if (this.field9624 != var5) {
                this.field9624 = var5;
                this.method1383((byte) 126);
            }
            this.field9615 = arg1;
            this.field9562 &= -29;
        }
        if (arg0 != 3793) {
            this.method3765(false, 1);
        }
    }

    @OriginalMember(owner = "client!bm", name = "u", descriptor = "(I)V", line = 1491)
    private final void method3738(int arg0) {
        if (arg0 != 22778) {
            this.method1387((byte) -54, -127, 125, true, (float[]) null, 110, (class610) null, -47);
        }
        if (this.field9643 != null) {
            this.field9643.method1867(-84);
        }
        ++field9423;
        this.method1414((byte) 100);
    }

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "(I)V", line = 1506)
    private final void method3739(int arg0) {
        if (arg0 != 4) {
            this.field9582 = -57;
        }
        ++field9472;
        this.field9618 = false;
        this.method3748(-32);
        if (class573.field8010 == this.field9626) {
            this.method3783((byte) -90);
        }
    }

    @OriginalMember(owner = "client!bm", name = "za", descriptor = "(IIIII)V", line = 1524)
    public final void method153(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9443;
        this.method3755((byte) -59);
        this.method3717(arg3, (byte) -96);
        this.method3777(false, 0, class663.field9083);
        this.method3713(class663.field9083, 0, (byte) -67);
        this.method3737(3793, arg4);
        this.field9543.method2738((float) arg2, 1.0F, (float) arg2, 13);
        this.field9543.method1973(arg0, arg1, 0);
        this.method3744(false);
        this.method1397((byte) 124, false);
        this.method1407(this.field9664, (byte) 66, 0);
        this.method1436(14522, this.field9656);
        this.method1389(256, class401.field5557, 0, (byte) -41);
        this.method1397((byte) 124, true);
        this.method3713(class632.field8774, 0, (byte) 109);
        this.method3777(false, 0, class632.field8774);
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(IIIIII)V", line = 1547)
    public final void method136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9520;
        float var7 = this.method1391(91);
        this.method3755((byte) -71);
        this.method3717(arg4, (byte) -96);
        this.method3777(false, 0, class663.field9083);
        this.method3713(class663.field9083, 0, (byte) 113);
        this.method3737(3793, arg5);
        this.field9543.method2738((float) (arg3 + -1), 1.0F, (float) (arg2 + -1), 13);
        this.field9543.method2719(-29278, (float) arg0 - var7, (float) arg1 + -var7, 0.0F);
        this.method3744(false);
        this.method1397((byte) 127, false);
        this.method3742(class62.field839, 127, 4);
        this.method1397((byte) 125, true);
        this.method3713(class632.field8774, 0, (byte) 120);
        this.method3777(false, 0, class632.field8774);
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(IIZ)Ljaclib/memory/heap/NativeHeapBuffer;", line = 1572)
    public final NativeHeapBuffer method3740(int arg0, int arg1, boolean arg2) {
        ++field9363;
        if (arg0 != -3317) {
            this.field9646 = 6;
        }
        return this.field9485.method2221(arg1, arg2);
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)V", line = 1583)
    public final void method112(int arg0) {
        ++field9468;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIZ)Lac;", line = 1590)
    public final class712 method157(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field9540;
        class507 var6 = new class507(this, arg2, arg3, arg4);
        var6.method688(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(FFFFFFB)Z", line = 1606)
    private final boolean method3741(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, byte arg6) {
        ++field9376;
        Buffer var8 = this.field9666.method471((byte) 28, true);
        if (var8 == null) {
            return false;
        } else {
            if (arg6 != 80) {
                this.method125();
            }
            Stream var9 = this.method3772(var8, 4);
            if (!Stream.method2226()) {
                var9.method2237(arg0);
                var9.method2237(arg2);
                var9.method2237(arg5);
                var9.method2237(arg4);
                var9.method2237(arg3);
                var9.method2237(arg1);
            } else {
                var9.method2229(arg0);
                var9.method2229(arg2);
                var9.method2229(arg5);
                var9.method2229(arg4);
                var9.method2229(arg3);
                var9.method2229(arg1);
            }
            var9.method2223();
            return this.field9666.method475((byte) 104);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lwc;)V", line = 1647)
    public final void method77(class376 arg0) {
        ++field9414;
        this.field9549 = (class462) arg0;
        this.field9551.method1961(this.field9549);
        this.field9551.method2721((byte) 62);
        this.field9552.method2718(this.field9551, -9868);
        this.field9550.method2718(this.field9549, -9868);
        if (this.field9626.method362(13)) {
            this.method3719(-23987);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lsea;II)V", line = 1663)
    private final void method3742(class399 arg0, int arg1, int arg2) {
        ++field9451;
        this.method1407(this.field9674, (byte) -100, 0);
        this.method1436(14522, this.field9676);
        if (arg1 <= 109) {
            this.field9583 = false;
        }
        this.method1389(arg2, arg0, 0, (byte) -122);
    }

    @OriginalMember(owner = "client!bm", name = "x", descriptor = "(I)Ltv;", line = 1678)
    public final class462 method3743(int arg0) {
        ++field9531;
        if (arg0 != -32721) {
            this.field9610 = -55;
        }
        return this.field9580[this.field9568];
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(Z)V", line = 1690)
    public final void method3744(boolean arg0) {
        ++field9481;
        this.field9545 = arg0;
        this.method3752(-29629);
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 1702)
    public final void method140(Canvas arg0) {
        ++field9467;
        if (this.field9370 == arg0) {
            throw new RuntimeException();
        } else if (this.field9432.containsKey(arg0)) {
            this.method1384(this.field9432.get(arg0), true, arg0);
            this.field9432.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(ZI)V", line = 1724)
    public final void method3745(boolean arg0, int arg1) {
        if (arg1 < 50) {
            this.field9569 = null;
        }
        ++field9358;
        if (!arg0 == this.field9597) {
            this.field9597 = arg0;
            this.method1388(true);
            this.field9562 &= -8;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZIIZII)V", line = 1742)
    private final void method3746(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        boolean var7 = arg0 & this.method73();
        ++field9455;
        if (!var7 && (~arg1 == -5 || arg1 == 8 || ~arg1 == -10)) {
            arg1 = 2;
            arg4 = arg1 != 4 ? 1 : arg2 & 1;
            arg2 = 0;
        }
        if (arg5 == 1) {
            if (arg1 != 0 && arg3) {
                arg1 |= Integer.MIN_VALUE;
            }
            if (this.field9634 == arg1) {
                if (~this.field9634 != -1) {
                    this.field9554[Integer.MAX_VALUE & this.field9634].method1018(4, arg3);
                    if (~this.field9557 != ~arg2 || this.field9598 != arg4) {
                        this.field9554[Integer.MAX_VALUE & this.field9634].method1025(arg2, (byte) 102, arg4);
                        this.field9598 = arg4;
                        this.field9557 = arg2;
                    }
                    return;
                }
            } else {
                if (this.field9634 != 0) {
                    this.field9554[Integer.MAX_VALUE & this.field9634].method1019((byte) -60);
                }
                if (arg1 != 0) {
                    this.field9643 = this.field9554[Integer.MAX_VALUE & arg1];
                    this.field9643.method1020(arg3, (byte) 25);
                    this.field9643.method1018(4, arg3);
                    this.field9643.method1025(arg2, (byte) 102, arg4);
                } else {
                    this.field9643 = null;
                }
                this.field9598 = arg4;
                this.field9557 = arg2;
                this.field9634 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(II)I", line = 1798)
    public final int method100(int arg0, int arg1) {
        ++field9367;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!bm", name = "T", descriptor = "(IIII)V", line = 1806)
    public final void method81(int arg0, int arg1, int arg2, int arg3) {
        ++field9442;
        boolean var5 = false;
        if (arg0 > this.field9616) {
            var5 = true;
            this.field9616 = arg0;
        }
        if (~this.field9581 < ~arg2) {
            var5 = true;
            this.field9581 = arg2;
        }
        if (~arg1 < ~this.field9582) {
            this.field9582 = arg1;
            var5 = true;
        }
        if (arg3 < this.field9590) {
            this.field9590 = arg3;
            var5 = true;
        }
        if (var5) {
            if (!this.field9677) {
                this.field9677 = true;
                this.method1400(false);
            }
            this.method1393(-74);
            this.method3754(true);
        }
    }

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "(I)V", line = 1852)
    public final void method124(int arg0) {
        ++field9390;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "([FZ)[F", line = 1867)
    public final float[] method3747(float[] arg0, boolean arg1) {
        ++field9426;
        arg0[8] = this.field9572[2];
        arg0[12] = this.field9572[3];
        arg0[4] = this.field9572[1];
        arg0[0] = this.field9572[0];
        if (!arg1) {
            this.method3736((byte) -107);
        }
        arg0[5] = this.field9572[5];
        arg0[13] = this.field9572[7];
        arg0[1] = this.field9572[4];
        arg0[2] = this.field9572[8];
        arg0[9] = this.field9572[6];
        arg0[6] = this.field9572[9];
        arg0[10] = this.field9572[10];
        arg0[7] = this.field9572[13];
        arg0[14] = this.field9572[11];
        arg0[3] = this.field9572[12];
        arg0[15] = this.field9572[15];
        arg0[11] = this.field9572[14];
        return arg0;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "([IIIIIZ)Lac;", line = 1894)
    public final class712 method75(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field9491;
        return new class507(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!bm", name = "A", descriptor = "(I)V", line = 1906)
    private final void method3748(int arg0) {
        if (arg0 > -3) {
            this.field9618 = false;
        }
        ++field9519;
        if (!this.field9618) {
            float[] var2 = this.field9563;
            float var3 = (float) this.field9559;
            float var4 = (float) this.field9619;
            float var5 = (float) (-this.field9603) * this.field9576 / (float) this.field9614;
            float var6 = (float) (-this.field9596) * this.field9576 / (float) this.field9622;
            float var7 = (float) (this.field9502 - this.field9596) * this.field9576 / (float) this.field9622;
            float var8 = (float) (-this.field9603 + this.field9506) * this.field9576 / (float) this.field9614;
            if (var6 != var7 && var5 != var8) {
                var2[2] = 0.0F;
                var2[15] = 1.0F;
                var2[10] = 1.0F / (var3 - var4);
                var2[3] = 0.0F;
                var2[12] = (var6 + var7) / (-var7 + var6);
                var2[9] = 0.0F;
                var2[11] = 0.0F;
                var2[0] = 2.0F / (var7 - var6);
                var2[6] = 0.0F;
                var2[7] = 0.0F;
                var2[1] = 0.0F;
                var2[4] = 0.0F;
                var2[13] = (var5 + var8) / (var8 - var5);
                var2[14] = var3 / (-var4 + var3);
                var2[5] = 2.0F / (-var5 + var8);
                var2[8] = 0.0F;
            } else {
                var2[10] = 1.0F;
                var2[1] = 0.0F;
                var2[7] = 0.0F;
                var2[12] = 0.0F;
                var2[0] = 1.0F;
                var2[4] = 0.0F;
                var2[9] = 0.0F;
                var2[6] = 0.0F;
                var2[8] = 0.0F;
                var2[13] = 0.0F;
                var2[3] = 0.0F;
                var2[5] = 1.0F;
                var2[11] = 0.0F;
                var2[14] = 0.0F;
                var2[15] = 1.0F;
                var2[2] = 0.0F;
            }
            this.method3786(-28);
            this.field9618 = true;
        }
    }

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "(B)V", line = 1975)
    private final void method3749(byte arg0) {
        if (arg0 != -32) {
            this.field9670 = null;
        }
        this.field9575 = false;
        ++field9395;
        this.method3784((byte) -125);
        if (class692.field9816 == this.field9626) {
            this.method3783((byte) -123);
        }
    }

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "(B)Ltv;", line = 1992)
    public final class462 method3750(byte arg0) {
        ++field9372;
        int var2 = -21 % ((arg0 - 52) / 60);
        return this.field9543;
    }

    @OriginalMember(owner = "client!bm", name = "H", descriptor = "(III[I)V", line = 2002)
    public final void method162(int arg0, int arg1, int arg2, int[] arg3) {
        ++field9417;
        float var5 = this.field9549.method2720((float) arg2, (byte) -100, (float) arg0, (float) arg1);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field9603;
            var7 = this.field9596;
        } else {
            var7 = (int) ((float) this.field9622 * this.field9549.method2726(1, (float) arg1, (float) arg0, (float) arg2) / var5);
            var6 = (int) ((float) this.field9614 * this.field9549.method2724((float) arg0, (float) arg2, 3, (float) arg1) / var5);
        }
        arg3[2] = (int) var5;
        arg3[0] = (int) ((float) var7 - this.field9642);
        arg3[1] = (int) ((float) var6 - this.field9607);
    }

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "(Z)V", line = 2027)
    private final void method3751(boolean arg0) {
        ++field9369;
        this.field9674 = this.method1423(96, false);
        this.field9674.method472(28, 140, -2898);
        for (int var2 = 0; var2 < 4; ++var2) {
            Buffer var3 = this.field9674.method471((byte) 28, true);
            if (var3 != null) {
                Stream var4 = this.method3772(var3, 4);
                if (Stream.method2226()) {
                    var4.method2229(0.0F);
                    var4.method2229(0.0F);
                    var4.method2229(0.0F);
                    var4.method2229(0.0F);
                    var4.method2229(0.0F);
                    var4.method2229(0.0F);
                    var4.method2229(0.0F);
                    var4.method2229(0.0F);
                    var4.method2229(1.0F);
                    var4.method2229(0.0F);
                    var4.method2229(0.0F);
                    var4.method2229(1.0F);
                    var4.method2229(0.0F);
                    var4.method2229(1.0F);
                    var4.method2229(1.0F);
                    var4.method2229(1.0F);
                    var4.method2229(0.0F);
                    var4.method2229(1.0F);
                    var4.method2229(1.0F);
                    var4.method2229(1.0F);
                    var4.method2229(1.0F);
                    var4.method2229(1.0F);
                    var4.method2229(0.0F);
                    var4.method2229(0.0F);
                    var4.method2229(1.0F);
                    var4.method2229(0.0F);
                    var4.method2229(1.0F);
                    var4.method2229(0.0F);
                    var4.method2229(0.0F);
                    var4.method2229(0.0F);
                    var4.method2229(0.0F);
                    var4.method2229(0.0F);
                    var4.method2229(0.0F);
                    var4.method2229(0.0F);
                    var4.method2229(0.0F);
                } else {
                    var4.method2237(0.0F);
                    var4.method2237(0.0F);
                    var4.method2237(0.0F);
                    var4.method2237(0.0F);
                    var4.method2237(0.0F);
                    var4.method2237(0.0F);
                    var4.method2237(0.0F);
                    var4.method2237(0.0F);
                    var4.method2237(1.0F);
                    var4.method2237(0.0F);
                    var4.method2237(0.0F);
                    var4.method2237(1.0F);
                    var4.method2237(0.0F);
                    var4.method2237(1.0F);
                    var4.method2237(1.0F);
                    var4.method2237(1.0F);
                    var4.method2237(0.0F);
                    var4.method2237(1.0F);
                    var4.method2237(1.0F);
                    var4.method2237(1.0F);
                    var4.method2237(1.0F);
                    var4.method2237(1.0F);
                    var4.method2237(0.0F);
                    var4.method2237(0.0F);
                    var4.method2237(1.0F);
                    var4.method2237(0.0F);
                    var4.method2237(1.0F);
                    var4.method2237(0.0F);
                    var4.method2237(0.0F);
                    var4.method2237(0.0F);
                    var4.method2237(0.0F);
                    var4.method2237(0.0F);
                    var4.method2237(0.0F);
                    var4.method2237(0.0F);
                    var4.method2237(0.0F);
                }
                var4.method2223();
                if (this.field9674.method475((byte) 127)) {
                    break;
                }
            }
        }
        this.field9676 = this.method1434(arg0, new class734[] { new class734(new class453[] { class453.field6343, class453.field6353, class453.field6353 }) });
    }

    @OriginalMember(owner = "client!bm", name = "E", descriptor = "()I", line = 2137)
    public final int method178() {
        ++field9402;
        return this.field9548 + this.field9544 - -this.field9547;
    }

    @OriginalMember(owner = "client!bm", name = "KA", descriptor = "(IIII)V", line = 2147)
    public final void method131(int arg0, int arg1, int arg2, int arg3) {
        ++field9497;
        if (~arg0 >= -1 && this.field9502 + -1 <= arg2 && ~arg1 >= -1 && ~arg3 <= ~(this.field9506 + -1)) {
            this.method59();
        } else {
            this.field9616 = arg0 >= 0 ? arg0 : 0;
            this.field9581 = ~this.field9502 <= ~arg2 ? arg2 : 0;
            this.field9582 = arg1 >= 0 ? arg1 : 0;
            this.field9590 = ~this.field9502 > ~arg3 ? 0 : arg3;
            if (!this.field9677) {
                this.field9677 = true;
                this.method1400(false);
            }
            this.method1393(-108);
            this.method3754(true);
        }
    }

    @OriginalMember(owner = "client!bm", name = "B", descriptor = "(I)V", line = 2173)
    private final void method3752(int arg0) {
        if (arg0 == -29629) {
            if (class438.field6149 == this.field9626) {
                float var2 = this.method1391(107);
                this.field9543.method2719(-29278, var2, var2, 0.0F);
            }
            ++field9487;
            this.field9609 = false;
            this.method1435(-3);
            if (this.field9643 != null) {
                this.field9643.method1866(true);
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "D", descriptor = "(I)V", line = 2199)
    private final void method3753(int arg0) {
        this.field9664 = this.method1423(125, false);
        ++field9503;
        this.field9664.method472(arg0, 3096, -2898);
        for (int var2 = 0; ~var2 > -5; ++var2) {
            Buffer var3 = this.field9664.method471((byte) 28, true);
            if (var3 != null) {
                Stream var4 = this.method3772(var3, 4);
                var4.method2229(0.0F);
                var4.method2229(0.0F);
                var4.method2229(0.0F);
                for (int var5 = 0; ~var5 >= -257; ++var5) {
                    double var6 = (double) (var5 * 2) * 3.141592653589793D / 256.0D;
                    float var8 = (float) Math.cos(var6);
                    float var9 = (float) Math.sin(var6);
                    if (!Stream.method2226()) {
                        var4.method2237(var9);
                        var4.method2237(var8);
                        var4.method2237(0.0F);
                    } else {
                        var4.method2229(var9);
                        var4.method2229(var8);
                        var4.method2229(0.0F);
                    }
                }
                var4.method2223();
                if (this.field9664.method475((byte) -74)) {
                    break;
                }
            }
        }
        this.field9656 = this.method1434(true, new class734[] { new class734(class453.field6343) });
    }

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "(Z)V", line = 2265)
    private final void method3754(boolean arg0) {
        if (!arg0) {
            this.field9674 = null;
        }
        this.field9607 = (float) (-this.field9603 + this.field9582);
        this.field9642 = (float) (this.field9616 - this.field9596);
        this.field9645 = (float) (-this.field9596 + this.field9581);
        this.field9584 = (float) (-this.field9603 + this.field9590);
        ++field9412;
    }

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "(B)V", line = 2279)
    private final void method3755(byte arg0) {
        ++field9490;
        if (~this.field9562 != -2) {
            this.method3787(121);
            this.method3730((byte) -25, false);
            this.method3745(false, 56);
            this.method3720(0, false);
            this.method3765(false, -32);
            this.method3725(false, 67, -2, false);
            this.method3781(-3, 1);
            this.method3711(false, this.field9593);
            this.field9562 = 1;
        }
        int var2 = 110 % ((arg0 - 39) / 43);
    }

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "(II)V", line = 2304)
    public final void method118(int arg0, int arg1) {
        ++field9510;
        if (~this.field9559 != ~arg0 || this.field9619 != arg1) {
            this.field9619 = arg1;
            this.field9559 = arg0;
            this.method3749((byte) -32);
            this.method3739(4);
            this.method3738(22778);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 2324)
    public final void method181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class81 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field9493;
    }

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "()Z", line = 2331)
    public final boolean method152() {
        ++field9391;
        return true;
    }

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "(B)Ltv;", line = 2341)
    public final class462 method3756(byte arg0) {
        ++field9362;
        if (arg0 <= 46) {
            this.field9669 = null;
        }
        if (!this.field9609) {
            this.field9553.method2728(this.field9551, this.field9543);
            this.field9609 = true;
        }
        return this.field9553;
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Lkha;II)V", line = 2358)
    public class684(Canvas arg0, Object arg1, class96 arg2, class687 arg3, int arg4, int arg5) {
        super(arg2);
        try {
            this.field9420 = arg3;
            this.field9389 = this.field9469 = arg1;
            this.field9386 = this.field9370 = arg0;
            this.field9589 = arg4;
            Dimension var7 = arg0.getSize();
            this.field9608 = arg5;
            this.field9502 = this.field9525 = var7.width;
            this.field9506 = this.field9489 = var7.height;
            class651.method3514(false, true, true);
            if (super.field6364 != null) {
                this.field9569 = new class115(this, super.field6364);
                this.field9406 = new NativeInterface(super.field6364.method391((byte) -118), this.field9608);
                for (int var8 = 0; var8 < super.field6364.method391((byte) 54); ++var8) {
                    class91 var9 = super.field6364.method389(9559, var8);
                    if (var9 != null) {
                        this.field9406.initTextureMetrics(var8, var9.field1156, var9.field1166);
                    }
                }
            } else {
                this.field9406 = new NativeInterface(0, this.field9608);
                this.field9569 = null;
            }
        } catch (Throwable var11) {
            var11.printStackTrace();
            this.method2658(-127);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "(Z)V", line = 2409)
    public final void method3757(boolean arg0) {
        ++field9401;
        this.method3759((byte) 66);
        this.method3783((byte) -110);
        if (!arg0) {
            this.method1439(-126);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIILaa;II)V", line = 2422)
    public final void method121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class81 arg6, int arg7, int arg8) {
        ++field9473;
    }

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "()V", line = 2434)
    public final void method142() {
        ++field9379;
        if (this.field9569 != null) {
            this.field9569.method784(0);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lid;IIII)Lka;", line = 2446)
    public final class219 method150(class415 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9459;
        return new class613(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lza;)V", line = 2454)
    public final void method133(class702 arg0) {
        this.field9485 = ((class495) arg0).field7005;
        ++field9456;
        this.field9437 = this.field9485.method2221(32768, false);
    }

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "(B)V", line = 2465)
    public final void method3758(byte arg0) {
        this.method3742(class401.field5557, 122, 2);
        ++field9504;
        int var2 = -118 % ((arg0 - 14) / 62);
    }

    @OriginalMember(owner = "client!bm", name = "K", descriptor = "([I)V", line = 2479)
    public final void method76(int[] arg0) {
        arg0[1] = this.field9582;
        ++field9383;
        arg0[0] = this.field9616;
        arg0[3] = this.field9590;
        arg0[2] = this.field9581;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(Z)V", line = 2491)
    public final void method65(boolean arg0) {
        ++field9398;
    }

    @OriginalMember(owner = "client!bm", name = "x", descriptor = "(B)V", line = 2503)
    public final void method3759(byte arg0) {
        ++field9539;
        if (class447.field6290 != this.field9626) {
            class43 var2 = this.field9626;
            this.field9626 = class447.field6290;
            if (var2.method362(13)) {
                this.method3719(-23987);
            }
            this.field9572 = this.field9620;
            this.field9562 &= -32;
        }
        if (arg0 != 66) {
            this.method121(83, 75, 81, 13, 83, -20, (class81) null, 72, -115);
        }
    }

    @OriginalMember(owner = "client!bm", name = "F", descriptor = "(I)V", line = 2525)
    private final void method3760(int arg0) {
        ++field9483;
        this.method1407(this.field9666, (byte) 92, 0);
        this.method1436(14522, this.field9675);
        this.method1389(arg0, class261.field3313, 0, (byte) 97);
    }

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "()Z", line = 2535)
    public final boolean method176() {
        ++field9396;
        return false;
    }

    @OriginalMember(owner = "client!bm", name = "y", descriptor = "(B)I", line = 2548)
    public final int method3761(byte arg0) {
        ++field9381;
        int var2 = -28 / ((arg0 - 50) / 49);
        return this.field9627;
    }

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "()Z", line = 2558)
    public final boolean method171() {
        ++field9526;
        return false;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "([I)V", line = 2567)
    public final void method141(int[] arg0) {
        arg0[0] = this.field9502;
        arg0[1] = this.field9506;
        ++field9522;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIF)Lpk;", line = 2582)
    public final class621 method90(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field9419;
        return new class378(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!bm", name = "C", descriptor = "(B)Z", line = 2591)
    public static final boolean method3762(byte arg0) {
        ++class214.field2716;
        ++field9505;
        int var1 = -25 / (arg0 / 51);
        class224.field2950 = true;
        return true;
    }

    @OriginalMember(owner = "client!bm", name = "G", descriptor = "(I)V", line = 2605)
    private final void method3763(int arg0) {
        ++field9438;
        if (arg0 != 262144) {
            this.field9547 = 87;
        }
        this.field9561 = false;
        if (class438.field6149 == this.field9626) {
            this.method3782(arg0 + -262085);
            this.method3783((byte) -52);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I[Lpk;)V", line = 2622)
    public final void method146(int arg0, class621[] arg1) {
        ++field9462;
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field9613[var3] = arg1[var3];
        }
        this.field9641 = arg0;
        if (this.field9626.method362(13)) {
            this.method1439(-129);
        }
    }

    @OriginalMember(owner = "client!bm", name = "D", descriptor = "(B)V", line = 2641)
    public static final void method3764(byte arg0) {
        ++field9415;
        if (!class446.field6280) {
            class446.field6280 = true;
            class591.field8230 += (12.0F - class591.field8230) / 2.0F;
            class70.field945 = true;
            if (arg0 != 35) {
                method3764((byte) -24);
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "()Z", line = 2659)
    public final boolean method88() {
        ++field9449;
        return true;
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(ZI)V", line = 2670)
    public final void method3765(boolean arg0, int arg1) {
        if (arg1 == -32) {
            if (!arg0 == this.field9578) {
                this.field9578 = arg0;
                this.method1422((byte) 118);
                this.field9562 &= -32;
            }
            ++field9359;
        }
    }

    @OriginalMember(owner = "client!bm", name = "H", descriptor = "(I)V", line = 2688)
    private final void method3766(int arg0) {
        this.method1408(arg0 + arg0);
        ++field9436;
        this.method1398((byte) 92);
        this.method1388(true);
        this.method1439(-129);
        this.method1392(arg0 ^ 256);
        this.method1396(arg0);
        this.method1433(0);
        this.method1390((byte) 88);
        this.method1422((byte) 117);
        this.method1416((byte) 123);
        this.method1414((byte) 100);
        this.method1432(-7467);
        this.method1383((byte) 73);
        this.method1411((byte) -37);
        for (int var2 = this.field9592 + -1; var2 >= 0; --var2) {
            this.method3723(true, var2);
            this.method1386(-3832);
            this.method1427((byte) -128);
            this.method3734((byte) -14);
        }
        this.method1406(-105);
        this.method1419(127);
        this.method1424(-673);
        this.method1435(-3);
        this.method1409((byte) -40);
    }

    @OriginalMember(owner = "client!bm", name = "I", descriptor = "(I)I", line = 2732)
    public final int method3767(int arg0) {
        if (arg0 != -31359) {
            return 70;
        } else {
            ++field9484;
            return this.field9636;
        }
    }

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "(Z)V", line = 2749)
    public static void method3768(boolean arg0) {
        if (!arg0) {
            field9445 = null;
            field9364 = null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lcd;)V", line = 2760)
    public final void method102(class603 arg0) {
        this.field9605.method1648(this, arg0, 2, -1);
        ++field9476;
    }

    @OriginalMember(owner = "client!bm", name = "L", descriptor = "(III)V", line = 2770)
    public final void method130(int arg0, int arg1, int arg2) {
        ++field9454;
        if (~this.field9573 != ~arg0 || this.field9586 != arg1 || ~this.field9653 != ~arg2) {
            this.field9573 = arg0;
            this.field9653 = arg2;
            this.field9586 = arg1;
            this.method3738(22778);
            this.method1416((byte) 123);
        }
    }

    @OriginalMember(owner = "client!bm", name = "P", descriptor = "(IIIII)V", line = 2786)
    public final void method128(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9528;
        this.method134(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!bm", name = "E", descriptor = "(B)V", line = 2797)
    private final void method3769(byte arg0) {
        this.field9635[10] = this.field9565;
        this.field9635[14] = this.field9629;
        ++field9435;
        if (arg0 > -47) {
            this.field9653 = 58;
        }
        this.field9594 = (this.field9635[14] - (float) this.field9619) / this.field9635[10];
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BB)V", line = 2812)
    public final void method3770(byte arg0, byte arg1) {
        ++field9457;
        this.method3717(arg0 | arg0 << 8 | arg0 << 24 | arg0 << 16, arg1);
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(IIIIII)Ltj;", line = 2820)
    public final class662 method137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9444;
        return new class573(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!bm", name = "ZA", descriptor = "(IFFFFF)V", line = 2832)
    public final void method85(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field9534;
        boolean var7 = this.field9638 != arg0;
        if (var7 || this.field9650 != arg1 || this.field9628 != arg2) {
            this.field9638 = arg0;
            this.field9650 = arg1;
            this.field9628 = arg2;
            if (var7) {
                this.field9571 = (float) (65280 & this.field9638) / 65280.0F;
                this.field9564 = (float) (this.field9638 & 16711680) / 1.671168E7F;
                this.field9606 = (float) (255 & this.field9638) / 255.0F;
                this.method1408(0);
            }
            this.field9406.setSunColour(this.field9564, this.field9571, this.field9606, arg1, arg2);
            this.method1398((byte) 96);
        }
        if (this.field9595[0] != arg3 || this.field9595[1] != arg4 || this.field9595[2] != arg5) {
            this.field9595[0] = arg3;
            this.field9595[1] = arg4;
            this.field9595[2] = arg5;
            this.field9587[2] = -arg5;
            this.field9587[0] = -arg3;
            this.field9587[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field9585[0] = arg3 * var8;
            this.field9585[2] = arg5 * var8;
            this.field9585[1] = arg4 * var8;
            this.field9566[1] = -this.field9585[1];
            this.field9566[2] = -this.field9585[2];
            this.field9566[0] = -this.field9585[0];
            this.field9406.setSunDirection(this.field9585[0], this.field9585[1], this.field9585[2]);
            this.method1392(256);
            this.field9601 = (int) (arg3 * 256.0F / arg4);
            this.field9556 = (int) (arg5 * 256.0F / arg4);
        }
        this.method1396(0);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILkh;)V", line = 2884)
    public final void method3771(int arg0, class354 arg1) {
        this.field9632[this.field9568] = arg1;
        if (arg0 != 0) {
            this.method1417((Canvas) null, (byte) 8, (Object) null);
        }
        ++field9479;
        this.method3728((byte) 111);
    }

    @OriginalMember(owner = "client!bm", name = "aa", descriptor = "(IIIIII)V", line = 2898)
    public final void method167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3755((byte) -117);
        ++field9508;
        this.method3717(arg4, (byte) -89);
        this.method3777(false, 0, class663.field9083);
        this.method3713(class663.field9083, 0, (byte) 126);
        this.method3737(3793, arg5);
        this.field9543.method2738((float) arg3, 1.0F, (float) arg2, 13);
        this.field9543.method1973(arg0, arg1, 0);
        this.method3744(false);
        this.method1397((byte) 127, false);
        this.method3758((byte) 106);
        this.method1397((byte) 123, true);
        this.method3713(class632.field8774, 0, (byte) 123);
        this.method3777(false, 0, class632.field8774);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljaclib/memory/Buffer;I)Ljaclib/memory/Stream;", line = 2921)
    public final Stream method3772(Buffer arg0, int arg1) {
        ++field9501;
        if (arg1 != 4) {
            this.field9612 = true;
        }
        this.field9647.method2236(arg0);
        return this.field9647;
    }

    @OriginalMember(owner = "client!bm", name = "XA", descriptor = "()I", line = 2936)
    public final int method108() {
        ++field9466;
        return this.field9619;
    }

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "()Z", line = 2945)
    public final boolean method66() {
        ++field9523;
        return this.field9583;
    }

    @OriginalMember(owner = "client!bm", name = "F", descriptor = "(B)I", line = 2953)
    public final int method3773(byte arg0) {
        int var2 = 46 / ((arg0 - -13) / 48);
        ++field9458;
        return this.field9568;
    }

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "(Z)V", line = 2963)
    public final void method3774(boolean arg0) {
        if (!arg0) {
            ++field9529;
            Hashtable var2 = new Hashtable();
            if (this.field9432 != null && !this.field9432.isEmpty()) {
                Enumeration var3 = this.field9432.keys();
                while (var3.hasMoreElements()) {
                    Canvas var4 = (Canvas) var3.nextElement();
                    var2.put(var4, this.method1394(arg0, var4));
                }
            }
            this.field9432 = var2;
            this.method3751(true);
            this.method3733((byte) 106);
            this.method3753(12);
            this.field9605.method1647((byte) 57, this);
        }
    }

    @OriginalMember(owner = "client!bm", name = "x", descriptor = "()I", line = 2995)
    public final int method115() {
        ++field9513;
        return this.field9567 + -2;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II[I[I)Laa;", line = 3003)
    public final class81 method87(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field9409;
        return class625.method3416(arg3, arg2, arg1, this, arg0, (byte) -65);
    }

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "()Z", line = 3011)
    public final boolean method73() {
        ++field9375;
        return this.field9554[3].method1021((byte) 123);
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(IIIIII)V", line = 3020)
    public final void method134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9374;
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
        if (this.method3741((float) arg0, 0.0F, (float) arg1, (float) arg3 + var8, (float) arg2 + var9, 0.0F, (byte) 80)) {
            this.method3755((byte) 86);
            this.method3717(arg4, (byte) -123);
            this.method3777(false, 0, class663.field9083);
            this.method3713(class663.field9083, 0, (byte) 99);
            this.method3737(3793, arg5);
            this.method3726((byte) 108);
            this.method1397((byte) 125, false);
            this.method3760(1);
            this.method1397((byte) 127, true);
            this.method3713(class632.field8774, 0, (byte) 111);
            this.method3777(false, 0, class632.field8774);
        }
    }

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "(II)Laia;", line = 3057)
    public class384 method1431(int arg0, int arg1) {
        if (arg0 != -16278) {
            this.field9645 = -0.1410343F;
        }
        ++field9482;
        if (arg1 != 6) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    return ~arg1 == -8 ? new class263(this) : new class168(this);
                } else {
                    return new class165(this, this.field9446);
                }
            } else {
                return new class571(this);
            }
        } else {
            return new class441(this);
        }
    }

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "(ZI)V", line = 3112)
    public final void method3775(boolean arg0, int arg1) {
        if (arg1 == 0) {
            if (this.field9599 != arg0) {
                this.field9599 = arg0;
                this.method1416((byte) 123);
            }
            ++field9384;
        }
    }

    @OriginalMember(owner = "client!bm", name = "K", descriptor = "(I)V", line = 3129)
    private final void method3776(int arg0) {
        ++field9408;
        if (arg0 != 0) {
            this.field9581 = -60;
        }
        if (this.field9386 == null) {
            this.field9525 = this.field9489 = 1;
        } else {
            Dimension var2 = this.field9386.getSize();
            this.field9489 = var2.height;
            this.field9525 = var2.width;
        }
        this.field9506 = this.field9489;
        this.field9502 = this.field9525;
        this.method3763(262144);
        this.method3749((byte) -32);
        this.method3739(4);
        this.method1419(113);
        this.method3754(true);
        this.method3759((byte) 66);
        this.method59();
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZILwga;)V", line = 3168)
    public final void method3777(boolean arg0, int arg1, class506 arg2) {
        this.method1395(arg0, arg1, false, -58, arg2);
        ++field9388;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIZ)Lac;", line = 3181)
    public final class712 method70(int arg0, int arg1, boolean arg2) {
        ++field9407;
        return new class507(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "(Z)V", line = 3190)
    public final void method3778(boolean arg0) {
        ++field9537;
        if (arg0) {
            this.field9604 = true;
        }
        if (this.field9562 != 2) {
            this.method3787(117);
            this.method3730((byte) -25, false);
            this.method3745(false, 51);
            this.method3720(0, false);
            this.method3765(false, -32);
            this.method3725(false, 100, -2, false);
            this.field9562 = 2;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIII)V", line = 3215)
    public final void method74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field9542;
    }

    @OriginalMember(owner = "client!bm", name = "N", descriptor = "(I)I", line = 3222)
    public final int method3779(int arg0) {
        if (arg0 != 14) {
            this.field9566 = null;
        }
        ++field9425;
        return this.field9652;
    }

    @OriginalMember(owner = "client!bm", name = "O", descriptor = "(I)V", line = 3233)
    private final void method3780(int arg0) {
        int var2 = -22 / ((arg0 - -45) / 58);
        if (class692.field9816 != this.field9626) {
            class43 var3 = this.field9626;
            this.field9626 = class692.field9816;
            if (!var3.method362(13)) {
                this.method3719(-23987);
            }
            this.method3784((byte) -54);
            this.field9572 = this.field9635;
            this.method3783((byte) -108);
            this.field9562 &= -8;
        }
        ++field9495;
    }

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "(II)V", line = 3256)
    public final void method3781(int arg0, int arg1) {
        if (arg1 == 1) {
            this.method3708(126, class409.field5765, class409.field5765);
        } else if (arg1 == 0) {
            this.method3708(arg0 + 109, class155.field1901, class155.field1901);
        } else if (~arg1 != -3) {
            if (~arg1 != -4) {
                if (~arg1 == -5) {
                    this.method3708(84, class262.field3332, class262.field3332);
                }
            } else {
                this.method3708(95, class155.field1901, class235.field3034);
            }
        } else {
            this.method3708(arg0 ^ -123, class409.field5765, class353.field4729);
        }
        if (arg0 != -3) {
            this.field9622 = 64;
        }
        ++field9486;
    }

    @OriginalMember(owner = "client!bm", name = "P", descriptor = "(I)V", line = 3285)
    private final void method3782(int arg0) {
        if (!this.field9561) {
            float[] var2 = this.field9648;
            if (this.field9502 != 0 && ~this.field9506 != -1) {
                var2[9] = 0.0F;
                var2[12] = -1.0F;
                var2[0] = 2.0F / (float) this.field9502;
                var2[5] = -2.0F / (float) this.field9506;
                var2[13] = 1.0F;
                var2[15] = 1.0F;
                var2[8] = 0.0F;
                var2[1] = 0.0F;
                var2[11] = 0.0F;
                var2[14] = 0.5F;
                var2[3] = 0.0F;
                var2[6] = 0.0F;
                var2[7] = 0.0F;
                var2[4] = 0.0F;
                var2[10] = 0.5F;
                var2[2] = 0.0F;
            } else {
                var2[8] = 0.0F;
                var2[4] = 0.0F;
                var2[2] = 0.0F;
                var2[0] = 1.0F;
                var2[9] = 0.0F;
                var2[1] = 0.0F;
                var2[3] = 0.0F;
                var2[6] = 0.0F;
                var2[13] = 0.0F;
                var2[5] = 1.0F;
                var2[12] = 0.0F;
                var2[11] = 0.0F;
                var2[7] = 0.0F;
                var2[15] = 1.0F;
                var2[10] = 1.0F;
                var2[14] = 0.0F;
            }
            this.field9561 = true;
        }
        ++field9541;
        if (arg0 < 23) {
            this.method3729(-59);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "()Z", line = 3345)
    public final boolean method107() {
        ++field9530;
        return false;
    }

    @OriginalMember(owner = "client!bm", name = "G", descriptor = "(B)V", line = 3353)
    private final void method3783(byte arg0) {
        if (arg0 >= -40) {
            this.field9667 = null;
        }
        this.method1424(-673);
        ++field9509;
        if (this.field9643 != null) {
            this.field9643.method1868((byte) 99);
        }
    }

    @OriginalMember(owner = "client!bm", name = "H", descriptor = "(B)V", line = 3370)
    private final void method3784(byte arg0) {
        ++field9431;
        if (!this.field9575) {
            float[] var2 = this.field9635;
            float var3 = (float) (-this.field9596 * this.field9559) / (float) this.field9622;
            float var4 = (float) ((this.field9502 - this.field9596) * this.field9559) / (float) this.field9622;
            float var5 = (float) (this.field9603 * this.field9559) / (float) this.field9614;
            float var6 = (float) ((this.field9603 - this.field9506) * this.field9559) / (float) this.field9614;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field9559 * 2.0F;
                var2[5] = var7 / (var5 - var6);
                var2[11] = -1.0F;
                var2[2] = 0.0F;
                var2[15] = 0.0F;
                var2[12] = 0.0F;
                var2[9] = (var5 + var6) / (var5 - var6);
                var2[0] = var7 / (-var3 + var4);
                var2[10] = this.field9565 = (float) this.field9619 / (float) (-this.field9619 + this.field9559);
                var2[6] = 0.0F;
                var2[14] = this.field9629 = (float) (this.field9619 * this.field9559) / (float) (-this.field9619 + this.field9559);
                var2[7] = 0.0F;
                var2[3] = 0.0F;
                var2[13] = 0.0F;
                var2[8] = (var3 + var4) / (-var3 + var4);
                var2[4] = 0.0F;
                var2[1] = 0.0F;
            } else {
                var2[6] = 0.0F;
                var2[13] = 0.0F;
                var2[3] = 0.0F;
                var2[9] = 0.0F;
                var2[5] = 1.0F;
                var2[14] = 0.0F;
                var2[4] = 0.0F;
                var2[10] = 1.0F;
                var2[0] = 1.0F;
                var2[12] = 0.0F;
                var2[15] = 1.0F;
                var2[11] = 0.0F;
                var2[1] = 0.0F;
                var2[2] = 0.0F;
                var2[7] = 0.0F;
                var2[8] = 0.0F;
            }
            this.method3769((byte) -124);
            this.field9575 = true;
        }
        int var8 = -68 % ((14 - arg0) / 62);
    }

    @OriginalMember(owner = "client!bm", name = "R", descriptor = "(I)V", line = 3439)
    public final void method3785(int arg0) {
        ++field9512;
        Enumeration var2 = this.field9432.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method1384(this.field9432.get(var3), true, var3);
        }
        this.field9674.method474(-111);
        if (arg0 != 9) {
            this.method114();
        }
        this.field9666.method474(-122);
        this.field9664.method474(-87);
        this.field9668.method3355(6673);
        this.field9667.method3355(6673);
        this.field9657.method3355(arg0 ^ 6680);
        this.field9659.method3355(6673);
        this.field9658.method3355(6673);
        this.field9605.method1653(2);
        this.field9655.method474(-106);
    }

    @OriginalMember(owner = "client!bm", name = "S", descriptor = "(I)V", line = 3471)
    private final void method3786(int arg0) {
        ++field9507;
        if (arg0 > 0) {
            this.field9644 = 86;
        }
        this.field9602 = (float) this.field9619;
    }

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "(II)I", line = 3484)
    public final int method135(int arg0, int arg1) {
        ++field9535;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!bm", name = "U", descriptor = "(I)V", line = 3496)
    private final void method3787(int arg0) {
        ++field9418;
        if (class438.field6149 != this.field9626) {
            class43 var2 = this.field9626;
            this.field9626 = class438.field6149;
            if (var2.method362(13)) {
                this.method3719(-23987);
            }
            this.method3782(30);
            this.field9572 = this.field9648;
            this.method3783((byte) -118);
            this.field9562 &= -25;
        }
        if (arg0 < 104) {
            this.field9672 = null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "da", descriptor = "(III[I)V", line = 3522)
    public final void method109(int arg0, int arg1, int arg2, int[] arg3) {
        ++field9477;
        float var5 = this.field9549.method2720((float) arg2, (byte) -81, (float) arg0, (float) arg1);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field9596;
            var7 = this.field9603;
        } else {
            var6 = (int) ((float) this.field9622 * this.field9549.method2726(1, (float) arg1, (float) arg0, (float) arg2) / var5);
            var7 = (int) ((float) this.field9614 * this.field9549.method2724((float) arg0, (float) arg2, 3, (float) arg1) / var5);
        }
        arg3[1] = (int) ((float) var7 - this.field9607);
        arg3[0] = (int) ((float) var6 + -this.field9642);
        arg3[2] = (int) var5;
    }

    @OriginalMember(owner = "client!bm", name = "V", descriptor = "(I)V", line = 3547)
    public final void method3788(int arg0) {
        this.field9588 = new class329[this.field9592];
        ++field9475;
        this.field9632 = new class354[this.field9592];
        this.field9580 = new class462[this.field9592];
        this.field9654 = new class442[this.field9592];
        this.field9630 = new class442[this.field9592];
        for (int var2 = 0; ~var2 > ~this.field9592; ++var2) {
            this.field9630[var2] = class155.field1901;
            this.field9654[var2] = class155.field1901;
            this.field9632[var2] = class738.field10334;
            this.field9580[var2] = new class462();
        }
        this.field9613 = new class621[this.field9567 - 2];
        this.field9593 = this.method1401(class440.field6178, 1, class240.field3093, true, 1);
        this.method133(new class495(arg0));
        this.field9673 = this.method1434(true, new class734[] { new class734(new class453[] { class453.field6343, class453.field6353 }) });
        this.field9662 = this.method1434(true, new class734[] { new class734(new class453[] { class453.field6343, class453.field6351 }) });
        this.field9669 = this.method1434(true, new class734[] { new class734(class453.field6343), new class734(class453.field6351), new class734(class453.field6353), new class734(class453.field6349) });
        this.field9665 = this.method1434(true, new class734[] { new class734(class453.field6343), new class734(class453.field6351), new class734(class453.field6353) });
        this.field9672 = new class613(this, 0, 0, false, false);
        this.field9668 = new class613(this, 0, 0, true, true);
        this.field9671 = new class613(this, 0, 0, false, false);
        this.field9667 = new class613(this, 0, 0, true, true);
        this.field9661 = new class613(this, 0, 0, false, false);
        this.field9657 = new class613(this, 0, 0, true, true);
        this.field9663 = new class613(this, 0, 0, false, false);
        this.field9659 = new class613(this, 0, 0, true, true);
        this.field9660 = new class613(this, 0, 0, false, false);
        this.field9658 = new class613(this, 0, 0, true, true);
        this.field9605 = new class275(this);
        this.field9655 = this.method1412(true, true);
        this.method3774(false);
        this.field9446 = new class9(this);
        this.field9554[1] = this.method1431(-16278, 1);
        this.field9554[2] = this.method1431(-16278, 2);
        this.field9554[4] = this.method1431(-16278, 4);
        this.field9554[5] = this.method1431(-16278, 5);
        this.field9554[6] = this.method1431(-16278, 6);
        this.field9554[7] = this.method1431(arg0 + -278422, 7);
        this.field9554[3] = this.method1431(-16278, 3);
        this.field9554[8] = this.method1431(-16278, 8);
        this.field9554[9] = this.method1431(-16278, 9);
        if (!this.field9554[2].method1021((byte) 108)) {
            this.field9554[2] = this.method1431(-16278, 0);
        }
        if (!this.field9554[4].method1021((byte) 92)) {
            this.field9554[4] = this.field9554[2];
        }
        if (!this.field9554[8].method1021((byte) 126)) {
            this.field9554[8] = this.field9554[4];
        }
        if (!this.field9554[9].method1021((byte) 81)) {
            this.field9554[9] = this.field9554[8];
        }
        this.method1380((byte) -1);
        this.method59();
        this.method116();
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(IZ)V", line = 3622)
    public final void method3789(int arg0, boolean arg1) {
        ++field9399;
        if (!this.field9579 == arg1) {
            this.field9579 = arg1;
            this.method1388(true);
        }
        if (arg0 != 0) {
            this.field9645 = 1.1767019F;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/lang/Object;ZLjava/awt/Canvas;)V")
    public abstract void method1384(Object arg0, boolean arg1, Canvas arg2);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZIZILwga;)V")
    public abstract void method1395(boolean arg0, int arg1, boolean arg2, int arg3, class506 arg4);

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(B)V")
    public abstract void method1398(byte arg0);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BIIZ[FILem;I)Lbaa;")
    public abstract class620 method1387(byte arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5, class610 arg6, int arg7);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZZ)Lru;")
    public abstract class246 method1412(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "(I)V")
    public abstract void method1432(int arg0);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILmia;)V")
    public abstract void method1436(int arg0, class657 arg1);

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "(B)V")
    public abstract void method1416(byte arg0);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lew;BLem;)Z")
    public abstract boolean method1399(class240 arg0, byte arg1, class610 arg2);

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(IZ)Lu;")
    public abstract class60 method1423(int arg0, boolean arg1);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIBLem;[BI)Lob;")
    public abstract class375 method1410(int arg0, int arg1, byte arg2, class610 arg3, byte[] arg4, int arg5);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(III[IZII)Lbaa;")
    public abstract class620 method1438(int arg0, int arg1, int arg2, int[] arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BLem;Lew;)Z")
    public abstract boolean method1385(byte arg0, class610 arg1, class240 arg2);

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "(I)V")
    public abstract void method1433(int arg0);

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "(B)V")
    public abstract void method1390(byte arg0);

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "(B)V")
    public abstract void method1383(byte arg0);

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "(B)V")
    public abstract void method1425(byte arg0);

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "(I)V")
    public abstract void method1424(int arg0);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZ[[IZ)Lsq;")
    public abstract class207 method1429(int arg0, boolean arg1, int[][] arg2, boolean arg3);

    @OriginalMember(owner = "client!bm", name = "w", descriptor = "(I)V")
    public abstract void method1404(int arg0);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILsea;IB)V")
    public abstract void method1389(int arg0, class399 arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!bm", name = "y", descriptor = "(I)V")
    public abstract void method1396(int arg0);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lu;BI)V")
    public abstract void method1407(class60 arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "(I)V")
    public abstract void method1408(int arg0);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lwga;ZBI)V")
    public abstract void method1403(class506 arg0, boolean arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!bm", name = "C", descriptor = "(I)V")
    public abstract void method1419(int arg0);

    @OriginalMember(owner = "client!bm", name = "E", descriptor = "(I)V")
    public abstract void method1386(int arg0);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
    public abstract void method1417(Canvas arg0, byte arg1, Object arg2);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZ[BILem;III)Lbaa;")
    public abstract class620 method1413(int arg0, boolean arg1, byte[] arg2, int arg3, class610 arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZLjava/awt/Canvas;)Ljava/lang/Object;")
    public abstract Object method1394(boolean arg0, Canvas arg1);

    @OriginalMember(owner = "client!bm", name = "u", descriptor = "(B)V")
    public abstract void method1409(byte arg0);

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "(B)V")
    public abstract void method1427(byte arg0);

    @OriginalMember(owner = "client!bm", name = "w", descriptor = "(B)V")
    public abstract void method1437(byte arg0);

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "(B)V")
    public abstract void method1411(byte arg0);

    @OriginalMember(owner = "client!bm", name = "A", descriptor = "(B)V")
    public abstract void method1422(byte arg0);

    @OriginalMember(owner = "client!bm", name = "B", descriptor = "(B)V")
    public abstract void method1414(byte arg0);

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "(II)V")
    public abstract void method1381(int arg0, int arg1);

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "(Z)V")
    public abstract void method1388(boolean arg0);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lem;ILew;ZI)Lbaa;")
    public abstract class620 method1401(class610 arg0, int arg1, class240 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Laca;B)V")
    public abstract void method1428(class580 arg0, byte arg1);

    @OriginalMember(owner = "client!bm", name = "J", descriptor = "(I)V")
    public abstract void method1392(int arg0);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Z[Lit;)Lmia;")
    public abstract class657 method1434(boolean arg0, class734[] arg1);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILsea;BIILru;I)V")
    public abstract void method1415(int arg0, class399 arg1, byte arg2, int arg3, int arg4, class246 arg5, int arg6);

    @OriginalMember(owner = "client!bm", name = "L", descriptor = "(I)V")
    public abstract void method1406(int arg0);

    @OriginalMember(owner = "client!bm", name = "M", descriptor = "(I)V")
    public abstract void method1393(int arg0);

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(BZ)V")
    public abstract void method1397(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!bm", name = "Q", descriptor = "(I)V")
    public abstract void method1435(int arg0);

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "(Z)V")
    public abstract void method1400(boolean arg0);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
    public abstract void method1426(byte arg0, Object arg1, Canvas arg2);

    @OriginalMember(owner = "client!bm", name = "T", descriptor = "(I)F")
    public abstract float method1391(int arg0);
}
