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

@OriginalClass("client!c")
public class class652 extends class610 {
   @OriginalMember(
      owner = "client!c",
      name = "Kf",
      descriptor = "Ljava/util/Hashtable;"
   )
   private Hashtable field9564;
   @OriginalMember(
      owner = "client!c",
      name = "Ac",
      descriptor = "I"
   )
   public int field9610;
   @OriginalMember(
      owner = "client!c",
      name = "jf",
      descriptor = "Lwha;"
   )
   private class649 field9604;
   @OriginalMember(
      owner = "client!c",
      name = "od",
      descriptor = "Lie;"
   )
   private class167 field9612;
   @OriginalMember(
      owner = "client!c",
      name = "Bb",
      descriptor = "Lie;"
   )
   public class167 field9613;
   @OriginalMember(
      owner = "client!c",
      name = "Xd",
      descriptor = "I"
   )
   public int field9614;
   @OriginalMember(
      owner = "client!c",
      name = "hb",
      descriptor = "Z"
   )
   private boolean field9617;
   @OriginalMember(
      owner = "client!c",
      name = "Bd",
      descriptor = "I"
   )
   public int field9620;
   @OriginalMember(
      owner = "client!c",
      name = "og",
      descriptor = "Lsn;"
   )
   private class675 field9616;
   @OriginalMember(
      owner = "client!c",
      name = "uf",
      descriptor = "I"
   )
   private int field9624;
   @OriginalMember(
      owner = "client!c",
      name = "rh",
      descriptor = "[Len;"
   )
   private class447[] field9626;
   @OriginalMember(
      owner = "client!c",
      name = "ne",
      descriptor = "I"
   )
   private int field9627;
   @OriginalMember(
      owner = "client!c",
      name = "td",
      descriptor = "I"
   )
   private int field9625;
   @OriginalMember(
      owner = "client!c",
      name = "Dg",
      descriptor = "[Len;"
   )
   private class447[] field9622;
   @OriginalMember(
      owner = "client!c",
      name = "Kc",
      descriptor = "[Len;"
   )
   private class447[] field9629;
   @OriginalMember(
      owner = "client!c",
      name = "Kg",
      descriptor = "Lsn;"
   )
   private class675 field9633;
   @OriginalMember(
      owner = "client!c",
      name = "ob",
      descriptor = "Lsn;"
   )
   private class675 field9635;
   @OriginalMember(
      owner = "client!c",
      name = "Md",
      descriptor = "Lsn;"
   )
   private class675 field9636;
   @OriginalMember(
      owner = "client!c",
      name = "Sb",
      descriptor = "Lsn;"
   )
   private class675 field9637;
   @OriginalMember(
      owner = "client!c",
      name = "hf",
      descriptor = "Lsn;"
   )
   private class675 field9638;
   @OriginalMember(
      owner = "client!c",
      name = "Tg",
      descriptor = "Lsn;"
   )
   private class675 field9639;
   @OriginalMember(
      owner = "client!c",
      name = "F",
      descriptor = "Lsn;"
   )
   private class675 field9640;
   @OriginalMember(
      owner = "client!c",
      name = "de",
      descriptor = "Lie;"
   )
   public class167 field9647;
   @OriginalMember(
      owner = "client!c",
      name = "nc",
      descriptor = "Lie;"
   )
   public class167 field9650;
   @OriginalMember(
      owner = "client!c",
      name = "Qb",
      descriptor = "Lie;"
   )
   public class167 field9651;
   @OriginalMember(
      owner = "client!c",
      name = "If",
      descriptor = "I"
   )
   private int field9664;
   @OriginalMember(
      owner = "client!c",
      name = "Ff",
      descriptor = "I"
   )
   private int field9668;
   @OriginalMember(
      owner = "client!c",
      name = "lc",
      descriptor = "F"
   )
   public float field9655;
   @OriginalMember(
      owner = "client!c",
      name = "Ce",
      descriptor = "I"
   )
   private int field9673;
   @OriginalMember(
      owner = "client!c",
      name = "th",
      descriptor = "I"
   )
   public int field9663;
   @OriginalMember(
      owner = "client!c",
      name = "le",
      descriptor = "Z"
   )
   private boolean field9659;
   @OriginalMember(
      owner = "client!c",
      name = "gh",
      descriptor = "F"
   )
   public float field9676;
   @OriginalMember(
      owner = "client!c",
      name = "hc",
      descriptor = "I"
   )
   public int field9690;
   @OriginalMember(
      owner = "client!c",
      name = "Ae",
      descriptor = "F"
   )
   private float field9653;
   @OriginalMember(
      owner = "client!c",
      name = "Lg",
      descriptor = "F"
   )
   private float field9715;
   @OriginalMember(
      owner = "client!c",
      name = "Tc",
      descriptor = "F"
   )
   public float field9703;
   @OriginalMember(
      owner = "client!c",
      name = "Kb",
      descriptor = "I"
   )
   public int field9717;
   @OriginalMember(
      owner = "client!c",
      name = "df",
      descriptor = "I"
   )
   public int field9706;
   @OriginalMember(
      owner = "client!c",
      name = "ug",
      descriptor = "F"
   )
   private float field9688;
   @OriginalMember(
      owner = "client!c",
      name = "Re",
      descriptor = "F"
   )
   private float field9678;
   @OriginalMember(
      owner = "client!c",
      name = "ae",
      descriptor = "I"
   )
   public int field9705;
   @OriginalMember(
      owner = "client!c",
      name = "ig",
      descriptor = "I"
   )
   private int field9730;
   @OriginalMember(
      owner = "client!c",
      name = "E",
      descriptor = "[F"
   )
   private float[] field9698;
   @OriginalMember(
      owner = "client!c",
      name = "jc",
      descriptor = "I"
   )
   private int field9723;
   @OriginalMember(
      owner = "client!c",
      name = "Ue",
      descriptor = "[F"
   )
   private float[] field9721;
   @OriginalMember(
      owner = "client!c",
      name = "Pe",
      descriptor = "Z"
   )
   private boolean field9712;
   @OriginalMember(
      owner = "client!c",
      name = "We",
      descriptor = "I"
   )
   private int field9656;
   @OriginalMember(
      owner = "client!c",
      name = "kg",
      descriptor = "I"
   )
   public int field9701;
   @OriginalMember(
      owner = "client!c",
      name = "pd",
      descriptor = "I"
   )
   public int field9686;
   @OriginalMember(
      owner = "client!c",
      name = "mg",
      descriptor = "[F"
   )
   private float[] field9739;
   @OriginalMember(
      owner = "client!c",
      name = "wc",
      descriptor = "[Llja;"
   )
   private class404[] field9693;
   @OriginalMember(
      owner = "client!c",
      name = "Ig",
      descriptor = "[F"
   )
   public float[] field9724;
   @OriginalMember(
      owner = "client!c",
      name = "Lb",
      descriptor = "I"
   )
   public int field9728;
   @OriginalMember(
      owner = "client!c",
      name = "xg",
      descriptor = "[F"
   )
   private float[] field9714;
   @OriginalMember(
      owner = "client!c",
      name = "xd",
      descriptor = "I"
   )
   private int field9680;
   @OriginalMember(
      owner = "client!c",
      name = "sb",
      descriptor = "I"
   )
   public int field9713;
   @OriginalMember(
      owner = "client!c",
      name = "Fg",
      descriptor = "F"
   )
   public float field9749;
   @OriginalMember(
      owner = "client!c",
      name = "jb",
      descriptor = "I"
   )
   public int field9745;
   @OriginalMember(
      owner = "client!c",
      name = "pc",
      descriptor = "F"
   )
   private float field9740;
   @OriginalMember(
      owner = "client!c",
      name = "eh",
      descriptor = "I"
   )
   private int field9707;
   @OriginalMember(
      owner = "client!c",
      name = "id",
      descriptor = "I"
   )
   public int field9753;
   @OriginalMember(
      owner = "client!c",
      name = "Ab",
      descriptor = "I"
   )
   private int field9743;
   @OriginalMember(
      owner = "client!c",
      name = "ce",
      descriptor = "F"
   )
   public float field9734;
   @OriginalMember(
      owner = "client!c",
      name = "zc",
      descriptor = "F"
   )
   public float field9761;
   @OriginalMember(
      owner = "client!c",
      name = "Zc",
      descriptor = "I"
   )
   private int field9759;
   @OriginalMember(
      owner = "client!c",
      name = "sh",
      descriptor = "F"
   )
   public float field9762;
   @OriginalMember(
      owner = "client!c",
      name = "ph",
      descriptor = "Lfc;"
   )
   public class37 field9720;
   @OriginalMember(
      owner = "client!c",
      name = "Le",
      descriptor = "[I"
   )
   public int[] field9766;
   @OriginalMember(
      owner = "client!c",
      name = "Gb",
      descriptor = "[I"
   )
   public int[] field9763;
   @OriginalMember(
      owner = "client!c",
      name = "N",
      descriptor = "[I"
   )
   public int[] field9768;
   @OriginalMember(
      owner = "client!c",
      name = "lg",
      descriptor = "[B"
   )
   public byte[] field9767;
   @OriginalMember(
      owner = "client!c",
      name = "fe",
      descriptor = "I"
   )
   public int field9605;
   @OriginalMember(
      owner = "client!c",
      name = "tb",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field9461;
   @OriginalMember(
      owner = "client!c",
      name = "yg",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field9460;
   @OriginalMember(
      owner = "client!c",
      name = "rc",
      descriptor = "Ljaggl/OpenGL;"
   )
   private OpenGL field9485;
   @OriginalMember(
      owner = "client!c",
      name = "M",
      descriptor = "J"
   )
   private long field9592;
   @OriginalMember(
      owner = "client!c",
      name = "De",
      descriptor = "J"
   )
   private long field9581;
   @OriginalMember(
      owner = "client!c",
      name = "wd",
      descriptor = "Z"
   )
   public boolean field9695;
   @OriginalMember(
      owner = "client!c",
      name = "Zd",
      descriptor = "I"
   )
   public int field9738;
   @OriginalMember(
      owner = "client!c",
      name = "Xf",
      descriptor = "Ljava/lang/String;"
   )
   private String field9757;
   @OriginalMember(
      owner = "client!c",
      name = "Og",
      descriptor = "Z"
   )
   public boolean field9709;
   @OriginalMember(
      owner = "client!c",
      name = "pb",
      descriptor = "Z"
   )
   private boolean field9760;
   @OriginalMember(
      owner = "client!c",
      name = "bd",
      descriptor = "Z"
   )
   public boolean field9679;
   @OriginalMember(
      owner = "client!c",
      name = "lh",
      descriptor = "Z"
   )
   public boolean field9700;
   @OriginalMember(
      owner = "client!c",
      name = "kd",
      descriptor = "Z"
   )
   private boolean field9722;
   @OriginalMember(
      owner = "client!c",
      name = "ih",
      descriptor = "Z"
   )
   public boolean field9718;
   @OriginalMember(
      owner = "client!c",
      name = "nh",
      descriptor = "Ljava/lang/String;"
   )
   private String field9748;
   @OriginalMember(
      owner = "client!c",
      name = "te",
      descriptor = "Z"
   )
   public boolean field9737;
   @OriginalMember(
      owner = "client!c",
      name = "Wd",
      descriptor = "Z"
   )
   private boolean field9665;
   @OriginalMember(
      owner = "client!c",
      name = "Wg",
      descriptor = "Ljs;"
   )
   private class25 field9603;
   @OriginalMember(
      owner = "client!c",
      name = "fh",
      descriptor = "Loea;"
   )
   public class758 field9619;
   @OriginalMember(
      owner = "client!c",
      name = "gc",
      descriptor = "Lwg;"
   )
   private class583 field9608;
   @OriginalMember(
      owner = "client!c",
      name = "eb",
      descriptor = "Lsb;"
   )
   private class445 field9602;
   @OriginalMember(
      owner = "client!c",
      name = "qb",
      descriptor = "Ljha;"
   )
   private class705 field9609;
   @OriginalMember(
      owner = "client!c",
      name = "Ch",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9769 = new String[]{method4815(method4814("\u0014\u0005@[~")), method4815(method4814("\u0014\u0005[\\~")), method4815(method4814("\u0014\u0005K6")), method4815(method4814("\u0019^fr")), method4815(method4814("\f\u0005$0+")), method4815(method4814("\u0014\u0005XX~")), method4815(method4814("\u0014\u0005z\u007f~")), method4815(method4814("\u0014\u0005YY~")), method4815(method4814("\u0014\u0005C_~")), method4815(method4814("\u0014\u0005\\X~")), method4815(method4814("\u0014\u0005LY~")), method4815(method4814("\u0014\u0005F[~")), method4815(method4814("\u0014\u0005]]~")), method4815(method4814("\u0014\u0005N]~")), method4815(method4814("\u0014\u0005I\\~")), method4815(method4814("\u001dJ|\u007fx\u0016\\~0\u0015\u0016E|\u007f%")), method4815(method4814("\u0004N~W1\u0019Dx{\u0004\u0012[kw8\u0003")), method4815(method4814("\u0014\u0005M]~")), method4815(method4814("\u0014\u0005BX~")), method4815(method4814("\u0014\u0005Y6")), method4815(method4814("\u0014\u0005L]~")), method4815(method4814("\u0014\u0005MY~")), method4815(method4814("\u0014\u0005LZ~")), method4815(method4814("\u0014\u0005GY~")), method4815(method4814("\u0014\u0005]X~")), method4815(method4814("\u0014\u0005O_~")), method4815(method4814("\u0014\u0005Y\\~")), method4815(method4814("\u0014\u0005I[~")), method4815(method4814("\u0014\u0005OZ~")), method4815(method4814("\u0014\u0005H\\~")), method4815(method4814("\u0014\u0005^[~")), method4815(method4814("\u0014\u0005[Y~")), method4815(method4814("\u0014\u0005l6")), method4815(method4814("\u0014\u0005x6")), method4815(method4814("\u0014\u0005[Z~")), method4815(method4814("\u0014\u0005N\\~")), method4815(method4814("\u0014\u0005]\\~")), method4815(method4814("\u0014\u0005X\\~")), method4815(method4814("\u0014\u0005ZX~")), method4815(method4814("\u0014\u0005N6")), method4815(method4814("\u0014\u0005\\[~")), method4815(method4814("\u0014\u0005[6")), method4815(method4814("\u0014\u0005KY~")), method4815(method4814("\u0014\u0005HZ~")), method4815(method4814("\u0014\u0005AZ~")), method4815(method4814("\u0014\u0005[[~")), method4815(method4814("\u0014\u0005\\6")), method4815(method4814("\u0014\u0005LX~")), method4815(method4814("\u0014\u0005FZ~")), method4815(method4814("\u0014\u0005k\u007f~")), method4815(method4814("\u0014\u0005A_~")), method4815(method4814("\u0014\u0005]Z~")), method4815(method4814("\u0014\u0005I6")), method4815(method4814("\u0014\u0005G]~")), method4815(method4814("\u0014\u0005F6")), method4815(method4814("\u0014\u0005K]~")), method4815(method4814("\u0014\u0005__~")), method4815(method4814("\u0014\u0005@\\~")), method4815(method4814("\u0014\u0005G6")), method4815(method4814("\u0014\u0005A\\~")), method4815(method4814("\u0014\u0005MX~")), method4815(method4814("\u0014\u0005_Z~")), method4815(method4814("\u0014\u0005F_~")), method4815(method4814("\u0014\u0005EX~")), method4815(method4814("4Jh|7\u0010N")), method4815(method4814("\u0014\u0005K\\~")), method4815(method4814("\u0014\u0005Y_~")), method4815(method4814("\u0014\u0005E\\~")), method4815(method4814("\u0014\u0005O[~")), method4815(method4814("\u0014\u0005B[~")), method4815(method4814("\u0014\u0005][~")), method4815(method4814("\u0014\u0005f\u007f~")), method4815(method4814("\u0014\u0005P_~")), method4815(method4814("\u0014\u0005O]~")), method4815(method4814("\u0014\u0005G\\~")), method4815(method4814("\u0014\u0005GX~")), method4815(method4814("\u0014\u0005H_~")), method4815(method4814("\u0014\u0005[]~")), method4815(method4814("\u0014\u0005FX~")), method4815(method4814("\u0014\u0005_[~")), method4815(method4814("\u0014\u0005@Z~")), method4815(method4814("\u0014\u0005GZ~")), method4815(method4814("\u0014\u0005^Y~")), method4815(method4814("\u0014\u0005c6")), method4815(method4814("\u0014\u0005XZ~")), method4815(method4814("\u0014\u0005L[~")), method4815(method4814("\u0014\u0005I]~")), method4815(method4814("\u0014\u0005E]~")), method4815(method4814("\u0014\u0005YX~")), method4815(method4814("\u0014\u0005^]~")), method4815(method4814("\u0014\u0005M[~")), method4815(method4814("\u0014\u0005L6")), method4815(method4814("\u0014\u0005HX~")), method4815(method4814("\u0014\u0005M6")), method4815(method4814("\u0014\u0005@6")), method4815(method4814("\u0014\u0005BY~")), method4815(method4814("\u0014\u0005B_~")), method4815(method4814("\u0014\u0005DZ~")), method4815(method4814("\u0014\u0005B]~")), method4815(method4814("\u0014\u0005@Y~")), method4815(method4814("\u0014\u0005IY~")), method4815(method4814("\u0014\u0005ZZ~")), method4815(method4814("\u0014\u0005C[~")), method4815(method4814("\u0014\u0005R_~")), method4815(method4814("\u0014\u0005_6")), method4815(method4814("\u0014\u0005_X~")), method4815(method4814("\u0014\u0005^Z~")), method4815(method4814("\u0014\u0005\\\\~")), method4815(method4814("\u0014\u0005M_~")), method4815(method4814("\u0014\u0005H6")), method4815(method4814("\u0014\u0005\\_~")), method4815(method4814("\u0014\u0005Z]~")), method4815(method4814("\u0014\u0005x\u007f~")), method4815(method4814("\u0014\u0005F\\~")), method4815(method4814("\u0014\u0005C\\~")), method4815(method4814("\u0014\u0005D\\~")), method4815(method4814("\u0014\u0005^_~")), method4815(method4814("\u0014\u0005\\Z~")), method4815(method4814("\u0014\u0005KV~")), method4815(method4814("\u0014\u0005E6")), method4815(method4814("\u0014\u0005B\\~")), method4815(method4814("\u0014\u0005X6")), method4815(method4814("\u0014\u0005C]~")), method4815(method4814("\u0014\u0005Z_~")), method4815(method4814("\u0014\u0005p\u007f~")), method4815(method4814("\u0014\u0005A[~")), method4815(method4814("\u0014\u0005Z6")), method4815(method4814("\u0014\u0005HV~")), method4815(method4814("\u0014\u0005YZ~")), method4815(method4814("\u0014\u0005r\u007f~")), method4815(method4814("\u0014\u0005C6")), method4815(method4814("\u0014\u0005S6")), method4815(method4814("\u0014\u0005[_~")), method4815(method4814("\u0004\u0018*y$\u0016[bw5\u0004")), method4815(method4814("\u001dJir?\u0015")), method4815(method4814("\u001fO")), method4815(method4814("\u001eE~{:")), method4815(method4814("\u0005Jn{9\u0019")), method4815(method4814("\u0014\u00056w8\u001e_46")), method4815(method4814("\u001dJmy:")), method4815(method4814("0gU_\u00045tb\u007f:\u0011tlr9\u0016_Un?\u000fNf")), method4815(method4814("\u0014\u0005IX~")), method4815(method4814("\u0014\u0005ZY~")), method4815(method4814("\u0014\u0005n\u007f~")), method4815(method4814("\u0014\u0005EZ~")), method4815(method4814("\u0014\u0005]Y~")), method4815(method4814("\u0014\u0005X[~")), method4815(method4814("\u0014\u0005N[~")), method4815(method4814("\u0014\u0005[X~")), method4815(method4814("\u0014\u0005BZ~")), method4815(method4814("\u0014\u0005X]~")), method4815(method4814("\u0014\u0005NX~")), method4815(method4814("\u0014\u0005DY~")), method4815(method4814("\u0014\u0005@X~")), method4815(method4814("\u0014\u0005D]~")), method4815(method4814("0gU_\u00045t|{$\u0003NrA&\u0005Dml7\u001a")), method4815(method4814("0gU_\u00045tll7\u0010Fop\"(Xb\u007f2\u0012Y")), method4815(method4814("0gU_\u00045tgk:\u0003By\u007f;\u0007Go")), method4815(method4814("0gU_\u00045t~{.\u0003^x{\t\u0012E|A5\u0018Fhw8\u0012")), method4815(method4814("0gU[\u000e#tll7\u001aNhk0\u0011NxA4\u001bB~")), method4815(method4814("\u001aNy\u007f")), method4815(method4814("0gU_\u00045tll7\u0010Fop\"([xq1\u0005Jg")), method4815(method4814("0gU_\u00045t|{$\u0003NrA4\u0002Ml{$(Dht3\u0014_")), method4815(method4814("\u0015Yc\u007f8W[kk:")), method4815(method4814("0gU_\u00045t~{.\u0003^x{\t\u0014^h{\t\u001aJz")), method4815(method4814("0gU_\u00045tgk:\u0003B~{.\u0003^x{")), method4815(method4814("\u0014\u0005NZ~")), method4815(method4814("0gU[\u000e#t~{.\u0003^x{e3")), method4815(method4814("0gU[\u000e#tll7\u001aNhk0\u0011NxA;\u0002G~w%\u0016Fzr3")), method4815(method4814("0gU_\u00045t~{.\u0003^x{\t\u0011Ge\u007f\"")), method4815(method4814("0gU_\u00045t~{.\u0003^x{\t\u0005Nij7\u0019Lf{")), method4815(method4814("0gU_\u00045t|{$\u0003NrA%\u001fJn{$")), method4815(method4814("\u001aJi")), method4815(method4814("\u001aBil9\u0004Dlj")), method4815(method4814("0gU[\u000e#tll7\u001aNhk0\u0011NxA9\u0015Ao}\"")), method4815(method4814("\u0014\u0005Y]~")), method4815(method4814("\u0014\u0005CZ~")), method4815(method4814("\u0014\u0005^\\~")), method4815(method4814("\u0014\u0005h6")), method4815(method4814("\u0014\u0005Z[~")), method4815(method4814("\u0014\u0005]6")), method4815(method4814("\u0014\u0005DX~")), method4815(method4814("\u0014\u0005H[~")), method4815(method4814("\u0014\u0005NY~")), method4815(method4814("\u0014\u0005D[~")), method4815(method4814("\u0014\u0005MZ~")), method4815(method4814("\u0014\u0005EY~")), method4815(method4814("\u0014\u0005\\Y~")), method4815(method4814("\u0014\u0005s\u007f~")), method4815(method4814("\u0014\u0005CX~")), method4815(method4814("\u0014\u0005Z\\~")), method4815(method4814("\u0014\u0005AX~")), method4815(method4814("\u0014\u0005AY~")), method4815(method4814("\u0014\u0005M\\~")), method4815(method4814("\u0014\u0005F]~")), method4815(method4814("\u0014\u0005OX~")), method4815(method4814("\u0014\u0005HY~")), method4815(method4814("\u0014\u0005B6")), method4815(method4814("\u0014\u0005d\u007f~")), method4815(method4814("\u0014\u0005X_~")), method4815(method4814("\u0014\u0005_\\~")), method4815(method4814("\u0014\u0005@]~")), method4815(method4814("\u0014\u0005Y[~")), method4815(method4814("\u0014\u0005IZ~")), method4815(method4814("\u0014\u0005^X~")), method4815(method4814("\u0014\u0005A6")), method4815(method4814("\u0014\u0005XY~")), method4815(method4814("\u0014\u0005\\]~")), method4815(method4814("\u0014\u0005N_~")), method4815(method4814("\u0014\u0005G[~")), method4815(method4814("\u0014\u0005R6")), method4815(method4814("\u0014\u0005A]~")), method4815(method4814("\u0014\u0005D_~")), method4815(method4814("\u0014\u0005O\\~")), method4815(method4814("\u0014\u0005FY~")), method4815(method4814("\u0016_c")), method4815(method4814("\u0019]cz?\u0016")), method4815(method4814("8[op\u0011;")), method4815(method4814("\u0014\u0005K[~")), method4815(method4814("\u0014\u0005OY~")), method4815(method4814("\u0014\u0005H]~")), method4815(method4814("\u0014\u0005CY~")), method4815(method4814("\u0014\u0005KX~")), method4815(method4814("\u0014\u0005O6")), method4815(method4814("\u0014\u0005^6")), method4815(method4814("\u0014\u0005_]~")), method4815(method4814("\u0014\u0005@_~")), method4815(method4814("\u0014\u0005_Y~")), method4815(method4814("\u0014\u0005L\\~")), method4815(method4814("\u0014\u0005KZ~"))};
   @OriginalMember(
      owner = "client!c",
      name = "lf",
      descriptor = "F"
   )
   private float field9660;
   @OriginalMember(
      owner = "client!c",
      name = "Vd",
      descriptor = "F"
   )
   private float field9661;
   @OriginalMember(
      owner = "client!c",
      name = "Zf",
      descriptor = "F"
   )
   public float field9662;
   @OriginalMember(
      owner = "client!c",
      name = "bf",
      descriptor = "F"
   )
   private float field9689;
   @OriginalMember(
      owner = "client!c",
      name = "Jb",
      descriptor = "F"
   )
   public float field9699;
   @OriginalMember(
      owner = "client!c",
      name = "Pb",
      descriptor = "F"
   )
   public float field9725;
   @OriginalMember(
      owner = "client!c",
      name = "ef",
      descriptor = "F"
   )
   public float field9742;
   @OriginalMember(
      owner = "client!c",
      name = "Rb",
      descriptor = "F"
   )
   public float field9747;
   @OriginalMember(
      owner = "client!c",
      name = "Wf",
      descriptor = "F"
   )
   public float field9751;
   @OriginalMember(
      owner = "client!c",
      name = "Ee",
      descriptor = "I"
   )
   public static int field9399;
   @OriginalMember(
      owner = "client!c",
      name = "Dc",
      descriptor = "I"
   )
   public static int field9400;
   @OriginalMember(
      owner = "client!c",
      name = "xf",
      descriptor = "I"
   )
   public static int field9401;
   @OriginalMember(
      owner = "client!c",
      name = "bc",
      descriptor = "I"
   )
   public static int field9402;
   @OriginalMember(
      owner = "client!c",
      name = "Tf",
      descriptor = "I"
   )
   public static int field9403;
   @OriginalMember(
      owner = "client!c",
      name = "He",
      descriptor = "I"
   )
   public static int field9404;
   @OriginalMember(
      owner = "client!c",
      name = "Hg",
      descriptor = "I"
   )
   public static int field9405;
   @OriginalMember(
      owner = "client!c",
      name = "ac",
      descriptor = "I"
   )
   public static int field9406;
   @OriginalMember(
      owner = "client!c",
      name = "Ke",
      descriptor = "I"
   )
   public static int field9407;
   @OriginalMember(
      owner = "client!c",
      name = "mc",
      descriptor = "I"
   )
   public static int field9408;
   @OriginalMember(
      owner = "client!c",
      name = "Ze",
      descriptor = "I"
   )
   public static int field9409;
   @OriginalMember(
      owner = "client!c",
      name = "Mc",
      descriptor = "I"
   )
   public static int field9410;
   @OriginalMember(
      owner = "client!c",
      name = "ub",
      descriptor = "I"
   )
   public static int field9411;
   @OriginalMember(
      owner = "client!c",
      name = "Xb",
      descriptor = "I"
   )
   public static int field9412;
   @OriginalMember(
      owner = "client!c",
      name = "Nb",
      descriptor = "I"
   )
   public static int field9413;
   @OriginalMember(
      owner = "client!c",
      name = "Sg",
      descriptor = "I"
   )
   public static int field9414;
   @OriginalMember(
      owner = "client!c",
      name = "wf",
      descriptor = "I"
   )
   public static int field9415;
   @OriginalMember(
      owner = "client!c",
      name = "G",
      descriptor = "I"
   )
   public static int field9416;
   @OriginalMember(
      owner = "client!c",
      name = "db",
      descriptor = "I"
   )
   public static int field9417;
   @OriginalMember(
      owner = "client!c",
      name = "Sc",
      descriptor = "I"
   )
   public static int field9418;
   @OriginalMember(
      owner = "client!c",
      name = "Qf",
      descriptor = "I"
   )
   public static int field9419;
   @OriginalMember(
      owner = "client!c",
      name = "sd",
      descriptor = "I"
   )
   public static int field9420;
   @OriginalMember(
      owner = "client!c",
      name = "ch",
      descriptor = "I"
   )
   public static int field9421;
   @OriginalMember(
      owner = "client!c",
      name = "L",
      descriptor = "I"
   )
   public static int field9422;
   @OriginalMember(
      owner = "client!c",
      name = "Cc",
      descriptor = "I"
   )
   public static int field9423;
   @OriginalMember(
      owner = "client!c",
      name = "vc",
      descriptor = "I"
   )
   public static int field9424;
   @OriginalMember(
      owner = "client!c",
      name = "Mb",
      descriptor = "I"
   )
   public static int field9425;
   @OriginalMember(
      owner = "client!c",
      name = "v",
      descriptor = "I"
   )
   public static int field9426;
   @OriginalMember(
      owner = "client!c",
      name = "Ib",
      descriptor = "I"
   )
   public static int field9427;
   @OriginalMember(
      owner = "client!c",
      name = "Hc",
      descriptor = "I"
   )
   public static int field9428;
   @OriginalMember(
      owner = "client!c",
      name = "sg",
      descriptor = "I"
   )
   public static int field9429;
   @OriginalMember(
      owner = "client!c",
      name = "ag",
      descriptor = "I"
   )
   public static int field9430;
   @OriginalMember(
      owner = "client!c",
      name = "U",
      descriptor = "I"
   )
   public static int field9431;
   @OriginalMember(
      owner = "client!c",
      name = "oe",
      descriptor = "I"
   )
   public static int field9432;
   @OriginalMember(
      owner = "client!c",
      name = "ff",
      descriptor = "I"
   )
   public static int field9433;
   @OriginalMember(
      owner = "client!c",
      name = "bg",
      descriptor = "I"
   )
   public static int field9434;
   @OriginalMember(
      owner = "client!c",
      name = "gd",
      descriptor = "I"
   )
   public static int field9435;
   @OriginalMember(
      owner = "client!c",
      name = "Ec",
      descriptor = "I"
   )
   public static int field9436;
   @OriginalMember(
      owner = "client!c",
      name = "ud",
      descriptor = "I"
   )
   public static int field9437;
   @OriginalMember(
      owner = "client!c",
      name = "tg",
      descriptor = "I"
   )
   public static int field9438;
   @OriginalMember(
      owner = "client!c",
      name = "qh",
      descriptor = "I"
   )
   public static int field9439;
   @OriginalMember(
      owner = "client!c",
      name = "jg",
      descriptor = "I"
   )
   public static int field9440;
   @OriginalMember(
      owner = "client!c",
      name = "Ye",
      descriptor = "I"
   )
   public static int field9441;
   @OriginalMember(
      owner = "client!c",
      name = "I",
      descriptor = "I"
   )
   public static int field9442;
   @OriginalMember(
      owner = "client!c",
      name = "Hf",
      descriptor = "I"
   )
   public static int field9443;
   @OriginalMember(
      owner = "client!c",
      name = "Hb",
      descriptor = "I"
   )
   public static int field9444;
   @OriginalMember(
      owner = "client!c",
      name = "Pf",
      descriptor = "I"
   )
   public static int field9445;
   @OriginalMember(
      owner = "client!c",
      name = "Z",
      descriptor = "I"
   )
   public static int field9446;
   @OriginalMember(
      owner = "client!c",
      name = "Mg",
      descriptor = "I"
   )
   public static int field9447;
   @OriginalMember(
      owner = "client!c",
      name = "je",
      descriptor = "I"
   )
   public static int field9448;
   @OriginalMember(
      owner = "client!c",
      name = "Rc",
      descriptor = "I"
   )
   public static int field9449;
   @OriginalMember(
      owner = "client!c",
      name = "lb",
      descriptor = "I"
   )
   public static int field9450;
   @OriginalMember(
      owner = "client!c",
      name = "gb",
      descriptor = "I"
   )
   public static int field9451;
   @OriginalMember(
      owner = "client!c",
      name = "Of",
      descriptor = "I"
   )
   public static int field9452;
   @OriginalMember(
      owner = "client!c",
      name = "rd",
      descriptor = "I"
   )
   public static int field9453;
   @OriginalMember(
      owner = "client!c",
      name = "Xc",
      descriptor = "I"
   )
   public static int field9454;
   @OriginalMember(
      owner = "client!c",
      name = "of",
      descriptor = "I"
   )
   public static int field9455;
   @OriginalMember(
      owner = "client!c",
      name = "jd",
      descriptor = "I"
   )
   public static int field9456;
   @OriginalMember(
      owner = "client!c",
      name = "hd",
      descriptor = "I"
   )
   public static int field9457;
   @OriginalMember(
      owner = "client!c",
      name = "Cd",
      descriptor = "I"
   )
   public static int field9458;
   @OriginalMember(
      owner = "client!c",
      name = "Ub",
      descriptor = "I"
   )
   public static int field9459;
   @OriginalMember(
      owner = "client!c",
      name = "Fe",
      descriptor = "I"
   )
   public static int field9462;
   @OriginalMember(
      owner = "client!c",
      name = "Te",
      descriptor = "I"
   )
   public static int field9463;
   @OriginalMember(
      owner = "client!c",
      name = "Sf",
      descriptor = "I"
   )
   public static int field9464;
   @OriginalMember(
      owner = "client!c",
      name = "mb",
      descriptor = "I"
   )
   public static int field9465;
   @OriginalMember(
      owner = "client!c",
      name = "ze",
      descriptor = "I"
   )
   public static int field9466;
   @OriginalMember(
      owner = "client!c",
      name = "pg",
      descriptor = "I"
   )
   public static int field9467;
   @OriginalMember(
      owner = "client!c",
      name = "ie",
      descriptor = "I"
   )
   public static int field9468;
   @OriginalMember(
      owner = "client!c",
      name = "rf",
      descriptor = "I"
   )
   public static int field9469;
   @OriginalMember(
      owner = "client!c",
      name = "cc",
      descriptor = "I"
   )
   public static int field9470;
   @OriginalMember(
      owner = "client!c",
      name = "yh",
      descriptor = "I"
   )
   public static int field9471;
   @OriginalMember(
      owner = "client!c",
      name = "H",
      descriptor = "I"
   )
   public int field9472;
   @OriginalMember(
      owner = "client!c",
      name = "qg",
      descriptor = "I"
   )
   public static int field9473;
   @OriginalMember(
      owner = "client!c",
      name = "nb",
      descriptor = "I"
   )
   public static int field9474;
   @OriginalMember(
      owner = "client!c",
      name = "Pg",
      descriptor = "I"
   )
   public static int field9475;
   @OriginalMember(
      owner = "client!c",
      name = "Pc",
      descriptor = "I"
   )
   public static int field9476;
   @OriginalMember(
      owner = "client!c",
      name = "Gc",
      descriptor = "I"
   )
   public static int field9477;
   @OriginalMember(
      owner = "client!c",
      name = "ic",
      descriptor = "I"
   )
   public static int field9478;
   @OriginalMember(
      owner = "client!c",
      name = "Fd",
      descriptor = "I"
   )
   public static int field9479;
   @OriginalMember(
      owner = "client!c",
      name = "B",
      descriptor = "I"
   )
   public static int field9480;
   @OriginalMember(
      owner = "client!c",
      name = "sf",
      descriptor = "I"
   )
   public static int field9481;
   @OriginalMember(
      owner = "client!c",
      name = "se",
      descriptor = "I"
   )
   public static int field9482;
   @OriginalMember(
      owner = "client!c",
      name = "Od",
      descriptor = "I"
   )
   public static int field9483;
   @OriginalMember(
      owner = "client!c",
      name = "ab",
      descriptor = "I"
   )
   public static int field9484;
   @OriginalMember(
      owner = "client!c",
      name = "Bg",
      descriptor = "I"
   )
   public static int field9486;
   @OriginalMember(
      owner = "client!c",
      name = "Qe",
      descriptor = "I"
   )
   public static int field9487;
   @OriginalMember(
      owner = "client!c",
      name = "Yb",
      descriptor = "I"
   )
   public static int field9488;
   @OriginalMember(
      owner = "client!c",
      name = "re",
      descriptor = "I"
   )
   public static int field9489;
   @OriginalMember(
      owner = "client!c",
      name = "Vc",
      descriptor = "I"
   )
   public static int field9490;
   @OriginalMember(
      owner = "client!c",
      name = "X",
      descriptor = "I"
   )
   public static int field9491;
   @OriginalMember(
      owner = "client!c",
      name = "Cg",
      descriptor = "I"
   )
   public static int field9492;
   @OriginalMember(
      owner = "client!c",
      name = "yd",
      descriptor = "I"
   )
   public static int field9493;
   @OriginalMember(
      owner = "client!c",
      name = "Bh",
      descriptor = "I"
   )
   public static int field9494;
   @OriginalMember(
      owner = "client!c",
      name = "Xg",
      descriptor = "I"
   )
   public static int field9495;
   @OriginalMember(
      owner = "client!c",
      name = "vf",
      descriptor = "I"
   )
   public static int field9496;
   @OriginalMember(
      owner = "client!c",
      name = "dc",
      descriptor = "I"
   )
   public static int field9497;
   @OriginalMember(
      owner = "client!c",
      name = "Df",
      descriptor = "I"
   )
   public static int field9498;
   @OriginalMember(
      owner = "client!c",
      name = "Jf",
      descriptor = "I"
   )
   public static int field9499;
   @OriginalMember(
      owner = "client!c",
      name = "Vb",
      descriptor = "I"
   )
   public static int field9500;
   @OriginalMember(
      owner = "client!c",
      name = "ke",
      descriptor = "I"
   )
   public static int field9501;
   @OriginalMember(
      owner = "client!c",
      name = "xe",
      descriptor = "I"
   )
   public static int field9502;
   @OriginalMember(
      owner = "client!c",
      name = "Nd",
      descriptor = "I"
   )
   public static int field9503;
   @OriginalMember(
      owner = "client!c",
      name = "P",
      descriptor = "I"
   )
   public static int field9504;
   @OriginalMember(
      owner = "client!c",
      name = "tc",
      descriptor = "I"
   )
   public static int field9506;
   @OriginalMember(
      owner = "client!c",
      name = "K",
      descriptor = "I"
   )
   public static int field9507;
   @OriginalMember(
      owner = "client!c",
      name = "O",
      descriptor = "I"
   )
   public static int field9508;
   @OriginalMember(
      owner = "client!c",
      name = "mh",
      descriptor = "I"
   )
   public static int field9509;
   @OriginalMember(
      owner = "client!c",
      name = "wb",
      descriptor = "I"
   )
   public static int field9510;
   @OriginalMember(
      owner = "client!c",
      name = "Qg",
      descriptor = "I"
   )
   public static int field9511;
   @OriginalMember(
      owner = "client!c",
      name = "Bf",
      descriptor = "I"
   )
   public static int field9512;
   @OriginalMember(
      owner = "client!c",
      name = "Eg",
      descriptor = "I"
   )
   public static int field9513;
   @OriginalMember(
      owner = "client!c",
      name = "yb",
      descriptor = "I"
   )
   public static int field9514;
   @OriginalMember(
      owner = "client!c",
      name = "zf",
      descriptor = "I"
   )
   public static int field9515;
   @OriginalMember(
      owner = "client!c",
      name = "Eb",
      descriptor = "I"
   )
   public static int field9516;
   @OriginalMember(
      owner = "client!c",
      name = "Rg",
      descriptor = "I"
   )
   public static int field9517;
   @OriginalMember(
      owner = "client!c",
      name = "Lf",
      descriptor = "I"
   )
   public static int field9518;
   @OriginalMember(
      owner = "client!c",
      name = "ng",
      descriptor = "I"
   )
   private int field9519;
   @OriginalMember(
      owner = "client!c",
      name = "Rf",
      descriptor = "I"
   )
   public static int field9520;
   @OriginalMember(
      owner = "client!c",
      name = "Ad",
      descriptor = "I"
   )
   public static int field9521;
   @OriginalMember(
      owner = "client!c",
      name = "Se",
      descriptor = "I"
   )
   public static int field9522;
   @OriginalMember(
      owner = "client!c",
      name = "rg",
      descriptor = "I"
   )
   public static int field9523;
   @OriginalMember(
      owner = "client!c",
      name = "xc",
      descriptor = "I"
   )
   public static int field9524;
   @OriginalMember(
      owner = "client!c",
      name = "Ng",
      descriptor = "I"
   )
   public static int field9525;
   @OriginalMember(
      owner = "client!c",
      name = "af",
      descriptor = "I"
   )
   public static int field9526;
   @OriginalMember(
      owner = "client!c",
      name = "Vf",
      descriptor = "I"
   )
   public static int field9527;
   @OriginalMember(
      owner = "client!c",
      name = "Yg",
      descriptor = "I"
   )
   public static int field9528;
   @OriginalMember(
      owner = "client!c",
      name = "bh",
      descriptor = "I"
   )
   public static int field9529;
   @OriginalMember(
      owner = "client!c",
      name = "ve",
      descriptor = "I"
   )
   public static int field9530;
   @OriginalMember(
      owner = "client!c",
      name = "we",
      descriptor = "I"
   )
   public static int field9531;
   @OriginalMember(
      owner = "client!c",
      name = "fb",
      descriptor = "I"
   )
   public static int field9532;
   @OriginalMember(
      owner = "client!c",
      name = "Y",
      descriptor = "I"
   )
   public static int field9533;
   @OriginalMember(
      owner = "client!c",
      name = "rb",
      descriptor = "I"
   )
   public static int field9534;
   @OriginalMember(
      owner = "client!c",
      name = "Yd",
      descriptor = "I"
   )
   public static int field9535;
   @OriginalMember(
      owner = "client!c",
      name = "sc",
      descriptor = "I"
   )
   public static int field9536;
   @OriginalMember(
      owner = "client!c",
      name = "kh",
      descriptor = "I"
   )
   public static int field9537;
   @OriginalMember(
      owner = "client!c",
      name = "Hd",
      descriptor = "I"
   )
   public static int field9538;
   @OriginalMember(
      owner = "client!c",
      name = "dg",
      descriptor = "I"
   )
   public static int field9539;
   @OriginalMember(
      owner = "client!c",
      name = "V",
      descriptor = "I"
   )
   public static int field9540;
   @OriginalMember(
      owner = "client!c",
      name = "Uc",
      descriptor = "I"
   )
   public static int field9541;
   @OriginalMember(
      owner = "client!c",
      name = "hg",
      descriptor = "I"
   )
   public static int field9542;
   @OriginalMember(
      owner = "client!c",
      name = "Nc",
      descriptor = "I"
   )
   public static int field9543;
   @OriginalMember(
      owner = "client!c",
      name = "Zg",
      descriptor = "I"
   )
   public static int field9544;
   @OriginalMember(
      owner = "client!c",
      name = "Mf",
      descriptor = "I"
   )
   public static int field9545;
   @OriginalMember(
      owner = "client!c",
      name = "qe",
      descriptor = "I"
   )
   public static int field9546;
   @OriginalMember(
      owner = "client!c",
      name = "Ah",
      descriptor = "I"
   )
   public static int field9547;
   @OriginalMember(
      owner = "client!c",
      name = "ge",
      descriptor = "I"
   )
   public static int field9548;
   @OriginalMember(
      owner = "client!c",
      name = "Ie",
      descriptor = "I"
   )
   public static int field9549;
   @OriginalMember(
      owner = "client!c",
      name = "me",
      descriptor = "I"
   )
   public static int field9550;
   @OriginalMember(
      owner = "client!c",
      name = "Me",
      descriptor = "I"
   )
   public static int field9551;
   @OriginalMember(
      owner = "client!c",
      name = "Wc",
      descriptor = "I"
   )
   public static int field9552;
   @OriginalMember(
      owner = "client!c",
      name = "Zb",
      descriptor = "I"
   )
   public static int field9553;
   @OriginalMember(
      owner = "client!c",
      name = "Rd",
      descriptor = "I"
   )
   public static int field9554;
   @OriginalMember(
      owner = "client!c",
      name = "ed",
      descriptor = "I"
   )
   public static int field9555;
   @OriginalMember(
      owner = "client!c",
      name = "bb",
      descriptor = "I"
   )
   public static int field9556;
   @OriginalMember(
      owner = "client!c",
      name = "W",
      descriptor = "I"
   )
   public static int field9557;
   @OriginalMember(
      owner = "client!c",
      name = "pf",
      descriptor = "I"
   )
   public static int field9558;
   @OriginalMember(
      owner = "client!c",
      name = "R",
      descriptor = "I"
   )
   public static int field9559;
   @OriginalMember(
      owner = "client!c",
      name = "Ic",
      descriptor = "I"
   )
   public static int field9560;
   @OriginalMember(
      owner = "client!c",
      name = "A",
      descriptor = "I"
   )
   public static int field9561;
   @OriginalMember(
      owner = "client!c",
      name = "uh",
      descriptor = "I"
   )
   public static int field9562;
   @OriginalMember(
      owner = "client!c",
      name = "qf",
      descriptor = "I"
   )
   public static int field9563;
   @OriginalMember(
      owner = "client!c",
      name = "ee",
      descriptor = "I"
   )
   public static int field9565;
   @OriginalMember(
      owner = "client!c",
      name = "ye",
      descriptor = "I"
   )
   public static int field9566;
   @OriginalMember(
      owner = "client!c",
      name = "w",
      descriptor = "I"
   )
   public static int field9567;
   @OriginalMember(
      owner = "client!c",
      name = "kc",
      descriptor = "I"
   )
   public static int field9568;
   @OriginalMember(
      owner = "client!c",
      name = "ec",
      descriptor = "I"
   )
   public static int field9569;
   @OriginalMember(
      owner = "client!c",
      name = "Jd",
      descriptor = "I"
   )
   public static int field9570;
   @OriginalMember(
      owner = "client!c",
      name = "yc",
      descriptor = "I"
   )
   public static int field9571;
   @OriginalMember(
      owner = "client!c",
      name = "Ve",
      descriptor = "I"
   )
   public static int field9572;
   @OriginalMember(
      owner = "client!c",
      name = "Fb",
      descriptor = "I"
   )
   public static int field9573;
   @OriginalMember(
      owner = "client!c",
      name = "Xe",
      descriptor = "I"
   )
   public static int field9574;
   @OriginalMember(
      owner = "client!c",
      name = "cb",
      descriptor = "I"
   )
   public static int field9575;
   @OriginalMember(
      owner = "client!c",
      name = "zg",
      descriptor = "I"
   )
   public static int field9576;
   @OriginalMember(
      owner = "client!c",
      name = "vh",
      descriptor = "I"
   )
   public static int field9577;
   @OriginalMember(
      owner = "client!c",
      name = "Q",
      descriptor = "I"
   )
   public static int field9578;
   @OriginalMember(
      owner = "client!c",
      name = "ib",
      descriptor = "I"
   )
   public static int field9579;
   @OriginalMember(
      owner = "client!c",
      name = "Gd",
      descriptor = "I"
   )
   private int field9580;
   @OriginalMember(
      owner = "client!c",
      name = "Nf",
      descriptor = "I"
   )
   public static int field9582;
   @OriginalMember(
      owner = "client!c",
      name = "fc",
      descriptor = "I"
   )
   public static int field9584;
   @OriginalMember(
      owner = "client!c",
      name = "xb",
      descriptor = "I"
   )
   public static int field9585;
   @OriginalMember(
      owner = "client!c",
      name = "z",
      descriptor = "I"
   )
   public static int field9586;
   @OriginalMember(
      owner = "client!c",
      name = "Bc",
      descriptor = "I"
   )
   public static int field9587;
   @OriginalMember(
      owner = "client!c",
      name = "mf",
      descriptor = "I"
   )
   public static int field9588;
   @OriginalMember(
      owner = "client!c",
      name = "ad",
      descriptor = "I"
   )
   public static int field9589;
   @OriginalMember(
      owner = "client!c",
      name = "jh",
      descriptor = "I"
   )
   public static int field9590;
   @OriginalMember(
      owner = "client!c",
      name = "nd",
      descriptor = "I"
   )
   public static int field9591;
   @OriginalMember(
      owner = "client!c",
      name = "be",
      descriptor = "I"
   )
   public static int field9593;
   @OriginalMember(
      owner = "client!c",
      name = "gg",
      descriptor = "I"
   )
   public static int field9594;
   @OriginalMember(
      owner = "client!c",
      name = "Vg",
      descriptor = "I"
   )
   public static int field9595;
   @OriginalMember(
      owner = "client!c",
      name = "eg",
      descriptor = "I"
   )
   public static int field9596;
   @OriginalMember(
      owner = "client!c",
      name = "ue",
      descriptor = "I"
   )
   public static int field9597;
   @OriginalMember(
      owner = "client!c",
      name = "Qc",
      descriptor = "I"
   )
   public static int field9598;
   @OriginalMember(
      owner = "client!c",
      name = "Gf",
      descriptor = "I"
   )
   public int field9599;
   @OriginalMember(
      owner = "client!c",
      name = "Tb",
      descriptor = "I"
   )
   public static int field9600;
   @OriginalMember(
      owner = "client!c",
      name = "y",
      descriptor = "I"
   )
   public static int field9601;
   @OriginalMember(
      owner = "client!c",
      name = "Cb",
      descriptor = "I"
   )
   public static int field9606;
   @OriginalMember(
      owner = "client!c",
      name = "kf",
      descriptor = "I"
   )
   public static int field9607;
   @OriginalMember(
      owner = "client!c",
      name = "C",
      descriptor = "I"
   )
   public static int field9611;
   @OriginalMember(
      owner = "client!c",
      name = "cg",
      descriptor = "I"
   )
   public int field9615;
   @OriginalMember(
      owner = "client!c",
      name = "oc",
      descriptor = "I"
   )
   private int field9631;
   @OriginalMember(
      owner = "client!c",
      name = "Cf",
      descriptor = "I"
   )
   public int field9632;
   @OriginalMember(
      owner = "client!c",
      name = "Qd",
      descriptor = "I"
   )
   public int field9634;
   @OriginalMember(
      owner = "client!c",
      name = "gf",
      descriptor = "I"
   )
   private int field9642;
   @OriginalMember(
      owner = "client!c",
      name = "Oc",
      descriptor = "I"
   )
   private int field9644;
   @OriginalMember(
      owner = "client!c",
      name = "Lc",
      descriptor = "I"
   )
   private int field9645;
   @OriginalMember(
      owner = "client!c",
      name = "x",
      descriptor = "I"
   )
   public int field9666;
   @OriginalMember(
      owner = "client!c",
      name = "yf",
      descriptor = "I"
   )
   private int field9675;
   @OriginalMember(
      owner = "client!c",
      name = "dh",
      descriptor = "I"
   )
   private int field9681;
   @OriginalMember(
      owner = "client!c",
      name = "Be",
      descriptor = "I"
   )
   private int field9682;
   @OriginalMember(
      owner = "client!c",
      name = "wg",
      descriptor = "I"
   )
   private int field9694;
   @OriginalMember(
      owner = "client!c",
      name = "ld",
      descriptor = "I"
   )
   private int field9696;
   @OriginalMember(
      owner = "client!c",
      name = "uc",
      descriptor = "I"
   )
   public int field9704;
   @OriginalMember(
      owner = "client!c",
      name = "T",
      descriptor = "I"
   )
   private int field9708;
   @OriginalMember(
      owner = "client!c",
      name = "fd",
      descriptor = "I"
   )
   public int field9727;
   @OriginalMember(
      owner = "client!c",
      name = "dd",
      descriptor = "I"
   )
   private int field9733;
   @OriginalMember(
      owner = "client!c",
      name = "zb",
      descriptor = "I"
   )
   private int field9746;
   @OriginalMember(
      owner = "client!c",
      name = "zh",
      descriptor = "I"
   )
   public int field9750;
   @OriginalMember(
      owner = "client!c",
      name = "Af",
      descriptor = "I"
   )
   private int field9764;
   @OriginalMember(
      owner = "client!c",
      name = "Uf",
      descriptor = "I"
   )
   private int field9765;
   @OriginalMember(
      owner = "client!c",
      name = "nf",
      descriptor = "J"
   )
   private long field9641;
   @OriginalMember(
      owner = "client!c",
      name = "Ge",
      descriptor = "Lli;"
   )
   private class112 field9658;
   @OriginalMember(
      owner = "client!c",
      name = "Ld",
      descriptor = "Lli;"
   )
   private class112 field9683;
   @OriginalMember(
      owner = "client!c",
      name = "tf",
      descriptor = "Liw;"
   )
   public class146 field9677;
   @OriginalMember(
      owner = "client!c",
      name = "oh",
      descriptor = "Liw;"
   )
   public class146 field9684;
   @OriginalMember(
      owner = "client!c",
      name = "pe",
      descriptor = "Liw;"
   )
   public class146 field9687;
   @OriginalMember(
      owner = "client!c",
      name = "Jc",
      descriptor = "Liw;"
   )
   public class146 field9692;
   @OriginalMember(
      owner = "client!c",
      name = "cf",
      descriptor = "Liw;"
   )
   public class146 field9710;
   @OriginalMember(
      owner = "client!c",
      name = "D",
      descriptor = "Liw;"
   )
   public class146 field9719;
   @OriginalMember(
      owner = "client!c",
      name = "Db",
      descriptor = "Liw;"
   )
   public class146 field9752;
   @OriginalMember(
      owner = "client!c",
      name = "Wb",
      descriptor = "Liw;"
   )
   public class146 field9754;
   @OriginalMember(
      owner = "client!c",
      name = "Yc",
      descriptor = "Liw;"
   )
   public class146 field9755;
   @OriginalMember(
      owner = "client!c",
      name = "Sd",
      descriptor = "Liw;"
   )
   public class146 field9756;
   @OriginalMember(
      owner = "client!c",
      name = "Ug",
      descriptor = "Ld;"
   )
   public static class150 field9583;
   @OriginalMember(
      owner = "client!c",
      name = "qd",
      descriptor = "Lle;"
   )
   private class172 field9758;
   @OriginalMember(
      owner = "client!c",
      name = "Yf",
      descriptor = "Lnfa;"
   )
   private class329 field9729;
   @OriginalMember(
      owner = "client!c",
      name = "Ud",
      descriptor = "Laia;"
   )
   private class355 field9630;
   @OriginalMember(
      owner = "client!c",
      name = "zd",
      descriptor = "Lqga;"
   )
   private class358 field9628;
   @OriginalMember(
      owner = "client!c",
      name = "wh",
      descriptor = "Lqga;"
   )
   public class358 field9669;
   @OriginalMember(
      owner = "client!c",
      name = "Gg",
      descriptor = "Lbka;"
   )
   public class396 field9670;
   @OriginalMember(
      owner = "client!c",
      name = "Ob",
      descriptor = "Lqk;"
   )
   private class419 field9731;
   @OriginalMember(
      owner = "client!c",
      name = "Kd",
      descriptor = "Lgs;"
   )
   public class436 field9736;
   @OriginalMember(
      owner = "client!c",
      name = "S",
      descriptor = "Lgs;"
   )
   public class436 field9744;
   @OriginalMember(
      owner = "client!c",
      name = "Ef",
      descriptor = "Len;"
   )
   private class447 field9621;
   @OriginalMember(
      owner = "client!c",
      name = "Id",
      descriptor = "Len;"
   )
   private class447 field9623;
   @OriginalMember(
      owner = "client!c",
      name = "vd",
      descriptor = "Ljq;"
   )
   public static class672 field9505;
   @OriginalMember(
      owner = "client!c",
      name = "qc",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   public NativeHeap field9618;
   @OriginalMember(
      owner = "client!c",
      name = "cd",
      descriptor = "Z"
   )
   private boolean field9643;
   @OriginalMember(
      owner = "client!c",
      name = "md",
      descriptor = "Z"
   )
   private boolean field9646;
   @OriginalMember(
      owner = "client!c",
      name = "Je",
      descriptor = "Z"
   )
   private boolean field9648;
   @OriginalMember(
      owner = "client!c",
      name = "xh",
      descriptor = "Z"
   )
   private boolean field9649;
   @OriginalMember(
      owner = "client!c",
      name = "Pd",
      descriptor = "Z"
   )
   public boolean field9652;
   @OriginalMember(
      owner = "client!c",
      name = "vg",
      descriptor = "Z"
   )
   public boolean field9654;
   @OriginalMember(
      owner = "client!c",
      name = "Oe",
      descriptor = "Z"
   )
   public boolean field9657;
   @OriginalMember(
      owner = "client!c",
      name = "he",
      descriptor = "Z"
   )
   public boolean field9667;
   @OriginalMember(
      owner = "client!c",
      name = "Ed",
      descriptor = "Z"
   )
   private boolean field9671;
   @OriginalMember(
      owner = "client!c",
      name = "ah",
      descriptor = "Z"
   )
   private boolean field9672;
   @OriginalMember(
      owner = "client!c",
      name = "Td",
      descriptor = "Z"
   )
   public boolean field9674;
   @OriginalMember(
      owner = "client!c",
      name = "kb",
      descriptor = "Z"
   )
   public boolean field9685;
   @OriginalMember(
      owner = "client!c",
      name = "Ne",
      descriptor = "Z"
   )
   private boolean field9691;
   @OriginalMember(
      owner = "client!c",
      name = "Dd",
      descriptor = "Z"
   )
   private boolean field9697;
   @OriginalMember(
      owner = "client!c",
      name = "vb",
      descriptor = "Z"
   )
   private boolean field9702;
   @OriginalMember(
      owner = "client!c",
      name = "J",
      descriptor = "Z"
   )
   private boolean field9711;
   @OriginalMember(
      owner = "client!c",
      name = "Jg",
      descriptor = "Z"
   )
   public boolean field9716;
   @OriginalMember(
      owner = "client!c",
      name = "Fc",
      descriptor = "Z"
   )
   private boolean field9726;
   @OriginalMember(
      owner = "client!c",
      name = "fg",
      descriptor = "Z"
   )
   public boolean field9732;
   @OriginalMember(
      owner = "client!c",
      name = "hh",
      descriptor = "Z"
   )
   public boolean field9735;
   @OriginalMember(
      owner = "client!c",
      name = "Ag",
      descriptor = "[Lvda;"
   )
   private class799[] field9741;

   @OriginalMember(
      owner = "client!c",
      name = "j",
      descriptor = "(B)V"
   )
   private final void method4728(byte arg0) {
      try {
         this.field9721[10] = this.field9661;
         ++field9418;
         this.field9721[14] = this.field9689;
         this.field9655 = (float)this.field9664;
         if (arg0 != 0) {
            this.field9737 = true;
         }

         this.field9676 = (this.field9721[14] - (float)this.field9664) / this.field9721[10];
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[100] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "h",
      descriptor = "(B)V"
   )
   private final void method4729(byte arg0) {
      try {
         if (arg0 < 90) {
            this.method603((class331)null, (class331)null, 0.12058826F, (class331)null);
         }

         ++field9455;
         if (this.field9697) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field9697 = false;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[184] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(Lsv;Lip;)Lcl;"
   )
   public final class141 method609(class166 arg0, class726 arg1) {
      try {
         ++field9471;
         return null;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[35] + (arg0 != null ? field9769[4] : field9769[3]) + ',' + (arg1 != null ? field9769[4] : field9769[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "h",
      descriptor = "(Z)V"
   )
   private final void method4730(boolean arg0) {
      try {
         ++field9473;
         if (arg0) {
            this.field9608 = null;
         }

         if (this.field9671 && ~this.field9701 <= -1) {
            OpenGL.glEnable(2912);
         } else {
            OpenGL.glDisable(2912);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[20] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "o",
      descriptor = "(I)V"
   )
   private final void method4731(int arg0) {
      try {
         ++field9575;
         if (this.field9645 != 1) {
            this.method4806(30847);
            this.method4762(false, (byte)-122);
            this.method4749(true, false);
            this.method4807(false, false);
            this.method4779((byte)-35, false);
            this.method4792(-26367, (class799)null);
            this.method4805(-2, (byte)26);
            this.method4765(1, (byte)-3);
            this.field9645 = 1;
         }

         if (arg0 != 28626) {
            this.method653();
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(Lkp;Z)Ljq;"
   )
   public final class672 method606(class776 arg0, boolean arg1) {
      boolean var3 = client.field1786;

      try {
         int[] var4;
         label95: {
            ++field9598;
            var4 = new int[arg0.field11395 * arg0.field11394];
            int var5 = 0;
            int var6 = 0;
            if (arg0.field11398 == null) {
               int var7 = 0;
               if (var3 || ~var7 > ~arg0.field11394) {
                  do {
                     int var8 = 0;
                     if (var3 || ~var8 > ~arg0.field11395) {
                        do {
                           int var9 = arg0.field11400[arg0.field11396[var5++] & 255];
                           var4[var6++] = var9 != 0 ? class119.method1087(var9, -16777216) : 0;
                           ++var8;
                        } while(~var8 > ~arg0.field11395);
                     }

                     ++var7;
                  } while(~var7 > ~arg0.field11394);
               }

               if (!var3) {
                  break label95;
               }
            }

            int var10 = 0;
            if (var3 || arg0.field11394 > var10) {
               do {
                  int var11 = 0;
                  if (var3) {
                     var4[var6++] = class119.method1087(arg0.field11398[var5] << 24, arg0.field11400[class408.method3277(arg0.field11396[var5], 255)]);
                     ++var5;
                     ++var11;
                  }

                  while(true) {
                     while(~var11 > ~arg0.field11395) {
                        var4[var6++] = class119.method1087(arg0.field11398[var5] << 24, arg0.field11400[class408.method3277(arg0.field11396[var5], 255)]);
                        ++var5;
                        ++var11;
                     }

                     if (!var3) {
                        ++var10;
                        break;
                     }

                     ++var11;
                  }
               } while(arg0.field11394 > var10);
            }
         }

         class672 var12 = this.method4494((byte)-81, arg0.field11394, arg0.field11395, arg0.field11395, 0, var4);
         var12.method2107(arg0.field11401, arg0.field11397, arg0.field11402, arg0.field11399);
         return var12;
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field9769[26] + (arg0 != null ? field9769[4] : field9769[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "X",
      descriptor = "(I)V"
   )
   public final void method691(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(ZII[BI)Lle;"
   )
   public final class172 method4732(boolean arg0, int arg1, int arg2, byte[] arg3, int arg4) {
      try {
         ++field9416;
         if (this.field9760 && (!arg0 || this.field9722)) {
            return new class421(this, arg1, arg3, arg2, arg0);
         } else {
            if (arg4 < 108) {
               this.field9745 = -50;
            }

            return new class463(this, arg1, arg3, arg2);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field9769[122] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9769[4] : field9769[3]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "z",
      descriptor = "(I)V"
   )
   public static final void method4733(int arg0) {
      class684.field10177 = arg0;

      for(int var1 = 0; var1 < class247.field3734; ++var1) {
         for(int var2 = 0; var2 < class365.field5634; ++var2) {
            if (class711.field10694[arg0][var1][var2] == null) {
               class711.field10694[arg0][var1][var2] = new class190(arg0);
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!c",
      name = "c",
      descriptor = "(B)V"
   )
   private final void method4734(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V"
   )
   public final void method657(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      try {
         ++field9500;
         this.method4731(28626);
         this.method4783(3008, arg12);
         OpenGL.glBegin(4);
         OpenGL.glColor4ub((byte)(arg9 >> 16), (byte)(arg9 >> 8), (byte)arg9, (byte)(arg9 >> 24));
         OpenGL.glVertex3f((float)arg0 + 0.35F, (float)arg1 + 0.35F, (float)arg2);
         OpenGL.glColor4ub((byte)(arg10 >> 16), (byte)(arg10 >> 8), (byte)arg10, (byte)(arg10 >> 24));
         OpenGL.glVertex3f((float)arg3 + 0.35F, (float)arg4 + 0.35F, (float)arg5);
         OpenGL.glColor4ub((byte)(arg11 >> 16), (byte)(arg11 >> 8), (byte)arg11, (byte)(arg11 >> 24));
         OpenGL.glVertex3f((float)arg6 + 0.35F, (float)arg7 + 0.35F, (float)arg8);
         OpenGL.glEnd();
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field9769[74] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(FFFI)V"
   )
   private final void method4735(float arg0, float arg1, float arg2, int arg3) {
      try {
         OpenGL.glMatrixMode(arg3);
         ++field9487;
         if (this.field9697) {
            OpenGL.glLoadIdentity();
         }

         OpenGL.glTranslatef(arg2, arg1, arg0);
         OpenGL.glMatrixMode(5888);
         this.field9697 = true;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9769[201] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "i",
      descriptor = "(Z)V"
   )
   private final void method4736(boolean arg0) {
      try {
         class371.field5757[0] = this.field9761 * this.field9734;
         ++field9441;
         class371.field5757[2] = this.field9762 * this.field9761;
         class371.field5757[1] = this.field9761 * this.field9703;
         if (arg0) {
            class371.field5757[3] = 1.0F;
            OpenGL.glLightfv(16384, 4609, class371.field5757, 0);
            class371.field5757[2] = -this.field9749 * this.field9762;
            class371.field5757[3] = 1.0F;
            class371.field5757[1] = -this.field9749 * this.field9703;
            class371.field5757[0] = -this.field9749 * this.field9734;
            OpenGL.glLightfv(16385, 4609, class371.field5757, 0);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "r",
      descriptor = "()V"
   )
   public final void method618() {
      boolean var1 = client.field1786;

      try {
         label35: {
            ++field9540;
            if (this.field9737) {
               if (this.field9621 != this.field9628) {
                  throw new RuntimeException();
               }

               this.field9628.method2933(0, -16640);
               this.field9628.method2933(8, -16640);
               this.method4746(-1, this.field9628);
               if (!var1) {
                  break label35;
               }
            }

            if (!this.field9691) {
               throw new RuntimeException("");
            }

            this.field9630.method937(0, 0, this.field9599, this.field9472, 0, 0);
            this.field9485.setSurface(this.field9581);
            if (var1) {
               throw new RuntimeException("");
            }
         }

         this.field9630 = null;
         this.field9599 = this.field9519;
         this.field9472 = this.field9580;
         this.method4784(0);
         this.method4774(true);
         this.method701();
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "b",
      descriptor = "(IIII)V"
   )
   public final void method4737(int arg0, int arg1, int arg2, int arg3) {
      try {
         OpenGL.glTexEnvi(8960, arg1 + 34184, arg3);
         ++field9529;
         OpenGL.glTexEnvi(8960, arg1 + 34200, arg2);
         if (arg0 <= 103) {
            this.method680();
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9769[27] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "Q",
      descriptor = "(IIIIII[BII)V"
   )
   public final void method707(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
      try {
         float var10;
         float var11;
         label28: {
            ++field9474;
            if (this.field9731 != null && arg2 <= this.field9731.field6215 && this.field9731.field6218 >= arg3) {
               this.field9731.method3195(arg2, 0, arg6, 0, 0, -3477, 6406, false, 0, arg3);
               var10 = (float)arg3 * this.field9731.field6487 / (float)this.field9731.field6218;
               var11 = (float)arg2 * this.field9731.field6488 / (float)this.field9731.field6215;
               if (!client.field1786) {
                  break label28;
               }
            }

            this.field9731 = class425.method3369(arg2, this, arg6, (byte)120, 6406, arg3, 6406, false);
            this.field9731.method3192(false, false, false);
            var10 = this.field9731.field6487;
            var11 = this.field9731.field6488;
         }

         this.method4802(false);
         this.method4792(-26367, this.field9731);
         this.method4783(3008, arg8);
         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         this.method4756(arg5, 82);
         this.method4803(34165, 34165, true);
         this.method4809(768, (byte)-128, 34166, 0);
         this.method4809(770, (byte)-128, 5890, 2);
         this.method4737(115, 0, 770, 34166);
         this.method4737(125, 2, 770, 5890);
         float var12 = (float)arg0;
         float var13 = (float)arg1;
         float var14 = (float)arg2 + var12;
         float var15 = (float)arg3 + var13;
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2f(var12, var13);
         OpenGL.glTexCoord2f(0.0F, var11);
         OpenGL.glVertex2f(var12, var15);
         OpenGL.glTexCoord2f(var10, var11);
         OpenGL.glVertex2f(var14, var15);
         OpenGL.glTexCoord2f(var10, 0.0F);
         OpenGL.glVertex2f(var14, var13);
         OpenGL.glEnd();
         this.method4809(768, (byte)-128, 5890, 0);
         this.method4809(770, (byte)-128, 34166, 2);
         this.method4737(125, 0, 770, 5890);
         this.method4737(113, 2, 770, 34166);
      } catch (RuntimeException var17) {
         throw class482.method3757(var17, field9769[41] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field9769[4] : field9769[3]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(IZZZ)V"
   )
   public final void method4738(int arg0, boolean arg1, boolean arg2, boolean arg3) {
      boolean var5 = client.field1786;

      try {
         ++field9572;
         if (!arg1) {
            this.field9635 = null;
         }

         if (this.field9681 != arg0 || this.field9667 == !this.field9712) {
            class396 var6;
            int var7;
            byte var8;
            int var9;
            int var10;
            label72: {
               var6 = null;
               var7 = 0;
               var8 = 0;
               var9 = 0;
               var10 = !this.field9667 ? 0 : 3;
               if (~arg0 > -1) {
                  this.method4729((byte)119);
                  if (!var5) {
                     break label72;
                  }
               }

               class453 var11;
               label73: {
                  var6 = this.field9603.method187(-41, arg0);
                  var11 = super.field8891.method1373(arg0, (byte)-54);
                  if (~var11.field6926 == -1 && ~var11.field6932 == -1) {
                     this.method4729((byte)94);
                     if (!var5) {
                        break label73;
                     }
                  }

                  int var12 = !var11.field6933 ? 128 : 64;
                  int var13 = var12 * 50;
                  this.method4735(0.0F, (float)(this.field9615 % var13 * var11.field6932) / (float)var13, (float)(this.field9615 % var13 * var11.field6926) / (float)var13, 5890);
               }

               if (!this.field9667) {
                  var8 = var11.field6923;
                  var10 = var11.field6924;
                  var9 = var11.field6931;
               }

               var7 = var11.field6925;
            }

            this.field9609.method5205(Integer.MAX_VALUE, var10, arg3, arg2, var8, var9);
            if (!this.field9609.method5203(var6, var7, (byte)71)) {
               this.method4792(-26367, var6);
               this.method4765(var7, (byte)-3);
            }

            this.field9712 = this.field9667;
            this.field9681 = arg0;
         }

         this.field9645 &= -8;
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field9769[180] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "D",
      descriptor = "(I)V"
   )
   public final void method4739(int arg0) {
      try {
         if (arg0 != 2) {
            this.method667((class331)null);
         }

         ++field9513;
         if (~this.field9645 != -5) {
            this.method4806(arg0 + 30845);
            this.method4762(false, (byte)58);
            this.method4749(true, false);
            this.method4807(false, false);
            this.method4779((byte)-35, false);
            this.method4805(-2, (byte)26);
            this.method4783(3008, 1);
            this.field9645 = 4;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "k",
      descriptor = "()Z"
   )
   public final boolean method594() {
      try {
         ++field9585;
         return true;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9769[147] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method694(int arg0) {
      try {
         ++field9411;
         if (~arg0 <= -129 && ~arg0 >= -1025) {
            this.field9610 = arg0;
            this.field9603.method182(true);
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "i",
      descriptor = "(II)V"
   )
   public final synchronized void method4740(int arg0, int arg1) {
      try {
         ++field9410;
         class668 var3 = new class668(arg1);
         if (arg0 == 512) {
            this.field9637.method4980(var3, 0);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9769[102] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "s",
      descriptor = "()Z"
   )
   public final boolean method660() {
      try {
         ++field9434;
         return this.field9602 != null && (this.field9605 <= 1 || this.field9672);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9769[151] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(ZII)V"
   )
   public final void method4741(boolean arg0, int arg1, int arg2) {
      try {
         int var4 = 20 / ((39 - arg1) / 47);
         this.method4738(arg2, true, true, arg0);
         ++field9408;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9769[80] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "([IIIIIZ)Ljq;"
   )
   public final class672 method658(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         ++field9468;
         return new class355(this, arg3, arg4, arg0, arg1, arg2);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field9769[69] + (arg0 != null ? field9769[4] : field9769[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "k",
      descriptor = "(I)V"
   )
   private final void method4742(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(BI)I"
   )
   public final int method4743(byte arg0, int arg1) {
      try {
         ++field9414;
         int var3 = -116 / ((3 - arg0) / 54);
         if (arg1 == 1) {
            return 7681;
         } else if (~arg1 != -1) {
            if (arg1 != 2) {
               if (~arg1 != -4) {
                  if (arg1 == 4) {
                     return 34023;
                  } else {
                     throw new IllegalArgumentException();
                  }
               } else {
                  return 260;
               }
            } else {
               return 34165;
            }
         } else {
            return 8448;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9769[117] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "za",
      descriptor = "(IIIII)V"
   )
   public final void method589(int param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(Len;B)V"
   )
   public final void method4744(class447 arg0, byte arg1) {
      try {
         ++field9588;
         if (~this.field9624 <= -4) {
            throw new RuntimeException();
         } else {
            if (this.field9624 >= 0) {
               this.field9622[this.field9624].method2938(-112);
            }

            this.field9623 = this.field9622[++this.field9624] = arg0;
            this.field9623.method2925((byte)-118);
            if (arg1 <= 61) {
               this.method621();
            }
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[55] + (arg0 != null ? field9769[4] : field9769[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "c",
      descriptor = "(IBI)V"
   )
   public final synchronized void method4745(int arg0, byte arg1, int arg2) {
      try {
         ++field9400;
         class668 var4 = new class668(arg2);
         var4.field4655 = (long)arg0;
         this.field9635.method4980(var4, 0);
         if (arg1 >= -4) {
            this.method586(113, -94, 106, -47);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9769[219] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method703(Canvas arg0) {
      try {
         ++field9552;
         if (this.field9461 == arg0) {
            throw new RuntimeException();
         } else if (this.field9564.containsKey(arg0)) {
            Long var2 = (Long)this.field9564.get(arg0);
            this.field9485.releaseSurface(arg0, var2);
            this.field9564.remove(arg0);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[22] + (arg0 != null ? field9769[4] : field9769[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method611(int[] arg0) {
      try {
         arg0[0] = this.field9599;
         ++field9506;
         arg0[1] = this.field9472;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[149] + (arg0 != null ? field9769[4] : field9769[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "aa",
      descriptor = "(IIIIII)V"
   )
   public final void method631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field9555;
         float var7 = (float)arg0 + 0.35F;
         float var8 = (float)arg1 + 0.35F;
         float var9 = (float)arg2 + var7;
         float var10 = (float)arg3 + var8;
         this.method4731(28626);
         this.method4783(3008, arg5);
         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         if (this.field9702) {
            OpenGL.glDisable(32925);
         }

         OpenGL.glBegin(7);
         OpenGL.glVertex2f(var7, var8);
         OpenGL.glVertex2f(var7, var10);
         OpenGL.glVertex2f(var9, var10);
         OpenGL.glVertex2f(var9, var8);
         OpenGL.glEnd();
         if (this.field9702) {
            OpenGL.glEnable(32925);
         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field9769[49] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "b",
      descriptor = "(ILen;)V"
   )
   public final void method4746(int arg0, class447 arg1) {
      try {
         ++field9401;
         if (arg0 != -1) {
            this.field9719 = null;
         }

         if (!this.field9732) {
            if (~this.field9625 <= -1 && this.field9629[this.field9625] == arg1) {
               this.field9629[this.field9625--] = null;
               arg1.method2928(6150);
               if (this.field9625 < 0) {
                  this.field9623 = this.field9621 = null;
               } else {
                  this.field9623 = this.field9621 = this.field9629[this.field9625];
                  this.field9623.method2926(-21720);
               }
            } else {
               throw new RuntimeException();
            }
         } else {
            this.method4755(9741, arg1);
            this.method4780(1, arg1);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[141] + arg0 + ',' + (arg1 != null ? field9769[4] : field9769[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method647(Canvas arg0, int arg1, int arg2) {
      try {
         long var4;
         label37: {
            ++field9438;
            var4 = 0L;
            if (arg0 != null && this.field9461 != arg0) {
               if (!this.field9564.containsKey(arg0)) {
                  break label37;
               }

               Long var6 = (Long)this.field9564.get(arg0);
               var4 = var6;
               if (!client.field1786) {
                  break label37;
               }
            }

            var4 = this.field9592;
         }

         if (~var4 == -1L) {
            throw new RuntimeException();
         } else {
            this.field9485.surfaceResized(var4);
            if (this.field9460 == arg0) {
               this.method4772(4);
            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field9769[73] + (arg0 != null ? field9769[4] : field9769[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "m",
      descriptor = "()Z"
   )
   public final boolean method673() {
      try {
         ++field9433;
         return true;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9769[213] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "g",
      descriptor = "(II)V"
   )
   public final synchronized void method4747(int arg0, int arg1) {
      try {
         ++field9533;
         class294 var3 = new class294();
         var3.field4655 = (long)arg0;
         this.field9639.method4980(var3, 0);
         int var4 = -75 / ((arg1 - -5) / 43);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9769[146] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "l",
      descriptor = "(I)I"
   )
   private final int method4748(int arg0) {
      try {
         ++field9538;
         int var2 = 0;
         this.field9748 = OpenGL.glGetString(7936).toLowerCase();
         this.field9757 = OpenGL.glGetString(7937).toLowerCase();
         if (~this.field9748.indexOf(field9769[173]) != 0) {
            var2 |= 1;
         }

         if (this.field9748.indexOf(field9769[163]) != -1 || this.field9748.indexOf(field9769[160]) != -1) {
            var2 |= 1;
         }

         label58: {
            String var3 = OpenGL.glGetString(7938);
            String[] var4 = class9.method53(var3.replace('.', ' '), ' ', (byte)-103);
            if (~var4.length <= -3) {
               try {
                  int var5 = class243.method2076(false, var4[0]);
                  int var6 = class243.method2076(false, var4[1]);
                  this.field9682 = var5 * 10 + var6;
                  break label58;
               } catch (NumberFormatException var9) {
                  var2 |= 4;
                  if (!client.field1786) {
                     break label58;
                  }
               }
            }

            var2 |= 4;
         }

         if (~this.field9682 > -13) {
            var2 |= 2;
         }

         if (!this.field9485.method5260(field9769[165])) {
            var2 |= 8;
         }

         if (!this.field9485.method5260(field9769[158])) {
            var2 |= 32;
         }

         int[] var7 = new int[1];
         OpenGL.glGetIntegerv(34018, var7, 0);
         this.field9704 = var7[0];
         OpenGL.glGetIntegerv(34929, var7, 0);
         this.field9708 = var7[0];
         OpenGL.glGetIntegerv(34930, var7, 0);
         this.field9746 = var7[0];
         if (this.field9704 < 2 || ~this.field9708 > -3 || this.field9746 < 2) {
            var2 |= 16;
         }

         this.field9695 = Stream.method5249();
         this.field9691 = this.field9485.arePbuffersAvailable();
         this.field9760 = this.field9485.method5260(field9769[162]);
         this.field9702 = this.field9485.method5260(field9769[157]);
         this.field9716 = this.field9485.method5260(field9769[155]);
         this.field9485.method5260(field9769[161]);
         this.field9674 = this.field9485.method5260(field9769[171]);
         this.field9735 = this.field9485.method5260(field9769[156]);
         this.field9679 = this.field9485.method5260(field9769[167]);
         this.field9700 = this.field9485.method5260(field9769[170]);
         this.field9654 = this.field9485.method5260(field9769[164]);
         this.field9709 = this.field9485.method5260(field9769[169]);
         this.field9652 = false;
         this.field9737 = this.field9485.method5260(field9769[174]);
         if (arg0 != 14) {
            return -32;
         } else {
            this.field9732 = this.field9485.method5260(field9769[159]);
            this.field9685 = this.field9485.method5260(field9769[168]);
            this.field9672 = this.field9732 & this.field9685;
            this.field9657 = class581.field8576.startsWith(field9769[172]);
            OpenGL.glGetFloatv(2834, class371.field5757, 0);
            this.field9653 = class371.field5757[0];
            this.field9678 = class371.field5757[1];
            return ~var2 == -1 ? 0 : var2;
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field9769[166] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method4749(boolean arg0, boolean arg1) {
      try {
         if (arg0) {
            ++field9495;
            if (!arg1 != !this.field9726) {
               this.field9726 = arg1;
               this.method4769((byte)-99);
               this.field9645 &= -8;
            }
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[18] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "ra",
      descriptor = "(IIII)V"
   )
   public final void method683(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field9705 = arg2;
         this.field9667 = true;
         this.field9666 = arg0;
         this.field9663 = arg3;
         this.field9686 = arg1;
         ++field9479;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9769[112] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "A",
      descriptor = "(I)V"
   )
   public final void method4750(int arg0) {
      try {
         OpenGL.glLightfv(16384, 4611, this.field9724, 0);
         ++field9537;
         int var2 = -15 % ((arg0 - -53) / 60);
         OpenGL.glLightfv(16385, 4611, this.field9714, 0);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[200] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "y",
      descriptor = "(I)V"
   )
   private final void method4751(int arg0) {
      boolean var2 = client.field1786;

      try {
         this.method4805(-2, (byte)26);
         ++field9498;
         int var3 = 59 / ((arg0 - 49) / 33);
         int var4 = this.field9704 + -1;
         if (var2) {
            this.method4787(-79, var4);
            this.method4792(-26367, (class799)null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            --var4;
         }

         while(true) {
            while(~var4 <= -1) {
               this.method4787(-79, var4);
               this.method4792(-26367, (class799)null);
               OpenGL.glTexEnvi(8960, 8704, 34160);
               --var4;
            }

            this.method4803(8448, 8448, true);
            this.method4809(770, (byte)-128, 34168, 2);
            this.method4729((byte)110);
            this.field9644 = 1;
            OpenGL.glEnable(3042);
            OpenGL.glBlendFunc(770, 771);
            this.field9642 = 1;
            OpenGL.glEnable(3008);
            OpenGL.glAlphaFunc(516, 0.0F);
            this.field9643 = true;
            OpenGL.glColorMask(true, true, true, true);
            this.field9649 = true;
            this.method4762(true, (byte)-124);
            this.method4749(true, true);
            this.method4807(true, false);
            this.method4779((byte)-35, true);
            this.method4784(0);
            this.field9485.setSwapInterval(0);
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
            float[] var5 = new float[]{0.0F, 0.0F, 0.0F, 1.0F};
            int var6 = 0;
            if (!var2) {
               int var7;
               if (var2) {
                  var7 = 16384 + var6;
                  OpenGL.glLightfv(var7, 4608, var5, 0);
                  OpenGL.glLightf(var7, 4615, 0.0F);
                  OpenGL.glLightf(var7, 4616, 0.0F);
                  ++var6;
               }

               while(true) {
                  short var10000;
                  int var10001;
                  if (~var6 <= -9) {
                     OpenGL.glEnable(16384);
                     OpenGL.glEnable(16385);
                     OpenGL.glFogf(2914, 0.95F);
                     OpenGL.glFogi(2917, 9729);
                     var10000 = 3156;
                     var10001 = 4353;
                     if (!var2) {
                        OpenGL.glHint(3156, 4353);
                        this.field9723 = this.field9706 = -1;
                        this.method701();
                        return;
                     }
                  } else {
                     var10000 = 16384;
                     var10001 = var6;
                  }

                  var7 = var10000 + var10001;
                  OpenGL.glLightfv(var7, 4608, var5, 0);
                  OpenGL.glLightf(var7, 4615, 0.0F);
                  OpenGL.glLightf(var7, 4616, 0.0F);
                  ++var6;
               }
            }

            --var4;
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field9769[145] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "b",
      descriptor = "()Lap;"
   )
   public final class266 method653() {
      boolean var1 = client.field1786;

      try {
         ++field9478;
         int var2 = -1;
         if (~this.field9748.indexOf(field9769[216]) != 0) {
            var2 = 4318;
            if (!var1) {
               return new class266(var2, field9769[217], this.field9682, this.field9757, 0L);
            }
         }

         if (this.field9748.indexOf(field9769[136]) == -1) {
            if (~this.field9748.indexOf(field9769[215]) == 0) {
               return new class266(var2, field9769[217], this.field9682, this.field9757, 0L);
            }

            var2 = 4098;
            if (!var1) {
               return new class266(var2, field9769[217], this.field9682, this.field9757, 0L);
            }
         }

         var2 = 32902;
         return new class266(var2, field9769[217], this.field9682, this.field9757, 0L);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[214] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "n",
      descriptor = "(I)V"
   )
   private final void method4752(int arg0) {
      try {
         if (arg0 != 16) {
            this.field9705 = 108;
         }

         if (this.field9733 != 3) {
            this.field9733 = 3;
            this.method4767(87);
            this.method4766(arg0 + 43);
            this.field9645 &= -8;
         }

         ++field9409;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[70] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "KA",
      descriptor = "(IIII)V"
   )
   public final void method629(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (~arg0 > -1) {
            arg0 = 0;
         }

         if (this.field9472 < arg3) {
            arg3 = this.field9472;
         }

         ++field9530;
         if (arg1 < 0) {
            arg1 = 0;
         }

         if (~this.field9599 > ~arg2) {
            arg2 = this.field9599;
         }

         this.field9668 = arg2;
         this.field9680 = arg1;
         this.field9673 = arg0;
         this.field9759 = arg3;
         OpenGL.glEnable(3089);
         this.method4810((byte)-74);
         this.method4800((byte)97);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9769[50] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "ya",
      descriptor = "()V"
   )
   public final void method655() {
      try {
         this.method4779((byte)-35, true);
         ++field9545;
         OpenGL.glClear(256);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9769[188] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "e",
      descriptor = "(IIIIII)V"
   )
   public final void method602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field9593;
         float var7 = (float)arg0 + 0.35F;
         float var8 = (float)arg1 + 0.35F;
         float var9 = (float)arg2 + var7 - 1.0F;
         this.method4731(28626);
         float var10 = (float)arg3 + var8 - 1.0F;
         this.method4783(3008, arg5);
         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         if (this.field9702) {
            OpenGL.glDisable(32925);
         }

         OpenGL.glBegin(2);
         OpenGL.glVertex2f(var7, var8);
         OpenGL.glVertex2f(var7, var10);
         OpenGL.glVertex2f(var9, var10);
         OpenGL.glVertex2f(var9, var8);
         OpenGL.glEnd();
         if (this.field9702) {
            OpenGL.glEnable(32925);
         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field9769[120] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(IBI)V"
   )
   public final synchronized void method4753(int arg0, byte arg1, int arg2) {
      try {
         ++field9417;
         if (arg1 <= 78) {
            this.method640();
         }

         class668 var4 = new class668(arg2);
         var4.field4655 = (long)arg0;
         this.field9636.method4980(var4, 0);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9769[177] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(Lfca;I)V"
   )
   public final void method641(class43 arg0, int arg1) {
      try {
         ++field9490;
         this.field9604.method4712((byte)114, arg0, this, arg1);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[89] + (arg0 != null ? field9769[4] : field9769[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "h",
      descriptor = "(I)Lza;"
   )
   public final class624 method634(int arg0) {
      try {
         ++field9443;
         class88 var2 = new class88(arg0);
         this.field9616.method4980(var2, 0);
         return var2;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[148] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "f",
      descriptor = "(II)V"
   )
   public final void method670(int arg0, int arg1) {
      try {
         if (~this.field9753 != ~arg0 || this.field9664 != arg1) {
            label32: {
               this.field9664 = arg1;
               this.field9753 = arg0;
               this.method4770((byte)118);
               this.method4778((byte)-45);
               if (~this.field9733 != -4) {
                  if (this.field9733 != 2) {
                     break label32;
                  }

                  this.method4793(false);
                  if (!client.field1786) {
                     break label32;
                  }
               }

               this.method4767(97);
            }
         }

         ++field9407;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[32] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "h",
      descriptor = "(II)I"
   )
   public final int method4754(int arg0, int arg1) {
      try {
         ++field9526;
         if (arg0 != 6) {
            this.method4793(true);
         }

         if (arg1 != 6406 && arg1 != 6409) {
            if (~arg1 != -6411 && arg1 != 34846 && ~arg1 != -34845) {
               if (~arg1 == -6408) {
                  return 3;
               } else if (~arg1 != -6409 && ~arg1 != -34848) {
                  if (~arg1 == -34844) {
                     return 6;
                  } else if (~arg1 != -34843) {
                     if (~arg1 == -6403) {
                        return 3;
                     } else if (~arg1 == -6402) {
                        return 1;
                     } else {
                        throw new IllegalArgumentException("");
                     }
                  } else {
                     return 8;
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
         throw class482.method3757(var4, field9769[212] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(IIZ)Ljq;"
   )
   public final class672 method697(int arg0, int arg1, boolean arg2) {
      try {
         ++field9532;
         return new class355(this, arg0, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9769[94] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;"
   )
   public final class271 method612(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      try {
         ++field9457;
         return new class361(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field9769[81] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9769[4] : field9769[3]) + ',' + (arg3 != null ? field9769[4] : field9769[3]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method632(boolean arg0) {
      try {
         ++field9535;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[206] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(ILen;)V"
   )
   public final void method4755(int arg0, class447 arg1) {
      try {
         ++field9568;
         if (this.field9624 >= 0 && this.field9622[this.field9624] == arg1) {
            this.field9622[this.field9624--] = null;
            arg1.method2938(-105);
            if (~this.field9624 > -1) {
               this.field9623 = null;
            } else {
               this.field9623 = this.field9622[this.field9624];
               this.field9623.method2925((byte)-108);
            }

            if (arg0 != 9741) {
               this.method585();
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[106] + arg0 + ',' + (arg1 != null ? field9769[4] : field9769[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "k",
      descriptor = "(II)V"
   )
   public final void method4756(int arg0, int arg1) {
      try {
         class371.field5757[1] = (float)class408.method3277(65280, arg0) / 65280.0F;
         ++field9484;
         class371.field5757[3] = (float)(arg0 >>> 24) / 255.0F;
         class371.field5757[2] = (float)class408.method3277(arg0, 255) / 255.0F;
         if (arg1 >= 10) {
            class371.field5757[0] = (float)class408.method3277(arg0, 16711680) / 1.671168E7F;
            OpenGL.glTexEnvfv(8960, 8705, class371.field5757, 0);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[221] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "B",
      descriptor = "(I)V"
   )
   private final void method4757(int arg0) {
      try {
         ++field9496;
         this.field9485.method5262();
         if (arg0 != -29305) {
            this.field9665 = false;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[179] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "A",
      descriptor = "()V"
   )
   public final void method705() {
      try {
         ++field9486;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9769[101] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(I)V"
   )
   public final synchronized void method681(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field9574;
         int var15 = arg0 & Integer.MAX_VALUE;
         int var3 = 0;
         int var10000;
         if (var2 || !this.field9635.method4978(15590)) {
            do {
               class668 var4 = (class668)this.field9635.method4974(114);
               class558.field8310[var3++] = (int)var4.field4655;
               this.field9634 -= var4.field9986;
               var10000 = ~var3;

               while(var10000 == -1001) {
                  OpenGL.glDeleteBuffersARB(var3, class558.field8310, 0);
                  var10000 = 0;
                  if (!var2) {
                     var3 = 0;
                     break;
                  }
               }
            } while(!this.field9635.method4978(15590));
         }

         class668 var5;
         class668 var6;
         class668 var7;
         boolean var8;
         class668 var9;
         class294 var10;
         class294 var11;
         class668 var12;
         byte var16;
         class652 var18;
         if (~var3 < -1) {
            OpenGL.glDeleteBuffersARB(var3, class558.field8310, 0);
            var3 = 0;
            if (var2) {
               var5 = (class668)this.field9636.method4974(91);
               class558.field8310[var3++] = (int)var5.field4655;
               this.field9632 -= var5.field9986;
               var10000 = var3;
            } else {
               if (this.field9636.method4978(15590)) {
                  label687: {
                     if (~var3 < -1) {
                        OpenGL.glDeleteTextures(var3, class558.field8310, 0);
                        var3 = 0;
                        if (var2) {
                           var6 = (class668)this.field9637.method4974(119);
                           class558.field8310[var3++] = var6.field9986;
                           var10000 = ~var3;
                        } else {
                           if (this.field9637.method4978(15590)) {
                              break label687;
                           }

                           var6 = (class668)this.field9637.method4974(119);
                           class558.field8310[var3++] = var6.field9986;
                           var10000 = ~var3;
                        }
                     } else {
                        if (this.field9637.method4978(15590)) {
                           break label687;
                        }

                        var6 = (class668)this.field9637.method4974(119);
                        class558.field8310[var3++] = var6.field9986;
                        var10000 = ~var3;
                     }

                     while(true) {
                        while(var10000 == -1001) {
                           OpenGL.glDeleteFramebuffersEXT(var3, class558.field8310, 0);
                           var10000 = 0;
                           if (!var2) {
                              var3 = 0;
                              break;
                           }
                        }

                        if (this.field9637.method4978(15590)) {
                           break;
                        }

                        var6 = (class668)this.field9637.method4974(119);
                        class558.field8310[var3++] = var6.field9986;
                        var10000 = ~var3;
                     }
                  }

                  if (var3 > 0) {
                     OpenGL.glDeleteFramebuffersEXT(var3, class558.field8310, 0);
                     var16 = 0;
                     if (var2) {
                        var7 = (class668)this.field9638.method4974(103);
                        var3 = var16 + 1;
                        class558.field8310[var16] = (int)var7.field4655;
                        this.field9631 -= var7.field9986;
                        var10000 = ~var3;
                     } else {
                        if (this.field9638.method4978(15590)) {
                           label745: {
                              if (var16 > 0) {
                                 OpenGL.glDeleteRenderbuffersEXT(var16, class558.field8310, 0);
                                 var8 = false;
                                 if (!var2 && this.field9633.method4978(15590)) {
                                    break label745;
                                 }
                              } else if (this.field9633.method4978(15590)) {
                                 break label745;
                              }

                              do {
                                 var9 = (class668)this.field9633.method4974(85);
                                 OpenGL.glDeleteLists((int)var9.field4655, var9.field9986);
                              } while(!this.field9633.method4978(15590));
                           }

                           if (var2) {
                              var10 = this.field9639.method4974(87);
                              OpenGL.glDeleteProgramARB((int)var10.field4655);
                           }

                           while(!this.field9639.method4978(15590)) {
                              var10 = this.field9639.method4974(87);
                              OpenGL.glDeleteProgramARB((int)var10.field4655);
                           }

                           if (var2 || !this.field9640.method4978(15590)) {
                              do {
                                 var11 = this.field9640.method4974(95);
                                 OpenGL.glDeleteObjectARB(var11.field4655);
                              } while(!this.field9640.method4978(15590));
                           }

                           if (var2) {
                              var12 = (class668)this.field9633.method4974(122);
                              OpenGL.glDeleteLists((int)var12.field4655, var12.field9986);
                           }

                           while(true) {
                              if (this.field9633.method4978(15590)) {
                                 this.field9603.method190(false);
                                 var18 = this;
                                 if (!var2) {
                                    if (~this.method661() < -100663297 && ~class162.method1442(14080) < ~(this.field9641 + 60000L)) {
                                       System.gc();
                                       this.field9641 = class162.method1442(14080);
                                    }

                                    this.field9615 = var15;
                                    return;
                                 }
                              } else {
                                 var18 = this;
                              }

                              var12 = (class668)var18.field9633.method4974(122);
                              OpenGL.glDeleteLists((int)var12.field4655, var12.field9986);
                           }
                        }

                        var7 = (class668)this.field9638.method4974(103);
                        var3 = var16 + 1;
                        class558.field8310[var16] = (int)var7.field4655;
                        this.field9631 -= var7.field9986;
                        var10000 = ~var3;
                     }
                  } else {
                     if (this.field9638.method4978(15590)) {
                        label831: {
                           if (var3 > 0) {
                              OpenGL.glDeleteRenderbuffersEXT(var3, class558.field8310, 0);
                              var8 = false;
                              if (!var2 && this.field9633.method4978(15590)) {
                                 break label831;
                              }
                           } else if (this.field9633.method4978(15590)) {
                              break label831;
                           }

                           do {
                              var9 = (class668)this.field9633.method4974(85);
                              OpenGL.glDeleteLists((int)var9.field4655, var9.field9986);
                           } while(!this.field9633.method4978(15590));
                        }

                        if (var2) {
                           var10 = this.field9639.method4974(87);
                           OpenGL.glDeleteProgramARB((int)var10.field4655);
                        }

                        while(!this.field9639.method4978(15590)) {
                           var10 = this.field9639.method4974(87);
                           OpenGL.glDeleteProgramARB((int)var10.field4655);
                        }

                        if (var2 || !this.field9640.method4978(15590)) {
                           do {
                              var11 = this.field9640.method4974(95);
                              OpenGL.glDeleteObjectARB(var11.field4655);
                           } while(!this.field9640.method4978(15590));
                        }

                        if (var2) {
                           var12 = (class668)this.field9633.method4974(122);
                           OpenGL.glDeleteLists((int)var12.field4655, var12.field9986);
                        }

                        while(true) {
                           if (this.field9633.method4978(15590)) {
                              this.field9603.method190(false);
                              var18 = this;
                              if (!var2) {
                                 if (~this.method661() < -100663297 && ~class162.method1442(14080) < ~(this.field9641 + 60000L)) {
                                    System.gc();
                                    this.field9641 = class162.method1442(14080);
                                 }

                                 this.field9615 = var15;
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class668)var18.field9633.method4974(122);
                           OpenGL.glDeleteLists((int)var12.field4655, var12.field9986);
                        }
                     }

                     var7 = (class668)this.field9638.method4974(103);
                     class558.field8310[var3++] = (int)var7.field4655;
                     this.field9631 -= var7.field9986;
                     var10000 = ~var3;
                  }

                  while(true) {
                     while(var10000 == -1001) {
                        OpenGL.glDeleteRenderbuffersEXT(var3, class558.field8310, 0);
                        var10000 = 0;
                        if (!var2) {
                           var3 = 0;
                           break;
                        }
                     }

                     if (this.field9638.method4978(15590)) {
                        label930: {
                           if (var3 > 0) {
                              OpenGL.glDeleteRenderbuffersEXT(var3, class558.field8310, 0);
                              var8 = false;
                              if (!var2 && this.field9633.method4978(15590)) {
                                 break label930;
                              }
                           } else if (this.field9633.method4978(15590)) {
                              break label930;
                           }

                           do {
                              var9 = (class668)this.field9633.method4974(85);
                              OpenGL.glDeleteLists((int)var9.field4655, var9.field9986);
                           } while(!this.field9633.method4978(15590));
                        }

                        if (var2) {
                           var10 = this.field9639.method4974(87);
                           OpenGL.glDeleteProgramARB((int)var10.field4655);
                        }

                        while(!this.field9639.method4978(15590)) {
                           var10 = this.field9639.method4974(87);
                           OpenGL.glDeleteProgramARB((int)var10.field4655);
                        }

                        if (var2 || !this.field9640.method4978(15590)) {
                           do {
                              var11 = this.field9640.method4974(95);
                              OpenGL.glDeleteObjectARB(var11.field4655);
                           } while(!this.field9640.method4978(15590));
                        }

                        if (var2) {
                           var12 = (class668)this.field9633.method4974(122);
                           OpenGL.glDeleteLists((int)var12.field4655, var12.field9986);
                        }

                        while(true) {
                           if (this.field9633.method4978(15590)) {
                              this.field9603.method190(false);
                              var18 = this;
                              if (!var2) {
                                 if (~this.method661() < -100663297 && ~class162.method1442(14080) < ~(this.field9641 + 60000L)) {
                                    System.gc();
                                    this.field9641 = class162.method1442(14080);
                                 }

                                 this.field9615 = var15;
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class668)var18.field9633.method4974(122);
                           OpenGL.glDeleteLists((int)var12.field4655, var12.field9986);
                        }
                     }

                     var7 = (class668)this.field9638.method4974(103);
                     class558.field8310[var3++] = (int)var7.field4655;
                     this.field9631 -= var7.field9986;
                     var10000 = ~var3;
                  }
               }

               var5 = (class668)this.field9636.method4974(91);
               class558.field8310[var3++] = (int)var5.field4655;
               this.field9632 -= var5.field9986;
               var10000 = var3;
            }
         } else {
            if (this.field9636.method4978(15590)) {
               label357: {
                  if (~var3 < -1) {
                     OpenGL.glDeleteTextures(var3, class558.field8310, 0);
                     var3 = 0;
                     if (var2) {
                        var6 = (class668)this.field9637.method4974(119);
                        class558.field8310[var3++] = var6.field9986;
                        var10000 = ~var3;
                     } else {
                        if (this.field9637.method4978(15590)) {
                           break label357;
                        }

                        var6 = (class668)this.field9637.method4974(119);
                        class558.field8310[var3++] = var6.field9986;
                        var10000 = ~var3;
                     }
                  } else {
                     if (this.field9637.method4978(15590)) {
                        break label357;
                     }

                     var6 = (class668)this.field9637.method4974(119);
                     class558.field8310[var3++] = var6.field9986;
                     var10000 = ~var3;
                  }

                  while(true) {
                     while(var10000 == -1001) {
                        OpenGL.glDeleteFramebuffersEXT(var3, class558.field8310, 0);
                        var10000 = 0;
                        if (!var2) {
                           var3 = 0;
                           break;
                        }
                     }

                     if (this.field9637.method4978(15590)) {
                        break;
                     }

                     var6 = (class668)this.field9637.method4974(119);
                     class558.field8310[var3++] = var6.field9986;
                     var10000 = ~var3;
                  }
               }

               if (var3 > 0) {
                  OpenGL.glDeleteFramebuffersEXT(var3, class558.field8310, 0);
                  var16 = 0;
                  if (var2) {
                     var7 = (class668)this.field9638.method4974(103);
                     var3 = var16 + 1;
                     class558.field8310[var16] = (int)var7.field4655;
                     this.field9631 -= var7.field9986;
                     var10000 = ~var3;
                  } else {
                     if (this.field9638.method4978(15590)) {
                        label415: {
                           if (var16 > 0) {
                              OpenGL.glDeleteRenderbuffersEXT(var16, class558.field8310, 0);
                              var8 = false;
                              if (!var2 && this.field9633.method4978(15590)) {
                                 break label415;
                              }
                           } else if (this.field9633.method4978(15590)) {
                              break label415;
                           }

                           do {
                              var9 = (class668)this.field9633.method4974(85);
                              OpenGL.glDeleteLists((int)var9.field4655, var9.field9986);
                           } while(!this.field9633.method4978(15590));
                        }

                        if (var2) {
                           var10 = this.field9639.method4974(87);
                           OpenGL.glDeleteProgramARB((int)var10.field4655);
                        }

                        while(!this.field9639.method4978(15590)) {
                           var10 = this.field9639.method4974(87);
                           OpenGL.glDeleteProgramARB((int)var10.field4655);
                        }

                        if (var2 || !this.field9640.method4978(15590)) {
                           do {
                              var11 = this.field9640.method4974(95);
                              OpenGL.glDeleteObjectARB(var11.field4655);
                           } while(!this.field9640.method4978(15590));
                        }

                        if (var2) {
                           var12 = (class668)this.field9633.method4974(122);
                           OpenGL.glDeleteLists((int)var12.field4655, var12.field9986);
                        }

                        while(true) {
                           if (this.field9633.method4978(15590)) {
                              this.field9603.method190(false);
                              var18 = this;
                              if (!var2) {
                                 if (~this.method661() < -100663297 && ~class162.method1442(14080) < ~(this.field9641 + 60000L)) {
                                    System.gc();
                                    this.field9641 = class162.method1442(14080);
                                 }

                                 this.field9615 = var15;
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class668)var18.field9633.method4974(122);
                           OpenGL.glDeleteLists((int)var12.field4655, var12.field9986);
                        }
                     }

                     var7 = (class668)this.field9638.method4974(103);
                     var3 = var16 + 1;
                     class558.field8310[var16] = (int)var7.field4655;
                     this.field9631 -= var7.field9986;
                     var10000 = ~var3;
                  }
               } else {
                  if (this.field9638.method4978(15590)) {
                     label501: {
                        if (var3 > 0) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class558.field8310, 0);
                           var8 = false;
                           if (!var2 && this.field9633.method4978(15590)) {
                              break label501;
                           }
                        } else if (this.field9633.method4978(15590)) {
                           break label501;
                        }

                        do {
                           var9 = (class668)this.field9633.method4974(85);
                           OpenGL.glDeleteLists((int)var9.field4655, var9.field9986);
                        } while(!this.field9633.method4978(15590));
                     }

                     if (var2) {
                        var10 = this.field9639.method4974(87);
                        OpenGL.glDeleteProgramARB((int)var10.field4655);
                     }

                     while(!this.field9639.method4978(15590)) {
                        var10 = this.field9639.method4974(87);
                        OpenGL.glDeleteProgramARB((int)var10.field4655);
                     }

                     if (var2 || !this.field9640.method4978(15590)) {
                        do {
                           var11 = this.field9640.method4974(95);
                           OpenGL.glDeleteObjectARB(var11.field4655);
                        } while(!this.field9640.method4978(15590));
                     }

                     if (var2) {
                        var12 = (class668)this.field9633.method4974(122);
                        OpenGL.glDeleteLists((int)var12.field4655, var12.field9986);
                     }

                     while(true) {
                        if (this.field9633.method4978(15590)) {
                           this.field9603.method190(false);
                           var18 = this;
                           if (!var2) {
                              if (~this.method661() < -100663297 && ~class162.method1442(14080) < ~(this.field9641 + 60000L)) {
                                 System.gc();
                                 this.field9641 = class162.method1442(14080);
                              }

                              this.field9615 = var15;
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class668)var18.field9633.method4974(122);
                        OpenGL.glDeleteLists((int)var12.field4655, var12.field9986);
                     }
                  }

                  var7 = (class668)this.field9638.method4974(103);
                  class558.field8310[var3++] = (int)var7.field4655;
                  this.field9631 -= var7.field9986;
                  var10000 = ~var3;
               }

               while(true) {
                  while(var10000 == -1001) {
                     OpenGL.glDeleteRenderbuffersEXT(var3, class558.field8310, 0);
                     var10000 = 0;
                     if (!var2) {
                        var3 = 0;
                        break;
                     }
                  }

                  if (this.field9638.method4978(15590)) {
                     label600: {
                        if (var3 > 0) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class558.field8310, 0);
                           var8 = false;
                           if (!var2 && this.field9633.method4978(15590)) {
                              break label600;
                           }
                        } else if (this.field9633.method4978(15590)) {
                           break label600;
                        }

                        do {
                           var9 = (class668)this.field9633.method4974(85);
                           OpenGL.glDeleteLists((int)var9.field4655, var9.field9986);
                        } while(!this.field9633.method4978(15590));
                     }

                     if (var2) {
                        var10 = this.field9639.method4974(87);
                        OpenGL.glDeleteProgramARB((int)var10.field4655);
                     }

                     while(!this.field9639.method4978(15590)) {
                        var10 = this.field9639.method4974(87);
                        OpenGL.glDeleteProgramARB((int)var10.field4655);
                     }

                     if (var2 || !this.field9640.method4978(15590)) {
                        do {
                           var11 = this.field9640.method4974(95);
                           OpenGL.glDeleteObjectARB(var11.field4655);
                        } while(!this.field9640.method4978(15590));
                     }

                     if (var2) {
                        var12 = (class668)this.field9633.method4974(122);
                        OpenGL.glDeleteLists((int)var12.field4655, var12.field9986);
                     }

                     while(true) {
                        if (this.field9633.method4978(15590)) {
                           this.field9603.method190(false);
                           var18 = this;
                           if (!var2) {
                              if (~this.method661() < -100663297 && ~class162.method1442(14080) < ~(this.field9641 + 60000L)) {
                                 System.gc();
                                 this.field9641 = class162.method1442(14080);
                              }

                              this.field9615 = var15;
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class668)var18.field9633.method4974(122);
                        OpenGL.glDeleteLists((int)var12.field4655, var12.field9986);
                     }
                  }

                  var7 = (class668)this.field9638.method4974(103);
                  class558.field8310[var3++] = (int)var7.field4655;
                  this.field9631 -= var7.field9986;
                  var10000 = ~var3;
               }
            }

            var5 = (class668)this.field9636.method4974(91);
            class558.field8310[var3++] = (int)var5.field4655;
            this.field9632 -= var5.field9986;
            var10000 = var3;
         }

         while(true) {
            while(var10000 == 1000) {
               OpenGL.glDeleteTextures(var3, class558.field8310, 0);
               var10000 = 0;
               if (!var2) {
                  var3 = 0;
                  break;
               }
            }

            if (this.field9636.method4978(15590)) {
               label137: {
                  if (~var3 < -1) {
                     OpenGL.glDeleteTextures(var3, class558.field8310, 0);
                     var3 = 0;
                     if (var2) {
                        var6 = (class668)this.field9637.method4974(119);
                        class558.field8310[var3++] = var6.field9986;
                        var10000 = ~var3;
                     } else {
                        if (this.field9637.method4978(15590)) {
                           break label137;
                        }

                        var6 = (class668)this.field9637.method4974(119);
                        class558.field8310[var3++] = var6.field9986;
                        var10000 = ~var3;
                     }
                  } else {
                     if (this.field9637.method4978(15590)) {
                        break label137;
                     }

                     var6 = (class668)this.field9637.method4974(119);
                     class558.field8310[var3++] = var6.field9986;
                     var10000 = ~var3;
                  }

                  while(true) {
                     while(var10000 == -1001) {
                        OpenGL.glDeleteFramebuffersEXT(var3, class558.field8310, 0);
                        var10000 = 0;
                        if (!var2) {
                           var3 = 0;
                           break;
                        }
                     }

                     if (this.field9637.method4978(15590)) {
                        break;
                     }

                     var6 = (class668)this.field9637.method4974(119);
                     class558.field8310[var3++] = var6.field9986;
                     var10000 = ~var3;
                  }
               }

               if (var3 > 0) {
                  OpenGL.glDeleteFramebuffersEXT(var3, class558.field8310, 0);
                  var16 = 0;
                  if (var2) {
                     var7 = (class668)this.field9638.method4974(103);
                     var3 = var16 + 1;
                     class558.field8310[var16] = (int)var7.field4655;
                     this.field9631 -= var7.field9986;
                     var10000 = ~var3;
                  } else {
                     if (this.field9638.method4978(15590)) {
                        label237: {
                           if (var16 > 0) {
                              OpenGL.glDeleteRenderbuffersEXT(var16, class558.field8310, 0);
                              var8 = false;
                              if (!var2 && this.field9633.method4978(15590)) {
                                 break label237;
                              }
                           } else if (this.field9633.method4978(15590)) {
                              break label237;
                           }

                           do {
                              var9 = (class668)this.field9633.method4974(85);
                              OpenGL.glDeleteLists((int)var9.field4655, var9.field9986);
                           } while(!this.field9633.method4978(15590));
                        }

                        if (var2) {
                           var10 = this.field9639.method4974(87);
                           OpenGL.glDeleteProgramARB((int)var10.field4655);
                        }

                        while(!this.field9639.method4978(15590)) {
                           var10 = this.field9639.method4974(87);
                           OpenGL.glDeleteProgramARB((int)var10.field4655);
                        }

                        if (var2 || !this.field9640.method4978(15590)) {
                           do {
                              var11 = this.field9640.method4974(95);
                              OpenGL.glDeleteObjectARB(var11.field4655);
                           } while(!this.field9640.method4978(15590));
                        }

                        if (var2) {
                           var12 = (class668)this.field9633.method4974(122);
                           OpenGL.glDeleteLists((int)var12.field4655, var12.field9986);
                        }

                        while(true) {
                           if (this.field9633.method4978(15590)) {
                              this.field9603.method190(false);
                              var18 = this;
                              if (!var2) {
                                 if (~this.method661() < -100663297 && ~class162.method1442(14080) < ~(this.field9641 + 60000L)) {
                                    System.gc();
                                    this.field9641 = class162.method1442(14080);
                                 }

                                 this.field9615 = var15;
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class668)var18.field9633.method4974(122);
                           OpenGL.glDeleteLists((int)var12.field4655, var12.field9986);
                        }
                     }

                     var7 = (class668)this.field9638.method4974(103);
                     var3 = var16 + 1;
                     class558.field8310[var16] = (int)var7.field4655;
                     this.field9631 -= var7.field9986;
                     var10000 = ~var3;
                  }
               } else {
                  if (this.field9638.method4978(15590)) {
                     label150: {
                        if (var3 > 0) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class558.field8310, 0);
                           var8 = false;
                           if (!var2 && this.field9633.method4978(15590)) {
                              break label150;
                           }
                        } else if (this.field9633.method4978(15590)) {
                           break label150;
                        }

                        do {
                           var9 = (class668)this.field9633.method4974(85);
                           OpenGL.glDeleteLists((int)var9.field4655, var9.field9986);
                        } while(!this.field9633.method4978(15590));
                     }

                     if (var2) {
                        var10 = this.field9639.method4974(87);
                        OpenGL.glDeleteProgramARB((int)var10.field4655);
                     }

                     while(!this.field9639.method4978(15590)) {
                        var10 = this.field9639.method4974(87);
                        OpenGL.glDeleteProgramARB((int)var10.field4655);
                     }

                     if (var2 || !this.field9640.method4978(15590)) {
                        do {
                           var11 = this.field9640.method4974(95);
                           OpenGL.glDeleteObjectARB(var11.field4655);
                        } while(!this.field9640.method4978(15590));
                     }

                     if (var2) {
                        var12 = (class668)this.field9633.method4974(122);
                        OpenGL.glDeleteLists((int)var12.field4655, var12.field9986);
                     }

                     while(true) {
                        if (this.field9633.method4978(15590)) {
                           this.field9603.method190(false);
                           var18 = this;
                           if (!var2) {
                              if (~this.method661() < -100663297 && ~class162.method1442(14080) < ~(this.field9641 + 60000L)) {
                                 System.gc();
                                 this.field9641 = class162.method1442(14080);
                              }

                              this.field9615 = var15;
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class668)var18.field9633.method4974(122);
                        OpenGL.glDeleteLists((int)var12.field4655, var12.field9986);
                     }
                  }

                  var7 = (class668)this.field9638.method4974(103);
                  class558.field8310[var3++] = (int)var7.field4655;
                  this.field9631 -= var7.field9986;
                  var10000 = ~var3;
               }

               while(true) {
                  while(var10000 == -1001) {
                     OpenGL.glDeleteRenderbuffersEXT(var3, class558.field8310, 0);
                     var10000 = 0;
                     if (!var2) {
                        var3 = 0;
                        break;
                     }
                  }

                  if (this.field9638.method4978(15590)) {
                     label99: {
                        if (var3 > 0) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class558.field8310, 0);
                           var8 = false;
                           if (!var2 && this.field9633.method4978(15590)) {
                              break label99;
                           }
                        } else if (this.field9633.method4978(15590)) {
                           break label99;
                        }

                        do {
                           var9 = (class668)this.field9633.method4974(85);
                           OpenGL.glDeleteLists((int)var9.field4655, var9.field9986);
                        } while(!this.field9633.method4978(15590));
                     }

                     if (var2) {
                        var10 = this.field9639.method4974(87);
                        OpenGL.glDeleteProgramARB((int)var10.field4655);
                     }

                     while(!this.field9639.method4978(15590)) {
                        var10 = this.field9639.method4974(87);
                        OpenGL.glDeleteProgramARB((int)var10.field4655);
                     }

                     if (var2 || !this.field9640.method4978(15590)) {
                        do {
                           var11 = this.field9640.method4974(95);
                           OpenGL.glDeleteObjectARB(var11.field4655);
                        } while(!this.field9640.method4978(15590));
                     }

                     if (var2) {
                        var12 = (class668)this.field9633.method4974(122);
                        OpenGL.glDeleteLists((int)var12.field4655, var12.field9986);
                     }

                     while(true) {
                        if (this.field9633.method4978(15590)) {
                           this.field9603.method190(false);
                           var18 = this;
                           if (!var2) {
                              if (~this.method661() < -100663297 && ~class162.method1442(14080) < ~(this.field9641 + 60000L)) {
                                 System.gc();
                                 this.field9641 = class162.method1442(14080);
                              }

                              this.field9615 = var15;
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class668)var18.field9633.method4974(122);
                        OpenGL.glDeleteLists((int)var12.field4655, var12.field9986);
                     }
                  }

                  var7 = (class668)this.field9638.method4974(103);
                  class558.field8310[var3++] = (int)var7.field4655;
                  this.field9631 -= var7.field9986;
                  var10000 = ~var3;
               }
            }

            var5 = (class668)this.field9636.method4974(91);
            class558.field8310[var3++] = (int)var5.field4655;
            this.field9632 -= var5.field9986;
            var10000 = var3;
         }
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field9769[21] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method685(int arg0) {
      try {
         ++field9522;
         if (arg0 != 1) {
            throw new IllegalArgumentException("");
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(BLle;)V"
   )
   public final void method4758(byte arg0, class172 arg1) {
      try {
         if (arg0 <= 118) {
            this.field9648 = true;
         }

         if (this.field9758 != arg1) {
            if (this.field9760) {
               OpenGL.glBindBufferARB(34963, arg1.method1587(5549));
            }

            this.field9758 = arg1;
         }

         ++field9515;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[43] + arg0 + ',' + (arg1 != null ? field9769[4] : field9769[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "I",
      descriptor = "()I"
   )
   public final int method591() {
      try {
         ++field9481;
         int var1 = this.field9765;
         this.field9765 = 0;
         return var1;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[130] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(IIZ[BI)Lli;"
   )
   public final class112 method4759(int arg0, int arg1, boolean arg2, byte[] arg3, int arg4) {
      try {
         ++field9528;
         if (this.field9760 && (!arg2 || this.field9722)) {
            return new class686(this, arg0, arg3, arg1, arg2);
         } else {
            if (arg4 >= -63) {
               this.method626((int[])null);
            }

            return new class569(this, arg0, arg3, arg1);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field9769[192] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9769[4] : field9769[3]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "na",
      descriptor = "(IIII)[I"
   )
   public final int[] method642(int arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field1786;

      try {
         ++field9444;
         int[] var6 = new int[arg2 * arg3];
         int var7 = 0;
         if (var5) {
            OpenGL.glReadPixelsi(arg0, -var7 + this.field9472 - arg1, arg2, 1, 32993, this.field9738, var6, arg2 * var7);
            ++var7;
         }

         while(true) {
            while(var7 < arg3) {
               OpenGL.glReadPixelsi(arg0, -var7 + this.field9472 - arg1, arg2, 1, 32993, this.field9738, var6, arg2 * var7);
               ++var7;
            }

            if (!var5) {
               return var6;
            }

            ++var7;
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field9769[198] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "H",
      descriptor = "(III[I)V"
   )
   public final void method600(int arg0, int arg1, int arg2, int[] arg3) {
      try {
         ++field9497;
         float var5 = (float)arg2 * this.field9647.field2517 + (float)arg0 * this.field9647.field2516 + (float)arg1 * this.field9647.field2514 + this.field9647.field2531;
         if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
         } else {
            int var6 = (int)(((float)arg2 * this.field9647.field2515 + (float)arg0 * this.field9647.field2533 + (float)arg1 * this.field9647.field2534 + this.field9647.field2510) * (float)this.field9745 / var5);
            int var7 = (int)(((float)arg2 * this.field9647.field2541 + (float)arg0 * this.field9647.field2530 + (float)arg1 * this.field9647.field2513 + this.field9647.field2538) * (float)this.field9717 / var5);
            arg3[0] = (int)((float)var6 - this.field9742);
            arg3[2] = (int)var5;
            arg3[1] = (int)((float)var7 - this.field9662);
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field9769[197] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9769[4] : field9769[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "b",
      descriptor = "(IIIID)V"
   )
   public final void method592(int arg0, int arg1, int arg2, int arg3, double arg4) {
      try {
         ++field9578;
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field9769[178] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "K",
      descriptor = "([I)V"
   )
   public final void method626(int[] arg0) {
      try {
         arg0[1] = this.field9680;
         arg0[3] = this.field9759;
         arg0[2] = this.field9668;
         ++field9491;
         arg0[0] = this.field9673;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[205] + (arg0 != null ? field9769[4] : field9769[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(ILle;III)V"
   )
   public final void method4760(int arg0, class172 arg1, int arg2, int arg3, int arg4) {
      try {
         if (arg4 >= -124) {
            this.method579((Canvas)null);
         }

         ++field9423;
         int var6 = arg1.method1589(25544);
         int var9 = arg3 * this.method4785(var6, 1);
         this.method4758((byte)125, arg1);
         OpenGL.glDrawElements(arg2, arg0, var6, (long)var9 + arg1.method1588(-23130));
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field9769[191] + arg0 + ',' + (arg1 != null ? field9769[4] : field9769[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "v",
      descriptor = "(I)V"
   )
   public final void method4761(int arg0) {
      try {
         if (arg0 == 4098) {
            ++field9607;
            if (this.field9645 != 8) {
               this.method4777(arg0 + -34101);
               this.method4762(true, (byte)72);
               this.method4807(true, false);
               this.method4779((byte)-35, true);
               this.method4783(arg0 + -1090, 1);
               this.field9645 = 8;
            }
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[225] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method4762(boolean arg0, byte arg1) {
      try {
         if (!arg0 == this.field9671) {
            this.field9671 = arg0;
            this.method4730(false);
            this.field9645 &= -32;
         }

         int var3 = -80 % ((-69 - arg1) / 52);
         ++field9489;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9769[181] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "d",
      descriptor = "(B)V"
   )
   public final void method4763(byte arg0) {
      try {
         if (arg0 > -112) {
            this.method4740(-114, 55);
         }

         OpenGL.glPopMatrix();
         ++field9449;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[227] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(BJ)V"
   )
   public final synchronized void method4764(byte arg0, long arg1) {
      try {
         ++field9499;
         int var4 = 119 / ((arg0 - 46) / 56);
         class294 var5 = new class294();
         var5.field4655 = arg1;
         this.field9640.method4980(var5, 0);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field9769[209] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "d",
      descriptor = "(IIIIII)Lpr;"
   )
   public final class331 method607(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field9430;
         return this.field9654 ? new class658(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field9769[53] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method4765(int arg0, byte arg1) {
      try {
         ++field9520;
         if (arg1 == -3) {
            if (arg0 != 1) {
               if (~arg0 != -1) {
                  if (~arg0 != -3) {
                     if (arg0 == 3) {
                        this.method4803(260, 8448, true);
                        return;
                     }

                     if (~arg0 == -5) {
                        this.method4803(34023, 34023, true);
                        return;
                     }
                  } else {
                     this.method4803(34165, 7681, true);
                  }

               } else {
                  this.method4803(8448, 8448, true);
               }
            } else {
               this.method4803(7681, 7681, true);
            }
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[66] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method674(Canvas arg0, int arg1, int arg2) {
      try {
         ++field9566;
         if (this.field9461 == arg0) {
            throw new RuntimeException();
         } else if (!this.field9564.containsKey(arg0)) {
            if (!arg0.isShowing()) {
               throw new RuntimeException();
            } else {
               try {
                  Class var4 = Class.forName(field9769[15]);
                  Method var5 = var4.getMethod(field9769[16], Boolean.TYPE);
                  var5.invoke(arg0, Boolean.TRUE);
               } catch (Exception var9) {
               }

               long var6 = this.field9485.prepareSurface(arg0);
               if (~var6 == 0L) {
                  throw new RuntimeException();
               } else {
                  this.field9564.put(arg0, new Long(var6));
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field9769[14] + (arg0 != null ? field9769[4] : field9769[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "w",
      descriptor = "()Z"
   )
   public final boolean method587() {
      try {
         ++field9511;
         return false;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9769[68] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "w",
      descriptor = "(I)V"
   )
   private final void method4766(int arg0) {
      try {
         OpenGL.glLoadIdentity();
         ++field9440;
         if (arg0 >= 34) {
            OpenGL.glMultMatrixf(this.field9650.method1543((byte)94), 0);
            if (this.field9712) {
               this.field9609.field10608.method5624((byte)-29);
            }

            this.method4750(-114);
            this.method4734((byte)-93);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[47] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "C",
      descriptor = "(I)V"
   )
   private final void method4767(int arg0) {
      try {
         ++field9596;
         float var2 = (float)(-this.field9728) * this.field9740 / (float)this.field9745;
         float var3 = (float)(-this.field9713) * this.field9740 / (float)this.field9717;
         float var4 = (float)(-this.field9728 + this.field9599) * this.field9740 / (float)this.field9745;
         float var5 = (float)(-this.field9713 + this.field9472) * this.field9740 / (float)this.field9717;
         OpenGL.glMatrixMode(5889);
         OpenGL.glLoadIdentity();
         if (arg0 <= 81) {
            this.field9679 = false;
         }

         if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double)var2, (double)var4, (double)(-var5), (double)(-var3), (double)this.field9753, (double)this.field9664);
         }

         OpenGL.glMatrixMode(5888);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field9769[152] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(ILgs;Lgs;Lgs;Lgs;)V"
   )
   public final void method4768(int arg0, class436 arg1, class436 arg2, class436 arg3, class436 arg4) {
      boolean var6 = client.field1786;

      try {
         label65: {
            ++field9525;
            if (arg3 == null) {
               OpenGL.glDisableClientState(32884);
               if (!var6) {
                  break label65;
               }
            }

            this.method4813((byte)67, arg3.field6682);
            OpenGL.glVertexPointer(arg3.field6685, arg3.field6681, this.field9683.method1054(50), this.field9683.method1057(arg0 ^ 18966) - -((long)arg3.field6684));
            OpenGL.glEnableClientState(32884);
         }

         label60: {
            if (arg4 == null) {
               OpenGL.glDisableClientState(32885);
               if (!var6) {
                  break label60;
               }
            }

            this.method4813((byte)67, arg4.field6682);
            OpenGL.glNormalPointer(arg4.field6681, this.field9683.method1054(67), this.field9683.method1057(-18611) + (long)arg4.field6684);
            OpenGL.glEnableClientState(32885);
         }

         label55: {
            if (arg2 == null) {
               OpenGL.glDisableClientState(32886);
               if (!var6) {
                  break label55;
               }
            }

            this.method4813((byte)67, arg2.field6682);
            OpenGL.glColorPointer(arg2.field6685, arg2.field6681, this.field9683.method1054(69), this.field9683.method1057(-18611) - -((long)arg2.field6684));
            OpenGL.glEnableClientState(32886);
         }

         if (arg0 != -677) {
            this.field9740 = -0.7996285F;
         }

         if (arg1 != null) {
            this.method4813((byte)67, arg1.field6682);
            OpenGL.glTexCoordPointer(arg1.field6685, arg1.field6681, this.field9683.method1054(53), this.field9683.method1057(arg0 + -17934) + (long)arg1.field6684);
            OpenGL.glEnableClientState(32888);
         } else {
            OpenGL.glDisableClientState(32888);
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field9769[13] + arg0 + ',' + (arg1 != null ? field9769[4] : field9769[3]) + ',' + (arg2 != null ? field9769[4] : field9769[3]) + ',' + (arg3 != null ? field9769[4] : field9769[3]) + ',' + (arg4 != null ? field9769[4] : field9769[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "HA",
      descriptor = "(IIII[I)V"
   )
   public final void method582(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
      try {
         ++field9584;
         float var6 = (float)arg2 * this.field9647.field2517 + (float)arg0 * this.field9647.field2516 + (float)arg1 * this.field9647.field2514 + this.field9647.field2531;
         if (!(var6 < (float)this.field9753) && !(var6 > (float)this.field9664)) {
            int var7 = (int)(((float)arg2 * this.field9647.field2515 + (float)arg0 * this.field9647.field2533 + (float)arg1 * this.field9647.field2534 + this.field9647.field2510) * (float)this.field9745 / (float)arg3);
            int var8 = (int)(((float)arg2 * this.field9647.field2541 + (float)arg0 * this.field9647.field2530 + (float)arg1 * this.field9647.field2513 + this.field9647.field2538) * (float)this.field9717 / (float)arg3);
            if ((float)var7 >= this.field9742 && this.field9751 >= (float)var7 && this.field9662 <= (float)var8 && (float)var8 <= this.field9699) {
               arg4[1] = (int)((float)var8 + -this.field9662);
               arg4[2] = (int)var6;
               arg4[0] = (int)((float)var7 + -this.field9742);
            } else {
               arg4[0] = arg4[1] = arg4[2] = -1;
            }
         } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field9769[96] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field9769[4] : field9769[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "f",
      descriptor = "(B)V"
   )
   private final void method4769(byte arg0) {
      try {
         label29: {
            if (!this.field9726 || this.field9711) {
               OpenGL.glDisable(2896);
               if (!client.field1786) {
                  break label29;
               }
            }

            OpenGL.glEnable(2896);
         }

         ++field9517;
         if (arg0 >= -14) {
            this.field9581 = 119L;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[95] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "i",
      descriptor = "(B)V"
   )
   private final void method4770(byte arg0) {
      try {
         ++field9553;
         if (arg0 != 118) {
            this.field9645 = -41;
         }

         label29: {
            float[] var2 = this.field9721;
            float var3 = (float)(-this.field9728 * this.field9753) / (float)this.field9745;
            float var4 = (float)((-this.field9728 + this.field9599) * this.field9753) / (float)this.field9745;
            float var5 = (float)(this.field9753 * this.field9713) / (float)this.field9717;
            float var6 = (float)((this.field9713 - this.field9472) * this.field9753) / (float)this.field9717;
            if (var3 == var4 || var5 == var6) {
               var2[2] = 0.0F;
               var2[7] = 0.0F;
               var2[1] = 0.0F;
               var2[8] = 0.0F;
               var2[5] = 1.0F;
               var2[0] = 1.0F;
               var2[11] = 0.0F;
               var2[6] = 0.0F;
               var2[15] = 1.0F;
               var2[10] = 1.0F;
               var2[14] = 0.0F;
               var2[9] = 0.0F;
               var2[4] = 0.0F;
               var2[3] = 0.0F;
               var2[13] = 0.0F;
               var2[12] = 0.0F;
               if (!client.field1786) {
                  break label29;
               }
            }

            float var7 = (float)this.field9753 * 2.0F;
            var2[9] = (var5 + var6) / (var5 - var6);
            var2[8] = (var3 + var4) / (-var3 + var4);
            var2[12] = 0.0F;
            var2[2] = 0.0F;
            var2[14] = this.field9689 = -((float)this.field9664 * var7) / (float)(this.field9664 - this.field9753);
            var2[13] = 0.0F;
            var2[3] = 0.0F;
            var2[4] = 0.0F;
            var2[15] = 0.0F;
            var2[1] = 0.0F;
            var2[5] = var7 / (-var6 + var5);
            var2[7] = 0.0F;
            var2[11] = -1.0F;
            var2[10] = this.field9661 = (float)(-(this.field9753 + this.field9664)) / (float)(this.field9664 - this.field9753);
            var2[0] = var7 / (-var3 + var4);
            var2[6] = 0.0F;
         }

         this.method4728((byte)0);
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field9769[30] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "la",
      descriptor = "()V"
   )
   public final void method701() {
      try {
         this.field9668 = this.field9599;
         this.field9759 = this.field9472;
         ++field9492;
         this.field9673 = 0;
         this.field9680 = 0;
         OpenGL.glDisable(3089);
         this.method4810((byte)-67);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9769[71] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "t",
      descriptor = "()Lkf;"
   )
   public final class401 method640() {
      try {
         ++field9493;
         return this.field9612;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9769[114] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(Lpr;)V"
   )
   public final void method667(class331 arg0) {
      try {
         this.field9729 = (class329)arg0;
         ++field9558;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[78] + (arg0 != null ? field9769[4] : field9769[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "e",
      descriptor = "(II)I"
   )
   public final int method584(int arg0, int arg1) {
      try {
         ++field9570;
         return arg0 | arg1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[189] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "r",
      descriptor = "(I)V"
   )
   public final void method4771(int arg0) {
      try {
         if (arg0 != 1) {
            this.method582(78, 111, 9, -69, (int[])null);
         }

         ++field9516;
         if (this.field9645 != 16) {
            this.method4752(16);
            this.method4762(true, (byte)85);
            this.method4807(true, false);
            this.method4779((byte)-35, true);
            this.method4783(arg0 + 3007, 1);
            this.field9645 = 16;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[36] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "c",
      descriptor = "(II)Lip;"
   )
   public final class726 method638(int arg0, int arg1) {
      try {
         ++field9458;
         return null;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[185] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "t",
      descriptor = "(I)V"
   )
   private final void method4772(int arg0) {
      try {
         if (arg0 == 4) {
            label22: {
               if (this.field9460 != null) {
                  Dimension var2 = this.field9460.getSize();
                  this.field9580 = var2.height;
                  this.field9519 = var2.width;
                  if (!client.field1786) {
                     break label22;
                  }
               }

               this.field9519 = this.field9580 = 0;
            }

            ++field9454;
            if (this.field9621 == null) {
               this.field9599 = this.field9519;
               this.field9472 = this.field9580;
               this.method4774(true);
            }

            this.method4784(0);
            this.method701();
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[29] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "j",
      descriptor = "()Z"
   )
   public final boolean method617() {
      try {
         ++field9569;
         return this.field9602 != null && this.field9602.method2373(0);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9769[85] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "E",
      descriptor = "()I"
   )
   public final int method661() {
      try {
         ++field9465;
         return this.field9634 + this.field9632 + this.field9631;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9769[223] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "b",
      descriptor = "(IB)I"
   )
   public static final int method4773(int arg0, byte arg1) {
      try {
         if (arg1 != -44) {
            return 55;
         } else {
            ++field9424;
            int var2 = arg0 >>> 1;
            int var3 = var2 | var2 >>> 1;
            int var4 = var3 | var3 >>> 2;
            int var5 = var4 | var4 >>> 4;
            int var6 = var5 | var5 >>> 8;
            int var7 = var6 | var6 >>> 16;
            return arg0 & ~var7;
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field9769[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "d",
      descriptor = "(Z)V"
   )
   private final void method4774(boolean arg0) {
      try {
         ++field9521;
         if (!arg0) {
            this.field9671 = true;
         }

         OpenGL.glViewport(this.field9743, this.field9707, this.field9599, this.field9472);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[56] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "l",
      descriptor = "()Z"
   )
   public final boolean method628() {
      try {
         ++field9405;
         return true;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9769[182] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(FFFBF)V"
   )
   public final void method4775(float arg0, float arg1, float arg2, byte arg3, float arg4) {
      try {
         class371.field5757[2] = arg0;
         int var6 = -47 / ((31 - arg3) / 61);
         class371.field5757[0] = arg2;
         class371.field5757[1] = arg4;
         ++field9436;
         class371.field5757[3] = arg1;
         OpenGL.glTexEnvfv(8960, 8705, class371.field5757, 0);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field9769[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "A",
      descriptor = "(ILaa;II)V"
   )
   public final void method654(int arg0, class96 arg1, int arg2, int arg3) {
      try {
         ++field9482;
         class639 var5 = (class639)arg1;
         class419 var6 = var5.field9251;
         this.method4802(false);
         this.method4792(-26367, var5.field9251);
         this.method4783(3008, 1);
         this.method4803(7681, 8448, true);
         this.method4809(768, (byte)-128, 34167, 0);
         float var7 = var6.field6488 / (float)var6.field6485;
         float var8 = var6.field6487 / (float)var6.field6482;
         OpenGL.glColor4ub((byte)(arg0 >> 16), (byte)(arg0 >> 8), (byte)arg0, (byte)(arg0 >> 24));
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f((float)(-arg2 + this.field9673) * var7, (float)(-arg3 + this.field9680) * var8);
         OpenGL.glVertex2i(this.field9673, this.field9680);
         OpenGL.glTexCoord2f((float)(-arg2 + this.field9673) * var7, (float)(-arg3 + this.field9759) * var8);
         OpenGL.glVertex2i(this.field9673, this.field9759);
         OpenGL.glTexCoord2f((float)(-arg2 + this.field9668) * var7, (float)(-arg3 + this.field9759) * var8);
         OpenGL.glVertex2i(this.field9668, this.field9759);
         OpenGL.glTexCoord2f((float)(this.field9668 - arg2) * var7, (float)(this.field9680 - arg3) * var8);
         OpenGL.glVertex2i(this.field9668, this.field9680);
         OpenGL.glEnd();
         this.method4809(768, (byte)-128, 5890, 0);
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field9769[2] + arg0 + ',' + (arg1 != null ? field9769[4] : field9769[3]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "e",
      descriptor = "()Z"
   )
   public final boolean method662() {
      try {
         ++field9556;
         return this.field9702 && (!this.method617() || this.field9672);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9769[97] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "n",
      descriptor = "()Z"
   )
   public final boolean method668() {
      try {
         ++field9475;
         if (this.field9602 != null) {
            if (!this.field9602.method2373(0)) {
               if (!this.field9608.method4356((byte)127, this.field9602)) {
                  return false;
               }

               this.field9603.method182(true);
            }

            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9769[195] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(BLica;I)Ljava/lang/String;"
   )
   public static final String method4776(byte arg0, class354 arg1, int arg2) {
      try {
         ++field9426;

         try {
            int var3 = arg1.method2896(0);
            if (var3 > arg2) {
               var3 = arg2;
            }

            byte[] var4 = new byte[var3];
            if (arg0 != -53) {
               return null;
            } else {
               arg1.field5436 += class255.field3860.method3409(arg1.field5428, var4, arg1.field5436, 0, (byte)64, var3);
               return class45.method326(var3, true, var4, 0);
            }
         } catch (Exception var7) {
            return field9769[64];
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field9769[65] + arg0 + ',' + (arg1 != null ? field9769[4] : field9769[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "u",
      descriptor = "(I)V"
   )
   private final void method4777(int arg0) {
      try {
         if (this.field9733 != 2) {
            this.field9733 = 2;
            this.method4793(false);
            this.method4766(99);
            this.field9645 &= -8;
         }

         ++field9549;
         if (arg0 != -30003) {
            this.field9618 = null;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[121] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "b",
      descriptor = "(B)V"
   )
   private final void method4778(byte arg0) {
      try {
         this.field9660 = (float)(-this.field9690 + this.field9664) - this.field9715;
         ++field9428;
         if (arg0 != -45) {
            this.method693((class141)null);
         }

         this.field9747 = -((float)this.field9701 * this.field9688) + this.field9660;
         if ((float)this.field9753 > this.field9747) {
            this.field9747 = (float)this.field9753;
         }

         OpenGL.glFogf(2915, this.field9747);
         OpenGL.glFogf(2916, this.field9660);
         class371.field5757[1] = (float)class408.method3277(65280, this.field9706) / 65280.0F;
         class371.field5757[0] = (float)class408.method3277(16711680, this.field9706) / 1.671168E7F;
         class371.field5757[2] = (float)class408.method3277(this.field9706, 255) / 255.0F;
         OpenGL.glFogfv(2918, class371.field5757, 0);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[63] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(BZ)V"
   )
   public final void method4779(byte arg0, boolean arg1) {
      try {
         if (!arg1 != !this.field9646) {
            this.field9646 = arg1;
            this.method4798(arg0 ^ 21956);
            this.field9645 &= -32;
         }

         if (arg0 != -35) {
            this.field9711 = false;
         }

         ++field9527;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[77] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "ZA",
      descriptor = "(IFFFFF)V"
   )
   public final void method656(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      try {
         ++field9503;
         boolean var7 = ~this.field9723 != ~arg0;
         if (var7 || this.field9761 != arg1 || this.field9749 != arg2) {
            this.field9749 = arg2;
            this.field9761 = arg1;
            this.field9723 = arg0;
            if (var7) {
               this.field9703 = (float)(this.field9723 & 65280) / 65280.0F;
               this.field9734 = (float)(this.field9723 & 16711680) / 1.671168E7F;
               this.field9762 = (float)(this.field9723 & 255) / 255.0F;
               this.method4790(1);
            }

            this.method4736(true);
         }

         if (this.field9739[0] != arg3 || this.field9739[1] != arg4 || this.field9739[2] != arg5) {
            this.field9739[1] = arg4;
            this.field9739[2] = arg5;
            this.field9739[0] = arg3;
            this.field9698[1] = -arg4;
            this.field9698[0] = -arg3;
            this.field9698[2] = -arg5;
            float var8 = (float)(1.0D / Math.sqrt((double)(arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field9724[2] = arg5 * var8;
            this.field9724[0] = arg3 * var8;
            this.field9724[1] = arg4 * var8;
            this.field9714[2] = -this.field9724[2];
            this.field9714[0] = -this.field9724[0];
            this.field9714[1] = -this.field9724[1];
            this.method4750(12);
            this.field9727 = (int)(arg3 * 256.0F / arg4);
            this.field9750 = (int)(arg5 * 256.0F / arg4);
         }

      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field9769[72] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "c",
      descriptor = "(ILen;)V"
   )
   public final void method4780(int arg0, class447 arg1) {
      try {
         ++field9509;
         if (this.field9627 >= 0 && this.field9626[this.field9627] == arg1) {
            this.field9626[this.field9627--] = null;
            arg1.method2936(arg0 ^ -19026);
            if (arg0 != 1) {
               this.method685(43);
            }

            if (~this.field9627 > -1) {
               this.field9621 = null;
            } else {
               this.field9621 = this.field9626[this.field9627];
               this.field9621.method2923((byte)-58);
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[109] + arg0 + ',' + (arg1 != null ? field9769[4] : field9769[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "i",
      descriptor = "()I"
   )
   public final int method635() {
      try {
         ++field9606;
         return this.field9753;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9769[83] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "d",
      descriptor = "()V"
   )
   public final void method675() {
      boolean var1 = client.field1786;

      try {
         ++field9429;
         class294 var2 = this.field9616.method4972((byte)-84);
         if (var1) {
            ((class88)var2).method848((byte)0);
            var2 = this.field9616.method4975((byte)93);
         }

         while(true) {
            while(var2 != null) {
               ((class88)var2).method848((byte)0);
               var2 = this.field9616.method4975((byte)93);
            }

            if (!var1) {
               if (this.field9608 != null) {
                  this.field9608.method4357(-3580);
               }

               if (this.field9485 != null) {
                  Object var10000;
                  label47: {
                     this.method4757(-29305);
                     Enumeration var3 = this.field9564.keys();
                     if (var1) {
                        var10000 = var3.nextElement();
                     } else if (!var3.hasMoreElements()) {
                        this.field9485.release();
                        var10000 = this;
                        if (!var1) {
                           break label47;
                        }
                     } else {
                        var10000 = var3.nextElement();
                     }

                     while(true) {
                        Canvas var4 = (Canvas)var10000;
                        Long var5 = (Long)this.field9564.get(var4);
                        this.field9485.releaseSurface(var4, var5);
                        if (!var3.hasMoreElements()) {
                           this.field9485.release();
                           var10000 = this;
                           if (!var1) {
                              break;
                           }
                        } else {
                           var10000 = var3.nextElement();
                        }
                     }
                  }

                  ((class652)var10000).field9485 = null;
               }

               if (this.field9617) {
                  class595.method4428(false, (byte)-107, true);
                  this.field9617 = false;
                  return;
               }

               return;
            }

            var2 = this.field9616.method4975((byte)93);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field9769[194] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(Lie;B)V"
   )
   public final void method4781(class167 arg0, byte arg1) {
      try {
         if (arg1 >= 105) {
            ++field9469;
            OpenGL.glPushMatrix();
            OpenGL.glMultMatrixf(arg0.method1543((byte)125), 0);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[57] + (arg0 != null ? field9769[4] : field9769[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "JA",
      descriptor = "(IIIIII)I"
   )
   public final int method650(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var7 = client.field1786;

      try {
         ++field9477;
         int var8 = 0;
         float var9 = (float)arg2 * this.field9647.field2517 + (float)arg0 * this.field9647.field2516 + (float)arg1 * this.field9647.field2514 + this.field9647.field2531;
         if (var9 < 1.0F) {
            var9 = 1.0F;
         }

         float var10 = (float)arg5 * this.field9647.field2517 + (float)arg3 * this.field9647.field2516 + (float)arg4 * this.field9647.field2514 + this.field9647.field2531;
         if (var10 < 1.0F) {
            var10 = 1.0F;
         }

         label83: {
            if (!((float)this.field9753 > var9) || !(var10 < (float)this.field9753)) {
               if (!((float)this.field9664 < var9) || !((float)this.field9664 < var10)) {
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
            int var11 = (int)(((float)arg2 * this.field9647.field2515 + (float)arg0 * this.field9647.field2533 + (float)arg1 * this.field9647.field2534 + this.field9647.field2510) * (float)this.field9745 / var9);
            int var12 = (int)(((float)arg5 * this.field9647.field2515 + (float)arg3 * this.field9647.field2533 + (float)arg4 * this.field9647.field2534 + this.field9647.field2510) * (float)this.field9745 / var10);
            if (!((float)var11 < this.field9742) || !((float)var12 < this.field9742)) {
               if (!((float)var11 > this.field9751) || !((float)var12 > this.field9751)) {
                  break label84;
               }

               var8 |= 2;
               if (!var7) {
                  break label84;
               }
            }

            var8 |= 1;
         }

         int var13 = (int)(((float)arg2 * this.field9647.field2541 + (float)arg0 * this.field9647.field2530 + (float)arg1 * this.field9647.field2513 + this.field9647.field2538) * (float)this.field9717 / var9);
         int var14 = (int)(((float)arg5 * this.field9647.field2541 + (float)arg3 * this.field9647.field2530 + (float)arg4 * this.field9647.field2513 + this.field9647.field2538) * (float)this.field9717 / var10);
         if (this.field9662 > (float)var13 && this.field9662 > (float)var14) {
            var8 |= 4;
            if (!var7) {
               return var8;
            }
         }

         if ((float)var13 > this.field9699 && (float)var14 > this.field9699) {
            var8 |= 8;
         }

         return var8;
      } catch (RuntimeException var16) {
         throw class482.method3757(var16, field9769[226] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(Len;I)V"
   )
   public final void method4782(class447 arg0, int arg1) {
      try {
         ++field9541;
         if (~this.field9627 <= arg1) {
            throw new RuntimeException();
         } else {
            if (this.field9627 >= 0) {
               this.field9626[this.field9627].method2936(arg1 + -19021);
            }

            this.field9621 = this.field9626[++this.field9627] = arg0;
            this.field9621.method2923((byte)-58);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[118] + (arg0 != null ? field9769[4] : field9769[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "y",
      descriptor = "()Z"
   )
   public final boolean method702() {
      try {
         ++field9577;
         return true;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9769[175] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "f",
      descriptor = "(IIIIII)V"
   )
   public final void method695(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         float var8;
         float var10;
         label23: {
            this.method4731(28626);
            ++field9546;
            this.method4783(3008, arg5);
            float var7 = (float)(-arg0) + (float)arg2;
            var8 = (float)arg3 - (float)arg1;
            if (var7 != 0.0F || var8 != 0.0F) {
               float var9 = (float)(1.0D / Math.sqrt((double)(var7 * var7 + var8 * var8)));
               var10 = var7 * var9;
               var8 *= var9;
               if (!client.field1786) {
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
         throw class482.method3757(var12, field9769[88] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(Lqda;[Lkp;Z)Lda;"
   )
   public final class288 method598(class697 arg0, class776[] arg1, boolean arg2) {
      try {
         ++field9399;
         return new class114(this, arg0, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9769[132] + (arg0 != null ? field9769[4] : field9769[3]) + ',' + (arg1 != null ? field9769[4] : field9769[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "j",
      descriptor = "(II)V"
   )
   public final void method4783(int arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field9447;
         if (~this.field9644 != ~arg1) {
            boolean var4;
            boolean var5;
            byte var6;
            label109: {
               if (~arg1 == -2) {
                  var4 = true;
                  var5 = true;
                  var6 = 1;
                  if (!var3) {
                     break label109;
                  }
               }

               if (arg1 == 2) {
                  var4 = false;
                  var6 = 2;
                  var5 = true;
                  if (!var3) {
                     break label109;
                  }
               }

               if (arg1 == 128) {
                  var6 = 3;
                  var4 = true;
                  var5 = true;
                  if (!var3) {
                     break label109;
                  }
               }

               var4 = false;
               var5 = true;
               var6 = 0;
            }

            if (!var5 == this.field9649) {
               OpenGL.glColorMask(var5, var5, var5, true);
               this.field9649 = var5;
            }

            if (!this.field9643 != !var4) {
               label84: {
                  if (!var4) {
                     OpenGL.glDisable(3008);
                     if (!var3) {
                        break label84;
                     }
                  }

                  OpenGL.glEnable(3008);
               }

               this.field9643 = var4;
            }

            if (~this.field9642 != ~var6) {
               label112: {
                  if (~var6 == -2) {
                     OpenGL.glEnable(3042);
                     OpenGL.glBlendFunc(770, 771);
                     if (!var3) {
                        break label112;
                     }
                  }

                  if (~var6 != -3) {
                     if (var6 != 3) {
                        OpenGL.glDisable(3042);
                        if (!var3) {
                           break label112;
                        }
                     }

                     OpenGL.glEnable(3042);
                     OpenGL.glBlendFunc(774, 1);
                     if (!var3) {
                        break label112;
                     }
                  }

                  OpenGL.glEnable(3042);
                  OpenGL.glBlendFunc(1, 1);
               }

               this.field9642 = var6;
            }

            this.field9644 = arg1;
            this.field9645 &= -29;
         }

         if (arg0 != 3008) {
            this.method646();
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field9769[229] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method613(boolean arg0) {
      try {
         ++field9600;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[92] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "s",
      descriptor = "(I)V"
   )
   public final void method4784(int arg0) {
      try {
         if (this.field9733 != arg0) {
            this.field9733 = 0;
            this.field9645 &= -32;
         }

         ++field9467;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[142] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "M",
      descriptor = "()I"
   )
   public final int method706() {
      try {
         ++field9524;
         int var1 = this.field9764;
         this.field9764 = 0;
         return var1;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[58] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(Lpr;Lpr;FLpr;)Lpr;"
   )
   public final class331 method603(class331 arg0, class331 arg1, float arg2, class331 arg3) {
      try {
         ++field9425;
         if (arg0 != null && arg1 != null && this.field9654 && this.field9737) {
            class716 var5 = null;
            class329 var6 = (class329)arg0;
            class329 var7 = (class329)arg1;
            class553 var8 = var6.method2683(62);
            class553 var9 = var7.method2683(56);
            if (var8 != null && var9 != null) {
               int var10 = var8.field8270 > var9.field8270 ? var8.field8270 : var9.field8270;
               if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class716) {
                  class716 var11 = (class716)arg3;
                  if (var10 == var11.method5300(false)) {
                     var5 = var11;
                  }
               }

               if (var5 == null) {
                  var5 = new class716(this, var10);
               }

               if (var5.method5302(var9, arg2, false, var8)) {
                  return var5;
               }
            }
         }

         return !(arg2 < 0.5F) ? arg1 : arg0;
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field9769[207] + (arg0 != null ? field9769[4] : field9769[3]) + ',' + (arg1 != null ? field9769[4] : field9769[3]) + ',' + arg2 + ',' + (arg3 != null ? field9769[4] : field9769[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "F",
      descriptor = "(II)V"
   )
   public final void method643(int arg0, int arg1) {
      try {
         ++field9586;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[91] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "h",
      descriptor = "()V"
   )
   public final void method621() {
      try {
         OpenGL.glFinish();
         ++field9462;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9769[59] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "m",
      descriptor = "(II)I"
   )
   public final int method4785(int arg0, int arg1) {
      try {
         ++field9542;
         if (arg0 != 5121 && ~arg0 != -5121) {
            if (~arg0 != -5124 && ~arg0 != -5123) {
               if (arg0 != 5125 && ~arg0 != -5125 && arg0 != 5126) {
                  if (arg1 != 1) {
                     this.method621();
                  }

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
         throw class482.method3757(var4, field9769[123] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "d",
      descriptor = "(II)I"
   )
   public final int method690(int arg0, int arg1) {
      try {
         ++field9551;
         return arg1 & arg0 ^ arg1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[45] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "c",
      descriptor = "()Z"
   )
   public final boolean method664() {
      try {
         ++field9557;
         return true;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9769[110] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method676(int arg0) {
      try {
         ++field9563;
         this.method4742(0);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[220] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "v",
      descriptor = "()Lkf;"
   )
   public final class401 method605() {
      try {
         ++field9406;
         return this.field9647;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9769[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(FFF)V"
   )
   public final void method651(float arg0, float arg1, float arg2) {
      try {
         ++field9476;
         class158.field2339 = arg1;
         class524.field7992 = arg2;
         class607.field8850 = arg0;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9769[51] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "r",
      descriptor = "(IIIIIII)I"
   )
   public final int method599(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field1786;

      try {
         int var11;
         label58: {
            ++field9502;
            float var9 = (float)arg2 * this.field9647.field2517 + (float)arg0 * this.field9647.field2516 + (float)arg1 * this.field9647.field2514 + this.field9647.field2531;
            float var10 = (float)arg5 * this.field9647.field2517 + (float)arg3 * this.field9647.field2516 + (float)arg4 * this.field9647.field2514 + this.field9647.field2531;
            var11 = 0;
            if ((float)this.field9753 > var9 && var10 < (float)this.field9753) {
               var11 |= 16;
               if (!var8) {
                  break label58;
               }
            }

            if ((float)this.field9664 < var9 && (float)this.field9664 < var10) {
               var11 |= 32;
            }
         }

         label52: {
            int var12 = (int)(((float)arg2 * this.field9647.field2515 + (float)arg0 * this.field9647.field2533 + (float)arg1 * this.field9647.field2534 + this.field9647.field2510) * (float)this.field9745 / (float)arg6);
            int var13 = (int)(((float)arg5 * this.field9647.field2515 + (float)arg3 * this.field9647.field2533 + (float)arg4 * this.field9647.field2534 + this.field9647.field2510) * (float)this.field9745 / (float)arg6);
            if (this.field9742 > (float)var12 && (float)var13 < this.field9742) {
               var11 |= 1;
               if (!var8) {
                  break label52;
               }
            }

            if (this.field9751 < (float)var12 && this.field9751 < (float)var13) {
               var11 |= 2;
            }
         }

         int var14 = (int)(((float)arg2 * this.field9647.field2541 + (float)arg0 * this.field9647.field2530 + (float)arg1 * this.field9647.field2513 + this.field9647.field2538) * (float)this.field9717 / (float)arg6);
         int var15 = (int)(((float)arg5 * this.field9647.field2541 + (float)arg3 * this.field9647.field2530 + (float)arg4 * this.field9647.field2513 + this.field9647.field2538) * (float)this.field9717 / (float)arg6);
         if (this.field9662 > (float)var14 && (float)var15 < this.field9662) {
            var11 |= 4;
            if (!var8) {
               return var11;
            }
         }

         if (this.field9699 < (float)var14 && this.field9699 < (float)var15) {
            var11 |= 8;
         }

         return var11;
      } catch (RuntimeException var17) {
         throw class482.method3757(var17, field9769[33] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "b",
      descriptor = "(II)Lsv;"
   )
   public final class166 method620(int arg0, int arg1) {
      try {
         ++field9565;
         return null;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[125] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(III)V"
   )
   public final synchronized void method4786(int arg0, int arg1, int arg2) {
      try {
         ++field9470;
         class668 var4 = new class668(arg1);
         var4.field4655 = (long)arg0;
         this.field9638.method4980(var4, 0);
         if (arg2 != 11482) {
            this.method4810((byte)51);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9769[48] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "l",
      descriptor = "(II)V"
   )
   public final void method4787(int arg0, int arg1) {
      try {
         ++field9419;
         if (~this.field9675 != ~arg1) {
            OpenGL.glActiveTexture(33984 - -arg1);
            this.field9675 = arg1;
         }

         if (arg0 >= -34) {
            this.field9581 = -107L;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[196] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "x",
      descriptor = "()Lkf;"
   )
   public final class401 method624() {
      try {
         ++field9510;
         return new class167();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9769[183] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "L",
      descriptor = "(III)V"
   )
   public final void method627(int arg0, int arg1, int arg2) {
      try {
         if (this.field9706 != arg0 || ~this.field9701 != ~arg1 || ~this.field9690 != ~arg2) {
            this.field9690 = arg2;
            this.field9701 = arg1;
            this.field9706 = arg0;
            this.method4778((byte)-45);
            this.method4730(false);
         }

         ++field9562;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9769[54] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(I[Llja;)V"
   )
   public final void method696(int arg0, class404[] arg1) {
      boolean var3 = client.field1786;

      try {
         int var4 = 0;
         if (var3) {
            this.field9693[var4] = arg1[var4];
            ++var4;
         }

         while(true) {
            class652 var10000;
            if (~var4 <= ~arg0) {
               ++field9561;
               this.field9696 = arg0;
               var10000 = this;
               if (!var3) {
                  if (this.field9733 != 1) {
                     this.method4734((byte)-127);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = this;
            }

            var10000.field9693[var4] = arg1[var4];
            ++var4;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9769[204] + arg0 + ',' + (arg1 != null ? field9769[4] : field9769[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "pa",
      descriptor = "()V"
   )
   public final void method666() {
      try {
         ++field9587;
         this.field9667 = false;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9769[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "g",
      descriptor = "(B)V"
   )
   public static void method4788(byte arg0) {
      try {
         field9505 = null;
         if (arg0 != 66) {
            field9583 = null;
         }

         field9583 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9769[176] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method704(int arg0) {
      try {
         ++field9403;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[28] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(FFI)V"
   )
   public final void method4789(float arg0, float arg1, int arg2) {
      try {
         this.field9688 = arg0;
         this.field9715 = arg1;
         if (arg2 != 6914) {
            this.field9613 = null;
         }

         ++field9559;
         this.method4778((byte)-45);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9769[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "T",
      descriptor = "(IIII)V"
   )
   public final void method586(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (this.field9680 < arg1) {
            this.field9680 = arg1;
         }

         if (arg3 < this.field9759) {
            this.field9759 = arg3;
         }

         ++field9544;
         if (arg2 < this.field9668) {
            this.field9668 = arg2;
         }

         if (~arg0 < ~this.field9673) {
            this.field9673 = arg0;
         }

         OpenGL.glEnable(3089);
         this.method4810((byte)-118);
         this.method4800((byte)121);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9769[224] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "x",
      descriptor = "(I)V"
   )
   private final void method4790(int arg0) {
      try {
         ++field9437;
         class371.field5757[2] = this.field9762 * this.field9725;
         class371.field5757[3] = 1.0F;
         class371.field5757[arg0] = this.field9725 * this.field9703;
         class371.field5757[0] = this.field9734 * this.field9725;
         OpenGL.glLightModelfv(2899, class371.field5757, 0);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[222] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(ILie;)V"
   )
   public final void method4791(int arg0, class167 arg1) {
      try {
         OpenGL.glLoadMatrixf(arg1.method1543((byte)120), 0);
         ++field9413;
         if (arg0 < 95) {
            this.field9639 = null;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[211] + arg0 + ',' + (arg1 != null ? field9769[4] : field9769[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "z",
      descriptor = "()Z"
   )
   public final boolean method689() {
      try {
         ++field9432;
         return true;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9769[150] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(ILvda;)V"
   )
   public final void method4792(int arg0, class799 arg1) {
      try {
         if (arg0 != -26367) {
            this.field9682 = 62;
         }

         ++field9504;
         class799 var3 = this.field9741[this.field9675];
         if (arg1 != var3) {
            if (arg1 != null) {
               if (var3 != null) {
                  if (arg1.field11642 != var3.field11642) {
                     OpenGL.glDisable(var3.field11642);
                     OpenGL.glEnable(arg1.field11642);
                  }
               } else {
                  OpenGL.glEnable(arg1.field11642);
               }

               OpenGL.glBindTexture(arg1.field11642, arg1.method5759(arg0 ^ -4031));
            } else {
               OpenGL.glDisable(var3.field11642);
            }

            this.field9741[this.field9675] = arg1;
         }

         this.field9645 &= -2;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9769[40] + arg0 + ',' + (arg1 != null ? field9769[4] : field9769[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method579(Canvas arg0) {
      try {
         label45: {
            this.field9460 = null;
            ++field9590;
            this.field9581 = 0L;
            if (arg0 == null || this.field9461 == arg0) {
               this.field9581 = this.field9592;
               this.field9460 = this.field9461;
               if (!client.field1786) {
                  break label45;
               }
            }

            if (this.field9564.containsKey(arg0)) {
               Long var2 = (Long)this.field9564.get(arg0);
               this.field9581 = var2;
               this.field9460 = arg0;
            }
         }

         if (this.field9460 != null && ~this.field9581 != -1L) {
            this.field9485.setSurface(this.field9581);
            this.method4772(4);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[24] + (arg0 != null ? field9769[4] : field9769[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "e",
      descriptor = "(Z)V"
   )
   private final void method4793(boolean arg0) {
      try {
         if (arg0) {
            this.field9731 = null;
         }

         ++field9446;
         OpenGL.glMatrixMode(5889);
         OpenGL.glLoadMatrixf(this.field9721, 0);
         OpenGL.glMatrixMode(5888);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[67] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "Y",
      descriptor = "()[I"
   )
   public final int[] method669() {
      try {
         ++field9597;
         return new int[]{this.field9728, this.field9713, this.field9745, this.field9717};
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9769[131] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "()Z"
   )
   public final boolean method585() {
      try {
         ++field9595;
         return this.field9609.method5202(3, (byte)6);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9769[202] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "da",
      descriptor = "(III[I)V"
   )
   public final void method700(int arg0, int arg1, int arg2, int[] arg3) {
      try {
         ++field9422;
         float var5 = (float)arg2 * this.field9647.field2517 + (float)arg0 * this.field9647.field2516 + (float)arg1 * this.field9647.field2514 + this.field9647.field2531;
         if (!((float)this.field9753 > var5) && !((float)this.field9664 < var5)) {
            int var6 = (int)(((float)arg2 * this.field9647.field2515 + (float)arg0 * this.field9647.field2533 + (float)arg1 * this.field9647.field2534 + this.field9647.field2510) * (float)this.field9745 / var5);
            int var7 = (int)(((float)arg2 * this.field9647.field2541 + (float)arg0 * this.field9647.field2530 + (float)arg1 * this.field9647.field2513 + this.field9647.field2538) * (float)this.field9717 / var5);
            if (this.field9742 <= (float)var6 && (float)var6 <= this.field9751 && this.field9662 <= (float)var7 && (float)var7 <= this.field9699) {
               arg3[0] = (int)((float)var6 - this.field9742);
               arg3[2] = (int)var5;
               arg3[1] = (int)((float)var7 + -this.field9662);
            } else {
               arg3[0] = arg3[1] = arg3[2] = -1;
            }
         } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field9769[143] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9769[4] : field9769[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "o",
      descriptor = "()I"
   )
   public final int method687() {
      try {
         ++field9445;
         return 4;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9769[10] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "C",
      descriptor = "(Z)V"
   )
   public final void method581(boolean arg0) {
      try {
         this.field9659 = arg0;
         ++field9554;
         this.method4798(-21991);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[52] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(IIIIZ)Ljq;"
   )
   public final class672 method630(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         ++field9483;
         return new class355(this, arg0, arg1, arg2, arg3);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field9769[113] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "q",
      descriptor = "()V"
   )
   public final void method646() {
      try {
         ++field9421;
         if (this.field9602 != null && this.field9602.method2373(0)) {
            this.field9608.method4362(true, this.field9602);
            this.field9603.method182(true);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9769[228] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(Lfq;IILha;B)V"
   )
   public static final void method4794(class374 arg0, int arg1, int arg2, class610 arg3, byte arg4) {
      boolean var5 = client.field1786;

      try {
         ++field9453;
         byte var6 = 63;
         byte var7 = 7;
         int var8 = 63;
         int var9 = -7 % ((arg4 - 65) / 49);
         if (var5 || ~var8 <= -1) {
            do {
               int var10 = (var8 & 63) << 10 | 896 & var7 << 7 | var6 & 127;
               class274.method2325(false, 1, true);
               int var11 = class228.field3503[var10];
               class595.method4428(false, (byte)-107, true);
               arg3.method631(arg1, ((-var8 + 63) * arg0.field5915 >> 6) + arg2, arg0.field5849, (arg0.field5915 >> 6) + 1, var11, 0);
               --var8;
            } while(~var8 <= -1);

         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field9769[87] + (arg0 != null ? field9769[4] : field9769[3]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9769[4] : field9769[3]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(IIIIIF)Llja;"
   )
   public final class404 method583(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      try {
         ++field9402;
         return new class586(arg0, arg1, arg2, arg3, arg4, arg5);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field9769[23] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public final void method659(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      boolean var10 = client.field1786;

      try {
         ++field9439;
         if (arg0 != arg2 || arg1 != arg3) {
            float var14;
            float var15;
            float var16;
            float var17;
            float var18;
            float var19;
            float var20;
            float var21;
            label79: {
               this.method4731(28626);
               this.method4783(3008, arg5);
               float var11 = (float)arg2 - (float)arg0;
               float var12 = (float)arg3 - (float)arg1;
               float var13 = (float)(1.0D / Math.sqrt((double)(var11 * var11 + var12 * var12)));
               OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
               var14 = var12 * var13;
               int var28 = arg8 % (arg7 - -arg6);
               var15 = var11 * var13;
               var16 = (float)arg6 * var15;
               var17 = (float)arg6 * var14;
               var18 = 0.0F;
               var19 = 0.0F;
               var20 = var16;
               var21 = var17;
               if (arg6 >= var28) {
                  var20 = (float)(-var28 + arg6) * var15;
                  var21 = (float)(-var28 + arg6) * var14;
                  if (!var10) {
                     break label79;
                  }
               }

               var18 = (float)(-var28 + arg6 + arg7) * var15;
               var19 = (float)(arg6 + arg7 - var28) * var14;
            }

            float var22 = (float)arg0 + 0.35F + var18;
            float var23 = (float)arg1 + 0.35F + var19;
            float var24 = (float)arg7 * var15;
            float var25 = (float)arg7 * var14;

            do {
               label86: {
                  int var10000;
                  label70: {
                     if (arg0 >= arg2) {
                        float var29;
                        var10000 = (var29 = var22 - ((float)arg2 + 0.35F)) == 0.0F ? 0 : (var29 < 0.0F ? -1 : 1);
                        if (var10) {
                           break label70;
                        }

                        if (var10000 < 0) {
                           break;
                        }

                        if (!((float)arg2 > var20 + var22)) {
                           break label86;
                        }

                        var20 = (float)arg2 + -var22;
                        if (!var10) {
                           break label86;
                        }
                     }

                     float var30;
                     var10000 = (var30 = (float)arg2 + 0.35F - var22) == 0.0F ? 0 : (var30 < 0.0F ? -1 : 1);
                  }

                  if (var10000 < 0) {
                     break;
                  }

                  if (var20 + var22 > (float)arg2) {
                     var20 = (float)arg2 - var22;
                  }
               }

               label88: {
                  if (~arg3 < ~arg1) {
                     if ((float)arg3 + 0.35F < var23) {
                        break;
                     }

                     if (!(var21 + var23 > (float)arg3)) {
                        break label88;
                     }

                     var21 = (float)arg3 - var23;
                     if (!var10) {
                        break label88;
                     }
                  }

                  if ((float)arg3 + 0.35F > var23) {
                     break;
                  }

                  if (var21 + var23 < (float)arg3) {
                     var21 = (float)arg3 + -var23;
                  }
               }

               OpenGL.glBegin(1);
               OpenGL.glVertex2f(var22, var23);
               OpenGL.glVertex2f(var20 + var22, var21 + var23);
               OpenGL.glEnd();
               var22 += var20 + var24;
               var23 += var21 + var25;
               var20 = var16;
               var21 = var17;
            } while(!var10);

         }
      } catch (RuntimeException var27) {
         throw class482.method3757(var27, field9769[31] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(IIZLjaclib/memory/Buffer;I)Lli;"
   )
   public final class112 method4795(int arg0, int arg1, boolean arg2, Buffer arg3, int arg4) {
      try {
         ++field9442;
         if (this.field9760 && (!arg2 || this.field9722)) {
            return new class686(this, arg4, arg3, arg0, arg2);
         } else {
            if (arg1 <= 23) {
               this.method4742(-52);
            }

            return new class569(this, arg4, arg3);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field9769[153] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9769[4] : field9769[3]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "P",
      descriptor = "(IIIII)V"
   )
   public final void method663(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field9412;
         this.method4731(28626);
         this.method4783(3008, arg4);
         float var6 = (float)arg0 + 0.35F;
         OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
         float var7 = (float)arg1 + 0.35F;
         OpenGL.glBegin(1);
         OpenGL.glVertex2f(var6, var7);
         OpenGL.glVertex2f(var6, (float)arg2 + var7);
         OpenGL.glEnd();
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field9769[126] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(Lfca;)V"
   )
   public final void method652(class43 arg0) {
      try {
         ++field9508;
         this.field9604.method4712((byte)57, arg0, this, -1);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[128] + (arg0 != null ? field9769[4] : field9769[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "GA",
      descriptor = "(I)V"
   )
   public final void method590(int arg0) {
      try {
         this.method4783(3008, 0);
         ++field9494;
         OpenGL.glClearColor((float)(arg0 & 16711680) / 1.671168E7F, (float)(arg0 & 65280) / 65280.0F, (float)(255 & arg0) / 255.0F, (float)(arg0 >>> 24) / 255.0F);
         OpenGL.glClear(16384);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[108] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(ZLen;)V"
   )
   public final void method4796(boolean arg0, class447 arg1) {
      try {
         ++field9547;
         if (!this.field9732) {
            if (this.field9625 >= 3) {
               throw new RuntimeException();
            }

            if (~this.field9625 <= -1) {
               this.field9629[this.field9625].method2928(6150);
            }

            this.field9623 = this.field9621 = this.field9629[++this.field9625] = arg1;
            this.field9623.method2926(-21720);
         } else {
            this.method4744(arg1, (byte)67);
            this.method4782(arg1, -4);
         }

         if (!arg0) {
            this.field9675 = -57;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[79] + arg0 + ',' + (arg1 != null ? field9769[4] : field9769[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(IF)V"
   )
   public final void method4797(int arg0, float arg1) {
      try {
         if (arg0 != 0) {
            this.field9719 = null;
         }

         ++field9594;
         if (this.field9740 != arg1) {
            this.field9740 = arg1;
            if (this.field9733 == 3) {
               this.method4767(84);
               return;
            }
         }

      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[38] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "p",
      descriptor = "(I)V"
   )
   private final void method4798(int arg0) {
      try {
         if (arg0 == -21991) {
            OpenGL.glDepthMask(this.field9646 && this.field9659);
            ++field9464;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[99] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "xa",
      descriptor = "(F)V"
   )
   public final void method679(float arg0) {
      try {
         if (this.field9725 != arg0) {
            this.field9725 = arg0;
            this.method4790(1);
         }

         ++field9579;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[129] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(Lza;)V"
   )
   public final void method619(class624 arg0) {
      try {
         this.field9618 = ((class88)arg0).field1277;
         ++field9567;
         if (this.field9658 == null) {
            class37 var2;
            label26: {
               var2 = new class37(80);
               if (this.field9695) {
                  var2.method265(29481, -1.0F);
                  var2.method265(29481, -1.0F);
                  var2.method265(29481, 0.0F);
                  var2.method265(29481, 0.0F);
                  var2.method265(29481, 1.0F);
                  var2.method265(29481, 1.0F);
                  var2.method265(29481, -1.0F);
                  var2.method265(29481, 0.0F);
                  var2.method265(29481, 1.0F);
                  var2.method265(29481, 1.0F);
                  var2.method265(29481, 1.0F);
                  var2.method265(29481, 1.0F);
                  var2.method265(29481, 0.0F);
                  var2.method265(29481, 1.0F);
                  var2.method265(29481, 0.0F);
                  var2.method265(29481, -1.0F);
                  var2.method265(29481, 1.0F);
                  var2.method265(29481, 0.0F);
                  var2.method265(29481, 0.0F);
                  var2.method265(29481, 0.0F);
                  if (!client.field1786) {
                     break label26;
                  }
               }

               var2.method266(115976568, -1.0F);
               var2.method266(115976568, -1.0F);
               var2.method266(115976568, 0.0F);
               var2.method266(115976568, 0.0F);
               var2.method266(115976568, 1.0F);
               var2.method266(115976568, 1.0F);
               var2.method266(115976568, -1.0F);
               var2.method266(115976568, 0.0F);
               var2.method266(115976568, 1.0F);
               var2.method266(115976568, 1.0F);
               var2.method266(115976568, 1.0F);
               var2.method266(115976568, 1.0F);
               var2.method266(115976568, 0.0F);
               var2.method266(115976568, 1.0F);
               var2.method266(115976568, 0.0F);
               var2.method266(115976568, -1.0F);
               var2.method266(115976568, 1.0F);
               var2.method266(115976568, 0.0F);
               var2.method266(115976568, 0.0F);
               var2.method266(115976568, 0.0F);
            }

            this.field9658 = this.method4759(20, var2.field5436, false, var2.field5428, -99);
            this.field9744 = new class436(this.field9658, 5126, 3, 0);
            this.field9736 = new class436(this.field9658, 5126, 2, 12);
            this.field9604.method4710(this, true);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[144] + (arg0 != null ? field9769[4] : field9769[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "b",
      descriptor = "(IBI)V"
   )
   public final void method4799(int arg0, byte arg1, int arg2) {
      try {
         this.field9707 = arg2;
         ++field9534;
         if (arg1 == -92) {
            this.field9743 = arg0;
            this.method4774(true);
            this.method4800((byte)72);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9769[90] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "e",
      descriptor = "(B)V"
   )
   private final void method4800(byte arg0) {
      try {
         label23: {
            if (this.field9673 <= this.field9668 && ~this.field9759 <= ~this.field9680) {
               OpenGL.glScissor(this.field9743 - -this.field9673, -this.field9759 + this.field9472 + this.field9707, -this.field9673 + this.field9668, -this.field9680 + this.field9759);
               if (!client.field1786) {
                  break label23;
               }
            }

            OpenGL.glScissor(0, 0, 0, 0);
         }

         ++field9450;
         if (arg0 < 33) {
            this.field9683 = null;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[42] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method699(int arg0, int arg1) throws class623 {
      try {
         try {
            this.field9485.swapBuffers();
         } catch (Exception var4) {
         }

         ++field9548;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9769[116] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "b",
      descriptor = "(ZZ)V"
   )
   public final void method4801(boolean arg0, boolean arg1) {
      try {
         ++field9501;
         if (!this.field9711 == arg0) {
            this.field9711 = arg0;
            this.method4769((byte)-45);
         }

         if (!arg1) {
            this.method649(98, -70, 15, 7, -107, 77, -98);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[44] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "U",
      descriptor = "(IIIII)V"
   )
   public final void method665(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.method4731(28626);
         ++field9459;
         this.method4783(3008, arg4);
         float var6 = (float)arg0 + 0.35F;
         OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
         float var7 = (float)arg1 + 0.35F;
         OpenGL.glBegin(1);
         OpenGL.glVertex2f(var6, var7);
         OpenGL.glVertex2f((float)arg2 + var6, var7);
         OpenGL.glEnd();
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field9769[104] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "f",
      descriptor = "(Z)V"
   )
   public final void method4802(boolean arg0) {
      try {
         if (arg0) {
            this.method697(-49, 96, true);
         }

         ++field9512;
         if (~this.field9645 != -3) {
            this.method4806(30847);
            this.method4762(false, (byte)88);
            this.method4749(true, false);
            this.method4807(false, false);
            this.method4779((byte)-35, false);
            this.method4805(-2, (byte)26);
            this.field9645 = 2;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[187] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "p",
      descriptor = "()Z"
   )
   public final boolean method610() {
      try {
         ++field9560;
         return true;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9769[34] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "XA",
      descriptor = "()I"
   )
   public final int method616() {
      try {
         ++field9488;
         return this.field9664;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9769[103] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method686(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field9608.method4363(arg3, arg0, arg2, 0, arg1);
         ++field9514;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9769[115] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "B",
      descriptor = "()V"
   )
   public final void method680() {
      try {
         ++field9543;
         if (this.field9665 && ~this.field9599 < -1 && this.field9472 > 0) {
            int var1 = this.field9673;
            int var2 = this.field9668;
            int var3 = this.field9680;
            int var4 = this.field9759;
            this.method701();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method4784(0);
            this.method4762(false, (byte)-122);
            this.method4749(true, false);
            this.method4807(false, false);
            this.method4779((byte)-35, false);
            this.method4792(-26367, (class799)null);
            this.method4805(-2, (byte)26);
            this.method4765(1, (byte)-3);
            this.method4783(3008, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field9599, this.field9472, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method629(var1, var3, var2, var4);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9769[46] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "b",
      descriptor = "(IIZ)V"
   )
   public final void method4803(int arg0, int arg1, boolean arg2) {
      try {
         if (!arg2) {
            this.method4774(true);
         }

         ++field9420;
         if (~this.field9675 != -1) {
            OpenGL.glTexEnvi(8960, 34161, arg0);
            OpenGL.glTexEnvi(8960, 34162, arg1);
         } else {
            boolean var4 = false;
            if (~this.field9656 != ~arg0) {
               OpenGL.glTexEnvi(8960, 34161, arg0);
               var4 = true;
               this.field9656 = arg0;
            }

            if (this.field9730 != arg1) {
               OpenGL.glTexEnvi(8960, 34162, arg1);
               this.field9730 = arg1;
               var4 = true;
            }

            if (var4) {
               this.field9645 &= -30;
            }
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9769[75] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V"
   )
   public final void method593(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class623 {
      try {
         ++field9451;
         this.method699(arg2, arg3);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9769[37] + (arg0 != null ? field9769[4] : field9769[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "q",
      descriptor = "(I)V"
   )
   public final void method4804(int arg0) {
      try {
         ++field9518;
         OpenGL.glPushMatrix();
         if (arg0 != -12167) {
            this.method4754(21, -52);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[203] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(IIIIIILaa;II)V"
   )
   public final void method597(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class96 arg6, int arg7, int arg8) {
      try {
         ++field9539;
         class639 var10 = (class639)arg6;
         class419 var11 = var10.field9251;
         this.method4802(false);
         this.method4792(-26367, var10.field9251);
         this.method4783(3008, arg5);
         this.method4803(7681, 8448, true);
         this.method4809(768, (byte)-128, 34167, 0);
         float var12 = var11.field6488 / (float)var11.field6485;
         float var13 = var11.field6487 / (float)var11.field6482;
         float var14 = (float)arg2 - (float)arg0;
         float var15 = (float)arg3 - (float)arg1;
         float var16 = (float)(1.0D / Math.sqrt((double)(var14 * var14 + var15 * var15)));
         float var17 = var15 * var16;
         float var18 = var14 * var16;
         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         OpenGL.glBegin(1);
         OpenGL.glTexCoord2f((float)(-arg7 + arg0) * var12, (float)(-arg8 + arg1) * var13);
         OpenGL.glVertex2f((float)arg0 + 0.35F, (float)arg1 + 0.35F);
         OpenGL.glTexCoord2f((float)(-arg7 + arg2) * var12, (float)(arg3 - arg8) * var13);
         OpenGL.glVertex2f((float)arg2 + var18 + 0.35F, (float)arg3 + var17 + 0.35F);
         OpenGL.glEnd();
         this.method4809(768, (byte)-128, 5890, 0);
      } catch (RuntimeException var20) {
         throw class482.method3757(var20, field9769[86] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field9769[4] : field9769[3]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "c",
      descriptor = "(IB)V"
   )
   public final void method4805(int arg0, byte arg1) {
      try {
         this.method4741(true, -71, arg0);
         if (arg1 != 26) {
            this.method621();
         }

         ++field9404;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[84] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method649(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         OpenGL.glLineWidth((float)arg5);
         ++field9571;
         this.method695(arg0, arg1, arg2, arg3, arg4, arg6);
         OpenGL.glLineWidth(1.0F);
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field9769[127] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "d",
      descriptor = "(I)V"
   )
   private final void method4806(int arg0) {
      try {
         if (~this.field9733 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field9599 < -1 && ~this.field9472 < -1) {
               OpenGL.glOrtho(0.0D, (double)this.field9599, (double)this.field9472, 0.0D, -1.0D, 1.0D);
            }

            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field9645 &= -25;
            this.field9733 = 1;
         }

         ++field9589;
         if (arg0 != 30847) {
            this.field9685 = true;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[98] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "c",
      descriptor = "(ZZ)V"
   )
   public final void method4807(boolean arg0, boolean arg1) {
      try {
         ++field9431;
         if (arg1) {
            this.field9658 = null;
         }

         if (arg0 == !this.field9648) {
            label27: {
               if (!arg0) {
                  OpenGL.glDisable(2929);
                  if (!client.field1786) {
                     break label27;
                  }
               }

               OpenGL.glEnable(2929);
            }

            this.field9648 = arg0;
            this.field9645 &= -32;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[111] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "g",
      descriptor = "(Z)V"
   )
   private final void method4808(boolean arg0) {
      try {
         this.field9741 = new class799[this.field9704];
         ++field9435;
         this.field9670 = new class396(this, 3553, 6408, 1, 1);
         if (arg0) {
            this.field9652 = false;
         }

         new class396(this, 3553, 6408, 1, 1);
         new class396(this, 3553, 6408, 1, 1);
         this.field9677 = new class146(this);
         this.field9684 = new class146(this);
         this.field9752 = new class146(this);
         this.field9710 = new class146(this);
         this.field9755 = new class146(this);
         this.field9692 = new class146(this);
         this.field9687 = new class146(this);
         this.field9719 = new class146(this);
         this.field9756 = new class146(this);
         this.field9754 = new class146(this);
         if (this.field9737) {
            this.field9669 = new class358(this);
            new class358(this);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[82] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(IBII)V"
   )
   public final void method4809(int arg0, byte arg1, int arg2, int arg3) {
      try {
         ++field9456;
         OpenGL.glTexEnvi(8960, arg3 + 34176, arg2);
         if (arg1 <= -127) {
            OpenGL.glTexEnvi(8960, arg3 + 34192, arg0);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9769[93] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "u",
      descriptor = "()Z"
   )
   public final boolean method677() {
      try {
         ++field9536;
         return false;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9769[105] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(Lkf;)V"
   )
   public final void method688(class401 arg0) {
      try {
         ++field9523;
         this.field9647.method1549(arg0);
         this.field9650.method1549(this.field9647);
         this.field9650.method1559(0);
         this.field9651.method1544((byte)-119, this.field9650);
         if (this.field9733 != 1) {
            this.method4766(81);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[39] + (arg0 != null ? field9769[4] : field9769[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(B)V"
   )
   private final void method4810(byte arg0) {
      try {
         if (arg0 >= -9) {
            this.method700(69, 2, 103, (int[])null);
         }

         ++field9448;
         this.field9699 = (float)(-this.field9713 + this.field9759);
         this.field9742 = (float)(-this.field9728 + this.field9673);
         this.field9751 = (float)(this.field9668 - this.field9728);
         this.field9662 = (float)(-this.field9713 + this.field9680);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[76] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "m",
      descriptor = "(I)Lps;"
   )
   public final class553 method4811(int arg0) {
      try {
         if (arg0 < 18) {
            this.field9721 = null;
         }

         ++field9507;
         return this.field9729 == null ? null : this.field9729.method2683(108);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[107] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method645(int arg0) {
      try {
         ++field9576;
         this.method4757(-29305);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[154] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "EA",
      descriptor = "(IIII)V"
   )
   public final void method580(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field9611;
         if (!this.field9667) {
            throw new RuntimeException("");
         } else {
            this.field9666 = arg0;
            this.field9663 = arg3;
            this.field9705 = arg2;
            this.field9686 = arg1;
            if (this.field9712) {
               this.field9609.field10608.method5624((byte)-29);
               this.field9609.field10608.method5622((byte)35);
            }
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9769[25] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V"
   )
   public final void method636(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class96 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      boolean var13 = client.field1786;

      try {
         ++field9480;
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
               class639 var14 = (class639)arg6;
               class419 var15 = var14.field9251;
               this.method4802(false);
               this.method4792(-26367, var14.field9251);
               this.method4783(3008, arg5);
               this.method4803(7681, 8448, true);
               this.method4809(768, (byte)-128, 34167, 0);
               var16 = var15.field6488 / (float)var15.field6485;
               var17 = var15.field6487 / (float)var15.field6482;
               float var18 = (float)arg2 - (float)arg0;
               float var19 = (float)arg3 - (float)arg1;
               float var20 = (float)(1.0D / Math.sqrt((double)(var18 * var18 + var19 * var19)));
               var21 = var19 * var20;
               var22 = var18 * var20;
               int var35 = arg11 % (arg10 - -arg9);
               OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
               var23 = (float)arg9 * var22;
               var24 = (float)arg9 * var21;
               var25 = 0.0F;
               var26 = 0.0F;
               var27 = var23;
               var28 = var24;
               if (~arg9 > ~var35) {
                  var26 = (float)(-var35 + arg9 + arg10) * var21;
                  var25 = (float)(arg9 - -arg10 - var35) * var22;
                  if (!var13) {
                     break label87;
                  }
               }

               var28 = (float)(-var35 + arg9) * var21;
               var27 = (float)(-var35 + arg9) * var22;
            }

            float var29 = (float)arg0 + 0.35F + var25;
            float var30 = (float)arg1 + 0.35F + var26;
            float var31 = (float)arg10 * var22;
            float var32 = (float)arg10 * var21;

            do {
               label94: {
                  int var10000;
                  label78: {
                     if (~arg0 <= ~arg2) {
                        float var36;
                        var10000 = (var36 = var29 - ((float)arg2 + 0.35F)) == 0.0F ? 0 : (var36 < 0.0F ? -1 : 1);
                        if (var13) {
                           break label78;
                        }

                        if (var10000 < 0) {
                           break;
                        }

                        if (!((float)arg2 > var27 + var29)) {
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

                  if (var27 + var29 > (float)arg2) {
                     var27 = (float)arg2 + -var29;
                  }
               }

               label96: {
                  if (arg3 <= arg1) {
                     if ((float)arg3 + 0.35F > var30) {
                        break;
                     }

                     if (!(var28 + var30 < (float)arg3)) {
                        break label96;
                     }

                     var28 = (float)arg3 + -var30;
                     if (!var13) {
                        break label96;
                     }
                  }

                  if ((float)arg3 + 0.35F < var30) {
                     break;
                  }

                  if ((float)arg3 < var28 + var30) {
                     var28 = (float)arg3 + -var30;
                  }
               }

               OpenGL.glBegin(1);
               OpenGL.glTexCoord2f(((float)(-arg7) + var29) * var16, ((float)(-arg8) + var30) * var17);
               OpenGL.glVertex2f(var29, var30);
               OpenGL.glTexCoord2f((var27 + var29 - (float)arg7) * var16, (var28 + var30 - (float)arg8) * var17);
               OpenGL.glVertex2f(var27 + var29, var28 + var30);
               var29 += var27 + var31;
               var30 += var28 + var32;
               OpenGL.glEnd();
               var27 = var23;
               var28 = var24;
            } while(!var13);

            this.method4809(768, (byte)-128, 5890, 0);
         }
      } catch (RuntimeException var34) {
         throw class482.method3757(var34, field9769[218] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field9769[4] : field9769[3]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(II[I[I)Laa;"
   )
   public final class96 method608(int arg0, int arg1, int[] arg2, int[] arg3) {
      try {
         ++field9463;
         return class493.method3814(this, arg0, (byte)-125, arg3, arg1, arg2);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9769[60] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9769[4] : field9769[3]) + ',' + (arg3 != null ? field9769[4] : field9769[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "f",
      descriptor = "()V"
   )
   public final void method672() {
      try {
         this.field9608.method4358((byte)78);
         ++field9550;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9769[190] + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(Lnga;IIII)Lka;"
   )
   public final class91 method614(class159 arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field9452;
         return new class146(this, arg0, arg1, arg3, arg4, arg2);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field9769[119] + (arg0 != null ? field9769[4] : field9769[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(Lcl;)V"
   )
   public final void method693(class141 arg0) {
      try {
         ++field9591;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9769[199] + (arg0 != null ? field9769[4] : field9769[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(BIII)V"
   )
   public final void method4812(byte arg0, int arg1, int arg2, int arg3) {
      try {
         OpenGL.glDrawArrays(arg2, arg3, arg1);
         if (arg0 <= 10) {
            this.method590(-42);
         }

         ++field9573;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9769[62] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(BLli;)V"
   )
   public final void method4813(byte arg0, class112 arg1) {
      try {
         ++field9427;
         if (arg0 == 67) {
            if (this.field9683 != arg1) {
               if (this.field9760) {
                  OpenGL.glBindBufferARB(34962, arg1.method1055(20584));
               }

               this.field9683 = arg1;
            }
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9769[186] + arg0 + ',' + (arg1 != null ? field9769[4] : field9769[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "DA",
      descriptor = "(IIII)V"
   )
   public final void method639(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field9745 = arg2;
         ++field9582;
         this.field9713 = arg1;
         this.field9728 = arg0;
         this.field9717 = arg3;
         this.method4770((byte)118);
         this.method4810((byte)-67);
         if (this.field9733 == 3) {
            this.method4767(110);
         } else if (~this.field9733 == -3) {
            this.method4793(false);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9769[208] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "<init>",
      descriptor = "(Ljava/awt/Canvas;Ld;I)V"
   )
   public class652(Canvas param1, class150 param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!c",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4814(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 86);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!c",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4815(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 86;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
