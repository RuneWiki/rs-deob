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

@OriginalClass("client!gca")
public abstract class class261 extends class63 {

    @OriginalMember(owner = "client!gca", name = "wb", descriptor = "Lat;")
    private class398 field3959 = new class398();

    @OriginalMember(owner = "client!gca", name = "pb", descriptor = "Z")
    public boolean field4124 = true;

    @OriginalMember(owner = "client!gca", name = "Uf", descriptor = "Leba;")
    public class615 field4131 = new class615();

    @OriginalMember(owner = "client!gca", name = "Vf", descriptor = "Leba;")
    public class615 field4133 = new class615();

    @OriginalMember(owner = "client!gca", name = "Q", descriptor = "Leba;")
    public class615 field4134 = new class615();

    @OriginalMember(owner = "client!gca", name = "rf", descriptor = "Leba;")
    public class615 field4135 = new class615();

    @OriginalMember(owner = "client!gca", name = "lf", descriptor = "Leba;")
    private class615 field4136 = new class615();

    @OriginalMember(owner = "client!gca", name = "gb", descriptor = "Leba;")
    private class615 field4137 = new class615();

    @OriginalMember(owner = "client!gca", name = "wg", descriptor = "F")
    public float field4139 = -1.0F;

    @OriginalMember(owner = "client!gca", name = "Wd", descriptor = "I")
    public int field4151 = 3584;

    @OriginalMember(owner = "client!gca", name = "hf", descriptor = "I")
    public int field4158 = 50;

    @OriginalMember(owner = "client!gca", name = "ab", descriptor = "Z")
    public boolean field4141 = true;

    @OriginalMember(owner = "client!gca", name = "Ke", descriptor = "Z")
    private boolean field4145 = false;

    @OriginalMember(owner = "client!gca", name = "Qf", descriptor = "Z")
    public boolean field4146 = false;

    @OriginalMember(owner = "client!gca", name = "Jf", descriptor = "I")
    public int field4170 = -1;

    @OriginalMember(owner = "client!gca", name = "Kd", descriptor = "I")
    private int field4154 = 0;

    @OriginalMember(owner = "client!gca", name = "Me", descriptor = "Z")
    private boolean field4183 = false;

    @OriginalMember(owner = "client!gca", name = "xc", descriptor = "I")
    private int field4162 = 0;

    @OriginalMember(owner = "client!gca", name = "Fb", descriptor = "I")
    private int field4173 = 0;

    @OriginalMember(owner = "client!gca", name = "Af", descriptor = "Lhd;")
    public class776 field4176 = class795.field11617;

    @OriginalMember(owner = "client!gca", name = "jc", descriptor = "[F")
    public float[] field4169 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!gca", name = "De", descriptor = "I")
    private int field4184 = -1;

    @OriginalMember(owner = "client!gca", name = "ge", descriptor = "[F")
    private float[] field4150 = new float[16];

    @OriginalMember(owner = "client!gca", name = "Te", descriptor = "I")
    public int field4187 = 0;

    @OriginalMember(owner = "client!gca", name = "td", descriptor = "F")
    public float field4196 = 1.0F;

    @OriginalMember(owner = "client!gca", name = "B", descriptor = "I")
    private int field4182 = -1;

    @OriginalMember(owner = "client!gca", name = "Ud", descriptor = "[F")
    private float[] field4153 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!gca", name = "eb", descriptor = "F")
    public float field4157 = 3584.0F;

    @OriginalMember(owner = "client!gca", name = "S", descriptor = "I")
    public int field4195 = 0;

    @OriginalMember(owner = "client!gca", name = "kc", descriptor = "F")
    public float field4180 = 1.0F;

    @OriginalMember(owner = "client!gca", name = "Hc", descriptor = "[F")
    private float[] field4179 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!gca", name = "re", descriptor = "I")
    public int field4160 = 0;

    @OriginalMember(owner = "client!gca", name = "we", descriptor = "F")
    public float field4163 = -1.0F;

    @OriginalMember(owner = "client!gca", name = "Be", descriptor = "I")
    public int field4159 = 8;

    @OriginalMember(owner = "client!gca", name = "Ld", descriptor = "I")
    public int field4181 = 0;

    @OriginalMember(owner = "client!gca", name = "Ce", descriptor = "F")
    public float field4192 = 1.0F;

    @OriginalMember(owner = "client!gca", name = "Pe", descriptor = "Z")
    public boolean field4166 = false;

    @OriginalMember(owner = "client!gca", name = "vf", descriptor = "I")
    public int field4210 = 3;

    @OriginalMember(owner = "client!gca", name = "ze", descriptor = "I")
    public int field4203 = 0;

    @OriginalMember(owner = "client!gca", name = "Hf", descriptor = "I")
    public int field4201 = 0;

    @OriginalMember(owner = "client!gca", name = "sf", descriptor = "F")
    public float field4189 = 1.0F;

    @OriginalMember(owner = "client!gca", name = "ue", descriptor = "[F")
    public float[] field4185 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!gca", name = "lc", descriptor = "I")
    private int field4221 = 0;

    @OriginalMember(owner = "client!gca", name = "ob", descriptor = "I")
    public int field4191 = 0;

    @OriginalMember(owner = "client!gca", name = "lg", descriptor = "I")
    private int field4202 = 16777215;

    @OriginalMember(owner = "client!gca", name = "O", descriptor = "Z")
    public boolean field4165 = true;

    @OriginalMember(owner = "client!gca", name = "md", descriptor = "[F")
    private float[] field4222 = new float[16];

    @OriginalMember(owner = "client!gca", name = "P", descriptor = "Z")
    public boolean field4194 = true;

    @OriginalMember(owner = "client!gca", name = "zf", descriptor = "[Lqba;")
    private class428[] field4224 = new class428[10];

    @OriginalMember(owner = "client!gca", name = "bd", descriptor = "Z")
    public boolean field4218 = false;

    @OriginalMember(owner = "client!gca", name = "Ge", descriptor = "[F")
    public float[] field4167 = this.field4153;

    @OriginalMember(owner = "client!gca", name = "jb", descriptor = "Z")
    public boolean field4147 = false;

    @OriginalMember(owner = "client!gca", name = "X", descriptor = "[F")
    private float[] field4219 = new float[16];

    @OriginalMember(owner = "client!gca", name = "rd", descriptor = "[F")
    private float[] field4225 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!gca", name = "xe", descriptor = "Z")
    private boolean field4156 = false;

    @OriginalMember(owner = "client!gca", name = "N", descriptor = "Z")
    private boolean field4211 = false;

    @OriginalMember(owner = "client!gca", name = "Cb", descriptor = "I")
    public int field4212 = 512;

    @OriginalMember(owner = "client!gca", name = "Rf", descriptor = "I")
    private int field4229 = 1;

    @OriginalMember(owner = "client!gca", name = "kg", descriptor = "I")
    public int field4232 = 0;

    @OriginalMember(owner = "client!gca", name = "Db", descriptor = "I")
    public int field4168 = 128;

    @OriginalMember(owner = "client!gca", name = "qf", descriptor = "I")
    public int field4188 = 0;

    @OriginalMember(owner = "client!gca", name = "Jd", descriptor = "F")
    private float field4216 = 1.0F;

    @OriginalMember(owner = "client!gca", name = "eg", descriptor = "I")
    public int field4205 = -1;

    @OriginalMember(owner = "client!gca", name = "Cc", descriptor = "Z")
    private boolean field4223 = false;

    @OriginalMember(owner = "client!gca", name = "zd", descriptor = "I")
    public int field4199 = 512;

    @OriginalMember(owner = "client!gca", name = "Vb", descriptor = "F")
    public float field4235 = 3584.0F;

    @OriginalMember(owner = "client!gca", name = "J", descriptor = "I")
    public int field4217 = 0;

    @OriginalMember(owner = "client!gca", name = "of", descriptor = "I")
    private int field4209 = -1;

    @OriginalMember(owner = "client!gca", name = "Sf", descriptor = "Z")
    public boolean field4237 = true;

    @OriginalMember(owner = "client!gca", name = "Fd", descriptor = "Z")
    private boolean field4228 = false;

    @OriginalMember(owner = "client!gca", name = "yg", descriptor = "Leu;")
    public class507 field4230 = class317.field5178;

    @OriginalMember(owner = "client!gca", name = "nf", descriptor = "Z")
    public boolean field4231 = true;

    @OriginalMember(owner = "client!gca", name = "uf", descriptor = "Ljaclib/memory/Stream;")
    private Stream field4148 = new Stream();

    @OriginalMember(owner = "client!gca", name = "Kc", descriptor = "Leba;")
    private class615 field4256 = new class615();

    @OriginalMember(owner = "client!gca", name = "Gd", descriptor = "Ljava/awt/Canvas;")
    public Canvas field3973;

