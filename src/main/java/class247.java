import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class247 extends class497 {
   @OriginalMember(
      owner = "client!lf",
      name = "J",
      descriptor = "Z"
   )
   private boolean field3185;
   @OriginalMember(
      owner = "client!lf",
      name = "gb",
      descriptor = "Z"
   )
   private boolean field3222;
   @OriginalMember(
      owner = "client!lf",
      name = "db",
      descriptor = "I"
   )
   private int field3210;
   @OriginalMember(
      owner = "client!lf",
      name = "yc",
      descriptor = "I"
   )
   private int field3191;
   @OriginalMember(
      owner = "client!lf",
      name = "Cb",
      descriptor = "I"
   )
   private int field3273;
   @OriginalMember(
      owner = "client!lf",
      name = "xb",
      descriptor = "I"
   )
   private int field3201;
   @OriginalMember(
      owner = "client!lf",
      name = "bc",
      descriptor = "Z"
   )
   private boolean field3270;
   @OriginalMember(
      owner = "client!lf",
      name = "ob",
      descriptor = "Z"
   )
   private boolean field3212;
   @OriginalMember(
      owner = "client!lf",
      name = "V",
      descriptor = "I"
   )
   private int field3297;
   @OriginalMember(
      owner = "client!lf",
      name = "Xb",
      descriptor = "Lck;"
   )
   private class667 field3284;
   @OriginalMember(
      owner = "client!lf",
      name = "sb",
      descriptor = "Lrr;"
   )
   private class380 field3277;
   @OriginalMember(
      owner = "client!lf",
      name = "gc",
      descriptor = "Lrr;"
   )
   private class380 field3293;
   @OriginalMember(
      owner = "client!lf",
      name = "Hc",
      descriptor = "Lrr;"
   )
   private class380 field3291;
   @OriginalMember(
      owner = "client!lf",
      name = "pb",
      descriptor = "Lrr;"
   )
   private class380 field3281;
   @OriginalMember(
      owner = "client!lf",
      name = "jb",
      descriptor = "Lqu;"
   )
   private class104 field3214;
   @OriginalMember(
      owner = "client!lf",
      name = "Ib",
      descriptor = "I"
   )
   private int field3236;
   @OriginalMember(
      owner = "client!lf",
      name = "C",
      descriptor = "I"
   )
   private int field3249;
   @OriginalMember(
      owner = "client!lf",
      name = "mc",
      descriptor = "[I"
   )
   private int[] field3187;
   @OriginalMember(
      owner = "client!lf",
      name = "H",
      descriptor = "[I"
   )
   private int[] field3272;
   @OriginalMember(
      owner = "client!lf",
      name = "Bb",
      descriptor = "[I"
   )
   private int[] field3305;
   @OriginalMember(
      owner = "client!lf",
      name = "nc",
      descriptor = "[I"
   )
   private int[] field3218;
   @OriginalMember(
      owner = "client!lf",
      name = "A",
      descriptor = "[S"
   )
   private short[] field3298;
   @OriginalMember(
      owner = "client!lf",
      name = "Jb",
      descriptor = "[Lhka;"
   )
   private class57[] field3306;
   @OriginalMember(
      owner = "client!lf",
      name = "W",
      descriptor = "[Lria;"
   )
   private class299[] field3292;
   @OriginalMember(
      owner = "client!lf",
      name = "Tb",
      descriptor = "I"
   )
   private int field3286;
   @OriginalMember(
      owner = "client!lf",
      name = "s",
      descriptor = "[Lcl;"
   )
   private class277[] field3265;
   @OriginalMember(
      owner = "client!lf",
      name = "Ub",
      descriptor = "[Llk;"
   )
   private class613[] field3303;
   @OriginalMember(
      owner = "client!lf",
      name = "sc",
      descriptor = "[S"
   )
   private short[] field3195;
   @OriginalMember(
      owner = "client!lf",
      name = "O",
      descriptor = "[F"
   )
   private float[] field3184;
   @OriginalMember(
      owner = "client!lf",
      name = "Db",
      descriptor = "[S"
   )
   private short[] field3183;
   @OriginalMember(
      owner = "client!lf",
      name = "rc",
      descriptor = "[S"
   )
   private short[] field3300;
   @OriginalMember(
      owner = "client!lf",
      name = "cb",
      descriptor = "[S"
   )
   private short[] field3274;
   @OriginalMember(
      owner = "client!lf",
      name = "Lb",
      descriptor = "[F"
   )
   private float[] field3237;
   @OriginalMember(
      owner = "client!lf",
      name = "I",
      descriptor = "[B"
   )
   private byte[] field3247;
   @OriginalMember(
      owner = "client!lf",
      name = "mb",
      descriptor = "S"
   )
   private short field3259;
   @OriginalMember(
      owner = "client!lf",
      name = "wb",
      descriptor = "[B"
   )
   private byte[] field3289;
   @OriginalMember(
      owner = "client!lf",
      name = "jc",
      descriptor = "[S"
   )
   private short[] field3189;
   @OriginalMember(
      owner = "client!lf",
      name = "qc",
      descriptor = "[S"
   )
   private short[] field3282;
   @OriginalMember(
      owner = "client!lf",
      name = "ib",
      descriptor = "[S"
   )
   private short[] field3299;
   @OriginalMember(
      owner = "client!lf",
      name = "zb",
      descriptor = "[S"
   )
   private short[] field3267;
   @OriginalMember(
      owner = "client!lf",
      name = "kc",
      descriptor = "[S"
   )
   private short[] field3199;
   @OriginalMember(
      owner = "client!lf",
      name = "Qb",
      descriptor = "[S"
   )
   private short[] field3204;
   @OriginalMember(
      owner = "client!lf",
      name = "kb",
      descriptor = "S"
   )
   private short field3188;
   @OriginalMember(
      owner = "client!lf",
      name = "tb",
      descriptor = "[I"
   )
   private int[] field3257;
   @OriginalMember(
      owner = "client!lf",
      name = "oc",
      descriptor = "[[I"
   )
   private int[][] field3288;
   @OriginalMember(
      owner = "client!lf",
      name = "cc",
      descriptor = "[[I"
   )
   private int[][] field3192;
   @OriginalMember(
      owner = "client!lf",
      name = "xc",
      descriptor = "[[I"
   )
   private int[][] field3242;
   @OriginalMember(
      owner = "client!lf",
      name = "Jc",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3307 = new String[]{method1863(method1862("@3d*\r")), method1863(method1862("Uh&h")), method1863(method1862("W{dEX")), method1863(method1862("W{dJX")), method1863(method1862("W{dRX")), method1863(method1862("W{dN1\u0013")), method1863(method1862("W{dE2\u0013")), method1863(method1862("W{d~\u0011\u0013")), method1863(method1862("W{d`\u0011\u0013")), method1863(method1862("W{df\u0011\u0013")), method1863(method1862("W{dPX")), method1863(method1862("W{dHX")), method1863(method1862("W{doX")), method1863(method1862("W{dTX")), method1863(method1862("W{dSX")), method1863(method1862("W{dB1\u0013")), method1863(method1862("W{dGX")), method1863(method1862("W{ds\u0011\u0013")), method1863(method1862("W{dL1\u0013")), method1863(method1862("W{dE1\u0013")), method1863(method1862("W{dJ1\u0013")), method1863(method1862("W{dW1\u0013")), method1863(method1862("W{dF1\u0013")), method1863(method1862("W{dM1\u0013")), method1863(method1862("W{de\u0011\u0013")), method1863(method1862("W{dO1\u0013")), method1863(method1862("W{dP1\u0013")), method1863(method1862("W{dOX")), method1863(method1862("W{dV1\u0013")), method1863(method1862("W{dj\u0011\u0013")), method1863(method1862("W{deX")), method1863(method1862("W{dKX")), method1863(method1862("W{dK1\u0013")), method1863(method1862("W{dvX")), method1863(method1862("W{drX")), method1863(method1862("W{dIX")), method1863(method1862("W{dS1\u0013")), method1863(method1862("W{dLX")), method1863(method1862("W{db\u0011\u0013")), method1863(method1862("W{d@1\u0013")), method1863(method1862("W{d@X")), method1863(method1862("W{dU1\u0013")), method1863(method1862("W{dtX")), method1863(method1862("W{dBX")), method1863(method1862("W{dUX")), method1863(method1862("W{dm\u0011\u0013")), method1863(method1862("W{dR1\u0013")), method1863(method1862("W{dT1\u0013")), method1863(method1862("W{dA1\u0013")), method1863(method1862("W{dQX")), method1863(method1862("W{dQ1\u0013")), method1863(method1862("W{dCX")), method1863(method1862("W{dFX")), method1863(method1862("W{dWX")), method1863(method1862("W{dwX")), method1863(method1862("W{dMX")), method1863(method1862("W{d8\u0019Ut>:X")), method1863(method1862("W{dG1\u0013")), method1863(method1862("W{dNX")), method1863(method1862("W{dq\u0011\u0013")), method1863(method1862("W{dH1\u0013")), method1863(method1862("W{dAX")), method1863(method1862("W{dC1\u0013")), method1863(method1862("W{dF2\u0013")), method1863(method1862("W{di\u0011\u0013"))};
   @OriginalMember(
      owner = "client!lf",
      name = "rb",
      descriptor = "Z"
   )
   public static boolean field3250 = false;
   @OriginalMember(
      owner = "client!lf",
      name = "zc",
      descriptor = "I"
   )
   public static int field3251 = 0;
   @OriginalMember(
      owner = "client!lf",
      name = "Nb",
      descriptor = "Lsda;"
   )
   public static class269 field3221 = new class269(35, -1);
   @OriginalMember(
      owner = "client!lf",
      name = "qb",
      descriptor = "Lhv;"
   )
   public static class544 field3301 = null;
   @OriginalMember(
      owner = "client!lf",
      name = "B",
      descriptor = "B"
   )
   private byte field3224;
   @OriginalMember(
      owner = "client!lf",
      name = "q",
      descriptor = "I"
   )
   public static int field3186;
   @OriginalMember(
      owner = "client!lf",
      name = "lb",
      descriptor = "I"
   )
   public static int field3193;
   @OriginalMember(
      owner = "client!lf",
      name = "vc",
      descriptor = "I"
   )
   public static int field3194;
   @OriginalMember(
      owner = "client!lf",
      name = "X",
      descriptor = "I"
   )
   public static int field3196;
   @OriginalMember(
      owner = "client!lf",
      name = "t",
      descriptor = "I"
   )
   public static int field3197;
   @OriginalMember(
      owner = "client!lf",
      name = "R",
      descriptor = "I"
   )
   public static int field3198;
   @OriginalMember(
      owner = "client!lf",
      name = "Ab",
      descriptor = "I"
   )
   public static int field3200;
   @OriginalMember(
      owner = "client!lf",
      name = "P",
      descriptor = "I"
   )
   public static int field3202;
   @OriginalMember(
      owner = "client!lf",
      name = "M",
      descriptor = "I"
   )
   public static int field3203;
   @OriginalMember(
      owner = "client!lf",
      name = "dc",
      descriptor = "I"
   )
   public static int field3205;
   @OriginalMember(
      owner = "client!lf",
      name = "Fb",
      descriptor = "I"
   )
   public static int field3206;
   @OriginalMember(
      owner = "client!lf",
      name = "Ec",
      descriptor = "I"
   )
   public static int field3207;
   @OriginalMember(
      owner = "client!lf",
      name = "K",
      descriptor = "I"
   )
   public static int field3208;
   @OriginalMember(
      owner = "client!lf",
      name = "Gc",
      descriptor = "I"
   )
   public static int field3209;
   @OriginalMember(
      owner = "client!lf",
      name = "v",
      descriptor = "I"
   )
   public static int field3211;
   @OriginalMember(
      owner = "client!lf",
      name = "Cc",
      descriptor = "I"
   )
   public static int field3213;
   @OriginalMember(
      owner = "client!lf",
      name = "Sb",
      descriptor = "I"
   )
   public static int field3215;
   @OriginalMember(
      owner = "client!lf",
      name = "fc",
      descriptor = "I"
   )
   public static int field3216;
   @OriginalMember(
      owner = "client!lf",
      name = "ub",
      descriptor = "I"
   )
   public static int field3219;
   @OriginalMember(
      owner = "client!lf",
      name = "Rb",
      descriptor = "I"
   )
   public static int field3220;
   @OriginalMember(
      owner = "client!lf",
      name = "z",
      descriptor = "I"
   )
   public static int field3223;
   @OriginalMember(
      owner = "client!lf",
      name = "lc",
      descriptor = "I"
   )
   public static int field3225;
   @OriginalMember(
      owner = "client!lf",
      name = "bb",
      descriptor = "I"
   )
   public static int field3226;
   @OriginalMember(
      owner = "client!lf",
      name = "Q",
      descriptor = "I"
   )
   public static int field3227;
   @OriginalMember(
      owner = "client!lf",
      name = "Y",
      descriptor = "I"
   )
   public static int field3228;
   @OriginalMember(
      owner = "client!lf",
      name = "r",
      descriptor = "I"
   )
   public static int field3229;
   @OriginalMember(
      owner = "client!lf",
      name = "u",
      descriptor = "I"
   )
   public static int field3230;
   @OriginalMember(
      owner = "client!lf",
      name = "tc",
      descriptor = "I"
   )
   public static int field3232;
   @OriginalMember(
      owner = "client!lf",
      name = "wc",
      descriptor = "I"
   )
   public static int field3233;
   @OriginalMember(
      owner = "client!lf",
      name = "Pb",
      descriptor = "I"
   )
   public static int field3235;
   @OriginalMember(
      owner = "client!lf",
      name = "Wb",
      descriptor = "I"
   )
   public static int field3238;
   @OriginalMember(
      owner = "client!lf",
      name = "fb",
      descriptor = "I"
   )
   public static int field3239;
   @OriginalMember(
      owner = "client!lf",
      name = "Ic",
      descriptor = "I"
   )
   public static int field3240;
   @OriginalMember(
      owner = "client!lf",
      name = "ac",
      descriptor = "I"
   )
   public static int field3241;
   @OriginalMember(
      owner = "client!lf",
      name = "uc",
      descriptor = "I"
   )
   public static int field3243;
   @OriginalMember(
      owner = "client!lf",
      name = "eb",
      descriptor = "I"
   )
   public static int field3244;
   @OriginalMember(
      owner = "client!lf",
      name = "E",
      descriptor = "I"
   )
   public static int field3245;
   @OriginalMember(
      owner = "client!lf",
      name = "Fc",
      descriptor = "I"
   )
   public static int field3246;
   @OriginalMember(
      owner = "client!lf",
      name = "x",
      descriptor = "I"
   )
   public static int field3248;
   @OriginalMember(
      owner = "client!lf",
      name = "w",
      descriptor = "I"
   )
   public static int field3252;
   @OriginalMember(
      owner = "client!lf",
      name = "y",
      descriptor = "I"
   )
   public static int field3253;
   @OriginalMember(
      owner = "client!lf",
      name = "hb",
      descriptor = "I"
   )
   public static int field3254;
   @OriginalMember(
      owner = "client!lf",
      name = "S",
      descriptor = "I"
   )
   public static int field3258;
   @OriginalMember(
      owner = "client!lf",
      name = "Hb",
      descriptor = "I"
   )
   public static int field3260;
   @OriginalMember(
      owner = "client!lf",
      name = "ec",
      descriptor = "I"
   )
   public static int field3261;
   @OriginalMember(
      owner = "client!lf",
      name = "yb",
      descriptor = "I"
   )
   public static int field3262;
   @OriginalMember(
      owner = "client!lf",
      name = "p",
      descriptor = "I"
   )
   public static int field3263;
   @OriginalMember(
      owner = "client!lf",
      name = "T",
      descriptor = "I"
   )
   public static int field3264;
   @OriginalMember(
      owner = "client!lf",
      name = "Eb",
      descriptor = "I"
   )
   public static int field3266;
   @OriginalMember(
      owner = "client!lf",
      name = "D",
      descriptor = "I"
   )
   public static int field3268;
   @OriginalMember(
      owner = "client!lf",
      name = "N",
      descriptor = "I"
   )
   public static int field3269;
   @OriginalMember(
      owner = "client!lf",
      name = "Gb",
      descriptor = "I"
   )
   public static int field3276;
   @OriginalMember(
      owner = "client!lf",
      name = "vb",
      descriptor = "I"
   )
   public static int field3278;
   @OriginalMember(
      owner = "client!lf",
      name = "Z",
      descriptor = "I"
   )
   public static int field3279;
   @OriginalMember(
      owner = "client!lf",
      name = "hc",
      descriptor = "I"
   )
   public static int field3280;
   @OriginalMember(
      owner = "client!lf",
      name = "U",
      descriptor = "I"
   )
   public static int field3283;
   @OriginalMember(
      owner = "client!lf",
      name = "G",
      descriptor = "I"
   )
   public static int field3285;
   @OriginalMember(
      owner = "client!lf",
      name = "Yb",
      descriptor = "I"
   )
   public static int field3287;
   @OriginalMember(
      owner = "client!lf",
      name = "ab",
      descriptor = "I"
   )
   public static int field3290;
   @OriginalMember(
      owner = "client!lf",
      name = "Bc",
      descriptor = "I"
   )
   public static int field3294;
   @OriginalMember(
      owner = "client!lf",
      name = "nb",
      descriptor = "I"
   )
   public static int field3304;
   @OriginalMember(
      owner = "client!lf",
      name = "Ac",
      descriptor = "Ljp;"
   )
   private class373 field3217;
   @OriginalMember(
      owner = "client!lf",
      name = "Vb",
      descriptor = "Lgka;"
   )
   private class390 field3302;
   @OriginalMember(
      owner = "client!lf",
      name = "Mb",
      descriptor = "Lsha;"
   )
   private class758 field3296;
   @OriginalMember(
      owner = "client!lf",
      name = "Dc",
      descriptor = "S"
   )
   private short field3190;
   @OriginalMember(
      owner = "client!lf",
      name = "Zb",
      descriptor = "S"
   )
   private short field3231;
   @OriginalMember(
      owner = "client!lf",
      name = "Ob",
      descriptor = "S"
   )
   private short field3234;
   @OriginalMember(
      owner = "client!lf",
      name = "ic",
      descriptor = "S"
   )
   private short field3255;
   @OriginalMember(
      owner = "client!lf",
      name = "pc",
      descriptor = "S"
   )
   private short field3256;
   @OriginalMember(
      owner = "client!lf",
      name = "Kb",
      descriptor = "S"
   )
   private short field3271;
   @OriginalMember(
      owner = "client!lf",
      name = "F",
      descriptor = "S"
   )
   private short field3275;
   @OriginalMember(
      owner = "client!lf",
      name = "L",
      descriptor = "S"
   )
   private short field3295;

   @OriginalMember(
      owner = "client!lf",
      name = "O",
      descriptor = "(III)V",
      line = 4
   )
   public final void method346(int arg0, int arg1, int arg2) {
      int var4 = client.field4530;

      try {
         ++field3233;
         int var5 = 0;
         if (var4 != 0) {
            if (~arg0 != -129) {
               this.field3305[var5] = this.field3305[var5] * arg0 >> 7;
            }

            if (~arg1 != -129) {
               this.field3218[var5] = this.field3218[var5] * arg1 >> 7;
            }

            if (~arg2 != -129) {
               this.field3272[var5] = this.field3272[var5] * arg2 >> 7;
               ++var5;
            } else {
               ++var5;
            }
         }

         while(true) {
            while(~this.field3273 < ~var5) {
               if (~arg0 != -129) {
                  this.field3305[var5] = this.field3305[var5] * arg0 >> 7;
               }

               if (~arg1 != -129) {
                  this.field3218[var5] = this.field3218[var5] * arg1 >> 7;
               }

               if (~arg2 != -129) {
                  this.field3272[var5] = this.field3272[var5] * arg2 >> 7;
                  ++var5;
               } else {
                  ++var5;
               }
            }

            this.field3222 = false;
            if (var4 == 0) {
               if (this.field3277 != null) {
                  this.field3277.field5840 = null;
                  return;
               }

               return;
            }

            this.field3272[var5] = this.field3272[var5] * arg2 >> 7;
            ++var5;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field3307[31] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(Llf;ZLlf;ZZI)Lka;",
      line = 38
   )
   private final class497 method1846(class247 arg0, boolean arg1, class247 arg2, boolean arg3, boolean arg4, int arg5) {
      int var7 = client.field4530;

      try {
         label651: {
            arg2.field3273 = this.field3273;
            arg2.field3297 = this.field3297;
            arg2.field3185 = this.field3185;
            arg2.field3286 = this.field3286;
            if ((arg5 & 256) != 0) {
               arg2.field3212 = true;
               if (var7 == 0) {
                  break label651;
               }
            }

            arg2.field3212 = this.field3212;
         }

         label646: {
            arg2.field3236 = this.field3236;
            arg2.field3201 = this.field3201;
            ++field3225;
            arg2.field3210 = this.field3210;
            arg2.field3259 = this.field3259;
            arg2.field3191 = this.field3191;
            arg2.field3249 = arg5;
            arg2.field3188 = this.field3188;
            arg2.field3224 = 0;
            boolean var8 = class100.method868(-1, this.field3236, arg5);
            boolean var9 = class394.method3020(this.field3236, arg5, -1);
            boolean var10 = class207.method1580(this.field3236, -6421, arg5);
            boolean var11 = var10 | var8 | var9;
            if (var11) {
               label643: {
                  if (var8) {
                     if (arg0.field3305 == null || ~arg0.field3305.length > ~this.field3297) {
                        arg2.field3305 = arg0.field3305 = new int[this.field3297];
                        if (var7 == 0) {
                           break label643;
                        }
                     }

                     arg2.field3305 = arg0.field3305;
                     if (var7 == 0) {
                        break label643;
                     }
                  }

                  arg2.field3305 = this.field3305;
               }

               label632: {
                  if (var9) {
                     if (arg0.field3218 == null || arg0.field3218.length < this.field3297) {
                        arg2.field3218 = arg0.field3218 = new int[this.field3297];
                        if (var7 == 0) {
                           break label632;
                        }
                     }

                     arg2.field3218 = arg0.field3218;
                     if (var7 == 0) {
                        break label632;
                     }
                  }

                  arg2.field3218 = this.field3218;
               }

               label621: {
                  if (var10) {
                     if (arg0.field3272 != null && ~arg0.field3272.length <= ~this.field3297) {
                        arg2.field3272 = arg0.field3272;
                        if (var7 == 0) {
                           break label621;
                        }
                     }

                     arg2.field3272 = arg0.field3272 = new int[this.field3297];
                     if (var7 == 0) {
                        break label621;
                     }
                  }

                  arg2.field3272 = this.field3272;
               }

               label612: {
                  int var12 = 0;
                  if (var7 != 0) {
                     if (var8) {
                        arg2.field3305[var12] = this.field3305[var12];
                     }
                  } else if (~var12 <= ~this.field3297) {
                     if (var7 == 0) {
                        break label612;
                     }
                  } else if (var8) {
                     arg2.field3305[var12] = this.field3305[var12];
                  }

                  while(true) {
                     if (var9) {
                        arg2.field3218[var12] = this.field3218[var12];
                     }

                     if (var10) {
                        arg2.field3272[var12] = this.field3272[var12];
                     }

                     ++var12;
                     if (~var12 <= ~this.field3297) {
                        if (var7 == 0) {
                           break;
                        }
                     } else if (var8) {
                        arg2.field3305[var12] = this.field3305[var12];
                     }
                  }
               }

               if (var7 == 0) {
                  break label646;
               }
            }

            arg2.field3305 = this.field3305;
            arg2.field3272 = this.field3272;
            arg2.field3218 = this.field3218;
         }

         label658: {
            if (!class401.method3081(false, this.field3236, arg5)) {
               if (!class573.method4241(this.field3236, arg5, 2048)) {
                  arg2.field3277 = null;
                  if (var7 == 0) {
                     break label658;
                  }
               }

               arg2.field3277 = this.field3277;
               if (var7 == 0) {
                  break label658;
               }
            }

            arg2.field3277 = arg0.field3277;
            if (arg1) {
               arg2.field3224 = (byte)(arg2.field3224 | 1);
            }

            arg2.field3277.field5840 = this.field3277.field5840;
            arg2.field3277.field5844 = this.field3277.field5844;
         }

         if (!arg3) {
            this.method311();
         }

         label577: {
            if (class216.method1636(this.field3236, 0, arg5)) {
               label701: {
                  if (arg0.field3183 == null || ~arg0.field3183.length > ~this.field3201) {
                     arg2.field3183 = arg0.field3183 = new short[this.field3201];
                     if (var7 == 0) {
                        break label701;
                     }
                  }

                  arg2.field3183 = arg0.field3183;
               }

               int var13 = 0;
               if (var7 != 0) {
                  arg2.field3183[var13] = this.field3183[var13];
                  ++var13;
               }

               while(true) {
                  while(~this.field3201 < ~var13) {
                     arg2.field3183[var13] = this.field3183[var13];
                     ++var13;
                  }

                  if (var7 == 0) {
                     if (var7 == 0) {
                        break label577;
                     }
                     break;
                  }

                  ++var13;
               }
            }

            arg2.field3183 = this.field3183;
         }

         label544: {
            if (class473.method3522(this.field3236, arg5, 0)) {
               label702: {
                  if (arg0.field3247 == null || ~arg0.field3247.length > ~this.field3201) {
                     arg2.field3247 = arg0.field3247 = new byte[this.field3201];
                     if (var7 == 0) {
                        break label702;
                     }
                  }

                  arg2.field3247 = arg0.field3247;
               }

               int var14 = 0;
               if (var7 != 0) {
                  arg2.field3247[var14] = this.field3247[var14];
                  ++var14;
               }

               while(true) {
                  while(~this.field3201 < ~var14) {
                     arg2.field3247[var14] = this.field3247[var14];
                     ++var14;
                  }

                  if (var7 == 0) {
                     if (var7 == 0) {
                        break label544;
                     }
                     break;
                  }

                  ++var14;
               }
            }

            arg2.field3247 = this.field3247;
         }

         label665: {
            if (class625.method4509(arg5, this.field3236, arg3)) {
               arg2.field3281 = arg0.field3281;
               if (arg1) {
                  arg2.field3224 = (byte)(arg2.field3224 | 2);
               }

               arg2.field3281.field5844 = this.field3281.field5844;
               arg2.field3281.field5840 = this.field3281.field5840;
               if (var7 == 0) {
                  break label665;
               }
            }

            if (!class243.method1805(this.field3236, arg5, true)) {
               arg2.field3281 = null;
               if (var7 == 0) {
                  break label665;
               }
            }

            arg2.field3281 = this.field3281;
         }

         label501: {
            if (class415.method3173(arg5, 10695, this.field3236)) {
               label703: {
                  if (arg0.field3267 == null || ~arg0.field3267.length > ~this.field3191) {
                     int var15 = this.field3191;
                     arg2.field3267 = arg0.field3267 = new short[var15];
                     arg2.field3189 = arg0.field3189 = new short[var15];
                     arg2.field3299 = arg0.field3299 = new short[var15];
                     if (var7 == 0) {
                        break label703;
                     }
                  }

                  arg2.field3299 = arg0.field3299;
                  arg2.field3267 = arg0.field3267;
                  arg2.field3189 = arg0.field3189;
               }

               label667: {
                  if (this.field3217 != null) {
                     if (arg0.field3217 == null) {
                        arg0.field3217 = new class373();
                     }

                     class373 var16 = arg2.field3217 = arg0.field3217;
                     if (var16.field5666 == null || ~var16.field5666.length > ~this.field3191) {
                        int var17 = this.field3191;
                        var16.field5664 = new short[var17];
                        var16.field5665 = new short[var17];
                        var16.field5667 = new byte[var17];
                        var16.field5666 = new short[var17];
                     }

                     int var18 = 0;
                     if (var7 != 0) {
                        arg2.field3267[var18] = this.field3267[var18];
                        arg2.field3299[var18] = this.field3299[var18];
                        arg2.field3189[var18] = this.field3189[var18];
                        var16.field5666[var18] = this.field3217.field5666[var18];
                        var16.field5664[var18] = this.field3217.field5664[var18];
                        var16.field5665[var18] = this.field3217.field5665[var18];
                        var16.field5667[var18] = this.field3217.field5667[var18];
                        ++var18;
                     }

                     while(true) {
                        while(this.field3191 > var18) {
                           arg2.field3267[var18] = this.field3267[var18];
                           arg2.field3299[var18] = this.field3299[var18];
                           arg2.field3189[var18] = this.field3189[var18];
                           var16.field5666[var18] = this.field3217.field5666[var18];
                           var16.field5664[var18] = this.field3217.field5664[var18];
                           var16.field5665[var18] = this.field3217.field5665[var18];
                           var16.field5667[var18] = this.field3217.field5667[var18];
                           ++var18;
                        }

                        if (var7 == 0) {
                           if (var7 == 0) {
                              break label667;
                           }
                           break;
                        }

                        ++var18;
                     }
                  }

                  int var19 = 0;
                  if (var7 != 0 || this.field3191 > var19) {
                     do {
                        arg2.field3267[var19] = this.field3267[var19];
                        arg2.field3299[var19] = this.field3299[var19];
                        arg2.field3189[var19] = this.field3189[var19];
                        ++var19;
                     } while(this.field3191 > var19);
                  }
               }

               arg2.field3289 = this.field3289;
               if (var7 == 0) {
                  break label501;
               }
            }

            arg2.field3189 = this.field3189;
            arg2.field3299 = this.field3299;
            arg2.field3289 = this.field3289;
            arg2.field3217 = this.field3217;
            arg2.field3267 = this.field3267;
         }

         label671: {
            if (!class9.method81(arg5, this.field3236, 1)) {
               if (class156.method1293(55, this.field3236, arg5)) {
                  arg2.field3291 = this.field3291;
                  if (var7 == 0) {
                     break label671;
                  }
               }

               arg2.field3291 = null;
               if (var7 == 0) {
                  break label671;
               }
            }

            arg2.field3291 = arg0.field3291;
            if (arg1) {
               arg2.field3224 = (byte)(arg2.field3224 | 4);
            }

            arg2.field3291.field5844 = this.field3291.field5844;
            arg2.field3291.field5840 = this.field3291.field5840;
         }

         label440: {
            if (class321.method2430(50, arg5, this.field3236)) {
               label437: {
                  if (arg0.field3237 != null && ~this.field3201 >= ~arg0.field3237.length) {
                     arg2.field3237 = arg0.field3237;
                     arg2.field3184 = arg0.field3184;
                     if (var7 == 0) {
                        break label437;
                     }
                  }

                  int var20 = this.field3191;
                  arg2.field3184 = arg0.field3184 = new float[var20];
                  arg2.field3237 = arg0.field3237 = new float[var20];
               }

               int var21 = 0;
               if (var7 != 0) {
                  arg2.field3237[var21] = this.field3237[var21];
                  arg2.field3184[var21] = this.field3184[var21];
                  ++var21;
               }

               while(true) {
                  while(~this.field3191 < ~var21) {
                     arg2.field3237[var21] = this.field3237[var21];
                     arg2.field3184[var21] = this.field3184[var21];
                     ++var21;
                  }

                  if (var7 == 0) {
                     if (var7 == 0) {
                        break label440;
                     }
                     break;
                  }

                  ++var21;
               }
            }

            arg2.field3237 = this.field3237;
            arg2.field3184 = this.field3184;
         }

         label675: {
            if (!class69.method691(arg5, this.field3236, 30)) {
               if (class139.method1178(this.field3236, 115, arg5)) {
                  arg2.field3293 = this.field3293;
                  if (var7 == 0) {
                     break label675;
                  }
               }

               arg2.field3293 = null;
               if (var7 == 0) {
                  break label675;
               }
            }

            if (arg1) {
               arg2.field3224 = (byte)(arg2.field3224 | 8);
            }

            arg2.field3293 = arg0.field3293;
            arg2.field3293.field5844 = this.field3293.field5844;
            arg2.field3293.field5840 = this.field3293.field5840;
         }

         label401: {
            if (class79.method751(arg5, this.field3236, (byte)-6)) {
               label705: {
                  if (arg0.field3199 == null || ~arg0.field3199.length > ~this.field3201) {
                     int var22 = this.field3201;
                     arg2.field3300 = arg0.field3300 = new short[var22];
                     arg2.field3199 = arg0.field3199 = new short[var22];
                     arg2.field3282 = arg0.field3282 = new short[var22];
                     if (var7 == 0) {
                        break label705;
                     }
                  }

                  arg2.field3282 = arg0.field3282;
                  arg2.field3199 = arg0.field3199;
                  arg2.field3300 = arg0.field3300;
               }

               int var23 = 0;
               if (var7 != 0) {
                  arg2.field3199[var23] = this.field3199[var23];
                  arg2.field3282[var23] = this.field3282[var23];
                  arg2.field3300[var23] = this.field3300[var23];
                  ++var23;
               }

               while(true) {
                  while(this.field3201 > var23) {
                     arg2.field3199[var23] = this.field3199[var23];
                     arg2.field3282[var23] = this.field3282[var23];
                     arg2.field3300[var23] = this.field3300[var23];
                     ++var23;
                  }

                  if (var7 == 0) {
                     if (var7 == 0) {
                        break label401;
                     }
                     break;
                  }

                  ++var23;
               }
            }

            arg2.field3300 = this.field3300;
            arg2.field3199 = this.field3199;
            arg2.field3282 = this.field3282;
         }

         label679: {
            if (class789.method5660(-119, arg5, this.field3236)) {
               if (arg1) {
                  arg2.field3224 = (byte)(arg2.field3224 | 16);
               }

               arg2.field3214 = arg0.field3214;
               arg2.field3214.field1256 = this.field3214.field1256;
               if (var7 == 0) {
                  break label679;
               }
            }

            if (!class380.method2937(arg5, 35, this.field3236)) {
               arg2.field3214 = null;
               if (var7 == 0) {
                  break label679;
               }
            }

            arg2.field3214 = this.field3214;
         }

         label358: {
            if (class507.method3759(-1, arg5, this.field3236)) {
               label698: {
                  if (arg0.field3274 == null || this.field3201 > arg0.field3274.length) {
                     int var24 = this.field3201;
                     arg2.field3274 = arg0.field3274 = new short[var24];
                     if (var7 == 0) {
                        break label698;
                     }
                  }

                  arg2.field3274 = arg0.field3274;
               }

               int var25 = 0;
               if (var7 != 0) {
                  arg2.field3274[var25] = this.field3274[var25];
                  ++var25;
               }

               while(true) {
                  while(this.field3201 > var25) {
                     arg2.field3274[var25] = this.field3274[var25];
                     ++var25;
                  }

                  if (var7 == 0) {
                     if (var7 == 0) {
                        break label358;
                     }
                     break;
                  }

                  ++var25;
               }
            }

            arg2.field3274 = this.field3274;
         }

         label325: {
            if (class532.method3947(this.field3236, arg5, 50560)) {
               if (arg0.field3303 != null && this.field3286 <= arg0.field3303.length) {
                  arg2.field3303 = arg0.field3303;
                  int var26 = 0;
                  if (var7 != 0) {
                     arg2.field3303[var26].method4457(this.field3303[var26], (byte)110);
                     ++var26;
                  }

                  while(true) {
                     while(var26 < this.field3286) {
                        arg2.field3303[var26].method4457(this.field3303[var26], (byte)110);
                        ++var26;
                     }

                     if (var7 == 0) {
                        if (var7 == 0) {
                           break label325;
                        }
                        break;
                     }

                     ++var26;
                  }
               }

               int var27 = this.field3286;
               arg2.field3303 = arg0.field3303 = new class613[var27];
               int var28 = 0;
               if (var7 != 0) {
                  arg2.field3303[var28] = this.field3303[var28].method4459(6);
                  ++var28;
               }

               while(true) {
                  while(~this.field3286 < ~var28) {
                     arg2.field3303[var28] = this.field3303[var28].method4459(6);
                     ++var28;
                  }

                  if (var7 == 0) {
                     if (var7 == 0) {
                        break label325;
                     }
                     break;
                  }

                  ++var28;
               }
            }

            arg2.field3303 = this.field3303;
         }

         arg2.field3257 = this.field3257;
         arg2.field3195 = this.field3195;
         arg2.field3242 = this.field3242;
         arg2.field3265 = this.field3265;
         arg2.field3306 = this.field3306;
         arg2.field3298 = this.field3298;
         arg2.field3192 = this.field3192;
         arg2.field3288 = this.field3288;
         arg2.field3204 = this.field3204;
         arg2.field3187 = this.field3187;
         arg2.field3292 = this.field3292;
         if (this.field3222) {
            arg2.field3222 = true;
            arg2.field3255 = this.field3255;
            arg2.field3234 = this.field3234;
            arg2.field3295 = this.field3295;
            arg2.field3271 = this.field3271;
            arg2.field3256 = this.field3256;
            arg2.field3231 = this.field3231;
            arg2.field3275 = this.field3275;
            arg2.field3190 = this.field3190;
            if (var7 == 0) {
               return arg2;
            }
         }

         arg2.field3222 = false;
         return arg2;
      } catch (RuntimeException var30) {
         throw class670.method4877(var30, field3307[10] + (arg0 != null ? field3307[0] : field3307[1]) + ',' + arg1 + ',' + (arg2 != null ? field3307[0] : field3307[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "ba",
      descriptor = "(Lr;)Lr;",
      line = 509
   )
   public final class193 method313(class193 arg0) {
      int var2 = client.field4530;

      try {
         ++field3276;
         if (~this.field3191 == -1) {
            return null;
         } else {
            if (!this.field3222) {
               this.method1859(-1);
            }

            int var3;
            int var4;
            label48: {
               if (this.field3284.field9953 > 0) {
                  var3 = this.field3234 - (this.field3284.field9953 * this.field3190 >> 8) >> this.field3284.field9903;
                  var4 = -(this.field3284.field9953 * this.field3256 >> 8) + this.field3275 >> this.field3284.field9903;
                  if (var2 == 0) {
                     break label48;
                  }
               }

               var3 = -(this.field3284.field9953 * this.field3256 >> 8) + this.field3234 >> this.field3284.field9903;
               var4 = -(this.field3284.field9953 * this.field3190 >> 8) + this.field3275 >> this.field3284.field9903;
            }

            int var5;
            int var6;
            label43: {
               if (~this.field3284.field9977 < -1) {
                  var5 = -(this.field3284.field9977 * this.field3190 >> 8) + this.field3255 >> this.field3284.field9903;
                  var6 = -(this.field3284.field9977 * this.field3256 >> 8) + this.field3295 >> this.field3284.field9903;
                  if (var2 == 0) {
                     break label43;
                  }
               }

               var5 = -(this.field3284.field9977 * this.field3256 >> 8) + this.field3255 >> this.field3284.field9903;
               var6 = this.field3295 - (this.field3284.field9977 * this.field3190 >> 8) >> this.field3284.field9903;
            }

            class290 var10;
            label60: {
               int var7 = -var3 + var4 + 1;
               int var8 = var6 + 1 - var5;
               class290 var9 = (class290)arg0;
               if (var9 == null || !var9.method2207(var8, var7, 19280)) {
                  var10 = new class290(this.field3284, var7, var8);
                  if (var2 == 0) {
                     break label60;
                  }
               }

               var10 = var9;
               var9.method2206((byte)103);
            }

            var10.method2205(var5, var3, var6, var4, true);
            this.method1853(var10, (byte)-62);
            return var10;
         }
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field3307[9] + (arg0 != null ? field3307[0] : field3307[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "s",
      descriptor = "(I)V",
      line = 572
   )
   public final void method333(int arg0) {
      try {
         this.field3249 = arg0;
         ++field3261;
         this.field3270 = true;
         if (this.field3217 != null && ~(65536 & this.field3249) == -1) {
            this.field3289 = this.field3217.field5667;
            this.field3189 = this.field3217.field5665;
            this.field3267 = this.field3217.field5666;
            this.field3299 = this.field3217.field5664;
            this.field3217 = null;
         }

         this.method1861((byte)-38);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3307[54] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(IIIBS)I",
      line = 594
   )
   private final int method1847(int arg0, int arg1, int arg2, byte arg3, short arg4) {
      int var6 = client.field4530;

      try {
         int var7 = -126 / ((21 - arg0) / 47);
         ++field3241;
         int var8 = class628.field9131[class148.method1219(arg1, arg2, -18413)];
         if (arg4 != -1) {
            class327 var9 = this.field3284.field813.method1159(arg4 & 65535, 126);
            int var10 = var9.field4641 & 255;
            if (var10 != 0) {
               label57: {
                  int var11;
                  label47: {
                     if (~arg2 <= -1) {
                        if (arg2 > 127) {
                           var11 = 16777215;
                           if (var6 == 0) {
                              break label47;
                           }
                        }

                        var11 = arg2 * 131586;
                        if (var6 == 0) {
                           break label47;
                        }
                     }

                     var11 = 0;
                  }

                  if (var10 != 256) {
                     int var13 = -var10 + 256;
                     var8 = ((65280 & var8) * var13 + (65280 & var11) * var10 & 16711680) + ((16711935 & var8) * var13 + (var11 & 16711935) * var10 & -16711936) >> 8;
                     if (var6 == 0) {
                        break label57;
                     }
                  }

                  var8 = var11;
               }
            }

            int var14 = 255 & var9.field4632;
            if (var14 != 0) {
               var14 += 256;
               int var15 = ((16711680 & var8) >> 16) * var14;
               if (var15 > 65535) {
                  var15 = 65535;
               }

               int var16 = ((var8 & 65280) >> 8) * var14;
               if (~var16 < -65536) {
                  var16 = 65535;
               }

               int var17 = (var8 & 255) * var14;
               if (var17 > 65535) {
                  var17 = 65535;
               }

               var8 = (var17 >> 8) + (16711752 & var15 << 8) + (var16 & 65280);
            }
         }

         return 255 - ((255 & arg3) - (var8 << 8));
      } catch (RuntimeException var19) {
         throw class670.method4877(var19, field3307[41] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "b",
      descriptor = "()V",
      line = 673
   )
   public final void method296() {
      try {
         ++field3253;
         if (~this.field3191 < -1 && this.field3210 > 0) {
            this.method1857((byte)-88, false);
            if ((16 & this.field3224) == 0 && this.field3214.field1256 == null) {
               this.method1856(117, false);
            }

            this.method1861((byte)-38);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3307[21] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(Lgq;IZ)V",
      line = 690
   )
   public final void method335(class540 param1, int param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lf",
      name = "WA",
      descriptor = "()I",
      line = 724
   )
   public final int method315() {
      try {
         ++field3243;
         return this.field3259;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3307[36] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "P",
      descriptor = "(IIII)V",
      line = 736
   )
   public final void method308(int arg0, int arg1, int arg2, int arg3) {
      int var5 = client.field4530;

      try {
         ++field3216;
         if (~arg0 != -1) {
            if (~arg0 != -2) {
               if (~arg0 != -3) {
                  if (arg0 != 3) {
                     if (arg0 != 5) {
                        if (arg0 != 7) {
                           if (arg0 != 8) {
                              if (arg0 != 10) {
                                 if (arg0 == 9) {
                                    int var40 = 0;
                                    if (var5 != 0 || var40 < this.field3286) {
                                       do {
                                          class613 var41 = this.field3303[var40];
                                          var41.field8970 = var41.field8970 + arg1 & 16383;
                                          ++var40;
                                       } while(var40 < this.field3286);

                                    }
                                 }
                              } else {
                                 int var38 = 0;
                                 if (var5 != 0 || ~var38 > ~this.field3286) {
                                    do {
                                       class613 var39 = this.field3303[var38];
                                       var39.field8967 = var39.field8967 * arg1 >> 7;
                                       var39.field8971 = var39.field8971 * arg2 >> 7;
                                       ++var38;
                                    } while(~var38 > ~this.field3286);

                                 }
                              }
                           } else {
                              int var36 = 0;
                              if (var5 != 0 || var36 < this.field3286) {
                                 do {
                                    class613 var37 = this.field3303[var36];
                                    var37.field8964 += arg1;
                                    var37.field8968 += arg2;
                                    ++var36;
                                 } while(var36 < this.field3286);

                              }
                           }
                        } else {
                           int var25 = 0;
                           int var33;
                           class277 var34;
                           class613 var35;
                           class247 var44;
                           if (var5 != 0) {
                              var44 = this;
                           } else if (var25 >= this.field3201) {
                              var44 = this;
                              if (var5 == 0) {
                                 if (this.field3281 != null) {
                                    this.field3281.field5840 = null;
                                 }

                                 if (this.field3265 != null) {
                                    var33 = 0;
                                    if (var5 != 0 || var33 < this.field3286) {
                                       do {
                                          var34 = this.field3265[var33];
                                          var35 = this.field3303[var33];
                                          var35.field8972 = var35.field8972 & -16777216 | 16777215 & class628.field9131[65535 & this.field3183[var34.field3858]];
                                          ++var33;
                                       } while(var33 < this.field3286);
                                    }
                                 }

                                 return;
                              }
                           } else {
                              var44 = this;
                           }

                           while(true) {
                              int var26 = var44.field3183[var25] & 65535;
                              int var27 = var26 >> 10 & 63;
                              int var28 = (1011 & var26) >> 7;
                              int var29 = arg2 / 4 + var28;
                              int var30 = var26 & 127;
                              int var31 = 63 & arg1 + var27;
                              if (~var29 > -1) {
                                 var29 = 0;
                                 if (var5 != 0 && ~var29 < -8) {
                                    var29 = 7;
                                 }
                              } else if (~var29 < -8) {
                                 var29 = 7;
                              }

                              int var32 = arg3 + var30;
                              if (~var32 > -1) {
                                 var32 = 0;
                                 if (var5 != 0 && ~var32 < -128) {
                                    var32 = 127;
                                 }
                              } else if (~var32 < -128) {
                                 var32 = 127;
                              }

                              this.field3183[var25] = (short)class379.method2928(class379.method2928(var31 << 10, var29 << 7), var32);
                              ++var25;
                              if (var25 >= this.field3201) {
                                 var44 = this;
                                 if (var5 == 0) {
                                    if (this.field3281 != null) {
                                       this.field3281.field5840 = null;
                                    }

                                    if (this.field3265 != null) {
                                       var33 = 0;
                                       if (var5 != 0 || var33 < this.field3286) {
                                          do {
                                             var34 = this.field3265[var33];
                                             var35 = this.field3303[var33];
                                             var35.field8972 = var35.field8972 & -16777216 | 16777215 & class628.field9131[65535 & this.field3183[var34.field3858]];
                                             ++var33;
                                          } while(var33 < this.field3286);
                                       }
                                    }

                                    return;
                                 }
                              } else {
                                 var44 = this;
                              }
                           }
                        }
                     } else {
                        int var20 = 0;
                        int var21;
                        if (var5 != 0) {
                           var21 = (255 & this.field3247[var20]) + arg1 * 8;
                           if (~var21 <= -1) {
                              if (~var21 < -256) {
                                 var21 = 255;
                                 if (var5 != 0) {
                                    var21 = 0;
                                 }
                              }
                           } else {
                              var21 = 0;
                           }

                           this.field3247[var20] = (byte)var21;
                           ++var20;
                        }

                        while(this.field3201 > var20) {
                           var21 = (255 & this.field3247[var20]) + arg1 * 8;
                           if (~var21 <= -1) {
                              if (~var21 < -256) {
                                 var21 = 255;
                                 if (var5 != 0) {
                                    var21 = 0;
                                 }
                              }
                           } else {
                              var21 = 0;
                           }

                           this.field3247[var20] = (byte)var21;
                           ++var20;
                        }

                        if (this.field3281 != null) {
                           this.field3281.field5840 = null;
                        }

                        if (this.field3265 != null) {
                           int var22 = 0;
                           if (var5 != 0 || ~var22 > ~this.field3286) {
                              do {
                                 class277 var23 = this.field3265[var22];
                                 class613 var24 = this.field3303[var22];
                                 var24.field8972 = -(255 & this.field3247[var23.field3858]) + 255 << 24 | 16777215 & var24.field8972;
                                 ++var22;
                              } while(~var22 > ~this.field3286);
                           }
                        }

                     }
                  } else {
                     int var19 = 0;
                     if (var5 != 0) {
                        this.field3305[var19] -= class776.field11343;
                        this.field3218[var19] -= class242.field3079;
                        this.field3272[var19] -= class117.field1429;
                        this.field3305[var19] = this.field3305[var19] * arg1 / 128;
                        this.field3218[var19] = this.field3218[var19] * arg2 / 128;
                        this.field3272[var19] = this.field3272[var19] * arg3 / 128;
                        this.field3305[var19] += class776.field11343;
                        this.field3218[var19] += class242.field3079;
                        this.field3272[var19] += class117.field1429;
                        ++var19;
                     }

                     while(true) {
                        while(this.field3273 > var19) {
                           this.field3305[var19] -= class776.field11343;
                           this.field3218[var19] -= class242.field3079;
                           this.field3272[var19] -= class117.field1429;
                           this.field3305[var19] = this.field3305[var19] * arg1 / 128;
                           this.field3218[var19] = this.field3218[var19] * arg2 / 128;
                           this.field3272[var19] = this.field3272[var19] * arg3 / 128;
                           this.field3305[var19] += class776.field11343;
                           this.field3218[var19] += class242.field3079;
                           this.field3272[var19] += class117.field1429;
                           ++var19;
                        }

                        if (var5 == 0) {
                           return;
                        }

                        ++var19;
                     }
                  }
               } else {
                  int var9 = 0;
                  if (var5 != 0) {
                     this.field3305[var9] -= class776.field11343;
                     this.field3218[var9] -= class242.field3079;
                     this.field3272[var9] -= class117.field1429;
                  } else if (var9 >= this.field3273) {
                     if (var5 == 0) {
                        return;
                     }
                  } else {
                     this.field3305[var9] -= class776.field11343;
                     this.field3218[var9] -= class242.field3079;
                     this.field3272[var9] -= class117.field1429;
                  }

                  while(true) {
                     if (~arg3 != -1) {
                        int var10 = class689.field10389[arg3];
                        int var11 = class689.field10391[arg3];
                        int var12 = this.field3218[var9] * var10 + 16383 - -(this.field3305[var9] * var11) >> 14;
                        this.field3218[var9] = this.field3218[var9] * var11 + -(this.field3305[var9] * var10) - -16383 >> 14;
                        this.field3305[var9] = var12;
                     }

                     if (arg1 != 0) {
                        int var13 = class689.field10389[arg1];
                        int var14 = class689.field10391[arg1];
                        int var15 = this.field3218[var9] * var14 + -(this.field3272[var9] * var13) + 16383 >> 14;
                        this.field3272[var9] = this.field3218[var9] * var13 - (-(this.field3272[var9] * var14) + -16383) >> 14;
                        this.field3218[var9] = var15;
                     }

                     if (~arg2 != -1) {
                        int var16 = class689.field10389[arg2];
                        int var17 = class689.field10391[arg2];
                        int var18 = this.field3305[var9] * var17 + this.field3272[var9] * var16 + 16383 >> 14;
                        this.field3272[var9] = this.field3272[var9] * var17 - -16383 + -(this.field3305[var9] * var16) >> 14;
                        this.field3305[var9] = var18;
                     }

                     this.field3305[var9] += class776.field11343;
                     this.field3218[var9] += class242.field3079;
                     this.field3272[var9] += class117.field1429;
                     ++var9;
                     if (var9 >= this.field3273) {
                        if (var5 == 0) {
                           return;
                        }
                     } else {
                        this.field3305[var9] -= class776.field11343;
                        this.field3218[var9] -= class242.field3079;
                        this.field3272[var9] -= class117.field1429;
                     }
                  }
               }
            } else {
               int var8 = 0;
               if (var5 != 0) {
                  this.field3305[var8] += arg1;
                  this.field3218[var8] += arg2;
                  this.field3272[var8] += arg3;
                  ++var8;
               }

               while(true) {
                  while(var8 < this.field3273) {
                     this.field3305[var8] += arg1;
                     this.field3218[var8] += arg2;
                     this.field3272[var8] += arg3;
                     ++var8;
                  }

                  if (var5 == 0) {
                     return;
                  }

                  ++var8;
               }
            }
         } else {
            int var6 = 0;
            class776.field11343 = 0;
            class242.field3079 = 0;
            class117.field1429 = 0;
            int var7 = 0;
            if (var5 != 0) {
               class776.field11343 += this.field3305[var7];
               class242.field3079 += this.field3218[var7];
               ++var6;
               class117.field1429 += this.field3272[var7];
               ++var7;
            }

            while(true) {
               while(var7 < this.field3273) {
                  class776.field11343 += this.field3305[var7];
                  class242.field3079 += this.field3218[var7];
                  ++var6;
                  class117.field1429 += this.field3272[var7];
                  ++var7;
               }

               int var10000 = ~var6;
               if (var5 == 0) {
                  if (var10000 >= -1) {
                     class242.field3079 = arg2;
                     class776.field11343 = arg1;
                     class117.field1429 = arg3;
                     return;
                  }

                  class117.field1429 = class117.field1429 / var6 + arg3;
                  class776.field11343 = class776.field11343 / var6 + arg1;
                  class242.field3079 = class242.field3079 / var6 + arg2;
                  return;
               }

               class117.field1429 = var10000 + -1;
               ++var7;
            }
         }
      } catch (RuntimeException var43) {
         throw class670.method4877(var43, field3307[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "G",
      descriptor = "()I",
      line = 1043
   )
   public final int method300() {
      try {
         if (!this.field3222) {
            this.method1859(-1);
         }

         ++field3285;
         return this.field3295;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3307[51] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "f",
      descriptor = "(I)V",
      line = 1056
   )
   private final void method1848(int arg0) {
      int var2 = client.field4530;

      try {
         ++field3268;
         if (this.field3210 != 0) {
            if (~this.field3224 != -1) {
               this.method1857((byte)-98, true);
            }

            this.method1857((byte)-96, false);
            if (arg0 < 113) {
               this.method307();
            }

            if (this.field3214 != null) {
               if (this.field3214.field1256 == null) {
                  this.method1856(-103, ~(this.field3224 & 16) != -1);
               }

               if (this.field3214.field1256 != null) {
                  this.field3284.method4822(76, this.field3291 != null);
                  this.field3284.method4847(this.field3293, 117, this.field3277, this.field3281, this.field3291);
                  int var3 = this.field3257.length + -1;
                  int var4 = 0;
                  if (var2 != 0 || var4 < var3) {
                     do {
                        int var5 = this.field3257[var4];
                        int var6 = this.field3257[var4 + 1];
                        int var7 = 65535 & this.field3274[var5];
                        if (~var7 == -65536) {
                           var7 = -1;
                        }

                        this.field3284.method4783(this.field3291 != null, true, var7);
                        this.field3284.method4781((var6 - var5) * 3, 4, this.field3214.field1256, var5 * 3, 1024);
                        ++var4;
                     } while(var4 < var3);
                  }
               }
            }

            this.method1861((byte)-38);
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field3307[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "p",
      descriptor = "(IILs;Ls;III)V",
      line = 1112
   )
   public final void method322(int arg0, int arg1, class293 arg2, class293 arg3, int arg4, int arg5, int arg6) {
      int var8 = client.field4530;

      try {
         ++field3232;
         if (!this.field3222) {
            this.method1859(-1);
         }

         int var9 = this.field3234 + arg4;
         int var10 = this.field3275 + arg4;
         int var11 = arg6 - -this.field3255;
         int var12 = this.field3295 + arg6;
         if (~arg0 != -2 && ~arg0 != -3 && ~arg0 != -4 && ~arg0 != -6 || var9 >= 0 && arg2.field4087 > arg2.field4080 + var10 >> arg2.field4086 && ~var11 <= -1 && arg2.field4081 > arg2.field4080 + var12 >> arg2.field4086) {
            if (arg0 != 4 && ~arg0 != -6) {
               int var13 = var9 >> arg2.field4086;
               int var14 = arg2.field4080 + -1 + var10 >> arg2.field4086;
               int var15 = var11 >> arg2.field4086;
               int var16 = var12 - 1 - -arg2.field4080 >> arg2.field4086;
               if (~arg5 == ~arg2.method2235(var15, 2116912585, var13) && ~arg2.method2235(var15, 2116912585, var14) == ~arg5 && arg5 == arg2.method2235(var16, 2116912585, var13) && ~arg5 == ~arg2.method2235(var16, 2116912585, var14)) {
                  return;
               }
            } else {
               if (arg3 == null) {
                  return;
               }

               if (var9 < 0 || ~arg3.field4087 >= ~(var10 - -arg3.field4080 >> arg3.field4086) || var11 < 0 || ~arg3.field4081 >= ~(arg3.field4080 + var12 >> arg3.field4086)) {
                  return;
               }
            }

            int var33;
            if (~arg0 == -2) {
               var33 = 0;
               if (var8 != 0 || var33 < this.field3273) {
                  do {
                     this.field3218[var33] = this.field3218[var33] - -arg2.method2236((byte)127, this.field3305[var33] + arg4, this.field3272[var33] - -arg6) + -arg5;
                     ++var33;
                  } while(var33 < this.field3273);
               }
            } else {
               label281: {
                  if (arg0 != 2) {
                     if (~arg0 != -4) {
                        if (~arg0 != -5) {
                           if (arg0 != 5) {
                              break label281;
                           }

                           int var17 = -this.field3256 + this.field3190;
                           int var18 = 0;
                           if (var8 != 0 || var18 < this.field3273) {
                              do {
                                 int var19 = this.field3305[var18] + arg4;
                                 int var20 = this.field3272[var18] - -arg6;
                                 int var21 = arg2.method2236((byte)100, var19, var20);
                                 int var22 = arg3.method2236((byte)103, var19, var20);
                                 int var23 = var21 - var22 - arg1;
                                 this.field3218[var18] = ((this.field3218[var18] << 8) / var17 * var23 >> 8) + var21 + -arg5;
                                 ++var18;
                              } while(var18 < this.field3273);
                           }

                           if (var8 == 0) {
                              break label281;
                           }
                        }

                        int var24 = this.field3190 - this.field3256;
                        int var25 = 0;
                        if (var8 != 0) {
                           this.field3218[var25] -= arg5 + -arg3.method2236((byte)110, this.field3305[var25] + arg4, this.field3272[var25] + arg6) - var24;
                           ++var25;
                        }

                        while(true) {
                           while(var25 < this.field3273) {
                              this.field3218[var25] -= arg5 + -arg3.method2236((byte)110, this.field3305[var25] + arg4, this.field3272[var25] + arg6) - var24;
                              ++var25;
                           }

                           if (var8 == 0) {
                              if (var8 == 0) {
                                 break label281;
                              }
                              break;
                           }

                           ++var25;
                        }
                     }

                     int var26 = (arg1 & 255) * 4;
                     int var27 = (255 & arg1 >> 8) * 4;
                     int var28 = 16320 & arg1 >> 16 << 6;
                     int var29 = (255 & arg1 >> 24) << 6;
                     if (-(var26 >> 1) + arg4 < 0 || ~(arg2.field4087 << arg2.field4086) >= ~((var26 >> 1) + arg4 + arg2.field4080) || -(var27 >> 1) + arg6 < 0 || arg2.field4081 << arg2.field4086 <= (var27 >> 1) + arg2.field4080 + arg6) {
                        return;
                     }

                     this.method3708(var27, arg4, arg5, var26, arg2, -124, var28, arg6, var29);
                     if (var8 == 0) {
                        break label281;
                     }
                  }

                  short var30 = this.field3256;
                  if (var30 == 0) {
                     return;
                  }

                  int var31 = 0;
                  if (var8 == 0 && var31 >= this.field3273) {
                     if (var8 != 0) {
                        var33 = 0;
                        if (var8 != 0 || var33 < this.field3273) {
                           do {
                              this.field3218[var33] = this.field3218[var33] - -arg2.method2236((byte)127, this.field3305[var33] + arg4, this.field3272[var33] - -arg6) + -arg5;
                              ++var33;
                           } while(var33 < this.field3273);
                        }
                     }
                  } else {
                     label184:
                     while(true) {
                        int var32 = (this.field3218[var31] << 16) / var30;
                        if (~arg1 < ~var32) {
                           this.field3218[var31] -= -((arg2.method2236((byte)103, this.field3305[var31] + arg4, this.field3272[var31] + arg6) + -arg5) * (-var32 + arg1) / arg1);
                        }

                        ++var31;
                        if (var31 >= this.field3273) {
                           if (var8 == 0) {
                              break;
                           }

                           var33 = 0;
                           if (var8 == 0 && var33 >= this.field3273) {
                              break;
                           }

                           while(true) {
                              this.field3218[var33] = this.field3218[var33] - -arg2.method2236((byte)127, this.field3305[var33] + arg4, this.field3272[var33] - -arg6) + -arg5;
                              ++var33;
                              if (var33 >= this.field3273) {
                                 break label184;
                              }
                           }
                        }
                     }
                  }
               }
            }

            if (this.field3277 != null) {
               this.field3277.field5840 = null;
            }

            this.field3222 = false;
         }
      } catch (RuntimeException var35) {
         throw class670.method4877(var35, field3307[42] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3307[0] : field3307[1]) + ',' + (arg3 != null ? field3307[0] : field3307[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "aa",
      descriptor = "(SS)V",
      line = 1271
   )
   public final void method324(short arg0, short arg1) {
      int var3 = client.field4530;

      try {
         ++field3269;
         class160 var4 = this.field3284.field813;
         int var5 = 0;
         if (var3 != 0) {
            if (this.field3274[var5] == arg0) {
               this.field3274[var5] = arg1;
            }

            ++var5;
         }

         while(true) {
            short var10000;
            short var10001;
            if (var5 >= this.field3201) {
               byte var6 = 0;
               byte var7 = 0;
               var10000 = arg0;
               var10001 = -1;
               if (var3 == 0) {
                  if (arg0 != -1) {
                     class327 var8 = var4.method1159(arg0 & 65535, 127);
                     var7 = var8.field4632;
                     var6 = var8.field4641;
                  }

                  byte var9 = 0;
                  byte var10 = 0;
                  if (~arg1 != 0) {
                     class327 var11 = var4.method1159(arg1 & 65535, 126);
                     var10 = var11.field4632;
                     var9 = var11.field4641;
                     if (~var11.field4654 != -1 || var11.field4656 != 0) {
                        this.field3185 = true;
                     }
                  }

                  if (var6 != var9 | var7 != var10) {
                     if (this.field3265 != null) {
                        int var12 = 0;
                        if (var3 != 0 || ~var12 > ~this.field3286) {
                           do {
                              class277 var13 = this.field3265[var12];
                              class613 var14 = this.field3303[var12];
                              var14.field8972 = class628.field9131[this.field3183[var13.field3858] & 65535] & 16777215 | var14.field8972 & -16777216;
                              ++var12;
                           } while(~var12 > ~this.field3286);
                        }
                     }

                     if (this.field3281 != null) {
                        this.field3281.field5840 = null;
                        return;
                     }
                  }

                  return;
               }
            } else {
               var10000 = this.field3274[var5];
               var10001 = arg0;
            }

            if (var10000 == var10001) {
               this.field3274[var5] = arg1;
            }

            ++var5;
         }
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field3307[24] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "LA",
      descriptor = "(I)V",
      line = 1345
   )
   public final void method314(int arg0) {
      try {
         ++field3219;
         if (this.field3281 != null) {
            this.field3281.field5840 = null;
         }

         this.field3188 = (short)arg0;
         if (this.field3291 != null) {
            this.field3291.field5840 = null;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3307[60] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "e",
      descriptor = "()V",
      line = 1362
   )
   public final void method307() {
      try {
         ++field3240;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3307[63] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(II)I",
      line = 1370
   )
   public static final int method1849(int arg0, int arg1) {
      return class583.field8642 != null ? class583.field8642[arg0][arg1] & 255 : 0;
   }

   @OriginalMember(
      owner = "client!lf",
      name = "e",
      descriptor = "(I)V",
      line = 1376
   )
   private final void method1850(int arg0) {
      int var2 = client.field4530;

      try {
         if (arg0 >= -27) {
            this.method329(-115, -98, 107, -58);
         }

         if (this.field3265 != null) {
            class247 var10000;
            label52: {
               class218 var3 = this.field3284.field9897;
               this.field3284.method4838(1);
               this.field3284.method622(!this.field3212);
               this.field3284.method4822(21, false);
               this.field3284.method4847(this.field3284.field10001, 117, this.field3284.field9954, (class380)null, (class380)null);
               int var4 = 0;
               if (var2 != 0) {
                  var10000 = this;
               } else if (~var4 <= ~this.field3286) {
                  this.field3284.method622(true);
                  var10000 = this;
                  if (var2 == 0) {
                     break label52;
                  }
               } else {
                  var10000 = this;
               }

               while(true) {
                  class277 var5 = var10000.field3265[var4];
                  class613 var6 = this.field3303[var4];
                  if (var5.field3864 && this.field3284.method657()) {
                     ++var4;
                  } else {
                     float var7 = (float)(this.field3305[var5.field3871] + this.field3305[var5.field3866] + this.field3305[var5.field3867]) * 0.3333333F;
                     float var8 = (float)(this.field3218[var5.field3871] + this.field3218[var5.field3866] - -this.field3218[var5.field3867]) * 0.3333333F;
                     float var9 = (float)(this.field3272[var5.field3871] + this.field3272[var5.field3867] + this.field3272[var5.field3866]) * 0.3333333F;
                     float var10 = class289.field4056 * var9 + class536.field7844 * var8 + class405.field6204 * var7 + class747.field11070;
                     float var11 = class612.field8963 * var9 + class743.field11020 * var7 + class323.field4599 * var8 + class394.field5989;
                     float var12 = class639.field9301 * var9 + class263.field3600 * var7 + class164.field2058 * var8 + class540.field7876;
                     float var13 = (float)(1.0D / Math.sqrt((double)(var12 * var12 + var10 * var10 + var11 * var11))) * (float)var5.field3862;
                     var3.method1644(26282, (float)var6.field8964 + var10 - var10 * var13, var5.field3863 * var6.field8971 >> 7, var11 * var13 + (float)var6.field8968 + -var11, var6.field8970, var12 * var13 + -var12, var5.field3860 * var6.field8967 >> 7);
                     this.field3284.method4831(var3, 32993);
                     int var14 = var6.field8972;
                     OpenGL.glColor4ub((byte)(var14 >> 16), (byte)(var14 >> 8), (byte)var14, (byte)(var14 >> 24));
                     this.field3284.method4840(var5.field3865, (byte)125);
                     this.field3284.method4854(-3, var5.field3870);
                     this.field3284.method4806(4, 0, -105, 7);
                     ++var4;
                  }

                  if (~var4 <= ~this.field3286) {
                     this.field3284.method622(true);
                     var10000 = this;
                     if (var2 == 0) {
                        break;
                     }
                  } else {
                     var10000 = this;
                  }
               }
            }

            var10000.field3284.method4790((byte)46);
         }

         ++field3246;
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field3307[23] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "b",
      descriptor = "(BZ)V",
      line = 1435
   )
   public static final void method1851(byte arg0, boolean arg1) {
      int var2 = client.field4530;

      try {
         if (arg1) {
            if (class198.field2452 != -1) {
               class777.method5594(class198.field2452, arg0 ^ -118);
            }

            int var10000;
            label69: {
               class624 var3 = (class624)class573.field8525.method5677((byte)44);
               if (var2 != 0) {
                  var10000 = var3.method2716(0);
               } else if (var3 == null) {
                  class198.field2452 = -1;
                  class573.field8525 = new class791(8);
                  class357.method2787(-17687);
                  class198.field2452 = class22.field236;
                  class520.method3833(false, (byte)-79);
                  class491.method3635((byte)-19);
                  var10000 = class198.field2452;
                  if (var2 == 0) {
                     break label69;
                  }
               } else {
                  var10000 = var3.method2716(0);
               }

               label68:
               do {
                  while(true) {
                     if (var10000 == 0) {
                        var3 = (class624)class573.field8525.method5677((byte)44);
                        if (var3 == null) {
                           if (var2 == 0) {
                              class198.field2452 = -1;
                              class573.field8525 = new class791(8);
                              class357.method2787(-17687);
                              class198.field2452 = class22.field236;
                              class520.method3833(false, (byte)-79);
                              class491.method3635((byte)-19);
                              var10000 = class198.field2452;
                              break;
                           }

                           class217.method1640(var3, (byte)114, true, false);
                           var3 = (class624)class573.field8525.method5671(-116);
                        } else {
                           class217.method1640(var3, (byte)114, true, false);
                           var3 = (class624)class573.field8525.method5671(-116);
                        }
                     } else {
                        class217.method1640(var3, (byte)114, true, false);
                        var3 = (class624)class573.field8525.method5671(-116);
                     }

                     if (var3 == null) {
                        class198.field2452 = -1;
                        class573.field8525 = new class791(8);
                        class357.method2787(-17687);
                        class198.field2452 = class22.field236;
                        class520.method3833(false, (byte)-79);
                        class491.method3635((byte)-19);
                        var10000 = class198.field2452;
                        if (var2 == 0) {
                           break label68;
                        }
                     } else {
                        var10000 = var3.method2716(0);
                     }
                  }
               } while(var2 != 0);
            }

            class265.method2014(var10000);
         }

         ++field3258;
         class634.method4566(arg0 + 300);
         class721.field10733 = false;
         class426.method3247(Integer.MIN_VALUE);
         class444.field6754 = -1;
         class58.method488(class20.field222, (byte)-109);
         if (arg0 != -44) {
            field3251 = 100;
         }

         label36: {
            class693.field10418 = new class687();
            class693.field10418.field6114[0] = class323.field4603 / 2;
            class693.field10418.field9003 = class323.field4603 * 512 / 2;
            class693.field10418.field9007 = class178.field2197 * 512 / 2;
            class232.field2947 = 0;
            class731.field10844 = 0;
            class693.field10418.field6116[0] = class178.field2197 / 2;
            if (class675.field10142 == 2) {
               class232.field2947 = class513.field7524 << 9;
               class731.field10844 = class552.field8167 << 9;
               if (var2 == 0) {
                  break label36;
               }
            }

            class787.method5648(true);
         }

         class239.method1784(1);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field3307[47] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(I)V",
      line = 1503
   )
   public final void method316(int arg0) {
      int var2 = client.field4530;

      try {
         ++field3245;
         int var3 = class689.field10389[arg0];
         int var4 = class689.field10391[arg0];
         int var5 = 0;
         class247 var10000;
         if (var2 != 0) {
            var10000 = this;
         } else if (~this.field3273 >= ~var5) {
            this.field3222 = false;
            var10000 = this;
            if (var2 == 0) {
               if (this.field3277 != null) {
                  this.field3277.field5840 = null;
                  return;
               }

               return;
            }
         } else {
            var10000 = this;
         }

         while(true) {
            int var6 = var10000.field3272[var5] * var3 - -(this.field3305[var5] * var4) >> 14;
            this.field3272[var5] = this.field3272[var5] * var4 - this.field3305[var5] * var3 >> 14;
            this.field3305[var5] = var6;
            ++var5;
            if (~this.field3273 >= ~var5) {
               this.field3222 = false;
               var10000 = this;
               if (var2 == 0) {
                  if (this.field3277 != null) {
                     this.field3277.field5840 = null;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = this;
            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field3307[30] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "k",
      descriptor = "(I)V",
      line = 1536
   )
   public final void method328(int arg0) {
      int var2 = client.field4530;

      try {
         ++field3209;
         int var3 = class689.field10389[arg0];
         int var4 = class689.field10391[arg0];
         int var5 = 0;
         int var6;
         if (var2 != 0) {
            var6 = this.field3272[var5] * var3 - -(this.field3305[var5] * var4) >> 14;
            this.field3272[var5] = this.field3272[var5] * var4 + -(this.field3305[var5] * var3) >> 14;
            this.field3305[var5] = var6;
            ++var5;
         }

         while(true) {
            while(~this.field3273 < ~var5) {
               var6 = this.field3272[var5] * var3 - -(this.field3305[var5] * var4) >> 14;
               this.field3272[var5] = this.field3272[var5] * var4 + -(this.field3305[var5] * var3) >> 14;
               this.field3305[var5] = var6;
               ++var5;
            }

            int var7 = 0;
            if (var2 == 0) {
               if (var2 == 0 && ~var7 <= ~this.field3191) {
                  if (this.field3291 == null && this.field3281 != null) {
                     this.field3281.field5840 = null;
                  }

                  if (this.field3291 != null) {
                     this.field3291.field5840 = null;
                  }

                  this.field3222 = false;
                  if (this.field3277 != null) {
                     this.field3277.field5840 = null;
                     return;
                  } else {
                     return;
                  }
               } else {
                  do {
                     int var8 = this.field3267[var7] * var4 + this.field3189[var7] * var3 >> 14;
                     this.field3189[var7] = (short)(this.field3189[var7] * var4 + -(this.field3267[var7] * var3) >> 14);
                     this.field3267[var7] = (short)var8;
                     ++var7;
                  } while(~var7 > ~this.field3191);

                  if (this.field3291 == null && this.field3281 != null) {
                     this.field3281.field5840 = null;
                  }

                  if (this.field3291 != null) {
                     this.field3291.field5840 = null;
                  }

                  this.field3222 = false;
                  if (this.field3277 != null) {
                     this.field3277.field5840 = null;
                     return;
                  } else {
                     return;
                  }
               }
            }

            ++var5;
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field3307[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "<init>",
      descriptor = "(Lck;)V",
      line = 5842
   )
   public class247(class667 arg0) {
      this.field3185 = false;
      this.field3222 = false;
      this.field3210 = 0;
      this.field3191 = 0;
      this.field3273 = 0;
      this.field3201 = 0;
      this.field3270 = true;
      this.field3212 = false;
      this.field3297 = 0;

      try {
         this.field3284 = arg0;
         this.field3277 = new class380((class390)null, 5126, 3, 0);
         this.field3293 = new class380((class390)null, 5126, 2, 0);
         this.field3291 = new class380((class390)null, 5126, 3, 0);
         this.field3281 = new class380((class390)null, 5121, 4, 0);
         this.field3214 = new class104();
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3307[56] + (arg0 != null ? field3307[0] : field3307[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "<init>",
      descriptor = "(Lck;Lut;IIII)V",
      line = 5862
   )
   public class247(class667 arg0, class134 arg1, int arg2, int arg3, int arg4, int arg5) {
      int var7 = client.field4530;
      super();
      this.field3185 = false;
      this.field3222 = false;
      this.field3210 = 0;
      this.field3191 = 0;
      this.field3273 = 0;
      this.field3201 = 0;
      this.field3270 = true;
      this.field3212 = false;
      this.field3297 = 0;

      try {
         this.field3236 = arg5;
         this.field3249 = arg2;
         this.field3284 = arg0;
         if (class573.method4241(arg5, arg2, 2048)) {
            this.field3277 = new class380((class390)null, 5126, 3, 0);
         }

         if (class139.method1178(arg5, 123, arg2)) {
            this.field3293 = new class380((class390)null, 5126, 2, 0);
         }

         if (class156.method1293(55, arg5, arg2)) {
            this.field3291 = new class380((class390)null, 5126, 3, 0);
         }

         if (class243.method1805(arg5, arg2, true)) {
            this.field3281 = new class380((class390)null, 5121, 4, 0);
         }

         if (class380.method2937(arg2, 35, arg5)) {
            this.field3214 = new class104();
         }

         class160 var8 = arg0.field813;
         int[] var9 = new int[arg1.field1691];
         this.field3187 = new int[arg1.field1671 + 1];
         int var10 = 0;
         class327 var11;
         if (var7 != 0) {
            if (arg1.field1690 != null) {
               if (arg1.field1690[var10] != 2) {
                  if (arg1.field1683 != null) {
                     if (arg1.field1683[var10] != -1) {
                        var11 = var8.method1159(arg1.field1683[var10] & 65535, 122);
                        if (~(this.field3236 & 64) != -1) {
                           if (!var11.field4649) {
                              if (var11.field4643) {
                                 if (var7 != 0) {
                                    var9[this.field3201++] = var10;
                                    ++this.field3187[arg1.field1701[var10]];
                                    ++this.field3187[arg1.field1707[var10]];
                                    ++this.field3187[arg1.field1674[var10]];
                                    ++var10;
                                 } else {
                                    ++var10;
                                 }
                              } else {
                                 var9[this.field3201++] = var10;
                                 ++this.field3187[arg1.field1701[var10]];
                                 ++this.field3187[arg1.field1707[var10]];
                                 ++this.field3187[arg1.field1674[var10]];
                                 ++var10;
                              }
                           } else {
                              var9[this.field3201++] = var10;
                              ++this.field3187[arg1.field1701[var10]];
                              ++this.field3187[arg1.field1707[var10]];
                              ++this.field3187[arg1.field1674[var10]];
                              ++var10;
                           }
                        } else if (var11.field4643) {
                           if (var7 != 0) {
                              var9[this.field3201++] = var10;
                              ++this.field3187[arg1.field1701[var10]];
                              ++this.field3187[arg1.field1707[var10]];
                              ++this.field3187[arg1.field1674[var10]];
                              ++var10;
                           } else {
                              ++var10;
                           }
                        } else {
                           var9[this.field3201++] = var10;
                           ++this.field3187[arg1.field1701[var10]];
                           ++this.field3187[arg1.field1707[var10]];
                           ++this.field3187[arg1.field1674[var10]];
                           ++var10;
                        }
                     } else {
                        var9[this.field3201++] = var10;
                        ++this.field3187[arg1.field1701[var10]];
                        ++this.field3187[arg1.field1707[var10]];
                        ++this.field3187[arg1.field1674[var10]];
                        ++var10;
                     }
                  } else {
                     var9[this.field3201++] = var10;
                     ++this.field3187[arg1.field1701[var10]];
                     ++this.field3187[arg1.field1707[var10]];
                     ++this.field3187[arg1.field1674[var10]];
                     ++var10;
                  }
               } else {
                  ++var10;
               }
            } else if (arg1.field1683 != null) {
               if (arg1.field1683[var10] != -1) {
                  var11 = var8.method1159(arg1.field1683[var10] & 65535, 122);
                  if (~(this.field3236 & 64) != -1) {
                     if (!var11.field4649) {
                        if (var11.field4643) {
                           if (var7 != 0) {
                              var9[this.field3201++] = var10;
                              ++this.field3187[arg1.field1701[var10]];
                              ++this.field3187[arg1.field1707[var10]];
                              ++this.field3187[arg1.field1674[var10]];
                              ++var10;
                           } else {
                              ++var10;
                           }
                        } else {
                           var9[this.field3201++] = var10;
                           ++this.field3187[arg1.field1701[var10]];
                           ++this.field3187[arg1.field1707[var10]];
                           ++this.field3187[arg1.field1674[var10]];
                           ++var10;
                        }
                     } else {
                        var9[this.field3201++] = var10;
                        ++this.field3187[arg1.field1701[var10]];
                        ++this.field3187[arg1.field1707[var10]];
                        ++this.field3187[arg1.field1674[var10]];
                        ++var10;
                     }
                  } else if (var11.field4643) {
                     if (var7 != 0) {
                        var9[this.field3201++] = var10;
                        ++this.field3187[arg1.field1701[var10]];
                        ++this.field3187[arg1.field1707[var10]];
                        ++this.field3187[arg1.field1674[var10]];
                        ++var10;
                     } else {
                        ++var10;
                     }
                  } else {
                     var9[this.field3201++] = var10;
                     ++this.field3187[arg1.field1701[var10]];
                     ++this.field3187[arg1.field1707[var10]];
                     ++this.field3187[arg1.field1674[var10]];
                     ++var10;
                  }
               } else {
                  var9[this.field3201++] = var10;
                  ++this.field3187[arg1.field1701[var10]];
                  ++this.field3187[arg1.field1707[var10]];
                  ++this.field3187[arg1.field1674[var10]];
                  ++var10;
               }
            } else {
               var9[this.field3201++] = var10;
               ++this.field3187[arg1.field1701[var10]];
               ++this.field3187[arg1.field1707[var10]];
               ++this.field3187[arg1.field1674[var10]];
               ++var10;
            }
         }

         while(true) {
            while(~var10 > ~arg1.field1691) {
               if (arg1.field1690 != null) {
                  if (arg1.field1690[var10] != 2) {
                     if (arg1.field1683 != null) {
                        if (arg1.field1683[var10] != -1) {
                           var11 = var8.method1159(arg1.field1683[var10] & 65535, 122);
                           if (~(this.field3236 & 64) != -1) {
                              if (!var11.field4649) {
                                 if (var11.field4643) {
                                    if (var7 != 0) {
                                       var9[this.field3201++] = var10;
                                       ++this.field3187[arg1.field1701[var10]];
                                       ++this.field3187[arg1.field1707[var10]];
                                       ++this.field3187[arg1.field1674[var10]];
                                       ++var10;
                                    } else {
                                       ++var10;
                                    }
                                 } else {
                                    var9[this.field3201++] = var10;
                                    ++this.field3187[arg1.field1701[var10]];
                                    ++this.field3187[arg1.field1707[var10]];
                                    ++this.field3187[arg1.field1674[var10]];
                                    ++var10;
                                 }
                              } else {
                                 var9[this.field3201++] = var10;
                                 ++this.field3187[arg1.field1701[var10]];
                                 ++this.field3187[arg1.field1707[var10]];
                                 ++this.field3187[arg1.field1674[var10]];
                                 ++var10;
                              }
                           } else if (var11.field4643) {
                              if (var7 != 0) {
                                 var9[this.field3201++] = var10;
                                 ++this.field3187[arg1.field1701[var10]];
                                 ++this.field3187[arg1.field1707[var10]];
                                 ++this.field3187[arg1.field1674[var10]];
                                 ++var10;
                              } else {
                                 ++var10;
                              }
                           } else {
                              var9[this.field3201++] = var10;
                              ++this.field3187[arg1.field1701[var10]];
                              ++this.field3187[arg1.field1707[var10]];
                              ++this.field3187[arg1.field1674[var10]];
                              ++var10;
                           }
                        } else {
                           var9[this.field3201++] = var10;
                           ++this.field3187[arg1.field1701[var10]];
                           ++this.field3187[arg1.field1707[var10]];
                           ++this.field3187[arg1.field1674[var10]];
                           ++var10;
                        }
                     } else {
                        var9[this.field3201++] = var10;
                        ++this.field3187[arg1.field1701[var10]];
                        ++this.field3187[arg1.field1707[var10]];
                        ++this.field3187[arg1.field1674[var10]];
                        ++var10;
                     }
                  } else {
                     ++var10;
                  }
               } else if (arg1.field1683 != null) {
                  if (arg1.field1683[var10] != -1) {
                     var11 = var8.method1159(arg1.field1683[var10] & 65535, 122);
                     if (~(this.field3236 & 64) != -1) {
                        if (!var11.field4649) {
                           if (var11.field4643) {
                              if (var7 != 0) {
                                 var9[this.field3201++] = var10;
                                 ++this.field3187[arg1.field1701[var10]];
                                 ++this.field3187[arg1.field1707[var10]];
                                 ++this.field3187[arg1.field1674[var10]];
                                 ++var10;
                              } else {
                                 ++var10;
                              }
                           } else {
                              var9[this.field3201++] = var10;
                              ++this.field3187[arg1.field1701[var10]];
                              ++this.field3187[arg1.field1707[var10]];
                              ++this.field3187[arg1.field1674[var10]];
                              ++var10;
                           }
                        } else {
                           var9[this.field3201++] = var10;
                           ++this.field3187[arg1.field1701[var10]];
                           ++this.field3187[arg1.field1707[var10]];
                           ++this.field3187[arg1.field1674[var10]];
                           ++var10;
                        }
                     } else if (var11.field4643) {
                        if (var7 != 0) {
                           var9[this.field3201++] = var10;
                           ++this.field3187[arg1.field1701[var10]];
                           ++this.field3187[arg1.field1707[var10]];
                           ++this.field3187[arg1.field1674[var10]];
                           ++var10;
                        } else {
                           ++var10;
                        }
                     } else {
                        var9[this.field3201++] = var10;
                        ++this.field3187[arg1.field1701[var10]];
                        ++this.field3187[arg1.field1707[var10]];
                        ++this.field3187[arg1.field1674[var10]];
                        ++var10;
                     }
                  } else {
                     var9[this.field3201++] = var10;
                     ++this.field3187[arg1.field1701[var10]];
                     ++this.field3187[arg1.field1707[var10]];
                     ++this.field3187[arg1.field1674[var10]];
                     ++var10;
                  }
               } else {
                  var9[this.field3201++] = var10;
                  ++this.field3187[arg1.field1701[var10]];
                  ++this.field3187[arg1.field1707[var10]];
                  ++this.field3187[arg1.field1674[var10]];
                  ++var10;
               }
            }

            this.field3210 = this.field3201;
            long[] var12 = new long[this.field3201];
            int var10000 = ~(this.field3249 & 256);
            if (var7 == 0) {
               label1096: {
                  boolean var13 = var10000 != -1;
                  int var14 = 0;
                  if (var7 != 0) {
                     var10000 = var9[var14];
                  } else if (~this.field3201 >= ~var14) {
                     class323.method2441(var9, var12, -107);
                     this.field3272 = arg1.field1699;
                     this.field3305 = arg1.field1696;
                     this.field3218 = arg1.field1714;
                     this.field3298 = arg1.field1685;
                     this.field3297 = arg1.field1672;
                     this.field3273 = arg1.field1671;
                     this.field3306 = arg1.field1702;
                     var10000 = this.field3273;
                     if (var7 == 0) {
                        break label1096;
                     }
                  } else {
                     var10000 = var9[var14];
                  }

                  while(true) {
                     label3360: {
                        int var15 = var10000;
                        class327 var16 = null;
                        int var17 = 0;
                        byte var18 = 0;
                        byte var19 = 0;
                        byte var20 = 0;
                        if (arg1.field1679 != null) {
                           boolean var21 = false;
                           int var22 = 0;
                           class556 var23;
                           class571 var24;
                           class327 var25;
                           if (var7 != 0) {
                              var23 = arg1.field1679[var22];
                              if (~var23.field8252 == ~var15) {
                                 var24 = class286.method2178((byte)-71, var23.field8251);
                                 if (var24.field8512) {
                                    var21 = true;
                                 }

                                 if (~var24.field8511 != 0) {
                                    var25 = var8.method1159(var24.field8511, 123);
                                    if (var25.field4636 == 2) {
                                       this.field3212 = true;
                                    }
                                 }
                              }

                              ++var22;
                           }

                           while(~var22 > ~arg1.field1679.length) {
                              var23 = arg1.field1679[var22];
                              if (~var23.field8252 == ~var15) {
                                 var24 = class286.method2178((byte)-71, var23.field8251);
                                 if (var24.field8512) {
                                    var21 = true;
                                 }

                                 if (~var24.field8511 != 0) {
                                    var25 = var8.method1159(var24.field8511, 123);
                                    if (var25.field4636 == 2) {
                                       this.field3212 = true;
                                    }
                                 }
                              }

                              ++var22;
                           }

                           if (var21) {
                              var12[var14] = Long.MAX_VALUE;
                              --this.field3210;
                              if (var7 == 0) {
                                 ++var14;
                                 break label3360;
                              }
                           }
                        }

                        short var26 = -1;
                        if (arg1.field1683 != null) {
                           var26 = arg1.field1683[var15];
                           if (~var26 != 0) {
                              var16 = var8.method1159(65535 & var26, 122);
                              if (~(this.field3236 & 64) != -1) {
                                 if (!var16.field4649) {
                                    if (var16.field4654 == 0) {
                                       if (~var16.field4656 != -1) {
                                          this.field3185 = true;
                                       }
                                    } else {
                                       this.field3185 = true;
                                    }

                                    var20 = var16.field4642;
                                    var19 = var16.field4655;
                                    if (var7 != 0) {
                                       var26 = -1;
                                       var16 = null;
                                    }
                                 } else {
                                    var26 = -1;
                                    var16 = null;
                                 }
                              } else {
                                 if (var16.field4654 == 0) {
                                    if (~var16.field4656 != -1) {
                                       this.field3185 = true;
                                    }
                                 } else {
                                    this.field3185 = true;
                                 }

                                 var20 = var16.field4642;
                                 var19 = var16.field4655;
                                 if (var7 != 0) {
                                    var26 = -1;
                                    var16 = null;
                                 }
                              }
                           }
                        }

                        boolean var27 = arg1.field1694 != null ? (arg1.field1694[var15] == 0 ? (var16 != null ? var16.field4636 != 0 : false) : true) : (var16 != null ? var16.field4636 != 0 : false);
                        if (!var13) {
                           if (var27 && arg1.field1688 != null) {
                              var17 += arg1.field1688[var15] << 17;
                           }
                        } else if (arg1.field1688 != null) {
                           var17 += arg1.field1688[var15] << 17;
                        }

                        if (var27) {
                           var17 += 65536;
                        }

                        int var28 = (var19 << 8 & 65280) + var17;
                        int var29 = (var20 & 255) + var28;
                        int var30 = (-65536 & var26 << 16) + var18;
                        int var31 = (65535 & var14) + var30;
                        var12[var14] = ((long)var29 << 32) - -((long)var31);
                        this.field3212 |= var27;
                        this.field3185 |= var16 != null ? (~var16.field4654 == -1 ? ~var16.field4656 != -1 : true) : false;
                        ++var14;
                     }

                     if (~this.field3201 >= ~var14) {
                        class323.method2441(var9, var12, -107);
                        this.field3272 = arg1.field1699;
                        this.field3305 = arg1.field1696;
                        this.field3218 = arg1.field1714;
                        this.field3298 = arg1.field1685;
                        this.field3297 = arg1.field1672;
                        this.field3273 = arg1.field1671;
                        this.field3306 = arg1.field1702;
                        var10000 = this.field3273;
                        if (var7 == 0) {
                           break;
                        }
                     } else {
                        var10000 = var9[var14];
                     }
                  }
               }

               class168[] var32 = new class168[var10000];
               this.field3292 = arg1.field1695;
               int var10002;
               int var33;
               int var40;
               int var41;
               int var42;
               class768 var43;
               class635[] var44;
               int var45;
               int var46;
               short var47;
               short var48;
               int var49;
               int var50;
               int var51;
               int var52;
               int var53;
               int var54;
               int var55;
               int var56;
               int var57;
               int var58;
               int var59;
               int var60;
               int var61;
               byte var62;
               class168 var63;
               class168 var64;
               class168 var65;
               class635 var66;
               int var67;
               int var68;
               int var69;
               int var70;
               short var71;
               class327 var72;
               float var73;
               float var74;
               float var75;
               float var76;
               float var77;
               float var78;
               byte var79;
               byte var80;
               int var81;
               byte var82;
               short var83;
               short var84;
               short var85;
               int var86;
               int var87;
               int var88;
               float[] var89;
               byte var90;
               float var91;
               float var92;
               float var93;
               float var94;
               float var95;
               int var96;
               int var97;
               int var98;
               int var99;
               int var100;
               int var101;
               int var102;
               int var103;
               int var104;
               float var105;
               float var106;
               float var107;
               float var108;
               float var109;
               float var110;
               short var111;
               short var112;
               short var113;
               short var114;
               short var115;
               short var116;
               float var117;
               float var118;
               float var119;
               float var120;
               float var121;
               float var122;
               float var123;
               float var124;
               float var125;
               float var126;
               float var127;
               float var128;
               float var129;
               float var130;
               float var131;
               float var132;
               float var133;
               float var134;
               float var135;
               float var136;
               float var137;
               float var138;
               float var139;
               float var140;
               float var141;
               float var142;
               float var143;
               float var144;
               float var145;
               byte var146;
               long var147;
               short var149;
               short var150;
               short var151;
               class168 var152;
               class168 var153;
               class168 var154;
               class635 var155;
               long var156;
               int var158;
               short var159;
               short var160;
               int var161;
               int[] var162;
               int var163;
               int var164;
               int var165;
               int var166;
               int var169;
               class134 var170;
               class247 var171;
               if (arg1.field1679 != null) {
                  this.field3286 = arg1.field1679.length;
                  this.field3265 = new class277[this.field3286];
                  this.field3303 = new class613[this.field3286];
                  var33 = 0;
                  if (var7 != 0) {
                     var170 = arg1;
                  } else if (~var33 <= ~this.field3286) {
                     var33 = this.field3201 * 3;
                     this.field3195 = new short[var33];
                     this.field3184 = new float[var33];
                     this.field3183 = new short[this.field3201];
                     this.field3300 = new short[this.field3201];
                     this.field3274 = new short[this.field3201];
                     this.field3237 = new float[var33];
                     this.field3247 = new byte[this.field3201];
                     this.field3259 = (short)arg3;
                     this.field3289 = new byte[var33];
                     this.field3189 = new short[var33];
                     this.field3282 = new short[this.field3201];
                     class37.field400 = new long[var33];
                     this.field3299 = new short[var33];
                     this.field3267 = new short[var33];
                     this.field3199 = new short[this.field3201];
                     var170 = arg1;
                     if (var7 == 0) {
                        if (arg1.field1706 != null) {
                           this.field3204 = new short[this.field3201];
                        }

                        this.field3188 = (short)arg4;
                        var40 = 0;
                        var41 = 0;
                        if (var7 != 0) {
                           var42 = this.field3187[var41];
                           this.field3187[var41] = var40;
                           var32[var41] = new class168();
                           var40 += var42;
                           ++var41;
                        }

                        while(true) {
                           if (arg1.field1671 <= var41) {
                              this.field3187[arg1.field1671] = var40;
                              var43 = class724.method5250(Integer.MAX_VALUE, this.field3201, var9, arg1);
                              var44 = new class635[arg1.field1691];
                              var10000 = 0;
                              if (var7 == 0) {
                                 label2083: {
                                    var45 = 0;
                                    if (var7 != 0) {
                                       var46 = arg1.field1701[var45];
                                    } else if (~arg1.field1691 >= ~var45) {
                                       var46 = 0;
                                       if (var7 == 0) {
                                          break label2083;
                                       }
                                    } else {
                                       var46 = arg1.field1701[var45];
                                    }

                                    label2086:
                                    while(true) {
                                       var47 = arg1.field1707[var45];
                                       var48 = arg1.field1674[var45];
                                       var49 = this.field3305[var47] + -this.field3305[var46];
                                       var50 = this.field3218[var47] + -this.field3218[var46];
                                       var51 = this.field3272[var47] + -this.field3272[var46];
                                       var52 = this.field3305[var48] + -this.field3305[var46];
                                       var53 = this.field3218[var48] + -this.field3218[var46];
                                       var54 = this.field3272[var48] - this.field3272[var46];
                                       var55 = var50 * var54 + -(var51 * var53);
                                       var56 = var51 * var52 - var49 * var54;
                                       var57 = var49 * var53 + -(var50 * var52);
                                       if (var7 != 0) {
                                          var55 >>= 1;
                                          var56 >>= 1;
                                          var57 >>= 1;
                                       }

                                       while(true) {
                                          while(true) {
                                             if (var55 <= 8192) {
                                                var10000 = ~var56;
                                                if (var7 != 0) {
                                                   var57 = var10000 >> -8193;
                                                   continue;
                                                }

                                                if (var10000 >= -8193 && var57 <= 8192 && ~var55 <= 8191 && ~var56 <= 8191 && var57 >= -8192) {
                                                   var58 = (int)Math.sqrt((double)(var57 * var57 + var55 * var55 + var56 * var56));
                                                   if (var58 <= 0) {
                                                      var58 = 1;
                                                   }

                                                   var59 = var57 * 256 / var58;
                                                   var60 = var55 * 256 / var58;
                                                   var61 = var56 * 256 / var58;
                                                   var62 = arg1.field1690 == null ? 0 : arg1.field1690[var45];
                                                   if (~var62 == -1) {
                                                      var63 = var32[var46];
                                                      var63.field2092 += var61;
                                                      var63.field2090 += var59;
                                                      ++var63.field2098;
                                                      var63.field2094 += var60;
                                                      var64 = var32[var47];
                                                      var64.field2094 += var60;
                                                      var64.field2090 += var59;
                                                      var64.field2092 += var61;
                                                      ++var64.field2098;
                                                      var65 = var32[var48];
                                                      var65.field2092 += var61;
                                                      ++var65.field2098;
                                                      var65.field2094 += var60;
                                                      var65.field2090 += var59;
                                                      if (var7 != 0) {
                                                         if (var62 == 1) {
                                                            var66 = var44[var45] = new class635();
                                                            var66.field9245 = var60;
                                                            var66.field9247 = var61;
                                                            var66.field9243 = var59;
                                                         }

                                                         ++var45;
                                                      } else {
                                                         ++var45;
                                                      }
                                                   } else {
                                                      if (var62 == 1) {
                                                         var66 = var44[var45] = new class635();
                                                         var66.field9245 = var60;
                                                         var66.field9247 = var61;
                                                         var66.field9243 = var59;
                                                      }

                                                      ++var45;
                                                   }

                                                   if (~arg1.field1691 >= ~var45) {
                                                      var46 = 0;
                                                      if (var7 == 0) {
                                                         break label2086;
                                                      }
                                                   } else {
                                                      var46 = arg1.field1701[var45];
                                                   }
                                                   continue label2086;
                                                }
                                             }

                                             var55 >>= 1;
                                             var56 >>= 1;
                                             var57 >>= 1;
                                          }
                                       }
                                    }
                                 }

                                 if (var7 != 0) {
                                    var67 = var9[var46];
                                    var68 = arg1.field1682[var67] & 65535;
                                    if (arg1.field1697 == null) {
                                       var69 = -1;
                                       if (var7 != 0) {
                                          var69 = arg1.field1697[var67];
                                       }
                                    } else {
                                       var69 = arg1.field1697[var67];
                                    }

                                    if (arg1.field1694 != null) {
                                       var70 = 255 & arg1.field1694[var67];
                                       if (var7 != 0) {
                                          var70 = 0;
                                       }
                                    } else {
                                       var70 = 0;
                                    }

                                    var71 = arg1.field1683 == null ? -1 : arg1.field1683[var67];
                                    if (var71 != -1 && ~(this.field3236 & 64) != -1) {
                                       var72 = var8.method1159(65535 & var71, 124);
                                       if (var72.field4649) {
                                          var71 = -1;
                                       }
                                    }
                                 } else {
                                    if (~var46 <= ~this.field3201) {
                                       var67 = 0;
                                       var68 = -10000;
                                       var158 = 0;
                                       if (var7 == 0) {
                                          if (var7 != 0) {
                                             var159 = this.field3274[var158];
                                             if (~var68 != ~var159) {
                                                ++var67;
                                                var68 = var159;
                                             }

                                             ++var158;
                                          }

                                          while(true) {
                                             if (var158 >= this.field3210) {
                                                this.field3257 = new int[var67 + 1];
                                                var67 = 0;
                                                var68 = -10000;
                                                var169 = 0;
                                                if (var7 == 0) {
                                                   if (var7 != 0) {
                                                      var160 = this.field3274[var169];
                                                      if (var68 != var160) {
                                                         var68 = var160;
                                                         this.field3257[var67++] = var169;
                                                      }

                                                      ++var169;
                                                   }

                                                   while(true) {
                                                      if (~this.field3210 >= ~var169) {
                                                         this.field3257[var67] = this.field3210;
                                                         class37.field400 = null;
                                                         this.field3267 = class544.method4018(this.field3191, (byte)107, this.field3267);
                                                         this.field3299 = class544.method4018(this.field3191, (byte)106, this.field3299);
                                                         this.field3189 = class544.method4018(this.field3191, (byte)116, this.field3189);
                                                         this.field3289 = class256.method1936(this.field3191, this.field3289, -37);
                                                         this.field3237 = class784.method5637(this.field3237, (byte)0, this.field3191);
                                                         var171 = this;
                                                         if (var7 == 0) {
                                                            this.field3184 = class784.method5637(this.field3184, (byte)0, this.field3191);
                                                            if (arg1.field1718 != null && class426.method3240(arg2, (byte)-98, this.field3236)) {
                                                               this.field3288 = arg1.method1140(0, false);
                                                            }

                                                            if (arg1.field1679 != null && class119.method994(0, this.field3236, arg2)) {
                                                               this.field3192 = arg1.method1138((byte)-70);
                                                            }

                                                            if (arg1.field1693 != null && class69.method689(this.field3236, arg2, -5534)) {
                                                               var161 = 0;
                                                               var162 = new int[256];
                                                               var163 = 0;
                                                               if (var7 != 0) {
                                                                  var164 = arg1.field1693[var9[var163]];
                                                                  if (var164 >= 0) {
                                                                     var10002 = var162[var164]++;
                                                                     if (~var164 < ~var161) {
                                                                        var161 = var164;
                                                                     }
                                                                  }

                                                                  ++var163;
                                                               }

                                                               while(true) {
                                                                  if (this.field3201 <= var163) {
                                                                     this.field3242 = new int[var161 + 1][];
                                                                     var164 = 0;
                                                                     if (var7 == 0) {
                                                                        if (var7 != 0) {
                                                                           this.field3242[var164] = new int[var162[var164]];
                                                                           var162[var164] = 0;
                                                                           ++var164;
                                                                        }

                                                                        while(true) {
                                                                           while(var164 <= var161) {
                                                                              this.field3242[var164] = new int[var162[var164]];
                                                                              var162[var164] = 0;
                                                                              ++var164;
                                                                           }

                                                                           var165 = 0;
                                                                           if (var7 == 0) {
                                                                              if (var7 == 0 && ~this.field3201 >= ~var165) {
                                                                                 return;
                                                                              }

                                                                              do {
                                                                                 var166 = arg1.field1693[var9[var165]];
                                                                                 if (~var166 <= -1) {
                                                                                    this.field3242[var166][var162[var166]++] = var165;
                                                                                 }

                                                                                 ++var165;
                                                                              } while(~this.field3201 < ~var165);

                                                                              return;
                                                                           }

                                                                           ++var164;
                                                                        }
                                                                     }
                                                                  } else {
                                                                     var164 = arg1.field1693[var9[var163]];
                                                                  }

                                                                  if (var164 >= 0) {
                                                                     var10002 = var162[var164]++;
                                                                     if (~var164 < ~var161) {
                                                                        var161 = var164;
                                                                     }
                                                                  }

                                                                  ++var163;
                                                               }
                                                            }

                                                            return;
                                                         }
                                                      } else {
                                                         var171 = this;
                                                      }

                                                      var160 = var171.field3274[var169];
                                                      if (var68 != var160) {
                                                         var68 = var160;
                                                         this.field3257[var67++] = var169;
                                                      }

                                                      ++var169;
                                                   }
                                                }
                                             } else {
                                                var169 = this.field3274[var158];
                                             }

                                             if (~var68 != ~var169) {
                                                ++var67;
                                                var68 = var169;
                                             }

                                             ++var158;
                                          }
                                       }
                                    } else {
                                       var67 = var9[var46];
                                       var68 = arg1.field1682[var67] & 65535;
                                    }

                                    if (arg1.field1697 == null) {
                                       var69 = -1;
                                       if (var7 != 0) {
                                          var69 = arg1.field1697[var67];
                                       }
                                    } else {
                                       var69 = arg1.field1697[var67];
                                    }

                                    if (arg1.field1694 != null) {
                                       var70 = 255 & arg1.field1694[var67];
                                       if (var7 != 0) {
                                          var70 = 0;
                                       }
                                    } else {
                                       var70 = 0;
                                    }

                                    var71 = arg1.field1683 == null ? -1 : arg1.field1683[var67];
                                    if (var71 != -1 && ~(this.field3236 & 64) != -1) {
                                       var72 = var8.method1159(65535 & var71, 124);
                                       if (var72.field4649) {
                                          var71 = -1;
                                       }
                                    }
                                 }

                                 while(true) {
                                    var73 = 0.0F;
                                    var74 = 0.0F;
                                    var75 = 0.0F;
                                    var76 = 0.0F;
                                    var77 = 0.0F;
                                    var78 = 0.0F;
                                    var79 = 0;
                                    var80 = 0;
                                    var81 = 0;
                                    if (var71 != -1) {
                                       label3501: {
                                          if (var69 == -1) {
                                             var79 = 1;
                                             var77 = 0.0F;
                                             var78 = 0.0F;
                                             var76 = 1.0F;
                                             var73 = 0.0F;
                                             var80 = 2;
                                             var75 = 1.0F;
                                             var74 = 1.0F;
                                             if (var7 == 0) {
                                                break label3501;
                                             }
                                          }

                                          var69 &= 255;
                                          var82 = arg1.field1665[var69];
                                          if (~var82 != -1) {
                                             label3384: {
                                                var83 = arg1.field1701[var67];
                                                var84 = arg1.field1707[var67];
                                                var85 = arg1.field1674[var67];
                                                var86 = var43.field11259[var69];
                                                var87 = var43.field11260[var69];
                                                var88 = var43.field11266[var69];
                                                var89 = var43.field11262[var69];
                                                var90 = arg1.field1675[var69];
                                                var91 = (float)arg1.field1666[var69] / 256.0F;
                                                if (~var82 == -2) {
                                                   var92 = (float)arg1.field1703[var69] / 1024.0F;
                                                   class740.method5397(var90, arg1.field1696[var83], var86, class324.field4612, var89, var92, arg1.field1699[var83], arg1.field1714[var83], var87, var91, var88, (byte)25);
                                                   var74 = class324.field4612[1];
                                                   var73 = class324.field4612[0];
                                                   class740.method5397(var90, arg1.field1696[var84], var86, class324.field4612, var89, var92, arg1.field1699[var84], arg1.field1714[var84], var87, var91, var88, (byte)69);
                                                   var75 = class324.field4612[0];
                                                   var76 = class324.field4612[1];
                                                   class740.method5397(var90, arg1.field1696[var85], var86, class324.field4612, var89, var92, arg1.field1699[var85], arg1.field1714[var85], var87, var91, var88, (byte)31);
                                                   var77 = class324.field4612[0];
                                                   var78 = class324.field4612[1];
                                                   var93 = var92 / 2.0F;
                                                   if ((1 & var90) == 0) {
                                                      if (-var73 + var75 > var93) {
                                                         var79 = 1;
                                                         var75 -= var92;
                                                         if (var7 != 0 && var93 < -var75 + var73) {
                                                            var75 += var92;
                                                            var79 = 2;
                                                         }
                                                      } else if (var93 < -var75 + var73) {
                                                         var75 += var92;
                                                         var79 = 2;
                                                      }

                                                      if (var93 < var77 - var73) {
                                                         var80 = 1;
                                                         var77 -= var92;
                                                         if (var7 == 0) {
                                                            break label3384;
                                                         }
                                                      }

                                                      if (!(var93 < var73 - var77)) {
                                                         break label3384;
                                                      }

                                                      var80 = 2;
                                                      var77 += var92;
                                                      if (var7 == 0) {
                                                         break label3384;
                                                      }

                                                      if (!(-var74 + var76 > var93)) {
                                                         if (var74 - var76 > var93) {
                                                            var79 = 2;
                                                            var76 += var92;
                                                            if (var7 != 0) {
                                                               var76 -= var92;
                                                               var79 = 1;
                                                            }
                                                         }
                                                      } else {
                                                         var76 -= var92;
                                                         var79 = 1;
                                                      }
                                                   } else if (!(-var74 + var76 > var93)) {
                                                      if (var74 - var76 > var93) {
                                                         var79 = 2;
                                                         var76 += var92;
                                                         if (var7 != 0) {
                                                            var76 -= var92;
                                                            var79 = 1;
                                                         }
                                                      }
                                                   } else {
                                                      var76 -= var92;
                                                      var79 = 1;
                                                   }

                                                   if (!(var93 < -var74 + var78)) {
                                                      if (!(-var78 + var74 > var93)) {
                                                         break label3384;
                                                      }

                                                      var80 = 2;
                                                      var78 += var92;
                                                      if (var7 == 0) {
                                                         break label3384;
                                                      }
                                                   }

                                                   var78 -= var92;
                                                   var80 = 1;
                                                   if (var7 == 0) {
                                                      break label3384;
                                                   }
                                                }

                                                if (~var82 != -3) {
                                                   if (~var82 != -4) {
                                                      break label3384;
                                                   }

                                                   class653.method4703(class324.field4612, var86, var90, var91, var89, arg1.field1696[var83], arg1.field1699[var83], var87, arg1.field1714[var83], false, var88);
                                                   var74 = class324.field4612[1];
                                                   var73 = class324.field4612[0];
                                                   class653.method4703(class324.field4612, var86, var90, var91, var89, arg1.field1696[var84], arg1.field1699[var84], var87, arg1.field1714[var84], false, var88);
                                                   var76 = class324.field4612[1];
                                                   var75 = class324.field4612[0];
                                                   class653.method4703(class324.field4612, var86, var90, var91, var89, arg1.field1696[var85], arg1.field1699[var85], var87, arg1.field1714[var85], false, var88);
                                                   var78 = class324.field4612[1];
                                                   var77 = class324.field4612[0];
                                                   if ((var90 & 1) == 0) {
                                                      if (-var73 + var75 > 0.5F) {
                                                         var79 = 1;
                                                         --var75;
                                                         if (var7 != 0 && -var75 + var73 > 0.5F) {
                                                            var79 = 2;
                                                            ++var75;
                                                         }
                                                      } else if (-var75 + var73 > 0.5F) {
                                                         var79 = 2;
                                                         ++var75;
                                                      }

                                                      if (-var73 + var77 > 0.5F) {
                                                         var80 = 1;
                                                         --var77;
                                                         if (var7 == 0) {
                                                            break label3384;
                                                         }
                                                      }

                                                      if (!(-var77 + var73 > 0.5F)) {
                                                         break label3384;
                                                      }

                                                      var80 = 2;
                                                      ++var77;
                                                      if (var7 == 0) {
                                                         break label3384;
                                                      }

                                                      if (var76 - var74 > 0.5F) {
                                                         var79 = 1;
                                                         --var76;
                                                         if (var7 != 0 && var74 - var76 > 0.5F) {
                                                            ++var76;
                                                            var79 = 2;
                                                         }
                                                      } else if (var74 - var76 > 0.5F) {
                                                         ++var76;
                                                         var79 = 2;
                                                      }
                                                   } else if (var76 - var74 > 0.5F) {
                                                      var79 = 1;
                                                      --var76;
                                                      if (var7 != 0 && var74 - var76 > 0.5F) {
                                                         ++var76;
                                                         var79 = 2;
                                                      }
                                                   } else if (var74 - var76 > 0.5F) {
                                                      ++var76;
                                                      var79 = 2;
                                                   }

                                                   if (!(var78 - var74 > 0.5F)) {
                                                      if (!(-var78 + var74 > 0.5F)) {
                                                         break label3384;
                                                      }

                                                      var80 = 2;
                                                      ++var78;
                                                      if (var7 == 0) {
                                                         break label3384;
                                                      }
                                                   }

                                                   --var78;
                                                   var80 = 1;
                                                   if (var7 == 0) {
                                                      break label3384;
                                                   }
                                                }

                                                var94 = (float)arg1.field1677[var69] / 256.0F;
                                                var95 = (float)arg1.field1680[var69] / 256.0F;
                                                var96 = arg1.field1696[var84] + -arg1.field1696[var83];
                                                var97 = arg1.field1714[var84] + -arg1.field1714[var83];
                                                var98 = arg1.field1699[var84] + -arg1.field1699[var83];
                                                var99 = arg1.field1696[var85] + -arg1.field1696[var83];
                                                var100 = arg1.field1714[var85] + -arg1.field1714[var83];
                                                var101 = arg1.field1699[var85] + -arg1.field1699[var83];
                                                var102 = var97 * var101 + -(var98 * var100);
                                                var103 = var98 * var99 + -(var96 * var101);
                                                var104 = var96 * var100 + -(var97 * var99);
                                                var105 = 64.0F / (float)arg1.field1689[var69];
                                                var106 = 64.0F / (float)arg1.field1673[var69];
                                                var107 = 64.0F / (float)arg1.field1703[var69];
                                                var108 = (var89[2] * (float)var104 + var89[1] * (float)var103 + var89[0] * (float)var102) / var105;
                                                var109 = (var89[5] * (float)var104 + var89[4] * (float)var103 + var89[3] * (float)var102) / var106;
                                                var110 = (var89[8] * (float)var104 + var89[7] * (float)var103 + var89[6] * (float)var102) / var107;
                                                var81 = class374.method2899(var110, 587, var108, var109);
                                                class777.method5598(var95, var90, var89, arg1.field1714[var83], (byte)15, var81, var87, arg1.field1699[var83], arg1.field1696[var83], var88, class324.field4612, var86, var94, var91);
                                                var74 = class324.field4612[1];
                                                var73 = class324.field4612[0];
                                                class777.method5598(var95, var90, var89, arg1.field1714[var84], (byte)15, var81, var87, arg1.field1699[var84], arg1.field1696[var84], var88, class324.field4612, var86, var94, var91);
                                                var76 = class324.field4612[1];
                                                var75 = class324.field4612[0];
                                                class777.method5598(var95, var90, var89, arg1.field1714[var85], (byte)15, var81, var87, arg1.field1699[var85], arg1.field1696[var85], var88, class324.field4612, var86, var94, var91);
                                                var77 = class324.field4612[0];
                                                var78 = class324.field4612[1];
                                                if (var7 != 0) {
                                                   var111 = arg1.field1701[var67];
                                                   var112 = arg1.field1707[var67];
                                                   var113 = arg1.field1674[var67];
                                                   var114 = arg1.field1698[var69];
                                                   var115 = arg1.field1661[var69];
                                                   var116 = arg1.field1716[var69];
                                                   var117 = (float)arg1.field1696[var114];
                                                   var118 = (float)arg1.field1714[var114];
                                                   var119 = (float)arg1.field1699[var114];
                                                   var120 = (float)arg1.field1696[var115] - var117;
                                                   var121 = (float)arg1.field1714[var115] + -var118;
                                                   var122 = (float)arg1.field1699[var115] + -var119;
                                                   var123 = (float)arg1.field1696[var116] - var117;
                                                   var124 = (float)arg1.field1714[var116] + -var118;
                                                   var125 = (float)arg1.field1699[var116] + -var119;
                                                   var126 = (float)arg1.field1696[var111] + -var117;
                                                   var127 = (float)arg1.field1714[var111] + -var118;
                                                   var128 = (float)arg1.field1699[var111] + -var119;
                                                   var129 = (float)arg1.field1696[var112] - var117;
                                                   var130 = (float)arg1.field1714[var112] + -var118;
                                                   var131 = (float)arg1.field1699[var112] + -var119;
                                                   var132 = (float)arg1.field1696[var113] + -var117;
                                                   var133 = (float)arg1.field1714[var113] + -var118;
                                                   var134 = (float)arg1.field1699[var113] + -var119;
                                                   var135 = var121 * var125 - var122 * var124;
                                                   var136 = var122 * var123 + -(var120 * var125);
                                                   var137 = var120 * var124 - var121 * var123;
                                                   var138 = var124 * var137 - var125 * var136;
                                                   var139 = var125 * var135 + -(var123 * var137);
                                                   var140 = var123 * var136 - var124 * var135;
                                                   var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                                                   var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                                                   var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                                                   var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                                                   var142 = var120 * var136 - var121 * var135;
                                                   var143 = var122 * var135 + -(var120 * var137);
                                                   var144 = var121 * var137 + -(var122 * var136);
                                                   var145 = 1.0F / (var125 * var142 + var123 * var144 + var124 * var143);
                                                   var78 = (var134 * var142 + var132 * var144 + var133 * var143) * var145;
                                                   var74 = (var128 * var142 + var126 * var144 + var127 * var143) * var145;
                                                   var76 = (var131 * var142 + var129 * var144 + var130 * var143) * var145;
                                                }
                                             }
                                          } else {
                                             var111 = arg1.field1701[var67];
                                             var112 = arg1.field1707[var67];
                                             var113 = arg1.field1674[var67];
                                             var114 = arg1.field1698[var69];
                                             var115 = arg1.field1661[var69];
                                             var116 = arg1.field1716[var69];
                                             var117 = (float)arg1.field1696[var114];
                                             var118 = (float)arg1.field1714[var114];
                                             var119 = (float)arg1.field1699[var114];
                                             var120 = (float)arg1.field1696[var115] - var117;
                                             var121 = (float)arg1.field1714[var115] + -var118;
                                             var122 = (float)arg1.field1699[var115] + -var119;
                                             var123 = (float)arg1.field1696[var116] - var117;
                                             var124 = (float)arg1.field1714[var116] + -var118;
                                             var125 = (float)arg1.field1699[var116] + -var119;
                                             var126 = (float)arg1.field1696[var111] + -var117;
                                             var127 = (float)arg1.field1714[var111] + -var118;
                                             var128 = (float)arg1.field1699[var111] + -var119;
                                             var129 = (float)arg1.field1696[var112] - var117;
                                             var130 = (float)arg1.field1714[var112] + -var118;
                                             var131 = (float)arg1.field1699[var112] + -var119;
                                             var132 = (float)arg1.field1696[var113] + -var117;
                                             var133 = (float)arg1.field1714[var113] + -var118;
                                             var134 = (float)arg1.field1699[var113] + -var119;
                                             var135 = var121 * var125 - var122 * var124;
                                             var136 = var122 * var123 + -(var120 * var125);
                                             var137 = var120 * var124 - var121 * var123;
                                             var138 = var124 * var137 - var125 * var136;
                                             var139 = var125 * var135 + -(var123 * var137);
                                             var140 = var123 * var136 - var124 * var135;
                                             var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                                             var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                                             var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                                             var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                                             var142 = var120 * var136 - var121 * var135;
                                             var143 = var122 * var135 + -(var120 * var137);
                                             var144 = var121 * var137 + -(var122 * var136);
                                             var145 = 1.0F / (var125 * var142 + var123 * var144 + var124 * var143);
                                             var78 = (var134 * var142 + var132 * var144 + var133 * var143) * var145;
                                             var74 = (var128 * var142 + var126 * var144 + var127 * var143) * var145;
                                             var76 = (var131 * var142 + var129 * var144 + var130 * var143) * var145;
                                          }
                                       }
                                    }

                                    if (arg1.field1690 != null) {
                                       var146 = arg1.field1690[var67];
                                       if (var7 != 0) {
                                          var146 = 0;
                                       }
                                    } else {
                                       var146 = 0;
                                    }

                                    if (~var146 == -1) {
                                       var147 = ((long)(var68 << 8) + (long)(var81 << 24) + (long)var70 << 32) + (long)(var69 << 2);
                                       var149 = arg1.field1701[var67];
                                       var150 = arg1.field1707[var67];
                                       var151 = arg1.field1674[var67];
                                       var152 = var32[var149];
                                       this.field3199[var46] = this.method1852(arg1, var152.field2098, var152.field2090, var147, var149, false, var73, var152.field2092, var152.field2094, var74);
                                       var153 = var32[var150];
                                       this.field3282[var46] = this.method1852(arg1, var153.field2098, var153.field2090, (long)var79 + var147, var150, false, var75, var153.field2092, var153.field2094, var76);
                                       var154 = var32[var151];
                                       this.field3300[var46] = this.method1852(arg1, var154.field2098, var154.field2090, (long)var80 + var147, var151, false, var77, var154.field2092, var154.field2094, var78);
                                       if (var7 != 0) {
                                          if (var146 == 1) {
                                             var155 = var44[var67];
                                             var156 = (long)((var155.field9243 + 256 << 22) + (~var155.field9245 >= -1 ? 2048 : 1024) + (var69 << 2) + (var155.field9247 - -256 << 12)) + ((long)(var68 << 8) + (long)(var81 << 24) + (long)var70 << 32);
                                             this.field3199[var46] = this.method1852(arg1, 0, var155.field9243, var156, arg1.field1701[var67], false, var73, var155.field9247, var155.field9245, var74);
                                             this.field3282[var46] = this.method1852(arg1, 0, var155.field9243, (long)var79 + var156, arg1.field1707[var67], false, var75, var155.field9247, var155.field9245, var76);
                                             this.field3300[var46] = this.method1852(arg1, 0, var155.field9243, (long)var80 + var156, arg1.field1674[var67], false, var77, var155.field9247, var155.field9245, var78);
                                          }

                                          if (arg1.field1694 != null) {
                                             this.field3247[var46] = arg1.field1694[var67];
                                          }

                                          if (arg1.field1706 != null) {
                                             this.field3204[var46] = arg1.field1706[var67];
                                          }

                                          this.field3183[var46] = arg1.field1682[var67];
                                          this.field3274[var46] = var71;
                                          ++var46;
                                       } else {
                                          if (arg1.field1694 != null) {
                                             this.field3247[var46] = arg1.field1694[var67];
                                          }

                                          if (arg1.field1706 != null) {
                                             this.field3204[var46] = arg1.field1706[var67];
                                          }

                                          this.field3183[var46] = arg1.field1682[var67];
                                          this.field3274[var46] = var71;
                                          ++var46;
                                       }
                                    } else {
                                       if (var146 == 1) {
                                          var155 = var44[var67];
                                          var156 = (long)((var155.field9243 + 256 << 22) + (~var155.field9245 >= -1 ? 2048 : 1024) + (var69 << 2) + (var155.field9247 - -256 << 12)) + ((long)(var68 << 8) + (long)(var81 << 24) + (long)var70 << 32);
                                          this.field3199[var46] = this.method1852(arg1, 0, var155.field9243, var156, arg1.field1701[var67], false, var73, var155.field9247, var155.field9245, var74);
                                          this.field3282[var46] = this.method1852(arg1, 0, var155.field9243, (long)var79 + var156, arg1.field1707[var67], false, var75, var155.field9247, var155.field9245, var76);
                                          this.field3300[var46] = this.method1852(arg1, 0, var155.field9243, (long)var80 + var156, arg1.field1674[var67], false, var77, var155.field9247, var155.field9245, var78);
                                       }

                                       if (arg1.field1694 != null) {
                                          this.field3247[var46] = arg1.field1694[var67];
                                       }

                                       if (arg1.field1706 != null) {
                                          this.field3204[var46] = arg1.field1706[var67];
                                       }

                                       this.field3183[var46] = arg1.field1682[var67];
                                       this.field3274[var46] = var71;
                                       ++var46;
                                    }

                                    if (~var46 <= ~this.field3201) {
                                       var67 = 0;
                                       var68 = -10000;
                                       var158 = 0;
                                       if (var7 == 0) {
                                          if (var7 != 0) {
                                             var159 = this.field3274[var158];
                                             if (~var68 != ~var159) {
                                                ++var67;
                                                var68 = var159;
                                             }

                                             ++var158;
                                          }

                                          while(true) {
                                             if (var158 >= this.field3210) {
                                                this.field3257 = new int[var67 + 1];
                                                var67 = 0;
                                                var68 = -10000;
                                                var169 = 0;
                                                if (var7 == 0) {
                                                   if (var7 != 0) {
                                                      var160 = this.field3274[var169];
                                                      if (var68 != var160) {
                                                         var68 = var160;
                                                         this.field3257[var67++] = var169;
                                                      }

                                                      ++var169;
                                                   }

                                                   while(true) {
                                                      if (~this.field3210 >= ~var169) {
                                                         this.field3257[var67] = this.field3210;
                                                         class37.field400 = null;
                                                         this.field3267 = class544.method4018(this.field3191, (byte)107, this.field3267);
                                                         this.field3299 = class544.method4018(this.field3191, (byte)106, this.field3299);
                                                         this.field3189 = class544.method4018(this.field3191, (byte)116, this.field3189);
                                                         this.field3289 = class256.method1936(this.field3191, this.field3289, -37);
                                                         this.field3237 = class784.method5637(this.field3237, (byte)0, this.field3191);
                                                         var171 = this;
                                                         if (var7 == 0) {
                                                            this.field3184 = class784.method5637(this.field3184, (byte)0, this.field3191);
                                                            if (arg1.field1718 != null && class426.method3240(arg2, (byte)-98, this.field3236)) {
                                                               this.field3288 = arg1.method1140(0, false);
                                                            }

                                                            if (arg1.field1679 != null && class119.method994(0, this.field3236, arg2)) {
                                                               this.field3192 = arg1.method1138((byte)-70);
                                                            }

                                                            if (arg1.field1693 != null && class69.method689(this.field3236, arg2, -5534)) {
                                                               var161 = 0;
                                                               var162 = new int[256];
                                                               var163 = 0;
                                                               if (var7 != 0) {
                                                                  var164 = arg1.field1693[var9[var163]];
                                                                  if (var164 >= 0) {
                                                                     var10002 = var162[var164]++;
                                                                     if (~var164 < ~var161) {
                                                                        var161 = var164;
                                                                     }
                                                                  }

                                                                  ++var163;
                                                               }

                                                               while(true) {
                                                                  if (this.field3201 <= var163) {
                                                                     this.field3242 = new int[var161 + 1][];
                                                                     var164 = 0;
                                                                     if (var7 == 0) {
                                                                        if (var7 != 0) {
                                                                           this.field3242[var164] = new int[var162[var164]];
                                                                           var162[var164] = 0;
                                                                           ++var164;
                                                                        }

                                                                        while(true) {
                                                                           while(var164 <= var161) {
                                                                              this.field3242[var164] = new int[var162[var164]];
                                                                              var162[var164] = 0;
                                                                              ++var164;
                                                                           }

                                                                           var165 = 0;
                                                                           if (var7 == 0) {
                                                                              if (var7 == 0 && ~this.field3201 >= ~var165) {
                                                                                 return;
                                                                              }

                                                                              do {
                                                                                 var166 = arg1.field1693[var9[var165]];
                                                                                 if (~var166 <= -1) {
                                                                                    this.field3242[var166][var162[var166]++] = var165;
                                                                                 }

                                                                                 ++var165;
                                                                              } while(~this.field3201 < ~var165);

                                                                              return;
                                                                           }

                                                                           ++var164;
                                                                        }
                                                                     }
                                                                  } else {
                                                                     var164 = arg1.field1693[var9[var163]];
                                                                  }

                                                                  if (var164 >= 0) {
                                                                     var10002 = var162[var164]++;
                                                                     if (~var164 < ~var161) {
                                                                        var161 = var164;
                                                                     }
                                                                  }

                                                                  ++var163;
                                                               }
                                                            }

                                                            return;
                                                         }
                                                      } else {
                                                         var171 = this;
                                                      }

                                                      var160 = var171.field3274[var169];
                                                      if (var68 != var160) {
                                                         var68 = var160;
                                                         this.field3257[var67++] = var169;
                                                      }

                                                      ++var169;
                                                   }
                                                }
                                             } else {
                                                var169 = this.field3274[var158];
                                             }

                                             if (~var68 != ~var169) {
                                                ++var67;
                                                var68 = var169;
                                             }

                                             ++var158;
                                          }
                                       }
                                    } else {
                                       var67 = var9[var46];
                                       var68 = arg1.field1682[var67] & 65535;
                                    }

                                    if (arg1.field1697 == null) {
                                       var69 = -1;
                                       if (var7 != 0) {
                                          var69 = arg1.field1697[var67];
                                       }
                                    } else {
                                       var69 = arg1.field1697[var67];
                                    }

                                    if (arg1.field1694 != null) {
                                       var70 = 255 & arg1.field1694[var67];
                                       if (var7 != 0) {
                                          var70 = 0;
                                       }
                                    } else {
                                       var70 = 0;
                                    }

                                    var71 = arg1.field1683 == null ? -1 : arg1.field1683[var67];
                                    if (var71 != -1 && ~(this.field3236 & 64) != -1) {
                                       var72 = var8.method1159(65535 & var71, 124);
                                       if (var72.field4649) {
                                          var71 = -1;
                                       }
                                    }
                                 }
                              }
                           } else {
                              var10000 = this.field3187[var41];
                           }

                           var42 = var10000;
                           this.field3187[var41] = var40;
                           var32[var41] = new class168();
                           var40 += var42;
                           ++var41;
                        }
                     }
                  } else {
                     var170 = arg1;
                  }
               } else {
                  var33 = this.field3201 * 3;
                  this.field3195 = new short[var33];
                  this.field3184 = new float[var33];
                  this.field3183 = new short[this.field3201];
                  this.field3300 = new short[this.field3201];
                  this.field3274 = new short[this.field3201];
                  this.field3237 = new float[var33];
                  this.field3247 = new byte[this.field3201];
                  this.field3259 = (short)arg3;
                  this.field3289 = new byte[var33];
                  this.field3189 = new short[var33];
                  this.field3282 = new short[this.field3201];
                  class37.field400 = new long[var33];
                  this.field3299 = new short[var33];
                  this.field3267 = new short[var33];
                  this.field3199 = new short[this.field3201];
                  var170 = arg1;
                  if (var7 == 0) {
                     if (arg1.field1706 != null) {
                        this.field3204 = new short[this.field3201];
                     }

                     this.field3188 = (short)arg4;
                     var40 = 0;
                     var41 = 0;
                     if (var7 != 0) {
                        var42 = this.field3187[var41];
                        this.field3187[var41] = var40;
                        var32[var41] = new class168();
                        var40 += var42;
                        ++var41;
                     }

                     while(true) {
                        if (arg1.field1671 <= var41) {
                           this.field3187[arg1.field1671] = var40;
                           var43 = class724.method5250(Integer.MAX_VALUE, this.field3201, var9, arg1);
                           var44 = new class635[arg1.field1691];
                           var10000 = 0;
                           if (var7 == 0) {
                              label1137: {
                                 var45 = 0;
                                 if (var7 != 0) {
                                    var46 = arg1.field1701[var45];
                                 } else if (~arg1.field1691 >= ~var45) {
                                    var46 = 0;
                                    if (var7 == 0) {
                                       break label1137;
                                    }
                                 } else {
                                    var46 = arg1.field1701[var45];
                                 }

                                 label1140:
                                 while(true) {
                                    var47 = arg1.field1707[var45];
                                    var48 = arg1.field1674[var45];
                                    var49 = this.field3305[var47] + -this.field3305[var46];
                                    var50 = this.field3218[var47] + -this.field3218[var46];
                                    var51 = this.field3272[var47] + -this.field3272[var46];
                                    var52 = this.field3305[var48] + -this.field3305[var46];
                                    var53 = this.field3218[var48] + -this.field3218[var46];
                                    var54 = this.field3272[var48] - this.field3272[var46];
                                    var55 = var50 * var54 + -(var51 * var53);
                                    var56 = var51 * var52 - var49 * var54;
                                    var57 = var49 * var53 + -(var50 * var52);
                                    if (var7 != 0) {
                                       var55 >>= 1;
                                       var56 >>= 1;
                                       var57 >>= 1;
                                    }

                                    while(true) {
                                       while(true) {
                                          if (var55 <= 8192) {
                                             var10000 = ~var56;
                                             if (var7 != 0) {
                                                var57 = var10000 >> -8193;
                                                continue;
                                             }

                                             if (var10000 >= -8193 && var57 <= 8192 && ~var55 <= 8191 && ~var56 <= 8191 && var57 >= -8192) {
                                                var58 = (int)Math.sqrt((double)(var57 * var57 + var55 * var55 + var56 * var56));
                                                if (var58 <= 0) {
                                                   var58 = 1;
                                                }

                                                var59 = var57 * 256 / var58;
                                                var60 = var55 * 256 / var58;
                                                var61 = var56 * 256 / var58;
                                                var62 = arg1.field1690 == null ? 0 : arg1.field1690[var45];
                                                if (~var62 == -1) {
                                                   var63 = var32[var46];
                                                   var63.field2092 += var61;
                                                   var63.field2090 += var59;
                                                   ++var63.field2098;
                                                   var63.field2094 += var60;
                                                   var64 = var32[var47];
                                                   var64.field2094 += var60;
                                                   var64.field2090 += var59;
                                                   var64.field2092 += var61;
                                                   ++var64.field2098;
                                                   var65 = var32[var48];
                                                   var65.field2092 += var61;
                                                   ++var65.field2098;
                                                   var65.field2094 += var60;
                                                   var65.field2090 += var59;
                                                   if (var7 != 0) {
                                                      if (var62 == 1) {
                                                         var66 = var44[var45] = new class635();
                                                         var66.field9245 = var60;
                                                         var66.field9247 = var61;
                                                         var66.field9243 = var59;
                                                      }

                                                      ++var45;
                                                   } else {
                                                      ++var45;
                                                   }
                                                } else {
                                                   if (var62 == 1) {
                                                      var66 = var44[var45] = new class635();
                                                      var66.field9245 = var60;
                                                      var66.field9247 = var61;
                                                      var66.field9243 = var59;
                                                   }

                                                   ++var45;
                                                }

                                                if (~arg1.field1691 >= ~var45) {
                                                   var46 = 0;
                                                   if (var7 == 0) {
                                                      break label1140;
                                                   }
                                                } else {
                                                   var46 = arg1.field1701[var45];
                                                }
                                                continue label1140;
                                             }
                                          }

                                          var55 >>= 1;
                                          var56 >>= 1;
                                          var57 >>= 1;
                                       }
                                    }
                                 }
                              }

                              if (var7 != 0) {
                                 var67 = var9[var46];
                                 var68 = arg1.field1682[var67] & 65535;
                                 if (arg1.field1697 == null) {
                                    var69 = -1;
                                    if (var7 != 0) {
                                       var69 = arg1.field1697[var67];
                                    }
                                 } else {
                                    var69 = arg1.field1697[var67];
                                 }

                                 if (arg1.field1694 != null) {
                                    var70 = 255 & arg1.field1694[var67];
                                    if (var7 != 0) {
                                       var70 = 0;
                                    }
                                 } else {
                                    var70 = 0;
                                 }

                                 var71 = arg1.field1683 == null ? -1 : arg1.field1683[var67];
                                 if (var71 != -1 && ~(this.field3236 & 64) != -1) {
                                    var72 = var8.method1159(65535 & var71, 124);
                                    if (var72.field4649) {
                                       var71 = -1;
                                    }
                                 }
                              } else {
                                 if (~var46 <= ~this.field3201) {
                                    var67 = 0;
                                    var68 = -10000;
                                    var158 = 0;
                                    if (var7 == 0) {
                                       if (var7 != 0) {
                                          var159 = this.field3274[var158];
                                          if (~var68 != ~var159) {
                                             ++var67;
                                             var68 = var159;
                                          }

                                          ++var158;
                                       }

                                       while(true) {
                                          if (var158 >= this.field3210) {
                                             this.field3257 = new int[var67 + 1];
                                             var67 = 0;
                                             var68 = -10000;
                                             var169 = 0;
                                             if (var7 == 0) {
                                                if (var7 != 0) {
                                                   var160 = this.field3274[var169];
                                                   if (var68 != var160) {
                                                      var68 = var160;
                                                      this.field3257[var67++] = var169;
                                                   }

                                                   ++var169;
                                                }

                                                while(true) {
                                                   if (~this.field3210 >= ~var169) {
                                                      this.field3257[var67] = this.field3210;
                                                      class37.field400 = null;
                                                      this.field3267 = class544.method4018(this.field3191, (byte)107, this.field3267);
                                                      this.field3299 = class544.method4018(this.field3191, (byte)106, this.field3299);
                                                      this.field3189 = class544.method4018(this.field3191, (byte)116, this.field3189);
                                                      this.field3289 = class256.method1936(this.field3191, this.field3289, -37);
                                                      this.field3237 = class784.method5637(this.field3237, (byte)0, this.field3191);
                                                      var171 = this;
                                                      if (var7 == 0) {
                                                         this.field3184 = class784.method5637(this.field3184, (byte)0, this.field3191);
                                                         if (arg1.field1718 != null && class426.method3240(arg2, (byte)-98, this.field3236)) {
                                                            this.field3288 = arg1.method1140(0, false);
                                                         }

                                                         if (arg1.field1679 != null && class119.method994(0, this.field3236, arg2)) {
                                                            this.field3192 = arg1.method1138((byte)-70);
                                                         }

                                                         if (arg1.field1693 != null && class69.method689(this.field3236, arg2, -5534)) {
                                                            var161 = 0;
                                                            var162 = new int[256];
                                                            var163 = 0;
                                                            if (var7 != 0) {
                                                               var164 = arg1.field1693[var9[var163]];
                                                               if (var164 >= 0) {
                                                                  var10002 = var162[var164]++;
                                                                  if (~var164 < ~var161) {
                                                                     var161 = var164;
                                                                  }
                                                               }

                                                               ++var163;
                                                            }

                                                            while(true) {
                                                               if (this.field3201 <= var163) {
                                                                  this.field3242 = new int[var161 + 1][];
                                                                  var164 = 0;
                                                                  if (var7 == 0) {
                                                                     if (var7 != 0) {
                                                                        this.field3242[var164] = new int[var162[var164]];
                                                                        var162[var164] = 0;
                                                                        ++var164;
                                                                     }

                                                                     while(true) {
                                                                        while(var164 <= var161) {
                                                                           this.field3242[var164] = new int[var162[var164]];
                                                                           var162[var164] = 0;
                                                                           ++var164;
                                                                        }

                                                                        var165 = 0;
                                                                        if (var7 == 0) {
                                                                           if (var7 == 0 && ~this.field3201 >= ~var165) {
                                                                              return;
                                                                           }

                                                                           do {
                                                                              var166 = arg1.field1693[var9[var165]];
                                                                              if (~var166 <= -1) {
                                                                                 this.field3242[var166][var162[var166]++] = var165;
                                                                              }

                                                                              ++var165;
                                                                           } while(~this.field3201 < ~var165);

                                                                           return;
                                                                        }

                                                                        ++var164;
                                                                     }
                                                                  }
                                                               } else {
                                                                  var164 = arg1.field1693[var9[var163]];
                                                               }

                                                               if (var164 >= 0) {
                                                                  var10002 = var162[var164]++;
                                                                  if (~var164 < ~var161) {
                                                                     var161 = var164;
                                                                  }
                                                               }

                                                               ++var163;
                                                            }
                                                         }

                                                         return;
                                                      }
                                                   } else {
                                                      var171 = this;
                                                   }

                                                   var160 = var171.field3274[var169];
                                                   if (var68 != var160) {
                                                      var68 = var160;
                                                      this.field3257[var67++] = var169;
                                                   }

                                                   ++var169;
                                                }
                                             }
                                          } else {
                                             var169 = this.field3274[var158];
                                          }

                                          if (~var68 != ~var169) {
                                             ++var67;
                                             var68 = var169;
                                          }

                                          ++var158;
                                       }
                                    }
                                 } else {
                                    var67 = var9[var46];
                                    var68 = arg1.field1682[var67] & 65535;
                                 }

                                 if (arg1.field1697 == null) {
                                    var69 = -1;
                                    if (var7 != 0) {
                                       var69 = arg1.field1697[var67];
                                    }
                                 } else {
                                    var69 = arg1.field1697[var67];
                                 }

                                 if (arg1.field1694 != null) {
                                    var70 = 255 & arg1.field1694[var67];
                                    if (var7 != 0) {
                                       var70 = 0;
                                    }
                                 } else {
                                    var70 = 0;
                                 }

                                 var71 = arg1.field1683 == null ? -1 : arg1.field1683[var67];
                                 if (var71 != -1 && ~(this.field3236 & 64) != -1) {
                                    var72 = var8.method1159(65535 & var71, 124);
                                    if (var72.field4649) {
                                       var71 = -1;
                                    }
                                 }
                              }

                              while(true) {
                                 var73 = 0.0F;
                                 var74 = 0.0F;
                                 var75 = 0.0F;
                                 var76 = 0.0F;
                                 var77 = 0.0F;
                                 var78 = 0.0F;
                                 var79 = 0;
                                 var80 = 0;
                                 var81 = 0;
                                 if (var71 != -1) {
                                    label3510: {
                                       if (var69 == -1) {
                                          var79 = 1;
                                          var77 = 0.0F;
                                          var78 = 0.0F;
                                          var76 = 1.0F;
                                          var73 = 0.0F;
                                          var80 = 2;
                                          var75 = 1.0F;
                                          var74 = 1.0F;
                                          if (var7 == 0) {
                                             break label3510;
                                          }
                                       }

                                       var69 &= 255;
                                       var82 = arg1.field1665[var69];
                                       if (~var82 != -1) {
                                          label3426: {
                                             var83 = arg1.field1701[var67];
                                             var84 = arg1.field1707[var67];
                                             var85 = arg1.field1674[var67];
                                             var86 = var43.field11259[var69];
                                             var87 = var43.field11260[var69];
                                             var88 = var43.field11266[var69];
                                             var89 = var43.field11262[var69];
                                             var90 = arg1.field1675[var69];
                                             var91 = (float)arg1.field1666[var69] / 256.0F;
                                             if (~var82 == -2) {
                                                var92 = (float)arg1.field1703[var69] / 1024.0F;
                                                class740.method5397(var90, arg1.field1696[var83], var86, class324.field4612, var89, var92, arg1.field1699[var83], arg1.field1714[var83], var87, var91, var88, (byte)25);
                                                var74 = class324.field4612[1];
                                                var73 = class324.field4612[0];
                                                class740.method5397(var90, arg1.field1696[var84], var86, class324.field4612, var89, var92, arg1.field1699[var84], arg1.field1714[var84], var87, var91, var88, (byte)69);
                                                var75 = class324.field4612[0];
                                                var76 = class324.field4612[1];
                                                class740.method5397(var90, arg1.field1696[var85], var86, class324.field4612, var89, var92, arg1.field1699[var85], arg1.field1714[var85], var87, var91, var88, (byte)31);
                                                var77 = class324.field4612[0];
                                                var78 = class324.field4612[1];
                                                var93 = var92 / 2.0F;
                                                if ((1 & var90) == 0) {
                                                   if (-var73 + var75 > var93) {
                                                      var79 = 1;
                                                      var75 -= var92;
                                                      if (var7 != 0 && var93 < -var75 + var73) {
                                                         var75 += var92;
                                                         var79 = 2;
                                                      }
                                                   } else if (var93 < -var75 + var73) {
                                                      var75 += var92;
                                                      var79 = 2;
                                                   }

                                                   if (var93 < var77 - var73) {
                                                      var80 = 1;
                                                      var77 -= var92;
                                                      if (var7 == 0) {
                                                         break label3426;
                                                      }
                                                   }

                                                   if (!(var93 < var73 - var77)) {
                                                      break label3426;
                                                   }

                                                   var80 = 2;
                                                   var77 += var92;
                                                   if (var7 == 0) {
                                                      break label3426;
                                                   }

                                                   if (!(-var74 + var76 > var93)) {
                                                      if (var74 - var76 > var93) {
                                                         var79 = 2;
                                                         var76 += var92;
                                                         if (var7 != 0) {
                                                            var76 -= var92;
                                                            var79 = 1;
                                                         }
                                                      }
                                                   } else {
                                                      var76 -= var92;
                                                      var79 = 1;
                                                   }
                                                } else if (!(-var74 + var76 > var93)) {
                                                   if (var74 - var76 > var93) {
                                                      var79 = 2;
                                                      var76 += var92;
                                                      if (var7 != 0) {
                                                         var76 -= var92;
                                                         var79 = 1;
                                                      }
                                                   }
                                                } else {
                                                   var76 -= var92;
                                                   var79 = 1;
                                                }

                                                if (!(var93 < -var74 + var78)) {
                                                   if (!(-var78 + var74 > var93)) {
                                                      break label3426;
                                                   }

                                                   var80 = 2;
                                                   var78 += var92;
                                                   if (var7 == 0) {
                                                      break label3426;
                                                   }
                                                }

                                                var78 -= var92;
                                                var80 = 1;
                                                if (var7 == 0) {
                                                   break label3426;
                                                }
                                             }

                                             if (~var82 != -3) {
                                                if (~var82 != -4) {
                                                   break label3426;
                                                }

                                                class653.method4703(class324.field4612, var86, var90, var91, var89, arg1.field1696[var83], arg1.field1699[var83], var87, arg1.field1714[var83], false, var88);
                                                var74 = class324.field4612[1];
                                                var73 = class324.field4612[0];
                                                class653.method4703(class324.field4612, var86, var90, var91, var89, arg1.field1696[var84], arg1.field1699[var84], var87, arg1.field1714[var84], false, var88);
                                                var76 = class324.field4612[1];
                                                var75 = class324.field4612[0];
                                                class653.method4703(class324.field4612, var86, var90, var91, var89, arg1.field1696[var85], arg1.field1699[var85], var87, arg1.field1714[var85], false, var88);
                                                var78 = class324.field4612[1];
                                                var77 = class324.field4612[0];
                                                if ((var90 & 1) == 0) {
                                                   if (-var73 + var75 > 0.5F) {
                                                      var79 = 1;
                                                      --var75;
                                                      if (var7 != 0 && -var75 + var73 > 0.5F) {
                                                         var79 = 2;
                                                         ++var75;
                                                      }
                                                   } else if (-var75 + var73 > 0.5F) {
                                                      var79 = 2;
                                                      ++var75;
                                                   }

                                                   if (-var73 + var77 > 0.5F) {
                                                      var80 = 1;
                                                      --var77;
                                                      if (var7 == 0) {
                                                         break label3426;
                                                      }
                                                   }

                                                   if (!(-var77 + var73 > 0.5F)) {
                                                      break label3426;
                                                   }

                                                   var80 = 2;
                                                   ++var77;
                                                   if (var7 == 0) {
                                                      break label3426;
                                                   }

                                                   if (var76 - var74 > 0.5F) {
                                                      var79 = 1;
                                                      --var76;
                                                      if (var7 != 0 && var74 - var76 > 0.5F) {
                                                         ++var76;
                                                         var79 = 2;
                                                      }
                                                   } else if (var74 - var76 > 0.5F) {
                                                      ++var76;
                                                      var79 = 2;
                                                   }
                                                } else if (var76 - var74 > 0.5F) {
                                                   var79 = 1;
                                                   --var76;
                                                   if (var7 != 0 && var74 - var76 > 0.5F) {
                                                      ++var76;
                                                      var79 = 2;
                                                   }
                                                } else if (var74 - var76 > 0.5F) {
                                                   ++var76;
                                                   var79 = 2;
                                                }

                                                if (!(var78 - var74 > 0.5F)) {
                                                   if (!(-var78 + var74 > 0.5F)) {
                                                      break label3426;
                                                   }

                                                   var80 = 2;
                                                   ++var78;
                                                   if (var7 == 0) {
                                                      break label3426;
                                                   }
                                                }

                                                --var78;
                                                var80 = 1;
                                                if (var7 == 0) {
                                                   break label3426;
                                                }
                                             }

                                             var94 = (float)arg1.field1677[var69] / 256.0F;
                                             var95 = (float)arg1.field1680[var69] / 256.0F;
                                             var96 = arg1.field1696[var84] + -arg1.field1696[var83];
                                             var97 = arg1.field1714[var84] + -arg1.field1714[var83];
                                             var98 = arg1.field1699[var84] + -arg1.field1699[var83];
                                             var99 = arg1.field1696[var85] + -arg1.field1696[var83];
                                             var100 = arg1.field1714[var85] + -arg1.field1714[var83];
                                             var101 = arg1.field1699[var85] + -arg1.field1699[var83];
                                             var102 = var97 * var101 + -(var98 * var100);
                                             var103 = var98 * var99 + -(var96 * var101);
                                             var104 = var96 * var100 + -(var97 * var99);
                                             var105 = 64.0F / (float)arg1.field1689[var69];
                                             var106 = 64.0F / (float)arg1.field1673[var69];
                                             var107 = 64.0F / (float)arg1.field1703[var69];
                                             var108 = (var89[2] * (float)var104 + var89[1] * (float)var103 + var89[0] * (float)var102) / var105;
                                             var109 = (var89[5] * (float)var104 + var89[4] * (float)var103 + var89[3] * (float)var102) / var106;
                                             var110 = (var89[8] * (float)var104 + var89[7] * (float)var103 + var89[6] * (float)var102) / var107;
                                             var81 = class374.method2899(var110, 587, var108, var109);
                                             class777.method5598(var95, var90, var89, arg1.field1714[var83], (byte)15, var81, var87, arg1.field1699[var83], arg1.field1696[var83], var88, class324.field4612, var86, var94, var91);
                                             var74 = class324.field4612[1];
                                             var73 = class324.field4612[0];
                                             class777.method5598(var95, var90, var89, arg1.field1714[var84], (byte)15, var81, var87, arg1.field1699[var84], arg1.field1696[var84], var88, class324.field4612, var86, var94, var91);
                                             var76 = class324.field4612[1];
                                             var75 = class324.field4612[0];
                                             class777.method5598(var95, var90, var89, arg1.field1714[var85], (byte)15, var81, var87, arg1.field1699[var85], arg1.field1696[var85], var88, class324.field4612, var86, var94, var91);
                                             var77 = class324.field4612[0];
                                             var78 = class324.field4612[1];
                                             if (var7 != 0) {
                                                var111 = arg1.field1701[var67];
                                                var112 = arg1.field1707[var67];
                                                var113 = arg1.field1674[var67];
                                                var114 = arg1.field1698[var69];
                                                var115 = arg1.field1661[var69];
                                                var116 = arg1.field1716[var69];
                                                var117 = (float)arg1.field1696[var114];
                                                var118 = (float)arg1.field1714[var114];
                                                var119 = (float)arg1.field1699[var114];
                                                var120 = (float)arg1.field1696[var115] - var117;
                                                var121 = (float)arg1.field1714[var115] + -var118;
                                                var122 = (float)arg1.field1699[var115] + -var119;
                                                var123 = (float)arg1.field1696[var116] - var117;
                                                var124 = (float)arg1.field1714[var116] + -var118;
                                                var125 = (float)arg1.field1699[var116] + -var119;
                                                var126 = (float)arg1.field1696[var111] + -var117;
                                                var127 = (float)arg1.field1714[var111] + -var118;
                                                var128 = (float)arg1.field1699[var111] + -var119;
                                                var129 = (float)arg1.field1696[var112] - var117;
                                                var130 = (float)arg1.field1714[var112] + -var118;
                                                var131 = (float)arg1.field1699[var112] + -var119;
                                                var132 = (float)arg1.field1696[var113] + -var117;
                                                var133 = (float)arg1.field1714[var113] + -var118;
                                                var134 = (float)arg1.field1699[var113] + -var119;
                                                var135 = var121 * var125 - var122 * var124;
                                                var136 = var122 * var123 + -(var120 * var125);
                                                var137 = var120 * var124 - var121 * var123;
                                                var138 = var124 * var137 - var125 * var136;
                                                var139 = var125 * var135 + -(var123 * var137);
                                                var140 = var123 * var136 - var124 * var135;
                                                var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                                                var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                                                var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                                                var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                                                var142 = var120 * var136 - var121 * var135;
                                                var143 = var122 * var135 + -(var120 * var137);
                                                var144 = var121 * var137 + -(var122 * var136);
                                                var145 = 1.0F / (var125 * var142 + var123 * var144 + var124 * var143);
                                                var78 = (var134 * var142 + var132 * var144 + var133 * var143) * var145;
                                                var74 = (var128 * var142 + var126 * var144 + var127 * var143) * var145;
                                                var76 = (var131 * var142 + var129 * var144 + var130 * var143) * var145;
                                             }
                                          }
                                       } else {
                                          var111 = arg1.field1701[var67];
                                          var112 = arg1.field1707[var67];
                                          var113 = arg1.field1674[var67];
                                          var114 = arg1.field1698[var69];
                                          var115 = arg1.field1661[var69];
                                          var116 = arg1.field1716[var69];
                                          var117 = (float)arg1.field1696[var114];
                                          var118 = (float)arg1.field1714[var114];
                                          var119 = (float)arg1.field1699[var114];
                                          var120 = (float)arg1.field1696[var115] - var117;
                                          var121 = (float)arg1.field1714[var115] + -var118;
                                          var122 = (float)arg1.field1699[var115] + -var119;
                                          var123 = (float)arg1.field1696[var116] - var117;
                                          var124 = (float)arg1.field1714[var116] + -var118;
                                          var125 = (float)arg1.field1699[var116] + -var119;
                                          var126 = (float)arg1.field1696[var111] + -var117;
                                          var127 = (float)arg1.field1714[var111] + -var118;
                                          var128 = (float)arg1.field1699[var111] + -var119;
                                          var129 = (float)arg1.field1696[var112] - var117;
                                          var130 = (float)arg1.field1714[var112] + -var118;
                                          var131 = (float)arg1.field1699[var112] + -var119;
                                          var132 = (float)arg1.field1696[var113] + -var117;
                                          var133 = (float)arg1.field1714[var113] + -var118;
                                          var134 = (float)arg1.field1699[var113] + -var119;
                                          var135 = var121 * var125 - var122 * var124;
                                          var136 = var122 * var123 + -(var120 * var125);
                                          var137 = var120 * var124 - var121 * var123;
                                          var138 = var124 * var137 - var125 * var136;
                                          var139 = var125 * var135 + -(var123 * var137);
                                          var140 = var123 * var136 - var124 * var135;
                                          var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                                          var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                                          var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                                          var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                                          var142 = var120 * var136 - var121 * var135;
                                          var143 = var122 * var135 + -(var120 * var137);
                                          var144 = var121 * var137 + -(var122 * var136);
                                          var145 = 1.0F / (var125 * var142 + var123 * var144 + var124 * var143);
                                          var78 = (var134 * var142 + var132 * var144 + var133 * var143) * var145;
                                          var74 = (var128 * var142 + var126 * var144 + var127 * var143) * var145;
                                          var76 = (var131 * var142 + var129 * var144 + var130 * var143) * var145;
                                       }
                                    }
                                 }

                                 if (arg1.field1690 != null) {
                                    var146 = arg1.field1690[var67];
                                    if (var7 != 0) {
                                       var146 = 0;
                                    }
                                 } else {
                                    var146 = 0;
                                 }

                                 if (~var146 == -1) {
                                    var147 = ((long)(var68 << 8) + (long)(var81 << 24) + (long)var70 << 32) + (long)(var69 << 2);
                                    var149 = arg1.field1701[var67];
                                    var150 = arg1.field1707[var67];
                                    var151 = arg1.field1674[var67];
                                    var152 = var32[var149];
                                    this.field3199[var46] = this.method1852(arg1, var152.field2098, var152.field2090, var147, var149, false, var73, var152.field2092, var152.field2094, var74);
                                    var153 = var32[var150];
                                    this.field3282[var46] = this.method1852(arg1, var153.field2098, var153.field2090, (long)var79 + var147, var150, false, var75, var153.field2092, var153.field2094, var76);
                                    var154 = var32[var151];
                                    this.field3300[var46] = this.method1852(arg1, var154.field2098, var154.field2090, (long)var80 + var147, var151, false, var77, var154.field2092, var154.field2094, var78);
                                    if (var7 != 0) {
                                       if (var146 == 1) {
                                          var155 = var44[var67];
                                          var156 = (long)((var155.field9243 + 256 << 22) + (~var155.field9245 >= -1 ? 2048 : 1024) + (var69 << 2) + (var155.field9247 - -256 << 12)) + ((long)(var68 << 8) + (long)(var81 << 24) + (long)var70 << 32);
                                          this.field3199[var46] = this.method1852(arg1, 0, var155.field9243, var156, arg1.field1701[var67], false, var73, var155.field9247, var155.field9245, var74);
                                          this.field3282[var46] = this.method1852(arg1, 0, var155.field9243, (long)var79 + var156, arg1.field1707[var67], false, var75, var155.field9247, var155.field9245, var76);
                                          this.field3300[var46] = this.method1852(arg1, 0, var155.field9243, (long)var80 + var156, arg1.field1674[var67], false, var77, var155.field9247, var155.field9245, var78);
                                       }

                                       if (arg1.field1694 != null) {
                                          this.field3247[var46] = arg1.field1694[var67];
                                       }

                                       if (arg1.field1706 != null) {
                                          this.field3204[var46] = arg1.field1706[var67];
                                       }

                                       this.field3183[var46] = arg1.field1682[var67];
                                       this.field3274[var46] = var71;
                                       ++var46;
                                    } else {
                                       if (arg1.field1694 != null) {
                                          this.field3247[var46] = arg1.field1694[var67];
                                       }

                                       if (arg1.field1706 != null) {
                                          this.field3204[var46] = arg1.field1706[var67];
                                       }

                                       this.field3183[var46] = arg1.field1682[var67];
                                       this.field3274[var46] = var71;
                                       ++var46;
                                    }
                                 } else {
                                    if (var146 == 1) {
                                       var155 = var44[var67];
                                       var156 = (long)((var155.field9243 + 256 << 22) + (~var155.field9245 >= -1 ? 2048 : 1024) + (var69 << 2) + (var155.field9247 - -256 << 12)) + ((long)(var68 << 8) + (long)(var81 << 24) + (long)var70 << 32);
                                       this.field3199[var46] = this.method1852(arg1, 0, var155.field9243, var156, arg1.field1701[var67], false, var73, var155.field9247, var155.field9245, var74);
                                       this.field3282[var46] = this.method1852(arg1, 0, var155.field9243, (long)var79 + var156, arg1.field1707[var67], false, var75, var155.field9247, var155.field9245, var76);
                                       this.field3300[var46] = this.method1852(arg1, 0, var155.field9243, (long)var80 + var156, arg1.field1674[var67], false, var77, var155.field9247, var155.field9245, var78);
                                    }

                                    if (arg1.field1694 != null) {
                                       this.field3247[var46] = arg1.field1694[var67];
                                    }

                                    if (arg1.field1706 != null) {
                                       this.field3204[var46] = arg1.field1706[var67];
                                    }

                                    this.field3183[var46] = arg1.field1682[var67];
                                    this.field3274[var46] = var71;
                                    ++var46;
                                 }

                                 if (~var46 <= ~this.field3201) {
                                    var67 = 0;
                                    var68 = -10000;
                                    var158 = 0;
                                    if (var7 == 0) {
                                       if (var7 != 0) {
                                          var159 = this.field3274[var158];
                                          if (~var68 != ~var159) {
                                             ++var67;
                                             var68 = var159;
                                          }

                                          ++var158;
                                       }

                                       while(true) {
                                          if (var158 >= this.field3210) {
                                             this.field3257 = new int[var67 + 1];
                                             var67 = 0;
                                             var68 = -10000;
                                             var169 = 0;
                                             if (var7 == 0) {
                                                if (var7 != 0) {
                                                   var160 = this.field3274[var169];
                                                   if (var68 != var160) {
                                                      var68 = var160;
                                                      this.field3257[var67++] = var169;
                                                   }

                                                   ++var169;
                                                }

                                                while(true) {
                                                   if (~this.field3210 >= ~var169) {
                                                      this.field3257[var67] = this.field3210;
                                                      class37.field400 = null;
                                                      this.field3267 = class544.method4018(this.field3191, (byte)107, this.field3267);
                                                      this.field3299 = class544.method4018(this.field3191, (byte)106, this.field3299);
                                                      this.field3189 = class544.method4018(this.field3191, (byte)116, this.field3189);
                                                      this.field3289 = class256.method1936(this.field3191, this.field3289, -37);
                                                      this.field3237 = class784.method5637(this.field3237, (byte)0, this.field3191);
                                                      var171 = this;
                                                      if (var7 == 0) {
                                                         this.field3184 = class784.method5637(this.field3184, (byte)0, this.field3191);
                                                         if (arg1.field1718 != null && class426.method3240(arg2, (byte)-98, this.field3236)) {
                                                            this.field3288 = arg1.method1140(0, false);
                                                         }

                                                         if (arg1.field1679 != null && class119.method994(0, this.field3236, arg2)) {
                                                            this.field3192 = arg1.method1138((byte)-70);
                                                         }

                                                         if (arg1.field1693 != null && class69.method689(this.field3236, arg2, -5534)) {
                                                            var161 = 0;
                                                            var162 = new int[256];
                                                            var163 = 0;
                                                            if (var7 != 0) {
                                                               var164 = arg1.field1693[var9[var163]];
                                                               if (var164 >= 0) {
                                                                  var10002 = var162[var164]++;
                                                                  if (~var164 < ~var161) {
                                                                     var161 = var164;
                                                                  }
                                                               }

                                                               ++var163;
                                                            }

                                                            while(true) {
                                                               if (this.field3201 <= var163) {
                                                                  this.field3242 = new int[var161 + 1][];
                                                                  var164 = 0;
                                                                  if (var7 == 0) {
                                                                     if (var7 != 0) {
                                                                        this.field3242[var164] = new int[var162[var164]];
                                                                        var162[var164] = 0;
                                                                        ++var164;
                                                                     }

                                                                     while(true) {
                                                                        while(var164 <= var161) {
                                                                           this.field3242[var164] = new int[var162[var164]];
                                                                           var162[var164] = 0;
                                                                           ++var164;
                                                                        }

                                                                        var165 = 0;
                                                                        if (var7 == 0) {
                                                                           if (var7 == 0 && ~this.field3201 >= ~var165) {
                                                                              return;
                                                                           }

                                                                           do {
                                                                              var166 = arg1.field1693[var9[var165]];
                                                                              if (~var166 <= -1) {
                                                                                 this.field3242[var166][var162[var166]++] = var165;
                                                                              }

                                                                              ++var165;
                                                                           } while(~this.field3201 < ~var165);

                                                                           return;
                                                                        }

                                                                        ++var164;
                                                                     }
                                                                  }
                                                               } else {
                                                                  var164 = arg1.field1693[var9[var163]];
                                                               }

                                                               if (var164 >= 0) {
                                                                  var10002 = var162[var164]++;
                                                                  if (~var164 < ~var161) {
                                                                     var161 = var164;
                                                                  }
                                                               }

                                                               ++var163;
                                                            }
                                                         }

                                                         return;
                                                      }
                                                   } else {
                                                      var171 = this;
                                                   }

                                                   var160 = var171.field3274[var169];
                                                   if (var68 != var160) {
                                                      var68 = var160;
                                                      this.field3257[var67++] = var169;
                                                   }

                                                   ++var169;
                                                }
                                             }
                                          } else {
                                             var169 = this.field3274[var158];
                                          }

                                          if (~var68 != ~var169) {
                                             ++var67;
                                             var68 = var169;
                                          }

                                          ++var158;
                                       }
                                    }
                                 } else {
                                    var67 = var9[var46];
                                    var68 = arg1.field1682[var67] & 65535;
                                 }

                                 if (arg1.field1697 == null) {
                                    var69 = -1;
                                    if (var7 != 0) {
                                       var69 = arg1.field1697[var67];
                                    }
                                 } else {
                                    var69 = arg1.field1697[var67];
                                 }

                                 if (arg1.field1694 != null) {
                                    var70 = 255 & arg1.field1694[var67];
                                    if (var7 != 0) {
                                       var70 = 0;
                                    }
                                 } else {
                                    var70 = 0;
                                 }

                                 var71 = arg1.field1683 == null ? -1 : arg1.field1683[var67];
                                 if (var71 != -1 && ~(this.field3236 & 64) != -1) {
                                    var72 = var8.method1159(65535 & var71, 124);
                                    if (var72.field4649) {
                                       var71 = -1;
                                    }
                                 }
                              }
                           }
                        } else {
                           var10000 = this.field3187[var41];
                        }

                        var42 = var10000;
                        this.field3187[var41] = var40;
                        var32[var41] = new class168();
                        var40 += var42;
                        ++var41;
                     }
                  }
               }

               while(true) {
                  int var10001;
                  class556 var34;
                  class571 var35;
                  int var36;
                  label3018: {
                     var34 = var170.field1679[var33];
                     var35 = class286.method2178((byte)-71, var34.field8251);
                     var36 = -1;
                     int var37 = 0;
                     if (var7 != 0) {
                        var10000 = ~var9[var37];
                        var10001 = ~var34.field8252;
                     } else if (this.field3201 <= var37) {
                        var10000 = var36;
                        var10001 = -1;
                        if (var7 == 0) {
                           break label3018;
                        }
                     } else {
                        var10000 = ~var9[var37];
                        var10001 = ~var34.field8252;
                     }

                     label3017:
                     do {
                        while(true) {
                           if (var10000 == var10001) {
                              var36 = var37;
                              if (var7 == 0) {
                                 var10000 = var37;
                                 var10001 = -1;
                                 break;
                              }

                              ++var37;
                           } else {
                              ++var37;
                           }

                           if (this.field3201 <= var37) {
                              var10000 = var36;
                              var10001 = -1;
                              if (var7 == 0) {
                                 break label3017;
                              }
                           } else {
                              var10000 = ~var9[var37];
                              var10001 = ~var34.field8252;
                           }
                        }
                     } while(var7 != 0);
                  }

                  if (var10000 == var10001) {
                     throw new RuntimeException();
                  }

                  int var38 = class628.field9131[arg1.field1682[var34.field8252] & 65535] & 16777215;
                  int var39 = var38 | 255 + -(arg1.field1694 != null ? arg1.field1694[var34.field8252] : 0) << 24;
                  this.field3265[var33] = new class277(var36, arg1.field1701[var34.field8252], arg1.field1707[var34.field8252], arg1.field1674[var34.field8252], var35.field8515, var35.field8516, var35.field8511, var35.field8513, var35.field8517, var35.field8512, var35.field8508, var34.field8254);
                  this.field3303[var33] = new class613(var39);
                  ++var33;
                  if (~var33 <= ~this.field3286) {
                     var33 = this.field3201 * 3;
                     this.field3195 = new short[var33];
                     this.field3184 = new float[var33];
                     this.field3183 = new short[this.field3201];
                     this.field3300 = new short[this.field3201];
                     this.field3274 = new short[this.field3201];
                     this.field3237 = new float[var33];
                     this.field3247 = new byte[this.field3201];
                     this.field3259 = (short)arg3;
                     this.field3289 = new byte[var33];
                     this.field3189 = new short[var33];
                     this.field3282 = new short[this.field3201];
                     class37.field400 = new long[var33];
                     this.field3299 = new short[var33];
                     this.field3267 = new short[var33];
                     this.field3199 = new short[this.field3201];
                     var170 = arg1;
                     if (var7 == 0) {
                        if (arg1.field1706 != null) {
                           this.field3204 = new short[this.field3201];
                        }

                        this.field3188 = (short)arg4;
                        var40 = 0;
                        var41 = 0;
                        if (var7 != 0) {
                           var42 = this.field3187[var41];
                           this.field3187[var41] = var40;
                           var32[var41] = new class168();
                           var40 += var42;
                           ++var41;
                        }

                        while(true) {
                           if (arg1.field1671 <= var41) {
                              this.field3187[arg1.field1671] = var40;
                              var43 = class724.method5250(Integer.MAX_VALUE, this.field3201, var9, arg1);
                              var44 = new class635[arg1.field1691];
                              var10000 = 0;
                              if (var7 == 0) {
                                 label507: {
                                    var45 = 0;
                                    if (var7 != 0) {
                                       var46 = arg1.field1701[var45];
                                    } else if (~arg1.field1691 >= ~var45) {
                                       var46 = 0;
                                       if (var7 == 0) {
                                          break label507;
                                       }
                                    } else {
                                       var46 = arg1.field1701[var45];
                                    }

                                    label506:
                                    while(true) {
                                       var47 = arg1.field1707[var45];
                                       var48 = arg1.field1674[var45];
                                       var49 = this.field3305[var47] + -this.field3305[var46];
                                       var50 = this.field3218[var47] + -this.field3218[var46];
                                       var51 = this.field3272[var47] + -this.field3272[var46];
                                       var52 = this.field3305[var48] + -this.field3305[var46];
                                       var53 = this.field3218[var48] + -this.field3218[var46];
                                       var54 = this.field3272[var48] - this.field3272[var46];
                                       var55 = var50 * var54 + -(var51 * var53);
                                       var56 = var51 * var52 - var49 * var54;
                                       var57 = var49 * var53 + -(var50 * var52);
                                       if (var7 != 0) {
                                          var55 >>= 1;
                                          var56 >>= 1;
                                          var57 >>= 1;
                                       }

                                       while(true) {
                                          while(true) {
                                             if (var55 <= 8192) {
                                                var10000 = ~var56;
                                                if (var7 != 0) {
                                                   var57 = var10000 >> -8193;
                                                   continue;
                                                }

                                                if (var10000 >= -8193 && var57 <= 8192 && ~var55 <= 8191 && ~var56 <= 8191 && var57 >= -8192) {
                                                   var58 = (int)Math.sqrt((double)(var57 * var57 + var55 * var55 + var56 * var56));
                                                   if (var58 <= 0) {
                                                      var58 = 1;
                                                   }

                                                   var59 = var57 * 256 / var58;
                                                   var60 = var55 * 256 / var58;
                                                   var61 = var56 * 256 / var58;
                                                   var62 = arg1.field1690 == null ? 0 : arg1.field1690[var45];
                                                   if (~var62 == -1) {
                                                      var63 = var32[var46];
                                                      var63.field2092 += var61;
                                                      var63.field2090 += var59;
                                                      ++var63.field2098;
                                                      var63.field2094 += var60;
                                                      var64 = var32[var47];
                                                      var64.field2094 += var60;
                                                      var64.field2090 += var59;
                                                      var64.field2092 += var61;
                                                      ++var64.field2098;
                                                      var65 = var32[var48];
                                                      var65.field2092 += var61;
                                                      ++var65.field2098;
                                                      var65.field2094 += var60;
                                                      var65.field2090 += var59;
                                                      if (var7 != 0) {
                                                         if (var62 == 1) {
                                                            var66 = var44[var45] = new class635();
                                                            var66.field9245 = var60;
                                                            var66.field9247 = var61;
                                                            var66.field9243 = var59;
                                                         }

                                                         ++var45;
                                                      } else {
                                                         ++var45;
                                                      }
                                                   } else {
                                                      if (var62 == 1) {
                                                         var66 = var44[var45] = new class635();
                                                         var66.field9245 = var60;
                                                         var66.field9247 = var61;
                                                         var66.field9243 = var59;
                                                      }

                                                      ++var45;
                                                   }

                                                   if (~arg1.field1691 >= ~var45) {
                                                      var46 = 0;
                                                      if (var7 == 0) {
                                                         break label506;
                                                      }
                                                   } else {
                                                      var46 = arg1.field1701[var45];
                                                   }
                                                   continue label506;
                                                }
                                             }

                                             var55 >>= 1;
                                             var56 >>= 1;
                                             var57 >>= 1;
                                          }
                                       }
                                    }
                                 }

                                 if (var7 != 0) {
                                    var67 = var9[var46];
                                    var68 = arg1.field1682[var67] & 65535;
                                    if (arg1.field1697 == null) {
                                       var69 = -1;
                                       if (var7 != 0) {
                                          var69 = arg1.field1697[var67];
                                       }
                                    } else {
                                       var69 = arg1.field1697[var67];
                                    }

                                    if (arg1.field1694 != null) {
                                       var70 = 255 & arg1.field1694[var67];
                                       if (var7 != 0) {
                                          var70 = 0;
                                       }
                                    } else {
                                       var70 = 0;
                                    }

                                    var71 = arg1.field1683 == null ? -1 : arg1.field1683[var67];
                                    if (var71 != -1 && ~(this.field3236 & 64) != -1) {
                                       var72 = var8.method1159(65535 & var71, 124);
                                       if (var72.field4649) {
                                          var71 = -1;
                                       }
                                    }
                                 } else {
                                    if (~var46 <= ~this.field3201) {
                                       var67 = 0;
                                       var68 = -10000;
                                       var158 = 0;
                                       if (var7 == 0) {
                                          if (var7 != 0) {
                                             var159 = this.field3274[var158];
                                             if (~var68 != ~var159) {
                                                ++var67;
                                                var68 = var159;
                                             }

                                             ++var158;
                                          }

                                          while(true) {
                                             if (var158 >= this.field3210) {
                                                this.field3257 = new int[var67 + 1];
                                                var67 = 0;
                                                var68 = -10000;
                                                var169 = 0;
                                                if (var7 == 0) {
                                                   if (var7 != 0) {
                                                      var160 = this.field3274[var169];
                                                      if (var68 != var160) {
                                                         var68 = var160;
                                                         this.field3257[var67++] = var169;
                                                      }

                                                      ++var169;
                                                   }

                                                   while(true) {
                                                      if (~this.field3210 >= ~var169) {
                                                         this.field3257[var67] = this.field3210;
                                                         class37.field400 = null;
                                                         this.field3267 = class544.method4018(this.field3191, (byte)107, this.field3267);
                                                         this.field3299 = class544.method4018(this.field3191, (byte)106, this.field3299);
                                                         this.field3189 = class544.method4018(this.field3191, (byte)116, this.field3189);
                                                         this.field3289 = class256.method1936(this.field3191, this.field3289, -37);
                                                         this.field3237 = class784.method5637(this.field3237, (byte)0, this.field3191);
                                                         var171 = this;
                                                         if (var7 == 0) {
                                                            this.field3184 = class784.method5637(this.field3184, (byte)0, this.field3191);
                                                            if (arg1.field1718 != null && class426.method3240(arg2, (byte)-98, this.field3236)) {
                                                               this.field3288 = arg1.method1140(0, false);
                                                            }

                                                            if (arg1.field1679 != null && class119.method994(0, this.field3236, arg2)) {
                                                               this.field3192 = arg1.method1138((byte)-70);
                                                            }

                                                            if (arg1.field1693 != null && class69.method689(this.field3236, arg2, -5534)) {
                                                               var161 = 0;
                                                               var162 = new int[256];
                                                               var163 = 0;
                                                               if (var7 != 0) {
                                                                  var164 = arg1.field1693[var9[var163]];
                                                                  if (var164 >= 0) {
                                                                     var10002 = var162[var164]++;
                                                                     if (~var164 < ~var161) {
                                                                        var161 = var164;
                                                                     }
                                                                  }

                                                                  ++var163;
                                                               }

                                                               while(true) {
                                                                  if (this.field3201 <= var163) {
                                                                     this.field3242 = new int[var161 + 1][];
                                                                     var164 = 0;
                                                                     if (var7 == 0) {
                                                                        if (var7 != 0) {
                                                                           this.field3242[var164] = new int[var162[var164]];
                                                                           var162[var164] = 0;
                                                                           ++var164;
                                                                        }

                                                                        while(true) {
                                                                           while(var164 <= var161) {
                                                                              this.field3242[var164] = new int[var162[var164]];
                                                                              var162[var164] = 0;
                                                                              ++var164;
                                                                           }

                                                                           var165 = 0;
                                                                           if (var7 == 0) {
                                                                              if (var7 == 0 && ~this.field3201 >= ~var165) {
                                                                                 return;
                                                                              }

                                                                              do {
                                                                                 var166 = arg1.field1693[var9[var165]];
                                                                                 if (~var166 <= -1) {
                                                                                    this.field3242[var166][var162[var166]++] = var165;
                                                                                 }

                                                                                 ++var165;
                                                                              } while(~this.field3201 < ~var165);

                                                                              return;
                                                                           }

                                                                           ++var164;
                                                                        }
                                                                     }
                                                                  } else {
                                                                     var164 = arg1.field1693[var9[var163]];
                                                                  }

                                                                  if (var164 >= 0) {
                                                                     var10002 = var162[var164]++;
                                                                     if (~var164 < ~var161) {
                                                                        var161 = var164;
                                                                     }
                                                                  }

                                                                  ++var163;
                                                               }
                                                            }

                                                            return;
                                                         }
                                                      } else {
                                                         var171 = this;
                                                      }

                                                      var160 = var171.field3274[var169];
                                                      if (var68 != var160) {
                                                         var68 = var160;
                                                         this.field3257[var67++] = var169;
                                                      }

                                                      ++var169;
                                                   }
                                                }
                                             } else {
                                                var169 = this.field3274[var158];
                                             }

                                             if (~var68 != ~var169) {
                                                ++var67;
                                                var68 = var169;
                                             }

                                             ++var158;
                                          }
                                       }
                                    } else {
                                       var67 = var9[var46];
                                       var68 = arg1.field1682[var67] & 65535;
                                    }

                                    if (arg1.field1697 == null) {
                                       var69 = -1;
                                       if (var7 != 0) {
                                          var69 = arg1.field1697[var67];
                                       }
                                    } else {
                                       var69 = arg1.field1697[var67];
                                    }

                                    if (arg1.field1694 != null) {
                                       var70 = 255 & arg1.field1694[var67];
                                       if (var7 != 0) {
                                          var70 = 0;
                                       }
                                    } else {
                                       var70 = 0;
                                    }

                                    var71 = arg1.field1683 == null ? -1 : arg1.field1683[var67];
                                    if (var71 != -1 && ~(this.field3236 & 64) != -1) {
                                       var72 = var8.method1159(65535 & var71, 124);
                                       if (var72.field4649) {
                                          var71 = -1;
                                       }
                                    }
                                 }

                                 while(true) {
                                    var73 = 0.0F;
                                    var74 = 0.0F;
                                    var75 = 0.0F;
                                    var76 = 0.0F;
                                    var77 = 0.0F;
                                    var78 = 0.0F;
                                    var79 = 0;
                                    var80 = 0;
                                    var81 = 0;
                                    if (var71 != -1) {
                                       label3519: {
                                          if (var69 == -1) {
                                             var79 = 1;
                                             var77 = 0.0F;
                                             var78 = 0.0F;
                                             var76 = 1.0F;
                                             var73 = 0.0F;
                                             var80 = 2;
                                             var75 = 1.0F;
                                             var74 = 1.0F;
                                             if (var7 == 0) {
                                                break label3519;
                                             }
                                          }

                                          var69 &= 255;
                                          var82 = arg1.field1665[var69];
                                          if (~var82 != -1) {
                                             label3469: {
                                                var83 = arg1.field1701[var67];
                                                var84 = arg1.field1707[var67];
                                                var85 = arg1.field1674[var67];
                                                var86 = var43.field11259[var69];
                                                var87 = var43.field11260[var69];
                                                var88 = var43.field11266[var69];
                                                var89 = var43.field11262[var69];
                                                var90 = arg1.field1675[var69];
                                                var91 = (float)arg1.field1666[var69] / 256.0F;
                                                if (~var82 == -2) {
                                                   var92 = (float)arg1.field1703[var69] / 1024.0F;
                                                   class740.method5397(var90, arg1.field1696[var83], var86, class324.field4612, var89, var92, arg1.field1699[var83], arg1.field1714[var83], var87, var91, var88, (byte)25);
                                                   var74 = class324.field4612[1];
                                                   var73 = class324.field4612[0];
                                                   class740.method5397(var90, arg1.field1696[var84], var86, class324.field4612, var89, var92, arg1.field1699[var84], arg1.field1714[var84], var87, var91, var88, (byte)69);
                                                   var75 = class324.field4612[0];
                                                   var76 = class324.field4612[1];
                                                   class740.method5397(var90, arg1.field1696[var85], var86, class324.field4612, var89, var92, arg1.field1699[var85], arg1.field1714[var85], var87, var91, var88, (byte)31);
                                                   var77 = class324.field4612[0];
                                                   var78 = class324.field4612[1];
                                                   var93 = var92 / 2.0F;
                                                   if ((1 & var90) == 0) {
                                                      if (-var73 + var75 > var93) {
                                                         var79 = 1;
                                                         var75 -= var92;
                                                         if (var7 != 0 && var93 < -var75 + var73) {
                                                            var75 += var92;
                                                            var79 = 2;
                                                         }
                                                      } else if (var93 < -var75 + var73) {
                                                         var75 += var92;
                                                         var79 = 2;
                                                      }

                                                      if (var93 < var77 - var73) {
                                                         var80 = 1;
                                                         var77 -= var92;
                                                         if (var7 == 0) {
                                                            break label3469;
                                                         }
                                                      }

                                                      if (!(var93 < var73 - var77)) {
                                                         break label3469;
                                                      }

                                                      var80 = 2;
                                                      var77 += var92;
                                                      if (var7 == 0) {
                                                         break label3469;
                                                      }

                                                      if (!(-var74 + var76 > var93)) {
                                                         if (var74 - var76 > var93) {
                                                            var79 = 2;
                                                            var76 += var92;
                                                            if (var7 != 0) {
                                                               var76 -= var92;
                                                               var79 = 1;
                                                            }
                                                         }
                                                      } else {
                                                         var76 -= var92;
                                                         var79 = 1;
                                                      }
                                                   } else if (!(-var74 + var76 > var93)) {
                                                      if (var74 - var76 > var93) {
                                                         var79 = 2;
                                                         var76 += var92;
                                                         if (var7 != 0) {
                                                            var76 -= var92;
                                                            var79 = 1;
                                                         }
                                                      }
                                                   } else {
                                                      var76 -= var92;
                                                      var79 = 1;
                                                   }

                                                   if (!(var93 < -var74 + var78)) {
                                                      if (!(-var78 + var74 > var93)) {
                                                         break label3469;
                                                      }

                                                      var80 = 2;
                                                      var78 += var92;
                                                      if (var7 == 0) {
                                                         break label3469;
                                                      }
                                                   }

                                                   var78 -= var92;
                                                   var80 = 1;
                                                   if (var7 == 0) {
                                                      break label3469;
                                                   }
                                                }

                                                if (~var82 != -3) {
                                                   if (~var82 != -4) {
                                                      break label3469;
                                                   }

                                                   class653.method4703(class324.field4612, var86, var90, var91, var89, arg1.field1696[var83], arg1.field1699[var83], var87, arg1.field1714[var83], false, var88);
                                                   var74 = class324.field4612[1];
                                                   var73 = class324.field4612[0];
                                                   class653.method4703(class324.field4612, var86, var90, var91, var89, arg1.field1696[var84], arg1.field1699[var84], var87, arg1.field1714[var84], false, var88);
                                                   var76 = class324.field4612[1];
                                                   var75 = class324.field4612[0];
                                                   class653.method4703(class324.field4612, var86, var90, var91, var89, arg1.field1696[var85], arg1.field1699[var85], var87, arg1.field1714[var85], false, var88);
                                                   var78 = class324.field4612[1];
                                                   var77 = class324.field4612[0];
                                                   if ((var90 & 1) == 0) {
                                                      if (-var73 + var75 > 0.5F) {
                                                         var79 = 1;
                                                         --var75;
                                                         if (var7 != 0 && -var75 + var73 > 0.5F) {
                                                            var79 = 2;
                                                            ++var75;
                                                         }
                                                      } else if (-var75 + var73 > 0.5F) {
                                                         var79 = 2;
                                                         ++var75;
                                                      }

                                                      if (-var73 + var77 > 0.5F) {
                                                         var80 = 1;
                                                         --var77;
                                                         if (var7 == 0) {
                                                            break label3469;
                                                         }
                                                      }

                                                      if (!(-var77 + var73 > 0.5F)) {
                                                         break label3469;
                                                      }

                                                      var80 = 2;
                                                      ++var77;
                                                      if (var7 == 0) {
                                                         break label3469;
                                                      }

                                                      if (var76 - var74 > 0.5F) {
                                                         var79 = 1;
                                                         --var76;
                                                         if (var7 != 0 && var74 - var76 > 0.5F) {
                                                            ++var76;
                                                            var79 = 2;
                                                         }
                                                      } else if (var74 - var76 > 0.5F) {
                                                         ++var76;
                                                         var79 = 2;
                                                      }
                                                   } else if (var76 - var74 > 0.5F) {
                                                      var79 = 1;
                                                      --var76;
                                                      if (var7 != 0 && var74 - var76 > 0.5F) {
                                                         ++var76;
                                                         var79 = 2;
                                                      }
                                                   } else if (var74 - var76 > 0.5F) {
                                                      ++var76;
                                                      var79 = 2;
                                                   }

                                                   if (!(var78 - var74 > 0.5F)) {
                                                      if (!(-var78 + var74 > 0.5F)) {
                                                         break label3469;
                                                      }

                                                      var80 = 2;
                                                      ++var78;
                                                      if (var7 == 0) {
                                                         break label3469;
                                                      }
                                                   }

                                                   --var78;
                                                   var80 = 1;
                                                   if (var7 == 0) {
                                                      break label3469;
                                                   }
                                                }

                                                var94 = (float)arg1.field1677[var69] / 256.0F;
                                                var95 = (float)arg1.field1680[var69] / 256.0F;
                                                var96 = arg1.field1696[var84] + -arg1.field1696[var83];
                                                var97 = arg1.field1714[var84] + -arg1.field1714[var83];
                                                var98 = arg1.field1699[var84] + -arg1.field1699[var83];
                                                var99 = arg1.field1696[var85] + -arg1.field1696[var83];
                                                var100 = arg1.field1714[var85] + -arg1.field1714[var83];
                                                var101 = arg1.field1699[var85] + -arg1.field1699[var83];
                                                var102 = var97 * var101 + -(var98 * var100);
                                                var103 = var98 * var99 + -(var96 * var101);
                                                var104 = var96 * var100 + -(var97 * var99);
                                                var105 = 64.0F / (float)arg1.field1689[var69];
                                                var106 = 64.0F / (float)arg1.field1673[var69];
                                                var107 = 64.0F / (float)arg1.field1703[var69];
                                                var108 = (var89[2] * (float)var104 + var89[1] * (float)var103 + var89[0] * (float)var102) / var105;
                                                var109 = (var89[5] * (float)var104 + var89[4] * (float)var103 + var89[3] * (float)var102) / var106;
                                                var110 = (var89[8] * (float)var104 + var89[7] * (float)var103 + var89[6] * (float)var102) / var107;
                                                var81 = class374.method2899(var110, 587, var108, var109);
                                                class777.method5598(var95, var90, var89, arg1.field1714[var83], (byte)15, var81, var87, arg1.field1699[var83], arg1.field1696[var83], var88, class324.field4612, var86, var94, var91);
                                                var74 = class324.field4612[1];
                                                var73 = class324.field4612[0];
                                                class777.method5598(var95, var90, var89, arg1.field1714[var84], (byte)15, var81, var87, arg1.field1699[var84], arg1.field1696[var84], var88, class324.field4612, var86, var94, var91);
                                                var76 = class324.field4612[1];
                                                var75 = class324.field4612[0];
                                                class777.method5598(var95, var90, var89, arg1.field1714[var85], (byte)15, var81, var87, arg1.field1699[var85], arg1.field1696[var85], var88, class324.field4612, var86, var94, var91);
                                                var77 = class324.field4612[0];
                                                var78 = class324.field4612[1];
                                                if (var7 != 0) {
                                                   var111 = arg1.field1701[var67];
                                                   var112 = arg1.field1707[var67];
                                                   var113 = arg1.field1674[var67];
                                                   var114 = arg1.field1698[var69];
                                                   var115 = arg1.field1661[var69];
                                                   var116 = arg1.field1716[var69];
                                                   var117 = (float)arg1.field1696[var114];
                                                   var118 = (float)arg1.field1714[var114];
                                                   var119 = (float)arg1.field1699[var114];
                                                   var120 = (float)arg1.field1696[var115] - var117;
                                                   var121 = (float)arg1.field1714[var115] + -var118;
                                                   var122 = (float)arg1.field1699[var115] + -var119;
                                                   var123 = (float)arg1.field1696[var116] - var117;
                                                   var124 = (float)arg1.field1714[var116] + -var118;
                                                   var125 = (float)arg1.field1699[var116] + -var119;
                                                   var126 = (float)arg1.field1696[var111] + -var117;
                                                   var127 = (float)arg1.field1714[var111] + -var118;
                                                   var128 = (float)arg1.field1699[var111] + -var119;
                                                   var129 = (float)arg1.field1696[var112] - var117;
                                                   var130 = (float)arg1.field1714[var112] + -var118;
                                                   var131 = (float)arg1.field1699[var112] + -var119;
                                                   var132 = (float)arg1.field1696[var113] + -var117;
                                                   var133 = (float)arg1.field1714[var113] + -var118;
                                                   var134 = (float)arg1.field1699[var113] + -var119;
                                                   var135 = var121 * var125 - var122 * var124;
                                                   var136 = var122 * var123 + -(var120 * var125);
                                                   var137 = var120 * var124 - var121 * var123;
                                                   var138 = var124 * var137 - var125 * var136;
                                                   var139 = var125 * var135 + -(var123 * var137);
                                                   var140 = var123 * var136 - var124 * var135;
                                                   var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                                                   var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                                                   var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                                                   var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                                                   var142 = var120 * var136 - var121 * var135;
                                                   var143 = var122 * var135 + -(var120 * var137);
                                                   var144 = var121 * var137 + -(var122 * var136);
                                                   var145 = 1.0F / (var125 * var142 + var123 * var144 + var124 * var143);
                                                   var78 = (var134 * var142 + var132 * var144 + var133 * var143) * var145;
                                                   var74 = (var128 * var142 + var126 * var144 + var127 * var143) * var145;
                                                   var76 = (var131 * var142 + var129 * var144 + var130 * var143) * var145;
                                                }
                                             }
                                          } else {
                                             var111 = arg1.field1701[var67];
                                             var112 = arg1.field1707[var67];
                                             var113 = arg1.field1674[var67];
                                             var114 = arg1.field1698[var69];
                                             var115 = arg1.field1661[var69];
                                             var116 = arg1.field1716[var69];
                                             var117 = (float)arg1.field1696[var114];
                                             var118 = (float)arg1.field1714[var114];
                                             var119 = (float)arg1.field1699[var114];
                                             var120 = (float)arg1.field1696[var115] - var117;
                                             var121 = (float)arg1.field1714[var115] + -var118;
                                             var122 = (float)arg1.field1699[var115] + -var119;
                                             var123 = (float)arg1.field1696[var116] - var117;
                                             var124 = (float)arg1.field1714[var116] + -var118;
                                             var125 = (float)arg1.field1699[var116] + -var119;
                                             var126 = (float)arg1.field1696[var111] + -var117;
                                             var127 = (float)arg1.field1714[var111] + -var118;
                                             var128 = (float)arg1.field1699[var111] + -var119;
                                             var129 = (float)arg1.field1696[var112] - var117;
                                             var130 = (float)arg1.field1714[var112] + -var118;
                                             var131 = (float)arg1.field1699[var112] + -var119;
                                             var132 = (float)arg1.field1696[var113] + -var117;
                                             var133 = (float)arg1.field1714[var113] + -var118;
                                             var134 = (float)arg1.field1699[var113] + -var119;
                                             var135 = var121 * var125 - var122 * var124;
                                             var136 = var122 * var123 + -(var120 * var125);
                                             var137 = var120 * var124 - var121 * var123;
                                             var138 = var124 * var137 - var125 * var136;
                                             var139 = var125 * var135 + -(var123 * var137);
                                             var140 = var123 * var136 - var124 * var135;
                                             var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                                             var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                                             var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                                             var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                                             var142 = var120 * var136 - var121 * var135;
                                             var143 = var122 * var135 + -(var120 * var137);
                                             var144 = var121 * var137 + -(var122 * var136);
                                             var145 = 1.0F / (var125 * var142 + var123 * var144 + var124 * var143);
                                             var78 = (var134 * var142 + var132 * var144 + var133 * var143) * var145;
                                             var74 = (var128 * var142 + var126 * var144 + var127 * var143) * var145;
                                             var76 = (var131 * var142 + var129 * var144 + var130 * var143) * var145;
                                          }
                                       }
                                    }

                                    if (arg1.field1690 != null) {
                                       var146 = arg1.field1690[var67];
                                       if (var7 != 0) {
                                          var146 = 0;
                                       }
                                    } else {
                                       var146 = 0;
                                    }

                                    if (~var146 == -1) {
                                       var147 = ((long)(var68 << 8) + (long)(var81 << 24) + (long)var70 << 32) + (long)(var69 << 2);
                                       var149 = arg1.field1701[var67];
                                       var150 = arg1.field1707[var67];
                                       var151 = arg1.field1674[var67];
                                       var152 = var32[var149];
                                       this.field3199[var46] = this.method1852(arg1, var152.field2098, var152.field2090, var147, var149, false, var73, var152.field2092, var152.field2094, var74);
                                       var153 = var32[var150];
                                       this.field3282[var46] = this.method1852(arg1, var153.field2098, var153.field2090, (long)var79 + var147, var150, false, var75, var153.field2092, var153.field2094, var76);
                                       var154 = var32[var151];
                                       this.field3300[var46] = this.method1852(arg1, var154.field2098, var154.field2090, (long)var80 + var147, var151, false, var77, var154.field2092, var154.field2094, var78);
                                       if (var7 != 0) {
                                          if (var146 == 1) {
                                             var155 = var44[var67];
                                             var156 = (long)((var155.field9243 + 256 << 22) + (~var155.field9245 >= -1 ? 2048 : 1024) + (var69 << 2) + (var155.field9247 - -256 << 12)) + ((long)(var68 << 8) + (long)(var81 << 24) + (long)var70 << 32);
                                             this.field3199[var46] = this.method1852(arg1, 0, var155.field9243, var156, arg1.field1701[var67], false, var73, var155.field9247, var155.field9245, var74);
                                             this.field3282[var46] = this.method1852(arg1, 0, var155.field9243, (long)var79 + var156, arg1.field1707[var67], false, var75, var155.field9247, var155.field9245, var76);
                                             this.field3300[var46] = this.method1852(arg1, 0, var155.field9243, (long)var80 + var156, arg1.field1674[var67], false, var77, var155.field9247, var155.field9245, var78);
                                          }

                                          if (arg1.field1694 != null) {
                                             this.field3247[var46] = arg1.field1694[var67];
                                          }

                                          if (arg1.field1706 != null) {
                                             this.field3204[var46] = arg1.field1706[var67];
                                          }

                                          this.field3183[var46] = arg1.field1682[var67];
                                          this.field3274[var46] = var71;
                                          ++var46;
                                       } else {
                                          if (arg1.field1694 != null) {
                                             this.field3247[var46] = arg1.field1694[var67];
                                          }

                                          if (arg1.field1706 != null) {
                                             this.field3204[var46] = arg1.field1706[var67];
                                          }

                                          this.field3183[var46] = arg1.field1682[var67];
                                          this.field3274[var46] = var71;
                                          ++var46;
                                       }
                                    } else {
                                       if (var146 == 1) {
                                          var155 = var44[var67];
                                          var156 = (long)((var155.field9243 + 256 << 22) + (~var155.field9245 >= -1 ? 2048 : 1024) + (var69 << 2) + (var155.field9247 - -256 << 12)) + ((long)(var68 << 8) + (long)(var81 << 24) + (long)var70 << 32);
                                          this.field3199[var46] = this.method1852(arg1, 0, var155.field9243, var156, arg1.field1701[var67], false, var73, var155.field9247, var155.field9245, var74);
                                          this.field3282[var46] = this.method1852(arg1, 0, var155.field9243, (long)var79 + var156, arg1.field1707[var67], false, var75, var155.field9247, var155.field9245, var76);
                                          this.field3300[var46] = this.method1852(arg1, 0, var155.field9243, (long)var80 + var156, arg1.field1674[var67], false, var77, var155.field9247, var155.field9245, var78);
                                       }

                                       if (arg1.field1694 != null) {
                                          this.field3247[var46] = arg1.field1694[var67];
                                       }

                                       if (arg1.field1706 != null) {
                                          this.field3204[var46] = arg1.field1706[var67];
                                       }

                                       this.field3183[var46] = arg1.field1682[var67];
                                       this.field3274[var46] = var71;
                                       ++var46;
                                    }

                                    if (~var46 <= ~this.field3201) {
                                       var67 = 0;
                                       var68 = -10000;
                                       var158 = 0;
                                       if (var7 == 0) {
                                          if (var7 != 0) {
                                             var159 = this.field3274[var158];
                                             if (~var68 != ~var159) {
                                                ++var67;
                                                var68 = var159;
                                             }

                                             ++var158;
                                          }

                                          while(true) {
                                             if (var158 >= this.field3210) {
                                                this.field3257 = new int[var67 + 1];
                                                var67 = 0;
                                                var68 = -10000;
                                                var169 = 0;
                                                if (var7 == 0) {
                                                   if (var7 != 0) {
                                                      var160 = this.field3274[var169];
                                                      if (var68 != var160) {
                                                         var68 = var160;
                                                         this.field3257[var67++] = var169;
                                                      }

                                                      ++var169;
                                                   }

                                                   while(true) {
                                                      if (~this.field3210 >= ~var169) {
                                                         this.field3257[var67] = this.field3210;
                                                         class37.field400 = null;
                                                         this.field3267 = class544.method4018(this.field3191, (byte)107, this.field3267);
                                                         this.field3299 = class544.method4018(this.field3191, (byte)106, this.field3299);
                                                         this.field3189 = class544.method4018(this.field3191, (byte)116, this.field3189);
                                                         this.field3289 = class256.method1936(this.field3191, this.field3289, -37);
                                                         this.field3237 = class784.method5637(this.field3237, (byte)0, this.field3191);
                                                         var171 = this;
                                                         if (var7 == 0) {
                                                            this.field3184 = class784.method5637(this.field3184, (byte)0, this.field3191);
                                                            if (arg1.field1718 != null && class426.method3240(arg2, (byte)-98, this.field3236)) {
                                                               this.field3288 = arg1.method1140(0, false);
                                                            }

                                                            if (arg1.field1679 != null && class119.method994(0, this.field3236, arg2)) {
                                                               this.field3192 = arg1.method1138((byte)-70);
                                                            }

                                                            if (arg1.field1693 != null && class69.method689(this.field3236, arg2, -5534)) {
                                                               var161 = 0;
                                                               var162 = new int[256];
                                                               var163 = 0;
                                                               if (var7 != 0) {
                                                                  var164 = arg1.field1693[var9[var163]];
                                                                  if (var164 >= 0) {
                                                                     var10002 = var162[var164]++;
                                                                     if (~var164 < ~var161) {
                                                                        var161 = var164;
                                                                     }
                                                                  }

                                                                  ++var163;
                                                               }

                                                               while(true) {
                                                                  if (this.field3201 <= var163) {
                                                                     this.field3242 = new int[var161 + 1][];
                                                                     var164 = 0;
                                                                     if (var7 == 0) {
                                                                        if (var7 != 0) {
                                                                           this.field3242[var164] = new int[var162[var164]];
                                                                           var162[var164] = 0;
                                                                           ++var164;
                                                                        }

                                                                        while(true) {
                                                                           while(var164 <= var161) {
                                                                              this.field3242[var164] = new int[var162[var164]];
                                                                              var162[var164] = 0;
                                                                              ++var164;
                                                                           }

                                                                           var165 = 0;
                                                                           if (var7 == 0) {
                                                                              if (var7 == 0 && ~this.field3201 >= ~var165) {
                                                                                 return;
                                                                              }

                                                                              do {
                                                                                 var166 = arg1.field1693[var9[var165]];
                                                                                 if (~var166 <= -1) {
                                                                                    this.field3242[var166][var162[var166]++] = var165;
                                                                                 }

                                                                                 ++var165;
                                                                              } while(~this.field3201 < ~var165);

                                                                              return;
                                                                           }

                                                                           ++var164;
                                                                        }
                                                                     }
                                                                  } else {
                                                                     var164 = arg1.field1693[var9[var163]];
                                                                  }

                                                                  if (var164 >= 0) {
                                                                     var10002 = var162[var164]++;
                                                                     if (~var164 < ~var161) {
                                                                        var161 = var164;
                                                                     }
                                                                  }

                                                                  ++var163;
                                                               }
                                                            }

                                                            return;
                                                         }
                                                      } else {
                                                         var171 = this;
                                                      }

                                                      var160 = var171.field3274[var169];
                                                      if (var68 != var160) {
                                                         var68 = var160;
                                                         this.field3257[var67++] = var169;
                                                      }

                                                      ++var169;
                                                   }
                                                }
                                             } else {
                                                var169 = this.field3274[var158];
                                             }

                                             if (~var68 != ~var169) {
                                                ++var67;
                                                var68 = var169;
                                             }

                                             ++var158;
                                          }
                                       }
                                    } else {
                                       var67 = var9[var46];
                                       var68 = arg1.field1682[var67] & 65535;
                                    }

                                    if (arg1.field1697 == null) {
                                       var69 = -1;
                                       if (var7 != 0) {
                                          var69 = arg1.field1697[var67];
                                       }
                                    } else {
                                       var69 = arg1.field1697[var67];
                                    }

                                    if (arg1.field1694 != null) {
                                       var70 = 255 & arg1.field1694[var67];
                                       if (var7 != 0) {
                                          var70 = 0;
                                       }
                                    } else {
                                       var70 = 0;
                                    }

                                    var71 = arg1.field1683 == null ? -1 : arg1.field1683[var67];
                                    if (var71 != -1 && ~(this.field3236 & 64) != -1) {
                                       var72 = var8.method1159(65535 & var71, 124);
                                       if (var72.field4649) {
                                          var71 = -1;
                                       }
                                    }
                                 }
                              }
                           } else {
                              var10000 = this.field3187[var41];
                           }

                           var42 = var10000;
                           this.field3187[var41] = var40;
                           var32[var41] = new class168();
                           var40 += var42;
                           ++var41;
                        }
                     }
                  } else {
                     var170 = arg1;
                  }
               }
            }

            if (var10000 != -1) {
               var11 = var8.method1159(arg1.field1683[var10] & 65535, 122);
               if (~(this.field3236 & 64) != -1) {
                  if (!var11.field4649) {
                     if (var11.field4643) {
                        if (var7 != 0) {
                           var9[this.field3201++] = var10;
                           ++this.field3187[arg1.field1701[var10]];
                           ++this.field3187[arg1.field1707[var10]];
                           ++this.field3187[arg1.field1674[var10]];
                           ++var10;
                        } else {
                           ++var10;
                        }
                     } else {
                        var9[this.field3201++] = var10;
                        ++this.field3187[arg1.field1701[var10]];
                        ++this.field3187[arg1.field1707[var10]];
                        ++this.field3187[arg1.field1674[var10]];
                        ++var10;
                     }
                  } else {
                     var9[this.field3201++] = var10;
                     ++this.field3187[arg1.field1701[var10]];
                     ++this.field3187[arg1.field1707[var10]];
                     ++this.field3187[arg1.field1674[var10]];
                     ++var10;
                  }
               } else if (var11.field4643) {
                  if (var7 != 0) {
                     var9[this.field3201++] = var10;
                     ++this.field3187[arg1.field1701[var10]];
                     ++this.field3187[arg1.field1707[var10]];
                     ++this.field3187[arg1.field1674[var10]];
                     ++var10;
                  } else {
                     ++var10;
                  }
               } else {
                  var9[this.field3201++] = var10;
                  ++this.field3187[arg1.field1701[var10]];
                  ++this.field3187[arg1.field1707[var10]];
                  ++this.field3187[arg1.field1674[var10]];
                  ++var10;
               }
            } else {
               var9[this.field3201++] = var10;
               ++this.field3187[arg1.field1701[var10]];
               ++this.field3187[arg1.field1707[var10]];
               ++this.field3187[arg1.field1674[var10]];
               ++var10;
            }
         }
      } catch (RuntimeException var168) {
         throw class670.method4877(var168, field3307[56] + (arg0 != null ? field3307[0] : field3307[1]) + ',' + (arg1 != null ? field3307[0] : field3307[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "NA",
      descriptor = "()Z",
      line = 1594
   )
   public final boolean method334() {
      int var1 = client.field4530;

      try {
         ++field3239;
         if (this.field3288 == null) {
            return false;
         } else {
            int var2 = 0;
            if (var1 != 0) {
               this.field3305[var2] <<= 4;
               this.field3218[var2] <<= 4;
               this.field3272[var2] <<= 4;
               ++var2;
            }

            while(true) {
               while(this.field3297 > var2) {
                  this.field3305[var2] <<= 4;
                  this.field3218[var2] <<= 4;
                  this.field3272[var2] <<= 4;
                  ++var2;
               }

               class117.field1429 = 0;
               class776.field11343 = 0;
               class242.field3079 = 0;
               if (var1 == 0) {
                  return true;
               }

               ++var2;
            }
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field3307[20] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "()[Lhka;",
      line = 1622
   )
   public final class57[] method297() {
      try {
         ++field3206;
         return this.field3306;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3307[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "I",
      descriptor = "(I[IIIIZI[I)V",
      line = 1630
   )
   public final void method330(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
      int var9 = client.field4530;

      try {
         ++field3194;
         int var10 = arg1.length;
         int var10000;
         if (arg0 != 0) {
            if (arg0 == 1) {
               if (arg7 != null) {
                  int var17 = arg7[1] * arg3 + (arg7[0] * arg2 - (-(arg7[2] * arg4) + -8192)) >> 14;
                  int var18 = arg7[5] * arg4 + 8192 + arg7[4] * arg3 + arg7[3] * arg2 >> 14;
                  int var19 = arg7[7] * arg3 + arg7[6] * arg2 + arg7[8] * arg4 + 8192 >> 14;
                  arg2 = var17;
                  arg3 = var18;
                  arg4 = var19;
               }

               arg2 <<= 4;
               arg4 <<= 4;
               arg3 <<= 4;
               int var20 = 0;
               if (var9 != 0 || var10 > var20) {
                  do {
                     int var21 = arg1[var20];
                     if (~var21 <= ~this.field3288.length) {
                        ++var20;
                     } else {
                        int[] var22 = this.field3288[var21];
                        int var23 = 0;
                        if (var9 == 0 && ~var23 <= ~var22.length) {
                           ++var20;
                        } else {
                           do {
                              int var24 = var22[var23];
                              if (this.field3298 != null && (this.field3298[var24] & arg6) == 0) {
                                 ++var23;
                              } else {
                                 this.field3305[var24] += arg2;
                                 this.field3218[var24] += arg3;
                                 this.field3272[var24] += arg4;
                                 ++var23;
                              }
                           } while(~var23 > ~var22.length);

                           ++var20;
                        }
                     }
                  } while(var10 > var20);

               }
            } else if (arg0 == 2) {
               if (arg7 != null) {
                  int var25 = arg7[9] << 4;
                  int var26 = arg7[10] << 4;
                  int var27 = arg7[11] << 4;
                  int var28 = arg7[12] << 4;
                  int var29 = arg7[13] << 4;
                  int var30 = arg7[14] << 4;
                  if (class560.field8375) {
                     int var31 = arg7[0] * class776.field11343 - (-(arg7[3] * class242.field3079) - arg7[6] * class117.field1429) + 8192 >> 14;
                     int var32 = arg7[1] * class776.field11343 + arg7[4] * class242.field3079 + arg7[7] * class117.field1429 + 8192 >> 14;
                     int var33 = arg7[2] * class776.field11343 + arg7[5] * class242.field3079 - (-(arg7[8] * class117.field1429) - 8192) >> 14;
                     int var34 = var28 + var31;
                     int var35 = var29 + var32;
                     class242.field3079 = var35;
                     class776.field11343 = var34;
                     int var36 = var30 + var33;
                     class560.field8375 = false;
                     class117.field1429 = var36;
                  }

                  int[] var37 = new int[9];
                  int var38 = class689.field10391[arg2];
                  int var39 = class689.field10389[arg2];
                  int var40 = class689.field10391[arg3];
                  int var41 = class689.field10389[arg3];
                  int var42 = class689.field10391[arg4];
                  int var43 = class689.field10389[arg4];
                  int var44 = var39 * var42 + 8192 >> 14;
                  int var45 = var39 * var43 + 8192 >> 14;
                  var37[1] = -var40 * var43 - -(var41 * var44) - -8192 >> 14;
                  var37[6] = -var41 * var42 + var40 * var45 + 8192 >> 14;
                  var37[8] = var38 * var40 + 8192 >> 14;
                  var37[3] = var38 * var43 + 8192 >> 14;
                  var37[4] = var38 * var42 + 8192 >> 14;
                  var37[2] = var38 * var41 + 8192 >> 14;
                  var37[7] = var40 * var44 + var41 * var43 + 8192 >> 14;
                  var37[0] = var41 * var45 + (var40 * var42 - -8192) >> 14;
                  var37[5] = -var39;
                  int var46 = var37[0] * -class776.field11343 - (-(var37[2] * -class117.field1429) - 8192 + -(var37[1] * -class242.field3079)) >> 14;
                  int var47 = var37[5] * -class117.field1429 + var37[3] * -class776.field11343 + var37[4] * -class242.field3079 + 8192 >> 14;
                  int var48 = var37[8] * -class117.field1429 + (var37[7] * -class242.field3079 + var37[6] * -class776.field11343 - -8192) >> 14;
                  int var49 = var46 - -class776.field11343;
                  int var50 = class242.field3079 + var47;
                  int var51 = var48 - -class117.field1429;
                  int[] var52 = new int[9];
                  int var53 = 0;
                  int var54;
                  int var57;
                  int var58;
                  int var59;
                  int var60;
                  int var61;
                  int[] var62;
                  int var63;
                  int var64;
                  int var65;
                  int var66;
                  int var67;
                  int var68;
                  int var69;
                  int var70;
                  int var71;
                  int var72;
                  int var73;
                  int[] var74;
                  int var75;
                  int var76;
                  int var77;
                  int var78;
                  int var79;
                  int var80;
                  int var81;
                  int var82;
                  if (var9 != 0) {
                     var54 = 0;
                  } else if (var53 >= 3) {
                     var57 = var37[2] * var30 + var37[0] * var28 + var37[1] * var29 + 8192 >> 14;
                     var58 = var37[4] * var29 + 8192 + var37[3] * var28 + var37[5] * var30 >> 14;
                     var54 = var49 + var57;
                     var59 = var50 + var58;
                     var60 = var37[8] * var30 + var37[6] * var28 + var37[7] * var29 + 8192 >> 14;
                     var61 = var51 + var60;
                     var62 = new int[9];
                     var63 = 0;
                     if (var9 == 0) {
                        label479: {
                           if (var9 != 0) {
                              var64 = 0;
                           } else if (var63 >= 3) {
                              var67 = arg7[2] * var61 + arg7[0] * var54 + 8192 - -(arg7[1] * var59) >> 14;
                              var68 = arg7[3] * var54 + arg7[5] * var61 + arg7[4] * var59 - -8192 >> 14;
                              var69 = var26 + var68;
                              var70 = arg7[8] * var61 + arg7[6] * var54 + 8192 - -(arg7[7] * var59) >> 14;
                              var64 = var25 + var67;
                              var71 = var27 + var70;
                              var72 = 0;
                              if (var9 == 0) {
                                 break label479;
                              }
                           } else {
                              var64 = 0;
                           }

                           while(true) {
                              label496: {
                                 if (var9 != 0) {
                                    var65 = 0;
                                    var66 = 0;
                                    if (var9 != 0) {
                                       var65 += arg7[var63 * 3 + var66] * var52[var66 * 3 + var64];
                                       ++var66;
                                    }
                                 } else {
                                    if (var64 >= 3) {
                                       break label496;
                                    }

                                    var65 = 0;
                                    var66 = 0;
                                    if (var9 != 0) {
                                       var65 += arg7[var63 * 3 + var66] * var52[var66 * 3 + var64];
                                       ++var66;
                                    }
                                 }

                                 while(true) {
                                    while(~var66 > -4) {
                                       var65 += arg7[var63 * 3 + var66] * var52[var66 * 3 + var64];
                                       ++var66;
                                    }

                                    var62[var63 * 3 + var64] = var65 + 8192 >> 14;
                                    if (var9 == 0) {
                                       ++var64;
                                       if (var64 >= 3) {
                                          break;
                                       }

                                       var65 = 0;
                                       var66 = 0;
                                       if (var9 != 0) {
                                          var65 += arg7[var63 * 3 + var66] * var52[var66 * 3 + var64];
                                          ++var66;
                                       }
                                    } else {
                                       ++var66;
                                    }
                                 }
                              }

                              ++var63;
                              if (var63 >= 3) {
                                 var67 = arg7[2] * var61 + arg7[0] * var54 + 8192 - -(arg7[1] * var59) >> 14;
                                 var68 = arg7[3] * var54 + arg7[5] * var61 + arg7[4] * var59 - -8192 >> 14;
                                 var69 = var26 + var68;
                                 var70 = arg7[8] * var61 + arg7[6] * var54 + 8192 - -(arg7[7] * var59) >> 14;
                                 var64 = var25 + var67;
                                 var71 = var27 + var70;
                                 var72 = 0;
                                 if (var9 == 0) {
                                    break;
                                 }
                              } else {
                                 var64 = 0;
                              }
                           }
                        }

                        if (var9 == 0 && var10 <= var72) {
                           return;
                        }

                        do {
                           var73 = arg1[var72];
                           if (this.field3288.length <= var73) {
                              ++var72;
                           } else {
                              var74 = this.field3288[var73];
                              var75 = 0;
                              if (var9 == 0 && var74.length <= var75) {
                                 ++var72;
                              } else {
                                 do {
                                    var76 = var74[var75];
                                    if (this.field3298 != null && (this.field3298[var76] & arg6) == 0) {
                                       ++var75;
                                    } else {
                                       var77 = this.field3305[var76] * var62[0] + this.field3218[var76] * var62[1] + 8192 - -(this.field3272[var76] * var62[2]) >> 14;
                                       var78 = this.field3305[var76] * var62[3] - -(this.field3218[var76] * var62[4]) + 8192 - -(this.field3272[var76] * var62[5]) >> 14;
                                       var79 = var64 + var77;
                                       var80 = this.field3305[var76] * var62[6] + this.field3272[var76] * var62[8] + this.field3218[var76] * var62[7] + 8192 >> 14;
                                       var81 = var69 + var78;
                                       var82 = var71 + var80;
                                       this.field3305[var76] = var79;
                                       this.field3218[var76] = var81;
                                       this.field3272[var76] = var82;
                                       ++var75;
                                    }
                                 } while(var74.length > var75);

                                 ++var72;
                              }
                           }
                        } while(var10 > var72);

                        return;
                     }
                  } else {
                     var54 = 0;
                  }

                  while(true) {
                     label640: {
                        int var55;
                        int var56;
                        if (var9 != 0) {
                           var55 = 0;
                           var56 = 0;
                           if (var9 != 0) {
                              var55 += arg7[var54 * 3 - -var56] * var37[var53 * 3 + var56];
                              ++var56;
                           }
                        } else {
                           if (var54 >= 3) {
                              break label640;
                           }

                           var55 = 0;
                           var56 = 0;
                           if (var9 != 0) {
                              var55 += arg7[var54 * 3 - -var56] * var37[var53 * 3 + var56];
                              ++var56;
                           }
                        }

                        while(true) {
                           while(~var56 > -4) {
                              var55 += arg7[var54 * 3 - -var56] * var37[var53 * 3 + var56];
                              ++var56;
                           }

                           var52[var53 * 3 + var54] = var55 + 8192 >> 14;
                           if (var9 == 0) {
                              ++var54;
                              if (var54 >= 3) {
                                 break;
                              }

                              var55 = 0;
                              var56 = 0;
                              if (var9 != 0) {
                                 var55 += arg7[var54 * 3 - -var56] * var37[var53 * 3 + var56];
                                 ++var56;
                              }
                           } else {
                              ++var56;
                           }
                        }
                     }

                     ++var53;
                     if (var53 >= 3) {
                        var57 = var37[2] * var30 + var37[0] * var28 + var37[1] * var29 + 8192 >> 14;
                        var58 = var37[4] * var29 + 8192 + var37[3] * var28 + var37[5] * var30 >> 14;
                        var54 = var49 + var57;
                        var59 = var50 + var58;
                        var60 = var37[8] * var30 + var37[6] * var28 + var37[7] * var29 + 8192 >> 14;
                        var61 = var51 + var60;
                        var62 = new int[9];
                        var63 = 0;
                        if (var9 == 0) {
                           label411: {
                              if (var9 != 0) {
                                 var64 = 0;
                              } else if (var63 >= 3) {
                                 var67 = arg7[2] * var61 + arg7[0] * var54 + 8192 - -(arg7[1] * var59) >> 14;
                                 var68 = arg7[3] * var54 + arg7[5] * var61 + arg7[4] * var59 - -8192 >> 14;
                                 var69 = var26 + var68;
                                 var70 = arg7[8] * var61 + arg7[6] * var54 + 8192 - -(arg7[7] * var59) >> 14;
                                 var64 = var25 + var67;
                                 var71 = var27 + var70;
                                 var72 = 0;
                                 if (var9 == 0) {
                                    break label411;
                                 }
                              } else {
                                 var64 = 0;
                              }

                              while(true) {
                                 label408: {
                                    if (var9 != 0) {
                                       var65 = 0;
                                       var66 = 0;
                                       if (var9 != 0) {
                                          var65 += arg7[var63 * 3 + var66] * var52[var66 * 3 + var64];
                                          ++var66;
                                       }
                                    } else {
                                       if (var64 >= 3) {
                                          break label408;
                                       }

                                       var65 = 0;
                                       var66 = 0;
                                       if (var9 != 0) {
                                          var65 += arg7[var63 * 3 + var66] * var52[var66 * 3 + var64];
                                          ++var66;
                                       }
                                    }

                                    while(true) {
                                       while(~var66 > -4) {
                                          var65 += arg7[var63 * 3 + var66] * var52[var66 * 3 + var64];
                                          ++var66;
                                       }

                                       var62[var63 * 3 + var64] = var65 + 8192 >> 14;
                                       if (var9 == 0) {
                                          ++var64;
                                          if (var64 >= 3) {
                                             break;
                                          }

                                          var65 = 0;
                                          var66 = 0;
                                          if (var9 != 0) {
                                             var65 += arg7[var63 * 3 + var66] * var52[var66 * 3 + var64];
                                             ++var66;
                                          }
                                       } else {
                                          ++var66;
                                       }
                                    }
                                 }

                                 ++var63;
                                 if (var63 >= 3) {
                                    var67 = arg7[2] * var61 + arg7[0] * var54 + 8192 - -(arg7[1] * var59) >> 14;
                                    var68 = arg7[3] * var54 + arg7[5] * var61 + arg7[4] * var59 - -8192 >> 14;
                                    var69 = var26 + var68;
                                    var70 = arg7[8] * var61 + arg7[6] * var54 + 8192 - -(arg7[7] * var59) >> 14;
                                    var64 = var25 + var67;
                                    var71 = var27 + var70;
                                    var72 = 0;
                                    if (var9 == 0) {
                                       break;
                                    }
                                 } else {
                                    var64 = 0;
                                 }
                              }
                           }

                           if (var9 == 0 && var10 <= var72) {
                              return;
                           }

                           do {
                              var73 = arg1[var72];
                              if (this.field3288.length <= var73) {
                                 ++var72;
                              } else {
                                 var74 = this.field3288[var73];
                                 var75 = 0;
                                 if (var9 == 0 && var74.length <= var75) {
                                    ++var72;
                                 } else {
                                    do {
                                       var76 = var74[var75];
                                       if (this.field3298 != null && (this.field3298[var76] & arg6) == 0) {
                                          ++var75;
                                       } else {
                                          var77 = this.field3305[var76] * var62[0] + this.field3218[var76] * var62[1] + 8192 - -(this.field3272[var76] * var62[2]) >> 14;
                                          var78 = this.field3305[var76] * var62[3] - -(this.field3218[var76] * var62[4]) + 8192 - -(this.field3272[var76] * var62[5]) >> 14;
                                          var79 = var64 + var77;
                                          var80 = this.field3305[var76] * var62[6] + this.field3272[var76] * var62[8] + this.field3218[var76] * var62[7] + 8192 >> 14;
                                          var81 = var69 + var78;
                                          var82 = var71 + var80;
                                          this.field3305[var76] = var79;
                                          this.field3218[var76] = var81;
                                          this.field3272[var76] = var82;
                                          ++var75;
                                       }
                                    } while(var74.length > var75);

                                    ++var72;
                                 }
                              }
                           } while(var10 > var72);

                           return;
                        }
                     } else {
                        var54 = 0;
                     }
                  }
               } else {
                  int var83 = 0;
                  int var97;
                  int var98;
                  int[] var99;
                  int var100;
                  int var101;
                  int var102;
                  int var103;
                  int var104;
                  int var105;
                  int var106;
                  int var107;
                  int var108;
                  int var109;
                  int var110;
                  int var111;
                  int var112;
                  int var113;
                  int var114;
                  if (var9 != 0) {
                     var10000 = arg1[var83];
                  } else if (~var83 <= ~var10) {
                     var10000 = arg5;
                     if (var9 == 0) {
                        if (arg5 != 0) {
                           var97 = 0;
                           if (var9 != 0 || ~var97 > ~var10) {
                              do {
                                 var98 = arg1[var97];
                                 if (~this.field3288.length >= ~var98) {
                                    ++var97;
                                 } else {
                                    var99 = this.field3288[var98];
                                    var100 = 0;
                                    if (var9 == 0 && ~var100 <= ~var99.length) {
                                       ++var97;
                                    } else {
                                       label820:
                                       do {
                                          var101 = var99[var100];
                                          if (this.field3298 != null && (arg6 & this.field3298[var101]) == 0) {
                                             ++var100;
                                          } else {
                                             var102 = this.field3187[var101];
                                             var103 = this.field3187[var101 + 1];
                                             var104 = var102;
                                             if (var9 == 0 && var102 >= var103) {
                                                ++var100;
                                             } else {
                                                do {
                                                   var105 = this.field3195[var104] + -1;
                                                   if (var105 == -1) {
                                                      ++var100;
                                                      continue label820;
                                                   }

                                                   if (~arg4 != -1) {
                                                      var106 = class689.field10389[arg4];
                                                      var107 = class689.field10391[arg4];
                                                      var108 = this.field3299[var105] * var106 + this.field3267[var105] * var107 + 16383 >> 14;
                                                      this.field3299[var105] = (short)(this.field3299[var105] * var107 + -(this.field3267[var105] * var106) + 16383 >> 14);
                                                      this.field3267[var105] = (short)var108;
                                                   }

                                                   if (~arg2 != -1) {
                                                      var109 = class689.field10389[arg2];
                                                      var110 = class689.field10391[arg2];
                                                      var111 = this.field3299[var105] * var110 - -16383 + -(this.field3189[var105] * var109) >> 14;
                                                      this.field3189[var105] = (short)(this.field3299[var105] * var109 + this.field3189[var105] * var110 + 16383 >> 14);
                                                      this.field3299[var105] = (short)var111;
                                                   }

                                                   if (~arg3 != -1) {
                                                      var112 = class689.field10389[arg3];
                                                      var113 = class689.field10391[arg3];
                                                      var114 = this.field3267[var105] * var113 + this.field3189[var105] * var112 + 16383 >> 14;
                                                      this.field3189[var105] = (short)(this.field3189[var105] * var113 + -(this.field3267[var105] * var112) + 16383 >> 14);
                                                      this.field3267[var105] = (short)var114;
                                                   }

                                                   ++var104;
                                                } while(var104 < var103);

                                                ++var100;
                                             }
                                          }
                                       } while(~var100 > ~var99.length);

                                       ++var97;
                                    }
                                 }
                              } while(~var97 > ~var10);
                           }

                           if (this.field3291 == null && this.field3281 != null) {
                              this.field3281.field5840 = null;
                           }

                           if (this.field3291 != null) {
                              this.field3291.field5840 = null;
                           }
                        }

                        return;
                     }
                  } else {
                     var10000 = arg1[var83];
                  }

                  while(true) {
                     int var84 = var10000;
                     if (~var84 <= ~this.field3288.length) {
                        ++var83;
                     } else {
                        int[] var85 = this.field3288[var84];
                        int var86 = 0;
                        int var87;
                        int var88;
                        int var89;
                        int var90;
                        int var91;
                        int var92;
                        int var93;
                        int var94;
                        int var95;
                        int var96;
                        if (var9 != 0) {
                           var87 = var85[var86];
                           if (this.field3298 != null) {
                              if (~(this.field3298[var87] & arg6) != -1) {
                                 this.field3305[var87] -= class776.field11343;
                                 this.field3218[var87] -= class242.field3079;
                                 this.field3272[var87] -= class117.field1429;
                                 if (~arg4 != -1) {
                                    var88 = class689.field10389[arg4];
                                    var89 = class689.field10391[arg4];
                                    var90 = this.field3218[var87] * var88 - -(this.field3305[var87] * var89) - -16383 >> 14;
                                    this.field3218[var87] = this.field3218[var87] * var89 + -(this.field3305[var87] * var88) + 16383 >> 14;
                                    this.field3305[var87] = var90;
                                 }

                                 if (~arg2 != -1) {
                                    var91 = class689.field10389[arg2];
                                    var92 = class689.field10391[arg2];
                                    var93 = this.field3218[var87] * var92 + 16383 - this.field3272[var87] * var91 >> 14;
                                    this.field3272[var87] = this.field3272[var87] * var92 + (this.field3218[var87] * var91 - -16383) >> 14;
                                    this.field3218[var87] = var93;
                                 }

                                 if (arg3 != 0) {
                                    var94 = class689.field10389[arg3];
                                    var95 = class689.field10391[arg3];
                                    var96 = this.field3272[var87] * var94 + (this.field3305[var87] * var95 - -16383) >> 14;
                                    this.field3272[var87] = this.field3272[var87] * var95 - (this.field3305[var87] * var94 - 16383) >> 14;
                                    this.field3305[var87] = var96;
                                 }

                                 this.field3305[var87] += class776.field11343;
                                 this.field3218[var87] += class242.field3079;
                                 this.field3272[var87] += class117.field1429;
                                 ++var86;
                              } else {
                                 ++var86;
                              }
                           } else {
                              this.field3305[var87] -= class776.field11343;
                              this.field3218[var87] -= class242.field3079;
                              this.field3272[var87] -= class117.field1429;
                              if (~arg4 != -1) {
                                 var88 = class689.field10389[arg4];
                                 var89 = class689.field10391[arg4];
                                 var90 = this.field3218[var87] * var88 - -(this.field3305[var87] * var89) - -16383 >> 14;
                                 this.field3218[var87] = this.field3218[var87] * var89 + -(this.field3305[var87] * var88) + 16383 >> 14;
                                 this.field3305[var87] = var90;
                              }

                              if (~arg2 != -1) {
                                 var91 = class689.field10389[arg2];
                                 var92 = class689.field10391[arg2];
                                 var93 = this.field3218[var87] * var92 + 16383 - this.field3272[var87] * var91 >> 14;
                                 this.field3272[var87] = this.field3272[var87] * var92 + (this.field3218[var87] * var91 - -16383) >> 14;
                                 this.field3218[var87] = var93;
                              }

                              if (arg3 != 0) {
                                 var94 = class689.field10389[arg3];
                                 var95 = class689.field10391[arg3];
                                 var96 = this.field3272[var87] * var94 + (this.field3305[var87] * var95 - -16383) >> 14;
                                 this.field3272[var87] = this.field3272[var87] * var95 - (this.field3305[var87] * var94 - 16383) >> 14;
                                 this.field3305[var87] = var96;
                              }

                              this.field3305[var87] += class776.field11343;
                              this.field3218[var87] += class242.field3079;
                              this.field3272[var87] += class117.field1429;
                              ++var86;
                           }
                        }

                        while(~var86 > ~var85.length) {
                           var87 = var85[var86];
                           if (this.field3298 != null) {
                              if (~(this.field3298[var87] & arg6) != -1) {
                                 this.field3305[var87] -= class776.field11343;
                                 this.field3218[var87] -= class242.field3079;
                                 this.field3272[var87] -= class117.field1429;
                                 if (~arg4 != -1) {
                                    var88 = class689.field10389[arg4];
                                    var89 = class689.field10391[arg4];
                                    var90 = this.field3218[var87] * var88 - -(this.field3305[var87] * var89) - -16383 >> 14;
                                    this.field3218[var87] = this.field3218[var87] * var89 + -(this.field3305[var87] * var88) + 16383 >> 14;
                                    this.field3305[var87] = var90;
                                 }

                                 if (~arg2 != -1) {
                                    var91 = class689.field10389[arg2];
                                    var92 = class689.field10391[arg2];
                                    var93 = this.field3218[var87] * var92 + 16383 - this.field3272[var87] * var91 >> 14;
                                    this.field3272[var87] = this.field3272[var87] * var92 + (this.field3218[var87] * var91 - -16383) >> 14;
                                    this.field3218[var87] = var93;
                                 }

                                 if (arg3 != 0) {
                                    var94 = class689.field10389[arg3];
                                    var95 = class689.field10391[arg3];
                                    var96 = this.field3272[var87] * var94 + (this.field3305[var87] * var95 - -16383) >> 14;
                                    this.field3272[var87] = this.field3272[var87] * var95 - (this.field3305[var87] * var94 - 16383) >> 14;
                                    this.field3305[var87] = var96;
                                 }

                                 this.field3305[var87] += class776.field11343;
                                 this.field3218[var87] += class242.field3079;
                                 this.field3272[var87] += class117.field1429;
                                 ++var86;
                              } else {
                                 ++var86;
                              }
                           } else {
                              this.field3305[var87] -= class776.field11343;
                              this.field3218[var87] -= class242.field3079;
                              this.field3272[var87] -= class117.field1429;
                              if (~arg4 != -1) {
                                 var88 = class689.field10389[arg4];
                                 var89 = class689.field10391[arg4];
                                 var90 = this.field3218[var87] * var88 - -(this.field3305[var87] * var89) - -16383 >> 14;
                                 this.field3218[var87] = this.field3218[var87] * var89 + -(this.field3305[var87] * var88) + 16383 >> 14;
                                 this.field3305[var87] = var90;
                              }

                              if (~arg2 != -1) {
                                 var91 = class689.field10389[arg2];
                                 var92 = class689.field10391[arg2];
                                 var93 = this.field3218[var87] * var92 + 16383 - this.field3272[var87] * var91 >> 14;
                                 this.field3272[var87] = this.field3272[var87] * var92 + (this.field3218[var87] * var91 - -16383) >> 14;
                                 this.field3218[var87] = var93;
                              }

                              if (arg3 != 0) {
                                 var94 = class689.field10389[arg3];
                                 var95 = class689.field10391[arg3];
                                 var96 = this.field3272[var87] * var94 + (this.field3305[var87] * var95 - -16383) >> 14;
                                 this.field3272[var87] = this.field3272[var87] * var95 - (this.field3305[var87] * var94 - 16383) >> 14;
                                 this.field3305[var87] = var96;
                              }

                              this.field3305[var87] += class776.field11343;
                              this.field3218[var87] += class242.field3079;
                              this.field3272[var87] += class117.field1429;
                              ++var86;
                           }
                        }

                        ++var83;
                     }

                     if (~var83 <= ~var10) {
                        var10000 = arg5;
                        if (var9 == 0) {
                           if (arg5 != 0) {
                              var97 = 0;
                              if (var9 != 0 || ~var97 > ~var10) {
                                 do {
                                    var98 = arg1[var97];
                                    if (~this.field3288.length >= ~var98) {
                                       ++var97;
                                    } else {
                                       var99 = this.field3288[var98];
                                       var100 = 0;
                                       if (var9 == 0 && ~var100 <= ~var99.length) {
                                          ++var97;
                                       } else {
                                          label686:
                                          do {
                                             var101 = var99[var100];
                                             if (this.field3298 != null && (arg6 & this.field3298[var101]) == 0) {
                                                ++var100;
                                             } else {
                                                var102 = this.field3187[var101];
                                                var103 = this.field3187[var101 + 1];
                                                var104 = var102;
                                                if (var9 == 0 && var102 >= var103) {
                                                   ++var100;
                                                } else {
                                                   do {
                                                      var105 = this.field3195[var104] + -1;
                                                      if (var105 == -1) {
                                                         ++var100;
                                                         continue label686;
                                                      }

                                                      if (~arg4 != -1) {
                                                         var106 = class689.field10389[arg4];
                                                         var107 = class689.field10391[arg4];
                                                         var108 = this.field3299[var105] * var106 + this.field3267[var105] * var107 + 16383 >> 14;
                                                         this.field3299[var105] = (short)(this.field3299[var105] * var107 + -(this.field3267[var105] * var106) + 16383 >> 14);
                                                         this.field3267[var105] = (short)var108;
                                                      }

                                                      if (~arg2 != -1) {
                                                         var109 = class689.field10389[arg2];
                                                         var110 = class689.field10391[arg2];
                                                         var111 = this.field3299[var105] * var110 - -16383 + -(this.field3189[var105] * var109) >> 14;
                                                         this.field3189[var105] = (short)(this.field3299[var105] * var109 + this.field3189[var105] * var110 + 16383 >> 14);
                                                         this.field3299[var105] = (short)var111;
                                                      }

                                                      if (~arg3 != -1) {
                                                         var112 = class689.field10389[arg3];
                                                         var113 = class689.field10391[arg3];
                                                         var114 = this.field3267[var105] * var113 + this.field3189[var105] * var112 + 16383 >> 14;
                                                         this.field3189[var105] = (short)(this.field3189[var105] * var113 + -(this.field3267[var105] * var112) + 16383 >> 14);
                                                         this.field3267[var105] = (short)var114;
                                                      }

                                                      ++var104;
                                                   } while(var104 < var103);

                                                   ++var100;
                                                }
                                             }
                                          } while(~var100 > ~var99.length);

                                          ++var97;
                                       }
                                    }
                                 } while(~var97 > ~var10);
                              }

                              if (this.field3291 == null && this.field3281 != null) {
                                 this.field3281.field5840 = null;
                              }

                              if (this.field3291 != null) {
                                 this.field3291.field5840 = null;
                              }
                           }

                           return;
                        }
                     } else {
                        var10000 = arg1[var83];
                     }
                  }
               }
            } else if (arg0 == 3) {
               if (arg7 != null) {
                  int var120 = arg7[9] << 4;
                  int var121 = arg7[10] << 4;
                  int var122 = arg7[11] << 4;
                  int var123 = arg7[12] << 4;
                  int var124 = arg7[13] << 4;
                  int var125 = arg7[14] << 4;
                  if (class560.field8375) {
                     int var126 = arg7[3] * class242.field3079 + arg7[0] * class776.field11343 - -(arg7[6] * class117.field1429) + 8192 >> 14;
                     int var127 = arg7[7] * class117.field1429 + arg7[4] * class242.field3079 + arg7[1] * class776.field11343 + 8192 >> 14;
                     int var128 = var123 + var126;
                     int var129 = var124 + var127;
                     int var130 = arg7[8] * class117.field1429 + (arg7[2] * class776.field11343 - -(arg7[5] * class242.field3079)) + 8192 >> 14;
                     class242.field3079 = var129;
                     class776.field11343 = var128;
                     int var131 = var125 + var130;
                     class560.field8375 = false;
                     class117.field1429 = var131;
                  }

                  int[] var148;
                  int var150;
                  int var156;
                  int var157;
                  int var158;
                  label975: {
                     int var132 = arg2 << 15 >> 7;
                     int var133 = arg3 << 15 >> 7;
                     int var134 = arg4 << 15 >> 7;
                     int var135 = -class776.field11343 * var132 + 8192 >> 14;
                     int var136 = -class242.field3079 * var133 + 8192 >> 14;
                     int var137 = -class117.field1429 * var134 + 8192 >> 14;
                     int var138 = class776.field11343 + var135;
                     int var139 = var136 - -class242.field3079;
                     int var140 = var137 - -class117.field1429;
                     int[] var141 = new int[]{arg7[0] * var132 + 8192 >> 14, arg7[3] * var132 - -8192 >> 14, arg7[6] * var132 + 8192 >> 14, arg7[1] * var133 + 8192 >> 14, arg7[4] * var133 + 8192 >> 14, arg7[7] * var133 + 8192 >> 14, arg7[2] * var134 + 8192 >> 14, arg7[5] * var134 - -8192 >> 14, arg7[8] * var134 + 8192 >> 14};
                     int var142 = var123 * var132 + 8192 >> 14;
                     int var143 = var124 * var133 + 8192 >> 14;
                     int var144 = var138 + var142;
                     int var145 = var125 * var134 + 8192 >> 14;
                     int var146 = var139 + var143;
                     int var147 = var140 + var145;
                     var148 = new int[9];
                     int var149 = 0;
                     int var153;
                     int var154;
                     int var155;
                     if (var9 != 0) {
                        var150 = 0;
                     } else if (~var149 <= -4) {
                        var153 = arg7[1] * var146 - -8192 + arg7[2] * var147 + arg7[0] * var144 >> 14;
                        var154 = arg7[3] * var144 + 8192 + arg7[4] * var146 + arg7[5] * var147 >> 14;
                        var150 = var120 + var153;
                        var155 = arg7[6] * var144 + arg7[7] * var146 + arg7[8] * var147 + 8192 >> 14;
                        var156 = var121 + var154;
                        var157 = var122 + var155;
                        var158 = 0;
                        if (var9 == 0) {
                           break label975;
                        }
                     } else {
                        var150 = 0;
                     }

                     while(true) {
                        label972: {
                           int var151;
                           int var152;
                           if (var9 != 0) {
                              var151 = 0;
                              var152 = 0;
                              if (var9 != 0) {
                                 var151 += arg7[var149 * 3 - -var152] * var141[var152 * 3 + var150];
                                 ++var152;
                              }
                           } else {
                              if (var150 >= 3) {
                                 break label972;
                              }

                              var151 = 0;
                              var152 = 0;
                              if (var9 != 0) {
                                 var151 += arg7[var149 * 3 - -var152] * var141[var152 * 3 + var150];
                                 ++var152;
                              }
                           }

                           while(true) {
                              while(var152 < 3) {
                                 var151 += arg7[var149 * 3 - -var152] * var141[var152 * 3 + var150];
                                 ++var152;
                              }

                              var148[var149 * 3 + var150] = var151 + 8192 >> 14;
                              if (var9 == 0) {
                                 ++var150;
                                 if (var150 >= 3) {
                                    break;
                                 }

                                 var151 = 0;
                                 var152 = 0;
                                 if (var9 != 0) {
                                    var151 += arg7[var149 * 3 - -var152] * var141[var152 * 3 + var150];
                                    ++var152;
                                 }
                              } else {
                                 ++var152;
                              }
                           }
                        }

                        ++var149;
                        if (~var149 <= -4) {
                           var153 = arg7[1] * var146 - -8192 + arg7[2] * var147 + arg7[0] * var144 >> 14;
                           var154 = arg7[3] * var144 + 8192 + arg7[4] * var146 + arg7[5] * var147 >> 14;
                           var150 = var120 + var153;
                           var155 = arg7[6] * var144 + arg7[7] * var146 + arg7[8] * var147 + 8192 >> 14;
                           var156 = var121 + var154;
                           var157 = var122 + var155;
                           var158 = 0;
                           if (var9 == 0) {
                              break;
                           }
                        } else {
                           var150 = 0;
                        }
                     }
                  }

                  if (var9 != 0 || ~var10 < ~var158) {
                     do {
                        int var159 = arg1[var158];
                        if (~this.field3288.length >= ~var159) {
                           ++var158;
                        } else {
                           int[] var160 = this.field3288[var159];
                           int var161 = 0;
                           if (var9 == 0 && ~var160.length >= ~var161) {
                              ++var158;
                           } else {
                              do {
                                 int var162 = var160[var161];
                                 if (this.field3298 != null && ~(arg6 & this.field3298[var162]) == -1) {
                                    ++var161;
                                 } else {
                                    int var163 = this.field3272[var162] * var148[2] + this.field3305[var162] * var148[0] + this.field3218[var162] * var148[1] + 8192 >> 14;
                                    int var164 = this.field3218[var162] * var148[4] + this.field3305[var162] * var148[3] + this.field3272[var162] * var148[5] + 8192 >> 14;
                                    int var165 = var156 + var164;
                                    int var166 = var150 + var163;
                                    int var167 = this.field3272[var162] * var148[8] + this.field3305[var162] * var148[6] + this.field3218[var162] * var148[7] - -8192 >> 14;
                                    int var168 = var157 + var167;
                                    this.field3305[var162] = var166;
                                    this.field3218[var162] = var165;
                                    this.field3272[var162] = var168;
                                    ++var161;
                                 }
                              } while(~var160.length < ~var161);

                              ++var158;
                           }
                        }
                     } while(~var10 < ~var158);

                  }
               } else {
                  int var115 = 0;
                  if (var9 != 0 || var115 < var10) {
                     do {
                        int var116 = arg1[var115];
                        if (~this.field3288.length >= ~var116) {
                           ++var115;
                        } else {
                           int[] var117 = this.field3288[var116];
                           int var118 = 0;
                           if (var9 == 0 && var118 >= var117.length) {
                              ++var115;
                           } else {
                              do {
                                 int var119 = var117[var118];
                                 if (this.field3298 != null && ~(arg6 & this.field3298[var119]) == -1) {
                                    ++var118;
                                 } else {
                                    this.field3305[var119] -= class776.field11343;
                                    this.field3218[var119] -= class242.field3079;
                                    this.field3272[var119] -= class117.field1429;
                                    this.field3305[var119] = this.field3305[var119] * arg2 >> 7;
                                    this.field3218[var119] = this.field3218[var119] * arg3 >> 7;
                                    this.field3272[var119] = this.field3272[var119] * arg4 >> 7;
                                    this.field3305[var119] += class776.field11343;
                                    this.field3218[var119] += class242.field3079;
                                    this.field3272[var119] += class117.field1429;
                                    ++var118;
                                 }
                              } while(var118 < var117.length);

                              ++var115;
                           }
                        }
                     } while(var115 < var10);

                  }
               }
            } else if (arg0 == 5) {
               if (this.field3242 != null) {
                  int var169 = 0;
                  if (var9 != 0 || var169 < var10) {
                     do {
                        int var170 = arg1[var169];
                        if (~this.field3242.length >= ~var170) {
                           ++var169;
                        } else {
                           int[] var171 = this.field3242[var170];
                           int var172 = 0;
                           if (var9 == 0 && ~var171.length >= ~var172) {
                              ++var169;
                           } else {
                              do {
                                 int var173 = var171[var172];
                                 if (this.field3204 != null && (arg6 & this.field3204[var173]) == 0) {
                                    ++var172;
                                 } else {
                                    int var174 = (255 & this.field3247[var173]) + arg2 * 8;
                                    if (~var174 > -1) {
                                       var174 = 0;
                                       if (var9 != 0 && var174 > 255) {
                                          var174 = 255;
                                       }
                                    } else if (var174 > 255) {
                                       var174 = 255;
                                    }

                                    this.field3247[var173] = (byte)var174;
                                    if (this.field3281 != null) {
                                       this.field3281.field5840 = null;
                                    }

                                    ++var172;
                                 }
                              } while(~var171.length < ~var172);

                              ++var169;
                           }
                        }
                     } while(var169 < var10);
                  }

                  if (this.field3265 != null) {
                     int var175 = 0;
                     if (var9 != 0 || this.field3286 > var175) {
                        do {
                           class277 var176 = this.field3265[var175];
                           class613 var177 = this.field3303[var175];
                           var177.field8972 = -(255 & this.field3247[var176.field3858]) + 255 << 24 | var177.field8972 & 16777215;
                           ++var175;
                        } while(this.field3286 > var175);
                     }
                  }
               }

            } else if (~arg0 == -8) {
               if (this.field3242 != null) {
                  int var178 = 0;
                  if (var9 != 0 || ~var178 > ~var10) {
                     do {
                        int var179 = arg1[var178];
                        if (~var179 <= ~this.field3242.length) {
                           ++var178;
                        } else {
                           int[] var180 = this.field3242[var179];
                           int var181 = 0;
                           if (var9 == 0 && var181 >= var180.length) {
                              ++var178;
                           } else {
                              do {
                                 int var182 = var180[var181];
                                 if (this.field3204 != null && ~(this.field3204[var182] & arg6) == -1) {
                                    ++var181;
                                 } else {
                                    int var183 = 65535 & this.field3183[var182];
                                    int var184 = var183 >> 10 & 63;
                                    int var185 = (985 & var183) >> 7;
                                    int var186 = 63 & var184 - -arg2;
                                    int var187 = 127 & var183;
                                    int var188 = arg3 / 4 + var185;
                                    int var189 = arg4 + var187;
                                    if (var188 < 0) {
                                       var188 = 0;
                                       if (var9 != 0 && ~var188 < -8) {
                                          var188 = 7;
                                       }
                                    } else if (~var188 < -8) {
                                       var188 = 7;
                                    }

                                    if (var189 < 0) {
                                       var189 = 0;
                                       if (var9 != 0 && var189 > 127) {
                                          var189 = 127;
                                       }
                                    } else if (var189 > 127) {
                                       var189 = 127;
                                    }

                                    this.field3183[var182] = (short)class379.method2928(var189, class379.method2928(var188 << 7, var186 << 10));
                                    if (this.field3281 != null) {
                                       this.field3281.field5840 = null;
                                    }

                                    ++var181;
                                 }
                              } while(var181 < var180.length);

                              ++var178;
                           }
                        }
                     } while(~var178 > ~var10);
                  }

                  if (this.field3265 != null) {
                     int var190 = 0;
                     if (var9 != 0 || ~this.field3286 < ~var190) {
                        do {
                           class277 var191 = this.field3265[var190];
                           class613 var192 = this.field3303[var190];
                           var192.field8972 = -16777216 & var192.field8972 | class628.field9131[65535 & this.field3183[var191.field3858]] & 16777215;
                           ++var190;
                        } while(~this.field3286 < ~var190);
                     }
                  }
               }

            } else if (~arg0 == -9) {
               if (this.field3192 != null) {
                  int var193 = 0;
                  if (var9 != 0 || ~var193 > ~var10) {
                     do {
                        int var194 = arg1[var193];
                        if (~this.field3192.length >= ~var194) {
                           ++var193;
                        } else {
                           int[] var195 = this.field3192[var194];
                           int var196 = 0;
                           if (var9 == 0 && var196 >= var195.length) {
                              ++var193;
                           } else {
                              do {
                                 class613 var197 = this.field3303[var195[var196]];
                                 var197.field8968 += arg3;
                                 var197.field8964 += arg2;
                                 ++var196;
                              } while(var196 < var195.length);

                              ++var193;
                           }
                        }
                     } while(~var193 > ~var10);
                  }
               }

            } else if (arg0 == 10) {
               if (this.field3192 != null) {
                  int var198 = 0;
                  if (var9 != 0 || var10 > var198) {
                     do {
                        int var199 = arg1[var198];
                        if (~this.field3192.length >= ~var199) {
                           ++var198;
                        } else {
                           int[] var200 = this.field3192[var199];
                           int var201 = 0;
                           if (var9 == 0 && var201 >= var200.length) {
                              ++var198;
                           } else {
                              do {
                                 class613 var202 = this.field3303[var200[var201]];
                                 var202.field8971 = var202.field8971 * arg3 >> 7;
                                 var202.field8967 = var202.field8967 * arg2 >> 7;
                                 ++var201;
                              } while(var201 < var200.length);

                              ++var198;
                           }
                        }
                     } while(var10 > var198);
                  }
               }

            } else if (arg0 == 9) {
               if (this.field3192 != null) {
                  int var203 = 0;
                  if (var9 != 0 || ~var203 > ~var10) {
                     do {
                        int var204 = arg1[var203];
                        if (~var204 <= ~this.field3192.length) {
                           ++var203;
                        } else {
                           int[] var205 = this.field3192[var204];
                           int var206 = 0;
                           if (var9 == 0 && var206 >= var205.length) {
                              ++var203;
                           } else {
                              do {
                                 class613 var207 = this.field3303[var205[var206]];
                                 var207.field8970 = var207.field8970 + arg2 & 16383;
                                 ++var206;
                              } while(var206 < var205.length);

                              ++var203;
                           }
                        }
                     } while(~var203 > ~var10);
                  }
               }

            }
         } else {
            arg4 <<= 4;
            arg3 <<= 4;
            arg2 <<= 4;
            class242.field3079 = 0;
            class776.field11343 = 0;
            class117.field1429 = 0;
            int var11 = 0;
            int var12 = 0;
            if (var9 != 0) {
               var10000 = arg1[var12];
            } else if (~var12 <= ~var10) {
               var10000 = var11;
               if (var9 == 0) {
                  if (var11 > 0) {
                     class117.field1429 = class117.field1429 / var11 + arg4;
                     class242.field3079 = class242.field3079 / var11 + arg3;
                     class560.field8375 = true;
                     class776.field11343 = class776.field11343 / var11 + arg2;
                     return;
                  }

                  class117.field1429 = arg4;
                  class242.field3079 = arg3;
                  class776.field11343 = arg2;
                  return;
               }
            } else {
               var10000 = arg1[var12];
            }

            while(true) {
               int var13 = var10000;
               if (this.field3288.length <= var13) {
                  ++var12;
               } else {
                  int[] var14 = this.field3288[var13];
                  int var15 = 0;
                  int var16;
                  if (var9 != 0) {
                     var16 = var14[var15];
                     if (this.field3298 != null) {
                        if ((this.field3298[var16] & arg6) != 0) {
                           class776.field11343 += this.field3305[var16];
                           class242.field3079 += this.field3218[var16];
                           class117.field1429 += this.field3272[var16];
                           ++var11;
                           ++var15;
                        } else {
                           ++var15;
                        }
                     } else {
                        class776.field11343 += this.field3305[var16];
                        class242.field3079 += this.field3218[var16];
                        class117.field1429 += this.field3272[var16];
                        ++var11;
                        ++var15;
                     }
                  }

                  while(var15 < var14.length) {
                     var16 = var14[var15];
                     if (this.field3298 != null) {
                        if ((this.field3298[var16] & arg6) != 0) {
                           class776.field11343 += this.field3305[var16];
                           class242.field3079 += this.field3218[var16];
                           class117.field1429 += this.field3272[var16];
                           ++var11;
                           ++var15;
                        } else {
                           ++var15;
                        }
                     } else {
                        class776.field11343 += this.field3305[var16];
                        class242.field3079 += this.field3218[var16];
                        class117.field1429 += this.field3272[var16];
                        ++var11;
                        ++var15;
                     }
                  }

                  ++var12;
               }

               if (~var12 <= ~var10) {
                  var10000 = var11;
                  if (var9 == 0) {
                     if (var11 > 0) {
                        class117.field1429 = class117.field1429 / var11 + arg4;
                        class242.field3079 = class242.field3079 / var11 + arg3;
                        class560.field8375 = true;
                        class776.field11343 = class776.field11343 / var11 + arg2;
                        return;
                     }

                     class117.field1429 = arg4;
                     class242.field3079 = arg3;
                     class776.field11343 = arg2;
                     return;
                  }
               } else {
                  var10000 = arg1[var12];
               }
            }
         }
      } catch (RuntimeException var209) {
         throw class670.method4877(var209, field3307[55] + arg0 + ',' + (arg1 != null ? field3307[0] : field3307[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field3307[0] : field3307[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "C",
      descriptor = "(I)V",
      line = 2616
   )
   public final void method336(int arg0) {
      try {
         ++field3280;
         this.field3259 = (short)arg0;
         if (this.field3281 != null) {
            this.field3281.field5840 = null;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3307[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(BIZ)Lka;",
      line = 2629
   )
   public final class497 method343(byte arg0, int arg1, boolean arg2) {
      int var4 = client.field4530;

      try {
         ++field3226;
         class247 var5;
         class247 var6;
         if (~arg0 == -2) {
            var5 = this.field3284.field9959;
            var6 = this.field3284.field9974;
            if (var4 == 0) {
               return this.method1846(var5, arg0 != 0, var6, true, arg2, arg1);
            }
         }

         if (~arg0 != -3) {
            if (~arg0 != -4) {
               if (~arg0 == -5) {
                  var6 = this.field3284.field10019;
                  var5 = this.field3284.field10044;
                  if (var4 == 0) {
                     return this.method1846(var5, arg0 != 0, var6, true, arg2, arg1);
                  }
               }

               if (arg0 != 5) {
                  var6 = var5 = new class247(this.field3284);
                  if (var4 == 0) {
                     return this.method1846(var5, arg0 != 0, var6, true, arg2, arg1);
                  }
               }

               var5 = this.field3284.field10030;
               var6 = this.field3284.field10005;
               if (var4 == 0) {
                  return this.method1846(var5, arg0 != 0, var6, true, arg2, arg1);
               }
            }

            var5 = this.field3284.field9946;
            var6 = this.field3284.field9973;
            if (var4 == 0) {
               return this.method1846(var5, arg0 != 0, var6, true, arg2, arg1);
            }
         }

         var6 = this.field3284.field10013;
         var5 = this.field3284.field9998;
         return this.method1846(var5, arg0 != 0, var6, true, arg2, arg1);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field3307[52] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "RA",
      descriptor = "()I",
      line = 2678
   )
   public final int method306() {
      try {
         ++field3252;
         if (!this.field3222) {
            this.method1859(-1);
         }

         return this.field3275;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3307[28] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "V",
      descriptor = "()I",
      line = 2692
   )
   public final int method344() {
      try {
         if (!this.field3222) {
            this.method1859(-1);
         }

         ++field3238;
         return this.field3234;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3307[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(Lgq;Lpda;II)V",
      line = 2705
   )
   public final void method338(class540 arg0, class655 arg1, int arg2, int arg3) {
      int var5 = client.field4530;

      try {
         ++field3279;
         if (this.field3191 != 0) {
            class218 var6 = this.field3284.field9926;
            if (!this.field3222) {
               this.method1859(-1);
            }

            class218 var7;
            float var10;
            float var11;
            label93: {
               var7 = (class218)arg0;
               class164.field2058 = var6.field2746 * var7.field2748 + var6.field2749 * var7.field2756 + var6.field2748 * var7.field2769;
               class540.field7876 = var6.field2746 * var7.field2750 + var6.field2749 * var7.field2761 + var6.field2748 * var7.field2773 + var6.field2750;
               float var8 = (float)this.field3256 * class164.field2058 + class540.field7876;
               float var9 = (float)this.field3190 * class164.field2058 + class540.field7876;
               if (var8 > var9) {
                  var10 = var9 - (float)this.field3271;
                  var11 = (float)this.field3271 + var8;
                  if (var5 == 0) {
                     break label93;
                  }
               }

               var10 = var8 - (float)this.field3271;
               var11 = (float)this.field3271 + var9;
            }

            if (!(var10 >= this.field3284.field10022)) {
               if (!((float)this.field3284.field9963 >= var11)) {
                  float var14;
                  float var15;
                  label85: {
                     class536.field7844 = var6.field2758 * var7.field2748 + var6.field2762 * var7.field2756 + var6.field2756 * var7.field2769;
                     class747.field11070 = var6.field2758 * var7.field2750 + var6.field2762 * var7.field2761 + var6.field2756 * var7.field2773 + var6.field2761;
                     float var12 = (float)this.field3256 * class536.field7844 + class747.field11070;
                     float var13 = (float)this.field3190 * class536.field7844 + class747.field11070;
                     if (var12 > var13) {
                        var14 = ((float)this.field3271 + var12) * (float)this.field3284.field9945;
                        var15 = ((float)(-this.field3271) + var13) * (float)this.field3284.field9945;
                        if (var5 == 0) {
                           break label85;
                        }
                     }

                     var15 = ((float)(-this.field3271) + var12) * (float)this.field3284.field9945;
                     var14 = ((float)this.field3271 + var13) * (float)this.field3284.field9945;
                  }

                  if (!(this.field3284.field9965 <= var15 / (float)arg2)) {
                     if (!(var14 / (float)arg2 <= this.field3284.field10027)) {
                        float var18;
                        float var19;
                        label77: {
                           class323.field4599 = var6.field2763 * var7.field2748 + var6.field2769 * var7.field2769 + var6.field2754 * var7.field2756;
                           class394.field5989 = var6.field2763 * var7.field2750 + var6.field2769 * var7.field2773 + var6.field2754 * var7.field2761 + var6.field2773;
                           float var16 = (float)this.field3256 * class323.field4599 + class394.field5989;
                           float var17 = (float)this.field3190 * class323.field4599 + class394.field5989;
                           if (var17 < var16) {
                              var18 = ((float)this.field3271 + var16) * (float)this.field3284.field10024;
                              var19 = (var17 - (float)this.field3271) * (float)this.field3284.field10024;
                              if (var5 == 0) {
                                 break label77;
                              }
                           }

                           var19 = (var16 - (float)this.field3271) * (float)this.field3284.field10024;
                           var18 = ((float)this.field3271 + var17) * (float)this.field3284.field10024;
                        }

                        if (!(this.field3284.field9981 <= var19 / (float)arg2)) {
                           if (!(this.field3284.field9944 >= var18 / (float)arg2)) {
                              if (arg1 != null || this.field3265 != null) {
                                 class743.field11020 = var6.field2763 * var7.field2749 + var6.field2769 * var7.field2754 + var6.field2754 * var7.field2762;
                                 class612.field8963 = var6.field2763 * var7.field2746 + var6.field2769 * var7.field2763 + var6.field2754 * var7.field2758;
                                 class289.field4056 = var6.field2758 * var7.field2746 + var6.field2762 * var7.field2758 + var6.field2756 * var7.field2763;
                                 class639.field9301 = var6.field2746 * var7.field2746 + var6.field2749 * var7.field2758 + var6.field2748 * var7.field2763;
                                 class405.field6204 = var6.field2758 * var7.field2749 + var6.field2762 * var7.field2762 + var6.field2756 * var7.field2754;
                                 class263.field3600 = var6.field2746 * var7.field2749 + var6.field2749 * var7.field2762 + var6.field2748 * var7.field2754;
                              }

                              if (arg1 != null) {
                                 int var20 = this.field3275 + this.field3234 >> 1;
                                 int var21 = this.field3255 - -this.field3295 >> 1;
                                 int var22 = (int)((float)var21 * class289.field4056 + (float)this.field3256 * class536.field7844 + (float)var20 * class405.field6204 + class747.field11070);
                                 int var23 = (int)((float)var21 * class612.field8963 + (float)this.field3256 * class323.field4599 + (float)var20 * class743.field11020 + class394.field5989);
                                 int var24 = (int)((float)var21 * class639.field9301 + (float)this.field3256 * class164.field2058 + (float)var20 * class263.field3600 + class540.field7876);
                                 int var25 = (int)((float)var21 * class289.field4056 + (float)this.field3190 * class536.field7844 + (float)var20 * class405.field6204 + class747.field11070);
                                 int var26 = (int)((float)var21 * class612.field8963 + (float)this.field3190 * class323.field4599 + (float)var20 * class743.field11020 + class394.field5989);
                                 int var27 = (int)((float)var21 * class639.field9301 + (float)this.field3190 * class164.field2058 + (float)var20 * class263.field3600 + class540.field7876);
                                 arg1.field9522 = this.field3284.field9945 * var25 / arg2 + this.field3284.field10003;
                                 arg1.field9521 = this.field3284.field9945 * var22 / arg2 + this.field3284.field10003;
                                 arg1.field9519 = this.field3284.field9940 - -(this.field3284.field10024 * var23 / arg2);
                                 arg1.field9524 = this.field3284.field10024 * var26 / arg2 + this.field3284.field9940;
                                 if (~this.field3284.field9963 >= ~var24 || ~this.field3284.field9963 >= ~var27) {
                                    arg1.field9520 = (var22 - -this.field3271) * this.field3284.field9945 / arg2 + this.field3284.field10003 + -arg1.field9521;
                                    arg1.field9523 = true;
                                 }
                              }

                              this.field3284.method4800((float)arg2, -4);
                              this.field3284.method4787((byte)-116);
                              this.field3284.method4815((byte)35, var7);
                              this.method1848(117);
                              this.field3284.method4790((byte)104);
                              this.method1850(-113);
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var29) {
         throw class670.method4877(var29, field3307[11] + (arg0 != null ? field3307[0] : field3307[1]) + ',' + (arg1 != null ? field3307[0] : field3307[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "ua",
      descriptor = "()I",
      line = 2861
   )
   public final int method326() {
      try {
         ++field3283;
         return this.field3249;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3307[59] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "c",
      descriptor = "()V",
      line = 2871
   )
   public final void method345() {
      try {
         ++field3244;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3307[19] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "r",
      descriptor = "()Z",
      line = 2878
   )
   public final boolean method332() {
      try {
         ++field3278;
         return this.field3185;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3307[33] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "f",
      descriptor = "()[Lria;",
      line = 2888
   )
   public final class299[] method323() {
      try {
         ++field3213;
         return this.field3292;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3307[57] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(Lut;IIJIZFIIF)S",
      line = 2897
   )
   private final short method1852(class134 arg0, int arg1, int arg2, long arg3, int arg4, boolean arg5, float arg6, int arg7, int arg8, float arg9) {
      int var12 = client.field4530;

      try {
         ++field3248;
         int var13 = this.field3187[arg4];
         int var14 = this.field3187[arg4 - -1];
         int var15 = 0;
         int var16 = var13;
         short var10000;
         if (var12 != 0) {
            var10000 = this.field3195[var13];
         } else if (var14 <= var13) {
            this.field3195[var15] = (short)(this.field3191 + 1);
            class37.field400[var15] = arg3;
            var10000 = arg5;
            if (var12 == 0) {
               if (arg5 != 0) {
                  this.method327();
               }

               this.field3267[this.field3191] = (short)arg8;
               this.field3299[this.field3191] = (short)arg7;
               this.field3189[this.field3191] = (short)arg2;
               this.field3289[this.field3191] = (byte)arg1;
               this.field3237[this.field3191] = arg6;
               this.field3184[this.field3191] = arg9;
               return (short)(this.field3191++);
            }
         } else {
            var10000 = this.field3195[var13];
         }

         do {
            while(true) {
               short var17 = var10000;
               if (var17 == 0) {
                  var15 = var16;
                  if (var12 == 0) {
                     this.field3195[var16] = (short)(this.field3191 + 1);
                     class37.field400[var16] = arg3;
                     var10000 = arg5;
                     break;
                  }

                  if (class37.field400[var16] == arg3) {
                     return (short)(var17 + -1);
                  }

                  ++var16;
               } else {
                  if (class37.field400[var16] == arg3) {
                     return (short)(var17 + -1);
                  }

                  ++var16;
               }

               if (var14 <= var16) {
                  this.field3195[var15] = (short)(this.field3191 + 1);
                  class37.field400[var15] = arg3;
                  var10000 = arg5;
                  if (var12 == 0) {
                     if (arg5 != 0) {
                        this.method327();
                     }

                     this.field3267[this.field3191] = (short)arg8;
                     this.field3299[this.field3191] = (short)arg7;
                     this.field3189[this.field3191] = (short)arg2;
                     this.field3289[this.field3191] = (byte)arg1;
                     this.field3237[this.field3191] = arg6;
                     this.field3184[this.field3191] = arg9;
                     return (short)(this.field3191++);
                  }
               } else {
                  var10000 = this.field3195[var16];
               }
            }
         } while(var12 != 0);

         if (arg5 != 0) {
            this.method327();
         }

         this.field3267[this.field3191] = (short)arg8;
         this.field3299[this.field3191] = (short)arg7;
         this.field3189[this.field3191] = (short)arg2;
         this.field3289[this.field3191] = (byte)arg1;
         this.field3237[this.field3191] = arg6;
         this.field3184[this.field3191] = arg9;
         return (short)(this.field3191++);
      } catch (RuntimeException var19) {
         throw class670.method4877(var19, field3307[26] + (arg0 != null ? field3307[0] : field3307[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "ia",
      descriptor = "(SS)V",
      line = 2942
   )
   public final void method320(short arg0, short arg1) {
      int var3 = client.field4530;

      try {
         ++field3263;
         int var4 = 0;
         if (var3 != 0) {
            if (this.field3183[var4] == arg0) {
               this.field3183[var4] = arg1;
            }

            ++var4;
         }

         while(true) {
            class247 var10000;
            if (~var4 <= ~this.field3201) {
               var10000 = this;
               if (var3 == 0) {
                  if (this.field3265 != null) {
                     int var5 = 0;
                     if (var3 != 0 || ~var5 > ~this.field3286) {
                        do {
                           class277 var6 = this.field3265[var5];
                           class613 var7 = this.field3303[var5];
                           var7.field8972 = class628.field9131[65535 & this.field3183[var6.field3858]] & 16777215 | var7.field8972 & -16777216;
                           ++var5;
                        } while(~var5 > ~this.field3286);
                     }
                  }

                  if (this.field3281 != null) {
                     this.field3281.field5840 = null;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = this;
            }

            if (var10000.field3183[var4] == arg0) {
               this.field3183[var4] = arg1;
            }

            ++var4;
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field3307[45] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(Lka;IIIZ)V",
      line = 2987
   )
   public final void method341(class497 param1, int param2, int param3, int param4, boolean param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lf",
      name = "da",
      descriptor = "()I",
      line = 3260
   )
   public final int method311() {
      try {
         ++field3197;
         return this.field3188;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3307[8] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "FA",
      descriptor = "(I)V",
      line = 3268
   )
   public final void method340(int arg0) {
      int var2 = client.field4530;

      try {
         ++field3235;
         int var3 = class689.field10389[arg0];
         int var4 = class689.field10391[arg0];
         int var5 = 0;
         class247 var10000;
         if (var2 != 0) {
            var10000 = this;
         } else if (~this.field3273 >= ~var5) {
            var10000 = this;
            if (var2 == 0) {
               if (this.field3277 != null) {
                  this.field3277.field5840 = null;
               }

               this.field3222 = false;
               return;
            }
         } else {
            var10000 = this;
         }

         while(true) {
            int var6 = var10000.field3218[var5] * var4 + -(this.field3272[var5] * var3) >> 14;
            this.field3272[var5] = this.field3272[var5] * var4 + this.field3218[var5] * var3 >> 14;
            this.field3218[var5] = var6;
            ++var5;
            if (~this.field3273 >= ~var5) {
               var10000 = this;
               if (var2 == 0) {
                  if (this.field3277 != null) {
                     this.field3277.field5840 = null;
                  }

                  this.field3222 = false;
                  return;
               }
            } else {
               var10000 = this;
            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field3307[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(Lgf;B)V",
      line = 3303
   )
   private final void method1853(class290 param1, byte param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lf",
      name = "c",
      descriptor = "(I)V",
      line = 3392
   )
   public static void method1854(int arg0) {
      try {
         field3221 = null;
         field3301 = null;
         if (arg0 != -25263) {
            field3251 = -39;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3307[44] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(IIIILgq;IZ)Z",
      line = 3409
   )
   private final boolean method1855(int arg0, int arg1, int arg2, int arg3, class540 arg4, int arg5, boolean arg6) {
      int var8 = client.field4530;

      try {
         ++field3193;
         class218 var9 = (class218)arg4;
         class218 var10 = this.field3284.field9926;
         float var11 = var9.field2750 * var10.field2758 + var9.field2773 * var10.field2756 + var9.field2761 * var10.field2762 + var10.field2761;
         float var12 = var9.field2750 * var10.field2763 + var9.field2773 * var10.field2769 + var9.field2761 * var10.field2754 + var10.field2773;
         class263.field3600 = var9.field2749 * var10.field2746 + var9.field2762 * var10.field2749 + var9.field2754 * var10.field2748;
         class289.field4056 = var9.field2746 * var10.field2758 + var9.field2763 * var10.field2756 + var9.field2758 * var10.field2762;
         class743.field11020 = var9.field2749 * var10.field2763 + var9.field2762 * var10.field2754 + var9.field2754 * var10.field2769;
         float var13 = var9.field2750 * var10.field2746 + var9.field2773 * var10.field2748 + var9.field2761 * var10.field2749 + var10.field2750;
         class164.field2058 = var9.field2748 * var10.field2746 + var9.field2769 * var10.field2748 + var9.field2756 * var10.field2749;
         class323.field4599 = var9.field2748 * var10.field2763 + var9.field2769 * var10.field2769 + var9.field2756 * var10.field2754;
         class536.field7844 = var9.field2748 * var10.field2758 + var9.field2769 * var10.field2756 + var9.field2756 * var10.field2762;
         class612.field8963 = var9.field2746 * var10.field2763 + var9.field2763 * var10.field2769 + var9.field2758 * var10.field2754;
         class639.field9301 = var9.field2746 * var10.field2746 + var9.field2763 * var10.field2748 + var9.field2758 * var10.field2749;
         class405.field6204 = var9.field2749 * var10.field2758 + var9.field2762 * var10.field2762 + var9.field2754 * var10.field2756;
         byte var14 = 0;
         float var15 = Float.MAX_VALUE;
         float var16 = -3.4028235E38F;
         float var17 = Float.MAX_VALUE;
         float var18 = -3.4028235E38F;
         int var19 = this.field3284.field9945;
         int var20 = this.field3284.field10024;
         if (!this.field3222) {
            this.method1859(-1);
         }

         int var21 = -this.field3234 + this.field3275 >> 1;
         int var22 = -this.field3256 + this.field3190 >> 1;
         int var23 = -this.field3255 + this.field3295 >> 1;
         int var24 = this.field3234 + var21;
         int var25 = this.field3256 + var22;
         int var26 = this.field3255 + var23;
         int var27 = -(var21 << arg0) + var24;
         int var28 = -(var22 << arg0) + var25;
         int var29 = -(var23 << arg0) + var26;
         int var30 = (var21 << arg0) + var24;
         int var31 = var25 - -(var22 << arg0);
         class743.field11023[0] = var27;
         int var32 = (var23 << arg0) + var26;
         class351.field5345[0] = var28;
         class466.field6991[0] = var29;
         class743.field11023[1] = var30;
         class351.field5345[1] = var28;
         class466.field6991[1] = var29;
         class743.field11023[2] = var27;
         class351.field5345[2] = var31;
         class466.field6991[2] = var29;
         class743.field11023[3] = var30;
         class351.field5345[3] = var31;
         class466.field6991[3] = var29;
         class743.field11023[4] = var27;
         class351.field5345[4] = var28;
         class743.field11023[arg3] = var30;
         class466.field6991[4] = var32;
         class351.field5345[5] = var28;
         class466.field6991[5] = var32;
         class743.field11023[6] = var27;
         class351.field5345[6] = var31;
         class466.field6991[6] = var32;
         class743.field11023[7] = var30;
         class351.field5345[7] = var31;
         class466.field6991[7] = var32;
         int var33 = 0;
         float var34;
         float var35;
         float var36;
         float var37;
         float var38;
         float var39;
         float var40;
         float var41;
         if (var8 != 0) {
            var34 = (float)class466.field6991[var33];
            var35 = (float)class351.field5345[var33];
            var36 = (float)class743.field11023[var33];
            var37 = class612.field8963 * var34 + class743.field11020 * var36 + class323.field4599 * var35 + var12;
            var38 = class289.field4056 * var34 + class536.field7844 * var35 + class405.field6204 * var36 + var11;
            var39 = class639.field9301 * var34 + class263.field3600 * var36 + class164.field2058 * var35 + var13;
            if ((float)this.field3284.field9963 <= var39) {
               if (~arg5 < -1) {
                  var39 = (float)arg5;
               }

               var40 = (float)var19 * var38 / var39 + (float)this.field3284.field10003;
               if (var40 > var16) {
                  var16 = var40;
               }

               if (var40 < var15) {
                  var15 = var40;
               }

               var41 = (float)var20 * var37 / var39 + (float)this.field3284.field9940;
               var14 = 1;
               if (var17 > var41) {
                  var17 = var41;
               }

               if (var18 < var41) {
                  var18 = var41;
               }
            }

            ++var33;
         }

         while(true) {
            int var10000;
            if (var33 >= 8) {
               var10000 = var14;
               if (var8 == 0) {
                  if (var14 != 0 && (float)arg2 > var15 && var16 > (float)arg2 && (float)arg1 > var17 && (float)arg1 < var18) {
                     if (arg6) {
                        return true;
                     }

                     if (~this.field3191 < ~this.field3284.field10050.length) {
                        this.field3284.field10048 = new int[this.field3191];
                        this.field3284.field10050 = new int[this.field3191];
                     }

                     int[] var42;
                     int[] var43;
                     label178: {
                        var42 = this.field3284.field10050;
                        var43 = this.field3284.field10048;
                        int var44 = 0;
                        if (var8 != 0) {
                           var10000 = this.field3218[var44];
                        } else if (this.field3273 <= var44) {
                           var10000 = 0;
                           if (var8 == 0) {
                              break label178;
                           }
                        } else {
                           var10000 = this.field3218[var44];
                        }

                        while(true) {
                           label243: {
                              float var45 = (float)var10000;
                              float var46 = (float)this.field3272[var44];
                              float var47 = (float)this.field3305[var44];
                              float var48 = class289.field4056 * var46 + class536.field7844 * var45 + class405.field6204 * var47 + var11;
                              float var49 = class639.field9301 * var46 + class263.field3600 * var47 + class164.field2058 * var45 + var13;
                              float var50 = class612.field8963 * var46 + class743.field11020 * var47 + class323.field4599 * var45 + var12;
                              if (!(var49 >= (float)this.field3284.field9963)) {
                                 int var51 = this.field3187[var44];
                                 int var52 = this.field3187[var44 + 1];
                                 int var53 = var51;
                                 if (var8 != 0 || ~var52 < ~var51) {
                                    do {
                                       int var54 = this.field3195[var53] + -1;
                                       if (~var54 == 0) {
                                          break;
                                       }

                                       var42[this.field3195[var53] + -1] = -999999;
                                       ++var53;
                                    } while(~var52 < ~var53);
                                 }

                                 if (var8 == 0) {
                                    ++var44;
                                    break label243;
                                 }

                                 if (~arg5 < -1) {
                                    var49 = (float)arg5;
                                 }
                              } else if (~arg5 < -1) {
                                 var49 = (float)arg5;
                              }

                              int var55 = (int)((float)var19 * var48 / var49 + (float)this.field3284.field10003);
                              int var56 = (int)((float)var20 * var50 / var49 + (float)this.field3284.field9940);
                              int var57 = this.field3187[var44];
                              int var58 = this.field3187[var44 + 1];
                              int var59 = var57;
                              if (var8 == 0 && var57 >= var58) {
                                 ++var44;
                              } else {
                                 while(true) {
                                    int var60 = this.field3195[var59] + -1;
                                    if (var60 == -1) {
                                       ++var44;
                                       break;
                                    }

                                    var42[var60] = var55;
                                    var43[var60] = var56;
                                    ++var59;
                                    if (var59 >= var58) {
                                       ++var44;
                                       break;
                                    }
                                 }
                              }
                           }

                           if (this.field3273 <= var44) {
                              var10000 = 0;
                              if (var8 == 0) {
                                 break;
                              }
                           } else {
                              var10000 = this.field3218[var44];
                           }
                        }
                     }

                     int var61 = var10000;
                     if (var8 != 0 || ~var61 > ~this.field3201) {
                        do {
                           if (~var42[this.field3199[var61]] != 999998) {
                              if (var42[this.field3282[var61]] != -999999) {
                                 if (var42[this.field3300[var61]] == -999999 && var8 == 0) {
                                    ++var61;
                                 } else {
                                    if (this.method1860(var43[this.field3282[var61]], var42[this.field3199[var61]], arg2, -111, var42[this.field3282[var61]], var43[this.field3300[var61]], arg1, var43[this.field3199[var61]], var42[this.field3300[var61]])) {
                                       return true;
                                    }

                                    ++var61;
                                 }
                              } else {
                                 ++var61;
                              }
                           } else {
                              ++var61;
                           }
                        } while(~var61 > ~this.field3201);
                     }
                  }

                  return false;
               }
            } else {
               var10000 = class466.field6991[var33];
            }

            var34 = (float)var10000;
            var35 = (float)class351.field5345[var33];
            var36 = (float)class743.field11023[var33];
            var37 = class612.field8963 * var34 + class743.field11020 * var36 + class323.field4599 * var35 + var12;
            var38 = class289.field4056 * var34 + class536.field7844 * var35 + class405.field6204 * var36 + var11;
            var39 = class639.field9301 * var34 + class263.field3600 * var36 + class164.field2058 * var35 + var13;
            if ((float)this.field3284.field9963 <= var39) {
               if (~arg5 < -1) {
                  var39 = (float)arg5;
               }

               var40 = (float)var19 * var38 / var39 + (float)this.field3284.field10003;
               if (var40 > var16) {
                  var16 = var40;
               }

               if (var40 < var15) {
                  var15 = var40;
               }

               var41 = (float)var20 * var37 / var39 + (float)this.field3284.field9940;
               var14 = 1;
               if (var17 > var41) {
                  var17 = var41;
               }

               if (var18 < var41) {
                  var18 = var41;
               }
            }

            ++var33;
         }
      } catch (RuntimeException var63) {
         throw class670.method4877(var63, field3307[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field3307[0] : field3307[1]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(IZ)V",
      line = 3651
   )
   private final void method1856(int arg0, boolean arg1) {
      int var3 = client.field4530;

      try {
         label77: {
            if (this.field3210 * 6 > this.field3284.field10021.field1552.length) {
               this.field3284.field10021 = new class764(this.field3210 * 6 + 600);
               if (var3 == 0) {
                  break label77;
               }
            }

            this.field3284.field10021.field1590 = 0;
         }

         int var4 = -49 % ((arg0 - 10) / 44);
         ++field3287;
         class764 var5 = this.field3284.field10021;
         int var6;
         if (this.field3284.field10006) {
            var6 = 0;
            if (var3 != 0) {
               var5.method1103(this.field3199[var6], -92);
               var5.method1103(this.field3282[var6], -90);
               var5.method1103(this.field3300[var6], -68);
               ++var6;
            }

            while(true) {
               while(this.field3210 > var6) {
                  var5.method1103(this.field3199[var6], -92);
                  var5.method1103(this.field3282[var6], -90);
                  var5.method1103(this.field3300[var6], -68);
                  ++var6;
               }

               if (var3 == 0) {
                  if (var3 != 0) {
                     var6 = 0;
                     if (var3 != 0) {
                        var5.method1080(true, this.field3199[var6]);
                        var5.method1080(true, this.field3282[var6]);
                        var5.method1080(true, this.field3300[var6]);
                        ++var6;
                     }
                  } else {
                     if (var3 == 0) {
                        if (var5.field1590 == 0) {
                           return;
                        }

                        label111: {
                           if (arg1) {
                              label119: {
                                 if (this.field3296 != null) {
                                    this.field3296.method998(var5.field1590, var5.field1552, (byte)-89, 5123);
                                    if (var3 == 0) {
                                       break label119;
                                    }
                                 }

                                 this.field3296 = this.field3284.method4824(true, var5.field1590, 5123, var5.field1552, (byte)-19);
                              }

                              this.field3214.field1256 = this.field3296;
                              if (var3 == 0) {
                                 break label111;
                              }
                           }

                           this.field3214.field1256 = this.field3284.method4824(false, var5.field1590, 5123, var5.field1552, (byte)-60);
                        }

                        if (!arg1) {
                           this.field3270 = true;
                           return;
                        }

                        return;
                     }

                     var5.method1080(true, this.field3300[var6]);
                     ++var6;
                  }
                  break;
               }

               ++var6;
            }
         } else {
            var6 = 0;
            if (var3 != 0) {
               var5.method1080(true, this.field3199[var6]);
               var5.method1080(true, this.field3282[var6]);
               var5.method1080(true, this.field3300[var6]);
               ++var6;
            }
         }

         while(true) {
            while(var6 < this.field3210) {
               var5.method1080(true, this.field3199[var6]);
               var5.method1080(true, this.field3282[var6]);
               var5.method1080(true, this.field3300[var6]);
               ++var6;
            }

            if (var3 == 0) {
               if (var5.field1590 == 0) {
                  return;
               }

               label51: {
                  if (arg1) {
                     label48: {
                        if (this.field3296 != null) {
                           this.field3296.method998(var5.field1590, var5.field1552, (byte)-89, 5123);
                           if (var3 == 0) {
                              break label48;
                           }
                        }

                        this.field3296 = this.field3284.method4824(true, var5.field1590, 5123, var5.field1552, (byte)-19);
                     }

                     this.field3214.field1256 = this.field3296;
                     if (var3 == 0) {
                        break label51;
                     }
                  }

                  this.field3214.field1256 = this.field3284.method4824(false, var5.field1590, 5123, var5.field1552, (byte)-60);
               }

               if (!arg1) {
                  this.field3270 = true;
                  return;
               }

               return;
            }

            var5.method1080(true, this.field3300[var6]);
            ++var6;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field3307[25] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "VA",
      descriptor = "(I)V",
      line = 3717
   )
   public final void method310(int arg0) {
      int var2 = client.field4530;

      try {
         ++field3264;
         int var3 = class689.field10389[arg0];
         int var4 = class689.field10391[arg0];
         int var5 = 0;
         if (var2 == 0 && var5 >= this.field3273) {
            this.field3222 = false;
            if (this.field3277 != null) {
               this.field3277.field5840 = null;
            }
         } else {
            do {
               int var6 = this.field3218[var5] * var3 - -(this.field3305[var5] * var4) >> 14;
               this.field3218[var5] = this.field3218[var5] * var4 + -(this.field3305[var5] * var3) >> 14;
               this.field3305[var5] = var6;
               ++var5;
            } while(var5 < this.field3273);

            this.field3222 = false;
            if (this.field3277 != null) {
               this.field3277.field5840 = null;
            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field3307[46] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(Lgq;)V",
      line = 3752
   )
   public final void method312(class540 arg0) {
      int var2 = client.field4530;

      try {
         ++field3196;
         class218 var3 = (class218)arg0;
         if (this.field3292 != null) {
            int var4 = 0;
            if (var2 != 0 || this.field3292.length > var4) {
               do {
                  class299 var5 = this.field3292[var4];
                  class299 var6 = var5;
                  if (var5.field4261 != null) {
                     var6 = var5.field4261;
                  }

                  var6.field4266 = (int)((float)this.field3272[var5.field4278] * var3.field2758 + (float)this.field3305[var5.field4278] * var3.field2762 + (float)this.field3218[var5.field4278] * var3.field2756 + var3.field2761);
                  var6.field4263 = (int)((float)this.field3272[var5.field4278] * var3.field2763 + (float)this.field3305[var5.field4278] * var3.field2754 + (float)this.field3218[var5.field4278] * var3.field2769 + var3.field2773);
                  var6.field4268 = (int)((float)this.field3272[var5.field4278] * var3.field2746 + (float)this.field3305[var5.field4278] * var3.field2749 + (float)this.field3218[var5.field4278] * var3.field2748 + var3.field2750);
                  var6.field4275 = (int)((float)this.field3272[var5.field4264] * var3.field2758 + (float)this.field3305[var5.field4264] * var3.field2762 + (float)this.field3218[var5.field4264] * var3.field2756 + var3.field2761);
                  var6.field4280 = (int)((float)this.field3272[var5.field4264] * var3.field2763 + (float)this.field3305[var5.field4264] * var3.field2754 + (float)this.field3218[var5.field4264] * var3.field2769 + var3.field2773);
                  var6.field4273 = (int)((float)this.field3272[var5.field4264] * var3.field2746 + (float)this.field3305[var5.field4264] * var3.field2749 + (float)this.field3218[var5.field4264] * var3.field2748 + var3.field2750);
                  var6.field4281 = (int)((float)this.field3272[var5.field4265] * var3.field2758 + (float)this.field3305[var5.field4265] * var3.field2762 + (float)this.field3218[var5.field4265] * var3.field2756 + var3.field2761);
                  var6.field4271 = (int)((float)this.field3272[var5.field4265] * var3.field2763 + (float)this.field3305[var5.field4265] * var3.field2754 + (float)this.field3218[var5.field4265] * var3.field2769 + var3.field2773);
                  var6.field4262 = (int)((float)this.field3272[var5.field4265] * var3.field2746 + (float)this.field3305[var5.field4265] * var3.field2749 + (float)this.field3218[var5.field4265] * var3.field2748 + var3.field2750);
                  ++var4;
               } while(this.field3292.length > var4);
            }
         }

         if (this.field3306 != null) {
            int var7 = 0;
            if (var2 != 0 || this.field3306.length > var7) {
               do {
                  class57 var8 = this.field3306[var7];
                  class57 var9 = var8;
                  if (var8.field719 != null) {
                     var9 = var8.field719;
                  }

                  if (var8.field724 == null) {
                     var8.field724 = var3.method1520();
                     if (var2 != 0) {
                        var8.field724.method1513(var3);
                     }
                  } else {
                     var8.field724.method1513(var3);
                  }

                  var9.field725 = (int)((float)this.field3272[var8.field718] * var3.field2758 + (float)this.field3305[var8.field718] * var3.field2762 + (float)this.field3218[var8.field718] * var3.field2756 + var3.field2761);
                  var9.field715 = (int)((float)this.field3272[var8.field718] * var3.field2763 + (float)this.field3305[var8.field718] * var3.field2754 + (float)this.field3218[var8.field718] * var3.field2769 + var3.field2773);
                  var9.field720 = (int)((float)this.field3272[var8.field718] * var3.field2746 + (float)this.field3305[var8.field718] * var3.field2749 + (float)this.field3218[var8.field718] * var3.field2748 + var3.field2750);
                  ++var7;
               } while(this.field3306.length > var7);

            }
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field3307[53] + (arg0 != null ? field3307[0] : field3307[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(BZ)V",
      line = 3818
   )
   private final void method1857(byte arg0, boolean arg1) {
      int var3 = client.field4530;

      try {
         int var4 = -90 % ((-43 - arg0) / 45);
         ++field3228;
         boolean var5 = this.field3281 != null && this.field3281.field5840 == null;
         boolean var6 = this.field3291 != null && this.field3291.field5840 == null;
         boolean var7 = this.field3277 != null && this.field3277.field5840 == null;
         boolean var8 = this.field3293 != null && this.field3293.field5840 == null;
         if (arg1) {
            var5 &= ~(this.field3224 & 2) != -1;
            var8 &= (this.field3224 & 8) != 0;
            var7 &= ~(1 & this.field3224) != -1;
            var6 &= (4 & this.field3224) != 0;
         }

         byte var9 = 0;
         byte var10 = 0;
         byte var11 = 0;
         byte var12 = 0;
         if (var7) {
            var10 = var9;
            var9 = (byte)(var9 + 12);
         }

         byte var13 = 0;
         if (var5) {
            var11 = var9;
            var9 = (byte)(var9 + 4);
         }

         if (var6) {
            var12 = var9;
            var9 = (byte)(var9 + 12);
         }

         if (var8) {
            var13 = var9;
            var9 = (byte)(var9 + 8);
         }

         if (var9 != 0) {
            label476: {
               if (~this.field3284.field10021.field1552.length <= ~(this.field3191 * var9)) {
                  this.field3284.field10021.field1590 = 0;
                  if (var3 == 0) {
                     break label476;
                  }
               }

               this.field3284.field10021 = new class764((this.field3191 + 100) * var9);
            }

            class764 var14 = this.field3284.field10021;
            if (var7) {
               label511: {
                  if (!this.field3284.field10006) {
                     int var15 = 0;
                     if (var3 != 0 || ~var15 > ~this.field3273) {
                        label466:
                        do {
                           int var16 = Stream.floatToRawIntBits((float)this.field3305[var15]);
                           int var17 = Stream.floatToRawIntBits((float)this.field3218[var15]);
                           int var18 = Stream.floatToRawIntBits((float)this.field3272[var15]);
                           int var19 = this.field3187[var15];
                           int var20 = this.field3187[var15 + 1];
                           int var21 = var19;
                           if (var3 == 0 && ~var19 <= ~var20) {
                              ++var15;
                           } else {
                              do {
                                 int var22 = this.field3195[var21] + -1;
                                 if (var22 == -1) {
                                    ++var15;
                                    continue label466;
                                 }

                                 var14.field1590 = var9 * var22;
                                 var14.method1064((byte)70, var16);
                                 var14.method1064((byte)70, var17);
                                 var14.method1064((byte)70, var18);
                                 ++var21;
                              } while(~var21 > ~var20);

                              ++var15;
                           }
                        } while(~var15 > ~this.field3273);
                     }

                     if (var3 == 0) {
                        break label511;
                     }
                  }

                  int var23 = 0;
                  if (var3 != 0 || ~var23 > ~this.field3273) {
                     label440:
                     do {
                        int var24 = Stream.floatToRawIntBits((float)this.field3305[var23]);
                        int var25 = Stream.floatToRawIntBits((float)this.field3218[var23]);
                        int var26 = Stream.floatToRawIntBits((float)this.field3272[var23]);
                        int var27 = this.field3187[var23];
                        int var28 = this.field3187[var23 + 1];
                        int var29 = var27;
                        if (var3 == 0 && var27 >= var28) {
                           ++var23;
                        } else {
                           do {
                              int var30 = this.field3195[var29] - 1;
                              if (~var30 == 0) {
                                 ++var23;
                                 continue label440;
                              }

                              var14.field1590 = var9 * var30;
                              var14.method1094(-115, var24);
                              var14.method1094(-51, var25);
                              var14.method1094(-119, var26);
                              ++var29;
                           } while(var29 < var28);

                           ++var23;
                        }
                     } while(~var23 > ~this.field3273);
                  }
               }
            }

            if (var5) {
               label514: {
                  if (this.field3291 == null) {
                     short[] var31;
                     short[] var32;
                     short[] var33;
                     byte[] var34;
                     label412: {
                        if (this.field3217 != null) {
                           var31 = this.field3217.field5666;
                           var32 = this.field3217.field5665;
                           var33 = this.field3217.field5664;
                           var34 = this.field3217.field5667;
                           if (var3 == 0) {
                              break label412;
                           }
                        }

                        var32 = this.field3189;
                        var34 = this.field3289;
                        var31 = this.field3267;
                        var33 = this.field3299;
                     }

                     float var35 = this.field3284.field9987[0];
                     float var36 = this.field3284.field9987[1];
                     float var37 = this.field3284.field9987[2];
                     float var38 = this.field3284.field10009;
                     float var39 = this.field3284.field9985 * 768.0F / (float)this.field3188;
                     float var40 = this.field3284.field9948 * 768.0F / (float)this.field3188;
                     int var41 = 0;
                     if (var3 != 0 || this.field3201 > var41) {
                        do {
                           short var43;
                           float var44;
                           float var45;
                           float var46;
                           float var48;
                           label361: {
                              int var42 = this.method1847(-48, this.field3183[var41], this.field3259, this.field3247[var41], this.field3274[var41]);
                              var43 = this.field3199[var41];
                              var44 = (float)(var42 >>> 24) * this.field3284.field9978;
                              var45 = (float)((16728478 & var42) >> 16) * this.field3284.field10017;
                              var46 = (float)((var42 & 65454) >> 8) * this.field3284.field9955;
                              short var47 = (short)var34[var43];
                              if (~var47 != -1) {
                                 var48 = ((float)var32[var43] * var37 + (float)var31[var43] * var35 + (float)var33[var43] * var36) / (float)(var47 * 256);
                                 if (var3 == 0) {
                                    break label361;
                                 }
                              }

                              var48 = ((float)var32[var43] * var37 + (float)var31[var43] * var35 + (float)var33[var43] * var36) * 0.0026041667F;
                           }

                           float var49 = var38 + (var48 < 0.0F ? var40 : var39) * var48;
                           int var50 = (int)(var44 * var49);
                           int var51 = (int)(var45 * var49);
                           if (~var50 <= -1) {
                              if (var50 > 255) {
                                 var50 = 255;
                                 if (var3 != 0) {
                                    var50 = 0;
                                 }
                              }
                           } else {
                              var50 = 0;
                           }

                           if (~var51 <= -1) {
                              if (~var51 < -256) {
                                 var51 = 255;
                                 if (var3 != 0) {
                                    var51 = 0;
                                 }
                              }
                           } else {
                              var51 = 0;
                           }

                           int var52;
                           label366: {
                              var52 = (int)(var46 * var49);
                              var14.field1590 = var11 - -(var9 * var43);
                              if (var52 < 0) {
                                 var52 = 0;
                                 if (var3 == 0) {
                                    break label366;
                                 }
                              }

                              if (~var52 < -256) {
                                 var52 = 255;
                              }
                           }

                           short var53;
                           float var55;
                           label371: {
                              var14.method1085(var50, (byte)-11);
                              var14.method1085(var51, (byte)-11);
                              var14.method1085(var52, (byte)-11);
                              var14.method1085(255 - (this.field3247[var41] & 255), (byte)-11);
                              var53 = this.field3282[var41];
                              short var54 = (short)var34[var53];
                              if (~var54 != -1) {
                                 var55 = ((float)var32[var53] * var37 + (float)var31[var53] * var35 + (float)var33[var53] * var36) / (float)(var54 * 256);
                                 if (var3 == 0) {
                                    break label371;
                                 }
                              }

                              var55 = ((float)var32[var53] * var37 + (float)var31[var53] * var35 + (float)var33[var53] * var36) * 0.0026041667F;
                           }

                           float var56 = (var55 < 0.0F ? var40 : var39) * var55 + var38;
                           int var57 = (int)(var44 * var56);
                           if (~var57 <= -1) {
                              if (~var57 < -256) {
                                 var57 = 255;
                                 if (var3 != 0) {
                                    var57 = 0;
                                 }
                              }
                           } else {
                              var57 = 0;
                           }

                           int var58;
                           int var59;
                           label377: {
                              var58 = (int)(var45 * var56);
                              var59 = (int)(var46 * var56);
                              if (var58 < 0) {
                                 var58 = 0;
                                 if (var3 == 0) {
                                    break label377;
                                 }
                              }

                              if (var58 > 255) {
                                 var58 = 255;
                              }
                           }

                           label382: {
                              var14.field1590 = var9 * var53 + var11;
                              if (~var59 > -1) {
                                 var59 = 0;
                                 if (var3 == 0) {
                                    break label382;
                                 }
                              }

                              if (var59 > 255) {
                                 var59 = 255;
                              }
                           }

                           short var60;
                           float var62;
                           label387: {
                              var14.method1085(var57, (byte)-11);
                              var14.method1085(var58, (byte)-11);
                              var14.method1085(var59, (byte)-11);
                              var14.method1085(-(255 & this.field3247[var41]) + 255, (byte)-11);
                              var60 = this.field3300[var41];
                              short var61 = (short)var34[var60];
                              if (~var61 != -1) {
                                 var62 = ((float)var32[var60] * var37 + (float)var31[var60] * var35 + (float)var33[var60] * var36) / (float)(var61 * 256);
                                 if (var3 == 0) {
                                    break label387;
                                 }
                              }

                              var62 = ((float)var32[var60] * var37 + (float)var31[var60] * var35 + (float)var33[var60] * var36) * 0.0026041667F;
                           }

                           float var63;
                           int var64;
                           int var65;
                           label393: {
                              var63 = var38 + (var62 < 0.0F ? var40 : var39) * var62;
                              var64 = (int)(var44 * var63);
                              var65 = (int)(var45 * var63);
                              if (var64 < 0) {
                                 var64 = 0;
                                 if (var3 == 0) {
                                    break label393;
                                 }
                              }

                              if (~var64 < -256) {
                                 var64 = 255;
                              }
                           }

                           label398: {
                              if (var65 < 0) {
                                 var65 = 0;
                                 if (var3 == 0) {
                                    break label398;
                                 }
                              }

                              if (~var65 < -256) {
                                 var65 = 255;
                              }
                           }

                           int var66;
                           label403: {
                              var66 = (int)(var46 * var63);
                              var14.field1590 = var11 - -(var9 * var60);
                              if (var66 < 0) {
                                 var66 = 0;
                                 if (var3 == 0) {
                                    break label403;
                                 }
                              }

                              if (~var66 < -256) {
                                 var66 = 255;
                              }
                           }

                           var14.method1085(var64, (byte)-11);
                           var14.method1085(var65, (byte)-11);
                           var14.method1085(var66, (byte)-11);
                           var14.method1085(-(this.field3247[var41] & 255) + 255, (byte)-11);
                           ++var41;
                        } while(this.field3201 > var41);
                     }

                     if (var3 == 0) {
                        break label514;
                     }
                  }

                  int var67 = 0;
                  if (var3 != 0 || this.field3201 > var67) {
                     do {
                        int var68 = this.method1847(115, this.field3183[var67], this.field3259, this.field3247[var67], this.field3274[var67]);
                        var14.field1590 = this.field3199[var67] * var9 + var11;
                        var14.method1094(-100, var68);
                        var14.field1590 = this.field3282[var67] * var9 + var11;
                        var14.method1094(-49, var68);
                        var14.field1590 = this.field3300[var67] * var9 + var11;
                        var14.method1094(-107, var68);
                        ++var67;
                     } while(this.field3201 > var67);
                  }
               }
            }

            if (var6) {
               label517: {
                  short[] var69;
                  byte[] var70;
                  short[] var71;
                  short[] var72;
                  label318: {
                     if (this.field3217 == null) {
                        var69 = this.field3267;
                        var70 = this.field3289;
                        var71 = this.field3299;
                        var72 = this.field3189;
                        if (var3 == 0) {
                           break label318;
                        }
                     }

                     var70 = this.field3217.field5667;
                     var71 = this.field3217.field5664;
                     var69 = this.field3217.field5666;
                     var72 = this.field3217.field5665;
                  }

                  float var73 = 3.0F / (float)this.field3188;
                  float var74 = 3.0F / (float)(this.field3188 / 2 + this.field3188);
                  var14.field1590 = var12;
                  if (this.field3284.field10006) {
                     int var75 = 0;
                     if (var3 != 0 || ~this.field3191 < ~var75) {
                        do {
                           label308: {
                              int var76 = 255 & var70[var75];
                              if (var76 != 0) {
                                 float var77 = var73 / (float)var76;
                                 var14.method5537((float)var69[var75] * var77, (byte)-48);
                                 var14.method5537((float)var71[var75] * var77, (byte)-48);
                                 var14.method5537((float)var72[var75] * var77, (byte)-48);
                                 if (var3 == 0) {
                                    break label308;
                                 }
                              }

                              var14.method5537((float)var69[var75] * var74, (byte)-48);
                              var14.method5537((float)var71[var75] * var74, (byte)-48);
                              var14.method5537((float)var72[var75] * var74, (byte)-48);
                           }

                           var14.field1590 += var9 + -12;
                           ++var75;
                        } while(~this.field3191 < ~var75);
                     }

                     if (var3 == 0) {
                        break label517;
                     }
                  }

                  int var78 = 0;
                  if (var3 != 0 || ~var78 > ~this.field3191) {
                     do {
                        label292: {
                           int var79 = 255 & var70[var78];
                           if (~var79 != -1) {
                              float var80 = var73 / (float)var79;
                              var14.method5536((float)var69[var78] * var80, true);
                              var14.method5536((float)var71[var78] * var80, true);
                              var14.method5536((float)var72[var78] * var80, true);
                              if (var3 == 0) {
                                 break label292;
                              }
                           }

                           var14.method5536((float)var69[var78] * var74, true);
                           var14.method5536((float)var71[var78] * var74, true);
                           var14.method5536((float)var72[var78] * var74, true);
                        }

                        var14.field1590 += var9 + -12;
                        ++var78;
                     } while(~var78 > ~this.field3191);
                  }
               }
            }

            if (var8) {
               label520: {
                  var14.field1590 = var13;
                  if (this.field3284.field10006) {
                     int var81 = 0;
                     if (var3 != 0) {
                        var14.method5537(this.field3237[var81], (byte)-48);
                        var14.method5537(this.field3184[var81], (byte)-48);
                        var14.field1590 += var9 + -8;
                        ++var81;
                     }

                     while(true) {
                        while(~var81 > ~this.field3191) {
                           var14.method5537(this.field3237[var81], (byte)-48);
                           var14.method5537(this.field3184[var81], (byte)-48);
                           var14.field1590 += var9 + -8;
                           ++var81;
                        }

                        if (var3 == 0) {
                           if (var3 == 0) {
                              break label520;
                           }
                           break;
                        }

                        ++var81;
                     }
                  }

                  int var82 = 0;
                  if (var3 != 0 || var82 < this.field3191) {
                     do {
                        var14.method5536(this.field3237[var82], true);
                        var14.method5536(this.field3184[var82], true);
                        var14.field1590 += var9 + -8;
                        ++var82;
                     } while(var82 < this.field3191);
                  }
               }
            }

            class390 var83;
            label245: {
               var14.field1590 = this.field3191 * var9;
               if (arg1) {
                  label242: {
                     if (this.field3302 == null) {
                        this.field3302 = this.field3284.method4808(var9, (byte)96, var14.field1590, true, var14.field1552);
                        if (var3 == 0) {
                           break label242;
                        }
                     }

                     this.field3302.method2823(94, var9, var14.field1552, var14.field1590);
                  }

                  this.field3224 = 0;
                  var83 = this.field3302;
                  if (var3 == 0) {
                     break label245;
                  }
               }

               var83 = this.field3284.method4808(var9, (byte)-114, var14.field1590, false, var14.field1552);
               this.field3270 = true;
            }

            if (var7) {
               this.field3277.field5844 = var10;
               this.field3277.field5840 = var83;
            }

            if (var8) {
               this.field3293.field5840 = var83;
               this.field3293.field5844 = var13;
            }

            if (var5) {
               this.field3281.field5840 = var83;
               this.field3281.field5844 = var11;
            }

            if (var6) {
               this.field3291.field5840 = var83;
               this.field3291.field5844 = var12;
            }
         }
      } catch (RuntimeException var85) {
         throw class670.method4877(var85, field3307[61] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "F",
      descriptor = "()Z",
      line = 4338
   )
   public final boolean method295() {
      try {
         ++field3186;
         return this.field3212;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3307[43] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "d",
      descriptor = "()Z",
      line = 4346
   )
   public final boolean method298() {
      int var1 = client.field4530;

      try {
         ++field3230;
         if (this.field3274 == null) {
            return true;
         } else {
            int var2 = 0;
            short var10000;
            if (var1 != 0) {
               var10000 = this.field3274[var2];
            } else if (this.field3274.length <= var2) {
               var10000 = 1;
               if (var1 == 0) {
                  return true;
               }
            } else {
               var10000 = this.field3274[var2];
            }

            while(var10000 == -1 || this.field3284.field813.method1165(this.field3274[var2], -23239)) {
               ++var2;
               if (this.field3274.length <= var2) {
                  var10000 = 1;
                  if (var1 == 0) {
                     return true;
                  }
               } else {
                  var10000 = this.field3274[var2];
               }
            }

            return false;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field3307[50] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(I[IIIIIZ)V",
      line = 4369
   )
   public final void method309(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      int var8 = client.field4530;

      try {
         ++field3203;
         int var9 = arg1.length;
         int var10000;
         int var110;
         int var111;
         int var112;
         if (arg0 != 0) {
            if (arg0 != 1) {
               if (~arg0 != -3) {
                  if (~arg0 != -4) {
                     if (arg0 == 5) {
                        if (this.field3242 != null) {
                           int var69 = 0;
                           if (var8 != 0 || ~var9 < ~var69) {
                              do {
                                 int var70 = arg1[var69];
                                 if (var70 >= this.field3242.length) {
                                    ++var69;
                                 } else {
                                    int[] var71 = this.field3242[var70];
                                    int var72 = 0;
                                    if (var8 != 0) {
                                       var10000 = var71[var72];
                                    } else if (~var72 <= ~var71.length) {
                                       var10000 = var71.length;
                                       if (var8 == 0) {
                                          if (var10000 > 0 && this.field3281 != null) {
                                             this.field3281.field5840 = null;
                                          }

                                          ++var69;
                                          continue;
                                       }
                                    } else {
                                       var10000 = var71[var72];
                                    }

                                    while(true) {
                                       int var73 = var10000;
                                       int var74 = (this.field3247[var73] & 255) + arg2 * 8;
                                       if (~var74 <= -1) {
                                          if (var74 > 255) {
                                             var74 = 255;
                                             if (var8 != 0) {
                                                var74 = 0;
                                             }
                                          }
                                       } else {
                                          var74 = 0;
                                       }

                                       this.field3247[var73] = (byte)var74;
                                       ++var72;
                                       if (~var72 <= ~var71.length) {
                                          var10000 = var71.length;
                                          if (var8 == 0) {
                                             if (var10000 > 0 && this.field3281 != null) {
                                                this.field3281.field5840 = null;
                                             }

                                             ++var69;
                                             break;
                                          }
                                       } else {
                                          var10000 = var71[var72];
                                       }
                                    }
                                 }
                              } while(~var9 < ~var69);
                           }

                           if (this.field3265 != null) {
                              int var75 = 0;
                              if (var8 != 0 || ~var75 > ~this.field3286) {
                                 do {
                                    class277 var76 = this.field3265[var75];
                                    class613 var77 = this.field3303[var75];
                                    var77.field8972 = var77.field8972 & 16777215 | 255 - (this.field3247[var76.field3858] & 255) << 24;
                                    ++var75;
                                 } while(~var75 > ~this.field3286);
                              }
                           }
                        }

                     } else if (arg0 == 7) {
                        if (this.field3242 != null) {
                           int var78 = 0;
                           if (var8 != 0 || var78 < var9) {
                              do {
                                 int var79 = arg1[var78];
                                 if (~this.field3242.length >= ~var79) {
                                    ++var78;
                                 } else {
                                    int[] var80 = this.field3242[var79];
                                    int var81 = 0;
                                    if (var8 != 0) {
                                       var10000 = var80[var81];
                                    } else if (~var80.length >= ~var81) {
                                       var10000 = var80.length;
                                       if (var8 == 0) {
                                          if (var10000 > 0 && this.field3281 != null) {
                                             this.field3281.field5840 = null;
                                          }

                                          ++var78;
                                          continue;
                                       }
                                    } else {
                                       var10000 = var80[var81];
                                    }

                                    while(true) {
                                       int var82 = var10000;
                                       int var83 = 65535 & this.field3183[var82];
                                       int var84 = (65151 & var83) >> 10;
                                       int var85 = (943 & var83) >> 7;
                                       int var86 = 127 & var83;
                                       int var87 = arg3 / 4 + var85;
                                       int var88 = 63 & arg2 + var84;
                                       if (~var87 <= -1) {
                                          if (~var87 < -8) {
                                             var87 = 7;
                                             if (var8 != 0) {
                                                var87 = 0;
                                             }
                                          }
                                       } else {
                                          var87 = 0;
                                       }

                                       int var89 = arg4 + var86;
                                       if (var89 < 0) {
                                          var89 = 0;
                                          if (var8 != 0 && ~var89 < -128) {
                                             var89 = 127;
                                          }
                                       } else if (~var89 < -128) {
                                          var89 = 127;
                                       }

                                       this.field3183[var82] = (short)class379.method2928(var89, class379.method2928(var88 << 10, var87 << 7));
                                       ++var81;
                                       if (~var80.length >= ~var81) {
                                          var10000 = var80.length;
                                          if (var8 == 0) {
                                             if (var10000 > 0 && this.field3281 != null) {
                                                this.field3281.field5840 = null;
                                             }

                                             ++var78;
                                             break;
                                          }
                                       } else {
                                          var10000 = var80[var81];
                                       }
                                    }
                                 }
                              } while(var78 < var9);
                           }

                           if (this.field3265 != null) {
                              int var90 = 0;
                              if (var8 != 0 || ~this.field3286 < ~var90) {
                                 do {
                                    class277 var91 = this.field3265[var90];
                                    class613 var92 = this.field3303[var90];
                                    var92.field8972 = class628.field9131[this.field3183[var91.field3858] & 65535] & 16777215 | var92.field8972 & -16777216;
                                    ++var90;
                                 } while(~this.field3286 < ~var90);
                              }
                           }
                        }

                     } else if (~arg0 == -9) {
                        if (this.field3192 != null) {
                           int var93 = 0;
                           if (var8 != 0 || ~var93 > ~var9) {
                              do {
                                 int var94 = arg1[var93];
                                 if (~this.field3192.length >= ~var94) {
                                    ++var93;
                                 } else {
                                    int[] var95 = this.field3192[var94];
                                    int var96 = 0;
                                    if (var8 == 0 && var95.length <= var96) {
                                       ++var93;
                                    } else {
                                       do {
                                          class613 var97 = this.field3303[var95[var96]];
                                          var97.field8964 += arg2;
                                          var97.field8968 += arg3;
                                          ++var96;
                                       } while(var95.length > var96);

                                       ++var93;
                                    }
                                 }
                              } while(~var93 > ~var9);
                           }
                        }

                     } else if (arg0 == 10) {
                        if (this.field3192 != null) {
                           int var98 = 0;
                           if (var8 != 0 || var98 < var9) {
                              do {
                                 int var99 = arg1[var98];
                                 if (var99 >= this.field3192.length) {
                                    ++var98;
                                 } else {
                                    int[] var100 = this.field3192[var99];
                                    int var101 = 0;
                                    if (var8 == 0 && var100.length <= var101) {
                                       ++var98;
                                    } else {
                                       do {
                                          class613 var102 = this.field3303[var100[var101]];
                                          var102.field8967 = var102.field8967 * arg2 >> 7;
                                          var102.field8971 = var102.field8971 * arg3 >> 7;
                                          ++var101;
                                       } while(var100.length > var101);

                                       ++var98;
                                    }
                                 }
                              } while(var98 < var9);
                           }
                        }

                     } else if (~arg0 == -10) {
                        if (this.field3192 != null) {
                           int var103 = 0;
                           if (var8 != 0 || var103 < var9) {
                              do {
                                 int var104 = arg1[var103];
                                 if (~var104 <= ~this.field3192.length) {
                                    ++var103;
                                 } else {
                                    int[] var105 = this.field3192[var104];
                                    int var106 = 0;
                                    if (var8 == 0 && ~var105.length >= ~var106) {
                                       ++var103;
                                    } else {
                                       do {
                                          class613 var107 = this.field3303[var105[var106]];
                                          var107.field8970 = var107.field8970 - -arg2 & 16383;
                                          ++var106;
                                       } while(~var105.length < ~var106);

                                       ++var103;
                                    }
                                 }
                              } while(var103 < var9);
                           }
                        }

                     }
                  } else {
                     int var64 = 0;
                     if (var8 != 0 || ~var64 > ~var9) {
                        do {
                           int var65 = arg1[var64];
                           if (var65 >= this.field3288.length) {
                              ++var64;
                           } else {
                              int[] var66 = this.field3288[var65];
                              int var67 = 0;
                              if (var8 == 0 && ~var67 <= ~var66.length) {
                                 ++var64;
                              } else {
                                 do {
                                    int var68 = var66[var67];
                                    this.field3305[var68] -= class776.field11343;
                                    this.field3218[var68] -= class242.field3079;
                                    this.field3272[var68] -= class117.field1429;
                                    this.field3305[var68] = this.field3305[var68] * arg2 >> 7;
                                    this.field3218[var68] = this.field3218[var68] * arg3 >> 7;
                                    this.field3272[var68] = this.field3272[var68] * arg4 >> 7;
                                    this.field3305[var68] += class776.field11343;
                                    this.field3218[var68] += class242.field3079;
                                    this.field3272[var68] += class117.field1429;
                                    ++var67;
                                 } while(~var67 > ~var66.length);

                                 ++var64;
                              }
                           }
                        } while(~var64 > ~var9);

                     }
                  }
               } else {
                  int var21 = 0;
                  int var46;
                  int var47;
                  int[] var48;
                  int var49;
                  int var50;
                  int var51;
                  int var52;
                  int var53;
                  int var54;
                  int var55;
                  int var56;
                  int var57;
                  int var58;
                  int var59;
                  int var60;
                  int var61;
                  int var62;
                  int var63;
                  if (var8 != 0) {
                     var10000 = arg1[var21];
                  } else if (~var21 <= ~var9) {
                     var10000 = arg6;
                     if (var8 == 0) {
                        if (arg6 != 0) {
                           var46 = 0;
                           if (var8 != 0 || var46 < var9) {
                              do {
                                 var47 = arg1[var46];
                                 if (~this.field3288.length >= ~var47) {
                                    ++var46;
                                 } else {
                                    var48 = this.field3288[var47];
                                    var49 = 0;
                                    if (var8 == 0 && var48.length <= var49) {
                                       ++var46;
                                    } else {
                                       label635:
                                       do {
                                          var50 = var48[var49];
                                          var51 = this.field3187[var50];
                                          var52 = this.field3187[var50 + 1];
                                          var53 = var51;
                                          if (var8 == 0 && var51 >= var52) {
                                             ++var49;
                                          } else {
                                             do {
                                                var54 = this.field3195[var53] - 1;
                                                if (~var54 == 0) {
                                                   ++var49;
                                                   continue label635;
                                                }

                                                if (~arg4 != -1) {
                                                   var55 = class689.field10389[arg4];
                                                   var56 = class689.field10391[arg4];
                                                   var57 = this.field3299[var54] * var55 - -(this.field3267[var54] * var56) - -16383 >> 14;
                                                   this.field3299[var54] = (short)(this.field3299[var54] * var56 + 16383 + -(this.field3267[var54] * var55) >> 14);
                                                   this.field3267[var54] = (short)var57;
                                                }

                                                if (arg2 != 0) {
                                                   var58 = class689.field10389[arg2];
                                                   var59 = class689.field10391[arg2];
                                                   var60 = this.field3299[var54] * var59 + -(this.field3189[var54] * var58) - -16383 >> 14;
                                                   this.field3189[var54] = (short)(this.field3189[var54] * var59 + (this.field3299[var54] * var58 - -16383) >> 14);
                                                   this.field3299[var54] = (short)var60;
                                                }

                                                if (~arg3 != -1) {
                                                   var61 = class689.field10389[arg3];
                                                   var62 = class689.field10391[arg3];
                                                   var63 = this.field3267[var54] * var62 + this.field3189[var54] * var61 + 16383 >> 14;
                                                   this.field3189[var54] = (short)(this.field3189[var54] * var62 + -(this.field3267[var54] * var61) + 16383 >> 14);
                                                   this.field3267[var54] = (short)var63;
                                                }

                                                ++var53;
                                             } while(var53 < var52);

                                             ++var49;
                                          }
                                       } while(var48.length > var49);

                                       ++var46;
                                    }
                                 }
                              } while(var46 < var9);
                           }

                           if (this.field3291 == null && this.field3281 != null) {
                              this.field3281.field5840 = null;
                           }

                           if (this.field3291 != null) {
                              this.field3291.field5840 = null;
                           }
                        }

                        return;
                     }
                  } else {
                     var10000 = arg1[var21];
                  }

                  while(true) {
                     int var22 = var10000;
                     if (this.field3288.length <= var22) {
                        ++var21;
                     } else {
                        label836: {
                           int[] var23 = this.field3288[var22];
                           int var35;
                           int var36;
                           int var37;
                           int var38;
                           int var39;
                           int var40;
                           int var41;
                           int var42;
                           int var43;
                           int var44;
                           int var45;
                           if (~(1 & arg5) != -1) {
                              int var24 = 0;
                              int var25;
                              int var26;
                              int var27;
                              int var28;
                              int var29;
                              int var30;
                              int var31;
                              int var32;
                              int var33;
                              int var34;
                              if (var8 != 0) {
                                 var25 = var23[var24];
                                 this.field3305[var25] -= class776.field11343;
                                 this.field3218[var25] -= class242.field3079;
                                 this.field3272[var25] -= class117.field1429;
                                 if (arg2 != 0) {
                                    var26 = class689.field10389[arg2];
                                    var27 = class689.field10391[arg2];
                                    var28 = this.field3218[var25] * var27 + -(this.field3272[var25] * var26) + 16383 >> 14;
                                    this.field3272[var25] = this.field3218[var25] * var26 - -(this.field3272[var25] * var27) + 16383 >> 14;
                                    this.field3218[var25] = var28;
                                 }

                                 if (arg4 != 0) {
                                    var29 = class689.field10389[arg4];
                                    var30 = class689.field10391[arg4];
                                    var31 = this.field3218[var25] * var29 - (-(this.field3305[var25] * var30) - 16383) >> 14;
                                    this.field3218[var25] = this.field3218[var25] * var30 + -(this.field3305[var25] * var29) + 16383 >> 14;
                                    this.field3305[var25] = var31;
                                 }

                                 if (~arg3 != -1) {
                                    var32 = class689.field10389[arg3];
                                    var33 = class689.field10391[arg3];
                                    var34 = this.field3272[var25] * var32 - (-(this.field3305[var25] * var33) - 16383) >> 14;
                                    this.field3272[var25] = this.field3272[var25] * var33 + -(this.field3305[var25] * var32) + 16383 >> 14;
                                    this.field3305[var25] = var34;
                                 }

                                 this.field3305[var25] += class776.field11343;
                                 this.field3218[var25] += class242.field3079;
                                 this.field3272[var25] += class117.field1429;
                                 ++var24;
                              }

                              while(var23.length > var24) {
                                 var25 = var23[var24];
                                 this.field3305[var25] -= class776.field11343;
                                 this.field3218[var25] -= class242.field3079;
                                 this.field3272[var25] -= class117.field1429;
                                 if (arg2 != 0) {
                                    var26 = class689.field10389[arg2];
                                    var27 = class689.field10391[arg2];
                                    var28 = this.field3218[var25] * var27 + -(this.field3272[var25] * var26) + 16383 >> 14;
                                    this.field3272[var25] = this.field3218[var25] * var26 - -(this.field3272[var25] * var27) + 16383 >> 14;
                                    this.field3218[var25] = var28;
                                 }

                                 if (arg4 != 0) {
                                    var29 = class689.field10389[arg4];
                                    var30 = class689.field10391[arg4];
                                    var31 = this.field3218[var25] * var29 - (-(this.field3305[var25] * var30) - 16383) >> 14;
                                    this.field3218[var25] = this.field3218[var25] * var30 + -(this.field3305[var25] * var29) + 16383 >> 14;
                                    this.field3305[var25] = var31;
                                 }

                                 if (~arg3 != -1) {
                                    var32 = class689.field10389[arg3];
                                    var33 = class689.field10391[arg3];
                                    var34 = this.field3272[var25] * var32 - (-(this.field3305[var25] * var33) - 16383) >> 14;
                                    this.field3272[var25] = this.field3272[var25] * var33 + -(this.field3305[var25] * var32) + 16383 >> 14;
                                    this.field3305[var25] = var34;
                                 }

                                 this.field3305[var25] += class776.field11343;
                                 this.field3218[var25] += class242.field3079;
                                 this.field3272[var25] += class117.field1429;
                                 ++var24;
                              }

                              if (var8 == 0) {
                                 ++var21;
                                 break label836;
                              }

                              var35 = 0;
                              if (var8 != 0) {
                                 var36 = var23[var35];
                                 this.field3305[var36] -= class776.field11343;
                                 this.field3218[var36] -= class242.field3079;
                                 this.field3272[var36] -= class117.field1429;
                                 if (arg4 != 0) {
                                    var37 = class689.field10389[arg4];
                                    var38 = class689.field10391[arg4];
                                    var39 = this.field3305[var36] * var38 + (this.field3218[var36] * var37 - -16383) >> 14;
                                    this.field3218[var36] = this.field3218[var36] * var38 + -(this.field3305[var36] * var37) + 16383 >> 14;
                                    this.field3305[var36] = var39;
                                 }

                                 if (arg2 != 0) {
                                    var40 = class689.field10389[arg2];
                                    var41 = class689.field10391[arg2];
                                    var42 = this.field3218[var36] * var41 + -(this.field3272[var36] * var40) + 16383 >> 14;
                                    this.field3272[var36] = this.field3218[var36] * var40 + this.field3272[var36] * var41 + 16383 >> 14;
                                    this.field3218[var36] = var42;
                                 }

                                 if (arg3 != 0) {
                                    var43 = class689.field10389[arg3];
                                    var44 = class689.field10391[arg3];
                                    var45 = this.field3305[var36] * var44 + this.field3272[var36] * var43 + 16383 >> 14;
                                    this.field3272[var36] = this.field3272[var36] * var44 + -(this.field3305[var36] * var43) + 16383 >> 14;
                                    this.field3305[var36] = var45;
                                 }

                                 this.field3305[var36] += class776.field11343;
                                 this.field3218[var36] += class242.field3079;
                                 this.field3272[var36] += class117.field1429;
                                 ++var35;
                              }
                           } else {
                              var35 = 0;
                              if (var8 != 0) {
                                 var36 = var23[var35];
                                 this.field3305[var36] -= class776.field11343;
                                 this.field3218[var36] -= class242.field3079;
                                 this.field3272[var36] -= class117.field1429;
                                 if (arg4 != 0) {
                                    var37 = class689.field10389[arg4];
                                    var38 = class689.field10391[arg4];
                                    var39 = this.field3305[var36] * var38 + (this.field3218[var36] * var37 - -16383) >> 14;
                                    this.field3218[var36] = this.field3218[var36] * var38 + -(this.field3305[var36] * var37) + 16383 >> 14;
                                    this.field3305[var36] = var39;
                                 }

                                 if (arg2 != 0) {
                                    var40 = class689.field10389[arg2];
                                    var41 = class689.field10391[arg2];
                                    var42 = this.field3218[var36] * var41 + -(this.field3272[var36] * var40) + 16383 >> 14;
                                    this.field3272[var36] = this.field3218[var36] * var40 + this.field3272[var36] * var41 + 16383 >> 14;
                                    this.field3218[var36] = var42;
                                 }

                                 if (arg3 != 0) {
                                    var43 = class689.field10389[arg3];
                                    var44 = class689.field10391[arg3];
                                    var45 = this.field3305[var36] * var44 + this.field3272[var36] * var43 + 16383 >> 14;
                                    this.field3272[var36] = this.field3272[var36] * var44 + -(this.field3305[var36] * var43) + 16383 >> 14;
                                    this.field3305[var36] = var45;
                                 }

                                 this.field3305[var36] += class776.field11343;
                                 this.field3218[var36] += class242.field3079;
                                 this.field3272[var36] += class117.field1429;
                                 ++var35;
                              }
                           }

                           while(~var23.length < ~var35) {
                              var36 = var23[var35];
                              this.field3305[var36] -= class776.field11343;
                              this.field3218[var36] -= class242.field3079;
                              this.field3272[var36] -= class117.field1429;
                              if (arg4 != 0) {
                                 var37 = class689.field10389[arg4];
                                 var38 = class689.field10391[arg4];
                                 var39 = this.field3305[var36] * var38 + (this.field3218[var36] * var37 - -16383) >> 14;
                                 this.field3218[var36] = this.field3218[var36] * var38 + -(this.field3305[var36] * var37) + 16383 >> 14;
                                 this.field3305[var36] = var39;
                              }

                              if (arg2 != 0) {
                                 var40 = class689.field10389[arg2];
                                 var41 = class689.field10391[arg2];
                                 var42 = this.field3218[var36] * var41 + -(this.field3272[var36] * var40) + 16383 >> 14;
                                 this.field3272[var36] = this.field3218[var36] * var40 + this.field3272[var36] * var41 + 16383 >> 14;
                                 this.field3218[var36] = var42;
                              }

                              if (arg3 != 0) {
                                 var43 = class689.field10389[arg3];
                                 var44 = class689.field10391[arg3];
                                 var45 = this.field3305[var36] * var44 + this.field3272[var36] * var43 + 16383 >> 14;
                                 this.field3272[var36] = this.field3272[var36] * var44 + -(this.field3305[var36] * var43) + 16383 >> 14;
                                 this.field3305[var36] = var45;
                              }

                              this.field3305[var36] += class776.field11343;
                              this.field3218[var36] += class242.field3079;
                              this.field3272[var36] += class117.field1429;
                              ++var35;
                           }

                           ++var21;
                        }
                     }

                     if (~var21 <= ~var9) {
                        var10000 = arg6;
                        if (var8 == 0) {
                           if (arg6 != 0) {
                              var46 = 0;
                              if (var8 != 0 || var46 < var9) {
                                 do {
                                    var47 = arg1[var46];
                                    if (~this.field3288.length >= ~var47) {
                                       ++var46;
                                    } else {
                                       var48 = this.field3288[var47];
                                       var49 = 0;
                                       if (var8 == 0 && var48.length <= var49) {
                                          ++var46;
                                       } else {
                                          label265:
                                          do {
                                             var50 = var48[var49];
                                             var51 = this.field3187[var50];
                                             var52 = this.field3187[var50 + 1];
                                             var53 = var51;
                                             if (var8 == 0 && var51 >= var52) {
                                                ++var49;
                                             } else {
                                                do {
                                                   var54 = this.field3195[var53] - 1;
                                                   if (~var54 == 0) {
                                                      ++var49;
                                                      continue label265;
                                                   }

                                                   if (~arg4 != -1) {
                                                      var55 = class689.field10389[arg4];
                                                      var56 = class689.field10391[arg4];
                                                      var57 = this.field3299[var54] * var55 - -(this.field3267[var54] * var56) - -16383 >> 14;
                                                      this.field3299[var54] = (short)(this.field3299[var54] * var56 + 16383 + -(this.field3267[var54] * var55) >> 14);
                                                      this.field3267[var54] = (short)var57;
                                                   }

                                                   if (arg2 != 0) {
                                                      var58 = class689.field10389[arg2];
                                                      var59 = class689.field10391[arg2];
                                                      var60 = this.field3299[var54] * var59 + -(this.field3189[var54] * var58) - -16383 >> 14;
                                                      this.field3189[var54] = (short)(this.field3189[var54] * var59 + (this.field3299[var54] * var58 - -16383) >> 14);
                                                      this.field3299[var54] = (short)var60;
                                                   }

                                                   if (~arg3 != -1) {
                                                      var61 = class689.field10389[arg3];
                                                      var62 = class689.field10391[arg3];
                                                      var63 = this.field3267[var54] * var62 + this.field3189[var54] * var61 + 16383 >> 14;
                                                      this.field3189[var54] = (short)(this.field3189[var54] * var62 + -(this.field3267[var54] * var61) + 16383 >> 14);
                                                      this.field3267[var54] = (short)var63;
                                                   }

                                                   ++var53;
                                                } while(var53 < var52);

                                                ++var49;
                                             }
                                          } while(var48.length > var49);

                                          ++var46;
                                       }
                                    }
                                 } while(var46 < var9);
                              }

                              if (this.field3291 == null && this.field3281 != null) {
                                 this.field3281.field5840 = null;
                              }

                              if (this.field3291 != null) {
                                 this.field3291.field5840 = null;
                              }
                           }

                           return;
                        }
                     } else {
                        var10000 = arg1[var21];
                     }
                  }
               }
            } else {
               var110 = arg2 << 4;
               var112 = arg4 << 4;
               var111 = arg3 << 4;
               int var16 = 0;
               if (var8 != 0 || var9 > var16) {
                  do {
                     int var17 = arg1[var16];
                     if (var17 >= this.field3288.length) {
                        ++var16;
                     } else {
                        int[] var18 = this.field3288[var17];
                        int var19 = 0;
                        if (var8 == 0 && var19 >= var18.length) {
                           ++var16;
                        } else {
                           do {
                              int var20 = var18[var19];
                              this.field3305[var20] += var110;
                              this.field3218[var20] += var111;
                              this.field3272[var20] += var112;
                              ++var19;
                           } while(var19 < var18.length);

                           ++var16;
                        }
                     }
                  } while(var9 > var16);

               }
            }
         } else {
            var110 = arg2 << 4;
            var111 = arg3 << 4;
            var112 = arg4 << 4;
            class117.field1429 = 0;
            int var10 = 0;
            class776.field11343 = 0;
            class242.field3079 = 0;
            int var11 = 0;
            if (var8 != 0) {
               var10000 = arg1[var11];
            } else if (~var9 >= ~var11) {
               var10000 = var10;
               if (var8 == 0) {
                  if (var10 > 0) {
                     class242.field3079 = class242.field3079 / var10 + var111;
                     class117.field1429 = class117.field1429 / var10 + var112;
                     class776.field11343 = class776.field11343 / var10 + var110;
                     return;
                  }

                  class117.field1429 = var112;
                  class776.field11343 = var110;
                  class242.field3079 = var111;
                  return;
               }
            } else {
               var10000 = arg1[var11];
            }

            while(true) {
               int var12 = var10000;
               if (~var12 <= ~this.field3288.length) {
                  ++var11;
               } else {
                  int[] var13 = this.field3288[var12];
                  int var14 = 0;
                  int var15;
                  if (var8 != 0) {
                     var15 = var13[var14];
                     class776.field11343 += this.field3305[var15];
                     class242.field3079 += this.field3218[var15];
                     ++var10;
                     class117.field1429 += this.field3272[var15];
                     ++var14;
                  }

                  while(~var13.length < ~var14) {
                     var15 = var13[var14];
                     class776.field11343 += this.field3305[var15];
                     class242.field3079 += this.field3218[var15];
                     ++var10;
                     class117.field1429 += this.field3272[var15];
                     ++var14;
                  }

                  ++var11;
               }

               if (~var9 >= ~var11) {
                  var10000 = var10;
                  if (var8 == 0) {
                     if (var10 > 0) {
                        class242.field3079 = class242.field3079 / var10 + var111;
                        class117.field1429 = class117.field1429 / var10 + var112;
                        class776.field11343 = class776.field11343 / var10 + var110;
                        return;
                     }

                     class117.field1429 = var112;
                     class776.field11343 = var110;
                     class242.field3079 = var111;
                     return;
                  }
               } else {
                  var10000 = arg1[var11];
               }
            }
         }
      } catch (RuntimeException var109) {
         throw class670.method4877(var109, field3307[32] + arg0 + ',' + (arg1 != null ? field3307[0] : field3307[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "HA",
      descriptor = "()I",
      line = 5025
   )
   public final int method342() {
      try {
         if (!this.field3222) {
            this.method1859(-1);
         }

         ++field3262;
         return this.field3255;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3307[18] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "ma",
      descriptor = "()I",
      line = 5037
   )
   public final int method299() {
      try {
         ++field3208;
         if (!this.field3222) {
            this.method1859(-1);
         }

         return this.field3231;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3307[64] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "wa",
      descriptor = "()V",
      line = 5048
   )
   public final void method317() {
      int var1 = client.field4530;

      try {
         int var2 = 0;
         if (var1 != 0) {
            this.field3305[var2] = this.field3305[var2] + 7 >> 4;
            this.field3218[var2] = this.field3218[var2] + 7 >> 4;
            this.field3272[var2] = this.field3272[var2] + 7 >> 4;
            ++var2;
         }

         while(true) {
            while(var2 < this.field3297) {
               this.field3305[var2] = this.field3305[var2] + 7 >> 4;
               this.field3218[var2] = this.field3218[var2] + 7 >> 4;
               this.field3272[var2] = this.field3272[var2] + 7 >> 4;
               ++var2;
            }

            ++field3227;
            if (var1 == 0) {
               if (this.field3277 != null) {
                  this.field3277.field5840 = null;
               }

               this.field3222 = false;
               return;
            }

            this.field3272[var2] = this.field3272[var2] + 7 >> 4;
            ++var2;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field3307[17] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(IIII)V",
      line = 5080
   )
   public final void method329(int arg0, int arg1, int arg2, int arg3) {
      int var5 = client.field4530;

      try {
         int var6 = 0;
         int var7;
         int var8;
         int var9;
         int var10;
         if (var5 != 0) {
            var7 = 65535 & this.field3183[var6];
            var8 = (65261 & var7) >> 10;
            var9 = (var7 & 923) >> 7;
            var10 = var7 & 127;
            if (arg1 != -1) {
               var9 += (arg1 - var9) * arg3 >> 7;
            }

            if (~arg0 != 0) {
               var8 -= -((-var8 + arg0) * arg3 >> 7);
            }

            if (arg2 != -1) {
               var10 += (-var10 + arg2) * arg3 >> 7;
            }

            this.field3183[var6] = (short)class379.method2928(var10, class379.method2928(var9 << 7, var8 << 10));
            ++var6;
         }

         while(true) {
            int var10000;
            if (var6 >= this.field3201) {
               var10000 = field3266 + 1;
               if (var5 == 0) {
                  field3266 = var10000;
                  if (this.field3265 != null) {
                     int var11 = 0;
                     if (var5 != 0 || ~var11 > ~this.field3286) {
                        do {
                           class277 var12 = this.field3265[var11];
                           class613 var13 = this.field3303[var11];
                           var13.field8972 = class628.field9131[this.field3183[var12.field3858] & 65535] & 16777215 | -16777216 & var13.field8972;
                           ++var11;
                        } while(~var11 > ~this.field3286);
                     }
                  }

                  if (this.field3281 != null) {
                     this.field3281.field5840 = null;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = 65535 & this.field3183[var6];
            }

            var7 = var10000;
            var8 = (65261 & var7) >> 10;
            var9 = (var7 & 923) >> 7;
            var10 = var7 & 127;
            if (arg1 != -1) {
               var9 += (arg1 - var9) * arg3 >> 7;
            }

            if (~arg0 != 0) {
               var8 -= -((-var8 + arg0) * arg3 >> 7);
            }

            if (arg2 != -1) {
               var10 += (-var10 + arg2) * arg3 >> 7;
            }

            this.field3183[var6] = (short)class379.method2928(var10, class379.method2928(var9 << 7, var8 << 10));
            ++var6;
         }
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field3307[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "v",
      descriptor = "()V",
      line = 5137
   )
   public final void method327() {
      int var1 = client.field4530;

      try {
         ++field3223;
         int var2 = 0;
         if (var1 != 0) {
            this.field3272[var2] = -this.field3272[var2];
            ++var2;
         }

         while(true) {
            while(~var2 > ~this.field3273) {
               this.field3272[var2] = -this.field3272[var2];
               ++var2;
            }

            int var3 = 0;
            if (var1 == 0) {
               if (var1 != 0) {
                  this.field3189[var3] = (short)(-this.field3189[var3]);
                  ++var3;
               }

               while(true) {
                  while(~var3 > ~this.field3191) {
                     this.field3189[var3] = (short)(-this.field3189[var3]);
                     ++var3;
                  }

                  int var4 = 0;
                  if (var1 == 0) {
                     short var5;
                     if (var1 != 0) {
                        var5 = this.field3199[var4];
                        this.field3199[var4] = this.field3300[var4];
                        this.field3300[var4] = var5;
                        ++var4;
                     }

                     while(true) {
                        class247 var10000;
                        if (var4 >= this.field3201) {
                           var10000 = this;
                           if (var1 == 0) {
                              if (this.field3291 == null && this.field3281 != null) {
                                 this.field3281.field5840 = null;
                              }

                              if (this.field3291 != null) {
                                 this.field3291.field5840 = null;
                              }

                              if (this.field3214 != null) {
                                 this.field3214.field1256 = null;
                              }

                              if (this.field3277 != null) {
                                 this.field3277.field5840 = null;
                              }

                              this.field3222 = false;
                              return;
                           }
                        } else {
                           var10000 = this;
                        }

                        var5 = var10000.field3199[var4];
                        this.field3199[var4] = this.field3300[var4];
                        this.field3300[var4] = var5;
                        ++var4;
                     }
                  }

                  ++var3;
               }
            }

            ++var2;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field3307[34] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(IILgq;ZII)Z",
      line = 5187
   )
   public final boolean method331(int arg0, int arg1, class540 arg2, boolean arg3, int arg4, int arg5) {
      try {
         ++field3254;
         return this.method1855(arg4, arg1, arg0, 5, arg2, arg5, arg3);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field3307[14] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3307[0] : field3307[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "fa",
      descriptor = "()I",
      line = 5197
   )
   public final int method339() {
      try {
         if (!this.field3222) {
            this.method1859(-1);
         }

         ++field3229;
         return this.field3256;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3307[38] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "b",
      descriptor = "(IIII)V",
      line = 5213
   )
   public static final void method1858(int arg0, int arg1, int arg2, int arg3) {
      try {
         int var7 = class261.field3566.field9434.method1271(112) * arg0 >> 8;
         if (arg2 <= 79) {
            field3301 = null;
         }

         ++field3215;
         if (~var7 != -1 && ~arg3 != 0) {
            if (!class107.field1306 && ~class56.field705 != 0 && class152.method1249(-7966) && !class364.method2828((byte)-125)) {
               class773.field11317 = class146.method1207(-9);
               class55 var4 = class633.method4557(class773.field11317, true);
               class157.method1299(var4, true, (byte)-108);
            }

            class158.method1310(arg3, var7, (byte)-120, false, class172.field2157, 0);
            class225.method1705(-1, 255, 84);
            class107.field1306 = true;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field3307[27] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "d",
      descriptor = "(I)V",
      line = 5242
   )
   private final void method1859(int arg0) {
      int var2 = client.field4530;

      try {
         ++field3304;
         int var3 = 32767;
         int var4 = 32767;
         int var5 = 32767;
         int var6 = -32768;
         int var7 = -32768;
         int var8 = -32768;
         int var9 = 0;
         int var10 = 0;
         int var11 = 0;
         int var10000;
         if (var2 != 0) {
            var10000 = this.field3305[var11];
         } else if (var11 >= this.field3273) {
            this.field3275 = (short)var6;
            this.field3255 = (short)var5;
            this.field3190 = (short)var7;
            var10000 = arg0;
            if (var2 == 0) {
               if (arg0 != -1) {
                  return;
               }

               this.field3295 = (short)var8;
               this.field3256 = (short)var4;
               this.field3234 = (short)var3;
               this.field3271 = (short)((int)(0.99D + Math.sqrt((double)var9)));
               this.field3231 = (short)((int)(Math.sqrt((double)var10) + 0.99D));
               this.field3222 = true;
               return;
            }
         } else {
            var10000 = this.field3305[var11];
         }

         while(true) {
            int var12 = var10000;
            int var13 = this.field3218[var11];
            int var14 = this.field3272[var11];
            if (~var6 > ~var12) {
               var6 = var12;
            }

            if (~var3 < ~var12) {
               var3 = var12;
            }

            if (~var13 < ~var7) {
               var7 = var13;
            }

            if (var4 > var13) {
               var4 = var13;
            }

            if (var14 > var8) {
               var8 = var14;
            }

            if (var14 < var5) {
               var5 = var14;
            }

            int var15 = var12 * var12 + var14 * var14;
            if (var15 > var9) {
               var9 = var15;
            }

            int var16 = var12 * var12 + (var14 * var14 - -(var13 * var13));
            if (var16 > var10) {
               var10 = var16;
            }

            ++var11;
            if (var11 >= this.field3273) {
               this.field3275 = (short)var6;
               this.field3255 = (short)var5;
               this.field3190 = (short)var7;
               var10000 = arg0;
               if (var2 == 0) {
                  if (arg0 != -1) {
                     return;
                  }

                  this.field3295 = (short)var8;
                  this.field3256 = (short)var4;
                  this.field3234 = (short)var3;
                  this.field3271 = (short)((int)(0.99D + Math.sqrt((double)var9)));
                  this.field3231 = (short)((int)(Math.sqrt((double)var10) + 0.99D));
                  this.field3222 = true;
                  return;
               }
            } else {
               var10000 = this.field3305[var11];
            }
         }
      } catch (RuntimeException var18) {
         throw class670.method4877(var18, field3307[39] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(Lgq;Lpda;I)V",
      line = 5326
   )
   public final void method301(class540 arg0, class655 arg1, int arg2) {
      int var4 = client.field4530;

      try {
         ++field3290;
         if (this.field3191 != 0) {
            class218 var5 = this.field3284.field9926;
            class218 var6 = (class218)arg0;
            if (!this.field3222) {
               this.method1859(-1);
            }

            float var9;
            float var10;
            label136: {
               class164.field2058 = var5.field2746 * var6.field2748 + var5.field2749 * var6.field2756 + var5.field2748 * var6.field2769;
               class540.field7876 = var5.field2746 * var6.field2750 + var5.field2749 * var6.field2761 + var5.field2748 * var6.field2773 + var5.field2750;
               float var7 = (float)this.field3256 * class164.field2058 + class540.field7876;
               float var8 = (float)this.field3190 * class164.field2058 + class540.field7876;
               if (!(var8 < var7)) {
                  var9 = (float)this.field3271 + var8;
                  var10 = (float)(-this.field3271) + var7;
                  if (var4 == 0) {
                     break label136;
                  }
               }

               var10 = (float)(-this.field3271) + var8;
               var9 = (float)this.field3271 + var7;
            }

            if (!(var10 >= this.field3284.field9969)) {
               if (!((float)this.field3284.field9963 >= var9)) {
                  float var13;
                  float var14;
                  label128: {
                     class747.field11070 = var5.field2758 * var6.field2750 + var5.field2762 * var6.field2761 + var5.field2756 * var6.field2773 + var5.field2761;
                     class536.field7844 = var5.field2758 * var6.field2748 + var5.field2762 * var6.field2756 + var5.field2756 * var6.field2769;
                     float var11 = (float)this.field3256 * class536.field7844 + class747.field11070;
                     float var12 = (float)this.field3190 * class536.field7844 + class747.field11070;
                     if (var11 > var12) {
                        var13 = ((float)(-this.field3271) + var12) * (float)this.field3284.field9945;
                        var14 = ((float)this.field3271 + var11) * (float)this.field3284.field9945;
                        if (var4 == 0) {
                           break label128;
                        }
                     }

                     var13 = (var11 - (float)this.field3271) * (float)this.field3284.field9945;
                     var14 = ((float)this.field3271 + var12) * (float)this.field3284.field9945;
                  }

                  if (!(var13 / var9 >= this.field3284.field9965)) {
                     if (!(var14 / var9 <= this.field3284.field10027)) {
                        float var17;
                        float var18;
                        label120: {
                           class394.field5989 = var5.field2763 * var6.field2750 + var5.field2769 * var6.field2773 + var5.field2754 * var6.field2761 + var5.field2773;
                           class323.field4599 = var5.field2763 * var6.field2748 + var5.field2769 * var6.field2769 + var5.field2754 * var6.field2756;
                           float var15 = (float)this.field3256 * class323.field4599 + class394.field5989;
                           float var16 = (float)this.field3190 * class323.field4599 + class394.field5989;
                           if (!(var16 < var15)) {
                              var17 = (var15 - (float)this.field3271) * (float)this.field3284.field10024;
                              var18 = ((float)this.field3271 + var16) * (float)this.field3284.field10024;
                              if (var4 == 0) {
                                 break label120;
                              }
                           }

                           var18 = ((float)this.field3271 + var15) * (float)this.field3284.field10024;
                           var17 = (var16 - (float)this.field3271) * (float)this.field3284.field10024;
                        }

                        if (!(this.field3284.field9981 <= var17 / var9)) {
                           if (!(var18 / var9 <= this.field3284.field9944)) {
                              if (arg1 != null || this.field3265 != null) {
                                 class639.field9301 = var5.field2746 * var6.field2746 + var5.field2749 * var6.field2758 + var5.field2748 * var6.field2763;
                                 class743.field11020 = var5.field2763 * var6.field2749 + var5.field2769 * var6.field2754 + var5.field2754 * var6.field2762;
                                 class289.field4056 = var5.field2758 * var6.field2746 + var5.field2762 * var6.field2758 + var5.field2756 * var6.field2763;
                                 class263.field3600 = var5.field2746 * var6.field2749 + var5.field2749 * var6.field2762 + var5.field2748 * var6.field2754;
                                 class612.field8963 = var5.field2763 * var6.field2746 + var5.field2769 * var6.field2763 + var5.field2754 * var6.field2758;
                                 class405.field6204 = var5.field2758 * var6.field2749 + var5.field2762 * var6.field2762 + var5.field2756 * var6.field2754;
                              }

                              if (arg1 != null) {
                                 boolean var19;
                                 boolean var20;
                                 int var21;
                                 int var22;
                                 int var23;
                                 int var24;
                                 int var25;
                                 label105: {
                                    var19 = false;
                                    var20 = true;
                                    var21 = this.field3275 + this.field3234 >> 1;
                                    var22 = this.field3295 + this.field3255 >> 1;
                                    var23 = (int)((float)var22 * class289.field4056 + (float)this.field3256 * class536.field7844 + (float)var21 * class405.field6204 + class747.field11070);
                                    var24 = (int)((float)var22 * class612.field8963 + (float)this.field3256 * class323.field4599 + (float)var21 * class743.field11020 + class394.field5989);
                                    var25 = (int)((float)var22 * class639.field9301 + (float)this.field3256 * class164.field2058 + (float)var21 * class263.field3600 + class540.field7876);
                                    if (var25 < this.field3284.field9963) {
                                       var19 = true;
                                       if (var4 == 0) {
                                          break label105;
                                       }
                                    }

                                    arg1.field9521 = this.field3284.field9945 * var23 / var25 + this.field3284.field10003;
                                    arg1.field9519 = this.field3284.field10024 * var24 / var25 + this.field3284.field9940;
                                 }

                                 int var26;
                                 int var27;
                                 int var28;
                                 label100: {
                                    var26 = (int)((float)var22 * class289.field4056 + (float)this.field3190 * class536.field7844 + (float)var21 * class405.field6204 + class747.field11070);
                                    var27 = (int)((float)var22 * class612.field8963 + (float)this.field3190 * class323.field4599 + (float)var21 * class743.field11020 + class394.field5989);
                                    var28 = (int)((float)var22 * class639.field9301 + (float)this.field3190 * class164.field2058 + (float)var21 * class263.field3600 + class540.field7876);
                                    if (~var28 > ~this.field3284.field9963) {
                                       var19 = true;
                                       if (var4 == 0) {
                                          break label100;
                                       }
                                    }

                                    arg1.field9522 = this.field3284.field10003 - -(this.field3284.field9945 * var26 / var28);
                                    arg1.field9524 = this.field3284.field10024 * var27 / var28 + this.field3284.field9940;
                                 }

                                 if (var19) {
                                    label154: {
                                       if (var25 < this.field3284.field9963 && var28 < this.field3284.field9963) {
                                          var20 = false;
                                          if (var4 == 0) {
                                             break label154;
                                          }
                                       }

                                       if (~var25 > ~this.field3284.field9963) {
                                          int var29 = (-this.field3284.field9963 + var28 << 16) / (-var25 + var28);
                                          int var30 = var26 - -((-var23 + var26) * var29 >> 16);
                                          arg1.field9521 = this.field3284.field9945 * var30 / this.field3284.field9963 + this.field3284.field10003;
                                          int var31 = var27 - -((var27 - var24) * var29 >> 16);
                                          arg1.field9519 = this.field3284.field10024 * var31 / this.field3284.field9963 + this.field3284.field9940;
                                          if (var4 == 0) {
                                             break label154;
                                          }
                                       }

                                       if (~this.field3284.field9963 < ~var28) {
                                          int var32 = (-this.field3284.field9963 + var25 << 16) / (-var28 + var25);
                                          int var33 = ((var23 - var26) * var32 >> 16) + var23;
                                          int var34 = var24 - -((var24 - var27) * var32 >> 16);
                                          arg1.field9521 = this.field3284.field9945 * var33 / this.field3284.field9963 + this.field3284.field10003;
                                          arg1.field9519 = this.field3284.field9940 - -(this.field3284.field10024 * var34 / this.field3284.field9963);
                                       }
                                    }
                                 }

                                 if (var20) {
                                    label84: {
                                       arg1.field9523 = true;
                                       if (var25 > var28) {
                                          arg1.field9520 = (this.field3271 + var23) * this.field3284.field9945 / var25 + -arg1.field9521 + this.field3284.field10003;
                                          if (var4 == 0) {
                                             break label84;
                                          }
                                       }

                                       arg1.field9520 = (this.field3271 + var26) * this.field3284.field9945 / var28 + this.field3284.field10003 - arg1.field9522;
                                    }
                                 }
                              }

                              this.field3284.method4820(false);
                              this.field3284.method4815((byte)-117, var6);
                              this.method1848(126);
                              this.field3284.method4790((byte)75);
                              this.method1850(-76);
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var36) {
         throw class670.method4877(var36, field3307[2] + (arg0 != null ? field3307[0] : field3307[1]) + ',' + (arg1 != null ? field3307[0] : field3307[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(IIIIIIIII)Z",
      line = 5527
   )
   private final boolean method1860(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         ++field3198;
         if (arg6 < arg7 && arg0 > arg6 && arg5 > arg6) {
            return false;
         } else if (~arg7 > ~arg6 && ~arg6 < ~arg0 && arg5 < arg6) {
            return false;
         } else {
            if (arg3 >= -56) {
               this.method324((short)121, (short)-31);
            }

            if (arg1 > arg2 && ~arg2 > ~arg4 && ~arg8 < ~arg2) {
               return false;
            } else {
               return ~arg1 <= ~arg2 || ~arg2 >= ~arg4 || arg2 <= arg8;
            }
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field3307[49] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "na",
      descriptor = "()I",
      line = 5558
   )
   public final int method302() {
      try {
         ++field3220;
         if (!this.field3222) {
            this.method1859(-1);
         }

         return this.field3271;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3307[29] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "H",
      descriptor = "(III)V",
      line = 5577
   )
   public final void method303(int arg0, int arg1, int arg2) {
      int var4 = client.field4530;

      try {
         ++field3294;
         int var5 = 0;
         if (var4 != 0) {
            if (~arg0 != -1) {
               this.field3305[var5] += arg0;
            }

            if (~arg1 != -1) {
               this.field3218[var5] += arg1;
            }

            if (~arg2 != -1) {
               this.field3272[var5] += arg2;
               ++var5;
            } else {
               ++var5;
            }
         }

         while(true) {
            while(var5 < this.field3273) {
               if (~arg0 != -1) {
                  this.field3305[var5] += arg0;
               }

               if (~arg1 != -1) {
                  this.field3218[var5] += arg1;
               }

               if (~arg2 != -1) {
                  this.field3272[var5] += arg2;
                  ++var5;
               } else {
                  ++var5;
               }
            }

            if (var4 == 0) {
               if (this.field3277 != null) {
                  this.field3277.field5840 = null;
               }

               this.field3222 = false;
               return;
            }

            this.field3272[var5] += arg2;
            ++var5;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field3307[37] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "b",
      descriptor = "(B)V",
      line = 5612
   )
   private final void method1861(byte arg0) {
      int var2 = client.field4530;

      try {
         if (arg0 != -38) {
            this.field3214 = null;
         }

         ++field3200;
         if (this.field3270) {
            this.field3270 = false;
            if (this.field3292 == null && this.field3306 == null && this.field3265 == null && !class368.method2859(this.field3236, (byte)-62, this.field3249)) {
               boolean var3 = false;
               boolean var4 = false;
               if (this.field3305 != null && !class199.method1514(-30011, this.field3236, this.field3249)) {
                  label309: {
                     if (this.field3277 != null && this.field3277.field5840 == null) {
                        this.field3270 = true;
                        if (var2 == 0) {
                           break label309;
                        }
                     }

                     if (!this.field3222) {
                        this.method1859(arg0 + 37);
                     }

                     var3 = true;
                  }
               }

               boolean var5 = false;
               if (this.field3218 != null && !class122.method1010(this.field3236, (byte)-100, this.field3249)) {
                  label311: {
                     if (this.field3277 != null && this.field3277.field5840 == null) {
                        this.field3270 = true;
                        if (var2 == 0) {
                           break label311;
                        }
                     }

                     if (!this.field3222) {
                        this.method1859(arg0 ^ 37);
                     }

                     var4 = true;
                  }
               }

               if (this.field3272 != null && !class165.method1343(this.field3249, this.field3236, 95)) {
                  label317: {
                     if (this.field3277 == null || this.field3277.field5840 != null) {
                        if (!this.field3222) {
                           this.method1859(-1);
                        }

                        var5 = true;
                        if (var2 == 0) {
                           break label317;
                        }
                     }

                     this.field3270 = true;
                  }
               }

               if (var4) {
                  this.field3218 = null;
               }

               if (var5) {
                  this.field3272 = null;
               }

               if (var3) {
                  this.field3305 = null;
               }
            }

            if (this.field3195 != null && this.field3305 == null && this.field3218 == null && this.field3272 == null) {
               this.field3195 = null;
               this.field3187 = null;
            }

            if (this.field3289 != null && !class532.method3946(this.field3236, (byte)-64, this.field3249)) {
               label305: {
                  if (this.field3291 == null) {
                     if (this.field3281 != null && this.field3281.field5840 == null) {
                        this.field3270 = true;
                        if (var2 == 0) {
                           break label305;
                        }
                     }

                     this.field3289 = null;
                     this.field3267 = this.field3299 = this.field3189 = null;
                     if (var2 == 0) {
                        break label305;
                     }
                  }

                  if (this.field3291.field5840 != null) {
                     this.field3267 = this.field3299 = this.field3189 = null;
                     this.field3289 = null;
                     if (var2 == 0) {
                        break label305;
                     }
                  }

                  this.field3270 = true;
               }
            }

            if (this.field3183 != null && !class49.method392(this.field3236, this.field3249, arg0 + 1038)) {
               label236: {
                  if (this.field3281 != null && this.field3281.field5840 == null) {
                     this.field3270 = true;
                     if (var2 == 0) {
                        break label236;
                     }
                  }

                  this.field3183 = null;
               }
            }

            if (this.field3247 != null && !class249.method1879(this.field3249, 14907, this.field3236)) {
               label228: {
                  if (this.field3281 != null && this.field3281.field5840 == null) {
                     this.field3270 = true;
                     if (var2 == 0) {
                        break label228;
                     }
                  }

                  this.field3247 = null;
               }
            }

            if (this.field3237 != null && !class457.method3437(this.field3249, 117, this.field3236)) {
               label318: {
                  if (this.field3293 == null || this.field3293.field5840 != null) {
                     this.field3237 = this.field3184 = null;
                     if (var2 == 0) {
                        break label318;
                     }
                  }

                  this.field3270 = true;
               }
            }

            if (this.field3274 != null && !class235.method1762((byte)-81, this.field3236, this.field3249)) {
               label210: {
                  if (this.field3281 != null && this.field3281.field5840 == null) {
                     this.field3270 = true;
                     if (var2 == 0) {
                        break label210;
                     }
                  }

                  this.field3274 = null;
               }
            }

            if (this.field3199 != null && !class255.method1916(this.field3236, arg0 + 98, this.field3249)) {
               label320: {
                  if (this.field3214 != null && this.field3214.field1256 == null || this.field3281 != null && this.field3281.field5840 == null) {
                     this.field3270 = true;
                     if (var2 == 0) {
                        break label320;
                     }
                  }

                  this.field3199 = this.field3282 = this.field3300 = null;
               }
            }

            if (this.field3242 != null && !class69.method689(this.field3236, this.field3249, arg0 ^ 5560)) {
               this.field3242 = null;
               this.field3204 = null;
            }

            if (this.field3288 != null && !class426.method3240(this.field3249, (byte)-98, this.field3236)) {
               this.field3288 = null;
               this.field3298 = null;
            }

            if (this.field3192 != null && !class119.method994(0, this.field3236, this.field3249)) {
               this.field3192 = null;
            }

            if (this.field3257 != null && ~(this.field3249 & 2048) == -1 && (this.field3249 & 262144) == 0) {
               this.field3257 = null;
            }
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field3307[35] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "EA",
      descriptor = "()I",
      line = 5817
   )
   public final int method304() {
      try {
         ++field3207;
         if (!this.field3222) {
            this.method1859(-1);
         }

         return this.field3190;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3307[48] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(IILgq;ZI)Z",
      line = 5855
   )
   public final boolean method318(int arg0, int arg1, class540 arg2, boolean arg3, int arg4) {
      try {
         ++field3260;
         return this.method1855(arg4, arg1, arg0, 5, arg2, -1, arg3);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field3307[40] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3307[0] : field3307[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1862(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1863(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 29;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
