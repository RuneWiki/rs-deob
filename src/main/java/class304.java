import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class304 extends class22 {
   @OriginalMember(
      owner = "client!bq",
      name = "t",
      descriptor = "J"
   )
   public long field4399;
   @OriginalMember(
      owner = "client!bq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4407 = new String[]{method2384(method2383(",]|59")), method2384(method2383(",]|49")), method2384(method2383(",]|Jx E&H9")), method2384(method2383(",]|79"))};
   @OriginalMember(
      owner = "client!bq",
      name = "k",
      descriptor = "Lkea;"
   )
   public static class248 field4401 = new class248("", 13);
   @OriginalMember(
      owner = "client!bq",
      name = "n",
      descriptor = "I"
   )
   public static int field4402 = -1;
   @OriginalMember(
      owner = "client!bq",
      name = "m",
      descriptor = "Luw;"
   )
   public static class435 field4403 = new class435(4, 16);
   @OriginalMember(
      owner = "client!bq",
      name = "r",
      descriptor = "Ljava/lang/String;"
   )
   public static String field4406 = "";
   @OriginalMember(
      owner = "client!bq",
      name = "q",
      descriptor = "F"
   )
   public static float field4405;
   @OriginalMember(
      owner = "client!bq",
      name = "l",
      descriptor = "I"
   )
   public static int field4396;
   @OriginalMember(
      owner = "client!bq",
      name = "o",
      descriptor = "I"
   )
   public static int field4400;
   @OriginalMember(
      owner = "client!bq",
      name = "p",
      descriptor = "I"
   )
   public static int field4404;
   @OriginalMember(
      owner = "client!bq",
      name = "j",
      descriptor = "Lhw;"
   )
   public static class141 field4397;
   @OriginalMember(
      owner = "client!bq",
      name = "s",
      descriptor = "Laf;"
   )
   public static class457 field4398;

   @OriginalMember(
      owner = "client!bq",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2380(byte arg0) {
      try {
         field4401 = null;
         field4398 = null;
         int var1 = 17 % ((60 - arg0) / 48);
         field4397 = null;
         field4403 = null;
         field4406 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4407[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bq",
      name = "<init>",
      descriptor = "()V"
   )
   public class304() {
   }

   @OriginalMember(
      owner = "client!bq",
      name = "<init>",
      descriptor = "(J)V"
   )
   public class304(long arg0) {
      try {
         this.field4399 = arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4407[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bq",
      name = "a",
      descriptor = "(IIIIBII)V"
   )
   public static final void method2381(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
      boolean var7 = client.field4564;

      try {
         ++field4400;
         int var8 = -arg1 + arg6;
         if (arg4 <= 41) {
            method2382((byte)-109, -118, 27, 52);
         }

         int var9 = arg0 - -arg1;
         int var10 = arg0;
         if (var7) {
            class18.method132(false, arg3, arg5, arg2, class448.field6542[arg0]);
            var10 = arg0 + 1;
         }

         while(true) {
            while(~var10 > ~var9) {
               class18.method132(false, arg3, arg5, arg2, class448.field6542[var10]);
               ++var10;
            }

            int var11 = -arg1 + arg5;
            int var12 = arg6;
            if (!var7) {
               if (var7) {
                  class18.method132(false, arg3, arg5, arg2, class448.field6542[arg6]);
                  var12 = arg6 - 1;
               }

               while(true) {
                  while(~var12 < ~var8) {
                     class18.method132(false, arg3, arg5, arg2, class448.field6542[var12]);
                     --var12;
                  }

                  int var13 = arg1 + arg3;
                  int var14 = var9;
                  if (!var7) {
                     if (!var7 && ~var9 < ~var8) {
                        return;
                     }

                     do {
                        int[] var15 = class448.field6542[var14];
                        class18.method132(false, arg3, var13, arg2, var15);
                        class18.method132(false, var11, arg5, arg2, var15);
                        ++var14;
                     } while(~var14 >= ~var8);

                     return;
                  }

                  --var12;
               }
            }

            ++var10;
         }
      } catch (RuntimeException var17) {
         throw class608.method4462(var17, field4407[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bq",
      name = "a",
      descriptor = "(BIII)I"
   )
   public static final int method2382(byte arg0, int arg1, int arg2, int arg3) {
      try {
         int var6 = arg3 & 3;
         ++field4396;
         if (var6 == 0) {
            return arg1;
         } else if (~var6 == -2) {
            return arg2;
         } else {
            if (arg0 <= 94) {
               field4405 = -1.0305135F;
            }

            return var6 == 2 ? -arg1 + 7 : -arg2 + 7;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field4407[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2383(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2384(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
