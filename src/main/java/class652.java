import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class652 {
   @OriginalMember(
      owner = "client!paa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9560 = new String[]{method4783(method4782("f-Hd^>")), method4783(method4782("f-HdZ>")), method4783(method4782("mb\u0007de")), method4783(method4782("f-Hd]>")), method4783(method4782("x9E&")), method4783(method4782("f-Hd\\>")), method4783(method4782("f-Hd[>")), method4783(method4782("f-HdY>"))};
   @OriginalMember(
      owner = "client!paa",
      name = "d",
      descriptor = "Lek;"
   )
   public static class536 field9554 = new class536(69, 16);
   @OriginalMember(
      owner = "client!paa",
      name = "f",
      descriptor = "I"
   )
   public static int field9559 = 0;
   @OriginalMember(
      owner = "client!paa",
      name = "h",
      descriptor = "I"
   )
   public static int field9552;
   @OriginalMember(
      owner = "client!paa",
      name = "a",
      descriptor = "I"
   )
   public static int field9553;
   @OriginalMember(
      owner = "client!paa",
      name = "e",
      descriptor = "I"
   )
   public static int field9555;
   @OriginalMember(
      owner = "client!paa",
      name = "b",
      descriptor = "I"
   )
   public static int field9557;
   @OriginalMember(
      owner = "client!paa",
      name = "g",
      descriptor = "I"
   )
   public static int field9558;
   @OriginalMember(
      owner = "client!paa",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field9556;

   @OriginalMember(
      owner = "client!paa",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method4776(byte arg0, int arg1) {
      try {
         int var2 = 104 / ((82 - arg0) / 32);
         ++field9552;
         class755 var3 = class317.method2325((long)arg1, 101, 6);
         var3.method5481(-128);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field9560[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public static final void method4777(boolean arg0, boolean arg1) {
      try {
         ++field9557;
         if (class660.field9618 == null) {
            class380.method2869(true);
         }

         if (arg0) {
            class660.field9618.method5429((byte)96);
         }

         if (!arg1) {
            field9556 = null;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9560[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "a",
      descriptor = "(ILjava/lang/String;)J"
   )
   public static final long method4778(int arg0, String arg1) {
      boolean var2 = client.field4360;

      try {
         ++field9558;
         long var3 = 0L;
         int var5 = arg1.length();
         int var6 = 0;
         int var10000;
         long var10;
         if (var2) {
            var3 *= 37L;
            var10000 = arg1.charAt(var6);
         } else if (var5 <= var6) {
            var10000 = arg0;
            if (!var2) {
               if (arg0 >= -7) {
                  return -102L;
               }

               while(true) {
                  if (var3 % 37L == 0L) {
                     var10 = var3;
                     if (var2) {
                        break;
                     }

                     if (var3 != 0L) {
                        var3 /= 37L;
                        continue;
                     }
                  }

                  var10 = var3;
                  break;
               }

               return var10;
            }
         } else {
            var3 *= 37L;
            var10000 = arg1.charAt(var6);
         }

         do {
            while(true) {
               int var7 = var10000;
               if (var7 >= 65 && ~var7 >= -91) {
                  var3 += (long)(var7 + 1 - 65);
               } else if (var7 >= 97) {
                  if (var7 > 122) {
                     if (var7 >= 48 && var7 <= 57) {
                        var3 += (long)(var7 - 48 + 27);
                        if (var2) {
                           var3 += (long)(var7 + 1 + -97);
                           if (var2) {
                              var3 += (long)(var7 + 1 - 65);
                           }
                        }
                     }
                  } else {
                     var3 += (long)(var7 + 1 + -97);
                     if (var2) {
                        var3 += (long)(var7 + 1 - 65);
                     }
                  }
               } else if (var7 >= 48 && var7 <= 57) {
                  var3 += (long)(var7 - 48 + 27);
                  if (var2) {
                     var3 += (long)(var7 + 1 + -97);
                     if (var2) {
                        var3 += (long)(var7 + 1 - 65);
                     }
                  }
               }

               if (var3 >= 177917621779460413L) {
                  if (!var2) {
                     var10000 = arg0;
                     break;
                  }

                  ++var6;
               } else {
                  ++var6;
               }

               if (var5 <= var6) {
                  var10000 = arg0;
                  if (!var2) {
                     if (arg0 >= -7) {
                        return -102L;
                     }

                     while(true) {
                        if (var3 % 37L == 0L) {
                           var10 = var3;
                           if (var2) {
                              break;
                           }

                           if (var3 != 0L) {
                              var3 /= 37L;
                              continue;
                           }
                        }

                        var10 = var3;
                        break;
                     }

                     return var10;
                  }
               } else {
                  var3 *= 37L;
                  var10000 = arg1.charAt(var6);
               }
            }
         } while(var2);

         if (arg0 >= -7) {
            return -102L;
         } else {
            while(true) {
               if (var3 % 37L == 0L) {
                  var10 = var3;
                  if (var2) {
                     break;
                  }

                  if (var3 != 0L) {
                     var3 /= 37L;
                     continue;
                  }
               }

               var10 = var3;
               break;
            }

            return var10;
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field9560[3] + arg0 + ',' + (arg1 != null ? field9560[2] : field9560[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public static final boolean method4779(int arg0, int arg1, byte arg2) {
      try {
         if (arg2 > -90) {
            method4778(-38, (String)null);
         }

         ++field9553;
         return (class753.method5461(true, arg1, arg0) | class108.method879(arg0, 105, arg1) | class137.method1081(arg1, arg0, (byte)-30)) & class348.method2545(arg1, true, arg0);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9560[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4780(int arg0) {
      try {
         int var1 = 116 / ((arg0 - -53) / 37);
         field9556 = null;
         field9554 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9560[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "a",
      descriptor = "(Z)Z"
   )
   public static final boolean method4781(boolean arg0) {
      try {
         ++field9555;

         try {
            class343 var1 = new class343();
            byte[] var2 = var1.method2516((byte)-99, class418.field6005);
            class755.method5478(arg0, var2);
            return true;
         } catch (Exception var4) {
            return false;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field9560[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4782(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!paa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4783(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 41;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
