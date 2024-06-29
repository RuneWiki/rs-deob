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

@OriginalClass("client!ce")
public abstract class class327 extends class65 {
   @OriginalMember(
      owner = "client!ce",
      name = "Xf",
      descriptor = "Lod;"
   )
   private class536 field4439;
   @OriginalMember(
      owner = "client!ce",
      name = "Of",
      descriptor = "Z"
   )
   public boolean field4551;
   @OriginalMember(
      owner = "client!ce",
      name = "A",
      descriptor = "Ltea;"
   )
   public class251 field4559;
   @OriginalMember(
      owner = "client!ce",
      name = "ud",
      descriptor = "Ltea;"
   )
   public class251 field4561;
   @OriginalMember(
      owner = "client!ce",
      name = "jg",
      descriptor = "Ltea;"
   )
   public class251 field4562;
   @OriginalMember(
      owner = "client!ce",
      name = "bg",
      descriptor = "Ltea;"
   )
   public class251 field4563;
   @OriginalMember(
      owner = "client!ce",
      name = "Ad",
      descriptor = "Ltea;"
   )
   private class251 field4564;
   @OriginalMember(
      owner = "client!ce",
      name = "fc",
      descriptor = "Ltea;"
   )
   private class251 field4565;
   @OriginalMember(
      owner = "client!ce",
      name = "Eb",
      descriptor = "Z"
   )
   public boolean field4570;
   @OriginalMember(
      owner = "client!ce",
      name = "ue",
      descriptor = "Z"
   )
   private boolean field4588;
   @OriginalMember(
      owner = "client!ce",
      name = "Xb",
      descriptor = "I"
   )
   public int field4567;
   @OriginalMember(
      owner = "client!ce",
      name = "hb",
      descriptor = "Z"
   )
   private boolean field4569;
   @OriginalMember(
      owner = "client!ce",
      name = "ag",
      descriptor = "F"
   )
   public float field4584;
   @OriginalMember(
      owner = "client!ce",
      name = "zd",
      descriptor = "I"
   )
   public int field4596;
   @OriginalMember(
      owner = "client!ce",
      name = "Hc",
      descriptor = "I"
   )
   private int field4577;
   @OriginalMember(
      owner = "client!ce",
      name = "Bb",
      descriptor = "I"
   )
   private int field4607;
   @OriginalMember(
      owner = "client!ce",
      name = "kd",
      descriptor = "I"
   )
   public int field4583;
   @OriginalMember(
      owner = "client!ce",
      name = "L",
      descriptor = "[F"
   )
   private float[] field4600;
   @OriginalMember(
      owner = "client!ce",
      name = "rc",
      descriptor = "F"
   )
   public float field4586;
   @OriginalMember(
      owner = "client!ce",
      name = "eb",
      descriptor = "I"
   )
   public int field4598;
   @OriginalMember(
      owner = "client!ce",
      name = "Je",
      descriptor = "F"
   )
   public float field4572;
   @OriginalMember(
      owner = "client!ce",
      name = "tf",
      descriptor = "I"
   )
   private int field4587;
   @OriginalMember(
      owner = "client!ce",
      name = "yd",
      descriptor = "I"
   )
   private int field4601;
   @OriginalMember(
      owner = "client!ce",
      name = "Fd",
      descriptor = "F"
   )
   public float field4571;
   @OriginalMember(
      owner = "client!ce",
      name = "X",
      descriptor = "I"
   )
   public int field4602;
   @OriginalMember(
      owner = "client!ce",
      name = "ac",
      descriptor = "I"
   )
   private int field4611;
   @OriginalMember(
      owner = "client!ce",
      name = "t",
      descriptor = "Z"
   )
   public boolean field4624;
   @OriginalMember(
      owner = "client!ce",
      name = "jf",
      descriptor = "I"
   )
   public int field4585;
   @OriginalMember(
      owner = "client!ce",
      name = "V",
      descriptor = "Z"
   )
   public boolean field4623;
   @OriginalMember(
      owner = "client!ce",
      name = "db",
      descriptor = "I"
   )
   public int field4613;
   @OriginalMember(
      owner = "client!ce",
      name = "kb",
      descriptor = "I"
   )
   public int field4631;
   @OriginalMember(
      owner = "client!ce",
      name = "H",
      descriptor = "[Lur;"
   )
   private class567[] field4619;
   @OriginalMember(
      owner = "client!ce",
      name = "Z",
      descriptor = "I"
   )
   public int field4576;
   @OriginalMember(
      owner = "client!ce",
      name = "Rc",
      descriptor = "I"
   )
   public int field4589;
   @OriginalMember(
      owner = "client!ce",
      name = "Hb",
      descriptor = "I"
   )
   private int field4574;
   @OriginalMember(
      owner = "client!ce",
      name = "Qc",
      descriptor = "Z"
   )
   private boolean field4599;
   @OriginalMember(
      owner = "client!ce",
      name = "kc",
      descriptor = "I"
   )
   public int field4636;
   @OriginalMember(
      owner = "client!ce",
      name = "Uf",
      descriptor = "Z"
   )
   public boolean field4581;
   @OriginalMember(
      owner = "client!ce",
      name = "Af",
      descriptor = "Z"
   )
   private boolean field4626;
   @OriginalMember(
      owner = "client!ce",
      name = "xe",
      descriptor = "[F"
   )
   private float[] field4629;
   @OriginalMember(
      owner = "client!ce",
      name = "I",
      descriptor = "Lof;"
   )
   public class653 field4627;
   @OriginalMember(
      owner = "client!ce",
      name = "zc",
      descriptor = "Z"
   )
   private boolean field4603;
   @OriginalMember(
      owner = "client!ce",
      name = "K",
      descriptor = "F"
   )
   public float field4568;
   @OriginalMember(
      owner = "client!ce",
      name = "cc",
      descriptor = "[F"
   )
   private float[] field4638;
   @OriginalMember(
      owner = "client!ce",
      name = "W",
      descriptor = "I"
   )
   private int field4597;
   @OriginalMember(
      owner = "client!ce",
      name = "Wd",
      descriptor = "I"
   )
   private int field4634;
   @OriginalMember(
      owner = "client!ce",
      name = "be",
      descriptor = "F"
   )
   public float field4644;
   @OriginalMember(
      owner = "client!ce",
      name = "ke",
      descriptor = "Z"
   )
   private boolean field4647;
   @OriginalMember(
      owner = "client!ce",
      name = "xb",
      descriptor = "F"
   )
   public float field4622;
   @OriginalMember(
      owner = "client!ce",
      name = "Ke",
      descriptor = "Z"
   )
   public boolean field4637;
   @OriginalMember(
      owner = "client!ce",
      name = "Zb",
      descriptor = "I"
   )
   public int field4639;
   @OriginalMember(
      owner = "client!ce",
      name = "Ed",
      descriptor = "I"
   )
   public int field4654;
   @OriginalMember(
      owner = "client!ce",
      name = "gg",
      descriptor = "F"
   )
   private float field4630;
   @OriginalMember(
      owner = "client!ce",
      name = "Ag",
      descriptor = "I"
   )
   public int field4653;
   @OriginalMember(
      owner = "client!ce",
      name = "Wb",
      descriptor = "[F"
   )
   public float[] field4656;
   @OriginalMember(
      owner = "client!ce",
      name = "Yf",
      descriptor = "I"
   )
   public int field4628;
   @OriginalMember(
      owner = "client!ce",
      name = "Yd",
      descriptor = "Z"
   )
   public boolean field4582;
   @OriginalMember(
      owner = "client!ce",
      name = "Sf",
      descriptor = "I"
   )
   public int field4580;
   @OriginalMember(
      owner = "client!ce",
      name = "Be",
      descriptor = "I"
   )
   private int field4618;
   @OriginalMember(
      owner = "client!ce",
      name = "Gc",
      descriptor = "[F"
   )
   private float[] field4655;
   @OriginalMember(
      owner = "client!ce",
      name = "mb",
      descriptor = "I"
   )
   public int field4592;
   @OriginalMember(
      owner = "client!ce",
      name = "jb",
      descriptor = "[F"
   )
   private float[] field4595;
   @OriginalMember(
      owner = "client!ce",
      name = "Uc",
      descriptor = "F"
   )
   public float field4651;
   @OriginalMember(
      owner = "client!ce",
      name = "Gf",
      descriptor = "Z"
   )
   public boolean field4658;
   @OriginalMember(
      owner = "client!ce",
      name = "Yb",
      descriptor = "Z"
   )
   public boolean field4649;
   @OriginalMember(
      owner = "client!ce",
      name = "vf",
      descriptor = "[F"
   )
   public float[] field4662;
   @OriginalMember(
      owner = "client!ce",
      name = "dd",
      descriptor = "I"
   )
   public int field4615;
   @OriginalMember(
      owner = "client!ce",
      name = "lg",
      descriptor = "I"
   )
   public int field4645;
   @OriginalMember(
      owner = "client!ce",
      name = "Xc",
      descriptor = "[F"
   )
   private float[] field4625;
   @OriginalMember(
      owner = "client!ce",
      name = "Sd",
      descriptor = "[F"
   )
   public float[] field4664;
   @OriginalMember(
      owner = "client!ce",
      name = "Rb",
      descriptor = "Leka;"
   )
   public class494 field4652;
   @OriginalMember(
      owner = "client!ce",
      name = "bd",
      descriptor = "Z"
   )
   public boolean field4659;
   @OriginalMember(
      owner = "client!ce",
      name = "vg",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field4663;
   @OriginalMember(
      owner = "client!ce",
      name = "Tf",
      descriptor = "Ltea;"
   )
   private class251 field4669;
   @OriginalMember(
      owner = "client!ce",
      name = "J",
      descriptor = "Ljava/lang/Object;"
   )
   public Object field4508;
   @OriginalMember(
      owner = "client!ce",
      name = "Ic",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field4544;
   @OriginalMember(
      owner = "client!ce",
      name = "Ff",
      descriptor = "Lqh;"
   )
   public class74 field4431;
   @OriginalMember(
      owner = "client!ce",
      name = "lf",
      descriptor = "Ljava/awt/Canvas;"
   )
   public Canvas field4506;
   @OriginalMember(
      owner = "client!ce",
      name = "Nb",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field4483;
   @OriginalMember(
      owner = "client!ce",
      name = "x",
      descriptor = "I"
   )
   public int field4620;
   @OriginalMember(
      owner = "client!ce",
      name = "Vc",
      descriptor = "I"
   )
   public int field4604;
   @OriginalMember(
      owner = "client!ce",
      name = "Ae",
      descriptor = "I"
   )
   private int field4510;
   @OriginalMember(
      owner = "client!ce",
      name = "vd",
      descriptor = "I"
   )
   public int field4454;
   @OriginalMember(
      owner = "client!ce",
      name = "td",
      descriptor = "I"
   )
   private int field4420;
   @OriginalMember(
      owner = "client!ce",
      name = "Oe",
      descriptor = "I"
   )
   public int field4432;
   @OriginalMember(
      owner = "client!ce",
      name = "uf",
      descriptor = "Lpp;"
   )
   private class416 field4657;
   @OriginalMember(
      owner = "client!ce",
      name = "tg",
      descriptor = "Ljagex3/graphics2/hw/NativeInterface;"
   )
   public NativeInterface field4385;
   @OriginalMember(
      owner = "client!ce",
      name = "Bg",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4691 = new String[]{method2606(method2605("+9g\u001dP")), method2606(method2605("+9g\u001fP")), method2606(method2605("+9g\u0007>`")), method2606(method2605("+9g\u0013P")), method2606(method2605("+9g\u0005;`")), method2606(method2605("&)%<")), method2606(method2605("3rg~\u0005")), method2606(method2605("+9g\u00039`")), method2606(method2605("+9g(\u0019`")), method2606(method2605("+9g\u001d?`")), method2606(method2605("+9g\u0003:`")), method2606(method2605("+9g\u0001:`")), method2606(method2605("+9g\u00000`")), method2606(method2605("+9g\u0007P")), method2606(method2605("+9g\u001e0`")), method2606(method2605("+9g\u001c2`")), method2606(method2605("+9g\u0013:`")), method2606(method2605("+9g\u00052`")), method2606(method2605("+9g9P")), method2606(method2605("+9g\u00180`")), method2606(method2605("+9g\u0005:`")), method2606(method2605("+9g\u00132`")), method2606(method2605("+9g\u00030`")), method2606(method2605("+9g\u0004;`")), method2606(method2605("+9g\u0006>`")), method2606(method2605("+9g\u001b2`")), method2606(method2605("+9g\u001b1`")), method2606(method2605("+9g<\u0019`")), method2606(method2605("+9g\u00152`")), method2606(method2605("+9g\u001f2`")), method2606(method2605("+9g\u001f1`")), method2606(method2605("+9g\u0019;`")), method2606(method2605("+9g\u0014P")), method2606(method2605("+9g\u00159`")), method2606(method2605("+9g\u0013?`")), method2606(method2605("+9g\u00010`")), method2606(method2605("+9g\u00009`")), method2606(method2605("+9g\u00020`")), method2606(method2605("+9g\u001b:`")), method2606(method2605("+9g\"P")), method2606(method2605("+9g\n9`")), method2606(method2605("+9g\u001e2`")), method2606(method2605("+9g\bP")), method2606(method2605("+9g\u00122`")), method2606(method2605("+9g\u0006P")), method2606(method2605("+9g\u00111`")), method2606(method2605("+9g\u0013;`")), method2606(method2605("+9gl\u0011&5=nP")), method2606(method2605("+9g\u0012:`")), method2606(method2605("+9g\u00042`")), method2606(method2605("+9g\u00149`")), method2606(method2605("+9g\u001b;`")), method2606(method2605("+9g\u001a9`")), method2606(method2605("+9g\u001cP")), method2606(method2605("+9g\u00060`")), method2606(method2605("+9g\u001e;`")), method2606(method2605("+9g*\u0019`")), method2606(method2605("+9g\u0006=`")), method2606(method2605("+9g\u00001`")), method2606(method2605("+9g\u00059`")), method2606(method2605("+9g\u0000P")), method2606(method2605("+9g\u00050`")), method2606(method2605("+9g\u00011`")), method2606(method2605("+9g\u00021`")), method2606(method2605("+9g\u001f0`")), method2606(method2605("+9g\u001b0`")), method2606(method2605("+9g\u0016<`")), method2606(method2605("+9g\u00029`")), method2606(method2605("+9g\u00192`")), method2606(method2605("+9g\u0018?`")), method2606(method2605("+9g\u00150`")), method2606(method2605("+9g\u001b9`")), method2606(method2605("+9g\u00019`")), method2606(method2605("+9g\u00182`")), method2606(method2605("+9g\u0006;`")), method2606(method2605("+9g\u0005>`")), method2606(method2605("+9g\u001aP")), method2606(method2605("+9g\u001d1`")), method2606(method2605("+9g\u001e:`")), method2606(method2605("+9g\u0015P")), method2606(method2605("+9g\u00160`")), method2606(method2605("+9g\u00139`")), method2606(method2605("+9g\u0007:`")), method2606(method2605("+9g \u0019`")), method2606(method2605("+9g\u001d2`")), method2606(method2605("+9g\"\u0019`")), method2606(method2605("+9g\u0012;`")), method2606(method2605("+9g\u0004P")), method2606(method2605("+9g\u0016?`")), method2606(method2605("+9g\u00141`")), method2606(method2605("+9g\u00189`")), method2606(method2605("+9g\u00032`")), method2606(method2605("+9g\u0016:`")), method2606(method2605("+9g\u001c9`")), method2606(method2605("+9g\u0013<`")), method2606(method2605("+9g\u0001P")), method2606(method2605("+9g\u0002;`")), method2606(method2605("+9g\u0018:`")), method2606(method2605("+9g\u0014:`")), method2606(method2605("+9g\u00012`")), method2606(method2605("+9g\u00040`")), method2606(method2605("+9g\u00191`")), method2606(method2605("+9g\u00071`")), method2606(method2605("+9g\u001e1`")), method2606(method2605("+9g\u001a0`")), method2606(method2605("+9g\u0017<`")), method2606(method2605("+9g\u0000;`")), method2606(method2605("+9g\u00162`")), method2606(method2605("+9g\u001c:`")), method2606(method2605("+9g\u001f;`")), method2606(method2605("+9g\u00051`")), method2606(method2605("+9g\u0011:`")), method2606(method2605("+9g\u00002`")), method2606(method2605("+9g\u0018P")), method2606(method2605("+9g\u0000<`")), method2606(method2605("+9g\u001a1`")), method2606(method2605("+9g\u001b?`")), method2606(method2605("+9g\u001c?`")), method2606(method2605("+9g\u00172`")), method2606(method2605("+9g\u00069`")), method2606(method2605("+9g6P")), method2606(method2605("+9g\u00129`")), method2606(method2605("+9g\u00041`")), method2606(method2605("+9g\u00142`")), method2606(method2605("+9g\u0018;`")), method2606(method2605("+9g\u00070`")), method2606(method2605("+9g\u00022`")), method2606(method2605("+9g\u0005P")), method2606(method2605("+9g\u001e?`")), method2606(method2605("+9g\u001f:`")), method2606(method2605("+9g\u00190`")), method2606(method2605("+9g\u0015?`")), method2606(method2605("+9g\u001a?`")), method2606(method2605("+9g\u0006:`")), method2606(method2605("+9g\u0007;`")), method2606(method2605("+9g\u00031`")), method2606(method2605("+9g\u00131`")), method2606(method2605("+9g\u001d0`")), method2606(method2605("+9g\u00121`")), method2606(method2605("+9g\u0003;`")), method2606(method2605("+9g\u0011P")), method2606(method2605("+9g\b9`")), method2606(method2605("+9g\u001a2`")), method2606(method2605("+9g\u00161`")), method2606(method2605("+9g\u0011?`")), method2606(method2605("+9g\u00171`")), method2606(method2605("+9g\u0004:`")), method2606(method2605("+9g\u0014?`")), method2606(method2605("+9g\tP")), method2606(method2605("+9g\u00072`")), method2606(method2605("+9g\u00062`")), method2606(method2605("+9g\u0017?`")), method2606(method2605("+9g\u00151`")), method2606(method2605("+9g\u0012?`")), method2606(method2605("+9g\u0002P")), method2606(method2605("+9g\u00112`")), method2606(method2605("+9g\u001c0`")), method2606(method2605("+9g\u0003P")), method2606(method2605("\"=?1V)+=~;)2?1\u000b")), method2606(method2605(";9=\u0019\u001f&3;5*-,(9\u0016<")), method2606(method2605("+9g\u0015;`")), method2606(method2605("+9g\u0017P")), method2606(method2605("+9g1\u0019`")), method2606(method2605("+9g\u00061`")), method2606(method2605("+9g\u001d:`")), method2606(method2605("+9g\u001bP")), method2606(method2605("+9g\u001c1`")), method2606(method2605("+9g\u0015:`")), method2606(method2605("+9g\u0019?`")), method2606(method2605("+9g\u00170`")), method2606(method2605("+9g\u0014<`")), method2606(method2605("+9g\u0019:`")), method2606(method2605("+9g4\u0019`")), method2606(method2605("+9g\u001a;`")), method2606(method2605("+9g\u00181`"))};
   @OriginalMember(
      owner = "client!ce",
      name = "lc",
      descriptor = "[I"
   )
   public static int[] field4453 = new int[3];
   @OriginalMember(
      owner = "client!ce",
      name = "Fb",
      descriptor = "F"
   )
   private float field4579;
   @OriginalMember(
      owner = "client!ce",
      name = "E",
      descriptor = "F"
   )
   public float field4590;
   @OriginalMember(
      owner = "client!ce",
      name = "Hf",
      descriptor = "F"
   )
   public float field4591;
   @OriginalMember(
      owner = "client!ce",
      name = "hd",
      descriptor = "F"
   )
   private float field4594;
   @OriginalMember(
      owner = "client!ce",
      name = "Qd",
      descriptor = "F"
   )
   public float field4606;
   @OriginalMember(
      owner = "client!ce",
      name = "wc",
      descriptor = "F"
   )
   public float field4616;
   @OriginalMember(
      owner = "client!ce",
      name = "Ef",
      descriptor = "F"
   )
   public float field4632;
   @OriginalMember(
      owner = "client!ce",
      name = "pe",
      descriptor = "F"
   )
   public float field4635;
   @OriginalMember(
      owner = "client!ce",
      name = "je",
      descriptor = "I"
   )
   public static int field4370;
   @OriginalMember(
      owner = "client!ce",
      name = "Bf",
      descriptor = "I"
   )
   public static int field4371;
   @OriginalMember(
      owner = "client!ce",
      name = "vb",
      descriptor = "I"
   )
   public static int field4372;
   @OriginalMember(
      owner = "client!ce",
      name = "zg",
      descriptor = "I"
   )
   public static int field4373;
   @OriginalMember(
      owner = "client!ce",
      name = "Fc",
      descriptor = "I"
   )
   public static int field4374;
   @OriginalMember(
      owner = "client!ce",
      name = "ic",
      descriptor = "I"
   )
   public static int field4375;
   @OriginalMember(
      owner = "client!ce",
      name = "qc",
      descriptor = "I"
   )
   public static int field4376;
   @OriginalMember(
      owner = "client!ce",
      name = "de",
      descriptor = "I"
   )
   public static int field4377;
   @OriginalMember(
      owner = "client!ce",
      name = "gf",
      descriptor = "I"
   )
   public static int field4378;
   @OriginalMember(
      owner = "client!ce",
      name = "mf",
      descriptor = "I"
   )
   public static int field4379;
   @OriginalMember(
      owner = "client!ce",
      name = "fd",
      descriptor = "I"
   )
   public static int field4380;
   @OriginalMember(
      owner = "client!ce",
      name = "Ac",
      descriptor = "I"
   )
   public static int field4381;
   @OriginalMember(
      owner = "client!ce",
      name = "Jf",
      descriptor = "I"
   )
   public static int field4382;
   @OriginalMember(
      owner = "client!ce",
      name = "Tc",
      descriptor = "I"
   )
   public static int field4383;
   @OriginalMember(
      owner = "client!ce",
      name = "He",
      descriptor = "I"
   )
   public static int field4384;
   @OriginalMember(
      owner = "client!ce",
      name = "Gd",
      descriptor = "I"
   )
   public static int field4386;
   @OriginalMember(
      owner = "client!ce",
      name = "Xe",
      descriptor = "I"
   )
   public static int field4387;
   @OriginalMember(
      owner = "client!ce",
      name = "Ld",
      descriptor = "I"
   )
   public static int field4388;
   @OriginalMember(
      owner = "client!ce",
      name = "tc",
      descriptor = "I"
   )
   public static int field4389;
   @OriginalMember(
      owner = "client!ce",
      name = "P",
      descriptor = "I"
   )
   public static int field4390;
   @OriginalMember(
      owner = "client!ce",
      name = "Cf",
      descriptor = "I"
   )
   public static int field4391;
   @OriginalMember(
      owner = "client!ce",
      name = "bb",
      descriptor = "I"
   )
   public static int field4392;
   @OriginalMember(
      owner = "client!ce",
      name = "wg",
      descriptor = "I"
   )
   public static int field4393;
   @OriginalMember(
      owner = "client!ce",
      name = "G",
      descriptor = "I"
   )
   public static int field4394;
   @OriginalMember(
      owner = "client!ce",
      name = "Id",
      descriptor = "I"
   )
   public static int field4395;
   @OriginalMember(
      owner = "client!ce",
      name = "zf",
      descriptor = "I"
   )
   public static int field4396;
   @OriginalMember(
      owner = "client!ce",
      name = "ye",
      descriptor = "I"
   )
   public static int field4397;
   @OriginalMember(
      owner = "client!ce",
      name = "gd",
      descriptor = "I"
   )
   public static int field4398;
   @OriginalMember(
      owner = "client!ce",
      name = "dg",
      descriptor = "I"
   )
   public static int field4399;
   @OriginalMember(
      owner = "client!ce",
      name = "Ub",
      descriptor = "I"
   )
   public static int field4400;
   @OriginalMember(
      owner = "client!ce",
      name = "Vb",
      descriptor = "I"
   )
   public static int field4401;
   @OriginalMember(
      owner = "client!ce",
      name = "Wf",
      descriptor = "I"
   )
   public static int field4402;
   @OriginalMember(
      owner = "client!ce",
      name = "Dc",
      descriptor = "I"
   )
   public static int field4403;
   @OriginalMember(
      owner = "client!ce",
      name = "Lb",
      descriptor = "I"
   )
   public static int field4404;
   @OriginalMember(
      owner = "client!ce",
      name = "Tb",
      descriptor = "I"
   )
   public static int field4405;
   @OriginalMember(
      owner = "client!ce",
      name = "gb",
      descriptor = "I"
   )
   public static int field4406;
   @OriginalMember(
      owner = "client!ce",
      name = "Jd",
      descriptor = "I"
   )
   public static int field4407;
   @OriginalMember(
      owner = "client!ce",
      name = "pf",
      descriptor = "I"
   )
   public static int field4408;
   @OriginalMember(
      owner = "client!ce",
      name = "jc",
      descriptor = "I"
   )
   public static int field4409;
   @OriginalMember(
      owner = "client!ce",
      name = "Me",
      descriptor = "I"
   )
   public static int field4410;
   @OriginalMember(
      owner = "client!ce",
      name = "Cd",
      descriptor = "I"
   )
   public static int field4411;
   @OriginalMember(
      owner = "client!ce",
      name = "Ze",
      descriptor = "I"
   )
   public static int field4412;
   @OriginalMember(
      owner = "client!ce",
      name = "De",
      descriptor = "I"
   )
   public static int field4413;
   @OriginalMember(
      owner = "client!ce",
      name = "u",
      descriptor = "I"
   )
   public static int field4414;
   @OriginalMember(
      owner = "client!ce",
      name = "le",
      descriptor = "I"
   )
   public static int field4415;
   @OriginalMember(
      owner = "client!ce",
      name = "Ob",
      descriptor = "I"
   )
   public static int field4416;
   @OriginalMember(
      owner = "client!ce",
      name = "Fe",
      descriptor = "I"
   )
   public static int field4417;
   @OriginalMember(
      owner = "client!ce",
      name = "We",
      descriptor = "I"
   )
   public static int field4418;
   @OriginalMember(
      owner = "client!ce",
      name = "pd",
      descriptor = "I"
   )
   public static int field4419;
   @OriginalMember(
      owner = "client!ce",
      name = "xg",
      descriptor = "I"
   )
   public static int field4421;
   @OriginalMember(
      owner = "client!ce",
      name = "Bc",
      descriptor = "I"
   )
   public static int field4422;
   @OriginalMember(
      owner = "client!ce",
      name = "Ib",
      descriptor = "I"
   )
   public static int field4423;
   @OriginalMember(
      owner = "client!ce",
      name = "cd",
      descriptor = "I"
   )
   public static int field4424;
   @OriginalMember(
      owner = "client!ce",
      name = "qd",
      descriptor = "I"
   )
   public static int field4425;
   @OriginalMember(
      owner = "client!ce",
      name = "pc",
      descriptor = "I"
   )
   public static int field4427;
   @OriginalMember(
      owner = "client!ce",
      name = "hg",
      descriptor = "I"
   )
   public static int field4428;
   @OriginalMember(
      owner = "client!ce",
      name = "Lc",
      descriptor = "I"
   )
   public static int field4429;
   @OriginalMember(
      owner = "client!ce",
      name = "w",
      descriptor = "I"
   )
   public static int field4430;
   @OriginalMember(
      owner = "client!ce",
      name = "Db",
      descriptor = "I"
   )
   public static int field4434;
   @OriginalMember(
      owner = "client!ce",
      name = "ff",
      descriptor = "I"
   )
   public static int field4435;
   @OriginalMember(
      owner = "client!ce",
      name = "qb",
      descriptor = "I"
   )
   public static int field4436;
   @OriginalMember(
      owner = "client!ce",
      name = "ce",
      descriptor = "I"
   )
   public static int field4437;
   @OriginalMember(
      owner = "client!ce",
      name = "rb",
      descriptor = "I"
   )
   public static int field4438;
   @OriginalMember(
      owner = "client!ce",
      name = "sf",
      descriptor = "I"
   )
   public static int field4440;
   @OriginalMember(
      owner = "client!ce",
      name = "Qf",
      descriptor = "I"
   )
   public static int field4441;
   @OriginalMember(
      owner = "client!ce",
      name = "nd",
      descriptor = "I"
   )
   public static int field4442;
   @OriginalMember(
      owner = "client!ce",
      name = "vc",
      descriptor = "I"
   )
   public static int field4443;
   @OriginalMember(
      owner = "client!ce",
      name = "Ve",
      descriptor = "I"
   )
   public static int field4444;
   @OriginalMember(
      owner = "client!ce",
      name = "df",
      descriptor = "I"
   )
   public static int field4445;
   @OriginalMember(
      owner = "client!ce",
      name = "S",
      descriptor = "I"
   )
   public static int field4446;
   @OriginalMember(
      owner = "client!ce",
      name = "ne",
      descriptor = "I"
   )
   public static int field4447;
   @OriginalMember(
      owner = "client!ce",
      name = "id",
      descriptor = "I"
   )
   public static int field4448;
   @OriginalMember(
      owner = "client!ce",
      name = "fg",
      descriptor = "I"
   )
   public static int field4449;
   @OriginalMember(
      owner = "client!ce",
      name = "Pd",
      descriptor = "I"
   )
   public static int field4450;
   @OriginalMember(
      owner = "client!ce",
      name = "Od",
      descriptor = "I"
   )
   public static int field4451;
   @OriginalMember(
      owner = "client!ce",
      name = "tb",
      descriptor = "I"
   )
   public static int field4452;
   @OriginalMember(
      owner = "client!ce",
      name = "r",
      descriptor = "I"
   )
   public static int field4455;
   @OriginalMember(
      owner = "client!ce",
      name = "Pf",
      descriptor = "I"
   )
   public static int field4456;
   @OriginalMember(
      owner = "client!ce",
      name = "hf",
      descriptor = "I"
   )
   public static int field4457;
   @OriginalMember(
      owner = "client!ce",
      name = "me",
      descriptor = "I"
   )
   public static int field4458;
   @OriginalMember(
      owner = "client!ce",
      name = "ae",
      descriptor = "I"
   )
   public static int field4459;
   @OriginalMember(
      owner = "client!ce",
      name = "sd",
      descriptor = "I"
   )
   public static int field4460;
   @OriginalMember(
      owner = "client!ce",
      name = "kf",
      descriptor = "I"
   )
   public static int field4461;
   @OriginalMember(
      owner = "client!ce",
      name = "nf",
      descriptor = "I"
   )
   public static int field4462;
   @OriginalMember(
      owner = "client!ce",
      name = "re",
      descriptor = "I"
   )
   public static int field4463;
   @OriginalMember(
      owner = "client!ce",
      name = "Se",
      descriptor = "I"
   )
   public static int field4464;
   @OriginalMember(
      owner = "client!ce",
      name = "Mb",
      descriptor = "I"
   )
   public static int field4465;
   @OriginalMember(
      owner = "client!ce",
      name = "gc",
      descriptor = "I"
   )
   public static int field4466;
   @OriginalMember(
      owner = "client!ce",
      name = "Df",
      descriptor = "I"
   )
   public static int field4467;
   @OriginalMember(
      owner = "client!ce",
      name = "mc",
      descriptor = "I"
   )
   public static int field4468;
   @OriginalMember(
      owner = "client!ce",
      name = "Ee",
      descriptor = "I"
   )
   public static int field4469;
   @OriginalMember(
      owner = "client!ce",
      name = "Kf",
      descriptor = "I"
   )
   public static int field4470;
   @OriginalMember(
      owner = "client!ce",
      name = "Qe",
      descriptor = "I"
   )
   public static int field4471;
   @OriginalMember(
      owner = "client!ce",
      name = "ad",
      descriptor = "I"
   )
   public static int field4472;
   @OriginalMember(
      owner = "client!ce",
      name = "bf",
      descriptor = "I"
   )
   public static int field4473;
   @OriginalMember(
      owner = "client!ce",
      name = "ig",
      descriptor = "I"
   )
   public static int field4474;
   @OriginalMember(
      owner = "client!ce",
      name = "wb",
      descriptor = "I"
   )
   public static int field4475;
   @OriginalMember(
      owner = "client!ce",
      name = "Ge",
      descriptor = "I"
   )
   public static int field4476;
   @OriginalMember(
      owner = "client!ce",
      name = "Y",
      descriptor = "I"
   )
   public static int field4477;
   @OriginalMember(
      owner = "client!ce",
      name = "qe",
      descriptor = "I"
   )
   public static int field4478;
   @OriginalMember(
      owner = "client!ce",
      name = "Ec",
      descriptor = "I"
   )
   public static int field4479;
   @OriginalMember(
      owner = "client!ce",
      name = "Ue",
      descriptor = "I"
   )
   public static int field4480;
   @OriginalMember(
      owner = "client!ce",
      name = "If",
      descriptor = "I"
   )
   public static int field4481;
   @OriginalMember(
      owner = "client!ce",
      name = "Ye",
      descriptor = "I"
   )
   public static int field4482;
   @OriginalMember(
      owner = "client!ce",
      name = "cf",
      descriptor = "I"
   )
   public static int field4484;
   @OriginalMember(
      owner = "client!ce",
      name = "Rf",
      descriptor = "I"
   )
   public static int field4485;
   @OriginalMember(
      owner = "client!ce",
      name = "he",
      descriptor = "I"
   )
   public static int field4486;
   @OriginalMember(
      owner = "client!ce",
      name = "te",
      descriptor = "I"
   )
   public static int field4487;
   @OriginalMember(
      owner = "client!ce",
      name = "Ie",
      descriptor = "I"
   )
   public static int field4488;
   @OriginalMember(
      owner = "client!ce",
      name = "xd",
      descriptor = "I"
   )
   public static int field4489;
   @OriginalMember(
      owner = "client!ce",
      name = "Dd",
      descriptor = "I"
   )
   public static int field4490;
   @OriginalMember(
      owner = "client!ce",
      name = "Mf",
      descriptor = "I"
   )
   public static int field4491;
   @OriginalMember(
      owner = "client!ce",
      name = "ge",
      descriptor = "I"
   )
   public static int field4492;
   @OriginalMember(
      owner = "client!ce",
      name = "ed",
      descriptor = "I"
   )
   public static int field4493;
   @OriginalMember(
      owner = "client!ce",
      name = "ob",
      descriptor = "I"
   )
   public static int field4494;
   @OriginalMember(
      owner = "client!ce",
      name = "T",
      descriptor = "I"
   )
   public static int field4496;
   @OriginalMember(
      owner = "client!ce",
      name = "lb",
      descriptor = "I"
   )
   public static int field4497;
   @OriginalMember(
      owner = "client!ce",
      name = "Ne",
      descriptor = "I"
   )
   public static int field4498;
   @OriginalMember(
      owner = "client!ce",
      name = "Bd",
      descriptor = "I"
   )
   public static int field4499;
   @OriginalMember(
      owner = "client!ce",
      name = "ld",
      descriptor = "I"
   )
   public static int field4500;
   @OriginalMember(
      owner = "client!ce",
      name = "yf",
      descriptor = "I"
   )
   public static int field4501;
   @OriginalMember(
      owner = "client!ce",
      name = "sb",
      descriptor = "I"
   )
   public static int field4502;
   @OriginalMember(
      owner = "client!ce",
      name = "qg",
      descriptor = "I"
   )
   public static int field4503;
   @OriginalMember(
      owner = "client!ce",
      name = "N",
      descriptor = "I"
   )
   public static int field4505;
   @OriginalMember(
      owner = "client!ce",
      name = "wd",
      descriptor = "I"
   )
   public static int field4507;
   @OriginalMember(
      owner = "client!ce",
      name = "Kb",
      descriptor = "I"
   )
   public static int field4509;
   @OriginalMember(
      owner = "client!ce",
      name = "v",
      descriptor = "I"
   )
   public static int field4511;
   @OriginalMember(
      owner = "client!ce",
      name = "rg",
      descriptor = "I"
   )
   public static int field4512;
   @OriginalMember(
      owner = "client!ce",
      name = "Sc",
      descriptor = "I"
   )
   public static int field4513;
   @OriginalMember(
      owner = "client!ce",
      name = "Pc",
      descriptor = "I"
   )
   public static int field4514;
   @OriginalMember(
      owner = "client!ce",
      name = "wf",
      descriptor = "I"
   )
   public static int field4515;
   @OriginalMember(
      owner = "client!ce",
      name = "Kc",
      descriptor = "I"
   )
   public static int field4516;
   @OriginalMember(
      owner = "client!ce",
      name = "Wc",
      descriptor = "I"
   )
   public static int field4517;
   @OriginalMember(
      owner = "client!ce",
      name = "z",
      descriptor = "I"
   )
   public static int field4518;
   @OriginalMember(
      owner = "client!ce",
      name = "fb",
      descriptor = "I"
   )
   public static int field4519;
   @OriginalMember(
      owner = "client!ce",
      name = "Lf",
      descriptor = "I"
   )
   public static int field4520;
   @OriginalMember(
      owner = "client!ce",
      name = "Te",
      descriptor = "I"
   )
   public static int field4521;
   @OriginalMember(
      owner = "client!ce",
      name = "bc",
      descriptor = "I"
   )
   public static int field4522;
   @OriginalMember(
      owner = "client!ce",
      name = "Td",
      descriptor = "I"
   )
   public static int field4523;
   @OriginalMember(
      owner = "client!ce",
      name = "of",
      descriptor = "I"
   )
   public static int field4524;
   @OriginalMember(
      owner = "client!ce",
      name = "we",
      descriptor = "I"
   )
   public static int field4525;
   @OriginalMember(
      owner = "client!ce",
      name = "Yc",
      descriptor = "I"
   )
   public static int field4526;
   @OriginalMember(
      owner = "client!ce",
      name = "Ce",
      descriptor = "I"
   )
   public static int field4527;
   @OriginalMember(
      owner = "client!ce",
      name = "Le",
      descriptor = "I"
   )
   public static int field4528;
   @OriginalMember(
      owner = "client!ce",
      name = "Qb",
      descriptor = "I"
   )
   public static int field4529;
   @OriginalMember(
      owner = "client!ce",
      name = "B",
      descriptor = "I"
   )
   public static int field4530;
   @OriginalMember(
      owner = "client!ce",
      name = "Md",
      descriptor = "I"
   )
   public static int field4531;
   @OriginalMember(
      owner = "client!ce",
      name = "yg",
      descriptor = "I"
   )
   public static int field4532;
   @OriginalMember(
      owner = "client!ce",
      name = "ee",
      descriptor = "I"
   )
   public static int field4533;
   @OriginalMember(
      owner = "client!ce",
      name = "U",
      descriptor = "I"
   )
   public static int field4534;
   @OriginalMember(
      owner = "client!ce",
      name = "oe",
      descriptor = "I"
   )
   public static int field4535;
   @OriginalMember(
      owner = "client!ce",
      name = "ug",
      descriptor = "I"
   )
   public static int field4537;
   @OriginalMember(
      owner = "client!ce",
      name = "M",
      descriptor = "I"
   )
   public static int field4538;
   @OriginalMember(
      owner = "client!ce",
      name = "sc",
      descriptor = "I"
   )
   public static int field4539;
   @OriginalMember(
      owner = "client!ce",
      name = "fe",
      descriptor = "I"
   )
   public static int field4540;
   @OriginalMember(
      owner = "client!ce",
      name = "Nc",
      descriptor = "I"
   )
   public static int field4541;
   @OriginalMember(
      owner = "client!ce",
      name = "pg",
      descriptor = "I"
   )
   public static int field4542;
   @OriginalMember(
      owner = "client!ce",
      name = "Ud",
      descriptor = "I"
   )
   public static int field4543;
   @OriginalMember(
      owner = "client!ce",
      name = "Cb",
      descriptor = "I"
   )
   public static int field4545;
   @OriginalMember(
      owner = "client!ce",
      name = "rd",
      descriptor = "I"
   )
   public static int field4546;
   @OriginalMember(
      owner = "client!ce",
      name = "yc",
      descriptor = "I"
   )
   public static int field4547;
   @OriginalMember(
      owner = "client!ce",
      name = "se",
      descriptor = "I"
   )
   public static int field4548;
   @OriginalMember(
      owner = "client!ce",
      name = "ve",
      descriptor = "I"
   )
   public static int field4549;
   @OriginalMember(
      owner = "client!ce",
      name = "mg",
      descriptor = "I"
   )
   public static int field4550;
   @OriginalMember(
      owner = "client!ce",
      name = "ef",
      descriptor = "I"
   )
   public static int field4552;
   @OriginalMember(
      owner = "client!ce",
      name = "ec",
      descriptor = "I"
   )
   public static int field4553;
   @OriginalMember(
      owner = "client!ce",
      name = "Oc",
      descriptor = "I"
   )
   public int field4554;
   @OriginalMember(
      owner = "client!ce",
      name = "Pe",
      descriptor = "I"
   )
   public static int field4555;
   @OriginalMember(
      owner = "client!ce",
      name = "Xd",
      descriptor = "I"
   )
   public static int field4556;
   @OriginalMember(
      owner = "client!ce",
      name = "uc",
      descriptor = "I"
   )
   public int field4557;
   @OriginalMember(
      owner = "client!ce",
      name = "qf",
      descriptor = "I"
   )
   public static int field4558;
   @OriginalMember(
      owner = "client!ce",
      name = "ub",
      descriptor = "I"
   )
   public int field4560;
   @OriginalMember(
      owner = "client!ce",
      name = "oc",
      descriptor = "I"
   )
   public int field4566;
   @OriginalMember(
      owner = "client!ce",
      name = "ze",
      descriptor = "I"
   )
   public int field4578;
   @OriginalMember(
      owner = "client!ce",
      name = "jd",
      descriptor = "I"
   )
   public int field4605;
   @OriginalMember(
      owner = "client!ce",
      name = "eg",
      descriptor = "I"
   )
   private int field4610;
   @OriginalMember(
      owner = "client!ce",
      name = "cg",
      descriptor = "I"
   )
   public int field4614;
   @OriginalMember(
      owner = "client!ce",
      name = "dc",
      descriptor = "I"
   )
   public int field4621;
   @OriginalMember(
      owner = "client!ce",
      name = "md",
      descriptor = "I"
   )
   public int field4640;
   @OriginalMember(
      owner = "client!ce",
      name = "F",
      descriptor = "I"
   )
   public int field4641;
   @OriginalMember(
      owner = "client!ce",
      name = "sg",
      descriptor = "I"
   )
   private int field4642;
   @OriginalMember(
      owner = "client!ce",
      name = "af",
      descriptor = "I"
   )
   public int field4643;
   @OriginalMember(
      owner = "client!ce",
      name = "xc",
      descriptor = "I"
   )
   private int field4689;
   @OriginalMember(
      owner = "client!ce",
      name = "peer",
      descriptor = "J"
   )
   public long peer;
   @OriginalMember(
      owner = "client!ce",
      name = "Zc",
      descriptor = "Lho;"
   )
   public class159 field4660;
   @OriginalMember(
      owner = "client!ce",
      name = "Hd",
      descriptor = "Lov;"
   )
   private class199 field4646;
   @OriginalMember(
      owner = "client!ce",
      name = "Jc",
      descriptor = "Lfa;"
   )
   public class246 field4536;
   @OriginalMember(
      owner = "client!ce",
      name = "y",
      descriptor = "Loj;"
   )
   private class403 field4674;
   @OriginalMember(
      owner = "client!ce",
      name = "ng",
      descriptor = "Loj;"
   )
   public class403 field4678;
   @OriginalMember(
      owner = "client!ce",
      name = "Ab",
      descriptor = "Loj;"
   )
   private class403 field4680;
   @OriginalMember(
      owner = "client!ce",
      name = "nc",
      descriptor = "Loj;"
   )
   public class403 field4681;
   @OriginalMember(
      owner = "client!ce",
      name = "Nd",
      descriptor = "Loj;"
   )
   public class403 field4685;
   @OriginalMember(
      owner = "client!ce",
      name = "Vf",
      descriptor = "Loj;"
   )
   private class403 field4686;
   @OriginalMember(
      owner = "client!ce",
      name = "Jb",
      descriptor = "Loj;"
   )
   public class403 field4688;
   @OriginalMember(
      owner = "client!ce",
      name = "Rd",
      descriptor = "Lso;"
   )
   private class499 field4670;
   @OriginalMember(
      owner = "client!ce",
      name = "Q",
      descriptor = "Lso;"
   )
   private class499 field4676;
   @OriginalMember(
      owner = "client!ce",
      name = "xf",
      descriptor = "Lso;"
   )
   private class499 field4677;
   @OriginalMember(
      owner = "client!ce",
      name = "og",
      descriptor = "Lur;"
   )
   private class567 field4650;
   @OriginalMember(
      owner = "client!ce",
      name = "ib",
      descriptor = "Llba;"
   )
   private class579 field4665;
   @OriginalMember(
      owner = "client!ce",
      name = "hc",
      descriptor = "Lgi;"
   )
   public class709 field4667;
   @OriginalMember(
      owner = "client!ce",
      name = "Sb",
      descriptor = "Lgi;"
   )
   public class709 field4668;
   @OriginalMember(
      owner = "client!ce",
      name = "od",
      descriptor = "Lgi;"
   )
   public class709 field4671;
   @OriginalMember(
      owner = "client!ce",
      name = "Nf",
      descriptor = "Lgi;"
   )
   public class709 field4672;
   @OriginalMember(
      owner = "client!ce",
      name = "Kd",
      descriptor = "Lgi;"
   )
   public class709 field4675;
   @OriginalMember(
      owner = "client!ce",
      name = "Mc",
      descriptor = "Lgi;"
   )
   public class709 field4679;
   @OriginalMember(
      owner = "client!ce",
      name = "Pb",
      descriptor = "Lgi;"
   )
   public class709 field4682;
   @OriginalMember(
      owner = "client!ce",
      name = "kg",
      descriptor = "Lgi;"
   )
   public class709 field4683;
   @OriginalMember(
      owner = "client!ce",
      name = "zb",
      descriptor = "Lgi;"
   )
   public class709 field4684;
   @OriginalMember(
      owner = "client!ce",
      name = "nb",
      descriptor = "Lgi;"
   )
   public class709 field4687;
   @OriginalMember(
      owner = "client!ce",
      name = "Zd",
      descriptor = "Lqh;"
   )
   public static class74 field4426;
   @OriginalMember(
      owner = "client!ce",
      name = "Cc",
      descriptor = "Loia;"
   )
   private class96 field4673;
   @OriginalMember(
      owner = "client!ce",
      name = "cb",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   public NativeHeap field4504;
   @OriginalMember(
      owner = "client!ce",
      name = "D",
      descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   public NativeHeapBuffer field4433;
   @OriginalMember(
      owner = "client!ce",
      name = "yb",
      descriptor = "Ljava/util/Hashtable;"
   )
   private Hashtable field4495;
   @OriginalMember(
      owner = "client!ce",
      name = "O",
      descriptor = "Z"
   )
   public boolean field4575;
   @OriginalMember(
      owner = "client!ce",
      name = "pb",
      descriptor = "Z"
   )
   public boolean field4593;
   @OriginalMember(
      owner = "client!ce",
      name = "C",
      descriptor = "Z"
   )
   public boolean field4608;
   @OriginalMember(
      owner = "client!ce",
      name = "ab",
      descriptor = "Z"
   )
   public boolean field4612;
   @OriginalMember(
      owner = "client!ce",
      name = "s",
      descriptor = "Z"
   )
   public boolean field4666;
   @OriginalMember(
      owner = "client!ce",
      name = "Vd",
      descriptor = "Z"
   )
   public boolean field4690;
   @OriginalMember(
      owner = "client!ce",
      name = "rf",
      descriptor = "[Loda;"
   )
   public class127[] field4609;
   @OriginalMember(
      owner = "client!ce",
      name = "Re",
      descriptor = "[Lho;"
   )
   private class159[] field4617;
   @OriginalMember(
      owner = "client!ce",
      name = "R",
      descriptor = "[Ltea;"
   )
   public class251[] field4633;
   @OriginalMember(
      owner = "client!ce",
      name = "ie",
      descriptor = "[Lnm;"
   )
   public class502[] field4648;
   @OriginalMember(
      owner = "client!ce",
      name = "Gb",
      descriptor = "[Lou;"
   )
   public class635[] field4573;
   @OriginalMember(
      owner = "client!ce",
      name = "Zf",
      descriptor = "[Lou;"
   )
   public class635[] field4661;

   @OriginalMember(
      owner = "client!ce",
      name = "u",
      descriptor = "()V"
   )
   public final void method519() {
      try {
         if (this.field4657 != null) {
            this.field4657.method3146(true);
         }

         ++field4429;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4691[66] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "j",
      descriptor = "(Z)V"
   )
   public abstract void method2470(boolean arg0);

   @OriginalMember(
      owner = "client!ce",
      name = "L",
      descriptor = "(III)V"
   )
   public final void method547(int arg0, int arg1, int arg2) {
      try {
         ++field4445;
         if (~this.field4628 != ~arg0 || ~this.field4580 != ~arg1 || ~this.field4613 != ~arg2) {
            this.field4580 = arg1;
            this.field4613 = arg2;
            this.field4628 = arg0;
            this.method2574(0);
            this.method2582((byte)109);
         }

      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4691[53] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "e",
      descriptor = "()Z"
   )
   public final boolean method493() {
      try {
         ++field4390;
         return false;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4691[108] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "ra",
      descriptor = "(IIII)V"
   )
   public final void method501(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field4618 = arg3;
         this.field4612 = true;
         ++field4546;
         this.field4642 = arg0;
         this.field4601 = arg1;
         this.field4597 = arg2;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4691[85] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(ZBIZ)V"
   )
   public final void method2471(boolean arg0, byte arg1, int arg2, boolean arg3) {
      boolean var5 = client.field4273;

      try {
         ++field4399;
         if (arg1 > -5) {
            this.field4626 = true;
         }

         if (~this.field4634 != ~arg2 || this.field4612 != this.field4599) {
            class610 var6;
            int var7;
            byte var8;
            int var9;
            int var10;
            label71: {
               var6 = null;
               var7 = 0;
               var8 = 0;
               var9 = 0;
               var10 = !this.field4612 ? 0 : 3;
               if (arg2 < 0) {
                  this.method2524((byte)97);
                  if (!var5) {
                     break label71;
                  }
               }

               class359 var11;
               label79: {
                  var6 = this.field4657.method3148(arg2, -22340);
                  var11 = super.field726.method1293(arg2, -5150);
                  if (~var11.field5101 != -1 || var11.field5103 != 0) {
                     int var12 = !var11.field5116 ? 128 : 64;
                     int var13 = var12 * 50;
                     class251 var14 = this.method2527(-124);
                     var14.method1891((float)(this.field4578 % var13 * var11.field5101) / (float)var13, -15702, (float)(this.field4578 % var13 * var11.field5103) / (float)var13, 0.0F);
                     this.method2503((byte)10, class489.field6745);
                     if (!var5) {
                        break label79;
                     }
                  }

                  this.method2524((byte)116);
               }

               var7 = var11.field5098;
               if (!this.field4612) {
                  var9 = var11.field5100;
                  var8 = var11.field5104;
                  var10 = var11.field5114;
               }
            }

            label44: {
               this.method2535(var9, arg0, var10, var8, -2, arg3);
               if (this.field4650 != null) {
                  this.field4650.method8(true, var6, var7);
                  if (!var5) {
                     break label44;
                  }
               }

               this.method2581(var6, 114);
               this.method2593(0, var7);
            }

            this.field4599 = this.field4612;
            this.field4634 = arg2;
         }

         this.field4610 &= -8;
      } catch (RuntimeException var16) {
         throw class534.method3846(var16, field4691[101] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "A",
      descriptor = "(ILaa;II)V"
   )
   public final void method516(int arg0, class516 arg1, int arg2, int arg3) {
      try {
         ++field4501;
         class615 var5 = (class615)arg1;
         class610 var6 = var5.field8584;
         this.method2478(true);
         this.method2581(var6, -67);
         this.method2573((byte)-99, 1);
         this.method2587(class535.field7314, -112, class535.field7314);
         this.method2547(0, class206.field2525, 0);
         this.method2552(arg0, true);
         this.field4559.method1888(0.0F, (float)this.field4432, (float)this.field4454, (byte)-35);
         this.method2515(100);
         this.field4633[0].method1888(1.0F, var6.method42((byte)15, (float)this.field4432), var6.method37((float)this.field4454, -54), (byte)-35);
         this.field4633[0].method1905(0.0F, -14542, var6.method42((byte)15, (float)(-arg2)), var6.method37((float)(-arg3), -96));
         this.field4648[0] = class489.field6745;
         this.method2504((byte)97);
         this.method2512((byte)-95);
         this.method2524((byte)118);
         this.method2547(0, class550.field7513, 0);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field4691[140] + arg0 + ',' + (arg1 != null ? field4691[6] : field4691[5]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "t",
      descriptor = "(I)V"
   )
   private final void method2472(int arg0) {
      try {
         int var2 = 32 % ((arg0 - 75) / 43);
         if (!this.field4647) {
            label26: {
               float[] var3 = this.field4600;
               this.field4647 = true;
               if (this.field4432 == 0 || this.field4454 == 0) {
                  var3[15] = 1.0F;
                  var3[12] = 0.0F;
                  var3[4] = 0.0F;
                  var3[6] = 0.0F;
                  var3[14] = 0.0F;
                  var3[3] = 0.0F;
                  var3[1] = 0.0F;
                  var3[8] = 0.0F;
                  var3[9] = 0.0F;
                  var3[2] = 0.0F;
                  var3[7] = 0.0F;
                  var3[10] = 1.0F;
                  var3[0] = 1.0F;
                  var3[11] = 0.0F;
                  var3[13] = 0.0F;
                  var3[5] = 1.0F;
                  if (!client.field4273) {
                     break label26;
                  }
               }

               var3[11] = 0.0F;
               var3[7] = 0.0F;
               var3[6] = 0.0F;
               var3[14] = 0.5F;
               var3[4] = 0.0F;
               var3[1] = 0.0F;
               var3[3] = 0.0F;
               var3[15] = 1.0F;
               var3[10] = 0.5F;
               var3[2] = 0.0F;
               var3[0] = 2.0F / (float)this.field4432;
               var3[8] = 0.0F;
               var3[5] = -2.0F / (float)this.field4454;
               var3[13] = 1.0F;
               var3[9] = 0.0F;
               var3[12] = -1.0F;
            }
         }

         ++field4522;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4691[49] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "t",
      descriptor = "(B)I"
   )
   public final int method2473(byte arg0) {
      try {
         if (arg0 >= -18) {
            this.field4591 = -0.46620488F;
         }

         ++field4515;
         return this.field4618;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[137] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "y",
      descriptor = "(I)F"
   )
   public abstract float method2474(int arg0);

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(ZI[BLtga;ZI)Lgu;"
   )
   public final class610 method2475(boolean arg0, int arg1, byte[] arg2, class63 arg3, boolean arg4, int arg5) {
      try {
         if (!arg0) {
            return null;
         } else {
            ++field4499;
            return this.method2523(arg3, arg5, arg4, arg2, 0, true, arg1, 0);
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field4691[17] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4691[6] : field4691[5]) + ',' + (arg3 != null ? field4691[6] : field4691[5]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method532(int arg0) {
      try {
         ++field4391;
         if (~arg0 != -2) {
            throw new IllegalArgumentException("");
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[48] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "b",
      descriptor = "(IZ)V"
   )
   public final void method2476(int arg0, boolean arg1) {
      try {
         if (this.field4623 == !arg1) {
            this.field4623 = arg1;
            this.method2561(2376);
            this.field4610 &= -8;
         }

         if (arg0 < 125) {
            this.method2589(-126, false);
         }

         ++field4548;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[99] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "f",
      descriptor = "(B)V"
   )
   public abstract void method2477(byte arg0);

   @OriginalMember(
      owner = "client!ce",
      name = "h",
      descriptor = "(Z)V"
   )
   public final void method2478(boolean arg0) {
      try {
         if (!arg0) {
            this.field4628 = -99;
         }

         ++field4497;
         if (~this.field4610 != -3) {
            this.method2530(0);
            this.method2564((byte)-118, false);
            this.method2476(127, false);
            this.method2575(false, (byte)-125);
            this.method2488(4, false);
            this.method2471(false, (byte)-124, -2, false);
            this.field4610 = 2;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[35] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "l",
      descriptor = "(I)V"
   )
   private final void method2479(int arg0) {
      try {
         ++field4509;
         if (arg0 != 4) {
            this.method558(17, 50, 122, -115, 115);
         }

         this.field4677 = this.method2584((byte)-118, true);
         this.field4677.method789(-6222, 24, 12);
         this.field4686 = this.method2496(new class414[]{new class414(class727.field10647)}, arg0 + -7410);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[43] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method588(Canvas arg0) {
      try {
         label37: {
            ++field4380;
            this.field4483 = null;
            this.field4544 = null;
            if (arg0 != null && this.field4506 != arg0) {
               if (!this.field4495.containsKey(arg0)) {
                  break label37;
               }

               this.field4544 = this.field4495.get(arg0);
               this.field4483 = arg0;
               if (!client.field4273) {
                  break label37;
               }
            }

            this.field4544 = this.field4508;
            this.field4483 = this.field4506;
         }

         if (this.field4483 != null && this.field4544 != null) {
            this.method2509(this.field4483, 1, this.field4544);
            this.method2557(1);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[93] + (arg0 != null ? field4691[6] : field4691[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "s",
      descriptor = "()Z"
   )
   public final boolean method596() {
      try {
         ++field4480;
         return true;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4691[154] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "D",
      descriptor = "(B)V"
   )
   public abstract void method2480(byte arg0);

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(IILw;I)V"
   )
   public abstract void method2481(int arg0, int arg1, class317 arg2, int arg3);

   @OriginalMember(
      owner = "client!ce",
      name = "F",
      descriptor = "(I)V"
   )
   public abstract void method2482(int arg0);

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(Lok;Z)Lbo;"
   )
   public final class763 method549(class267 arg0, boolean arg1) {
      boolean var3 = client.field4273;

      try {
         class763 var12;
         label102: {
            ++field4473;
            if (~arg0.field3467 != -1 && ~arg0.field3469 != -1) {
               int[] var4;
               label106: {
                  var4 = new int[arg0.field3469 * arg0.field3467];
                  int var5 = 0;
                  int var6 = 0;
                  if (arg0.field3464 == null) {
                     int var7 = 0;
                     if (var3 || var7 < arg0.field3469) {
                        do {
                           int var8 = 0;
                           if (var3 || ~var8 > ~arg0.field3467) {
                              do {
                                 int var9 = arg0.field3468[arg0.field3472[var5++] & 255];
                                 var4[var6++] = var9 == 0 ? 0 : class283.method2155(var9, -16777216);
                                 ++var8;
                              } while(~var8 > ~arg0.field3467);
                           }

                           ++var7;
                        } while(var7 < arg0.field3469);
                     }

                     if (!var3) {
                        break label106;
                     }
                  }

                  int var10 = 0;
                  if (var3 || var10 < arg0.field3469) {
                     do {
                        int var11 = 0;
                        if (var3) {
                           var4[var6++] = class283.method2155(arg0.field3468[class743.method5375(arg0.field3472[var5], 255)], arg0.field3464[var5] << 24);
                           ++var5;
                           ++var11;
                        }

                        while(true) {
                           while(~arg0.field3467 < ~var11) {
                              var4[var6++] = class283.method2155(arg0.field3468[class743.method5375(arg0.field3472[var5], 255)], arg0.field3464[var5] << 24);
                              ++var5;
                              ++var11;
                           }

                           if (!var3) {
                              ++var10;
                              break;
                           }

                           ++var11;
                        }
                     } while(var10 < arg0.field3469);
                  }
               }

               var12 = this.method525(arg0.field3467, var4, arg0.field3469, arg0.field3467, 0, 0);
               if (!var3) {
                  break label102;
               }
            }

            var12 = this.method525(1, new int[1], 1, 1, 0, 0);
         }

         var12.method2132(arg0.field3465, arg0.field3466, arg0.field3471, arg0.field3470);
         return var12;
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field4691[51] + (arg0 != null ? field4691[6] : field4691[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(IIIIILw;Loia;)V"
   )
   public abstract void method2483(int arg0, int arg1, int arg2, int arg3, int arg4, class317 arg5, class96 arg6);

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "([IZIIB)Lgu;"
   )
   public final class610 method2484(int[] arg0, boolean arg1, int arg2, int arg3, byte arg4) {
      try {
         if (arg4 != 2) {
            return null;
         } else {
            ++field4438;
            return this.method2487(0, 0, arg1, arg0, (byte)-43, arg3, arg2);
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field4691[135] + (arg0 != null ? field4691[6] : field4691[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "d",
      descriptor = "(I)V"
   )
   public abstract void method2485(int arg0);

   @OriginalMember(
      owner = "client!ce",
      name = "M",
      descriptor = "(I)V"
   )
   private final void method2486(int arg0) {
      boolean var2 = client.field4273;

      try {
         this.method2585(true);
         ++field4513;
         this.method2514(true);
         this.method2561(2376);
         this.method2578(-49);
         this.method2602(3);
         this.method2550((byte)103);
         this.method2604((byte)73);
         this.method2511((byte)-109);
         this.method2570(14);
         this.method2582((byte)79);
         this.method2551(arg0 + -7265);
         this.method2477((byte)97);
         this.method2480((byte)26);
         this.method2554(0);
         int var3 = this.field4643 + -1;
         if (var2) {
            this.method2506(var3, 122);
            this.method2571(arg0 + -1402);
            this.method2513(false);
            this.method2524((byte)-36);
            --var3;
         }

         while(true) {
            while(var3 >= 0) {
               this.method2506(var3, 122);
               this.method2571(arg0 + -1402);
               this.method2513(false);
               this.method2524((byte)-36);
               --var3;
            }

            this.method2518((byte)127);
            this.method2562(arg0 + -7265);
            this.method2482(-94);
            this.method2596((byte)-84);
            this.method2470(true);
            if (!var2) {
               if (arg0 != 7265) {
                  this.field4606 = -0.38480234F;
                  return;
               }

               return;
            }

            --var3;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4691[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V"
   )
   public final void method520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      try {
         ++field4556;
      } catch (RuntimeException var15) {
         throw class534.method3846(var15, field4691[72] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(IIZ[IBII)Lgu;"
   )
   public abstract class610 method2487(int arg0, int arg1, boolean arg2, int[] arg3, byte arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!ce",
      name = "e",
      descriptor = "(IZ)V"
   )
   public final void method2488(int arg0, boolean arg1) {
      try {
         ++field4449;
         if (arg0 == 4) {
            if (!this.field4570 == arg1) {
               this.field4570 = arg1;
               this.method2570(14);
               this.field4610 &= -32;
            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[77] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "A",
      descriptor = "()Z"
   )
   public final boolean method566() {
      try {
         ++field4395;
         return true;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4691[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "z",
      descriptor = "(B)V"
   )
   private final void method2489(byte arg0) {
      try {
         this.field4590 = (float)(-this.field4615 + this.field4602);
         this.field4616 = (float)(-this.field4576 + this.field4583);
         this.field4632 = (float)(this.field4654 - this.field4615);
         this.field4591 = (float)(-this.field4576 + this.field4598);
         int var2 = -49 / ((arg0 - -2) / 59);
         ++field4490;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[169] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(III[BLtga;B)Lfd;"
   )
   public abstract class557 method2490(int arg0, int arg1, int arg2, byte[] arg3, class63 arg4, byte arg5);

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(Ljk;[Lok;Z)Lda;"
   )
   public final class66 method496(class663 arg0, class267[] arg1, boolean arg2) {
      try {
         ++field4550;
         return new class152(this, arg0, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4691[82] + (arg0 != null ? field4691[6] : field4691[5]) + ',' + (arg1 != null ? field4691[6] : field4691[5]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(Lvp;IIII)Lka;"
   )
   public final class501 method573(class200 arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field4463;
         return new class709(this, arg0, arg1, arg3, arg4, arg2);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field4691[129] + (arg0 != null ? field4691[6] : field4691[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "w",
      descriptor = "(I)V"
   )
   public abstract void method2491(int arg0);

   @OriginalMember(
      owner = "client!ce",
      name = "C",
      descriptor = "(B)Leea;"
   )
   public final class142 method2492(byte arg0) {
      try {
         ++field4374;
         if (arg0 >= -16) {
            this.field4639 = -93;
         }

         return this.field4646 == null ? null : this.field4646.method1492(-11756);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[88] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(Liw;ILtga;)Z"
   )
   public abstract boolean method2493(class335 arg0, int arg1, class63 arg2);

   @OriginalMember(
      owner = "client!ce",
      name = "P",
      descriptor = "(IIIII)V"
   )
   public final void method527(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field4528;
         this.method497(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field4691[60] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V"
   )
   public final void method504(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class516 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      try {
         ++field4543;
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field4691[46] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field4691[6] : field4691[5]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "E",
      descriptor = "(I)Ltea;"
   )
   public final class251 method2494(int arg0) {
      try {
         if (arg0 != -129) {
            this.field4578 = -80;
         }

         ++field4525;
         return this.field4563;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[69] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "p",
      descriptor = "(I)V"
   )
   public final void method2495(int arg0) {
      boolean var2 = client.field4273;

      try {
         this.field4617 = new class159[this.field4643];
         this.field4661 = new class635[this.field4643];
         this.field4648 = new class502[this.field4643];
         this.field4573 = new class635[this.field4643];
         ++field4505;
         this.field4633 = new class251[this.field4643];
         int var3 = 0;
         if (var2) {
            this.field4573[var3] = class449.field6203;
            this.field4661[var3] = class449.field6203;
            this.field4648[var3] = class636.field8982;
            this.field4633[var3] = new class251();
            ++var3;
         }

         while(true) {
            while(~this.field4643 < ~var3) {
               this.field4573[var3] = class449.field6203;
               this.field4661[var3] = class449.field6203;
               this.field4648[var3] = class636.field8982;
               this.field4633[var3] = new class251();
               ++var3;
            }

            this.field4609 = new class127[this.field4641 - 2];
            this.field4660 = this.method2590(class622.field8682, 1, class335.field4803, 1, true);
            this.method586(new class357(262144));
            this.field4678 = this.method2496(new class414[]{new class414(new class727[]{class727.field10647, class727.field10653})}, -7406);
            this.field4685 = this.method2496(new class414[]{new class414(new class727[]{class727.field10647, class727.field10651})}, -7406);
            this.field4688 = this.method2496(new class414[]{new class414(class727.field10647), new class414(class727.field10651), new class414(class727.field10653), new class414(class727.field10650)}, -7406);
            this.field4681 = this.method2496(new class414[]{new class414(class727.field10647), new class414(class727.field10651), new class414(class727.field10653)}, -7406);
            this.field4671 = new class709(this, 0, 0, false, false);
            this.field4675 = new class709(this, 0, 0, true, true);
            this.field4679 = new class709(this, 0, 0, false, false);
            this.field4684 = new class709(this, 0, 0, true, true);
            this.field4667 = new class709(this, 0, 0, false, false);
            this.field4668 = new class709(this, 0, 0, true, true);
            this.field4687 = new class709(this, 0, 0, false, false);
            this.field4682 = new class709(this, 0, 0, true, true);
            this.field4672 = new class709(this, 0, 0, false, false);
            if (!var2) {
               if (arg0 > -29) {
                  this.method2602(124);
               }

               this.field4683 = new class709(this, 0, 0, true, true);
               this.field4665 = new class579(this);
               this.field4673 = this.method2559(-31494, true);
               this.method2498(0);
               this.field4536 = new class246(this);
               this.field4619[1] = this.method2501(4, 1);
               this.field4619[2] = this.method2501(4, 2);
               this.field4619[4] = this.method2501(4, 4);
               this.field4619[5] = this.method2501(4, 5);
               this.field4619[6] = this.method2501(4, 6);
               this.field4619[7] = this.method2501(4, 7);
               this.field4619[3] = this.method2501(4, 3);
               this.field4619[8] = this.method2501(4, 8);
               this.field4619[9] = this.method2501(4, 9);
               if (!this.field4619[2].method11((byte)-122)) {
                  this.field4619[2] = this.method2501(4, 0);
               }

               if (!this.field4619[4].method11((byte)-91)) {
                  this.field4619[4] = this.field4619[2];
               }

               if (!this.field4619[8].method11((byte)-84)) {
                  this.field4619[8] = this.field4619[4];
               }

               if (!this.field4619[9].method11((byte)-103)) {
                  this.field4619[9] = this.field4619[8];
               }

               this.method2502(102);
               this.method593();
               this.method560();
               return;
            }

            ++var3;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4691[63] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "([Lfu;I)Loj;"
   )
   public abstract class403 method2496(class414[] arg0, int arg1);

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(Ljea;I)V"
   )
   public final void method555(class478 arg0, int arg1) {
      try {
         ++field4388;
         this.field4665.method4159(-2, arg0, this, arg1);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[160] + (arg0 != null ? field4691[6] : field4691[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "h",
      descriptor = "(II)Loia;"
   )
   public final class96 method2497(int arg0, int arg1) {
      try {
         if (~(arg0 * 2) < ~this.field4673.method794(1143968105)) {
            this.field4673.method895((byte)122, arg0);
         }

         if (arg1 != -10033) {
            this.field4658 = false;
         }

         ++field4547;
         return this.field4673;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[151] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "h",
      descriptor = "(I)Lza;"
   )
   public final class438 method576(int arg0) {
      try {
         ++field4526;
         class357 var2 = new class357(arg0);
         this.field4439.method3859(2, var2);
         return var2;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[119] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "O",
      descriptor = "(I)V"
   )
   public final void method2498(int arg0) {
      boolean var2 = client.field4273;

      try {
         if (arg0 != 0) {
            this.field4677 = null;
         }

         ++field4377;
         Hashtable var3 = new Hashtable();
         if (this.field4495 != null && !this.field4495.isEmpty()) {
            Enumeration var4 = this.field4495.keys();
            if (var2 || var4.hasMoreElements()) {
               do {
                  Canvas var5 = (Canvas)var4.nextElement();
                  var3.put(var5, this.method2597(2379, var5));
               } while(var4.hasMoreElements());
            }
         }

         this.field4495 = var3;
         this.method2525((byte)-58);
         this.method2479(4);
         this.method2591(arg0 ^ 6285);
         this.field4665.method4157(-8409, this);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field4691[107] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "v",
      descriptor = "(I)V"
   )
   public abstract void method2499(int arg0);

   @OriginalMember(
      owner = "client!ce",
      name = "s",
      descriptor = "(I)V"
   )
   private final void method2500(int arg0) {
      try {
         ++field4415;
         this.field4647 = false;
         if (arg0 <= 80) {
            method2541(false);
         }

         if (class179.field2231 == this.field4627) {
            this.method2472(125);
            this.method2567(-106);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[149] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "i",
      descriptor = "(II)Lur;"
   )
   public class567 method2501(int arg0, int arg1) {
      try {
         ++field4434;
         if (arg0 != 4) {
            this.method504(118, 99, -118, 93, 114, -50, (class516)null, 85, 95, 41, 10, 11);
         }

         if (arg1 != 6) {
            if (~arg1 == -2) {
               return new class287(this);
            }

            if (arg1 == 2) {
               return new class787(this, this.field4536);
            }

            if (~arg1 != -8) {
               return new class383(this);
            }

            if (!client.field4273) {
               return new class449(this);
            }
         }

         return new class45(this);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4691[57] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "z",
      descriptor = "(I)V"
   )
   public void method2502(int arg0) {
      try {
         this.method2486(7265);
         ++field4437;
         if (arg0 <= 62) {
            this.field4561 = null;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[114] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(BLnm;)V"
   )
   public final void method2503(byte arg0, class502 arg1) {
      try {
         if (arg0 != 10) {
            this.field4642 = 55;
         }

         this.field4648[this.field4631] = arg1;
         ++field4514;
         this.method2504((byte)68);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[168] + arg0 + ',' + (arg1 != null ? field4691[6] : field4691[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "c",
      descriptor = "(IIIIII)V"
   )
   public final void method523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field4496;
         float var7 = this.method2474(0);
         this.method2599(true);
         this.method2552(arg4, true);
         this.method2547(0, class206.field2525, 0);
         this.method2592(0, class206.field2525, 0);
         this.method2573((byte)-99, arg5);
         this.field4559.method1888(1.0F, (float)(arg2 + -1), (float)(arg3 + -1), (byte)-35);
         this.field4559.method1905(0.0F, -14542, (float)arg0 - var7, (float)arg1 + -var7);
         this.method2515(87);
         this.method2598(false, (byte)-19);
         this.method2521(21613, 4, class504.field6901);
         this.method2598(true, (byte)-9);
         this.method2592(0, class550.field7513, 0);
         this.method2547(0, class550.field7513, 0);
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field4691[121] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "za",
      descriptor = "(IIIII)V"
   )
   public final void method602(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.method2599(true);
         ++field4507;
         this.method2552(arg3, true);
         this.method2547(0, class206.field2525, 0);
         this.method2592(0, class206.field2525, 0);
         this.method2573((byte)-99, arg4);
         this.field4559.method1888(1.0F, (float)arg2, (float)arg2, (byte)-35);
         this.field4559.method154(arg0, arg1, 0);
         this.method2515(54);
         this.method2598(false, (byte)-119);
         this.method2580(-8833, 0, this.field4670);
         this.method2529(-121, this.field4680);
         this.method2481(256, 0, class504.field6912, 0);
         this.method2598(true, (byte)-60);
         this.method2592(0, class550.field7513, 0);
         this.method2547(0, class550.field7513, 0);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field4691[56] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "y",
      descriptor = "(B)V"
   )
   private final void method2504(byte arg0) {
      try {
         ++field4540;
         int var2 = -20 % ((arg0 - -68) / 53);
         this.method2516((byte)-125);
         if (this.field4650 != null) {
            this.field4650.method6(124);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[61] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(IILha;)Lbo;"
   )
   public static final class763 method2505(int arg0, int arg1, class65 arg2) {
      try {
         ++field4373;
         if (arg1 != -2) {
            method2505(-4, -7, (class65)null);
         }

         class149 var3 = (class149)class109.field1381.method1839(74, (long)arg0);
         if (var3 != null) {
            class347 var4 = var3.field1949.method5402(20);
            var3.field1944 = true;
            if (var4 != null) {
               return var4.method2744(4, arg2);
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4691[166] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4691[6] : field4691[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "j",
      descriptor = "(II)V"
   )
   public final void method2506(int arg0, int arg1) {
      try {
         if (this.field4631 != arg0) {
            this.field4631 = arg0;
            this.method2603(-32230);
         }

         int var3 = -62 / ((39 - arg1) / 36);
         ++field4408;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4691[126] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "E",
      descriptor = "(B)V"
   )
   public final void method2507(byte arg0) {
      try {
         if (class551.field7587 != this.field4627) {
            class653 var2 = this.field4627;
            this.field4627 = class551.field7587;
            if (var2.method4723(32290)) {
               this.method2532((byte)-98);
            }

            this.field4610 &= -32;
            this.field4664 = this.field4625;
         }

         if (arg0 > -72) {
            this.field4594 = -2.1000948F;
         }

         ++field4520;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[152] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "c",
      descriptor = "(ZB)V"
   )
   public final void method2508(boolean arg0, byte arg1) {
      try {
         if (this.field4624 != arg0) {
            this.field4624 = arg0;
            this.method2561(2376);
         }

         if (arg1 <= 97) {
            this.method491(116);
         }

         ++field4435;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[25] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "da",
      descriptor = "(III[I)V"
   )
   public final void method562(int arg0, int arg1, int arg2, int[] arg3) {
      try {
         float var5;
         int var6;
         int var7;
         label25: {
            ++field4493;
            var5 = this.field4561.method1896((float)arg1, (float)arg0, (float)arg2, (byte)-109);
            if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
               var6 = this.field4576;
               var7 = this.field4615;
               if (!client.field4273) {
                  break label25;
               }
            }

            var7 = (int)((float)this.field4645 * this.field4561.method1901((float)arg0, 0, (float)arg2, (float)arg1) / var5);
            var6 = (int)((float)this.field4636 * this.field4561.method1903((float)arg1, (float)arg0, (float)arg2, -64) / var5);
         }

         arg3[0] = (int)((float)var7 + -this.field4590);
         arg3[2] = (int)var5;
         arg3[1] = (int)((float)var6 + -this.field4616);
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field4691[172] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4691[6] : field4691[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V"
   )
   public abstract void method2509(Canvas arg0, int arg1, Object arg2);

   @OriginalMember(
      owner = "client!ce",
      name = "p",
      descriptor = "(B)[F"
   )
   public final float[] method2510(byte arg0) {
      try {
         ++field4485;
         int var2 = -65 % ((45 - arg0) / 44);
         return this.field4625;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[54] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "pa",
      descriptor = "()V"
   )
   public final void method528() {
      try {
         ++field4411;
         this.field4612 = false;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4691[83] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "i",
      descriptor = "(B)V"
   )
   public abstract void method2511(byte arg0);

   @OriginalMember(
      owner = "client!ce",
      name = "n",
      descriptor = "(B)V"
   )
   public final void method2512(byte arg0) {
      try {
         if (arg0 != -95) {
            this.field4577 = 122;
         }

         this.method2521(21613, 2, class504.field6912);
         ++field4494;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[58] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         ++field4533;
         float var8 = (float)arg2 - (float)arg0;
         float var9 = (float)(-arg1) + (float)arg3;
         float var10 = 0.0F;
         float var11 = 1.0F;
         if (var8 != 0.0F || var9 != 0.0F) {
            var11 = (float)Math.sqrt((double)(var8 * var8 + var9 * var9));
            var10 = (float)Math.atan2((double)var9, (double)var8);
         }

         this.method2599(true);
         this.method2552(arg4, true);
         this.method2547(0, class206.field2525, 0);
         this.method2592(0, class206.field2525, 0);
         this.method2573((byte)-99, arg6);
         this.field4559.method1888(1.0F, var11, (float)arg5, (byte)-35);
         this.field4559.method154(0, -arg5 / 2, 0);
         this.field4559.method144(16383 & (int)((double)var10 * 2607.5945876176133D));
         this.field4559.method154(arg0, arg1, 0);
         this.method2515(58);
         this.method2598(false, (byte)-19);
         this.method2512((byte)-95);
         this.method2598(true, (byte)-9);
         this.method2592(0, class550.field7513, 0);
         this.method2547(0, class550.field7513, 0);
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field4691[36] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "d",
      descriptor = "(Z)V"
   )
   public abstract void method2513(boolean arg0);

   @OriginalMember(
      owner = "client!ce",
      name = "i",
      descriptor = "()I"
   )
   public final int method567() {
      try {
         ++field4531;
         return this.field4592;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4691[18] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "l",
      descriptor = "(Z)V"
   )
   public abstract void method2514(boolean arg0);

   @OriginalMember(
      owner = "client!ce",
      name = "k",
      descriptor = "()Lkh;"
   )
   public final class17 method600() {
      try {
         ++field4477;
         return this.field4669;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4691[92] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "R",
      descriptor = "(I)V"
   )
   public final void method2515(int arg0) {
      try {
         if (arg0 > 3) {
            this.field4551 = false;
            ++field4401;
            this.method2538((byte)110);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[70] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(IIZ)Lbo;"
   )
   public final class763 method605(int arg0, int arg1, boolean arg2) {
      try {
         ++field4425;
         return new class754(this, arg0, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4691[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "aa",
      descriptor = "(IIIIII)V"
   )
   public final void method508(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field4417;
         this.method2599(true);
         this.method2552(arg4, true);
         this.method2547(0, class206.field2525, 0);
         this.method2592(0, class206.field2525, 0);
         this.method2573((byte)-99, arg5);
         this.field4559.method1888(1.0F, (float)arg2, (float)arg3, (byte)-35);
         this.field4559.method154(arg0, arg1, 0);
         this.method2515(62);
         this.method2598(false, (byte)-16);
         this.method2512((byte)-95);
         this.method2598(true, (byte)-17);
         this.method2592(0, class550.field7513, 0);
         this.method2547(0, class550.field7513, 0);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field4691[162] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(Ljea;)V"
   )
   public final void method598(class478 arg0) {
      try {
         this.field4665.method4159(-2, arg0, this, -1);
         ++field4441;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[96] + (arg0 != null ? field4691[6] : field4691[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "c",
      descriptor = "(B)V"
   )
   public abstract void method2516(byte arg0);

   @OriginalMember(
      owner = "client!ce",
      name = "t",
      descriptor = "()Z"
   )
   public final boolean method534() {
      try {
         ++field4460;
         return true;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4691[38] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "f",
      descriptor = "(IIIIII)V"
   )
   public final void method497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         float var8;
         float var10;
         label28: {
            ++field4488;
            float var7 = (float)(-arg0) + (float)arg2;
            var8 = (float)arg3 - (float)arg1;
            if (var7 != 0.0F || var8 != 0.0F) {
               float var9 = (float)(1.0D / Math.sqrt((double)(var7 * var7 + var8 * var8)));
               var8 *= var9;
               var10 = var7 * var9;
               if (!client.field4273) {
                  break label28;
               }
            }

            var10 = 1.0F;
         }

         if (this.method2536((float)arg2 + var10, (float)arg3 + var8, (float)arg1, (byte)20, 0.0F, 0.0F, (float)arg0)) {
            this.method2599(true);
            this.method2552(arg4, true);
            this.method2547(0, class206.field2525, 0);
            this.method2592(0, class206.field2525, 0);
            this.method2573((byte)-99, arg5);
            this.method2539(false);
            this.method2598(false, (byte)-52);
            this.method2531((byte)-86);
            this.method2598(true, (byte)-88);
            this.method2592(0, class550.field7513, 0);
            this.method2547(0, class550.field7513, 0);
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field4691[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "n",
      descriptor = "()Z"
   )
   public final boolean method490() {
      try {
         ++field4461;
         return true;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4691[32] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(IIIIZ)Lbo;"
   )
   public final class763 method513(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         ++field4532;
         class754 var6 = new class754(this, arg2, arg3, arg4);
         var6.method1624(0, 0, arg2, arg3, arg0, arg1);
         return var6;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field4691[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(Lol;IIZZ)V"
   )
   public abstract void method2517(class300 arg0, int arg1, int arg2, boolean arg3, boolean arg4);

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method571(int[] arg0) {
      try {
         ++field4516;
         arg0[1] = this.field4454;
         arg0[0] = this.field4432;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[170] + (arg0 != null ? field4691[6] : field4691[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "o",
      descriptor = "(B)V"
   )
   public abstract void method2518(byte arg0);

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method2519(int arg0, byte arg1) {
      try {
         this.method2552(arg1 | arg1 << 8 | arg1 << 16 | arg1 << 24, true);
         ++field4465;
         if (arg0 != -2) {
            this.field4679 = null;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[73] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(Lol;IBZ)V"
   )
   public abstract void method2520(class300 arg0, int arg1, byte arg2, boolean arg3);

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(IILw;)V"
   )
   private final void method2521(int arg0, int arg1, class317 arg2) {
      try {
         this.method2580(-8833, 0, this.field4676);
         ++field4381;
         if (arg0 != 21613) {
            this.field4592 = -80;
         }

         this.method2529(-101, this.field4674);
         this.method2481(arg1, 0, arg2, 0);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4691[30] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4691[6] : field4691[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "EA",
      descriptor = "(IIII)V"
   )
   public final void method564(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field4549;
         if (!this.field4612) {
            throw new RuntimeException("");
         } else {
            this.field4601 = arg1;
            this.field4618 = arg3;
            this.field4642 = arg0;
            this.field4597 = arg2;
            if (this.field4599) {
               this.field4619[3].method467((byte)-66);
               this.field4619[3].method4(126);
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4691[33] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "H",
      descriptor = "(III[I)V"
   )
   public final void method568(int arg0, int arg1, int arg2, int[] arg3) {
      try {
         float var5;
         int var6;
         int var7;
         label33: {
            ++field4517;
            var5 = this.field4561.method1896((float)arg1, (float)arg0, (float)arg2, (byte)-109);
            if (var5 < -0.0078125F || var5 > 0.0078125F) {
               var6 = (int)((float)this.field4645 * this.field4561.method1901((float)arg0, 0, (float)arg2, (float)arg1) / var5);
               var7 = (int)((float)this.field4636 * this.field4561.method1903((float)arg1, (float)arg0, (float)arg2, -44) / var5);
               if (!client.field4273) {
                  break label33;
               }
            }

            var6 = this.field4615;
            var7 = this.field4576;
         }

         arg3[0] = (int)((float)var6 - this.field4590);
         arg3[2] = (int)var5;
         arg3[1] = (int)((float)var7 - this.field4616);
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field4691[113] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4691[6] : field4691[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "l",
      descriptor = "(B)V"
   )
   private final void method2522(byte arg0) {
      try {
         this.field4638[14] = this.field4579;
         if (arg0 == 66) {
            ++field4489;
            this.field4638[10] = this.field4594;
            this.field4572 = (this.field4638[14] + (float)(-this.field4567)) / this.field4638[10];
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "m",
      descriptor = "()Z"
   )
   public final boolean method517() {
      try {
         ++field4447;
         return this.field4619[3].method11((byte)-120);
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4691[134] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(Ltga;IZ[BIZII)Lgu;"
   )
   public abstract class610 method2523(class63 arg0, int arg1, boolean arg2, byte[] arg3, int arg4, boolean arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method491(int arg0) {
      try {
         ++field4555;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[139] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "q",
      descriptor = "(B)V"
   )
   public final void method2524(byte arg0) {
      try {
         int var2 = 88 % ((19 - arg0) / 49);
         ++field4542;
         if (this.field4648[this.field4631] != class636.field8982) {
            this.field4648[this.field4631] = class636.field8982;
            this.field4633[this.field4631].method145();
            this.method2504((byte)-10);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[37] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "B",
      descriptor = "(B)V"
   )
   private final void method2525(byte arg0) {
      boolean var2 = client.field4273;

      try {
         ++field4451;
         this.field4676 = this.method2584((byte)-83, false);
         int var3 = -54 % ((-14 - arg0) / 42);
         this.field4676.method789(-6222, 140, 28);
         int var4 = 0;
         class327 var10000;
         if (var2) {
            var10000 = this;
         } else if (var4 >= 4) {
            var10000 = this;
            if (!var2) {
               this.field4674 = this.method2496(new class414[]{new class414(new class727[]{class727.field10647, class727.field10653, class727.field10653})}, -7406);
               return;
            }
         } else {
            var10000 = this;
         }

         do {
            while(true) {
               Buffer var5 = var10000.field4676.method786(-9609, true);
               if (var5 != null) {
                  Stream var6;
                  label56: {
                     var6 = this.method2560(var5, 127);
                     if (Stream.method5101()) {
                        var6.method5104(0.0F);
                        var6.method5104(0.0F);
                        var6.method5104(0.0F);
                        var6.method5104(0.0F);
                        var6.method5104(0.0F);
                        var6.method5104(0.0F);
                        var6.method5104(0.0F);
                        var6.method5104(0.0F);
                        var6.method5104(1.0F);
                        var6.method5104(0.0F);
                        var6.method5104(0.0F);
                        var6.method5104(1.0F);
                        var6.method5104(0.0F);
                        var6.method5104(1.0F);
                        var6.method5104(1.0F);
                        var6.method5104(1.0F);
                        var6.method5104(0.0F);
                        var6.method5104(1.0F);
                        var6.method5104(1.0F);
                        var6.method5104(1.0F);
                        var6.method5104(1.0F);
                        var6.method5104(1.0F);
                        var6.method5104(0.0F);
                        var6.method5104(0.0F);
                        var6.method5104(1.0F);
                        var6.method5104(0.0F);
                        var6.method5104(1.0F);
                        var6.method5104(0.0F);
                        var6.method5104(0.0F);
                        var6.method5104(0.0F);
                        var6.method5104(0.0F);
                        var6.method5104(0.0F);
                        var6.method5104(0.0F);
                        var6.method5104(0.0F);
                        var6.method5104(0.0F);
                        if (!var2) {
                           break label56;
                        }
                     }

                     var6.method5114(0.0F);
                     var6.method5114(0.0F);
                     var6.method5114(0.0F);
                     var6.method5114(0.0F);
                     var6.method5114(0.0F);
                     var6.method5114(0.0F);
                     var6.method5114(0.0F);
                     var6.method5114(0.0F);
                     var6.method5114(1.0F);
                     var6.method5114(0.0F);
                     var6.method5114(0.0F);
                     var6.method5114(1.0F);
                     var6.method5114(0.0F);
                     var6.method5114(1.0F);
                     var6.method5114(1.0F);
                     var6.method5114(1.0F);
                     var6.method5114(0.0F);
                     var6.method5114(1.0F);
                     var6.method5114(1.0F);
                     var6.method5114(1.0F);
                     var6.method5114(1.0F);
                     var6.method5114(1.0F);
                     var6.method5114(0.0F);
                     var6.method5114(0.0F);
                     var6.method5114(1.0F);
                     var6.method5114(0.0F);
                     var6.method5114(1.0F);
                     var6.method5114(0.0F);
                     var6.method5114(0.0F);
                     var6.method5114(0.0F);
                     var6.method5114(0.0F);
                     var6.method5114(0.0F);
                     var6.method5114(0.0F);
                     var6.method5114(0.0F);
                     var6.method5114(0.0F);
                  }

                  var6.method5109();
                  if (this.field4676.method787((byte)108)) {
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
                     this.field4674 = this.method2496(new class414[]{new class414(new class727[]{class727.field10647, class727.field10653, class727.field10653})}, -7406);
                     return;
                  }
               } else {
                  var10000 = this;
               }
            }
         } while(var2);

         this.field4674 = this.method2496(new class414[]{new class414(new class727[]{class727.field10647, class727.field10653, class727.field10653})}, -7406);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field4691[68] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method594(boolean arg0) {
      try {
         ++field4402;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[111] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "([IIIIIZ)Lbo;"
   )
   public final class763 method524(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         ++field4427;
         return new class754(this, arg3, arg4, arg0, arg1, arg2);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field4691[59] + (arg0 != null ? field4691[6] : field4691[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "w",
      descriptor = "()I"
   )
   public final int method500() {
      try {
         ++field4423;
         return this.field4641 + -2;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4691[106] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "w",
      descriptor = "(B)V"
   )
   private final void method2526(byte arg0) {
      try {
         int var2 = 105 % ((59 - arg0) / 44);
         this.field4626 = false;
         ++field4409;
         this.method2588((byte)51);
         if (class421.field5901 == this.field4627) {
            this.method2567(-72);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[65] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(Lkh;)V"
   )
   public final void method581(class17 arg0) {
      try {
         ++field4523;
         this.field4561 = (class251)arg0;
         this.field4563.method158(this.field4561);
         this.field4563.method1890(32);
         this.field4564.method1889(this.field4563, 30993);
         this.field4562.method1889(this.field4561, 30993);
         if (this.field4627.method4723(32290)) {
            this.method2532((byte)-124);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[133] + (arg0 != null ? field4691[6] : field4691[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(Lza;)V"
   )
   public final void method586(class438 arg0) {
      try {
         ++field4384;
         this.field4504 = ((class357)arg0).field5082;
         this.field4433 = this.field4504.method5098(32768, false);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[97] + (arg0 != null ? field4691[6] : field4691[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "H",
      descriptor = "(I)Ltea;"
   )
   public final class251 method2527(int arg0) {
      try {
         ++field4444;
         return arg0 >= -114 ? null : this.field4633[this.field4631];
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[64] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "i",
      descriptor = "(Z)I"
   )
   public final int method2528(boolean arg0) {
      try {
         ++field4375;
         return arg0 ? -80 : this.field4601;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[150] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method585(Canvas arg0, int arg1, int arg2) {
      try {
         ++field4558;
         if (this.field4506 == arg0) {
            throw new RuntimeException();
         } else if (!this.field4495.containsKey(arg0)) {
            if (!arg0.isShowing()) {
               throw new RuntimeException();
            } else {
               try {
                  Class var4 = Class.forName(field4691[158]);
                  Method var5 = var4.getMethod(field4691[159], Boolean.TYPE);
                  var5.invoke(arg0, Boolean.TRUE);
               } catch (Exception var8) {
               }

               Object var6 = this.method2597(2379, arg0);
               if (var6 == null) {
                  throw new RuntimeException();
               } else {
                  this.field4495.put(arg0, var6);
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field4691[157] + (arg0 != null ? field4691[6] : field4691[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "Q",
      descriptor = "(IIIIII[BII)V"
   )
   public final void method515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
      try {
         ++field4481;
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field4691[95] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field4691[6] : field4691[5]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "HA",
      descriptor = "(IIII[I)V"
   )
   public final void method492(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
      try {
         ++field4416;
         float var6 = this.field4561.method1896((float)arg1, (float)arg0, (float)arg2, (byte)-109);
         if (!((float)this.field4592 > var6) && !(var6 > (float)this.field4567)) {
            int var7 = (int)((float)this.field4645 * this.field4561.method1901((float)arg0, 0, (float)arg2, (float)arg1) / (float)arg3);
            int var8 = (int)((float)this.field4636 * this.field4561.method1903((float)arg1, (float)arg0, (float)arg2, -77) / (float)arg3);
            arg4[0] = (int)((float)var7 + -this.field4590);
            arg4[2] = (int)var6;
            arg4[1] = (int)((float)var8 - this.field4616);
         } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field4691[90] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4691[6] : field4691[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(ILoj;)V"
   )
   public abstract void method2529(int arg0, class403 arg1);

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(I[Loda;)V"
   )
   public final void method601(int arg0, class127[] arg1) {
      boolean var3 = client.field4273;

      try {
         ++field4410;
         int var4 = 0;
         if (var3) {
            this.field4609[var4] = arg1[var4];
            ++var4;
         }

         while(true) {
            class327 var10000;
            if (~var4 <= ~arg0) {
               this.field4640 = arg0;
               var10000 = this;
               if (!var3) {
                  if (this.field4627.method4723(32290)) {
                     this.method2578(-29);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = this;
            }

            var10000.field4609[var4] = arg1[var4];
            ++var4;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4691[167] + arg0 + ',' + (arg1 != null ? field4691[6] : field4691[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "E",
      descriptor = "()I"
   )
   public final int method610() {
      try {
         ++field4387;
         return this.field4560 + this.field4554 + this.field4557;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4691[79] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "m",
      descriptor = "(I)V"
   )
   private final void method2530(int arg0) {
      try {
         if (class179.field2231 != this.field4627) {
            class653 var2 = this.field4627;
            this.field4627 = class179.field2231;
            if (var2.method4723(32290)) {
               this.method2532((byte)-79);
            }

            this.method2472(arg0 + 127);
            this.field4664 = this.field4600;
            this.method2567(-60);
            this.field4610 &= -25;
         }

         ++field4552;
         if (arg0 != 0) {
            this.field4614 = -28;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[112] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "v",
      descriptor = "(B)V"
   )
   private final void method2531(byte arg0) {
      try {
         int var2 = -49 % ((arg0 - 83) / 32);
         ++field4464;
         this.method2580(-8833, 0, this.field4677);
         this.method2529(-90, this.field4686);
         this.method2481(1, 0, class505.field6920, 0);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "<init>",
      descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Lqh;II)V"
   )
   public class327(Canvas arg0, Object arg1, class160 arg2, class74 arg3, int arg4, int arg5) {
      boolean var7 = client.field4273;
      super(arg2);
      this.field4439 = new class536();
      this.field4551 = true;
      this.field4559 = new class251();
      this.field4561 = new class251();
      this.field4562 = new class251();
      this.field4563 = new class251();
      this.field4564 = new class251();
      this.field4565 = new class251();
      this.field4570 = false;
      this.field4588 = false;
      this.field4567 = 3584;
      this.field4569 = false;
      this.field4584 = 1.0F;
      this.field4596 = 8;
      this.field4577 = 0;
      this.field4607 = 16777215;
      this.field4583 = 0;
      this.field4600 = new float[16];
      this.field4586 = -1.0F;
      this.field4598 = 0;
      this.field4572 = 3584.0F;
      this.field4587 = 0;
      this.field4601 = -1;
      this.field4571 = 1.0F;
      this.field4602 = 0;
      this.field4611 = 1;
      this.field4624 = false;
      this.field4585 = 3;
      this.field4623 = false;
      this.field4613 = 0;
      this.field4631 = 0;
      this.field4619 = new class567[10];
      this.field4576 = 0;
      this.field4589 = 128;
      this.field4574 = 0;
      this.field4599 = false;
      this.field4636 = 512;
      this.field4581 = true;
      this.field4626 = false;
      this.field4629 = new float[16];
      this.field4627 = class551.field7587;
      this.field4603 = false;
      this.field4568 = 1.0F;
      this.field4638 = new float[16];
      this.field4597 = -1;
      this.field4634 = -1;
      this.field4644 = -1.0F;
      this.field4647 = false;
      this.field4622 = 1.0F;
      this.field4637 = true;
      this.field4639 = 0;
      this.field4654 = 0;
      this.field4630 = 1.0F;
      this.field4653 = 0;
      this.field4656 = new float[]{0.0F, 0.0F, -1.0F, 0.0F};
      this.field4628 = -1;
      this.field4582 = true;
      this.field4580 = -1;
      this.field4618 = 0;
      this.field4655 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
      this.field4592 = 50;
      this.field4595 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
      this.field4651 = 3584.0F;
      this.field4658 = false;
      this.field4649 = true;
      this.field4662 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
      this.field4615 = 0;
      this.field4645 = 512;
      this.field4625 = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
      this.field4664 = this.field4625;
      this.field4652 = class359.field5109;
      this.field4659 = true;
      this.field4663 = new Stream();
      this.field4669 = new class251();

      try {
         try {
            this.field4544 = this.field4508 = arg1;
            this.field4431 = arg3;
            this.field4483 = this.field4506 = arg0;
            this.field4620 = arg4;
            Dimension var8 = arg0.getSize();
            this.field4604 = arg5;
            this.field4454 = this.field4510 = var8.height;
            this.field4432 = this.field4420 = var8.width;
            class593.method4269(-1, true, false);
            if (super.field726 == null) {
               this.field4385 = new NativeInterface(0, this.field4604);
               this.field4657 = null;
            } else {
               this.field4657 = new class416(this, super.field726);
               this.field4385 = new NativeInterface(super.field726.method1294(-13946), this.field4604);
               int var9 = 0;
               if (var7 || var9 < super.field726.method1294(-13946)) {
                  do {
                     class359 var10 = super.field726.method1293(var9, -5150);
                     if (var10 != null) {
                        this.field4385.initTextureMetrics(var9, var10.field5105, var10.field5111);
                     }

                     ++var9;
                  } while(var9 < super.field726.method1294(-13946));

               }
            }
         } catch (Throwable var13) {
            var13.printStackTrace();
            this.method559(-10565);
            throw new RuntimeException("");
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field4691[47] + (arg0 != null ? field4691[6] : field4691[5]) + ',' + (arg1 != null ? field4691[6] : field4691[5]) + ',' + (arg2 != null ? field4691[6] : field4691[5]) + ',' + (arg3 != null ? field4691[6] : field4691[5]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "d",
      descriptor = "(B)V"
   )
   private final void method2532(byte arg0) {
      try {
         ++field4503;
         this.field4603 = false;
         if (this.field4650 != null) {
            this.field4650.method5(-79);
         }

         this.method2470(true);
         if (arg0 > -42) {
            this.field4557 = -24;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[24] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "e",
      descriptor = "(Z)I"
   )
   public final int method2533(boolean arg0) {
      try {
         ++field4529;
         if (arg0) {
            this.method2555(103);
         }

         return this.field4631;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[145] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "x",
      descriptor = "(B)I"
   )
   public final int method2534(byte arg0) {
      try {
         ++field4457;
         return arg0 != -49 ? 91 : this.field4642;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[132] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(IZIIIZ)V"
   )
   private final void method2535(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         boolean var9 = arg1 & this.method517();
         if (arg4 != -2) {
            this.method2509((Canvas)null, 70, (Object)null);
         }

         ++field4450;
         if (!var9 && (arg2 == 4 || ~arg2 == -9 || arg2 == 9)) {
            arg2 = 2;
            arg0 = ~arg2 == -5 ? arg3 & 1 : 1;
            arg3 = 0;
         }

         if (arg2 != 0 && arg5) {
            arg2 |= Integer.MIN_VALUE;
         }

         if (~this.field4574 == ~arg2) {
            if (~this.field4574 != -1) {
               this.field4619[this.field4574 & Integer.MAX_VALUE].method1(-1309, arg5);
               if (~this.field4577 != ~arg3 || ~this.field4587 != ~arg0) {
                  this.field4619[Integer.MAX_VALUE & this.field4574].method9(arg0, -31, arg3);
                  this.field4577 = arg3;
                  this.field4587 = arg0;
               }

               return;
            }
         } else {
            if (~this.field4574 != -1) {
               this.field4619[Integer.MAX_VALUE & this.field4574].method3(arg4 + 2);
            }

            label56: {
               if (~arg2 != -1) {
                  this.field4650 = this.field4619[arg2 & Integer.MAX_VALUE];
                  this.field4650.method7(arg5, 10286);
                  this.field4650.method1(-1309, arg5);
                  this.field4650.method9(arg0, -65, arg3);
                  if (!client.field4273) {
                     break label56;
                  }
               }

               this.field4650 = null;
            }

            this.field4574 = arg2;
            this.field4587 = arg0;
            this.field4577 = arg3;
         }

      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field4691[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(IIIIII)Ltba;"
   )
   public final class172 method514(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field4541;
         return new class535(this, arg0, arg1, arg2, arg3, arg4, arg5);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field4691[109] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(FFFBFFF)Z"
   )
   private final boolean method2536(float arg0, float arg1, float arg2, byte arg3, float arg4, float arg5, float arg6) {
      try {
         ++field4471;
         if (arg3 != 20) {
            this.field4432 = 124;
         }

         Buffer var8 = this.field4677.method786(arg3 + -9629, true);
         if (var8 == null) {
            return false;
         } else {
            Stream var9;
            label20: {
               var9 = this.method2560(var8, arg3 + 107);
               if (Stream.method5101()) {
                  var9.method5104(arg6);
                  var9.method5104(arg2);
                  var9.method5104(arg5);
                  var9.method5104(arg0);
                  var9.method5104(arg1);
                  var9.method5104(arg4);
                  if (!client.field4273) {
                     break label20;
                  }
               }

               var9.method5114(arg6);
               var9.method5114(arg2);
               var9.method5114(arg5);
               var9.method5114(arg0);
               var9.method5114(arg1);
               var9.method5114(arg4);
            }

            var9.method5109();
            return this.field4677.method787((byte)108);
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field4691[116] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "la",
      descriptor = "()V"
   )
   public final void method593() {
      try {
         this.field4654 = this.field4432;
         this.field4602 = 0;
         this.field4583 = 0;
         this.field4598 = this.field4454;
         ++field4466;
         if (this.field4690) {
            this.field4690 = false;
            this.method2499(-29914);
         }

         this.method2489((byte)-83);
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4691[27] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "Q",
      descriptor = "(I)V"
   )
   private final void method2537(int arg0) {
      try {
         ++field4478;
         this.field4569 = false;
         this.method2540(-128);
         if (class364.field5146 == this.field4627) {
            this.method2567(-92);
         }

         if (arg0 != 1) {
            this.method2603(48);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[125] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "xa",
      descriptor = "(F)V"
   )
   public final void method557(float arg0) {
      try {
         if (this.field4571 != arg0) {
            this.field4571 = arg0;
            this.field4385.setAmbient(arg0);
            this.method2585(true);
            this.method2550((byte)99);
         }

         ++field4502;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "e",
      descriptor = "(B)V"
   )
   private final void method2538(byte arg0) {
      try {
         ++field4372;
         if (class179.field2231 == this.field4627) {
            float var2 = this.method2474(arg0 + -110);
            this.field4559.method1905(0.0F, -14542, var2, var2);
         }

         if (arg0 != 110) {
            this.field4604 = 67;
         }

         this.field4603 = false;
         this.method2596((byte)-84);
         if (this.field4650 != null) {
            this.field4650.method10(-16711936);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[156] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "K",
      descriptor = "([I)V"
   )
   public final void method582(int[] arg0) {
      try {
         arg0[0] = this.field4602;
         ++field4406;
         arg0[1] = this.field4583;
         arg0[2] = this.field4654;
         arg0[3] = this.field4598;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[165] + (arg0 != null ? field4691[6] : field4691[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "g",
      descriptor = "(Z)V"
   )
   public final void method2539(boolean arg0) {
      try {
         ++field4371;
         this.field4559.method145();
         if (arg0) {
            this.field4680 = null;
         }

         this.field4551 = true;
         this.method2538((byte)110);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[153] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "S",
      descriptor = "(I)V"
   )
   private final void method2540(int arg0) {
      try {
         if (!this.field4569) {
            label33: {
               float[] var2 = this.field4629;
               float var3 = (float)this.field4592;
               float var4 = (float)this.field4567;
               float var5 = (float)(-this.field4576) * this.field4630 / (float)this.field4636;
               float var6 = (float)(-this.field4615) * this.field4630 / (float)this.field4645;
               float var7 = (float)(-this.field4615 + this.field4432) * this.field4630 / (float)this.field4645;
               float var8 = (float)(-this.field4576 + this.field4454) * this.field4630 / (float)this.field4636;
               if (var6 == var7 || var5 == var8) {
                  var2[0] = 1.0F;
                  var2[7] = 0.0F;
                  var2[8] = 0.0F;
                  var2[15] = 1.0F;
                  var2[6] = 0.0F;
                  var2[4] = 0.0F;
                  var2[3] = 0.0F;
                  var2[13] = 0.0F;
                  var2[14] = 0.0F;
                  var2[1] = 0.0F;
                  var2[9] = 0.0F;
                  var2[11] = 0.0F;
                  var2[2] = 0.0F;
                  var2[10] = 1.0F;
                  var2[12] = 0.0F;
                  var2[5] = 1.0F;
                  if (!client.field4273) {
                     break label33;
                  }
               }

               var2[1] = 0.0F;
               var2[15] = 1.0F;
               var2[0] = 2.0F / (var7 - var6);
               var2[8] = 0.0F;
               var2[7] = 0.0F;
               var2[14] = var3 / (-var4 + var3);
               var2[10] = 1.0F / (-var4 + var3);
               var2[3] = 0.0F;
               var2[11] = 0.0F;
               var2[5] = 2.0F / (var8 - var5);
               var2[4] = 0.0F;
               var2[9] = 0.0F;
               var2[2] = 0.0F;
               var2[12] = (var6 + var7) / (var6 - var7);
               var2[13] = (var5 + var8) / (var8 - var5);
               var2[6] = 0.0F;
            }

            this.method2544((byte)-80);
            this.field4569 = true;
         }

         if (arg0 >= -125) {
            this.method581((class17)null);
         }

         ++field4519;
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field4691[21] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "k",
      descriptor = "(Z)V"
   )
   public static void method2541(boolean arg0) {
      try {
         field4426 = null;
         if (arg0) {
            method2541(false);
         }

         field4453 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4691[84] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(IF)V"
   )
   public final void method2542(int arg0, float arg1) {
      try {
         if (arg0 == 25919) {
            if (this.field4630 != arg1) {
               this.field4630 = arg1;
               this.method2537(1);
            }

            ++field4456;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[29] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "f",
      descriptor = "()Lkh;"
   )
   public final class17 method603() {
      try {
         ++field4382;
         return new class251();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4691[11] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(I[F)[F"
   )
   public final float[] method2543(int arg0, float[] arg1) {
      try {
         arg1[12] = this.field4664[3];
         arg1[4] = this.field4664[1];
         ++field4413;
         arg1[0] = this.field4664[0];
         arg1[8] = this.field4664[2];
         arg1[2] = this.field4664[8];
         arg1[13] = this.field4664[7];
         arg1[9] = this.field4664[6];
         arg1[5] = this.field4664[5];
         if (arg0 >= -2) {
            this.method2566((byte)12);
         }

         arg1[1] = this.field4664[4];
         arg1[6] = this.field4664[9];
         arg1[14] = this.field4664[11];
         arg1[10] = this.field4664[10];
         arg1[7] = this.field4664[13];
         arg1[3] = this.field4664[12];
         arg1[15] = this.field4664[15];
         arg1[11] = this.field4664[14];
         return arg1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[41] + arg0 + ',' + (arg1 != null ? field4691[6] : field4691[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "F",
      descriptor = "(B)V"
   )
   private final void method2544(byte arg0) {
      try {
         this.field4651 = (float)this.field4567;
         int var2 = 98 / ((-20 - arg0) / 35);
         ++field4414;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[155] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "C",
      descriptor = "(I)V"
   )
   public final void method2545(int arg0) {
      try {
         if (arg0 > -92) {
            this.field4666 = true;
         }

         ++field4467;
         if (~this.field4610 != -17) {
            this.method2555(20275);
            this.method2564((byte)-104, true);
            this.method2575(true, (byte)-105);
            this.method2488(4, true);
            this.method2573((byte)-99, 1);
            this.field4610 = 16;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[136] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "U",
      descriptor = "(IIIII)V"
   )
   public final void method558(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field4405;
         this.method497(arg0, arg1, arg0 - -arg2, arg1, arg3, arg4);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field4691[127] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "b",
      descriptor = "(II)I"
   )
   public final int method540(int arg0, int arg1) {
      try {
         ++field4389;
         return arg1 ^ arg1 & arg0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[31] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "u",
      descriptor = "(B)Ltea;"
   )
   public final class251 method2546(byte arg0) {
      try {
         ++field4430;
         if (arg0 != 15) {
            this.field4631 = -2;
         }

         if (!this.field4603) {
            this.field4565.method1886(this.field4563, this.field4559);
            this.field4603 = true;
         }

         return this.field4565;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[117] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(ILol;I)V"
   )
   public final void method2547(int arg0, class300 arg1, int arg2) {
      try {
         if (arg2 != 0) {
            this.field4560 = 107;
         }

         this.method2517(arg1, arg2 + -1, arg0, false, false);
         ++field4396;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4691[144] + arg0 + ',' + (arg1 != null ? field4691[6] : field4691[5]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method580(int arg0) {
      try {
         ++field4393;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[161] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V"
   )
   public abstract void method2548(Object arg0, byte arg1, Canvas arg2);

   @OriginalMember(
      owner = "client!ce",
      name = "D",
      descriptor = "(I)Ltea;"
   )
   public final class251 method2549(int arg0) {
      try {
         ++field4511;
         return arg0 != -1 ? null : this.field4559;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[131] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "j",
      descriptor = "()Z"
   )
   public final boolean method546() {
      try {
         ++field4440;
         return false;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4691[94] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "r",
      descriptor = "(B)V"
   )
   public abstract void method2550(byte arg0);

   @OriginalMember(
      owner = "client!ce",
      name = "B",
      descriptor = "(I)V"
   )
   public abstract void method2551(int arg0);

   @OriginalMember(
      owner = "client!ce",
      name = "h",
      descriptor = "()V"
   )
   public void method563() {
      boolean var1 = client.field4273;

      try {
         if (!this.field4588) {
            class500 var2 = this.field4439.method3855(119);
            if (var1) {
               ((class357)var2).method2798(true);
               var2 = this.field4439.method3866((byte)119);
            }

            label44:
            while(true) {
               if (var2 == null) {
                  Enumeration var3 = this.field4495.keys();
                  if (!var1) {
                     Canvas var4;
                     if (var1) {
                        var4 = (Canvas)var3.nextElement();
                        this.method2548(this.field4495.get(var4), (byte)126, var4);
                     }

                     while(true) {
                        Object var10000;
                        if (!var3.hasMoreElements()) {
                           class481.method3502(-1, false, true);
                           this.field4385.release();
                           var10000 = this;
                           if (!var1) {
                              this.field4588 = true;
                              break label44;
                           }
                        } else {
                           var10000 = var3.nextElement();
                        }

                        var4 = (Canvas)var10000;
                        this.method2548(this.field4495.get(var4), (byte)126, var4);
                     }
                  }
               } else {
                  ((class357)var2).method2798(true);
               }

               var2 = this.field4439.method3866((byte)119);
            }
         }

         ++field4534;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4691[16] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method2552(int arg0, boolean arg1) {
      try {
         if (this.field4614 != arg0) {
            this.field4614 = arg0;
            this.method2518((byte)83);
         }

         ++field4448;
         if (!arg1) {
            this.field4634 = -79;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[130] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(IZI)Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   public final NativeHeapBuffer method2553(int arg0, boolean arg1, int arg2) {
      try {
         ++field4500;
         if (arg0 != 1) {
            this.field4587 = -33;
         }

         return this.field4504.method5098(arg2, arg1);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4691[28] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "J",
      descriptor = "(I)V"
   )
   public abstract void method2554(int arg0);

   @OriginalMember(
      owner = "client!ce",
      name = "A",
      descriptor = "(I)V"
   )
   private final void method2555(int arg0) {
      try {
         if (arg0 != 20275) {
            this.method2543(79, (float[])null);
         }

         if (class364.field5146 != this.field4627) {
            class653 var2 = this.field4627;
            this.field4627 = class364.field5146;
            if (!var2.method4723(32290)) {
               this.method2532((byte)-88);
            }

            this.method2540(arg0 ^ -20301);
            this.field4664 = this.field4629;
            this.method2567(-126);
            this.field4610 &= -8;
         }

         ++field4491;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[147] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method2556(boolean arg0, boolean arg1) {
      try {
         if (!arg0 == this.field4582) {
            this.field4582 = arg0;
            this.method2582((byte)124);
         }

         ++field4479;
         if (arg1) {
            this.method2598(false, (byte)-25);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[34] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "o",
      descriptor = "(I)V"
   )
   private final void method2557(int arg0) {
      try {
         label15: {
            ++field4469;
            if (this.field4483 != null) {
               Dimension var2 = this.field4483.getSize();
               this.field4420 = var2.width;
               this.field4510 = var2.height;
               if (!client.field4273) {
                  break label15;
               }
            }

            this.field4420 = this.field4510 = 1;
         }

         this.field4432 = this.field4420;
         this.field4454 = this.field4510;
         this.method2500(101);
         this.method2526((byte)112);
         this.method2537(arg0);
         this.method2562(arg0 ^ 1);
         this.method2489((byte)-75);
         this.method2507((byte)-126);
         this.method593();
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[143] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "C",
      descriptor = "(Z)V"
   )
   public final void method574(boolean arg0) {
      try {
         this.field4581 = arg0;
         ++field4527;
         this.method2570(14);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(IIIIIILaa;II)V"
   )
   public final void method565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class516 arg6, int arg7, int arg8) {
      try {
         ++field4398;
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field4691[171] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field4691[6] : field4691[5]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "f",
      descriptor = "(II)V"
   )
   public final void method511(int arg0, int arg1) {
      try {
         if (this.field4592 != arg0 || ~this.field4567 != ~arg1) {
            this.field4567 = arg1;
            this.field4592 = arg0;
            this.method2526((byte)-38);
            this.method2537(1);
            this.method2574(0);
         }

         ++field4476;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[120] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(IIZLtga;III[F)Lgu;"
   )
   public abstract class610 method2558(int arg0, int arg1, boolean arg2, class63 arg3, int arg4, int arg5, int arg6, float[] arg7);

   @OriginalMember(
      owner = "client!ce",
      name = "b",
      descriptor = "()Lkh;"
   )
   public final class17 method507() {
      try {
         ++field4459;
         return this.field4561;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4691[23] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "r",
      descriptor = "(IIIIIII)I"
   )
   public final int method595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4273;

      try {
         int var9;
         label62: {
            ++field4436;
            var9 = 0;
            float var10 = (float)arg2 * this.field4561.field3176 + (float)arg0 * this.field4561.field3185 + (float)arg1 * this.field4561.field3164 + this.field4561.field3151;
            float var11 = (float)arg5 * this.field4561.field3176 + (float)arg3 * this.field4561.field3185 + (float)arg4 * this.field4561.field3164 + this.field4561.field3151;
            if (var10 < (float)this.field4592 && var11 < (float)this.field4592) {
               var9 |= 16;
               if (!var8) {
                  break label62;
               }
            }

            if (var10 > (float)this.field4567 && var11 > (float)this.field4567) {
               var9 |= 32;
            }
         }

         label69: {
            int var12 = (int)(((float)arg2 * this.field4561.field3169 + (float)arg0 * this.field4561.field3163 + (float)arg1 * this.field4561.field3150 + this.field4561.field3168) * (float)this.field4645 / (float)arg6);
            int var13 = (int)(((float)arg5 * this.field4561.field3169 + (float)arg3 * this.field4561.field3163 + (float)arg4 * this.field4561.field3150 + this.field4561.field3168) * (float)this.field4645 / (float)arg6);
            if (!((float)var12 < this.field4590) || !((float)var13 < this.field4590)) {
               if (!(this.field4632 < (float)var12) || !((float)var13 > this.field4632)) {
                  break label69;
               }

               var9 |= 2;
               if (!var8) {
                  break label69;
               }
            }

            var9 |= 1;
         }

         int var14 = (int)(((float)arg2 * this.field4561.field3146 + (float)arg0 * this.field4561.field3140 + (float)arg1 * this.field4561.field3187 + this.field4561.field3159) * (float)this.field4636 / (float)arg6);
         int var15 = (int)(((float)arg5 * this.field4561.field3146 + (float)arg3 * this.field4561.field3140 + (float)arg4 * this.field4561.field3187 + this.field4561.field3159) * (float)this.field4636 / (float)arg6);
         if ((float)var14 < this.field4616 && (float)var15 < this.field4616) {
            var9 |= 4;
            if (!var8) {
               return var9;
            }
         }

         if (this.field4591 < (float)var14 && this.field4591 < (float)var15) {
            var9 |= 8;
         }

         return var9;
      } catch (RuntimeException var17) {
         throw class534.method3846(var17, field4691[39] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "ZA",
      descriptor = "(IFFFFF)V"
   )
   public final void method509(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      try {
         ++field4458;
         boolean var7 = ~this.field4607 != ~arg0;
         if (var7 || this.field4644 != arg1 || this.field4586 != arg2) {
            this.field4644 = arg1;
            this.field4607 = arg0;
            this.field4586 = arg2;
            if (var7) {
               this.field4568 = (float)(this.field4607 & 255) / 255.0F;
               this.field4584 = (float)(16711680 & this.field4607) / 1.671168E7F;
               this.field4622 = (float)(65280 & this.field4607) / 65280.0F;
               this.method2585(true);
            }

            this.field4385.setSunColour(this.field4584, this.field4622, this.field4568, arg1, arg2);
            this.method2514(true);
         }

         if (this.field4595[0] != arg3 || this.field4595[1] != arg4 || this.field4595[2] != arg5) {
            this.field4595[1] = arg4;
            this.field4595[0] = arg3;
            this.field4595[2] = arg5;
            this.field4655[2] = -arg5;
            this.field4655[1] = -arg4;
            this.field4655[0] = -arg3;
            float var8 = (float)(1.0D / Math.sqrt((double)(arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field4662[0] = arg3 * var8;
            this.field4662[2] = arg5 * var8;
            this.field4662[1] = arg4 * var8;
            this.field4656[2] = -this.field4662[2];
            this.field4656[1] = -this.field4662[1];
            this.field4656[0] = -this.field4662[0];
            this.field4385.setSunDirection(this.field4662[0], this.field4662[1], this.field4662[2]);
            this.method2602(3);
            this.field4605 = (int)(arg3 * 256.0F / arg4);
            this.field4621 = (int)(arg5 * 256.0F / arg4);
         }

         this.method2550((byte)80);
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field4691[40] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "d",
      descriptor = "(IZ)Loia;"
   )
   public abstract class96 method2559(int arg0, boolean arg1);

   @OriginalMember(
      owner = "client!ce",
      name = "M",
      descriptor = "()I"
   )
   public final int method505() {
      try {
         ++field4498;
         return this.field4689;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4691[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(Ljaclib/memory/Buffer;I)Ljaclib/memory/Stream;"
   )
   public final Stream method2560(Buffer arg0, int arg1) {
      try {
         ++field4472;
         if (arg1 <= 120) {
            this.method519();
         }

         this.field4663.method5115(arg0);
         return this.field4663;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[45] + (arg0 != null ? field4691[6] : field4691[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "XA",
      descriptor = "()I"
   )
   public final int method578() {
      try {
         ++field4446;
         return this.field4567;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4691[141] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "P",
      descriptor = "(I)V"
   )
   public abstract void method2561(int arg0);

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(IIIIIF)Loda;"
   )
   public final class127 method591(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      try {
         ++field4379;
         return new class671(arg0, arg1, arg2, arg3, arg4, arg5);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field4691[67] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public final void method584(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      boolean var10 = client.field4273;

      try {
         float var11;
         float var12;
         label89: {
            ++field4400;
            var11 = (float)(-arg0) + (float)arg2;
            var12 = (float)(-arg1) + (float)arg3;
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
            this.method2599(true);
            this.method2552(arg4, true);
            this.method2547(0, class206.field2525, 0);
            this.method2592(0, class206.field2525, 0);
            this.method2573((byte)-99, arg5);
            this.method2539(false);
            this.method2598(false, (byte)-80);
            int var26 = arg8 % (arg6 + arg7);
            var14 = (float)arg6 * var11;
            var15 = (float)arg6 * var12;
            var16 = 0.0F;
            var17 = 0.0F;
            var18 = var14;
            var19 = var15;
            if (var26 > arg6) {
               var16 = (float)(arg6 + arg7 - var26) * var11;
               var17 = (float)(-var26 + arg6 + arg7) * var12;
               if (!var10) {
                  break label83;
               }
            }

            var18 = (float)(-var26 + arg6) * var11;
            var19 = (float)(-var26 + arg6) * var12;
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
                  var10000 = (var28 = (float)arg2 - var20) == 0.0F ? 0 : (var28 < 0.0F ? -1 : 1);
               }

               if (var10000 < 0) {
                  break;
               }

               if (var18 + var20 > (float)arg2) {
                  var18 = (float)arg2 + -var20;
               }
            }

            label97: {
               if (~arg3 >= ~arg1) {
                  if (var21 < (float)arg3) {
                     break;
                  }

                  if (!((float)arg3 > var19 + var21)) {
                     break label97;
                  }

                  var19 = (float)arg3 - var21;
                  if (!var10) {
                     break label97;
                  }
               }

               if (var21 > (float)arg3) {
                  break;
               }

               if (var19 + var21 > (float)arg3) {
                  var19 = (float)arg3 - var21;
               }
            }

            if (!this.method2536(var18 + var20, var19 + var21, var21, (byte)20, 0.0F, 0.0F, var20)) {
               return;
            }

            var20 += var18 + var22;
            var21 += var19 + var23;
            this.method2531((byte)127);
            var19 = var15;
            var18 = var14;
         } while(!var10);

         this.method2598(true, (byte)-73);
         this.method2592(0, class550.field7513, 0);
         this.method2547(0, class550.field7513, 0);
      } catch (RuntimeException var25) {
         throw class534.method3846(var25, field4691[86] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "k",
      descriptor = "(I)V"
   )
   public abstract void method2562(int arg0);

   @OriginalMember(
      owner = "client!ce",
      name = "r",
      descriptor = "(I)V"
   )
   public final void method2563(int arg0) {
      try {
         this.method2507((byte)-121);
         if (arg0 > 96) {
            ++field4455;
            this.method2567(125);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[26] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "i",
      descriptor = "(I)V"
   )
   public final void method529(int arg0) {
      try {
         ++field4383;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[20] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method572(int arg0) {
      try {
         ++field4428;
         if (arg0 >= 128 && ~arg0 >= -1025) {
            if (this.field4657 != null) {
               this.field4657.method3146(true);
            }

            this.field4589 = arg0;
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[173] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(BZ)V"
   )
   public final void method2564(byte arg0, boolean arg1) {
      try {
         if (this.field4608 == !arg1) {
            this.field4608 = arg1;
            this.method2582((byte)56);
            this.field4610 &= -32;
         }

         int var3 = 36 / ((-13 - arg0) / 45);
         ++field4474;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4691[91] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "j",
      descriptor = "(I)I"
   )
   public final int method2565(int arg0) {
      try {
         ++field4553;
         if (arg0 != -27805) {
            this.field4642 = -23;
         }

         return this.field4597;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[62] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "JA",
      descriptor = "(IIIIII)I"
   )
   public final int method522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var7 = client.field4273;

      try {
         ++field4475;
         int var8 = 0;
         float var9 = (float)arg2 * this.field4561.field3176 + (float)arg0 * this.field4561.field3185 + (float)arg1 * this.field4561.field3164 + this.field4561.field3151;
         if (var9 < 1.0F) {
            var9 = 1.0F;
         }

         float var10 = (float)arg5 * this.field4561.field3176 + (float)arg3 * this.field4561.field3185 + (float)arg4 * this.field4561.field3164 + this.field4561.field3151;
         if (var10 < 1.0F) {
            var10 = 1.0F;
         }

         label71: {
            if ((float)this.field4592 > var9 && (float)this.field4592 > var10) {
               var8 |= 16;
               if (!var7) {
                  break label71;
               }
            }

            if ((float)this.field4567 < var9 && (float)this.field4567 < var10) {
               var8 |= 32;
            }
         }

         label83: {
            int var11 = (int)(((float)arg2 * this.field4561.field3169 + (float)arg0 * this.field4561.field3163 + (float)arg1 * this.field4561.field3150 + this.field4561.field3168) * (float)this.field4645 / var9);
            int var12 = (int)(((float)arg5 * this.field4561.field3169 + (float)arg3 * this.field4561.field3163 + (float)arg4 * this.field4561.field3150 + this.field4561.field3168) * (float)this.field4645 / var10);
            if (!((float)var11 < this.field4590) || !(this.field4590 > (float)var12)) {
               if (!(this.field4632 < (float)var11) || !((float)var12 > this.field4632)) {
                  break label83;
               }

               var8 |= 2;
               if (!var7) {
                  break label83;
               }
            }

            var8 |= 1;
         }

         int var13 = (int)(((float)arg2 * this.field4561.field3146 + (float)arg0 * this.field4561.field3140 + (float)arg1 * this.field4561.field3187 + this.field4561.field3159) * (float)this.field4636 / var9);
         int var14 = (int)(((float)arg5 * this.field4561.field3146 + (float)arg3 * this.field4561.field3140 + (float)arg4 * this.field4561.field3187 + this.field4561.field3159) * (float)this.field4636 / var10);
         if (!(this.field4616 > (float)var13) || !(this.field4616 > (float)var14)) {
            if (!((float)var13 > this.field4591) || !((float)var14 > this.field4591)) {
               return var8;
            }

            var8 |= 8;
            if (!var7) {
               return var8;
            }
         }

         var8 |= 4;
         return var8;
      } catch (RuntimeException var16) {
         throw class534.method3846(var16, field4691[52] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "m",
      descriptor = "(B)V"
   )
   public final void method2566(byte arg0) {
      try {
         if (arg0 == 111) {
            if (~this.field4610 != -5) {
               this.method2530(0);
               this.method2564((byte)-78, false);
               this.method2476(127, false);
               this.method2575(false, (byte)-122);
               this.method2488(4, false);
               this.method2471(false, (byte)-30, -2, false);
               this.method2573((byte)-99, 1);
               this.method2593(0, 0);
               this.field4610 = 4;
            }

            ++field4386;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[142] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "G",
      descriptor = "(I)V"
   )
   private final void method2567(int arg0) {
      try {
         ++field4422;
         this.method2482(-126);
         if (this.field4650 != null) {
            this.field4650.method2(7938);
         }

         int var2 = 94 / ((71 - arg0) / 53);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[115] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "g",
      descriptor = "(I)V"
   )
   public void method553(int arg0) {
      try {
         if (this.field4657 != null) {
            this.field4657.method3149((byte)27);
         }

         ++field4424;
         this.field4578 = arg0 & Integer.MAX_VALUE;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[44] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "g",
      descriptor = "(B)V"
   )
   private final void method2568(byte arg0) {
      try {
         if (arg0 > 124) {
            if (class421.field5901 != this.field4627) {
               class653 var2 = this.field4627;
               this.field4627 = class421.field5901;
               if (!var2.method4723(32290)) {
                  this.method2532((byte)-60);
               }

               this.method2588((byte)51);
               this.field4664 = this.field4638;
               this.method2567(127);
               this.field4610 &= -8;
            }

            ++field4403;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[104] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "v",
      descriptor = "()Z"
   )
   public final boolean method512() {
      try {
         ++field4370;
         return false;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4691[164] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(Z[[III)Leea;"
   )
   public abstract class142 method2569(boolean arg0, int[][] arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ce",
      name = "I",
      descriptor = "(I)V"
   )
   public abstract void method2570(int arg0);

   @OriginalMember(
      owner = "client!ce",
      name = "x",
      descriptor = "(I)V"
   )
   public abstract void method2571(int arg0);

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(BI)V"
   )
   public abstract void method2572(byte arg0, int arg1);

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method521(Canvas arg0, int arg1, int arg2) {
      try {
         ++field4521;
         Object var4 = null;
         if (arg0 != null && this.field4506 != arg0) {
            if (this.field4495.containsKey(arg0)) {
               var4 = this.field4495.get(arg0);
            }
         } else {
            var4 = this.field4544;
         }

         if (var4 == null) {
            throw new RuntimeException();
         } else {
            this.method2577((byte)6, var4, arg0);
            if (this.field4483 == arg0) {
               this.method2557(1);
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4691[74] + (arg0 != null ? field4691[6] : field4691[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method506(Canvas arg0) {
      try {
         ++field4535;
         if (this.field4506 == arg0) {
            throw new RuntimeException();
         } else if (this.field4495.containsKey(arg0)) {
            this.method2548(this.field4495.get(arg0), (byte)117, arg0);
            this.field4495.remove(arg0);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[124] + (arg0 != null ? field4691[6] : field4691[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "b",
      descriptor = "(BI)V"
   )
   public final void method2573(byte arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         if (arg0 != -99) {
            this.field4626 = false;
         }

         if (this.field4611 != arg1) {
            class494 var4;
            boolean var5;
            boolean var6;
            label65: {
               if (~arg1 == -2) {
                  var4 = class359.field5109;
                  var5 = true;
                  var6 = true;
                  if (!var3) {
                     break label65;
                  }
               }

               if (arg1 == 2) {
                  var6 = false;
                  var5 = true;
                  var4 = class33.field385;
                  if (!var3) {
                     break label65;
                  }
               }

               if (~arg1 == -129) {
                  var5 = true;
                  var4 = class775.field11270;
                  var6 = true;
                  if (!var3) {
                     break label65;
                  }
               }

               var6 = false;
               var4 = class748.field10885;
               var5 = false;
            }

            if (this.field4637 != var6) {
               this.field4637 = var6;
               this.method2554(0);
            }

            if (!var5 != !this.field4659) {
               this.field4659 = var5;
               this.method2477((byte)97);
            }

            if (this.field4652 != var4) {
               this.field4652 = var4;
               this.method2480((byte)26);
            }

            this.field4610 &= -29;
            this.field4611 = arg1;
         }

         ++field4484;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field4691[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "K",
      descriptor = "(I)V"
   )
   private final void method2574(int arg0) {
      try {
         ++field4392;
         if (this.field4650 != null) {
            this.field4650.method4(arg0 ^ -44);
         }

         this.method2551(arg0 ^ arg0);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[138] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "l",
      descriptor = "()Z"
   )
   public final boolean method498() {
      try {
         ++field4482;
         return true;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4691[105] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "Y",
      descriptor = "()[I"
   )
   public final int[] method599() {
      try {
         ++field4442;
         return new int[]{this.field4615, this.field4576, this.field4645, this.field4636};
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4691[148] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method2575(boolean arg0, byte arg1) {
      try {
         ++field4407;
         if (this.field4658 != arg0) {
            this.field4658 = arg0;
            this.method2511((byte)-109);
            this.field4610 &= -32;
         }

         if (arg1 > -100) {
            this.field4586 = -0.31013867F;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[103] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "n",
      descriptor = "(I)V"
   )
   public final void method2576(int arg0) {
      try {
         if (arg0 != 28533) {
            this.field4608 = true;
         }

         ++field4378;
         if (~this.field4610 != -9) {
            this.method2568((byte)125);
            this.method2564((byte)-124, true);
            this.method2575(true, (byte)-115);
            this.method2488(4, true);
            this.method2573((byte)-99, 1);
            this.field4610 = 8;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[118] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V"
   )
   public abstract void method2577(byte arg0, Object arg1, Canvas arg2);

   @OriginalMember(
      owner = "client!ce",
      name = "q",
      descriptor = "(I)V"
   )
   public void method2578(int arg0) {
      try {
         this.field4566 = this.field4640;
         ++field4512;
         if (arg0 >= -14) {
            this.method2582((byte)71);
         }

         this.field4640 = 0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[81] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "KA",
      descriptor = "(IIII)V"
   )
   public final void method577(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field4412;
         if (arg0 <= 0 && ~arg2 <= ~(this.field4432 + -1) && ~arg1 >= -1 && ~(this.field4454 + -1) >= ~arg3) {
            this.method593();
         } else {
            this.field4654 = this.field4432 >= arg2 ? arg2 : 0;
            this.field4598 = arg3 > this.field4432 ? 0 : arg3;
            this.field4602 = ~arg0 <= -1 ? arg0 : 0;
            this.field4583 = arg1 >= 0 ? arg1 : 0;
            if (!this.field4690) {
               this.field4690 = true;
               this.method2499(-29914);
            }

            this.method2485(2);
            this.method2489((byte)-113);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4691[71] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;"
   )
   public final class295 method541(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      try {
         ++field4418;
         return new class465(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field4691[98] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4691[6] : field4691[5]) + ',' + (arg3 != null ? field4691[6] : field4691[5]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "b",
      descriptor = "(B)Ltea;"
   )
   public final class251 method2579(byte arg0) {
      try {
         ++field4492;
         int var2 = 78 / ((66 - arg0) / 51);
         return this.field4564;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[123] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(IILso;)V"
   )
   public abstract void method2580(int arg0, int arg1, class499 arg2);

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(Lho;I)V"
   )
   public final void method2581(class159 arg0, int arg1) {
      try {
         if (this.field4617[this.field4631] != arg0) {
            label26: {
               this.field4617[this.field4631] = arg0;
               if (arg0 == null) {
                  this.method2491(0);
                  if (!client.field4273) {
                     break label26;
                  }
               }

               arg0.method41(-26708);
            }

            this.field4610 &= -2;
         }

         int var3 = -116 / ((arg1 - 61) / 34);
         ++field4470;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4691[80] + (arg0 != null ? field4691[6] : field4691[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "s",
      descriptor = "(B)V"
   )
   public abstract void method2582(byte arg0);

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(Luk;B)V"
   )
   public abstract void method2583(class273 arg0, byte arg1);

   @OriginalMember(
      owner = "client!ce",
      name = "b",
      descriptor = "(BZ)Lso;"
   )
   public abstract class499 method2584(byte arg0, boolean arg1);

   @OriginalMember(
      owner = "client!ce",
      name = "m",
      descriptor = "(Z)V"
   )
   public abstract void method2585(boolean arg0);

   @OriginalMember(
      owner = "client!ce",
      name = "d",
      descriptor = "(II)I"
   )
   public final int method503(int arg0, int arg1) {
      try {
         ++field4538;
         return arg0 | arg1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[55] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(Ltba;)V"
   )
   public final void method556(class172 arg0) {
      try {
         this.field4646 = (class199)arg0;
         ++field4524;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[4] + (arg0 != null ? field4691[6] : field4691[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(ILtea;)V"
   )
   public final void method2586(int arg0, class251 arg1) {
      try {
         this.field4559.method158(arg1);
         ++field4394;
         if (arg0 != 1) {
            this.field4630 = 0.448437F;
         }

         this.field4551 = false;
         this.method2538((byte)110);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[14] + arg0 + ',' + (arg1 != null ? field4691[6] : field4691[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(Lou;ILou;)V"
   )
   public final void method2587(class635 arg0, int arg1, class635 arg2) {
      try {
         ++field4486;
         boolean var4 = false;
         if (this.field4661[this.field4631] != arg2) {
            this.field4661[this.field4631] = arg2;
            this.method2571(5863);
            var4 = true;
         }

         if (this.field4573[this.field4631] != arg0) {
            this.field4573[this.field4631] = arg0;
            var4 = true;
            this.method2513(false);
         }

         int var5 = -81 / ((arg1 - -27) / 48);
         if (var4) {
            this.field4610 &= -30;
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field4691[89] + (arg0 != null ? field4691[6] : field4691[5]) + ',' + arg1 + ',' + (arg2 != null ? field4691[6] : field4691[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(II[I[I)Laa;"
   )
   public final class516 method604(int arg0, int arg1, int[] arg2, int[] arg3) {
      try {
         ++field4537;
         return class8.method68(arg3, arg1, this, -23081, arg0, arg2);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4691[146] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4691[6] : field4691[5]) + ',' + (arg3 != null ? field4691[6] : field4691[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "h",
      descriptor = "(B)V"
   )
   private final void method2588(byte arg0) {
      try {
         ++field4462;
         if (!this.field4626) {
            label24: {
               float[] var2 = this.field4638;
               float var3 = (float)(-this.field4615 * this.field4592) / (float)this.field4645;
               float var4 = (float)((-this.field4615 + this.field4432) * this.field4592) / (float)this.field4645;
               float var5 = (float)(this.field4592 * this.field4576) / (float)this.field4636;
               float var6 = (float)((-this.field4454 + this.field4576) * this.field4592) / (float)this.field4636;
               if (var3 != var4 && var5 != var6) {
                  float var7 = (float)this.field4592 * 2.0F;
                  var2[6] = 0.0F;
                  var2[12] = 0.0F;
                  var2[15] = 0.0F;
                  var2[13] = 0.0F;
                  var2[5] = var7 / (-var6 + var5);
                  var2[8] = (var3 + var4) / (-var3 + var4);
                  var2[10] = this.field4594 = (float)this.field4567 / (float)(-this.field4567 + this.field4592);
                  var2[3] = 0.0F;
                  var2[14] = this.field4579 = (float)(this.field4592 * this.field4567) / (float)(-this.field4567 + this.field4592);
                  var2[2] = 0.0F;
                  var2[4] = 0.0F;
                  var2[0] = var7 / (var4 - var3);
                  var2[1] = 0.0F;
                  var2[11] = -1.0F;
                  var2[7] = 0.0F;
                  var2[9] = (var5 + var6) / (var5 - var6);
                  if (!client.field4273) {
                     break label24;
                  }
               }

               var2[7] = 0.0F;
               var2[13] = 0.0F;
               var2[12] = 0.0F;
               var2[11] = 0.0F;
               var2[14] = 0.0F;
               var2[1] = 0.0F;
               var2[4] = 0.0F;
               var2[6] = 0.0F;
               var2[2] = 0.0F;
               var2[3] = 0.0F;
               var2[8] = 0.0F;
               var2[15] = 1.0F;
               var2[9] = 0.0F;
               var2[5] = 1.0F;
               var2[10] = 1.0F;
               var2[0] = 1.0F;
            }

            this.method2522((byte)66);
            this.field4626 = true;
         }

         if (arg0 != 51) {
            this.field4676 = null;
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field4691[163] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "c",
      descriptor = "(IZ)V"
   )
   public final void method2589(int arg0, boolean arg1) {
      try {
         if (arg0 != 15) {
            this.field4622 = -0.7932601F;
         }

         ++field4468;
         if (this.field4649 == !arg1) {
            this.field4649 = arg1;
            this.method2604((byte)95);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4691[128] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "X",
      descriptor = "(I)V"
   )
   public final void method533(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(Ltga;ILiw;IZ)Lgu;"
   )
   public abstract class610 method2590(class63 arg0, int arg1, class335 arg2, int arg3, boolean arg4);

   @OriginalMember(
      owner = "client!ce",
      name = "N",
      descriptor = "(I)V"
   )
   private final void method2591(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ce",
      name = "q",
      descriptor = "()Z"
   )
   public final boolean method561() {
      try {
         ++field4452;
         return true;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4691[78] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "b",
      descriptor = "(ILol;I)V"
   )
   public final void method2592(int arg0, class300 arg1, int arg2) {
      try {
         ++field4419;
         this.method2520(arg1, arg0, (byte)103, false);
         if (arg2 != 0) {
            this.field4670 = null;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4691[19] + arg0 + ',' + (arg1 != null ? field4691[6] : field4691[5]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "g",
      descriptor = "(II)V"
   )
   public final void method2593(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         if (arg0 == 0) {
            label53: {
               if (~arg1 == -2) {
                  this.method2587(class535.field7314, -125, class535.field7314);
                  if (!var3) {
                     break label53;
                  }
               }

               if (arg1 == 0) {
                  this.method2587(class449.field6203, 121, class449.field6203);
                  if (!var3) {
                     break label53;
                  }
               }

               if (~arg1 != -3) {
                  if (~arg1 == -4) {
                     this.method2587(class449.field6203, 32, class59.field623);
                     if (!var3) {
                        break label53;
                     }
                  }

                  if (~arg1 != -5) {
                     break label53;
                  }

                  this.method2587(class767.field11065, 112, class767.field11065);
                  if (!var3) {
                     break label53;
                  }
               }

               this.method2587(class535.field7314, 31, class581.field7982);
            }

            ++field4421;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4691[102] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "DA",
      descriptor = "(IIII)V"
   )
   public final void method526(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field4545;
         this.field4615 = arg0;
         this.field4576 = arg1;
         this.field4645 = arg2;
         this.field4636 = arg3;
         this.method2537(1);
         this.method2526((byte)113);
         this.method2507((byte)-105);
         this.method2489((byte)-66);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4691[50] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(Ltga;ILiw;)Z"
   )
   public abstract boolean method2594(class63 arg0, int arg1, class335 arg2);

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "([FLtga;ZIII)Lgu;"
   )
   public final class610 method2595(float[] arg0, class63 arg1, boolean arg2, int arg3, int arg4, int arg5) {
      try {
         ++field4518;
         if (arg3 >= -37) {
            this.field4635 = -2.9557974F;
         }

         return this.method2558(arg4, 0, arg2, arg1, 0, arg5, 19473, arg0);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field4691[100] + (arg0 != null ? field4691[6] : field4691[5]) + ',' + (arg1 != null ? field4691[6] : field4691[5]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "T",
      descriptor = "(IIII)V"
   )
   public final void method530(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field4487;
         boolean var5 = false;
         if (~this.field4602 > ~arg0) {
            var5 = true;
            this.field4602 = arg0;
         }

         if (arg2 < this.field4654) {
            this.field4654 = arg2;
            var5 = true;
         }

         if (this.field4583 < arg1) {
            var5 = true;
            this.field4583 = arg1;
         }

         if (arg3 < this.field4598) {
            this.field4598 = arg3;
            var5 = true;
         }

         if (var5) {
            if (!this.field4690) {
               this.field4690 = true;
               this.method2499(-29914);
            }

            this.method2485(2);
            this.method2489((byte)-119);
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field4691[87] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "k",
      descriptor = "(B)V"
   )
   public abstract void method2596(byte arg0);

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;"
   )
   public abstract Object method2597(int arg0, Canvas arg1);

   @OriginalMember(
      owner = "client!ce",
      name = "y",
      descriptor = "()Z"
   )
   public final boolean method538() {
      try {
         ++field4376;
         return this.field4575;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4691[76] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "b",
      descriptor = "(ZB)V"
   )
   public abstract void method2598(boolean arg0, byte arg1);

   @OriginalMember(
      owner = "client!ce",
      name = "f",
      descriptor = "(Z)V"
   )
   private final void method2599(boolean arg0) {
      try {
         ++field4539;
         if (~this.field4610 != -2) {
            this.method2530(0);
            this.method2564((byte)110, false);
            this.method2476(126, false);
            this.method2575(false, (byte)-123);
            this.method2488(4, false);
            this.method2471(false, (byte)-107, -2, false);
            this.method2593(0, 1);
            this.method2581(this.field4660, 112);
            this.field4610 = 1;
         }

         if (!arg0) {
            this.field4664 = null;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[122] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "j",
      descriptor = "(B)V"
   )
   public final void method2600(byte arg0) {
      boolean var2 = client.field4273;

      try {
         ++field4443;
         Enumeration var3 = this.field4495.keys();
         Canvas var4;
         if (var2) {
            var4 = (Canvas)var3.nextElement();
            this.method2548(this.field4495.get(var4), (byte)95, var4);
         }

         while(true) {
            Object var10000;
            if (!var3.hasMoreElements()) {
               this.field4676.method788((byte)95);
               this.field4677.method788((byte)113);
               var10000 = this.field4670;
               if (!var2) {
                  ((class499)var10000).method788((byte)114);
                  if (arg0 > -74) {
                     this.field4589 = 80;
                  }

                  this.field4675.method5168(true);
                  this.field4684.method5168(true);
                  this.field4668.method5168(true);
                  this.field4682.method5168(true);
                  this.field4683.method5168(true);
                  this.field4665.method4162(18425);
                  this.field4673.method788((byte)111);
                  return;
               }
            } else {
               var10000 = var3.nextElement();
            }

            var4 = (Canvas)var10000;
            this.method2548(this.field4495.get(var4), (byte)95, var4);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4691[174] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "n",
      descriptor = "(Z)Ltea;"
   )
   public final class251 method2601(boolean arg0) {
      try {
         ++field4404;
         if (arg0) {
            this.method493();
         }

         return this.field4633[this.field4631];
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4691[110] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "L",
      descriptor = "(I)V"
   )
   public abstract void method2602(int arg0);

   @OriginalMember(
      owner = "client!ce",
      name = "u",
      descriptor = "(I)V"
   )
   public abstract void method2603(int arg0);

   @OriginalMember(
      owner = "client!ce",
      name = "A",
      descriptor = "(B)V"
   )
   public abstract void method2604(byte arg0);

   @OriginalMember(
      owner = "client!ce",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2605(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 120);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ce",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2606(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 120;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
