import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!e")
public class class12 {
   @OriginalMember(
      owner = "loginapplet!e",
      name = "a",
      descriptor = "Ls;"
   )
   public static class40 field89;
   @OriginalMember(
      owner = "loginapplet!e",
      name = "b",
      descriptor = "I"
   )
   public static int field90;
   @OriginalMember(
      owner = "loginapplet!e",
      name = "c",
      descriptor = "[Lg;"
   )
   private class16[] field91;
   @OriginalMember(
      owner = "loginapplet!e",
      name = "d",
      descriptor = "I"
   )
   private int field92;
   @OriginalMember(
      owner = "loginapplet!e",
      name = "e",
      descriptor = "J"
   )
   private long field93;
   @OriginalMember(
      owner = "loginapplet!e",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field94;
   @OriginalMember(
      owner = "loginapplet!e",
      name = "g",
      descriptor = "[[B"
   )
   public static byte[][] field95 = new byte[1000][];
   @OriginalMember(
      owner = "loginapplet!e",
      name = "h",
      descriptor = "[[D"
   )
   public static double[][] field96 = new double[][]{{0.037D, 0.017D}, {0.044D, 0.018D}};
   @OriginalMember(
      owner = "loginapplet!e",
      name = "i",
      descriptor = "Lg;"
   )
   private class16 field97;
   @OriginalMember(
      owner = "loginapplet!e",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field98 = new int[128];

   @OriginalMember(
      owner = "loginapplet!e",
      name = "a",
      descriptor = "(I)Lg;",
      line = 5
   )
   public final class16 method50(int arg0) {
      try {
         if (null != this.field97) {
            if (arg0 > -115) {
               field90 = -93;
            }

            class16 var2 = this.field91[(int)(this.field93 & (long)(-1 + this.field92))];

            while(this.field97 != var2) {
               if (~this.field97.field127 == ~this.field93) {
                  class16 var3 = this.field97;
                  this.field97 = this.field97.field121;
                  return var3;
               }

               this.field97 = this.field97.field121;
            }

            this.field97 = null;
            return null;
         } else {
            return null;
         }
      } catch (RuntimeException var4) {
         throw class28.method139(var4, "e.D(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!e",
      name = "a",
      descriptor = "(JI)Lg;",
      line = 49
   )
   public final class16 method51(long arg0, int arg1) {
      try {
         this.field93 = arg0;
         class16 var4 = this.field91[(int)(arg0 & (long)(-1 + this.field92))];

         for(this.field97 = var4.field121; var4 != this.field97; this.field97 = this.field97.field121) {
            if (this.field97.field127 == arg0) {
               class16 var5 = this.field97;
               this.field97 = this.field97.field121;
               return var5;
            }
         }

         int var7 = -67 / ((38 - arg1) / 59);
         this.field97 = null;
         return null;
      } catch (RuntimeException var6) {
         throw class28.method139(var6, "e.F(" + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!e",
      name = "a",
      descriptor = "(FIFFF)F",
      line = 81
   )
   public static final float method52(float arg0, int arg1, float arg2, float arg3, float arg4) {
      try {
         if (arg1 != 1) {
            field90 = 108;
         }

         return -(arg2 * arg0) + arg3 * arg4;
      } catch (RuntimeException var6) {
         throw class28.method139(var6, "e.E(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!e",
      name = "a",
      descriptor = "(IIII)V",
      line = 94
   )
   public static final void method53(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg3 > -63) {
            field90 = -78;
         }

         for(int var4 = 0; class21.field152.length > var4; ++var4) {
            int var5 = class21.field152[var4];
            if (var5 != 0) {
               int var6 = 255 & var5 >> -2107927920;
               int var8 = var5 & 255;
               var8 += arg2;
               int var7 = (var5 & 65481) >> -1600310136;
               var7 += arg1;
               if (1 > var8) {
                  var8 = 1;
               } else if (255 < var8) {
                  var8 = 255;
               }

               if (-2 >= ~var7) {
                  if (255 < var7) {
                     var7 = 255;
                  }
               } else {
                  var7 = 1;
               }

               var6 += arg0;
               if (-2 >= ~var6) {
                  if (255 < var6) {
                     var6 = 255;
                  }
               } else {
                  var6 = 1;
               }

               class21.field152[var4] = (var6 << -1490536208) - (-(var7 << 1149964904) + -var8);
            }
         }

      } catch (RuntimeException var9) {
         throw class28.method139(var9, "e.A(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!e",
      name = "a",
      descriptor = "(ILg;J)V",
      line = 154
   )
   public final void method54(int arg0, class16 arg1, long arg2) {
      try {
         if (null != arg1.field123) {
            arg1.method83(3);
         }

         class16 var5 = this.field91[(int)((long)(arg0 + this.field92) & arg2)];
         arg1.field121 = var5;
         arg1.field123 = var5.field123;
         arg1.field127 = arg2;
         arg1.field123.field121 = arg1;
         arg1.field121.field123 = arg1;
      } catch (RuntimeException var6) {
         throw class28.method139(var6, "e.C(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!e",
      name = "b",
      descriptor = "(I)V",
      line = 180
   )
   public static final void method55(int arg0) {
      try {
         class32 var1 = class14.field111;
         synchronized(class14.field111) {
            class4.field54 = class26.field179;
            class13.field100 = class8.field74;
            class17.field129 = class10.field80;
            class3.field11 = class29.field198;
            class22.field157 = class28.field197;
            class10.field80 = arg0;
         }
      } catch (RuntimeException var4) {
         throw class28.method139(var4, "e.G(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!e",
      name = "<init>",
      descriptor = "(I)V",
      line = 211
   )
   public class12(int arg0) {
      try {
         this.field91 = new class16[arg0];
         this.field92 = arg0;

         for(int var2 = 0; var2 < arg0; ++var2) {
            class16 var3 = this.field91[var2] = new class16();
            var3.field123 = var3;
            var3.field121 = var3;
         }

      } catch (RuntimeException var4) {
         throw class28.method139(var4, "e.<init>(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!e",
      name = "a",
      descriptor = "(Z)V",
      line = 241
   )
   public static void method56(boolean arg0) {
      try {
         field98 = null;
         field89 = null;
         field96 = (double[][])null;
         if (arg0) {
            field98 = (int[])null;
         }

         field95 = (byte[][])null;
      } catch (RuntimeException var2) {
         throw class28.method139(var2, "e.B(" + arg0 + ')');
      }
   }
}
