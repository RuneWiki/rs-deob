import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class2 extends class70 {
   @OriginalMember(
      owner = "client!ud",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field14 = new String[]{method11(method10("@v\u007fj0")), method11(method10("@v\u007fl0")), method11(method10("@v\u007fn0")), method11(method10("@v\u007fk0"))};
   @OriginalMember(
      owner = "client!ud",
      name = "I",
      descriptor = "Luk;"
   )
   public static class498 field10 = new class498(84, -1);
   @OriginalMember(
      owner = "client!ud",
      name = "H",
      descriptor = "I"
   )
   public static int field11;
   @OriginalMember(
      owner = "client!ud",
      name = "J",
      descriptor = "I"
   )
   public static int field12;
   @OriginalMember(
      owner = "client!ud",
      name = "G",
      descriptor = "I"
   )
   public static int field9;
   @OriginalMember(
      owner = "client!ud",
      name = "F",
      descriptor = "[Ljq;"
   )
   public static class672[] field13;

   @OriginalMember(
      owner = "client!ud",
      name = "h",
      descriptor = "(I)V"
   )
   public static void method6(int arg0) {
      try {
         field13 = null;
         if (arg0 >= 65) {
            field10 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field14[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ud",
      name = "g",
      descriptor = "(I)Z"
   )
   public static final boolean method7(int arg0) {
      boolean var1 = client.field1786;

      try {
         ++field9;
         class175 var2 = (class175)class21.field273.method4972((byte)-84);
         if (var2 == null) {
            return false;
         } else {
            int var3 = arg0;
            if (var1) {
               if (var2.field2748[arg0] != null && ~var2.field2748[arg0].field4398 == -1) {
                  return false;
               }

               if (var2.field2741[arg0] != null) {
                  if (~var2.field2741[arg0].field4398 == -1) {
                     return false;
                  }

                  var3 = arg0 + 1;
               } else {
                  var3 = arg0 + 1;
               }
            }

            while(true) {
               while(var2.field2745 > var3) {
                  if (var2.field2748[var3] != null && ~var2.field2748[var3].field4398 == -1) {
                     return false;
                  }

                  if (var2.field2741[var3] != null) {
                     if (~var2.field2741[var3].field4398 == -1) {
                        return false;
                     }

                     ++var3;
                  } else {
                     ++var3;
                  }
               }

               if (!var1) {
                  return true;
               }

               if (1 == -1) {
                  return false;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field14[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ud",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method8(byte arg0, int arg1) {
      try {
         ++field12;
         if (arg0 != 87) {
            field13 = null;
         }

         return class199.field3060;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field14[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ud",
      name = "b",
      descriptor = "(Z)I"
   )
   public static final int method9(boolean arg0) {
      try {
         ++field11;
         if (~class67.field883 == -2) {
            return class63.field837;
         } else {
            if (!arg0) {
               method9(false);
            }

            return class208.field3176;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field14[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ud",
      name = "<init>",
      descriptor = "()V"
   )
   public class2() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!ud",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method10(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ud",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method11(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 47;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
