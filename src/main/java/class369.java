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

@OriginalClass("client!sc")
public abstract class class369 extends class66 {
   @OriginalMember(
      owner = "client!sc",
      name = "Ag",
      descriptor = "Lll;"
   )
   private class387 field5056;
   @OriginalMember(
      owner = "client!sc",
      name = "mb",
      descriptor = "Z"
   )
   public boolean field5235;
   @OriginalMember(
      owner = "client!sc",
      name = "Fb",
      descriptor = "Lvm;"
   )
   public class716 field5236;
   @OriginalMember(
      owner = "client!sc",
      name = "Q",
      descriptor = "Lvm;"
   )
   public class716 field5237;
   @OriginalMember(
      owner = "client!sc",
      name = "af",
      descriptor = "Lvm;"
   )
   public class716 field5238;
   @OriginalMember(
      owner = "client!sc",
      name = "Cg",
      descriptor = "Lvm;"
   )
   public class716 field5239;
   @OriginalMember(
      owner = "client!sc",
      name = "ie",
      descriptor = "Lvm;"
   )
   private class716 field5240;
   @OriginalMember(
      owner = "client!sc",
      name = "uc",
      descriptor = "Lvm;"
   )
   private class716 field5241;
   @OriginalMember(
      owner = "client!sc",
      name = "E",
      descriptor = "[Lhh;"
   )
   private class141[] field5271;
   @OriginalMember(
      owner = "client!sc",
      name = "vb",
      descriptor = "F"
   )
   public float field5255;
   @OriginalMember(
      owner = "client!sc",
      name = "Dg",
      descriptor = "Z"
   )
   private boolean field5260;
   @OriginalMember(
      owner = "client!sc",
      name = "ng",
      descriptor = "Z"
   )
   public boolean field5276;
   @OriginalMember(
      owner = "client!sc",
      name = "Yb",
      descriptor = "Z"
   )
   private boolean field5274;
   @OriginalMember(
      owner = "client!sc",
      name = "Dc",
      descriptor = "I"
   )
   private int field5248;
   @OriginalMember(
      owner = "client!sc",
      name = "Eg",
      descriptor = "F"
   )
   public float field5283;
   @OriginalMember(
      owner = "client!sc",
      name = "ne",
      descriptor = "[F"
   )
   private float[] field5264;
   @OriginalMember(
      owner = "client!sc",
      name = "wg",
      descriptor = "I"
   )
   public int field5254;
   @OriginalMember(
      owner = "client!sc",
      name = "ig",
      descriptor = "I"
   )
   public int field5258;
   @OriginalMember(
      owner = "client!sc",
      name = "ab",
      descriptor = "I"
   )
   private int field5273;
   @OriginalMember(
      owner = "client!sc",
      name = "Ce",
      descriptor = "Z"
   )
   public boolean field5292;
   @OriginalMember(
      owner = "client!sc",
      name = "Qc",
      descriptor = "Lqea;"
   )
   public class139 field5286;
   @OriginalMember(
      owner = "client!sc",
      name = "bb",
      descriptor = "F"
   )
   public float field5244;
   @OriginalMember(
      owner = "client!sc",
      name = "x",
      descriptor = "I"
   )
   private int field5298;
   @OriginalMember(
      owner = "client!sc",
      name = "jd",
      descriptor = "F"
   )
   public float field5311;
   @OriginalMember(
      owner = "client!sc",
      name = "sd",
      descriptor = "Lgo;"
   )
   public class656 field5287;
   @OriginalMember(
      owner = "client!sc",
      name = "ac",
      descriptor = "I"
   )
   public int field5309;
   @OriginalMember(
      owner = "client!sc",
      name = "dc",
      descriptor = "Z"
   )
   private boolean field5265;
   @OriginalMember(
      owner = "client!sc",
      name = "oe",
      descriptor = "I"
   )
   public int field5242;
   @OriginalMember(
      owner = "client!sc",
      name = "Ze",
      descriptor = "I"
   )
   public int field5279;
   @OriginalMember(
      owner = "client!sc",
      name = "hb",
      descriptor = "[F"
   )
   private float[] field5306;
   @OriginalMember(
      owner = "client!sc",
      name = "Sc",
      descriptor = "I"
   )
   public int field5263;
   @OriginalMember(
      owner = "client!sc",
      name = "jb",
      descriptor = "I"
   )
   private int field5317;
   @OriginalMember(
      owner = "client!sc",
      name = "lb",
      descriptor = "Z"
   )
   public boolean field5266;
   @OriginalMember(
      owner = "client!sc",
      name = "ve",
      descriptor = "[F"
   )
   private float[] field5246;
   @OriginalMember(
      owner = "client!sc",
      name = "le",
      descriptor = "I"
   )
   public int field5280;
   @OriginalMember(
      owner = "client!sc",
      name = "T",
      descriptor = "I"
   )
   private int field5318;
   @OriginalMember(
      owner = "client!sc",
      name = "tg",
      descriptor = "I"
   )
   private int field5284;
   @OriginalMember(
      owner = "client!sc",
      name = "dd",
      descriptor = "Z"
   )
   public boolean field5270;
   @OriginalMember(
      owner = "client!sc",
      name = "cg",
      descriptor = "I"
   )
   public int field5316;
   @OriginalMember(
      owner = "client!sc",
      name = "re",
      descriptor = "I"
   )
   public int field5305;
   @OriginalMember(
      owner = "client!sc",
      name = "ad",
      descriptor = "I"
   )
   public int field5327;
   @OriginalMember(
      owner = "client!sc",
      name = "Ib",
      descriptor = "[F"
   )
   public float[] field5321;
   @OriginalMember(
      owner = "client!sc",
      name = "Me",
      descriptor = "[F"
   )
   private float[] field5314;
   @OriginalMember(
      owner = "client!sc",
      name = "pc",
      descriptor = "I"
   )
   public int field5285;
   @OriginalMember(
      owner = "client!sc",
      name = "xf",
      descriptor = "I"
   )
   private int field5253;
   @OriginalMember(
      owner = "client!sc",
      name = "kg",
      descriptor = "Z"
   )
   private boolean field5310;
   @OriginalMember(
      owner = "client!sc",
      name = "xg",
      descriptor = "Z"
   )
   public boolean field5328;
   @OriginalMember(
      owner = "client!sc",
      name = "Ie",
      descriptor = "F"
   )
   public float field5257;
   @OriginalMember(
      owner = "client!sc",
      name = "id",
      descriptor = "[F"
   )
   private float[] field5312;
   @OriginalMember(
      owner = "client!sc",
      name = "Fd",
      descriptor = "I"
   )
   private int field5251;
   @OriginalMember(
      owner = "client!sc",
      name = "Nf",
      descriptor = "I"
   )
   public int field5326;
   @OriginalMember(
      owner = "client!sc",
      name = "qc",
      descriptor = "I"
   )
   public int field5269;
   @OriginalMember(
      owner = "client!sc",
      name = "xc",
      descriptor = "F"
   )
   public float field5296;
   @OriginalMember(
      owner = "client!sc",
      name = "ud",
      descriptor = "F"
   )
   public float field5243;
   @OriginalMember(
      owner = "client!sc",
      name = "mc",
      descriptor = "I"
   )
   public int field5332;
   @OriginalMember(
      owner = "client!sc",
      name = "de",
      descriptor = "F"
   )
   public float field5322;
   @OriginalMember(
      owner = "client!sc",
      name = "Hf",
      descriptor = "Z"
   )
   private boolean field5304;
   @OriginalMember(
      owner = "client!sc",
      name = "Vd",
      descriptor = "I"
   )
   public int field5331;
   @OriginalMember(
      owner = "client!sc",
      name = "gf",
      descriptor = "[F"
   )
   private float[] field5294;
   @OriginalMember(
      owner = "client!sc",
      name = "kf",
      descriptor = "I"
   )
   public int field5336;
   @OriginalMember(
      owner = "client!sc",
      name = "zg",
      descriptor = "Z"
   )
   public boolean field5335;
   @OriginalMember(
      owner = "client!sc",
      name = "X",
      descriptor = "Z"
   )
   public boolean field5299;
   @OriginalMember(
      owner = "client!sc",
      name = "w",
      descriptor = "Z"
   )
   public boolean field5252;
   @OriginalMember(
      owner = "client!sc",
      name = "Hd",
      descriptor = "I"
   )
   public int field5339;
   @OriginalMember(
      owner = "client!sc",
      name = "pb",
      descriptor = "[F"
   )
   public float[] field5288;
   @OriginalMember(
      owner = "client!sc",
      name = "gc",
      descriptor = "Z"
   )
   private boolean field5282;
   @OriginalMember(
      owner = "client!sc",
      name = "kc",
      descriptor = "Z"
   )
   public boolean field5330;
   @OriginalMember(
      owner = "client!sc",
      name = "U",
      descriptor = "I"
   )
   public int field5275;
   @OriginalMember(
      owner = "client!sc",
      name = "ke",
      descriptor = "I"
   )
   public int field5323;
   @OriginalMember(
      owner = "client!sc",
      name = "kb",
      descriptor = "[F"
   )
   public float[] field5338;
   @OriginalMember(
      owner = "client!sc",
      name = "me",
      descriptor = "F"
   )
   private float field5341;
   @OriginalMember(
      owner = "client!sc",
      name = "vd",
      descriptor = "I"
   )
   private int field5334;
   @OriginalMember(
      owner = "client!sc",
      name = "Mf",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field5261;
   @OriginalMember(
      owner = "client!sc",
      name = "B",
      descriptor = "Lvm;"
   )
   private class716 field5354;
   @OriginalMember(
      owner = "client!sc",
      name = "gg",
      descriptor = "I"
   )
   public int field5289;
   @OriginalMember(
      owner = "client!sc",
      name = "Jc",
      descriptor = "Ljava/awt/Canvas;"
   )
   public Canvas field5089;
   @OriginalMember(
      owner = "client!sc",
      name = "D",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field5138;
   @OriginalMember(
      owner = "client!sc",
      name = "ae",
      descriptor = "Ljava/lang/Object;"
   )
   public Object field5144;
   @OriginalMember(
      owner = "client!sc",
      name = "oc",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field5224;
   @OriginalMember(
      owner = "client!sc",
      name = "mf",
      descriptor = "Lkf;"
   )
   public class266 field5113;
   @OriginalMember(
      owner = "client!sc",
      name = "Kd",
      descriptor = "I"
   )
   public int field5278;
   @OriginalMember(
      owner = "client!sc",
      name = "rc",
      descriptor = "I"
   )
   private int field5095;
   @OriginalMember(
      owner = "client!sc",
      name = "Xd",
      descriptor = "I"
   )
   public int field5100;
   @OriginalMember(
      owner = "client!sc",
      name = "Pb",
      descriptor = "I"
   )
   private int field5062;
   @OriginalMember(
      owner = "client!sc",
      name = "eg",
      descriptor = "I"
   )
   public int field5117;
   @OriginalMember(
      owner = "client!sc",
      name = "Gb",
      descriptor = "Leba;"
   )
   private class615 field5340;
   @OriginalMember(
      owner = "client!sc",
      name = "tb",
      descriptor = "Ljagex3/graphics2/hw/NativeInterface;"
   )
   public NativeInterface field5218;
   @OriginalMember(
      owner = "client!sc",
      name = "Fg",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5367 = new String[]{method2826(method2825("\u000e\u0015\u0016f!U")), method2826(method2825("\u000e\u0015\u0016n!U")), method2826(method2825("\u000e\u0015\u0016d!U")), method2826(method2825("\u0006X\u0016\r\u0015")), method2826(method2825("\u0013\u0003TO")), method2826(method2825("\u000e\u0015\u0016b@")), method2826(method2825("\u000e\u0015\u0016q/U")), method2826(method2825("\u000e\u0015\u0016n\"U")), method2826(method2825("\u000e\u0015\u0016` U")), method2826(method2825("\u000e\u0015\u0016h!U")), method2826(method2825("\u000e\u0015\u0016j\"U")), method2826(method2825("\u000e\u0015\u0016f.U")), method2826(method2825("\u000e\u0015\u0016h/U")), method2826(method2825("\u000e\u0015\u0016y)U")), method2826(method2825("\u000e\u0015\u0016k\"U")), method2826(method2825("\u000e\u0015\u0016h U")), method2826(method2825("\u000e\u0015\u0016s@")), method2826(method2825("\u000e\u0015\u0016Y\tU")), method2826(method2825("\u000e\u0015\u0016k/U")), method2826(method2825("\u000e\u0015\u0016`!U")), method2826(method2825("\u000e\u0015\u0016a\"U")), method2826(method2825("\u000e\u0015\u0016a U")), method2826(method2825("\u000e\u0015\u0016l!U")), method2826(method2825("\u000e\u0015\u0016h.U")), method2826(method2825("\u000e\u0015\u0016m\"U")), method2826(method2825("\u000e\u0015\u0016n.U")), method2826(method2825("\u000e\u0015\u0016k U")), method2826(method2825("\u000e\u0015\u0016b.U")), method2826(method2825("\u000e\u0015\u0016j!U")), method2826(method2825("\u000e\u0015\u0016m U")), method2826(method2825("\u000e\u0015\u0016`.U")), method2826(method2825("\u000e\u0015\u0016t U")), method2826(method2825("\u000e\u0015\u0016l/U")), method2826(method2825("\u000e\u0015\u0016\u001f\u0001\u0013\u001fL\u001d@")), method2826(method2825("\u000e\u0015\u0016r/U")), method2826(method2825("\u000e\u0015\u0016v!U")), method2826(method2825("\u000e\u0015\u0016h*U")), method2826(method2825("\u000e\u0015\u0016t-U")), method2826(method2825("\u000e\u0015\u0016n@")), method2826(method2825("\u000e\u0015\u0016E@")), method2826(method2825("\u000e\u0015\u0016s.U")), method2826(method2825("\u000e\u0015\u0016u.U")), method2826(method2825("\u000e\u0015\u0016n/U")), method2826(method2825("\u000e\u0015\u0016o.U")), method2826(method2825("\u000e\u0015\u0016w/U")), method2826(method2825("\u000e\u0015\u0016k@")), method2826(method2825("\u000e\u0015\u0016o-U")), method2826(method2825("\u000e\u0015\u0016J@")), method2826(method2825("\u000e\u0015\u0016[\tU")), method2826(method2825("\u000e\u0015\u0016o@")), method2826(method2825("\u000e\u0015\u0016m/U")), method2826(method2825("\u000e\u0015\u0016o U")), method2826(method2825("\u000e\u0015\u0016f-U")), method2826(method2825("\u000e\u0015\u0016u U")), method2826(method2825("\u000e\u0015\u0016b!U")), method2826(method2825("\u000e\u0015\u0016e.U")), method2826(method2825("\u000e\u0015\u0016d\"U")), method2826(method2825("\u000e\u0015\u0016i-U")), method2826(method2825("\u000e\u0015\u0016d/U")), method2826(method2825("\u000e\u0015\u0016q U")), method2826(method2825("\u000e\u0015\u0016h@")), method2826(method2825("\u000e\u0015\u0016t!U")), method2826(method2825("\u000e\u0015\u0016Q\tU")), method2826(method2825("\u000e\u0015\u0016r!U")), method2826(method2825("\u000e\u0015\u0016g-U")), method2826(method2825("\u0012\u0006]M\u0002\u000e")), method2826(method2825("\u000e\u0015\u0016i!U")), method2826(method2825("\u000e\u0015\u0016l U")), method2826(method2825("\u000e\u0015\u0016l.U")), method2826(method2825("\u000e\u0015\u0016o\"U")), method2826(method2825("\u000e\u0015\u0016f@")), method2826(method2825("\u000e\u0015\u0016b/U")), method2826(method2825("\u000e\u0015\u0016t/U")), method2826(method2825("\u000e\u0015\u0016w@")), method2826(method2825("\u000e\u0015\u0016r\"U")), method2826(method2825("\u000e\u0015\u0016g\"U")), method2826(method2825("\u000e\u0015\u0016u/U")), method2826(method2825("\u000e\u0015\u0016b-U")), method2826(method2825("\u000e\u0015\u0016u!U")), method2826(method2825("\u000e\u0015\u0016p/U")), method2826(method2825("\u000e\u0015\u0016s!U")), method2826(method2825("\u000e\u0015\u0016w-U")), method2826(method2825("\u000e\u0015\u0016d U")), method2826(method2825("\u000e\u0015\u0016l,U")), method2826(method2825("\u000e\u0015\u0016e U")), method2826(method2825("\u000e\u0015\u0016q-U")), method2826(method2825("\u000e\u0015\u0016s/U")), method2826(method2825("\u0017\u0017NBF\u001c\u0001L\r+\u001c\u0018NB\u001b")), method2826(method2825("\u000e\u0013Lj\u000f\u0013\u0019JF:\u0018\u0006YJ\u0006\t")), method2826(method2825("\u000e\u0015\u0016i U")), method2826(method2825("\u000e\u0015\u0016m!U")), method2826(method2825("\u000e\u0015\u0016B\tU")), method2826(method2825("\u000e\u0015\u0016v U")), method2826(method2825("\u000e\u0015\u0016e\"U")), method2826(method2825("\u000e\u0015\u0016q\"U")), method2826(method2825("\u000e\u0015\u0016f/U")), method2826(method2825("\u000e\u0015\u0016o!U")), method2826(method2825("\u000e\u0015\u0016j-U")), method2826(method2825("\u000e\u0015\u0016h\"U")), method2826(method2825("\u000e\u0015\u0016v/U")), method2826(method2825("\u000e\u0015\u0016p-U")), method2826(method2825("\u000e\u0015\u0016`\"U")), method2826(method2825("\u000e\u0015\u0016s-U")), method2826(method2825("\u000e\u0015\u0016o/U")), method2826(method2825("\u000e\u0015\u0016k.U")), method2826(method2825("\u000e\u0015\u0016p U")), method2826(method2825("\u000e\u0015\u0016G\tU")), method2826(method2825("\u000e\u0015\u0016t.U")), method2826(method2825("\u000e\u0015\u0016`+U")), method2826(method2825("\u000e\u0015\u0016j U")), method2826(method2825("\u000e\u0015\u0016q.U")), method2826(method2825("\u000e\u0015\u0016s U")), method2826(method2825("\u000e\u0015\u0016e-U")), method2826(method2825("\u000e\u0015\u0016d.U")), method2826(method2825("\u000e\u0015\u0016O\tU")), method2826(method2825("\u000e\u0015\u0016e!U")), method2826(method2825("\u000e\u0015\u0016i)U")), method2826(method2825("\u000e\u0015\u0016w.U")), method2826(method2825("\u000e\u0015\u0016w U")), method2826(method2825("\u000e\u0015\u0016m*U")), method2826(method2825("\u000e\u0015\u0016j.U")), method2826(method2825("\u000e\u0015\u0016a!U")), method2826(method2825("\u000e\u0015\u0016u,U")), method2826(method2825("\u000e\u0015\u0016b\"U")), method2826(method2825("\u000e\u0015\u0016r.U")), method2826(method2825("\u000e\u0015\u0016g)U")), method2826(method2825("\u000e\u0015\u0016n-U")), method2826(method2825("\u000e\u0015\u0016a.U")), method2826(method2825("\u000e\u0015\u0016f\"U")), method2826(method2825("\u000e\u0015\u0016u@")), method2826(method2825("\u000e\u0015\u0016m.U")), method2826(method2825("\u000e\u0015\u0016l\"U")), method2826(method2825("\u000e\u0015\u0016w\"U")), method2826(method2825("\u000e\u0015\u0016i\"U")), method2826(method2825("\u000e\u0015\u0016`@")), method2826(method2825("\u000e\u0015\u0016i/U")), method2826(method2825("\u000e\u0015\u0016q!U")), method2826(method2825("\u000e\u0015\u0016d-U")), method2826(method2825("\u000e\u0015\u0016w!U")), method2826(method2825("\u000e\u0015\u0016h-U")), method2826(method2825("\u000e\u0015\u0016e/U")), method2826(method2825("\u000e\u0015\u0016p!U")), method2826(method2825("\u000e\u0015\u0016r U")), method2826(method2825("\u000e\u0015\u0016k)U")), method2826(method2825("\u000e\u0015\u0016f)U")), method2826(method2825("\u000e\u0015\u0016r-U")), method2826(method2825("\u000e\u0015\u0016v.U")), method2826(method2825("\u000e\u0015\u0016v,U")), method2826(method2825("\u000e\u0015\u0016v-U")), method2826(method2825("\u000e\u0015\u0016u-U")), method2826(method2825("\u000e\u0015\u0016h)U")), method2826(method2825("\u000e\u0015\u0016v@")), method2826(method2825("\u000e\u0015\u0016n U")), method2826(method2825("\u000e\u0015\u0016k!U")), method2826(method2825("\u000e\u0015\u0016`-U")), method2826(method2825("\u000e\u0015\u0016{)U")), method2826(method2825("\u000e\u0015\u0016{@")), method2826(method2825("\u000e\u0015\u0016m-U")), method2826(method2825("\u000e\u0015\u0016s\"U")), method2826(method2825("\u000e\u0015\u0016`/U")), method2826(method2825("\u000e\u0015\u0016k-U")), method2826(method2825("\u000e\u0015\u0016g/U")), method2826(method2825("\u000e\u0015\u0016j/U")), method2826(method2825("\u000e\u0015\u0016l-U")), method2826(method2825("\u000e\u0015\u0016g.U")), method2826(method2825("\u000e\u0015\u0016p\"U")), method2826(method2825("\u000e\u0015\u0016a-U")), method2826(method2825("\u000e\u0015\u0016g!U")), method2826(method2825("\u000e\u0015\u0016p.U")), method2826(method2825("\u000e\u0015\u0016f U")), method2826(method2825("\u000e\u0015\u0016t,U")), method2826(method2825("\u000e\u0015\u0016g U")), method2826(method2825("\u000e\u0015\u0016a/U")), method2826(method2825("\u000e\u0015\u0016b U")), method2826(method2825("\u000e\u0015\u0016Q@")), method2826(method2825("\u000e\u0015\u0016z@")), method2826(method2825("\u000e\u0015\u0016r@")), method2826(method2825("\u000e\u0015\u0016S\tU")), method2826(method2825("\u000e\u0015\u0016i.U"))};
   @OriginalMember(
      owner = "client!sc",
      name = "z",
      descriptor = "[I"
   )
   public static int[] field5086 = new int[1000];
   @OriginalMember(
      owner = "client!sc",
      name = "yc",
      descriptor = "Z"
   )
   public static boolean field5219 = false;
   @OriginalMember(
      owner = "client!sc",
      name = "sg",
      descriptor = "F"
   )
   public float field5245;
   @OriginalMember(
      owner = "client!sc",
      name = "We",
      descriptor = "F"
   )
   public float field5247;
   @OriginalMember(
      owner = "client!sc",
      name = "bg",
      descriptor = "F"
   )
   private float field5272;
   @OriginalMember(
      owner = "client!sc",
      name = "Vc",
      descriptor = "F"
   )
   public float field5293;
   @OriginalMember(
      owner = "client!sc",
      name = "Od",
      descriptor = "F"
   )
   public float field5297;
   @OriginalMember(
      owner = "client!sc",
      name = "fd",
      descriptor = "F"
   )
   private float field5303;
   @OriginalMember(
      owner = "client!sc",
      name = "lc",
      descriptor = "F"
   )
   public float field5313;
   @OriginalMember(
      owner = "client!sc",
      name = "Wd",
      descriptor = "F"
   )
   public float field5319;
   @OriginalMember(
      owner = "client!sc",
      name = "gd",
      descriptor = "I"
   )
   public static int field5042;
   @OriginalMember(
      owner = "client!sc",
      name = "Pe",
      descriptor = "I"
   )
   public static int field5043;
   @OriginalMember(
      owner = "client!sc",
      name = "se",
      descriptor = "I"
   )
   public static int field5044;
   @OriginalMember(
      owner = "client!sc",
      name = "Se",
      descriptor = "I"
   )
   public static int field5045;
   @OriginalMember(
      owner = "client!sc",
      name = "xb",
      descriptor = "I"
   )
   public static int field5046;
   @OriginalMember(
      owner = "client!sc",
      name = "Cf",
      descriptor = "I"
   )
   public static int field5047;
   @OriginalMember(
      owner = "client!sc",
      name = "rf",
      descriptor = "I"
   )
   public static int field5048;
   @OriginalMember(
      owner = "client!sc",
      name = "Md",
      descriptor = "I"
   )
   public static int field5049;
   @OriginalMember(
      owner = "client!sc",
      name = "Rf",
      descriptor = "I"
   )
   public static int field5050;
   @OriginalMember(
      owner = "client!sc",
      name = "vf",
      descriptor = "I"
   )
   public static int field5051;
   @OriginalMember(
      owner = "client!sc",
      name = "V",
      descriptor = "I"
   )
   public static int field5052;
   @OriginalMember(
      owner = "client!sc",
      name = "Af",
      descriptor = "I"
   )
   public static int field5053;
   @OriginalMember(
      owner = "client!sc",
      name = "Tc",
      descriptor = "I"
   )
   public static int field5054;
   @OriginalMember(
      owner = "client!sc",
      name = "Ed",
      descriptor = "I"
   )
   public static int field5055;
   @OriginalMember(
      owner = "client!sc",
      name = "t",
      descriptor = "I"
   )
   public static int field5057;
   @OriginalMember(
      owner = "client!sc",
      name = "lg",
      descriptor = "I"
   )
   public static int field5058;
   @OriginalMember(
      owner = "client!sc",
      name = "Re",
      descriptor = "I"
   )
   public static int field5059;
   @OriginalMember(
      owner = "client!sc",
      name = "u",
      descriptor = "I"
   )
   public static int field5060;
   @OriginalMember(
      owner = "client!sc",
      name = "ld",
      descriptor = "I"
   )
   public static int field5061;
   @OriginalMember(
      owner = "client!sc",
      name = "md",
      descriptor = "I"
   )
   public static int field5063;
   @OriginalMember(
      owner = "client!sc",
      name = "cb",
      descriptor = "I"
   )
   public static int field5064;
   @OriginalMember(
      owner = "client!sc",
      name = "I",
      descriptor = "I"
   )
   public static int field5065;
   @OriginalMember(
      owner = "client!sc",
      name = "Of",
      descriptor = "I"
   )
   public static int field5066;
   @OriginalMember(
      owner = "client!sc",
      name = "vg",
      descriptor = "I"
   )
   public static int field5067;
   @OriginalMember(
      owner = "client!sc",
      name = "Zd",
      descriptor = "I"
   )
   public static int field5068;
   @OriginalMember(
      owner = "client!sc",
      name = "jg",
      descriptor = "I"
   )
   public static int field5069;
   @OriginalMember(
      owner = "client!sc",
      name = "sb",
      descriptor = "I"
   )
   public static int field5070;
   @OriginalMember(
      owner = "client!sc",
      name = "Df",
      descriptor = "I"
   )
   public static int field5071;
   @OriginalMember(
      owner = "client!sc",
      name = "If",
      descriptor = "I"
   )
   public static int field5072;
   @OriginalMember(
      owner = "client!sc",
      name = "kd",
      descriptor = "I"
   )
   public static int field5073;
   @OriginalMember(
      owner = "client!sc",
      name = "Mc",
      descriptor = "I"
   )
   public static int field5074;
   @OriginalMember(
      owner = "client!sc",
      name = "Uc",
      descriptor = "I"
   )
   public static int field5075;
   @OriginalMember(
      owner = "client!sc",
      name = "Pf",
      descriptor = "I"
   )
   public static int field5076;
   @OriginalMember(
      owner = "client!sc",
      name = "A",
      descriptor = "I"
   )
   public static int field5077;
   @OriginalMember(
      owner = "client!sc",
      name = "fg",
      descriptor = "I"
   )
   public static int field5078;
   @OriginalMember(
      owner = "client!sc",
      name = "C",
      descriptor = "I"
   )
   public static int field5079;
   @OriginalMember(
      owner = "client!sc",
      name = "F",
      descriptor = "I"
   )
   public static int field5080;
   @OriginalMember(
      owner = "client!sc",
      name = "Xb",
      descriptor = "I"
   )
   public static int field5081;
   @OriginalMember(
      owner = "client!sc",
      name = "R",
      descriptor = "I"
   )
   public static int field5082;
   @OriginalMember(
      owner = "client!sc",
      name = "qb",
      descriptor = "I"
   )
   public static int field5083;
   @OriginalMember(
      owner = "client!sc",
      name = "cd",
      descriptor = "I"
   )
   public static int field5084;
   @OriginalMember(
      owner = "client!sc",
      name = "Ab",
      descriptor = "I"
   )
   public static int field5085;
   @OriginalMember(
      owner = "client!sc",
      name = "Gd",
      descriptor = "I"
   )
   public static int field5087;
   @OriginalMember(
      owner = "client!sc",
      name = "v",
      descriptor = "I"
   )
   public static int field5088;
   @OriginalMember(
      owner = "client!sc",
      name = "Yf",
      descriptor = "I"
   )
   public static int field5090;
   @OriginalMember(
      owner = "client!sc",
      name = "Rb",
      descriptor = "I"
   )
   public static int field5091;
   @OriginalMember(
      owner = "client!sc",
      name = "yd",
      descriptor = "I"
   )
   public static int field5092;
   @OriginalMember(
      owner = "client!sc",
      name = "bc",
      descriptor = "I"
   )
   public static int field5093;
   @OriginalMember(
      owner = "client!sc",
      name = "ib",
      descriptor = "I"
   )
   public static int field5094;
   @OriginalMember(
      owner = "client!sc",
      name = "Ke",
      descriptor = "I"
   )
   public static int field5096;
   @OriginalMember(
      owner = "client!sc",
      name = "P",
      descriptor = "I"
   )
   public static int field5097;
   @OriginalMember(
      owner = "client!sc",
      name = "Td",
      descriptor = "I"
   )
   public static int field5098;
   @OriginalMember(
      owner = "client!sc",
      name = "Yc",
      descriptor = "I"
   )
   public static int field5099;
   @OriginalMember(
      owner = "client!sc",
      name = "Nc",
      descriptor = "I"
   )
   public static int field5101;
   @OriginalMember(
      owner = "client!sc",
      name = "Gc",
      descriptor = "I"
   )
   public static int field5102;
   @OriginalMember(
      owner = "client!sc",
      name = "pe",
      descriptor = "I"
   )
   public static int field5103;
   @OriginalMember(
      owner = "client!sc",
      name = "td",
      descriptor = "I"
   )
   public static int field5104;
   @OriginalMember(
      owner = "client!sc",
      name = "wc",
      descriptor = "I"
   )
   public static int field5105;
   @OriginalMember(
      owner = "client!sc",
      name = "Vb",
      descriptor = "I"
   )
   public static int field5106;
   @OriginalMember(
      owner = "client!sc",
      name = "Eb",
      descriptor = "I"
   )
   public static int field5107;
   @OriginalMember(
      owner = "client!sc",
      name = "Qf",
      descriptor = "I"
   )
   public static int field5108;
   @OriginalMember(
      owner = "client!sc",
      name = "rg",
      descriptor = "I"
   )
   public static int field5109;
   @OriginalMember(
      owner = "client!sc",
      name = "Pc",
      descriptor = "I"
   )
   public static int field5110;
   @OriginalMember(
      owner = "client!sc",
      name = "qd",
      descriptor = "I"
   )
   public static int field5111;
   @OriginalMember(
      owner = "client!sc",
      name = "qe",
      descriptor = "I"
   )
   public static int field5112;
   @OriginalMember(
      owner = "client!sc",
      name = "s",
      descriptor = "I"
   )
   public static int field5114;
   @OriginalMember(
      owner = "client!sc",
      name = "tc",
      descriptor = "I"
   )
   public static int field5115;
   @OriginalMember(
      owner = "client!sc",
      name = "df",
      descriptor = "I"
   )
   public static int field5116;
   @OriginalMember(
      owner = "client!sc",
      name = "Ud",
      descriptor = "I"
   )
   public static int field5118;
   @OriginalMember(
      owner = "client!sc",
      name = "Cd",
      descriptor = "I"
   )
   public static int field5119;
   @OriginalMember(
      owner = "client!sc",
      name = "Rc",
      descriptor = "I"
   )
   public static int field5120;
   @OriginalMember(
      owner = "client!sc",
      name = "wf",
      descriptor = "I"
   )
   public static int field5121;
   @OriginalMember(
      owner = "client!sc",
      name = "J",
      descriptor = "I"
   )
   public static int field5122;
   @OriginalMember(
      owner = "client!sc",
      name = "he",
      descriptor = "I"
   )
   public static int field5123;
   @OriginalMember(
      owner = "client!sc",
      name = "zd",
      descriptor = "I"
   )
   public static int field5124;
   @OriginalMember(
      owner = "client!sc",
      name = "ag",
      descriptor = "I"
   )
   public static int field5126;
   @OriginalMember(
      owner = "client!sc",
      name = "ec",
      descriptor = "I"
   )
   public static int field5127;
   @OriginalMember(
      owner = "client!sc",
      name = "bf",
      descriptor = "I"
   )
   public static int field5128;
   @OriginalMember(
      owner = "client!sc",
      name = "te",
      descriptor = "I"
   )
   public static int field5129;
   @OriginalMember(
      owner = "client!sc",
      name = "Zf",
      descriptor = "I"
   )
   public static int field5131;
   @OriginalMember(
      owner = "client!sc",
      name = "Bc",
      descriptor = "I"
   )
   public static int field5132;
   @OriginalMember(
      owner = "client!sc",
      name = "gb",
      descriptor = "I"
   )
   public static int field5133;
   @OriginalMember(
      owner = "client!sc",
      name = "jc",
      descriptor = "I"
   )
   public static int field5134;
   @OriginalMember(
      owner = "client!sc",
      name = "cc",
      descriptor = "I"
   )
   public static int field5135;
   @OriginalMember(
      owner = "client!sc",
      name = "ye",
      descriptor = "I"
   )
   public static int field5136;
   @OriginalMember(
      owner = "client!sc",
      name = "Id",
      descriptor = "I"
   )
   public static int field5137;
   @OriginalMember(
      owner = "client!sc",
      name = "pf",
      descriptor = "I"
   )
   public static int field5139;
   @OriginalMember(
      owner = "client!sc",
      name = "O",
      descriptor = "I"
   )
   public static int field5140;
   @OriginalMember(
      owner = "client!sc",
      name = "je",
      descriptor = "I"
   )
   public static int field5141;
   @OriginalMember(
      owner = "client!sc",
      name = "Te",
      descriptor = "I"
   )
   public static int field5142;
   @OriginalMember(
      owner = "client!sc",
      name = "ug",
      descriptor = "I"
   )
   public static int field5143;
   @OriginalMember(
      owner = "client!sc",
      name = "K",
      descriptor = "I"
   )
   public static int field5145;
   @OriginalMember(
      owner = "client!sc",
      name = "Qb",
      descriptor = "I"
   )
   public static int field5146;
   @OriginalMember(
      owner = "client!sc",
      name = "we",
      descriptor = "I"
   )
   public static int field5147;
   @OriginalMember(
      owner = "client!sc",
      name = "Bf",
      descriptor = "I"
   )
   public static int field5148;
   @OriginalMember(
      owner = "client!sc",
      name = "tf",
      descriptor = "I"
   )
   public static int field5149;
   @OriginalMember(
      owner = "client!sc",
      name = "Zc",
      descriptor = "I"
   )
   public static int field5150;
   @OriginalMember(
      owner = "client!sc",
      name = "rb",
      descriptor = "I"
   )
   public static int field5151;
   @OriginalMember(
      owner = "client!sc",
      name = "Ef",
      descriptor = "I"
   )
   public static int field5152;
   @OriginalMember(
      owner = "client!sc",
      name = "Je",
      descriptor = "I"
   )
   public static int field5153;
   @OriginalMember(
      owner = "client!sc",
      name = "wb",
      descriptor = "I"
   )
   public static int field5154;
   @OriginalMember(
      owner = "client!sc",
      name = "pg",
      descriptor = "I"
   )
   public static int field5155;
   @OriginalMember(
      owner = "client!sc",
      name = "ff",
      descriptor = "I"
   )
   public static int field5156;
   @OriginalMember(
      owner = "client!sc",
      name = "nb",
      descriptor = "I"
   )
   public static int field5157;
   @OriginalMember(
      owner = "client!sc",
      name = "Vf",
      descriptor = "I"
   )
   public static int field5158;
   @OriginalMember(
      owner = "client!sc",
      name = "Z",
      descriptor = "I"
   )
   public static int field5159;
   @OriginalMember(
      owner = "client!sc",
      name = "ic",
      descriptor = "I"
   )
   public static int field5160;
   @OriginalMember(
      owner = "client!sc",
      name = "cf",
      descriptor = "I"
   )
   public static int field5161;
   @OriginalMember(
      owner = "client!sc",
      name = "Ld",
      descriptor = "I"
   )
   public static int field5162;
   @OriginalMember(
      owner = "client!sc",
      name = "G",
      descriptor = "I"
   )
   public static int field5163;
   @OriginalMember(
      owner = "client!sc",
      name = "of",
      descriptor = "I"
   )
   public static int field5164;
   @OriginalMember(
      owner = "client!sc",
      name = "be",
      descriptor = "I"
   )
   public static int field5165;
   @OriginalMember(
      owner = "client!sc",
      name = "Lb",
      descriptor = "I"
   )
   public static int field5166;
   @OriginalMember(
      owner = "client!sc",
      name = "Le",
      descriptor = "I"
   )
   public static int field5167;
   @OriginalMember(
      owner = "client!sc",
      name = "ub",
      descriptor = "I"
   )
   public static int field5168;
   @OriginalMember(
      owner = "client!sc",
      name = "ze",
      descriptor = "I"
   )
   public static int field5169;
   @OriginalMember(
      owner = "client!sc",
      name = "M",
      descriptor = "I"
   )
   public static int field5170;
   @OriginalMember(
      owner = "client!sc",
      name = "Ec",
      descriptor = "I"
   )
   public static int field5171;
   @OriginalMember(
      owner = "client!sc",
      name = "Sd",
      descriptor = "I"
   )
   public static int field5172;
   @OriginalMember(
      owner = "client!sc",
      name = "fe",
      descriptor = "I"
   )
   public static int field5173;
   @OriginalMember(
      owner = "client!sc",
      name = "Ve",
      descriptor = "I"
   )
   public static int field5174;
   @OriginalMember(
      owner = "client!sc",
      name = "Tb",
      descriptor = "I"
   )
   public static int field5175;
   @OriginalMember(
      owner = "client!sc",
      name = "Kf",
      descriptor = "I"
   )
   public static int field5176;
   @OriginalMember(
      owner = "client!sc",
      name = "yb",
      descriptor = "I"
   )
   public static int field5177;
   @OriginalMember(
      owner = "client!sc",
      name = "He",
      descriptor = "I"
   )
   public static int field5178;
   @OriginalMember(
      owner = "client!sc",
      name = "ce",
      descriptor = "I"
   )
   public static int field5180;
   @OriginalMember(
      owner = "client!sc",
      name = "Hc",
      descriptor = "I"
   )
   public static int field5181;
   @OriginalMember(
      owner = "client!sc",
      name = "Ac",
      descriptor = "I"
   )
   public static int field5182;
   @OriginalMember(
      owner = "client!sc",
      name = "Ff",
      descriptor = "I"
   )
   public static int field5183;
   @OriginalMember(
      owner = "client!sc",
      name = "uf",
      descriptor = "I"
   )
   public static int field5184;
   @OriginalMember(
      owner = "client!sc",
      name = "zf",
      descriptor = "I"
   )
   public static int field5185;
   @OriginalMember(
      owner = "client!sc",
      name = "Fc",
      descriptor = "I"
   )
   public static int field5186;
   @OriginalMember(
      owner = "client!sc",
      name = "nd",
      descriptor = "I"
   )
   public static int field5187;
   @OriginalMember(
      owner = "client!sc",
      name = "Lf",
      descriptor = "I"
   )
   public static int field5188;
   @OriginalMember(
      owner = "client!sc",
      name = "Jf",
      descriptor = "I"
   )
   public static int field5189;
   @OriginalMember(
      owner = "client!sc",
      name = "og",
      descriptor = "I"
   )
   public static int field5190;
   @OriginalMember(
      owner = "client!sc",
      name = "Wb",
      descriptor = "I"
   )
   public static int field5191;
   @OriginalMember(
      owner = "client!sc",
      name = "Xc",
      descriptor = "I"
   )
   public static int field5192;
   @OriginalMember(
      owner = "client!sc",
      name = "Oc",
      descriptor = "I"
   )
   public static int field5193;
   @OriginalMember(
      owner = "client!sc",
      name = "qf",
      descriptor = "I"
   )
   public static int field5194;
   @OriginalMember(
      owner = "client!sc",
      name = "Ae",
      descriptor = "I"
   )
   public static int field5195;
   @OriginalMember(
      owner = "client!sc",
      name = "Kc",
      descriptor = "I"
   )
   public static int field5196;
   @OriginalMember(
      owner = "client!sc",
      name = "dg",
      descriptor = "I"
   )
   public static int field5197;
   @OriginalMember(
      owner = "client!sc",
      name = "Ne",
      descriptor = "I"
   )
   public static int field5198;
   @OriginalMember(
      owner = "client!sc",
      name = "Xf",
      descriptor = "I"
   )
   public static int field5199;
   @OriginalMember(
      owner = "client!sc",
      name = "od",
      descriptor = "I"
   )
   public static int field5200;
   @OriginalMember(
      owner = "client!sc",
      name = "Fe",
      descriptor = "I"
   )
   public static int field5201;
   @OriginalMember(
      owner = "client!sc",
      name = "fb",
      descriptor = "I"
   )
   public static int field5202;
   @OriginalMember(
      owner = "client!sc",
      name = "Zb",
      descriptor = "I"
   )
   public static int field5203;
   @OriginalMember(
      owner = "client!sc",
      name = "nf",
      descriptor = "I"
   )
   public static int field5204;
   @OriginalMember(
      owner = "client!sc",
      name = "hd",
      descriptor = "I"
   )
   public static int field5205;
   @OriginalMember(
      owner = "client!sc",
      name = "Ad",
      descriptor = "I"
   )
   public static int field5206;
   @OriginalMember(
      owner = "client!sc",
      name = "Be",
      descriptor = "I"
   )
   public static int field5207;
   @OriginalMember(
      owner = "client!sc",
      name = "sf",
      descriptor = "I"
   )
   public static int field5208;
   @OriginalMember(
      owner = "client!sc",
      name = "bd",
      descriptor = "I"
   )
   public static int field5209;
   @OriginalMember(
      owner = "client!sc",
      name = "fc",
      descriptor = "I"
   )
   public static int field5210;
   @OriginalMember(
      owner = "client!sc",
      name = "rd",
      descriptor = "I"
   )
   public static int field5211;
   @OriginalMember(
      owner = "client!sc",
      name = "Wf",
      descriptor = "I"
   )
   public static int field5212;
   @OriginalMember(
      owner = "client!sc",
      name = "Ye",
      descriptor = "I"
   )
   public static int field5213;
   @OriginalMember(
      owner = "client!sc",
      name = "y",
      descriptor = "I"
   )
   public static int field5214;
   @OriginalMember(
      owner = "client!sc",
      name = "Ub",
      descriptor = "I"
   )
   public static int field5215;
   @OriginalMember(
      owner = "client!sc",
      name = "Hb",
      descriptor = "I"
   )
   public static int field5216;
   @OriginalMember(
      owner = "client!sc",
      name = "Cb",
      descriptor = "I"
   )
   public static int field5217;
   @OriginalMember(
      owner = "client!sc",
      name = "yf",
      descriptor = "I"
   )
   public static int field5220;
   @OriginalMember(
      owner = "client!sc",
      name = "Gf",
      descriptor = "I"
   )
   public static int field5221;
   @OriginalMember(
      owner = "client!sc",
      name = "lf",
      descriptor = "I"
   )
   public static int field5222;
   @OriginalMember(
      owner = "client!sc",
      name = "mg",
      descriptor = "I"
   )
   public static int field5223;
   @OriginalMember(
      owner = "client!sc",
      name = "N",
      descriptor = "I"
   )
   public static int field5225;
   @OriginalMember(
      owner = "client!sc",
      name = "jf",
      descriptor = "I"
   )
   public static int field5226;
   @OriginalMember(
      owner = "client!sc",
      name = "Xe",
      descriptor = "I"
   )
   public static int field5228;
   @OriginalMember(
      owner = "client!sc",
      name = "ge",
      descriptor = "I"
   )
   public static int field5229;
   @OriginalMember(
      owner = "client!sc",
      name = "r",
      descriptor = "I"
   )
   public static int field5230;
   @OriginalMember(
      owner = "client!sc",
      name = "Sf",
      descriptor = "I"
   )
   public int field5231;
   @OriginalMember(
      owner = "client!sc",
      name = "Ic",
      descriptor = "I"
   )
   public int field5232;
   @OriginalMember(
      owner = "client!sc",
      name = "Pd",
      descriptor = "I"
   )
   public static int field5233;
   @OriginalMember(
      owner = "client!sc",
      name = "Tf",
      descriptor = "I"
   )
   public int field5234;
   @OriginalMember(
      owner = "client!sc",
      name = "Sb",
      descriptor = "I"
   )
   public int field5250;
   @OriginalMember(
      owner = "client!sc",
      name = "ef",
      descriptor = "I"
   )
   public int field5256;
   @OriginalMember(
      owner = "client!sc",
      name = "Ob",
      descriptor = "I"
   )
   public int field5267;
   @OriginalMember(
      owner = "client!sc",
      name = "Jd",
      descriptor = "I"
   )
   public int field5290;
   @OriginalMember(
      owner = "client!sc",
      name = "Wc",
      descriptor = "I"
   )
   public int field5291;
   @OriginalMember(
      owner = "client!sc",
      name = "Ge",
      descriptor = "I"
   )
   private int field5295;
   @OriginalMember(
      owner = "client!sc",
      name = "Uf",
      descriptor = "I"
   )
   public int field5300;
   @OriginalMember(
      owner = "client!sc",
      name = "Nb",
      descriptor = "I"
   )
   public int field5301;
   @OriginalMember(
      owner = "client!sc",
      name = "yg",
      descriptor = "I"
   )
   public int field5307;
   @OriginalMember(
      owner = "client!sc",
      name = "Nd",
      descriptor = "I"
   )
   private int field5320;
   @OriginalMember(
      owner = "client!sc",
      name = "Db",
      descriptor = "I"
   )
   private int field5365;
   @OriginalMember(
      owner = "client!sc",
      name = "peer",
      descriptor = "J"
   )
   public long peer;
   @OriginalMember(
      owner = "client!sc",
      name = "Qe",
      descriptor = "Lhh;"
   )
   private class141 field5337;
   @OriginalMember(
      owner = "client!sc",
      name = "Bb",
      descriptor = "Lcg;"
   )
   public class149 field5344;
   @OriginalMember(
      owner = "client!sc",
      name = "Mb",
      descriptor = "Lcg;"
   )
   public class149 field5347;
   @OriginalMember(
      owner = "client!sc",
      name = "W",
      descriptor = "Lcg;"
   )
   public class149 field5349;
   @OriginalMember(
      owner = "client!sc",
      name = "Kb",
      descriptor = "Lcg;"
   )
   public class149 field5351;
   @OriginalMember(
      owner = "client!sc",
      name = "Y",
      descriptor = "Lcg;"
   )
   public class149 field5353;
   @OriginalMember(
      owner = "client!sc",
      name = "Oe",
      descriptor = "Lcg;"
   )
   public class149 field5356;
   @OriginalMember(
      owner = "client!sc",
      name = "Bd",
      descriptor = "Lcg;"
   )
   public class149 field5357;
   @OriginalMember(
      owner = "client!sc",
      name = "De",
      descriptor = "Lcg;"
   )
   public class149 field5359;
   @OriginalMember(
      owner = "client!sc",
      name = "hg",
      descriptor = "Lcg;"
   )
   public class149 field5362;
   @OriginalMember(
      owner = "client!sc",
      name = "zc",
      descriptor = "Lcg;"
   )
   public class149 field5364;
   @OriginalMember(
      owner = "client!sc",
      name = "Yd",
      descriptor = "Laq;"
   )
   public class172 field5227;
   @OriginalMember(
      owner = "client!sc",
      name = "Rd",
      descriptor = "Lm;"
   )
   public class205 field5259;
   @OriginalMember(
      owner = "client!sc",
      name = "ee",
      descriptor = "Lqja;"
   )
   private class328 field5277;
   @OriginalMember(
      owner = "client!sc",
      name = "eb",
      descriptor = "Loka;"
   )
   private class384 field5268;
   @OriginalMember(
      owner = "client!sc",
      name = "Dd",
      descriptor = "Lbk;"
   )
   private class398 field5343;
   @OriginalMember(
      owner = "client!sc",
      name = "Lc",
      descriptor = "Lbk;"
   )
   private class398 field5348;
   @OriginalMember(
      owner = "client!sc",
      name = "pd",
      descriptor = "Lbk;"
   )
   private class398 field5350;
   @OriginalMember(
      owner = "client!sc",
      name = "ed",
      descriptor = "Lbr;"
   )
   public class418 field5346;
   @OriginalMember(
      owner = "client!sc",
      name = "wd",
      descriptor = "Lbr;"
   )
   public class418 field5352;
   @OriginalMember(
      owner = "client!sc",
      name = "vc",
      descriptor = "Lbr;"
   )
   public class418 field5355;
   @OriginalMember(
      owner = "client!sc",
      name = "Cc",
      descriptor = "Lbr;"
   )
   private class418 field5358;
   @OriginalMember(
      owner = "client!sc",
      name = "Ee",
      descriptor = "Lbr;"
   )
   public class418 field5360;
   @OriginalMember(
      owner = "client!sc",
      name = "H",
      descriptor = "Lbr;"
   )
   private class418 field5361;
   @OriginalMember(
      owner = "client!sc",
      name = "hf",
      descriptor = "Lbr;"
   )
   private class418 field5363;
   @OriginalMember(
      owner = "client!sc",
      name = "hc",
      descriptor = "Llba;"
   )
   private class576 field5345;
   @OriginalMember(
      owner = "client!sc",
      name = "nc",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   public NativeHeap field5179;
   @OriginalMember(
      owner = "client!sc",
      name = "S",
      descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   public NativeHeapBuffer field5125;
   @OriginalMember(
      owner = "client!sc",
      name = "Jb",
      descriptor = "Ljava/util/Hashtable;"
   )
   private Hashtable field5130;
   @OriginalMember(
      owner = "client!sc",
      name = "db",
      descriptor = "Z"
   )
   public boolean field5249;
   @OriginalMember(
      owner = "client!sc",
      name = "Qd",
      descriptor = "Z"
   )
   public boolean field5281;
   @OriginalMember(
      owner = "client!sc",
      name = "zb",
      descriptor = "Z"
   )
   public boolean field5308;
   @OriginalMember(
      owner = "client!sc",
      name = "qg",
      descriptor = "Z"
   )
   public boolean field5324;
   @OriginalMember(
      owner = "client!sc",
      name = "ue",
      descriptor = "Z"
   )
   public boolean field5333;
   @OriginalMember(
      owner = "client!sc",
      name = "Ue",
      descriptor = "Z"
   )
   public boolean field5366;
   @OriginalMember(
      owner = "client!sc",
      name = "xe",
      descriptor = "[Lm;"
   )
   private class205[] field5315;
   @OriginalMember(
      owner = "client!sc",
      name = "ob",
      descriptor = "[Loba;"
   )
   public class274[] field5342;
   @OriginalMember(
      owner = "client!sc",
      name = "sc",
      descriptor = "[Lmn;"
   )
   public class389[] field5329;
   @OriginalMember(
      owner = "client!sc",
      name = "Bg",
      descriptor = "[Lvm;"
   )
   public class716[] field5302;
   @OriginalMember(
      owner = "client!sc",
      name = "xd",
      descriptor = "[Lwia;"
   )
   public class793[] field5262;
   @OriginalMember(
      owner = "client!sc",
      name = "L",
      descriptor = "[Lwia;"
   )
   public class793[] field5325;

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "([IIIIIZ)Lbg;"
   )
   public final class492 method515(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         ++field5176;
         return new class400(this, arg3, arg4, arg0, arg1, arg2);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field5367[61] + (arg0 != null ? field5367[3] : field5367[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public final void method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      boolean var10 = client.field4360;

      try {
         float var11;
         float var12;
         label89: {
            ++field5085;
            var11 = (float)(-arg0) + (float)arg2;
            var12 = (float)(-arg1) + (float)arg3;
            if (var11 == 0.0F && var12 == 0.0F) {
               var11 = 1.0F;
               if (!var10) {
                  break label89;
               }
            }

            float var13 = (float)(1.0D / Math.sqrt((double)(var11 * var11 + var12 * var12)));
            var12 *= var13;
            var11 *= var13;
         }

         float var14;
         float var15;
         float var16;
         float var17;
         float var18;
         float var19;
         label83: {
            this.method2762((byte)-106);
            this.method2752(arg4, (byte)50);
            this.method2814(0, class304.field4150, true);
            this.method2787(class304.field4150, (byte)-51, 0);
            this.method2749(65, arg5);
            this.method2795((byte)127);
            this.method2579(0, false);
            int var26 = arg8 % (arg7 - -arg6);
            var14 = (float)arg6 * var11;
            var15 = (float)arg6 * var12;
            var16 = 0.0F;
            var17 = 0.0F;
            var18 = var14;
            var19 = var15;
            if (~var26 < ~arg6) {
               var16 = (float)(-var26 + arg6 + arg7) * var11;
               var17 = (float)(-var26 + arg6 - -arg7) * var12;
               if (!var10) {
                  break label83;
               }
            }

            var18 = (float)(-var26 + arg6) * var11;
            var19 = (float)(arg6 - var26) * var12;
         }

         float var20 = (float)arg0 + var16;
         float var21 = (float)arg1 + var17;
         float var22 = (float)arg7 * var11;
         float var23 = (float)arg7 * var12;

         do {
            label95: {
               int var10000;
               label74: {
                  if (~arg2 >= ~arg0) {
                     float var27;
                     var10000 = (var27 = var20 - (float)arg2) == 0.0F ? 0 : (var27 < 0.0F ? -1 : 1);
                     if (var10) {
                        break label74;
                     }

                     if (var10000 < 0) {
                        break;
                     }

                     if (!((float)arg2 > var18 + var20)) {
                        break label95;
                     }

                     var18 = (float)arg2 - var20;
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
               if (arg3 <= arg1) {
                  if (var21 < (float)arg3) {
                     break;
                  }

                  if (!(var19 + var21 < (float)arg3)) {
                     break label97;
                  }

                  var19 = (float)arg3 + -var21;
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

            if (!this.method2775(var19 + var21, 0.0F, var18 + var20, var21, 0.0F, -9665, var20)) {
               return;
            }

            this.method2760(0);
            var20 += var18 + var22;
            var21 += var19 + var23;
            var18 = var14;
            var19 = var15;
         } while(!var10);

         this.method2579(0, true);
         this.method2787(class10.field93, (byte)-51, 0);
         this.method2814(0, class10.field93, true);
      } catch (RuntimeException var25) {
         throw class237.method1823(var25, field5367[59] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "k",
      descriptor = "(I)V"
   )
   public final void method2740(int arg0) {
      boolean var2 = client.field4360;

      try {
         ++field5211;
         this.field5302 = new class716[this.field5307];
         this.field5342 = new class274[this.field5307];
         this.field5325 = new class793[this.field5307];
         if (arg0 != -14130) {
            this.method2750(true, (byte)39);
         }

         this.field5315 = new class205[this.field5307];
         this.field5262 = new class793[this.field5307];
         int var3 = 0;
         if (var2) {
            this.field5325[var3] = class458.field6587;
            this.field5262[var3] = class458.field6587;
            this.field5342[var3] = class552.field7905;
            this.field5302[var3] = new class716();
            ++var3;
         }

         while(true) {
            while(var3 < this.field5307) {
               this.field5325[var3] = class458.field6587;
               this.field5262[var3] = class458.field6587;
               this.field5342[var3] = class552.field7905;
               this.field5302[var3] = new class716();
               ++var3;
            }

            this.field5329 = new class389[this.field5250 - 2];
            this.field5259 = this.method2619(class301.field4117, 1, -1025288952, 1, class424.field6036);
            this.method614(new class403(262144));
            this.field5352 = this.method2587((byte)-121, new class430[]{new class430(new class744[]{class744.field10836, class744.field10848})});
            this.field5355 = this.method2587((byte)-45, new class430[]{new class430(new class744[]{class744.field10836, class744.field10846})});
            this.field5346 = this.method2587((byte)-94, new class430[]{new class430(class744.field10836), new class430(class744.field10846), new class430(class744.field10848), new class430(class744.field10842)});
            this.field5360 = this.method2587((byte)-16, new class430[]{new class430(class744.field10836), new class430(class744.field10846), new class430(class744.field10848)});
            this.field5353 = new class149(this, 0, 0, false, false);
            this.field5349 = new class149(this, 0, 0, true, true);
            this.field5351 = new class149(this, 0, 0, false, false);
            this.field5362 = new class149(this, 0, 0, true, true);
            this.field5344 = new class149(this, 0, 0, false, false);
            this.field5359 = new class149(this, 0, 0, true, true);
            this.field5347 = new class149(this, 0, 0, false, false);
            this.field5364 = new class149(this, 0, 0, true, true);
            this.field5357 = new class149(this, 0, 0, false, false);
            this.field5356 = new class149(this, 0, 0, true, true);
            this.field5268 = new class384(this);
            this.field5345 = this.method2575(106, true);
            this.method2746(-14279);
            this.field5227 = new class172(this);
            this.field5271[1] = this.method2623((byte)-43, 1);
            this.field5271[2] = this.method2623((byte)-43, 2);
            this.field5271[4] = this.method2623((byte)-43, 4);
            this.field5271[5] = this.method2623((byte)-43, 5);
            this.field5271[6] = this.method2623((byte)-43, 6);
            this.field5271[7] = this.method2623((byte)-43, 7);
            this.field5271[3] = this.method2623((byte)-43, 3);
            this.field5271[8] = this.method2623((byte)-43, 8);
            this.field5271[9] = this.method2623((byte)-43, 9);
            if (!var2) {
               if (!this.field5271[2].method313(true)) {
                  this.field5271[2] = this.method2623((byte)-43, 0);
               }

               if (!this.field5271[4].method313(true)) {
                  this.field5271[4] = this.field5271[2];
               }

               if (!this.field5271[8].method313(true)) {
                  this.field5271[8] = this.field5271[4];
               }

               if (!this.field5271[9].method313(true)) {
                  this.field5271[9] = this.field5271[8];
               }

               this.method2590(0);
               this.method574();
               this.method510();
               return;
            }

            this.field5302[var3] = new class716();
            ++var3;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5367[97] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "JA",
      descriptor = "(IIIIII)I"
   )
   public final int method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var7 = client.field4360;

      try {
         ++field5222;
         int var8 = 0;
         float var9 = (float)arg2 * this.field5237.field10411 + (float)arg0 * this.field5237.field10414 + (float)arg1 * this.field5237.field10454 + this.field5237.field10430;
         if (var9 < 1.0F) {
            var9 = 1.0F;
         }

         float var10 = (float)arg5 * this.field5237.field10411 + (float)arg3 * this.field5237.field10414 + (float)arg4 * this.field5237.field10454 + this.field5237.field10430;
         if (var10 < 1.0F) {
            var10 = 1.0F;
         }

         label83: {
            if (!((float)this.field5258 > var9) || !(var10 < (float)this.field5258)) {
               if (!((float)this.field5332 < var9) || !(var10 > (float)this.field5332)) {
                  break label83;
               }

               var8 |= 32;
               if (!var7) {
                  break label83;
               }
            }

            var8 |= 16;
         }

         label84: {
            int var11 = (int)(((float)arg2 * this.field5237.field10423 + (float)arg0 * this.field5237.field10439 + (float)arg1 * this.field5237.field10432 + this.field5237.field10450) * (float)this.field5336 / var9);
            int var12 = (int)(((float)arg5 * this.field5237.field10423 + (float)arg3 * this.field5237.field10439 + (float)arg4 * this.field5237.field10432 + this.field5237.field10450) * (float)this.field5336 / var10);
            if (!((float)var11 < this.field5245) || !((float)var12 < this.field5245)) {
               if (!(this.field5247 < (float)var11) || !((float)var12 > this.field5247)) {
                  break label84;
               }

               var8 |= 2;
               if (!var7) {
                  break label84;
               }
            }

            var8 |= 1;
         }

         int var13 = (int)(((float)arg2 * this.field5237.field10434 + (float)arg0 * this.field5237.field10421 + (float)arg1 * this.field5237.field10422 + this.field5237.field10425) * (float)this.field5327 / var9);
         int var14 = (int)(((float)arg5 * this.field5237.field10434 + (float)arg3 * this.field5237.field10421 + (float)arg4 * this.field5237.field10422 + this.field5237.field10425) * (float)this.field5327 / var10);
         if (this.field5319 > (float)var13 && this.field5319 > (float)var14) {
            var8 |= 4;
            if (!var7) {
               return var8;
            }
         }

         if (this.field5297 < (float)var13 && (float)var14 > this.field5297) {
            var8 |= 8;
         }

         return var8;
      } catch (RuntimeException var16) {
         throw class237.method1823(var16, field5367[116] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "C",
      descriptor = "(Z)V"
   )
   public final void method493(boolean arg0) {
      try {
         ++field5042;
         this.field5270 = arg0;
         this.method2634(0);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[134] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "p",
      descriptor = "(I)V"
   )
   public abstract void method2591(int arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "ra",
      descriptor = "(IIII)V"
   )
   public final void method536(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field5053;
         this.field5251 = arg3;
         this.field5320 = arg0;
         this.field5253 = arg1;
         this.field5298 = arg2;
         this.field5308 = true;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5367[62] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method604(int arg0) {
      try {
         ++field5088;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(ZIIZ)V"
   )
   public final void method2741(boolean arg0, int arg1, int arg2, boolean arg3) {
      boolean var5 = client.field4360;

      try {
         if (arg1 > 16) {
            if (this.field5318 != arg2 || this.field5308 != this.field5260) {
               class272 var6;
               int var7;
               byte var8;
               int var9;
               int var10;
               label70: {
                  var6 = null;
                  var7 = 0;
                  var8 = 0;
                  var9 = 0;
                  var10 = this.field5308 ? 3 : 0;
                  if (~arg2 > -1) {
                     this.method2794((byte)-122);
                     if (!var5) {
                        break label70;
                     }
                  }

                  class317 var11;
                  label71: {
                     var6 = this.field5340.method4471(arg2, 4065);
                     var11 = super.field802.method1354(arg2, (byte)-109);
                     if (~var11.field4326 == -1 && ~var11.field4327 == -1) {
                        this.method2794((byte)-122);
                        if (!var5) {
                           break label71;
                        }
                     }

                     int var12 = var11.field4318 ? 64 : 128;
                     int var13 = var12 * 50;
                     class716 var14 = this.method2821((byte)92);
                     var14.method5193(26276, (float)(this.field5301 % var13 * var11.field4326) / (float)var13, 0.0F, (float)(this.field5301 % var13 * var11.field4327) / (float)var13);
                     this.method2778((byte)-119, class148.field1961);
                  }

                  var7 = var11.field4329;
                  if (!this.field5308) {
                     var9 = var11.field4317;
                     var8 = var11.field4316;
                     var10 = var11.field4308;
                  }
               }

               label46: {
                  this.method2822(var9, var10, -5711, arg0, var8, arg3);
                  if (this.field5337 == null) {
                     this.method2804(var6, -2);
                     this.method2747((byte)-81, var7);
                     if (!var5) {
                        break label46;
                     }
                  }

                  this.field5337.method310(var6, var7, 0);
               }

               this.field5260 = this.field5308;
               this.field5318 = arg2;
            }

            ++field5148;
            this.field5295 &= -8;
         }
      } catch (RuntimeException var16) {
         throw class237.method1823(var16, field5367[167] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "F",
      descriptor = "(I)V"
   )
   public abstract void method2634(int arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "N",
      descriptor = "(I)V"
   )
   private final void method2742(int arg0) {
      try {
         if (arg0 != 1) {
            this.method532((class521)null);
         }

         if (!this.field5265) {
            label33: {
               float[] var2 = this.field5306;
               float var3 = (float)this.field5258;
               float var4 = (float)this.field5332;
               float var5 = (float)(-this.field5242) * this.field5341 / (float)this.field5327;
               float var6 = (float)(-this.field5254) * this.field5341 / (float)this.field5336;
               float var7 = (float)(-this.field5254 + this.field5100) * this.field5341 / (float)this.field5336;
               float var8 = (float)(-this.field5242 + this.field5117) * this.field5341 / (float)this.field5327;
               if (var6 == var7 || var5 == var8) {
                  var2[0] = 1.0F;
                  var2[15] = 1.0F;
                  var2[9] = 0.0F;
                  var2[12] = 0.0F;
                  var2[10] = 1.0F;
                  var2[6] = 0.0F;
                  var2[1] = 0.0F;
                  var2[7] = 0.0F;
                  var2[8] = 0.0F;
                  var2[5] = 1.0F;
                  var2[14] = 0.0F;
                  var2[13] = 0.0F;
                  var2[3] = 0.0F;
                  var2[2] = 0.0F;
                  var2[11] = 0.0F;
                  var2[4] = 0.0F;
                  if (!client.field4360) {
                     break label33;
                  }
               }

               var2[12] = (var6 + var7) / (-var7 + var6);
               var2[11] = 0.0F;
               var2[3] = 0.0F;
               var2[1] = 0.0F;
               var2[2] = 0.0F;
               var2[9] = 0.0F;
               var2[13] = (var5 + var8) / (-var5 + var8);
               var2[6] = 0.0F;
               var2[8] = 0.0F;
               var2[5] = 2.0F / (var8 - var5);
               var2[15] = 1.0F;
               var2[7] = 0.0F;
               var2[10] = 1.0F / (var3 - var4);
               var2[14] = var3 / (-var4 + var3);
               var2[0] = 2.0F / (var7 - var6);
               var2[4] = 0.0F;
            }

            this.method2770(arg0 ^ 30287);
            this.field5265 = true;
         }

         ++field5127;
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field5367[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(IZLak;[BII)Lfc;"
   )
   public final class272 method2743(int arg0, boolean arg1, class371 arg2, byte[] arg3, int arg4, int arg5) {
      try {
         ++field5225;
         return arg4 != -5 ? null : this.method2606(arg0, arg5, 0, arg4 ^ -5, arg1, arg3, arg2, 0);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field5367[163] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5367[3] : field5367[4]) + ',' + (arg3 != null ? field5367[3] : field5367[4]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "y",
      descriptor = "(I)V"
   )
   public abstract void method2598(int arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "f",
      descriptor = "(Z)V"
   )
   public final void method2744(boolean arg0) {
      try {
         ++field5177;
         this.field5235 = arg0;
         this.method2823(0);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[81] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "w",
      descriptor = "(B)V"
   )
   public abstract void method2638(byte arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "t",
      descriptor = "(I)V"
   )
   public abstract void method2589(int arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(ILwia;Lwia;)V"
   )
   public final void method2745(int arg0, class793 arg1, class793 arg2) {
      try {
         if (arg0 != -30) {
            this.field5340 = null;
         }

         ++field5045;
         boolean var4 = false;
         if (this.field5262[this.field5309] != arg1) {
            this.field5262[this.field5309] = arg1;
            var4 = true;
            this.method2593(2);
         }

         if (this.field5325[this.field5309] != arg2) {
            this.field5325[this.field5309] = arg2;
            var4 = true;
            this.method2577(4785);
         }

         if (var4) {
            this.field5295 &= -30;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5367[42] + arg0 + ',' + (arg1 != null ? field5367[3] : field5367[4]) + ',' + (arg2 != null ? field5367[3] : field5367[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(Llg;III)V"
   )
   public abstract void method2603(class437 arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!sc",
      name = "d",
      descriptor = "(IZ)Lbk;"
   )
   public abstract class398 method2615(int arg0, boolean arg1);

   @OriginalMember(
      owner = "client!sc",
      name = "R",
      descriptor = "(I)V"
   )
   public final void method2746(int arg0) {
      boolean var2 = client.field4360;

      try {
         ++field5195;
         if (arg0 != -14279) {
            this.method574();
         }

         Hashtable var3 = new Hashtable();
         if (this.field5130 != null && !this.field5130.isEmpty()) {
            Enumeration var4 = this.field5130.keys();
            if (var2 || var4.hasMoreElements()) {
               do {
                  Canvas var5 = (Canvas)var4.nextElement();
                  var3.put(var5, this.method2624(var5, 1));
               } while(var4.hasMoreElements());
            }
         }

         this.field5130 = var3;
         this.method2810(47);
         this.method2783(true);
         this.method2753(-12766);
         this.field5268.method2908(this, false);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field5367[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "b",
      descriptor = "(BI)V"
   )
   public final void method2747(byte arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         label52: {
            if (~arg1 == -2) {
               this.method2745(-30, class603.field8872, class603.field8872);
               if (!var3) {
                  break label52;
               }
            }

            if (~arg1 != -1) {
               if (~arg1 == -3) {
                  this.method2745(-30, class144.field1826, class603.field8872);
                  if (!var3) {
                     break label52;
                  }
               }

               if (arg1 == 3) {
                  this.method2745(-30, class358.field4889, class458.field6587);
                  if (!var3) {
                     break label52;
                  }
               }

               if (~arg1 != -5) {
                  break label52;
               }

               this.method2745(-30, class470.field6749, class470.field6749);
               if (!var3) {
                  break label52;
               }
            }

            this.method2745(-30, class458.field6587, class458.field6587);
         }

         if (arg0 >= -75) {
            this.field5287 = null;
         }

         ++field5064;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5367[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "XA",
      descriptor = "()I"
   )
   public final int method504() {
      try {
         ++field5103;
         return this.field5332;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5367[155] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "Y",
      descriptor = "(I)Lvm;"
   )
   public final class716 method2748(int arg0) {
      try {
         if (arg0 != 0) {
            this.field5327 = -26;
         }

         ++field5205;
         return this.field5236;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[21] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "h",
      descriptor = "(II)V"
   )
   public final void method2749(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field5186;
         if (this.field5284 != arg1) {
            boolean var4;
            class656 var5;
            boolean var6;
            label60: {
               if (arg1 == 1) {
                  var4 = true;
                  var5 = class701.field10254;
                  var6 = true;
                  if (!var3) {
                     break label60;
                  }
               }

               if (~arg1 != -3) {
                  if (arg1 == 128) {
                     var4 = true;
                     var5 = class246.field3399;
                     var6 = true;
                     if (!var3) {
                        break label60;
                     }
                  }

                  var5 = class645.field9423;
                  var6 = false;
                  var4 = false;
                  if (!var3) {
                     break label60;
                  }
               }

               var4 = true;
               var5 = class328.field4475;
               var6 = false;
            }

            if (this.field5266 != var6) {
               this.field5266 = var6;
               this.method2581(133);
            }

            if (var4 == !this.field5330) {
               this.field5330 = var4;
               this.method2631(0);
            }

            if (this.field5287 != var5) {
               this.field5287 = var5;
               this.method2611(-2);
            }

            this.field5284 = arg1;
            this.field5295 &= -29;
         }

         if (arg0 < 17) {
            this.method592(-11, -69, -124, 49);
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field5367[148] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "K",
      descriptor = "([I)V"
   )
   public final void method605(int[] arg0) {
      try {
         arg0[0] = this.field5275;
         arg0[2] = this.field5323;
         ++field5109;
         arg0[1] = this.field5326;
         arg0[3] = this.field5339;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[60] + (arg0 != null ? field5367[3] : field5367[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "e",
      descriptor = "()Z"
   )
   public final boolean method571() {
      try {
         ++field5213;
         return true;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5367[139] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "b",
      descriptor = "(ZB)V"
   )
   public final void method2750(boolean arg0, byte arg1) {
      try {
         if (arg1 != 22) {
            this.field5268 = null;
         }

         if (this.field5276 != arg0) {
            this.field5276 = arg0;
            this.method2634(0);
            this.field5295 &= -32;
         }

         ++field5115;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[30] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "f",
      descriptor = "(II)V"
   )
   public final void method506(int arg0, int arg1) {
      try {
         ++field5201;
         if (this.field5258 != arg0 || this.field5332 != arg1) {
            this.field5332 = arg1;
            this.field5258 = arg0;
            this.method2807(-53);
            this.method2809(1);
            this.method2816(3);
         }

      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[39] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(II[IIIIZ)Lfc;"
   )
   public abstract class272 method2613(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, boolean arg6);

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(IZLnu;Ljava/lang/String;Z)V"
   )
   public static final void method2751(int arg0, boolean arg1, class619 arg2, String arg3, boolean arg4) {
      try {
         if (arg0 < 89) {
            field5077 = 92;
         }

         ++field5154;
         class787.method5680(arg4, arg3, field5367[65], arg1, (byte)18, arg2);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5367[64] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5367[3] : field5367[4]) + ',' + (arg3 != null ? field5367[3] : field5367[4]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(Lru;[Lmha;Z)Lda;"
   )
   public final class67 method502(class206 arg0, class439[] arg1, boolean arg2) {
      try {
         ++field5104;
         return new class765(this, arg0, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5367[10] + (arg0 != null ? field5367[3] : field5367[4]) + ',' + (arg1 != null ? field5367[3] : field5367[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(Lrha;I)V"
   )
   public final void method535(class234 arg0, int arg1) {
      try {
         ++field5152;
         this.field5268.method2906(this, arg0, arg1, (byte)-96);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[72] + (arg0 != null ? field5367[3] : field5367[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(II[I[I)Laa;"
   )
   public final class515 method602(int arg0, int arg1, int[] arg2, int[] arg3) {
      try {
         ++field5093;
         return class229.method1786(arg3, arg2, this, arg0, arg1, -6100);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5367[154] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5367[3] : field5367[4]) + ',' + (arg3 != null ? field5367[3] : field5367[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "r",
      descriptor = "(IIIIIII)I"
   )
   public final int method541(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4360;

      try {
         int var9;
         label62: {
            ++field5183;
            var9 = 0;
            float var10 = (float)arg2 * this.field5237.field10411 + (float)arg0 * this.field5237.field10414 + (float)arg1 * this.field5237.field10454 + this.field5237.field10430;
            float var11 = (float)arg5 * this.field5237.field10411 + (float)arg3 * this.field5237.field10414 + (float)arg4 * this.field5237.field10454 + this.field5237.field10430;
            if ((float)this.field5258 > var10 && var11 < (float)this.field5258) {
               var9 |= 16;
               if (!var8) {
                  break label62;
               }
            }

            if (var10 > (float)this.field5332 && var11 > (float)this.field5332) {
               var9 |= 32;
            }
         }

         label69: {
            int var12 = (int)(((float)arg2 * this.field5237.field10423 + (float)arg0 * this.field5237.field10439 + (float)arg1 * this.field5237.field10432 + this.field5237.field10450) * (float)this.field5336 / (float)arg6);
            int var13 = (int)(((float)arg5 * this.field5237.field10423 + (float)arg3 * this.field5237.field10439 + (float)arg4 * this.field5237.field10432 + this.field5237.field10450) * (float)this.field5336 / (float)arg6);
            if (!((float)var12 < this.field5245) || !(this.field5245 > (float)var13)) {
               if (!((float)var12 > this.field5247) || !(this.field5247 < (float)var13)) {
                  break label69;
               }

               var9 |= 2;
               if (!var8) {
                  break label69;
               }
            }

            var9 |= 1;
         }

         int var14 = (int)(((float)arg2 * this.field5237.field10434 + (float)arg0 * this.field5237.field10421 + (float)arg1 * this.field5237.field10422 + this.field5237.field10425) * (float)this.field5327 / (float)arg6);
         int var15 = (int)(((float)arg5 * this.field5237.field10434 + (float)arg3 * this.field5237.field10421 + (float)arg4 * this.field5237.field10422 + this.field5237.field10425) * (float)this.field5327 / (float)arg6);
         if ((float)var14 < this.field5319 && this.field5319 > (float)var15) {
            var9 |= 4;
            if (!var8) {
               return var9;
            }
         }

         if ((float)var14 > this.field5297 && (float)var15 > this.field5297) {
            var9 |= 8;
         }

         return var9;
      } catch (RuntimeException var17) {
         throw class237.method1823(var17, field5367[174] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method2752(int arg0, byte arg1) {
      try {
         ++field5233;
         if (this.field5291 != arg0) {
            this.field5291 = arg0;
            this.method2598(arg1 ^ 56);
         }

         if (arg1 != 50) {
            this.field5334 = -5;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[109] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "h",
      descriptor = "(I)V"
   )
   public final void method525(int arg0) {
      try {
         ++field5171;
         if (~arg0 != -2) {
            throw new IllegalArgumentException("");
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[79] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "i",
      descriptor = "(Z)V"
   )
   public abstract void method2586(boolean arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "H",
      descriptor = "(I)V"
   )
   public void method2590(int arg0) {
      try {
         if (arg0 != 0) {
            this.field5117 = 75;
         }

         ++field5221;
         this.method2781((byte)102);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[129] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "cb",
      descriptor = "(I)V"
   )
   private final void method2753(int arg0) {
      boolean var2 = client.field4360;

      try {
         this.field5350 = this.method2615(124, false);
         ++field5118;
         this.field5350.method1410(3096, 12, 103);
         if (arg0 != -12766) {
            this.method2591(-41);
         }

         int var3 = 0;
         class369 var10000;
         if (var2) {
            var10000 = this;
         } else if (~var3 <= -5) {
            var10000 = this;
            if (!var2) {
               this.field5361 = this.method2587((byte)-37, new class430[]{new class430(class744.field10836)});
               return;
            }
         } else {
            var10000 = this;
         }

         do {
            while(true) {
               Buffer var4 = var10000.field5350.method1407(true, true);
               if (var4 != null) {
                  Stream var5 = this.method2805(-113, var4);
                  var5.method5098(0.0F);
                  var5.method5098(0.0F);
                  var5.method5098(0.0F);
                  int var6 = 0;
                  double var7;
                  float var9;
                  float var10;
                  if (var2) {
                     var7 = (double)(var6 * 2) * 3.141592653589793D / 256.0D;
                     var9 = (float)Math.cos(var7);
                     var10 = (float)Math.sin(var7);
                     if (!Stream.method5106()) {
                        var5.method5104(var10);
                        var5.method5104(var9);
                        var5.method5104(0.0F);
                        if (var2) {
                           var5.method5098(var10);
                           var5.method5098(var9);
                           var5.method5098(0.0F);
                           ++var6;
                        } else {
                           ++var6;
                        }
                     } else {
                        var5.method5098(var10);
                        var5.method5098(var9);
                        var5.method5098(0.0F);
                        ++var6;
                     }
                  }

                  while(~var6 >= -257) {
                     var7 = (double)(var6 * 2) * 3.141592653589793D / 256.0D;
                     var9 = (float)Math.cos(var7);
                     var10 = (float)Math.sin(var7);
                     if (!Stream.method5106()) {
                        var5.method5104(var10);
                        var5.method5104(var9);
                        var5.method5104(0.0F);
                        if (var2) {
                           var5.method5098(var10);
                           var5.method5098(var9);
                           var5.method5098(0.0F);
                           ++var6;
                        } else {
                           ++var6;
                        }
                     } else {
                        var5.method5098(var10);
                        var5.method5098(var9);
                        var5.method5098(0.0F);
                        ++var6;
                     }
                  }

                  var5.method5102();
                  if (this.field5350.method1409((byte)-70)) {
                     if (!var2) {
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

               if (~var3 <= -5) {
                  var10000 = this;
                  if (!var2) {
                     this.field5361 = this.method2587((byte)-37, new class430[]{new class430(class744.field10836)});
                     return;
                  }
               } else {
                  var10000 = this;
               }
            }
         } while(var2);

         this.field5361 = this.method2587((byte)-37, new class430[]{new class430(class744.field10836)});
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field5367[131] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(IIIIIILaa;II)V"
   )
   public final void method580(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class515 arg6, int arg7, int arg8) {
      try {
         ++field5049;
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field5367[135] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field5367[3] : field5367[4]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "i",
      descriptor = "(II)Z"
   )
   public static final boolean method2754(int arg0, int arg1) {
      try {
         if (arg0 != -8) {
            return false;
         } else {
            ++field5044;
            return arg1 != 1 && ~arg1 != -8;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[105] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "c",
      descriptor = "(I)Lza;"
   )
   public final class438 method594(int arg0) {
      try {
         ++field5050;
         class403 var2 = new class403(arg0);
         this.field5056.method2930((byte)-112, var2);
         return var2;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[35] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "b",
      descriptor = "(IZ)V"
   )
   public final void method2755(int arg0, boolean arg1) {
      try {
         if (!arg1 == this.field5292) {
            this.field5292 = arg1;
            this.method2578(-4957);
         }

         if (arg0 == -3800) {
            ++field5228;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "x",
      descriptor = "()V"
   )
   public final void method514() {
      try {
         ++field5107;
         if (this.field5340 != null) {
            this.field5340.method4470(false);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5367[152] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "x",
      descriptor = "(I)V"
   )
   public static void method2756(int arg0) {
      try {
         field5086 = null;
         if (arg0 != 0) {
            method2751(115, true, (class619)null, (String)null, true);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5367[122] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "r",
      descriptor = "(I)V"
   )
   public abstract void method2631(int arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "U",
      descriptor = "(I)V"
   )
   public abstract void method2588(int arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(IIIZ[BLak;)Lkd;"
   )
   public abstract class297 method2580(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4, class371 arg5);

   @OriginalMember(
      owner = "client!sc",
      name = "c",
      descriptor = "(IIIIII)V"
   )
   public final void method608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field5220;
         float var7 = this.method2605(18);
         this.method2762((byte)-121);
         this.method2752(arg4, (byte)50);
         this.method2814(0, class304.field4150, true);
         this.method2787(class304.field4150, (byte)-51, 0);
         this.method2749(82, arg5);
         this.field5236.method5199((float)(arg3 + -1), 122, (float)(arg2 - 1), 1.0F);
         this.field5236.method5198(0.0F, (float)arg0 - var7, (float)arg1 + -var7, (byte)-76);
         this.method2744(false);
         this.method2579(0, false);
         this.method2789(-14677, class93.field1202, 4);
         this.method2579(0, true);
         this.method2787(class10.field93, (byte)-51, 0);
         this.method2814(0, class10.field93, true);
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field5367[126] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "o",
      descriptor = "()Lew;"
   )
   public final class521 method600() {
      try {
         ++field5096;
         return this.field5237;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5367[123] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "c",
      descriptor = "()Z"
   )
   public final boolean method564() {
      try {
         ++field5165;
         return this.field5271[3].method313(true);
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5367[107] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "l",
      descriptor = "(I)V"
   )
   private final void method2757(int arg0) {
      try {
         if (arg0 != -2730) {
            method2754(-46, 120);
         }

         ++field5196;
         if (!this.field5304) {
            float[] var2 = this.field5294;
            this.field5304 = true;
            if (~this.field5100 != -1 && ~this.field5117 != -1) {
               var2[12] = -1.0F;
               var2[11] = 0.0F;
               var2[3] = 0.0F;
               var2[15] = 1.0F;
               var2[13] = 1.0F;
               var2[9] = 0.0F;
               var2[0] = 2.0F / (float)this.field5100;
               var2[7] = 0.0F;
               var2[5] = -2.0F / (float)this.field5117;
               var2[8] = 0.0F;
               var2[6] = 0.0F;
               var2[14] = 0.5F;
               var2[1] = 0.0F;
               var2[4] = 0.0F;
               var2[10] = 0.5F;
               var2[2] = 0.0F;
            } else {
               var2[1] = 0.0F;
               var2[11] = 0.0F;
               var2[13] = 0.0F;
               var2[15] = 1.0F;
               var2[9] = 0.0F;
               var2[4] = 0.0F;
               var2[10] = 1.0F;
               var2[2] = 0.0F;
               var2[7] = 0.0F;
               var2[5] = 1.0F;
               var2[14] = 0.0F;
               var2[8] = 0.0F;
               var2[0] = 1.0F;
               var2[3] = 0.0F;
               var2[6] = 0.0F;
               var2[12] = 0.0F;
            }
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[34] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "j",
      descriptor = "(I)V"
   )
   public void method2620(int arg0) {
      try {
         ++field5137;
         this.field5290 = this.field5256;
         this.field5256 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[108] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "r",
      descriptor = "(B)V"
   )
   public abstract void method2625(byte arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "p",
      descriptor = "()Z"
   )
   public final boolean method583() {
      try {
         ++field5199;
         return false;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5367[124] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "q",
      descriptor = "(B)V"
   )
   private final void method2758(byte arg0) {
      try {
         ++field5155;
         this.field5264[14] = this.field5303;
         this.field5264[10] = this.field5272;
         if (arg0 != -101) {
            this.method2772(31);
         }

         this.field5311 = (this.field5264[14] - (float)this.field5332) / this.field5264[10];
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[94] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "J",
      descriptor = "(I)V"
   )
   public abstract void method2611(int arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V"
   )
   public abstract void method2576(Object arg0, Canvas arg1, int arg2);

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(ZII[II)Lfc;"
   )
   public final class272 method2759(boolean arg0, int arg1, int arg2, int[] arg3, int arg4) {
      try {
         if (arg2 != 0) {
            this.field5315 = null;
         }

         ++field5061;
         return this.method2613(0, 0, arg3, -56, arg4, arg1, arg0);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field5367[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5367[3] : field5367[4]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "u",
      descriptor = "()Z"
   )
   public final boolean method569() {
      try {
         ++field5051;
         return this.field5249;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5367[93] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "k",
      descriptor = "(B)V"
   )
   public abstract void method2627(byte arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(Lbr;I)V"
   )
   public abstract void method2621(class418 arg0, int arg1);

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(Llba;BLlg;IIII)V"
   )
   public abstract void method2628(class576 arg0, byte arg1, class437 arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!sc",
      name = "v",
      descriptor = "(I)V"
   )
   private final void method2760(int arg0) {
      try {
         ++field5206;
         this.method2585(12, arg0, this.field5343);
         this.method2621(this.field5358, -18344);
         this.method2603(class660.field9617, 1, 0, arg0 + -62);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[74] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "b",
      descriptor = "(IIIIII)V"
   )
   public final void method589(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         float var7;
         float var8;
         label22: {
            ++field5083;
            var7 = (float)arg2 - (float)arg0;
            var8 = (float)(-arg1) + (float)arg3;
            if (var7 == 0.0F && var8 == 0.0F) {
               var7 = 1.0F;
               if (!client.field4360) {
                  break label22;
               }
            }

            float var9 = (float)(1.0D / Math.sqrt((double)(var7 * var7 + var8 * var8)));
            var8 *= var9;
            var7 *= var9;
         }

         if (this.method2775((float)arg3 + var8, 0.0F, (float)arg2 + var7, (float)arg1, 0.0F, -9665, (float)arg0)) {
            this.method2762((byte)-79);
            this.method2752(arg4, (byte)50);
            this.method2814(0, class304.field4150, true);
            this.method2787(class304.field4150, (byte)-51, 0);
            this.method2749(95, arg5);
            this.method2795((byte)124);
            this.method2579(0, false);
            this.method2760(0);
            this.method2579(0, true);
            this.method2787(class10.field93, (byte)-51, 0);
            this.method2814(0, class10.field93, true);
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field5367[178] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "z",
      descriptor = "(I)V"
   )
   private final void method2761(int arg0) {
      try {
         this.method2614(-3339);
         ++field5081;
         if (arg0 == 17759) {
            if (this.field5337 != null) {
               this.field5337.method308((byte)86);
            }
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[127] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "u",
      descriptor = "(I)V"
   )
   public abstract void method2614(int arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method601(int arg0) {
      try {
         ++field5146;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[96] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "d",
      descriptor = "(B)V"
   )
   private final void method2762(byte arg0) {
      try {
         if (~this.field5295 != -2) {
            this.method2797(-89);
            this.method2811((byte)-110, false);
            this.method2799((byte)121, false);
            this.method2785(false, 85);
            this.method2750(false, (byte)22);
            this.method2741(false, 85, -2, false);
            this.method2747((byte)-125, 1);
            this.method2804(this.field5259, -2);
            this.field5295 = 1;
         }

         if (arg0 > -28) {
            this.field5270 = false;
         }

         ++field5092;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[137] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method588(Canvas arg0, int arg1, int arg2) {
      try {
         ++field5097;
         Object var4 = null;
         if (arg0 != null && this.field5089 != arg0) {
            if (this.field5130.containsKey(arg0)) {
               var4 = this.field5130.get(arg0);
            }
         } else {
            var4 = this.field5224;
         }

         if (var4 == null) {
            throw new RuntimeException();
         } else {
            this.method2576(var4, arg0, 9);
            if (this.field5138 == arg0) {
               this.method2772(1);
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5367[24] + (arg0 != null ? field5367[3] : field5367[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method554(Canvas arg0) {
      try {
         ++field5158;
         if (this.field5089 == arg0) {
            throw new RuntimeException();
         } else if (this.field5130.containsKey(arg0)) {
            this.method2583(this.field5130.get(arg0), arg0, (byte)61);
            this.field5130.remove(arg0);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[112] + (arg0 != null ? field5367[3] : field5367[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "eb",
      descriptor = "(I)V"
   )
   public abstract void method2601(int arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "j",
      descriptor = "(II)V"
   )
   public final void method2763(int arg0, int arg1) {
      try {
         if (this.field5309 != arg0) {
            this.field5309 = arg0;
            this.method2589(-1);
         }

         if (arg1 <= -39) {
            ++field5215;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[71] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "d",
      descriptor = "()Lew;"
   )
   public final class521 method596() {
      try {
         ++field5073;
         return new class716();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5367[132] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "s",
      descriptor = "(I)Lvm;"
   )
   public final class716 method2764(int arg0) {
      try {
         if (!this.field5274) {
            this.field5241.method5196(this.field5239, this.field5236);
            this.field5274 = true;
         }

         ++field5114;
         if (arg0 != 2) {
            this.field5235 = false;
         }

         return this.field5241;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[170] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(ZII)Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   public final NativeHeapBuffer method2765(boolean arg0, int arg1, int arg2) {
      try {
         if (arg2 <= 31) {
            this.method2813(false, 105);
         }

         ++field5070;
         return this.field5179.method5096(arg1, arg0);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5367[113] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "G",
      descriptor = "(I)F"
   )
   public abstract float method2605(int arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "W",
      descriptor = "(I)I"
   )
   public final int method2766(int arg0) {
      try {
         if (arg0 <= 49) {
            this.method553(-85, (class389[])null);
         }

         ++field5084;
         return this.field5309;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[52] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "pa",
      descriptor = "()V"
   )
   public final void method518() {
      try {
         this.field5308 = false;
         ++field5202;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5367[177] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "n",
      descriptor = "(B)I"
   )
   public final int method2767(byte arg0) {
      try {
         if (arg0 <= 11) {
            this.field5270 = true;
         }

         ++field5120;
         return this.field5320;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[57] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method516(boolean arg0) {
      try {
         ++field5080;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[40] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "h",
      descriptor = "(B)V"
   )
   public final void method2768(byte arg0) {
      try {
         int var2 = -29 / ((arg0 - 40) / 63);
         if (class614.field9022 != this.field5286) {
            class139 var3 = this.field5286;
            this.field5286 = class614.field9022;
            if (var3.method1102((byte)-6)) {
               this.method2812((byte)-114);
            }

            this.field5295 &= -32;
            this.field5288 = this.field5312;
         }

         ++field5207;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5367[29] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(Lrha;)V"
   )
   public final void method562(class234 arg0) {
      try {
         this.field5268.method2906(this, arg0, -1, (byte)-107);
         ++field5192;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[146] + (arg0 != null ? field5367[3] : field5367[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(Lza;)V"
   )
   public final void method614(class438 arg0) {
      try {
         ++field5133;
         this.field5179 = ((class403)arg0).field5822;
         this.field5125 = this.field5179.method5096(32768, false);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[11] + (arg0 != null ? field5367[3] : field5367[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "ab",
      descriptor = "(I)V"
   )
   private final void method2769(int arg0) {
      try {
         ++field5223;
         if (arg0 > 76) {
            if (!this.field5282) {
               label35: {
                  float[] var2 = this.field5264;
                  float var3 = (float)(-this.field5254 * this.field5258) / (float)this.field5336;
                  float var4 = (float)((this.field5100 - this.field5254) * this.field5258) / (float)this.field5336;
                  float var5 = (float)(this.field5258 * this.field5242) / (float)this.field5327;
                  float var6 = (float)((-this.field5117 + this.field5242) * this.field5258) / (float)this.field5327;
                  if (var3 == var4 || var5 == var6) {
                     var2[6] = 0.0F;
                     var2[4] = 0.0F;
                     var2[12] = 0.0F;
                     var2[10] = 1.0F;
                     var2[2] = 0.0F;
                     var2[1] = 0.0F;
                     var2[9] = 0.0F;
                     var2[14] = 0.0F;
                     var2[3] = 0.0F;
                     var2[15] = 1.0F;
                     var2[5] = 1.0F;
                     var2[8] = 0.0F;
                     var2[0] = 1.0F;
                     var2[7] = 0.0F;
                     var2[13] = 0.0F;
                     var2[11] = 0.0F;
                     if (!client.field4360) {
                        break label35;
                     }
                  }

                  float var7 = (float)this.field5258 * 2.0F;
                  var2[10] = this.field5272 = (float)this.field5332 / (float)(-this.field5332 + this.field5258);
                  var2[3] = 0.0F;
                  var2[14] = this.field5303 = (float)(this.field5332 * this.field5258) / (float)(-this.field5332 + this.field5258);
                  var2[8] = (var3 + var4) / (var4 - var3);
                  var2[4] = 0.0F;
                  var2[6] = 0.0F;
                  var2[15] = 0.0F;
                  var2[11] = -1.0F;
                  var2[12] = 0.0F;
                  var2[0] = var7 / (-var3 + var4);
                  var2[9] = (var5 + var6) / (-var6 + var5);
                  var2[13] = 0.0F;
                  var2[7] = 0.0F;
                  var2[2] = 0.0F;
                  var2[1] = 0.0F;
                  var2[5] = var7 / (var5 - var6);
               }

               this.method2758((byte)-101);
               this.field5282 = true;
            }
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field5367[63] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "m",
      descriptor = "(I)V"
   )
   private final void method2770(int arg0) {
      try {
         ++field5075;
         if (arg0 == 30286) {
            this.field5243 = (float)this.field5332;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[75] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(FZ)V"
   )
   public final void method2771(float arg0, boolean arg1) {
      try {
         if (arg1) {
            this.field5323 = -8;
         }

         ++field5079;
         if (this.field5341 != arg0) {
            this.field5341 = arg0;
            this.method2809(1);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[56] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "f",
      descriptor = "()Z"
   )
   public final boolean method508() {
      try {
         ++field5134;
         return true;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5367[90] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "hb",
      descriptor = "(I)V"
   )
   private final void method2772(int arg0) {
      try {
         label16: {
            if (this.field5138 == null) {
               this.field5095 = this.field5062 = 1;
               if (!client.field4360) {
                  break label16;
               }
            }

            Dimension var2 = this.field5138.getSize();
            this.field5062 = var2.height;
            this.field5095 = var2.width;
         }

         ++field5126;
         this.field5100 = this.field5095;
         this.field5117 = this.field5062;
         this.method2806((byte)69);
         this.method2807(-108);
         this.method2809(arg0);
         this.method2602(false);
         this.method2802((byte)78);
         this.method2768((byte)122);
         this.method574();
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[101] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method613(Canvas arg0) {
      try {
         label37: {
            ++field5216;
            this.field5224 = null;
            this.field5138 = null;
            if (arg0 != null && this.field5089 != arg0) {
               if (!this.field5130.containsKey(arg0)) {
                  break label37;
               }

               this.field5224 = this.field5130.get(arg0);
               this.field5138 = arg0;
               if (!client.field4360) {
                  break label37;
               }
            }

            this.field5224 = this.field5144;
            this.field5138 = this.field5089;
         }

         if (this.field5138 != null && this.field5224 != null) {
            this.method2622(this.field5224, true, this.field5138);
            this.method2772(1);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[121] + (arg0 != null ? field5367[3] : field5367[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "g",
      descriptor = "(B)I"
   )
   public final int method2773(byte arg0) {
      try {
         ++field5174;
         return arg0 > -43 ? -107 : this.field5251;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[66] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "HA",
      descriptor = "(IIII[I)V"
   )
   public final void method584(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
      try {
         ++field5198;
         float var6 = this.field5237.method5203((float)arg1, (float)arg0, (byte)-93, (float)arg2);
         if (!((float)this.field5258 > var6) && !((float)this.field5332 < var6)) {
            int var7 = (int)((float)this.field5336 * this.field5237.method5194((float)arg1, (byte)66, (float)arg2, (float)arg0) / (float)arg3);
            int var8 = (int)((float)this.field5327 * this.field5237.method5197((float)arg0, (float)arg1, (float)arg2, (byte)-125) / (float)arg3);
            arg4[1] = (int)((float)var8 - this.field5319);
            arg4[0] = (int)((float)var7 - this.field5245);
            arg4[2] = (int)var6;
         } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field5367[143] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field5367[3] : field5367[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "l",
      descriptor = "()Z"
   )
   public final boolean method526() {
      try {
         ++field5200;
         return true;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5367[136] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "h",
      descriptor = "(Z)V"
   )
   public abstract void method2617(boolean arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method531(int arg0, int arg1) {
      try {
         ++field5141;
         return arg1 & arg0 ^ arg1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[19] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(Lmha;Z)Lbg;"
   )
   public final class492 method500(class439 arg0, boolean arg1) {
      boolean var3 = client.field4360;

      try {
         class492 var12;
         label102: {
            ++field5173;
            if (arg0.field6269 != 0 && ~arg0.field6267 != -1) {
               int[] var4;
               label106: {
                  var4 = new int[arg0.field6269 * arg0.field6267];
                  int var5 = 0;
                  int var6 = 0;
                  if (arg0.field6270 != null) {
                     int var7 = 0;
                     if (var3 || ~arg0.field6267 < ~var7) {
                        do {
                           int var8 = 0;
                           if (var3) {
                              var4[var6++] = class300.method2238(arg0.field6264[class556.method3988(arg0.field6268[var5], 255)], arg0.field6270[var5] << 24);
                              ++var5;
                              ++var8;
                           }

                           while(true) {
                              while(~var8 > ~arg0.field6269) {
                                 var4[var6++] = class300.method2238(arg0.field6264[class556.method3988(arg0.field6268[var5], 255)], arg0.field6270[var5] << 24);
                                 ++var5;
                                 ++var8;
                              }

                              if (!var3) {
                                 ++var7;
                                 break;
                              }

                              ++var8;
                           }
                        } while(~arg0.field6267 < ~var7);
                     }

                     if (!var3) {
                        break label106;
                     }
                  }

                  int var9 = 0;
                  if (var3 || ~var9 > ~arg0.field6267) {
                     do {
                        int var10 = 0;
                        if (var3 || ~var10 > ~arg0.field6269) {
                           do {
                              int var11 = arg0.field6264[255 & arg0.field6268[var5++]];
                              var4[var6++] = var11 != 0 ? class300.method2238(var11, -16777216) : 0;
                              ++var10;
                           } while(~var10 > ~arg0.field6269);
                        }

                        ++var9;
                     } while(~var9 > ~arg0.field6267);
                  }
               }

               var12 = this.method548(-19069, arg0.field6267, var4, arg0.field6269, arg0.field6269, 0);
               if (!var3) {
                  break label102;
               }
            }

            var12 = this.method548(-19069, 1, new int[1], 1, 1, 0);
         }

         var12.method961(arg0.field6265, arg0.field6262, arg0.field6266, arg0.field6263);
         return var12;
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field5367[133] + (arg0 != null ? field5367[3] : field5367[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "e",
      descriptor = "(Z)Lvm;"
   )
   public final class716 method2774(boolean arg0) {
      try {
         if (!arg0) {
            this.field5218 = null;
         }

         ++field5087;
         return this.field5240;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[86] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "C",
      descriptor = "(I)V"
   )
   public abstract void method2593(int arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "M",
      descriptor = "()I"
   )
   public final int method524() {
      try {
         ++field5212;
         return this.field5365;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5367[38] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(FFFFFIF)Z"
   )
   private final boolean method2775(float arg0, float arg1, float arg2, float arg3, float arg4, int arg5, float arg6) {
      try {
         ++field5048;
         Buffer var8 = this.field5343.method1407(true, true);
         if (var8 == null) {
            return false;
         } else {
            Stream var9 = this.method2805(-105, var8);
            if (arg5 != -9665) {
               this.field5179 = null;
            }

            label20: {
               if (Stream.method5106()) {
                  var9.method5098(arg6);
                  var9.method5098(arg3);
                  var9.method5098(arg4);
                  var9.method5098(arg2);
                  var9.method5098(arg0);
                  var9.method5098(arg1);
                  if (!client.field4360) {
                     break label20;
                  }
               }

               var9.method5104(arg6);
               var9.method5104(arg3);
               var9.method5104(arg4);
               var9.method5104(arg2);
               var9.method5104(arg0);
               var9.method5104(arg1);
            }

            var9.method5102();
            return this.field5343.method1409((byte)-88);
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field5367[18] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "L",
      descriptor = "(I)V"
   )
   private final void method2776(int arg0) {
      try {
         ++field5047;
         if (arg0 != 13) {
            this.method583();
         }

         if (class354.field4772 != this.field5286) {
            class139 var2 = this.field5286;
            this.field5286 = class354.field4772;
            if (!var2.method1102((byte)115)) {
               this.method2812((byte)38);
            }

            this.method2742(1);
            this.field5288 = this.field5306;
            this.method2808((byte)-88);
            this.field5295 &= -8;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[103] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method2777(byte arg0) {
      try {
         if (arg0 < 34) {
            this.field5329 = null;
         }

         ++field5139;
         return this.field5298;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[142] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "i",
      descriptor = "(B)V"
   )
   public abstract void method2573(byte arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V"
   )
   public abstract void method2583(Object arg0, Canvas arg1, byte arg2);

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         ++field5140;
         float var8 = (float)(-arg0) + (float)arg2;
         float var9 = (float)arg3 - (float)arg1;
         float var10 = 0.0F;
         float var11 = 1.0F;
         if (var8 != 0.0F || var9 != 0.0F) {
            var11 = (float)Math.sqrt((double)(var8 * var8 + var9 * var9));
            var10 = (float)Math.atan2((double)var9, (double)var8);
         }

         this.method2762((byte)-120);
         this.method2752(arg4, (byte)50);
         this.method2814(0, class304.field4150, true);
         this.method2787(class304.field4150, (byte)-51, 0);
         this.method2749(31, arg6);
         this.field5236.method5199((float)arg5, 120, var11, 1.0F);
         this.field5236.method1215(0, -arg5 / 2, 0);
         this.field5236.method1229((int)((double)var10 * 2607.5945876176133D) & 16383);
         this.field5236.method1215(arg0, arg1, 0);
         this.method2744(false);
         this.method2579(0, false);
         this.method2791(0);
         this.method2579(0, true);
         this.method2787(class10.field93, (byte)-51, 0);
         this.method2814(0, class10.field93, true);
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field5367[162] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(BLoba;)V"
   )
   public final void method2778(byte arg0, class274 arg1) {
      try {
         this.field5342[this.field5309] = arg1;
         ++field5102;
         if (arg0 > -107) {
            this.method2743(82, true, (class371)null, (byte[])null, -12, -84);
         }

         this.method2761(17759);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[111] + arg0 + ',' + (arg1 != null ? field5367[3] : field5367[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(Ljava/lang/Object;ZLjava/awt/Canvas;)V"
   )
   public abstract void method2622(Object arg0, boolean arg1, Canvas arg2);

   @OriginalMember(
      owner = "client!sc",
      name = "O",
      descriptor = "(I)Lofa;"
   )
   public final class349 method2779(int arg0) {
      try {
         int var2 = 58 % (arg0 / 51);
         ++field5091;
         return this.field5277 == null ? null : this.field5277.method2195((byte)96);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[26] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "q",
      descriptor = "(I)Lvm;"
   )
   public final class716 method2780(int arg0) {
      try {
         int var2 = 29 / ((-47 - arg0) / 52);
         ++field5068;
         return this.field5302[this.field5309];
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[41] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "j",
      descriptor = "(B)V"
   )
   private final void method2781(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(B[Lhja;)Lbr;"
   )
   public abstract class418 method2587(byte arg0, class430[] arg1);

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(BB)V"
   )
   public final void method2782(byte arg0, byte arg1) {
      try {
         this.method2752(arg1 << 8 | arg1 << 16 | arg1 << 24 | arg1, (byte)50);
         ++field5119;
         if (arg0 != 86) {
            this.method608(23, 58, -16, -27, 117, 38);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[102] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method530(int arg0) {
      try {
         ++field5168;
         if (~arg0 <= -129 && arg0 <= 1024) {
            if (this.field5340 != null) {
               this.field5340.method4470(false);
            }

            this.field5305 = arg0;
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[55] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "K",
      descriptor = "(I)V"
   )
   public abstract void method2612(int arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "za",
      descriptor = "(IIIII)V"
   )
   public final void method542(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field5066;
         this.method2762((byte)-38);
         this.method2752(arg3, (byte)50);
         this.method2814(0, class304.field4150, true);
         this.method2787(class304.field4150, (byte)-51, 0);
         this.method2749(24, arg4);
         this.field5236.method5199((float)arg2, 117, (float)arg2, 1.0F);
         this.field5236.method1215(arg0, arg1, 0);
         this.method2744(false);
         this.method2579(0, false);
         this.method2585(12, 0, this.field5350);
         this.method2621(this.field5361, -18344);
         this.method2603(class62.field761, 256, 0, 101);
         this.method2579(0, true);
         this.method2787(class10.field93, (byte)-51, 0);
         this.method2814(0, class10.field93, true);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field5367[17] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "d",
      descriptor = "(Z)V"
   )
   private final void method2783(boolean arg0) {
      try {
         ++field5151;
         this.field5343 = this.method2615(79, arg0);
         this.field5343.method1410(24, 12, 83);
         this.field5358 = this.method2587((byte)-121, new class430[]{new class430(class744.field10836)});
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[147] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "z",
      descriptor = "(B)V"
   )
   private final void method2784(byte arg0) {
      try {
         ++field5214;
         if (class622.field9157 != this.field5286) {
            class139 var2 = this.field5286;
            this.field5286 = class622.field9157;
            if (!var2.method1102((byte)-69)) {
               this.method2812((byte)-121);
            }

            this.method2769(102);
            this.field5288 = this.field5264;
            this.method2808((byte)-88);
            this.field5295 &= -8;
         }

         if (arg0 != -6) {
            this.method506(109, -51);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[44] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method2785(boolean arg0, int arg1) {
      try {
         ++field5132;
         if (!arg0 == this.field5328) {
            this.field5328 = arg0;
            this.method2610(25970);
            this.field5295 &= -32;
         }

         int var3 = 44 / ((arg1 - -16) / 54);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5367[78] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "A",
      descriptor = "(ILaa;II)V"
   )
   public final void method527(int arg0, class515 arg1, int arg2, int arg3) {
      try {
         ++field5122;
         class689 var5 = (class689)arg1;
         class272 var6 = var5.field10149;
         this.method2801(93);
         this.method2804(var6, -2);
         this.method2749(102, 1);
         this.method2745(-30, class603.field8872, class603.field8872);
         this.method2814(0, class304.field4150, true);
         this.method2752(arg0, (byte)50);
         this.field5236.method5199((float)this.field5117, 118, (float)this.field5100, 0.0F);
         this.method2744(false);
         this.field5302[0].method5199(var6.method274(11535, (float)this.field5117), 112, var6.method282((float)this.field5100, (byte)26), 1.0F);
         this.field5302[0].method5198(0.0F, var6.method282((float)(-arg2), (byte)26), var6.method274(11535, (float)(-arg3)), (byte)-76);
         this.field5342[0] = class148.field1961;
         this.method2761(17759);
         this.method2791(0);
         this.method2794((byte)-122);
         this.method2814(0, class10.field93, true);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field5367[5] + arg0 + ',' + (arg1 != null ? field5367[3] : field5367[4]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(ILvm;)V"
   )
   public final void method2786(int arg0, class716 arg1) {
      try {
         ++field5159;
         this.field5236.method1230(arg1);
         this.field5235 = false;
         if (arg0 != -13408) {
            this.field5318 = 69;
         }

         this.method2823(0);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[149] + arg0 + ',' + (arg1 != null ? field5367[3] : field5367[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(I[Lmn;)V"
   )
   public final void method553(int arg0, class389[] arg1) {
      boolean var3 = client.field4360;

      try {
         ++field5060;
         int var4 = 0;
         if (var3) {
            this.field5329[var4] = arg1[var4];
            ++var4;
         }

         while(true) {
            class369 var10000;
            if (~var4 <= ~arg0) {
               this.field5256 = arg0;
               var10000 = this;
               if (!var3) {
                  if (this.field5286.method1102((byte)29)) {
                     this.method2620(0);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = this;
            }

            var10000.field5329[var4] = arg1[var4];
            ++var4;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5367[160] + arg0 + ',' + (arg1 != null ? field5367[3] : field5367[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "DA",
      descriptor = "(IIII)V"
   )
   public final void method492(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field5254 = arg0;
         this.field5242 = arg1;
         ++field5054;
         this.field5336 = arg2;
         this.field5327 = arg3;
         this.method2809(1);
         this.method2807(-111);
         this.method2768((byte)-59);
         this.method2802((byte)89);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5367[125] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(Ltn;BI)V"
   )
   public final void method2787(class95 arg0, byte arg1, int arg2) {
      try {
         if (arg1 != -51) {
            method2815(-47, -114, 69, 75, 40, -54, 113, 71, (byte)71);
         }

         this.method2637(79, arg2, arg0, false);
         ++field5143;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5367[43] + (arg0 != null ? field5367[3] : field5367[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "P",
      descriptor = "(I)V"
   )
   public final void method2788(int arg0) {
      try {
         int var2 = 124 / ((arg0 - -66) / 55);
         ++field5142;
         this.method2768((byte)125);
         this.method2808((byte)-88);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[128] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "d",
      descriptor = "(II)I"
   )
   public final int method543(int arg0, int arg1) {
      try {
         ++field5230;
         return arg1 | arg0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[54] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(ILlg;I)V"
   )
   private final void method2789(int arg0, class437 arg1, int arg2) {
      try {
         ++field5072;
         this.method2585(12, 0, this.field5348);
         this.method2621(this.field5363, -18344);
         this.method2603(arg1, arg2, 0, 90);
         if (arg0 != -14677) {
            this.method2807(-72);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5367[51] + arg0 + ',' + (arg1 != null ? field5367[3] : field5367[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(Lew;)V"
   )
   public final void method532(class521 arg0) {
      try {
         this.field5237 = (class716)arg0;
         ++field5052;
         this.field5239.method1230(this.field5237);
         this.field5239.method5211(78);
         this.field5240.method5204(-9838, this.field5239);
         this.field5238.method5204(-9838, this.field5237);
         if (this.field5286.method1102((byte)115)) {
            this.method2812((byte)-117);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[104] + (arg0 != null ? field5367[3] : field5367[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "c",
      descriptor = "(BI)V"
   )
   public abstract void method2582(byte arg0, int arg1);

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(Z[F)[F"
   )
   public final float[] method2790(boolean arg0, float[] arg1) {
      try {
         arg1[0] = this.field5288[0];
         arg1[8] = this.field5288[2];
         ++field5105;
         arg1[4] = this.field5288[1];
         arg1[12] = this.field5288[3];
         arg1[1] = this.field5288[4];
         arg1[9] = this.field5288[6];
         arg1[2] = this.field5288[8];
         arg1[5] = this.field5288[5];
         arg1[13] = this.field5288[7];
         arg1[3] = this.field5288[12];
         arg1[10] = this.field5288[10];
         arg1[14] = this.field5288[11];
         if (arg0) {
            return null;
         } else {
            arg1[6] = this.field5288[9];
            arg1[7] = this.field5288[13];
            arg1[15] = this.field5288[15];
            arg1[11] = this.field5288[14];
            return arg1;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[153] + arg0 + ',' + (arg1 != null ? field5367[3] : field5367[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "db",
      descriptor = "(I)V"
   )
   public final void method2791(int arg0) {
      try {
         this.method2789(-14677, class62.field761, 2);
         if (arg0 != 0) {
            this.method524();
         }

         ++field5229;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[76] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "fb",
      descriptor = "(I)V"
   )
   public abstract void method2584(int arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "l",
      descriptor = "(B)V"
   )
   public final void method2792(byte arg0) {
      try {
         if (arg0 > -6) {
            this.method613((Canvas)null);
         }

         ++field5123;
         if (this.field5295 != 16) {
            this.method2776(13);
            this.method2811((byte)-128, true);
            this.method2785(true, 74);
            this.method2750(true, (byte)22);
            this.method2749(91, 1);
            this.field5295 = 16;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[115] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(IIIIZ[BLak;I)Lfc;"
   )
   public abstract class272 method2606(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5, class371 arg6, int arg7);

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;"
   )
   public abstract Object method2624(Canvas arg0, int arg1);

   @OriginalMember(
      owner = "client!sc",
      name = "Q",
      descriptor = "(IIIIII[BII)V"
   )
   public final void method610(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
      try {
         ++field5147;
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field5367[176] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field5367[3] : field5367[4]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "v",
      descriptor = "(B)I"
   )
   public final int method2793(byte arg0) {
      try {
         ++field5094;
         if (arg0 <= 120) {
            this.field5270 = true;
         }

         return this.field5253;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[32] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(Llc;)V"
   )
   public final void method561(class676 arg0) {
      try {
         ++field5197;
         this.field5277 = (class328)arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[25] + (arg0 != null ? field5367[3] : field5367[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "V",
      descriptor = "(I)V"
   )
   public abstract void method2577(int arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "T",
      descriptor = "(IIII)V"
   )
   public final void method547(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field5057;
         boolean var5 = false;
         if (arg0 > this.field5275) {
            var5 = true;
            this.field5275 = arg0;
         }

         if (~arg2 > ~this.field5323) {
            this.field5323 = arg2;
            var5 = true;
         }

         if (arg1 > this.field5326) {
            var5 = true;
            this.field5326 = arg1;
         }

         if (this.field5339 > arg3) {
            this.field5339 = arg3;
            var5 = true;
         }

         if (var5) {
            if (!this.field5366) {
               this.field5366 = true;
               this.method2601(0);
            }

            this.method2592((byte)-101);
            this.method2802((byte)119);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field5367[73] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "f",
      descriptor = "(B)V"
   )
   public final void method2794(byte arg0) {
      try {
         if (arg0 != -122) {
            this.method493(false);
         }

         if (this.field5342[this.field5309] != class552.field7905) {
            this.field5342[this.field5309] = class552.field7905;
            this.field5302[this.field5309].method1220();
            this.method2761(arg0 + 17881);
         }

         ++field5067;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[164] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(BLns;)V"
   )
   public abstract void method2607(byte arg0, class427 arg1);

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V"
   )
   public final void method586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class515 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      try {
         ++field5063;
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field5367[99] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field5367[3] : field5367[4]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "j",
      descriptor = "()Z"
   )
   public final boolean method538() {
      try {
         ++field5180;
         return true;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5367[140] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "s",
      descriptor = "(B)V"
   )
   public abstract void method2592(byte arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "o",
      descriptor = "(B)V"
   )
   public final void method2795(byte arg0) {
      try {
         this.field5236.method1220();
         ++field5129;
         this.field5235 = true;
         this.method2823(0);
         if (arg0 < 122) {
            this.field5062 = 89;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[20] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "D",
      descriptor = "(I)V"
   )
   public static final void method2796(int arg0) {
      boolean var1 = client.field4360;

      try {
         ++field5149;
         if (class11.field128) {
            if (arg0 != -4273) {
               field5077 = -10;
            }

            do {
               while(~class316.field4305.length < ~class745.field10935) {
                  class503 var2 = class316.field4305[class745.field10935];
                  if (var2 == null || var2.field7298 != -1) {
                     ++class745.field10935;
                     if (!var1) {
                        continue;
                     }
                  }

                  if (class2.field1 == null) {
                     class2.field1 = class456.field6494.method4836(var2.field7297, 1);
                  }

                  int var3 = class2.field1.field1463;
                  if (var3 == -1) {
                     return;
                  }

                  ++class745.field10935;
                  var2.field7298 = var3;
                  class2.field1 = null;
               }
            } while(var1);

         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5367[37] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "L",
      descriptor = "(III)V"
   )
   public final void method590(int arg0, int arg1, int arg2) {
      try {
         if (this.field5269 != arg0 || ~this.field5285 != ~arg1 || this.field5263 != arg2) {
            this.field5285 = arg1;
            this.field5263 = arg2;
            this.field5269 = arg0;
            this.method2816(3);
            this.method2617(false);
         }

         ++field5209;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5367[49] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "i",
      descriptor = "()I"
   )
   public final int method595() {
      try {
         ++field5135;
         return this.field5258;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5367[47] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "A",
      descriptor = "(I)V"
   )
   private final void method2797(int arg0) {
      try {
         if (class786.field11543 != this.field5286) {
            class139 var2 = this.field5286;
            this.field5286 = class786.field11543;
            if (var2.method1102((byte)108)) {
               this.method2812((byte)-104);
            }

            this.method2757(-2730);
            this.field5288 = this.field5294;
            this.method2808((byte)-88);
            this.field5295 &= -25;
         }

         if (arg0 < -41) {
            ++field5163;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[85] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "bb",
      descriptor = "(I)V"
   )
   public abstract void method2581(int arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "d",
      descriptor = "(I)V"
   )
   public abstract void method2578(int arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "([FZIIILak;)Lfc;"
   )
   public final class272 method2798(float[] arg0, boolean arg1, int arg2, int arg3, int arg4, class371 arg5) {
      try {
         if (arg3 != 0) {
            this.field5279 = 111;
         }

         ++field5189;
         return this.method2596(arg1, 0, (byte)-127, arg2, arg0, arg4, 0, arg5);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field5367[31] + (arg0 != null ? field5367[3] : field5367[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field5367[3] : field5367[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(ZLria;Lak;)Z"
   )
   public abstract boolean method2636(boolean arg0, class301 arg1, class371 arg2);

   @OriginalMember(
      owner = "client!sc",
      name = "y",
      descriptor = "()Z"
   )
   public final boolean method503() {
      try {
         ++field5136;
         return true;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5367[95] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(IIIIII)Llc;"
   )
   public final class676 method578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field5156;
         return new class292(this, arg0, arg1, arg2, arg3, arg4, arg5);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field5367[130] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(Ltn;IIZZ)V"
   )
   public abstract void method2635(class95 arg0, int arg1, int arg2, boolean arg3, boolean arg4);

   @OriginalMember(
      owner = "client!sc",
      name = "q",
      descriptor = "()Z"
   )
   public final boolean method507() {
      try {
         ++field5090;
         return true;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5367[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(Lria;BLak;)Z"
   )
   public abstract boolean method2599(class301 arg0, byte arg1, class371 arg2);

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "([[IZIZ)Lofa;"
   )
   public abstract class349 method2609(int[][] arg0, boolean arg1, int arg2, boolean arg3);

   @OriginalMember(
      owner = "client!sc",
      name = "w",
      descriptor = "()Z"
   )
   public final boolean method505() {
      try {
         ++field5099;
         return false;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5367[92] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "P",
      descriptor = "(IIIII)V"
   )
   public final void method520(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.method589(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
         ++field5101;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field5367[16] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(Lria;IIILak;)Lfc;"
   )
   public abstract class272 method2619(class301 arg0, int arg1, int arg2, int arg3, class371 arg4);

   @OriginalMember(
      owner = "client!sc",
      name = "b",
      descriptor = "(BZ)V"
   )
   public final void method2799(byte arg0, boolean arg1) {
      try {
         if (arg0 <= 108) {
            this.method2791(41);
         }

         if (this.field5299 != arg1) {
            this.field5299 = arg1;
            this.method2578(-4957);
            this.field5295 &= -8;
         }

         ++field5153;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[141] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "E",
      descriptor = "(I)V"
   )
   public abstract void method2610(int arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "e",
      descriptor = "(B)V"
   )
   public final void method2800(byte arg0) {
      boolean var2 = client.field4360;

      try {
         ++field5203;
         Enumeration var3 = this.field5130.keys();
         Canvas var4;
         if (var2) {
            var4 = (Canvas)var3.nextElement();
            this.method2583(this.field5130.get(var4), var4, (byte)61);
         }

         while(true) {
            Object var10000;
            if (!var3.hasMoreElements()) {
               this.field5348.method1412(63);
               this.field5343.method1412(72);
               this.field5350.method1412(127);
               this.field5349.method1252((byte)-126);
               this.field5362.method1252((byte)-126);
               this.field5359.method1252((byte)-127);
               this.field5364.method1252((byte)-128);
               int var5 = 86 / ((arg0 - -10) / 54);
               this.field5356.method1252((byte)-126);
               this.field5268.method2913((byte)23);
               var10000 = this.field5345;
               if (!var2) {
                  ((class576)var10000).method1412(118);
                  return;
               }
            } else {
               var10000 = var3.nextElement();
            }

            var4 = (Canvas)var10000;
            this.method2583(this.field5130.get(var4), var4, (byte)61);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field5367[100] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "w",
      descriptor = "(I)V"
   )
   public final void method2801(int arg0) {
      try {
         ++field5184;
         if (arg0 < 53) {
            this.field5349 = null;
         }

         if (this.field5295 != 2) {
            this.method2797(-53);
            this.method2811((byte)-99, false);
            this.method2799((byte)121, false);
            this.method2785(false, 88);
            this.method2750(false, (byte)22);
            this.method2741(false, 20, -2, false);
            this.field5295 = 2;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[68] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "da",
      descriptor = "(III[I)V"
   )
   public final void method599(int arg0, int arg1, int arg2, int[] arg3) {
      try {
         float var5;
         int var6;
         int var7;
         label25: {
            ++field5162;
            var5 = this.field5237.method5203((float)arg1, (float)arg0, (byte)-97, (float)arg2);
            if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
               var6 = this.field5254;
               var7 = this.field5242;
               if (!client.field4360) {
                  break label25;
               }
            }

            var6 = (int)((float)this.field5336 * this.field5237.method5194((float)arg1, (byte)66, (float)arg2, (float)arg0) / var5);
            var7 = (int)((float)this.field5327 * this.field5237.method5197((float)arg0, (float)arg1, (float)arg2, (byte)-105) / var5);
         }

         arg3[2] = (int)var5;
         arg3[1] = (int)((float)var7 - this.field5319);
         arg3[0] = (int)((float)var6 + -this.field5245);
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field5367[106] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5367[3] : field5367[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "t",
      descriptor = "(B)V"
   )
   private final void method2802(byte arg0) {
      try {
         ++field5121;
         this.field5245 = (float)(-this.field5254 + this.field5275);
         this.field5247 = (float)(-this.field5254 + this.field5323);
         this.field5297 = (float)(-this.field5242 + this.field5339);
         int var2 = 9 / ((31 - arg0) / 38);
         this.field5319 = (float)(-this.field5242 + this.field5326);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[172] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(IILtn;Z)V"
   )
   public abstract void method2637(int arg0, int arg1, class95 arg2, boolean arg3);

   @OriginalMember(
      owner = "client!sc",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method570(int arg0) {
      try {
         ++field5226;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[58] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "ZA",
      descriptor = "(IFFFFF)V"
   )
   public final void method582(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      try {
         ++field5178;
         boolean var7 = this.field5317 != arg0;
         if (var7 || this.field5244 != arg1 || this.field5257 != arg2) {
            this.field5244 = arg1;
            this.field5257 = arg2;
            this.field5317 = arg0;
            if (var7) {
               this.field5296 = (float)(this.field5317 & 16711680) / 1.671168E7F;
               this.field5283 = (float)(255 & this.field5317) / 255.0F;
               this.field5322 = (float)(this.field5317 & 65280) / 65280.0F;
               this.method2586(true);
            }

            this.field5218.setSunColour(this.field5296, this.field5322, this.field5283, arg1, arg2);
            this.method2625((byte)70);
         }

         if (this.field5314[0] != arg3 || this.field5314[1] != arg4 || this.field5314[2] != arg5) {
            this.field5314[2] = arg5;
            this.field5314[0] = arg3;
            this.field5314[1] = arg4;
            this.field5246[2] = -arg5;
            this.field5246[0] = -arg3;
            this.field5246[1] = -arg4;
            float var8 = (float)(1.0D / Math.sqrt((double)(arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field5338[2] = arg5 * var8;
            this.field5338[1] = arg4 * var8;
            this.field5338[0] = arg3 * var8;
            this.field5321[0] = -this.field5338[0];
            this.field5321[2] = -this.field5338[2];
            this.field5321[1] = -this.field5338[1];
            this.field5218.setSunDirection(this.field5338[0], this.field5338[1], this.field5338[2]);
            this.method2588(126);
            this.field5300 = (int)(arg3 * 256.0F / arg4);
            this.field5267 = (int)(arg5 * 256.0F / arg4);
         }

         this.method2591(-110);
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field5367[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(IIZ)Lbg;"
   )
   public final class492 method565(int arg0, int arg1, boolean arg2) {
      try {
         ++field5112;
         return new class400(this, arg0, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5367[161] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "t",
      descriptor = "()Lew;"
   )
   public final class521 method598() {
      try {
         ++field5150;
         return this.field5354;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5367[157] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "m",
      descriptor = "(B)V"
   )
   public final void method2803(byte arg0) {
      try {
         ++field5167;
         if (arg0 >= -68) {
            this.field5255 = -1.7506207F;
         }

         if (this.field5295 != 8) {
            this.method2784((byte)-6);
            this.method2811((byte)-94, true);
            this.method2785(true, -126);
            this.method2750(true, (byte)22);
            this.method2749(56, 1);
            this.field5295 = 8;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(Lm;I)V"
   )
   public final void method2804(class205 arg0, int arg1) {
      try {
         if (arg1 == -2) {
            if (this.field5315[this.field5309] != arg0) {
               label29: {
                  this.field5315[this.field5309] = arg0;
                  if (arg0 == null) {
                     this.method2627((byte)-125);
                     if (!client.field4360) {
                        break label29;
                     }
                  }

                  arg0.method1423(3038);
               }

               this.field5295 &= -2;
            }

            ++field5161;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[23] + (arg0 != null ? field5367[3] : field5367[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(ILjaclib/memory/Buffer;)Ljaclib/memory/Stream;"
   )
   public final Stream method2805(int arg0, Buffer arg1) {
      try {
         this.field5261.method5112(arg1);
         if (arg0 >= -58) {
            this.field5250 = -117;
         }

         ++field5098;
         return this.field5261;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[159] + arg0 + ',' + (arg1 != null ? field5367[3] : field5367[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "E",
      descriptor = "()I"
   )
   public final int method545() {
      try {
         ++field5078;
         return this.field5234 - -this.field5232 - -this.field5231;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5367[70] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "p",
      descriptor = "(B)V"
   )
   private final void method2806(byte arg0) {
      try {
         ++field5076;
         this.field5304 = false;
         if (class786.field11543 == this.field5286) {
            this.method2757(arg0 + -2799);
            this.method2808((byte)-88);
         }

         if (arg0 != 69) {
            this.field5279 = 62;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[165] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(IZ)V"
   )
   public abstract void method2579(int arg0, boolean arg1);

   @OriginalMember(
      owner = "client!sc",
      name = "Q",
      descriptor = "(I)V"
   )
   private final void method2807(int arg0) {
      try {
         this.field5282 = false;
         ++field5175;
         if (arg0 > -8) {
            this.method2778((byte)87, (class274)null);
         }

         this.method2769(107);
         if (class622.field9157 == this.field5286) {
            this.method2808((byte)-88);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[168] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(IIIIZ)Lbg;"
   )
   public final class492 method552(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         ++field5059;
         class400 var6 = new class400(this, arg2, arg3, arg4);
         var6.method423(0, 0, arg2, arg3, arg0, arg1);
         return var6;
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field5367[173] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "v",
      descriptor = "()V"
   )
   public void method544() {
      boolean var1 = client.field4360;

      try {
         if (!this.field5310) {
            class428 var2 = this.field5056.method2933(2);
            if (var1) {
               ((class403)var2).method3039(70);
               var2 = this.field5056.method2940(false);
            }

            label44:
            while(true) {
               if (var2 == null) {
                  Enumeration var3 = this.field5130.keys();
                  if (!var1) {
                     Canvas var4;
                     if (var1) {
                        var4 = (Canvas)var3.nextElement();
                        this.method2583(this.field5130.get(var4), var4, (byte)61);
                     }

                     while(true) {
                        Object var10000;
                        if (!var3.hasMoreElements()) {
                           class165.method1365(-124, true, false);
                           this.field5218.release();
                           var10000 = this;
                           if (!var1) {
                              this.field5310 = true;
                              break label44;
                           }
                        } else {
                           var10000 = var3.nextElement();
                        }

                        var4 = (Canvas)var10000;
                        this.method2583(this.field5130.get(var4), var4, (byte)61);
                     }
                  }
               } else {
                  ((class403)var2).method3039(70);
               }

               var2 = this.field5056.method2940(false);
            }
         }

         ++field5204;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5367[119] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method546(int[] arg0) {
      try {
         arg0[0] = this.field5100;
         ++field5169;
         arg0[1] = this.field5117;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[28] + (arg0 != null ? field5367[3] : field5367[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "x",
      descriptor = "(B)V"
   )
   private final void method2808(byte arg0) {
      try {
         if (arg0 != -88) {
            this.method2745(63, (class793)null, (class793)null);
         }

         this.method2573((byte)85);
         ++field5108;
         if (this.field5337 != null) {
            this.field5337.method315((byte)44);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[50] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "k",
      descriptor = "()Z"
   )
   public final boolean method511() {
      try {
         ++field5116;
         return false;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5367[158] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "xa",
      descriptor = "(F)V"
   )
   public final void method534(float arg0) {
      try {
         if (this.field5255 != arg0) {
            this.field5255 = arg0;
            this.field5218.setAmbient(arg0);
            this.method2586(true);
            this.method2591(-124);
         }

         ++field5074;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[48] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "M",
      descriptor = "(I)V"
   )
   private final void method2809(int arg0) {
      try {
         this.field5265 = false;
         ++field5193;
         this.method2742(arg0);
         if (class354.field4772 == this.field5286) {
            this.method2808((byte)-88);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[46] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "T",
      descriptor = "(I)V"
   )
   private final void method2810(int arg0) {
      boolean var2 = client.field4360;

      try {
         ++field5170;
         this.field5348 = this.method2615(79, false);
         this.field5348.method1410(140, 28, 88);
         int var3 = 0;
         class369 var10000;
         if (arg0 < 24) {
            this.field5343 = null;
            if (var2) {
               var10000 = this;
            } else if (var3 >= 4) {
               var10000 = this;
               if (!var2) {
                  this.field5363 = this.method2587((byte)-78, new class430[]{new class430(new class744[]{class744.field10836, class744.field10848, class744.field10848})});
                  return;
               }
            } else {
               var10000 = this;
            }
         } else if (var3 >= 4) {
            var10000 = this;
            if (!var2) {
               this.field5363 = this.method2587((byte)-78, new class430[]{new class430(new class744[]{class744.field10836, class744.field10848, class744.field10848})});
               return;
            }
         } else {
            var10000 = this;
         }

         do {
            while(true) {
               Buffer var4 = var10000.field5348.method1407(true, true);
               if (var4 != null) {
                  Stream var5 = this.method2805(-71, var4);
                  if (Stream.method5106()) {
                     var5.method5098(0.0F);
                     var5.method5098(0.0F);
                     var5.method5098(0.0F);
                     var5.method5098(0.0F);
                     var5.method5098(0.0F);
                     var5.method5098(0.0F);
                     var5.method5098(0.0F);
                     var5.method5098(0.0F);
                     var5.method5098(1.0F);
                     var5.method5098(0.0F);
                     var5.method5098(0.0F);
                     var5.method5098(1.0F);
                     var5.method5098(0.0F);
                     var5.method5098(1.0F);
                     var5.method5098(1.0F);
                     var5.method5098(1.0F);
                     var5.method5098(0.0F);
                     var5.method5098(1.0F);
                     var5.method5098(1.0F);
                     var5.method5098(1.0F);
                     var5.method5098(1.0F);
                     var5.method5098(1.0F);
                     var5.method5098(0.0F);
                     var5.method5098(0.0F);
                     var5.method5098(1.0F);
                     var5.method5098(0.0F);
                     var5.method5098(1.0F);
                     var5.method5098(0.0F);
                     var5.method5098(0.0F);
                     var5.method5098(0.0F);
                     var5.method5098(0.0F);
                     var5.method5098(0.0F);
                     var5.method5098(0.0F);
                     var5.method5098(0.0F);
                     var5.method5098(0.0F);
                     if (var2) {
                        var5.method5104(0.0F);
                        var5.method5104(0.0F);
                        var5.method5104(0.0F);
                        var5.method5104(0.0F);
                        var5.method5104(0.0F);
                        var5.method5104(0.0F);
                        var5.method5104(0.0F);
                        var5.method5104(0.0F);
                        var5.method5104(1.0F);
                        var5.method5104(0.0F);
                        var5.method5104(0.0F);
                        var5.method5104(1.0F);
                        var5.method5104(0.0F);
                        var5.method5104(1.0F);
                        var5.method5104(1.0F);
                        var5.method5104(1.0F);
                        var5.method5104(0.0F);
                        var5.method5104(1.0F);
                        var5.method5104(1.0F);
                        var5.method5104(1.0F);
                        var5.method5104(1.0F);
                        var5.method5104(1.0F);
                        var5.method5104(0.0F);
                        var5.method5104(0.0F);
                        var5.method5104(1.0F);
                        var5.method5104(0.0F);
                        var5.method5104(1.0F);
                        var5.method5104(0.0F);
                        var5.method5104(0.0F);
                        var5.method5104(0.0F);
                        var5.method5104(0.0F);
                        var5.method5104(0.0F);
                        var5.method5104(0.0F);
                        var5.method5104(0.0F);
                        var5.method5104(0.0F);
                     }
                  } else {
                     var5.method5104(0.0F);
                     var5.method5104(0.0F);
                     var5.method5104(0.0F);
                     var5.method5104(0.0F);
                     var5.method5104(0.0F);
                     var5.method5104(0.0F);
                     var5.method5104(0.0F);
                     var5.method5104(0.0F);
                     var5.method5104(1.0F);
                     var5.method5104(0.0F);
                     var5.method5104(0.0F);
                     var5.method5104(1.0F);
                     var5.method5104(0.0F);
                     var5.method5104(1.0F);
                     var5.method5104(1.0F);
                     var5.method5104(1.0F);
                     var5.method5104(0.0F);
                     var5.method5104(1.0F);
                     var5.method5104(1.0F);
                     var5.method5104(1.0F);
                     var5.method5104(1.0F);
                     var5.method5104(1.0F);
                     var5.method5104(0.0F);
                     var5.method5104(0.0F);
                     var5.method5104(1.0F);
                     var5.method5104(0.0F);
                     var5.method5104(1.0F);
                     var5.method5104(0.0F);
                     var5.method5104(0.0F);
                     var5.method5104(0.0F);
                     var5.method5104(0.0F);
                     var5.method5104(0.0F);
                     var5.method5104(0.0F);
                     var5.method5104(0.0F);
                     var5.method5104(0.0F);
                  }

                  var5.method5102();
                  if (this.field5348.method1409((byte)117)) {
                     if (!var2) {
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
                  if (!var2) {
                     this.field5363 = this.method2587((byte)-78, new class430[]{new class430(new class744[]{class744.field10836, class744.field10848, class744.field10848})});
                     return;
                  }
               } else {
                  var10000 = this;
               }
            }
         } while(var2);

         this.field5363 = this.method2587((byte)-78, new class430[]{new class430(new class744[]{class744.field10836, class744.field10848, class744.field10848})});
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field5367[77] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(BZ)V"
   )
   public final void method2811(byte arg0, boolean arg1) {
      try {
         if (arg0 >= -69) {
            this.method2764(70);
         }

         ++field5071;
         if (!this.field5333 == arg1) {
            this.field5333 = arg1;
            this.method2617(false);
            this.field5295 &= -32;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[69] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "y",
      descriptor = "(B)V"
   )
   private final void method2812(byte arg0) {
      try {
         this.field5274 = false;
         ++field5106;
         int var2 = 117 % ((-38 - arg0) / 61);
         if (this.field5337 != null) {
            this.field5337.method316(67);
         }

         this.method2584(0);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[166] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "g",
      descriptor = "(Z)V"
   )
   public abstract void method2602(boolean arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "b",
      descriptor = "(ZI)V"
   )
   public final void method2813(boolean arg0, int arg1) {
      try {
         ++field5181;
         if (arg1 != 8) {
            this.field5353 = null;
         }

         if (arg0 == !this.field5335) {
            this.field5335 = arg0;
            this.method2617(false);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[117] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "<init>",
      descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Lkf;II)V"
   )
   public class369(Canvas arg0, Object arg1, class162 arg2, class266 arg3, int arg4, int arg5) {
      boolean var7 = client.field4360;
      super(arg2);
      this.field5056 = new class387();
      this.field5235 = true;
      this.field5236 = new class716();
      this.field5237 = new class716();
      this.field5238 = new class716();
      this.field5239 = new class716();
      this.field5240 = new class716();
      this.field5241 = new class716();
      this.field5271 = new class141[10];
      this.field5255 = 1.0F;
      this.field5260 = false;
      this.field5276 = false;
      this.field5274 = false;
      this.field5248 = 0;
      this.field5283 = 1.0F;
      this.field5264 = new float[16];
      this.field5254 = 0;
      this.field5258 = 50;
      this.field5273 = 0;
      this.field5292 = false;
      this.field5286 = class614.field9022;
      this.field5244 = -1.0F;
      this.field5298 = -1;
      this.field5311 = 3584.0F;
      this.field5287 = class701.field10254;
      this.field5309 = 0;
      this.field5265 = false;
      this.field5242 = 0;
      this.field5279 = 3;
      this.field5306 = new float[16];
      this.field5263 = 0;
      this.field5317 = 16777215;
      this.field5266 = true;
      this.field5246 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
      this.field5280 = 0;
      this.field5318 = -1;
      this.field5284 = 1;
      this.field5270 = true;
      this.field5316 = 8;
      this.field5305 = 128;
      this.field5327 = 512;
      this.field5321 = new float[]{0.0F, 0.0F, -1.0F, 0.0F};
      this.field5314 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
      this.field5285 = -1;
      this.field5253 = -1;
      this.field5310 = false;
      this.field5328 = false;
      this.field5257 = -1.0F;
      this.field5312 = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
      this.field5251 = 0;
      this.field5326 = 0;
      this.field5269 = -1;
      this.field5296 = 1.0F;
      this.field5243 = 3584.0F;
      this.field5332 = 3584;
      this.field5322 = 1.0F;
      this.field5304 = false;
      this.field5331 = 0;
      this.field5294 = new float[16];
      this.field5336 = 512;
      this.field5335 = true;
      this.field5299 = false;
      this.field5252 = true;
      this.field5339 = 0;
      this.field5288 = this.field5312;
      this.field5282 = false;
      this.field5330 = true;
      this.field5275 = 0;
      this.field5323 = 0;
      this.field5338 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
      this.field5341 = 1.0F;
      this.field5334 = 0;
      this.field5261 = new Stream();
      this.field5354 = new class716();

      try {
         try {
            this.field5289 = arg4;
            this.field5138 = this.field5089 = arg0;
            this.field5224 = this.field5144 = arg1;
            this.field5113 = arg3;
            Dimension var8 = arg0.getSize();
            this.field5278 = arg5;
            this.field5100 = this.field5095 = var8.width;
            this.field5117 = this.field5062 = var8.height;
            class733.method5333(true, 127, false);
            if (super.field802 == null) {
               this.field5218 = new NativeInterface(0, this.field5278);
               this.field5340 = null;
            } else {
               this.field5340 = new class615(this, super.field802);
               this.field5218 = new NativeInterface(super.field802.method1352(-11629), this.field5278);
               int var9 = 0;
               if (var7 || ~super.field802.method1352(-11629) < ~var9) {
                  do {
                     class317 var10 = super.field802.method1354(var9, (byte)-109);
                     if (var10 != null) {
                        this.field5218.initTextureMetrics(var9, var10.field4321, var10.field4324);
                     }

                     ++var9;
                  } while(~super.field802.method1352(-11629) < ~var9);

               }
            }
         } catch (Throwable var13) {
            var13.printStackTrace();
            this.method567((byte)-83);
            throw new RuntimeException("");
         }
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field5367[33] + (arg0 != null ? field5367[3] : field5367[4]) + ',' + (arg1 != null ? field5367[3] : field5367[4]) + ',' + (arg2 != null ? field5367[3] : field5367[4]) + ',' + (arg3 != null ? field5367[3] : field5367[4]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "X",
      descriptor = "(I)V"
   )
   public final void method587(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!sc",
      name = "la",
      descriptor = "()V"
   )
   public final void method574() {
      try {
         this.field5339 = this.field5117;
         ++field5191;
         this.field5326 = 0;
         this.field5275 = 0;
         this.field5323 = this.field5100;
         if (this.field5366) {
            this.field5366 = false;
            this.method2601(0);
         }

         this.method2802((byte)-8);
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5367[114] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "z",
      descriptor = "()I"
   )
   public final int method593() {
      try {
         ++field5082;
         return this.field5250 + -2;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5367[98] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(BI)Lhh;"
   )
   public class141 method2623(byte arg0, int arg1) {
      try {
         ++field5185;
         if (arg0 != -43) {
            this.field5339 = 119;
         }

         if (arg1 != 6) {
            if (~arg1 == -2) {
               return new class542(this);
            }

            if (arg1 == 2) {
               return new class549(this, this.field5227);
            }

            if (arg1 != 7) {
               return new class670(this);
            }

            if (!client.field4360) {
               return new class700(this);
            }
         }

         return new class504(this);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5367[36] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(ILtn;Z)V"
   )
   public final void method2814(int arg0, class95 arg1, boolean arg2) {
      try {
         if (arg2) {
            this.method2635(arg1, arg0, -127, false, false);
            ++field5164;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5367[6] + arg0 + ',' + (arg1 != null ? field5367[3] : field5367[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(IILbk;)V"
   )
   public abstract void method2585(int arg0, int arg1, class398 arg2);

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(IIIIIIIIB)V"
   )
   public static final void method2815(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
      try {
         ++field5069;
         class67.field818[class545.field7817++] = new class311(arg6, arg3, arg4, arg2, arg2, arg4, arg7, arg1, arg1, arg7, arg0, arg0, arg5, arg5);
         int var9 = -43 / ((-22 - arg8) / 59);
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field5367[27] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "o",
      descriptor = "(I)V"
   )
   private final void method2816(int arg0) {
      try {
         if (this.field5337 != null) {
            this.field5337.method314((byte)94);
         }

         ++field5208;
         this.method2594(arg0 ^ arg0);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[118] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "n",
      descriptor = "(I)Lvm;"
   )
   public final class716 method2817(int arg0) {
      try {
         ++field5172;
         return arg0 <= 56 ? null : this.field5239;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "S",
      descriptor = "(I)V"
   )
   public final void method2818(int arg0) {
      try {
         if (~this.field5295 != -5) {
            this.method2797(-93);
            this.method2811((byte)-96, false);
            this.method2799((byte)118, false);
            this.method2785(false, 126);
            this.method2750(false, (byte)22);
            this.method2741(false, 80, -2, false);
            this.method2749(36, 1);
            this.method2747((byte)-86, 0);
            this.field5295 = 4;
         }

         ++field5194;
         if (arg0 != 24240) {
            this.method496(85, 39, 118, 58, 5, 127);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "KA",
      descriptor = "(IIII)V"
   )
   public final void method592(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field5046;
         if (arg0 <= 0 && ~arg2 <= ~(this.field5100 + -1) && arg1 <= 0 && this.field5117 + -1 <= arg3) {
            this.method574();
         } else {
            this.field5275 = arg0 >= 0 ? arg0 : 0;
            this.field5339 = ~arg3 >= ~this.field5100 ? arg3 : 0;
            this.field5323 = ~arg2 < ~this.field5100 ? 0 : arg2;
            this.field5326 = arg1 < 0 ? 0 : arg1;
            if (!this.field5366) {
               this.field5366 = true;
               this.method2601(0);
            }

            this.method2592((byte)-64);
            this.method2802((byte)-112);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5367[150] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "I",
      descriptor = "(I)[F"
   )
   public final float[] method2819(int arg0) {
      try {
         if (arg0 != 16152) {
            this.field5364 = null;
         }

         ++field5145;
         return this.field5312;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[138] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "Y",
      descriptor = "()[I"
   )
   public final int[] method558() {
      try {
         ++field5160;
         return new int[]{this.field5254, this.field5242, this.field5336, this.field5327};
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5367[175] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "U",
      descriptor = "(IIIII)V"
   )
   public final void method576(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field5124;
         this.method589(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field5367[151] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "c",
      descriptor = "(IZ)Llba;"
   )
   public abstract class576 method2575(int arg0, boolean arg1);

   @OriginalMember(
      owner = "client!sc",
      name = "g",
      descriptor = "(II)Llba;"
   )
   public final class576 method2820(int arg0, int arg1) {
      try {
         if (~this.field5345.method1408(true) > ~(arg0 * 2)) {
            this.field5345.method2281(arg1 + 22551, arg0);
         }

         ++field5157;
         return arg1 != -27208 ? null : this.field5345;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[145] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "aa",
      descriptor = "(IIIIII)V"
   )
   public final void method496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.method2762((byte)-89);
         ++field5182;
         this.method2752(arg4, (byte)50);
         this.method2814(0, class304.field4150, true);
         this.method2787(class304.field4150, (byte)-51, 0);
         this.method2749(68, arg5);
         this.field5236.method5199((float)arg3, 112, (float)arg2, 1.0F);
         this.field5236.method1215(arg0, arg1, 0);
         this.method2744(false);
         this.method2579(0, false);
         this.method2791(0);
         this.method2579(0, true);
         this.method2787(class10.field93, (byte)-51, 0);
         this.method2814(0, class10.field93, true);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field5367[91] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "Z",
      descriptor = "(I)V"
   )
   public abstract void method2594(int arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "EA",
      descriptor = "(IIII)V"
   )
   public final void method557(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field5111;
         if (!this.field5308) {
            throw new RuntimeException("");
         } else {
            this.field5251 = arg3;
            this.field5298 = arg2;
            this.field5253 = arg1;
            this.field5320 = arg0;
            if (this.field5260) {
               this.field5271[3].method1117((byte)-121);
               this.field5271[3].method314((byte)94);
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5367[144] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(I)V"
   )
   public void method597(int arg0) {
      try {
         ++field5131;
         if (this.field5340 != null) {
            this.field5340.method4469((byte)-52);
         }

         this.field5301 = arg0 & Integer.MAX_VALUE;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[83] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "u",
      descriptor = "(B)Lvm;"
   )
   public final class716 method2821(byte arg0) {
      try {
         ++field5065;
         return arg0 <= 37 ? null : this.field5302[this.field5309];
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5367[67] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;"
   )
   public final class295 method539(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      try {
         ++field5188;
         return new class363(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field5367[53] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5367[3] : field5367[4]) + ',' + (arg3 != null ? field5367[3] : field5367[4]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(IIIIIF)Lmn;"
   )
   public final class389 method509(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      try {
         ++field5110;
         return new class88(arg0, arg1, arg2, arg3, arg4, arg5);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field5367[169] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(IIIZIZ)V"
   )
   private final void method2822(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
      try {
         ++field5210;
         boolean var9 = arg3 & this.method564();
         if (arg2 == -5711) {
            if (!var9 && (~arg1 == -5 || arg1 == 8 || ~arg1 == -10)) {
               arg1 = 2;
               arg0 = ~arg1 == -5 ? 1 & arg4 : 1;
               arg4 = 0;
            }

            if (arg1 != 0 && arg5) {
               arg1 |= Integer.MIN_VALUE;
            }

            if (~this.field5334 != ~arg1) {
               if (this.field5334 != 0) {
                  this.field5271[Integer.MAX_VALUE & this.field5334].method307((byte)121);
               }

               label51: {
                  if (arg1 == 0) {
                     this.field5337 = null;
                     if (!client.field4360) {
                        break label51;
                     }
                  }

                  this.field5337 = this.field5271[Integer.MAX_VALUE & arg1];
                  this.field5337.method309(false, arg5);
                  this.field5337.method311(false, arg5);
                  this.field5337.method317(0, arg0, arg4);
               }

               this.field5334 = arg1;
               this.field5273 = arg4;
               this.field5248 = arg0;
            } else if (this.field5334 != 0) {
               this.field5271[Integer.MAX_VALUE & this.field5334].method311(false, arg5);
               if (this.field5273 != arg4 || ~this.field5248 != ~arg0) {
                  this.field5271[Integer.MAX_VALUE & this.field5334].method317(0, arg0, arg4);
                  this.field5273 = arg4;
                  this.field5248 = arg0;
               }

            }
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field5367[171] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V"
   )
   public final void method607(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      try {
         ++field5187;
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field5367[110] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(Lio;IIII)Lka;"
   )
   public final class500 method555(class464 arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field5128;
         return new class149(this, arg0, arg1, arg3, arg4, arg2);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field5367[120] + (arg0 != null ? field5367[3] : field5367[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method499(Canvas arg0, int arg1, int arg2) {
      try {
         ++field5058;
         if (this.field5089 == arg0) {
            throw new RuntimeException();
         } else if (!this.field5130.containsKey(arg0)) {
            if (!arg0.isShowing()) {
               throw new RuntimeException();
            } else {
               try {
                  Class var4 = Class.forName(field5367[87]);
                  Method var5 = var4.getMethod(field5367[88], Boolean.TYPE);
                  var5.invoke(arg0, Boolean.TRUE);
               } catch (Exception var8) {
               }

               Object var6 = this.method2624(arg0, 1);
               if (var6 == null) {
                  throw new RuntimeException();
               } else {
                  this.field5130.put(arg0, var6);
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field5367[89] + (arg0 != null ? field5367[3] : field5367[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(ZIBI[FIILak;)Lfc;"
   )
   public abstract class272 method2596(boolean arg0, int arg1, byte arg2, int arg3, float[] arg4, int arg5, int arg6, class371 arg7);

   @OriginalMember(
      owner = "client!sc",
      name = "H",
      descriptor = "(III[I)V"
   )
   public final void method551(int arg0, int arg1, int arg2, int[] arg3) {
      try {
         float var5;
         int var6;
         int var7;
         label33: {
            ++field5055;
            var5 = this.field5237.method5203((float)arg1, (float)arg0, (byte)-121, (float)arg2);
            if (var5 < -0.0078125F || var5 > 0.0078125F) {
               var6 = (int)((float)this.field5336 * this.field5237.method5194((float)arg1, (byte)66, (float)arg2, (float)arg0) / var5);
               var7 = (int)((float)this.field5327 * this.field5237.method5197((float)arg0, (float)arg1, (float)arg2, (byte)-126) / var5);
               if (!client.field4360) {
                  break label33;
               }
            }

            var7 = this.field5242;
            var6 = this.field5254;
         }

         arg3[1] = (int)((float)var7 - this.field5319);
         arg3[2] = (int)var5;
         arg3[0] = (int)((float)var6 + -this.field5245);
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field5367[45] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5367[3] : field5367[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "gb",
      descriptor = "(I)V"
   )
   private final void method2823(int arg0) {
      try {
         ++field5190;
         if (class786.field11543 == this.field5286) {
            float var2 = this.method2605(-112);
            this.field5236.method5198(0.0F, var2, var2, (byte)-76);
         }

         this.field5274 = false;
         this.method2638((byte)-81);
         if (arg0 == 0) {
            if (this.field5337 != null) {
               this.field5337.method312((byte)127);
            }
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[82] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method2824(boolean arg0, byte arg1) {
      try {
         if (arg1 > 4) {
            ++field5166;
            if (!this.field5252 == arg0) {
               this.field5252 = arg0;
               this.method2612(12);
            }
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5367[80] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2825(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2826(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 118;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
