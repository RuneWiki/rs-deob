import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class627 {
   @OriginalMember(
      owner = "client!pk",
      name = "e",
      descriptor = "J"
   )
   public long field8952;
   @OriginalMember(
      owner = "client!pk",
      name = "c",
      descriptor = "Laea;"
   )
   private class678 field8946;
   @OriginalMember(
      owner = "client!pk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8953 = new String[]{method4614(method4613("il\u0019ZU")), method4614(method4613("wr[w")), method4614(method4613("il\u0019'\u0014wnC%U")), method4614(method4613("b)\u00195\u0000")), method4614(method4613("il\u0019}\u0014wf[r\u0007|/")), method4614(method4613("il\u0019YU")), method4614(method4613("il\u0019XU"))};
   @OriginalMember(
      owner = "client!pk",
      name = "g",
      descriptor = "F"
   )
   public static float field8950;
   @OriginalMember(
      owner = "client!pk",
      name = "a",
      descriptor = "I"
   )
   public static int field8947;
   @OriginalMember(
      owner = "client!pk",
      name = "b",
      descriptor = "I"
   )
   public static int field8948;
   @OriginalMember(
      owner = "client!pk",
      name = "f",
      descriptor = "I"
   )
   public static int field8949;
   @OriginalMember(
      owner = "client!pk",
      name = "d",
      descriptor = "[[[Z"
   )
   public static boolean[][][] field8951;

   @OriginalMember(
      owner = "client!pk",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4610(int arg0) {
      try {
         if (arg0 != -27657) {
            method4610(-47);
         }

         field8951 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8953[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "a",
      descriptor = "(Ljava/lang/String;B)I"
   )
   public static final int method4611(String arg0, byte arg1) {
      boolean var2 = client.field10022;

      try {
         ++field8949;
         if (arg1 > -110) {
            method4611((String)null, (byte)1);
         }

         int var3 = arg0.length();
         int var4 = 0;
         int var5 = 0;
         if (var2) {
            var4 = arg0.charAt(var5) + (var4 << 5) + -var4;
            ++var5;
         }

         while(true) {
            while(~var3 < ~var5) {
               var4 = arg0.charAt(var5) + (var4 << 5) + -var4;
               ++var5;
            }

            if (!var2) {
               return var4;
            }

            var4 = var4;
            ++var5;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field8953[6] + (arg0 != null ? field8953[3] : field8953[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "a",
      descriptor = "(IBZIIIIII)Z"
   )
   public static final boolean method4612(int arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         ++field8948;
         int var9 = class117.field1849.field5861[0];
         if (arg1 != 106) {
            return true;
         } else {
            int var10 = class117.field1849.field5865[0];
            if (var9 >= 0 && var9 < class234.field3626 && ~var10 <= -1 && ~class209.field2989 < ~var10) {
               if (~arg3 <= -1 && arg3 < class234.field3626 && arg8 >= 0 && ~arg8 > ~class209.field2989) {
                  int var11 = class647.method4713(arg2, arg8, var9, class117.field1849.method1507(arg1 + -217), arg4, arg0, class100.field1588[class117.field1849.field6824], arg6, arg3, arg1 + 99999893, var10, arg5, class748.field10640, class309.field4661, arg7);
                  if (var11 < 1) {
                     return false;
                  } else {
                     class269.field4123 = class309.field4661[var11 + -1];
                     class522.field7355 = class748.field10640[var11 + -1];
                     class7.field128 = false;
                     class720.method5215((byte)-29);
                     return true;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field8953[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "<init>",
      descriptor = "(Laea;J[Lbfa;)V"
   )
   public class627(class678 arg0, long arg1, class631[] arg2) {
      try {
         this.field8952 = arg1;
         this.field8946 = arg0;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8953[2] + (arg0 != null ? field8953[3] : field8953[1]) + ',' + arg1 + ',' + (arg2 != null ? field8953[3] : field8953[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field8947;
         this.field8946.method4896(255, this.field8952);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8953[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4613(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4614(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
