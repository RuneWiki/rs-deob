import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hka")
public class class56 {
   @OriginalMember(
      owner = "client!hka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field612 = new String[]{method435(method434("5>-gA")), method435(method434(" eo%")), method435(method434("&{bg}f")), method435(method434("\u0007~u(P't#;]*y{s")), method435(method434("&{bgxf")), method435(method434("&{bg\u007ff")), method435(method434("&{bg~f"))};
   @OriginalMember(
      owner = "client!hka",
      name = "g",
      descriptor = "Ltv;"
   )
   public static class590 field603 = new class590(4);
   @OriginalMember(
      owner = "client!hka",
      name = "f",
      descriptor = "Lod;"
   )
   public static class536 field605 = new class536();
   @OriginalMember(
      owner = "client!hka",
      name = "h",
      descriptor = "[Lam;"
   )
   public static class662[] field608 = new class662[2048];
   @OriginalMember(
      owner = "client!hka",
      name = "b",
      descriptor = "I"
   )
   public static int field606 = 0;
   @OriginalMember(
      owner = "client!hka",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field607 = false;
   @OriginalMember(
      owner = "client!hka",
      name = "e",
      descriptor = "I"
   )
   public static int field610 = 0;
   @OriginalMember(
      owner = "client!hka",
      name = "c",
      descriptor = "I"
   )
   public static int field604;
   @OriginalMember(
      owner = "client!hka",
      name = "i",
      descriptor = "I"
   )
   public static int field609;
   @OriginalMember(
      owner = "client!hka",
      name = "d",
      descriptor = "I"
   )
   public static int field611;

   @OriginalMember(
      owner = "client!hka",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method430(int arg0) {
      try {
         field603 = null;
         field608 = null;
         if (arg0 <= 59) {
            method432((String)null, 70, false, 105);
         }

         field605 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field612[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method431(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != -26347) {
            return true;
         } else {
            ++field611;
            return (65536 & arg1) != 0;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field612[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "a",
      descriptor = "(Ljava/lang/String;IZI)Z"
   )
   public static final boolean method432(String arg0, int arg1, boolean arg2, int arg3) {
      boolean var4 = client.field4273;

      try {
         ++field609;
         if (arg1 != 11203) {
            method430(-113);
         }

         if (~arg3 <= -3 && arg3 <= 36) {
            boolean var5 = false;
            byte var6 = 0;
            int var7 = 0;
            int var8 = arg0.length();
            int var9 = 0;
            char var10000;
            if (var4) {
               var10000 = arg0.charAt(var9);
            } else if (~var9 <= ~var8) {
               var10000 = (char)var6;
               if (!var4) {
                  return (boolean)var6;
               }
            } else {
               var10000 = arg0.charAt(var9);
            }

            while(true) {
               label158: {
                  int var10 = var10000;
                  if (~var9 == -1) {
                     if (var10 == 45) {
                        var5 = true;
                        if (!var4) {
                           ++var9;
                           break label158;
                        }
                     }

                     if (var10 == 43 && arg2 && !var4) {
                        ++var9;
                        break label158;
                     }
                  }

                  int var11;
                  if (var10 >= 48 && ~var10 >= -58) {
                     var10 -= 48;
                     if (!var4) {
                        if (arg3 <= var10) {
                           return false;
                        }

                        if (var5) {
                           var10 = -var10;
                        }

                        var11 = arg3 * var7 + var10;
                        if (var11 / arg3 != var7) {
                           return false;
                        }

                        var6 = 1;
                        var7 = var11;
                        ++var9;
                        break label158;
                     }
                  }

                  if (~var10 <= -66) {
                     if (var10 > 90) {
                        if (var10 < 97 || var10 > 122) {
                           break;
                        }

                        var10 -= 87;
                        if (var4) {
                           break;
                        }
                     } else {
                        var10 -= 55;
                     }
                  } else {
                     if (var10 < 97 || var10 > 122) {
                        break;
                     }

                     var10 -= 87;
                     if (var4) {
                        break;
                     }
                  }

                  if (arg3 <= var10) {
                     return false;
                  }

                  if (var5) {
                     var10 = -var10;
                  }

                  var11 = arg3 * var7 + var10;
                  if (var11 / arg3 != var7) {
                     return false;
                  }

                  var6 = 1;
                  var7 = var11;
                  ++var9;
               }

               if (~var9 <= ~var8) {
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
            throw new IllegalArgumentException(field612[3] + arg3);
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field612[4] + (arg0 != null ? field612[0] : field612[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "a",
      descriptor = "(Lwm;I)Lsj;"
   )
   public static final class488 method433(class594 arg0, int arg1) {
      try {
         if (arg1 != 0) {
            field606 = 26;
         }

         ++field604;
         return new class488(arg0.method4333(-76), arg0.method4333(-56), arg0.method4333(-83), arg0.method4333(arg1 + -83), arg0.method4293(arg1 ^ 120), arg0.method4288((byte)68));
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field612[2] + (arg0 != null ? field612[0] : field612[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method434(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method435(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 16;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 73;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
