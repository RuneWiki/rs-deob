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

@OriginalClass("client!aea")
public class class678 extends class17 {
   @OriginalMember(
      owner = "client!aea",
      name = "bb",
      descriptor = "Ljava/util/Hashtable;"
   )
   private Hashtable field9618;
   @OriginalMember(
      owner = "client!aea",
      name = "tb",
      descriptor = "I"
   )
   public int field9668;
   @OriginalMember(
      owner = "client!aea",
      name = "D",
      descriptor = "Lsm;"
   )
   private class598 field9674;
   @OriginalMember(
      owner = "client!aea",
      name = "Mb",
      descriptor = "Lmg;"
   )
   private class290 field9677;
   @OriginalMember(
      owner = "client!aea",
      name = "He",
      descriptor = "Lmg;"
   )
   public class290 field9678;
   @OriginalMember(
      owner = "client!aea",
      name = "Uf",
      descriptor = "I"
   )
   public int field9682;
   @OriginalMember(
      owner = "client!aea",
      name = "nd",
      descriptor = "I"
   )
   public int field9683;
   @OriginalMember(
      owner = "client!aea",
      name = "ud",
      descriptor = "Z"
   )
   private boolean field9680;
   @OriginalMember(
      owner = "client!aea",
      name = "Lb",
      descriptor = "Lsb;"
   )
   private class261 field9681;
   @OriginalMember(
      owner = "client!aea",
      name = "Ze",
      descriptor = "[Lwi;"
   )
   private class373[] field9686;
   @OriginalMember(
      owner = "client!aea",
      name = "uf",
      descriptor = "I"
   )
   private int field9687;
   @OriginalMember(
      owner = "client!aea",
      name = "Pb",
      descriptor = "[Lwi;"
   )
   private class373[] field9694;
   @OriginalMember(
      owner = "client!aea",
      name = "jh",
      descriptor = "[Lwi;"
   )
   private class373[] field9692;
   @OriginalMember(
      owner = "client!aea",
      name = "ef",
      descriptor = "I"
   )
   private int field9695;
   @OriginalMember(
      owner = "client!aea",
      name = "od",
      descriptor = "I"
   )
   private int field9689;
   @OriginalMember(
      owner = "client!aea",
      name = "Vg",
      descriptor = "Lsb;"
   )
   private class261 field9698;
   @OriginalMember(
      owner = "client!aea",
      name = "Gd",
      descriptor = "Lsb;"
   )
   private class261 field9700;
   @OriginalMember(
      owner = "client!aea",
      name = "U",
      descriptor = "Lsb;"
   )
   private class261 field9701;
   @OriginalMember(
      owner = "client!aea",
      name = "Ec",
      descriptor = "Lsb;"
   )
   private class261 field9702;
   @OriginalMember(
      owner = "client!aea",
      name = "y",
      descriptor = "Lsb;"
   )
   private class261 field9703;
   @OriginalMember(
      owner = "client!aea",
      name = "Qf",
      descriptor = "Lsb;"
   )
   private class261 field9704;
   @OriginalMember(
      owner = "client!aea",
      name = "Xc",
      descriptor = "Lsb;"
   )
   private class261 field9705;
   @OriginalMember(
      owner = "client!aea",
      name = "Xf",
      descriptor = "Lmg;"
   )
   public class290 field9709;
   @OriginalMember(
      owner = "client!aea",
      name = "hd",
      descriptor = "Lmg;"
   )
   public class290 field9715;
   @OriginalMember(
      owner = "client!aea",
      name = "fb",
      descriptor = "Lmg;"
   )
   public class290 field9716;
   @OriginalMember(
      owner = "client!aea",
      name = "th",
      descriptor = "[F"
   )
   private float[] field9725;
   @OriginalMember(
      owner = "client!aea",
      name = "bf",
      descriptor = "I"
   )
   private int field9738;
   @OriginalMember(
      owner = "client!aea",
      name = "ug",
      descriptor = "F"
   )
   public float field9745;
   @OriginalMember(
      owner = "client!aea",
      name = "Ue",
      descriptor = "I"
   )
   public int field9750;
   @OriginalMember(
      owner = "client!aea",
      name = "ih",
      descriptor = "I"
   )
   private int field9742;
   @OriginalMember(
      owner = "client!aea",
      name = "lg",
      descriptor = "F"
   )
   private float field9743;
   @OriginalMember(
      owner = "client!aea",
      name = "ic",
      descriptor = "Z"
   )
   private boolean field9753;
   @OriginalMember(
      owner = "client!aea",
      name = "ub",
      descriptor = "F"
   )
   private float field9773;
   @OriginalMember(
      owner = "client!aea",
      name = "pf",
      descriptor = "I"
   )
   public int field9752;
   @OriginalMember(
      owner = "client!aea",
      name = "Gb",
      descriptor = "[F"
   )
   private float[] field9718;
   @OriginalMember(
      owner = "client!aea",
      name = "Pe",
      descriptor = "I"
   )
   private int field9780;
   @OriginalMember(
      owner = "client!aea",
      name = "ee",
      descriptor = "F"
   )
   public float field9764;
   @OriginalMember(
      owner = "client!aea",
      name = "nh",
      descriptor = "F"
   )
   private float field9749;
   @OriginalMember(
      owner = "client!aea",
      name = "H",
      descriptor = "[F"
   )
   public float[] field9758;
   @OriginalMember(
      owner = "client!aea",
      name = "Wb",
      descriptor = "I"
   )
   public int field9737;
   @OriginalMember(
      owner = "client!aea",
      name = "ze",
      descriptor = "F"
   )
   public float field9755;
   @OriginalMember(
      owner = "client!aea",
      name = "Xb",
      descriptor = "I"
   )
   private int field9727;
   @OriginalMember(
      owner = "client!aea",
      name = "af",
      descriptor = "F"
   )
   public float field9744;
   @OriginalMember(
      owner = "client!aea",
      name = "Kb",
      descriptor = "I"
   )
   private int field9757;
   @OriginalMember(
      owner = "client!aea",
      name = "Xg",
      descriptor = "F"
   )
   public float field9794;
   @OriginalMember(
      owner = "client!aea",
      name = "Sf",
      descriptor = "I"
   )
   public int field9795;
   @OriginalMember(
      owner = "client!aea",
      name = "Jc",
      descriptor = "[Lpha;"
   )
   private class757[] field9765;
   @OriginalMember(
      owner = "client!aea",
      name = "Db",
      descriptor = "[F"
   )
   private float[] field9790;
   @OriginalMember(
      owner = "client!aea",
      name = "of",
      descriptor = "I"
   )
   public int field9735;
   @OriginalMember(
      owner = "client!aea",
      name = "Fg",
      descriptor = "I"
   )
   public int field9751;
   @OriginalMember(
      owner = "client!aea",
      name = "Wg",
      descriptor = "I"
   )
   private int field9771;
   @OriginalMember(
      owner = "client!aea",
      name = "Hf",
      descriptor = "I"
   )
   private int field9760;
   @OriginalMember(
      owner = "client!aea",
      name = "Fb",
      descriptor = "F"
   )
   public float field9799;
   @OriginalMember(
      owner = "client!aea",
      name = "Gg",
      descriptor = "I"
   )
   public int field9733;
   @OriginalMember(
      owner = "client!aea",
      name = "Hd",
      descriptor = "F"
   )
   public float field9796;
   @OriginalMember(
      owner = "client!aea",
      name = "Fe",
      descriptor = "I"
   )
   public int field9814;
   @OriginalMember(
      owner = "client!aea",
      name = "rc",
      descriptor = "I"
   )
   private int field9772;
   @OriginalMember(
      owner = "client!aea",
      name = "fh",
      descriptor = "I"
   )
   public int field9768;
   @OriginalMember(
      owner = "client!aea",
      name = "hh",
      descriptor = "Z"
   )
   private boolean field9778;
   @OriginalMember(
      owner = "client!aea",
      name = "qf",
      descriptor = "F"
   )
   private float field9736;
   @OriginalMember(
      owner = "client!aea",
      name = "Ng",
      descriptor = "I"
   )
   public int field9822;
   @OriginalMember(
      owner = "client!aea",
      name = "Mg",
      descriptor = "I"
   )
   private int field9803;
   @OriginalMember(
      owner = "client!aea",
      name = "se",
      descriptor = "[F"
   )
   private float[] field9805;
   @OriginalMember(
      owner = "client!aea",
      name = "Re",
      descriptor = "F"
   )
   private float field9806;
   @OriginalMember(
      owner = "client!aea",
      name = "lh",
      descriptor = "I"
   )
   private int field9823;
   @OriginalMember(
      owner = "client!aea",
      name = "zc",
      descriptor = "I"
   )
   public int field9798;
   @OriginalMember(
      owner = "client!aea",
      name = "Nc",
      descriptor = "Lar;"
   )
   public class637 field9816;
   @OriginalMember(
      owner = "client!aea",
      name = "G",
      descriptor = "[B"
   )
   public byte[] field9829;
   @OriginalMember(
      owner = "client!aea",
      name = "zh",
      descriptor = "[I"
   )
   public int[] field9830;
   @OriginalMember(
      owner = "client!aea",
      name = "dd",
      descriptor = "[I"
   )
   public int[] field9831;
   @OriginalMember(
      owner = "client!aea",
      name = "yd",
      descriptor = "[I"
   )
   public int[] field9833;
   @OriginalMember(
      owner = "client!aea",
      name = "ue",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field9569;
   @OriginalMember(
      owner = "client!aea",
      name = "N",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field9651;
   @OriginalMember(
      owner = "client!aea",
      name = "Je",
      descriptor = "I"
   )
   public int field9673;
   @OriginalMember(
      owner = "client!aea",
      name = "sf",
      descriptor = "Ljaggl/OpenGL;"
   )
   private OpenGL field9520;
   @OriginalMember(
      owner = "client!aea",
      name = "E",
      descriptor = "J"
   )
   private long field9528;
   @OriginalMember(
      owner = "client!aea",
      name = "cd",
      descriptor = "J"
   )
   private long field9666;
   @OriginalMember(
      owner = "client!aea",
      name = "rf",
      descriptor = "Z"
   )
   public boolean field9826;
   @OriginalMember(
      owner = "client!aea",
      name = "Rd",
      descriptor = "I"
   )
   public int field9785;
   @OriginalMember(
      owner = "client!aea",
      name = "Qc",
      descriptor = "Ljava/lang/String;"
   )
   private String field9728;
   @OriginalMember(
      owner = "client!aea",
      name = "rh",
      descriptor = "Z"
   )
   public boolean field9739;
   @OriginalMember(
      owner = "client!aea",
      name = "sg",
      descriptor = "Z"
   )
   private boolean field9756;
   @OriginalMember(
      owner = "client!aea",
      name = "cb",
      descriptor = "Z"
   )
   public boolean field9731;
   @OriginalMember(
      owner = "client!aea",
      name = "w",
      descriptor = "Z"
   )
   public boolean field9777;
   @OriginalMember(
      owner = "client!aea",
      name = "hf",
      descriptor = "Z"
   )
   public boolean field9825;
   @OriginalMember(
      owner = "client!aea",
      name = "z",
      descriptor = "Z"
   )
   private boolean field9761;
   @OriginalMember(
      owner = "client!aea",
      name = "Zg",
      descriptor = "Ljava/lang/String;"
   )
   private String field9786;
   @OriginalMember(
      owner = "client!aea",
      name = "Rb",
      descriptor = "Z"
   )
   public boolean field9729;
   @OriginalMember(
      owner = "client!aea",
      name = "bd",
      descriptor = "Z"
   )
   private boolean field9724;
   @OriginalMember(
      owner = "client!aea",
      name = "sh",
      descriptor = "Lqba;"
   )
   private class690 field9667;
   @OriginalMember(
      owner = "client!aea",
      name = "Nb",
      descriptor = "Llca;"
   )
   public class561 field9684;
   @OriginalMember(
      owner = "client!aea",
      name = "gb",
      descriptor = "Lqr;"
   )
   private class692 field9676;
   @OriginalMember(
      owner = "client!aea",
      name = "vg",
      descriptor = "Llea;"
   )
   private class500 field9675;
   @OriginalMember(
      owner = "client!aea",
      name = "Lg",
      descriptor = "Lfu;"
   )
   private class219 field9670;
   @OriginalMember(
      owner = "client!aea",
      name = "Ah",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9834 = new String[]{method4967(method4966("|\u000e[C.YC")), method4967(method4966("s\u001dS\t\b|")), method4967(method4966("|\u001fS")), method4967(method4966("R\u001b_\u0003&Q")), method4967(method4966("t\u0005N\b\r")), method4967(method4966("|\u000e[C [C")), method4967(method4966("|\u000e[C.[C")), method4967(method4966("|\u000e[C/\\C")), method4967(method4966("fE\u0014C\u001c")), method4967(method4966("s\u001eV\u0001")), method4967(method4966("|\u000e[C7XC")), method4967(method4966("|\u000e[C5[C")), method4967(method4966("|\u000e[C&_C")), method4967(method4966("|\u000e[C4[C")), method4967(method4966("|\u000e[C-^C")), method4967(method4966("|\u000e[C'5")), method4967(method4966("|\u000e[C#\\C")), method4967(method4966("|\u000e[C)^C")), method4967(method4966("|\u000e[C%5")), method4967(method4966("|\u000e[C4ZC")), method4967(method4966("|\u000e[C75")), method4967(method4966("|\u000e[C\u00035")), method4967(method4966("|\u000e[C\u00075")), method4967(method4966("|\u000e[C$_C")), method4967(method4966("|\u000e[C5\\C")), method4967(method4966("|\u000e[C ZC")), method4967(method4966("|\u000e[C%XC")), method4967(method4966("|\u000e[C+5")), method4967(method4966("|\u000e[C3YC")), method4967(method4966("|\u000e[C\"[C")), method4967(method4966("|\u000e[C%_C")), method4967(method4966("|\u000e[C*_C")), method4967(method4966("|\u000e[C'ZC")), method4967(method4966("|\u000e[C4\\C")), method4967(method4966("|\u000e[C,_C")), method4967(method4966("|\u000e[C35")), method4967(method4966("|\u000e[C%\\C")), method4967(method4966("|\u000e[C$\\C")), method4967(method4966("|\u000e[C7_C")), method4967(method4966("|\u000e[C\"^C")), method4967(method4966("|\u000e[C/^C")), method4967(method4966("|\u000e[C#^C")), method4967(method4966("|\u000e[C3^C")), method4967(method4966("|\u000e[C.ZC")), method4967(method4966("|\u000e[C3XC")), method4967(method4966("Z'e,3_4L\b\u0013i\u000eB2\u0003h\r\\\b\u0013B\u0004X\u0007\u0004~\u001f")), method4967(method4966("Z'e,3_4L\b\u0013i\u000eB2\u0011o\u0004]\u001f\u0000p")), method4967(method4966("Z'e,3_4\\\u001f\u0000z\u0006_\u0003\u0015B\u0018R\f\u0005x\u0019")), method4967(method4966("Z'e,3_4N\b\u0019i\u001eH\b>~\u001eX\b>p\nJ")), method4967(method4966("Z'e(9I4N\b\u0019i\u001eH\bRY")), method4967(method4966("p\u0002Y\u001f\u000en\u0004\\\u0019")), method4967(method4966("Z'e(9I4\\\u001f\u0000p\u000eX\u0018\u0007{\u000eH2\u000e\u007f\u0001_\u000e\u0015")), method4967(method4966("Z'e,3_4N\b\u0019i\u001eH\b>{\u0007U\f\u0015")), method4967(method4966("Z'e,3_4W\u0018\ri\u0002I\f\fm\u0007_")), method4967(method4966("Z'e(9I4\\\u001f\u0000p\u000eX\u0018\u0007{\u000eH2\fh\u0007N\u0004\u0012|\u0006J\u0001\u0004")), method4967(method4966("Z'e,3_4\\\u001f\u0000z\u0006_\u0003\u0015B\u001bH\u0002\u0006o\nW")), method4967(method4966("p\u000eI\f")), method4967(method4966("Z'e,3_4W\u0018\ri\u0002N\b\u0019i\u001eH\b")), method4967(method4966("Z'e,3_4L\b\u0013i\u000eB2\u0012u\n^\b\u0013")), method4967(method4966("Z'e,3_4N\b\u0019i\u001eH\b>x\u0005L2\u0002r\u0006X\u0004\u000fx")), method4967(method4966("|\u000e[C$ZC")), method4967(method4966("Z'e(9I4\\\u001f\u0000p\u000eX\u0018\u0007{\u000eH2\u0003q\u0002N")), method4967(method4966("Z'e,3_4N\b\u0019i\u001eH\b>o\u000eY\u0019\u0000s\fV\b")), method4967(method4966("\u007f\u0019S\f\u000f=\u001b[\u0018\r")), method4967(method4966("p\nY")), method4967(method4966("|\u000e[C4^C")), method4967(method4966("|\u000e[C+XC")), method4967(method4966("|\u000e[C _C")), method4967(method4966("|\u000e[C#[C")), method4967(method4966("|\u000e[C+\\C")), method4967(method4966("|\u000e[C%[C")), method4967(method4966("|\u000e[C6XC")), method4967(method4966("|\u000e[C([C")), method4967(method4966("|\u000e[C\"ZC")), method4967(method4966("|\u000e[C\u0018|C")), method4967(method4966("|\u000e[C+YC")), method4967(method4966("|\u000e[C\"YC")), method4967(method4966("|\u000e[C&YC")), method4967(method4966("|\u000e[C\u001b|C")), method4967(method4966("|\u000e[C(_C")), method4967(method4966("|\u000e[C\u0019|C")), method4967(method4966("|\u000e[C7[C")), method4967(method4966("|\u000e[C0[C")), method4967(method4966("|\u000e[C#YC")), method4967(method4966("|\u000e[C2_C")), method4967(method4966("|\u000e[C$YC")), method4967(method4966("|\u000e[C1\\C")), method4967(method4966("|\u000e[C(XC")), method4967(method4966("|\u000e[C4XC")), method4967(method4966("|\u000e[C\r|C")), method4967(method4966("|\u000e[C0XC")), method4967(method4966("|\u000e[C(ZC")), method4967(method4966("|\u000e[C&^C")), method4967(method4966("|\u000e[C2YC")), method4967(method4966("|\u000e[C$5")), method4967(method4966("|\u000e[C5_C")), method4967(method4966("|\u000e[C*5")), method4967(method4966("|\u000e[C-ZC")), method4967(method4966("|\u000e[C#5")), method4967(method4966("|\u000e[C'^C")), method4967(method4966("|\u000e[C+[C")), method4967(method4966("|\u000e[C(YC")), method4967(method4966("|\u000e[C05")), method4967(method4966("|\u000e[C0\\C")), method4967(method4966("|\u000e[C,XC")), method4967(method4966("|\u000e[C%ZC")), method4967(method4966("|\u000e[C25")), method4967(method4966("|\u000e[C&5")), method4967(method4966("|\u000e[C.XC")), method4967(method4966("|\u000e[C85")), method4967(method4966("|\u000e[C0ZC")), method4967(method4966("|\u000e[C2\\C")), method4967(method4966("|\u000e[C\"XC")), method4967(method4966("|\u000e[C\u0013|C")), method4967(method4966("|\u000e[C1^C")), method4967(method4966("|\u000e[C)ZC")), method4967(method4966("|\u000e[C+ZC")), method4967(method4966("|\u000e[C3\\C")), method4967(method4966("|\u000e[C2XC")), method4967(method4966("|\u000e[C)[C")), method4967(method4966("|\u000e[C YC")), method4967(method4966("|\u000e[C XC")), method4967(method4966("|\u000e[C6_C")), method4967(method4966("|\u000e[C\b5")), method4967(method4966("|\u000e[C ^C")), method4967(method4966("|\u000e[C4YC")), method4967(method4966("|\u000e[C9\\C")), method4967(method4966("|\u000e[C7\\C")), method4967(method4966("|\u000e[C)XC")), method4967(method4966("|\u000e[C2[C")), method4967(method4966("|\u000e[C-XC")), method4967(method4966("|\u000e[C#_C")), method4967(method4966("|\u000e[C15")), method4967(method4966("|\u000e[C0YC")), method4967(method4966("|\u000e[C(5")), method4967(method4966("|\u000e[C-[C")), method4967(method4966("|\u000e[C1XC")), method4967(method4966("|\u000e[C95")), method4967(method4966("|\u000e[C$[C")), method4967(method4966("|\u000e[C6YC")), method4967(method4966("|\u000e[C*^C")), method4967(method4966("|\u000e[C#ZC")), method4967(method4966("n\u000eN$\u0006s\u0004H\b3x\u001b[\u0004\u000fi")), method4967(method4966("w\nL\fO|\u001cNC\"|\u0005L\f\u0012")), method4967(method4966("|\u000e[C3[C")), method4967(method4966("|\u000e[C'YC")), method4967(method4966("|\u000e[C+_C")), method4967(method4966("|\u000e[C45")), method4967(method4966("|\u000e[C%^C")), method4967(method4966("|\u000e[C*XC")), method4967(method4966("u\u000f")), method4967(method4966("w\nY\u0001\b\u007f")), method4967(method4966("w\n]\n\r")), method4967(method4966("Z'e,3_4R\f\r{4\\\u0001\u000e|\u001fe\u001d\be\u000eV")), method4967(method4966("|\u000e[C]t\u0005S\u0019_5")), method4967(method4966("o\n^\b\u000es")), method4967(method4966("nX\u001a\n\u0013|\u001bR\u0004\u0002n")), method4967(method4966("|\u000e[C5YC")), method4967(method4966("|\u000e[C\"5")), method4967(method4966("|\u000e[C/YC")), method4967(method4966("|\u000e[C1ZC")), method4967(method4966("|\u000e[C,[C")), method4967(method4966("|\u000e[C*YC")), method4967(method4966("|\u000e[C&XC")), method4967(method4966("|\u000e[C$XC")), method4967(method4966("|\u000e[C&ZC")), method4967(method4966("|\u000e[C5XC")), method4967(method4966("|\u000e[C)\\C")), method4967(method4966("|\u000e[C-\\C")), method4967(method4966("|\u000e[C0_C")), method4967(method4966("|\u000e[C\u00135")), method4967(method4966("|\u000e[C*\\C")), method4967(method4966("|\u000e[C,YC")), method4967(method4966("|\u000e[C1_C")), method4967(method4966("|\u000e[C,ZC")), method4967(method4966("|\u000e[C/ZC")), method4967(method4966("|\u000e[C(^C")), method4967(method4966("|\u000e[C2^C")), method4967(method4966("|\u000e[C3ZC")), method4967(method4966("|\u000e[C(\\C")), method4967(method4966("|\u000e[C._C")), method4967(method4966("|\u000e[C/XC")), method4967(method4966("|\u000e[C\u0005|C")), method4967(method4966("|\u000e[C&[C")), method4967(method4966("|\u000e[C,5")), method4967(method4966("|\u000e[C\u0000|C")), method4967(method4966("|\u000e[C;\\C")), method4967(method4966("|\u000e[C+^C")), method4967(method4966("|\u000e[C$^C")), method4967(method4966("|\u000e[C-YC")), method4967(method4966("|\u000e[C-5")), method4967(method4966("|\u000e[C 5")), method4967(method4966("|\u000e[C'[C")), method4967(method4966("|\u000e[C1[C")), method4967(method4966("|\u000e[C*[C")), method4967(method4966("|\u000e[C.^C")), method4967(method4966("|\u000e[C.5")), method4967(method4966("|\u000e[C7^C")), method4967(method4966("|\u000e[C,^C")), method4967(method4966("|\u000e[C)5")), method4967(method4966("|\u000e[C*ZC")), method4967(method4966("|\u000e[C\"_C")), method4967(method4966("|\u000e[C)_C")), method4967(method4966("|\u000e[C'_C")), method4967(method4966("|\u000e[C\u000f|C")), method4967(method4966("|\u000e[C&\\C")), method4967(method4966("|\u000e[C6^C")), method4967(method4966("|\u000e[C-_C")), method4967(method4966("|\u000e[C6[C")), method4967(method4966("|\u000e[C7YC")), method4967(method4966("|\u000e[C5ZC")), method4967(method4966("|\u000e[C5^C")), method4967(method4966("|\u000e[C4_C")), method4967(method4966("|\u000e[C/[C")), method4967(method4966("|\u000e[C3_C")), method4967(method4966("|\u000e[C#XC")), method4967(method4966("|\u000e[C2ZC")), method4967(method4966("|\u000e[C%YC")), method4967(method4966("|\u000e[C)YC")), method4967(method4966("|\u000e[C'XC")), method4967(method4966("|\u000e[C/_C")), method4967(method4966("|\u000e[C55")), method4967(method4966("|\u000e[C\u0011|C")), method4967(method4966("|\u000e[C1YC")), method4967(method4966("|\u000e[C0^C")), method4967(method4966("|\u000e[C65"))};
   @OriginalMember(
      owner = "client!aea",
      name = "le",
      descriptor = "Lhha;"
   )
   public static class724 field9510 = new class724(96, -2);
   @OriginalMember(
      owner = "client!aea",
      name = "Vf",
      descriptor = "I"
   )
   public static int field9658 = -1;
   @OriginalMember(
      owner = "client!aea",
      name = "Te",
      descriptor = "Z"
   )
   public static boolean field9669 = false;
   @OriginalMember(
      owner = "client!aea",
      name = "If",
      descriptor = "F"
   )
   public float field9720;
   @OriginalMember(
      owner = "client!aea",
      name = "Od",
      descriptor = "F"
   )
   public float field9721;
   @OriginalMember(
      owner = "client!aea",
      name = "ag",
      descriptor = "F"
   )
   private float field9723;
   @OriginalMember(
      owner = "client!aea",
      name = "qe",
      descriptor = "F"
   )
   public float field9748;
   @OriginalMember(
      owner = "client!aea",
      name = "Ob",
      descriptor = "F"
   )
   public float field9759;
   @OriginalMember(
      owner = "client!aea",
      name = "fe",
      descriptor = "F"
   )
   private float field9779;
   @OriginalMember(
      owner = "client!aea",
      name = "oh",
      descriptor = "F"
   )
   private float field9788;
   @OriginalMember(
      owner = "client!aea",
      name = "wb",
      descriptor = "F"
   )
   public float field9807;
   @OriginalMember(
      owner = "client!aea",
      name = "Kg",
      descriptor = "F"
   )
   public float field9809;
   @OriginalMember(
      owner = "client!aea",
      name = "v",
      descriptor = "I"
   )
   public static int field9465;
   @OriginalMember(
      owner = "client!aea",
      name = "be",
      descriptor = "I"
   )
   public static int field9466;
   @OriginalMember(
      owner = "client!aea",
      name = "u",
      descriptor = "I"
   )
   public static int field9467;
   @OriginalMember(
      owner = "client!aea",
      name = "Ub",
      descriptor = "I"
   )
   public static int field9468;
   @OriginalMember(
      owner = "client!aea",
      name = "Fc",
      descriptor = "I"
   )
   public static int field9469;
   @OriginalMember(
      owner = "client!aea",
      name = "xc",
      descriptor = "I"
   )
   public static int field9470;
   @OriginalMember(
      owner = "client!aea",
      name = "fc",
      descriptor = "I"
   )
   public static int field9471;
   @OriginalMember(
      owner = "client!aea",
      name = "fg",
      descriptor = "I"
   )
   public static int field9472;
   @OriginalMember(
      owner = "client!aea",
      name = "Df",
      descriptor = "I"
   )
   public static int field9473;
   @OriginalMember(
      owner = "client!aea",
      name = "Me",
      descriptor = "I"
   )
   public static int field9474;
   @OriginalMember(
      owner = "client!aea",
      name = "Wc",
      descriptor = "I"
   )
   public static int field9475;
   @OriginalMember(
      owner = "client!aea",
      name = "me",
      descriptor = "I"
   )
   public static int field9476;
   @OriginalMember(
      owner = "client!aea",
      name = "Ee",
      descriptor = "I"
   )
   public static int field9477;
   @OriginalMember(
      owner = "client!aea",
      name = "zf",
      descriptor = "I"
   )
   public static int field9478;
   @OriginalMember(
      owner = "client!aea",
      name = "Ye",
      descriptor = "I"
   )
   public static int field9479;
   @OriginalMember(
      owner = "client!aea",
      name = "Lf",
      descriptor = "I"
   )
   public static int field9480;
   @OriginalMember(
      owner = "client!aea",
      name = "Vd",
      descriptor = "I"
   )
   public static int field9481;
   @OriginalMember(
      owner = "client!aea",
      name = "Bd",
      descriptor = "I"
   )
   public static int field9482;
   @OriginalMember(
      owner = "client!aea",
      name = "Dc",
      descriptor = "I"
   )
   public static int field9483;
   @OriginalMember(
      owner = "client!aea",
      name = "J",
      descriptor = "I"
   )
   public static int field9484;
   @OriginalMember(
      owner = "client!aea",
      name = "Yg",
      descriptor = "I"
   )
   public static int field9485;
   @OriginalMember(
      owner = "client!aea",
      name = "ec",
      descriptor = "I"
   )
   public static int field9486;
   @OriginalMember(
      owner = "client!aea",
      name = "Ad",
      descriptor = "I"
   )
   public static int field9487;
   @OriginalMember(
      owner = "client!aea",
      name = "Sc",
      descriptor = "I"
   )
   public static int field9488;
   @OriginalMember(
      owner = "client!aea",
      name = "fd",
      descriptor = "I"
   )
   public static int field9489;
   @OriginalMember(
      owner = "client!aea",
      name = "Oe",
      descriptor = "I"
   )
   public static int field9490;
   @OriginalMember(
      owner = "client!aea",
      name = "Cc",
      descriptor = "I"
   )
   public static int field9491;
   @OriginalMember(
      owner = "client!aea",
      name = "Md",
      descriptor = "I"
   )
   public static int field9492;
   @OriginalMember(
      owner = "client!aea",
      name = "te",
      descriptor = "I"
   )
   public static int field9493;
   @OriginalMember(
      owner = "client!aea",
      name = "rg",
      descriptor = "I"
   )
   public static int field9494;
   @OriginalMember(
      owner = "client!aea",
      name = "ng",
      descriptor = "I"
   )
   public static int field9495;
   @OriginalMember(
      owner = "client!aea",
      name = "Ig",
      descriptor = "I"
   )
   public static int field9496;
   @OriginalMember(
      owner = "client!aea",
      name = "Nd",
      descriptor = "I"
   )
   public static int field9497;
   @OriginalMember(
      owner = "client!aea",
      name = "lb",
      descriptor = "I"
   )
   public static int field9498;
   @OriginalMember(
      owner = "client!aea",
      name = "Pd",
      descriptor = "I"
   )
   public static int field9499;
   @OriginalMember(
      owner = "client!aea",
      name = "P",
      descriptor = "I"
   )
   public static int field9500;
   @OriginalMember(
      owner = "client!aea",
      name = "Zd",
      descriptor = "I"
   )
   public static int field9501;
   @OriginalMember(
      owner = "client!aea",
      name = "vb",
      descriptor = "I"
   )
   public static int field9502;
   @OriginalMember(
      owner = "client!aea",
      name = "gh",
      descriptor = "I"
   )
   public static int field9503;
   @OriginalMember(
      owner = "client!aea",
      name = "mb",
      descriptor = "I"
   )
   public static int field9504;
   @OriginalMember(
      owner = "client!aea",
      name = "lc",
      descriptor = "I"
   )
   public static int field9505;
   @OriginalMember(
      owner = "client!aea",
      name = "B",
      descriptor = "I"
   )
   public static int field9506;
   @OriginalMember(
      owner = "client!aea",
      name = "bc",
      descriptor = "I"
   )
   public static int field9507;
   @OriginalMember(
      owner = "client!aea",
      name = "ld",
      descriptor = "I"
   )
   public static int field9508;
   @OriginalMember(
      owner = "client!aea",
      name = "pe",
      descriptor = "I"
   )
   public static int field9509;
   @OriginalMember(
      owner = "client!aea",
      name = "Jf",
      descriptor = "I"
   )
   public static int field9511;
   @OriginalMember(
      owner = "client!aea",
      name = "Yd",
      descriptor = "I"
   )
   public static int field9512;
   @OriginalMember(
      owner = "client!aea",
      name = "dc",
      descriptor = "I"
   )
   public static int field9513;
   @OriginalMember(
      owner = "client!aea",
      name = "Ic",
      descriptor = "I"
   )
   private int field9514;
   @OriginalMember(
      owner = "client!aea",
      name = "jf",
      descriptor = "I"
   )
   public static int field9515;
   @OriginalMember(
      owner = "client!aea",
      name = "Mf",
      descriptor = "I"
   )
   public static int field9516;
   @OriginalMember(
      owner = "client!aea",
      name = "Nf",
      descriptor = "I"
   )
   public static int field9517;
   @OriginalMember(
      owner = "client!aea",
      name = "Lc",
      descriptor = "I"
   )
   public static int field9518;
   @OriginalMember(
      owner = "client!aea",
      name = "hg",
      descriptor = "I"
   )
   public static int field9519;
   @OriginalMember(
      owner = "client!aea",
      name = "wg",
      descriptor = "I"
   )
   public static int field9521;
   @OriginalMember(
      owner = "client!aea",
      name = "Ve",
      descriptor = "I"
   )
   public static int field9522;
   @OriginalMember(
      owner = "client!aea",
      name = "Ff",
      descriptor = "I"
   )
   public static int field9523;
   @OriginalMember(
      owner = "client!aea",
      name = "Se",
      descriptor = "I"
   )
   public static int field9524;
   @OriginalMember(
      owner = "client!aea",
      name = "Rg",
      descriptor = "I"
   )
   public static int field9525;
   @OriginalMember(
      owner = "client!aea",
      name = "ob",
      descriptor = "I"
   )
   public static int field9526;
   @OriginalMember(
      owner = "client!aea",
      name = "cc",
      descriptor = "I"
   )
   public static int field9527;
   @OriginalMember(
      owner = "client!aea",
      name = "sd",
      descriptor = "I"
   )
   public static int field9529;
   @OriginalMember(
      owner = "client!aea",
      name = "dh",
      descriptor = "I"
   )
   public static int field9530;
   @OriginalMember(
      owner = "client!aea",
      name = "eg",
      descriptor = "I"
   )
   public static int field9531;
   @OriginalMember(
      owner = "client!aea",
      name = "yh",
      descriptor = "I"
   )
   public static int field9532;
   @OriginalMember(
      owner = "client!aea",
      name = "xb",
      descriptor = "I"
   )
   public static int field9533;
   @OriginalMember(
      owner = "client!aea",
      name = "db",
      descriptor = "I"
   )
   public static int field9534;
   @OriginalMember(
      owner = "client!aea",
      name = "T",
      descriptor = "I"
   )
   public static int field9535;
   @OriginalMember(
      owner = "client!aea",
      name = "ie",
      descriptor = "I"
   )
   public static int field9536;
   @OriginalMember(
      owner = "client!aea",
      name = "ye",
      descriptor = "I"
   )
   public static int field9537;
   @OriginalMember(
      owner = "client!aea",
      name = "uh",
      descriptor = "I"
   )
   public int field9538;
   @OriginalMember(
      owner = "client!aea",
      name = "Cd",
      descriptor = "I"
   )
   public static int field9539;
   @OriginalMember(
      owner = "client!aea",
      name = "bg",
      descriptor = "I"
   )
   public static int field9540;
   @OriginalMember(
      owner = "client!aea",
      name = "x",
      descriptor = "I"
   )
   public static int field9541;
   @OriginalMember(
      owner = "client!aea",
      name = "jg",
      descriptor = "I"
   )
   public static int field9542;
   @OriginalMember(
      owner = "client!aea",
      name = "Ag",
      descriptor = "I"
   )
   public static int field9543;
   @OriginalMember(
      owner = "client!aea",
      name = "mh",
      descriptor = "I"
   )
   public static int field9544;
   @OriginalMember(
      owner = "client!aea",
      name = "Jg",
      descriptor = "I"
   )
   public static int field9545;
   @OriginalMember(
      owner = "client!aea",
      name = "tg",
      descriptor = "I"
   )
   public static int field9546;
   @OriginalMember(
      owner = "client!aea",
      name = "ke",
      descriptor = "I"
   )
   public static int field9547;
   @OriginalMember(
      owner = "client!aea",
      name = "eh",
      descriptor = "I"
   )
   public static int field9548;
   @OriginalMember(
      owner = "client!aea",
      name = "Vb",
      descriptor = "I"
   )
   public static int field9549;
   @OriginalMember(
      owner = "client!aea",
      name = "jd",
      descriptor = "I"
   )
   public static int field9550;
   @OriginalMember(
      owner = "client!aea",
      name = "mf",
      descriptor = "I"
   )
   public static int field9551;
   @OriginalMember(
      owner = "client!aea",
      name = "Cg",
      descriptor = "I"
   )
   public static int field9552;
   @OriginalMember(
      owner = "client!aea",
      name = "Qb",
      descriptor = "I"
   )
   public static int field9553;
   @OriginalMember(
      owner = "client!aea",
      name = "xf",
      descriptor = "I"
   )
   public static int field9554;
   @OriginalMember(
      owner = "client!aea",
      name = "ne",
      descriptor = "I"
   )
   public static int field9555;
   @OriginalMember(
      owner = "client!aea",
      name = "Ef",
      descriptor = "I"
   )
   public static int field9556;
   @OriginalMember(
      owner = "client!aea",
      name = "Gf",
      descriptor = "I"
   )
   public static int field9557;
   @OriginalMember(
      owner = "client!aea",
      name = "mc",
      descriptor = "I"
   )
   public static int field9558;
   @OriginalMember(
      owner = "client!aea",
      name = "qc",
      descriptor = "I"
   )
   public static int field9559;
   @OriginalMember(
      owner = "client!aea",
      name = "Tg",
      descriptor = "I"
   )
   public static int field9560;
   @OriginalMember(
      owner = "client!aea",
      name = "Kf",
      descriptor = "I"
   )
   public static int field9561;
   @OriginalMember(
      owner = "client!aea",
      name = "ig",
      descriptor = "I"
   )
   public static int field9562;
   @OriginalMember(
      owner = "client!aea",
      name = "Ib",
      descriptor = "I"
   )
   public static int field9563;
   @OriginalMember(
      owner = "client!aea",
      name = "gd",
      descriptor = "I"
   )
   public static int field9564;
   @OriginalMember(
      owner = "client!aea",
      name = "yf",
      descriptor = "I"
   )
   public static int field9565;
   @OriginalMember(
      owner = "client!aea",
      name = "Y",
      descriptor = "I"
   )
   public static int field9566;
   @OriginalMember(
      owner = "client!aea",
      name = "Of",
      descriptor = "I"
   )
   public static int field9567;
   @OriginalMember(
      owner = "client!aea",
      name = "yb",
      descriptor = "I"
   )
   public static int field9568;
   @OriginalMember(
      owner = "client!aea",
      name = "cg",
      descriptor = "I"
   )
   public static int field9570;
   @OriginalMember(
      owner = "client!aea",
      name = "ve",
      descriptor = "I"
   )
   public static int field9571;
   @OriginalMember(
      owner = "client!aea",
      name = "wc",
      descriptor = "I"
   )
   public static int field9572;
   @OriginalMember(
      owner = "client!aea",
      name = "cf",
      descriptor = "I"
   )
   public static int field9573;
   @OriginalMember(
      owner = "client!aea",
      name = "vc",
      descriptor = "I"
   )
   public static int field9574;
   @OriginalMember(
      owner = "client!aea",
      name = "Ed",
      descriptor = "I"
   )
   public static int field9575;
   @OriginalMember(
      owner = "client!aea",
      name = "xe",
      descriptor = "I"
   )
   public static int field9576;
   @OriginalMember(
      owner = "client!aea",
      name = "eb",
      descriptor = "I"
   )
   public static int field9577;
   @OriginalMember(
      owner = "client!aea",
      name = "jc",
      descriptor = "I"
   )
   public static int field9578;
   @OriginalMember(
      owner = "client!aea",
      name = "yc",
      descriptor = "I"
   )
   public static int field9579;
   @OriginalMember(
      owner = "client!aea",
      name = "Id",
      descriptor = "I"
   )
   public static int field9580;
   @OriginalMember(
      owner = "client!aea",
      name = "ae",
      descriptor = "I"
   )
   public static int field9581;
   @OriginalMember(
      owner = "client!aea",
      name = "Yf",
      descriptor = "I"
   )
   public static int field9582;
   @OriginalMember(
      owner = "client!aea",
      name = "wd",
      descriptor = "I"
   )
   public static int field9583;
   @OriginalMember(
      owner = "client!aea",
      name = "kh",
      descriptor = "I"
   )
   public static int field9584;
   @OriginalMember(
      owner = "client!aea",
      name = "kb",
      descriptor = "I"
   )
   public static int field9585;
   @OriginalMember(
      owner = "client!aea",
      name = "Kc",
      descriptor = "I"
   )
   public static int field9586;
   @OriginalMember(
      owner = "client!aea",
      name = "Bf",
      descriptor = "I"
   )
   public static int field9587;
   @OriginalMember(
      owner = "client!aea",
      name = "nf",
      descriptor = "I"
   )
   public static int field9588;
   @OriginalMember(
      owner = "client!aea",
      name = "nc",
      descriptor = "I"
   )
   public static int field9589;
   @OriginalMember(
      owner = "client!aea",
      name = "he",
      descriptor = "I"
   )
   public static int field9590;
   @OriginalMember(
      owner = "client!aea",
      name = "Sb",
      descriptor = "I"
   )
   public static int field9591;
   @OriginalMember(
      owner = "client!aea",
      name = "K",
      descriptor = "I"
   )
   public static int field9592;
   @OriginalMember(
      owner = "client!aea",
      name = "M",
      descriptor = "I"
   )
   public static int field9593;
   @OriginalMember(
      owner = "client!aea",
      name = "ab",
      descriptor = "I"
   )
   public static int field9594;
   @OriginalMember(
      owner = "client!aea",
      name = "Dg",
      descriptor = "I"
   )
   public static int field9595;
   @OriginalMember(
      owner = "client!aea",
      name = "xg",
      descriptor = "I"
   )
   public static int field9596;
   @OriginalMember(
      owner = "client!aea",
      name = "qg",
      descriptor = "I"
   )
   public static int field9597;
   @OriginalMember(
      owner = "client!aea",
      name = "Pf",
      descriptor = "I"
   )
   public static int field9598;
   @OriginalMember(
      owner = "client!aea",
      name = "Bc",
      descriptor = "I"
   )
   public static int field9599;
   @OriginalMember(
      owner = "client!aea",
      name = "Xd",
      descriptor = "I"
   )
   public static int field9600;
   @OriginalMember(
      owner = "client!aea",
      name = "kc",
      descriptor = "I"
   )
   public static int field9601;
   @OriginalMember(
      owner = "client!aea",
      name = "W",
      descriptor = "I"
   )
   public static int field9602;
   @OriginalMember(
      owner = "client!aea",
      name = "xh",
      descriptor = "I"
   )
   public static int field9603;
   @OriginalMember(
      owner = "client!aea",
      name = "rb",
      descriptor = "I"
   )
   public static int field9604;
   @OriginalMember(
      owner = "client!aea",
      name = "Sg",
      descriptor = "I"
   )
   public static int field9605;
   @OriginalMember(
      owner = "client!aea",
      name = "Ce",
      descriptor = "I"
   )
   public static int field9606;
   @OriginalMember(
      owner = "client!aea",
      name = "Le",
      descriptor = "I"
   )
   public static int field9607;
   @OriginalMember(
      owner = "client!aea",
      name = "wf",
      descriptor = "I"
   )
   private int field9608;
   @OriginalMember(
      owner = "client!aea",
      name = "Xe",
      descriptor = "I"
   )
   public static int field9609;
   @OriginalMember(
      owner = "client!aea",
      name = "zb",
      descriptor = "I"
   )
   public static int field9610;
   @OriginalMember(
      owner = "client!aea",
      name = "R",
      descriptor = "I"
   )
   public static int field9611;
   @OriginalMember(
      owner = "client!aea",
      name = "Ne",
      descriptor = "I"
   )
   public static int field9612;
   @OriginalMember(
      owner = "client!aea",
      name = "sb",
      descriptor = "I"
   )
   public static int field9613;
   @OriginalMember(
      owner = "client!aea",
      name = "Z",
      descriptor = "I"
   )
   public static int field9614;
   @OriginalMember(
      owner = "client!aea",
      name = "ce",
      descriptor = "I"
   )
   public int field9615;
   @OriginalMember(
      owner = "client!aea",
      name = "Ug",
      descriptor = "I"
   )
   public static int field9616;
   @OriginalMember(
      owner = "client!aea",
      name = "Tb",
      descriptor = "I"
   )
   public static int field9617;
   @OriginalMember(
      owner = "client!aea",
      name = "oe",
      descriptor = "I"
   )
   public static int field9619;
   @OriginalMember(
      owner = "client!aea",
      name = "Kd",
      descriptor = "I"
   )
   public static int field9620;
   @OriginalMember(
      owner = "client!aea",
      name = "Hb",
      descriptor = "I"
   )
   public static int field9621;
   @OriginalMember(
      owner = "client!aea",
      name = "kg",
      descriptor = "I"
   )
   public static int field9622;
   @OriginalMember(
      owner = "client!aea",
      name = "Be",
      descriptor = "I"
   )
   public static int field9623;
   @OriginalMember(
      owner = "client!aea",
      name = "Ae",
      descriptor = "I"
   )
   public static int field9624;
   @OriginalMember(
      owner = "client!aea",
      name = "Sd",
      descriptor = "I"
   )
   public static int field9625;
   @OriginalMember(
      owner = "client!aea",
      name = "de",
      descriptor = "I"
   )
   public static int field9626;
   @OriginalMember(
      owner = "client!aea",
      name = "Ld",
      descriptor = "I"
   )
   public static int field9627;
   @OriginalMember(
      owner = "client!aea",
      name = "Uc",
      descriptor = "I"
   )
   public static int field9628;
   @OriginalMember(
      owner = "client!aea",
      name = "ac",
      descriptor = "I"
   )
   public static int field9629;
   @OriginalMember(
      owner = "client!aea",
      name = "Ac",
      descriptor = "I"
   )
   public static int field9630;
   @OriginalMember(
      owner = "client!aea",
      name = "gg",
      descriptor = "I"
   )
   public static int field9631;
   @OriginalMember(
      owner = "client!aea",
      name = "Eg",
      descriptor = "I"
   )
   public static int field9632;
   @OriginalMember(
      owner = "client!aea",
      name = "zd",
      descriptor = "I"
   )
   public static int field9633;
   @OriginalMember(
      owner = "client!aea",
      name = "Hg",
      descriptor = "I"
   )
   public static int field9634;
   @OriginalMember(
      owner = "client!aea",
      name = "Tf",
      descriptor = "I"
   )
   public static int field9635;
   @OriginalMember(
      owner = "client!aea",
      name = "Td",
      descriptor = "I"
   )
   public static int field9636;
   @OriginalMember(
      owner = "client!aea",
      name = "Bb",
      descriptor = "I"
   )
   public static int field9637;
   @OriginalMember(
      owner = "client!aea",
      name = "hb",
      descriptor = "I"
   )
   public static int field9638;
   @OriginalMember(
      owner = "client!aea",
      name = "Qd",
      descriptor = "I"
   )
   public static int field9639;
   @OriginalMember(
      owner = "client!aea",
      name = "og",
      descriptor = "I"
   )
   public static int field9640;
   @OriginalMember(
      owner = "client!aea",
      name = "C",
      descriptor = "I"
   )
   public static int field9641;
   @OriginalMember(
      owner = "client!aea",
      name = "Cb",
      descriptor = "I"
   )
   public static int field9642;
   @OriginalMember(
      owner = "client!aea",
      name = "ph",
      descriptor = "I"
   )
   public static int field9643;
   @OriginalMember(
      owner = "client!aea",
      name = "gc",
      descriptor = "I"
   )
   public static int field9644;
   @OriginalMember(
      owner = "client!aea",
      name = "df",
      descriptor = "I"
   )
   public static int field9645;
   @OriginalMember(
      owner = "client!aea",
      name = "Ie",
      descriptor = "I"
   )
   public static int field9646;
   @OriginalMember(
      owner = "client!aea",
      name = "re",
      descriptor = "I"
   )
   public static int field9647;
   @OriginalMember(
      owner = "client!aea",
      name = "Cf",
      descriptor = "I"
   )
   public static int field9648;
   @OriginalMember(
      owner = "client!aea",
      name = "mg",
      descriptor = "I"
   )
   public static int field9649;
   @OriginalMember(
      owner = "client!aea",
      name = "Tc",
      descriptor = "I"
   )
   public static int field9650;
   @OriginalMember(
      owner = "client!aea",
      name = "vf",
      descriptor = "I"
   )
   public static int field9652;
   @OriginalMember(
      owner = "client!aea",
      name = "pc",
      descriptor = "I"
   )
   public static int field9653;
   @OriginalMember(
      owner = "client!aea",
      name = "yg",
      descriptor = "I"
   )
   public static int field9654;
   @OriginalMember(
      owner = "client!aea",
      name = "pb",
      descriptor = "I"
   )
   public static int field9655;
   @OriginalMember(
      owner = "client!aea",
      name = "Og",
      descriptor = "I"
   )
   public static int field9656;
   @OriginalMember(
      owner = "client!aea",
      name = "X",
      descriptor = "I"
   )
   public static int field9657;
   @OriginalMember(
      owner = "client!aea",
      name = "qh",
      descriptor = "I"
   )
   public static int field9659;
   @OriginalMember(
      owner = "client!aea",
      name = "uc",
      descriptor = "I"
   )
   public static int field9660;
   @OriginalMember(
      owner = "client!aea",
      name = "Yc",
      descriptor = "I"
   )
   public static int field9662;
   @OriginalMember(
      owner = "client!aea",
      name = "jb",
      descriptor = "I"
   )
   public static int field9663;
   @OriginalMember(
      owner = "client!aea",
      name = "Qg",
      descriptor = "I"
   )
   public static int field9664;
   @OriginalMember(
      owner = "client!aea",
      name = "ah",
      descriptor = "I"
   )
   public static int field9665;
   @OriginalMember(
      owner = "client!aea",
      name = "Bg",
      descriptor = "I"
   )
   public static int field9671;
   @OriginalMember(
      owner = "client!aea",
      name = "Wd",
      descriptor = "I"
   )
   public static int field9672;
   @OriginalMember(
      owner = "client!aea",
      name = "rd",
      descriptor = "I"
   )
   public int field9679;
   @OriginalMember(
      owner = "client!aea",
      name = "md",
      descriptor = "I"
   )
   public int field9696;
   @OriginalMember(
      owner = "client!aea",
      name = "ed",
      descriptor = "I"
   )
   public int field9697;
   @OriginalMember(
      owner = "client!aea",
      name = "zg",
      descriptor = "I"
   )
   private int field9699;
   @OriginalMember(
      owner = "client!aea",
      name = "Qe",
      descriptor = "I"
   )
   private int field9712;
   @OriginalMember(
      owner = "client!aea",
      name = "tf",
      descriptor = "I"
   )
   private int field9713;
   @OriginalMember(
      owner = "client!aea",
      name = "ff",
      descriptor = "I"
   )
   private int field9714;
   @OriginalMember(
      owner = "client!aea",
      name = "Gc",
      descriptor = "I"
   )
   private int field9740;
   @OriginalMember(
      owner = "client!aea",
      name = "Zc",
      descriptor = "I"
   )
   public int field9746;
   @OriginalMember(
      owner = "client!aea",
      name = "O",
      descriptor = "I"
   )
   private int field9762;
   @OriginalMember(
      owner = "client!aea",
      name = "Ke",
      descriptor = "I"
   )
   private int field9763;
   @OriginalMember(
      owner = "client!aea",
      name = "Ud",
      descriptor = "I"
   )
   private int field9774;
   @OriginalMember(
      owner = "client!aea",
      name = "kd",
      descriptor = "I"
   )
   public int field9787;
   @OriginalMember(
      owner = "client!aea",
      name = "Fd",
      descriptor = "I"
   )
   private int field9797;
   @OriginalMember(
      owner = "client!aea",
      name = "We",
      descriptor = "I"
   )
   private int field9808;
   @OriginalMember(
      owner = "client!aea",
      name = "Hc",
      descriptor = "I"
   )
   public int field9811;
   @OriginalMember(
      owner = "client!aea",
      name = "je",
      descriptor = "I"
   )
   public int field9812;
   @OriginalMember(
      owner = "client!aea",
      name = "td",
      descriptor = "I"
   )
   private int field9813;
   @OriginalMember(
      owner = "client!aea",
      name = "Rc",
      descriptor = "I"
   )
   private int field9815;
   @OriginalMember(
      owner = "client!aea",
      name = "Q",
      descriptor = "I"
   )
   private int field9828;
   @OriginalMember(
      owner = "client!aea",
      name = "ad",
      descriptor = "I"
   )
   private int field9832;
   @OriginalMember(
      owner = "client!aea",
      name = "F",
      descriptor = "J"
   )
   private long field9707;
   @OriginalMember(
      owner = "client!aea",
      name = "L",
      descriptor = "Lbm;"
   )
   private class117 field9775;
   @OriginalMember(
      owner = "client!aea",
      name = "xd",
      descriptor = "Ldha;"
   )
   private class132 field9693;
   @OriginalMember(
      owner = "client!aea",
      name = "we",
      descriptor = "Lwi;"
   )
   private class373 field9690;
   @OriginalMember(
      owner = "client!aea",
      name = "kf",
      descriptor = "Lwi;"
   )
   private class373 field9691;
   @OriginalMember(
      owner = "client!aea",
      name = "nb",
      descriptor = "Lefa;"
   )
   private class436 field9754;
   @OriginalMember(
      owner = "client!aea",
      name = "Yb",
      descriptor = "Lwu;"
   )
   public class451 field9732;
   @OriginalMember(
      owner = "client!aea",
      name = "qd",
      descriptor = "Lwu;"
   )
   public class451 field9827;
   @OriginalMember(
      owner = "client!aea",
      name = "Jd",
      descriptor = "Luba;"
   )
   private class516 field9741;
   @OriginalMember(
      owner = "client!aea",
      name = "Vc",
      descriptor = "Luba;"
   )
   private class516 field9781;
   @OriginalMember(
      owner = "client!aea",
      name = "Rf",
      descriptor = "Lsd;"
   )
   private class603 field9688;
   @OriginalMember(
      owner = "client!aea",
      name = "ib",
      descriptor = "Lsd;"
   )
   public class603 field9810;
   @OriginalMember(
      owner = "client!aea",
      name = "vd",
      descriptor = "Lrv;"
   )
   public class71 field9717;
   @OriginalMember(
      owner = "client!aea",
      name = "Ge",
      descriptor = "Lrv;"
   )
   public class71 field9722;
   @OriginalMember(
      owner = "client!aea",
      name = "ge",
      descriptor = "Lrv;"
   )
   public class71 field9766;
   @OriginalMember(
      owner = "client!aea",
      name = "Ab",
      descriptor = "Lrv;"
   )
   public class71 field9776;
   @OriginalMember(
      owner = "client!aea",
      name = "Dd",
      descriptor = "Lrv;"
   )
   public class71 field9782;
   @OriginalMember(
      owner = "client!aea",
      name = "id",
      descriptor = "Lrv;"
   )
   public class71 field9784;
   @OriginalMember(
      owner = "client!aea",
      name = "Mc",
      descriptor = "Lrv;"
   )
   public class71 field9802;
   @OriginalMember(
      owner = "client!aea",
      name = "Zb",
      descriptor = "Lrv;"
   )
   public class71 field9818;
   @OriginalMember(
      owner = "client!aea",
      name = "wh",
      descriptor = "Lrv;"
   )
   public class71 field9820;
   @OriginalMember(
      owner = "client!aea",
      name = "Oc",
      descriptor = "Lrv;"
   )
   public class71 field9824;
   @OriginalMember(
      owner = "client!aea",
      name = "tc",
      descriptor = "Lss;"
   )
   private class723 field9726;
   @OriginalMember(
      owner = "client!aea",
      name = "A",
      descriptor = "Lmj;"
   )
   public static class730 field9661;
   @OriginalMember(
      owner = "client!aea",
      name = "Zf",
      descriptor = "Lmn;"
   )
   public class8 field9719;
   @OriginalMember(
      owner = "client!aea",
      name = "V",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   public NativeHeap field9685;
   @OriginalMember(
      owner = "client!aea",
      name = "Eb",
      descriptor = "Z"
   )
   private boolean field9706;
   @OriginalMember(
      owner = "client!aea",
      name = "S",
      descriptor = "Z"
   )
   private boolean field9708;
   @OriginalMember(
      owner = "client!aea",
      name = "Pc",
      descriptor = "Z"
   )
   private boolean field9710;
   @OriginalMember(
      owner = "client!aea",
      name = "sc",
      descriptor = "Z"
   )
   private boolean field9711;
   @OriginalMember(
      owner = "client!aea",
      name = "Pg",
      descriptor = "Z"
   )
   public boolean field9730;
   @OriginalMember(
      owner = "client!aea",
      name = "pg",
      descriptor = "Z"
   )
   public boolean field9734;
   @OriginalMember(
      owner = "client!aea",
      name = "oc",
      descriptor = "Z"
   )
   public boolean field9747;
   @OriginalMember(
      owner = "client!aea",
      name = "De",
      descriptor = "Z"
   )
   public boolean field9769;
   @OriginalMember(
      owner = "client!aea",
      name = "Wf",
      descriptor = "Z"
   )
   private boolean field9770;
   @OriginalMember(
      owner = "client!aea",
      name = "hc",
      descriptor = "Z"
   )
   private boolean field9783;
   @OriginalMember(
      owner = "client!aea",
      name = "pd",
      descriptor = "Z"
   )
   private boolean field9789;
   @OriginalMember(
      owner = "client!aea",
      name = "dg",
      descriptor = "Z"
   )
   public boolean field9791;
   @OriginalMember(
      owner = "client!aea",
      name = "bh",
      descriptor = "Z"
   )
   public boolean field9792;
   @OriginalMember(
      owner = "client!aea",
      name = "Af",
      descriptor = "Z"
   )
   private boolean field9793;
   @OriginalMember(
      owner = "client!aea",
      name = "Jb",
      descriptor = "Z"
   )
   private boolean field9800;
   @OriginalMember(
      owner = "client!aea",
      name = "vh",
      descriptor = "Z"
   )
   private boolean field9801;
   @OriginalMember(
      owner = "client!aea",
      name = "gf",
      descriptor = "Z"
   )
   public boolean field9804;
   @OriginalMember(
      owner = "client!aea",
      name = "lf",
      descriptor = "Z"
   )
   private boolean field9817;
   @OriginalMember(
      owner = "client!aea",
      name = "ch",
      descriptor = "Z"
   )
   public boolean field9819;
   @OriginalMember(
      owner = "client!aea",
      name = "I",
      descriptor = "Z"
   )
   public boolean field9821;
   @OriginalMember(
      owner = "client!aea",
      name = "qb",
      descriptor = "[Lln;"
   )
   private class719[] field9767;

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(Luba;I)V"
   )
   public final void method4884(class516 arg0, int arg1) {
      try {
         ++field9500;
         if (this.field9781 != arg0) {
            if (this.field9756) {
               OpenGL.glBindBufferARB(34962, arg0.method1399(false));
            }

            this.field9781 = arg0;
         }

         if (arg1 <= 33) {
            this.method235(-88, -58);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[100] + (arg0 != null ? field9834[8] : field9834[9]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "n",
      descriptor = "(B)V"
   )
   private final void method4885(byte arg0) {
      try {
         this.field9779 = (float)(-this.field9733 + this.field9738) - this.field9806;
         ++field9484;
         this.field9748 = -((float)this.field9751 * this.field9749) + this.field9779;
         if (this.field9748 < (float)this.field9768) {
            this.field9748 = (float)this.field9768;
         }

         OpenGL.glFogf(2915, this.field9748);
         OpenGL.glFogf(2916, this.field9779);
         class392.field5701[2] = (float)class697.method5101(255, this.field9814) / 255.0F;
         class392.field5701[1] = (float)class697.method5101(this.field9814, 65280) / 65280.0F;
         if (arg0 > 67) {
            class392.field5701[0] = (float)class697.method5101(this.field9814, 16711680) / 1.671168E7F;
            OpenGL.glFogfv(2918, class392.field5701, 0);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[81] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "M",
      descriptor = "()I"
   )
   public final int method149() {
      try {
         ++field9633;
         int var1 = this.field9832;
         this.field9832 = 0;
         return var1;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[184] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "h",
      descriptor = "(B)V"
   )
   private final void method4886(byte arg0) {
      try {
         OpenGL.glMatrixMode(5889);
         ++field9539;
         OpenGL.glLoadMatrixf(this.field9725, 0);
         OpenGL.glMatrixMode(5888);
         if (arg0 < 75) {
            this.field9753 = true;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[84] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "g",
      descriptor = "(B)V"
   )
   public static void method4887(byte arg0) {
      try {
         field9661 = null;
         int var1 = -83 % ((arg0 - -39) / 40);
         field9510 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[31] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "h",
      descriptor = "(I)V"
   )
   public final void method204(int arg0) {
      try {
         ++field9507;
         if (arg0 >= 128 && ~arg0 >= -1025) {
            this.field9668 = arg0;
            this.field9667.method5009(88);
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[163] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "aa",
      descriptor = "(IIIIII)V"
   )
   public final void method226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field9529;
         float var7 = (float)arg0 + 0.35F;
         float var8 = (float)arg1 + 0.35F;
         float var9 = (float)arg2 + var7;
         float var10 = (float)arg3 + var8;
         this.method4890((byte)-77);
         this.method4965(arg5, (byte)-80);
         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         if (this.field9800) {
            OpenGL.glDisable(32925);
         }

         OpenGL.glBegin(7);
         OpenGL.glVertex2f(var7, var8);
         OpenGL.glVertex2f(var7, var10);
         OpenGL.glVertex2f(var9, var10);
         OpenGL.glVertex2f(var9, var8);
         OpenGL.glEnd();
         if (this.field9800) {
            OpenGL.glEnable(32925);
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field9834[185] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(Luv;I)V"
   )
   public final void method169(class521 arg0, int arg1) {
      try {
         ++field9525;
         this.field9674.method4379(arg0, this, -1041, arg1);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[90] + (arg0 != null ? field9834[8] : field9834[9]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "na",
      descriptor = "(IIII)[I"
   )
   public final int[] method202(int arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field10022;

      try {
         ++field9498;
         int[] var6 = new int[arg2 * arg3];
         int var7 = 0;
         if (var5) {
            OpenGL.glReadPixelsi(arg0, this.field9538 - arg1 + -var7, arg2, 1, 32993, this.field9785, var6, arg2 * var7);
            ++var7;
         }

         while(true) {
            while(~var7 > ~arg3) {
               OpenGL.glReadPixelsi(arg0, this.field9538 - arg1 + -var7, arg2, 1, 32993, this.field9785, var6, arg2 * var7);
               ++var7;
            }

            if (!var5) {
               return var6;
            }

            ++var7;
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field9834[204] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(FFI)V"
   )
   public final void method4888(float arg0, float arg1, int arg2) {
      try {
         this.field9806 = arg0;
         ++field9628;
         if (arg2 != 8448) {
            this.method208();
         }

         this.field9749 = arg1;
         this.method4885((byte)114);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field9834[215] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method164(boolean arg0) {
      try {
         ++field9576;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[101] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "q",
      descriptor = "(I)V"
   )
   private final void method4889(int arg0) {
      boolean var2 = client.field10022;

      try {
         this.method4954(2912, -2);
         ++field9559;
         int var3 = this.field9811 - 1;
         if (var2) {
            this.method4958(var3, false);
            this.method4906(-2, (class719)null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            --var3;
         }

         while(true) {
            while(~var3 <= -1) {
               this.method4958(var3, false);
               this.method4906(-2, (class719)null);
               OpenGL.glTexEnvi(8960, 8704, 34160);
               --var3;
            }

            this.method4931(8448, 8448, 0);
            this.method4909(34168, 770, 2, (byte)107);
            this.method4915(5888);
            this.field9712 = 1;
            OpenGL.glEnable(3042);
            OpenGL.glBlendFunc(770, 771);
            this.field9714 = 1;
            OpenGL.glEnable(3008);
            OpenGL.glAlphaFunc(516, 0.0F);
            this.field9711 = true;
            OpenGL.glColorMask(true, true, true, true);
            this.field9706 = true;
            this.method4934(true, (byte)103);
            if (!var2) {
               if (arg0 > -101) {
                  this.field9727 = 24;
               }

               this.method4935(true, 3584);
               this.method4917(2929, true);
               this.method4894(true, (byte)82);
               this.method4953((byte)126);
               this.field9520.setSwapInterval(0);
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
                  var6 = 16384 - -var5;
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
                        this.field9760 = this.field9814 = -1;
                        this.method231();
                        return;
                     }
                  } else {
                     var10000 = 16384;
                     var10001 = -var5;
                  }

                  var6 = var10000 - var10001;
                  OpenGL.glLightfv(var6, 4608, var4, 0);
                  OpenGL.glLightf(var6, 4615, 0.0F);
                  OpenGL.glLightf(var6, 4616, 0.0F);
                  ++var5;
               }
            }

            OpenGL.glTexEnvi(arg0, -101, 34160);
            --var3;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field9834[224] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "r",
      descriptor = "(IIIIIII)I"
   )
   public final int method259(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field10022;

      try {
         int var11;
         label81: {
            ++field9522;
            float var9 = (float)arg2 * this.field9709.field4334 + (float)arg0 * this.field9709.field4330 + (float)arg1 * this.field9709.field4347 + this.field9709.field4339;
            float var10 = (float)arg5 * this.field9709.field4334 + (float)arg3 * this.field9709.field4330 + (float)arg4 * this.field9709.field4347 + this.field9709.field4339;
            var11 = 0;
            if (!(var9 < (float)this.field9768) || !((float)this.field9768 > var10)) {
               if (!(var9 > (float)this.field9738) || !(var10 > (float)this.field9738)) {
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
            int var12 = (int)(((float)arg2 * this.field9709.field4308 + (float)arg0 * this.field9709.field4306 + (float)arg1 * this.field9709.field4312 + this.field9709.field4307) * (float)this.field9735 / (float)arg6);
            int var13 = (int)(((float)arg5 * this.field9709.field4308 + (float)arg3 * this.field9709.field4306 + (float)arg4 * this.field9709.field4312 + this.field9709.field4307) * (float)this.field9735 / (float)arg6);
            if (!(this.field9809 > (float)var12) || !(this.field9809 > (float)var13)) {
               if (!(this.field9720 < (float)var12) || !((float)var13 > this.field9720)) {
                  break label82;
               }

               var11 |= 2;
               if (!var8) {
                  break label82;
               }
            }

            var11 |= 1;
         }

         int var14 = (int)(((float)arg2 * this.field9709.field4345 + (float)arg0 * this.field9709.field4333 + (float)arg1 * this.field9709.field4336 + this.field9709.field4321) * (float)this.field9822 / (float)arg6);
         int var15 = (int)(((float)arg5 * this.field9709.field4345 + (float)arg3 * this.field9709.field4333 + (float)arg4 * this.field9709.field4336 + this.field9709.field4321) * (float)this.field9822 / (float)arg6);
         if (!(this.field9721 > (float)var14) || !(this.field9721 > (float)var15)) {
            if (!((float)var14 > this.field9759) || !((float)var15 > this.field9759)) {
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
         throw class612.method4503(var17, field9834[170] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "l",
      descriptor = "()V"
   )
   public final void method151() {
      try {
         ++field9523;
         if (!this.field9729) {
            if (!this.field9789) {
               throw new RuntimeException("");
            }

            this.field9693.method1361(0, 0, this.field9615, this.field9538, 0, 0);
            this.field9520.setSurface(this.field9666);
            if (client.field10022) {
               throw new RuntimeException("");
            }
         } else {
            if (this.field9688 != this.field9691) {
               throw new RuntimeException();
            }

            this.field9688.method4444(16, 0);
            this.field9688.method4444(16, 8);
            this.method4951((byte)-127, this.field9688);
         }

         this.field9615 = this.field9608;
         this.field9693 = null;
         this.field9538 = this.field9514;
         this.method4953((byte)123);
         this.method4924((byte)-53);
         this.method231();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9834[192] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "o",
      descriptor = "()V"
   )
   public final void method207() {
      try {
         ++field9621;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9834[16] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "j",
      descriptor = "(B)V"
   )
   private final void method4890(byte arg0) {
      try {
         if (~this.field9713 != -2) {
            this.method4936(true);
            this.method4934(false, (byte)103);
            this.method4935(false, 3584);
            this.method4917(2929, false);
            this.method4894(false, (byte)90);
            this.method4906(-2, (class719)null);
            this.method4954(2912, -2);
            this.method4947(false, 1);
            this.field9713 = 1;
         }

         ++field9586;
         int var2 = -9 % ((10 - arg0) / 50);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[71] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "p",
      descriptor = "(B)V"
   )
   private final void method4891(byte arg0) {
      try {
         ++field9599;
         int var2 = 14 % ((18 - arg0) / 49);
         OpenGL.glLoadIdentity();
         OpenGL.glMultMatrixf(this.field9715.method2399(0), 0);
         if (this.field9753) {
            this.field9670.field3136.method4781(34336);
         }

         this.method4962(-120);
         this.method4937(0);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[88] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "x",
      descriptor = "()V"
   )
   public final void method210() {
      try {
         ++field9565;
         if (this.field9675 != null && this.field9675.method1207(-123)) {
            this.field9676.method5025(this.field9675, (byte)70);
            this.field9667.method5009(83);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9834[122] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(Lss;B)V"
   )
   public final void method4892(class723 arg0, byte arg1) {
      try {
         ++field9643;
         if (this.field9726 != arg0) {
            if (this.field9756) {
               OpenGL.glBindBufferARB(34963, arg0.method995(-58));
            }

            this.field9726 = arg0;
         }

         if (arg1 != -21) {
            this.field9705 = null;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[10] + (arg0 != null ? field9834[8] : field9834[9]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method4893(byte arg0) {
      try {
         if (~this.field9713 != -5) {
            this.method4936(true);
            this.method4934(false, (byte)103);
            this.method4935(false, 3584);
            this.method4917(2929, false);
            this.method4894(false, (byte)58);
            this.method4954(2912, -2);
            this.method4965(1, (byte)-77);
            this.field9713 = 4;
         }

         ++field9583;
         if (arg0 >= -17) {
            this.method4964(false, (class373)null);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "b",
      descriptor = "(ZB)V"
   )
   public final void method4894(boolean arg0, byte arg1) {
      try {
         ++field9517;
         if (arg1 <= 19) {
            this.field9608 = -101;
         }

         if (!this.field9708 == arg0) {
            this.field9708 = arg0;
            this.method4963(0);
            this.field9713 &= -32;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[169] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "HA",
      descriptor = "(IIII[I)V"
   )
   public final void method241(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
      try {
         ++field9475;
         float var6 = (float)arg2 * this.field9709.field4334 + (float)arg0 * this.field9709.field4330 + (float)arg1 * this.field9709.field4347 + this.field9709.field4339;
         if (!(var6 < (float)this.field9768) && !(var6 > (float)this.field9738)) {
            int var7 = (int)(((float)arg2 * this.field9709.field4308 + (float)arg0 * this.field9709.field4306 + (float)arg1 * this.field9709.field4312 + this.field9709.field4307) * (float)this.field9735 / (float)arg3);
            int var8 = (int)(((float)arg2 * this.field9709.field4345 + (float)arg0 * this.field9709.field4333 + (float)arg1 * this.field9709.field4336 + this.field9709.field4321) * (float)this.field9822 / (float)arg3);
            if (this.field9809 <= (float)var7 && (float)var7 <= this.field9720 && this.field9721 <= (float)var8 && this.field9759 >= (float)var8) {
               arg4[0] = (int)((float)var7 + -this.field9809);
               arg4[2] = (int)var6;
               arg4[1] = (int)((float)var8 + -this.field9721);
            } else {
               arg4[0] = arg4[1] = arg4[2] = -1;
            }
         } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field9834[167] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field9834[8] : field9834[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "c",
      descriptor = "(II)V"
   )
   public final void method182(int arg0, int arg1) throws class37 {
      try {
         ++field9481;

         try {
            this.field9520.swapBuffers();
         } catch (Exception var4) {
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field9834[110] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V"
   )
   public final void method206(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class37 {
      try {
         this.method182(arg2, arg3);
         ++field9607;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9834[140] + (arg0 != null ? field9834[8] : field9834[9]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(Lni;Ljj;)Lbh;"
   )
   public final class758 method261(class795 arg0, class334 arg1) {
      try {
         ++field9495;
         return null;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[121] + (arg0 != null ? field9834[8] : field9834[9]) + ',' + (arg1 != null ? field9834[8] : field9834[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "A",
      descriptor = "()V"
   )
   public final void method171() {
      try {
         ++field9610;
         if (this.field9724 && this.field9615 > 0 && this.field9538 > 0) {
            int var1 = this.field9727;
            int var2 = this.field9757;
            int var3 = this.field9771;
            int var4 = this.field9823;
            this.method231();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method4953((byte)127);
            this.method4934(false, (byte)103);
            this.method4935(false, 3584);
            this.method4917(2929, false);
            this.method4894(false, (byte)94);
            this.method4906(-2, (class719)null);
            this.method4954(2912, -2);
            this.method4947(false, 1);
            this.method4965(0, (byte)-100);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field9615, this.field9538, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method150(var1, var3, var2, var4);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9834[195] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "c",
      descriptor = "(B)Lcfa;"
   )
   public final class763 method4895(byte arg0) {
      try {
         ++field9659;
         if (arg0 >= -107) {
            this.field9792 = true;
         }

         return this.field9775 != null ? this.field9775.method1142(-108) : null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[168] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(Lbh;)V"
   )
   public final void method251(class758 arg0) {
      try {
         ++field9512;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[111] + (arg0 != null ? field9834[8] : field9834[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "ya",
      descriptor = "()V"
   )
   public final void method144() {
      try {
         ++field9546;
         this.method4894(true, (byte)35);
         OpenGL.glClear(256);
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9834[74] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "Y",
      descriptor = "()[I"
   )
   public final int[] method147() {
      try {
         ++field9665;
         return new int[]{this.field9737, this.field9798, this.field9735, this.field9822};
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9834[109] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(IJ)V"
   )
   public final synchronized void method4896(int arg0, long arg1) {
      try {
         ++field9557;
         class247 var4 = new class247();
         var4.field3777 = arg1;
         if (arg0 == 255) {
            this.field9705.method2238(var4, 13);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9834[175] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "b",
      descriptor = "(II)I"
   )
   public final int method246(int arg0, int arg1) {
      try {
         ++field9630;
         return arg0 | arg1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[25] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(IIIIIF)Lpha;"
   )
   public final class757 method220(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      try {
         ++field9511;
         return new class14(arg0, arg1, arg2, arg3, arg4, arg5);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field9834[99] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(Ljaclib/memory/Buffer;ZIIB)Luba;"
   )
   public final class516 method4897(Buffer arg0, boolean arg1, int arg2, int arg3, byte arg4) {
      try {
         ++field9501;
         if (!this.field9756 || arg1 && !this.field9761) {
            int var6 = -100 / ((arg4 - -21) / 55);
            return new class139(this, arg2, arg0);
         } else {
            return new class236(this, arg2, arg0, arg3, arg1);
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field9834[44] + (arg0 != null ? field9834[8] : field9834[9]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(FBFF)V"
   )
   private final void method4898(float arg0, byte arg1, float arg2, float arg3) {
      try {
         OpenGL.glMatrixMode(5890);
         ++field9647;
         if (this.field9801) {
            OpenGL.glLoadIdentity();
         }

         OpenGL.glTranslatef(arg0, arg2, arg3);
         if (arg1 < 27) {
            this.field9790 = null;
         }

         OpenGL.glMatrixMode(5888);
         this.field9801 = true;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9834[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(II[BZI)Lss;"
   )
   public final class723 method4899(int arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
      try {
         ++field9645;
         if (!this.field9756 || arg3 && !this.field9761) {
            int var6 = 26 % ((10 - arg1) / 63);
            return new class101(this, arg0, arg2, arg4);
         } else {
            return new class635(this, arg0, arg2, arg4, arg3);
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field9834[77] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9834[8] : field9834[9]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(IIIIII)Lns;"
   )
   public final class382 method143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field9509;
         return !this.field9819 ? null : new class689(this, arg0, arg1, arg2, arg3, arg4, arg5);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field9834[136] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "o",
      descriptor = "(B)V"
   )
   private final void method4900(byte arg0) {
      try {
         ++field9542;
         if (arg0 <= 11) {
            this.field9765 = null;
         }

         label29: {
            float[] var2 = this.field9725;
            float var3 = (float)(-this.field9737 * this.field9768) / (float)this.field9735;
            float var4 = (float)((-this.field9737 + this.field9615) * this.field9768) / (float)this.field9735;
            float var5 = (float)(this.field9798 * this.field9768) / (float)this.field9822;
            float var6 = (float)((-this.field9538 + this.field9798) * this.field9768) / (float)this.field9822;
            if (var3 == var4 || var5 == var6) {
               var2[15] = 1.0F;
               var2[10] = 1.0F;
               var2[12] = 0.0F;
               var2[0] = 1.0F;
               var2[2] = 0.0F;
               var2[6] = 0.0F;
               var2[11] = 0.0F;
               var2[9] = 0.0F;
               var2[4] = 0.0F;
               var2[1] = 0.0F;
               var2[3] = 0.0F;
               var2[5] = 1.0F;
               var2[8] = 0.0F;
               var2[14] = 0.0F;
               var2[13] = 0.0F;
               var2[7] = 0.0F;
               if (!client.field10022) {
                  break label29;
               }
            }

            float var7 = (float)this.field9768 * 2.0F;
            var2[11] = -1.0F;
            var2[12] = 0.0F;
            var2[10] = this.field9723 = (float)(-(this.field9768 + this.field9738)) / (float)(-this.field9768 + this.field9738);
            var2[7] = 0.0F;
            var2[13] = 0.0F;
            var2[9] = (var5 + var6) / (-var6 + var5);
            var2[6] = 0.0F;
            var2[3] = 0.0F;
            var2[4] = 0.0F;
            var2[14] = this.field9788 = -((float)this.field9738 * var7) / (float)(-this.field9768 + this.field9738);
            var2[2] = 0.0F;
            var2[0] = var7 / (var4 - var3);
            var2[1] = 0.0F;
            var2[5] = var7 / (-var6 + var5);
            var2[8] = (var3 + var4) / (var4 - var3);
            var2[15] = 0.0F;
         }

         this.method4923((byte)33);
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field9834[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method148(Canvas arg0, int arg1, int arg2) {
      try {
         long var4;
         label37: {
            ++field9590;
            var4 = 0L;
            if (arg0 != null && this.field9569 != arg0) {
               if (!this.field9618.containsKey(arg0)) {
                  break label37;
               }

               Long var6 = (Long)this.field9618.get(arg0);
               var4 = var6;
               if (!client.field10022) {
                  break label37;
               }
            }

            var4 = this.field9528;
         }

         if (var4 == 0L) {
            throw new RuntimeException();
         } else {
            this.field9520.surfaceResized(var4);
            if (this.field9651 == arg0) {
               this.method4948(15547);
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field9834[177] + (arg0 != null ? field9834[8] : field9834[9]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(BZIZ)V"
   )
   public final void method4901(byte arg0, boolean arg1, int arg2, boolean arg3) {
      try {
         ++field9570;
         if (this.field9797 != arg2 || this.field9792 == !this.field9753) {
            class8 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = !this.field9792 ? 0 : 3;
            if (arg2 < 0) {
               this.method4915(arg0 ^ -5897);
            } else {
               class390 var10;
               label79: {
                  var5 = this.field9667.method5006((byte)121, arg2);
                  var10 = super.field240.method2043(-37, arg2);
                  if (~var10.field5681 != -1 || var10.field5667 != 0) {
                     int var11 = var10.field5685 ? 64 : 128;
                     int var12 = var11 * 50;
                     this.method4898((float)(this.field9679 % var12 * var10.field5681) / (float)var12, (byte)72, (float)(this.field9679 % var12 * var10.field5667) / (float)var12, 0.0F);
                     if (!client.field10022) {
                        break label79;
                     }
                  }

                  this.method4915(arg0 ^ -5897);
               }

               var6 = var10.field5686;
               if (!this.field9792) {
                  var9 = var10.field5668;
                  var7 = var10.field5671;
                  var8 = var10.field5687;
               }
            }

            this.field9670.method1897(arg0 ^ -25081, arg3, var8, arg1, var7, var9);
            if (!this.field9670.method1898(var5, var6, true)) {
               this.method4906(-2, var5);
               this.method4947(false, var6);
            }

            this.field9797 = arg2;
            this.field9753 = this.field9792;
         }

         this.field9713 &= -8;
         if (arg0 != -9) {
            this.method256(89, -42, 28, -58);
         }
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field9834[26] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "()V"
   )
   public final void method193() {
      try {
         ++field9519;
         this.field9676.method5022(99);
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9834[188] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(Lmg;B)V"
   )
   public final void method4902(class290 arg0, byte arg1) {
      try {
         ++field9487;
         OpenGL.glLoadMatrixf(arg0.method2399(0), 0);
         if (arg1 <= 26) {
            this.method226(91, 36, -28, -91, -59, 24);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[7] + (arg0 != null ? field9834[8] : field9834[9]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "T",
      descriptor = "(IIII)V"
   )
   public final void method209(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (~this.field9757 < ~arg2) {
            this.field9757 = arg2;
         }

         ++field9620;
         if (~this.field9771 > ~arg1) {
            this.field9771 = arg1;
         }

         if (arg0 > this.field9727) {
            this.field9727 = arg0;
         }

         if (this.field9823 > arg3) {
            this.field9823 = arg3;
         }

         OpenGL.glEnable(3089);
         this.method4927(0);
         this.method4941(770);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9834[221] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "d",
      descriptor = "(IIIIII)V"
   )
   public final void method257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field9595;
         float var7 = (float)arg0 + 0.35F;
         float var8 = (float)arg1 + 0.35F;
         float var9 = (float)arg2 + var7 - 1.0F;
         float var10 = (float)arg3 + var8 - 1.0F;
         this.method4890((byte)124);
         this.method4965(arg5, (byte)-90);
         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         if (this.field9800) {
            OpenGL.glDisable(32925);
         }

         OpenGL.glBegin(2);
         OpenGL.glVertex2f(var7, var8);
         OpenGL.glVertex2f(var7, var10);
         OpenGL.glVertex2f(var9, var10);
         OpenGL.glVertex2f(var9, var8);
         OpenGL.glEnd();
         if (this.field9800) {
            OpenGL.glEnable(32925);
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field9834[27] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(II[I[I)Laa;"
   )
   public final class684 method224(int arg0, int arg1, int[] arg2, int[] arg3) {
      try {
         ++field9644;
         return class280.method2351(this, arg3, true, arg1, arg2, arg0);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9834[14] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9834[8] : field9834[9]) + ',' + (arg3 != null ? field9834[8] : field9834[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "t",
      descriptor = "(I)V"
   )
   private final void method4903(int arg0) {
      try {
         if (arg0 >= 126) {
            ++field9572;
            this.field9520.method5237();
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[114] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "p",
      descriptor = "()Z"
   )
   public final boolean method249() {
      try {
         ++field9617;
         return false;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9834[72] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method239(int[] arg0) {
      try {
         arg0[0] = this.field9615;
         arg0[1] = this.field9538;
         ++field9581;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[200] + (arg0 != null ? field9834[8] : field9834[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "da",
      descriptor = "(III[I)V"
   )
   public final void method221(int arg0, int arg1, int arg2, int[] arg3) {
      try {
         ++field9548;
         float var5 = (float)arg2 * this.field9709.field4334 + (float)arg0 * this.field9709.field4330 + (float)arg1 * this.field9709.field4347 + this.field9709.field4339;
         if (!((float)this.field9768 > var5) && !(var5 > (float)this.field9738)) {
            int var6 = (int)(((float)arg2 * this.field9709.field4308 + (float)arg0 * this.field9709.field4306 + (float)arg1 * this.field9709.field4312 + this.field9709.field4307) * (float)this.field9735 / var5);
            int var7 = (int)(((float)arg2 * this.field9709.field4345 + (float)arg0 * this.field9709.field4333 + (float)arg1 * this.field9709.field4336 + this.field9709.field4321) * (float)this.field9822 / var5);
            if ((float)var6 >= this.field9809 && (float)var6 <= this.field9720 && (float)var7 >= this.field9721 && (float)var7 <= this.field9759) {
               arg3[1] = (int)((float)var7 + -this.field9721);
               arg3[0] = (int)((float)var6 - this.field9809);
               arg3[2] = (int)var5;
            } else {
               arg3[0] = arg3[1] = arg3[2] = -1;
            }
         } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field9834[182] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9834[8] : field9834[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "v",
      descriptor = "()Lam;"
   )
   public final class56 method157() {
      boolean var1 = client.field10022;

      try {
         ++field9476;
         int var2 = -1;
         if (this.field9786.indexOf(field9834[1]) == -1) {
            if (~this.field9786.indexOf(field9834[4]) == 0) {
               if (this.field9786.indexOf(field9834[2]) == -1) {
                  return new class56(var2, field9834[3], this.field9808, this.field9728, 0L);
               }

               var2 = 4098;
               if (!var1) {
                  return new class56(var2, field9834[3], this.field9808, this.field9728, 0L);
               }
            }

            var2 = 32902;
            if (!var1) {
               return new class56(var2, field9834[3], this.field9808, this.field9728, 0L);
            }
         }

         var2 = 4318;
         return new class56(var2, field9834[3], this.field9808, this.field9728, 0L);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(Lwm;[Liaa;Z)Lda;"
   )
   public final class216 method170(class440 arg0, class433[] arg1, boolean arg2) {
      try {
         ++field9547;
         return new class241(this, arg0, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field9834[198] + (arg0 != null ? field9834[8] : field9834[9]) + ',' + (arg1 != null ? field9834[8] : field9834[9]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "d",
      descriptor = "(B)V"
   )
   private final void method4904(byte arg0) {
      try {
         this.field9767 = new class719[this.field9811];
         ++field9535;
         this.field9719 = new class8(this, 3553, 6408, 1, 1);
         new class8(this, 3553, 6408, 1, 1);
         if (arg0 >= 20) {
            new class8(this, 3553, 6408, 1, 1);
            this.field9802 = new class71(this);
            this.field9722 = new class71(this);
            this.field9784 = new class71(this);
            this.field9782 = new class71(this);
            this.field9766 = new class71(this);
            this.field9820 = new class71(this);
            this.field9818 = new class71(this);
            this.field9717 = new class71(this);
            this.field9824 = new class71(this);
            this.field9776 = new class71(this);
            if (this.field9729) {
               this.field9810 = new class603(this);
               new class603(this);
            }
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[105] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "F",
      descriptor = "(II)V"
   )
   public final void method235(int arg0, int arg1) {
      try {
         ++field9624;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "n",
      descriptor = "(I)V"
   )
   public final void method4905(int arg0) {
      try {
         if (arg0 != 65280) {
            this.method4891((byte)17);
         }

         OpenGL.glPushMatrix();
         ++field9543;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[117] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(ILln;)V"
   )
   public final void method4906(int arg0, class719 arg1) {
      boolean var3 = client.field10022;

      try {
         ++field9485;
         class719 var4 = this.field9767[this.field9815];
         if (arg1 != var4) {
            label47: {
               if (arg1 == null) {
                  OpenGL.glDisable(var4.field10295);
                  if (!var3) {
                     break label47;
                  }
               }

               label39: {
                  if (var4 != null) {
                     if (~arg1.field10295 == ~var4.field10295) {
                        break label39;
                     }

                     OpenGL.glDisable(var4.field10295);
                     OpenGL.glEnable(arg1.field10295);
                     if (!var3) {
                        break label39;
                     }
                  }

                  OpenGL.glEnable(arg1.field10295);
               }

               OpenGL.glBindTexture(arg1.field10295, arg1.method5210(21));
            }

            this.field9767[this.field9815] = arg1;
         }

         this.field9713 &= arg0;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9834[19] + arg0 + ',' + (arg1 != null ? field9834[8] : field9834[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "b",
      descriptor = "(Lmg;B)V"
   )
   public final void method4907(class290 arg0, byte arg1) {
      try {
         if (arg1 != 80) {
            this.field9666 = 9L;
         }

         ++field9555;
         OpenGL.glPushMatrix();
         OpenGL.glMultMatrixf(arg0.method2399(arg1 + -80), 0);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[164] + (arg0 != null ? field9834[8] : field9834[9]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "E",
      descriptor = "()I"
   )
   public final int method161() {
      try {
         ++field9631;
         return this.field9697 + this.field9696 + this.field9699;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9834[94] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "b",
      descriptor = "(B)V"
   )
   private final void method4908(byte arg0) {
      try {
         label24: {
            if (!this.field9770 || this.field9751 < 0) {
               OpenGL.glDisable(2912);
               if (!client.field10022) {
                  break label24;
               }
            }

            OpenGL.glEnable(2912);
         }

         int var2 = -7 % ((arg0 - -56) / 61);
         ++field9556;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[208] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(IIIB)V"
   )
   public final void method4909(int arg0, int arg1, int arg2, byte arg3) {
      try {
         OpenGL.glTexEnvi(8960, 34176 - -arg2, arg0);
         ++field9552;
         int var5 = 84 / ((-60 - arg3) / 37);
         OpenGL.glTexEnvi(8960, arg2 + 34192, arg1);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field9834[35] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "h",
      descriptor = "()Lgga;"
   )
   public final class502 method176() {
      try {
         ++field9540;
         return this.field9709;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9834[130] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(IIIIIILaa;II)V"
   )
   public final void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class684 arg6, int arg7, int arg8) {
      try {
         ++field9506;
         class61 var10 = (class61)arg6;
         class436 var11 = var10.field869;
         this.method4914(-17734);
         this.method4906(-2, var10.field869);
         this.method4965(arg5, (byte)-84);
         this.method4931(7681, 8448, 0);
         this.method4909(34167, 768, 0, (byte)10);
         float var12 = var11.field6385 / (float)var11.field6383;
         float var13 = var11.field6386 / (float)var11.field6378;
         float var14 = (float)(-arg0) + (float)arg2;
         float var15 = (float)arg3 - (float)arg1;
         float var16 = (float)(1.0D / Math.sqrt((double)(var14 * var14 + var15 * var15)));
         float var17 = var15 * var16;
         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         float var18 = var14 * var16;
         OpenGL.glBegin(1);
         OpenGL.glTexCoord2f((float)(-arg7 + arg0) * var12, (float)(-arg8 + arg1) * var13);
         OpenGL.glVertex2f((float)arg0 + 0.35F, (float)arg1 + 0.35F);
         OpenGL.glTexCoord2f((float)(-arg7 + arg2) * var12, (float)(-arg8 + arg3) * var13);
         OpenGL.glVertex2f((float)arg2 + var18 + 0.35F, (float)arg3 + var17 + 0.35F);
         OpenGL.glEnd();
         this.method4909(5890, 768, 0, (byte)-101);
      } catch (RuntimeException var20) {
         throw class612.method4503(var20, field9834[93] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field9834[8] : field9834[9]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "r",
      descriptor = "(I)V"
   )
   private final void method4910(int arg0) {
      try {
         if (arg0 != -8) {
            this.field9703 = null;
         }

         if (this.field9774 != 3) {
            this.field9774 = 3;
            this.method4916(24);
            this.method4891((byte)-33);
            this.field9713 &= -8;
         }

         ++field9584;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[33] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "d",
      descriptor = "(II)Lni;"
   )
   public final class795 method216(int arg0, int arg1) {
      try {
         ++field9466;
         return null;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[187] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method4911(int arg0, byte arg1) {
      try {
         ++field9649;
         class392.field5701[3] = (float)(arg0 >>> 24) / 255.0F;
         class392.field5701[0] = (float)class697.method5101(arg0, 16711680) / 1.671168E7F;
         if (arg1 >= 67) {
            class392.field5701[1] = (float)class697.method5101(arg0, 65280) / 65280.0F;
            class392.field5701[2] = (float)class697.method5101(255, arg0) / 255.0F;
            OpenGL.glTexEnvfv(8960, 8705, class392.field5701, 0);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[189] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "<init>",
      descriptor = "(Ljava/awt/Canvas;Ld;I)V"
   )
   public class678(Canvas param1, class672 param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V"
   )
   public final void method162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      try {
         ++field9471;
         this.method4890((byte)-48);
         this.method4965(arg12, (byte)-72);
         OpenGL.glBegin(4);
         OpenGL.glColor4ub((byte)(arg9 >> 16), (byte)(arg9 >> 8), (byte)arg9, (byte)(arg9 >> 24));
         OpenGL.glVertex3f((float)arg0 + 0.35F, (float)arg1 + 0.35F, (float)arg2);
         OpenGL.glColor4ub((byte)(arg10 >> 16), (byte)(arg10 >> 8), (byte)arg10, (byte)(arg10 >> 24));
         OpenGL.glVertex3f((float)arg3 + 0.35F, (float)arg4 + 0.35F, (float)arg5);
         OpenGL.glColor4ub((byte)(arg11 >> 16), (byte)(arg11 >> 8), (byte)arg11, (byte)(arg11 >> 24));
         OpenGL.glVertex3f((float)arg6 + 0.35F, (float)arg7 + 0.35F, (float)arg8);
         OpenGL.glEnd();
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field9834[39] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(IBIZ[B)Luba;"
   )
   public final class516 method4912(int arg0, byte arg1, int arg2, boolean arg3, byte[] arg4) {
      try {
         ++field9503;
         if (this.field9756 && (!arg3 || this.field9761)) {
            return new class236(this, arg0, arg4, arg2, arg3);
         } else {
            if (arg1 != 15) {
               this.method248(32, 121, 70, (int[])null);
            }

            return new class139(this, arg0, arg4, arg2);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field9834[209] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field9834[8] : field9834[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(Lwi;I)V"
   )
   public final void method4913(class373 arg0, int arg1) {
      try {
         ++field9491;
         if (arg1 != -15847) {
            this.method4926((class373)null, 39);
         }

         if (~this.field9687 <= -1 && this.field9686[this.field9687] == arg0) {
            this.field9686[this.field9687--] = null;
            arg0.method2921(arg1 + 28493);
            if (~this.field9687 > -1) {
               this.field9690 = null;
            } else {
               this.field9690 = this.field9686[this.field9687];
               this.field9690.method2925(arg1 + -1954);
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[116] + (arg0 != null ? field9834[8] : field9834[9]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method263(int arg0) {
      try {
         ++field9600;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[68] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "p",
      descriptor = "(I)V"
   )
   public final void method4914(int arg0) {
      try {
         if (arg0 != -17734) {
            this.method173(-107, (class684)null, -61, -8);
         }

         ++field9642;
         if (~this.field9713 != -3) {
            this.method4936(true);
            this.method4934(false, (byte)103);
            this.method4935(false, 3584);
            this.method4917(2929, false);
            this.method4894(false, (byte)77);
            this.method4954(2912, -2);
            this.field9713 = 2;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[138] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(Lns;Lns;FLns;)Lns;"
   )
   public final class382 method152(class382 arg0, class382 arg1, float arg2, class382 arg3) {
      try {
         ++field9672;
         if (arg0 != null && arg1 != null && this.field9819 && this.field9729) {
            class370 var5 = null;
            class117 var6 = (class117)arg0;
            class117 var7 = (class117)arg1;
            class763 var8 = var6.method1142(-128);
            class763 var9 = var7.method1142(-126);
            if (var8 != null && var9 != null) {
               int var10 = var9.field10884 < var8.field10884 ? var8.field10884 : var9.field10884;
               if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class370) {
                  class370 var11 = (class370)arg3;
                  if (var10 == var11.method2910((byte)73)) {
                     var5 = var11;
                  }
               }

               if (var5 == null) {
                  var5 = new class370(this, var10);
               }

               if (var5.method2909(var8, var9, arg2, 0)) {
                  return var5;
               }
            }
         }

         return !(arg2 < 0.5F) ? arg1 : arg0;
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field9834[24] + (arg0 != null ? field9834[8] : field9834[9]) + ',' + (arg1 != null ? field9834[8] : field9834[9]) + ',' + arg2 + ',' + (arg3 != null ? field9834[8] : field9834[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "q",
      descriptor = "()Z"
   )
   public final boolean method237() {
      try {
         ++field9602;
         return this.field9675 != null && this.field9675.method1207(95);
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9834[92] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;"
   )
   public final class751 method245(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      try {
         ++field9499;
         return new class6(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field9834[193] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9834[8] : field9834[9]) + ',' + (arg3 != null ? field9834[8] : field9834[9]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "d",
      descriptor = "(I)V"
   )
   private final void method4915(int arg0) {
      try {
         if (this.field9801) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field9801 = false;
         }

         if (arg0 == 5888) {
            ++field9568;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[179] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public final void method213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      boolean var10 = client.field10022;

      try {
         ++field9578;
         if (~arg0 != ~arg2 || ~arg1 != ~arg3) {
            float var14;
            float var15;
            float var16;
            float var17;
            float var18;
            float var19;
            float var20;
            float var21;
            label79: {
               this.method4890((byte)77);
               this.method4965(arg5, (byte)-74);
               float var11 = (float)arg2 - (float)arg0;
               float var12 = (float)arg3 - (float)arg1;
               float var13 = (float)(1.0D / Math.sqrt((double)(var11 * var11 + var12 * var12)));
               int var28 = arg8 % (arg6 + arg7);
               var14 = var11 * var13;
               var15 = var12 * var13;
               OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
               var16 = (float)arg6 * var14;
               var17 = (float)arg6 * var15;
               var18 = 0.0F;
               var19 = 0.0F;
               var20 = var16;
               var21 = var17;
               if (arg6 >= var28) {
                  var21 = (float)(-var28 + arg6) * var15;
                  var20 = (float)(-var28 + arg6) * var14;
                  if (!var10) {
                     break label79;
                  }
               }

               var19 = (float)(arg6 - -arg7 + -var28) * var15;
               var18 = (float)(arg6 + arg7 + -var28) * var14;
            }

            float var22 = (float)arg0 + 0.35F + var18;
            float var23 = (float)arg1 + 0.35F + var19;
            float var24 = (float)arg7 * var14;
            float var25 = (float)arg7 * var15;

            do {
               label86: {
                  int var10000;
                  label70: {
                     if (~arg2 >= ~arg0) {
                        float var29;
                        var10000 = (var29 = (float)arg2 + 0.35F - var22) == 0.0F ? 0 : (var29 < 0.0F ? -1 : 1);
                        if (var10) {
                           break label70;
                        }

                        if (var10000 > 0) {
                           break;
                        }

                        if (!(var20 + var22 < (float)arg2)) {
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

                  if (var20 + var22 > (float)arg2) {
                     var20 = (float)arg2 + -var22;
                  }
               }

               label88: {
                  if (~arg3 < ~arg1) {
                     if (var23 > (float)arg3 + 0.35F) {
                        break;
                     }

                     if (!(var21 + var23 > (float)arg3)) {
                        break label88;
                     }

                     var21 = (float)arg3 + -var23;
                     if (!var10) {
                        break label88;
                     }
                  }

                  if (var23 < (float)arg3 + 0.35F) {
                     break;
                  }

                  if ((float)arg3 > var21 + var23) {
                     var21 = (float)arg3 + -var23;
                  }
               }

               OpenGL.glBegin(1);
               OpenGL.glVertex2f(var22, var23);
               OpenGL.glVertex2f(var20 + var22, var21 + var23);
               var23 += var21 + var25;
               OpenGL.glEnd();
               var22 += var20 + var24;
               var21 = var17;
               var20 = var16;
            } while(!var10);

         }
      } catch (RuntimeException var27) {
         throw class612.method4503(var27, field9834[178] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method153(Canvas arg0) {
      try {
         ++field9505;
         if (this.field9569 == arg0) {
            throw new RuntimeException();
         } else if (this.field9618.containsKey(arg0)) {
            Long var2 = (Long)this.field9618.get(arg0);
            this.field9520.releaseSurface(arg0, var2);
            this.field9618.remove(arg0);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[225] + (arg0 != null ? field9834[8] : field9834[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "y",
      descriptor = "()Lgga;"
   )
   public final class502 method183() {
      try {
         ++field9609;
         return new class290();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9834[106] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "n",
      descriptor = "()V"
   )
   public final void method178() {
      try {
         ++field9579;
         OpenGL.glFinish();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9834[194] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "j",
      descriptor = "(I)Lza;"
   )
   public final class348 method167(int arg0) {
      try {
         ++field9641;
         class55 var2 = new class55(arg0);
         this.field9681.method2238(var2, 13);
         return var2;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[83] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "B",
      descriptor = "()Z"
   )
   public final boolean method180() {
      try {
         ++field9613;
         return this.field9670.method1899(3, -68);
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9834[30] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "x",
      descriptor = "(I)V"
   )
   private final void method4916(int arg0) {
      try {
         ++field9567;
         if (arg0 == 24) {
            float var2 = (float)(-this.field9737) * this.field9743 / (float)this.field9735;
            float var3 = (float)(-this.field9798) * this.field9743 / (float)this.field9822;
            float var4 = (float)(-this.field9737 + this.field9615) * this.field9743 / (float)this.field9735;
            float var5 = (float)(-this.field9798 + this.field9538) * this.field9743 / (float)this.field9822;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (var2 != var4 && var3 != var5) {
               OpenGL.glOrtho((double)var2, (double)var4, (double)(-var5), (double)(-var3), (double)this.field9768, (double)this.field9738);
            }

            OpenGL.glMatrixMode(5888);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field9834[103] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "P",
      descriptor = "(IIIII)V"
   )
   public final void method145(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field9663;
         this.method4890((byte)-47);
         this.method4965(arg4, (byte)-79);
         float var6 = (float)arg0 + 0.35F;
         OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
         float var7 = (float)arg1 + 0.35F;
         OpenGL.glBegin(1);
         OpenGL.glVertex2f(var6, var7);
         OpenGL.glVertex2f(var6, (float)arg2 + var7);
         OpenGL.glEnd();
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field9834[132] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method4917(int arg0, boolean arg1) {
      try {
         ++field9497;
         if (arg0 != 2929) {
            this.method236(-110, 80);
         }

         if (this.field9710 == !arg1) {
            label27: {
               if (!arg1) {
                  OpenGL.glDisable(2929);
                  if (!client.field10022) {
                     break label27;
                  }
               }

               OpenGL.glEnable(2929);
            }

            this.field9713 &= -32;
            this.field9710 = arg1;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[87] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(Lza;)V"
   )
   public final void method189(class348 arg0) {
      try {
         this.field9685 = ((class55)arg0).field800;
         ++field9489;
         if (this.field9741 == null) {
            class637 var2;
            label26: {
               var2 = new class637(80);
               if (this.field9826) {
                  var2.method4649(-1.0F, 1409);
                  var2.method4649(-1.0F, 1409);
                  var2.method4649(0.0F, 1409);
                  var2.method4649(0.0F, 1409);
                  var2.method4649(1.0F, 1409);
                  var2.method4649(1.0F, 1409);
                  var2.method4649(-1.0F, 1409);
                  var2.method4649(0.0F, 1409);
                  var2.method4649(1.0F, 1409);
                  var2.method4649(1.0F, 1409);
                  var2.method4649(1.0F, 1409);
                  var2.method4649(1.0F, 1409);
                  var2.method4649(0.0F, 1409);
                  var2.method4649(1.0F, 1409);
                  var2.method4649(0.0F, 1409);
                  var2.method4649(-1.0F, 1409);
                  var2.method4649(1.0F, 1409);
                  var2.method4649(0.0F, 1409);
                  var2.method4649(0.0F, 1409);
                  var2.method4649(0.0F, 1409);
                  if (!client.field10022) {
                     break label26;
                  }
               }

               var2.method4648(14571, -1.0F);
               var2.method4648(14571, -1.0F);
               var2.method4648(14571, 0.0F);
               var2.method4648(14571, 0.0F);
               var2.method4648(14571, 1.0F);
               var2.method4648(14571, 1.0F);
               var2.method4648(14571, -1.0F);
               var2.method4648(14571, 0.0F);
               var2.method4648(14571, 1.0F);
               var2.method4648(14571, 1.0F);
               var2.method4648(14571, 1.0F);
               var2.method4648(14571, 1.0F);
               var2.method4648(14571, 0.0F);
               var2.method4648(14571, 1.0F);
               var2.method4648(14571, 0.0F);
               var2.method4648(14571, -1.0F);
               var2.method4648(14571, 1.0F);
               var2.method4648(14571, 0.0F);
               var2.method4648(14571, 0.0F);
               var2.method4648(14571, 0.0F);
            }

            this.field9741 = this.method4912(20, (byte)15, var2.field945, false, var2.field942);
            this.field9827 = new class451(this.field9741, 5126, 3, 0);
            this.field9732 = new class451(this.field9741, 5126, 2, 12);
            this.field9674.method4384(this, 8);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[159] + (arg0 != null ? field9834[8] : field9834[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "pa",
      descriptor = "()V"
   )
   public final void method192() {
      try {
         ++field9566;
         this.field9792 = false;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9834[222] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "K",
      descriptor = "([I)V"
   )
   public final void method211(int[] arg0) {
      try {
         arg0[1] = this.field9771;
         ++field9515;
         arg0[0] = this.field9727;
         arg0[2] = this.field9757;
         arg0[3] = this.field9823;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[96] + (arg0 != null ? field9834[8] : field9834[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "u",
      descriptor = "()Z"
   )
   public final boolean method208() {
      try {
         ++field9472;
         return true;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9834[214] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "o",
      descriptor = "(I)V"
   )
   private final void method4918(int arg0) {
      try {
         class392.field5701[0] = this.field9807 * this.field9796;
         ++field9478;
         class392.field5701[1] = this.field9807 * this.field9794;
         class392.field5701[3] = 1.0F;
         class392.field5701[2] = this.field9807 * this.field9799;
         if (arg0 != 20271) {
            this.method229();
         }

         OpenGL.glLightModelfv(2899, class392.field5701, 0);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "g",
      descriptor = "(II)V"
   )
   public final synchronized void method4919(int arg0, int arg1) {
      try {
         ++field9587;
         class288 var3 = new class288(arg1);
         if (arg0 != 4) {
            this.method175(-75);
         }

         this.field9702.method2238(var3, arg0 + 9);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field9834[107] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "e",
      descriptor = "(II)Ljj;"
   )
   public final class334 method236(int arg0, int arg1) {
      try {
         ++field9564;
         return null;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[206] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "b",
      descriptor = "(Lwi;I)V"
   )
   public final void method4920(class373 arg0, int arg1) {
      try {
         ++field9468;
         if (~this.field9689 <= -1 && this.field9692[this.field9689] == arg0) {
            this.field9692[this.field9689--] = null;
            arg0.method2923(false);
            if (arg1 == 1729665456) {
               if (~this.field9689 <= -1) {
                  this.field9691 = this.field9692[this.field9689];
                  this.field9691.method2924((byte)60);
               } else {
                  this.field9691 = null;
               }
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[43] + (arg0 != null ? field9834[8] : field9834[9]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(FFBFF)V"
   )
   public final void method4921(float arg0, float arg1, byte arg2, float arg3, float arg4) {
      try {
         ++field9664;
         class392.field5701[2] = arg1;
         class392.field5701[3] = arg4;
         if (arg2 > 12) {
            class392.field5701[0] = arg0;
            class392.field5701[1] = arg3;
            OpenGL.glTexEnvfv(8960, 8705, class392.field5701, 0);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field9834[212] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "b",
      descriptor = "(IIZ)V"
   )
   public final void method4922(int arg0, int arg1, boolean arg2) {
      try {
         ++field9626;
         this.field9780 = arg0;
         this.field9772 = arg1;
         this.method4924((byte)-53);
         this.method4941(770);
         if (arg2) {
            this.field9673 = 57;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field9834[210] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "i",
      descriptor = "(B)V"
   )
   private final void method4923(byte arg0) {
      try {
         this.field9725[10] = this.field9723;
         this.field9725[14] = this.field9788;
         ++field9465;
         this.field9744 = (float)this.field9738;
         if (arg0 != 33) {
            this.method204(-48);
         }

         this.field9764 = (this.field9725[14] + (float)(-this.field9738)) / this.field9725[10];
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[128] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "e",
      descriptor = "(B)V"
   )
   private final void method4924(byte arg0) {
      try {
         OpenGL.glViewport(this.field9780, this.field9772, this.field9615, this.field9538);
         if (arg0 == -53) {
            ++field9636;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[42] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(BIZ)V"
   )
   public final void method4925(byte arg0, int arg1, boolean arg2) {
      try {
         if (arg0 < 87) {
            this.field9737 = 45;
         }

         this.method4901((byte)-9, true, arg1, arg2);
         ++field9585;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field9834[220] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "j",
      descriptor = "()Z"
   )
   public final boolean method242() {
      try {
         ++field9550;
         return true;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9834[18] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "d",
      descriptor = "()Z"
   )
   public final boolean method260() {
      try {
         ++field9562;
         return false;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9834[162] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "c",
      descriptor = "(Lwi;I)V"
   )
   public final void method4926(class373 arg0, int arg1) {
      try {
         ++field9531;
         if (~this.field9689 <= arg1) {
            throw new RuntimeException();
         } else {
            if (~this.field9689 <= -1) {
               this.field9692[this.field9689].method2923(false);
            }

            this.field9691 = this.field9692[++this.field9689] = arg0;
            this.field9691.method2924((byte)60);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[174] + (arg0 != null ? field9834[8] : field9834[9]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(Lns;)V"
   )
   public final void method166(class382 arg0) {
      try {
         ++field9596;
         this.field9775 = (class117)arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[115] + (arg0 != null ? field9834[8] : field9834[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "v",
      descriptor = "(I)V"
   )
   private final void method4927(int arg0) {
      try {
         this.field9809 = (float)(this.field9727 - this.field9737);
         ++field9553;
         this.field9759 = (float)(-this.field9798 + this.field9823);
         this.field9721 = (float)(this.field9771 - this.field9798);
         this.field9720 = (float)(-this.field9737 + this.field9757);
         if (arg0 != 0) {
            this.method4949((byte)33);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[34] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "GA",
      descriptor = "(I)V"
   )
   public final void method184(int arg0) {
      try {
         this.method4965(0, (byte)-118);
         ++field9654;
         OpenGL.glClearColor((float)(16711680 & arg0) / 1.671168E7F, (float)(65280 & arg0) / 65280.0F, (float)(255 & arg0) / 255.0F, (float)(arg0 >>> 24) / 255.0F);
         OpenGL.glClear(16384);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[205] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V"
   )
   public final void method244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class684 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      boolean var13 = client.field10022;

      try {
         ++field9582;
         if (arg0 != arg2 || ~arg1 != ~arg3) {
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
               class61 var14 = (class61)arg6;
               class436 var15 = var14.field869;
               this.method4914(-17734);
               this.method4906(-2, var14.field869);
               this.method4965(arg5, (byte)-100);
               this.method4931(7681, 8448, 0);
               this.method4909(34167, 768, 0, (byte)-11);
               var16 = var15.field6385 / (float)var15.field6383;
               var17 = var15.field6386 / (float)var15.field6378;
               float var18 = (float)arg2 - (float)arg0;
               float var19 = (float)(-arg1) + (float)arg3;
               float var20 = (float)(1.0D / Math.sqrt((double)(var18 * var18 + var19 * var19)));
               var21 = var18 * var20;
               OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
               var22 = var19 * var20;
               int var35 = arg11 % (arg9 + arg10);
               var23 = (float)arg9 * var21;
               var24 = (float)arg9 * var22;
               var25 = 0.0F;
               var26 = 0.0F;
               var27 = var23;
               var28 = var24;
               if (arg9 < var35) {
                  var26 = (float)(arg9 - var35 + arg10) * var22;
                  var25 = (float)(-var35 + arg9 + arg10) * var21;
                  if (!var13) {
                     break label87;
                  }
               }

               var28 = (float)(-var35 + arg9) * var22;
               var27 = (float)(-var35 + arg9) * var21;
            }

            float var29 = (float)arg0 + 0.35F + var25;
            float var30 = (float)arg1 + 0.35F + var26;
            float var31 = (float)arg10 * var21;
            float var32 = (float)arg10 * var22;

            do {
               label94: {
                  int var10000;
                  label78: {
                     if (~arg2 >= ~arg0) {
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

                        var27 = (float)arg2 + -var29;
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
                  if (~arg3 < ~arg1) {
                     if (var30 > (float)arg3 + 0.35F) {
                        break;
                     }

                     if (!((float)arg3 < var28 + var30)) {
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
               OpenGL.glEnd();
               var30 += var28 + var32;
               var29 += var27 + var31;
               var28 = var24;
               var27 = var23;
            } while(!var13);

            this.method4909(5890, 768, 0, (byte)112);
         }
      } catch (RuntimeException var34) {
         throw class612.method4503(var34, field9834[40] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field9834[8] : field9834[9]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "m",
      descriptor = "()Lgga;"
   )
   public final class502 method254() {
      try {
         ++field9551;
         return this.field9677;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9834[157] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "DA",
      descriptor = "(IIII)V"
   )
   public final void method256(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field9798 = arg1;
         this.field9822 = arg3;
         ++field9504;
         this.field9737 = arg0;
         this.field9735 = arg2;
         this.method4900((byte)32);
         this.method4927(0);
         if (~this.field9774 != -4) {
            if (this.field9774 == 2) {
               this.method4886((byte)109);
               return;
            }
         } else {
            this.method4916(24);
         }

      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9834[36] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "c",
      descriptor = "(Z)V"
   )
   public final void method228(boolean arg0) {
      try {
         ++field9494;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[202] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "X",
      descriptor = "(I)V"
   )
   public final void method160(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!aea",
      name = "s",
      descriptor = "()V"
   )
   public final void method229() {
      boolean var1 = client.field10022;

      try {
         ++field9532;
         class247 var2 = this.field9681.method2245((byte)-94);
         if (var1) {
            ((class55)var2).method582(-48);
            var2 = this.field9681.method2239((byte)112);
         }

         while(true) {
            while(var2 != null) {
               ((class55)var2).method582(-48);
               var2 = this.field9681.method2239((byte)112);
            }

            if (!var1) {
               if (this.field9676 != null) {
                  this.field9676.method5024((byte)122);
               }

               if (this.field9520 != null) {
                  Object var10000;
                  label47: {
                     this.method4903(127);
                     Enumeration var3 = this.field9618.keys();
                     if (var1) {
                        var10000 = var3.nextElement();
                     } else if (!var3.hasMoreElements()) {
                        this.field9520.release();
                        var10000 = this;
                        if (!var1) {
                           break label47;
                        }
                     } else {
                        var10000 = var3.nextElement();
                     }

                     while(true) {
                        Canvas var4 = (Canvas)var10000;
                        Long var5 = (Long)this.field9618.get(var4);
                        this.field9520.releaseSurface(var4, var5);
                        if (!var3.hasMoreElements()) {
                           this.field9520.release();
                           var10000 = this;
                           if (!var1) {
                              break;
                           }
                        } else {
                           var10000 = var3.nextElement();
                        }
                     }
                  }

                  ((class678)var10000).field9520 = null;
               }

               if (this.field9680) {
                  class130.method1327(false, true, 103);
                  this.field9680 = false;
                  return;
               }

               return;
            }

            var2 = this.field9681.method2239((byte)112);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field9834[166] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         OpenGL.glLineWidth((float)arg5);
         ++field9588;
         this.method196(arg0, arg1, arg2, arg3, arg4, arg6);
         OpenGL.glLineWidth(1.0F);
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field9834[127] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "k",
      descriptor = "(II)I"
   )
   public final int method4928(int arg0, int arg1) {
      try {
         ++field9554;
         if (arg0 != 7896) {
            return -53;
         } else if (~arg1 != -5122 && arg1 != 5120) {
            if (~arg1 != -5124 && arg1 != 5122) {
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
         throw class612.method4503(var4, field9834[131] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "j",
      descriptor = "(II)V"
   )
   public final synchronized void method4929(int arg0, int arg1) {
      try {
         if (arg0 != -30912) {
            this.field9673 = -122;
         }

         ++field9477;
         class247 var3 = new class247();
         var3.field3777 = (long)arg1;
         this.field9704.method2238(var3, 13);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field9834[38] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "KA",
      descriptor = "(IIII)V"
   )
   public final void method150(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (~this.field9615 > ~arg2) {
            arg2 = this.field9615;
         }

         if (~arg1 > -1) {
            arg1 = 0;
         }

         if (this.field9538 < arg3) {
            arg3 = this.field9538;
         }

         ++field9656;
         if (arg0 < 0) {
            arg0 = 0;
         }

         this.field9771 = arg1;
         this.field9727 = arg0;
         this.field9757 = arg2;
         this.field9823 = arg3;
         OpenGL.glEnable(3089);
         this.method4927(0);
         this.method4941(770);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9834[171] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "z",
      descriptor = "()Z"
   )
   public final boolean method190() {
      try {
         ++field9619;
         return true;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9834[85] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "b",
      descriptor = "(I)V"
   )
   public final synchronized void method252(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field9530;
         int var3 = 0;
         int var15 = arg0 & Integer.MAX_VALUE;
         int var10000;
         if (var2 || !this.field9700.method2242(23702)) {
            do {
               class288 var4 = (class288)this.field9700.method2235(-1);
               class742.field10570[var3++] = (int)var4.field3777;
               this.field9697 -= var4.field4298;
               var10000 = var3;

               while(var10000 == 1000) {
                  OpenGL.glDeleteBuffersARB(var3, class742.field10570, 0);
                  var10000 = 0;
                  if (!var2) {
                     var3 = 0;
                     break;
                  }
               }
            } while(!this.field9700.method2242(23702));
         }

         class288 var5;
         class288 var6;
         class288 var7;
         boolean var8;
         class288 var9;
         class247 var10;
         class247 var11;
         class288 var12;
         byte var16;
         class678 var18;
         if (~var3 < -1) {
            OpenGL.glDeleteBuffersARB(var3, class742.field10570, 0);
            var3 = 0;
            if (var2) {
               var5 = (class288)this.field9701.method2235(104);
               class742.field10570[var3++] = (int)var5.field3777;
               this.field9696 -= var5.field4298;
               var10000 = var3;
            } else {
               if (this.field9701.method2242(23702)) {
                  label687: {
                     if (~var3 < -1) {
                        OpenGL.glDeleteTextures(var3, class742.field10570, 0);
                        var3 = 0;
                        if (var2) {
                           var6 = (class288)this.field9702.method2235(-107);
                           class742.field10570[var3++] = var6.field4298;
                           var10000 = var3;
                        } else {
                           if (this.field9702.method2242(23702)) {
                              break label687;
                           }

                           var6 = (class288)this.field9702.method2235(-107);
                           class742.field10570[var3++] = var6.field4298;
                           var10000 = var3;
                        }
                     } else {
                        if (this.field9702.method2242(23702)) {
                           break label687;
                        }

                        var6 = (class288)this.field9702.method2235(-107);
                        class742.field10570[var3++] = var6.field4298;
                        var10000 = var3;
                     }

                     while(true) {
                        while(var10000 == 1000) {
                           OpenGL.glDeleteFramebuffersEXT(var3, class742.field10570, 0);
                           var10000 = 0;
                           if (!var2) {
                              var3 = 0;
                              break;
                           }
                        }

                        if (this.field9702.method2242(23702)) {
                           break;
                        }

                        var6 = (class288)this.field9702.method2235(-107);
                        class742.field10570[var3++] = var6.field4298;
                        var10000 = var3;
                     }
                  }

                  if (var3 > 0) {
                     OpenGL.glDeleteFramebuffersEXT(var3, class742.field10570, 0);
                     var16 = 0;
                     if (var2) {
                        var7 = (class288)this.field9703.method2235(107);
                        var3 = var16 + 1;
                        class742.field10570[var16] = (int)var7.field3777;
                        this.field9699 -= var7.field4298;
                        var10000 = var3;
                     } else {
                        if (this.field9703.method2242(23702)) {
                           label745: {
                              if (~var16 < -1) {
                                 OpenGL.glDeleteRenderbuffersEXT(var16, class742.field10570, 0);
                                 var8 = false;
                                 if (!var2 && this.field9698.method2242(23702)) {
                                    break label745;
                                 }
                              } else if (this.field9698.method2242(23702)) {
                                 break label745;
                              }

                              do {
                                 var9 = (class288)this.field9698.method2235(-43);
                                 OpenGL.glDeleteLists((int)var9.field3777, var9.field4298);
                              } while(!this.field9698.method2242(23702));
                           }

                           if (var2) {
                              var10 = this.field9704.method2235(94);
                              OpenGL.glDeleteProgramARB((int)var10.field3777);
                           }

                           while(!this.field9704.method2242(23702)) {
                              var10 = this.field9704.method2235(94);
                              OpenGL.glDeleteProgramARB((int)var10.field3777);
                           }

                           if (var2 || !this.field9705.method2242(23702)) {
                              do {
                                 var11 = this.field9705.method2235(96);
                                 OpenGL.glDeleteObjectARB(var11.field3777);
                              } while(!this.field9705.method2242(23702));
                           }

                           if (var2) {
                              var12 = (class288)this.field9698.method2235(98);
                              OpenGL.glDeleteLists((int)var12.field3777, var12.field4298);
                           }

                           while(true) {
                              if (this.field9698.method2242(23702)) {
                                 this.field9667.method5007(-17062);
                                 var18 = this;
                                 if (!var2) {
                                    if (~this.method161() < -100663297 && this.field9707 + 60000L < class604.method4452(-116)) {
                                       System.gc();
                                       this.field9707 = class604.method4452(-127);
                                    }

                                    this.field9679 = var15;
                                    return;
                                 }
                              } else {
                                 var18 = this;
                              }

                              var12 = (class288)var18.field9698.method2235(98);
                              OpenGL.glDeleteLists((int)var12.field3777, var12.field4298);
                           }
                        }

                        var7 = (class288)this.field9703.method2235(107);
                        var3 = var16 + 1;
                        class742.field10570[var16] = (int)var7.field3777;
                        this.field9699 -= var7.field4298;
                        var10000 = var3;
                     }
                  } else {
                     if (this.field9703.method2242(23702)) {
                        label831: {
                           if (~var3 < -1) {
                              OpenGL.glDeleteRenderbuffersEXT(var3, class742.field10570, 0);
                              var8 = false;
                              if (!var2 && this.field9698.method2242(23702)) {
                                 break label831;
                              }
                           } else if (this.field9698.method2242(23702)) {
                              break label831;
                           }

                           do {
                              var9 = (class288)this.field9698.method2235(-43);
                              OpenGL.glDeleteLists((int)var9.field3777, var9.field4298);
                           } while(!this.field9698.method2242(23702));
                        }

                        if (var2) {
                           var10 = this.field9704.method2235(94);
                           OpenGL.glDeleteProgramARB((int)var10.field3777);
                        }

                        while(!this.field9704.method2242(23702)) {
                           var10 = this.field9704.method2235(94);
                           OpenGL.glDeleteProgramARB((int)var10.field3777);
                        }

                        if (var2 || !this.field9705.method2242(23702)) {
                           do {
                              var11 = this.field9705.method2235(96);
                              OpenGL.glDeleteObjectARB(var11.field3777);
                           } while(!this.field9705.method2242(23702));
                        }

                        if (var2) {
                           var12 = (class288)this.field9698.method2235(98);
                           OpenGL.glDeleteLists((int)var12.field3777, var12.field4298);
                        }

                        while(true) {
                           if (this.field9698.method2242(23702)) {
                              this.field9667.method5007(-17062);
                              var18 = this;
                              if (!var2) {
                                 if (~this.method161() < -100663297 && this.field9707 + 60000L < class604.method4452(-116)) {
                                    System.gc();
                                    this.field9707 = class604.method4452(-127);
                                 }

                                 this.field9679 = var15;
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class288)var18.field9698.method2235(98);
                           OpenGL.glDeleteLists((int)var12.field3777, var12.field4298);
                        }
                     }

                     var7 = (class288)this.field9703.method2235(107);
                     class742.field10570[var3++] = (int)var7.field3777;
                     this.field9699 -= var7.field4298;
                     var10000 = var3;
                  }

                  while(true) {
                     while(var10000 == 1000) {
                        OpenGL.glDeleteRenderbuffersEXT(var3, class742.field10570, 0);
                        var10000 = 0;
                        if (!var2) {
                           var3 = 0;
                           break;
                        }
                     }

                     if (this.field9703.method2242(23702)) {
                        label930: {
                           if (~var3 < -1) {
                              OpenGL.glDeleteRenderbuffersEXT(var3, class742.field10570, 0);
                              var8 = false;
                              if (!var2 && this.field9698.method2242(23702)) {
                                 break label930;
                              }
                           } else if (this.field9698.method2242(23702)) {
                              break label930;
                           }

                           do {
                              var9 = (class288)this.field9698.method2235(-43);
                              OpenGL.glDeleteLists((int)var9.field3777, var9.field4298);
                           } while(!this.field9698.method2242(23702));
                        }

                        if (var2) {
                           var10 = this.field9704.method2235(94);
                           OpenGL.glDeleteProgramARB((int)var10.field3777);
                        }

                        while(!this.field9704.method2242(23702)) {
                           var10 = this.field9704.method2235(94);
                           OpenGL.glDeleteProgramARB((int)var10.field3777);
                        }

                        if (var2 || !this.field9705.method2242(23702)) {
                           do {
                              var11 = this.field9705.method2235(96);
                              OpenGL.glDeleteObjectARB(var11.field3777);
                           } while(!this.field9705.method2242(23702));
                        }

                        if (var2) {
                           var12 = (class288)this.field9698.method2235(98);
                           OpenGL.glDeleteLists((int)var12.field3777, var12.field4298);
                        }

                        while(true) {
                           if (this.field9698.method2242(23702)) {
                              this.field9667.method5007(-17062);
                              var18 = this;
                              if (!var2) {
                                 if (~this.method161() < -100663297 && this.field9707 + 60000L < class604.method4452(-116)) {
                                    System.gc();
                                    this.field9707 = class604.method4452(-127);
                                 }

                                 this.field9679 = var15;
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class288)var18.field9698.method2235(98);
                           OpenGL.glDeleteLists((int)var12.field3777, var12.field4298);
                        }
                     }

                     var7 = (class288)this.field9703.method2235(107);
                     class742.field10570[var3++] = (int)var7.field3777;
                     this.field9699 -= var7.field4298;
                     var10000 = var3;
                  }
               }

               var5 = (class288)this.field9701.method2235(104);
               class742.field10570[var3++] = (int)var5.field3777;
               this.field9696 -= var5.field4298;
               var10000 = var3;
            }
         } else {
            if (this.field9701.method2242(23702)) {
               label357: {
                  if (~var3 < -1) {
                     OpenGL.glDeleteTextures(var3, class742.field10570, 0);
                     var3 = 0;
                     if (var2) {
                        var6 = (class288)this.field9702.method2235(-107);
                        class742.field10570[var3++] = var6.field4298;
                        var10000 = var3;
                     } else {
                        if (this.field9702.method2242(23702)) {
                           break label357;
                        }

                        var6 = (class288)this.field9702.method2235(-107);
                        class742.field10570[var3++] = var6.field4298;
                        var10000 = var3;
                     }
                  } else {
                     if (this.field9702.method2242(23702)) {
                        break label357;
                     }

                     var6 = (class288)this.field9702.method2235(-107);
                     class742.field10570[var3++] = var6.field4298;
                     var10000 = var3;
                  }

                  while(true) {
                     while(var10000 == 1000) {
                        OpenGL.glDeleteFramebuffersEXT(var3, class742.field10570, 0);
                        var10000 = 0;
                        if (!var2) {
                           var3 = 0;
                           break;
                        }
                     }

                     if (this.field9702.method2242(23702)) {
                        break;
                     }

                     var6 = (class288)this.field9702.method2235(-107);
                     class742.field10570[var3++] = var6.field4298;
                     var10000 = var3;
                  }
               }

               if (var3 > 0) {
                  OpenGL.glDeleteFramebuffersEXT(var3, class742.field10570, 0);
                  var16 = 0;
                  if (var2) {
                     var7 = (class288)this.field9703.method2235(107);
                     var3 = var16 + 1;
                     class742.field10570[var16] = (int)var7.field3777;
                     this.field9699 -= var7.field4298;
                     var10000 = var3;
                  } else {
                     if (this.field9703.method2242(23702)) {
                        label415: {
                           if (~var16 < -1) {
                              OpenGL.glDeleteRenderbuffersEXT(var16, class742.field10570, 0);
                              var8 = false;
                              if (!var2 && this.field9698.method2242(23702)) {
                                 break label415;
                              }
                           } else if (this.field9698.method2242(23702)) {
                              break label415;
                           }

                           do {
                              var9 = (class288)this.field9698.method2235(-43);
                              OpenGL.glDeleteLists((int)var9.field3777, var9.field4298);
                           } while(!this.field9698.method2242(23702));
                        }

                        if (var2) {
                           var10 = this.field9704.method2235(94);
                           OpenGL.glDeleteProgramARB((int)var10.field3777);
                        }

                        while(!this.field9704.method2242(23702)) {
                           var10 = this.field9704.method2235(94);
                           OpenGL.glDeleteProgramARB((int)var10.field3777);
                        }

                        if (var2 || !this.field9705.method2242(23702)) {
                           do {
                              var11 = this.field9705.method2235(96);
                              OpenGL.glDeleteObjectARB(var11.field3777);
                           } while(!this.field9705.method2242(23702));
                        }

                        if (var2) {
                           var12 = (class288)this.field9698.method2235(98);
                           OpenGL.glDeleteLists((int)var12.field3777, var12.field4298);
                        }

                        while(true) {
                           if (this.field9698.method2242(23702)) {
                              this.field9667.method5007(-17062);
                              var18 = this;
                              if (!var2) {
                                 if (~this.method161() < -100663297 && this.field9707 + 60000L < class604.method4452(-116)) {
                                    System.gc();
                                    this.field9707 = class604.method4452(-127);
                                 }

                                 this.field9679 = var15;
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class288)var18.field9698.method2235(98);
                           OpenGL.glDeleteLists((int)var12.field3777, var12.field4298);
                        }
                     }

                     var7 = (class288)this.field9703.method2235(107);
                     var3 = var16 + 1;
                     class742.field10570[var16] = (int)var7.field3777;
                     this.field9699 -= var7.field4298;
                     var10000 = var3;
                  }
               } else {
                  if (this.field9703.method2242(23702)) {
                     label501: {
                        if (~var3 < -1) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class742.field10570, 0);
                           var8 = false;
                           if (!var2 && this.field9698.method2242(23702)) {
                              break label501;
                           }
                        } else if (this.field9698.method2242(23702)) {
                           break label501;
                        }

                        do {
                           var9 = (class288)this.field9698.method2235(-43);
                           OpenGL.glDeleteLists((int)var9.field3777, var9.field4298);
                        } while(!this.field9698.method2242(23702));
                     }

                     if (var2) {
                        var10 = this.field9704.method2235(94);
                        OpenGL.glDeleteProgramARB((int)var10.field3777);
                     }

                     while(!this.field9704.method2242(23702)) {
                        var10 = this.field9704.method2235(94);
                        OpenGL.glDeleteProgramARB((int)var10.field3777);
                     }

                     if (var2 || !this.field9705.method2242(23702)) {
                        do {
                           var11 = this.field9705.method2235(96);
                           OpenGL.glDeleteObjectARB(var11.field3777);
                        } while(!this.field9705.method2242(23702));
                     }

                     if (var2) {
                        var12 = (class288)this.field9698.method2235(98);
                        OpenGL.glDeleteLists((int)var12.field3777, var12.field4298);
                     }

                     while(true) {
                        if (this.field9698.method2242(23702)) {
                           this.field9667.method5007(-17062);
                           var18 = this;
                           if (!var2) {
                              if (~this.method161() < -100663297 && this.field9707 + 60000L < class604.method4452(-116)) {
                                 System.gc();
                                 this.field9707 = class604.method4452(-127);
                              }

                              this.field9679 = var15;
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class288)var18.field9698.method2235(98);
                        OpenGL.glDeleteLists((int)var12.field3777, var12.field4298);
                     }
                  }

                  var7 = (class288)this.field9703.method2235(107);
                  class742.field10570[var3++] = (int)var7.field3777;
                  this.field9699 -= var7.field4298;
                  var10000 = var3;
               }

               while(true) {
                  while(var10000 == 1000) {
                     OpenGL.glDeleteRenderbuffersEXT(var3, class742.field10570, 0);
                     var10000 = 0;
                     if (!var2) {
                        var3 = 0;
                        break;
                     }
                  }

                  if (this.field9703.method2242(23702)) {
                     label600: {
                        if (~var3 < -1) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class742.field10570, 0);
                           var8 = false;
                           if (!var2 && this.field9698.method2242(23702)) {
                              break label600;
                           }
                        } else if (this.field9698.method2242(23702)) {
                           break label600;
                        }

                        do {
                           var9 = (class288)this.field9698.method2235(-43);
                           OpenGL.glDeleteLists((int)var9.field3777, var9.field4298);
                        } while(!this.field9698.method2242(23702));
                     }

                     if (var2) {
                        var10 = this.field9704.method2235(94);
                        OpenGL.glDeleteProgramARB((int)var10.field3777);
                     }

                     while(!this.field9704.method2242(23702)) {
                        var10 = this.field9704.method2235(94);
                        OpenGL.glDeleteProgramARB((int)var10.field3777);
                     }

                     if (var2 || !this.field9705.method2242(23702)) {
                        do {
                           var11 = this.field9705.method2235(96);
                           OpenGL.glDeleteObjectARB(var11.field3777);
                        } while(!this.field9705.method2242(23702));
                     }

                     if (var2) {
                        var12 = (class288)this.field9698.method2235(98);
                        OpenGL.glDeleteLists((int)var12.field3777, var12.field4298);
                     }

                     while(true) {
                        if (this.field9698.method2242(23702)) {
                           this.field9667.method5007(-17062);
                           var18 = this;
                           if (!var2) {
                              if (~this.method161() < -100663297 && this.field9707 + 60000L < class604.method4452(-116)) {
                                 System.gc();
                                 this.field9707 = class604.method4452(-127);
                              }

                              this.field9679 = var15;
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class288)var18.field9698.method2235(98);
                        OpenGL.glDeleteLists((int)var12.field3777, var12.field4298);
                     }
                  }

                  var7 = (class288)this.field9703.method2235(107);
                  class742.field10570[var3++] = (int)var7.field3777;
                  this.field9699 -= var7.field4298;
                  var10000 = var3;
               }
            }

            var5 = (class288)this.field9701.method2235(104);
            class742.field10570[var3++] = (int)var5.field3777;
            this.field9696 -= var5.field4298;
            var10000 = var3;
         }

         while(true) {
            while(var10000 == 1000) {
               OpenGL.glDeleteTextures(var3, class742.field10570, 0);
               var10000 = 0;
               if (!var2) {
                  var3 = 0;
                  break;
               }
            }

            if (this.field9701.method2242(23702)) {
               label137: {
                  if (~var3 < -1) {
                     OpenGL.glDeleteTextures(var3, class742.field10570, 0);
                     var3 = 0;
                     if (var2) {
                        var6 = (class288)this.field9702.method2235(-107);
                        class742.field10570[var3++] = var6.field4298;
                        var10000 = var3;
                     } else {
                        if (this.field9702.method2242(23702)) {
                           break label137;
                        }

                        var6 = (class288)this.field9702.method2235(-107);
                        class742.field10570[var3++] = var6.field4298;
                        var10000 = var3;
                     }
                  } else {
                     if (this.field9702.method2242(23702)) {
                        break label137;
                     }

                     var6 = (class288)this.field9702.method2235(-107);
                     class742.field10570[var3++] = var6.field4298;
                     var10000 = var3;
                  }

                  while(true) {
                     while(var10000 == 1000) {
                        OpenGL.glDeleteFramebuffersEXT(var3, class742.field10570, 0);
                        var10000 = 0;
                        if (!var2) {
                           var3 = 0;
                           break;
                        }
                     }

                     if (this.field9702.method2242(23702)) {
                        break;
                     }

                     var6 = (class288)this.field9702.method2235(-107);
                     class742.field10570[var3++] = var6.field4298;
                     var10000 = var3;
                  }
               }

               if (var3 > 0) {
                  OpenGL.glDeleteFramebuffersEXT(var3, class742.field10570, 0);
                  var16 = 0;
                  if (var2) {
                     var7 = (class288)this.field9703.method2235(107);
                     var3 = var16 + 1;
                     class742.field10570[var16] = (int)var7.field3777;
                     this.field9699 -= var7.field4298;
                     var10000 = var3;
                  } else {
                     if (this.field9703.method2242(23702)) {
                        label237: {
                           if (~var16 < -1) {
                              OpenGL.glDeleteRenderbuffersEXT(var16, class742.field10570, 0);
                              var8 = false;
                              if (!var2 && this.field9698.method2242(23702)) {
                                 break label237;
                              }
                           } else if (this.field9698.method2242(23702)) {
                              break label237;
                           }

                           do {
                              var9 = (class288)this.field9698.method2235(-43);
                              OpenGL.glDeleteLists((int)var9.field3777, var9.field4298);
                           } while(!this.field9698.method2242(23702));
                        }

                        if (var2) {
                           var10 = this.field9704.method2235(94);
                           OpenGL.glDeleteProgramARB((int)var10.field3777);
                        }

                        while(!this.field9704.method2242(23702)) {
                           var10 = this.field9704.method2235(94);
                           OpenGL.glDeleteProgramARB((int)var10.field3777);
                        }

                        if (var2 || !this.field9705.method2242(23702)) {
                           do {
                              var11 = this.field9705.method2235(96);
                              OpenGL.glDeleteObjectARB(var11.field3777);
                           } while(!this.field9705.method2242(23702));
                        }

                        if (var2) {
                           var12 = (class288)this.field9698.method2235(98);
                           OpenGL.glDeleteLists((int)var12.field3777, var12.field4298);
                        }

                        while(true) {
                           if (this.field9698.method2242(23702)) {
                              this.field9667.method5007(-17062);
                              var18 = this;
                              if (!var2) {
                                 if (~this.method161() < -100663297 && this.field9707 + 60000L < class604.method4452(-116)) {
                                    System.gc();
                                    this.field9707 = class604.method4452(-127);
                                 }

                                 this.field9679 = var15;
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class288)var18.field9698.method2235(98);
                           OpenGL.glDeleteLists((int)var12.field3777, var12.field4298);
                        }
                     }

                     var7 = (class288)this.field9703.method2235(107);
                     var3 = var16 + 1;
                     class742.field10570[var16] = (int)var7.field3777;
                     this.field9699 -= var7.field4298;
                     var10000 = var3;
                  }
               } else {
                  if (this.field9703.method2242(23702)) {
                     label150: {
                        if (~var3 < -1) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class742.field10570, 0);
                           var8 = false;
                           if (!var2 && this.field9698.method2242(23702)) {
                              break label150;
                           }
                        } else if (this.field9698.method2242(23702)) {
                           break label150;
                        }

                        do {
                           var9 = (class288)this.field9698.method2235(-43);
                           OpenGL.glDeleteLists((int)var9.field3777, var9.field4298);
                        } while(!this.field9698.method2242(23702));
                     }

                     if (var2) {
                        var10 = this.field9704.method2235(94);
                        OpenGL.glDeleteProgramARB((int)var10.field3777);
                     }

                     while(!this.field9704.method2242(23702)) {
                        var10 = this.field9704.method2235(94);
                        OpenGL.glDeleteProgramARB((int)var10.field3777);
                     }

                     if (var2 || !this.field9705.method2242(23702)) {
                        do {
                           var11 = this.field9705.method2235(96);
                           OpenGL.glDeleteObjectARB(var11.field3777);
                        } while(!this.field9705.method2242(23702));
                     }

                     if (var2) {
                        var12 = (class288)this.field9698.method2235(98);
                        OpenGL.glDeleteLists((int)var12.field3777, var12.field4298);
                     }

                     while(true) {
                        if (this.field9698.method2242(23702)) {
                           this.field9667.method5007(-17062);
                           var18 = this;
                           if (!var2) {
                              if (~this.method161() < -100663297 && this.field9707 + 60000L < class604.method4452(-116)) {
                                 System.gc();
                                 this.field9707 = class604.method4452(-127);
                              }

                              this.field9679 = var15;
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class288)var18.field9698.method2235(98);
                        OpenGL.glDeleteLists((int)var12.field3777, var12.field4298);
                     }
                  }

                  var7 = (class288)this.field9703.method2235(107);
                  class742.field10570[var3++] = (int)var7.field3777;
                  this.field9699 -= var7.field4298;
                  var10000 = var3;
               }

               while(true) {
                  while(var10000 == 1000) {
                     OpenGL.glDeleteRenderbuffersEXT(var3, class742.field10570, 0);
                     var10000 = 0;
                     if (!var2) {
                        var3 = 0;
                        break;
                     }
                  }

                  if (this.field9703.method2242(23702)) {
                     label99: {
                        if (~var3 < -1) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class742.field10570, 0);
                           var8 = false;
                           if (!var2 && this.field9698.method2242(23702)) {
                              break label99;
                           }
                        } else if (this.field9698.method2242(23702)) {
                           break label99;
                        }

                        do {
                           var9 = (class288)this.field9698.method2235(-43);
                           OpenGL.glDeleteLists((int)var9.field3777, var9.field4298);
                        } while(!this.field9698.method2242(23702));
                     }

                     if (var2) {
                        var10 = this.field9704.method2235(94);
                        OpenGL.glDeleteProgramARB((int)var10.field3777);
                     }

                     while(!this.field9704.method2242(23702)) {
                        var10 = this.field9704.method2235(94);
                        OpenGL.glDeleteProgramARB((int)var10.field3777);
                     }

                     if (var2 || !this.field9705.method2242(23702)) {
                        do {
                           var11 = this.field9705.method2235(96);
                           OpenGL.glDeleteObjectARB(var11.field3777);
                        } while(!this.field9705.method2242(23702));
                     }

                     if (var2) {
                        var12 = (class288)this.field9698.method2235(98);
                        OpenGL.glDeleteLists((int)var12.field3777, var12.field4298);
                     }

                     while(true) {
                        if (this.field9698.method2242(23702)) {
                           this.field9667.method5007(-17062);
                           var18 = this;
                           if (!var2) {
                              if (~this.method161() < -100663297 && this.field9707 + 60000L < class604.method4452(-116)) {
                                 System.gc();
                                 this.field9707 = class604.method4452(-127);
                              }

                              this.field9679 = var15;
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class288)var18.field9698.method2235(98);
                        OpenGL.glDeleteLists((int)var12.field3777, var12.field4298);
                     }
                  }

                  var7 = (class288)this.field9703.method2235(107);
                  class742.field10570[var3++] = (int)var7.field3777;
                  this.field9699 -= var7.field4298;
                  var10000 = var3;
               }
            }

            var5 = (class288)this.field9701.method2235(104);
            class742.field10570[var3++] = (int)var5.field3777;
            this.field9696 -= var5.field4298;
            var10000 = var3;
         }
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field9834[216] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "f",
      descriptor = "(II)V"
   )
   public final void method238(int arg0, int arg1) {
      try {
         if (this.field9768 != arg0 || this.field9738 != arg1) {
            label31: {
               this.field9738 = arg1;
               this.field9768 = arg0;
               this.method4900((byte)81);
               this.method4885((byte)107);
               if (~this.field9774 == -4) {
                  this.method4916(24);
                  if (!client.field10022) {
                     break label31;
                  }
               }

               if (~this.field9774 == -3) {
                  this.method4886((byte)89);
               }
            }
         }

         ++field9516;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[22] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "b",
      descriptor = "(IIII)V"
   )
   public final void method4930(int arg0, int arg1, int arg2, int arg3) {
      try {
         OpenGL.glDrawArrays(arg0, arg3, arg1);
         ++field9629;
         if (arg2 != 0) {
            this.method4922(48, -45, true);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9834[98] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method4931(int arg0, int arg1, int arg2) {
      try {
         label29: {
            if (this.field9815 != arg2) {
               OpenGL.glTexEnvi(8960, 34161, arg0);
               OpenGL.glTexEnvi(8960, 34162, arg1);
               if (!client.field10022) {
                  break label29;
               }
            }

            boolean var4 = false;
            if (~this.field9742 != ~arg0) {
               OpenGL.glTexEnvi(8960, 34161, arg0);
               this.field9742 = arg0;
               var4 = true;
            }

            if (~this.field9803 != ~arg1) {
               OpenGL.glTexEnvi(8960, 34162, arg1);
               var4 = true;
               this.field9803 = arg1;
            }

            if (var4) {
               this.field9713 &= -30;
            }
         }

         ++field9527;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9834[112] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(BZ)V"
   )
   public final void method4932(byte arg0, boolean arg1) {
      try {
         if (arg0 <= -52) {
            ++field9611;
            if (!arg1 != !this.field9783) {
               this.field9783 = arg1;
               this.method4959(125);
            }
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[120] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "xa",
      descriptor = "(F)V"
   )
   public final void method197(float arg0) {
      try {
         if (this.field9807 != arg0) {
            this.field9807 = arg0;
            this.method4918(20271);
         }

         ++field9479;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[80] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "([IIIIIZ)Lma;"
   )
   public final class148 method219(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         ++field9648;
         return new class132(this, arg3, arg4, arg0, arg1, arg2);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field9834[213] + (arg0 != null ? field9834[8] : field9834[9]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(IIIZ)V"
   )
   public final void method4933(int arg0, int arg1, int arg2, boolean arg3) {
      try {
         OpenGL.glTexEnvi(8960, arg2 + 34184, arg1);
         ++field9482;
         if (arg3) {
            OpenGL.glTexEnvi(8960, arg2 + 34200, arg0);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9834[32] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method4934(boolean arg0, byte arg1) {
      try {
         if (!this.field9770 != !arg0) {
            this.field9770 = arg0;
            this.method4908((byte)-125);
            this.field9713 &= -32;
         }

         ++field9635;
         if (arg1 != 103) {
            this.field9733 = -10;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[149] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method4935(boolean arg0, int arg1) {
      try {
         if (this.field9817 != arg0) {
            this.field9817 = arg0;
            this.method4959(-22);
            this.field9713 &= -8;
         }

         ++field9490;
         if (arg1 != 3584) {
            this.field9707 = -50L;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[23] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "e",
      descriptor = "(Z)V"
   )
   private final void method4936(boolean arg0) {
      try {
         if (this.field9774 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (this.field9615 > 0 && this.field9538 > 0) {
               OpenGL.glOrtho(0.0D, (double)this.field9615, (double)this.field9538, 0.0D, -1.0D, 1.0D);
            }

            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field9713 &= -25;
            this.field9774 = 1;
         }

         if (arg0) {
            ++field9653;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[104] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "A",
      descriptor = "(ILaa;II)V"
   )
   public final void method173(int arg0, class684 arg1, int arg2, int arg3) {
      try {
         ++field9483;
         class61 var5 = (class61)arg1;
         class436 var6 = var5.field869;
         this.method4914(-17734);
         this.method4906(-2, var5.field869);
         this.method4965(1, (byte)-103);
         this.method4931(7681, 8448, 0);
         this.method4909(34167, 768, 0, (byte)121);
         float var7 = var6.field6385 / (float)var6.field6383;
         float var8 = var6.field6386 / (float)var6.field6378;
         OpenGL.glColor4ub((byte)(arg0 >> 16), (byte)(arg0 >> 8), (byte)arg0, (byte)(arg0 >> 24));
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f((float)(-arg2 + this.field9727) * var7, (float)(-arg3 + this.field9771) * var8);
         OpenGL.glVertex2i(this.field9727, this.field9771);
         OpenGL.glTexCoord2f((float)(-arg2 + this.field9727) * var7, (float)(-arg3 + this.field9823) * var8);
         OpenGL.glVertex2i(this.field9727, this.field9823);
         OpenGL.glTexCoord2f((float)(-arg2 + this.field9757) * var7, (float)(-arg3 + this.field9823) * var8);
         OpenGL.glVertex2i(this.field9757, this.field9823);
         OpenGL.glTexCoord2f((float)(-arg2 + this.field9757) * var7, (float)(this.field9771 - arg3) * var8);
         OpenGL.glVertex2i(this.field9757, this.field9771);
         OpenGL.glEnd();
         this.method4909(5890, 768, 0, (byte)-105);
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field9834[191] + arg0 + ',' + (arg1 != null ? field9834[8] : field9834[9]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "u",
      descriptor = "(I)V"
   )
   private final void method4937(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!aea",
      name = "JA",
      descriptor = "(IIIIII)I"
   )
   public final int method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var7 = client.field10022;

      try {
         ++field9597;
         int var8 = 0;
         float var9 = (float)arg2 * this.field9709.field4334 + (float)arg0 * this.field9709.field4330 + (float)arg1 * this.field9709.field4347 + this.field9709.field4339;
         if (var9 < 1.0F) {
            var9 = 1.0F;
         }

         float var10 = (float)arg5 * this.field9709.field4334 + (float)arg3 * this.field9709.field4330 + (float)arg4 * this.field9709.field4347 + this.field9709.field4339;
         if (var10 < 1.0F) {
            var10 = 1.0F;
         }

         label71: {
            if (var9 < (float)this.field9768 && (float)this.field9768 > var10) {
               var8 |= 16;
               if (!var7) {
                  break label71;
               }
            }

            if (var9 > (float)this.field9738 && var10 > (float)this.field9738) {
               var8 |= 32;
            }
         }

         label83: {
            int var11 = (int)(((float)arg2 * this.field9709.field4308 + (float)arg0 * this.field9709.field4306 + (float)arg1 * this.field9709.field4312 + this.field9709.field4307) * (float)this.field9735 / var9);
            int var12 = (int)(((float)arg5 * this.field9709.field4308 + (float)arg3 * this.field9709.field4306 + (float)arg4 * this.field9709.field4312 + this.field9709.field4307) * (float)this.field9735 / var10);
            if (!(this.field9809 > (float)var11) || !(this.field9809 > (float)var12)) {
               if (!((float)var11 > this.field9720) || !((float)var12 > this.field9720)) {
                  break label83;
               }

               var8 |= 2;
               if (!var7) {
                  break label83;
               }
            }

            var8 |= 1;
         }

         int var13 = (int)(((float)arg2 * this.field9709.field4345 + (float)arg0 * this.field9709.field4333 + (float)arg1 * this.field9709.field4336 + this.field9709.field4321) * (float)this.field9822 / var9);
         int var14 = (int)(((float)arg5 * this.field9709.field4345 + (float)arg3 * this.field9709.field4333 + (float)arg4 * this.field9709.field4336 + this.field9709.field4321) * (float)this.field9822 / var10);
         if (!(this.field9721 > (float)var13) || !((float)var14 < this.field9721)) {
            if (!(this.field9759 < (float)var13) || !((float)var14 > this.field9759)) {
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
         throw class612.method4503(var16, field9834[69] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "za",
      descriptor = "(IIIII)V"
   )
   public final void method179(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var6 = client.field10022;

      try {
         ++field9486;
         if (~arg2 > -1) {
            arg2 = -arg2;
         }

         if (~(arg0 + arg2) <= ~this.field9727 && ~(-arg2 + arg0) >= ~this.field9757 && arg1 + arg2 >= this.field9771 && ~(-arg2 + arg1) >= ~this.field9823) {
            this.method4890((byte)-65);
            this.method4965(arg4, (byte)-68);
            OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
            float var7 = (float)arg0 + 0.35F;
            float var8 = (float)arg1 + 0.35F;
            int var9 = arg2 << 1;
            if (this.field9773 > (float)var9) {
               OpenGL.glBegin(7);
               OpenGL.glVertex2f(var7 + 1.0F, var8 + 1.0F);
               OpenGL.glVertex2f(var7 + 1.0F, var8 + -1.0F);
               OpenGL.glVertex2f(var7 + -1.0F, var8 + -1.0F);
               OpenGL.glVertex2f(var7 + -1.0F, var8 + 1.0F);
               OpenGL.glEnd();
            } else if (this.field9736 >= (float)var9) {
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
                  if (var10 <= 64) {
                     var10 = 64;
                     if (!var6) {
                        break label42;
                     }
                  }

                  if (var10 > 512) {
                     var10 = 512;
                  }
               }

               int var11 = class397.method3090((byte)-123, var10);
               OpenGL.glVertex2f((float)arg2 + var7, var8);
               int var12 = -var11 + 16384;
               if (var6) {
                  OpenGL.glVertex2f(class471.field6835[var12] * (float)arg2 + var7, class471.field6836[var12] * (float)arg2 + var8);
                  var12 -= var11;
               }

               while(true) {
                  while(var12 > 0) {
                     OpenGL.glVertex2f(class471.field6835[var12] * (float)arg2 + var7, class471.field6836[var12] * (float)arg2 + var8);
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
         throw class612.method4503(var14, field9834[78] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "c",
      descriptor = "()Z"
   )
   public final boolean method230() {
      try {
         ++field9563;
         return true;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9834[66] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method175(int arg0) {
      try {
         ++field9502;
         this.method4903(127);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[223] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "Q",
      descriptor = "(IIIIII[BII)V"
   )
   public final void method258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
      try {
         float var10;
         float var11;
         label36: {
            ++field9598;
            if (this.field9754 == null || ~arg2 < ~this.field9754.field141 || this.field9754.field140 < arg3) {
               this.field9754 = class432.method3367(this, 6406, 6406, arg2, arg3, false, 3553, arg6);
               this.field9754.method67(false, -128, false);
               var10 = this.field9754.field6386;
               var11 = this.field9754.field6385;
               if (!client.field10022) {
                  break label36;
               }
            }

            this.field9754.method68(arg6, false, arg3, arg2, 0, 0, 6406, 0, 0, (byte)4);
            var11 = (float)arg2 * this.field9754.field6385 / (float)this.field9754.field141;
            var10 = (float)arg3 * this.field9754.field6386 / (float)this.field9754.field140;
         }

         this.method4914(-17734);
         this.method4906(-2, this.field9754);
         this.method4965(arg8, (byte)-64);
         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         this.method4911(arg5, (byte)116);
         this.method4931(34165, 34165, 0);
         this.method4909(34166, 768, 0, (byte)-99);
         this.method4909(5890, 770, 2, (byte)1);
         this.method4933(770, 34166, 0, true);
         this.method4933(770, 5890, 2, true);
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
         this.method4909(5890, 768, 0, (byte)65);
         this.method4909(34166, 770, 2, (byte)-110);
         this.method4933(770, 5890, 0, true);
         this.method4933(770, 34166, 2, true);
      } catch (RuntimeException var17) {
         throw class612.method4503(var17, field9834[102] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field9834[8] : field9834[9]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "k",
      descriptor = "()Z"
   )
   public final boolean method188() {
      try {
         ++field9589;
         return this.field9800 && (!this.method237() || this.field9793);
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9834[146] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "f",
      descriptor = "()Z"
   )
   public final boolean method205() {
      try {
         ++field9671;
         if (this.field9675 != null) {
            if (!this.field9675.method1207(113)) {
               if (!this.field9676.method5023(this.field9675, (byte)20)) {
                  return false;
               }

               this.field9667.method5009(109);
            }

            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9834[219] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "h",
      descriptor = "(II)I"
   )
   public final int method4938(int arg0, int arg1) {
      try {
         ++field9577;
         if (arg1 != 1) {
            if (~arg1 == -1) {
               return 8448;
            } else if (arg1 != 2) {
               if (~arg1 != -4) {
                  if (~arg1 == -5) {
                     return 34023;
                  } else {
                     if (arg0 <= 100) {
                        this.field9688 = null;
                     }

                     throw new IllegalArgumentException();
                  }
               } else {
                  return 260;
               }
            } else {
               return 34165;
            }
         } else {
            return 7681;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[172] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "ra",
      descriptor = "(IIII)V"
   )
   public final void method232(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field9750 = arg2;
         this.field9795 = arg1;
         this.field9752 = arg3;
         this.field9792 = true;
         ++field9627;
         this.field9787 = arg0;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9834[113] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "L",
      descriptor = "(III)V"
   )
   public final void method227(int arg0, int arg1, int arg2) {
      try {
         if (this.field9814 != arg0 || this.field9751 != arg1 || ~this.field9733 != ~arg2) {
            this.field9733 = arg2;
            this.field9751 = arg1;
            this.field9814 = arg0;
            this.method4885((byte)104);
            this.method4908((byte)76);
         }

         ++field9573;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field9834[190] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method214(int arg0, int arg1) {
      try {
         ++field9646;
         return arg1 & arg0 ^ arg1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[181] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(ILwi;)V"
   )
   public final void method4939(int arg0, class373 arg1) {
      try {
         ++field9571;
         if (this.field9687 >= 3) {
            throw new RuntimeException();
         } else {
            if (~this.field9687 <= -1) {
               this.field9686[this.field9687].method2921(12646);
            }

            this.field9690 = this.field9686[++this.field9687] = arg1;
            this.field9690.method2925(-17801);
            if (arg0 >= -72) {
               this.field9780 = -10;
            }
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[70] + arg0 + ',' + (arg1 != null ? field9834[8] : field9834[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "c",
      descriptor = "(III)V"
   )
   public final synchronized void method4940(int arg0, int arg1, int arg2) {
      try {
         if (arg1 == 1) {
            ++field9536;
            class288 var4 = new class288(arg0);
            var4.field3777 = (long)arg2;
            this.field9701.method2238(var4, 13);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9834[82] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(Luv;)V"
   )
   public final void method194(class521 arg0) {
      try {
         ++field9467;
         this.field9674.method4379(arg0, this, -1041, -1);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[161] + (arg0 != null ? field9834[8] : field9834[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "k",
      descriptor = "(I)V"
   )
   private final void method4941(int arg0) {
      try {
         if (arg0 != 770) {
            this.field9673 = -125;
         }

         label22: {
            if (this.field9757 >= this.field9727 && this.field9823 >= this.field9771) {
               OpenGL.glScissor(this.field9780 - -this.field9727, this.field9772 - (-this.field9538 + this.field9823), -this.field9727 + this.field9757, -this.field9771 + this.field9823);
               if (!client.field10022) {
                  break label22;
               }
            }

            OpenGL.glScissor(0, 0, 0, 0);
         }

         ++field9655;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[180] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "c",
      descriptor = "(IIIIII)V"
   )
   public final void method196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         float var8;
         float var10;
         label23: {
            this.method4890((byte)-115);
            ++field9637;
            this.method4965(arg5, (byte)-104);
            float var7 = (float)arg2 - (float)arg0;
            var8 = (float)arg3 - (float)arg1;
            if (var7 != 0.0F || var8 != 0.0F) {
               float var9 = (float)(1.0D / Math.sqrt((double)(var7 * var7 + var8 * var8)));
               var8 *= var9;
               var10 = var7 * var9;
               if (!client.field10022) {
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
         throw class612.method4503(var12, field9834[207] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "r",
      descriptor = "()Z"
   )
   public final boolean method200() {
      try {
         ++field9541;
         return true;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9834[197] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "b",
      descriptor = "(III)V"
   )
   public final synchronized void method4942(int arg0, int arg1, int arg2) {
      try {
         ++field9660;
         if (arg1 == -29) {
            class288 var4 = new class288(arg0);
            var4.field3777 = (long)arg2;
            this.field9703.method2238(var4, 13);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9834[108] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "ZA",
      descriptor = "(IFFFFF)V"
   )
   public final void method154(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      try {
         ++field9524;
         boolean var7 = ~this.field9760 != ~arg0;
         if (var7 || this.field9755 != arg1 || this.field9745 != arg2) {
            this.field9760 = arg0;
            this.field9745 = arg2;
            this.field9755 = arg1;
            if (var7) {
               this.field9794 = (float)(this.field9760 & 65280) / 65280.0F;
               this.field9796 = (float)(16711680 & this.field9760) / 1.671168E7F;
               this.field9799 = (float)(255 & this.field9760) / 255.0F;
               this.method4918(20271);
            }

            this.method4960((byte)37);
         }

         if (this.field9805[0] != arg3 || this.field9805[1] != arg4 || this.field9805[2] != arg5) {
            this.field9805[2] = arg5;
            this.field9805[1] = arg4;
            this.field9805[0] = arg3;
            this.field9718[2] = -arg5;
            this.field9718[1] = -arg4;
            this.field9718[0] = -arg3;
            float var8 = (float)(1.0D / Math.sqrt((double)(arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field9758[2] = arg5 * var8;
            this.field9758[0] = arg3 * var8;
            this.field9758[1] = arg4 * var8;
            this.field9790[1] = -this.field9758[1];
            this.field9790[2] = -this.field9758[2];
            this.field9790[0] = -this.field9758[0];
            this.method4962(30);
            this.field9812 = (int)(arg5 * 256.0F / arg4);
            this.field9746 = (int)(arg3 * 256.0F / arg4);
         }

      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field9834[186] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method158(Canvas arg0) {
      try {
         label45: {
            this.field9651 = null;
            this.field9666 = 0L;
            ++field9632;
            if (arg0 == null || this.field9569 == arg0) {
               this.field9651 = this.field9569;
               this.field9666 = this.field9528;
               if (!client.field10022) {
                  break label45;
               }
            }

            if (this.field9618.containsKey(arg0)) {
               Long var2 = (Long)this.field9618.get(arg0);
               this.field9666 = var2;
               this.field9651 = arg0;
            }
         }

         if (this.field9651 != null && ~this.field9666 != -1L) {
            this.field9520.setSurface(this.field9666);
            this.method4948(15547);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[211] + (arg0 != null ? field9834[8] : field9834[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "w",
      descriptor = "()Z"
   )
   public final boolean method201() {
      try {
         ++field9623;
         return true;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9834[95] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "i",
      descriptor = "()I"
   )
   public final int method141() {
      try {
         ++field9473;
         return this.field9768;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9834[123] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(Lgga;)V"
   )
   public final void method255(class502 arg0) {
      try {
         this.field9709.method323(arg0);
         ++field9488;
         this.field9715.method323(this.field9709);
         this.field9715.method2403(96);
         this.field9716.method2398(this.field9715, true);
         if (~this.field9774 != -2) {
            this.method4891((byte)103);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[183] + (arg0 != null ? field9834[8] : field9834[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "l",
      descriptor = "(B)V"
   )
   private final void method4943(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!aea",
      name = "z",
      descriptor = "(I)V"
   )
   private final void method4944(int arg0) {
      try {
         ++field9593;
         if (arg0 != -8) {
            this.field9798 = -61;
         }

         if (~this.field9774 != -3) {
            this.field9774 = 2;
            this.method4886((byte)104);
            this.method4891((byte)68);
            this.field9713 &= -8;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[160] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "d",
      descriptor = "(Z)V"
   )
   public final void method4945(boolean arg0) {
      try {
         ++field9533;
         if (!arg0) {
            if (this.field9713 != 8) {
               this.method4944(-8);
               this.method4934(true, (byte)103);
               this.method4917(2929, true);
               this.method4894(true, (byte)22);
               this.method4965(1, (byte)-77);
               this.field9713 = 8;
            }
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[97] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(ILwu;Lwu;Lwu;Lwu;)V"
   )
   public final void method4946(int arg0, class451 arg1, class451 arg2, class451 arg3, class451 arg4) {
      boolean var6 = client.field10022;

      try {
         label70: {
            if (arg3 == null) {
               OpenGL.glDisableClientState(32884);
               if (!var6) {
                  break label70;
               }
            }

            this.method4884(arg3.field6574, 89);
            OpenGL.glVertexPointer(arg3.field6575, arg3.field6578, this.field9781.method1397(arg0 ^ 20052), this.field9781.method1396(17378) - -((long)arg3.field6569));
            OpenGL.glEnableClientState(32884);
         }

         label65: {
            ++field9493;
            if (arg4 == null) {
               OpenGL.glDisableClientState(32885);
               if (!var6) {
                  break label65;
               }
            }

            this.method4884(arg4.field6574, arg0 ^ -16115);
            OpenGL.glNormalPointer(arg4.field6578, this.field9781.method1397(-28824), this.field9781.method1396(17378) + (long)arg4.field6569);
            OpenGL.glEnableClientState(32885);
         }

         label60: {
            if (arg1 == null) {
               OpenGL.glDisableClientState(32886);
               if (!var6) {
                  break label60;
               }
            }

            this.method4884(arg1.field6574, 47);
            OpenGL.glColorPointer(arg1.field6575, arg1.field6578, this.field9781.method1397(arg0 ^ 20052), this.field9781.method1396(17378) + (long)arg1.field6569);
            OpenGL.glEnableClientState(32886);
         }

         label55: {
            if (arg2 == null) {
               OpenGL.glDisableClientState(32888);
               if (!var6) {
                  break label55;
               }
            }

            this.method4884(arg2.field6574, arg0 ^ -16035);
            OpenGL.glTexCoordPointer(arg2.field6575, arg2.field6578, this.field9781.method1397(-28824), this.field9781.method1396(arg0 + 33446) + (long)arg2.field6569);
            OpenGL.glEnableClientState(32888);
         }

         if (arg0 != -16068) {
            this.method192();
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field9834[41] + arg0 + ',' + (arg1 != null ? field9834[8] : field9834[9]) + ',' + (arg2 != null ? field9834[8] : field9834[9]) + ',' + (arg3 != null ? field9834[8] : field9834[9]) + ',' + (arg4 != null ? field9834[8] : field9834[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(Liaa;Z)Lma;"
   )
   public final class148 method187(class433 arg0, boolean arg1) {
      boolean var3 = client.field10022;

      try {
         int[] var4;
         label95: {
            ++field9638;
            var4 = new int[arg0.field6361 * arg0.field6353];
            int var5 = 0;
            int var6 = 0;
            if (arg0.field6356 != null) {
               int var7 = 0;
               if (var3 || ~var7 > ~arg0.field6353) {
                  do {
                     int var8 = 0;
                     if (var3) {
                        var4[var6++] = class91.method932(arg0.field6357[class697.method5101(255, arg0.field6354[var5])], arg0.field6356[var5] << 24);
                        ++var5;
                        ++var8;
                     }

                     while(true) {
                        while(arg0.field6361 > var8) {
                           var4[var6++] = class91.method932(arg0.field6357[class697.method5101(255, arg0.field6354[var5])], arg0.field6356[var5] << 24);
                           ++var5;
                           ++var8;
                        }

                        if (!var3) {
                           ++var7;
                           break;
                        }

                        ++var8;
                     }
                  } while(~var7 > ~arg0.field6353);
               }

               if (!var3) {
                  break label95;
               }
            }

            int var9 = 0;
            if (var3 || ~var9 > ~arg0.field6353) {
               do {
                  int var10 = 0;
                  if (var3 || ~var10 > ~arg0.field6361) {
                     do {
                        int var11 = arg0.field6357[arg0.field6354[var5++] & 255];
                        var4[var6++] = var11 == 0 ? 0 : class91.method932(var11, -16777216);
                        ++var10;
                     } while(~var10 > ~arg0.field6361);
                  }

                  ++var9;
               } while(~var9 > ~arg0.field6353);
            }
         }

         class148 var12 = this.method215(arg0.field6361, arg0.field6361, var4, arg0.field6353, 0, 1);
         var12.method1343(arg0.field6355, arg0.field6358, arg0.field6360, arg0.field6359);
         return var12;
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field9834[139] + (arg0 != null ? field9834[8] : field9834[9]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "e",
      descriptor = "()I"
   )
   public final int method203() {
      try {
         ++field9604;
         return 4;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9834[165] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "b",
      descriptor = "(IIIID)V"
   )
   public final void method217(int arg0, int arg1, int arg2, int arg3, double arg4) {
      try {
         ++field9634;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field9834[21] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "C",
      descriptor = "(Z)V"
   )
   public final void method262(boolean arg0) {
      try {
         ++field9534;
         this.field9778 = arg0;
         this.method4963(0);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[158] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "la",
      descriptor = "()V"
   )
   public final void method231() {
      try {
         this.field9757 = this.field9615;
         ++field9640;
         this.field9823 = this.field9538;
         this.field9727 = 0;
         this.field9771 = 0;
         OpenGL.glDisable(3089);
         this.method4927(0);
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9834[89] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "t",
      descriptor = "()Z"
   )
   public final boolean method243() {
      try {
         ++field9549;
         return true;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9834[124] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "i",
      descriptor = "(I)V"
   )
   public final void method174(int arg0) {
      try {
         this.method4943((byte)-121);
         ++field9575;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[145] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "b",
      descriptor = "(ZI)V"
   )
   public final void method4947(boolean arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         if (arg0) {
            this.method211((int[])null);
         }

         label45: {
            if (~arg1 != -2) {
               if (arg1 == 0) {
                  this.method4931(8448, 8448, 0);
                  if (!var3) {
                     break label45;
                  }
               }

               if (~arg1 != -3) {
                  if (arg1 != 3) {
                     if (arg1 != 4) {
                        break label45;
                     }

                     this.method4931(34023, 34023, 0);
                     if (!var3) {
                        break label45;
                     }
                  }

                  this.method4931(260, 8448, 0);
                  if (!var3) {
                     break label45;
                  }
               }

               this.method4931(34165, 7681, 0);
               if (!var3) {
                  break label45;
               }
            }

            this.method4931(7681, 7681, 0);
         }

         ++field9561;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field9834[203] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(I[Lpha;)V"
   )
   public final void method199(int arg0, class757[] arg1) {
      boolean var3 = client.field10022;

      try {
         int var4 = 0;
         if (var3) {
            this.field9765[var4] = arg1[var4];
            ++var4;
         }

         while(true) {
            class678 var10000;
            if (var4 >= arg0) {
               ++field9652;
               this.field9740 = arg0;
               var10000 = this;
               if (!var3) {
                  if (~this.field9774 != -2) {
                     this.method4937(0);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = this;
            }

            var10000.field9765[var4] = arg1[var4];
            ++var4;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9834[28] + arg0 + ',' + (arg1 != null ? field9834[8] : field9834[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(FFF)V"
   )
   public final void method195(float arg0, float arg1, float arg2) {
      try {
         class471.field6841 = arg0;
         ++field9545;
         class16.field222 = arg1;
         class797.field11590 = arg2;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field9834[86] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "l",
      descriptor = "(I)V"
   )
   private final void method4948(int arg0) {
      try {
         if (arg0 != 15547) {
            this.field9831 = null;
         }

         label23: {
            if (this.field9651 == null) {
               this.field9608 = this.field9514 = 0;
               if (!client.field10022) {
                  break label23;
               }
            }

            Dimension var2 = this.field9651.getSize();
            this.field9514 = var2.height;
            this.field9608 = var2.width;
         }

         ++field9639;
         if (this.field9691 == null) {
            this.field9615 = this.field9608;
            this.field9538 = this.field9514;
            this.method4924((byte)-53);
         }

         this.method4953((byte)126);
         this.method231();
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[91] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "k",
      descriptor = "(B)I"
   )
   private final int method4949(byte arg0) {
      try {
         ++field9601;
         int var2 = 0;
         this.field9786 = OpenGL.glGetString(7936).toLowerCase();
         this.field9728 = OpenGL.glGetString(7937).toLowerCase();
         if (~this.field9786.indexOf(field9834[50]) != 0) {
            var2 |= 1;
         }

         if (this.field9786.indexOf(field9834[63]) != -1 || ~this.field9786.indexOf(field9834[56]) != 0) {
            var2 |= 1;
         }

         label58: {
            String var3 = OpenGL.glGetString(7938);
            String[] var4 = class757.method5467(5, var3.replace('.', ' '), ' ');
            if (var4.length >= 2) {
               try {
                  int var5 = class510.method3842(var4[0], 109);
                  int var6 = class510.method3842(var4[1], -89);
                  this.field9808 = var5 * 10 + var6;
                  break label58;
               } catch (NumberFormatException var9) {
                  var2 |= 4;
                  if (!client.field10022) {
                     break label58;
                  }
               }
            }

            var2 |= 4;
         }

         if (~this.field9808 > -13) {
            var2 |= 2;
         }

         if (!this.field9520.method5239(field9834[57])) {
            var2 |= 8;
         }

         if (!this.field9520.method5239(field9834[59])) {
            var2 |= 32;
         }

         int[] var7 = new int[1];
         OpenGL.glGetIntegerv(34018, var7, 0);
         if (arg0 < 123) {
            return -82;
         } else {
            this.field9811 = var7[0];
            OpenGL.glGetIntegerv(34929, var7, 0);
            this.field9813 = var7[0];
            OpenGL.glGetIntegerv(34930, var7, 0);
            this.field9763 = var7[0];
            if (~this.field9811 > -3 || ~this.field9813 > -3 || ~this.field9763 > -3) {
               var2 |= 16;
            }

            this.field9826 = Stream.method3185();
            this.field9789 = this.field9520.arePbuffersAvailable();
            this.field9756 = this.field9520.method5239(field9834[45]);
            this.field9800 = this.field9520.method5239(field9834[53]);
            this.field9804 = this.field9520.method5239(field9834[46]);
            this.field9520.method5239(field9834[55]);
            this.field9747 = this.field9520.method5239(field9834[58]);
            this.field9730 = this.field9520.method5239(field9834[47]);
            this.field9731 = this.field9520.method5239(field9834[49]);
            this.field9777 = this.field9520.method5239(field9834[62]);
            this.field9819 = this.field9520.method5239(field9834[48]);
            this.field9739 = this.field9520.method5239(field9834[52]);
            this.field9791 = false;
            this.field9729 = this.field9520.method5239(field9834[51]);
            this.field9821 = this.field9520.method5239(field9834[61]);
            this.field9734 = this.field9520.method5239(field9834[54]);
            this.field9793 = this.field9734 & this.field9821;
            this.field9769 = class238.field3676.startsWith(field9834[64]);
            OpenGL.glGetFloatv(2834, class392.field5701, 0);
            this.field9736 = class392.field5701[1];
            this.field9773 = class392.field5701[0];
            return var2 == 0 ? 0 : var2;
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field9834[60] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "i",
      descriptor = "(II)I"
   )
   public final int method4950(int arg0, int arg1) {
      try {
         if (arg1 != -6411) {
            this.field9812 = -28;
         }

         ++field9560;
         if (arg0 != 6406 && ~arg0 != -6410) {
            if (~arg0 != -6411 && ~arg0 != -34847 && ~arg0 != -34845) {
               if (~arg0 == -6408) {
                  return 3;
               } else if (arg0 != 6408 && arg0 != 34847) {
                  if (~arg0 == -34844) {
                     return 6;
                  } else if (arg0 != 34842) {
                     if (arg0 != 6402) {
                        if (arg0 == 6401) {
                           return 1;
                        } else {
                           throw new IllegalArgumentException("");
                        }
                     } else {
                        return 3;
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
         throw class612.method4503(var4, field9834[141] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(BLwi;)V"
   )
   public final void method4951(byte arg0, class373 arg1) {
      boolean var3 = client.field10022;

      try {
         label41: {
            ++field9657;
            if (!this.field9821) {
               if (~this.field9695 > -1 || this.field9694[this.field9695] != arg1) {
                  throw new RuntimeException();
               }

               this.field9694[this.field9695--] = null;
               arg1.method2920(25796);
               if (this.field9695 < 0) {
                  this.field9690 = this.field9691 = null;
                  if (!var3) {
                     break label41;
                  }
               }

               this.field9690 = this.field9691 = this.field9694[this.field9695];
               this.field9690.method2922((byte)-79);
               if (!var3) {
                  break label41;
               }
            }

            this.method4913(arg1, -15847);
            this.method4920(arg1, 1729665456);
         }

         int var4 = -73 % ((-64 - arg0) / 58);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9834[17] + arg0 + ',' + (arg1 != null ? field9834[8] : field9834[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(IIIILss;)V"
   )
   public final void method4952(int arg0, int arg1, int arg2, int arg3, class723 arg4) {
      try {
         ++field9580;
         if (arg0 <= 122) {
            this.field9676 = null;
         }

         int var6 = arg4.method993((byte)116);
         int var9 = arg3 * this.method4928(7896, var6);
         this.method4892(arg4, (byte)-21);
         OpenGL.glDrawElements(arg1, arg2, var6, arg4.method992(16161) + (long)var9);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field9834[148] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field9834[8] : field9834[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "f",
      descriptor = "(B)V"
   )
   public final void method4953(byte arg0) {
      try {
         if (~this.field9774 != -1) {
            this.field9713 &= -32;
            this.field9774 = 0;
         }

         ++field9605;
         if (arg0 <= 117) {
            this.method159(2, 71, 34, -127, true);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[135] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "l",
      descriptor = "(II)V"
   )
   public final void method4954(int arg0, int arg1) {
      try {
         if (arg0 != 2912) {
            this.field9770 = false;
         }

         ++field9594;
         this.method4925((byte)95, arg1, true);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[125] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(IIZ)Lma;"
   )
   public final class148 method247(int arg0, int arg1, boolean arg2) {
      try {
         ++field9650;
         return new class132(this, arg0, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field9834[173] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(IIIIZ)Lma;"
   )
   public final class148 method159(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         ++field9492;
         return new class132(this, arg0, arg1, arg2, arg3);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field9834[201] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(FI)V"
   )
   public final void method4955(float arg0, int arg1) {
      try {
         if (arg1 >= 24) {
            if (this.field9743 != arg0) {
               this.field9743 = arg0;
               if (~this.field9774 == -4) {
                  this.method4916(24);
               }
            }

            ++field9603;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[76] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "H",
      descriptor = "(III[I)V"
   )
   public final void method248(int arg0, int arg1, int arg2, int[] arg3) {
      try {
         ++field9518;
         float var5 = (float)arg2 * this.field9709.field4334 + (float)arg0 * this.field9709.field4330 + (float)arg1 * this.field9709.field4347 + this.field9709.field4339;
         if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
         } else {
            int var6 = (int)(((float)arg2 * this.field9709.field4308 + (float)arg0 * this.field9709.field4306 + (float)arg1 * this.field9709.field4312 + this.field9709.field4307) * (float)this.field9735 / var5);
            int var7 = (int)(((float)arg2 * this.field9709.field4345 + (float)arg0 * this.field9709.field4333 + (float)arg1 * this.field9709.field4336 + this.field9709.field4321) * (float)this.field9822 / var5);
            arg3[0] = (int)((float)var6 + -this.field9809);
            arg3[1] = (int)((float)var7 - this.field9721);
            arg3[2] = (int)var5;
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field9834[199] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9834[8] : field9834[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "s",
      descriptor = "(I)V"
   )
   public final void method4956(int arg0) {
      try {
         if (arg0 != 34161) {
            this.method4924((byte)-121);
         }

         OpenGL.glPopMatrix();
         ++field9592;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[133] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "m",
      descriptor = "(I)V"
   )
   public final void method4957(int arg0) {
      try {
         if (arg0 == 31691) {
            ++field9496;
            if (this.field9713 != 16) {
               this.method4910(-8);
               this.method4934(true, (byte)103);
               this.method4917(arg0 + -28762, true);
               this.method4894(true, (byte)56);
               this.method4965(1, (byte)-86);
               this.field9713 = 16;
            }
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[118] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "b",
      descriptor = "(IZ)V"
   )
   public final void method4958(int arg0, boolean arg1) {
      try {
         ++field9616;
         if (~this.field9815 != ~arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field9815 = arg0;
         }

         if (arg1) {
            this.method4945(false);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[218] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method155(int arg0) {
      try {
         ++field9662;
         if (arg0 != 1) {
            throw new IllegalArgumentException("");
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[73] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "A",
      descriptor = "(I)V"
   )
   private final void method4959(int arg0) {
      try {
         label24: {
            ++field9622;
            if (!this.field9817 || this.field9783) {
               OpenGL.glDisable(2896);
               if (!client.field10022) {
                  break label24;
               }
            }

            OpenGL.glEnable(2896);
         }

         int var2 = -68 / ((arg0 - 34) / 49);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[217] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "m",
      descriptor = "(B)V"
   )
   private final void method4960(byte arg0) {
      try {
         class392.field5701[3] = 1.0F;
         ++field9521;
         class392.field5701[0] = this.field9796 * this.field9755;
         class392.field5701[1] = this.field9794 * this.field9755;
         class392.field5701[2] = this.field9799 * this.field9755;
         OpenGL.glLightfv(16384, 4609, class392.field5701, 0);
         class392.field5701[3] = 1.0F;
         class392.field5701[1] = -this.field9745 * this.field9794;
         if (arg0 >= 31) {
            class392.field5701[0] = -this.field9745 * this.field9796;
            class392.field5701[2] = -this.field9745 * this.field9799;
            OpenGL.glLightfv(16385, 4609, class392.field5701, 0);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "I",
      descriptor = "()I"
   )
   public final int method156() {
      try {
         ++field9526;
         int var1 = this.field9828;
         this.field9828 = 0;
         return var1;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[134] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "d",
      descriptor = "(III)V"
   )
   public final synchronized void method4961(int arg0, int arg1, int arg2) {
      try {
         if (arg0 == 0) {
            ++field9558;
            class288 var4 = new class288(arg1);
            var4.field3777 = (long)arg2;
            this.field9700.method2238(var4, 13);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9834[67] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "EA",
      descriptor = "(IIII)V"
   )
   public final void method250(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field9606;
         if (!this.field9792) {
            throw new RuntimeException("");
         } else {
            this.field9787 = arg0;
            this.field9752 = arg3;
            this.field9795 = arg1;
            this.field9750 = arg2;
            if (this.field9753) {
               this.field9670.field3136.method4781(34336);
               this.field9670.field3136.method4779(-53);
            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9834[37] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "y",
      descriptor = "(I)V"
   )
   public final void method4962(int arg0) {
      try {
         OpenGL.glLightfv(16384, 4611, this.field9758, 0);
         int var2 = 75 / ((arg0 - -29) / 53);
         ++field9574;
         OpenGL.glLightfv(16385, 4611, this.field9790, 0);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[29] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method191(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field9676.method5021(arg2, arg3, (byte)53, arg1, arg0);
         ++field9614;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9834[119] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(Leca;IIII)Lka;"
   )
   public final class761 method240(class590 arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field9480;
         return new class71(this, arg0, arg1, arg3, arg4, arg2);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field9834[65] + (arg0 != null ? field9834[8] : field9834[9]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method146(Canvas arg0, int arg1, int arg2) {
      try {
         ++field9469;
         if (this.field9569 == arg0) {
            throw new RuntimeException();
         } else if (!this.field9618.containsKey(arg0)) {
            if (!arg0.isShowing()) {
               throw new RuntimeException();
            } else {
               try {
                  Class var4 = Class.forName(field9834[143]);
                  Method var5 = var4.getMethod(field9834[142], Boolean.TYPE);
                  var5.invoke(arg0, Boolean.TRUE);
               } catch (Exception var9) {
               }

               long var6 = this.field9520.prepareSurface(arg0);
               if (~var6 == 0L) {
                  throw new RuntimeException();
               } else {
                  this.field9618.put(arg0, new Long(var6));
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field9834[144] + (arg0 != null ? field9834[8] : field9834[9]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "U",
      descriptor = "(IIIII)V"
   )
   public final void method218(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.method4890((byte)-76);
         ++field9544;
         this.method4965(arg4, (byte)-113);
         float var6 = (float)arg0 + 0.35F;
         OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
         float var7 = (float)arg1 + 0.35F;
         OpenGL.glBegin(1);
         OpenGL.glVertex2f(var6, var7);
         OpenGL.glVertex2f((float)arg2 + var6, var7);
         OpenGL.glEnd();
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field9834[147] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "w",
      descriptor = "(I)V"
   )
   private final void method4963(int arg0) {
      try {
         if (arg0 != 0) {
            this.field9755 = 0.80847573F;
         }

         OpenGL.glDepthMask(this.field9708 && this.field9778);
         ++field9625;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9834[75] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "b",
      descriptor = "()Z"
   )
   public final boolean method168() {
      try {
         ++field9612;
         return this.field9675 != null && (~this.field9673 >= -2 || this.field9793);
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9834[129] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "XA",
      descriptor = "()I"
   )
   public final int method212() {
      try {
         ++field9591;
         return this.field9738;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9834[126] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(ZLwi;)V"
   )
   public final void method4964(boolean arg0, class373 arg1) {
      try {
         ++field9508;
         if (!arg0) {
            this.field9790 = null;
         }

         if (!this.field9821) {
            if (this.field9695 >= 3) {
               throw new RuntimeException();
            } else {
               if (~this.field9695 <= -1) {
                  this.field9694[this.field9695].method2920(25796);
               }

               this.field9690 = this.field9691 = this.field9694[++this.field9695] = arg1;
               this.field9690.method2922((byte)-79);
            }
         } else {
            this.method4939(-78, arg1);
            this.method4926(arg1, -4);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9834[196] + arg0 + ',' + (arg1 != null ? field9834[8] : field9834[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method4965(int arg0, byte arg1) {
      boolean var3 = client.field10022;

      try {
         ++field9513;
         if (this.field9712 != arg0) {
            boolean var4;
            byte var5;
            boolean var6;
            label101: {
               if (arg0 != 1) {
                  if (~arg0 != -3) {
                     if (~arg0 == -129) {
                        var4 = true;
                        var5 = 3;
                        var6 = true;
                        if (!var3) {
                           break label101;
                        }
                     }

                     var6 = true;
                     var5 = 0;
                     var4 = false;
                     if (!var3) {
                        break label101;
                     }
                  }

                  var5 = 2;
                  var4 = false;
                  var6 = true;
                  if (!var3) {
                     break label101;
                  }
               }

               var4 = true;
               var6 = true;
               var5 = 1;
            }

            if (var6 == !this.field9706) {
               OpenGL.glColorMask(var6, var6, var6, true);
               this.field9706 = var6;
            }

            if (!this.field9711 != !var4) {
               label84: {
                  if (var4) {
                     OpenGL.glEnable(3008);
                     if (!var3) {
                        break label84;
                     }
                  }

                  OpenGL.glDisable(3008);
               }

               this.field9711 = var4;
            }

            if (this.field9714 != var5) {
               label111: {
                  if (~var5 == -2) {
                     OpenGL.glEnable(3042);
                     OpenGL.glBlendFunc(770, 771);
                     if (!var3) {
                        break label111;
                     }
                  }

                  if (~var5 != -3) {
                     if (var5 != 3) {
                        OpenGL.glDisable(3042);
                        if (!var3) {
                           break label111;
                        }
                     }

                     OpenGL.glEnable(3042);
                     OpenGL.glBlendFunc(774, 1);
                     if (!var3) {
                        break label111;
                     }
                  }

                  OpenGL.glEnable(3042);
                  OpenGL.glBlendFunc(1, 1);
               }

               this.field9714 = var5;
            }

            this.field9712 = arg0;
            this.field9713 &= -29;
         }

         if (arg1 > -59) {
            this.field9726 = null;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field9834[176] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4966(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 97);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4967(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 29;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 109;
            break;
         default:
            var10005 = 97;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
