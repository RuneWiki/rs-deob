import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class43 {
   @OriginalMember(
      owner = "client!fca",
      name = "d",
      descriptor = "Lbia;"
   )
   public class16 field571 = new class16();
   @OriginalMember(
      owner = "client!fca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field575 = new String[]{method312(method311("\t\nt\u0011;G")), method312(method311("&\u0007c^\u0016\u0006\r5M\u001b\u000b\u0000m\u0005")), method312(method311("\t\nt\u00118G")), method312(method311("\u0001\u001cyS")), method312(method311("\u0014G;\u0011\u0007")), method312(method311("\t\nt\u00119G"))};
   @OriginalMember(
      owner = "client!fca",
      name = "c",
      descriptor = "I"
   )
   public static int field572;
   @OriginalMember(
      owner = "client!fca",
      name = "b",
      descriptor = "I"
   )
   public static int field573;
   @OriginalMember(
      owner = "client!fca",
      name = "e",
      descriptor = "I"
   )
   public static int field574;
   @OriginalMember(
      owner = "client!fca",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field570;

   @OriginalMember(
      owner = "client!fca",
      name = "a",
      descriptor = "(I)V",
      line = 6
   )
   public static void method308(int arg0) {
      try {
         field570 = null;
         if (arg0 != 87) {
            method308(104);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field575[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fca",
      name = "a",
      descriptor = "(ZIII)Ljava/lang/String;",
      line = 16
   )
   public static final String method309(boolean arg0, int arg1, int arg2, int arg3) {
      boolean var4 = client.field1786;

      try {
         ++field573;
         if (arg2 != 36) {
            return null;
         } else if (~arg1 <= -3 && arg1 <= 36) {
            if (arg0 && arg3 >= 0) {
               int var5 = 2;
               int var6 = arg3 / arg1;
               if (var4) {
                  var6 /= arg1;
                  ++var5;
               }

               while(true) {
                  while(~var6 != -1) {
                     var6 /= arg1;
                     ++var5;
                  }

                  char[] var7 = new char[var5];
                  var7[0] = '+';
                  int var8 = var5 + -1;
                  if (!var4) {
                     if (!var4 && var8 <= 0) {
                        return new String(var7);
                     } else {
                        do {
                           int var9 = arg3;
                           arg3 /= arg1;
                           int var10 = -(arg1 * arg3) + var9;
                           if (~var10 > -11) {
                              var7[var8] = (char)(var10 + 48);
                              if (var4) {
                                 var7[var8] = (char)(var10 + 87);
                                 --var8;
                              } else {
                                 --var8;
                              }
                           } else {
                              var7[var8] = (char)(var10 + 87);
                              --var8;
                           }
                        } while(var8 > 0);

                        return new String(var7);
                     }
                  }

                  ++var5;
               }
            } else {
               return Integer.toString(arg3, arg1);
            }
         } else {
            throw new IllegalArgumentException(field575[1] + arg1);
         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field575[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fca",
      name = "a",
      descriptor = "(BILjava/lang/String;)V",
      line = 65
   )
   public static final void method310(byte arg0, int arg1, String arg2) {
      try {
         ++field572;
         class566 var3 = class146.method1321((long)arg1, 3, arg0 ^ 1428737223);
         var3.method4269((byte)-126);
         if (arg0 != -65) {
            field570 = null;
         }

         var3.field8400 = arg2;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field575[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field575[4] : field575[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method311(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method312(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 111;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
