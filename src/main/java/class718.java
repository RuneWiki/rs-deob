import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class718 {
   @OriginalMember(
      owner = "client!bw",
      name = "q",
      descriptor = "[F"
   )
   private float[] field10478 = new float[16];
   @OriginalMember(
      owner = "client!bw",
      name = "b",
      descriptor = "Lsh;"
   )
   private class77 field10471 = new class77(786336);
   @OriginalMember(
      owner = "client!bw",
      name = "r",
      descriptor = "I"
   )
   private int field10481 = class456.method3326(1600, (byte)124);
   @OriginalMember(
      owner = "client!bw",
      name = "i",
      descriptor = "I"
   )
   private int field10485 = 0;
   @OriginalMember(
      owner = "client!bw",
      name = "v",
      descriptor = "[[Loea;"
   )
   private class624[][] field10486 = new class624[1600][64];
   @OriginalMember(
      owner = "client!bw",
      name = "f",
      descriptor = "[I"
   )
   private int[] field10488 = new int[1600];
   @OriginalMember(
      owner = "client!bw",
      name = "a",
      descriptor = "[[Loea;"
   )
   private class624[][] field10489 = new class624[64][768];
   @OriginalMember(
      owner = "client!bw",
      name = "o",
      descriptor = "[I"
   )
   private int[] field10487 = new int[8191];
   @OriginalMember(
      owner = "client!bw",
      name = "m",
      descriptor = "[I"
   )
   private int[] field10490 = new int[64];
   @OriginalMember(
      owner = "client!bw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10491 = new String[]{method5227(method5226("VN$w")), method5227(method5226("C\u0015f5 ")), method5227(method5226("ZLfSu")), method5227(method5226("ZLfYu")), method5227(method5226("ZLf_u")), method5227(method5226("ZLf^u")), method5227(method5226("ZLfXu")), method5227(method5226("ZLf\\u")), method5227(method5226("ZLfZu")), method5227(method5226("ZLf]u"))};
   @OriginalMember(
      owner = "client!bw",
      name = "l",
      descriptor = "F"
   )
   public static float field10477 = 0.0F;
   @OriginalMember(
      owner = "client!bw",
      name = "g",
      descriptor = "I"
   )
   public static int field10469;
   @OriginalMember(
      owner = "client!bw",
      name = "p",
      descriptor = "I"
   )
   public static int field10470;
   @OriginalMember(
      owner = "client!bw",
      name = "h",
      descriptor = "I"
   )
   public static int field10472;
   @OriginalMember(
      owner = "client!bw",
      name = "d",
      descriptor = "I"
   )
   public static int field10473;
   @OriginalMember(
      owner = "client!bw",
      name = "s",
      descriptor = "I"
   )
   public static int field10474;
   @OriginalMember(
      owner = "client!bw",
      name = "c",
      descriptor = "I"
   )
   public static int field10475;
   @OriginalMember(
      owner = "client!bw",
      name = "n",
      descriptor = "I"
   )
   public static int field10476;
   @OriginalMember(
      owner = "client!bw",
      name = "k",
      descriptor = "I"
   )
   public static int field10479;
   @OriginalMember(
      owner = "client!bw",
      name = "t",
      descriptor = "Lwr;"
   )
   private class485 field10484;
   @OriginalMember(
      owner = "client!bw",
      name = "u",
      descriptor = "Lil;"
   )
   private class7 field10480;
   @OriginalMember(
      owner = "client!bw",
      name = "e",
      descriptor = "Lil;"
   )
   private class7 field10482;
   @OriginalMember(
      owner = "client!bw",
      name = "j",
      descriptor = "Lil;"
   )
   private class7 field10483;

   @OriginalMember(
      owner = "client!bw",
      name = "a",
      descriptor = "(II)V",
      line = 4
   )
   public static final void method5218(int arg0, int arg1) {
      try {
         class405.field5860 = arg1;
         ++field10474;
         class409.field5909.method731(0);
         if (arg0 > -62) {
            field10477 = 0.11381642F;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10491[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "a",
      descriptor = "(ILea;I)V",
      line = 19
   )
   private final void method5219(int arg0, class573 arg1, int arg2) {
      try {
         class75.field920 = arg1.field8471;
         if (arg2 == -4813) {
            ++field10472;
            arg1.method4138(11544, (float)arg0);
            arg1.method4137((byte)124);
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
            arg1.method4148(false, (byte)-64);
            OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10491[3] + arg0 + ',' + (arg1 != null ? field10491[1] : field10491[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "b",
      descriptor = "(Lea;I)V",
      line = 37
   )
   public final void method5220(class573 arg0, int arg1) {
      try {
         this.field10484 = arg0.method4113((byte[])null, 24, 671655096, true, 196584);
         ++field10469;
         this.field10482 = new class7(this.field10484, 5126, 2, 0);
         this.field10480 = new class7(this.field10484, 5126, 3, 8);
         this.field10483 = new class7(this.field10484, 5121, 4, 20);
         if (arg1 != 23326) {
            field10477 = 0.9944478F;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10491[5] + (arg0 != null ? field10491[1] : field10491[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "a",
      descriptor = "(Lea;B)V",
      line = 58
   )
   private final void method5221(class573 arg0, byte arg1) {
      try {
         ++field10479;
         if (arg1 == -85) {
            class75.field920 = arg0.field8471;
            arg0.method4172(2);
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
            arg0.method4148(false, (byte)-64);
            OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10491[4] + (arg0 != null ? field10491[1] : field10491[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "a",
      descriptor = "(Lea;I)V",
      line = 75
   )
   private final void method5222(class573 arg0, int arg1) {
      try {
         if (arg1 != 0) {
            this.method5221((class573)null, (byte)3);
         }

         ++field10475;
         arg0.method4148(true, (byte)-64);
         OpenGL.glEnable(16384);
         OpenGL.glEnable(16385);
         if (class75.field920 != arg0.field8471) {
            arg0.method534(class75.field920);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10491[6] + (arg0 != null ? field10491[1] : field10491[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "b",
      descriptor = "(ILea;I)V",
      line = 92
   )
   private final void method5223(int param1, class573 param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bw",
      name = "a",
      descriptor = "(I[SI)[S",
      line = 447
   )
   public static final short[] method5224(int arg0, short[] arg1, int arg2) {
      try {
         ++field10476;
         short[] var3 = new short[arg2];
         class242.method1851(arg1, 0, var3, arg0, arg2);
         return var3;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10491[8] + arg0 + ',' + (arg1 != null ? field10491[1] : field10491[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "a",
      descriptor = "(Lrha;IBLea;)V",
      line = 458
   )
   public final void method5225(class234 param1, int param2, byte param3, class573 param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5226(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5227(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 56;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
