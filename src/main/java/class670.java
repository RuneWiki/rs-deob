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

@OriginalClass("client!or")
public class class670 extends class65 {
   @OriginalMember(
      owner = "client!or",
      name = "Rf",
      descriptor = "Ljava/util/Hashtable;"
   )
   private Hashtable field9559;
   @OriginalMember(
      owner = "client!or",
      name = "V",
      descriptor = "I"
   )
   public int field9706;
   @OriginalMember(
      owner = "client!or",
      name = "gb",
      descriptor = "Lnga;"
   )
   private class543 field9702;
   @OriginalMember(
      owner = "client!or",
      name = "ng",
      descriptor = "Lbia;"
   )
   private class528 field9707;
   @OriginalMember(
      owner = "client!or",
      name = "mb",
      descriptor = "Lbia;"
   )
   public class528 field9708;
   @OriginalMember(
      owner = "client!or",
      name = "Vc",
      descriptor = "I"
   )
   public int field9709;
   @OriginalMember(
      owner = "client!or",
      name = "ub",
      descriptor = "I"
   )
   public int field9712;
   @OriginalMember(
      owner = "client!or",
      name = "df",
      descriptor = "Z"
   )
   private boolean field9715;
   @OriginalMember(
      owner = "client!or",
      name = "jb",
      descriptor = "Lod;"
   )
   private class536 field9710;
   @OriginalMember(
      owner = "client!or",
      name = "ch",
      descriptor = "I"
   )
   private int field9722;
   @OriginalMember(
      owner = "client!or",
      name = "Ud",
      descriptor = "[Lhd;"
   )
   private class776[] field9718;
   @OriginalMember(
      owner = "client!or",
      name = "rb",
      descriptor = "I"
   )
   private int field9717;
   @OriginalMember(
      owner = "client!or",
      name = "Z",
      descriptor = "I"
   )
   private int field9719;
   @OriginalMember(
      owner = "client!or",
      name = "sh",
      descriptor = "[Lhd;"
   )
   private class776[] field9723;
   @OriginalMember(
      owner = "client!or",
      name = "Tc",
      descriptor = "[Lhd;"
   )
   private class776[] field9724;
   @OriginalMember(
      owner = "client!or",
      name = "ld",
      descriptor = "Lod;"
   )
   private class536 field9728;
   @OriginalMember(
      owner = "client!or",
      name = "kf",
      descriptor = "Lod;"
   )
   private class536 field9730;
   @OriginalMember(
      owner = "client!or",
      name = "Qb",
      descriptor = "Lod;"
   )
   private class536 field9731;
   @OriginalMember(
      owner = "client!or",
      name = "kh",
      descriptor = "Lod;"
   )
   private class536 field9732;
   @OriginalMember(
      owner = "client!or",
      name = "Lg",
      descriptor = "Lod;"
   )
   private class536 field9733;
   @OriginalMember(
      owner = "client!or",
      name = "Qd",
      descriptor = "Lod;"
   )
   private class536 field9734;
   @OriginalMember(
      owner = "client!or",
      name = "rd",
      descriptor = "Lod;"
   )
   private class536 field9735;
   @OriginalMember(
      owner = "client!or",
      name = "Ng",
      descriptor = "Lbia;"
   )
   public class528 field9737;
   @OriginalMember(
      owner = "client!or",
      name = "cb",
      descriptor = "Lbia;"
   )
   public class528 field9745;
   @OriginalMember(
      owner = "client!or",
      name = "Ug",
      descriptor = "Lbia;"
   )
   public class528 field9746;
   @OriginalMember(
      owner = "client!or",
      name = "lb",
      descriptor = "I"
   )
   public int field9753;
   @OriginalMember(
      owner = "client!or",
      name = "We",
      descriptor = "I"
   )
   public int field9754;
   @OriginalMember(
      owner = "client!or",
      name = "Ie",
      descriptor = "I"
   )
   private int field9750;
   @OriginalMember(
      owner = "client!or",
      name = "Te",
      descriptor = "F"
   )
   private float field9792;
   @OriginalMember(
      owner = "client!or",
      name = "fh",
      descriptor = "I"
   )
   public int field9772;
   @OriginalMember(
      owner = "client!or",
      name = "Pb",
      descriptor = "F"
   )
   private float field9793;
   @OriginalMember(
      owner = "client!or",
      name = "eg",
      descriptor = "I"
   )
   public int field9774;
   @OriginalMember(
      owner = "client!or",
      name = "sf",
      descriptor = "F"
   )
   private float field9789;
   @OriginalMember(
      owner = "client!or",
      name = "Db",
      descriptor = "Z"
   )
   private boolean field9782;
   @OriginalMember(
      owner = "client!or",
      name = "Wd",
      descriptor = "[Loda;"
   )
   private class127[] field9779;
   @OriginalMember(
      owner = "client!or",
      name = "af",
      descriptor = "F"
   )
   public float field9795;
   @OriginalMember(
      owner = "client!or",
      name = "Ue",
      descriptor = "F"
   )
   public float field9805;
   @OriginalMember(
      owner = "client!or",
      name = "G",
      descriptor = "F"
   )
   public float field9819;
   @OriginalMember(
      owner = "client!or",
      name = "u",
      descriptor = "I"
   )
   private int field9804;
   @OriginalMember(
      owner = "client!or",
      name = "He",
      descriptor = "I"
   )
   public int field9780;
   @OriginalMember(
      owner = "client!or",
      name = "mg",
      descriptor = "F"
   )
   public float field9797;
   @OriginalMember(
      owner = "client!or",
      name = "Ac",
      descriptor = "I"
   )
   private int field9820;
   @OriginalMember(
      owner = "client!or",
      name = "jc",
      descriptor = "I"
   )
   public int field9806;
   @OriginalMember(
      owner = "client!or",
      name = "vf",
      descriptor = "I"
   )
   public int field9787;
   @OriginalMember(
      owner = "client!or",
      name = "Ic",
      descriptor = "[F"
   )
   private float[] field9834;
   @OriginalMember(
      owner = "client!or",
      name = "zd",
      descriptor = "I"
   )
   private int field9785;
   @OriginalMember(
      owner = "client!or",
      name = "Xf",
      descriptor = "I"
   )
   public int field9835;
   @OriginalMember(
      owner = "client!or",
      name = "Ze",
      descriptor = "[F"
   )
   private float[] field9784;
   @OriginalMember(
      owner = "client!or",
      name = "W",
      descriptor = "I"
   )
   private int field9824;
   @OriginalMember(
      owner = "client!or",
      name = "Gf",
      descriptor = "I"
   )
   private int field9794;
   @OriginalMember(
      owner = "client!or",
      name = "cf",
      descriptor = "I"
   )
   public int field9823;
   @OriginalMember(
      owner = "client!or",
      name = "z",
      descriptor = "[F"
   )
   private float[] field9828;
   @OriginalMember(
      owner = "client!or",
      name = "vd",
      descriptor = "F"
   )
   public float field9790;
   @OriginalMember(
      owner = "client!or",
      name = "r",
      descriptor = "F"
   )
   public float field9831;
   @OriginalMember(
      owner = "client!or",
      name = "ec",
      descriptor = "[F"
   )
   private float[] field9810;
   @OriginalMember(
      owner = "client!or",
      name = "og",
      descriptor = "I"
   )
   private int field9841;
   @OriginalMember(
      owner = "client!or",
      name = "I",
      descriptor = "F"
   )
   private float field9812;
   @OriginalMember(
      owner = "client!or",
      name = "gh",
      descriptor = "I"
   )
   private int field9827;
   @OriginalMember(
      owner = "client!or",
      name = "Fe",
      descriptor = "I"
   )
   private int field9843;
   @OriginalMember(
      owner = "client!or",
      name = "qg",
      descriptor = "F"
   )
   public float field9825;
   @OriginalMember(
      owner = "client!or",
      name = "Df",
      descriptor = "I"
   )
   public int field9842;
   @OriginalMember(
      owner = "client!or",
      name = "Ff",
      descriptor = "I"
   )
   public int field9846;
   @OriginalMember(
      owner = "client!or",
      name = "Td",
      descriptor = "F"
   )
   private float field9832;
   @OriginalMember(
      owner = "client!or",
      name = "If",
      descriptor = "[F"
   )
   public float[] field9757;
   @OriginalMember(
      owner = "client!or",
      name = "Pe",
      descriptor = "I"
   )
   private int field9856;
   @OriginalMember(
      owner = "client!or",
      name = "ae",
      descriptor = "Z"
   )
   private boolean field9854;
   @OriginalMember(
      owner = "client!or",
      name = "Ig",
      descriptor = "Liu;"
   )
   public class608 field9769;
   @OriginalMember(
      owner = "client!or",
      name = "Ub",
      descriptor = "[B"
   )
   public byte[] field9859;
   @OriginalMember(
      owner = "client!or",
      name = "Og",
      descriptor = "[I"
   )
   public int[] field9861;
   @OriginalMember(
      owner = "client!or",
      name = "zb",
      descriptor = "[I"
   )
   public int[] field9860;
   @OriginalMember(
      owner = "client!or",
      name = "Nb",
      descriptor = "[I"
   )
   public int[] field9862;
   @OriginalMember(
      owner = "client!or",
      name = "Sf",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field9657;
   @OriginalMember(
      owner = "client!or",
      name = "D",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field9544;
   @OriginalMember(
      owner = "client!or",
      name = "Ad",
      descriptor = "I"
   )
   public int field9705;
   @OriginalMember(
      owner = "client!or",
      name = "Xe",
      descriptor = "Ljaggl/OpenGL;"
   )
   private OpenGL field9516;
   @OriginalMember(
      owner = "client!or",
      name = "id",
      descriptor = "J"
   )
   private long field9695;
   @OriginalMember(
      owner = "client!or",
      name = "Pf",
      descriptor = "J"
   )
   private long field9556;
   @OriginalMember(
      owner = "client!or",
      name = "gd",
      descriptor = "Z"
   )
   public boolean field9773;
   @OriginalMember(
      owner = "client!or",
      name = "De",
      descriptor = "I"
   )
   public int field9852;
   @OriginalMember(
      owner = "client!or",
      name = "vb",
      descriptor = "Ljava/lang/String;"
   )
   private String field9836;
   @OriginalMember(
      owner = "client!or",
      name = "rc",
      descriptor = "Z"
   )
   private boolean field9814;
   @OriginalMember(
      owner = "client!or",
      name = "wf",
      descriptor = "Z"
   )
   public boolean field9770;
   @OriginalMember(
      owner = "client!or",
      name = "Rb",
      descriptor = "Z"
   )
   public boolean field9851;
   @OriginalMember(
      owner = "client!or",
      name = "ad",
      descriptor = "Z"
   )
   public boolean field9809;
   @OriginalMember(
      owner = "client!or",
      name = "fb",
      descriptor = "Z"
   )
   public boolean field9776;
   @OriginalMember(
      owner = "client!or",
      name = "ve",
      descriptor = "Z"
   )
   private boolean field9837;
   @OriginalMember(
      owner = "client!or",
      name = "ze",
      descriptor = "Ljava/lang/String;"
   )
   private String field9786;
   @OriginalMember(
      owner = "client!or",
      name = "Vg",
      descriptor = "Z"
   )
   public boolean field9857;
   @OriginalMember(
      owner = "client!or",
      name = "Hf",
      descriptor = "Z"
   )
   private boolean field9817;
   @OriginalMember(
      owner = "client!or",
      name = "le",
      descriptor = "Ltu;"
   )
   private class370 field9703;
   @OriginalMember(
      owner = "client!or",
      name = "td",
      descriptor = "Lcm;"
   )
   public class762 field9713;
   @OriginalMember(
      owner = "client!or",
      name = "rf",
      descriptor = "Lhj;"
   )
   private class599 field9696;
   @OriginalMember(
      owner = "client!or",
      name = "ab",
      descriptor = "Lke;"
   )
   private class628 field9697;
   @OriginalMember(
      owner = "client!or",
      name = "Je",
      descriptor = "Ldka;"
   )
   private class13 field9699;
   @OriginalMember(
      owner = "client!or",
      name = "wh",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9864 = new String[]{method4917(method4916("`Us}\r'")), method4917(method4916("t\ts\u001c6")), method4917(method4916("`Usd\t'")), method4917(method4916("aR1^")), method4917(method4916("`Usg\t'")), method4917(method4916("fI)W'")), method4917(method4916("`Uss\u000f'")), method4917(method4916("aQ4V\"n")), method4917(method4916("@W8\\\fC")), method4917(method4916("nS4")), method4917(method4916("`Usz\u000e'")), method4917(method4916("`Us{\n'")), method4917(method4916("`Usfc")), method4917(method4916("`Us|\f'")), method4917(method4916("`Usu\t'")), method4917(method4916("`Usx\t'")), method4917(method4916("`Usq\f'")), method4917(method4916("`Usc\r'")), method4917(method4916("`Usdc")), method4917(method4916("`Usj\n'")), method4917(method4916("`UsJ*'")), method4917(method4916("`Us|\b'")), method4917(method4916("`Us~\r'")), method4917(method4916("`Uss\b'")), method4917(method4916("`Us}\t'")), method4917(method4916("`Us~\b'")), method4917(method4916("`Us}\b'")), method4917(method4916("`Us^*'")), method4917(method4916("`Usu\f'")), method4917(method4916("`Usu\n'")), method4917(method4916("`Usy\n'")), method4917(method4916("`Usy\u000e'")), method4917(method4916("`Usq\b'")), method4917(method4916("`Us`\b'")), method4917(method4916("`Us~\n'")), method4917(method4916("`Usd\r'")), method4917(method4916("`Usjc")), method4917(method4916("`Usp\u000e'")), method4917(method4916("`Usz\r'")), method4917(method4916("`Us~\t'")), method4917(method4916("`Usw\u000f'")), method4917(method4916("`UsK*'")), method4917(method4916("`Usq\n'")), method4917(method4916("`Usy\u000f'")), method4917(method4916("`Us~\u000f'")), method4917(method4916("`Us}\u000f'")), method4917(method4916("`Us\u007f\f'")), method4917(method4916("`UsTc")), method4917(method4916("`Us\u007f\r'")), method4917(method4916("`Usu\b'")), method4917(method4916("`Us{\u000f'")), method4917(method4916("`Usf\n'")), method4917(method4916("`Uszc")), method4917(method4916("`Us`\n'")), method4917(method4916("`Us}c")), method4917(method4916("`Ust\f'")), method4917(method4916("`Usu\u000e'")), method4917(method4916("`Usw\u000e'")), method4917(method4916("`Usx\f'")), method4917(method4916("`Usy\t'")), method4917(method4916("`Us\u007f\t'")), method4917(method4916("`Use\t'")), method4917(method4916("`Us|\u000f'")), method4917(method4916("`Us{\u000e'")), method4917(method4916("`Us{\t'")), method4917(method4916("`Us[c")), method4917(method4916("`Ust\u000f'")), method4917(method4916("`Usw\f'")), method4917(method4916("`UsB*'")), method4917(method4916("`Uss\u000e'")), method4917(method4916("`Uss\r'")), method4917(method4916("`Us@c")), method4917(method4916("`Usa\t'")), method4917(method4916("eF+SenP)\u001c\bnI+S8")), method4917(method4916("`Usac")), method4917(method4916("|B){,aH/W\u0019jW<[%{")), method4917(method4916("`Us\u007f\u000f'")), method4917(method4916("`Usv\b'")), method4917(method4916("`Usz\n'")), method4917(method4916("`Usb\u000e'")), method4917(method4916("`Ust\r'")), method4917(method4916("`Usb\r'")), method4917(method4916("`Us`\t'")), method4917(method4916("`Uskc")), method4917(method4916("`Ust\t'")), method4917(method4916("`Use\n'")), method4917(method4916("`Usc\u000f'")), method4917(method4916("`Ustc")), method4917(method4916("`Usg\u000e'")), method4917(method4916("`Usz\t'")), method4917(method4916("`Usp\u000f'")), method4917(method4916("`Usc\n'")), method4917(method4916("`Usb\u000f'")), method4917(method4916("`Usw\r'")), method4917(method4916("`Usx\b'")), method4917(method4916("`Us|\t'")), method4917(method4916("`Usv\f'")), method4917(method4916("`Usv\u000f'")), method4917(method4916("`Usq\u000f'")), method4917(method4916("`Us{\r'")), method4917(method4916("`Usf\b'")), method4917(method4916("`Usbc")), method4917(method4916("`Us}\n'")), method4917(method4916("`Usp\n'")), method4917(method4916("`Us}\u000e'")), method4917(method4916("`Usz\f'")), method4917(method4916("`Us`\u000f'")), method4917(method4916("`Usg\b'")), method4917(method4916("`Usv\u000e'")), method4917(method4916("`Usx\u000e'")), method4917(method4916("`Uss\n'")), method4917(method4916("`Us\\*'")), method4917(method4916("`Usvc")), method4917(method4916("`Usx\r'")), method4917(method4916("`Us~\f'")), method4917(method4916("`Use\u000e'")), method4917(method4916("`Us|\n'")), method4917(method4916("`Usg\r'")), method4917(method4916("`Use\u000f'")), method4917(method4916("`Usf\u000e'")), method4917(method4916("`Usf\u000f'")), method4917(method4916("`Usa\u000e'")), method4917(method4916("`Usd\u000e'")), method4917(method4916("`Usp\b'")), method4917(method4916("`Usec")), method4917(method4916("`Usa\u000f'")), method4917(method4916("`Us\u007f\b'")), method4917(method4916("`Usy\f'")), method4917(method4916("`Usxc")), method4917(method4916("`Uss\f'")), method4917(method4916("`Usw\t'")), method4917(method4916("Hk\u0002s\u0019Mx)W3{R/W\u0014lR?W\u0014bF-")), method4917(method4916("bB.S")), method4917(method4916("Hk\u0002s\u0019Mx+W9{B%m8gF9W9")), method4917(method4916("Hk\u0002s\u0019Mx+W9{B%m)zA;W9PH?X.lS")), method4917(method4916("mU4S%/W<G'")), method4917(method4916("Hk\u0002s\u0019Mx0G'{N.S&\u007fK8")), method4917(method4916("Hk\u0002s\u0019Mx;@*hJ8\\?PW/],}F0")), method4917(method4916("Hk\u0002s\u0019Mx0G'{N)W3{R/W")), method4917(method4916("Hk\u0002s\u0019Mx)W3{R/W\u0014iK2S?")), method4917(method4916("Hk\u0002s\u0019Mx;@*hJ8\\?PT5S/jU")), method4917(method4916("Hk\u0002w\u0013[x;@*bB?G-iB/m$mM8Q?")), method4917(method4916("`Usd\u000f'")), method4917(method4916("bN>@$|H;F")), method4917(method4916("Hk\u0002w\u0013[x)W3{R/WxK")), method4917(method4916("bF>")), method4917(method4916("Hk\u0002s\u0019Mx)W3{R/W\u0014}B>F*a@1W")), method4917(method4916("Hk\u0002s\u0019Mx+W9{B%m;}H:@*b")), method4917(method4916("Hk\u0002s\u0019Mx)W3{R/W\u0014jI+m(`J?[%j")), method4917(method4916("Hk\u0002w\u0013[x;@*bB?G-iB/m&zK)[8nJ-^.")), method4917(method4916("Hk\u0002w\u0013[x;@*bB?G-iB/m)cN)")), method4917(method4916("`Usv\n'")), method4917(method4916("`Usw\n'")), method4917(method4916("`Us\u007f\u000e'")), method4917(method4916("`Usa\n'")), method4917(method4916("`Us|\u000e'")), method4917(method4916("`Usy\b'")), method4917(method4916("`Uscc")), method4917(method4916("`Usv\t'")), method4917(method4916("`Usz\u000f'")), method4917(method4916("`Us\u007f\n'")), method4917(method4916("`Usy\r'")), method4917(method4916("`Ust\b'")), method4917(method4916("`Usq\r'")), method4917(method4916("`Use\b'")), method4917(method4916("`UsV*'")), method4917(method4916("`Ush\n'")), method4917(method4916("`Usp\t'")), method4917(method4916("`Us~c")), method4917(method4916("`Usb\b'")), method4917(method4916("`Uspc")), method4917(method4916("`Usuc")), method4917(method4916("`Usd\b'")), method4917(method4916("`Us{\b'")), method4917(method4916("`Usd\n'")), method4917(method4916("`Usp\f'")), method4917(method4916("`Usg\u000f'")), method4917(method4916("`Usu\r'")), method4917(method4916("`Usf\r'")), method4917(method4916("`Usv\r'")), method4917(method4916("`Uswc")), method4917(method4916("`Usb\n'")), method4917(method4916("`Usq\t'")), method4917(method4916("`Usc\t'")), method4917(method4916("`Us{\f'")), method4917(method4916("`Usu\u000f'")), method4917(method4916("`Uss\t'")), method4917(method4916("`Us\u007fc")), method4917(method4916("`Usx\u000f'")), method4917(method4916("`Usa\r'")), method4917(method4916("`Usf\t'")), method4917(method4916("`Usq\u000e'")), method4917(method4916("`Usc\u000e'")), method4917(method4916("`Ust\u000e'")), method4917(method4916("`Usg\n'")), method4917(method4916("`Us@*'")), method4917(method4916("`UsH*'")), method4917(method4916("`Usc\b'")), method4917(method4916("`Us`\r'")), method4917(method4916("eF:U'")), method4917(method4916("|\u0014}U9nW5[(|")), method4917(method4916("}F9W$a")), method4917(method4916("`Us\u000e\"aN)\fc")), method4917(method4916("Hk\u0002s\u0019Mx5S'ix;^$nS\u0002B\"wB1")), method4917(method4916("eF>^\"m")), method4917(method4916("gC")), method4917(method4916("`Us|c")), method4917(method4916("`Us`c")), method4917(method4916("`Usz\b'")), method4917(method4916("`Usyc")), method4917(method4916("`Use\r'")), method4917(method4916("`Us~\u000e'")), method4917(method4916("`Usx\n'")), method4917(method4916("`Usgc")), method4917(method4916("`Us|\r'")), method4917(method4916("`Usp\r'")), method4917(method4916("`Ust\n'")), method4917(method4916("`Us{c")), method4917(method4916("`Us`\u000e'")), method4917(method4916("`Usqc")), method4917(method4916("`Usw\b'")), method4917(method4916("`Ussc")), method4917(method4916("`UsS*'")), method4917(method4916("`Usb\t'")), method4917(method4916("`Usa\b'")), method4917(method4916("`UsPc"))};
   @OriginalMember(
      owner = "client!or",
      name = "bc",
      descriptor = "[I"
   )
   public static int[] field9536 = new int[2048];
   @OriginalMember(
      owner = "client!or",
      name = "x",
      descriptor = "I"
   )
   public static int field9552 = 0;
   @OriginalMember(
      owner = "client!or",
      name = "hf",
      descriptor = "Ltv;"
   )
   public static class590 field9690 = new class590(4);
   @OriginalMember(
      owner = "client!or",
      name = "jh",
      descriptor = "F"
   )
   private float field9756;
   @OriginalMember(
      owner = "client!or",
      name = "uc",
      descriptor = "F"
   )
   public float field9760;
   @OriginalMember(
      owner = "client!or",
      name = "ah",
      descriptor = "F"
   )
   private float field9764;
   @OriginalMember(
      owner = "client!or",
      name = "Ee",
      descriptor = "F"
   )
   public float field9798;
   @OriginalMember(
      owner = "client!or",
      name = "kd",
      descriptor = "F"
   )
   public float field9808;
   @OriginalMember(
      owner = "client!or",
      name = "Fb",
      descriptor = "F"
   )
   public float field9816;
   @OriginalMember(
      owner = "client!or",
      name = "zf",
      descriptor = "F"
   )
   public float field9821;
   @OriginalMember(
      owner = "client!or",
      name = "Sg",
      descriptor = "F"
   )
   private float field9847;
   @OriginalMember(
      owner = "client!or",
      name = "A",
      descriptor = "F"
   )
   public float field9849;
   @OriginalMember(
      owner = "client!or",
      name = "Ld",
      descriptor = "I"
   )
   public static int field9496;
   @OriginalMember(
      owner = "client!or",
      name = "Wf",
      descriptor = "I"
   )
   public static int field9497;
   @OriginalMember(
      owner = "client!or",
      name = "se",
      descriptor = "I"
   )
   public static int field9498;
   @OriginalMember(
      owner = "client!or",
      name = "tf",
      descriptor = "I"
   )
   public static int field9499;
   @OriginalMember(
      owner = "client!or",
      name = "te",
      descriptor = "I"
   )
   public static int field9500;
   @OriginalMember(
      owner = "client!or",
      name = "yc",
      descriptor = "I"
   )
   public static int field9501;
   @OriginalMember(
      owner = "client!or",
      name = "je",
      descriptor = "I"
   )
   public static int field9502;
   @OriginalMember(
      owner = "client!or",
      name = "Qg",
      descriptor = "I"
   )
   public static int field9503;
   @OriginalMember(
      owner = "client!or",
      name = "wc",
      descriptor = "I"
   )
   public static int field9504;
   @OriginalMember(
      owner = "client!or",
      name = "we",
      descriptor = "I"
   )
   public static int field9505;
   @OriginalMember(
      owner = "client!or",
      name = "sd",
      descriptor = "I"
   )
   public static int field9506;
   @OriginalMember(
      owner = "client!or",
      name = "C",
      descriptor = "I"
   )
   public static int field9507;
   @OriginalMember(
      owner = "client!or",
      name = "Wg",
      descriptor = "I"
   )
   public static int field9508;
   @OriginalMember(
      owner = "client!or",
      name = "oe",
      descriptor = "I"
   )
   public static int field9509;
   @OriginalMember(
      owner = "client!or",
      name = "ud",
      descriptor = "I"
   )
   public static int field9510;
   @OriginalMember(
      owner = "client!or",
      name = "yg",
      descriptor = "I"
   )
   public static int field9511;
   @OriginalMember(
      owner = "client!or",
      name = "bd",
      descriptor = "I"
   )
   public static int field9512;
   @OriginalMember(
      owner = "client!or",
      name = "Kc",
      descriptor = "I"
   )
   public static int field9513;
   @OriginalMember(
      owner = "client!or",
      name = "ff",
      descriptor = "I"
   )
   public static int field9514;
   @OriginalMember(
      owner = "client!or",
      name = "Ef",
      descriptor = "I"
   )
   public static int field9515;
   @OriginalMember(
      owner = "client!or",
      name = "eb",
      descriptor = "I"
   )
   public static int field9517;
   @OriginalMember(
      owner = "client!or",
      name = "nd",
      descriptor = "I"
   )
   public static int field9518;
   @OriginalMember(
      owner = "client!or",
      name = "Fc",
      descriptor = "I"
   )
   public static int field9519;
   @OriginalMember(
      owner = "client!or",
      name = "Kg",
      descriptor = "I"
   )
   public static int field9520;
   @OriginalMember(
      owner = "client!or",
      name = "Ne",
      descriptor = "I"
   )
   public static int field9521;
   @OriginalMember(
      owner = "client!or",
      name = "Oe",
      descriptor = "I"
   )
   public static int field9522;
   @OriginalMember(
      owner = "client!or",
      name = "Rc",
      descriptor = "I"
   )
   public static int field9523;
   @OriginalMember(
      owner = "client!or",
      name = "of",
      descriptor = "I"
   )
   public static int field9524;
   @OriginalMember(
      owner = "client!or",
      name = "Le",
      descriptor = "I"
   )
   public static int field9525;
   @OriginalMember(
      owner = "client!or",
      name = "F",
      descriptor = "I"
   )
   public static int field9526;
   @OriginalMember(
      owner = "client!or",
      name = "fg",
      descriptor = "I"
   )
   public static int field9527;
   @OriginalMember(
      owner = "client!or",
      name = "rg",
      descriptor = "I"
   )
   public static int field9528;
   @OriginalMember(
      owner = "client!or",
      name = "xf",
      descriptor = "I"
   )
   public static int field9529;
   @OriginalMember(
      owner = "client!or",
      name = "db",
      descriptor = "I"
   )
   public static int field9530;
   @OriginalMember(
      owner = "client!or",
      name = "Md",
      descriptor = "I"
   )
   public static int field9531;
   @OriginalMember(
      owner = "client!or",
      name = "mf",
      descriptor = "I"
   )
   public static int field9532;
   @OriginalMember(
      owner = "client!or",
      name = "bb",
      descriptor = "I"
   )
   public static int field9533;
   @OriginalMember(
      owner = "client!or",
      name = "sg",
      descriptor = "I"
   )
   public static int field9534;
   @OriginalMember(
      owner = "client!or",
      name = "fd",
      descriptor = "I"
   )
   public static int field9535;
   @OriginalMember(
      owner = "client!or",
      name = "Hc",
      descriptor = "I"
   )
   public static int field9537;
   @OriginalMember(
      owner = "client!or",
      name = "Od",
      descriptor = "I"
   )
   public static int field9538;
   @OriginalMember(
      owner = "client!or",
      name = "Tb",
      descriptor = "I"
   )
   public static int field9539;
   @OriginalMember(
      owner = "client!or",
      name = "Pc",
      descriptor = "I"
   )
   public static int field9540;
   @OriginalMember(
      owner = "client!or",
      name = "qh",
      descriptor = "I"
   )
   public static int field9541;
   @OriginalMember(
      owner = "client!or",
      name = "Xb",
      descriptor = "I"
   )
   public static int field9542;
   @OriginalMember(
      owner = "client!or",
      name = "wg",
      descriptor = "I"
   )
   public static int field9543;
   @OriginalMember(
      owner = "client!or",
      name = "ne",
      descriptor = "I"
   )
   public static int field9545;
   @OriginalMember(
      owner = "client!or",
      name = "Wc",
      descriptor = "I"
   )
   public static int field9546;
   @OriginalMember(
      owner = "client!or",
      name = "hg",
      descriptor = "I"
   )
   public static int field9547;
   @OriginalMember(
      owner = "client!or",
      name = "Cd",
      descriptor = "I"
   )
   public static int field9548;
   @OriginalMember(
      owner = "client!or",
      name = "Bc",
      descriptor = "I"
   )
   public static int field9549;
   @OriginalMember(
      owner = "client!or",
      name = "Yd",
      descriptor = "I"
   )
   public static int field9550;
   @OriginalMember(
      owner = "client!or",
      name = "R",
      descriptor = "I"
   )
   public static int field9551;
   @OriginalMember(
      owner = "client!or",
      name = "Vd",
      descriptor = "I"
   )
   public static int field9553;
   @OriginalMember(
      owner = "client!or",
      name = "Dd",
      descriptor = "I"
   )
   public static int field9554;
   @OriginalMember(
      owner = "client!or",
      name = "Nd",
      descriptor = "I"
   )
   public static int field9555;
   @OriginalMember(
      owner = "client!or",
      name = "ge",
      descriptor = "I"
   )
   public static int field9557;
   @OriginalMember(
      owner = "client!or",
      name = "xc",
      descriptor = "I"
   )
   public static int field9558;
   @OriginalMember(
      owner = "client!or",
      name = "N",
      descriptor = "I"
   )
   public static int field9560;
   @OriginalMember(
      owner = "client!or",
      name = "Re",
      descriptor = "I"
   )
   public static int field9561;
   @OriginalMember(
      owner = "client!or",
      name = "qf",
      descriptor = "I"
   )
   public static int field9562;
   @OriginalMember(
      owner = "client!or",
      name = "pc",
      descriptor = "I"
   )
   public static int field9563;
   @OriginalMember(
      owner = "client!or",
      name = "Sb",
      descriptor = "I"
   )
   public static int field9564;
   @OriginalMember(
      owner = "client!or",
      name = "Xg",
      descriptor = "I"
   )
   public static int field9565;
   @OriginalMember(
      owner = "client!or",
      name = "dd",
      descriptor = "I"
   )
   public static int field9566;
   @OriginalMember(
      owner = "client!or",
      name = "Mg",
      descriptor = "I"
   )
   public static int field9567;
   @OriginalMember(
      owner = "client!or",
      name = "Of",
      descriptor = "I"
   )
   public static int field9568;
   @OriginalMember(
      owner = "client!or",
      name = "gc",
      descriptor = "I"
   )
   public static int field9569;
   @OriginalMember(
      owner = "client!or",
      name = "jf",
      descriptor = "I"
   )
   public static int field9570;
   @OriginalMember(
      owner = "client!or",
      name = "tb",
      descriptor = "I"
   )
   public static int field9571;
   @OriginalMember(
      owner = "client!or",
      name = "U",
      descriptor = "I"
   )
   public static int field9572;
   @OriginalMember(
      owner = "client!or",
      name = "Pd",
      descriptor = "I"
   )
   public static int field9573;
   @OriginalMember(
      owner = "client!or",
      name = "dh",
      descriptor = "I"
   )
   private int field9574;
   @OriginalMember(
      owner = "client!or",
      name = "kb",
      descriptor = "I"
   )
   public static int field9575;
   @OriginalMember(
      owner = "client!or",
      name = "Yb",
      descriptor = "I"
   )
   public static int field9576;
   @OriginalMember(
      owner = "client!or",
      name = "Yc",
      descriptor = "I"
   )
   public static int field9577;
   @OriginalMember(
      owner = "client!or",
      name = "ke",
      descriptor = "I"
   )
   public static int field9578;
   @OriginalMember(
      owner = "client!or",
      name = "Yf",
      descriptor = "I"
   )
   public static int field9579;
   @OriginalMember(
      owner = "client!or",
      name = "nb",
      descriptor = "I"
   )
   public static int field9580;
   @OriginalMember(
      owner = "client!or",
      name = "Yg",
      descriptor = "I"
   )
   public static int field9581;
   @OriginalMember(
      owner = "client!or",
      name = "ce",
      descriptor = "I"
   )
   public static int field9582;
   @OriginalMember(
      owner = "client!or",
      name = "fc",
      descriptor = "I"
   )
   public static int field9583;
   @OriginalMember(
      owner = "client!or",
      name = "rh",
      descriptor = "I"
   )
   public static int field9584;
   @OriginalMember(
      owner = "client!or",
      name = "Mf",
      descriptor = "I"
   )
   public static int field9585;
   @OriginalMember(
      owner = "client!or",
      name = "Cb",
      descriptor = "I"
   )
   public static int field9586;
   @OriginalMember(
      owner = "client!or",
      name = "Af",
      descriptor = "I"
   )
   public static int field9587;
   @OriginalMember(
      owner = "client!or",
      name = "sc",
      descriptor = "I"
   )
   public static int field9588;
   @OriginalMember(
      owner = "client!or",
      name = "Fd",
      descriptor = "I"
   )
   public static int field9589;
   @OriginalMember(
      owner = "client!or",
      name = "Sd",
      descriptor = "I"
   )
   public static int field9590;
   @OriginalMember(
      owner = "client!or",
      name = "sb",
      descriptor = "I"
   )
   public static int field9591;
   @OriginalMember(
      owner = "client!or",
      name = "lg",
      descriptor = "I"
   )
   public static int field9592;
   @OriginalMember(
      owner = "client!or",
      name = "re",
      descriptor = "I"
   )
   public static int field9593;
   @OriginalMember(
      owner = "client!or",
      name = "Hb",
      descriptor = "I"
   )
   public static int field9594;
   @OriginalMember(
      owner = "client!or",
      name = "Be",
      descriptor = "I"
   )
   public static int field9595;
   @OriginalMember(
      owner = "client!or",
      name = "J",
      descriptor = "I"
   )
   public static int field9596;
   @OriginalMember(
      owner = "client!or",
      name = "B",
      descriptor = "I"
   )
   public static int field9597;
   @OriginalMember(
      owner = "client!or",
      name = "Lf",
      descriptor = "I"
   )
   public static int field9598;
   @OriginalMember(
      owner = "client!or",
      name = "nh",
      descriptor = "I"
   )
   public static int field9599;
   @OriginalMember(
      owner = "client!or",
      name = "Qe",
      descriptor = "I"
   )
   public static int field9600;
   @OriginalMember(
      owner = "client!or",
      name = "xb",
      descriptor = "I"
   )
   public static int field9601;
   @OriginalMember(
      owner = "client!or",
      name = "Bd",
      descriptor = "I"
   )
   public static int field9602;
   @OriginalMember(
      owner = "client!or",
      name = "fe",
      descriptor = "I"
   )
   public static int field9603;
   @OriginalMember(
      owner = "client!or",
      name = "uh",
      descriptor = "I"
   )
   public static int field9604;
   @OriginalMember(
      owner = "client!or",
      name = "Nf",
      descriptor = "I"
   )
   public static int field9605;
   @OriginalMember(
      owner = "client!or",
      name = "t",
      descriptor = "I"
   )
   public static int field9606;
   @OriginalMember(
      owner = "client!or",
      name = "Kf",
      descriptor = "I"
   )
   public static int field9607;
   @OriginalMember(
      owner = "client!or",
      name = "bg",
      descriptor = "I"
   )
   public static int field9608;
   @OriginalMember(
      owner = "client!or",
      name = "pe",
      descriptor = "I"
   )
   public static int field9609;
   @OriginalMember(
      owner = "client!or",
      name = "Ob",
      descriptor = "I"
   )
   public static int field9610;
   @OriginalMember(
      owner = "client!or",
      name = "Id",
      descriptor = "I"
   )
   public static int field9611;
   @OriginalMember(
      owner = "client!or",
      name = "ic",
      descriptor = "I"
   )
   public static int field9612;
   @OriginalMember(
      owner = "client!or",
      name = "Hd",
      descriptor = "I"
   )
   public static int field9613;
   @OriginalMember(
      owner = "client!or",
      name = "Ce",
      descriptor = "I"
   )
   public static int field9614;
   @OriginalMember(
      owner = "client!or",
      name = "he",
      descriptor = "I"
   )
   public static int field9615;
   @OriginalMember(
      owner = "client!or",
      name = "qd",
      descriptor = "I"
   )
   public static int field9616;
   @OriginalMember(
      owner = "client!or",
      name = "pb",
      descriptor = "I"
   )
   public static int field9617;
   @OriginalMember(
      owner = "client!or",
      name = "y",
      descriptor = "I"
   )
   public static int field9618;
   @OriginalMember(
      owner = "client!or",
      name = "kc",
      descriptor = "I"
   )
   public static int field9619;
   @OriginalMember(
      owner = "client!or",
      name = "ac",
      descriptor = "I"
   )
   public static int field9620;
   @OriginalMember(
      owner = "client!or",
      name = "hh",
      descriptor = "I"
   )
   public int field9621;
   @OriginalMember(
      owner = "client!or",
      name = "ee",
      descriptor = "I"
   )
   public static int field9622;
   @OriginalMember(
      owner = "client!or",
      name = "Jf",
      descriptor = "I"
   )
   public static int field9623;
   @OriginalMember(
      owner = "client!or",
      name = "de",
      descriptor = "I"
   )
   public static int field9624;
   @OriginalMember(
      owner = "client!or",
      name = "gg",
      descriptor = "I"
   )
   public static int field9625;
   @OriginalMember(
      owner = "client!or",
      name = "Jg",
      descriptor = "I"
   )
   public static int field9626;
   @OriginalMember(
      owner = "client!or",
      name = "ie",
      descriptor = "I"
   )
   public static int field9627;
   @OriginalMember(
      owner = "client!or",
      name = "Fg",
      descriptor = "I"
   )
   public static int field9628;
   @OriginalMember(
      owner = "client!or",
      name = "Dc",
      descriptor = "I"
   )
   public static int field9629;
   @OriginalMember(
      owner = "client!or",
      name = "Q",
      descriptor = "I"
   )
   public static int field9630;
   @OriginalMember(
      owner = "client!or",
      name = "vg",
      descriptor = "I"
   )
   public static int field9631;
   @OriginalMember(
      owner = "client!or",
      name = "Jd",
      descriptor = "I"
   )
   public static int field9632;
   @OriginalMember(
      owner = "client!or",
      name = "hd",
      descriptor = "I"
   )
   public static int field9633;
   @OriginalMember(
      owner = "client!or",
      name = "yb",
      descriptor = "I"
   )
   public static int field9634;
   @OriginalMember(
      owner = "client!or",
      name = "od",
      descriptor = "I"
   )
   public static int field9635;
   @OriginalMember(
      owner = "client!or",
      name = "ug",
      descriptor = "I"
   )
   public static int field9636;
   @OriginalMember(
      owner = "client!or",
      name = "w",
      descriptor = "I"
   )
   public static int field9637;
   @OriginalMember(
      owner = "client!or",
      name = "yf",
      descriptor = "I"
   )
   public static int field9638;
   @OriginalMember(
      owner = "client!or",
      name = "xd",
      descriptor = "I"
   )
   public static int field9639;
   @OriginalMember(
      owner = "client!or",
      name = "tc",
      descriptor = "I"
   )
   public static int field9640;
   @OriginalMember(
      owner = "client!or",
      name = "lh",
      descriptor = "I"
   )
   public static int field9641;
   @OriginalMember(
      owner = "client!or",
      name = "Gg",
      descriptor = "I"
   )
   public static int field9642;
   @OriginalMember(
      owner = "client!or",
      name = "Ag",
      descriptor = "I"
   )
   public static int field9643;
   @OriginalMember(
      owner = "client!or",
      name = "tg",
      descriptor = "I"
   )
   public static int field9644;
   @OriginalMember(
      owner = "client!or",
      name = "vc",
      descriptor = "I"
   )
   public static int field9645;
   @OriginalMember(
      owner = "client!or",
      name = "X",
      descriptor = "I"
   )
   public static int field9646;
   @OriginalMember(
      owner = "client!or",
      name = "Cc",
      descriptor = "I"
   )
   public static int field9647;
   @OriginalMember(
      owner = "client!or",
      name = "Gb",
      descriptor = "I"
   )
   public static int field9648;
   @OriginalMember(
      owner = "client!or",
      name = "Pg",
      descriptor = "I"
   )
   public static int field9649;
   @OriginalMember(
      owner = "client!or",
      name = "eh",
      descriptor = "I"
   )
   public static int field9650;
   @OriginalMember(
      owner = "client!or",
      name = "xe",
      descriptor = "I"
   )
   public static int field9651;
   @OriginalMember(
      owner = "client!or",
      name = "Zc",
      descriptor = "I"
   )
   public static int field9652;
   @OriginalMember(
      owner = "client!or",
      name = "Mc",
      descriptor = "I"
   )
   public static int field9653;
   @OriginalMember(
      owner = "client!or",
      name = "Zg",
      descriptor = "I"
   )
   public static int field9654;
   @OriginalMember(
      owner = "client!or",
      name = "bf",
      descriptor = "I"
   )
   public static int field9655;
   @OriginalMember(
      owner = "client!or",
      name = "K",
      descriptor = "I"
   )
   public static int field9656;
   @OriginalMember(
      owner = "client!or",
      name = "Xc",
      descriptor = "I"
   )
   public static int field9658;
   @OriginalMember(
      owner = "client!or",
      name = "ef",
      descriptor = "I"
   )
   public static int field9659;
   @OriginalMember(
      owner = "client!or",
      name = "nc",
      descriptor = "I"
   )
   public int field9660;
   @OriginalMember(
      owner = "client!or",
      name = "jg",
      descriptor = "I"
   )
   public static int field9661;
   @OriginalMember(
      owner = "client!or",
      name = "Ae",
      descriptor = "I"
   )
   public static int field9662;
   @OriginalMember(
      owner = "client!or",
      name = "Cg",
      descriptor = "I"
   )
   public static int field9663;
   @OriginalMember(
      owner = "client!or",
      name = "kg",
      descriptor = "I"
   )
   public static int field9664;
   @OriginalMember(
      owner = "client!or",
      name = "ig",
      descriptor = "I"
   )
   public static int field9665;
   @OriginalMember(
      owner = "client!or",
      name = "T",
      descriptor = "I"
   )
   public static int field9666;
   @OriginalMember(
      owner = "client!or",
      name = "uf",
      descriptor = "I"
   )
   public static int field9667;
   @OriginalMember(
      owner = "client!or",
      name = "md",
      descriptor = "I"
   )
   public static int field9668;
   @OriginalMember(
      owner = "client!or",
      name = "me",
      descriptor = "I"
   )
   public static int field9669;
   @OriginalMember(
      owner = "client!or",
      name = "oc",
      descriptor = "I"
   )
   private int field9670;
   @OriginalMember(
      owner = "client!or",
      name = "M",
      descriptor = "I"
   )
   public static int field9671;
   @OriginalMember(
      owner = "client!or",
      name = "dc",
      descriptor = "I"
   )
   public static int field9672;
   @OriginalMember(
      owner = "client!or",
      name = "Kb",
      descriptor = "I"
   )
   public static int field9673;
   @OriginalMember(
      owner = "client!or",
      name = "qb",
      descriptor = "I"
   )
   public static int field9674;
   @OriginalMember(
      owner = "client!or",
      name = "ph",
      descriptor = "I"
   )
   public static int field9675;
   @OriginalMember(
      owner = "client!or",
      name = "th",
      descriptor = "I"
   )
   public static int field9676;
   @OriginalMember(
      owner = "client!or",
      name = "zc",
      descriptor = "I"
   )
   public static int field9677;
   @OriginalMember(
      owner = "client!or",
      name = "mc",
      descriptor = "I"
   )
   public static int field9678;
   @OriginalMember(
      owner = "client!or",
      name = "ob",
      descriptor = "I"
   )
   public static int field9679;
   @OriginalMember(
      owner = "client!or",
      name = "Ke",
      descriptor = "I"
   )
   public static int field9680;
   @OriginalMember(
      owner = "client!or",
      name = "ye",
      descriptor = "I"
   )
   public static int field9681;
   @OriginalMember(
      owner = "client!or",
      name = "Qf",
      descriptor = "I"
   )
   public static int field9682;
   @OriginalMember(
      owner = "client!or",
      name = "Zb",
      descriptor = "I"
   )
   public static int field9683;
   @OriginalMember(
      owner = "client!or",
      name = "Mb",
      descriptor = "I"
   )
   public static int field9684;
   @OriginalMember(
      owner = "client!or",
      name = "Tf",
      descriptor = "I"
   )
   public static int field9685;
   @OriginalMember(
      owner = "client!or",
      name = "L",
      descriptor = "I"
   )
   public static int field9686;
   @OriginalMember(
      owner = "client!or",
      name = "cd",
      descriptor = "I"
   )
   public static int field9687;
   @OriginalMember(
      owner = "client!or",
      name = "pg",
      descriptor = "I"
   )
   public static int field9688;
   @OriginalMember(
      owner = "client!or",
      name = "Uc",
      descriptor = "I"
   )
   public static int field9689;
   @OriginalMember(
      owner = "client!or",
      name = "gf",
      descriptor = "I"
   )
   public static int field9691;
   @OriginalMember(
      owner = "client!or",
      name = "vh",
      descriptor = "I"
   )
   public static int field9692;
   @OriginalMember(
      owner = "client!or",
      name = "ib",
      descriptor = "I"
   )
   public static int field9693;
   @OriginalMember(
      owner = "client!or",
      name = "Me",
      descriptor = "I"
   )
   public static int field9694;
   @OriginalMember(
      owner = "client!or",
      name = "P",
      descriptor = "I"
   )
   public static int field9698;
   @OriginalMember(
      owner = "client!or",
      name = "qe",
      descriptor = "I"
   )
   public static int field9700;
   @OriginalMember(
      owner = "client!or",
      name = "Bf",
      descriptor = "I"
   )
   public static int field9701;
   @OriginalMember(
      owner = "client!or",
      name = "Rd",
      descriptor = "I"
   )
   public static int field9704;
   @OriginalMember(
      owner = "client!or",
      name = "Zd",
      descriptor = "I"
   )
   public int field9711;
   @OriginalMember(
      owner = "client!or",
      name = "Dg",
      descriptor = "I"
   )
   private int field9726;
   @OriginalMember(
      owner = "client!or",
      name = "Bb",
      descriptor = "I"
   )
   public int field9727;
   @OriginalMember(
      owner = "client!or",
      name = "Wb",
      descriptor = "I"
   )
   public int field9729;
   @OriginalMember(
      owner = "client!or",
      name = "Nc",
      descriptor = "I"
   )
   private int field9738;
   @OriginalMember(
      owner = "client!or",
      name = "Vb",
      descriptor = "I"
   )
   private int field9739;
   @OriginalMember(
      owner = "client!or",
      name = "lc",
      descriptor = "I"
   )
   private int field9744;
   @OriginalMember(
      owner = "client!or",
      name = "zg",
      descriptor = "I"
   )
   private int field9747;
   @OriginalMember(
      owner = "client!or",
      name = "Ye",
      descriptor = "I"
   )
   public int field9751;
   @OriginalMember(
      owner = "client!or",
      name = "Oc",
      descriptor = "I"
   )
   private int field9755;
   @OriginalMember(
      owner = "client!or",
      name = "Ib",
      descriptor = "I"
   )
   public int field9763;
   @OriginalMember(
      owner = "client!or",
      name = "Ve",
      descriptor = "I"
   )
   public int field9766;
   @OriginalMember(
      owner = "client!or",
      name = "pf",
      descriptor = "I"
   )
   private int field9775;
   @OriginalMember(
      owner = "client!or",
      name = "hb",
      descriptor = "I"
   )
   private int field9778;
   @OriginalMember(
      owner = "client!or",
      name = "Uf",
      descriptor = "I"
   )
   public int field9796;
   @OriginalMember(
      owner = "client!or",
      name = "hc",
      descriptor = "I"
   )
   private int field9818;
   @OriginalMember(
      owner = "client!or",
      name = "E",
      descriptor = "I"
   )
   private int field9838;
   @OriginalMember(
      owner = "client!or",
      name = "Bg",
      descriptor = "I"
   )
   private int field9839;
   @OriginalMember(
      owner = "client!or",
      name = "Sc",
      descriptor = "I"
   )
   private int field9845;
   @OriginalMember(
      owner = "client!or",
      name = "Kd",
      descriptor = "I"
   )
   private int field9858;
   @OriginalMember(
      owner = "client!or",
      name = "Gc",
      descriptor = "I"
   )
   private int field9863;
   @OriginalMember(
      owner = "client!or",
      name = "oh",
      descriptor = "J"
   )
   private long field9743;
   @OriginalMember(
      owner = "client!or",
      name = "Tg",
      descriptor = "Lwq;"
   )
   public class178 field9799;
   @OriginalMember(
      owner = "client!or",
      name = "cc",
      descriptor = "Lwq;"
   )
   public class178 field9853;
   @OriginalMember(
      owner = "client!or",
      name = "S",
      descriptor = "Lei;"
   )
   private class189 field9748;
   @OriginalMember(
      owner = "client!or",
      name = "qc",
      descriptor = "Lei;"
   )
   private class189 field9829;
   @OriginalMember(
      owner = "client!or",
      name = "H",
      descriptor = "Lsda;"
   )
   public class271 field9749;
   @OriginalMember(
      owner = "client!or",
      name = "ue",
      descriptor = "Lsda;"
   )
   public class271 field9758;
   @OriginalMember(
      owner = "client!or",
      name = "be",
      descriptor = "Lsda;"
   )
   public class271 field9759;
   @OriginalMember(
      owner = "client!or",
      name = "s",
      descriptor = "Lsda;"
   )
   public class271 field9762;
   @OriginalMember(
      owner = "client!or",
      name = "Lb",
      descriptor = "Lsda;"
   )
   public class271 field9803;
   @OriginalMember(
      owner = "client!or",
      name = "Qc",
      descriptor = "Lsda;"
   )
   public class271 field9807;
   @OriginalMember(
      owner = "client!or",
      name = "v",
      descriptor = "Lsda;"
   )
   public class271 field9811;
   @OriginalMember(
      owner = "client!or",
      name = "Jb",
      descriptor = "Lsda;"
   )
   public class271 field9813;
   @OriginalMember(
      owner = "client!or",
      name = "Xd",
      descriptor = "Lsda;"
   )
   public class271 field9826;
   @OriginalMember(
      owner = "client!or",
      name = "ed",
      descriptor = "Lsda;"
   )
   public class271 field9850;
   @OriginalMember(
      owner = "client!or",
      name = "Zf",
      descriptor = "Ltia;"
   )
   private class280 field9725;
   @OriginalMember(
      owner = "client!or",
      name = "O",
      descriptor = "Lle;"
   )
   private class325 field9721;
   @OriginalMember(
      owner = "client!or",
      name = "bh",
      descriptor = "Lle;"
   )
   public class325 field9801;
   @OriginalMember(
      owner = "client!or",
      name = "Eg",
      descriptor = "Lbe;"
   )
   private class40 field9768;
   @OriginalMember(
      owner = "client!or",
      name = "jd",
      descriptor = "Lbha;"
   )
   private class604 field9840;
   @OriginalMember(
      owner = "client!or",
      name = "Hg",
      descriptor = "Lmj;"
   )
   public class684 field9800;
   @OriginalMember(
      owner = "client!or",
      name = "dg",
      descriptor = "Lgn;"
   )
   private class732 field9767;
   @OriginalMember(
      owner = "client!or",
      name = "wd",
      descriptor = "Lhd;"
   )
   private class776 field9716;
   @OriginalMember(
      owner = "client!or",
      name = "Eb",
      descriptor = "Lhd;"
   )
   private class776 field9720;
   @OriginalMember(
      owner = "client!or",
      name = "yd",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   public NativeHeap field9714;
   @OriginalMember(
      owner = "client!or",
      name = "Se",
      descriptor = "Z"
   )
   private boolean field9736;
   @OriginalMember(
      owner = "client!or",
      name = "Ed",
      descriptor = "Z"
   )
   private boolean field9740;
   @OriginalMember(
      owner = "client!or",
      name = "xg",
      descriptor = "Z"
   )
   private boolean field9741;
   @OriginalMember(
      owner = "client!or",
      name = "Ge",
      descriptor = "Z"
   )
   private boolean field9742;
   @OriginalMember(
      owner = "client!or",
      name = "Ec",
      descriptor = "Z"
   )
   public boolean field9752;
   @OriginalMember(
      owner = "client!or",
      name = "Gd",
      descriptor = "Z"
   )
   public boolean field9761;
   @OriginalMember(
      owner = "client!or",
      name = "Vf",
      descriptor = "Z"
   )
   public boolean field9765;
   @OriginalMember(
      owner = "client!or",
      name = "lf",
      descriptor = "Z"
   )
   private boolean field9771;
   @OriginalMember(
      owner = "client!or",
      name = "Cf",
      descriptor = "Z"
   )
   public boolean field9777;
   @OriginalMember(
      owner = "client!or",
      name = "mh",
      descriptor = "Z"
   )
   public boolean field9781;
   @OriginalMember(
      owner = "client!or",
      name = "pd",
      descriptor = "Z"
   )
   public boolean field9783;
   @OriginalMember(
      owner = "client!or",
      name = "Lc",
      descriptor = "Z"
   )
   private boolean field9788;
   @OriginalMember(
      owner = "client!or",
      name = "nf",
      descriptor = "Z"
   )
   private boolean field9791;
   @OriginalMember(
      owner = "client!or",
      name = "Y",
      descriptor = "Z"
   )
   private boolean field9802;
   @OriginalMember(
      owner = "client!or",
      name = "ih",
      descriptor = "Z"
   )
   private boolean field9815;
   @OriginalMember(
      owner = "client!or",
      name = "ag",
      descriptor = "Z"
   )
   private boolean field9822;
   @OriginalMember(
      owner = "client!or",
      name = "Jc",
      descriptor = "Z"
   )
   public boolean field9830;
   @OriginalMember(
      owner = "client!or",
      name = "wb",
      descriptor = "Z"
   )
   public boolean field9844;
   @OriginalMember(
      owner = "client!or",
      name = "cg",
      descriptor = "Z"
   )
   public boolean field9848;
   @OriginalMember(
      owner = "client!or",
      name = "Ab",
      descriptor = "Z"
   )
   private boolean field9855;
   @OriginalMember(
      owner = "client!or",
      name = "Rg",
      descriptor = "[Lmd;"
   )
   private class573[] field9833;

   @OriginalMember(
      owner = "client!or",
      name = "f",
      descriptor = "(IIIIII)V"
   )
   public final void method497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         float var8;
         float var10;
         label23: {
            this.method4854(-4);
            ++field9538;
            this.method4912(1, arg5);
            float var7 = (float)arg2 - (float)arg0;
            var8 = (float)(-arg1) + (float)arg3;
            if (var7 != 0.0F || var8 != 0.0F) {
               float var9 = (float)(1.0D / Math.sqrt((double)(var7 * var7 + var8 * var8)));
               var10 = var7 * var9;
               var8 *= var9;
               if (!client.field4273) {
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
         throw class534.method3846(var12, field9864[124] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "g",
      descriptor = "(II)I"
   )
   public final int method4833(int arg0, int arg1) {
      try {
         ++field9530;
         if (~arg1 != arg0) {
            if (arg1 != 0) {
               if (~arg1 == -3) {
                  return 34165;
               } else if (arg1 != 3) {
                  if (arg1 == 4) {
                     return 34023;
                  } else {
                     throw new IllegalArgumentException();
                  }
               } else {
                  return 260;
               }
            } else {
               return 8448;
            }
         } else {
            return 7681;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[118] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "n",
      descriptor = "(B)V"
   )
   private final void method4834(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(Z[BIBI)Lei;"
   )
   public final class189 method4835(boolean arg0, byte[] arg1, int arg2, byte arg3, int arg4) {
      try {
         ++field9575;
         if (arg3 != 85) {
            this.method506((Canvas)null);
         }

         return (class189)(!this.field9814 || arg0 && !this.field9837 ? new class450(this, arg4, arg1, arg2) : new class76(this, arg4, arg1, arg2, arg0));
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field9864[46] + arg0 + ',' + (arg1 != null ? field9864[1] : field9864[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "d",
      descriptor = "(B)V"
   )
   public final void method4836(byte arg0) {
      try {
         if (~this.field9738 != -9) {
            this.method4852((byte)70);
            this.method4869(true, (byte)-63);
            this.method4905(true, 93);
            this.method4837(true, -32);
            this.method4912(1, 1);
            this.field9738 = 8;
         }

         ++field9599;
         int var2 = 25 / ((55 - arg0) / 59);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[177] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V"
   )
   public final void method520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      try {
         ++field9623;
         this.method4854(-4);
         this.method4912(1, arg12);
         OpenGL.glBegin(4);
         OpenGL.glColor4ub((byte)(arg9 >> 16), (byte)(arg9 >> 8), (byte)arg9, (byte)(arg9 >> 24));
         OpenGL.glVertex3f((float)arg0 + 0.35F, (float)arg1 + 0.35F, (float)arg2);
         OpenGL.glColor4ub((byte)(arg10 >> 16), (byte)(arg10 >> 8), (byte)arg10, (byte)(arg10 >> 24));
         OpenGL.glVertex3f((float)arg3 + 0.35F, (float)arg4 + 0.35F, (float)arg5);
         OpenGL.glColor4ub((byte)(arg11 >> 16), (byte)(arg11 >> 8), (byte)arg11, (byte)(arg11 >> 24));
         OpenGL.glVertex3f((float)arg6 + 0.35F, (float)arg7 + 0.35F, (float)arg8);
         OpenGL.glEnd();
      } catch (RuntimeException var15) {
         throw class534.method3846(var15, field9864[91] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "j",
      descriptor = "()Z"
   )
   public final boolean method546() {
      try {
         ++field9563;
         return false;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[98] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "Y",
      descriptor = "()[I"
   )
   public final int[] method599() {
      try {
         ++field9591;
         return new int[]{this.field9823, this.field9754, this.field9835, this.field9753};
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[83] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(Ltba;Ltba;FLtba;)Ltba;"
   )
   public final class172 method597(class172 arg0, class172 arg1, float arg2, class172 arg3) {
      try {
         ++field9701;
         if (arg0 != null && arg1 != null && this.field9781 && this.field9857) {
            class252 var5 = null;
            class604 var6 = (class604)arg0;
            class604 var7 = (class604)arg1;
            class681 var8 = var6.method1910(52);
            class681 var9 = var7.method1910(52);
            if (var8 != null && var9 != null) {
               int var10 = var8.field10000 > var9.field10000 ? var8.field10000 : var9.field10000;
               if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class252) {
                  class252 var11 = (class252)arg3;
                  if (~var10 == ~var11.method1915(-78)) {
                     var5 = var11;
                  }
               }

               if (var5 == null) {
                  var5 = new class252(this, var10);
               }

               if (var5.method1911(var8, arg2, var9, -65535)) {
                  return var5;
               }
            }
         }

         return !(arg2 < 0.5F) ? arg1 : arg0;
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field9864[126] + (arg0 != null ? field9864[1] : field9864[3]) + ',' + (arg1 != null ? field9864[1] : field9864[3]) + ',' + arg2 + ',' + (arg3 != null ? field9864[1] : field9864[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "b",
      descriptor = "(ZI)V"
   )
   public final void method4837(boolean arg0, int arg1) {
      try {
         if (arg1 != -32) {
            this.method508(-108, 35, 97, 79, 85, 120);
         }

         ++field9496;
         if (!arg0 != !this.field9741) {
            this.field9741 = arg0;
            this.method4858(-81);
            this.field9738 &= -32;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[114] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "k",
      descriptor = "()Lkh;"
   )
   public final class17 method600() {
      try {
         ++field9503;
         return this.field9707;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[84] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "d",
      descriptor = "(I)V"
   )
   private final void method4838(int arg0) {
      boolean var2 = client.field4273;

      try {
         this.method4840(-2, 98);
         ++field9652;
         int var3 = this.field9763 + -1;
         if (var2) {
            this.method4841(var3, 33984);
            this.method4848(false, (class573)null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            --var3;
         }

         while(true) {
            while(~var3 <= -1) {
               this.method4841(var3, 33984);
               this.method4848(false, (class573)null);
               OpenGL.glTexEnvi(8960, 8704, 34160);
               --var3;
            }

            this.method4862(8448, 8448, 62);
            this.method4901(770, 2, 34168, 5);
            this.method4847((byte)62);
            this.field9739 = 1;
            if (!var2) {
               if (arg0 > -20) {
                  this.field9753 = 118;
               }

               OpenGL.glEnable(3042);
               OpenGL.glBlendFunc(770, 771);
               this.field9744 = 1;
               OpenGL.glEnable(3008);
               OpenGL.glAlphaFunc(516, 0.0F);
               this.field9736 = true;
               OpenGL.glColorMask(true, true, true, true);
               this.field9742 = true;
               this.method4869(true, (byte)-59);
               this.method4911(true, -8);
               this.method4905(true, -83);
               this.method4837(true, -32);
               this.method4861((byte)68);
               this.field9516.setSwapInterval(0);
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
                        this.field9824 = this.field9846 = -1;
                        this.method593();
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

            OpenGL.glTexEnvi(arg0, -20, 34160);
            --var3;
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field9864[117] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(Lok;Z)Lbo;"
   )
   public final class763 method549(class267 arg0, boolean arg1) {
      boolean var3 = client.field4273;

      try {
         int[] var4;
         label95: {
            ++field9625;
            var4 = new int[arg0.field3469 * arg0.field3467];
            int var5 = 0;
            int var6 = 0;
            if (arg0.field3464 != null) {
               int var7 = 0;
               if (var3 || arg0.field3469 > var7) {
                  do {
                     int var8 = 0;
                     if (var3) {
                        var4[var6++] = class283.method2155(arg0.field3464[var5] << 24, arg0.field3468[class743.method5375(arg0.field3472[var5], 255)]);
                        ++var5;
                        ++var8;
                     }

                     while(true) {
                        while(arg0.field3467 > var8) {
                           var4[var6++] = class283.method2155(arg0.field3464[var5] << 24, arg0.field3468[class743.method5375(arg0.field3472[var5], 255)]);
                           ++var5;
                           ++var8;
                        }

                        if (!var3) {
                           ++var7;
                           break;
                        }

                        ++var8;
                     }
                  } while(arg0.field3469 > var7);
               }

               if (!var3) {
                  break label95;
               }
            }

            int var9 = 0;
            if (var3 || ~var9 > ~arg0.field3469) {
               do {
                  int var10 = 0;
                  if (var3 || arg0.field3467 > var10) {
                     do {
                        int var11 = arg0.field3468[arg0.field3472[var5++] & 255];
                        var4[var6++] = var11 != 0 ? class283.method2155(-16777216, var11) : 0;
                        ++var10;
                     } while(arg0.field3467 > var10);
                  }

                  ++var9;
               } while(~var9 > ~arg0.field3469);
            }
         }

         class763 var12 = this.method525(arg0.field3467, var4, arg0.field3469, arg0.field3467, 0, 0);
         var12.method2132(arg0.field3465, arg0.field3466, arg0.field3471, arg0.field3470);
         return var12;
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field9864[156] + (arg0 != null ? field9864[1] : field9864[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "pa",
      descriptor = "()V"
   )
   public final void method528() {
      try {
         ++field9561;
         this.field9830 = false;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[68] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "j",
      descriptor = "(II)V"
   )
   public final synchronized void method4839(int arg0, int arg1) {
      try {
         if (arg0 != 0) {
            this.method524((int[])null, 8, -32, 111, 55, true);
         }

         ++field9662;
         class144 var3 = new class144(arg1);
         this.field9732.method3859(2, var3);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field9864[85] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "ya",
      descriptor = "()V"
   )
   public final void method608() {
      try {
         this.method4837(true, -32);
         ++field9586;
         OpenGL.glClear(256);
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[41] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "i",
      descriptor = "(II)V"
   )
   public final void method4840(int arg0, int arg1) {
      try {
         if (arg1 > 63) {
            this.method4842(true, arg0, 121);
            ++field9512;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[109] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "n",
      descriptor = "(II)V"
   )
   public final void method4841(int arg0, int arg1) {
      try {
         ++field9545;
         if (arg1 != 33984) {
            this.method529(-98);
         }

         if (~this.field9845 != ~arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field9845 = arg0;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[28] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(ZII)V"
   )
   public final void method4842(boolean arg0, int arg1, int arg2) {
      try {
         if (arg2 < 112) {
            this.method603();
         }

         this.method4913(arg0, true, false, arg1);
         ++field9661;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field9864[206] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;"
   )
   public final class295 method541(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      try {
         ++field9551;
         return new class469(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field9864[158] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9864[1] : field9864[3]) + ',' + (arg3 != null ? field9864[1] : field9864[3]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "k",
      descriptor = "(B)V"
   )
   public final void method4843(byte arg0) {
      try {
         if (arg0 >= -61) {
            this.method512();
         }

         ++field9603;
         OpenGL.glLightfv(16384, 4611, this.field9757, 0);
         OpenGL.glLightfv(16385, 4611, this.field9784, 0);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "f",
      descriptor = "(II)V"
   )
   public final void method511(int arg0, int arg1) {
      try {
         ++field9498;
         if (~this.field9842 != ~arg0 || this.field9856 != arg1) {
            this.field9842 = arg0;
            this.field9856 = arg1;
            this.method4851(true);
            this.method4875(false);
            if (~this.field9747 == -4) {
               this.method4846(123);
               return;
            }

            if (~this.field9747 != -3) {
               return;
            }

            this.method4908(126);
         }

      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[47] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(BII)V"
   )
   public final synchronized void method4844(byte arg0, int arg1, int arg2) {
      try {
         ++field9638;
         if (arg0 <= 59) {
            this.field9720 = null;
         }

         class144 var4 = new class144(arg2);
         var4.field6862 = (long)arg1;
         this.field9733.method3859(2, var4);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9864[57] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "DA",
      descriptor = "(IIII)V"
   )
   public final void method526(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field9835 = arg2;
         this.field9823 = arg0;
         this.field9753 = arg3;
         ++field9669;
         this.field9754 = arg1;
         this.method4851(true);
         this.method4915(-1);
         if (this.field9747 == 3) {
            this.method4846(98);
         } else if (~this.field9747 == -3) {
            this.method4908(127);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9864[151] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "v",
      descriptor = "()Z"
   )
   public final boolean method512() {
      try {
         ++field9663;
         return this.field9697 != null && (this.field9705 <= 1 || this.field9855);
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[60] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(Lgn;B)V"
   )
   public final void method4845(class732 arg0, byte arg1) {
      try {
         int var3 = 122 % ((arg1 - 36) / 51);
         ++field9569;
         if (this.field9767 != arg0) {
            if (this.field9814) {
               OpenGL.glBindBufferARB(34963, arg0.method4381(29894));
            }

            this.field9767 = arg0;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field9864[161] + (arg0 != null ? field9864[1] : field9864[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "aa",
      descriptor = "(IIIIII)V"
   )
   public final void method508(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field9600;
         float var7 = (float)arg0 + 0.35F;
         float var8 = (float)arg1 + 0.35F;
         float var9 = (float)arg2 + var7;
         float var10 = (float)arg3 + var8;
         this.method4854(-4);
         this.method4912(1, arg5);
         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         if (this.field9788) {
            OpenGL.glDisable(32925);
         }

         OpenGL.glBegin(7);
         OpenGL.glVertex2f(var7, var8);
         OpenGL.glVertex2f(var7, var10);
         OpenGL.glVertex2f(var9, var10);
         OpenGL.glVertex2f(var9, var8);
         OpenGL.glEnd();
         if (this.field9788) {
            OpenGL.glEnable(32925);
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field9864[222] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "x",
      descriptor = "(I)V"
   )
   private final void method4846(int arg0) {
      try {
         if (arg0 < 9) {
            this.method4911(false, 42);
         }

         ++field9628;
         float var2 = (float)(-this.field9823) * this.field9793 / (float)this.field9835;
         float var3 = (float)(-this.field9754) * this.field9793 / (float)this.field9753;
         float var4 = (float)(-this.field9823 + this.field9660) * this.field9793 / (float)this.field9835;
         float var5 = (float)(this.field9621 - this.field9754) * this.field9793 / (float)this.field9753;
         OpenGL.glMatrixMode(5889);
         OpenGL.glLoadIdentity();
         if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double)var2, (double)var4, (double)(-var5), (double)(-var3), (double)this.field9842, (double)this.field9856);
         }

         OpenGL.glMatrixMode(5888);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field9864[216] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "e",
      descriptor = "(B)V"
   )
   private final void method4847(byte arg0) {
      try {
         int var2 = -33 % ((arg0 - -38) / 34);
         ++field9571;
         if (this.field9802) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field9802 = false;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[198] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(ZLmd;)V"
   )
   public final void method4848(boolean arg0, class573 arg1) {
      boolean var3 = client.field4273;

      try {
         if (arg0) {
            this.field9822 = true;
         }

         ++field9517;
         class573 var4 = this.field9833[this.field9845];
         if (arg1 != var4) {
            label43: {
               if (arg1 != null) {
                  label40: {
                     if (var4 != null) {
                        if (~arg1.field7876 == ~var4.field7876) {
                           break label40;
                        }

                        OpenGL.glDisable(var4.field7876);
                        OpenGL.glEnable(arg1.field7876);
                        if (!var3) {
                           break label40;
                        }
                     }

                     OpenGL.glEnable(arg1.field7876);
                  }

                  OpenGL.glBindTexture(arg1.field7876, arg1.method4127((byte)81));
                  if (!var3) {
                     break label43;
                  }
               }

               OpenGL.glDisable(var4.field7876);
            }

            this.field9833[this.field9845] = arg1;
         }

         this.field9738 &= -2;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9864[106] + arg0 + ',' + (arg1 != null ? field9864[1] : field9864[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "A",
      descriptor = "(ILaa;II)V"
   )
   public final void method516(int arg0, class516 arg1, int arg2, int arg3) {
      try {
         ++field9611;
         class111 var5 = (class111)arg1;
         class40 var6 = var5.field1402;
         this.method4892(true);
         this.method4848(false, var5.field1402);
         this.method4912(1, 1);
         this.method4862(8448, 7681, 108);
         this.method4901(768, 0, 34167, 5);
         float var7 = var6.field467 / (float)var6.field470;
         float var8 = var6.field461 / (float)var6.field458;
         OpenGL.glColor4ub((byte)(arg0 >> 16), (byte)(arg0 >> 8), (byte)arg0, (byte)(arg0 >> 24));
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f((float)(-arg2 + this.field9750) * var7, (float)(-arg3 + this.field9804) * var8);
         OpenGL.glVertex2i(this.field9750, this.field9804);
         OpenGL.glTexCoord2f((float)(-arg2 + this.field9750) * var7, (float)(-arg3 + this.field9841) * var8);
         OpenGL.glVertex2i(this.field9750, this.field9841);
         OpenGL.glTexCoord2f((float)(-arg2 + this.field9827) * var7, (float)(-arg3 + this.field9841) * var8);
         OpenGL.glVertex2i(this.field9827, this.field9841);
         OpenGL.glTexCoord2f((float)(this.field9827 - arg2) * var7, (float)(-arg3 + this.field9804) * var8);
         OpenGL.glVertex2i(this.field9827, this.field9804);
         OpenGL.glEnd();
         this.method4901(768, 0, 5890, 5);
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field9864[221] + arg0 + ',' + (arg1 != null ? field9864[1] : field9864[3]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(FFIF)V"
   )
   private final void method4849(float arg0, float arg1, int arg2, float arg3) {
      try {
         OpenGL.glMatrixMode(5890);
         ++field9617;
         if (this.field9802) {
            OpenGL.glLoadIdentity();
         }

         OpenGL.glTranslatef(arg3, arg1, arg0);
         OpenGL.glMatrixMode(5888);
         this.field9802 = true;
         if (arg2 != 255) {
            this.method4865(-108, -22, (byte)52);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9864[105] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "P",
      descriptor = "(IIIII)V"
   )
   public final void method527(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field9576;
         this.method4854(-4);
         this.method4912(1, arg4);
         float var6 = (float)arg0 + 0.35F;
         float var7 = (float)arg1 + 0.35F;
         OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
         OpenGL.glBegin(1);
         OpenGL.glVertex2f(var6, var7);
         OpenGL.glVertex2f(var6, (float)arg2 + var7);
         OpenGL.glEnd();
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field9864[101] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "xa",
      descriptor = "(F)V"
   )
   public final void method557(float arg0) {
      try {
         if (this.field9808 != arg0) {
            this.field9808 = arg0;
            this.method4910((byte)118);
         }

         ++field9506;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[20] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "e",
      descriptor = "(Z)V"
   )
   private final void method4850(boolean arg0) {
      try {
         this.field9833 = new class573[this.field9763];
         ++field9510;
         this.field9800 = new class684(this, 3553, 6408, 1, 1);
         if (arg0) {
            this.field9836 = null;
         }

         new class684(this, 3553, 6408, 1, 1);
         new class684(this, 3553, 6408, 1, 1);
         this.field9826 = new class271(this);
         this.field9803 = new class271(this);
         this.field9850 = new class271(this);
         this.field9759 = new class271(this);
         this.field9813 = new class271(this);
         this.field9762 = new class271(this);
         this.field9811 = new class271(this);
         this.field9749 = new class271(this);
         this.field9758 = new class271(this);
         this.field9807 = new class271(this);
         if (this.field9857) {
            this.field9801 = new class325(this);
            new class325(this);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[218] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "q",
      descriptor = "()Z"
   )
   public final boolean method561() {
      try {
         ++field9513;
         return true;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[95] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "z",
      descriptor = "()Z"
   )
   public final boolean method583() {
      try {
         ++field9648;
         return this.field9697 != null && this.field9697.method1709(123);
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[162] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(Ljea;)V"
   )
   public final void method598(class478 arg0) {
      try {
         this.field9702.method3924(-34, this, arg0, -1);
         ++field9664;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[33] + (arg0 != null ? field9864[1] : field9864[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(IIIIIILaa;II)V"
   )
   public final void method565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class516 arg6, int arg7, int arg8) {
      try {
         ++field9688;
         class111 var10 = (class111)arg6;
         class40 var11 = var10.field1402;
         this.method4892(true);
         this.method4848(false, var10.field1402);
         this.method4912(1, arg5);
         this.method4862(8448, 7681, 86);
         this.method4901(768, 0, 34167, 5);
         float var12 = var11.field467 / (float)var11.field470;
         float var13 = var11.field461 / (float)var11.field458;
         float var14 = (float)(-arg0) + (float)arg2;
         float var15 = (float)(-arg1) + (float)arg3;
         float var16 = (float)(1.0D / Math.sqrt((double)(var14 * var14 + var15 * var15)));
         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         float var17 = var14 * var16;
         float var18 = var15 * var16;
         OpenGL.glBegin(1);
         OpenGL.glTexCoord2f((float)(-arg7 + arg0) * var12, (float)(-arg8 + arg1) * var13);
         OpenGL.glVertex2f((float)arg0 + 0.35F, (float)arg1 + 0.35F);
         OpenGL.glTexCoord2f((float)(-arg7 + arg2) * var12, (float)(arg3 - arg8) * var13);
         OpenGL.glVertex2f((float)arg2 + var17 + 0.35F, (float)arg3 + var18 + 0.35F);
         OpenGL.glEnd();
         this.method4901(768, 0, 5890, 5);
      } catch (RuntimeException var20) {
         throw class534.method3846(var20, field9864[64] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field9864[1] : field9864[3]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "ZA",
      descriptor = "(IFFFFF)V"
   )
   public final void method509(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      try {
         ++field9646;
         boolean var7 = ~this.field9824 != ~arg0;
         if (var7 || this.field9831 != arg1 || this.field9819 != arg2) {
            this.field9824 = arg0;
            this.field9831 = arg1;
            this.field9819 = arg2;
            if (var7) {
               this.field9795 = (float)(this.field9824 & 65280) / 65280.0F;
               this.field9805 = (float)(this.field9824 & 255) / 255.0F;
               this.field9825 = (float)(this.field9824 & 16711680) / 1.671168E7F;
               this.method4910((byte)118);
            }

            this.method4859(111);
         }

         if (this.field9834[0] != arg3 || this.field9834[1] != arg4 || this.field9834[2] != arg5) {
            this.field9834[2] = arg5;
            this.field9834[0] = arg3;
            this.field9834[1] = arg4;
            this.field9828[2] = -arg5;
            this.field9828[0] = -arg3;
            this.field9828[1] = -arg4;
            float var8 = (float)(1.0D / Math.sqrt((double)(arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field9757[2] = arg5 * var8;
            this.field9757[1] = arg4 * var8;
            this.field9757[0] = arg3 * var8;
            this.field9784[0] = -this.field9757[0];
            this.field9784[1] = -this.field9757[1];
            this.field9784[2] = -this.field9757[2];
            this.method4843((byte)-102);
            this.field9751 = (int)(arg3 * 256.0F / arg4);
            this.field9796 = (int)(arg5 * 256.0F / arg4);
         }

      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field9864[166] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "e",
      descriptor = "()Z"
   )
   public final boolean method493() {
      try {
         ++field9691;
         return false;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[39] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "d",
      descriptor = "(II)I"
   )
   public final int method503(int arg0, int arg1) {
      try {
         ++field9641;
         return arg1 | arg0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[21] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "i",
      descriptor = "(Z)V"
   )
   private final void method4851(boolean arg0) {
      try {
         ++field9580;
         float[] var2 = this.field9810;
         float var3 = (float)(-this.field9823 * this.field9842) / (float)this.field9835;
         float var4 = (float)((-this.field9823 + this.field9660) * this.field9842) / (float)this.field9835;
         float var5 = (float)(this.field9842 * this.field9754) / (float)this.field9753;
         if (!arg0) {
            this.field9843 = 116;
         }

         label29: {
            float var6 = (float)((-this.field9621 + this.field9754) * this.field9842) / (float)this.field9753;
            if (var3 == var4 || var5 == var6) {
               var2[8] = 0.0F;
               var2[2] = 0.0F;
               var2[4] = 0.0F;
               var2[6] = 0.0F;
               var2[14] = 0.0F;
               var2[10] = 1.0F;
               var2[11] = 0.0F;
               var2[3] = 0.0F;
               var2[5] = 1.0F;
               var2[7] = 0.0F;
               var2[15] = 1.0F;
               var2[12] = 0.0F;
               var2[0] = 1.0F;
               var2[13] = 0.0F;
               var2[9] = 0.0F;
               var2[1] = 0.0F;
               if (!client.field4273) {
                  break label29;
               }
            }

            float var7 = (float)this.field9842 * 2.0F;
            var2[7] = 0.0F;
            var2[0] = var7 / (-var3 + var4);
            var2[2] = 0.0F;
            var2[3] = 0.0F;
            var2[12] = 0.0F;
            var2[9] = (var5 + var6) / (-var6 + var5);
            var2[14] = this.field9847 = -((float)this.field9856 * var7) / (float)(-this.field9842 + this.field9856);
            var2[1] = 0.0F;
            var2[11] = -1.0F;
            var2[5] = var7 / (var5 - var6);
            var2[10] = this.field9756 = (float)(-(this.field9856 + this.field9842)) / (float)(this.field9856 - this.field9842);
            var2[15] = 0.0F;
            var2[8] = (var3 + var4) / (-var3 + var4);
            var2[6] = 0.0F;
            var2[4] = 0.0F;
            var2[13] = 0.0F;
         }

         this.method4871((byte)92);
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field9864[43] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "g",
      descriptor = "(B)V"
   )
   private final void method4852(byte arg0) {
      try {
         ++field9594;
         if (this.field9747 != 2) {
            this.field9747 = 2;
            this.method4908(126);
            this.method4855((byte)102);
            this.field9738 &= -8;
         }

         if (arg0 <= 35) {
            this.field9695 = -78L;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[31] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(FFF)V"
   )
   public final void method537(float arg0, float arg1, float arg2) {
      try {
         ++field9633;
         class134.field1740 = arg0;
         class383.field5367 = arg2;
         class521.field7126 = arg1;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field9864[25] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "H",
      descriptor = "(III[I)V"
   )
   public final void method568(int arg0, int arg1, int arg2, int[] arg3) {
      try {
         ++field9540;
         float var5 = (float)arg2 * this.field9737.field7217 + (float)arg0 * this.field9737.field7227 + (float)arg1 * this.field9737.field7221 + this.field9737.field7251;
         if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
         } else {
            int var6 = (int)(((float)arg2 * this.field9737.field7248 + (float)arg0 * this.field9737.field7230 + (float)arg1 * this.field9737.field7244 + this.field9737.field7233) * (float)this.field9835 / var5);
            int var7 = (int)(((float)arg2 * this.field9737.field7231 + (float)arg0 * this.field9737.field7226 + (float)arg1 * this.field9737.field7238 + this.field9737.field7242) * (float)this.field9753 / var5);
            arg3[0] = (int)((float)var6 - this.field9760);
            arg3[2] = (int)var5;
            arg3[1] = (int)((float)var7 + -this.field9816);
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field9864[52] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9864[1] : field9864[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "c",
      descriptor = "(IIIIII)V"
   )
   public final void method523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field9505;
         float var7 = (float)arg0 + 0.35F;
         float var8 = (float)arg1 + 0.35F;
         float var9 = (float)arg2 + var7 + -1.0F;
         this.method4854(-4);
         float var10 = (float)arg3 + var8 - 1.0F;
         this.method4912(1, arg5);
         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         if (this.field9788) {
            OpenGL.glDisable(32925);
         }

         OpenGL.glBegin(2);
         OpenGL.glVertex2f(var7, var8);
         OpenGL.glVertex2f(var7, var10);
         OpenGL.glVertex2f(var9, var10);
         OpenGL.glVertex2f(var9, var8);
         OpenGL.glEnd();
         if (this.field9788) {
            OpenGL.glEnable(32925);
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field9864[103] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(Ljk;[Lok;Z)Lda;"
   )
   public final class66 method496(class663 arg0, class267[] arg1, boolean arg2) {
      try {
         ++field9619;
         return new class747(this, arg0, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field9864[61] + (arg0 != null ? field9864[1] : field9864[3]) + ',' + (arg1 != null ? field9864[1] : field9864[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "E",
      descriptor = "()I"
   )
   public final int method610() {
      try {
         ++field9698;
         return this.field9729 + this.field9726 - -this.field9727;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[180] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "o",
      descriptor = "(II)V"
   )
   public final synchronized void method4853(int arg0, int arg1) {
      try {
         if (arg0 != 1373) {
            this.method528();
         }

         ++field9682;
         class500 var3 = new class500();
         var3.field6862 = (long)arg1;
         this.field9734.method3859(2, var3);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field9864[96] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "X",
      descriptor = "(I)V"
   )
   public final void method533(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!or",
      name = "c",
      descriptor = "(Z)V"
   )
   public final void method554(boolean arg0) {
      try {
         ++field9523;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "m",
      descriptor = "(I)V"
   )
   private final void method4854(int arg0) {
      try {
         if (this.field9738 != 1) {
            this.method4886(true);
            this.method4869(false, (byte)-17);
            this.method4911(false, arg0 ^ 4);
            this.method4905(false, -98);
            this.method4837(false, -32);
            this.method4848(false, (class573)null);
            this.method4840(-2, 97);
            this.method4879(0, 1);
            this.field9738 = 1;
         }

         ++field9629;
         if (arg0 != -4) {
            this.method573((class200)null, -47, -31, -127, 6);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[48] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "s",
      descriptor = "()Z"
   )
   public final boolean method596() {
      try {
         ++field9504;
         return true;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[207] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "EA",
      descriptor = "(IIII)V"
   )
   public final void method564(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field9579;
         if (!this.field9830) {
            throw new RuntimeException("");
         } else {
            this.field9774 = arg2;
            this.field9780 = arg3;
            this.field9766 = arg0;
            this.field9787 = arg1;
            if (this.field9854) {
               this.field9699.field156.method1785((byte)-110);
               this.field9699.field156.method1786(-2591);
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9864[152] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "t",
      descriptor = "()Z"
   )
   public final boolean method534() {
      try {
         ++field9521;
         return true;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[59] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "p",
      descriptor = "()V"
   )
   public final void method560() {
      try {
         ++field9612;
         if (this.field9817 && this.field9660 > 0 && this.field9621 > 0) {
            int var1 = this.field9750;
            int var2 = this.field9827;
            int var3 = this.field9804;
            int var4 = this.field9841;
            this.method593();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method4861((byte)68);
            this.method4869(false, (byte)-24);
            this.method4911(false, -8);
            this.method4905(false, 49);
            this.method4837(false, -32);
            this.method4848(false, (class573)null);
            this.method4840(-2, 100);
            this.method4879(0, 1);
            this.method4912(1, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field9660, this.field9621, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method577(var1, var3, var2, var4);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9864[223] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "([IIIIIZ)Lbo;"
   )
   public final class763 method524(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         ++field9692;
         return new class280(this, arg3, arg4, arg0, arg1, arg2);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field9864[194] + (arg0 != null ? field9864[1] : field9864[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "h",
      descriptor = "(B)V"
   )
   private final void method4855(byte arg0) {
      try {
         if (arg0 == 102) {
            ++field9674;
            OpenGL.glLoadIdentity();
            OpenGL.glMultMatrixf(this.field9745.method3806((byte)-85), 0);
            if (this.field9854) {
               this.field9699.field156.method1785((byte)-120);
            }

            this.method4843((byte)-98);
            this.method4834((byte)122);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[58] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "c",
      descriptor = "(II)Lmp;"
   )
   public final class796 method590(int arg0, int arg1) {
      try {
         ++field9515;
         return null;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[77] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "s",
      descriptor = "(I)V"
   )
   private final void method4856(int arg0) {
      try {
         if (~this.field9747 != -4) {
            this.field9747 = 3;
            this.method4846(100);
            this.method4855((byte)102);
            this.field9738 &= -8;
         }

         if (arg0 != -8) {
            this.method4844((byte)-11, -97, -127);
         }

         ++field9636;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[125] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(IIIIZ)Lbo;"
   )
   public final class763 method513(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         ++field9675;
         return new class280(this, arg0, arg1, arg2, arg3);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field9864[154] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(ZLjaclib/memory/Buffer;IBI)Lei;"
   )
   public final class189 method4857(boolean arg0, Buffer arg1, int arg2, byte arg3, int arg4) {
      try {
         ++field9543;
         int var6 = 53 / ((arg3 - -57) / 50);
         return (class189)(!this.field9814 || arg0 && !this.field9837 ? new class450(this, arg4, arg1) : new class76(this, arg4, arg1, arg2, arg0));
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field9864[22] + arg0 + ',' + (arg1 != null ? field9864[1] : field9864[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "w",
      descriptor = "(I)V"
   )
   private final void method4858(int arg0) {
      try {
         ++field9614;
         if (arg0 >= -78) {
            this.field9761 = false;
         }

         OpenGL.glDepthMask(this.field9741 && this.field9782);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[184] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "na",
      descriptor = "(IIII)[I"
   )
   public final int[] method539(int arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field4273;

      try {
         ++field9640;
         int[] var6 = new int[arg2 * arg3];
         int var7 = 0;
         if (var5) {
            OpenGL.glReadPixelsi(arg0, this.field9621 - arg1 + -var7, arg2, 1, 32993, this.field9852, var6, arg2 * var7);
            ++var7;
         }

         while(true) {
            while(var7 < arg3) {
               OpenGL.glReadPixelsi(arg0, this.field9621 - arg1 + -var7, arg2, 1, 32993, this.field9852, var6, arg2 * var7);
               ++var7;
            }

            if (!var5) {
               return var6;
            }

            ++var7;
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field9864[111] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "v",
      descriptor = "(I)V"
   )
   private final void method4859(int arg0) {
      try {
         ++field9525;
         class764.field11037[1] = this.field9831 * this.field9795;
         if (arg0 < 103) {
            this.method592();
         }

         class764.field11037[0] = this.field9831 * this.field9825;
         class764.field11037[3] = 1.0F;
         class764.field11037[2] = this.field9831 * this.field9805;
         OpenGL.glLightfv(16384, 4609, class764.field11037, 0);
         class764.field11037[3] = 1.0F;
         class764.field11037[0] = -this.field9819 * this.field9825;
         class764.field11037[2] = -this.field9819 * this.field9805;
         class764.field11037[1] = -this.field9819 * this.field9795;
         OpenGL.glLightfv(16385, 4609, class764.field11037, 0);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[56] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(IZI)V"
   )
   public final synchronized void method4860(int arg0, boolean arg1, int arg2) {
      try {
         if (!arg1) {
            ++field9680;
            class144 var4 = new class144(arg2);
            var4.field6862 = (long)arg0;
            this.field9730.method3859(2, var4);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9864[155] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "f",
      descriptor = "(B)V"
   )
   public final void method4861(byte arg0) {
      try {
         if (arg0 != 68) {
            this.field9789 = 0.4442628F;
         }

         ++field9589;
         if (~this.field9747 != -1) {
            this.field9738 &= -32;
            this.field9747 = 0;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[76] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method594(boolean arg0) {
      try {
         ++field9644;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[186] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method4862(int arg0, int arg1, int arg2) {
      try {
         ++field9585;
         if (arg2 > 24) {
            if (this.field9845 != 0) {
               OpenGL.glTexEnvi(8960, 34161, arg1);
               OpenGL.glTexEnvi(8960, 34162, arg0);
            } else {
               boolean var4 = false;
               if (~this.field9785 != ~arg1) {
                  OpenGL.glTexEnvi(8960, 34161, arg1);
                  var4 = true;
                  this.field9785 = arg1;
               }

               if (~this.field9820 != ~arg0) {
                  OpenGL.glTexEnvi(8960, 34162, arg0);
                  var4 = true;
                  this.field9820 = arg0;
               }

               if (var4) {
                  this.field9738 &= -30;
               }
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9864[211] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method585(Canvas arg0, int arg1, int arg2) {
      try {
         ++field9501;
         if (this.field9657 == arg0) {
            throw new RuntimeException();
         } else if (!this.field9559.containsKey(arg0)) {
            if (!arg0.isShowing()) {
               throw new RuntimeException();
            } else {
               try {
                  Class var4 = Class.forName(field9864[73]);
                  Method var5 = var4.getMethod(field9864[75], Boolean.TYPE);
                  var5.invoke(arg0, Boolean.TRUE);
               } catch (Exception var9) {
               }

               long var6 = this.field9516.prepareSurface(arg0);
               if (~var6 == 0L) {
                  throw new RuntimeException();
               } else {
                  this.field9559.put(arg0, new Long(var6));
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field9864[74] + (arg0 != null ? field9864[1] : field9864[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method588(Canvas arg0) {
      try {
         label45: {
            this.field9544 = null;
            ++field9598;
            this.field9556 = 0L;
            if (arg0 == null || this.field9657 == arg0) {
               this.field9544 = this.field9657;
               this.field9556 = this.field9695;
               if (!client.field4273) {
                  break label45;
               }
            }

            if (this.field9559.containsKey(arg0)) {
               Long var2 = (Long)this.field9559.get(arg0);
               this.field9556 = var2;
               this.field9544 = arg0;
            }
         }

         if (this.field9544 != null && ~this.field9556 != -1L) {
            this.field9516.setSurface(this.field9556);
            this.method4903((byte)-8);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[34] + (arg0 != null ? field9864[1] : field9864[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(ILei;)V"
   )
   public final void method4863(int arg0, class189 arg1) {
      try {
         if (this.field9829 != arg1) {
            if (this.field9814) {
               OpenGL.glBindBufferARB(34962, arg1.method749((byte)83));
            }

            this.field9829 = arg1;
         }

         if (arg0 > 75) {
            ++field9649;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[214] + arg0 + ',' + (arg1 != null ? field9864[1] : field9864[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "L",
      descriptor = "(III)V"
   )
   public final void method547(int arg0, int arg1, int arg2) {
      try {
         ++field9653;
         if (this.field9846 != arg0 || ~this.field9806 != ~arg1 || this.field9772 != arg2) {
            this.field9772 = arg2;
            this.field9846 = arg0;
            this.field9806 = arg1;
            this.method4875(false);
            this.method4907(false);
         }

      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field9864[168] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(BLhd;)V"
   )
   public final void method4864(byte arg0, class776 arg1) {
      try {
         if (arg0 == -48) {
            ++field9613;
            if (!this.field9844) {
               if (this.field9717 >= 0 && this.field9723[this.field9717] == arg1) {
                  this.field9723[this.field9717--] = null;
                  arg1.method2447(-21057);
                  if (this.field9717 >= 0) {
                     this.field9716 = this.field9720 = this.field9723[this.field9717];
                     this.field9716.method2454(-18096);
                  } else {
                     this.field9716 = this.field9720 = null;
                  }
               } else {
                  throw new RuntimeException();
               }
            } else {
               this.method4882(arg1, 3584);
               this.method4914(-1, arg1);
            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[160] + arg0 + ',' + (arg1 != null ? field9864[1] : field9864[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method4865(int arg0, int arg1, byte arg2) {
      try {
         this.field9843 = arg0;
         ++field9609;
         this.field9794 = arg1;
         if (arg2 >= 90) {
            this.method4888((byte)-97);
            this.method4877(122);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field9864[110] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "h",
      descriptor = "(I)Lza;"
   )
   public final class438 method576(int arg0) {
      try {
         ++field9642;
         class233 var2 = new class233(arg0);
         this.field9710.method3859(2, var2);
         return var2;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[174] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(IBLgn;II)V"
   )
   public final void method4866(int arg0, byte arg1, class732 arg2, int arg3, int arg4) {
      try {
         ++field9527;
         int var6 = arg2.method4376((byte)-115);
         int var10 = arg0 * this.method4872(var6, 5122);
         int var7 = 81 % (-arg1 / 50);
         this.method4845(arg2, (byte)113);
         OpenGL.glDrawElements(arg3, arg4, var6, (long)var10 + arg2.method4377(59));
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field9864[80] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9864[1] : field9864[3]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "HA",
      descriptor = "(IIII[I)V"
   )
   public final void method492(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
      try {
         ++field9554;
         float var6 = (float)arg2 * this.field9737.field7217 + (float)arg0 * this.field9737.field7227 + (float)arg1 * this.field9737.field7221 + this.field9737.field7251;
         if (!((float)this.field9842 > var6) && !(var6 > (float)this.field9856)) {
            int var7 = (int)(((float)arg2 * this.field9737.field7248 + (float)arg0 * this.field9737.field7230 + (float)arg1 * this.field9737.field7244 + this.field9737.field7233) * (float)this.field9835 / (float)arg3);
            int var8 = (int)(((float)arg2 * this.field9737.field7231 + (float)arg0 * this.field9737.field7226 + (float)arg1 * this.field9737.field7238 + this.field9737.field7242) * (float)this.field9753 / (float)arg3);
            if ((float)var7 >= this.field9760 && this.field9849 >= (float)var7 && this.field9816 <= (float)var8 && (float)var8 <= this.field9821) {
               arg4[1] = (int)((float)var8 + -this.field9816);
               arg4[2] = (int)var6;
               arg4[0] = (int)((float)var7 - this.field9760);
            } else {
               arg4[0] = arg4[1] = arg4[2] = -1;
            }
         } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field9864[78] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field9864[1] : field9864[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "j",
      descriptor = "(I)V"
   )
   public final void method4867(int arg0) {
      try {
         ++field9572;
         if (arg0 <= -23) {
            if (~this.field9738 != -17) {
               this.method4856(-8);
               this.method4869(true, (byte)-126);
               this.method4905(true, 29);
               this.method4837(true, -32);
               this.method4912(1, 1);
               this.field9738 = 16;
            }
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[113] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(I[Loda;)V"
   )
   public final void method601(int arg0, class127[] arg1) {
      boolean var3 = client.field4273;

      try {
         int var4 = 0;
         if (var3) {
            this.field9779[var4] = arg1[var4];
            ++var4;
         }

         while(true) {
            class670 var10000;
            if (var4 >= arg0) {
               ++field9656;
               this.field9755 = arg0;
               var10000 = this;
               if (!var3) {
                  if (~this.field9747 != -2) {
                     this.method4834((byte)124);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = this;
            }

            var10000.field9779[var4] = arg1[var4];
            ++var4;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9864[130] + arg0 + ',' + (arg1 != null ? field9864[1] : field9864[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         OpenGL.glLineWidth((float)arg5);
         ++field9519;
         this.method497(arg0, arg1, arg2, arg3, arg4, arg6);
         OpenGL.glLineWidth(1.0F);
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field9864[181] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "i",
      descriptor = "()I"
   )
   public final int method567() {
      try {
         ++field9618;
         return this.field9842;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[65] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(Lhd;B)V"
   )
   public final void method4868(class776 arg0, byte arg1) {
      try {
         ++field9549;
         if (~this.field9722 <= -4) {
            throw new RuntimeException();
         } else {
            if (~this.field9722 <= -1) {
               this.field9724[this.field9722].method2450((byte)90);
            }

            this.field9720 = this.field9724[++this.field9722] = arg0;
            if (arg1 == 127) {
               this.field9720.method2457((byte)62);
            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[81] + (arg0 != null ? field9864[1] : field9864[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "o",
      descriptor = "()Luv;"
   )
   public final class386 method499() {
      boolean var1 = client.field4273;

      try {
         ++field9577;
         int var2 = -1;
         if (this.field9786.indexOf(field9864[7]) != -1) {
            var2 = 4318;
            if (!var1) {
               return new class386(var2, field9864[8], this.field9838, this.field9836, 0L);
            }
         }

         if (~this.field9786.indexOf(field9864[5]) == 0) {
            if (~this.field9786.indexOf(field9864[9]) == 0) {
               return new class386(var2, field9864[8], this.field9838, this.field9836, 0L);
            }

            var2 = 4098;
            if (!var1) {
               return new class386(var2, field9864[8], this.field9838, this.field9836, 0L);
            }
         }

         var2 = 32902;
         return new class386(var2, field9864[8], this.field9838, this.field9836, 0L);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method4869(boolean arg0, byte arg1) {
      try {
         ++field9542;
         if (arg0 == !this.field9771) {
            this.field9771 = arg0;
            this.method4907(false);
            this.field9738 &= -32;
         }

         if (arg1 >= -14) {
            this.method502(36, -103, 39, -105);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[215] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "q",
      descriptor = "(I)V"
   )
   private final void method4870(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!or",
      name = "l",
      descriptor = "(B)V"
   )
   private final void method4871(byte arg0) {
      try {
         ++field9694;
         this.field9810[14] = this.field9847;
         this.field9810[10] = this.field9756;
         if (arg0 != 92) {
            this.method4856(73);
         }

         this.field9790 = (this.field9810[14] + (float)(-this.field9856)) / this.field9810[10];
         this.field9797 = (float)this.field9856;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[45] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "h",
      descriptor = "(II)I"
   )
   public final int method4872(int arg0, int arg1) {
      try {
         ++field9605;
         if (~arg0 != -5122 && arg0 != 5120) {
            if (arg0 != 5123 && arg0 != 5122) {
               if (~arg0 != -5126 && ~arg0 != -5125 && ~arg0 != -5127) {
                  if (arg1 != 5122) {
                     return -16;
                  } else {
                     throw new IllegalArgumentException("");
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
         throw class534.method3846(var4, field9864[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "U",
      descriptor = "(IIIII)V"
   )
   public final void method558(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field9700;
         this.method4854(-4);
         this.method4912(1, arg4);
         float var6 = (float)arg0 + 0.35F;
         float var7 = (float)arg1 + 0.35F;
         OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
         OpenGL.glBegin(1);
         OpenGL.glVertex2f(var6, var7);
         OpenGL.glVertex2f((float)arg2 + var6, var7);
         OpenGL.glEnd();
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field9864[213] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "m",
      descriptor = "()Z"
   )
   public final boolean method517() {
      try {
         ++field9526;
         return this.field9699.method103((byte)-1, 3);
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[164] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method572(int arg0) {
      try {
         ++field9570;
         if (arg0 >= 128 && arg0 <= 1024) {
            this.field9706 = arg0;
            this.field9703.method2862(-15959);
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[94] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "da",
      descriptor = "(III[I)V"
   )
   public final void method562(int arg0, int arg1, int arg2, int[] arg3) {
      try {
         ++field9616;
         float var5 = (float)arg2 * this.field9737.field7217 + (float)arg0 * this.field9737.field7227 + (float)arg1 * this.field9737.field7221 + this.field9737.field7251;
         if (!((float)this.field9842 > var5) && !((float)this.field9856 < var5)) {
            int var6 = (int)(((float)arg2 * this.field9737.field7248 + (float)arg0 * this.field9737.field7230 + (float)arg1 * this.field9737.field7244 + this.field9737.field7233) * (float)this.field9835 / var5);
            int var7 = (int)(((float)arg2 * this.field9737.field7231 + (float)arg0 * this.field9737.field7226 + (float)arg1 * this.field9737.field7238 + this.field9737.field7242) * (float)this.field9753 / var5);
            if (this.field9760 <= (float)var6 && this.field9849 >= (float)var6 && (float)var7 >= this.field9816 && this.field9821 >= (float)var7) {
               arg3[0] = (int)((float)var6 - this.field9760);
               arg3[1] = (int)((float)var7 + -this.field9816);
               arg3[2] = (int)var5;
            } else {
               arg3[0] = arg3[1] = arg3[2] = -1;
            }
         } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field9864[165] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9864[1] : field9864[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "o",
      descriptor = "(I)V"
   )
   public static void method4873(int arg0) {
      try {
         field9690 = null;
         if (arg0 != -3923) {
            method4894((byte)22);
         }

         field9536 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[210] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(Lwq;Lwq;ILwq;Lwq;)V"
   )
   public final void method4874(class178 arg0, class178 arg1, int arg2, class178 arg3, class178 arg4) {
      boolean var6 = client.field4273;

      try {
         label65: {
            if (arg3 != null) {
               this.method4863(76, arg3.field2212);
               OpenGL.glVertexPointer(arg3.field2207, arg3.field2209, this.field9829.method750(-118), this.field9829.method752((byte)103) + (long)arg3.field2211);
               OpenGL.glEnableClientState(32884);
               if (!var6) {
                  break label65;
               }
            }

            OpenGL.glDisableClientState(32884);
         }

         ++field9497;
         if (arg2 <= 70) {
            this.method4862(-37, 57, 55);
         }

         label59: {
            if (arg4 == null) {
               OpenGL.glDisableClientState(32885);
               if (!var6) {
                  break label59;
               }
            }

            this.method4863(90, arg4.field2212);
            OpenGL.glNormalPointer(arg4.field2209, this.field9829.method750(-79), this.field9829.method752((byte)80) + (long)arg4.field2211);
            OpenGL.glEnableClientState(32885);
         }

         label54: {
            if (arg0 == null) {
               OpenGL.glDisableClientState(32886);
               if (!var6) {
                  break label54;
               }
            }

            this.method4863(90, arg0.field2212);
            OpenGL.glColorPointer(arg0.field2207, arg0.field2209, this.field9829.method750(-71), this.field9829.method752((byte)-122) + (long)arg0.field2211);
            OpenGL.glEnableClientState(32886);
         }

         if (arg1 == null) {
            OpenGL.glDisableClientState(32888);
         } else {
            this.method4863(88, arg1.field2212);
            OpenGL.glTexCoordPointer(arg1.field2207, arg1.field2209, this.field9829.method750(-126), this.field9829.method752((byte)-74) + (long)arg1.field2211);
            OpenGL.glEnableClientState(32888);
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field9864[55] + (arg0 != null ? field9864[1] : field9864[3]) + ',' + (arg1 != null ? field9864[1] : field9864[3]) + ',' + arg2 + ',' + (arg3 != null ? field9864[1] : field9864[3]) + ',' + (arg4 != null ? field9864[1] : field9864[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "A",
      descriptor = "()Z"
   )
   public final boolean method566() {
      try {
         ++field9520;
         return true;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[54] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "d",
      descriptor = "(Z)V"
   )
   private final void method4875(boolean arg0) {
      try {
         ++field9566;
         if (arg0) {
            this.field9807 = null;
         }

         this.field9764 = (float)(this.field9856 - this.field9772) - this.field9792;
         this.field9798 = -((float)this.field9806 * this.field9812) + this.field9764;
         if (this.field9798 < (float)this.field9842) {
            this.field9798 = (float)this.field9842;
         }

         OpenGL.glFogf(2915, this.field9798);
         OpenGL.glFogf(2916, this.field9764);
         class764.field11037[1] = (float)class743.method5375(this.field9846, 65280) / 65280.0F;
         class764.field11037[0] = (float)class743.method5375(16711680, this.field9846) / 1.671168E7F;
         class764.field11037[2] = (float)class743.method5375(255, this.field9846) / 255.0F;
         OpenGL.glFogfv(2918, class764.field11037, 0);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "l",
      descriptor = "(II)V"
   )
   public final void method4876(int arg0, int arg1) {
      try {
         class764.field11037[3] = (float)(arg1 >>> 24) / 255.0F;
         ++field9557;
         if (arg0 >= -47) {
            this.field9853 = null;
         }

         class764.field11037[2] = (float)class743.method5375(255, arg1) / 255.0F;
         class764.field11037[0] = (float)class743.method5375(arg1, 16711680) / 1.671168E7F;
         class764.field11037[1] = (float)class743.method5375(arg1, 65280) / 65280.0F;
         OpenGL.glTexEnvfv(8960, 8705, class764.field11037, 0);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[38] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "XA",
      descriptor = "()I"
   )
   public final int method578() {
      try {
         ++field9582;
         return this.field9856;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[19] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "g",
      descriptor = "(I)V"
   )
   public final synchronized void method553(int arg0) {
      boolean var2 = client.field4273;

      try {
         ++field9673;
         int var3 = 0;
         int var15 = arg0 & Integer.MAX_VALUE;
         int var10000;
         if (var2 || !this.field9730.method3858((byte)-63)) {
            do {
               class144 var4 = (class144)this.field9730.method3869((byte)76);
               class543.field7418[var3++] = (int)var4.field6862;
               this.field9729 -= var4.field1905;
               var10000 = ~var3;

               while(var10000 == -1001) {
                  OpenGL.glDeleteBuffersARB(var3, class543.field7418, 0);
                  var10000 = 0;
                  if (!var2) {
                     var3 = 0;
                     break;
                  }
               }
            } while(!this.field9730.method3858((byte)-63));
         }

         class144 var5;
         class144 var6;
         class144 var7;
         boolean var8;
         class144 var9;
         class500 var10;
         class500 var11;
         class144 var12;
         byte var16;
         class670 var18;
         if (~var3 < -1) {
            OpenGL.glDeleteBuffersARB(var3, class543.field7418, 0);
            var3 = 0;
            if (var2) {
               var5 = (class144)this.field9731.method3869((byte)50);
               class543.field7418[var3++] = (int)var5.field6862;
               this.field9727 -= var5.field1905;
               var10000 = var3;
            } else {
               if (this.field9731.method3858((byte)-63)) {
                  label687: {
                     if (~var3 < -1) {
                        OpenGL.glDeleteTextures(var3, class543.field7418, 0);
                        var3 = 0;
                        if (var2) {
                           var6 = (class144)this.field9732.method3869((byte)88);
                           class543.field7418[var3++] = var6.field1905;
                           var10000 = ~var3;
                        } else {
                           if (this.field9732.method3858((byte)-63)) {
                              break label687;
                           }

                           var6 = (class144)this.field9732.method3869((byte)88);
                           class543.field7418[var3++] = var6.field1905;
                           var10000 = ~var3;
                        }
                     } else {
                        if (this.field9732.method3858((byte)-63)) {
                           break label687;
                        }

                        var6 = (class144)this.field9732.method3869((byte)88);
                        class543.field7418[var3++] = var6.field1905;
                        var10000 = ~var3;
                     }

                     while(true) {
                        while(var10000 == -1001) {
                           OpenGL.glDeleteFramebuffersEXT(var3, class543.field7418, 0);
                           var10000 = 0;
                           if (!var2) {
                              var3 = 0;
                              break;
                           }
                        }

                        if (this.field9732.method3858((byte)-63)) {
                           break;
                        }

                        var6 = (class144)this.field9732.method3869((byte)88);
                        class543.field7418[var3++] = var6.field1905;
                        var10000 = ~var3;
                     }
                  }

                  if (~var3 < -1) {
                     OpenGL.glDeleteFramebuffersEXT(var3, class543.field7418, 0);
                     var16 = 0;
                     if (var2) {
                        var7 = (class144)this.field9733.method3869((byte)93);
                        var3 = var16 + 1;
                        class543.field7418[var16] = (int)var7.field6862;
                        this.field9726 -= var7.field1905;
                        var10000 = ~var3;
                     } else {
                        if (this.field9733.method3858((byte)-63)) {
                           label745: {
                              if (var16 > 0) {
                                 OpenGL.glDeleteRenderbuffersEXT(var16, class543.field7418, 0);
                                 var8 = false;
                                 if (!var2 && this.field9728.method3858((byte)-63)) {
                                    break label745;
                                 }
                              } else if (this.field9728.method3858((byte)-63)) {
                                 break label745;
                              }

                              do {
                                 var9 = (class144)this.field9728.method3869((byte)94);
                                 OpenGL.glDeleteLists((int)var9.field6862, var9.field1905);
                              } while(!this.field9728.method3858((byte)-63));
                           }

                           if (var2) {
                              var10 = this.field9734.method3869((byte)82);
                              OpenGL.glDeleteProgramARB((int)var10.field6862);
                           }

                           while(!this.field9734.method3858((byte)-63)) {
                              var10 = this.field9734.method3869((byte)82);
                              OpenGL.glDeleteProgramARB((int)var10.field6862);
                           }

                           if (var2 || !this.field9735.method3858((byte)-63)) {
                              do {
                                 var11 = this.field9735.method3869((byte)127);
                                 OpenGL.glDeleteObjectARB(var11.field6862);
                              } while(!this.field9735.method3858((byte)-63));
                           }

                           if (var2) {
                              var12 = (class144)this.field9728.method3869((byte)125);
                              OpenGL.glDeleteLists((int)var12.field6862, var12.field1905);
                           }

                           while(true) {
                              if (this.field9728.method3858((byte)-63)) {
                                 this.field9703.method2860(5);
                                 var18 = this;
                                 if (!var2) {
                                    if (this.method610() > 100663296 && class792.method5708(-25005) > this.field9743 + 60000L) {
                                       System.gc();
                                       this.field9743 = class792.method5708(-25005);
                                    }

                                    this.field9711 = var15;
                                    return;
                                 }
                              } else {
                                 var18 = this;
                              }

                              var12 = (class144)var18.field9728.method3869((byte)125);
                              OpenGL.glDeleteLists((int)var12.field6862, var12.field1905);
                           }
                        }

                        var7 = (class144)this.field9733.method3869((byte)93);
                        var3 = var16 + 1;
                        class543.field7418[var16] = (int)var7.field6862;
                        this.field9726 -= var7.field1905;
                        var10000 = ~var3;
                     }
                  } else {
                     if (this.field9733.method3858((byte)-63)) {
                        label831: {
                           if (var3 > 0) {
                              OpenGL.glDeleteRenderbuffersEXT(var3, class543.field7418, 0);
                              var8 = false;
                              if (!var2 && this.field9728.method3858((byte)-63)) {
                                 break label831;
                              }
                           } else if (this.field9728.method3858((byte)-63)) {
                              break label831;
                           }

                           do {
                              var9 = (class144)this.field9728.method3869((byte)94);
                              OpenGL.glDeleteLists((int)var9.field6862, var9.field1905);
                           } while(!this.field9728.method3858((byte)-63));
                        }

                        if (var2) {
                           var10 = this.field9734.method3869((byte)82);
                           OpenGL.glDeleteProgramARB((int)var10.field6862);
                        }

                        while(!this.field9734.method3858((byte)-63)) {
                           var10 = this.field9734.method3869((byte)82);
                           OpenGL.glDeleteProgramARB((int)var10.field6862);
                        }

                        if (var2 || !this.field9735.method3858((byte)-63)) {
                           do {
                              var11 = this.field9735.method3869((byte)127);
                              OpenGL.glDeleteObjectARB(var11.field6862);
                           } while(!this.field9735.method3858((byte)-63));
                        }

                        if (var2) {
                           var12 = (class144)this.field9728.method3869((byte)125);
                           OpenGL.glDeleteLists((int)var12.field6862, var12.field1905);
                        }

                        while(true) {
                           if (this.field9728.method3858((byte)-63)) {
                              this.field9703.method2860(5);
                              var18 = this;
                              if (!var2) {
                                 if (this.method610() > 100663296 && class792.method5708(-25005) > this.field9743 + 60000L) {
                                    System.gc();
                                    this.field9743 = class792.method5708(-25005);
                                 }

                                 this.field9711 = var15;
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class144)var18.field9728.method3869((byte)125);
                           OpenGL.glDeleteLists((int)var12.field6862, var12.field1905);
                        }
                     }

                     var7 = (class144)this.field9733.method3869((byte)93);
                     class543.field7418[var3++] = (int)var7.field6862;
                     this.field9726 -= var7.field1905;
                     var10000 = ~var3;
                  }

                  while(true) {
                     while(var10000 == -1001) {
                        OpenGL.glDeleteRenderbuffersEXT(var3, class543.field7418, 0);
                        var10000 = 0;
                        if (!var2) {
                           var3 = 0;
                           break;
                        }
                     }

                     if (this.field9733.method3858((byte)-63)) {
                        label930: {
                           if (var3 > 0) {
                              OpenGL.glDeleteRenderbuffersEXT(var3, class543.field7418, 0);
                              var8 = false;
                              if (!var2 && this.field9728.method3858((byte)-63)) {
                                 break label930;
                              }
                           } else if (this.field9728.method3858((byte)-63)) {
                              break label930;
                           }

                           do {
                              var9 = (class144)this.field9728.method3869((byte)94);
                              OpenGL.glDeleteLists((int)var9.field6862, var9.field1905);
                           } while(!this.field9728.method3858((byte)-63));
                        }

                        if (var2) {
                           var10 = this.field9734.method3869((byte)82);
                           OpenGL.glDeleteProgramARB((int)var10.field6862);
                        }

                        while(!this.field9734.method3858((byte)-63)) {
                           var10 = this.field9734.method3869((byte)82);
                           OpenGL.glDeleteProgramARB((int)var10.field6862);
                        }

                        if (var2 || !this.field9735.method3858((byte)-63)) {
                           do {
                              var11 = this.field9735.method3869((byte)127);
                              OpenGL.glDeleteObjectARB(var11.field6862);
                           } while(!this.field9735.method3858((byte)-63));
                        }

                        if (var2) {
                           var12 = (class144)this.field9728.method3869((byte)125);
                           OpenGL.glDeleteLists((int)var12.field6862, var12.field1905);
                        }

                        while(true) {
                           if (this.field9728.method3858((byte)-63)) {
                              this.field9703.method2860(5);
                              var18 = this;
                              if (!var2) {
                                 if (this.method610() > 100663296 && class792.method5708(-25005) > this.field9743 + 60000L) {
                                    System.gc();
                                    this.field9743 = class792.method5708(-25005);
                                 }

                                 this.field9711 = var15;
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class144)var18.field9728.method3869((byte)125);
                           OpenGL.glDeleteLists((int)var12.field6862, var12.field1905);
                        }
                     }

                     var7 = (class144)this.field9733.method3869((byte)93);
                     class543.field7418[var3++] = (int)var7.field6862;
                     this.field9726 -= var7.field1905;
                     var10000 = ~var3;
                  }
               }

               var5 = (class144)this.field9731.method3869((byte)50);
               class543.field7418[var3++] = (int)var5.field6862;
               this.field9727 -= var5.field1905;
               var10000 = var3;
            }
         } else {
            if (this.field9731.method3858((byte)-63)) {
               label357: {
                  if (~var3 < -1) {
                     OpenGL.glDeleteTextures(var3, class543.field7418, 0);
                     var3 = 0;
                     if (var2) {
                        var6 = (class144)this.field9732.method3869((byte)88);
                        class543.field7418[var3++] = var6.field1905;
                        var10000 = ~var3;
                     } else {
                        if (this.field9732.method3858((byte)-63)) {
                           break label357;
                        }

                        var6 = (class144)this.field9732.method3869((byte)88);
                        class543.field7418[var3++] = var6.field1905;
                        var10000 = ~var3;
                     }
                  } else {
                     if (this.field9732.method3858((byte)-63)) {
                        break label357;
                     }

                     var6 = (class144)this.field9732.method3869((byte)88);
                     class543.field7418[var3++] = var6.field1905;
                     var10000 = ~var3;
                  }

                  while(true) {
                     while(var10000 == -1001) {
                        OpenGL.glDeleteFramebuffersEXT(var3, class543.field7418, 0);
                        var10000 = 0;
                        if (!var2) {
                           var3 = 0;
                           break;
                        }
                     }

                     if (this.field9732.method3858((byte)-63)) {
                        break;
                     }

                     var6 = (class144)this.field9732.method3869((byte)88);
                     class543.field7418[var3++] = var6.field1905;
                     var10000 = ~var3;
                  }
               }

               if (~var3 < -1) {
                  OpenGL.glDeleteFramebuffersEXT(var3, class543.field7418, 0);
                  var16 = 0;
                  if (var2) {
                     var7 = (class144)this.field9733.method3869((byte)93);
                     var3 = var16 + 1;
                     class543.field7418[var16] = (int)var7.field6862;
                     this.field9726 -= var7.field1905;
                     var10000 = ~var3;
                  } else {
                     if (this.field9733.method3858((byte)-63)) {
                        label415: {
                           if (var16 > 0) {
                              OpenGL.glDeleteRenderbuffersEXT(var16, class543.field7418, 0);
                              var8 = false;
                              if (!var2 && this.field9728.method3858((byte)-63)) {
                                 break label415;
                              }
                           } else if (this.field9728.method3858((byte)-63)) {
                              break label415;
                           }

                           do {
                              var9 = (class144)this.field9728.method3869((byte)94);
                              OpenGL.glDeleteLists((int)var9.field6862, var9.field1905);
                           } while(!this.field9728.method3858((byte)-63));
                        }

                        if (var2) {
                           var10 = this.field9734.method3869((byte)82);
                           OpenGL.glDeleteProgramARB((int)var10.field6862);
                        }

                        while(!this.field9734.method3858((byte)-63)) {
                           var10 = this.field9734.method3869((byte)82);
                           OpenGL.glDeleteProgramARB((int)var10.field6862);
                        }

                        if (var2 || !this.field9735.method3858((byte)-63)) {
                           do {
                              var11 = this.field9735.method3869((byte)127);
                              OpenGL.glDeleteObjectARB(var11.field6862);
                           } while(!this.field9735.method3858((byte)-63));
                        }

                        if (var2) {
                           var12 = (class144)this.field9728.method3869((byte)125);
                           OpenGL.glDeleteLists((int)var12.field6862, var12.field1905);
                        }

                        while(true) {
                           if (this.field9728.method3858((byte)-63)) {
                              this.field9703.method2860(5);
                              var18 = this;
                              if (!var2) {
                                 if (this.method610() > 100663296 && class792.method5708(-25005) > this.field9743 + 60000L) {
                                    System.gc();
                                    this.field9743 = class792.method5708(-25005);
                                 }

                                 this.field9711 = var15;
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class144)var18.field9728.method3869((byte)125);
                           OpenGL.glDeleteLists((int)var12.field6862, var12.field1905);
                        }
                     }

                     var7 = (class144)this.field9733.method3869((byte)93);
                     var3 = var16 + 1;
                     class543.field7418[var16] = (int)var7.field6862;
                     this.field9726 -= var7.field1905;
                     var10000 = ~var3;
                  }
               } else {
                  if (this.field9733.method3858((byte)-63)) {
                     label501: {
                        if (var3 > 0) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class543.field7418, 0);
                           var8 = false;
                           if (!var2 && this.field9728.method3858((byte)-63)) {
                              break label501;
                           }
                        } else if (this.field9728.method3858((byte)-63)) {
                           break label501;
                        }

                        do {
                           var9 = (class144)this.field9728.method3869((byte)94);
                           OpenGL.glDeleteLists((int)var9.field6862, var9.field1905);
                        } while(!this.field9728.method3858((byte)-63));
                     }

                     if (var2) {
                        var10 = this.field9734.method3869((byte)82);
                        OpenGL.glDeleteProgramARB((int)var10.field6862);
                     }

                     while(!this.field9734.method3858((byte)-63)) {
                        var10 = this.field9734.method3869((byte)82);
                        OpenGL.glDeleteProgramARB((int)var10.field6862);
                     }

                     if (var2 || !this.field9735.method3858((byte)-63)) {
                        do {
                           var11 = this.field9735.method3869((byte)127);
                           OpenGL.glDeleteObjectARB(var11.field6862);
                        } while(!this.field9735.method3858((byte)-63));
                     }

                     if (var2) {
                        var12 = (class144)this.field9728.method3869((byte)125);
                        OpenGL.glDeleteLists((int)var12.field6862, var12.field1905);
                     }

                     while(true) {
                        if (this.field9728.method3858((byte)-63)) {
                           this.field9703.method2860(5);
                           var18 = this;
                           if (!var2) {
                              if (this.method610() > 100663296 && class792.method5708(-25005) > this.field9743 + 60000L) {
                                 System.gc();
                                 this.field9743 = class792.method5708(-25005);
                              }

                              this.field9711 = var15;
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class144)var18.field9728.method3869((byte)125);
                        OpenGL.glDeleteLists((int)var12.field6862, var12.field1905);
                     }
                  }

                  var7 = (class144)this.field9733.method3869((byte)93);
                  class543.field7418[var3++] = (int)var7.field6862;
                  this.field9726 -= var7.field1905;
                  var10000 = ~var3;
               }

               while(true) {
                  while(var10000 == -1001) {
                     OpenGL.glDeleteRenderbuffersEXT(var3, class543.field7418, 0);
                     var10000 = 0;
                     if (!var2) {
                        var3 = 0;
                        break;
                     }
                  }

                  if (this.field9733.method3858((byte)-63)) {
                     label600: {
                        if (var3 > 0) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class543.field7418, 0);
                           var8 = false;
                           if (!var2 && this.field9728.method3858((byte)-63)) {
                              break label600;
                           }
                        } else if (this.field9728.method3858((byte)-63)) {
                           break label600;
                        }

                        do {
                           var9 = (class144)this.field9728.method3869((byte)94);
                           OpenGL.glDeleteLists((int)var9.field6862, var9.field1905);
                        } while(!this.field9728.method3858((byte)-63));
                     }

                     if (var2) {
                        var10 = this.field9734.method3869((byte)82);
                        OpenGL.glDeleteProgramARB((int)var10.field6862);
                     }

                     while(!this.field9734.method3858((byte)-63)) {
                        var10 = this.field9734.method3869((byte)82);
                        OpenGL.glDeleteProgramARB((int)var10.field6862);
                     }

                     if (var2 || !this.field9735.method3858((byte)-63)) {
                        do {
                           var11 = this.field9735.method3869((byte)127);
                           OpenGL.glDeleteObjectARB(var11.field6862);
                        } while(!this.field9735.method3858((byte)-63));
                     }

                     if (var2) {
                        var12 = (class144)this.field9728.method3869((byte)125);
                        OpenGL.glDeleteLists((int)var12.field6862, var12.field1905);
                     }

                     while(true) {
                        if (this.field9728.method3858((byte)-63)) {
                           this.field9703.method2860(5);
                           var18 = this;
                           if (!var2) {
                              if (this.method610() > 100663296 && class792.method5708(-25005) > this.field9743 + 60000L) {
                                 System.gc();
                                 this.field9743 = class792.method5708(-25005);
                              }

                              this.field9711 = var15;
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class144)var18.field9728.method3869((byte)125);
                        OpenGL.glDeleteLists((int)var12.field6862, var12.field1905);
                     }
                  }

                  var7 = (class144)this.field9733.method3869((byte)93);
                  class543.field7418[var3++] = (int)var7.field6862;
                  this.field9726 -= var7.field1905;
                  var10000 = ~var3;
               }
            }

            var5 = (class144)this.field9731.method3869((byte)50);
            class543.field7418[var3++] = (int)var5.field6862;
            this.field9727 -= var5.field1905;
            var10000 = var3;
         }

         while(true) {
            while(var10000 == 1000) {
               OpenGL.glDeleteTextures(var3, class543.field7418, 0);
               var10000 = 0;
               if (!var2) {
                  var3 = 0;
                  break;
               }
            }

            if (this.field9731.method3858((byte)-63)) {
               label137: {
                  if (~var3 < -1) {
                     OpenGL.glDeleteTextures(var3, class543.field7418, 0);
                     var3 = 0;
                     if (var2) {
                        var6 = (class144)this.field9732.method3869((byte)88);
                        class543.field7418[var3++] = var6.field1905;
                        var10000 = ~var3;
                     } else {
                        if (this.field9732.method3858((byte)-63)) {
                           break label137;
                        }

                        var6 = (class144)this.field9732.method3869((byte)88);
                        class543.field7418[var3++] = var6.field1905;
                        var10000 = ~var3;
                     }
                  } else {
                     if (this.field9732.method3858((byte)-63)) {
                        break label137;
                     }

                     var6 = (class144)this.field9732.method3869((byte)88);
                     class543.field7418[var3++] = var6.field1905;
                     var10000 = ~var3;
                  }

                  while(true) {
                     while(var10000 == -1001) {
                        OpenGL.glDeleteFramebuffersEXT(var3, class543.field7418, 0);
                        var10000 = 0;
                        if (!var2) {
                           var3 = 0;
                           break;
                        }
                     }

                     if (this.field9732.method3858((byte)-63)) {
                        break;
                     }

                     var6 = (class144)this.field9732.method3869((byte)88);
                     class543.field7418[var3++] = var6.field1905;
                     var10000 = ~var3;
                  }
               }

               if (~var3 < -1) {
                  OpenGL.glDeleteFramebuffersEXT(var3, class543.field7418, 0);
                  var16 = 0;
                  if (var2) {
                     var7 = (class144)this.field9733.method3869((byte)93);
                     var3 = var16 + 1;
                     class543.field7418[var16] = (int)var7.field6862;
                     this.field9726 -= var7.field1905;
                     var10000 = ~var3;
                  } else {
                     if (this.field9733.method3858((byte)-63)) {
                        label237: {
                           if (var16 > 0) {
                              OpenGL.glDeleteRenderbuffersEXT(var16, class543.field7418, 0);
                              var8 = false;
                              if (!var2 && this.field9728.method3858((byte)-63)) {
                                 break label237;
                              }
                           } else if (this.field9728.method3858((byte)-63)) {
                              break label237;
                           }

                           do {
                              var9 = (class144)this.field9728.method3869((byte)94);
                              OpenGL.glDeleteLists((int)var9.field6862, var9.field1905);
                           } while(!this.field9728.method3858((byte)-63));
                        }

                        if (var2) {
                           var10 = this.field9734.method3869((byte)82);
                           OpenGL.glDeleteProgramARB((int)var10.field6862);
                        }

                        while(!this.field9734.method3858((byte)-63)) {
                           var10 = this.field9734.method3869((byte)82);
                           OpenGL.glDeleteProgramARB((int)var10.field6862);
                        }

                        if (var2 || !this.field9735.method3858((byte)-63)) {
                           do {
                              var11 = this.field9735.method3869((byte)127);
                              OpenGL.glDeleteObjectARB(var11.field6862);
                           } while(!this.field9735.method3858((byte)-63));
                        }

                        if (var2) {
                           var12 = (class144)this.field9728.method3869((byte)125);
                           OpenGL.glDeleteLists((int)var12.field6862, var12.field1905);
                        }

                        while(true) {
                           if (this.field9728.method3858((byte)-63)) {
                              this.field9703.method2860(5);
                              var18 = this;
                              if (!var2) {
                                 if (this.method610() > 100663296 && class792.method5708(-25005) > this.field9743 + 60000L) {
                                    System.gc();
                                    this.field9743 = class792.method5708(-25005);
                                 }

                                 this.field9711 = var15;
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class144)var18.field9728.method3869((byte)125);
                           OpenGL.glDeleteLists((int)var12.field6862, var12.field1905);
                        }
                     }

                     var7 = (class144)this.field9733.method3869((byte)93);
                     var3 = var16 + 1;
                     class543.field7418[var16] = (int)var7.field6862;
                     this.field9726 -= var7.field1905;
                     var10000 = ~var3;
                  }
               } else {
                  if (this.field9733.method3858((byte)-63)) {
                     label150: {
                        if (var3 > 0) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class543.field7418, 0);
                           var8 = false;
                           if (!var2 && this.field9728.method3858((byte)-63)) {
                              break label150;
                           }
                        } else if (this.field9728.method3858((byte)-63)) {
                           break label150;
                        }

                        do {
                           var9 = (class144)this.field9728.method3869((byte)94);
                           OpenGL.glDeleteLists((int)var9.field6862, var9.field1905);
                        } while(!this.field9728.method3858((byte)-63));
                     }

                     if (var2) {
                        var10 = this.field9734.method3869((byte)82);
                        OpenGL.glDeleteProgramARB((int)var10.field6862);
                     }

                     while(!this.field9734.method3858((byte)-63)) {
                        var10 = this.field9734.method3869((byte)82);
                        OpenGL.glDeleteProgramARB((int)var10.field6862);
                     }

                     if (var2 || !this.field9735.method3858((byte)-63)) {
                        do {
                           var11 = this.field9735.method3869((byte)127);
                           OpenGL.glDeleteObjectARB(var11.field6862);
                        } while(!this.field9735.method3858((byte)-63));
                     }

                     if (var2) {
                        var12 = (class144)this.field9728.method3869((byte)125);
                        OpenGL.glDeleteLists((int)var12.field6862, var12.field1905);
                     }

                     while(true) {
                        if (this.field9728.method3858((byte)-63)) {
                           this.field9703.method2860(5);
                           var18 = this;
                           if (!var2) {
                              if (this.method610() > 100663296 && class792.method5708(-25005) > this.field9743 + 60000L) {
                                 System.gc();
                                 this.field9743 = class792.method5708(-25005);
                              }

                              this.field9711 = var15;
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class144)var18.field9728.method3869((byte)125);
                        OpenGL.glDeleteLists((int)var12.field6862, var12.field1905);
                     }
                  }

                  var7 = (class144)this.field9733.method3869((byte)93);
                  class543.field7418[var3++] = (int)var7.field6862;
                  this.field9726 -= var7.field1905;
                  var10000 = ~var3;
               }

               while(true) {
                  while(var10000 == -1001) {
                     OpenGL.glDeleteRenderbuffersEXT(var3, class543.field7418, 0);
                     var10000 = 0;
                     if (!var2) {
                        var3 = 0;
                        break;
                     }
                  }

                  if (this.field9733.method3858((byte)-63)) {
                     label99: {
                        if (var3 > 0) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class543.field7418, 0);
                           var8 = false;
                           if (!var2 && this.field9728.method3858((byte)-63)) {
                              break label99;
                           }
                        } else if (this.field9728.method3858((byte)-63)) {
                           break label99;
                        }

                        do {
                           var9 = (class144)this.field9728.method3869((byte)94);
                           OpenGL.glDeleteLists((int)var9.field6862, var9.field1905);
                        } while(!this.field9728.method3858((byte)-63));
                     }

                     if (var2) {
                        var10 = this.field9734.method3869((byte)82);
                        OpenGL.glDeleteProgramARB((int)var10.field6862);
                     }

                     while(!this.field9734.method3858((byte)-63)) {
                        var10 = this.field9734.method3869((byte)82);
                        OpenGL.glDeleteProgramARB((int)var10.field6862);
                     }

                     if (var2 || !this.field9735.method3858((byte)-63)) {
                        do {
                           var11 = this.field9735.method3869((byte)127);
                           OpenGL.glDeleteObjectARB(var11.field6862);
                        } while(!this.field9735.method3858((byte)-63));
                     }

                     if (var2) {
                        var12 = (class144)this.field9728.method3869((byte)125);
                        OpenGL.glDeleteLists((int)var12.field6862, var12.field1905);
                     }

                     while(true) {
                        if (this.field9728.method3858((byte)-63)) {
                           this.field9703.method2860(5);
                           var18 = this;
                           if (!var2) {
                              if (this.method610() > 100663296 && class792.method5708(-25005) > this.field9743 + 60000L) {
                                 System.gc();
                                 this.field9743 = class792.method5708(-25005);
                              }

                              this.field9711 = var15;
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class144)var18.field9728.method3869((byte)125);
                        OpenGL.glDeleteLists((int)var12.field6862, var12.field1905);
                     }
                  }

                  var7 = (class144)this.field9733.method3869((byte)93);
                  class543.field7418[var3++] = (int)var7.field6862;
                  this.field9726 -= var7.field1905;
                  var10000 = ~var3;
               }
            }

            var5 = (class144)this.field9731.method3869((byte)50);
            class543.field7418[var3++] = (int)var5.field6862;
            this.field9727 -= var5.field1905;
            var10000 = var3;
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field9864[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(Lkh;)V"
   )
   public final void method581(class17 arg0) {
      try {
         this.field9737.method158(arg0);
         ++field9555;
         this.field9745.method158(this.field9737);
         this.field9745.method3814(-2143);
         this.field9746.method3812(-108, this.field9745);
         if (this.field9747 != 1) {
            this.method4855((byte)102);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[2] + (arg0 != null ? field9864[1] : field9864[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(II)Ldw;"
   )
   public final class751 method531(int arg0, int arg1) {
      try {
         ++field9541;
         return null;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[197] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "l",
      descriptor = "(I)V"
   )
   private final void method4877(int arg0) {
      try {
         int var2 = -119 / ((arg0 - 82) / 34);
         ++field9593;
         if (~this.field9750 >= ~this.field9827 && this.field9804 <= this.field9841) {
            OpenGL.glScissor(this.field9843 + this.field9750, this.field9794 + this.field9621 - this.field9841, -this.field9750 + this.field9827, this.field9841 - this.field9804);
         } else {
            OpenGL.glScissor(0, 0, 0, 0);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[69] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(IIIIII)Ltba;"
   )
   public final class172 method514(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field9639;
         return this.field9781 ? new class746(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field9864[26] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(FBF)V"
   )
   public final void method4878(float arg0, byte arg1, float arg2) {
      try {
         if (arg1 != -17) {
            this.field9762 = null;
         }

         this.field9792 = arg2;
         ++field9537;
         this.field9812 = arg0;
         this.method4875(false);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field9864[193] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "k",
      descriptor = "(II)V"
   )
   public final void method4879(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         if (arg0 != 0) {
            this.field9855 = false;
         }

         label45: {
            if (arg1 != 1) {
               if (arg1 == 0) {
                  this.method4862(8448, 8448, 61);
                  if (!var3) {
                     break label45;
                  }
               }

               if (~arg1 == -3) {
                  this.method4862(7681, 34165, 48);
                  if (!var3) {
                     break label45;
                  }
               }

               if (~arg1 != -4) {
                  if (~arg1 != -5) {
                     break label45;
                  }

                  this.method4862(34023, 34023, 56);
                  if (!var3) {
                     break label45;
                  }
               }

               this.method4862(8448, 260, 90);
               if (!var3) {
                  break label45;
               }
            }

            this.method4862(7681, 7681, arg0 + 72);
         }

         ++field9679;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field9864[79] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "M",
      descriptor = "()I"
   )
   public final int method505() {
      try {
         ++field9689;
         int var1 = this.field9863;
         this.field9863 = 0;
         return var1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[187] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(I[BIZI)Lgn;"
   )
   public final class732 method4880(int arg0, byte[] arg1, int arg2, boolean arg3, int arg4) {
      try {
         if (arg4 != -30320) {
            this.method517();
         }

         ++field9573;
         return (class732)(!this.field9814 || arg3 && !this.field9837 ? new class768(this, arg2, arg1, arg0) : new class600(this, arg2, arg1, arg0, arg3));
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field9864[37] + arg0 + ',' + (arg1 != null ? field9864[1] : field9864[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V"
   )
   public final void method489(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class265 {
      try {
         ++field9620;
         this.method542(arg2, arg3);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9864[50] + (arg0 != null ? field9864[1] : field9864[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "r",
      descriptor = "(IIIIIII)I"
   )
   public final int method595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4273;

      try {
         int var11;
         label58: {
            ++field9508;
            float var9 = (float)arg2 * this.field9737.field7217 + (float)arg0 * this.field9737.field7227 + (float)arg1 * this.field9737.field7221 + this.field9737.field7251;
            float var10 = (float)arg5 * this.field9737.field7217 + (float)arg3 * this.field9737.field7227 + (float)arg4 * this.field9737.field7221 + this.field9737.field7251;
            var11 = 0;
            if ((float)this.field9842 > var9 && (float)this.field9842 > var10) {
               var11 |= 16;
               if (!var8) {
                  break label58;
               }
            }

            if (var9 > (float)this.field9856 && (float)this.field9856 < var10) {
               var11 |= 32;
            }
         }

         label52: {
            int var12 = (int)(((float)arg2 * this.field9737.field7248 + (float)arg0 * this.field9737.field7230 + (float)arg1 * this.field9737.field7244 + this.field9737.field7233) * (float)this.field9835 / (float)arg6);
            int var13 = (int)(((float)arg5 * this.field9737.field7248 + (float)arg3 * this.field9737.field7230 + (float)arg4 * this.field9737.field7244 + this.field9737.field7233) * (float)this.field9835 / (float)arg6);
            if (this.field9760 > (float)var12 && (float)var13 < this.field9760) {
               var11 |= 1;
               if (!var8) {
                  break label52;
               }
            }

            if ((float)var12 > this.field9849 && (float)var13 > this.field9849) {
               var11 |= 2;
            }
         }

         int var14 = (int)(((float)arg2 * this.field9737.field7231 + (float)arg0 * this.field9737.field7226 + (float)arg1 * this.field9737.field7238 + this.field9737.field7242) * (float)this.field9753 / (float)arg6);
         int var15 = (int)(((float)arg5 * this.field9737.field7231 + (float)arg3 * this.field9737.field7226 + (float)arg4 * this.field9737.field7238 + this.field9737.field7242) * (float)this.field9753 / (float)arg6);
         if (this.field9816 > (float)var14 && this.field9816 > (float)var15) {
            var11 |= 4;
            if (!var8) {
               return var11;
            }
         }

         if (this.field9821 < (float)var14 && (float)var15 > this.field9821) {
            var11 |= 8;
         }

         return var11;
      } catch (RuntimeException var17) {
         throw class534.method3846(var17, field9864[71] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "k",
      descriptor = "(Z)V"
   )
   public final void method4881(boolean arg0) {
      try {
         OpenGL.glPopMatrix();
         ++field9509;
         if (!arg0) {
            this.field9831 = -0.86662614F;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(Lhd;I)V"
   )
   public final void method4882(class776 arg0, int arg1) {
      try {
         ++field9685;
         if (~this.field9719 <= -1 && this.field9718[this.field9719] == arg0) {
            this.field9718[this.field9719--] = null;
            if (arg1 != 3584) {
               this.field9821 = -1.0309049F;
            }

            arg0.method2456(14461);
            if (~this.field9719 > -1) {
               this.field9716 = null;
            } else {
               this.field9716 = this.field9718[this.field9719];
               this.field9716.method2445(-511);
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[88] + (arg0 != null ? field9864[1] : field9864[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "za",
      descriptor = "(IIIII)V"
   )
   public final void method602(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var6 = client.field4273;

      try {
         if (~arg2 > -1) {
            arg2 = -arg2;
         }

         ++field9626;
         if (~this.field9750 >= ~(arg0 + arg2) && ~(-arg2 + arg0) >= ~this.field9827 && ~this.field9804 >= ~(arg1 + arg2) && ~(-arg2 + arg1) >= ~this.field9841) {
            this.method4854(-4);
            this.method4912(1, arg4);
            OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
            float var7 = (float)arg0 + 0.35F;
            float var8 = (float)arg1 + 0.35F;
            int var9 = arg2 << 1;
            if (this.field9789 > (float)var9) {
               OpenGL.glBegin(7);
               OpenGL.glVertex2f(var7 + 1.0F, var8 + 1.0F);
               OpenGL.glVertex2f(var7 + 1.0F, var8 - 1.0F);
               OpenGL.glVertex2f(var7 - 1.0F, var8 + -1.0F);
               OpenGL.glVertex2f(var7 + -1.0F, var8 + 1.0F);
               OpenGL.glEnd();
            } else if (this.field9832 >= (float)var9) {
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

                  if (~var10 < -513) {
                     var10 = 512;
                  }
               }

               int var11 = class558.method4015(var10, false);
               OpenGL.glVertex2f((float)arg2 + var7, var8);
               int var12 = -var11 + 16384;
               if (var6) {
                  OpenGL.glVertex2f(class133.field1717[var12] * (float)arg2 + var7, class133.field1732[var12] * (float)arg2 + var8);
                  var12 -= var11;
               }

               while(true) {
                  while(~var12 < -1) {
                     OpenGL.glVertex2f(class133.field1717[var12] * (float)arg2 + var7, class133.field1732[var12] * (float)arg2 + var8);
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
         throw class534.method3846(var14, field9864[196] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "C",
      descriptor = "(Z)V"
   )
   public final void method574(boolean arg0) {
      try {
         this.field9782 = arg0;
         ++field9677;
         this.method4858(-109);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[219] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(IFFFF)V"
   )
   public final void method4883(int arg0, float arg1, float arg2, float arg3, float arg4) {
      try {
         class764.field11037[2] = arg3;
         class764.field11037[1] = arg2;
         class764.field11037[3] = arg1;
         ++field9624;
         class764.field11037[0] = arg4;
         if (arg0 != -4) {
            this.method505();
         }

         OpenGL.glTexEnvfv(8960, 8705, class764.field11037, 0);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field9864[122] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(ZLbia;)V"
   )
   public final void method4884(boolean arg0, class528 arg1) {
      try {
         OpenGL.glPushMatrix();
         ++field9658;
         OpenGL.glMultMatrixf(arg1.method3806((byte)-89), 0);
         if (arg0) {
            this.method592();
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[92] + arg0 + ',' + (arg1 != null ? field9864[1] : field9864[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "K",
      descriptor = "([I)V"
   )
   public final void method582(int[] arg0) {
      try {
         arg0[3] = this.field9841;
         arg0[2] = this.field9827;
         arg0[1] = this.field9804;
         ++field9564;
         arg0[0] = this.field9750;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[209] + (arg0 != null ? field9864[1] : field9864[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "b",
      descriptor = "(II)I"
   )
   public final int method540(int arg0, int arg1) {
      try {
         ++field9643;
         return arg0 & arg1 ^ arg1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[173] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "h",
      descriptor = "()V"
   )
   public final void method563() {
      boolean var1 = client.field4273;

      try {
         class500 var2 = this.field9710.method3855(121);
         if (var1) {
            ((class233)var2).method1762(false);
            var2 = this.field9710.method3866((byte)115);
         }

         while(true) {
            while(var2 != null) {
               ((class233)var2).method1762(false);
               var2 = this.field9710.method3866((byte)115);
            }

            ++field9665;
            if (!var1) {
               if (this.field9696 != null) {
                  this.field9696.method4362((byte)93);
               }

               if (this.field9516 != null) {
                  Object var10000;
                  label47: {
                     this.method4909(1);
                     Enumeration var3 = this.field9559.keys();
                     if (var1) {
                        var10000 = var3.nextElement();
                     } else if (!var3.hasMoreElements()) {
                        this.field9516.release();
                        var10000 = this;
                        if (!var1) {
                           break label47;
                        }
                     } else {
                        var10000 = var3.nextElement();
                     }

                     while(true) {
                        Canvas var4 = (Canvas)var10000;
                        Long var5 = (Long)this.field9559.get(var4);
                        this.field9516.releaseSurface(var4, var5);
                        if (!var3.hasMoreElements()) {
                           this.field9516.release();
                           var10000 = this;
                           if (!var1) {
                              break;
                           }
                        } else {
                           var10000 = var3.nextElement();
                        }
                     }
                  }

                  ((class670)var10000).field9516 = null;
               }

               if (this.field9715) {
                  class481.method3502(-1, false, true);
                  this.field9715 = false;
                  return;
               }

               return;
            }

            var2 = this.field9710.method3866((byte)115);
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field9864[182] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "r",
      descriptor = "(I)V"
   )
   public final void method4885(int arg0) {
      try {
         if (arg0 <= -124) {
            ++field9558;
            OpenGL.glPushMatrix();
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[44] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "d",
      descriptor = "()V"
   )
   public final void method592() {
      try {
         ++field9532;
         OpenGL.glFinish();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[14] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "f",
      descriptor = "(Z)V"
   )
   private final void method4886(boolean arg0) {
      try {
         ++field9666;
         if (arg0) {
            if (~this.field9747 != -2) {
               OpenGL.glMatrixMode(5889);
               OpenGL.glLoadIdentity();
               if (this.field9660 > 0 && this.field9621 > 0) {
                  OpenGL.glOrtho(0.0D, (double)this.field9660, (double)this.field9621, 0.0D, -1.0D, 1.0D);
               }

               OpenGL.glMatrixMode(5888);
               OpenGL.glLoadIdentity();
               this.field9738 &= -25;
               this.field9747 = 1;
            }
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[119] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "ra",
      descriptor = "(IIII)V"
   )
   public final void method501(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field9780 = arg3;
         this.field9830 = true;
         this.field9766 = arg0;
         this.field9787 = arg1;
         ++field9562;
         this.field9774 = arg2;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9864[195] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(ZLhd;)V"
   )
   public final void method4887(boolean arg0, class776 arg1) {
      try {
         ++field9578;
         if (~this.field9719 <= -4) {
            throw new RuntimeException();
         } else {
            if (this.field9719 >= 0) {
               this.field9718[this.field9719].method2456(14461);
            }

            if (arg0) {
               this.field9748 = null;
            }

            this.field9716 = this.field9718[++this.field9719] = arg1;
            this.field9716.method2445(-511);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[104] + arg0 + ',' + (arg1 != null ? field9864[1] : field9864[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "i",
      descriptor = "(I)V"
   )
   public final void method529(int arg0) {
      try {
         this.method4909(1);
         ++field9631;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "T",
      descriptor = "(IIII)V"
   )
   public final void method530(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg2 < this.field9827) {
            this.field9827 = arg2;
         }

         ++field9632;
         if (~this.field9750 > ~arg0) {
            this.field9750 = arg0;
         }

         if (~arg1 < ~this.field9804) {
            this.field9804 = arg1;
         }

         if (arg3 < this.field9841) {
            this.field9841 = arg3;
         }

         OpenGL.glEnable(3089);
         this.method4915(-1);
         this.method4877(116);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9864[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "i",
      descriptor = "(B)V"
   )
   private final void method4888(byte arg0) {
      try {
         if (arg0 >= -79) {
            this.field9846 = 23;
         }

         OpenGL.glViewport(this.field9843, this.field9794, this.field9660, this.field9621);
         ++field9634;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[108] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "c",
      descriptor = "()V"
   )
   public final void method552() {
      try {
         this.field9696.method4364(9728);
         ++field9565;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[170] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(IJ)V"
   )
   public final synchronized void method4889(int arg0, long arg1) {
      try {
         ++field9567;
         class500 var4 = new class500();
         var4.field6862 = arg1;
         this.field9735.method3859(2, var4);
         int var5 = 126 % ((11 - arg0) / 51);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field9864[163] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method4890(boolean arg0, boolean arg1) {
      try {
         ++field9514;
         if (!arg0) {
            this.method580(107);
         }

         if (!arg1 != !this.field9815) {
            this.field9815 = arg1;
            this.method4895(-111);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[120] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(IBII)V"
   )
   public final void method4891(int arg0, byte arg1, int arg2, int arg3) {
      try {
         if (arg1 >= 65) {
            OpenGL.glDrawArrays(arg0, arg3, arg2);
            ++field9693;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9864[121] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "la",
      descriptor = "()V"
   )
   public final void method593() {
      try {
         this.field9804 = 0;
         this.field9827 = this.field9660;
         this.field9841 = this.field9621;
         this.field9750 = 0;
         ++field9511;
         OpenGL.glDisable(3089);
         this.method4915(-1);
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[27] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method532(int arg0) {
      try {
         ++field9553;
         if (~arg0 != -2) {
            throw new IllegalArgumentException("");
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[167] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "j",
      descriptor = "(Z)V"
   )
   public final void method4892(boolean arg0) {
      try {
         if (this.field9738 != 2) {
            this.method4886(true);
            this.method4869(false, (byte)-32);
            this.method4911(false, -8);
            this.method4905(false, -101);
            this.method4837(false, -32);
            this.method4840(-2, 65);
            this.field9738 = 2;
         }

         ++field9684;
         if (!arg0) {
            this.method4858(-27);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[115] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method521(Canvas arg0, int arg1, int arg2) {
      try {
         long var4;
         label37: {
            ++field9672;
            var4 = 0L;
            if (arg0 != null && this.field9657 != arg0) {
               if (!this.field9559.containsKey(arg0)) {
                  break label37;
               }

               Long var6 = (Long)this.field9559.get(arg0);
               var4 = var6;
               if (!client.field4273) {
                  break label37;
               }
            }

            var4 = this.field9695;
         }

         if (~var4 == -1L) {
            throw new RuntimeException();
         } else {
            this.field9516.surfaceResized(var4);
            if (this.field9544 == arg0) {
               this.method4903((byte)-8);
            }
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field9864[172] + (arg0 != null ? field9864[1] : field9864[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(BI)I"
   )
   public final int method4893(byte arg0, int arg1) {
      try {
         int var3 = -66 / ((arg0 - 75) / 32);
         ++field9671;
         if (~arg1 != -6407 && ~arg1 != -6410) {
            if (~arg1 != -6411 && arg1 != 34846 && ~arg1 != -34845) {
               if (arg1 == 6407) {
                  return 3;
               } else if (~arg1 != -6409 && arg1 != 34847) {
                  if (~arg1 == -34844) {
                     return 6;
                  } else if (arg1 == 34842) {
                     return 8;
                  } else if (arg1 == 6402) {
                     return 3;
                  } else if (~arg1 == -6402) {
                     return 1;
                  } else {
                     throw new IllegalArgumentException("");
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
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field9864[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(Ltba;)V"
   )
   public final void method556(class172 arg0) {
      try {
         this.field9840 = (class604)arg0;
         ++field9678;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[107] + (arg0 != null ? field9864[1] : field9864[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "GA",
      descriptor = "(I)V"
   )
   public final void method589(int arg0) {
      try {
         this.method4912(1, 0);
         ++field9534;
         OpenGL.glClearColor((float)(16711680 & arg0) / 1.671168E7F, (float)(65280 & arg0) / 65280.0F, (float)(255 & arg0) / 255.0F, (float)(arg0 >>> 24) / 255.0F);
         OpenGL.glClear(16384);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[29] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method4894(byte arg0) {
      try {
         class347.field4965.method3640(5, (byte)98);
         ++field9654;
         class221.field2760.method3749(128, 5);
         class261.field3341.method2423(5, (byte)-122);
         class472.field6533.method3589(64, 5);
         class742.field10813.method2432(8752, 5);
         class645.field9054.method480(5, 0);
         class392.field5479.method1480((byte)41, 5);
         class516.field7085.method1484(5, 7464);
         class402.field5645.method2782((byte)-30, 5);
         class517.field7093.method3272(5, (byte)57);
         class427.field5966.method3293(true, 5);
         class437.field6062.method2888(5, 10);
         if (arg0 > -124) {
            field9690 = null;
         }

         class581.field7984.method3692(5, -110);
         class25.field315.method5233(-1, 5);
         class599.field8358.method2387(5, 34165);
         class717.field10511.method5459(-106, 5);
         class716.field10503.method2226(5, -97);
         class371.field5238.method1968(69, 5);
         class212.field2634.method3316(5, (byte)94);
         class757.field10971.method5139(18104, 5);
         class694.field10144.method3217(5, false);
         class24.field302.method3905(5, 1);
         class477.field6598.method1532(5, 0);
         class12.method92(-87, 5);
         class582.method4184(2, 50);
         class462.method3394((byte)126, 50);
         class4.method28(5, true);
         class604.method4403(5, -5651);
         class412.field5799.method4234(2, 5);
         field9690.method4234(2, 5);
         class661.field9435.method4234(2, 5);
         class679.field9963.method4234(2, 5);
         class16.field225.method4234(2, 5);
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[42] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method506(Canvas arg0) {
      try {
         ++field9500;
         if (this.field9657 == arg0) {
            throw new RuntimeException();
         } else if (this.field9559.containsKey(arg0)) {
            Long var2 = (Long)this.field9559.get(arg0);
            this.field9516.releaseSurface(arg0, var2);
            this.field9559.remove(arg0);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[208] + (arg0 != null ? field9864[1] : field9864[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "u",
      descriptor = "(I)V"
   )
   private final void method4895(int arg0) {
      try {
         label23: {
            if (this.field9791 && !this.field9815) {
               OpenGL.glEnable(2896);
               if (!client.field4273) {
                  break label23;
               }
            }

            OpenGL.glDisable(2896);
         }

         ++field9533;
         if (arg0 >= -93) {
            this.field9716 = null;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[191] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "r",
      descriptor = "()V"
   )
   public final void method544() {
      try {
         label28: {
            ++field9668;
            if (this.field9857) {
               if (this.field9720 != this.field9721) {
                  throw new RuntimeException();
               }

               this.field9721.method2446(0, (byte)81);
               this.field9721.method2446(8, (byte)81);
               this.method4864((byte)-48, this.field9721);
               if (!client.field4273) {
                  break label28;
               }
            }

            if (!this.field9822) {
               throw new RuntimeException("");
            }

            this.field9725.method1624(0, 0, this.field9660, this.field9621, 0, 0);
            this.field9516.setSurface(this.field9556);
         }

         this.field9660 = this.field9670;
         this.field9621 = this.field9574;
         this.field9725 = null;
         this.method4861((byte)68);
         this.method4888((byte)-106);
         this.method593();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[90] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "b",
      descriptor = "(IIIID)V"
   )
   public final void method606(int arg0, int arg1, int arg2, int arg3, double arg4) {
      try {
         ++field9550;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field9864[225] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "Q",
      descriptor = "(IIIIII[BII)V"
   )
   public final void method515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
      try {
         float var10;
         float var11;
         label36: {
            ++field9546;
            if (this.field9768 == null || ~this.field9768.field10040 > ~arg2 || ~this.field9768.field10044 > ~arg3) {
               this.field9768 = class273.method2089(arg2, 6406, arg6, 3553, arg3, 6406, this, false);
               this.field9768.method4998(10497, false, false);
               var10 = this.field9768.field461;
               var11 = this.field9768.field467;
               if (!client.field4273) {
                  break label36;
               }
            }

            this.field9768.method5000(arg3, 6406, arg6, 0, 0, arg2, 3314, false, 0, 0);
            var11 = (float)arg2 * this.field9768.field467 / (float)this.field9768.field10040;
            var10 = (float)arg3 * this.field9768.field461 / (float)this.field9768.field10044;
         }

         this.method4892(true);
         this.method4848(false, this.field9768);
         this.method4912(1, arg8);
         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         this.method4876(-59, arg5);
         this.method4862(34165, 34165, 97);
         this.method4901(768, 0, 34166, 5);
         this.method4901(770, 2, 5890, 5);
         this.method4906((byte)26, 770, 0, 34166);
         this.method4906((byte)26, 770, 2, 5890);
         float var12 = (float)arg0;
         float var13 = (float)arg1;
         float var14 = (float)arg2 + var12;
         OpenGL.glBegin(7);
         float var15 = (float)arg3 + var13;
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2f(var12, var13);
         OpenGL.glTexCoord2f(0.0F, var11);
         OpenGL.glVertex2f(var12, var15);
         OpenGL.glTexCoord2f(var10, var11);
         OpenGL.glVertex2f(var14, var15);
         OpenGL.glTexCoord2f(var10, 0.0F);
         OpenGL.glVertex2f(var14, var13);
         OpenGL.glEnd();
         this.method4901(768, 0, 5890, 5);
         this.method4901(770, 2, 34166, 5);
         this.method4906((byte)26, 770, 0, 5890);
         this.method4906((byte)26, 770, 2, 34166);
      } catch (RuntimeException var17) {
         throw class534.method3846(var17, field9864[157] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field9864[1] : field9864[3]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "n",
      descriptor = "()Z"
   )
   public final boolean method490() {
      try {
         ++field9560;
         return true;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[112] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "KA",
      descriptor = "(IIII)V"
   )
   public final void method577(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field9601;
         if (~arg1 > -1) {
            arg1 = 0;
         }

         if (~this.field9660 > ~arg2) {
            arg2 = this.field9660;
         }

         if (arg0 < 0) {
            arg0 = 0;
         }

         if (arg3 > this.field9621) {
            arg3 = this.field9621;
         }

         this.field9804 = arg1;
         this.field9827 = arg2;
         this.field9750 = arg0;
         this.field9841 = arg3;
         OpenGL.glEnable(3089);
         this.method4915(-1);
         this.method4877(-113);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9864[30] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "y",
      descriptor = "()Z"
   )
   public final boolean method538() {
      try {
         ++field9687;
         return this.field9788 && (!this.method583() || this.field9855);
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[128] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "k",
      descriptor = "(I)I"
   )
   private final int method4896(int arg0) {
      try {
         if (arg0 <= 108) {
            this.method4897(71, -1.8816298F);
         }

         ++field9686;
         this.field9786 = OpenGL.glGetString(7936).toLowerCase();
         int var2 = 0;
         this.field9836 = OpenGL.glGetString(7937).toLowerCase();
         if (this.field9786.indexOf(field9864[143]) != -1) {
            var2 |= 1;
         }

         if (this.field9786.indexOf(field9864[135]) != -1 || this.field9786.indexOf(field9864[132]) != -1) {
            var2 |= 1;
         }

         label55: {
            String var3 = OpenGL.glGetString(7938);
            String[] var4 = class249.method1870(' ', var3.replace('.', ' '), false);
            if (var4.length < 2) {
               var2 |= 4;
               if (!client.field4273) {
                  break label55;
               }
            }

            try {
               int var5 = class76.method747(11732, var4[0]);
               int var6 = class76.method747(11732, var4[1]);
               this.field9838 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
               var2 |= 4;
            }
         }

         if (this.field9838 < 12) {
            var2 |= 2;
         }

         if (!this.field9516.method4750(field9864[138])) {
            var2 |= 8;
         }

         if (!this.field9516.method4750(field9864[148])) {
            var2 |= 32;
         }

         int[] var7 = new int[1];
         OpenGL.glGetIntegerv(34018, var7, 0);
         this.field9763 = var7[0];
         OpenGL.glGetIntegerv(34929, var7, 0);
         this.field9775 = var7[0];
         OpenGL.glGetIntegerv(34930, var7, 0);
         this.field9778 = var7[0];
         if (~this.field9763 > -3 || ~this.field9775 > -3 || this.field9778 < 2) {
            var2 |= 16;
         }

         this.field9773 = Stream.method5101();
         this.field9822 = this.field9516.arePbuffersAvailable();
         this.field9814 = this.field9516.method4750(field9864[134]);
         this.field9788 = this.field9516.method4750(field9864[136]);
         this.field9761 = this.field9516.method4750(field9864[147]);
         this.field9516.method4750(field9864[137]);
         this.field9777 = this.field9516.method4750(field9864[133]);
         this.field9765 = this.field9516.method4750(field9864[140]);
         this.field9770 = this.field9516.method4750(field9864[144]);
         this.field9809 = this.field9516.method4750(field9864[146]);
         this.field9781 = this.field9516.method4750(field9864[131]);
         this.field9851 = this.field9516.method4750(field9864[139]);
         this.field9783 = false;
         this.field9857 = this.field9516.method4750(field9864[141]);
         this.field9844 = this.field9516.method4750(field9864[150]);
         this.field9848 = this.field9516.method4750(field9864[149]);
         this.field9855 = this.field9848 & this.field9844;
         this.field9752 = class364.field5148.startsWith(field9864[145]);
         OpenGL.glGetFloatv(2834, class764.field11037, 0);
         this.field9832 = class764.field11037[1];
         this.field9789 = class764.field11037[0];
         return ~var2 == -1 ? 0 : var2;
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field9864[142] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "f",
      descriptor = "()Lkh;"
   )
   public final class17 method603() {
      try {
         ++field9539;
         return new class528();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[183] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "F",
      descriptor = "(II)V"
   )
   public final void method570(int arg0, int arg1) {
      try {
         ++field9606;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[87] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(IF)V"
   )
   public final void method4897(int arg0, float arg1) {
      try {
         ++field9518;
         if (arg0 != -4) {
            this.method4881(true);
         }

         if (this.field9793 != arg1) {
            this.field9793 = arg1;
            if (~this.field9747 == -4) {
               this.method4846(98);
               return;
            }
         }

      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[176] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "I",
      descriptor = "()I"
   )
   public final int method494() {
      try {
         ++field9588;
         int var1 = this.field9858;
         this.field9858 = 0;
         return var1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[217] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(Lbia;I)V"
   )
   public final void method4898(class528 arg0, int arg1) {
      try {
         OpenGL.glLoadMatrixf(arg0.method3806((byte)119), 0);
         if (arg1 <= 19) {
            this.method590(2, -54);
         }

         ++field9622;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[129] + (arg0 != null ? field9864[1] : field9864[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "<init>",
      descriptor = "(Ljava/awt/Canvas;Ld;I)V"
   )
   public class670(Canvas param1, class160 param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method571(int[] arg0) {
      try {
         arg0[1] = this.field9621;
         arg0[0] = this.field9660;
         ++field9596;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[97] + (arg0 != null ? field9864[1] : field9864[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "b",
      descriptor = "(BLhd;)V"
   )
   public final void method4899(byte arg0, class776 arg1) {
      try {
         if (arg0 <= -68) {
            ++field9595;
            if (this.field9844) {
               this.method4887(false, arg1);
               this.method4868(arg1, (byte)127);
            } else if (~this.field9717 <= -4) {
               throw new RuntimeException();
            } else {
               if (this.field9717 >= 0) {
                  this.field9723[this.field9717].method2447(-21057);
               }

               this.field9716 = this.field9720 = this.field9723[++this.field9717] = arg1;
               this.field9716.method2454(-18096);
            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[63] + arg0 + ',' + (arg1 != null ? field9864[1] : field9864[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method491(int arg0) {
      try {
         ++field9583;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[224] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "g",
      descriptor = "(Z)Lfh;"
   )
   public final class681 method4900(boolean arg0) {
      try {
         if (!arg0) {
            this.field9815 = true;
         }

         ++field9637;
         return this.field9840 != null ? this.field9840.method1910(52) : null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[70] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(Lg;)V"
   )
   public final void method550(class165 arg0) {
      try {
         ++field9587;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[51] + (arg0 != null ? field9864[1] : field9864[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "b",
      descriptor = "(IIII)V"
   )
   public final void method4901(int arg0, int arg1, int arg2, int arg3) {
      try {
         OpenGL.glTexEnvi(8960, arg1 + 34176, arg2);
         ++field9568;
         OpenGL.glTexEnvi(8960, arg1 + 34192, arg0);
         if (arg3 != 5) {
            this.method507();
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9864[35] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "m",
      descriptor = "(B)V"
   )
   public final void method4902(byte arg0) {
      try {
         if (this.field9738 != 4) {
            this.method4886(true);
            this.method4869(false, (byte)-29);
            this.method4911(false, -8);
            this.method4905(false, -93);
            this.method4837(false, -32);
            this.method4840(-2, 115);
            this.method4912(1, 1);
            this.field9738 = 4;
         }

         if (arg0 != -3) {
            field9690 = null;
         }

         ++field9655;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[192] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "b",
      descriptor = "(B)V"
   )
   private final void method4903(byte arg0) {
      try {
         label24: {
            if (this.field9544 == null) {
               this.field9670 = this.field9574 = 0;
               if (!client.field4273) {
                  break label24;
               }
            }

            Dimension var2 = this.field9544.getSize();
            this.field9574 = var2.height;
            this.field9670 = var2.width;
         }

         ++field9650;
         if (this.field9720 == null) {
            this.field9621 = this.field9574;
            this.field9660 = this.field9670;
            this.method4888((byte)-98);
         }

         if (arg0 != -8) {
            this.method499();
         }

         this.method4861((byte)68);
         this.method593();
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[86] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(IBI)V"
   )
   public final synchronized void method4904(int arg0, byte arg1, int arg2) {
      try {
         ++field9659;
         class144 var4 = new class144(arg2);
         var4.field6862 = (long)arg0;
         if (arg1 != -17) {
            this.method529(-61);
         }

         this.field9731.method3859(2, var4);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9864[16] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method4905(boolean arg0, int arg1) {
      try {
         ++field9610;
         if (this.field9740 == !arg0) {
            label23: {
               if (!arg0) {
                  OpenGL.glDisable(2929);
                  if (!client.field4273) {
                     break label23;
                  }
               }

               OpenGL.glEnable(2929);
            }

            this.field9740 = arg0;
            this.field9738 &= -32;
         }

         int var3 = 9 / ((arg1 - -32) / 46);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field9864[67] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(BIII)V"
   )
   public final void method4906(byte arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg0 != 26) {
            field9552 = -59;
         }

         OpenGL.glTexEnvi(8960, arg2 + 34184, arg3);
         ++field9647;
         OpenGL.glTexEnvi(8960, 34200 - -arg2, arg1);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9864[102] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "h",
      descriptor = "(Z)V"
   )
   private final void method4907(boolean arg0) {
      try {
         if (arg0) {
            this.field9765 = true;
         }

         ++field9584;
         if (this.field9771 && this.field9806 >= 0) {
            OpenGL.glEnable(2912);
         } else {
            OpenGL.glDisable(2912);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[93] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "n",
      descriptor = "(I)V"
   )
   private final void method4908(int arg0) {
      try {
         OpenGL.glMatrixMode(5889);
         ++field9645;
         if (arg0 >= 124) {
            OpenGL.glLoadMatrixf(this.field9810, 0);
            OpenGL.glMatrixMode(5888);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[179] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "x",
      descriptor = "()V"
   )
   public final void method579() {
      try {
         if (this.field9697 != null && this.field9697.method1709(86)) {
            this.field9696.method4370((byte)58, this.field9697);
            this.field9703.method2862(-15959);
         }

         ++field9651;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[159] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method502(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field9602;
         this.field9696.method4363(arg2, arg1, arg3, false, arg0);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9864[82] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(II[I[I)Laa;"
   )
   public final class516 method604(int arg0, int arg1, int[] arg2, int[] arg3) {
      try {
         ++field9630;
         return class93.method874(arg0, arg3, arg1, (byte)-102, arg2, this);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9864[190] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9864[1] : field9864[3]) + ',' + (arg3 != null ? field9864[1] : field9864[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "l",
      descriptor = "()Z"
   )
   public final boolean method498() {
      try {
         ++field9507;
         return true;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[185] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "p",
      descriptor = "(I)V"
   )
   private final void method4909(int arg0) {
      try {
         this.field9516.method4749();
         ++field9590;
         if (arg0 != 1) {
            this.method4865(-79, 34, (byte)-5);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[62] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "j",
      descriptor = "(B)V"
   )
   private final void method4910(byte arg0) {
      try {
         class764.field11037[1] = this.field9808 * this.field9795;
         class764.field11037[3] = 1.0F;
         class764.field11037[0] = this.field9825 * this.field9808;
         class764.field11037[2] = this.field9808 * this.field9805;
         ++field9548;
         if (arg0 != 118) {
            this.method598((class478)null);
         }

         OpenGL.glLightModelfv(2899, class764.field11037, 0);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[188] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(Ljea;I)V"
   )
   public final void method555(class478 arg0, int arg1) {
      try {
         ++field9604;
         this.field9702.method3924(-33, this, arg0, arg1);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[220] + (arg0 != null ? field9864[1] : field9864[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(Lvp;IIII)Lka;"
   )
   public final class501 method573(class200 arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field9528;
         return new class271(this, arg0, arg1, arg3, arg4, arg2);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field9864[24] + (arg0 != null ? field9864[1] : field9864[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "c",
      descriptor = "(ZI)V"
   )
   public final void method4911(boolean arg0, int arg1) {
      try {
         if (this.field9791 == !arg0) {
            this.field9791 = arg0;
            this.method4895(-94);
            this.field9738 &= -8;
         }

         ++field9676;
         if (arg1 != -8) {
            this.method516(73, (class516)null, 10, -25);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[178] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "b",
      descriptor = "()Lkh;"
   )
   public final class17 method507() {
      try {
         ++field9681;
         return this.field9737;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[100] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(IIZ)Lbo;"
   )
   public final class763 method605(int arg0, int arg1, boolean arg2) {
      try {
         ++field9592;
         return new class280(this, arg0, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field9864[72] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "m",
      descriptor = "(II)V"
   )
   public final void method4912(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field9635;
         if (~this.field9739 != ~arg1) {
            boolean var4;
            boolean var5;
            byte var6;
            label102: {
               if (arg1 != 1) {
                  if (~arg1 == -3) {
                     var4 = true;
                     var5 = false;
                     var6 = 2;
                     if (!var3) {
                        break label102;
                     }
                  }

                  if (arg1 != 128) {
                     var6 = 0;
                     var4 = true;
                     var5 = false;
                     if (!var3) {
                        break label102;
                     }
                  }

                  var5 = true;
                  var6 = 3;
                  var4 = true;
                  if (!var3) {
                     break label102;
                  }
               }

               var6 = 1;
               var5 = true;
               var4 = true;
            }

            if (!var4 == this.field9742) {
               OpenGL.glColorMask(var4, var4, var4, true);
               this.field9742 = var4;
            }

            if (!var5 != !this.field9736) {
               label85: {
                  if (!var5) {
                     OpenGL.glDisable(3008);
                     if (!var3) {
                        break label85;
                     }
                  }

                  OpenGL.glEnable(3008);
               }

               this.field9736 = var5;
            }

            if (this.field9744 != var6) {
               label113: {
                  if (var6 == 1) {
                     OpenGL.glEnable(3042);
                     OpenGL.glBlendFunc(770, 771);
                     if (!var3) {
                        break label113;
                     }
                  }

                  if (~var6 == -3) {
                     OpenGL.glEnable(3042);
                     OpenGL.glBlendFunc(1, 1);
                     if (!var3) {
                        break label113;
                     }
                  }

                  if (var6 == 3) {
                     OpenGL.glEnable(3042);
                     OpenGL.glBlendFunc(774, 1);
                     if (!var3) {
                        break label113;
                     }
                  }

                  OpenGL.glDisable(3042);
               }

               this.field9744 = var6;
            }

            this.field9738 &= -29;
            this.field9739 = arg1;
         }

         if (arg0 != 1) {
            this.method503(115, 92);
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field9864[49] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(ZZZI)V"
   )
   public final void method4913(boolean arg0, boolean arg1, boolean arg2, int arg3) {
      boolean var5 = client.field4273;

      try {
         ++field9547;
         if (this.field9818 != arg3 || !this.field9854 != !this.field9830) {
            class684 var6;
            int var7;
            byte var8;
            int var9;
            int var10;
            label77: {
               var6 = null;
               var7 = 0;
               var8 = 0;
               var9 = 0;
               var10 = this.field9830 ? 3 : 0;
               if (arg3 < 0) {
                  this.method4847((byte)96);
                  if (!var5) {
                     break label77;
                  }
               }

               class359 var11;
               label89: {
                  var6 = this.field9703.method2864(0, arg3);
                  var11 = super.field726.method1293(arg3, -5150);
                  if (~var11.field5101 != -1 || ~var11.field5103 != -1) {
                     int var12 = var11.field5116 ? 64 : 128;
                     int var13 = var12 * 50;
                     this.method4849(0.0F, (float)(this.field9711 % var13 * var11.field5103) / (float)var13, 255, (float)(this.field9711 % var13 * var11.field5101) / (float)var13);
                     if (!var5) {
                        break label89;
                     }
                  }

                  this.method4847((byte)26);
               }

               var7 = var11.field5098;
               if (!this.field9830) {
                  var8 = var11.field5104;
                  var10 = var11.field5114;
                  var9 = var11.field5100;
               }
            }

            this.field9699.method101(Integer.MAX_VALUE, var10, var8, var9, arg0, arg1);
            if (!this.field9699.method102(var6, true, var7)) {
               this.method4848(false, var6);
               this.method4879(0, var7);
            }

            this.field9818 = arg3;
            this.field9854 = this.field9830;
         }

         if (arg2) {
            this.method546();
         }

         this.field9738 &= -8;
      } catch (RuntimeException var15) {
         throw class534.method3846(var15, field9864[189] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "w",
      descriptor = "()I"
   )
   public final int method500() {
      try {
         ++field9704;
         return 4;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[169] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(Lza;)V"
   )
   public final void method586(class438 arg0) {
      try {
         this.field9714 = ((class233)arg0).field2885;
         ++field9535;
         if (this.field9748 == null) {
            class608 var2;
            label26: {
               var2 = new class608(80);
               if (this.field9773) {
                  var2.method4443(-96, -1.0F);
                  var2.method4443(-97, -1.0F);
                  var2.method4443(-107, 0.0F);
                  var2.method4443(-121, 0.0F);
                  var2.method4443(-117, 1.0F);
                  var2.method4443(-128, 1.0F);
                  var2.method4443(-116, -1.0F);
                  var2.method4443(-64, 0.0F);
                  var2.method4443(-89, 1.0F);
                  var2.method4443(-126, 1.0F);
                  var2.method4443(-82, 1.0F);
                  var2.method4443(-87, 1.0F);
                  var2.method4443(-74, 0.0F);
                  var2.method4443(-120, 1.0F);
                  var2.method4443(-120, 0.0F);
                  var2.method4443(-114, -1.0F);
                  var2.method4443(-69, 1.0F);
                  var2.method4443(-82, 0.0F);
                  var2.method4443(-116, 0.0F);
                  var2.method4443(-125, 0.0F);
                  if (!client.field4273) {
                     break label26;
                  }
               }

               var2.method4439(-865887192, -1.0F);
               var2.method4439(-865887192, -1.0F);
               var2.method4439(-865887192, 0.0F);
               var2.method4439(-865887192, 0.0F);
               var2.method4439(-865887192, 1.0F);
               var2.method4439(-865887192, 1.0F);
               var2.method4439(-865887192, -1.0F);
               var2.method4439(-865887192, 0.0F);
               var2.method4439(-865887192, 1.0F);
               var2.method4439(-865887192, 1.0F);
               var2.method4439(-865887192, 1.0F);
               var2.method4439(-865887192, 1.0F);
               var2.method4439(-865887192, 0.0F);
               var2.method4439(-865887192, 1.0F);
               var2.method4439(-865887192, 0.0F);
               var2.method4439(-865887192, -1.0F);
               var2.method4439(-865887192, 1.0F);
               var2.method4439(-865887192, 0.0F);
               var2.method4439(-865887192, 0.0F);
               var2.method4439(-865887192, 0.0F);
            }

            this.field9748 = this.method4835(false, var2.field8227, var2.field8243, (byte)85, 20);
            this.field9799 = new class178(this.field9748, 5126, 3, 0);
            this.field9853 = new class178(this.field9748, 5126, 2, 12);
            this.field9702.method3922((byte)57, this);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[89] + (arg0 != null ? field9864[1] : field9864[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "JA",
      descriptor = "(IIIIII)I"
   )
   public final int method522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var7 = client.field4273;

      try {
         ++field9502;
         int var8 = 0;
         float var9 = (float)arg2 * this.field9737.field7217 + (float)arg0 * this.field9737.field7227 + (float)arg1 * this.field9737.field7221 + this.field9737.field7251;
         if (var9 < 1.0F) {
            var9 = 1.0F;
         }

         float var10 = (float)arg5 * this.field9737.field7217 + (float)arg3 * this.field9737.field7227 + (float)arg4 * this.field9737.field7221 + this.field9737.field7251;
         if (var10 < 1.0F) {
            var10 = 1.0F;
         }

         label77: {
            if (!(var9 < (float)this.field9842) || !((float)this.field9842 > var10)) {
               if (!((float)this.field9856 < var9) || !(var10 > (float)this.field9856)) {
                  break label77;
               }

               var8 |= 32;
               if (!var7) {
                  break label77;
               }
            }

            var8 |= 16;
         }

         label55: {
            int var11 = (int)(((float)arg2 * this.field9737.field7248 + (float)arg0 * this.field9737.field7230 + (float)arg1 * this.field9737.field7244 + this.field9737.field7233) * (float)this.field9835 / var9);
            int var12 = (int)(((float)arg5 * this.field9737.field7248 + (float)arg3 * this.field9737.field7230 + (float)arg4 * this.field9737.field7244 + this.field9737.field7233) * (float)this.field9835 / var10);
            if ((float)var11 < this.field9760 && this.field9760 > (float)var12) {
               var8 |= 1;
               if (!var7) {
                  break label55;
               }
            }

            if (this.field9849 < (float)var11 && this.field9849 < (float)var12) {
               var8 |= 2;
            }
         }

         int var13 = (int)(((float)arg2 * this.field9737.field7231 + (float)arg0 * this.field9737.field7226 + (float)arg1 * this.field9737.field7238 + this.field9737.field7242) * (float)this.field9753 / var9);
         int var14 = (int)(((float)arg5 * this.field9737.field7231 + (float)arg3 * this.field9737.field7226 + (float)arg4 * this.field9737.field7238 + this.field9737.field7242) * (float)this.field9753 / var10);
         if (this.field9816 > (float)var13 && (float)var14 < this.field9816) {
            var8 |= 4;
            if (!var7) {
               return var8;
            }
         }

         if (this.field9821 < (float)var13 && this.field9821 < (float)var14) {
            var8 |= 8;
         }

         return var8;
      } catch (RuntimeException var16) {
         throw class534.method3846(var16, field9864[212] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(ILhd;)V"
   )
   public final void method4914(int arg0, class776 arg1) {
      try {
         ++field9627;
         if (~this.field9722 <= -1 && this.field9724[this.field9722] == arg1) {
            this.field9724[this.field9722--] = null;
            arg1.method2450((byte)90);
            if (arg0 >= ~this.field9722) {
               this.field9720 = this.field9724[this.field9722];
               this.field9720.method2457((byte)116);
            } else {
               this.field9720 = null;
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[127] + arg0 + ',' + (arg1 != null ? field9864[1] : field9864[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "()Z"
   )
   public final boolean method551() {
      try {
         ++field9608;
         if (this.field9697 != null) {
            if (!this.field9697.method1709(43)) {
               if (!this.field9696.method4371(this.field9697, 0)) {
                  return false;
               }

               this.field9703.method2862(-15959);
            }

            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[40] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V"
   )
   public final void method504(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class516 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      boolean var13 = client.field4273;

      try {
         ++field9531;
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
               class111 var14 = (class111)arg6;
               class40 var15 = var14.field1402;
               this.method4892(true);
               this.method4848(false, var14.field1402);
               this.method4912(1, arg5);
               this.method4862(8448, 7681, 28);
               this.method4901(768, 0, 34167, 5);
               var16 = var15.field467 / (float)var15.field470;
               var17 = var15.field461 / (float)var15.field458;
               float var18 = (float)(-arg0) + (float)arg2;
               float var19 = (float)arg3 - (float)arg1;
               float var20 = (float)(1.0D / Math.sqrt((double)(var18 * var18 + var19 * var19)));
               OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
               var21 = var19 * var20;
               var22 = var18 * var20;
               int var35 = arg11 % (arg9 + arg10);
               var23 = (float)arg9 * var22;
               var24 = (float)arg9 * var21;
               var25 = 0.0F;
               var26 = 0.0F;
               var27 = var23;
               var28 = var24;
               if (~var35 >= ~arg9) {
                  var28 = (float)(arg9 - var35) * var21;
                  var27 = (float)(arg9 - var35) * var22;
                  if (!var13) {
                     break label87;
                  }
               }

               var25 = (float)(arg9 + arg10 + -var35) * var22;
               var26 = (float)(arg9 + arg10 + -var35) * var21;
            }

            float var29 = (float)arg0 + 0.35F + var25;
            float var30 = (float)arg1 + 0.35F + var26;
            float var31 = (float)arg10 * var22;
            float var32 = (float)arg10 * var21;

            do {
               label94: {
                  int var10000;
                  label78: {
                     if (arg0 < arg2) {
                        float var36;
                        var10000 = (var36 = var29 - ((float)arg2 + 0.35F)) == 0.0F ? 0 : (var36 < 0.0F ? -1 : 1);
                        if (var13) {
                           break label78;
                        }

                        if (var10000 > 0) {
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

                  if (var27 + var29 < (float)arg2) {
                     var27 = (float)arg2 - var29;
                  }
               }

               label96: {
                  if (~arg1 > ~arg3) {
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

                  if (var30 < (float)arg3 + 0.35F) {
                     break;
                  }

                  if (var28 + var30 < (float)arg3) {
                     var28 = (float)arg3 + -var30;
                  }
               }

               OpenGL.glBegin(1);
               OpenGL.glTexCoord2f(((float)(-arg7) + var29) * var16, (var30 - (float)arg8) * var17);
               OpenGL.glVertex2f(var29, var30);
               OpenGL.glTexCoord2f((var27 + var29 - (float)arg7) * var16, (var28 + var30 - (float)arg8) * var17);
               OpenGL.glVertex2f(var27 + var29, var28 + var30);
               OpenGL.glEnd();
               var30 += var28 + var32;
               var29 += var27 + var31;
               var28 = var24;
               var27 = var23;
            } while(!var13);

            this.method4901(768, 0, 5890, 5);
         }
      } catch (RuntimeException var34) {
         throw class534.method3846(var34, field9864[32] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field9864[1] : field9864[3]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "t",
      descriptor = "(I)V"
   )
   private final void method4915(int arg0) {
      try {
         this.field9816 = (float)(this.field9804 - this.field9754);
         this.field9849 = (float)(-this.field9823 + this.field9827);
         this.field9760 = (float)(this.field9750 - this.field9823);
         ++field9499;
         this.field9821 = (float)(this.field9841 - this.field9754);
         if (arg0 != -1) {
            this.method569(-61, 43, -128, 91, -60, 13, -102);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[99] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(IIIIIF)Loda;"
   )
   public final class127 method591(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      try {
         ++field9607;
         return new class39(arg0, arg1, arg2, arg3, arg4, arg5);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field9864[53] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public final void method584(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      boolean var10 = client.field4273;

      try {
         ++field9529;
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
               this.method4854(-4);
               this.method4912(1, arg5);
               float var11 = (float)(-arg0) + (float)arg2;
               float var12 = (float)(-arg1) + (float)arg3;
               float var13 = (float)(1.0D / Math.sqrt((double)(var11 * var11 + var12 * var12)));
               var14 = var12 * var13;
               OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
               var15 = var11 * var13;
               int var28 = arg8 % (arg6 + arg7);
               var16 = (float)arg6 * var15;
               var17 = (float)arg6 * var14;
               var18 = 0.0F;
               var19 = 0.0F;
               var20 = var16;
               var21 = var17;
               if (~var28 < ~arg6) {
                  var19 = (float)(arg6 - -arg7 + -var28) * var14;
                  var18 = (float)(arg6 - (-arg7 + var28)) * var15;
                  if (!var10) {
                     break label79;
                  }
               }

               var20 = (float)(arg6 - var28) * var15;
               var21 = (float)(-var28 + arg6) * var14;
            }

            float var22 = (float)arg0 + 0.35F + var18;
            float var23 = (float)arg1 + 0.35F + var19;
            float var24 = (float)arg7 * var15;
            float var25 = (float)arg7 * var14;

            do {
               label86: {
                  int var10000;
                  label70: {
                     if (arg0 < arg2) {
                        float var29;
                        var10000 = (var29 = var22 - ((float)arg2 + 0.35F)) == 0.0F ? 0 : (var29 < 0.0F ? -1 : 1);
                        if (var10) {
                           break label70;
                        }

                        if (var10000 > 0) {
                           break;
                        }

                        if (!(var20 + var22 > (float)arg2)) {
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

                  if (var10000 > 0) {
                     break;
                  }

                  if (var20 + var22 < (float)arg2) {
                     var20 = (float)arg2 + -var22;
                  }
               }

               label88: {
                  if (~arg1 > ~arg3) {
                     if ((float)arg3 + 0.35F < var23) {
                        break;
                     }

                     if (!((float)arg3 < var21 + var23)) {
                        break label88;
                     }

                     var21 = (float)arg3 + -var23;
                     if (!var10) {
                        break label88;
                     }
                  }

                  if ((float)arg3 + 0.35F > var23) {
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
               var20 = var16;
               var21 = var17;
            } while(!var10);

         }
      } catch (RuntimeException var27) {
         throw class534.method3846(var27, field9864[123] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(Lmp;Ldw;)Lg;"
   )
   public final class165 method495(class796 arg0, class751 arg1) {
      try {
         ++field9581;
         return null;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9864[116] + (arg0 != null ? field9864[1] : field9864[3]) + ',' + (arg1 != null ? field9864[1] : field9864[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "u",
      descriptor = "()V"
   )
   public final void method519() {
      try {
         ++field9522;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9864[66] + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method580(int arg0) {
      try {
         ++field9615;
         this.method4870(-114);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9864[171] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "e",
      descriptor = "(II)V"
   )
   public final void method542(int arg0, int arg1) throws class265 {
      try {
         ++field9597;

         try {
            this.field9516.swapBuffers();
         } catch (Exception var4) {
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field9864[23] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4916(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!or",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4917(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 50;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
