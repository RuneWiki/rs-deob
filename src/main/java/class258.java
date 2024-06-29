import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import jagex3.graphics2.hw.NativeInterface;
import java.awt.Canvas;
import java.awt.Dimension;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public abstract class class258 extends class610 {
   @OriginalMember(
      owner = "client!mu",
      name = "ff",
      descriptor = "Lsn;"
   )
   private class675 field3982;
   @OriginalMember(
      owner = "client!mu",
      name = "Vc",
      descriptor = "Z"
   )
   public boolean field4123;
   @OriginalMember(
      owner = "client!mu",
      name = "Md",
      descriptor = "Lkr;"
   )
   public class504 field4121;
   @OriginalMember(
      owner = "client!mu",
      name = "me",
      descriptor = "Lkr;"
   )
   public class504 field4136;
   @OriginalMember(
      owner = "client!mu",
      name = "sc",
      descriptor = "Lkr;"
   )
   public class504 field4138;
   @OriginalMember(
      owner = "client!mu",
      name = "mf",
      descriptor = "Lkr;"
   )
   public class504 field4139;
   @OriginalMember(
      owner = "client!mu",
      name = "z",
      descriptor = "Lkr;"
   )
   private class504 field4140;
   @OriginalMember(
      owner = "client!mu",
      name = "yc",
      descriptor = "Lkr;"
   )
   private class504 field4141;
   @OriginalMember(
      owner = "client!mu",
      name = "vc",
      descriptor = "I"
   )
   private int field4149;
   @OriginalMember(
      owner = "client!mu",
      name = "gc",
      descriptor = "Z"
   )
   public boolean field4163;
   @OriginalMember(
      owner = "client!mu",
      name = "ve",
      descriptor = "[F"
   )
   private float[] field4142;
   @OriginalMember(
      owner = "client!mu",
      name = "je",
      descriptor = "I"
   )
   public int field4147;
   @OriginalMember(
      owner = "client!mu",
      name = "Ub",
      descriptor = "I"
   )
   public int field4165;
   @OriginalMember(
      owner = "client!mu",
      name = "dc",
      descriptor = "Z"
   )
   public boolean field4179;
   @OriginalMember(
      owner = "client!mu",
      name = "Sd",
      descriptor = "Z"
   )
   private boolean field4176;
   @OriginalMember(
      owner = "client!mu",
      name = "Rc",
      descriptor = "Z"
   )
   private boolean field4181;
   @OriginalMember(
      owner = "client!mu",
      name = "X",
      descriptor = "Lfja;"
   )
   public class4 field4188;
   @OriginalMember(
      owner = "client!mu",
      name = "Dg",
      descriptor = "F"
   )
   public float field4148;
   @OriginalMember(
      owner = "client!mu",
      name = "cb",
      descriptor = "I"
   )
   public int field4174;
   @OriginalMember(
      owner = "client!mu",
      name = "Cd",
      descriptor = "Z"
   )
   private boolean field4182;
   @OriginalMember(
      owner = "client!mu",
      name = "Y",
      descriptor = "I"
   )
   public int field4172;
   @OriginalMember(
      owner = "client!mu",
      name = "Ud",
      descriptor = "I"
   )
   private int field4196;
   @OriginalMember(
      owner = "client!mu",
      name = "P",
      descriptor = "I"
   )
   public int field4193;
   @OriginalMember(
      owner = "client!mu",
      name = "cf",
      descriptor = "F"
   )
   public float field4197;
   @OriginalMember(
      owner = "client!mu",
      name = "fb",
      descriptor = "[F"
   )
   private float[] field4164;
   @OriginalMember(
      owner = "client!mu",
      name = "ob",
      descriptor = "I"
   )
   private int field4200;
   @OriginalMember(
      owner = "client!mu",
      name = "bg",
      descriptor = "I"
   )
   public int field4184;
   @OriginalMember(
      owner = "client!mu",
      name = "wg",
      descriptor = "I"
   )
   private int field4204;
   @OriginalMember(
      owner = "client!mu",
      name = "fe",
      descriptor = "I"
   )
   private int field4170;
   @OriginalMember(
      owner = "client!mu",
      name = "Nf",
      descriptor = "[F"
   )
   public float[] field4203;
   @OriginalMember(
      owner = "client!mu",
      name = "sd",
      descriptor = "F"
   )
   public float field4160;
   @OriginalMember(
      owner = "client!mu",
      name = "Rf",
      descriptor = "F"
   )
   public float field4213;
   @OriginalMember(
      owner = "client!mu",
      name = "y",
      descriptor = "I"
   )
   public int field4166;
   @OriginalMember(
      owner = "client!mu",
      name = "T",
      descriptor = "[F"
   )
   private float[] field4186;
   @OriginalMember(
      owner = "client!mu",
      name = "db",
      descriptor = "F"
   )
   public float field4177;
   @OriginalMember(
      owner = "client!mu",
      name = "nb",
      descriptor = "I"
   )
   public int field4143;
   @OriginalMember(
      owner = "client!mu",
      name = "Od",
      descriptor = "I"
   )
   public int field4199;
   @OriginalMember(
      owner = "client!mu",
      name = "sb",
      descriptor = "I"
   )
   public int field4212;
   @OriginalMember(
      owner = "client!mu",
      name = "zg",
      descriptor = "I"
   )
   public int field4216;
   @OriginalMember(
      owner = "client!mu",
      name = "Gd",
      descriptor = "Z"
   )
   public boolean field4214;
   @OriginalMember(
      owner = "client!mu",
      name = "Me",
      descriptor = "I"
   )
   public int field4159;
   @OriginalMember(
      owner = "client!mu",
      name = "zc",
      descriptor = "[F"
   )
   private float[] field4209;
   @OriginalMember(
      owner = "client!mu",
      name = "yg",
      descriptor = "I"
   )
   private int field4167;
   @OriginalMember(
      owner = "client!mu",
      name = "Wc",
      descriptor = "I"
   )
   public int field4178;
   @OriginalMember(
      owner = "client!mu",
      name = "eg",
      descriptor = "Z"
   )
   private boolean field4180;
   @OriginalMember(
      owner = "client!mu",
      name = "fg",
      descriptor = "F"
   )
   public float field4194;
   @OriginalMember(
      owner = "client!mu",
      name = "Fe",
      descriptor = "F"
   )
   private float field4224;
   @OriginalMember(
      owner = "client!mu",
      name = "zf",
      descriptor = "Z"
   )
   public boolean field4223;
   @OriginalMember(
      owner = "client!mu",
      name = "wd",
      descriptor = "[Llga;"
   )
   private class550[] field4229;
   @OriginalMember(
      owner = "client!mu",
      name = "xb",
      descriptor = "I"
   )
   private int field4210;
   @OriginalMember(
      owner = "client!mu",
      name = "Ff",
      descriptor = "I"
   )
   public int field4221;
   @OriginalMember(
      owner = "client!mu",
      name = "lc",
      descriptor = "I"
   )
   public int field4191;
   @OriginalMember(
      owner = "client!mu",
      name = "Ab",
      descriptor = "I"
   )
   public int field4201;
   @OriginalMember(
      owner = "client!mu",
      name = "Mf",
      descriptor = "F"
   )
   public float field4211;
   @OriginalMember(
      owner = "client!mu",
      name = "ef",
      descriptor = "[F"
   )
   public float[] field4226;
   @OriginalMember(
      owner = "client!mu",
      name = "bb",
      descriptor = "I"
   )
   public int field4169;
   @OriginalMember(
      owner = "client!mu",
      name = "pf",
      descriptor = "Z"
   )
   private boolean field4236;
   @OriginalMember(
      owner = "client!mu",
      name = "U",
      descriptor = "I"
   )
   public int field4219;
   @OriginalMember(
      owner = "client!mu",
      name = "md",
      descriptor = "I"
   )
   private int field4217;
   @OriginalMember(
      owner = "client!mu",
      name = "Lc",
      descriptor = "Z"
   )
   public boolean field4202;
   @OriginalMember(
      owner = "client!mu",
      name = "M",
      descriptor = "Z"
   )
   public boolean field4239;
   @OriginalMember(
      owner = "client!mu",
      name = "oc",
      descriptor = "Z"
   )
   public boolean field4238;
   @OriginalMember(
      owner = "client!mu",
      name = "Cg",
      descriptor = "Z"
   )
   public boolean field4206;
   @OriginalMember(
      owner = "client!mu",
      name = "nc",
      descriptor = "I"
   )
   private int field4231;
   @OriginalMember(
      owner = "client!mu",
      name = "B",
      descriptor = "F"
   )
   public float field4161;
   @OriginalMember(
      owner = "client!mu",
      name = "Rb",
      descriptor = "Z"
   )
   private boolean field4233;
   @OriginalMember(
      owner = "client!mu",
      name = "af",
      descriptor = "Llea;"
   )
   public class625 field4240;
   @OriginalMember(
      owner = "client!mu",
      name = "ae",
      descriptor = "[F"
   )
   private float[] field4222;
   @OriginalMember(
      owner = "client!mu",
      name = "tg",
      descriptor = "[F"
   )
   public float[] field4154;
   @OriginalMember(
      owner = "client!mu",
      name = "Ac",
      descriptor = "[F"
   )
   private float[] field4230;
   @OriginalMember(
      owner = "client!mu",
      name = "v",
      descriptor = "I"
   )
   public int field4241;
   @OriginalMember(
      owner = "client!mu",
      name = "wb",
      descriptor = "Z"
   )
   public boolean field4242;
   @OriginalMember(
      owner = "client!mu",
      name = "Gb",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field4225;
   @OriginalMember(
      owner = "client!mu",
      name = "Hc",
      descriptor = "Lkr;"
   )
   private class504 field4262;
   @OriginalMember(
      owner = "client!mu",
      name = "Bg",
      descriptor = "Ljava/awt/Canvas;"
   )
   public Canvas field4066;
   @OriginalMember(
      owner = "client!mu",
      name = "ud",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field3958;
   @OriginalMember(
      owner = "client!mu",
      name = "He",
      descriptor = "Lrr;"
   )
   public class678 field3948;
   @OriginalMember(
      owner = "client!mu",
      name = "Yf",
      descriptor = "I"
   )
   public int field4187;
   @OriginalMember(
      owner = "client!mu",
      name = "vb",
      descriptor = "Ljava/lang/Object;"
   )
   public Object field4086;
   @OriginalMember(
      owner = "client!mu",
      name = "w",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field3994;
   @OriginalMember(
      owner = "client!mu",
      name = "Pb",
      descriptor = "I"
   )
   public int field4192;
   @OriginalMember(
      owner = "client!mu",
      name = "Qf",
      descriptor = "I"
   )
   private int field4026;
   @OriginalMember(
      owner = "client!mu",
      name = "We",
      descriptor = "I"
   )
   public int field3975;
   @OriginalMember(
      owner = "client!mu",
      name = "ne",
      descriptor = "I"
   )
   private int field3963;
   @OriginalMember(
      owner = "client!mu",
      name = "mb",
      descriptor = "I"
   )
   public int field3960;
   @OriginalMember(
      owner = "client!mu",
      name = "ib",
      descriptor = "Lnw;"
   )
   private class75 field4234;
   @OriginalMember(
      owner = "client!mu",
      name = "og",
      descriptor = "Ljagex3/graphics2/hw/NativeInterface;"
   )
   public NativeInterface field3961;
   @OriginalMember(
      owner = "client!mu",
      name = "Gg",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4267 = new String[]{method2258(method2257("*sS7Yo")), method2258(method2257(")s\u0011\u001c")), method2258(method2257("<(S^b")), method2258(method2257("*sS\"\\o")), method2258(method2257("*sS6Vo")), method2258(method2257("*sS\"Wo")), method2258(method2257("*sS'Vo")), method2258(method2257("*sS&Yo")), method2258(method2257("*sS=Xo")), method2258(method2257("*sS'Yo")), method2258(method2257("*sS\b~o")), method2258(method2257("*sS8Yo")), method2258(method2257("*sS$Wo")), method2258(method2257("*sS2Zo")), method2258(method2257("*sS\u0002~o")), method2258(method2257("*sS\u00167")), method2258(method2257("*sS!Vo")), method2258(method2257("*sS5Xo")), method2258(method2257("*sS2\\o")), method2258(method2257("*sS Yo")), method2258(method2257("*sS&Xo")), method2258(method2257("*sS!Xo")), method2258(method2257("*sS:Xo")), method2258(method2257("*sS!Uo")), method2258(method2257("*sS>Yo")), method2258(method2257("*sS?Yo")), method2258(method2257("*sS5\\o")), method2258(method2257("*sS:Uo")), method2258(method2257("*sS\u0011~o")), method2258(method2257("*sS:Vo")), method2258(method2257("*sS3\\o")), method2258(method2257("*sS6Yo")), method2258(method2257("*sS37")), method2258(method2257("*sS6Uo")), method2258(method2257("*sS Xo")), method2258(method2257("*sS?Xo")), method2258(method2257("*sS7Xo")), method2258(method2257("*sS9Xo")), method2258(method2257("*sS\u00027")), method2258(method2257("*sS)7")), method2258(method2257("*sS3Uo")), method2258(method2257("*sS47")), method2258(method2257("*sS<Vo")), method2258(method2257("*sS5Zo")), method2258(method2257("*sS!^o")), method2258(method2257("*sS8Xo")), method2258(method2257("*sS'Uo")), method2258(method2257("*sS2Wo")), method2258(method2257("*sS&Vo")), method2258(method2257("*sS1Zo")), method2258(method2257("*sS=7")), method2258(method2257("*sS\n~o")), method2258(method2257("*sS#7")), method2258(method2257("*sS\"Uo")), method2258(method2257("*sS$Uo")), method2258(method2257("*sS%Wo")), method2258(method2257("*sS4Yo")), method2258(method2257("*sS87")), method2258(method2257("*sS\"Vo")), method2258(method2257("*sS=[o")), method2258(method2257("*sS#Uo")), method2258(method2257("*sS$7")), method2258(method2257("*sS3Xo")), method2258(method2257("*sS%Vo")), method2258(method2257("3d\u0014")), method2258(method2257("+u\n\u0000mgv\u0012\u0003%")), method2258(method2257("gv\u000e\u0019e\"<")), method2258(method2257("2h\u0007\u0011o")), method2258(method2257("(v\u0018\u001el)")), method2258(method2257("%j\u001c\u001etiq\u000e")), method2258(method2257("+u\n\u0000?7i\u000eJ")), method2258(method2257("+i\u001a\u0017z#o\u0013")), method2258(method2257("=g\r")), method2258(method2257("-g\u001a\u0004w\"i\u000f\u0011")), method2258(method2257("\u000bi\u001a\u0019qgu\t\u0015og7EPq(r]\u0006~+o\u0019Py(t]\u0000z)b\u0014\u001ex\u0015c\u000e\u0000p)u\u0018M")), method2258(method2257("*sS4Uo")), method2258(method2257("*sS#Zo")), method2258(method2257("*sS [o")), method2258(method2257("*sS\u0014~o")), method2258(method2257("*sS9Vo")), method2258(method2257("*sS8]o")), method2258(method2257("*sS3To")), method2258(method2257("*sS#Vo")), method2258(method2257("*sS2Yo")), method2258(method2257("*sS4Vo")), method2258(method2257("*sS:Zo")), method2258(method2257("*sS=Vo")), method2258(method2257("*sS;Uo")), method2258(method2257("*sS!7")), method2258(method2257("*sS>Xo")), method2258(method2257("*sS9Yo")), method2258(method2257("*sS\u00197")), method2258(method2257("*sS!Zo")), method2258(method2257("*sS?Vo")), method2258(method2257("*sS Vo")), method2258(method2257("*sS\u001c~o")), method2258(method2257("*sS'Xo")), method2258(method2257("*sS3Vo")), method2258(method2257("*sS57")), method2258(method2257("*sS%[o")), method2258(method2257("*sS5Uo")), method2258(method2257("*sS$Vo")), method2258(method2257("*sS(^o")), method2258(method2257("*sS=Yo")), method2258(method2257("*sS!Yo")), method2258(method2257("*sS$\\o")), method2258(method2257("*sS5]o")), method2258(method2257("*sS4Zo")), method2258(method2257("*sS2Vo")), method2258(method2257("*sS=]o")), method2258(method2257("*sS2To")), method2258(method2257("*sS?[o")), method2258(method2257("*sS4Xo")), method2258(method2257("*sS17")), method2258(method2257("*sS#[o")), method2258(method2257("*sS7Vo")), method2258(method2257("*sS<\\o")), method2258(method2257("*sS*^o")), method2258(method2257("*sS1Uo")), method2258(method2257("*sS#Xo")), method2258(method2257("*sS=\\o")), method2258(method2257("*sS;Vo")), method2258(method2257("*sS%Xo")), method2258(method2257("*sS\u0000~o")), method2258(method2257("*sS1Vo")), method2258(method2257("*sS>Uo")), method2258(method2257("*sS;Xo")), method2258(method2257("*sS2Xo")), method2258(method2257("*sS<]o")), method2258(method2257("*sS'Wo")), method2258(method2257("*sS<7")), method2258(method2257("*sS;\\o")), method2258(method2257("*sS?7")), method2258(method2257("*sS1Xo")), method2258(method2257("*sS:Yo")), method2258(method2257("*sS<Uo")), method2258(method2257("*sS![o")), method2258(method2257("*sS7Uo")), method2258(method2257("*sS&Wo")), method2258(method2257("*sS<Yo")), method2258(method2257("*sS#\\o")), method2258(method2257("*sS2Uo")), method2258(method2257("*sS6[o")), method2258(method2257("*sS6Xo")), method2258(method2257("*sS 7")), method2258(method2257("*sSLv)o\tN7")), method2258(method2257("*sS%Yo")), method2258(method2257("*sS9]o")), method2258(method2257("*sS>Vo")), method2258(method2257("*sS;7")), method2258(method2257("*sS8^o")), method2258(method2257("*sS1Wo")), method2258(method2257("*sS#Yo")), method2258(method2257("*sS;^o")), method2258(method2257("*sS:^o")), method2258(method2257("*sS:7")), method2258(method2257("*sS7\\o")), method2258(method2257("*sS4^o")), method2258(method2257("*sS$Xo")), method2258(method2257("*sS#Wo")), method2258(method2257("*sS Uo")), method2258(method2257("*sS>[o")), method2258(method2257("*sS(7")), method2258(method2257("*sS#]o")), method2258(method2257("*sS5Vo")), method2258(method2257("*sS8Uo")), method2258(method2257("4c\t9x)i\u000f\u0015M\"v\u001c\u0019q3")), method2258(method2257("-g\u000b\u00111&q\t^\\&h\u000b\u0011l")), method2258(method2257("*sS3]o")), method2258(method2257("*sS?Uo")), method2258(method2257("*sS5^o")), method2258(method2257("*sS9Uo")), method2258(method2257("*sS8Vo")), method2258(method2257("*sS>\\o")), method2258(method2257("*sS5[o")), method2258(method2257("*sS=Uo")), method2258(method2257("*sS%Uo")), method2258(method2257("*sS&Uo")), method2258(method2257("*sS\"Yo")), method2258(method2257("*sS&^o")), method2258(method2257("*sS1To")), method2258(method2257("*sS8[o")), method2258(method2257("*sS%7")), method2258(method2257("*sS$Yo")), method2258(method2257("*sS9\\o")), method2258(method2257("*sS8Zo")), method2258(method2257("*sS;Yo"))};
   @OriginalMember(
      owner = "client!mu",
      name = "yf",
      descriptor = "I"
   )
   public static int field3981 = 328;
   @OriginalMember(
      owner = "client!mu",
      name = "lg",
      descriptor = "[I"
   )
   public static int[] field4043 = new int[2];
   @OriginalMember(
      owner = "client!mu",
      name = "Xc",
      descriptor = "F"
   )
   public float field4151;
   @OriginalMember(
      owner = "client!mu",
      name = "Q",
      descriptor = "F"
   )
   private float field4152;
   @OriginalMember(
      owner = "client!mu",
      name = "pe",
      descriptor = "F"
   )
   public float field4156;
   @OriginalMember(
      owner = "client!mu",
      name = "Be",
      descriptor = "F"
   )
   private float field4162;
   @OriginalMember(
      owner = "client!mu",
      name = "ag",
      descriptor = "F"
   )
   public float field4168;
   @OriginalMember(
      owner = "client!mu",
      name = "Xe",
      descriptor = "F"
   )
   public float field4175;
   @OriginalMember(
      owner = "client!mu",
      name = "Z",
      descriptor = "F"
   )
   public float field4207;
   @OriginalMember(
      owner = "client!mu",
      name = "vg",
      descriptor = "F"
   )
   public float field4228;
   @OriginalMember(
      owner = "client!mu",
      name = "qg",
      descriptor = "I"
   )
   public static int field3945;
   @OriginalMember(
      owner = "client!mu",
      name = "rg",
      descriptor = "I"
   )
   public static int field3946;
   @OriginalMember(
      owner = "client!mu",
      name = "Ee",
      descriptor = "I"
   )
   public static int field3947;
   @OriginalMember(
      owner = "client!mu",
      name = "Yb",
      descriptor = "I"
   )
   public static int field3949;
   @OriginalMember(
      owner = "client!mu",
      name = "Ec",
      descriptor = "I"
   )
   public static int field3950;
   @OriginalMember(
      owner = "client!mu",
      name = "ye",
      descriptor = "I"
   )
   public static int field3951;
   @OriginalMember(
      owner = "client!mu",
      name = "Zf",
      descriptor = "I"
   )
   public static int field3952;
   @OriginalMember(
      owner = "client!mu",
      name = "Nc",
      descriptor = "I"
   )
   public static int field3953;
   @OriginalMember(
      owner = "client!mu",
      name = "Zb",
      descriptor = "I"
   )
   public static int field3954;
   @OriginalMember(
      owner = "client!mu",
      name = "Je",
      descriptor = "I"
   )
   public static int field3955;
   @OriginalMember(
      owner = "client!mu",
      name = "Wd",
      descriptor = "I"
   )
   public static int field3956;
   @OriginalMember(
      owner = "client!mu",
      name = "O",
      descriptor = "I"
   )
   public static int field3957;
   @OriginalMember(
      owner = "client!mu",
      name = "te",
      descriptor = "I"
   )
   public static int field3959;
   @OriginalMember(
      owner = "client!mu",
      name = "Nb",
      descriptor = "I"
   )
   public static int field3962;
   @OriginalMember(
      owner = "client!mu",
      name = "Qd",
      descriptor = "I"
   )
   public static int field3964;
   @OriginalMember(
      owner = "client!mu",
      name = "Uf",
      descriptor = "I"
   )
   public static int field3965;
   @OriginalMember(
      owner = "client!mu",
      name = "Ge",
      descriptor = "I"
   )
   public static int field3966;
   @OriginalMember(
      owner = "client!mu",
      name = "E",
      descriptor = "I"
   )
   public static int field3967;
   @OriginalMember(
      owner = "client!mu",
      name = "pb",
      descriptor = "I"
   )
   public static int field3968;
   @OriginalMember(
      owner = "client!mu",
      name = "J",
      descriptor = "I"
   )
   public static int field3969;
   @OriginalMember(
      owner = "client!mu",
      name = "Nd",
      descriptor = "I"
   )
   public static int field3970;
   @OriginalMember(
      owner = "client!mu",
      name = "Cc",
      descriptor = "I"
   )
   public static int field3971;
   @OriginalMember(
      owner = "client!mu",
      name = "Bb",
      descriptor = "I"
   )
   public static int field3972;
   @OriginalMember(
      owner = "client!mu",
      name = "Tf",
      descriptor = "I"
   )
   public static int field3973;
   @OriginalMember(
      owner = "client!mu",
      name = "Te",
      descriptor = "I"
   )
   public static int field3974;
   @OriginalMember(
      owner = "client!mu",
      name = "wf",
      descriptor = "I"
   )
   public static int field3976;
   @OriginalMember(
      owner = "client!mu",
      name = "jf",
      descriptor = "I"
   )
   public static int field3977;
   @OriginalMember(
      owner = "client!mu",
      name = "Cb",
      descriptor = "I"
   )
   public static int field3978;
   @OriginalMember(
      owner = "client!mu",
      name = "ab",
      descriptor = "I"
   )
   public static int field3979;
   @OriginalMember(
      owner = "client!mu",
      name = "rc",
      descriptor = "I"
   )
   public static int field3980;
   @OriginalMember(
      owner = "client!mu",
      name = "Gc",
      descriptor = "I"
   )
   public static int field3983;
   @OriginalMember(
      owner = "client!mu",
      name = "pg",
      descriptor = "I"
   )
   public static int field3984;
   @OriginalMember(
      owner = "client!mu",
      name = "Ld",
      descriptor = "I"
   )
   public static int field3985;
   @OriginalMember(
      owner = "client!mu",
      name = "Jf",
      descriptor = "I"
   )
   public static int field3986;
   @OriginalMember(
      owner = "client!mu",
      name = "Mb",
      descriptor = "I"
   )
   public static int field3987;
   @OriginalMember(
      owner = "client!mu",
      name = "yd",
      descriptor = "I"
   )
   public static int field3988;
   @OriginalMember(
      owner = "client!mu",
      name = "Ve",
      descriptor = "I"
   )
   public static int field3989;
   @OriginalMember(
      owner = "client!mu",
      name = "vd",
      descriptor = "I"
   )
   public static int field3990;
   @OriginalMember(
      owner = "client!mu",
      name = "dd",
      descriptor = "I"
   )
   public static int field3991;
   @OriginalMember(
      owner = "client!mu",
      name = "Fg",
      descriptor = "I"
   )
   public static int field3992;
   @OriginalMember(
      owner = "client!mu",
      name = "ad",
      descriptor = "I"
   )
   public static int field3993;
   @OriginalMember(
      owner = "client!mu",
      name = "mc",
      descriptor = "I"
   )
   public static int field3995;
   @OriginalMember(
      owner = "client!mu",
      name = "K",
      descriptor = "I"
   )
   public static int field3996;
   @OriginalMember(
      owner = "client!mu",
      name = "Td",
      descriptor = "I"
   )
   public static int field3997;
   @OriginalMember(
      owner = "client!mu",
      name = "ec",
      descriptor = "I"
   )
   public static int field3998;
   @OriginalMember(
      owner = "client!mu",
      name = "Ob",
      descriptor = "I"
   )
   public static int field3999;
   @OriginalMember(
      owner = "client!mu",
      name = "gg",
      descriptor = "I"
   )
   public static int field4000;
   @OriginalMember(
      owner = "client!mu",
      name = "gb",
      descriptor = "I"
   )
   public static int field4001;
   @OriginalMember(
      owner = "client!mu",
      name = "of",
      descriptor = "I"
   )
   public static int field4002;
   @OriginalMember(
      owner = "client!mu",
      name = "xd",
      descriptor = "I"
   )
   public static int field4003;
   @OriginalMember(
      owner = "client!mu",
      name = "bf",
      descriptor = "I"
   )
   public static int field4004;
   @OriginalMember(
      owner = "client!mu",
      name = "I",
      descriptor = "I"
   )
   public static int field4005;
   @OriginalMember(
      owner = "client!mu",
      name = "rf",
      descriptor = "I"
   )
   public static int field4006;
   @OriginalMember(
      owner = "client!mu",
      name = "Hb",
      descriptor = "I"
   )
   public static int field4007;
   @OriginalMember(
      owner = "client!mu",
      name = "kg",
      descriptor = "I"
   )
   public static int field4008;
   @OriginalMember(
      owner = "client!mu",
      name = "Tb",
      descriptor = "I"
   )
   public static int field4009;
   @OriginalMember(
      owner = "client!mu",
      name = "Pe",
      descriptor = "I"
   )
   public static int field4010;
   @OriginalMember(
      owner = "client!mu",
      name = "Jc",
      descriptor = "I"
   )
   public static int field4011;
   @OriginalMember(
      owner = "client!mu",
      name = "id",
      descriptor = "I"
   )
   public static int field4012;
   @OriginalMember(
      owner = "client!mu",
      name = "S",
      descriptor = "I"
   )
   public static int field4013;
   @OriginalMember(
      owner = "client!mu",
      name = "Hd",
      descriptor = "I"
   )
   public static int field4014;
   @OriginalMember(
      owner = "client!mu",
      name = "Df",
      descriptor = "I"
   )
   public static int field4015;
   @OriginalMember(
      owner = "client!mu",
      name = "ue",
      descriptor = "I"
   )
   public static int field4017;
   @OriginalMember(
      owner = "client!mu",
      name = "de",
      descriptor = "I"
   )
   public static int field4018;
   @OriginalMember(
      owner = "client!mu",
      name = "he",
      descriptor = "I"
   )
   public static int field4019;
   @OriginalMember(
      owner = "client!mu",
      name = "Bc",
      descriptor = "I"
   )
   public static int field4020;
   @OriginalMember(
      owner = "client!mu",
      name = "Xd",
      descriptor = "I"
   )
   public static int field4021;
   @OriginalMember(
      owner = "client!mu",
      name = "td",
      descriptor = "I"
   )
   public static int field4022;
   @OriginalMember(
      owner = "client!mu",
      name = "Vb",
      descriptor = "I"
   )
   public static int field4023;
   @OriginalMember(
      owner = "client!mu",
      name = "Bf",
      descriptor = "I"
   )
   public static int field4024;
   @OriginalMember(
      owner = "client!mu",
      name = "Id",
      descriptor = "I"
   )
   public static int field4025;
   @OriginalMember(
      owner = "client!mu",
      name = "Ed",
      descriptor = "I"
   )
   public static int field4027;
   @OriginalMember(
      owner = "client!mu",
      name = "mg",
      descriptor = "I"
   )
   public static int field4028;
   @OriginalMember(
      owner = "client!mu",
      name = "Re",
      descriptor = "I"
   )
   public static int field4029;
   @OriginalMember(
      owner = "client!mu",
      name = "L",
      descriptor = "I"
   )
   public static int field4030;
   @OriginalMember(
      owner = "client!mu",
      name = "xf",
      descriptor = "I"
   )
   public static int field4031;
   @OriginalMember(
      owner = "client!mu",
      name = "Lb",
      descriptor = "I"
   )
   public static int field4032;
   @OriginalMember(
      owner = "client!mu",
      name = "Mc",
      descriptor = "I"
   )
   public static int field4033;
   @OriginalMember(
      owner = "client!mu",
      name = "kc",
      descriptor = "I"
   )
   public static int field4034;
   @OriginalMember(
      owner = "client!mu",
      name = "Eg",
      descriptor = "I"
   )
   public static int field4035;
   @OriginalMember(
      owner = "client!mu",
      name = "ee",
      descriptor = "I"
   )
   public static int field4036;
   @OriginalMember(
      owner = "client!mu",
      name = "Xb",
      descriptor = "I"
   )
   public static int field4037;
   @OriginalMember(
      owner = "client!mu",
      name = "od",
      descriptor = "I"
   )
   public static int field4039;
   @OriginalMember(
      owner = "client!mu",
      name = "dg",
      descriptor = "I"
   )
   public static int field4040;
   @OriginalMember(
      owner = "client!mu",
      name = "Yc",
      descriptor = "I"
   )
   public static int field4041;
   @OriginalMember(
      owner = "client!mu",
      name = "F",
      descriptor = "I"
   )
   public static int field4042;
   @OriginalMember(
      owner = "client!mu",
      name = "W",
      descriptor = "I"
   )
   public static int field4044;
   @OriginalMember(
      owner = "client!mu",
      name = "Oe",
      descriptor = "I"
   )
   public static int field4045;
   @OriginalMember(
      owner = "client!mu",
      name = "Se",
      descriptor = "I"
   )
   public static int field4046;
   @OriginalMember(
      owner = "client!mu",
      name = "we",
      descriptor = "I"
   )
   public static int field4047;
   @OriginalMember(
      owner = "client!mu",
      name = "hd",
      descriptor = "I"
   )
   public static int field4048;
   @OriginalMember(
      owner = "client!mu",
      name = "lb",
      descriptor = "I"
   )
   public static int field4049;
   @OriginalMember(
      owner = "client!mu",
      name = "Fd",
      descriptor = "I"
   )
   public static int field4050;
   @OriginalMember(
      owner = "client!mu",
      name = "rb",
      descriptor = "I"
   )
   public static int field4051;
   @OriginalMember(
      owner = "client!mu",
      name = "Xf",
      descriptor = "I"
   )
   public static int field4052;
   @OriginalMember(
      owner = "client!mu",
      name = "Wf",
      descriptor = "I"
   )
   public static int field4053;
   @OriginalMember(
      owner = "client!mu",
      name = "ke",
      descriptor = "I"
   )
   public static int field4054;
   @OriginalMember(
      owner = "client!mu",
      name = "fc",
      descriptor = "I"
   )
   public static int field4055;
   @OriginalMember(
      owner = "client!mu",
      name = "nf",
      descriptor = "I"
   )
   public static int field4056;
   @OriginalMember(
      owner = "client!mu",
      name = "Pd",
      descriptor = "I"
   )
   public static int field4057;
   @OriginalMember(
      owner = "client!mu",
      name = "Ze",
      descriptor = "I"
   )
   public static int field4058;
   @OriginalMember(
      owner = "client!mu",
      name = "gf",
      descriptor = "I"
   )
   public static int field4059;
   @OriginalMember(
      owner = "client!mu",
      name = "Sb",
      descriptor = "I"
   )
   public static int field4060;
   @OriginalMember(
      owner = "client!mu",
      name = "Ne",
      descriptor = "I"
   )
   public static int field4061;
   @OriginalMember(
      owner = "client!mu",
      name = "Dd",
      descriptor = "I"
   )
   public static int field4062;
   @OriginalMember(
      owner = "client!mu",
      name = "hf",
      descriptor = "I"
   )
   public static int field4063;
   @OriginalMember(
      owner = "client!mu",
      name = "Zc",
      descriptor = "I"
   )
   public static int field4064;
   @OriginalMember(
      owner = "client!mu",
      name = "ie",
      descriptor = "I"
   )
   public static int field4065;
   @OriginalMember(
      owner = "client!mu",
      name = "hc",
      descriptor = "I"
   )
   public static int field4067;
   @OriginalMember(
      owner = "client!mu",
      name = "Lf",
      descriptor = "I"
   )
   public static int field4068;
   @OriginalMember(
      owner = "client!mu",
      name = "Zd",
      descriptor = "I"
   )
   public static int field4069;
   @OriginalMember(
      owner = "client!mu",
      name = "Wb",
      descriptor = "I"
   )
   public static int field4070;
   @OriginalMember(
      owner = "client!mu",
      name = "re",
      descriptor = "I"
   )
   public static int field4071;
   @OriginalMember(
      owner = "client!mu",
      name = "Kf",
      descriptor = "I"
   )
   public static int field4072;
   @OriginalMember(
      owner = "client!mu",
      name = "Uc",
      descriptor = "I"
   )
   public static int field4073;
   @OriginalMember(
      owner = "client!mu",
      name = "Ef",
      descriptor = "I"
   )
   public static int field4074;
   @OriginalMember(
      owner = "client!mu",
      name = "Rd",
      descriptor = "I"
   )
   public static int field4075;
   @OriginalMember(
      owner = "client!mu",
      name = "jg",
      descriptor = "I"
   )
   public static int field4076;
   @OriginalMember(
      owner = "client!mu",
      name = "ug",
      descriptor = "I"
   )
   public static int field4077;
   @OriginalMember(
      owner = "client!mu",
      name = "ed",
      descriptor = "I"
   )
   public static int field4078;
   @OriginalMember(
      owner = "client!mu",
      name = "kb",
      descriptor = "I"
   )
   public static int field4079;
   @OriginalMember(
      owner = "client!mu",
      name = "xg",
      descriptor = "I"
   )
   public static int field4080;
   @OriginalMember(
      owner = "client!mu",
      name = "wc",
      descriptor = "I"
   )
   public static int field4081;
   @OriginalMember(
      owner = "client!mu",
      name = "Ic",
      descriptor = "I"
   )
   public static int field4083;
   @OriginalMember(
      owner = "client!mu",
      name = "kd",
      descriptor = "I"
   )
   public static int field4084;
   @OriginalMember(
      owner = "client!mu",
      name = "gd",
      descriptor = "I"
   )
   public static int field4085;
   @OriginalMember(
      owner = "client!mu",
      name = "De",
      descriptor = "I"
   )
   public static int field4087;
   @OriginalMember(
      owner = "client!mu",
      name = "le",
      descriptor = "I"
   )
   public static int field4088;
   @OriginalMember(
      owner = "client!mu",
      name = "Ye",
      descriptor = "I"
   )
   public static int field4089;
   @OriginalMember(
      owner = "client!mu",
      name = "Cf",
      descriptor = "I"
   )
   public static int field4090;
   @OriginalMember(
      owner = "client!mu",
      name = "Ie",
      descriptor = "I"
   )
   public static int field4091;
   @OriginalMember(
      owner = "client!mu",
      name = "Le",
      descriptor = "I"
   )
   public static int field4092;
   @OriginalMember(
      owner = "client!mu",
      name = "If",
      descriptor = "I"
   )
   public static int field4093;
   @OriginalMember(
      owner = "client!mu",
      name = "ge",
      descriptor = "I"
   )
   public static int field4094;
   @OriginalMember(
      owner = "client!mu",
      name = "D",
      descriptor = "I"
   )
   public static int field4095;
   @OriginalMember(
      owner = "client!mu",
      name = "uc",
      descriptor = "I"
   )
   public static int field4096;
   @OriginalMember(
      owner = "client!mu",
      name = "Sf",
      descriptor = "I"
   )
   public static int field4097;
   @OriginalMember(
      owner = "client!mu",
      name = "Vf",
      descriptor = "I"
   )
   public static int field4098;
   @OriginalMember(
      owner = "client!mu",
      name = "Ad",
      descriptor = "I"
   )
   public static int field4099;
   @OriginalMember(
      owner = "client!mu",
      name = "Qc",
      descriptor = "I"
   )
   public static int field4100;
   @OriginalMember(
      owner = "client!mu",
      name = "df",
      descriptor = "I"
   )
   public static int field4101;
   @OriginalMember(
      owner = "client!mu",
      name = "R",
      descriptor = "I"
   )
   public static int field4102;
   @OriginalMember(
      owner = "client!mu",
      name = "bd",
      descriptor = "I"
   )
   public static int field4103;
   @OriginalMember(
      owner = "client!mu",
      name = "V",
      descriptor = "I"
   )
   public static int field4104;
   @OriginalMember(
      owner = "client!mu",
      name = "qd",
      descriptor = "I"
   )
   public static int field4105;
   @OriginalMember(
      owner = "client!mu",
      name = "Yd",
      descriptor = "I"
   )
   public static int field4106;
   @OriginalMember(
      owner = "client!mu",
      name = "Ke",
      descriptor = "I"
   )
   public static int field4107;
   @OriginalMember(
      owner = "client!mu",
      name = "sg",
      descriptor = "I"
   )
   public static int field4108;
   @OriginalMember(
      owner = "client!mu",
      name = "tb",
      descriptor = "I"
   )
   public static int field4109;
   @OriginalMember(
      owner = "client!mu",
      name = "ze",
      descriptor = "I"
   )
   public static int field4110;
   @OriginalMember(
      owner = "client!mu",
      name = "Qb",
      descriptor = "I"
   )
   public static int field4111;
   @OriginalMember(
      owner = "client!mu",
      name = "C",
      descriptor = "I"
   )
   public static int field4112;
   @OriginalMember(
      owner = "client!mu",
      name = "pc",
      descriptor = "I"
   )
   public static int field4113;
   @OriginalMember(
      owner = "client!mu",
      name = "zb",
      descriptor = "I"
   )
   public static int field4114;
   @OriginalMember(
      owner = "client!mu",
      name = "ng",
      descriptor = "I"
   )
   public static int field4115;
   @OriginalMember(
      owner = "client!mu",
      name = "xe",
      descriptor = "I"
   )
   public static int field4116;
   @OriginalMember(
      owner = "client!mu",
      name = "oe",
      descriptor = "I"
   )
   public static int field4117;
   @OriginalMember(
      owner = "client!mu",
      name = "H",
      descriptor = "I"
   )
   public static int field4118;
   @OriginalMember(
      owner = "client!mu",
      name = "jd",
      descriptor = "I"
   )
   public static int field4119;
   @OriginalMember(
      owner = "client!mu",
      name = "Of",
      descriptor = "I"
   )
   public int field4122;
   @OriginalMember(
      owner = "client!mu",
      name = "Ce",
      descriptor = "I"
   )
   public static int field4124;
   @OriginalMember(
      owner = "client!mu",
      name = "sf",
      descriptor = "I"
   )
   public static int field4125;
   @OriginalMember(
      owner = "client!mu",
      name = "ac",
      descriptor = "I"
   )
   public static int field4126;
   @OriginalMember(
      owner = "client!mu",
      name = "Af",
      descriptor = "I"
   )
   public static int field4127;
   @OriginalMember(
      owner = "client!mu",
      name = "G",
      descriptor = "I"
   )
   public int field4128;
   @OriginalMember(
      owner = "client!mu",
      name = "Bd",
      descriptor = "I"
   )
   public static int field4129;
   @OriginalMember(
      owner = "client!mu",
      name = "Sc",
      descriptor = "I"
   )
   public int field4130;
   @OriginalMember(
      owner = "client!mu",
      name = "Kd",
      descriptor = "I"
   )
   public static int field4131;
   @OriginalMember(
      owner = "client!mu",
      name = "Vd",
      descriptor = "I"
   )
   public static int field4132;
   @OriginalMember(
      owner = "client!mu",
      name = "Kb",
      descriptor = "I"
   )
   public static int field4133;
   @OriginalMember(
      owner = "client!mu",
      name = "hb",
      descriptor = "I"
   )
   public static int field4134;
   @OriginalMember(
      owner = "client!mu",
      name = "rd",
      descriptor = "I"
   )
   public static int field4135;
   @OriginalMember(
      owner = "client!mu",
      name = "Hf",
      descriptor = "I"
   )
   public static int field4137;
   @OriginalMember(
      owner = "client!mu",
      name = "x",
      descriptor = "I"
   )
   public int field4145;
   @OriginalMember(
      owner = "client!mu",
      name = "uf",
      descriptor = "I"
   )
   private int field4146;
   @OriginalMember(
      owner = "client!mu",
      name = "A",
      descriptor = "I"
   )
   public int field4150;
   @OriginalMember(
      owner = "client!mu",
      name = "yb",
      descriptor = "I"
   )
   public int field4155;
   @OriginalMember(
      owner = "client!mu",
      name = "N",
      descriptor = "I"
   )
   public int field4173;
   @OriginalMember(
      owner = "client!mu",
      name = "Pc",
      descriptor = "I"
   )
   private int field4183;
   @OriginalMember(
      owner = "client!mu",
      name = "qf",
      descriptor = "I"
   )
   public int field4195;
   @OriginalMember(
      owner = "client!mu",
      name = "ig",
      descriptor = "I"
   )
   public int field4198;
   @OriginalMember(
      owner = "client!mu",
      name = "tf",
      descriptor = "I"
   )
   public int field4218;
   @OriginalMember(
      owner = "client!mu",
      name = "eb",
      descriptor = "I"
   )
   public int field4232;
   @OriginalMember(
      owner = "client!mu",
      name = "Gf",
      descriptor = "I"
   )
   private int field4266;
   @OriginalMember(
      owner = "client!mu",
      name = "peer",
      descriptor = "J"
   )
   public long peer;
   @OriginalMember(
      owner = "client!mu",
      name = "Fc",
      descriptor = "Leha;"
   )
   private class243 field4208;
   @OriginalMember(
      owner = "client!mu",
      name = "Qe",
      descriptor = "Lvi;"
   )
   public class371 field4243;
   @OriginalMember(
      owner = "client!mu",
      name = "pd",
      descriptor = "Lvi;"
   )
   private class371 field4252;
   @OriginalMember(
      owner = "client!mu",
      name = "nd",
      descriptor = "Lvi;"
   )
   private class371 field4253;
   @OriginalMember(
      owner = "client!mu",
      name = "Dc",
      descriptor = "Lvi;"
   )
   public class371 field4259;
   @OriginalMember(
      owner = "client!mu",
      name = "se",
      descriptor = "Lvi;"
   )
   public class371 field4260;
   @OriginalMember(
      owner = "client!mu",
      name = "cg",
      descriptor = "Lvi;"
   )
   private class371 field4261;
   @OriginalMember(
      owner = "client!mu",
      name = "Db",
      descriptor = "Lvi;"
   )
   public class371 field4264;
   @OriginalMember(
      owner = "client!mu",
      name = "qb",
      descriptor = "Lwm;"
   )
   public class428 field4153;
   @OriginalMember(
      owner = "client!mu",
      name = "ce",
      descriptor = "Llga;"
   )
   private class550 field4235;
   @OriginalMember(
      owner = "client!mu",
      name = "ld",
      descriptor = "Lgfa;"
   )
   private class631 field4246;
   @OriginalMember(
      owner = "client!mu",
      name = "Tc",
      descriptor = "Lgfa;"
   )
   private class631 field4250;
   @OriginalMember(
      owner = "client!mu",
      name = "Eb",
      descriptor = "Lgfa;"
   )
   private class631 field4257;
   @OriginalMember(
      owner = "client!mu",
      name = "tc",
      descriptor = "Lct;"
   )
   public class703 field4244;
   @OriginalMember(
      owner = "client!mu",
      name = "be",
      descriptor = "Lct;"
   )
   public class703 field4245;
   @OriginalMember(
      owner = "client!mu",
      name = "vf",
      descriptor = "Lct;"
   )
   public class703 field4247;
   @OriginalMember(
      owner = "client!mu",
      name = "Ae",
      descriptor = "Lct;"
   )
   public class703 field4248;
   @OriginalMember(
      owner = "client!mu",
      name = "hg",
      descriptor = "Lct;"
   )
   public class703 field4249;
   @OriginalMember(
      owner = "client!mu",
      name = "qc",
      descriptor = "Lct;"
   )
   public class703 field4251;
   @OriginalMember(
      owner = "client!mu",
      name = "qe",
      descriptor = "Lct;"
   )
   public class703 field4254;
   @OriginalMember(
      owner = "client!mu",
      name = "bc",
      descriptor = "Lct;"
   )
   public class703 field4255;
   @OriginalMember(
      owner = "client!mu",
      name = "Fb",
      descriptor = "Lct;"
   )
   public class703 field4256;
   @OriginalMember(
      owner = "client!mu",
      name = "ub",
      descriptor = "Lct;"
   )
   public class703 field4258;
   @OriginalMember(
      owner = "client!mu",
      name = "zd",
      descriptor = "Lcr;"
   )
   private class757 field4158;
   @OriginalMember(
      owner = "client!mu",
      name = "Jd",
      descriptor = "Lqq;"
   )
   private class800 field4263;
   @OriginalMember(
      owner = "client!mu",
      name = "fd",
      descriptor = "Lsc;"
   )
   public class97 field4082;
   @OriginalMember(
      owner = "client!mu",
      name = "lf",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   public NativeHeap field4120;
   @OriginalMember(
      owner = "client!mu",
      name = "Ue",
      descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   public NativeHeapBuffer field4016;
   @OriginalMember(
      owner = "client!mu",
      name = "kf",
      descriptor = "Ljava/util/Hashtable;"
   )
   private Hashtable field4038;
   @OriginalMember(
      owner = "client!mu",
      name = "ic",
      descriptor = "Z"
   )
   public boolean field4157;
   @OriginalMember(
      owner = "client!mu",
      name = "jc",
      descriptor = "Z"
   )
   public boolean field4171;
   @OriginalMember(
      owner = "client!mu",
      name = "jb",
      descriptor = "Z"
   )
   public boolean field4205;
   @OriginalMember(
      owner = "client!mu",
      name = "Pf",
      descriptor = "Z"
   )
   public boolean field4215;
   @OriginalMember(
      owner = "client!mu",
      name = "xc",
      descriptor = "Z"
   )
   public boolean field4227;
   @OriginalMember(
      owner = "client!mu",
      name = "Kc",
      descriptor = "Z"
   )
   public boolean field4265;
   @OriginalMember(
      owner = "client!mu",
      name = "cc",
      descriptor = "[Llja;"
   )
   public class404[] field4190;
   @OriginalMember(
      owner = "client!mu",
      name = "Oc",
      descriptor = "[Lwm;"
   )
   private class428[] field4189;
   @OriginalMember(
      owner = "client!mu",
      name = "Ag",
      descriptor = "[Lkr;"
   )
   public class504[] field4144;
   @OriginalMember(
      owner = "client!mu",
      name = "Jb",
      descriptor = "[Lhf;"
   )
   public class588[] field4185;
   @OriginalMember(
      owner = "client!mu",
      name = "cd",
      descriptor = "[Lhf;"
   )
   public class588[] field4237;
   @OriginalMember(
      owner = "client!mu",
      name = "Ib",
      descriptor = "[Lhr;"
   )
   public class666[] field4220;

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(IB)V",
      line = 7
   )
   public final void method2175(int arg0, byte arg1) {
      try {
         ++field4079;
         this.method2218(arg1 | arg1 << 24 | arg1 << 16 | arg1 << 8, 22121);
         if (arg0 != -19928) {
            this.method2256(false);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[29] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "s",
      descriptor = "()Z",
      line = 21
   )
   public final boolean method660() {
      try {
         ++field4020;
         return false;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4267[56] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Lkf;)V",
      line = 31
   )
   public final void method688(class401 arg0) {
      try {
         this.field4136 = (class504)arg0;
         ++field4045;
         this.field4139.method1549(this.field4136);
         this.field4139.method3909(-87);
         this.field4140.method3903((byte)-30, this.field4139);
         this.field4138.method3903((byte)-30, this.field4136);
         if (this.field4188.method16((byte)86)) {
            this.method2194((byte)-43);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[41] + (arg0 != null ? field4267[2] : field4267[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "aa",
      descriptor = "(IIIIII)V",
      line = 48
   )
   public final void method631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field4048;
         this.method2242(127);
         this.method2218(arg4, 22121);
         this.method2185((byte)-128, 0, class700.field10441);
         this.method2221(0, (byte)51, class700.field10441);
         this.method2244(arg5, (byte)-82);
         this.field4121.method3920((float)arg3, 1.0F, 0, (float)arg2);
         this.field4121.method1546(arg0, arg1, 0);
         this.method2222(50);
         this.method1474(false, true);
         this.method2231(1);
         this.method1474(true, true);
         this.method2221(0, (byte)51, class751.field11122);
         this.method2185((byte)-94, 0, class751.field11122);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field4267[28] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "y",
      descriptor = "(I)V",
      line = 70
   )
   private final void method2176(int arg0) {
      try {
         this.method1491(3715);
         ++field4104;
         if (arg0 != 0) {
            field4043 = null;
         }

         if (this.field4235 != null) {
            this.field4235.method77(arg0 + -2);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(ZII[II)Lbc;",
      line = 84
   )
   public final class282 method2177(boolean arg0, int arg1, int arg2, int[] arg3, int arg4) {
      try {
         ++field4034;
         if (arg1 != -1) {
            this.method2185((byte)13, -102, (class308)null);
         }

         return this.method1488(arg3, 14943, arg4, 0, arg2, 0, arg0);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field4267[176] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4267[2] : field4267[1]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "([IIIIIZ)Ljq;",
      line = 96
   )
   public final class672 method658(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         ++field4003;
         return new class247(this, arg3, arg4, arg0, arg1, arg2);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field4267[185] + (arg0 != null ? field4267[2] : field4267[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(IIIIIIIII)V",
      line = 105
   )
   public final void method659(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      boolean var10 = client.field1786;

      try {
         float var12;
         float var14;
         label101: {
            ++field4022;
            float var11 = (float)arg2 - (float)arg0;
            var12 = (float)(-arg1) + (float)arg3;
            if (var11 != 0.0F || var12 != 0.0F) {
               float var13 = (float)(1.0D / Math.sqrt((double)(var11 * var11 + var12 * var12)));
               var14 = var11 * var13;
               var12 *= var13;
               if (!var10) {
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
            this.method2242(127);
            this.method2218(arg4, 22121);
            this.method2185((byte)-92, 0, class700.field10441);
            this.method2221(0, (byte)51, class700.field10441);
            this.method2244(arg5, (byte)-56);
            this.method2205(true);
            int var27 = arg8 % (arg6 + arg7);
            this.method1474(false, true);
            var15 = (float)arg6 * var14;
            var16 = (float)arg6 * var12;
            var17 = 0.0F;
            var18 = 0.0F;
            var19 = var15;
            var20 = var16;
            if (var27 > arg6) {
               var18 = (float)(-var27 + arg7 + arg6) * var12;
               var17 = (float)(-var27 + arg7 + arg6) * var14;
               if (!var10) {
                  break label83;
               }
            }

            var20 = (float)(-var27 + arg6) * var12;
            var19 = (float)(-var27 + arg6) * var14;
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
                     if (var10) {
                        break label74;
                     }

                     if (var10000 < 0) {
                        break;
                     }

                     if (!((float)arg2 > var19 + var21)) {
                        break label97;
                     }

                     var19 = (float)arg2 + -var21;
                     if (!var10) {
                        break label97;
                     }
                  }

                  float var29;
                  var10000 = (var29 = (float)arg2 - var21) == 0.0F ? 0 : (var29 < 0.0F ? -1 : 1);
               }

               if (var10000 < 0) {
                  break;
               }

               if ((float)arg2 < var19 + var21) {
                  var19 = (float)arg2 + -var21;
               }
            }

            label99: {
               if (arg1 < arg3) {
                  if ((float)arg3 < var22) {
                     break;
                  }

                  if (!(var20 + var22 > (float)arg3)) {
                     break label99;
                  }

                  var20 = (float)arg3 - var22;
                  if (!var10) {
                     break label99;
                  }
               }

               if (var22 < (float)arg3) {
                  break;
               }

               if ((float)arg3 > var20 + var22) {
                  var20 = (float)arg3 + -var22;
               }
            }

            if (!this.method2250(var22, var19 + var21, var21, 0.0F, 88, 0.0F, var20 + var22)) {
               return;
            }

            this.method2249(30);
            var21 += var19 + var23;
            var22 += var20 + var24;
            var19 = var15;
            var20 = var16;
         } while(!var10);

         this.method1474(true, true);
         this.method2221(0, (byte)51, class751.field11122);
         this.method2185((byte)-116, 0, class751.field11122);
      } catch (RuntimeException var26) {
         throw class482.method3757(var26, field4267[21] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(IIIIZ)Ljq;",
      line = 225
   )
   public final class672 method630(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         ++field4126;
         class247 var6 = new class247(this, arg2, arg3, arg4);
         var6.method937(0, 0, arg2, arg3, arg0, arg1);
         return var6;
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field4267[128] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V",
      line = 236
   )
   public final void method703(Canvas arg0) {
      try {
         ++field4055;
         if (this.field4066 == arg0) {
            throw new RuntimeException();
         } else if (this.field4038.containsKey(arg0)) {
            this.method1495(arg0, 0, this.field4038.get(arg0));
            this.field4038.remove(arg0);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[142] + (arg0 != null ? field4267[2] : field4267[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "H",
      descriptor = "(III[I)V",
      line = 257
   )
   public final void method600(int arg0, int arg1, int arg2, int[] arg3) {
      try {
         float var5;
         int var6;
         int var7;
         label33: {
            ++field3955;
            var5 = this.field4136.method3900(1, (float)arg1, (float)arg0, (float)arg2);
            if (var5 < -0.0078125F || var5 > 0.0078125F) {
               var6 = (int)((float)this.field4147 * this.field4136.method3908((float)arg1, (float)arg0, (byte)127, (float)arg2) / var5);
               var7 = (int)((float)this.field4212 * this.field4136.method3898((float)arg2, (byte)112, (float)arg1, (float)arg0) / var5);
               if (!client.field1786) {
                  break label33;
               }
            }

            var6 = this.field4184;
            var7 = this.field4221;
         }

         arg3[2] = (int)var5;
         arg3[0] = (int)((float)var6 - this.field4207);
         arg3[1] = (int)((float)var7 + -this.field4168);
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field4267[57] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4267[2] : field4267[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(FI)V",
      line = 291
   )
   public final void method2178(float arg0, int arg1) {
      try {
         if (this.field4224 != arg0) {
            this.field4224 = arg0;
            this.method2248(28);
         }

         ++field4099;
         if (arg1 != 8) {
            this.method666();
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[16] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(IIIIIII)V",
      line = 309
   )
   public final void method649(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         ++field4028;
         float var8 = (float)(-arg0) + (float)arg2;
         float var9 = (float)(-arg1) + (float)arg3;
         float var10 = 0.0F;
         float var11 = 1.0F;
         if (var8 != 0.0F || var9 != 0.0F) {
            var11 = (float)Math.sqrt((double)(var8 * var8 + var9 * var9));
            var10 = (float)Math.atan2((double)var9, (double)var8);
         }

         this.method2242(127);
         this.method2218(arg4, 22121);
         this.method2185((byte)-125, 0, class700.field10441);
         this.method2221(0, (byte)51, class700.field10441);
         this.method2244(arg6, (byte)38);
         this.field4121.method3920((float)arg5, 1.0F, 0, var11);
         this.field4121.method1546(0, -arg5 / 2, 0);
         this.field4121.method1555(16383 & (int)((double)var10 * 2607.5945876176133D));
         this.field4121.method1546(arg0, arg1, 0);
         this.method2222(50);
         this.method1474(false, true);
         this.method2231(1);
         this.method1474(true, true);
         this.method2221(0, (byte)51, class751.field11122);
         this.method2185((byte)-97, 0, class751.field11122);
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field4267[47] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "m",
      descriptor = "(B)V",
      line = 346
   )
   public final void method2179(byte arg0) {
      try {
         ++field4044;
         if (class404.field6318 != this.field4188) {
            class4 var2 = this.field4188;
            this.field4188 = class404.field6318;
            if (var2.method16((byte)86)) {
               this.method2194((byte)121);
            }

            this.field4146 &= -32;
            this.field4154 = this.field4222;
         }

         int var3 = 64 / ((arg0 - 82) / 39);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4267[35] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "e",
      descriptor = "(II)I",
      line = 370
   )
   public final int method584(int arg0, int arg1) {
      try {
         ++field4080;
         return arg1 | arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[90] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V",
      line = 380
   )
   public final void method674(Canvas arg0, int arg1, int arg2) {
      try {
         ++field4027;
         if (this.field4066 == arg0) {
            throw new RuntimeException();
         } else if (!this.field4038.containsKey(arg0)) {
            if (!arg0.isShowing()) {
               throw new RuntimeException();
            } else {
               try {
                  Class var4 = Class.forName(field4267[167]);
                  Method var5 = var4.getMethod(field4267[166], Boolean.TYPE);
                  var5.invoke(arg0, Boolean.TRUE);
               } catch (Exception var8) {
               }

               Object var6 = this.method1463(69, arg0);
               if (var6 == null) {
                  throw new RuntimeException();
               } else {
                  this.field4038.put(arg0, var6);
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field4267[168] + (arg0 != null ? field4267[2] : field4267[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "pa",
      descriptor = "()V",
      line = 419
   )
   public final void method666() {
      try {
         ++field4064;
         this.field4171 = false;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4267[123] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "za",
      descriptor = "(IIIII)V",
      line = 427
   )
   public final void method589(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field3968;
         this.method2242(127);
         this.method2218(arg3, 22121);
         this.method2185((byte)-92, 0, class700.field10441);
         this.method2221(0, (byte)51, class700.field10441);
         this.method2244(arg4, (byte)-108);
         this.field4121.method3920((float)arg2, 1.0F, 0, (float)arg2);
         this.field4121.method1546(arg0, arg1, 0);
         this.method2222(50);
         this.method1474(false, true);
         this.method1507(this.field4246, 0, (byte)15);
         this.method1502(this.field4261, 114);
         this.method1465(256, class145.field2065, 0, 0);
         this.method1474(true, true);
         this.method2221(0, (byte)51, class751.field11122);
         this.method2185((byte)-109, 0, class751.field11122);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field4267[51] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "U",
      descriptor = "(IIIII)V",
      line = 449
   )
   public final void method665(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field4076;
         this.method695(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field4267[182] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "k",
      descriptor = "()Z",
      line = 457
   )
   public final boolean method594() {
      try {
         ++field4133;
         return true;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4267[107] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "q",
      descriptor = "(B)Lkr;",
      line = 465
   )
   public final class504 method2180(byte arg0) {
      try {
         int var2 = 74 % ((arg0 - -37) / 37);
         ++field4134;
         return this.field4144[this.field4172];
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[121] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "y",
      descriptor = "()Z",
      line = 476
   )
   public final boolean method702() {
      try {
         ++field3950;
         return true;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4267[140] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "c",
      descriptor = "()Z",
      line = 485
   )
   public final boolean method664() {
      try {
         ++field3952;
         return true;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4267[179] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "b",
      descriptor = "(Z)V",
      line = 495
   )
   public final void method613(boolean arg0) {
      try {
         ++field4035;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[83] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "C",
      descriptor = "(I)V",
      line = 502
   )
   private final void method2181(int arg0) {
      try {
         if (arg0 <= 27) {
            this.method2234(true, 102);
         }

         ++field4105;
         if (class565.field8387 != this.field4188) {
            class4 var2 = this.field4188;
            this.field4188 = class565.field8387;
            if (var2.method16((byte)86)) {
               this.method2194((byte)-34);
            }

            this.method2183(0);
            this.field4154 = this.field4186;
            this.method2176(0);
            this.field4146 &= -25;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[175] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "G",
      descriptor = "(I)V",
      line = 527
   )
   private final void method2182(int arg0) {
      boolean var2 = client.field1786;

      try {
         this.field4246 = this.method1472(false, arg0 + 126);
         ++field4008;
         this.field4246.method1537(12, 3096, 22251);
         int var3 = arg0;
         class258 var10000;
         if (var2) {
            var10000 = this;
         } else if (~arg0 <= -5) {
            var10000 = this;
            if (!var2) {
               this.field4261 = this.method1452(new class570[]{new class570(class42.field552)}, (byte)1);
               return;
            }
         } else {
            var10000 = this;
         }

         do {
            while(true) {
               Buffer var4 = var10000.field4246.method1535(true, arg0 ^ 126);
               if (var4 != null) {
                  int var13;
                  label85: {
                     Stream var5 = this.method2245((byte)73, var4);
                     var5.method5248(0.0F);
                     var5.method5248(0.0F);
                     var5.method5248(0.0F);
                     int var6 = 0;
                     if (var2) {
                        var13 = var6 * 2;
                     } else if (var6 > 256) {
                        var5.method5253();
                        var13 = this.field4246.method1534(arg0 ^ 106);
                        if (!var2) {
                           break label85;
                        }
                     } else {
                        var13 = var6 * 2;
                     }

                     while(true) {
                        double var7 = (double)var13 * 3.141592653589793D / 256.0D;
                        float var9 = (float)Math.cos(var7);
                        float var10 = (float)Math.sin(var7);
                        if (Stream.method5249()) {
                           var5.method5248(var10);
                           var5.method5248(var9);
                           var5.method5248(0.0F);
                           if (var2) {
                              var5.method5241(var10);
                              var5.method5241(var9);
                              var5.method5241(0.0F);
                              ++var6;
                           } else {
                              ++var6;
                           }
                        } else {
                           var5.method5241(var10);
                           var5.method5241(var9);
                           var5.method5241(0.0F);
                           ++var6;
                        }

                        if (var6 > 256) {
                           var5.method5253();
                           var13 = this.field4246.method1534(arg0 ^ 106);
                           if (!var2) {
                              break;
                           }
                        } else {
                           var13 = var6 * 2;
                        }
                     }
                  }

                  if (var13 != 0) {
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
                     this.field4261 = this.method1452(new class570[]{new class570(class42.field552)}, (byte)1);
                     return;
                  }
               } else {
                  var10000 = this;
               }
            }
         } while(var2);

         this.field4261 = this.method1452(new class570[]{new class570(class42.field552)}, (byte)1);
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field4267[93] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Lkp;Z)Ljq;",
      line = 592
   )
   public final class672 method606(class776 arg0, boolean arg1) {
      boolean var3 = client.field1786;

      try {
         class672 var12;
         label102: {
            ++field4065;
            if (arg0.field11395 != 0 && ~arg0.field11394 != -1) {
               int[] var4;
               label106: {
                  var4 = new int[arg0.field11395 * arg0.field11394];
                  int var5 = 0;
                  int var6 = 0;
                  if (arg0.field11398 != null) {
                     int var7 = 0;
                     if (var3 || ~var7 > ~arg0.field11394) {
                        do {
                           int var8 = 0;
                           if (var3) {
                              var4[var6++] = class119.method1087(arg0.field11398[var5] << 24, arg0.field11400[class408.method3277(arg0.field11396[var5], 255)]);
                              ++var5;
                              ++var8;
                           }

                           while(true) {
                              while(arg0.field11395 > var8) {
                                 var4[var6++] = class119.method1087(arg0.field11398[var5] << 24, arg0.field11400[class408.method3277(arg0.field11396[var5], 255)]);
                                 ++var5;
                                 ++var8;
                              }

                              if (!var3) {
                                 ++var7;
                                 break;
                              }

                              ++var8;
                           }
                        } while(~var7 > ~arg0.field11394);
                     }

                     if (!var3) {
                        break label106;
                     }
                  }

                  int var9 = 0;
                  if (var3 || ~var9 > ~arg0.field11394) {
                     do {
                        int var10 = 0;
                        if (var3 || var10 < arg0.field11395) {
                           do {
                              int var11 = arg0.field11400[arg0.field11396[var5++] & 255];
                              var4[var6++] = ~var11 == -1 ? 0 : class119.method1087(-16777216, var11);
                              ++var10;
                           } while(var10 < arg0.field11395);
                        }

                        ++var9;
                     } while(~var9 > ~arg0.field11394);
                  }
               }

               var12 = this.method4494((byte)-77, arg0.field11394, arg0.field11395, arg0.field11395, 0, var4);
               if (!var3) {
                  break label102;
               }
            }

            var12 = this.method4494((byte)20, 1, 1, 1, 0, new int[1]);
         }

         var12.method2107(arg0.field11401, arg0.field11397, arg0.field11402, arg0.field11399);
         return var12;
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field4267[163] + (arg0 != null ? field4267[2] : field4267[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(IIIIIF)Llja;",
      line = 660
   )
   public final class404 method583(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      try {
         ++field4041;
         return new class21(arg0, arg1, arg2, arg3, arg4, arg5);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field4267[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "r",
      descriptor = "(I)V",
      line = 668
   )
   private final void method2183(int arg0) {
      try {
         if (!this.field4181) {
            label31: {
               float[] var2 = this.field4186;
               this.field4181 = true;
               if (this.field3960 == 0 || ~this.field3975 == -1) {
                  var2[8] = 0.0F;
                  var2[0] = 1.0F;
                  var2[13] = 0.0F;
                  var2[9] = 0.0F;
                  var2[12] = 0.0F;
                  var2[11] = 0.0F;
                  var2[7] = 0.0F;
                  var2[6] = 0.0F;
                  var2[10] = 1.0F;
                  var2[4] = 0.0F;
                  var2[14] = 0.0F;
                  var2[1] = 0.0F;
                  var2[15] = 1.0F;
                  var2[2] = 0.0F;
                  var2[3] = 0.0F;
                  var2[5] = 1.0F;
                  if (!client.field1786) {
                     break label31;
                  }
               }

               var2[11] = 0.0F;
               var2[6] = 0.0F;
               var2[2] = 0.0F;
               var2[5] = -2.0F / (float)this.field3975;
               var2[8] = 0.0F;
               var2[1] = 0.0F;
               var2[14] = 0.5F;
               var2[13] = 1.0F;
               var2[0] = 2.0F / (float)this.field3960;
               var2[15] = 1.0F;
               var2[3] = 0.0F;
               var2[4] = 0.0F;
               var2[7] = 0.0F;
               var2[12] = -1.0F;
               var2[10] = 0.5F;
               var2[9] = 0.0F;
            }
         }

         if (arg0 != 0) {
            this.field4181 = true;
         }

         ++field3991;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[160] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(BILjl;)V",
      line = 725
   )
   private final void method2184(byte arg0, int arg1, class133 arg2) {
      try {
         ++field4057;
         this.method1507(this.field4250, 0, (byte)15);
         this.method1502(this.field4252, 125);
         if (arg0 >= -65) {
            this.field4200 = 77;
         }

         this.method1465(arg1, arg2, 0, 0);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4267[134] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4267[2] : field4267[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(BILvv;)V",
      line = 740
   )
   public final void method2185(byte arg0, int arg1, class308 arg2) {
      try {
         if (arg0 > -91) {
            this.method1470(97);
         }

         ++field4132;
         this.method1494(0, false, arg1, arg2, false);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4267[108] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4267[2] : field4267[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "o",
      descriptor = "(B)V",
      line = 751
   )
   public static void method2186(byte arg0) {
      try {
         if (arg0 >= 108) {
            field4043 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4267[25] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "T",
      descriptor = "(I)V",
      line = 762
   )
   private final void method2187(int arg0) {
      try {
         this.field4181 = false;
         ++field4013;
         if (arg0 == 0) {
            if (class565.field8387 == this.field4188) {
               this.method2183(arg0);
               this.method2176(arg0);
            }
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[148] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "m",
      descriptor = "()Z",
      line = 790
   )
   public final boolean method673() {
      try {
         ++field4054;
         return true;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4267[106] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "ra",
      descriptor = "(IIII)V",
      line = 798
   )
   public final void method683(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field4149 = arg1;
         this.field4167 = arg2;
         this.field4170 = arg3;
         this.field4183 = arg0;
         this.field4171 = true;
         ++field4036;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4267[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "D",
      descriptor = "(I)Lkr;",
      line = 811
   )
   public final class504 method2188(int arg0) {
      try {
         ++field3976;
         if (arg0 != 0) {
            this.method639(-17, -77, 15, -83);
         }

         return this.field4144[this.field4172];
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[180] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(II[I[I)Laa;",
      line = 822
   )
   public final class96 method608(int arg0, int arg1, int[] arg2, int[] arg3) {
      try {
         ++field4062;
         return class158.method1419(arg1, this, 30455, arg0, arg2, arg3);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4267[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4267[2] : field4267[1]) + ',' + (arg3 != null ? field4267[2] : field4267[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "<init>",
      descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Lrr;II)V",
      line = 838
   )
   public class258(Canvas arg0, Object arg1, class150 arg2, class678 arg3, int arg4, int arg5) {
      boolean var7 = client.field1786;
      super(arg2);
      this.field3982 = new class675();
      this.field4123 = true;
      this.field4121 = new class504();
      this.field4136 = new class504();
      this.field4138 = new class504();
      this.field4139 = new class504();
      this.field4140 = new class504();
      this.field4141 = new class504();
      this.field4149 = -1;
      this.field4163 = false;
      this.field4142 = new float[16];
      this.field4147 = 512;
      this.field4165 = 0;
      this.field4179 = true;
      this.field4176 = false;
      this.field4181 = false;
      this.field4188 = class404.field6318;
      this.field4148 = 3584.0F;
      this.field4174 = 8;
      this.field4182 = false;
      this.field4172 = 0;
      this.field4196 = 0;
      this.field4193 = 0;
      this.field4197 = 3584.0F;
      this.field4164 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
      this.field4200 = -1;
      this.field4184 = 0;
      this.field4204 = 0;
      this.field4170 = 0;
      this.field4203 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
      this.field4160 = 1.0F;
      this.field4213 = -1.0F;
      this.field4166 = 3;
      this.field4186 = new float[16];
      this.field4177 = 1.0F;
      this.field4143 = 0;
      this.field4199 = 3584;
      this.field4212 = 512;
      this.field4216 = 50;
      this.field4214 = true;
      this.field4159 = 128;
      this.field4209 = new float[16];
      this.field4167 = -1;
      this.field4178 = 0;
      this.field4180 = false;
      this.field4194 = 1.0F;
      this.field4224 = 1.0F;
      this.field4223 = true;
      this.field4229 = new class550[10];
      this.field4210 = 1;
      this.field4221 = 0;
      this.field4191 = 0;
      this.field4201 = 0;
      this.field4211 = 1.0F;
      this.field4226 = new float[]{0.0F, 0.0F, -1.0F, 0.0F};
      this.field4169 = -1;
      this.field4236 = false;
      this.field4219 = -1;
      this.field4217 = 16777215;
      this.field4202 = true;
      this.field4239 = false;
      this.field4238 = false;
      this.field4206 = true;
      this.field4231 = 0;
      this.field4161 = -1.0F;
      this.field4233 = false;
      this.field4240 = class182.field2819;
      this.field4222 = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
      this.field4154 = this.field4222;
      this.field4230 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
      this.field4241 = 0;
      this.field4242 = false;
      this.field4225 = new Stream();
      this.field4262 = new class504();

      try {
         try {
            this.field3958 = this.field4066 = arg0;
            this.field3948 = arg3;
            this.field4187 = arg4;
            this.field3994 = this.field4086 = arg1;
            Dimension var8 = arg0.getSize();
            this.field4192 = arg5;
            this.field3975 = this.field4026 = var8.height;
            this.field3960 = this.field3963 = var8.width;
            class274.method2325(false, 1, true);
            if (super.field8891 == null) {
               this.field3961 = new NativeInterface(0, this.field4192);
               this.field4234 = null;
            } else {
               this.field4234 = new class75(this, super.field8891);
               this.field3961 = new NativeInterface(super.field8891.method1377((byte)127), this.field4192);
               int var9 = 0;
               if (var7 || ~super.field8891.method1377((byte)127) < ~var9) {
                  do {
                     class453 var10 = super.field8891.method1373(var9, (byte)-54);
                     if (var10 != null) {
                        this.field3961.initTextureMetrics(var9, var10.field6930, var10.field6935);
                     }

                     ++var9;
                  } while(~super.field8891.method1377((byte)127) < ~var9);

               }
            }
         } catch (Throwable var13) {
            var13.printStackTrace();
            this.method4495(true);
            throw new RuntimeException("");
         }
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field4267[145] + (arg0 != null ? field4267[2] : field4267[1]) + ',' + (arg1 != null ? field4267[2] : field4267[1]) + ',' + (arg2 != null ? field4267[2] : field4267[1]) + ',' + (arg3 != null ? field4267[2] : field4267[1]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V",
      line = 889
   )
   public final void method636(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class96 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      try {
         ++field4030;
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field4267[49] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field4267[2] : field4267[1]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "la",
      descriptor = "()V",
      line = 896
   )
   public final void method701() {
      try {
         this.field4165 = 0;
         ++field4000;
         this.field4191 = this.field3960;
         this.field4193 = this.field3975;
         this.field4241 = 0;
         if (this.field4265) {
            this.field4265 = false;
            this.method1508(-105);
         }

         this.method2232((byte)111);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4267[95] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "xa",
      descriptor = "(F)V",
      line = 916
   )
   public final void method679(float arg0) {
      try {
         ++field3964;
         if (this.field4177 != arg0) {
            this.field4177 = arg0;
            this.field3961.setAmbient(arg0);
            this.method1460((byte)-20);
            this.method1454(-125);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "B",
      descriptor = "(B)V",
      line = 931
   )
   public final void method2189(byte arg0) {
      try {
         ++field3962;
         if (arg0 < -10) {
            if (~this.field4146 != -9) {
               this.method2235((byte)125);
               this.method2209(false, true);
               this.method2228(-8841, true);
               this.method2219(true, 125);
               this.method2244(1, (byte)-124);
               this.field4146 = 8;
            }
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[137] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "d",
      descriptor = "()V",
      line = 954
   )
   public void method675() {
      boolean var1 = client.field1786;

      try {
         ++field4050;
         if (!this.field4182) {
            class294 var2 = this.field3982.method4972((byte)-84);
            if (var1) {
               ((class607)var2).method4473(255);
               var2 = this.field3982.method4975((byte)118);
            }

            while(true) {
               if (var2 == null) {
                  Enumeration var3 = this.field4038.keys();
                  if (!var1) {
                     Canvas var4;
                     if (var1) {
                        var4 = (Canvas)var3.nextElement();
                        this.method1495(var4, 0, this.field4038.get(var4));
                     }

                     while(true) {
                        Object var10000;
                        if (!var3.hasMoreElements()) {
                           class595.method4428(false, (byte)-107, true);
                           this.field3961.release();
                           var10000 = this;
                           if (!var1) {
                              this.field4182 = true;
                              return;
                           }
                        } else {
                           var10000 = var3.nextElement();
                        }

                        var4 = (Canvas)var10000;
                        this.method1495(var4, 0, this.field4038.get(var4));
                     }
                  }
               } else {
                  ((class607)var2).method4473(255);
               }

               var2 = this.field3982.method4975((byte)118);
            }
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4267[116] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "i",
      descriptor = "()I",
      line = 991
   )
   public final int method635() {
      try {
         ++field4135;
         return this.field4216;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4267[91] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "f",
      descriptor = "(B)V",
      line = 1005
   )
   public final void method2190(byte arg0) {
      try {
         this.method2179((byte)123);
         ++field4093;
         this.method2176(0);
         if (arg0 <= 13) {
            this.method2183(-42);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[138] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Lza;)V",
      line = 1017
   )
   public final void method619(class624 arg0) {
      try {
         this.field4120 = ((class607)arg0).field8849;
         ++field4069;
         this.field4016 = this.field4120.method5236(32768, false);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[111] + (arg0 != null ? field4267[2] : field4267[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "b",
      descriptor = "(I)V",
      line = 1033
   )
   public final void method704(int arg0) {
      try {
         ++field4084;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[174] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "f",
      descriptor = "(IIIIII)V",
      line = 1040
   )
   public final void method695(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         float var7;
         float var8;
         label22: {
            ++field3971;
            var7 = (float)arg2 - (float)arg0;
            var8 = (float)arg3 - (float)arg1;
            if (var7 == 0.0F && var8 == 0.0F) {
               var7 = 1.0F;
               if (!client.field1786) {
                  break label22;
               }
            }

            float var9 = (float)(1.0D / Math.sqrt((double)(var7 * var7 + var8 * var8)));
            var8 *= var9;
            var7 *= var9;
         }

         if (this.method2250((float)arg1, (float)arg2 + var7, (float)arg0, 0.0F, 101, 0.0F, (float)arg3 + var8)) {
            this.method2242(127);
            this.method2218(arg4, 22121);
            this.method2185((byte)-118, 0, class700.field10441);
            this.method2221(0, (byte)51, class700.field10441);
            this.method2244(arg5, (byte)-32);
            this.method2205(true);
            this.method1474(false, true);
            this.method2249(112);
            this.method1474(true, true);
            this.method2221(0, (byte)51, class751.field11122);
            this.method2185((byte)-121, 0, class751.field11122);
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field4267[152] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(IIZZ)V",
      line = 1080
   )
   public final void method2191(int arg0, int arg1, boolean arg2, boolean arg3) {
      boolean var5 = client.field1786;

      try {
         ++field4124;
         if (this.field4200 != arg1 || !this.field4171 == this.field4180) {
            class282 var6;
            int var7;
            byte var8;
            int var9;
            int var10;
            label78: {
               var6 = null;
               var7 = 0;
               var8 = 0;
               var9 = 0;
               var10 = this.field4171 ? 3 : 0;
               if (arg1 < 0) {
                  this.method2233((byte)-125);
                  if (!var5) {
                     break label78;
                  }
               }

               class453 var11;
               label88: {
                  var6 = this.field4234.method710(arg1, 64);
                  var11 = super.field8891.method1373(arg1, (byte)-54);
                  if (~var11.field6926 != -1 || ~var11.field6932 != -1) {
                     int var12 = !var11.field6933 ? 128 : 64;
                     int var13 = var12 * 50;
                     class504 var14 = this.method2188(0);
                     var14.method3919((float)(this.field4155 % var13 * var11.field6932) / (float)var13, 0.0F, (float)(this.field4155 % var13 * var11.field6926) / (float)var13, (byte)95);
                     this.method2247(11901, class655.field9787);
                     if (!var5) {
                        break label88;
                     }
                  }

                  this.method2233((byte)-107);
               }

               if (!this.field4171) {
                  var8 = var11.field6923;
                  var9 = var11.field6931;
                  var10 = var11.field6924;
               }

               var7 = var11.field6925;
            }

            label51: {
               this.method2202(arg2, false, var10, arg3, var8, var9);
               if (this.field4235 == null) {
                  this.method2193(var6, (byte)-19);
                  this.method2255(var7, (byte)90);
                  if (!var5) {
                     break label51;
                  }
               }

               this.field4235.method71(var7, (byte)-84, var6);
            }

            this.field4180 = this.field4171;
            this.field4200 = arg1;
         }

         if (arg0 != 0) {
            this.field4152 = 1.0017718F;
         }

         this.field4146 &= -8;
      } catch (RuntimeException var16) {
         throw class482.method3757(var16, field4267[171] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "Y",
      descriptor = "()[I",
      line = 1148
   )
   public final int[] method669() {
      try {
         ++field4114;
         return new int[]{this.field4184, this.field4221, this.field4147, this.field4212};
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4267[39] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "([I)V",
      line = 1157
   )
   public final void method611(int[] arg0) {
      try {
         arg0[1] = this.field3975;
         ++field4137;
         arg0[0] = this.field3960;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[181] + (arg0 != null ? field4267[2] : field4267[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "T",
      descriptor = "(IIII)V",
      line = 1171
   )
   public final void method586(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field4005;
         boolean var5 = false;
         if (~arg0 < ~this.field4165) {
            this.field4165 = arg0;
            var5 = true;
         }

         if (arg2 < this.field4191) {
            var5 = true;
            this.field4191 = arg2;
         }

         if (~this.field4241 > ~arg1) {
            this.field4241 = arg1;
            var5 = true;
         }

         if (arg3 < this.field4193) {
            this.field4193 = arg3;
            var5 = true;
         }

         if (var5) {
            if (!this.field4265) {
               this.field4265 = true;
               this.method1508(-106);
            }

            this.method1504((byte)-101);
            this.method2232((byte)110);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field4267[61] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "A",
      descriptor = "(ILaa;II)V",
      line = 1220
   )
   public final void method654(int arg0, class96 arg1, int arg2, int arg3) {
      try {
         ++field3966;
         class153 var5 = (class153)arg1;
         class282 var6 = var5.field2289;
         this.method2204((byte)114);
         this.method2193(var6, (byte)-19);
         this.method2244(1, (byte)3);
         this.method2212((byte)119, class453.field6943, class453.field6943);
         this.method2185((byte)-128, 0, class700.field10441);
         this.method2218(arg0, 22121);
         this.field4121.method3920((float)this.field3975, 0.0F, 0, (float)this.field3960);
         this.method2222(50);
         this.field4144[0].method3920(var6.method2363(-28, (float)this.field3975), 1.0F, 0, var6.method2359((float)this.field3960, (byte)32));
         this.field4144[0].method3918(0.0F, var6.method2363(-57, (float)(-arg3)), var6.method2359((float)(-arg2), (byte)32), true);
         this.field4220[0] = class655.field9787;
         this.method2246((byte)83);
         this.method2231(1);
         this.method2233((byte)-47);
         this.method2185((byte)-121, 0, class751.field11122);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field4267[113] + arg0 + ',' + (arg1 != null ? field4267[2] : field4267[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "z",
      descriptor = "()Z",
      line = 1249
   )
   public final boolean method689() {
      try {
         ++field3996;
         return true;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4267[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "t",
      descriptor = "(B)V",
      line = 1259
   )
   private final void method2192(byte arg0) {
      boolean var2 = client.field1786;

      try {
         this.method1460((byte)-20);
         ++field3998;
         this.method1462((byte)-47);
         this.method1450(29866);
         this.method1471((byte)87);
         this.method1485(-1);
         this.method1454(-109);
         this.method1447(3);
         this.method1461((byte)61);
         this.method1490(1);
         this.method1506((byte)-120);
         this.method1446((byte)-128);
         this.method1509(255);
         this.method1492(0);
         this.method1481(3);
         int var3 = this.field4150 + -1;
         if (var2) {
            this.method2220(var3, 14);
            this.method1457((byte)101);
            this.method1467(9);
            this.method2233((byte)-85);
            --var3;
         }

         while(true) {
            while(var3 >= 0) {
               this.method2220(var3, 14);
               this.method1457((byte)101);
               this.method1467(9);
               this.method2233((byte)-85);
               --var3;
            }

            if (!var2) {
               if (arg0 >= -49) {
                  this.method2201((byte)34);
               }

               this.method1478(50);
               this.method1500(true);
               this.method1491(3715);
               this.method1470(0);
               this.method1510(6650);
               return;
            }

            --var3;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4267[135] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Lpr;)V",
      line = 1302
   )
   public final void method667(class331 arg0) {
      try {
         this.field4158 = (class757)arg0;
         ++field4023;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[139] + (arg0 != null ? field4267[2] : field4267[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "K",
      descriptor = "([I)V",
      line = 1310
   )
   public final void method626(int[] arg0) {
      try {
         arg0[2] = this.field4191;
         arg0[3] = this.field4193;
         arg0[1] = this.field4241;
         ++field4071;
         arg0[0] = this.field4165;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[149] + (arg0 != null ? field4267[2] : field4267[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "u",
      descriptor = "()Z",
      line = 1321
   )
   public final boolean method677() {
      try {
         ++field4029;
         return false;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4267[146] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Lwm;B)V",
      line = 1329
   )
   public final void method2193(class428 arg0, byte arg1) {
      try {
         if (this.field4189[this.field4172] != arg0) {
            label30: {
               this.field4189[this.field4172] = arg0;
               if (arg0 == null) {
                  this.method1448(0);
                  if (!client.field1786) {
                     break label30;
                  }
               }

               arg0.method214(76);
            }

            this.field4146 &= -2;
         }

         ++field4067;
         if (arg1 != -19) {
            this.field4257 = null;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[186] + (arg0 != null ? field4267[2] : field4267[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "x",
      descriptor = "()Lkf;",
      line = 1352
   )
   public final class401 method624() {
      try {
         ++field3956;
         return new class504();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4267[112] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "y",
      descriptor = "(B)V",
      line = 1362
   )
   private final void method2194(byte arg0) {
      try {
         ++field4025;
         this.field4233 = false;
         if (this.field4235 != null) {
            this.field4235.method68(10);
         }

         this.method1510(6650);
         int var2 = 7 / ((arg0 - 63) / 53);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[62] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "f",
      descriptor = "(Z)V",
      line = 1380
   )
   private final void method2195(boolean arg0) {
      try {
         if (!arg0) {
            ++field4033;
            if (!this.field4236) {
               label35: {
                  float[] var2 = this.field4142;
                  float var3 = (float)this.field4216;
                  float var4 = (float)this.field4199;
                  float var5 = (float)(-this.field4221) * this.field4224 / (float)this.field4212;
                  float var6 = (float)(-this.field4184) * this.field4224 / (float)this.field4147;
                  float var7 = (float)(this.field3960 - this.field4184) * this.field4224 / (float)this.field4147;
                  float var8 = (float)(this.field3975 - this.field4221) * this.field4224 / (float)this.field4212;
                  if (var6 == var7 || var5 == var8) {
                     var2[15] = 1.0F;
                     var2[12] = 0.0F;
                     var2[13] = 0.0F;
                     var2[10] = 1.0F;
                     var2[8] = 0.0F;
                     var2[4] = 0.0F;
                     var2[1] = 0.0F;
                     var2[0] = 1.0F;
                     var2[14] = 0.0F;
                     var2[2] = 0.0F;
                     var2[6] = 0.0F;
                     var2[11] = 0.0F;
                     var2[9] = 0.0F;
                     var2[7] = 0.0F;
                     var2[5] = 1.0F;
                     var2[3] = 0.0F;
                     if (!client.field1786) {
                        break label35;
                     }
                  }

                  var2[5] = 2.0F / (-var5 + var8);
                  var2[15] = 1.0F;
                  var2[11] = 0.0F;
                  var2[8] = 0.0F;
                  var2[13] = (var5 + var8) / (var8 - var5);
                  var2[3] = 0.0F;
                  var2[14] = var3 / (var3 - var4);
                  var2[4] = 0.0F;
                  var2[1] = 0.0F;
                  var2[9] = 0.0F;
                  var2[12] = (var6 + var7) / (-var7 + var6);
                  var2[7] = 0.0F;
                  var2[2] = 0.0F;
                  var2[0] = 2.0F / (-var6 + var7);
                  var2[6] = 0.0F;
                  var2[10] = 1.0F / (var3 - var4);
               }

               this.method2229(4);
               this.field4236 = true;
            }
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field4267[60] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Lnga;IIII)Lka;",
      line = 1449
   )
   public final class91 method614(class159 arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field3985;
         return new class703(this, arg0, arg1, arg3, arg4, arg2);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field4267[132] + (arg0 != null ? field4267[2] : field4267[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V",
      line = 1460
   )
   public final void method647(Canvas arg0, int arg1, int arg2) {
      try {
         ++field4087;
         Object var4 = null;
         if (arg0 != null && this.field4066 != arg0) {
            if (this.field4038.containsKey(arg0)) {
               var4 = this.field4038.get(arg0);
            }
         } else {
            var4 = this.field3994;
         }

         if (var4 == null) {
            throw new RuntimeException();
         } else {
            this.method1476(14, var4, arg0);
            if (this.field3958 == arg0) {
               this.method2226(70);
            }
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4267[26] + (arg0 != null ? field4267[2] : field4267[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "M",
      descriptor = "()I",
      line = 1486
   )
   public final int method706() {
      try {
         ++field4047;
         return this.field4266;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4267[50] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Lfca;I)V",
      line = 1496
   )
   public final void method641(class43 arg0, int arg1) {
      try {
         this.field4208.method2068(this, arg0, (byte)-50, arg1);
         ++field4018;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[105] + (arg0 != null ? field4267[2] : field4267[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "g",
      descriptor = "(I)V",
      line = 1507
   )
   public final void method676(int arg0) {
      try {
         ++field4113;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "H",
      descriptor = "(I)V",
      line = 1514
   )
   public static final void method2196(int arg0) {
      boolean var1 = client.field1786;

      try {
         ++field3947;
         if (class519.field7897 != 0 && class519.field7897 != 10) {
            try {
               short var2;
               label676: {
                  if (~class742.field11030 != -1) {
                     var2 = 2000;
                     if (!var1) {
                        break label676;
                     }
                  }

                  var2 = 250;
               }

               if (~class12.field156 != -3 || class519.field7897 != 20 && ~class536.field8114 != -43) {
                  ++class768.field11331;
               }

               if (class671.field10005 && class519.field7897 >= 6) {
                  var2 = 6000;
               }

               if (class768.field11331 > var2) {
                  class37.field448.method204((byte)123);
                  if (~class742.field11030 <= -4) {
                     class519.field7897 = 0;
                     class56.method418(-5, (byte)69);
                     return;
                  }

                  label660: {
                     if (class12.field156 == 2) {
                        class154.field2296.method4136(43594);
                        if (!var1) {
                           break label660;
                        }
                     }

                     class663.field9937.method4136(43594);
                  }

                  class519.field7897 = 1;
                  ++class742.field11030;
                  class768.field11331 = 0;
               }

               if (class519.field7897 == 1) {
                  label653: {
                     if (~class12.field156 == -3) {
                        class37.field448.field346 = class154.field2296.method4137(443, class498.field7578);
                        if (!var1) {
                           break label653;
                        }
                     }

                     class37.field448.field346 = class663.field9937.method4137(443, class498.field7578);
                  }

                  class519.field7897 = 2;
               }

               if (class519.field7897 == arg0) {
                  if (class37.field448.field346.field4398 == 2) {
                     throw new IOException();
                  }

                  if (~class37.field448.field346.field4398 != -2) {
                     return;
                  }

                  class577 var3;
                  label643: {
                     class37.field448.field355 = class240.method2042(15000, (Socket)class37.field448.field346.field4401, -1843);
                     class37.field448.field346 = null;
                     class37.field448.method202(arg0 + -2);
                     var3 = class262.method2277(32347);
                     if (class671.field10005) {
                        var3.field8531.method2864(-26110, class389.field6131.field4916);
                        var3.field8531.method2873(0, (byte)-75);
                        int var4 = var3.field8531.field5436;
                        var3.field8531.method2849(659, (byte)-34);
                        if (class12.field156 == 2) {
                           var3.field8531.method2864(-26110, ~class342.field5204 != -15 ? 0 : 1);
                        }

                        class354 var5 = class413.method3309(4);
                        var5.method2864(-26110, class727.field10854);
                        var5.method2873((int)(9.9999999E7D * Math.random()), (byte)110);
                        var5.method2864(-26110, class493.field7455);
                        var5.method2849(class320.field4912, (byte)-34);
                        int var6 = 0;
                        if (var1) {
                           var5.method2849((int)(9.9999999E7D * Math.random()), (byte)-34);
                           ++var6;
                        }

                        while(true) {
                           while(var6 < 6) {
                              var5.method2849((int)(9.9999999E7D * Math.random()), (byte)-34);
                              ++var6;
                           }

                           var5.method2892(-75, class80.field1083);
                           var5.method2864(-26110, class410.field6382.field4824);
                           var5.method2864(arg0 + -26112, (int)(9.9999999E7D * Math.random()));
                           var5.method2878((byte)124, class361.field5587, class371.field5755);
                           var3.field8531.method2858(var5.field5436, 427497672, 0, var5.field5428);
                           var3.field8531.method2882((byte)64, -var4 + var3.field8531.field5436);
                           if (!var1) {
                              if (!var1) {
                                 break label643;
                              }
                              break;
                           }

                           ++var6;
                        }
                     }

                     var3.field8531.method2864(arg0 + -26112, class389.field6120.field4916);
                  }

                  class37.field448.method211(var3, 126);
                  class37.field448.method210(12765);
                  class519.field7897 = 3;
               }

               if (class519.field7897 == 3) {
                  label690: {
                     if (!class37.field448.field355.method1583(1, -77)) {
                        return;
                     }

                     class37.field448.field355.method1584(1, class37.field448.field362.field5428, 0, 29439);
                     int var7 = 255 & class37.field448.field362.field5428[0];
                     if (var7 != 0) {
                        class519.field7897 = 0;
                        class56.method418(var7, (byte)117);
                        class37.field448.method204((byte)125);
                        class722.method5337(113);
                        return;
                     }

                     if (!class671.field10005) {
                        class519.field7897 = 8;
                        if (!var1) {
                           break label690;
                        }
                     }

                     class519.field7897 = 4;
                  }
               }

               if (~class519.field7897 == -5) {
                  if (!class37.field448.field355.method1583(2, -116)) {
                     return;
                  }

                  class37.field448.field355.method1584(2, class37.field448.field362.field5428, 0, arg0 + 29437);
                  class37.field448.field362.field5436 = 0;
                  class37.field448.field362.field5436 = class37.field448.field362.method2848(-99);
                  class519.field7897 = 5;
               }

               if (class519.field7897 == 5) {
                  if (!class37.field448.field355.method1583(class37.field448.field362.field5436, -41)) {
                     return;
                  }

                  class37.field448.field355.method1584(class37.field448.field362.field5436, class37.field448.field362.field5428, 0, 29439);
                  class37.field448.field362.method2871(-4303, class76.field975);
                  class37.field448.field362.field5436 = 0;
                  String var8 = class37.field448.field362.method2847(arg0 ^ 3);
                  class37.field448.field362.field5436 = 0;
                  String var9 = field4267[68];
                  if (!class774.field11383 || ~class785.method5700(var9, 1, arg0 ^ -70, class498.field7578, var8).field4398 == -3) {
                     class78.method736(var9, true, arg0 ^ 23900, class498.field7578, ~class687.field10213.field507.method3440(480102311) == -2, var8);
                  }

                  class519.field7897 = 6;
               }

               if (class519.field7897 == 6) {
                  if (!class37.field448.field355.method1583(1, -56)) {
                     return;
                  }

                  class37.field448.field355.method1584(1, class37.field448.field362.field5428, 0, 29439);
                  if ((class37.field448.field362.field5428[0] & 255) == 1) {
                     class519.field7897 = 7;
                  }
               }

               if (class519.field7897 == 7) {
                  if (!class37.field448.field355.method1583(16, -82)) {
                     return;
                  }

                  class37.field448.field355.method1584(16, class37.field448.field362.field5428, 0, 29439);
                  class37.field448.field362.field5436 = 16;
                  class37.field448.field362.method2871(-4303, class76.field975);
                  class37.field448.field362.field5436 = 0;
                  class722.field10813 = class654.field9782 = class484.method3768((byte)8, class37.field448.field362.method2898(32109));
                  class656.field9800 = class37.field448.field362.method2898(arg0 + 32107);
                  class519.field7897 = 8;
               }

               if (~class519.field7897 == -9) {
                  class577 var10;
                  label694: {
                     class37.field448.field362.field5436 = 0;
                     class37.field448.method202(arg0 + -2);
                     var10 = class262.method2277(32347);
                     class102 var11 = var10.field8531;
                     if (~class12.field156 == -3) {
                        class321 var12;
                        label591: {
                           if (class671.field10005) {
                              var12 = class389.field6132;
                              if (!var1) {
                                 break label591;
                              }
                           }

                           var12 = class389.field6122;
                        }

                        var11.method2864(-26110, var12.field4916);
                        var11.method2873(0, (byte)112);
                        int var13 = var11.field5436;
                        int var14 = var11.field5436;
                        if (!class671.field10005) {
                           var11.method2849(659, (byte)-34);
                           var11.method2864(arg0 ^ -26112, class342.field5204 != 14 ? 0 : 1);
                           int var15 = var11.field5436;
                           class354 var16 = class156.method1405((byte)39);
                           var11.method2858(var16.field5436, arg0 + 427497670, 0, var16.field5428);
                           var14 = var11.field5436;
                           var11.method2862(class722.field10813, true);
                        }

                        var11.method2864(-26110, class444.field6812);
                        var11.method2864(arg0 + -26112, class187.method1682((byte)-30));
                        var11.method2873(class316.field4878, (byte)122);
                        var11.method2873(class692.field10301, (byte)117);
                        var11.method2864(-26110, class687.field10213.field533.method1746(480102311));
                        class29.method201(var11, (byte)-114);
                        var11.method2862(class518.field7891, true);
                        var11.method2849(class320.field4912, (byte)-34);
                        class354 var17 = class687.field10213.method291((byte)-90);
                        var11.method2864(arg0 ^ -26112, var17.field5436);
                        var11.method2858(var17.field5436, 427497672, 0, var17.field5428);
                        class11.field135 = true;
                        class354 var18 = new class354(class610.field8885.method4625((byte)-87));
                        class610.field8885.method4624(0, var18);
                        var11.method2858(var18.field5428.length, 427497672, 0, var18.field5428);
                        var11.method2849(class756.field11198, (byte)-34);
                        var11.method2892(arg0 ^ -19, class5.field28);
                        var11.method2864(-26110, class395.field6192 != null ? 1 : 0);
                        if (class395.field6192 != null) {
                           var11.method2862(class395.field6192, true);
                        }

                        var11.method2864(-26110, !class505.method3924(126, field4267[73]) ? 0 : 1);
                        var11.method2864(-26110, !class774.field11383 ? 0 : 1);
                        class174.method1600((byte)99, var11);
                        var11.method2844(var11.field5436, var14, class76.field975, 1);
                        var11.method2882((byte)116, var11.field5436 - var13);
                        if (!var1) {
                           break label694;
                        }
                     }

                     class321 var19;
                     label586: {
                        if (!class671.field10005) {
                           var19 = class389.field6124;
                           if (!var1) {
                              break label586;
                           }
                        }

                        var19 = class389.field6132;
                     }

                     var11.method2864(arg0 ^ -26112, var19.field4916);
                     var11.method2873(0, (byte)92);
                     int var20 = var11.field5436;
                     int var21 = var11.field5436;
                     if (!class671.field10005) {
                        var11.method2849(659, (byte)-34);
                        class354 var22 = class156.method1405((byte)6);
                        var11.method2858(var22.field5436, 427497672, 0, var22.field5428);
                        var21 = var11.field5436;
                        var11.method2862(class722.field10813, true);
                     }

                     var11.method2864(arg0 ^ -26112, class410.field6382.field4824);
                     var11.method2864(-26110, class493.field7455);
                     class29.method201(var11, (byte)-114);
                     var11.method2862(class518.field7891, true);
                     var11.method2849(class320.field4912, (byte)-34);
                     class174.method1600((byte)99, var11);
                     var11.method2844(var11.field5436, var21, class76.field975, 1);
                     var11.method2882((byte)86, -var20 + var11.field5436);
                  }

                  class37.field448.method211(var10, arg0 ^ 124);
                  class37.field448.method210(12765);
                  class37.field448.field361 = new class378(class76.field975);
                  int var23 = 0;
                  if (var1) {
                     class76.field975[var23] += 50;
                     ++var23;
                  }

                  while(true) {
                     while(var23 < 4) {
                        class76.field975[var23] += 50;
                        ++var23;
                     }

                     class37.field448.field362.method985(class76.field975, arg0 + -1);
                     class519.field7897 = 9;
                     if (!var1) {
                        class76.field975 = null;
                        break;
                     }

                     ++var23;
                  }
               }

               int var24;
               label760: {
                  if (class519.field7897 == 9) {
                     label720: {
                        if (!class37.field448.field355.method1583(1, arg0 ^ -64)) {
                           return;
                        }

                        class37.field448.field355.method1584(1, class37.field448.field362.field5428, 0, 29439);
                        var24 = 255 & class37.field448.field362.field5428[0];
                        if (var24 == 21) {
                           class519.field7897 = 12;
                           if (!var1) {
                              break label720;
                           }
                        }

                        if (~var24 != -30 && var24 != 45) {
                           label700: {
                              if (var24 == 1) {
                                 class519.field7897 = 10;
                                 class56.method418(var24, (byte)103);
                                 return;
                              }

                              if (~var24 == -3) {
                                 class519.field7897 = 13;
                                 if (!var1) {
                                    break label700;
                                 }
                              }

                              if (~var24 != -16) {
                                 break label760;
                              }

                              class37.field448.field370 = -2;
                              class519.field7897 = 19;
                              if (var1) {
                                 break label760;
                              }
                           }
                        } else {
                           class408.field6358 = var24;
                           class519.field7897 = 18;
                        }
                     }
                  }

                  if (class519.field7897 == 11) {
                     class37.field448.method202(arg0 + -2);
                     class577 var25 = class262.method2277(32347);
                     class102 var26 = var25.field8531;
                     var26.method992(class37.field448.field361, (byte)29);
                     var26.method997(8, class389.field6128.field4916);
                     class37.field448.method211(var25, 121);
                     class37.field448.method210(12765);
                     class519.field7897 = 9;
                     return;
                  }

                  if (class519.field7897 == 12) {
                     if (!class37.field448.field355.method1583(1, arg0 ^ -111)) {
                        return;
                     }

                     class37.field448.field355.method1584(1, class37.field448.field362.field5428, 0, 29439);
                     int var27 = class37.field448.field362.field5428[0] & 255;
                     class492.field7434 = var27 * 50;
                     class519.field7897 = 0;
                     class56.method418(21, (byte)108);
                     class37.field448.field355.method1579(arg0 + -130);
                     class37.field448.field355 = null;
                     class722.method5337(124);
                     return;
                  }

                  if (~class519.field7897 == -21) {
                     if (!class37.field448.field355.method1583(2, -47)) {
                        return;
                     }

                     class37.field448.field355.method1584(2, class37.field448.field362.field5428, 0, 29439);
                     class615.field8931 = ((class37.field448.field362.field5428[0] & 255) << 8) + (class37.field448.field362.field5428[1] & 255);
                     class519.field7897 = 9;
                     return;
                  }

                  if (class519.field7897 == 18) {
                     if (~class408.field6358 != -30) {
                        if (class408.field6358 != 45) {
                           throw new IllegalStateException(field4267[74] + class408.field6358);
                        }

                        if (!class37.field448.field355.method1583(3, -89)) {
                           return;
                        }

                        class37.field448.field355.method1584(3, class37.field448.field362.field5428, 0, 29439);
                        class705.field10621 = (class37.field448.field362.field5428[1] << 8 & 65280) + (255 & class37.field448.field362.field5428[2]);
                        class115.field1560 = class37.field448.field362.field5428[0] & 255;
                        if (var1) {
                           throw new IllegalStateException(field4267[74] + class408.field6358);
                        }
                     } else {
                        if (!class37.field448.field355.method1583(1, arg0 + -86)) {
                           return;
                        }

                        class37.field448.field355.method1584(1, class37.field448.field362.field5428, 0, 29439);
                        class115.field1560 = class37.field448.field362.field5428[0] & 255;
                     }

                     class519.field7897 = 0;
                     class56.method418(class408.field6358, (byte)117);
                     class37.field448.field355.method1579(-128);
                     class37.field448.field355 = null;
                     class722.method5337(111);
                     return;
                  }

                  if (class519.field7897 == 13) {
                     if (!class37.field448.field355.method1583(1, -113)) {
                        return;
                     }

                     class37.field448.field355.method1584(1, class37.field448.field362.field5428, 0, arg0 ^ 29437);
                     class519.field7897 = 14;
                     class300.field4710 = class37.field448.field362.field5428[0] & 255;
                     return;
                  }

                  label751: {
                     if (class519.field7897 == 14) {
                        label704: {
                           class102 var28 = class37.field448.field362;
                           if (class12.field156 != 2) {
                              if (!class37.field448.field355.method1583(class300.field4710, -106)) {
                                 return;
                              }

                              class37.field448.field355.method1584(class300.field4710, var28.field5428, 0, 29439);
                              var28.field5436 = 0;
                              class487.field7404 = var28.method2855(arg0 ^ -31005);
                              class742.field11029 = var28.method2855(-31007);
                              class563.field8371 = ~var28.method2855(-31007) == -2;
                              class206.field3126 = var28.method2855(-31007) == 1;
                              class502.field7672 = var28.method2855(-31007) == 1;
                              class555.field8286 = var28.method2898(32109);
                              class364.field5627 = -class162.method1442(arg0 ^ 14082) + (class555.field8286 - var28.method2851(arg0 ^ -1575235742));
                              int var29 = var28.method2855(-31007);
                              class769.field11337 = ~(var29 & 2) != -1;
                              class197.field3035 = ~(1 & var29) != -1;
                              class242.field3679 = var28.method2894(108);
                              class459.field7005 = var28.method2855(-31007) == 1;
                              class302.field4726 = var28.method2894(99);
                              class189.field2940 = var28.method2848(arg0 ^ -95);
                              class136.field1988 = var28.method2848(-93);
                              class506.field7755 = var28.method2848(-99);
                              class396.field6214 = var28.method2894(123);
                              class614.field8916 = class498.field7578.method2423(class396.field6214, (byte)34);
                              class671.field10010 = var28.method2855(-31007);
                              class23.field292 = var28.method2848(arg0 + -130);
                              class333.field5133 = var28.method2848(-123);
                              class47.field620 = ~var28.method2855(arg0 ^ -31005) == -2;
                              class476.field7251.field67 = class476.field7251.field77 = class210.field3193 = var28.method2847(1);
                              class598.field8775 = var28.method2855(arg0 ^ -31005);
                              class637.field9221 = var28.method2894(111);
                              class171.field2604 = var28.method2855(-31007) == 1;
                              class756.field11207 = new class541();
                              class756.field11207.field8150 = var28.method2848(arg0 ^ -119);
                              if (~class756.field11207.field8150 == -65536) {
                                 class756.field11207.field8150 = -1;
                              }

                              class756.field11207.field8152 = var28.method2847(1);
                              if (class657.field9823 != class129.field1852) {
                                 class756.field11207.field8155 = class756.field11207.field8150 + 40000;
                                 class756.field11207.field8154 = class756.field11207.field8150 + 50000;
                              }

                              if (class657.field9823 == class129.field1851 || class657.field9823 == class169.field2583 && class487.field7404 >= 2 || !class154.field2296.method4135(class546.field8194, (byte)29)) {
                                 break label704;
                              }

                              class544.method4152(114);
                              if (!var1) {
                                 break label704;
                              }
                           }

                           if (!class37.field448.field355.method1583(class300.field4710, -47)) {
                              return;
                           }

                           class37.field448.field355.method1584(class300.field4710, var28.field5428, 0, 29439);
                           var28.field5436 = 0;
                           class487.field7404 = var28.method2855(-31007);
                           class742.field11029 = var28.method2855(-31007);
                           class563.field8371 = ~var28.method2855(arg0 ^ -31005) == -2;
                           class206.field3126 = ~var28.method2855(-31007) == -2;
                           class502.field7672 = var28.method2855(-31007) == 1;
                           class589.field8686 = ~var28.method2855(-31007) == -2;
                           class315.field4864 = var28.method2848(arg0 ^ -119);
                           class197.field3035 = var28.method2855(arg0 + -31009) == 1;
                           class633.field9160 = var28.method2845(-6);
                           class373.field5773 = var28.method2855(-31007) == 1;
                           class102.field1434.method1414(class373.field5773, 127);
                           class247.field3763.method2051(-1, class373.field5773);
                           class412.field6401.method786(class373.field5773, 93);
                        }

                        label754: {
                           if (class563.field8371 && !class502.field7672 || class197.field3035) {
                              try {
                                 class676.method4989(class684.field10176, field4267[72], -23226);
                                 break label754;
                              } catch (Throwable var37) {
                                 if (!class70.field922) {
                                    break label754;
                                 }

                                 try {
                                    class684.field10176.getAppletContext().showDocument(new URL(class684.field10176.getCodeBase(), field4267[69]), field4267[64]);
                                    break label754;
                                 } catch (Exception var36) {
                                    if (!var1) {
                                       break label754;
                                    }
                                 }
                              }
                           }

                           try {
                              class676.method4989(class684.field10176, field4267[67], -23226);
                           } catch (Throwable var35) {
                           }
                        }

                        if (class657.field9823 == class129.field1852) {
                           try {
                              class676.method4989(class684.field10176, field4267[71], -23226);
                           } catch (Throwable var34) {
                           }
                        }

                        if (~class12.field156 != -3) {
                           break label751;
                        }

                        class519.field7897 = 16;
                        if (var1) {
                           break label751;
                        }
                     }

                     if (class519.field7897 == 16) {
                        if (!class37.field448.field355.method1583(3, -116)) {
                           return;
                        }

                        class37.field448.field355.method1584(3, class37.field448.field362.field5428, 0, arg0 ^ 29437);
                        class519.field7897 = 17;
                     }

                     if (class519.field7897 == 17) {
                        class102 var30 = class37.field448.field362;
                        var30.field5436 = 0;
                        if (var30.method996(arg0 ^ -126)) {
                           if (!class37.field448.field355.method1583(1, -126)) {
                              return;
                           }

                           class37.field448.field355.method1584(1, var30.field5428, 3, 29439);
                        }

                        class37.field448.field373 = class295.method2482(-105)[var30.method990(-124)];
                        class37.field448.field370 = var30.method2848(-111);
                        class519.field7897 = 15;
                     }

                     if (class519.field7897 == 15) {
                        if (!class37.field448.field355.method1583(class37.field448.field370, -115)) {
                           return;
                        }

                        int var31;
                        label470: {
                           class37.field448.field355.method1584(class37.field448.field370, class37.field448.field362.field5428, 0, 29439);
                           class37.field448.field362.field5436 = 0;
                           class519.field7897 = 0;
                           var31 = class37.field448.field370;
                           class56.method418(2, (byte)117);
                           class639.method4666(true);
                           class558.method4224(class37.field448.field362, arg0 ^ 5998);
                           class335.field5146 = -1;
                           if (class271.field4381 != class37.field448.field373) {
                              class451.method3539((byte)-127);
                              if (!var1) {
                                 break label470;
                              }
                           }

                           class222.method1915(true);
                        }

                        if (~class37.field448.field362.field5436 != ~var31) {
                           throw new RuntimeException(field4267[70] + class37.field448.field362.field5436 + field4267[66] + var31);
                        }

                        class37.field448.field373 = null;
                        return;
                     }

                     if (class519.field7897 == 19) {
                        if (class37.field448.field370 == -2) {
                           if (!class37.field448.field355.method1583(2, arg0 + -106)) {
                              return;
                           }

                           class37.field448.field355.method1584(2, class37.field448.field362.field5428, 0, 29439);
                           class37.field448.field362.field5436 = 0;
                           class37.field448.field370 = class37.field448.field362.method2848(-103);
                        }

                        if (!class37.field448.field355.method1583(class37.field448.field370, -86)) {
                           return;
                        }

                        class37.field448.field355.method1584(class37.field448.field370, class37.field448.field362.field5428, 0, arg0 + 29437);
                        class37.field448.field362.field5436 = 0;
                        class519.field7897 = 0;
                        int var32 = class37.field448.field370;
                        class56.method418(15, (byte)116);
                        class425.method3370(39);
                        class558.method4224(class37.field448.field362, arg0 + 5994);
                        if (~class37.field448.field362.field5436 != ~var32) {
                           throw new RuntimeException(field4267[65] + class37.field448.field362.field5436 + field4267[66] + var32);
                        }

                        class37.field448.field373 = null;
                        return;
                     }

                     return;
                  }

                  class519.field7897 = 0;
                  class56.method418(2, (byte)108);
                  class183.method1660((byte)108);
                  class69.method532(1, 7);
                  class37.field448.field373 = null;
                  return;
               }

               if (~var24 == -24 && ~class742.field11030 > -4) {
                  ++class742.field11030;
                  class519.field7897 = 1;
                  class768.field11331 = 0;
                  class37.field448.field355.method1579(-128);
                  class37.field448.field355 = null;
               } else if (~var24 == -43) {
                  class519.field7897 = 20;
                  class56.method418(var24, (byte)83);
               } else if (class361.field5596 && !class671.field10005 && ~class727.field10854 != 0 && var24 == 35) {
                  class768.field11331 = 0;
                  class671.field10005 = true;
                  class519.field7897 = 1;
                  class37.field448.field355.method1579(-128);
                  class37.field448.field355 = null;
               } else {
                  class519.field7897 = 0;
                  class56.method418(var24, (byte)103);
                  class37.field448.field355.method1579(-128);
                  class37.field448.field355 = null;
                  class722.method5337(114);
               }
            } catch (IOException var38) {
               class37.field448.method204((byte)115);
               if (class742.field11030 < 3) {
                  label453: {
                     if (~class12.field156 != -3) {
                        class663.field9937.method4136(43594);
                        if (!var1) {
                           break label453;
                        }
                     }

                     class154.field2296.method4136(43594);
                  }

                  class519.field7897 = 1;
                  class768.field11331 = 0;
                  ++class742.field11030;
               } else {
                  class519.field7897 = 0;
                  class56.method418(-4, (byte)91);
                  class722.method5337(arg0 ^ 120);
               }
            }
         }
      } catch (RuntimeException var39) {
         throw class482.method3757(var39, field4267[63] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "r",
      descriptor = "(B)V",
      line = 2272
   )
   private final void method2197(byte arg0) {
      try {
         if (arg0 != 119) {
            this.method1463(75, (Canvas)null);
         }

         if (!this.field4176) {
            label33: {
               float[] var2 = this.field4209;
               float var3 = (float)(-this.field4184 * this.field4216) / (float)this.field4147;
               float var4 = (float)((-this.field4184 + this.field3960) * this.field4216) / (float)this.field4147;
               float var5 = (float)(this.field4221 * this.field4216) / (float)this.field4212;
               float var6 = (float)((this.field4221 - this.field3975) * this.field4216) / (float)this.field4212;
               if (var3 == var4 || var5 == var6) {
                  var2[12] = 0.0F;
                  var2[1] = 0.0F;
                  var2[15] = 1.0F;
                  var2[6] = 0.0F;
                  var2[3] = 0.0F;
                  var2[5] = 1.0F;
                  var2[14] = 0.0F;
                  var2[13] = 0.0F;
                  var2[0] = 1.0F;
                  var2[8] = 0.0F;
                  var2[9] = 0.0F;
                  var2[7] = 0.0F;
                  var2[4] = 0.0F;
                  var2[2] = 0.0F;
                  var2[11] = 0.0F;
                  var2[10] = 1.0F;
                  if (!client.field1786) {
                     break label33;
                  }
               }

               float var7 = (float)this.field4216 * 2.0F;
               var2[4] = 0.0F;
               var2[11] = -1.0F;
               var2[15] = 0.0F;
               var2[1] = 0.0F;
               var2[7] = 0.0F;
               var2[0] = var7 / (-var3 + var4);
               var2[12] = 0.0F;
               var2[3] = 0.0F;
               var2[10] = this.field4152 = (float)this.field4199 / (float)(-this.field4199 + this.field4216);
               var2[6] = 0.0F;
               var2[14] = this.field4162 = (float)(this.field4216 * this.field4199) / (float)(-this.field4199 + this.field4216);
               var2[13] = 0.0F;
               var2[5] = var7 / (var5 - var6);
               var2[2] = 0.0F;
               var2[8] = (var3 + var4) / (-var3 + var4);
               var2[9] = (var5 + var6) / (var5 - var6);
            }

            this.method2198((byte)62);
            this.field4176 = true;
         }

         ++field4095;
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field4267[40] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "p",
      descriptor = "(B)V",
      line = 2340
   )
   private final void method2198(byte arg0) {
      try {
         this.field4209[10] = this.field4152;
         this.field4209[14] = this.field4162;
         ++field4024;
         if (arg0 == 62) {
            this.field4148 = (this.field4209[14] + (float)(-this.field4199)) / this.field4209[10];
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "J",
      descriptor = "(I)V",
      line = 2359
   )
   public final void method2199(int arg0) {
      try {
         if (this.field4146 != 4) {
            this.method2181(62);
            this.method2209(false, false);
            this.method2234(false, 14);
            this.method2228(-8841, false);
            this.method2219(false, 116);
            this.method2191(0, -2, false, false);
            this.method2244(1, (byte)23);
            this.method2255(0, (byte)90);
            this.field4146 = 4;
         }

         ++field4097;
         if (arg0 != 1) {
            this.field4213 = 1.0118794F;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[31] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "A",
      descriptor = "(I)Lkr;",
      line = 2389
   )
   public final class504 method2200(int arg0) {
      try {
         ++field4049;
         if (!this.field4233) {
            this.field4141.method3913(this.field4139, this.field4121);
            this.field4233 = true;
         }

         if (arg0 != 255) {
            this.field4191 = 24;
         }

         return this.field4141;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[129] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "d",
      descriptor = "(B)I",
      line = 2407
   )
   public final int method2201(byte arg0) {
      try {
         if (arg0 > -52) {
            this.field4179 = false;
         }

         ++field3978;
         return this.field4167;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[158] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(ZZIZII)V",
      line = 2420
   )
   private final void method2202(boolean arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5) {
      try {
         ++field4001;
         boolean var9 = arg3 & this.method585();
         if (!var9 && (~arg2 == -5 || ~arg2 == -9 || ~arg2 == -10)) {
            arg2 = 2;
            arg5 = arg2 == 4 ? arg4 & 1 : 1;
            arg4 = 0;
         }

         if (arg1) {
            this.method614((class159)null, -78, 68, -82, -80);
         }

         if (arg2 != 0 && arg0) {
            arg2 |= Integer.MIN_VALUE;
         }

         if (this.field4204 != arg2) {
            if (~this.field4204 != -1) {
               this.field4229[this.field4204 & Integer.MAX_VALUE].method72(-2);
            }

            label50: {
               if (arg2 != 0) {
                  this.field4235 = this.field4229[arg2 & Integer.MAX_VALUE];
                  this.field4235.method73(arg0, (byte)-49);
                  this.field4235.method78((byte)111, arg0);
                  this.field4235.method67((byte)90, arg5, arg4);
                  if (!client.field1786) {
                     break label50;
                  }
               }

               this.field4235 = null;
            }

            this.field4196 = arg5;
            this.field4204 = arg2;
            this.field4231 = arg4;
         } else if (~this.field4204 != -1) {
            this.field4229[Integer.MAX_VALUE & this.field4204].method78((byte)127, arg0);
            if (this.field4231 != arg4 || ~this.field4196 != ~arg5) {
               this.field4229[this.field4204 & Integer.MAX_VALUE].method67((byte)90, arg5, arg4);
               this.field4231 = arg4;
               this.field4196 = arg5;
            }

         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field4267[159] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "L",
      descriptor = "(III)V",
      line = 2476
   )
   public final void method627(int arg0, int arg1, int arg2) {
      try {
         ++field4046;
         if (~this.field4219 != ~arg0 || this.field4169 != arg1 || ~this.field4143 != ~arg2) {
            this.field4143 = arg2;
            this.field4219 = arg0;
            this.field4169 = arg1;
            this.method2239(3);
            this.method1506((byte)-104);
         }

      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4267[130] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "e",
      descriptor = "()Z",
      line = 2495
   )
   public final boolean method662() {
      try {
         ++field4131;
         return this.field4227;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4267[161] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "b",
      descriptor = "(ZI)V",
      line = 2506
   )
   public final void method2203(boolean arg0, int arg1) {
      try {
         if (arg0 == !this.field4202) {
            this.field4202 = arg0;
            this.method1506((byte)-125);
         }

         if (arg1 == 3) {
            ++field4109;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[172] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Lfca;)V",
      line = 2523
   )
   public final void method652(class43 arg0) {
      try {
         this.field4208.method2068(this, arg0, (byte)-48, -1);
         ++field3957;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[114] + (arg0 != null ? field4267[2] : field4267[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "f",
      descriptor = "(I)V",
      line = 2535
   )
   public final void method645(int arg0) {
      try {
         ++field4061;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[173] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(IIZ)Ljq;",
      line = 2542
   )
   public final class672 method697(int arg0, int arg1, boolean arg2) {
      try {
         ++field4002;
         return new class247(this, arg0, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4267[155] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "A",
      descriptor = "(B)V",
      line = 2556
   )
   public final void method2204(byte arg0) {
      try {
         if (arg0 >= 49) {
            if (this.field4146 != 2) {
               this.method2181(67);
               this.method2209(false, false);
               this.method2234(false, 14);
               this.method2228(-8841, false);
               this.method2219(false, 124);
               this.method2191(0, -2, false, false);
               this.field4146 = 2;
            }

            ++field4100;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[97] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "g",
      descriptor = "(Z)V",
      line = 2577
   )
   public final void method2205(boolean arg0) {
      try {
         this.field4121.method1551();
         ++field4117;
         this.field4123 = arg0;
         this.method2243(111);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "v",
      descriptor = "(B)V",
      line = 2588
   )
   public void method1471(byte arg0) {
      try {
         if (arg0 != 87) {
            this.field4205 = true;
         }

         this.field4198 = this.field4232;
         ++field4092;
         this.field4232 = 0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[99] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(I)V",
      line = 2600
   )
   public void method681(int arg0) {
      try {
         ++field3980;
         if (this.field4234 != null) {
            this.field4234.method712((byte)17);
         }

         this.field4155 = arg0 & Integer.MAX_VALUE;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[36] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "p",
      descriptor = "()Z",
      line = 2613
   )
   public final boolean method610() {
      try {
         ++field4127;
         return true;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4267[136] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(ZBI)Ljaclib/memory/heap/NativeHeapBuffer;",
      line = 2622
   )
   public final NativeHeapBuffer method2206(boolean arg0, byte arg1, int arg2) {
      try {
         if (arg1 != -37) {
            this.method645(53);
         }

         ++field4072;
         return this.field4120.method5236(arg2, arg0);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4267[54] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "()Z",
      line = 2639
   )
   public final boolean method585() {
      try {
         ++field4101;
         return this.field4229[3].method69((byte)120);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4267[76] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "([FI)[F",
      line = 2647
   )
   public final float[] method2207(float[] arg0, int arg1) {
      try {
         arg0[0] = this.field4154[0];
         ++field4111;
         arg0[8] = this.field4154[2];
         arg0[12] = this.field4154[3];
         arg0[4] = this.field4154[1];
         arg0[arg1] = this.field4154[4];
         arg0[9] = this.field4154[6];
         arg0[13] = this.field4154[7];
         arg0[2] = this.field4154[8];
         arg0[5] = this.field4154[5];
         arg0[10] = this.field4154[10];
         arg0[7] = this.field4154[13];
         arg0[6] = this.field4154[9];
         arg0[14] = this.field4154[11];
         arg0[3] = this.field4154[12];
         arg0[11] = this.field4154[14];
         arg0[15] = this.field4154[15];
         return arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[75] + (arg0 != null ? field4267[2] : field4267[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "g",
      descriptor = "(B)V",
      line = 2672
   )
   private final void method2208(byte arg0) {
      try {
         int var2 = -68 % ((46 - arg0) / 54);
         this.field4257 = this.method1472(true, 112);
         ++field3974;
         this.field4257.method1537(12, 24, 22251);
         this.field4253 = this.method1452(new class570[]{new class570(class42.field552)}, (byte)1);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[177] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "b",
      descriptor = "(ZZ)V",
      line = 2687
   )
   public final void method2209(boolean arg0, boolean arg1) {
      try {
         if (arg0) {
            this.field4167 = 52;
         }

         ++field3965;
         if (!arg1 == this.field4157) {
            this.field4157 = arg1;
            this.method1506((byte)47);
            this.field4146 &= -32;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[89] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "w",
      descriptor = "()Z",
      line = 2706
   )
   public final boolean method587() {
      try {
         ++field3992;
         return false;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4267[43] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "p",
      descriptor = "(I)I",
      line = 2714
   )
   public final int method2210(int arg0) {
      try {
         if (arg0 != -9155) {
            this.field4193 = 120;
         }

         ++field4083;
         return this.field4183;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[119] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "l",
      descriptor = "(I)[F",
      line = 2727
   )
   public final float[] method2211(int arg0) {
      try {
         if (arg0 != 1) {
            return null;
         } else {
            ++field3995;
            return this.field4222;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[125] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(BLhf;Lhf;)V",
      line = 2738
   )
   public final void method2212(byte arg0, class588 arg1, class588 arg2) {
      try {
         if (arg0 != 119) {
            this.method663(-114, 95, -104, -42, 119);
         }

         ++field3949;
         boolean var4 = false;
         if (this.field4237[this.field4172] != arg1) {
            this.field4237[this.field4172] = arg1;
            this.method1457((byte)106);
            var4 = true;
         }

         if (this.field4185[this.field4172] != arg2) {
            this.field4185[this.field4172] = arg2;
            var4 = true;
            this.method1467(9);
         }

         if (var4) {
            this.field4146 &= -30;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4267[84] + arg0 + ',' + (arg1 != null ? field4267[2] : field4267[1]) + ',' + (arg2 != null ? field4267[2] : field4267[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "d",
      descriptor = "(IB)Llga;",
      line = 2773
   )
   public class550 method1498(int arg0, byte arg1) {
      try {
         ++field4010;
         if (arg1 != 125) {
            return null;
         } else {
            if (~arg0 != -7) {
               if (arg0 == 1) {
                  return new class235(this);
               }

               if (~arg0 == -3) {
                  return new class149(this, this.field4082);
               }

               if (~arg0 != -8) {
                  return new class263(this);
               }

               if (!client.field1786) {
                  return new class662(this);
               }
            }

            return new class576(this);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4267[184] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "KA",
      descriptor = "(IIII)V",
      line = 2824
   )
   public final void method629(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field4129;
         if (arg0 <= 0 && ~(this.field3960 + -1) >= ~arg2 && ~arg1 >= -1 && arg3 >= this.field3975 + -1) {
            this.method701();
         } else {
            this.field4241 = ~arg1 > -1 ? 0 : arg1;
            this.field4193 = ~this.field3960 > ~arg3 ? 0 : arg3;
            this.field4191 = this.field3960 < arg2 ? 0 : arg2;
            this.field4165 = ~arg0 <= -1 ? arg0 : 0;
            if (!this.field4265) {
               this.field4265 = true;
               this.method1508(-99);
            }

            this.method1504((byte)-101);
            this.method2232((byte)91);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4267[153] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(ZB)V",
      line = 2850
   )
   public final void method2213(boolean arg0, byte arg1) {
      try {
         if (!arg0 != !this.field4206) {
            this.field4206 = arg0;
            this.method1447(3);
         }

         ++field4040;
         if (arg1 != 120) {
            this.method2178(0.44265008F, -29);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[100] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(I[Llja;)V",
      line = 2869
   )
   public final void method696(int arg0, class404[] arg1) {
      boolean var3 = client.field1786;

      try {
         ++field3984;
         int var4 = 0;
         if (var3) {
            this.field4190[var4] = arg1[var4];
            ++var4;
         }

         while(true) {
            class258 var10000;
            if (~arg0 >= ~var4) {
               this.field4232 = arg0;
               var10000 = this;
               if (!var3) {
                  if (this.field4188.method16((byte)86)) {
                     this.method1471((byte)87);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = this;
            }

            var10000.field4190[var4] = arg1[var4];
            ++var4;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4267[183] + arg0 + ',' + (arg1 != null ? field4267[2] : field4267[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(IZILeh;B[B)Lbc;",
      line = 2893
   )
   public final class282 method2214(int arg0, boolean arg1, int arg2, class19 arg3, byte arg4, byte[] arg5) {
      try {
         ++field3954;
         if (arg4 != 75) {
            this.method1458((byte)14, 37);
         }

         return this.method1503(arg3, arg2, 0, arg4 ^ -50, arg5, 0, arg1, arg0);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field4267[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4267[2] : field4267[1]) + ',' + arg4 + ',' + (arg5 != null ? field4267[2] : field4267[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "c",
      descriptor = "(I)V",
      line = 2905
   )
   public final void method694(int arg0) {
      try {
         ++field3987;
         if (~arg0 <= -129 && arg0 <= 1024) {
            if (this.field4234 != null) {
               this.field4234.method715(-44);
            }

            this.field4159 = arg0;
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[156] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "d",
      descriptor = "(Z)Lkr;",
      line = 2920
   )
   public final class504 method2215(boolean arg0) {
      try {
         ++field4115;
         if (!arg0) {
            this.field4217 = 66;
         }

         return this.field4140;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[115] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "e",
      descriptor = "(B)V",
      line = 2934
   )
   private final void method2216(byte arg0) {
      try {
         ++field4112;
         this.field4176 = false;
         this.method2197((byte)119);
         if (class225.field3424 == this.field4188) {
            this.method2176(0);
         }

         if (arg0 <= 85) {
            this.field3961 = null;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[151] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(IZ)V",
      line = 2950
   )
   public final void method2217(int arg0, boolean arg1) {
      try {
         if (this.field4242 != arg1) {
            this.field4242 = arg1;
            this.method1450(29866);
         }

         if (arg0 == 15) {
            ++field4006;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[127] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;",
      line = 2967
   )
   public final class271 method612(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      try {
         ++field3973;
         return new class121(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field4267[59] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4267[2] : field4267[1]) + ',' + (arg3 != null ? field4267[2] : field4267[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "h",
      descriptor = "(II)V",
      line = 2980
   )
   public final void method2218(int arg0, int arg1) {
      try {
         ++field4007;
         if (this.field4195 != arg0) {
            this.field4195 = arg0;
            this.method1478(37);
         }

         if (arg1 != 22121) {
            this.method2222(-27);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[94] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "d",
      descriptor = "(ZI)V",
      line = 2999
   )
   public final void method2219(boolean arg0, int arg1) {
      try {
         if (this.field4239 != arg0) {
            this.field4239 = arg0;
            this.method1490(1);
            this.field4146 &= -32;
         }

         int var3 = 61 / ((53 - arg1) / 57);
         ++field3990;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4267[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "g",
      descriptor = "(II)V",
      line = 3017
   )
   public final void method2220(int arg0, int arg1) {
      try {
         if (~this.field4172 != ~arg0) {
            this.field4172 = arg0;
            this.method1468(0);
         }

         ++field4053;
         if (arg1 != 14) {
            this.method1475((class742)null, -22);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[82] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(IBLvv;)V",
      line = 3035
   )
   public final void method2221(int arg0, byte arg1, class308 arg2) {
      try {
         if (arg1 != 51) {
            this.method659(-79, -114, 103, 7, -119, -95, -114, -28, 58);
         }

         this.method1483(arg2, (byte)-125, arg0, false);
         ++field4009;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4267[55] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4267[2] : field4267[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "B",
      descriptor = "(I)V",
      line = 3051
   )
   public final void method2222(int arg0) {
      try {
         ++field4078;
         if (arg0 == 50) {
            this.field4123 = false;
            this.method2243(arg0 ^ -27);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[133] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "M",
      descriptor = "(I)Lan;",
      line = 3063
   )
   public final class496 method2223(int arg0) {
      try {
         ++field4107;
         if (arg0 != 16) {
            this.field4149 = 74;
         }

         return this.field4158 != null ? this.field4158.method3169(arg0 ^ 106) : null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[45] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "da",
      descriptor = "(III[I)V",
      line = 3074
   )
   public final void method700(int arg0, int arg1, int arg2, int[] arg3) {
      try {
         float var5;
         int var6;
         int var7;
         label25: {
            ++field4021;
            var5 = this.field4136.method3900(1, (float)arg1, (float)arg0, (float)arg2);
            if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
               var6 = this.field4184;
               var7 = this.field4221;
               if (!client.field1786) {
                  break label25;
               }
            }

            var6 = (int)((float)this.field4147 * this.field4136.method3908((float)arg1, (float)arg0, (byte)123, (float)arg2) / var5);
            var7 = (int)((float)this.field4212 * this.field4136.method3898((float)arg2, (byte)118, (float)arg1, (float)arg0) / var5);
         }

         arg3[0] = (int)((float)var6 + -this.field4207);
         arg3[1] = (int)((float)var7 - this.field4168);
         arg3[2] = (int)var5;
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field4267[78] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4267[2] : field4267[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V",
      line = 3102
   )
   public final void method579(Canvas arg0) {
      try {
         label37: {
            ++field3946;
            this.field3994 = null;
            this.field3958 = null;
            if (arg0 != null && this.field4066 != arg0) {
               if (!this.field4038.containsKey(arg0)) {
                  break label37;
               }

               this.field3994 = this.field4038.get(arg0);
               this.field3958 = arg0;
               if (!client.field1786) {
                  break label37;
               }
            }

            this.field3958 = this.field4066;
            this.field3994 = this.field4086;
         }

         if (this.field3958 != null && this.field3994 != null) {
            this.method1489(this.field3958, this.field3994, 1);
            this.method2226(50);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[9] + (arg0 != null ? field4267[2] : field4267[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(I[FZLeh;II)Lbc;",
      line = 3132
   )
   public final class282 method2224(int arg0, float[] arg1, boolean arg2, class19 arg3, int arg4, int arg5) {
      try {
         if (arg0 > -74) {
            return null;
         } else {
            ++field4011;
            return this.method1505(arg3, 0, arg1, 0, arg2, arg5, arg4, 3);
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field4267[58] + arg0 + ',' + (arg1 != null ? field4267[2] : field4267[1]) + ',' + arg2 + ',' + (arg3 != null ? field4267[2] : field4267[1]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "z",
      descriptor = "(I)Lkr;",
      line = 3145
   )
   public final class504 method2225(int arg0) {
      try {
         if (arg0 != 1) {
            return null;
         } else {
            ++field4039;
            return this.field4121;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "e",
      descriptor = "(I)V",
      line = 3156
   )
   public final void method685(int arg0) {
      try {
         ++field4110;
         if (arg0 != 1) {
            throw new IllegalArgumentException("");
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[52] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "k",
      descriptor = "(I)V",
      line = 3167
   )
   private final void method2226(int arg0) {
      try {
         if (arg0 < 40) {
            this.field4148 = 0.28008947F;
         }

         label19: {
            ++field4088;
            if (this.field3958 == null) {
               this.field3963 = this.field4026 = 1;
               if (!client.field1786) {
                  break label19;
               }
            }

            Dimension var2 = this.field3958.getSize();
            this.field3963 = var2.width;
            this.field4026 = var2.height;
         }

         this.field3975 = this.field4026;
         this.field3960 = this.field3963;
         this.method2187(0);
         this.method2216((byte)109);
         this.method2248(28);
         this.method1500(true);
         this.method2232((byte)124);
         this.method2179((byte)16);
         this.method701();
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[23] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "v",
      descriptor = "(I)V",
      line = 3204
   )
   public final void method2227(int arg0) {
      boolean var2 = client.field1786;

      try {
         this.field4189 = new class428[this.field4150];
         this.field4220 = new class666[this.field4150];
         this.field4185 = new class588[this.field4150];
         ++field4070;
         this.field4237 = new class588[this.field4150];
         this.field4144 = new class504[this.field4150];
         int var3 = 0;
         if (var2) {
            this.field4185[var3] = class716.field10733;
            this.field4237[var3] = class716.field10733;
            this.field4220[var3] = class256.field3869;
            this.field4144[var3] = new class504();
            ++var3;
         }

         while(true) {
            while(~this.field4150 < ~var3) {
               this.field4185[var3] = class716.field10733;
               this.field4237[var3] = class716.field10733;
               this.field4220[var3] = class256.field3869;
               this.field4144[var3] = new class504();
               ++var3;
            }

            this.field4190 = new class404[this.field4173 + -2];
            this.field4153 = this.method1469(1, class364.field5628, 1, class650.field9371, (byte)123);
            this.method619(new class607(262144));
            this.field4259 = this.method1452(new class570[]{new class570(new class42[]{class42.field552, class42.field560})}, (byte)1);
            this.field4264 = this.method1452(new class570[]{new class570(new class42[]{class42.field552, class42.field558})}, (byte)1);
            this.field4243 = this.method1452(new class570[]{new class570(class42.field552), new class570(class42.field558), new class570(class42.field560), new class570(class42.field555)}, (byte)1);
            this.field4260 = this.method1452(new class570[]{new class570(class42.field552), new class570(class42.field558), new class570(class42.field560)}, (byte)1);
            this.field4256 = new class703(this, 0, 0, false, false);
            this.field4244 = new class703(this, 0, 0, true, true);
            this.field4247 = new class703(this, 0, 0, false, false);
            this.field4248 = new class703(this, 0, 0, true, true);
            this.field4254 = new class703(this, 0, 0, false, false);
            this.field4258 = new class703(this, 0, 0, true, true);
            this.field4249 = new class703(this, 0, 0, false, false);
            this.field4255 = new class703(this, 0, 0, true, true);
            this.field4245 = new class703(this, 0, 0, false, false);
            this.field4251 = new class703(this, 0, 0, true, true);
            this.field4208 = new class243(this);
            this.field4263 = this.method1464(arg0 + 7982, true);
            this.method2254(81);
            this.field4082 = new class97(this);
            this.field4229[1] = this.method1498(arg0, (byte)125);
            this.field4229[2] = this.method1498(2, (byte)125);
            this.field4229[4] = this.method1498(4, (byte)125);
            this.field4229[5] = this.method1498(5, (byte)125);
            this.field4229[6] = this.method1498(6, (byte)125);
            this.field4229[7] = this.method1498(7, (byte)125);
            this.field4229[3] = this.method1498(3, (byte)125);
            this.field4229[8] = this.method1498(8, (byte)125);
            this.field4229[9] = this.method1498(9, (byte)125);
            if (!var2) {
               if (!this.field4229[2].method69((byte)120)) {
                  this.field4229[2] = this.method1498(0, (byte)125);
               }

               if (!this.field4229[4].method69((byte)120)) {
                  this.field4229[4] = this.field4229[2];
               }

               if (!this.field4229[8].method69((byte)120)) {
                  this.field4229[8] = this.field4229[4];
               }

               if (!this.field4229[9].method69((byte)120)) {
                  this.field4229[9] = this.field4229[8];
               }

               this.method1455(30162);
               this.method701();
               this.method680();
               return;
            }

            this.field4144[var3] = new class504();
            ++var3;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4267[141] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "c",
      descriptor = "(IZ)V",
      line = 3278
   )
   public final void method2228(int arg0, boolean arg1) {
      try {
         ++field3979;
         if (!this.field4163 != !arg1) {
            this.field4163 = arg1;
            this.method1461((byte)96);
            this.field4146 &= -32;
         }

         if (arg0 != -8841) {
            this.method587();
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[86] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "q",
      descriptor = "(I)V",
      line = 3296
   )
   private final void method2229(int arg0) {
      try {
         this.field4197 = (float)this.field4199;
         ++field4058;
         if (arg0 != 4) {
            this.method2232((byte)-88);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[164] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "v",
      descriptor = "()Lkf;",
      line = 3314
   )
   public final class401 method605() {
      try {
         ++field3972;
         return this.field4136;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4267[85] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "U",
      descriptor = "(I)V",
      line = 3322
   )
   public final void method2230(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field4051;
         Enumeration var3 = this.field4038.keys();
         Canvas var4;
         if (var2) {
            var4 = (Canvas)var3.nextElement();
            this.method1495(var4, 0, this.field4038.get(var4));
         }

         while(true) {
            Object var10000;
            if (!var3.hasMoreElements()) {
               this.field4250.method1533(16966);
               this.field4257.method1533(16966);
               this.field4246.method1533(16966);
               this.field4244.method5187((byte)-125);
               var10000 = this.field4248;
               if (!var2) {
                  ((class703)var10000).method5187((byte)-99);
                  if (arg0 >= -89) {
                     this.method691(-84);
                  }

                  this.field4258.method5187((byte)-98);
                  this.field4255.method5187((byte)-108);
                  this.field4251.method5187((byte)-103);
                  this.field4208.method2075((byte)41);
                  this.field4263.method1533(16966);
                  return;
               }
            } else {
               var10000 = var3.nextElement();
            }

            var4 = (Canvas)var10000;
            this.method1495(var4, 0, this.field4038.get(var4));
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4267[124] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "m",
      descriptor = "(I)V",
      line = 3353
   )
   public final void method2231(int arg0) {
      try {
         if (arg0 == 1) {
            this.method2184((byte)-97, 2, class145.field2065);
            ++field4019;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[48] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "JA",
      descriptor = "(IIIIII)I",
      line = 3369
   )
   public final int method650(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var7 = client.field1786;

      try {
         ++field4108;
         int var8 = 0;
         float var9 = (float)arg2 * this.field4136.field7732 + (float)arg0 * this.field4136.field7735 + (float)arg1 * this.field4136.field7730 + this.field4136.field7714;
         if (var9 < 1.0F) {
            var9 = 1.0F;
         }

         float var10 = (float)arg5 * this.field4136.field7732 + (float)arg3 * this.field4136.field7735 + (float)arg4 * this.field4136.field7730 + this.field4136.field7714;
         if (var10 < 1.0F) {
            var10 = 1.0F;
         }

         label63: {
            if ((float)this.field4216 > var9 && (float)this.field4216 > var10) {
               var8 |= 16;
               if (!var7) {
                  break label63;
               }
            }

            if ((float)this.field4199 < var9 && (float)this.field4199 < var10) {
               var8 |= 32;
            }
         }

         label57: {
            int var11 = (int)(((float)arg2 * this.field4136.field7713 + (float)arg0 * this.field4136.field7710 + (float)arg1 * this.field4136.field7720 + this.field4136.field7736) * (float)this.field4147 / var9);
            int var12 = (int)(((float)arg5 * this.field4136.field7713 + (float)arg3 * this.field4136.field7710 + (float)arg4 * this.field4136.field7720 + this.field4136.field7736) * (float)this.field4147 / var10);
            if ((float)var11 < this.field4207 && (float)var12 < this.field4207) {
               var8 |= 1;
               if (!var7) {
                  break label57;
               }
            }

            if ((float)var11 > this.field4151 && (float)var12 > this.field4151) {
               var8 |= 2;
            }
         }

         int var13 = (int)(((float)arg2 * this.field4136.field7690 + (float)arg0 * this.field4136.field7697 + (float)arg1 * this.field4136.field7709 + this.field4136.field7715) * (float)this.field4212 / var9);
         int var14 = (int)(((float)arg5 * this.field4136.field7690 + (float)arg3 * this.field4136.field7697 + (float)arg4 * this.field4136.field7709 + this.field4136.field7715) * (float)this.field4212 / var10);
         if ((float)var13 < this.field4168 && (float)var14 < this.field4168) {
            var8 |= 4;
            if (!var7) {
               return var8;
            }
         }

         if ((float)var13 > this.field4228 && (float)var14 > this.field4228) {
            var8 |= 8;
         }

         return var8;
      } catch (RuntimeException var16) {
         throw class482.method3757(var16, field4267[154] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "n",
      descriptor = "(B)V",
      line = 3421
   )
   private final void method2232(byte arg0) {
      try {
         this.field4168 = (float)(this.field4241 - this.field4221);
         this.field4151 = (float)(-this.field4184 + this.field4191);
         this.field4228 = (float)(-this.field4221 + this.field4193);
         ++field4031;
         this.field4207 = (float)(-this.field4184 + this.field4165);
         if (arg0 <= 84) {
            this.field4219 = -98;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[169] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "w",
      descriptor = "(B)V",
      line = 3435
   )
   public final void method2233(byte arg0) {
      try {
         if (this.field4220[this.field4172] != class256.field3869) {
            this.field4220[this.field4172] = class256.field3869;
            this.field4144[this.field4172].method1551();
            this.method2246((byte)-127);
         }

         ++field4056;
         if (arg0 > -37) {
            this.method1507((class631)null, -101, (byte)84);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[79] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "E",
      descriptor = "()I",
      line = 3452
   )
   public final int method661() {
      try {
         ++field4098;
         return this.field4128 + this.field4122 - -this.field4130;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4267[98] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(ZI)V",
      line = 3461
   )
   public final void method2234(boolean arg0, int arg1) {
      try {
         ++field4073;
         if (this.field4238 == !arg0) {
            this.field4238 = arg0;
            this.method1450(29866);
            this.field4146 &= -8;
         }

         if (arg1 != 14) {
            this.method1491(-51);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[96] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "h",
      descriptor = "(B)V",
      line = 3479
   )
   private final void method2235(byte arg0) {
      try {
         if (class225.field3424 != this.field4188) {
            class4 var2 = this.field4188;
            this.field4188 = class225.field3424;
            if (!var2.method16((byte)86)) {
               this.method2194((byte)126);
            }

            this.method2197((byte)119);
            this.field4154 = this.field4209;
            this.method2176(0);
            this.field4146 &= -8;
         }

         ++field4075;
         if (arg0 <= 116) {
            this.field4240 = null;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[178] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "b",
      descriptor = "(IB)Lqq;",
      line = 3505
   )
   public final class800 method2236(int arg0, byte arg1) {
      try {
         ++field4090;
         int var3 = -19 / ((arg1 - -11) / 50);
         if (~this.field4263.method1538(84) > ~(arg0 * 2)) {
            this.field4263.method2269(arg0, 32198);
         }

         return this.field4263;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4267[110] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "Q",
      descriptor = "(I)V",
      line = 3523
   )
   private final void method2237(int arg0) {
      boolean var2 = client.field1786;

      try {
         this.field4250 = this.method1472(false, 116);
         ++field3988;
         this.field4250.method1537(28, 140, 22251);
         int var3 = 0;
         class258 var10000;
         if (arg0 != 537150952) {
            this.method630(-87, -65, -86, -60, false);
            if (var2) {
               var10000 = this;
            } else if (var3 >= 4) {
               var10000 = this;
               if (!var2) {
                  this.field4252 = this.method1452(new class570[]{new class570(new class42[]{class42.field552, class42.field560, class42.field560})}, (byte)1);
                  return;
               }
            } else {
               var10000 = this;
            }
         } else if (var3 >= 4) {
            var10000 = this;
            if (!var2) {
               this.field4252 = this.method1452(new class570[]{new class570(new class42[]{class42.field552, class42.field560, class42.field560})}, (byte)1);
               return;
            }
         } else {
            var10000 = this;
         }

         do {
            while(true) {
               Buffer var4 = var10000.field4250.method1535(true, 85);
               if (var4 != null) {
                  Stream var5 = this.method2245((byte)73, var4);
                  if (!Stream.method5249()) {
                     var5.method5241(0.0F);
                     var5.method5241(0.0F);
                     var5.method5241(0.0F);
                     var5.method5241(0.0F);
                     var5.method5241(0.0F);
                     var5.method5241(0.0F);
                     var5.method5241(0.0F);
                     var5.method5241(0.0F);
                     var5.method5241(1.0F);
                     var5.method5241(0.0F);
                     var5.method5241(0.0F);
                     var5.method5241(1.0F);
                     var5.method5241(0.0F);
                     var5.method5241(1.0F);
                     var5.method5241(1.0F);
                     var5.method5241(1.0F);
                     var5.method5241(0.0F);
                     var5.method5241(1.0F);
                     var5.method5241(1.0F);
                     var5.method5241(1.0F);
                     var5.method5241(1.0F);
                     var5.method5241(1.0F);
                     var5.method5241(0.0F);
                     var5.method5241(0.0F);
                     var5.method5241(1.0F);
                     var5.method5241(0.0F);
                     var5.method5241(1.0F);
                     var5.method5241(0.0F);
                     var5.method5241(0.0F);
                     var5.method5241(0.0F);
                     var5.method5241(0.0F);
                     var5.method5241(0.0F);
                     var5.method5241(0.0F);
                     var5.method5241(0.0F);
                     var5.method5241(0.0F);
                     if (var2) {
                        var5.method5248(0.0F);
                        var5.method5248(0.0F);
                        var5.method5248(0.0F);
                        var5.method5248(0.0F);
                        var5.method5248(0.0F);
                        var5.method5248(0.0F);
                        var5.method5248(0.0F);
                        var5.method5248(0.0F);
                        var5.method5248(1.0F);
                        var5.method5248(0.0F);
                        var5.method5248(0.0F);
                        var5.method5248(1.0F);
                        var5.method5248(0.0F);
                        var5.method5248(1.0F);
                        var5.method5248(1.0F);
                        var5.method5248(1.0F);
                        var5.method5248(0.0F);
                        var5.method5248(1.0F);
                        var5.method5248(1.0F);
                        var5.method5248(1.0F);
                        var5.method5248(1.0F);
                        var5.method5248(1.0F);
                        var5.method5248(0.0F);
                        var5.method5248(0.0F);
                        var5.method5248(1.0F);
                        var5.method5248(0.0F);
                        var5.method5248(1.0F);
                        var5.method5248(0.0F);
                        var5.method5248(0.0F);
                        var5.method5248(0.0F);
                        var5.method5248(0.0F);
                        var5.method5248(0.0F);
                        var5.method5248(0.0F);
                        var5.method5248(0.0F);
                        var5.method5248(0.0F);
                     }
                  } else {
                     var5.method5248(0.0F);
                     var5.method5248(0.0F);
                     var5.method5248(0.0F);
                     var5.method5248(0.0F);
                     var5.method5248(0.0F);
                     var5.method5248(0.0F);
                     var5.method5248(0.0F);
                     var5.method5248(0.0F);
                     var5.method5248(1.0F);
                     var5.method5248(0.0F);
                     var5.method5248(0.0F);
                     var5.method5248(1.0F);
                     var5.method5248(0.0F);
                     var5.method5248(1.0F);
                     var5.method5248(1.0F);
                     var5.method5248(1.0F);
                     var5.method5248(0.0F);
                     var5.method5248(1.0F);
                     var5.method5248(1.0F);
                     var5.method5248(1.0F);
                     var5.method5248(1.0F);
                     var5.method5248(1.0F);
                     var5.method5248(0.0F);
                     var5.method5248(0.0F);
                     var5.method5248(1.0F);
                     var5.method5248(0.0F);
                     var5.method5248(1.0F);
                     var5.method5248(0.0F);
                     var5.method5248(0.0F);
                     var5.method5248(0.0F);
                     var5.method5248(0.0F);
                     var5.method5248(0.0F);
                     var5.method5248(0.0F);
                     var5.method5248(0.0F);
                     var5.method5248(0.0F);
                  }

                  var5.method5253();
                  if (this.field4250.method1534(9)) {
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
                     this.field4252 = this.method1452(new class570[]{new class570(new class42[]{class42.field552, class42.field560, class42.field560})}, (byte)1);
                     return;
                  }
               } else {
                  var10000 = this;
               }
            }
         } while(var2);

         this.field4252 = this.method1452(new class570[]{new class570(new class42[]{class42.field552, class42.field560, class42.field560})}, (byte)1);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field4267[126] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "u",
      descriptor = "(B)I",
      line = 3638
   )
   public final int method2238(byte arg0) {
      try {
         if (arg0 > -113) {
            this.field4175 = -0.032605283F;
         }

         ++field4017;
         return this.field4149;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[27] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "R",
      descriptor = "(I)V",
      line = 3651
   )
   private final void method2239(int arg0) {
      try {
         if (this.field4235 != null) {
            this.field4235.method76((byte)71);
         }

         if (arg0 == 3) {
            ++field4094;
            this.method1446((byte)-124);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[101] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(IIIIIILaa;II)V",
      line = 3670
   )
   public final void method597(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class96 arg6, int arg7, int arg8) {
      try {
         ++field3967;
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field4267[30] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field4267[2] : field4267[1]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "ZA",
      descriptor = "(IFFFFF)V",
      line = 3677
   )
   public final void method656(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      try {
         ++field4081;
         boolean var7 = this.field4217 != arg0;
         if (var7 || this.field4161 != arg1 || this.field4213 != arg2) {
            this.field4213 = arg2;
            this.field4161 = arg1;
            this.field4217 = arg0;
            if (var7) {
               this.field4194 = (float)(this.field4217 & 65280) / 65280.0F;
               this.field4211 = (float)(this.field4217 & 255) / 255.0F;
               this.field4160 = (float)(this.field4217 & 16711680) / 1.671168E7F;
               this.method1460((byte)-20);
            }

            this.field3961.setSunColour(this.field4160, this.field4194, this.field4211, arg1, arg2);
            this.method1462((byte)-61);
         }

         if (this.field4164[0] != arg3 || this.field4164[1] != arg4 || this.field4164[2] != arg5) {
            this.field4164[0] = arg3;
            this.field4164[1] = arg4;
            this.field4164[2] = arg5;
            this.field4230[0] = -arg3;
            this.field4230[2] = -arg5;
            this.field4230[1] = -arg4;
            float var8 = (float)(1.0D / Math.sqrt((double)(arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field4203[0] = arg3 * var8;
            this.field4203[2] = arg5 * var8;
            this.field4203[1] = arg4 * var8;
            this.field4226[0] = -this.field4203[0];
            this.field4226[2] = -this.field4203[2];
            this.field4226[1] = -this.field4203[1];
            this.field3961.setSunDirection(this.field4203[0], this.field4203[1], this.field4203[2]);
            this.method1485(-1);
            this.field4218 = (int)(arg3 * 256.0F / arg4);
            this.field4145 = (int)(arg5 * 256.0F / arg4);
         }

         this.method1454(-91);
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field4267[117] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "n",
      descriptor = "(I)Lkr;",
      line = 3728
   )
   public final class504 method2240(int arg0) {
      try {
         ++field4077;
         if (arg0 >= -113) {
            this.field3948 = null;
         }

         return this.field4139;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "P",
      descriptor = "(I)V",
      line = 3744
   )
   public void method1455(int arg0) {
      try {
         ++field3977;
         this.method2192((byte)-74);
         if (arg0 != 30162) {
            this.field4231 = 77;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[131] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "d",
      descriptor = "(IIIIII)Lpr;",
      line = 3758
   )
   public final class331 method607(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field4091;
         return new class393(this, arg0, arg1, arg2, arg3, arg4, arg5);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field4267[120] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "f",
      descriptor = "(II)V",
      line = 3767
   )
   public final void method670(int arg0, int arg1) {
      try {
         if (this.field4216 != arg0 || ~this.field4199 != ~arg1) {
            this.field4199 = arg1;
            this.field4216 = arg0;
            this.method2216((byte)124);
            this.method2248(28);
            this.method2239(3);
         }

         ++field4125;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "cb",
      descriptor = "(I)I",
      line = 3786
   )
   public final int method2241(int arg0) {
      try {
         int var2 = 89 / ((arg0 - -35) / 63);
         ++field4015;
         return this.field4172;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[103] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "x",
      descriptor = "(I)V",
      line = 3798
   )
   private final void method2242(int arg0) {
      try {
         ++field4059;
         if (~this.field4146 != -2) {
            this.method2181(65);
            this.method2209(false, false);
            this.method2234(false, 14);
            this.method2228(-8841, false);
            this.method2219(false, -114);
            this.method2191(0, -2, false, false);
            this.method2255(1, (byte)90);
            this.method2193(this.field4153, (byte)-19);
            this.field4146 = 1;
         }

         if (arg0 <= 126) {
            this.method628();
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[46] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "I",
      descriptor = "(I)V",
      line = 3822
   )
   private final void method2243(int arg0) {
      try {
         ++field4068;
         int var2 = -83 / ((arg0 - 63) / 43);
         if (class565.field8387 == this.field4188) {
            float var3 = this.method1501(77);
            this.field4121.method3918(0.0F, var3, var3, true);
         }

         this.field4233 = false;
         this.method1470(0);
         if (this.field4235 != null) {
            this.field4235.method74(-29053);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4267[20] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "e",
      descriptor = "(IB)V",
      line = 3844
   )
   public final void method2244(int arg0, byte arg1) {
      boolean var3 = client.field1786;

      try {
         if (~this.field4210 != ~arg0) {
            class625 var4;
            boolean var5;
            boolean var6;
            label58: {
               if (~arg0 != -2) {
                  if (arg0 != 2) {
                     if (arg0 == 128) {
                        var4 = class664.field9944;
                        var5 = true;
                        var6 = true;
                        if (!var3) {
                           break label58;
                        }
                     }

                     var6 = false;
                     var5 = false;
                     var4 = class577.field8536;
                     if (!var3) {
                        break label58;
                     }
                  }

                  var4 = class562.field8345;
                  var6 = true;
                  var5 = false;
                  if (!var3) {
                     break label58;
                  }
               }

               var4 = class182.field2819;
               var6 = true;
               var5 = true;
            }

            if (!var5 != !this.field4214) {
               this.field4214 = var5;
               this.method1481(3);
            }

            if (!var6 == this.field4179) {
               this.field4179 = var6;
               this.method1509(255);
            }

            if (this.field4240 != var4) {
               this.field4240 = var4;
               this.method1492(0);
            }

            this.field4210 = arg0;
            this.field4146 &= -29;
         }

         ++field4014;
         int var7 = 77 / ((arg1 - 76) / 37);
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field4267[22] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "l",
      descriptor = "()Z",
      line = 3914
   )
   public final boolean method628() {
      try {
         ++field4089;
         return true;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4267[13] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "e",
      descriptor = "(IIIIII)V",
      line = 3930
   )
   public final void method602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field3953;
         float var7 = this.method1501(107);
         this.method2242(127);
         this.method2218(arg4, 22121);
         this.method2185((byte)-101, 0, class700.field10441);
         this.method2221(0, (byte)51, class700.field10441);
         this.method2244(arg5, (byte)117);
         this.field4121.method3920((float)(arg3 + -1), 1.0F, 0, (float)(arg2 + -1));
         this.field4121.method3918(0.0F, (float)arg1 + -var7, (float)arg0 + -var7, true);
         this.method2222(50);
         this.method1474(false, true);
         this.method2184((byte)-121, 4, class751.field11146);
         this.method1474(true, true);
         this.method2221(0, (byte)51, class751.field11122);
         this.method2185((byte)-118, 0, class751.field11122);
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field4267[80] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "Q",
      descriptor = "(IIIIII[BII)V",
      line = 3954
   )
   public final void method707(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
      try {
         ++field4004;
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field4267[88] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field4267[2] : field4267[1]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "r",
      descriptor = "(IIIIIII)I",
      line = 3961
   )
   public final int method599(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field1786;

      try {
         int var9;
         label69: {
            ++field4118;
            var9 = 0;
            float var10 = (float)arg2 * this.field4136.field7732 + (float)arg0 * this.field4136.field7735 + (float)arg1 * this.field4136.field7730 + this.field4136.field7714;
            float var11 = (float)arg5 * this.field4136.field7732 + (float)arg3 * this.field4136.field7735 + (float)arg4 * this.field4136.field7730 + this.field4136.field7714;
            if (!((float)this.field4216 > var10) || !((float)this.field4216 > var11)) {
               if (!(var10 > (float)this.field4199) || !((float)this.field4199 < var11)) {
                  break label69;
               }

               var9 |= 32;
               if (!var8) {
                  break label69;
               }
            }

            var9 |= 16;
         }

         label50: {
            int var12 = (int)(((float)arg2 * this.field4136.field7713 + (float)arg0 * this.field4136.field7710 + (float)arg1 * this.field4136.field7720 + this.field4136.field7736) * (float)this.field4147 / (float)arg6);
            int var13 = (int)(((float)arg5 * this.field4136.field7713 + (float)arg3 * this.field4136.field7710 + (float)arg4 * this.field4136.field7720 + this.field4136.field7736) * (float)this.field4147 / (float)arg6);
            if ((float)var12 < this.field4207 && this.field4207 > (float)var13) {
               var9 |= 1;
               if (!var8) {
                  break label50;
               }
            }

            if ((float)var12 > this.field4151 && (float)var13 > this.field4151) {
               var9 |= 2;
            }
         }

         int var14 = (int)(((float)arg2 * this.field4136.field7690 + (float)arg0 * this.field4136.field7697 + (float)arg1 * this.field4136.field7709 + this.field4136.field7715) * (float)this.field4212 / (float)arg6);
         int var15 = (int)(((float)arg5 * this.field4136.field7690 + (float)arg3 * this.field4136.field7697 + (float)arg4 * this.field4136.field7709 + this.field4136.field7715) * (float)this.field4212 / (float)arg6);
         if (this.field4168 > (float)var14 && this.field4168 > (float)var15) {
            var9 |= 4;
            if (!var8) {
               return var9;
            }
         }

         if ((float)var14 > this.field4228 && this.field4228 < (float)var15) {
            var9 |= 8;
         }

         return var9;
      } catch (RuntimeException var17) {
         throw class482.method3757(var17, field4267[38] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "EA",
      descriptor = "(IIII)V",
      line = 4006
   )
   public final void method580(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field3959;
         if (!this.field4171) {
            throw new RuntimeException("");
         } else {
            this.field4183 = arg0;
            this.field4149 = arg1;
            this.field4170 = arg3;
            this.field4167 = arg2;
            if (this.field4180) {
               this.field4229[3].method75((byte)113);
               this.field4229[3].method76((byte)71);
            }
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4267[170] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "C",
      descriptor = "(Z)V",
      line = 4029
   )
   public final void method581(boolean arg0) {
      try {
         this.field4223 = arg0;
         ++field4116;
         this.method1490(1);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[32] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(BLjaclib/memory/Buffer;)Ljaclib/memory/Stream;",
      line = 4040
   )
   public final Stream method2245(byte arg0, Buffer arg1) {
      try {
         this.field4225.method5240(arg1);
         ++field4063;
         return arg0 != 73 ? null : this.field4225;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[34] + arg0 + ',' + (arg1 != null ? field4267[2] : field4267[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "c",
      descriptor = "(B)V",
      line = 4052
   )
   private final void method2246(byte arg0) {
      try {
         this.method1477(93);
         ++field4032;
         int var2 = -23 % ((-65 - arg0) / 45);
         if (this.field4235 != null) {
            this.field4235.method70(-2);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[33] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(ILhr;)V",
      line = 4066
   )
   public final void method2247(int arg0, class666 arg1) {
      try {
         if (arg0 == 11901) {
            ++field4012;
            this.field4220[this.field4172] = arg1;
            this.method2246((byte)-114);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[7] + arg0 + ',' + (arg1 != null ? field4267[2] : field4267[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "DA",
      descriptor = "(IIII)V",
      line = 4080
   )
   public final void method639(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field4221 = arg1;
         this.field4147 = arg2;
         this.field4212 = arg3;
         ++field3945;
         this.field4184 = arg0;
         this.method2248(28);
         this.method2216((byte)119);
         this.method2179((byte)124);
         this.method2232((byte)87);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4267[157] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "eb",
      descriptor = "(I)V",
      line = 4097
   )
   private final void method2248(int arg0) {
      try {
         ++field3989;
         this.field4236 = false;
         this.method2195(false);
         if (arg0 != 28) {
            this.method1495((Canvas)null, -50, (Object)null);
         }

         if (class489.field7416 == this.field4188) {
            this.method2176(0);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[37] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "w",
      descriptor = "(I)V",
      line = 4116
   )
   private final void method2249(int arg0) {
      try {
         if (arg0 < 18) {
            this.field3958 = null;
         }

         ++field3999;
         this.method1507(this.field4257, 0, (byte)15);
         this.method1502(this.field4253, 114);
         this.method1465(1, class766.field11310, 0, 0);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[122] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "X",
      descriptor = "(I)V",
      line = 4130
   )
   public final void method691(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Lqda;[Lkp;Z)Lda;",
      line = 4145
   )
   public final class288 method598(class697 arg0, class776[] arg1, boolean arg2) {
      try {
         ++field4103;
         return new class131(this, arg0, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4267[44] + (arg0 != null ? field4267[2] : field4267[1]) + ',' + (arg1 != null ? field4267[2] : field4267[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(FFFFIFF)Z",
      line = 4156
   )
   private final boolean method2250(float arg0, float arg1, float arg2, float arg3, int arg4, float arg5, float arg6) {
      try {
         ++field3970;
         Buffer var8 = this.field4257.method1535(true, 109);
         if (var8 == null) {
            return false;
         } else {
            Stream var9;
            label22: {
               var9 = this.method2245((byte)73, var8);
               if (!Stream.method5249()) {
                  var9.method5241(arg2);
                  var9.method5241(arg0);
                  var9.method5241(arg5);
                  var9.method5241(arg1);
                  var9.method5241(arg6);
                  var9.method5241(arg3);
                  if (!client.field1786) {
                     break label22;
                  }
               }

               var9.method5248(arg2);
               var9.method5248(arg0);
               var9.method5248(arg5);
               var9.method5248(arg1);
               var9.method5248(arg6);
               var9.method5248(arg3);
            }

            var9.method5253();
            if (arg4 <= 40) {
               this.method1505((class19)null, -32, (float[])null, -90, true, -6, 11, -13);
            }

            return this.field4257.method1534(-125);
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field4267[165] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "P",
      descriptor = "(IIIII)V",
      line = 4195
   )
   public final void method663(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.method695(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
         ++field4119;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field4267[144] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "z",
      descriptor = "(B)V",
      line = 4205
   )
   public final void method2251(byte arg0) {
      try {
         if (arg0 >= 10) {
            if (this.field4146 != 16) {
               this.method2256(false);
               this.method2209(false, true);
               this.method2228(-8841, true);
               this.method2219(true, -92);
               this.method2244(1, (byte)27);
               this.field4146 = 16;
            }

            ++field3993;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4267[87] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "d",
      descriptor = "(II)I",
      line = 4228
   )
   public final int method690(int arg0, int arg1) {
      try {
         ++field3986;
         return arg0 & arg1 ^ arg1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[92] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "HA",
      descriptor = "(IIII[I)V",
      line = 4237
   )
   public final void method582(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
      try {
         ++field4106;
         float var6 = this.field4136.method3900(1, (float)arg1, (float)arg0, (float)arg2);
         if (!(var6 < (float)this.field4216) && !((float)this.field4199 < var6)) {
            int var7 = (int)((float)this.field4147 * this.field4136.method3908((float)arg1, (float)arg0, (byte)123, (float)arg2) / (float)arg3);
            int var8 = (int)((float)this.field4212 * this.field4136.method3898((float)arg2, (byte)-82, (float)arg1, (float)arg0) / (float)arg3);
            arg4[0] = (int)((float)var7 - this.field4207);
            arg4[1] = (int)((float)var8 + -this.field4168);
            arg4[2] = (int)var6;
         } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field4267[150] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4267[2] : field4267[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "XA",
      descriptor = "()I",
      line = 4260
   )
   public final int method616() {
      try {
         ++field4052;
         return this.field4199;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4267[102] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "t",
      descriptor = "()Lkf;",
      line = 4268
   )
   public final class401 method640() {
      try {
         ++field4096;
         return this.field4262;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4267[147] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "A",
      descriptor = "()V",
      line = 4276
   )
   public final void method705() {
      try {
         ++field3951;
         if (this.field4234 != null) {
            this.field4234.method715(-51);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4267[77] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Lkr;I)V",
      line = 4291
   )
   public final void method2252(class504 arg0, int arg1) {
      try {
         this.field4121.method1549(arg0);
         if (arg1 <= 94) {
            this.method645(-114);
         }

         ++field4060;
         this.field4123 = false;
         this.method2243(123);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[81] + (arg0 != null ? field4267[2] : field4267[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "k",
      descriptor = "(B)I",
      line = 4307
   )
   public final int method2253(byte arg0) {
      try {
         ++field4037;
         int var2 = -105 / ((arg0 - 26) / 61);
         return this.field4170;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[42] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "h",
      descriptor = "(I)Lza;",
      line = 4319
   )
   public final class624 method634(int arg0) {
      try {
         ++field4102;
         class607 var2 = new class607(arg0);
         this.field3982.method4980(var2, 0);
         return var2;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[104] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "s",
      descriptor = "(I)V",
      line = 4332
   )
   public final void method2254(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field4085;
         Hashtable var3 = new Hashtable();
         if (this.field4038 != null && !this.field4038.isEmpty()) {
            Enumeration var4 = this.field4038.keys();
            if (var2 || var4.hasMoreElements()) {
               do {
                  Canvas var5 = (Canvas)var4.nextElement();
                  var3.put(var5, this.method1463(88, var5));
               } while(var4.hasMoreElements());
            }
         }

         this.field4038 = var3;
         this.method2237(537150952);
         this.method2208((byte)122);
         this.method2182(0);
         this.field4208.method2070(730746924, this);
         int var6 = -92 / ((arg0 - -32) / 43);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field4267[118] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "c",
      descriptor = "(IB)V",
      line = 4368
   )
   public final void method2255(int arg0, byte arg1) {
      boolean var3 = client.field1786;

      try {
         label46: {
            if (arg0 != 1) {
               if (arg0 != 0) {
                  if (~arg0 != -3) {
                     if (arg0 == 3) {
                        this.method2212((byte)119, class154.field2302, class716.field10733);
                        if (!var3) {
                           break label46;
                        }
                     }

                     if (arg0 != 4) {
                        break label46;
                     }

                     this.method2212((byte)119, class371.field5756, class371.field5756);
                     if (!var3) {
                        break label46;
                     }
                  }

                  this.method2212((byte)119, class582.field8586, class453.field6943);
                  if (!var3) {
                     break label46;
                  }
               }

               this.method2212((byte)119, class716.field10733, class716.field10733);
               if (!var3) {
                  break label46;
               }
            }

            this.method2212((byte)119, class453.field6943, class453.field6943);
         }

         ++field3997;
         if (arg1 != 90) {
            this.method650(-8, -90, 8, 31, 65, 34);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4267[53] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V",
      line = 4402
   )
   public final void method657(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      try {
         ++field3983;
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field4267[109] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "o",
      descriptor = "()I",
      line = 4411
   )
   public final int method687() {
      try {
         ++field3969;
         return this.field4173 + -2;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4267[143] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "h",
      descriptor = "(Z)V",
      line = 4422
   )
   private final void method2256(boolean arg0) {
      try {
         if (arg0) {
            this.method2248(34);
         }

         ++field4042;
         if (class489.field7416 != this.field4188) {
            class4 var2 = this.field4188;
            this.field4188 = class489.field7416;
            if (!var2.method16((byte)86)) {
               this.method2194((byte)122);
            }

            this.method2195(false);
            this.field4154 = this.field4142;
            this.method2176(0);
            this.field4146 &= -8;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4267[24] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(I[BILeh;BI)Lje;"
   )
   public abstract class196 method1486(int arg0, byte[] arg1, int arg2, class19 arg3, byte arg4, int arg5);

   @OriginalMember(
      owner = "client!mu",
      name = "o",
      descriptor = "(I)V"
   )
   public abstract void method1467(int arg0);

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Leh;I[FIZIII)Lbc;"
   )
   public abstract class282 method1505(class19 arg0, int arg1, float[] arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(ILjl;II)V"
   )
   public abstract void method1465(int arg0, class133 arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Lsg;I)V"
   )
   public abstract void method1475(class742 arg0, int arg1);

   @OriginalMember(
      owner = "client!mu",
      name = "b",
      descriptor = "(IZ)Lqq;"
   )
   public abstract class800 method1464(int arg0, boolean arg1);

   @OriginalMember(
      owner = "client!mu",
      name = "e",
      descriptor = "(Z)V"
   )
   public abstract void method1500(boolean arg0);

   @OriginalMember(
      owner = "client!mu",
      name = "l",
      descriptor = "(B)V"
   )
   public abstract void method1460(byte arg0);

   @OriginalMember(
      owner = "client!mu",
      name = "j",
      descriptor = "(B)V"
   )
   public abstract void method1462(byte arg0);

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(IZILvv;Z)V"
   )
   public abstract void method1494(int arg0, boolean arg1, int arg2, class308 arg3, boolean arg4);

   @OriginalMember(
      owner = "client!mu",
      name = "x",
      descriptor = "(B)V"
   )
   public abstract void method1457(byte arg0);

   @OriginalMember(
      owner = "client!mu",
      name = "b",
      descriptor = "(B)V"
   )
   public abstract void method1504(byte arg0);

   @OriginalMember(
      owner = "client!mu",
      name = "db",
      descriptor = "(I)V"
   )
   public abstract void method1491(int arg0);

   @OriginalMember(
      owner = "client!mu",
      name = "O",
      descriptor = "(I)V"
   )
   public abstract void method1448(int arg0);

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(ILeh;ILpc;B)Lbc;"
   )
   public abstract class282 method1469(int arg0, class19 arg1, int arg2, class650 arg3, byte arg4);

   @OriginalMember(
      owner = "client!mu",
      name = "c",
      descriptor = "(ZI)Lgfa;"
   )
   public abstract class631 method1472(boolean arg0, int arg1);

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "([IIIIIIZ)Lbc;"
   )
   public abstract class282 method1488(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

   @OriginalMember(
      owner = "client!mu",
      name = "S",
      descriptor = "(I)V"
   )
   public abstract void method1478(int arg0);

   @OriginalMember(
      owner = "client!mu",
      name = "t",
      descriptor = "(I)V"
   )
   public abstract void method1450(int arg0);

   @OriginalMember(
      owner = "client!mu",
      name = "Y",
      descriptor = "(I)V"
   )
   public abstract void method1454(int arg0);

   @OriginalMember(
      owner = "client!mu",
      name = "W",
      descriptor = "(I)V"
   )
   public abstract void method1509(int arg0);

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V"
   )
   public abstract void method1476(int arg0, Object arg1, Canvas arg2);

   @OriginalMember(
      owner = "client!mu",
      name = "E",
      descriptor = "(I)V"
   )
   public abstract void method1485(int arg0);

   @OriginalMember(
      owner = "client!mu",
      name = "s",
      descriptor = "(B)V"
   )
   public abstract void method1461(byte arg0);

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(BI)V"
   )
   public abstract void method1458(byte arg0, int arg1);

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Leh;III[BIZI)Lbc;"
   )
   public abstract class282 method1503(class19 arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, boolean arg6, int arg7);

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V"
   )
   public abstract void method1489(Canvas arg0, Object arg1, int arg2);

   @OriginalMember(
      owner = "client!mu",
      name = "L",
      descriptor = "(I)V"
   )
   public abstract void method1490(int arg0);

   @OriginalMember(
      owner = "client!mu",
      name = "K",
      descriptor = "(I)V"
   )
   public abstract void method1510(int arg0);

   @OriginalMember(
      owner = "client!mu",
      name = "V",
      descriptor = "(I)V"
   )
   public abstract void method1470(int arg0);

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(BIIILqq;Ljl;I)V"
   )
   public abstract void method1493(byte arg0, int arg1, int arg2, int arg3, class800 arg4, class133 arg5, int arg6);

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Lvv;BIZ)V"
   )
   public abstract void method1483(class308 arg0, byte arg1, int arg2, boolean arg3);

   @OriginalMember(
      owner = "client!mu",
      name = "i",
      descriptor = "(B)V"
   )
   public abstract void method1506(byte arg0);

   @OriginalMember(
      owner = "client!mu",
      name = "u",
      descriptor = "(I)V"
   )
   public abstract void method1481(int arg0);

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;"
   )
   public abstract Object method1463(int arg0, Canvas arg1);

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Leh;Lpc;B)Z"
   )
   public abstract boolean method1453(class19 arg0, class650 arg1, byte arg2);

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public abstract void method1474(boolean arg0, boolean arg1);

   @OriginalMember(
      owner = "client!mu",
      name = "b",
      descriptor = "(Leh;Lpc;B)Z"
   )
   public abstract boolean method1479(class19 arg0, class650 arg1, byte arg2);

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(B)V"
   )
   public abstract void method1446(byte arg0);

   @OriginalMember(
      owner = "client!mu",
      name = "ab",
      descriptor = "(I)F"
   )
   public abstract float method1501(int arg0);

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V"
   )
   public abstract void method1495(Canvas arg0, int arg1, Object arg2);

   @OriginalMember(
      owner = "client!mu",
      name = "F",
      descriptor = "(I)V"
   )
   public abstract void method1477(int arg0);

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "([Ldr;B)Lvi;"
   )
   public abstract class371 method1452(class570[] arg0, byte arg1);

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Lgfa;IB)V"
   )
   public abstract void method1507(class631 arg0, int arg1, byte arg2);

   @OriginalMember(
      owner = "client!mu",
      name = "bb",
      descriptor = "(I)V"
   )
   public abstract void method1468(int arg0);

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Lvi;I)V"
   )
   public abstract void method1502(class371 arg0, int arg1);

   @OriginalMember(
      owner = "client!mu",
      name = "Z",
      descriptor = "(I)V"
   )
   public abstract void method1447(int arg0);

   @OriginalMember(
      owner = "client!mu",
      name = "N",
      descriptor = "(I)V"
   )
   public abstract void method1492(int arg0);

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "([[IZIB)Lan;"
   )
   public abstract class496 method1473(int[][] arg0, boolean arg1, int arg2, byte arg3);

   @OriginalMember(
      owner = "client!mu",
      name = "d",
      descriptor = "(I)V"
   )
   public abstract void method1508(int arg0);

   @OriginalMember(
      owner = "client!mu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2257(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2258(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 6;
            break;
         case 2:
            var10005 = 125;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
