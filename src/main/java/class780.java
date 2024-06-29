import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class780 extends class577 implements class133 {
   @OriginalMember(
      owner = "client!wh",
      name = "s",
      descriptor = "I"
   )
   private int field11366;
   @OriginalMember(
      owner = "client!wh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11373 = new String[]{method5632(method5631("E\n7\fT")), method5632(method5631("IL7c\u0001")), method5632(method5631("PQuN")), method5632(method5631("IL7`\u0001")), method5632(method5631("IL7\u001e@PMm\u001c\u0001")), method5632(method5631("IL7d\u0001")), method5632(method5631("IL7f\u0001")), method5632(method5631("IL7a\u0001")), method5632(method5631("IL7g\u0001"))};
   @OriginalMember(
      owner = "client!wh",
      name = "q",
      descriptor = "I"
   )
   public static int field11367;
   @OriginalMember(
      owner = "client!wh",
      name = "u",
      descriptor = "I"
   )
   public static int field11368;
   @OriginalMember(
      owner = "client!wh",
      name = "r",
      descriptor = "I"
   )
   public static int field11369;
   @OriginalMember(
      owner = "client!wh",
      name = "t",
      descriptor = "I"
   )
   public static int field11370;
   @OriginalMember(
      owner = "client!wh",
      name = "p",
      descriptor = "I"
   )
   public static int field11371;
   @OriginalMember(
      owner = "client!wh",
      name = "o",
      descriptor = "I"
   )
   public static int field11372;

   @OriginalMember(
      owner = "client!wh",
      name = "b",
      descriptor = "(I)J"
   )
   public final long method1121(int arg0) {
      try {
         if (arg0 != -26023) {
            this.field11366 = -73;
         }

         ++field11370;
         return 0L;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11373[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method3931(byte arg0) {
      try {
         int var2 = 49 % ((-70 - arg0) / 50);
         super.field8559.method3997(this, 8);
         ++field11372;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field11373[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method1119(int arg0) {
      try {
         ++field11369;
         if (arg0 >= -2) {
            this.method1122(28, true, -9, (byte[])null);
         }

         return this.field11366;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11373[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "<init>",
      descriptor = "(Liu;I[BIZ)V"
   )
   public class780(class530 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
      super(arg0, 34963, arg2, arg3, arg4);

      try {
         this.field11366 = arg1;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field11373[4] + (arg0 != null ? field11373[0] : field11373[2]) + ',' + arg1 + ',' + (arg2 != null ? field11373[0] : field11373[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "a",
      descriptor = "(Lgea;I)Lru;"
   )
   public static final class259 method5630(class66 arg0, int arg1) {
      try {
         ++field11368;
         class228 var2 = class306.method2444(arg0, 81);
         if (arg1 != 34963) {
            method5630((class66)null, -5);
         }

         int var3 = arg0.method610(12);
         int var4 = arg0.method610(-42);
         return new class259(var2.field2861, var2.field2857, var2.field2855, var2.field2854, var2.field2853, var2.field2850, var2.field2856, var2.field2859, var2.field2862, var3, var4);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field11373[5] + (arg0 != null ? field11373[0] : field11373[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method1120(byte arg0) {
      try {
         ++field11367;
         if (arg0 < 59) {
            this.field11366 = 40;
         }

         return super.field8558;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11373[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "a",
      descriptor = "(IZI[B)V"
   )
   public final void method1122(int arg0, boolean arg1, int arg2, byte[] arg3) {
      try {
         if (!arg1) {
            method5630((class66)null, 73);
         }

         this.method4323(arg3, arg0, (byte)-126);
         ++field11371;
         this.field11366 = arg2;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field11373[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field11373[0] : field11373[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5631(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5632(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 34;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
