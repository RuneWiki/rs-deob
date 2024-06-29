import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class294 {
   @OriginalMember(
      owner = "client!he",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4664 = new String[]{method2480(method2479("\n\u001dr,EJ")), method2480(method2479("\n\u001dr+EJ")), method2480(method2479("\n\u001dr*EJ")), method2480(method2479("\n\u001dr-EJ"))};
   @OriginalMember(
      owner = "client!he",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field4657 = false;
   @OriginalMember(
      owner = "client!he",
      name = "h",
      descriptor = "I"
   )
   public static int field4659 = 0;
   @OriginalMember(
      owner = "client!he",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field4661 = new int[5];
   @OriginalMember(
      owner = "client!he",
      name = "b",
      descriptor = "I"
   )
   public static int field4652;
   @OriginalMember(
      owner = "client!he",
      name = "j",
      descriptor = "I"
   )
   public static int field4654;
   @OriginalMember(
      owner = "client!he",
      name = "e",
      descriptor = "I"
   )
   public static int field4658;
   @OriginalMember(
      owner = "client!he",
      name = "d",
      descriptor = "I"
   )
   public static int field4660;
   @OriginalMember(
      owner = "client!he",
      name = "c",
      descriptor = "I"
   )
   public static int field4662;
   @OriginalMember(
      owner = "client!he",
      name = "i",
      descriptor = "I"
   )
   public static int field4663;
   @OriginalMember(
      owner = "client!he",
      name = "g",
      descriptor = "J"
   )
   public long field4655;
   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "Lhe;"
   )
   public class294 field4653;
   @OriginalMember(
      owner = "client!he",
      name = "f",
      descriptor = "Lhe;"
   )
   public class294 field4656;

   @OriginalMember(
      owner = "client!he",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method2475(int arg0) {
      try {
         if (arg0 != 8405) {
            field4661 = null;
         }

         field4661 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4664[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(IIII)V"
   )
   public static final void method2476(int arg0, int arg1, int arg2, int arg3) {
      boolean var4 = client.field1786;

      try {
         if (arg0 != -8602) {
            field4662 = -49;
         }

         label52: {
            if (~arg2 == -1004) {
               class469.method3645(class120.field1695, arg3, arg1);
               if (!var4) {
                  break label52;
               }
            }

            if (arg2 != 1006) {
               if (~arg2 == -1010) {
                  class469.method3645(class783.field11503, arg3, arg1);
                  if (!var4) {
                     break label52;
                  }
               }

               if (arg2 == 1001) {
                  class469.method3645(class110.field1520, arg3, arg1);
                  if (!var4) {
                     break label52;
                  }
               }

               if (~arg2 != -1013) {
                  break label52;
               }

               class469.method3645(class222.field3340, arg3, arg1);
               if (!var4) {
                  break label52;
               }
            }

            class469.method3645(class232.field3552, arg3, arg1);
         }

         ++field4660;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4664[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method2477(int arg0) {
      try {
         ++field4658;
         if (this.field4653 != null) {
            this.field4653.field4656 = this.field4656;
            if (arg0 == 1976) {
               this.field4656.field4653 = this.field4653;
               this.field4653 = null;
               this.field4656 = null;
            }
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4664[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "d",
      descriptor = "(I)Z"
   )
   public final boolean method2478(int arg0) {
      try {
         if (arg0 != 1001) {
            return false;
         } else {
            ++field4654;
            return this.field4653 != null;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4664[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2479(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!he",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2480(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
