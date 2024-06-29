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

@OriginalClass("client!ln")
public abstract class class377 extends class58 {

    @OriginalMember(owner = "client!ln", name = "lc", descriptor = "Lbq;")
    private class289 field4955 = new class289();

    @OriginalMember(owner = "client!ln", name = "Xd", descriptor = "Z")
    public boolean field5045 = true;

    @OriginalMember(owner = "client!ln", name = "Zd", descriptor = "Lli;")
    public class427 field5047 = new class427();

    @OriginalMember(owner = "client!ln", name = "de", descriptor = "Lli;")
    public class427 field5051 = new class427();

    @OriginalMember(owner = "client!ln", name = "ee", descriptor = "Lli;")
    public class427 field5052 = new class427();

    @OriginalMember(owner = "client!ln", name = "fe", descriptor = "Lli;")
    public class427 field5053 = new class427();

    @OriginalMember(owner = "client!ln", name = "ge", descriptor = "Lli;")
    private class427 field5054 = new class427();

    @OriginalMember(owner = "client!ln", name = "he", descriptor = "Lli;")
    private class427 field5055 = new class427();

    @OriginalMember(owner = "client!ln", name = "me", descriptor = "Lmo;")
    public class746 field5060 = class341.field4403;

    @OriginalMember(owner = "client!ln", name = "ke", descriptor = "I")
    private int field5058 = -1;

    @OriginalMember(owner = "client!ln", name = "le", descriptor = "[Lah;")
    private class384[] field5059 = new class384[10];

    @OriginalMember(owner = "client!ln", name = "te", descriptor = "F")
    public float field5067 = 1.0F;

    @OriginalMember(owner = "client!ln", name = "we", descriptor = "Z")
    public boolean field5070 = true;

    @OriginalMember(owner = "client!ln", name = "xe", descriptor = "Z")
    private boolean field5071 = false;

    @OriginalMember(owner = "client!ln", name = "Ke", descriptor = "F")
    public float field5084 = 3584.0F;

    @OriginalMember(owner = "client!ln", name = "Ce", descriptor = "[F")
    public float[] field5076 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!ln", name = "Me", descriptor = "Z")
    private boolean field5086 = false;

    @OriginalMember(owner = "client!ln", name = "Fe", descriptor = "F")
    public float field5079 = 1.0F;

    @OriginalMember(owner = "client!ln", name = "ve", descriptor = "Z")
    private boolean field5069 = false;

    @OriginalMember(owner = "client!ln", name = "je", descriptor = "Z")
    private boolean field5057 = false;

    @OriginalMember(owner = "client!ln", name = "Xe", descriptor = "I")
    private int field5097 = 0;

    @OriginalMember(owner = "client!ln", name = "mf", descriptor = "Z")
    public boolean field5111 = false;

    @OriginalMember(owner = "client!ln", name = "nf", descriptor = "F")
    public float field5112 = 3584.0F;

