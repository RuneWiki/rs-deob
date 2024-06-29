import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class387 {
   @OriginalMember(
      owner = "client!bfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5921 = new String[]{method2973(method2972("g*LV<-")), method2973(method2972("g*LV=-"))};
   @OriginalMember(
      owner = "client!bfa",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field5916 = false;
   @OriginalMember(
      owner = "client!bfa",
      name = "e",
      descriptor = "I"
   )
   public static int field5917;
   @OriginalMember(
      owner = "client!bfa",
      name = "c",
      descriptor = "I"
   )
   public static int field5919;
   @OriginalMember(
      owner = "client!bfa",
      name = "f",
      descriptor = "I"
   )
   public static int field5920;
   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "Lqja;"
   )
   public static class325 field5915;
   @OriginalMember(
      owner = "client!bfa",
      name = "d",
      descriptor = "[Lat;"
   )
   public static class396[] field5918;

   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2969(boolean arg0) {
      try {
         if (!arg0) {
            field5916 = true;
         }

         field5918 = null;
         field5915 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5921[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "(CZ)C"
   )
   public static final char method2970(char arg0, boolean arg1) {
      try {
         if (!arg1) {
            field5919 = 47;
         }

         ++field5920;
         if (arg0 != ' ' && arg0 != 160 && arg0 != '_' && ~arg0 != -46) {
            if (~arg0 != -92 && ~arg0 != -94 && arg0 != '#') {
               if (~arg0 != -225 && ~arg0 != -226 && arg0 != 226 && arg0 != 228 && arg0 != 227 && arg0 != 192 && ~arg0 != -194 && arg0 != 194 && arg0 != 196 && ~arg0 != -196) {
                  if (arg0 != 232 && ~arg0 != -234 && ~arg0 != -235 && ~arg0 != -236 && arg0 != 200 && ~arg0 != -202 && arg0 != 202 && ~arg0 != -204) {
                     if (arg0 != 237 && ~arg0 != -239 && arg0 != 239 && ~arg0 != -206 && ~arg0 != -207 && ~arg0 != -208) {
                        if (arg0 != 242 && ~arg0 != -244 && arg0 != 244 && ~arg0 != -247 && ~arg0 != -246 && arg0 != 210 && arg0 != 211 && arg0 != 212 && ~arg0 != -215 && ~arg0 != -214) {
                           if (arg0 != 249 && arg0 != 250 && ~arg0 != -252 && ~arg0 != -253 && arg0 != 217 && arg0 != 218 && arg0 != 219 && arg0 != 220) {
                              if (arg0 != 231 && ~arg0 != -200) {
                                 if (arg0 != 255 && arg0 != 376) {
                                    if (~arg0 != -242 && ~arg0 != -210) {
                                       if (~arg0 != -224) {
                                          return Character.toLowerCase(arg0);
                                       } else if (client.field4530 == 0) {
                                          return 'b';
                                       } else {
                                          return '_';
                                       }
                                    } else {
                                       return 'n';
                                    }
                                 } else {
                                    return 'y';
                                 }
                              } else {
                                 return 'c';
                              }
                           } else {
                              return 'u';
                           }
                        } else {
                           return 'o';
                        }
                     } else {
                        return 'i';
                     }
                  } else {
                     return 'e';
                  }
               } else {
                  return 'a';
               }
            } else {
               return arg0;
            }
         } else {
            return '_';
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5921[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "([Lvs;II)V"
   )
   public static final void method2971(class616[] arg0, int arg1, int arg2) {
      if (arg1 < arg2) {
         int var3 = (arg1 + arg2) / 2;
         int var4 = arg1;
         class616 var5 = arg0[var3];
         arg0[var3] = arg0[arg2];
         arg0[arg2] = var5;
         int var6 = var5.field9000;

         for(int var7 = arg1; var7 < arg2; ++var7) {
            if (arg0[var7].field9000 < (var7 & 1) + var6) {
               class616 var8 = arg0[var7];
               arg0[var7] = arg0[var4];
               arg0[var4++] = var8;
            }
         }

         arg0[arg2] = arg0[var4];
         arg0[var4] = var5;
         method2971(arg0, arg1, var4 - 1);
         method2971(arg0, var4 + 1, arg2);
      }

   }

   @OriginalMember(
      owner = "client!bfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2972(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 127);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2973(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 5;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 127;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
