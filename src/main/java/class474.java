import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class474 {
   @OriginalMember(
      owner = "client!jea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7073 = new String[]{method3530(method3529("2\n\"tjp")), method3530(method3529("2\n\"tmp")), method3530(method3529("#AmtT")), method3530(method3529("\u0011\u00015;E1\u000bc(H<\u0006;`")), method3530(method3529("6\u001a/6")), method3530(method3529("2\n\"tkp"))};
   @OriginalMember(
      owner = "client!jea",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field7072 = new int[2048];
   @OriginalMember(
      owner = "client!jea",
      name = "a",
      descriptor = "I"
   )
   public static int field7070;
   @OriginalMember(
      owner = "client!jea",
      name = "b",
      descriptor = "I"
   )
   public static int field7071;
   @OriginalMember(
      owner = "client!jea",
      name = "d",
      descriptor = "Leaa;"
   )
   public static class526 field7069;

   @OriginalMember(
      owner = "client!jea",
      name = "a",
      descriptor = "(I)V",
      line = 3
   )
   public static void method3525(int arg0) {
      try {
         field7072 = null;
         field7069 = null;
         if (arg0 != -3) {
            field7072 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7073[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jea",
      name = "a",
      descriptor = "(IZILjava/lang/String;)Z",
      line = 16
   )
   public static final boolean method3526(int arg0, boolean arg1, int arg2, String arg3) {
      int var4 = client.field4530;

      try {
         ++field7071;
         if (~arg0 <= -3 && arg0 <= 36) {
            if (arg2 != 87) {
               method3525(-65);
            }

            boolean var5 = false;
            byte var6 = 0;
            int var7 = 0;
            int var8 = arg3.length();
            int var9 = 0;
            char var10000;
            if (var4 != 0) {
               var10000 = arg3.charAt(var9);
            } else if (var8 <= var9) {
               var10000 = (char)var6;
               if (var4 == 0) {
                  return (boolean)var6;
               }
            } else {
               var10000 = arg3.charAt(var9);
            }

            while(true) {
               label153: {
                  char var10 = var10000;
                  if (~var9 == -1) {
                     if (~var10 == -46) {
                        var5 = true;
                        if (var4 == 0) {
                           ++var9;
                           break label153;
                        }
                     }

                     if (var10 == '+' && arg1 && var4 == 0) {
                        ++var9;
                        break label153;
                     }
                  }

                  int var14;
                  if (~var10 <= -49 && var10 <= '9') {
                     var14 = var10 - '0';
                  } else if (~var10 <= -66) {
                     if (var10 <= 'Z') {
                        var14 = var10 - '7';
                        if (var4 != 0) {
                           if (var14 < 97 || ~var14 < -123) {
                              break;
                           }

                           var14 -= 87;
                           if (var4 != 0) {
                              break;
                           }
                        }
                     } else {
                        if (var10 < 'a' || ~var10 < -123) {
                           break;
                        }

                        var14 = var10 - 'W';
                        if (var4 != 0) {
                           break;
                        }
                     }
                  } else {
                     if (var10 < 'a' || ~var10 < -123) {
                        break;
                     }

                     var14 = var10 - 'W';
                     if (var4 != 0) {
                        break;
                     }
                  }

                  if (~var14 <= ~arg0) {
                     return false;
                  }

                  if (var5) {
                     var14 = -var14;
                  }

                  int var11 = arg0 * var7 + var14;
                  if (var11 / arg0 != var7) {
                     return false;
                  }

                  var6 = 1;
                  var7 = var11;
                  ++var9;
               }

               if (var8 <= var9) {
                  var10000 = (char)var6;
                  if (var4 == 0) {
                     return (boolean)var6;
                  }
               } else {
                  var10000 = arg3.charAt(var9);
               }
            }

            return false;
         } else {
            throw new IllegalArgumentException(field7073[3] + arg0);
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field7073[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7073[2] : field7073[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jea",
      name = "a",
      descriptor = "(Lar;)V",
      line = 90
   )
   public static final void method3527(class710 arg0) {
      class499.field7394 = arg0;
   }

   @OriginalMember(
      owner = "client!jea",
      name = "a",
      descriptor = "(ILcka;Lka;III)V",
      line = 96
   )
   public static final void method3528(int arg0, class185 arg1, class497 arg2, int arg3, int arg4, int arg5) {
      try {
         ++field7070;
         if (arg2 != null) {
            if (arg0 == 2136) {
               arg1.method1442(arg5, 27, arg2.method304(), arg2.method306(), arg2.method302(), arg2.method342(), arg3, arg4, arg2.method344(), arg2.method339(), arg2.method300());
            }
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field7073[5] + arg0 + ',' + (arg1 != null ? field7073[2] : field7073[4]) + ',' + (arg2 != null ? field7073[2] : field7073[4]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3529(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3530(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
