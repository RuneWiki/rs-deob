import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class24 {
   @OriginalMember(
      owner = "client!jg",
      name = "b",
      descriptor = "Lda;"
   )
   public class216 field347 = null;
   @OriginalMember(
      owner = "client!jg",
      name = "d",
      descriptor = "Lwm;"
   )
   public class440 field350 = null;
   @OriginalMember(
      owner = "client!jg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field351 = new String[]{method314(method313("\u00191gO")), method314(method313("\u001d#%\u001f*\u0019-\u007f\u001dk")), method314(method313("\fj%\r>")), method314(method313(">*}B/\u001e +Q\"\u0013-s\u0019")), method314(method313("\u001d#%bk")), method314(method313("\u001d#%ak"))};
   @OriginalMember(
      owner = "client!jg",
      name = "c",
      descriptor = "I"
   )
   public static int field344 = -1;
   @OriginalMember(
      owner = "client!jg",
      name = "e",
      descriptor = "[Lol;"
   )
   public static class180[] field345 = new class180[50];
   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field348 = false;
   @OriginalMember(
      owner = "client!jg",
      name = "f",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field349 = new String[100];
   @OriginalMember(
      owner = "client!jg",
      name = "g",
      descriptor = "I"
   )
   public static int field346;

   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method311(int arg0) {
      try {
         field349 = null;
         int var1 = -17 % ((arg0 - -58) / 46);
         field345 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field351[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "(Ljava/lang/String;IZI)I"
   )
   public static final int method312(String arg0, int arg1, boolean arg2, int arg3) {
      boolean var4 = client.field10022;

      try {
         ++field346;
         if (arg1 >= 2 && ~arg1 >= -37) {
            boolean var5 = false;
            byte var6 = 0;
            int var7 = 0;
            int var8 = arg0.length();
            if (arg3 != -37) {
               field348 = true;
            }

            int var9 = 0;
            char var10000;
            if (var4) {
               var10000 = arg0.charAt(var9);
            } else if (var9 >= var8) {
               var10000 = (char)var6;
               if (!var4) {
                  if (var6 == 0) {
                     throw new NumberFormatException();
                  }

                  return var7;
               }
            } else {
               var10000 = arg0.charAt(var9);
            }

            while(true) {
               label177: {
                  char var10 = var10000;
                  if (~var9 == -1) {
                     if (~var10 == -46) {
                        var5 = true;
                        if (!var4) {
                           ++var9;
                           break label177;
                        }
                     }

                     if (var10 == '+' && arg2 && !var4) {
                        ++var9;
                        break label177;
                     }
                  }

                  int var14;
                  if (~var10 <= -49) {
                     if (var10 > '9') {
                        if (var10 >= 'A') {
                           if (~var10 < -91) {
                              if (var10 < 'a' || var10 > 'z') {
                                 break;
                              }

                              var14 = var10 - 'W';
                              if (var4) {
                                 break;
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
                              break;
                           }
                        }
                     } else {
                        var14 = var10 - '0';
                     }
                  } else if (var10 >= 'A') {
                     if (~var10 < -91) {
                        if (var10 < 'a' || var10 > 'z') {
                           break;
                        }

                        var14 = var10 - 'W';
                        if (var4) {
                           break;
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
                        break;
                     }
                  }

                  if (~var14 <= ~arg1) {
                     throw new NumberFormatException();
                  }

                  if (var5) {
                     var14 = -var14;
                  }

                  int var11 = arg1 * var7 + var14;
                  if (var11 / arg1 != var7) {
                     throw new NumberFormatException();
                  }

                  var6 = 1;
                  var7 = var11;
                  ++var9;
               }

               if (var9 >= var8) {
                  var10000 = (char)var6;
                  if (!var4) {
                     if (var6 == 0) {
                        throw new NumberFormatException();
                     }

                     return var7;
                  }
               } else {
                  var10000 = arg0.charAt(var9);
               }
            }

            throw new NumberFormatException();
         } else {
            throw new IllegalArgumentException(field351[3] + arg1);
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field351[4] + (arg0 != null ? field351[2] : field351[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jg",
      name = "<init>",
      descriptor = "(Lda;)V"
   )
   public class24(class216 arg0) {
      try {
         this.field347 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field351[1] + (arg0 != null ? field351[2] : field351[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jg",
      name = "<init>",
      descriptor = "(Lda;Lwm;)V"
   )
   public class24(class216 arg0, class440 arg1) {
      try {
         this.field347 = arg0;
         this.field350 = arg1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field351[1] + (arg0 != null ? field351[2] : field351[0]) + ',' + (arg1 != null ? field351[2] : field351[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method313(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method314(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
