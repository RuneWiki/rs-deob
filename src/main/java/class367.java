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

@OriginalClass("client!uv")
public abstract class class367 extends class60 {

    @OriginalMember(owner = "client!uv", name = "Mc", descriptor = "Lkba;")
    private class108 field4964 = new class108();

    @OriginalMember(owner = "client!uv", name = "be", descriptor = "Z")
    public boolean field5031 = true;

    @OriginalMember(owner = "client!uv", name = "ee", descriptor = "Log;")
    public class648 field5034 = new class648();

    @OriginalMember(owner = "client!uv", name = "fe", descriptor = "Log;")
    public class648 field5035 = new class648();

    @OriginalMember(owner = "client!uv", name = "ge", descriptor = "Log;")
    public class648 field5036 = new class648();

    @OriginalMember(owner = "client!uv", name = "he", descriptor = "Log;")
    public class648 field5037 = new class648();

    @OriginalMember(owner = "client!uv", name = "ie", descriptor = "Log;")
    private class648 field5038 = new class648();

    @OriginalMember(owner = "client!uv", name = "je", descriptor = "Log;")
    private class648 field5039 = new class648();

    @OriginalMember(owner = "client!uv", name = "le", descriptor = "F")
    public float field5041 = 1.0F;

    @OriginalMember(owner = "client!uv", name = "re", descriptor = "Z")
    public boolean field5047 = true;

    @OriginalMember(owner = "client!uv", name = "xe", descriptor = "F")
    private float field5053 = 1.0F;

    @OriginalMember(owner = "client!uv", name = "Ge", descriptor = "Z")
    private boolean field5062 = false;

    @OriginalMember(owner = "client!uv", name = "me", descriptor = "Z")
    private boolean field5042 = false;

    @OriginalMember(owner = "client!uv", name = "Oe", descriptor = "I")
    public int field5070 = 0;

    @OriginalMember(owner = "client!uv", name = "Te", descriptor = "I")
    private int field5075 = -1;

    @OriginalMember(owner = "client!uv", name = "Me", descriptor = "F")
    public float field5068 = 1.0F;

    @OriginalMember(owner = "client!uv", name = "ke", descriptor = "I")
    private int field5040 = -1;

    @OriginalMember(owner = "client!uv", name = "De", descriptor = "Z")
    private boolean field5059 = false;

    @OriginalMember(owner = "client!uv", name = "ne", descriptor = "Lnga;")
    public class514 field5043 = class98.field1297;

    @OriginalMember(owner = "client!uv", name = "Re", descriptor = "I")
    public int field5073 = -1;

    @OriginalMember(owner = "client!uv", name = "gf", descriptor = "[F")
    public float[] field5088 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!uv", name = "ue", descriptor = "I")
    public int field5050 = 0;

    @OriginalMember(owner = "client!uv", name = "xf", descriptor = "I")
    private int field5104 = 0;

    @OriginalMember(owner = "client!uv", name = "we", descriptor = "Z")
    public boolean field5052 = true;

    @OriginalMember(owner = "client!uv", name = "Ke", descriptor = "Z")
    private boolean field5066 = false;

    @OriginalMember(owner = "client!uv", name = "wf", descriptor = "F")
    public float field5103 = 1.0F;

    @OriginalMember(owner = "client!uv", name = "Je", descriptor = "I")
    public int field5065 = 3;

    @OriginalMember(owner = "client!uv", name = "Ie", descriptor = "[F")
    public float[] field5064 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!uv", name = "Ze", descriptor = "I")
    public int field5081 = 512;

    @OriginalMember(owner = "client!uv", name = "Hf", descriptor = "I")
    public int field5114 = 0;

    @OriginalMember(owner = "client!uv", name = "Ff", descriptor = "Z")
    public boolean field5112 = false;

    @OriginalMember(owner = "client!uv", name = "mf", descriptor = "I")
    public int field5093 = 0;

    @OriginalMember(owner = "client!uv", name = "pf", descriptor = "[F")
    private float[] field5096 = new float[16];

    @OriginalMember(owner = "client!uv", name = "Le", descriptor = "I")
    public int field5067 = 0;

    @OriginalMember(owner = "client!uv", name = "nf", descriptor = "I")
    public int field5094 = 0;

    @OriginalMember(owner = "client!uv", name = "yf", descriptor = "[Lew;")
    private class493[] field5105 = new class493[10];

    @OriginalMember(owner = "client!uv", name = "bf", descriptor = "F")
    public float field5083 = 1.0F;

    @OriginalMember(owner = "client!uv", name = "rf", descriptor = "Z")
    public boolean field5098 = true;

    @OriginalMember(owner = "client!uv", name = "He", descriptor = "Z")
    public boolean field5063 = true;

    @OriginalMember(owner = "client!uv", name = "Gf", descriptor = "Z")
    private boolean field5113 = false;

    @OriginalMember(owner = "client!uv", name = "af", descriptor = "[F")
    private float[] field5082 = new float[16];

    @OriginalMember(owner = "client!uv", name = "Qf", descriptor = "Z")
    private boolean field5123 = false;

    @OriginalMember(owner = "client!uv", name = "sf", descriptor = "I")
    public int field5099 = 128;

    @OriginalMember(owner = "client!uv", name = "Rf", descriptor = "I")
    private int field5124 = 1;

    @OriginalMember(owner = "client!uv", name = "pe", descriptor = "I")
    public int field5045 = 8;

    @OriginalMember(owner = "client!uv", name = "df", descriptor = "I")
    public int field5085 = 512;

    @OriginalMember(owner = "client!uv", name = "qf", descriptor = "I")
    public int field5097 = 3584;

    @OriginalMember(owner = "client!uv", name = "Of", descriptor = "[F")
    private float[] field5121 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!uv", name = "Pf", descriptor = "F")
    public float field5122 = -1.0F;

    @OriginalMember(owner = "client!uv", name = "Kf", descriptor = "Liia;")
    public class89 field5117 = class278.field3705;

    @OriginalMember(owner = "client!uv", name = "ef", descriptor = "F")
    public float field5086 = -1.0F;

    @OriginalMember(owner = "client!uv", name = "Zf", descriptor = "I")
    public int field5132 = 50;

    @OriginalMember(owner = "client!uv", name = "ff", descriptor = "I")
    private int field5087 = 0;

    @OriginalMember(owner = "client!uv", name = "Pe", descriptor = "I")
    public int field5071 = 0;

    @OriginalMember(owner = "client!uv", name = "Xe", descriptor = "I")
    public int field5079 = 0;

    @OriginalMember(owner = "client!uv", name = "Mf", descriptor = "[F")
    private float[] field5119 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!uv", name = "Wf", descriptor = "Z")
    public boolean field5129 = false;

    @OriginalMember(owner = "client!uv", name = "If", descriptor = "I")
    private int field5115 = 16777215;

    @OriginalMember(owner = "client!uv", name = "Vf", descriptor = "I")
    public int field5128 = -1;

    @OriginalMember(owner = "client!uv", name = "Df", descriptor = "I")
    private int field5110 = 0;

    @OriginalMember(owner = "client!uv", name = "kf", descriptor = "Z")
    public boolean field5091 = true;

    @OriginalMember(owner = "client!uv", name = "Xf", descriptor = "I")
    public int field5130 = 0;

    @OriginalMember(owner = "client!uv", name = "bg", descriptor = "F")
    public float field5134 = 3584.0F;

    @OriginalMember(owner = "client!uv", name = "Ee", descriptor = "F")
    public float field5060 = 3584.0F;

    @OriginalMember(owner = "client!uv", name = "Uf", descriptor = "I")
    private int field5127 = 0;

    @OriginalMember(owner = "client!uv", name = "fg", descriptor = "[F")
    private float[] field5138 = new float[16];

    @OriginalMember(owner = "client!uv", name = "Ne", descriptor = "Z")
    public boolean field5069 = false;

    @OriginalMember(owner = "client!uv", name = "te", descriptor = "I")
    private int field5049 = -1;

