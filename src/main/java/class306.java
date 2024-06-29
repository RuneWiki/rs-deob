import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class306 {
   @OriginalMember(
      owner = "client!cq",
      name = "h",
      descriptor = "[F"
   )
   private float[] field4259 = new float[16];
   @OriginalMember(
      owner = "client!cq",
      name = "u",
      descriptor = "Lvt;"
   )
   private class771 field4263 = new class771(786336);
   @OriginalMember(
      owner = "client!cq",
      name = "q",
      descriptor = "I"
   )
   private int field4272 = class291.method2349((byte)102, 1600);
   @OriginalMember(
      owner = "client!cq",
      name = "r",
      descriptor = "[I"
   )
   private int[] field4274 = new int[64];
   @OriginalMember(
      owner = "client!cq",
      name = "c",
      descriptor = "[I"
   )
   private int[] field4276 = new int[8191];
   @OriginalMember(
      owner = "client!cq",
      name = "i",
      descriptor = "[[Lgf;"
   )
   private class74[][] field4275 = new class74[64][768];
   @OriginalMember(
      owner = "client!cq",
      name = "s",
      descriptor = "[[Lgf;"
   )
   private class74[][] field4278 = new class74[1600][64];
   @OriginalMember(
      owner = "client!cq",
      name = "b",
      descriptor = "I"
   )
   private int field4277 = 0;
   @OriginalMember(
      owner = "client!cq",
      name = "p",
      descriptor = "[I"
   )
   private int[] field4279 = new int[1600];
   @OriginalMember(
      owner = "client!cq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4280 = new String[]{method2450(method2449(")Vi:%")), method2450(method2449("$R+\u0014")), method2450(method2449("1\tiVp")), method2450(method2449(")Vi<%")), method2450(method2449(")Vi=%")), method2450(method2449(")Vi;%")), method2450(method2449(")Vi?%")), method2450(method2449(")Vi0%")), method2450(method2449(")Vi9%")), method2450(method2449(")Vi>%"))};
   @OriginalMember(
      owner = "client!cq",
      name = "j",
      descriptor = "I"
   )
   public static int field4260;
   @OriginalMember(
      owner = "client!cq",
      name = "a",
      descriptor = "I"
   )
   public static int field4261;
   @OriginalMember(
      owner = "client!cq",
      name = "g",
      descriptor = "I"
   )
   public static int field4262;
   @OriginalMember(
      owner = "client!cq",
      name = "t",
      descriptor = "I"
   )
   public static int field4264;
   @OriginalMember(
      owner = "client!cq",
      name = "d",
      descriptor = "I"
   )
   public static int field4265;
   @OriginalMember(
      owner = "client!cq",
      name = "o",
      descriptor = "I"
   )
   public static int field4266;
   @OriginalMember(
      owner = "client!cq",
      name = "k",
      descriptor = "I"
   )
   public static int field4267;
   @OriginalMember(
      owner = "client!cq",
      name = "e",
      descriptor = "I"
   )
   public static int field4268;
   @OriginalMember(
      owner = "client!cq",
      name = "l",
      descriptor = "Lrga;"
   )
   private class71 field4269;
   @OriginalMember(
      owner = "client!cq",
      name = "n",
      descriptor = "Lrga;"
   )
   private class71 field4270;
   @OriginalMember(
      owner = "client!cq",
      name = "m",
      descriptor = "Lrga;"
   )
   private class71 field4273;
   @OriginalMember(
      owner = "client!cq",
      name = "f",
      descriptor = "Llp;"
   )
   private class83 field4271;

   @OriginalMember(
      owner = "client!cq",
      name = "a",
      descriptor = "(ILiu;I)V"
   )
   private final void method2441(int arg0, class530 arg1, int arg2) {
      try {
         ++field4267;
         int var4 = -22 % ((-35 - arg0) / 37);
         class535.field7848 = arg1.field7732;
         arg1.method4000((float)arg2, (byte)19);
         arg1.method3984((byte)122);
         OpenGL.glDisable(16384);
         OpenGL.glDisable(16385);
         arg1.method4020(-90, false);
         OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field4280[4] + arg0 + ',' + (arg1 != null ? field4280[2] : field4280[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cq",
      name = "a",
      descriptor = "(Liu;IB)V"
   )
   private final void method2442(class530 param1, int param2, byte param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cq",
      name = "a",
      descriptor = "(ILiu;)V"
   )
   private final void method2443(int arg0, class530 arg1) {
      try {
         arg1.method4020(63, true);
         ++field4266;
         OpenGL.glEnable(16384);
         OpenGL.glEnable(16385);
         if (arg0 != -7702) {
            this.method2448((class530)null, (byte)127);
         }

         if (class535.field7848 != arg1.field7732) {
            arg1.method428(class535.field7848);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4280[6] + arg0 + ',' + (arg1 != null ? field4280[2] : field4280[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cq",
      name = "a",
      descriptor = "(Lgea;I)Liq;"
   )
   public static final class228 method2444(class66 arg0, int arg1) {
      try {
         ++field4260;
         class237 var2 = class405.method3174(true)[arg0.method640(255)];
         class596 var3 = class680.method4958(119)[arg0.method640(255)];
         int var4 = arg0.method652((byte)13);
         int var5 = arg0.method652((byte)-87);
         int var6 = arg0.method603(-2);
         int var7 = arg0.method603(-2);
         int var8 = arg0.method652((byte)-86);
         int var9 = 96 % ((arg1 - -16) / 50);
         int var10 = arg0.method610(13);
         int var11 = arg0.method610(-87);
         return new class228(var2, var3, var4, var5, var6, var7, var8, var10, var11);
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field4280[7] + (arg0 != null ? field4280[2] : field4280[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cq",
      name = "a",
      descriptor = "(Liu;IILnh;)V"
   )
   public final void method2445(class530 param1, int param2, int param3, class554 param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cq",
      name = "a",
      descriptor = "(IILiu;ZIZI[I)Lik;"
   )
   public static final class124 method2446(int arg0, int arg1, class530 arg2, boolean arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
      try {
         ++field4265;
         if (!arg5) {
            return null;
         } else if (!arg2.field7760 && (!class181.method1525((byte)-30, arg4) || !class181.method1525((byte)-47, arg1))) {
            return !arg2.field7695 ? new class124(arg2, arg4, arg1, class109.method978(-1, arg4), class109.method978(-1, arg1), arg7) : new class124(arg2, 34037, arg4, arg1, arg3, arg7, arg0, arg6);
         } else {
            return new class124(arg2, 3553, arg4, arg1, arg3, arg7, arg0, arg6);
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field4280[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4280[2] : field4280[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field4280[2] : field4280[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cq",
      name = "b",
      descriptor = "(Liu;B)V"
   )
   private final void method2447(class530 arg0, byte arg1) {
      try {
         ++field4268;
         class535.field7848 = arg0.field7732;
         arg0.method4029(arg1 ^ -52);
         OpenGL.glDisable(16384);
         OpenGL.glDisable(16385);
         if (arg1 != -60) {
            this.field4273 = null;
         }

         arg0.method4020(56, false);
         OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4280[9] + (arg0 != null ? field4280[2] : field4280[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cq",
      name = "a",
      descriptor = "(Liu;B)V"
   )
   public final void method2448(class530 arg0, byte arg1) {
      try {
         ++field4261;
         this.field4271 = arg0.method4024(1, 196584, (byte[])null, true, 24);
         this.field4269 = new class71(this.field4271, 5126, 2, 0);
         this.field4273 = new class71(this.field4271, 5126, 3, 8);
         this.field4270 = new class71(this.field4271, 5121, 4, 20);
         if (arg1 <= 60) {
            this.method2445((class530)null, 4, 34, (class554)null);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4280[0] + (arg0 != null ? field4280[2] : field4280[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2449(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 13);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2450(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
