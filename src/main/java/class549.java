import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public class class549 {
   @OriginalMember(
      owner = "client!hha",
      name = "e",
      descriptor = "Ldn;"
   )
   public class546 field7496 = new class546();
   @OriginalMember(
      owner = "client!hha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7505 = new String[]{method3972(method3971("WipD")), method3972(method3971("Qt}\u0006r\u0011")), method3972(method3971("B22\u0006N")), method3972(method3971("Qt}\u0006t\u0011")), method3972(method3971("Qt}\u0006u\u0011")), method3972(method3971("Qt}\u0006\u000fPru\\\r\u0011")), method3972(method3971("Qt}\u0006q\u0011")), method3972(method3971("Qt}\u0006p\u0011")), method3972(method3971("Qt}\u0006v\u0011")), method3972(method3971("Qt}\u0006w\u0011"))};
   @OriginalMember(
      owner = "client!hha",
      name = "b",
      descriptor = "I"
   )
   public static int field7497;
   @OriginalMember(
      owner = "client!hha",
      name = "g",
      descriptor = "I"
   )
   public static int field7498;
   @OriginalMember(
      owner = "client!hha",
      name = "d",
      descriptor = "I"
   )
   public static int field7499;
   @OriginalMember(
      owner = "client!hha",
      name = "c",
      descriptor = "I"
   )
   public static int field7500;
   @OriginalMember(
      owner = "client!hha",
      name = "h",
      descriptor = "I"
   )
   public static int field7501;
   @OriginalMember(
      owner = "client!hha",
      name = "f",
      descriptor = "I"
   )
   public static int field7502;
   @OriginalMember(
      owner = "client!hha",
      name = "a",
      descriptor = "Ldn;"
   )
   private class546 field7504;
   @OriginalMember(
      owner = "client!hha",
      name = "i",
      descriptor = "[[Leb;"
   )
   public static class657[][] field7503;

   @OriginalMember(
      owner = "client!hha",
      name = "b",
      descriptor = "(B)Ldn;"
   )
   public final class546 method3964(byte arg0) {
      try {
         ++field7498;
         int var2 = -108 % ((-72 - arg0) / 53);
         class546 var3 = this.field7496.field7453;
         if (this.field7496 == var3) {
            this.field7504 = null;
            return null;
         } else {
            this.field7504 = var3.field7453;
            return var3;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7505[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hha",
      name = "a",
      descriptor = "(Z)Ldn;"
   )
   public final class546 method3965(boolean arg0) {
      try {
         ++field7502;
         class546 var2 = this.field7504;
         if (!arg0) {
            this.field7504 = null;
         }

         if (this.field7496 == var2) {
            this.field7504 = null;
            return null;
         } else {
            this.field7504 = var2.field7453;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7505[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hha",
      name = "b",
      descriptor = "(Z)Ldn;"
   )
   public final class546 method3966(boolean arg0) {
      try {
         ++field7500;
         class546 var2 = this.field7496.field7453;
         if (this.field7496 == var2) {
            return null;
         } else if (arg0) {
            return null;
         } else {
            var2.method3943(-4);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7505[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hha",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3967(byte arg0) {
      try {
         if (arg0 < 34) {
            method3967((byte)41);
         }

         field7503 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7505[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hha",
      name = "a",
      descriptor = "(Ldn;B)V"
   )
   public final void method3968(class546 arg0, byte arg1) {
      try {
         if (arg0.field7451 != null) {
            arg0.method3943(-4);
         }

         ++field7499;
         arg0.field7451 = this.field7496.field7451;
         arg0.field7453 = this.field7496;
         arg0.field7451.field7453 = arg0;
         arg0.field7453.field7451 = arg0;
         int var3 = -77 / ((62 - arg1) / 41);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7505[1] + (arg0 != null ? field7505[2] : field7505[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hha",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method3969(int arg0) {
      boolean var2 = client.field4273;

      try {
         ++field7497;
         int var3 = 0;
         class546 var4 = this.field7496.field7453;
         if (var2) {
            var4 = var4.field7453;
            ++var3;
         }

         while(true) {
            while(this.field7496 != var4) {
               var4 = var4.field7453;
               ++var3;
            }

            int var5 = -107 / ((63 - arg0) / 35);
            if (!var2) {
               return var3;
            }

            ++var3;
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field7505[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hha",
      name = "<init>",
      descriptor = "()V"
   )
   public class549() {
      try {
         this.field7496.field7453 = this.field7496;
         this.field7496.field7451 = this.field7496;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7505[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!hha",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3970(int arg0) {
      boolean var2 = client.field4273;

      try {
         ++field7501;
         int var3 = -65 % ((53 - arg0) / 58);

         while(true) {
            class546 var4 = this.field7496.field7453;
            if (this.field7496 != var4) {
               var4.method3943(-4);
               if (var2) {
                  break;
               }

               if (!var2) {
                  continue;
               }
            }

            this.field7504 = null;
            break;
         }

      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field7505[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3971(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3972(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 57;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