    @OriginalMember(owner = "client!uv", name = "Se", descriptor = "[F")
    private float[] field5074 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!uv", name = "Ce", descriptor = "[F")
    public float[] field5058 = this.field5074;

    @OriginalMember(owner = "client!uv", name = "cg", descriptor = "Z")
    public boolean field5135 = false;

    @OriginalMember(owner = "client!uv", name = "eg", descriptor = "I")
    public int field5137 = 0;

    @OriginalMember(owner = "client!uv", name = "of", descriptor = "Ljaclib/memory/Stream;")
    private Stream field5095 = new Stream();

    @OriginalMember(owner = "client!uv", name = "wg", descriptor = "Log;")
    private class648 field5155 = new class648();

    @OriginalMember(owner = "client!uv", name = "Fc", descriptor = "Ljava/lang/Object;")
    public Object field4957;

    @OriginalMember(owner = "client!uv", name = "Wd", descriptor = "Ljava/lang/Object;")
    private Object field5026;

    @OriginalMember(owner = "client!uv", name = "Md", descriptor = "Lni;")
    public class522 field5016;

    @OriginalMember(owner = "client!uv", name = "Tc", descriptor = "Ljava/awt/Canvas;")
    public Canvas field4971;

    @OriginalMember(owner = "client!uv", name = "bb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4875;

    @OriginalMember(owner = "client!uv", name = "Bf", descriptor = "I")
    public int field5108;

    @OriginalMember(owner = "client!uv", name = "md", descriptor = "I")
    private int field4990;

    @OriginalMember(owner = "client!uv", name = "Hc", descriptor = "I")
    public int field4959;

    @OriginalMember(owner = "client!uv", name = "Qe", descriptor = "I")
    public int field5072;

    @OriginalMember(owner = "client!uv", name = "Td", descriptor = "I")
    private int field5023;

    @OriginalMember(owner = "client!uv", name = "Nb", descriptor = "I")
    public int field4913;

    @OriginalMember(owner = "client!uv", name = "Jf", descriptor = "Ltl;")
    private class619 field5116;

    @OriginalMember(owner = "client!uv", name = "Ib", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field4908;

    @OriginalMember(owner = "client!uv", name = "qe", descriptor = "F")
    private float field5046;

    @OriginalMember(owner = "client!uv", name = "Ue", descriptor = "F")
    public float field5076;

    @OriginalMember(owner = "client!uv", name = "cf", descriptor = "F")
    public float field5084;

    @OriginalMember(owner = "client!uv", name = "vf", descriptor = "F")
    public float field5102;

    @OriginalMember(owner = "client!uv", name = "Af", descriptor = "F")
    public float field5107;

    @OriginalMember(owner = "client!uv", name = "Lf", descriptor = "F")
    private float field5118;

    @OriginalMember(owner = "client!uv", name = "ag", descriptor = "F")
    public float field5133;

    @OriginalMember(owner = "client!uv", name = "gg", descriptor = "F")
    public float field5139;

    @OriginalMember(owner = "client!uv", name = "x", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!uv", name = "z", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!uv", name = "A", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!uv", name = "B", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!uv", name = "C", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!uv", name = "E", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!uv", name = "F", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!uv", name = "G", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!uv", name = "H", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!uv", name = "I", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!uv", name = "J", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!uv", name = "K", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!uv", name = "L", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!uv", name = "N", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!uv", name = "O", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!uv", name = "P", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!uv", name = "Q", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!uv", name = "R", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!uv", name = "S", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!uv", name = "T", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!uv", name = "U", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!uv", name = "V", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!uv", name = "W", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!uv", name = "X", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!uv", name = "Y", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!uv", name = "Z", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!uv", name = "ab", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!uv", name = "cb", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!uv", name = "db", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!uv", name = "eb", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!uv", name = "fb", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!uv", name = "gb", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!uv", name = "hb", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!uv", name = "ib", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!uv", name = "jb", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!uv", name = "kb", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!uv", name = "lb", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!uv", name = "mb", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!uv", name = "nb", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!uv", name = "ob", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!uv", name = "pb", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!uv", name = "qb", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!uv", name = "rb", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!uv", name = "sb", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!uv", name = "tb", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!uv", name = "ub", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!uv", name = "vb", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!uv", name = "wb", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!uv", name = "xb", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!uv", name = "yb", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!uv", name = "zb", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!uv", name = "Ab", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!uv", name = "Bb", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!uv", name = "Cb", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!uv", name = "Db", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!uv", name = "Eb", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!uv", name = "Fb", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!uv", name = "Gb", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!uv", name = "Hb", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!uv", name = "Jb", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!uv", name = "Kb", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!uv", name = "Lb", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!uv", name = "Mb", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!uv", name = "Ob", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!uv", name = "Pb", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!uv", name = "Qb", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!uv", name = "Rb", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!uv", name = "Tb", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!uv", name = "Ub", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!uv", name = "Vb", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!uv", name = "Wb", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!uv", name = "Xb", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!uv", name = "Yb", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!uv", name = "Zb", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!uv", name = "ac", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!uv", name = "bc", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!uv", name = "cc", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!uv", name = "dc", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!uv", name = "ec", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!uv", name = "fc", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!uv", name = "gc", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!uv", name = "hc", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!uv", name = "ic", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!uv", name = "jc", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!uv", name = "kc", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!uv", name = "lc", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!uv", name = "mc", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!uv", name = "nc", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!uv", name = "oc", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!uv", name = "pc", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!uv", name = "qc", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!uv", name = "rc", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!uv", name = "sc", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!uv", name = "uc", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!uv", name = "vc", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!uv", name = "wc", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!uv", name = "xc", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!uv", name = "yc", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!uv", name = "zc", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!uv", name = "Ac", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!uv", name = "Bc", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!uv", name = "Cc", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!uv", name = "Dc", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!uv", name = "Ec", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!uv", name = "Gc", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!uv", name = "Ic", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!uv", name = "Jc", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!uv", name = "Kc", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!uv", name = "Lc", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!uv", name = "Nc", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!uv", name = "Oc", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!uv", name = "Pc", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!uv", name = "Qc", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!uv", name = "Rc", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!uv", name = "Sc", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!uv", name = "Uc", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!uv", name = "Vc", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!uv", name = "Wc", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!uv", name = "Xc", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!uv", name = "Yc", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!uv", name = "Zc", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!uv", name = "ad", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!uv", name = "bd", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!uv", name = "cd", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!uv", name = "dd", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!uv", name = "ed", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!uv", name = "fd", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!uv", name = "gd", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!uv", name = "hd", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!uv", name = "id", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!uv", name = "jd", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!uv", name = "kd", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!uv", name = "ld", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!uv", name = "nd", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!uv", name = "od", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!uv", name = "pd", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!uv", name = "qd", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!uv", name = "rd", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!uv", name = "sd", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!uv", name = "td", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!uv", name = "ud", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!uv", name = "vd", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!uv", name = "wd", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!uv", name = "xd", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!uv", name = "yd", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!uv", name = "zd", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!uv", name = "Ad", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!uv", name = "Bd", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!uv", name = "Cd", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!uv", name = "Dd", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!uv", name = "Ed", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!uv", name = "Fd", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!uv", name = "Gd", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!uv", name = "Hd", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!uv", name = "Id", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!uv", name = "Jd", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!uv", name = "Kd", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!uv", name = "Ld", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!uv", name = "Nd", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!uv", name = "Od", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!uv", name = "Pd", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!uv", name = "Qd", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!uv", name = "Rd", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!uv", name = "Sd", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!uv", name = "Ud", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!uv", name = "Vd", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!uv", name = "Xd", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!uv", name = "Yd", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!uv", name = "Zd", descriptor = "I")
    public int field5029;

    @OriginalMember(owner = "client!uv", name = "ae", descriptor = "I")
    public int field5030;

    @OriginalMember(owner = "client!uv", name = "ce", descriptor = "I")
    public int field5032;

    @OriginalMember(owner = "client!uv", name = "de", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!uv", name = "oe", descriptor = "I")
    public int field5044;

    @OriginalMember(owner = "client!uv", name = "se", descriptor = "I")
    public int field5048;

    @OriginalMember(owner = "client!uv", name = "Ae", descriptor = "I")
    public int field5056;

    @OriginalMember(owner = "client!uv", name = "Be", descriptor = "I")
    public int field5057;

    @OriginalMember(owner = "client!uv", name = "lf", descriptor = "I")
    private int field5092;

    @OriginalMember(owner = "client!uv", name = "tf", descriptor = "I")
    public int field5100;

    @OriginalMember(owner = "client!uv", name = "Ef", descriptor = "I")
    public int field5111;

    @OriginalMember(owner = "client!uv", name = "Nf", descriptor = "I")
    public int field5120;

    @OriginalMember(owner = "client!uv", name = "Sf", descriptor = "I")
    private int field5125;

    @OriginalMember(owner = "client!uv", name = "hg", descriptor = "I")
    public int field5140;

    @OriginalMember(owner = "client!uv", name = "Eg", descriptor = "I")
    private int field5163;

    @OriginalMember(owner = "client!uv", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!uv", name = "Tf", descriptor = "Lfea;")
    private class143 field5126;

    @OriginalMember(owner = "client!uv", name = "lg", descriptor = "Ltea;")
    private class241 field5144;

    @OriginalMember(owner = "client!uv", name = "tg", descriptor = "Ltea;")
    private class241 field5152;

    @OriginalMember(owner = "client!uv", name = "Ag", descriptor = "Ltea;")
    private class241 field5159;

    @OriginalMember(owner = "client!uv", name = "mg", descriptor = "Lqa;")
    private class251 field5145;

    @OriginalMember(owner = "client!uv", name = "ng", descriptor = "Lqa;")
    public class251 field5146;

    @OriginalMember(owner = "client!uv", name = "og", descriptor = "Lqa;")
    private class251 field5147;

    @OriginalMember(owner = "client!uv", name = "sg", descriptor = "Lqa;")
    public class251 field5151;

    @OriginalMember(owner = "client!uv", name = "xg", descriptor = "Lqa;")
    public class251 field5156;

    @OriginalMember(owner = "client!uv", name = "Bg", descriptor = "Lqa;")
    public class251 field5160;

    @OriginalMember(owner = "client!uv", name = "Cg", descriptor = "Lqa;")
    private class251 field5161;

    @OriginalMember(owner = "client!uv", name = "tc", descriptor = "Lmt;")
    public class399 field4945;

    @OriginalMember(owner = "client!uv", name = "jf", descriptor = "Lew;")
    private class493 field5090;

    @OriginalMember(owner = "client!uv", name = "Sb", descriptor = "Lni;")
    public static class522 field4918;

    @OriginalMember(owner = "client!uv", name = "zg", descriptor = "Lug;")
    private class562 field5158;

    @OriginalMember(owner = "client!uv", name = "We", descriptor = "Lbl;")
    public class649 field5078;

    @OriginalMember(owner = "client!uv", name = "ig", descriptor = "Lqw;")
    public class78 field5141;

    @OriginalMember(owner = "client!uv", name = "jg", descriptor = "Lqw;")
    public class78 field5142;

    @OriginalMember(owner = "client!uv", name = "kg", descriptor = "Lqw;")
    public class78 field5143;

    @OriginalMember(owner = "client!uv", name = "pg", descriptor = "Lqw;")
    public class78 field5148;

    @OriginalMember(owner = "client!uv", name = "qg", descriptor = "Lqw;")
    public class78 field5149;

    @OriginalMember(owner = "client!uv", name = "rg", descriptor = "Lqw;")
    public class78 field5150;

    @OriginalMember(owner = "client!uv", name = "ug", descriptor = "Lqw;")
    public class78 field5153;

    @OriginalMember(owner = "client!uv", name = "vg", descriptor = "Lqw;")
    public class78 field5154;

    @OriginalMember(owner = "client!uv", name = "yg", descriptor = "Lqw;")
    public class78 field5157;

    @OriginalMember(owner = "client!uv", name = "Dg", descriptor = "Lqw;")
    public class78 field5162;

    @OriginalMember(owner = "client!uv", name = "zf", descriptor = "Ljv;")
    private class81 field5106;

    @OriginalMember(owner = "client!uv", name = "D", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field4851;

    @OriginalMember(owner = "client!uv", name = "y", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field4846;

    @OriginalMember(owner = "client!uv", name = "M", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field4860;

    @OriginalMember(owner = "client!uv", name = "ve", descriptor = "Z")
    public boolean field5051;

    @OriginalMember(owner = "client!uv", name = "ye", descriptor = "Z")
    public boolean field5054;

    @OriginalMember(owner = "client!uv", name = "ze", descriptor = "Z")
    public boolean field5055;

    @OriginalMember(owner = "client!uv", name = "Fe", descriptor = "Z")
    public boolean field5061;

    @OriginalMember(owner = "client!uv", name = "Ye", descriptor = "Z")
    public boolean field5080;

    @OriginalMember(owner = "client!uv", name = "Fg", descriptor = "Z")
    public boolean field5164;

    @OriginalMember(owner = "client!uv", name = "hf", descriptor = "[Lcba;")
    public class551[] field5089;

    @OriginalMember(owner = "client!uv", name = "uf", descriptor = "[Log;")
    public class648[] field5101;

    @OriginalMember(owner = "client!uv", name = "Cf", descriptor = "[Lbl;")
    private class649[] field5109;

    @OriginalMember(owner = "client!uv", name = "dg", descriptor = "[Lqc;")
    public class743[] field5136;

    @OriginalMember(owner = "client!uv", name = "Ve", descriptor = "[Lil;")
    public class7[] field5077;

    @OriginalMember(owner = "client!uv", name = "Yf", descriptor = "[Lil;")
    public class7[] field5131;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V")
    private final void method2102(byte arg0) {
        if (arg0 != -94) {
            this.field5093 = 32;
        }
        ++field4885;
        if (!this.field5123) {
            float[] var2 = this.field5138;
            float var3 = (float) (-this.field5137 * this.field5132) / (float) this.field5085;
            float var4 = (float) ((-this.field5137 + this.field4913) * this.field5132) / (float) this.field5085;
            float var5 = (float) (this.field5132 * this.field5079) / (float) this.field5081;
            float var6 = (float) ((-this.field4959 + this.field5079) * this.field5132) / (float) this.field5081;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field5132 * 2.0F;
                var2[1] = 0.0F;
                var2[13] = 0.0F;
                var2[11] = -1.0F;
                var2[6] = 0.0F;
                var2[5] = var7 / (var5 - var6);
                var2[8] = (var3 + var4) / (-var3 + var4);
                var2[0] = var7 / (var4 - var3);
                var2[2] = 0.0F;
                var2[4] = 0.0F;
                var2[9] = (var5 + var6) / (-var6 + var5);
                var2[7] = 0.0F;
                var2[14] = this.field5046 = (float) (this.field5132 * this.field5097) / (float) (-this.field5097 + this.field5132);
                var2[3] = 0.0F;
                var2[12] = 0.0F;
                var2[10] = this.field5118 = (float) this.field5097 / (float) (-this.field5097 + this.field5132);
                var2[15] = 0.0F;
            } else {
                var2[13] = 0.0F;
                var2[8] = 0.0F;
                var2[2] = 0.0F;
                var2[7] = 0.0F;
                var2[3] = 0.0F;
                var2[11] = 0.0F;
                var2[5] = 1.0F;
                var2[1] = 0.0F;
                var2[0] = 1.0F;
                var2[12] = 0.0F;
                var2[9] = 0.0F;
                var2[14] = 0.0F;
                var2[6] = 0.0F;
                var2[4] = 0.0F;
                var2[10] = 1.0F;
                var2[15] = 1.0F;
            }
            this.method2127(-24793);
            this.field5123 = true;
        }
    }

    @OriginalMember(owner = "client!uv", name = "C", descriptor = "(Z)V")
    public final void method350(boolean arg0) {
        this.field5098 = arg0;
        ++field4946;
        this.method1318(0);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IZ[[II)Ltd;")
    public abstract class455 method1324(int arg0, boolean arg1, int[][] arg2, int arg3);

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "(I)V")
    public final void method2103(int arg0) {
        ++field4879;
        this.field5031 = false;
        this.method2178(0);
        if (arg0 != 1) {
            this.method1343(-121);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
    public abstract void method1305(int arg0, Object arg1, Canvas arg2);

    @OriginalMember(owner = "client!uv", name = "T", descriptor = "(IIII)V")
    public final void method385(int arg0, int arg1, int arg2, int arg3) {
        ++field4933;
        boolean var5 = false;
        if (arg0 > this.field5094) {
            var5 = true;
            this.field5094 = arg0;
        }
        if (~this.field5067 < ~arg2) {
            this.field5067 = arg2;
            var5 = true;
        }
        if (this.field5050 < arg1) {
            this.field5050 = arg1;
            var5 = true;
        }
        if (arg3 < this.field5130) {
            var5 = true;
            this.field5130 = arg3;
        }
        if (var5) {
            if (!this.field5164) {
                this.field5164 = true;
                this.method1314((byte) -122);
            }
            this.method1295(28976);
            this.method2172((byte) 32);
        }
    }

    @OriginalMember(owner = "client!uv", name = "k", descriptor = "(I)V")
    public final void method2104(int arg0) {
        if (arg0 != 4) {
            this.field5118 = -0.15274778F;
        }
        if (this.field5125 != 16) {
            this.method2115(2);
            this.method2162(true, (byte) -101);
            this.method2151(true, arg0 + 2099);
            this.method2142(arg0 ^ 4, true);
            this.method2145(1, 109);
            this.field5125 = 16;
        }
        ++field4961;
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(B)V")
    private final void method2105(byte arg0) {
        ++field4981;
        if (class675.field9436 != this.field5043) {
            class514 var2 = this.field5043;
            this.field5043 = class675.field9436;
            if (!var2.method2843(94)) {
                this.method2121(107);
            }
            this.method2102((byte) -94);
            this.field5058 = this.field5138;
            this.method2122(-108);
            this.field5125 &= -8;
        }
        if (arg0 != -20) {
            this.field5132 = -76;
        }
    }

    @OriginalMember(owner = "client!uv", name = "l", descriptor = "(I)Ltd;")
    public final class455 method2106(int arg0) {
        ++field4937;
        if (arg0 > -92) {
            return null;
        } else {
            return this.field5106 == null ? null : this.field5106.method602(109);
        }
    }

    @OriginalMember(owner = "client!uv", name = "j", descriptor = "(I)V")
    public final void method431(int arg0) {
        ++field4870;
    }

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "(B)V")
    public final void method2107(byte arg0) {
        this.method2138((byte) 125);
        ++field4991;
        int var2 = 5 / ((arg0 - -55) / 38);
        this.method2122(-83);
    }

    @OriginalMember(owner = "client!uv", name = "m", descriptor = "(I)V")
    public void method1339(int arg0) {
        this.method2128(0);
        ++field4949;
        if (arg0 != 1) {
            this.method2109((byte) 115, false);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILkt;Lkq;)Z")
    public abstract boolean method1315(int arg0, class159 arg1, class594 arg2);

    @OriginalMember(owner = "client!uv", name = "n", descriptor = "(I)V")
    private final void method2108(int arg0) {
        this.field5123 = false;
        ++field4876;
        this.method2102((byte) -94);
        if (arg0 != 10886) {
            this.method417();
        }
        if (class675.field9436 == this.field5043) {
            this.method2122(arg0 ^ -11000);
        }
    }

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "(I)V")
    public final void method384(int arg0) {
        ++field4994;
    }

    @OriginalMember(owner = "client!uv", name = "U", descriptor = "(IIIII)V")
    public final void method347(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method412(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
        ++field4948;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
    public abstract void method1320(Object arg0, Canvas arg1, byte arg2);

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(BZ)V")
    public final void method2109(byte arg0, boolean arg1) {
        ++field4925;
        if (arg1 == !this.field5063) {
            this.field5063 = arg1;
            this.method1323((byte) 112);
        }
        if (arg0 <= 107) {
            this.method2134(-94, 91);
        }
    }

    @OriginalMember(owner = "client!uv", name = "o", descriptor = "(I)V")
    private final void method2110(int arg0) {
        if (this.field5125 != arg0) {
            this.method2139((byte) 103);
            this.method2162(false, (byte) -101);
            this.method2131(false, -104);
            this.method2151(false, 2103);
            this.method2142(arg0 + -1, false);
            this.method2167(false, arg0 ^ 1, -2, false);
            this.method2153(1, (byte) 40);
            this.method2148(this.field5078, -128);
            this.field5125 = 1;
        }
        ++field4940;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IZI)Ljaclib/memory/heap/NativeHeapBuffer;")
    public final NativeHeapBuffer method2111(int arg0, boolean arg1, int arg2) {
        ++field4849;
        return arg2 != 0 ? null : this.field4851.method3778(arg0, arg1);
    }

    @OriginalMember(owner = "client!uv", name = "za", descriptor = "(IIIII)V")
    public final void method421(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2110(1);
        ++field4980;
        this.method2134(2, arg3);
        this.method2174(0, -91, class421.field5897);
        this.method2116(-119, class421.field5897, 0);
        this.method2145(arg4, 76);
        this.field5034.method3665((float) arg2, (byte) -116, (float) arg2, 1.0F);
        this.field5034.method39(arg0, arg1, 0);
        this.method2103(1);
        this.method1338(false, false);
        this.method1325(0, true, this.field5144);
        this.method1330(this.field5161, (byte) 104);
        this.method1290(class401.field5677, 0, (byte) 13, 256);
        this.method1338(true, false);
        this.method2116(-108, class71.field769, 0);
        this.method2174(0, -72, class71.field769);
    }

    @OriginalMember(owner = "client!uv", name = "p", descriptor = "(I)I")
    public final int method2112(int arg0) {
        ++field4889;
        int var2 = -57 / ((arg0 - 43) / 54);
        return this.field5040;
    }

    @OriginalMember(owner = "client!uv", name = "q", descriptor = "(I)V")
    public final void method2113(int arg0) {
        ++field4915;
        if (this.field5125 != 4) {
            this.method2139((byte) 103);
            this.method2162(false, (byte) -101);
            this.method2131(false, -65);
            this.method2151(false, 2103);
            this.method2142(0, false);
            this.method2167(false, 0, -2, false);
            this.method2145(1, 111);
            this.method2153(0, (byte) -124);
            this.field5125 = 4;
        }
        if (arg0 != 0) {
            this.field5135 = false;
        }
    }

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "(B)V")
    public abstract void method1321(byte arg0);

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(BI)V")
    public final void method2114(byte arg0, int arg1) {
        ++field4992;
        if (arg0 != 120) {
            this.field5153 = null;
        }
        if (this.field5071 != arg1) {
            this.field5071 = arg1;
            this.method1321((byte) 72);
        }
    }

    @OriginalMember(owner = "client!uv", name = "r", descriptor = "(I)V")
    private final void method2115(int arg0) {
        if (class135.field1724 != this.field5043) {
            class514 var2 = this.field5043;
            this.field5043 = class135.field1724;
            if (!var2.method2843(103)) {
                this.method2121(-43);
            }
            this.method2144((byte) -117);
            this.field5058 = this.field5096;
            this.method2122(-84);
            this.field5125 &= -8;
        }
        if (arg0 != 2) {
            this.field5079 = 43;
        }
        ++field4996;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILef;I)V")
    public final void method2116(int arg0, class488 arg1, int arg2) {
        if (arg0 <= -66) {
            ++field4944;
            this.method1340(arg2, false, (byte) -42, arg1);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IB)V")
    public final void method2117(int arg0, byte arg1) {
        this.method2134(2, arg1 | arg1 << 8 | arg1 << 24 | arg1 << 16);
        ++field4858;
        if (arg0 != 4) {
            this.method456();
        }
    }

    @OriginalMember(owner = "client!uv", name = "m", descriptor = "()Z")
    public final boolean method404() {
        ++field4901;
        return true;
    }

    @OriginalMember(owner = "client!uv", name = "ra", descriptor = "(IIII)V")
    public final void method348(int arg0, int arg1, int arg2, int arg3) {
        this.field5110 = arg3;
        ++field5024;
        this.field5055 = true;
        this.field5040 = arg2;
        this.field5049 = arg1;
        this.field5092 = arg0;
    }

    @OriginalMember(owner = "client!uv", name = "s", descriptor = "(I)V")
    public abstract void method1294(int arg0);

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "(B)Log;")
    public final class648 method2118(byte arg0) {
        ++field4907;
        int var2 = 83 % ((-45 - arg0) / 45);
        return this.field5037;
    }

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "(B)Log;")
    public final class648 method2119(byte arg0) {
        int var2 = 0 / ((-10 - arg0) / 59);
        ++field5007;
        return this.field5101[this.field5071];
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIZ)Lufa;")
    public final class680 method338(int arg0, int arg1, boolean arg2) {
        ++field4912;
        return new class97(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIIIII)V")
    public final void method445(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4926;
    }

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "(II)V")
    public final void method349(int arg0, int arg1) {
        ++field4855;
        if (this.field5132 != arg0 || ~this.field5097 != ~arg1) {
            this.field5132 = arg0;
            this.field5097 = arg1;
            this.method2108(10886);
            this.method2166((byte) 119);
            this.method2157(-111);
        }
    }

    @OriginalMember(owner = "client!uv", name = "g", descriptor = "(B)V")
    public abstract void method1326(byte arg0);

    @OriginalMember(owner = "client!uv", name = "t", descriptor = "(I)V")
    public abstract void method1327(int arg0);

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method394(Canvas arg0, int arg1, int arg2) {
        ++field4903;
        Object var4 = null;
        if (arg0 != null && this.field4971 != arg0) {
            if (this.field4860.containsKey(arg0)) {
                var4 = this.field4860.get(arg0);
            }
        } else {
            var4 = this.field5026;
        }
        if (var4 == null) {
            throw new RuntimeException();
        } else {
            this.method1331(arg0, var4, -117);
            if (this.field4875 == arg0) {
                this.method2147(1);
            }
        }
    }

    @OriginalMember(owner = "client!uv", name = "u", descriptor = "(I)V")
    public final void method2120(int arg0) {
        this.field5034.method24();
        if (arg0 != 13951) {
            this.method2139((byte) 54);
        }
        ++field5028;
        this.field5031 = true;
        this.method2178(0);
    }

    @OriginalMember(owner = "client!uv", name = "v", descriptor = "(I)V")
    private final void method2121(int arg0) {
        int var2 = 19 / ((arg0 - 34) / 60);
        ++field5020;
        this.field5113 = false;
        if (this.field5090 != null) {
            this.field5090.method656(2899);
        }
        this.method1282(0);
    }

    @OriginalMember(owner = "client!uv", name = "w", descriptor = "(I)V")
    private final void method2122(int arg0) {
        ++field4852;
        if (arg0 <= -69) {
            this.method1329((byte) 48);
            if (this.field5090 != null) {
                this.field5090.method658(-121);
            }
        }
    }

    @OriginalMember(owner = "client!uv", name = "g", descriptor = "(II)Lug;")
    public final class562 method2123(int arg0, int arg1) {
        if (arg0 <= 43) {
            return null;
        } else {
            ++field4989;
            if (~(arg1 * 2) < ~this.field5158.method177(200)) {
                this.field5158.method180(arg1, 20779);
            }
            return this.field5158;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lza;)V")
    public final void method432(class416 arg0) {
        this.field4851 = ((class625) arg0).field8749;
        ++field4987;
        this.field4846 = this.field4851.method3778(32768, false);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lcm;B)V")
    public abstract void method1301(class729 arg0, byte arg1);

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "(Z)V")
    public final void method2124(boolean arg0) {
        this.field5077 = new class7[this.field5100];
        this.field5101 = new class648[this.field5100];
        this.field5109 = new class649[this.field5100];
        ++field4965;
        this.field5131 = new class7[this.field5100];
        this.field5136 = new class743[this.field5100];
        for (int var2 = 0; this.field5100 > var2; ++var2) {
            this.field5131[var2] = class199.field2365;
            this.field5077[var2] = class199.field2365;
            this.field5136[var2] = class761.field10620;
            this.field5101[var2] = new class648();
        }
        this.field5089 = new class551[this.field5057 - 2];
        this.field5078 = this.method1307(1, 1, class758.field10567, (byte) 45, class594.field8277);
        this.method432(new class625(262144));
        this.field5156 = this.method1316(new class235[] { new class235(new class239[] { class239.field3118, class239.field3127 }) }, 6);
        this.field5151 = this.method1316(new class235[] { new class235(new class239[] { class239.field3118, class239.field3124 }) }, 6);
        this.field5146 = this.method1316(new class235[] { new class235(class239.field3118), new class235(class239.field3124), new class235(class239.field3127), new class235(class239.field3123) }, 6);
        this.field5160 = this.method1316(new class235[] { new class235(class239.field3118), new class235(class239.field3124), new class235(class239.field3127) }, 6);
        this.field5148 = new class78(this, 0, 0, false, false);
        this.field5157 = new class78(this, 0, 0, true, true);
        this.field5150 = new class78(this, 0, 0, false, false);
        this.field5143 = new class78(this, 0, 0, true, true);
        this.field5153 = new class78(this, 0, 0, false, false);
        this.field5149 = new class78(this, 0, 0, true, true);
        this.field5141 = new class78(this, 0, 0, false, false);
        this.field5142 = new class78(this, 0, 0, true, true);
        this.field5162 = new class78(this, 0, 0, false, false);
        this.field5154 = new class78(this, 0, 0, true, arg0);
        this.field5126 = new class143(this);
        this.field5158 = this.method1281((byte) 84, true);
        this.method2182((byte) -61);
        this.field4945 = new class399(this);
        this.field5105[1] = this.method1298(1, (byte) 125);
        this.field5105[2] = this.method1298(2, (byte) -66);
        this.field5105[4] = this.method1298(4, (byte) 126);
        this.field5105[5] = this.method1298(5, (byte) 114);
        this.field5105[6] = this.method1298(6, (byte) -82);
        this.field5105[7] = this.method1298(7, (byte) 127);
        this.field5105[3] = this.method1298(3, (byte) -80);
        this.field5105[8] = this.method1298(8, (byte) 103);
        this.field5105[9] = this.method1298(9, (byte) 103);
        if (!this.field5105[2].method634((byte) 27)) {
            this.field5105[2] = this.method1298(0, (byte) 125);
        }
        if (!this.field5105[4].method634((byte) 27)) {
            this.field5105[4] = this.field5105[2];
        }
        if (!this.field5105[8].method634((byte) 27)) {
            this.field5105[8] = this.field5105[4];
        }
        if (!this.field5105[9].method634((byte) 27)) {
            this.field5105[9] = this.field5105[8];
        }
        this.method1339(1);
        this.method406();
        this.method448();
    }

    @OriginalMember(owner = "client!uv", name = "h", descriptor = "(B)V")
    public abstract void method1329(byte arg0);

    @OriginalMember(owner = "client!uv", name = "x", descriptor = "(I)I")
    public final int method2125(int arg0) {
        if (arg0 <= 91) {
            this.field5042 = false;
        }
        ++field4976;
        return this.field5071;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIZLkt;III[F)Ljs;")
    public abstract class334 method1278(int arg0, int arg1, boolean arg2, class159 arg3, int arg4, int arg5, int arg6, float[] arg7);

    @OriginalMember(owner = "client!uv", name = "l", descriptor = "()Z")
    public final boolean method392() {
        ++field4861;
        return true;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Ltw;Z)Lufa;")
    public final class680 method366(class204 arg0, boolean arg1) {
        ++field4920;
        class680 var9;
        if (arg0.field2421 != 0 && arg0.field2419 != 0) {
            int[] var3 = new int[arg0.field2421 * arg0.field2419];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field2422 != null) {
                for (int var6 = 0; ~var6 > ~arg0.field2419; ++var6) {
                    for (int var7 = 0; arg0.field2421 > var7; ++var7) {
                        var3[var5++] = class344.method2020(arg0.field2422[var4] << 24, arg0.field2417[class321.method1919(arg0.field2416[var4], 255)]);
                        ++var4;
                    }
                }
            } else {
                for (int var8 = 0; var8 < arg0.field2419; ++var8) {
                    for (int var10 = 0; arg0.field2421 > var10; ++var10) {
                        int var11 = arg0.field2417[arg0.field2416[var4++] & 255];
                        var3[var5++] = var11 == 0 ? 0 : class344.method2020(-16777216, var11);
                    }
                }
            }
            var9 = this.method351(-7962, 0, arg0.field2421, arg0.field2419, var3, arg0.field2421);
        } else {
            var9 = this.method351(-7962, 0, 1, 1, new int[1], 1);
        }
        var9.method670(arg0.field2424, arg0.field2420, arg0.field2418, arg0.field2423);
        return var9;
    }

    @OriginalMember(owner = "client!uv", name = "aa", descriptor = "(IIIIII)V")
    public final void method447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2110(1);
        ++field4958;
        this.method2134(2, arg4);
        this.method2174(0, -68, class421.field5897);
        this.method2116(-75, class421.field5897, 0);
        this.method2145(arg5, 126);
        this.field5034.method3665((float) arg3, (byte) -119, (float) arg2, 1.0F);
        this.field5034.method39(arg0, arg1, 0);
        this.method2103(1);
        this.method1338(false, false);
        this.method2146((byte) -125);
        this.method1338(true, false);
        this.method2116(-103, class71.field769, 0);
        this.method2174(0, -87, class71.field769);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(FFFFFFI)Z")
    private final boolean method2126(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6) {
        ++field5025;
        Buffer var8 = this.field5159.method1451(true, (byte) 27);
        if (arg6 != 8) {
            return false;
        } else if (var8 == null) {
            return false;
        } else {
            Stream var9 = this.method2170(24022, var8);
            if (!Stream.method3786()) {
                var9.method3781(arg2);
                var9.method3781(arg1);
                var9.method3781(arg5);
                var9.method3781(arg4);
                var9.method3781(arg3);
                var9.method3781(arg0);
            } else {
                var9.method3784(arg2);
                var9.method3784(arg1);
                var9.method3784(arg5);
                var9.method3784(arg4);
                var9.method3784(arg3);
                var9.method3784(arg0);
            }
            var9.method3795();
            return this.field5159.method1448(13623);
        }
    }

    @OriginalMember(owner = "client!uv", name = "X", descriptor = "(I)V")
    public final void method438(int arg0) {
        ++field4956;
        this.field5065 = 0;
        while (~arg0 < -2) {
            ++this.field5065;
            arg0 >>= 1;
        }
        this.field5045 = 1 << this.field5065;
    }

    @OriginalMember(owner = "client!uv", name = "y", descriptor = "(I)V")
    private final void method2127(int arg0) {
        this.field5138[14] = this.field5046;
        this.field5138[10] = this.field5118;
        ++field5010;
        this.field5060 = (this.field5138[14] + (float) (-this.field5097)) / this.field5138[10];
        if (arg0 != -24793) {
            this.field5117 = null;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IZLtea;)V")
    public abstract void method1325(int arg0, boolean arg1, class241 arg2);

    @OriginalMember(owner = "client!uv", name = "z", descriptor = "(I)V")
    public abstract void method1318(int arg0);

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Loq;IIILug;II)V")
    public abstract void method1304(class362 arg0, int arg1, int arg2, int arg3, class562 arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!uv", name = "i", descriptor = "()I")
    public final int method400() {
        ++field4930;
        return this.field5132;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method353(Canvas arg0) {
        this.field5026 = null;
        ++field4902;
        this.field4875 = null;
        if (arg0 != null && this.field4971 != arg0) {
            if (this.field4860.containsKey(arg0)) {
                this.field5026 = this.field4860.get(arg0);
                this.field4875 = arg0;
            }
        } else {
            this.field5026 = this.field4957;
            this.field4875 = this.field4971;
        }
        if (this.field4875 != null && this.field5026 != null) {
            this.method1320(this.field5026, this.field4875, (byte) -34);
            this.method2147(1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!uv", name = "A", descriptor = "(I)V")
    public abstract void method1343(int arg0);

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "(I)Lza;")
    public final class416 method371(int arg0) {
        ++field4899;
        class625 var2 = new class625(arg0);
        this.field4964.method725(var2, -20911);
        return var2;
    }

    @OriginalMember(owner = "client!uv", name = "pa", descriptor = "()V")
    public final void method417() {
        ++field4874;
        this.field5055 = false;
    }

    @OriginalMember(owner = "client!uv", name = "B", descriptor = "(I)V")
    private final void method2128(int arg0) {
        ++field4970;
        this.method1313(arg0 + -24391);
        this.method1335((byte) -120);
        this.method1294(arg0 + -5668);
        this.method1333(-14713);
        this.method1312((byte) 80);
        this.method1286(-128);
        this.method1299((byte) -37);
        this.method1343(arg0);
        this.method1318(arg0);
        this.method1323((byte) 112);
        this.method1279(false);
        this.method1337(-112);
        this.method1342((byte) -118);
        this.method1288(arg0);
        for (int var2 = this.field5100 + -1; var2 >= 0; --var2) {
            this.method2114((byte) 120, var2);
            this.method1341(2);
            this.method1326((byte) -48);
            this.method2135(arg0 ^ 2);
        }
        this.method1296(arg0 + 12362);
        this.method1291(-11155);
        this.method1329((byte) 57);
        this.method1303((byte) -47);
        this.method1282(0);
    }

    @OriginalMember(owner = "client!uv", name = "C", descriptor = "(I)V")
    public final void method2129(int arg0) {
        ++field4969;
        if (arg0 >= -11) {
            this.field5159 = null;
        }
        if (this.field5125 != 8) {
            this.method2105((byte) -20);
            this.method2162(true, (byte) -101);
            this.method2151(true, 2103);
            this.method2142(0, true);
            this.method2145(1, 89);
            this.field5125 = 8;
        }
    }

    @OriginalMember(owner = "client!uv", name = "EA", descriptor = "(IIII)V")
    public final void method427(int arg0, int arg1, int arg2, int arg3) {
        ++field5014;
        if (!this.field5055) {
            throw new RuntimeException("");
        } else {
            this.field5110 = arg3;
            this.field5040 = arg2;
            this.field5049 = arg1;
            this.field5092 = arg0;
            if (this.field5059) {
                this.field5105[3].method756(-25684);
                this.field5105[3].method654(-127);
            }
        }
    }

    @OriginalMember(owner = "client!uv", name = "v", descriptor = "()Z")
    public final boolean method450() {
        ++field4869;
        return true;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lkq;ZLkt;)Z")
    public abstract boolean method1293(class594 arg0, boolean arg1, class159 arg2);

    @OriginalMember(owner = "client!uv", name = "r", descriptor = "()Z")
    public final boolean method435() {
        ++field4916;
        return false;
    }

    @OriginalMember(owner = "client!uv", name = "z", descriptor = "()Z")
    public final boolean method457() {
        ++field4904;
        return true;
    }

    @OriginalMember(owner = "client!uv", name = "i", descriptor = "(B)Log;")
    public final class648 method2130(byte arg0) {
        int var2 = 92 % ((arg0 - 59) / 32);
        ++field4905;
        return this.field5034;
    }

    @OriginalMember(owner = "client!uv", name = "i", descriptor = "(I)V")
    public void method430(int arg0) {
        if (this.field5116 != null) {
            this.field5116.method3512(-124);
        }
        ++field4955;
        this.field5048 = arg0 & Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZI)V")
    public final void method2131(boolean arg0, int arg1) {
        if (arg1 >= -57) {
            this.method1327(56);
        }
        if (!arg0 != !this.field5135) {
            this.field5135 = arg0;
            this.method1294(-5668);
            this.field5125 &= -8;
        }
        ++field5017;
    }

    @OriginalMember(owner = "client!uv", name = "n", descriptor = "()Lhba;")
    public final class10 method410() {
        ++field4894;
        return this.field5155;
    }

    @OriginalMember(owner = "client!uv", name = "D", descriptor = "(I)V")
    private final void method2132(int arg0) {
        ++field4847;
        this.field5134 = (float) this.field5097;
        if (arg0 != -20711) {
            this.field5085 = 47;
        }
    }

    @OriginalMember(owner = "client!uv", name = "j", descriptor = "(B)V")
    public final void method2133(byte arg0) {
        ++field4884;
        Enumeration var2 = this.field4860.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method1305(0, this.field4860.get(var3), var3);
        }
        this.field5152.method176(false);
        if (arg0 >= -93) {
            this.method354(-25, -24, -97, -114);
        }
        this.field5159.method176(false);
        this.field5144.method176(false);
        this.field5157.method584(-12884);
        this.field5143.method584(-12884);
        this.field5149.method584(-12884);
        this.field5142.method584(-12884);
        this.field5154.method584(-12884);
        this.field5126.method890((byte) 4);
        this.field5158.method176(false);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "([Ldia;I)Lqa;")
    public abstract class251 method1316(class235[] arg0, int arg1);

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Z)V")
    public final void method352(boolean arg0) {
        ++field4983;
    }

    @OriginalMember(owner = "client!uv", name = "k", descriptor = "(B)V")
    public abstract void method1303(byte arg0);

    @OriginalMember(owner = "client!uv", name = "h", descriptor = "(II)V")
    public final void method2134(int arg0, int arg1) {
        if (~this.field5140 != ~arg1) {
            this.field5140 = arg1;
            this.method1296(12362);
        }
        ++field4978;
        if (arg0 != 2) {
            this.field5091 = true;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIIIF)Lcba;")
    public final class551 method374(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field4951;
        return new class557(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!uv", name = "E", descriptor = "(I)V")
    public final void method2135(int arg0) {
        if (this.field5136[this.field5071] != class761.field10620) {
            this.field5136[this.field5071] = class761.field10620;
            this.field5101[this.field5071].method24();
            this.method2152(arg0 ^ 61);
        }
        if (arg0 != 2) {
            this.method414(87, 53, -22, 92, true);
        }
        ++field5008;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZB)V")
    public final void method2136(boolean arg0, byte arg1) {
        if (!this.field5047 == arg0) {
            this.field5047 = arg0;
            this.method1299((byte) 13);
        }
        ++field4986;
        int var3 = -54 % ((-75 - arg1) / 42);
    }

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "(Z)V")
    private final void method2137(boolean arg0) {
        this.method1325(0, arg0, this.field5159);
        ++field4960;
        if (!arg0) {
            this.field5130 = -70;
        }
        this.method1330(this.field5145, (byte) 118);
        this.method1290(class246.field3199, 0, (byte) 56, 1);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
    public abstract void method1331(Canvas arg0, Object arg1, int arg2);

    @OriginalMember(owner = "client!uv", name = "F", descriptor = "(I)V")
    public abstract void method1286(int arg0);

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(BZ)Lug;")
    public abstract class562 method1281(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!uv", name = "G", descriptor = "(I)V")
    public abstract void method1313(int arg0);

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lhba;)V")
    public final void method367(class10 arg0) {
        ++field4909;
        this.field5035 = (class648) arg0;
        this.field5037.method25(this.field5035);
        this.field5037.method3664(false);
        this.field5038.method3660((byte) -52, this.field5037);
        this.field5036.method3660((byte) 101, this.field5035);
        if (this.field5043.method2843(102)) {
            this.method2121(124);
        }
    }

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "(IIIIII)V")
    public final void method412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5018;
        float var7 = (float) arg2 - (float) arg0;
        float var8 = (float) arg3 - (float) arg1;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var9 = var7 * var10;
            var8 *= var10;
        }
        if (this.method2126(0.0F, (float) arg1, (float) arg0, (float) arg3 + var8, (float) arg2 + var9, 0.0F, 8)) {
            this.method2110(1);
            this.method2134(2, arg4);
            this.method2174(0, -102, class421.field5897);
            this.method2116(-116, class421.field5897, 0);
            this.method2145(arg5, 93);
            this.method2120(13951);
            this.method1338(false, false);
            this.method2137(true);
            this.method1338(true, false);
            this.method2116(-118, class71.field769, 0);
            this.method2174(0, -121, class71.field769);
        }
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Lni;II)V")
    public class367(Canvas arg0, Object arg1, class152 arg2, class522 arg3, int arg4, int arg5) {
        super(arg2);
        try {
            this.field5026 = this.field4957 = arg1;
            this.field5016 = arg3;
            this.field4875 = this.field4971 = arg0;
            this.field5108 = arg4;
            Dimension var7 = arg0.getSize();
            this.field4959 = this.field4990 = var7.height;
            this.field5072 = arg5;
            this.field4913 = this.field5023 = var7.width;
            class278.method1660(8, false, true);
            if (super.field636 != null) {
                this.field5116 = new class619(this, super.field636);
                this.field4908 = new NativeInterface(super.field636.method926(true), this.field5072);
                for (int var8 = 0; var8 < super.field636.method926(true); ++var8) {
                    class335 var9 = super.field636.method925(var8, -28755);
                    if (var9 != null) {
                        this.field4908.initTextureMetrics(var8, var9.field4534, var9.field4533);
                    }
                }
            } else {
                this.field4908 = new NativeInterface(0, this.field5072);
                this.field5116 = null;
            }
        } catch (Throwable var11) {
            var11.printStackTrace();
            this.method342(-1);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!uv", name = "l", descriptor = "(B)V")
    public final void method2138(byte arg0) {
        if (class98.field1297 != this.field5043) {
            class514 var2 = this.field5043;
            this.field5043 = class98.field1297;
            if (var2.method2843(98)) {
                this.method2121(97);
            }
            this.field5058 = this.field5074;
            this.field5125 &= -32;
        }
        ++field4880;
        if (arg0 != 125) {
            this.method407((class446) null, 39, -121, 10, 17);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class487 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field4927;
    }

    @OriginalMember(owner = "client!uv", name = "m", descriptor = "(B)V")
    private final void method2139(byte arg0) {
        if (arg0 != 103) {
            this.field4875 = null;
        }
        ++field4859;
        if (class467.field6467 != this.field5043) {
            class514 var2 = this.field5043;
            this.field5043 = class467.field6467;
            if (var2.method2843(118)) {
                this.method2121(-51);
            }
            this.method2141(6281);
            this.field5058 = this.field5082;
            this.method2122(-76);
            this.field5125 &= -25;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Llv;IIII)Lka;")
    public final class472 method407(class446 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4954;
        return new class78(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(BI)V")
    public abstract void method1311(byte arg0, int arg1);

    @OriginalMember(owner = "client!uv", name = "xa", descriptor = "(F)V")
    public final void method434(float arg0) {
        ++field4887;
        if (this.field5068 != arg0) {
            this.field5068 = arg0;
            this.field4908.setAmbient(arg0);
            this.method1313(-24391);
            this.method1286(87);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field5033;
        float var10 = (float) arg2 - (float) arg0;
        float var11 = (float) arg3 - (float) arg1;
        float var12;
        if (var10 == 0.0F && var11 == 0.0F) {
            var12 = 1.0F;
        } else {
            float var13 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            var11 *= var13;
            var12 = var10 * var13;
        }
        this.method2110(1);
        this.method2134(2, arg4);
        this.method2174(0, -106, class421.field5897);
        this.method2116(-106, class421.field5897, 0);
        this.method2145(arg5, 93);
        this.method2120(13951);
        int var14 = arg8 % (arg6 + arg7);
        this.method1338(false, false);
        float var15 = (float) arg6 * var12;
        float var16 = (float) arg6 * var11;
        float var17 = 0.0F;
        float var18 = 0.0F;
        float var19 = var15;
        float var20 = var16;
        if (var14 <= arg6) {
            var19 = (float) (-var14 + arg6) * var12;
            var20 = (float) (-var14 + arg6) * var11;
        } else {
            var18 = (float) (arg6 + arg7 + -var14) * var11;
            var17 = (float) (arg6 - (-arg7 - -var14)) * var12;
        }
        float var21 = (float) arg0 + var17;
        float var22 = (float) arg1 + var18;
        float var23 = (float) arg7 * var12;
        float var24 = (float) arg7 * var11;
        while (true) {
            if (arg2 <= arg0) {
                if ((float) arg2 > var21) {
                    break;
                }
                if ((float) arg2 > var19 + var21) {
                    var19 = (float) arg2 - var21;
                }
            } else {
                if (var21 > (float) arg2) {
                    break;
                }
                if (var19 + var21 > (float) arg2) {
                    var19 = (float) arg2 + -var21;
                }
            }
            if (~arg1 <= ~arg3) {
                if ((float) arg3 > var22) {
                    break;
                }
                if (var20 + var22 < (float) arg3) {
                    var20 = (float) arg3 + -var22;
                }
            } else {
                if ((float) arg3 < var22) {
                    break;
                }
                if ((float) arg3 < var20 + var22) {
                    var20 = (float) arg3 - var22;
                }
            }
            if (!this.method2126(0.0F, var22, var21, var20 + var22, var19 + var21, 0.0F, 8)) {
                return;
            }
            var21 += var19 + var23;
            this.method2137(true);
            var22 += var20 + var24;
            var19 = var15;
            var20 = var16;
        }
        this.method1338(true, false);
        this.method2116(-128, class71.field769, 0);
        this.method2174(0, -121, class71.field769);
    }

    @OriginalMember(owner = "client!uv", name = "H", descriptor = "(I)V")
    private final void method2140(int arg0) {
        ++field4924;
        this.field5152 = this.method1292(false, 58);
        this.field5152.method1450(-20279, 28, 140);
        int var2 = 0;
        if (arg0 != 9) {
            this.method2139((byte) 112);
        }
        while (var2 < 4) {
            Buffer var3 = this.field5152.method1451(true, (byte) 27);
            if (var3 != null) {
                Stream var4 = this.method2170(arg0 + 24013, var3);
                if (!Stream.method3786()) {
                    var4.method3781(0.0F);
                    var4.method3781(0.0F);
                    var4.method3781(0.0F);
                    var4.method3781(0.0F);
                    var4.method3781(0.0F);
                    var4.method3781(0.0F);
                    var4.method3781(0.0F);
                    var4.method3781(0.0F);
                    var4.method3781(1.0F);
                    var4.method3781(0.0F);
                    var4.method3781(0.0F);
                    var4.method3781(1.0F);
                    var4.method3781(0.0F);
                    var4.method3781(1.0F);
                    var4.method3781(1.0F);
                    var4.method3781(1.0F);
                    var4.method3781(0.0F);
                    var4.method3781(1.0F);
                    var4.method3781(1.0F);
                    var4.method3781(1.0F);
                    var4.method3781(1.0F);
                    var4.method3781(1.0F);
                    var4.method3781(0.0F);
                    var4.method3781(0.0F);
                    var4.method3781(1.0F);
                    var4.method3781(0.0F);
                    var4.method3781(1.0F);
                    var4.method3781(0.0F);
                    var4.method3781(0.0F);
                    var4.method3781(0.0F);
                    var4.method3781(0.0F);
                    var4.method3781(0.0F);
                    var4.method3781(0.0F);
                    var4.method3781(0.0F);
                    var4.method3781(0.0F);
                } else {
                    var4.method3784(0.0F);
                    var4.method3784(0.0F);
                    var4.method3784(0.0F);
                    var4.method3784(0.0F);
                    var4.method3784(0.0F);
                    var4.method3784(0.0F);
                    var4.method3784(0.0F);
                    var4.method3784(0.0F);
                    var4.method3784(1.0F);
                    var4.method3784(0.0F);
                    var4.method3784(0.0F);
                    var4.method3784(1.0F);
                    var4.method3784(0.0F);
                    var4.method3784(1.0F);
                    var4.method3784(1.0F);
                    var4.method3784(1.0F);
                    var4.method3784(0.0F);
                    var4.method3784(1.0F);
                    var4.method3784(1.0F);
                    var4.method3784(1.0F);
                    var4.method3784(1.0F);
                    var4.method3784(1.0F);
                    var4.method3784(0.0F);
                    var4.method3784(0.0F);
                    var4.method3784(1.0F);
                    var4.method3784(0.0F);
                    var4.method3784(1.0F);
                    var4.method3784(0.0F);
                    var4.method3784(0.0F);
                    var4.method3784(0.0F);
                    var4.method3784(0.0F);
                    var4.method3784(0.0F);
                    var4.method3784(0.0F);
                    var4.method3784(0.0F);
                    var4.method3784(0.0F);
                }
                var4.method3795();
                if (this.field5152.method1448(13623)) {
                    break;
                }
            }
            ++var2;
        }
        this.field5147 = this.method1316(new class235[] { new class235(new class239[] { class239.field3118, class239.field3127, class239.field3127 }) }, 6);
    }

    @OriginalMember(owner = "client!uv", name = "I", descriptor = "(I)V")
    private final void method2141(int arg0) {
        if (arg0 != 6281) {
            this.method412(114, -87, -38, -57, 16, 20);
        }
        ++field4968;
        if (!this.field5066) {
            float[] var2 = this.field5082;
            this.field5066 = true;
            if (~this.field4913 != -1 && ~this.field4959 != -1) {
                var2[1] = 0.0F;
                var2[3] = 0.0F;
                var2[0] = 2.0F / (float) this.field4913;
                var2[4] = 0.0F;
                var2[15] = 1.0F;
                var2[13] = 1.0F;
                var2[11] = 0.0F;
                var2[10] = 0.5F;
                var2[8] = 0.0F;
                var2[6] = 0.0F;
                var2[9] = 0.0F;
                var2[7] = 0.0F;
                var2[2] = 0.0F;
                var2[14] = 0.5F;
                var2[12] = -1.0F;
                var2[5] = -2.0F / (float) this.field4959;
            } else {
                var2[0] = 1.0F;
                var2[7] = 0.0F;
                var2[8] = 0.0F;
                var2[4] = 0.0F;
                var2[5] = 1.0F;
                var2[1] = 0.0F;
                var2[3] = 0.0F;
                var2[15] = 1.0F;
                var2[6] = 0.0F;
                var2[9] = 0.0F;
                var2[10] = 1.0F;
                var2[2] = 0.0F;
                var2[13] = 0.0F;
                var2[11] = 0.0F;
                var2[14] = 0.0F;
                var2[12] = 0.0F;
            }
        }
    }

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "()Z")
    public final boolean method376() {
        ++field4921;
        return false;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IZ)V")
    public final void method2142(int arg0, boolean arg1) {
        if (arg0 != 0) {
            this.method2141(-123);
        }
        if (!arg1 != !this.field5112) {
            this.field5112 = arg1;
            this.method1318(0);
            this.field5125 &= -32;
        }
        ++field4997;
    }

    @OriginalMember(owner = "client!uv", name = "p", descriptor = "()Z")
    public final boolean method419() {
        ++field4929;
        return true;
    }

    @OriginalMember(owner = "client!uv", name = "KA", descriptor = "(IIII)V")
    public final void method426(int arg0, int arg1, int arg2, int arg3) {
        ++field4934;
        if (~arg0 >= -1 && this.field4913 + -1 <= arg2 && arg1 <= 0 && this.field4959 - 1 <= arg3) {
            this.method406();
        } else {
            this.field5094 = arg0 >= 0 ? arg0 : 0;
            this.field5067 = ~arg2 < ~this.field4913 ? 0 : arg2;
            this.field5050 = arg1 < 0 ? 0 : arg1;
            this.field5130 = this.field4913 < arg3 ? 0 : arg3;
            if (!this.field5164) {
                this.field5164 = true;
                this.method1314((byte) -122);
            }
            this.method1295(28976);
            this.method2172((byte) 32);
        }
    }

    @OriginalMember(owner = "client!uv", name = "n", descriptor = "(B)I")
    public final int method2143(byte arg0) {
        if (arg0 <= 88) {
            this.method2127(22);
        }
        ++field5021;
        return this.field5049;
    }

    @OriginalMember(owner = "client!uv", name = "o", descriptor = "(B)V")
    public abstract void method1323(byte arg0);

    @OriginalMember(owner = "client!uv", name = "p", descriptor = "(B)V")
    private final void method2144(byte arg0) {
        if (arg0 != -117) {
            this.field5042 = false;
        }
        if (!this.field5062) {
            float[] var2 = this.field5096;
            float var3 = (float) this.field5132;
            float var4 = (float) this.field5097;
            float var5 = (float) (-this.field5079) * this.field5053 / (float) this.field5081;
            float var6 = (float) (-this.field5137) * this.field5053 / (float) this.field5085;
            float var7 = (float) (-this.field5137 + this.field4913) * this.field5053 / (float) this.field5085;
            float var8 = (float) (this.field4959 - this.field5079) * this.field5053 / (float) this.field5081;
            if (var6 != var7 && var5 != var8) {
                var2[5] = 2.0F / (-var5 + var8);
                var2[0] = 2.0F / (-var6 + var7);
                var2[10] = 1.0F / (var3 - var4);
                var2[11] = 0.0F;
                var2[2] = 0.0F;
                var2[9] = 0.0F;
                var2[4] = 0.0F;
                var2[8] = 0.0F;
                var2[7] = 0.0F;
                var2[6] = 0.0F;
                var2[3] = 0.0F;
                var2[12] = (var6 + var7) / (-var7 + var6);
                var2[14] = var3 / (var3 - var4);
                var2[15] = 1.0F;
                var2[1] = 0.0F;
                var2[13] = (var5 + var8) / (-var5 + var8);
            } else {
                var2[9] = 0.0F;
                var2[15] = 1.0F;
                var2[0] = 1.0F;
                var2[7] = 0.0F;
                var2[3] = 0.0F;
                var2[13] = 0.0F;
                var2[2] = 0.0F;
                var2[12] = 0.0F;
                var2[10] = 1.0F;
                var2[11] = 0.0F;
                var2[4] = 0.0F;
                var2[8] = 0.0F;
                var2[1] = 0.0F;
                var2[5] = 1.0F;
                var2[6] = 0.0F;
                var2[14] = 0.0F;
            }
            this.method2132(-20711);
            this.field5062 = true;
        }
        ++field4972;
    }

    @OriginalMember(owner = "client!uv", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method380(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field4868;
        boolean var7 = this.field5115 != arg0;
        if (var7 || this.field5122 != arg1 || this.field5086 != arg2) {
            this.field5086 = arg2;
            this.field5115 = arg0;
            this.field5122 = arg1;
            if (var7) {
                this.field5103 = (float) (this.field5115 & 16711680) / 1.671168E7F;
                this.field5041 = (float) (this.field5115 & 65280) / 65280.0F;
                this.field5083 = (float) (this.field5115 & 255) / 255.0F;
                this.method1313(-24391);
            }
            this.field4908.setSunColour(this.field5103, this.field5041, this.field5083, arg1, arg2);
            this.method1335((byte) -103);
        }
        if (this.field5119[0] != arg3 || this.field5119[1] != arg4 || this.field5119[2] != arg5) {
            this.field5119[2] = arg5;
            this.field5119[0] = arg3;
            this.field5119[1] = arg4;
            this.field5121[1] = -arg4;
            this.field5121[0] = -arg3;
            this.field5121[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field5088[1] = arg4 * var8;
            this.field5088[2] = arg5 * var8;
            this.field5088[0] = arg3 * var8;
            this.field5064[2] = -this.field5088[2];
            this.field5064[1] = -this.field5088[1];
            this.field5064[0] = -this.field5088[0];
            this.field4908.setSunDirection(this.field5088[0], this.field5088[1], this.field5088[2]);
            this.method1312((byte) 80);
            this.field5056 = (int) (arg3 * 256.0F / arg4);
            this.field5044 = (int) (arg5 * 256.0F / arg4);
        }
        this.method1286(72);
    }

    @OriginalMember(owner = "client!uv", name = "i", descriptor = "(II)V")
    public final void method2145(int arg0, int arg1) {
        if (arg1 > 68) {
            if (this.field5124 != arg0) {
                boolean var3;
                class89 var4;
                boolean var5;
                if (arg0 == 1) {
                    var3 = true;
                    var4 = class278.field3705;
                    var5 = true;
                } else if (~arg0 != -3) {
                    if (~arg0 == -129) {
                        var4 = class258.field3381;
                        var5 = true;
                        var3 = true;
                    } else {
                        var4 = class516.field6964;
                        var3 = false;
                        var5 = false;
                    }
                } else {
                    var3 = false;
                    var4 = class129.field1674;
                    var5 = true;
                }
                if (!var3 == this.field5091) {
                    this.field5091 = var3;
                    this.method1288(0);
                }
                if (this.field5052 != var5) {
                    this.field5052 = var5;
                    this.method1337(52);
                }
                if (this.field5117 != var4) {
                    this.field5117 = var4;
                    this.method1342((byte) -118);
                }
                this.field5125 &= -29;
                this.field5124 = arg0;
            }
            ++field4939;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lpf;I)V")
    public final void method397(class583 arg0, int arg1) {
        this.field5126.method894((byte) -108, arg0, arg1, this);
        ++field4914;
    }

    @OriginalMember(owner = "client!uv", name = "M", descriptor = "()I")
    public final int method446() {
        ++field4998;
        return this.field5163;
    }

    @OriginalMember(owner = "client!uv", name = "DA", descriptor = "(IIII)V")
    public final void method354(int arg0, int arg1, int arg2, int arg3) {
        this.field5085 = arg2;
        ++field4872;
        this.field5079 = arg1;
        this.field5137 = arg0;
        this.field5081 = arg3;
        this.method2166((byte) 121);
        this.method2108(10886);
        this.method2138((byte) 125);
        this.method2172((byte) 32);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Ldi;)V")
    public final void method387(class128 arg0) {
        ++field4881;
        this.field5106 = (class81) arg0;
    }

    @OriginalMember(owner = "client!uv", name = "la", descriptor = "()V")
    public final void method406() {
        this.field5050 = 0;
        this.field5094 = 0;
        ++field5027;
        this.field5067 = this.field4913;
        this.field5130 = this.field4959;
        if (this.field5164) {
            this.field5164 = false;
            this.method1314((byte) -122);
        }
        this.method2172((byte) 32);
    }

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "(IIIIII)Ldi;")
    public final class128 method424(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4963;
        return new class185(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!uv", name = "q", descriptor = "(B)V")
    public final void method2146(byte arg0) {
        this.method2177(false, 2, class401.field5677);
        ++field5022;
        int var2 = 48 % ((-22 - arg0) / 62);
    }

    @OriginalMember(owner = "client!uv", name = "J", descriptor = "(I)V")
    private final void method2147(int arg0) {
        if (arg0 != 1) {
            this.field5140 = 58;
        }
        if (this.field4875 == null) {
            this.field5023 = this.field4990 = 1;
        } else {
            Dimension var2 = this.field4875.getSize();
            this.field5023 = var2.width;
            this.field4990 = var2.height;
        }
        ++field4896;
        this.field4913 = this.field5023;
        this.field4959 = this.field4990;
        this.method2164(-12545);
        this.method2108(arg0 + 10885);
        this.method2166((byte) 115);
        this.method1291(-11155);
        this.method2172((byte) 32);
        this.method2138((byte) 125);
        this.method406();
    }

    @OriginalMember(owner = "client!uv", name = "g", descriptor = "(I)V")
    public final void method395(int arg0) {
        ++field5019;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!uv", name = "r", descriptor = "(B)V")
    public abstract void method1335(byte arg0);

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lbl;I)V")
    public final void method2148(class649 arg0, int arg1) {
        int var3 = -43 / ((-60 - arg1) / 51);
        if (this.field5109[this.field5071] != arg0) {
            this.field5109[this.field5071] = arg0;
            if (arg0 != null) {
                arg0.method1468(101);
            } else {
                this.method1327(0);
            }
            this.field5125 &= -2;
        }
        ++field5013;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IILkt;BLkq;)Ljs;")
    public abstract class334 method1307(int arg0, int arg1, class159 arg2, byte arg3, class594 arg4);

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "(Z)V")
    public abstract void method1279(boolean arg0);

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lqc;B)V")
    public final void method2149(class743 arg0, byte arg1) {
        ++field4863;
        this.field5136[this.field5071] = arg0;
        if (arg1 >= 25) {
            this.method2152(105);
        }
    }

    @OriginalMember(owner = "client!uv", name = "K", descriptor = "(I)V")
    public abstract void method1295(int arg0);

    @OriginalMember(owner = "client!uv", name = "L", descriptor = "(I)V")
    public abstract void method1280(int arg0);

    @OriginalMember(owner = "client!uv", name = "M", descriptor = "(I)V")
    public abstract void method1341(int arg0);

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class281 method344(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field4999;
        return new class560(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIB[IZ)Ljs;")
    public final class334 method2150(int arg0, int arg1, byte arg2, int[] arg3, boolean arg4) {
        if (arg2 != 31) {
            this.field5090 = null;
        }
        ++field4922;
        return this.method1317(0, (byte) 126, arg3, arg4, arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!uv", name = "y", descriptor = "()Z")
    public final boolean method456() {
        ++field4928;
        return this.field5051;
    }

    @OriginalMember(owner = "client!uv", name = "L", descriptor = "(III)V")
    public final void method442(int arg0, int arg1, int arg2) {
        if (~this.field5128 != ~arg0 || this.field5073 != arg1 || ~this.field5093 != ~arg2) {
            this.field5128 = arg0;
            this.field5093 = arg2;
            this.field5073 = arg1;
            this.method2157(-123);
            this.method1323((byte) 112);
        }
        ++field4886;
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(ZI)V")
    public final void method2151(boolean arg0, int arg1) {
        ++field5005;
        if (this.field5069 != arg0) {
            this.field5069 = arg0;
            this.method1343(arg1 + -2103);
            this.field5125 &= -32;
        }
        if (arg1 != 2103) {
            this.field5134 = -1.3455139F;
        }
    }

    @OriginalMember(owner = "client!uv", name = "N", descriptor = "(I)V")
    private final void method2152(int arg0) {
        ++field4910;
        this.method1280(-107);
        if (this.field5090 != null) {
            this.field5090.method657(8);
        }
        if (arg0 <= 37) {
            this.field5029 = 2;
        }
    }

    @OriginalMember(owner = "client!uv", name = "HA", descriptor = "(IIII[I)V")
    public final void method436(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field4982;
        float var6 = this.field5035.method3663((float) arg1, (float) arg2, (float) arg0, false);
        if (!((float) this.field5132 > var6) && !(var6 > (float) this.field5097)) {
            int var7 = (int) ((float) this.field5085 * this.field5035.method3654((float) arg2, (float) arg0, (float) arg1, 118) / (float) arg3);
            int var8 = (int) ((float) this.field5081 * this.field5035.method3667((float) arg1, (float) arg0, (float) arg2, true) / (float) arg3);
            arg4[0] = (int) ((float) var7 + -this.field5133);
            arg4[1] = (int) ((float) var8 + -this.field5102);
            arg4[2] = (int) var6;
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!uv", name = "Y", descriptor = "()[I")
    public final int[] method453() {
        ++field4943;
        return new int[] { this.field5137, this.field5079, this.field5085, this.field5081 };
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(IB)V")
    public final void method2153(int arg0, byte arg1) {
        ++field4919;
        int var3 = 51 % ((arg1 - -37) / 58);
        if (arg0 != 1) {
            if (arg0 != 0) {
                if (arg0 == 2) {
                    this.method2156(class365.field4838, class94.field1233, 22831);
                } else {
                    if (~arg0 != -4) {
                        if (~arg0 == -5) {
                            this.method2156(class308.field4182, class308.field4182, 22831);
                            return;
                        }
                    } else {
                        this.method2156(class199.field2365, class669.field9307, 22831);
                    }
                }
            } else {
                this.method2156(class199.field2365, class199.field2365, 22831);
            }
        } else {
            this.method2156(class365.field4838, class365.field4838, 22831);
        }
    }

    @OriginalMember(owner = "client!uv", name = "s", descriptor = "(B)V")
    public abstract void method1342(byte arg0);

    @OriginalMember(owner = "client!uv", name = "t", descriptor = "(B)I")
    public final int method2154(byte arg0) {
        ++field4906;
        if (arg0 != 67) {
            this.method383();
        }
        return this.field5092;
    }

    @OriginalMember(owner = "client!uv", name = "JA", descriptor = "(IIIIII)I")
    public final int method403(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4883;
        int var7 = 0;
        float var8 = (float) arg2 * this.field5035.field9016 + (float) arg0 * this.field5035.field9027 + (float) arg1 * this.field5035.field9048 + this.field5035.field9015;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field5035.field9016 + (float) arg3 * this.field5035.field9027 + (float) arg4 * this.field5035.field9048 + this.field5035.field9015;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field5132 && var9 < (float) this.field5132) {
            var7 |= 16;
        } else if (var8 > (float) this.field5097 && var9 > (float) this.field5097) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field5035.field9021 + (float) arg0 * this.field5035.field9047 + (float) arg1 * this.field5035.field9045 + this.field5035.field9012) * (float) this.field5085 / var8);
        int var11 = (int) (((float) arg5 * this.field5035.field9021 + (float) arg3 * this.field5035.field9047 + (float) arg4 * this.field5035.field9045 + this.field5035.field9012) * (float) this.field5085 / var9);
        if ((float) var10 < this.field5133 && (float) var11 < this.field5133) {
            var7 |= 1;
        } else if (this.field5139 < (float) var10 && (float) var11 > this.field5139) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field5035.field9039 + (float) arg0 * this.field5035.field9058 + (float) arg1 * this.field5035.field9022 + this.field5035.field9037) * (float) this.field5081 / var8);
        int var13 = (int) (((float) arg5 * this.field5035.field9039 + (float) arg3 * this.field5035.field9058 + (float) arg4 * this.field5035.field9022 + this.field5035.field9037) * (float) this.field5081 / var9);
        if (this.field5102 > (float) var12 && this.field5102 > (float) var13) {
            var7 |= 4;
        } else if ((float) var12 > this.field5076 && this.field5076 < (float) var13) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!uv", name = "u", descriptor = "(B)I")
    public final int method2155(byte arg0) {
        if (arg0 < 78) {
            this.field5116 = null;
        }
        ++field5006;
        return this.field5110;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lil;Lil;I)V")
    public final void method2156(class7 arg0, class7 arg1, int arg2) {
        ++field4848;
        boolean var4 = false;
        if (arg2 == 22831) {
            if (this.field5077[this.field5071] != arg1) {
                this.field5077[this.field5071] = arg1;
                this.method1341(2);
                var4 = true;
            }
            if (this.field5131[this.field5071] != arg0) {
                this.field5131[this.field5071] = arg0;
                this.method1326((byte) -48);
                var4 = true;
            }
            if (var4) {
                this.field5125 &= -30;
            }
        }
    }

    @OriginalMember(owner = "client!uv", name = "A", descriptor = "(ILaa;II)V")
    public final void method365(int arg0, class487 arg1, int arg2, int arg3) {
        ++field4935;
        class133 var5 = (class133) arg1;
        class334 var6 = var5.field1705;
        this.method2175(false);
        this.method2148(var6, 95);
        this.method2145(1, 100);
        this.method2156(class365.field4838, class365.field4838, 22831);
        this.method2174(0, -60, class421.field5897);
        this.method2134(2, arg0);
        this.field5034.method3665((float) this.field4959, (byte) -110, (float) this.field4913, 0.0F);
        this.method2103(1);
        this.field5101[0].method3665(var6.method1688(-8473, (float) this.field4959), (byte) -128, var6.method1692((byte) 115, (float) this.field4913), 1.0F);
        this.field5101[0].method3669(-94, var6.method1688(-8473, (float) (-arg3)), 0.0F, var6.method1692((byte) -124, (float) (-arg2)));
        this.field5136[0] = class536.field7270;
        this.method2152(113);
        this.method2146((byte) -104);
        this.method2135(2);
        this.method2174(0, -58, class71.field769);
    }

    @OriginalMember(owner = "client!uv", name = "j", descriptor = "()V")
    public void method383() {
        if (!this.field5042) {
            for (class55 var1 = this.field4964.method724(32); var1 != null; var1 = this.field4964.method723(126)) {
                ((class625) var1).method3535((byte) 41);
            }
            Enumeration var2 = this.field4860.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method1305(0, this.field4860.get(var3), var3);
            }
            class360.method2067(true, 125, false);
            this.field4908.release();
            this.field5042 = true;
        }
        ++field5011;
    }

    @OriginalMember(owner = "client!uv", name = "O", descriptor = "(I)V")
    private final void method2157(int arg0) {
        if (this.field5090 != null) {
            this.field5090.method654(-59);
        }
        ++field4864;
        this.method1279(false);
        if (arg0 > -110) {
            this.field5113 = false;
        }
    }

    @OriginalMember(owner = "client!uv", name = "x", descriptor = "()I")
    public final int method455() {
        ++field4857;
        return this.field5057 + -2;
    }

    @OriginalMember(owner = "client!uv", name = "da", descriptor = "(III[I)V")
    public final void method422(int arg0, int arg1, int arg2, int[] arg3) {
        ++field4936;
        float var5 = this.field5035.method3663((float) arg1, (float) arg2, (float) arg0, false);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field5079;
            var7 = this.field5137;
        } else {
            var7 = (int) ((float) this.field5085 * this.field5035.method3654((float) arg2, (float) arg0, (float) arg1, 119) / var5);
            var6 = (int) ((float) this.field5081 * this.field5035.method3667((float) arg1, (float) arg0, (float) arg2, true) / var5);
        }
        arg3[1] = (int) ((float) var6 - this.field5102);
        arg3[0] = (int) ((float) var7 - this.field5133);
        arg3[2] = (int) var5;
    }

    @OriginalMember(owner = "client!uv", name = "P", descriptor = "(I)V")
    public abstract void method1282(int arg0);

    @OriginalMember(owner = "client!uv", name = "v", descriptor = "(B)V")
    private final void method2158(byte arg0) {
        this.field5144 = this.method1292(false, 71);
        ++field4988;
        int var2 = -86 / ((arg0 - 38) / 57);
        this.field5144.method1450(-20279, 12, 3096);
        for (int var3 = 0; ~var3 > -5; ++var3) {
            Buffer var4 = this.field5144.method1451(true, (byte) 27);
            if (var4 != null) {
                Stream var5 = this.method2170(24022, var4);
                var5.method3784(0.0F);
                var5.method3784(0.0F);
                var5.method3784(0.0F);
                for (int var6 = 0; ~var6 >= -257; ++var6) {
                    double var7 = (double) (var6 * 2) * 3.141592653589793D / 256.0D;
                    float var9 = (float) Math.cos(var7);
                    float var10 = (float) Math.sin(var7);
                    if (!Stream.method3786()) {
                        var5.method3781(var10);
                        var5.method3781(var9);
                        var5.method3781(0.0F);
                    } else {
                        var5.method3784(var10);
                        var5.method3784(var9);
                        var5.method3784(0.0F);
                    }
                }
                var5.method3795();
                if (this.field5144.method1448(13623)) {
                    break;
                }
            }
        }
        this.field5161 = this.method1316(new class235[] { new class235(class239.field3118) }, 6);
    }

    @OriginalMember(owner = "client!uv", name = "Q", descriptor = "(I)Log;")
    public final class648 method2159(int arg0) {
        ++field4850;
        return arg0 != 1 ? null : this.field5038;
    }

    @OriginalMember(owner = "client!uv", name = "g", descriptor = "(Z)V")
    public static void method2160(boolean arg0) {
        if (arg0) {
            field4918 = null;
        }
    }

    @OriginalMember(owner = "client!uv", name = "w", descriptor = "()Lhba;")
    public final class10 method454() {
        ++field4888;
        return new class648();
    }

    @OriginalMember(owner = "client!uv", name = "w", descriptor = "(B)V")
    public abstract void method1299(byte arg0);

    @OriginalMember(owner = "client!uv", name = "h", descriptor = "(I)V")
    public final void method416(int arg0) {
        ++field4862;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IZBLef;Z)V")
    public abstract void method1334(int arg0, boolean arg1, byte arg2, class488 arg3, boolean arg4);

    @OriginalMember(owner = "client!uv", name = "R", descriptor = "(I)Log;")
    public final class648 method2161(int arg0) {
        ++field4947;
        if (arg0 != 0) {
            return null;
        } else {
            if (!this.field5113) {
                this.field5039.method3658(this.field5037, this.field5034);
                this.field5113 = true;
            }
            return this.field5039;
        }
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(ZB)V")
    public final void method2162(boolean arg0, byte arg1) {
        ++field4866;
        if (!this.field5054 != !arg0) {
            this.field5054 = arg0;
            this.method1323((byte) 112);
            this.field5125 &= -32;
        }
        if (arg1 != -101) {
            this.field5070 = 35;
        }
    }

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "(BZ)V")
    public final void method2163(byte arg0, boolean arg1) {
        if (arg0 > -37) {
            this.method1290((class362) null, 65, (byte) 115, 56);
        }
        ++field4853;
        if (this.field5129 == !arg1) {
            this.field5129 = arg1;
            this.method1294(-5668);
        }
    }

    @OriginalMember(owner = "client!uv", name = "x", descriptor = "(B)V")
    public abstract void method1314(byte arg0);

    @OriginalMember(owner = "client!uv", name = "S", descriptor = "(I)V")
    private final void method2164(int arg0) {
        ++field4932;
        if (arg0 == -12545) {
            this.field5066 = false;
            if (class467.field6467 == this.field5043) {
                this.method2141(arg0 ^ -10634);
                this.method2122(-110);
            }
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "([BZLkt;IIZII)Ljs;")
    public abstract class334 method1319(byte[] arg0, boolean arg1, class159 arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "(II)I")
    public final int method389(int arg0, int arg1) {
        ++field5012;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "(I)V")
    public final void method390(int arg0) {
        ++field5001;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            if (this.field5116 != null) {
                this.field5116.method3509(-3);
            }
            this.field5099 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I[Lcba;)V")
    public final void method449(int arg0, class551[] arg1) {
        ++field4966;
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field5089[var3] = arg1[var3];
        }
        this.field5111 = arg0;
        if (this.field5043.method2843(100)) {
            this.method1333(-14713);
        }
    }

    @OriginalMember(owner = "client!uv", name = "T", descriptor = "(I)V")
    public abstract void method1337(int arg0);

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "([IIIIIZ)Lufa;")
    public final class680 method379(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4895;
        return new class97(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIIZ)Lufa;")
    public final class680 method414(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field4995;
        class97 var6 = new class97(this, arg2, arg3, arg4);
        var6.method662(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!uv", name = "U", descriptor = "(I)[F")
    public final float[] method2165(int arg0) {
        if (arg0 >= -37) {
            method2181(96);
        }
        ++field4967;
        return this.field5074;
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "()Lhba;")
    public final class10 method357() {
        ++field4952;
        return this.field5035;
    }

    @OriginalMember(owner = "client!uv", name = "V", descriptor = "(I)V")
    public void method1333(int arg0) {
        this.field5120 = this.field5111;
        if (arg0 != -14713) {
            this.field5063 = true;
        }
        ++field4877;
        this.field5111 = 0;
    }

    @OriginalMember(owner = "client!uv", name = "h", descriptor = "()Z")
    public final boolean method381() {
        ++field4953;
        return true;
    }

    @OriginalMember(owner = "client!uv", name = "W", descriptor = "(I)V")
    public abstract void method1291(int arg0);

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Loq;IBI)V")
    public abstract void method1290(class362 arg0, int arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!uv", name = "y", descriptor = "(B)V")
    private final void method2166(byte arg0) {
        this.field5062 = false;
        ++field5003;
        if (arg0 >= 103) {
            this.method2144((byte) -117);
            if (class135.field1724 == this.field5043) {
                this.method2122(-107);
            }
        }
    }

    @OriginalMember(owner = "client!uv", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method444(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field4973;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZIIZ)V")
    public final void method2167(boolean arg0, int arg1, int arg2, boolean arg3) {
        if (arg1 != 0) {
            this.field5060 = 0.2778904F;
        }
        ++field4856;
        if (this.field5075 != arg2 || !this.field5059 != !this.field5055) {
            class334 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = !this.field5055 ? 0 : 3;
            if (arg2 < 0) {
                this.method2135(2);
            } else {
                var5 = this.field5116.method3511(0, arg2);
                class335 var10 = super.field636.method925(arg2, arg1 + -28755);
                if (var10.field4525 == 0 && ~var10.field4542 == -1) {
                    this.method2135(2);
                } else {
                    int var11 = !var10.field4524 ? 128 : 64;
                    int var12 = var11 * 50;
                    class648 var13 = this.method2119((byte) 61);
                    var13.method3647(0.0F, 1, (float) (this.field5048 % var12 * var10.field4542) / (float) var12, (float) (this.field5048 % var12 * var10.field4525) / (float) var12);
                    this.method2149(class536.field7270, (byte) 114);
                }
                var6 = var10.field4523;
                if (!this.field5055) {
                    var7 = var10.field4518;
                    var9 = var10.field4522;
                    var8 = var10.field4539;
                }
            }
            this.method2171((byte) -113, var8, var9, arg0, arg3, var7);
            if (this.field5090 == null) {
                this.method2148(var5, 23);
                this.method2153(var6, (byte) 118);
            } else {
                this.field5090.method629(6, var6, var5);
            }
            this.field5075 = arg2;
            this.field5059 = this.field5055;
        }
        this.field5125 &= -8;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "([FI)[F")
    public final float[] method2168(float[] arg0, int arg1) {
        arg0[4] = this.field5058[1];
        ++field4897;
        arg0[8] = this.field5058[2];
        arg0[0] = this.field5058[0];
        arg0[12] = this.field5058[3];
        arg0[5] = this.field5058[5];
        arg0[13] = this.field5058[7];
        if (arg1 != 32227) {
            return null;
        } else {
            arg0[9] = this.field5058[6];
            arg0[2] = this.field5058[8];
            arg0[1] = this.field5058[4];
            arg0[3] = this.field5058[12];
            arg0[10] = this.field5058[10];
            arg0[14] = this.field5058[11];
            arg0[6] = this.field5058[9];
            arg0[7] = this.field5058[13];
            arg0[15] = this.field5058[15];
            arg0[11] = this.field5058[14];
            return arg0;
        }
    }

    @OriginalMember(owner = "client!uv", name = "Y", descriptor = "(I)V")
    private final void method2169(int arg0) {
        ++field4984;
        this.field5159 = this.method1292(true, 117);
        this.field5159.method1450(-20279, 12, 24);
        this.field5145 = this.method1316(new class235[] { new class235(class239.field3118) }, 6);
        if (arg0 >= -62) {
            this.method444(-59, -44, 25, -91, -71, -40, (byte[]) null, 99, 111);
        }
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method399(Canvas arg0) {
        ++field4941;
        if (this.field4971 == arg0) {
            throw new RuntimeException();
        } else if (this.field4860.containsKey(arg0)) {
            this.method1305(0, this.field4860.get(arg0), arg0);
            this.field4860.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!uv", name = "XA", descriptor = "()I")
    public final int method356() {
        ++field4974;
        return this.field5097;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lqa;B)V")
    public abstract void method1330(class251 arg0, byte arg1);

    @OriginalMember(owner = "client!uv", name = "K", descriptor = "([I)V")
    public final void method398(int[] arg0) {
        arg0[0] = this.field5094;
        arg0[2] = this.field5067;
        arg0[1] = this.field5050;
        arg0[3] = this.field5130;
        ++field4890;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "()Z")
    public final boolean method346() {
        ++field4977;
        return this.field5105[3].method634((byte) 27);
    }

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "()Z")
    public final boolean method375() {
        ++field5015;
        return false;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILjaclib/memory/Buffer;)Ljaclib/memory/Stream;")
    public final Stream method2170(int arg0, Buffer arg1) {
        this.field5095.method3789(arg1);
        if (arg0 != 24022) {
            this.field5134 = -2.1684475F;
        }
        ++field4942;
        return this.field5095;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILkt;[BIII)Lff;")
    public abstract class9 method1336(int arg0, class159 arg1, byte[] arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(BIIZZI)V")
    private final void method2171(byte arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        ++field4893;
        boolean var7 = arg3 & this.method346();
        if (!var7 && (~arg2 == -5 || ~arg2 == -9 || ~arg2 == -10)) {
            arg2 = 2;
            arg1 = ~arg2 != -5 ? 1 : 1 & arg5;
            arg5 = 0;
        }
        if (arg0 >= -93) {
            this.method2109((byte) 95, true);
        }
        if (arg2 != 0 && arg4) {
            arg2 |= Integer.MIN_VALUE;
        }
        if (this.field5104 != arg2) {
            if (this.field5104 != 0) {
                this.field5105[Integer.MAX_VALUE & this.field5104].method628(-2);
            }
            if (arg2 != 0) {
                this.field5090 = this.field5105[Integer.MAX_VALUE & arg2];
                this.field5090.method633(69, arg4);
                this.field5090.method632(97, arg4);
                this.field5090.method627(arg5, arg1, -121);
            } else {
                this.field5090 = null;
            }
            this.field5127 = arg5;
            this.field5087 = arg1;
            this.field5104 = arg2;
        } else if (~this.field5104 != -1) {
            this.field5105[this.field5104 & Integer.MAX_VALUE].method632(99, arg4);
            if (~this.field5127 != ~arg5 || ~this.field5087 != ~arg1) {
                this.field5105[Integer.MAX_VALUE & this.field5104].method627(arg5, arg1, -125);
                this.field5127 = arg5;
                this.field5087 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!uv", name = "Z", descriptor = "(I)V")
    public abstract void method1288(int arg0);

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IZBLef;)V")
    public abstract void method1340(int arg0, boolean arg1, byte arg2, class488 arg3);

    @OriginalMember(owner = "client!uv", name = "z", descriptor = "(B)V")
    private final void method2172(byte arg0) {
        this.field5139 = (float) (this.field5067 - this.field5137);
        this.field5102 = (float) (-this.field5079 + this.field5050);
        ++field4993;
        if (arg0 != 32) {
            this.field5141 = null;
        }
        this.field5133 = (float) (this.field5094 - this.field5137);
        this.field5076 = (float) (-this.field5079 + this.field5130);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILog;)V")
    public final void method2173(int arg0, class648 arg1) {
        this.field5034.method25(arg1);
        ++field4892;
        this.field5031 = false;
        this.method2178(arg0);
    }

    @OriginalMember(owner = "client!uv", name = "A", descriptor = "(B)F")
    public abstract float method1283(byte arg0);

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method340(Canvas arg0, int arg1, int arg2) {
        ++field4962;
        if (this.field4971 == arg0) {
            throw new RuntimeException();
        } else if (!this.field4860.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var7) {
                }
                Object var6 = this.method1328(arg0, -8401);
                if (var6 == null) {
                    throw new RuntimeException();
                } else {
                    this.field4860.put(arg0, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method355(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field5000;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "([I)V")
    public final void method420(int[] arg0) {
        arg0[1] = this.field4959;
        ++field4975;
        arg0[0] = this.field4913;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lmv;[Ltw;Z)Lda;")
    public final class61 method425(class377 arg0, class204[] arg1, boolean arg2) {
        ++field5004;
        return new class515(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IILef;)V")
    public final void method2174(int arg0, int arg1, class488 arg2) {
        if (arg1 >= -52) {
            this.method2107((byte) 56);
        }
        this.method1334(arg0, false, (byte) 27, arg2, false);
        ++field4985;
    }

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "(II)I")
    public final int method396(int arg0, int arg1) {
        ++field5002;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!uv", name = "h", descriptor = "(Z)V")
    public final void method2175(boolean arg0) {
        ++field4873;
        if (!arg0) {
            if (~this.field5125 != -3) {
                this.method2139((byte) 103);
                this.method2162(false, (byte) -101);
                this.method2131(false, -82);
                this.method2151(false, 2103);
                this.method2142(0, false);
                this.method2167(false, 0, -2, false);
                this.field5125 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILkt;B[BZI)Ljs;")
    public final class334 method2176(int arg0, class159 arg1, byte arg2, byte[] arg3, boolean arg4, int arg5) {
        if (arg2 != 87) {
            this.method365(16, (class487) null, 0, -16);
        }
        ++field4865;
        return this.method1319(arg3, false, arg1, 0, arg5, arg4, 0, arg0);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(II[I[I)Laa;")
    public final class487 method382(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field4898;
        return class445.method2496(arg1, this, arg0, arg2, 107, arg3);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lpf;)V")
    public final void method452(class583 arg0) {
        this.field5126.method894((byte) -108, arg0, -1, this);
        ++field4979;
    }

    @OriginalMember(owner = "client!uv", name = "E", descriptor = "()I")
    public final int method415() {
        ++field4931;
        return this.field5029 - -this.field5032 - -this.field5030;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZILoq;)V")
    private final void method2177(boolean arg0, int arg1, class362 arg2) {
        if (!arg0) {
            this.method1325(0, true, this.field5152);
            ++field4891;
            this.method1330(this.field5147, (byte) -91);
            this.method1290(arg2, 0, (byte) 44, arg1);
        }
    }

    @OriginalMember(owner = "client!uv", name = "s", descriptor = "()V")
    public final void method439() {
        if (this.field5116 != null) {
            this.field5116.method3509(-3);
        }
        ++field4871;
    }

    @OriginalMember(owner = "client!uv", name = "P", descriptor = "(IIIII)V")
    public final void method386(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5009;
        this.method412(arg0, arg1, arg0, arg1 - -arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIIII)V")
    public final void method391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4845;
        float var7 = this.method1283((byte) 56);
        this.method2110(1);
        this.method2134(2, arg4);
        this.method2174(0, -73, class421.field5897);
        this.method2116(-95, class421.field5897, 0);
        this.method2145(arg5, 86);
        this.field5034.method3665((float) (arg3 + -1), (byte) -109, (float) (arg2 - 1), 1.0F);
        this.field5034.method3669(-108, (float) arg1 - var7, 0.0F, (float) arg0 + -var7);
        this.method2103(1);
        this.method1338(false, false);
        this.method2177(false, 4, class100.field1321);
        this.method1338(true, false);
        this.method2116(-75, class71.field769, 0);
        this.method2174(0, -106, class71.field769);
    }

    @OriginalMember(owner = "client!uv", name = "ab", descriptor = "(I)V")
    private final void method2178(int arg0) {
        if (class467.field6467 == this.field5043) {
            float var2 = this.method1283((byte) 56);
            this.field5034.method3669(-108, var2, 0.0F, var2);
        }
        ++field4854;
        if (arg0 != 0) {
            this.field5039 = null;
        }
        this.field5113 = false;
        this.method1303((byte) 121);
        if (this.field5090 != null) {
            this.field5090.method655((byte) -112);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IF)V")
    public final void method2179(int arg0, float arg1) {
        ++field4900;
        int var3 = 59 / ((arg0 - -65) / 36);
        if (this.field5053 != arg1) {
            this.field5053 = arg1;
            this.method2166((byte) 118);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method433(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class487 arg6, int arg7, int arg8) {
        ++field4911;
    }

    @OriginalMember(owner = "client!uv", name = "H", descriptor = "(III[I)V")
    public final void method451(int arg0, int arg1, int arg2, int[] arg3) {
        ++field4923;
        float var5 = this.field5035.method3663((float) arg1, (float) arg2, (float) arg0, false);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field5137;
            var7 = this.field5079;
        } else {
            var6 = (int) ((float) this.field5085 * this.field5035.method3654((float) arg2, (float) arg0, (float) arg1, 119) / var5);
            var7 = (int) ((float) this.field5081 * this.field5035.method3667((float) arg1, (float) arg0, (float) arg2, true) / var5);
        }
        arg3[2] = (int) var5;
        arg3[0] = (int) ((float) var6 - this.field5133);
        arg3[1] = (int) ((float) var7 + -this.field5102);
    }

    @OriginalMember(owner = "client!uv", name = "bb", descriptor = "(I)V")
    public abstract void method1296(int arg0);

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
    public abstract Object method1328(Canvas arg0, int arg1);

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZZ)V")
    public abstract void method1338(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "(ZI)Ltea;")
    public abstract class241 method1292(boolean arg0, int arg1);

    @OriginalMember(owner = "client!uv", name = "cb", descriptor = "(I)Log;")
    public final class648 method2180(int arg0) {
        ++field4882;
        if (arg0 != 1) {
            this.field5161 = null;
        }
        return this.field5101[this.field5071];
    }

    @OriginalMember(owner = "client!uv", name = "db", descriptor = "(I)Z")
    public static final boolean method2181(int arg0) {
        ++field4867;
        boolean var1 = true;
        if (arg0 != -4264) {
            method2181(-113);
        }
        if (class132.field1700 == null) {
            if (class97.field1282.method2882(arg0 ^ 4292, class201.field2384)) {
                class132.field1700 = class204.method1127(class97.field1282, class201.field2384);
            } else {
                var1 = false;
            }
        }
        if (class191.field2297 == null) {
            if (!class97.field1282.method2882(arg0 ^ 4347, class735.field10261)) {
                var1 = false;
            } else {
                class191.field2297 = class204.method1127(class97.field1282, class735.field10261);
            }
        }
        if (class39.field405 == null) {
            if (!class97.field1282.method2882(-111, class759.field10573)) {
                var1 = false;
            } else {
                class39.field405 = class204.method1127(class97.field1282, class759.field10573);
            }
        }
        if (class519.field6987 == null) {
            if (class641.field8923.method2882(-94, class468.field6472)) {
                class519.field6987 = class389.method2270(class641.field8923, true, class468.field6472);
            } else {
                var1 = false;
            }
        }
        if (class3.field30 == null) {
            if (!class97.field1282.method2882(-123, class468.field6472)) {
                var1 = false;
            } else {
                class3.field30 = class204.method1128(class97.field1282, class468.field6472);
            }
        }
        return var1;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IB[IZIII)Ljs;")
    public abstract class334 method1317(int arg0, byte arg1, int[] arg2, boolean arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!uv", name = "r", descriptor = "(IIIIIII)I")
    public final int method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4938;
        int var8 = 0;
        float var9 = (float) arg2 * this.field5035.field9016 + (float) arg0 * this.field5035.field9027 + (float) arg1 * this.field5035.field9048 + this.field5035.field9015;
        float var10 = (float) arg5 * this.field5035.field9016 + (float) arg3 * this.field5035.field9027 + (float) arg4 * this.field5035.field9048 + this.field5035.field9015;
        if ((float) this.field5132 > var9 && var10 < (float) this.field5132) {
            var8 |= 16;
        } else if ((float) this.field5097 < var9 && var10 > (float) this.field5097) {
            var8 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field5035.field9021 + (float) arg0 * this.field5035.field9047 + (float) arg1 * this.field5035.field9045 + this.field5035.field9012) * (float) this.field5085 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field5035.field9021 + (float) arg3 * this.field5035.field9047 + (float) arg4 * this.field5035.field9045 + this.field5035.field9012) * (float) this.field5085 / (float) arg6);
        if ((float) var11 < this.field5133 && this.field5133 > (float) var12) {
            var8 |= 1;
        } else if ((float) var11 > this.field5139 && this.field5139 < (float) var12) {
            var8 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field5035.field9039 + (float) arg0 * this.field5035.field9058 + (float) arg1 * this.field5035.field9022 + this.field5035.field9037) * (float) this.field5081 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field5035.field9039 + (float) arg3 * this.field5035.field9058 + (float) arg4 * this.field5035.field9022 + this.field5035.field9037) * (float) this.field5081 / (float) arg6);
        if ((float) var13 < this.field5102 && this.field5102 > (float) var14) {
            var8 |= 4;
        } else if (this.field5076 < (float) var13 && this.field5076 < (float) var14) {
            var8 |= 8;
        }
        return var8;
    }

    @OriginalMember(owner = "client!uv", name = "B", descriptor = "(B)V")
    public final void method2182(byte arg0) {
        if (arg0 != -61) {
            this.field5144 = null;
        }
        ++field4950;
        Hashtable var2 = new Hashtable();
        if (this.field4860 != null && !this.field4860.isEmpty()) {
            Enumeration var3 = this.field4860.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method1328(var4, -8401));
            }
        }
        this.field4860 = var2;
        this.method2140(arg0 ^ -54);
        this.method2169(arg0 ^ 82);
        this.method2158((byte) -107);
        this.field5126.method888(this, (byte) 36);
    }

    @OriginalMember(owner = "client!uv", name = "C", descriptor = "(B)V")
    public abstract void method1312(byte arg0);

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lkt;Z[FZII)Ljs;")
    public final class334 method2183(class159 arg0, boolean arg1, float[] arg2, boolean arg3, int arg4, int arg5) {
        ++field4917;
        if (arg3) {
            this.field5083 = 1.1575497F;
        }
        return this.method1278(0, arg4, arg1, arg0, -8, arg5, 0, arg2);
    }

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "(IB)Lew;")
    public class493 method1298(int arg0, byte arg1) {
        ++field4878;
        int var3 = -120 % ((39 - arg1) / 56);
        if (arg0 != 6) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    return ~arg0 == -8 ? new class161(this) : new class144(this);
                } else {
                    return new class584(this, this.field4945);
                }
            } else {
                return new class479(this);
            }
        } else {
            return new class87(this);
        }
    }
}
