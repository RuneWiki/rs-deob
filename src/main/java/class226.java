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

@OriginalClass("client!daa")
public abstract class class226 extends class17 {
   @OriginalMember(
      owner = "client!daa",
      name = "cc",
      descriptor = "Lsb;"
   )
   private class261 field3306;
   @OriginalMember(
      owner = "client!daa",
      name = "Cg",
      descriptor = "Z"
   )
   public boolean field3394;
   @OriginalMember(
      owner = "client!daa",
      name = "O",
      descriptor = "Ltu;"
   )
   public class522 field3392;
   @OriginalMember(
      owner = "client!daa",
      name = "Je",
      descriptor = "Ltu;"
   )
   public class522 field3396;
   @OriginalMember(
      owner = "client!daa",
      name = "xg",
      descriptor = "Ltu;"
   )
   public class522 field3397;
   @OriginalMember(
      owner = "client!daa",
      name = "Nc",
      descriptor = "Ltu;"
   )
   public class522 field3398;
   @OriginalMember(
      owner = "client!daa",
      name = "sg",
      descriptor = "Ltu;"
   )
   private class522 field3399;
   @OriginalMember(
      owner = "client!daa",
      name = "ve",
      descriptor = "Ltu;"
   )
   private class522 field3400;
   @OriginalMember(
      owner = "client!daa",
      name = "gf",
      descriptor = "I"
   )
   public int field3408;
   @OriginalMember(
      owner = "client!daa",
      name = "we",
      descriptor = "[F"
   )
   public float[] field3435;
   @OriginalMember(
      owner = "client!daa",
      name = "C",
      descriptor = "Z"
   )
   private boolean field3431;
   @OriginalMember(
      owner = "client!daa",
      name = "nf",
      descriptor = "I"
   )
   public int field3434;
   @OriginalMember(
      owner = "client!daa",
      name = "ee",
      descriptor = "I"
   )
   private int field3430;
   @OriginalMember(
      owner = "client!daa",
      name = "zg",
      descriptor = "[F"
   )
   private float[] field3401;
   @OriginalMember(
      owner = "client!daa",
      name = "ag",
      descriptor = "F"
   )
   public float field3417;
   @OriginalMember(
      owner = "client!daa",
      name = "sc",
      descriptor = "Z"
   )
   private boolean field3419;
   @OriginalMember(
      owner = "client!daa",
      name = "bb",
      descriptor = "Z"
   )
   public boolean field3418;
   @OriginalMember(
      owner = "client!daa",
      name = "tb",
      descriptor = "I"
   )
   private int field3402;
   @OriginalMember(
      owner = "client!daa",
      name = "mc",
      descriptor = "I"
   )
   public int field3412;
   @OriginalMember(
      owner = "client!daa",
      name = "df",
      descriptor = "I"
   )
   public int field3439;
   @OriginalMember(
      owner = "client!daa",
      name = "Sb",
      descriptor = "I"
   )
   private int field3428;
   @OriginalMember(
      owner = "client!daa",
      name = "Yd",
      descriptor = "I"
   )
   public int field3452;
   @OriginalMember(
      owner = "client!daa",
      name = "se",
      descriptor = "Z"
   )
   public boolean field3448;
   @OriginalMember(
      owner = "client!daa",
      name = "Af",
      descriptor = "Z"
   )
   private boolean field3423;
   @OriginalMember(
      owner = "client!daa",
      name = "Kf",
      descriptor = "I"
   )
   public int field3441;
   @OriginalMember(
      owner = "client!daa",
      name = "fe",
      descriptor = "I"
   )
   public int field3449;
   @OriginalMember(
      owner = "client!daa",
      name = "Pb",
      descriptor = "I"
   )
   public int field3425;
   @OriginalMember(
      owner = "client!daa",
      name = "Sc",
      descriptor = "I"
   )
   private int field3422;
   @OriginalMember(
      owner = "client!daa",
      name = "zb",
      descriptor = "I"
   )
   public int field3451;
   @OriginalMember(
      owner = "client!daa",
      name = "ke",
      descriptor = "F"
   )
   public float field3462;
   @OriginalMember(
      owner = "client!daa",
      name = "y",
      descriptor = "[F"
   )
   private float[] field3421;
   @OriginalMember(
      owner = "client!daa",
      name = "Cf",
      descriptor = "[F"
   )
   private float[] field3468;
   @OriginalMember(
      owner = "client!daa",
      name = "gg",
      descriptor = "F"
   )
   public float field3472;
   @OriginalMember(
      owner = "client!daa",
      name = "xd",
      descriptor = "F"
   )
   public float field3429;
   @OriginalMember(
      owner = "client!daa",
      name = "N",
      descriptor = "I"
   )
   public int field3473;
   @OriginalMember(
      owner = "client!daa",
      name = "lc",
      descriptor = "Z"
   )
   public boolean field3456;
   @OriginalMember(
      owner = "client!daa",
      name = "Ue",
      descriptor = "[Lsp;"
   )
   private class575[] field3477;
   @OriginalMember(
      owner = "client!daa",
      name = "Ed",
      descriptor = "I"
   )
   public int field3427;
   @OriginalMember(
      owner = "client!daa",
      name = "ne",
      descriptor = "Z"
   )
   public boolean field3450;
   @OriginalMember(
      owner = "client!daa",
      name = "cd",
      descriptor = "F"
   )
   private float field3460;
   @OriginalMember(
      owner = "client!daa",
      name = "pb",
      descriptor = "I"
   )
   public int field3447;
   @OriginalMember(
      owner = "client!daa",
      name = "Xe",
      descriptor = "Z"
   )
   private boolean field3474;
   @OriginalMember(
      owner = "client!daa",
      name = "L",
      descriptor = "I"
   )
   public int field3478;
   @OriginalMember(
      owner = "client!daa",
      name = "yg",
      descriptor = "I"
   )
   private int field3463;
   @OriginalMember(
      owner = "client!daa",
      name = "gc",
      descriptor = "I"
   )
   public int field3479;
   @OriginalMember(
      owner = "client!daa",
      name = "ic",
      descriptor = "F"
   )
   public float field3433;
   @OriginalMember(
      owner = "client!daa",
      name = "Yf",
      descriptor = "Z"
   )
   public boolean field3461;
   @OriginalMember(
      owner = "client!daa",
      name = "hb",
      descriptor = "I"
   )
   public int field3481;
   @OriginalMember(
      owner = "client!daa",
      name = "Zf",
      descriptor = "Z"
   )
   private boolean field3405;
   @OriginalMember(
      owner = "client!daa",
      name = "yc",
      descriptor = "Z"
   )
   public boolean field3432;
   @OriginalMember(
      owner = "client!daa",
      name = "kc",
      descriptor = "[F"
   )
   public float[] field3490;
   @OriginalMember(
      owner = "client!daa",
      name = "he",
      descriptor = "F"
   )
   public float field3438;
   @OriginalMember(
      owner = "client!daa",
      name = "V",
      descriptor = "I"
   )
   private int field3486;
   @OriginalMember(
      owner = "client!daa",
      name = "ed",
      descriptor = "I"
   )
   private int field3471;
   @OriginalMember(
      owner = "client!daa",
      name = "hd",
      descriptor = "Z"
   )
   public boolean field3454;
   @OriginalMember(
      owner = "client!daa",
      name = "ye",
      descriptor = "Z"
   )
   private boolean field3413;
   @OriginalMember(
      owner = "client!daa",
      name = "pd",
      descriptor = "I"
   )
   private int field3482;
   @OriginalMember(
      owner = "client!daa",
      name = "zf",
      descriptor = "F"
   )
   public float field3411;
   @OriginalMember(
      owner = "client!daa",
      name = "Nd",
      descriptor = "[F"
   )
   private float[] field3483;
   @OriginalMember(
      owner = "client!daa",
      name = "yb",
      descriptor = "I"
   )
   public int field3494;
   @OriginalMember(
      owner = "client!daa",
      name = "Qb",
      descriptor = "I"
   )
   public int field3446;
   @OriginalMember(
      owner = "client!daa",
      name = "qb",
      descriptor = "Lae;"
   )
   public class506 field3495;
   @OriginalMember(
      owner = "client!daa",
      name = "wg",
      descriptor = "F"
   )
   public float field3492;
   @OriginalMember(
      owner = "client!daa",
      name = "Se",
      descriptor = "[F"
   )
   private float[] field3480;
   @OriginalMember(
      owner = "client!daa",
      name = "td",
      descriptor = "[F"
   )
   private float[] field3407;
   @OriginalMember(
      owner = "client!daa",
      name = "eg",
      descriptor = "Lbba;"
   )
   public class801 field3443;
   @OriginalMember(
      owner = "client!daa",
      name = "Zd",
      descriptor = "I"
   )
   public int field3466;
   @OriginalMember(
      owner = "client!daa",
      name = "Q",
      descriptor = "Z"
   )
   public boolean field3458;
   @OriginalMember(
      owner = "client!daa",
      name = "Fc",
      descriptor = "I"
   )
   private int field3497;
   @OriginalMember(
      owner = "client!daa",
      name = "Hb",
      descriptor = "[F"
   )
   public float[] field3498;
   @OriginalMember(
      owner = "client!daa",
      name = "uf",
      descriptor = "I"
   )
   public int field3464;
   @OriginalMember(
      owner = "client!daa",
      name = "qf",
      descriptor = "Z"
   )
   public boolean field3501;
   @OriginalMember(
      owner = "client!daa",
      name = "xf",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field3470;
   @OriginalMember(
      owner = "client!daa",
      name = "Jc",
      descriptor = "Ltu;"
   )
   private class522 field3508;
   @OriginalMember(
      owner = "client!daa",
      name = "Ye",
      descriptor = "I"
   )
   public int field3415;
   @OriginalMember(
      owner = "client!daa",
      name = "nb",
      descriptor = "Ljava/lang/Object;"
   )
   public Object field3338;
   @OriginalMember(
      owner = "client!daa",
      name = "sf",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field3220;
   @OriginalMember(
      owner = "client!daa",
      name = "pg",
      descriptor = "Lsa;"
   )
   public class39 field3210;
   @OriginalMember(
      owner = "client!daa",
      name = "T",
      descriptor = "Ljava/awt/Canvas;"
   )
   public Canvas field3279;
   @OriginalMember(
      owner = "client!daa",
      name = "ob",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field3382;
   @OriginalMember(
      owner = "client!daa",
      name = "Fb",
      descriptor = "I"
   )
   private int field3281;
   @OriginalMember(
      owner = "client!daa",
      name = "dc",
      descriptor = "I"
   )
   public int field3321;
   @OriginalMember(
      owner = "client!daa",
      name = "Yc",
      descriptor = "I"
   )
   private int field3344;
   @OriginalMember(
      owner = "client!daa",
      name = "Ff",
      descriptor = "I"
   )
   public int field3295;
   @OriginalMember(
      owner = "client!daa",
      name = "Gd",
      descriptor = "I"
   )
   public int field3442;
   @OriginalMember(
      owner = "client!daa",
      name = "Pf",
      descriptor = "Ljagex3/graphics2/hw/NativeInterface;"
   )
   public NativeInterface field3337;
   @OriginalMember(
      owner = "client!daa",
      name = "Re",
      descriptor = "Lmo;"
   )
   private class729 field3424;
   @OriginalMember(
      owner = "client!daa",
      name = "Ig",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3526 = new String[]{method2019(method2018("y\u0017V*t^^")), method2019(method2018("y\u0017V*cY^")), method2019(method2018("y\u0017V*{T^")), method2019(method2018("y\u0017V*eT^")), method2019(method2018("y\u0017V*rU^")), method2019(method2018("y\u0017V*}X^")), method2019(method2018("fX\u0019*J")), method2019(method2018("y\u0017V*{^^")), method2019(method2018("s\u0003[h")), method2019(method2018("y\u0017V*}Z^")), method2019(method2018("y\u0017V*sT^")), method2019(method2018("y\u0017V*gX^")), method2019(method2018("y\u0017V*{_^")), method2019(method2018("y\u0017V*s[^")), method2019(method2018("y\u0017V*vT^")), method2019(method2018("y\u0017V*`U^")), method2019(method2018("y\u0017V*yY^")), method2019(method2018("y\u0017V*d5")), method2019(method2018("y\u0017V*}\\^")), method2019(method2018("y\u0017V*o5")), method2019(method2018("y\u0017V*gY^")), method2019(method2018("y\u0017V*bX^")), method2019(method2018("y\u0017V*t_^")), method2019(method2018("y\u0017V*qT^")), method2019(method2018("y\u0017V*dX^")), method2019(method2018("y\u0017V*bT^")), method2019(method2018("y\u0017V*gT^")), method2019(method2018("y\u0017V*zU^")), method2019(method2018("y\u0017V*c_^")), method2019(method2018("y\u0017V*uU^")), method2019(method2018("y\u0017V*yT^")), method2019(method2018("y\u0017V*aU^")), method2019(method2018("y\u0017V*xZ^")), method2019(method2018("y\u0017V*^5")), method2019(method2018("y\u0017V*}T^")), method2019(method2018("y\u0017V*S|^")), method2019(method2018("y\u0017V*cZ^")), method2019(method2018("y\u0017V*x5")), method2019(method2018("y\u0017V*{Z^")), method2019(method2018("y\u0017V*rW^")), method2019(method2018("y\u0017V*b^^")), method2019(method2018("y\u0017V*}5")), method2019(method2018("y\u0017V*`5")), method2019(method2018("y\u0017V*\u007f\\^")), method2019(method2018("y\u0017V*fX^")), method2019(method2018("y\u0017V*gU^")), method2019(method2018("y\u0017V*tW^")), method2019(method2018("y\u0017V*z[^")), method2019(method2018("y\u0017V*~Y^")), method2019(method2018("y\u0017V*gZ^")), method2019(method2018("y\u0017V*sU^")), method2019(method2018("y\u0017V*c^^")), method2019(method2018("y\u0017V*~U^")), method2019(method2018("y\u0017V*r5")), method2019(method2018("y\u0017V*|Y^")), method2019(method2018("y\u0017V*~Z^")), method2019(method2018("y\u0017V*bZ^")), method2019(method2018("y\u0017V*r\\^")), method2019(method2018("y\u0017V*[|^")), method2019(method2018("y\u0017V*tT^")), method2019(method2018("y\u0017V*{[^")), method2019(method2018("y\u0017V*}_^")), method2019(method2018("y\u0017V*pX^")), method2019(method2018("y\u0017V*b[^")), method2019(method2018("y\u0017V*\u007fZ^")), method2019(method2018("y\u0017V*c[^")), method2019(method2018("y\u0017V*m\\^")), method2019(method2018("y\u0017V*`Y^")), method2019(method2018("y\u0017V*g_^")), method2019(method2018("y\u0017V*xX^")), method2019(method2018("y\u0017V*f[^")), method2019(method2018("y\u0017V*zX^")), method2019(method2018("y\u0017V*|T^")), method2019(method2018("y\u0017V*~[^")), method2019(method2018("y\u0017V*xT^")), method2019(method2018("y\u0017V*s_^")), method2019(method2018("y\u0017V*p[^")), method2019(method2018("y\u0017V*qY^")), method2019(method2018("y\u0017V*cT^")), method2019(method2018("y\u0017V*x\\^")), method2019(method2018("y\u0017V*{U^")), method2019(method2018("y\u0017V*c5")), method2019(method2018("y\u0017V*qZ^")), method2019(method2018("y\u0017V*o\\^")), method2019(method2018("y\u0017V*cU^")), method2019(method2018("y\u0017V*fT^")), method2019(method2018("y\u0017V*q^^")), method2019(method2018("y\u0017V*dZ^")), method2019(method2018("y\u0017V*~T^")), method2019(method2018("y\u0017V*aX^")), method2019(method2018("y\u0017V*g5")), method2019(method2018("y\u0017V*t[^")), method2019(method2018("y\u0017V*tZ^")), method2019(method2018("y\u0017V*uY^")), method2019(method2018("y\u0017V*rT^")), method2019(method2018("y\u0017V*z5")), method2019(method2018("y\u0017V*yX^")), method2019(method2018("y\u0017V*qU^")), method2019(method2018("y\u0017V*t5")), method2019(method2018("y\u0017V*g[^")), method2019(method2018("y\u0017V*V|^")), method2019(method2018("y\u0017V*x[^")), method2019(method2018("y\u0017V*rZ^")), method2019(method2018("y\u0017V*v5")), method2019(method2018("y\u0017V*u[^")), method2019(method2018("y\u0017V*xU^")), method2019(method2018("y\u0017V*}[^")), method2019(method2018("y\u0017V*sW^")), method2019(method2018("y\u0017V*fU^")), method2019(method2018("y\u0017V*u\\^")), method2019(method2018("y\u0017V*tU^")), method2019(method2018("y\u0017V*a^^")), method2019(method2018("y\u0017V*yZ^")), method2019(method2018("y\u0017V*{X^")), method2019(method2018("y\u0017V*s\\^")), method2019(method2018("y\u0017V*`Z^")), method2019(method2018("y\u0017V*rY^")), method2019(method2018("y\u0017V*`[^")), method2019(method2018("y\u0017V*E|^")), method2019(method2018("y\u0017V*bU^")), method2019(method2018("y\u0017V*E5")), method2019(method2018("y\u0017V*eY^")), method2019(method2018("y\u0017V*dT^")), method2019(method2018("y\u0017V*a\\^")), method2019(method2018("y\u0017V*y^^")), method2019(method2018("y\u0017V*dY^")), method2019(method2018("y\u0017V*vZ^")), method2019(method2018("y\u0017V*uW^")), method2019(method2018("y\u0017V*aT^")), method2019(method2018("y\u0017V*dU^")), method2019(method2018("y\u0017V*y[^")), method2019(method2018("y\u0017V*aZ^")), method2019(method2018("y\u0017V*\u007fU^")), method2019(method2018("y\u0017V*\u007fT^")), method2019(method2018("y\u0017V*a[^")), method2019(method2018("y\u0017V*zT^")), method2019(method2018("y\u0017V*M|^")), method2019(method2018("y\u0017V*e_^")), method2019(method2018("y\u0017V*|U^")), method2019(method2018("y\u0017V*yU^")), method2019(method2018("y\u0017V*sZ^")), method2019(method2018("y\u0017V*f5")), method2019(method2018("y\u0017V*|5")), method2019(method2018("y\u0017V*pZ^")), method2019(method2018("y\u0017V*eX^")), method2019(method2018("y\u0017V*r[^")), method2019(method2018("y\u0017V*`X^")), method2019(method2018("y\u0017V*n5")), method2019(method2018("y\u0017V*}U^")), method2019(method2018("w\u0017Ae\u0019|\u0001C*t|\u0018AeD")), method2019(method2018("y\u0017V*e[^")), method2019(method2018("n\u0013CMPs\u0019Eaex\u0006VmYi")), method2019(method2018("y\u0017V*\u007f5")), method2019(method2018("y\u0017V*d[^")), method2019(method2018("y\u0017V*pT^")), method2019(method2018("y\u0017V*pU^")), method2019(method2018("y\u0017V*\u000bt\u0018^p\t5")), method2019(method2018("y\u0017V*Q5")), method2019(method2018("y\u0017V*G|^")), method2019(method2018("y\u0017V*zZ^")), method2019(method2018("y\u0017V*{5")), method2019(method2018("y\u0017V*|Z^")), method2019(method2018("y\u0017V*`T^")), method2019(method2018("y\u0017V*eZ^")), method2019(method2018("y\u0017V*vU^")), method2019(method2018("y\u0017V*|\\^")), method2019(method2018("y\u0017V*O|^")), method2019(method2018("y\u0017V*uZ^")), method2019(method2018("y\u0017V*d^^")), method2019(method2018("y\u0017V*vW^")), method2019(method2018("y\u0017V*v^^")), method2019(method2018("y\u0017V*cX^")), method2019(method2018("y\u0017V*z^^")), method2019(method2018("y\u0017V*b5")), method2019(method2018("y\u0017V*eU^")), method2019(method2018("y\u0017V*s5")), method2019(method2018("y\u0017V*uT^"))};
   @OriginalMember(
      owner = "client!daa",
      name = "fb",
      descriptor = "Ljava/lang/String;"
   )
   public static String field3216 = "";
   @OriginalMember(
      owner = "client!daa",
      name = "fc",
      descriptor = "[I"
   )
   public static int[] field3244 = new int[3];
   @OriginalMember(
      owner = "client!daa",
      name = "Eb",
      descriptor = "Z"
   )
   public static boolean field3215 = true;
   @OriginalMember(
      owner = "client!daa",
      name = "Oc",
      descriptor = "F"
   )
   public float field3420;
   @OriginalMember(
      owner = "client!daa",
      name = "Qf",
      descriptor = "F"
   )
   public float field3436;
   @OriginalMember(
      owner = "client!daa",
      name = "bf",
      descriptor = "F"
   )
   public float field3453;
   @OriginalMember(
      owner = "client!daa",
      name = "sd",
      descriptor = "F"
   )
   public float field3459;
   @OriginalMember(
      owner = "client!daa",
      name = "dg",
      descriptor = "F"
   )
   public float field3476;
   @OriginalMember(
      owner = "client!daa",
      name = "pf",
      descriptor = "F"
   )
   public float field3485;
   @OriginalMember(
      owner = "client!daa",
      name = "vf",
      descriptor = "F"
   )
   private float field3493;
   @OriginalMember(
      owner = "client!daa",
      name = "Mf",
      descriptor = "F"
   )
   private float field3499;
   @OriginalMember(
      owner = "client!daa",
      name = "xc",
      descriptor = "I"
   )
   public static int field3201;
   @OriginalMember(
      owner = "client!daa",
      name = "id",
      descriptor = "I"
   )
   public static int field3202;
   @OriginalMember(
      owner = "client!daa",
      name = "ib",
      descriptor = "I"
   )
   public static int field3203;
   @OriginalMember(
      owner = "client!daa",
      name = "M",
      descriptor = "I"
   )
   public static int field3204;
   @OriginalMember(
      owner = "client!daa",
      name = "Vd",
      descriptor = "I"
   )
   public static int field3205;
   @OriginalMember(
      owner = "client!daa",
      name = "Uc",
      descriptor = "I"
   )
   public static int field3206;
   @OriginalMember(
      owner = "client!daa",
      name = "Rd",
      descriptor = "I"
   )
   public static int field3207;
   @OriginalMember(
      owner = "client!daa",
      name = "db",
      descriptor = "I"
   )
   public static int field3208;
   @OriginalMember(
      owner = "client!daa",
      name = "Bf",
      descriptor = "I"
   )
   public static int field3209;
   @OriginalMember(
      owner = "client!daa",
      name = "od",
      descriptor = "I"
   )
   public static int field3211;
   @OriginalMember(
      owner = "client!daa",
      name = "u",
      descriptor = "I"
   )
   public static int field3212;
   @OriginalMember(
      owner = "client!daa",
      name = "I",
      descriptor = "I"
   )
   public static int field3213;
   @OriginalMember(
      owner = "client!daa",
      name = "Cc",
      descriptor = "I"
   )
   public static int field3214;
   @OriginalMember(
      owner = "client!daa",
      name = "S",
      descriptor = "I"
   )
   public static int field3217;
   @OriginalMember(
      owner = "client!daa",
      name = "Dd",
      descriptor = "I"
   )
   public static int field3218;
   @OriginalMember(
      owner = "client!daa",
      name = "If",
      descriptor = "I"
   )
   public static int field3219;
   @OriginalMember(
      owner = "client!daa",
      name = "lf",
      descriptor = "I"
   )
   public static int field3221;
   @OriginalMember(
      owner = "client!daa",
      name = "tg",
      descriptor = "I"
   )
   public static int field3222;
   @OriginalMember(
      owner = "client!daa",
      name = "bg",
      descriptor = "I"
   )
   public static int field3223;
   @OriginalMember(
      owner = "client!daa",
      name = "Id",
      descriptor = "I"
   )
   public static int field3224;
   @OriginalMember(
      owner = "client!daa",
      name = "Ud",
      descriptor = "I"
   )
   public static int field3225;
   @OriginalMember(
      owner = "client!daa",
      name = "re",
      descriptor = "I"
   )
   public static int field3226;
   @OriginalMember(
      owner = "client!daa",
      name = "cf",
      descriptor = "I"
   )
   public static int field3227;
   @OriginalMember(
      owner = "client!daa",
      name = "B",
      descriptor = "I"
   )
   public static int field3228;
   @OriginalMember(
      owner = "client!daa",
      name = "vg",
      descriptor = "I"
   )
   public static int field3229;
   @OriginalMember(
      owner = "client!daa",
      name = "W",
      descriptor = "I"
   )
   public static int field3230;
   @OriginalMember(
      owner = "client!daa",
      name = "Nf",
      descriptor = "I"
   )
   public static int field3231;
   @OriginalMember(
      owner = "client!daa",
      name = "Dc",
      descriptor = "I"
   )
   public static int field3232;
   @OriginalMember(
      owner = "client!daa",
      name = "Bc",
      descriptor = "I"
   )
   public static int field3233;
   @OriginalMember(
      owner = "client!daa",
      name = "ab",
      descriptor = "I"
   )
   public static int field3234;
   @OriginalMember(
      owner = "client!daa",
      name = "Eg",
      descriptor = "I"
   )
   public static int field3235;
   @OriginalMember(
      owner = "client!daa",
      name = "nd",
      descriptor = "I"
   )
   public static int field3236;
   @OriginalMember(
      owner = "client!daa",
      name = "Mc",
      descriptor = "I"
   )
   public static int field3237;
   @OriginalMember(
      owner = "client!daa",
      name = "Ic",
      descriptor = "I"
   )
   public static int field3238;
   @OriginalMember(
      owner = "client!daa",
      name = "E",
      descriptor = "I"
   )
   public static int field3239;
   @OriginalMember(
      owner = "client!daa",
      name = "ng",
      descriptor = "I"
   )
   public static int field3240;
   @OriginalMember(
      owner = "client!daa",
      name = "Hc",
      descriptor = "I"
   )
   public static int field3241;
   @OriginalMember(
      owner = "client!daa",
      name = "Vc",
      descriptor = "I"
   )
   public static int field3242;
   @OriginalMember(
      owner = "client!daa",
      name = "z",
      descriptor = "I"
   )
   public static int field3243;
   @OriginalMember(
      owner = "client!daa",
      name = "mf",
      descriptor = "I"
   )
   public static int field3245;
   @OriginalMember(
      owner = "client!daa",
      name = "J",
      descriptor = "I"
   )
   public static int field3246;
   @OriginalMember(
      owner = "client!daa",
      name = "Ab",
      descriptor = "I"
   )
   public static int field3247;
   @OriginalMember(
      owner = "client!daa",
      name = "X",
      descriptor = "I"
   )
   public static int field3248;
   @OriginalMember(
      owner = "client!daa",
      name = "ce",
      descriptor = "I"
   )
   public static int field3249;
   @OriginalMember(
      owner = "client!daa",
      name = "ub",
      descriptor = "I"
   )
   public static int field3251;
   @OriginalMember(
      owner = "client!daa",
      name = "Lb",
      descriptor = "I"
   )
   public static int field3252;
   @OriginalMember(
      owner = "client!daa",
      name = "ue",
      descriptor = "I"
   )
   public static int field3253;
   @OriginalMember(
      owner = "client!daa",
      name = "We",
      descriptor = "I"
   )
   public static int field3254;
   @OriginalMember(
      owner = "client!daa",
      name = "Be",
      descriptor = "I"
   )
   public static int field3255;
   @OriginalMember(
      owner = "client!daa",
      name = "ie",
      descriptor = "I"
   )
   public static int field3256;
   @OriginalMember(
      owner = "client!daa",
      name = "kb",
      descriptor = "I"
   )
   public static int field3257;
   @OriginalMember(
      owner = "client!daa",
      name = "Uf",
      descriptor = "I"
   )
   public static int field3258;
   @OriginalMember(
      owner = "client!daa",
      name = "Zc",
      descriptor = "I"
   )
   public static int field3259;
   @OriginalMember(
      owner = "client!daa",
      name = "jc",
      descriptor = "I"
   )
   public static int field3260;
   @OriginalMember(
      owner = "client!daa",
      name = "rg",
      descriptor = "I"
   )
   public static int field3261;
   @OriginalMember(
      owner = "client!daa",
      name = "Oe",
      descriptor = "I"
   )
   public static int field3262;
   @OriginalMember(
      owner = "client!daa",
      name = "jb",
      descriptor = "I"
   )
   public static int field3263;
   @OriginalMember(
      owner = "client!daa",
      name = "Hf",
      descriptor = "I"
   )
   public static int field3264;
   @OriginalMember(
      owner = "client!daa",
      name = "Fg",
      descriptor = "I"
   )
   public static int field3265;
   @OriginalMember(
      owner = "client!daa",
      name = "Df",
      descriptor = "I"
   )
   public static int field3266;
   @OriginalMember(
      owner = "client!daa",
      name = "v",
      descriptor = "I"
   )
   public static int field3267;
   @OriginalMember(
      owner = "client!daa",
      name = "dd",
      descriptor = "I"
   )
   public static int field3268;
   @OriginalMember(
      owner = "client!daa",
      name = "je",
      descriptor = "I"
   )
   public static int field3269;
   @OriginalMember(
      owner = "client!daa",
      name = "ge",
      descriptor = "I"
   )
   public static int field3270;
   @OriginalMember(
      owner = "client!daa",
      name = "ud",
      descriptor = "I"
   )
   public static int field3271;
   @OriginalMember(
      owner = "client!daa",
      name = "Wc",
      descriptor = "I"
   )
   public static int field3272;
   @OriginalMember(
      owner = "client!daa",
      name = "Vb",
      descriptor = "I"
   )
   public static int field3273;
   @OriginalMember(
      owner = "client!daa",
      name = "Qd",
      descriptor = "I"
   )
   public static int field3274;
   @OriginalMember(
      owner = "client!daa",
      name = "Ie",
      descriptor = "I"
   )
   public static int field3275;
   @OriginalMember(
      owner = "client!daa",
      name = "me",
      descriptor = "I"
   )
   public static int field3276;
   @OriginalMember(
      owner = "client!daa",
      name = "ef",
      descriptor = "I"
   )
   public static int field3277;
   @OriginalMember(
      owner = "client!daa",
      name = "He",
      descriptor = "I"
   )
   public static int field3278;
   @OriginalMember(
      owner = "client!daa",
      name = "kg",
      descriptor = "I"
   )
   public static int field3280;
   @OriginalMember(
      owner = "client!daa",
      name = "F",
      descriptor = "I"
   )
   public static int field3282;
   @OriginalMember(
      owner = "client!daa",
      name = "Ag",
      descriptor = "I"
   )
   public static int field3283;
   @OriginalMember(
      owner = "client!daa",
      name = "Wd",
      descriptor = "I"
   )
   public static int field3284;
   @OriginalMember(
      owner = "client!daa",
      name = "Ub",
      descriptor = "I"
   )
   public static int field3285;
   @OriginalMember(
      owner = "client!daa",
      name = "qe",
      descriptor = "I"
   )
   public static int field3286;
   @OriginalMember(
      owner = "client!daa",
      name = "Wb",
      descriptor = "I"
   )
   public static int field3287;
   @OriginalMember(
      owner = "client!daa",
      name = "R",
      descriptor = "I"
   )
   public static int field3288;
   @OriginalMember(
      owner = "client!daa",
      name = "Ze",
      descriptor = "I"
   )
   public static int field3289;
   @OriginalMember(
      owner = "client!daa",
      name = "wf",
      descriptor = "I"
   )
   public static int field3290;
   @OriginalMember(
      owner = "client!daa",
      name = "jg",
      descriptor = "I"
   )
   public static int field3291;
   @OriginalMember(
      owner = "client!daa",
      name = "Jb",
      descriptor = "I"
   )
   public static int field3292;
   @OriginalMember(
      owner = "client!daa",
      name = "md",
      descriptor = "I"
   )
   public static int field3293;
   @OriginalMember(
      owner = "client!daa",
      name = "ac",
      descriptor = "I"
   )
   public static int field3294;
   @OriginalMember(
      owner = "client!daa",
      name = "De",
      descriptor = "I"
   )
   public static int field3296;
   @OriginalMember(
      owner = "client!daa",
      name = "gd",
      descriptor = "I"
   )
   public static int field3297;
   @OriginalMember(
      owner = "client!daa",
      name = "Hd",
      descriptor = "I"
   )
   public static int field3298;
   @OriginalMember(
      owner = "client!daa",
      name = "Pc",
      descriptor = "I"
   )
   public static int field3300;
   @OriginalMember(
      owner = "client!daa",
      name = "tf",
      descriptor = "I"
   )
   public static int field3301;
   @OriginalMember(
      owner = "client!daa",
      name = "be",
      descriptor = "I"
   )
   public static int field3302;
   @OriginalMember(
      owner = "client!daa",
      name = "kf",
      descriptor = "I"
   )
   public static int field3303;
   @OriginalMember(
      owner = "client!daa",
      name = "Rc",
      descriptor = "I"
   )
   public static int field3304;
   @OriginalMember(
      owner = "client!daa",
      name = "Ib",
      descriptor = "I"
   )
   public static int field3305;
   @OriginalMember(
      owner = "client!daa",
      name = "Gf",
      descriptor = "I"
   )
   public static int field3307;
   @OriginalMember(
      owner = "client!daa",
      name = "yf",
      descriptor = "I"
   )
   public static int field3308;
   @OriginalMember(
      owner = "client!daa",
      name = "qd",
      descriptor = "I"
   )
   public static int field3309;
   @OriginalMember(
      owner = "client!daa",
      name = "tc",
      descriptor = "I"
   )
   public static int field3310;
   @OriginalMember(
      owner = "client!daa",
      name = "Nb",
      descriptor = "I"
   )
   public static int field3311;
   @OriginalMember(
      owner = "client!daa",
      name = "Bd",
      descriptor = "I"
   )
   public static int field3312;
   @OriginalMember(
      owner = "client!daa",
      name = "og",
      descriptor = "I"
   )
   public static int field3313;
   @OriginalMember(
      owner = "client!daa",
      name = "Lc",
      descriptor = "I"
   )
   public static int field3314;
   @OriginalMember(
      owner = "client!daa",
      name = "Fe",
      descriptor = "I"
   )
   public static int field3315;
   @OriginalMember(
      owner = "client!daa",
      name = "jf",
      descriptor = "I"
   )
   public static int field3316;
   @OriginalMember(
      owner = "client!daa",
      name = "ff",
      descriptor = "I"
   )
   public static int field3317;
   @OriginalMember(
      owner = "client!daa",
      name = "w",
      descriptor = "I"
   )
   public static int field3318;
   @OriginalMember(
      owner = "client!daa",
      name = "Ne",
      descriptor = "I"
   )
   public static int field3319;
   @OriginalMember(
      owner = "client!daa",
      name = "ug",
      descriptor = "I"
   )
   public static int field3320;
   @OriginalMember(
      owner = "client!daa",
      name = "of",
      descriptor = "I"
   )
   public static int field3322;
   @OriginalMember(
      owner = "client!daa",
      name = "Ge",
      descriptor = "I"
   )
   public static int field3323;
   @OriginalMember(
      owner = "client!daa",
      name = "Ee",
      descriptor = "I"
   )
   public static int field3324;
   @OriginalMember(
      owner = "client!daa",
      name = "mb",
      descriptor = "I"
   )
   public static int field3325;
   @OriginalMember(
      owner = "client!daa",
      name = "ec",
      descriptor = "I"
   )
   public static int field3326;
   @OriginalMember(
      owner = "client!daa",
      name = "Vf",
      descriptor = "I"
   )
   public static int field3327;
   @OriginalMember(
      owner = "client!daa",
      name = "ze",
      descriptor = "I"
   )
   public static int field3328;
   @OriginalMember(
      owner = "client!daa",
      name = "Ae",
      descriptor = "I"
   )
   public static int field3329;
   @OriginalMember(
      owner = "client!daa",
      name = "cg",
      descriptor = "I"
   )
   public static int field3330;
   @OriginalMember(
      owner = "client!daa",
      name = "ae",
      descriptor = "I"
   )
   public static int field3331;
   @OriginalMember(
      owner = "client!daa",
      name = "bc",
      descriptor = "I"
   )
   public static int field3332;
   @OriginalMember(
      owner = "client!daa",
      name = "wb",
      descriptor = "I"
   )
   public static int field3333;
   @OriginalMember(
      owner = "client!daa",
      name = "Gb",
      descriptor = "I"
   )
   public static int field3334;
   @OriginalMember(
      owner = "client!daa",
      name = "Wf",
      descriptor = "I"
   )
   public static int field3335;
   @OriginalMember(
      owner = "client!daa",
      name = "de",
      descriptor = "I"
   )
   public static int field3336;
   @OriginalMember(
      owner = "client!daa",
      name = "mg",
      descriptor = "I"
   )
   public static int field3339;
   @OriginalMember(
      owner = "client!daa",
      name = "Bb",
      descriptor = "I"
   )
   public static int field3340;
   @OriginalMember(
      owner = "client!daa",
      name = "Md",
      descriptor = "I"
   )
   public static int field3341;
   @OriginalMember(
      owner = "client!daa",
      name = "Xd",
      descriptor = "I"
   )
   public static int field3342;
   @OriginalMember(
      owner = "client!daa",
      name = "Of",
      descriptor = "I"
   )
   public static int field3345;
   @OriginalMember(
      owner = "client!daa",
      name = "Te",
      descriptor = "I"
   )
   public static int field3346;
   @OriginalMember(
      owner = "client!daa",
      name = "Le",
      descriptor = "I"
   )
   public static int field3347;
   @OriginalMember(
      owner = "client!daa",
      name = "oc",
      descriptor = "I"
   )
   public static int field3348;
   @OriginalMember(
      owner = "client!daa",
      name = "Kd",
      descriptor = "I"
   )
   public static int field3349;
   @OriginalMember(
      owner = "client!daa",
      name = "oe",
      descriptor = "I"
   )
   public static int field3350;
   @OriginalMember(
      owner = "client!daa",
      name = "qg",
      descriptor = "I"
   )
   public static int field3351;
   @OriginalMember(
      owner = "client!daa",
      name = "Ac",
      descriptor = "I"
   )
   public static int field3352;
   @OriginalMember(
      owner = "client!daa",
      name = "Pe",
      descriptor = "I"
   )
   public static int field3353;
   @OriginalMember(
      owner = "client!daa",
      name = "Xb",
      descriptor = "I"
   )
   public static int field3355;
   @OriginalMember(
      owner = "client!daa",
      name = "zc",
      descriptor = "I"
   )
   public static int field3356;
   @OriginalMember(
      owner = "client!daa",
      name = "Qc",
      descriptor = "I"
   )
   public static int field3357;
   @OriginalMember(
      owner = "client!daa",
      name = "vd",
      descriptor = "I"
   )
   public static int field3358;
   @OriginalMember(
      owner = "client!daa",
      name = "wd",
      descriptor = "I"
   )
   public static int field3359;
   @OriginalMember(
      owner = "client!daa",
      name = "eb",
      descriptor = "I"
   )
   public static int field3360;
   @OriginalMember(
      owner = "client!daa",
      name = "te",
      descriptor = "I"
   )
   public static int field3361;
   @OriginalMember(
      owner = "client!daa",
      name = "jd",
      descriptor = "I"
   )
   public static int field3362;
   @OriginalMember(
      owner = "client!daa",
      name = "uc",
      descriptor = "I"
   )
   public static int field3364;
   @OriginalMember(
      owner = "client!daa",
      name = "af",
      descriptor = "I"
   )
   public static int field3365;
   @OriginalMember(
      owner = "client!daa",
      name = "Sf",
      descriptor = "I"
   )
   public static int field3366;
   @OriginalMember(
      owner = "client!daa",
      name = "Xc",
      descriptor = "I"
   )
   public static int field3367;
   @OriginalMember(
      owner = "client!daa",
      name = "Yb",
      descriptor = "I"
   )
   public static int field3368;
   @OriginalMember(
      owner = "client!daa",
      name = "Hg",
      descriptor = "I"
   )
   public static int field3369;
   @OriginalMember(
      owner = "client!daa",
      name = "fg",
      descriptor = "I"
   )
   public static int field3370;
   @OriginalMember(
      owner = "client!daa",
      name = "Jd",
      descriptor = "I"
   )
   public static int field3371;
   @OriginalMember(
      owner = "client!daa",
      name = "hg",
      descriptor = "I"
   )
   public static int field3372;
   @OriginalMember(
      owner = "client!daa",
      name = "qc",
      descriptor = "I"
   )
   public static int field3373;
   @OriginalMember(
      owner = "client!daa",
      name = "Ob",
      descriptor = "I"
   )
   public static int field3374;
   @OriginalMember(
      owner = "client!daa",
      name = "Ce",
      descriptor = "I"
   )
   public static int field3375;
   @OriginalMember(
      owner = "client!daa",
      name = "Td",
      descriptor = "I"
   )
   public static int field3376;
   @OriginalMember(
      owner = "client!daa",
      name = "kd",
      descriptor = "I"
   )
   public static int field3377;
   @OriginalMember(
      owner = "client!daa",
      name = "Gg",
      descriptor = "I"
   )
   public static int field3378;
   @OriginalMember(
      owner = "client!daa",
      name = "ad",
      descriptor = "I"
   )
   public static int field3379;
   @OriginalMember(
      owner = "client!daa",
      name = "Ld",
      descriptor = "I"
   )
   public static int field3380;
   @OriginalMember(
      owner = "client!daa",
      name = "U",
      descriptor = "I"
   )
   public static int field3381;
   @OriginalMember(
      owner = "client!daa",
      name = "Ef",
      descriptor = "I"
   )
   public static int field3383;
   @OriginalMember(
      owner = "client!daa",
      name = "Od",
      descriptor = "I"
   )
   public static int field3384;
   @OriginalMember(
      owner = "client!daa",
      name = "gb",
      descriptor = "I"
   )
   public static int field3385;
   @OriginalMember(
      owner = "client!daa",
      name = "Jf",
      descriptor = "I"
   )
   public static int field3386;
   @OriginalMember(
      owner = "client!daa",
      name = "Ec",
      descriptor = "I"
   )
   public static int field3387;
   @OriginalMember(
      owner = "client!daa",
      name = "Qe",
      descriptor = "I"
   )
   public static int field3388;
   @OriginalMember(
      owner = "client!daa",
      name = "A",
      descriptor = "I"
   )
   public static int field3389;
   @OriginalMember(
      owner = "client!daa",
      name = "bd",
      descriptor = "I"
   )
   public static int field3390;
   @OriginalMember(
      owner = "client!daa",
      name = "Sd",
      descriptor = "I"
   )
   public int field3391;
   @OriginalMember(
      owner = "client!daa",
      name = "ld",
      descriptor = "I"
   )
   public int field3393;
   @OriginalMember(
      owner = "client!daa",
      name = "xb",
      descriptor = "I"
   )
   public int field3395;
   @OriginalMember(
      owner = "client!daa",
      name = "Bg",
      descriptor = "I"
   )
   public int field3410;
   @OriginalMember(
      owner = "client!daa",
      name = "Dg",
      descriptor = "I"
   )
   private int field3426;
   @OriginalMember(
      owner = "client!daa",
      name = "pe",
      descriptor = "I"
   )
   public int field3444;
   @OriginalMember(
      owner = "client!daa",
      name = "Tf",
      descriptor = "I"
   )
   public int field3445;
   @OriginalMember(
      owner = "client!daa",
      name = "Db",
      descriptor = "I"
   )
   public int field3455;
   @OriginalMember(
      owner = "client!daa",
      name = "rd",
      descriptor = "I"
   )
   public int field3465;
   @OriginalMember(
      owner = "client!daa",
      name = "Fd",
      descriptor = "I"
   )
   public int field3484;
   @OriginalMember(
      owner = "client!daa",
      name = "Rb",
      descriptor = "I"
   )
   private int field3487;
   @OriginalMember(
      owner = "client!daa",
      name = "hc",
      descriptor = "I"
   )
   public int field3488;
   @OriginalMember(
      owner = "client!daa",
      name = "Ke",
      descriptor = "I"
   )
   public int field3500;
   @OriginalMember(
      owner = "client!daa",
      name = "rc",
      descriptor = "I"
   )
   private int field3524;
   @OriginalMember(
      owner = "client!daa",
      name = "peer",
      descriptor = "J"
   )
   public long peer;
   @OriginalMember(
      owner = "client!daa",
      name = "fd",
      descriptor = "Lbda;"
   )
   private class181 field3475;
   @OriginalMember(
      owner = "client!daa",
      name = "vb",
      descriptor = "Lrs;"
   )
   private class297 field3502;
   @OriginalMember(
      owner = "client!daa",
      name = "x",
      descriptor = "Lrs;"
   )
   public class297 field3507;
   @OriginalMember(
      owner = "client!daa",
      name = "vc",
      descriptor = "Lrs;"
   )
   private class297 field3509;
   @OriginalMember(
      owner = "client!daa",
      name = "rb",
      descriptor = "Lrs;"
   )
   public class297 field3511;
   @OriginalMember(
      owner = "client!daa",
      name = "P",
      descriptor = "Lrs;"
   )
   public class297 field3515;
   @OriginalMember(
      owner = "client!daa",
      name = "Ad",
      descriptor = "Lrs;"
   )
   private class297 field3519;
   @OriginalMember(
      owner = "client!daa",
      name = "Rf",
      descriptor = "Lrs;"
   )
   public class297 field3523;
   @OriginalMember(
      owner = "client!daa",
      name = "lg",
      descriptor = "Lgm;"
   )
   public static class438 field3299;
   @OriginalMember(
      owner = "client!daa",
      name = "hf",
      descriptor = "Llv;"
   )
   private class454 field3416;
   @OriginalMember(
      owner = "client!daa",
      name = "nc",
      descriptor = "Lqc;"
   )
   public class497 field3343;
   @OriginalMember(
      owner = "client!daa",
      name = "Z",
      descriptor = "Lsp;"
   )
   private class575 field3489;
   @OriginalMember(
      owner = "client!daa",
      name = "Kb",
      descriptor = "Ldca;"
   )
   private class581 field3505;
   @OriginalMember(
      owner = "client!daa",
      name = "Xf",
      descriptor = "Ldca;"
   )
   private class581 field3517;
   @OriginalMember(
      owner = "client!daa",
      name = "Kc",
      descriptor = "Ldca;"
   )
   private class581 field3521;
   @OriginalMember(
      owner = "client!daa",
      name = "Cb",
      descriptor = "Ltka;"
   )
   public class599 field3503;
   @OriginalMember(
      owner = "client!daa",
      name = "Pd",
      descriptor = "Ltka;"
   )
   public class599 field3504;
   @OriginalMember(
      owner = "client!daa",
      name = "le",
      descriptor = "Ltka;"
   )
   public class599 field3506;
   @OriginalMember(
      owner = "client!daa",
      name = "D",
      descriptor = "Ltka;"
   )
   public class599 field3512;
   @OriginalMember(
      owner = "client!daa",
      name = "ig",
      descriptor = "Ltka;"
   )
   public class599 field3513;
   @OriginalMember(
      owner = "client!daa",
      name = "Ve",
      descriptor = "Ltka;"
   )
   public class599 field3514;
   @OriginalMember(
      owner = "client!daa",
      name = "wc",
      descriptor = "Ltka;"
   )
   public class599 field3516;
   @OriginalMember(
      owner = "client!daa",
      name = "Cd",
      descriptor = "Ltka;"
   )
   public class599 field3518;
   @OriginalMember(
      owner = "client!daa",
      name = "H",
      descriptor = "Ltka;"
   )
   public class599 field3520;
   @OriginalMember(
      owner = "client!daa",
      name = "Me",
      descriptor = "Ltka;"
   )
   public class599 field3522;
   @OriginalMember(
      owner = "client!daa",
      name = "pc",
      descriptor = "Lqf;"
   )
   public class683 field3409;
   @OriginalMember(
      owner = "client!daa",
      name = "Y",
      descriptor = "Lida;"
   )
   private class99 field3510;
   @OriginalMember(
      owner = "client!daa",
      name = "xe",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   public NativeHeap field3250;
   @OriginalMember(
      owner = "client!daa",
      name = "zd",
      descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   public NativeHeapBuffer field3354;
   @OriginalMember(
      owner = "client!daa",
      name = "Gc",
      descriptor = "Ljava/util/Hashtable;"
   )
   private Hashtable field3363;
   @OriginalMember(
      owner = "client!daa",
      name = "G",
      descriptor = "Z"
   )
   public boolean field3404;
   @OriginalMember(
      owner = "client!daa",
      name = "K",
      descriptor = "Z"
   )
   public boolean field3406;
   @OriginalMember(
      owner = "client!daa",
      name = "Tb",
      descriptor = "Z"
   )
   public boolean field3414;
   @OriginalMember(
      owner = "client!daa",
      name = "cb",
      descriptor = "Z"
   )
   public boolean field3437;
   @OriginalMember(
      owner = "client!daa",
      name = "yd",
      descriptor = "Z"
   )
   public boolean field3457;
   @OriginalMember(
      owner = "client!daa",
      name = "sb",
      descriptor = "Z"
   )
   public boolean field3525;
   @OriginalMember(
      owner = "client!daa",
      name = "Zb",
      descriptor = "[Lef;"
   )
   public class171[] field3469;
   @OriginalMember(
      owner = "client!daa",
      name = "Mb",
      descriptor = "[Lgq;"
   )
   public class200[] field3403;
   @OriginalMember(
      owner = "client!daa",
      name = "Tc",
      descriptor = "[Lgq;"
   )
   public class200[] field3496;
   @OriginalMember(
      owner = "client!daa",
      name = "Lf",
      descriptor = "[Ltu;"
   )
   public class522[] field3491;
   @OriginalMember(
      owner = "client!daa",
      name = "rf",
      descriptor = "[Lqf;"
   )
   private class683[] field3467;
   @OriginalMember(
      owner = "client!daa",
      name = "lb",
      descriptor = "[Lpha;"
   )
   public class757[] field3440;

   @OriginalMember(
      owner = "client!daa",
      name = "o",
      descriptor = "()V"
   )
   public final void method207() {
      try {
         ++field3263;
         if (this.field3424 != null) {
            this.field3424.method5287(-474);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3526[109] + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "d",
      descriptor = "(ZI)V"
   )
   public final void method1935(boolean arg0, int arg1) {
      try {
         ++field3312;
         int var3 = 82 / ((45 - arg1) / 32);
         if (!arg0 != !this.field3437) {
            this.field3437 = arg0;
            this.method1285(-32617);
            this.field3426 &= -32;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3526[56] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method1936(boolean arg0, int arg1) {
      try {
         ++field3290;
         if (arg0 == !this.field3450) {
            this.field3450 = arg0;
            this.method1285(-32617);
         }

         if (arg1 <= 101) {
            this.field3427 = 10;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3526[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(Lhj;II)V"
   )
   public final void method1937(class670 arg0, int arg1, int arg2) {
      try {
         ++field3285;
         this.method1276(arg1, false, arg0, arg2 ^ arg2);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3526[78] + (arg0 != null ? field3526[6] : field3526[8]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(Ltu;B)V"
   )
   public final void method1938(class522 arg0, byte arg1) {
      try {
         ++field3370;
         this.field3392.method323(arg0);
         if (arg1 != -70) {
            this.field3457 = false;
         }

         this.field3394 = false;
         this.method1961((byte)-36);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3526[112] + (arg0 != null ? field3526[6] : field3526[8]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method1939(int arg0, byte arg1) {
      try {
         if (arg1 != -60) {
            this.method1975(28);
         }

         ++field3352;
         if (~this.field3484 != ~arg0) {
            this.field3484 = arg0;
            this.method1250(11);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3526[74] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "d",
      descriptor = "(B)Ltu;"
   )
   public final class522 method1940(byte arg0) {
      try {
         ++field3293;
         return arg0 < 16 ? null : this.field3392;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[69] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(BZ)V"
   )
   public final void method1941(byte arg0, boolean arg1) {
      try {
         ++field3291;
         if (this.field3456 != arg1) {
            this.field3456 = arg1;
            this.method1281((byte)-121);
         }

         if (arg0 >= -8) {
            this.method1996((byte)-114, 104, true);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3526[119] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "z",
      descriptor = "(B)V"
   )
   public abstract void method1231(byte arg0);

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(I[Lpha;)V"
   )
   public final void method199(int arg0, class757[] arg1) {
      boolean var3 = client.field10022;

      try {
         int var4 = 0;
         if (var3) {
            this.field3440[var4] = arg1[var4];
            ++var4;
         }

         while(true) {
            class226 var10000;
            if (~arg0 >= ~var4) {
               ++field3362;
               this.field3445 = arg0;
               var10000 = this;
               if (!var3) {
                  if (this.field3495.method3812((byte)46)) {
                     this.method1233((byte)121);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = this;
            }

            var10000.field3440[var4] = arg1[var4];
            ++var4;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3526[121] + arg0 + ',' + (arg1 != null ? field3526[6] : field3526[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "e",
      descriptor = "(B)V"
   )
   private final void method1942(byte arg0) {
      try {
         if (!this.field3405) {
            label24: {
               float[] var2 = this.field3421;
               this.field3405 = true;
               if (~this.field3321 != -1 && ~this.field3295 != -1) {
                  var2[3] = 0.0F;
                  var2[9] = 0.0F;
                  var2[4] = 0.0F;
                  var2[15] = 1.0F;
                  var2[14] = 0.5F;
                  var2[7] = 0.0F;
                  var2[2] = 0.0F;
                  var2[5] = -2.0F / (float)this.field3295;
                  var2[1] = 0.0F;
                  var2[0] = 2.0F / (float)this.field3321;
                  var2[13] = 1.0F;
                  var2[10] = 0.5F;
                  var2[8] = 0.0F;
                  var2[6] = 0.0F;
                  var2[11] = 0.0F;
                  var2[12] = -1.0F;
                  if (!client.field10022) {
                     break label24;
                  }
               }

               var2[1] = 0.0F;
               var2[14] = 0.0F;
               var2[7] = 0.0F;
               var2[9] = 0.0F;
               var2[0] = 1.0F;
               var2[4] = 0.0F;
               var2[10] = 1.0F;
               var2[11] = 0.0F;
               var2[13] = 0.0F;
               var2[15] = 1.0F;
               var2[5] = 1.0F;
               var2[12] = 0.0F;
               var2[6] = 0.0F;
               var2[2] = 0.0F;
               var2[3] = 0.0F;
               var2[8] = 0.0F;
            }
         }

         if (arg0 == -119) {
            ++field3315;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3526[167] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "U",
      descriptor = "(IIIII)V"
   )
   public final void method218(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.method196(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
         ++field3358;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field3526[173] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(ILqf;)V"
   )
   public final void method1943(int arg0, class683 arg1) {
      try {
         ++field3332;
         if (arg0 != 0) {
            this.method1283(46, (Canvas)null, (Object)null);
         }

         if (this.field3467[this.field3434] != arg1) {
            label29: {
               this.field3467[this.field3434] = arg1;
               if (arg1 != null) {
                  arg1.method1071(true);
                  if (!client.field10022) {
                     break label29;
                  }
               }

               this.method1251(0);
            }

            this.field3426 &= -2;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3526[49] + arg0 + ',' + (arg1 != null ? field3526[6] : field3526[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method155(int arg0) {
      try {
         ++field3336;
         if (~arg0 != -2) {
            throw new IllegalArgumentException("");
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[92] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "<init>",
      descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Lsa;II)V"
   )
   public class226(Canvas arg0, Object arg1, class672 arg2, class39 arg3, int arg4, int arg5) {
      boolean var7 = client.field10022;
      super(arg2);
      this.field3306 = new class261();
      this.field3394 = true;
      this.field3392 = new class522();
      this.field3396 = new class522();
      this.field3397 = new class522();
      this.field3398 = new class522();
      this.field3399 = new class522();
      this.field3400 = new class522();
      this.field3408 = 0;
      this.field3435 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
      this.field3431 = false;
      this.field3434 = 0;
      this.field3430 = 1;
      this.field3401 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
      this.field3417 = -1.0F;
      this.field3419 = false;
      this.field3418 = true;
      this.field3402 = -1;
      this.field3412 = 512;
      this.field3439 = 128;
      this.field3428 = 0;
      this.field3452 = 0;
      this.field3448 = false;
      this.field3423 = false;
      this.field3441 = 3;
      this.field3449 = 512;
      this.field3425 = 0;
      this.field3422 = 0;
      this.field3451 = -1;
      this.field3462 = 1.0F;
      this.field3421 = new float[16];
      this.field3468 = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
      this.field3472 = 3584.0F;
      this.field3429 = 1.0F;
      this.field3473 = 0;
      this.field3456 = true;
      this.field3477 = new class575[10];
      this.field3427 = 8;
      this.field3450 = true;
      this.field3460 = 1.0F;
      this.field3447 = 3584;
      this.field3474 = false;
      this.field3478 = 0;
      this.field3463 = 0;
      this.field3479 = 0;
      this.field3433 = 3584.0F;
      this.field3461 = true;
      this.field3481 = 0;
      this.field3405 = false;
      this.field3432 = false;
      this.field3490 = this.field3468;
      this.field3438 = 1.0F;
      this.field3486 = -1;
      this.field3471 = 16777215;
      this.field3454 = true;
      this.field3413 = false;
      this.field3482 = -1;
      this.field3411 = -1.0F;
      this.field3483 = new float[16];
      this.field3494 = 50;
      this.field3446 = -1;
      this.field3495 = class230.field3584;
      this.field3492 = 1.0F;
      this.field3480 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
      this.field3407 = new float[16];
      this.field3443 = class283.field4272;
      this.field3466 = 0;
      this.field3458 = false;
      this.field3497 = 0;
      this.field3498 = new float[]{0.0F, 0.0F, -1.0F, 0.0F};
      this.field3464 = 0;
      this.field3501 = false;
      this.field3470 = new Stream();
      this.field3508 = new class522();

      try {
         try {
            this.field3415 = arg4;
            this.field3220 = this.field3338 = arg1;
            this.field3210 = arg3;
            this.field3382 = this.field3279 = arg0;
            Dimension var8 = arg0.getSize();
            this.field3321 = this.field3281 = var8.width;
            this.field3295 = this.field3344 = var8.height;
            this.field3442 = arg5;
            class274.method2317(true, false, (byte)24);
            if (super.field240 == null) {
               this.field3337 = new NativeInterface(0, this.field3442);
               this.field3424 = null;
            } else {
               this.field3424 = new class729(this, super.field240);
               this.field3337 = new NativeInterface(super.field240.method2037(-11048), this.field3442);
               int var9 = 0;
               if (var7 || ~super.field240.method2037(-11048) < ~var9) {
                  do {
                     class390 var10 = super.field240.method2043(-13, var9);
                     if (var10 != null) {
                        this.field3337.initTextureMetrics(var9, var10.field5679, var10.field5677);
                     }

                     ++var9;
                  } while(~super.field240.method2037(-11048) < ~var9);

               }
            }
         } catch (Throwable var13) {
            var13.printStackTrace();
            this.method181(true);
            throw new RuntimeException("");
         }
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field3526[156] + (arg0 != null ? field3526[6] : field3526[8]) + ',' + (arg1 != null ? field3526[6] : field3526[8]) + ',' + (arg2 != null ? field3526[6] : field3526[8]) + ',' + (arg3 != null ? field3526[6] : field3526[8]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(IZLhj;I)V"
   )
   public abstract void method1276(int arg0, boolean arg1, class670 arg2, int arg3);

   @OriginalMember(
      owner = "client!daa",
      name = "f",
      descriptor = "(Z)V"
   )
   private final void method1944(boolean arg0) {
      try {
         if (class559.field7935 != this.field3495) {
            class506 var2 = this.field3495;
            this.field3495 = class559.field7935;
            if (!var2.method3812((byte)-77)) {
               this.method1969((byte)-122);
            }

            this.method1995((byte)122);
            this.field3490 = this.field3407;
            this.method2004(5535);
            this.field3426 &= -8;
         }

         if (arg0) {
            this.method230();
         }

         ++field3228;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3526[65] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "E",
      descriptor = "()I"
   )
   public final int method161() {
      try {
         ++field3236;
         return this.field3393 + this.field3391 - -this.field3395;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3526[53] + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(BLgq;Lgq;)V"
   )
   public final void method1945(byte arg0, class200 arg1, class200 arg2) {
      try {
         ++field3309;
         if (arg0 != -86) {
            this.field3400 = null;
         }

         boolean var4 = false;
         if (this.field3496[this.field3434] != arg2) {
            this.field3496[this.field3434] = arg2;
            var4 = true;
            this.method1237(true);
         }

         if (this.field3403[this.field3434] != arg1) {
            this.field3403[this.field3434] = arg1;
            var4 = true;
            this.method1292(1);
         }

         if (var4) {
            this.field3426 &= -30;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3526[55] + arg0 + ',' + (arg1 != null ? field3526[6] : field3526[8]) + ',' + (arg2 != null ? field3526[6] : field3526[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "t",
      descriptor = "()Z"
   )
   public final boolean method243() {
      try {
         ++field3201;
         return true;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3526[170] + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "u",
      descriptor = "(I)I"
   )
   public final int method1946(int arg0) {
      try {
         ++field3273;
         return arg0 != -1 ? 37 : this.field3487;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[91] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "z",
      descriptor = "()Z"
   )
   public final boolean method190() {
      try {
         ++field3372;
         return true;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3526[116] + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "F",
      descriptor = "(I)Ltu;"
   )
   public final class522 method1947(int arg0) {
      try {
         ++field3218;
         return arg0 >= -67 ? null : this.field3399;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[131] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method148(Canvas arg0, int arg1, int arg2) {
      try {
         ++field3324;
         Object var4 = null;
         if (arg0 != null && this.field3279 != arg0) {
            if (this.field3363.containsKey(arg0)) {
               var4 = this.field3363.get(arg0);
            }
         } else {
            var4 = this.field3220;
         }

         if (var4 == null) {
            throw new RuntimeException();
         } else {
            this.method1241(4268, var4, arg0);
            if (this.field3382 == arg0) {
               this.method1990(true);
            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3526[168] + (arg0 != null ? field3526[6] : field3526[8]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "O",
      descriptor = "(I)V"
   )
   public static void method1948(int arg0) {
      try {
         if (arg0 != 31370) {
            field3299 = null;
         }

         field3299 = null;
         field3216 = null;
         field3244 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3526[107] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "d",
      descriptor = "()Z"
   )
   public final boolean method260() {
      try {
         ++field3340;
         return false;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3526[54] + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "b",
      descriptor = "()Z"
   )
   public final boolean method168() {
      try {
         ++field3294;
         return false;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3526[153] + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "JA",
      descriptor = "(IIIIII)I"
   )
   public final int method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var7 = client.field10022;

      try {
         ++field3333;
         int var8 = 0;
         float var9 = (float)arg2 * this.field3396.field7388 + (float)arg0 * this.field3396.field7376 + (float)arg1 * this.field3396.field7339 + this.field3396.field7352;
         if (var9 < 1.0F) {
            var9 = 1.0F;
         }

         float var10 = (float)arg5 * this.field3396.field7388 + (float)arg3 * this.field3396.field7376 + (float)arg4 * this.field3396.field7339 + this.field3396.field7352;
         if (var10 < 1.0F) {
            var10 = 1.0F;
         }

         label83: {
            if (!((float)this.field3494 > var9) || !(var10 < (float)this.field3494)) {
               if (!((float)this.field3447 < var9) || !(var10 > (float)this.field3447)) {
                  break label83;
               }

               var8 |= 32;
               if (!var7) {
                  break label83;
               }
            }

            var8 |= 16;
         }

         label59: {
            int var11 = (int)(((float)arg2 * this.field3396.field7384 + (float)arg0 * this.field3396.field7350 + (float)arg1 * this.field3396.field7391 + this.field3396.field7377) * (float)this.field3412 / var9);
            int var12 = (int)(((float)arg5 * this.field3396.field7384 + (float)arg3 * this.field3396.field7350 + (float)arg4 * this.field3396.field7391 + this.field3396.field7377) * (float)this.field3412 / var10);
            if ((float)var11 < this.field3485 && this.field3485 > (float)var12) {
               var8 |= 1;
               if (!var7) {
                  break label59;
               }
            }

            if ((float)var11 > this.field3436 && (float)var12 > this.field3436) {
               var8 |= 2;
            }
         }

         int var13 = (int)(((float)arg2 * this.field3396.field7363 + (float)arg0 * this.field3396.field7344 + (float)arg1 * this.field3396.field7338 + this.field3396.field7356) * (float)this.field3449 / var9);
         int var14 = (int)(((float)arg5 * this.field3396.field7363 + (float)arg3 * this.field3396.field7344 + (float)arg4 * this.field3396.field7338 + this.field3396.field7356) * (float)this.field3449 / var10);
         if (!((float)var13 < this.field3459) || !(this.field3459 > (float)var14)) {
            if (!((float)var13 > this.field3453) || !((float)var14 > this.field3453)) {
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
         throw class612.method4503(var16, field3526[18] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "f",
      descriptor = "(II)V"
   )
   public final void method238(int arg0, int arg1) {
      try {
         if (this.field3494 != arg0 || this.field3447 != arg1) {
            this.field3447 = arg1;
            this.field3494 = arg0;
            this.method1965((byte)97);
            this.method1974((byte)-106);
            this.method1968(-1);
         }

         ++field3217;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3526[157] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "I",
      descriptor = "(I)V"
   )
   public abstract void method1292(int arg0);

   @OriginalMember(
      owner = "client!daa",
      name = "i",
      descriptor = "(B)V"
   )
   public void method1233(byte arg0) {
      try {
         if (arg0 <= 93) {
            this.method170((class440)null, (class433[])null, false);
         }

         ++field3331;
         this.field3410 = this.field3445;
         this.field3445 = 0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[37] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method146(Canvas arg0, int arg1, int arg2) {
      try {
         ++field3374;
         if (this.field3279 == arg0) {
            throw new RuntimeException();
         } else if (!this.field3363.containsKey(arg0)) {
            if (!arg0.isShowing()) {
               throw new RuntimeException();
            } else {
               try {
                  Class var4 = Class.forName(field3526[149]);
                  Method var5 = var4.getMethod(field3526[151], Boolean.TYPE);
                  var5.invoke(arg0, Boolean.TRUE);
               } catch (Exception var8) {
               }

               Object var6 = this.method1260((byte)102, arg0);
               if (var6 == null) {
                  throw new RuntimeException();
               } else {
                  this.field3363.put(arg0, var6);
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field3526[150] + (arg0 != null ? field3526[6] : field3526[8]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "l",
      descriptor = "(Z)V"
   )
   public abstract void method1237(boolean arg0);

   @OriginalMember(
      owner = "client!daa",
      name = "i",
      descriptor = "(I)V"
   )
   public final void method174(int arg0) {
      try {
         ++field3239;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[77] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "XA",
      descriptor = "()I"
   )
   public final int method212() {
      try {
         ++field3377;
         return this.field3447;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3526[83] + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "M",
      descriptor = "()I"
   )
   public final int method149() {
      try {
         ++field3258;
         return this.field3524;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3526[95] + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "B",
      descriptor = "()Z"
   )
   public final boolean method180() {
      try {
         ++field3341;
         return this.field3477[3].method86(15385);
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3526[75] + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "r",
      descriptor = "()Z"
   )
   public final boolean method200() {
      try {
         ++field3319;
         return true;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3526[111] + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "b",
      descriptor = "(II)I"
   )
   public final int method246(int arg0, int arg1) {
      try {
         ++field3256;
         return arg0 | arg1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3526[126] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(I[[IIZ)Lcca;"
   )
   public abstract class293 method1269(int arg0, int[][] arg1, int arg2, boolean arg3);

   @OriginalMember(
      owner = "client!daa",
      name = "o",
      descriptor = "(B)V"
   )
   private final void method1949(byte arg0) {
      try {
         this.field3472 = (float)this.field3447;
         ++field3253;
         if (arg0 != -100) {
            this.method161();
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[106] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "c",
      descriptor = "(ZI)V"
   )
   public final void method1950(boolean arg0, int arg1) {
      try {
         ++field3241;
         if (arg1 >= -84) {
            this.field3429 = 1.1294471F;
         }

         if (!this.field3458 == arg0) {
            this.field3458 = arg0;
            this.method1257((byte)-52);
            this.field3426 &= -32;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3526[46] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "EA",
      descriptor = "(IIII)V"
   )
   public final void method250(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field3318;
         if (!this.field3404) {
            throw new RuntimeException("");
         } else {
            this.field3428 = arg3;
            this.field3487 = arg0;
            this.field3482 = arg2;
            this.field3402 = arg1;
            if (this.field3431) {
               this.field3477[3].method3480(0);
               this.field3477[3].method3467((byte)-84);
            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3526[57] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "j",
      descriptor = "(I)Lza;"
   )
   public final class348 method167(int arg0) {
      try {
         ++field3221;
         class481 var2 = new class481(arg0);
         this.field3306.method2238(var2, 13);
         return var2;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3526[93] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "q",
      descriptor = "(I)V"
   )
   public final void method1951(int arg0) {
      try {
         ++field3202;
         if (this.field3426 != 4) {
            this.method1967(-122);
            this.method1935(false, -48);
            this.method1971(-124, false);
            this.method1950(false, -125);
            this.method1960(false, (byte)103);
            this.method2010(false, 3, -2, false);
            this.method1962((byte)108, 1);
            this.method1966(0, -5);
            this.field3426 = 4;
         }

         if (arg0 != 9822) {
            this.field3408 = 0;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[169] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V"
   )
   public final void method162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      try {
         ++field3320;
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field3526[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;"
   )
   public abstract Object method1260(byte arg0, Canvas arg1);

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(BLjaclib/memory/Buffer;)Ljaclib/memory/Stream;"
   )
   public final Stream method1952(byte arg0, Buffer arg1) {
      try {
         ++field3360;
         this.field3470.method3188(arg1);
         int var3 = -83 / ((arg0 - -20) / 43);
         return this.field3470;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3526[21] + arg0 + ',' + (arg1 != null ? field3526[6] : field3526[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method239(int[] arg0) {
      try {
         ++field3283;
         arg0[1] = this.field3295;
         arg0[0] = this.field3321;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[161] + (arg0 != null ? field3526[6] : field3526[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(ILhj;IZZ)V"
   )
   public abstract void method1239(int arg0, class670 arg1, int arg2, boolean arg3, boolean arg4);

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(Lns;)V"
   )
   public final void method166(class382 arg0) {
      try {
         this.field3416 = (class454)arg0;
         ++field3376;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[64] + (arg0 != null ? field3526[6] : field3526[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "m",
      descriptor = "()Lgga;"
   )
   public final class502 method254() {
      try {
         ++field3302;
         return this.field3508;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3526[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(ILsr;Lob;)Z"
   )
   public abstract boolean method1229(int arg0, class78 arg1, class779 arg2);

   @OriginalMember(
      owner = "client!daa",
      name = "i",
      descriptor = "()I"
   )
   public final int method141() {
      try {
         ++field3227;
         return this.field3494;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3526[33] + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "za",
      descriptor = "(IIIII)V"
   )
   public final void method179(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field3288;
         this.method1975(-2);
         this.method1939(arg3, (byte)-60);
         this.method2009(0, 0, class172.field2572);
         this.method1937(class172.field2572, 0, 0);
         this.method1962((byte)108, arg4);
         this.field3392.method3905((float)arg2, (float)arg2, (byte)89, 1.0F);
         this.field3392.method327(arg0, arg1, 0);
         this.method2000(false);
         this.method1252(8, false);
         this.method1254(0, this.field3517, 4);
         this.method1263(this.field3519, 56);
         this.method1249(0, 0, 256, class40.field606);
         this.method1252(8, true);
         this.method1937(class339.field5001, 0, 0);
         this.method2009(0, 0, class339.field5001);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field3526[136] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "c",
      descriptor = "(IIIIII)V"
   )
   public final void method196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         float var7;
         float var8;
         label22: {
            ++field3359;
            var7 = (float)(-arg0) + (float)arg2;
            var8 = (float)(-arg1) + (float)arg3;
            if (var7 == 0.0F && var8 == 0.0F) {
               var7 = 1.0F;
               if (!client.field10022) {
                  break label22;
               }
            }

            float var9 = (float)(1.0D / Math.sqrt((double)(var7 * var7 + var8 * var8)));
            var8 *= var9;
            var7 *= var9;
         }

         if (this.method2011((byte)30, (float)arg3 + var8, (float)arg0, 0.0F, (float)arg2 + var7, (float)arg1, 0.0F)) {
            this.method1975(-2);
            this.method1939(arg4, (byte)-60);
            this.method2009(0, 0, class172.field2572);
            this.method1937(class172.field2572, 0, 0);
            this.method1962((byte)108, arg5);
            this.method1957((byte)78);
            this.method1252(8, false);
            this.method1976(-30438);
            this.method1252(8, true);
            this.method1937(class339.field5001, 0, 0);
            this.method2009(0, 0, class339.field5001);
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field3526[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V"
   )
   public final void method244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class684 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      try {
         ++field3280;
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field3526[124] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field3526[6] : field3526[8]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "K",
      descriptor = "(I)V"
   )
   public abstract void method1261(int arg0);

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V"
   )
   public abstract void method1241(int arg0, Object arg1, Canvas arg2);

   @OriginalMember(
      owner = "client!daa",
      name = "k",
      descriptor = "(II)V"
   )
   public final void method1953(int arg0, int arg1) {
      try {
         ++field3310;
         if (~this.field3434 != ~arg1) {
            this.field3434 = arg1;
            this.method1227(Integer.MAX_VALUE);
         }

         int var3 = -42 / ((48 - arg0) / 47);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3526[128] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "B",
      descriptor = "(I)V"
   )
   private final void method1954(int arg0) {
      try {
         if (arg0 > -13) {
            this.method1284(-100, -94);
         }

         this.field3505 = this.method1286(false, true);
         ++field3307;
         this.field3505.method351((byte)38, 24, 12);
         this.field3509 = this.method1290(89, new class446[]{new class446(class586.field8209)});
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[32] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "ab",
      descriptor = "(I)V"
   )
   public void method1268(int arg0) {
      try {
         ++field3351;
         if (arg0 != 1) {
            this.field3452 = -89;
         }

         this.method2012((byte)-87);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[71] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "w",
      descriptor = "(I)V"
   )
   public final void method1955(int arg0) {
      try {
         if (arg0 == 1) {
            if (this.field3426 != 8) {
               this.method1963(false);
               this.method1935(true, -33);
               this.method1950(true, -96);
               this.method1960(true, (byte)103);
               this.method1962((byte)108, 1);
               this.field3426 = 8;
            }

            ++field3353;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[59] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "G",
      descriptor = "(I)Ltu;"
   )
   public final class522 method1956(int arg0) {
      try {
         ++field3298;
         if (arg0 != 28194) {
            this.field3443 = null;
         }

         return this.field3491[this.field3434];
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[102] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method1957(byte arg0) {
      try {
         ++field3339;
         if (arg0 >= 43) {
            this.field3392.method335();
            this.field3394 = true;
            this.method1961((byte)-36);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[108] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(Luv;)V"
   )
   public final void method194(class521 arg0) {
      try {
         ++field3254;
         this.field3475.method1639(true, this, -1, arg0);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[47] + (arg0 != null ? field3526[6] : field3526[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(Lpl;B)V"
   )
   public abstract void method1259(class168 arg0, byte arg1);

   @OriginalMember(
      owner = "client!daa",
      name = "y",
      descriptor = "()Lgga;"
   )
   public final class502 method183() {
      try {
         ++field3342;
         return new class522();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3526[17] + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "W",
      descriptor = "(I)V"
   )
   public final void method1958(int arg0) {
      try {
         if (arg0 != 0) {
            this.method254();
         }

         ++field3323;
         if (this.field3469[this.field3434] != class349.field5123) {
            this.field3469[this.field3434] = class349.field5123;
            this.field3491[this.field3434].method335();
            this.method1964(-1);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[127] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(Leca;IIII)Lka;"
   )
   public final class761 method240(class590 arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field3286;
         return new class599(this, arg0, arg1, arg3, arg4, arg2);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field3526[40] + (arg0 != null ? field3526[6] : field3526[8]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1959(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != -6007) {
            field3299 = null;
         }

         ++field3246;
         return ~(arg1 & 2048) != -1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3526[105] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "ra",
      descriptor = "(IIII)V"
   )
   public final void method232(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field3487 = arg0;
         ++field3238;
         this.field3482 = arg2;
         this.field3404 = true;
         this.field3428 = arg3;
         this.field3402 = arg1;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3526[118] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method1960(boolean arg0, byte arg1) {
      try {
         if (arg1 != 103) {
            this.field3497 = -63;
         }

         if (this.field3501 != arg0) {
            this.field3501 = arg0;
            this.method1238((byte)101);
            this.field3426 &= -32;
         }

         ++field3369;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3526[63] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "KA",
      descriptor = "(IIII)V"
   )
   public final void method150(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field3357;
         if (arg0 <= 0 && this.field3321 + -1 <= arg2 && arg1 <= 0 && arg3 >= this.field3295 - 1) {
            this.method231();
         } else {
            this.field3464 = ~arg1 > -1 ? 0 : arg1;
            this.field3481 = arg2 > this.field3321 ? 0 : arg2;
            this.field3425 = ~this.field3321 <= ~arg3 ? arg3 : 0;
            this.field3466 = ~arg0 <= -1 ? arg0 : 0;
            if (!this.field3525) {
               this.field3525 = true;
               this.method1246((byte)85);
            }

            this.method1231((byte)26);
            this.method2013((byte)-107);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3526[165] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "g",
      descriptor = "(B)V"
   )
   private final void method1961(byte arg0) {
      try {
         ++field3269;
         if (class356.field5271 == this.field3495) {
            float var2 = this.method1235(arg0 + 161);
            this.field3392.method3900(0.0F, -8241, var2, var2);
         }

         this.field3423 = false;
         this.method1253(0);
         if (this.field3489 != null) {
            this.field3489.method3466(24515);
         }

         if (arg0 != -36) {
            this.field3516 = null;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3526[101] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         ++field3261;
         float var8 = (float)arg2 - (float)arg0;
         float var9 = (float)(-arg1) + (float)arg3;
         float var10 = 0.0F;
         float var11 = 1.0F;
         if (var8 != 0.0F || var9 != 0.0F) {
            var11 = (float)Math.sqrt((double)(var8 * var8 + var9 * var9));
            var10 = (float)Math.atan2((double)var9, (double)var8);
         }

         this.method1975(-2);
         this.method1939(arg4, (byte)-60);
         this.method2009(0, 0, class172.field2572);
         this.method1937(class172.field2572, 0, 0);
         this.method1962((byte)108, arg6);
         this.field3392.method3905(var11, (float)arg5, (byte)99, 1.0F);
         this.field3392.method327(0, -arg5 / 2, 0);
         this.field3392.method337((int)((double)var10 * 2607.5945876176133D) & 16383);
         this.field3392.method327(arg0, arg1, 0);
         this.method2000(false);
         this.method1252(8, false);
         this.method2014((byte)114);
         this.method1252(8, true);
         this.method1937(class339.field5001, 0, 0);
         this.method2009(0, 0, class339.field5001);
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field3526[123] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "S",
      descriptor = "(I)F"
   )
   public abstract float method1235(int arg0);

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method214(int arg0, int arg1) {
      try {
         ++field3242;
         return arg1 ^ arg0 & arg1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3526[96] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "d",
      descriptor = "(BI)V"
   )
   public final void method1962(byte arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         if (this.field3430 != arg1) {
            boolean var4;
            boolean var5;
            class801 var6;
            label55: {
               if (~arg1 == -2) {
                  var4 = true;
                  var5 = true;
                  var6 = class283.field4272;
                  if (!var3) {
                     break label55;
                  }
               }

               if (arg1 == 2) {
                  var4 = false;
                  var5 = true;
                  var6 = class8.field144;
                  if (!var3) {
                     break label55;
                  }
               }

               if (~arg1 == -129) {
                  var4 = true;
                  var6 = class51.field760;
                  var5 = true;
                  if (!var3) {
                     break label55;
                  }
               }

               var5 = false;
               var6 = class327.field4856;
               var4 = false;
            }

            if (this.field3454 != var4) {
               this.field3454 = var4;
               this.method1274(0);
            }

            if (this.field3461 != var5) {
               this.field3461 = var5;
               this.method1287(false);
            }

            if (this.field3443 != var6) {
               this.field3443 = var6;
               this.method1256(arg0 + -107);
            }

            this.field3430 = arg1;
            this.field3426 &= -29;
         }

         if (arg0 != 108) {
            this.field3416 = null;
         }

         ++field3245;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field3526[154] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "xa",
      descriptor = "(F)V"
   )
   public final void method197(float arg0) {
      try {
         if (this.field3492 != arg0) {
            this.field3492 = arg0;
            this.field3337.setAmbient(arg0);
            this.method1267((byte)-110);
            this.method1232(-2);
         }

         ++field3328;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[166] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "d",
      descriptor = "(IIIIII)V"
   )
   public final void method257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field3226;
         float var7 = this.method1235(-80);
         this.method1975(-2);
         this.method1939(arg4, (byte)-60);
         this.method2009(0, 0, class172.field2572);
         this.method1937(class172.field2572, 0, 0);
         this.method1962((byte)108, arg5);
         this.field3392.method3905((float)(arg2 + -1), (float)(arg3 + -1), (byte)69, 1.0F);
         this.field3392.method3900(0.0F, -8241, (float)arg1 - var7, (float)arg0 - var7);
         this.method2000(false);
         this.method1252(8, false);
         this.method1991(4, class268.field4103, 97);
         this.method1252(8, true);
         this.method1937(class339.field5001, 0, 0);
         this.method2009(0, 0, class339.field5001);
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field3526[41] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "Q",
      descriptor = "(IIIIII[BII)V"
   )
   public final void method258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
      try {
         ++field3296;
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field3526[141] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field3526[6] : field3526[8]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "k",
      descriptor = "(Z)V"
   )
   private final void method1963(boolean arg0) {
      try {
         if (class231.field3595 != this.field3495) {
            class506 var2 = this.field3495;
            this.field3495 = class231.field3595;
            if (!var2.method3812((byte)-91)) {
               this.method1969((byte)-114);
            }

            this.method1986(100);
            this.field3490 = this.field3483;
            this.method2004(5535);
            this.field3426 &= -8;
         }

         ++field3224;
         if (arg0) {
            this.field3397 = null;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3526[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method263(int arg0) {
      try {
         ++field3347;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[104] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "z",
      descriptor = "(I)V"
   )
   private final void method1964(int arg0) {
      try {
         ++field3345;
         this.method1291(true);
         if (arg0 == -1) {
            if (this.field3489 != null) {
               this.field3489.method3465((byte)-15);
            }
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[70] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "q",
      descriptor = "(B)V"
   )
   private final void method1965(byte arg0) {
      try {
         if (arg0 <= 87) {
            this.method162(21, 28, -25, -31, -4, -60, 51, 42, -9, 71, 37, 8, -39);
         }

         ++field3356;
         this.field3474 = false;
         this.method1986(126);
         if (class231.field3595 == this.field3495) {
            this.method2004(5535);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[145] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "j",
      descriptor = "(II)V"
   )
   public final void method1966(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         label52: {
            ++field3272;
            if (~arg0 == -2) {
               this.method1945((byte)-86, class74.field1189, class74.field1189);
               if (!var3) {
                  break label52;
               }
            }

            if (~arg0 != -1) {
               if (arg0 != 2) {
                  if (~arg0 == -4) {
                     this.method1945((byte)-86, class561.field7986, class717.field10280);
                     if (!var3) {
                        break label52;
                     }
                  }

                  if (~arg0 != -5) {
                     break label52;
                  }

                  this.method1945((byte)-86, class504.field7180, class504.field7180);
                  if (!var3) {
                     break label52;
                  }
               }

               this.method1945((byte)-86, class74.field1189, class117.field1846);
               if (!var3) {
                  break label52;
               }
            }

            this.method1945((byte)-86, class561.field7986, class561.field7986);
         }

         if (arg1 != -5) {
            this.field3279 = null;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3526[134] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(Lgga;)V"
   )
   public final void method255(class502 arg0) {
      try {
         this.field3396 = (class522)arg0;
         ++field3329;
         this.field3398.method323(this.field3396);
         this.field3398.method3894(false);
         this.field3399.method3899(16383, this.field3398);
         this.field3397.method3899(16383, this.field3396);
         if (this.field3495.method3812((byte)58)) {
            this.method1969((byte)-44);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[76] + (arg0 != null ? field3526[6] : field3526[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(IIIIIILaa;II)V"
   )
   public final void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class684 arg6, int arg7, int arg8) {
      try {
         ++field3334;
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field3526[125] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field3526[6] : field3526[8]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(B)V"
   )
   public abstract void method1238(byte arg0);

   @OriginalMember(
      owner = "client!daa",
      name = "l",
      descriptor = "(I)V"
   )
   private final void method1967(int arg0) {
      try {
         if (arg0 > -119) {
            this.method242();
         }

         if (class356.field5271 != this.field3495) {
            class506 var2 = this.field3495;
            this.field3495 = class356.field5271;
            if (var2.method3812((byte)-75)) {
               this.method1969((byte)-74);
            }

            this.method1942((byte)-119);
            this.field3490 = this.field3421;
            this.method2004(5535);
            this.field3426 &= -25;
         }

         ++field3361;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3526[164] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public final void method213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      boolean var10 = client.field10022;

      try {
         float var12;
         float var14;
         label101: {
            ++field3209;
            float var11 = (float)arg2 - (float)arg0;
            var12 = (float)(-arg1) + (float)arg3;
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
            this.method1975(-2);
            this.method1939(arg4, (byte)-60);
            this.method2009(0, 0, class172.field2572);
            this.method1937(class172.field2572, 0, 0);
            this.method1962((byte)108, arg5);
            this.method1957((byte)70);
            this.method1252(8, false);
            int var27 = arg8 % (arg6 + arg7);
            var15 = (float)arg6 * var14;
            var16 = (float)arg6 * var12;
            var17 = 0.0F;
            var18 = 0.0F;
            var19 = var15;
            var20 = var16;
            if (~var27 < ~arg6) {
               var17 = (float)(arg6 + arg7 + -var27) * var14;
               var18 = (float)(arg6 + arg7 + -var27) * var12;
               if (!var10) {
                  break label83;
               }
            }

            var19 = (float)(-var27 + arg6) * var14;
            var20 = (float)(arg6 - var27) * var12;
         }

         float var21 = (float)arg0 + var17;
         float var22 = (float)arg1 + var18;
         float var23 = (float)arg7 * var14;
         float var24 = (float)arg7 * var12;

         do {
            label97: {
               int var10000;
               label74: {
                  if (arg0 >= arg2) {
                     float var28;
                     var10000 = (var28 = (float)arg2 - var21) == 0.0F ? 0 : (var28 < 0.0F ? -1 : 1);
                     if (var10) {
                        break label74;
                     }

                     if (var10000 > 0) {
                        break;
                     }

                     if (!((float)arg2 > var19 + var21)) {
                        break label97;
                     }

                     var19 = (float)arg2 - var21;
                     if (!var10) {
                        break label97;
                     }
                  }

                  float var29;
                  var10000 = (var29 = var21 - (float)arg2) == 0.0F ? 0 : (var29 < 0.0F ? -1 : 1);
               }

               if (var10000 > 0) {
                  break;
               }

               if ((float)arg2 < var19 + var21) {
                  var19 = (float)arg2 - var21;
               }
            }

            label99: {
               if (arg1 >= arg3) {
                  if (var22 < (float)arg3) {
                     break;
                  }

                  if (!((float)arg3 > var20 + var22)) {
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

               if (var20 + var22 > (float)arg3) {
                  var20 = (float)arg3 - var22;
               }
            }

            if (!this.method2011((byte)30, var20 + var22, var21, 0.0F, var19 + var21, var22, 0.0F)) {
               return;
            }

            this.method1976(-30438);
            var22 += var20 + var24;
            var21 += var19 + var23;
            var19 = var15;
            var20 = var16;
         } while(!var10);

         this.method1252(8, true);
         this.method1937(class339.field5001, 0, 0);
         this.method2009(0, 0, class339.field5001);
      } catch (RuntimeException var26) {
         throw class612.method4503(var26, field3526[163] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "T",
      descriptor = "(IIII)V"
   )
   public final void method209(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field3264;
         boolean var5 = false;
         if (arg0 > this.field3466) {
            var5 = true;
            this.field3466 = arg0;
         }

         if (arg2 < this.field3481) {
            var5 = true;
            this.field3481 = arg2;
         }

         if (this.field3464 < arg1) {
            var5 = true;
            this.field3464 = arg1;
         }

         if (~arg3 > ~this.field3425) {
            var5 = true;
            this.field3425 = arg3;
         }

         if (var5) {
            if (!this.field3525) {
               this.field3525 = true;
               this.method1246((byte)-46);
            }

            this.method1231((byte)26);
            this.method2013((byte)-115);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field3526[81] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "h",
      descriptor = "(II)V"
   )
   public abstract void method1284(int arg0, int arg1);

   @OriginalMember(
      owner = "client!daa",
      name = "Y",
      descriptor = "(I)V"
   )
   private final void method1968(int arg0) {
      try {
         ++field3229;
         if (this.field3489 != null) {
            this.field3489.method3467((byte)-84);
         }

         this.method1261(arg0 ^ arg0);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[176] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "v",
      descriptor = "(I)V"
   )
   public abstract void method1234(int arg0);

   @OriginalMember(
      owner = "client!daa",
      name = "y",
      descriptor = "(B)V"
   )
   private final void method1969(byte arg0) {
      try {
         ++field3231;
         if (arg0 >= -42) {
            this.method1252(49, false);
         }

         this.field3423 = false;
         if (this.field3489 != null) {
            this.field3489.method3468(false);
         }

         this.method1265((byte)119);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[85] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V"
   )
   public abstract void method1283(int arg0, Canvas arg1, Object arg2);

   @OriginalMember(
      owner = "client!daa",
      name = "r",
      descriptor = "(B)V"
   )
   public abstract void method1281(byte arg0);

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(IIIIIF)Lpha;"
   )
   public final class757 method220(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      try {
         ++field3275;
         return new class68(arg0, arg1, arg2, arg3, arg4, arg5);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field3526[86] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(Lza;)V"
   )
   public final void method189(class348 arg0) {
      try {
         ++field3235;
         this.field3250 = ((class481)arg0).field6909;
         this.field3354 = this.field3250.method3170(32768, false);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[16] + (arg0 != null ? field3526[6] : field3526[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "h",
      descriptor = "(B)I"
   )
   public final int method1970(byte arg0) {
      try {
         if (arg0 >= -43) {
            this.method1285(5);
         }

         ++field3303;
         return this.field3434;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "b",
      descriptor = "(IZ)V"
   )
   public final void method1971(int arg0, boolean arg1) {
      try {
         ++field3314;
         if (!this.field3432 != !arg1) {
            this.field3432 = arg1;
            this.method1266(2);
            this.field3426 &= -8;
         }

         int var3 = -16 / ((-37 - arg0) / 62);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3526[34] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "h",
      descriptor = "()Lgga;"
   )
   public final class502 method176() {
      try {
         ++field3375;
         return this.field3396;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3526[113] + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "e",
      descriptor = "()I"
   )
   public final int method203() {
      try {
         ++field3219;
         return this.field3465 + -2;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3526[143] + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "H",
      descriptor = "(III[I)V"
   )
   public final void method248(int arg0, int arg1, int arg2, int[] arg3) {
      try {
         float var5;
         int var6;
         int var7;
         label33: {
            ++field3390;
            var5 = this.field3396.method3915((float)arg2, (float)arg1, (float)arg0, (byte)90);
            if (var5 < -0.0078125F || var5 > 0.0078125F) {
               var6 = (int)((float)this.field3412 * this.field3396.method3912((float)arg0, 0, (float)arg2, (float)arg1) / var5);
               var7 = (int)((float)this.field3449 * this.field3396.method3908((byte)-108, (float)arg1, (float)arg0, (float)arg2) / var5);
               if (!client.field10022) {
                  break label33;
               }
            }

            var7 = this.field3478;
            var6 = this.field3408;
         }

         arg3[2] = (int)var5;
         arg3[1] = (int)((float)var7 - this.field3459);
         arg3[0] = (int)((float)var6 - this.field3485);
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field3526[152] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3526[6] : field3526[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "d",
      descriptor = "(I)Ltu;"
   )
   public final class522 method1972(int arg0) {
      try {
         int var2 = -68 % ((55 - arg0) / 59);
         if (!this.field3423) {
            this.field3400.method3898(this.field3398, this.field3392);
            this.field3423 = true;
         }

         ++field3203;
         return this.field3400;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3526[148] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "t",
      descriptor = "(B)V"
   )
   public abstract void method1257(byte arg0);

   @OriginalMember(
      owner = "client!daa",
      name = "g",
      descriptor = "(Z)V"
   )
   public abstract void method1287(boolean arg0);

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(IIILsr;Lob;)Lpga;"
   )
   public abstract class371 method1262(int arg0, int arg1, int arg2, class78 arg3, class779 arg4);

   @OriginalMember(
      owner = "client!daa",
      name = "N",
      descriptor = "(I)V"
   )
   public abstract void method1251(int arg0);

   @OriginalMember(
      owner = "client!daa",
      name = "u",
      descriptor = "()Z"
   )
   public final boolean method208() {
      try {
         ++field3240;
         return true;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3526[137] + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "J",
      descriptor = "(I)V"
   )
   private final void method1973(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field3378;
         this.field3521 = this.method1286(false, false);
         this.field3521.method351((byte)38, 140, 28);
         int var3 = arg0;
         class226 var10000;
         if (var2) {
            var10000 = this;
         } else if (~arg0 <= -5) {
            var10000 = this;
            if (!var2) {
               this.field3502 = this.method1290(110, new class446[]{new class446(new class586[]{class586.field8209, class586.field8220, class586.field8220})});
               return;
            }
         } else {
            var10000 = this;
         }

         do {
            while(true) {
               Buffer var4 = var10000.field3521.method353(true, (byte)122);
               if (var4 != null) {
                  Stream var5 = this.method1952((byte)-92, var4);
                  if (!Stream.method3185()) {
                     var5.method3179(0.0F);
                     var5.method3179(0.0F);
                     var5.method3179(0.0F);
                     var5.method3179(0.0F);
                     var5.method3179(0.0F);
                     var5.method3179(0.0F);
                     var5.method3179(0.0F);
                     var5.method3179(0.0F);
                     var5.method3179(1.0F);
                     var5.method3179(0.0F);
                     var5.method3179(0.0F);
                     var5.method3179(1.0F);
                     var5.method3179(0.0F);
                     var5.method3179(1.0F);
                     var5.method3179(1.0F);
                     var5.method3179(1.0F);
                     var5.method3179(0.0F);
                     var5.method3179(1.0F);
                     var5.method3179(1.0F);
                     var5.method3179(1.0F);
                     var5.method3179(1.0F);
                     var5.method3179(1.0F);
                     var5.method3179(0.0F);
                     var5.method3179(0.0F);
                     var5.method3179(1.0F);
                     var5.method3179(0.0F);
                     var5.method3179(1.0F);
                     var5.method3179(0.0F);
                     var5.method3179(0.0F);
                     var5.method3179(0.0F);
                     var5.method3179(0.0F);
                     var5.method3179(0.0F);
                     var5.method3179(0.0F);
                     var5.method3179(0.0F);
                     var5.method3179(0.0F);
                     if (var2) {
                        var5.method3186(0.0F);
                        var5.method3186(0.0F);
                        var5.method3186(0.0F);
                        var5.method3186(0.0F);
                        var5.method3186(0.0F);
                        var5.method3186(0.0F);
                        var5.method3186(0.0F);
                        var5.method3186(0.0F);
                        var5.method3186(1.0F);
                        var5.method3186(0.0F);
                        var5.method3186(0.0F);
                        var5.method3186(1.0F);
                        var5.method3186(0.0F);
                        var5.method3186(1.0F);
                        var5.method3186(1.0F);
                        var5.method3186(1.0F);
                        var5.method3186(0.0F);
                        var5.method3186(1.0F);
                        var5.method3186(1.0F);
                        var5.method3186(1.0F);
                        var5.method3186(1.0F);
                        var5.method3186(1.0F);
                        var5.method3186(0.0F);
                        var5.method3186(0.0F);
                        var5.method3186(1.0F);
                        var5.method3186(0.0F);
                        var5.method3186(1.0F);
                        var5.method3186(0.0F);
                        var5.method3186(0.0F);
                        var5.method3186(0.0F);
                        var5.method3186(0.0F);
                        var5.method3186(0.0F);
                        var5.method3186(0.0F);
                        var5.method3186(0.0F);
                        var5.method3186(0.0F);
                     }
                  } else {
                     var5.method3186(0.0F);
                     var5.method3186(0.0F);
                     var5.method3186(0.0F);
                     var5.method3186(0.0F);
                     var5.method3186(0.0F);
                     var5.method3186(0.0F);
                     var5.method3186(0.0F);
                     var5.method3186(0.0F);
                     var5.method3186(1.0F);
                     var5.method3186(0.0F);
                     var5.method3186(0.0F);
                     var5.method3186(1.0F);
                     var5.method3186(0.0F);
                     var5.method3186(1.0F);
                     var5.method3186(1.0F);
                     var5.method3186(1.0F);
                     var5.method3186(0.0F);
                     var5.method3186(1.0F);
                     var5.method3186(1.0F);
                     var5.method3186(1.0F);
                     var5.method3186(1.0F);
                     var5.method3186(1.0F);
                     var5.method3186(0.0F);
                     var5.method3186(0.0F);
                     var5.method3186(1.0F);
                     var5.method3186(0.0F);
                     var5.method3186(1.0F);
                     var5.method3186(0.0F);
                     var5.method3186(0.0F);
                     var5.method3186(0.0F);
                     var5.method3186(0.0F);
                     var5.method3186(0.0F);
                     var5.method3186(0.0F);
                     var5.method3186(0.0F);
                     var5.method3186(0.0F);
                  }

                  var5.method3187();
                  if (this.field3521.method352(arg0 + -2070)) {
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
                     this.field3502 = this.method1290(110, new class446[]{new class446(new class586[]{class586.field8209, class586.field8220, class586.field8220})});
                     return;
                  }
               } else {
                  var10000 = this;
               }
            }
         } while(var2);

         this.field3502 = this.method1290(110, new class446[]{new class446(new class586[]{class586.field8209, class586.field8220, class586.field8220})});
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field3526[139] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "c",
      descriptor = "(B)V"
   )
   private final void method1974(byte arg0) {
      try {
         this.field3419 = false;
         if (arg0 >= -6) {
            this.field3466 = -111;
         }

         ++field3278;
         this.method1995((byte)113);
         if (class559.field7935 == this.field3495) {
            this.method2004(5535);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "j",
      descriptor = "()Z"
   )
   public final boolean method242() {
      try {
         ++field3222;
         return true;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3526[175] + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "L",
      descriptor = "(III)V"
   )
   public final void method227(int arg0, int arg1, int arg2) {
      try {
         ++field3389;
         if (this.field3446 != arg0 || this.field3451 != arg1 || ~this.field3479 != ~arg2) {
            this.field3479 = arg2;
            this.field3451 = arg1;
            this.field3446 = arg0;
            this.method1968(-1);
            this.method1285(-32617);
         }

      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3526[160] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(Luv;I)V"
   )
   public final void method169(class521 arg0, int arg1) {
      try {
         this.field3475.method1639(true, this, arg1, arg0);
         ++field3330;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3526[44] + (arg0 != null ? field3526[6] : field3526[8]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;B)V"
   )
   public abstract void method1273(Canvas arg0, Object arg1, byte arg2);

   @OriginalMember(
      owner = "client!daa",
      name = "e",
      descriptor = "(ZI)Lida;"
   )
   public abstract class99 method1236(boolean arg0, int arg1);

   @OriginalMember(
      owner = "client!daa",
      name = "la",
      descriptor = "()V"
   )
   public final void method231() {
      try {
         this.field3466 = 0;
         ++field3379;
         this.field3464 = 0;
         this.field3481 = this.field3321;
         this.field3425 = this.field3295;
         if (this.field3525) {
            this.field3525 = false;
            this.method1246((byte)80);
         }

         this.method2013((byte)-91);
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3526[58] + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "R",
      descriptor = "(I)V"
   )
   public abstract void method1253(int arg0);

   @OriginalMember(
      owner = "client!daa",
      name = "l",
      descriptor = "(B)V"
   )
   public abstract void method1264(byte arg0);

   @OriginalMember(
      owner = "client!daa",
      name = "k",
      descriptor = "()Z"
   )
   public final boolean method188() {
      try {
         ++field3373;
         return this.field3457;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3526[61] + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "C",
      descriptor = "(Z)V"
   )
   public final void method262(boolean arg0) {
      try {
         ++field3277;
         this.field3418 = arg0;
         this.method1238((byte)77);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[98] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "Z",
      descriptor = "(I)V"
   )
   private final void method1975(int arg0) {
      try {
         if (this.field3426 != 1) {
            this.method1967(-127);
            this.method1935(false, 107);
            this.method1971(arg0 ^ 109, false);
            this.method1950(false, -124);
            this.method1960(false, (byte)103);
            this.method2010(false, 3, -2, false);
            this.method1966(1, -5);
            this.method1943(0, this.field3409);
            this.field3426 = 1;
         }

         ++field3268;
         if (arg0 != -2) {
            this.method1983(24);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(IIZ)Lma;"
   )
   public final class148 method247(int arg0, int arg1, boolean arg2) {
      try {
         ++field3207;
         return new class682(this, arg0, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3526[68] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "K",
      descriptor = "([I)V"
   )
   public final void method211(int[] arg0) {
      try {
         arg0[3] = this.field3425;
         arg0[0] = this.field3466;
         ++field3237;
         arg0[2] = this.field3481;
         arg0[1] = this.field3464;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[142] + (arg0 != null ? field3526[6] : field3526[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "w",
      descriptor = "()Z"
   )
   public final boolean method201() {
      try {
         ++field3248;
         return true;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3526[28] + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "u",
      descriptor = "(B)V"
   )
   public abstract void method1267(byte arg0);

   @OriginalMember(
      owner = "client!daa",
      name = "o",
      descriptor = "(I)V"
   )
   public abstract void method1227(int arg0);

   @OriginalMember(
      owner = "client!daa",
      name = "T",
      descriptor = "(I)V"
   )
   private final void method1976(int arg0) {
      try {
         this.method1254(0, this.field3505, 4);
         if (arg0 == -30438) {
            ++field3284;
            this.method1263(this.field3509, 46);
            this.method1249(arg0 + 30438, 0, 1, class598.field8416);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[115] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "Q",
      descriptor = "(I)V"
   )
   private final void method1977(int arg0) {
      try {
         ++field3365;
         this.field3405 = false;
         if (class356.field5271 == this.field3495) {
            this.method1942((byte)-119);
            this.method2004(5535);
         }

         int var2 = -26 % ((-68 - arg0) / 34);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3526[144] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "s",
      descriptor = "()V"
   )
   public void method229() {
      boolean var1 = client.field10022;

      try {
         if (!this.field3413) {
            class247 var2 = this.field3306.method2245((byte)-94);
            if (var1) {
               ((class481)var2).method3677((byte)-126);
               var2 = this.field3306.method2239((byte)105);
            }

            label44:
            while(true) {
               if (var2 == null) {
                  Enumeration var3 = this.field3363.keys();
                  if (!var1) {
                     Canvas var4;
                     if (var1) {
                        var4 = (Canvas)var3.nextElement();
                        this.method1283(58, var4, this.field3363.get(var4));
                     }

                     while(true) {
                        Object var10000;
                        if (!var3.hasMoreElements()) {
                           class130.method1327(false, true, 90);
                           this.field3337.release();
                           var10000 = this;
                           if (!var1) {
                              this.field3413 = true;
                              break label44;
                           }
                        } else {
                           var10000 = var3.nextElement();
                        }

                        var4 = (Canvas)var10000;
                        this.method1283(58, var4, this.field3363.get(var4));
                     }
                  }
               } else {
                  ((class481)var2).method3677((byte)-126);
               }

               var2 = this.field3306.method2239((byte)105);
            }
         }

         ++field3208;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3526[171] + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(I[Len;)Lrs;"
   )
   public abstract class297 method1290(int arg0, class446[] arg1);

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(IIIIII)Lns;"
   )
   public final class382 method143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field3204;
         return new class531(this, arg0, arg1, arg2, arg3, arg4, arg5);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field3526[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "H",
      descriptor = "(I)I"
   )
   public final int method1978(int arg0) {
      try {
         ++field3234;
         return arg0 != 20070 ? 97 : this.field3482;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "s",
      descriptor = "(B)V"
   )
   public final void method1979(byte arg0) {
      try {
         ++field3292;
         if (this.field3426 != 16) {
            this.method1944(false);
            this.method1935(true, 95);
            this.method1950(true, -121);
            this.method1960(true, (byte)103);
            this.method1962((byte)108, 1);
            this.field3426 = 16;
         }

         if (arg0 < 33) {
            this.field3473 = -55;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[84] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "n",
      descriptor = "(I)V"
   )
   public final void method1980(int arg0) {
      boolean var2 = client.field10022;

      try {
         int var3 = -22 % ((arg0 - 53) / 52);
         ++field3386;
         Hashtable var4 = new Hashtable();
         if (this.field3363 != null && !this.field3363.isEmpty()) {
            Enumeration var5 = this.field3363.keys();
            if (var2 || var5.hasMoreElements()) {
               do {
                  Canvas var6 = (Canvas)var5.nextElement();
                  var4.put(var6, this.method1260((byte)126, var6));
               } while(var5.hasMoreElements());
            }
         }

         this.field3363 = var4;
         this.method1973(0);
         this.method1954(-75);
         this.method1999((byte)96);
         this.field3475.method1633(this, -1);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field3526[146] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(Liaa;Z)Lma;"
   )
   public final class148 method187(class433 arg0, boolean arg1) {
      boolean var3 = client.field10022;

      try {
         class148 var4;
         label122: {
            ++field3388;
            if (arg0.field6361 == 0 || ~arg0.field6353 == -1) {
               var4 = this.method215(1, 1, new int[1], 1, 0, 1);
               if (!var3) {
                  break label122;
               }
            }

            int[] var5;
            label109: {
               var5 = new int[arg0.field6361 * arg0.field6353];
               int var6 = 0;
               int var7 = 0;
               if (arg0.field6356 == null) {
                  int var8 = 0;
                  if (var3 || var8 < arg0.field6353) {
                     do {
                        int var9 = 0;
                        if (var3 || var9 < arg0.field6361) {
                           do {
                              int var10 = arg0.field6357[255 & arg0.field6354[var6++]];
                              var5[var7++] = var10 == 0 ? 0 : class91.method932(-16777216, var10);
                              ++var9;
                           } while(var9 < arg0.field6361);
                        }

                        ++var8;
                     } while(var8 < arg0.field6353);
                  }

                  if (!var3) {
                     break label109;
                  }
               }

               int var11 = 0;
               if (var3 || arg0.field6353 > var11) {
                  do {
                     int var12 = 0;
                     if (var3) {
                        var5[var7++] = class91.method932(arg0.field6357[class697.method5101(255, arg0.field6354[var6])], arg0.field6356[var6] << 24);
                        ++var6;
                        ++var12;
                     }

                     while(true) {
                        while(~var12 > ~arg0.field6361) {
                           var5[var7++] = class91.method932(arg0.field6357[class697.method5101(255, arg0.field6354[var6])], arg0.field6356[var6] << 24);
                           ++var6;
                           ++var12;
                        }

                        if (!var3) {
                           ++var11;
                           break;
                        }

                        ++var12;
                     }
                  } while(arg0.field6353 > var11);
               }
            }

            var4 = this.method215(arg0.field6361, arg0.field6361, var5, arg0.field6353, 0, 1);
         }

         var4.method1343(arg0.field6355, arg0.field6358, arg0.field6360, arg0.field6359);
         return var4;
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field3526[67] + (arg0 != null ? field3526[6] : field3526[8]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "h",
      descriptor = "(I)V"
   )
   public final void method204(int arg0) {
      try {
         ++field3266;
         if (arg0 >= 128 && ~arg0 >= -1025) {
            if (this.field3424 != null) {
               this.field3424.method5287(-474);
            }

            this.field3439 = arg0;
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[62] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(Lsr;[FIIIZ)Lpga;"
   )
   public final class371 method1981(class78 arg0, float[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         if (arg3 != 4) {
            this.field3433 = -0.65506476F;
         }

         ++field3364;
         return this.method1255(arg2, 0, (byte)-13, 0, arg0, arg1, arg4, arg5);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field3526[89] + (arg0 != null ? field3526[6] : field3526[8]) + ',' + (arg1 != null ? field3526[6] : field3526[8]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "g",
      descriptor = "(II)Lida;"
   )
   public final class99 method1982(int arg0, int arg1) {
      try {
         if (~this.field3510.method350(arg1 + 92) > ~(arg0 * arg1)) {
            this.field3510.method981(arg0, (byte)117);
         }

         ++field3349;
         return this.field3510;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3526[72] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "w",
      descriptor = "(B)V"
   )
   public abstract void method1265(byte arg0);

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method164(boolean arg0) {
      try {
         ++field3282;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[48] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "L",
      descriptor = "(I)Ltu;"
   )
   public final class522 method1983(int arg0) {
      try {
         if (arg0 <= 89) {
            this.field3473 = 17;
         }

         ++field3313;
         return this.field3398;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[174] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "A",
      descriptor = "(ILaa;II)V"
   )
   public final void method173(int arg0, class684 arg1, int arg2, int arg3) {
      try {
         ++field3232;
         class49 var5 = (class49)arg1;
         class371 var6 = var5.field749;
         this.method2006(-2);
         this.method1943(0, var6);
         this.method1962((byte)108, 1);
         this.method1945((byte)-86, class74.field1189, class74.field1189);
         this.method2009(0, 0, class172.field2572);
         this.method1939(arg0, (byte)-60);
         this.field3392.method3905((float)this.field3321, (float)this.field3295, (byte)111, 0.0F);
         this.method2000(false);
         this.field3491[0].method3905(var6.method21((float)this.field3321, 11439), var6.method26((float)this.field3295, -22887), (byte)86, 1.0F);
         this.field3491[0].method3900(0.0F, -8241, var6.method26((float)(-arg3), -22887), var6.method21((float)(-arg2), 11439));
         this.field3469[0] = class183.field2686;
         this.method1964(-1);
         this.method2014((byte)114);
         this.method1958(0);
         this.method2009(0, 0, class339.field5001);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field3526[103] + arg0 + ',' + (arg1 != null ? field3526[6] : field3526[8]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "n",
      descriptor = "(B)V"
   )
   public final void method1984(byte arg0) {
      try {
         if (class230.field3584 != this.field3495) {
            class506 var2 = this.field3495;
            this.field3495 = class230.field3584;
            if (var2.method3812((byte)35)) {
               this.method1969((byte)-92);
            }

            this.field3426 &= -32;
            this.field3490 = this.field3468;
         }

         ++field3387;
         if (arg0 > -92) {
            this.method1954(57);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3526[133] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "j",
      descriptor = "(B)V"
   )
   public abstract void method1246(byte arg0);

   @OriginalMember(
      owner = "client!daa",
      name = "b",
      descriptor = "(BI)V"
   )
   public final void method1985(byte arg0, int arg1) {
      try {
         if (arg1 != 5) {
            this.method154(43, 1.8119932F, -0.604242F, 0.0034167566F, 1.3577497F, -1.6592407F);
         }

         this.method1939(arg0 << 8 | arg0 << 24 | arg0 << 16 | arg0, (byte)-60);
         ++field3385;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3526[117] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "t",
      descriptor = "(I)V"
   )
   private final void method1986(int arg0) {
      try {
         if (arg0 > 92) {
            if (!this.field3474) {
               label34: {
                  float[] var2 = this.field3483;
                  float var3 = (float)(-this.field3408 * this.field3494) / (float)this.field3412;
                  float var4 = (float)((-this.field3408 + this.field3321) * this.field3494) / (float)this.field3412;
                  float var5 = (float)(this.field3494 * this.field3478) / (float)this.field3449;
                  float var6 = (float)((-this.field3295 + this.field3478) * this.field3494) / (float)this.field3449;
                  if (var3 == var4 || var5 == var6) {
                     var2[2] = 0.0F;
                     var2[13] = 0.0F;
                     var2[3] = 0.0F;
                     var2[11] = 0.0F;
                     var2[5] = 1.0F;
                     var2[9] = 0.0F;
                     var2[14] = 0.0F;
                     var2[8] = 0.0F;
                     var2[10] = 1.0F;
                     var2[0] = 1.0F;
                     var2[6] = 0.0F;
                     var2[15] = 1.0F;
                     var2[1] = 0.0F;
                     var2[7] = 0.0F;
                     var2[12] = 0.0F;
                     var2[4] = 0.0F;
                     if (!client.field10022) {
                        break label34;
                     }
                  }

                  float var7 = (float)this.field3494 * 2.0F;
                  var2[1] = 0.0F;
                  var2[9] = (var5 + var6) / (var5 - var6);
                  var2[0] = var7 / (-var3 + var4);
                  var2[7] = 0.0F;
                  var2[2] = 0.0F;
                  var2[5] = var7 / (var5 - var6);
                  var2[13] = 0.0F;
                  var2[6] = 0.0F;
                  var2[4] = 0.0F;
                  var2[15] = 0.0F;
                  var2[14] = this.field3493 = (float)(this.field3494 * this.field3447) / (float)(-this.field3447 + this.field3494);
                  var2[11] = -1.0F;
                  var2[12] = 0.0F;
                  var2[10] = this.field3499 = (float)this.field3447 / (float)(-this.field3447 + this.field3494);
                  var2[3] = 0.0F;
                  var2[8] = (var3 + var4) / (var4 - var3);
               }

               this.method2001(0);
               this.field3474 = true;
            }

            ++field3257;
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field3526[155] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "U",
      descriptor = "(I)V"
   )
   public abstract void method1270(int arg0);

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(Lrs;I)V"
   )
   public abstract void method1263(class297 arg0, int arg1);

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(IIIIZ[BLsr;I)Lpga;"
   )
   public abstract class371 method1228(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5, class78 arg6, int arg7);

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(I[F)[F"
   )
   public final float[] method1987(int arg0, float[] arg1) {
      try {
         arg1[4] = this.field3490[1];
         arg1[0] = this.field3490[0];
         ++field3371;
         arg1[12] = this.field3490[3];
         arg1[8] = this.field3490[2];
         arg1[9] = this.field3490[6];
         arg1[1] = this.field3490[4];
         arg1[13] = this.field3490[7];
         arg1[2] = this.field3490[8];
         arg1[5] = this.field3490[5];
         if (arg0 >= -26) {
            return null;
         } else {
            arg1[14] = this.field3490[11];
            arg1[3] = this.field3490[12];
            arg1[7] = this.field3490[13];
            arg1[6] = this.field3490[9];
            arg1[10] = this.field3490[10];
            arg1[11] = this.field3490[14];
            arg1[15] = this.field3490[15];
            return arg1;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3526[50] + arg0 + ',' + (arg1 != null ? field3526[6] : field3526[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "c",
      descriptor = "(BI)Z"
   )
   public static final boolean method1988(byte arg0, int arg1) {
      try {
         ++field3305;
         if (arg0 >= -12) {
            return false;
         } else {
            return arg1 == 3 || arg1 == 49 || ~arg1 == -51 || arg1 == 22 || arg1 == 17 || ~arg1 == -10 || ~arg1 == -9;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "s",
      descriptor = "(I)V"
   )
   public final void method1989(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field3287;
         this.field3467 = new class683[this.field3455];
         this.field3496 = new class200[this.field3455];
         this.field3403 = new class200[this.field3455];
         this.field3469 = new class171[this.field3455];
         this.field3491 = new class522[this.field3455];
         int var3 = 0;
         if (var2) {
            this.field3403[var3] = class561.field7986;
            this.field3496[var3] = class561.field7986;
            this.field3469[var3] = class349.field5123;
            this.field3491[var3] = new class522();
            ++var3;
         }

         while(true) {
            while(this.field3455 > var3) {
               this.field3403[var3] = class561.field7986;
               this.field3496[var3] = class561.field7986;
               this.field3469[var3] = class349.field5123;
               this.field3491[var3] = new class522();
               ++var3;
            }

            this.field3440 = new class757[this.field3465 + -2];
            this.field3409 = this.method1262(1, -117, 1, class31.field438, class779.field11371);
            this.method189(new class481(262144));
            this.field3511 = this.method1290(91, new class446[]{new class446(new class586[]{class586.field8209, class586.field8220})});
            this.field3523 = this.method1290(74, new class446[]{new class446(new class586[]{class586.field8209, class586.field8218})});
            this.field3507 = this.method1290(95, new class446[]{new class446(class586.field8209), new class446(class586.field8218), new class446(class586.field8220), new class446(class586.field8216)});
            this.field3515 = this.method1290(arg0 + 95, new class446[]{new class446(class586.field8209), new class446(class586.field8218), new class446(class586.field8220)});
            this.field3503 = new class599(this, 0, 0, false, false);
            this.field3522 = new class599(this, 0, 0, true, true);
            this.field3514 = new class599(this, 0, 0, false, false);
            this.field3516 = new class599(this, 0, 0, true, true);
            this.field3506 = new class599(this, 0, 0, false, false);
            this.field3504 = new class599(this, 0, 0, true, true);
            this.field3520 = new class599(this, 0, 0, false, false);
            this.field3512 = new class599(this, 0, 0, true, true);
            this.field3518 = new class599(this, 0, 0, false, false);
            this.field3513 = new class599(this, 0, 0, true, true);
            this.field3475 = new class181(this);
            this.field3510 = this.method1236(true, arg0);
            this.method1980(-65);
            this.field3343 = new class497(this);
            this.field3477[1] = this.method1272(-27221, 1);
            this.field3477[2] = this.method1272(arg0 + -27221, 2);
            this.field3477[4] = this.method1272(arg0 + -27221, 4);
            this.field3477[5] = this.method1272(-27221, 5);
            this.field3477[6] = this.method1272(class607.method4473(arg0, -27221), 6);
            this.field3477[7] = this.method1272(-27221, 7);
            this.field3477[3] = this.method1272(-27221, 3);
            this.field3477[8] = this.method1272(-27221, 8);
            this.field3477[9] = this.method1272(-27221, 9);
            if (!var2) {
               if (!this.field3477[2].method86(15385)) {
                  this.field3477[2] = this.method1272(arg0 + -27221, 0);
               }

               if (!this.field3477[4].method86(15385)) {
                  this.field3477[4] = this.field3477[2];
               }

               if (!this.field3477[8].method86(arg0 ^ 15385)) {
                  this.field3477[8] = this.field3477[4];
               }

               if (!this.field3477[9].method86(15385)) {
                  this.field3477[9] = this.field3477[8];
               }

               this.method1268(1);
               this.method231();
               this.method171();
               return;
            }

            this.field3491[var3] = new class522();
            ++var3;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3526[159] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(Lsr;BI[BII)Laga;"
   )
   public abstract class145 method1248(class78 arg0, byte arg1, int arg2, byte[] arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!daa",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method158(Canvas arg0) {
      try {
         label45: {
            this.field3220 = null;
            this.field3382 = null;
            ++field3355;
            if (arg0 == null || this.field3279 == arg0) {
               this.field3220 = this.field3338;
               this.field3382 = this.field3279;
               if (!client.field10022) {
                  break label45;
               }
            }

            if (this.field3363.containsKey(arg0)) {
               this.field3220 = this.field3363.get(arg0);
               this.field3382 = arg0;
            }
         }

         if (this.field3382 != null && this.field3220 != null) {
            this.method1273(this.field3382, this.field3220, (byte)-83);
            this.method1990(true);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[51] + (arg0 != null ? field3526[6] : field3526[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "h",
      descriptor = "(Z)V"
   )
   private final void method1990(boolean arg0) {
      try {
         ++field3206;
         if (!arg0) {
            this.method2010(false, -24, -39, false);
         }

         label18: {
            if (this.field3382 != null) {
               Dimension var2 = this.field3382.getSize();
               this.field3344 = var2.height;
               this.field3281 = var2.width;
               if (!client.field10022) {
                  break label18;
               }
            }

            this.field3281 = this.field3344 = 1;
         }

         this.field3321 = this.field3281;
         this.field3295 = this.field3344;
         this.method1977(-106);
         this.method1965((byte)94);
         this.method1974((byte)-91);
         this.method1270(-98);
         this.method2013((byte)-100);
         this.method1984((byte)-112);
         this.method231();
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3526[52] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "i",
      descriptor = "(Z)V"
   )
   public abstract void method1291(boolean arg0);

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(ILvf;I)V"
   )
   private final void method1991(int arg0, class73 arg1, int arg2) {
      try {
         ++field3384;
         this.method1254(0, this.field3521, 4);
         this.method1263(this.field3502, 65);
         this.method1249(0, 0, arg0, arg1);
         int var4 = -38 / ((55 - arg2) / 37);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3526[132] + arg0 + ',' + (arg1 != null ? field3526[6] : field3526[8]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "da",
      descriptor = "(III[I)V"
   )
   public final void method221(int arg0, int arg1, int arg2, int[] arg3) {
      try {
         float var5;
         int var6;
         int var7;
         label33: {
            ++field3243;
            var5 = this.field3396.method3915((float)arg2, (float)arg1, (float)arg0, (byte)116);
            if (var5 < -0.0078125F || var5 > 0.0078125F) {
               var6 = (int)((float)this.field3412 * this.field3396.method3912((float)arg0, 0, (float)arg2, (float)arg1) / var5);
               var7 = (int)((float)this.field3449 * this.field3396.method3908((byte)-108, (float)arg1, (float)arg0, (float)arg2) / var5);
               if (!client.field10022) {
                  break label33;
               }
            }

            var6 = this.field3408;
            var7 = this.field3478;
         }

         arg3[0] = (int)((float)var6 + -this.field3485);
         arg3[1] = (int)((float)var7 - this.field3459);
         arg3[2] = (int)var5;
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field3526[35] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3526[6] : field3526[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "P",
      descriptor = "(IIIII)V"
   )
   public final void method145(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field3350;
         this.method196(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field3526[90] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "C",
      descriptor = "(I)V"
   )
   public abstract void method1256(int arg0);

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(Lsr;Lob;I)Z"
   )
   public abstract boolean method1278(class78 arg0, class779 arg1, int arg2);

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method153(Canvas arg0) {
      try {
         ++field3230;
         if (this.field3279 == arg0) {
            throw new RuntimeException();
         } else if (this.field3363.containsKey(arg0)) {
            this.method1283(117, arg0, this.field3363.get(arg0));
            this.field3363.remove(arg0);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[42] + (arg0 != null ? field3526[6] : field3526[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "p",
      descriptor = "(B)Ltu;"
   )
   public final class522 method1992(byte arg0) {
      try {
         ++field3265;
         int var2 = -31 / ((15 - arg0) / 60);
         return this.field3491[this.field3434];
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3526[26] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(BZZIII)V"
   )
   private final void method1993(byte arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5) {
      try {
         boolean var9 = arg2 & this.method180();
         if (arg0 > -31) {
            this.method1265((byte)-76);
         }

         ++field3247;
         if (!var9 && (arg3 == 4 || ~arg3 == -9 || ~arg3 == -10)) {
            arg3 = 2;
            arg5 = arg3 != 4 ? 1 : arg4 & 1;
            arg4 = 0;
         }

         if (arg3 != 0 && arg1) {
            arg3 |= Integer.MIN_VALUE;
         }

         if (~this.field3497 != ~arg3) {
            if (this.field3497 != 0) {
               this.field3477[Integer.MAX_VALUE & this.field3497].method85(false);
            }

            label51: {
               if (arg3 == 0) {
                  this.field3489 = null;
                  if (!client.field10022) {
                     break label51;
                  }
               }

               this.field3489 = this.field3477[arg3 & Integer.MAX_VALUE];
               this.field3489.method87(arg1, true);
               this.field3489.method82(arg1, (byte)23);
               this.field3489.method84(arg5, arg4, (byte)83);
            }

            this.field3497 = arg3;
            this.field3422 = arg5;
            this.field3463 = arg4;
         } else if (this.field3497 != 0) {
            this.field3477[Integer.MAX_VALUE & this.field3497].method82(arg1, (byte)23);
            if (~this.field3463 != ~arg4 || ~this.field3422 != ~arg5) {
               this.field3477[this.field3497 & Integer.MAX_VALUE].method84(arg5, arg4, (byte)125);
               this.field3422 = arg5;
               this.field3463 = arg4;
            }

         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field3526[122] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "M",
      descriptor = "(I)V"
   )
   public abstract void method1266(int arg0);

   @OriginalMember(
      owner = "client!daa",
      name = "A",
      descriptor = "(I)[F"
   )
   public final float[] method1994(int arg0) {
      try {
         if (arg0 != 355) {
            this.field3458 = false;
         }

         ++field3267;
         return this.field3468;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[39] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "v",
      descriptor = "(B)V"
   )
   private final void method1995(byte arg0) {
      try {
         if (!this.field3419) {
            label25: {
               float[] var2 = this.field3407;
               float var3 = (float)this.field3494;
               float var4 = (float)this.field3447;
               float var5 = (float)(-this.field3478) * this.field3460 / (float)this.field3449;
               float var6 = (float)(-this.field3408) * this.field3460 / (float)this.field3412;
               float var7 = (float)(this.field3321 - this.field3408) * this.field3460 / (float)this.field3412;
               float var8 = (float)(-this.field3478 + this.field3295) * this.field3460 / (float)this.field3449;
               if (var6 != var7 && var5 != var8) {
                  var2[3] = 0.0F;
                  var2[0] = 2.0F / (-var6 + var7);
                  var2[10] = 1.0F / (var3 - var4);
                  var2[13] = (var5 + var8) / (var8 - var5);
                  var2[5] = 2.0F / (-var5 + var8);
                  var2[1] = 0.0F;
                  var2[11] = 0.0F;
                  var2[4] = 0.0F;
                  var2[8] = 0.0F;
                  var2[9] = 0.0F;
                  var2[7] = 0.0F;
                  var2[15] = 1.0F;
                  var2[12] = (var6 + var7) / (var6 - var7);
                  var2[6] = 0.0F;
                  var2[14] = var3 / (-var4 + var3);
                  var2[2] = 0.0F;
                  if (!client.field10022) {
                     break label25;
                  }
               }

               var2[11] = 0.0F;
               var2[1] = 0.0F;
               var2[3] = 0.0F;
               var2[12] = 0.0F;
               var2[13] = 0.0F;
               var2[9] = 0.0F;
               var2[10] = 1.0F;
               var2[7] = 0.0F;
               var2[15] = 1.0F;
               var2[2] = 0.0F;
               var2[4] = 0.0F;
               var2[0] = 1.0F;
               var2[8] = 0.0F;
               var2[14] = 0.0F;
               var2[5] = 1.0F;
               var2[6] = 0.0F;
            }

            this.method1949((byte)-100);
            this.field3419 = true;
         }

         ++field3212;
         if (arg0 < 92) {
            this.method1236(true, 59);
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field3526[60] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "Y",
      descriptor = "()[I"
   )
   public final int[] method147() {
      try {
         ++field3252;
         return new int[]{this.field3408, this.field3478, this.field3412, this.field3449};
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3526[147] + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(BIZ)Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   public final NativeHeapBuffer method1996(byte arg0, int arg1, boolean arg2) {
      try {
         ++field3225;
         if (arg0 >= -7) {
            this.field3409 = null;
         }

         return this.field3250.method3170(arg1, arg2);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3526[138] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "([BLsr;IIIZ)Lpga;"
   )
   public final class371 method1997(byte[] arg0, class78 arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         ++field3367;
         return arg4 != 0 ? null : this.method1228(0, arg2, 0, arg3, arg5, arg0, arg1, 108);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field3526[45] + (arg0 != null ? field3526[6] : field3526[8]) + ',' + (arg1 != null ? field3526[6] : field3526[8]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(IZ)V"
   )
   public abstract void method1252(int arg0, boolean arg1);

   @OriginalMember(
      owner = "client!daa",
      name = "c",
      descriptor = "()Z"
   )
   public final boolean method230() {
      try {
         ++field3249;
         return true;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3526[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(IIIIZ)Lma;"
   )
   public final class148 method159(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         ++field3348;
         class682 var6 = new class682(this, arg2, arg3, arg4);
         var6.method1361(0, 0, arg2, arg3, arg0, arg1);
         return var6;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field3526[22] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(II[I[I)Laa;"
   )
   public final class684 method224(int arg0, int arg1, int[] arg2, int[] arg3) {
      try {
         ++field3301;
         return class634.method4637(arg0, this, arg3, arg2, (byte)-1, arg1);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3526[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3526[6] : field3526[8]) + ',' + (arg3 != null ? field3526[6] : field3526[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(Lwm;[Liaa;Z)Lda;"
   )
   public final class216 method170(class440 arg0, class433[] arg1, boolean arg2) {
      try {
         ++field3300;
         return new class485(this, arg0, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3526[172] + (arg0 != null ? field3526[6] : field3526[8]) + ',' + (arg1 != null ? field3526[6] : field3526[8]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "y",
      descriptor = "(I)V"
   )
   public final void method1998(int arg0) {
      try {
         ++field3223;
         if (arg0 != 9964) {
            this.field3337 = null;
         }

         this.method1984((byte)-118);
         this.method2004(arg0 + -4429);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[162] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "x",
      descriptor = "(I)V"
   )
   public abstract void method1232(int arg0);

   @OriginalMember(
      owner = "client!daa",
      name = "f",
      descriptor = "(B)V"
   )
   private final void method1999(byte arg0) {
      boolean var2 = client.field10022;

      try {
         this.field3517 = this.method1286(false, false);
         ++field3383;
         this.field3517.method351((byte)38, 3096, 12);
         if (arg0 == 96) {
            int var3 = 0;
            class226 var10000;
            if (var2) {
               var10000 = this;
            } else if (~var3 <= -5) {
               var10000 = this;
               if (!var2) {
                  this.field3519 = this.method1290(86, new class446[]{new class446(class586.field8209)});
                  return;
               }
            } else {
               var10000 = this;
            }

            do {
               while(true) {
                  Buffer var4 = var10000.field3517.method353(true, (byte)104);
                  if (var4 != null) {
                     Stream var5 = this.method1952((byte)-80, var4);
                     var5.method3186(0.0F);
                     var5.method3186(0.0F);
                     var5.method3186(0.0F);
                     int var6 = 0;
                     double var7;
                     float var9;
                     float var10;
                     if (var2) {
                        var7 = (double)(var6 * 2) * 3.141592653589793D / 256.0D;
                        var9 = (float)Math.cos(var7);
                        var10 = (float)Math.sin(var7);
                        if (!Stream.method3185()) {
                           var5.method3179(var10);
                           var5.method3179(var9);
                           var5.method3179(0.0F);
                           if (var2) {
                              var5.method3186(var10);
                              var5.method3186(var9);
                              var5.method3186(0.0F);
                              ++var6;
                           } else {
                              ++var6;
                           }
                        } else {
                           var5.method3186(var10);
                           var5.method3186(var9);
                           var5.method3186(0.0F);
                           ++var6;
                        }
                     }

                     while(var6 <= 256) {
                        var7 = (double)(var6 * 2) * 3.141592653589793D / 256.0D;
                        var9 = (float)Math.cos(var7);
                        var10 = (float)Math.sin(var7);
                        if (!Stream.method3185()) {
                           var5.method3179(var10);
                           var5.method3179(var9);
                           var5.method3179(0.0F);
                           if (var2) {
                              var5.method3186(var10);
                              var5.method3186(var9);
                              var5.method3186(0.0F);
                              ++var6;
                           } else {
                              ++var6;
                           }
                        } else {
                           var5.method3186(var10);
                           var5.method3186(var9);
                           var5.method3186(0.0F);
                           ++var6;
                        }
                     }

                     var5.method3187();
                     if (this.field3517.method352(arg0 + -2166)) {
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
                        this.field3519 = this.method1290(86, new class446[]{new class446(class586.field8209)});
                        return;
                     }
                  } else {
                     var10000 = this;
                  }
               }
            } while(var2);

            this.field3519 = this.method1290(86, new class446[]{new class446(class586.field8209)});
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field3526[135] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "e",
      descriptor = "(Z)V"
   )
   public final void method2000(boolean arg0) {
      try {
         this.field3394 = arg0;
         ++field3214;
         this.method1961((byte)-36);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[31] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "p",
      descriptor = "(I)V"
   )
   private final void method2001(int arg0) {
      try {
         this.field3483[14] = this.field3493;
         ++field3335;
         this.field3483[10] = this.field3499;
         if (arg0 != 0) {
            this.field3250 = null;
         }

         this.field3433 = (this.field3483[14] - (float)this.field3447) / this.field3483[10];
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[38] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method175(int arg0) {
      try {
         ++field3251;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[20] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "DA",
      descriptor = "(IIII)V"
   )
   public final void method256(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field3478 = arg1;
         this.field3412 = arg2;
         this.field3449 = arg3;
         this.field3408 = arg0;
         ++field3317;
         this.method1974((byte)-114);
         this.method1965((byte)112);
         this.method1984((byte)-128);
         this.method2013((byte)-114);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3526[114] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "E",
      descriptor = "(I)V"
   )
   public abstract void method1250(int arg0);

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(ILdca;I)V"
   )
   public abstract void method1254(int arg0, class581 arg1, int arg2);

   @OriginalMember(
      owner = "client!daa",
      name = "b",
      descriptor = "(ZI)V"
   )
   public final void method2002(boolean arg0, int arg1) {
      try {
         if (this.field3448 != arg0) {
            this.field3448 = arg0;
            this.method1266(2);
         }

         if (arg1 != -25791) {
            this.method2002(true, 72);
         }

         ++field3368;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3526[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "HA",
      descriptor = "(IIII[I)V"
   )
   public final void method241(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
      try {
         ++field3346;
         float var6 = this.field3396.method3915((float)arg2, (float)arg1, (float)arg0, (byte)111);
         if (!(var6 < (float)this.field3494) && !(var6 > (float)this.field3447)) {
            int var7 = (int)((float)this.field3412 * this.field3396.method3912((float)arg0, 0, (float)arg2, (float)arg1) / (float)arg3);
            int var8 = (int)((float)this.field3449 * this.field3396.method3908((byte)-108, (float)arg1, (float)arg0, (float)arg2) / (float)arg3);
            arg4[0] = (int)((float)var7 - this.field3485);
            arg4[2] = (int)var6;
            arg4[1] = (int)((float)var8 + -this.field3459);
         } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field3526[43] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field3526[6] : field3526[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(BF)V"
   )
   public final void method2003(byte arg0, float arg1) {
      try {
         ++field3325;
         if (this.field3460 != arg1) {
            this.field3460 = arg1;
            this.method1974((byte)-11);
         }

         int var3 = 119 % ((arg0 - -47) / 36);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3526[97] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "D",
      descriptor = "(I)V"
   )
   public abstract void method1279(int arg0);

   @OriginalMember(
      owner = "client!daa",
      name = "bb",
      descriptor = "(I)V"
   )
   private final void method2004(int arg0) {
      try {
         this.method1279(1);
         ++field3211;
         if (this.field3489 != null) {
            this.field3489.method3464(115);
         }

         if (arg0 != 5535) {
            this.field3395 = -33;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[129] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "X",
      descriptor = "(I)V"
   )
   public final void method160(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!daa",
      name = "j",
      descriptor = "(Z)Lcca;"
   )
   public final class293 method2005(boolean arg0) {
      try {
         ++field3308;
         if (arg0) {
            this.field3437 = false;
         }

         return this.field3416 == null ? null : this.field3416.method3498(18);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[25] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "([IIIIIZ)Lma;"
   )
   public final class148 method219(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         ++field3271;
         return new class682(this, arg3, arg4, arg0, arg1, arg2);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field3526[130] + (arg0 != null ? field3526[6] : field3526[8]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "V",
      descriptor = "(I)V"
   )
   public abstract void method1285(int arg0);

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(IILida;BLvf;II)V"
   )
   public abstract void method1230(int arg0, int arg1, class99 arg2, byte arg3, class73 arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!daa",
      name = "r",
      descriptor = "(I)V"
   )
   public final void method2006(int arg0) {
      try {
         if (arg0 != -2) {
            this.field3463 = 85;
         }

         if (this.field3426 != 2) {
            this.method1967(arg0 + -123);
            this.method1935(false, arg0 ^ -79);
            this.method1971(arg0 ^ 100, false);
            this.method1950(false, arg0 ^ 88);
            this.method1960(false, (byte)103);
            this.method2010(false, 3, -2, false);
            this.field3426 = 2;
         }

         ++field3297;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[88] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(IIBILsr;[FIZ)Lpga;"
   )
   public abstract class371 method1255(int arg0, int arg1, byte arg2, int arg3, class78 arg4, float[] arg5, int arg6, boolean arg7);

   @OriginalMember(
      owner = "client!daa",
      name = "d",
      descriptor = "(Z)I"
   )
   public final int method2007(boolean arg0) {
      try {
         ++field3276;
         if (!arg0) {
            this.field3503 = null;
         }

         return this.field3428;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[30] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "m",
      descriptor = "(I)V"
   )
   public final void method2008(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field3316;
         Enumeration var3 = this.field3363.keys();
         Canvas var4;
         if (var2) {
            var4 = (Canvas)var3.nextElement();
            this.method1283(122, var4, this.field3363.get(var4));
         }

         while(true) {
            Object var10000;
            if (!var3.hasMoreElements()) {
               var10000 = this.field3521;
               if (!var2) {
                  ((class581)var10000).method358(true);
                  if (arg0 > -7) {
                     this.field3337 = null;
                  }

                  this.field3505.method358(true);
                  this.field3517.method358(true);
                  this.field3522.method4405((byte)-97);
                  this.field3516.method4405((byte)-124);
                  this.field3504.method4405((byte)-124);
                  this.field3512.method4405((byte)-107);
                  this.field3513.method4405((byte)-95);
                  this.field3475.method1634(-1);
                  this.field3510.method358(true);
                  return;
               }
            } else {
               var10000 = var3.nextElement();
            }

            var4 = (Canvas)var10000;
            this.method1283(122, var4, this.field3363.get(var4));
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3526[110] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "r",
      descriptor = "(IIIIIII)I"
   )
   public final int method259(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field10022;

      try {
         int var9;
         label62: {
            ++field3311;
            var9 = 0;
            float var10 = (float)arg2 * this.field3396.field7388 + (float)arg0 * this.field3396.field7376 + (float)arg1 * this.field3396.field7339 + this.field3396.field7352;
            float var11 = (float)arg5 * this.field3396.field7388 + (float)arg3 * this.field3396.field7376 + (float)arg4 * this.field3396.field7339 + this.field3396.field7352;
            if ((float)this.field3494 > var10 && (float)this.field3494 > var11) {
               var9 |= 16;
               if (!var8) {
                  break label62;
               }
            }

            if ((float)this.field3447 < var10 && (float)this.field3447 < var11) {
               var9 |= 32;
            }
         }

         label69: {
            int var12 = (int)(((float)arg2 * this.field3396.field7384 + (float)arg0 * this.field3396.field7350 + (float)arg1 * this.field3396.field7391 + this.field3396.field7377) * (float)this.field3412 / (float)arg6);
            int var13 = (int)(((float)arg5 * this.field3396.field7384 + (float)arg3 * this.field3396.field7350 + (float)arg4 * this.field3396.field7391 + this.field3396.field7377) * (float)this.field3412 / (float)arg6);
            if (!((float)var12 < this.field3485) || !(this.field3485 > (float)var13)) {
               if (!(this.field3436 < (float)var12) || !(this.field3436 < (float)var13)) {
                  break label69;
               }

               var9 |= 2;
               if (!var8) {
                  break label69;
               }
            }

            var9 |= 1;
         }

         int var14 = (int)(((float)arg2 * this.field3396.field7363 + (float)arg0 * this.field3396.field7344 + (float)arg1 * this.field3396.field7338 + this.field3396.field7356) * (float)this.field3449 / (float)arg6);
         int var15 = (int)(((float)arg5 * this.field3396.field7363 + (float)arg3 * this.field3396.field7344 + (float)arg4 * this.field3396.field7338 + this.field3396.field7356) * (float)this.field3449 / (float)arg6);
         if ((float)var14 < this.field3459 && (float)var15 < this.field3459) {
            var9 |= 4;
            if (!var8) {
               return var9;
            }
         }

         if ((float)var14 > this.field3453 && (float)var15 > this.field3453) {
            var9 |= 8;
         }

         return var9;
      } catch (RuntimeException var17) {
         throw class612.method4503(var17, field3526[120] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "i",
      descriptor = "(II)Lsp;"
   )
   public class575 method1272(int arg0, int arg1) {
      try {
         ++field3259;
         if (arg0 != -27221) {
            this.field3220 = null;
         }

         if (arg1 != 6) {
            if (~arg1 == -2) {
               return new class783(this);
            }

            if (arg1 == 2) {
               return new class794(this, this.field3343);
            }

            if (~arg1 != -8) {
               return new class10(this);
            }

            if (!client.field10022) {
               return new class695(this);
            }
         }

         return new class444(this);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3526[79] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "aa",
      descriptor = "(IIIIII)V"
   )
   public final void method226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.method1975(-2);
         ++field3366;
         this.method1939(arg4, (byte)-60);
         this.method2009(0, 0, class172.field2572);
         this.method1937(class172.field2572, 0, 0);
         this.method1962((byte)108, arg5);
         this.field3392.method3905((float)arg2, (float)arg3, (byte)103, 1.0F);
         this.field3392.method327(arg0, arg1, 0);
         this.method2000(false);
         this.method1252(8, false);
         this.method2014((byte)114);
         this.method1252(8, true);
         this.method1937(class339.field5001, 0, 0);
         this.method2009(0, 0, class339.field5001);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field3526[100] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(ZZ)Ldca;"
   )
   public abstract class581 method1286(boolean arg0, boolean arg1);

   @OriginalMember(
      owner = "client!daa",
      name = "b",
      descriptor = "(I)V"
   )
   public void method252(int arg0) {
      try {
         if (this.field3424 != null) {
            this.field3424.method5286(26);
         }

         ++field3255;
         this.field3488 = Integer.MAX_VALUE & arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[87] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(IILhj;)V"
   )
   public final void method2009(int arg0, int arg1, class670 arg2) {
      try {
         this.method1239(2, arg2, arg1, false, false);
         ++field3274;
         if (arg0 != 0) {
            method1948(44);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3526[140] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3526[6] : field3526[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(ZIIZ)V"
   )
   public final void method2010(boolean arg0, int arg1, int arg2, boolean arg3) {
      boolean var5 = client.field10022;

      try {
         if (~this.field3486 != ~arg2 || this.field3431 != this.field3404) {
            class371 var6 = null;
            int var7 = 0;
            byte var8 = 0;
            int var9 = 0;
            int var10 = !this.field3404 ? 0 : 3;
            if (~arg2 > -1) {
               this.method1958(0);
            } else {
               class390 var11;
               label79: {
                  var6 = this.field3424.method5281(arg2, 116);
                  var11 = super.field240.method2043(-93, arg2);
                  if (~var11.field5681 != -1 || var11.field5667 != 0) {
                     int var12 = var11.field5685 ? 64 : 128;
                     int var13 = var12 * 50;
                     class522 var14 = this.method1992((byte)94);
                     var14.method3904(0.0F, (float)(this.field3488 % var13 * var11.field5667) / (float)var13, 0, (float)(this.field3488 % var13 * var11.field5681) / (float)var13);
                     this.method2015(class183.field2686, (byte)114);
                     if (!var5) {
                        break label79;
                     }
                  }

                  this.method1958(arg1 + -3);
               }

               var7 = var11.field5686;
               if (!this.field3404) {
                  var10 = var11.field5668;
                  var8 = var11.field5671;
                  var9 = var11.field5687;
               }
            }

            label44: {
               this.method1993((byte)-106, arg0, arg3, var10, var8, var9);
               if (this.field3489 == null) {
                  this.method1943(0, var6);
                  this.method1966(var7, -5);
                  if (!var5) {
                     break label44;
                  }
               }

               this.field3489.method88(var7, true, var6);
            }

            this.field3431 = this.field3404;
            this.field3486 = arg2;
         }

         ++field3322;
         if (arg1 != 3) {
            this.method1236(false, -67);
         }

         this.field3426 &= -8;
      } catch (RuntimeException var16) {
         throw class612.method4503(var16, field3526[27] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(BFFFFFF)Z"
   )
   private final boolean method2011(byte arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6) {
      try {
         ++field3380;
         Buffer var8 = this.field3505.method353(true, (byte)102);
         if (var8 == null) {
            return false;
         } else {
            Stream var9 = this.method1952((byte)55, var8);
            if (arg0 != 30) {
               this.field3476 = -0.34144765F;
            }

            label20: {
               if (!Stream.method3185()) {
                  var9.method3179(arg2);
                  var9.method3179(arg5);
                  var9.method3179(arg3);
                  var9.method3179(arg4);
                  var9.method3179(arg1);
                  var9.method3179(arg6);
                  if (!client.field10022) {
                     break label20;
                  }
               }

               var9.method3186(arg2);
               var9.method3186(arg5);
               var9.method3186(arg3);
               var9.method3186(arg4);
               var9.method3186(arg1);
               var9.method3186(arg6);
            }

            var9.method3187();
            return this.field3505.method352(-2070);
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field3526[82] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "k",
      descriptor = "(B)V"
   )
   private final void method2012(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!daa",
      name = "m",
      descriptor = "(B)V"
   )
   private final void method2013(byte arg0) {
      try {
         this.field3459 = (float)(-this.field3478 + this.field3464);
         this.field3436 = (float)(-this.field3408 + this.field3481);
         this.field3453 = (float)(-this.field3478 + this.field3425);
         if (arg0 >= -90) {
            this.field3477 = null;
         }

         this.field3485 = (float)(-this.field3408 + this.field3466);
         ++field3205;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[23] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(IIILvf;)V"
   )
   public abstract void method1249(int arg0, int arg1, int arg2, class73 arg3);

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;"
   )
   public final class751 method245(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      try {
         ++field3213;
         return new class423(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field3526[99] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3526[6] : field3526[8]) + ',' + (arg3 != null ? field3526[6] : field3526[8]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "x",
      descriptor = "(B)V"
   )
   public final void method2014(byte arg0) {
      try {
         ++field3233;
         if (arg0 != 114) {
            this.field3457 = true;
         }

         this.method1991(2, class40.field606, 15);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[36] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "ZA",
      descriptor = "(IFFFFF)V"
   )
   public final void method154(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      try {
         ++field3270;
         boolean var7 = this.field3471 != arg0;
         if (var7 || this.field3417 != arg1 || this.field3411 != arg2) {
            this.field3471 = arg0;
            this.field3417 = arg1;
            this.field3411 = arg2;
            if (var7) {
               this.field3438 = (float)(this.field3471 & 16711680) / 1.671168E7F;
               this.field3429 = (float)(255 & this.field3471) / 255.0F;
               this.field3462 = (float)(65280 & this.field3471) / 65280.0F;
               this.method1267((byte)-110);
            }

            this.field3337.setSunColour(this.field3438, this.field3462, this.field3429, arg1, arg2);
            this.method1264((byte)122);
         }

         if (this.field3401[0] != arg3 || this.field3401[1] != arg4 || this.field3401[2] != arg5) {
            this.field3401[2] = arg5;
            this.field3401[1] = arg4;
            this.field3401[0] = arg3;
            this.field3480[2] = -arg5;
            this.field3480[0] = -arg3;
            this.field3480[1] = -arg4;
            float var8 = (float)(1.0D / Math.sqrt((double)(arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field3435[1] = arg4 * var8;
            this.field3435[2] = arg5 * var8;
            this.field3435[0] = arg3 * var8;
            this.field3498[1] = -this.field3435[1];
            this.field3498[0] = -this.field3435[0];
            this.field3498[2] = -this.field3435[2];
            this.field3337.setSunDirection(this.field3435[0], this.field3435[1], this.field3435[2]);
            this.method1234(0);
            this.field3500 = (int)(arg5 * 256.0F / arg4);
            this.field3444 = (int)(arg3 * 256.0F / arg4);
         }

         this.method1232(-2);
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field3526[66] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(Lef;B)V"
   )
   public final void method2015(class171 arg0, byte arg1) {
      try {
         if (arg1 <= 87) {
            this.field3279 = null;
         }

         this.field3469[this.field3434] = arg0;
         ++field3262;
         this.method1964(-1);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3526[29] + (arg0 != null ? field3526[6] : field3526[8]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "pa",
      descriptor = "()V"
   )
   public final void method192() {
      try {
         ++field3289;
         this.field3404 = false;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3526[158] + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "p",
      descriptor = "()Z"
   )
   public final boolean method249() {
      try {
         ++field3326;
         return false;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3526[73] + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "P",
      descriptor = "(I)V"
   )
   public abstract void method1274(int arg0);

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(IZIII[II)Lpga;"
   )
   public abstract class371 method1288(int arg0, boolean arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6);

   @OriginalMember(
      owner = "client!daa",
      name = "k",
      descriptor = "(I)I"
   )
   public final int method2016(int arg0) {
      try {
         ++field3260;
         if (arg0 != 30963) {
            this.field3403 = null;
         }

         return this.field3402;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3526[94] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(ZIII[I)Lpga;"
   )
   public final class371 method2017(boolean arg0, int arg1, int arg2, int arg3, int[] arg4) {
      try {
         if (arg2 != 0) {
            this.field3441 = 53;
         }

         ++field3304;
         return this.method1288(arg1, arg0, 0, arg3, 0, arg4, 0);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field3526[80] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field3526[6] : field3526[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2018(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!daa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2019(char[] arg0) {
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
            var10005 = 118;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
