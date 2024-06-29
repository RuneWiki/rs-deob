import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class73 {
   @OriginalMember(
      owner = "client!wc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field902 = new String[]{method706(method705("\u0000J\u0019jq")), method706(method705("\u0019\\[D")), method706(method705("\f\u0007\u0019\u0006$")), method706(method705("\u0000J\u0019iq")), method706(method705("\u0000J\u0019kq"))};
   @OriginalMember(
      owner = "client!wc",
      name = "f",
      descriptor = "Lbga;"
   )
   public static class378 field895 = new class378(94, 7);
   @OriginalMember(
      owner = "client!wc",
      name = "c",
      descriptor = "Lafa;"
   )
   public static class365 field897 = new class365(3, 2);
   @OriginalMember(
      owner = "client!wc",
      name = "b",
      descriptor = "Lbga;"
   )
   public static class378 field898 = new class378(28, 3);
   @OriginalMember(
      owner = "client!wc",
      name = "g",
      descriptor = "I"
   )
   public static int field899 = 13156520;
   @OriginalMember(
      owner = "client!wc",
      name = "h",
      descriptor = "Z"
   )
   public static boolean field901 = false;
   @OriginalMember(
      owner = "client!wc",
      name = "a",
      descriptor = "I"
   )
   public static int field893;
   @OriginalMember(
      owner = "client!wc",
      name = "e",
      descriptor = "I"
   )
   public static int field894;
   @OriginalMember(
      owner = "client!wc",
      name = "i",
      descriptor = "Lfv;"
   )
   public static class131 field896;
   @OriginalMember(
      owner = "client!wc",
      name = "d",
      descriptor = "[Ls;"
   )
   public static class295[] field900;

   @OriginalMember(
      owner = "client!wc",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method702(byte arg0) {
      try {
         field896 = null;
         field897 = null;
         if (arg0 < -100) {
            field898 = null;
            field895 = null;
            field900 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field902[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wc",
      name = "a",
      descriptor = "(Lqh;I)V"
   )
   public static final void method703(class74 arg0, int arg1) {
      try {
         class710.field10423 = 0;
         class505.field6921 = 0;
         ++field894;
         class650.field9113 = new class411();
         class421.field5900 = new class448[1024];
         class656.field9177 = new class672[class39.field455[class366.field5166] + arg1];
         class519.field7116 = 0;
         class456.field6252 = 0;
         class794.method5723(arg1 + -2, arg0);
         class623.method4529(arg0, -1);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field902[0] + (arg0 != null ? field902[2] : field902[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wc",
      name = "a",
      descriptor = "(CI)C"
   )
   public static final char method704(char arg0, int arg1) {
      try {
         ++field893;
         if (arg1 != 202) {
            field901 = true;
         }

         if (~arg0 != -33 && ~arg0 != -161 && arg0 != '_' && ~arg0 != -46) {
            if (~arg0 != -92 && arg0 != ']' && arg0 != '#') {
               if (arg0 != 224 && ~arg0 != -226 && arg0 != 226 && ~arg0 != -229 && arg0 != 227 && ~arg0 != -193 && arg0 != 193 && ~arg0 != -195 && ~arg0 != -197 && ~arg0 != -196) {
                  if (~arg0 != -233 && ~arg0 != -234 && ~arg0 != -235 && arg0 != 235 && ~arg0 != -201 && ~arg0 != -202 && arg0 != 202 && arg0 != 203) {
                     if (~arg0 != -238 && ~arg0 != -239 && arg0 != 239 && arg0 != 205 && arg0 != 206 && ~arg0 != -208) {
                        if (arg0 != 242 && ~arg0 != -244 && arg0 != 244 && arg0 != 246 && ~arg0 != -246 && arg0 != 210 && arg0 != 211 && arg0 != 212 && ~arg0 != -215 && ~arg0 != -214) {
                           if (arg0 != 249 && arg0 != 250 && arg0 != 251 && arg0 != 252 && ~arg0 != -218 && ~arg0 != -219 && arg0 != 219 && ~arg0 != -221) {
                              if (~arg0 != -232 && ~arg0 != -200) {
                                 if (~arg0 != -256 && arg0 != 376) {
                                    if (arg0 != 241 && arg0 != 209) {
                                       if (arg0 != 223) {
                                          return Character.toLowerCase(arg0);
                                       } else if (!client.field4273) {
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
         throw class534.method3846(var4, field902[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method705(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method706(char[] arg0) {
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
            var10005 = 41;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
