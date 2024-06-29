import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class530 extends class479 {
   @OriginalMember(
      owner = "client!iu",
      name = "V",
      descriptor = "Ljava/util/Hashtable;"
   )
   private Hashtable field7468;
   @OriginalMember(
      owner = "client!iu",
      name = "Ee",
      descriptor = "I"
   )
   public int field7629;
   @OriginalMember(
      owner = "client!iu",
      name = "Bc",
      descriptor = "Lcq;"
   )
   private class306 field7628;
   @OriginalMember(
      owner = "client!iu",
      name = "Td",
      descriptor = "Lcha;"
   )
   private class184 field7638;
   @OriginalMember(
      owner = "client!iu",
      name = "yh",
      descriptor = "Lcha;"
   )
   public class184 field7639;
   @OriginalMember(
      owner = "client!iu",
      name = "Qf",
      descriptor = "I"
   )
   public int field7641;
   @OriginalMember(
      owner = "client!iu",
      name = "Zc",
      descriptor = "I"
   )
   public int field7645;
   @OriginalMember(
      owner = "client!iu",
      name = "fb",
      descriptor = "Z"
   )
   private boolean field7644;
   @OriginalMember(
      owner = "client!iu",
      name = "Wg",
      descriptor = "Lrca;"
   )
   private class37 field7643;
   @OriginalMember(
      owner = "client!iu",
      name = "ob",
      descriptor = "[Lpl;"
   )
   private class241[] field7649;
   @OriginalMember(
      owner = "client!iu",
      name = "vf",
      descriptor = "I"
   )
   private int field7650;
   @OriginalMember(
      owner = "client!iu",
      name = "Kg",
      descriptor = "I"
   )
   private int field7648;
   @OriginalMember(
      owner = "client!iu",
      name = "P",
      descriptor = "I"
   )
   private int field7655;
   @OriginalMember(
      owner = "client!iu",
      name = "ad",
      descriptor = "[Lpl;"
   )
   private class241[] field7651;
   @OriginalMember(
      owner = "client!iu",
      name = "Zb",
      descriptor = "[Lpl;"
   )
   private class241[] field7656;
   @OriginalMember(
      owner = "client!iu",
      name = "se",
      descriptor = "Lrca;"
   )
   private class37 field7659;
   @OriginalMember(
      owner = "client!iu",
      name = "ee",
      descriptor = "Lrca;"
   )
   private class37 field7661;
   @OriginalMember(
      owner = "client!iu",
      name = "xc",
      descriptor = "Lrca;"
   )
   private class37 field7662;
   @OriginalMember(
      owner = "client!iu",
      name = "Xd",
      descriptor = "Lrca;"
   )
   private class37 field7663;
   @OriginalMember(
      owner = "client!iu",
      name = "Fd",
      descriptor = "Lrca;"
   )
   private class37 field7664;
   @OriginalMember(
      owner = "client!iu",
      name = "Jd",
      descriptor = "Lrca;"
   )
   private class37 field7665;
   @OriginalMember(
      owner = "client!iu",
      name = "Yd",
      descriptor = "Lrca;"
   )
   private class37 field7666;
   @OriginalMember(
      owner = "client!iu",
      name = "Ag",
      descriptor = "Lcha;"
   )
   public class184 field7672;
   @OriginalMember(
      owner = "client!iu",
      name = "Ke",
      descriptor = "Lcha;"
   )
   public class184 field7676;
   @OriginalMember(
      owner = "client!iu",
      name = "wd",
      descriptor = "Lcha;"
   )
   public class184 field7677;
   @OriginalMember(
      owner = "client!iu",
      name = "ff",
      descriptor = "F"
   )
   private float field7686;
   @OriginalMember(
      owner = "client!iu",
      name = "fd",
      descriptor = "[F"
   )
   private float[] field7691;
   @OriginalMember(
      owner = "client!iu",
      name = "Ab",
      descriptor = "F"
   )
   public float field7713;
   @OriginalMember(
      owner = "client!iu",
      name = "ih",
      descriptor = "I"
   )
   public int field7702;
   @OriginalMember(
      owner = "client!iu",
      name = "J",
      descriptor = "F"
   )
   public float field7708;
   @OriginalMember(
      owner = "client!iu",
      name = "Hb",
      descriptor = "I"
   )
   public int field7689;
   @OriginalMember(
      owner = "client!iu",
      name = "Ie",
      descriptor = "I"
   )
   private int field7699;
   @OriginalMember(
      owner = "client!iu",
      name = "Qb",
      descriptor = "Z"
   )
   private boolean field7715;
   @OriginalMember(
      owner = "client!iu",
      name = "db",
      descriptor = "F"
   )
   private float field7703;
   @OriginalMember(
      owner = "client!iu",
      name = "w",
      descriptor = "I"
   )
   public int field7696;
   @OriginalMember(
      owner = "client!iu",
      name = "D",
      descriptor = "F"
   )
   public float field7722;
   @OriginalMember(
      owner = "client!iu",
      name = "qf",
      descriptor = "I"
   )
   private int field7705;
   @OriginalMember(
      owner = "client!iu",
      name = "kd",
      descriptor = "[F"
   )
   private float[] field7718;
   @OriginalMember(
      owner = "client!iu",
      name = "Ff",
      descriptor = "Z"
   )
   private boolean field7682;
   @OriginalMember(
      owner = "client!iu",
      name = "ng",
      descriptor = "I"
   )
   public int field7733;
   @OriginalMember(
      owner = "client!iu",
      name = "Ae",
      descriptor = "I"
   )
   private int field7698;
   @OriginalMember(
      owner = "client!iu",
      name = "Ub",
      descriptor = "F"
   )
   public float field7706;
   @OriginalMember(
      owner = "client!iu",
      name = "W",
      descriptor = "I"
   )
   public int field7734;
   @OriginalMember(
      owner = "client!iu",
      name = "Gf",
      descriptor = "I"
   )
   public int field7690;
   @OriginalMember(
      owner = "client!iu",
      name = "dh",
      descriptor = "I"
   )
   public int field7744;
   @OriginalMember(
      owner = "client!iu",
      name = "B",
      descriptor = "[F"
   )
   public float[] field7684;
   @OriginalMember(
      owner = "client!iu",
      name = "Ve",
      descriptor = "F"
   )
   public float field7728;
   @OriginalMember(
      owner = "client!iu",
      name = "oe",
      descriptor = "[F"
   )
   private float[] field7767;
   @OriginalMember(
      owner = "client!iu",
      name = "kc",
      descriptor = "F"
   )
   private float field7745;
   @OriginalMember(
      owner = "client!iu",
      name = "L",
      descriptor = "I"
   )
   public int field7726;
   @OriginalMember(
      owner = "client!iu",
      name = "Zd",
      descriptor = "F"
   )
   private float field7749;
   @OriginalMember(
      owner = "client!iu",
      name = "wc",
      descriptor = "I"
   )
   private int field7735;
   @OriginalMember(
      owner = "client!iu",
      name = "qg",
      descriptor = "[Lue;"
   )
   private class243[] field7748;
   @OriginalMember(
      owner = "client!iu",
      name = "Df",
      descriptor = "F"
   )
   private float field7754;
   @OriginalMember(
      owner = "client!iu",
      name = "Ld",
      descriptor = "I"
   )
   public int field7761;
   @OriginalMember(
      owner = "client!iu",
      name = "Tc",
      descriptor = "I"
   )
   private int field7712;
   @OriginalMember(
      owner = "client!iu",
      name = "A",
      descriptor = "F"
   )
   public float field7742;
   @OriginalMember(
      owner = "client!iu",
      name = "Ig",
      descriptor = "F"
   )
   public float field7755;
   @OriginalMember(
      owner = "client!iu",
      name = "Rc",
      descriptor = "I"
   )
   private int field7768;
   @OriginalMember(
      owner = "client!iu",
      name = "Gg",
      descriptor = "I"
   )
   private int field7775;
   @OriginalMember(
      owner = "client!iu",
      name = "U",
      descriptor = "I"
   )
   private int field7731;
   @OriginalMember(
      owner = "client!iu",
      name = "rf",
      descriptor = "[F"
   )
   private float[] field7785;
   @OriginalMember(
      owner = "client!iu",
      name = "Be",
      descriptor = "I"
   )
   private int field7783;
   @OriginalMember(
      owner = "client!iu",
      name = "x",
      descriptor = "I"
   )
   public int field7770;
   @OriginalMember(
      owner = "client!iu",
      name = "ge",
      descriptor = "I"
   )
   public int field7787;
   @OriginalMember(
      owner = "client!iu",
      name = "Qc",
      descriptor = "I"
   )
   private int field7788;
   @OriginalMember(
      owner = "client!iu",
      name = "qd",
      descriptor = "Lvt;"
   )
   public class771 field7694;
   @OriginalMember(
      owner = "client!iu",
      name = "T",
      descriptor = "[I"
   )
   public int[] field7790;
   @OriginalMember(
      owner = "client!iu",
      name = "Mb",
      descriptor = "[I"
   )
   public int[] field7789;
   @OriginalMember(
      owner = "client!iu",
      name = "hd",
      descriptor = "[I"
   )
   public int[] field7791;
   @OriginalMember(
      owner = "client!iu",
      name = "dc",
      descriptor = "[B"
   )
   public byte[] field7793;
   @OriginalMember(
      owner = "client!iu",
      name = "Pb",
      descriptor = "I"
   )
   public int field7636;
   @OriginalMember(
      owner = "client!iu",
      name = "Kc",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field7533;
   @OriginalMember(
      owner = "client!iu",
      name = "rh",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field7455;
   @OriginalMember(
      owner = "client!iu",
      name = "xg",
      descriptor = "Ljaggl/OpenGL;"
   )
   private OpenGL field7599;
   @OriginalMember(
      owner = "client!iu",
      name = "Od",
      descriptor = "J"
   )
   private long field7547;
   @OriginalMember(
      owner = "client!iu",
      name = "Q",
      descriptor = "J"
   )
   private long field7443;
   @OriginalMember(
      owner = "client!iu",
      name = "fe",
      descriptor = "Z"
   )
   public boolean field7781;
   @OriginalMember(
      owner = "client!iu",
      name = "Fb",
      descriptor = "I"
   )
   public int field7710;
   @OriginalMember(
      owner = "client!iu",
      name = "Te",
      descriptor = "Ljava/lang/String;"
   )
   private String field7763;
   @OriginalMember(
      owner = "client!iu",
      name = "zb",
      descriptor = "Z"
   )
   public boolean field7685;
   @OriginalMember(
      owner = "client!iu",
      name = "Hc",
      descriptor = "Z"
   )
   public boolean field7741;
   @OriginalMember(
      owner = "client!iu",
      name = "Bb",
      descriptor = "Z"
   )
   private boolean field7777;
   @OriginalMember(
      owner = "client!iu",
      name = "ve",
      descriptor = "Z"
   )
   public boolean field7695;
   @OriginalMember(
      owner = "client!iu",
      name = "Rb",
      descriptor = "Z"
   )
   private boolean field7704;
   @OriginalMember(
      owner = "client!iu",
      name = "Wf",
      descriptor = "Z"
   )
   public boolean field7738;
   @OriginalMember(
      owner = "client!iu",
      name = "sg",
      descriptor = "Ljava/lang/String;"
   )
   private String field7778;
   @OriginalMember(
      owner = "client!iu",
      name = "If",
      descriptor = "Z"
   )
   public boolean field7780;
   @OriginalMember(
      owner = "client!iu",
      name = "uh",
      descriptor = "Z"
   )
   private boolean field7700;
   @OriginalMember(
      owner = "client!iu",
      name = "G",
      descriptor = "Lau;"
   )
   private class781 field7637;
   @OriginalMember(
      owner = "client!iu",
      name = "bg",
      descriptor = "Llc;"
   )
   public class740 field7642;
   @OriginalMember(
      owner = "client!iu",
      name = "Qd",
      descriptor = "Lvd;"
   )
   private class714 field7634;
   @OriginalMember(
      owner = "client!iu",
      name = "jh",
      descriptor = "Lnka;"
   )
   private class270 field7633;
   @OriginalMember(
      owner = "client!iu",
      name = "Ye",
      descriptor = "Llh;"
   )
   private class383 field7631;
   @OriginalMember(
      owner = "client!iu",
      name = "Ah",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7795 = new String[]{method4042(method4041("9\bH6cx")), method4042(method4041("9\bH9bx")), method4042(method4041(">\b\n\u001c")), method4042(method4041("9\bH3`x")), method4042(method4041("+SH^[")), method4042(method4041("9\bH!ax")), method4042(method4041("9\bH2ex")), method4042(method4041("9\bH2gx")), method4042(method4041("9\bH#dx")), method4042(method4041("9\bH$gx")), method4042(method4041("9\bH&ex")), method4042(method4041("9\bH<gx")), method4042(method4041("9\bH#cx")), method4042(method4041("9\bH8\u000e")), method4042(method4041("9\bH>cx")), method4042(method4041("9\bH?ex")), method4042(method4041("9\bH4ex")), method4042(method4041("9\bH8gx")), method4042(method4041("9\bH\u0011Gx")), method4042(method4041("9\bH>bx")), method4042(method4041("9\bH%cx")), method4042(method4041("9\bH:dx")), method4042(method4041("9\bH5\u000e")), method4042(method4041("9\bH3ax")), method4042(method4041("9\bH$cx")), method4042(method4041("9\bH7bx")), method4042(method4041("9\bH9\u000e")), method4042(method4041("9\bH#gx")), method4042(method4041("9\bH7ax")), method4042(method4041("9\bH4dx")), method4042(method4041("9\bH:ax")), method4042(method4041("9\bH#bx")), method4042(method4041("9\bH\u0016\u000e")), method4042(method4041("9\bH\u0019\u000e")), method4042(method4041("9\bH cx")), method4042(method4041("9\bH1gx")), method4042(method4041("9\bH\tGx")), method4042(method4041("9\bH?ax")), method4042(method4041("9\bH#ex")), method4042(method4041("9\bH'bx")), method4042(method4041("9\bH9dx")), method4042(method4041("9\bH9`x")), method4042(method4041("9\bH\u001cGx")), method4042(method4041("9\bH1dx")), method4042(method4041("9\bH#`x")), method4042(method4041("9\bH6ax")), method4042(method4041("9\bH1bx")), method4042(method4041("9\bH6bx")), method4042(method4041("9\bH:gx")), method4042(method4041("9\bH$ex")), method4042(method4041("9\bH4ax")), method4042(method4041("9\bH\u0002Gx")), method4042(method4041("9\bH?dx")), method4042(method4041("9\bH=ax")), method4042(method4041("9\bH%\u000e")), method4042(method4041("9\bH6\u000e")), method4042(method4041("9\bH>dx")), method4042(method4041("9\bH9ax")), method4042(method4041("9\bH%bx")), method4042(method4041("9\bH'dx")), method4042(method4041("9\bH3cx")), method4042(method4041("9\bH;\u000e")), method4042(method4041("9\bH$bx")), method4042(method4041("9\bH\u0014Gx")), method4042(method4041("9\bH6ex")), method4042(method4041("9\bH'ex")), method4042(method4041("9\bH5ex")), method4042(method4041("9\bH8ax")), method4042(method4041("9\bH>ax")), method4042(method4041("9\bH<`x")), method4042(method4041("9\bH:bx")), method4042(method4041("9\bH!ex")), method4042(method4041("9\bH;bx")), method4042(method4041("9\bH&dx")), method4042(method4041("9\bH:`x")), method4042(method4041("9\bH3bx")), method4042(method4041("9\bH\nGx")), method4042(method4041("9\bH$dx")), method4042(method4041("9\bH7cx")), method4042(method4041("9\bH3dx")), method4042(method4041("9\bH%ex")), method4042(method4041("9\bH(gx")), method4042(method4041("9\bH&`x")), method4042(method4041("9\bH\"gx")), method4042(method4041("9\bH1ex")), method4042(method4041("=\u001c\u0005")), method4042(method4041("\u0017191t\u0012\"\u0012\u0015^$\b\u0014\u0015y6\u0011\t\u0011R")), method4042(method4041("\u0017195~\u0004\"\u0012\u0015^$\b\u0014\u0015\u0015\u0014")), method4042(method4041("\u0017191t\u0012\"\u0012\u0015^$\b\u0014\u0015y5\u0013\u0010/E?\u0010\u0004\u0019H5")), method4042(method4041("2\u000f\u000f\u0011Hp\r\u0007\u0005J")), method4042(method4041("\u0017191t\u0012\"\u000b\u0005J$\u0014\u0015\u0011K \u0011\u0003")), method4042(method4041("\u0017195~\u0004\"\u0000\u0002G=\u0018\u0004\u0005@6\u0018\u0014/D<\u0014\u0012")), method4042(method4041("=\u0018\u0015\u0011")), method4042(method4041("9\bH?gx")), method4042(method4041("\u0017191t\u0012\"\u0000\u0002G7\u0010\u0003\u001eR\u000f\u000e\u000e\u0011B5\u000f")), method4042(method4041("\u0017191t\u0012\"\u0000\u0002G7\u0010\u0003\u001eR\u000f\r\u0014\u001fA\"\u001c\u000b")), method4042(method4041("\u0017191t\u0012\"\u000b\u0005J$\u0014\u0012\u0015^$\b\u0014\u0015")), method4042(method4041("\u0017195~\u0004\"\u0000\u0002G=\u0018\u0004\u0005@6\u0018\u0014/I2\u0017\u0003\u0013R")), method4042(method4041("\u0017191t\u0012\"\u0012\u0015^$\b\u0014\u0015y\"\u0018\u0005\u0004G>\u001a\n\u0015")), method4042(method4041("\u0017191t\u0012\"\u0010\u0015T$\u0018\u001e/U8\u001c\u0002\u0015T")), method4042(method4041("\u0017195~\u0004\"\u0000\u0002G=\u0018\u0004\u0005@6\u0018\u0014/K%\u0011\u0012\u0019U1\u0010\u0016\u001cC")), method4042(method4041("\u0017191t\u0012\"\u0010\u0015T$\u0018\u001e/D%\u001b\u0000\u0015T\u000f\u0012\u0004\u001aC3\t")), method4042(method4041("=\u0014\u0005\u0002I#\u0012\u0000\u0004")), method4042(method4041("\u0017191t\u0012\"\u0010\u0015T$\u0018\u001e/V\"\u0012\u0001\u0002G=")), method4042(method4041("\u0017191t\u0012\"\u0012\u0015^$\b\u0014\u0015y3\b\u0004\u0015y=\u001c\u0016")), method4042(method4041("9\bH6`x")), method4042(method4041("9\bH8bx")), method4042(method4041("}PXP")), method4042(method4041("4\u0014\u0014\u0015E$\u0011\t\u0017O>]")), method4042(method4041("9\bH'cx")), method4042(method4041("9\bH;ex")), method4042(method4041("9\bH\bGx")), method4042(method4041("9\bH2dx")), method4042(method4041("9\bH\"\u000e")), method4042(method4041("9\bH!gx")), method4042(method4041("9\bH%dx")), method4042(method4041("9\bH\u0012\u000e")), method4042(method4041("9\bH8cx")), method4042(method4041("9\bH \u000e")), method4042(method4041("9\bH=bx")), method4042(method4041("9\bH\"cx")), method4042(method4041("9\bH;cx")), method4042(method4041("\u001f\r\u0003\u001ea\u001c")), method4042(method4041(">\u000b\u000f\u0014O1")), method4042(method4041("9\bH>ex")), method4042(method4041("9\u0013\u0012\u0015J")), method4042(method4041("1\t\u000f")), method4042(method4041("9\bH$`x")), method4042(method4041("9\bH `x")), method4042(method4041("9\bH=gx")), method4042(method4041("9\bH?\u000e")), method4042(method4041("9\bH!\u000e")), method4042(method4041("9\bH1cx")), method4042(method4041("9\bH4bx")), method4042(method4041("9\bH:ex")), method4042(method4041("9\bH5dx")), method4042(method4041("8\u0019")), method4042(method4041(":\u001c\u0005\u001cO2")), method4042(method4041("\"\u001c\u0002\u0015I>")), method4042(method4041("\u0017191t\u0012\"\u000e\u0011J6\"\u0000\u001cI1\t9\u0000O(\u0018\n")), method4042(method4041(":\u001c\u0001\u0017J")), method4042(method4041("#NF\u0017T1\r\u000e\u0019E#")), method4042(method4041("9\bHLO>\u0014\u0012N\u000e")), method4042(method4041("9\bH:cx")), method4042(method4041("9\bH9gx")), method4042(method4041("9\bH dx")), method4042(method4041("9\bH5gx")), method4042(method4041("9\bH<ex")), method4042(method4041("9\bH$\u000e")), method4042(method4041("9\bH4\u000e")), method4042(method4041("9\bH4`x")), method4042(method4041("9\bH ex")), method4042(method4041("9\bH5cx")), method4042(method4041("9\bH1`x")), method4042(method4041("9\bH*gx")), method4042(method4041("9\bH bx")), method4042(method4041("9\bH7`x")), method4042(method4041("9\bH\u0002\u000e")), method4042(method4041("9\bH\u001eGx")), method4042(method4041("9\bH=dx")), method4042(method4041("9\bH<cx")), method4042(method4041("#\u0018\u00129A>\u0012\u0014\u0015t5\r\u0007\u0019H$")), method4042(method4041(":\u001c\u0010\u0011\b1\n\u0012^e1\u0013\u0010\u0011U")), method4042(method4041("9\bH'\u000e")), method4042(method4041("9\bH;`x")), method4042(method4041("9\bH5bx")), method4042(method4041("9\bH>`x")), method4042(method4041("9\bH7gx")), method4042(method4041("9\bH=ex")), method4042(method4041("9\bH=`x")), method4042(method4041("9\bH2cx")), method4042(method4041("9\bH<bx")), method4042(method4041("9\bH%gx")), method4042(method4041("9\bH4cx")), method4042(method4041("9\bH&gx")), method4042(method4041("9\bH5`x")), method4042(method4041("9\bH3\u000e")), method4042(method4041("9\bH7dx")), method4042(method4041("9\bH;gx")), method4042(method4041("9\bH1ax")), method4042(method4041("9\bH6dx")), method4042(method4041("9\bH>\u000e")), method4042(method4041("9\bH2bx")), method4042(method4041("9\bH!cx")), method4042(method4041("9\bH!dx")), method4042(method4041("9\bH=\u000e")), method4042(method4041("9\bH6gx")), method4042(method4041("9\bH?cx")), method4042(method4041("9\bH gx")), method4042(method4041("9\bH=cx")), method4042(method4041("9\bH9cx")), method4042(method4041("9\bH2\u000e")), method4042(method4041("9\bH1\u000e")), method4042(method4041("9\bH)\u000e")), method4042(method4041("9\bH\u0000Gx")), method4042(method4041("9\bH\"bx")), method4042(method4041("9\bH8`x")), method4042(method4041("9\bH3gx")), method4042(method4041("9\bH<dx")), method4042(method4041("9\bH2ax")), method4042(method4041("9\bH#\u000e")), method4042(method4041("9\bH<ax")), method4042(method4041("9\bH\"`x")), method4042(method4041("9\bH:\u000e")), method4042(method4041("9\bH(\u000e")), method4042(method4041("9\bH5ax")), method4042(method4041("9\bH<\u000e")), method4042(method4041("9\bH\"ex")), method4042(method4041("9\bH\"dx")), method4042(method4041("9\bH&cx")), method4042(method4041("9\bH;ax")), method4042(method4041("9\bH'gx")), method4042(method4041("9\bH&bx")), method4042(method4041("9\bH&\u000e")), method4042(method4041("9\bH'`x")), method4042(method4041("9\bH!bx")), method4042(method4041("9\bH8dx")), method4042(method4041("9\bH?`x")), method4042(method4041("9\bH8ex")), method4042(method4041("9\bH3ex")), method4042(method4041("9\bH4gx")), method4042(method4041("9\bH ax")), method4042(method4041("9\bH7ex")), method4042(method4041("9\bH2`x")), method4042(method4041("9\bH;dx")), method4042(method4041("9\bH!`x")), method4042(method4041("9\bH>gx")), method4042(method4041("9\bH%`x")), method4042(method4041("9\bH9ex")), method4042(method4041("9\bH?bx")), method4042(method4041("9\bH7\u000e"))};
   @OriginalMember(
      owner = "client!iu",
      name = "Pc",
      descriptor = "Laka;"
   )
   public static class418 field7543 = new class418(48, 17);
   @OriginalMember(
      owner = "client!iu",
      name = "Y",
      descriptor = "F"
   )
   public float field7709;
   @OriginalMember(
      owner = "client!iu",
      name = "jc",
      descriptor = "F"
   )
   private float field7719;
   @OriginalMember(
      owner = "client!iu",
      name = "Hg",
      descriptor = "F"
   )
   public float field7725;
   @OriginalMember(
      owner = "client!iu",
      name = "wb",
      descriptor = "F"
   )
   public float field7732;
   @OriginalMember(
      owner = "client!iu",
      name = "sd",
      descriptor = "F"
   )
   private float field7737;
   @OriginalMember(
      owner = "client!iu",
      name = "Bd",
      descriptor = "F"
   )
   public float field7750;
   @OriginalMember(
      owner = "client!iu",
      name = "Ng",
      descriptor = "F"
   )
   public float field7758;
   @OriginalMember(
      owner = "client!iu",
      name = "tg",
      descriptor = "F"
   )
   private float field7766;
   @OriginalMember(
      owner = "client!iu",
      name = "Gd",
      descriptor = "F"
   )
   public float field7779;
   @OriginalMember(
      owner = "client!iu",
      name = "Jb",
      descriptor = "I"
   )
   public static int field7426;
   @OriginalMember(
      owner = "client!iu",
      name = "Z",
      descriptor = "I"
   )
   public static int field7427;
   @OriginalMember(
      owner = "client!iu",
      name = "pd",
      descriptor = "I"
   )
   public static int field7428;
   @OriginalMember(
      owner = "client!iu",
      name = "Me",
      descriptor = "I"
   )
   public static int field7429;
   @OriginalMember(
      owner = "client!iu",
      name = "Sb",
      descriptor = "I"
   )
   public static int field7430;
   @OriginalMember(
      owner = "client!iu",
      name = "Vf",
      descriptor = "I"
   )
   public static int field7431;
   @OriginalMember(
      owner = "client!iu",
      name = "Xf",
      descriptor = "I"
   )
   public static int field7432;
   @OriginalMember(
      owner = "client!iu",
      name = "me",
      descriptor = "I"
   )
   public static int field7433;
   @OriginalMember(
      owner = "client!iu",
      name = "Pf",
      descriptor = "I"
   )
   public static int field7434;
   @OriginalMember(
      owner = "client!iu",
      name = "gf",
      descriptor = "I"
   )
   public static int field7435;
   @OriginalMember(
      owner = "client!iu",
      name = "O",
      descriptor = "I"
   )
   public static int field7436;
   @OriginalMember(
      owner = "client!iu",
      name = "Fg",
      descriptor = "I"
   )
   public static int field7437;
   @OriginalMember(
      owner = "client!iu",
      name = "Vc",
      descriptor = "I"
   )
   public static int field7438;
   @OriginalMember(
      owner = "client!iu",
      name = "Ue",
      descriptor = "I"
   )
   public static int field7439;
   @OriginalMember(
      owner = "client!iu",
      name = "of",
      descriptor = "I"
   )
   public static int field7440;
   @OriginalMember(
      owner = "client!iu",
      name = "Sg",
      descriptor = "I"
   )
   public static int field7441;
   @OriginalMember(
      owner = "client!iu",
      name = "Cg",
      descriptor = "I"
   )
   public static int field7442;
   @OriginalMember(
      owner = "client!iu",
      name = "zh",
      descriptor = "I"
   )
   public static int field7444;
   @OriginalMember(
      owner = "client!iu",
      name = "uc",
      descriptor = "I"
   )
   public static int field7445;
   @OriginalMember(
      owner = "client!iu",
      name = "ke",
      descriptor = "I"
   )
   public static int field7446;
   @OriginalMember(
      owner = "client!iu",
      name = "Kf",
      descriptor = "I"
   )
   public static int field7447;
   @OriginalMember(
      owner = "client!iu",
      name = "Mf",
      descriptor = "I"
   )
   public static int field7448;
   @OriginalMember(
      owner = "client!iu",
      name = "Jg",
      descriptor = "I"
   )
   public static int field7449;
   @OriginalMember(
      owner = "client!iu",
      name = "Ce",
      descriptor = "I"
   )
   public static int field7450;
   @OriginalMember(
      owner = "client!iu",
      name = "wh",
      descriptor = "I"
   )
   public static int field7451;
   @OriginalMember(
      owner = "client!iu",
      name = "fh",
      descriptor = "I"
   )
   public static int field7452;
   @OriginalMember(
      owner = "client!iu",
      name = "gc",
      descriptor = "I"
   )
   public int field7453;
   @OriginalMember(
      owner = "client!iu",
      name = "Nc",
      descriptor = "I"
   )
   public static int field7454;
   @OriginalMember(
      owner = "client!iu",
      name = "Yf",
      descriptor = "I"
   )
   public static int field7456;
   @OriginalMember(
      owner = "client!iu",
      name = "He",
      descriptor = "I"
   )
   public static int field7457;
   @OriginalMember(
      owner = "client!iu",
      name = "nc",
      descriptor = "I"
   )
   public static int field7458;
   @OriginalMember(
      owner = "client!iu",
      name = "kb",
      descriptor = "I"
   )
   public static int field7459;
   @OriginalMember(
      owner = "client!iu",
      name = "yc",
      descriptor = "I"
   )
   public static int field7460;
   @OriginalMember(
      owner = "client!iu",
      name = "le",
      descriptor = "I"
   )
   public static int field7461;
   @OriginalMember(
      owner = "client!iu",
      name = "Re",
      descriptor = "I"
   )
   public static int field7462;
   @OriginalMember(
      owner = "client!iu",
      name = "ab",
      descriptor = "I"
   )
   public static int field7463;
   @OriginalMember(
      owner = "client!iu",
      name = "cf",
      descriptor = "I"
   )
   public static int field7464;
   @OriginalMember(
      owner = "client!iu",
      name = "rc",
      descriptor = "I"
   )
   public static int field7465;
   @OriginalMember(
      owner = "client!iu",
      name = "Jc",
      descriptor = "I"
   )
   public static int field7466;
   @OriginalMember(
      owner = "client!iu",
      name = "Pe",
      descriptor = "I"
   )
   public static int field7467;
   @OriginalMember(
      owner = "client!iu",
      name = "bc",
      descriptor = "I"
   )
   public static int field7469;
   @OriginalMember(
      owner = "client!iu",
      name = "ie",
      descriptor = "I"
   )
   public static int field7470;
   @OriginalMember(
      owner = "client!iu",
      name = "pe",
      descriptor = "I"
   )
   public static int field7471;
   @OriginalMember(
      owner = "client!iu",
      name = "ac",
      descriptor = "I"
   )
   public static int field7472;
   @OriginalMember(
      owner = "client!iu",
      name = "Ne",
      descriptor = "I"
   )
   public static int field7473;
   @OriginalMember(
      owner = "client!iu",
      name = "yf",
      descriptor = "I"
   )
   public static int field7474;
   @OriginalMember(
      owner = "client!iu",
      name = "Xg",
      descriptor = "I"
   )
   public static int field7475;
   @OriginalMember(
      owner = "client!iu",
      name = "vd",
      descriptor = "I"
   )
   public static int field7476;
   @OriginalMember(
      owner = "client!iu",
      name = "ag",
      descriptor = "I"
   )
   public static int field7477;
   @OriginalMember(
      owner = "client!iu",
      name = "Wd",
      descriptor = "I"
   )
   public static int field7478;
   @OriginalMember(
      owner = "client!iu",
      name = "Lg",
      descriptor = "I"
   )
   public static int field7479;
   @OriginalMember(
      owner = "client!iu",
      name = "Of",
      descriptor = "I"
   )
   public static int field7480;
   @OriginalMember(
      owner = "client!iu",
      name = "Sd",
      descriptor = "I"
   )
   public static int field7481;
   @OriginalMember(
      owner = "client!iu",
      name = "qb",
      descriptor = "I"
   )
   public static int field7482;
   @OriginalMember(
      owner = "client!iu",
      name = "hg",
      descriptor = "I"
   )
   public static int field7483;
   @OriginalMember(
      owner = "client!iu",
      name = "eb",
      descriptor = "I"
   )
   public static int field7484;
   @OriginalMember(
      owner = "client!iu",
      name = "Fc",
      descriptor = "I"
   )
   public static int field7485;
   @OriginalMember(
      owner = "client!iu",
      name = "Zf",
      descriptor = "I"
   )
   public static int field7486;
   @OriginalMember(
      owner = "client!iu",
      name = "tc",
      descriptor = "I"
   )
   public static int field7487;
   @OriginalMember(
      owner = "client!iu",
      name = "Dc",
      descriptor = "I"
   )
   public static int field7488;
   @OriginalMember(
      owner = "client!iu",
      name = "Wb",
      descriptor = "I"
   )
   public static int field7489;
   @OriginalMember(
      owner = "client!iu",
      name = "we",
      descriptor = "I"
   )
   public static int field7490;
   @OriginalMember(
      owner = "client!iu",
      name = "jg",
      descriptor = "I"
   )
   public static int field7491;
   @OriginalMember(
      owner = "client!iu",
      name = "eg",
      descriptor = "I"
   )
   public static int field7492;
   @OriginalMember(
      owner = "client!iu",
      name = "nd",
      descriptor = "I"
   )
   public static int field7493;
   @OriginalMember(
      owner = "client!iu",
      name = "Tf",
      descriptor = "I"
   )
   public static int field7494;
   @OriginalMember(
      owner = "client!iu",
      name = "ug",
      descriptor = "I"
   )
   public static int field7495;
   @OriginalMember(
      owner = "client!iu",
      name = "jd",
      descriptor = "I"
   )
   public static int field7496;
   @OriginalMember(
      owner = "client!iu",
      name = "eh",
      descriptor = "I"
   )
   public static int field7497;
   @OriginalMember(
      owner = "client!iu",
      name = "nh",
      descriptor = "I"
   )
   public static int field7498;
   @OriginalMember(
      owner = "client!iu",
      name = "Sc",
      descriptor = "I"
   )
   public static int field7499;
   @OriginalMember(
      owner = "client!iu",
      name = "Pd",
      descriptor = "I"
   )
   public static int field7500;
   @OriginalMember(
      owner = "client!iu",
      name = "sc",
      descriptor = "I"
   )
   public static int field7501;
   @OriginalMember(
      owner = "client!iu",
      name = "z",
      descriptor = "I"
   )
   public static int field7502;
   @OriginalMember(
      owner = "client!iu",
      name = "vb",
      descriptor = "I"
   )
   public static int field7503;
   @OriginalMember(
      owner = "client!iu",
      name = "Cc",
      descriptor = "I"
   )
   public static int field7504;
   @OriginalMember(
      owner = "client!iu",
      name = "je",
      descriptor = "I"
   )
   public static int field7505;
   @OriginalMember(
      owner = "client!iu",
      name = "Lb",
      descriptor = "I"
   )
   public static int field7506;
   @OriginalMember(
      owner = "client!iu",
      name = "lg",
      descriptor = "I"
   )
   public static int field7507;
   @OriginalMember(
      owner = "client!iu",
      name = "Rd",
      descriptor = "I"
   )
   public static int field7508;
   @OriginalMember(
      owner = "client!iu",
      name = "pg",
      descriptor = "I"
   )
   public static int field7509;
   @OriginalMember(
      owner = "client!iu",
      name = "Oe",
      descriptor = "I"
   )
   public static int field7510;
   @OriginalMember(
      owner = "client!iu",
      name = "Yb",
      descriptor = "I"
   )
   public static int field7511;
   @OriginalMember(
      owner = "client!iu",
      name = "Cb",
      descriptor = "I"
   )
   public static int field7512;
   @OriginalMember(
      owner = "client!iu",
      name = "Af",
      descriptor = "I"
   )
   public static int field7513;
   @OriginalMember(
      owner = "client!iu",
      name = "qe",
      descriptor = "I"
   )
   public static int field7514;
   @OriginalMember(
      owner = "client!iu",
      name = "df",
      descriptor = "I"
   )
   public static int field7515;
   @OriginalMember(
      owner = "client!iu",
      name = "mf",
      descriptor = "I"
   )
   public static int field7516;
   @OriginalMember(
      owner = "client!iu",
      name = "ch",
      descriptor = "I"
   )
   public static int field7517;
   @OriginalMember(
      owner = "client!iu",
      name = "Nf",
      descriptor = "I"
   )
   public static int field7518;
   @OriginalMember(
      owner = "client!iu",
      name = "ah",
      descriptor = "I"
   )
   public static int field7519;
   @OriginalMember(
      owner = "client!iu",
      name = "Ob",
      descriptor = "I"
   )
   public static int field7520;
   @OriginalMember(
      owner = "client!iu",
      name = "C",
      descriptor = "I"
   )
   public static int field7521;
   @OriginalMember(
      owner = "client!iu",
      name = "K",
      descriptor = "I"
   )
   public static int field7522;
   @OriginalMember(
      owner = "client!iu",
      name = "qh",
      descriptor = "I"
   )
   public static int field7523;
   @OriginalMember(
      owner = "client!iu",
      name = "af",
      descriptor = "I"
   )
   public static int field7524;
   @OriginalMember(
      owner = "client!iu",
      name = "oc",
      descriptor = "I"
   )
   public static int field7525;
   @OriginalMember(
      owner = "client!iu",
      name = "cc",
      descriptor = "I"
   )
   public static int field7526;
   @OriginalMember(
      owner = "client!iu",
      name = "nf",
      descriptor = "I"
   )
   public static int field7527;
   @OriginalMember(
      owner = "client!iu",
      name = "uf",
      descriptor = "I"
   )
   public static int field7528;
   @OriginalMember(
      owner = "client!iu",
      name = "N",
      descriptor = "I"
   )
   public static int field7529;
   @OriginalMember(
      owner = "client!iu",
      name = "gb",
      descriptor = "I"
   )
   public static int field7530;
   @OriginalMember(
      owner = "client!iu",
      name = "Qg",
      descriptor = "I"
   )
   public static int field7531;
   @OriginalMember(
      owner = "client!iu",
      name = "lf",
      descriptor = "I"
   )
   public static int field7532;
   @OriginalMember(
      owner = "client!iu",
      name = "rb",
      descriptor = "I"
   )
   public static int field7534;
   @OriginalMember(
      owner = "client!iu",
      name = "ce",
      descriptor = "I"
   )
   public static int field7535;
   @OriginalMember(
      owner = "client!iu",
      name = "fg",
      descriptor = "I"
   )
   public static int field7536;
   @OriginalMember(
      owner = "client!iu",
      name = "M",
      descriptor = "I"
   )
   public static int field7537;
   @OriginalMember(
      owner = "client!iu",
      name = "cg",
      descriptor = "I"
   )
   public static int field7538;
   @OriginalMember(
      owner = "client!iu",
      name = "Yc",
      descriptor = "I"
   )
   public static int field7539;
   @OriginalMember(
      owner = "client!iu",
      name = "ib",
      descriptor = "I"
   )
   public static int field7540;
   @OriginalMember(
      owner = "client!iu",
      name = "qc",
      descriptor = "I"
   )
   public static int field7541;
   @OriginalMember(
      owner = "client!iu",
      name = "Kb",
      descriptor = "I"
   )
   public static int field7542;
   @OriginalMember(
      owner = "client!iu",
      name = "Ef",
      descriptor = "I"
   )
   public static int field7544;
   @OriginalMember(
      owner = "client!iu",
      name = "oh",
      descriptor = "I"
   )
   public static int field7545;
   @OriginalMember(
      owner = "client!iu",
      name = "Mc",
      descriptor = "I"
   )
   private int field7546;
   @OriginalMember(
      owner = "client!iu",
      name = "hc",
      descriptor = "I"
   )
   public static int field7548;
   @OriginalMember(
      owner = "client!iu",
      name = "pb",
      descriptor = "I"
   )
   public static int field7549;
   @OriginalMember(
      owner = "client!iu",
      name = "dg",
      descriptor = "I"
   )
   public static int field7550;
   @OriginalMember(
      owner = "client!iu",
      name = "Ge",
      descriptor = "I"
   )
   public static int field7551;
   @OriginalMember(
      owner = "client!iu",
      name = "Oc",
      descriptor = "I"
   )
   public static int field7552;
   @OriginalMember(
      owner = "client!iu",
      name = "hb",
      descriptor = "I"
   )
   public static int field7553;
   @OriginalMember(
      owner = "client!iu",
      name = "E",
      descriptor = "I"
   )
   public static int field7554;
   @OriginalMember(
      owner = "client!iu",
      name = "ef",
      descriptor = "I"
   )
   public static int field7555;
   @OriginalMember(
      owner = "client!iu",
      name = "Dd",
      descriptor = "I"
   )
   public static int field7556;
   @OriginalMember(
      owner = "client!iu",
      name = "Nd",
      descriptor = "I"
   )
   public static int field7557;
   @OriginalMember(
      owner = "client!iu",
      name = "v",
      descriptor = "I"
   )
   public static int field7558;
   @OriginalMember(
      owner = "client!iu",
      name = "ub",
      descriptor = "I"
   )
   public static int field7559;
   @OriginalMember(
      owner = "client!iu",
      name = "Id",
      descriptor = "I"
   )
   public static int field7560;
   @OriginalMember(
      owner = "client!iu",
      name = "S",
      descriptor = "I"
   )
   public static int field7561;
   @OriginalMember(
      owner = "client!iu",
      name = "Yg",
      descriptor = "I"
   )
   public static int field7562;
   @OriginalMember(
      owner = "client!iu",
      name = "Bf",
      descriptor = "I"
   )
   public static int field7563;
   @OriginalMember(
      owner = "client!iu",
      name = "Zg",
      descriptor = "I"
   )
   public static int field7564;
   @OriginalMember(
      owner = "client!iu",
      name = "jf",
      descriptor = "I"
   )
   public static int field7565;
   @OriginalMember(
      owner = "client!iu",
      name = "be",
      descriptor = "I"
   )
   public static int field7566;
   @OriginalMember(
      owner = "client!iu",
      name = "xd",
      descriptor = "I"
   )
   public static int field7567;
   @OriginalMember(
      owner = "client!iu",
      name = "Ad",
      descriptor = "I"
   )
   public static int field7568;
   @OriginalMember(
      owner = "client!iu",
      name = "Ze",
      descriptor = "I"
   )
   public static int field7569;
   @OriginalMember(
      owner = "client!iu",
      name = "u",
      descriptor = "I"
   )
   public static int field7570;
   @OriginalMember(
      owner = "client!iu",
      name = "Se",
      descriptor = "I"
   )
   public static int field7571;
   @OriginalMember(
      owner = "client!iu",
      name = "xh",
      descriptor = "I"
   )
   public static int field7572;
   @OriginalMember(
      owner = "client!iu",
      name = "wg",
      descriptor = "I"
   )
   public static int field7573;
   @OriginalMember(
      owner = "client!iu",
      name = "yg",
      descriptor = "I"
   )
   public static int field7574;
   @OriginalMember(
      owner = "client!iu",
      name = "xf",
      descriptor = "I"
   )
   public static int field7575;
   @OriginalMember(
      owner = "client!iu",
      name = "De",
      descriptor = "I"
   )
   public static int field7576;
   @OriginalMember(
      owner = "client!iu",
      name = "lh",
      descriptor = "I"
   )
   public static int field7577;
   @OriginalMember(
      owner = "client!iu",
      name = "kg",
      descriptor = "I"
   )
   public static int field7578;
   @OriginalMember(
      owner = "client!iu",
      name = "rg",
      descriptor = "I"
   )
   public static int field7579;
   @OriginalMember(
      owner = "client!iu",
      name = "Vg",
      descriptor = "I"
   )
   public static int field7580;
   @OriginalMember(
      owner = "client!iu",
      name = "We",
      descriptor = "I"
   )
   public static int field7581;
   @OriginalMember(
      owner = "client!iu",
      name = "Gc",
      descriptor = "I"
   )
   public static int field7582;
   @OriginalMember(
      owner = "client!iu",
      name = "Qe",
      descriptor = "I"
   )
   public static int field7583;
   @OriginalMember(
      owner = "client!iu",
      name = "ed",
      descriptor = "I"
   )
   public static int field7584;
   @OriginalMember(
      owner = "client!iu",
      name = "mg",
      descriptor = "I"
   )
   public static int field7585;
   @OriginalMember(
      owner = "client!iu",
      name = "Ec",
      descriptor = "I"
   )
   public static int field7586;
   @OriginalMember(
      owner = "client!iu",
      name = "ic",
      descriptor = "I"
   )
   public static int field7587;
   @OriginalMember(
      owner = "client!iu",
      name = "cb",
      descriptor = "I"
   )
   public static int field7588;
   @OriginalMember(
      owner = "client!iu",
      name = "mb",
      descriptor = "I"
   )
   public static int field7589;
   @OriginalMember(
      owner = "client!iu",
      name = "vg",
      descriptor = "I"
   )
   public static int field7590;
   @OriginalMember(
      owner = "client!iu",
      name = "Ud",
      descriptor = "I"
   )
   public static int field7591;
   @OriginalMember(
      owner = "client!iu",
      name = "gg",
      descriptor = "I"
   )
   private int field7592;
   @OriginalMember(
      owner = "client!iu",
      name = "ec",
      descriptor = "I"
   )
   public static int field7593;
   @OriginalMember(
      owner = "client!iu",
      name = "sb",
      descriptor = "I"
   )
   public static int field7594;
   @OriginalMember(
      owner = "client!iu",
      name = "tf",
      descriptor = "I"
   )
   public static int field7595;
   @OriginalMember(
      owner = "client!iu",
      name = "bh",
      descriptor = "I"
   )
   public static int field7596;
   @OriginalMember(
      owner = "client!iu",
      name = "Og",
      descriptor = "I"
   )
   public static int field7597;
   @OriginalMember(
      owner = "client!iu",
      name = "Le",
      descriptor = "I"
   )
   public static int field7598;
   @OriginalMember(
      owner = "client!iu",
      name = "Vb",
      descriptor = "I"
   )
   public static int field7600;
   @OriginalMember(
      owner = "client!iu",
      name = "lb",
      descriptor = "I"
   )
   public static int field7601;
   @OriginalMember(
      owner = "client!iu",
      name = "Vd",
      descriptor = "I"
   )
   public static int field7602;
   @OriginalMember(
      owner = "client!iu",
      name = "Cd",
      descriptor = "I"
   )
   public static int field7603;
   @OriginalMember(
      owner = "client!iu",
      name = "Mg",
      descriptor = "I"
   )
   public static int field7604;
   @OriginalMember(
      owner = "client!iu",
      name = "mc",
      descriptor = "I"
   )
   public static int field7605;
   @OriginalMember(
      owner = "client!iu",
      name = "jb",
      descriptor = "I"
   )
   public static int field7606;
   @OriginalMember(
      owner = "client!iu",
      name = "yd",
      descriptor = "I"
   )
   public static int field7607;
   @OriginalMember(
      owner = "client!iu",
      name = "fc",
      descriptor = "I"
   )
   public static int field7608;
   @OriginalMember(
      owner = "client!iu",
      name = "kf",
      descriptor = "I"
   )
   public static int field7609;
   @OriginalMember(
      owner = "client!iu",
      name = "Nb",
      descriptor = "I"
   )
   public static int field7610;
   @OriginalMember(
      owner = "client!iu",
      name = "Hd",
      descriptor = "I"
   )
   public static int field7611;
   @OriginalMember(
      owner = "client!iu",
      name = "yb",
      descriptor = "I"
   )
   public static int field7612;
   @OriginalMember(
      owner = "client!iu",
      name = "ae",
      descriptor = "I"
   )
   public static int field7613;
   @OriginalMember(
      owner = "client!iu",
      name = "zf",
      descriptor = "I"
   )
   public static int field7614;
   @OriginalMember(
      owner = "client!iu",
      name = "nb",
      descriptor = "I"
   )
   public int field7615;
   @OriginalMember(
      owner = "client!iu",
      name = "th",
      descriptor = "I"
   )
   public static int field7616;
   @OriginalMember(
      owner = "client!iu",
      name = "he",
      descriptor = "I"
   )
   public static int field7617;
   @OriginalMember(
      owner = "client!iu",
      name = "ud",
      descriptor = "I"
   )
   public static int field7618;
   @OriginalMember(
      owner = "client!iu",
      name = "Ed",
      descriptor = "I"
   )
   public static int field7619;
   @OriginalMember(
      owner = "client!iu",
      name = "Rf",
      descriptor = "I"
   )
   public static int field7620;
   @OriginalMember(
      owner = "client!iu",
      name = "tb",
      descriptor = "I"
   )
   public static int field7621;
   @OriginalMember(
      owner = "client!iu",
      name = "y",
      descriptor = "I"
   )
   public static int field7622;
   @OriginalMember(
      owner = "client!iu",
      name = "rd",
      descriptor = "I"
   )
   public static int field7623;
   @OriginalMember(
      owner = "client!iu",
      name = "sh",
      descriptor = "I"
   )
   public static int field7624;
   @OriginalMember(
      owner = "client!iu",
      name = "Ac",
      descriptor = "I"
   )
   public static int field7625;
   @OriginalMember(
      owner = "client!iu",
      name = "id",
      descriptor = "I"
   )
   public static int field7626;
   @OriginalMember(
      owner = "client!iu",
      name = "hh",
      descriptor = "I"
   )
   public static int field7627;
   @OriginalMember(
      owner = "client!iu",
      name = "ye",
      descriptor = "I"
   )
   public static int field7630;
   @OriginalMember(
      owner = "client!iu",
      name = "Xb",
      descriptor = "I"
   )
   public static int field7632;
   @OriginalMember(
      owner = "client!iu",
      name = "Gb",
      descriptor = "I"
   )
   public static int field7635;
   @OriginalMember(
      owner = "client!iu",
      name = "ne",
      descriptor = "I"
   )
   public int field7640;
   @OriginalMember(
      owner = "client!iu",
      name = "I",
      descriptor = "I"
   )
   private int field7657;
   @OriginalMember(
      owner = "client!iu",
      name = "ze",
      descriptor = "I"
   )
   public int field7658;
   @OriginalMember(
      owner = "client!iu",
      name = "H",
      descriptor = "I"
   )
   public int field7660;
   @OriginalMember(
      owner = "client!iu",
      name = "Lc",
      descriptor = "I"
   )
   private int field7669;
   @OriginalMember(
      owner = "client!iu",
      name = "R",
      descriptor = "I"
   )
   private int field7674;
   @OriginalMember(
      owner = "client!iu",
      name = "Sf",
      descriptor = "I"
   )
   private int field7675;
   @OriginalMember(
      owner = "client!iu",
      name = "mh",
      descriptor = "I"
   )
   private int field7692;
   @OriginalMember(
      owner = "client!iu",
      name = "F",
      descriptor = "I"
   )
   private int field7693;
   @OriginalMember(
      owner = "client!iu",
      name = "gh",
      descriptor = "I"
   )
   public int field7717;
   @OriginalMember(
      owner = "client!iu",
      name = "od",
      descriptor = "I"
   )
   private int field7743;
   @OriginalMember(
      owner = "client!iu",
      name = "Md",
      descriptor = "I"
   )
   private int field7746;
   @OriginalMember(
      owner = "client!iu",
      name = "vh",
      descriptor = "I"
   )
   private int field7751;
   @OriginalMember(
      owner = "client!iu",
      name = "Tg",
      descriptor = "I"
   )
   private int field7752;
   @OriginalMember(
      owner = "client!iu",
      name = "Dg",
      descriptor = "I"
   )
   private int field7753;
   @OriginalMember(
      owner = "client!iu",
      name = "Xc",
      descriptor = "I"
   )
   public int field7757;
   @OriginalMember(
      owner = "client!iu",
      name = "X",
      descriptor = "I"
   )
   public int field7773;
   @OriginalMember(
      owner = "client!iu",
      name = "xe",
      descriptor = "I"
   )
   public int field7776;
   @OriginalMember(
      owner = "client!iu",
      name = "td",
      descriptor = "I"
   )
   private int field7782;
   @OriginalMember(
      owner = "client!iu",
      name = "Bg",
      descriptor = "I"
   )
   private int field7792;
   @OriginalMember(
      owner = "client!iu",
      name = "Uc",
      descriptor = "I"
   )
   private int field7794;
   @OriginalMember(
      owner = "client!iu",
      name = "Uf",
      descriptor = "J"
   )
   private long field7668;
   @OriginalMember(
      owner = "client!iu",
      name = "Xe",
      descriptor = "Lik;"
   )
   private class124 field7714;
   @OriginalMember(
      owner = "client!iu",
      name = "kh",
      descriptor = "Lwe;"
   )
   private class133 field7723;
   @OriginalMember(
      owner = "client!iu",
      name = "Rg",
      descriptor = "Lpl;"
   )
   private class241 field7653;
   @OriginalMember(
      owner = "client!iu",
      name = "Eg",
      descriptor = "Lpl;"
   )
   private class241 field7654;
   @OriginalMember(
      owner = "client!iu",
      name = "Kd",
      descriptor = "Lkk;"
   )
   public class266 field7784;
   @OriginalMember(
      owner = "client!iu",
      name = "sf",
      descriptor = "Lhw;"
   )
   private class302 field7652;
   @OriginalMember(
      owner = "client!iu",
      name = "zc",
      descriptor = "Laj;"
   )
   public class452 field7678;
   @OriginalMember(
      owner = "client!iu",
      name = "xb",
      descriptor = "Laj;"
   )
   public class452 field7680;
   @OriginalMember(
      owner = "client!iu",
      name = "Cf",
      descriptor = "Laj;"
   )
   public class452 field7681;
   @OriginalMember(
      owner = "client!iu",
      name = "Ug",
      descriptor = "Laj;"
   )
   public class452 field7707;
   @OriginalMember(
      owner = "client!iu",
      name = "ph",
      descriptor = "Laj;"
   )
   public class452 field7720;
   @OriginalMember(
      owner = "client!iu",
      name = "Lf",
      descriptor = "Laj;"
   )
   public class452 field7756;
   @OriginalMember(
      owner = "client!iu",
      name = "pf",
      descriptor = "Laj;"
   )
   public class452 field7764;
   @OriginalMember(
      owner = "client!iu",
      name = "bd",
      descriptor = "Laj;"
   )
   public class452 field7771;
   @OriginalMember(
      owner = "client!iu",
      name = "ig",
      descriptor = "Laj;"
   )
   public class452 field7772;
   @OriginalMember(
      owner = "client!iu",
      name = "Jf",
      descriptor = "Laj;"
   )
   public class452 field7786;
   @OriginalMember(
      owner = "client!iu",
      name = "re",
      descriptor = "Lrga;"
   )
   public class71 field7727;
   @OriginalMember(
      owner = "client!iu",
      name = "Fe",
      descriptor = "Lrga;"
   )
   public class71 field7729;
   @OriginalMember(
      owner = "client!iu",
      name = "vc",
      descriptor = "Lrs;"
   )
   private class734 field7647;
   @OriginalMember(
      owner = "client!iu",
      name = "og",
      descriptor = "Lrs;"
   )
   public class734 field7701;
   @OriginalMember(
      owner = "client!iu",
      name = "pc",
      descriptor = "Lsn;"
   )
   private class743 field7765;
   @OriginalMember(
      owner = "client!iu",
      name = "wf",
      descriptor = "Llp;"
   )
   private class83 field7721;
   @OriginalMember(
      owner = "client!iu",
      name = "zg",
      descriptor = "Llp;"
   )
   private class83 field7769;
   @OriginalMember(
      owner = "client!iu",
      name = "Pg",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   public NativeHeap field7646;
   @OriginalMember(
      owner = "client!iu",
      name = "ld",
      descriptor = "Z"
   )
   private boolean field7667;
   @OriginalMember(
      owner = "client!iu",
      name = "lc",
      descriptor = "Z"
   )
   private boolean field7670;
   @OriginalMember(
      owner = "client!iu",
      name = "Hf",
      descriptor = "Z"
   )
   private boolean field7671;
   @OriginalMember(
      owner = "client!iu",
      name = "Je",
      descriptor = "Z"
   )
   private boolean field7673;
   @OriginalMember(
      owner = "client!iu",
      name = "Eb",
      descriptor = "Z"
   )
   private boolean field7679;
   @OriginalMember(
      owner = "client!iu",
      name = "hf",
      descriptor = "Z"
   )
   public boolean field7687;
   @OriginalMember(
      owner = "client!iu",
      name = "zd",
      descriptor = "Z"
   )
   public boolean field7688;
   @OriginalMember(
      owner = "client!iu",
      name = "Wc",
      descriptor = "Z"
   )
   public boolean field7697;
   @OriginalMember(
      owner = "client!iu",
      name = "te",
      descriptor = "Z"
   )
   public boolean field7711;
   @OriginalMember(
      owner = "client!iu",
      name = "bf",
      descriptor = "Z"
   )
   private boolean field7716;
   @OriginalMember(
      owner = "client!iu",
      name = "gd",
      descriptor = "Z"
   )
   private boolean field7724;
   @OriginalMember(
      owner = "client!iu",
      name = "Db",
      descriptor = "Z"
   )
   public boolean field7730;
   @OriginalMember(
      owner = "client!iu",
      name = "cd",
      descriptor = "Z"
   )
   private boolean field7736;
   @OriginalMember(
      owner = "client!iu",
      name = "ue",
      descriptor = "Z"
   )
   public boolean field7739;
   @OriginalMember(
      owner = "client!iu",
      name = "md",
      descriptor = "Z"
   )
   public boolean field7740;
   @OriginalMember(
      owner = "client!iu",
      name = "de",
      descriptor = "Z"
   )
   private boolean field7747;
   @OriginalMember(
      owner = "client!iu",
      name = "Ib",
      descriptor = "Z"
   )
   public boolean field7759;
   @OriginalMember(
      owner = "client!iu",
      name = "Ic",
      descriptor = "Z"
   )
   public boolean field7760;
   @OriginalMember(
      owner = "client!iu",
      name = "bb",
      descriptor = "Z"
   )
   private boolean field7762;
   @OriginalMember(
      owner = "client!iu",
      name = "Tb",
      descriptor = "Z"
   )
   private boolean field7774;
   @OriginalMember(
      owner = "client!iu",
      name = "dd",
      descriptor = "[Lll;"
   )
   private class549[] field7683;

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(Lpl;B)V"
   )
   public final void method3955(class241 arg0, byte arg1) {
      try {
         if (arg1 != -52) {
            this.field7787 = 124;
         }

         ++field7504;
         if (this.field7730) {
            this.method4035(arg0, 14231);
            this.method4017(-119, arg0);
         } else if (~this.field7650 <= -4) {
            throw new RuntimeException();
         } else {
            if (this.field7650 >= 0) {
               this.field7651[this.field7650].method1917(126);
            }

            this.field7654 = this.field7653 = this.field7651[++this.field7650] = arg0;
            this.field7654.method1915(28366);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[115] + (arg0 != null ? field7795[4] : field7795[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "b",
      descriptor = "(IIZ)V"
   )
   public final void method3956(int arg0, int arg1, boolean arg2) {
      try {
         if (arg1 == 0) {
            this.method4007((byte)-127, true, arg2, arg0);
            ++field7553;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7795[53] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "b",
      descriptor = "(ZI)V"
   )
   public final void method3957(boolean arg0, int arg1) {
      try {
         ++field7598;
         if (arg1 >= 97) {
            if (this.field7774 != arg0) {
               this.field7774 = arg0;
               this.method4013(2912);
               this.field7669 &= -32;
            }
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[228] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "d",
      descriptor = "(II)Lsq;"
   )
   public final class220 method409(int arg0, int arg1) {
      try {
         ++field7600;
         return null;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[145] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "g",
      descriptor = "(B)V"
   )
   private final void method3958(byte arg0) {
      try {
         this.field7683 = new class549[this.field7717];
         ++field7518;
         this.field7784 = new class266(this, 3553, 6408, 1, 1);
         new class266(this, 3553, 6408, 1, 1);
         new class266(this, 3553, 6408, 1, 1);
         this.field7772 = new class452(this);
         if (arg0 > -59) {
            this.field7547 = -18L;
         }

         this.field7681 = new class452(this);
         this.field7756 = new class452(this);
         this.field7680 = new class452(this);
         this.field7720 = new class452(this);
         this.field7771 = new class452(this);
         this.field7678 = new class452(this);
         this.field7707 = new class452(this);
         this.field7786 = new class452(this);
         this.field7764 = new class452(this);
         if (this.field7780) {
            this.field7701 = new class734(this);
            new class734(this);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(Lnh;I)V"
   )
   public final void method517(class554 arg0, int arg1) {
      try {
         this.field7628.method2445(this, arg1, 107, arg0);
         ++field7584;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[152] + (arg0 != null ? field7795[4] : field7795[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "T",
      descriptor = "(IIII)V"
   )
   public final void method412(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (~this.field7788 > ~arg1) {
            this.field7788 = arg1;
         }

         if (~arg3 > ~this.field7775) {
            this.field7775 = arg3;
         }

         if (this.field7768 < arg0) {
            this.field7768 = arg0;
         }

         ++field7434;
         if (~arg2 > ~this.field7705) {
            this.field7705 = arg2;
         }

         OpenGL.glEnable(3089);
         this.method4037(5889);
         this.method3970(104);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7795[148] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(I[Lue;)V"
   )
   public final void method485(int arg0, class243[] arg1) {
      boolean var3 = client.field1481;

      try {
         int var4 = 0;
         if (var3) {
            this.field7748[var4] = arg1[var4];
            ++var4;
         }

         while(true) {
            class530 var10000;
            if (~arg0 >= ~var4) {
               ++field7429;
               this.field7743 = arg0;
               var10000 = this;
               if (!var3) {
                  if (this.field7692 != 1) {
                     this.method4034(true);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = this;
            }

            var10000.field7748[var4] = arg1[var4];
            ++var4;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7795[41] + arg0 + ',' + (arg1 != null ? field7795[4] : field7795[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "U",
      descriptor = "(IIIII)V"
   )
   public final void method474(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field7449;
         this.method3971((byte)93);
         this.method4012(arg4, -23);
         float var6 = (float)arg0 + 0.35F;
         float var7 = (float)arg1 + 0.35F;
         OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
         OpenGL.glBegin(1);
         OpenGL.glVertex2f(var6, var7);
         OpenGL.glVertex2f((float)arg2 + var6, var7);
         OpenGL.glEnd();
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field7795[54] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "b",
      descriptor = "(IIII)V"
   )
   public final void method3959(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field7472;
         OpenGL.glTexEnvi(8960, arg3 + 34176, arg2);
         if (arg0 < -51) {
            OpenGL.glTexEnvi(8960, arg3 + 34192, arg1);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7795[71] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "k",
      descriptor = "(B)V"
   )
   public final void method3960(byte arg0) {
      try {
         if (arg0 != 58) {
            this.field7661 = null;
         }

         ++field7540;
         OpenGL.glPushMatrix();
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[155] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method411(Canvas arg0, int arg1, int arg2) {
      try {
         ++field7611;
         if (this.field7533 == arg0) {
            throw new RuntimeException();
         } else if (!this.field7468.containsKey(arg0)) {
            if (!arg0.isShowing()) {
               throw new RuntimeException();
            } else {
               try {
                  Class var4 = Class.forName(field7795[162]);
                  Method var5 = var4.getMethod(field7795[161], Boolean.TYPE);
                  var5.invoke(arg0, Boolean.TRUE);
               } catch (Exception var9) {
               }

               long var6 = this.field7599.prepareSurface(arg0);
               if (~var6 == 0L) {
                  throw new RuntimeException();
               } else {
                  this.field7468.put(arg0, new Long(var6));
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field7795[160] + (arg0 != null ? field7795[4] : field7795[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "n",
      descriptor = "()Z"
   )
   public final boolean method461() {
      try {
         ++field7570;
         return this.field7633 != null && (~this.field7636 >= -2 || this.field7762);
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7795[212] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "Q",
      descriptor = "(IIIIII[BII)V"
   )
   public final void method404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
      try {
         float var10;
         float var11;
         label36: {
            ++field7496;
            if (this.field7714 == null || ~arg2 < ~this.field7714.field3363 || ~this.field7714.field3367 > ~arg3) {
               this.field7714 = class598.method4449(arg3, 6406, false, this, 3553, 6406, arg2, arg6);
               this.field7714.method2121(0, false, false);
               var10 = this.field7714.field1623;
               var11 = this.field7714.field1621;
               if (!client.field1481) {
                  break label36;
               }
            }

            this.field7714.method2124(0, 3314, false, 0, 0, 6406, arg3, arg2, arg6, 0);
            var11 = (float)arg3 * this.field7714.field1621 / (float)this.field7714.field3367;
            var10 = (float)arg2 * this.field7714.field1623 / (float)this.field7714.field3363;
         }

         this.method4008(-2);
         this.method4006(this.field7714, (byte)-128);
         this.method4012(arg8, 100);
         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         this.method4011(arg5, 2);
         this.method4022(34165, 34161, 34165);
         this.method3959(-76, 768, 34166, 0);
         this.method3959(-127, 770, 5890, 2);
         this.method3969(0, 34166, (byte)-114, 770);
         this.method3969(2, 5890, (byte)-124, 770);
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
         this.method3959(-109, 768, 5890, 0);
         this.method3959(-112, 770, 34166, 2);
         this.method3969(0, 5890, (byte)-117, 770);
         this.method3969(2, 34166, (byte)-117, 770);
      } catch (RuntimeException var17) {
         throw class93.method866(var17, field7795[131] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field7795[4] : field7795[2]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "b",
      descriptor = "(ILpl;)V"
   )
   public final void method3961(int arg0, class241 arg1) {
      try {
         ++field7439;
         if (this.field7648 >= 0 && this.field7656[this.field7648] == arg1) {
            this.field7656[this.field7648--] = null;
            if (arg0 != -9) {
               this.method3984((byte)116);
            }

            arg1.method1918((byte)-76);
            if (~this.field7648 > -1) {
               this.field7653 = null;
            } else {
               this.field7653 = this.field7656[this.field7648];
               this.field7653.method1916(-19117);
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[144] + arg0 + ',' + (arg1 != null ? field7795[4] : field7795[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(ILwe;BII)V"
   )
   public final void method3962(int arg0, class133 arg1, byte arg2, int arg3, int arg4) {
      try {
         if (arg2 <= 49) {
            this.field7775 = -60;
         }

         ++field7509;
         int var6 = arg1.method1119(-67);
         int var9 = arg3 * this.method4027(var6, (byte)-58);
         this.method3997(arg1, 8);
         OpenGL.glDrawElements(arg4, arg0, var6, arg1.method1121(-26023) - -((long)var9));
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field7795[38] + arg0 + ',' + (arg1 != null ? field7795[4] : field7795[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "H",
      descriptor = "(III[I)V"
   )
   public final void method452(int arg0, int arg1, int arg2, int[] arg3) {
      try {
         ++field7580;
         float var5 = (float)arg2 * this.field7672.field2351 + (float)arg0 * this.field7672.field2339 + (float)arg1 * this.field7672.field2356 + this.field7672.field2357;
         if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
         } else {
            int var6 = (int)(((float)arg2 * this.field7672.field2332 + (float)arg0 * this.field7672.field2349 + (float)arg1 * this.field7672.field2342 + this.field7672.field2348) * (float)this.field7726 / var5);
            arg3[0] = (int)((float)var6 - this.field7758);
            int var7 = (int)(((float)arg2 * this.field7672.field2353 + (float)arg0 * this.field7672.field2352 + (float)arg1 * this.field7672.field2331 + this.field7672.field2363) * (float)this.field7689 / var5);
            arg3[2] = (int)var5;
            arg3[1] = (int)((float)var7 + -this.field7750);
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field7795[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7795[4] : field7795[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public final void method446(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         float var7;
         float var8;
         label18: {
            this.method3971((byte)93);
            ++field7602;
            this.method4012(arg5, -128);
            var7 = (float)arg2 - (float)arg0;
            var8 = (float)(-arg1) + (float)arg3;
            if (var7 == 0.0F && var8 == 0.0F) {
               var7 = 1.0F;
               if (!client.field1481) {
                  break label18;
               }
            }

            float var9 = (float)(1.0D / Math.sqrt((double)(var7 * var7 + var8 * var8)));
            var8 *= var9;
            var7 *= var9;
         }

         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         OpenGL.glBegin(1);
         OpenGL.glVertex2f((float)arg0 + 0.35F, (float)arg1 + 0.35F);
         OpenGL.glVertex2f((float)arg2 + var7 + 0.35F, (float)arg3 + var8 + 0.35F);
         OpenGL.glEnd();
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field7795[78] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "r",
      descriptor = "(I)V"
   )
   private final void method3963(int arg0) {
      try {
         this.field7599.method227();
         ++field7465;
         if (arg0 != 8448) {
            this.method410(98, -2);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[30] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(Loga;Lsq;)Lkr;"
   )
   public final class122 method445(class179 arg0, class220 arg1) {
      try {
         ++field7609;
         return null;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[66] + (arg0 != null ? field7795[4] : field7795[2]) + ',' + (arg1 != null ? field7795[4] : field7795[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "w",
      descriptor = "()V"
   )
   public final void method401() {
      boolean var1 = client.field1481;

      try {
         ++field7491;
         class673 var2 = this.field7643.method288(0);
         if (var1) {
            ((class353)var2).method2806(-19347);
            var2 = this.field7643.method290(17958);
         }

         while(true) {
            while(var2 != null) {
               ((class353)var2).method2806(-19347);
               var2 = this.field7643.method290(17958);
            }

            if (!var1) {
               if (this.field7634 != null) {
                  this.field7634.method5215(true);
               }

               if (this.field7599 != null) {
                  Object var10000;
                  label47: {
                     this.method3963(8448);
                     Enumeration var3 = this.field7468.keys();
                     if (var1) {
                        var10000 = var3.nextElement();
                     } else if (!var3.hasMoreElements()) {
                        this.field7599.release();
                        var10000 = this;
                        if (!var1) {
                           break label47;
                        }
                     } else {
                        var10000 = var3.nextElement();
                     }

                     while(true) {
                        Canvas var4 = (Canvas)var10000;
                        Long var5 = (Long)this.field7468.get(var4);
                        this.field7599.releaseSurface(var4, var5);
                        if (!var3.hasMoreElements()) {
                           this.field7599.release();
                           var10000 = this;
                           if (!var1) {
                              break;
                           }
                        } else {
                           var10000 = var3.nextElement();
                        }
                     }
                  }

                  ((class530)var10000).field7599 = null;
               }

               if (this.field7644) {
                  class201.method1661(20251, false, true);
                  this.field7644 = false;
                  return;
               }

               return;
            }

            var2 = this.field7643.method290(17958);
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field7795[195] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "x",
      descriptor = "()Z"
   )
   public final boolean method488() {
      try {
         ++field7558;
         return false;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7795[170] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "c",
      descriptor = "(IIIIII)V"
   )
   public final void method462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field7604;
         float var7 = (float)arg0 + 0.35F;
         float var8 = (float)arg1 + 0.35F;
         float var9 = (float)arg2 + var7 - 1.0F;
         this.method3971((byte)93);
         float var10 = (float)arg3 + var8 + -1.0F;
         this.method4012(arg5, -127);
         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         if (this.field7724) {
            OpenGL.glDisable(32925);
         }

         OpenGL.glBegin(2);
         OpenGL.glVertex2f(var7, var8);
         OpenGL.glVertex2f(var7, var10);
         OpenGL.glVertex2f(var9, var10);
         OpenGL.glVertex2f(var9, var8);
         OpenGL.glEnd();
         if (this.field7724) {
            OpenGL.glEnable(32925);
         }
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field7795[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "GA",
      descriptor = "(I)V"
   )
   public final void method426(int arg0) {
      try {
         this.method4012(0, 28);
         ++field7566;
         OpenGL.glClearColor((float)(16711680 & arg0) / 1.671168E7F, (float)(65280 & arg0) / 65280.0F, (float)(255 & arg0) / 255.0F, (float)(arg0 >>> 24) / 255.0F);
         OpenGL.glClear(16384);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[167] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "b",
      descriptor = "(IIIIII)Lkc;"
   )
   public final class72 method423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field7467;
         return this.field7697 ? new class129(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field7795[44] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "l",
      descriptor = "()Z"
   )
   public final boolean method455() {
      try {
         ++field7549;
         return true;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7795[20] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "j",
      descriptor = "(I)V"
   )
   public final void method3964(int arg0) {
      try {
         ++field7452;
         OpenGL.glPopMatrix();
         if (arg0 != 304598704) {
            this.method4004(false);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[163] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "v",
      descriptor = "()Lkia;"
   )
   public final class93 method484() {
      try {
         ++field7499;
         return this.field7672;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7795[128] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "g",
      descriptor = "(I)V"
   )
   public final synchronized void method458(int arg0) {
      boolean var2 = client.field1481;

      try {
         ++field7552;
         int var15 = arg0 & Integer.MAX_VALUE;
         int var3 = 0;
         int var10000;
         if (var2 || !this.field7661.method285((byte)-127)) {
            do {
               class278 var4 = (class278)this.field7661.method281(true);
               class158.field2027[var3++] = (int)var4.field9965;
               this.field7658 -= var4.field3546;
               var10000 = ~var3;

               while(var10000 == -1001) {
                  OpenGL.glDeleteBuffersARB(var3, class158.field2027, 0);
                  var10000 = 0;
                  if (!var2) {
                     var3 = 0;
                     break;
                  }
               }
            } while(!this.field7661.method285((byte)-127));
         }

         class278 var5;
         class278 var6;
         class278 var7;
         boolean var8;
         class278 var9;
         class673 var10;
         class673 var11;
         class278 var12;
         byte var16;
         class530 var18;
         if (~var3 < -1) {
            OpenGL.glDeleteBuffersARB(var3, class158.field2027, 0);
            var3 = 0;
            if (var2) {
               var5 = (class278)this.field7662.method281(true);
               class158.field2027[var3++] = (int)var5.field9965;
               this.field7660 -= var5.field3546;
               var10000 = ~var3;
            } else {
               if (this.field7662.method285((byte)-121)) {
                  label687: {
                     if (~var3 < -1) {
                        OpenGL.glDeleteTextures(var3, class158.field2027, 0);
                        var3 = 0;
                        if (var2) {
                           var6 = (class278)this.field7663.method281(true);
                           class158.field2027[var3++] = var6.field3546;
                           var10000 = var3;
                        } else {
                           if (this.field7663.method285((byte)-121)) {
                              break label687;
                           }

                           var6 = (class278)this.field7663.method281(true);
                           class158.field2027[var3++] = var6.field3546;
                           var10000 = var3;
                        }
                     } else {
                        if (this.field7663.method285((byte)-121)) {
                           break label687;
                        }

                        var6 = (class278)this.field7663.method281(true);
                        class158.field2027[var3++] = var6.field3546;
                        var10000 = var3;
                     }

                     while(true) {
                        while(var10000 == 1000) {
                           OpenGL.glDeleteFramebuffersEXT(var3, class158.field2027, 0);
                           var10000 = 0;
                           if (!var2) {
                              var3 = 0;
                              break;
                           }
                        }

                        if (this.field7663.method285((byte)-121)) {
                           break;
                        }

                        var6 = (class278)this.field7663.method281(true);
                        class158.field2027[var3++] = var6.field3546;
                        var10000 = var3;
                     }
                  }

                  if (~var3 < -1) {
                     OpenGL.glDeleteFramebuffersEXT(var3, class158.field2027, 0);
                     var16 = 0;
                     if (var2) {
                        var7 = (class278)this.field7664.method281(true);
                        var3 = var16 + 1;
                        class158.field2027[var16] = (int)var7.field9965;
                        this.field7657 -= var7.field3546;
                        var10000 = var3;
                     } else {
                        if (this.field7664.method285((byte)-122)) {
                           label745: {
                              if (~var16 < -1) {
                                 OpenGL.glDeleteRenderbuffersEXT(var16, class158.field2027, 0);
                                 var8 = false;
                                 if (!var2 && this.field7659.method285((byte)-116)) {
                                    break label745;
                                 }
                              } else if (this.field7659.method285((byte)-116)) {
                                 break label745;
                              }

                              do {
                                 var9 = (class278)this.field7659.method281(true);
                                 OpenGL.glDeleteLists((int)var9.field9965, var9.field3546);
                              } while(!this.field7659.method285((byte)-116));
                           }

                           if (var2) {
                              var10 = this.field7665.method281(true);
                              OpenGL.glDeleteProgramARB((int)var10.field9965);
                           }

                           while(!this.field7665.method285((byte)-122)) {
                              var10 = this.field7665.method281(true);
                              OpenGL.glDeleteProgramARB((int)var10.field9965);
                           }

                           if (var2 || !this.field7666.method285((byte)-116)) {
                              do {
                                 var11 = this.field7666.method281(true);
                                 OpenGL.glDeleteObjectARB(var11.field9965);
                              } while(!this.field7666.method285((byte)-116));
                           }

                           if (var2) {
                              var12 = (class278)this.field7659.method281(true);
                              OpenGL.glDeleteLists((int)var12.field9965, var12.field3546);
                           }

                           while(true) {
                              if (this.field7659.method285((byte)-128)) {
                                 this.field7637.method5638(0);
                                 var18 = this;
                                 if (!var2) {
                                    if (this.method400() > 100663296 && this.field7668 + 60000L < class163.method1353(-120)) {
                                       System.gc();
                                       this.field7668 = class163.method1353(-126);
                                    }

                                    this.field7640 = var15;
                                    return;
                                 }
                              } else {
                                 var18 = this;
                              }

                              var12 = (class278)var18.field7659.method281(true);
                              OpenGL.glDeleteLists((int)var12.field9965, var12.field3546);
                           }
                        }

                        var7 = (class278)this.field7664.method281(true);
                        var3 = var16 + 1;
                        class158.field2027[var16] = (int)var7.field9965;
                        this.field7657 -= var7.field3546;
                        var10000 = var3;
                     }
                  } else {
                     if (this.field7664.method285((byte)-122)) {
                        label831: {
                           if (~var3 < -1) {
                              OpenGL.glDeleteRenderbuffersEXT(var3, class158.field2027, 0);
                              var8 = false;
                              if (!var2 && this.field7659.method285((byte)-116)) {
                                 break label831;
                              }
                           } else if (this.field7659.method285((byte)-116)) {
                              break label831;
                           }

                           do {
                              var9 = (class278)this.field7659.method281(true);
                              OpenGL.glDeleteLists((int)var9.field9965, var9.field3546);
                           } while(!this.field7659.method285((byte)-116));
                        }

                        if (var2) {
                           var10 = this.field7665.method281(true);
                           OpenGL.glDeleteProgramARB((int)var10.field9965);
                        }

                        while(!this.field7665.method285((byte)-122)) {
                           var10 = this.field7665.method281(true);
                           OpenGL.glDeleteProgramARB((int)var10.field9965);
                        }

                        if (var2 || !this.field7666.method285((byte)-116)) {
                           do {
                              var11 = this.field7666.method281(true);
                              OpenGL.glDeleteObjectARB(var11.field9965);
                           } while(!this.field7666.method285((byte)-116));
                        }

                        if (var2) {
                           var12 = (class278)this.field7659.method281(true);
                           OpenGL.glDeleteLists((int)var12.field9965, var12.field3546);
                        }

                        while(true) {
                           if (this.field7659.method285((byte)-128)) {
                              this.field7637.method5638(0);
                              var18 = this;
                              if (!var2) {
                                 if (this.method400() > 100663296 && this.field7668 + 60000L < class163.method1353(-120)) {
                                    System.gc();
                                    this.field7668 = class163.method1353(-126);
                                 }

                                 this.field7640 = var15;
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class278)var18.field7659.method281(true);
                           OpenGL.glDeleteLists((int)var12.field9965, var12.field3546);
                        }
                     }

                     var7 = (class278)this.field7664.method281(true);
                     class158.field2027[var3++] = (int)var7.field9965;
                     this.field7657 -= var7.field3546;
                     var10000 = var3;
                  }

                  while(true) {
                     while(var10000 == 1000) {
                        OpenGL.glDeleteRenderbuffersEXT(var3, class158.field2027, 0);
                        var10000 = 0;
                        if (!var2) {
                           var3 = 0;
                           break;
                        }
                     }

                     if (this.field7664.method285((byte)-122)) {
                        label930: {
                           if (~var3 < -1) {
                              OpenGL.glDeleteRenderbuffersEXT(var3, class158.field2027, 0);
                              var8 = false;
                              if (!var2 && this.field7659.method285((byte)-116)) {
                                 break label930;
                              }
                           } else if (this.field7659.method285((byte)-116)) {
                              break label930;
                           }

                           do {
                              var9 = (class278)this.field7659.method281(true);
                              OpenGL.glDeleteLists((int)var9.field9965, var9.field3546);
                           } while(!this.field7659.method285((byte)-116));
                        }

                        if (var2) {
                           var10 = this.field7665.method281(true);
                           OpenGL.glDeleteProgramARB((int)var10.field9965);
                        }

                        while(!this.field7665.method285((byte)-122)) {
                           var10 = this.field7665.method281(true);
                           OpenGL.glDeleteProgramARB((int)var10.field9965);
                        }

                        if (var2 || !this.field7666.method285((byte)-116)) {
                           do {
                              var11 = this.field7666.method281(true);
                              OpenGL.glDeleteObjectARB(var11.field9965);
                           } while(!this.field7666.method285((byte)-116));
                        }

                        if (var2) {
                           var12 = (class278)this.field7659.method281(true);
                           OpenGL.glDeleteLists((int)var12.field9965, var12.field3546);
                        }

                        while(true) {
                           if (this.field7659.method285((byte)-128)) {
                              this.field7637.method5638(0);
                              var18 = this;
                              if (!var2) {
                                 if (this.method400() > 100663296 && this.field7668 + 60000L < class163.method1353(-120)) {
                                    System.gc();
                                    this.field7668 = class163.method1353(-126);
                                 }

                                 this.field7640 = var15;
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class278)var18.field7659.method281(true);
                           OpenGL.glDeleteLists((int)var12.field9965, var12.field3546);
                        }
                     }

                     var7 = (class278)this.field7664.method281(true);
                     class158.field2027[var3++] = (int)var7.field9965;
                     this.field7657 -= var7.field3546;
                     var10000 = var3;
                  }
               }

               var5 = (class278)this.field7662.method281(true);
               class158.field2027[var3++] = (int)var5.field9965;
               this.field7660 -= var5.field3546;
               var10000 = ~var3;
            }
         } else {
            if (this.field7662.method285((byte)-121)) {
               label357: {
                  if (~var3 < -1) {
                     OpenGL.glDeleteTextures(var3, class158.field2027, 0);
                     var3 = 0;
                     if (var2) {
                        var6 = (class278)this.field7663.method281(true);
                        class158.field2027[var3++] = var6.field3546;
                        var10000 = var3;
                     } else {
                        if (this.field7663.method285((byte)-121)) {
                           break label357;
                        }

                        var6 = (class278)this.field7663.method281(true);
                        class158.field2027[var3++] = var6.field3546;
                        var10000 = var3;
                     }
                  } else {
                     if (this.field7663.method285((byte)-121)) {
                        break label357;
                     }

                     var6 = (class278)this.field7663.method281(true);
                     class158.field2027[var3++] = var6.field3546;
                     var10000 = var3;
                  }

                  while(true) {
                     while(var10000 == 1000) {
                        OpenGL.glDeleteFramebuffersEXT(var3, class158.field2027, 0);
                        var10000 = 0;
                        if (!var2) {
                           var3 = 0;
                           break;
                        }
                     }

                     if (this.field7663.method285((byte)-121)) {
                        break;
                     }

                     var6 = (class278)this.field7663.method281(true);
                     class158.field2027[var3++] = var6.field3546;
                     var10000 = var3;
                  }
               }

               if (~var3 < -1) {
                  OpenGL.glDeleteFramebuffersEXT(var3, class158.field2027, 0);
                  var16 = 0;
                  if (var2) {
                     var7 = (class278)this.field7664.method281(true);
                     var3 = var16 + 1;
                     class158.field2027[var16] = (int)var7.field9965;
                     this.field7657 -= var7.field3546;
                     var10000 = var3;
                  } else {
                     if (this.field7664.method285((byte)-122)) {
                        label415: {
                           if (~var16 < -1) {
                              OpenGL.glDeleteRenderbuffersEXT(var16, class158.field2027, 0);
                              var8 = false;
                              if (!var2 && this.field7659.method285((byte)-116)) {
                                 break label415;
                              }
                           } else if (this.field7659.method285((byte)-116)) {
                              break label415;
                           }

                           do {
                              var9 = (class278)this.field7659.method281(true);
                              OpenGL.glDeleteLists((int)var9.field9965, var9.field3546);
                           } while(!this.field7659.method285((byte)-116));
                        }

                        if (var2) {
                           var10 = this.field7665.method281(true);
                           OpenGL.glDeleteProgramARB((int)var10.field9965);
                        }

                        while(!this.field7665.method285((byte)-122)) {
                           var10 = this.field7665.method281(true);
                           OpenGL.glDeleteProgramARB((int)var10.field9965);
                        }

                        if (var2 || !this.field7666.method285((byte)-116)) {
                           do {
                              var11 = this.field7666.method281(true);
                              OpenGL.glDeleteObjectARB(var11.field9965);
                           } while(!this.field7666.method285((byte)-116));
                        }

                        if (var2) {
                           var12 = (class278)this.field7659.method281(true);
                           OpenGL.glDeleteLists((int)var12.field9965, var12.field3546);
                        }

                        while(true) {
                           if (this.field7659.method285((byte)-128)) {
                              this.field7637.method5638(0);
                              var18 = this;
                              if (!var2) {
                                 if (this.method400() > 100663296 && this.field7668 + 60000L < class163.method1353(-120)) {
                                    System.gc();
                                    this.field7668 = class163.method1353(-126);
                                 }

                                 this.field7640 = var15;
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class278)var18.field7659.method281(true);
                           OpenGL.glDeleteLists((int)var12.field9965, var12.field3546);
                        }
                     }

                     var7 = (class278)this.field7664.method281(true);
                     var3 = var16 + 1;
                     class158.field2027[var16] = (int)var7.field9965;
                     this.field7657 -= var7.field3546;
                     var10000 = var3;
                  }
               } else {
                  if (this.field7664.method285((byte)-122)) {
                     label501: {
                        if (~var3 < -1) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class158.field2027, 0);
                           var8 = false;
                           if (!var2 && this.field7659.method285((byte)-116)) {
                              break label501;
                           }
                        } else if (this.field7659.method285((byte)-116)) {
                           break label501;
                        }

                        do {
                           var9 = (class278)this.field7659.method281(true);
                           OpenGL.glDeleteLists((int)var9.field9965, var9.field3546);
                        } while(!this.field7659.method285((byte)-116));
                     }

                     if (var2) {
                        var10 = this.field7665.method281(true);
                        OpenGL.glDeleteProgramARB((int)var10.field9965);
                     }

                     while(!this.field7665.method285((byte)-122)) {
                        var10 = this.field7665.method281(true);
                        OpenGL.glDeleteProgramARB((int)var10.field9965);
                     }

                     if (var2 || !this.field7666.method285((byte)-116)) {
                        do {
                           var11 = this.field7666.method281(true);
                           OpenGL.glDeleteObjectARB(var11.field9965);
                        } while(!this.field7666.method285((byte)-116));
                     }

                     if (var2) {
                        var12 = (class278)this.field7659.method281(true);
                        OpenGL.glDeleteLists((int)var12.field9965, var12.field3546);
                     }

                     while(true) {
                        if (this.field7659.method285((byte)-128)) {
                           this.field7637.method5638(0);
                           var18 = this;
                           if (!var2) {
                              if (this.method400() > 100663296 && this.field7668 + 60000L < class163.method1353(-120)) {
                                 System.gc();
                                 this.field7668 = class163.method1353(-126);
                              }

                              this.field7640 = var15;
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class278)var18.field7659.method281(true);
                        OpenGL.glDeleteLists((int)var12.field9965, var12.field3546);
                     }
                  }

                  var7 = (class278)this.field7664.method281(true);
                  class158.field2027[var3++] = (int)var7.field9965;
                  this.field7657 -= var7.field3546;
                  var10000 = var3;
               }

               while(true) {
                  while(var10000 == 1000) {
                     OpenGL.glDeleteRenderbuffersEXT(var3, class158.field2027, 0);
                     var10000 = 0;
                     if (!var2) {
                        var3 = 0;
                        break;
                     }
                  }

                  if (this.field7664.method285((byte)-122)) {
                     label600: {
                        if (~var3 < -1) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class158.field2027, 0);
                           var8 = false;
                           if (!var2 && this.field7659.method285((byte)-116)) {
                              break label600;
                           }
                        } else if (this.field7659.method285((byte)-116)) {
                           break label600;
                        }

                        do {
                           var9 = (class278)this.field7659.method281(true);
                           OpenGL.glDeleteLists((int)var9.field9965, var9.field3546);
                        } while(!this.field7659.method285((byte)-116));
                     }

                     if (var2) {
                        var10 = this.field7665.method281(true);
                        OpenGL.glDeleteProgramARB((int)var10.field9965);
                     }

                     while(!this.field7665.method285((byte)-122)) {
                        var10 = this.field7665.method281(true);
                        OpenGL.glDeleteProgramARB((int)var10.field9965);
                     }

                     if (var2 || !this.field7666.method285((byte)-116)) {
                        do {
                           var11 = this.field7666.method281(true);
                           OpenGL.glDeleteObjectARB(var11.field9965);
                        } while(!this.field7666.method285((byte)-116));
                     }

                     if (var2) {
                        var12 = (class278)this.field7659.method281(true);
                        OpenGL.glDeleteLists((int)var12.field9965, var12.field3546);
                     }

                     while(true) {
                        if (this.field7659.method285((byte)-128)) {
                           this.field7637.method5638(0);
                           var18 = this;
                           if (!var2) {
                              if (this.method400() > 100663296 && this.field7668 + 60000L < class163.method1353(-120)) {
                                 System.gc();
                                 this.field7668 = class163.method1353(-126);
                              }

                              this.field7640 = var15;
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class278)var18.field7659.method281(true);
                        OpenGL.glDeleteLists((int)var12.field9965, var12.field3546);
                     }
                  }

                  var7 = (class278)this.field7664.method281(true);
                  class158.field2027[var3++] = (int)var7.field9965;
                  this.field7657 -= var7.field3546;
                  var10000 = var3;
               }
            }

            var5 = (class278)this.field7662.method281(true);
            class158.field2027[var3++] = (int)var5.field9965;
            this.field7660 -= var5.field3546;
            var10000 = ~var3;
         }

         while(true) {
            while(var10000 == -1001) {
               OpenGL.glDeleteTextures(var3, class158.field2027, 0);
               var10000 = 0;
               if (!var2) {
                  var3 = 0;
                  break;
               }
            }

            if (this.field7662.method285((byte)-121)) {
               label137: {
                  if (~var3 < -1) {
                     OpenGL.glDeleteTextures(var3, class158.field2027, 0);
                     var3 = 0;
                     if (var2) {
                        var6 = (class278)this.field7663.method281(true);
                        class158.field2027[var3++] = var6.field3546;
                        var10000 = var3;
                     } else {
                        if (this.field7663.method285((byte)-121)) {
                           break label137;
                        }

                        var6 = (class278)this.field7663.method281(true);
                        class158.field2027[var3++] = var6.field3546;
                        var10000 = var3;
                     }
                  } else {
                     if (this.field7663.method285((byte)-121)) {
                        break label137;
                     }

                     var6 = (class278)this.field7663.method281(true);
                     class158.field2027[var3++] = var6.field3546;
                     var10000 = var3;
                  }

                  while(true) {
                     while(var10000 == 1000) {
                        OpenGL.glDeleteFramebuffersEXT(var3, class158.field2027, 0);
                        var10000 = 0;
                        if (!var2) {
                           var3 = 0;
                           break;
                        }
                     }

                     if (this.field7663.method285((byte)-121)) {
                        break;
                     }

                     var6 = (class278)this.field7663.method281(true);
                     class158.field2027[var3++] = var6.field3546;
                     var10000 = var3;
                  }
               }

               if (~var3 < -1) {
                  OpenGL.glDeleteFramebuffersEXT(var3, class158.field2027, 0);
                  var16 = 0;
                  if (var2) {
                     var7 = (class278)this.field7664.method281(true);
                     var3 = var16 + 1;
                     class158.field2027[var16] = (int)var7.field9965;
                     this.field7657 -= var7.field3546;
                     var10000 = var3;
                  } else {
                     if (this.field7664.method285((byte)-122)) {
                        label237: {
                           if (~var16 < -1) {
                              OpenGL.glDeleteRenderbuffersEXT(var16, class158.field2027, 0);
                              var8 = false;
                              if (!var2 && this.field7659.method285((byte)-116)) {
                                 break label237;
                              }
                           } else if (this.field7659.method285((byte)-116)) {
                              break label237;
                           }

                           do {
                              var9 = (class278)this.field7659.method281(true);
                              OpenGL.glDeleteLists((int)var9.field9965, var9.field3546);
                           } while(!this.field7659.method285((byte)-116));
                        }

                        if (var2) {
                           var10 = this.field7665.method281(true);
                           OpenGL.glDeleteProgramARB((int)var10.field9965);
                        }

                        while(!this.field7665.method285((byte)-122)) {
                           var10 = this.field7665.method281(true);
                           OpenGL.glDeleteProgramARB((int)var10.field9965);
                        }

                        if (var2 || !this.field7666.method285((byte)-116)) {
                           do {
                              var11 = this.field7666.method281(true);
                              OpenGL.glDeleteObjectARB(var11.field9965);
                           } while(!this.field7666.method285((byte)-116));
                        }

                        if (var2) {
                           var12 = (class278)this.field7659.method281(true);
                           OpenGL.glDeleteLists((int)var12.field9965, var12.field3546);
                        }

                        while(true) {
                           if (this.field7659.method285((byte)-128)) {
                              this.field7637.method5638(0);
                              var18 = this;
                              if (!var2) {
                                 if (this.method400() > 100663296 && this.field7668 + 60000L < class163.method1353(-120)) {
                                    System.gc();
                                    this.field7668 = class163.method1353(-126);
                                 }

                                 this.field7640 = var15;
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class278)var18.field7659.method281(true);
                           OpenGL.glDeleteLists((int)var12.field9965, var12.field3546);
                        }
                     }

                     var7 = (class278)this.field7664.method281(true);
                     var3 = var16 + 1;
                     class158.field2027[var16] = (int)var7.field9965;
                     this.field7657 -= var7.field3546;
                     var10000 = var3;
                  }
               } else {
                  if (this.field7664.method285((byte)-122)) {
                     label150: {
                        if (~var3 < -1) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class158.field2027, 0);
                           var8 = false;
                           if (!var2 && this.field7659.method285((byte)-116)) {
                              break label150;
                           }
                        } else if (this.field7659.method285((byte)-116)) {
                           break label150;
                        }

                        do {
                           var9 = (class278)this.field7659.method281(true);
                           OpenGL.glDeleteLists((int)var9.field9965, var9.field3546);
                        } while(!this.field7659.method285((byte)-116));
                     }

                     if (var2) {
                        var10 = this.field7665.method281(true);
                        OpenGL.glDeleteProgramARB((int)var10.field9965);
                     }

                     while(!this.field7665.method285((byte)-122)) {
                        var10 = this.field7665.method281(true);
                        OpenGL.glDeleteProgramARB((int)var10.field9965);
                     }

                     if (var2 || !this.field7666.method285((byte)-116)) {
                        do {
                           var11 = this.field7666.method281(true);
                           OpenGL.glDeleteObjectARB(var11.field9965);
                        } while(!this.field7666.method285((byte)-116));
                     }

                     if (var2) {
                        var12 = (class278)this.field7659.method281(true);
                        OpenGL.glDeleteLists((int)var12.field9965, var12.field3546);
                     }

                     while(true) {
                        if (this.field7659.method285((byte)-128)) {
                           this.field7637.method5638(0);
                           var18 = this;
                           if (!var2) {
                              if (this.method400() > 100663296 && this.field7668 + 60000L < class163.method1353(-120)) {
                                 System.gc();
                                 this.field7668 = class163.method1353(-126);
                              }

                              this.field7640 = var15;
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class278)var18.field7659.method281(true);
                        OpenGL.glDeleteLists((int)var12.field9965, var12.field3546);
                     }
                  }

                  var7 = (class278)this.field7664.method281(true);
                  class158.field2027[var3++] = (int)var7.field9965;
                  this.field7657 -= var7.field3546;
                  var10000 = var3;
               }

               while(true) {
                  while(var10000 == 1000) {
                     OpenGL.glDeleteRenderbuffersEXT(var3, class158.field2027, 0);
                     var10000 = 0;
                     if (!var2) {
                        var3 = 0;
                        break;
                     }
                  }

                  if (this.field7664.method285((byte)-122)) {
                     label99: {
                        if (~var3 < -1) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class158.field2027, 0);
                           var8 = false;
                           if (!var2 && this.field7659.method285((byte)-116)) {
                              break label99;
                           }
                        } else if (this.field7659.method285((byte)-116)) {
                           break label99;
                        }

                        do {
                           var9 = (class278)this.field7659.method281(true);
                           OpenGL.glDeleteLists((int)var9.field9965, var9.field3546);
                        } while(!this.field7659.method285((byte)-116));
                     }

                     if (var2) {
                        var10 = this.field7665.method281(true);
                        OpenGL.glDeleteProgramARB((int)var10.field9965);
                     }

                     while(!this.field7665.method285((byte)-122)) {
                        var10 = this.field7665.method281(true);
                        OpenGL.glDeleteProgramARB((int)var10.field9965);
                     }

                     if (var2 || !this.field7666.method285((byte)-116)) {
                        do {
                           var11 = this.field7666.method281(true);
                           OpenGL.glDeleteObjectARB(var11.field9965);
                        } while(!this.field7666.method285((byte)-116));
                     }

                     if (var2) {
                        var12 = (class278)this.field7659.method281(true);
                        OpenGL.glDeleteLists((int)var12.field9965, var12.field3546);
                     }

                     while(true) {
                        if (this.field7659.method285((byte)-128)) {
                           this.field7637.method5638(0);
                           var18 = this;
                           if (!var2) {
                              if (this.method400() > 100663296 && this.field7668 + 60000L < class163.method1353(-120)) {
                                 System.gc();
                                 this.field7668 = class163.method1353(-126);
                              }

                              this.field7640 = var15;
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class278)var18.field7659.method281(true);
                        OpenGL.glDeleteLists((int)var12.field9965, var12.field3546);
                     }
                  }

                  var7 = (class278)this.field7664.method281(true);
                  class158.field2027[var3++] = (int)var7.field9965;
                  this.field7657 -= var7.field3546;
                  var10000 = var3;
               }
            }

            var5 = (class278)this.field7662.method281(true);
            class158.field2027[var3++] = (int)var5.field9965;
            this.field7660 -= var5.field3546;
            var10000 = ~var3;
         }
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field7795[77] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(Lkv;[Lu;Z)Lda;"
   )
   public final class447 method430(class19 arg0, class65[] arg1, boolean arg2) {
      try {
         ++field7497;
         return new class38(this, arg0, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7795[179] + (arg0 != null ? field7795[4] : field7795[2]) + ',' + (arg1 != null ? field7795[4] : field7795[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "j",
      descriptor = "()Z"
   )
   public final boolean method433() {
      try {
         ++field7605;
         return true;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7795[132] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "b",
      descriptor = "(Lcha;Z)V"
   )
   public final void method3965(class184 arg0, boolean arg1) {
      try {
         if (arg1) {
            this.field7697 = false;
         }

         ++field7545;
         OpenGL.glLoadMatrixf(arg0.method1550(12941), 0);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[84] + (arg0 != null ? field7795[4] : field7795[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "ZA",
      descriptor = "(IFFFFF)V"
   )
   public final void method418(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      try {
         ++field7479;
         boolean var7 = this.field7731 != arg0;
         if (var7 || this.field7742 != arg1 || this.field7728 != arg2) {
            this.field7742 = arg1;
            this.field7731 = arg0;
            this.field7728 = arg2;
            if (var7) {
               this.field7713 = (float)(65280 & this.field7731) / 65280.0F;
               this.field7706 = (float)(this.field7731 & 255) / 255.0F;
               this.field7722 = (float)(this.field7731 & 16711680) / 1.671168E7F;
               this.method4021(31541);
            }

            this.method4004(true);
         }

         if (this.field7767[0] != arg3 || this.field7767[1] != arg4 || this.field7767[2] != arg5) {
            this.field7767[2] = arg5;
            this.field7767[0] = arg3;
            this.field7767[1] = arg4;
            this.field7785[1] = -arg4;
            this.field7785[0] = -arg3;
            this.field7785[2] = -arg5;
            float var8 = (float)(1.0D / Math.sqrt((double)(arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field7684[2] = arg5 * var8;
            this.field7684[0] = arg3 * var8;
            this.field7684[1] = arg4 * var8;
            this.field7718[2] = -this.field7684[2];
            this.field7718[1] = -this.field7684[1];
            this.field7718[0] = -this.field7684[0];
            this.method3981(-31835);
            this.field7776 = (int)(arg3 * 256.0F / arg4);
            this.field7757 = (int)(arg5 * 256.0F / arg4);
         }

      } catch (RuntimeException var10) {
         throw class93.method866(var10, field7795[154] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(BI)I"
   )
   public final int method3966(byte arg0, int arg1) {
      try {
         if (arg0 != -111) {
            this.method439(68, 51, 25, 61);
         }

         ++field7437;
         if (arg1 != 1) {
            if (arg1 == 0) {
               return 8448;
            } else if (arg1 != 2) {
               if (~arg1 == -4) {
                  return 260;
               } else if (~arg1 == -5) {
                  return 34023;
               } else {
                  throw new IllegalArgumentException();
               }
            } else {
               return 34165;
            }
         } else {
            return 7681;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[27] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "h",
      descriptor = "()V"
   )
   public final void method507() {
      try {
         label28: {
            ++field7457;
            if (!this.field7780) {
               if (!this.field7736) {
                  throw new RuntimeException("");
               }

               this.field7652.method2411(0, 0, this.field7453, this.field7615, 0, 0);
               this.field7599.setSurface(this.field7443);
               if (!client.field1481) {
                  break label28;
               }
            }

            if (this.field7647 != this.field7653) {
               throw new RuntimeException();
            }

            this.field7647.method5307(0, (byte)86);
            this.field7647.method5307(8, (byte)86);
            this.method3995(this.field7647, (byte)-29);
         }

         this.field7652 = null;
         this.field7615 = this.field7546;
         this.field7453 = this.field7592;
         this.method3967((byte)-3);
         this.method4018((byte)102);
         this.method443();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7795[200] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method476(int arg0, int arg1) throws class221 {
      try {
         try {
            this.field7599.swapBuffers();
         } catch (Exception var4) {
         }

         ++field7484;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7795[171] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "HA",
      descriptor = "(IIII[I)V"
   )
   public final void method509(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
      try {
         ++field7498;
         float var6 = (float)arg2 * this.field7672.field2351 + (float)arg0 * this.field7672.field2339 + (float)arg1 * this.field7672.field2356 + this.field7672.field2357;
         if (!(var6 < (float)this.field7734) && !((float)this.field7783 < var6)) {
            int var7 = (int)(((float)arg2 * this.field7672.field2332 + (float)arg0 * this.field7672.field2349 + (float)arg1 * this.field7672.field2342 + this.field7672.field2348) * (float)this.field7726 / (float)arg3);
            int var8 = (int)(((float)arg2 * this.field7672.field2353 + (float)arg0 * this.field7672.field2352 + (float)arg1 * this.field7672.field2331 + this.field7672.field2363) * (float)this.field7689 / (float)arg3);
            if (this.field7758 <= (float)var7 && this.field7709 >= (float)var7 && (float)var8 >= this.field7750 && (float)var8 <= this.field7779) {
               arg4[1] = (int)((float)var8 - this.field7750);
               arg4[2] = (int)var6;
               arg4[0] = (int)((float)var7 + -this.field7758);
            } else {
               arg4[0] = arg4[1] = arg4[2] = -1;
            }
         } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field7795[17] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field7795[4] : field7795[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "h",
      descriptor = "(B)V"
   )
   public final void method3967(byte arg0) {
      try {
         if (~this.field7692 != -1) {
            this.field7669 &= -32;
            this.field7692 = 0;
         }

         ++field7477;
         int var2 = -80 / ((65 - arg0) / 37);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[80] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "A",
      descriptor = "(I)V"
   )
   private final void method3968(int arg0) {
      try {
         if (~this.field7692 != -4) {
            this.field7692 = 3;
            this.method4014(5889);
            this.method3990(-30799);
            this.field7669 &= -8;
         }

         int var2 = -118 / ((arg0 - -72) / 32);
         ++field7620;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[224] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "y",
      descriptor = "()V"
   )
   public final void method393() {
      try {
         ++field7568;
         this.field7634.method5220(-29949);
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7795[191] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "e",
      descriptor = "(I)Lza;"
   )
   public final class735 method469(int arg0) {
      try {
         ++field7476;
         class353 var2 = new class353(arg0);
         this.field7643.method279(false, var2);
         return var2;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[109] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "za",
      descriptor = "(IIIII)V"
   )
   public final void method420(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var6 = client.field1481;

      try {
         ++field7470;
         if (~arg2 > -1) {
            arg2 = -arg2;
         }

         if (this.field7768 <= arg0 + arg2 && -arg2 + arg0 <= this.field7705 && ~(arg1 + arg2) <= ~this.field7788 && -arg2 + arg1 <= this.field7775) {
            this.method3971((byte)93);
            this.method4012(arg4, 33);
            OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
            float var7 = (float)arg0 + 0.35F;
            float var8 = (float)arg1 + 0.35F;
            int var9 = arg2 << 1;
            if (this.field7754 > (float)var9) {
               OpenGL.glBegin(7);
               OpenGL.glVertex2f(var7 + 1.0F, var8 + 1.0F);
               OpenGL.glVertex2f(var7 + 1.0F, var8 - 1.0F);
               OpenGL.glVertex2f(var7 + -1.0F, var8 + -1.0F);
               OpenGL.glVertex2f(var7 + -1.0F, var8 + 1.0F);
               OpenGL.glEnd();
            } else if (this.field7686 >= (float)var9) {
               OpenGL.glEnable(2832);
               OpenGL.glPointSize((float)var9);
               OpenGL.glBegin(0);
               OpenGL.glVertex2f(var7, var8);
               OpenGL.glEnd();
               OpenGL.glDisable(2832);
            } else {
               int var10;
               label42: {
                  OpenGL.glBegin(6);
                  OpenGL.glVertex2f(var7, var8);
                  var10 = 262144 / (arg2 * 6);
                  if (~var10 >= -65) {
                     var10 = 64;
                     if (!var6) {
                        break label42;
                     }
                  }

                  if (var10 > 512) {
                     var10 = 512;
                  }
               }

               int var11 = class634.method4671(var10, (byte)-107);
               OpenGL.glVertex2f((float)arg2 + var7, var8);
               int var12 = -var11 + 16384;
               if (var6) {
                  OpenGL.glVertex2f(class301.field4191[var12] * (float)arg2 + var7, class301.field4194[var12] * (float)arg2 + var8);
                  var12 -= var11;
               }

               while(true) {
                  while(var12 > 0) {
                     OpenGL.glVertex2f(class301.field4191[var12] * (float)arg2 + var7, class301.field4194[var12] * (float)arg2 + var8);
                     var12 -= var11;
                  }

                  OpenGL.glVertex2f((float)arg2 + var7, var8);
                  OpenGL.glEnd();
                  if (!var6) {
                     return;
                  }

                  var12 -= var11;
               }
            }
         }
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field7795[76] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(IIBI)V"
   )
   public final void method3969(int arg0, int arg1, byte arg2, int arg3) {
      try {
         OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
         ++field7516;
         if (arg2 >= -112) {
            this.field7771 = null;
         }

         OpenGL.glTexEnvi(8960, arg0 + 34200, arg3);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7795[25] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "w",
      descriptor = "(I)V"
   )
   private final void method3970(int arg0) {
      try {
         ++field7561;
         int var2 = 85 / ((-21 - arg0) / 48);
         if (~this.field7768 >= ~this.field7705 && ~this.field7788 >= ~this.field7775) {
            OpenGL.glScissor(this.field7768 + this.field7698, -this.field7775 + this.field7699 - -this.field7615, this.field7705 - this.field7768, this.field7775 - this.field7788);
         } else {
            OpenGL.glScissor(0, 0, 0, 0);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[119] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(Lkia;)V"
   )
   public final void method397(class93 arg0) {
      try {
         this.field7672.method874(arg0);
         ++field7581;
         this.field7676.method874(this.field7672);
         this.field7676.method1542(false);
         this.field7677.method1545((byte)86, this.field7676);
         if (this.field7692 != 1) {
            this.method3990(-30799);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[127] + (arg0 != null ? field7795[4] : field7795[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "d",
      descriptor = "(B)V"
   )
   private final void method3971(byte arg0) {
      try {
         if (this.field7669 != 1) {
            this.method4036((byte)89);
            this.method3957(false, 99);
            this.method4016(false, arg0 ^ -15740);
            this.method4005(97, false);
            this.method4020(72, false);
            this.method4006((class549)null, (byte)-127);
            this.method4030(-2, true);
            this.method4009(1, 1);
            this.field7669 = 1;
         }

         if (arg0 != 93) {
            this.method483((class735)null);
         }

         ++field7579;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[207] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V"
   )
   public final void method472(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class221 {
      try {
         ++field7446;
         this.method476(arg2, arg3);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7795[29] + (arg0 != null ? field7795[4] : field7795[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method429(int arg0) {
      try {
         this.method3963(8448);
         ++field7618;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[156] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "([IIIIIZ)Lpd;"
   )
   public final class648 method398(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         ++field7622;
         return new class302(this, arg3, arg4, arg0, arg1, arg2);
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field7795[23] + (arg0 != null ? field7795[4] : field7795[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "i",
      descriptor = "(I)V"
   )
   public final void method493(int arg0) {
      try {
         ++field7448;
         if (arg0 >= 128 && ~arg0 >= -1025) {
            this.field7629 = arg0;
            this.field7637.method5633(0);
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[153] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "f",
      descriptor = "()Z"
   )
   public final boolean method440() {
      try {
         ++field7463;
         if (this.field7633 != null) {
            if (!this.field7633.method317((byte)111)) {
               if (!this.field7634.method5211(true, this.field7633)) {
                  return false;
               }

               this.field7637.method5633(0);
            }

            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7795[16] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(IB)V"
   )
   public final synchronized void method3972(int arg0, byte arg1) {
      try {
         if (arg1 >= 95) {
            ++field7502;
            class673 var3 = new class673();
            var3.field9965 = (long)arg0;
            this.field7665.method279(false, var3);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7795[49] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(IIZ)Lpd;"
   )
   public final class648 method435(int arg0, int arg1, boolean arg2) {
      try {
         ++field7539;
         return new class302(this, arg0, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7795[143] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(FFFB)V"
   )
   private final void method3973(float arg0, float arg1, float arg2, byte arg3) {
      try {
         ++field7587;
         if (arg3 == 102) {
            OpenGL.glMatrixMode(5890);
            if (this.field7747) {
               OpenGL.glLoadIdentity();
            }

            OpenGL.glTranslatef(arg2, arg1, arg0);
            OpenGL.glMatrixMode(5888);
            this.field7747 = true;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7795[188] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "c",
      descriptor = "(B)V"
   )
   private final void method3974(byte arg0) {
      try {
         if (arg0 != 94) {
            this.method405(0.030297168F, 1.1469312F, 0.45237595F);
         }

         ++field7458;
         if (~this.field7692 != -3) {
            this.field7692 = 2;
            this.method4039(-126);
            this.method3990(-30799);
            this.field7669 &= -8;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[37] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "h",
      descriptor = "(II)I"
   )
   public final int method3975(int arg0, int arg1) {
      try {
         ++field7508;
         if (arg1 != -7184) {
            this.field7723 = null;
         }

         if (arg0 != 6406 && arg0 != 6409) {
            if (~arg0 != -6411 && arg0 != 34846 && arg0 != 34844) {
               if (~arg0 != -6408) {
                  if (~arg0 != -6409 && arg0 != 34847) {
                     if (arg0 != 34843) {
                        if (~arg0 != -34843) {
                           if (~arg0 == -6403) {
                              return 3;
                           } else if (~arg0 == -6402) {
                              return 1;
                           } else {
                              throw new IllegalArgumentException("");
                           }
                        } else {
                           return 8;
                        }
                     } else {
                        return 6;
                     }
                  } else {
                     return 4;
                  }
               } else {
                  return 3;
               }
            } else {
               return 2;
            }
         } else {
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[59] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "e",
      descriptor = "(B)V"
   )
   private final void method3976(byte arg0) {
      try {
         label24: {
            ++field7585;
            if (this.field7455 == null) {
               this.field7592 = this.field7546 = 0;
               if (!client.field1481) {
                  break label24;
               }
            }

            Dimension var2 = this.field7455.getSize();
            this.field7592 = var2.width;
            this.field7546 = var2.height;
         }

         if (this.field7653 == null) {
            this.field7453 = this.field7592;
            this.field7615 = this.field7546;
            this.method4018((byte)102);
         }

         this.method3967((byte)106);
         if (arg0 > 97) {
            this.method443();
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[110] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(IILha;)Lpd;"
   )
   public static final class648 method3977(int arg0, int arg1, class479 arg2) {
      try {
         ++field7426;
         if (arg0 != -1) {
            return null;
         } else {
            class191 var3 = (class191)class705.field10295.method1818(arg0, (long)arg1);
            if (var3 != null) {
               class509 var4 = var3.field2423.method2765((byte)88);
               var3.field2424 = true;
               if (var4 != null) {
                  return var4.method3843((byte)-59, arg2);
               }
            }

            return null;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7795[208] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7795[4] : field7795[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "C",
      descriptor = "(Z)V"
   )
   public final void method437(boolean arg0) {
      try {
         this.field7682 = arg0;
         ++field7627;
         this.method4032(-2);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[176] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "la",
      descriptor = "()V"
   )
   public final void method443() {
      try {
         this.field7775 = this.field7615;
         this.field7788 = 0;
         this.field7768 = 0;
         this.field7705 = this.field7453;
         ++field7557;
         OpenGL.glDisable(3089);
         this.method4037(5889);
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7795[42] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "x",
      descriptor = "(I)V"
   )
   private final void method3978(int arg0) {
      try {
         this.field7691[10] = this.field7766;
         this.field7691[14] = this.field7719;
         ++field7430;
         if (arg0 != -24740) {
            this.method4031(-62L, (byte)-46);
         }

         this.field7708 = (float)this.field7783;
         this.field7755 = (this.field7691[14] + (float)(-this.field7783)) / this.field7691[10];
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[226] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(BLjava/awt/Component;)Lam;"
   )
   public static final class323 method3979(byte arg0, Component arg1) {
      try {
         ++field7440;
         return arg0 != 45 ? null : new class699(arg1);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[7] + arg0 + ',' + (arg1 != null ? field7795[4] : field7795[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method496(Canvas arg0, int arg1, int arg2) {
      try {
         long var4;
         label37: {
            ++field7519;
            var4 = 0L;
            if (arg0 != null && this.field7533 != arg0) {
               if (!this.field7468.containsKey(arg0)) {
                  break label37;
               }

               Long var6 = (Long)this.field7468.get(arg0);
               var4 = var6;
               if (!client.field1481) {
                  break label37;
               }
            }

            var4 = this.field7547;
         }

         if (~var4 == -1L) {
            throw new RuntimeException();
         } else {
            this.field7599.surfaceResized(var4);
            if (this.field7455 == arg0) {
               this.method3976((byte)126);
            }
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field7795[214] + (arg0 != null ? field7795[4] : field7795[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(BII)V"
   )
   public final synchronized void method3980(byte arg0, int arg1, int arg2) {
      try {
         ++field7524;
         if (arg0 != 5) {
            this.method3994(false);
         }

         class278 var4 = new class278(arg2);
         var4.field9965 = (long)arg1;
         this.field7664.method279(false, var4);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7795[64] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "o",
      descriptor = "(I)V"
   )
   public final void method3981(int arg0) {
      try {
         ++field7520;
         OpenGL.glLightfv(16384, 4611, this.field7684, 0);
         if (arg0 != -31835) {
            this.method4040(false, 14, 5, true, (Buffer)null);
         }

         OpenGL.glLightfv(16385, 4611, this.field7718, 0);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(Lcha;Z)V"
   )
   public final void method3982(class184 arg0, boolean arg1) {
      try {
         ++field7630;
         OpenGL.glPushMatrix();
         if (!arg1) {
            this.method408();
         }

         OpenGL.glMultMatrixf(arg0.method1550(12941), 0);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[222] + (arg0 != null ? field7795[4] : field7795[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(ILjava/lang/String;)Ljava/lang/String;"
   )
   public static final String method3983(int arg0, String arg1) {
      boolean var2 = client.field1481;

      try {
         ++field7528;
         String var3 = null;
         if (arg0 != 768) {
            return null;
         } else {
            int var4 = arg1.indexOf(field7795[107]);
            if (~var4 <= -1) {
               var3 = arg1.substring(0, var4 + 4);
               arg1 = arg1.substring(var4 + 4);
            }

            if (arg1.startsWith(field7795[108])) {
               int var5 = arg1.indexOf(" ", field7795[108].length());
               if (var5 >= 0) {
                  int var6 = arg1.length();
                  arg1 = arg1.substring(0, var5) + " ";
                  int var7 = var5 + 1;
                  if (var2 || ~var6 < ~var7) {
                     do {
                        arg1 = arg1 + "*";
                        ++var7;
                     } while(~var6 < ~var7);
                  }
               }
            }

            return var3 == null ? arg1 : var3 + arg1;
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field7795[106] + arg0 + ',' + (arg1 != null ? field7795[4] : field7795[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "M",
      descriptor = "()I"
   )
   public final int method497() {
      try {
         ++field7632;
         int var1 = this.field7792;
         this.field7792 = 0;
         return var1;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[185] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "A",
      descriptor = "()Z"
   )
   public final boolean method500() {
      try {
         ++field7507;
         return true;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7795[50] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "c",
      descriptor = "()V"
   )
   public final void method481() {
      try {
         ++field7473;
         OpenGL.glFinish();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7795[151] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method3984(byte arg0) {
      try {
         int var2 = 56 / ((64 - arg0) / 54);
         ++field7583;
         if (this.field7669 != 16) {
            this.method3968(-126);
            this.method3957(true, 98);
            this.method4005(125, true);
            this.method4020(126, true);
            this.method4012(1, 69);
            this.field7669 = 16;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "c",
      descriptor = "(IIII)V"
   )
   public final void method3985(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg3 != 0) {
            this.field7730 = false;
         }

         OpenGL.glDrawArrays(arg2, arg0, arg1);
         ++field7635;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7795[219] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "d",
      descriptor = "(I)Lph;"
   )
   public final class789 method3986(int arg0) {
      try {
         ++field7550;
         if (arg0 != 3042) {
            return null;
         } else {
            return this.field7765 == null ? null : this.field7765.method1100(20341);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[135] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "c",
      descriptor = "(ZI)V"
   )
   public final void method3987(boolean arg0, int arg1) {
      try {
         if (arg1 <= 115) {
            this.method479(-112, -41, (int[])null, (int[])null);
         }

         ++field7505;
         if (arg0 == !this.field7716) {
            this.field7716 = arg0;
            this.method4023(4);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[67] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "Y",
      descriptor = "()[I"
   )
   public final int[] method419() {
      try {
         ++field7541;
         return new int[]{this.field7744, this.field7787, this.field7726, this.field7689};
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7795[193] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "j",
      descriptor = "(II)V"
   )
   public final void method3988(int arg0, int arg1) {
      try {
         if (this.field7693 != arg1) {
            OpenGL.glActiveTexture(arg1 + 33984);
            this.field7693 = arg1;
         }

         ++field7542;
         if (arg0 > -127) {
            this.field7687 = false;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[69] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method394(int arg0) {
      try {
         ++field7490;
         this.method4033((byte)89);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[120] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "l",
      descriptor = "(B)V"
   )
   private final void method3989(byte arg0) {
      try {
         if (arg0 < 72) {
            this.method442(127, -59, -60, -71, -91, -85, -117);
         }

         if (this.field7747) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field7747 = false;
         }

         ++field7621;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[73] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(IIIIIF)Lue;"
   )
   public final class243 method491(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      try {
         ++field7534;
         return new class558(arg0, arg1, arg2, arg3, arg4, arg5);
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field7795[24] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "v",
      descriptor = "(I)V"
   )
   private final void method3990(int arg0) {
      try {
         OpenGL.glLoadIdentity();
         ++field7451;
         OpenGL.glMultMatrixf(this.field7676.method1550(arg0 ^ -19140), 0);
         if (this.field7715) {
            this.field7631.field5322.method1972((byte)115);
         }

         this.method3981(-31835);
         this.method4034(true);
         if (arg0 != -30799) {
            this.method3992(123);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[201] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "aa",
      descriptor = "(IIIIII)V"
   )
   public final void method513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field7603;
         float var7 = (float)arg0 + 0.35F;
         float var8 = (float)arg1 + 0.35F;
         float var9 = (float)arg2 + var7;
         this.method3971((byte)93);
         float var10 = (float)arg3 + var8;
         this.method4012(arg5, -118);
         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         if (this.field7724) {
            OpenGL.glDisable(32925);
         }

         OpenGL.glBegin(7);
         OpenGL.glVertex2f(var7, var8);
         OpenGL.glVertex2f(var7, var10);
         OpenGL.glVertex2f(var9, var10);
         OpenGL.glVertex2f(var9, var8);
         OpenGL.glEnd();
         if (this.field7724) {
            OpenGL.glEnable(32925);
         }
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field7795[18] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(ILpl;)V"
   )
   public final void method3991(int arg0, class241 arg1) {
      try {
         ++field7483;
         if (arg0 <= this.field7655 && this.field7649[this.field7655] == arg1) {
            this.field7649[this.field7655--] = null;
            arg1.method1914(false);
            if (this.field7655 < 0) {
               this.field7654 = null;
            } else {
               this.field7654 = this.field7649[this.field7655];
               this.field7654.method1919((byte)89);
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[181] + arg0 + ',' + (arg1 != null ? field7795[4] : field7795[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "F",
      descriptor = "(II)V"
   )
   public final void method410(int arg0, int arg1) {
      try {
         ++field7435;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[55] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method470(Canvas arg0) {
      try {
         label36: {
            this.field7455 = null;
            ++field7480;
            this.field7443 = 0L;
            if (arg0 != null && this.field7533 != arg0) {
               if (!this.field7468.containsKey(arg0)) {
                  break label36;
               }

               Long var2 = (Long)this.field7468.get(arg0);
               this.field7443 = var2;
               this.field7455 = arg0;
               if (!client.field1481) {
                  break label36;
               }
            }

            this.field7443 = this.field7547;
            this.field7455 = this.field7533;
         }

         if (this.field7455 != null && ~this.field7443 != -1L) {
            this.field7599.setSurface(this.field7443);
            this.method3976((byte)109);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[166] + (arg0 != null ? field7795[4] : field7795[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "c",
      descriptor = "(II)I"
   )
   public final int method495(int arg0, int arg1) {
      try {
         ++field7450;
         return arg1 & arg0 ^ arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[202] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "s",
      descriptor = "()Z"
   )
   public final boolean method520() {
      try {
         ++field7529;
         return true;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7795[164] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "I",
      descriptor = "()I"
   )
   public final int method450() {
      try {
         ++field7537;
         int var1 = this.field7794;
         this.field7794 = 0;
         return var1;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[26] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(Lnh;)V"
   )
   public final void method508(class554 arg0) {
      try {
         ++field7590;
         this.field7628.method2445(this, -1, 119, arg0);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[190] + (arg0 != null ? field7795[4] : field7795[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "s",
      descriptor = "(I)V"
   )
   private final void method3992(int arg0) {
      try {
         ++field7606;
         this.field7737 = (float)(-this.field7761 + this.field7783) - this.field7749;
         this.field7725 = -((float)this.field7733 * this.field7745) + this.field7737;
         if (this.field7725 < (float)this.field7734) {
            this.field7725 = (float)this.field7734;
         }

         OpenGL.glFogf(2915, this.field7725);
         OpenGL.glFogf(2916, this.field7737);
         class425.field5782[2] = (float)class109.method974(255, this.field7770) / 255.0F;
         class425.field5782[1] = (float)class109.method974(this.field7770, 65280) / 65280.0F;
         class425.field5782[0] = (float)class109.method974(16711680, this.field7770) / 1.671168E7F;
         OpenGL.glFogfv(arg0, class425.field5782, 0);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[147] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method506(int arg0) {
      try {
         ++field7565;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[82] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(Llp;B)V"
   )
   public final void method3993(class83 arg0, byte arg1) {
      try {
         if (this.field7769 != arg0) {
            if (this.field7777) {
               OpenGL.glBindBufferARB(34962, arg0.method800((byte)-79));
            }

            this.field7769 = arg0;
         }

         ++field7576;
         int var3 = -101 % ((38 - arg1) / 39);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7795[174] + (arg0 != null ? field7795[4] : field7795[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "g",
      descriptor = "(Z)I"
   )
   private final int method3994(boolean arg0) {
      try {
         ++field7438;
         int var2 = 0;
         this.field7778 = OpenGL.glGetString(7936).toLowerCase();
         this.field7763 = OpenGL.glGetString(7937).toLowerCase();
         if (this.field7778.indexOf(field7795[102]) != -1) {
            var2 |= 1;
         }

         if (this.field7778.indexOf(field7795[89]) != -1 || ~this.field7778.indexOf(field7795[92]) != 0) {
            var2 |= 1;
         }

         label58: {
            String var3 = OpenGL.glGetString(7938);
            String[] var4 = class61.method549(var3.replace('.', ' '), ' ', !arg0);
            if (~var4.length <= -3) {
               try {
                  int var5 = class338.method2669(var4[0], (byte)-126);
                  int var6 = class338.method2669(var4[1], (byte)-126);
                  this.field7753 = var5 * 10 + var6;
                  break label58;
               } catch (NumberFormatException var9) {
                  var2 |= 4;
                  if (!client.field1481) {
                     break label58;
                  }
               }
            }

            var2 |= 4;
         }

         if (~this.field7753 > -13) {
            var2 |= 2;
         }

         if (!this.field7599.method229(field7795[96])) {
            var2 |= 8;
         }

         if (!this.field7599.method229(field7795[88])) {
            var2 |= 32;
         }

         int[] var7 = new int[1];
         OpenGL.glGetIntegerv(34018, var7, 0);
         this.field7717 = var7[0];
         OpenGL.glGetIntegerv(34929, var7, 0);
         this.field7746 = var7[0];
         OpenGL.glGetIntegerv(34930, var7, 0);
         this.field7752 = var7[0];
         if (~this.field7717 > -3 || this.field7746 < 2 || ~this.field7752 > -3) {
            var2 |= 16;
         }

         this.field7781 = Stream.method2990();
         this.field7736 = this.field7599.arePbuffersAvailable();
         this.field7777 = this.field7599.method229(field7795[101]);
         this.field7724 = this.field7599.method229(field7795[90]);
         this.field7688 = this.field7599.method229(field7795[103]);
         this.field7599.method229(field7795[95]);
         this.field7687 = this.field7599.method229(field7795[99]);
         this.field7759 = this.field7599.method229(field7795[94]);
         this.field7741 = this.field7599.method229(field7795[87]);
         this.field7695 = this.field7599.method229(field7795[98]);
         this.field7697 = this.field7599.method229(field7795[104]);
         this.field7685 = this.field7599.method229(field7795[86]);
         this.field7760 = arg0;
         this.field7780 = this.field7599.method229(field7795[97]);
         this.field7730 = this.field7599.method229(field7795[91]);
         this.field7739 = this.field7599.method229(field7795[100]);
         this.field7762 = this.field7739 & this.field7730;
         this.field7711 = class579.field8571.startsWith(field7795[85]);
         OpenGL.glGetFloatv(2834, class425.field5782, 0);
         this.field7754 = class425.field5782[0];
         this.field7686 = class425.field5782[1];
         return var2 != 0 ? var2 : 0;
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field7795[93] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "b",
      descriptor = "(Lpl;B)V"
   )
   public final void method3995(class241 arg0, byte arg1) {
      try {
         if (arg1 != -29) {
            this.method500();
         }

         ++field7560;
         if (!this.field7730) {
            if (this.field7650 >= 0 && this.field7651[this.field7650] == arg0) {
               this.field7651[this.field7650--] = null;
               arg0.method1917(122);
               if (this.field7650 < 0) {
                  this.field7654 = this.field7653 = null;
               } else {
                  this.field7654 = this.field7653 = this.field7651[this.field7650];
                  this.field7654.method1915(28366);
               }
            } else {
               throw new RuntimeException();
            }
         } else {
            this.method3991(0, arg0);
            this.method3961(-9, arg0);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[35] + (arg0 != null ? field7795[4] : field7795[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "u",
      descriptor = "(I)V"
   )
   public final void method3996(int arg0) {
      try {
         ++field7556;
         if (arg0 != 11376) {
            this.field7759 = true;
         }

         if (this.field7669 != 4) {
            this.method4036((byte)-58);
            this.method3957(false, arg0 ^ 11276);
            this.method4016(false, -15655);
            this.method4005(125, false);
            this.method4020(-58, false);
            this.method4030(-2, true);
            this.method4012(1, -113);
            this.field7669 = 4;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[133] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V"
   )
   public final void method434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class87 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      boolean var13 = client.field1481;

      try {
         ++field7608;
         if (~arg0 != ~arg2 || arg1 != arg3) {
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
               class229 var14 = (class229)arg6;
               class124 var15 = var14.field2864;
               this.method4008(-2);
               this.method4006(var14.field2864, (byte)-123);
               this.method4012(arg5, -119);
               this.method4022(8448, 34161, 7681);
               this.method3959(-57, 768, 34167, 0);
               var16 = var15.field1623 / (float)var15.field1624;
               var17 = var15.field1621 / (float)var15.field1620;
               float var18 = (float)(-arg0) + (float)arg2;
               float var19 = (float)(-arg1) + (float)arg3;
               float var20 = (float)(1.0D / Math.sqrt((double)(var18 * var18 + var19 * var19)));
               int var35 = arg11 % (arg10 - -arg9);
               var21 = var18 * var20;
               OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
               var22 = var19 * var20;
               var23 = (float)arg9 * var21;
               var24 = (float)arg9 * var22;
               var25 = 0.0F;
               var26 = 0.0F;
               var27 = var23;
               var28 = var24;
               if (var35 <= arg9) {
                  var28 = (float)(-var35 + arg9) * var22;
                  var27 = (float)(-var35 + arg9) * var21;
                  if (!var13) {
                     break label87;
                  }
               }

               var26 = (float)(-var35 + arg9 - -arg10) * var22;
               var25 = (float)(arg9 + arg10 + -var35) * var21;
            }

            float var29 = (float)arg0 + 0.35F + var25;
            float var30 = (float)arg1 + 0.35F + var26;
            float var31 = (float)arg10 * var21;
            float var32 = (float)arg10 * var22;

            do {
               label94: {
                  int var10000;
                  label78: {
                     if (arg2 > arg0) {
                        float var36;
                        var10000 = (var36 = (float)arg2 + 0.35F - var29) == 0.0F ? 0 : (var36 < 0.0F ? -1 : 1);
                        if (var13) {
                           break label78;
                        }

                        if (var10000 < 0) {
                           break;
                        }

                        if (!((float)arg2 < var27 + var29)) {
                           break label94;
                        }

                        var27 = (float)arg2 - var29;
                        if (!var13) {
                           break label94;
                        }
                     }

                     float var37;
                     var10000 = (var37 = var29 - ((float)arg2 + 0.35F)) == 0.0F ? 0 : (var37 < 0.0F ? -1 : 1);
                  }

                  if (var10000 < 0) {
                     break;
                  }

                  if ((float)arg2 > var27 + var29) {
                     var27 = (float)arg2 + -var29;
                  }
               }

               label96: {
                  if (~arg3 < ~arg1) {
                     if ((float)arg3 + 0.35F < var30) {
                        break;
                     }

                     if (!(var28 + var30 > (float)arg3)) {
                        break label96;
                     }

                     var28 = (float)arg3 - var30;
                     if (!var13) {
                        break label96;
                     }
                  }

                  if ((float)arg3 + 0.35F > var30) {
                     break;
                  }

                  if ((float)arg3 > var28 + var30) {
                     var28 = (float)arg3 + -var30;
                  }
               }

               OpenGL.glBegin(1);
               OpenGL.glTexCoord2f(((float)(-arg7) + var29) * var16, ((float)(-arg8) + var30) * var17);
               OpenGL.glVertex2f(var29, var30);
               OpenGL.glTexCoord2f((var27 + var29 - (float)arg7) * var16, (var28 + var30 + (float)(-arg8)) * var17);
               OpenGL.glVertex2f(var27 + var29, var28 + var30);
               var30 += var28 + var32;
               OpenGL.glEnd();
               var29 += var27 + var31;
               var28 = var24;
               var27 = var23;
            } while(!var13);

            this.method3959(-60, 768, 5890, 0);
         }
      } catch (RuntimeException var34) {
         throw class93.method866(var34, field7795[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field7795[4] : field7795[2]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(Lwe;I)V"
   )
   public final void method3997(class133 arg0, int arg1) {
      try {
         if (this.field7723 != arg0) {
            if (this.field7777) {
               OpenGL.glBindBufferARB(34963, arg0.method1120((byte)65));
            }

            this.field7723 = arg0;
         }

         if (arg1 == 8) {
            ++field7493;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[130] + (arg0 != null ? field7795[4] : field7795[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "c",
      descriptor = "(III)V"
   )
   public final synchronized void method3998(int arg0, int arg1, int arg2) {
      try {
         ++field7571;
         class278 var4 = new class278(arg2);
         if (arg0 != 1) {
            this.method4021(9);
         }

         var4.field9965 = (long)arg1;
         this.field7661.method279(false, var4);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7795[177] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "d",
      descriptor = "(III)V"
   )
   public final void method3999(int arg0, int arg1, int arg2) {
      try {
         if (arg0 <= -35) {
            this.field7698 = arg2;
            this.field7699 = arg1;
            ++field7525;
            this.method4018((byte)102);
            this.method3970(92);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7795[68] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "b",
      descriptor = "(IIIIZ)Lpd;"
   )
   public final class648 method414(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         ++field7433;
         return new class302(this, arg0, arg1, arg2, arg3);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field7795[58] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(FB)V"
   )
   public final void method4000(float arg0, byte arg1) {
      try {
         if (arg1 != 19) {
            this.method4009(32, 81);
         }

         ++field7577;
         if (this.field7703 != arg0) {
            this.field7703 = arg0;
            if (this.field7692 == 3) {
               this.method4014(5889);
               return;
            }
         }

      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[65] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "p",
      descriptor = "()Lkia;"
   )
   public final class93 method396() {
      try {
         ++field7514;
         return this.field7638;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7795[199] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public final void method456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      boolean var10 = client.field1481;

      try {
         ++field7554;
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
               this.method3971((byte)93);
               this.method4012(arg5, -21);
               float var11 = (float)(-arg0) + (float)arg2;
               float var12 = (float)(-arg1) + (float)arg3;
               float var13 = (float)(1.0D / Math.sqrt((double)(var11 * var11 + var12 * var12)));
               OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
               var14 = var12 * var13;
               var15 = var11 * var13;
               int var28 = arg8 % (arg7 - -arg6);
               var16 = (float)arg6 * var15;
               var17 = (float)arg6 * var14;
               var18 = 0.0F;
               var19 = 0.0F;
               var20 = var16;
               var21 = var17;
               if (~arg6 > ~var28) {
                  var19 = (float)(arg6 - -arg7 + -var28) * var14;
                  var18 = (float)(arg6 - var28 + arg7) * var15;
                  if (!var10) {
                     break label79;
                  }
               }

               var20 = (float)(-var28 + arg6) * var15;
               var21 = (float)(arg6 - var28) * var14;
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
                     var10000 = (var30 = (float)arg2 + 0.35F - var22) == 0.0F ? 0 : (var30 < 0.0F ? -1 : 1);
                  }

                  if (var10000 < 0) {
                     break;
                  }

                  if ((float)arg2 < var20 + var22) {
                     var20 = (float)arg2 + -var22;
                  }
               }

               label88: {
                  if (arg3 <= arg1) {
                     if (var23 < (float)arg3 + 0.35F) {
                        break;
                     }

                     if (!(var21 + var23 < (float)arg3)) {
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
                     var21 = (float)arg3 - var23;
                  }
               }

               OpenGL.glBegin(1);
               OpenGL.glVertex2f(var22, var23);
               OpenGL.glVertex2f(var20 + var22, var21 + var23);
               var23 += var21 + var25;
               var22 += var20 + var24;
               OpenGL.glEnd();
               var20 = var16;
               var21 = var17;
            } while(!var10);

         }
      } catch (RuntimeException var27) {
         throw class93.method866(var27, field7795[34] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(FIFFF)V"
   )
   public final void method4001(float arg0, int arg1, float arg2, float arg3, float arg4) {
      try {
         ++field7526;
         class425.field5782[1] = arg3;
         if (arg1 != 29361) {
            this.method3987(false, -24);
         }

         class425.field5782[0] = arg0;
         class425.field5782[2] = arg4;
         class425.field5782[3] = arg2;
         OpenGL.glTexEnvfv(8960, 8705, class425.field5782, 0);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field7795[28] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(IFF)V"
   )
   public final void method4002(int arg0, float arg1, float arg2) {
      try {
         this.field7749 = arg1;
         if (arg0 != 8448) {
            this.method4025(-100, -49, 124);
         }

         ++field7548;
         this.field7745 = arg2;
         this.method3992(2918);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7795[198] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method501(boolean arg0) {
      try {
         ++field7494;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[105] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "f",
      descriptor = "(Z)V"
   )
   public static void method4003(boolean arg0) {
      try {
         if (arg0) {
            field7543 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7795[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "r",
      descriptor = "(IIIIIII)I"
   )
   public final int method442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field1481;

      try {
         int var11;
         label81: {
            ++field7461;
            float var9 = (float)arg2 * this.field7672.field2351 + (float)arg0 * this.field7672.field2339 + (float)arg1 * this.field7672.field2356 + this.field7672.field2357;
            float var10 = (float)arg5 * this.field7672.field2351 + (float)arg3 * this.field7672.field2339 + (float)arg4 * this.field7672.field2356 + this.field7672.field2357;
            var11 = 0;
            if (!(var9 < (float)this.field7734) || !(var10 < (float)this.field7734)) {
               if (!((float)this.field7783 < var9) || !((float)this.field7783 < var10)) {
                  break label81;
               }

               var11 |= 32;
               if (!var8) {
                  break label81;
               }
            }

            var11 |= 16;
         }

         label82: {
            int var12 = (int)(((float)arg2 * this.field7672.field2332 + (float)arg0 * this.field7672.field2349 + (float)arg1 * this.field7672.field2342 + this.field7672.field2348) * (float)this.field7726 / (float)arg6);
            int var13 = (int)(((float)arg5 * this.field7672.field2332 + (float)arg3 * this.field7672.field2349 + (float)arg4 * this.field7672.field2342 + this.field7672.field2348) * (float)this.field7726 / (float)arg6);
            if (!((float)var12 < this.field7758) || !(this.field7758 > (float)var13)) {
               if (!(this.field7709 < (float)var12) || !(this.field7709 < (float)var13)) {
                  break label82;
               }

               var11 |= 2;
               if (!var8) {
                  break label82;
               }
            }

            var11 |= 1;
         }

         int var14 = (int)(((float)arg2 * this.field7672.field2353 + (float)arg0 * this.field7672.field2352 + (float)arg1 * this.field7672.field2331 + this.field7672.field2363) * (float)this.field7689 / (float)arg6);
         int var15 = (int)(((float)arg5 * this.field7672.field2353 + (float)arg3 * this.field7672.field2352 + (float)arg4 * this.field7672.field2331 + this.field7672.field2363) * (float)this.field7689 / (float)arg6);
         if (!((float)var14 < this.field7750) || !(this.field7750 > (float)var15)) {
            if (!((float)var14 > this.field7779) || !(this.field7779 < (float)var15)) {
               return var11;
            }

            var11 |= 8;
            if (!var8) {
               return var11;
            }
         }

         var11 |= 4;
         return var11;
      } catch (RuntimeException var17) {
         throw class93.method866(var17, field7795[157] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "d",
      descriptor = "(Z)V"
   )
   private final void method4004(boolean arg0) {
      try {
         class425.field5782[2] = this.field7742 * this.field7706;
         class425.field5782[3] = 1.0F;
         ++field7578;
         class425.field5782[0] = this.field7742 * this.field7722;
         class425.field5782[1] = this.field7742 * this.field7713;
         OpenGL.glLightfv(16384, 4609, class425.field5782, 0);
         class425.field5782[3] = 1.0F;
         class425.field5782[2] = -this.field7728 * this.field7706;
         class425.field5782[0] = -this.field7728 * this.field7722;
         class425.field5782[1] = -this.field7728 * this.field7713;
         OpenGL.glLightfv(16385, 4609, class425.field5782, 0);
         if (!arg0) {
            this.field7638 = null;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[230] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(Lkc;Lkc;FLkc;)Lkc;"
   )
   public final class72 method407(class72 arg0, class72 arg1, float arg2, class72 arg3) {
      try {
         ++field7515;
         if (arg0 != null && arg1 != null && this.field7697 && this.field7780) {
            class396 var5 = null;
            class743 var6 = (class743)arg0;
            class743 var7 = (class743)arg1;
            class789 var8 = var6.method1100(20341);
            class789 var9 = var7.method1100(20341);
            if (var8 != null && var9 != null) {
               int var10 = var9.field11498 >= var8.field11498 ? var9.field11498 : var8.field11498;
               if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class396) {
                  class396 var11 = (class396)arg3;
                  if (~var10 == ~var11.method3119(2)) {
                     var5 = var11;
                  }
               }

               if (var5 == null) {
                  var5 = new class396(this, var10);
               }

               if (var5.method3120(var8, (byte)-122, var9, arg2)) {
                  return var5;
               }
            }
         }

         return arg2 < 0.5F ? arg0 : arg1;
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field7795[149] + (arg0 != null ? field7795[4] : field7795[2]) + ',' + (arg1 != null ? field7795[4] : field7795[2]) + ',' + arg2 + ',' + (arg3 != null ? field7795[4] : field7795[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "()Z"
   )
   public final boolean method399() {
      try {
         ++field7601;
         return this.field7633 != null && this.field7633.method317((byte)110);
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7795[134] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method395(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field7500;
         this.field7634.method5213(arg1, arg3, arg0, 103, arg2);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7795[168] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method416(int[] arg0) {
      try {
         arg0[1] = this.field7615;
         ++field7625;
         arg0[0] = this.field7453;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[175] + (arg0 != null ? field7795[4] : field7795[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(IIIIIILaa;II)V"
   )
   public final void method454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class87 arg6, int arg7, int arg8) {
      try {
         ++field7596;
         class229 var10 = (class229)arg6;
         class124 var11 = var10.field2864;
         this.method4008(-2);
         this.method4006(var10.field2864, (byte)-121);
         this.method4012(arg5, -127);
         this.method4022(8448, 34161, 7681);
         this.method3959(-72, 768, 34167, 0);
         float var12 = var11.field1623 / (float)var11.field1624;
         float var13 = var11.field1621 / (float)var11.field1620;
         float var14 = (float)(-arg0) + (float)arg2;
         float var15 = (float)(-arg1) + (float)arg3;
         float var16 = (float)(1.0D / Math.sqrt((double)(var14 * var14 + var15 * var15)));
         float var17 = var15 * var16;
         float var18 = var14 * var16;
         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         OpenGL.glBegin(1);
         OpenGL.glTexCoord2f((float)(-arg7 + arg0) * var12, (float)(-arg8 + arg1) * var13);
         OpenGL.glVertex2f((float)arg0 + 0.35F, (float)arg1 + 0.35F);
         OpenGL.glTexCoord2f((float)(-arg7 + arg2) * var12, (float)(-arg8 + arg3) * var13);
         OpenGL.glVertex2f((float)arg2 + var18 + 0.35F, (float)arg3 + var17 + 0.35F);
         OpenGL.glEnd();
         this.method3959(-54, 768, 5890, 0);
      } catch (RuntimeException var20) {
         throw class93.method866(var20, field7795[217] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field7795[4] : field7795[2]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method4005(int arg0, boolean arg1) {
      try {
         ++field7521;
         if (arg0 < 88) {
            this.field7755 = -1.3345907F;
         }

         if (!this.field7667 != !arg1) {
            label32: {
               if (!arg1) {
                  OpenGL.glDisable(2929);
                  if (!client.field1481) {
                     break label32;
                  }
               }

               OpenGL.glEnable(2929);
            }

            this.field7667 = arg1;
            this.field7669 &= -32;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[196] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(Lll;B)V"
   )
   public final void method4006(class549 arg0, byte arg1) {
      boolean var3 = client.field1481;

      try {
         ++field7536;
         class549 var4 = this.field7683[this.field7693];
         if (arg0 != var4) {
            label46: {
               if (arg0 == null) {
                  OpenGL.glDisable(var4.field8090);
                  if (!var3) {
                     break label46;
                  }
               }

               label38: {
                  if (var4 == null) {
                     OpenGL.glEnable(arg0.field8090);
                     if (!var3) {
                        break label38;
                     }
                  }

                  if (arg0.field8090 != var4.field8090) {
                     OpenGL.glDisable(var4.field8090);
                     OpenGL.glEnable(arg0.field8090);
                  }
               }

               OpenGL.glBindTexture(arg0.field8090, arg0.method4156(0));
            }

            this.field7683[this.field7693] = arg0;
         }

         this.field7669 &= -2;
         int var5 = 113 % ((arg1 - -82) / 39);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field7795[180] + (arg0 != null ? field7795[4] : field7795[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(Lza;)V"
   )
   public final void method483(class735 arg0) {
      try {
         this.field7646 = ((class353)arg0).field4939;
         ++field7456;
         if (this.field7721 == null) {
            class771 var2;
            label26: {
               var2 = new class771(80);
               if (this.field7781) {
                  var2.method5558(-1.0F, 8511);
                  var2.method5558(-1.0F, 8511);
                  var2.method5558(0.0F, 8511);
                  var2.method5558(0.0F, 8511);
                  var2.method5558(1.0F, 8511);
                  var2.method5558(1.0F, 8511);
                  var2.method5558(-1.0F, 8511);
                  var2.method5558(0.0F, 8511);
                  var2.method5558(1.0F, 8511);
                  var2.method5558(1.0F, 8511);
                  var2.method5558(1.0F, 8511);
                  var2.method5558(1.0F, 8511);
                  var2.method5558(0.0F, 8511);
                  var2.method5558(1.0F, 8511);
                  var2.method5558(0.0F, 8511);
                  var2.method5558(-1.0F, 8511);
                  var2.method5558(1.0F, 8511);
                  var2.method5558(0.0F, 8511);
                  var2.method5558(0.0F, 8511);
                  var2.method5558(0.0F, 8511);
                  if (!client.field1481) {
                     break label26;
                  }
               }

               var2.method5560(-1.0F, 636827368);
               var2.method5560(-1.0F, 636827368);
               var2.method5560(0.0F, 636827368);
               var2.method5560(0.0F, 636827368);
               var2.method5560(1.0F, 636827368);
               var2.method5560(1.0F, 636827368);
               var2.method5560(-1.0F, 636827368);
               var2.method5560(0.0F, 636827368);
               var2.method5560(1.0F, 636827368);
               var2.method5560(1.0F, 636827368);
               var2.method5560(1.0F, 636827368);
               var2.method5560(1.0F, 636827368);
               var2.method5560(0.0F, 636827368);
               var2.method5560(1.0F, 636827368);
               var2.method5560(0.0F, 636827368);
               var2.method5560(-1.0F, 636827368);
               var2.method5560(1.0F, 636827368);
               var2.method5560(0.0F, 636827368);
               var2.method5560(0.0F, 636827368);
               var2.method5560(0.0F, 636827368);
            }

            this.field7721 = this.method4024(1, var2.field864, var2.field859, false, 20);
            this.field7729 = new class71(this.field7721, 5126, 3, 0);
            this.field7727 = new class71(this.field7721, 5126, 2, 12);
            this.field7628.method2448(this, (byte)70);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[121] + (arg0 != null ? field7795[4] : field7795[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(BZZI)V"
   )
   public final void method4007(byte arg0, boolean arg1, boolean arg2, int arg3) {
      boolean var5 = client.field1481;

      try {
         if (arg0 > -101) {
            this.method3978(-49);
         }

         ++field7613;
         if (this.field7782 != arg3 || this.field7715 == !this.field7740) {
            class266 var6;
            int var7;
            byte var8;
            int var9;
            int var10;
            label71: {
               var6 = null;
               var7 = 0;
               var8 = 0;
               var9 = 0;
               var10 = !this.field7740 ? 0 : 3;
               if (~arg3 > -1) {
                  this.method3989((byte)83);
                  if (!var5) {
                     break label71;
                  }
               }

               class668 var11;
               label81: {
                  var6 = this.field7637.method5639(false, arg3);
                  var11 = super.field6667.method911(arg3, 96);
                  if (var11.field9905 != 0 || var11.field9909 != 0) {
                     int var12 = !var11.field9901 ? 128 : 64;
                     int var13 = var12 * 50;
                     this.method3973(0.0F, (float)(this.field7640 % var13 * var11.field9909) / (float)var13, (float)(this.field7640 % var13 * var11.field9905) / (float)var13, (byte)102);
                     if (!var5) {
                        break label81;
                     }
                  }

                  this.method3989((byte)95);
               }

               var7 = var11.field9904;
               if (!this.field7740) {
                  var9 = var11.field9895;
                  var8 = var11.field9889;
                  var10 = var11.field9911;
               }
            }

            this.field7631.method3033(arg2, var8, arg1, var9, var10, -118);
            if (!this.field7631.method3037(var7, 26449, var6)) {
               this.method4006(var6, (byte)85);
               this.method4009(var7, 1);
            }

            this.field7782 = arg3;
            this.field7715 = this.field7740;
         }

         this.field7669 &= -8;
      } catch (RuntimeException var15) {
         throw class93.method866(var15, field7795[182] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method432(boolean arg0) {
      try {
         ++field7527;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[165] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "n",
      descriptor = "(I)V"
   )
   public final void method4008(int arg0) {
      try {
         if (this.field7669 != 2) {
            this.method4036((byte)-105);
            this.method3957(false, 116);
            this.method4016(false, -15655);
            this.method4005(101, false);
            this.method4020(-89, false);
            this.method4030(-2, true);
            this.field7669 = 2;
         }

         if (arg0 == -2) {
            ++field7589;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[52] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "g",
      descriptor = "(II)V"
   )
   public final void method4009(int arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         label52: {
            ++field7607;
            if (~arg0 == -2) {
               this.method4022(7681, 34161, 7681);
               if (!var3) {
                  break label52;
               }
            }

            if (arg0 != 0) {
               if (~arg0 != -3) {
                  if (~arg0 != -4) {
                     if (arg0 != 4) {
                        break label52;
                     }

                     this.method4022(34023, arg1 ^ 34160, 34023);
                     if (!var3) {
                        break label52;
                     }
                  }

                  this.method4022(8448, arg1 + 34160, 260);
                  if (!var3) {
                     break label52;
                  }
               }

               this.method4022(7681, 34161, 34165);
               if (!var3) {
                  break label52;
               }
            }

            this.method4022(8448, 34161, 8448);
         }

         if (arg1 != 1) {
            this.field7783 = -59;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7795[72] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "XA",
      descriptor = "()I"
   )
   public final int method499() {
      try {
         ++field7427;
         return this.field7783;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7795[81] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "da",
      descriptor = "(III[I)V"
   )
   public final void method451(int arg0, int arg1, int arg2, int[] arg3) {
      try {
         ++field7454;
         float var5 = (float)arg2 * this.field7672.field2351 + (float)arg0 * this.field7672.field2339 + (float)arg1 * this.field7672.field2356 + this.field7672.field2357;
         if (!((float)this.field7734 > var5) && !(var5 > (float)this.field7783)) {
            int var6 = (int)(((float)arg2 * this.field7672.field2332 + (float)arg0 * this.field7672.field2349 + (float)arg1 * this.field7672.field2342 + this.field7672.field2348) * (float)this.field7726 / var5);
            int var7 = (int)(((float)arg2 * this.field7672.field2353 + (float)arg0 * this.field7672.field2352 + (float)arg1 * this.field7672.field2331 + this.field7672.field2363) * (float)this.field7689 / var5);
            if ((float)var6 >= this.field7758 && (float)var6 <= this.field7709 && (float)var7 >= this.field7750 && this.field7779 >= (float)var7) {
               arg3[0] = (int)((float)var6 + -this.field7758);
               arg3[2] = (int)var5;
               arg3[1] = (int)((float)var7 - this.field7750);
            } else {
               arg3[0] = arg3[1] = arg3[2] = -1;
            }
         } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field7795[63] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7795[4] : field7795[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "f",
      descriptor = "(II)V"
   )
   public final void method406(int arg0, int arg1) {
      try {
         if (this.field7734 != arg0 || ~this.field7783 != ~arg1) {
            label31: {
               this.field7783 = arg1;
               this.field7734 = arg0;
               this.method4026((byte)121);
               this.method3992(2918);
               if (this.field7692 == 3) {
                  this.method4014(5889);
                  if (!client.field1481) {
                     break label31;
                  }
               }

               if (~this.field7692 == -3) {
                  this.method4039(-122);
               }
            }
         }

         ++field7562;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[32] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "KA",
      descriptor = "(IIII)V"
   )
   public final void method460(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg0 < 0) {
            arg0 = 0;
         }

         ++field7510;
         if (arg1 < 0) {
            arg1 = 0;
         }

         if (~arg2 < ~this.field7453) {
            arg2 = this.field7453;
         }

         if (~this.field7615 > ~arg3) {
            arg3 = this.field7615;
         }

         this.field7768 = arg0;
         this.field7788 = arg1;
         this.field7705 = arg2;
         this.field7775 = arg3;
         OpenGL.glEnable(3089);
         this.method4037(5889);
         this.method3970(-127);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7795[178] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "b",
      descriptor = "()I"
   )
   public final int method487() {
      try {
         ++field7595;
         return 4;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7795[189] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "m",
      descriptor = "(I)V"
   )
   private final void method4010(int arg0) {
      boolean var2 = client.field1481;

      try {
         ++field7569;
         this.method4030(-2, true);
         int var3 = this.field7717 + -1;
         if (var2) {
            this.method3988(-128, var3);
            this.method4006((class549)null, (byte)-125);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            --var3;
         }

         while(true) {
            while(var3 >= 0) {
               this.method3988(-128, var3);
               this.method4006((class549)null, (byte)-125);
               OpenGL.glTexEnvi(8960, 8704, 34160);
               --var3;
            }

            this.method4022(8448, arg0 ^ -60698, 8448);
            this.method3959(-95, 770, 34168, 2);
            this.method3989((byte)117);
            this.field7675 = 1;
            OpenGL.glEnable(3042);
            OpenGL.glBlendFunc(770, 771);
            this.field7674 = 1;
            OpenGL.glEnable(3008);
            OpenGL.glAlphaFunc(516, 0.0F);
            if (!var2) {
               if (arg0 != -26729) {
                  this.method402((class65)null, false);
               }

               this.field7671 = true;
               OpenGL.glColorMask(true, true, true, true);
               this.field7670 = true;
               this.method3957(true, 123);
               this.method4016(true, arg0 ^ 21838);
               this.method4005(94, true);
               this.method4020(-106, true);
               this.method3967((byte)-38);
               this.field7599.setSwapInterval(0);
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
               int var6;
               if (var2) {
                  var6 = 16384 + var5;
                  OpenGL.glLightfv(var6, 4608, var4, 0);
                  OpenGL.glLightf(var6, 4615, 0.0F);
                  OpenGL.glLightf(var6, 4616, 0.0F);
                  ++var5;
               }

               while(true) {
                  short var10000;
                  int var10001;
                  if (var5 >= 8) {
                     OpenGL.glEnable(16384);
                     OpenGL.glEnable(16385);
                     OpenGL.glFogf(2914, 0.95F);
                     OpenGL.glFogi(2917, 9729);
                     var10000 = 3156;
                     var10001 = 4353;
                     if (!var2) {
                        OpenGL.glHint(3156, 4353);
                        this.field7731 = this.field7770 = -1;
                        this.method443();
                        return;
                     }
                  } else {
                     var10000 = 16384;
                     var10001 = var5;
                  }

                  var6 = var10000 + var10001;
                  OpenGL.glLightfv(var6, 4608, var4, 0);
                  OpenGL.glLightf(var6, 4615, 0.0F);
                  OpenGL.glLightf(var6, 4616, 0.0F);
                  ++var5;
               }
            }

            OpenGL.glTexEnvi(arg0, -26729, 34160);
            --var3;
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field7795[218] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "P",
      descriptor = "(IIIII)V"
   )
   public final void method463(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.method3971((byte)93);
         ++field7512;
         this.method4012(arg4, 91);
         float var6 = (float)arg0 + 0.35F;
         float var7 = (float)arg1 + 0.35F;
         OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
         OpenGL.glBegin(1);
         OpenGL.glVertex2f(var6, var7);
         OpenGL.glVertex2f(var6, (float)arg2 + var7);
         OpenGL.glEnd();
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field7795[118] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "k",
      descriptor = "(II)V"
   )
   public final void method4011(int arg0, int arg1) {
      try {
         class425.field5782[3] = (float)(arg0 >>> 24) / 255.0F;
         class425.field5782[1] = (float)class109.method974(arg0, 65280) / 65280.0F;
         class425.field5782[arg1] = (float)class109.method974(255, arg0) / 255.0F;
         class425.field5782[0] = (float)class109.method974(arg0, 16711680) / 1.671168E7F;
         ++field7593;
         OpenGL.glTexEnvfv(8960, 8705, class425.field5782, 0);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[79] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "i",
      descriptor = "(II)V"
   )
   public final void method4012(int arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         int var4 = 123 / ((-68 - arg1) / 45);
         ++field7610;
         if (~this.field7675 != ~arg0) {
            byte var5;
            boolean var6;
            boolean var7;
            label88: {
               if (~arg0 != -2) {
                  if (arg0 != 2) {
                     if (arg0 == 128) {
                        var5 = 3;
                        var6 = true;
                        var7 = true;
                        if (!var3) {
                           break label88;
                        }
                     }

                     var7 = false;
                     var5 = 0;
                     var6 = true;
                     if (!var3) {
                        break label88;
                     }
                  }

                  var6 = true;
                  var5 = 2;
                  var7 = false;
                  if (!var3) {
                     break label88;
                  }
               }

               var5 = 1;
               var6 = true;
               var7 = true;
            }

            if (var6 == !this.field7670) {
               OpenGL.glColorMask(var6, var6, var6, true);
               this.field7670 = var6;
            }

            if (this.field7671 == !var7) {
               label71: {
                  if (var7) {
                     OpenGL.glEnable(3008);
                     if (!var3) {
                        break label71;
                     }
                  }

                  OpenGL.glDisable(3008);
               }

               this.field7671 = var7;
            }

            if (this.field7674 != var5) {
               label64: {
                  if (var5 != 1) {
                     if (~var5 != -3) {
                        if (var5 == 3) {
                           OpenGL.glEnable(3042);
                           OpenGL.glBlendFunc(774, 1);
                           if (!var3) {
                              break label64;
                           }
                        }

                        OpenGL.glDisable(3042);
                        if (!var3) {
                           break label64;
                        }
                     }

                     OpenGL.glEnable(3042);
                     OpenGL.glBlendFunc(1, 1);
                     if (!var3) {
                        break label64;
                     }
                  }

                  OpenGL.glEnable(3042);
                  OpenGL.glBlendFunc(770, 771);
               }

               this.field7674 = var5;
            }

            this.field7675 = arg0;
            this.field7669 &= -29;
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field7795[216] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "B",
      descriptor = "(I)V"
   )
   private final void method4013(int arg0) {
      try {
         ++field7597;
         if (arg0 != 2912) {
            this.method3969(120, -70, (byte)116, -60);
         }

         if (this.field7774 && ~this.field7733 <= -1) {
            OpenGL.glEnable(2912);
         } else {
            OpenGL.glDisable(2912);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[211] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "r",
      descriptor = "()Z"
   )
   public final boolean method515() {
      try {
         ++field7532;
         return false;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7795[187] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "z",
      descriptor = "(I)V"
   )
   private final void method4014(int arg0) {
      try {
         ++field7503;
         float var2 = (float)(-this.field7744) * this.field7703 / (float)this.field7726;
         float var3 = (float)(-this.field7787) * this.field7703 / (float)this.field7689;
         float var4 = (float)(-this.field7744 + this.field7453) * this.field7703 / (float)this.field7726;
         float var5 = (float)(-this.field7787 + this.field7615) * this.field7703 / (float)this.field7689;
         OpenGL.glMatrixMode(arg0);
         OpenGL.glLoadIdentity();
         if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double)var2, (double)var4, (double)(-var5), (double)(-var3), (double)this.field7734, (double)this.field7783);
         }

         OpenGL.glMatrixMode(5888);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field7795[46] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method473(Canvas arg0) {
      try {
         ++field7486;
         if (this.field7533 == arg0) {
            throw new RuntimeException();
         } else if (this.field7468.containsKey(arg0)) {
            Long var2 = (Long)this.field7468.get(arg0);
            this.field7599.releaseSurface(arg0, var2);
            this.field7468.remove(arg0);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[14] + (arg0 != null ? field7795[4] : field7795[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(FFF)V"
   )
   public final void method405(float arg0, float arg1, float arg2) {
      try {
         class620.field9178 = arg0;
         class647.field9685 = arg2;
         ++field7522;
         class465.field6405 = arg1;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7795[213] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(IIZI[B)Lwe;"
   )
   public final class133 method4015(int arg0, int arg1, boolean arg2, int arg3, byte[] arg4) {
      try {
         ++field7474;
         if (arg1 != 2) {
            return null;
         } else {
            return (class133)(!this.field7777 || arg2 && !this.field7704 ? new class750(this, arg3, arg4, arg0) : new class780(this, arg3, arg4, arg0, arg2));
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field7795[83] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field7795[4] : field7795[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "xa",
      descriptor = "(F)V"
   )
   public final void method428(float arg0) {
      try {
         ++field7616;
         if (this.field7732 != arg0) {
            this.field7732 = arg0;
            this.method4021(31541);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[111] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method4016(boolean arg0, int arg1) {
      try {
         if (arg1 != -15655) {
            this.method518();
         }

         ++field7459;
         if (!arg0 == this.field7679) {
            this.field7679 = arg0;
            this.method4023(arg1 ^ -15651);
            this.field7669 &= -8;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[62] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "JA",
      descriptor = "(IIIIII)I"
   )
   public final int method457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var7 = client.field1481;

      try {
         ++field7619;
         int var8 = 0;
         float var9 = (float)arg2 * this.field7672.field2351 + (float)arg0 * this.field7672.field2339 + (float)arg1 * this.field7672.field2356 + this.field7672.field2357;
         if (var9 < 1.0F) {
            var9 = 1.0F;
         }

         float var10 = (float)arg5 * this.field7672.field2351 + (float)arg3 * this.field7672.field2339 + (float)arg4 * this.field7672.field2356 + this.field7672.field2357;
         if (var10 < 1.0F) {
            var10 = 1.0F;
         }

         label67: {
            if (var9 < (float)this.field7734 && var10 < (float)this.field7734) {
               var8 |= 16;
               if (!var7) {
                  break label67;
               }
            }

            if (var9 > (float)this.field7783 && var10 > (float)this.field7783) {
               var8 |= 32;
            }
         }

         label61: {
            int var11 = (int)(((float)arg2 * this.field7672.field2332 + (float)arg0 * this.field7672.field2349 + (float)arg1 * this.field7672.field2342 + this.field7672.field2348) * (float)this.field7726 / var9);
            int var12 = (int)(((float)arg5 * this.field7672.field2332 + (float)arg3 * this.field7672.field2349 + (float)arg4 * this.field7672.field2342 + this.field7672.field2348) * (float)this.field7726 / var10);
            if ((float)var11 < this.field7758 && (float)var12 < this.field7758) {
               var8 |= 1;
               if (!var7) {
                  break label61;
               }
            }

            if (this.field7709 < (float)var11 && (float)var12 > this.field7709) {
               var8 |= 2;
            }
         }

         int var13 = (int)(((float)arg2 * this.field7672.field2353 + (float)arg0 * this.field7672.field2352 + (float)arg1 * this.field7672.field2331 + this.field7672.field2363) * (float)this.field7689 / var9);
         int var14 = (int)(((float)arg5 * this.field7672.field2353 + (float)arg3 * this.field7672.field2352 + (float)arg4 * this.field7672.field2331 + this.field7672.field2363) * (float)this.field7689 / var10);
         if (!((float)var13 < this.field7750) || !(this.field7750 > (float)var14)) {
            if (!((float)var13 > this.field7779) || !(this.field7779 < (float)var14)) {
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
         throw class93.method866(var16, field7795[48] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "pa",
      descriptor = "()V"
   )
   public final void method512() {
      try {
         this.field7740 = false;
         ++field7436;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7795[194] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "ya",
      descriptor = "()V"
   )
   public final void method502() {
      try {
         ++field7441;
         this.method4020(-75, true);
         OpenGL.glClear(256);
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7795[36] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "c",
      descriptor = "(ILpl;)V"
   )
   public final void method4017(int arg0, class241 arg1) {
      try {
         ++field7538;
         int var3 = -121 / ((arg0 - -47) / 43);
         if (~this.field7648 <= -4) {
            throw new RuntimeException();
         } else {
            if (this.field7648 >= 0) {
               this.field7656[this.field7648].method1918((byte)-51);
            }

            this.field7653 = this.field7656[++this.field7648] = arg1;
            this.field7653.method1916(-19117);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7795[114] + arg0 + ',' + (arg1 != null ? field7795[4] : field7795[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "i",
      descriptor = "(B)V"
   )
   private final void method4018(byte arg0) {
      try {
         OpenGL.glViewport(this.field7698, this.field7699, this.field7453, this.field7615);
         ++field7567;
         if (arg0 != 102) {
            this.field7533 = null;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(Lkr;)V"
   )
   public final void method510(class122 arg0) {
      try {
         ++field7460;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[21] + (arg0 != null ? field7795[4] : field7795[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "A",
      descriptor = "(ILaa;II)V"
   )
   public final void method421(int arg0, class87 arg1, int arg2, int arg3) {
      try {
         ++field7559;
         class229 var5 = (class229)arg1;
         class124 var6 = var5.field2864;
         this.method4008(-2);
         this.method4006(var5.field2864, (byte)-125);
         this.method4012(1, -113);
         this.method4022(8448, 34161, 7681);
         this.method3959(-100, 768, 34167, 0);
         float var7 = var6.field1623 / (float)var6.field1624;
         float var8 = var6.field1621 / (float)var6.field1620;
         OpenGL.glColor4ub((byte)(arg0 >> 16), (byte)(arg0 >> 8), (byte)arg0, (byte)(arg0 >> 24));
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f((float)(-arg2 + this.field7768) * var7, (float)(-arg3 + this.field7788) * var8);
         OpenGL.glVertex2i(this.field7768, this.field7788);
         OpenGL.glTexCoord2f((float)(-arg2 + this.field7768) * var7, (float)(-arg3 + this.field7775) * var8);
         OpenGL.glVertex2i(this.field7768, this.field7775);
         OpenGL.glTexCoord2f((float)(-arg2 + this.field7705) * var7, (float)(-arg3 + this.field7775) * var8);
         OpenGL.glVertex2i(this.field7705, this.field7775);
         OpenGL.glTexCoord2f((float)(-arg2 + this.field7705) * var7, (float)(-arg3 + this.field7788) * var8);
         OpenGL.glVertex2i(this.field7705, this.field7788);
         OpenGL.glEnd();
         this.method3959(-106, 768, 5890, 0);
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field7795[192] + arg0 + ',' + (arg1 != null ? field7795[4] : field7795[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "c",
      descriptor = "(IB)V"
   )
   public final synchronized void method4019(int arg0, byte arg1) {
      try {
         if (arg1 > 118) {
            ++field7612;
            class278 var3 = new class278(arg0);
            this.field7663.method279(false, var3);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7795[47] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "u",
      descriptor = "()V"
   )
   public final void method438() {
      try {
         if (this.field7633 != null && this.field7633.method317((byte)112)) {
            this.field7634.method5212(this.field7633, 0);
            this.field7637.method5633(0);
         }

         ++field7469;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7795[9] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "c",
      descriptor = "(IZ)V"
   )
   public final void method4020(int arg0, boolean arg1) {
      try {
         if (!arg1 != !this.field7673) {
            this.field7673 = arg1;
            this.method4032(-2);
            this.field7669 &= -32;
         }

         int var3 = -123 % ((2 - arg0) / 52);
         ++field7586;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7795[186] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "l",
      descriptor = "(I)V"
   )
   private final void method4021(int arg0) {
      try {
         class425.field5782[1] = this.field7732 * this.field7713;
         if (arg0 == 31541) {
            class425.field5782[3] = 1.0F;
            class425.field5782[0] = this.field7732 * this.field7722;
            ++field7471;
            class425.field5782[2] = this.field7732 * this.field7706;
            OpenGL.glLightModelfv(2899, class425.field5782, 0);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[229] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "E",
      descriptor = "()I"
   )
   public final int method400() {
      try {
         ++field7555;
         return this.field7660 + this.field7658 + this.field7657;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7795[22] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method4022(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 34161) {
            this.method395(-75, 64, 30, -87);
         }

         label34: {
            if (this.field7693 != 0) {
               OpenGL.glTexEnvi(8960, 34161, arg2);
               OpenGL.glTexEnvi(8960, 34162, arg0);
               if (!client.field1481) {
                  break label34;
               }
            }

            boolean var4 = false;
            if (this.field7735 != arg2) {
               OpenGL.glTexEnvi(8960, 34161, arg2);
               this.field7735 = arg2;
               var4 = true;
            }

            if (this.field7712 != arg0) {
               OpenGL.glTexEnvi(8960, 34162, arg0);
               this.field7712 = arg0;
               var4 = true;
            }

            if (var4) {
               this.field7669 &= -30;
            }
         }

         ++field7447;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7795[129] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "EA",
      descriptor = "(IIII)V"
   )
   public final void method439(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field7428;
         if (!this.field7740) {
            throw new RuntimeException("");
         } else {
            this.field7696 = arg1;
            this.field7773 = arg0;
            this.field7702 = arg3;
            this.field7690 = arg2;
            if (this.field7715) {
               this.field7631.field5322.method1972((byte)123);
               this.field7631.field5322.method1970(27929);
            }
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7795[146] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "b",
      descriptor = "(IIIID)V"
   )
   public final void method431(int arg0, int arg1, int arg2, int arg3, double arg4) {
      try {
         ++field7445;
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field7795[116] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "i",
      descriptor = "()I"
   )
   public final int method519() {
      try {
         ++field7444;
         return this.field7734;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7795[33] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "z",
      descriptor = "()Z"
   )
   public final boolean method408() {
      try {
         ++field7544;
         return this.field7631.method3038(110, 3);
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7795[45] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(Lkc;)V"
   )
   public final void method490(class72 arg0) {
      try {
         ++field7462;
         this.field7765 = (class743)arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[39] + (arg0 != null ? field7795[4] : field7795[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "k",
      descriptor = "(I)V"
   )
   private final void method4023(int arg0) {
      try {
         label29: {
            if (!this.field7679 || this.field7716) {
               OpenGL.glDisable(2896);
               if (!client.field1481) {
                  break label29;
               }
            }

            OpenGL.glEnable(2896);
         }

         ++field7464;
         if (arg0 != 4) {
            this.method417((int[])null);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(II[BZI)Llp;"
   )
   public final class83 method4024(int arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
      try {
         ++field7573;
         if (arg0 != 1) {
            return null;
         } else {
            return (class83)(!this.field7777 || arg3 && !this.field7704 ? new class695(this, arg4, arg2, arg1) : new class526(this, arg4, arg2, arg1, arg3));
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field7795[159] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7795[4] : field7795[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method514(int arg0) {
      try {
         ++field7501;
         if (arg0 != 1) {
            throw new IllegalArgumentException("");
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[150] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "o",
      descriptor = "()Lkia;"
   )
   public final class93 method480() {
      try {
         ++field7624;
         return new class184();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7795[223] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "X",
      descriptor = "(I)V"
   )
   public final void method468(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!iu",
      name = "b",
      descriptor = "(III)V"
   )
   public final synchronized void method4025(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != 4319) {
            this.method4040(true, 10, -27, false, (Buffer)null);
         }

         ++field7523;
         class278 var4 = new class278(arg0);
         var4.field9965 = (long)arg1;
         this.field7662.method279(false, var4);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7795[75] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "e",
      descriptor = "(II)Loga;"
   )
   public final class179 method415(int arg0, int arg1) {
      try {
         ++field7574;
         return null;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[43] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "L",
      descriptor = "(III)V"
   )
   public final void method516(int arg0, int arg1, int arg2) {
      try {
         ++field7495;
         if (~this.field7770 != ~arg0 || ~this.field7733 != ~arg1 || this.field7761 != arg2) {
            this.field7733 = arg1;
            this.field7770 = arg0;
            this.field7761 = arg2;
            this.method3992(2918);
            this.method4013(2912);
         }

      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7795[206] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "j",
      descriptor = "(B)V"
   )
   private final void method4026(byte arg0) {
      try {
         label18: {
            ++field7594;
            float[] var2 = this.field7691;
            float var3 = (float)(-this.field7744 * this.field7734) / (float)this.field7726;
            int var4 = -25 / ((80 - arg0) / 37);
            float var5 = (float)((-this.field7744 + this.field7453) * this.field7734) / (float)this.field7726;
            float var6 = (float)(this.field7787 * this.field7734) / (float)this.field7689;
            float var7 = (float)((-this.field7615 + this.field7787) * this.field7734) / (float)this.field7689;
            if (var3 != var5 && var6 != var7) {
               float var8 = (float)this.field7734 * 2.0F;
               var2[4] = 0.0F;
               var2[10] = this.field7766 = (float)(-(this.field7783 + this.field7734)) / (float)(-this.field7734 + this.field7783);
               var2[9] = (var6 + var7) / (-var7 + var6);
               var2[8] = (var3 + var5) / (-var3 + var5);
               var2[5] = var8 / (var6 - var7);
               var2[11] = -1.0F;
               var2[7] = 0.0F;
               var2[6] = 0.0F;
               var2[14] = this.field7719 = -((float)this.field7783 * var8) / (float)(this.field7783 - this.field7734);
               var2[13] = 0.0F;
               var2[15] = 0.0F;
               var2[2] = 0.0F;
               var2[0] = var8 / (var5 - var3);
               var2[1] = 0.0F;
               var2[3] = 0.0F;
               var2[12] = 0.0F;
               if (!client.field1481) {
                  break label18;
               }
            }

            var2[7] = 0.0F;
            var2[10] = 1.0F;
            var2[5] = 1.0F;
            var2[6] = 0.0F;
            var2[1] = 0.0F;
            var2[14] = 0.0F;
            var2[8] = 0.0F;
            var2[12] = 0.0F;
            var2[3] = 0.0F;
            var2[4] = 0.0F;
            var2[9] = 0.0F;
            var2[13] = 0.0F;
            var2[0] = 1.0F;
            var2[11] = 0.0F;
            var2[15] = 1.0F;
            var2[2] = 0.0F;
         }

         this.method3978(-24740);
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field7795[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "b",
      descriptor = "(IB)I"
   )
   public final int method4027(int arg0, byte arg1) {
      try {
         int var3 = 61 / ((14 - arg1) / 44);
         ++field7488;
         if (~arg0 != -5122 && ~arg0 != -5121) {
            if (arg0 != 5123 && ~arg0 != -5123) {
               if (~arg0 != -5126 && ~arg0 != -5125 && ~arg0 != -5127) {
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
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7795[172] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "m",
      descriptor = "()Z"
   )
   public final boolean method448() {
      try {
         ++field7517;
         return this.field7724 && (!this.method399() || this.field7762);
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7795[12] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(BLrga;Lrga;Lrga;Lrga;)V"
   )
   public final void method4028(byte arg0, class71 arg1, class71 arg2, class71 arg3, class71 arg4) {
      boolean var6 = client.field1481;

      try {
         label65: {
            if (arg3 == null) {
               OpenGL.glDisableClientState(32884);
               if (!var6) {
                  break label65;
               }
            }

            this.method3993(arg3.field952, (byte)108);
            OpenGL.glVertexPointer(arg3.field949, arg3.field951, this.field7769.method801(18744), this.field7769.method802(-122) - -((long)arg3.field953));
            OpenGL.glEnableClientState(32884);
         }

         label60: {
            ++field7489;
            if (arg1 == null) {
               OpenGL.glDisableClientState(32885);
               if (!var6) {
                  break label60;
               }
            }

            this.method3993(arg1.field952, (byte)108);
            OpenGL.glNormalPointer(arg1.field951, this.field7769.method801(18744), this.field7769.method802(105) + (long)arg1.field953);
            OpenGL.glEnableClientState(32885);
         }

         label55: {
            if (arg2 == null) {
               OpenGL.glDisableClientState(32886);
               if (!var6) {
                  break label55;
               }
            }

            this.method3993(arg2.field952, (byte)91);
            OpenGL.glColorPointer(arg2.field949, arg2.field951, this.field7769.method801(18744), this.field7769.method802(-128) - -((long)arg2.field953));
            OpenGL.glEnableClientState(32886);
         }

         if (arg0 < -120) {
            if (arg4 != null) {
               this.method3993(arg4.field952, (byte)122);
               OpenGL.glTexCoordPointer(arg4.field949, arg4.field951, this.field7769.method801(18744), this.field7769.method802(-94) - -((long)arg4.field953));
               OpenGL.glEnableClientState(32888);
            } else {
               OpenGL.glDisableClientState(32888);
            }
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field7795[57] + arg0 + ',' + (arg1 != null ? field7795[4] : field7795[2]) + ',' + (arg2 != null ? field7795[4] : field7795[2]) + ',' + (arg3 != null ? field7795[4] : field7795[2]) + ',' + (arg4 != null ? field7795[4] : field7795[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "p",
      descriptor = "(I)V"
   )
   public final void method4029(int arg0) {
      try {
         if (~this.field7669 != -9) {
            this.method3974((byte)94);
            this.method3957(true, 114);
            this.method4005(104, true);
            this.method4020(-58, true);
            this.method4012(1, -114);
            this.field7669 = 8;
         }

         if (arg0 == 8) {
            ++field7551;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[112] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "DA",
      descriptor = "(IIII)V"
   )
   public final void method504(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field7744 = arg0;
         ++field7617;
         this.field7726 = arg2;
         this.field7689 = arg3;
         this.field7787 = arg1;
         this.method4026((byte)127);
         this.method4037(5889);
         if (this.field7692 != 3) {
            if (~this.field7692 == -3) {
               this.method4039(-127);
               return;
            }
         } else {
            this.method4014(5889);
         }

      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7795[220] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "b",
      descriptor = "(IZ)V"
   )
   public final void method4030(int arg0, boolean arg1) {
      try {
         ++field7466;
         this.method3956(arg0, 0, arg1);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[221] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(JB)V"
   )
   public final synchronized void method4031(long arg0, byte arg1) {
      try {
         ++field7530;
         class673 var4 = new class673();
         if (arg1 >= -73) {
            this.field7704 = false;
         }

         var4.field9965 = arg0;
         this.field7666.method279(false, var4);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7795[210] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "<init>",
      descriptor = "(Ljava/awt/Canvas;Ld;I)V"
   )
   public class530(Canvas param1, class102 param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!iu",
      name = "t",
      descriptor = "()Z"
   )
   public final boolean method422() {
      try {
         ++field7485;
         return true;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7795[205] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "ra",
      descriptor = "(IIII)V"
   )
   public final void method447(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field7740 = true;
         this.field7702 = arg3;
         ++field7478;
         this.field7696 = arg1;
         this.field7690 = arg2;
         this.field7773 = arg0;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7795[51] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V"
   )
   public final void method467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      try {
         ++field7582;
         this.method3971((byte)93);
         this.method4012(arg12, -122);
         OpenGL.glBegin(4);
         OpenGL.glColor4ub((byte)(arg9 >> 16), (byte)(arg9 >> 8), (byte)arg9, (byte)(arg9 >> 24));
         OpenGL.glVertex3f((float)arg0 + 0.35F, (float)arg1 + 0.35F, (float)arg2);
         OpenGL.glColor4ub((byte)(arg10 >> 16), (byte)(arg10 >> 8), (byte)arg10, (byte)(arg10 >> 24));
         OpenGL.glVertex3f((float)arg3 + 0.35F, (float)arg4 + 0.35F, (float)arg5);
         OpenGL.glColor4ub((byte)(arg11 >> 16), (byte)(arg11 >> 8), (byte)arg11, (byte)(arg11 >> 24));
         OpenGL.glVertex3f((float)arg6 + 0.35F, (float)arg7 + 0.35F, (float)arg8);
         OpenGL.glEnd();
      } catch (RuntimeException var15) {
         throw class93.method866(var15, field7795[225] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "d",
      descriptor = "()V"
   )
   public final void method505() {
      try {
         ++field7513;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7795[169] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(Lu;Z)Lpd;"
   )
   public final class648 method402(class65 arg0, boolean arg1) {
      boolean var3 = client.field1481;

      try {
         int[] var4;
         label95: {
            ++field7575;
            var4 = new int[arg0.field820 * arg0.field819];
            int var5 = 0;
            int var6 = 0;
            if (arg0.field815 != null) {
               int var7 = 0;
               if (var3 || ~arg0.field820 < ~var7) {
                  do {
                     int var8 = 0;
                     if (var3) {
                        var4[var6++] = class2.method15(arg0.field815[var5] << 24, arg0.field813[class109.method974(arg0.field818[var5], 255)]);
                        ++var5;
                        ++var8;
                     }

                     while(true) {
                        while(~arg0.field819 < ~var8) {
                           var4[var6++] = class2.method15(arg0.field815[var5] << 24, arg0.field813[class109.method974(arg0.field818[var5], 255)]);
                           ++var5;
                           ++var8;
                        }

                        if (!var3) {
                           ++var7;
                           break;
                        }

                        ++var8;
                     }
                  } while(~arg0.field820 < ~var7);
               }

               if (!var3) {
                  break label95;
               }
            }

            int var9 = 0;
            if (var3 || ~arg0.field820 < ~var9) {
               do {
                  int var10 = 0;
                  if (var3 || ~arg0.field819 < ~var10) {
                     do {
                        int var11 = arg0.field813[255 & arg0.field818[var5++]];
                        var4[var6++] = var11 != 0 ? class2.method15(var11, -16777216) : 0;
                        ++var10;
                     } while(~arg0.field819 < ~var10);
                  }

                  ++var9;
               } while(~arg0.field820 < ~var9);
            }
         }

         class648 var12 = this.method3638(arg0.field819, -46, var4, arg0.field820, arg0.field819, 0);
         var12.method2405(arg0.field816, arg0.field814, arg0.field817, arg0.field821);
         return var12;
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field7795[209] + (arg0 != null ? field7795[4] : field7795[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "q",
      descriptor = "(I)V"
   )
   private final void method4032(int arg0) {
      try {
         if (arg0 == -2) {
            OpenGL.glDepthMask(this.field7673 && this.field7682);
            ++field7475;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[184] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(Lls;IIII)Lka;"
   )
   public final class232 method494(class167 arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field7614;
         return new class452(this, arg0, arg1, arg3, arg4, arg2);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field7795[117] + (arg0 != null ? field7795[4] : field7795[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "f",
      descriptor = "(B)V"
   )
   private final void method4033(byte arg0) {
      boolean var2 = client.field1481;

      try {
         ++field7623;
         int var3 = 0;
         if (var2) {
            if (var3++ > 5) {
               throw new RuntimeException("");
            }

            class340.method2717(1000L, (byte)-119);
         }

         while(true) {
            int var10000;
            byte var10001;
            if (this.field7599.method228()) {
               var10000 = arg0;
               var10001 = 37;
               if (!var2) {
                  if (arg0 <= 37) {
                     method3977(-24, -22, (class479)null);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = var3++;
               var10001 = 5;
            }

            if (var10000 > var10001) {
               throw new RuntimeException("");
            }

            class340.method2717(1000L, (byte)-119);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7795[31] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "e",
      descriptor = "(Z)V"
   )
   private final void method4034(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!iu",
      name = "K",
      descriptor = "([I)V"
   )
   public final void method417(int[] arg0) {
      try {
         arg0[1] = this.field7788;
         ++field7487;
         arg0[0] = this.field7768;
         arg0[2] = this.field7705;
         arg0[3] = this.field7775;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[61] + (arg0 != null ? field7795[4] : field7795[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(Lpl;I)V"
   )
   public final void method4035(class241 arg0, int arg1) {
      try {
         ++field7564;
         if (arg1 == 14231) {
            if (~this.field7655 <= -4) {
               throw new RuntimeException();
            } else {
               if (this.field7655 >= 0) {
                  this.field7649[this.field7655].method1914(false);
               }

               this.field7654 = this.field7649[++this.field7655] = arg0;
               this.field7654.method1919((byte)84);
            }
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[215] + (arg0 != null ? field7795[4] : field7795[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "q",
      descriptor = "()V"
   )
   public final void method518() {
      try {
         ++field7588;
         if (this.field7700 && ~this.field7453 < -1 && ~this.field7615 < -1) {
            int var1 = this.field7768;
            int var2 = this.field7705;
            int var3 = this.field7788;
            int var4 = this.field7775;
            this.method443();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method3967((byte)109);
            this.method3957(false, 111);
            this.method4016(false, -15655);
            this.method4005(122, false);
            this.method4020(95, false);
            this.method4006((class549)null, (byte)107);
            this.method4030(-2, true);
            this.method4009(1, 1);
            this.method4012(0, -118);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field7453, this.field7615, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method460(var1, var3, var2, var4);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7795[70] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "k",
      descriptor = "()Z"
   )
   public final boolean method465() {
      try {
         ++field7492;
         return true;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7795[227] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "m",
      descriptor = "(B)V"
   )
   private final void method4036(byte arg0) {
      try {
         ++field7531;
         int var2 = 64 % ((9 - arg0) / 43);
         if (~this.field7692 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field7453 < -1 && ~this.field7615 < -1) {
               OpenGL.glOrtho(0.0D, (double)this.field7453, (double)this.field7615, 0.0D, -1.0D, 1.0D);
            }

            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field7669 &= -25;
            this.field7692 = 1;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[113] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "t",
      descriptor = "(I)V"
   )
   private final void method4037(int arg0) {
      try {
         this.field7779 = (float)(-this.field7787 + this.field7775);
         this.field7750 = (float)(this.field7788 - this.field7787);
         this.field7758 = (float)(this.field7768 - this.field7744);
         ++field7481;
         this.field7709 = (float)(-this.field7744 + this.field7705);
         if (arg0 != 5889) {
            this.field7648 = -122;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[203] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;"
   )
   public final class423 method482(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      try {
         ++field7563;
         return new class761(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field7795[183] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7795[4] : field7795[2]) + ',' + (arg3 != null ? field7795[4] : field7795[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method403(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         ++field7572;
         OpenGL.glLineWidth((float)arg5);
         this.method446(arg0, arg1, arg2, arg3, arg4, arg6);
         OpenGL.glLineWidth(1.0F);
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field7795[173] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "b",
      descriptor = "(II)I"
   )
   public final int method444(int arg0, int arg1) {
      try {
         ++field7432;
         return arg0 | arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[74] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "b",
      descriptor = "(IC)B"
   )
   public static final byte method4038(int arg0, char arg1) {
      boolean var2 = client.field1481;

      try {
         ++field7626;
         byte var3;
         if ((arg1 <= 0 || ~arg1 <= -129) && (arg1 < 160 || ~arg1 < -256)) {
            if (arg1 == 8364) {
               var3 = -128;
               if (!var2) {
                  return arg0 >= -54 ? 22 : var3;
               }
            }

            if (~arg1 != -8219) {
               if (~arg1 != -403) {
                  if (~arg1 != -8223) {
                     if (~arg1 != -8231) {
                        if (~arg1 == -8225) {
                           var3 = -122;
                           if (!var2) {
                              return arg0 >= -54 ? 22 : var3;
                           }
                        }

                        if (~arg1 == -8226) {
                           var3 = -121;
                           if (!var2) {
                              return arg0 >= -54 ? 22 : var3;
                           }
                        }

                        if (~arg1 == -711) {
                           var3 = -120;
                           if (!var2) {
                              return arg0 >= -54 ? 22 : var3;
                           }
                        }

                        if (arg1 != 8240) {
                           if (~arg1 == -353) {
                              var3 = -118;
                              if (!var2) {
                                 return arg0 >= -54 ? 22 : var3;
                              }
                           }

                           if (arg1 != 8249) {
                              if (arg1 != 338) {
                                 if (arg1 != 381) {
                                    if (~arg1 != -8217) {
                                       if (~arg1 == -8218) {
                                          var3 = -110;
                                          if (!var2) {
                                             return arg0 >= -54 ? 22 : var3;
                                          }
                                       }

                                       if (~arg1 != -8221) {
                                          if (arg1 != 8221) {
                                             if (arg1 != 8226) {
                                                if (arg1 == 8211) {
                                                   var3 = -106;
                                                   if (!var2) {
                                                      return arg0 >= -54 ? 22 : var3;
                                                   }
                                                }

                                                if (arg1 != 8212) {
                                                   if (arg1 != 732) {
                                                      if (arg1 != 8482) {
                                                         if (~arg1 != -354) {
                                                            if (arg1 == 8250) {
                                                               var3 = -101;
                                                               if (!var2) {
                                                                  return arg0 >= -54 ? 22 : var3;
                                                               }
                                                            }

                                                            if (~arg1 != -340) {
                                                               if (~arg1 != -383) {
                                                                  if (arg1 != 376) {
                                                                     var3 = 63;
                                                                     if (!var2) {
                                                                        return arg0 >= -54 ? 22 : var3;
                                                                     }
                                                                  }

                                                                  var3 = -97;
                                                                  if (!var2) {
                                                                     return arg0 >= -54 ? 22 : var3;
                                                                  }
                                                               }

                                                               var3 = -98;
                                                               if (!var2) {
                                                                  return arg0 >= -54 ? 22 : var3;
                                                               }
                                                            }

                                                            var3 = -100;
                                                            if (!var2) {
                                                               return arg0 >= -54 ? 22 : var3;
                                                            }
                                                         }

                                                         var3 = -102;
                                                         if (!var2) {
                                                            return arg0 >= -54 ? 22 : var3;
                                                         }
                                                      }

                                                      var3 = -103;
                                                      if (!var2) {
                                                         return arg0 >= -54 ? 22 : var3;
                                                      }
                                                   }

                                                   var3 = -104;
                                                   if (!var2) {
                                                      return arg0 >= -54 ? 22 : var3;
                                                   }
                                                }

                                                var3 = -105;
                                                if (!var2) {
                                                   return arg0 >= -54 ? 22 : var3;
                                                }
                                             }

                                             var3 = -107;
                                             if (!var2) {
                                                return arg0 >= -54 ? 22 : var3;
                                             }
                                          }

                                          var3 = -108;
                                          if (!var2) {
                                             return arg0 >= -54 ? 22 : var3;
                                          }
                                       }

                                       var3 = -109;
                                       if (!var2) {
                                          return arg0 >= -54 ? 22 : var3;
                                       }
                                    }

                                    var3 = -111;
                                    if (!var2) {
                                       return arg0 >= -54 ? 22 : var3;
                                    }
                                 }

                                 var3 = -114;
                                 if (!var2) {
                                    return arg0 >= -54 ? 22 : var3;
                                 }
                              }

                              var3 = -116;
                              if (!var2) {
                                 return arg0 >= -54 ? 22 : var3;
                              }
                           }

                           var3 = -117;
                           if (!var2) {
                              return arg0 >= -54 ? 22 : var3;
                           }
                        }

                        var3 = -119;
                        if (!var2) {
                           return arg0 >= -54 ? 22 : var3;
                        }
                     }

                     var3 = -123;
                     if (!var2) {
                        return arg0 >= -54 ? 22 : var3;
                     }
                  }

                  var3 = -124;
                  if (!var2) {
                     return arg0 >= -54 ? 22 : var3;
                  }
               }

               var3 = -125;
               if (!var2) {
                  return arg0 >= -54 ? 22 : var3;
               }
            }

            var3 = -126;
            if (!var2) {
               return arg0 >= -54 ? 22 : var3;
            }
         }

         var3 = (byte)arg1;
         return arg0 >= -54 ? 22 : var3;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7795[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "y",
      descriptor = "(I)V"
   )
   private final void method4039(int arg0) {
      try {
         if (arg0 <= -121) {
            OpenGL.glMatrixMode(5889);
            ++field7482;
            OpenGL.glLoadMatrixf(this.field7691, 0);
            OpenGL.glMatrixMode(5888);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7795[56] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "e",
      descriptor = "()Ljv;"
   )
   public final class776 method425() {
      boolean var1 = client.field1481;

      try {
         ++field7506;
         int var2 = -1;
         if (~this.field7778.indexOf(field7795[123]) == 0) {
            if (~this.field7778.indexOf(field7795[125]) != 0) {
               var2 = 32902;
               if (!var1) {
                  return new class776(var2, field7795[122], this.field7753, this.field7763, 0L);
               }
            }

            if (this.field7778.indexOf(field7795[126]) == -1) {
               return new class776(var2, field7795[122], this.field7753, this.field7763, 0L);
            }

            var2 = 4098;
            if (!var1) {
               return new class776(var2, field7795[122], this.field7753, this.field7763, 0L);
            }
         }

         var2 = 4318;
         return new class776(var2, field7795[122], this.field7753, this.field7763, 0L);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7795[124] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(ZIIZLjaclib/memory/Buffer;)Llp;"
   )
   public final class83 method4040(boolean arg0, int arg1, int arg2, boolean arg3, Buffer arg4) {
      try {
         if (!arg3) {
            this.method474(-33, 58, 79, 85, -48);
         }

         ++field7535;
         return (class83)(!this.field7777 || arg0 && !this.field7704 ? new class695(this, arg2, arg4) : new class526(this, arg2, arg4, arg1, arg0));
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field7795[40] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field7795[4] : field7795[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(II[I[I)Laa;"
   )
   public final class87 method479(int arg0, int arg1, int[] arg2, int[] arg3) {
      try {
         ++field7431;
         return class313.method2489(arg1, this, arg2, arg0, 7050, arg3);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7795[60] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7795[4] : field7795[2]) + ',' + (arg3 != null ? field7795[4] : field7795[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "na",
      descriptor = "(IIII)[I"
   )
   public final int[] method464(int arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field1481;

      try {
         ++field7442;
         int[] var6 = new int[arg2 * arg3];
         int var7 = 0;
         if (var5) {
            OpenGL.glReadPixelsi(arg0, -arg1 + this.field7615 + -var7, arg2, 1, 32993, this.field7710, var6, arg2 * var7);
            ++var7;
         }

         while(true) {
            while(~var7 > ~arg3) {
               OpenGL.glReadPixelsi(arg0, -arg1 + this.field7615 + -var7, arg2, 1, 32993, this.field7710, var6, arg2 * var7);
               ++var7;
            }

            if (!var5) {
               return var6;
            }

            ++var7;
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field7795[158] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4041(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4042(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 80;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
