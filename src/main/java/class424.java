import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class424 extends class546 {
   @OriginalMember(
      owner = "client!df",
      name = "t",
      descriptor = "Lhja;"
   )
   public class430 field5951;
   @OriginalMember(
      owner = "client!df",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5952 = new String[]{method3200(method3199("+!3i\\")), method3200(method3199("!2qG")), method3200(method3199("4i3\u0005\t")), method3200(method3199("+!3\u0017\u001d!.i\u0015\\"))};
   @OriginalMember(
      owner = "client!df",
      name = "u",
      descriptor = "Z"
   )
   public static boolean field5950 = true;
   @OriginalMember(
      owner = "client!df",
      name = "v",
      descriptor = "I"
   )
   public static int field5949;

   @OriginalMember(
      owner = "client!df",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method3197(int arg0, int arg1, int arg2) {
      boolean var3 = class111.field1404[0][arg1][arg2] != null && class111.field1404[0][arg1][arg2].field2828 != null;

      for(int var4 = arg0; var4 >= 0; --var4) {
         if (class111.field1404[var4][arg1][arg2] == null) {
            class225 var5 = class111.field1404[var4][arg1][arg2] = new class225(var4);
            if (var3) {
               ++var5.field2825;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!df",
      name = "<init>",
      descriptor = "(Lhja;)V"
   )
   public class424(class430 arg0) {
      try {
         this.field5951 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5952[3] + (arg0 != null ? field5952[2] : field5952[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "a",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public static final void method3198(String arg0, int arg1) {
      boolean var2 = client.field4273;

      try {
         ++field5949;
         if (arg0 != null) {
            if (arg1 != 1) {
               field5950 = true;
            }

            String var3 = class14.method110(true, arg0);
            if (var3 != null) {
               int var4 = 0;
               if (var2 || class568.field7743 > var4) {
                  do {
                     String var5 = class589.field8125[var4];
                     String var6 = class14.method110(true, var5);
                     if (class141.method1207(var3, var6, var5, arg0, true)) {
                        --class568.field7743;
                        int var7 = var4;
                        if (var2) {
                           class589.field8125[var4] = class589.field8125[var4 + 1];
                           class710.field10421[var4] = class710.field10421[var4 + 1];
                           class740.field10787[var4] = class740.field10787[var4 + 1];
                           class370.field5211[var4] = class370.field5211[var4 + 1];
                           class786.field11476[var4] = class786.field11476[var4 + 1];
                           var7 = var4 + 1;
                        }

                        while(true) {
                           while(class568.field7743 > var7) {
                              class589.field8125[var7] = class589.field8125[var7 + 1];
                              class710.field10421[var7] = class710.field10421[var7 + 1];
                              class740.field10787[var7] = class740.field10787[var7 + 1];
                              class370.field5211[var7] = class370.field5211[var7 + 1];
                              class786.field11476[var7] = class786.field11476[var7 + 1];
                              ++var7;
                           }

                           ++class229.field2856;
                           class667.field9490 = class350.field5018;
                           class223 var8 = class355.method2790(arg1 ^ 13110);
                           class471 var9 = class133.method1118(var8.field2787, 2, class90.field1155);
                           var9.field6527.method4318(class190.method1432(arg1 ^ 10525, arg0), arg1 + -1);
                           var9.field6527.method4332((byte)-119, arg0);
                           var8.method1702((byte)-107, var9);
                           if (!var2) {
                              return;
                           }

                           ++var7;
                        }
                     }

                     ++var4;
                  } while(class568.field7743 > var4);

               }
            }
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field5952[0] + (arg0 != null ? field5952[2] : field5952[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3199(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 116);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!df",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3200(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 29;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 116;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
