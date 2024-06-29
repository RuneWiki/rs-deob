import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eja")
public class class767 implements class227 {
   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "Lqh;"
   )
   private class74 field11069;
   @OriginalMember(
      owner = "client!eja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11072 = new String[]{method5502(method5501("%\u0018uxMh")), method5502(method5501(".\u0007x:")), method5502(method5501("%\u0018ux2)\u001c}\"0h")), method5502(method5501(";\\:xs")), method5502(method5501("%\u0018uxJh")), method5502(method5501("%\u0018uxOh")), method5502(method5501("%\u0018uxLh"))};
   @OriginalMember(
      owner = "client!eja",
      name = "h",
      descriptor = "Lou;"
   )
   public static class635 field11065 = new class635();
   @OriginalMember(
      owner = "client!eja",
      name = "e",
      descriptor = "Lnw;"
   )
   public static class616 field11068 = new class616(39, -1);
   @OriginalMember(
      owner = "client!eja",
      name = "b",
      descriptor = "Ljava/lang/String;"
   )
   public static String field11070 = null;
   @OriginalMember(
      owner = "client!eja",
      name = "f",
      descriptor = "I"
   )
   public static int field11064;
   @OriginalMember(
      owner = "client!eja",
      name = "c",
      descriptor = "I"
   )
   public static int field11066;
   @OriginalMember(
      owner = "client!eja",
      name = "d",
      descriptor = "I"
   )
   public static int field11067;
   @OriginalMember(
      owner = "client!eja",
      name = "g",
      descriptor = "I"
   )
   public static int field11071;

   @OriginalMember(
      owner = "client!eja",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method5499(byte arg0) {
      boolean var1 = client.field4273;

      try {
         ++field11064;
         if (arg0 >= -86) {
            field11071 = 89;
         }

         class424 var2 = (class424)class532.field7281.method3855(121);
         if (var1 || var2 != null) {
            do {
               label52: {
                  class430 var3 = var2.field5951;
                  if (var3.field5995) {
                     var2.method3609(82);
                     var3.method3225(79);
                     if (!var1) {
                        break label52;
                     }
                  }

                  if (~class369.field5205 <= ~var3.field6011) {
                     label53: {
                        var3.method3226(class291.field3846, 1);
                        if (var3.field5995) {
                           var2.method3609(122);
                           if (!var1) {
                              break label53;
                           }
                        }

                        class239.method1792(var3, true);
                     }
                  }
               }

               var2 = (class424)class532.field7281.method3866((byte)122);
            } while(var2 != null);

         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field11072[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method1010(boolean arg0) {
      try {
         ++field11066;
         if (this.field11069.method721(0)) {
            return 100;
         } else {
            return !arg0 ? 96 : this.field11069.method712(-19232);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11072[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(B)Lbf;"
   )
   public final class566 method1008(byte arg0) {
      try {
         int var2 = -5 / ((arg0 - -46) / 53);
         ++field11067;
         return class566.field7718;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field11072[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5500(int arg0) {
      try {
         if (arg0 == -1) {
            field11068 = null;
            field11070 = null;
            field11065 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field11072[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "<init>",
      descriptor = "(Lqh;)V"
   )
   public class767(class74 arg0) {
      try {
         this.field11069 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11072[2] + (arg0 != null ? field11072[3] : field11072[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5501(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5502(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 64;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
