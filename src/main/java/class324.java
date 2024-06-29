import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class324 {
   @OriginalMember(
      owner = "client!gd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4940 = new String[]{method2655(method2654("SYsj5")), method2655(method2654("ZH1C")), method2655(method2654("SYsl5")), method2655(method2654("O\u0013s\u0001`")), method2655(method2654("SYsk5")), method2655(method2654("SYsm5")), method2655(method2654("SYsn5"))};
   @OriginalMember(
      owner = "client!gd",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field4938 = new int[4096];
   @OriginalMember(
      owner = "client!gd",
      name = "e",
      descriptor = "Lnaa;"
   )
   public static class113 field4934 = new class113(30, -1);
   @OriginalMember(
      owner = "client!gd",
      name = "c",
      descriptor = "I"
   )
   public static int field4933;
   @OriginalMember(
      owner = "client!gd",
      name = "f",
      descriptor = "I"
   )
   public static int field4935;
   @OriginalMember(
      owner = "client!gd",
      name = "g",
      descriptor = "I"
   )
   public static int field4936;
   @OriginalMember(
      owner = "client!gd",
      name = "d",
      descriptor = "I"
   )
   public static int field4937;
   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "I"
   )
   public static int field4939;

   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "(IZ)I",
      line = 3
   )
   public static final int method2649(int arg0, boolean arg1) {
      try {
         if (arg1) {
            method2650(-18, (String)null);
         }

         ++field4936;
         return ~arg0 == -16711936 ? -1 : class214.method1866(arg0, (byte)-122);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4940[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "(ILjava/lang/String;)I",
      line = 17
   )
   public static final int method2650(int arg0, String arg1) {
      boolean var2 = client.field1786;

      try {
         ++field4935;
         if (!class357.field5519.field4556) {
            return -1;
         } else if (class552.field8262.containsKey(arg1)) {
            return 100;
         } else {
            String var3 = class4.method17((byte)-106, arg1);
            if (var3 == null) {
               return -1;
            } else if (arg0 != -1) {
               return -107;
            } else {
               String var4 = class363.field5622 + var3;
               if (!class355.field5473.method5024("", var4, arg0 ^ 98)) {
                  return -1;
               } else if (!class355.field5473.method5009(var4, 29704)) {
                  return class355.field5473.method5012((byte)34, var4);
               } else {
                  byte[] var5 = class355.field5473.method5023("", var4, 0);
                  Object var6 = null;

                  File var7;
                  try {
                     var7 = class641.method4678(false, var3);
                  } catch (RuntimeException var12) {
                     return -1;
                  }

                  if (var5 != null && var7 != null) {
                     boolean var8;
                     label95: {
                        var8 = true;
                        byte[] var9 = class397.method3204(var7, (byte)61);
                        if (var9 != null && ~var5.length == ~var9.length) {
                           int var10 = 0;
                           if (var2) {
                              if (~var5[var10] != ~var9[var10]) {
                                 var8 = false;
                                 if (!var2) {
                                    break label95;
                                 }
                              }

                              ++var10;
                           }

                           while(true) {
                              while(~var9.length < ~var10) {
                                 if (~var5[var10] != ~var9[var10]) {
                                    var8 = false;
                                    if (!var2) {
                                       break label95;
                                    }
                                 }

                                 ++var10;
                              }

                              if (!var2) {
                                 if (!var2) {
                                    break label95;
                                 }
                                 break;
                              }

                              ++var10;
                           }
                        }

                        var8 = false;
                     }

                     try {
                        if (!var8) {
                           class357.field5519.method2439(var5, -79, var7);
                        }
                     } catch (Throwable var13) {
                        return -1;
                     }

                     class728.method5372(var7, true, arg1);
                     return 100;
                  } else {
                     return -1;
                  }
               }
            }
         }
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field4940[4] + arg0 + ',' + (arg1 != null ? field4940[3] : field4940[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "(ZLjava/lang/String;)I",
      line = 110
   )
   public static final int method2651(boolean arg0, String arg1) {
      try {
         ++field4933;
         int var2 = arg1.length();
         int var3 = 0;
         int var4 = 0;
         if (!arg0) {
            field4938 = null;
         }

         while(~var2 < ~var4) {
            var3 = class671.method4939(arg1.charAt(var4), -110) + (var3 << 5) + -var3;
            ++var4;
         }

         return var3;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4940[2] + arg0 + ',' + (arg1 != null ? field4940[3] : field4940[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "(Ltha;Ltha;I)V",
      line = 139
   )
   public static final void method2652(class297 arg0, class297 arg1, int arg2) {
      try {
         if (arg1.field4679 != null) {
            arg1.method2495(-24134);
         }

         ++field4939;
         arg1.field4679 = arg0.field4679;
         if (arg2 != 0) {
            method2651(false, (String)null);
         }

         arg1.field4682 = arg0;
         arg1.field4679.field4682 = arg1;
         arg1.field4682.field4679 = arg1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4940[6] + (arg0 != null ? field4940[3] : field4940[1]) + ',' + (arg1 != null ? field4940[3] : field4940[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "(I)V",
      line = 172
   )
   public static void method2653(int arg0) {
      try {
         if (arg0 == 12749) {
            field4934 = null;
            field4938 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4940[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2654(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 29);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2655(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 47;
            break;
         default:
            var10005 = 29;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
