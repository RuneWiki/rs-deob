import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class312 {
   @OriginalMember(
      owner = "client!gaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4496 = new String[]{method2428(method2427("&3\t=Li")), method2428(method2427("\b<\u001erb(6Hao%;\u0010)")), method2428(method2427(":|F=s")), method2428(method2427("&3\t=Oi")), method2428(method2427("/'\u0004\u007f"))};
   @OriginalMember(
      owner = "client!gaa",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field4491 = new int[]{1, 4, 1, 2};
   @OriginalMember(
      owner = "client!gaa",
      name = "a",
      descriptor = "Ljfa;"
   )
   public static class303 field4495 = null;
   @OriginalMember(
      owner = "client!gaa",
      name = "c",
      descriptor = "I"
   )
   public static int field4488;
   @OriginalMember(
      owner = "client!gaa",
      name = "f",
      descriptor = "I"
   )
   public int field4490;
   @OriginalMember(
      owner = "client!gaa",
      name = "b",
      descriptor = "I"
   )
   public int field4493;
   @OriginalMember(
      owner = "client!gaa",
      name = "d",
      descriptor = "I"
   )
   public int field4494;
   @OriginalMember(
      owner = "client!gaa",
      name = "h",
      descriptor = "Z"
   )
   public boolean field4489;
   @OriginalMember(
      owner = "client!gaa",
      name = "e",
      descriptor = "Z"
   )
   public boolean field4492;

   @OriginalMember(
      owner = "client!gaa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2425(int arg0) {
      try {
         if (arg0 != 48) {
            method2425(91);
         }

         field4491 = null;
         field4495 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4496[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gaa",
      name = "a",
      descriptor = "(ZILjava/lang/String;Z)Z"
   )
   public static final boolean method2426(boolean arg0, int arg1, String arg2, boolean arg3) {
      boolean var4 = client.field4564;

      try {
         ++field4488;
         if (~arg1 <= -3 && ~arg1 >= -37) {
            boolean var5 = false;
            byte var6 = arg0;
            int var7 = 0;
            int var8 = arg2.length();
            int var9 = 0;
            char var10000;
            if (var4) {
               var10000 = arg2.charAt(var9);
            } else if (var8 <= var9) {
               var10000 = (char)arg0;
               if (!var4) {
                  return (boolean)arg0;
               }
            } else {
               var10000 = arg2.charAt(var9);
            }

            while(true) {
               label149: {
                  char var10 = var10000;
                  if (~var9 == -1) {
                     if (~var10 == -46) {
                        var5 = true;
                        if (!var4) {
                           ++var9;
                           break label149;
                        }
                     }

                     if (var10 == '+' && arg3 && !var4) {
                        ++var9;
                        break label149;
                     }
                  }

                  int var14;
                  if (~var10 <= -49 && var10 <= '9') {
                     var14 = var10 - '0';
                  } else if (var10 >= 'A') {
                     if (~var10 >= -91) {
                        var14 = var10 - '7';
                        if (var4) {
                           if (var14 < 97 || ~var14 < -123) {
                              break;
                           }

                           var14 -= 87;
                           if (var4) {
                              break;
                           }
                        }
                     } else {
                        if (var10 < 'a' || ~var10 < -123) {
                           break;
                        }

                        var14 = var10 - 'W';
                        if (var4) {
                           break;
                        }
                     }
                  } else {
                     if (var10 < 'a' || ~var10 < -123) {
                        break;
                     }

                     var14 = var10 - 'W';
                     if (var4) {
                        break;
                     }
                  }

                  if (~arg1 >= ~var14) {
                     return false;
                  }

                  if (var5) {
                     var14 = -var14;
                  }

                  int var11 = arg1 * var7 + var14;
                  if (~(var11 / arg1) != ~var7) {
                     return false;
                  }

                  var6 = 1;
                  var7 = var11;
                  ++var9;
               }

               if (var8 <= var9) {
                  var10000 = (char)var6;
                  if (!var4) {
                     return (boolean)var6;
                  }
               } else {
                  var10000 = arg2.charAt(var9);
               }
            }

            return false;
         } else {
            throw new IllegalArgumentException(field4496[1] + arg1);
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field4496[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4496[2] : field4496[4]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2427(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2428(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
