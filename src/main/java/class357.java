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

@OriginalClass("client!cs")
public abstract class class357 extends class65 {
   @OriginalMember(
      owner = "client!cs",
      name = "Oc",
      descriptor = "Liw;"
   )
   private class332 field5188;
   @OriginalMember(
      owner = "client!cs",
      name = "ef",
      descriptor = "Z"
   )
   public boolean field5218;
   @OriginalMember(
      owner = "client!cs",
      name = "Be",
      descriptor = "Lps;"
   )
   public class104 field5215;
   @OriginalMember(
      owner = "client!cs",
      name = "Fc",
      descriptor = "Lps;"
   )
   public class104 field5219;
   @OriginalMember(
      owner = "client!cs",
      name = "C",
      descriptor = "Lps;"
   )
   public class104 field5220;
   @OriginalMember(
      owner = "client!cs",
      name = "B",
      descriptor = "Lps;"
   )
   public class104 field5221;
   @OriginalMember(
      owner = "client!cs",
      name = "ue",
      descriptor = "Lps;"
   )
   private class104 field5222;
   @OriginalMember(
      owner = "client!cs",
      name = "kd",
      descriptor = "Lps;"
   )
   private class104 field5223;
   @OriginalMember(
      owner = "client!cs",
      name = "Td",
      descriptor = "[F"
   )
   public float[] field5225;
   @OriginalMember(
      owner = "client!cs",
      name = "Pd",
      descriptor = "[Lue;"
   )
   private class242[] field5228;
   @OriginalMember(
      owner = "client!cs",
      name = "Ac",
      descriptor = "I"
   )
   public int field5229;
   @OriginalMember(
      owner = "client!cs",
      name = "Ob",
      descriptor = "I"
   )
   private int field5247;
   @OriginalMember(
      owner = "client!cs",
      name = "K",
      descriptor = "Z"
   )
   public boolean field5264;
   @OriginalMember(
      owner = "client!cs",
      name = "gc",
      descriptor = "I"
   )
   public int field5224;
   @OriginalMember(
      owner = "client!cs",
      name = "fe",
      descriptor = "I"
   )
   public int field5273;
   @OriginalMember(
      owner = "client!cs",
      name = "Hb",
      descriptor = "F"
   )
   private float field5237;
   @OriginalMember(
      owner = "client!cs",
      name = "lg",
      descriptor = "F"
   )
   public float field5274;
   @OriginalMember(
      owner = "client!cs",
      name = "bd",
      descriptor = "Z"
   )
   private boolean field5241;
   @OriginalMember(
      owner = "client!cs",
      name = "mc",
      descriptor = "I"
   )
   private int field5246;
   @OriginalMember(
      owner = "client!cs",
      name = "cd",
      descriptor = "F"
   )
   public float field5239;
   @OriginalMember(
      owner = "client!cs",
      name = "Fg",
      descriptor = "I"
   )
   public int field5249;
   @OriginalMember(
      owner = "client!cs",
      name = "If",
      descriptor = "F"
   )
   public float field5240;
   @OriginalMember(
      owner = "client!cs",
      name = "Jf",
      descriptor = "Z"
   )
   private boolean field5255;
   @OriginalMember(
      owner = "client!cs",
      name = "Lc",
      descriptor = "Z"
   )
   public boolean field5234;
   @OriginalMember(
      owner = "client!cs",
      name = "ye",
      descriptor = "Z"
   )
   private boolean field5276;
   @OriginalMember(
      owner = "client!cs",
      name = "Bf",
      descriptor = "[F"
   )
   private float[] field5245;
   @OriginalMember(
      owner = "client!cs",
      name = "Ne",
      descriptor = "F"
   )
   public float field5235;
   @OriginalMember(
      owner = "client!cs",
      name = "Xd",
      descriptor = "I"
   )
   private int field5272;
   @OriginalMember(
      owner = "client!cs",
      name = "Vf",
      descriptor = "I"
   )
   public int field5265;
   @OriginalMember(
      owner = "client!cs",
      name = "Hf",
      descriptor = "I"
   )
   public int field5280;
   @OriginalMember(
      owner = "client!cs",
      name = "ec",
      descriptor = "[F"
   )
   public float[] field5260;
   @OriginalMember(
      owner = "client!cs",
      name = "W",
      descriptor = "[F"
   )
   private float[] field5258;
   @OriginalMember(
      owner = "client!cs",
      name = "mb",
      descriptor = "I"
   )
   private int field5266;
   @OriginalMember(
      owner = "client!cs",
      name = "Oe",
      descriptor = "I"
   )
   private int field5231;
   @OriginalMember(
      owner = "client!cs",
      name = "nd",
      descriptor = "F"
   )
   public float field5283;
   @OriginalMember(
      owner = "client!cs",
      name = "Cb",
      descriptor = "Lwh;"
   )
   public class157 field5256;
   @OriginalMember(
      owner = "client!cs",
      name = "Rd",
      descriptor = "Z"
   )
   public boolean field5278;
   @OriginalMember(
      owner = "client!cs",
      name = "od",
      descriptor = "Z"
   )
   public boolean field5232;
   @OriginalMember(
      owner = "client!cs",
      name = "Hd",
      descriptor = "I"
   )
   public int field5286;
   @OriginalMember(
      owner = "client!cs",
      name = "Xe",
      descriptor = "I"
   )
   public int field5294;
   @OriginalMember(
      owner = "client!cs",
      name = "Ag",
      descriptor = "[F"
   )
   private float[] field5263;
   @OriginalMember(
      owner = "client!cs",
      name = "cg",
      descriptor = "Z"
   )
   private boolean field5254;
   @OriginalMember(
      owner = "client!cs",
      name = "Ce",
      descriptor = "[F"
   )
   private float[] field5267;
   @OriginalMember(
      owner = "client!cs",
      name = "cf",
      descriptor = "I"
   )
   public int field5291;
   @OriginalMember(
      owner = "client!cs",
      name = "xd",
      descriptor = "I"
   )
   public int field5302;
   @OriginalMember(
      owner = "client!cs",
      name = "M",
      descriptor = "Z"
   )
   public boolean field5253;
   @OriginalMember(
      owner = "client!cs",
      name = "dc",
      descriptor = "Z"
   )
   private boolean field5296;
   @OriginalMember(
      owner = "client!cs",
      name = "qc",
      descriptor = "I"
   )
   private int field5244;
   @OriginalMember(
      owner = "client!cs",
      name = "Ge",
      descriptor = "Z"
   )
   public boolean field5306;
   @OriginalMember(
      owner = "client!cs",
      name = "sb",
      descriptor = "F"
   )
   public float field5270;
   @OriginalMember(
      owner = "client!cs",
      name = "Mf",
      descriptor = "[F"
   )
   private float[] field5300;
   @OriginalMember(
      owner = "client!cs",
      name = "zd",
      descriptor = "I"
   )
   public int field5226;
   @OriginalMember(
      owner = "client!cs",
      name = "zg",
      descriptor = "Z"
   )
   public boolean field5290;
   @OriginalMember(
      owner = "client!cs",
      name = "Nd",
      descriptor = "I"
   )
   private int field5261;
   @OriginalMember(
      owner = "client!cs",
      name = "Sf",
      descriptor = "I"
   )
   private int field5269;
   @OriginalMember(
      owner = "client!cs",
      name = "be",
      descriptor = "I"
   )
   public int field5310;
   @OriginalMember(
      owner = "client!cs",
      name = "Ke",
      descriptor = "F"
   )
   public float field5313;
   @OriginalMember(
      owner = "client!cs",
      name = "vg",
      descriptor = "I"
   )
   public int field5314;
   @OriginalMember(
      owner = "client!cs",
      name = "Bc",
      descriptor = "[F"
   )
   private float[] field5279;
   @OriginalMember(
      owner = "client!cs",
      name = "Gc",
      descriptor = "I"
   )
   public int field5320;
   @OriginalMember(
      owner = "client!cs",
      name = "bg",
      descriptor = "I"
   )
   public int field5307;
   @OriginalMember(
      owner = "client!cs",
      name = "Ff",
      descriptor = "I"
   )
   public int field5288;
   @OriginalMember(
      owner = "client!cs",
      name = "U",
      descriptor = "I"
   )
   public int field5304;
   @OriginalMember(
      owner = "client!cs",
      name = "Pc",
      descriptor = "[F"
   )
   public float[] field5308;
   @OriginalMember(
      owner = "client!cs",
      name = "T",
      descriptor = "I"
   )
   public int field5309;
   @OriginalMember(
      owner = "client!cs",
      name = "wc",
      descriptor = "Z"
   )
   public boolean field5230;
   @OriginalMember(
      owner = "client!cs",
      name = "Wd",
      descriptor = "Z"
   )
   public boolean field5322;
   @OriginalMember(
      owner = "client!cs",
      name = "ie",
      descriptor = "I"
   )
   private int field5321;
   @OriginalMember(
      owner = "client!cs",
      name = "Kc",
      descriptor = "I"
   )
   public int field5319;
   @OriginalMember(
      owner = "client!cs",
      name = "Ad",
      descriptor = "Z"
   )
   private boolean field5323;
   @OriginalMember(
      owner = "client!cs",
      name = "oc",
      descriptor = "F"
   )
   public float field5324;
   @OriginalMember(
      owner = "client!cs",
      name = "vf",
      descriptor = "Lfd;"
   )
   public class551 field5315;
   @OriginalMember(
      owner = "client!cs",
      name = "Re",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field5305;
   @OriginalMember(
      owner = "client!cs",
      name = "N",
      descriptor = "Lps;"
   )
   private class104 field5325;
   @OriginalMember(
      owner = "client!cs",
      name = "wd",
      descriptor = "I"
   )
   public int field5268;
   @OriginalMember(
      owner = "client!cs",
      name = "bb",
      descriptor = "Lhw;"
   )
   public class141 field5205;
   @OriginalMember(
      owner = "client!cs",
      name = "bf",
      descriptor = "Ljava/awt/Canvas;"
   )
   public Canvas field5081;
   @OriginalMember(
      owner = "client!cs",
      name = "kf",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field5140;
   @OriginalMember(
      owner = "client!cs",
      name = "Jb",
      descriptor = "Ljava/lang/Object;"
   )
   public Object field5115;
   @OriginalMember(
      owner = "client!cs",
      name = "fb",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field5047;
   @OriginalMember(
      owner = "client!cs",
      name = "Bd",
      descriptor = "I"
   )
   private int field5051;
   @OriginalMember(
      owner = "client!cs",
      name = "hd",
      descriptor = "I"
   )
   public int field5167;
   @OriginalMember(
      owner = "client!cs",
      name = "uc",
      descriptor = "I"
   )
   public int field5281;
   @OriginalMember(
      owner = "client!cs",
      name = "Yb",
      descriptor = "I"
   )
   private int field5078;
   @OriginalMember(
      owner = "client!cs",
      name = "dg",
      descriptor = "I"
   )
   public int field5076;
   @OriginalMember(
      owner = "client!cs",
      name = "Of",
      descriptor = "Lvn;"
   )
   private class329 field5292;
   @OriginalMember(
      owner = "client!cs",
      name = "mf",
      descriptor = "Ljagex3/graphics2/hw/NativeInterface;"
   )
   public NativeInterface field5116;
   @OriginalMember(
      owner = "client!cs",
      name = "Gg",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5349 = new String[]{method2811(method2810("\u0019z\u00165O")), method2811(method2810("\u0019z\u00161 R")), method2811(method2810("\u0019z\u00160\"R")), method2811(method2810("\u0019z\u0016(%R")), method2811(method2810("\u0001'\u0016K\u001a")), method2811(method2810("\u0019z\u0016+&R")), method2811(method2810("\u0014|T\t")), method2811(method2810("\u0019z\u00162%R")), method2811(method2810("\u0019z\u0016,&R")), method2811(method2810("\u0019z\u00162#R")), method2811(method2810("\u0019z\u0016)O")), method2811(method2810("\u0019z\u0016(!R")), method2811(method2810("\u0019z\u0016/&R")), method2811(method2810("\u0019z\u00167.R")), method2811(method2810("\u0019z\u0016&O")), method2811(method2810("\u0019z\u0016-.R")), method2811(method2810("\u0019z\u00167O")), method2811(method2810("\u0019z\u0016$%R")), method2811(method2810("\u0019z\u00167/R")), method2811(method2810("\u0019z\u0016  R")), method2811(method2810("\u0019z\u00160O")), method2811(method2810("\u0019z\u00161&R")), method2811(method2810("\u0019z\u0016\fO")), method2811(method2810("\u0019z\u0016/#R")), method2811(method2810("\u0019z\u0016'\"R")), method2811(method2810("\u0019z\u0016\" R")), method2811(method2810("\u0019z\u0016 !R")), method2811(method2810("\u0019z\u0016/\"R")), method2811(method2810("\u0019z\u0016)&R")), method2811(method2810("\u0019z\u0016#$R")), method2811(method2810("\u0019z\u0016\"!R")), method2811(method2810("\u0019z\u0016$.R")), method2811(method2810("\u0019z\u0016(.R")), method2811(method2810("\u0019z\u0016\u001f\u0006R")), method2811(method2810("\u0019z\u0016*!R")), method2811(method2810("\u0019z\u0016\"\"R")), method2811(method2810("\u0019z\u0016#/R")), method2811(method2810("\u0019z\u00167!R")), method2811(method2810("\u0019z\u00160%R")), method2811(method2810("\u0019z\u0016!&R")), method2811(method2810("\u0019z\u0016- R")), method2811(method2810("\u0019z\u0016\u0001\u0006R")), method2811(method2810("\u0019z\u0016#%R")), method2811(method2810("\u0019z\u0016.\"R")), method2811(method2810("\u0019z\u0016&%R")), method2811(method2810("\u0019z\u0016\u0017O")), method2811(method2810("\u0019z\u0016<O")), method2811(method2810("\u0019z\u00166/R")), method2811(method2810("\u0019z\u00160!R")), method2811(method2810("\u0019z\u00164&R")), method2811(method2810("\u0019z\u0016\"#R")), method2811(method2810("\u0019z\u0016' R")), method2811(method2810("\u0019z\u00163/R")), method2811(method2810("\u0019z\u0016,/R")), method2811(method2810("\u0019z\u00164/R")), method2811(method2810("\u0019z\u0016\u001d\u0006R")), method2811(method2810("\u0019z\u0016\"O")), method2811(method2810("\u0019z\u0016) R")), method2811(method2810("\u0019z\u0016 #R")), method2811(method2810("\u0019z\u0016\"$R")), method2811(method2810("\u0019z\u0016'.R")), method2811(method2810("\u0019z\u0016*#R")), method2811(method2810("\u0019z\u0016\u0015\u0006R")), method2811(method2810("\u0019z\u00161$R")), method2811(method2810("\u0019z\u00163%R")), method2811(method2810("\u0019z\u0016\u0004\u0006R")), method2811(method2810("\u0019z\u0016, R")), method2811(method2810("\u0019z\u00165$R")), method2811(method2810("\u0019z\u00166!R")), method2811(method2810("\u0019z\u00167 R")), method2811(method2810("\u0019z\u0016!O")), method2811(method2810("\tlL,\u0000\u0014fJ\u00005\u001fyY\f\t\u000e")), method2811(method2810("\u0010hN\u0004I\u001b~LK$\u001bgN\u0004\u0014")), method2811(method2810("\u0019z\u0016/O")), method2811(method2810("\u0019z\u00160$R")), method2811(method2810("\u0019z\u0016,!R")), method2811(method2810("\u0019z\u0016&/R")), method2811(method2810("\u0019z\u00163&R")), method2811(method2810("\u0019z\u0016!!R")), method2811(method2810("\u0019z\u0016($R")), method2811(method2810("\u0019z\u0016).R")), method2811(method2810("\u0019z\u0016+.R")), method2811(method2810("\u0019z\u0016,%R")), method2811(method2810("\u0019z\u0016)/R")), method2811(method2810("\u0019z\u0016 O")), method2811(method2810("\u0019z\u00165!R")), method2811(method2810("\u0019z\u00167&R")), method2811(method2810("\u0019z\u00162 R")), method2811(method2810("\u0019z\u0016+$R")), method2811(method2810("\u0019z\u0016* R")), method2811(method2810("\u0019z\u0016#!R")), method2811(method2810("\u0019z\u0016*$R")), method2811(method2810("\u0019z\u0016,$R")), method2811(method2810("\u0019z\u0016,.R")), method2811(method2810("\u0019z\u00162\"R")), method2811(method2810("\u0019z\u0016#.R")), method2811(method2810("\u0019z\u0016*.R")), method2811(method2810("\u0019z\u0016'#R")), method2811(method2810("\u0019z\u0016#\"R")), method2811(method2810("\u0019z\u0016\"%R")), method2811(method2810("\u0019z\u0016'&R")), method2811(method2810("\u0019z\u0016 &R")), method2811(method2810("\u0019z\u0016,#R")), method2811(method2810("\u0019z\u0016.&R")), method2811(method2810("\u0019z\u0016&\"R")), method2811(method2810("\u0019z\u0016/$R")), method2811(method2810("\u0019z\u0016 $R")), method2811(method2810("\u0019z\u0016##R")), method2811(method2810("\u0019z\u0016$O")), method2811(method2810("\u0019z\u0016\".R")), method2811(method2810("\u0019z\u00167\"R")), method2811(method2810("\u0019z\u00160/R")), method2811(method2810("\u0019z\u0016(\"R")), method2811(method2810("\u0019z\u0016+#R")), method2811(method2810("\u0019z\u0016Y\u000e\u0014`L[O")), method2811(method2810("\u0019z\u00163#R")), method2811(method2810("\u0019z\u00167#R")), method2811(method2810("\u0019z\u0016-O")), method2811(method2810("\u0019z\u0016=&R")), method2811(method2810("\u0019z\u0016(O")), method2811(method2810("\u0019z\u0016+%R")), method2811(method2810("\u0019z\u0016! R")), method2811(method2810("\u0019z\u0016*/R")), method2811(method2810("\u0019z\u00164$R")), method2811(method2810("\u0019z\u00166%R")), method2811(method2810("\u0019z\u0016=O")), method2811(method2810("\u0019z\u00161#R")), method2811(method2810("\u0019z\u00165.R")), method2811(method2810("\u0019z\u00164#R")), method2811(method2810("\u0019z\u0016. R")), method2811(method2810("\u0019z\u0016+ R")), method2811(method2810("\u0019z\u0016.#R")), method2811(method2810("\u0019z\u0016$ R")), method2811(method2810("\u0019z\u00167$R")), method2811(method2810("\u0019z\u00164 R")), method2811(method2810("\u0019z\u0016'O")), method2811(method2810("\u0019z\u0016&&R")), method2811(method2810("\u0019z\u0016-%R")), method2811(method2810("\u0019z\u0016-&R")), method2811(method2810("\u0019z\u0016\t\u0006R")), method2811(method2810("\u0019z\u00164O")), method2811(method2810("\u0019z\u00165&R")), method2811(method2810("\u0019z\u00166&R")), method2811(method2810("\u0019z\u00161O")), method2811(method2810("\u0019z\u0016&!R")), method2811(method2810("\u0019z\u00164\"R")), method2811(method2810("\u0019z\u00162/R")), method2811(method2810("\u0019z\u00163$R")), method2811(method2810("\u0019z\u0016?&R")), method2811(method2810("\u0019z\u0016$&R")), method2811(method2810("\u0019z\u00162!R")), method2811(method2810("\u0019z\u00166$R")), method2811(method2810("\u0019z\u00160 R")), method2811(method2810("\u0019z\u0016.O")), method2811(method2810("\u0019z\u0016\u0003O")), method2811(method2810("\u0019z\u0016,\"R")), method2811(method2810("\u0019z\u00161\"R")), method2811(method2810("\u0019z\u00163\"R")), method2811(method2810("\u0019z\u0016/!R")), method2811(method2810("\u0019z\u0016 \"R")), method2811(method2810("\u0019z\u0016!#R")), method2811(method2810("\u0019z\u0016$#R")), method2811(method2810("\u0019z\u00162$R")), method2811(method2810("\u0019z\u0016!.R")), method2811(method2810("\u0019z\u00161%R")), method2811(method2810("\u0019z\u0016\u0017\u0006R")), method2811(method2810("\u0019z\u0016.$R")), method2811(method2810("\u0019z\u0016!/R")), method2811(method2810("\u0019z\u00160&R")), method2811(method2810("\u0019z\u0016-/R")), method2811(method2810("\u0019z\u00165/R")), method2811(method2810("\u0019z\u0016'%R")), method2811(method2810("\u0019z\u0016$$R")), method2811(method2810("\u0019z\u00167%R"))};
   @OriginalMember(
      owner = "client!cs",
      name = "hg",
      descriptor = "I"
   )
   public static int field5072 = 1338;
   @OriginalMember(
      owner = "client!cs",
      name = "rb",
      descriptor = "Z"
   )
   public static boolean field5057 = false;
   @OriginalMember(
      owner = "client!cs",
      name = "ib",
      descriptor = "Lgh;"
   )
   public static class572 field5026 = new class572(58, 6);
   @OriginalMember(
      owner = "client!cs",
      name = "Yf",
      descriptor = "F"
   )
   public float field5238;
   @OriginalMember(
      owner = "client!cs",
      name = "Me",
      descriptor = "F"
   )
   public float field5243;
   @OriginalMember(
      owner = "client!cs",
      name = "cc",
      descriptor = "F"
   )
   public float field5277;
   @OriginalMember(
      owner = "client!cs",
      name = "Qf",
      descriptor = "F"
   )
   private float field5287;
   @OriginalMember(
      owner = "client!cs",
      name = "xb",
      descriptor = "F"
   )
   public float field5289;
   @OriginalMember(
      owner = "client!cs",
      name = "Mb",
      descriptor = "F"
   )
   public float field5301;
   @OriginalMember(
      owner = "client!cs",
      name = "Zb",
      descriptor = "F"
   )
   public float field5311;
   @OriginalMember(
      owner = "client!cs",
      name = "Ye",
      descriptor = "F"
   )
   private float field5317;
   @OriginalMember(
      owner = "client!cs",
      name = "O",
      descriptor = "I"
   )
   public static int field5027;
   @OriginalMember(
      owner = "client!cs",
      name = "J",
      descriptor = "I"
   )
   public static int field5028;
   @OriginalMember(
      owner = "client!cs",
      name = "Db",
      descriptor = "I"
   )
   public static int field5029;
   @OriginalMember(
      owner = "client!cs",
      name = "re",
      descriptor = "I"
   )
   public static int field5030;
   @OriginalMember(
      owner = "client!cs",
      name = "zf",
      descriptor = "I"
   )
   public static int field5031;
   @OriginalMember(
      owner = "client!cs",
      name = "Q",
      descriptor = "I"
   )
   public static int field5032;
   @OriginalMember(
      owner = "client!cs",
      name = "E",
      descriptor = "I"
   )
   public static int field5033;
   @OriginalMember(
      owner = "client!cs",
      name = "mg",
      descriptor = "I"
   )
   public static int field5034;
   @OriginalMember(
      owner = "client!cs",
      name = "hc",
      descriptor = "I"
   )
   public static int field5035;
   @OriginalMember(
      owner = "client!cs",
      name = "Ed",
      descriptor = "I"
   )
   public static int field5037;
   @OriginalMember(
      owner = "client!cs",
      name = "ab",
      descriptor = "I"
   )
   public static int field5038;
   @OriginalMember(
      owner = "client!cs",
      name = "A",
      descriptor = "I"
   )
   public static int field5039;
   @OriginalMember(
      owner = "client!cs",
      name = "Je",
      descriptor = "I"
   )
   public static int field5040;
   @OriginalMember(
      owner = "client!cs",
      name = "ng",
      descriptor = "I"
   )
   public static int field5041;
   @OriginalMember(
      owner = "client!cs",
      name = "Yc",
      descriptor = "I"
   )
   public static int field5042;
   @OriginalMember(
      owner = "client!cs",
      name = "td",
      descriptor = "I"
   )
   public static int field5044;
   @OriginalMember(
      owner = "client!cs",
      name = "ud",
      descriptor = "I"
   )
   public static int field5045;
   @OriginalMember(
      owner = "client!cs",
      name = "pg",
      descriptor = "I"
   )
   public static int field5046;
   @OriginalMember(
      owner = "client!cs",
      name = "ug",
      descriptor = "I"
   )
   public static int field5048;
   @OriginalMember(
      owner = "client!cs",
      name = "Yd",
      descriptor = "I"
   )
   public static int field5049;
   @OriginalMember(
      owner = "client!cs",
      name = "rf",
      descriptor = "I"
   )
   public static int field5050;
   @OriginalMember(
      owner = "client!cs",
      name = "ff",
      descriptor = "I"
   )
   public static int field5052;
   @OriginalMember(
      owner = "client!cs",
      name = "Cf",
      descriptor = "I"
   )
   public static int field5053;
   @OriginalMember(
      owner = "client!cs",
      name = "P",
      descriptor = "I"
   )
   public static int field5054;
   @OriginalMember(
      owner = "client!cs",
      name = "ve",
      descriptor = "I"
   )
   public static int field5056;
   @OriginalMember(
      owner = "client!cs",
      name = "xe",
      descriptor = "I"
   )
   public static int field5058;
   @OriginalMember(
      owner = "client!cs",
      name = "Pf",
      descriptor = "I"
   )
   public static int field5059;
   @OriginalMember(
      owner = "client!cs",
      name = "ne",
      descriptor = "I"
   )
   public static int field5060;
   @OriginalMember(
      owner = "client!cs",
      name = "ke",
      descriptor = "I"
   )
   public static int field5061;
   @OriginalMember(
      owner = "client!cs",
      name = "Mc",
      descriptor = "I"
   )
   public static int field5062;
   @OriginalMember(
      owner = "client!cs",
      name = "ag",
      descriptor = "I"
   )
   public static int field5063;
   @OriginalMember(
      owner = "client!cs",
      name = "md",
      descriptor = "I"
   )
   public static int field5064;
   @OriginalMember(
      owner = "client!cs",
      name = "Uc",
      descriptor = "I"
   )
   public static int field5065;
   @OriginalMember(
      owner = "client!cs",
      name = "Wc",
      descriptor = "I"
   )
   public static int field5066;
   @OriginalMember(
      owner = "client!cs",
      name = "Rb",
      descriptor = "I"
   )
   public static int field5067;
   @OriginalMember(
      owner = "client!cs",
      name = "ce",
      descriptor = "I"
   )
   public static int field5068;
   @OriginalMember(
      owner = "client!cs",
      name = "lb",
      descriptor = "I"
   )
   public static int field5069;
   @OriginalMember(
      owner = "client!cs",
      name = "Rf",
      descriptor = "I"
   )
   public static int field5070;
   @OriginalMember(
      owner = "client!cs",
      name = "Nc",
      descriptor = "I"
   )
   public static int field5071;
   @OriginalMember(
      owner = "client!cs",
      name = "w",
      descriptor = "I"
   )
   public static int field5073;
   @OriginalMember(
      owner = "client!cs",
      name = "X",
      descriptor = "I"
   )
   public static int field5074;
   @OriginalMember(
      owner = "client!cs",
      name = "ge",
      descriptor = "I"
   )
   public static int field5075;
   @OriginalMember(
      owner = "client!cs",
      name = "jd",
      descriptor = "I"
   )
   public static int field5077;
   @OriginalMember(
      owner = "client!cs",
      name = "x",
      descriptor = "I"
   )
   public static int field5079;
   @OriginalMember(
      owner = "client!cs",
      name = "lc",
      descriptor = "I"
   )
   public static int field5080;
   @OriginalMember(
      owner = "client!cs",
      name = "Qe",
      descriptor = "I"
   )
   public static int field5082;
   @OriginalMember(
      owner = "client!cs",
      name = "y",
      descriptor = "I"
   )
   public static int field5083;
   @OriginalMember(
      owner = "client!cs",
      name = "Xf",
      descriptor = "I"
   )
   public static int field5084;
   @OriginalMember(
      owner = "client!cs",
      name = "I",
      descriptor = "I"
   )
   public static int field5085;
   @OriginalMember(
      owner = "client!cs",
      name = "Pe",
      descriptor = "I"
   )
   public static int field5086;
   @OriginalMember(
      owner = "client!cs",
      name = "we",
      descriptor = "I"
   )
   public static int field5087;
   @OriginalMember(
      owner = "client!cs",
      name = "Gf",
      descriptor = "I"
   )
   public static int field5088;
   @OriginalMember(
      owner = "client!cs",
      name = "Ud",
      descriptor = "I"
   )
   public static int field5089;
   @OriginalMember(
      owner = "client!cs",
      name = "Tf",
      descriptor = "I"
   )
   public static int field5090;
   @OriginalMember(
      owner = "client!cs",
      name = "pe",
      descriptor = "I"
   )
   public static int field5091;
   @OriginalMember(
      owner = "client!cs",
      name = "F",
      descriptor = "I"
   )
   public static int field5093;
   @OriginalMember(
      owner = "client!cs",
      name = "Qd",
      descriptor = "I"
   )
   public static int field5094;
   @OriginalMember(
      owner = "client!cs",
      name = "Nb",
      descriptor = "I"
   )
   public static int field5095;
   @OriginalMember(
      owner = "client!cs",
      name = "Kf",
      descriptor = "I"
   )
   public static int field5096;
   @OriginalMember(
      owner = "client!cs",
      name = "cb",
      descriptor = "I"
   )
   public static int field5097;
   @OriginalMember(
      owner = "client!cs",
      name = "Le",
      descriptor = "I"
   )
   public static int field5099;
   @OriginalMember(
      owner = "client!cs",
      name = "he",
      descriptor = "I"
   )
   public static int field5100;
   @OriginalMember(
      owner = "client!cs",
      name = "tb",
      descriptor = "I"
   )
   public static int field5101;
   @OriginalMember(
      owner = "client!cs",
      name = "gb",
      descriptor = "I"
   )
   public static int field5102;
   @OriginalMember(
      owner = "client!cs",
      name = "Jd",
      descriptor = "I"
   )
   public static int field5103;
   @OriginalMember(
      owner = "client!cs",
      name = "uf",
      descriptor = "I"
   )
   public static int field5104;
   @OriginalMember(
      owner = "client!cs",
      name = "gf",
      descriptor = "I"
   )
   public static int field5105;
   @OriginalMember(
      owner = "client!cs",
      name = "vc",
      descriptor = "I"
   )
   public static int field5106;
   @OriginalMember(
      owner = "client!cs",
      name = "yd",
      descriptor = "I"
   )
   public static int field5107;
   @OriginalMember(
      owner = "client!cs",
      name = "Tc",
      descriptor = "I"
   )
   public static int field5108;
   @OriginalMember(
      owner = "client!cs",
      name = "Ic",
      descriptor = "I"
   )
   public static int field5109;
   @OriginalMember(
      owner = "client!cs",
      name = "Lf",
      descriptor = "I"
   )
   public static int field5110;
   @OriginalMember(
      owner = "client!cs",
      name = "Cc",
      descriptor = "I"
   )
   public static int field5111;
   @OriginalMember(
      owner = "client!cs",
      name = "eb",
      descriptor = "I"
   )
   public static int field5112;
   @OriginalMember(
      owner = "client!cs",
      name = "L",
      descriptor = "I"
   )
   public static int field5113;
   @OriginalMember(
      owner = "client!cs",
      name = "v",
      descriptor = "I"
   )
   public static int field5114;
   @OriginalMember(
      owner = "client!cs",
      name = "Kb",
      descriptor = "I"
   )
   public static int field5117;
   @OriginalMember(
      owner = "client!cs",
      name = "Vc",
      descriptor = "I"
   )
   public static int field5118;
   @OriginalMember(
      owner = "client!cs",
      name = "db",
      descriptor = "I"
   )
   public static int field5119;
   @OriginalMember(
      owner = "client!cs",
      name = "xg",
      descriptor = "I"
   )
   public static int field5120;
   @OriginalMember(
      owner = "client!cs",
      name = "Df",
      descriptor = "I"
   )
   public static int field5121;
   @OriginalMember(
      owner = "client!cs",
      name = "Id",
      descriptor = "I"
   )
   public static int field5122;
   @OriginalMember(
      owner = "client!cs",
      name = "eg",
      descriptor = "I"
   )
   public static int field5123;
   @OriginalMember(
      owner = "client!cs",
      name = "ad",
      descriptor = "I"
   )
   public static int field5124;
   @OriginalMember(
      owner = "client!cs",
      name = "He",
      descriptor = "I"
   )
   public static int field5125;
   @OriginalMember(
      owner = "client!cs",
      name = "pd",
      descriptor = "I"
   )
   public static int field5126;
   @OriginalMember(
      owner = "client!cs",
      name = "Sd",
      descriptor = "I"
   )
   public static int field5127;
   @OriginalMember(
      owner = "client!cs",
      name = "Dd",
      descriptor = "I"
   )
   public static int field5128;
   @OriginalMember(
      owner = "client!cs",
      name = "Hc",
      descriptor = "I"
   )
   public static int field5129;
   @OriginalMember(
      owner = "client!cs",
      name = "vd",
      descriptor = "I"
   )
   public static int field5130;
   @OriginalMember(
      owner = "client!cs",
      name = "qg",
      descriptor = "I"
   )
   public static int field5131;
   @OriginalMember(
      owner = "client!cs",
      name = "ic",
      descriptor = "I"
   )
   public static int field5132;
   @OriginalMember(
      owner = "client!cs",
      name = "ld",
      descriptor = "I"
   )
   public static int field5133;
   @OriginalMember(
      owner = "client!cs",
      name = "Bg",
      descriptor = "I"
   )
   public static int field5134;
   @OriginalMember(
      owner = "client!cs",
      name = "le",
      descriptor = "I"
   )
   public static int field5135;
   @OriginalMember(
      owner = "client!cs",
      name = "bc",
      descriptor = "I"
   )
   public static int field5136;
   @OriginalMember(
      owner = "client!cs",
      name = "Eg",
      descriptor = "I"
   )
   public static int field5137;
   @OriginalMember(
      owner = "client!cs",
      name = "dd",
      descriptor = "I"
   )
   public static int field5138;
   @OriginalMember(
      owner = "client!cs",
      name = "ed",
      descriptor = "I"
   )
   public static int field5139;
   @OriginalMember(
      owner = "client!cs",
      name = "Zd",
      descriptor = "I"
   )
   public static int field5141;
   @OriginalMember(
      owner = "client!cs",
      name = "Bb",
      descriptor = "I"
   )
   public static int field5142;
   @OriginalMember(
      owner = "client!cs",
      name = "Sb",
      descriptor = "I"
   )
   public static int field5143;
   @OriginalMember(
      owner = "client!cs",
      name = "fg",
      descriptor = "I"
   )
   public static int field5144;
   @OriginalMember(
      owner = "client!cs",
      name = "H",
      descriptor = "I"
   )
   public static int field5145;
   @OriginalMember(
      owner = "client!cs",
      name = "Md",
      descriptor = "I"
   )
   public static int field5146;
   @OriginalMember(
      owner = "client!cs",
      name = "je",
      descriptor = "I"
   )
   public static int field5147;
   @OriginalMember(
      owner = "client!cs",
      name = "gg",
      descriptor = "I"
   )
   public static int field5148;
   @OriginalMember(
      owner = "client!cs",
      name = "D",
      descriptor = "I"
   )
   public static int field5149;
   @OriginalMember(
      owner = "client!cs",
      name = "af",
      descriptor = "I"
   )
   public static int field5150;
   @OriginalMember(
      owner = "client!cs",
      name = "Tb",
      descriptor = "I"
   )
   public static int field5151;
   @OriginalMember(
      owner = "client!cs",
      name = "og",
      descriptor = "I"
   )
   public static int field5152;
   @OriginalMember(
      owner = "client!cs",
      name = "Dc",
      descriptor = "I"
   )
   public static int field5153;
   @OriginalMember(
      owner = "client!cs",
      name = "kg",
      descriptor = "I"
   )
   public static int field5154;
   @OriginalMember(
      owner = "client!cs",
      name = "pf",
      descriptor = "I"
   )
   public static int field5155;
   @OriginalMember(
      owner = "client!cs",
      name = "fc",
      descriptor = "I"
   )
   public static int field5156;
   @OriginalMember(
      owner = "client!cs",
      name = "Ib",
      descriptor = "I"
   )
   public static int field5157;
   @OriginalMember(
      owner = "client!cs",
      name = "Sc",
      descriptor = "I"
   )
   public static int field5158;
   @OriginalMember(
      owner = "client!cs",
      name = "Xc",
      descriptor = "I"
   )
   public static int field5159;
   @OriginalMember(
      owner = "client!cs",
      name = "wb",
      descriptor = "I"
   )
   public static int field5160;
   @OriginalMember(
      owner = "client!cs",
      name = "Ve",
      descriptor = "I"
   )
   public static int field5161;
   @OriginalMember(
      owner = "client!cs",
      name = "Ae",
      descriptor = "I"
   )
   public static int field5162;
   @OriginalMember(
      owner = "client!cs",
      name = "Te",
      descriptor = "I"
   )
   public static int field5163;
   @OriginalMember(
      owner = "client!cs",
      name = "yg",
      descriptor = "I"
   )
   public static int field5164;
   @OriginalMember(
      owner = "client!cs",
      name = "nc",
      descriptor = "I"
   )
   public static int field5165;
   @OriginalMember(
      owner = "client!cs",
      name = "qb",
      descriptor = "I"
   )
   public static int field5166;
   @OriginalMember(
      owner = "client!cs",
      name = "Fd",
      descriptor = "I"
   )
   public static int field5168;
   @OriginalMember(
      owner = "client!cs",
      name = "Z",
      descriptor = "I"
   )
   public static int field5169;
   @OriginalMember(
      owner = "client!cs",
      name = "id",
      descriptor = "I"
   )
   public static int field5170;
   @OriginalMember(
      owner = "client!cs",
      name = "Vb",
      descriptor = "I"
   )
   public static int field5171;
   @OriginalMember(
      owner = "client!cs",
      name = "me",
      descriptor = "I"
   )
   public static int field5172;
   @OriginalMember(
      owner = "client!cs",
      name = "rc",
      descriptor = "I"
   )
   public static int field5173;
   @OriginalMember(
      owner = "client!cs",
      name = "Cg",
      descriptor = "I"
   )
   public static int field5174;
   @OriginalMember(
      owner = "client!cs",
      name = "de",
      descriptor = "I"
   )
   public static int field5175;
   @OriginalMember(
      owner = "client!cs",
      name = "Qc",
      descriptor = "I"
   )
   public static int field5176;
   @OriginalMember(
      owner = "client!cs",
      name = "jb",
      descriptor = "I"
   )
   public static int field5177;
   @OriginalMember(
      owner = "client!cs",
      name = "Ue",
      descriptor = "I"
   )
   public static int field5178;
   @OriginalMember(
      owner = "client!cs",
      name = "hb",
      descriptor = "I"
   )
   public static int field5179;
   @OriginalMember(
      owner = "client!cs",
      name = "gd",
      descriptor = "I"
   )
   public static int field5180;
   @OriginalMember(
      owner = "client!cs",
      name = "lf",
      descriptor = "I"
   )
   public static int field5181;
   @OriginalMember(
      owner = "client!cs",
      name = "De",
      descriptor = "I"
   )
   public static int field5182;
   @OriginalMember(
      owner = "client!cs",
      name = "hf",
      descriptor = "I"
   )
   public static int field5183;
   @OriginalMember(
      owner = "client!cs",
      name = "Rc",
      descriptor = "I"
   )
   public static int field5184;
   @OriginalMember(
      owner = "client!cs",
      name = "Kd",
      descriptor = "I"
   )
   public static int field5185;
   @OriginalMember(
      owner = "client!cs",
      name = "Xb",
      descriptor = "I"
   )
   public static int field5186;
   @OriginalMember(
      owner = "client!cs",
      name = "Ub",
      descriptor = "I"
   )
   public static int field5187;
   @OriginalMember(
      owner = "client!cs",
      name = "rd",
      descriptor = "I"
   )
   public static int field5189;
   @OriginalMember(
      owner = "client!cs",
      name = "u",
      descriptor = "I"
   )
   public static int field5190;
   @OriginalMember(
      owner = "client!cs",
      name = "kc",
      descriptor = "I"
   )
   public static int field5191;
   @OriginalMember(
      owner = "client!cs",
      name = "of",
      descriptor = "I"
   )
   public static int field5192;
   @OriginalMember(
      owner = "client!cs",
      name = "S",
      descriptor = "I"
   )
   public static int field5193;
   @OriginalMember(
      owner = "client!cs",
      name = "Jc",
      descriptor = "I"
   )
   public static int field5194;
   @OriginalMember(
      owner = "client!cs",
      name = "fd",
      descriptor = "I"
   )
   public static int field5195;
   @OriginalMember(
      owner = "client!cs",
      name = "tf",
      descriptor = "I"
   )
   public static int field5196;
   @OriginalMember(
      owner = "client!cs",
      name = "yb",
      descriptor = "I"
   )
   public static int field5197;
   @OriginalMember(
      owner = "client!cs",
      name = "wf",
      descriptor = "I"
   )
   public static int field5198;
   @OriginalMember(
      owner = "client!cs",
      name = "Wf",
      descriptor = "I"
   )
   public static int field5199;
   @OriginalMember(
      owner = "client!cs",
      name = "ee",
      descriptor = "I"
   )
   public static int field5200;
   @OriginalMember(
      owner = "client!cs",
      name = "Gb",
      descriptor = "I"
   )
   public static int field5201;
   @OriginalMember(
      owner = "client!cs",
      name = "Eb",
      descriptor = "I"
   )
   public static int field5202;
   @OriginalMember(
      owner = "client!cs",
      name = "Cd",
      descriptor = "I"
   )
   public static int field5203;
   @OriginalMember(
      owner = "client!cs",
      name = "Ie",
      descriptor = "I"
   )
   public static int field5204;
   @OriginalMember(
      owner = "client!cs",
      name = "z",
      descriptor = "I"
   )
   public static int field5206;
   @OriginalMember(
      owner = "client!cs",
      name = "Zc",
      descriptor = "I"
   )
   public static int field5207;
   @OriginalMember(
      owner = "client!cs",
      name = "G",
      descriptor = "I"
   )
   public static int field5208;
   @OriginalMember(
      owner = "client!cs",
      name = "pb",
      descriptor = "I"
   )
   public static int field5209;
   @OriginalMember(
      owner = "client!cs",
      name = "Y",
      descriptor = "I"
   )
   public static int field5210;
   @OriginalMember(
      owner = "client!cs",
      name = "Se",
      descriptor = "I"
   )
   public static int field5211;
   @OriginalMember(
      owner = "client!cs",
      name = "se",
      descriptor = "I"
   )
   public static int field5212;
   @OriginalMember(
      owner = "client!cs",
      name = "tg",
      descriptor = "I"
   )
   public int field5213;
   @OriginalMember(
      owner = "client!cs",
      name = "Fb",
      descriptor = "I"
   )
   public int field5214;
   @OriginalMember(
      owner = "client!cs",
      name = "Nf",
      descriptor = "I"
   )
   public static int field5216;
   @OriginalMember(
      owner = "client!cs",
      name = "yc",
      descriptor = "I"
   )
   public int field5217;
   @OriginalMember(
      owner = "client!cs",
      name = "Ef",
      descriptor = "I"
   )
   public int field5227;
   @OriginalMember(
      owner = "client!cs",
      name = "sf",
      descriptor = "I"
   )
   private int field5233;
   @OriginalMember(
      owner = "client!cs",
      name = "Gd",
      descriptor = "I"
   )
   public int field5251;
   @OriginalMember(
      owner = "client!cs",
      name = "Ec",
      descriptor = "I"
   )
   private int field5257;
   @OriginalMember(
      owner = "client!cs",
      name = "V",
      descriptor = "I"
   )
   public int field5275;
   @OriginalMember(
      owner = "client!cs",
      name = "zc",
      descriptor = "I"
   )
   public int field5282;
   @OriginalMember(
      owner = "client!cs",
      name = "jg",
      descriptor = "I"
   )
   public int field5298;
   @OriginalMember(
      owner = "client!cs",
      name = "nf",
      descriptor = "I"
   )
   public int field5303;
   @OriginalMember(
      owner = "client!cs",
      name = "Zf",
      descriptor = "I"
   )
   public int field5312;
   @OriginalMember(
      owner = "client!cs",
      name = "R",
      descriptor = "I"
   )
   public int field5318;
   @OriginalMember(
      owner = "client!cs",
      name = "Ld",
      descriptor = "I"
   )
   private int field5348;
   @OriginalMember(
      owner = "client!cs",
      name = "peer",
      descriptor = "J"
   )
   public long peer;
   @OriginalMember(
      owner = "client!cs",
      name = "jf",
      descriptor = "Lsd;"
   )
   private class102 field5330;
   @OriginalMember(
      owner = "client!cs",
      name = "qe",
      descriptor = "Lsd;"
   )
   private class102 field5341;
   @OriginalMember(
      owner = "client!cs",
      name = "Ee",
      descriptor = "Lsd;"
   )
   private class102 field5342;
   @OriginalMember(
      owner = "client!cs",
      name = "nb",
      descriptor = "Lqu;"
   )
   public class105 field5055;
   @OriginalMember(
      owner = "client!cs",
      name = "Fe",
      descriptor = "Lcea;"
   )
   private class223 field5299;
   @OriginalMember(
      owner = "client!cs",
      name = "xf",
      descriptor = "Lue;"
   )
   private class242 field5284;
   @OriginalMember(
      owner = "client!cs",
      name = "tc",
      descriptor = "Lrn;"
   )
   private class280 field5345;
   @OriginalMember(
      owner = "client!cs",
      name = "qd",
      descriptor = "Luj;"
   )
   private class401 field5326;
   @OriginalMember(
      owner = "client!cs",
      name = "Ab",
      descriptor = "Luj;"
   )
   public class401 field5331;
   @OriginalMember(
      owner = "client!cs",
      name = "vb",
      descriptor = "Luj;"
   )
   private class401 field5332;
   @OriginalMember(
      owner = "client!cs",
      name = "Od",
      descriptor = "Luj;"
   )
   public class401 field5334;
   @OriginalMember(
      owner = "client!cs",
      name = "oe",
      descriptor = "Luj;"
   )
   public class401 field5335;
   @OriginalMember(
      owner = "client!cs",
      name = "te",
      descriptor = "Luj;"
   )
   public class401 field5337;
   @OriginalMember(
      owner = "client!cs",
      name = "Ze",
      descriptor = "Luj;"
   )
   private class401 field5344;
   @OriginalMember(
      owner = "client!cs",
      name = "Wb",
      descriptor = "Lbt;"
   )
   public class47 field5295;
   @OriginalMember(
      owner = "client!cs",
      name = "ze",
      descriptor = "Lnw;"
   )
   public class610 field5327;
   @OriginalMember(
      owner = "client!cs",
      name = "Uf",
      descriptor = "Lnw;"
   )
   public class610 field5328;
   @OriginalMember(
      owner = "client!cs",
      name = "Af",
      descriptor = "Lnw;"
   )
   public class610 field5329;
   @OriginalMember(
      owner = "client!cs",
      name = "Qb",
      descriptor = "Lnw;"
   )
   public class610 field5333;
   @OriginalMember(
      owner = "client!cs",
      name = "Lb",
      descriptor = "Lnw;"
   )
   public class610 field5336;
   @OriginalMember(
      owner = "client!cs",
      name = "jc",
      descriptor = "Lnw;"
   )
   public class610 field5338;
   @OriginalMember(
      owner = "client!cs",
      name = "ob",
      descriptor = "Lnw;"
   )
   public class610 field5339;
   @OriginalMember(
      owner = "client!cs",
      name = "Dg",
      descriptor = "Lnw;"
   )
   public class610 field5340;
   @OriginalMember(
      owner = "client!cs",
      name = "ae",
      descriptor = "Lnw;"
   )
   public class610 field5343;
   @OriginalMember(
      owner = "client!cs",
      name = "ig",
      descriptor = "Lnw;"
   )
   public class610 field5346;
   @OriginalMember(
      owner = "client!cs",
      name = "ub",
      descriptor = "Leja;"
   )
   private class763 field5236;
   @OriginalMember(
      owner = "client!cs",
      name = "pc",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   public NativeHeap field5092;
   @OriginalMember(
      owner = "client!cs",
      name = "wg",
      descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   public NativeHeapBuffer field5098;
   @OriginalMember(
      owner = "client!cs",
      name = "Vd",
      descriptor = "Ljava/util/Hashtable;"
   )
   private Hashtable field5043;
   @OriginalMember(
      owner = "client!cs",
      name = "Pb",
      descriptor = "Z"
   )
   public boolean field5242;
   @OriginalMember(
      owner = "client!cs",
      name = "zb",
      descriptor = "Z"
   )
   public boolean field5248;
   @OriginalMember(
      owner = "client!cs",
      name = "df",
      descriptor = "Z"
   )
   public boolean field5271;
   @OriginalMember(
      owner = "client!cs",
      name = "qf",
      descriptor = "Z"
   )
   public boolean field5285;
   @OriginalMember(
      owner = "client!cs",
      name = "yf",
      descriptor = "Z"
   )
   public boolean field5293;
   @OriginalMember(
      owner = "client!cs",
      name = "We",
      descriptor = "Z"
   )
   public boolean field5347;
   @OriginalMember(
      owner = "client!cs",
      name = "ac",
      descriptor = "[I"
   )
   public static int[] field5036;
   @OriginalMember(
      owner = "client!cs",
      name = "kb",
      descriptor = "[Lps;"
   )
   public class104[] field5297;
   @OriginalMember(
      owner = "client!cs",
      name = "xc",
      descriptor = "[Lhea;"
   )
   public class443[] field5250;
   @OriginalMember(
      owner = "client!cs",
      name = "sg",
      descriptor = "[Lhea;"
   )
   public class443[] field5252;
   @OriginalMember(
      owner = "client!cs",
      name = "rg",
      descriptor = "[Lbt;"
   )
   private class47[] field5262;
   @OriginalMember(
      owner = "client!cs",
      name = "sc",
      descriptor = "[Lke;"
   )
   public class622[] field5259;
   @OriginalMember(
      owner = "client!cs",
      name = "sd",
      descriptor = "[Lqh;"
   )
   public class74[] field5316;

   @OriginalMember(
      owner = "client!cs",
      name = "v",
      descriptor = "(I)V"
   )
   public abstract void method1208(int arg0);

   @OriginalMember(
      owner = "client!cs",
      name = "M",
      descriptor = "()I"
   )
   public final int method318() {
      try {
         ++field5182;
         return this.field5348;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5349[119] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "n",
      descriptor = "(I)V"
   )
   public void method1153(int arg0) {
      try {
         ++field5060;
         this.field5298 = this.field5251;
         this.field5251 = 0;
         if (arg0 != 1) {
            this.field5255 = true;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method391(int arg0) {
      try {
         ++field5172;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[70] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "i",
      descriptor = "()I"
   )
   public final int method291() {
      try {
         ++field5109;
         return this.field5288;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5349[22] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "ab",
      descriptor = "(I)I"
   )
   public final int method2729(int arg0) {
      try {
         if (arg0 > -54) {
            this.method312(105);
         }

         ++field5097;
         return this.field5286;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[83] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "H",
      descriptor = "(III[I)V"
   )
   public final void method367(int arg0, int arg1, int arg2, int[] arg3) {
      try {
         float var5;
         int var6;
         int var7;
         label33: {
            ++field5157;
            var5 = this.field5219.method977((byte)-83, (float)arg1, (float)arg0, (float)arg2);
            if (var5 < -0.0078125F || var5 > 0.0078125F) {
               var6 = (int)((float)this.field5302 * this.field5219.method989(false, (float)arg1, (float)arg0, (float)arg2) / var5);
               var7 = (int)((float)this.field5307 * this.field5219.method996((float)arg2, (float)arg0, 0, (float)arg1) / var5);
               if (!client.field4564) {
                  break label33;
               }
            }

            var7 = this.field5304;
            var6 = this.field5291;
         }

         arg3[2] = (int)var5;
         arg3[0] = (int)((float)var6 - this.field5289);
         arg3[1] = (int)((float)var7 - this.field5277);
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field5349[117] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5349[4] : field5349[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "p",
      descriptor = "(I)V"
   )
   private final void method2730(int arg0) {
      try {
         if (!this.field5296) {
            label33: {
               float[] var2 = this.field5300;
               float var3 = (float)(-this.field5291 * this.field5288) / (float)this.field5302;
               float var4 = (float)((-this.field5291 + this.field5076) * this.field5288) / (float)this.field5302;
               float var5 = (float)(this.field5304 * this.field5288) / (float)this.field5307;
               float var6 = (float)((-this.field5167 + this.field5304) * this.field5288) / (float)this.field5307;
               if (var3 == var4 || var5 == var6) {
                  var2[9] = 0.0F;
                  var2[7] = 0.0F;
                  var2[11] = 0.0F;
                  var2[14] = 0.0F;
                  var2[6] = 0.0F;
                  var2[5] = 1.0F;
                  var2[8] = 0.0F;
                  var2[3] = 0.0F;
                  var2[2] = 0.0F;
                  var2[13] = 0.0F;
                  var2[15] = 1.0F;
                  var2[0] = 1.0F;
                  var2[10] = 1.0F;
                  var2[12] = 0.0F;
                  var2[4] = 0.0F;
                  var2[1] = 0.0F;
                  if (!client.field4564) {
                     break label33;
                  }
               }

               float var7 = (float)this.field5288 * 2.0F;
               var2[10] = this.field5287 = (float)this.field5320 / (float)(-this.field5320 + this.field5288);
               var2[3] = 0.0F;
               var2[8] = (var3 + var4) / (-var3 + var4);
               var2[11] = -1.0F;
               var2[0] = var7 / (-var3 + var4);
               var2[12] = 0.0F;
               var2[9] = (var5 + var6) / (-var6 + var5);
               var2[1] = 0.0F;
               var2[13] = 0.0F;
               var2[5] = var7 / (-var6 + var5);
               var2[14] = this.field5317 = (float)(this.field5320 * this.field5288) / (float)(-this.field5320 + this.field5288);
               var2[7] = 0.0F;
               var2[15] = 0.0F;
               var2[6] = 0.0F;
               var2[4] = 0.0F;
               var2[2] = 0.0F;
            }

            this.method2785(true);
            this.field5296 = true;
         }

         if (arg0 < -65) {
            ++field5067;
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field5349[130] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "d",
      descriptor = "(BZ)V"
   )
   public final void method2731(byte arg0, boolean arg1) {
      try {
         ++field5141;
         if (!arg1 != !this.field5232) {
            this.field5232 = arg1;
            this.method1158((byte)-89);
            this.field5257 &= -32;
         }

         if (arg0 <= 59) {
            this.method2737(-115);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "t",
      descriptor = "(I)V"
   )
   private final void method2732(int arg0) {
      try {
         this.field5341 = this.method1194((byte)100, true);
         ++field5103;
         this.field5341.method568(arg0 + 22383, 12, 24);
         this.field5332 = this.method1170(arg0 ^ arg0, new class535[]{new class535(class274.field3883)});
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[96] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "Q",
      descriptor = "(IIIIII[BII)V"
   )
   public final void method425(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
      try {
         ++field5075;
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field5349[140] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field5349[4] : field5349[6]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "d",
      descriptor = "(Z)V"
   )
   public abstract void method1187(boolean arg0);

   @OriginalMember(
      owner = "client!cs",
      name = "J",
      descriptor = "(I)I"
   )
   public final int method2733(int arg0) {
      try {
         ++field5120;
         if (arg0 != 0) {
            this.method265(124, 93, false);
         }

         return this.field5233;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[109] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "h",
      descriptor = "()Ldfa;"
   )
   public final class173 method255() {
      try {
         ++field5212;
         return this.field5325;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5349[172] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "g",
      descriptor = "(I)V"
   )
   public void method444(int arg0) {
      try {
         if (this.field5292 != null) {
            this.field5292.method2544((byte)-85);
         }

         ++field5147;
         this.field5227 = arg0 & Integer.MAX_VALUE;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[107] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "j",
      descriptor = "(B)V"
   )
   public abstract void method1189(byte arg0);

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(Lqe;I)V"
   )
   public abstract void method1173(class491 arg0, int arg1);

   @OriginalMember(
      owner = "client!cs",
      name = "P",
      descriptor = "(IIIII)V"
   )
   public final void method299(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.method340(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
         ++field5169;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field5349[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(BB)V"
   )
   public final void method2734(byte arg0, byte arg1) {
      try {
         ++field5084;
         this.method2754(arg0 | arg0 << 16 | arg0 << 24 | arg0 << 8, (byte)-58);
         if (arg1 != -11) {
            this.method2748(19, (byte)53);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[131] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "l",
      descriptor = "(B)V"
   )
   private final void method2735(byte arg0) {
      try {
         ++field5121;
         if (arg0 != 11) {
            this.method352((class668)null, 78, -3, 110, 102);
         }

         if (!this.field5323) {
            label24: {
               float[] var2 = this.field5245;
               float var3 = (float)this.field5288;
               float var4 = (float)this.field5320;
               float var5 = (float)(-this.field5304) * this.field5237 / (float)this.field5307;
               float var6 = (float)(-this.field5291) * this.field5237 / (float)this.field5302;
               float var7 = (float)(-this.field5291 + this.field5076) * this.field5237 / (float)this.field5302;
               float var8 = (float)(-this.field5304 + this.field5167) * this.field5237 / (float)this.field5307;
               if (var6 != var7 && var5 != var8) {
                  var2[8] = 0.0F;
                  var2[9] = 0.0F;
                  var2[4] = 0.0F;
                  var2[15] = 1.0F;
                  var2[2] = 0.0F;
                  var2[1] = 0.0F;
                  var2[5] = 2.0F / (-var5 + var8);
                  var2[10] = 1.0F / (var3 - var4);
                  var2[3] = 0.0F;
                  var2[7] = 0.0F;
                  var2[13] = (var5 + var8) / (var8 - var5);
                  var2[12] = (var6 + var7) / (-var7 + var6);
                  var2[0] = 2.0F / (var7 - var6);
                  var2[11] = 0.0F;
                  var2[6] = 0.0F;
                  var2[14] = var3 / (-var4 + var3);
                  if (!client.field4564) {
                     break label24;
                  }
               }

               var2[6] = 0.0F;
               var2[13] = 0.0F;
               var2[9] = 0.0F;
               var2[7] = 0.0F;
               var2[10] = 1.0F;
               var2[2] = 0.0F;
               var2[0] = 1.0F;
               var2[3] = 0.0F;
               var2[8] = 0.0F;
               var2[15] = 1.0F;
               var2[1] = 0.0F;
               var2[12] = 0.0F;
               var2[11] = 0.0F;
               var2[5] = 1.0F;
               var2[14] = 0.0F;
               var2[4] = 0.0F;
            }

            this.method2758(-4493);
            this.field5323 = true;
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field5349[145] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "u",
      descriptor = "(I)V"
   )
   public abstract void method1165(int arg0);

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(FFFIFFF)Z"
   )
   private final boolean method2736(float arg0, float arg1, float arg2, int arg3, float arg4, float arg5, float arg6) {
      try {
         ++field5094;
         Buffer var8 = this.field5341.method567(true, (byte)49);
         if (var8 == null) {
            return false;
         } else {
            Stream var9;
            label22: {
               var9 = this.method2759((byte)37, var8);
               if (!Stream.method5090()) {
                  var9.method5091(arg4);
                  var9.method5091(arg1);
                  var9.method5091(arg6);
                  var9.method5091(arg0);
                  var9.method5091(arg5);
                  var9.method5091(arg2);
                  if (!client.field4564) {
                     break label22;
                  }
               }

               var9.method5082(arg4);
               var9.method5082(arg1);
               var9.method5082(arg6);
               var9.method5082(arg0);
               var9.method5082(arg5);
               var9.method5082(arg2);
            }

            if (arg3 <= 15) {
               this.field5318 = 98;
            }

            var9.method5086();
            return this.field5341.method569(1571);
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field5349[122] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "XA",
      descriptor = "()I"
   )
   public final int method437() {
      try {
         ++field5105;
         return this.field5320;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5349[118] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "o",
      descriptor = "(Z)V"
   )
   public abstract void method1193(boolean arg0);

   @OriginalMember(
      owner = "client!cs",
      name = "Y",
      descriptor = "(I)V"
   )
   private final void method2737(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cs",
      name = "s",
      descriptor = "()Z"
   )
   public final boolean method404() {
      try {
         ++field5032;
         return false;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5349[59] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "E",
      descriptor = "()I"
   )
   public final int method287() {
      try {
         ++field5156;
         return this.field5217 + this.field5213 + this.field5214;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5349[84] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V"
   )
   public abstract void method1151(Object arg0, int arg1, Canvas arg2);

   @OriginalMember(
      owner = "client!cs",
      name = "b",
      descriptor = "(I)Lza;"
   )
   public final class432 method300(int arg0) {
      try {
         ++field5096;
         class73 var2 = new class73(arg0);
         this.field5188.method2585(var2, 80);
         return var2;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[173] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "g",
      descriptor = "(II)V"
   )
   public final void method2738(int arg0, int arg1) {
      try {
         if (arg0 <= -70) {
            ++field5113;
            if (~arg1 != -2) {
               if (arg1 != 0) {
                  if (arg1 == 2) {
                     this.method2761(class226.field3348, (byte)-69, class641.field9348);
                     return;
                  }

                  if (arg1 == 3) {
                     this.method2761(class345.field4912, (byte)-69, class621.field9036);
                     return;
                  }

                  if (~arg1 == -5) {
                     this.method2761(class566.field8200, (byte)-69, class566.field8200);
                     return;
                  }
               } else {
                  this.method2761(class621.field9036, (byte)-69, class621.field9036);
               }

            } else {
               this.method2761(class641.field9348, (byte)-69, class641.field9348);
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[87] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method312(int arg0) {
      try {
         ++field5125;
         if (arg0 != 1) {
            throw new IllegalArgumentException("");
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[168] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "e",
      descriptor = "(B)V"
   )
   public abstract void method1158(byte arg0);

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(I[Lke;)V"
   )
   public final void method364(int arg0, class622[] arg1) {
      boolean var3 = client.field4564;

      try {
         ++field5028;
         int var4 = 0;
         if (var3) {
            this.field5259[var4] = arg1[var4];
            ++var4;
         }

         while(true) {
            class357 var10000;
            if (~arg0 >= ~var4) {
               this.field5251 = arg0;
               var10000 = this;
               if (!var3) {
                  if (this.field5315.method4107(-112)) {
                     this.method1153(1);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = this;
            }

            var10000.field5259[var4] = arg1[var4];
            ++var4;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field5349[28] + arg0 + ',' + (arg1 != null ? field5349[4] : field5349[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "z",
      descriptor = "(I)V"
   )
   private final void method2739(int arg0) {
      try {
         label16: {
            ++field5159;
            if (this.field5140 == null) {
               this.field5078 = this.field5051 = 1;
               if (!client.field4564) {
                  break label16;
               }
            }

            Dimension var2 = this.field5140.getSize();
            this.field5078 = var2.width;
            this.field5051 = var2.height;
         }

         this.field5167 = this.field5051;
         this.field5076 = this.field5078;
         this.method2797(121);
         int var3 = -24 % ((37 - arg0) / 34);
         this.method2801((byte)-22);
         this.method2774((byte)106);
         this.method1189((byte)116);
         this.method2764(5);
         this.method2807(-32);
         this.method349();
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5349[128] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(ILsd;I)V"
   )
   public abstract void method1202(int arg0, class102 arg1, int arg2);

   @OriginalMember(
      owner = "client!cs",
      name = "d",
      descriptor = "(B)Lnd;"
   )
   public final class568 method2740(byte arg0) {
      try {
         if (arg0 != 83) {
            this.field5300 = null;
         }

         ++field5087;
         return this.field5299 != null ? this.field5299.method860(arg0 ^ -8651) : null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[53] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "y",
      descriptor = "(I)V"
   )
   private final void method2741(int arg0) {
      try {
         ++field5149;
         this.method1169((byte)-116);
         if (this.field5284 != null) {
            this.field5284.method1597(25728);
         }

         if (arg0 != 0) {
            this.method2760((byte)-15);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[171] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(BLuj;)V"
   )
   public abstract void method1166(byte arg0, class401 arg1);

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(Lza;)V"
   )
   public final void method286(class432 arg0) {
      try {
         this.field5092 = ((class73)arg0).field1306;
         ++field5153;
         this.field5098 = this.field5092.method5080(32768, false);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[5] + (arg0 != null ? field5349[4] : field5349[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(IILrn;IILej;I)V"
   )
   public abstract void method1175(int arg0, int arg1, class280 arg2, int arg3, int arg4, class133 arg5, int arg6);

   @OriginalMember(
      owner = "client!cs",
      name = "n",
      descriptor = "(Z)V"
   )
   public abstract void method1157(boolean arg0);

   @OriginalMember(
      owner = "client!cs",
      name = "k",
      descriptor = "(I)V"
   )
   public final void method2742(int arg0) {
      try {
         ++field5160;
         if (arg0 < 42) {
            this.method1190((class584)null, 41, (class209)null);
         }

         if (~this.field5257 != -9) {
            this.method2749(true);
            this.method2745((byte)-126, true);
            this.method2778(true, -32);
            this.method2731((byte)120, true);
            this.method2748(1, (byte)-21);
            this.field5257 = 8;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "([IIIIIZ)Ltd;"
   )
   public final class476 method357(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         ++field5069;
         return new class683(this, arg3, arg4, arg0, arg1, arg2);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field5349[17] + (arg0 != null ? field5349[4] : field5349[6]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(Lps;B)V"
   )
   public final void method2743(class104 arg0, byte arg1) {
      try {
         this.field5215.method982(arg0);
         ++field5197;
         this.field5218 = false;
         if (arg1 > -66) {
            this.field5279 = null;
         }

         this.method2788((byte)63);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[48] + (arg0 != null ? field5349[4] : field5349[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "j",
      descriptor = "(Z)V"
   )
   public final void method2744(boolean arg0) {
      try {
         if (!arg0) {
            if (this.field5316[this.field5286] != class557.field8079) {
               this.field5316[this.field5286] = class557.field8079;
               this.field5297[this.field5286].method979();
               this.method2772(1105488376);
            }

            ++field5191;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[32] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(BZ)V"
   )
   public final void method2745(byte arg0, boolean arg1) {
      try {
         int var3 = 84 % ((-64 - arg0) / 34);
         ++field5161;
         if (!arg1 == this.field5271) {
            this.field5271 = arg1;
            this.method1208(2);
            this.field5257 &= -32;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5349[95] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "y",
      descriptor = "()Ldfa;"
   )
   public final class173 method398() {
      try {
         ++field5104;
         return this.field5219;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5349[63] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "d",
      descriptor = "(IIIIII)V"
   )
   public final void method403(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field5049;
         float var7 = this.method1181(0);
         this.method2781(46);
         this.method2754(arg4, (byte)-95);
         this.method2779(8, 0, class295.field4119);
         this.method2783(3592, class295.field4119, 0);
         this.method2748(arg5, (byte)-21);
         this.field5215.method984((float)(arg2 + -1), (byte)-125, (float)(arg3 + -1), 1.0F);
         this.field5215.method1003((float)arg1 + -var7, (byte)-92, (float)arg0 - var7, 0.0F);
         this.method2746((byte)77);
         this.method1180(false, false);
         this.method2804(-3822, class21.field339, 4);
         this.method1180(true, false);
         this.method2783(3592, class540.field7850, 0);
         this.method2779(8, 0, class540.field7850);
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field5349[164] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "c",
      descriptor = "(IB)V"
   )
   public abstract void method1176(int arg0, byte arg1);

   @OriginalMember(
      owner = "client!cs",
      name = "u",
      descriptor = "(B)V"
   )
   public final void method2746(byte arg0) {
      try {
         this.field5218 = false;
         ++field5206;
         if (arg0 < 12) {
            this.method348();
         }

         this.method2788((byte)63);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[40] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method2747(byte arg0) {
      try {
         ++field5192;
         if (arg0 != 93) {
            this.field5260 = null;
         }

         this.field5215.method979();
         this.field5218 = true;
         this.method2788((byte)63);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method2748(int arg0, byte arg1) {
      boolean var3 = client.field4564;

      try {
         ++field5106;
         if (~this.field5261 != ~arg0) {
            boolean var4;
            class157 var5;
            boolean var6;
            label60: {
               if (arg0 == 1) {
                  var4 = true;
                  var5 = class551.field7952;
                  var6 = true;
                  if (!var3) {
                     break label60;
                  }
               }

               if (arg0 == 2) {
                  var4 = true;
                  var6 = false;
                  var5 = class375.field5574;
                  if (!var3) {
                     break label60;
                  }
               }

               if (arg0 != 128) {
                  var5 = class419.field6119;
                  var4 = false;
                  var6 = false;
                  if (!var3) {
                     break label60;
                  }
               }

               var6 = true;
               var4 = true;
               var5 = class246.field3531;
            }

            if (!this.field5264 == var6) {
               this.field5264 = var6;
               this.method1182(arg1 + -15021);
            }

            if (this.field5230 != var4) {
               this.field5230 = var4;
               this.method1152(8);
            }

            if (this.field5256 != var5) {
               this.field5256 = var5;
               this.method1163(false);
            }

            this.field5257 &= -29;
            this.field5261 = arg0;
         }

         if (arg1 != -21) {
            this.method2744(false);
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field5349[23] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "T",
      descriptor = "(IIII)V"
   )
   public final void method309(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field5089;
         boolean var5 = false;
         if (~this.field5224 > ~arg0) {
            this.field5224 = arg0;
            var5 = true;
         }

         if (~this.field5294 < ~arg2) {
            this.field5294 = arg2;
            var5 = true;
         }

         if (this.field5280 < arg1) {
            this.field5280 = arg1;
            var5 = true;
         }

         if (arg3 < this.field5249) {
            var5 = true;
            this.field5249 = arg3;
         }

         if (var5) {
            if (!this.field5347) {
               this.field5347 = true;
               this.method1187(false);
            }

            this.method1178((byte)-123);
            this.method2764(5);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field5349[143] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "b",
      descriptor = "(B)V"
   )
   public abstract void method1169(byte arg0);

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(Lika;[Ltn;Z)Lda;"
   )
   public final class66 method414(class445 arg0, class94[] arg1, boolean arg2) {
      try {
         ++field5144;
         return new class379(this, arg0, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5349[133] + (arg0 != null ? field5349[4] : field5349[6]) + ',' + (arg1 != null ? field5349[4] : field5349[6]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "k",
      descriptor = "()Z"
   )
   public final boolean method308() {
      try {
         ++field5066;
         return true;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5349[161] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "i",
      descriptor = "(Z)V"
   )
   private final void method2749(boolean arg0) {
      try {
         if (!arg0) {
            this.method1202(121, (class102)null, 65);
         }

         if (class6.field63 != this.field5315) {
            class551 var2 = this.field5315;
            this.field5315 = class6.field63;
            if (!var2.method4107(-117)) {
               this.method2805(0);
            }

            this.method2730(-119);
            this.field5308 = this.field5300;
            this.method2741(0);
            this.field5257 &= -8;
         }

         ++field5148;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "Y",
      descriptor = "()[I"
   )
   public final int[] method278() {
      try {
         ++field5029;
         return new int[]{this.field5291, this.field5304, this.field5302, this.field5307};
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5349[46] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "()Z"
   )
   public final boolean method411() {
      try {
         ++field5093;
         return true;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5349[77] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "H",
      descriptor = "(I)I"
   )
   public final int method2750(int arg0) {
      try {
         if (arg0 != 1) {
            return 107;
         } else {
            ++field5071;
            return this.field5321;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[31] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "la",
      descriptor = "()V"
   )
   public final void method349() {
      try {
         this.field5280 = 0;
         ++field5080;
         this.field5294 = this.field5076;
         this.field5249 = this.field5167;
         this.field5224 = 0;
         if (this.field5347) {
            this.field5347 = false;
            this.method1187(false);
         }

         this.method2764(5);
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5349[139] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(BF)V"
   )
   public final void method2751(byte arg0, float arg1) {
      try {
         if (arg0 <= 44) {
            this.method1180(true, false);
         }

         if (this.field5237 != arg1) {
            this.field5237 = arg1;
            this.method2774((byte)106);
         }

         ++field5058;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[93] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "M",
      descriptor = "(I)[F"
   )
   public final float[] method2752(int arg0) {
      try {
         ++field5187;
         if (arg0 != -1) {
            this.field5255 = false;
         }

         return this.field5267;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[149] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "h",
      descriptor = "(I)V"
   )
   public final void method442(int arg0) {
      try {
         ++field5186;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[142] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(Ltv;ILrfa;)Z"
   )
   public abstract boolean method1190(class584 arg0, int arg1, class209 arg2);

   @OriginalMember(
      owner = "client!cs",
      name = "ra",
      descriptor = "(IIII)V"
   )
   public final void method408(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field5233 = arg0;
         this.field5321 = arg2;
         ++field5162;
         this.field5269 = arg3;
         this.field5246 = arg1;
         this.field5285 = true;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field5349[165] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(ZBI)Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   public final NativeHeapBuffer method2753(boolean arg0, byte arg1, int arg2) {
      try {
         if (arg1 != 21) {
            this.field5331 = null;
         }

         ++field5052;
         return this.field5092.method5080(arg2, arg0);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5349[155] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "K",
      descriptor = "(I)V"
   )
   public abstract void method1172(int arg0);

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V"
   )
   public final void method385(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      try {
         ++field5168;
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field5349[44] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method2754(int arg0, byte arg1) {
      try {
         if (~this.field5282 != ~arg0) {
            this.field5282 = arg0;
            this.method1159(14);
         }

         ++field5179;
         if (arg1 > -55) {
            this.field5329 = null;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[27] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "d",
      descriptor = "(IZ)Lue;"
   )
   public class242 method1168(int arg0, boolean arg1) {
      try {
         if (!arg1) {
            return null;
         } else {
            ++field5107;
            if (arg0 != 6) {
               if (~arg0 == -2) {
                  return new class172(this);
               }

               if (~arg0 == -3) {
                  return new class393(this, this.field5055);
               }

               if (arg0 != 7) {
                  return new class419(this);
               }

               if (!client.field4564) {
                  return new class375(this);
               }
            }

            return new class679(this);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5349[163] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "c",
      descriptor = "(Z)V"
   )
   public final void method394(boolean arg0) {
      try {
         ++field5171;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method417(Canvas arg0) {
      try {
         ++field5038;
         if (this.field5081 == arg0) {
            throw new RuntimeException();
         } else if (this.field5043.containsKey(arg0)) {
            this.method1151(this.field5043.get(arg0), 3584, arg0);
            this.field5043.remove(arg0);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[135] + (arg0 != null ? field5349[4] : field5349[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "q",
      descriptor = "(Z)V"
   )
   public abstract void method1210(boolean arg0);

   @OriginalMember(
      owner = "client!cs",
      name = "c",
      descriptor = "(BZ)Lsd;"
   )
   public abstract class102 method1194(byte arg0, boolean arg1);

   @OriginalMember(
      owner = "client!cs",
      name = "X",
      descriptor = "(I)V"
   )
   public final void method339(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method323(int arg0) {
      try {
         ++field5082;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[74] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public final void method426(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      boolean var10 = client.field4564;

      try {
         float var11;
         float var12;
         label89: {
            ++field5110;
            var11 = (float)arg2 - (float)arg0;
            var12 = (float)arg3 - (float)arg1;
            if (var11 == 0.0F && var12 == 0.0F) {
               var11 = 1.0F;
               if (!var10) {
                  break label89;
               }
            }

            float var13 = (float)(1.0D / Math.sqrt((double)(var11 * var11 + var12 * var12)));
            var11 *= var13;
            var12 *= var13;
         }

         float var14;
         float var15;
         float var16;
         float var17;
         float var18;
         float var19;
         label83: {
            this.method2781(12);
            this.method2754(arg4, (byte)-124);
            this.method2779(8, 0, class295.field4119);
            this.method2783(3592, class295.field4119, 0);
            this.method2748(arg5, (byte)-21);
            this.method2747((byte)93);
            this.method1180(false, false);
            int var26 = arg8 % (arg6 + arg7);
            var14 = (float)arg6 * var11;
            var15 = (float)arg6 * var12;
            var16 = 0.0F;
            var17 = 0.0F;
            var18 = var14;
            var19 = var15;
            if (arg6 < var26) {
               var17 = (float)(arg6 + arg7 + -var26) * var12;
               var16 = (float)(-var26 + arg6 - -arg7) * var11;
               if (!var10) {
                  break label83;
               }
            }

            var19 = (float)(-var26 + arg6) * var12;
            var18 = (float)(-var26 + arg6) * var11;
         }

         float var20 = (float)arg0 + var16;
         float var21 = (float)arg1 + var17;
         float var22 = (float)arg7 * var11;
         float var23 = (float)arg7 * var12;

         do {
            label95: {
               int var10000;
               label74: {
                  if (arg2 <= arg0) {
                     float var27;
                     var10000 = (var27 = (float)arg2 - var20) == 0.0F ? 0 : (var27 < 0.0F ? -1 : 1);
                     if (var10) {
                        break label74;
                     }

                     if (var10000 > 0) {
                        break;
                     }

                     if (!(var18 + var20 < (float)arg2)) {
                        break label95;
                     }

                     var18 = (float)arg2 + -var20;
                     if (!var10) {
                        break label95;
                     }
                  }

                  float var28;
                  var10000 = (var28 = var20 - (float)arg2) == 0.0F ? 0 : (var28 < 0.0F ? -1 : 1);
               }

               if (var10000 > 0) {
                  break;
               }

               if (var18 + var20 > (float)arg2) {
                  var18 = (float)arg2 - var20;
               }
            }

            label97: {
               if (arg1 >= arg3) {
                  if ((float)arg3 > var21) {
                     break;
                  }

                  if (!(var19 + var21 < (float)arg3)) {
                     break label97;
                  }

                  var19 = (float)arg3 - var21;
                  if (!var10) {
                     break label97;
                  }
               }

               if ((float)arg3 < var21) {
                  break;
               }

               if (var19 + var21 > (float)arg3) {
                  var19 = (float)arg3 + -var21;
               }
            }

            if (!this.method2736(var18 + var20, var21, 0.0F, 64, var20, var19 + var21, 0.0F)) {
               return;
            }

            var21 += var19 + var23;
            this.method2771(-127);
            var20 += var18 + var22;
            var19 = var15;
            var18 = var14;
         } while(!var10);

         this.method1180(true, false);
         this.method2783(3592, class540.field7850, 0);
         this.method2779(8, 0, class540.field7850);
      } catch (RuntimeException var25) {
         throw class608.method4462(var25, field5349[58] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(II[I[I)Laa;"
   )
   public final class510 method304(int arg0, int arg1, int[] arg2, int[] arg3) {
      try {
         ++field5064;
         return class704.method5122(arg2, arg1, arg0, 0, this, arg3);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field5349[120] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5349[4] : field5349[6]) + ',' + (arg3 != null ? field5349[4] : field5349[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "W",
      descriptor = "(I)Lps;"
   )
   public final class104 method2755(int arg0) {
      try {
         ++field5086;
         if (arg0 != 0) {
            this.field5259 = null;
         }

         return this.field5215;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[152] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(BLlha;ZI)V"
   )
   public abstract void method1206(byte arg0, class649 arg1, boolean arg2, int arg3);

   @OriginalMember(
      owner = "client!cs",
      name = "E",
      descriptor = "(I)V"
   )
   public static void method2756(int arg0) {
      try {
         field5036 = null;
         if (arg0 > 99) {
            field5026 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5349[112] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(ZBIZ)V"
   )
   public final void method2757(boolean arg0, byte arg1, int arg2, boolean arg3) {
      boolean var5 = client.field4564;

      try {
         if (~this.field5231 != ~arg2 || this.field5285 != this.field5276) {
            class706 var6;
            int var7;
            byte var8;
            int var9;
            int var10;
            label73: {
               var6 = null;
               var7 = 0;
               var8 = 0;
               var9 = 0;
               var10 = this.field5285 ? 3 : 0;
               if (arg2 < 0) {
                  this.method2744(false);
                  if (!var5) {
                     break label73;
                  }
               }

               class693 var11;
               label81: {
                  var6 = this.field5292.method2545(arg2, arg1 ^ -1947);
                  var11 = super.field1192.method1456(-8988, arg2);
                  if (var11.field10152 != 0 || var11.field10173 != 0) {
                     int var12 = var11.field10153 ? 64 : 128;
                     int var13 = var12 * 50;
                     class104 var14 = this.method2776((byte)97);
                     var14.method987(0.0F, (float)(this.field5227 % var13 * var11.field10152) / (float)var13, 17368, (float)(this.field5227 % var13 * var11.field10173) / (float)var13);
                     this.method2765(class392.field5781, 140);
                     if (!var5) {
                        break label81;
                     }
                  }

                  this.method2744(false);
               }

               if (!this.field5285) {
                  var8 = var11.field10164;
                  var9 = var11.field10158;
                  var10 = var11.field10167;
               }

               var7 = var11.field10166;
            }

            label47: {
               this.method2795(var10, arg3, var9, arg0, var8, (byte)99);
               if (this.field5284 == null) {
                  this.method2806(false, var6);
                  this.method2738(-74, var7);
                  if (!var5) {
                     break label47;
                  }
               }

               this.field5284.method73(var7, 120, var6);
            }

            this.field5231 = arg2;
            this.field5276 = this.field5285;
         }

         ++field5027;
         this.field5257 &= -8;
         if (arg1 != 20) {
            this.method2787(false);
         }
      } catch (RuntimeException var16) {
         throw class608.method4462(var16, field5349[76] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "V",
      descriptor = "(I)V"
   )
   private final void method2758(int arg0) {
      try {
         this.field5235 = (float)this.field5320;
         ++field5195;
         if (arg0 != -4493) {
            this.field5313 = 0.94085157F;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[127] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(ZIZLlha;I)V"
   )
   public abstract void method1177(boolean arg0, int arg1, boolean arg2, class649 arg3, int arg4);

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(BLjaclib/memory/Buffer;)Ljaclib/memory/Stream;"
   )
   public final Stream method2759(byte arg0, Buffer arg1) {
      try {
         ++field5117;
         this.field5305.method5092(arg1);
         if (arg0 != 37) {
            field5100 = 61;
         }

         return this.field5305;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[169] + arg0 + ',' + (arg1 != null ? field5349[4] : field5349[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "f",
      descriptor = "(B)V"
   )
   private final void method2760(byte arg0) {
      try {
         int var2 = -123 / ((31 - arg0) / 53);
         if (this.field5284 != null) {
            this.field5284.method74(-1);
         }

         ++field5073;
         this.method1171((byte)-57);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[60] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(Lhea;BLhea;)V"
   )
   public final void method2761(class443 arg0, byte arg1, class443 arg2) {
      try {
         if (arg1 == -69) {
            ++field5174;
            boolean var4 = false;
            if (this.field5252[this.field5286] != arg0) {
               this.field5252[this.field5286] = arg0;
               var4 = true;
               this.method1193(true);
            }

            if (this.field5250[this.field5286] != arg2) {
               this.field5250[this.field5286] = arg2;
               var4 = true;
               this.method1210(false);
            }

            if (var4) {
               this.field5257 &= -30;
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field5349[167] + (arg0 != null ? field5349[4] : field5349[6]) + ',' + arg1 + ',' + (arg2 != null ? field5349[4] : field5349[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "q",
      descriptor = "(B)V"
   )
   private final void method2762(byte arg0) {
      boolean var2 = client.field4564;

      try {
         this.field5330 = this.method1194((byte)87, false);
         ++field5164;
         this.field5330.method568(22407, 28, 140);
         int var3 = -4 % ((arg0 - 22) / 33);
         int var4 = 0;
         class357 var10000;
         if (var2) {
            var10000 = this;
         } else if (var4 >= 4) {
            var10000 = this;
            if (!var2) {
               this.field5344 = this.method1170(0, new class535[]{new class535(new class274[]{class274.field3883, class274.field3887, class274.field3887})});
               return;
            }
         } else {
            var10000 = this;
         }

         do {
            while(true) {
               Buffer var5 = var10000.field5330.method567(true, (byte)49);
               if (var5 != null) {
                  Stream var6;
                  label56: {
                     var6 = this.method2759((byte)37, var5);
                     if (Stream.method5090()) {
                        var6.method5082(0.0F);
                        var6.method5082(0.0F);
                        var6.method5082(0.0F);
                        var6.method5082(0.0F);
                        var6.method5082(0.0F);
                        var6.method5082(0.0F);
                        var6.method5082(0.0F);
                        var6.method5082(0.0F);
                        var6.method5082(1.0F);
                        var6.method5082(0.0F);
                        var6.method5082(0.0F);
                        var6.method5082(1.0F);
                        var6.method5082(0.0F);
                        var6.method5082(1.0F);
                        var6.method5082(1.0F);
                        var6.method5082(1.0F);
                        var6.method5082(0.0F);
                        var6.method5082(1.0F);
                        var6.method5082(1.0F);
                        var6.method5082(1.0F);
                        var6.method5082(1.0F);
                        var6.method5082(1.0F);
                        var6.method5082(0.0F);
                        var6.method5082(0.0F);
                        var6.method5082(1.0F);
                        var6.method5082(0.0F);
                        var6.method5082(1.0F);
                        var6.method5082(0.0F);
                        var6.method5082(0.0F);
                        var6.method5082(0.0F);
                        var6.method5082(0.0F);
                        var6.method5082(0.0F);
                        var6.method5082(0.0F);
                        var6.method5082(0.0F);
                        var6.method5082(0.0F);
                        if (!var2) {
                           break label56;
                        }
                     }

                     var6.method5091(0.0F);
                     var6.method5091(0.0F);
                     var6.method5091(0.0F);
                     var6.method5091(0.0F);
                     var6.method5091(0.0F);
                     var6.method5091(0.0F);
                     var6.method5091(0.0F);
                     var6.method5091(0.0F);
                     var6.method5091(1.0F);
                     var6.method5091(0.0F);
                     var6.method5091(0.0F);
                     var6.method5091(1.0F);
                     var6.method5091(0.0F);
                     var6.method5091(1.0F);
                     var6.method5091(1.0F);
                     var6.method5091(1.0F);
                     var6.method5091(0.0F);
                     var6.method5091(1.0F);
                     var6.method5091(1.0F);
                     var6.method5091(1.0F);
                     var6.method5091(1.0F);
                     var6.method5091(1.0F);
                     var6.method5091(0.0F);
                     var6.method5091(0.0F);
                     var6.method5091(1.0F);
                     var6.method5091(0.0F);
                     var6.method5091(1.0F);
                     var6.method5091(0.0F);
                     var6.method5091(0.0F);
                     var6.method5091(0.0F);
                     var6.method5091(0.0F);
                     var6.method5091(0.0F);
                     var6.method5091(0.0F);
                     var6.method5091(0.0F);
                     var6.method5091(0.0F);
                  }

                  var6.method5086();
                  if (this.field5330.method569(1571)) {
                     if (!var2) {
                        var10000 = this;
                        break;
                     }

                     ++var4;
                  } else {
                     ++var4;
                  }
               } else {
                  ++var4;
               }

               if (var4 >= 4) {
                  var10000 = this;
                  if (!var2) {
                     this.field5344 = this.method1170(0, new class535[]{new class535(new class274[]{class274.field3883, class274.field3887, class274.field3887})});
                     return;
                  }
               } else {
                  var10000 = this;
               }
            }
         } while(var2);

         this.field5344 = this.method1170(0, new class535[]{new class535(new class274[]{class274.field3883, class274.field3887, class274.field3887})});
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field5349[35] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "([FB)[F"
   )
   public final float[] method2763(float[] arg0, byte arg1) {
      try {
         arg0[0] = this.field5308[0];
         arg0[4] = this.field5308[1];
         arg0[8] = this.field5308[2];
         ++field5152;
         arg0[12] = this.field5308[3];
         arg0[9] = this.field5308[6];
         if (arg1 > -124) {
            this.method2768(false);
         }

         arg0[1] = this.field5308[4];
         arg0[13] = this.field5308[7];
         arg0[2] = this.field5308[8];
         arg0[5] = this.field5308[5];
         arg0[14] = this.field5308[11];
         arg0[6] = this.field5308[9];
         arg0[10] = this.field5308[10];
         arg0[3] = this.field5308[12];
         arg0[7] = this.field5308[13];
         arg0[11] = this.field5308[14];
         arg0[15] = this.field5308[15];
         return arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[25] + (arg0 != null ? field5349[4] : field5349[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "n",
      descriptor = "()V"
   )
   public final void method433() {
      try {
         ++field5079;
         if (this.field5292 != null) {
            this.field5292.method2546((byte)-1);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5349[137] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(IIIIIF)Lke;"
   )
   public final class622 method258(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      try {
         ++field5135;
         return new class461(arg0, arg1, arg2, arg3, arg4, arg5);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field5349[147] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "F",
      descriptor = "(I)F"
   )
   public abstract float method1181(int arg0);

   @OriginalMember(
      owner = "client!cs",
      name = "S",
      descriptor = "(I)V"
   )
   private final void method2764(int arg0) {
      try {
         this.field5311 = (float)(this.field5249 - this.field5304);
         this.field5277 = (float)(-this.field5304 + this.field5280);
         this.field5243 = (float)(-this.field5291 + this.field5294);
         this.field5289 = (float)(-this.field5291 + this.field5224);
         if (arg0 != 5) {
            this.method1157(false);
         }

         ++field5129;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[90] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method310(Canvas arg0, int arg1, int arg2) {
      try {
         ++field5033;
         Object var4 = null;
         if (arg0 != null && this.field5081 != arg0) {
            if (this.field5043.containsKey(arg0)) {
               var4 = this.field5043.get(arg0);
            }
         } else {
            var4 = this.field5047;
         }

         if (var4 == null) {
            throw new RuntimeException();
         } else {
            this.method1192(arg0, var4, 127);
            if (this.field5140 == arg0) {
               this.method2739(124);
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field5349[160] + (arg0 != null ? field5349[4] : field5349[6]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "C",
      descriptor = "(I)V"
   )
   public abstract void method1159(int arg0);

   @OriginalMember(
      owner = "client!cs",
      name = "A",
      descriptor = "()Z"
   )
   public final boolean method351() {
      try {
         ++field5203;
         return this.field5248;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5349[21] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "w",
      descriptor = "(I)V"
   )
   public abstract void method1155(int arg0);

   @OriginalMember(
      owner = "client!cs",
      name = "j",
      descriptor = "(I)V"
   )
   public final void method378(int arg0) {
      try {
         ++field5031;
         if (~arg0 <= -129 && ~arg0 >= -1025) {
            if (this.field5292 != null) {
               this.field5292.method2546((byte)-1);
            }

            this.field5229 = arg0;
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method264(int[] arg0) {
      try {
         arg0[0] = this.field5076;
         arg0[1] = this.field5167;
         ++field5142;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[123] + (arg0 != null ? field5349[4] : field5349[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V"
   )
   public final void method395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class510 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      try {
         ++field5132;
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field5349[88] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field5349[4] : field5349[6]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "za",
      descriptor = "(IIIII)V"
   )
   public final void method270(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.method2781(122);
         ++field5053;
         this.method2754(arg3, (byte)-71);
         this.method2779(8, 0, class295.field4119);
         this.method2783(3592, class295.field4119, 0);
         this.method2748(arg4, (byte)-21);
         this.field5215.method984((float)arg2, (byte)-125, (float)arg2, 1.0F);
         this.field5215.method990(arg0, arg1, 0);
         this.method2746((byte)71);
         this.method1180(false, false);
         this.method1202(0, this.field5342, 10);
         this.method1166((byte)121, this.field5326);
         this.method1156(class368.field5464, 256, 0, 0);
         this.method1180(true, false);
         this.method2783(3592, class540.field7850, 0);
         this.method2779(8, 0, class540.field7850);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field5349[33] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(Lqh;I)V"
   )
   public final void method2765(class74 arg0, int arg1) {
      try {
         if (arg1 != 140) {
            this.method256((class713)null);
         }

         this.field5316[this.field5286] = arg0;
         ++field5065;
         this.method2772(1105488376);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[136] + (arg0 != null ? field5349[4] : field5349[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method315(Canvas arg0) {
      try {
         label45: {
            ++field5128;
            this.field5140 = null;
            this.field5047 = null;
            if (arg0 == null || this.field5081 == arg0) {
               this.field5047 = this.field5115;
               this.field5140 = this.field5081;
               if (!client.field4564) {
                  break label45;
               }
            }

            if (this.field5043.containsKey(arg0)) {
               this.field5047 = this.field5043.get(arg0);
               this.field5140 = arg0;
            }
         }

         if (this.field5140 != null && this.field5047 != null) {
            this.method1191(this.field5140, this.field5047, (byte)-16);
            this.method2739(72);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[49] + (arg0 != null ? field5349[4] : field5349[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(ZIIB[I)Lnfa;"
   )
   public final class706 method2766(boolean arg0, int arg1, int arg2, byte arg3, int[] arg4) {
      try {
         ++field5158;
         if (arg3 != 104) {
            this.field5267 = null;
         }

         return this.method1212(arg2, -13473, arg0, 0, arg4, arg1, 0);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field5349[47] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field5349[4] : field5349[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(Lvm;I)V"
   )
   public final void method406(class713 arg0, int arg1) {
      try {
         ++field5074;
         this.field5236.method5514((byte)25, arg0, this, arg1);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[29] + (arg0 != null ? field5349[4] : field5349[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method2767(byte arg0, int arg1) {
      try {
         if (arg0 != -112) {
            this.field5115 = null;
         }

         ++field5150;
         if (~this.field5286 != ~arg1) {
            this.field5286 = arg1;
            this.method1172(13);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[36] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "s",
      descriptor = "(I)V"
   )
   public void method1183(int arg0) {
      try {
         this.method2737(arg0 ^ 27844);
         if (arg0 != -21724) {
            this.field5291 = -57;
         }

         ++field5208;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[158] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "e",
      descriptor = "(Z)V"
   )
   public final void method2768(boolean arg0) {
      boolean var2 = client.field4564;

      try {
         ++field5041;
         Hashtable var3 = new Hashtable();
         if (this.field5043 != null && !this.field5043.isEmpty()) {
            Enumeration var4 = this.field5043.keys();
            if (var2 || var4.hasMoreElements()) {
               do {
                  Canvas var5 = (Canvas)var4.nextElement();
                  var3.put(var5, this.method1160(var5, (byte)-86));
               } while(var4.hasMoreElements());
            }
         }

         this.field5043 = var3;
         this.method2762((byte)-33);
         this.method2732(24);
         this.method2789(-110);
         this.field5236.method5512(this, arg0);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field5349[81] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "d",
      descriptor = "()Z"
   )
   public final boolean method274() {
      try {
         ++field5123;
         return false;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5349[102] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "r",
      descriptor = "(IIIIIII)I"
   )
   public final int method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4564;

      try {
         int var9;
         label62: {
            ++field5163;
            var9 = 0;
            float var10 = (float)arg2 * this.field5219.field1694 + (float)arg0 * this.field5219.field1733 + (float)arg1 * this.field5219.field1713 + this.field5219.field1706;
            float var11 = (float)arg5 * this.field5219.field1694 + (float)arg3 * this.field5219.field1733 + (float)arg4 * this.field5219.field1713 + this.field5219.field1706;
            if ((float)this.field5288 > var10 && var11 < (float)this.field5288) {
               var9 |= 16;
               if (!var8) {
                  break label62;
               }
            }

            if ((float)this.field5320 < var10 && var11 > (float)this.field5320) {
               var9 |= 32;
            }
         }

         label56: {
            int var12 = (int)(((float)arg2 * this.field5219.field1724 + (float)arg0 * this.field5219.field1717 + (float)arg1 * this.field5219.field1732 + this.field5219.field1705) * (float)this.field5302 / (float)arg6);
            int var13 = (int)(((float)arg5 * this.field5219.field1724 + (float)arg3 * this.field5219.field1717 + (float)arg4 * this.field5219.field1732 + this.field5219.field1705) * (float)this.field5302 / (float)arg6);
            if (this.field5289 > (float)var12 && this.field5289 > (float)var13) {
               var9 |= 1;
               if (!var8) {
                  break label56;
               }
            }

            if (this.field5243 < (float)var12 && (float)var13 > this.field5243) {
               var9 |= 2;
            }
         }

         int var14 = (int)(((float)arg2 * this.field5219.field1726 + (float)arg0 * this.field5219.field1730 + (float)arg1 * this.field5219.field1729 + this.field5219.field1740) * (float)this.field5307 / (float)arg6);
         int var15 = (int)(((float)arg5 * this.field5219.field1726 + (float)arg3 * this.field5219.field1730 + (float)arg4 * this.field5219.field1729 + this.field5219.field1740) * (float)this.field5307 / (float)arg6);
         if (!((float)var14 < this.field5277) || !((float)var15 < this.field5277)) {
            if (!((float)var14 > this.field5311) || !(this.field5311 < (float)var15)) {
               return var9;
            }

            var9 |= 8;
            if (!var8) {
               return var9;
            }
         }

         var9 |= 4;
         return var9;
      } catch (RuntimeException var17) {
         throw class608.method4462(var17, field5349[45] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(I[Ljq;)Luj;"
   )
   public abstract class401 method1170(int arg0, class535[] arg1);

   @OriginalMember(
      owner = "client!cs",
      name = "KA",
      descriptor = "(IIII)V"
   )
   public final void method333(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field5035;
         if (arg0 <= 0 && ~(this.field5076 - 1) >= ~arg2 && ~arg1 >= -1 && arg3 >= this.field5167 - 1) {
            this.method349();
         } else {
            this.field5249 = this.field5076 < arg3 ? 0 : arg3;
            this.field5294 = ~this.field5076 > ~arg2 ? 0 : arg2;
            this.field5280 = arg1 < 0 ? 0 : arg1;
            this.field5224 = arg0 < 0 ? 0 : arg0;
            if (!this.field5347) {
               this.field5347 = true;
               this.method1187(false);
            }

            this.method1178((byte)-123);
            this.method2764(5);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field5349[103] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(IIZ)Ltd;"
   )
   public final class476 method265(int arg0, int arg1, boolean arg2) {
      try {
         ++field5170;
         return new class683(this, arg0, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5349[124] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "c",
      descriptor = "(IZ)V"
   )
   public final void method2769(int arg0, boolean arg1) {
      try {
         ++field5108;
         if (arg0 <= 116) {
            this.method260(-122, (class510)null, 8, 29);
         }

         if (this.field5234 != arg1) {
            this.field5234 = arg1;
            this.method1199(false);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[30] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(ZIII[BLtv;)Lwe;"
   )
   public abstract class425 method1185(boolean arg0, int arg1, int arg2, int arg3, byte[] arg4, class584 arg5);

   @OriginalMember(
      owner = "client!cs",
      name = "I",
      descriptor = "(I)V"
   )
   public abstract void method1182(int arg0);

   @OriginalMember(
      owner = "client!cs",
      name = "m",
      descriptor = "(B)I"
   )
   public final int method2770(byte arg0) {
      try {
         ++field5181;
         if (arg0 != -41) {
            this.field5213 = -54;
         }

         return this.field5269;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[69] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "q",
      descriptor = "(I)V"
   )
   private final void method2771(int arg0) {
      try {
         this.method1202(0, this.field5341, 10);
         ++field5063;
         this.method1166((byte)121, this.field5332);
         this.method1156(class331.field4734, 1, 0, 0);
         if (arg0 >= -97) {
            this.method416();
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[89] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "b",
      descriptor = "()Z"
   )
   public final boolean method392() {
      try {
         ++field5207;
         return true;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5349[79] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(IIIIII)Lpa;"
   )
   public final class386 method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field5137;
         return new class88(this, arg0, arg1, arg2, arg3, arg4, arg5);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field5349[42] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "U",
      descriptor = "(I)V"
   )
   private final void method2772(int arg0) {
      try {
         this.method1150(arg0 ^ -1105488270);
         if (arg0 != 1105488376) {
            this.field5341 = null;
         }

         ++field5189;
         if (this.field5284 != null) {
            this.field5284.method1598(59);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[156] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "A",
      descriptor = "(ILaa;II)V"
   )
   public final void method260(int arg0, class510 arg1, int arg2, int arg3) {
      try {
         ++field5048;
         class298 var5 = (class298)arg1;
         class706 var6 = var5.field4165;
         this.method2798(-4649);
         this.method2806(false, var6);
         this.method2748(1, (byte)-21);
         this.method2761(class641.field9348, (byte)-69, class641.field9348);
         this.method2779(8, 0, class295.field4119);
         this.method2754(arg0, (byte)-97);
         this.field5215.method984((float)this.field5076, (byte)-125, (float)this.field5167, 0.0F);
         this.method2746((byte)45);
         this.field5297[0].method984(var6.method880(-10745, (float)this.field5076), (byte)-125, var6.method881((float)this.field5167, false), 1.0F);
         this.field5297[0].method1003(var6.method881((float)(-arg3), false), (byte)-92, var6.method880(-10745, (float)(-arg2)), 0.0F);
         this.field5316[0] = class392.field5781;
         this.method2772(1105488376);
         this.method2777(124);
         this.method2744(false);
         this.method2779(8, 0, class540.field7850);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field5349[108] + arg0 + ',' + (arg1 != null ? field5349[4] : field5349[6]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "x",
      descriptor = "()Z"
   )
   public final boolean method348() {
      try {
         ++field5131;
         return false;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5349[64] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(ILtv;[FIIZ)Lnfa;"
   )
   public final class706 method2773(int arg0, class584 arg1, float[] arg2, int arg3, int arg4, boolean arg5) {
      try {
         if (arg4 != 1) {
            this.field5246 = -25;
         }

         ++field5091;
         return this.method1200(arg2, arg0, arg3, 0, (byte)1, 0, arg5, arg1);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field5349[54] + arg0 + ',' + (arg1 != null ? field5349[4] : field5349[6]) + ',' + (arg2 != null ? field5349[4] : field5349[6]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "h",
      descriptor = "(B)V"
   )
   private final void method2774(byte arg0) {
      try {
         if (arg0 == 106) {
            ++field5165;
            this.field5323 = false;
            this.method2735((byte)11);
            if (class56.field1113 == this.field5315) {
               this.method2741(0);
            }
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[150] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "s",
      descriptor = "(B)Lps;"
   )
   public final class104 method2775(byte arg0) {
      try {
         if (!this.field5254) {
            this.field5223.method1004(this.field5221, this.field5215);
            this.field5254 = true;
         }

         ++field5127;
         int var2 = -106 / (-arg0 / 59);
         return this.field5223;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[121] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(Ldfa;)V"
   )
   public final void method338(class173 arg0) {
      try {
         this.field5219 = (class104)arg0;
         ++field5183;
         this.field5221.method982(this.field5219);
         this.field5221.method1009(1);
         this.field5222.method1014(this.field5221, 3);
         this.field5220.method1014(this.field5219, 3);
         if (this.field5315.method4107(-98)) {
            this.method2805(0);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[82] + (arg0 != null ? field5349[4] : field5349[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "k",
      descriptor = "(B)Lps;"
   )
   public final class104 method2776(byte arg0) {
      try {
         ++field5178;
         if (arg0 != 97) {
            this.method2749(true);
         }

         return this.field5297[this.field5286];
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[115] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "o",
      descriptor = "(I)V"
   )
   public final void method2777(int arg0) {
      try {
         this.method2804(-3822, class368.field5464, 2);
         ++field5139;
         int var2 = -49 / ((75 - arg0) / 44);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[26] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "w",
      descriptor = "()Z"
   )
   public final boolean method386() {
      try {
         ++field5126;
         return this.field5228[3].method69(30453);
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5349[162] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(IIIILtv;IZ[B)Lnfa;"
   )
   public abstract class706 method1203(int arg0, int arg1, int arg2, int arg3, class584 arg4, int arg5, boolean arg6, byte[] arg7);

   @OriginalMember(
      owner = "client!cs",
      name = "C",
      descriptor = "(Z)V"
   )
   public final void method316(boolean arg0) {
      try {
         this.field5306 = arg0;
         ++field5155;
         this.method1158((byte)-89);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "l",
      descriptor = "()Z"
   )
   public final boolean method328() {
      try {
         ++field5070;
         return true;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5349[50] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "O",
      descriptor = "(I)V"
   )
   public abstract void method1161(int arg0);

   @OriginalMember(
      owner = "client!cs",
      name = "da",
      descriptor = "(III[I)V"
   )
   public final void method389(int arg0, int arg1, int arg2, int[] arg3) {
      try {
         float var5;
         int var6;
         int var7;
         label33: {
            ++field5050;
            var5 = this.field5219.method977((byte)-61, (float)arg1, (float)arg0, (float)arg2);
            if (var5 < -0.0078125F || var5 > 0.0078125F) {
               var6 = (int)((float)this.field5302 * this.field5219.method989(false, (float)arg1, (float)arg0, (float)arg2) / var5);
               var7 = (int)((float)this.field5307 * this.field5219.method996((float)arg2, (float)arg0, 0, (float)arg1) / var5);
               if (!client.field4564) {
                  break label33;
               }
            }

            var6 = this.field5291;
            var7 = this.field5304;
         }

         arg3[2] = (int)var5;
         arg3[1] = (int)((float)var7 - this.field5277);
         arg3[0] = (int)((float)var6 + -this.field5289);
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field5349[41] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5349[4] : field5349[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "r",
      descriptor = "(I)V"
   )
   public abstract void method1211(int arg0);

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public abstract void method1180(boolean arg0, boolean arg1);

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method2778(boolean arg0, int arg1) {
      try {
         if (!this.field5322 != !arg0) {
            this.field5322 = arg0;
            this.method1179(true);
            this.field5257 &= -32;
         }

         if (arg1 != -32) {
            this.method2800(93);
         }

         ++field5184;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[57] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "p",
      descriptor = "()V"
   )
   public void method272() {
      boolean var1 = client.field4564;

      try {
         ++field5209;
         if (!this.field5255) {
            class22 var2 = this.field5188.method2579(-801);
            if (var1) {
               ((class73)var2).method772(-63);
               var2 = this.field5188.method2583(1);
            }

            while(true) {
               if (var2 == null) {
                  Enumeration var3 = this.field5043.keys();
                  if (!var1) {
                     Canvas var4;
                     if (var1) {
                        var4 = (Canvas)var3.nextElement();
                        this.method1151(this.field5043.get(var4), 3584, var4);
                     }

                     while(true) {
                        Object var10000;
                        if (!var3.hasMoreElements()) {
                           class741.method5347(false, 63, true);
                           this.field5116.release();
                           var10000 = this;
                           if (!var1) {
                              this.field5255 = true;
                              return;
                           }
                        } else {
                           var10000 = var3.nextElement();
                        }

                        var4 = (Canvas)var10000;
                        this.method1151(this.field5043.get(var4), 3584, var4);
                     }
                  }
               } else {
                  ((class73)var2).method772(-63);
               }

               var2 = this.field5188.method2583(1);
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field5349[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(IILlha;)V"
   )
   public final void method2779(int arg0, int arg1, class649 arg2) {
      try {
         if (arg0 == 8) {
            ++field5185;
            this.method1177(false, arg1, false, arg2, -86);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5349[159] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5349[4] : field5349[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "DA",
      descriptor = "(IIII)V"
   )
   public final void method429(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field5304 = arg1;
         ++field5130;
         this.field5302 = arg2;
         this.field5291 = arg0;
         this.field5307 = arg3;
         this.method2774((byte)106);
         this.method2801((byte)92);
         this.method2807(-32);
         this.method2764(5);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field5349[39] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "g",
      descriptor = "(B)V"
   )
   public abstract void method1178(byte arg0);

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(Ltn;Z)Ltd;"
   )
   public final class476 method307(class94 arg0, boolean arg1) {
      boolean var3 = client.field4564;

      try {
         class476 var12;
         label102: {
            ++field5056;
            if (arg0.field1523 != 0 && ~arg0.field1520 != -1) {
               int[] var4;
               label106: {
                  var4 = new int[arg0.field1523 * arg0.field1520];
                  int var5 = 0;
                  int var6 = 0;
                  if (arg0.field1527 != null) {
                     int var7 = 0;
                     if (var3 || arg0.field1520 > var7) {
                        do {
                           int var8 = 0;
                           if (var3) {
                              var4[var6++] = class93.method899(arg0.field1521[class66.method706(arg0.field1519[var5], 255)], arg0.field1527[var5] << 24);
                              ++var5;
                              ++var8;
                           }

                           while(true) {
                              while(~var8 > ~arg0.field1523) {
                                 var4[var6++] = class93.method899(arg0.field1521[class66.method706(arg0.field1519[var5], 255)], arg0.field1527[var5] << 24);
                                 ++var5;
                                 ++var8;
                              }

                              if (!var3) {
                                 ++var7;
                                 break;
                              }

                              ++var8;
                           }
                        } while(arg0.field1520 > var7);
                     }

                     if (!var3) {
                        break label106;
                     }
                  }

                  int var9 = 0;
                  if (var3 || var9 < arg0.field1520) {
                     do {
                        int var10 = 0;
                        if (var3 || arg0.field1523 > var10) {
                           do {
                              int var11 = arg0.field1521[arg0.field1519[var5++] & 255];
                              var4[var6++] = var11 != 0 ? class93.method899(var11, -16777216) : 0;
                              ++var10;
                           } while(arg0.field1523 > var10);
                        }

                        ++var9;
                     } while(var9 < arg0.field1520);
                  }
               }

               var12 = this.method696(arg0.field1520, arg0.field1523, 0, -68, arg0.field1523, var4);
               if (!var3) {
                  break label102;
               }
            }

            var12 = this.method696(1, 1, 0, -95, 1, new int[1]);
         }

         var12.method3006(arg0.field1522, arg0.field1525, arg0.field1526, arg0.field1524);
         return var12;
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field5349[166] + (arg0 != null ? field5349[4] : field5349[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "G",
      descriptor = "(I)Lps;"
   )
   public final class104 method2780(int arg0) {
      try {
         ++field5154;
         if (arg0 != 0) {
            this.field5205 = null;
         }

         return this.field5222;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[116] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "j",
      descriptor = "()Z"
   )
   public final boolean method327() {
      try {
         ++field5199;
         return true;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5349[38] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "L",
      descriptor = "(I)V"
   )
   private final void method2781(int arg0) {
      try {
         int var2 = 45 / ((90 - arg0) / 32);
         ++field5059;
         if (this.field5257 != 1) {
            this.method2800(0);
            this.method2745((byte)-24, false);
            this.method2802(6, false);
            this.method2778(false, -32);
            this.method2731((byte)62, false);
            this.method2757(false, (byte)20, -2, false);
            this.method2738(-76, 1);
            this.method2806(false, this.field5295);
            this.field5257 = 1;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[134] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;"
   )
   public abstract Object method1160(Canvas arg0, byte arg1);

   @OriginalMember(
      owner = "client!cs",
      name = "T",
      descriptor = "(I)V"
   )
   public final void method2782(int arg0) {
      try {
         this.method2807(-32);
         ++field5145;
         this.method2741(0);
         if (arg0 <= 53) {
            this.method2783(61, (class649)null, 91);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[37] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(ILlha;I)V"
   )
   public final void method2783(int arg0, class649 arg1, int arg2) {
      try {
         this.method1206((byte)-72, arg1, false, arg2);
         ++field5180;
         if (arg0 != 3592) {
            this.field5279 = null;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5349[129] + arg0 + ',' + (arg1 != null ? field5349[4] : field5349[6]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(IIIIIILaa;II)V"
   )
   public final void method359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class510 arg6, int arg7, int arg8) {
      try {
         ++field5143;
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field5349[97] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field5349[4] : field5349[6]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "bb",
      descriptor = "(I)V"
   )
   public abstract void method1150(int arg0);

   @OriginalMember(
      owner = "client!cs",
      name = "N",
      descriptor = "(I)V"
   )
   public final void method2784(int arg0) {
      try {
         ++field5111;
         if (arg0 >= -116) {
            this.field5306 = true;
         }

         if (~this.field5257 != -5) {
            this.method2800(0);
            this.method2745((byte)29, false);
            this.method2802(6, false);
            this.method2778(false, -32);
            this.method2731((byte)98, false);
            this.method2757(false, (byte)20, -2, false);
            this.method2748(1, (byte)-21);
            this.method2738(-119, 0);
            this.field5257 = 4;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[80] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "<init>",
      descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Lhw;II)V"
   )
   public class357(Canvas arg0, Object arg1, class160 arg2, class141 arg3, int arg4, int arg5) {
      boolean var7 = client.field4564;
      super(arg2);
      this.field5188 = new class332();
      this.field5218 = true;
      this.field5215 = new class104();
      this.field5219 = new class104();
      this.field5220 = new class104();
      this.field5221 = new class104();
      this.field5222 = new class104();
      this.field5223 = new class104();
      this.field5225 = new float[]{0.0F, 0.0F, -1.0F, 0.0F};
      this.field5228 = new class242[10];
      this.field5229 = 128;
      this.field5247 = 0;
      this.field5264 = true;
      this.field5224 = 0;
      this.field5273 = 8;
      this.field5237 = 1.0F;
      this.field5274 = 1.0F;
      this.field5241 = false;
      this.field5246 = -1;
      this.field5239 = -1.0F;
      this.field5249 = 0;
      this.field5240 = -1.0F;
      this.field5255 = false;
      this.field5234 = true;
      this.field5276 = false;
      this.field5245 = new float[16];
      this.field5235 = 3584.0F;
      this.field5272 = 0;
      this.field5265 = 0;
      this.field5280 = 0;
      this.field5260 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
      this.field5258 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
      this.field5266 = 0;
      this.field5231 = -1;
      this.field5283 = 3584.0F;
      this.field5256 = class551.field7952;
      this.field5278 = true;
      this.field5232 = false;
      this.field5286 = 0;
      this.field5294 = 0;
      this.field5263 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
      this.field5254 = false;
      this.field5267 = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
      this.field5291 = 0;
      this.field5302 = 512;
      this.field5253 = false;
      this.field5296 = false;
      this.field5244 = 16777215;
      this.field5306 = true;
      this.field5270 = 1.0F;
      this.field5300 = new float[16];
      this.field5226 = 3;
      this.field5290 = false;
      this.field5261 = 1;
      this.field5269 = 0;
      this.field5310 = -1;
      this.field5313 = 1.0F;
      this.field5314 = 0;
      this.field5279 = new float[16];
      this.field5320 = 3584;
      this.field5307 = 512;
      this.field5288 = 50;
      this.field5304 = 0;
      this.field5308 = this.field5267;
      this.field5309 = 0;
      this.field5230 = true;
      this.field5322 = false;
      this.field5321 = -1;
      this.field5319 = -1;
      this.field5323 = false;
      this.field5324 = 1.0F;
      this.field5315 = class552.field7978;
      this.field5305 = new Stream();
      this.field5325 = new class104();

      try {
         try {
            this.field5268 = arg4;
            this.field5205 = arg3;
            this.field5140 = this.field5081 = arg0;
            this.field5047 = this.field5115 = arg1;
            Dimension var8 = arg0.getSize();
            this.field5167 = this.field5051 = var8.height;
            this.field5281 = arg5;
            this.field5076 = this.field5078 = var8.width;
            class294.method2297(false, true, -18330);
            if (super.field1192 == null) {
               this.field5116 = new NativeInterface(0, this.field5281);
               this.field5292 = null;
            } else {
               this.field5292 = new class329(this, super.field1192);
               this.field5116 = new NativeInterface(super.field1192.method1457(1653), this.field5281);
               int var9 = 0;
               if (var7 || ~var9 > ~super.field1192.method1457(1653)) {
                  do {
                     class693 var10 = super.field1192.method1456(-8988, var9);
                     if (var10 != null) {
                        this.field5116.initTextureMetrics(var9, var10.field10154, var10.field10170);
                     }

                     ++var9;
                  } while(~var9 > ~super.field1192.method1457(1653));

               }
            }
         } catch (Throwable var13) {
            var13.printStackTrace();
            this.method697(true);
            throw new RuntimeException("");
         }
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field5349[114] + (arg0 != null ? field5349[4] : field5349[6]) + ',' + (arg1 != null ? field5349[4] : field5349[6]) + ',' + (arg2 != null ? field5349[4] : field5349[6]) + ',' + (arg3 != null ? field5349[4] : field5349[6]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;B)V"
   )
   public abstract void method1191(Canvas arg0, Object arg1, byte arg2);

   @OriginalMember(
      owner = "client!cs",
      name = "v",
      descriptor = "()I"
   )
   public final int method329() {
      try {
         ++field5068;
         return this.field5312 + -2;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5349[56] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "r",
      descriptor = "(B)V"
   )
   public abstract void method1171(byte arg0);

   @OriginalMember(
      owner = "client!cs",
      name = "m",
      descriptor = "(Z)V"
   )
   private final void method2785(boolean arg0) {
      try {
         this.field5300[10] = this.field5287;
         this.field5300[14] = this.field5317;
         ++field5176;
         this.field5283 = (this.field5300[14] - (float)this.field5320) / this.field5300[10];
         if (!arg0) {
            this.method254((int[])null);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(IZ)Lrn;"
   )
   public final class280 method2786(int arg0, boolean arg1) {
      try {
         if (~this.field5345.method570(1) > ~(arg0 * 2)) {
            this.field5345.method2189(27288, arg0);
         }

         ++field5118;
         if (arg1) {
            this.field5297 = null;
         }

         return this.field5345;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[98] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(Lrfa;BLtv;)Z"
   )
   public abstract boolean method1186(class209 arg0, byte arg1, class584 arg2);

   @OriginalMember(
      owner = "client!cs",
      name = "k",
      descriptor = "(Z)V"
   )
   public final void method2787(boolean arg0) {
      boolean var2 = client.field4564;

      try {
         this.field5250 = new class443[this.field5318];
         this.field5316 = new class74[this.field5318];
         this.field5297 = new class104[this.field5318];
         ++field5134;
         this.field5262 = new class47[this.field5318];
         this.field5252 = new class443[this.field5318];
         int var3 = 0;
         if (var2) {
            this.field5250[var3] = class621.field9036;
            this.field5252[var3] = class621.field9036;
            this.field5316[var3] = class557.field8079;
            this.field5297[var3] = new class104();
            ++var3;
         }

         while(true) {
            while(~this.field5318 < ~var3) {
               this.field5250[var3] = class621.field9036;
               this.field5252[var3] = class621.field9036;
               this.field5316[var3] = class557.field8079;
               this.field5297[var3] = new class104();
               ++var3;
            }

            this.field5259 = new class622[this.field5312 - 2];
            this.field5295 = this.method1197(1, 1, 17171, class296.field4146, class209.field3106);
            this.method286(new class73(262144));
            this.field5334 = this.method1170(0, new class535[]{new class535(new class274[]{class274.field3883, class274.field3887})});
            this.field5337 = this.method1170(0, new class535[]{new class535(new class274[]{class274.field3883, class274.field3885})});
            this.field5331 = this.method1170(0, new class535[]{new class535(class274.field3883), new class535(class274.field3885), new class535(class274.field3887), new class535(class274.field3884)});
            this.field5335 = this.method1170(0, new class535[]{new class535(class274.field3883), new class535(class274.field3885), new class535(class274.field3887)});
            this.field5336 = new class610(this, 0, 0, false, false);
            this.field5346 = new class610(this, 0, 0, arg0, true);
            this.field5333 = new class610(this, 0, 0, false, false);
            this.field5338 = new class610(this, 0, 0, true, true);
            this.field5329 = new class610(this, 0, 0, false, false);
            this.field5340 = new class610(this, 0, 0, true, true);
            this.field5328 = new class610(this, 0, 0, false, false);
            this.field5339 = new class610(this, 0, 0, true, true);
            this.field5327 = new class610(this, 0, 0, false, false);
            this.field5343 = new class610(this, 0, 0, true, true);
            this.field5236 = new class763(this);
            this.field5345 = this.method1205(true, 0);
            this.method2768(false);
            this.field5055 = new class105(this);
            this.field5228[1] = this.method1168(1, true);
            this.field5228[2] = this.method1168(2, arg0);
            this.field5228[4] = this.method1168(4, true);
            this.field5228[5] = this.method1168(5, true);
            this.field5228[6] = this.method1168(6, true);
            this.field5228[7] = this.method1168(7, true);
            this.field5228[3] = this.method1168(3, arg0);
            this.field5228[8] = this.method1168(8, true);
            this.field5228[9] = this.method1168(9, arg0);
            if (!var2) {
               if (!this.field5228[2].method69(30453)) {
                  this.field5228[2] = this.method1168(0, true);
               }

               if (!this.field5228[4].method69(30453)) {
                  this.field5228[4] = this.field5228[2];
               }

               if (!this.field5228[8].method69(30453)) {
                  this.field5228[8] = this.field5228[4];
               }

               if (!this.field5228[9].method69(30453)) {
                  this.field5228[9] = this.field5228[8];
               }

               this.method1183(-21724);
               this.method349();
               this.method375();
               return;
            }

            this.field5297[var3] = new class104();
            ++var3;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5349[170] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "o",
      descriptor = "(B)V"
   )
   private final void method2788(byte arg0) {
      try {
         if (class484.field7032 == this.field5315) {
            float var2 = this.method1181(0);
            this.field5215.method1003(var2, (byte)-92, var2, 0.0F);
         }

         if (arg0 == 63) {
            ++field5054;
            this.field5254 = false;
            this.method1161(12383);
            if (this.field5284 != null) {
               this.field5284.method1596((byte)44);
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[66] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(IIZI[III)Lnfa;"
   )
   public abstract class706 method1212(int arg0, int arg1, boolean arg2, int arg3, int[] arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!cs",
      name = "x",
      descriptor = "(I)V"
   )
   public abstract void method1152(int arg0);

   @OriginalMember(
      owner = "client!cs",
      name = "EA",
      descriptor = "(IIII)V"
   )
   public final void method325(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field5122;
         if (!this.field5285) {
            throw new RuntimeException("");
         } else {
            this.field5246 = arg1;
            this.field5233 = arg0;
            this.field5321 = arg2;
            this.field5269 = arg3;
            if (this.field5276) {
               this.field5228[3].method66(29015);
               this.field5228[3].method74(-1);
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field5349[101] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "R",
      descriptor = "(I)V"
   )
   private final void method2789(int arg0) {
      boolean var2 = client.field4564;

      try {
         this.field5342 = this.method1194((byte)51, false);
         ++field5102;
         this.field5342.method568(22407, 12, 3096);
         int var3 = 0;
         int var11;
         class357 var10000;
         if (var2) {
            var10000 = this;
         } else if (var3 >= 4) {
            var11 = -29 / ((arg0 - -48) / 48);
            var10000 = this;
            if (!var2) {
               this.field5326 = this.method1170(0, new class535[]{new class535(class274.field3883)});
               return;
            }
         } else {
            var10000 = this;
         }

         do {
            while(true) {
               Buffer var4 = var10000.field5342.method567(true, (byte)49);
               if (var4 != null) {
                  Stream var5 = this.method2759((byte)37, var4);
                  var5.method5082(0.0F);
                  var5.method5082(0.0F);
                  var5.method5082(0.0F);
                  int var6 = 0;
                  double var7;
                  float var9;
                  float var10;
                  if (var2) {
                     var7 = (double)(var6 * 2) * 3.141592653589793D / 256.0D;
                     var9 = (float)Math.cos(var7);
                     var10 = (float)Math.sin(var7);
                     if (!Stream.method5090()) {
                        var5.method5091(var10);
                        var5.method5091(var9);
                        var5.method5091(0.0F);
                        if (var2) {
                           var5.method5082(var10);
                           var5.method5082(var9);
                           var5.method5082(0.0F);
                           ++var6;
                        } else {
                           ++var6;
                        }
                     } else {
                        var5.method5082(var10);
                        var5.method5082(var9);
                        var5.method5082(0.0F);
                        ++var6;
                     }
                  }

                  while(var6 <= 256) {
                     var7 = (double)(var6 * 2) * 3.141592653589793D / 256.0D;
                     var9 = (float)Math.cos(var7);
                     var10 = (float)Math.sin(var7);
                     if (!Stream.method5090()) {
                        var5.method5091(var10);
                        var5.method5091(var9);
                        var5.method5091(0.0F);
                        if (var2) {
                           var5.method5082(var10);
                           var5.method5082(var9);
                           var5.method5082(0.0F);
                           ++var6;
                        } else {
                           ++var6;
                        }
                     } else {
                        var5.method5082(var10);
                        var5.method5082(var9);
                        var5.method5082(0.0F);
                        ++var6;
                     }
                  }

                  var5.method5086();
                  if (this.field5342.method569(1571)) {
                     if (!var2) {
                        var11 = -29 / ((arg0 - -48) / 48);
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
                  var11 = -29 / ((arg0 - -48) / 48);
                  var10000 = this;
                  if (!var2) {
                     this.field5326 = this.method1170(0, new class535[]{new class535(class274.field3883)});
                     return;
                  }
               } else {
                  var10000 = this;
               }
            }
         } while(var2);

         this.field5326 = this.method1170(0, new class535[]{new class535(class274.field3883)});
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field5349[110] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "b",
      descriptor = "(IIIIII)V"
   )
   public final void method340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         float var7;
         float var8;
         label22: {
            ++field5062;
            var7 = (float)(-arg0) + (float)arg2;
            var8 = (float)(-arg1) + (float)arg3;
            if (var7 == 0.0F && var8 == 0.0F) {
               var7 = 1.0F;
               if (!client.field4564) {
                  break label22;
               }
            }

            float var9 = (float)(1.0D / Math.sqrt((double)(var7 * var7 + var8 * var8)));
            var7 *= var9;
            var8 *= var9;
         }

         if (this.method2736((float)arg2 + var7, (float)arg1, 0.0F, 111, (float)arg0, (float)arg3 + var8, 0.0F)) {
            this.method2781(-93);
            this.method2754(arg4, (byte)-94);
            this.method2779(8, 0, class295.field4119);
            this.method2783(3592, class295.field4119, 0);
            this.method2748(arg5, (byte)-21);
            this.method2747((byte)93);
            this.method1180(false, false);
            this.method2771(-100);
            this.method1180(true, false);
            this.method2783(3592, class540.field7850, 0);
            this.method2779(8, 0, class540.field7850);
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field5349[105] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "xa",
      descriptor = "(F)V"
   )
   public final void method297(float arg0) {
      try {
         ++field5210;
         if (this.field5270 != arg0) {
            this.field5270 = arg0;
            this.field5116.setAmbient(arg0);
            this.method1188((byte)1);
            this.method1195((byte)-126);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[55] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "([BIZILtv;I)Lnfa;"
   )
   public final class706 method2790(byte[] arg0, int arg1, boolean arg2, int arg3, class584 arg4, int arg5) {
      try {
         ++field5034;
         return arg1 <= 31 ? null : this.method1203(0, 0, arg5, -121, arg4, arg3, arg2, arg0);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field5349[75] + (arg0 != null ? field5349[4] : field5349[6]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field5349[4] : field5349[6]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "HA",
      descriptor = "(IIII[I)V"
   )
   public final void method280(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
      try {
         ++field5030;
         float var6 = this.field5219.method977((byte)-77, (float)arg1, (float)arg0, (float)arg2);
         if (!((float)this.field5288 > var6) && !((float)this.field5320 < var6)) {
            int var7 = (int)((float)this.field5302 * this.field5219.method989(false, (float)arg1, (float)arg0, (float)arg2) / (float)arg3);
            int var8 = (int)((float)this.field5307 * this.field5219.method996((float)arg2, (float)arg0, 0, (float)arg1) / (float)arg3);
            arg4[1] = (int)((float)var8 - this.field5277);
            arg4[0] = (int)((float)var7 + -this.field5289);
            arg4[2] = (int)var6;
         } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field5349[138] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field5349[4] : field5349[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "z",
      descriptor = "()Z"
   )
   public final boolean method416() {
      try {
         ++field5201;
         return true;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5349[106] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(IIZ[[I)Lnd;"
   )
   public abstract class568 method1209(int arg0, int arg1, boolean arg2, int[][] arg3);

   @OriginalMember(
      owner = "client!cs",
      name = "n",
      descriptor = "(B)V"
   )
   public final void method2791(byte arg0) {
      boolean var2 = client.field4564;

      try {
         ++field5099;
         Enumeration var3 = this.field5043.keys();
         Canvas var4;
         if (var2) {
            var4 = (Canvas)var3.nextElement();
            this.method1151(this.field5043.get(var4), 3584, var4);
         }

         while(true) {
            Object var10000;
            if (!var3.hasMoreElements()) {
               this.field5330.method574(29079);
               this.field5341.method574(29079);
               int var5 = -71 / ((arg0 - -14) / 34);
               this.field5342.method574(29079);
               this.field5346.method4478(16383);
               this.field5338.method4478(16383);
               this.field5340.method4478(16383);
               this.field5339.method4478(16383);
               this.field5343.method4478(16383);
               this.field5236.method5516((byte)-69);
               var10000 = this.field5345;
               if (!var2) {
                  ((class280)var10000).method574(29079);
                  return;
               }
            } else {
               var10000 = var3.nextElement();
            }

            var4 = (Canvas)var10000;
            this.method1151(this.field5043.get(var4), 3584, var4);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field5349[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "c",
      descriptor = "(ZI)V"
   )
   public final void method2792(boolean arg0, int arg1) {
      try {
         if (arg1 != 0) {
            this.field5321 = 5;
         }

         if (!arg0 != !this.field5278) {
            this.field5278 = arg0;
            this.method1208(2);
         }

         ++field5085;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[43] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "Z",
      descriptor = "(I)V"
   )
   private final void method2793(int arg0) {
      try {
         if (class56.field1113 != this.field5315) {
            class551 var2 = this.field5315;
            this.field5315 = class56.field1113;
            if (!var2.method4107(arg0 ^ 11571)) {
               this.method2805(0);
            }

            this.method2735((byte)11);
            this.field5308 = this.field5245;
            this.method2741(0);
            this.field5257 &= -8;
         }

         ++field5190;
         if (arg0 != -11623) {
            this.method308();
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[144] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         ++field5124;
         float var8 = (float)arg2 - (float)arg0;
         float var9 = (float)(-arg1) + (float)arg3;
         float var10 = 0.0F;
         float var11 = 1.0F;
         if (var8 != 0.0F || var9 != 0.0F) {
            var11 = (float)Math.sqrt((double)(var8 * var8 + var9 * var9));
            var10 = (float)Math.atan2((double)var9, (double)var8);
         }

         this.method2781(122);
         this.method2754(arg4, (byte)-81);
         this.method2779(8, 0, class295.field4119);
         this.method2783(3592, class295.field4119, 0);
         this.method2748(arg6, (byte)-21);
         this.field5215.method984(var11, (byte)-125, (float)arg5, 1.0F);
         this.field5215.method990(0, -arg5 / 2, 0);
         this.field5215.method1015((int)((double)var10 * 2607.5945876176133D) & 16383);
         this.field5215.method990(arg0, arg1, 0);
         this.method2746((byte)69);
         this.method1180(false, false);
         this.method2777(-79);
         this.method1180(true, false);
         this.method2783(3592, class540.field7850, 0);
         this.method2779(8, 0, class540.field7850);
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field5349[100] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "JA",
      descriptor = "(IIIIII)I"
   )
   public final int method334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var7 = client.field4564;

      try {
         ++field5040;
         int var8 = 0;
         float var9 = (float)arg2 * this.field5219.field1694 + (float)arg0 * this.field5219.field1733 + (float)arg1 * this.field5219.field1713 + this.field5219.field1706;
         if (var9 < 1.0F) {
            var9 = 1.0F;
         }

         float var10 = (float)arg5 * this.field5219.field1694 + (float)arg3 * this.field5219.field1733 + (float)arg4 * this.field5219.field1713 + this.field5219.field1706;
         if (var10 < 1.0F) {
            var10 = 1.0F;
         }

         label67: {
            if ((float)this.field5288 > var9 && var10 < (float)this.field5288) {
               var8 |= 16;
               if (!var7) {
                  break label67;
               }
            }

            if ((float)this.field5320 < var9 && var10 > (float)this.field5320) {
               var8 |= 32;
            }
         }

         label77: {
            int var11 = (int)(((float)arg2 * this.field5219.field1724 + (float)arg0 * this.field5219.field1717 + (float)arg1 * this.field5219.field1732 + this.field5219.field1705) * (float)this.field5302 / var9);
            int var12 = (int)(((float)arg5 * this.field5219.field1724 + (float)arg3 * this.field5219.field1717 + (float)arg4 * this.field5219.field1732 + this.field5219.field1705) * (float)this.field5302 / var10);
            if (!(this.field5289 > (float)var11) || !(this.field5289 > (float)var12)) {
               if (!(this.field5243 < (float)var11) || !((float)var12 > this.field5243)) {
                  break label77;
               }

               var8 |= 2;
               if (!var7) {
                  break label77;
               }
            }

            var8 |= 1;
         }

         int var13 = (int)(((float)arg2 * this.field5219.field1726 + (float)arg0 * this.field5219.field1730 + (float)arg1 * this.field5219.field1729 + this.field5219.field1740) * (float)this.field5307 / var9);
         int var14 = (int)(((float)arg5 * this.field5219.field1726 + (float)arg3 * this.field5219.field1730 + (float)arg4 * this.field5219.field1729 + this.field5219.field1740) * (float)this.field5307 / var10);
         if (this.field5277 > (float)var13 && this.field5277 > (float)var14) {
            var8 |= 4;
            if (!var7) {
               return var8;
            }
         }

         if ((float)var13 > this.field5311 && (float)var14 > this.field5311) {
            var8 |= 8;
         }

         return var8;
      } catch (RuntimeException var16) {
         throw class608.method4462(var16, field5349[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "h",
      descriptor = "(Z)Lps;"
   )
   public final class104 method2794(boolean arg0) {
      try {
         if (arg0) {
            return null;
         } else {
            ++field5061;
            return this.field5297[this.field5286];
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[113] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "i",
      descriptor = "(B)V"
   )
   public abstract void method1167(byte arg0);

   @OriginalMember(
      owner = "client!cs",
      name = "p",
      descriptor = "(Z)V"
   )
   public abstract void method1163(boolean arg0);

   @OriginalMember(
      owner = "client!cs",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method336(Canvas arg0, int arg1, int arg2) {
      try {
         ++field5151;
         if (this.field5081 == arg0) {
            throw new RuntimeException();
         } else if (!this.field5043.containsKey(arg0)) {
            if (!arg0.isShowing()) {
               throw new RuntimeException();
            } else {
               try {
                  Class var4 = Class.forName(field5349[72]);
                  Method var5 = var4.getMethod(field5349[71], Boolean.TYPE);
                  var5.invoke(arg0, Boolean.TRUE);
               } catch (Exception var8) {
               }

               Object var6 = this.method1160(arg0, (byte)-111);
               if (var6 == null) {
                  throw new RuntimeException();
               } else {
                  this.field5043.put(arg0, var6);
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field5349[73] + (arg0 != null ? field5349[4] : field5349[6]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(IZIZIB)V"
   )
   private final void method2795(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, byte arg5) {
      try {
         int var7 = 18 / ((-2 - arg5) / 51);
         boolean var10 = arg1 & this.method386();
         ++field5204;
         if (!var10 && (~arg0 == -5 || ~arg0 == -9 || arg0 == 9)) {
            arg0 = 2;
            arg2 = arg0 != 4 ? 1 : arg4 & 1;
            arg4 = 0;
         }

         if (~arg0 != -1 && arg3) {
            arg0 |= Integer.MIN_VALUE;
         }

         if (~this.field5247 != ~arg0) {
            if (~this.field5247 != -1) {
               this.field5228[Integer.MAX_VALUE & this.field5247].method68(-92);
            }

            label48: {
               if (~arg0 == -1) {
                  this.field5284 = null;
                  if (!client.field4564) {
                     break label48;
                  }
               }

               this.field5284 = this.field5228[Integer.MAX_VALUE & arg0];
               this.field5284.method72(arg3, -29461);
               this.field5284.method70(true, arg3);
               this.field5284.method65(arg4, arg2, (byte)-81);
            }

            this.field5272 = arg4;
            this.field5266 = arg2;
            this.field5247 = arg0;
         } else if (~this.field5247 != -1) {
            this.field5228[Integer.MAX_VALUE & this.field5247].method70(true, arg3);
            if (this.field5272 != arg4 || ~this.field5266 != ~arg2) {
               this.field5228[this.field5247 & Integer.MAX_VALUE].method65(arg4, arg2, (byte)-78);
               this.field5272 = arg4;
               this.field5266 = arg2;
            }

         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field5349[78] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "t",
      descriptor = "(B)V"
   )
   public abstract void method1195(byte arg0);

   @OriginalMember(
      owner = "client!cs",
      name = "D",
      descriptor = "(I)V"
   )
   private final void method2796(int arg0) {
      try {
         if (arg0 > -20) {
            this.field5300 = null;
         }

         ++field5088;
         if (!this.field5241) {
            float[] var2 = this.field5279;
            this.field5241 = true;
            if (~this.field5076 != -1 && this.field5167 != 0) {
               var2[14] = 0.5F;
               var2[5] = -2.0F / (float)this.field5167;
               var2[3] = 0.0F;
               var2[7] = 0.0F;
               var2[2] = 0.0F;
               var2[15] = 1.0F;
               var2[1] = 0.0F;
               var2[12] = -1.0F;
               var2[9] = 0.0F;
               var2[11] = 0.0F;
               var2[0] = 2.0F / (float)this.field5076;
               var2[6] = 0.0F;
               var2[13] = 1.0F;
               var2[10] = 0.5F;
               var2[4] = 0.0F;
               var2[8] = 0.0F;
            } else {
               var2[12] = 0.0F;
               var2[7] = 0.0F;
               var2[14] = 0.0F;
               var2[6] = 0.0F;
               var2[0] = 1.0F;
               var2[3] = 0.0F;
               var2[5] = 1.0F;
               var2[15] = 1.0F;
               var2[1] = 0.0F;
               var2[2] = 0.0F;
               var2[9] = 0.0F;
               var2[8] = 0.0F;
               var2[13] = 0.0F;
               var2[4] = 0.0F;
               var2[11] = 0.0F;
               var2[10] = 1.0F;
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[61] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;"
   )
   public final class293 method396(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      try {
         ++field5112;
         return new class494(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field5349[151] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5349[4] : field5349[6]) + ',' + (arg3 != null ? field5349[4] : field5349[6]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "aa",
      descriptor = "(IIIIII)V"
   )
   public final void method295(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.method2781(126);
         ++field5046;
         this.method2754(arg4, (byte)-72);
         this.method2779(8, 0, class295.field4119);
         this.method2783(3592, class295.field4119, 0);
         this.method2748(arg5, (byte)-21);
         this.field5215.method984((float)arg2, (byte)-125, (float)arg3, 1.0F);
         this.field5215.method990(arg0, arg1, 0);
         this.method2746((byte)38);
         this.method1180(false, false);
         this.method2777(-90);
         this.method1180(true, false);
         this.method2783(3592, class540.field7850, 0);
         this.method2779(8, 0, class540.field7850);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field5349[65] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "f",
      descriptor = "(II)V"
   )
   public final void method296(int arg0, int arg1) {
      try {
         ++field5138;
         if (this.field5288 != arg0 || ~this.field5320 != ~arg1) {
            this.field5320 = arg1;
            this.field5288 = arg0;
            this.method2801((byte)-32);
            this.method2774((byte)106);
            this.method2760((byte)123);
         }

      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[154] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "B",
      descriptor = "(I)V"
   )
   private final void method2797(int arg0) {
      try {
         ++field5119;
         int var2 = 60 / ((26 - arg0) / 57);
         this.field5241 = false;
         if (class484.field7032 == this.field5315) {
            this.method2796(-47);
            this.method2741(0);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[126] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "Q",
      descriptor = "(I)V"
   )
   public final void method2798(int arg0) {
      try {
         if (this.field5257 != 2) {
            this.method2800(0);
            this.method2745((byte)-119, false);
            this.method2802(6, false);
            this.method2778(false, -32);
            this.method2731((byte)87, false);
            this.method2757(false, (byte)20, -2, false);
            this.field5257 = 2;
         }

         ++field5095;
         if (arg0 != -4649) {
            this.field5213 = 0;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[146] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "L",
      descriptor = "(III)V"
   )
   public final void method424(int arg0, int arg1, int arg2) {
      try {
         if (this.field5319 != arg0 || this.field5310 != arg1 || ~this.field5309 != ~arg2) {
            this.field5319 = arg0;
            this.field5310 = arg1;
            this.field5309 = arg2;
            this.method2760((byte)-90);
            this.method1208(2);
         }

         ++field5194;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5349[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(Lej;III)V"
   )
   public abstract void method1156(class133 arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(IIIIZ)Ltd;"
   )
   public final class476 method342(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         ++field5200;
         class683 var6 = new class683(this, arg2, arg3, arg4);
         var6.method1053(0, 0, arg2, arg3, arg0, arg1);
         return var6;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field5349[99] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "P",
      descriptor = "(I)V"
   )
   public final void method2799(int arg0) {
      try {
         ++field5114;
         if (this.field5257 != 16) {
            this.method2793(-11623);
            this.method2745((byte)-12, true);
            this.method2778(true, -32);
            this.method2731((byte)93, true);
            this.method2748(1, (byte)-21);
            this.field5257 = 16;
         }

         if (arg0 >= -101) {
            this.method2797(-99);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[85] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(Lph;IIII)Lka;"
   )
   public final class495 method352(class668 arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field5136;
         return new class610(this, arg0, arg1, arg3, arg4, arg2);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field5349[86] + (arg0 != null ? field5349[4] : field5349[6]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "p",
      descriptor = "(B)V"
   )
   public abstract void method1188(byte arg0);

   @OriginalMember(
      owner = "client!cs",
      name = "l",
      descriptor = "(I)V"
   )
   private final void method2800(int arg0) {
      try {
         if (arg0 != 0) {
            this.field5167 = 32;
         }

         ++field5133;
         if (class484.field7032 != this.field5315) {
            class551 var2 = this.field5315;
            this.field5315 = class484.field7032;
            if (var2.method4107(arg0 + -94)) {
               this.method2805(arg0);
            }

            this.method2796(-29);
            this.field5308 = this.field5279;
            this.method2741(0);
            this.field5257 &= -25;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[104] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "ZA",
      descriptor = "(IFFFFF)V"
   )
   public final void method337(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      try {
         ++field5044;
         boolean var7 = this.field5244 != arg0;
         if (var7 || this.field5239 != arg1 || this.field5240 != arg2) {
            this.field5244 = arg0;
            this.field5239 = arg1;
            this.field5240 = arg2;
            if (var7) {
               this.field5274 = (float)(this.field5244 & 16711680) / 1.671168E7F;
               this.field5313 = (float)(65280 & this.field5244) / 65280.0F;
               this.field5324 = (float)(255 & this.field5244) / 255.0F;
               this.method1188((byte)1);
            }

            this.field5116.setSunColour(this.field5274, this.field5313, this.field5324, arg1, arg2);
            this.method1165(-107);
         }

         if (this.field5263[0] != arg3 || this.field5263[1] != arg4 || this.field5263[2] != arg5) {
            this.field5263[1] = arg4;
            this.field5263[0] = arg3;
            this.field5263[2] = arg5;
            this.field5258[0] = -arg3;
            this.field5258[1] = -arg4;
            this.field5258[2] = -arg5;
            float var8 = (float)(1.0D / Math.sqrt((double)(arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field5260[2] = arg5 * var8;
            this.field5260[1] = arg4 * var8;
            this.field5260[0] = arg3 * var8;
            this.field5225[0] = -this.field5260[0];
            this.field5225[1] = -this.field5260[1];
            this.field5225[2] = -this.field5260[2];
            this.field5116.setSunDirection(this.field5260[0], this.field5260[1], this.field5260[2]);
            this.method1211(1);
            this.field5275 = (int)(arg3 * 256.0F / arg4);
            this.field5303 = (int)(arg5 * 256.0F / arg4);
         }

         this.method1195((byte)-125);
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field5349[148] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "([FIIIBIZLtv;)Lnfa;"
   )
   public abstract class706 method1200(float[] arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, boolean arg6, class584 arg7);

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(Lvm;)V"
   )
   public final void method256(class713 arg0) {
      try {
         ++field5202;
         this.field5236.method5514((byte)123, arg0, this, -1);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[92] + (arg0 != null ? field5349[4] : field5349[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(Lpa;)V"
   )
   public final void method402(class386 arg0) {
      try {
         this.field5299 = (class223)arg0;
         ++field5146;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[7] + (arg0 != null ? field5349[4] : field5349[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "c",
      descriptor = "(B)V"
   )
   private final void method2801(byte arg0) {
      try {
         ++field5216;
         this.field5296 = false;
         int var2 = 124 / ((56 - arg0) / 35);
         this.method2730(-117);
         if (class6.field63 == this.field5315) {
            this.method2741(0);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[24] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "pa",
      descriptor = "()V"
   )
   public final void method374() {
      try {
         this.field5285 = false;
         ++field5198;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5349[62] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "b",
      descriptor = "(IZ)V"
   )
   public final void method2802(int arg0, boolean arg1) {
      try {
         if (!arg1 != !this.field5253) {
            this.field5253 = arg1;
            this.method1157(false);
            this.field5257 &= -8;
         }

         ++field5042;
         if (arg0 != 6) {
            this.method333(-60, 123, -92, 45);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[157] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(IIILtv;Lrfa;)Lnfa;"
   )
   public abstract class706 method1197(int arg0, int arg1, int arg2, class584 arg3, class209 arg4);

   @OriginalMember(
      owner = "client!cs",
      name = "b",
      descriptor = "(BZ)V"
   )
   public final void method2803(byte arg0, boolean arg1) {
      try {
         ++field5211;
         if (arg0 > 22) {
            if (!this.field5290 != !arg1) {
               this.field5290 = arg1;
               this.method1157(false);
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[94] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "l",
      descriptor = "(Z)V"
   )
   public abstract void method1199(boolean arg0);

   @OriginalMember(
      owner = "client!cs",
      name = "c",
      descriptor = "(II)I"
   )
   public final int method354(int arg0, int arg1) {
      try {
         ++field5166;
         return arg0 | arg1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[141] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(ILej;I)V"
   )
   private final void method2804(int arg0, class133 arg1, int arg2) {
      try {
         this.method1202(0, this.field5330, 10);
         ++field5083;
         if (arg0 != -3822) {
            this.method2784(-124);
         }

         this.method1166((byte)121, this.field5344);
         this.method1156(arg1, arg2, 0, 0);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5349[52] + arg0 + ',' + (arg1 != null ? field5349[4] : field5349[6]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "o",
      descriptor = "()Ldfa;"
   )
   public final class173 method432() {
      try {
         ++field5101;
         return new class104();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5349[67] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "U",
      descriptor = "(IIIII)V"
   )
   public final void method361(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.method340(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
         ++field5175;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field5349[20] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "m",
      descriptor = "(I)V"
   )
   private final void method2805(int arg0) {
      try {
         this.field5254 = false;
         if (arg0 != 0) {
            this.method264((int[])null);
         }

         ++field5173;
         if (this.field5284 != null) {
            this.field5284.method1599((byte)-126);
         }

         this.method1155(arg0 + -127);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[51] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(ZLbt;)V"
   )
   public final void method2806(boolean arg0, class47 arg1) {
      try {
         ++field5045;
         if (arg0) {
            this.method2787(true);
         }

         if (this.field5262[this.field5286] != arg1) {
            label29: {
               this.field5262[this.field5286] = arg1;
               if (arg1 == null) {
                  this.method1167((byte)81);
                  if (!client.field4564) {
                     break label29;
                  }
               }

               arg1.method461((byte)89);
            }

            this.field5257 &= -2;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[111] + arg0 + ',' + (arg1 != null ? field5349[4] : field5349[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "b",
      descriptor = "(ZI)Lrn;"
   )
   public abstract class280 method1205(boolean arg0, int arg1);

   @OriginalMember(
      owner = "client!cs",
      name = "d",
      descriptor = "(II)I"
   )
   public final int method269(int arg0, int arg1) {
      try {
         ++field5177;
         return arg1 ^ arg0 & arg1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[91] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "A",
      descriptor = "(I)V"
   )
   public final void method2807(int arg0) {
      try {
         if (arg0 == -32) {
            if (class552.field7978 != this.field5315) {
               class551 var2 = this.field5315;
               this.field5315 = class552.field7978;
               if (var2.method4107(-117)) {
                  this.method2805(0);
               }

               this.field5308 = this.field5267;
               this.field5257 &= -32;
            }

            ++field5037;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5349[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "K",
      descriptor = "([I)V"
   )
   public final void method254(int[] arg0) {
      try {
         arg0[3] = this.field5249;
         ++field5090;
         arg0[1] = this.field5280;
         arg0[0] = this.field5224;
         arg0[2] = this.field5294;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[153] + (arg0 != null ? field5349[4] : field5349[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "g",
      descriptor = "(Z)V"
   )
   public abstract void method1179(boolean arg0);

   @OriginalMember(
      owner = "client!cs",
      name = "d",
      descriptor = "(I)Lps;"
   )
   public final class104 method2808(int arg0) {
      try {
         if (arg0 != 0) {
            return null;
         } else {
            ++field5193;
            return this.field5221;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[34] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "f",
      descriptor = "(Z)I"
   )
   public final int method2809(boolean arg0) {
      try {
         if (!arg0) {
            return 21;
         } else {
            ++field5196;
            return this.field5246;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5349[68] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V"
   )
   public abstract void method1192(Canvas arg0, Object arg1, int arg2);

   @OriginalMember(
      owner = "client!cs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2810(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2811(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 122;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 101;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
