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

@OriginalClass("client!fm")
public abstract class class281 extends class479 {
   @OriginalMember(
      owner = "client!fm",
      name = "fc",
      descriptor = "Lrca;"
   )
   private class37 field3616;
   @OriginalMember(
      owner = "client!fm",
      name = "Af",
      descriptor = "Z"
   )
   public boolean field3773;
   @OriginalMember(
      owner = "client!fm",
      name = "Yc",
      descriptor = "Ltm;"
   )
   public class620 field3770;
   @OriginalMember(
      owner = "client!fm",
      name = "ob",
      descriptor = "Ltm;"
   )
   public class620 field3774;
   @OriginalMember(
      owner = "client!fm",
      name = "E",
      descriptor = "Ltm;"
   )
   public class620 field3775;
   @OriginalMember(
      owner = "client!fm",
      name = "R",
      descriptor = "Ltm;"
   )
   public class620 field3776;
   @OriginalMember(
      owner = "client!fm",
      name = "Cc",
      descriptor = "Ltm;"
   )
   private class620 field3777;
   @OriginalMember(
      owner = "client!fm",
      name = "Td",
      descriptor = "Ltm;"
   )
   private class620 field3778;
   @OriginalMember(
      owner = "client!fm",
      name = "af",
      descriptor = "I"
   )
   public int field3793;
   @OriginalMember(
      owner = "client!fm",
      name = "pe",
      descriptor = "[F"
   )
   public float[] field3803;
   @OriginalMember(
      owner = "client!fm",
      name = "Eb",
      descriptor = "[F"
   )
   private float[] field3787;
   @OriginalMember(
      owner = "client!fm",
      name = "fb",
      descriptor = "Z"
   )
   private boolean field3796;
   @OriginalMember(
      owner = "client!fm",
      name = "He",
      descriptor = "I"
   )
   private int field3791;
   @OriginalMember(
      owner = "client!fm",
      name = "uf",
      descriptor = "I"
   )
   public int field3797;
   @OriginalMember(
      owner = "client!fm",
      name = "qe",
      descriptor = "Z"
   )
   private boolean field3801;
   @OriginalMember(
      owner = "client!fm",
      name = "xd",
      descriptor = "[Lob;"
   )
   private class393[] field3784;
   @OriginalMember(
      owner = "client!fm",
      name = "O",
      descriptor = "F"
   )
   public float field3795;
   @OriginalMember(
      owner = "client!fm",
      name = "Gc",
      descriptor = "I"
   )
   public int field3820;
   @OriginalMember(
      owner = "client!fm",
      name = "ne",
      descriptor = "Z"
   )
   private boolean field3788;
   @OriginalMember(
      owner = "client!fm",
      name = "kb",
      descriptor = "I"
   )
   private int field3814;
   @OriginalMember(
      owner = "client!fm",
      name = "eb",
      descriptor = "F"
   )
   public float field3826;
   @OriginalMember(
      owner = "client!fm",
      name = "Xe",
      descriptor = "[F"
   )
   private float[] field3800;
   @OriginalMember(
      owner = "client!fm",
      name = "P",
      descriptor = "I"
   )
   private int field3798;
   @OriginalMember(
      owner = "client!fm",
      name = "hc",
      descriptor = "I"
   )
   public int field3786;
   @OriginalMember(
      owner = "client!fm",
      name = "Zf",
      descriptor = "F"
   )
   public float field3799;
   @OriginalMember(
      owner = "client!fm",
      name = "jb",
      descriptor = "F"
   )
   private float field3804;
   @OriginalMember(
      owner = "client!fm",
      name = "Df",
      descriptor = "Z"
   )
   public boolean field3830;
   @OriginalMember(
      owner = "client!fm",
      name = "Kd",
      descriptor = "[F"
   )
   private float[] field3818;
   @OriginalMember(
      owner = "client!fm",
      name = "gg",
      descriptor = "I"
   )
   public int field3813;
   @OriginalMember(
      owner = "client!fm",
      name = "Uc",
      descriptor = "Lmu;"
   )
   public class314 field3806;
   @OriginalMember(
      owner = "client!fm",
      name = "A",
      descriptor = "I"
   )
   public int field3831;
   @OriginalMember(
      owner = "client!fm",
      name = "dd",
      descriptor = "I"
   )
   public int field3792;
   @OriginalMember(
      owner = "client!fm",
      name = "wf",
      descriptor = "F"
   )
   public float field3817;
   @OriginalMember(
      owner = "client!fm",
      name = "Jc",
      descriptor = "F"
   )
   public float field3821;
   @OriginalMember(
      owner = "client!fm",
      name = "wd",
      descriptor = "[F"
   )
   public float[] field3836;
   @OriginalMember(
      owner = "client!fm",
      name = "S",
      descriptor = "Z"
   )
   public boolean field3846;
   @OriginalMember(
      owner = "client!fm",
      name = "We",
      descriptor = "I"
   )
   public int field3809;
   @OriginalMember(
      owner = "client!fm",
      name = "Ef",
      descriptor = "I"
   )
   public int field3834;
   @OriginalMember(
      owner = "client!fm",
      name = "ce",
      descriptor = "I"
   )
   private int field3825;
   @OriginalMember(
      owner = "client!fm",
      name = "Bf",
      descriptor = "Lsp;"
   )
   public class774 field3841;
   @OriginalMember(
      owner = "client!fm",
      name = "qd",
      descriptor = "Z"
   )
   public boolean field3848;
   @OriginalMember(
      owner = "client!fm",
      name = "wc",
      descriptor = "Z"
   )
   public boolean field3794;
   @OriginalMember(
      owner = "client!fm",
      name = "sd",
      descriptor = "Z"
   )
   public boolean field3845;
   @OriginalMember(
      owner = "client!fm",
      name = "xg",
      descriptor = "I"
   )
   private int field3860;
   @OriginalMember(
      owner = "client!fm",
      name = "nc",
      descriptor = "I"
   )
   private int field3856;
   @OriginalMember(
      owner = "client!fm",
      name = "Jf",
      descriptor = "Z"
   )
   public boolean field3852;
   @OriginalMember(
      owner = "client!fm",
      name = "vc",
      descriptor = "I"
   )
   public int field3807;
   @OriginalMember(
      owner = "client!fm",
      name = "lf",
      descriptor = "F"
   )
   public float field3847;
   @OriginalMember(
      owner = "client!fm",
      name = "ld",
      descriptor = "I"
   )
   public int field3854;
   @OriginalMember(
      owner = "client!fm",
      name = "K",
      descriptor = "Z"
   )
   public boolean field3861;
   @OriginalMember(
      owner = "client!fm",
      name = "Uf",
      descriptor = "[F"
   )
   private float[] field3849;
   @OriginalMember(
      owner = "client!fm",
      name = "Cf",
      descriptor = "Z"
   )
   public boolean field3827;
   @OriginalMember(
      owner = "client!fm",
      name = "tb",
      descriptor = "[F"
   )
   public float[] field3824;
   @OriginalMember(
      owner = "client!fm",
      name = "Se",
      descriptor = "F"
   )
   public float field3862;
   @OriginalMember(
      owner = "client!fm",
      name = "Lc",
      descriptor = "I"
   )
   public int field3850;
   @OriginalMember(
      owner = "client!fm",
      name = "qb",
      descriptor = "[F"
   )
   private float[] field3858;
   @OriginalMember(
      owner = "client!fm",
      name = "cd",
      descriptor = "Z"
   )
   private boolean field3822;
   @OriginalMember(
      owner = "client!fm",
      name = "I",
      descriptor = "I"
   )
   public int field3857;
   @OriginalMember(
      owner = "client!fm",
      name = "Qc",
      descriptor = "F"
   )
   public float field3869;
   @OriginalMember(
      owner = "client!fm",
      name = "rd",
      descriptor = "I"
   )
   public int field3874;
   @OriginalMember(
      owner = "client!fm",
      name = "hd",
      descriptor = "Z"
   )
   private boolean field3835;
   @OriginalMember(
      owner = "client!fm",
      name = "Zd",
      descriptor = "I"
   )
   public int field3833;
   @OriginalMember(
      owner = "client!fm",
      name = "Dg",
      descriptor = "[F"
   )
   private float[] field3868;
   @OriginalMember(
      owner = "client!fm",
      name = "ic",
      descriptor = "I"
   )
   public int field3844;
   @OriginalMember(
      owner = "client!fm",
      name = "G",
      descriptor = "I"
   )
   public int field3872;
   @OriginalMember(
      owner = "client!fm",
      name = "Lb",
      descriptor = "I"
   )
   public int field3838;
   @OriginalMember(
      owner = "client!fm",
      name = "Fc",
      descriptor = "I"
   )
   private int field3877;
   @OriginalMember(
      owner = "client!fm",
      name = "Je",
      descriptor = "Z"
   )
   private boolean field3866;
   @OriginalMember(
      owner = "client!fm",
      name = "B",
      descriptor = "I"
   )
   public int field3879;
   @OriginalMember(
      owner = "client!fm",
      name = "Dc",
      descriptor = "I"
   )
   private int field3876;
   @OriginalMember(
      owner = "client!fm",
      name = "md",
      descriptor = "I"
   )
   private int field3828;
   @OriginalMember(
      owner = "client!fm",
      name = "C",
      descriptor = "Z"
   )
   public boolean field3863;
   @OriginalMember(
      owner = "client!fm",
      name = "Pc",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field3802;
   @OriginalMember(
      owner = "client!fm",
      name = "bg",
      descriptor = "Ltm;"
   )
   private class620 field3892;
   @OriginalMember(
      owner = "client!fm",
      name = "nf",
      descriptor = "I"
   )
   public int field3853;
   @OriginalMember(
      owner = "client!fm",
      name = "V",
      descriptor = "Ljava/awt/Canvas;"
   )
   public Canvas field3709;
   @OriginalMember(
      owner = "client!fm",
      name = "Wb",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field3619;
   @OriginalMember(
      owner = "client!fm",
      name = "sc",
      descriptor = "Lww;"
   )
   public class339 field3760;
   @OriginalMember(
      owner = "client!fm",
      name = "zf",
      descriptor = "Ljava/lang/Object;"
   )
   public Object field3751;
   @OriginalMember(
      owner = "client!fm",
      name = "Ze",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field3602;
   @OriginalMember(
      owner = "client!fm",
      name = "Pd",
      descriptor = "I"
   )
   private int field3675;
   @OriginalMember(
      owner = "client!fm",
      name = "ff",
      descriptor = "I"
   )
   public int field3585;
   @OriginalMember(
      owner = "client!fm",
      name = "Wd",
      descriptor = "I"
   )
   private int field3725;
   @OriginalMember(
      owner = "client!fm",
      name = "ng",
      descriptor = "I"
   )
   public int field3661;
   @OriginalMember(
      owner = "client!fm",
      name = "nb",
      descriptor = "I"
   )
   public int field3867;
   @OriginalMember(
      owner = "client!fm",
      name = "D",
      descriptor = "Ljagex3/graphics2/hw/NativeInterface;"
   )
   public NativeInterface field3719;
   @OriginalMember(
      owner = "client!fm",
      name = "Kf",
      descriptor = "Lwb;"
   )
   private class580 field3840;
   @OriginalMember(
      owner = "client!fm",
      name = "Hg",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3904 = new String[]{method2297(method2296("x-n\u0002h6")), method2297(method2296("p5, ")), method2297(method2296("ennb_")), method2297(method2296("x-n\u0002g6")), method2297(method2296("x-n\u0019f6")), method2297(method2296("x-n>C6")), method2297(method2296("x-n\bh6")), method2297(method2296("x-n\re6")), method2297(method2296("x-n\u0018\n")), method2297(method2296("x-n\u001fk6")), method2297(method2296("x-n\t\n")), method2297(method2296("x-n\u0002k6")), method2297(method2296("x-n<C6")), method2297(method2296("x-n\u000bk6")), method2297(method2296("x-n\rg6")), method2297(method2296("x-n\u0018k6")), method2297(method2296("x-n\u001ad6")), method2297(method2296("x-n(C6")), method2297(method2296("x-n\u0000i6")), method2297(method2296("x-n\u0003g6")), method2297(method2296("x-n\u001dj6")), method2297(method2296("x-n\u0003e6")), method2297(method2296("x-n\u001bj6")), method2297(method2296("x-n\u001ej6")), method2297(method2296("x-n\ri6")), method2297(method2296("x-n\u001ch6")), method2297(method2296("x-n\ni6")), method2297(method2296("x-n\u0019d6")), method2297(method2296("x-n\u001dk6")), method2297(method2296("x-n\u0001j6")), method2297(method2296("x-n\u001ag6")), method2297(method2296("x-n\u001cg6")), method2297(method2296("x-n\nh6")), method2297(method2296("x-n\ng6")), method2297(method2296("x-n\u0018d6")), method2297(method2296("x-n\be6")), method2297(method2296("x-n\u0007g6")), method2297(method2296("x-n\u001c\n")), method2297(method2296("x-n\u0004i6")), method2297(method2296("x-n\nd6")), method2297(method2296("x-n\u0006g6")), method2297(method2296("x-n\u001ce6")), method2297(method2296("x-n\rd6")), method2297(method2296("x-n\u000be6")), method2297(method2296("x-n-C6")), method2297(method2296("x-n\bd6")), method2297(method2296("x-n\u0001e6")), method2297(method2296("x-n\u001bf6")), method2297(method2296("x-n\u0002d6")), method2297(method2296("x-n\u001bk6")), method2297(method2296("x-n\u0004e6")), method2297(method2296("x-n\u001bd6")), method2297(method2296("x-n\u0004k6")), method2297(method2296("x-n\rf6")), method2297(method2296("x-n\u0007h6")), method2297(method2296("x-n\u0001g6")), method2297(method2296("x-n*\n")), method2297(method2296("x-n\u0003h6")), method2297(method2296("x-n\u0014c6")), method2297(method2296("x-n\u0000h6")), method2297(method2296("x-n\u0005h6")), method2297(method2296("x-n\u0015\n")), method2297(method2296("x-n\u0005e6")), method2297(method2296("x-n\ti6")), method2297(method2296("x-n\u0006j6")), method2297(method2296("x-n\u000ei6")), method2297(method2296("x-n\tk6")), method2297(method2296("x-n\u001aj6")), method2297(method2296("x-n\u001fj6")), method2297(method2296("x-n\u0007e6")), method2297(method2296("x-n\u001cd6")), method2297(method2296("x-n6C6")), method2297(method2296("x-n\u0006k6")), method2297(method2296("x-n\bi6")), method2297(method2296("x-n\u0005g6")), method2297(method2296("x-n\u0016c6")), method2297(method2296("x-n\tg6")), method2297(method2296("x-n\u0000\n")), method2297(method2296("x-n\u0007\n")), method2297(method2296("x-n\u0000e6")), method2297(method2296("x-n\u000bh6")), method2297(method2296("x-n\u001af6")), method2297(method2296("x-n\u001cj6")), method2297(method2296("x-n\u0018h6")), method2297(method2296("x-n%\n")), method2297(method2296("x-n\u001ek6")), method2297(method2296("x-n\td6")), method2297(method2296("x-n\u001ah6")), method2297(method2296("x-n\u0003d6")), method2297(method2296("x-n\u0001d6")), method2297(method2296("x-n\tc6")), method2297(method2296("x-n\u0002e6")), method2297(method2296("x-n\nk6")), method2297(method2296("x-n\u0018j6")), method2297(method2296("x-n4C6")), method2297(method2296("x-n\u001bh6")), method2297(method2296("x-n\u0004h6")), method2297(method2296("x-n\u000f`6")), method2297(method2296("x-n\u0018g6")), method2297(method2296("x-n\u0018`6")), method2297(method2296("x-n\u000eg6")), method2297(method2296("x-n\u0001h6")), method2297(method2296("x-n\bk6")), method2297(method2296("x-n\u0014\n")), method2297(method2296("x-n\u000ed6")), method2297(method2296("x-n\u000eh6")), method2297(method2296("x-n\u001de6")), method2297(method2296("x-n\u0000d6")), method2297(method2296("x-n\u0003k6")), method2297(method2296("x-n\u000fg6")), method2297(method2296("x-n\u001ak6")), method2297(method2296("x-n\u001eh6")), method2297(method2296("x-n\ne6")), method2297(method2296("x-n\u0007i6")), method2297(method2296("x-n\u000fh6")), method2297(method2296("x-n\u0005i6")), method2297(method2296("x-n\u001ck6")), method2297(method2296("x-n\rk6")), method2297(method2296("x-n\u001ef6")), method2297(method2296("x-n\u0007c6")), method2297(method2296("x-n\u001bg6")), method2297(method2296("x-n\u0003j6")), method2297(method2296("x-n\u0019h6")), method2297(method2296("x-n\u0006e6")), method2297(method2296("x-n\u0004d6")), method2297(method2296("x-n\u001eg6")), method2297(method2296("x-n\u000bd6")), method2297(method2296("x-n\u0000j6")), method2297(method2296("x-n\u0004\n")), method2297(method2296("x-n\u000bg6")), method2297(method2296("x-n C6")), method2297(method2296("x-n\u000fd6")), method2297(method2296("x-n\u000ee6")), method2297(method2296("x-n\u000ek6")), method2297(method2296("x-n\u000bi6")), method2297(method2296("x-n\te6")), method2297(method2296("x-n\th6")), method2297(method2296("x-n>\n")), method2297(method2296("x-n\u0005d6")), method2297(method2296("x-n\rh6")), method2297(method2296("x-n\u000ec6")), method2297(method2296("x-n\u0001k6")), method2297(method2296("x-n\u000fi6")), method2297(method2296("x-n\u0004g6")), method2297(method2296("x-n\u001fg6")), method2297(method2296("x-n\u0019\n")), method2297(method2296("x-n\u0004c6")), method2297(method2296("x-n\u0002j6")), method2297(method2296("x-n\u001fh6")), method2297(method2296("x-n\u0006c6")), method2297(method2296("x-n\u0007k6")), method2297(method2296("x-n\u001ed6")), method2297(method2296("x-n\bg6")), method2297(method2296("x-n\u0007d6")), method2297(method2296("x-n\u001dh6")), method2297(method2296("x-n\u0019g6")), method2297(method2296("x-n\u0006i6")), method2297(method2296("x-n\u0006d6")), method2297(method2296("x-n\bc6")), method2297(method2296("x-n\u0001\n")), method2297(method2296("x-n\u000fe6")), method2297(method2296("x-n\r\n")), method2297(method2296("x-n\u0019j6")), method2297(method2296("x-n\u001dd6")), method2297(method2296("x-n\u000f\n")), method2297(method2296("x-n\u0005k6")), method2297(method2296("x-n\u0019k6")), method2297(method2296("x-n\u001dg6")), method2297(method2296("x-n\u0000g6")), method2297(method2296("t!6-\f\u007f74ba\u007f.6-Q")), method2297(method2296("m%4\u0005Ep/2)p{0!%Lj")), method2297(method2296("x-n\u001d\n")), method2297(method2296("x-n\u0006h6")), method2297(method2296("x-npKp)4r\n")), method2297(method2296("x-n\u0007j6")), method2297(method2296("x-n\u000fk6")), method2297(method2296("x-n\u001fd6")), method2297(method2296("x-n\u0000k6"))};
   @OriginalMember(
      owner = "client!fm",
      name = "nd",
      descriptor = "I"
   )
   public static int field3657 = 0;
   @OriginalMember(
      owner = "client!fm",
      name = "Qd",
      descriptor = "Lgka;"
   )
   public static class669 field3683 = null;
   @OriginalMember(
      owner = "client!fm",
      name = "Mf",
      descriptor = "F"
   )
   private float field3781;
   @OriginalMember(
      owner = "client!fm",
      name = "df",
      descriptor = "F"
   )
   public float field3783;
   @OriginalMember(
      owner = "client!fm",
      name = "Zb",
      descriptor = "F"
   )
   public float field3812;
   @OriginalMember(
      owner = "client!fm",
      name = "ab",
      descriptor = "F"
   )
   public float field3819;
   @OriginalMember(
      owner = "client!fm",
      name = "be",
      descriptor = "F"
   )
   private float field3832;
   @OriginalMember(
      owner = "client!fm",
      name = "of",
      descriptor = "F"
   )
   public float field3837;
   @OriginalMember(
      owner = "client!fm",
      name = "he",
      descriptor = "F"
   )
   public float field3855;
   @OriginalMember(
      owner = "client!fm",
      name = "qg",
      descriptor = "F"
   )
   public float field3871;
   @OriginalMember(
      owner = "client!fm",
      name = "Ke",
      descriptor = "I"
   )
   public static int field3580;
   @OriginalMember(
      owner = "client!fm",
      name = "v",
      descriptor = "I"
   )
   public static int field3581;
   @OriginalMember(
      owner = "client!fm",
      name = "le",
      descriptor = "I"
   )
   public static int field3582;
   @OriginalMember(
      owner = "client!fm",
      name = "F",
      descriptor = "I"
   )
   public static int field3583;
   @OriginalMember(
      owner = "client!fm",
      name = "jg",
      descriptor = "I"
   )
   public static int field3584;
   @OriginalMember(
      owner = "client!fm",
      name = "dc",
      descriptor = "I"
   )
   public static int field3586;
   @OriginalMember(
      owner = "client!fm",
      name = "Cb",
      descriptor = "I"
   )
   public static int field3587;
   @OriginalMember(
      owner = "client!fm",
      name = "vd",
      descriptor = "I"
   )
   public static int field3588;
   @OriginalMember(
      owner = "client!fm",
      name = "Sb",
      descriptor = "I"
   )
   public static int field3589;
   @OriginalMember(
      owner = "client!fm",
      name = "Oe",
      descriptor = "I"
   )
   public static int field3590;
   @OriginalMember(
      owner = "client!fm",
      name = "Vd",
      descriptor = "I"
   )
   public static int field3591;
   @OriginalMember(
      owner = "client!fm",
      name = "Mb",
      descriptor = "I"
   )
   public static int field3592;
   @OriginalMember(
      owner = "client!fm",
      name = "Cg",
      descriptor = "I"
   )
   public static int field3593;
   @OriginalMember(
      owner = "client!fm",
      name = "Tc",
      descriptor = "I"
   )
   public static int field3594;
   @OriginalMember(
      owner = "client!fm",
      name = "Gd",
      descriptor = "I"
   )
   public static int field3595;
   @OriginalMember(
      owner = "client!fm",
      name = "L",
      descriptor = "I"
   )
   public static int field3596;
   @OriginalMember(
      owner = "client!fm",
      name = "od",
      descriptor = "I"
   )
   public static int field3597;
   @OriginalMember(
      owner = "client!fm",
      name = "H",
      descriptor = "I"
   )
   public static int field3598;
   @OriginalMember(
      owner = "client!fm",
      name = "Ed",
      descriptor = "I"
   )
   public static int field3599;
   @OriginalMember(
      owner = "client!fm",
      name = "T",
      descriptor = "I"
   )
   public static int field3600;
   @OriginalMember(
      owner = "client!fm",
      name = "Hc",
      descriptor = "I"
   )
   public static int field3601;
   @OriginalMember(
      owner = "client!fm",
      name = "fd",
      descriptor = "I"
   )
   public static int field3603;
   @OriginalMember(
      owner = "client!fm",
      name = "Bc",
      descriptor = "I"
   )
   public static int field3604;
   @OriginalMember(
      owner = "client!fm",
      name = "gb",
      descriptor = "I"
   )
   public static int field3605;
   @OriginalMember(
      owner = "client!fm",
      name = "Xf",
      descriptor = "I"
   )
   public static int field3606;
   @OriginalMember(
      owner = "client!fm",
      name = "pd",
      descriptor = "I"
   )
   public static int field3607;
   @OriginalMember(
      owner = "client!fm",
      name = "me",
      descriptor = "I"
   )
   public static int field3608;
   @OriginalMember(
      owner = "client!fm",
      name = "Ec",
      descriptor = "I"
   )
   public static int field3609;
   @OriginalMember(
      owner = "client!fm",
      name = "Ve",
      descriptor = "I"
   )
   public static int field3610;
   @OriginalMember(
      owner = "client!fm",
      name = "Pf",
      descriptor = "I"
   )
   public static int field3611;
   @OriginalMember(
      owner = "client!fm",
      name = "ye",
      descriptor = "I"
   )
   public static int field3612;
   @OriginalMember(
      owner = "client!fm",
      name = "qf",
      descriptor = "I"
   )
   public static int field3613;
   @OriginalMember(
      owner = "client!fm",
      name = "Bg",
      descriptor = "I"
   )
   public static int field3614;
   @OriginalMember(
      owner = "client!fm",
      name = "tc",
      descriptor = "I"
   )
   public static int field3615;
   @OriginalMember(
      owner = "client!fm",
      name = "vf",
      descriptor = "I"
   )
   public static int field3617;
   @OriginalMember(
      owner = "client!fm",
      name = "Fb",
      descriptor = "I"
   )
   public static int field3618;
   @OriginalMember(
      owner = "client!fm",
      name = "Re",
      descriptor = "I"
   )
   public static int field3620;
   @OriginalMember(
      owner = "client!fm",
      name = "rc",
      descriptor = "I"
   )
   public static int field3621;
   @OriginalMember(
      owner = "client!fm",
      name = "ef",
      descriptor = "I"
   )
   public static int field3622;
   @OriginalMember(
      owner = "client!fm",
      name = "Xb",
      descriptor = "I"
   )
   public static int field3623;
   @OriginalMember(
      owner = "client!fm",
      name = "Od",
      descriptor = "I"
   )
   public static int field3624;
   @OriginalMember(
      owner = "client!fm",
      name = "Rd",
      descriptor = "I"
   )
   public static int field3625;
   @OriginalMember(
      owner = "client!fm",
      name = "jf",
      descriptor = "I"
   )
   public static int field3626;
   @OriginalMember(
      owner = "client!fm",
      name = "Yd",
      descriptor = "I"
   )
   public static int field3627;
   @OriginalMember(
      owner = "client!fm",
      name = "eg",
      descriptor = "I"
   )
   public static int field3628;
   @OriginalMember(
      owner = "client!fm",
      name = "Le",
      descriptor = "I"
   )
   public static int field3629;
   @OriginalMember(
      owner = "client!fm",
      name = "Sf",
      descriptor = "I"
   )
   public static int field3630;
   @OriginalMember(
      owner = "client!fm",
      name = "Qb",
      descriptor = "I"
   )
   public static int field3631;
   @OriginalMember(
      owner = "client!fm",
      name = "Qf",
      descriptor = "I"
   )
   public static int field3632;
   @OriginalMember(
      owner = "client!fm",
      name = "Db",
      descriptor = "I"
   )
   public static int field3633;
   @OriginalMember(
      owner = "client!fm",
      name = "w",
      descriptor = "I"
   )
   public static int field3634;
   @OriginalMember(
      owner = "client!fm",
      name = "Q",
      descriptor = "I"
   )
   public static int field3635;
   @OriginalMember(
      owner = "client!fm",
      name = "kd",
      descriptor = "I"
   )
   public static int field3636;
   @OriginalMember(
      owner = "client!fm",
      name = "pc",
      descriptor = "I"
   )
   public static int field3637;
   @OriginalMember(
      owner = "client!fm",
      name = "Ad",
      descriptor = "I"
   )
   public static int field3638;
   @OriginalMember(
      owner = "client!fm",
      name = "vg",
      descriptor = "I"
   )
   public static int field3639;
   @OriginalMember(
      owner = "client!fm",
      name = "Nd",
      descriptor = "I"
   )
   public static int field3641;
   @OriginalMember(
      owner = "client!fm",
      name = "wg",
      descriptor = "I"
   )
   public static int field3642;
   @OriginalMember(
      owner = "client!fm",
      name = "Ab",
      descriptor = "I"
   )
   public static int field3643;
   @OriginalMember(
      owner = "client!fm",
      name = "bb",
      descriptor = "I"
   )
   public static int field3644;
   @OriginalMember(
      owner = "client!fm",
      name = "Vb",
      descriptor = "I"
   )
   public static int field3645;
   @OriginalMember(
      owner = "client!fm",
      name = "cc",
      descriptor = "I"
   )
   public static int field3646;
   @OriginalMember(
      owner = "client!fm",
      name = "Rf",
      descriptor = "I"
   )
   public static int field3647;
   @OriginalMember(
      owner = "client!fm",
      name = "yc",
      descriptor = "I"
   )
   public static int field3648;
   @OriginalMember(
      owner = "client!fm",
      name = "gc",
      descriptor = "I"
   )
   public static int field3649;
   @OriginalMember(
      owner = "client!fm",
      name = "Dd",
      descriptor = "I"
   )
   public static int field3650;
   @OriginalMember(
      owner = "client!fm",
      name = "Bb",
      descriptor = "I"
   )
   public static int field3652;
   @OriginalMember(
      owner = "client!fm",
      name = "se",
      descriptor = "I"
   )
   public static int field3653;
   @OriginalMember(
      owner = "client!fm",
      name = "Nf",
      descriptor = "I"
   )
   public static int field3654;
   @OriginalMember(
      owner = "client!fm",
      name = "Yf",
      descriptor = "I"
   )
   public static int field3655;
   @OriginalMember(
      owner = "client!fm",
      name = "Y",
      descriptor = "I"
   )
   public static int field3656;
   @OriginalMember(
      owner = "client!fm",
      name = "yb",
      descriptor = "I"
   )
   public static int field3658;
   @OriginalMember(
      owner = "client!fm",
      name = "sf",
      descriptor = "I"
   )
   public static int field3660;
   @OriginalMember(
      owner = "client!fm",
      name = "bc",
      descriptor = "I"
   )
   public static int field3662;
   @OriginalMember(
      owner = "client!fm",
      name = "zc",
      descriptor = "I"
   )
   public static int field3663;
   @OriginalMember(
      owner = "client!fm",
      name = "ze",
      descriptor = "I"
   )
   public static int field3664;
   @OriginalMember(
      owner = "client!fm",
      name = "jd",
      descriptor = "I"
   )
   public static int field3665;
   @OriginalMember(
      owner = "client!fm",
      name = "Tb",
      descriptor = "I"
   )
   public static int field3666;
   @OriginalMember(
      owner = "client!fm",
      name = "db",
      descriptor = "I"
   )
   public static int field3667;
   @OriginalMember(
      owner = "client!fm",
      name = "rb",
      descriptor = "I"
   )
   public static int field3668;
   @OriginalMember(
      owner = "client!fm",
      name = "Ye",
      descriptor = "I"
   )
   public static int field3669;
   @OriginalMember(
      owner = "client!fm",
      name = "og",
      descriptor = "I"
   )
   public static int field3670;
   @OriginalMember(
      owner = "client!fm",
      name = "M",
      descriptor = "I"
   )
   public static int field3671;
   @OriginalMember(
      owner = "client!fm",
      name = "re",
      descriptor = "I"
   )
   public static int field3672;
   @OriginalMember(
      owner = "client!fm",
      name = "Mc",
      descriptor = "I"
   )
   public static int field3673;
   @OriginalMember(
      owner = "client!fm",
      name = "Nc",
      descriptor = "I"
   )
   public static int field3674;
   @OriginalMember(
      owner = "client!fm",
      name = "Kc",
      descriptor = "I"
   )
   public static int field3676;
   @OriginalMember(
      owner = "client!fm",
      name = "Eg",
      descriptor = "I"
   )
   public static int field3677;
   @OriginalMember(
      owner = "client!fm",
      name = "bd",
      descriptor = "I"
   )
   public static int field3678;
   @OriginalMember(
      owner = "client!fm",
      name = "tf",
      descriptor = "I"
   )
   public static int field3679;
   @OriginalMember(
      owner = "client!fm",
      name = "N",
      descriptor = "I"
   )
   public static int field3680;
   @OriginalMember(
      owner = "client!fm",
      name = "Fe",
      descriptor = "I"
   )
   public static int field3681;
   @OriginalMember(
      owner = "client!fm",
      name = "ed",
      descriptor = "I"
   )
   public static int field3682;
   @OriginalMember(
      owner = "client!fm",
      name = "de",
      descriptor = "I"
   )
   public static int field3684;
   @OriginalMember(
      owner = "client!fm",
      name = "ge",
      descriptor = "I"
   )
   public static int field3685;
   @OriginalMember(
      owner = "client!fm",
      name = "Lf",
      descriptor = "I"
   )
   public static int field3686;
   @OriginalMember(
      owner = "client!fm",
      name = "Gg",
      descriptor = "I"
   )
   public static int field3687;
   @OriginalMember(
      owner = "client!fm",
      name = "Te",
      descriptor = "I"
   )
   public static int field3688;
   @OriginalMember(
      owner = "client!fm",
      name = "Z",
      descriptor = "I"
   )
   public static int field3689;
   @OriginalMember(
      owner = "client!fm",
      name = "Hd",
      descriptor = "I"
   )
   public static int field3690;
   @OriginalMember(
      owner = "client!fm",
      name = "Nb",
      descriptor = "I"
   )
   public static int field3691;
   @OriginalMember(
      owner = "client!fm",
      name = "Hb",
      descriptor = "I"
   )
   public static int field3692;
   @OriginalMember(
      owner = "client!fm",
      name = "Vc",
      descriptor = "I"
   )
   public static int field3693;
   @OriginalMember(
      owner = "client!fm",
      name = "Md",
      descriptor = "I"
   )
   public static int field3694;
   @OriginalMember(
      owner = "client!fm",
      name = "pb",
      descriptor = "I"
   )
   public static int field3695;
   @OriginalMember(
      owner = "client!fm",
      name = "lb",
      descriptor = "I"
   )
   public static int field3696;
   @OriginalMember(
      owner = "client!fm",
      name = "cf",
      descriptor = "I"
   )
   public static int field3697;
   @OriginalMember(
      owner = "client!fm",
      name = "Vf",
      descriptor = "I"
   )
   public static int field3698;
   @OriginalMember(
      owner = "client!fm",
      name = "we",
      descriptor = "I"
   )
   public static int field3699;
   @OriginalMember(
      owner = "client!fm",
      name = "Wf",
      descriptor = "I"
   )
   public static int field3700;
   @OriginalMember(
      owner = "client!fm",
      name = "yd",
      descriptor = "I"
   )
   public static int field3701;
   @OriginalMember(
      owner = "client!fm",
      name = "ue",
      descriptor = "I"
   )
   public static int field3702;
   @OriginalMember(
      owner = "client!fm",
      name = "De",
      descriptor = "I"
   )
   public static int field3703;
   @OriginalMember(
      owner = "client!fm",
      name = "uc",
      descriptor = "I"
   )
   public static int field3704;
   @OriginalMember(
      owner = "client!fm",
      name = "oe",
      descriptor = "I"
   )
   public static int field3705;
   @OriginalMember(
      owner = "client!fm",
      name = "xc",
      descriptor = "I"
   )
   public static int field3706;
   @OriginalMember(
      owner = "client!fm",
      name = "Rc",
      descriptor = "I"
   )
   public static int field3708;
   @OriginalMember(
      owner = "client!fm",
      name = "Me",
      descriptor = "I"
   )
   public static int field3710;
   @OriginalMember(
      owner = "client!fm",
      name = "Ge",
      descriptor = "I"
   )
   public static int field3711;
   @OriginalMember(
      owner = "client!fm",
      name = "Ie",
      descriptor = "I"
   )
   public static int field3712;
   @OriginalMember(
      owner = "client!fm",
      name = "te",
      descriptor = "I"
   )
   public static int field3713;
   @OriginalMember(
      owner = "client!fm",
      name = "Jd",
      descriptor = "I"
   )
   public static int field3714;
   @OriginalMember(
      owner = "client!fm",
      name = "zd",
      descriptor = "I"
   )
   public static int field3715;
   @OriginalMember(
      owner = "client!fm",
      name = "je",
      descriptor = "I"
   )
   public static int field3716;
   @OriginalMember(
      owner = "client!fm",
      name = "gd",
      descriptor = "I"
   )
   public static int field3717;
   @OriginalMember(
      owner = "client!fm",
      name = "zb",
      descriptor = "I"
   )
   public static int field3718;
   @OriginalMember(
      owner = "client!fm",
      name = "ad",
      descriptor = "I"
   )
   public static int field3720;
   @OriginalMember(
      owner = "client!fm",
      name = "qc",
      descriptor = "I"
   )
   public static int field3721;
   @OriginalMember(
      owner = "client!fm",
      name = "Ud",
      descriptor = "I"
   )
   public static int field3722;
   @OriginalMember(
      owner = "client!fm",
      name = "mf",
      descriptor = "I"
   )
   public static int field3723;
   @OriginalMember(
      owner = "client!fm",
      name = "rg",
      descriptor = "I"
   )
   public static int field3724;
   @OriginalMember(
      owner = "client!fm",
      name = "Oc",
      descriptor = "I"
   )
   public static int field3726;
   @OriginalMember(
      owner = "client!fm",
      name = "jc",
      descriptor = "I"
   )
   public static int field3727;
   @OriginalMember(
      owner = "client!fm",
      name = "Tf",
      descriptor = "I"
   )
   public static int field3728;
   @OriginalMember(
      owner = "client!fm",
      name = "Kb",
      descriptor = "I"
   )
   public static int field3729;
   @OriginalMember(
      owner = "client!fm",
      name = "Fg",
      descriptor = "I"
   )
   public static int field3730;
   @OriginalMember(
      owner = "client!fm",
      name = "Wc",
      descriptor = "I"
   )
   public static int field3731;
   @OriginalMember(
      owner = "client!fm",
      name = "yg",
      descriptor = "I"
   )
   public static int field3732;
   @OriginalMember(
      owner = "client!fm",
      name = "Rb",
      descriptor = "I"
   )
   public static int field3733;
   @OriginalMember(
      owner = "client!fm",
      name = "oc",
      descriptor = "I"
   )
   public static int field3734;
   @OriginalMember(
      owner = "client!fm",
      name = "xf",
      descriptor = "I"
   )
   public static int field3735;
   @OriginalMember(
      owner = "client!fm",
      name = "Ib",
      descriptor = "I"
   )
   public static int field3736;
   @OriginalMember(
      owner = "client!fm",
      name = "Yb",
      descriptor = "I"
   )
   public static int field3737;
   @OriginalMember(
      owner = "client!fm",
      name = "Ff",
      descriptor = "I"
   )
   public static int field3738;
   @OriginalMember(
      owner = "client!fm",
      name = "fe",
      descriptor = "I"
   )
   public static int field3739;
   @OriginalMember(
      owner = "client!fm",
      name = "X",
      descriptor = "I"
   )
   public static int field3740;
   @OriginalMember(
      owner = "client!fm",
      name = "Sc",
      descriptor = "I"
   )
   public static int field3741;
   @OriginalMember(
      owner = "client!fm",
      name = "ib",
      descriptor = "I"
   )
   public static int field3742;
   @OriginalMember(
      owner = "client!fm",
      name = "zg",
      descriptor = "I"
   )
   public static int field3743;
   @OriginalMember(
      owner = "client!fm",
      name = "kf",
      descriptor = "I"
   )
   public static int field3744;
   @OriginalMember(
      owner = "client!fm",
      name = "kg",
      descriptor = "I"
   )
   public static int field3745;
   @OriginalMember(
      owner = "client!fm",
      name = "Zc",
      descriptor = "I"
   )
   public static int field3746;
   @OriginalMember(
      owner = "client!fm",
      name = "Ub",
      descriptor = "I"
   )
   public static int field3747;
   @OriginalMember(
      owner = "client!fm",
      name = "xe",
      descriptor = "I"
   )
   public static int field3748;
   @OriginalMember(
      owner = "client!fm",
      name = "sg",
      descriptor = "I"
   )
   public static int field3749;
   @OriginalMember(
      owner = "client!fm",
      name = "ee",
      descriptor = "I"
   )
   public static int field3750;
   @OriginalMember(
      owner = "client!fm",
      name = "mb",
      descriptor = "I"
   )
   public static int field3752;
   @OriginalMember(
      owner = "client!fm",
      name = "cb",
      descriptor = "I"
   )
   public static int field3753;
   @OriginalMember(
      owner = "client!fm",
      name = "Bd",
      descriptor = "I"
   )
   public static int field3754;
   @OriginalMember(
      owner = "client!fm",
      name = "pf",
      descriptor = "I"
   )
   public static int field3755;
   @OriginalMember(
      owner = "client!fm",
      name = "cg",
      descriptor = "I"
   )
   public static int field3756;
   @OriginalMember(
      owner = "client!fm",
      name = "wb",
      descriptor = "I"
   )
   public static int field3757;
   @OriginalMember(
      owner = "client!fm",
      name = "mg",
      descriptor = "I"
   )
   public static int field3758;
   @OriginalMember(
      owner = "client!fm",
      name = "dg",
      descriptor = "I"
   )
   public static int field3759;
   @OriginalMember(
      owner = "client!fm",
      name = "hf",
      descriptor = "I"
   )
   public static int field3761;
   @OriginalMember(
      owner = "client!fm",
      name = "Qe",
      descriptor = "I"
   )
   public static int field3762;
   @OriginalMember(
      owner = "client!fm",
      name = "J",
      descriptor = "I"
   )
   public static int field3763;
   @OriginalMember(
      owner = "client!fm",
      name = "ve",
      descriptor = "I"
   )
   public static int field3764;
   @OriginalMember(
      owner = "client!fm",
      name = "hb",
      descriptor = "I"
   )
   public static int field3765;
   @OriginalMember(
      owner = "client!fm",
      name = "tg",
      descriptor = "I"
   )
   public static int field3766;
   @OriginalMember(
      owner = "client!fm",
      name = "Jb",
      descriptor = "I"
   )
   public static int field3767;
   @OriginalMember(
      owner = "client!fm",
      name = "ae",
      descriptor = "I"
   )
   public static int field3768;
   @OriginalMember(
      owner = "client!fm",
      name = "Ob",
      descriptor = "I"
   )
   public int field3769;
   @OriginalMember(
      owner = "client!fm",
      name = "xb",
      descriptor = "I"
   )
   public int field3771;
   @OriginalMember(
      owner = "client!fm",
      name = "Sd",
      descriptor = "I"
   )
   public int field3772;
   @OriginalMember(
      owner = "client!fm",
      name = "z",
      descriptor = "I"
   )
   public int field3780;
   @OriginalMember(
      owner = "client!fm",
      name = "ec",
      descriptor = "I"
   )
   public int field3785;
   @OriginalMember(
      owner = "client!fm",
      name = "rf",
      descriptor = "I"
   )
   public int field3805;
   @OriginalMember(
      owner = "client!fm",
      name = "lg",
      descriptor = "I"
   )
   private int field3810;
   @OriginalMember(
      owner = "client!fm",
      name = "Pb",
      descriptor = "I"
   )
   private int field3811;
   @OriginalMember(
      owner = "client!fm",
      name = "y",
      descriptor = "I"
   )
   public int field3829;
   @OriginalMember(
      owner = "client!fm",
      name = "Ld",
      descriptor = "I"
   )
   public int field3843;
   @OriginalMember(
      owner = "client!fm",
      name = "x",
      descriptor = "I"
   )
   public int field3859;
   @OriginalMember(
      owner = "client!fm",
      name = "yf",
      descriptor = "I"
   )
   public int field3870;
   @OriginalMember(
      owner = "client!fm",
      name = "mc",
      descriptor = "I"
   )
   public int field3873;
   @OriginalMember(
      owner = "client!fm",
      name = "Id",
      descriptor = "I"
   )
   private int field3902;
   @OriginalMember(
      owner = "client!fm",
      name = "peer",
      descriptor = "J"
   )
   public long peer;
   @OriginalMember(
      owner = "client!fm",
      name = "pg",
      descriptor = "Lbc;"
   )
   private class11 field3880;
   @OriginalMember(
      owner = "client!fm",
      name = "Ce",
      descriptor = "Lbc;"
   )
   private class11 field3882;
   @OriginalMember(
      owner = "client!fm",
      name = "Ac",
      descriptor = "Lbc;"
   )
   private class11 field3898;
   @OriginalMember(
      owner = "client!fm",
      name = "ac",
      descriptor = "Lql;"
   )
   private class198 field3779;
   @OriginalMember(
      owner = "client!fm",
      name = "Pe",
      descriptor = "Lfi;"
   )
   private class265 field3895;
   @OriginalMember(
      owner = "client!fm",
      name = "id",
      descriptor = "Lcl;"
   )
   public class351 field3883;
   @OriginalMember(
      owner = "client!fm",
      name = "Ic",
      descriptor = "Lcl;"
   )
   public class351 field3885;
   @OriginalMember(
      owner = "client!fm",
      name = "ug",
      descriptor = "Lcl;"
   )
   public class351 field3886;
   @OriginalMember(
      owner = "client!fm",
      name = "ke",
      descriptor = "Lcl;"
   )
   public class351 field3887;
   @OriginalMember(
      owner = "client!fm",
      name = "Ue",
      descriptor = "Lcl;"
   )
   public class351 field3890;
   @OriginalMember(
      owner = "client!fm",
      name = "Hf",
      descriptor = "Lcl;"
   )
   public class351 field3891;
   @OriginalMember(
      owner = "client!fm",
      name = "Of",
      descriptor = "Lcl;"
   )
   public class351 field3894;
   @OriginalMember(
      owner = "client!fm",
      name = "ud",
      descriptor = "Lcl;"
   )
   public class351 field3896;
   @OriginalMember(
      owner = "client!fm",
      name = "W",
      descriptor = "Lcl;"
   )
   public class351 field3899;
   @OriginalMember(
      owner = "client!fm",
      name = "kc",
      descriptor = "Lcl;"
   )
   public class351 field3900;
   @OriginalMember(
      owner = "client!fm",
      name = "fg",
      descriptor = "Lob;"
   )
   private class393 field3808;
   @OriginalMember(
      owner = "client!fm",
      name = "gf",
      descriptor = "Lvba;"
   )
   public class421 field3878;
   @OriginalMember(
      owner = "client!fm",
      name = "ub",
      descriptor = "Lkfa;"
   )
   private class428 field3881;
   @OriginalMember(
      owner = "client!fm",
      name = "If",
      descriptor = "Lkfa;"
   )
   private class428 field3884;
   @OriginalMember(
      owner = "client!fm",
      name = "sb",
      descriptor = "Lkfa;"
   )
   private class428 field3888;
   @OriginalMember(
      owner = "client!fm",
      name = "Be",
      descriptor = "Lkfa;"
   )
   public class428 field3889;
   @OriginalMember(
      owner = "client!fm",
      name = "Ee",
      descriptor = "Lkfa;"
   )
   public class428 field3893;
   @OriginalMember(
      owner = "client!fm",
      name = "td",
      descriptor = "Lkfa;"
   )
   public class428 field3897;
   @OriginalMember(
      owner = "client!fm",
      name = "bf",
      descriptor = "Lkfa;"
   )
   public class428 field3901;
   @OriginalMember(
      owner = "client!fm",
      name = "U",
      descriptor = "Lfb;"
   )
   private class543 field3790;
   @OriginalMember(
      owner = "client!fm",
      name = "ig",
      descriptor = "Ldd;"
   )
   public class712 field3651;
   @OriginalMember(
      owner = "client!fm",
      name = "vb",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   public NativeHeap field3659;
   @OriginalMember(
      owner = "client!fm",
      name = "Gb",
      descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   public NativeHeapBuffer field3707;
   @OriginalMember(
      owner = "client!fm",
      name = "ie",
      descriptor = "Ljava/util/Hashtable;"
   )
   private Hashtable field3640;
   @OriginalMember(
      owner = "client!fm",
      name = "Ag",
      descriptor = "Z"
   )
   public boolean field3782;
   @OriginalMember(
      owner = "client!fm",
      name = "Ne",
      descriptor = "Z"
   )
   public boolean field3789;
   @OriginalMember(
      owner = "client!fm",
      name = "Cd",
      descriptor = "Z"
   )
   public boolean field3815;
   @OriginalMember(
      owner = "client!fm",
      name = "Ae",
      descriptor = "Z"
   )
   public boolean field3816;
   @OriginalMember(
      owner = "client!fm",
      name = "Fd",
      descriptor = "Z"
   )
   public boolean field3851;
   @OriginalMember(
      owner = "client!fm",
      name = "u",
      descriptor = "Z"
   )
   public boolean field3903;
   @OriginalMember(
      owner = "client!fm",
      name = "Xd",
      descriptor = "[Lue;"
   )
   public class243[] field3864;
   @OriginalMember(
      owner = "client!fm",
      name = "Xc",
      descriptor = "[Lvba;"
   )
   private class421[] field3865;
   @OriginalMember(
      owner = "client!fm",
      name = "hg",
      descriptor = "[Lvv;"
   )
   public class467[] field3842;
   @OriginalMember(
      owner = "client!fm",
      name = "Gf",
      descriptor = "[Lvv;"
   )
   public class467[] field3875;
   @OriginalMember(
      owner = "client!fm",
      name = "lc",
      descriptor = "[Ltm;"
   )
   public class620[] field3839;
   @OriginalMember(
      owner = "client!fm",
      name = "ag",
      descriptor = "[Lcba;"
   )
   public class95[] field3823;

   @OriginalMember(
      owner = "client!fm",
      name = "c",
      descriptor = "(B)V"
   )
   public abstract void method1408(byte arg0);

   @OriginalMember(
      owner = "client!fm",
      name = "w",
      descriptor = "()V"
   )
   public void method401() {
      boolean var1 = client.field1481;

      try {
         ++field3686;
         if (!this.field3822) {
            class673 var2 = this.field3616.method288(0);
            if (var1) {
               ((class152)var2).method1221(-11942);
               var2 = this.field3616.method290(17958);
            }

            while(true) {
               if (var2 == null) {
                  Enumeration var3 = this.field3640.keys();
                  if (!var1) {
                     Canvas var4;
                     if (var1) {
                        var4 = (Canvas)var3.nextElement();
                        this.method1401(50, this.field3640.get(var4), var4);
                     }

                     while(true) {
                        Object var10000;
                        if (!var3.hasMoreElements()) {
                           class201.method1661(20251, false, true);
                           this.field3719.release();
                           var10000 = this;
                           if (!var1) {
                              this.field3822 = true;
                              return;
                           }
                        } else {
                           var10000 = var3.nextElement();
                        }

                        var4 = (Canvas)var10000;
                        this.method1401(50, this.field3640.get(var4), var4);
                     }
                  }
               } else {
                  ((class152)var2).method1221(-11942);
               }

               var2 = this.field3616.method290(17958);
            }
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field3904[118] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method403(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         ++field3743;
         float var8 = (float)arg2 - (float)arg0;
         float var9 = (float)arg3 - (float)arg1;
         float var10 = 0.0F;
         float var11 = 1.0F;
         if (var8 != 0.0F || var9 != 0.0F) {
            var11 = (float)Math.sqrt((double)(var8 * var8 + var9 * var9));
            var10 = (float)Math.atan2((double)var9, (double)var8);
         }

         this.method2289((byte)-121);
         this.method2276(arg4, 71);
         this.method2288((byte)-10, class354.field4947, 0);
         this.method2211((byte)-126, class354.field4947, 0);
         this.method2256(true, arg6);
         this.field3770.method4594(1.0F, (float)arg5, var11, (byte)-108);
         this.field3770.method868(0, -arg5 / 2, 0);
         this.field3770.method871(16383 & (int)((double)var10 * 2607.5945876176133D));
         this.field3770.method868(arg0, arg1, 0);
         this.method2218(0);
         this.method1423(false, (byte)-35);
         this.method2291(true);
         this.method1423(true, (byte)-35);
         this.method2211((byte)-126, class363.field5039, 0);
         this.method2288((byte)-10, class363.field5039, 0);
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field3904[152] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "F",
      descriptor = "(I)V"
   )
   public abstract void method1430(int arg0);

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(BLwk;I)V"
   )
   public final void method2211(byte arg0, class255 arg1, int arg2) {
      try {
         ++field3635;
         int var4 = 99 / ((arg0 - -64) / 58);
         this.method1390(arg1, false, arg2, (byte)108);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field3904[32] + arg0 + ',' + (arg1 != null ? field3904[2] : field3904[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "m",
      descriptor = "(B)V"
   )
   public abstract void method1400(byte arg0);

   @OriginalMember(
      owner = "client!fm",
      name = "K",
      descriptor = "([I)V"
   )
   public final void method417(int[] arg0) {
      try {
         arg0[1] = this.field3844;
         arg0[3] = this.field3809;
         ++field3723;
         arg0[2] = this.field3850;
         arg0[0] = this.field3872;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[78] + (arg0 != null ? field3904[2] : field3904[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "c",
      descriptor = "(IIIIII)V"
   )
   public final void method462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field3688;
         float var7 = this.method1381(21158);
         this.method2289((byte)-117);
         this.method2276(arg4, 84);
         this.method2288((byte)-10, class354.field4947, 0);
         this.method2211((byte)-123, class354.field4947, 0);
         this.method2256(true, arg5);
         this.field3770.method4594(1.0F, (float)(arg3 + -1), (float)(arg2 - 1), (byte)-103);
         this.field3770.method4573((float)arg1 - var7, 2, 0.0F, (float)arg0 + -var7);
         this.method2218(0);
         this.method1423(false, (byte)-35);
         this.method2257(class665.field9857, -102, 4);
         this.method1423(true, (byte)-35);
         this.method2211((byte)47, class363.field5039, 0);
         this.method2288((byte)-10, class363.field5039, 0);
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field3904[33] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "K",
      descriptor = "(I)V"
   )
   private final void method2212(int arg0) {
      try {
         if (class617.field9088 != this.field3806) {
            class314 var2 = this.field3806;
            this.field3806 = class617.field9088;
            if (var2.method2493((byte)-91)) {
               this.method2219(false);
            }

            this.method2251(120);
            this.field3824 = this.field3868;
            this.method2295(108);
            this.field3810 &= -25;
         }

         ++field3745;
         if (arg0 >= -72) {
            this.method1419(-72, -3, -94, (class68)null, -64, 12, (class265)null);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3904[105] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "b",
      descriptor = "(IIIIII)Lkc;"
   )
   public final class72 method423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field3738;
         return new class205(this, arg0, arg1, arg2, arg3, arg4, arg5);
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field3904[176] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "l",
      descriptor = "(II)Lob;"
   )
   public class393 method1370(int arg0, int arg1) {
      try {
         if (arg0 != 2) {
            this.method1430(-15);
         }

         ++field3702;
         if (~arg1 != -7) {
            if (~arg1 == -2) {
               return new class482(this);
            }

            if (arg1 == 2) {
               return new class284(this, this.field3651);
            }

            if (~arg1 != -8) {
               return new class645(this);
            }

            if (!client.field1481) {
               return new class617(this);
            }
         }

         return new class168(this);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3904[97] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "U",
      descriptor = "(IIIII)V"
   )
   public final void method474(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field3711;
         this.method446(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field3904[145] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(FBFFFFF)Z"
   )
   private final boolean method2213(float arg0, byte arg1, float arg2, float arg3, float arg4, float arg5, float arg6) {
      try {
         ++field3746;
         Buffer var8 = this.field3882.method102((byte)-91, true);
         if (var8 == null) {
            return false;
         } else {
            if (arg1 != 32) {
               this.method1419(31, 39, 11, (class68)null, -33, -11, (class265)null);
            }

            Stream var9;
            label20: {
               var9 = this.method2235(true, var8);
               if (Stream.method2990()) {
                  var9.method2994(arg3);
                  var9.method2994(arg6);
                  var9.method2994(arg4);
                  var9.method2994(arg5);
                  var9.method2994(arg0);
                  var9.method2994(arg2);
                  if (!client.field1481) {
                     break label20;
                  }
               }

               var9.method2997(arg3);
               var9.method2997(arg6);
               var9.method2997(arg4);
               var9.method2997(arg5);
               var9.method2997(arg0);
               var9.method2997(arg2);
            }

            var9.method2995();
            return this.field3882.method104(-19749);
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field3904[150] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "da",
      descriptor = "(III[I)V"
   )
   public final void method451(int arg0, int arg1, int arg2, int[] arg3) {
      try {
         float var5;
         int var6;
         int var7;
         label25: {
            ++field3669;
            var5 = this.field3774.method4589((float)arg2, 43, (float)arg0, (float)arg1);
            if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
               var6 = this.field3833;
               var7 = this.field3820;
               if (!client.field1481) {
                  break label25;
               }
            }

            var7 = (int)((float)this.field3807 * this.field3774.method4590((float)arg2, (float)arg0, (byte)-121, (float)arg1) / var5);
            var6 = (int)((float)this.field3786 * this.field3774.method4571(123, (float)arg1, (float)arg0, (float)arg2) / var5);
         }

         arg3[2] = (int)var5;
         arg3[0] = (int)((float)var7 + -this.field3837);
         arg3[1] = (int)((float)var6 - this.field3812);
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field3904[17] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3904[2] : field3904[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(BZ)V"
   )
   public final void method2214(byte arg0, boolean arg1) {
      try {
         if (arg0 != 109) {
            this.field3790 = null;
         }

         ++field3612;
         if (this.field3794 == !arg1) {
            this.field3794 = arg1;
            this.method1426(false);
            this.field3810 &= -32;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3904[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "j",
      descriptor = "(I)V"
   )
   public final void method2215(int arg0) {
      try {
         if (class214.field2727 != this.field3806) {
            class314 var2 = this.field3806;
            this.field3806 = class214.field2727;
            if (var2.method2493((byte)-91)) {
               this.method2219(false);
            }

            this.field3810 &= -32;
            this.field3824 = this.field3849;
         }

         if (arg0 == -32) {
            ++field3645;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3904[110] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "Q",
      descriptor = "(I)V"
   )
   public final void method2216(int arg0) {
      boolean var2 = client.field1481;

      try {
         ++field3652;
         int var3 = 109 % ((arg0 - 24) / 35);
         Enumeration var4 = this.field3640.keys();
         Canvas var5;
         if (var2) {
            var5 = (Canvas)var4.nextElement();
            this.method1401(50, this.field3640.get(var5), var5);
         }

         while(true) {
            Object var10000;
            if (!var4.hasMoreElements()) {
               this.field3898.method105(-109);
               this.field3882.method105(-124);
               this.field3880.method105(-110);
               this.field3890.method2802(101);
               this.field3891.method2802(34);
               this.field3894.method2802(40);
               this.field3883.method2802(11);
               this.field3896.method2802(112);
               this.field3790.method4102(-107);
               var10000 = this.field3895;
               if (!var2) {
                  ((class265)var10000).method105(-93);
                  return;
               }
            } else {
               var10000 = var4.nextElement();
            }

            var5 = (Canvas)var10000;
            this.method1401(50, this.field3640.get(var5), var5);
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field3904[172] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(IIIIIIIIBI)Z"
   )
   public static final boolean method2217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
      try {
         ++field3768;
         if (!class796.method5736(arg3, (byte)109, arg7, arg9)) {
            return false;
         } else {
            if (arg8 != 67) {
               field3683 = null;
            }

            int var20 = class84.field1167[0];
            int var15 = class84.field1167[2];
            int var19 = class84.field1167[1];
            if (!class796.method5736(arg6, (byte)120, arg5, arg4)) {
               return false;
            } else {
               int var18 = class84.field1167[2];
               int var17 = class84.field1167[1];
               int var16 = class84.field1167[0];
               if (!class796.method5736(arg2, (byte)119, arg0, arg1)) {
                  return false;
               } else {
                  int var13 = class84.field1167[0];
                  int var14 = class84.field1167[2];
                  int var12 = class84.field1167[1];
                  return class428.method3313(var15, var13, var18, var20, var14, 103, var16, var19, var17, var12);
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field3904[127] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "za",
      descriptor = "(IIIII)V"
   )
   public final void method420(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field3591;
         this.method2289((byte)-124);
         this.method2276(arg3, 115);
         this.method2288((byte)-10, class354.field4947, 0);
         this.method2211((byte)10, class354.field4947, 0);
         this.method2256(true, arg4);
         this.field3770.method4594(1.0F, (float)arg2, (float)arg2, (byte)-118);
         this.field3770.method868(arg0, arg1, 0);
         this.method2218(0);
         this.method1423(false, (byte)-35);
         this.method1375(this.field3880, true, 0);
         this.method1402(1, this.field3888);
         this.method1413(true, 256, 0, class437.field5958);
         this.method1423(true, (byte)-35);
         this.method2211((byte)77, class363.field5039, 0);
         this.method2288((byte)-10, class363.field5039, 0);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field3904[71] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "Y",
      descriptor = "()[I"
   )
   public final int[] method419() {
      try {
         ++field3701;
         return new int[]{this.field3820, this.field3833, this.field3807, this.field3786};
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3904[61] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "x",
      descriptor = "()Z"
   )
   public final boolean method488() {
      try {
         ++field3713;
         return false;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3904[100] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "p",
      descriptor = "(I)V"
   )
   public final void method2218(int arg0) {
      try {
         if (arg0 != 0) {
            this.method2219(false);
         }

         ++field3699;
         this.field3773 = false;
         this.method2228(67);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[60] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "n",
      descriptor = "()Z"
   )
   public final boolean method461() {
      try {
         ++field3599;
         return false;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3904[81] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method496(Canvas arg0, int arg1, int arg2) {
      try {
         ++field3641;
         Object var4 = null;
         if (arg0 != null && this.field3709 != arg0) {
            if (this.field3640.containsKey(arg0)) {
               var4 = this.field3640.get(arg0);
            }
         } else {
            var4 = this.field3602;
         }

         if (var4 == null) {
            throw new RuntimeException();
         } else {
            this.method1380(arg0, var4, (byte)-120);
            if (this.field3619 == arg0) {
               this.method2270(0);
            }
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field3904[51] + (arg0 != null ? field3904[2] : field3904[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "e",
      descriptor = "(Z)V"
   )
   private final void method2219(boolean arg0) {
      try {
         ++field3584;
         this.field3788 = arg0;
         if (this.field3808 != null) {
            this.field3808.method2737(0);
         }

         this.method1430(1);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[106] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method514(int arg0) {
      try {
         ++field3654;
         if (~arg0 != -2) {
            throw new IllegalArgumentException("");
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[45] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(FB)V"
   )
   public final void method2220(float arg0, byte arg1) {
      try {
         ++field3763;
         if (this.field3804 != arg0) {
            this.field3804 = arg0;
            this.method2225(true);
         }

         if (arg1 < 13) {
            field3657 = 112;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3904[46] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "b",
      descriptor = "(ZB)V"
   )
   public abstract void method1423(boolean arg0, byte arg1);

   @OriginalMember(
      owner = "client!fm",
      name = "A",
      descriptor = "(ILaa;II)V"
   )
   public final void method421(int arg0, class87 arg1, int arg2, int arg3) {
      try {
         ++field3624;
         class477 var5 = (class477)arg1;
         class177 var6 = var5.field6645;
         this.method2237((byte)-105);
         this.method2265(var6, (byte)-83);
         this.method2256(true, 1);
         this.method2231(class318.field4380, class318.field4380, (byte)-121);
         this.method2288((byte)-10, class354.field4947, 0);
         this.method2276(arg0, 99);
         this.field3770.method4594(0.0F, (float)this.field3661, (float)this.field3585, (byte)-121);
         this.method2218(0);
         this.field3839[0].method4594(1.0F, var6.method1510(73, (float)this.field3661), var6.method1514((byte)103, (float)this.field3585), (byte)-127);
         this.field3839[0].method4573(var6.method1510(-102, (float)(-arg3)), 2, 0.0F, var6.method1514((byte)59, (float)(-arg2)));
         this.field3823[0] = class152.field1892;
         this.method2275(2);
         this.method2291(true);
         this.method2282(false);
         this.method2288((byte)-10, class363.field5039, 0);
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field3904[161] + arg0 + ',' + (arg1 != null ? field3904[2] : field3904[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "t",
      descriptor = "(I)I"
   )
   public final int method2221(int arg0) {
      try {
         if (arg0 > -80) {
            this.method458(37);
         }

         ++field3726;
         return this.field3811;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[107] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "bb",
      descriptor = "(I)V"
   )
   public final void method2222(int arg0) {
      try {
         if (~this.field3810 != -5) {
            this.method2212(-91);
            this.method2244(false, false);
            this.method2271((byte)109, false);
            this.method2214((byte)109, false);
            this.method2287(false, 99);
            this.method2236(-2, false, true, false);
            this.method2256(true, 1);
            this.method2240(-4, 0);
            this.field3810 = 4;
         }

         ++field3634;
         if (arg0 != 1) {
            this.method2224(99);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[64] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(ILwn;Ldja;)Z"
   )
   public abstract boolean method1373(int arg0, class576 arg1, class45 arg2);

   @OriginalMember(
      owner = "client!fm",
      name = "E",
      descriptor = "(I)V"
   )
   public abstract void method1399(int arg0);

   @OriginalMember(
      owner = "client!fm",
      name = "j",
      descriptor = "(Z)V"
   )
   public abstract void method1425(boolean arg0);

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(ZLcba;)V"
   )
   public final void method2223(boolean arg0, class95 arg1) {
      try {
         if (arg0) {
            this.field3813 = -74;
         }

         this.field3823[this.field3793] = arg1;
         ++field3749;
         this.method2275(2);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3904[122] + arg0 + ',' + (arg1 != null ? field3904[2] : field3904[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "s",
      descriptor = "(B)V"
   )
   public abstract void method1377(byte arg0);

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(I[Lue;)V"
   )
   public final void method485(int arg0, class243[] arg1) {
      boolean var3 = client.field1481;

      try {
         int var4 = 0;
         if (var3) {
            this.field3864[var4] = arg1[var4];
            ++var4;
         }

         while(true) {
            class281 var10000;
            if (var4 >= arg0) {
               ++field3757;
               this.field3785 = arg0;
               var10000 = this;
               if (!var3) {
                  if (this.field3806.method2493((byte)-91)) {
                     this.method1395(true);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = this;
            }

            var10000.field3864[var4] = arg1[var4];
            ++var4;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field3904[138] + arg0 + ',' + (arg1 != null ? field3904[2] : field3904[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "s",
      descriptor = "(I)V"
   )
   private final void method2224(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fm",
      name = "L",
      descriptor = "(III)V"
   )
   public final void method516(int arg0, int arg1, int arg2) {
      try {
         ++field3664;
         if (~this.field3813 != ~arg0 || this.field3854 != arg1 || ~this.field3831 != ~arg2) {
            this.field3813 = arg0;
            this.field3831 = arg2;
            this.field3854 = arg1;
            this.method2250((byte)-47);
            this.method1384(0);
         }

      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3904[77] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(ILkfa;)V"
   )
   public abstract void method1402(int arg0, class428 arg1);

   @OriginalMember(
      owner = "client!fm",
      name = "JA",
      descriptor = "(IIIIII)I"
   )
   public final int method457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var7 = client.field1481;

      try {
         ++field3693;
         int var8 = 0;
         float var9 = (float)arg2 * this.field3774.field9156 + (float)arg0 * this.field3774.field9147 + (float)arg1 * this.field3774.field9132 + this.field3774.field9133;
         if (var9 < 1.0F) {
            var9 = 1.0F;
         }

         float var10 = (float)arg5 * this.field3774.field9156 + (float)arg3 * this.field3774.field9147 + (float)arg4 * this.field3774.field9132 + this.field3774.field9133;
         if (var10 < 1.0F) {
            var10 = 1.0F;
         }

         label83: {
            if (!((float)this.field3874 > var9) || !((float)this.field3874 > var10)) {
               if (!((float)this.field3834 < var9) || !(var10 > (float)this.field3834)) {
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
            int var11 = (int)(((float)arg2 * this.field3774.field9170 + (float)arg0 * this.field3774.field9130 + (float)arg1 * this.field3774.field9145 + this.field3774.field9171) * (float)this.field3807 / var9);
            int var12 = (int)(((float)arg5 * this.field3774.field9170 + (float)arg3 * this.field3774.field9130 + (float)arg4 * this.field3774.field9145 + this.field3774.field9171) * (float)this.field3807 / var10);
            if (!((float)var11 < this.field3837) || !((float)var12 < this.field3837)) {
               if (!(this.field3819 < (float)var11) || !(this.field3819 < (float)var12)) {
                  break label84;
               }

               var8 |= 2;
               if (!var7) {
                  break label84;
               }
            }

            var8 |= 1;
         }

         int var13 = (int)(((float)arg2 * this.field3774.field9123 + (float)arg0 * this.field3774.field9137 + (float)arg1 * this.field3774.field9164 + this.field3774.field9122) * (float)this.field3786 / var9);
         int var14 = (int)(((float)arg5 * this.field3774.field9123 + (float)arg3 * this.field3774.field9137 + (float)arg4 * this.field3774.field9164 + this.field3774.field9122) * (float)this.field3786 / var10);
         if ((float)var13 < this.field3812 && this.field3812 > (float)var14) {
            var8 |= 4;
            if (!var7) {
               return var8;
            }
         }

         if (this.field3783 < (float)var13 && this.field3783 < (float)var14) {
            var8 |= 8;
         }

         return var8;
      } catch (RuntimeException var16) {
         throw class93.method866(var16, field3904[149] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method473(Canvas arg0) {
      try {
         ++field3684;
         if (this.field3709 == arg0) {
            throw new RuntimeException();
         } else if (this.field3640.containsKey(arg0)) {
            this.method1401(50, this.field3640.get(arg0), arg0);
            this.field3640.remove(arg0);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[3] + (arg0 != null ? field3904[2] : field3904[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "XA",
      descriptor = "()I"
   )
   public final int method499() {
      try {
         ++field3705;
         return this.field3834;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3904[58] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(ZZLwk;II)V"
   )
   public abstract void method1409(boolean arg0, boolean arg1, class255 arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!fm",
      name = "k",
      descriptor = "(Z)V"
   )
   private final void method2225(boolean arg0) {
      try {
         ++field3642;
         if (!arg0) {
            this.field3838 = -104;
         }

         this.field3796 = false;
         this.method2259(1);
         if (class437.field5959 == this.field3806) {
            this.method2295(111);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[116] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(Lcfa;B)V"
   )
   public abstract void method1428(class187 arg0, byte arg1);

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;"
   )
   public final class423 method482(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      try {
         ++field3638;
         return new class106(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field3904[167] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3904[2] : field3904[1]) + ',' + (arg3 != null ? field3904[2] : field3904[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "DA",
      descriptor = "(IIII)V"
   )
   public final void method504(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field3807 = arg2;
         this.field3820 = arg0;
         this.field3786 = arg3;
         ++field3617;
         this.field3833 = arg1;
         this.method2225(true);
         this.method2239(1);
         this.method2215(-32);
         this.method2252((byte)77);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field3904[158] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "g",
      descriptor = "(I)V"
   )
   public void method458(int arg0) {
      try {
         ++field3644;
         if (this.field3840 != null) {
            this.field3840.method4339((byte)-94);
         }

         this.field3805 = arg0 & Integer.MAX_VALUE;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[99] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "<init>",
      descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Lww;II)V"
   )
   public class281(Canvas arg0, Object arg1, class102 arg2, class339 arg3, int arg4, int arg5) {
      boolean var7 = client.field1481;
      super(arg2);
      this.field3616 = new class37();
      this.field3773 = true;
      this.field3770 = new class620();
      this.field3774 = new class620();
      this.field3775 = new class620();
      this.field3776 = new class620();
      this.field3777 = new class620();
      this.field3778 = new class620();
      this.field3793 = 0;
      this.field3803 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
      this.field3787 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
      this.field3796 = false;
      this.field3791 = 16777215;
      this.field3797 = 128;
      this.field3801 = false;
      this.field3784 = new class393[10];
      this.field3795 = 1.0F;
      this.field3820 = 0;
      this.field3788 = false;
      this.field3814 = 1;
      this.field3826 = 1.0F;
      this.field3800 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
      this.field3798 = 0;
      this.field3786 = 512;
      this.field3799 = 3584.0F;
      this.field3804 = 1.0F;
      this.field3830 = true;
      this.field3818 = new float[16];
      this.field3813 = -1;
      this.field3806 = class214.field2727;
      this.field3831 = 0;
      this.field3792 = 3;
      this.field3817 = -1.0F;
      this.field3821 = 1.0F;
      this.field3836 = new float[]{0.0F, 0.0F, -1.0F, 0.0F};
      this.field3846 = true;
      this.field3809 = 0;
      this.field3834 = 3584;
      this.field3825 = 0;
      this.field3841 = class735.field10729;
      this.field3848 = false;
      this.field3794 = false;
      this.field3845 = false;
      this.field3860 = -1;
      this.field3856 = 0;
      this.field3852 = false;
      this.field3807 = 512;
      this.field3847 = 3584.0F;
      this.field3854 = -1;
      this.field3861 = true;
      this.field3849 = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
      this.field3827 = true;
      this.field3824 = this.field3849;
      this.field3862 = 1.0F;
      this.field3850 = 0;
      this.field3858 = new float[16];
      this.field3822 = false;
      this.field3857 = 8;
      this.field3869 = -1.0F;
      this.field3874 = 50;
      this.field3835 = false;
      this.field3833 = 0;
      this.field3868 = new float[16];
      this.field3844 = 0;
      this.field3872 = 0;
      this.field3838 = 0;
      this.field3877 = -1;
      this.field3866 = false;
      this.field3879 = 0;
      this.field3876 = 0;
      this.field3828 = -1;
      this.field3863 = true;
      this.field3802 = new Stream();
      this.field3892 = new class620();

      try {
         try {
            this.field3853 = arg4;
            this.field3619 = this.field3709 = arg0;
            this.field3760 = arg3;
            this.field3602 = this.field3751 = arg1;
            Dimension var8 = arg0.getSize();
            this.field3585 = this.field3675 = var8.width;
            this.field3661 = this.field3725 = var8.height;
            this.field3867 = arg5;
            class387.method3051(-18, true, false);
            if (super.field6667 == null) {
               this.field3719 = new NativeInterface(0, this.field3867);
               this.field3840 = null;
            } else {
               this.field3840 = new class580(this, super.field6667);
               this.field3719 = new NativeInterface(super.field6667.method912(3106), this.field3867);
               int var9 = 0;
               if (var7 || var9 < super.field6667.method912(3106)) {
                  do {
                     class668 var10 = super.field6667.method911(var9, -89);
                     if (var10 != null) {
                        this.field3719.initTextureMetrics(var9, var10.field9887, var10.field9891);
                     }

                     ++var9;
                  } while(var9 < super.field6667.method912(3106));

               }
            }
         } catch (Throwable var13) {
            var13.printStackTrace();
            this.method3649(false);
            throw new RuntimeException("");
         }
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field3904[173] + (arg0 != null ? field3904[2] : field3904[1]) + ',' + (arg1 != null ? field3904[2] : field3904[1]) + ',' + (arg2 != null ? field3904[2] : field3904[1]) + ',' + (arg3 != null ? field3904[2] : field3904[1]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "L",
      descriptor = "(I)Ltm;"
   )
   public final class620 method2226(int arg0) {
      try {
         if (arg0 != 2702) {
            return null;
         } else {
            ++field3692;
            return this.field3839[this.field3793];
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[73] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "d",
      descriptor = "()V"
   )
   public final void method505() {
      try {
         if (this.field3840 != null) {
            this.field3840.method4340((byte)-51);
         }

         ++field3650;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3904[89] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "r",
      descriptor = "(IIIIIII)I"
   )
   public final int method442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field1481;

      try {
         int var9;
         label58: {
            ++field3660;
            var9 = 0;
            float var10 = (float)arg2 * this.field3774.field9156 + (float)arg0 * this.field3774.field9147 + (float)arg1 * this.field3774.field9132 + this.field3774.field9133;
            float var11 = (float)arg5 * this.field3774.field9156 + (float)arg3 * this.field3774.field9147 + (float)arg4 * this.field3774.field9132 + this.field3774.field9133;
            if (var10 < (float)this.field3874 && (float)this.field3874 > var11) {
               var9 |= 16;
               if (!var8) {
                  break label58;
               }
            }

            if (var10 > (float)this.field3834 && var11 > (float)this.field3834) {
               var9 |= 32;
            }
         }

         label52: {
            int var12 = (int)(((float)arg2 * this.field3774.field9170 + (float)arg0 * this.field3774.field9130 + (float)arg1 * this.field3774.field9145 + this.field3774.field9171) * (float)this.field3807 / (float)arg6);
            int var13 = (int)(((float)arg5 * this.field3774.field9170 + (float)arg3 * this.field3774.field9130 + (float)arg4 * this.field3774.field9145 + this.field3774.field9171) * (float)this.field3807 / (float)arg6);
            if (this.field3837 > (float)var12 && this.field3837 > (float)var13) {
               var9 |= 1;
               if (!var8) {
                  break label52;
               }
            }

            if (this.field3819 < (float)var12 && this.field3819 < (float)var13) {
               var9 |= 2;
            }
         }

         int var14 = (int)(((float)arg2 * this.field3774.field9123 + (float)arg0 * this.field3774.field9137 + (float)arg1 * this.field3774.field9164 + this.field3774.field9122) * (float)this.field3786 / (float)arg6);
         int var15 = (int)(((float)arg5 * this.field3774.field9123 + (float)arg3 * this.field3774.field9137 + (float)arg4 * this.field3774.field9164 + this.field3774.field9122) * (float)this.field3786 / (float)arg6);
         if ((float)var14 < this.field3812 && this.field3812 > (float)var15) {
            var9 |= 4;
            if (!var8) {
               return var9;
            }
         }

         if (this.field3783 < (float)var14 && this.field3783 < (float)var15) {
            var9 |= 8;
         }

         return var9;
      } catch (RuntimeException var17) {
         throw class93.method866(var17, field3904[137] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "G",
      descriptor = "(I)Ltm;"
   )
   public final class620 method2227(int arg0) {
      try {
         if (arg0 < 72) {
            return null;
         } else {
            ++field3714;
            if (!this.field3788) {
               this.field3778.method4584(this.field3776, this.field3770);
               this.field3788 = true;
            }

            return this.field3778;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[96] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method470(Canvas arg0) {
      try {
         label45: {
            this.field3619 = null;
            ++field3696;
            this.field3602 = null;
            if (arg0 == null || this.field3709 == arg0) {
               this.field3619 = this.field3709;
               this.field3602 = this.field3751;
               if (!client.field1481) {
                  break label45;
               }
            }

            if (this.field3640.containsKey(arg0)) {
               this.field3602 = this.field3640.get(arg0);
               this.field3619 = arg0;
            }
         }

         if (this.field3619 != null && this.field3602 != null) {
            this.method1391(this.field3619, (byte)11, this.field3602);
            this.method2270(0);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[48] + (arg0 != null ? field3904[2] : field3904[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "q",
      descriptor = "(I)V"
   )
   private final void method2228(int arg0) {
      try {
         if (arg0 > 23) {
            if (class617.field9088 == this.field3806) {
               float var2 = this.method1381(21158);
               this.field3770.method4573(var2, 2, 0.0F, var2);
            }

            ++field3609;
            this.field3788 = false;
            this.method1383(false);
            if (this.field3808 != null) {
               this.field3808.method2736(true);
            }
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3904[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "o",
      descriptor = "(B)V"
   )
   public abstract void method1372(byte arg0);

   @OriginalMember(
      owner = "client!fm",
      name = "z",
      descriptor = "()Z"
   )
   public final boolean method408() {
      try {
         ++field3671;
         return this.field3784[3].method1460(false);
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3904[112] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "xa",
      descriptor = "(F)V"
   )
   public final void method428(float arg0) {
      try {
         ++field3670;
         if (this.field3821 != arg0) {
            this.field3821 = arg0;
            this.field3719.setAmbient(arg0);
            this.method1372((byte)116);
            this.method1422(false);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[94] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V"
   )
   public abstract void method1401(int arg0, Object arg1, Canvas arg2);

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method394(int arg0) {
      try {
         ++field3737;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[125] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method416(int[] arg0) {
      try {
         ++field3731;
         arg0[1] = this.field3661;
         arg0[0] = this.field3585;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[86] + (arg0 != null ? field3904[2] : field3904[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "f",
      descriptor = "(B)V"
   )
   public static final void method2229(byte arg0) {
      boolean var1 = client.field1481;

      try {
         ++field3601;
         class478 var2 = (class478)class696.field10201.method288(0);
         int var8;
         if (!var1 && var2 == null) {
            var8 = -118 % ((41 - arg0) / 38);
         } else {
            do {
               class268 var3 = var2.field6650;
               if (~var3.field3425 > ~class413.field5678) {
                  var2.method4924(-2970);
                  var3.method2136((byte)-124);
                  if (!var1) {
                     var2 = (class478)class696.field10201.method290(17958);
                     continue;
                  }
               }

               if (var3.field3385 <= class413.field5678) {
                  var3.method2140((byte)16);
                  if (var3.field3393 > 0) {
                     class411 var4 = (class411)class35.field493.method1818(-1, (long)(var3.field3393 + -1));
                     if (var4 != null) {
                        class81 var5 = var4.field5654;
                        if (~var5.field10467 <= -1 && var5.field10467 < class273.field3491 * 512 && ~var5.field10468 <= -1 && var5.field10468 < class211.field2689 * 512) {
                           var3.method2141(var5.field10468, var5.field10467, class413.field5678, class215.method1757(var5.field10467, false, var3.field10457, var5.field10468) - var3.field3395, (byte)-34);
                        }
                     }
                  }

                  if (var3.field3393 < 0) {
                     int var6 = -var3.field3393 - 1;
                     class783 var7;
                     if (~class16.field280 == ~var6) {
                        var7 = class204.field2593;
                        if (var1) {
                           var7 = class59.field771[var6];
                        }
                     } else {
                        var7 = class59.field771[var6];
                     }

                     if (var7 != null && ~var7.field10467 <= -1 && var7.field10467 < class273.field3491 * 512 && var7.field10468 >= 0 && ~(class211.field2689 * 512) < ~var7.field10468) {
                        var3.method2141(var7.field10468, var7.field10467, class413.field5678, class215.method1757(var7.field10467, false, var3.field10457, var7.field10468) + -var3.field3395, (byte)-113);
                     }
                  }

                  var3.method2133(class173.field2238, -50);
                  class606.method4491(var3, true);
               }

               var2 = (class478)class696.field10201.method290(17958);
            } while(var2 != null);

            var8 = -118 % ((41 - arg0) / 38);
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field3904[95] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V"
   )
   public final void method467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      try {
         ++field3653;
      } catch (RuntimeException var15) {
         throw class93.method866(var15, field3904[163] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "O",
      descriptor = "(I)Ltm;"
   )
   public final class620 method2230(int arg0) {
      try {
         if (arg0 != 9) {
            return null;
         } else {
            ++field3649;
            return this.field3770;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[156] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public final void method456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      boolean var10 = client.field1481;

      try {
         float var12;
         float var14;
         label101: {
            ++field3586;
            float var11 = (float)arg2 - (float)arg0;
            var12 = (float)arg3 - (float)arg1;
            if (var11 != 0.0F || var12 != 0.0F) {
               float var13 = (float)(1.0D / Math.sqrt((double)(var11 * var11 + var12 * var12)));
               var12 *= var13;
               var14 = var11 * var13;
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
            this.method2289((byte)-113);
            this.method2276(arg4, 74);
            this.method2288((byte)-10, class354.field4947, 0);
            this.method2211((byte)15, class354.field4947, 0);
            this.method2256(true, arg5);
            this.method2277(false);
            int var27 = arg8 % (arg6 + arg7);
            this.method1423(false, (byte)-35);
            var15 = (float)arg6 * var14;
            var16 = (float)arg6 * var12;
            var17 = 0.0F;
            var18 = 0.0F;
            var19 = var15;
            var20 = var16;
            if (~arg6 > ~var27) {
               var17 = (float)(arg6 - var27 + arg7) * var14;
               var18 = (float)(arg6 + arg7 + -var27) * var12;
               if (!var10) {
                  break label83;
               }
            }

            var20 = (float)(arg6 - var27) * var12;
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
                  if (~arg0 > ~arg2) {
                     float var28;
                     var10000 = (var28 = (float)arg2 - var21) == 0.0F ? 0 : (var28 < 0.0F ? -1 : 1);
                     if (var10) {
                        break label74;
                     }

                     if (var10000 < 0) {
                        break;
                     }

                     if (!((float)arg2 < var19 + var21)) {
                        break label97;
                     }

                     var19 = (float)arg2 - var21;
                     if (!var10) {
                        break label97;
                     }
                  }

                  float var29;
                  var10000 = (var29 = (float)arg2 - var21) == 0.0F ? 0 : (var29 < 0.0F ? -1 : 1);
               }

               if (var10000 > 0) {
                  break;
               }

               if (var19 + var21 < (float)arg2) {
                  var19 = (float)arg2 + -var21;
               }
            }

            label99: {
               if (arg3 <= arg1) {
                  if ((float)arg3 > var22) {
                     break;
                  }

                  if (!(var20 + var22 < (float)arg3)) {
                     break label99;
                  }

                  var20 = (float)arg3 - var22;
                  if (!var10) {
                     break label99;
                  }
               }

               if ((float)arg3 < var22) {
                  break;
               }

               if ((float)arg3 < var20 + var22) {
                  var20 = (float)arg3 - var22;
               }
            }

            if (!this.method2213(var20 + var22, (byte)32, 0.0F, var21, 0.0F, var19 + var21, var22)) {
               return;
            }

            this.method2278(true);
            var22 += var20 + var24;
            var21 += var19 + var23;
            var20 = var16;
            var19 = var15;
         } while(!var10);

         this.method1423(true, (byte)-35);
         this.method2211((byte)-128, class363.field5039, 0);
         this.method2288((byte)-10, class363.field5039, 0);
      } catch (RuntimeException var26) {
         throw class93.method866(var26, field3904[31] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "ZA",
      descriptor = "(IFFFFF)V"
   )
   public final void method418(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      try {
         ++field3741;
         boolean var7 = ~this.field3791 != ~arg0;
         if (var7 || this.field3869 != arg1 || this.field3817 != arg2) {
            this.field3869 = arg1;
            this.field3791 = arg0;
            this.field3817 = arg2;
            if (var7) {
               this.field3826 = (float)(this.field3791 & 65280) / 65280.0F;
               this.field3862 = (float)(this.field3791 & 16711680) / 1.671168E7F;
               this.field3795 = (float)(255 & this.field3791) / 255.0F;
               this.method1372((byte)101);
            }

            this.field3719.setSunColour(this.field3862, this.field3826, this.field3795, arg1, arg2);
            this.method1377((byte)-107);
         }

         if (this.field3800[0] != arg3 || this.field3800[1] != arg4 || this.field3800[2] != arg5) {
            this.field3800[1] = arg4;
            this.field3800[0] = arg3;
            this.field3800[2] = arg5;
            this.field3787[2] = -arg5;
            this.field3787[1] = -arg4;
            this.field3787[0] = -arg3;
            float var8 = (float)(1.0D / Math.sqrt((double)(arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field3803[1] = arg4 * var8;
            this.field3803[0] = arg3 * var8;
            this.field3803[2] = arg5 * var8;
            this.field3836[0] = -this.field3803[0];
            this.field3836[2] = -this.field3803[2];
            this.field3836[1] = -this.field3803[1];
            this.field3719.setSunDirection(this.field3803[0], this.field3803[1], this.field3803[2]);
            this.method1406(4);
            this.field3870 = (int)(arg5 * 256.0F / arg4);
            this.field3873 = (int)(arg3 * 256.0F / arg4);
         }

         this.method1422(false);
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field3904[75] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(Lvv;Lvv;B)V"
   )
   public final void method2231(class467 arg0, class467 arg1, byte arg2) {
      try {
         ++field3729;
         boolean var4 = false;
         if (this.field3875[this.field3793] != arg0) {
            this.field3875[this.field3793] = arg0;
            var4 = true;
            this.method1408((byte)-106);
         }

         if (this.field3842[this.field3793] != arg1) {
            this.field3842[this.field3793] = arg1;
            this.method1421(-8);
            var4 = true;
         }

         if (var4) {
            this.field3810 &= -30;
         }

         int var5 = 127 / ((-12 - arg2) / 48);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field3904[50] + (arg0 != null ? field3904[2] : field3904[1]) + ',' + (arg1 != null ? field3904[2] : field3904[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(I[F)[F"
   )
   public final float[] method2232(int arg0, float[] arg1) {
      try {
         ++field3761;
         arg1[arg0] = this.field3824[0];
         arg1[4] = this.field3824[1];
         arg1[12] = this.field3824[3];
         arg1[8] = this.field3824[2];
         arg1[13] = this.field3824[7];
         arg1[2] = this.field3824[8];
         arg1[9] = this.field3824[6];
         arg1[5] = this.field3824[5];
         arg1[1] = this.field3824[4];
         arg1[14] = this.field3824[11];
         arg1[10] = this.field3824[10];
         arg1[3] = this.field3824[12];
         arg1[6] = this.field3824[9];
         arg1[7] = this.field3824[13];
         arg1[15] = this.field3824[15];
         arg1[11] = this.field3824[14];
         return arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3904[113] + arg0 + ',' + (arg1 != null ? field3904[2] : field3904[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(ZII[[I)Ltt;"
   )
   public abstract class531 method1427(boolean arg0, int arg1, int arg2, int[][] arg3);

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(IIIIIILaa;II)V"
   )
   public final void method454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class87 arg6, int arg7, int arg8) {
      try {
         ++field3708;
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field3904[88] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field3904[2] : field3904[1]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "E",
      descriptor = "()I"
   )
   public final int method400() {
      try {
         ++field3656;
         return this.field3771 - -this.field3769 + this.field3772;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3904[10] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "f",
      descriptor = "(Z)V"
   )
   private final void method2233(boolean arg0) {
      boolean var2 = client.field1481;

      try {
         ++field3615;
         this.field3898 = this.method1398(arg0, (byte)98);
         this.field3898.method101(30842, 140, 28);
         int var3 = 0;
         class281 var10000;
         if (var2) {
            var10000 = this;
         } else if (~var3 <= -5) {
            var10000 = this;
            if (!var2) {
               this.field3884 = this.method1396(new class207[]{new class207(new class279[]{class279.field3558, class279.field3565, class279.field3565})}, -78);
               return;
            }
         } else {
            var10000 = this;
         }

         do {
            while(true) {
               Buffer var4 = var10000.field3898.method102((byte)-123, true);
               if (var4 != null) {
                  Stream var5 = this.method2235(true, var4);
                  if (!Stream.method2990()) {
                     var5.method2997(0.0F);
                     var5.method2997(0.0F);
                     var5.method2997(0.0F);
                     var5.method2997(0.0F);
                     var5.method2997(0.0F);
                     var5.method2997(0.0F);
                     var5.method2997(0.0F);
                     var5.method2997(0.0F);
                     var5.method2997(1.0F);
                     var5.method2997(0.0F);
                     var5.method2997(0.0F);
                     var5.method2997(1.0F);
                     var5.method2997(0.0F);
                     var5.method2997(1.0F);
                     var5.method2997(1.0F);
                     var5.method2997(1.0F);
                     var5.method2997(0.0F);
                     var5.method2997(1.0F);
                     var5.method2997(1.0F);
                     var5.method2997(1.0F);
                     var5.method2997(1.0F);
                     var5.method2997(1.0F);
                     var5.method2997(0.0F);
                     var5.method2997(0.0F);
                     var5.method2997(1.0F);
                     var5.method2997(0.0F);
                     var5.method2997(1.0F);
                     var5.method2997(0.0F);
                     var5.method2997(0.0F);
                     var5.method2997(0.0F);
                     var5.method2997(0.0F);
                     var5.method2997(0.0F);
                     var5.method2997(0.0F);
                     var5.method2997(0.0F);
                     var5.method2997(0.0F);
                     if (var2) {
                        var5.method2994(0.0F);
                        var5.method2994(0.0F);
                        var5.method2994(0.0F);
                        var5.method2994(0.0F);
                        var5.method2994(0.0F);
                        var5.method2994(0.0F);
                        var5.method2994(0.0F);
                        var5.method2994(0.0F);
                        var5.method2994(1.0F);
                        var5.method2994(0.0F);
                        var5.method2994(0.0F);
                        var5.method2994(1.0F);
                        var5.method2994(0.0F);
                        var5.method2994(1.0F);
                        var5.method2994(1.0F);
                        var5.method2994(1.0F);
                        var5.method2994(0.0F);
                        var5.method2994(1.0F);
                        var5.method2994(1.0F);
                        var5.method2994(1.0F);
                        var5.method2994(1.0F);
                        var5.method2994(1.0F);
                        var5.method2994(0.0F);
                        var5.method2994(0.0F);
                        var5.method2994(1.0F);
                        var5.method2994(0.0F);
                        var5.method2994(1.0F);
                        var5.method2994(0.0F);
                        var5.method2994(0.0F);
                        var5.method2994(0.0F);
                        var5.method2994(0.0F);
                        var5.method2994(0.0F);
                        var5.method2994(0.0F);
                        var5.method2994(0.0F);
                        var5.method2994(0.0F);
                     }
                  } else {
                     var5.method2994(0.0F);
                     var5.method2994(0.0F);
                     var5.method2994(0.0F);
                     var5.method2994(0.0F);
                     var5.method2994(0.0F);
                     var5.method2994(0.0F);
                     var5.method2994(0.0F);
                     var5.method2994(0.0F);
                     var5.method2994(1.0F);
                     var5.method2994(0.0F);
                     var5.method2994(0.0F);
                     var5.method2994(1.0F);
                     var5.method2994(0.0F);
                     var5.method2994(1.0F);
                     var5.method2994(1.0F);
                     var5.method2994(1.0F);
                     var5.method2994(0.0F);
                     var5.method2994(1.0F);
                     var5.method2994(1.0F);
                     var5.method2994(1.0F);
                     var5.method2994(1.0F);
                     var5.method2994(1.0F);
                     var5.method2994(0.0F);
                     var5.method2994(0.0F);
                     var5.method2994(1.0F);
                     var5.method2994(0.0F);
                     var5.method2994(1.0F);
                     var5.method2994(0.0F);
                     var5.method2994(0.0F);
                     var5.method2994(0.0F);
                     var5.method2994(0.0F);
                     var5.method2994(0.0F);
                     var5.method2994(0.0F);
                     var5.method2994(0.0F);
                     var5.method2994(0.0F);
                  }

                  var5.method2995();
                  if (this.field3898.method104(-19749)) {
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
                     this.field3884 = this.method1396(new class207[]{new class207(new class279[]{class279.field3558, class279.field3565, class279.field3565})}, -78);
                     return;
                  }
               } else {
                  var10000 = this;
               }
            }
         } while(var2);

         this.field3884 = this.method1396(new class207[]{new class207(new class279[]{class279.field3558, class279.field3565, class279.field3565})}, -78);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field3904[142] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V"
   )
   public final void method434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class87 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      try {
         ++field3730;
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field3904[131] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field3904[2] : field3904[1]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "H",
      descriptor = "(III[I)V"
   )
   public final void method452(int arg0, int arg1, int arg2, int[] arg3) {
      try {
         float var5;
         int var6;
         int var7;
         label25: {
            ++field3679;
            var5 = this.field3774.method4589((float)arg2, 51, (float)arg0, (float)arg1);
            if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
               var6 = this.field3833;
               var7 = this.field3820;
               if (!client.field1481) {
                  break label25;
               }
            }

            var7 = (int)((float)this.field3807 * this.field3774.method4590((float)arg2, (float)arg0, (byte)-120, (float)arg1) / var5);
            var6 = (int)((float)this.field3786 * this.field3774.method4571(-18, (float)arg1, (float)arg0, (float)arg2) / var5);
         }

         arg3[0] = (int)((float)var7 + -this.field3837);
         arg3[2] = (int)var5;
         arg3[1] = (int)((float)var6 + -this.field3812);
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field3904[128] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3904[2] : field3904[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(III[BLdja;I)Lrh;"
   )
   public abstract class722 method1382(int arg0, int arg1, int arg2, byte[] arg3, class45 arg4, int arg5);

   @OriginalMember(
      owner = "client!fm",
      name = "f",
      descriptor = "(II)V"
   )
   public final void method406(int arg0, int arg1) {
      try {
         if (~this.field3874 != ~arg0 || this.field3834 != arg1) {
            this.field3834 = arg1;
            this.field3874 = arg0;
            this.method2239(1);
            this.method2225(true);
            this.method2250((byte)91);
         }

         ++field3722;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3904[56] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(Lu;Z)Lpd;"
   )
   public final class648 method402(class65 arg0, boolean arg1) {
      boolean var3 = client.field1481;

      try {
         class648 var12;
         label102: {
            ++field3691;
            if (arg0.field819 != 0 && ~arg0.field820 != -1) {
               int[] var4;
               label106: {
                  var4 = new int[arg0.field820 * arg0.field819];
                  int var5 = 0;
                  int var6 = 0;
                  if (arg0.field815 == null) {
                     int var7 = 0;
                     if (var3 || var7 < arg0.field820) {
                        do {
                           int var8 = 0;
                           if (var3 || arg0.field819 > var8) {
                              do {
                                 int var9 = arg0.field813[arg0.field818[var5++] & 255];
                                 var4[var6++] = ~var9 != -1 ? class2.method15(var9, -16777216) : 0;
                                 ++var8;
                              } while(arg0.field819 > var8);
                           }

                           ++var7;
                        } while(var7 < arg0.field820);
                     }

                     if (!var3) {
                        break label106;
                     }
                  }

                  int var10 = 0;
                  if (var3 || ~arg0.field820 < ~var10) {
                     do {
                        int var11 = 0;
                        if (var3) {
                           var4[var6++] = class2.method15(arg0.field813[class109.method974(255, arg0.field818[var5])], arg0.field815[var5] << 24);
                           ++var5;
                           ++var11;
                        }

                        while(true) {
                           while(var11 < arg0.field819) {
                              var4[var6++] = class2.method15(arg0.field813[class109.method974(255, arg0.field818[var5])], arg0.field815[var5] << 24);
                              ++var5;
                              ++var11;
                           }

                           if (!var3) {
                              ++var10;
                              break;
                           }

                           ++var11;
                        }
                     } while(~arg0.field820 < ~var10);
                  }
               }

               var12 = this.method3638(arg0.field819, -86, var4, arg0.field820, arg0.field819, 0);
               if (!var3) {
                  break label102;
               }
            }

            var12 = this.method3638(1, -84, new int[1], 1, 1, 0);
         }

         var12.method2405(arg0.field816, arg0.field814, arg0.field817, arg0.field821);
         return var12;
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field3904[30] + (arg0 != null ? field3904[2] : field3904[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(ZIILqb;)V"
   )
   public abstract void method1413(boolean arg0, int arg1, int arg2, class68 arg3);

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;"
   )
   public abstract Object method1392(int arg0, Canvas arg1);

   @OriginalMember(
      owner = "client!fm",
      name = "s",
      descriptor = "()Z"
   )
   public final boolean method520() {
      try {
         ++field3739;
         return true;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3904[153] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method506(int arg0) {
      try {
         ++field3740;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "P",
      descriptor = "(I)V"
   )
   private final void method2234(int arg0) {
      try {
         if (class493.field6882 != this.field3806) {
            class314 var2 = this.field3806;
            this.field3806 = class493.field6882;
            if (!var2.method2493((byte)-91)) {
               this.method2219(false);
            }

            this.method2284(24);
            this.field3824 = this.field3858;
            this.method2295(99);
            this.field3810 &= -8;
         }

         ++field3607;
         if (arg0 < 32) {
            this.method461();
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3904[20] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(ZLjaclib/memory/Buffer;)Ljaclib/memory/Stream;"
   )
   public final Stream method2235(boolean arg0, Buffer arg1) {
      try {
         this.field3802.method3000(arg1);
         ++field3666;
         return !arg0 ? null : this.field3802;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3904[80] + arg0 + ',' + (arg1 != null ? field3904[2] : field3904[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(Lwk;ZIB)V"
   )
   public abstract void method1390(class255 arg0, boolean arg1, int arg2, byte arg3);

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(Lnh;I)V"
   )
   public final void method517(class554 arg0, int arg1) {
      try {
         this.field3790.method4107(true, this, arg1, arg0);
         ++field3720;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3904[76] + (arg0 != null ? field3904[2] : field3904[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "j",
      descriptor = "()Z"
   )
   public final boolean method433() {
      try {
         ++field3752;
         return true;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3904[14] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(IZZZ)V"
   )
   public final void method2236(int arg0, boolean arg1, boolean arg2, boolean arg3) {
      boolean var5 = client.field1481;

      try {
         if (~this.field3877 != ~arg0 || this.field3866 == !this.field3782) {
            class177 var6;
            int var7;
            byte var8;
            int var9;
            int var10;
            label78: {
               var6 = null;
               var7 = 0;
               var8 = 0;
               var9 = 0;
               var10 = !this.field3782 ? 0 : 3;
               if (arg0 < 0) {
                  this.method2282(false);
                  if (!var5) {
                     break label78;
                  }
               }

               class668 var11;
               label88: {
                  var6 = this.field3840.method4342(110, arg0);
                  var11 = super.field6667.method911(arg0, 106);
                  if (var11.field9905 != 0 || var11.field9909 != 0) {
                     int var12 = !var11.field9901 ? 128 : 64;
                     int var13 = var12 * 50;
                     class620 var14 = this.method2264((byte)84);
                     var14.method4577((float)(this.field3805 % var13 * var11.field9905) / (float)var13, 0.0F, (float)(this.field3805 % var13 * var11.field9909) / (float)var13, 0);
                     this.method2223(false, class152.field1892);
                     if (!var5) {
                        break label88;
                     }
                  }

                  this.method2282(false);
               }

               if (!this.field3782) {
                  var10 = var11.field9911;
                  var8 = var11.field9889;
                  var9 = var11.field9895;
               }

               var7 = var11.field9904;
            }

            label51: {
               this.method2261(arg3, var10, var9, 4, var8, arg1);
               if (this.field3808 != null) {
                  this.field3808.method1461(var6, 127, var7);
                  if (!var5) {
                     break label51;
                  }
               }

               this.method2265(var6, (byte)73);
               this.method2240(-4, var7);
            }

            this.field3866 = this.field3782;
            this.field3877 = arg0;
         }

         if (!arg2) {
            this.field3861 = true;
         }

         ++field3706;
         this.field3810 &= -8;
      } catch (RuntimeException var16) {
         throw class93.method866(var16, field3904[111] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "v",
      descriptor = "(B)V"
   )
   public final void method2237(byte arg0) {
      try {
         if (~this.field3810 != -3) {
            this.method2212(-75);
            this.method2244(false, false);
            this.method2271((byte)117, false);
            this.method2214((byte)109, false);
            this.method2287(false, 96);
            this.method2236(-2, false, true, false);
            this.field3810 = 2;
         }

         if (arg0 != -105) {
            this.method1400((byte)113);
         }

         ++field3750;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[66] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "i",
      descriptor = "(II)V"
   )
   public final void method2238(int arg0, int arg1) {
      try {
         ++field3717;
         if (this.field3793 != arg1) {
            this.field3793 = arg1;
            this.method1369((byte)1);
         }

         if (arg0 != 9) {
            this.method1400((byte)122);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3904[57] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "Z",
      descriptor = "(I)V"
   )
   private final void method2239(int arg0) {
      try {
         this.field3835 = false;
         if (arg0 == 1) {
            ++field3765;
            this.method2284(24);
            if (class493.field6882 == this.field3806) {
               this.method2295(arg0 + 109);
            }
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[69] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "r",
      descriptor = "()Z"
   )
   public final boolean method515() {
      try {
         ++field3589;
         return false;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3904[19] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "v",
      descriptor = "()Lkia;"
   )
   public final class93 method484() {
      try {
         ++field3623;
         return this.field3774;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3904[70] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(IIZLdja;Lwn;)Lcb;"
   )
   public abstract class177 method1393(int arg0, int arg1, boolean arg2, class45 arg3, class576 arg4);

   @OriginalMember(
      owner = "client!fm",
      name = "g",
      descriptor = "(II)V"
   )
   public final void method2240(int arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         if (arg0 != -4) {
            this.method456(-95, -1, -42, 46, 44, -37, -58, 93, -125);
         }

         label52: {
            if (~arg1 == -2) {
               this.method2231(class318.field4380, class318.field4380, (byte)82);
               if (!var3) {
                  break label52;
               }
            }

            if (arg1 != 0) {
               if (arg1 != 2) {
                  if (~arg1 == -4) {
                     this.method2231(class242.field3052, class231.field2873, (byte)79);
                     if (!var3) {
                        break label52;
                     }
                  }

                  if (~arg1 != -5) {
                     break label52;
                  }

                  this.method2231(class371.field5192, class371.field5192, (byte)59);
                  if (!var3) {
                     break label52;
                  }
               }

               this.method2231(class749.field10941, class318.field4380, (byte)72);
               if (!var3) {
                  break label52;
               }
            }

            this.method2231(class231.field2873, class231.field2873, (byte)-96);
         }

         ++field3588;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3904[54] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "l",
      descriptor = "(B)Ltm;"
   )
   public final class620 method2241(byte arg0) {
      try {
         ++field3732;
         if (arg0 >= -47) {
            this.field3843 = -34;
         }

         return this.field3776;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[83] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(Lkia;)V"
   )
   public final void method397(class93 arg0) {
      try {
         ++field3606;
         this.field3774 = (class620)arg0;
         this.field3776.method874(this.field3774);
         this.field3776.method4582(-1);
         this.field3777.method4576(this.field3776, true);
         this.field3775.method4576(this.field3774, true);
         if (this.field3806.method2493((byte)-91)) {
            this.method2219(false);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[34] + (arg0 != null ? field3904[2] : field3904[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "m",
      descriptor = "(I)V"
   )
   public abstract void method1415(int arg0);

   @OriginalMember(
      owner = "client!fm",
      name = "q",
      descriptor = "(B)V"
   )
   private final void method2242(byte arg0) {
      try {
         if (arg0 == -39) {
            ++field3673;
            this.field3801 = false;
            if (class617.field9088 == this.field3806) {
               this.method2251(99);
               this.method2295(114);
            }
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[59] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method2243(int arg0) {
      boolean var2 = client.field1481;

      try {
         this.field3842 = new class467[this.field3829];
         this.field3865 = new class421[this.field3829];
         this.field3823 = new class95[this.field3829];
         this.field3875 = new class467[this.field3829];
         this.field3839 = new class620[this.field3829];
         ++field3698;
         int var3 = 0;
         if (var2) {
            this.field3842[var3] = class231.field2873;
            this.field3875[var3] = class231.field2873;
            this.field3823[var3] = class581.field8588;
            this.field3839[var3] = new class620();
            ++var3;
         }

         while(true) {
            while(this.field3829 > var3) {
               this.field3842[var3] = class231.field2873;
               this.field3875[var3] = class231.field2873;
               this.field3823[var3] = class581.field8588;
               this.field3839[var3] = new class620();
               ++var3;
            }

            this.field3864 = new class243[this.field3780 + -2];
            this.field3878 = this.method1393(1, 1, true, class606.field8967, class576.field8541);
            this.method483(new class152(262144));
            this.field3901 = this.method1396(new class207[]{new class207(new class279[]{class279.field3558, class279.field3565})}, -105);
            this.field3889 = this.method1396(new class207[]{new class207(new class279[]{class279.field3558, class279.field3563})}, -68);
            this.field3897 = this.method1396(new class207[]{new class207(class279.field3558), new class207(class279.field3563), new class207(class279.field3565), new class207(class279.field3562)}, -118);
            this.field3893 = this.method1396(new class207[]{new class207(class279.field3558), new class207(class279.field3563), new class207(class279.field3565)}, -70);
            this.field3885 = new class351(this, 0, 0, false, false);
            if (!var2) {
               if (arg0 <= 50) {
                  return;
               }

               this.field3890 = new class351(this, 0, 0, true, true);
               this.field3887 = new class351(this, 0, 0, false, false);
               this.field3891 = new class351(this, 0, 0, true, true);
               this.field3900 = new class351(this, 0, 0, false, false);
               this.field3894 = new class351(this, 0, 0, true, true);
               this.field3899 = new class351(this, 0, 0, false, false);
               this.field3883 = new class351(this, 0, 0, true, true);
               this.field3886 = new class351(this, 0, 0, false, false);
               this.field3896 = new class351(this, 0, 0, true, true);
               this.field3790 = new class543(this);
               this.field3895 = this.method1410(92, true);
               this.method2268(-9727);
               this.field3651 = new class712(this);
               this.field3784[1] = this.method1370(2, 1);
               this.field3784[2] = this.method1370(2, 2);
               this.field3784[4] = this.method1370(2, 4);
               this.field3784[5] = this.method1370(2, 5);
               this.field3784[6] = this.method1370(2, 6);
               this.field3784[7] = this.method1370(2, 7);
               this.field3784[3] = this.method1370(2, 3);
               this.field3784[8] = this.method1370(2, 8);
               this.field3784[9] = this.method1370(2, 9);
               if (!this.field3784[2].method1460(false)) {
                  this.field3784[2] = this.method1370(2, 0);
               }

               if (!this.field3784[4].method1460(false)) {
                  this.field3784[4] = this.field3784[2];
               }

               if (!this.field3784[8].method1460(false)) {
                  this.field3784[8] = this.field3784[4];
               }

               if (!this.field3784[9].method1460(false)) {
                  this.field3784[9] = this.field3784[8];
               }

               this.method1424(0);
               this.method443();
               this.method518();
               return;
            }

            ++var3;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3904[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method2244(boolean arg0, boolean arg1) {
      try {
         if (arg1) {
            this.method434(-87, 125, -127, -29, 63, 91, (class87)null, 85, 117, -64, 53, 13);
         }

         if (!this.field3851 != !arg0) {
            this.field3851 = arg0;
            this.method1384(0);
            this.field3810 &= -32;
         }

         ++field3764;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3904[92] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "D",
      descriptor = "(I)I"
   )
   public final int method2245(int arg0) {
      try {
         if (arg0 != 0) {
            this.method429(-128);
         }

         ++field3754;
         return this.field3798;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[49] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "Y",
      descriptor = "(I)I"
   )
   public final int method2246(int arg0) {
      try {
         if (arg0 != 8) {
            return 68;
         } else {
            ++field3762;
            return this.field3828;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[28] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "H",
      descriptor = "(I)V"
   )
   public final void method2247(int arg0) {
      try {
         if (this.field3810 != 8) {
            this.method2234(62);
            this.method2244(true, false);
            this.method2214((byte)109, true);
            this.method2287(true, 99);
            this.method2256(true, 1);
            this.field3810 = 8;
         }

         ++field3647;
         if (arg0 < 72) {
            this.method412(116, 45, 1, -78);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[52] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "k",
      descriptor = "(B)V"
   )
   public static void method2248(byte arg0) {
      try {
         field3683 = null;
         if (arg0 >= -5) {
            method2217(-47, 112, -121, -14, -85, 101, -97, 91, (byte)-9, -25);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3904[115] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(IIIIIF)Lue;"
   )
   public final class243 method491(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      try {
         ++field3604;
         return new class183(arg0, arg1, arg2, arg3, arg4, arg5);
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field3904[98] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "T",
      descriptor = "(I)V"
   )
   private final void method2249(int arg0) {
      try {
         if (class437.field5959 != this.field3806) {
            class314 var2 = this.field3806;
            this.field3806 = class437.field5959;
            if (!var2.method2493((byte)-91)) {
               this.method2219(false);
            }

            this.method2259(arg0 ^ -119);
            this.field3824 = this.field3818;
            this.method2295(105);
            this.field3810 &= -8;
         }

         if (arg0 == 12) {
            ++field3734;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3904[25] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "i",
      descriptor = "(I)V"
   )
   public final void method493(int arg0) {
      try {
         ++field3668;
         if (arg0 >= 128 && arg0 <= 1024) {
            if (this.field3840 != null) {
               this.field3840.method4340((byte)-51);
            }

            this.field3797 = arg0;
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[42] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "r",
      descriptor = "(B)V"
   )
   private final void method2250(byte arg0) {
      try {
         ++field3632;
         int var2 = -76 % ((arg0 - 1) / 39);
         if (this.field3808 != null) {
            this.field3808.method2738(0);
         }

         this.method1418((byte)-126);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3904[63] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "aa",
      descriptor = "(IIIIII)V"
   )
   public final void method513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field3636;
         this.method2289((byte)-122);
         this.method2276(arg4, 93);
         this.method2288((byte)-10, class354.field4947, 0);
         this.method2211((byte)41, class354.field4947, 0);
         this.method2256(true, arg5);
         this.field3770.method4594(1.0F, (float)arg3, (float)arg2, (byte)-93);
         this.field3770.method868(arg0, arg1, 0);
         this.method2218(0);
         this.method1423(false, (byte)-35);
         this.method2291(true);
         this.method1423(true, (byte)-35);
         this.method2211((byte)-125, class363.field5039, 0);
         this.method2288((byte)-10, class363.field5039, 0);
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field3904[44] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V"
   )
   public abstract void method1391(Canvas arg0, byte arg1, Object arg2);

   @OriginalMember(
      owner = "client!fm",
      name = "y",
      descriptor = "(I)V"
   )
   private final void method2251(int arg0) {
      try {
         if (arg0 > 83) {
            ++field3724;
            if (!this.field3801) {
               float[] var2 = this.field3868;
               this.field3801 = true;
               if (~this.field3585 != -1 && this.field3661 != 0) {
                  var2[1] = 0.0F;
                  var2[14] = 0.5F;
                  var2[4] = 0.0F;
                  var2[7] = 0.0F;
                  var2[6] = 0.0F;
                  var2[12] = -1.0F;
                  var2[0] = 2.0F / (float)this.field3585;
                  var2[3] = 0.0F;
                  var2[5] = -2.0F / (float)this.field3661;
                  var2[9] = 0.0F;
                  var2[15] = 1.0F;
                  var2[11] = 0.0F;
                  var2[2] = 0.0F;
                  var2[10] = 0.5F;
                  var2[13] = 1.0F;
                  var2[8] = 0.0F;
               } else {
                  var2[4] = 0.0F;
                  var2[11] = 0.0F;
                  var2[3] = 0.0F;
                  var2[10] = 1.0F;
                  var2[12] = 0.0F;
                  var2[6] = 0.0F;
                  var2[13] = 0.0F;
                  var2[14] = 0.0F;
                  var2[2] = 0.0F;
                  var2[5] = 1.0F;
                  var2[15] = 1.0F;
                  var2[8] = 0.0F;
                  var2[9] = 0.0F;
                  var2[7] = 0.0F;
                  var2[1] = 0.0F;
                  var2[0] = 1.0F;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3904[147] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(II[I[I)Laa;"
   )
   public final class87 method479(int arg0, int arg1, int[] arg2, int[] arg3) {
      try {
         ++field3625;
         return class437.method3374(this, 14635, arg1, arg0, arg3, arg2);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field3904[109] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3904[2] : field3904[1]) + ',' + (arg3 != null ? field3904[2] : field3904[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "u",
      descriptor = "(B)V"
   )
   private final void method2252(byte arg0) {
      try {
         this.field3837 = (float)(-this.field3820 + this.field3872);
         this.field3819 = (float)(-this.field3820 + this.field3850);
         this.field3783 = (float)(-this.field3833 + this.field3809);
         this.field3812 = (float)(-this.field3833 + this.field3844);
         if (arg0 > 74) {
            ++field3663;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[102] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "la",
      descriptor = "()V"
   )
   public final void method443() {
      try {
         this.field3844 = 0;
         this.field3850 = this.field3585;
         this.field3872 = 0;
         ++field3758;
         this.field3809 = this.field3661;
         if (this.field3903) {
            this.field3903 = false;
            this.method1416((byte)126);
         }

         this.method2252((byte)127);
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3904[130] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "e",
      descriptor = "(I)Lza;"
   )
   public final class735 method469(int arg0) {
      try {
         ++field3718;
         class152 var2 = new class152(arg0);
         this.field3616.method279(false, var2);
         return var2;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3904[120] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(IZ)Lfi;"
   )
   public abstract class265 method1410(int arg0, boolean arg1);

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "([BIZIILdja;)Lcb;"
   )
   public final class177 method2253(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4, class45 arg5) {
      try {
         ++field3614;
         int var7 = -87 / ((27 - arg1) / 34);
         return this.method1385(arg5, 0, arg2, 0, arg0, arg3, false, arg4);
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field3904[121] + (arg0 != null ? field3904[2] : field3904[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field3904[2] : field3904[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "e",
      descriptor = "(B)V"
   )
   public abstract void method1369(byte arg0);

   @OriginalMember(
      owner = "client!fm",
      name = "Q",
      descriptor = "(IIIIII[BII)V"
   )
   public final void method404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
      try {
         ++field3744;
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field3904[171] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field3904[2] : field3904[1]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "pa",
      descriptor = "()V"
   )
   public final void method512() {
      try {
         ++field3735;
         this.field3782 = false;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3904[12] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "l",
      descriptor = "()Z"
   )
   public final boolean method455() {
      try {
         ++field3672;
         return true;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3904[155] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "C",
      descriptor = "(Z)V"
   )
   public final void method437(boolean arg0) {
      try {
         this.field3863 = arg0;
         ++field3736;
         this.method1400((byte)36);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[164] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "h",
      descriptor = "(Z)V"
   )
   public abstract void method1426(boolean arg0);

   @OriginalMember(
      owner = "client!fm",
      name = "b",
      descriptor = "(II)I"
   )
   public final int method444(int arg0, int arg1) {
      try {
         ++field3628;
         return arg1 | arg0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3904[157] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "N",
      descriptor = "(I)Ltm;"
   )
   public final class620 method2254(int arg0) {
      try {
         ++field3748;
         if (arg0 != -2) {
            this.method1401(71, (Object)null, (Canvas)null);
         }

         return this.field3777;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[29] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "h",
      descriptor = "(B)V"
   )
   public final void method2255(byte arg0) {
      try {
         ++field3756;
         if (this.field3810 != 16) {
            this.method2249(12);
            this.method2244(true, false);
            this.method2214((byte)109, true);
            this.method2287(true, arg0 + 14);
            this.method2256(true, 1);
            this.field3810 = 16;
         }

         if (arg0 != 76) {
            this.field3769 = -11;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[108] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "S",
      descriptor = "(I)V"
   )
   public void method1424(int arg0) {
      try {
         this.method2224(-1);
         if (arg0 != 0) {
            this.method469(-79);
         }

         ++field3655;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[53] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "i",
      descriptor = "(B)V"
   )
   public abstract void method1397(byte arg0);

   @OriginalMember(
      owner = "client!fm",
      name = "X",
      descriptor = "(I)V"
   )
   public final void method468(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fm",
      name = "b",
      descriptor = "(ZI)V"
   )
   public final void method2256(boolean arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field3596;
         if (this.field3814 != arg1) {
            boolean var4;
            class774 var5;
            boolean var6;
            label52: {
               if (arg1 != 1) {
                  if (arg1 != 2) {
                     if (~arg1 != -129) {
                        var4 = false;
                        var5 = class183.field2324;
                        var6 = false;
                        if (!var3) {
                           break label52;
                        }
                     }

                     var4 = true;
                     var5 = class562.field8269;
                     var6 = true;
                     if (!var3) {
                        break label52;
                     }
                  }

                  var5 = class584.field8622;
                  var4 = false;
                  var6 = true;
                  if (!var3) {
                     break label52;
                  }
               }

               var4 = true;
               var6 = true;
               var5 = class735.field10729;
            }

            if (this.field3827 == !var4) {
               this.field3827 = var4;
               this.method1412(68);
            }

            if (this.field3861 != var6) {
               this.field3861 = var6;
               this.method1368((byte)80);
            }

            if (this.field3841 != var5) {
               this.field3841 = var5;
               this.method1394(-76);
            }

            this.field3810 &= -29;
            this.field3814 = arg1;
         }

         if (!arg0) {
            this.method2279(true, (byte)-100);
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field3904[79] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "w",
      descriptor = "(B)V"
   )
   public abstract void method1416(byte arg0);

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(Lkc;)V"
   )
   public final void method490(class72 arg0) {
      try {
         ++field3685;
         this.field3779 = (class198)arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[47] + (arg0 != null ? field3904[2] : field3904[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "k",
      descriptor = "()Z"
   )
   public final boolean method465() {
      try {
         ++field3608;
         return true;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3904[27] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(Ldja;IZI[BIZI)Lcb;"
   )
   public abstract class177 method1385(class45 arg0, int arg1, boolean arg2, int arg3, byte[] arg4, int arg5, boolean arg6, int arg7);

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(IIILdja;IIZ[F)Lcb;"
   )
   public abstract class177 method1371(int arg0, int arg1, int arg2, class45 arg3, int arg4, int arg5, boolean arg6, float[] arg7);

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(Lqb;II)V"
   )
   private final void method2257(class68 arg0, int arg1, int arg2) {
      try {
         if (arg1 >= -49) {
            this.field3840 = null;
         }

         ++field3621;
         this.method1375(this.field3898, true, 0);
         this.method1402(1, this.field3884);
         this.method1413(true, arg2, 0, arg0);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3904[23] + (arg0 != null ? field3904[2] : field3904[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method501(boolean arg0) {
      try {
         ++field3643;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[39] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "HA",
      descriptor = "(IIII[I)V"
   )
   public final void method509(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
      try {
         ++field3613;
         float var6 = this.field3774.method4589((float)arg2, 57, (float)arg0, (float)arg1);
         if (!((float)this.field3874 > var6) && !((float)this.field3834 < var6)) {
            int var7 = (int)((float)this.field3807 * this.field3774.method4590((float)arg2, (float)arg0, (byte)-127, (float)arg1) / (float)arg3);
            int var8 = (int)((float)this.field3786 * this.field3774.method4571(17, (float)arg1, (float)arg0, (float)arg2) / (float)arg3);
            arg4[0] = (int)((float)var7 + -this.field3837);
            arg4[2] = (int)var6;
            arg4[1] = (int)((float)var8 + -this.field3812);
         } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field3904[146] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field3904[2] : field3904[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method429(int arg0) {
      try {
         ++field3639;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[126] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "n",
      descriptor = "(I)[F"
   )
   public final float[] method2258(int arg0) {
      try {
         if (arg0 >= -120) {
            this.method2241((byte)107);
         }

         ++field3583;
         return this.field3849;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[133] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "t",
      descriptor = "()Z"
   )
   public final boolean method422() {
      try {
         ++field3674;
         return true;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3904[135] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "P",
      descriptor = "(IIIII)V"
   )
   public final void method463(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field3694;
         this.method446(arg0, arg1, arg0, arg1 - -arg2, arg3, arg4);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field3904[37] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "v",
      descriptor = "(I)V"
   )
   private final void method2259(int arg0) {
      try {
         ++field3687;
         int var2 = 101 / ((arg0 - -66) / 45);
         if (!this.field3796) {
            label30: {
               float[] var3 = this.field3818;
               float var4 = (float)this.field3874;
               float var5 = (float)this.field3834;
               float var6 = (float)(-this.field3833) * this.field3804 / (float)this.field3786;
               float var7 = (float)(-this.field3820) * this.field3804 / (float)this.field3807;
               float var8 = (float)(this.field3585 - this.field3820) * this.field3804 / (float)this.field3807;
               float var9 = (float)(-this.field3833 + this.field3661) * this.field3804 / (float)this.field3786;
               if (var7 == var8 || var6 == var9) {
                  var3[1] = 0.0F;
                  var3[14] = 0.0F;
                  var3[12] = 0.0F;
                  var3[11] = 0.0F;
                  var3[9] = 0.0F;
                  var3[3] = 0.0F;
                  var3[5] = 1.0F;
                  var3[8] = 0.0F;
                  var3[10] = 1.0F;
                  var3[2] = 0.0F;
                  var3[4] = 0.0F;
                  var3[7] = 0.0F;
                  var3[0] = 1.0F;
                  var3[6] = 0.0F;
                  var3[15] = 1.0F;
                  var3[13] = 0.0F;
                  if (!client.field1481) {
                     break label30;
                  }
               }

               var3[1] = 0.0F;
               var3[2] = 0.0F;
               var3[15] = 1.0F;
               var3[0] = 2.0F / (-var7 + var8);
               var3[6] = 0.0F;
               var3[4] = 0.0F;
               var3[13] = (var6 + var9) / (var9 - var6);
               var3[7] = 0.0F;
               var3[14] = var4 / (var4 - var5);
               var3[12] = (var7 + var8) / (var7 - var8);
               var3[10] = 1.0F / (-var5 + var4);
               var3[11] = 0.0F;
               var3[8] = 0.0F;
               var3[3] = 0.0F;
               var3[5] = 2.0F / (var9 - var6);
               var3[9] = 0.0F;
            }

            this.method2260(false);
            this.field3796 = true;
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field3904[175] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(Lkv;[Lu;Z)Lda;"
   )
   public final class447 method430(class19 arg0, class65[] arg1, boolean arg2) {
      try {
         ++field3597;
         return new class463(this, arg0, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3904[7] + (arg0 != null ? field3904[2] : field3904[1]) + ',' + (arg1 != null ? field3904[2] : field3904[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "m",
      descriptor = "(Z)V"
   )
   private final void method2260(boolean arg0) {
      try {
         this.field3847 = (float)this.field3834;
         ++field3618;
         if (arg0) {
            this.method1409(false, false, (class255)null, -108, 109);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[177] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "U",
      descriptor = "(I)V"
   )
   public abstract void method1429(int arg0);

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(IZBII[II)Lcb;"
   )
   public abstract class177 method1404(int arg0, boolean arg1, byte arg2, int arg3, int arg4, int[] arg5, int arg6);

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(ZIIIIZ)V"
   )
   private final void method2261(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         boolean var9 = arg5 & this.method408();
         ++field3682;
         if (!var9 && (arg1 == 4 || arg1 == 8 || ~arg1 == -10)) {
            arg1 = 2;
            arg2 = arg1 == 4 ? arg4 & 1 : 1;
            arg4 = 0;
         }

         if (arg3 != 4) {
            this.method1408((byte)-69);
         }

         if (~arg1 != -1 && arg0) {
            arg1 |= Integer.MIN_VALUE;
         }

         if (~this.field3876 != ~arg1) {
            if (this.field3876 != 0) {
               this.field3784[Integer.MAX_VALUE & this.field3876].method1457((byte)-59);
            }

            label50: {
               if (~arg1 == -1) {
                  this.field3808 = null;
                  if (!client.field1481) {
                     break label50;
                  }
               }

               this.field3808 = this.field3784[arg1 & Integer.MAX_VALUE];
               this.field3808.method1459(arg0, (byte)32);
               this.field3808.method1464(29404, arg0);
               this.field3808.method1462(arg4, 7313, arg2);
            }

            this.field3856 = arg4;
            this.field3825 = arg2;
            this.field3876 = arg1;
         } else if (~this.field3876 != -1) {
            this.field3784[this.field3876 & Integer.MAX_VALUE].method1464(29404, arg0);
            if (~this.field3856 != ~arg4 || ~this.field3825 != ~arg2) {
               this.field3784[this.field3876 & Integer.MAX_VALUE].method1462(arg4, 7313, arg2);
               this.field3856 = arg4;
               this.field3825 = arg2;
            }

         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field3904[21] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "i",
      descriptor = "()I"
   )
   public final int method519() {
      try {
         ++field3595;
         return this.field3874;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3904[84] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(Ldja;I[FZIB)Lcb;"
   )
   public final class177 method2262(class45 arg0, int arg1, float[] arg2, boolean arg3, int arg4, byte arg5) {
      try {
         if (arg5 != -52) {
            return null;
         } else {
            ++field3690;
            return this.method1371(0, arg1, -32, arg0, 0, arg4, arg3, arg2);
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field3904[134] + (arg0 != null ? field3904[2] : field3904[1]) + ',' + arg1 + ',' + (arg2 != null ? field3904[2] : field3904[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method411(Canvas arg0, int arg1, int arg2) {
      try {
         ++field3626;
         if (this.field3709 == arg0) {
            throw new RuntimeException();
         } else if (!this.field3640.containsKey(arg0)) {
            if (!arg0.isShowing()) {
               throw new RuntimeException();
            } else {
               try {
                  Class var4 = Class.forName(field3904[169]);
                  Method var5 = var4.getMethod(field3904[170], Boolean.TYPE);
                  var5.invoke(arg0, Boolean.TRUE);
               } catch (Exception var8) {
               }

               Object var6 = this.method1392(31256, arg0);
               if (var6 == null) {
                  throw new RuntimeException();
               } else {
                  this.field3640.put(arg0, var6);
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field3904[168] + (arg0 != null ? field3904[2] : field3904[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "r",
      descriptor = "(I)V"
   )
   public abstract void method1421(int arg0);

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(Lza;)V"
   )
   public final void method483(class735 arg0) {
      try {
         ++field3610;
         this.field3659 = ((class152)arg0).field1894;
         this.field3707 = this.field3659.method2987(32768, false);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[36] + (arg0 != null ? field3904[2] : field3904[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "([Lkm;I)Lkfa;"
   )
   public abstract class428 method1396(class207[] arg0, int arg1);

   @OriginalMember(
      owner = "client!fm",
      name = "c",
      descriptor = "(ZI)V"
   )
   public final void method2263(boolean arg0, int arg1) {
      try {
         if (arg1 == 0) {
            if (!this.field3852 != !arg0) {
               this.field3852 = arg0;
               this.method1403((byte)-29);
            }

            ++field3700;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3904[117] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "p",
      descriptor = "(B)Ltm;"
   )
   public final class620 method2264(byte arg0) {
      try {
         ++field3662;
         if (arg0 <= 38) {
            this.field3783 = 0.9919799F;
         }

         return this.field3839[this.field3793];
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[136] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "j",
      descriptor = "(B)V"
   )
   public abstract void method1368(byte arg0);

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(Lvba;B)V"
   )
   public final void method2265(class421 arg0, byte arg1) {
      try {
         if (this.field3865[this.field3793] != arg0) {
            label26: {
               this.field3865[this.field3793] = arg0;
               if (arg0 == null) {
                  this.method1411((byte)93);
                  if (!client.field1481) {
                     break label26;
                  }
               }

               arg0.method2873((byte)2);
            }

            this.field3810 &= -2;
         }

         ++field3681;
         int var3 = -121 / ((27 - arg1) / 34);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3904[26] + (arg0 != null ? field3904[2] : field3904[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "u",
      descriptor = "(I)V"
   )
   public abstract void method1394(int arg0);

   @OriginalMember(
      owner = "client!fm",
      name = "c",
      descriptor = "(II)I"
   )
   public final int method495(int arg0, int arg1) {
      try {
         ++field3611;
         return arg0 & arg1 ^ arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3904[151] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;B)V"
   )
   public abstract void method1380(Canvas arg0, Object arg1, byte arg2);

   @OriginalMember(
      owner = "client!fm",
      name = "d",
      descriptor = "(Z)V"
   )
   public static final void method2266(boolean arg0) {
      try {
         ++field3667;
         int var1 = 0;
         if (~class757.field11093.field11016.method1496(-18033) == -2) {
            int var2 = var1 | 1;
            int var3 = var2 | 16;
            int var4 = var3 | 32;
            int var5 = var4 | 2;
            var1 = var5 | 4;
         }

         if (~class757.field11093.field10973.method5420(-18033) == -1) {
            var1 |= 64;
         }

         class271.method2153(var1, 63);
         class438.field5967.method932(var1, (byte)69);
         class166.field2126.method5568(false, var1);
         if (arg0) {
            class270.field3460.method5195(-1, var1);
            class49.field688.method3863((byte)99, var1);
            class167.method1440(var1, (byte)-68);
            class746.method5402(var1, -16593);
            class203.method1681(var1, (byte)-69);
            class141.method1159(var1, (byte)112);
            class568.method4266(4);
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field3904[139] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "b",
      descriptor = "(IZ)V"
   )
   public final void method2267(int arg0, boolean arg1) {
      try {
         ++field3593;
         if (!arg1 != !this.field3846) {
            this.field3846 = arg1;
            this.method1384(0);
         }

         if (arg0 != 1) {
            this.method423(114, -39, 48, 2, 22, 78);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3904[123] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(Lbc;ZI)V"
   )
   public abstract void method1375(class11 arg0, boolean arg1, int arg2);

   @OriginalMember(
      owner = "client!fm",
      name = "o",
      descriptor = "(Z)V"
   )
   public abstract void method1383(boolean arg0);

   @OriginalMember(
      owner = "client!fm",
      name = "b",
      descriptor = "(B)V"
   )
   public abstract void method1403(byte arg0);

   @OriginalMember(
      owner = "client!fm",
      name = "m",
      descriptor = "()Z"
   )
   public final boolean method448() {
      try {
         ++field3658;
         return this.field3815;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3904[144] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "x",
      descriptor = "(I)V"
   )
   public final void method2268(int arg0) {
      boolean var2 = client.field1481;

      try {
         ++field3605;
         Hashtable var3 = new Hashtable();
         if (this.field3640 != null && !this.field3640.isEmpty()) {
            Enumeration var4 = this.field3640.keys();
            if (var2 || var4.hasMoreElements()) {
               do {
                  Canvas var5 = (Canvas)var4.nextElement();
                  var3.put(var5, this.method1392(31256, var5));
               } while(var4.hasMoreElements());
            }
         }

         if (arg0 != -9727) {
            this.field3898 = null;
         }

         this.field3640 = var3;
         this.method2233(false);
         this.method2285(2);
         this.method2290(0);
         this.field3790.method4104(this, 786336);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field3904[72] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "T",
      descriptor = "(IIII)V"
   )
   public final void method412(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field3678;
         boolean var5 = false;
         if (~this.field3872 > ~arg0) {
            var5 = true;
            this.field3872 = arg0;
         }

         if (this.field3850 > arg2) {
            this.field3850 = arg2;
            var5 = true;
         }

         if (~arg1 < ~this.field3844) {
            var5 = true;
            this.field3844 = arg1;
         }

         if (~arg3 > ~this.field3809) {
            this.field3809 = arg3;
            var5 = true;
         }

         if (var5) {
            if (!this.field3903) {
               this.field3903 = true;
               this.method1416((byte)126);
            }

            this.method1429(0);
            this.method2252((byte)100);
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field3904[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(Lha;ZLoca;)V"
   )
   public static final void method2269(class479 arg0, boolean arg1, class642 arg2) {
      try {
         if (!arg1) {
            method2266(true);
         }

         ++field3633;
         boolean var3 = class166.field2126.method5571(arg2.field9524, false, !arg2.field9632 ? null : class204.field2593.field11443, arg0, arg2.field9634, -16777216 | arg2.field9625, arg2.field9485, arg2.field9488) == null;
         if (var3) {
            class8.field104.method279(false, new class203(arg2.field9524, arg2.field9634, arg2.field9485, -16777216 | arg2.field9625, arg2.field9488, arg2.field9632));
            class49.method372(arg2, 0);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3904[38] + (arg0 != null ? field3904[2] : field3904[1]) + ',' + arg1 + ',' + (arg2 != null ? field3904[2] : field3904[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "I",
      descriptor = "(I)V"
   )
   private final void method2270(int arg0) {
      try {
         label15: {
            ++field3695;
            if (this.field3619 != null) {
               Dimension var2 = this.field3619.getSize();
               this.field3725 = var2.height;
               this.field3675 = var2.width;
               if (!client.field1481) {
                  break label15;
               }
            }

            this.field3675 = this.field3725 = 1;
         }

         this.field3585 = this.field3675;
         this.field3661 = this.field3725;
         this.method2242((byte)-39);
         this.method2239(1);
         this.method2225(true);
         this.method1415(arg0);
         this.method2252((byte)100);
         this.method2215(-32);
         this.method443();
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3904[24] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "KA",
      descriptor = "(IIII)V"
   )
   public final void method460(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field3600;
         if (~arg0 >= -1 && ~(this.field3585 - 1) >= ~arg2 && arg1 <= 0 && arg3 >= this.field3661 + -1) {
            this.method443();
         } else {
            this.field3844 = ~arg1 <= -1 ? arg1 : 0;
            this.field3872 = arg0 < 0 ? 0 : arg0;
            this.field3850 = this.field3585 >= arg2 ? arg2 : 0;
            this.field3809 = this.field3585 >= arg3 ? arg3 : 0;
            if (!this.field3903) {
               this.field3903 = true;
               this.method1416((byte)127);
            }

            this.method1429(0);
            this.method2252((byte)105);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field3904[119] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "n",
      descriptor = "(B)V"
   )
   public abstract void method1411(byte arg0);

   @OriginalMember(
      owner = "client!fm",
      name = "b",
      descriptor = "(BZ)V"
   )
   public final void method2271(byte arg0, boolean arg1) {
      try {
         ++field3703;
         if (!this.field3845 == arg1) {
            this.field3845 = arg1;
            this.method1403((byte)-29);
            this.field3810 &= -8;
         }

         if (arg0 < 21) {
            this.field3640 = null;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3904[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "A",
      descriptor = "()Z"
   )
   public final boolean method500() {
      try {
         ++field3646;
         return true;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3904[35] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "d",
      descriptor = "(B)V"
   )
   private final void method2272(byte arg0) {
      try {
         if (arg0 <= -70) {
            ++field3665;
            this.field3858[10] = this.field3832;
            this.field3858[14] = this.field3781;
            this.field3799 = (this.field3858[14] - (float)this.field3834) / this.field3858[10];
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "([IIIIIZ)Lpd;"
   )
   public final class648 method398(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         ++field3627;
         return new class406(this, arg3, arg4, arg0, arg1, arg2);
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field3904[160] + (arg0 != null ? field3904[2] : field3904[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "p",
      descriptor = "()Lkia;"
   )
   public final class93 method396() {
      try {
         ++field3742;
         return this.field3892;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3904[132] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method2273(int arg0, byte arg1) {
      try {
         ++field3580;
         this.method2276(arg1 << 8 | arg1 << 16 | arg1 << 24 | arg1, 108);
         if (arg0 != 0) {
            this.field3769 = 105;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3904[154] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "k",
      descriptor = "(II)V"
   )
   public abstract void method1414(int arg0, int arg1);

   @OriginalMember(
      owner = "client!fm",
      name = "n",
      descriptor = "(Z)V"
   )
   public void method1395(boolean arg0) {
      try {
         ++field3622;
         this.field3843 = this.field3785;
         if (arg0) {
            this.field3785 = 0;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[140] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "l",
      descriptor = "(Z)V"
   )
   public abstract void method1422(boolean arg0);

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(ILtm;)V"
   )
   public final void method2274(int arg0, class620 arg1) {
      try {
         this.field3770.method874(arg1);
         if (arg0 == 256) {
            ++field3728;
            this.field3773 = false;
            this.method2228(69);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3904[148] + arg0 + ',' + (arg1 != null ? field3904[2] : field3904[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "o",
      descriptor = "(I)V"
   )
   private final void method2275(int arg0) {
      try {
         ++field3733;
         this.method1425(true);
         if (this.field3808 != null) {
            this.field3808.method2317((byte)-109);
         }

         if (arg0 != 2) {
            this.method1423(false, (byte)51);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[62] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "ra",
      descriptor = "(IIII)V"
   )
   public final void method447(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field3782 = true;
         this.field3798 = arg3;
         this.field3811 = arg0;
         this.field3860 = arg1;
         this.field3828 = arg2;
         ++field3592;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field3904[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "h",
      descriptor = "(II)V"
   )
   public final void method2276(int arg0, int arg1) {
      try {
         if (arg1 < 67) {
            this.method505();
         }

         if (~this.field3859 != ~arg0) {
            this.field3859 = arg0;
            this.method1397((byte)-121);
         }

         ++field3727;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3904[166] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "p",
      descriptor = "(Z)V"
   )
   public final void method2277(boolean arg0) {
      try {
         if (!arg0) {
            this.field3770.method856();
            ++field3648;
            this.field3773 = true;
            this.method2228(96);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[87] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "g",
      descriptor = "(Z)V"
   )
   private final void method2278(boolean arg0) {
      try {
         ++field3603;
         this.method1375(this.field3882, arg0, 0);
         this.method1402(1, this.field3881);
         this.method1413(arg0, 1, 0, class772.field11246);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[68] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "B",
      descriptor = "(I)V"
   )
   public abstract void method1406(int arg0);

   @OriginalMember(
      owner = "client!fm",
      name = "o",
      descriptor = "()Lkia;"
   )
   public final class93 method480() {
      try {
         ++field3637;
         return new class620();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3904[104] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "c",
      descriptor = "(ZB)V"
   )
   public final void method2279(boolean arg0, byte arg1) {
      try {
         if (arg0 == !this.field3830) {
            this.field3830 = arg0;
            this.method1376(arg1 ^ -80);
         }

         ++field3629;
         if (arg1 != -80) {
            this.field3896 = null;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3904[65] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(BIZ)Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   public final NativeHeapBuffer method2280(byte arg0, int arg1, boolean arg2) {
      try {
         ++field3716;
         if (arg0 <= 28) {
            this.field3828 = -66;
         }

         return this.field3659.method2987(arg1, arg2);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3904[174] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "j",
      descriptor = "(II)Lfi;"
   )
   public final class265 method2281(int arg0, int arg1) {
      try {
         ++field3582;
         if (this.field3895.method917(97) < arg0 * 2) {
            this.field3895.method1192(-102, arg0);
         }

         return arg1 > -24 ? null : this.field3895;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3904[22] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "q",
      descriptor = "(Z)V"
   )
   public final void method2282(boolean arg0) {
      try {
         if (this.field3823[this.field3793] != class581.field8588) {
            this.field3823[this.field3793] = class581.field8588;
            this.field3839[this.field3793].method856();
            this.method2275(2);
         }

         ++field3712;
         if (arg0) {
            this.method1368((byte)-98);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[162] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(BIZI[I)Lcb;"
   )
   public final class177 method2283(byte arg0, int arg1, boolean arg2, int arg3, int[] arg4) {
      try {
         if (arg0 != -53) {
            return null;
         } else {
            ++field3767;
            return this.method1404(0, arg2, (byte)74, arg1, 0, arg4, arg3);
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field3904[114] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field3904[2] : field3904[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "k",
      descriptor = "(I)V"
   )
   private final void method2284(int arg0) {
      try {
         if (arg0 == 24) {
            if (!this.field3835) {
               label23: {
                  float[] var2 = this.field3858;
                  float var3 = (float)(-this.field3820 * this.field3874) / (float)this.field3807;
                  float var4 = (float)((-this.field3820 + this.field3585) * this.field3874) / (float)this.field3807;
                  float var5 = (float)(this.field3874 * this.field3833) / (float)this.field3786;
                  float var6 = (float)((-this.field3661 + this.field3833) * this.field3874) / (float)this.field3786;
                  if (var3 != var4 && var5 != var6) {
                     float var7 = (float)this.field3874 * 2.0F;
                     var2[15] = 0.0F;
                     var2[3] = 0.0F;
                     var2[8] = (var3 + var4) / (var4 - var3);
                     var2[9] = (var5 + var6) / (-var6 + var5);
                     var2[14] = this.field3781 = (float)(this.field3874 * this.field3834) / (float)(this.field3874 - this.field3834);
                     var2[13] = 0.0F;
                     var2[11] = -1.0F;
                     var2[5] = var7 / (-var6 + var5);
                     var2[7] = 0.0F;
                     var2[0] = var7 / (var4 - var3);
                     var2[10] = this.field3832 = (float)this.field3834 / (float)(-this.field3834 + this.field3874);
                     var2[12] = 0.0F;
                     var2[6] = 0.0F;
                     var2[4] = 0.0F;
                     var2[2] = 0.0F;
                     var2[1] = 0.0F;
                     if (!client.field1481) {
                        break label23;
                     }
                  }

                  var2[7] = 0.0F;
                  var2[3] = 0.0F;
                  var2[12] = 0.0F;
                  var2[11] = 0.0F;
                  var2[5] = 1.0F;
                  var2[6] = 0.0F;
                  var2[2] = 0.0F;
                  var2[8] = 0.0F;
                  var2[13] = 0.0F;
                  var2[9] = 0.0F;
                  var2[15] = 1.0F;
                  var2[10] = 1.0F;
                  var2[0] = 1.0F;
                  var2[1] = 0.0F;
                  var2[14] = 0.0F;
                  var2[4] = 0.0F;
               }

               this.method2272((byte)-76);
               this.field3835 = true;
            }

            ++field3755;
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field3904[101] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "J",
      descriptor = "(I)V"
   )
   private final void method2285(int arg0) {
      try {
         this.field3882 = this.method1398(true, (byte)98);
         if (arg0 != 2) {
            this.field3900 = null;
         }

         ++field3590;
         this.field3882.method101(30842, 24, 12);
         this.field3881 = this.method1396(new class207[]{new class207(class279.field3558)}, arg0 + -71);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[165] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "C",
      descriptor = "(I)Ltt;"
   )
   public final class531 method2286(int arg0) {
      try {
         ++field3594;
         if (arg0 > -61) {
            return null;
         } else {
            return this.field3779 != null ? this.field3779.method1645(8192) : null;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(IIILqb;IILfi;)V"
   )
   public abstract void method1419(int arg0, int arg1, int arg2, class68 arg3, int arg4, int arg5, class265 arg6);

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method2287(boolean arg0, int arg1) {
      try {
         if (arg1 <= 89) {
            this.field3879 = -47;
         }

         ++field3689;
         if (!this.field3848 != !arg0) {
            this.field3848 = arg0;
            this.method1400((byte)73);
            this.field3810 &= -32;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3904[93] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "b",
      descriptor = "(BLwk;I)V"
   )
   public final void method2288(byte arg0, class255 arg1, int arg2) {
      try {
         ++field3630;
         this.method1409(false, false, arg1, arg2, -61);
         if (arg0 != -10) {
            this.field3786 = -9;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3904[82] + arg0 + ',' + (arg1 != null ? field3904[2] : field3904[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "g",
      descriptor = "(B)V"
   )
   public abstract void method1418(byte arg0);

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(IIZ)Lpd;"
   )
   public final class648 method435(int arg0, int arg1, boolean arg2) {
      try {
         ++field3747;
         return new class406(this, arg0, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3904[40] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(ZB)Lbc;"
   )
   public abstract class11 method1398(boolean arg0, byte arg1);

   @OriginalMember(
      owner = "client!fm",
      name = "M",
      descriptor = "()I"
   )
   public final int method497() {
      try {
         ++field3581;
         return this.field3902;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3904[159] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "t",
      descriptor = "(B)V"
   )
   private final void method2289(byte arg0) {
      try {
         if (arg0 > -110) {
            this.method487();
         }

         if (~this.field3810 != -2) {
            this.method2212(-117);
            this.method2244(false, false);
            this.method2271((byte)31, false);
            this.method2214((byte)109, false);
            this.method2287(false, 107);
            this.method2236(-2, false, true, false);
            this.method2240(-4, 1);
            this.method2265(this.field3878, (byte)112);
            this.field3810 = 1;
         }

         ++field3704;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[141] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "l",
      descriptor = "(I)V"
   )
   public abstract void method1384(int arg0);

   @OriginalMember(
      owner = "client!fm",
      name = "z",
      descriptor = "(I)V"
   )
   public abstract void method1412(int arg0);

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(Lnh;)V"
   )
   public final void method508(class554 arg0) {
      try {
         this.field3790.method4107(true, this, -1, arg0);
         ++field3721;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[74] + (arg0 != null ? field3904[2] : field3904[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(Lls;IIII)Lka;"
   )
   public final class232 method494(class167 arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field3631;
         return new class351(this, arg0, arg1, arg3, arg4, arg2);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field3904[143] + (arg0 != null ? field3904[2] : field3904[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "w",
      descriptor = "(I)V"
   )
   public abstract void method1376(int arg0);

   @OriginalMember(
      owner = "client!fm",
      name = "V",
      descriptor = "(I)F"
   )
   public abstract float method1381(int arg0);

   @OriginalMember(
      owner = "client!fm",
      name = "ab",
      descriptor = "(I)V"
   )
   private final void method2290(int arg0) {
      boolean var2 = client.field1481;

      try {
         ++field3620;
         this.field3880 = this.method1398(false, (byte)98);
         this.field3880.method101(30842, 3096, 12);
         int var3 = arg0;
         class281 var10000;
         if (var2) {
            var10000 = this;
         } else if (~arg0 <= -5) {
            var10000 = this;
            if (!var2) {
               this.field3888 = this.method1396(new class207[]{new class207(class279.field3558)}, arg0 ^ -120);
               return;
            }
         } else {
            var10000 = this;
         }

         do {
            while(true) {
               Buffer var4 = var10000.field3880.method102((byte)-70, true);
               if (var4 != null) {
                  Stream var5 = this.method2235(true, var4);
                  var5.method2994(0.0F);
                  var5.method2994(0.0F);
                  var5.method2994(0.0F);
                  int var6 = 0;
                  double var7;
                  float var9;
                  float var10;
                  if (var2) {
                     var7 = (double)(var6 * 2) * 3.141592653589793D / 256.0D;
                     var9 = (float)Math.cos(var7);
                     var10 = (float)Math.sin(var7);
                     if (!Stream.method2990()) {
                        var5.method2997(var10);
                        var5.method2997(var9);
                        var5.method2997(0.0F);
                        if (var2) {
                           var5.method2994(var10);
                           var5.method2994(var9);
                           var5.method2994(0.0F);
                           ++var6;
                        } else {
                           ++var6;
                        }
                     } else {
                        var5.method2994(var10);
                        var5.method2994(var9);
                        var5.method2994(0.0F);
                        ++var6;
                     }
                  }

                  while(var6 <= 256) {
                     var7 = (double)(var6 * 2) * 3.141592653589793D / 256.0D;
                     var9 = (float)Math.cos(var7);
                     var10 = (float)Math.sin(var7);
                     if (!Stream.method2990()) {
                        var5.method2997(var10);
                        var5.method2997(var9);
                        var5.method2997(0.0F);
                        if (var2) {
                           var5.method2994(var10);
                           var5.method2994(var9);
                           var5.method2994(0.0F);
                           ++var6;
                        } else {
                           ++var6;
                        }
                     } else {
                        var5.method2994(var10);
                        var5.method2994(var9);
                        var5.method2994(0.0F);
                        ++var6;
                     }
                  }

                  var5.method2995();
                  if (this.field3880.method104(arg0 + -19749)) {
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
                     this.field3888 = this.method1396(new class207[]{new class207(class279.field3558)}, arg0 ^ -120);
                     return;
                  }
               } else {
                  var10000 = this;
               }
            }
         } while(var2);

         this.field3888 = this.method1396(new class207[]{new class207(class279.field3558)}, arg0 ^ -120);
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field3904[85] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(Lwn;ILdja;)Z"
   )
   public abstract boolean method1407(class576 arg0, int arg1, class45 arg2);

   @OriginalMember(
      owner = "client!fm",
      name = "b",
      descriptor = "()I"
   )
   public final int method487() {
      try {
         ++field3715;
         return this.field3780 + -2;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3904[55] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public final void method446(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         float var8;
         float var10;
         label28: {
            ++field3598;
            float var7 = (float)(-arg0) + (float)arg2;
            var8 = (float)(-arg1) + (float)arg3;
            if (var7 != 0.0F || var8 != 0.0F) {
               float var9 = (float)(1.0D / Math.sqrt((double)(var7 * var7 + var8 * var8)));
               var10 = var7 * var9;
               var8 *= var9;
               if (!client.field1481) {
                  break label28;
               }
            }

            var10 = 1.0F;
         }

         if (this.method2213((float)arg3 + var8, (byte)32, 0.0F, (float)arg0, 0.0F, (float)arg2 + var10, (float)arg1)) {
            this.method2289((byte)-119);
            this.method2276(arg4, 80);
            this.method2288((byte)-10, class354.field4947, 0);
            this.method2211((byte)-126, class354.field4947, 0);
            this.method2256(true, arg5);
            this.method2277(false);
            this.method1423(false, (byte)-35);
            this.method2278(true);
            this.method1423(true, (byte)-35);
            this.method2211((byte)-127, class363.field5039, 0);
            this.method2288((byte)-10, class363.field5039, 0);
         }
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field3904[129] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "i",
      descriptor = "(Z)V"
   )
   public final void method2291(boolean arg0) {
      try {
         this.method2257(class437.field5958, -59, 2);
         if (!arg0) {
            this.field3877 = -1;
         }

         ++field3587;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "b",
      descriptor = "(IIIIZ)Lpd;"
   )
   public final class648 method414(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         ++field3676;
         class406 var6 = new class406(this, arg2, arg3, arg4);
         var6.method2411(0, 0, arg2, arg3, arg0, arg1);
         return var6;
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field3904[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "A",
      descriptor = "(I)I"
   )
   public final int method2292(int arg0) {
      try {
         ++field3766;
         return arg0 != 0 ? -36 : this.field3860;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[91] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "EA",
      descriptor = "(IIII)V"
   )
   public final void method439(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field3759;
         if (!this.field3782) {
            throw new RuntimeException("");
         } else {
            this.field3811 = arg0;
            this.field3828 = arg2;
            this.field3860 = arg1;
            this.field3798 = arg3;
            if (this.field3866) {
               this.field3784[3].method3101((byte)-86);
               this.field3784[3].method2738(0);
            }
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field3904[90] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "M",
      descriptor = "(I)V"
   )
   public final void method2293(int arg0) {
      try {
         ++field3710;
         if (arg0 == 0) {
            this.method2215(arg0 ^ -32);
            this.method2295(93);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[43] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "R",
      descriptor = "(I)I"
   )
   public final int method2294(int arg0) {
      try {
         if (arg0 != -15521) {
            this.field3806 = null;
         }

         ++field3753;
         return this.field3793;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[124] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "W",
      descriptor = "(I)V"
   )
   private final void method2295(int arg0) {
      try {
         if (arg0 < 92) {
            this.field3773 = false;
         }

         ++field3680;
         this.method1399(8912);
         if (this.field3808 != null) {
            this.field3808.method2735((byte)117);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3904[41] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2296(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2297(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 30;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 64;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
