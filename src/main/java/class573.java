import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class573 extends class66 {
   @OriginalMember(
      owner = "client!ea",
      name = "Yd",
      descriptor = "Ljava/util/Hashtable;"
   )
   private Hashtable field8235;
   @OriginalMember(
      owner = "client!ea",
      name = "ud",
      descriptor = "I"
   )
   public int field8338;
   @OriginalMember(
      owner = "client!ea",
      name = "Yc",
      descriptor = "Lbw;"
   )
   private class718 field8347;
   @OriginalMember(
      owner = "client!ea",
      name = "me",
      descriptor = "Liea;"
   )
   private class507 field8348;
   @OriginalMember(
      owner = "client!ea",
      name = "Qd",
      descriptor = "Liea;"
   )
   public class507 field8349;
   @OriginalMember(
      owner = "client!ea",
      name = "of",
      descriptor = "I"
   )
   public int field8352;
   @OriginalMember(
      owner = "client!ea",
      name = "Fb",
      descriptor = "Z"
   )
   private boolean field8353;
   @OriginalMember(
      owner = "client!ea",
      name = "cg",
      descriptor = "I"
   )
   public int field8356;
   @OriginalMember(
      owner = "client!ea",
      name = "xb",
      descriptor = "Lll;"
   )
   private class387 field8354;
   @OriginalMember(
      owner = "client!ea",
      name = "Ng",
      descriptor = "I"
   )
   private int field8362;
   @OriginalMember(
      owner = "client!ea",
      name = "Pd",
      descriptor = "I"
   )
   private int field8364;
   @OriginalMember(
      owner = "client!ea",
      name = "dc",
      descriptor = "[Lbv;"
   )
   private class324[] field8361;
   @OriginalMember(
      owner = "client!ea",
      name = "Wd",
      descriptor = "[Lbv;"
   )
   private class324[] field8363;
   @OriginalMember(
      owner = "client!ea",
      name = "Pb",
      descriptor = "I"
   )
   private int field8357;
   @OriginalMember(
      owner = "client!ea",
      name = "Xf",
      descriptor = "[Lbv;"
   )
   private class324[] field8366;
   @OriginalMember(
      owner = "client!ea",
      name = "bb",
      descriptor = "Lll;"
   )
   private class387 field8369;
   @OriginalMember(
      owner = "client!ea",
      name = "Id",
      descriptor = "Lll;"
   )
   private class387 field8371;
   @OriginalMember(
      owner = "client!ea",
      name = "yf",
      descriptor = "Lll;"
   )
   private class387 field8372;
   @OriginalMember(
      owner = "client!ea",
      name = "Oc",
      descriptor = "Lll;"
   )
   private class387 field8373;
   @OriginalMember(
      owner = "client!ea",
      name = "Sf",
      descriptor = "Lll;"
   )
   private class387 field8374;
   @OriginalMember(
      owner = "client!ea",
      name = "Hd",
      descriptor = "Lll;"
   )
   private class387 field8375;
   @OriginalMember(
      owner = "client!ea",
      name = "Tg",
      descriptor = "Lll;"
   )
   private class387 field8376;
   @OriginalMember(
      owner = "client!ea",
      name = "Gg",
      descriptor = "Liea;"
   )
   public class507 field8379;
   @OriginalMember(
      owner = "client!ea",
      name = "wh",
      descriptor = "Liea;"
   )
   public class507 field8386;
   @OriginalMember(
      owner = "client!ea",
      name = "Z",
      descriptor = "Liea;"
   )
   public class507 field8387;
   @OriginalMember(
      owner = "client!ea",
      name = "Hf",
      descriptor = "I"
   )
   public int field8390;
   @OriginalMember(
      owner = "client!ea",
      name = "Fe",
      descriptor = "F"
   )
   public float field8402;
   @OriginalMember(
      owner = "client!ea",
      name = "zg",
      descriptor = "[F"
   )
   private float[] field8415;
   @OriginalMember(
      owner = "client!ea",
      name = "Uc",
      descriptor = "F"
   )
   public float field8391;
   @OriginalMember(
      owner = "client!ea",
      name = "ue",
      descriptor = "I"
   )
   private int field8420;
   @OriginalMember(
      owner = "client!ea",
      name = "Se",
      descriptor = "I"
   )
   private int field8412;
   @OriginalMember(
      owner = "client!ea",
      name = "hh",
      descriptor = "F"
   )
   public float field8440;
   @OriginalMember(
      owner = "client!ea",
      name = "ve",
      descriptor = "I"
   )
   public int field8431;
   @OriginalMember(
      owner = "client!ea",
      name = "Bg",
      descriptor = "I"
   )
   public int field8403;
   @OriginalMember(
      owner = "client!ea",
      name = "hc",
      descriptor = "I"
   )
   public int field8452;
   @OriginalMember(
      owner = "client!ea",
      name = "s",
      descriptor = "I"
   )
   private int field8451;
   @OriginalMember(
      owner = "client!ea",
      name = "Lb",
      descriptor = "I"
   )
   private int field8435;
   @OriginalMember(
      owner = "client!ea",
      name = "dh",
      descriptor = "I"
   )
   private int field8462;
   @OriginalMember(
      owner = "client!ea",
      name = "lb",
      descriptor = "I"
   )
   public int field8416;
   @OriginalMember(
      owner = "client!ea",
      name = "Zc",
      descriptor = "F"
   )
   private float field8459;
   @OriginalMember(
      owner = "client!ea",
      name = "Wb",
      descriptor = "I"
   )
   private int field8394;
   @OriginalMember(
      owner = "client!ea",
      name = "jg",
      descriptor = "I"
   )
   private int field8464;
   @OriginalMember(
      owner = "client!ea",
      name = "cc",
      descriptor = "F"
   )
   private float field8414;
   @OriginalMember(
      owner = "client!ea",
      name = "C",
      descriptor = "F"
   )
   public float field8465;
   @OriginalMember(
      owner = "client!ea",
      name = "Fc",
      descriptor = "[F"
   )
   private float[] field8472;
   @OriginalMember(
      owner = "client!ea",
      name = "Ce",
      descriptor = "[F"
   )
   private float[] field8475;
   @OriginalMember(
      owner = "client!ea",
      name = "qg",
      descriptor = "[F"
   )
   public float[] field8405;
   @OriginalMember(
      owner = "client!ea",
      name = "rh",
      descriptor = "I"
   )
   public int field8409;
   @OriginalMember(
      owner = "client!ea",
      name = "jf",
      descriptor = "I"
   )
   private int field8448;
   @OriginalMember(
      owner = "client!ea",
      name = "Fg",
      descriptor = "F"
   )
   public float field8424;
   @OriginalMember(
      owner = "client!ea",
      name = "Ze",
      descriptor = "Z"
   )
   private boolean field8458;
   @OriginalMember(
      owner = "client!ea",
      name = "Ae",
      descriptor = "F"
   )
   private float field8426;
   @OriginalMember(
      owner = "client!ea",
      name = "Ue",
      descriptor = "F"
   )
   private float field8429;
   @OriginalMember(
      owner = "client!ea",
      name = "Sg",
      descriptor = "F"
   )
   public float field8461;
   @OriginalMember(
      owner = "client!ea",
      name = "Vg",
      descriptor = "I"
   )
   private int field8484;
   @OriginalMember(
      owner = "client!ea",
      name = "cf",
      descriptor = "I"
   )
   public int field8473;
   @OriginalMember(
      owner = "client!ea",
      name = "lf",
      descriptor = "I"
   )
   private int field8401;
   @OriginalMember(
      owner = "client!ea",
      name = "yg",
      descriptor = "I"
   )
   public int field8433;
   @OriginalMember(
      owner = "client!ea",
      name = "sd",
      descriptor = "[Lmn;"
   )
   private class389[] field8492;
   @OriginalMember(
      owner = "client!ea",
      name = "rf",
      descriptor = "F"
   )
   private float field8488;
   @OriginalMember(
      owner = "client!ea",
      name = "Af",
      descriptor = "I"
   )
   public int field8496;
   @OriginalMember(
      owner = "client!ea",
      name = "Bf",
      descriptor = "F"
   )
   public float field8442;
   @OriginalMember(
      owner = "client!ea",
      name = "fe",
      descriptor = "[F"
   )
   private float[] field8453;
   @OriginalMember(
      owner = "client!ea",
      name = "Bb",
      descriptor = "I"
   )
   public int field8497;
   @OriginalMember(
      owner = "client!ea",
      name = "Dc",
      descriptor = "I"
   )
   public int field8493;
   @OriginalMember(
      owner = "client!ea",
      name = "rb",
      descriptor = "Z"
   )
   private boolean field8406;
   @OriginalMember(
      owner = "client!ea",
      name = "Jg",
      descriptor = "Lsh;"
   )
   public class77 field8490;
   @OriginalMember(
      owner = "client!ea",
      name = "Bc",
      descriptor = "[I"
   )
   public int[] field8500;
   @OriginalMember(
      owner = "client!ea",
      name = "Td",
      descriptor = "[I"
   )
   public int[] field8501;
   @OriginalMember(
      owner = "client!ea",
      name = "Mc",
      descriptor = "[B"
   )
   public byte[] field8503;
   @OriginalMember(
      owner = "client!ea",
      name = "E",
      descriptor = "[I"
   )
   public int[] field8499;
   @OriginalMember(
      owner = "client!ea",
      name = "ec",
      descriptor = "I"
   )
   public int field8341;
   @OriginalMember(
      owner = "client!ea",
      name = "Md",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field8170;
   @OriginalMember(
      owner = "client!ea",
      name = "ef",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field8215;
   @OriginalMember(
      owner = "client!ea",
      name = "mh",
      descriptor = "Ljaggl/OpenGL;"
   )
   private OpenGL field8158;
   @OriginalMember(
      owner = "client!ea",
      name = "de",
      descriptor = "J"
   )
   private long field8216;
   @OriginalMember(
      owner = "client!ea",
      name = "Le",
      descriptor = "J"
   )
   private long field8255;
   @OriginalMember(
      owner = "client!ea",
      name = "oe",
      descriptor = "Z"
   )
   public boolean field8469;
   @OriginalMember(
      owner = "client!ea",
      name = "wc",
      descriptor = "I"
   )
   public int field8439;
   @OriginalMember(
      owner = "client!ea",
      name = "Y",
      descriptor = "Ljava/lang/String;"
   )
   private String field8428;
   @OriginalMember(
      owner = "client!ea",
      name = "bd",
      descriptor = "Z"
   )
   public boolean field8483;
   @OriginalMember(
      owner = "client!ea",
      name = "kf",
      descriptor = "Z"
   )
   private boolean field8449;
   @OriginalMember(
      owner = "client!ea",
      name = "xf",
      descriptor = "Z"
   )
   public boolean field8436;
   @OriginalMember(
      owner = "client!ea",
      name = "Ie",
      descriptor = "Z"
   )
   public boolean field8397;
   @OriginalMember(
      owner = "client!ea",
      name = "fc",
      descriptor = "Z"
   )
   public boolean field8399;
   @OriginalMember(
      owner = "client!ea",
      name = "wd",
      descriptor = "Z"
   )
   private boolean field8481;
   @OriginalMember(
      owner = "client!ea",
      name = "md",
      descriptor = "Ljava/lang/String;"
   )
   private String field8467;
   @OriginalMember(
      owner = "client!ea",
      name = "Vb",
      descriptor = "Z"
   )
   public boolean field8445;
   @OriginalMember(
      owner = "client!ea",
      name = "qe",
      descriptor = "Z"
   )
   private boolean field8408;
   @OriginalMember(
      owner = "client!ea",
      name = "tb",
      descriptor = "Lqm;"
   )
   private class156 field8339;
   @OriginalMember(
      owner = "client!ea",
      name = "Hg",
      descriptor = "Lbn;"
   )
   public class470 field8351;
   @OriginalMember(
      owner = "client!ea",
      name = "xh",
      descriptor = "Lhc;"
   )
   private class152 field8342;
   @OriginalMember(
      owner = "client!ea",
      name = "gb",
      descriptor = "Lso;"
   )
   private class498 field8337;
   @OriginalMember(
      owner = "client!ea",
      name = "Mb",
      descriptor = "Lbja;"
   )
   private class34 field8346;
   @OriginalMember(
      owner = "client!ea",
      name = "yh",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8505 = new String[]{method4182(method4181("\n\u0001CL\nG")), method4182(method4181("\n\u0001Cq)G")), method4182(method4181("\n\u0001Ch)G")), method4182(method4181("\n\u0001Ca\"G")), method4182(method4181("\n\u0001Cz*G")), method4182(method4181("\n\u0001Cu*G")), method4182(method4181("\u0001\u0015\u0001L")), method4182(method4181("\u0014NC\u000e\u0016")), method4182(method4181("\n\u0001Cw)G")), method4182(method4181("\n\u0001Cm-G")), method4182(method4181("\n\u0001Cp!G")), method4182(method4181("\n\u0001Cw\"G")), method4182(method4181("\n\u0001CqC")), method4182(method4181("\n\u0001CRC")), method4182(method4181("\n\u0001Cp-G")), method4182(method4181("\n\u0001Cr#G")), method4182(method4181("\n\u0001CjC")), method4182(method4181("\n\u0001Co)G")), method4182(method4181("\n\u0001CcC")), method4182(method4181("\n\u0001Cv#G")), method4182(method4181("\n\u0001Cv/G")), method4182(method4181("\n\u0001Cf)G")), method4182(method4181("\n\u0001Ct*G")), method4182(method4181("\n\u0001Cv*G")), method4182(method4181("\n\u0001Cl/G")), method4182(method4181("\n\u0001Cc\"G")), method4182(method4181("\n\u0001Ce*G")), method4182(method4181("\n\u0001Ct)G")), method4182(method4181("\n\u0001Cn)G")), method4182(method4181("\u001c\u0005\u0019i\f\u0001\u000f\u001fE9\n\u0010\fI\u0005\u001b")), method4182(method4181("\u0005\u0001\u001bAE\u000e\u0017\u0019\u000e(\u000e\u000e\u001bA\u0018")), method4182(method4181("\n\u0001Cj#G")), method4182(method4181("\n\u0001Ch.G")), method4182(method4181("\n\u0001Cn-G")), method4182(method4181("\n\u0001CR\nG")), method4182(method4181("\n\u0001Cu/G")), method4182(method4181("\n\u0001Cg,G")), method4182(method4181("\n\u0001Cn!G")), method4182(method4181("\n\u0001Cu,G")), method4182(method4181("\n\u0001Cs)G")), method4182(method4181("\n\u0001CD\nG")), method4182(method4181("\u0000\u0010\bN\u0001\u001c")), method4182(method4181("\n\u0001Cs/G")), method4182(method4181("\n\u0001Cm/G")), method4182(method4181("\n\u0001Cu\"G")), method4182(method4181("\n\u0001Ce/G")), method4182(method4181("\n\u0001Cj*G")), method4182(method4181("\n\u0001Ce,G")), method4182(method4181("\n\u0001Cg)G")), method4182(method4181("\n\u0001CwC")), method4182(method4181("\n\u0001Cp)G")), method4182(method4181("\n\u0001Cd*G")), method4182(method4181("\n\u0001Ci.G")), method4182(method4181("\n\u0001Cr*G")), method4182(method4181("\n\u0001Ci-G")), method4182(method4181("\n\u0001Cj,G")), method4182(method4181("\n\u0001Ci)G")), method4182(method4181("\n\u0001Cm(G")), method4182(method4181("\n\u0001Ch*G")), method4182(method4181("\n\u0001CnC")), method4182(method4181("\n\u0001Cc/G")), method4182(method4181("\n\u0001ClC")), method4182(method4181("\n\u0001Cd.G")), method4182(method4181("\n\u0001CZ\nG")), method4182(method4181("\n\u0001Cc)G")), method4182(method4181("\n\u0001Ch(G")), method4182(method4181("\n\u0001Ci!G")), method4182(method4181("\n\u0001Ce-G")), method4182(method4181("\n\u0001Co(G")), method4182(method4181("\n\u0001Cs*G")), method4182(method4181("\n\u0001CvC")), method4182(method4181("\n\u0001CgC")), method4182(method4181("\n\u0001CBC")), method4182(method4181("\n\u0001Cf,G")), method4182(method4181("\n\u0001CkC")), method4182(method4181("\n\u0001Cr\"G")), method4182(method4181("\n\u0001Ch-G")), method4182(method4181("\n\u0001CA\nG")), method4182(method4181("\n\u0001Cu)G")), method4182(method4181("\n\u0001Cj!G")), method4182(method4181("\n\u0001Ca#G")), method4182(method4181("\n\u0001CmC")), method4182(method4181("\n\u0001Ci/G")), method4182(method4181("\n\u0001Ci(G")), method4182(method4181("\n\u0001Cw-G")), method4182(method4181("\n\u0001Ct!G")), method4182(method4181("\n\u0001Cb\"G")), method4182(method4181("\n\u0001CfC")), method4182(method4181("\n\u0001Cf!G")), method4182(method4181("\n\u0001Ck!G")), method4182(method4181("\n\u0001CN\nG")), method4182(method4181("\n\u0001Ci*G")), method4182(method4181("\n\u0001CyC")), method4182(method4181("\n\u0001Ca/G")), method4182(method4181("\n\u0001Ca!G")), method4182(method4181("\n\u0001Cj)G")), method4182(method4181("\n\u0001Cc*G")), method4182(method4181("\n\u0001Cb*G")), method4182(method4181("\n\u0001Cj(G")), method4182(method4181("\n\u0001Ce#G")), method4182(method4181("\n\u0001Cd(G")), method4182(method4181("\n\u0001Cg.G")), method4182(method4181("\n\u0001Cq-G")), method4182(method4181("\n\u0001Cb(G")), method4182(method4181("\n\u0001CrC")), method4182(method4181("\n\u0001Cu-G")), method4182(method4181("\n\u0001Ck/G")), method4182(method4181("\n\u0001Cq*G")), method4182(method4181("\n\u0001CeC")), method4182(method4181("\n\u0001CX\nG")), method4182(method4181("\n\u0001Cf.G")), method4182(method4181("\n\u0001Cj.G")), method4182(method4181("\n\u0001Cn\"G")), method4182(method4181("(,2e3;?\u000bR\n\u0002\u0005\u000fU\r\t\u0005\u001f\u007f\u0006\u001a\f\u0019I\u0018\u000e\r\u001dL\u000e")), method4182(method4181("(,2a9-?\u0000U\u0007\u001b\t\u0019E\u0013\u001b\u0015\u001fE")), method4182(method4181("(,2a9-?\u001bE\u0019\u001b\u0005\u0015\u007f\u001b\u001d\u000f\nR\n\u0002")), method4182(method4181("\u0002\u0001\u000e")), method4182(method4181("(,2a9-?\u0019E\u0013\u001b\u0015\u001fE4\n\u000e\u001b\u007f\b\u0000\r\u000fI\u0005\n")), method4182(method4181("\u0002\t\u000eR\u0004\u001c\u000f\u000bT")), method4182(method4181("(,2e3;?\u000bR\n\u0002\u0005\u000fU\r\t\u0005\u001f\u007f\u0004\r\n\bC\u001f")), method4182(method4181("(,2a9-?\u0019E\u0013\u001b\u0015\u001fE4\t\f\u0002A\u001f")), method4182(method4181("(,2e3;?\u000bR\n\u0002\u0005\u000fU\r\t\u0005\u001f\u007f\t\u0003\t\u0019")), method4182(method4181("(,2a9-?\u0000U\u0007\u001b\t\u001eA\u0006\u001f\f\b")), method4182(method4181("(,2e3;?\u0019E\u0013\u001b\u0015\u001fEX+")), method4182(method4181("\u0002\u0005\u001eA")), method4182(method4181("(,2a9-?\u0019E\u0013\u001b\u0015\u001fE4\f\u0015\u000fE4\u0002\u0001\u001d")), method4182(method4181("(,2a9-?\u000bR\n\b\r\bN\u001f0\u0013\u0005A\u000f\n\u0012")), method4182(method4181("(,2a9-?\u000bR\n\b\r\bN\u001f0\u0010\u001fO\f\u001d\u0001\u0000")), method4182(method4181("(,2a9-?\u0019E\u0013\u001b\u0015\u001fE4\u001d\u0005\u000eT\n\u0001\u0007\u0001E")), method4182(method4181("(,2a9-?\u001bE\u0019\u001b\u0005\u0015\u007f\t\u001a\u0006\u000bE\u00190\u000f\u000fJ\u000e\f\u0014")), method4182(method4181("\n\u0001Ck)G")), method4182(method4181("(,2a9-?\u001bE\u0019\u001b\u0005\u0015\u007f\u0018\u0007\u0001\tE\u0019")), method4182(method4181("\r\u0012\u0004A\u0005O\u0010\fU\u0007")), method4182(method4181("\n\u0001Cm.G")), method4182(method4181("\n\u0001CY\nG")), method4182(method4181("\n\u0001Ca*G")), method4182(method4181("\n\u0001Cs,G")), method4182(method4181("\n\u0001Cl\"G")), method4182(method4181("\n\u0001Cm*G")), method4182(method4181("\n\u0001Cg\"G")), method4182(method4181("\n\u0001Cc.G")), method4182(method4181("\n\u0001Cn.G")), method4182(method4181("\n\u0001Ck*G")), method4182(method4181("\n\u0001Cg/G")), method4182(method4181("\n\u0001Cp(G")), method4182(method4181("\n\u0001CiC")), method4182(method4181("\n\u0001CdC")), method4182(method4181("\n\u0001Cf(G")), method4182(method4181("\n\u0001Cg*G")), method4182(method4181("\n\u0001Cc(G")), method4182(method4181("\n\u0001Ce)G")), method4182(method4181("\n\u0001Ck.G")), method4182(method4181("\n\u0001Cw/G")), method4182(method4181("\n\u0001CP\nG")), method4182(method4181("\n\u0001CsC")), method4182(method4181("\n\u0001Cr)G")), method4182(method4181("\n\u0001Cr/G")), method4182(method4181("\n\u0001Cs(G")), method4182(method4181("\n\u0001Cm#G")), method4182(method4181("\n\u0001Cb)G")), method4182(method4181("\n\u0001Cj-G")), method4182(method4181("\n\u0001Cd,G")), method4182(method4181("\n\u0001Co*G")), method4182(method4181("\n\u0001Cd)G")), method4182(method4181("\n\u0001Cf-G")), method4182(method4181("\n\u0001Cn(G")), method4182(method4181("\n\u0001Cp*G")), method4182(method4181("\n\u0001Co/G")), method4182(method4181("\n\u0001Cl)G")), method4182(method4181("\n\u0001Cr-G")), method4182(method4181("\n\u0001Cn/G")), method4182(method4181(" \u0010\bN,#")), method4182(method4181("\u0006\u000e\u0019E\u0007")), method4182(method4181("\n\u0001Cq/G")), method4182(method4181("\u0001\u0016\u0004D\u0002\u000e")), method4182(method4181("\u000e\u0014\u0004")), method4182(method4181("\n\u0001Cw*G")), method4182(method4181("\n\u0001Ct/G")), method4182(method4181("\n\u0001Co.G")), method4182(method4181("\n\u0001Cm)G")), method4182(method4181("\n\u0001CoC")), method4182(method4181("\n\u0001Cu#G")), method4182(method4181("\n\u0001CIC")), method4182(method4181("\u0005\u0001\u000eL\u0002\r")), method4182(method4181("\u0007\u0004")), method4182(method4181("\u0005\u0001\nG\u0007")), method4182(method4181("\u001cSMG\u0019\u000e\u0010\u0005I\b\u001c")), method4182(method4181("\u001d\u0001\tE\u0004\u0001")), method4182(method4181("(,2a9-?\u0005A\u0007\t?\u000bL\u0004\u000e\u00142P\u0002\u0017\u0005\u0001")), method4182(method4181("\n\u0001C\u001c\u0002\u0001\t\u0019\u001eC")), method4182(method4181("\n\u0001Cu(G")), method4182(method4181("\n\u0001Cg(G")), method4182(method4181("\n\u0001Ca(G")), method4182(method4181("\n\u0001Ca.G")), method4182(method4181("\n\u0001Cq(G")), method4182(method4181("\n\u0001CxC")), method4182(method4181("\n\u0001Ce(G")), method4182(method4181("\n\u0001Cb/G")), method4182(method4181("\n\u0001Cj/G")), method4182(method4181("\n\u0001Cw(G")), method4182(method4181("\n\u0001Ci\"G")), method4182(method4181("\n\u0001Cb.G")), method4182(method4181("\n\u0001CFC")), method4182(method4181("\n\u0001Cw,G")), method4182(method4181("\n\u0001Cl*G")), method4182(method4181("\n\u0001Cv)G")), method4182(method4181("\n\u0001Cv(G")), method4182(method4181("\n\u0001Cn*G")), method4182(method4181("\n\u0001Ci,G")), method4182(method4181("\n\u0001Cf*G")), method4182(method4181("\n\u0001Ca)G")), method4182(method4181("\n\u0001CpC")), method4182(method4181("\n\u0001Cf/G")), method4182(method4181("\n\u0001ChC")), method4182(method4181("\n\u0001CaC")), method4182(method4181("\n\u0001CuC")), method4182(method4181("\n\u0001Ce\"G")), method4182(method4181("\n\u0001Ct(G")), method4182(method4181("\n\u0001CbC")), method4182(method4181("\n\u0001Ck(G")), method4182(method4181("\n\u0001Cl(G")), method4182(method4181("\n\u0001Cl.G")), method4182(method4181("\n\u0001Ch/G")), method4182(method4181("\n\u0001Cd/G")), method4182(method4181("\n\u0001Ce.G")), method4182(method4181("\n\u0001Cx*G")), method4182(method4181("\n\u0001Cp/G")), method4182(method4181("\n\u0001CtC")), method4182(method4181("\n\u0001Cr(G"))};
   @OriginalMember(
      owner = "client!ea",
      name = "dd",
      descriptor = "Z"
   )
   public static boolean field8146 = false;
   @OriginalMember(
      owner = "client!ea",
      name = "eb",
      descriptor = "I"
   )
   public static int field8327;
   @OriginalMember(
      owner = "client!ea",
      name = "lc",
      descriptor = "F"
   )
   public float field8392;
   @OriginalMember(
      owner = "client!ea",
      name = "Kf",
      descriptor = "F"
   )
   public float field8407;
   @OriginalMember(
      owner = "client!ea",
      name = "zb",
      descriptor = "F"
   )
   private float field8432;
   @OriginalMember(
      owner = "client!ea",
      name = "sh",
      descriptor = "F"
   )
   private float field8434;
   @OriginalMember(
      owner = "client!ea",
      name = "Ig",
      descriptor = "F"
   )
   public float field8443;
   @OriginalMember(
      owner = "client!ea",
      name = "Zf",
      descriptor = "F"
   )
   public float field8446;
   @OriginalMember(
      owner = "client!ea",
      name = "Ug",
      descriptor = "F"
   )
   public float field8471;
   @OriginalMember(
      owner = "client!ea",
      name = "V",
      descriptor = "F"
   )
   private float field8476;
   @OriginalMember(
      owner = "client!ea",
      name = "U",
      descriptor = "F"
   )
   public float field8477;
   @OriginalMember(
      owner = "client!ea",
      name = "Sd",
      descriptor = "I"
   )
   public static int field8135;
   @OriginalMember(
      owner = "client!ea",
      name = "Ag",
      descriptor = "I"
   )
   public static int field8136;
   @OriginalMember(
      owner = "client!ea",
      name = "Ob",
      descriptor = "I"
   )
   public static int field8137;
   @OriginalMember(
      owner = "client!ea",
      name = "Tc",
      descriptor = "I"
   )
   public static int field8138;
   @OriginalMember(
      owner = "client!ea",
      name = "Qc",
      descriptor = "I"
   )
   public static int field8139;
   @OriginalMember(
      owner = "client!ea",
      name = "ld",
      descriptor = "I"
   )
   public static int field8140;
   @OriginalMember(
      owner = "client!ea",
      name = "rc",
      descriptor = "I"
   )
   public static int field8141;
   @OriginalMember(
      owner = "client!ea",
      name = "Ld",
      descriptor = "I"
   )
   public static int field8142;
   @OriginalMember(
      owner = "client!ea",
      name = "v",
      descriptor = "I"
   )
   public static int field8143;
   @OriginalMember(
      owner = "client!ea",
      name = "ed",
      descriptor = "I"
   )
   public static int field8144;
   @OriginalMember(
      owner = "client!ea",
      name = "nd",
      descriptor = "I"
   )
   public static int field8145;
   @OriginalMember(
      owner = "client!ea",
      name = "Xc",
      descriptor = "I"
   )
   public static int field8147;
   @OriginalMember(
      owner = "client!ea",
      name = "Ab",
      descriptor = "I"
   )
   public static int field8148;
   @OriginalMember(
      owner = "client!ea",
      name = "Rg",
      descriptor = "I"
   )
   public static int field8149;
   @OriginalMember(
      owner = "client!ea",
      name = "eg",
      descriptor = "I"
   )
   public static int field8150;
   @OriginalMember(
      owner = "client!ea",
      name = "Dg",
      descriptor = "I"
   )
   public static int field8151;
   @OriginalMember(
      owner = "client!ea",
      name = "jh",
      descriptor = "I"
   )
   public static int field8152;
   @OriginalMember(
      owner = "client!ea",
      name = "dg",
      descriptor = "I"
   )
   public static int field8153;
   @OriginalMember(
      owner = "client!ea",
      name = "ag",
      descriptor = "I"
   )
   public static int field8154;
   @OriginalMember(
      owner = "client!ea",
      name = "mf",
      descriptor = "I"
   )
   public static int field8155;
   @OriginalMember(
      owner = "client!ea",
      name = "Ne",
      descriptor = "I"
   )
   public static int field8156;
   @OriginalMember(
      owner = "client!ea",
      name = "ih",
      descriptor = "I"
   )
   public static int field8157;
   @OriginalMember(
      owner = "client!ea",
      name = "u",
      descriptor = "I"
   )
   public static int field8159;
   @OriginalMember(
      owner = "client!ea",
      name = "Kg",
      descriptor = "I"
   )
   public static int field8160;
   @OriginalMember(
      owner = "client!ea",
      name = "z",
      descriptor = "I"
   )
   public static int field8161;
   @OriginalMember(
      owner = "client!ea",
      name = "af",
      descriptor = "I"
   )
   public static int field8162;
   @OriginalMember(
      owner = "client!ea",
      name = "W",
      descriptor = "I"
   )
   public static int field8163;
   @OriginalMember(
      owner = "client!ea",
      name = "X",
      descriptor = "I"
   )
   public static int field8164;
   @OriginalMember(
      owner = "client!ea",
      name = "qf",
      descriptor = "I"
   )
   public static int field8165;
   @OriginalMember(
      owner = "client!ea",
      name = "wf",
      descriptor = "I"
   )
   public static int field8166;
   @OriginalMember(
      owner = "client!ea",
      name = "Eb",
      descriptor = "I"
   )
   public static int field8167;
   @OriginalMember(
      owner = "client!ea",
      name = "bg",
      descriptor = "I"
   )
   public static int field8168;
   @OriginalMember(
      owner = "client!ea",
      name = "He",
      descriptor = "I"
   )
   public static int field8169;
   @OriginalMember(
      owner = "client!ea",
      name = "qd",
      descriptor = "I"
   )
   public static int field8171;
   @OriginalMember(
      owner = "client!ea",
      name = "Rc",
      descriptor = "I"
   )
   public static int field8172;
   @OriginalMember(
      owner = "client!ea",
      name = "P",
      descriptor = "I"
   )
   public static int field8173;
   @OriginalMember(
      owner = "client!ea",
      name = "mb",
      descriptor = "I"
   )
   public static int field8174;
   @OriginalMember(
      owner = "client!ea",
      name = "nh",
      descriptor = "I"
   )
   public static int field8175;
   @OriginalMember(
      owner = "client!ea",
      name = "N",
      descriptor = "I"
   )
   public static int field8176;
   @OriginalMember(
      owner = "client!ea",
      name = "eh",
      descriptor = "I"
   )
   public static int field8177;
   @OriginalMember(
      owner = "client!ea",
      name = "Nc",
      descriptor = "I"
   )
   public static int field8178;
   @OriginalMember(
      owner = "client!ea",
      name = "t",
      descriptor = "I"
   )
   public static int field8179;
   @OriginalMember(
      owner = "client!ea",
      name = "ze",
      descriptor = "I"
   )
   public static int field8180;
   @OriginalMember(
      owner = "client!ea",
      name = "rg",
      descriptor = "I"
   )
   public static int field8181;
   @OriginalMember(
      owner = "client!ea",
      name = "te",
      descriptor = "I"
   )
   public static int field8182;
   @OriginalMember(
      owner = "client!ea",
      name = "qb",
      descriptor = "I"
   )
   public static int field8183;
   @OriginalMember(
      owner = "client!ea",
      name = "hb",
      descriptor = "I"
   )
   public static int field8184;
   @OriginalMember(
      owner = "client!ea",
      name = "sf",
      descriptor = "I"
   )
   public static int field8185;
   @OriginalMember(
      owner = "client!ea",
      name = "od",
      descriptor = "I"
   )
   public static int field8186;
   @OriginalMember(
      owner = "client!ea",
      name = "x",
      descriptor = "I"
   )
   public static int field8187;
   @OriginalMember(
      owner = "client!ea",
      name = "Xe",
      descriptor = "I"
   )
   private int field8188;
   @OriginalMember(
      owner = "client!ea",
      name = "Cb",
      descriptor = "I"
   )
   public static int field8189;
   @OriginalMember(
      owner = "client!ea",
      name = "jc",
      descriptor = "I"
   )
   public static int field8190;
   @OriginalMember(
      owner = "client!ea",
      name = "ae",
      descriptor = "I"
   )
   public static int field8191;
   @OriginalMember(
      owner = "client!ea",
      name = "he",
      descriptor = "I"
   )
   public static int field8192;
   @OriginalMember(
      owner = "client!ea",
      name = "Mg",
      descriptor = "I"
   )
   public static int field8193;
   @OriginalMember(
      owner = "client!ea",
      name = "Be",
      descriptor = "I"
   )
   public static int field8194;
   @OriginalMember(
      owner = "client!ea",
      name = "Jb",
      descriptor = "I"
   )
   public static int field8195;
   @OriginalMember(
      owner = "client!ea",
      name = "ie",
      descriptor = "I"
   )
   public static int field8196;
   @OriginalMember(
      owner = "client!ea",
      name = "Re",
      descriptor = "I"
   )
   public static int field8197;
   @OriginalMember(
      owner = "client!ea",
      name = "nb",
      descriptor = "I"
   )
   public static int field8198;
   @OriginalMember(
      owner = "client!ea",
      name = "gg",
      descriptor = "I"
   )
   public static int field8199;
   @OriginalMember(
      owner = "client!ea",
      name = "ah",
      descriptor = "I"
   )
   public static int field8200;
   @OriginalMember(
      owner = "client!ea",
      name = "ce",
      descriptor = "I"
   )
   public static int field8201;
   @OriginalMember(
      owner = "client!ea",
      name = "Sc",
      descriptor = "I"
   )
   public static int field8202;
   @OriginalMember(
      owner = "client!ea",
      name = "pb",
      descriptor = "I"
   )
   public static int field8203;
   @OriginalMember(
      owner = "client!ea",
      name = "Ac",
      descriptor = "I"
   )
   public static int field8204;
   @OriginalMember(
      owner = "client!ea",
      name = "uf",
      descriptor = "I"
   )
   public static int field8205;
   @OriginalMember(
      owner = "client!ea",
      name = "Wc",
      descriptor = "I"
   )
   public static int field8206;
   @OriginalMember(
      owner = "client!ea",
      name = "Vd",
      descriptor = "I"
   )
   public static int field8207;
   @OriginalMember(
      owner = "client!ea",
      name = "pe",
      descriptor = "I"
   )
   public static int field8208;
   @OriginalMember(
      owner = "client!ea",
      name = "G",
      descriptor = "I"
   )
   public static int field8209;
   @OriginalMember(
      owner = "client!ea",
      name = "uh",
      descriptor = "I"
   )
   public static int field8210;
   @OriginalMember(
      owner = "client!ea",
      name = "Xg",
      descriptor = "I"
   )
   public static int field8211;
   @OriginalMember(
      owner = "client!ea",
      name = "A",
      descriptor = "I"
   )
   public static int field8212;
   @OriginalMember(
      owner = "client!ea",
      name = "gc",
      descriptor = "I"
   )
   public static int field8213;
   @OriginalMember(
      owner = "client!ea",
      name = "be",
      descriptor = "I"
   )
   public static int field8214;
   @OriginalMember(
      owner = "client!ea",
      name = "Lg",
      descriptor = "I"
   )
   public static int field8217;
   @OriginalMember(
      owner = "client!ea",
      name = "Ic",
      descriptor = "I"
   )
   public static int field8218;
   @OriginalMember(
      owner = "client!ea",
      name = "Nf",
      descriptor = "I"
   )
   public static int field8219;
   @OriginalMember(
      owner = "client!ea",
      name = "fg",
      descriptor = "I"
   )
   public static int field8220;
   @OriginalMember(
      owner = "client!ea",
      name = "Zb",
      descriptor = "I"
   )
   public static int field8221;
   @OriginalMember(
      owner = "client!ea",
      name = "yc",
      descriptor = "I"
   )
   public static int field8222;
   @OriginalMember(
      owner = "client!ea",
      name = "r",
      descriptor = "I"
   )
   public static int field8223;
   @OriginalMember(
      owner = "client!ea",
      name = "ig",
      descriptor = "I"
   )
   public static int field8224;
   @OriginalMember(
      owner = "client!ea",
      name = "H",
      descriptor = "I"
   )
   public static int field8225;
   @OriginalMember(
      owner = "client!ea",
      name = "we",
      descriptor = "I"
   )
   public static int field8226;
   @OriginalMember(
      owner = "client!ea",
      name = "vb",
      descriptor = "I"
   )
   public static int field8227;
   @OriginalMember(
      owner = "client!ea",
      name = "fb",
      descriptor = "I"
   )
   public static int field8228;
   @OriginalMember(
      owner = "client!ea",
      name = "Ud",
      descriptor = "I"
   )
   public static int field8229;
   @OriginalMember(
      owner = "client!ea",
      name = "R",
      descriptor = "I"
   )
   public static int field8230;
   @OriginalMember(
      owner = "client!ea",
      name = "Ub",
      descriptor = "I"
   )
   public static int field8231;
   @OriginalMember(
      owner = "client!ea",
      name = "lg",
      descriptor = "I"
   )
   public static int field8232;
   @OriginalMember(
      owner = "client!ea",
      name = "ib",
      descriptor = "I"
   )
   public static int field8233;
   @OriginalMember(
      owner = "client!ea",
      name = "Ec",
      descriptor = "I"
   )
   public static int field8234;
   @OriginalMember(
      owner = "client!ea",
      name = "kb",
      descriptor = "I"
   )
   public static int field8236;
   @OriginalMember(
      owner = "client!ea",
      name = "jb",
      descriptor = "I"
   )
   public static int field8237;
   @OriginalMember(
      owner = "client!ea",
      name = "Xd",
      descriptor = "I"
   )
   public static int field8238;
   @OriginalMember(
      owner = "client!ea",
      name = "sg",
      descriptor = "I"
   )
   public static int field8239;
   @OriginalMember(
      owner = "client!ea",
      name = "y",
      descriptor = "I"
   )
   public static int field8240;
   @OriginalMember(
      owner = "client!ea",
      name = "ad",
      descriptor = "I"
   )
   public static int field8241;
   @OriginalMember(
      owner = "client!ea",
      name = "Pf",
      descriptor = "I"
   )
   public static int field8242;
   @OriginalMember(
      owner = "client!ea",
      name = "Mf",
      descriptor = "I"
   )
   public static int field8243;
   @OriginalMember(
      owner = "client!ea",
      name = "M",
      descriptor = "I"
   )
   public static int field8244;
   @OriginalMember(
      owner = "client!ea",
      name = "S",
      descriptor = "I"
   )
   public static int field8245;
   @OriginalMember(
      owner = "client!ea",
      name = "wb",
      descriptor = "I"
   )
   public static int field8246;
   @OriginalMember(
      owner = "client!ea",
      name = "se",
      descriptor = "I"
   )
   public static int field8247;
   @OriginalMember(
      owner = "client!ea",
      name = "ng",
      descriptor = "I"
   )
   public static int field8248;
   @OriginalMember(
      owner = "client!ea",
      name = "Pg",
      descriptor = "I"
   )
   public static int field8249;
   @OriginalMember(
      owner = "client!ea",
      name = "ac",
      descriptor = "I"
   )
   public static int field8250;
   @OriginalMember(
      owner = "client!ea",
      name = "Ye",
      descriptor = "I"
   )
   public static int field8251;
   @OriginalMember(
      owner = "client!ea",
      name = "Ge",
      descriptor = "I"
   )
   public static int field8252;
   @OriginalMember(
      owner = "client!ea",
      name = "Ib",
      descriptor = "I"
   )
   public static int field8253;
   @OriginalMember(
      owner = "client!ea",
      name = "O",
      descriptor = "I"
   )
   public static int field8254;
   @OriginalMember(
      owner = "client!ea",
      name = "Rf",
      descriptor = "I"
   )
   public static int field8256;
   @OriginalMember(
      owner = "client!ea",
      name = "nf",
      descriptor = "I"
   )
   public static int field8257;
   @OriginalMember(
      owner = "client!ea",
      name = "ge",
      descriptor = "I"
   )
   public static int field8258;
   @OriginalMember(
      owner = "client!ea",
      name = "xd",
      descriptor = "I"
   )
   public static int field8259;
   @OriginalMember(
      owner = "client!ea",
      name = "fd",
      descriptor = "I"
   )
   public static int field8260;
   @OriginalMember(
      owner = "client!ea",
      name = "I",
      descriptor = "I"
   )
   public static int field8261;
   @OriginalMember(
      owner = "client!ea",
      name = "zd",
      descriptor = "I"
   )
   public static int field8262;
   @OriginalMember(
      owner = "client!ea",
      name = "qh",
      descriptor = "I"
   )
   public static int field8263;
   @OriginalMember(
      owner = "client!ea",
      name = "Sb",
      descriptor = "I"
   )
   public int field8264;
   @OriginalMember(
      owner = "client!ea",
      name = "Gc",
      descriptor = "I"
   )
   public static int field8265;
   @OriginalMember(
      owner = "client!ea",
      name = "ke",
      descriptor = "I"
   )
   public static int field8266;
   @OriginalMember(
      owner = "client!ea",
      name = "lh",
      descriptor = "I"
   )
   public static int field8267;
   @OriginalMember(
      owner = "client!ea",
      name = "gh",
      descriptor = "I"
   )
   public static int field8268;
   @OriginalMember(
      owner = "client!ea",
      name = "Nd",
      descriptor = "I"
   )
   public static int field8269;
   @OriginalMember(
      owner = "client!ea",
      name = "Oe",
      descriptor = "I"
   )
   public static int field8270;
   @OriginalMember(
      owner = "client!ea",
      name = "Pc",
      descriptor = "I"
   )
   public static int field8271;
   @OriginalMember(
      owner = "client!ea",
      name = "gd",
      descriptor = "I"
   )
   public static int field8272;
   @OriginalMember(
      owner = "client!ea",
      name = "cd",
      descriptor = "I"
   )
   public static int field8273;
   @OriginalMember(
      owner = "client!ea",
      name = "J",
      descriptor = "I"
   )
   public static int field8274;
   @OriginalMember(
      owner = "client!ea",
      name = "Tb",
      descriptor = "I"
   )
   public static int field8275;
   @OriginalMember(
      owner = "client!ea",
      name = "zc",
      descriptor = "I"
   )
   public static int field8276;
   @OriginalMember(
      owner = "client!ea",
      name = "sc",
      descriptor = "I"
   )
   public static int field8277;
   @OriginalMember(
      owner = "client!ea",
      name = "Gf",
      descriptor = "I"
   )
   public static int field8278;
   @OriginalMember(
      owner = "client!ea",
      name = "yb",
      descriptor = "I"
   )
   public static int field8279;
   @OriginalMember(
      owner = "client!ea",
      name = "Wf",
      descriptor = "I"
   )
   public static int field8280;
   @OriginalMember(
      owner = "client!ea",
      name = "vd",
      descriptor = "I"
   )
   public static int field8281;
   @OriginalMember(
      owner = "client!ea",
      name = "mc",
      descriptor = "I"
   )
   public static int field8282;
   @OriginalMember(
      owner = "client!ea",
      name = "Te",
      descriptor = "I"
   )
   public static int field8283;
   @OriginalMember(
      owner = "client!ea",
      name = "ug",
      descriptor = "I"
   )
   public static int field8284;
   @OriginalMember(
      owner = "client!ea",
      name = "Bd",
      descriptor = "I"
   )
   public static int field8285;
   @OriginalMember(
      owner = "client!ea",
      name = "Jf",
      descriptor = "I"
   )
   public static int field8286;
   @OriginalMember(
      owner = "client!ea",
      name = "Og",
      descriptor = "I"
   )
   public static int field8287;
   @OriginalMember(
      owner = "client!ea",
      name = "rd",
      descriptor = "I"
   )
   public static int field8288;
   @OriginalMember(
      owner = "client!ea",
      name = "Gb",
      descriptor = "I"
   )
   public static int field8289;
   @OriginalMember(
      owner = "client!ea",
      name = "pg",
      descriptor = "I"
   )
   public static int field8290;
   @OriginalMember(
      owner = "client!ea",
      name = "tg",
      descriptor = "I"
   )
   public static int field8291;
   @OriginalMember(
      owner = "client!ea",
      name = "Vf",
      descriptor = "I"
   )
   public static int field8292;
   @OriginalMember(
      owner = "client!ea",
      name = "td",
      descriptor = "I"
   )
   public static int field8293;
   @OriginalMember(
      owner = "client!ea",
      name = "vf",
      descriptor = "I"
   )
   public static int field8294;
   @OriginalMember(
      owner = "client!ea",
      name = "Ee",
      descriptor = "I"
   )
   public static int field8295;
   @OriginalMember(
      owner = "client!ea",
      name = "yd",
      descriptor = "I"
   )
   public static int field8296;
   @OriginalMember(
      owner = "client!ea",
      name = "Cf",
      descriptor = "I"
   )
   public static int field8297;
   @OriginalMember(
      owner = "client!ea",
      name = "T",
      descriptor = "I"
   )
   public static int field8298;
   @OriginalMember(
      owner = "client!ea",
      name = "Rd",
      descriptor = "I"
   )
   public static int field8299;
   @OriginalMember(
      owner = "client!ea",
      name = "je",
      descriptor = "I"
   )
   public static int field8300;
   @OriginalMember(
      owner = "client!ea",
      name = "Hb",
      descriptor = "I"
   )
   public static int field8301;
   @OriginalMember(
      owner = "client!ea",
      name = "Q",
      descriptor = "I"
   )
   public static int field8302;
   @OriginalMember(
      owner = "client!ea",
      name = "D",
      descriptor = "I"
   )
   public static int field8303;
   @OriginalMember(
      owner = "client!ea",
      name = "le",
      descriptor = "I"
   )
   public static int field8304;
   @OriginalMember(
      owner = "client!ea",
      name = "Je",
      descriptor = "I"
   )
   public static int field8305;
   @OriginalMember(
      owner = "client!ea",
      name = "Lf",
      descriptor = "I"
   )
   public static int field8306;
   @OriginalMember(
      owner = "client!ea",
      name = "We",
      descriptor = "I"
   )
   public static int field8307;
   @OriginalMember(
      owner = "client!ea",
      name = "Ed",
      descriptor = "I"
   )
   public static int field8308;
   @OriginalMember(
      owner = "client!ea",
      name = "wg",
      descriptor = "I"
   )
   public static int field8309;
   @OriginalMember(
      owner = "client!ea",
      name = "og",
      descriptor = "I"
   )
   public static int field8310;
   @OriginalMember(
      owner = "client!ea",
      name = "db",
      descriptor = "I"
   )
   public static int field8311;
   @OriginalMember(
      owner = "client!ea",
      name = "kd",
      descriptor = "I"
   )
   public static int field8312;
   @OriginalMember(
      owner = "client!ea",
      name = "F",
      descriptor = "I"
   )
   public static int field8313;
   @OriginalMember(
      owner = "client!ea",
      name = "ab",
      descriptor = "I"
   )
   public static int field8314;
   @OriginalMember(
      owner = "client!ea",
      name = "Kb",
      descriptor = "I"
   )
   public static int field8315;
   @OriginalMember(
      owner = "client!ea",
      name = "ob",
      descriptor = "I"
   )
   public static int field8316;
   @OriginalMember(
      owner = "client!ea",
      name = "jd",
      descriptor = "I"
   )
   public static int field8317;
   @OriginalMember(
      owner = "client!ea",
      name = "Db",
      descriptor = "I"
   )
   public static int field8318;
   @OriginalMember(
      owner = "client!ea",
      name = "Yg",
      descriptor = "I"
   )
   public static int field8319;
   @OriginalMember(
      owner = "client!ea",
      name = "Qf",
      descriptor = "I"
   )
   public static int field8320;
   @OriginalMember(
      owner = "client!ea",
      name = "Kc",
      descriptor = "I"
   )
   public static int field8321;
   @OriginalMember(
      owner = "client!ea",
      name = "uc",
      descriptor = "I"
   )
   public static int field8322;
   @OriginalMember(
      owner = "client!ea",
      name = "Yb",
      descriptor = "I"
   )
   public static int field8323;
   @OriginalMember(
      owner = "client!ea",
      name = "B",
      descriptor = "I"
   )
   public static int field8324;
   @OriginalMember(
      owner = "client!ea",
      name = "Qe",
      descriptor = "I"
   )
   public static int field8325;
   @OriginalMember(
      owner = "client!ea",
      name = "ff",
      descriptor = "I"
   )
   public static int field8326;
   @OriginalMember(
      owner = "client!ea",
      name = "Zg",
      descriptor = "I"
   )
   public static int field8328;
   @OriginalMember(
      owner = "client!ea",
      name = "Ad",
      descriptor = "I"
   )
   public static int field8329;
   @OriginalMember(
      owner = "client!ea",
      name = "xg",
      descriptor = "I"
   )
   public static int field8330;
   @OriginalMember(
      owner = "client!ea",
      name = "oh",
      descriptor = "I"
   )
   public static int field8331;
   @OriginalMember(
      owner = "client!ea",
      name = "vc",
      descriptor = "I"
   )
   public static int field8332;
   @OriginalMember(
      owner = "client!ea",
      name = "Qg",
      descriptor = "I"
   )
   private int field8333;
   @OriginalMember(
      owner = "client!ea",
      name = "mg",
      descriptor = "I"
   )
   public int field8334;
   @OriginalMember(
      owner = "client!ea",
      name = "Ke",
      descriptor = "I"
   )
   public static int field8335;
   @OriginalMember(
      owner = "client!ea",
      name = "bh",
      descriptor = "I"
   )
   public static int field8336;
   @OriginalMember(
      owner = "client!ea",
      name = "ic",
      descriptor = "I"
   )
   public static int field8340;
   @OriginalMember(
      owner = "client!ea",
      name = "Of",
      descriptor = "I"
   )
   public static int field8343;
   @OriginalMember(
      owner = "client!ea",
      name = "re",
      descriptor = "I"
   )
   public static int field8344;
   @OriginalMember(
      owner = "client!ea",
      name = "zf",
      descriptor = "I"
   )
   public static int field8345;
   @OriginalMember(
      owner = "client!ea",
      name = "qc",
      descriptor = "I"
   )
   public int field8355;
   @OriginalMember(
      owner = "client!ea",
      name = "Lc",
      descriptor = "I"
   )
   private int field8367;
   @OriginalMember(
      owner = "client!ea",
      name = "Gd",
      descriptor = "I"
   )
   public int field8368;
   @OriginalMember(
      owner = "client!ea",
      name = "bf",
      descriptor = "I"
   )
   public int field8370;
   @OriginalMember(
      owner = "client!ea",
      name = "ub",
      descriptor = "I"
   )
   private int field8377;
   @OriginalMember(
      owner = "client!ea",
      name = "Jd",
      descriptor = "I"
   )
   private int field8378;
   @OriginalMember(
      owner = "client!ea",
      name = "df",
      descriptor = "I"
   )
   private int field8385;
   @OriginalMember(
      owner = "client!ea",
      name = "fh",
      descriptor = "I"
   )
   private int field8396;
   @OriginalMember(
      owner = "client!ea",
      name = "tf",
      descriptor = "I"
   )
   private int field8417;
   @OriginalMember(
      owner = "client!ea",
      name = "tc",
      descriptor = "I"
   )
   private int field8418;
   @OriginalMember(
      owner = "client!ea",
      name = "Df",
      descriptor = "I"
   )
   public int field8422;
   @OriginalMember(
      owner = "client!ea",
      name = "pd",
      descriptor = "I"
   )
   public int field8437;
   @OriginalMember(
      owner = "client!ea",
      name = "Qb",
      descriptor = "I"
   )
   private int field8450;
   @OriginalMember(
      owner = "client!ea",
      name = "Od",
      descriptor = "I"
   )
   private int field8455;
   @OriginalMember(
      owner = "client!ea",
      name = "id",
      descriptor = "I"
   )
   private int field8457;
   @OriginalMember(
      owner = "client!ea",
      name = "Uf",
      descriptor = "I"
   )
   private int field8480;
   @OriginalMember(
      owner = "client!ea",
      name = "If",
      descriptor = "I"
   )
   public int field8485;
   @OriginalMember(
      owner = "client!ea",
      name = "sb",
      descriptor = "I"
   )
   private int field8491;
   @OriginalMember(
      owner = "client!ea",
      name = "hd",
      descriptor = "I"
   )
   public int field8494;
   @OriginalMember(
      owner = "client!ea",
      name = "Vc",
      descriptor = "I"
   )
   private int field8502;
   @OriginalMember(
      owner = "client!ea",
      name = "xc",
      descriptor = "I"
   )
   private int field8504;
   @OriginalMember(
      owner = "client!ea",
      name = "pf",
      descriptor = "J"
   )
   private long field8384;
   @OriginalMember(
      owner = "client!ea",
      name = "ye",
      descriptor = "Llfa;"
   )
   private class126 field8486;
   @OriginalMember(
      owner = "client!ea",
      name = "ch",
      descriptor = "Ltca;"
   )
   private class185 field8359;
   @OriginalMember(
      owner = "client!ea",
      name = "oc",
      descriptor = "Lbv;"
   )
   private class324 field8360;
   @OriginalMember(
      owner = "client!ea",
      name = "nc",
      descriptor = "Lbv;"
   )
   private class324 field8365;
   @OriginalMember(
      owner = "client!ea",
      name = "Yf",
      descriptor = "Lwr;"
   )
   private class485 field8398;
   @OriginalMember(
      owner = "client!ea",
      name = "Cg",
      descriptor = "Lwr;"
   )
   private class485 field8400;
   @OriginalMember(
      owner = "client!ea",
      name = "Zd",
      descriptor = "Lug;"
   )
   private class588 field8468;
   @OriginalMember(
      owner = "client!ea",
      name = "Me",
      descriptor = "Lbha;"
   )
   public class601 field8454;
   @OriginalMember(
      owner = "client!ea",
      name = "Ef",
      descriptor = "Lpca;"
   )
   public class747 field8389;
   @OriginalMember(
      owner = "client!ea",
      name = "Fd",
      descriptor = "Lpca;"
   )
   public class747 field8393;
   @OriginalMember(
      owner = "client!ea",
      name = "De",
      descriptor = "Lpca;"
   )
   public class747 field8421;
   @OriginalMember(
      owner = "client!ea",
      name = "cb",
      descriptor = "Lpca;"
   )
   public class747 field8425;
   @OriginalMember(
      owner = "client!ea",
      name = "Hc",
      descriptor = "Lpca;"
   )
   public class747 field8460;
   @OriginalMember(
      owner = "client!ea",
      name = "pc",
      descriptor = "Lpca;"
   )
   public class747 field8466;
   @OriginalMember(
      owner = "client!ea",
      name = "Ve",
      descriptor = "Lpca;"
   )
   public class747 field8474;
   @OriginalMember(
      owner = "client!ea",
      name = "Tf",
      descriptor = "Lpca;"
   )
   public class747 field8479;
   @OriginalMember(
      owner = "client!ea",
      name = "Rb",
      descriptor = "Lpca;"
   )
   public class747 field8487;
   @OriginalMember(
      owner = "client!ea",
      name = "hg",
      descriptor = "Lpca;"
   )
   public class747 field8498;
   @OriginalMember(
      owner = "client!ea",
      name = "th",
      descriptor = "Lnh;"
   )
   private class780 field8358;
   @OriginalMember(
      owner = "client!ea",
      name = "ee",
      descriptor = "Lnh;"
   )
   public class780 field8410;
   @OriginalMember(
      owner = "client!ea",
      name = "w",
      descriptor = "Lil;"
   )
   public class7 field8438;
   @OriginalMember(
      owner = "client!ea",
      name = "vg",
      descriptor = "Lil;"
   )
   public class7 field8478;
   @OriginalMember(
      owner = "client!ea",
      name = "vh",
      descriptor = "Lu;"
   )
   private class81 field8430;
   @OriginalMember(
      owner = "client!ea",
      name = "Ff",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   public NativeHeap field8350;
   @OriginalMember(
      owner = "client!ea",
      name = "L",
      descriptor = "Z"
   )
   private boolean field8380;
   @OriginalMember(
      owner = "client!ea",
      name = "Xb",
      descriptor = "Z"
   )
   private boolean field8381;
   @OriginalMember(
      owner = "client!ea",
      name = "kg",
      descriptor = "Z"
   )
   private boolean field8382;
   @OriginalMember(
      owner = "client!ea",
      name = "Kd",
      descriptor = "Z"
   )
   private boolean field8383;
   @OriginalMember(
      owner = "client!ea",
      name = "Cd",
      descriptor = "Z"
   )
   private boolean field8388;
   @OriginalMember(
      owner = "client!ea",
      name = "ne",
      descriptor = "Z"
   )
   private boolean field8404;
   @OriginalMember(
      owner = "client!ea",
      name = "Eg",
      descriptor = "Z"
   )
   public boolean field8411;
   @OriginalMember(
      owner = "client!ea",
      name = "gf",
      descriptor = "Z"
   )
   public boolean field8413;
   @OriginalMember(
      owner = "client!ea",
      name = "bc",
      descriptor = "Z"
   )
   public boolean field8419;
   @OriginalMember(
      owner = "client!ea",
      name = "Dd",
      descriptor = "Z"
   )
   private boolean field8423;
   @OriginalMember(
      owner = "client!ea",
      name = "hf",
      descriptor = "Z"
   )
   private boolean field8427;
   @OriginalMember(
      owner = "client!ea",
      name = "Jc",
      descriptor = "Z"
   )
   private boolean field8441;
   @OriginalMember(
      owner = "client!ea",
      name = "kc",
      descriptor = "Z"
   )
   private boolean field8444;
   @OriginalMember(
      owner = "client!ea",
      name = "ph",
      descriptor = "Z"
   )
   public boolean field8447;
   @OriginalMember(
      owner = "client!ea",
      name = "xe",
      descriptor = "Z"
   )
   public boolean field8456;
   @OriginalMember(
      owner = "client!ea",
      name = "Nb",
      descriptor = "Z"
   )
   public boolean field8463;
   @OriginalMember(
      owner = "client!ea",
      name = "K",
      descriptor = "Z"
   )
   public boolean field8470;
   @OriginalMember(
      owner = "client!ea",
      name = "Cc",
      descriptor = "Z"
   )
   public boolean field8482;
   @OriginalMember(
      owner = "client!ea",
      name = "kh",
      descriptor = "Z"
   )
   public boolean field8489;
   @OriginalMember(
      owner = "client!ea",
      name = "Wg",
      descriptor = "Z"
   )
   private boolean field8495;
   @OriginalMember(
      owner = "client!ea",
      name = "Pe",
      descriptor = "[Lsl;"
   )
   private class486[] field8395;

   @OriginalMember(
      owner = "client!ea",
      name = "ra",
      descriptor = "(IIII)V"
   )
   public final void method536(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field8232;
         this.field8452 = arg1;
         this.field8416 = arg2;
         this.field8463 = true;
         this.field8485 = arg0;
         this.field8497 = arg3;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8505[34] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "GA",
      descriptor = "(I)V"
   )
   public final void method495(int arg0) {
      try {
         this.method4098(0, -16757);
         ++field8135;
         OpenGL.glClearColor((float)(16711680 & arg0) / 1.671168E7F, (float)(65280 & arg0) / 65280.0F, (float)(255 & arg0) / 255.0F, (float)(arg0 >>> 24) / 255.0F);
         OpenGL.glClear(16384);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[148] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "q",
      descriptor = "()Z"
   )
   public final boolean method507() {
      try {
         ++field8153;
         return true;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8505[216] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "l",
      descriptor = "()Z"
   )
   public final boolean method526() {
      try {
         ++field8161;
         return true;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8505[75] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method530(int arg0) {
      try {
         ++field8136;
         if (~arg0 <= -129 && ~arg0 >= -1025) {
            this.field8338 = arg0;
            this.field8339.method1309(false);
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[164] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "A",
      descriptor = "(ILaa;II)V"
   )
   public final void method527(int arg0, class515 arg1, int arg2, int arg3) {
      try {
         ++field8139;
         class612 var5 = (class612)arg1;
         class81 var6 = var5.field8976;
         this.method4131(-2);
         this.method4107(127, var5.field8976);
         this.method4098(1, -16757);
         this.method4117(7681, 8448, -1);
         this.method4096(0, (byte)15, 34167, 768);
         float var7 = var6.field1064 / (float)var6.field1060;
         float var8 = var6.field1058 / (float)var6.field1065;
         OpenGL.glColor4ub((byte)(arg0 >> 16), (byte)(arg0 >> 8), (byte)arg0, (byte)(arg0 >> 24));
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f((float)(-arg2 + this.field8420) * var7, (float)(-arg3 + this.field8484) * var8);
         OpenGL.glVertex2i(this.field8420, this.field8484);
         OpenGL.glTexCoord2f((float)(-arg2 + this.field8420) * var7, (float)(-arg3 + this.field8462) * var8);
         OpenGL.glVertex2i(this.field8420, this.field8462);
         OpenGL.glTexCoord2f((float)(-arg2 + this.field8401) * var7, (float)(-arg3 + this.field8462) * var8);
         OpenGL.glVertex2i(this.field8401, this.field8462);
         OpenGL.glTexCoord2f((float)(-arg2 + this.field8401) * var7, (float)(this.field8484 - arg3) * var8);
         OpenGL.glVertex2i(this.field8401, this.field8484);
         OpenGL.glEnd();
         this.method4096(0, (byte)15, 5890, 768);
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field8505[214] + arg0 + ',' + (arg1 != null ? field8505[7] : field8505[6]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(IBII)V"
   )
   public final void method4096(int arg0, byte arg1, int arg2, int arg3) {
      try {
         ++field8307;
         if (arg1 != 15) {
            this.method4097((class485)null, (byte)70);
         }

         OpenGL.glTexEnvi(8960, arg0 + 34176, arg2);
         OpenGL.glTexEnvi(8960, arg0 + 34192, arg3);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8505[223] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "u",
      descriptor = "()Z"
   )
   public final boolean method569() {
      try {
         ++field8276;
         return this.field8441 && (!this.method528() || this.field8495);
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8505[88] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(Lwr;B)V"
   )
   public final void method4097(class485 arg0, byte arg1) {
      try {
         if (this.field8400 != arg0) {
            if (this.field8449) {
               OpenGL.glBindBufferARB(34962, arg0.method3518(-104));
            }

            this.field8400 = arg0;
         }

         int var3 = 109 / (arg1 / 61);
         ++field8256;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8505[165] + (arg0 != null ? field8505[7] : field8505[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "i",
      descriptor = "(II)V"
   )
   public final void method4098(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         if (arg1 != -16757) {
            this.field8188 = 5;
         }

         ++field8143;
         if (this.field8378 != arg0) {
            boolean var4;
            boolean var5;
            byte var6;
            label105: {
               if (arg0 == 1) {
                  var4 = true;
                  var5 = true;
                  var6 = 1;
                  if (!var3) {
                     break label105;
                  }
               }

               if (~arg0 == -3) {
                  var6 = 2;
                  var4 = true;
                  var5 = false;
                  if (!var3) {
                     break label105;
                  }
               }

               if (arg0 == 128) {
                  var6 = 3;
                  var5 = true;
                  var4 = true;
                  if (!var3) {
                     break label105;
                  }
               }

               var4 = true;
               var6 = 0;
               var5 = false;
            }

            if (!var4 == this.field8382) {
               OpenGL.glColorMask(var4, var4, var4, true);
               this.field8382 = var4;
            }

            if (!this.field8380 != !var5) {
               label78: {
                  if (!var5) {
                     OpenGL.glDisable(3008);
                     if (!var3) {
                        break label78;
                     }
                  }

                  OpenGL.glEnable(3008);
               }

               this.field8380 = var5;
            }

            if (~this.field8377 != ~var6) {
               label106: {
                  if (~var6 == -2) {
                     OpenGL.glEnable(3042);
                     OpenGL.glBlendFunc(770, 771);
                     if (!var3) {
                        break label106;
                     }
                  }

                  if (~var6 != -3) {
                     if (var6 != 3) {
                        OpenGL.glDisable(3042);
                        if (!var3) {
                           break label106;
                        }
                     }

                     OpenGL.glEnable(3042);
                     OpenGL.glBlendFunc(774, 1);
                     if (!var3) {
                        break label106;
                     }
                  }

                  OpenGL.glEnable(3042);
                  OpenGL.glBlendFunc(1, 1);
               }

               this.field8377 = var6;
            }

            this.field8378 = arg0;
            this.field8385 &= -29;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field8505[177] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V"
   )
   public final void method607(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      try {
         this.method4179((byte)-48);
         ++field8183;
         this.method4098(arg12, -16757);
         OpenGL.glBegin(4);
         OpenGL.glColor4ub((byte)(arg9 >> 16), (byte)(arg9 >> 8), (byte)arg9, (byte)(arg9 >> 24));
         OpenGL.glVertex3f((float)arg0 + 0.35F, (float)arg1 + 0.35F, (float)arg2);
         OpenGL.glColor4ub((byte)(arg10 >> 16), (byte)(arg10 >> 8), (byte)arg10, (byte)(arg10 >> 24));
         OpenGL.glVertex3f((float)arg3 + 0.35F, (float)arg4 + 0.35F, (float)arg5);
         OpenGL.glColor4ub((byte)(arg11 >> 16), (byte)(arg11 >> 8), (byte)arg11, (byte)(arg11 >> 24));
         OpenGL.glVertex3f((float)arg6 + 0.35F, (float)arg7 + 0.35F, (float)arg8);
         OpenGL.glEnd();
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field8505[169] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "x",
      descriptor = "(I)V"
   )
   private final void method4099(int arg0) {
      try {
         ++field8192;
         if (arg0 != 18965) {
            this.field8351 = null;
         }

         if (this.field8427 && !this.field8423) {
            OpenGL.glEnable(2896);
         } else {
            OpenGL.glDisable(2896);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[209] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method516(boolean arg0) {
      try {
         ++field8250;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(II[I[I)Laa;"
   )
   public final class515 method602(int arg0, int arg1, int[] arg2, int[] arg3) {
      try {
         ++field8234;
         return class785.method5658(0, arg1, arg3, arg2, arg0, this);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8505[140] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8505[7] : field8505[6]) + ',' + (arg3 != null ? field8505[7] : field8505[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "n",
      descriptor = "(B)V"
   )
   private final void method4100(byte arg0) {
      try {
         ++field8220;
         class599.field8803[0] = this.field8471 * this.field8402;
         class599.field8803[3] = 1.0F;
         class599.field8803[1] = this.field8471 * this.field8440;
         class599.field8803[2] = this.field8471 * this.field8442;
         OpenGL.glLightModelfv(2899, class599.field8803, 0);
         if (arg0 != 92) {
            this.method4096(-15, (byte)48, -22, -8);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[147] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "h",
      descriptor = "()V"
   )
   public final void method510() {
      try {
         ++field8228;
         if (this.field8408 && ~this.field8334 < -1 && ~this.field8264 < -1) {
            int var1 = this.field8420;
            int var2 = this.field8401;
            int var3 = this.field8484;
            int var4 = this.field8462;
            this.method574();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method4116((byte)-97);
            this.method4106((byte)124, false);
            this.method4124(114, false);
            this.method4180((byte)112, false);
            this.method4148(false, (byte)-64);
            this.method4107(31, (class486)null);
            this.method4105(4, -2);
            this.method4134(1, 2);
            this.method4098(0, -16757);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field8334, this.field8264, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method592(var1, var3, var2, var4);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8505[69] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "da",
      descriptor = "(III[I)V"
   )
   public final void method599(int arg0, int arg1, int arg2, int[] arg3) {
      try {
         ++field8176;
         float var5 = (float)arg2 * this.field8379.field7401 + (float)arg0 * this.field8379.field7383 + (float)arg1 * this.field8379.field7386 + this.field8379.field7392;
         if (!(var5 < (float)this.field8431) && !((float)this.field8412 < var5)) {
            int var6 = (int)(((float)arg2 * this.field8379.field7391 + (float)arg0 * this.field8379.field7399 + (float)arg1 * this.field8379.field7395 + this.field8379.field7393) * (float)this.field8473 / var5);
            int var7 = (int)(((float)arg2 * this.field8379.field7366 + (float)arg0 * this.field8379.field7365 + (float)arg1 * this.field8379.field7400 + this.field8379.field7402) * (float)this.field8496 / var5);
            if (this.field8407 <= (float)var6 && this.field8477 >= (float)var6 && this.field8446 <= (float)var7 && this.field8443 >= (float)var7) {
               arg3[2] = (int)var5;
               arg3[0] = (int)((float)var6 - this.field8407);
               arg3[1] = (int)((float)var7 - this.field8446);
            } else {
               arg3[0] = arg3[1] = arg3[2] = -1;
            }
         } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field8505[40] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8505[7] : field8505[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "k",
      descriptor = "()Z"
   )
   public final boolean method511() {
      try {
         ++field8164;
         return this.field8337 != null && (this.field8341 <= 1 || this.field8495);
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8505[10] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "l",
      descriptor = "(B)V"
   )
   private final void method4101(byte arg0) {
      try {
         label24: {
            if (this.field8215 == null) {
               this.field8188 = this.field8333 = 0;
               if (!client.field4360) {
                  break label24;
               }
            }

            Dimension var2 = this.field8215.getSize();
            this.field8333 = var2.height;
            this.field8188 = var2.width;
         }

         if (arg0 == -87) {
            ++field8325;
            if (this.field8360 == null) {
               this.field8334 = this.field8188;
               this.field8264 = this.field8333;
               this.method4122(84);
            }

            this.method4116((byte)-123);
            this.method574();
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[180] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method4102(boolean arg0, byte arg1) {
      try {
         if (this.field8423 != arg0) {
            this.field8423 = arg0;
            this.method4099(18965);
         }

         int var3 = 61 / ((26 - arg1) / 62);
         ++field8231;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8505[50] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "j",
      descriptor = "(I)V"
   )
   private final void method4103(int arg0) {
      try {
         OpenGL.glLoadIdentity();
         if (arg0 <= 24) {
            this.method563();
         }

         ++field8285;
         OpenGL.glMultMatrixf(this.field8386.method3687((byte)114), 0);
         if (this.field8406) {
            this.field8346.field489.method684(0);
         }

         this.method4129((byte)66);
         this.method4166((byte)109);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[96] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "d",
      descriptor = "(I)V"
   )
   private final void method4104(int arg0) {
      try {
         this.field8453[14] = this.field8432;
         this.field8453[10] = this.field8434;
         ++field8312;
         this.field8391 = (float)this.field8412;
         this.field8424 = (this.field8453[14] + (float)(-this.field8412)) / this.field8453[10];
         if (arg0 != 2090828840) {
            this.method537();
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[163] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "M",
      descriptor = "()I"
   )
   public final int method524() {
      try {
         ++field8261;
         int var1 = this.field8504;
         this.field8504 = 0;
         return var1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[81] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "g",
      descriptor = "(II)V"
   )
   public final void method4105(int arg0, int arg1) {
      try {
         this.method4126(true, arg1, 123);
         ++field8326;
         if (arg0 != 4) {
            this.method578(126, 2, -9, -84, 15, -104);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[152] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "i",
      descriptor = "()I"
   )
   public final int method595() {
      try {
         ++field8156;
         return this.field8431;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8505[182] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "r",
      descriptor = "()V"
   )
   public final void method609() {
      try {
         ++field8262;
         this.field8342.method1265((byte)31);
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8505[97] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "e",
      descriptor = "()Z"
   )
   public final boolean method571() {
      try {
         ++field8306;
         return true;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8505[151] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(BZ)V"
   )
   public final void method4106(byte arg0, boolean arg1) {
      try {
         if (this.field8388 != arg1) {
            this.field8388 = arg1;
            this.method4164(3998);
            this.field8385 &= -32;
         }

         int var3 = 50 / ((arg0 - 74) / 50);
         ++field8282;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8505[21] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "Y",
      descriptor = "()[I"
   )
   public final int[] method558() {
      try {
         ++field8272;
         return new int[]{this.field8403, this.field8493, this.field8473, this.field8496};
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8505[92] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(ILsl;)V"
   )
   public final void method4107(int arg0, class486 arg1) {
      boolean var3 = client.field4360;

      try {
         ++field8278;
         class486 var4 = this.field8395[this.field8417];
         if (arg1 != var4) {
            label40: {
               if (arg1 != null) {
                  label37: {
                     if (var4 != null) {
                        if (arg1.field6938 == var4.field6938) {
                           break label37;
                        }

                        OpenGL.glDisable(var4.field6938);
                        OpenGL.glEnable(arg1.field6938);
                        if (!var3) {
                           break label37;
                        }
                     }

                     OpenGL.glEnable(arg1.field6938);
                  }

                  OpenGL.glBindTexture(arg1.field6938, arg1.method3529((byte)72));
                  if (!var3) {
                     break label40;
                  }
               }

               OpenGL.glDisable(var4.field6938);
            }

            this.field8395[this.field8417] = arg1;
         }

         int var5 = -106 / ((arg0 - -60) / 57);
         this.field8385 &= -2;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field8505[220] + arg0 + ',' + (arg1 != null ? field8505[7] : field8505[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(IZILjaclib/memory/Buffer;Z)Lwr;"
   )
   public final class485 method4108(int arg0, boolean arg1, int arg2, Buffer arg3, boolean arg4) {
      try {
         ++field8238;
         if (this.field8449 && (!arg4 || this.field8481)) {
            return new class487(this, arg0, arg3, arg2, arg4);
         } else {
            if (!arg1) {
               this.field8424 = 0.22618638F;
            }

            return new class682(this, arg0, arg3);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field8505[168] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8505[7] : field8505[6]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         OpenGL.glLineWidth((float)arg5);
         ++field8168;
         this.method589(arg0, arg1, arg2, arg3, arg4, arg6);
         OpenGL.glLineWidth(1.0F);
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field8505[208] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(FFZF)V"
   )
   private final void method4109(float arg0, float arg1, boolean arg2, float arg3) {
      try {
         ++field8290;
         OpenGL.glMatrixMode(5890);
         if (this.field8444) {
            OpenGL.glLoadIdentity();
         }

         OpenGL.glTranslatef(arg0, arg3, arg1);
         OpenGL.glMatrixMode(5888);
         this.field8444 = arg2;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8505[70] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "g",
      descriptor = "(B)V"
   )
   private final void method4110(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ea",
      name = "xa",
      descriptor = "(F)V"
   )
   public final void method534(float arg0) {
      try {
         ++field8244;
         if (this.field8471 != arg0) {
            this.field8471 = arg0;
            this.method4100((byte)92);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[109] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "b",
      descriptor = "(IZ)I"
   )
   public final int method4111(int arg0, boolean arg1) {
      try {
         ++field8300;
         if (arg1) {
            return 74;
         } else if (~arg0 != -6407 && ~arg0 != -6410) {
            if (arg0 != 6410 && arg0 != 34846 && arg0 != 34844) {
               if (~arg0 == -6408) {
                  return 3;
               } else if (arg0 != 6408 && arg0 != 34847) {
                  if (arg0 != 34843) {
                     if (~arg0 == -34843) {
                        return 8;
                     } else if (~arg0 == -6403) {
                        return 3;
                     } else if (~arg0 == -6402) {
                        return 1;
                     } else {
                        throw new IllegalArgumentException("");
                     }
                  } else {
                     return 6;
                  }
               } else {
                  return 4;
               }
            } else {
               return 2;
            }
         } else {
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[22] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "H",
      descriptor = "(III[I)V"
   )
   public final void method551(int arg0, int arg1, int arg2, int[] arg3) {
      try {
         ++field8241;
         float var5 = (float)arg2 * this.field8379.field7401 + (float)arg0 * this.field8379.field7383 + (float)arg1 * this.field8379.field7386 + this.field8379.field7392;
         if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
         } else {
            int var6 = (int)(((float)arg2 * this.field8379.field7391 + (float)arg0 * this.field8379.field7399 + (float)arg1 * this.field8379.field7395 + this.field8379.field7393) * (float)this.field8473 / var5);
            int var7 = (int)(((float)arg2 * this.field8379.field7366 + (float)arg0 * this.field8379.field7365 + (float)arg1 * this.field8379.field7400 + this.field8379.field7402) * (float)this.field8496 / var5);
            arg3[0] = (int)((float)var6 + -this.field8407);
            arg3[2] = (int)var5;
            arg3[1] = (int)((float)var7 - this.field8446);
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field8505[213] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8505[7] : field8505[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "b",
      descriptor = "(IIIID)V"
   )
   public final void method612(int arg0, int arg1, int arg2, int arg3, double arg4) {
      try {
         ++field8195;
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field8505[72] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method4112(byte arg0, int arg1) {
      try {
         if (~this.field8417 != ~arg1) {
            OpenGL.glActiveTexture(arg1 + 33984);
            this.field8417 = arg1;
         }

         int var3 = 74 % ((68 - arg0) / 34);
         ++field8303;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8505[111] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method613(Canvas arg0) {
      try {
         label36: {
            ++field8203;
            this.field8255 = 0L;
            this.field8215 = null;
            if (arg0 != null && this.field8170 != arg0) {
               if (!this.field8235.containsKey(arg0)) {
                  break label36;
               }

               Long var2 = (Long)this.field8235.get(arg0);
               this.field8255 = var2;
               this.field8215 = arg0;
               if (!client.field4360) {
                  break label36;
               }
            }

            this.field8255 = this.field8216;
            this.field8215 = this.field8170;
         }

         if (this.field8215 != null && ~this.field8255 != -1L) {
            this.field8158.setSurface(this.field8255);
            this.method4101((byte)-87);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[86] + (arg0 != null ? field8505[7] : field8505[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "HA",
      descriptor = "(IIII[I)V"
   )
   public final void method584(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
      try {
         ++field8221;
         float var6 = (float)arg2 * this.field8379.field7401 + (float)arg0 * this.field8379.field7383 + (float)arg1 * this.field8379.field7386 + this.field8379.field7392;
         if (!(var6 < (float)this.field8431) && !((float)this.field8412 < var6)) {
            int var7 = (int)(((float)arg2 * this.field8379.field7391 + (float)arg0 * this.field8379.field7399 + (float)arg1 * this.field8379.field7395 + this.field8379.field7393) * (float)this.field8473 / (float)arg3);
            int var8 = (int)(((float)arg2 * this.field8379.field7366 + (float)arg0 * this.field8379.field7365 + (float)arg1 * this.field8379.field7400 + this.field8379.field7402) * (float)this.field8496 / (float)arg3);
            if ((float)var7 >= this.field8407 && this.field8477 >= (float)var7 && (float)var8 >= this.field8446 && this.field8443 >= (float)var8) {
               arg4[2] = (int)var6;
               arg4[0] = (int)((float)var7 - this.field8407);
               arg4[1] = (int)((float)var8 + -this.field8446);
            } else {
               arg4[0] = arg4[1] = arg4[2] = -1;
            }
         } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field8505[58] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field8505[7] : field8505[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "c",
      descriptor = "(II)Lst;"
   )
   public final class461 method513(int arg0, int arg1) {
      try {
         ++field8281;
         return null;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[217] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(Lus;)V"
   )
   public final void method556(class1 arg0) {
      try {
         ++field8270;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[206] + (arg0 != null ? field8505[7] : field8505[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "d",
      descriptor = "()Lew;"
   )
   public final class521 method596() {
      try {
         ++field8345;
         return new class507();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8505[85] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "([BIIZI)Lwr;"
   )
   public final class485 method4113(byte[] arg0, int arg1, int arg2, boolean arg3, int arg4) {
      try {
         ++field8169;
         if (arg2 != 671655096) {
            this.field8459 = 1.2034917F;
         }

         return (class485)(!this.field8449 || arg3 && !this.field8481 ? new class682(this, arg1, arg0, arg4) : new class487(this, arg1, arg0, arg4, arg3));
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field8505[170] + (arg0 != null ? field8505[7] : field8505[6]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(Lbv;I)V"
   )
   public final void method4114(class324 arg0, int arg1) {
      try {
         ++field8247;
         if (arg1 != 18294) {
            this.method563();
         }

         if (this.field8362 >= 3) {
            throw new RuntimeException();
         } else {
            if (this.field8362 >= 0) {
               this.field8366[this.field8362].method2402(false);
            }

            this.field8365 = this.field8366[++this.field8362] = arg0;
            this.field8365.method2404(-101);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[48] + (arg0 != null ? field8505[7] : field8505[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "ZA",
      descriptor = "(IFFFFF)V"
   )
   public final void method582(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      try {
         ++field8209;
         boolean var7 = this.field8435 != arg0;
         if (var7 || this.field8461 != arg1 || this.field8465 != arg2) {
            this.field8435 = arg0;
            this.field8465 = arg2;
            this.field8461 = arg1;
            if (var7) {
               this.field8402 = (float)(16711680 & this.field8435) / 1.671168E7F;
               this.field8442 = (float)(255 & this.field8435) / 255.0F;
               this.field8440 = (float)(65280 & this.field8435) / 65280.0F;
               this.method4100((byte)92);
            }

            this.method4128((byte)-122);
         }

         if (this.field8415[0] != arg3 || this.field8415[1] != arg4 || this.field8415[2] != arg5) {
            this.field8415[0] = arg3;
            this.field8415[1] = arg4;
            this.field8415[2] = arg5;
            this.field8475[1] = -arg4;
            this.field8475[0] = -arg3;
            this.field8475[2] = -arg5;
            float var8 = (float)(1.0D / Math.sqrt((double)(arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field8405[1] = arg4 * var8;
            this.field8405[0] = arg3 * var8;
            this.field8405[2] = arg5 * var8;
            this.field8472[2] = -this.field8405[2];
            this.field8472[0] = -this.field8405[0];
            this.field8472[1] = -this.field8405[1];
            this.method4129((byte)111);
            this.field8494 = (int)(arg3 * 256.0F / arg4);
            this.field8437 = (int)(arg5 * 256.0F / arg4);
         }

      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field8505[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "b",
      descriptor = "(IIIIII)V"
   )
   public final void method589(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         float var8;
         float var10;
         label23: {
            ++field8236;
            this.method4179((byte)-48);
            this.method4098(arg5, -16757);
            float var7 = (float)(-arg0) + (float)arg2;
            var8 = (float)(-arg1) + (float)arg3;
            if (var7 != 0.0F || var8 != 0.0F) {
               float var9 = (float)(1.0D / Math.sqrt((double)(var7 * var7 + var8 * var8)));
               var8 *= var9;
               var10 = var7 * var9;
               if (!client.field4360) {
                  break label23;
               }
            }

            var10 = 1.0F;
         }

         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         OpenGL.glBegin(1);
         OpenGL.glVertex2f((float)arg0 + 0.35F, (float)arg1 + 0.35F);
         OpenGL.glVertex2f((float)arg2 + var10 + 0.35F, (float)arg3 + var8 + 0.35F);
         OpenGL.glEnd();
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field8505[160] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(FFF)V"
   )
   public final void method572(float arg0, float arg1, float arg2) {
      try {
         class706.field10314 = arg0;
         class600.field8825 = arg1;
         ++field8260;
         class207.field2962 = arg2;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8505[107] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(ZLbv;)V"
   )
   public final void method4115(boolean arg0, class324 arg1) {
      boolean var3 = client.field4360;

      try {
         label52: {
            ++field8331;
            if (this.field8447) {
               this.method4178(-66, arg1);
               this.method4118(arg1, (byte)123);
               if (!var3) {
                  break label52;
               }
            }

            if (~this.field8357 > -1 || this.field8363[this.field8357] != arg1) {
               throw new RuntimeException();
            }

            this.field8363[this.field8357--] = null;
            arg1.method2403(arg0);
            if (this.field8357 < 0) {
               this.field8365 = this.field8360 = null;
               if (!var3) {
                  break label52;
               }
            }

            this.field8365 = this.field8360 = this.field8363[this.field8357];
            this.field8365.method2399(31653);
         }

         if (!arg0) {
            this.field8378 = 3;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8505[45] + arg0 + ',' + (arg1 != null ? field8505[7] : field8505[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "d",
      descriptor = "(B)V"
   )
   public final void method4116(byte arg0) {
      try {
         if (this.field8455 != 0) {
            this.field8455 = 0;
            this.field8385 &= -32;
         }

         ++field8265;
         int var2 = 99 % ((-8 - arg0) / 45);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[101] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method601(int arg0) {
      try {
         ++field8252;
         this.method4169(13195);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[137] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "X",
      descriptor = "(I)V"
   )
   public final void method587(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ea",
      name = "w",
      descriptor = "()Z"
   )
   public final boolean method505() {
      try {
         ++field8230;
         return false;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8505[181] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method4117(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != -1) {
            this.method536(-36, -89, -65, 19);
         }

         label30: {
            if (this.field8417 == 0) {
               boolean var4 = false;
               if (this.field8464 != arg0) {
                  OpenGL.glTexEnvi(8960, 34161, arg0);
                  var4 = true;
                  this.field8464 = arg0;
               }

               if (this.field8448 != arg1) {
                  OpenGL.glTexEnvi(8960, 34162, arg1);
                  var4 = true;
                  this.field8448 = arg1;
               }

               if (!var4) {
                  break label30;
               }

               this.field8385 &= -30;
               if (!client.field4360) {
                  break label30;
               }
            }

            OpenGL.glTexEnvi(8960, 34161, arg0);
            OpenGL.glTexEnvi(8960, 34162, arg1);
         }

         ++field8165;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8505[83] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(Lza;)V"
   )
   public final void method614(class438 arg0) {
      try {
         this.field8350 = ((class40)arg0).field564;
         ++field8269;
         if (this.field8398 == null) {
            class77 var2;
            label26: {
               var2 = new class77(80);
               if (this.field8469) {
                  var2.method701(-1.0F, 1871583144);
                  var2.method701(-1.0F, 1871583144);
                  var2.method701(0.0F, 1871583144);
                  var2.method701(0.0F, 1871583144);
                  var2.method701(1.0F, 1871583144);
                  var2.method701(1.0F, 1871583144);
                  var2.method701(-1.0F, 1871583144);
                  var2.method701(0.0F, 1871583144);
                  var2.method701(1.0F, 1871583144);
                  var2.method701(1.0F, 1871583144);
                  var2.method701(1.0F, 1871583144);
                  var2.method701(1.0F, 1871583144);
                  var2.method701(0.0F, 1871583144);
                  var2.method701(1.0F, 1871583144);
                  var2.method701(0.0F, 1871583144);
                  var2.method701(-1.0F, 1871583144);
                  var2.method701(1.0F, 1871583144);
                  var2.method701(0.0F, 1871583144);
                  var2.method701(0.0F, 1871583144);
                  var2.method701(0.0F, 1871583144);
                  if (!client.field4360) {
                     break label26;
                  }
               }

               var2.method699(-1.0F, (byte)124);
               var2.method699(-1.0F, (byte)127);
               var2.method699(0.0F, (byte)124);
               var2.method699(0.0F, (byte)125);
               var2.method699(1.0F, (byte)125);
               var2.method699(1.0F, (byte)125);
               var2.method699(-1.0F, (byte)124);
               var2.method699(0.0F, (byte)124);
               var2.method699(1.0F, (byte)124);
               var2.method699(1.0F, (byte)127);
               var2.method699(1.0F, (byte)125);
               var2.method699(1.0F, (byte)123);
               var2.method699(0.0F, (byte)127);
               var2.method699(1.0F, (byte)127);
               var2.method699(0.0F, (byte)123);
               var2.method699(-1.0F, (byte)123);
               var2.method699(1.0F, (byte)127);
               var2.method699(0.0F, (byte)122);
               var2.method699(0.0F, (byte)126);
               var2.method699(0.0F, (byte)125);
            }

            this.field8398 = this.method4113(var2.field1889, 20, 671655096, false, var2.field1856);
            this.field8478 = new class7(this.field8398, 5126, 3, 0);
            this.field8438 = new class7(this.field8398, 5126, 2, 12);
            this.field8347.method5220(this, 23326);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[67] + (arg0 != null ? field8505[7] : field8505[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method604(int arg0) {
      try {
         ++field8174;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[139] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(Lbv;B)V"
   )
   public final void method4118(class324 arg0, byte arg1) {
      try {
         if (arg1 >= 119) {
            ++field8254;
            if (this.field8364 >= 0 && this.field8361[this.field8364] == arg0) {
               this.field8361[this.field8364--] = null;
               arg0.method2400((byte)-99);
               if (this.field8364 < 0) {
                  this.field8360 = null;
               } else {
                  this.field8360 = this.field8361[this.field8364];
                  this.field8360.method2401(true);
               }
            } else {
               throw new RuntimeException();
            }
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[27] + (arg0 != null ? field8505[7] : field8505[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method570(int arg0) {
      try {
         this.method4110((byte)87);
         ++field8308;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[36] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "h",
      descriptor = "(B)V"
   )
   private final void method4119(byte arg0) {
      try {
         ++field8167;
         OpenGL.glMatrixMode(5889);
         if (arg0 != 124) {
            this.method584(-2, 83, 38, 123, (int[])null);
         }

         OpenGL.glLoadMatrixf(this.field8453, 0);
         OpenGL.glMatrixMode(5888);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[193] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(ZFF)V"
   )
   public final void method4120(boolean arg0, float arg1, float arg2) {
      try {
         this.field8426 = arg2;
         this.field8488 = arg1;
         ++field8229;
         if (arg0) {
            this.method4170(2915);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8505[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "C",
      descriptor = "(Z)V"
   )
   public final void method493(boolean arg0) {
      try {
         this.field8458 = arg0;
         ++field8292;
         this.method4154(13494);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "x",
      descriptor = "()V"
   )
   public final void method514() {
      try {
         ++field8280;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8505[158] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "d",
      descriptor = "(III)V"
   )
   public final synchronized void method4121(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != -2026728312) {
            this.field8481 = true;
         }

         ++field8180;
         class713 var4 = new class713(arg2);
         var4.field6137 = (long)arg0;
         this.field8371.method2930((byte)-83, var4);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8505[49] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(I)V"
   )
   public final synchronized void method597(int arg0) {
      boolean var2 = client.field4360;

      try {
         ++field8287;
         int var15 = arg0 & Integer.MAX_VALUE;
         int var3 = 0;
         int var10000;
         if (var2 || !this.field8371.method2942(0)) {
            do {
               class713 var4 = (class713)this.field8371.method2941(-14002);
               class188.field2667[var3++] = (int)var4.field6137;
               this.field8370 -= var4.field10388;
               var10000 = ~var3;

               while(var10000 == -1001) {
                  OpenGL.glDeleteBuffersARB(var3, class188.field2667, 0);
                  var10000 = 0;
                  if (!var2) {
                     var3 = 0;
                     break;
                  }
               }
            } while(!this.field8371.method2942(0));
         }

         class713 var5;
         class713 var6;
         class713 var7;
         boolean var8;
         class713 var9;
         class428 var10;
         class428 var11;
         class713 var12;
         byte var16;
         class573 var18;
         if (var3 > 0) {
            OpenGL.glDeleteBuffersARB(var3, class188.field2667, 0);
            var3 = 0;
            if (var2) {
               var5 = (class713)this.field8372.method2941(-14002);
               class188.field2667[var3++] = (int)var5.field6137;
               this.field8368 -= var5.field10388;
               var10000 = var3;
            } else {
               if (this.field8372.method2942(0)) {
                  label687: {
                     if (~var3 < -1) {
                        OpenGL.glDeleteTextures(var3, class188.field2667, 0);
                        var3 = 0;
                        if (var2) {
                           var6 = (class713)this.field8373.method2941(-14002);
                           class188.field2667[var3++] = var6.field10388;
                           var10000 = var3;
                        } else {
                           if (this.field8373.method2942(0)) {
                              break label687;
                           }

                           var6 = (class713)this.field8373.method2941(-14002);
                           class188.field2667[var3++] = var6.field10388;
                           var10000 = var3;
                        }
                     } else {
                        if (this.field8373.method2942(0)) {
                           break label687;
                        }

                        var6 = (class713)this.field8373.method2941(-14002);
                        class188.field2667[var3++] = var6.field10388;
                        var10000 = var3;
                     }

                     while(true) {
                        while(var10000 == 1000) {
                           OpenGL.glDeleteFramebuffersEXT(var3, class188.field2667, 0);
                           var10000 = 0;
                           if (!var2) {
                              var3 = 0;
                              break;
                           }
                        }

                        if (this.field8373.method2942(0)) {
                           break;
                        }

                        var6 = (class713)this.field8373.method2941(-14002);
                        class188.field2667[var3++] = var6.field10388;
                        var10000 = var3;
                     }
                  }

                  if (~var3 < -1) {
                     OpenGL.glDeleteFramebuffersEXT(var3, class188.field2667, 0);
                     var16 = 0;
                     if (var2) {
                        var7 = (class713)this.field8374.method2941(-14002);
                        var3 = var16 + 1;
                        class188.field2667[var16] = (int)var7.field6137;
                        this.field8367 -= var7.field10388;
                        var10000 = ~var3;
                     } else {
                        if (this.field8374.method2942(0)) {
                           label745: {
                              if (~var16 < -1) {
                                 OpenGL.glDeleteRenderbuffersEXT(var16, class188.field2667, 0);
                                 var8 = false;
                                 if (!var2 && this.field8369.method2942(0)) {
                                    break label745;
                                 }
                              } else if (this.field8369.method2942(0)) {
                                 break label745;
                              }

                              do {
                                 var9 = (class713)this.field8369.method2941(-14002);
                                 OpenGL.glDeleteLists((int)var9.field6137, var9.field10388);
                              } while(!this.field8369.method2942(0));
                           }

                           if (var2) {
                              var10 = this.field8375.method2941(-14002);
                              OpenGL.glDeleteProgramARB((int)var10.field6137);
                           }

                           while(!this.field8375.method2942(0)) {
                              var10 = this.field8375.method2941(-14002);
                              OpenGL.glDeleteProgramARB((int)var10.field6137);
                           }

                           if (var2 || !this.field8376.method2942(0)) {
                              do {
                                 var11 = this.field8376.method2941(-14002);
                                 OpenGL.glDeleteObjectARB(var11.field6137);
                              } while(!this.field8376.method2942(0));
                           }

                           if (var2) {
                              var12 = (class713)this.field8369.method2941(-14002);
                              OpenGL.glDeleteLists((int)var12.field6137, var12.field10388);
                           }

                           while(true) {
                              if (this.field8369.method2942(0)) {
                                 this.field8339.method1312(58);
                                 var18 = this;
                                 if (!var2) {
                                    if (this.method545() > 100663296 && ~class133.method1054(-29025) < ~(this.field8384 + 60000L)) {
                                       System.gc();
                                       this.field8384 = class133.method1054(-29025);
                                    }

                                    this.field8355 = var15;
                                    return;
                                 }
                              } else {
                                 var18 = this;
                              }

                              var12 = (class713)var18.field8369.method2941(-14002);
                              OpenGL.glDeleteLists((int)var12.field6137, var12.field10388);
                           }
                        }

                        var7 = (class713)this.field8374.method2941(-14002);
                        var3 = var16 + 1;
                        class188.field2667[var16] = (int)var7.field6137;
                        this.field8367 -= var7.field10388;
                        var10000 = ~var3;
                     }
                  } else {
                     if (this.field8374.method2942(0)) {
                        label831: {
                           if (~var3 < -1) {
                              OpenGL.glDeleteRenderbuffersEXT(var3, class188.field2667, 0);
                              var8 = false;
                              if (!var2 && this.field8369.method2942(0)) {
                                 break label831;
                              }
                           } else if (this.field8369.method2942(0)) {
                              break label831;
                           }

                           do {
                              var9 = (class713)this.field8369.method2941(-14002);
                              OpenGL.glDeleteLists((int)var9.field6137, var9.field10388);
                           } while(!this.field8369.method2942(0));
                        }

                        if (var2) {
                           var10 = this.field8375.method2941(-14002);
                           OpenGL.glDeleteProgramARB((int)var10.field6137);
                        }

                        while(!this.field8375.method2942(0)) {
                           var10 = this.field8375.method2941(-14002);
                           OpenGL.glDeleteProgramARB((int)var10.field6137);
                        }

                        if (var2 || !this.field8376.method2942(0)) {
                           do {
                              var11 = this.field8376.method2941(-14002);
                              OpenGL.glDeleteObjectARB(var11.field6137);
                           } while(!this.field8376.method2942(0));
                        }

                        if (var2) {
                           var12 = (class713)this.field8369.method2941(-14002);
                           OpenGL.glDeleteLists((int)var12.field6137, var12.field10388);
                        }

                        while(true) {
                           if (this.field8369.method2942(0)) {
                              this.field8339.method1312(58);
                              var18 = this;
                              if (!var2) {
                                 if (this.method545() > 100663296 && ~class133.method1054(-29025) < ~(this.field8384 + 60000L)) {
                                    System.gc();
                                    this.field8384 = class133.method1054(-29025);
                                 }

                                 this.field8355 = var15;
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class713)var18.field8369.method2941(-14002);
                           OpenGL.glDeleteLists((int)var12.field6137, var12.field10388);
                        }
                     }

                     var7 = (class713)this.field8374.method2941(-14002);
                     class188.field2667[var3++] = (int)var7.field6137;
                     this.field8367 -= var7.field10388;
                     var10000 = ~var3;
                  }

                  while(true) {
                     while(var10000 == -1001) {
                        OpenGL.glDeleteRenderbuffersEXT(var3, class188.field2667, 0);
                        var10000 = 0;
                        if (!var2) {
                           var3 = 0;
                           break;
                        }
                     }

                     if (this.field8374.method2942(0)) {
                        label930: {
                           if (~var3 < -1) {
                              OpenGL.glDeleteRenderbuffersEXT(var3, class188.field2667, 0);
                              var8 = false;
                              if (!var2 && this.field8369.method2942(0)) {
                                 break label930;
                              }
                           } else if (this.field8369.method2942(0)) {
                              break label930;
                           }

                           do {
                              var9 = (class713)this.field8369.method2941(-14002);
                              OpenGL.glDeleteLists((int)var9.field6137, var9.field10388);
                           } while(!this.field8369.method2942(0));
                        }

                        if (var2) {
                           var10 = this.field8375.method2941(-14002);
                           OpenGL.glDeleteProgramARB((int)var10.field6137);
                        }

                        while(!this.field8375.method2942(0)) {
                           var10 = this.field8375.method2941(-14002);
                           OpenGL.glDeleteProgramARB((int)var10.field6137);
                        }

                        if (var2 || !this.field8376.method2942(0)) {
                           do {
                              var11 = this.field8376.method2941(-14002);
                              OpenGL.glDeleteObjectARB(var11.field6137);
                           } while(!this.field8376.method2942(0));
                        }

                        if (var2) {
                           var12 = (class713)this.field8369.method2941(-14002);
                           OpenGL.glDeleteLists((int)var12.field6137, var12.field10388);
                        }

                        while(true) {
                           if (this.field8369.method2942(0)) {
                              this.field8339.method1312(58);
                              var18 = this;
                              if (!var2) {
                                 if (this.method545() > 100663296 && ~class133.method1054(-29025) < ~(this.field8384 + 60000L)) {
                                    System.gc();
                                    this.field8384 = class133.method1054(-29025);
                                 }

                                 this.field8355 = var15;
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class713)var18.field8369.method2941(-14002);
                           OpenGL.glDeleteLists((int)var12.field6137, var12.field10388);
                        }
                     }

                     var7 = (class713)this.field8374.method2941(-14002);
                     class188.field2667[var3++] = (int)var7.field6137;
                     this.field8367 -= var7.field10388;
                     var10000 = ~var3;
                  }
               }

               var5 = (class713)this.field8372.method2941(-14002);
               class188.field2667[var3++] = (int)var5.field6137;
               this.field8368 -= var5.field10388;
               var10000 = var3;
            }
         } else {
            if (this.field8372.method2942(0)) {
               label357: {
                  if (~var3 < -1) {
                     OpenGL.glDeleteTextures(var3, class188.field2667, 0);
                     var3 = 0;
                     if (var2) {
                        var6 = (class713)this.field8373.method2941(-14002);
                        class188.field2667[var3++] = var6.field10388;
                        var10000 = var3;
                     } else {
                        if (this.field8373.method2942(0)) {
                           break label357;
                        }

                        var6 = (class713)this.field8373.method2941(-14002);
                        class188.field2667[var3++] = var6.field10388;
                        var10000 = var3;
                     }
                  } else {
                     if (this.field8373.method2942(0)) {
                        break label357;
                     }

                     var6 = (class713)this.field8373.method2941(-14002);
                     class188.field2667[var3++] = var6.field10388;
                     var10000 = var3;
                  }

                  while(true) {
                     while(var10000 == 1000) {
                        OpenGL.glDeleteFramebuffersEXT(var3, class188.field2667, 0);
                        var10000 = 0;
                        if (!var2) {
                           var3 = 0;
                           break;
                        }
                     }

                     if (this.field8373.method2942(0)) {
                        break;
                     }

                     var6 = (class713)this.field8373.method2941(-14002);
                     class188.field2667[var3++] = var6.field10388;
                     var10000 = var3;
                  }
               }

               if (~var3 < -1) {
                  OpenGL.glDeleteFramebuffersEXT(var3, class188.field2667, 0);
                  var16 = 0;
                  if (var2) {
                     var7 = (class713)this.field8374.method2941(-14002);
                     var3 = var16 + 1;
                     class188.field2667[var16] = (int)var7.field6137;
                     this.field8367 -= var7.field10388;
                     var10000 = ~var3;
                  } else {
                     if (this.field8374.method2942(0)) {
                        label415: {
                           if (~var16 < -1) {
                              OpenGL.glDeleteRenderbuffersEXT(var16, class188.field2667, 0);
                              var8 = false;
                              if (!var2 && this.field8369.method2942(0)) {
                                 break label415;
                              }
                           } else if (this.field8369.method2942(0)) {
                              break label415;
                           }

                           do {
                              var9 = (class713)this.field8369.method2941(-14002);
                              OpenGL.glDeleteLists((int)var9.field6137, var9.field10388);
                           } while(!this.field8369.method2942(0));
                        }

                        if (var2) {
                           var10 = this.field8375.method2941(-14002);
                           OpenGL.glDeleteProgramARB((int)var10.field6137);
                        }

                        while(!this.field8375.method2942(0)) {
                           var10 = this.field8375.method2941(-14002);
                           OpenGL.glDeleteProgramARB((int)var10.field6137);
                        }

                        if (var2 || !this.field8376.method2942(0)) {
                           do {
                              var11 = this.field8376.method2941(-14002);
                              OpenGL.glDeleteObjectARB(var11.field6137);
                           } while(!this.field8376.method2942(0));
                        }

                        if (var2) {
                           var12 = (class713)this.field8369.method2941(-14002);
                           OpenGL.glDeleteLists((int)var12.field6137, var12.field10388);
                        }

                        while(true) {
                           if (this.field8369.method2942(0)) {
                              this.field8339.method1312(58);
                              var18 = this;
                              if (!var2) {
                                 if (this.method545() > 100663296 && ~class133.method1054(-29025) < ~(this.field8384 + 60000L)) {
                                    System.gc();
                                    this.field8384 = class133.method1054(-29025);
                                 }

                                 this.field8355 = var15;
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class713)var18.field8369.method2941(-14002);
                           OpenGL.glDeleteLists((int)var12.field6137, var12.field10388);
                        }
                     }

                     var7 = (class713)this.field8374.method2941(-14002);
                     var3 = var16 + 1;
                     class188.field2667[var16] = (int)var7.field6137;
                     this.field8367 -= var7.field10388;
                     var10000 = ~var3;
                  }
               } else {
                  if (this.field8374.method2942(0)) {
                     label501: {
                        if (~var3 < -1) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class188.field2667, 0);
                           var8 = false;
                           if (!var2 && this.field8369.method2942(0)) {
                              break label501;
                           }
                        } else if (this.field8369.method2942(0)) {
                           break label501;
                        }

                        do {
                           var9 = (class713)this.field8369.method2941(-14002);
                           OpenGL.glDeleteLists((int)var9.field6137, var9.field10388);
                        } while(!this.field8369.method2942(0));
                     }

                     if (var2) {
                        var10 = this.field8375.method2941(-14002);
                        OpenGL.glDeleteProgramARB((int)var10.field6137);
                     }

                     while(!this.field8375.method2942(0)) {
                        var10 = this.field8375.method2941(-14002);
                        OpenGL.glDeleteProgramARB((int)var10.field6137);
                     }

                     if (var2 || !this.field8376.method2942(0)) {
                        do {
                           var11 = this.field8376.method2941(-14002);
                           OpenGL.glDeleteObjectARB(var11.field6137);
                        } while(!this.field8376.method2942(0));
                     }

                     if (var2) {
                        var12 = (class713)this.field8369.method2941(-14002);
                        OpenGL.glDeleteLists((int)var12.field6137, var12.field10388);
                     }

                     while(true) {
                        if (this.field8369.method2942(0)) {
                           this.field8339.method1312(58);
                           var18 = this;
                           if (!var2) {
                              if (this.method545() > 100663296 && ~class133.method1054(-29025) < ~(this.field8384 + 60000L)) {
                                 System.gc();
                                 this.field8384 = class133.method1054(-29025);
                              }

                              this.field8355 = var15;
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class713)var18.field8369.method2941(-14002);
                        OpenGL.glDeleteLists((int)var12.field6137, var12.field10388);
                     }
                  }

                  var7 = (class713)this.field8374.method2941(-14002);
                  class188.field2667[var3++] = (int)var7.field6137;
                  this.field8367 -= var7.field10388;
                  var10000 = ~var3;
               }

               while(true) {
                  while(var10000 == -1001) {
                     OpenGL.glDeleteRenderbuffersEXT(var3, class188.field2667, 0);
                     var10000 = 0;
                     if (!var2) {
                        var3 = 0;
                        break;
                     }
                  }

                  if (this.field8374.method2942(0)) {
                     label600: {
                        if (~var3 < -1) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class188.field2667, 0);
                           var8 = false;
                           if (!var2 && this.field8369.method2942(0)) {
                              break label600;
                           }
                        } else if (this.field8369.method2942(0)) {
                           break label600;
                        }

                        do {
                           var9 = (class713)this.field8369.method2941(-14002);
                           OpenGL.glDeleteLists((int)var9.field6137, var9.field10388);
                        } while(!this.field8369.method2942(0));
                     }

                     if (var2) {
                        var10 = this.field8375.method2941(-14002);
                        OpenGL.glDeleteProgramARB((int)var10.field6137);
                     }

                     while(!this.field8375.method2942(0)) {
                        var10 = this.field8375.method2941(-14002);
                        OpenGL.glDeleteProgramARB((int)var10.field6137);
                     }

                     if (var2 || !this.field8376.method2942(0)) {
                        do {
                           var11 = this.field8376.method2941(-14002);
                           OpenGL.glDeleteObjectARB(var11.field6137);
                        } while(!this.field8376.method2942(0));
                     }

                     if (var2) {
                        var12 = (class713)this.field8369.method2941(-14002);
                        OpenGL.glDeleteLists((int)var12.field6137, var12.field10388);
                     }

                     while(true) {
                        if (this.field8369.method2942(0)) {
                           this.field8339.method1312(58);
                           var18 = this;
                           if (!var2) {
                              if (this.method545() > 100663296 && ~class133.method1054(-29025) < ~(this.field8384 + 60000L)) {
                                 System.gc();
                                 this.field8384 = class133.method1054(-29025);
                              }

                              this.field8355 = var15;
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class713)var18.field8369.method2941(-14002);
                        OpenGL.glDeleteLists((int)var12.field6137, var12.field10388);
                     }
                  }

                  var7 = (class713)this.field8374.method2941(-14002);
                  class188.field2667[var3++] = (int)var7.field6137;
                  this.field8367 -= var7.field10388;
                  var10000 = ~var3;
               }
            }

            var5 = (class713)this.field8372.method2941(-14002);
            class188.field2667[var3++] = (int)var5.field6137;
            this.field8368 -= var5.field10388;
            var10000 = var3;
         }

         while(true) {
            while(var10000 == 1000) {
               OpenGL.glDeleteTextures(var3, class188.field2667, 0);
               var10000 = 0;
               if (!var2) {
                  var3 = 0;
                  break;
               }
            }

            if (this.field8372.method2942(0)) {
               label137: {
                  if (~var3 < -1) {
                     OpenGL.glDeleteTextures(var3, class188.field2667, 0);
                     var3 = 0;
                     if (var2) {
                        var6 = (class713)this.field8373.method2941(-14002);
                        class188.field2667[var3++] = var6.field10388;
                        var10000 = var3;
                     } else {
                        if (this.field8373.method2942(0)) {
                           break label137;
                        }

                        var6 = (class713)this.field8373.method2941(-14002);
                        class188.field2667[var3++] = var6.field10388;
                        var10000 = var3;
                     }
                  } else {
                     if (this.field8373.method2942(0)) {
                        break label137;
                     }

                     var6 = (class713)this.field8373.method2941(-14002);
                     class188.field2667[var3++] = var6.field10388;
                     var10000 = var3;
                  }

                  while(true) {
                     while(var10000 == 1000) {
                        OpenGL.glDeleteFramebuffersEXT(var3, class188.field2667, 0);
                        var10000 = 0;
                        if (!var2) {
                           var3 = 0;
                           break;
                        }
                     }

                     if (this.field8373.method2942(0)) {
                        break;
                     }

                     var6 = (class713)this.field8373.method2941(-14002);
                     class188.field2667[var3++] = var6.field10388;
                     var10000 = var3;
                  }
               }

               if (~var3 < -1) {
                  OpenGL.glDeleteFramebuffersEXT(var3, class188.field2667, 0);
                  var16 = 0;
                  if (var2) {
                     var7 = (class713)this.field8374.method2941(-14002);
                     var3 = var16 + 1;
                     class188.field2667[var16] = (int)var7.field6137;
                     this.field8367 -= var7.field10388;
                     var10000 = ~var3;
                  } else {
                     if (this.field8374.method2942(0)) {
                        label237: {
                           if (~var16 < -1) {
                              OpenGL.glDeleteRenderbuffersEXT(var16, class188.field2667, 0);
                              var8 = false;
                              if (!var2 && this.field8369.method2942(0)) {
                                 break label237;
                              }
                           } else if (this.field8369.method2942(0)) {
                              break label237;
                           }

                           do {
                              var9 = (class713)this.field8369.method2941(-14002);
                              OpenGL.glDeleteLists((int)var9.field6137, var9.field10388);
                           } while(!this.field8369.method2942(0));
                        }

                        if (var2) {
                           var10 = this.field8375.method2941(-14002);
                           OpenGL.glDeleteProgramARB((int)var10.field6137);
                        }

                        while(!this.field8375.method2942(0)) {
                           var10 = this.field8375.method2941(-14002);
                           OpenGL.glDeleteProgramARB((int)var10.field6137);
                        }

                        if (var2 || !this.field8376.method2942(0)) {
                           do {
                              var11 = this.field8376.method2941(-14002);
                              OpenGL.glDeleteObjectARB(var11.field6137);
                           } while(!this.field8376.method2942(0));
                        }

                        if (var2) {
                           var12 = (class713)this.field8369.method2941(-14002);
                           OpenGL.glDeleteLists((int)var12.field6137, var12.field10388);
                        }

                        while(true) {
                           if (this.field8369.method2942(0)) {
                              this.field8339.method1312(58);
                              var18 = this;
                              if (!var2) {
                                 if (this.method545() > 100663296 && ~class133.method1054(-29025) < ~(this.field8384 + 60000L)) {
                                    System.gc();
                                    this.field8384 = class133.method1054(-29025);
                                 }

                                 this.field8355 = var15;
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class713)var18.field8369.method2941(-14002);
                           OpenGL.glDeleteLists((int)var12.field6137, var12.field10388);
                        }
                     }

                     var7 = (class713)this.field8374.method2941(-14002);
                     var3 = var16 + 1;
                     class188.field2667[var16] = (int)var7.field6137;
                     this.field8367 -= var7.field10388;
                     var10000 = ~var3;
                  }
               } else {
                  if (this.field8374.method2942(0)) {
                     label150: {
                        if (~var3 < -1) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class188.field2667, 0);
                           var8 = false;
                           if (!var2 && this.field8369.method2942(0)) {
                              break label150;
                           }
                        } else if (this.field8369.method2942(0)) {
                           break label150;
                        }

                        do {
                           var9 = (class713)this.field8369.method2941(-14002);
                           OpenGL.glDeleteLists((int)var9.field6137, var9.field10388);
                        } while(!this.field8369.method2942(0));
                     }

                     if (var2) {
                        var10 = this.field8375.method2941(-14002);
                        OpenGL.glDeleteProgramARB((int)var10.field6137);
                     }

                     while(!this.field8375.method2942(0)) {
                        var10 = this.field8375.method2941(-14002);
                        OpenGL.glDeleteProgramARB((int)var10.field6137);
                     }

                     if (var2 || !this.field8376.method2942(0)) {
                        do {
                           var11 = this.field8376.method2941(-14002);
                           OpenGL.glDeleteObjectARB(var11.field6137);
                        } while(!this.field8376.method2942(0));
                     }

                     if (var2) {
                        var12 = (class713)this.field8369.method2941(-14002);
                        OpenGL.glDeleteLists((int)var12.field6137, var12.field10388);
                     }

                     while(true) {
                        if (this.field8369.method2942(0)) {
                           this.field8339.method1312(58);
                           var18 = this;
                           if (!var2) {
                              if (this.method545() > 100663296 && ~class133.method1054(-29025) < ~(this.field8384 + 60000L)) {
                                 System.gc();
                                 this.field8384 = class133.method1054(-29025);
                              }

                              this.field8355 = var15;
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class713)var18.field8369.method2941(-14002);
                        OpenGL.glDeleteLists((int)var12.field6137, var12.field10388);
                     }
                  }

                  var7 = (class713)this.field8374.method2941(-14002);
                  class188.field2667[var3++] = (int)var7.field6137;
                  this.field8367 -= var7.field10388;
                  var10000 = ~var3;
               }

               while(true) {
                  while(var10000 == -1001) {
                     OpenGL.glDeleteRenderbuffersEXT(var3, class188.field2667, 0);
                     var10000 = 0;
                     if (!var2) {
                        var3 = 0;
                        break;
                     }
                  }

                  if (this.field8374.method2942(0)) {
                     label99: {
                        if (~var3 < -1) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class188.field2667, 0);
                           var8 = false;
                           if (!var2 && this.field8369.method2942(0)) {
                              break label99;
                           }
                        } else if (this.field8369.method2942(0)) {
                           break label99;
                        }

                        do {
                           var9 = (class713)this.field8369.method2941(-14002);
                           OpenGL.glDeleteLists((int)var9.field6137, var9.field10388);
                        } while(!this.field8369.method2942(0));
                     }

                     if (var2) {
                        var10 = this.field8375.method2941(-14002);
                        OpenGL.glDeleteProgramARB((int)var10.field6137);
                     }

                     while(!this.field8375.method2942(0)) {
                        var10 = this.field8375.method2941(-14002);
                        OpenGL.glDeleteProgramARB((int)var10.field6137);
                     }

                     if (var2 || !this.field8376.method2942(0)) {
                        do {
                           var11 = this.field8376.method2941(-14002);
                           OpenGL.glDeleteObjectARB(var11.field6137);
                        } while(!this.field8376.method2942(0));
                     }

                     if (var2) {
                        var12 = (class713)this.field8369.method2941(-14002);
                        OpenGL.glDeleteLists((int)var12.field6137, var12.field10388);
                     }

                     while(true) {
                        if (this.field8369.method2942(0)) {
                           this.field8339.method1312(58);
                           var18 = this;
                           if (!var2) {
                              if (this.method545() > 100663296 && ~class133.method1054(-29025) < ~(this.field8384 + 60000L)) {
                                 System.gc();
                                 this.field8384 = class133.method1054(-29025);
                              }

                              this.field8355 = var15;
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class713)var18.field8369.method2941(-14002);
                        OpenGL.glDeleteLists((int)var12.field6137, var12.field10388);
                     }
                  }

                  var7 = (class713)this.field8374.method2941(-14002);
                  class188.field2667[var3++] = (int)var7.field6137;
                  this.field8367 -= var7.field10388;
                  var10000 = ~var3;
               }
            }

            var5 = (class713)this.field8372.method2941(-14002);
            class188.field2667[var3++] = (int)var5.field6137;
            this.field8368 -= var5.field10388;
            var10000 = var3;
         }
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field8505[167] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method554(Canvas arg0) {
      try {
         ++field8142;
         if (this.field8170 == arg0) {
            throw new RuntimeException();
         } else if (this.field8235.containsKey(arg0)) {
            Long var2 = (Long)this.field8235.get(arg0);
            this.field8158.releaseSurface(arg0, var2);
            this.field8235.remove(arg0);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[110] + (arg0 != null ? field8505[7] : field8505[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V"
   )
   public final void method586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class515 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      boolean var13 = client.field4360;

      try {
         ++field8266;
         if (~arg0 != ~arg2 || ~arg1 != ~arg3) {
            float var16;
            float var17;
            float var21;
            float var22;
            float var23;
            float var24;
            float var25;
            float var26;
            float var27;
            float var28;
            label87: {
               class612 var14 = (class612)arg6;
               class81 var15 = var14.field8976;
               this.method4131(-2);
               this.method4107(-118, var14.field8976);
               this.method4098(arg5, -16757);
               this.method4117(7681, 8448, -1);
               this.method4096(0, (byte)15, 34167, 768);
               var16 = var15.field1064 / (float)var15.field1060;
               var17 = var15.field1058 / (float)var15.field1065;
               float var18 = (float)(-arg0) + (float)arg2;
               float var19 = (float)arg3 - (float)arg1;
               float var20 = (float)(1.0D / Math.sqrt((double)(var18 * var18 + var19 * var19)));
               OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
               int var35 = arg11 % (arg9 + arg10);
               var21 = var18 * var20;
               var22 = var19 * var20;
               var23 = (float)arg9 * var21;
               var24 = (float)arg9 * var22;
               var25 = 0.0F;
               var26 = 0.0F;
               var27 = var23;
               var28 = var24;
               if (var35 <= arg9) {
                  var27 = (float)(-var35 + arg9) * var21;
                  var28 = (float)(-var35 + arg9) * var22;
                  if (!var13) {
                     break label87;
                  }
               }

               var25 = (float)(arg9 - -arg10 + -var35) * var21;
               var26 = (float)(-var35 + arg9 + arg10) * var22;
            }

            float var29 = (float)arg0 + 0.35F + var25;
            float var30 = (float)arg1 + 0.35F + var26;
            float var31 = (float)arg10 * var21;
            float var32 = (float)arg10 * var22;

            do {
               label94: {
                  int var10000;
                  label78: {
                     if (arg2 <= arg0) {
                        float var36;
                        var10000 = (var36 = var29 - ((float)arg2 + 0.35F)) == 0.0F ? 0 : (var36 < 0.0F ? -1 : 1);
                        if (var13) {
                           break label78;
                        }

                        if (var10000 < 0) {
                           break;
                        }

                        if (!(var27 + var29 < (float)arg2)) {
                           break label94;
                        }

                        var27 = (float)arg2 - var29;
                        if (!var13) {
                           break label94;
                        }
                     }

                     float var37;
                     var10000 = (var37 = (float)arg2 + 0.35F - var29) == 0.0F ? 0 : (var37 < 0.0F ? -1 : 1);
                  }

                  if (var10000 < 0) {
                     break;
                  }

                  if ((float)arg2 < var27 + var29) {
                     var27 = (float)arg2 + -var29;
                  }
               }

               label96: {
                  if (arg1 < arg3) {
                     if ((float)arg3 + 0.35F < var30) {
                        break;
                     }

                     if (!((float)arg3 < var28 + var30)) {
                        break label96;
                     }

                     var28 = (float)arg3 + -var30;
                     if (!var13) {
                        break label96;
                     }
                  }

                  if (var30 < (float)arg3 + 0.35F) {
                     break;
                  }

                  if ((float)arg3 > var28 + var30) {
                     var28 = (float)arg3 + -var30;
                  }
               }

               OpenGL.glBegin(1);
               OpenGL.glTexCoord2f((var29 - (float)arg7) * var16, ((float)(-arg8) + var30) * var17);
               OpenGL.glVertex2f(var29, var30);
               OpenGL.glTexCoord2f((var27 + var29 + (float)(-arg7)) * var16, (var28 + var30 - (float)arg8) * var17);
               OpenGL.glVertex2f(var27 + var29, var28 + var30);
               var29 += var27 + var31;
               OpenGL.glEnd();
               var30 += var28 + var32;
               var28 = var24;
               var27 = var23;
            } while(!var13);

            this.method4096(0, (byte)15, 5890, 768);
         }
      } catch (RuntimeException var34) {
         throw class237.method1823(var34, field8505[38] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field8505[7] : field8505[6]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method546(int[] arg0) {
      try {
         arg0[0] = this.field8334;
         arg0[1] = this.field8264;
         ++field8154;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[200] + (arg0 != null ? field8505[7] : field8505[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "l",
      descriptor = "(I)V"
   )
   private final void method4122(int arg0) {
      try {
         OpenGL.glViewport(this.field8394, this.field8451, this.field8334, this.field8264);
         if (arg0 <= 56) {
            this.method608(-83, 73, -20, 15, 97, 88);
         }

         ++field8324;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[197] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(BLbv;)V"
   )
   public final void method4123(byte arg0, class324 arg1) {
      try {
         int var3 = -37 / ((arg0 - -9) / 39);
         ++field8246;
         if (this.field8447) {
            this.method4114(arg1, 18294);
            this.method4142(arg1, (byte)-34);
         } else if (this.field8357 >= 3) {
            throw new RuntimeException();
         } else {
            if (this.field8357 >= 0) {
               this.field8363[this.field8357].method2403(true);
            }

            this.field8365 = this.field8360 = this.field8363[++this.field8357] = arg1;
            this.field8365.method2399(31653);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8505[201] + arg0 + ',' + (arg1 != null ? field8505[7] : field8505[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "c",
      descriptor = "(IZ)V"
   )
   public final void method4124(int arg0, boolean arg1) {
      try {
         int var3 = -97 % ((arg0 - 50) / 57);
         ++field8296;
         if (!this.field8427 == arg1) {
            this.field8427 = arg1;
            this.method4099(18965);
            this.field8385 &= -8;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8505[198] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(IIIZ)V"
   )
   public final void method4125(int arg0, int arg1, int arg2, boolean arg3) {
      try {
         ++field8137;
         OpenGL.glDrawArrays(arg1, arg2, arg0);
         if (!arg3) {
            this.field8489 = false;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8505[222] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public final void method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      boolean var10 = client.field4360;

      try {
         ++field8201;
         if (arg0 != arg2 || ~arg1 != ~arg3) {
            float var14;
            float var15;
            float var16;
            float var17;
            float var18;
            float var19;
            float var20;
            float var21;
            label79: {
               this.method4179((byte)-48);
               this.method4098(arg5, -16757);
               float var11 = (float)arg2 - (float)arg0;
               float var12 = (float)arg3 - (float)arg1;
               float var13 = (float)(1.0D / Math.sqrt((double)(var11 * var11 + var12 * var12)));
               OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
               var14 = var11 * var13;
               int var28 = arg8 % (arg6 + arg7);
               var15 = var12 * var13;
               var16 = (float)arg6 * var14;
               var17 = (float)arg6 * var15;
               var18 = 0.0F;
               var19 = 0.0F;
               var20 = var16;
               var21 = var17;
               if (var28 <= arg6) {
                  var20 = (float)(arg6 - var28) * var14;
                  var21 = (float)(-var28 + arg6) * var15;
                  if (!var10) {
                     break label79;
                  }
               }

               var18 = (float)(arg6 - var28 + arg7) * var14;
               var19 = (float)(arg6 - (-arg7 - -var28)) * var15;
            }

            float var22 = (float)arg0 + 0.35F + var18;
            float var23 = (float)arg1 + 0.35F + var19;
            float var24 = (float)arg7 * var14;
            float var25 = (float)arg7 * var15;

            do {
               label86: {
                  int var10000;
                  label70: {
                     if (arg0 >= arg2) {
                        float var29;
                        var10000 = (var29 = (float)arg2 + 0.35F - var22) == 0.0F ? 0 : (var29 < 0.0F ? -1 : 1);
                        if (var10) {
                           break label70;
                        }

                        if (var10000 > 0) {
                           break;
                        }

                        if (!((float)arg2 > var20 + var22)) {
                           break label86;
                        }

                        var20 = (float)arg2 - var22;
                        if (!var10) {
                           break label86;
                        }
                     }

                     float var30;
                     var10000 = (var30 = var22 - ((float)arg2 + 0.35F)) == 0.0F ? 0 : (var30 < 0.0F ? -1 : 1);
                  }

                  if (var10000 > 0) {
                     break;
                  }

                  if ((float)arg2 < var20 + var22) {
                     var20 = (float)arg2 - var22;
                  }
               }

               label88: {
                  if (~arg1 <= ~arg3) {
                     if (var23 < (float)arg3 + 0.35F) {
                        break;
                     }

                     if (!((float)arg3 > var21 + var23)) {
                        break label88;
                     }

                     var21 = (float)arg3 - var23;
                     if (!var10) {
                        break label88;
                     }
                  }

                  if ((float)arg3 + 0.35F < var23) {
                     break;
                  }

                  if ((float)arg3 < var21 + var23) {
                     var21 = (float)arg3 + -var23;
                  }
               }

               OpenGL.glBegin(1);
               OpenGL.glVertex2f(var22, var23);
               OpenGL.glVertex2f(var20 + var22, var21 + var23);
               var23 += var21 + var25;
               var22 += var20 + var24;
               OpenGL.glEnd();
               var21 = var17;
               var20 = var16;
            } while(!var10);

         }
      } catch (RuntimeException var27) {
         throw class237.method1823(var27, field8505[15] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "pa",
      descriptor = "()V"
   )
   public final void method518() {
      try {
         ++field8242;
         this.field8463 = false;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8505[153] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "v",
      descriptor = "()V"
   )
   public final void method544() {
      boolean var1 = client.field4360;

      try {
         ++field8311;
         class428 var2 = this.field8354.method2933(2);
         if (var1) {
            ((class40)var2).method349(-16851);
            var2 = this.field8354.method2940(false);
         }

         while(true) {
            while(var2 != null) {
               ((class40)var2).method349(-16851);
               var2 = this.field8354.method2940(false);
            }

            if (!var1) {
               if (this.field8342 != null) {
                  this.field8342.method1268(34836);
               }

               if (this.field8158 != null) {
                  Object var10000;
                  label47: {
                     this.method4169(13195);
                     Enumeration var3 = this.field8235.keys();
                     if (var1) {
                        var10000 = var3.nextElement();
                     } else if (!var3.hasMoreElements()) {
                        this.field8158.release();
                        var10000 = this;
                        if (!var1) {
                           break label47;
                        }
                     } else {
                        var10000 = var3.nextElement();
                     }

                     while(true) {
                        Canvas var4 = (Canvas)var10000;
                        Long var5 = (Long)this.field8235.get(var4);
                        this.field8158.releaseSurface(var4, var5);
                        if (!var3.hasMoreElements()) {
                           this.field8158.release();
                           var10000 = this;
                           if (!var1) {
                              break;
                           }
                        } else {
                           var10000 = var3.nextElement();
                        }
                     }
                  }

                  ((class573)var10000).field8158 = null;
               }

               if (this.field8353) {
                  class165.method1365(-128, true, false);
                  this.field8353 = false;
                  return;
               }

               return;
            }

            var2 = this.field8354.method2940(false);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field8505[28] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method575(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field8319;
         this.field8342.method1267(-124, arg0, arg3, arg2, arg1);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8505[194] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "EA",
      descriptor = "(IIII)V"
   )
   public final void method557(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field8204;
         if (!this.field8463) {
            throw new RuntimeException("");
         } else {
            this.field8497 = arg3;
            this.field8452 = arg1;
            this.field8416 = arg2;
            this.field8485 = arg0;
            if (this.field8406) {
               this.field8346.field489.method684(0);
               this.field8346.field489.method687(5890);
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8505[26] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(ZII)V"
   )
   public final void method4126(boolean arg0, int arg1, int arg2) {
      try {
         if (arg2 > 92) {
            ++field8332;
            this.method4145(arg1, true, (byte)12, arg0);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8505[60] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(Ljava/lang/String;ILnu;I)Lvca;"
   )
   public static final class296 method4127(String arg0, int arg1, class619 arg2, int arg3) {
      try {
         ++field8291;
         int var4 = 108 / (arg3 / 39);
         return class676.method4913(arg1, arg0, (byte)-54, arg2, field8505[41]);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8505[42] + (arg0 != null ? field8505[7] : field8505[6]) + ',' + arg1 + ',' + (arg2 != null ? field8505[7] : field8505[6]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(Lmha;Z)Lbg;"
   )
   public final class492 method500(class439 arg0, boolean arg1) {
      boolean var3 = client.field4360;

      try {
         int[] var4;
         label95: {
            ++field8184;
            var4 = new int[arg0.field6269 * arg0.field6267];
            int var5 = 0;
            int var6 = 0;
            if (arg0.field6270 == null) {
               int var7 = 0;
               if (var3 || arg0.field6267 > var7) {
                  do {
                     int var8 = 0;
                     if (var3 || ~var8 > ~arg0.field6269) {
                        do {
                           int var9 = arg0.field6264[arg0.field6268[var5++] & 255];
                           var4[var6++] = var9 != 0 ? class300.method2238(var9, -16777216) : 0;
                           ++var8;
                        } while(~var8 > ~arg0.field6269);
                     }

                     ++var7;
                  } while(arg0.field6267 > var7);
               }

               if (!var3) {
                  break label95;
               }
            }

            int var10 = 0;
            if (var3 || ~var10 > ~arg0.field6267) {
               do {
                  int var11 = 0;
                  if (var3) {
                     var4[var6++] = class300.method2238(arg0.field6264[class556.method3988(255, arg0.field6268[var5])], arg0.field6270[var5] << 24);
                     ++var5;
                     ++var11;
                  }

                  while(true) {
                     while(arg0.field6269 > var11) {
                        var4[var6++] = class300.method2238(arg0.field6264[class556.method3988(255, arg0.field6268[var5])], arg0.field6270[var5] << 24);
                        ++var5;
                        ++var11;
                     }

                     if (!var3) {
                        ++var10;
                        break;
                     }

                     ++var11;
                  }
               } while(~var10 > ~arg0.field6267);
            }
         }

         class492 var12 = this.method548(-19069, arg0.field6267, var4, arg0.field6269, arg0.field6269, 0);
         var12.method961(arg0.field6265, arg0.field6262, arg0.field6266, arg0.field6263);
         return var12;
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field8505[79] + (arg0 != null ? field8505[7] : field8505[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "e",
      descriptor = "(B)V"
   )
   private final void method4128(byte arg0) {
      try {
         class599.field8803[2] = this.field8461 * this.field8442;
         ++field8336;
         class599.field8803[0] = this.field8461 * this.field8402;
         class599.field8803[3] = 1.0F;
         if (arg0 >= -76) {
            this.field8378 = -34;
         }

         class599.field8803[1] = this.field8461 * this.field8440;
         OpenGL.glLightfv(16384, 4609, class599.field8803, 0);
         class599.field8803[2] = -this.field8465 * this.field8442;
         class599.field8803[0] = -this.field8465 * this.field8402;
         class599.field8803[1] = -this.field8465 * this.field8440;
         class599.field8803[3] = 1.0F;
         OpenGL.glLightfv(16385, 4609, class599.field8803, 0);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[159] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "n",
      descriptor = "()Z"
   )
   public final boolean method528() {
      try {
         ++field8273;
         return this.field8337 != null && this.field8337.method2641((byte)118);
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8505[192] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "j",
      descriptor = "(B)V"
   )
   public final void method4129(byte arg0) {
      try {
         if (arg0 >= 42) {
            ++field8302;
            OpenGL.glLightfv(16384, 4611, this.field8405, 0);
            OpenGL.glLightfv(16385, 4611, this.field8472, 0);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[190] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "w",
      descriptor = "(I)V"
   )
   private final void method4130(int arg0) {
      try {
         int var2 = -20 % ((7 - arg0) / 52);
         if (~this.field8455 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (this.field8334 > 0 && ~this.field8264 < -1) {
               OpenGL.glOrtho(0.0D, (double)this.field8334, (double)this.field8264, 0.0D, -1.0D, 1.0D);
            }

            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field8385 &= -25;
            this.field8455 = 1;
         }

         ++field8245;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "s",
      descriptor = "(I)V"
   )
   public final void method4131(int arg0) {
      try {
         if (arg0 != -2) {
            this.method504();
         }

         if (this.field8385 != 2) {
            this.method4130(arg0 + -122);
            this.method4106((byte)-118, false);
            this.method4124(arg0 + 118, false);
            this.method4180((byte)123, false);
            this.method4148(false, (byte)-64);
            this.method4105(4, -2);
            this.field8385 = 2;
         }

         ++field8227;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[62] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method588(Canvas arg0, int arg1, int arg2) {
      try {
         long var4;
         label37: {
            ++field8223;
            var4 = 0L;
            if (arg0 != null && this.field8170 != arg0) {
               if (!this.field8235.containsKey(arg0)) {
                  break label37;
               }

               Long var6 = (Long)this.field8235.get(arg0);
               var4 = var6;
               if (!client.field4360) {
                  break label37;
               }
            }

            var4 = this.field8216;
         }

         if (~var4 == -1L) {
            throw new RuntimeException();
         } else {
            this.field8158.surfaceResized(var4);
            if (this.field8215 == arg0) {
               this.method4101((byte)-87);
            }
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field8505[37] + (arg0 != null ? field8505[7] : field8505[6]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(FIFFF)V"
   )
   public final void method4132(float arg0, int arg1, float arg2, float arg3, float arg4) {
      try {
         if (arg1 == -30838) {
            class599.field8803[3] = arg4;
            class599.field8803[1] = arg3;
            class599.field8803[0] = arg0;
            ++field8162;
            class599.field8803[2] = arg2;
            OpenGL.glTexEnvfv(8960, 8705, class599.field8803, 0);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field8505[24] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "c",
      descriptor = "(III)V"
   )
   public final synchronized void method4133(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 771) {
            this.method520(-24, -101, -46, -11, -119);
         }

         ++field8226;
         class713 var4 = new class713(arg0);
         var4.field6137 = (long)arg2;
         this.field8372.method2930((byte)-84, var4);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8505[95] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "d",
      descriptor = "(II)I"
   )
   public final int method543(int arg0, int arg1) {
      try {
         ++field8304;
         return arg0 | arg1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "j",
      descriptor = "(II)V"
   )
   public final void method4134(int arg0, int arg1) {
      try {
         ++field8263;
         if (arg1 == 2) {
            if (~arg0 != -2) {
               if (~arg0 == -1) {
                  this.method4117(8448, 8448, -1);
               } else if (arg0 == 2) {
                  this.method4117(34165, 7681, -1);
               } else {
                  if (~arg0 != -4) {
                     if (arg0 == 4) {
                        this.method4117(34023, 34023, -1);
                        return;
                     }
                  } else {
                     this.method4117(260, 8448, arg1 ^ -3);
                  }

               }
            } else {
               this.method4117(7681, 7681, -1);
            }
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[207] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "f",
      descriptor = "(Z)V"
   )
   private final void method4135(boolean arg0) {
      try {
         this.field8395 = new class486[this.field8422];
         ++field8210;
         this.field8454 = new class601(this, 3553, 6408, 1, 1);
         new class601(this, 3553, 6408, 1, 1);
         new class601(this, 3553, 6408, 1, 1);
         this.field8425 = new class747(this);
         this.field8393 = new class747(this);
         this.field8421 = new class747(this);
         this.field8474 = new class747(this);
         this.field8479 = new class747(this);
         this.field8498 = new class747(this);
         if (!arg0) {
            this.field8349 = null;
         }

         this.field8460 = new class747(this);
         this.field8389 = new class747(this);
         this.field8487 = new class747(this);
         this.field8466 = new class747(this);
         if (this.field8445) {
            this.field8410 = new class780(this);
            new class780(this);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[43] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(ILlfa;III)V"
   )
   public final void method4136(int arg0, class126 arg1, int arg2, int arg3, int arg4) {
      try {
         ++field8243;
         int var6 = arg1.method1009(-64);
         int var9 = arg2 * this.method4150(true, var6);
         this.method4165((byte)-83, arg1);
         OpenGL.glDrawElements(arg0, arg3, var6, arg1.method1011((byte)-127) + (long)var9);
         if (arg4 > 55) {
            ;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field8505[218] + arg0 + ',' + (arg1 != null ? field8505[7] : field8505[6]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "k",
      descriptor = "(B)V"
   )
   public final void method4137(byte arg0) {
      try {
         int var2 = -117 / ((61 - arg0) / 63);
         ++field8344;
         if (~this.field8385 != -17) {
            this.method4174(34192);
            this.method4106((byte)124, true);
            this.method4180((byte)111, true);
            this.method4148(true, (byte)-64);
            this.method4098(1, -16757);
            this.field8385 = 16;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(IF)V"
   )
   public final void method4138(int arg0, float arg1) {
      try {
         ++field8317;
         if (this.field8414 != arg1) {
            this.field8414 = arg1;
            if (~this.field8455 == -4) {
               this.method4155(arg0 ^ 14872);
            }
         }

         if (arg0 != 11544) {
            this.method554((Canvas)null);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[93] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "e",
      descriptor = "(Z)V"
   )
   public final void method4139(boolean arg0) {
      try {
         ++field8198;
         OpenGL.glPushMatrix();
         if (arg0) {
            this.field8436 = true;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[210] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(Llc;)V"
   )
   public final void method561(class676 arg0) {
      try {
         ++field8148;
         this.field8468 = (class588)arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[9] + (arg0 != null ? field8505[7] : field8505[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "z",
      descriptor = "()I"
   )
   public final int method593() {
      try {
         ++field8213;
         return 4;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8505[89] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(Lst;Luu;)Lus;"
   )
   public final class1 method529(class461 arg0, class302 arg1) {
      try {
         ++field8313;
         return null;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[57] + (arg0 != null ? field8505[7] : field8505[6]) + ',' + (arg1 != null ? field8505[7] : field8505[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "y",
      descriptor = "()Z"
   )
   public final boolean method503() {
      try {
         ++field8293;
         return true;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8505[47] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "f",
      descriptor = "()Z"
   )
   public final boolean method508() {
      try {
         ++field8145;
         return true;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8505[112] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "b",
      descriptor = "(II)Luu;"
   )
   public final class302 method498(int arg0, int arg1) {
      try {
         ++field8208;
         return null;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[204] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(IIZ)Lbg;"
   )
   public final class492 method565(int arg0, int arg1, boolean arg2) {
      try {
         ++field8212;
         return new class185(this, arg0, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8505[161] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "F",
      descriptor = "(II)V"
   )
   public final void method521(int arg0, int arg1) {
      try {
         ++field8340;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[87] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method4140(int arg0, byte arg1) {
      try {
         ++field8178;
         if (arg1 > -46) {
            this.field8488 = -1.2530941F;
         }

         if (arg0 != 1) {
            if (arg0 != 0) {
               if (~arg0 == -3) {
                  return 34165;
               } else if (~arg0 == -4) {
                  return 260;
               } else if (arg0 == 4) {
                  return 34023;
               } else {
                  throw new IllegalArgumentException();
               }
            } else {
               return 8448;
            }
         } else {
            return 7681;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[78] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(ZIII)V"
   )
   public final void method4141(boolean arg0, int arg1, int arg2, int arg3) {
      try {
         OpenGL.glTexEnvi(8960, arg1 + 34184, arg3);
         if (arg0) {
            this.field8464 = -10;
         }

         ++field8181;
         OpenGL.glTexEnvi(8960, 34200 - -arg1, arg2);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8505[221] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "()V"
   )
   public final void method579() {
      try {
         ++field8239;
         if (this.field8337 != null && this.field8337.method2641((byte)105)) {
            this.field8342.method1266(3710, this.field8337);
            this.field8339.method1309(false);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8505[150] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "b",
      descriptor = "(Lbv;B)V"
   )
   public final void method4142(class324 arg0, byte arg1) {
      try {
         ++field8233;
         if (this.field8364 >= 3) {
            throw new RuntimeException();
         } else {
            if (~this.field8364 <= -1) {
               this.field8361[this.field8364].method2400((byte)-119);
            }

            this.field8360 = this.field8361[++this.field8364] = arg0;
            this.field8360.method2401(true);
            if (arg1 != -34) {
               this.method569();
            }
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[52] + (arg0 != null ? field8505[7] : field8505[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(Lew;)V"
   )
   public final void method532(class521 arg0) {
      try {
         ++field8310;
         this.field8379.method1230(arg0);
         this.field8386.method1230(this.field8379);
         this.field8386.method3688(16383);
         this.field8387.method3690(this.field8386, false);
         if (this.field8455 != 1) {
            this.method4103(35);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[76] + (arg0 != null ? field8505[7] : field8505[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "b",
      descriptor = "(BLiea;)V"
   )
   public final void method4143(byte arg0, class507 arg1) {
      try {
         if (arg0 == -77) {
            ++field8187;
            OpenGL.glLoadMatrixf(arg1.method3687((byte)122), 0);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[212] + arg0 + ',' + (arg1 != null ? field8505[7] : field8505[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(Lil;BLil;Lil;Lil;)V"
   )
   public final void method4144(class7 arg0, byte arg1, class7 arg2, class7 arg3, class7 arg4) {
      boolean var6 = client.field4360;

      try {
         label70: {
            if (arg3 == null) {
               OpenGL.glDisableClientState(32884);
               if (!var6) {
                  break label70;
               }
            }

            this.method4097(arg3.field72, (byte)72);
            OpenGL.glVertexPointer(arg3.field74, arg3.field77, this.field8400.method3517(true), this.field8400.method3516(83) - -((long)arg3.field73));
            OpenGL.glEnableClientState(32884);
         }

         label65: {
            ++field8277;
            if (arg4 == null) {
               OpenGL.glDisableClientState(32885);
               if (!var6) {
                  break label65;
               }
            }

            this.method4097(arg4.field72, (byte)115);
            OpenGL.glNormalPointer(arg4.field77, this.field8400.method3517(true), this.field8400.method3516(arg1 + 45) - -((long)arg4.field73));
            OpenGL.glEnableClientState(32885);
         }

         label60: {
            if (arg2 != null) {
               this.method4097(arg2.field72, (byte)108);
               OpenGL.glColorPointer(arg2.field74, arg2.field77, this.field8400.method3517(true), this.field8400.method3516(76) + (long)arg2.field73);
               OpenGL.glEnableClientState(32886);
               if (!var6) {
                  break label60;
               }
            }

            OpenGL.glDisableClientState(32886);
         }

         label55: {
            if (arg0 == null) {
               OpenGL.glDisableClientState(32888);
               if (!var6) {
                  break label55;
               }
            }

            this.method4097(arg0.field72, (byte)-76);
            OpenGL.glTexCoordPointer(arg0.field74, arg0.field77, this.field8400.method3517(true), this.field8400.method3516(arg1 + 14) + (long)arg0.field73);
            OpenGL.glEnableClientState(32888);
         }

         if (arg1 != 71) {
            this.field8442 = -0.97648525F;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field8505[20] + (arg0 != null ? field8505[7] : field8505[6]) + ',' + arg1 + ',' + (arg2 != null ? field8505[7] : field8505[6]) + ',' + (arg3 != null ? field8505[7] : field8505[6]) + ',' + (arg4 != null ? field8505[7] : field8505[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "t",
      descriptor = "()Lew;"
   )
   public final class521 method598() {
      try {
         ++field8194;
         return this.field8348;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8505[141] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "DA",
      descriptor = "(IIII)V"
   )
   public final void method492(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field8473 = arg2;
         this.field8403 = arg0;
         ++field8155;
         this.field8493 = arg1;
         this.field8496 = arg3;
         this.method4147(9);
         this.method4149(50);
         if (~this.field8455 == -4) {
            this.method4155(5888);
         } else if (~this.field8455 == -3) {
            this.method4119((byte)124);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8505[51] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(IZBZ)V"
   )
   public final void method4145(int arg0, boolean arg1, byte arg2, boolean arg3) {
      boolean var5 = client.field4360;

      try {
         ++field8328;
         if (this.field8396 != arg0 || !this.field8463 != !this.field8406) {
            class601 var6;
            int var7;
            byte var8;
            int var9;
            int var10;
            label79: {
               var6 = null;
               var7 = 0;
               var8 = 0;
               var9 = 0;
               var10 = !this.field8463 ? 0 : 3;
               if (arg0 < 0) {
                  this.method4151(114);
                  if (!var5) {
                     break label79;
                  }
               }

               class317 var11;
               label89: {
                  var6 = this.field8339.method1310((byte)96, arg0);
                  var11 = super.field802.method1354(arg0, (byte)-109);
                  if (~var11.field4326 != -1 || var11.field4327 != 0) {
                     int var12 = !var11.field4318 ? 128 : 64;
                     int var13 = var12 * 50;
                     this.method4109((float)(this.field8355 % var13 * var11.field4326) / (float)var13, 0.0F, true, (float)(this.field8355 % var13 * var11.field4327) / (float)var13);
                     if (!var5) {
                        break label89;
                     }
                  }

                  this.method4151(arg2 ^ 98);
               }

               if (!this.field8463) {
                  var8 = var11.field4316;
                  var9 = var11.field4317;
                  var10 = var11.field4308;
               }

               var7 = var11.field4329;
            }

            this.field8346.method303(var9, 50, arg3, var10, arg1, var8);
            if (!this.field8346.method301(var7, 0, var6)) {
               this.method4107(83, var6);
               this.method4134(var7, 2);
            }

            this.field8396 = arg0;
            this.field8406 = this.field8463;
         }

         this.field8385 &= -8;
         if (arg2 != 12) {
            this.field8467 = null;
         }
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field8505[106] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(Lrha;)V"
   )
   public final void method562(class234 arg0) {
      try {
         ++field8207;
         this.field8347.method5225(arg0, -1, (byte)-96, this);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[105] + (arg0 != null ? field8505[7] : field8505[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "b",
      descriptor = "(III)V"
   )
   public final void method4146(int arg0, int arg1, int arg2) {
      try {
         this.field8451 = arg2;
         this.field8394 = arg1;
         ++field8175;
         this.method4122(70);
         if (arg0 < -36) {
            this.method4168(-4);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8505[39] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "A",
      descriptor = "()Ljr;"
   )
   public final class122 method573() {
      boolean var1 = client.field4360;

      try {
         ++field8163;
         int var2 = -1;
         if (~this.field8467.indexOf(field8505[174]) != 0) {
            var2 = 4318;
            if (!var1) {
               return new class122(var2, field8505[171], this.field8418, this.field8428, 0L);
            }
         }

         if (~this.field8467.indexOf(field8505[172]) != 0) {
            var2 = 32902;
            if (!var1) {
               return new class122(var2, field8505[171], this.field8418, this.field8428, 0L);
            }
         }

         if (~this.field8467.indexOf(field8505[175]) != 0) {
            var2 = 4098;
         }

         return new class122(var2, field8505[171], this.field8418, this.field8428, 0L);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[173] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "aa",
      descriptor = "(IIIIII)V"
   )
   public final void method496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field8159;
         float var7 = (float)arg0 + 0.35F;
         float var8 = (float)arg1 + 0.35F;
         float var9 = (float)arg2 + var7;
         this.method4179((byte)-48);
         float var10 = (float)arg3 + var8;
         this.method4098(arg5, -16757);
         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         if (this.field8441) {
            OpenGL.glDisable(32925);
         }

         OpenGL.glBegin(7);
         OpenGL.glVertex2f(var7, var8);
         OpenGL.glVertex2f(var7, var10);
         OpenGL.glVertex2f(var9, var10);
         OpenGL.glVertex2f(var9, var8);
         OpenGL.glEnd();
         if (this.field8441) {
            OpenGL.glEnable(32925);
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field8505[77] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "c",
      descriptor = "()Z"
   )
   public final boolean method564() {
      try {
         ++field8237;
         return this.field8346.method299(0, 3);
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8505[84] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "u",
      descriptor = "(I)V"
   )
   private final void method4147(int arg0) {
      try {
         ++field8248;
         float[] var2 = this.field8453;
         float var3 = (float)(-this.field8403 * this.field8431) / (float)this.field8473;
         float var4 = (float)((-this.field8403 + this.field8334) * this.field8431) / (float)this.field8473;
         float var5 = (float)(this.field8493 * this.field8431) / (float)this.field8496;
         if (arg0 != 9) {
            this.method564();
         }

         label29: {
            float var6 = (float)((-this.field8264 + this.field8493) * this.field8431) / (float)this.field8496;
            if (var3 == var4 || var5 == var6) {
               var2[14] = 0.0F;
               var2[0] = 1.0F;
               var2[11] = 0.0F;
               var2[7] = 0.0F;
               var2[4] = 0.0F;
               var2[3] = 0.0F;
               var2[9] = 0.0F;
               var2[1] = 0.0F;
               var2[10] = 1.0F;
               var2[2] = 0.0F;
               var2[12] = 0.0F;
               var2[5] = 1.0F;
               var2[6] = 0.0F;
               var2[8] = 0.0F;
               var2[15] = 1.0F;
               var2[13] = 0.0F;
               if (!client.field4360) {
                  break label29;
               }
            }

            float var7 = (float)this.field8431 * 2.0F;
            var2[9] = (var5 + var6) / (-var6 + var5);
            var2[8] = (var3 + var4) / (var4 - var3);
            var2[14] = this.field8432 = -((float)this.field8412 * var7) / (float)(-this.field8431 + this.field8412);
            var2[11] = -1.0F;
            var2[6] = 0.0F;
            var2[13] = 0.0F;
            var2[5] = var7 / (-var6 + var5);
            var2[1] = 0.0F;
            var2[10] = this.field8434 = (float)(-(this.field8431 + this.field8412)) / (float)(-this.field8431 + this.field8412);
            var2[4] = 0.0F;
            var2[2] = 0.0F;
            var2[3] = 0.0F;
            var2[7] = 0.0F;
            var2[15] = 0.0F;
            var2[0] = var7 / (-var3 + var4);
            var2[12] = 0.0F;
         }

         this.method4104(arg0 + 2090828831);
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field8505[149] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "c",
      descriptor = "(Z)V"
   )
   public final void method611(boolean arg0) {
      try {
         ++field8274;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[71] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "E",
      descriptor = "()I"
   )
   public final int method545() {
      try {
         ++field8160;
         return this.field8368 + this.field8367 + this.field8370;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8505[108] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "p",
      descriptor = "()Z"
   )
   public final boolean method583() {
      try {
         ++field8149;
         return false;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8505[102] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "j",
      descriptor = "()Z"
   )
   public final boolean method538() {
      try {
         ++field8271;
         return true;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8505[73] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "b",
      descriptor = "(ZB)V"
   )
   public final void method4148(boolean arg0, byte arg1) {
      try {
         ++field8214;
         if (arg1 == -64) {
            if (arg0 == !this.field8383) {
               this.field8383 = arg0;
               this.method4154(13494);
               this.field8385 &= -32;
            }
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[138] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "za",
      descriptor = "(IIIII)V"
   )
   public final void method542(int param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ea",
      name = "K",
      descriptor = "([I)V"
   )
   public final void method605(int[] arg0) {
      try {
         arg0[1] = this.field8484;
         ++field8323;
         arg0[0] = this.field8420;
         arg0[2] = this.field8401;
         arg0[3] = this.field8462;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[74] + (arg0 != null ? field8505[7] : field8505[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "r",
      descriptor = "(I)V"
   )
   private final void method4149(int arg0) {
      try {
         if (arg0 != 50) {
            this.field8452 = 65;
         }

         ++field8224;
         this.field8446 = (float)(-this.field8493 + this.field8484);
         this.field8407 = (float)(-this.field8403 + this.field8420);
         this.field8477 = (float)(-this.field8403 + this.field8401);
         this.field8443 = (float)(-this.field8493 + this.field8462);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[157] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(IIIIII)Llc;"
   )
   public final class676 method578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field8186;
         return !this.field8413 ? null : new class64(this, arg0, arg1, arg2, arg3, arg4, arg5);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field8505[33] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(ZI)I"
   )
   public final int method4150(boolean arg0, int arg1) {
      try {
         ++field8206;
         if (arg1 != 5121 && ~arg1 != -5121) {
            if (!arg0) {
               return -104;
            } else if (~arg1 != -5124 && ~arg1 != -5123) {
               if (arg1 != 5125 && arg1 != 5124 && ~arg1 != -5127) {
                  throw new IllegalArgumentException("");
               } else {
                  return 4;
               }
            } else {
               return 2;
            }
         } else {
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[98] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;"
   )
   public final class295 method539(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      try {
         ++field8253;
         return new class204(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field8505[19] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8505[7] : field8505[6]) + ',' + (arg3 != null ? field8505[7] : field8505[6]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "f",
      descriptor = "(II)V"
   )
   public final void method506(int arg0, int arg1) {
      try {
         if (~this.field8431 != ~arg0 || this.field8412 != arg1) {
            label32: {
               this.field8431 = arg0;
               this.field8412 = arg1;
               this.method4147(9);
               this.method4170(2915);
               if (this.field8455 != 3) {
                  if (this.field8455 != 2) {
                     break label32;
                  }

                  this.method4119((byte)124);
                  if (!client.field4360) {
                     break label32;
                  }
               }

               this.method4155(5888);
            }
         }

         ++field8179;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[202] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "z",
      descriptor = "(I)V"
   )
   private final void method4151(int arg0) {
      try {
         int var2 = -6 % ((arg0 - 57) / 33);
         ++field8259;
         if (this.field8444) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field8444 = false;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[35] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "KA",
      descriptor = "(IIII)V"
   )
   public final void method592(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg0 < 0) {
            arg0 = 0;
         }

         if (arg2 > this.field8334) {
            arg2 = this.field8334;
         }

         if (~arg1 > -1) {
            arg1 = 0;
         }

         ++field8301;
         if (~this.field8264 > ~arg3) {
            arg3 = this.field8264;
         }

         this.field8401 = arg2;
         this.field8462 = arg3;
         this.field8420 = arg0;
         this.field8484 = arg1;
         OpenGL.glEnable(3089);
         this.method4149(50);
         this.method4168(-4);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8505[142] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "la",
      descriptor = "()V"
   )
   public final void method574() {
      try {
         this.field8420 = 0;
         this.field8484 = 0;
         this.field8462 = this.field8264;
         ++field8314;
         this.field8401 = this.field8334;
         OpenGL.glDisable(3089);
         this.method4149(50);
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8505[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "c",
      descriptor = "(I)Lza;"
   )
   public final class438 method594(int arg0) {
      try {
         ++field8335;
         class40 var2 = new class40(arg0);
         this.field8354.method2930((byte)-63, var2);
         return var2;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[44] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(JB)V"
   )
   public final synchronized void method4152(long arg0, byte arg1) {
      try {
         ++field8138;
         class428 var4 = new class428();
         var4.field6137 = arg0;
         this.field8376.method2930((byte)-111, var4);
         if (arg1 >= -60) {
            this.method541(-110, 26, -104, -121, -54, 81, -59);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8505[53] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "d",
      descriptor = "(Z)V"
   )
   private final void method4153(boolean arg0) {
      boolean var2 = client.field4360;

      try {
         this.method4105(4, -2);
         ++field8141;
         int var3 = this.field8422 + -1;
         if (var2) {
            this.method4112((byte)-44, var3);
            this.method4107(-127, (class486)null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            --var3;
         }

         while(true) {
            while(var3 >= 0) {
               this.method4112((byte)-44, var3);
               this.method4107(-127, (class486)null);
               OpenGL.glTexEnvi(8960, 8704, 34160);
               --var3;
            }

            this.method4117(8448, 8448, -1);
            this.method4096(2, (byte)15, 34168, 770);
            this.method4151(-95);
            this.field8378 = 1;
            OpenGL.glEnable(3042);
            OpenGL.glBlendFunc(770, 771);
            this.field8377 = 1;
            OpenGL.glEnable(3008);
            OpenGL.glAlphaFunc(516, 0.0F);
            this.field8380 = true;
            OpenGL.glColorMask(true, true, true, true);
            this.field8382 = arg0;
            this.method4106((byte)-36, true);
            this.method4124(116, true);
            this.method4180((byte)114, true);
            this.method4148(true, (byte)-64);
            this.method4116((byte)37);
            this.field8158.setSwapInterval(0);
            OpenGL.glShadeModel(7425);
            OpenGL.glClearDepth(1.0F);
            OpenGL.glDepthFunc(515);
            OpenGL.glPolygonMode(1028, 6914);
            OpenGL.glEnable(2884);
            OpenGL.glCullFace(1029);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glColorMaterial(1028, 5634);
            OpenGL.glEnable(2903);
            float[] var4 = new float[]{0.0F, 0.0F, 0.0F, 1.0F};
            int var5 = 0;
            if (!var2) {
               int var6;
               if (var2) {
                  var6 = var5 + 16384;
                  OpenGL.glLightfv(var6, 4608, var4, 0);
                  OpenGL.glLightf(var6, 4615, 0.0F);
                  OpenGL.glLightf(var6, 4616, 0.0F);
                  ++var5;
               }

               while(true) {
                  int var10000;
                  short var10001;
                  if (var5 >= 8) {
                     OpenGL.glEnable(16384);
                     OpenGL.glEnable(16385);
                     OpenGL.glFogf(2914, 0.95F);
                     OpenGL.glFogi(2917, 9729);
                     var10000 = 3156;
                     var10001 = 4353;
                     if (!var2) {
                        OpenGL.glHint(3156, 4353);
                        this.field8435 = this.field8433 = -1;
                        this.method574();
                        return;
                     }
                  } else {
                     var10000 = var5;
                     var10001 = 16384;
                  }

                  var6 = var10000 + var10001;
                  OpenGL.glLightfv(var6, 4608, var4, 0);
                  OpenGL.glLightf(var6, 4615, 0.0F);
                  OpenGL.glLightf(var6, 4616, 0.0F);
                  ++var5;
               }
            }

            --var3;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field8505[155] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "ya",
      descriptor = "()V"
   )
   public final void method523() {
      try {
         ++field8343;
         this.method4148(true, (byte)-64);
         OpenGL.glClear(256);
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8505[134] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(IIIIIILaa;II)V"
   )
   public final void method580(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class515 arg6, int arg7, int arg8) {
      try {
         ++field8191;
         class612 var10 = (class612)arg6;
         class81 var11 = var10.field8976;
         this.method4131(-2);
         this.method4107(56, var10.field8976);
         this.method4098(arg5, -16757);
         this.method4117(7681, 8448, -1);
         this.method4096(0, (byte)15, 34167, 768);
         float var12 = var11.field1064 / (float)var11.field1060;
         float var13 = var11.field1058 / (float)var11.field1065;
         float var14 = (float)(-arg0) + (float)arg2;
         float var15 = (float)(-arg1) + (float)arg3;
         float var16 = (float)(1.0D / Math.sqrt((double)(var14 * var14 + var15 * var15)));
         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         float var17 = var15 * var16;
         float var18 = var14 * var16;
         OpenGL.glBegin(1);
         OpenGL.glTexCoord2f((float)(-arg7 + arg0) * var12, (float)(-arg8 + arg1) * var13);
         OpenGL.glVertex2f((float)arg0 + 0.35F, (float)arg1 + 0.35F);
         OpenGL.glTexCoord2f((float)(-arg7 + arg2) * var12, (float)(-arg8 + arg3) * var13);
         OpenGL.glVertex2f((float)arg2 + var18 + 0.35F, (float)arg3 + var17 + 0.35F);
         OpenGL.glEnd();
         this.method4096(0, (byte)15, 5890, 768);
      } catch (RuntimeException var20) {
         throw class237.method1823(var20, field8505[55] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field8505[7] : field8505[6]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "I",
      descriptor = "()I"
   )
   public final int method563() {
      try {
         ++field8286;
         int var1 = this.field8502;
         this.field8502 = 0;
         return var1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[145] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "<init>",
      descriptor = "(Ljava/awt/Canvas;Ld;I)V"
   )
   public class573(Canvas param1, class162 param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ea",
      name = "b",
      descriptor = "()V"
   )
   public final void method549() {
      try {
         ++field8200;
         if (!this.field8445) {
            if (!this.field8404) {
               throw new RuntimeException("");
            }

            this.field8359.method423(0, 0, this.field8334, this.field8264, 0, 0);
            this.field8158.setSurface(this.field8255);
            if (client.field4360) {
               throw new RuntimeException("");
            }
         } else {
            if (this.field8358 != this.field8360) {
               throw new RuntimeException();
            }

            this.field8358.method5617(0, -86);
            this.field8358.method5617(8, 92);
            this.method4115(true, this.field8358);
         }

         this.field8359 = null;
         this.field8334 = this.field8188;
         this.field8264 = this.field8333;
         this.method4116((byte)108);
         this.method4122(93);
         this.method574();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8505[226] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "t",
      descriptor = "(I)V"
   )
   private final void method4154(int arg0) {
      try {
         if (arg0 == 13494) {
            ++field8171;
            OpenGL.glDepthMask(this.field8383 && this.field8458);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[191] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "o",
      descriptor = "()Lew;"
   )
   public final class521 method600() {
      try {
         ++field8202;
         return this.field8379;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8505[94] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "XA",
      descriptor = "()I"
   )
   public final int method504() {
      try {
         ++field8240;
         return this.field8412;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8505[225] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "y",
      descriptor = "(I)V"
   )
   private final void method4155(int arg0) {
      try {
         ++field8211;
         float var2 = (float)(-this.field8403) * this.field8414 / (float)this.field8473;
         float var3 = (float)(-this.field8493) * this.field8414 / (float)this.field8496;
         float var4 = (float)(this.field8334 - this.field8403) * this.field8414 / (float)this.field8473;
         float var5 = (float)(-this.field8493 + this.field8264) * this.field8414 / (float)this.field8496;
         OpenGL.glMatrixMode(5889);
         OpenGL.glLoadIdentity();
         if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double)var2, (double)var4, (double)(-var5), (double)(-var3), (double)this.field8431, (double)this.field8412);
         }

         OpenGL.glMatrixMode(arg0);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field8505[219] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "na",
      descriptor = "(IIII)[I"
   )
   public final int[] method517(int arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field4360;

      try {
         ++field8257;
         int[] var6 = new int[arg2 * arg3];
         int var7 = 0;
         if (var5) {
            OpenGL.glReadPixelsi(arg0, -var7 + this.field8264 - arg1, arg2, 1, 32993, this.field8439, var6, arg2 * var7);
            ++var7;
         }

         while(true) {
            while(~arg3 < ~var7) {
               OpenGL.glReadPixelsi(arg0, -var7 + this.field8264 - arg1, arg2, 1, 32993, this.field8439, var6, arg2 * var7);
               ++var7;
            }

            if (!var5) {
               return var6;
            }

            ++var7;
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field8505[90] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "([IIIIIZ)Lbg;"
   )
   public final class492 method515(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         ++field8151;
         return new class185(this, arg3, arg4, arg0, arg1, arg2);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field8505[11] + (arg0 != null ? field8505[7] : field8505[6]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(ILjava/awt/Canvas;Ld;IB)Lha;"
   )
   public static final class66 method4156(int arg0, Canvas arg1, class162 arg2, int arg3, byte arg4) {
      try {
         if (arg4 != 3) {
            field8327 = 105;
         }

         ++field8330;
         return new class726(arg1, arg2, arg0, arg3);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8505[8] + arg0 + ',' + (arg1 != null ? field8505[7] : field8505[6]) + ',' + (arg2 != null ? field8505[7] : field8505[6]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(IIIIZ)Lbg;"
   )
   public final class492 method552(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         ++field8249;
         return new class185(this, arg0, arg1, arg2, arg3);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field8505[80] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final synchronized void method4157(int arg0, int arg1, byte arg2) {
      try {
         ++field8217;
         class713 var4 = new class713(arg1);
         var4.field6137 = (long)arg0;
         this.field8374.method2930((byte)-107, var4);
         if (arg2 >= -45) {
            this.method609();
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8505[146] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "e",
      descriptor = "(II)V"
   )
   public final void method560(int arg0, int arg1) throws class525 {
      try {
         try {
            this.field8158.swapBuffers();
         } catch (Exception var4) {
         }

         ++field8258;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8505[23] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "L",
      descriptor = "(III)V"
   )
   public final void method590(int arg0, int arg1, int arg2) {
      try {
         ++field8190;
         if (~this.field8433 != ~arg0 || ~this.field8390 != ~arg1 || ~this.field8409 != ~arg2) {
            this.field8409 = arg2;
            this.field8433 = arg0;
            this.field8390 = arg1;
            this.method4170(2915);
            this.method4164(3998);
         }

      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8505[61] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(BLiea;)V"
   )
   public final void method4158(byte arg0, class507 arg1) {
      try {
         ++field8147;
         OpenGL.glPushMatrix();
         OpenGL.glMultMatrixf(arg1.method3687((byte)105), 0);
         if (arg0 < 52) {
            this.method4116((byte)-18);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[154] + arg0 + ',' + (arg1 != null ? field8505[7] : field8505[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(I[Lmn;)V"
   )
   public final void method553(int arg0, class389[] arg1) {
      boolean var3 = client.field4360;

      try {
         int var4 = 0;
         if (var3) {
            this.field8492[var4] = arg1[var4];
            ++var4;
         }

         while(true) {
            class573 var10000;
            if (~var4 <= ~arg0) {
               ++field8225;
               this.field8480 = arg0;
               var10000 = this;
               if (!var3) {
                  if (~this.field8455 != -2) {
                     this.method4166((byte)65);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = this;
            }

            var10000.field8492[var4] = arg1[var4];
            ++var4;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8505[32] + arg0 + ',' + (arg1 != null ? field8505[7] : field8505[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "r",
      descriptor = "(IIIIIII)I"
   )
   public final int method541(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4360;

      try {
         int var11;
         label69: {
            ++field8305;
            float var9 = (float)arg2 * this.field8379.field7401 + (float)arg0 * this.field8379.field7383 + (float)arg1 * this.field8379.field7386 + this.field8379.field7392;
            float var10 = (float)arg5 * this.field8379.field7401 + (float)arg3 * this.field8379.field7383 + (float)arg4 * this.field8379.field7386 + this.field8379.field7392;
            var11 = 0;
            if (!(var9 < (float)this.field8431) || !(var10 < (float)this.field8431)) {
               if (!((float)this.field8412 < var9) || !(var10 > (float)this.field8412)) {
                  break label69;
               }

               var11 |= 32;
               if (!var8) {
                  break label69;
               }
            }

            var11 |= 16;
         }

         label50: {
            int var12 = (int)(((float)arg2 * this.field8379.field7391 + (float)arg0 * this.field8379.field7399 + (float)arg1 * this.field8379.field7395 + this.field8379.field7393) * (float)this.field8473 / (float)arg6);
            int var13 = (int)(((float)arg5 * this.field8379.field7391 + (float)arg3 * this.field8379.field7399 + (float)arg4 * this.field8379.field7395 + this.field8379.field7393) * (float)this.field8473 / (float)arg6);
            if ((float)var12 < this.field8407 && this.field8407 > (float)var13) {
               var11 |= 1;
               if (!var8) {
                  break label50;
               }
            }

            if (this.field8477 < (float)var12 && (float)var13 > this.field8477) {
               var11 |= 2;
            }
         }

         int var14 = (int)(((float)arg2 * this.field8379.field7366 + (float)arg0 * this.field8379.field7365 + (float)arg1 * this.field8379.field7400 + this.field8379.field7402) * (float)this.field8496 / (float)arg6);
         int var15 = (int)(((float)arg5 * this.field8379.field7366 + (float)arg3 * this.field8379.field7365 + (float)arg4 * this.field8379.field7400 + this.field8379.field7402) * (float)this.field8496 / (float)arg6);
         if (this.field8446 > (float)var14 && this.field8446 > (float)var15) {
            var11 |= 4;
            if (!var8) {
               return var11;
            }
         }

         if (this.field8443 < (float)var14 && (float)var15 > this.field8443) {
            var11 |= 8;
         }

         return var11;
      } catch (RuntimeException var17) {
         throw class237.method1823(var17, field8505[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "q",
      descriptor = "(I)V"
   )
   private final void method4159(int arg0) {
      try {
         if (~this.field8455 != -3) {
            this.field8455 = 2;
            this.method4119((byte)124);
            this.method4103(94);
            this.field8385 &= -8;
         }

         ++field8172;
         if (arg0 != 1) {
            this.method545();
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[224] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "h",
      descriptor = "(II)V"
   )
   public final void method4160(int arg0, int arg1) {
      try {
         ++field8185;
         class599.field8803[1] = (float)class556.method3988(arg0, 65280) / 65280.0F;
         class599.field8803[arg1] = (float)class556.method3988(255, arg0) / 255.0F;
         class599.field8803[0] = (float)class556.method3988(arg0, 16711680) / 1.671168E7F;
         class599.field8803[3] = (float)(arg0 >>> 24) / 255.0F;
         OpenGL.glTexEnvfv(8960, 8705, class599.field8803, 0);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[16] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "JA",
      descriptor = "(IIIIII)I"
   )
   public final int method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var7 = client.field4360;

      try {
         ++field8251;
         int var8 = 0;
         float var9 = (float)arg2 * this.field8379.field7401 + (float)arg0 * this.field8379.field7383 + (float)arg1 * this.field8379.field7386 + this.field8379.field7392;
         if (var9 < 1.0F) {
            var9 = 1.0F;
         }

         float var10 = (float)arg5 * this.field8379.field7401 + (float)arg3 * this.field8379.field7383 + (float)arg4 * this.field8379.field7386 + this.field8379.field7392;
         if (var10 < 1.0F) {
            var10 = 1.0F;
         }

         label67: {
            if (var9 < (float)this.field8431 && (float)this.field8431 > var10) {
               var8 |= 16;
               if (!var7) {
                  break label67;
               }
            }

            if (var9 > (float)this.field8412 && var10 > (float)this.field8412) {
               var8 |= 32;
            }
         }

         label77: {
            int var11 = (int)(((float)arg2 * this.field8379.field7391 + (float)arg0 * this.field8379.field7399 + (float)arg1 * this.field8379.field7395 + this.field8379.field7393) * (float)this.field8473 / var9);
            int var12 = (int)(((float)arg5 * this.field8379.field7391 + (float)arg3 * this.field8379.field7399 + (float)arg4 * this.field8379.field7395 + this.field8379.field7393) * (float)this.field8473 / var10);
            if (!(this.field8407 > (float)var11) || !(this.field8407 > (float)var12)) {
               if (!((float)var11 > this.field8477) || !(this.field8477 < (float)var12)) {
                  break label77;
               }

               var8 |= 2;
               if (!var7) {
                  break label77;
               }
            }

            var8 |= 1;
         }

         int var13 = (int)(((float)arg2 * this.field8379.field7366 + (float)arg0 * this.field8379.field7365 + (float)arg1 * this.field8379.field7400 + this.field8379.field7402) * (float)this.field8496 / var9);
         int var14 = (int)(((float)arg5 * this.field8379.field7366 + (float)arg3 * this.field8379.field7365 + (float)arg4 * this.field8379.field7400 + this.field8379.field7402) * (float)this.field8496 / var10);
         if (this.field8446 > (float)var13 && (float)var14 < this.field8446) {
            var8 |= 4;
            if (!var7) {
               return var8;
            }
         }

         if (this.field8443 < (float)var13 && this.field8443 < (float)var14) {
            var8 |= 8;
         }

         return var8;
      } catch (RuntimeException var16) {
         throw class237.method1823(var16, field8505[46] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(Llc;Llc;FLlc;)Llc;"
   )
   public final class676 method540(class676 arg0, class676 arg1, float arg2, class676 arg3) {
      try {
         ++field8150;
         if (arg0 != null && arg1 != null && this.field8413 && this.field8445) {
            class625 var5 = null;
            class588 var6 = (class588)arg0;
            class588 var7 = (class588)arg1;
            class212 var8 = var6.method484(-10);
            class212 var9 = var7.method484(-10);
            if (var8 != null && var9 != null) {
               int var10 = ~var9.field3028 > ~var8.field3028 ? var8.field3028 : var9.field3028;
               if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class625) {
                  class625 var11 = (class625)arg3;
                  if (~var10 == ~var11.method4541(-65535)) {
                     var5 = var11;
                  }
               }

               if (var5 == null) {
                  var5 = new class625(this, var10);
               }

               if (var5.method4539(arg2, -109, var8, var9)) {
                  return var5;
               }
            }
         }

         return arg2 < 0.5F ? arg0 : arg1;
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field8505[91] + (arg0 != null ? field8505[7] : field8505[6]) + ',' + (arg1 != null ? field8505[7] : field8505[6]) + ',' + arg2 + ',' + (arg3 != null ? field8505[7] : field8505[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final synchronized void method4161(int arg0, boolean arg1) {
      try {
         ++field8318;
         if (arg1) {
            class713 var3 = new class713(arg0);
            this.field8373.method2930((byte)-112, var3);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8505[56] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "b",
      descriptor = "(BI)V"
   )
   public final synchronized void method4162(byte arg0, int arg1) {
      try {
         ++field8320;
         class428 var3 = new class428();
         if (arg0 >= 62) {
            var3.field6137 = (long)arg1;
            this.field8375.method2930((byte)-55, var3);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8505[176] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "m",
      descriptor = "(B)V"
   )
   public final void method4163(byte arg0) {
      try {
         OpenGL.glPopMatrix();
         ++field8199;
         if (arg0 <= 31) {
            this.field8463 = true;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[82] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method499(Canvas arg0, int arg1, int arg2) {
      try {
         ++field8157;
         if (this.field8170 == arg0) {
            throw new RuntimeException();
         } else if (!this.field8235.containsKey(arg0)) {
            if (!arg0.isShowing()) {
               throw new RuntimeException();
            } else {
               try {
                  Class var4 = Class.forName(field8505[30]);
                  Method var5 = var4.getMethod(field8505[29], Boolean.TYPE);
                  var5.invoke(arg0, Boolean.TRUE);
               } catch (Exception var9) {
               }

               long var6 = this.field8158.prepareSurface(arg0);
               if (~var6 == 0L) {
                  throw new RuntimeException();
               } else {
                  this.field8235.put(arg0, new Long(var6));
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field8505[31] + (arg0 != null ? field8505[7] : field8505[6]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "k",
      descriptor = "(I)V"
   )
   private final void method4164(int arg0) {
      try {
         label29: {
            if (!this.field8388 || this.field8390 < 0) {
               OpenGL.glDisable(2912);
               if (!client.field4360) {
                  break label29;
               }
            }

            OpenGL.glEnable(2912);
         }

         ++field8218;
         if (arg0 != 3998) {
            this.field8352 = -117;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[143] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(BLlfa;)V"
   )
   public final void method4165(byte arg0, class126 arg1) {
      try {
         if (this.field8486 != arg1) {
            if (this.field8449) {
               OpenGL.glBindBufferARB(34963, arg1.method1008((byte)105));
            }

            this.field8486 = arg1;
         }

         if (arg0 != -83) {
            this.field8448 = -89;
         }

         ++field8321;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[5] + arg0 + ',' + (arg1 != null ? field8505[7] : field8505[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(Lrha;I)V"
   )
   public final void method535(class234 arg0, int arg1) {
      try {
         this.field8347.method5225(arg0, arg1, (byte)-100, this);
         ++field8298;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[203] + (arg0 != null ? field8505[7] : field8505[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "f",
      descriptor = "(B)V"
   )
   private final void method4166(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ea",
      name = "c",
      descriptor = "(IIIIII)V"
   )
   public final void method608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field8315;
         float var7 = (float)arg0 + 0.35F;
         float var8 = (float)arg1 + 0.35F;
         float var9 = (float)arg2 + var7 - 1.0F;
         float var10 = (float)arg3 + var8 + -1.0F;
         this.method4179((byte)-48);
         this.method4098(arg5, -16757);
         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         if (this.field8441) {
            OpenGL.glDisable(32925);
         }

         OpenGL.glBegin(2);
         OpenGL.glVertex2f(var7, var8);
         OpenGL.glVertex2f(var7, var10);
         OpenGL.glVertex2f(var9, var10);
         OpenGL.glVertex2f(var9, var8);
         OpenGL.glEnd();
         if (this.field8441) {
            OpenGL.glEnable(32925);
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field8505[133] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "m",
      descriptor = "(I)I"
   )
   private final int method4167(int arg0) {
      try {
         ++field8283;
         this.field8467 = OpenGL.glGetString(7936).toLowerCase();
         int var2 = 0;
         this.field8428 = OpenGL.glGetString(7937).toLowerCase();
         if (this.field8467.indexOf(field8505[118]) != -1) {
            var2 |= 1;
         }

         if (this.field8467.indexOf(field8505[132]) != -1 || ~this.field8467.indexOf(field8505[124]) != 0) {
            var2 |= 1;
         }

         label57: {
            String var3 = OpenGL.glGetString(7938);
            String[] var4 = class527.method3811(-29619, var3.replace('.', ' '), ' ');
            if (~var4.length > -3) {
               var2 |= 4;
               if (!client.field4360) {
                  break label57;
               }
            }

            try {
               int var5 = class327.method2424((byte)-118, var4[0]);
               int var6 = class327.method2424((byte)-80, var4[1]);
               this.field8418 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
               var2 |= 4;
            }
         }

         if (this.field8418 < 12) {
            var2 |= 2;
         }

         if (!this.field8158.method4790(field8505[114])) {
            var2 |= 8;
         }

         if (!this.field8158.method4790(field8505[117])) {
            var2 |= 32;
         }

         int[] var7 = new int[1];
         OpenGL.glGetIntegerv(34018, var7, 0);
         this.field8422 = var7[0];
         OpenGL.glGetIntegerv(34929, var7, 0);
         this.field8457 = var7[0];
         OpenGL.glGetIntegerv(34930, var7, 0);
         this.field8450 = var7[0];
         if (this.field8422 < 2 || this.field8457 < 2 || ~this.field8450 > -3) {
            var2 |= 16;
         }

         this.field8469 = Stream.method5106();
         this.field8404 = this.field8158.arePbuffersAvailable();
         this.field8449 = this.field8158.method4790(field8505[129]);
         this.field8441 = this.field8158.method4790(field8505[122]);
         this.field8489 = this.field8158.method4790(field8505[115]);
         this.field8158.method4790(field8505[127]);
         this.field8456 = this.field8158.method4790(field8505[131]);
         this.field8482 = this.field8158.method4790(field8505[126]);
         this.field8483 = this.field8158.method4790(field8505[123]);
         this.field8397 = this.field8158.method4790(field8505[128]);
         this.field8413 = this.field8158.method4790(field8505[125]);
         this.field8436 = this.field8158.method4790(field8505[120]);
         this.field8470 = false;
         this.field8445 = this.field8158.method4790(field8505[119]);
         if (arg0 >= -72) {
            return 41;
         } else {
            this.field8447 = this.field8158.method4790(field8505[121]);
            this.field8411 = this.field8158.method4790(field8505[113]);
            this.field8495 = this.field8447 & this.field8411;
            this.field8419 = class590.field8700.startsWith(field8505[116]);
            OpenGL.glGetFloatv(2834, class599.field8803, 0);
            this.field8459 = class599.field8803[0];
            this.field8429 = class599.field8803[1];
            return ~var2 == -1 ? 0 : var2;
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field8505[130] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "A",
      descriptor = "(I)V"
   )
   private final void method4168(int arg0) {
      try {
         ++field8177;
         if (arg0 == -4) {
            if (this.field8401 >= this.field8420 && this.field8462 >= this.field8484) {
               OpenGL.glScissor(this.field8420 + this.field8394, this.field8451 + this.field8264 - this.field8462, this.field8401 - this.field8420, this.field8462 - this.field8484);
            } else {
               OpenGL.glScissor(0, 0, 0, 0);
            }
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[228] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "C",
      descriptor = "(I)V"
   )
   private final void method4169(int arg0) {
      try {
         if (arg0 != 13195) {
            this.field8381 = false;
         }

         ++field8144;
         this.field8158.method4792();
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[205] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(Lio;IIII)Lka;"
   )
   public final class500 method555(class464 arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field8219;
         return new class747(this, arg0, arg1, arg3, arg4, arg2);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field8505[54] + (arg0 != null ? field8505[7] : field8505[6]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "T",
      descriptor = "(IIII)V"
   )
   public final void method547(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg3 < this.field8462) {
            this.field8462 = arg3;
         }

         if (this.field8484 < arg1) {
            this.field8484 = arg1;
         }

         if (~arg2 > ~this.field8401) {
            this.field8401 = arg2;
         }

         if (~this.field8420 > ~arg0) {
            this.field8420 = arg0;
         }

         ++field8222;
         OpenGL.glEnable(3089);
         this.method4149(50);
         this.method4168(-4);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8505[227] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "m",
      descriptor = "()V"
   )
   public final void method537() {
      try {
         OpenGL.glFinish();
         ++field8268;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8505[196] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(Lru;[Lmha;Z)Lda;"
   )
   public final class67 method502(class206 arg0, class439[] arg1, boolean arg2) {
      try {
         ++field8196;
         return new class479(this, arg0, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8505[66] + (arg0 != null ? field8505[7] : field8505[6]) + ',' + (arg1 != null ? field8505[7] : field8505[6]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "h",
      descriptor = "(I)V"
   )
   public final void method525(int arg0) {
      try {
         ++field8275;
         if (~arg0 != -2) {
            throw new IllegalArgumentException("");
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[136] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "Q",
      descriptor = "(IIIIII[BII)V"
   )
   public final void method610(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
      try {
         float var10;
         float var11;
         label36: {
            ++field8297;
            if (this.field8430 == null || ~this.field8430.field8841 > ~arg2 || arg3 > this.field8430.field8833) {
               this.field8430 = class259.method1972(arg6, (byte)-81, arg2, arg3, this, 6406, false, 6406);
               this.field8430.method4372(false, false, (byte)81);
               var10 = this.field8430.field1064;
               var11 = this.field8430.field1058;
               if (!client.field4360) {
                  break label36;
               }
            }

            this.field8430.method4375(false, arg2, 0, 0, arg6, 6406, 3317, 0, arg3, 0);
            var11 = (float)arg3 * this.field8430.field1058 / (float)this.field8430.field8833;
            var10 = (float)arg2 * this.field8430.field1064 / (float)this.field8430.field8841;
         }

         this.method4131(-2);
         this.method4107(122, this.field8430);
         this.method4098(arg8, -16757);
         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         this.method4160(arg5, 2);
         this.method4117(34165, 34165, -1);
         this.method4096(0, (byte)15, 34166, 768);
         this.method4096(2, (byte)15, 5890, 770);
         this.method4141(false, 0, 770, 34166);
         this.method4141(false, 2, 770, 5890);
         float var12 = (float)arg0;
         float var13 = (float)arg1;
         float var14 = (float)arg2 + var12;
         OpenGL.glBegin(7);
         float var15 = (float)arg3 + var13;
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2f(var12, var13);
         OpenGL.glTexCoord2f(0.0F, var10);
         OpenGL.glVertex2f(var12, var15);
         OpenGL.glTexCoord2f(var11, var10);
         OpenGL.glVertex2f(var14, var15);
         OpenGL.glTexCoord2f(var11, 0.0F);
         OpenGL.glVertex2f(var14, var13);
         OpenGL.glEnd();
         this.method4096(0, (byte)15, 5890, 768);
         this.method4096(2, (byte)15, 34166, 770);
         this.method4141(false, 0, 770, 5890);
         this.method4141(false, 2, 770, 34166);
      } catch (RuntimeException var17) {
         throw class237.method1823(var17, field8505[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field8505[7] : field8505[6]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "o",
      descriptor = "(I)V"
   )
   private final void method4170(int arg0) {
      try {
         this.field8476 = (float)(-this.field8409 + this.field8412) + -this.field8426;
         ++field8193;
         this.field8392 = this.field8476 - (float)this.field8390 * this.field8488;
         if ((float)this.field8431 > this.field8392) {
            this.field8392 = (float)this.field8431;
         }

         OpenGL.glFogf(arg0, this.field8392);
         OpenGL.glFogf(2916, this.field8476);
         class599.field8803[2] = (float)class556.method3988(255, this.field8433) / 255.0F;
         class599.field8803[1] = (float)class556.method3988(this.field8433, 65280) / 65280.0F;
         class599.field8803[0] = (float)class556.method3988(this.field8433, 16711680) / 1.671168E7F;
         OpenGL.glFogfv(2918, class599.field8803, 0);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[68] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "n",
      descriptor = "(I)Lwfa;"
   )
   public final class212 method4171(int arg0) {
      try {
         if (arg0 != -5689) {
            return null;
         } else {
            ++field8205;
            return this.field8468 != null ? this.field8468.method484(arg0 ^ 5681) : null;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[100] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "p",
      descriptor = "(I)V"
   )
   public final void method4172(int arg0) {
      try {
         if (this.field8385 != 8) {
            this.method4159(1);
            this.method4106((byte)-53, true);
            this.method4180((byte)107, true);
            this.method4148(true, (byte)-64);
            this.method4098(1, -16757);
            this.field8385 = 8;
         }

         if (arg0 == 2) {
            ++field8309;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[135] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "v",
      descriptor = "(I)V"
   )
   public final void method4173(int arg0) {
      try {
         if (~this.field8385 != -5) {
            this.method4130(-107);
            this.method4106((byte)126, false);
            this.method4124(-72, false);
            this.method4180((byte)115, false);
            this.method4148(false, (byte)-64);
            this.method4105(4, -2);
            this.method4098(1, -16757);
            this.field8385 = 4;
         }

         if (arg0 != 4) {
            this.method4143((byte)-60, (class507)null);
         }

         ++field8316;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[65] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V"
   )
   public final void method550(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class525 {
      try {
         this.method560(arg2, arg3);
         ++field8173;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8505[179] + (arg0 != null ? field8505[7] : field8505[6]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "B",
      descriptor = "(I)V"
   )
   private final void method4174(int arg0) {
      try {
         ++field8267;
         if (~this.field8455 != -4) {
            this.field8455 = 3;
            this.method4155(arg0 + -28304);
            this.method4103(117);
            this.field8385 &= -8;
         }

         if (arg0 != 34192) {
            this.method613((Canvas)null);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[104] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(I[B)[B"
   )
   public static final byte[] method4175(int arg0, byte[] arg1) {
      try {
         ++field8284;
         class147 var2 = new class147(arg1);
         if (arg0 != 1) {
            return null;
         } else {
            int var3 = var2.method1143(-15465);
            int var4 = var2.method1164(arg0 + 19692);
            if (var4 < 0 || ~class134.field1707 != -1 && ~class134.field1707 > ~var4) {
               throw new RuntimeException();
            } else if (var3 == 0) {
               byte[] var8 = new byte[var4];
               var2.method1191(-5766, var4, var8, 0);
               return var8;
            } else {
               int var5 = var2.method1164(19693);
               if (~var5 > -1 || ~class134.field1707 != -1 && var5 > class134.field1707) {
                  throw new RuntimeException();
               } else {
                  byte[] var6 = new byte[var5];
                  if (var3 != 1) {
                     class343 var7 = class132.field1694;
                     synchronized(class132.field1694) {
                        class132.field1694.method2517(var2, (byte)110, var6);
                     }
                  } else {
                     class632.method4578(var6, var5, arg1, var4, 9);
                  }

                  return var6;
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field8505[178] + arg0 + ',' + (arg1 != null ? field8505[7] : field8505[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "i",
      descriptor = "(B)V"
   )
   public static final void method4176(byte arg0) {
      try {
         class157.field2246.method715(true);
         ++field8197;
         if (arg0 != -22) {
            method4175(-60, (byte[])null);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8505[103] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "P",
      descriptor = "(IIIII)V"
   )
   public final void method520(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.method4179((byte)-48);
         ++field8294;
         this.method4098(arg4, -16757);
         float var6 = (float)arg0 + 0.35F;
         OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
         float var7 = (float)arg1 + 0.35F;
         OpenGL.glBegin(1);
         OpenGL.glVertex2f(var6, var7);
         OpenGL.glVertex2f(var6, (float)arg2 + var7);
         OpenGL.glEnd();
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field8505[211] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "([BIZII)Llfa;"
   )
   public final class126 method4177(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4) {
      try {
         if (arg3 < 52) {
            this.field8428 = null;
         }

         ++field8295;
         return (class126)(!this.field8449 || arg2 && !this.field8481 ? new class404(this, arg1, arg0, arg4) : new class666(this, arg1, arg0, arg4, arg2));
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field8505[64] + (arg0 != null ? field8505[7] : field8505[6]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method531(int arg0, int arg1) {
      try {
         ++field8322;
         return arg1 ^ arg1 & arg0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[25] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "U",
      descriptor = "(IIIII)V"
   )
   public final void method576(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.method4179((byte)-48);
         ++field8289;
         this.method4098(arg4, -16757);
         float var6 = (float)arg0 + 0.35F;
         float var7 = (float)arg1 + 0.35F;
         OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
         OpenGL.glBegin(1);
         OpenGL.glVertex2f(var6, var7);
         OpenGL.glVertex2f((float)arg2 + var6, var7);
         OpenGL.glEnd();
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field8505[215] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(ILbv;)V"
   )
   public final void method4178(int arg0, class324 arg1) {
      try {
         ++field8140;
         if (~this.field8362 <= -1 && this.field8366[this.field8362] == arg1) {
            this.field8366[this.field8362--] = null;
            int var3 = 61 % ((17 - arg0) / 53);
            arg1.method2402(false);
            if (this.field8362 < 0) {
               this.field8365 = null;
            } else {
               this.field8365 = this.field8366[this.field8362];
               this.field8365.method2404(125);
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8505[156] + arg0 + ',' + (arg1 != null ? field8505[7] : field8505[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "s",
      descriptor = "()Z"
   )
   public final boolean method606() {
      try {
         ++field8279;
         if (this.field8337 != null) {
            if (!this.field8337.method2641((byte)97)) {
               if (!this.field8342.method1270(-84, this.field8337)) {
                  return false;
               }

               this.field8339.method1309(false);
            }

            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8505[144] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "c",
      descriptor = "(B)V"
   )
   private final void method4179(byte arg0) {
      try {
         ++field8189;
         if (~this.field8385 != -2) {
            this.method4130(84);
            this.method4106((byte)-35, false);
            this.method4124(110, false);
            this.method4180((byte)120, false);
            this.method4148(false, (byte)-64);
            this.method4107(arg0 + -69, (class486)null);
            this.method4105(arg0 + 52, -2);
            this.method4134(1, 2);
            this.field8385 = 1;
         }

         if (arg0 != -48) {
            this.field8425 = null;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8505[199] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(IIIIIF)Lmn;"
   )
   public final class389 method509(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      try {
         ++field8182;
         return new class254(arg0, arg1, arg2, arg3, arg4, arg5);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field8505[99] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "b",
      descriptor = "(BZ)V"
   )
   public final void method4180(byte arg0, boolean arg1) {
      try {
         if (this.field8381 == !arg1) {
            label27: {
               if (!arg1) {
                  OpenGL.glDisable(2929);
                  if (!client.field4360) {
                     break label27;
                  }
               }

               OpenGL.glEnable(2929);
            }

            this.field8385 &= -32;
            this.field8381 = arg1;
         }

         ++field8152;
         if (arg0 <= 102) {
            this.method570(-41);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8505[166] + arg0 + ',' + arg1 + ')');
      }
   }

   static {
      new class475("", 76);
      field8327 = -1;
   }

   @OriginalMember(
      owner = "client!ea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4181(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4182(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 111;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
