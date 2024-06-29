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

@OriginalClass("client!dh")
public abstract class class338 extends class66 {
   @OriginalMember(
      owner = "client!dh",
      name = "bg",
      descriptor = "Lum;"
   )
   private class550 field4901;
   @OriginalMember(
      owner = "client!dh",
      name = "ag",
      descriptor = "Z"
   )
   public boolean field4997;
   @OriginalMember(
      owner = "client!dh",
      name = "Xf",
      descriptor = "Lso;"
   )
   public class495 field4998;
   @OriginalMember(
      owner = "client!dh",
      name = "td",
      descriptor = "Lso;"
   )
   public class495 field5001;
   @OriginalMember(
      owner = "client!dh",
      name = "Jb",
      descriptor = "Lso;"
   )
   public class495 field5002;
   @OriginalMember(
      owner = "client!dh",
      name = "Ld",
      descriptor = "Lso;"
   )
   public class495 field5003;
   @OriginalMember(
      owner = "client!dh",
      name = "C",
      descriptor = "Lso;"
   )
   private class495 field5004;
   @OriginalMember(
      owner = "client!dh",
      name = "Nc",
      descriptor = "Lso;"
   )
   private class495 field5005;
   @OriginalMember(
      owner = "client!dh",
      name = "Xe",
      descriptor = "Z"
   )
   public boolean field5006;
   @OriginalMember(
      owner = "client!dh",
      name = "Yd",
      descriptor = "[F"
   )
   private float[] field5012;
   @OriginalMember(
      owner = "client!dh",
      name = "dg",
      descriptor = "I"
   )
   private int field5021;
   @OriginalMember(
      owner = "client!dh",
      name = "Fe",
      descriptor = "I"
   )
   public int field5013;
   @OriginalMember(
      owner = "client!dh",
      name = "kf",
      descriptor = "Z"
   )
   private boolean field5017;
   @OriginalMember(
      owner = "client!dh",
      name = "db",
      descriptor = "F"
   )
   public float field5024;
   @OriginalMember(
      owner = "client!dh",
      name = "Le",
      descriptor = "I"
   )
   public int field5033;
   @OriginalMember(
      owner = "client!dh",
      name = "gd",
      descriptor = "Lpd;"
   )
   public class268 field5018;
   @OriginalMember(
      owner = "client!dh",
      name = "og",
      descriptor = "I"
   )
   private int field5014;
   @OriginalMember(
      owner = "client!dh",
      name = "ib",
      descriptor = "I"
   )
   public int field5016;
   @OriginalMember(
      owner = "client!dh",
      name = "Tb",
      descriptor = "I"
   )
   public int field5044;
   @OriginalMember(
      owner = "client!dh",
      name = "Ke",
      descriptor = "Z"
   )
   public boolean field5048;
   @OriginalMember(
      owner = "client!dh",
      name = "Db",
      descriptor = "[F"
   )
   public float[] field5023;
   @OriginalMember(
      owner = "client!dh",
      name = "kd",
      descriptor = "[F"
   )
   private float[] field5041;
   @OriginalMember(
      owner = "client!dh",
      name = "wc",
      descriptor = "I"
   )
   private int field5058;
   @OriginalMember(
      owner = "client!dh",
      name = "Uc",
      descriptor = "Z"
   )
   public boolean field5054;
   @OriginalMember(
      owner = "client!dh",
      name = "B",
      descriptor = "I"
   )
   private int field5043;
   @OriginalMember(
      owner = "client!dh",
      name = "ig",
      descriptor = "I"
   )
   public int field5038;
   @OriginalMember(
      owner = "client!dh",
      name = "Rb",
      descriptor = "F"
   )
   public float field5062;
   @OriginalMember(
      owner = "client!dh",
      name = "Sb",
      descriptor = "[F"
   )
   private float[] field5061;
   @OriginalMember(
      owner = "client!dh",
      name = "Kd",
      descriptor = "[F"
   )
   private float[] field5068;
   @OriginalMember(
      owner = "client!dh",
      name = "G",
      descriptor = "Z"
   )
   public boolean field5066;
   @OriginalMember(
      owner = "client!dh",
      name = "Hb",
      descriptor = "I"
   )
   private int field5039;
   @OriginalMember(
      owner = "client!dh",
      name = "lg",
      descriptor = "I"
   )
   private int field5070;
   @OriginalMember(
      owner = "client!dh",
      name = "Ye",
      descriptor = "F"
   )
   public float field5059;
   @OriginalMember(
      owner = "client!dh",
      name = "Me",
      descriptor = "[F"
   )
   private float[] field5060;
   @OriginalMember(
      owner = "client!dh",
      name = "Id",
      descriptor = "F"
   )
   public float field5072;
   @OriginalMember(
      owner = "client!dh",
      name = "Vb",
      descriptor = "I"
   )
   public int field5080;
   @OriginalMember(
      owner = "client!dh",
      name = "T",
      descriptor = "[F"
   )
   public float[] field5031;
   @OriginalMember(
      owner = "client!dh",
      name = "Eb",
      descriptor = "Z"
   )
   private boolean field5073;
   @OriginalMember(
      owner = "client!dh",
      name = "Ef",
      descriptor = "F"
   )
   public float field5047;
   @OriginalMember(
      owner = "client!dh",
      name = "Ae",
      descriptor = "Lcha;"
   )
   public class227 field5079;
   @OriginalMember(
      owner = "client!dh",
      name = "tg",
      descriptor = "[F"
   )
   public float[] field5057;
   @OriginalMember(
      owner = "client!dh",
      name = "E",
      descriptor = "I"
   )
   public int field5069;
   @OriginalMember(
      owner = "client!dh",
      name = "yb",
      descriptor = "I"
   )
   public int field5087;
   @OriginalMember(
      owner = "client!dh",
      name = "Ze",
      descriptor = "[F"
   )
   private float[] field5081;
   @OriginalMember(
      owner = "client!dh",
      name = "Pc",
      descriptor = "Z"
   )
   public boolean field5090;
   @OriginalMember(
      owner = "client!dh",
      name = "Uf",
      descriptor = "I"
   )
   public int field5091;
   @OriginalMember(
      owner = "client!dh",
      name = "Of",
      descriptor = "I"
   )
   private int field5078;
   @OriginalMember(
      owner = "client!dh",
      name = "sc",
      descriptor = "I"
   )
   public int field5025;
   @OriginalMember(
      owner = "client!dh",
      name = "qf",
      descriptor = "I"
   )
   private int field5097;
   @OriginalMember(
      owner = "client!dh",
      name = "sb",
      descriptor = "Z"
   )
   private boolean field5094;
   @OriginalMember(
      owner = "client!dh",
      name = "we",
      descriptor = "I"
   )
   public int field5077;
   @OriginalMember(
      owner = "client!dh",
      name = "he",
      descriptor = "I"
   )
   public int field5101;
   @OriginalMember(
      owner = "client!dh",
      name = "ef",
      descriptor = "Z"
   )
   public boolean field5100;
   @OriginalMember(
      owner = "client!dh",
      name = "Xd",
      descriptor = "I"
   )
   public int field5103;
   @OriginalMember(
      owner = "client!dh",
      name = "Yb",
      descriptor = "I"
   )
   public int field5028;
   @OriginalMember(
      owner = "client!dh",
      name = "Hf",
      descriptor = "Z"
   )
   private boolean field5095;
   @OriginalMember(
      owner = "client!dh",
      name = "Bd",
      descriptor = "Z"
   )
   public boolean field5092;
   @OriginalMember(
      owner = "client!dh",
      name = "J",
      descriptor = "I"
   )
   public int field5096;
   @OriginalMember(
      owner = "client!dh",
      name = "x",
      descriptor = "I"
   )
   private int field5065;
   @OriginalMember(
      owner = "client!dh",
      name = "Ib",
      descriptor = "I"
   )
   public int field5083;
   @OriginalMember(
      owner = "client!dh",
      name = "Re",
      descriptor = "F"
   )
   public float field5102;
   @OriginalMember(
      owner = "client!dh",
      name = "Qc",
      descriptor = "Z"
   )
   private boolean field5098;
   @OriginalMember(
      owner = "client!dh",
      name = "Mb",
      descriptor = "Z"
   )
   public boolean field5085;
   @OriginalMember(
      owner = "client!dh",
      name = "cc",
      descriptor = "[Lcd;"
   )
   private class331[] field5053;
   @OriginalMember(
      owner = "client!dh",
      name = "A",
      descriptor = "I"
   )
   public int field5011;
   @OriginalMember(
      owner = "client!dh",
      name = "qb",
      descriptor = "F"
   )
   private float field5007;
   @OriginalMember(
      owner = "client!dh",
      name = "Ac",
      descriptor = "F"
   )
   public float field5082;
   @OriginalMember(
      owner = "client!dh",
      name = "cg",
      descriptor = "Z"
   )
   public boolean field5106;
   @OriginalMember(
      owner = "client!dh",
      name = "tc",
      descriptor = "Z"
   )
   private boolean field5099;
   @OriginalMember(
      owner = "client!dh",
      name = "Od",
      descriptor = "F"
   )
   public float field5071;
   @OriginalMember(
      owner = "client!dh",
      name = "De",
      descriptor = "I"
   )
   public int field5086;
   @OriginalMember(
      owner = "client!dh",
      name = "Rf",
      descriptor = "I"
   )
   public int field5089;
   @OriginalMember(
      owner = "client!dh",
      name = "fc",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field5035;
   @OriginalMember(
      owner = "client!dh",
      name = "bc",
      descriptor = "Lso;"
   )
   private class495 field5117;
   @OriginalMember(
      owner = "client!dh",
      name = "Ad",
      descriptor = "Leaa;"
   )
   public class526 field4949;
   @OriginalMember(
      owner = "client!dh",
      name = "of",
      descriptor = "Ljava/awt/Canvas;"
   )
   public Canvas field4818;
   @OriginalMember(
      owner = "client!dh",
      name = "Q",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field4825;
   @OriginalMember(
      owner = "client!dh",
      name = "If",
      descriptor = "Ljava/lang/Object;"
   )
   public Object field4964;
   @OriginalMember(
      owner = "client!dh",
      name = "Gf",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field4947;
   @OriginalMember(
      owner = "client!dh",
      name = "ec",
      descriptor = "I"
   )
   public int field5049;
   @OriginalMember(
      owner = "client!dh",
      name = "ee",
      descriptor = "I"
   )
   private int field4851;
   @OriginalMember(
      owner = "client!dh",
      name = "ud",
      descriptor = "I"
   )
   public int field4938;
   @OriginalMember(
      owner = "client!dh",
      name = "Xc",
      descriptor = "I"
   )
   private int field4922;
   @OriginalMember(
      owner = "client!dh",
      name = "Qd",
      descriptor = "I"
   )
   public int field4861;
   @OriginalMember(
      owner = "client!dh",
      name = "vb",
      descriptor = "I"
   )
   public int field5034;
   @OriginalMember(
      owner = "client!dh",
      name = "id",
      descriptor = "Lpb;"
   )
   private class681 field5067;
   @OriginalMember(
      owner = "client!dh",
      name = "ng",
      descriptor = "Ljagex3/graphics2/hw/NativeInterface;"
   )
   public NativeInterface field4872;
   @OriginalMember(
      owner = "client!dh",
      name = "Bg",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5131 = new String[]{method2684(method2683("qMM\u0002Y=")), method2684(method2683("qMM\u0013Q=")), method2684(method2683("{P\u000f;")), method2684(method2683("qMM\u0015\\=")), method2684(method2683("n\u000bMye")), method2684(method2683("qMM\u0006Y=")), method2684(method2683("qMM\u001fQ=")), method2684(method2683("qMM\u00000")), method2684(method2683("qMM\u0007P=")), method2684(method2683("qMM\u001f0")), method2684(method2683("qMM\u0012_=")), method2684(method2683("qMM\u0012[=")), method2684(method2683("qMM\u001fY=")), method2684(method2683("qMM\u001fP=")), method2684(method2683("qMM\u0014Q=")), method2684(method2683("qMM\u0003Q=")), method2684(method2683("qMM\u000f0")), method2684(method2683("qMM\u0001Z=")), method2684(method2683("qMM\u00150")), method2684(method2683("qMM\u0018Z=")), method2684(method2683("qMM\u0012Y=")), method2684(method2683("qMM\u00070")), method2684(method2683("qMM\u00120")), method2684(method2683("qMM\u00100")), method2684(method2683("qMM\u0012Q=")), method2684(method2683("qMM\u0004_=")), method2684(method2683("qMM\u0001[=")), method2684(method2683("qMM\u0016P=")), method2684(method2683("qMM\u0007Z=")), method2684(method2683("qMM\u0001Y=")), method2684(method2683("qMM\u0011Z=")), method2684(method2683("qMM\u0013\\=")), method2684(method2683("qMM\u0006_=")), method2684(method2683("qMM\u0011R=")), method2684(method2683("qMM\u0005P=")), method2684(method2683("qMM\u00020")), method2684(method2683("qMM\u0014_=")), method2684(method2683("qMM\u001cP=")), method2684(method2683("qMM\u0001_=")), method2684(method2683("qMM\u0019Q=")), method2684(method2683("qMM\u0001Q=")), method2684(method2683("qMM\u0000Z=")), method2684(method2683("qMM\u0002^=")), method2684(method2683("qMM\u001f_=")), method2684(method2683("qMM\u0015Q=")), method2684(method2683("qMM\u0014P=")), method2684(method2683("qMM\u0019[=")), method2684(method2683("qMM\u0002_=")), method2684(method2683("qMM%0")), method2684(method2683("qMM\u0016Z=")), method2684(method2683("qMM\u001eR=")), method2684(method2683("qMM\u0014R=")), method2684(method2683("qMM\u0010[=")), method2684(method2683("qMM\u0018Q=")), method2684(method2683("qMM\u0018P=")), method2684(method2683("qMM%y=")), method2684(method2683("qMMkq{L\u0017i0")), method2684(method2683("qMM\u0011Q=")), method2684(method2683("qMM\u0011\\=")), method2684(method2683("qMM\u0013R=")), method2684(method2683("qMM>0")), method2684(method2683("qMM\u0012R=")), method2684(method2683("qMM\u0019Y=")), method2684(method2683("qMM\u001eQ=")), method2684(method2683("qMM\u0018_=")), method2684(method2683("qMM\u0010R=")), method2684(method2683("qMM\u001fZ=")), method2684(method2683("qMM\u0013_=")), method2684(method2683("qMM\u0002P=")), method2684(method2683("qMM\u001c_=")), method2684(method2683("qMM\u001c[=")), method2684(method2683("qMM\u0015R=")), method2684(method2683("qMM\u0001^=")), method2684(method2683("qMM\u001eZ=")), method2684(method2683("qMM\u0012P=")), method2684(method2683("qMM\u001dP=")), method2684(method2683("qMM\u001b0")), method2684(method2683("qMM\u00010")), method2684(method2683("qMM\u001cQ=")), method2684(method2683("qMM\u0003[=")), method2684(method2683("qMM\u0001]=")), method2684(method2683("qMM\u001dR=")), method2684(method2683("qMM\u0019_=")), method2684(method2683("qMM\u001c0")), method2684(method2683("qMM\u0010Z=")), method2684(method2683("qMM\u0006Z=")), method2684(method2683("qMM10")), method2684(method2683("qMM\u000fY=")), method2684(method2683("qMM\u001b_=")), method2684(method2683("qMM\u001dQ=")), method2684(method2683("qMM\u0016R=")), method2684(method2683("qMM\u000e0")), method2684(method2683("qMM\u0001P=")), method2684(method2683("qMM\u0011P=")), method2684(method2683("qMM\u0004P=")), method2684(method2683("qMM\u0004Q=")), method2684(method2683("qMM\u0010_=")), method2684(method2683("qMM\u0016_=")), method2684(method2683("qMM\u001d_=")), method2684(method2683("qMM\u001aP=")), method2684(method2683("qMM\u0016Q=")), method2684(method2683("qMM\u0015P=")), method2684(method2683("qMM\u0007Q=")), method2684(method2683("qMM\u0000Y=")), method2684(method2683("qMM\u001a[=")), method2684(method2683("qMM\u0005Y=")), method2684(method2683("qMM\u001bQ=")), method2684(method2683("qMM\u001dY=")), method2684(method2683("qMM\u00140")), method2684(method2683("qMM\u0007[=")), method2684(method2683("qMM'y=")), method2684(method2683("qMM\u0000^=")), method2684(method2683("qMM3y=")), method2684(method2683("qMM\u0012Z=")), method2684(method2683("qMM\u0006Q=")), method2684(method2683("qMM\u0019P=")), method2684(method2683("qMM\u001aQ=")), method2684(method2683("qMM\u0018[=")), method2684(method2683("qMM\u0006P=")), method2684(method2683("qMM\u0015[=")), method2684(method2683("qMM\u0010\\=")), method2684(method2683("qMM\u00060")), method2684(method2683("qMM\u0000Q=")), method2684(method2683("qMM\u0000[=")), method2684(method2683("qMM\u001eP=")), method2684(method2683("f@\u0017\u001e\u007f{J\u00112JpU\u0002>va")), method2684(method2683("\u007fD\u001566tR\u0017y[tK\u00156k")), method2684(method2683("qMM\u001dZ=")), method2684(method2683("qMM\u0005_=")), method2684(method2683("qMM\u001cY=")), method2684(method2683("qMM\u0010P=")), method2684(method2683("qMM\u0003\\=")), method2684(method2683("qMM-y=")), method2684(method2683("qMM\u0012\\=")), method2684(method2683("qMM\u0011[=")), method2684(method2683("qMM\u0013Z=")), method2684(method2683("qMM\u001d[=")), method2684(method2683("qMM\u0000_=")), method2684(method2683("qMM\u0005Q=")), method2684(method2683("qMM\u0007_=")), method2684(method2683("qMM\u001a_=")), method2684(method2683("qMM\u00160")), method2684(method2683("qMM\u0016\\=")), method2684(method2683("qMM\u0003_=")), method2684(method2683("qMM\u0003Z=")), method2684(method2683("qMM\u00180")), method2684(method2683("qMM\u0019Z=")), method2684(method2683("qMM6y=")), method2684(method2683("qMM\u001fR=")), method2684(method2683("qMM\u0015_=")), method2684(method2683("qMM\u001f[=")), method2684(method2683("qMM\u00130")), method2684(method2683("qMM\u0014[=")), method2684(method2683("qMM\u0004[=")), method2684(method2683("qMM/y=")), method2684(method2683("qMM\u00030")), method2684(method2683("qMM\u00050")), method2684(method2683("qMM\u0000P=")), method2684(method2683("qMM\u0013P=")), method2684(method2683("qMM\u001cZ=")), method2684(method2683("qMM\u001aZ=")), method2684(method2683("qMM\rY=")), method2684(method2683("qMM\u001e_=")), method2684(method2683("qMM\u0002[=")), method2684(method2683("qMM\u0013Y=")), method2684(method2683("qMM\u0003P=")), method2684(method2683("qMM\u0010Q=")), method2684(method2683("qMM\u0015Z=")), method2684(method2683("qMM\u0006[=")), method2684(method2683("qMM\u0002Q=")), method2684(method2683("qMM;y=")), method2684(method2683("qMM\u0011_=")), method2684(method2683("qMM\u001a0")), method2684(method2683("qMM\u001eY=")), method2684(method2683("qMM\u001bP="))};
   @OriginalMember(
      owner = "client!dh",
      name = "qd",
      descriptor = "F"
   )
   public float field5020;
   @OriginalMember(
      owner = "client!dh",
      name = "wf",
      descriptor = "F"
   )
   public float field5022;
   @OriginalMember(
      owner = "client!dh",
      name = "Kf",
      descriptor = "F"
   )
   public float field5037;
   @OriginalMember(
      owner = "client!dh",
      name = "Jd",
      descriptor = "F"
   )
   public float field5074;
   @OriginalMember(
      owner = "client!dh",
      name = "pe",
      descriptor = "F"
   )
   private float field5075;
   @OriginalMember(
      owner = "client!dh",
      name = "Ud",
      descriptor = "F"
   )
   private float field5088;
   @OriginalMember(
      owner = "client!dh",
      name = "nc",
      descriptor = "F"
   )
   public float field5093;
   @OriginalMember(
      owner = "client!dh",
      name = "nf",
      descriptor = "F"
   )
   public float field5104;
   @OriginalMember(
      owner = "client!dh",
      name = "pb",
      descriptor = "I"
   )
   public static int field4811;
   @OriginalMember(
      owner = "client!dh",
      name = "Mc",
      descriptor = "I"
   )
   public static int field4812;
   @OriginalMember(
      owner = "client!dh",
      name = "Yf",
      descriptor = "I"
   )
   public static int field4813;
   @OriginalMember(
      owner = "client!dh",
      name = "be",
      descriptor = "I"
   )
   public static int field4814;
   @OriginalMember(
      owner = "client!dh",
      name = "Z",
      descriptor = "I"
   )
   public static int field4815;
   @OriginalMember(
      owner = "client!dh",
      name = "Nb",
      descriptor = "I"
   )
   public static int field4816;
   @OriginalMember(
      owner = "client!dh",
      name = "Ic",
      descriptor = "I"
   )
   public static int field4817;
   @OriginalMember(
      owner = "client!dh",
      name = "ub",
      descriptor = "I"
   )
   public static int field4819;
   @OriginalMember(
      owner = "client!dh",
      name = "Ff",
      descriptor = "I"
   )
   public static int field4820;
   @OriginalMember(
      owner = "client!dh",
      name = "rb",
      descriptor = "I"
   )
   public static int field4821;
   @OriginalMember(
      owner = "client!dh",
      name = "s",
      descriptor = "I"
   )
   public static int field4822;
   @OriginalMember(
      owner = "client!dh",
      name = "Pe",
      descriptor = "I"
   )
   public static int field4823;
   @OriginalMember(
      owner = "client!dh",
      name = "Ge",
      descriptor = "I"
   )
   public static int field4824;
   @OriginalMember(
      owner = "client!dh",
      name = "ne",
      descriptor = "I"
   )
   public static int field4826;
   @OriginalMember(
      owner = "client!dh",
      name = "rc",
      descriptor = "I"
   )
   public static int field4827;
   @OriginalMember(
      owner = "client!dh",
      name = "Cd",
      descriptor = "I"
   )
   public static int field4828;
   @OriginalMember(
      owner = "client!dh",
      name = "ve",
      descriptor = "I"
   )
   public static int field4829;
   @OriginalMember(
      owner = "client!dh",
      name = "fd",
      descriptor = "I"
   )
   public static int field4830;
   @OriginalMember(
      owner = "client!dh",
      name = "Zf",
      descriptor = "I"
   )
   public static int field4831;
   @OriginalMember(
      owner = "client!dh",
      name = "re",
      descriptor = "I"
   )
   public static int field4832;
   @OriginalMember(
      owner = "client!dh",
      name = "fg",
      descriptor = "I"
   )
   public static int field4833;
   @OriginalMember(
      owner = "client!dh",
      name = "qc",
      descriptor = "I"
   )
   public static int field4834;
   @OriginalMember(
      owner = "client!dh",
      name = "Gb",
      descriptor = "I"
   )
   public static int field4835;
   @OriginalMember(
      owner = "client!dh",
      name = "Gc",
      descriptor = "I"
   )
   public static int field4836;
   @OriginalMember(
      owner = "client!dh",
      name = "t",
      descriptor = "I"
   )
   public static int field4837;
   @OriginalMember(
      owner = "client!dh",
      name = "df",
      descriptor = "I"
   )
   public static int field4838;
   @OriginalMember(
      owner = "client!dh",
      name = "Pd",
      descriptor = "I"
   )
   public static int field4839;
   @OriginalMember(
      owner = "client!dh",
      name = "w",
      descriptor = "I"
   )
   public static int field4840;
   @OriginalMember(
      owner = "client!dh",
      name = "Jc",
      descriptor = "I"
   )
   public static int field4841;
   @OriginalMember(
      owner = "client!dh",
      name = "Wc",
      descriptor = "I"
   )
   public static int field4842;
   @OriginalMember(
      owner = "client!dh",
      name = "Oc",
      descriptor = "I"
   )
   public static int field4844;
   @OriginalMember(
      owner = "client!dh",
      name = "Ee",
      descriptor = "I"
   )
   public static int field4845;
   @OriginalMember(
      owner = "client!dh",
      name = "X",
      descriptor = "I"
   )
   public static int field4846;
   @OriginalMember(
      owner = "client!dh",
      name = "tb",
      descriptor = "I"
   )
   public static int field4847;
   @OriginalMember(
      owner = "client!dh",
      name = "uf",
      descriptor = "I"
   )
   public static int field4848;
   @OriginalMember(
      owner = "client!dh",
      name = "vf",
      descriptor = "I"
   )
   public static int field4849;
   @OriginalMember(
      owner = "client!dh",
      name = "Qb",
      descriptor = "I"
   )
   public static int field4850;
   @OriginalMember(
      owner = "client!dh",
      name = "tf",
      descriptor = "I"
   )
   public static int field4852;
   @OriginalMember(
      owner = "client!dh",
      name = "L",
      descriptor = "I"
   )
   public static int field4853;
   @OriginalMember(
      owner = "client!dh",
      name = "xg",
      descriptor = "I"
   )
   public static int field4854;
   @OriginalMember(
      owner = "client!dh",
      name = "mc",
      descriptor = "I"
   )
   public static int field4855;
   @OriginalMember(
      owner = "client!dh",
      name = "cf",
      descriptor = "I"
   )
   public static int field4856;
   @OriginalMember(
      owner = "client!dh",
      name = "fe",
      descriptor = "I"
   )
   public static int field4857;
   @OriginalMember(
      owner = "client!dh",
      name = "ie",
      descriptor = "I"
   )
   public static int field4858;
   @OriginalMember(
      owner = "client!dh",
      name = "rg",
      descriptor = "I"
   )
   public static int field4859;
   @OriginalMember(
      owner = "client!dh",
      name = "ke",
      descriptor = "I"
   )
   public static int field4860;
   @OriginalMember(
      owner = "client!dh",
      name = "od",
      descriptor = "I"
   )
   public static int field4862;
   @OriginalMember(
      owner = "client!dh",
      name = "ye",
      descriptor = "I"
   )
   public static int field4863;
   @OriginalMember(
      owner = "client!dh",
      name = "Ue",
      descriptor = "I"
   )
   public static int field4864;
   @OriginalMember(
      owner = "client!dh",
      name = "hb",
      descriptor = "I"
   )
   public static int field4865;
   @OriginalMember(
      owner = "client!dh",
      name = "ue",
      descriptor = "I"
   )
   public static int field4866;
   @OriginalMember(
      owner = "client!dh",
      name = "dc",
      descriptor = "I"
   )
   public static int field4867;
   @OriginalMember(
      owner = "client!dh",
      name = "me",
      descriptor = "I"
   )
   public static int field4868;
   @OriginalMember(
      owner = "client!dh",
      name = "Sc",
      descriptor = "I"
   )
   public static int field4869;
   @OriginalMember(
      owner = "client!dh",
      name = "Bf",
      descriptor = "I"
   )
   public static int field4870;
   @OriginalMember(
      owner = "client!dh",
      name = "z",
      descriptor = "I"
   )
   public static int field4871;
   @OriginalMember(
      owner = "client!dh",
      name = "jf",
      descriptor = "I"
   )
   public static int field4873;
   @OriginalMember(
      owner = "client!dh",
      name = "jb",
      descriptor = "I"
   )
   public static int field4874;
   @OriginalMember(
      owner = "client!dh",
      name = "vd",
      descriptor = "I"
   )
   public static int field4875;
   @OriginalMember(
      owner = "client!dh",
      name = "pf",
      descriptor = "I"
   )
   public static int field4876;
   @OriginalMember(
      owner = "client!dh",
      name = "I",
      descriptor = "I"
   )
   public static int field4877;
   @OriginalMember(
      owner = "client!dh",
      name = "Dc",
      descriptor = "I"
   )
   public static int field4878;
   @OriginalMember(
      owner = "client!dh",
      name = "Wd",
      descriptor = "I"
   )
   public static int field4879;
   @OriginalMember(
      owner = "client!dh",
      name = "Ve",
      descriptor = "I"
   )
   public static int field4880;
   @OriginalMember(
      owner = "client!dh",
      name = "D",
      descriptor = "I"
   )
   public static int field4881;
   @OriginalMember(
      owner = "client!dh",
      name = "Ab",
      descriptor = "I"
   )
   public static int field4882;
   @OriginalMember(
      owner = "client!dh",
      name = "Wf",
      descriptor = "I"
   )
   public static int field4883;
   @OriginalMember(
      owner = "client!dh",
      name = "Lc",
      descriptor = "I"
   )
   public static int field4884;
   @OriginalMember(
      owner = "client!dh",
      name = "cb",
      descriptor = "I"
   )
   public static int field4885;
   @OriginalMember(
      owner = "client!dh",
      name = "Ag",
      descriptor = "I"
   )
   public static int field4886;
   @OriginalMember(
      owner = "client!dh",
      name = "Vc",
      descriptor = "I"
   )
   public static int field4887;
   @OriginalMember(
      owner = "client!dh",
      name = "fb",
      descriptor = "I"
   )
   public static int field4888;
   @OriginalMember(
      owner = "client!dh",
      name = "Ne",
      descriptor = "I"
   )
   public static int field4889;
   @OriginalMember(
      owner = "client!dh",
      name = "af",
      descriptor = "I"
   )
   public static int field4890;
   @OriginalMember(
      owner = "client!dh",
      name = "Td",
      descriptor = "I"
   )
   public static int field4891;
   @OriginalMember(
      owner = "client!dh",
      name = "pc",
      descriptor = "I"
   )
   public static int field4892;
   @OriginalMember(
      owner = "client!dh",
      name = "xf",
      descriptor = "I"
   )
   public static int field4893;
   @OriginalMember(
      owner = "client!dh",
      name = "Je",
      descriptor = "I"
   )
   public static int field4894;
   @OriginalMember(
      owner = "client!dh",
      name = "pg",
      descriptor = "I"
   )
   public static int field4895;
   @OriginalMember(
      owner = "client!dh",
      name = "yg",
      descriptor = "I"
   )
   public static int field4896;
   @OriginalMember(
      owner = "client!dh",
      name = "nb",
      descriptor = "I"
   )
   public static int field4897;
   @OriginalMember(
      owner = "client!dh",
      name = "Md",
      descriptor = "I"
   )
   public static int field4898;
   @OriginalMember(
      owner = "client!dh",
      name = "H",
      descriptor = "I"
   )
   public static int field4899;
   @OriginalMember(
      owner = "client!dh",
      name = "Tc",
      descriptor = "I"
   )
   public static int field4900;
   @OriginalMember(
      owner = "client!dh",
      name = "Wb",
      descriptor = "I"
   )
   public static int field4902;
   @OriginalMember(
      owner = "client!dh",
      name = "S",
      descriptor = "I"
   )
   public static int field4903;
   @OriginalMember(
      owner = "client!dh",
      name = "Hd",
      descriptor = "I"
   )
   public static int field4904;
   @OriginalMember(
      owner = "client!dh",
      name = "uc",
      descriptor = "I"
   )
   public static int field4905;
   @OriginalMember(
      owner = "client!dh",
      name = "ld",
      descriptor = "I"
   )
   public static int field4907;
   @OriginalMember(
      owner = "client!dh",
      name = "zg",
      descriptor = "I"
   )
   public static int field4908;
   @OriginalMember(
      owner = "client!dh",
      name = "Vf",
      descriptor = "I"
   )
   public static int field4909;
   @OriginalMember(
      owner = "client!dh",
      name = "ff",
      descriptor = "I"
   )
   public static int field4910;
   @OriginalMember(
      owner = "client!dh",
      name = "Ec",
      descriptor = "I"
   )
   public static int field4911;
   @OriginalMember(
      owner = "client!dh",
      name = "Nf",
      descriptor = "I"
   )
   public static int field4912;
   @OriginalMember(
      owner = "client!dh",
      name = "Te",
      descriptor = "I"
   )
   public static int field4913;
   @OriginalMember(
      owner = "client!dh",
      name = "wg",
      descriptor = "I"
   )
   public static int field4914;
   @OriginalMember(
      owner = "client!dh",
      name = "Y",
      descriptor = "I"
   )
   public static int field4915;
   @OriginalMember(
      owner = "client!dh",
      name = "K",
      descriptor = "I"
   )
   public static int field4916;
   @OriginalMember(
      owner = "client!dh",
      name = "ae",
      descriptor = "I"
   )
   public static int field4917;
   @OriginalMember(
      owner = "client!dh",
      name = "yd",
      descriptor = "I"
   )
   public static int field4918;
   @OriginalMember(
      owner = "client!dh",
      name = "Tf",
      descriptor = "I"
   )
   public static int field4919;
   @OriginalMember(
      owner = "client!dh",
      name = "u",
      descriptor = "I"
   )
   public static int field4920;
   @OriginalMember(
      owner = "client!dh",
      name = "ob",
      descriptor = "I"
   )
   public static int field4921;
   @OriginalMember(
      owner = "client!dh",
      name = "F",
      descriptor = "I"
   )
   public static int field4923;
   @OriginalMember(
      owner = "client!dh",
      name = "ug",
      descriptor = "I"
   )
   public static int field4924;
   @OriginalMember(
      owner = "client!dh",
      name = "zb",
      descriptor = "I"
   )
   public static int field4926;
   @OriginalMember(
      owner = "client!dh",
      name = "v",
      descriptor = "I"
   )
   public static int field4927;
   @OriginalMember(
      owner = "client!dh",
      name = "Cc",
      descriptor = "I"
   )
   public static int field4928;
   @OriginalMember(
      owner = "client!dh",
      name = "qg",
      descriptor = "I"
   )
   public static int field4929;
   @OriginalMember(
      owner = "client!dh",
      name = "xd",
      descriptor = "I"
   )
   public static int field4930;
   @OriginalMember(
      owner = "client!dh",
      name = "Ob",
      descriptor = "I"
   )
   public static int field4931;
   @OriginalMember(
      owner = "client!dh",
      name = "ab",
      descriptor = "I"
   )
   public static int field4932;
   @OriginalMember(
      owner = "client!dh",
      name = "Qe",
      descriptor = "I"
   )
   public static int field4933;
   @OriginalMember(
      owner = "client!dh",
      name = "gb",
      descriptor = "I"
   )
   public static int field4934;
   @OriginalMember(
      owner = "client!dh",
      name = "xb",
      descriptor = "I"
   )
   public static int field4935;
   @OriginalMember(
      owner = "client!dh",
      name = "mg",
      descriptor = "I"
   )
   public static int field4936;
   @OriginalMember(
      owner = "client!dh",
      name = "ac",
      descriptor = "I"
   )
   public static int field4937;
   @OriginalMember(
      owner = "client!dh",
      name = "rd",
      descriptor = "I"
   )
   public static int field4939;
   @OriginalMember(
      owner = "client!dh",
      name = "W",
      descriptor = "I"
   )
   public static int field4940;
   @OriginalMember(
      owner = "client!dh",
      name = "eb",
      descriptor = "I"
   )
   public static int field4941;
   @OriginalMember(
      owner = "client!dh",
      name = "bd",
      descriptor = "I"
   )
   public static int field4942;
   @OriginalMember(
      owner = "client!dh",
      name = "zf",
      descriptor = "I"
   )
   public static int field4943;
   @OriginalMember(
      owner = "client!dh",
      name = "Df",
      descriptor = "I"
   )
   public static int field4944;
   @OriginalMember(
      owner = "client!dh",
      name = "ze",
      descriptor = "I"
   )
   public static int field4945;
   @OriginalMember(
      owner = "client!dh",
      name = "Kc",
      descriptor = "I"
   )
   public static int field4946;
   @OriginalMember(
      owner = "client!dh",
      name = "vc",
      descriptor = "I"
   )
   public static int field4948;
   @OriginalMember(
      owner = "client!dh",
      name = "Be",
      descriptor = "I"
   )
   public static int field4950;
   @OriginalMember(
      owner = "client!dh",
      name = "O",
      descriptor = "I"
   )
   public static int field4951;
   @OriginalMember(
      owner = "client!dh",
      name = "vg",
      descriptor = "I"
   )
   public static int field4952;
   @OriginalMember(
      owner = "client!dh",
      name = "Cf",
      descriptor = "I"
   )
   public static int field4953;
   @OriginalMember(
      owner = "client!dh",
      name = "hf",
      descriptor = "I"
   )
   public static int field4954;
   @OriginalMember(
      owner = "client!dh",
      name = "lf",
      descriptor = "I"
   )
   public static int field4955;
   @OriginalMember(
      owner = "client!dh",
      name = "Oe",
      descriptor = "I"
   )
   public static int field4956;
   @OriginalMember(
      owner = "client!dh",
      name = "Pb",
      descriptor = "I"
   )
   public static int field4957;
   @OriginalMember(
      owner = "client!dh",
      name = "Nd",
      descriptor = "I"
   )
   public static int field4958;
   @OriginalMember(
      owner = "client!dh",
      name = "Yc",
      descriptor = "I"
   )
   public static int field4959;
   @OriginalMember(
      owner = "client!dh",
      name = "Pf",
      descriptor = "I"
   )
   public static int field4960;
   @OriginalMember(
      owner = "client!dh",
      name = "Ub",
      descriptor = "I"
   )
   public static int field4961;
   @OriginalMember(
      owner = "client!dh",
      name = "ed",
      descriptor = "I"
   )
   public static int field4962;
   @OriginalMember(
      owner = "client!dh",
      name = "mf",
      descriptor = "I"
   )
   public static int field4963;
   @OriginalMember(
      owner = "client!dh",
      name = "kc",
      descriptor = "I"
   )
   public static int field4965;
   @OriginalMember(
      owner = "client!dh",
      name = "Cb",
      descriptor = "I"
   )
   public static int field4966;
   @OriginalMember(
      owner = "client!dh",
      name = "Ce",
      descriptor = "I"
   )
   public static int field4967;
   @OriginalMember(
      owner = "client!dh",
      name = "Gd",
      descriptor = "I"
   )
   public static int field4968;
   @OriginalMember(
      owner = "client!dh",
      name = "P",
      descriptor = "I"
   )
   public static int field4969;
   @OriginalMember(
      owner = "client!dh",
      name = "pd",
      descriptor = "I"
   )
   public static int field4970;
   @OriginalMember(
      owner = "client!dh",
      name = "hd",
      descriptor = "I"
   )
   public static int field4971;
   @OriginalMember(
      owner = "client!dh",
      name = "Af",
      descriptor = "I"
   )
   public static int field4972;
   @OriginalMember(
      owner = "client!dh",
      name = "je",
      descriptor = "I"
   )
   public static int field4974;
   @OriginalMember(
      owner = "client!dh",
      name = "Xb",
      descriptor = "I"
   )
   public static int field4975;
   @OriginalMember(
      owner = "client!dh",
      name = "bb",
      descriptor = "I"
   )
   public static int field4976;
   @OriginalMember(
      owner = "client!dh",
      name = "wd",
      descriptor = "I"
   )
   public static int field4977;
   @OriginalMember(
      owner = "client!dh",
      name = "ce",
      descriptor = "I"
   )
   public static int field4978;
   @OriginalMember(
      owner = "client!dh",
      name = "Se",
      descriptor = "I"
   )
   public static int field4979;
   @OriginalMember(
      owner = "client!dh",
      name = "lb",
      descriptor = "I"
   )
   public static int field4980;
   @OriginalMember(
      owner = "client!dh",
      name = "Rd",
      descriptor = "I"
   )
   public static int field4981;
   @OriginalMember(
      owner = "client!dh",
      name = "gf",
      descriptor = "I"
   )
   public int field4982;
   @OriginalMember(
      owner = "client!dh",
      name = "Fc",
      descriptor = "I"
   )
   public static int field4983;
   @OriginalMember(
      owner = "client!dh",
      name = "N",
      descriptor = "I"
   )
   public static int field4984;
   @OriginalMember(
      owner = "client!dh",
      name = "qe",
      descriptor = "I"
   )
   public static int field4985;
   @OriginalMember(
      owner = "client!dh",
      name = "le",
      descriptor = "I"
   )
   public static int field4986;
   @OriginalMember(
      owner = "client!dh",
      name = "hc",
      descriptor = "I"
   )
   public static int field4987;
   @OriginalMember(
      owner = "client!dh",
      name = "Ie",
      descriptor = "I"
   )
   public static int field4988;
   @OriginalMember(
      owner = "client!dh",
      name = "Zd",
      descriptor = "I"
   )
   public static int field4989;
   @OriginalMember(
      owner = "client!dh",
      name = "Sf",
      descriptor = "I"
   )
   public static int field4990;
   @OriginalMember(
      owner = "client!dh",
      name = "xc",
      descriptor = "I"
   )
   public static int field4991;
   @OriginalMember(
      owner = "client!dh",
      name = "Sd",
      descriptor = "I"
   )
   public static int field4992;
   @OriginalMember(
      owner = "client!dh",
      name = "Fd",
      descriptor = "I"
   )
   public static int field4993;
   @OriginalMember(
      owner = "client!dh",
      name = "de",
      descriptor = "I"
   )
   public int field4994;
   @OriginalMember(
      owner = "client!dh",
      name = "jc",
      descriptor = "I"
   )
   public static int field4995;
   @OriginalMember(
      owner = "client!dh",
      name = "Vd",
      descriptor = "I"
   )
   public int field4996;
   @OriginalMember(
      owner = "client!dh",
      name = "M",
      descriptor = "I"
   )
   public static int field4999;
   @OriginalMember(
      owner = "client!dh",
      name = "ge",
      descriptor = "I"
   )
   public static int field5000;
   @OriginalMember(
      owner = "client!dh",
      name = "Zc",
      descriptor = "I"
   )
   public int field5008;
   @OriginalMember(
      owner = "client!dh",
      name = "Bc",
      descriptor = "I"
   )
   private int field5009;
   @OriginalMember(
      owner = "client!dh",
      name = "sf",
      descriptor = "I"
   )
   public int field5015;
   @OriginalMember(
      owner = "client!dh",
      name = "gg",
      descriptor = "I"
   )
   private int field5026;
   @OriginalMember(
      owner = "client!dh",
      name = "te",
      descriptor = "I"
   )
   public int field5027;
   @OriginalMember(
      owner = "client!dh",
      name = "mb",
      descriptor = "I"
   )
   public int field5046;
   @OriginalMember(
      owner = "client!dh",
      name = "Zb",
      descriptor = "I"
   )
   public int field5051;
   @OriginalMember(
      owner = "client!dh",
      name = "Qf",
      descriptor = "I"
   )
   public int field5055;
   @OriginalMember(
      owner = "client!dh",
      name = "dd",
      descriptor = "I"
   )
   public int field5064;
   @OriginalMember(
      owner = "client!dh",
      name = "R",
      descriptor = "I"
   )
   public int field5105;
   @OriginalMember(
      owner = "client!dh",
      name = "gc",
      descriptor = "I"
   )
   private int field5129;
   @OriginalMember(
      owner = "client!dh",
      name = "peer",
      descriptor = "J"
   )
   public long peer;
   @OriginalMember(
      owner = "client!dh",
      name = "U",
      descriptor = "Lib;"
   )
   public class163 field5111;
   @OriginalMember(
      owner = "client!dh",
      name = "ic",
      descriptor = "Lib;"
   )
   private class163 field5115;
   @OriginalMember(
      owner = "client!dh",
      name = "sg",
      descriptor = "Lib;"
   )
   public class163 field5116;
   @OriginalMember(
      owner = "client!dh",
      name = "zd",
      descriptor = "Lib;"
   )
   private class163 field5118;
   @OriginalMember(
      owner = "client!dh",
      name = "Lf",
      descriptor = "Lib;"
   )
   public class163 field5122;
   @OriginalMember(
      owner = "client!dh",
      name = "Dd",
      descriptor = "Lib;"
   )
   public class163 field5125;
   @OriginalMember(
      owner = "client!dh",
      name = "xe",
      descriptor = "Lib;"
   )
   private class163 field5126;
   @OriginalMember(
      owner = "client!dh",
      name = "We",
      descriptor = "Lgg;"
   )
   private class186 field5010;
   @OriginalMember(
      owner = "client!dh",
      name = "Kb",
      descriptor = "Lhi;"
   )
   private class215 field5110;
   @OriginalMember(
      owner = "client!dh",
      name = "Bb",
      descriptor = "Luha;"
   )
   public class254 field5042;
   @OriginalMember(
      owner = "client!dh",
      name = "lc",
      descriptor = "Lol;"
   )
   public class298 field5107;
   @OriginalMember(
      owner = "client!dh",
      name = "He",
      descriptor = "Lol;"
   )
   public class298 field5108;
   @OriginalMember(
      owner = "client!dh",
      name = "eg",
      descriptor = "Lol;"
   )
   public class298 field5112;
   @OriginalMember(
      owner = "client!dh",
      name = "ad",
      descriptor = "Lol;"
   )
   public class298 field5113;
   @OriginalMember(
      owner = "client!dh",
      name = "kg",
      descriptor = "Lol;"
   )
   public class298 field5120;
   @OriginalMember(
      owner = "client!dh",
      name = "cd",
      descriptor = "Lol;"
   )
   public class298 field5121;
   @OriginalMember(
      owner = "client!dh",
      name = "wb",
      descriptor = "Lol;"
   )
   public class298 field5123;
   @OriginalMember(
      owner = "client!dh",
      name = "Rc",
      descriptor = "Lol;"
   )
   public class298 field5124;
   @OriginalMember(
      owner = "client!dh",
      name = "Hc",
      descriptor = "Lol;"
   )
   public class298 field5127;
   @OriginalMember(
      owner = "client!dh",
      name = "kb",
      descriptor = "Lol;"
   )
   public class298 field5128;
   @OriginalMember(
      owner = "client!dh",
      name = "yc",
      descriptor = "Lcd;"
   )
   private class331 field5032;
   @OriginalMember(
      owner = "client!dh",
      name = "md",
      descriptor = "Lkda;"
   )
   private class408 field5084;
   @OriginalMember(
      owner = "client!dh",
      name = "y",
      descriptor = "Lwr;"
   )
   public class482 field4843;
   @OriginalMember(
      owner = "client!dh",
      name = "Ed",
      descriptor = "Lgp;"
   )
   private class53 field5109;
   @OriginalMember(
      owner = "client!dh",
      name = "se",
      descriptor = "Lgp;"
   )
   private class53 field5114;
   @OriginalMember(
      owner = "client!dh",
      name = "Mf",
      descriptor = "Lgp;"
   )
   private class53 field5119;
   @OriginalMember(
      owner = "client!dh",
      name = "nd",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   public NativeHeap field4925;
   @OriginalMember(
      owner = "client!dh",
      name = "hg",
      descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   public NativeHeapBuffer field4973;
   @OriginalMember(
      owner = "client!dh",
      name = "jg",
      descriptor = "Ljava/util/Hashtable;"
   )
   private Hashtable field4906;
   @OriginalMember(
      owner = "client!dh",
      name = "zc",
      descriptor = "Z"
   )
   public boolean field5019;
   @OriginalMember(
      owner = "client!dh",
      name = "Jf",
      descriptor = "Z"
   )
   public boolean field5029;
   @OriginalMember(
      owner = "client!dh",
      name = "sd",
      descriptor = "Z"
   )
   public boolean field5030;
   @OriginalMember(
      owner = "client!dh",
      name = "yf",
      descriptor = "Z"
   )
   public boolean field5056;
   @OriginalMember(
      owner = "client!dh",
      name = "oc",
      descriptor = "Z"
   )
   public boolean field5076;
   @OriginalMember(
      owner = "client!dh",
      name = "bf",
      descriptor = "Z"
   )
   public boolean field5130;
   @OriginalMember(
      owner = "client!dh",
      name = "Fb",
      descriptor = "[Luha;"
   )
   private class254[] field5036;
   @OriginalMember(
      owner = "client!dh",
      name = "V",
      descriptor = "[Lcs;"
   )
   public class358[] field5040;
   @OriginalMember(
      owner = "client!dh",
      name = "Lb",
      descriptor = "[Lcs;"
   )
   public class358[] field5063;
   @OriginalMember(
      owner = "client!dh",
      name = "jd",
      descriptor = "[Lso;"
   )
   public class495[] field5052;
   @OriginalMember(
      owner = "client!dh",
      name = "oe",
      descriptor = "[Llja;"
   )
   public class744[] field5050;
   @OriginalMember(
      owner = "client!dh",
      name = "rf",
      descriptor = "[Lpn;"
   )
   public class776[] field5045;

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V"
   )
   public abstract void method2548(Canvas arg0, int arg1, Object arg2);

   @OriginalMember(
      owner = "client!dh",
      name = "J",
      descriptor = "(I)V"
   )
   private final void method2549(int arg0) {
      try {
         if (this.field5032 != null) {
            this.field5032.method413((byte)87);
         }

         if (arg0 == 0) {
            ++field4966;
            this.method2560((byte)111);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[64] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method574(int arg0) {
      try {
         ++field4945;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[151] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "j",
      descriptor = "(II)V"
   )
   public final void method2550(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         if (arg1 > -106) {
            this.field5046 = 112;
         }

         if (~this.field5078 != ~arg0) {
            boolean var4;
            boolean var5;
            class227 var6;
            label70: {
               if (arg0 == 1) {
                  var4 = true;
                  var5 = true;
                  var6 = class279.field3890;
                  if (var3 == 0) {
                     break label70;
                  }
               }

               if (arg0 != 2) {
                  if (arg0 != 128) {
                     var4 = false;
                     var6 = class613.field8973;
                     var5 = false;
                     if (var3 == 0) {
                        break label70;
                     }
                  }

                  var5 = true;
                  var4 = true;
                  var6 = class739.field10971;
                  if (var3 == 0) {
                     break label70;
                  }
               }

               var4 = false;
               var6 = class564.field8414;
               var5 = true;
            }

            if (!this.field5006 != !var4) {
               this.field5006 = var4;
               this.method2643(false);
            }

            if (!this.field5106 == var5) {
               this.field5106 = var5;
               this.method2626(15);
            }

            if (this.field5079 != var6) {
               this.field5079 = var6;
               this.method2586(-123);
            }

            this.field5009 &= -29;
            this.field5078 = arg0;
         }

         ++field4867;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field5131[25] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "c",
      descriptor = "(IZ)V"
   )
   public final void method2551(int arg0, boolean arg1) {
      try {
         if (arg0 != 18702) {
            this.field4998 = null;
         }

         ++field4871;
         if (!this.field5092 != !arg1) {
            this.field5092 = arg1;
            this.method2598(-21822);
            this.field5009 &= -32;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[171] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "m",
      descriptor = "(B)V"
   )
   private final void method2552(byte arg0) {
      try {
         if (arg0 != -30) {
            this.field5077 = -62;
         }

         if (!this.field5094) {
            label24: {
               float[] var2 = this.field5081;
               float var3 = (float)this.field5096;
               float var4 = (float)this.field5028;
               float var5 = (float)(-this.field5103) * this.field5007 / (float)this.field5033;
               float var6 = (float)(-this.field5091) * this.field5007 / (float)this.field5101;
               float var7 = (float)(this.field4938 - this.field5091) * this.field5007 / (float)this.field5101;
               float var8 = (float)(-this.field5103 + this.field4861) * this.field5007 / (float)this.field5033;
               if (var6 != var7 && var5 != var8) {
                  var2[14] = var3 / (-var4 + var3);
                  var2[9] = 0.0F;
                  var2[4] = 0.0F;
                  var2[15] = 1.0F;
                  var2[12] = (var6 + var7) / (var6 - var7);
                  var2[3] = 0.0F;
                  var2[13] = (var5 + var8) / (-var5 + var8);
                  var2[5] = 2.0F / (var8 - var5);
                  var2[0] = 2.0F / (-var6 + var7);
                  var2[6] = 0.0F;
                  var2[2] = 0.0F;
                  var2[10] = 1.0F / (-var4 + var3);
                  var2[8] = 0.0F;
                  var2[11] = 0.0F;
                  var2[7] = 0.0F;
                  var2[1] = 0.0F;
                  if (client.field4530 == 0) {
                     break label24;
                  }
               }

               var2[10] = 1.0F;
               var2[13] = 0.0F;
               var2[14] = 0.0F;
               var2[8] = 0.0F;
               var2[1] = 0.0F;
               var2[7] = 0.0F;
               var2[6] = 0.0F;
               var2[5] = 1.0F;
               var2[11] = 0.0F;
               var2[0] = 1.0F;
               var2[2] = 0.0F;
               var2[9] = 0.0F;
               var2[3] = 0.0F;
               var2[15] = 1.0F;
               var2[12] = 0.0F;
               var2[4] = 0.0F;
            }

            this.method2595((byte)120);
            this.field5094 = true;
         }

         ++field4855;
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field5131[100] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(Lnda;II)V"
   )
   private final void method2553(class583 arg0, int arg1, int arg2) {
      try {
         this.method2659(108, this.field5109, 0);
         ++field4927;
         this.method2642(this.field5118, (byte)118);
         this.method2639((byte)28, arg0, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5131[148] + (arg0 != null ? field5131[4] : field5131[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "C",
      descriptor = "(Z)V"
   )
   public final void method622(boolean arg0) {
      try {
         ++field4957;
         this.field5085 = arg0;
         this.method2598(-21822);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[108] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(IIZ)Lat;"
   )
   public final class396 method580(int arg0, int arg1, boolean arg2) {
      try {
         ++field4900;
         return new class260(this, arg0, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5131[46] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "O",
      descriptor = "(I)V"
   )
   public abstract void method2554(int arg0);

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method620(Canvas arg0) {
      try {
         ++field4894;
         if (this.field4818 == arg0) {
            throw new RuntimeException();
         } else if (this.field4906.containsKey(arg0)) {
            this.method2631(105, arg0, this.field4906.get(arg0));
            this.field4906.remove(arg0);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[84] + (arg0 != null ? field5131[4] : field5131[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "ra",
      descriptor = "(IIII)V"
   )
   public final void method558(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field5065 = arg1;
         ++field4955;
         this.field5021 = arg3;
         this.field5026 = arg0;
         this.field5029 = true;
         this.field5014 = arg2;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field5131[55] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "H",
      descriptor = "(I)V"
   )
   public final void method2555(int arg0) {
      try {
         if (this.field5009 != 2) {
            this.method2583(arg0 + -25);
            this.method2599(false, (byte)-58);
            this.method2677(9, false);
            this.method2665(false, false);
            this.method2551(18702, false);
            this.method2571(false, -2, false, (byte)117);
            this.field5009 = 2;
         }

         if (arg0 != 0) {
            this.field5095 = true;
         }

         ++field4873;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[36] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(ZI)V"
   )
   public abstract void method2556(boolean arg0, int arg1);

   @OriginalMember(
      owner = "client!dh",
      name = "i",
      descriptor = "(B)V"
   )
   public abstract void method2557(byte arg0);

   @OriginalMember(
      owner = "client!dh",
      name = "f",
      descriptor = "(B)V"
   )
   public void method2558(byte arg0) {
      try {
         if (arg0 <= 84) {
            this.field5027 = 97;
         }

         ++field4865;
         this.method2644(false);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[103] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "S",
      descriptor = "(I)Lso;"
   )
   public final class495 method2559(int arg0) {
      try {
         ++field4940;
         if (arg0 != 0) {
            this.method610((int[])null);
         }

         return this.field5052[this.field5087];
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[94] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "t",
      descriptor = "(B)V"
   )
   public abstract void method2560(byte arg0);

   @OriginalMember(
      owner = "client!dh",
      name = "H",
      descriptor = "(III[I)V"
   )
   public final void method621(int arg0, int arg1, int arg2, int[] arg3) {
      try {
         float var5;
         int var6;
         int var7;
         label33: {
            ++field4848;
            var5 = this.field5001.method3677((float)arg2, 0, (float)arg1, (float)arg0);
            if (var5 < -0.0078125F || var5 > 0.0078125F) {
               var6 = (int)((float)this.field5101 * this.field5001.method3674((float)arg0, (float)arg1, 16383, (float)arg2) / var5);
               var7 = (int)((float)this.field5033 * this.field5001.method3679((byte)-121, (float)arg2, (float)arg1, (float)arg0) / var5);
               if (client.field4530 == 0) {
                  break label33;
               }
            }

            var7 = this.field5103;
            var6 = this.field5091;
         }

         arg3[2] = (int)var5;
         arg3[0] = (int)((float)var6 + -this.field5104);
         arg3[1] = (int)((float)var7 + -this.field5037);
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field5131[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5131[4] : field5131[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "e",
      descriptor = "(II)I"
   )
   public final int method632(int arg0, int arg1) {
      try {
         ++field4874;
         return arg0 & arg1 ^ arg1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[160] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "W",
      descriptor = "(I)V"
   )
   public abstract void method2561(int arg0);

   @OriginalMember(
      owner = "client!dh",
      name = "A",
      descriptor = "(B)I"
   )
   public final int method2562(byte arg0) {
      try {
         ++field4870;
         int var2 = 14 / ((arg0 - -66) / 55);
         return this.field5087;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[42] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(BIZLii;I[FII)Loia;"
   )
   public abstract class95 method2563(byte arg0, int arg1, boolean arg2, class579 arg3, int arg4, float[] arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!dh",
      name = "E",
      descriptor = "(B)V"
   )
   private final void method2564(byte arg0) {
      try {
         if (this.field5009 != 1) {
            this.method2583(-25);
            this.method2599(false, (byte)-58);
            this.method2677(9, false);
            this.method2665(false, false);
            this.method2551(18702, false);
            this.method2571(false, -2, false, (byte)117);
            this.method2649((byte)119, 1);
            this.method2578(this.field5042, true);
            this.field5009 = 1;
         }

         ++field4842;
         if (arg0 != -120) {
            this.method624();
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[162] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "HA",
      descriptor = "(IIII[I)V"
   )
   public final void method587(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
      try {
         ++field4941;
         float var6 = this.field5001.method3677((float)arg2, 0, (float)arg1, (float)arg0);
         if (!(var6 < (float)this.field5096) && !(var6 > (float)this.field5028)) {
            int var7 = (int)((float)this.field5101 * this.field5001.method3674((float)arg0, (float)arg1, 16383, (float)arg2) / (float)arg3);
            int var8 = (int)((float)this.field5033 * this.field5001.method3679((byte)-126, (float)arg2, (float)arg1, (float)arg0) / (float)arg3);
            arg4[0] = (int)((float)var7 + -this.field5104);
            arg4[2] = (int)var6;
            arg4[1] = (int)((float)var8 - this.field5037);
         } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field5131[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field5131[4] : field5131[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "D",
      descriptor = "(I)V"
   )
   private final void method2565(int arg0) {
      try {
         ++field4936;
         this.method2659(118, this.field5119, 0);
         this.method2642(this.field5126, (byte)118);
         this.method2639((byte)28, class10.field142, arg0, 0);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[158] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method2566(int arg0, byte arg1) {
      try {
         this.method2646(arg1 << 16 | arg1 << 24 | arg1 << 8 | arg1, 111);
         if (arg0 == -1463654256) {
            ++field4952;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[34] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(Loda;)V"
   )
   public final void method562(class127 arg0) {
      try {
         this.field5010.method1448(arg0, -2, -1, this);
         ++field4824;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[3] + (arg0 != null ? field5131[4] : field5131[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "x",
      descriptor = "(I)V"
   )
   public final void method2567(int arg0) {
      try {
         if (arg0 < -63) {
            this.field4997 = false;
            ++field4811;
            this.method2656(111);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[57] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(Lcs;Lcs;Z)V"
   )
   public final void method2568(class358 arg0, class358 arg1, boolean arg2) {
      try {
         ++field4819;
         boolean var4 = arg2;
         if (this.field5040[this.field5087] != arg0) {
            this.field5040[this.field5087] = arg0;
            this.method2594((byte)122);
            var4 = true;
         }

         if (this.field5063[this.field5087] != arg1) {
            this.field5063[this.field5087] = arg1;
            var4 = true;
            this.method2604(-16090);
         }

         if (var4) {
            this.field5009 &= -30;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field5131[169] + (arg0 != null ? field5131[4] : field5131[2]) + ',' + (arg1 != null ? field5131[4] : field5131[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "u",
      descriptor = "()Z"
   )
   public final boolean method591() {
      try {
         ++field4976;
         return false;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5131[135] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "e",
      descriptor = "(Z)[F"
   )
   public final float[] method2569(boolean arg0) {
      try {
         ++field4834;
         if (arg0) {
            this.method2602(8, -113, 46, 22, (byte[])null, 109, false, (class579)null);
         }

         return this.field5061;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[74] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "V",
      descriptor = "(I)I"
   )
   public final int method2570(int arg0) {
      try {
         ++field4921;
         return arg0 != 1 ? 49 : this.field5065;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[89] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "U",
      descriptor = "(IIIII)V"
   )
   public final void method615(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field4981;
         this.method588(arg0, arg1, arg0 - -arg2, arg1, arg3, arg4);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field5131[35] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(I)V"
   )
   public void method555(int arg0) {
      try {
         if (this.field5067 != null) {
            this.field5067.method4964(false);
         }

         ++field4822;
         this.field5008 = arg0 & Integer.MAX_VALUE;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[119] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "h",
      descriptor = "()Z"
   )
   public final boolean method604() {
      try {
         ++field4943;
         return false;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5131[136] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(ZIZB)V"
   )
   public final void method2571(boolean arg0, int arg1, boolean arg2, byte arg3) {
      int var5 = client.field4530;

      try {
         if (~this.field5058 != ~arg1 || this.field5098 != this.field5029) {
            class95 var6 = null;
            int var7 = 0;
            byte var8 = 0;
            int var9 = 0;
            int var10 = !this.field5029 ? 0 : 3;
            if (~arg1 > -1) {
               this.method2652(-13410);
            } else {
               class327 var11;
               label81: {
                  var6 = this.field5067.method4963(arg3 + -53, arg1);
                  var11 = super.field813.method1159(arg1, 127);
                  if (var11.field4654 != 0 || ~var11.field4656 != -1) {
                     int var12 = !var11.field4646 ? 128 : 64;
                     int var13 = var12 * 50;
                     class495 var14 = this.method2616(-74);
                     var14.method3682((byte)12, 0.0F, (float)(this.field5008 % var13 * var11.field4654) / (float)var13, (float)(this.field5008 % var13 * var11.field4656) / (float)var13);
                     this.method2614(class66.field817, arg3 + -111);
                     if (var5 == 0) {
                        break label81;
                     }
                  }

                  this.method2652(-13410);
               }

               if (!this.field5029) {
                  var9 = var11.field4644;
                  var8 = var11.field4642;
                  var10 = var11.field4655;
               }

               var7 = var11.field4645;
            }

            label46: {
               this.method2621(var10, var8, arg2, var9, arg0, 127);
               if (this.field5032 == null) {
                  this.method2578(var6, true);
                  this.method2649((byte)119, var7);
                  if (var5 == 0) {
                     break label46;
                  }
               }

               this.field5032.method414(arg3 ^ 117, var7, var6);
            }

            this.field5058 = arg1;
            this.field5098 = this.field5029;
         }

         ++field4931;
         this.field5009 &= -8;
         if (arg3 != 117) {
            this.method600(82, 40, -48, -58, -57, -12, (class512)null, -92, -123, 28, 10, -56);
         }
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field5131[47] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "w",
      descriptor = "(B)V"
   )
   public abstract void method2572(byte arg0);

   @OriginalMember(
      owner = "client!dh",
      name = "B",
      descriptor = "(B)V"
   )
   private final void method2573(byte arg0) {
      try {
         ++field4917;
         this.field5017 = false;
         this.method2680(arg0 + -71);
         if (arg0 != 71) {
            this.method2604(-112);
         }

         if (class446.field6787 == this.field5018) {
            this.method2611(-49);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[138] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "k",
      descriptor = "(II)V"
   )
   public final void method2574(int arg0, int arg1) {
      try {
         if (arg0 <= 36) {
            this.field5022 = -1.1229459F;
         }

         if (this.field5087 != arg1) {
            this.field5087 = arg1;
            this.method2648(-121);
         }

         ++field4892;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[37] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(Luaa;)V"
   )
   public final void method583(class126 arg0) {
      try {
         ++field4980;
         this.field5084 = (class408)arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[117] + (arg0 != null ? field5131[4] : field5131[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(IIIIIF)Llja;"
   )
   public final class744 method611(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      try {
         ++field4937;
         return new class679(arg0, arg1, arg2, arg3, arg4, arg5);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field5131[58] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "da",
      descriptor = "(III[I)V"
   )
   public final void method629(int arg0, int arg1, int arg2, int[] arg3) {
      try {
         float var5;
         int var6;
         int var7;
         label33: {
            ++field4883;
            var5 = this.field5001.method3677((float)arg2, 0, (float)arg1, (float)arg0);
            if (var5 < -0.0078125F || var5 > 0.0078125F) {
               var6 = (int)((float)this.field5101 * this.field5001.method3674((float)arg0, (float)arg1, 16383, (float)arg2) / var5);
               var7 = (int)((float)this.field5033 * this.field5001.method3679((byte)-128, (float)arg2, (float)arg1, (float)arg0) / var5);
               if (client.field4530 == 0) {
                  break label33;
               }
            }

            var7 = this.field5103;
            var6 = this.field5091;
         }

         arg3[2] = (int)var5;
         arg3[0] = (int)((float)var6 + -this.field5104);
         arg3[1] = (int)((float)var7 - this.field5037);
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field5131[112] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5131[4] : field5131[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "z",
      descriptor = "(B)V"
   )
   private final void method2575(byte arg0) {
      try {
         this.field5119 = this.method2610(-2, true);
         ++field4912;
         if (arg0 < 118) {
            this.method601((Canvas)null, 12, -8);
         }

         this.field5119.method424(24, (byte)-51, 12);
         this.field5126 = this.method2601(new class354[]{new class354(class697.field10459)}, false);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[115] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "u",
      descriptor = "(B)V"
   )
   private final void method2576(byte arg0) {
      try {
         if (arg0 < 11) {
            this.field4872 = null;
         }

         ++field4929;
         if (class97.field1195 != this.field5018) {
            class268 var2 = this.field5018;
            this.field5018 = class97.field1195;
            if (!var2.method2074(31348)) {
               this.method2612((byte)102);
            }

            this.method2552((byte)-30);
            this.field5031 = this.field5081;
            this.method2611(-69);
            this.field5009 &= -8;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[128] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "l",
      descriptor = "()Z"
   )
   public final boolean method544() {
      try {
         ++field4823;
         return true;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5131[134] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(ZI[III)Loia;"
   )
   public final class95 method2577(boolean arg0, int arg1, int[] arg2, int arg3, int arg4) {
      try {
         ++field4923;
         if (arg4 != 2) {
            this.method2589(103);
         }

         return this.method2676(16777215, arg1, arg2, arg3, 0, arg0, 0);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field5131[99] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5131[4] : field5131[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method571(Canvas arg0) {
      try {
         label45: {
            ++field4850;
            this.field4825 = null;
            this.field4947 = null;
            if (arg0 == null || this.field4818 == arg0) {
               this.field4947 = this.field4964;
               this.field4825 = this.field4818;
               if (client.field4530 == 0) {
                  break label45;
               }
            }

            if (this.field4906.containsKey(arg0)) {
               this.field4947 = this.field4906.get(arg0);
               this.field4825 = arg0;
            }
         }

         if (this.field4825 != null && this.field4947 != null) {
            this.method2548(this.field4825, 2269, this.field4947);
            this.method2667((byte)-125);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[62] + (arg0 != null ? field5131[4] : field5131[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "A",
      descriptor = "()Lgq;"
   )
   public final class540 method656() {
      try {
         ++field4962;
         return this.field5001;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5131[150] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method563(int arg0) {
      try {
         ++field4939;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[156] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(Luha;Z)V"
   )
   public final void method2578(class254 arg0, boolean arg1) {
      try {
         ++field4987;
         if (this.field5036[this.field5087] != arg0) {
            label30: {
               this.field5036[this.field5087] = arg0;
               if (arg0 != null) {
                  arg0.method1915(-77);
                  if (client.field4530 == 0) {
                     break label30;
                  }
               }

               this.method2645((byte)125);
            }

            this.field5009 &= -2;
         }

         if (!arg1) {
            this.field5130 = true;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[98] + (arg0 != null ? field5131[4] : field5131[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "Y",
      descriptor = "()[I"
   )
   public final int[] method576() {
      try {
         ++field4814;
         return new int[]{this.field5091, this.field5103, this.field5101, this.field5033};
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5131[91] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "t",
      descriptor = "()Z"
   )
   public final boolean method567() {
      try {
         ++field4967;
         return true;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5131[168] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "DA",
      descriptor = "(IIII)V"
   )
   public final void method630(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field5033 = arg3;
         this.field5101 = arg2;
         ++field4895;
         this.field5103 = arg1;
         this.field5091 = arg0;
         this.method2653(-113);
         this.method2573((byte)71);
         this.method2647(false);
         this.method2657(-19983);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field5131[164] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "b",
      descriptor = "(ZI)Lcd;"
   )
   public class331 method2579(boolean arg0, int arg1) {
      try {
         if (!arg0) {
            this.field5092 = false;
         }

         ++field4898;
         if (arg1 != 6) {
            if (arg1 == 1) {
               return new class286(this);
            }

            if (~arg1 == -3) {
               return new class130(this, this.field4843);
            }

            if (arg1 != 7) {
               return new class666(this);
            }

            if (client.field4530 == 0) {
               return new class198(this);
            }
         }

         return new class68(this);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5131[80] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method628(int arg0) {
      try {
         ++field4849;
         if (~arg0 != -2) {
            throw new IllegalArgumentException("");
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[146] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "n",
      descriptor = "()Z"
   )
   public final boolean method644() {
      try {
         ++field4961;
         return true;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5131[133] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(IZ[[II)Lcea;"
   )
   public abstract class223 method2580(int arg0, boolean arg1, int[][] arg2, int arg3);

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(Lut;IIII)Lka;"
   )
   public final class497 method547(class134 arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field4993;
         return new class298(this, arg0, arg1, arg3, arg4, arg2);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field5131[26] + (arg0 != null ? field5131[4] : field5131[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(IIIIIILaa;II)V"
   )
   public final void method606(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8) {
      try {
         ++field4812;
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field5131[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field5131[4] : field5131[2]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(IIIIZ)Lat;"
   )
   public final class396 method602(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         ++field4916;
         class260 var6 = new class260(this, arg2, arg3, arg4);
         var6.method261(0, 0, arg2, arg3, arg0, arg1);
         return var6;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field5131[163] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(Loda;I)V"
   )
   public final void method623(class127 arg0, int arg1) {
      try {
         ++field4974;
         this.field5010.method1448(arg0, -2, arg1, this);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[152] + (arg0 != null ? field5131[4] : field5131[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method613(int arg0) {
      try {
         ++field4899;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[29] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(Lpg;[Lnia;Z)Lda;"
   )
   public final class67 method570(class763 arg0, class671[] arg1, boolean arg2) {
      try {
         ++field4971;
         return new class730(this, arg0, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5131[11] + (arg0 != null ? field5131[4] : field5131[2]) + ',' + (arg1 != null ? field5131[4] : field5131[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "h",
      descriptor = "(B)V"
   )
   public abstract void method2581(byte arg0);

   @OriginalMember(
      owner = "client!dh",
      name = "g",
      descriptor = "(II)Lhi;"
   )
   public final class215 method2582(int arg0, int arg1) {
      try {
         if (~this.field5110.method927(34962) > ~(arg1 * 2)) {
            this.field5110.method923((byte)77, arg1);
         }

         ++field4928;
         return arg0 != 0 ? null : this.field5110;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[137] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "G",
      descriptor = "(I)V"
   )
   private final void method2583(int arg0) {
      try {
         if (arg0 != -25) {
            this.field5083 = -46;
         }

         if (class260.field3536 != this.field5018) {
            class268 var2 = this.field5018;
            this.field5018 = class260.field3536;
            if (var2.method2074(31348)) {
               this.method2612((byte)104);
            }

            this.method2619(4);
            this.field5031 = this.field5041;
            this.method2611(-58);
            this.field5009 &= -25;
         }

         ++field4827;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[54] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method601(Canvas arg0, int arg1, int arg2) {
      try {
         ++field4846;
         if (this.field4818 == arg0) {
            throw new RuntimeException();
         } else if (!this.field4906.containsKey(arg0)) {
            if (!arg0.isShowing()) {
               throw new RuntimeException();
            } else {
               try {
                  Class var4 = Class.forName(field5131[126]);
                  Method var5 = var4.getMethod(field5131[125], Boolean.TYPE);
                  var5.invoke(arg0, Boolean.TRUE);
               } catch (Exception var8) {
               }

               Object var6 = this.method2678(arg0, -1);
               if (var6 == null) {
                  throw new RuntimeException();
               } else {
                  this.field4906.put(arg0, var6);
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field5131[127] + (arg0 != null ? field5131[4] : field5131[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "i",
      descriptor = "(I)Lza;"
   )
   public final class434 method592(int arg0) {
      try {
         ++field4831;
         class486 var2 = new class486(arg0);
         this.field4901.method4060(23, var2);
         return var2;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[31] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "Q",
      descriptor = "(IIIIII[BII)V"
   )
   public final void method546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
      try {
         ++field4841;
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field5131[121] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field5131[4] : field5131[2]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "b",
      descriptor = "(II)I"
   )
   public final int method560(int arg0, int arg1) {
      try {
         ++field4944;
         return arg1 | arg0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[144] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(BLef;IILii;)Loia;"
   )
   public abstract class95 method2584(byte arg0, class513 arg1, int arg2, int arg3, class579 arg4);

   @OriginalMember(
      owner = "client!dh",
      name = "r",
      descriptor = "(I)V"
   )
   public abstract void method2585(int arg0);

   @OriginalMember(
      owner = "client!dh",
      name = "Q",
      descriptor = "(I)V"
   )
   public abstract void method2586(int arg0);

   @OriginalMember(
      owner = "client!dh",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method2587(int arg0) {
      int var2 = client.field4530;

      try {
         ++field4860;
         Enumeration var3 = this.field4906.keys();
         Canvas var4;
         if (var2 != 0) {
            var4 = (Canvas)var3.nextElement();
            this.method2631(99, var4, this.field4906.get(var4));
         }

         while(true) {
            Object var10000;
            if (!var3.hasMoreElements()) {
               this.field5109.method423(-15607);
               this.field5119.method423(-15607);
               this.field5114.method423(-15607);
               var10000 = this.field5113;
               if (var2 == 0) {
                  ((class298)var10000).method2279(false);
                  if (arg0 != 0) {
                     this.field5099 = false;
                  }

                  this.field5121.method2279(false);
                  this.field5124.method2279(false);
                  this.field5127.method2279(false);
                  this.field5123.method2279(false);
                  this.field5010.method1451(1);
                  this.field5110.method423(-15607);
                  return;
               }
            } else {
               var10000 = var3.nextElement();
            }

            var4 = (Canvas)var10000;
            this.method2631(99, var4, this.field4906.get(var4));
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field5131[97] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "y",
      descriptor = "(I)V"
   )
   public abstract void method2588(int arg0);

   @OriginalMember(
      owner = "client!dh",
      name = "q",
      descriptor = "(I)V"
   )
   public void method2589(int arg0) {
      try {
         this.field5027 = this.field5105;
         ++field4832;
         this.field5105 = 0;
         int var2 = -9 / ((arg0 - -29) / 61);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[131] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V"
   )
   public final void method552(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      try {
         ++field4903;
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field5131[18] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "za",
      descriptor = "(IIIII)V"
   )
   public final void method652(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field4951;
         this.method2564((byte)-120);
         this.method2646(arg3, 83);
         this.method2636(-105, 0, class522.field7591);
         this.method2662(true, class522.field7591, 0);
         this.method2550(arg4, -120);
         this.field4998.method3675((float)arg2, 1.0F, true, (float)arg2);
         this.field4998.method1512(arg0, arg1, 0);
         this.method2567(-111);
         this.method2556(false, -26182);
         this.method2659(109, this.field5114, 0);
         this.method2642(this.field5115, (byte)118);
         this.method2639((byte)28, class264.field3616, 256, 0);
         this.method2556(true, -26182);
         this.method2662(true, class496.field7336, 0);
         this.method2636(-125, 0, class496.field7336);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field5131[132] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(Lgq;)V"
   )
   public final void method550(class540 arg0) {
      try {
         this.field5001 = (class495)arg0;
         ++field4977;
         this.field5003.method1513(this.field5001);
         this.field5003.method3665(0);
         this.field5004.method3668(this.field5003, 16383);
         this.field5002.method3668(this.field5001, 16383);
         if (this.field5018.method2074(31348)) {
            this.method2612((byte)103);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[28] + (arg0 != null ? field5131[4] : field5131[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "<init>",
      descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Leaa;II)V"
   )
   public class338(Canvas arg0, Object arg1, class160 arg2, class526 arg3, int arg4, int arg5) {
      int var7 = client.field4530;
      super(arg2);
      this.field4901 = new class550();
      this.field4997 = true;
      this.field4998 = new class495();
      this.field5001 = new class495();
      this.field5002 = new class495();
      this.field5003 = new class495();
      this.field5004 = new class495();
      this.field5005 = new class495();
      this.field5006 = true;
      this.field5012 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
      this.field5021 = 0;
      this.field5013 = 0;
      this.field5017 = false;
      this.field5024 = -1.0F;
      this.field5033 = 512;
      this.field5018 = class662.field9593;
      this.field5014 = -1;
      this.field5016 = 0;
      this.field5044 = 0;
      this.field5048 = false;
      this.field5023 = new float[]{0.0F, 0.0F, -1.0F, 0.0F};
      this.field5041 = new float[16];
      this.field5058 = -1;
      this.field5054 = false;
      this.field5043 = 0;
      this.field5038 = 0;
      this.field5062 = 1.0F;
      this.field5061 = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
      this.field5068 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
      this.field5066 = true;
      this.field5039 = 16777215;
      this.field5070 = 0;
      this.field5059 = 1.0F;
      this.field5060 = new float[16];
      this.field5072 = -1.0F;
      this.field5080 = 8;
      this.field5031 = this.field5061;
      this.field5073 = false;
      this.field5047 = 1.0F;
      this.field5079 = class279.field3890;
      this.field5057 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
      this.field5069 = 3;
      this.field5087 = 0;
      this.field5081 = new float[16];
      this.field5090 = true;
      this.field5091 = 0;
      this.field5078 = 1;
      this.field5025 = 0;
      this.field5097 = 0;
      this.field5094 = false;
      this.field5077 = -1;
      this.field5101 = 512;
      this.field5100 = false;
      this.field5103 = 0;
      this.field5028 = 3584;
      this.field5095 = false;
      this.field5092 = false;
      this.field5096 = 50;
      this.field5065 = -1;
      this.field5083 = -1;
      this.field5102 = 3584.0F;
      this.field5098 = false;
      this.field5085 = true;
      this.field5053 = new class331[10];
      this.field5011 = 0;
      this.field5007 = 1.0F;
      this.field5082 = 1.0F;
      this.field5106 = true;
      this.field5099 = false;
      this.field5071 = 3584.0F;
      this.field5086 = 128;
      this.field5089 = 0;
      this.field5035 = new Stream();
      this.field5117 = new class495();

      try {
         try {
            this.field4949 = arg3;
            this.field4825 = this.field4818 = arg0;
            this.field4947 = this.field4964 = arg1;
            this.field5049 = arg4;
            Dimension var8 = arg0.getSize();
            this.field4938 = this.field4851 = var8.width;
            this.field4861 = this.field4922 = var8.height;
            this.field5034 = arg5;
            class301.method2294(-7208, false, true);
            if (super.field813 == null) {
               this.field4872 = new NativeInterface(0, this.field5034);
               this.field5067 = null;
            } else {
               this.field5067 = new class681(this, super.field813);
               this.field4872 = new NativeInterface(super.field813.method1162(27176), this.field5034);
               int var9 = 0;
               if (var7 != 0 || var9 < super.field813.method1162(27176)) {
                  do {
                     class327 var10 = super.field813.method1159(var9, 124);
                     if (var10 != null) {
                        this.field4872.initTextureMetrics(var9, var10.field4641, var10.field4632);
                     }

                     ++var9;
                  } while(var9 < super.field813.method1162(27176));

               }
            }
         } catch (Throwable var13) {
            var13.printStackTrace();
            this.method653(-119);
            throw new RuntimeException("");
         }
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field5131[56] + (arg0 != null ? field5131[4] : field5131[2]) + ',' + (arg1 != null ? field5131[4] : field5131[2]) + ',' + (arg2 != null ? field5131[4] : field5131[2]) + ',' + (arg3 != null ? field5131[4] : field5131[2]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "k",
      descriptor = "(B)I"
   )
   public final int method2590(byte arg0) {
      try {
         if (arg0 != 84) {
            this.field5035 = null;
         }

         ++field4907;
         return this.field5026;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[65] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(ILef;Lii;)Z"
   )
   public abstract boolean method2591(int arg0, class513 arg1, class579 arg2);

   @OriginalMember(
      owner = "client!dh",
      name = "I",
      descriptor = "(I)V"
   )
   public abstract void method2592(int arg0);

   @OriginalMember(
      owner = "client!dh",
      name = "la",
      descriptor = "()V"
   )
   public final void method607() {
      try {
         this.field5025 = this.field4861;
         this.field5016 = 0;
         this.field5013 = this.field4938;
         ++field4835;
         this.field5038 = 0;
         if (this.field5130) {
            this.field5130 = false;
            this.method2624((byte)-115);
         }

         this.method2657(-19983);
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5131[170] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public final void method593(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      int var10 = client.field4530;

      try {
         float var12;
         float var14;
         label101: {
            ++field4910;
            float var11 = (float)(-arg0) + (float)arg2;
            var12 = (float)(-arg1) + (float)arg3;
            if (var11 != 0.0F || var12 != 0.0F) {
               float var13 = (float)(1.0D / Math.sqrt((double)(var11 * var11 + var12 * var12)));
               var12 *= var13;
               var14 = var11 * var13;
               if (var10 == 0) {
                  break label101;
               }
            }

            var14 = 1.0F;
         }

         float var15;
         float var16;
         float var17;
         float var18;
         float var19;
         float var20;
         label83: {
            this.method2564((byte)-120);
            this.method2646(arg4, 43);
            this.method2636(-102, 0, class522.field7591);
            this.method2662(true, class522.field7591, 0);
            this.method2550(arg5, -112);
            this.method2661((byte)-113);
            int var27 = arg8 % (arg6 + arg7);
            this.method2556(false, -26182);
            var15 = (float)arg6 * var14;
            var16 = (float)arg6 * var12;
            var17 = 0.0F;
            var18 = 0.0F;
            var19 = var15;
            var20 = var16;
            if (~arg6 <= ~var27) {
               var19 = (float)(-var27 + arg6) * var14;
               var20 = (float)(arg6 - var27) * var12;
               if (var10 == 0) {
                  break label83;
               }
            }

            var18 = (float)(-var27 + arg6 + arg7) * var12;
            var17 = (float)(arg6 + arg7 + -var27) * var14;
         }

         float var21 = (float)arg0 + var17;
         float var22 = (float)arg1 + var18;
         float var23 = (float)arg7 * var14;
         float var24 = (float)arg7 * var12;

         do {
            label97: {
               int var10000;
               label74: {
                  if (arg2 <= arg0) {
                     float var28;
                     var10000 = (var28 = var21 - (float)arg2) == 0.0F ? 0 : (var28 < 0.0F ? -1 : 1);
                     if (var10 != 0) {
                        break label74;
                     }

                     if (var10000 < 0) {
                        break;
                     }

                     if (!((float)arg2 > var19 + var21)) {
                        break label97;
                     }

                     var19 = (float)arg2 - var21;
                     if (var10 == 0) {
                        break label97;
                     }
                  }

                  float var29;
                  var10000 = (var29 = var21 - (float)arg2) == 0.0F ? 0 : (var29 < 0.0F ? -1 : 1);
               }

               if (var10000 > 0) {
                  break;
               }

               if ((float)arg2 < var19 + var21) {
                  var19 = (float)arg2 + -var21;
               }
            }

            label99: {
               if (~arg3 >= ~arg1) {
                  if (var22 < (float)arg3) {
                     break;
                  }

                  if (!((float)arg3 > var20 + var22)) {
                     break label99;
                  }

                  var20 = (float)arg3 + -var22;
                  if (var10 == 0) {
                     break label99;
                  }
               }

               if (var22 > (float)arg3) {
                  break;
               }

               if ((float)arg3 < var20 + var22) {
                  var20 = (float)arg3 - var22;
               }
            }

            if (!this.method2666(var20 + var22, 0, var19 + var21, 0.0F, var21, 0.0F, var22)) {
               return;
            }

            var21 += var19 + var23;
            this.method2565(1);
            var22 += var20 + var24;
            var19 = var15;
            var20 = var16;
         } while(var10 == 0);

         this.method2556(true, -26182);
         this.method2662(true, class496.field7336, 0);
         this.method2636(-112, 0, class496.field7336);
      } catch (RuntimeException var26) {
         throw class670.method4877(var26, field5131[123] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "q",
      descriptor = "()Z"
   )
   public final boolean method585() {
      try {
         ++field4896;
         return true;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5131[167] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(Lza;)V"
   )
   public final void method596(class434 arg0) {
      try {
         this.field4925 = ((class486)arg0).field7197;
         ++field4875;
         this.field4973 = this.field4925.method5083(32768, false);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[23] + (arg0 != null ? field5131[4] : field5131[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(Ljaclib/memory/Buffer;I)Ljaclib/memory/Stream;"
   )
   public final Stream method2593(Buffer arg0, int arg1) {
      try {
         this.field5035.method5093(arg0);
         ++field4833;
         if (arg1 != 0) {
            this.field4906 = null;
         }

         return this.field5035;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[38] + (arg0 != null ? field5131[4] : field5131[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "r",
      descriptor = "(B)V"
   )
   public abstract void method2594(byte arg0);

   @OriginalMember(
      owner = "client!dh",
      name = "d",
      descriptor = "(B)V"
   )
   private final void method2595(byte arg0) {
      try {
         int var2 = -89 % ((arg0 - 58) / 56);
         this.field5102 = (float)this.field5028;
         ++field4918;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(ZILii;I[FB)Loia;"
   )
   public final class95 method2596(boolean arg0, int arg1, class579 arg2, int arg3, float[] arg4, byte arg5) {
      try {
         ++field4946;
         return arg5 != -84 ? null : this.method2563((byte)-88, 0, arg0, arg2, 0, arg4, arg1, arg3);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field5131[27] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5131[4] : field5131[2]) + ',' + arg3 + ',' + (arg4 != null ? field5131[4] : field5131[2]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "m",
      descriptor = "()I"
   )
   public final int method586() {
      try {
         ++field4868;
         return this.field5015 + -2;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5131[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(Lef;Lii;B)Z"
   )
   public abstract boolean method2597(class513 arg0, class579 arg1, byte arg2);

   @OriginalMember(
      owner = "client!dh",
      name = "A",
      descriptor = "(ILaa;II)V"
   )
   public final void method636(int arg0, class512 arg1, int arg2, int arg3) {
      try {
         ++field4911;
         class69 var5 = (class69)arg1;
         class95 var6 = var5.field870;
         this.method2555(0);
         this.method2578(var6, true);
         this.method2550(1, -117);
         this.method2568(class680.field10213, class680.field10213, false);
         this.method2636(-118, 0, class522.field7591);
         this.method2646(arg0, 41);
         this.field4998.method3675((float)this.field4861, 0.0F, true, (float)this.field4938);
         this.method2567(-94);
         this.field5052[0].method3675(var6.method503((float)this.field4861, 25525), 1.0F, true, var6.method504((float)this.field4938, 2029));
         this.field5052[0].method3681(0, var6.method503((float)(-arg3), 25525), var6.method504((float)(-arg2), 2029), 0.0F);
         this.field5045[0] = class66.field817;
         this.method2654(-1407);
         this.method2622((byte)111);
         this.method2652(-13410);
         this.method2636(-105, 0, class496.field7336);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field5131[141] + arg0 + ',' + (arg1 != null ? field5131[4] : field5131[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "R",
      descriptor = "(I)V"
   )
   public abstract void method2598(int arg0);

   @OriginalMember(
      owner = "client!dh",
      name = "b",
      descriptor = "(ZB)V"
   )
   public final void method2599(boolean arg0, byte arg1) {
      try {
         ++field5000;
         if (arg1 == -58) {
            if (!arg0 != !this.field5030) {
               this.field5030 = arg0;
               this.method2581((byte)-126);
               this.field5009 &= -32;
            }
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[68] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method557(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         ++field4862;
         float var8 = (float)arg2 - (float)arg0;
         float var9 = (float)(-arg1) + (float)arg3;
         float var10 = 0.0F;
         float var11 = 1.0F;
         if (var8 != 0.0F || var9 != 0.0F) {
            var11 = (float)Math.sqrt((double)(var8 * var8 + var9 * var9));
            var10 = (float)Math.atan2((double)var9, (double)var8);
         }

         this.method2564((byte)-120);
         this.method2646(arg4, 100);
         this.method2636(-128, 0, class522.field7591);
         this.method2662(true, class522.field7591, 0);
         this.method2550(arg6, -118);
         this.field4998.method3675((float)arg5, 1.0F, true, var11);
         this.field4998.method1512(0, -arg5 / 2, 0);
         this.field4998.method1522((int)((double)var10 * 2607.5945876176133D) & 16383);
         this.field4998.method1512(arg0, arg1, 0);
         this.method2567(-83);
         this.method2556(false, -26182);
         this.method2622((byte)-77);
         this.method2556(true, -26182);
         this.method2662(true, class496.field7336, 0);
         this.method2636(-125, 0, class496.field7336);
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field5131[85] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(Ljava/lang/String;IIIZ)V"
   )
   public static final void method2600(String arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         ++field4844;
         class544 var5 = class241.method1793(-1, arg3, arg2);
         if (var5 != null) {
            if (var5.field7937 != null) {
               class662 var6 = new class662();
               var6.field9595 = var5.field7937;
               var6.field9583 = arg0;
               var6.field9588 = arg1;
               var6.field9589 = var5;
               class265.method2019(var6);
            }

            if (class672.field10112 == 10) {
               if (client.method2388(var5).method3549(arg1 + -1, -125)) {
                  if (~arg1 == -2) {
                     ++class732.field10863;
                     class180 var7 = class486.method3603(class101.field1240, (byte)-14, class48.field583);
                     class65.method533(arg2, var5.field7969, 0, arg3, var7);
                     class763.method5527(false, var7);
                  }

                  if (arg1 == 2) {
                     ++class522.field7589;
                     class180 var8 = class486.method3603(class134.field1719, (byte)-98, class48.field583);
                     class65.method533(arg2, var5.field7969, 0, arg3, var8);
                     class763.method5527(false, var8);
                  }

                  if (~arg1 == -4) {
                     ++class214.field2714;
                     class180 var9 = class486.method3603(class536.field7825, (byte)-121, class48.field583);
                     class65.method533(arg2, var5.field7969, 0, arg3, var9);
                     class763.method5527(false, var9);
                  }

                  if (~arg1 == -5) {
                     ++class152.field1906;
                     class180 var10 = class486.method3603(class783.field11414, (byte)-81, class48.field583);
                     class65.method533(arg2, var5.field7969, 0, arg3, var10);
                     class763.method5527(false, var10);
                  }

                  if (arg1 == 5) {
                     ++class423.field6424;
                     class180 var11 = class486.method3603(class544.field8007, (byte)-71, class48.field583);
                     class65.method533(arg2, var5.field7969, 0, arg3, var11);
                     class763.method5527(arg4, var11);
                  }

                  if (arg1 == 6) {
                     ++class45.field480;
                     class180 var12 = class486.method3603(class455.field6904, (byte)-77, class48.field583);
                     class65.method533(arg2, var5.field7969, 0, arg3, var12);
                     class763.method5527(arg4, var12);
                  }

                  if (!arg4) {
                     if (~arg1 == -8) {
                        ++class76.field970;
                        class180 var13 = class486.method3603(class331.field4742, (byte)-66, class48.field583);
                        class65.method533(arg2, var5.field7969, 0, arg3, var13);
                        class763.method5527(arg4, var13);
                     }

                     if (~arg1 == -9) {
                        ++class611.field8955;
                        class180 var14 = class486.method3603(class676.field10156, (byte)-109, class48.field583);
                        class65.method533(arg2, var5.field7969, 0, arg3, var14);
                        class763.method5527(false, var14);
                     }

                     if (arg1 == 9) {
                        ++class153.field1930;
                        class180 var15 = class486.method3603(class716.field10659, (byte)-42, class48.field583);
                        class65.method533(arg2, var5.field7969, 0, arg3, var15);
                        class763.method5527(arg4, var15);
                     }

                     if (arg1 == 10) {
                        ++class685.field10270;
                        class180 var16 = class486.method3603(class367.field5527, (byte)-13, class48.field583);
                        class65.method533(arg2, var5.field7969, 0, arg3, var16);
                        class763.method5527(false, var16);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var18) {
         throw class670.method4877(var18, field5131[157] + (arg0 != null ? field5131[4] : field5131[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "([Lrd;Z)Lib;"
   )
   public abstract class163 method2601(class354[] arg0, boolean arg1);

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(IIII[BIZLii;)Loia;"
   )
   public abstract class95 method2602(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, boolean arg6, class579 arg7);

   @OriginalMember(
      owner = "client!dh",
      name = "EA",
      descriptor = "(IIII)V"
   )
   public final void method641(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field4882;
         if (!this.field5029) {
            throw new RuntimeException("");
         } else {
            this.field5065 = arg1;
            this.field5014 = arg2;
            this.field5021 = arg3;
            this.field5026 = arg0;
            if (this.field5098) {
               this.field5053[3].method1559(-27966);
               this.field5053[3].method413((byte)87);
            }
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field5131[20] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "x",
      descriptor = "(B)V"
   )
   public abstract void method2603(byte arg0);

   @OriginalMember(
      owner = "client!dh",
      name = "s",
      descriptor = "(I)V"
   )
   public abstract void method2604(int arg0);

   @OriginalMember(
      owner = "client!dh",
      name = "m",
      descriptor = "(I)I"
   )
   public final int method2605(int arg0) {
      try {
         if (arg0 < 100) {
            this.method2649((byte)102, 13);
         }

         ++field4886;
         return this.field5021;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[61] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "([FZ)[F"
   )
   public final float[] method2606(float[] arg0, boolean arg1) {
      try {
         arg0[8] = this.field5031[2];
         if (arg1) {
            this.field5107 = null;
         }

         arg0[4] = this.field5031[1];
         ++field4908;
         arg0[0] = this.field5031[0];
         arg0[12] = this.field5031[3];
         arg0[5] = this.field5031[5];
         arg0[9] = this.field5031[6];
         arg0[2] = this.field5031[8];
         arg0[1] = this.field5031[4];
         arg0[13] = this.field5031[7];
         arg0[14] = this.field5031[11];
         arg0[3] = this.field5031[12];
         arg0[10] = this.field5031[10];
         arg0[7] = this.field5031[13];
         arg0[6] = this.field5031[9];
         arg0[11] = this.field5031[14];
         arg0[15] = this.field5031[15];
         return arg0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[44] + (arg0 != null ? field5131[4] : field5131[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "r",
      descriptor = "()Lgq;"
   )
   public final class540 method659() {
      try {
         ++field4897;
         return this.field5117;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5131[142] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method584(Canvas arg0, int arg1, int arg2) {
      try {
         ++field4829;
         Object var4 = null;
         if (arg0 != null && this.field4818 != arg0) {
            if (this.field4906.containsKey(arg0)) {
               var4 = this.field4906.get(arg0);
            }
         } else {
            var4 = this.field4947;
         }

         if (var4 == null) {
            throw new RuntimeException();
         } else {
            this.method2679(false, var4, arg0);
            if (this.field4825 == arg0) {
               this.method2667((byte)-126);
            }
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field5131[41] + (arg0 != null ? field5131[4] : field5131[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "ZA",
      descriptor = "(IFFFFF)V"
   )
   public final void method660(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      try {
         ++field4990;
         boolean var7 = this.field5039 != arg0;
         if (var7 || this.field5024 != arg1 || this.field5072 != arg2) {
            this.field5039 = arg0;
            this.field5024 = arg1;
            this.field5072 = arg2;
            if (var7) {
               this.field5047 = (float)(this.field5039 & 65280) / 65280.0F;
               this.field5082 = (float)(this.field5039 & 16711680) / 1.671168E7F;
               this.field5062 = (float)(255 & this.field5039) / 255.0F;
               this.method2572((byte)-103);
            }

            this.field4872.setSunColour(this.field5082, this.field5047, this.field5062, arg1, arg2);
            this.method2554(-94);
         }

         if (this.field5068[0] != arg3 || this.field5068[1] != arg4 || this.field5068[2] != arg5) {
            this.field5068[1] = arg4;
            this.field5068[2] = arg5;
            this.field5068[0] = arg3;
            this.field5012[2] = -arg5;
            this.field5012[1] = -arg4;
            this.field5012[0] = -arg3;
            float var8 = (float)(1.0D / Math.sqrt((double)(arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field5057[2] = arg5 * var8;
            this.field5057[0] = arg3 * var8;
            this.field5057[1] = arg4 * var8;
            this.field5023[0] = -this.field5057[0];
            this.field5023[1] = -this.field5057[1];
            this.field5023[2] = -this.field5057[2];
            this.field4872.setSunDirection(this.field5057[0], this.field5057[1], this.field5057[2]);
            this.method2682(1);
            this.field5046 = (int)(arg3 * 256.0F / arg4);
            this.field5051 = (int)(arg5 * 256.0F / arg4);
         }

         this.method2625(0);
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field5131[161] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "F",
      descriptor = "(I)V"
   )
   public final void method2607(int arg0) {
      try {
         ++field4815;
         if (~this.field5009 != -5) {
            this.method2583(-25);
            this.method2599(false, (byte)-58);
            this.method2677(9, false);
            this.method2665(false, false);
            this.method2551(18702, false);
            this.method2571(false, -2, false, (byte)117);
            this.method2550(1, -125);
            this.method2649((byte)119, 0);
            this.field5009 = 4;
         }

         if (arg0 != 1) {
            this.field5016 = -106;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[33] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "([IIIIIZ)Lat;"
   )
   public final class396 method603(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         ++field4837;
         return new class260(this, arg3, arg4, arg0, arg1, arg2);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field5131[52] + (arg0 != null ? field5131[4] : field5131[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "()Z"
   )
   public final boolean method542() {
      try {
         ++field4953;
         return this.field5076;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5131[66] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "j",
      descriptor = "(B)V"
   )
   public abstract void method2608(byte arg0);

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(Lso;I)V"
   )
   public final void method2609(class495 arg0, int arg1) {
      try {
         this.field4998.method1513(arg0);
         if (arg1 != 1) {
            this.field5010 = null;
         }

         ++field4954;
         this.field4997 = false;
         this.method2656(111);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[75] + (arg0 != null ? field5131[4] : field5131[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(IZ)Lgp;"
   )
   public abstract class53 method2610(int arg0, boolean arg1);

   @OriginalMember(
      owner = "client!dh",
      name = "L",
      descriptor = "(I)V"
   )
   private final void method2611(int arg0) {
      try {
         this.method2561(21113);
         ++field4885;
         if (this.field5032 != null) {
            this.field5032.method409(-20939);
         }

         if (arg0 > -25) {
            this.field5010 = null;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[174] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "l",
      descriptor = "(B)V"
   )
   private final void method2612(byte arg0) {
      try {
         ++field4902;
         this.field5099 = false;
         if (this.field5032 != null) {
            this.field5032.method408(67);
         }

         this.method2588(-4756);
         if (arg0 < 92) {
            this.method625(-22, -38);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[39] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method582(boolean arg0) {
      try {
         ++field4942;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(IF)V"
   )
   public final void method2613(int arg0, float arg1) {
      try {
         if (arg0 != 8) {
            this.method2597((class513)null, (class579)null, (byte)33);
         }

         if (this.field5007 != arg1) {
            this.field5007 = arg1;
            this.method2653(-119);
         }

         ++field4889;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[111] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(Lpn;I)V"
   )
   public final void method2614(class776 arg0, int arg1) {
      try {
         this.field5045[this.field5087] = arg0;
         ++field4965;
         if (arg1 != 6) {
            this.method2580(64, false, (int[][])null, -95);
         }

         this.method2654(-1407);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[149] + (arg0 != null ? field5131[4] : field5131[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "h",
      descriptor = "(I)V"
   )
   public final void method643(int arg0) {
      try {
         ++field4920;
         if (~arg0 <= -129 && ~arg0 >= -1025) {
            if (this.field5067 != null) {
               this.field5067.method4965(true);
            }

            this.field5086 = arg0;
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[109] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "([BIIILii;I)Ldka;"
   )
   public abstract class13 method2615(byte[] arg0, int arg1, int arg2, int arg3, class579 arg4, int arg5);

   @OriginalMember(
      owner = "client!dh",
      name = "K",
      descriptor = "(I)Lso;"
   )
   public final class495 method2616(int arg0) {
      try {
         ++field4958;
         if (arg0 > -42) {
            this.method2611(-93);
         }

         return this.field5052[this.field5087];
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[165] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "B",
      descriptor = "(I)V"
   )
   private final void method2617(int arg0) {
      try {
         ++field4847;
         if (class446.field6787 != this.field5018) {
            class268 var2 = this.field5018;
            this.field5018 = class446.field6787;
            if (!var2.method2074(arg0 ^ 6037)) {
               this.method2612((byte)126);
            }

            this.method2680(arg0 ^ 28129);
            this.field5031 = this.field5060;
            this.method2611(-80);
            this.field5009 &= -8;
         }

         if (arg0 != 28129) {
            this.method659();
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(Lada;ZII)V"
   )
   public abstract void method2618(class173 arg0, boolean arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!dh",
      name = "Y",
      descriptor = "(I)V"
   )
   private final void method2619(int arg0) {
      try {
         if (!this.field5095) {
            label33: {
               float[] var2 = this.field5041;
               if (~this.field4938 == -1 || this.field4861 == 0) {
                  var2[2] = 0.0F;
                  var2[12] = 0.0F;
                  var2[3] = 0.0F;
                  var2[10] = 1.0F;
                  var2[6] = 0.0F;
                  var2[13] = 0.0F;
                  var2[7] = 0.0F;
                  var2[5] = 1.0F;
                  var2[4] = 0.0F;
                  var2[0] = 1.0F;
                  var2[1] = 0.0F;
                  var2[8] = 0.0F;
                  var2[15] = 1.0F;
                  var2[11] = 0.0F;
                  var2[14] = 0.0F;
                  var2[9] = 0.0F;
                  if (client.field4530 == 0) {
                     break label33;
                  }
               }

               var2[2] = 0.0F;
               var2[5] = -2.0F / (float)this.field4861;
               var2[13] = 1.0F;
               var2[0] = 2.0F / (float)this.field4938;
               var2[3] = 0.0F;
               var2[7] = 0.0F;
               var2[14] = 0.5F;
               var2[15] = 1.0F;
               var2[8] = 0.0F;
               var2[9] = 0.0F;
               var2[6] = 0.0F;
               var2[1] = 0.0F;
               var2[10] = 0.5F;
               var2[12] = -1.0F;
               var2[11] = 0.0F;
               var2[4] = 0.0F;
            }

            this.field5095 = true;
         }

         if (arg0 == 4) {
            ++field4950;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[67] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "q",
      descriptor = "(B)I"
   )
   public final int method2620(byte arg0) {
      try {
         if (arg0 != 69) {
            this.field5022 = 0.81370413F;
         }

         ++field4866;
         return this.field5014;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[71] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(IIZIZI)V"
   )
   private final void method2621(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
      try {
         if (arg5 >= 126) {
            ++field4816;
            boolean var9 = arg4 & this.method649();
            if (!var9 && (~arg0 == -5 || arg0 == 8 || ~arg0 == -10)) {
               arg0 = 2;
               arg3 = ~arg0 != -5 ? 1 : arg1 & 1;
               arg1 = 0;
            }

            if (~arg0 != -1 && arg2) {
               arg0 |= Integer.MIN_VALUE;
            }

            if (~this.field5070 == ~arg0) {
               if (~this.field5070 != -1) {
                  this.field5053[this.field5070 & Integer.MAX_VALUE].method417(arg2, (byte)-102);
                  if (~this.field5043 != ~arg1 || ~this.field5097 != ~arg3) {
                     this.field5053[this.field5070 & Integer.MAX_VALUE].method412(arg1, 9950, arg3);
                     this.field5043 = arg1;
                     this.field5097 = arg3;
                  }

                  return;
               }
            } else {
               if (this.field5070 != 0) {
                  this.field5053[Integer.MAX_VALUE & this.field5070].method411(-22);
               }

               label56: {
                  if (~arg0 == -1) {
                     this.field5032 = null;
                     if (client.field4530 == 0) {
                        break label56;
                     }
                  }

                  this.field5032 = this.field5053[Integer.MAX_VALUE & arg0];
                  this.field5032.method410(124, arg2);
                  this.field5032.method417(arg2, (byte)-102);
                  this.field5032.method412(arg1, 9950, arg3);
               }

               this.field5070 = arg0;
               this.field5097 = arg3;
               this.field5043 = arg1;
            }

         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field5131[102] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "y",
      descriptor = "(B)V"
   )
   public final void method2622(byte arg0) {
      try {
         this.method2553(class264.field3616, 2, 0);
         ++field4828;
         int var2 = 59 / ((arg0 - 15) / 53);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[101] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "g",
      descriptor = "(B)V"
   )
   public final void method2623(byte arg0) {
      try {
         if (this.field5009 != 8) {
            this.method2617(28129);
            this.method2599(true, (byte)-58);
            this.method2665(true, false);
            this.method2551(18702, true);
            this.method2550(1, -117);
            this.field5009 = 8;
         }

         ++field4913;
         if (arg0 >= -24) {
            this.field5070 = 113;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[124] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "v",
      descriptor = "(B)V"
   )
   public abstract void method2624(byte arg0);

   @OriginalMember(
      owner = "client!dh",
      name = "k",
      descriptor = "(I)V"
   )
   public abstract void method2625(int arg0);

   @OriginalMember(
      owner = "client!dh",
      name = "E",
      descriptor = "(I)V"
   )
   public abstract void method2626(int arg0);

   @OriginalMember(
      owner = "client!dh",
      name = "i",
      descriptor = "(II)V"
   )
   public abstract void method2627(int arg0, int arg1);

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(IIIILnda;ILhi;)V"
   )
   public abstract void method2628(int arg0, int arg1, int arg2, int arg3, class583 arg4, int arg5, class215 arg6);

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(Lada;IIZZ)V"
   )
   public abstract void method2629(class173 arg0, int arg1, int arg2, boolean arg3, boolean arg4);

   @OriginalMember(
      owner = "client!dh",
      name = "r",
      descriptor = "(IIIIIII)I"
   )
   public final int method590(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      int var8 = client.field4530;

      try {
         int var9;
         label75: {
            ++field4859;
            var9 = 0;
            float var10 = (float)arg2 * this.field5001.field7322 + (float)arg0 * this.field5001.field7289 + (float)arg1 * this.field5001.field7316 + this.field5001.field7285;
            float var11 = (float)arg5 * this.field5001.field7322 + (float)arg3 * this.field5001.field7289 + (float)arg4 * this.field5001.field7316 + this.field5001.field7285;
            if (!((float)this.field5096 > var10) || !(var11 < (float)this.field5096)) {
               if (!((float)this.field5028 < var10) || !(var11 > (float)this.field5028)) {
                  break label75;
               }

               var9 |= 32;
               if (var8 == 0) {
                  break label75;
               }
            }

            var9 |= 16;
         }

         label54: {
            int var12 = (int)(((float)arg2 * this.field5001.field7306 + (float)arg0 * this.field5001.field7331 + (float)arg1 * this.field5001.field7328 + this.field5001.field7321) * (float)this.field5101 / (float)arg6);
            int var13 = (int)(((float)arg5 * this.field5001.field7306 + (float)arg3 * this.field5001.field7331 + (float)arg4 * this.field5001.field7328 + this.field5001.field7321) * (float)this.field5101 / (float)arg6);
            if ((float)var12 < this.field5104 && this.field5104 > (float)var13) {
               var9 |= 1;
               if (var8 == 0) {
                  break label54;
               }
            }

            if (this.field5022 < (float)var12 && (float)var13 > this.field5022) {
               var9 |= 2;
            }
         }

         int var14 = (int)(((float)arg2 * this.field5001.field7325 + (float)arg0 * this.field5001.field7310 + (float)arg1 * this.field5001.field7284 + this.field5001.field7308) * (float)this.field5033 / (float)arg6);
         int var15 = (int)(((float)arg5 * this.field5001.field7325 + (float)arg3 * this.field5001.field7310 + (float)arg4 * this.field5001.field7284 + this.field5001.field7308) * (float)this.field5033 / (float)arg6);
         if (!((float)var14 < this.field5037) || !((float)var15 < this.field5037)) {
            if (!((float)var14 > this.field5074) || !((float)var15 > this.field5074)) {
               return var9;
            }

            var9 |= 8;
            if (var8 == 0) {
               return var9;
            }
         }

         var9 |= 4;
         return var9;
      } catch (RuntimeException var17) {
         throw class670.method4877(var17, field5131[48] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "p",
      descriptor = "(I)V"
   )
   private final void method2630(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V"
   )
   public abstract void method2631(int arg0, Canvas arg1, Object arg2);

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(BZ)V"
   )
   public final void method2632(byte arg0, boolean arg1) {
      try {
         ++field4904;
         if (arg1 == !this.field5054) {
            this.field5054 = arg1;
            this.method2592(68);
         }

         if (arg0 > -61) {
            this.field5053 = null;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "XA",
      descriptor = "()I"
   )
   public final int method639() {
      try {
         ++field4972;
         return this.field5028;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5131[87] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "aa",
      descriptor = "(IIIIII)V"
   )
   public final void method645(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field4988;
         this.method2564((byte)-120);
         this.method2646(arg4, 54);
         this.method2636(-105, 0, class522.field7591);
         this.method2662(true, class522.field7591, 0);
         this.method2550(arg5, -123);
         this.field4998.method3675((float)arg3, 1.0F, true, (float)arg2);
         this.field4998.method1512(arg0, arg1, 0);
         this.method2567(-85);
         this.method2556(false, -26182);
         this.method2622((byte)103);
         this.method2556(true, -26182);
         this.method2662(true, class496.field7336, 0);
         this.method2636(-100, 0, class496.field7336);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field5131[147] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "KA",
      descriptor = "(IIII)V"
   )
   public final void method554(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field4891;
         if (arg0 <= 0 && arg2 >= this.field4938 + -1 && ~arg1 >= -1 && this.field4861 - 1 <= arg3) {
            this.method607();
         } else {
            this.field5013 = arg2 <= this.field4938 ? arg2 : 0;
            this.field5016 = ~arg1 <= -1 ? arg1 : 0;
            this.field5038 = ~arg0 <= -1 ? arg0 : 0;
            this.field5025 = arg3 <= this.field4938 ? arg3 : 0;
            if (!this.field5130) {
               this.field5130 = true;
               this.method2624((byte)50);
            }

            this.method2585(Integer.MIN_VALUE);
            this.method2657(-19983);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field5131[129] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "g",
      descriptor = "(Z)V"
   )
   public final void method2633(boolean arg0) {
      try {
         this.method2647(arg0);
         ++field4856;
         this.method2611(-110);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[40] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "y",
      descriptor = "()Z"
   )
   public final boolean method634() {
      try {
         ++field4826;
         return true;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5131[159] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "e",
      descriptor = "(IZ)V"
   )
   public final void method2634(int arg0, boolean arg1) {
      try {
         ++field4830;
         if (arg0 != 2) {
            this.method2592(-52);
         }

         if (!arg1 == this.field5090) {
            this.field5090 = arg1;
            this.method2581((byte)23);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[78] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "s",
      descriptor = "()Z"
   )
   public final boolean method545() {
      try {
         ++field4905;
         return false;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5131[19] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(Lvha;Z)V"
   )
   public abstract void method2635(class713 arg0, boolean arg1);

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(IILada;)V"
   )
   public final void method2636(int arg0, int arg1, class173 arg2) {
      try {
         if (arg0 > -88) {
            this.method545();
         }

         ++field4919;
         this.method2629(arg2, 34, arg1, false, false);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5131[43] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5131[4] : field5131[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "P",
      descriptor = "(IIIII)V"
   )
   public final void method539(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.method588(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
         ++field4985;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field5131[21] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;"
   )
   public final class293 method658(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      try {
         ++field4970;
         return new class192(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field5131[104] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5131[4] : field5131[2]) + ',' + (arg3 != null ? field5131[4] : field5131[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "f",
      descriptor = "(II)V"
   )
   public final void method625(int arg0, int arg1) {
      try {
         if (this.field5096 != arg0 || ~this.field5028 != ~arg1) {
            this.field5096 = arg0;
            this.field5028 = arg1;
            this.method2573((byte)71);
            this.method2653(-110);
            this.method2549(0);
         }

         ++field4991;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[86] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "j",
      descriptor = "()Lgq;"
   )
   public final class540 method559() {
      try {
         ++field4909;
         return new class495();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5131[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "D",
      descriptor = "(B)V"
   )
   private final void method2637(byte arg0) {
      try {
         this.field5060[14] = this.field5088;
         ++field4893;
         this.field5060[10] = this.field5075;
         this.field5071 = (this.field5060[14] - (float)this.field5028) / this.field5060[10];
         int var2 = 22 % ((arg0 - -37) / 48);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[114] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "c",
      descriptor = "(B)Lso;"
   )
   public final class495 method2638(byte arg0) {
      try {
         if (arg0 > -10) {
            this.method635();
         }

         ++field4914;
         if (!this.field5099) {
            this.field5005.method3670(this.field5003, this.field4998);
            this.field5099 = true;
         }

         return this.field5005;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[59] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(BLnda;II)V"
   )
   public abstract void method2639(byte arg0, class583 arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!dh",
      name = "o",
      descriptor = "()V"
   )
   public final void method548() {
      try {
         if (this.field5067 != null) {
            this.field5067.method4965(true);
         }

         ++field4877;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5131[30] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "M",
      descriptor = "()I"
   )
   public final int method556() {
      try {
         ++field4930;
         return this.field5129;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5131[172] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "o",
      descriptor = "(B)V"
   )
   public final void method2640(byte arg0) {
      int var2 = client.field4530;

      try {
         ++field4863;
         Hashtable var3 = new Hashtable();
         if (this.field4906 != null && !this.field4906.isEmpty()) {
            Enumeration var4 = this.field4906.keys();
            if (var2 != 0 || var4.hasMoreElements()) {
               do {
                  Canvas var5 = (Canvas)var4.nextElement();
                  var3.put(var5, this.method2678(var5, -1));
               } while(var4.hasMoreElements());
            }
         }

         this.field4906 = var3;
         this.method2651(-69);
         this.method2575((byte)127);
         if (arg0 != 72) {
            this.method2627(-31, -51);
         }

         this.method2630(4);
         this.field5010.method1445(125, this);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field5131[116] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "n",
      descriptor = "(I)Lso;"
   )
   public final class495 method2641(int arg0) {
      try {
         ++field4979;
         if (arg0 <= 19) {
            this.field5015 = -63;
         }

         return this.field5004;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[139] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(Lib;B)V"
   )
   public abstract void method2642(class163 arg0, byte arg1);

   @OriginalMember(
      owner = "client!dh",
      name = "f",
      descriptor = "(Z)V"
   )
   public abstract void method2643(boolean arg0);

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(Lnia;Z)Lat;"
   )
   public final class396 method577(class671 arg0, boolean arg1) {
      int var3 = client.field4530;

      try {
         class396 var12;
         label102: {
            ++field4838;
            if (arg0.field10100 != 0 && arg0.field10097 != 0) {
               int[] var4;
               label106: {
                  var4 = new int[arg0.field10100 * arg0.field10097];
                  int var5 = 0;
                  int var6 = 0;
                  if (arg0.field10095 == null) {
                     int var7 = 0;
                     if (var3 != 0 || ~arg0.field10097 < ~var7) {
                        do {
                           int var8 = 0;
                           if (var3 != 0 || arg0.field10100 > var8) {
                              do {
                                 int var9 = arg0.field10096[255 & arg0.field10099[var5++]];
                                 var4[var6++] = var9 == 0 ? 0 : class379.method2928(var9, -16777216);
                                 ++var8;
                              } while(arg0.field10100 > var8);
                           }

                           ++var7;
                        } while(~arg0.field10097 < ~var7);
                     }

                     if (var3 == 0) {
                        break label106;
                     }
                  }

                  int var10 = 0;
                  if (var3 != 0 || ~arg0.field10097 < ~var10) {
                     do {
                        int var11 = 0;
                        if (var3 != 0) {
                           var4[var6++] = class379.method2928(arg0.field10096[class153.method1262(255, arg0.field10099[var5])], arg0.field10095[var5] << 24);
                           ++var5;
                           ++var11;
                        }

                        while(true) {
                           while(arg0.field10100 > var11) {
                              var4[var6++] = class379.method2928(arg0.field10096[class153.method1262(255, arg0.field10099[var5])], arg0.field10095[var5] << 24);
                              ++var5;
                              ++var11;
                           }

                           if (var3 == 0) {
                              ++var10;
                              break;
                           }

                           ++var11;
                        }
                     } while(~arg0.field10097 < ~var10);
                  }
               }

               var12 = this.method589(arg0.field10100, 0, 0, var4, arg0.field10100, arg0.field10097);
               if (var3 == 0) {
                  break label102;
               }
            }

            var12 = this.method589(1, 0, 0, new int[1], 1, 1);
         }

         var12.method1976(arg0.field10103, arg0.field10102, arg0.field10101, arg0.field10098);
         return var12;
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field5131[77] + (arg0 != null ? field5131[4] : field5131[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "h",
      descriptor = "(Z)V"
   )
   private final void method2644(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dh",
      name = "C",
      descriptor = "(B)V"
   )
   public abstract void method2645(byte arg0);

   @OriginalMember(
      owner = "client!dh",
      name = "c",
      descriptor = "(IIIIII)V"
   )
   public final void method553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field4880;
         float var7 = this.method2674(30807);
         this.method2564((byte)-120);
         this.method2646(arg4, 112);
         this.method2636(-93, 0, class522.field7591);
         this.method2662(true, class522.field7591, 0);
         this.method2550(arg5, -114);
         this.field4998.method3675((float)(arg3 + -1), 1.0F, true, (float)(arg2 + -1));
         this.field4998.method3681(0, (float)arg1 + -var7, (float)arg0 - var7, 0.0F);
         this.method2567(-91);
         this.method2556(false, -26182);
         this.method2553(class288.field4042, 4, 0);
         this.method2556(true, -26182);
         this.method2662(true, class496.field7336, 0);
         this.method2636(-109, 0, class496.field7336);
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field5131[173] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "h",
      descriptor = "(II)V"
   )
   public final void method2646(int arg0, int arg1) {
      try {
         ++field4817;
         if (arg1 < 15) {
            this.method2672(-119);
         }

         if (this.field5064 != arg0) {
            this.field5064 = arg0;
            this.method2603((byte)88);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[122] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "d",
      descriptor = "(Z)V"
   )
   public final void method2647(boolean arg0) {
      try {
         if (!arg0) {
            if (class662.field9593 != this.field5018) {
               class268 var2 = this.field5018;
               this.field5018 = class662.field9593;
               if (var2.method2074(31348)) {
                  this.method2612((byte)113);
               }

               this.field5031 = this.field5061;
               this.field5009 &= -32;
            }

            ++field4986;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[95] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "e",
      descriptor = "(IIIIII)V"
   )
   public final void method588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         float var7;
         float var8;
         label22: {
            ++field4963;
            var7 = (float)(-arg0) + (float)arg2;
            var8 = (float)(-arg1) + (float)arg3;
            if (var7 == 0.0F && var8 == 0.0F) {
               var7 = 1.0F;
               if (client.field4530 == 0) {
                  break label22;
               }
            }

            float var9 = (float)(1.0D / Math.sqrt((double)(var7 * var7 + var8 * var8)));
            var7 *= var9;
            var8 *= var9;
         }

         if (this.method2666((float)arg3 + var8, 0, (float)arg2 + var7, 0.0F, (float)arg0, 0.0F, (float)arg1)) {
            this.method2564((byte)-120);
            this.method2646(arg4, 40);
            this.method2636(-103, 0, class522.field7591);
            this.method2662(true, class522.field7591, 0);
            this.method2550(arg5, -116);
            this.method2661((byte)-111);
            this.method2556(false, -26182);
            this.method2565(1);
            this.method2556(true, -26182);
            this.method2662(true, class496.field7336, 0);
            this.method2636(-120, 0, class496.field7336);
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field5131[120] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "A",
      descriptor = "(I)V"
   )
   public abstract void method2648(int arg0);

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method2649(byte arg0, int arg1) {
      int var3 = client.field4530;

      try {
         if (arg0 == 119) {
            label53: {
               if (~arg1 == -2) {
                  this.method2568(class680.field10213, class680.field10213, false);
                  if (var3 == 0) {
                     break label53;
                  }
               }

               if (arg1 == 0) {
                  this.method2568(class556.field8257, class556.field8257, false);
                  if (var3 == 0) {
                     break label53;
                  }
               }

               if (arg1 != 2) {
                  if (~arg1 != -4) {
                     if (arg1 != 4) {
                        break label53;
                     }

                     this.method2568(class64.field793, class64.field793, false);
                     if (var3 == 0) {
                        break label53;
                     }
                  }

                  this.method2568(class325.field4618, class556.field8257, false);
                  if (var3 == 0) {
                     break label53;
                  }
               }

               this.method2568(class225.field2891, class680.field10213, false);
            }

            ++field4869;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5131[93] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "e",
      descriptor = "(B)V"
   )
   public final void method2650(byte arg0) {
      try {
         if (arg0 >= 90) {
            if (this.field5009 != 16) {
               this.method2576((byte)63);
               this.method2599(true, (byte)-58);
               this.method2665(true, false);
               this.method2551(18702, true);
               this.method2550(1, -107);
               this.field5009 = 16;
            }

            ++field4935;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[81] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "v",
      descriptor = "(I)V"
   )
   private final void method2651(int arg0) {
      int var2 = client.field4530;

      try {
         this.field5109 = this.method2610(-2, false);
         ++field4890;
         this.field5109.method424(140, (byte)28, 28);
         int var3 = 0;
         class338 var10000;
         int var6;
         if (var2 != 0) {
            var10000 = this;
         } else if (var3 >= 4) {
            var10000 = this;
            if (var2 == 0) {
               this.field5118 = this.method2601(new class354[]{new class354(new class697[]{class697.field10459, class697.field10468, class697.field10468})}, false);
               var6 = 32 % ((-27 - arg0) / 32);
               return;
            }
         } else {
            var10000 = this;
         }

         do {
            while(true) {
               Buffer var4 = var10000.field5109.method421((byte)-119, true);
               if (var4 != null) {
                  Stream var5 = this.method2593(var4, 0);
                  if (!Stream.method5098()) {
                     var5.method5089(0.0F);
                     var5.method5089(0.0F);
                     var5.method5089(0.0F);
                     var5.method5089(0.0F);
                     var5.method5089(0.0F);
                     var5.method5089(0.0F);
                     var5.method5089(0.0F);
                     var5.method5089(0.0F);
                     var5.method5089(1.0F);
                     var5.method5089(0.0F);
                     var5.method5089(0.0F);
                     var5.method5089(1.0F);
                     var5.method5089(0.0F);
                     var5.method5089(1.0F);
                     var5.method5089(1.0F);
                     var5.method5089(1.0F);
                     var5.method5089(0.0F);
                     var5.method5089(1.0F);
                     var5.method5089(1.0F);
                     var5.method5089(1.0F);
                     var5.method5089(1.0F);
                     var5.method5089(1.0F);
                     var5.method5089(0.0F);
                     var5.method5089(0.0F);
                     var5.method5089(1.0F);
                     var5.method5089(0.0F);
                     var5.method5089(1.0F);
                     var5.method5089(0.0F);
                     var5.method5089(0.0F);
                     var5.method5089(0.0F);
                     var5.method5089(0.0F);
                     var5.method5089(0.0F);
                     var5.method5089(0.0F);
                     var5.method5089(0.0F);
                     var5.method5089(0.0F);
                     if (var2 != 0) {
                        var5.method5084(0.0F);
                        var5.method5084(0.0F);
                        var5.method5084(0.0F);
                        var5.method5084(0.0F);
                        var5.method5084(0.0F);
                        var5.method5084(0.0F);
                        var5.method5084(0.0F);
                        var5.method5084(0.0F);
                        var5.method5084(1.0F);
                        var5.method5084(0.0F);
                        var5.method5084(0.0F);
                        var5.method5084(1.0F);
                        var5.method5084(0.0F);
                        var5.method5084(1.0F);
                        var5.method5084(1.0F);
                        var5.method5084(1.0F);
                        var5.method5084(0.0F);
                        var5.method5084(1.0F);
                        var5.method5084(1.0F);
                        var5.method5084(1.0F);
                        var5.method5084(1.0F);
                        var5.method5084(1.0F);
                        var5.method5084(0.0F);
                        var5.method5084(0.0F);
                        var5.method5084(1.0F);
                        var5.method5084(0.0F);
                        var5.method5084(1.0F);
                        var5.method5084(0.0F);
                        var5.method5084(0.0F);
                        var5.method5084(0.0F);
                        var5.method5084(0.0F);
                        var5.method5084(0.0F);
                        var5.method5084(0.0F);
                        var5.method5084(0.0F);
                        var5.method5084(0.0F);
                     }
                  } else {
                     var5.method5084(0.0F);
                     var5.method5084(0.0F);
                     var5.method5084(0.0F);
                     var5.method5084(0.0F);
                     var5.method5084(0.0F);
                     var5.method5084(0.0F);
                     var5.method5084(0.0F);
                     var5.method5084(0.0F);
                     var5.method5084(1.0F);
                     var5.method5084(0.0F);
                     var5.method5084(0.0F);
                     var5.method5084(1.0F);
                     var5.method5084(0.0F);
                     var5.method5084(1.0F);
                     var5.method5084(1.0F);
                     var5.method5084(1.0F);
                     var5.method5084(0.0F);
                     var5.method5084(1.0F);
                     var5.method5084(1.0F);
                     var5.method5084(1.0F);
                     var5.method5084(1.0F);
                     var5.method5084(1.0F);
                     var5.method5084(0.0F);
                     var5.method5084(0.0F);
                     var5.method5084(1.0F);
                     var5.method5084(0.0F);
                     var5.method5084(1.0F);
                     var5.method5084(0.0F);
                     var5.method5084(0.0F);
                     var5.method5084(0.0F);
                     var5.method5084(0.0F);
                     var5.method5084(0.0F);
                     var5.method5084(0.0F);
                     var5.method5084(0.0F);
                     var5.method5084(0.0F);
                  }

                  var5.method5085();
                  if (this.field5109.method422((byte)98)) {
                     if (var2 == 0) {
                        var10000 = this;
                        break;
                     }

                     ++var3;
                  } else {
                     ++var3;
                  }
               } else {
                  ++var3;
               }

               if (var3 >= 4) {
                  var10000 = this;
                  if (var2 == 0) {
                     this.field5118 = this.method2601(new class354[]{new class354(new class697[]{class697.field10459, class697.field10468, class697.field10468})}, false);
                     var6 = 32 % ((-27 - arg0) / 32);
                     return;
                  }
               } else {
                  var10000 = this;
               }
            }
         } while(var2 != 0);

         this.field5118 = this.method2601(new class354[]{new class354(new class697[]{class697.field10459, class697.field10468, class697.field10468})}, false);
         var6 = 32 % ((-27 - arg0) / 32);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field5131[143] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "z",
      descriptor = "(I)V"
   )
   public final void method2652(int arg0) {
      try {
         if (this.field5045[this.field5087] != class62.field773) {
            this.field5045[this.field5087] = class62.field773;
            this.field5052[this.field5087].method1525();
            this.method2654(arg0 ^ 12575);
         }

         if (arg0 != -13410) {
            this.method2577(true, -45, (int[])null, 34, -109);
         }

         ++field4884;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "P",
      descriptor = "(I)V"
   )
   private final void method2653(int arg0) {
      try {
         if (arg0 <= -100) {
            ++field4969;
            this.field5094 = false;
            this.method2552((byte)-30);
            if (class97.field1195 == this.field5018) {
               this.method2611(-36);
            }
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[51] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "k",
      descriptor = "()Z"
   )
   public final boolean method649() {
      try {
         ++field4975;
         return this.field5053[3].method407((byte)49);
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5131[105] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(II[I[I)Laa;"
   )
   public final class512 method572(int arg0, int arg1, int[] arg2, int[] arg3) {
      try {
         ++field4878;
         return class64.method527(-111, this, arg0, arg1, arg2, arg3);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field5131[79] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5131[4] : field5131[2]) + ',' + (arg3 != null ? field5131[4] : field5131[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "o",
      descriptor = "(I)V"
   )
   private final void method2654(int arg0) {
      try {
         if (arg0 == -1407) {
            ++field4820;
            this.method2557((byte)90);
            if (this.field5032 != null) {
               this.field5032.method416(true);
            }
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[32] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "b",
      descriptor = "(IZ)V"
   )
   public final void method2655(int arg0, boolean arg1) {
      try {
         if (arg1 == !this.field5066) {
            this.field5066 = arg1;
            this.method2660(1);
         }

         ++field4852;
         if (arg0 != 9092) {
            this.field4861 = 93;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "T",
      descriptor = "(I)V"
   )
   private final void method2656(int arg0) {
      try {
         ++field4864;
         if (class260.field3536 == this.field5018) {
            float var2 = this.method2674(30807);
            this.field4998.method3681(0, var2, var2, 0.0F);
         }

         if (arg0 < 83) {
            this.field5117 = null;
         }

         this.field5099 = false;
         this.method2664((byte)-38);
         if (this.field5032 != null) {
            this.field5032.method415(true);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[82] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "N",
      descriptor = "(I)V"
   )
   private final void method2657(int arg0) {
      try {
         this.field5022 = (float)(-this.field5091 + this.field5013);
         this.field5074 = (float)(-this.field5103 + this.field5025);
         if (arg0 == -19983) {
            this.field5104 = (float)(-this.field5091 + this.field5038);
            ++field4821;
            this.field5037 = (float)(-this.field5103 + this.field5016);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[45] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(III[J[I)V"
   )
   public static final void method2658(int arg0, int arg1, int arg2, long[] arg3, int[] arg4) {
      int var5 = client.field4530;

      try {
         if (arg0 == 0) {
            if (~arg2 < ~arg1) {
               int var10000;
               int var10001;
               label57: {
                  int var6 = (arg1 + arg2) / 2;
                  int var7 = arg1;
                  long var8 = arg3[var6];
                  arg3[var6] = arg3[arg2];
                  arg3[arg2] = var8;
                  int var10 = arg4[var6];
                  arg4[var6] = arg4[arg2];
                  arg4[arg2] = var10;
                  int var11 = ~var8 == Long.MIN_VALUE ? 0 : 1;
                  int var12 = arg1;
                  if (var5 != 0) {
                     var10000 = var11;
                     var10001 = arg1;
                  } else if (arg1 >= arg2) {
                     arg3[arg2] = arg3[arg1];
                     arg3[arg1] = var8;
                     arg4[arg2] = arg4[arg1];
                     arg4[arg1] = var10;
                     method2658(0, arg1, arg1 - 1, arg3, arg4);
                     var10000 = 0;
                     var10001 = arg1 - -1;
                     if (var5 == 0) {
                        break label57;
                     }
                  } else {
                     var10000 = var11;
                     var10001 = arg1;
                  }

                  while(true) {
                     if (~((long)(var10000 & var10001) + var8) < ~arg3[var12]) {
                        long var13 = arg3[var12];
                        arg3[var12] = arg3[var7];
                        arg3[var7] = var13;
                        int var15 = arg4[var12];
                        arg4[var12] = arg4[var7];
                        arg4[var7++] = var15;
                     }

                     ++var12;
                     if (var12 >= arg2) {
                        arg3[arg2] = arg3[var7];
                        arg3[var7] = var8;
                        arg4[arg2] = arg4[var7];
                        arg4[var7] = var10;
                        method2658(0, arg1, var7 - 1, arg3, arg4);
                        var10000 = 0;
                        var10001 = var7 - -1;
                        if (var5 == 0) {
                           break;
                        }
                     } else {
                        var10000 = var11;
                        var10001 = var12;
                     }
                  }
               }

               method2658(var10000, var10001, arg2, arg3, arg4);
            }

            ++field4932;
         }
      } catch (RuntimeException var17) {
         throw class670.method4877(var17, field5131[53] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5131[4] : field5131[2]) + ',' + (arg4 != null ? field5131[4] : field5131[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "E",
      descriptor = "()I"
   )
   public final int method565() {
      try {
         ++field4887;
         return this.field4996 + this.field4994 - -this.field4982;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5131[22] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(ILgp;I)V"
   )
   public abstract void method2659(int arg0, class53 arg1, int arg2);

   @OriginalMember(
      owner = "client!dh",
      name = "l",
      descriptor = "(I)V"
   )
   public abstract void method2660(int arg0);

   @OriginalMember(
      owner = "client!dh",
      name = "p",
      descriptor = "(B)V"
   )
   public final void method2661(byte arg0) {
      try {
         ++field4845;
         if (arg0 <= -93) {
            this.field4998.method1525();
            this.field4997 = true;
            this.method2656(125);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[140] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(ZLada;I)V"
   )
   public final void method2662(boolean arg0, class173 arg1, int arg2) {
      try {
         ++field4836;
         this.method2618(arg1, false, 2, arg2);
         if (!arg0) {
            this.method591();
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5131[166] + arg0 + ',' + (arg1 != null ? field5131[4] : field5131[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "v",
      descriptor = "()V"
   )
   public void method624() {
      int var1 = client.field4530;

      try {
         ++field4983;
         if (!this.field5073) {
            class347 var2 = this.field4901.method4071((byte)126);
            if (var1 != 0) {
               ((class486)var2).method3602((byte)-123);
               var2 = this.field4901.method4059((byte)-122);
            }

            while(true) {
               if (var2 == null) {
                  Enumeration var3 = this.field4906.keys();
                  if (var1 == 0) {
                     Canvas var4;
                     if (var1 != 0) {
                        var4 = (Canvas)var3.nextElement();
                        this.method2631(102, var4, this.field4906.get(var4));
                     }

                     while(true) {
                        Object var10000;
                        if (!var3.hasMoreElements()) {
                           class442.method3343(true, false, (byte)-122);
                           this.field4872.release();
                           var10000 = this;
                           if (var1 == 0) {
                              this.field5073 = true;
                              return;
                           }
                        } else {
                           var10000 = var3.nextElement();
                        }

                        var4 = (Canvas)var10000;
                        this.method2631(102, var4, this.field4906.get(var4));
                     }
                  }
               } else {
                  ((class486)var2).method3602((byte)-123);
               }

               var2 = this.field4901.method4059((byte)-122);
            }
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field5131[73] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "JA",
      descriptor = "(IIIIII)I"
   )
   public final int method612(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      int var7 = client.field4530;

      try {
         ++field4978;
         int var8 = 0;
         float var9 = (float)arg2 * this.field5001.field7322 + (float)arg0 * this.field5001.field7289 + (float)arg1 * this.field5001.field7316 + this.field5001.field7285;
         if (var9 < 1.0F) {
            var9 = 1.0F;
         }

         float var10 = (float)arg5 * this.field5001.field7322 + (float)arg3 * this.field5001.field7289 + (float)arg4 * this.field5001.field7316 + this.field5001.field7285;
         if (var10 < 1.0F) {
            var10 = 1.0F;
         }

         label67: {
            if ((float)this.field5096 > var9 && (float)this.field5096 > var10) {
               var8 |= 16;
               if (var7 == 0) {
                  break label67;
               }
            }

            if (var9 > (float)this.field5028 && var10 > (float)this.field5028) {
               var8 |= 32;
            }
         }

         label77: {
            int var11 = (int)(((float)arg2 * this.field5001.field7306 + (float)arg0 * this.field5001.field7331 + (float)arg1 * this.field5001.field7328 + this.field5001.field7321) * (float)this.field5101 / var9);
            int var12 = (int)(((float)arg5 * this.field5001.field7306 + (float)arg3 * this.field5001.field7331 + (float)arg4 * this.field5001.field7328 + this.field5001.field7321) * (float)this.field5101 / var10);
            if (!(this.field5104 > (float)var11) || !(this.field5104 > (float)var12)) {
               if (!((float)var11 > this.field5022) || !((float)var12 > this.field5022)) {
                  break label77;
               }

               var8 |= 2;
               if (var7 == 0) {
                  break label77;
               }
            }

            var8 |= 1;
         }

         int var13 = (int)(((float)arg2 * this.field5001.field7325 + (float)arg0 * this.field5001.field7310 + (float)arg1 * this.field5001.field7284 + this.field5001.field7308) * (float)this.field5033 / var9);
         int var14 = (int)(((float)arg5 * this.field5001.field7325 + (float)arg3 * this.field5001.field7310 + (float)arg4 * this.field5001.field7284 + this.field5001.field7308) * (float)this.field5033 / var10);
         if ((float)var13 < this.field5037 && this.field5037 > (float)var14) {
            var8 |= 4;
            if (var7 == 0) {
               return var8;
            }
         }

         if ((float)var13 > this.field5074 && this.field5074 < (float)var14) {
            var8 |= 8;
         }

         return var8;
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field5131[107] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "i",
      descriptor = "()I"
   )
   public final int method635() {
      try {
         ++field4956;
         return this.field5096;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5131[60] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "U",
      descriptor = "(I)V"
   )
   public abstract void method2663(int arg0);

   @OriginalMember(
      owner = "client!dh",
      name = "F",
      descriptor = "(B)V"
   )
   public abstract void method2664(byte arg0);

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method2665(boolean arg0, boolean arg1) {
      try {
         if (this.field5100 != arg0) {
            this.field5100 = arg0;
            this.method2608((byte)73);
            this.field5009 &= -32;
         }

         ++field4989;
         if (arg1) {
            this.method2625(52);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "X",
      descriptor = "(I)V"
   )
   public final void method646(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(FIFFFFF)Z"
   )
   private final boolean method2666(float arg0, int arg1, float arg2, float arg3, float arg4, float arg5, float arg6) {
      try {
         ++field4934;
         Buffer var8 = this.field5119.method421((byte)-96, true);
         if (var8 == null) {
            return false;
         } else {
            Stream var9;
            label18: {
               var9 = this.method2593(var8, arg1);
               if (!Stream.method5098()) {
                  var9.method5089(arg4);
                  var9.method5089(arg6);
                  var9.method5089(arg3);
                  var9.method5089(arg2);
                  var9.method5089(arg0);
                  var9.method5089(arg5);
                  if (client.field4530 == 0) {
                     break label18;
                  }
               }

               var9.method5084(arg4);
               var9.method5084(arg6);
               var9.method5084(arg3);
               var9.method5084(arg2);
               var9.method5084(arg0);
               var9.method5084(arg5);
            }

            var9.method5085();
            return this.field5119.method422((byte)98);
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field5131[63] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "s",
      descriptor = "(B)V"
   )
   private final void method2667(byte arg0) {
      try {
         label15: {
            ++field4960;
            if (this.field4825 != null) {
               Dimension var2 = this.field4825.getSize();
               this.field4922 = var2.height;
               this.field4851 = var2.width;
               if (client.field4530 == 0) {
                  break label15;
               }
            }

            this.field4851 = this.field4922 = 1;
         }

         this.field4938 = this.field4851;
         this.field4861 = this.field4922;
         this.method2675((byte)35);
         this.method2573((byte)71);
         this.method2653(-106);
         this.method2663(-8);
         this.method2657(-19983);
         int var3 = 58 % ((-84 - arg0) / 41);
         this.method2647(false);
         this.method607();
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5131[92] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "M",
      descriptor = "(I)V"
   )
   public final void method2668(int arg0) {
      int var2 = client.field4530;

      try {
         this.field5040 = new class358[this.field5055];
         this.field5052 = new class495[this.field5055];
         ++field4876;
         this.field5063 = new class358[this.field5055];
         this.field5036 = new class254[this.field5055];
         this.field5045 = new class776[this.field5055];
         if (arg0 >= 77) {
            int var3 = 0;
            if (var2 != 0) {
               this.field5063[var3] = class556.field8257;
               this.field5040[var3] = class556.field8257;
               this.field5045[var3] = class62.field773;
               this.field5052[var3] = new class495();
               ++var3;
            }

            while(true) {
               while(~this.field5055 < ~var3) {
                  this.field5063[var3] = class556.field8257;
                  this.field5040[var3] = class556.field8257;
                  this.field5045[var3] = class62.field773;
                  this.field5052[var3] = new class495();
                  ++var3;
               }

               this.field5050 = new class744[this.field5015 - 2];
               this.field5042 = this.method2584((byte)104, class513.field7519, 1, 1, class75.field963);
               this.method596(new class486(262144));
               this.field5122 = this.method2601(new class354[]{new class354(new class697[]{class697.field10459, class697.field10468})}, false);
               this.field5111 = this.method2601(new class354[]{new class354(new class697[]{class697.field10459, class697.field10465})}, false);
               this.field5125 = this.method2601(new class354[]{new class354(class697.field10459), new class354(class697.field10465), new class354(class697.field10468), new class354(class697.field10463)}, false);
               this.field5116 = this.method2601(new class354[]{new class354(class697.field10459), new class354(class697.field10465), new class354(class697.field10468)}, false);
               this.field5108 = new class298(this, 0, 0, false, false);
               this.field5113 = new class298(this, 0, 0, true, true);
               this.field5112 = new class298(this, 0, 0, false, false);
               this.field5121 = new class298(this, 0, 0, true, true);
               this.field5120 = new class298(this, 0, 0, false, false);
               this.field5124 = new class298(this, 0, 0, true, true);
               this.field5107 = new class298(this, 0, 0, false, false);
               this.field5127 = new class298(this, 0, 0, true, true);
               this.field5128 = new class298(this, 0, 0, false, false);
               this.field5123 = new class298(this, 0, 0, true, true);
               this.field5010 = new class186(this);
               this.field5110 = this.method2670(true, (byte)-106);
               this.method2640((byte)72);
               this.field4843 = new class482(this);
               this.field5053[1] = this.method2579(true, 1);
               this.field5053[2] = this.method2579(true, 2);
               this.field5053[4] = this.method2579(true, 4);
               this.field5053[5] = this.method2579(true, 5);
               this.field5053[6] = this.method2579(true, 6);
               this.field5053[7] = this.method2579(true, 7);
               this.field5053[3] = this.method2579(true, 3);
               this.field5053[8] = this.method2579(true, 8);
               this.field5053[9] = this.method2579(true, 9);
               if (var2 == 0) {
                  if (!this.field5053[2].method407((byte)41)) {
                     this.field5053[2] = this.method2579(true, 0);
                  }

                  if (!this.field5053[4].method407((byte)83)) {
                     this.field5053[4] = this.field5053[2];
                  }

                  if (!this.field5053[8].method407((byte)55)) {
                     this.field5053[8] = this.field5053[4];
                  }

                  if (!this.field5053[9].method407((byte)45)) {
                     this.field5053[9] = this.field5053[8];
                  }

                  this.method2558((byte)115);
                  this.method607();
                  this.method614();
                  return;
               }

               this.field5052[var3] = new class495();
               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5131[90] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "L",
      descriptor = "(III)V"
   )
   public final void method540(int arg0, int arg1, int arg2) {
      try {
         ++field4959;
         if (this.field5083 != arg0 || ~this.field5077 != ~arg1 || this.field5089 != arg2) {
            this.field5089 = arg2;
            this.field5083 = arg0;
            this.field5077 = arg1;
            this.method2549(0);
            this.method2581((byte)-118);
         }

      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5131[76] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "C",
      descriptor = "(I)Lcea;"
   )
   public final class223 method2669(int arg0) {
      try {
         if (arg0 != -720) {
            return null;
         } else {
            ++field4984;
            return this.field5084 != null ? this.field5084.method1023(arg0 + 721) : null;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[24] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "xa",
      descriptor = "(F)V"
   )
   public final void method654(float arg0) {
      try {
         if (this.field5059 != arg0) {
            this.field5059 = arg0;
            this.field4872.setAmbient(arg0);
            this.method2572((byte)-103);
            this.method2625(0);
         }

         ++field4915;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[154] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method610(int[] arg0) {
      try {
         arg0[0] = this.field4938;
         ++field4813;
         arg0[1] = this.field4861;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[145] + (arg0 != null ? field5131[4] : field5131[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(I[Llja;)V"
   )
   public final void method599(int arg0, class744[] arg1) {
      int var3 = client.field4530;

      try {
         ++field4888;
         int var4 = 0;
         if (var3 != 0) {
            this.field5050[var4] = arg1[var4];
            ++var4;
         }

         while(true) {
            class338 var10000;
            if (var4 >= arg0) {
               this.field5105 = arg0;
               var10000 = this;
               if (var3 == 0) {
                  if (this.field5018.method2074(31348)) {
                     this.method2589(-108);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = this;
            }

            var10000.field5050[var4] = arg1[var4];
            ++var4;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field5131[113] + arg0 + ',' + (arg1 != null ? field5131[4] : field5131[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(ZB)Lhi;"
   )
   public abstract class215 method2670(boolean arg0, byte arg1);

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(ILii;IIZ[B)Loia;"
   )
   public final class95 method2671(int arg0, class579 arg1, int arg2, int arg3, boolean arg4, byte[] arg5) {
      try {
         ++field4839;
         return arg2 != 13197 ? null : this.method2602(0, arg3, arg0, arg2 ^ -11327, arg5, 0, arg4, arg1);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field5131[118] + arg0 + ',' + (arg1 != null ? field5131[4] : field5131[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field5131[4] : field5131[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "t",
      descriptor = "(I)Lso;"
   )
   public final class495 method2672(int arg0) {
      try {
         ++field4999;
         if (arg0 >= -30) {
            this.field4947 = null;
         }

         return this.field4998;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[69] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "f",
      descriptor = "(IIIIII)Luaa;"
   )
   public final class126 method594(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field4857;
         return new class124(this, arg0, arg1, arg2, arg3, arg4, arg5);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field5131[153] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "K",
      descriptor = "([I)V"
   )
   public final void method618(int[] arg0) {
      try {
         arg0[0] = this.field5038;
         arg0[3] = this.field5025;
         ++field4924;
         arg0[2] = this.field5013;
         arg0[1] = this.field5016;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[83] + (arg0 != null ? field5131[4] : field5131[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(BZI)Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   public final NativeHeapBuffer method2673(byte arg0, boolean arg1, int arg2) {
      try {
         ++field4926;
         if (arg0 != 126) {
            this.method2578((class254)null, true);
         }

         return this.field4925.method5083(arg2, arg1);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5131[13] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "u",
      descriptor = "(I)F"
   )
   public abstract float method2674(int arg0);

   @OriginalMember(
      owner = "client!dh",
      name = "n",
      descriptor = "(B)V"
   )
   private final void method2675(byte arg0) {
      try {
         int var2 = -118 / ((76 - arg0) / 36);
         ++field4881;
         this.field5095 = false;
         if (class260.field3536 == this.field5018) {
            this.method2619(4);
            this.method2611(-102);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[130] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(II[IIIZI)Loia;"
   )
   public abstract class95 method2676(int arg0, int arg1, int[] arg2, int arg3, int arg4, boolean arg5, int arg6);

   @OriginalMember(
      owner = "client!dh",
      name = "d",
      descriptor = "(IZ)V"
   )
   public final void method2677(int arg0, boolean arg1) {
      try {
         ++field4933;
         if (arg0 != 9) {
            this.field4825 = null;
         }

         if (this.field5048 != arg1) {
            this.field5048 = arg1;
            this.method2592(-99);
            this.field5009 &= -8;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5131[72] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;"
   )
   public abstract Object method2678(Canvas arg0, int arg1);

   @OriginalMember(
      owner = "client!dh",
      name = "d",
      descriptor = "()Z"
   )
   public final boolean method573() {
      try {
         ++field4879;
         return true;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5131[70] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(ZLjava/lang/Object;Ljava/awt/Canvas;)V"
   )
   public abstract void method2679(boolean arg0, Object arg1, Canvas arg2);

   @OriginalMember(
      owner = "client!dh",
      name = "j",
      descriptor = "(I)V"
   )
   private final void method2680(int arg0) {
      try {
         ++field4968;
         if (arg0 != 0) {
            this.method567();
         }

         if (!this.field5017) {
            label23: {
               float[] var2 = this.field5060;
               float var3 = (float)(-this.field5091 * this.field5096) / (float)this.field5101;
               float var4 = (float)((-this.field5091 + this.field4938) * this.field5096) / (float)this.field5101;
               float var5 = (float)(this.field5103 * this.field5096) / (float)this.field5033;
               float var6 = (float)((-this.field4861 + this.field5103) * this.field5096) / (float)this.field5033;
               if (var3 != var4 && var5 != var6) {
                  float var7 = (float)this.field5096 * 2.0F;
                  var2[4] = 0.0F;
                  var2[3] = 0.0F;
                  var2[6] = 0.0F;
                  var2[15] = 0.0F;
                  var2[10] = this.field5075 = (float)this.field5028 / (float)(-this.field5028 + this.field5096);
                  var2[11] = -1.0F;
                  var2[13] = 0.0F;
                  var2[14] = this.field5088 = (float)(this.field5096 * this.field5028) / (float)(-this.field5028 + this.field5096);
                  var2[8] = (var3 + var4) / (-var3 + var4);
                  var2[12] = 0.0F;
                  var2[2] = 0.0F;
                  var2[7] = 0.0F;
                  var2[9] = (var5 + var6) / (-var6 + var5);
                  var2[0] = var7 / (-var3 + var4);
                  var2[5] = var7 / (var5 - var6);
                  var2[1] = 0.0F;
                  if (client.field4530 == 0) {
                     break label23;
                  }
               }

               var2[11] = 0.0F;
               var2[2] = 0.0F;
               var2[14] = 0.0F;
               var2[3] = 0.0F;
               var2[10] = 1.0F;
               var2[6] = 0.0F;
               var2[1] = 0.0F;
               var2[7] = 0.0F;
               var2[4] = 0.0F;
               var2[12] = 0.0F;
               var2[13] = 0.0F;
               var2[5] = 1.0F;
               var2[8] = 0.0F;
               var2[15] = 1.0F;
               var2[9] = 0.0F;
               var2[0] = 1.0F;
            }

            this.method2637((byte)105);
            this.field5017 = true;
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field5131[88] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "c",
      descriptor = "(Z)Lso;"
   )
   public final class495 method2681(boolean arg0) {
      try {
         if (arg0) {
            this.field5059 = 2.0027022F;
         }

         ++field4995;
         return this.field5003;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5131[106] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "pa",
      descriptor = "()V"
   )
   public final void method648() {
      try {
         this.field5029 = false;
         ++field4948;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5131[110] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V"
   )
   public final void method600(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      try {
         ++field4992;
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field5131[49] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field5131[4] : field5131[2]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "w",
      descriptor = "(I)V"
   )
   public abstract void method2682(int arg0);

   @OriginalMember(
      owner = "client!dh",
      name = "T",
      descriptor = "(IIII)V"
   )
   public final void method598(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field4840;
         boolean var5 = false;
         if (arg0 > this.field5038) {
            var5 = true;
            this.field5038 = arg0;
         }

         if (~this.field5013 < ~arg2) {
            var5 = true;
            this.field5013 = arg2;
         }

         if (arg1 > this.field5016) {
            this.field5016 = arg1;
            var5 = true;
         }

         if (~this.field5025 < ~arg3) {
            this.field5025 = arg3;
            var5 = true;
         }

         if (var5) {
            if (!this.field5130) {
               this.field5130 = true;
               this.method2624((byte)-114);
            }

            this.method2585(Integer.MIN_VALUE);
            this.method2657(-19983);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field5131[155] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2683(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2684(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 37;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