    @OriginalMember(owner = "client!ln", name = "ff", descriptor = "[F")
    private float[] field5105 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!ln", name = "Ze", descriptor = "[F")
    private float[] field5099 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!ln", name = "Ne", descriptor = "[F")
    private float[] field5087 = new float[16];

    @OriginalMember(owner = "client!ln", name = "vf", descriptor = "[F")
    private float[] field5120 = new float[16];

    @OriginalMember(owner = "client!ln", name = "Ue", descriptor = "F")
    public float field5094 = -1.0F;

    @OriginalMember(owner = "client!ln", name = "uf", descriptor = "I")
    private int field5119 = 0;

    @OriginalMember(owner = "client!ln", name = "zf", descriptor = "I")
    public int field5124 = 0;

    @OriginalMember(owner = "client!ln", name = "df", descriptor = "I")
    public int field5103 = 3;

    @OriginalMember(owner = "client!ln", name = "Ye", descriptor = "Z")
    public boolean field5098 = false;

    @OriginalMember(owner = "client!ln", name = "He", descriptor = "I")
    public int field5081 = 0;

    @OriginalMember(owner = "client!ln", name = "Bf", descriptor = "I")
    public int field5126 = 512;

    @OriginalMember(owner = "client!ln", name = "jf", descriptor = "[F")
    public float[] field5108 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!ln", name = "ue", descriptor = "[F")
    private float[] field5068 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!ln", name = "Ee", descriptor = "F")
    public float field5078 = 1.0F;

    @OriginalMember(owner = "client!ln", name = "rf", descriptor = "F")
    public float field5116 = 1.0F;

    @OriginalMember(owner = "client!ln", name = "Re", descriptor = "I")
    public int field5091 = 0;

    @OriginalMember(owner = "client!ln", name = "ef", descriptor = "I")
    private int field5104 = -1;

    @OriginalMember(owner = "client!ln", name = "Mf", descriptor = "Lrb;")
    public class352 field5137 = class267.field3321;

    @OriginalMember(owner = "client!ln", name = "Jf", descriptor = "Z")
    public boolean field5134 = true;

    @OriginalMember(owner = "client!ln", name = "Gf", descriptor = "I")
    public int field5131 = 0;

    @OriginalMember(owner = "client!ln", name = "Kf", descriptor = "I")
    public int field5135 = 0;

    @OriginalMember(owner = "client!ln", name = "wf", descriptor = "Z")
    public boolean field5121 = false;

    @OriginalMember(owner = "client!ln", name = "Ef", descriptor = "F")
    private float field5129 = 1.0F;

    @OriginalMember(owner = "client!ln", name = "Sf", descriptor = "I")
    public int field5143 = 0;

    @OriginalMember(owner = "client!ln", name = "kf", descriptor = "I")
    private int field5109 = 1;

    @OriginalMember(owner = "client!ln", name = "qf", descriptor = "I")
    public int field5115 = 512;

    @OriginalMember(owner = "client!ln", name = "Se", descriptor = "I")
    public int field5092 = 3584;

    @OriginalMember(owner = "client!ln", name = "If", descriptor = "I")
    public int field5133 = 128;

    @OriginalMember(owner = "client!ln", name = "sf", descriptor = "I")
    public int field5117 = -1;

    @OriginalMember(owner = "client!ln", name = "re", descriptor = "Z")
    private boolean field5065 = false;

    @OriginalMember(owner = "client!ln", name = "Ge", descriptor = "I")
    private int field5080 = 0;

    @OriginalMember(owner = "client!ln", name = "bf", descriptor = "I")
    private int field5101 = -1;

    @OriginalMember(owner = "client!ln", name = "Hf", descriptor = "[F")
    private float[] field5132 = new float[16];

    @OriginalMember(owner = "client!ln", name = "tf", descriptor = "[F")
    public float[] field5118 = this.field5105;

    @OriginalMember(owner = "client!ln", name = "lf", descriptor = "I")
    public int field5110 = 0;

    @OriginalMember(owner = "client!ln", name = "Of", descriptor = "I")
    private int field5139 = 0;

    @OriginalMember(owner = "client!ln", name = "Lf", descriptor = "Z")
    public boolean field5136 = true;

    @OriginalMember(owner = "client!ln", name = "se", descriptor = "Z")
    public boolean field5066 = true;

    @OriginalMember(owner = "client!ln", name = "Be", descriptor = "I")
    public int field5075 = 0;

    @OriginalMember(owner = "client!ln", name = "Af", descriptor = "Z")
    public boolean field5125 = false;

    @OriginalMember(owner = "client!ln", name = "Te", descriptor = "F")
    public float field5093 = -1.0F;

    @OriginalMember(owner = "client!ln", name = "Qf", descriptor = "I")
    private int field5141 = 16777215;

    @OriginalMember(owner = "client!ln", name = "pe", descriptor = "Z")
    public boolean field5063 = true;

    @OriginalMember(owner = "client!ln", name = "Ff", descriptor = "I")
    public int field5130 = 8;

    @OriginalMember(owner = "client!ln", name = "cf", descriptor = "Z")
    private boolean field5102 = false;

    @OriginalMember(owner = "client!ln", name = "Oe", descriptor = "I")
    public int field5088 = -1;

    @OriginalMember(owner = "client!ln", name = "Rf", descriptor = "I")
    public int field5142 = 0;

    @OriginalMember(owner = "client!ln", name = "Nf", descriptor = "I")
    public int field5138 = 0;

    @OriginalMember(owner = "client!ln", name = "ag", descriptor = "I")
    public int field5151 = 50;

    @OriginalMember(owner = "client!ln", name = "Le", descriptor = "Ljaclib/memory/Stream;")
    private Stream field5085 = new Stream();

    @OriginalMember(owner = "client!ln", name = "vg", descriptor = "Lli;")
    private class427 field5172 = new class427();

    @OriginalMember(owner = "client!ln", name = "zb", descriptor = "Ljava/awt/Canvas;")
    public Canvas field4917;

    @OriginalMember(owner = "client!ln", name = "qb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4908;

    @OriginalMember(owner = "client!ln", name = "Jc", descriptor = "Loh;")
    public class404 field4979;

    @OriginalMember(owner = "client!ln", name = "w", descriptor = "Ljava/lang/Object;")
    public Object field4862;

    @OriginalMember(owner = "client!ln", name = "V", descriptor = "Ljava/lang/Object;")
    private Object field4887;

    @OriginalMember(owner = "client!ln", name = "Wf", descriptor = "I")
    public int field5147;

    @OriginalMember(owner = "client!ln", name = "Ae", descriptor = "I")
    public int field5074;

    @OriginalMember(owner = "client!ln", name = "Ic", descriptor = "I")
    private int field4978;

    @OriginalMember(owner = "client!ln", name = "J", descriptor = "I")
    public int field4875;

    @OriginalMember(owner = "client!ln", name = "Lb", descriptor = "I")
    private int field4929;

    @OriginalMember(owner = "client!ln", name = "ub", descriptor = "I")
    public int field4912;

    @OriginalMember(owner = "client!ln", name = "dg", descriptor = "Lkf;")
    private class253 field5154;

    @OriginalMember(owner = "client!ln", name = "vc", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field4965;

    @OriginalMember(owner = "client!ln", name = "Mb", descriptor = "Z")
    public static boolean field4930 = false;

    @OriginalMember(owner = "client!ln", name = "ne", descriptor = "F")
    private float field5061;

    @OriginalMember(owner = "client!ln", name = "ye", descriptor = "F")
    public float field5072;

    @OriginalMember(owner = "client!ln", name = "De", descriptor = "F")
    public float field5077;

    @OriginalMember(owner = "client!ln", name = "Pe", descriptor = "F")
    public float field5089;

    @OriginalMember(owner = "client!ln", name = "gf", descriptor = "F")
    public float field5106;

    @OriginalMember(owner = "client!ln", name = "Vf", descriptor = "F")
    private float field5146;

    @OriginalMember(owner = "client!ln", name = "cg", descriptor = "F")
    public float field5153;

    @OriginalMember(owner = "client!ln", name = "fg", descriptor = "F")
    public float field5156;

    @OriginalMember(owner = "client!ln", name = "v", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!ln", name = "x", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!ln", name = "y", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!ln", name = "z", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!ln", name = "A", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!ln", name = "B", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!ln", name = "C", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!ln", name = "D", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!ln", name = "E", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!ln", name = "F", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!ln", name = "G", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!ln", name = "H", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!ln", name = "I", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!ln", name = "K", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!ln", name = "L", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!ln", name = "M", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!ln", name = "N", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!ln", name = "O", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!ln", name = "P", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!ln", name = "Q", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!ln", name = "R", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!ln", name = "S", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!ln", name = "T", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!ln", name = "U", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!ln", name = "W", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!ln", name = "X", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!ln", name = "Y", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!ln", name = "Z", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!ln", name = "ab", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!ln", name = "bb", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!ln", name = "cb", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!ln", name = "db", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!ln", name = "eb", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!ln", name = "fb", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!ln", name = "gb", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!ln", name = "hb", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!ln", name = "ib", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!ln", name = "jb", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!ln", name = "kb", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!ln", name = "lb", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!ln", name = "mb", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!ln", name = "nb", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!ln", name = "pb", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!ln", name = "rb", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!ln", name = "sb", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!ln", name = "tb", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!ln", name = "vb", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!ln", name = "wb", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!ln", name = "xb", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!ln", name = "yb", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!ln", name = "Ab", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!ln", name = "Bb", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!ln", name = "Cb", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!ln", name = "Db", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!ln", name = "Eb", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!ln", name = "Fb", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!ln", name = "Gb", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!ln", name = "Hb", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!ln", name = "Ib", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!ln", name = "Jb", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!ln", name = "Kb", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!ln", name = "Nb", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!ln", name = "Ob", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!ln", name = "Pb", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!ln", name = "Rb", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!ln", name = "Sb", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!ln", name = "Tb", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!ln", name = "Ub", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!ln", name = "Vb", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!ln", name = "Wb", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!ln", name = "Xb", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!ln", name = "Yb", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!ln", name = "Zb", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!ln", name = "ac", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!ln", name = "bc", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!ln", name = "cc", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!ln", name = "dc", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!ln", name = "ec", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!ln", name = "fc", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!ln", name = "gc", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!ln", name = "hc", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!ln", name = "ic", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!ln", name = "jc", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!ln", name = "kc", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!ln", name = "mc", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!ln", name = "nc", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!ln", name = "oc", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!ln", name = "pc", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!ln", name = "qc", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!ln", name = "rc", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!ln", name = "sc", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!ln", name = "tc", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!ln", name = "uc", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!ln", name = "wc", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!ln", name = "xc", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!ln", name = "yc", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!ln", name = "zc", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!ln", name = "Ac", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!ln", name = "Bc", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!ln", name = "Cc", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!ln", name = "Dc", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!ln", name = "Ec", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!ln", name = "Fc", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!ln", name = "Gc", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!ln", name = "Hc", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!ln", name = "Kc", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!ln", name = "Lc", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!ln", name = "Mc", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!ln", name = "Nc", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!ln", name = "Oc", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!ln", name = "Pc", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!ln", name = "Qc", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!ln", name = "Rc", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!ln", name = "Sc", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!ln", name = "Tc", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!ln", name = "Uc", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!ln", name = "Vc", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!ln", name = "Wc", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!ln", name = "Xc", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!ln", name = "Yc", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!ln", name = "Zc", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!ln", name = "ad", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!ln", name = "bd", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!ln", name = "cd", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!ln", name = "dd", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!ln", name = "ed", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!ln", name = "fd", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!ln", name = "gd", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!ln", name = "hd", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!ln", name = "id", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!ln", name = "jd", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!ln", name = "kd", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!ln", name = "ld", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!ln", name = "md", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!ln", name = "nd", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!ln", name = "od", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!ln", name = "pd", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!ln", name = "qd", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!ln", name = "rd", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!ln", name = "sd", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!ln", name = "td", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!ln", name = "ud", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!ln", name = "vd", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!ln", name = "wd", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!ln", name = "xd", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!ln", name = "yd", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!ln", name = "zd", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!ln", name = "Ad", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!ln", name = "Bd", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!ln", name = "Cd", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!ln", name = "Dd", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!ln", name = "Ed", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!ln", name = "Fd", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!ln", name = "Gd", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!ln", name = "Hd", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!ln", name = "Id", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!ln", name = "Jd", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!ln", name = "Kd", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!ln", name = "Ld", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!ln", name = "Md", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!ln", name = "Nd", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!ln", name = "Pd", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!ln", name = "Qd", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!ln", name = "Rd", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!ln", name = "Sd", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!ln", name = "Td", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!ln", name = "Ud", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!ln", name = "Vd", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!ln", name = "Wd", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!ln", name = "Yd", descriptor = "I")
    public int field5046;

    @OriginalMember(owner = "client!ln", name = "ae", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!ln", name = "be", descriptor = "I")
    public int field5049;

    @OriginalMember(owner = "client!ln", name = "ce", descriptor = "I")
    public int field5050;

    @OriginalMember(owner = "client!ln", name = "ie", descriptor = "I")
    public int field5056;

    @OriginalMember(owner = "client!ln", name = "ze", descriptor = "I")
    public int field5073;

    @OriginalMember(owner = "client!ln", name = "Je", descriptor = "I")
    public int field5083;

    @OriginalMember(owner = "client!ln", name = "Qe", descriptor = "I")
    private int field5090;

    @OriginalMember(owner = "client!ln", name = "We", descriptor = "I")
    public int field5096;

    @OriginalMember(owner = "client!ln", name = "pf", descriptor = "I")
    public int field5114;

    @OriginalMember(owner = "client!ln", name = "Tf", descriptor = "I")
    public int field5144;

    @OriginalMember(owner = "client!ln", name = "Xf", descriptor = "I")
    public int field5148;

    @OriginalMember(owner = "client!ln", name = "bg", descriptor = "I")
    public int field5152;

    @OriginalMember(owner = "client!ln", name = "eg", descriptor = "I")
    private int field5155;

    @OriginalMember(owner = "client!ln", name = "Cg", descriptor = "I")
    private int field5179;

    @OriginalMember(owner = "client!ln", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!ln", name = "hg", descriptor = "Leea;")
    public class132 field5158;

    @OriginalMember(owner = "client!ln", name = "ig", descriptor = "Leea;")
    public class132 field5159;

    @OriginalMember(owner = "client!ln", name = "jg", descriptor = "Leea;")
    public class132 field5160;

    @OriginalMember(owner = "client!ln", name = "lg", descriptor = "Leea;")
    public class132 field5162;

    @OriginalMember(owner = "client!ln", name = "ng", descriptor = "Leea;")
    public class132 field5164;

    @OriginalMember(owner = "client!ln", name = "pg", descriptor = "Leea;")
    public class132 field5166;

    @OriginalMember(owner = "client!ln", name = "tg", descriptor = "Leea;")
    public class132 field5170;

    @OriginalMember(owner = "client!ln", name = "ug", descriptor = "Leea;")
    public class132 field5171;

    @OriginalMember(owner = "client!ln", name = "xg", descriptor = "Leea;")
    public class132 field5174;

    @OriginalMember(owner = "client!ln", name = "Ag", descriptor = "Leea;")
    public class132 field5177;

    @OriginalMember(owner = "client!ln", name = "hf", descriptor = "Lcw;")
    private class180 field5107;

    @OriginalMember(owner = "client!ln", name = "ob", descriptor = "Lwt;")
    public class309 field4906;

    @OriginalMember(owner = "client!ln", name = "oe", descriptor = "Lfha;")
    private class378 field5062;

    @OriginalMember(owner = "client!ln", name = "Df", descriptor = "Lah;")
    private class384 field5128;

    @OriginalMember(owner = "client!ln", name = "qg", descriptor = "Lkga;")
    private class543 field5167;

    @OriginalMember(owner = "client!ln", name = "gg", descriptor = "Lel;")
    private class545 field5157;

    @OriginalMember(owner = "client!ln", name = "og", descriptor = "Lel;")
    private class545 field5165;

    @OriginalMember(owner = "client!ln", name = "yg", descriptor = "Lel;")
    private class545 field5175;

    @OriginalMember(owner = "client!ln", name = "Yf", descriptor = "Lke;")
    public class596 field5149;

    @OriginalMember(owner = "client!ln", name = "kg", descriptor = "Lf;")
    public class753 field5161;

    @OriginalMember(owner = "client!ln", name = "mg", descriptor = "Lf;")
    private class753 field5163;

    @OriginalMember(owner = "client!ln", name = "rg", descriptor = "Lf;")
    private class753 field5168;

    @OriginalMember(owner = "client!ln", name = "sg", descriptor = "Lf;")
    public class753 field5169;

    @OriginalMember(owner = "client!ln", name = "wg", descriptor = "Lf;")
    public class753 field5173;

    @OriginalMember(owner = "client!ln", name = "zg", descriptor = "Lf;")
    private class753 field5176;

    @OriginalMember(owner = "client!ln", name = "Bg", descriptor = "Lf;")
    public class753 field5178;

    @OriginalMember(owner = "client!ln", name = "Qb", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field4934;

    @OriginalMember(owner = "client!ln", name = "Od", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field5036;

    @OriginalMember(owner = "client!ln", name = "u", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field4860;

    @OriginalMember(owner = "client!ln", name = "qe", descriptor = "Z")
    public boolean field5064;

    @OriginalMember(owner = "client!ln", name = "Ie", descriptor = "Z")
    public boolean field5082;

    @OriginalMember(owner = "client!ln", name = "of", descriptor = "Z")
    public boolean field5113;

    @OriginalMember(owner = "client!ln", name = "yf", descriptor = "Z")
    public boolean field5123;

    @OriginalMember(owner = "client!ln", name = "Uf", descriptor = "Z")
    public boolean field5145;

    @OriginalMember(owner = "client!ln", name = "Dg", descriptor = "Z")
    public boolean field5180;

    @OriginalMember(owner = "client!ln", name = "xf", descriptor = "[Lada;")
    public class163[] field5122;

    @OriginalMember(owner = "client!ln", name = "Cf", descriptor = "[Lbga;")
    public class356[] field5127;

    @OriginalMember(owner = "client!ln", name = "Zf", descriptor = "[Lbga;")
    public class356[] field5150;

    @OriginalMember(owner = "client!ln", name = "Pf", descriptor = "[Lli;")
    public class427[] field5140;

    @OriginalMember(owner = "client!ln", name = "af", descriptor = "[Lmk;")
    public class54[] field5100;

    @OriginalMember(owner = "client!ln", name = "Ve", descriptor = "[Lke;")
    private class596[] field5095;

    @OriginalMember(owner = "client!ln", name = "T", descriptor = "(IIII)V")
    public final void method438(int arg0, int arg1, int arg2, int arg3) {
        ++field4891;
        boolean var5 = false;
        if (~this.field5081 > ~arg0) {
            var5 = true;
            this.field5081 = arg0;
        }
        if (~this.field5143 < ~arg2) {
            this.field5143 = arg2;
            var5 = true;
        }
        if (~arg1 < ~this.field5142) {
            this.field5142 = arg1;
            var5 = true;
        }
        if (this.field5110 > arg3) {
            this.field5110 = arg3;
            var5 = true;
        }
        if (var5) {
            if (!this.field5180) {
                this.field5180 = true;
                this.method2305((byte) 86);
            }
            this.method2291(11317);
            this.method2244(-26536);
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(B)V")
    public static final void method2191(byte arg0) {
        ++field4897;
        if (arg0 > -42) {
            field4930 = false;
        }
        for (class1 var1 = (class1) class105.field1093.method1719(65280); var1 != null; var1 = (class1) class105.field1093.method1723(-20665)) {
            class160 var2 = var1.field2;
            if (!var2.field1771) {
                if (class392.field5398 >= var2.field1764) {
                    var2.method984(class721.field10119, -110);
                    if (var2.field1771) {
                        var1.method864(12983);
                    } else {
                        class264.method1594(var2, true);
                    }
                }
            } else {
                var1.method864(12983);
                var2.method981(-22737);
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lwd;Ljm;Z)Z")
    public abstract boolean method2192(class272 arg0, class687 arg1, boolean arg2);

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(B)V")
    private final void method2193(byte arg0) {
        ++field5029;
        int var2 = -3 % ((arg0 - 5) / 51);
        if (this.field5128 != null) {
            this.field5128.method528((byte) 37);
        }
        this.method2210((byte) 125);
    }

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "()Ldfa;")
    public final class165 method352() {
        ++field4919;
        return new class427();
    }

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "(B)V")
    private final void method2194(byte arg0) {
        ++field4987;
        this.method2301(true, this.field5157, 0);
        this.method2285(1, this.field5168);
        int var2 = -29 / ((-35 - arg0) / 46);
        this.method2209(0, 0, 1, class103.field1078);
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(Z)V")
    public abstract void method2195(boolean arg0);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "([I)V")
    public final void method372(int[] arg0) {
        arg0[0] = this.field4912;
        arg0[1] = this.field4875;
        ++field4918;
    }

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "(II)Lah;")
    public class384 method2196(int arg0, int arg1) {
        ++field5026;
        if (arg0 >= -7) {
            return null;
        } else if (arg1 != 6) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    return ~arg1 == -8 ? new class604(this) : new class226(this);
                } else {
                    return new class607(this, this.field4906);
                }
            } else {
                return new class259(this);
            }
        } else {
            return new class7(this);
        }
    }

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "(B)V")
    public abstract void method2197(byte arg0);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field5032;
    }

    @OriginalMember(owner = "client!ln", name = "w", descriptor = "()Z")
    public final boolean method421() {
        ++field4874;
        return true;
    }

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "(B)V")
    public abstract void method2198(byte arg0);

    @OriginalMember(owner = "client!ln", name = "EA", descriptor = "(IIII)V")
    public final void method355(int arg0, int arg1, int arg2, int arg3) {
        ++field4947;
        if (!this.field5145) {
            throw new RuntimeException("");
        } else {
            this.field5104 = arg2;
            this.field5119 = arg3;
            this.field5155 = arg0;
            this.field5058 = arg1;
            if (this.field5086) {
                this.field5059[3].method2387((byte) 82);
                this.field5059[3].method528((byte) 37);
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method2199(byte arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "(I)V")
    public abstract void method2200(int arg0);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIII)Lkm;")
    public final class353 method343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4956;
        return new class112(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIIII)V")
    public final void method437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5001;
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(IIIIII)V")
    public final void method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4946;
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) (-arg1) + (float) arg3;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var8 *= var10;
            var9 = var7 * var10;
        }
        if (this.method2300(27683, 0.0F, (float) arg0, (float) arg2 + var9, (float) arg3 + var8, 0.0F, (float) arg1)) {
            this.method2215((byte) -111);
            this.method2257(arg4, -552);
            this.method2264(0, class58.field582, (byte) 60);
            this.method2268(0, 114, class58.field582);
            this.method2274(arg5, -2);
            this.method2294(true);
            this.method2237(0, false);
            this.method2194((byte) -102);
            this.method2237(0, true);
            this.method2268(0, 37, class424.field6157);
            this.method2264(0, class424.field6157, (byte) 60);
        }
    }

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "(B)V")
    public abstract void method2201(byte arg0);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Luk;IIII)Lka;")
    public final class470 method383(class260 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5028;
        return new class132(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "(I)V")
    private final void method2202(int arg0) {
        if (class424.field6160 != this.field5137) {
            class352 var2 = this.field5137;
            this.field5137 = class424.field6160;
            if (var2.method2083(5121)) {
                this.method2320(85);
            }
            this.method2272((byte) 10);
            this.field5118 = this.field5132;
            this.method2260((byte) -124);
            this.field5090 &= -25;
        }
        ++field4903;
        if (arg0 != 6) {
            this.field5056 = 6;
        }
    }

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "(B)Lli;")
    public final class427 method2203(byte arg0) {
        int var2 = 59 % ((-41 - arg0) / 56);
        if (!this.field5069) {
            this.field5055.method2668(this.field5053, this.field5047);
            this.field5069 = true;
        }
        ++field4940;
        return this.field5055;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lza;)V")
    public final void method385(class413 arg0) {
        this.field4934 = ((class127) arg0).field1331;
        ++field4945;
        this.field5036 = this.field4934.method3806(32768, false);
    }

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "(I)V")
    public final void method433(int arg0) {
        ++field4927;
    }

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "()Z")
    public final boolean method376() {
        ++field4983;
        return true;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZIZLwd;[FI)Loq;")
    public final class358 method2204(boolean arg0, int arg1, boolean arg2, class272 arg3, float[] arg4, int arg5) {
        if (!arg2) {
            this.field5143 = 82;
        }
        ++field4890;
        return this.method2296(arg1, arg4, arg3, 0, (byte) -115, arg0, arg5, 0);
    }

    @OriginalMember(owner = "client!ln", name = "M", descriptor = "()I")
    public final int method346() {
        ++field4907;
        return this.field5179;
    }

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "(Z)V")
    private final void method2205(boolean arg0) {
        ++field5002;
        this.field5165 = this.method2306(arg0, 0);
        this.field5165.method3110(2501, 12, 3096);
        for (int var2 = 0; ~var2 > -5; ++var2) {
            Buffer var3 = this.field5165.method3109(true, -22228);
            if (var3 != null) {
                Stream var4 = this.method2299(var3, 0);
                var4.method3810(0.0F);
                var4.method3810(0.0F);
                var4.method3810(0.0F);
                for (int var5 = 0; ~var5 >= -257; ++var5) {
                    double var6 = (double) (var5 * 2) * 3.141592653589793D / 256.0D;
                    float var8 = (float) Math.cos(var6);
                    float var9 = (float) Math.sin(var6);
                    if (Stream.method3823()) {
                        var4.method3810(var9);
                        var4.method3810(var8);
                        var4.method3810(0.0F);
                    } else {
                        var4.method3815(var9);
                        var4.method3815(var8);
                        var4.method3815(0.0F);
                    }
                }
                var4.method3821();
                if (this.field5165.method3107((byte) 119)) {
                    break;
                }
            }
        }
        this.field5163 = this.method2312(new class231[] { new class231(class467.field6679) }, 0);
    }

    @OriginalMember(owner = "client!ln", name = "U", descriptor = "(IIIII)V")
    public final void method340(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method380(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
        ++field4941;
    }

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "(I)V")
    public final void method2206(int arg0) {
        this.method2290(-8);
        ++field4894;
        this.method2260((byte) -112);
        if (arg0 > -75) {
            this.method420();
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BLke;)V")
    public final void method2207(byte arg0, class596 arg1) {
        if (this.field5095[this.field5075] != arg1) {
            this.field5095[this.field5075] = arg1;
            if (arg1 != null) {
                arg1.method174((byte) 74);
            } else {
                this.method2198((byte) 126);
            }
            this.field5090 &= -2;
        }
        if (arg0 != -61) {
            this.method2267(false, (byte) 43);
        }
        ++field4950;
    }

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "(B)V")
    private final void method2208(byte arg0) {
        if (!this.field5065) {
            float[] var2 = this.field5087;
            float var3 = (float) (-this.field5124 * this.field5151) / (float) this.field5126;
            float var4 = (float) ((this.field4912 - this.field5124) * this.field5151) / (float) this.field5126;
            float var5 = (float) (this.field5151 * this.field5131) / (float) this.field5115;
            float var6 = (float) ((this.field5131 - this.field4875) * this.field5151) / (float) this.field5115;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field5151 * 2.0F;
                var2[9] = (var5 + var6) / (var5 - var6);
                var2[7] = 0.0F;
                var2[6] = 0.0F;
                var2[11] = -1.0F;
                var2[12] = 0.0F;
                var2[15] = 0.0F;
                var2[1] = 0.0F;
                var2[10] = this.field5146 = (float) this.field5092 / (float) (-this.field5092 + this.field5151);
                var2[4] = 0.0F;
                var2[14] = this.field5061 = (float) (this.field5151 * this.field5092) / (float) (-this.field5092 + this.field5151);
                var2[3] = 0.0F;
                var2[0] = var7 / (-var3 + var4);
                var2[2] = 0.0F;
                var2[5] = var7 / (-var6 + var5);
                var2[13] = 0.0F;
                var2[8] = (var3 + var4) / (var4 - var3);
            } else {
                var2[2] = 0.0F;
                var2[4] = 0.0F;
                var2[14] = 0.0F;
                var2[0] = 1.0F;
                var2[3] = 0.0F;
                var2[6] = 0.0F;
                var2[11] = 0.0F;
                var2[10] = 1.0F;
                var2[8] = 0.0F;
                var2[12] = 0.0F;
                var2[9] = 0.0F;
                var2[7] = 0.0F;
                var2[1] = 0.0F;
                var2[13] = 0.0F;
                var2[15] = 1.0F;
                var2[5] = 1.0F;
            }
            this.method2309(32);
            this.field5065 = true;
        }
        ++field5000;
        if (arg0 != -14) {
            this.field5112 = 0.48347148F;
        }
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(II)I")
    public final int method418(int arg0, int arg1) {
        ++field5003;
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "()Z")
    public final boolean method326() {
        ++field4898;
        return true;
    }

    @OriginalMember(owner = "client!ln", name = "C", descriptor = "(Z)V")
    public final void method364(boolean arg0) {
        this.field5134 = arg0;
        ++field4996;
        this.method2292(false);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIILuh;)V")
    public abstract void method2209(int arg0, int arg1, int arg2, class166 arg3);

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "(B)V")
    public abstract void method2210(byte arg0);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILffa;)V")
    public abstract void method2211(int arg0, class185 arg1);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IF)V")
    public final void method2212(int arg0, float arg1) {
        if (arg0 == 3) {
            ++field4915;
            if (this.field5129 != arg1) {
                this.field5129 = arg1;
                this.method2321((byte) -127);
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field4964;
    }

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "(I)V")
    private final void method2213(int arg0) {
        this.method2259(arg0 ^ arg0);
        ++field5015;
        this.method2289(true);
        this.method2229((byte) 125);
        this.method2227(false);
        this.method2317(-99);
        this.method2286(true);
        this.method2197((byte) 105);
        this.method2302(118);
        this.method2292(false);
        this.method2280(-10899);
        this.method2210((byte) 112);
        this.method2277(0);
        this.method2247((byte) -100);
        this.method2324((byte) -53);
        for (int var2 = this.field5073 - 1; var2 >= 0; --var2) {
            this.method2217(var2, 88);
            this.method2273((byte) 81);
            this.method2225(-17580);
            this.method2248((byte) 70);
        }
        this.method2282(-100);
        this.method2200(1);
        this.method2201((byte) 33);
        this.method2278(true);
        this.method2250((byte) 125);
    }

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "(I)V")
    public final void method2214(int arg0) {
        ++field4883;
        Enumeration var2 = this.field4860.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method2199((byte) -102, var3, this.field4860.get(var3));
        }
        this.field5175.method262(true);
        this.field5157.method262(true);
        this.field5165.method262(true);
        this.field5177.method842((byte) -123);
        this.field5170.method842((byte) -99);
        this.field5159.method842((byte) -124);
        this.field5174.method842((byte) -125);
        this.field5162.method842((byte) -97);
        this.field5107.method1112(25847);
        if (arg0 <= -106) {
            this.field5167.method262(true);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lur;[Lg;Z)Lda;")
    public final class59 method373(class535 arg0, class155[] arg1, boolean arg2) {
        ++field5027;
        return new class611(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "(B)V")
    private final void method2215(byte arg0) {
        ++field4924;
        if (this.field5090 != 1) {
            this.method2202(6);
            this.method2221(0, false);
            this.method2284(false, 30315);
            this.method2251(false, -32);
            this.method2234(false, arg0 + 111);
            this.method2275(false, false, (byte) 24, -2);
            this.method2255(1, arg0 ^ -15781);
            this.method2207((byte) -61, this.field5149);
            this.field5090 = 1;
        }
        if (arg0 != -111) {
            this.method361(-76, 66, 15, 71, -126, 120, 110);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IZB[[I)Lvq;")
    public abstract class460 method2216(int arg0, boolean arg1, byte arg2, int[][] arg3);

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "(II)V")
    public final void method2217(int arg0, int arg1) {
        if (this.field5075 != arg0) {
            this.field5075 = arg0;
            this.method2195(true);
        }
        ++field4905;
        if (arg1 <= 3) {
            this.field5112 = -0.40235686F;
        }
    }

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "(B)V")
    public final void method2218(byte arg0) {
        if (this.field5090 != 16) {
            this.method2240((byte) 106);
            this.method2221(0, true);
            this.method2251(true, -32);
            this.method2234(true, 0);
            this.method2274(1, -2);
            this.field5090 = 16;
        }
        if (arg0 >= -17) {
            this.method2227(false);
        }
        ++field4949;
    }

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "(IIIIII)V")
    public final void method399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4985;
        float var7 = this.method2316((byte) 82);
        this.method2215((byte) -111);
        this.method2257(arg4, -552);
        this.method2264(0, class58.field582, (byte) 60);
        this.method2268(0, 97, class58.field582);
        this.method2274(arg5, -2);
        this.field5047.method2661((float) (arg3 + -1), 1.0F, (byte) 60, (float) (arg2 + -1));
        this.field5047.method2666(0.0F, (float) arg0 + -var7, (float) arg1 - var7, (byte) -122);
        this.method2304(-121);
        this.method2237(0, false);
        this.method2308(class439.field6375, 4, -32);
        this.method2237(0, true);
        this.method2268(0, 101, class424.field6157);
        this.method2264(0, class424.field6157, (byte) 60);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method2219(int arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "(I)V")
    public void method2220(int arg0) {
        this.method2213(29036);
        ++field5011;
        if (arg0 != -12761) {
            this.field5047 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IZ)V")
    public final void method2221(int arg0, boolean arg1) {
        ++field4895;
        if (this.field5123 != arg1) {
            this.field5123 = arg1;
            this.method2280(-10899);
            this.field5090 &= -32;
        }
        if (arg0 != 0) {
            this.method2210((byte) 11);
        }
    }

    @OriginalMember(owner = "client!ln", name = "p", descriptor = "(I)Lli;")
    public final class427 method2222(int arg0) {
        if (arg0 != -8) {
            this.field5080 = -5;
        }
        ++field4936;
        return this.field5053;
    }

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "(Z)I")
    public final int method2223(boolean arg0) {
        if (arg0) {
            this.field5103 = -85;
        }
        ++field5031;
        return this.field5104;
    }

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "()Z")
    public final boolean method353() {
        ++field4961;
        return false;
    }

    @OriginalMember(owner = "client!ln", name = "L", descriptor = "(III)V")
    public final void method342(int arg0, int arg1, int arg2) {
        ++field4966;
        if (~this.field5117 != ~arg0 || this.field5088 != arg1 || this.field5135 != arg2) {
            this.field5088 = arg1;
            this.field5135 = arg2;
            this.field5117 = arg0;
            this.method2193((byte) -85);
            this.method2280(-10899);
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(Z)V")
    public final void method407(boolean arg0) {
        ++field4988;
    }

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "(B)Lli;")
    public final class427 method2224(byte arg0) {
        ++field5043;
        if (arg0 != 23) {
            this.field5076 = null;
        }
        return this.field5140[this.field5075];
    }

    @OriginalMember(owner = "client!ln", name = "q", descriptor = "(I)V")
    public abstract void method2225(int arg0);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lmk;I)V")
    public final void method2226(class54 arg0, int arg1) {
        ++field4888;
        if (arg1 >= -86) {
            this.field5045 = true;
        }
        this.field5100[this.field5075] = arg0;
        this.method2281(125);
    }

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "(II)V")
    public final void method381(int arg0, int arg1) {
        ++field4974;
        if (~this.field5151 != ~arg0 || ~this.field5092 != ~arg1) {
            this.field5092 = arg1;
            this.field5151 = arg0;
            this.method2231(69);
            this.method2321((byte) -91);
            this.method2193((byte) -49);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class278 method424(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field5042;
        return new class523(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)V")
    public final void method366(int arg0) {
        ++field5004;
    }

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "(Z)V")
    public void method2227(boolean arg0) {
        ++field4882;
        this.field5114 = this.field5056;
        this.field5056 = 0;
        if (arg0) {
            this.method2278(true);
        }
    }

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "(Z)V")
    private final void method2228(boolean arg0) {
        ++field4923;
        this.field5175 = this.method2306(false, 0);
        this.field5175.method3110(2501, 28, 140);
        if (!arg0) {
            this.method2277(-38);
        }
        for (int var2 = 0; ~var2 > -5; ++var2) {
            Buffer var3 = this.field5175.method3109(true, -22228);
            if (var3 != null) {
                Stream var4 = this.method2299(var3, 0);
                if (!Stream.method3823()) {
                    var4.method3815(0.0F);
                    var4.method3815(0.0F);
                    var4.method3815(0.0F);
                    var4.method3815(0.0F);
                    var4.method3815(0.0F);
                    var4.method3815(0.0F);
                    var4.method3815(0.0F);
                    var4.method3815(0.0F);
                    var4.method3815(1.0F);
                    var4.method3815(0.0F);
                    var4.method3815(0.0F);
                    var4.method3815(1.0F);
                    var4.method3815(0.0F);
                    var4.method3815(1.0F);
                    var4.method3815(1.0F);
                    var4.method3815(1.0F);
                    var4.method3815(0.0F);
                    var4.method3815(1.0F);
                    var4.method3815(1.0F);
                    var4.method3815(1.0F);
                    var4.method3815(1.0F);
                    var4.method3815(1.0F);
                    var4.method3815(0.0F);
                    var4.method3815(0.0F);
                    var4.method3815(1.0F);
                    var4.method3815(0.0F);
                    var4.method3815(1.0F);
                    var4.method3815(0.0F);
                    var4.method3815(0.0F);
                    var4.method3815(0.0F);
                    var4.method3815(0.0F);
                    var4.method3815(0.0F);
                    var4.method3815(0.0F);
                    var4.method3815(0.0F);
                    var4.method3815(0.0F);
                } else {
                    var4.method3810(0.0F);
                    var4.method3810(0.0F);
                    var4.method3810(0.0F);
                    var4.method3810(0.0F);
                    var4.method3810(0.0F);
                    var4.method3810(0.0F);
                    var4.method3810(0.0F);
                    var4.method3810(0.0F);
                    var4.method3810(1.0F);
                    var4.method3810(0.0F);
                    var4.method3810(0.0F);
                    var4.method3810(1.0F);
                    var4.method3810(0.0F);
                    var4.method3810(1.0F);
                    var4.method3810(1.0F);
                    var4.method3810(1.0F);
                    var4.method3810(0.0F);
                    var4.method3810(1.0F);
                    var4.method3810(1.0F);
                    var4.method3810(1.0F);
                    var4.method3810(1.0F);
                    var4.method3810(1.0F);
                    var4.method3810(0.0F);
                    var4.method3810(0.0F);
                    var4.method3810(1.0F);
                    var4.method3810(0.0F);
                    var4.method3810(1.0F);
                    var4.method3810(0.0F);
                    var4.method3810(0.0F);
                    var4.method3810(0.0F);
                    var4.method3810(0.0F);
                    var4.method3810(0.0F);
                    var4.method3810(0.0F);
                    var4.method3810(0.0F);
                    var4.method3810(0.0F);
                }
                var4.method3821();
                if (this.field5175.method3107((byte) 92)) {
                    break;
                }
            }
        }
        this.field5176 = this.method2312(new class231[] { new class231(new class467[] { class467.field6679, class467.field6685, class467.field6685 }) }, 0);
    }

    @OriginalMember(owner = "client!ln", name = "A", descriptor = "(ILaa;II)V")
    public final void method389(int arg0, class485 arg1, int arg2, int arg3) {
        ++field4990;
        class159 var5 = (class159) arg1;
        class358 var6 = var5.field1759;
        this.method2269(-2);
        this.method2207((byte) -61, var6);
        this.method2274(1, -2);
        this.method2242(-84, class94.field989, class94.field989);
        this.method2264(0, class58.field582, (byte) 60);
        this.method2257(arg0, -552);
        this.field5047.method2661((float) this.field4875, 0.0F, (byte) 60, (float) this.field4912);
        this.method2304(-123);
        this.field5140[0].method2661(var6.method599((float) this.field4875, -109), 1.0F, (byte) 60, var6.method606(13050, (float) this.field4912));
        this.field5140[0].method2666(0.0F, var6.method606(13050, (float) (-arg2)), var6.method599((float) (-arg3), -111), (byte) 114);
        this.field5100[0] = class655.field9349;
        this.method2281(18);
        this.method2279(2);
        this.method2248((byte) -89);
        this.method2264(0, class424.field6157, (byte) 60);
    }

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "(B)V")
    public abstract void method2229(byte arg0);

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(II)I")
    public final int method404(int arg0, int arg1) {
        ++field5009;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "([BILwd;III)Lak;")
    public abstract class349 method2230(byte[] arg0, int arg1, class272 arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ln", name = "r", descriptor = "(I)V")
    private final void method2231(int arg0) {
        ++field4885;
        this.field5065 = false;
        if (arg0 >= 61) {
            this.method2208((byte) -14);
            if (class503.field7072 == this.field5137) {
                this.method2260((byte) -112);
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "aa", descriptor = "(IIIIII)V")
    public final void method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4994;
        this.method2215((byte) -111);
        this.method2257(arg4, -552);
        this.method2264(0, class58.field582, (byte) 60);
        this.method2268(0, 114, class58.field582);
        this.method2274(arg5, -2);
        this.field5047.method2661((float) arg3, 1.0F, (byte) 60, (float) arg2);
        this.field5047.method1033(arg0, arg1, 0);
        this.method2304(-121);
        this.method2237(0, false);
        this.method2279(2);
        this.method2237(0, true);
        this.method2268(0, 35, class424.field6157);
        this.method2264(0, class424.field6157, (byte) 60);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "()V")
    public void method322() {
        if (!this.field5057) {
            for (class134 var1 = this.field4955.method1719(65280); var1 != null; var1 = this.field4955.method1723(-20665)) {
                ((class127) var1).method807(6033);
            }
            Enumeration var2 = this.field4860.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method2199((byte) -111, var3, this.field4860.get(var3));
            }
            class125.method797(false, false, true);
            this.field4965.release();
            this.field5057 = true;
        }
        ++field5018;
    }

    @OriginalMember(owner = "client!ln", name = "s", descriptor = "()Z")
    public final boolean method411() {
        ++field5020;
        return false;
    }

    @OriginalMember(owner = "client!ln", name = "A", descriptor = "()Z")
    public final boolean method440() {
        ++field4948;
        return this.field5064;
    }

    @OriginalMember(owner = "client!ln", name = "s", descriptor = "(I)V")
    public abstract void method2232(int arg0);

    @OriginalMember(owner = "client!ln", name = "t", descriptor = "(I)V")
    public final void method2233(int arg0) {
        if (arg0 != 0) {
            this.field5102 = false;
        }
        ++field4865;
        if (~this.field5090 != -5) {
            this.method2202(arg0 ^ 6);
            this.method2221(0, false);
            this.method2284(false, 30315);
            this.method2251(false, -32);
            this.method2234(false, arg0);
            this.method2275(false, false, (byte) 24, -2);
            this.method2274(1, -2);
            this.method2255(0, 15818);
            this.field5090 = 4;
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Loh;II)V")
    public class377(Canvas arg0, Object arg1, class150 arg2, class404 arg3, int arg4, int arg5) {
        super(arg2);
        this.field4908 = this.field4917 = arg0;
        this.field4979 = arg3;
        this.field4887 = this.field4862 = arg1;
        this.field5147 = arg4;
        Dimension var7 = arg0.getSize();
        this.field5074 = arg5;
        this.field4875 = this.field4978 = var7.height;
        this.field4912 = this.field4929 = var7.width;
        class246.method1492(false, true, (byte) 111);
        if (super.field578 != null) {
            this.field5154 = new class253(this, super.field578);
            this.field4965 = new NativeInterface(super.field578.method928((byte) -39), this.field5074);
            for (int var8 = 0; var8 < super.field578.method928((byte) -40); ++var8) {
                class298 var9 = super.field578.method931(var8, true);
                if (var9 != null) {
                    this.field4965.initTextureMetrics(var8, var9.field3696, var9.field3709);
                }
            }
        } else {
            this.field4965 = new NativeInterface(0, this.field5074);
            this.field5154 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "(I)V")
    public final void method390(int arg0) {
        ++field4926;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZI)V")
    public final void method2234(boolean arg0, int arg1) {
        if (this.field5098 == !arg0) {
            this.field5098 = arg0;
            this.method2292(false);
            this.field5090 &= -32;
        }
        if (arg1 != 0) {
            this.method435();
        }
        ++field4957;
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(ZI)Lkga;")
    public abstract class543 method2235(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "(I)V")
    public void method415(int arg0) {
        if (this.field5154 != null) {
            this.field5154.method1508(5);
        }
        ++field5014;
        this.field5152 = Integer.MAX_VALUE & arg0;
    }

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "(B)Lli;")
    public final class427 method2236(byte arg0) {
        ++field5030;
        return arg0 != 124 ? null : this.field5054;
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(IZ)V")
    public abstract void method2237(int arg0, boolean arg1);

    @OriginalMember(owner = "client!ln", name = "u", descriptor = "(I)Lvq;")
    public final class460 method2238(int arg0) {
        ++field4871;
        if (arg0 != 1) {
            return null;
        } else {
            return this.field5062 != null ? this.field5062.method751((byte) 123) : null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "DA", descriptor = "(IIII)V")
    public final void method400(int arg0, int arg1, int arg2, int arg3) {
        ++field4911;
        this.field5126 = arg2;
        this.field5124 = arg0;
        this.field5131 = arg1;
        this.field5115 = arg3;
        this.method2321((byte) -103);
        this.method2231(126);
        this.method2290(-8);
        this.method2244(-26536);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILli;)V")
    public final void method2239(int arg0, class427 arg1) {
        this.field5047.method1028(arg1);
        int var3 = 114 % ((-58 - arg0) / 36);
        ++field4989;
        this.field5045 = false;
        this.method2310(23893);
    }

    @OriginalMember(owner = "client!ln", name = "p", descriptor = "(B)V")
    private final void method2240(byte arg0) {
        if (class704.field9923 != this.field5137) {
            class352 var2 = this.field5137;
            this.field5137 = class704.field9923;
            if (!var2.method2083(5121)) {
                this.method2320(-102);
            }
            this.method2319((byte) -122);
            this.field5118 = this.field5120;
            this.method2260((byte) -121);
            this.field5090 &= -8;
        }
        ++field5021;
        int var3 = -38 % ((arg0 - -46) / 63);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ljm;Lwd;IBI)Loq;")
    public abstract class358 method2241(class687 arg0, class272 arg1, int arg2, byte arg3, int arg4);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILbga;Lbga;)V")
    public final void method2242(int arg0, class356 arg1, class356 arg2) {
        ++field5048;
        boolean var4 = false;
        if (arg0 >= -42) {
            this.field5072 = 0.042428393F;
        }
        if (this.field5127[this.field5075] != arg2) {
            this.field5127[this.field5075] = arg2;
            var4 = true;
            this.method2273((byte) 81);
        }
        if (this.field5150[this.field5075] != arg1) {
            this.field5150[this.field5075] = arg1;
            var4 = true;
            this.method2225(-17580);
        }
        if (var4) {
            this.field5090 &= -30;
        }
    }

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "(Z)I")
    public final int method2243(boolean arg0) {
        ++field5010;
        return arg0 ? -114 : this.field5155;
    }

    @OriginalMember(owner = "client!ln", name = "v", descriptor = "(I)V")
    private final void method2244(int arg0) {
        if (arg0 != -26536) {
            this.method2194((byte) -61);
        }
        this.field5072 = (float) (-this.field5131 + this.field5142);
        this.field5077 = (float) (-this.field5131 + this.field5110);
        this.field5106 = (float) (-this.field5124 + this.field5081);
        this.field5156 = (float) (-this.field5124 + this.field5143);
        ++field5033;
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(ZI)V")
    public final void method2245(boolean arg0, int arg1) {
        if (!arg0 != !this.field5136) {
            this.field5136 = arg0;
            this.method2197((byte) -124);
        }
        ++field5006;
        int var3 = 3 % ((38 - arg1) / 57);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IZ[IIBII)Loq;")
    public abstract class358 method2246(int arg0, boolean arg1, int[] arg2, int arg3, byte arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ln", name = "q", descriptor = "(B)V")
    public abstract void method2247(byte arg0);

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "()I")
    public final int method350() {
        ++field5012;
        return this.field5096 + -2;
    }

    @OriginalMember(owner = "client!ln", name = "r", descriptor = "(B)V")
    public final void method2248(byte arg0) {
        if (this.field5100[this.field5075] != class479.field6847) {
            this.field5100[this.field5075] = class479.field6847;
            this.field5140[this.field5075].method1026();
            this.method2281(107);
        }
        int var2 = -70 / ((arg0 - 2) / 56);
        ++field5040;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZB)V")
    public final void method2249(boolean arg0, byte arg1) {
        if (arg1 > -104) {
            this.method376();
        }
        ++field4960;
        if (!arg0 != !this.field5111) {
            this.field5111 = arg0;
            this.method2229((byte) 126);
        }
    }

    @OriginalMember(owner = "client!ln", name = "s", descriptor = "(B)V")
    public abstract void method2250(byte arg0);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method369(Canvas arg0, int arg1, int arg2) {
        ++field4998;
        if (this.field4917 == arg0) {
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
                Object var6 = this.method2311(-9219, arg0);
                if (var6 == null) {
                    throw new RuntimeException();
                } else {
                    this.field4860.put(arg0, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "(ZI)V")
    public final void method2251(boolean arg0, int arg1) {
        if (arg1 != -32) {
            this.field5104 = -5;
        }
        ++field4967;
        if (this.field5125 == !arg0) {
            this.field5125 = arg0;
            this.method2302(121);
            this.field5090 &= -32;
        }
    }

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "(II)V")
    public abstract void method2252(int arg0, int arg1);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZII[BILwd;II)Loq;")
    public abstract class358 method2253(boolean arg0, int arg1, int arg2, byte[] arg3, int arg4, class272 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ln", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method325(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field4971;
        boolean var7 = ~this.field5141 != ~arg0;
        if (var7 || this.field5093 != arg1 || this.field5094 != arg2) {
            this.field5094 = arg2;
            this.field5093 = arg1;
            this.field5141 = arg0;
            if (var7) {
                this.field5079 = (float) (this.field5141 & 255) / 255.0F;
                this.field5078 = (float) (this.field5141 & 16711680) / 1.671168E7F;
                this.field5067 = (float) (65280 & this.field5141) / 65280.0F;
                this.method2259(0);
            }
            this.field4965.setSunColour(this.field5078, this.field5067, this.field5079, arg1, arg2);
            this.method2289(true);
        }
        if (this.field5068[0] != arg3 || this.field5068[1] != arg4 || this.field5068[2] != arg5) {
            this.field5068[2] = arg5;
            this.field5068[1] = arg4;
            this.field5068[0] = arg3;
            this.field5099[1] = -arg4;
            this.field5099[0] = -arg3;
            this.field5099[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field5076[2] = arg5 * var8;
            this.field5076[1] = arg4 * var8;
            this.field5076[0] = arg3 * var8;
            this.field5108[2] = -this.field5076[2];
            this.field5108[1] = -this.field5076[1];
            this.field5108[0] = -this.field5076[0];
            this.field4965.setSunDirection(this.field5076[0], this.field5076[1], this.field5076[2]);
            this.method2317(84);
            this.field5144 = (int) (arg3 * 256.0F / arg4);
            this.field5083 = (int) (arg5 * 256.0F / arg4);
        }
        this.method2286(true);
    }

    @OriginalMember(owner = "client!ln", name = "w", descriptor = "(I)V")
    public final void method2254(int arg0) {
        ++field4928;
        Hashtable var2 = new Hashtable();
        if (this.field4860 != null && !this.field4860.isEmpty()) {
            Enumeration var3 = this.field4860.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method2311(-9219, var4));
            }
        }
        this.field4860 = var2;
        this.method2228(true);
        if (arg0 != 8) {
            this.field5074 = 9;
        }
        this.method2283((byte) 119);
        this.method2205(false);
        this.field5107.method1120((byte) -124, this);
    }

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "(II)V")
    public final void method2255(int arg0, int arg1) {
        if (arg1 != 15818) {
            this.field5161 = null;
        }
        ++field4921;
        if (arg0 != 1) {
            if (arg0 != 0) {
                if (arg0 != 2) {
                    if (arg0 == 3) {
                        this.method2242(-77, class372.field4752, class360.field4624);
                        return;
                    }
                    if (arg0 == 4) {
                        this.method2242(arg1 + -15917, class495.field7004, class495.field7004);
                        return;
                    }
                } else {
                    this.method2242(-115, class94.field989, class1.field4);
                }
            } else {
                this.method2242(arg1 + -15915, class372.field4752, class372.field4752);
            }
        } else {
            this.method2242(-57, class94.field989, class94.field989);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class485 arg6, int arg7, int arg8) {
        ++field4870;
    }

    @OriginalMember(owner = "client!ln", name = "t", descriptor = "()Z")
    public final boolean method413() {
        ++field4991;
        return false;
    }

    @OriginalMember(owner = "client!ln", name = "x", descriptor = "(I)V")
    public final void method2256(int arg0) {
        if (this.field5090 != 8) {
            this.method2325(arg0 ^ -7);
            this.method2221(0, true);
            this.method2251(true, -32);
            this.method2234(true, 0);
            this.method2274(1, -2);
            this.field5090 = 8;
        }
        ++field4863;
        if (arg0 != 1) {
            this.method2192((class272) null, (class687) null, false);
        }
    }

    @OriginalMember(owner = "client!ln", name = "HA", descriptor = "(IIII[I)V")
    public final void method363(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field4920;
        float var6 = this.field5051.method2669(3, (float) arg2, (float) arg0, (float) arg1);
        if (!((float) this.field5151 > var6) && !((float) this.field5092 < var6)) {
            int var7 = (int) ((float) this.field5126 * this.field5051.method2654((float) arg1, (float) arg2, (float) arg0, (byte) -126) / (float) arg3);
            int var8 = (int) ((float) this.field5115 * this.field5051.method2674((float) arg2, (float) arg0, (float) arg1, 27065) / (float) arg3);
            arg4[0] = (int) ((float) var7 + -this.field5106);
            arg4[1] = (int) ((float) var8 + -this.field5072);
            arg4[2] = (int) var6;
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ln", name = "xa", descriptor = "(F)V")
    public final void method360(float arg0) {
        ++field4944;
        if (this.field5116 != arg0) {
            this.field5116 = arg0;
            this.field4965.setAmbient(arg0);
            this.method2259(0);
            this.method2286(true);
        }
    }

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "(II)V")
    public final void method2257(int arg0, int arg1) {
        ++field4886;
        if (arg1 == -552) {
            if (~this.field5148 != ~arg0) {
                this.field5148 = arg0;
                this.method2282(-95);
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class485 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field5034;
    }

    @OriginalMember(owner = "client!ln", name = "y", descriptor = "(I)Lli;")
    public final class427 method2258(int arg0) {
        if (arg0 <= 120) {
            this.method365(103);
        }
        ++field4861;
        return this.field5140[this.field5075];
    }

    @OriginalMember(owner = "client!ln", name = "z", descriptor = "(I)V")
    public abstract void method2259(int arg0);

    @OriginalMember(owner = "client!ln", name = "t", descriptor = "(B)V")
    private final void method2260(byte arg0) {
        if (arg0 <= -91) {
            ++field5016;
            this.method2201((byte) 33);
            if (this.field5128 != null) {
                this.field5128.method524(2976);
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "A", descriptor = "(I)V")
    private final void method2261(int arg0) {
        int var2 = 7 / ((arg0 - 51) / 63);
        this.field5071 = false;
        ++field4899;
        if (class424.field6160 == this.field5137) {
            this.method2272((byte) 10);
            this.method2260((byte) -94);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z[F)[F")
    public final float[] method2262(boolean arg0, float[] arg1) {
        if (!arg0) {
            this.method435();
        }
        arg1[0] = this.field5118[0];
        arg1[12] = this.field5118[3];
        ++field4935;
        arg1[8] = this.field5118[2];
        arg1[4] = this.field5118[1];
        arg1[2] = this.field5118[8];
        arg1[1] = this.field5118[4];
        arg1[13] = this.field5118[7];
        arg1[5] = this.field5118[5];
        arg1[9] = this.field5118[6];
        arg1[7] = this.field5118[13];
        arg1[14] = this.field5118[11];
        arg1[3] = this.field5118[12];
        arg1[6] = this.field5118[9];
        arg1[10] = this.field5118[10];
        arg1[11] = this.field5118[14];
        arg1[15] = this.field5118[15];
        return arg1;
    }

    @OriginalMember(owner = "client!ln", name = "u", descriptor = "(B)Lli;")
    public final class427 method2263(byte arg0) {
        if (arg0 != 55) {
            return null;
        } else {
            ++field4995;
            return this.field5047;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method375(Canvas arg0) {
        ++field4902;
        if (this.field4917 == arg0) {
            throw new RuntimeException();
        } else if (this.field4860.containsKey(arg0)) {
            this.method2199((byte) -107, arg0, this.field4860.get(arg0));
            this.field4860.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILpt;B)V")
    public final void method2264(int arg0, class529 arg1, byte arg2) {
        ++field4914;
        this.method2318((byte) 39, false, false, arg0, arg1);
        if (arg2 != 60) {
            this.method435();
        }
    }

    @OriginalMember(owner = "client!ln", name = "B", descriptor = "(I)V")
    private final void method2265(int arg0) {
        int var2 = -127 / ((arg0 - -23) / 56);
        this.field5112 = (float) this.field5092;
        ++field4916;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "([IIIIZ)Loq;")
    public final class358 method2266(int[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = -12 % ((arg1 - 43) / 50);
        ++field4910;
        return this.method2246(arg3, arg4, arg0, arg2, (byte) -4, 0, 0);
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(ZB)V")
    public final void method2267(boolean arg0, byte arg1) {
        ++field4876;
        this.method2257(arg1 << 8 | arg1 << 16 | arg1 << 24 | arg1, -552);
        if (!arg0) {
            this.method2262(true, (float[]) null);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILpt;)V")
    public final void method2268(int arg0, int arg1, class529 arg2) {
        this.method2271(arg2, false, -1, arg0);
        ++field4984;
        if (arg1 < 5) {
            this.method2266((int[]) null, -64, 40, 84, false);
        }
    }

    @OriginalMember(owner = "client!ln", name = "C", descriptor = "(I)V")
    public final void method2269(int arg0) {
        if (~this.field5090 != -3) {
            this.method2202(6);
            this.method2221(0, false);
            this.method2284(false, arg0 ^ -30315);
            this.method2251(false, arg0 + -30);
            this.method2234(false, arg0 + 2);
            this.method2275(false, false, (byte) 24, -2);
            this.field5090 = 2;
        }
        ++field4953;
        if (arg0 != -2) {
            this.method2317(-30);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lg;Z)Lhu;")
    public final class131 method434(class155 arg0, boolean arg1) {
        ++field4952;
        class131 var10;
        if (~arg0.field1708 != -1 && arg0.field1706 != 0) {
            int[] var3 = new int[arg0.field1708 * arg0.field1706];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field1707 == null) {
                for (int var6 = 0; ~arg0.field1706 < ~var6; ++var6) {
                    for (int var7 = 0; arg0.field1708 > var7; ++var7) {
                        int var8 = arg0.field1710[255 & arg0.field1702[var4++]];
                        var3[var5++] = var8 != 0 ? class695.method3919(-16777216, var8) : 0;
                    }
                }
            } else {
                for (int var9 = 0; var9 < arg0.field1706; ++var9) {
                    for (int var11 = 0; ~var11 > ~arg0.field1708; ++var11) {
                        var3[var5++] = class695.method3919(arg0.field1707[var4] << 24, arg0.field1710[class327.method1956(255, arg0.field1702[var4])]);
                        ++var4;
                    }
                }
            }
            var10 = this.method430(arg0.field1706, -69, var3, arg0.field1708, arg0.field1708, 0);
        } else {
            var10 = this.method430(1, -73, new int[1], 1, 1, 0);
        }
        var10.method511(arg0.field1709, arg0.field1703, arg0.field1704, arg0.field1705);
        return var10;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIZ)Lhu;")
    public final class131 method332(int arg0, int arg1, boolean arg2) {
        ++field4997;
        return new class471(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lkm;)V")
    public final void method348(class353 arg0) {
        ++field4879;
        this.field5062 = (class378) arg0;
    }

    @OriginalMember(owner = "client!ln", name = "za", descriptor = "(IIIII)V")
    public final void method382(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5022;
        this.method2215((byte) -111);
        this.method2257(arg3, -552);
        this.method2264(0, class58.field582, (byte) 60);
        this.method2268(0, 69, class58.field582);
        this.method2274(arg4, -2);
        this.field5047.method2661((float) arg2, 1.0F, (byte) 60, (float) arg2);
        this.field5047.method1033(arg0, arg1, 0);
        this.method2304(-122);
        this.method2237(0, false);
        this.method2301(true, this.field5165, 0);
        this.method2285(1, this.field5163);
        this.method2209(0, 0, 256, class208.field2458);
        this.method2237(0, true);
        this.method2268(0, 81, class424.field6157);
        this.method2264(0, class424.field6157, (byte) 60);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I[Lada;)V")
    public final void method321(int arg0, class163[] arg1) {
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field5122[var3] = arg1[var3];
        }
        ++field4973;
        this.field5056 = arg0;
        if (this.field5137.method2083(5121)) {
            this.method2227(false);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
    public abstract void method2270(Canvas arg0, int arg1, Object arg2);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lpt;ZII)V")
    public abstract void method2271(class529 arg0, boolean arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ln", name = "v", descriptor = "(B)V")
    private final void method2272(byte arg0) {
        if (!this.field5071) {
            float[] var2 = this.field5132;
            this.field5071 = true;
            if (this.field4912 != 0 && this.field4875 != 0) {
                var2[10] = 0.5F;
                var2[0] = 2.0F / (float) this.field4912;
                var2[1] = 0.0F;
                var2[12] = -1.0F;
                var2[14] = 0.5F;
                var2[13] = 1.0F;
                var2[3] = 0.0F;
                var2[4] = 0.0F;
                var2[15] = 1.0F;
                var2[6] = 0.0F;
                var2[2] = 0.0F;
                var2[7] = 0.0F;
                var2[11] = 0.0F;
                var2[9] = 0.0F;
                var2[5] = -2.0F / (float) this.field4875;
                var2[8] = 0.0F;
            } else {
                var2[11] = 0.0F;
                var2[1] = 0.0F;
                var2[2] = 0.0F;
                var2[14] = 0.0F;
                var2[6] = 0.0F;
                var2[4] = 0.0F;
                var2[12] = 0.0F;
                var2[8] = 0.0F;
                var2[3] = 0.0F;
                var2[5] = 1.0F;
                var2[13] = 0.0F;
                var2[9] = 0.0F;
                var2[0] = 1.0F;
                var2[7] = 0.0F;
                var2[15] = 1.0F;
                var2[10] = 1.0F;
            }
        }
        if (arg0 != 10) {
            this.method2251(true, -56);
        }
        ++field5025;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lpca;I)V")
    public final void method402(class713 arg0, int arg1) {
        ++field4963;
        this.field5107.method1116(arg0, true, arg1, this);
    }

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "(I)Lza;")
    public final class413 method408(int arg0) {
        ++field4893;
        class127 var2 = new class127(arg0);
        this.field4955.method1721((byte) 98, var2);
        return var2;
    }

    @OriginalMember(owner = "client!ln", name = "w", descriptor = "(B)V")
    public abstract void method2273(byte arg0);

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "(II)V")
    public final void method2274(int arg0, int arg1) {
        if (arg1 == -2) {
            if (~this.field5109 != ~arg0) {
                boolean var3;
                boolean var4;
                class746 var5;
                if (~arg0 != -2) {
                    if (~arg0 != -3) {
                        if (arg0 != 128) {
                            var3 = false;
                            var4 = false;
                            var5 = class391.field5392;
                        } else {
                            var5 = class205.field2427;
                            var3 = true;
                            var4 = true;
                        }
                    } else {
                        var4 = false;
                        var5 = class726.field10153;
                        var3 = true;
                    }
                } else {
                    var5 = class341.field4403;
                    var3 = true;
                    var4 = true;
                }
                if (var4 == !this.field5066) {
                    this.field5066 = var4;
                    this.method2324((byte) -53);
                }
                if (!this.field5063 == var3) {
                    this.field5063 = var3;
                    this.method2277(0);
                }
                if (this.field5060 != var5) {
                    this.field5060 = var5;
                    this.method2247((byte) 93);
                }
                this.field5109 = arg0;
                this.field5090 &= -29;
            }
            ++field4864;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZZBI)V")
    public final void method2275(boolean arg0, boolean arg1, byte arg2, int arg3) {
        if (this.field5101 != arg3 || !this.field5145 == this.field5086) {
            class358 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = this.field5145 ? 3 : 0;
            if (arg3 < 0) {
                this.method2248((byte) -82);
            } else {
                var5 = this.field5154.method1507(arg2 ^ -31721, arg3);
                class298 var10 = super.field578.method931(arg3, true);
                if (~var10.field3704 == -1 && ~var10.field3699 == -1) {
                    this.method2248((byte) 118);
                } else {
                    int var11 = var10.field3711 ? 64 : 128;
                    int var12 = var11 * 50;
                    class427 var13 = this.method2224((byte) 23);
                    var13.method2663((float) (this.field5152 % var12 * var10.field3699) / (float) var12, (float) (this.field5152 % var12 * var10.field3704) / (float) var12, 0.0F, true);
                    this.method2226(class655.field9349, -127);
                }
                if (!this.field5145) {
                    var7 = var10.field3695;
                    var9 = var10.field3702;
                    var8 = var10.field3712;
                }
                var6 = var10.field3705;
            }
            this.method2298(var9, 7629, var7, arg0, arg1, var8);
            if (this.field5128 != null) {
                this.field5128.method27(var5, (byte) 123, var6);
            } else {
                this.method2207((byte) -61, var5);
                this.method2255(var6, 15818);
            }
            this.field5101 = arg3;
            this.field5086 = this.field5145;
        }
        if (arg2 == 24) {
            ++field5038;
            this.field5090 &= -8;
        }
    }

    @OriginalMember(owner = "client!ln", name = "H", descriptor = "(III[I)V")
    public final void method333(int arg0, int arg1, int arg2, int[] arg3) {
        ++field4975;
        float var5 = this.field5051.method2669(3, (float) arg2, (float) arg0, (float) arg1);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field5124;
            var7 = this.field5131;
        } else {
            var6 = (int) ((float) this.field5126 * this.field5051.method2654((float) arg1, (float) arg2, (float) arg0, (byte) -128) / var5);
            var7 = (int) ((float) this.field5115 * this.field5051.method2674((float) arg2, (float) arg0, (float) arg1, 27065) / var5);
        }
        arg3[2] = (int) var5;
        arg3[0] = (int) ((float) var6 - this.field5106);
        arg3[1] = (int) ((float) var7 + -this.field5072);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "([IIIIIZ)Lhu;")
    public final class131 method324(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4986;
        return new class471(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ln", name = "D", descriptor = "(I)I")
    public final int method2276(int arg0) {
        if (arg0 != -16504) {
            field4930 = false;
        }
        ++field4942;
        return this.field5075;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIIF)Lada;")
    public final class163 method368(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field4962;
        return new class125(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ln", name = "E", descriptor = "(I)V")
    public abstract void method2277(int arg0);

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "(Z)V")
    public abstract void method2278(boolean arg0);

    @OriginalMember(owner = "client!ln", name = "F", descriptor = "(I)V")
    public final void method2279(int arg0) {
        ++field4881;
        this.method2308(class208.field2458, arg0, arg0 ^ -41);
    }

    @OriginalMember(owner = "client!ln", name = "la", descriptor = "()V")
    public final void method393() {
        this.field5142 = 0;
        this.field5143 = this.field4912;
        this.field5110 = this.field4875;
        this.field5081 = 0;
        ++field4951;
        if (this.field5180) {
            this.field5180 = false;
            this.method2305((byte) 86);
        }
        this.method2244(-26536);
    }

    @OriginalMember(owner = "client!ln", name = "G", descriptor = "(I)V")
    public abstract void method2280(int arg0);

    @OriginalMember(owner = "client!ln", name = "pa", descriptor = "()V")
    public final void method419() {
        this.field5145 = false;
        ++field5008;
    }

    @OriginalMember(owner = "client!ln", name = "H", descriptor = "(I)V")
    private final void method2281(int arg0) {
        ++field5024;
        this.method2232(15944);
        if (this.field5128 != null) {
            this.field5128.method526((byte) -126);
        }
        if (arg0 <= 12) {
            this.method391((class713) null);
        }
    }

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "(I)V")
    public final void method392(int arg0) {
        ++field4884;
    }

    @OriginalMember(owner = "client!ln", name = "I", descriptor = "(I)V")
    public abstract void method2282(int arg0);

    @OriginalMember(owner = "client!ln", name = "x", descriptor = "(B)V")
    private final void method2283(byte arg0) {
        this.field5157 = this.method2306(true, 0);
        if (arg0 < 46) {
            field4930 = false;
        }
        ++field4992;
        this.field5157.method3110(2501, 12, 24);
        this.field5168 = this.method2312(new class231[] { new class231(class467.field6679) }, 0);
    }

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "(ZI)V")
    public final void method2284(boolean arg0, int arg1) {
        ++field4869;
        if (arg1 != 30315) {
            this.field4955 = null;
        }
        if (this.field5121 == !arg0) {
            this.field5121 = arg0;
            this.method2229((byte) 123);
            this.field5090 &= -8;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILf;)V")
    public abstract void method2285(int arg0, class753 arg1);

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "(Z)V")
    public abstract void method2286(boolean arg0);

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "(ZI)V")
    public final void method2287(boolean arg0, int arg1) {
        if (arg1 != -32) {
            this.method2210((byte) -73);
        }
        ++field4896;
        if (!arg0 == this.field5070) {
            this.field5070 = arg0;
            this.method2280(-10899);
        }
    }

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "(II)Lkga;")
    public final class543 method2288(int arg0, int arg1) {
        if (arg0 != 15951) {
            this.method2276(-48);
        }
        if (~this.field5167.method265(true) > ~(arg1 * 2)) {
            this.field5167.method267(30903, arg1);
        }
        ++field5005;
        return this.field5167;
    }

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "(Z)V")
    public abstract void method2289(boolean arg0);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIZ)Lhu;")
    public final class131 method396(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field4872;
        class471 var6 = new class471(this, arg2, arg3, arg4);
        var6.method826(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!ln", name = "JA", descriptor = "(IIIIII)I")
    public final int method367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4889;
        int var7 = 0;
        float var8 = (float) arg2 * this.field5051.field6192 + (float) arg0 * this.field5051.field6200 + (float) arg1 * this.field5051.field6213 + this.field5051.field6204;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field5051.field6192 + (float) arg3 * this.field5051.field6200 + (float) arg4 * this.field5051.field6213 + this.field5051.field6204;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if ((float) this.field5151 > var8 && (float) this.field5151 > var9) {
            var7 |= 16;
        } else if ((float) this.field5092 < var8 && (float) this.field5092 < var9) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field5051.field6169 + (float) arg0 * this.field5051.field6189 + (float) arg1 * this.field5051.field6171 + this.field5051.field6211) * (float) this.field5126 / var8);
        int var11 = (int) (((float) arg5 * this.field5051.field6169 + (float) arg3 * this.field5051.field6189 + (float) arg4 * this.field5051.field6171 + this.field5051.field6211) * (float) this.field5126 / var9);
        if (this.field5106 > (float) var10 && (float) var11 < this.field5106) {
            var7 |= 1;
        } else if ((float) var10 > this.field5156 && this.field5156 < (float) var11) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field5051.field6195 + (float) arg0 * this.field5051.field6167 + (float) arg1 * this.field5051.field6182 + this.field5051.field6205) * (float) this.field5115 / var8);
        int var13 = (int) (((float) arg5 * this.field5051.field6195 + (float) arg3 * this.field5051.field6167 + (float) arg4 * this.field5051.field6182 + this.field5051.field6205) * (float) this.field5115 / var9);
        if ((float) var12 < this.field5072 && this.field5072 > (float) var13) {
            var7 |= 4;
        } else if ((float) var12 > this.field5077 && this.field5077 < (float) var13) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ln", name = "J", descriptor = "(I)V")
    public final void method2290(int arg0) {
        if (arg0 != -8) {
            this.field5105 = null;
        }
        ++field4873;
        if (class267.field3321 != this.field5137) {
            class352 var2 = this.field5137;
            this.field5137 = class267.field3321;
            if (var2.method2083(5121)) {
                this.method2320(arg0 ^ -104);
            }
            this.field5090 &= -32;
            this.field5118 = this.field5105;
        }
    }

    @OriginalMember(owner = "client!ln", name = "K", descriptor = "(I)V")
    public abstract void method2291(int arg0);

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "(Z)V")
    public abstract void method2292(boolean arg0);

    @OriginalMember(owner = "client!ln", name = "y", descriptor = "(B)I")
    public final int method2293(byte arg0) {
        ++field4968;
        if (arg0 != -113) {
            this.field5090 = 66;
        }
        return this.field5119;
    }

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "(Z)V")
    public final void method2294(boolean arg0) {
        this.field5047.method1026();
        ++field5019;
        this.field5045 = arg0;
        this.method2310(23893);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Luh;ILkga;IIII)V")
    public abstract void method2295(class166 arg0, int arg1, class543 arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I[FLwd;IBZII)Loq;")
    public abstract class358 method2296(int arg0, float[] arg1, class272 arg2, int arg3, byte arg4, boolean arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method427(Canvas arg0, int arg1, int arg2) {
        ++field4909;
        Object var4 = null;
        if (arg0 != null && this.field4917 != arg0) {
            if (this.field4860.containsKey(arg0)) {
                var4 = this.field4860.get(arg0);
            }
        } else {
            var4 = this.field4887;
        }
        if (var4 == null) {
            throw new RuntimeException();
        } else {
            this.method2219(-1, arg0, var4);
            if (this.field4908 == arg0) {
                this.method2315(1);
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "L", descriptor = "(I)V")
    public final void method2297(int arg0) {
        ++field4977;
        this.field5100 = new class54[this.field5073];
        this.field5127 = new class356[this.field5073];
        this.field5095 = new class596[this.field5073];
        this.field5150 = new class356[this.field5073];
        this.field5140 = new class427[this.field5073];
        for (int var2 = 0; ~var2 > ~this.field5073; ++var2) {
            this.field5150[var2] = class372.field4752;
            this.field5127[var2] = class372.field4752;
            this.field5100[var2] = class479.field6847;
            this.field5140[var2] = new class427();
        }
        this.field5122 = new class163[this.field5096 + -2];
        this.field5149 = this.method2241(class687.field9697, class102.field1058, 1, (byte) -113, 1);
        this.method385(new class127(262144));
        this.field5161 = this.method2312(new class231[] { new class231(new class467[] { class467.field6679, class467.field6685 }) }, 0);
        this.field5178 = this.method2312(new class231[] { new class231(new class467[] { class467.field6679, class467.field6683 }) }, 0);
        this.field5173 = this.method2312(new class231[] { new class231(class467.field6679), new class231(class467.field6683), new class231(class467.field6685), new class231(class467.field6682) }, 0);
        this.field5169 = this.method2312(new class231[] { new class231(class467.field6679), new class231(class467.field6683), new class231(class467.field6685) }, 0);
        this.field5158 = new class132(this, 0, 0, false, false);
        this.field5177 = new class132(this, 0, 0, true, true);
        this.field5160 = new class132(this, 0, 0, false, false);
        this.field5170 = new class132(this, 0, 0, true, true);
        this.field5164 = new class132(this, 0, 0, false, false);
        this.field5159 = new class132(this, 0, 0, true, true);
        this.field5166 = new class132(this, 0, 0, false, false);
        this.field5174 = new class132(this, 0, 0, true, true);
        this.field5171 = new class132(this, 0, 0, false, false);
        this.field5162 = new class132(this, 0, 0, true, true);
        this.field5107 = new class180(this);
        this.field5167 = this.method2235(true, 9);
        this.method2254(8);
        if (arg0 <= -15) {
            this.field4906 = new class309(this);
            this.field5059[1] = this.method2196(-48, 1);
            this.field5059[2] = this.method2196(-42, 2);
            this.field5059[4] = this.method2196(-57, 4);
            this.field5059[5] = this.method2196(-31, 5);
            this.field5059[6] = this.method2196(-98, 6);
            this.field5059[7] = this.method2196(-116, 7);
            this.field5059[3] = this.method2196(-64, 3);
            this.field5059[8] = this.method2196(-110, 8);
            this.field5059[9] = this.method2196(-109, 9);
            if (!this.field5059[2].method26(13326)) {
                this.field5059[2] = this.method2196(-125, 0);
            }
            if (!this.field5059[4].method26(13326)) {
                this.field5059[4] = this.field5059[2];
            }
            if (!this.field5059[8].method26(13326)) {
                this.field5059[8] = this.field5059[4];
            }
            if (!this.field5059[9].method26(13326)) {
                this.field5059[9] = this.field5059[8];
            }
            this.method2220(-12761);
            this.method393();
            this.method362();
        }
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "()Z")
    public final boolean method328() {
        ++field4880;
        return true;
    }

    @OriginalMember(owner = "client!ln", name = "r", descriptor = "(IIIIIII)I")
    public final int method361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4939;
        int var8 = 0;
        float var9 = (float) arg2 * this.field5051.field6192 + (float) arg0 * this.field5051.field6200 + (float) arg1 * this.field5051.field6213 + this.field5051.field6204;
        float var10 = (float) arg5 * this.field5051.field6192 + (float) arg3 * this.field5051.field6200 + (float) arg4 * this.field5051.field6213 + this.field5051.field6204;
        if ((float) this.field5151 > var9 && (float) this.field5151 > var10) {
            var8 |= 16;
        } else if ((float) this.field5092 < var9 && var10 > (float) this.field5092) {
            var8 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field5051.field6169 + (float) arg0 * this.field5051.field6189 + (float) arg1 * this.field5051.field6171 + this.field5051.field6211) * (float) this.field5126 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field5051.field6169 + (float) arg3 * this.field5051.field6189 + (float) arg4 * this.field5051.field6171 + this.field5051.field6211) * (float) this.field5126 / (float) arg6);
        if ((float) var11 < this.field5106 && this.field5106 > (float) var12) {
            var8 |= 1;
        } else if (this.field5156 < (float) var11 && (float) var12 > this.field5156) {
            var8 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field5051.field6195 + (float) arg0 * this.field5051.field6167 + (float) arg1 * this.field5051.field6182 + this.field5051.field6205) * (float) this.field5115 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field5051.field6195 + (float) arg3 * this.field5051.field6167 + (float) arg4 * this.field5051.field6182 + this.field5051.field6205) * (float) this.field5115 / (float) arg6);
        if ((float) var13 < this.field5072 && this.field5072 > (float) var14) {
            var8 |= 4;
        } else if ((float) var13 > this.field5077 && (float) var14 > this.field5077) {
            var8 |= 8;
        }
        return var8;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIZZI)V")
    private final void method2298(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        boolean var7 = arg3 & this.method394();
        ++field4925;
        if (!var7 && (~arg0 == -5 || arg0 == 8 || arg0 == 9)) {
            arg0 = 2;
            arg5 = arg0 != 4 ? 1 : arg2 & 1;
            arg2 = 0;
        }
        if (arg0 != 0 && arg4) {
            arg0 |= Integer.MIN_VALUE;
        }
        if (~this.field5080 != ~arg0) {
            if (~this.field5080 != -1) {
                this.field5059[Integer.MAX_VALUE & this.field5080].method31((byte) -66);
            }
            if (~arg0 != -1) {
                this.field5128 = this.field5059[arg0 & Integer.MAX_VALUE];
                this.field5128.method24(arg4, arg1 ^ -7630);
                this.field5128.method30(arg4, (byte) 111);
                this.field5128.method32(arg2, arg5, true);
            } else {
                this.field5128 = null;
            }
            this.field5080 = arg0;
            this.field5097 = arg5;
            this.field5139 = arg2;
        } else if (~this.field5080 != -1) {
            this.field5059[this.field5080 & Integer.MAX_VALUE].method30(arg4, (byte) 103);
            if (~this.field5139 != ~arg2 || this.field5097 != arg5) {
                this.field5059[this.field5080 & Integer.MAX_VALUE].method32(arg2, arg5, true);
                this.field5097 = arg5;
                this.field5139 = arg2;
            }
        }
        if (arg1 != 7629) {
            this.method2305((byte) -95);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ljaclib/memory/Buffer;I)Ljaclib/memory/Stream;")
    public final Stream method2299(Buffer arg0, int arg1) {
        ++field4970;
        if (arg1 != 0) {
            this.method392(15);
        }
        this.field5085.method3813(arg0);
        return this.field5085;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IFFFFFF)Z")
    private final boolean method2300(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6) {
        ++field4913;
        Buffer var8 = this.field5157.method3109(true, -22228);
        if (var8 == null) {
            return false;
        } else {
            Stream var9 = this.method2299(var8, 0);
            if (!Stream.method3823()) {
                var9.method3815(arg2);
                var9.method3815(arg6);
                var9.method3815(arg1);
                var9.method3815(arg3);
                var9.method3815(arg4);
                var9.method3815(arg5);
            } else {
                var9.method3810(arg2);
                var9.method3810(arg6);
                var9.method3810(arg1);
                var9.method3810(arg3);
                var9.method3810(arg4);
                var9.method3810(arg5);
            }
            if (arg0 != 27683) {
                this.method2306(true, -15);
            }
            var9.method3821();
            return this.field5157.method3107((byte) 106);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZLel;I)V")
    public abstract void method2301(boolean arg0, class545 arg1, int arg2);

    @OriginalMember(owner = "client!ln", name = "KA", descriptor = "(IIII)V")
    public final void method432(int arg0, int arg1, int arg2, int arg3) {
        ++field4868;
        if (~arg0 >= -1 && arg2 >= this.field4912 - 1 && ~arg1 >= -1 && ~(this.field4875 + -1) >= ~arg3) {
            this.method393();
        } else {
            this.field5142 = arg1 < 0 ? 0 : arg1;
            this.field5143 = arg2 > this.field4912 ? 0 : arg2;
            this.field5110 = ~arg3 < ~this.field4912 ? 0 : arg3;
            this.field5081 = ~arg0 <= -1 ? arg0 : 0;
            if (!this.field5180) {
                this.field5180 = true;
                this.method2305((byte) 86);
            }
            this.method2291(11317);
            this.method2244(-26536);
        }
    }

    @OriginalMember(owner = "client!ln", name = "M", descriptor = "(I)V")
    public abstract void method2302(int arg0);

    @OriginalMember(owner = "client!ln", name = "X", descriptor = "(I)V")
    public final void method398(int arg0) {
        this.field5103 = 0;
        ++field5007;
        while (arg0 > 1) {
            arg0 >>= 1;
            ++this.field5103;
        }
        this.field5130 = 1 << this.field5103;
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(IIIIIIIII)Z")
    public static final boolean method2303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field5023;
        if (arg3 + arg4 > arg7 && ~(arg1 + arg7) < ~arg4) {
            if (~arg0 > ~(arg6 + arg8) && ~(arg0 + arg2) < ~arg6) {
                if (arg5 != 4) {
                    field4930 = false;
                }
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method405(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field4959;
        float var10 = (float) (-arg0) + (float) arg2;
        float var11 = (float) arg3 - (float) arg1;
        float var12;
        if (var10 == 0.0F && var11 == 0.0F) {
            var12 = 1.0F;
        } else {
            float var13 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            var12 = var10 * var13;
            var11 *= var13;
        }
        this.method2215((byte) -111);
        this.method2257(arg4, -552);
        this.method2264(0, class58.field582, (byte) 60);
        this.method2268(0, 66, class58.field582);
        this.method2274(arg5, -2);
        this.method2294(true);
        this.method2237(0, false);
        int var14 = arg8 % (arg7 - -arg6);
        float var15 = (float) arg6 * var12;
        float var16 = (float) arg6 * var11;
        float var17 = 0.0F;
        float var18 = 0.0F;
        float var19 = var15;
        float var20 = var16;
        if (~var14 >= ~arg6) {
            var20 = (float) (-var14 + arg6) * var11;
            var19 = (float) (-var14 + arg6) * var12;
        } else {
            var17 = (float) (-var14 + arg7 + arg6) * var12;
            var18 = (float) (arg6 - var14 + arg7) * var11;
        }
        float var21 = (float) arg0 + var17;
        float var22 = (float) arg1 + var18;
        float var23 = (float) arg7 * var12;
        float var24 = (float) arg7 * var11;
        while (true) {
            if (arg2 > arg0) {
                if (var21 > (float) arg2) {
                    break;
                }
                if ((float) arg2 < var19 + var21) {
                    var19 = (float) arg2 - var21;
                }
            } else {
                if (var21 < (float) arg2) {
                    break;
                }
                if (var19 + var21 < (float) arg2) {
                    var19 = (float) arg2 - var21;
                }
            }
            if (~arg3 >= ~arg1) {
                if (var22 < (float) arg3) {
                    break;
                }
                if ((float) arg3 > var20 + var22) {
                    var20 = (float) arg3 - var22;
                }
            } else {
                if ((float) arg3 < var22) {
                    break;
                }
                if (var20 + var22 > (float) arg3) {
                    var20 = (float) arg3 - var22;
                }
            }
            if (!this.method2300(27683, 0.0F, var21, var19 + var21, var20 + var22, 0.0F, var22)) {
                return;
            }
            var22 += var20 + var24;
            var21 += var19 + var23;
            this.method2194((byte) 99);
            var20 = var16;
            var19 = var15;
        }
        this.method2237(0, true);
        this.method2268(0, 32, class424.field6157);
        this.method2264(0, class424.field6157, (byte) 60);
    }

    @OriginalMember(owner = "client!ln", name = "P", descriptor = "(IIIII)V")
    public final void method377(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method380(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
        ++field4932;
    }

    @OriginalMember(owner = "client!ln", name = "u", descriptor = "()Ldfa;")
    public final class165 method414() {
        ++field4969;
        return this.field5051;
    }

    @OriginalMember(owner = "client!ln", name = "v", descriptor = "()Z")
    public final boolean method420() {
        ++field4976;
        return true;
    }

    @OriginalMember(owner = "client!ln", name = "N", descriptor = "(I)V")
    public final void method2304(int arg0) {
        this.field5045 = false;
        int var2 = 26 / ((arg0 - -66) / 51);
        ++field5037;
        this.method2310(23893);
    }

    @OriginalMember(owner = "client!ln", name = "z", descriptor = "(B)V")
    public abstract void method2305(byte arg0);

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "(ZI)Lel;")
    public abstract class545 method2306(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "()I")
    public final int method320() {
        ++field4900;
        return this.field5151;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(II[I[I)Laa;")
    public final class485 method345(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field5039;
        return class15.method72(this, (byte) -113, arg1, arg3, arg0, arg2);
    }

    @OriginalMember(owner = "client!ln", name = "A", descriptor = "(B)[F")
    public final float[] method2307(byte arg0) {
        if (arg0 != 66) {
            this.method2242(-50, (class356) null, (class356) null);
        }
        ++field4878;
        return this.field5105;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Luh;II)V")
    private final void method2308(class166 arg0, int arg1, int arg2) {
        this.method2301(true, this.field5175, 0);
        ++field5013;
        this.method2285(1, this.field5176);
        int var4 = -34 % ((67 - arg2) / 46);
        this.method2209(0, 0, arg1, arg0);
    }

    @OriginalMember(owner = "client!ln", name = "O", descriptor = "(I)V")
    private final void method2309(int arg0) {
        ++field5041;
        this.field5087[14] = this.field5061;
        this.field5087[10] = this.field5146;
        this.field5084 = (this.field5087[14] + (float) (-this.field5092)) / this.field5087[10];
        if (arg0 != 32) {
            this.field5081 = -40;
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V")
    public final void method365(int arg0) {
        ++field4980;
        if (arg0 >= 128 && ~arg0 >= -1025) {
            if (this.field5154 != null) {
                this.field5154.method1509(-30128);
            }
            this.field5133 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ln", name = "x", descriptor = "()Ldfa;")
    public final class165 method422() {
        ++field4877;
        return this.field5172;
    }

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "()V")
    public final void method331() {
        ++field4943;
        if (this.field5154 != null) {
            this.field5154.method1509(-30128);
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method417(Canvas arg0) {
        this.field4887 = null;
        this.field4908 = null;
        ++field4867;
        if (arg0 != null && this.field4917 != arg0) {
            if (this.field4860.containsKey(arg0)) {
                this.field4887 = this.field4860.get(arg0);
                this.field4908 = arg0;
            }
        } else {
            this.field4887 = this.field4862;
            this.field4908 = this.field4917;
        }
        if (this.field4908 != null && this.field4887 != null) {
            this.method2270(this.field4908, 0, this.field4887);
            this.method2315(1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ldfa;)V")
    public final void method339(class165 arg0) {
        this.field5051 = (class427) arg0;
        ++field4972;
        this.field5053.method1028(this.field5051);
        this.field5053.method2652(0);
        this.field5054.method2665(this.field5053, true);
        this.field5052.method2665(this.field5051, true);
        if (this.field5137.method2083(5121)) {
            this.method2320(88);
        }
    }

    @OriginalMember(owner = "client!ln", name = "P", descriptor = "(I)V")
    private final void method2310(int arg0) {
        if (class424.field6160 == this.field5137) {
            float var2 = this.method2316((byte) 109);
            this.field5047.method2666(0.0F, var2, var2, (byte) 10);
        }
        ++field4866;
        this.field5069 = false;
        if (arg0 != 23893) {
            this.method2292(true);
        }
        this.method2278(true);
        if (this.field5128 != null) {
            this.field5128.method525(-7112);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
    public abstract Object method2311(int arg0, Canvas arg1);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "([Ltg;I)Lf;")
    public abstract class753 method2312(class231[] arg0, int arg1);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lwd;ILjm;)Z")
    public abstract boolean method2313(class272 arg0, int arg1, class687 arg2);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZIZ)Ljaclib/memory/heap/NativeHeapBuffer;")
    public final NativeHeapBuffer method2314(boolean arg0, int arg1, boolean arg2) {
        if (arg0) {
            this.field5109 = -119;
        }
        ++field5044;
        return this.field4934.method3806(arg1, arg2);
    }

    @OriginalMember(owner = "client!ln", name = "E", descriptor = "()I")
    public final int method406() {
        ++field4922;
        return this.field5049 + this.field5046 + this.field5050;
    }

    @OriginalMember(owner = "client!ln", name = "ra", descriptor = "(IIII)V")
    public final void method323(int arg0, int arg1, int arg2, int arg3) {
        this.field5145 = true;
        this.field5119 = arg3;
        this.field5058 = arg1;
        this.field5155 = arg0;
        ++field5035;
        this.field5104 = arg2;
    }

    @OriginalMember(owner = "client!ln", name = "Q", descriptor = "(I)V")
    private final void method2315(int arg0) {
        if (this.field4908 != null) {
            Dimension var2 = this.field4908.getSize();
            this.field4978 = var2.height;
            this.field4929 = var2.width;
        } else {
            this.field4929 = this.field4978 = 1;
        }
        ++field4993;
        this.field4875 = this.field4978;
        this.field4912 = this.field4929;
        this.method2261(123);
        this.method2231(83);
        this.method2321((byte) -81);
        this.method2200(arg0);
        this.method2244(-26536);
        this.method2290(-8);
        this.method393();
    }

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "()Z")
    public final boolean method359() {
        ++field5017;
        return true;
    }

    @OriginalMember(owner = "client!ln", name = "B", descriptor = "(B)F")
    public abstract float method2316(byte arg0);

    @OriginalMember(owner = "client!ln", name = "R", descriptor = "(I)V")
    public abstract void method2317(int arg0);

    @OriginalMember(owner = "client!ln", name = "q", descriptor = "()Z")
    public final boolean method394() {
        ++field4982;
        return this.field5059[3].method26(13326);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BZZILpt;)V")
    public abstract void method2318(byte arg0, boolean arg1, boolean arg2, int arg3, class529 arg4);

    @OriginalMember(owner = "client!ln", name = "C", descriptor = "(B)V")
    private final void method2319(byte arg0) {
        if (arg0 == -122) {
            ++field4904;
            if (!this.field5102) {
                float[] var2 = this.field5120;
                float var3 = (float) this.field5151;
                float var4 = (float) this.field5092;
                float var5 = (float) (-this.field5131) * this.field5129 / (float) this.field5115;
                float var6 = (float) (-this.field5124) * this.field5129 / (float) this.field5126;
                float var7 = (float) (this.field4912 - this.field5124) * this.field5129 / (float) this.field5126;
                float var8 = (float) (-this.field5131 + this.field4875) * this.field5129 / (float) this.field5115;
                if (var6 != var7 && var5 != var8) {
                    var2[3] = 0.0F;
                    var2[15] = 1.0F;
                    var2[11] = 0.0F;
                    var2[9] = 0.0F;
                    var2[14] = var3 / (-var4 + var3);
                    var2[6] = 0.0F;
                    var2[7] = 0.0F;
                    var2[12] = (var6 + var7) / (var6 - var7);
                    var2[8] = 0.0F;
                    var2[4] = 0.0F;
                    var2[2] = 0.0F;
                    var2[0] = 2.0F / (var7 - var6);
                    var2[5] = 2.0F / (var8 - var5);
                    var2[1] = 0.0F;
                    var2[10] = 1.0F / (var3 - var4);
                    var2[13] = (var5 + var8) / (-var5 + var8);
                } else {
                    var2[4] = 0.0F;
                    var2[0] = 1.0F;
                    var2[13] = 0.0F;
                    var2[14] = 0.0F;
                    var2[7] = 0.0F;
                    var2[6] = 0.0F;
                    var2[15] = 1.0F;
                    var2[10] = 1.0F;
                    var2[3] = 0.0F;
                    var2[5] = 1.0F;
                    var2[2] = 0.0F;
                    var2[11] = 0.0F;
                    var2[12] = 0.0F;
                    var2[1] = 0.0F;
                    var2[8] = 0.0F;
                    var2[9] = 0.0F;
                }
                this.method2265(arg0 + 173);
                this.field5102 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "K", descriptor = "([I)V")
    public final void method354(int[] arg0) {
        arg0[0] = this.field5081;
        arg0[1] = this.field5142;
        arg0[3] = this.field5110;
        arg0[2] = this.field5143;
        ++field4999;
    }

    @OriginalMember(owner = "client!ln", name = "S", descriptor = "(I)V")
    private final void method2320(int arg0) {
        this.field5069 = false;
        ++field4933;
        int var2 = 75 / ((arg0 - 31) / 51);
        if (this.field5128 != null) {
            this.field5128.method527((byte) 46);
        }
        this.method2250((byte) 100);
    }

    @OriginalMember(owner = "client!ln", name = "D", descriptor = "(B)V")
    private final void method2321(byte arg0) {
        if (arg0 >= -59) {
            this.method361(-5, -48, 45, 56, 21, -17, -96);
        }
        this.field5102 = false;
        ++field4901;
        this.method2319((byte) -122);
        if (class704.field9923 == this.field5137) {
            this.method2260((byte) -96);
        }
    }

    @OriginalMember(owner = "client!ln", name = "T", descriptor = "(I)I")
    public final int method2322(int arg0) {
        if (arg0 != 0) {
            this.method2305((byte) 60);
        }
        ++field4892;
        return this.field5058;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "([BLwd;IIIZ)Loq;")
    public final class358 method2323(byte[] arg0, class272 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = 97 / ((arg4 - -21) / 61);
        ++field4958;
        return this.method2253(arg5, arg2, 0, arg0, arg3, arg1, -118, 0);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lpca;)V")
    public final void method391(class713 arg0) {
        this.field5107.method1116(arg0, true, -1, this);
        ++field4938;
    }

    @OriginalMember(owner = "client!ln", name = "da", descriptor = "(III[I)V")
    public final void method436(int arg0, int arg1, int arg2, int[] arg3) {
        ++field4954;
        float var5 = this.field5051.method2669(3, (float) arg2, (float) arg0, (float) arg1);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field5124;
            var7 = this.field5131;
        } else {
            var6 = (int) ((float) this.field5126 * this.field5051.method2654((float) arg1, (float) arg2, (float) arg0, (byte) -125) / var5);
            var7 = (int) ((float) this.field5115 * this.field5051.method2674((float) arg2, (float) arg0, (float) arg1, 27065) / var5);
        }
        arg3[0] = (int) ((float) var6 - this.field5106);
        arg3[2] = (int) var5;
        arg3[1] = (int) ((float) var7 - this.field5072);
    }

    @OriginalMember(owner = "client!ln", name = "Y", descriptor = "()[I")
    public final int[] method327() {
        ++field4981;
        return new int[] { this.field5124, this.field5131, this.field5126, this.field5115 };
    }

    @OriginalMember(owner = "client!ln", name = "E", descriptor = "(B)V")
    public abstract void method2324(byte arg0);

    @OriginalMember(owner = "client!ln", name = "XA", descriptor = "()I")
    public final int method435() {
        ++field4931;
        return this.field5092;
    }

    @OriginalMember(owner = "client!ln", name = "U", descriptor = "(I)V")
    private final void method2325(int arg0) {
        if (arg0 != -8) {
            this.method339((class165) null);
        }
        if (class503.field7072 != this.field5137) {
            class352 var2 = this.field5137;
            this.field5137 = class503.field7072;
            if (!var2.method2083(5121)) {
                this.method2320(120);
            }
            this.method2208((byte) -14);
            this.field5118 = this.field5087;
            this.method2260((byte) -100);
            this.field5090 &= -8;
        }
        ++field4937;
    }
}
