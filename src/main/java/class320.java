import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class320 extends class60 {
   @OriginalMember(
      owner = "client!u",
      name = "U",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4913 = new String[]{method2636(method2635("d-;S^")), method2636(method2635("d-<S^")), method2636(method2635("d-:S^")), method2636(method2635("j-V<\u000b")), method2636(method2635("Xm\u000es\u001axgX`\u0017uj\u0000(")), method2636(method2635("\u007fv\u0014~"))};
   @OriginalMember(
      owner = "client!u",
      name = "T",
      descriptor = "I"
   )
   public static int field4910 = 0;
   @OriginalMember(
      owner = "client!u",
      name = "B",
      descriptor = "I"
   )
   public static int field4912 = 0;
   @OriginalMember(
      owner = "client!u",
      name = "R",
      descriptor = "I"
   )
   public static int field4909;
   @OriginalMember(
      owner = "client!u",
      name = "K",
      descriptor = "I"
   )
   public static int field4911;
   @OriginalMember(
      owner = "client!u",
      name = "S",
      descriptor = "Lcj;"
   )
   public static class794 field4908;

   @OriginalMember(
      owner = "client!u",
      name = "d",
      descriptor = "(I)[Ltm;",
      line = 4
   )
   public static final class406[] method2632(int arg0) {
      try {
         if (arg0 != 0) {
            field4910 = 8;
         }

         ++field4911;
         return new class406[]{class301.field4717, class391.field6149, class621.field9033};
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4913[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!u",
      name = "c",
      descriptor = "(I)V",
      line = 28
   )
   public static void method2633(int arg0) {
      try {
         if (arg0 == 43) {
            field4908 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4913[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!u",
      name = "a",
      descriptor = "(Ljava/lang/String;IIZ)Z",
      line = 38
   )
   public static final boolean method2634(String arg0, int arg1, int arg2, boolean arg3) {
      boolean var4 = client.field1786;

      try {
         ++field4909;
         if (~arg1 <= -3 && arg1 <= 36) {
            boolean var5 = false;
            byte var6 = 0;
            if (arg2 >= -37) {
               method2633(75);
            }

            int var7 = 0;
            int var8 = arg0.length();
            int var9 = 0;
            char var10000;
            if (var4) {
               var10000 = arg0.charAt(var9);
            } else if (~var8 >= ~var9) {
               var10000 = (char)var6;
               if (!var4) {
                  return (boolean)var6;
               }
            } else {
               var10000 = arg0.charAt(var9);
            }

            while(true) {
               label169: {
                  char var10 = var10000;
                  if (~var9 == -1) {
                     if (~var10 == -46) {
                        var5 = true;
                        if (!var4) {
                           ++var9;
                           break label169;
                        }
                     }

                     if (var10 == '+' && arg3 && !var4) {
                        ++var9;
                        break label169;
                     }
                  }

                  int var11;
                  int var14;
                  if (~var10 <= -49 && ~var10 >= -58) {
                     var14 = var10 - '0';
                     if (arg1 <= var14) {
                        return false;
                     }

                     if (var5) {
                        var14 = -var14;
                     }

                     var11 = arg1 * var7 + var14;
                     if (~(var11 / arg1) != ~var7) {
                        return false;
                     }

                     var7 = var11;
                     var6 = 1;
                     ++var9;
                  } else {
                     if (var10 >= 'A') {
                        if (var10 > 'Z') {
                           if (var10 < 'a' || var10 > 'z') {
                              break;
                           }

                           var14 = var10 - 'W';
                           if (var4) {
                              var14 -= 55;
                              if (var4) {
                                 var14 -= 48;
                              }
                           }
                        } else {
                           var14 = var10 - '7';
                           if (var4) {
                              var14 -= 48;
                           }
                        }
                     } else {
                        if (var10 < 'a' || var10 > 'z') {
                           break;
                        }

                        var14 = var10 - 'W';
                        if (var4) {
                           var14 -= 55;
                           if (var4) {
                              var14 -= 48;
                           }
                        }
                     }

                     if (arg1 <= var14) {
                        return false;
                     }

                     if (var5) {
                        var14 = -var14;
                     }

                     var11 = arg1 * var7 + var14;
                     if (~(var11 / arg1) != ~var7) {
                        return false;
                     }

                     var7 = var11;
                     var6 = 1;
                     ++var9;
                  }
               }

               if (~var8 >= ~var9) {
                  var10000 = (char)var6;
                  if (!var4) {
                     return (boolean)var6;
                  }
               } else {
                  var10000 = arg0.charAt(var9);
               }
            }

            return false;
         } else {
            throw new IllegalArgumentException(field4913[4] + arg1);
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field4913[2] + (arg0 != null ? field4913[3] : field4913[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!u",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2635(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!u",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2636(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 3;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