    @OriginalMember(owner = "client!gca", name = "ke", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3967;

    @OriginalMember(owner = "client!gca", name = "hc", descriptor = "Lgda;")
    public class58 field4092;

    @OriginalMember(owner = "client!gca", name = "Kf", descriptor = "Ljava/lang/Object;")
    public Object field4119;

    @OriginalMember(owner = "client!gca", name = "Ff", descriptor = "Ljava/lang/Object;")
    private Object field3974;

    @OriginalMember(owner = "client!gca", name = "Xd", descriptor = "I")
    public int field4177;

    @OriginalMember(owner = "client!gca", name = "We", descriptor = "I")
    private int field4042;

    @OriginalMember(owner = "client!gca", name = "w", descriptor = "I")
    public int field4015;

    @OriginalMember(owner = "client!gca", name = "sg", descriptor = "I")
    public int field4138;

    @OriginalMember(owner = "client!gca", name = "x", descriptor = "I")
    private int field4054;

    @OriginalMember(owner = "client!gca", name = "Ne", descriptor = "I")
    public int field3947;

    @OriginalMember(owner = "client!gca", name = "Z", descriptor = "Lgs;")
    private class46 field4215;

    @OriginalMember(owner = "client!gca", name = "H", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field4016;

    @OriginalMember(owner = "client!gca", name = "Ag", descriptor = "[Ljava/lang/String;")
    private static final String[] field4263 = new String[] { method2280(method2279("i>-QIGu")), method2280(method2279("i>-QKMu")), method2280(method2279("`( \u0013")), method2280(method2279("i>-QXJu")), method2280(method2279("usbQq")), method2280(method2279("i>-Q[Fu")), method2280(method2279("i>-QMMu")), method2280(method2279("i>-QIJu")), method2280(method2279("i>-QEGu")), method2280(method2279("i>-QAGu")), method2280(method2279("i>-QELu")), method2280(method2279("i>-QOGu")), method2280(method2279("i>-Q]Du")), method2280(method2279("i>-Q]&")), method2280(method2279("i>-QGOu")), method2280(method2279("i>-QDJu")), method2280(method2279("i>-Qtou")), method2280(method2279("i>-QKDu")), method2280(method2279("i>-QYJu")), method2280(method2279("i>-QVOu")), method2280(method2279("i>-QHFu")), method2280(method2279("i>-QCDu")), method2280(method2279("i>-Q\\Ou")), method2280(method2279("}886k`2>\u001a^k--\u0016bz")), method2280(method2279("d<:\u001e\"o*8QOo3:\u001e\u007f")), method2280(method2279("i>-Q~ou")), method2280(method2279("i>-QJFu")), method2280(method2279("i>-QMHu")), method2280(method2279("i>-QC&")), method2280(method2279("i>-QYFu")), method2280(method2279("i>-QIMu")), method2280(method2279("i>-QDFu")), method2280(method2279("i>-Q\\Fu")), method2280(method2279("i>-Q[Gu")), method2280(method2279("i>-QHGu")), method2280(method2279("i>-QGGu")), method2280(method2279("i>-Q]Iu")), method2280(method2279("i>-QKJu")), method2280(method2279("i>-Q_&")), method2280(method2279("i>-QAIu")), method2280(method2279("i>-QEFu")), method2280(method2279("i>-QZOu")), method2280(method2279("i>-Q[&")), method2280(method2279("i>-QEMu")), method2280(method2279("i>-QM&")), method2280(method2279("i>-QXMu")), method2280(method2279("i>-QDOu")), method2280(method2279("i>-Q`ou")), method2280(method2279("i>-Q_Ou")), method2280(method2279("i>-QOHu")), method2280(method2279("i>-QMFu")), method2280(method2279("i>-Q[Ku")), method2280(method2279("i>-QCJu")), method2280(method2279("i>-QXIu")), method2280(method2279("i>-Q^Mu")), method2280(method2279("i>-QNMu")), method2280(method2279("i>-QMDu")), method2280(method2279("i>-Q[Mu")), method2280(method2279("i>-QY&")), method2280(method2279("i>-Q\\Mu")), method2280(method2279("i>-QDMu")), method2280(method2279("i>-QZFu")), method2280(method2279("i>-Q^Du")), method2280(method2279("i>-QILu")), method2280(method2279("i>-QN&")), method2280(method2279("i>-QD&")), method2280(method2279("i>-Q@Ju")), method2280(method2279("i>-Q]Gu")), method2280(method2279("i>-QHDu")), method2280(method2279("i>-Q_Gu")), method2280(method2279("i>-QBDu")), method2280(method2279("i>-QZDu")), method2280(method2279("i>-QCMu")), method2280(method2279("i>-QGJu")), method2280(method2279("i>-QNGu")), method2280(method2279("i>-QNJu")), method2280(method2279("i>-QBIu")), method2280(method2279("i>-QCGu")), method2280(method2279("i>-QBFu")), method2280(method2279("i>-Q\\Gu")), method2280(method2279("i>-QYIu")), method2280(method2279("i>-QOFu")), method2280(method2279("i>-QXDu")), method2280(method2279("i>-QOJu")), method2280(method2279("i>-QJDu")), method2280(method2279("i>-Q_Du")), method2280(method2279("i>-Q_Lu")), method2280(method2279("i>-QEJu")), method2280(method2279("i>-Q@Ou")), method2280(method2279("i>-Q@Gu")), method2280(method2279("i>-Q[Du")), method2280(method2279("i>-QU&")), method2280(method2279("i>-Q^Iu")), method2280(method2279("i>-QAFu")), method2280(method2279("i>-Q@Iu")), method2280(method2279("i>-QZGu")), method2280(method2279("i>-QXGu")), method2280(method2279("i>-Q\\Lu")), method2280(method2279("i>-QI&")), method2280(method2279("i>-QO&")), method2280(method2279("i>-QDGu")), method2280(method2279("i>-QJMu")), method2280(method2279("i>-QNLu")), method2280(method2279("i>-QZ&")), method2280(method2279("i>-Q\\Iu")), method2280(method2279("i>-QX&")), method2280(method2279("i>-QBJu")), method2280(method2279("i>-Qmou")), method2280(method2279("i>-Q\\Du")), method2280(method2279("i>-QIOu")), method2280(method2279("i>-QGDu")), method2280(method2279("i>-QFFu")), method2280(method2279("i>-QKFu")), method2280(method2279("i>-QODu")), method2280(method2279("i>-QXLu")), method2280(method2279("i>-Q^Ju")), method2280(method2279("i>-Q~&")), method2280(method2279("i>-Q|ou")), method2280(method2279("i>-Q@Fu")), method2280(method2279("i>-QCFu")), method2280(method2279("i>-QAJu")), method2280(method2279("i>-QALu")), method2280(method2279("i>-QFOu")), method2280(method2279("i>-QKGu")), method2280(method2279("i>-Q0g3%\u000b2&")), method2280(method2279("i>-QA&")), method2280(method2279("i>-QJGu")), method2280(method2279("i>-QT&")), method2280(method2279("i>-QBGu")), method2280(method2279("i>-QZIu")), method2280(method2279("i>-QGFu")), method2280(method2279("i>-Q^Fu")), method2280(method2279("i>-QMGu")), method2280(method2279("i>-QYGu")), method2280(method2279("i>-Qvou")), method2280(method2279("i>-Qhou")), method2280(method2279("i>-QFGu")), method2280(method2279("i>-Q]Fu")), method2280(method2279("i>-Q_Iu")), method2280(method2279("i>-QCIu")), method2280(method2279("i>-Q^&")), method2280(method2279("i>-Q@Du")), method2280(method2279("i>-QNOu")), method2280(method2279("i>-Qe&")), method2280(method2279("i>-Q]Mu")), method2280(method2279("i>-QTOu")), method2280(method2279("i>-QFJu")), method2280(method2279("i>-QMJu")), method2280(method2279("i>-QYMu")), method2280(method2279("i>-Qj&")), method2280(method2279("i>-Q^Gu")), method2280(method2279("i>-QBOu")), method2280(method2279("i>-QAMu")), method2280(method2279("i>-QNFu")), method2280(method2279("i>-QFDu")), method2280(method2279("i>-QG&")), method2280(method2279("i>-Q\\Ju")), method2280(method2279("i>-Q@&")), method2280(method2279("i>-QK&")), method2280(method2279("i>-Q[Iu")), method2280(method2279("i>-QJJu")), method2280(method2279("i>-QJLu")), method2280(method2279("i>-QXFu")), method2280(method2279("i>-QIFu")), method2280(method2279("i>-QEDu")), method2280(method2279("i>-Q_Fu")), method2280(method2279("i>-QADu")), method2280(method2279("i>-QYDu")), method2280(method2279("i>-QIDu")), method2280(method2279("i>-Q\\&")), method2280(method2279("i>-QNDu")), method2280(method2279("i>-QHOu")), method2280(method2279("i>-QDDu")), method2280(method2279("i>-QYLu")) };

    @OriginalMember(owner = "client!gca", name = "db", descriptor = "Lpe;")
    public static class636 field4005 = new class636(7, 0, 1, 1);

    @OriginalMember(owner = "client!gca", name = "de", descriptor = "F")
    private float field4152;

    @OriginalMember(owner = "client!gca", name = "T", descriptor = "F")
    public float field4155;

    @OriginalMember(owner = "client!gca", name = "Df", descriptor = "F")
    public float field4161;

    @OriginalMember(owner = "client!gca", name = "Rb", descriptor = "F")
    private float field4171;

    @OriginalMember(owner = "client!gca", name = "W", descriptor = "F")
    public float field4186;

    @OriginalMember(owner = "client!gca", name = "ag", descriptor = "F")
    public float field4198;

    @OriginalMember(owner = "client!gca", name = "zg", descriptor = "F")
    public float field4208;

    @OriginalMember(owner = "client!gca", name = "xd", descriptor = "F")
    public float field4213;

    @OriginalMember(owner = "client!gca", name = "vc", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!gca", name = "Fe", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!gca", name = "rg", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!gca", name = "v", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!gca", name = "Wf", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!gca", name = "Ue", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!gca", name = "Se", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!gca", name = "Yf", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!gca", name = "fb", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!gca", name = "Lc", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!gca", name = "kf", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!gca", name = "Ef", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!gca", name = "fc", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!gca", name = "Gf", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!gca", name = "bf", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!gca", name = "fe", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!gca", name = "Qd", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!gca", name = "zc", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!gca", name = "oc", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!gca", name = "Id", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!gca", name = "le", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!gca", name = "Md", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!gca", name = "yc", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!gca", name = "Ie", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!gca", name = "Jb", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!gca", name = "Ib", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!gca", name = "y", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!gca", name = "mf", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!gca", name = "If", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!gca", name = "Lb", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!gca", name = "Ec", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!gca", name = "hd", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!gca", name = "tg", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!gca", name = "Qc", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!gca", name = "Zd", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!gca", name = "Xb", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!gca", name = "af", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!gca", name = "ie", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!gca", name = "yb", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!gca", name = "sb", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!gca", name = "dg", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!gca", name = "pf", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!gca", name = "Rd", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!gca", name = "ib", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!gca", name = "G", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!gca", name = "yf", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!gca", name = "Zf", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!gca", name = "me", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!gca", name = "R", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!gca", name = "wc", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!gca", name = "He", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!gca", name = "ce", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!gca", name = "ac", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!gca", name = "Gb", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!gca", name = "Yb", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!gca", name = "A", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!gca", name = "od", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!gca", name = "Bc", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!gca", name = "Y", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!gca", name = "nc", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!gca", name = "je", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!gca", name = "xb", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!gca", name = "Oe", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!gca", name = "Pc", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!gca", name = "F", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!gca", name = "Zc", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!gca", name = "ae", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!gca", name = "Le", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!gca", name = "ee", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!gca", name = "Ub", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!gca", name = "s", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!gca", name = "Cf", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!gca", name = "z", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!gca", name = "Nf", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!gca", name = "kb", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!gca", name = "mb", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!gca", name = "rb", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!gca", name = "V", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!gca", name = "D", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!gca", name = "Ab", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!gca", name = "Bf", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!gca", name = "Nb", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!gca", name = "Nd", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!gca", name = "Gc", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!gca", name = "Yc", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!gca", name = "wf", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!gca", name = "Ad", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!gca", name = "Hb", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!gca", name = "Rc", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!gca", name = "u", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!gca", name = "cc", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!gca", name = "uc", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!gca", name = "Pf", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!gca", name = "Tc", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!gca", name = "ud", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!gca", name = "oe", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!gca", name = "Lf", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!gca", name = "he", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!gca", name = "og", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!gca", name = "Uc", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!gca", name = "Ac", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!gca", name = "Of", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!gca", name = "gd", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!gca", name = "qc", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!gca", name = "cb", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!gca", name = "jg", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!gca", name = "ff", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!gca", name = "Wc", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!gca", name = "Vd", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!gca", name = "be", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!gca", name = "Hd", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!gca", name = "Ic", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!gca", name = "yd", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!gca", name = "fd", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!gca", name = "Nc", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!gca", name = "tb", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!gca", name = "bb", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!gca", name = "bc", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!gca", name = "L", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!gca", name = "Pb", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!gca", name = "xg", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!gca", name = "gc", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!gca", name = "ef", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!gca", name = "I", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!gca", name = "Oc", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!gca", name = "Re", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!gca", name = "Yd", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!gca", name = "Mc", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!gca", name = "Bb", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!gca", name = "sd", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!gca", name = "Cd", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!gca", name = "Xf", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!gca", name = "dd", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!gca", name = "Qb", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!gca", name = "ig", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!gca", name = "cf", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!gca", name = "Ve", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!gca", name = "Sd", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!gca", name = "pe", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!gca", name = "nb", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!gca", name = "Ob", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!gca", name = "Tb", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!gca", name = "Bd", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!gca", name = "bg", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!gca", name = "Zb", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!gca", name = "ld", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!gca", name = "ug", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!gca", name = "ad", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!gca", name = "df", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!gca", name = "Mb", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!gca", name = "Je", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!gca", name = "cd", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!gca", name = "mc", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!gca", name = "Xe", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!gca", name = "Tf", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!gca", name = "nd", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!gca", name = "ic", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!gca", name = "Pd", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!gca", name = "Wb", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!gca", name = "zb", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!gca", name = "se", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!gca", name = "ng", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!gca", name = "pd", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!gca", name = "tc", descriptor = "I")
    public int field4123;

    @OriginalMember(owner = "client!gca", name = "mg", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!gca", name = "hg", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!gca", name = "ne", descriptor = "I")
    public int field4127;

    @OriginalMember(owner = "client!gca", name = "jd", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!gca", name = "lb", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!gca", name = "ub", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!gca", name = "qb", descriptor = "I")
    public int field4132;

    @OriginalMember(owner = "client!gca", name = "vd", descriptor = "I")
    public int field4143;

    @OriginalMember(owner = "client!gca", name = "Eb", descriptor = "I")
    public int field4175;

    @OriginalMember(owner = "client!gca", name = "xf", descriptor = "I")
    public int field4178;

    @OriginalMember(owner = "client!gca", name = "Qe", descriptor = "I")
    private int field4197;

    @OriginalMember(owner = "client!gca", name = "Kb", descriptor = "I")
    public int field4200;

    @OriginalMember(owner = "client!gca", name = "fg", descriptor = "I")
    public int field4204;

    @OriginalMember(owner = "client!gca", name = "hb", descriptor = "I")
    public int field4214;

    @OriginalMember(owner = "client!gca", name = "cg", descriptor = "I")
    public int field4227;

    @OriginalMember(owner = "client!gca", name = "Ee", descriptor = "I")
    private int field4236;

    @OriginalMember(owner = "client!gca", name = "C", descriptor = "I")
    public int field4238;

    @OriginalMember(owner = "client!gca", name = "Xc", descriptor = "I")
    private int field4261;

    @OriginalMember(owner = "client!gca", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!gca", name = "qg", descriptor = "Lgaa;")
    public class313 field4239;

    @OriginalMember(owner = "client!gca", name = "vb", descriptor = "Lgaa;")
    private class313 field4240;

    @OriginalMember(owner = "client!gca", name = "Dc", descriptor = "Lgaa;")
    public class313 field4243;

    @OriginalMember(owner = "client!gca", name = "ec", descriptor = "Lgaa;")
    private class313 field4245;

    @OriginalMember(owner = "client!gca", name = "sc", descriptor = "Lgaa;")
    private class313 field4247;

    @OriginalMember(owner = "client!gca", name = "pg", descriptor = "Lgaa;")
    public class313 field4251;

    @OriginalMember(owner = "client!gca", name = "dc", descriptor = "Lgaa;")
    public class313 field4253;

    @OriginalMember(owner = "client!gca", name = "Ae", descriptor = "Lb;")
    public class352 field4002;

    @OriginalMember(owner = "client!gca", name = "t", descriptor = "Lln;")
    public class399 field4149;

    @OriginalMember(owner = "client!gca", name = "Sc", descriptor = "Llp;")
    private class414 field4250;

    @OriginalMember(owner = "client!gca", name = "ve", descriptor = "Lqba;")
    private class428 field4233;

    @OriginalMember(owner = "client!gca", name = "Ye", descriptor = "Laea;")
    private class53 field4144;

    @OriginalMember(owner = "client!gca", name = "Jc", descriptor = "Lul;")
    private class599 field4234;

    @OriginalMember(owner = "client!gca", name = "gf", descriptor = "Lfk;")
    private class682 field4241;

    @OriginalMember(owner = "client!gca", name = "wd", descriptor = "Lfk;")
    private class682 field4242;

    @OriginalMember(owner = "client!gca", name = "Mf", descriptor = "Lfk;")
    private class682 field4249;

    @OriginalMember(owner = "client!gca", name = "kd", descriptor = "Lvm;")
    public class717 field4244;

    @OriginalMember(owner = "client!gca", name = "Vc", descriptor = "Lvm;")
    public class717 field4246;

    @OriginalMember(owner = "client!gca", name = "qe", descriptor = "Lvm;")
    public class717 field4248;

    @OriginalMember(owner = "client!gca", name = "Ed", descriptor = "Lvm;")
    public class717 field4252;

    @OriginalMember(owner = "client!gca", name = "tf", descriptor = "Lvm;")
    public class717 field4254;

    @OriginalMember(owner = "client!gca", name = "ed", descriptor = "Lvm;")
    public class717 field4255;

    @OriginalMember(owner = "client!gca", name = "U", descriptor = "Lvm;")
    public class717 field4257;

    @OriginalMember(owner = "client!gca", name = "te", descriptor = "Lvm;")
    public class717 field4258;

    @OriginalMember(owner = "client!gca", name = "ye", descriptor = "Lvm;")
    public class717 field4259;

    @OriginalMember(owner = "client!gca", name = "Fc", descriptor = "Lvm;")
    public class717 field4260;

    @OriginalMember(owner = "client!gca", name = "Od", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field4091;

    @OriginalMember(owner = "client!gca", name = "Sb", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field4094;

    @OriginalMember(owner = "client!gca", name = "Ze", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field4068;

    @OriginalMember(owner = "client!gca", name = "K", descriptor = "Z")
    public boolean field4140;

    @OriginalMember(owner = "client!gca", name = "E", descriptor = "Z")
    public boolean field4142;

    @OriginalMember(owner = "client!gca", name = "qd", descriptor = "Z")
    public boolean field4164;

    @OriginalMember(owner = "client!gca", name = "Dd", descriptor = "Z")
    public boolean field4190;

    @OriginalMember(owner = "client!gca", name = "vg", descriptor = "Z")
    public boolean field4207;

    @OriginalMember(owner = "client!gca", name = "pc", descriptor = "Z")
    public boolean field4262;

    @OriginalMember(owner = "client!gca", name = "M", descriptor = "[Lak;")
    public class369[] field4172;

    @OriginalMember(owner = "client!gca", name = "gg", descriptor = "[Leh;")
    public class380[] field4193;

    @OriginalMember(owner = "client!gca", name = "rc", descriptor = "[Leh;")
    public class380[] field4206;

    @OriginalMember(owner = "client!gca", name = "Td", descriptor = "[Lln;")
    private class399[] field4220;

    @OriginalMember(owner = "client!gca", name = "jf", descriptor = "[Leba;")
    public class615[] field4226;

    @OriginalMember(owner = "client!gca", name = "id", descriptor = "[Lih;")
    public class731[] field4174;

    @OriginalMember(owner = "client!gca", name = "O", descriptor = "(I)Leba;", line = 3)
    public final class615 method2198(int arg0) {
        try {
            ++field4044;
            return arg0 <= 51 ? null : this.field4135;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[166] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "C", descriptor = "(I)Leba;", line = 14)
    public final class615 method2199(int arg0) {
        try {
            ++field4077;
            if (arg0 != 0) {
                this.method1074(true);
            }
            return this.field4226[this.field4181];
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Ljj;BI)V", line = 26)
    private final void method2200(class126 arg0, byte arg1, int arg2) {
        try {
            this.method1036(this.field4241, 0, 2);
            ++field4083;
            this.method1042((byte) 123, this.field4240);
            if (arg1 >= 80) {
                this.method1050(arg0, 0, arg2, 7645);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4263[8] + (arg0 != null ? field4263[4] : field4263[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "t", descriptor = "()V", line = 39)
    public void method202() {
        try {
            if (!this.field4183) {
                for (class568 var1 = this.field3959.method3228(11); var1 != null; var1 = this.field3959.method3216(true)) {
                    ((class748) var1).method5440(-8);
                }
                Enumeration var2 = this.field4068.keys();
                while (var2.hasMoreElements()) {
                    Canvas var3 = (Canvas) var2.nextElement();
                    this.method1044((byte) -127, var3, this.field4068.get(var3));
                }
                class300.method2587((byte) 123, false, true);
                this.field4016.release();
                this.field4183 = true;
            }
            ++field4120;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4263[160] + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "e", descriptor = "(Z)V", line = 78)
    private final void method2201(boolean arg0) {
        try {
            this.field4213 = (float) (this.field4203 - this.field4191);
            if (!arg0) {
                this.field3959 = null;
            }
            this.field4208 = (float) (-this.field4160 + this.field4201);
            ++field3990;
            this.field4161 = (float) (-this.field4191 + this.field4188);
            this.field4198 = (float) (this.field4217 - this.field4160);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[89] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lsn;I)V", line = 100)
    public final void method172(class659 arg0, int arg1) {
        try {
            this.field4144.method553(this, arg1, true, arg0);
            ++field4085;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[48] + (arg0 != null ? field4263[4] : field4263[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "r", descriptor = "(I)V", line = 110)
    private final void method2202(int arg0) {
        try {
            if (!this.field4145) {
                float[] var2 = this.field4219;
                if (this.field4015 != 0 && this.field3947 != 0) {
                    var2[13] = 1.0F;
                    var2[7] = 0.0F;
                    var2[1] = 0.0F;
                    var2[12] = -1.0F;
                    var2[15] = 1.0F;
                    var2[14] = 0.5F;
                    var2[8] = 0.0F;
                    var2[11] = 0.0F;
                    var2[6] = 0.0F;
                    var2[4] = 0.0F;
                    var2[5] = -2.0F / (float) this.field3947;
                    var2[0] = 2.0F / (float) this.field4015;
                    var2[2] = 0.0F;
                    var2[3] = 0.0F;
                    var2[10] = 0.5F;
                    var2[9] = 0.0F;
                } else {
                    var2[3] = 0.0F;
                    var2[14] = 0.0F;
                    var2[7] = 0.0F;
                    var2[2] = 0.0F;
                    var2[1] = 0.0F;
                    var2[15] = 1.0F;
                    var2[9] = 0.0F;
                    var2[13] = 0.0F;
                    var2[11] = 0.0F;
                    var2[5] = 1.0F;
                    var2[0] = 1.0F;
                    var2[4] = 0.0F;
                    var2[12] = 0.0F;
                    var2[10] = 1.0F;
                    var2[6] = 0.0F;
                    var2[8] = 0.0F;
                }
                this.field4145 = true;
            }
            if (arg0 != 31360) {
                this.method1062(-5, -92, 110, 100, (class696) null, (float[]) null, -31, false);
            }
            ++field4081;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[68] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "ZA", descriptor = "(IFFFFF)V", line = 168)
    public final void method243(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        try {
            ++field3984;
            boolean var7 = this.field4202 != arg0;
            if (var7 || this.field4139 != arg1 || this.field4163 != arg2) {
                this.field4163 = arg2;
                this.field4139 = arg1;
                this.field4202 = arg0;
                if (var7) {
                    this.field4180 = (float) (16711680 & this.field4202) / 1.671168E7F;
                    this.field4196 = (float) (65280 & this.field4202) / 65280.0F;
                    this.field4189 = (float) (this.field4202 & 255) / 255.0F;
                    this.method1091(-83);
                }
                this.field4016.setSunColour(this.field4180, this.field4196, this.field4189, arg1, arg2);
                this.method1065(true);
            }
            if (this.field4225[0] != arg3 || this.field4225[1] != arg4 || this.field4225[2] != arg5) {
                this.field4225[0] = arg3;
                this.field4225[1] = arg4;
                this.field4225[2] = arg5;
                this.field4179[2] = -arg5;
                this.field4179[1] = -arg4;
                this.field4179[0] = -arg3;
                float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
                this.field4185[1] = arg4 * var8;
                this.field4185[2] = arg5 * var8;
                this.field4185[0] = arg3 * var8;
                this.field4169[2] = -this.field4185[2];
                this.field4169[0] = -this.field4185[0];
                this.field4169[1] = -this.field4185[1];
                this.field4016.setSunDirection(this.field4185[0], this.field4185[1], this.field4185[2]);
                this.method1028((byte) -80);
                this.field4175 = (int) (arg5 * 256.0F / arg4);
                this.field4204 = (int) (arg3 * 256.0F / arg4);
            }
            this.method1071(1);
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field4263[19] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "bb", descriptor = "(I)V", line = 219)
    private final void method2203(int arg0) {
        try {
            if (arg0 != 28980) {
                this.method1072((byte) 84);
            }
            ++field4025;
            if (this.field4233 != null) {
                this.field4233.method3297(118);
            }
            this.method1086(87);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[82] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "xa", descriptor = "(F)V", line = 235)
    public final void method166(float arg0) {
        try {
            if (this.field4192 != arg0) {
                this.field4192 = arg0;
                this.field4016.setAmbient(arg0);
                this.method1091(-81);
                this.method1071(1);
            }
            ++field4039;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "e", descriptor = "()Z", line = 250)
    public final boolean method241() {
        try {
            ++field4011;
            return false;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4263[1] + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "h", descriptor = "(I)V", line = 259)
    public final void method270(int arg0) {
        try {
            ++field3966;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[147] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "I", descriptor = "(I)V", line = 267)
    public void method1060(int arg0) {
        try {
            int var2 = 105 % ((arg0 - -77) / 34);
            ++field3971;
            this.method2219(3901);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[27] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "k", descriptor = "(II)V", line = 280)
    public final void method2204(int arg0, int arg1) {
        try {
            if (arg0 != 3) {
                this.field4181 = -57;
            }
            ++field3980;
            if (this.field4238 != arg1) {
                this.field4238 = arg1;
                this.method1072((byte) -117);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[141] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "j", descriptor = "(B)I", line = 304)
    public final int method2205(byte arg0) {
        try {
            ++field4004;
            if (arg0 > -115) {
                this.method237(-49, 25, 84);
            }
            return this.field4181;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[67] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "da", descriptor = "(III[I)V", line = 315)
    public final void method239(int arg0, int arg1, int arg2, int[] arg3) {
        try {
            ++field4114;
            float var5 = this.field4133.method4469((float) arg2, (float) arg0, -2486, (float) arg1);
            int var6;
            int var7;
            if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
                var6 = this.field4160;
                var7 = this.field4191;
            } else {
                var6 = (int) ((float) this.field4199 * this.field4133.method4482(16383, (float) arg2, (float) arg1, (float) arg0) / var5);
                var7 = (int) ((float) this.field4212 * this.field4133.method4492((float) arg1, (float) arg2, 1057, (float) arg0) / var5);
            }
            arg3[2] = (int) var5;
            arg3[1] = (int) ((float) var7 - this.field4161);
            arg3[0] = (int) ((float) var6 - this.field4198);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field4263[135] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4263[4] : field4263[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IZI[II)Lah;", line = 344)
    public final class406 method2206(int arg0, boolean arg1, int arg2, int[] arg3, int arg4) {
        try {
            if (arg0 != 1826) {
                this.field4169 = null;
            }
            ++field3995;
            return this.method1088(0, arg4, arg1, 0, arg3, 3982, arg2);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field4263[39] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4263[4] : field4263[2]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "A", descriptor = "(ILaa;II)V", line = 357)
    public final void method170(int arg0, class514 arg1, int arg2, int arg3) {
        try {
            ++field4026;
            class22 var5 = (class22) arg1;
            class406 var6 = var5.field214;
            this.method2272(9);
            this.method2233((byte) -118, var6);
            this.method2254(1, 112);
            this.method2223(class434.field6809, class434.field6809, (byte) 121);
            this.method2262((byte) -26, class119.field1723, 0);
            this.method2204(3, arg0);
            this.field4131.method4486(6, (float) this.field3947, (float) this.field4015, 0.0F);
            this.method2277(12587);
            this.field4226[0].method4486(6, var6.method3173((float) this.field3947, 32263), var6.method3164((float) this.field4015, false), 1.0F);
            this.field4226[0].method4475((byte) -126, 0.0F, var6.method3173((float) (-arg3), 32263), var6.method3164((float) (-arg2), false));
            this.field4172[0] = class428.field6751;
            this.method2268(-31360);
            this.method2264(2);
            this.method2238(-32023);
            this.method2262((byte) 127, class339.field5532, 0);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field4263[44] + arg0 + ',' + (arg1 != null ? field4263[4] : field4263[2]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "()Lsj;", line = 384)
    public final class486 method271() {
        try {
            ++field4033;
            return this.field4133;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4263[64] + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "m", descriptor = "(Z)V", line = 394)
    public static void method2207(boolean arg0) {
        try {
            field4005 = null;
            if (!arg0) {
                method2207(false);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4263[34] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(B)Leba;", line = 404)
    public final class615 method2208(byte arg0) {
        try {
            ++field4018;
            if (arg0 >= -23) {
                this.method156(-35, 33, -75, -3);
            }
            return this.field4226[this.field4181];
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "(ZI)V", line = 417)
    public final void method2209(boolean arg0, int arg1) {
        try {
            if (arg1 != -32) {
                this.method1080((byte[]) null, -23, -38, (class696) null, (byte) 30, -38);
            }
            ++field4014;
            if (this.field4164 != arg0) {
                this.field4164 = arg0;
                this.method1038(53);
                this.field4197 &= -32;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[76] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "f", descriptor = "(I)Lza;", line = 434)
    public final class437 method228(int arg0) {
        try {
            ++field3962;
            class748 var2 = new class748(arg0);
            this.field3959.method3220(var2, 0);
            return var2;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[146] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "DA", descriptor = "(IIII)V", line = 447)
    public final void method156(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field3983;
            this.field4160 = arg0;
            this.field4212 = arg3;
            this.field4191 = arg1;
            this.field4199 = arg2;
            this.method2231(8);
            this.method2265((byte) 98);
            this.method2222(false);
            this.method2201(true);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4263[171] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(IIIIII)V", line = 462)
    public final void method208(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field4095;
            float var7 = this.method1056((byte) -13);
            this.method2232((byte) -69);
            this.method2204(3, arg4);
            this.method2262((byte) 83, class119.field1723, 0);
            this.method2248((byte) -109, class119.field1723, 0);
            this.method2254(arg5, 110);
            this.field4131.method4486(6, (float) (arg3 + -1), (float) (arg2 + -1), 1.0F);
            this.field4131.method4475((byte) 118, 0.0F, (float) arg1 - var7, (float) arg0 + -var7);
            this.method2277(12587);
            this.method1075(false, (byte) 95);
            this.method2200(class240.field3698, (byte) 113, 4);
            this.method1075(true, (byte) 88);
            this.method2248((byte) -109, class339.field5532, 0);
            this.method2262((byte) -83, class339.field5532, 0);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field4263[101] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I[Lih;)V", line = 486)
    public final void method218(int arg0, class731[] arg1) {
        try {
            for (int var3 = 0; arg0 > var3; ++var3) {
                this.field4174[var3] = arg1[var3];
            }
            ++field3968;
            this.field4227 = arg0;
            if (this.field4176.method5583(13)) {
                this.method1045(69);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4263[152] + arg0 + ',' + (arg1 != null ? field4263[4] : field4263[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "M", descriptor = "()I", line = 504)
    public final int method198() {
        try {
            ++field4019;
            return this.field4261;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4263[125] + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lkc;IIII)Lka;", line = 514)
    public final class499 method192(class141 arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field4088;
            return new class717(this, arg0, arg1, arg3, arg4, arg2);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field4263[10] + (arg0 != null ? field4263[4] : field4263[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "i", descriptor = "(I)V", line = 523)
    public final void method268(int arg0) {
        try {
            ++field4110;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[144] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "e", descriptor = "(II)I", line = 530)
    public final int method151(int arg0, int arg1) {
        try {
            ++field4118;
            return arg1 ^ arg1 & arg0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[86] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "h", descriptor = "()Z", line = 547)
    public final boolean method148() {
        try {
            ++field4023;
            return this.field4224[3].method1226(-117);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4263[120] + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "r", descriptor = "(IIIIIII)I", line = 556)
    public final int method183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            ++field4102;
            int var8 = 0;
            float var9 = (float) arg2 * this.field4133.field8860 + (float) arg0 * this.field4133.field8841 + (float) arg1 * this.field4133.field8822 + this.field4133.field8864;
            float var10 = (float) arg5 * this.field4133.field8860 + (float) arg3 * this.field4133.field8841 + (float) arg4 * this.field4133.field8822 + this.field4133.field8864;
            if ((float) this.field4158 > var9 && (float) this.field4158 > var10) {
                var8 |= 16;
            } else if (var9 > (float) this.field4151 && var10 > (float) this.field4151) {
                var8 |= 32;
            }
            int var11 = (int) (((float) arg2 * this.field4133.field8846 + (float) arg0 * this.field4133.field8870 + (float) arg1 * this.field4133.field8829 + this.field4133.field8842) * (float) this.field4199 / (float) arg6);
            int var12 = (int) (((float) arg5 * this.field4133.field8846 + (float) arg3 * this.field4133.field8870 + (float) arg4 * this.field4133.field8829 + this.field4133.field8842) * (float) this.field4199 / (float) arg6);
            if ((float) var11 < this.field4198 && (float) var12 < this.field4198) {
                var8 |= 1;
            } else if (this.field4208 < (float) var11 && (float) var12 > this.field4208) {
                var8 |= 2;
            }
            int var13 = (int) (((float) arg2 * this.field4133.field8830 + (float) arg0 * this.field4133.field8850 + (float) arg1 * this.field4133.field8838 + this.field4133.field8877) * (float) this.field4212 / (float) arg6);
            int var14 = (int) (((float) arg5 * this.field4133.field8830 + (float) arg3 * this.field4133.field8850 + (float) arg4 * this.field4133.field8838 + this.field4133.field8877) * (float) this.field4212 / (float) arg6);
            if (this.field4161 > (float) var13 && (float) var14 < this.field4161) {
                var8 |= 4;
            } else if ((float) var13 > this.field4213 && this.field4213 < (float) var14) {
                var8 |= 8;
            }
            return var8;
        } catch (RuntimeException var16) {
            throw class590.method4333(var16, field4263[116] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "M", descriptor = "(I)I", line = 604)
    public final int method2210(int arg0) {
        try {
            ++field4121;
            if (arg0 != -32377) {
                this.field4181 = -39;
            }
            return this.field4154;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[29] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "pa", descriptor = "()V", line = 615)
    public final void method181() {
        try {
            this.field4190 = false;
            ++field4065;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4263[117] + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V", line = 624)
    public final void method147(int arg0) {
        try {
            ++field4060;
            if (~arg0 != -2) {
                throw new IllegalArgumentException("");
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[97] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(ZI)V", line = 635)
    public final void method2211(boolean arg0, int arg1) {
        try {
            ++field4103;
            if (arg1 < 101) {
                this.method1032((byte) -108);
            }
            if (!arg0 == this.field4141) {
                this.field4141 = arg0;
                this.method1038(75);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[123] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZIZIIB)V", line = 659)
    private final void method2212(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5) {
        try {
            ++field3997;
            boolean var10 = arg0 & this.method148();
            if (!var10 && (arg1 == 4 || ~arg1 == -9 || arg1 == 9)) {
                arg1 = 2;
                arg4 = ~arg1 != -5 ? 1 : 1 & arg3;
                arg3 = 0;
            }
            if (~arg1 != -1 && arg2) {
                arg1 |= Integer.MIN_VALUE;
            }
            int var7 = 27 / ((-45 - arg5) / 40);
            if (this.field4162 != arg1) {
                if (this.field4162 != 0) {
                    this.field4224[Integer.MAX_VALUE & this.field4162].method1224(true);
                }
                if (~arg1 != -1) {
                    this.field4233 = this.field4224[arg1 & Integer.MAX_VALUE];
                    this.field4233.method1225(arg2, 29145);
                    this.field4233.method1221(6056, arg2);
                    this.field4233.method1219(arg3, 100, arg4);
                } else {
                    this.field4233 = null;
                }
                this.field4173 = arg4;
                this.field4221 = arg3;
                this.field4162 = arg1;
            } else if (~this.field4162 != -1) {
                this.field4224[this.field4162 & Integer.MAX_VALUE].method1221(6056, arg2);
                if (~this.field4221 != ~arg3 || ~this.field4173 != ~arg4) {
                    this.field4224[Integer.MAX_VALUE & this.field4162].method1219(arg3, 100, arg4);
                    this.field4221 = arg3;
                    this.field4173 = arg4;
                }
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field4263[130] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "G", descriptor = "(I)V", line = 713)
    private final void method2213(int arg0) {
        try {
            ++field3989;
            if (arg0 < 92) {
                this.method181();
            }
            if (!this.field4223) {
                float[] var2 = this.field4150;
                float var3 = (float) (-this.field4160 * this.field4158) / (float) this.field4199;
                float var4 = (float) ((-this.field4160 + this.field4015) * this.field4158) / (float) this.field4199;
                float var5 = (float) (this.field4191 * this.field4158) / (float) this.field4212;
                float var6 = (float) ((-this.field3947 + this.field4191) * this.field4158) / (float) this.field4212;
                if (var3 != var4 && var5 != var6) {
                    float var7 = (float) this.field4158 * 2.0F;
                    var2[0] = var7 / (-var3 + var4);
                    var2[6] = 0.0F;
                    var2[2] = 0.0F;
                    var2[1] = 0.0F;
                    var2[15] = 0.0F;
                    var2[3] = 0.0F;
                    var2[11] = -1.0F;
                    var2[10] = this.field4171 = (float) this.field4151 / (float) (this.field4158 - this.field4151);
                    var2[14] = this.field4152 = (float) (this.field4158 * this.field4151) / (float) (this.field4158 - this.field4151);
                    var2[7] = 0.0F;
                    var2[9] = (var5 + var6) / (-var6 + var5);
                    var2[13] = 0.0F;
                    var2[8] = (var3 + var4) / (-var3 + var4);
                    var2[12] = 0.0F;
                    var2[4] = 0.0F;
                    var2[5] = var7 / (var5 - var6);
                } else {
                    var2[15] = 1.0F;
                    var2[5] = 1.0F;
                    var2[8] = 0.0F;
                    var2[14] = 0.0F;
                    var2[3] = 0.0F;
                    var2[0] = 1.0F;
                    var2[2] = 0.0F;
                    var2[13] = 0.0F;
                    var2[10] = 1.0F;
                    var2[4] = 0.0F;
                    var2[11] = 0.0F;
                    var2[1] = 0.0F;
                    var2[9] = 0.0F;
                    var2[12] = 0.0F;
                    var2[7] = 0.0F;
                    var2[6] = 0.0F;
                }
                this.method2244(false);
                this.field4223 = true;
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field4263[164] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "p", descriptor = "(B)V", line = 783)
    private final void method2214(byte arg0) {
        try {
            ++field4052;
            this.field4242 = this.method1030(true, false);
            this.field4242.method3933((byte) -43, 24, 12);
            if (arg0 != -9) {
                this.method2237((byte) 68);
            }
            this.field4245 = this.method1051(14, new class482[] { new class482(class771.field11297) });
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[35] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 798)
    public final void method232(Canvas arg0, int arg1, int arg2) {
        try {
            ++field4050;
            Object var4 = null;
            if (arg0 != null && this.field3973 != arg0) {
                if (this.field4068.containsKey(arg0)) {
                    var4 = this.field4068.get(arg0);
                }
            } else {
                var4 = this.field3974;
            }
            if (var4 == null) {
                throw new RuntimeException();
            } else {
                this.method1079(4, arg0, var4);
                if (this.field3967 == arg0) {
                    this.method2267((byte) -127);
                }
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4263[6] + (arg0 != null ? field4263[4] : field4263[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "J", descriptor = "(I)V", line = 826)
    public final void method2215(int arg0) {
        try {
            this.field4193 = new class380[this.field4200];
            this.field4172 = new class369[this.field4200];
            this.field4206 = new class380[this.field4200];
            this.field4226 = new class615[this.field4200];
            ++field3977;
            this.field4220 = new class399[this.field4200];
            for (int var2 = 0; var2 < this.field4200; ++var2) {
                this.field4206[var2] = class734.field10762;
                this.field4193[var2] = class734.field10762;
                this.field4172[var2] = class452.field6989;
                this.field4226[var2] = new class615();
            }
            this.field4174 = new class731[this.field4178 + -2];
            this.field4149 = this.method1048(1, class544.field8004, 1, 27, class313.field5120);
            this.method157(new class748(262144));
            this.field4239 = this.method1051(14, new class482[] { new class482(new class771[] { class771.field11297, class771.field11304 }) });
            this.field4251 = this.method1051(arg0 ^ 14, new class482[] { new class482(new class771[] { class771.field11297, class771.field11300 }) });
            this.field4243 = this.method1051(arg0 + 14, new class482[] { new class482(class771.field11297), new class482(class771.field11300), new class482(class771.field11304), new class482(class771.field11298) });
            this.field4253 = this.method1051(14, new class482[] { new class482(class771.field11297), new class482(class771.field11300), new class482(class771.field11304) });
            this.field4259 = new class717(this, 0, 0, false, false);
            this.field4257 = new class717(this, 0, 0, true, true);
            this.field4252 = new class717(this, 0, 0, false, false);
            this.field4244 = new class717(this, 0, 0, true, true);
            this.field4260 = new class717(this, 0, 0, false, false);
            this.field4258 = new class717(this, 0, 0, true, true);
            this.field4246 = new class717(this, 0, 0, false, false);
            this.field4248 = new class717(this, 0, 0, true, true);
            this.field4255 = new class717(this, 0, arg0, false, false);
            this.field4254 = new class717(this, 0, 0, true, true);
            this.field4144 = new class53(this);
            this.field4250 = this.method1077(-7930, true);
            this.method2243(true);
            this.field4002 = new class352(this);
            this.field4224[1] = this.method1084(-87, 1);
            this.field4224[2] = this.method1084(class251.method2133(arg0, -25), 2);
            this.field4224[4] = this.method1084(class251.method2133(arg0, -106), 4);
            this.field4224[5] = this.method1084(arg0 + -61, 5);
            this.field4224[6] = this.method1084(-110, 6);
            this.field4224[7] = this.method1084(-91, 7);
            this.field4224[3] = this.method1084(-122, 3);
            this.field4224[8] = this.method1084(-62, 8);
            this.field4224[9] = this.method1084(-79, 9);
            if (!this.field4224[2].method1226(-124)) {
                this.field4224[2] = this.method1084(-26, 0);
            }
            if (!this.field4224[4].method1226(-115)) {
                this.field4224[4] = this.field4224[2];
            }
            if (!this.field4224[8].method1226(-120)) {
                this.field4224[8] = this.field4224[4];
            }
            if (!this.field4224[9].method1226(-123)) {
                this.field4224[9] = this.field4224[8];
            }
            this.method1060(-43);
            this.method227();
            this.method216();
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[90] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZIB)Ljaclib/memory/heap/NativeHeapBuffer;", line = 901)
    public final NativeHeapBuffer method2216(boolean arg0, int arg1, byte arg2) {
        try {
            if (arg2 != -85) {
                this.field4212 = 126;
            }
            ++field4040;
            return this.field4091.method5095(arg1, arg0);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4263[31] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "v", descriptor = "(I)V", line = 913)
    private final void method2217(int arg0) {
        try {
            this.field4235 = (float) this.field4151;
            ++field4048;
            if (arg0 > -99) {
                this.field4227 = -128;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[128] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "q", descriptor = "()Z", line = 927)
    public final boolean method160() {
        try {
            ++field3986;
            return true;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4263[151] + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "B", descriptor = "(I)V", line = 940)
    public final void method2218(int arg0) {
        try {
            if (this.field4197 != 4) {
                this.method2270(-9691);
                this.method2209(false, -32);
                this.method2241((byte) -30, false);
                this.method2250(false, (byte) -78);
                this.method2230((byte) 118, false);
                this.method2263(false, -2, (byte) 93, false);
                this.method2254(1, 108);
                this.method2258(0, (byte) -123);
                this.field4197 = 4;
            }
            ++field4003;
            if (arg0 > -81) {
                this.method219();
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[32] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "P", descriptor = "(I)V", line = 964)
    private final void method2219(int arg0) {
        try {
            if (arg0 != 3901) {
                this.method220((int[]) null);
            }
            ++field4075;
            this.method1091(-66);
            this.method1065(true);
            this.method1087((byte) -92);
            this.method1045(65);
            this.method1028((byte) -97);
            this.method1071(1);
            this.method1059((byte) -128);
            this.method1032((byte) 127);
            this.method1081(-123);
            this.method1038(59);
            this.method1086(-45);
            this.method1074(true);
            this.method1041((byte) -18);
            this.method1040(0);
            for (int var2 = this.field4200 + -1; var2 >= 0; --var2) {
                this.method2245(79, var2);
                this.method1027((byte) 29);
                this.method1057(2);
                this.method2238(-32023);
            }
            this.method1072((byte) -117);
            this.method1029(11321);
            this.method1092(11);
            this.method1053((byte) -78);
            this.method1069(262144);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[21] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "g", descriptor = "(B)V", line = 1007)
    public final void method2220(byte arg0) {
        try {
            if (~this.field4197 != -9) {
                this.method2257((byte) -81);
                this.method2209(true, -32);
                this.method2250(true, (byte) -77);
                this.method2230((byte) 80, true);
                this.method2254(1, 100);
                this.field4197 = 8;
            }
            ++field4084;
            int var2 = -92 % ((arg0 - 11) / 35);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[131] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 1028)
    public final class293 method204(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        try {
            ++field3987;
            return new class721(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field4263[75] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4263[4] : field4263[2]) + ',' + (arg3 != null ? field4263[4] : field4263[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "X", descriptor = "(I)V", line = 1042)
    public final void method149(int arg0) {
        try {
            this.field4210 = 0;
            ++field4012;
            while (arg0 > 1) {
                arg0 >>= 1;
                ++this.field4210;
            }
            this.field4159 = 1 << this.field4210;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[127] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "P", descriptor = "(IIIII)V", line = 1058)
    public final void method262(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            this.method267(arg0, arg1, arg0, arg1 - -arg2, arg3, arg4);
            ++field4072;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field4263[169] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "p", descriptor = "(I)V", line = 1068)
    public final void method2221(int arg0) {
        try {
            ++field3972;
            this.method2222(false);
            if (arg0 != -15031) {
                this.field4161 = 0.5617931F;
            }
            this.method2266(-21952);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[108] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "i", descriptor = "(Z)V", line = 1082)
    public final void method2222(boolean arg0) {
        try {
            ++field4069;
            if (class795.field11617 != this.field4176) {
                class776 var2 = this.field4176;
                this.field4176 = class795.field11617;
                if (var2.method5583(13)) {
                    this.method2237((byte) 65);
                }
                this.field4167 = this.field4153;
                this.field4197 &= -32;
            }
            if (arg0) {
                this.field4148 = null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[81] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIIIII)V", line = 1106)
    public final void method236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            ++field4032;
            float var8 = (float) arg2 - (float) arg0;
            float var9 = (float) (-arg1) + (float) arg3;
            float var10 = 0.0F;
            float var11 = 1.0F;
            if (var8 != 0.0F || var9 != 0.0F) {
                var11 = (float) Math.sqrt((double) (var8 * var8 + var9 * var9));
                var10 = (float) Math.atan2((double) var9, (double) var8);
            }
            this.method2232((byte) -69);
            this.method2204(3, arg4);
            this.method2262((byte) -90, class119.field1723, 0);
            this.method2248((byte) -109, class119.field1723, 0);
            this.method2254(arg6, 86);
            this.field4131.method4486(6, (float) arg5, var11, 1.0F);
            this.field4131.method2480(0, -arg5 / 2, 0);
            this.field4131.method2464(16383 & (int) ((double) var10 * 2607.5945876176133D));
            this.field4131.method2480(arg0, arg1, 0);
            this.method2277(12587);
            this.method1075(false, (byte) 124);
            this.method2264(2);
            this.method1075(true, (byte) 118);
            this.method2248((byte) -109, class339.field5532, 0);
            this.method2262((byte) -110, class339.field5532, 0);
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field4263[55] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lsj;)V", line = 1143)
    public final void method254(class486 arg0) {
        try {
            ++field4007;
            this.field4133 = (class615) arg0;
            this.field4135.method2461(this.field4133);
            this.field4135.method4478(-121);
            this.field4136.method4484(5, this.field4135);
            this.field4134.method4484(5, this.field4133);
            if (this.field4176.method5583(13)) {
                this.method2237((byte) -1);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[173] + (arg0 != null ? field4263[4] : field4263[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "d", descriptor = "()V", line = 1162)
    public final void method194() {
        try {
            if (this.field4215 != null) {
                this.field4215.method467(42);
            }
            ++field4061;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4263[63] + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "HA", descriptor = "(IIII[I)V", line = 1175)
    public final void method180(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        try {
            ++field4057;
            float var6 = this.field4133.method4469((float) arg2, (float) arg0, -2486, (float) arg1);
            if (!(var6 < (float) this.field4158) && !(var6 > (float) this.field4151)) {
                int var7 = (int) ((float) this.field4199 * this.field4133.method4482(16383, (float) arg2, (float) arg1, (float) arg0) / (float) arg3);
                int var8 = (int) ((float) this.field4212 * this.field4133.method4492((float) arg1, (float) arg2, 1057, (float) arg0) / (float) arg3);
                arg4[2] = (int) var6;
                arg4[0] = (int) ((float) var7 + -this.field4198);
                arg4[1] = (int) ((float) var8 + -this.field4161);
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field4263[46] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4263[4] : field4263[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "y", descriptor = "()I", line = 1202)
    public final int method177() {
        try {
            ++field4111;
            return this.field4178 + -2;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4263[38] + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Leh;Leh;B)V", line = 1215)
    public final void method2223(class380 arg0, class380 arg1, byte arg2) {
        try {
            ++field3978;
            if (arg2 < 99) {
                this.method1043(50, -67, (byte[]) null, 24, false, (class696) null, 56, 38);
            }
            boolean var4 = false;
            if (this.field4193[this.field4181] != arg1) {
                this.field4193[this.field4181] = arg1;
                this.method1027((byte) 29);
                var4 = true;
            }
            if (this.field4206[this.field4181] != arg0) {
                this.field4206[this.field4181] = arg0;
                this.method1057(2);
                var4 = true;
            }
            if (var4) {
                this.field4197 &= -30;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4263[139] + (arg0 != null ? field4263[4] : field4263[2]) + ',' + (arg1 != null ? field4263[4] : field4263[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "Q", descriptor = "(IIIIII[BII)V", line = 1247)
    public final void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        try {
            ++field4080;
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field4263[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field4263[4] : field4263[2]) + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "r", descriptor = "(B)V", line = 1259)
    private final void method2224(byte arg0) {
        try {
            ++field3963;
            int var2 = -59 % ((arg0 - -13) / 34);
            this.field4249 = this.method1030(false, false);
            this.field4249.method3933((byte) -58, 3096, 12);
            for (int var3 = 0; var3 < 4; ++var3) {
                Buffer var4 = this.field4249.method3929(true, -31222);
                if (var4 != null) {
                    Stream var5 = this.method2227(var4, (byte) 104);
                    var5.method5109(0.0F);
                    var5.method5109(0.0F);
                    var5.method5109(0.0F);
                    for (int var6 = 0; var6 <= 256; ++var6) {
                        double var7 = (double) (var6 * 2) * 3.141592653589793D / 256.0D;
                        float var9 = (float) Math.cos(var7);
                        float var10 = (float) Math.sin(var7);
                        if (!Stream.method5108()) {
                            var5.method5106(var10);
                            var5.method5106(var9);
                            var5.method5106(0.0F);
                        } else {
                            var5.method5109(var10);
                            var5.method5109(var9);
                            var5.method5109(0.0F);
                        }
                    }
                    var5.method5097();
                    if (this.field4249.method3932((byte) -114)) {
                        break;
                    }
                }
            }
            this.field4247 = this.method1051(14, new class482[] { new class482(class771.field11297) });
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field4263[62] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(ZZ)V", line = 1325)
    public final void method2225(boolean arg0, boolean arg1) {
        try {
            ++field4022;
            if (this.field4165 == !arg0) {
                this.field4165 = arg0;
                this.method1059((byte) -19);
            }
            if (arg1) {
                this.field4091 = null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[85] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "(I)V", line = 1345)
    public final void method234(int arg0) {
        try {
            ++field4116;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[115] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "e", descriptor = "(B)V", line = 1353)
    private final void method2226(byte arg0) {
        try {
            this.method1036(this.field4242, 0, 2);
            ++field4130;
            if (arg0 != -48) {
                this.field4219 = null;
            }
            this.method1042((byte) 123, this.field4245);
            this.method1050(class451.field6976, 0, 1, 7645);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[163] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Ljaclib/memory/Buffer;B)Ljaclib/memory/Stream;", line = 1368)
    public final Stream method2227(Buffer arg0, byte arg1) {
        try {
            this.field4148.method5102(arg0);
            ++field4113;
            if (arg1 < 55) {
                this.method193();
            }
            return this.field4148;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[138] + (arg0 != null ? field4263[4] : field4263[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "E", descriptor = "(I)I", line = 1380)
    public final int method2228(int arg0) {
        try {
            if (arg0 != 32647) {
                this.field4193 = null;
            }
            ++field4115;
            return this.field4184;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[132] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "ra", descriptor = "(IIII)V", line = 1402)
    public final void method259(int arg0, int arg1, int arg2, int arg3) {
        try {
            this.field4236 = arg0;
            this.field4184 = arg1;
            ++field4008;
            this.field4182 = arg2;
            this.field4190 = true;
            this.field4154 = arg3;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4263[25] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "k", descriptor = "(B)V", line = 1415)
    private final void method2229(byte arg0) {
        try {
            if (class481.field7315 == this.field4176) {
                float var2 = this.method1056((byte) -13);
                this.field4131.method4475((byte) -126, 0.0F, var2, var2);
            }
            ++field3950;
            this.field4211 = false;
            if (arg0 >= -23) {
                this.method2206(-23, false, -106, (int[]) null, 72);
            }
            this.method1053((byte) -78);
            if (this.field4233 != null) {
                this.field4233.method3392(-142);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[172] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(BZ)V", line = 1438)
    public final void method2230(byte arg0, boolean arg1) {
        try {
            if (arg0 <= 60) {
                this.field4208 = 0.022436874F;
            }
            if (this.field4218 != arg1) {
                this.field4218 = arg1;
                this.method1081(-90);
                this.field4197 &= -32;
            }
            ++field4076;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[129] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "n", descriptor = "(I)V", line = 1459)
    private final void method2231(int arg0) {
        try {
            this.field4156 = false;
            if (arg0 != 8) {
                this.method1032((byte) 43);
            }
            ++field4067;
            this.method2271(arg0 ^ 96);
            if (class666.field9478 == this.field4176) {
                this.method2266(-21952);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[56] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "n", descriptor = "()Z", line = 1474)
    public final boolean method176() {
        try {
            ++field4000;
            return this.field4207;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4263[66] + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "aa", descriptor = "(IIIIII)V", line = 1489)
    public final void method242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field4090;
            this.method2232((byte) -69);
            this.method2204(3, arg4);
            this.method2262((byte) -35, class119.field1723, 0);
            this.method2248((byte) -109, class119.field1723, 0);
            this.method2254(arg5, 92);
            this.field4131.method4486(6, (float) arg3, (float) arg2, 1.0F);
            this.field4131.method2480(arg0, arg1, 0);
            this.method2277(12587);
            this.method1075(false, (byte) 114);
            this.method2264(2);
            this.method1075(true, (byte) 108);
            this.method2248((byte) -109, class339.field5532, 0);
            this.method2262((byte) -94, class339.field5532, 0);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field4263[107] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "(B)V", line = 1509)
    private final void method2232(byte arg0) {
        try {
            if (arg0 == -69) {
                ++field4129;
                if (~this.field4197 != -2) {
                    this.method2270(arg0 ^ 9630);
                    this.method2209(false, -32);
                    this.method2241((byte) -30, false);
                    this.method2250(false, (byte) -116);
                    this.method2230((byte) 63, false);
                    this.method2263(false, -2, (byte) 93, false);
                    this.method2258(1, (byte) -112);
                    this.method2233((byte) -104, this.field4149);
                    this.field4197 = 1;
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[84] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(BLln;)V", line = 1532)
    public final void method2233(byte arg0, class399 arg1) {
        try {
            if (this.field4220[this.field4181] != arg1) {
                this.field4220[this.field4181] = arg1;
                if (arg1 != null) {
                    arg1.method1168(16541);
                } else {
                    this.method1039((byte) -106);
                }
                this.field4197 &= -2;
            }
            if (arg0 <= -19) {
                ++field4079;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[40] + arg0 + ',' + (arg1 != null ? field4263[4] : field4263[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "la", descriptor = "()V", line = 1558)
    public final void method227() {
        try {
            this.field4188 = 0;
            this.field4217 = 0;
            ++field4020;
            this.field4201 = this.field4015;
            this.field4203 = this.field3947;
            if (this.field4262) {
                this.field4262 = false;
                this.method1037(false);
            }
            this.method2201(true);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4263[47] + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIZ)Lhk;", line = 1576)
    public final class107 method179(int arg0, int arg1, boolean arg2) {
        try {
            ++field4128;
            return new class478(this, arg0, arg1, arg2);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4263[102] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "E", descriptor = "()I", line = 1587)
    public final int method187() {
        try {
            ++field3976;
            return this.field4127 + this.field4123 + this.field4132;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4263[98] + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZI)V", line = 1598)
    public final void method2234(boolean arg0, int arg1) {
        try {
            if (!arg0 == this.field4147) {
                this.field4147 = arg0;
                this.method1087((byte) -81);
            }
            ++field3993;
            if (arg1 != 16381) {
                this.field4244 = null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[61] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "JA", descriptor = "(IIIIII)I", line = 1615)
    public final int method252(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field3979;
            int var7 = 0;
            float var8 = (float) arg2 * this.field4133.field8860 + (float) arg0 * this.field4133.field8841 + (float) arg1 * this.field4133.field8822 + this.field4133.field8864;
            if (var8 < 1.0F) {
                var8 = 1.0F;
            }
            float var9 = (float) arg5 * this.field4133.field8860 + (float) arg3 * this.field4133.field8841 + (float) arg4 * this.field4133.field8822 + this.field4133.field8864;
            if (var9 < 1.0F) {
                var9 = 1.0F;
            }
            if (var8 < (float) this.field4158 && var9 < (float) this.field4158) {
                var7 |= 16;
            } else if (var8 > (float) this.field4151 && var9 > (float) this.field4151) {
                var7 |= 32;
            }
            int var10 = (int) (((float) arg2 * this.field4133.field8846 + (float) arg0 * this.field4133.field8870 + (float) arg1 * this.field4133.field8829 + this.field4133.field8842) * (float) this.field4199 / var8);
            int var11 = (int) (((float) arg5 * this.field4133.field8846 + (float) arg3 * this.field4133.field8870 + (float) arg4 * this.field4133.field8829 + this.field4133.field8842) * (float) this.field4199 / var9);
            if (this.field4198 > (float) var10 && (float) var11 < this.field4198) {
                var7 |= 1;
            } else if (this.field4208 < (float) var10 && (float) var11 > this.field4208) {
                var7 |= 2;
            }
            int var12 = (int) (((float) arg2 * this.field4133.field8830 + (float) arg0 * this.field4133.field8850 + (float) arg1 * this.field4133.field8838 + this.field4133.field8877) * (float) this.field4212 / var8);
            int var13 = (int) (((float) arg5 * this.field4133.field8830 + (float) arg3 * this.field4133.field8850 + (float) arg4 * this.field4133.field8838 + this.field4133.field8877) * (float) this.field4212 / var9);
            if (this.field4161 > (float) var12 && (float) var13 < this.field4161) {
                var7 |= 4;
            } else if ((float) var12 > this.field4213 && (float) var13 > this.field4213) {
                var7 |= 8;
            }
            return var7;
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field4263[122] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "F", descriptor = "(I)V", line = 1667)
    private final void method2235(int arg0) {
        try {
            if (arg0 < 88) {
                this.field4002 = null;
            }
            ++field4062;
            if (class666.field9478 != this.field4176) {
                class776 var2 = this.field4176;
                this.field4176 = class666.field9478;
                if (!var2.method5583(13)) {
                    this.method2237((byte) 44);
                }
                this.method2271(77);
                this.field4167 = this.field4222;
                this.method2266(-21952);
                this.field4197 &= -8;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[92] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 1692)
    public final void method231(Canvas arg0, int arg1, int arg2) {
        try {
            ++field4028;
            if (this.field3973 == arg0) {
                throw new RuntimeException();
            } else if (!this.field4068.containsKey(arg0)) {
                if (!arg0.isShowing()) {
                    throw new RuntimeException();
                } else {
                    try {
                        Class var4 = Class.forName(field4263[24]);
                        Method var5 = var4.getMethod(field4263[23], Boolean.TYPE);
                        var5.invoke(arg0, Boolean.TRUE);
                    } catch (Exception var8) {
                    }
                    Object var6 = this.method1031((byte) -97, arg0);
                    if (var6 == null) {
                        throw new RuntimeException();
                    } else {
                        this.field4068.put(arg0, var6);
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field4263[22] + (arg0 != null ? field4263[4] : field4263[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "g", descriptor = "(Z)Leba;", line = 1729)
    public final class615 method2236(boolean arg0) {
        try {
            if (arg0) {
                this.field4150 = null;
            }
            ++field4073;
            if (!this.field4211) {
                this.field4137.method4496(this.field4135, this.field4131);
                this.field4211 = true;
            }
            return this.field4137;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[79] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lza;)V", line = 1749)
    public final void method157(class437 arg0) {
        try {
            ++field3954;
            this.field4091 = ((class748) arg0).field11035;
            this.field4094 = this.field4091.method5095(32768, false);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[3] + (arg0 != null ? field4263[4] : field4263[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "(Z)V", line = 1761)
    public final void method246(boolean arg0) {
        try {
            ++field4086;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[158] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "x", descriptor = "(B)V", line = 1768)
    private final void method2237(byte arg0) {
        try {
            this.field4211 = false;
            ++field4064;
            if (this.field4233 != null) {
                this.field4233.method3394((byte) 117);
            }
            this.method1069(262144);
            int var2 = -39 / ((-63 - arg0) / 54);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[104] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "k", descriptor = "(I)V", line = 1783)
    public final void method2238(int arg0) {
        try {
            ++field4098;
            if (this.field4172[this.field4181] != class452.field6989) {
                this.field4172[this.field4181] = class452.field6989;
                this.field4226[this.field4181].method2471();
                this.method2268(-31360);
            }
            if (arg0 != -32023) {
                this.method2239(94);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[118] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "U", descriptor = "(I)V", line = 1800)
    public void method1045(int arg0) {
        try {
            this.field4143 = this.field4227;
            if (arg0 <= 50) {
                this.field4235 = -0.4849585F;
            }
            ++field4041;
            this.field4227 = 0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[49] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "()Z", line = 1813)
    public final boolean method152() {
        try {
            ++field3961;
            return true;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4263[121] + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIIIF)Lih;", line = 1821)
    public final class731 method195(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        try {
            ++field4109;
            return new class161(arg0, arg1, arg2, arg3, arg4, arg5);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field4263[60] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "C", descriptor = "(Z)V", line = 1829)
    public final void method265(boolean arg0) {
        try {
            this.field4231 = arg0;
            ++field4030;
            this.method1081(-87);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[99] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "XA", descriptor = "()I", line = 1841)
    public final int method193() {
        try {
            ++field4056;
            return this.field4151;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4263[145] + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "q", descriptor = "(I)V", line = 1852)
    public final void method2239(int arg0) {
        try {
            this.field4131.method2471();
            ++field4055;
            if (arg0 == -19527) {
                this.field4124 = true;
                this.method2229((byte) -97);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[78] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "U", descriptor = "(IIIII)V", line = 1868)
    public final void method250(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            this.method267(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
            ++field3998;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field4263[58] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "Y", descriptor = "(I)V", line = 1876)
    private final void method2240(int arg0) {
        try {
            if (arg0 != 1) {
                this.method2229((byte) 86);
            }
            ++field3955;
            this.field4145 = false;
            if (class481.field7315 == this.field4176) {
                this.method2202(arg0 + 31359);
                this.method2266(-21952);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[119] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(BZ)V", line = 1894)
    public final void method2241(byte arg0, boolean arg1) {
        try {
            if (arg0 != -30) {
                this.field4224 = null;
            }
            ++field4117;
            if (arg1 == !this.field4146) {
                this.field4146 = arg1;
                this.method1087((byte) -66);
                this.field4197 &= -8;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[110] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "i", descriptor = "(B)V", line = 1912)
    private final void method2242(byte arg0) {
        try {
            ++field4096;
            this.field4241 = this.method1030(false, false);
            this.field4241.method3933((byte) -51, 140, 28);
            if (arg0 != 67) {
                this.method220((int[]) null);
            }
            for (int var2 = 0; var2 < 4; ++var2) {
                Buffer var3 = this.field4241.method3929(true, -31222);
                if (var3 != null) {
                    Stream var4 = this.method2227(var3, (byte) 94);
                    if (Stream.method5108()) {
                        var4.method5109(0.0F);
                        var4.method5109(0.0F);
                        var4.method5109(0.0F);
                        var4.method5109(0.0F);
                        var4.method5109(0.0F);
                        var4.method5109(0.0F);
                        var4.method5109(0.0F);
                        var4.method5109(0.0F);
                        var4.method5109(1.0F);
                        var4.method5109(0.0F);
                        var4.method5109(0.0F);
                        var4.method5109(1.0F);
                        var4.method5109(0.0F);
                        var4.method5109(1.0F);
                        var4.method5109(1.0F);
                        var4.method5109(1.0F);
                        var4.method5109(0.0F);
                        var4.method5109(1.0F);
                        var4.method5109(1.0F);
                        var4.method5109(1.0F);
                        var4.method5109(1.0F);
                        var4.method5109(1.0F);
                        var4.method5109(0.0F);
                        var4.method5109(0.0F);
                        var4.method5109(1.0F);
                        var4.method5109(0.0F);
                        var4.method5109(1.0F);
                        var4.method5109(0.0F);
                        var4.method5109(0.0F);
                        var4.method5109(0.0F);
                        var4.method5109(0.0F);
                        var4.method5109(0.0F);
                        var4.method5109(0.0F);
                        var4.method5109(0.0F);
                        var4.method5109(0.0F);
                    } else {
                        var4.method5106(0.0F);
                        var4.method5106(0.0F);
                        var4.method5106(0.0F);
                        var4.method5106(0.0F);
                        var4.method5106(0.0F);
                        var4.method5106(0.0F);
                        var4.method5106(0.0F);
                        var4.method5106(0.0F);
                        var4.method5106(1.0F);
                        var4.method5106(0.0F);
                        var4.method5106(0.0F);
                        var4.method5106(1.0F);
                        var4.method5106(0.0F);
                        var4.method5106(1.0F);
                        var4.method5106(1.0F);
                        var4.method5106(1.0F);
                        var4.method5106(0.0F);
                        var4.method5106(1.0F);
                        var4.method5106(1.0F);
                        var4.method5106(1.0F);
                        var4.method5106(1.0F);
                        var4.method5106(1.0F);
                        var4.method5106(0.0F);
                        var4.method5106(0.0F);
                        var4.method5106(1.0F);
                        var4.method5106(0.0F);
                        var4.method5106(1.0F);
                        var4.method5106(0.0F);
                        var4.method5106(0.0F);
                        var4.method5106(0.0F);
                        var4.method5106(0.0F);
                        var4.method5106(0.0F);
                        var4.method5106(0.0F);
                        var4.method5106(0.0F);
                        var4.method5106(0.0F);
                    }
                    var4.method5097();
                    if (this.field4241.method3932((byte) -114)) {
                        break;
                    }
                }
            }
            this.field4240 = this.method1051(14, new class482[] { new class482(new class771[] { class771.field11297, class771.field11304, class771.field11304 }) });
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4263[111] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "T", descriptor = "(IIII)V", line = 2028)
    public final void method162(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field4059;
            boolean var5 = false;
            if (~arg0 < ~this.field4217) {
                this.field4217 = arg0;
                var5 = true;
            }
            if (arg2 < this.field4201) {
                var5 = true;
                this.field4201 = arg2;
            }
            if (arg1 > this.field4188) {
                this.field4188 = arg1;
                var5 = true;
            }
            if (~this.field4203 < ~arg3) {
                this.field4203 = arg3;
                var5 = true;
            }
            if (var5) {
                if (!this.field4262) {
                    this.field4262 = true;
                    this.method1037(false);
                }
                this.method1052(false);
                this.method2201(true);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field4263[105] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "Y", descriptor = "()[I", line = 2077)
    public final int[] method212() {
        try {
            ++field4046;
            return new int[] { this.field4160, this.field4191, this.field4199, this.field4212 };
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4263[91] + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIIIILaa;II)V", line = 2087)
    public final void method205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8) {
        try {
            ++field4010;
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field4263[42] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field4263[4] : field4263[2]) + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "f", descriptor = "(Z)V", line = 2094)
    public final void method2243(boolean arg0) {
        try {
            ++field3944;
            Hashtable var2 = new Hashtable();
            if (this.field4068 != null && !this.field4068.isEmpty()) {
                Enumeration var3 = this.field4068.keys();
                while (var3.hasMoreElements()) {
                    Canvas var4 = (Canvas) var3.nextElement();
                    var2.put(var4, this.method1031((byte) -97, var4));
                }
            }
            this.field4068 = var2;
            if (arg0) {
                this.method2242((byte) 67);
                this.method2214((byte) -9);
                this.method2224((byte) 44);
                this.field4144.method545((byte) -62, this);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4263[33] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "l", descriptor = "(Z)V", line = 2128)
    private final void method2244(boolean arg0) {
        try {
            if (arg0) {
                this.field4244 = null;
            }
            this.field4150[10] = this.field4171;
            ++field4045;
            this.field4150[14] = this.field4152;
            this.field4157 = (this.field4150[14] - (float) this.field4151) / this.field4150[10];
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[20] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "i", descriptor = "(II)V", line = 2146)
    public final void method2245(int arg0, int arg1) {
        try {
            ++field4035;
            if (arg0 <= 42) {
                this.method1059((byte) 40);
            }
            if (this.field4181 != arg1) {
                this.field4181 = arg1;
                this.method1082(1);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[77] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lsn;)V", line = 2165)
    public final void method191(class659 arg0) {
        try {
            this.field4144.method553(this, -1, true, arg0);
            ++field3965;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[161] + (arg0 != null ? field4263[4] : field4263[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "([BILua;IIZ)Lah;", line = 2175)
    public final class406 method2246(byte[] arg0, int arg1, class696 arg2, int arg3, int arg4, boolean arg5) {
        try {
            ++field4112;
            return arg4 > -68 ? null : this.method1043(0, arg1, arg0, 0, arg5, arg2, -27137, arg3);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field4263[136] + (arg0 != null ? field4263[4] : field4263[2]) + ',' + arg1 + ',' + (arg2 != null ? field4263[4] : field4263[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lkaa;[Luh;Z)Lda;", line = 2186)
    public final class64 method184(class49 arg0, class174[] arg1, boolean arg2) {
        try {
            ++field3949;
            return new class565(this, arg0, arg1, arg2);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4263[103] + (arg0 != null ? field4263[4] : field4263[2]) + ',' + (arg1 != null ? field4263[4] : field4263[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "T", descriptor = "(I)Leba;", line = 2196)
    public final class615 method2247(int arg0) {
        try {
            if (arg0 != 10717) {
                this.method2236(false);
            }
            ++field4100;
            return this.field4136;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[26] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(BLega;I)V", line = 2209)
    public final void method2248(byte arg0, class742 arg1, int arg2) {
        try {
            this.method1046(arg2, false, arg1, (byte) 65);
            if (arg0 != -109) {
                this.method2205((byte) -31);
            }
            ++field3945;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4263[50] + arg0 + ',' + (arg1 != null ? field4263[4] : field4263[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "za", descriptor = "(IIIII)V", line = 2222)
    public final void method174(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field4126;
            this.method2232((byte) -69);
            this.method2204(3, arg3);
            this.method2262((byte) -78, class119.field1723, 0);
            this.method2248((byte) -109, class119.field1723, 0);
            this.method2254(arg4, 83);
            this.field4131.method4486(6, (float) arg2, (float) arg2, 1.0F);
            this.field4131.method2480(arg0, arg1, 0);
            this.method2277(12587);
            this.method1075(false, (byte) 92);
            this.method1036(this.field4249, 0, 2);
            this.method1042((byte) 123, this.field4247);
            this.method1050(class376.field6098, 0, 256, 7645);
            this.method1075(true, (byte) 108);
            this.method2248((byte) -109, class339.field5532, 0);
            this.method2262((byte) -69, class339.field5532, 0);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field4263[134] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "f", descriptor = "()Z", line = 2244)
    public final boolean method219() {
        try {
            ++field4031;
            return true;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4263[41] + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "l", descriptor = "(I)I", line = 2257)
    public final int method2249(int arg0) {
        try {
            ++field3994;
            if (arg0 != 0) {
                this.field4154 = -74;
            }
            return this.field4236;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[93] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZB)V", line = 2274)
    public final void method2250(boolean arg0, byte arg1) {
        try {
            if (arg1 >= -25) {
                this.field4200 = 36;
            }
            if (!this.field4166 != !arg0) {
                this.field4166 = arg0;
                this.method1032((byte) 122);
                this.field4197 &= -32;
            }
            ++field3951;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[126] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "L", descriptor = "(III)V", line = 2293)
    public final void method237(int arg0, int arg1, int arg2) {
        try {
            if (~this.field4170 != ~arg0 || ~this.field4205 != ~arg1 || ~this.field4232 != ~arg2) {
                this.field4232 = arg2;
                this.field4170 = arg0;
                this.field4205 = arg1;
                this.method2203(28980);
                this.method1038(11);
            }
            ++field4104;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4263[157] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "e", descriptor = "(I)V", line = 2314)
    public final void method150(int arg0) {
        try {
            ++field3975;
            if (~arg0 <= -129 && ~arg0 >= -1025) {
                if (this.field4215 != null) {
                    this.field4215.method467(60);
                }
                this.field4168 = arg0;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[45] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIIZ)Lhk;", line = 2328)
    public final class107 method211(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        try {
            ++field4001;
            class478 var6 = new class478(this, arg2, arg3, arg4);
            var6.method8(0, 0, arg2, arg3, arg0, arg1);
            return var6;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field4263[114] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "j", descriptor = "()Lsj;", line = 2340)
    public final class486 method251() {
        try {
            ++field4089;
            return this.field4256;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4263[88] + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 2349)
    public final void method210(Canvas arg0) {
        try {
            ++field3982;
            this.field3974 = null;
            this.field3967 = null;
            if (arg0 != null && this.field3973 != arg0) {
                if (this.field4068.containsKey(arg0)) {
                    this.field3974 = this.field4068.get(arg0);
                    this.field3967 = arg0;
                }
            } else {
                this.field3967 = this.field3973;
                this.field3974 = this.field4119;
            }
            if (this.field3967 != null && this.field3974 != null) {
                this.method1090(this.field3967, this.field3974, (byte) -34);
                this.method2267((byte) -87);
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[18] + (arg0 != null ? field4263[4] : field4263[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "d", descriptor = "(I)V", line = 2380)
    public final void method2251(int arg0) {
        try {
            if (~this.field4197 != -17) {
                this.method2235(arg0 ^ 109);
                this.method2209(true, arg0 + -33);
                this.method2250(true, (byte) -124);
                this.method2230((byte) 66, true);
                this.method2254(1, 111);
                this.field4197 = 16;
            }
            ++field3992;
            if (arg0 != 1) {
                this.method1057(83);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[69] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lak;Z)V", line = 2402)
    public final void method2252(class369 arg0, boolean arg1) {
        try {
            ++field3960;
            this.field4172[this.field4181] = arg0;
            this.method2268(-31360);
            if (!arg1) {
                this.method2258(126, (byte) 37);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[137] + (arg0 != null ? field4263[4] : field4263[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "A", descriptor = "(I)Leba;", line = 2417)
    public final class615 method2253(int arg0) {
        try {
            if (arg0 != -29405) {
                return null;
            } else {
                ++field4093;
                return this.field4131;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[96] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "j", descriptor = "(II)V", line = 2428)
    public final void method2254(int arg0, int arg1) {
        try {
            if (arg1 > 75) {
                ++field3969;
                if (~this.field4229 != ~arg0) {
                    class507 var3;
                    boolean var4;
                    boolean var5;
                    if (arg0 == 1) {
                        var3 = class317.field5178;
                        var4 = true;
                        var5 = true;
                    } else if (arg0 != 2) {
                        if (arg0 == 128) {
                            var4 = true;
                            var5 = true;
                            var3 = class327.field5365;
                        } else {
                            var3 = class211.field3351;
                            var5 = false;
                            var4 = false;
                        }
                    } else {
                        var4 = false;
                        var3 = class533.field7828;
                        var5 = true;
                    }
                    if (!var4 == this.field4194) {
                        this.field4194 = var4;
                        this.method1040(0);
                    }
                    if (!var5 != !this.field4237) {
                        this.field4237 = var5;
                        this.method1074(true);
                    }
                    if (this.field4230 != var3) {
                        this.field4230 = var3;
                        this.method1041((byte) -18);
                    }
                    this.field4229 = arg0;
                    this.field4197 &= -29;
                }
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field4263[71] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "Z", descriptor = "(I)V", line = 2495)
    public final void method2255(int arg0) {
        try {
            ++field4066;
            Enumeration var2 = this.field4068.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method1044((byte) -119, var3, this.field4068.get(var3));
            }
            this.field4241.method981(1328);
            this.field4242.method981(1328);
            this.field4249.method981(1328);
            this.field4257.method5191(8644);
            this.field4244.method5191(8644);
            this.field4258.method5191(8644);
            this.field4248.method5191(8644);
            this.field4254.method5191(8644);
            this.field4144.method551(7654);
            this.field4250.method981(1328);
            int var4 = 80 % ((8 - arg0) / 44);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4263[100] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILeba;)V", line = 2525)
    public final void method2256(int arg0, class615 arg1) {
        try {
            ++field4082;
            this.field4131.method2461(arg1);
            this.field4124 = false;
            if (arg0 != 1) {
                this.method1086(95);
            }
            this.method2229((byte) -100);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[74] + arg0 + ',' + (arg1 != null ? field4263[4] : field4263[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "H", descriptor = "(III[I)V", line = 2538)
    public final void method229(int arg0, int arg1, int arg2, int[] arg3) {
        try {
            ++field4034;
            float var5 = this.field4133.method4469((float) arg2, (float) arg0, -2486, (float) arg1);
            int var6;
            int var7;
            if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
                var6 = this.field4191;
                var7 = this.field4160;
            } else {
                var7 = (int) ((float) this.field4199 * this.field4133.method4482(16383, (float) arg2, (float) arg1, (float) arg0) / var5);
                var6 = (int) ((float) this.field4212 * this.field4133.method4492((float) arg1, (float) arg2, 1057, (float) arg0) / var5);
            }
            arg3[2] = (int) var5;
            arg3[1] = (int) ((float) var6 + -this.field4161);
            arg3[0] = (int) ((float) var7 + -this.field4198);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field4263[65] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4263[4] : field4263[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "p", descriptor = "()Z", line = 2563)
    public final boolean method245() {
        try {
            ++field4125;
            return false;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4263[15] + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "f", descriptor = "(II)V", line = 2573)
    public final void method247(int arg0, int arg1) {
        try {
            if (this.field4158 != arg0 || ~this.field4151 != ~arg1) {
                this.field4151 = arg1;
                this.field4158 = arg0;
                this.method2265((byte) 122);
                this.method2231(8);
                this.method2203(28980);
            }
            ++field4024;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[149] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "r", descriptor = "()Z", line = 2589)
    public final boolean method269() {
        try {
            ++field4027;
            return false;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4263[28] + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(II)I", line = 2598)
    public final int method169(int arg0, int arg1) {
        try {
            ++field4036;
            return arg0 | arg1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[30] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "([I)V", line = 2606)
    public final void method220(int[] arg0) {
        try {
            arg0[1] = this.field3947;
            arg0[0] = this.field4015;
            ++field4037;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[156] + (arg0 != null ? field4263[4] : field4263[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Llia;)V", line = 2615)
    public final void method253(class505 arg0) {
        try {
            ++field3999;
            this.field4234 = (class599) arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[73] + (arg0 != null ? field4263[4] : field4263[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "y", descriptor = "(B)V", line = 2623)
    private final void method2257(byte arg0) {
        try {
            int var2 = -117 / ((arg0 - 53) / 59);
            if (class492.field7405 != this.field4176) {
                class776 var3 = this.field4176;
                this.field4176 = class492.field7405;
                if (!var3.method5583(13)) {
                    this.method2237((byte) -126);
                }
                this.method2213(96);
                this.field4167 = this.field4150;
                this.method2266(-21952);
                this.field4197 &= -8;
            }
            ++field4108;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4263[112] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IB)V", line = 2650)
    public final void method2258(int arg0, byte arg1) {
        try {
            if (arg0 != 1) {
                if (arg0 == 0) {
                    this.method2223(class734.field10762, class734.field10762, (byte) 112);
                } else if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 == 4) {
                            this.method2223(class207.field3239, class207.field3239, (byte) 109);
                        }
                    } else {
                        this.method2223(class734.field10762, class440.field6863, (byte) 117);
                    }
                } else {
                    this.method2223(class434.field6809, class539.field7915, (byte) 107);
                }
            } else {
                this.method2223(class434.field6809, class434.field6809, (byte) 110);
            }
            if (arg1 > -103) {
                this.method218(-32, (class731[]) null);
            }
            ++field3946;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[154] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Lgda;II)V", line = 2680)
    public class261(Canvas arg0, Object arg1, class158 arg2, class58 arg3, int arg4, int arg5) {
        super(arg2);
        try {
            try {
                this.field3967 = this.field3973 = arg0;
                this.field4092 = arg3;
                this.field3974 = this.field4119 = arg1;
                this.field4177 = arg4;
                Dimension var7 = arg0.getSize();
                this.field4015 = this.field4042 = var7.width;
                this.field4138 = arg5;
                this.field3947 = this.field4054 = var7.height;
                class517.method3877(true, false, 1);
                if (super.field864 != null) {
                    this.field4215 = new class46(this, super.field864);
                    this.field4016 = new NativeInterface(super.field864.method1416(-26879), this.field4138);
                    for (int var8 = 0; super.field864.method1416(-26879) > var8; ++var8) {
                        class304 var9 = super.field864.method1419(var8, -119);
                        if (var9 != null) {
                            this.field4016.initTextureMetrics(var8, var9.field4893, var9.field4905);
                        }
                    }
                } else {
                    this.field4016 = new NativeInterface(0, this.field4138);
                    this.field4215 = null;
                }
            } catch (Throwable var12) {
                var12.printStackTrace();
                this.method668(-4369);
                throw new RuntimeException("");
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field4263[124] + (arg0 != null ? field4263[4] : field4263[2]) + ',' + (arg1 != null ? field4263[4] : field4263[2]) + ',' + (arg2 != null ? field4263[4] : field4263[2]) + ',' + (arg3 != null ? field4263[4] : field4263[2]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(BF)V", line = 2733)
    public final void method2259(byte arg0, float arg1) {
        try {
            ++field4051;
            if (this.field4216 != arg1) {
                this.field4216 = arg1;
                this.method2231(8);
            }
            if (arg0 != -64) {
                this.field4177 = -3;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[113] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "([FB)[F", line = 2750)
    public final float[] method2260(float[] arg0, byte arg1) {
        try {
            arg0[4] = this.field4167[1];
            ++field4013;
            arg0[0] = this.field4167[0];
            arg0[8] = this.field4167[2];
            arg0[12] = this.field4167[3];
            arg0[9] = this.field4167[6];
            arg0[2] = this.field4167[8];
            if (arg1 < 32) {
                return null;
            } else {
                arg0[5] = this.field4167[5];
                arg0[1] = this.field4167[4];
                arg0[13] = this.field4167[7];
                arg0[6] = this.field4167[9];
                arg0[7] = this.field4167[13];
                arg0[10] = this.field4167[10];
                arg0[3] = this.field4167[12];
                arg0[14] = this.field4167[11];
                arg0[15] = this.field4167[15];
                arg0[11] = this.field4167[14];
                return arg0;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[36] + (arg0 != null ? field4263[4] : field4263[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "K", descriptor = "([I)V", line = 2778)
    public final void method201(int[] arg0) {
        try {
            arg0[3] = this.field4203;
            arg0[1] = this.field4188;
            arg0[2] = this.field4201;
            arg0[0] = this.field4217;
            ++field3985;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[155] + (arg0 != null ? field4263[4] : field4263[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "g", descriptor = "(II)Lqba;", line = 2789)
    public class428 method1084(int arg0, int arg1) {
        try {
            ++field3996;
            if (arg0 > -18) {
                this.method2273((class696) null, 120, (byte) -86, (float[]) null, 53, false);
            }
            if (arg1 != 6) {
                if (arg1 != 1) {
                    if (~arg1 != -3) {
                        return ~arg1 == -8 ? new class127(this) : new class245(this);
                    } else {
                        return new class319(this, this.field4002);
                    }
                } else {
                    return new class240(this);
                }
            } else {
                return new class231(this);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4263[51] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "A", descriptor = "()Z", line = 2841)
    public final boolean method158() {
        try {
            ++field4063;
            return true;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4263[72] + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 2849)
    public final void method189(Canvas arg0) {
        try {
            ++field3991;
            if (this.field3973 == arg0) {
                throw new RuntimeException();
            } else if (this.field4068.containsKey(arg0)) {
                this.method1044((byte) -117, arg0, this.field4068.get(arg0));
                this.field4068.remove(arg0);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[54] + (arg0 != null ? field4263[4] : field4263[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 2872)
    public final void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        try {
            ++field3970;
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field4263[148] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "EA", descriptor = "(IIII)V", line = 2879)
    public final void method214(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field4099;
            if (!this.field4190) {
                throw new RuntimeException("");
            } else {
                this.field4236 = arg0;
                this.field4182 = arg2;
                this.field4184 = arg1;
                this.field4154 = arg3;
                if (this.field4228) {
                    this.field4224[3].method3296((byte) -26);
                    this.field4224[3].method3297(127);
                }
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4263[109] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "N", descriptor = "(I)I", line = 2901)
    public final int method2261(int arg0) {
        try {
            ++field4043;
            if (arg0 != 0) {
                this.method212();
            }
            return this.field4182;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[95] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(BLega;I)V", line = 2914)
    public final void method2262(byte arg0, class742 arg1, int arg2) {
        try {
            this.method1067(false, arg1, false, -116, arg2);
            int var4 = -90 / ((arg0 - 19) / 43);
            ++field4049;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4263[5] + arg0 + ',' + (arg1 != null ? field4263[4] : field4263[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "w", descriptor = "()Z", line = 2925)
    public final boolean method238() {
        try {
            ++field3981;
            return true;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4263[37] + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "KA", descriptor = "(IIII)V", line = 2935)
    public final void method221(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field4122;
            if (arg0 <= 0 && this.field4015 - 1 <= arg2 && arg1 <= 0 && arg3 >= this.field3947 + -1) {
                this.method227();
            } else {
                this.field4203 = ~arg3 >= ~this.field4015 ? arg3 : 0;
                this.field4217 = ~arg0 > -1 ? 0 : arg0;
                this.field4188 = arg1 >= 0 ? arg1 : 0;
                this.field4201 = this.field4015 < arg2 ? 0 : arg2;
                if (!this.field4262) {
                    this.field4262 = true;
                    this.method1037(false);
                }
                this.method1052(false);
                this.method2201(true);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4263[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZIBZ)V", line = 2963)
    public final void method2263(boolean arg0, int arg1, byte arg2, boolean arg3) {
        try {
            if (arg2 != 93) {
                this.method1065(true);
            }
            if (this.field4209 != arg1 || this.field4228 != this.field4190) {
                class406 var5 = null;
                int var6 = 0;
                byte var7 = 0;
                int var8 = 0;
                int var9 = this.field4190 ? 3 : 0;
                if (arg1 < 0) {
                    this.method2238(-32023);
                } else {
                    var5 = this.field4215.method466(arg1, 4);
                    class304 var10 = super.field864.method1419(arg1, arg2 ^ -64);
                    if (~var10.field4899 == -1 && var10.field4902 == 0) {
                        this.method2238(arg2 + -32116);
                    } else {
                        int var11 = var10.field4911 ? 64 : 128;
                        int var12 = var11 * 50;
                        class615 var13 = this.method2208((byte) -117);
                        var13.method4471(0.0F, (byte) 122, (float) (this.field4214 % var12 * var10.field4902) / (float) var12, (float) (this.field4214 % var12 * var10.field4899) / (float) var12);
                        this.method2252(class428.field6751, true);
                    }
                    if (!this.field4190) {
                        var8 = var10.field4907;
                        var7 = var10.field4901;
                        var9 = var10.field4913;
                    }
                    var6 = var10.field4896;
                }
                this.method2212(arg0, var9, arg3, var7, var8, (byte) -93);
                if (this.field4233 == null) {
                    this.method2233((byte) -117, var5);
                    this.method2258(var6, (byte) -116);
                } else {
                    this.field4233.method1222(var5, (byte) 22, var6);
                }
                this.field4228 = this.field4190;
                this.field4209 = arg1;
            }
            ++field4038;
            this.field4197 &= -8;
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field4263[17] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Luh;Z)Lhk;", line = 3030)
    public final class107 method213(class174 arg0, boolean arg1) {
        try {
            ++field3988;
            class107 var11;
            if (arg0.field2781 != 0 && ~arg0.field2782 != -1) {
                int[] var3 = new int[arg0.field2782 * arg0.field2781];
                int var4 = 0;
                int var5 = 0;
                if (arg0.field2779 == null) {
                    for (int var6 = 0; arg0.field2782 > var6; ++var6) {
                        for (int var7 = 0; ~var7 > ~arg0.field2781; ++var7) {
                            int var8 = arg0.field2775[255 & arg0.field2776[var4++]];
                            var3[var5++] = ~var8 != -1 ? class553.method4099(var8, -16777216) : 0;
                        }
                    }
                } else {
                    for (int var9 = 0; var9 < arg0.field2782; ++var9) {
                        for (int var10 = 0; arg0.field2781 > var10; ++var10) {
                            var3[var5++] = class553.method4099(arg0.field2775[class292.method2485(arg0.field2776[var4], 255)], arg0.field2779[var4] << 24);
                            ++var4;
                        }
                    }
                }
                var11 = this.method665(arg0.field2781, arg0.field2781, -89, 0, var3, arg0.field2782);
            } else {
                var11 = this.method665(1, 1, 115, 0, new int[1], 1);
            }
            var11.method24(arg0.field2774, arg0.field2778, arg0.field2777, arg0.field2780);
            return var11;
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field4263[142] + (arg0 != null ? field4263[4] : field4263[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "W", descriptor = "(I)V", line = 3099)
    public final void method2264(int arg0) {
        try {
            this.method2200(class376.field6098, (byte) 112, arg0);
            ++field4101;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[133] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "m", descriptor = "(B)V", line = 3107)
    private final void method2265(byte arg0) {
        try {
            ++field3953;
            if (arg0 < 50) {
                this.peer = -60L;
            }
            this.field4223 = false;
            this.method2213(111);
            if (class492.field7405 == this.field4176) {
                this.method2266(-21952);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[94] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "ab", descriptor = "(I)V", line = 3125)
    private final void method2266(int arg0) {
        try {
            this.method1092(arg0 + 21963);
            ++field4074;
            if (arg0 == -21952) {
                if (this.field4233 != null) {
                    this.field4233.method3391(100);
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[159] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "q", descriptor = "(B)V", line = 3140)
    private final void method2267(byte arg0) {
        try {
            ++field3958;
            if (this.field3967 != null) {
                Dimension var2 = this.field3967.getSize();
                this.field4054 = var2.height;
                this.field4042 = var2.width;
            } else {
                this.field4042 = this.field4054 = 1;
            }
            this.field4015 = this.field4042;
            this.field3947 = this.field4054;
            if (arg0 >= -41) {
                this.field4119 = null;
            }
            this.method2240(1);
            this.method2265((byte) 112);
            this.method2231(8);
            this.method1029(11321);
            this.method2201(true);
            this.method2222(false);
            this.method227();
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[165] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "i", descriptor = "()I", line = 3176)
    public final int method155() {
        try {
            ++field4058;
            return this.field4158;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4263[143] + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "([IIIIIZ)Lhk;", line = 3187)
    public final class107 method266(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            ++field3956;
            return new class478(this, arg3, arg4, arg0, arg1, arg2);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field4263[140] + (arg0 != null ? field4263[4] : field4263[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(II[I[I)Laa;", line = 3195)
    public final class514 method258(int arg0, int arg1, int[] arg2, int[] arg3) {
        try {
            ++field4017;
            return class585.method4299(arg3, this, arg2, 0, arg1, arg0);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4263[87] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4263[4] : field4263[2]) + ',' + (arg3 != null ? field4263[4] : field4263[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "S", descriptor = "(I)V", line = 3203)
    private final void method2268(int arg0) {
        try {
            if (arg0 == -31360) {
                ++field4053;
                this.method1063(119);
                if (this.field4233 != null) {
                    this.field4233.method2733(75);
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[150] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(BI)V", line = 3217)
    public final void method2269(byte arg0, int arg1) {
        try {
            this.method2204(3, arg0 | arg0 << 8 | arg0 << 16 | arg0 << 24);
            ++field3964;
            if (arg1 != -532560792) {
                this.field4154 = -86;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[167] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "x", descriptor = "(I)V", line = 3228)
    private final void method2270(int arg0) {
        try {
            if (arg0 == -9691) {
                if (class481.field7315 != this.field4176) {
                    class776 var2 = this.field4176;
                    this.field4176 = class481.field7315;
                    if (var2.method5583(13)) {
                        this.method2237((byte) -119);
                    }
                    this.method2202(31360);
                    this.field4167 = this.field4219;
                    this.method2266(-21952);
                    this.field4197 &= -25;
                }
                ++field4107;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "z", descriptor = "(I)V", line = 3255)
    private final void method2271(int arg0) {
        try {
            int var2 = -104 % ((-16 - arg0) / 56);
            ++field4078;
            if (!this.field4156) {
                float[] var3 = this.field4222;
                float var4 = (float) this.field4158;
                float var5 = (float) this.field4151;
                float var6 = (float) (-this.field4191) * this.field4216 / (float) this.field4212;
                float var7 = (float) (-this.field4160) * this.field4216 / (float) this.field4199;
                float var8 = (float) (this.field4015 - this.field4160) * this.field4216 / (float) this.field4199;
                float var9 = (float) (-this.field4191 + this.field3947) * this.field4216 / (float) this.field4212;
                if (var7 != var8 && var6 != var9) {
                    var3[15] = 1.0F;
                    var3[0] = 2.0F / (var8 - var7);
                    var3[10] = 1.0F / (var4 - var5);
                    var3[9] = 0.0F;
                    var3[12] = (var7 + var8) / (var7 - var8);
                    var3[3] = 0.0F;
                    var3[4] = 0.0F;
                    var3[14] = var4 / (var4 - var5);
                    var3[2] = 0.0F;
                    var3[13] = (var6 + var9) / (var9 - var6);
                    var3[7] = 0.0F;
                    var3[5] = 2.0F / (-var6 + var9);
                    var3[6] = 0.0F;
                    var3[8] = 0.0F;
                    var3[11] = 0.0F;
                    var3[1] = 0.0F;
                } else {
                    var3[4] = 0.0F;
                    var3[7] = 0.0F;
                    var3[12] = 0.0F;
                    var3[9] = 0.0F;
                    var3[14] = 0.0F;
                    var3[6] = 0.0F;
                    var3[3] = 0.0F;
                    var3[15] = 1.0F;
                    var3[13] = 0.0F;
                    var3[2] = 0.0F;
                    var3[10] = 1.0F;
                    var3[8] = 0.0F;
                    var3[0] = 1.0F;
                    var3[5] = 1.0F;
                    var3[11] = 0.0F;
                    var3[1] = 0.0F;
                }
                this.method2217(-123);
                this.field4156 = true;
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field4263[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "R", descriptor = "(I)V", line = 3327)
    public final void method2272(int arg0) {
        try {
            if (this.field4197 != 2) {
                this.method2270(arg0 + -9700);
                this.method2209(false, -32);
                this.method2241((byte) -30, false);
                this.method2250(false, (byte) -81);
                this.method2230((byte) 92, false);
                this.method2263(false, -2, (byte) 93, false);
                this.field4197 = 2;
            }
            ++field4071;
            if (arg0 != 9) {
                this.field4247 = null;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[80] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lua;IB[FIZ)Lah;", line = 3350)
    public final class406 method2273(class696 arg0, int arg1, byte arg2, float[] arg3, int arg4, boolean arg5) {
        try {
            ++field4029;
            if (arg2 != 32) {
                this.method2241((byte) -101, true);
            }
            return this.method1062(arg1, arg2 + -32, 0, arg4, arg0, arg3, 0, arg5);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field4263[70] + (arg0 != null ? field4263[4] : field4263[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4263[4] : field4263[2]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 3361)
    public final void method261(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        try {
            ++field3952;
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field4263[57] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field4263[4] : field4263[2]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "D", descriptor = "(I)Loda;", line = 3368)
    public final class125 method2274(int arg0) {
        try {
            if (arg0 > -15) {
                this.method242(50, -87, -44, -84, -12, -56);
            }
            ++field4070;
            return this.field4234 == null ? null : this.field4234.method2902(-128);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[168] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "d", descriptor = "(IIIIII)Llia;", line = 3379)
    public final class505 method235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field3957;
            return new class347(this, arg0, arg1, arg2, arg3, arg4, arg5);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field4263[106] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "(IIIIII)V", line = 3389)
    public final void method267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field4006;
            float var7 = (float) arg2 - (float) arg0;
            float var8 = (float) (-arg1) + (float) arg3;
            float var9;
            if (var7 == 0.0F && var8 == 0.0F) {
                var9 = 1.0F;
            } else {
                float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
                var8 *= var10;
                var9 = var7 * var10;
            }
            if (this.method2275((float) arg1, (float) arg2 + var9, 0.0F, (float) arg0, 0.0F, 0, (float) arg3 + var8)) {
                this.method2232((byte) -69);
                this.method2204(3, arg4);
                this.method2262((byte) -102, class119.field1723, 0);
                this.method2248((byte) -109, class119.field1723, 0);
                this.method2254(arg5, 80);
                this.method2239(-19527);
                this.method1075(false, (byte) 93);
                this.method2226((byte) -48);
                this.method1075(true, (byte) 119);
                this.method2248((byte) -109, class339.field5532, 0);
                this.method2262((byte) 122, class339.field5532, 0);
            }
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field4263[83] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(FFFFFIF)Z", line = 3427)
    private final boolean method2275(float arg0, float arg1, float arg2, float arg3, float arg4, int arg5, float arg6) {
        try {
            ++field3948;
            Buffer var8 = this.field4242.method3929(true, -31222);
            if (var8 == null) {
                return false;
            } else {
                Stream var9 = this.method2227(var8, (byte) 68);
                if (Stream.method5108()) {
                    var9.method5109(arg3);
                    var9.method5109(arg0);
                    var9.method5109(arg4);
                    var9.method5109(arg1);
                    var9.method5109(arg6);
                    var9.method5109(arg2);
                } else {
                    var9.method5106(arg3);
                    var9.method5106(arg0);
                    var9.method5106(arg4);
                    var9.method5106(arg1);
                    var9.method5106(arg6);
                    var9.method5106(arg2);
                }
                var9.method5097();
                return arg5 != 0 ? false : this.field4242.method3932((byte) -114);
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field4263[162] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "h", descriptor = "(II)Llp;", line = 3466)
    public final class414 method2276(int arg0, int arg1) {
        try {
            ++field4087;
            if (~(arg1 * 2) < ~this.field4250.method975(false)) {
                this.field4250.method980(arg1, false);
            }
            if (arg0 > -71) {
                this.field4160 = -34;
            }
            return this.field4250;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[53] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "g", descriptor = "(I)V", line = 3491)
    public void method260(int arg0) {
        try {
            if (this.field4215 != null) {
                this.field4215.method464((byte) -38);
            }
            ++field4105;
            this.field4214 = Integer.MAX_VALUE & arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[43] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "k", descriptor = "()Lsj;", line = 3503)
    public final class486 method257() {
        try {
            ++field4009;
            return new class615();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4263[59] + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "()Z", line = 3520)
    public final boolean method203() {
        try {
            ++field4021;
            return true;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4263[7] + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIIIIIII)V", line = 3538)
    public final void method197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            ++field4106;
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
            this.method2232((byte) -69);
            this.method2204(3, arg4);
            this.method2262((byte) 125, class119.field1723, 0);
            this.method2248((byte) -109, class119.field1723, 0);
            this.method2254(arg5, 124);
            this.method2239(-19527);
            this.method1075(false, (byte) 113);
            int var26 = arg8 % (arg6 + arg7);
            float var14 = (float) arg6 * var12;
            float var15 = (float) arg6 * var11;
            float var16 = 0.0F;
            float var17 = 0.0F;
            float var18 = var14;
            float var19 = var15;
            if (arg6 >= var26) {
                var18 = (float) (-var26 + arg6) * var12;
                var19 = (float) (arg6 - var26) * var11;
            } else {
                var17 = (float) (arg6 + arg7 + -var26) * var11;
                var16 = (float) (arg7 - var26 + arg6) * var12;
            }
            float var20 = (float) arg0 + var16;
            float var21 = (float) arg1 + var17;
            float var22 = (float) arg7 * var12;
            float var23 = (float) arg7 * var11;
            while (true) {
                if (~arg0 > ~arg2) {
                    if (var20 > (float) arg2) {
                        break;
                    }
                    if ((float) arg2 < var18 + var20) {
                        var18 = (float) arg2 - var20;
                    }
                } else {
                    if ((float) arg2 > var20) {
                        break;
                    }
                    if (var18 + var20 < (float) arg2) {
                        var18 = (float) arg2 - var20;
                    }
                }
                if (~arg3 >= ~arg1) {
                    if (var21 < (float) arg3) {
                        break;
                    }
                    if (var19 + var21 < (float) arg3) {
                        var19 = (float) arg3 + -var21;
                    }
                } else {
                    if ((float) arg3 < var21) {
                        break;
                    }
                    if (var19 + var21 > (float) arg3) {
                        var19 = (float) arg3 + -var21;
                    }
                }
                if (!this.method2275(var21, var18 + var20, 0.0F, var20, 0.0F, 0, var19 + var21)) {
                    return;
                }
                var21 += var19 + var23;
                var20 += var18 + var22;
                this.method2226((byte) -48);
                var19 = var15;
                var18 = var14;
            }
            this.method1075(true, (byte) 113);
            this.method2248((byte) -109, class339.field5532, 0);
            this.method2262((byte) -26, class339.field5532, 0);
        } catch (RuntimeException var25) {
            throw class590.method4333(var25, field4263[52] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "m", descriptor = "(I)V", line = 3656)
    public final void method2277(int arg0) {
        try {
            this.field4124 = false;
            ++field4047;
            this.method2229((byte) -99);
            if (arg0 != 12587) {
                this.method2221(-86);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4263[153] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "o", descriptor = "(B)[F", line = 3674)
    public final float[] method2278(byte arg0) {
        try {
            ++field4097;
            int var2 = -40 / ((2 - arg0) / 41);
            return this.field4153;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4263[170] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "v", descriptor = "(B)V")
    public abstract void method1039(byte arg0);

    @OriginalMember(owner = "client!gca", name = "y", descriptor = "(I)V")
    public abstract void method1091(int arg0);

    @OriginalMember(owner = "client!gca", name = "n", descriptor = "(Z)V")
    public abstract void method1074(boolean arg0);

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lfk;II)V")
    public abstract void method1036(class682 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gca", name = "V", descriptor = "(I)V")
    public abstract void method1040(int arg0);

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(B[[IZI)Loda;")
    public abstract class125 method1049(byte arg0, int[][] arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!gca", name = "f", descriptor = "(B)V")
    public abstract void method1087(byte arg0);

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IZLega;B)V")
    public abstract void method1046(int arg0, boolean arg1, class742 arg2, byte arg3);

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IZ)Llp;")
    public abstract class414 method1077(int arg0, boolean arg1);

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZLega;ZII)V")
    public abstract void method1067(boolean arg0, class742 arg1, boolean arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!gca", name = "j", descriptor = "(Z)V")
    public abstract void method1037(boolean arg0);

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILdn;Lua;)Z")
    public abstract boolean method1058(int arg0, class544 arg1, class696 arg2);

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "([BIILua;BI)Lfd;")
    public abstract class555 method1080(byte[] arg0, int arg1, int arg2, class696 arg3, byte arg4, int arg5);

    @OriginalMember(owner = "client!gca", name = "u", descriptor = "(B)V")
    public abstract void method1041(byte arg0);

    @OriginalMember(owner = "client!gca", name = "d", descriptor = "(B)V")
    public abstract void method1028(byte arg0);

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(II[BIZLua;II)Lah;")
    public abstract class406 method1043(int arg0, int arg1, byte[] arg2, int arg3, boolean arg4, class696 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method1044(byte arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!gca", name = "n", descriptor = "(B)V")
    public abstract void method1072(byte arg0);

    @OriginalMember(owner = "client!gca", name = "o", descriptor = "(I)V")
    public abstract void method1082(int arg0);

    @OriginalMember(owner = "client!gca", name = "h", descriptor = "(B)V")
    public abstract void method1053(byte arg0);

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;B)V")
    public abstract void method1090(Canvas arg0, Object arg1, byte arg2);

    @OriginalMember(owner = "client!gca", name = "H", descriptor = "(I)V")
    public abstract void method1038(int arg0);

    @OriginalMember(owner = "client!gca", name = "l", descriptor = "(B)V")
    public abstract void method1059(byte arg0);

    @OriginalMember(owner = "client!gca", name = "t", descriptor = "(B)V")
    public abstract void method1027(byte arg0);

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZZ)Lfk;")
    public abstract class682 method1030(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(BLgaa;)V")
    public abstract void method1042(byte arg0, class313 arg1);

    @OriginalMember(owner = "client!gca", name = "j", descriptor = "(I)V")
    public abstract void method1086(int arg0);

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(BI)V")
    public abstract void method1083(byte arg0, int arg1);

    @OriginalMember(owner = "client!gca", name = "s", descriptor = "(B)F")
    public abstract float method1056(byte arg0);

    @OriginalMember(owner = "client!gca", name = "t", descriptor = "(I)V")
    public abstract void method1057(int arg0);

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIILua;[FIZ)Lah;")
    public abstract class406 method1062(int arg0, int arg1, int arg2, int arg3, class696 arg4, float[] arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!gca", name = "L", descriptor = "(I)V")
    public abstract void method1029(int arg0);

    @OriginalMember(owner = "client!gca", name = "s", descriptor = "(I)V")
    public abstract void method1071(int arg0);

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILdn;IILua;)Lah;")
    public abstract class406 method1048(int arg0, class544 arg1, int arg2, int arg3, class696 arg4);

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIBILjj;Llp;I)V")
    public abstract void method1064(int arg0, int arg1, byte arg2, int arg3, class126 arg4, class414 arg5, int arg6);

    @OriginalMember(owner = "client!gca", name = "K", descriptor = "(I)V")
    public abstract void method1081(int arg0);

    @OriginalMember(owner = "client!gca", name = "Q", descriptor = "(I)V")
    public abstract void method1063(int arg0);

    @OriginalMember(owner = "client!gca", name = "h", descriptor = "(Z)V")
    public abstract void method1052(boolean arg0);

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
    public abstract Object method1031(byte arg0, Canvas arg1);

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(BLua;Ldn;)Z")
    public abstract boolean method1034(byte arg0, class696 arg1, class544 arg2);

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(ZB)V")
    public abstract void method1075(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lfg;I)V")
    public abstract void method1089(class136 arg0, int arg1);

    @OriginalMember(owner = "client!gca", name = "w", descriptor = "(I)V")
    public abstract void method1092(int arg0);

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method1079(int arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I[Lgt;)Lgaa;")
    public abstract class313 method1051(int arg0, class482[] arg1);

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Ljj;III)V")
    public abstract void method1050(class126 arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!gca", name = "k", descriptor = "(Z)V")
    public abstract void method1065(boolean arg0);

    @OriginalMember(owner = "client!gca", name = "u", descriptor = "(I)V")
    public abstract void method1069(int arg0);

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIZI[III)Lah;")
    public abstract class406 method1088(int arg0, int arg1, boolean arg2, int arg3, int[] arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!gca", name = "w", descriptor = "(B)V")
    public abstract void method1032(byte arg0);

    @OriginalMember(owner = "client!gca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2279(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 12);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2280(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 14;
                    break;
                case 1:
                    var10005 = 93;
                    break;
                case 2:
                    var10005 = 76;
                    break;
                case 3:
                    var10005 = 127;
                    break;
                default:
                    var10005 = 12;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
