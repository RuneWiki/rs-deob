import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class333 {
   @OriginalMember(
      owner = "client!aj",
      name = "c",
      descriptor = "Luda;"
   )
   private class478 field4541;
   @OriginalMember(
      owner = "client!aj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4547 = new String[]{method2469(method2468("'m%JX")), method2469(method2468("'m%KX")), method2469(method2468("'m%HX")), method2469(method2468("'m%LX")), method2469(method2468("'m%MX")), method2469(method2468("(rge")), method2469(method2468("=)%'\r")), method2469(method2468("'m%5\u0019(n\u007f7X"))};
   @OriginalMember(
      owner = "client!aj",
      name = "f",
      descriptor = "I"
   )
   public static int field4539;
   @OriginalMember(
      owner = "client!aj",
      name = "d",
      descriptor = "I"
   )
   public static int field4542;
   @OriginalMember(
      owner = "client!aj",
      name = "h",
      descriptor = "I"
   )
   public static int field4543;
   @OriginalMember(
      owner = "client!aj",
      name = "e",
      descriptor = "I"
   )
   public static int field4544;
   @OriginalMember(
      owner = "client!aj",
      name = "g",
      descriptor = "I"
   )
   public static int field4545;
   @OriginalMember(
      owner = "client!aj",
      name = "b",
      descriptor = "Lwe;"
   )
   public static class431 field4546;
   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "Lsga;"
   )
   private class76 field4540;

   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "(IC)C"
   )
   public static final char method2463(int arg0, char arg1) {
      try {
         ++field4542;
         if (arg0 != 26963) {
            return 'P';
         } else if (~arg1 != -33 && ~arg1 != -161 && ~arg1 != -96 && ~arg1 != -46) {
            if (~arg1 != -92 && ~arg1 != -94 && ~arg1 != -36) {
               if (arg1 != 224 && ~arg1 != -226 && ~arg1 != -227 && ~arg1 != -229 && arg1 != 227 && arg1 != 192 && arg1 != 193 && ~arg1 != -195 && arg1 != 196 && arg1 != 195) {
                  if (~arg1 != -233 && arg1 != 233 && ~arg1 != -235 && ~arg1 != -236 && arg1 != 200 && arg1 != 201 && ~arg1 != -203 && ~arg1 != -204) {
                     if (~arg1 != -238 && ~arg1 != -239 && arg1 != 239 && ~arg1 != -206 && ~arg1 != -207 && arg1 != 207) {
                        if (~arg1 != -243 && arg1 != 243 && ~arg1 != -245 && ~arg1 != -247 && ~arg1 != -246 && arg1 != 210 && arg1 != 211 && arg1 != 212 && arg1 != 214 && arg1 != 213) {
                           if (arg1 != 249 && arg1 != 250 && arg1 != 251 && arg1 != 252 && arg1 != 217 && ~arg1 != -219 && ~arg1 != -220 && arg1 != 220) {
                              if (~arg1 != -232 && arg1 != 199) {
                                 if (~arg1 != -256 && arg1 != 376) {
                                    if (arg1 != 241 && arg1 != 209) {
                                       if (arg1 != 223) {
                                          return Character.toLowerCase(arg1);
                                       } else if (!client.field4360) {
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
               return arg1;
            }
         } else {
            return '_';
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4547[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method2464(int arg0, int arg1, int arg2) {
      try {
         ++field4545;
         if (arg1 != 32) {
            return false;
         } else {
            return ~(32 & arg0) != -1;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4547[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "(B)Lsga;"
   )
   public final class76 method2465(byte arg0) {
      try {
         ++field4543;
         class76 var2 = this.field4540;
         if (this.field4541.field6868 == var2) {
            this.field4540 = null;
            return null;
         } else {
            if (arg0 != 16) {
               this.method2467(77);
            }

            this.field4540 = var2.field950;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4547[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2466(boolean arg0) {
      try {
         if (!arg0) {
            method2466(true);
         }

         field4546 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4547[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "<init>",
      descriptor = "()V"
   )
   public class333() {
   }

   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "(I)Lsga;"
   )
   public final class76 method2467(int arg0) {
      try {
         ++field4544;
         if (arg0 != 214) {
            field4539 = 66;
         }

         class76 var2 = this.field4541.field6868.field950;
         if (this.field4541.field6868 == var2) {
            this.field4540 = null;
            return null;
         } else {
            this.field4540 = var2.field950;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4547[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "<init>",
      descriptor = "(Luda;)V"
   )
   public class333(class478 arg0) {
      try {
         this.field4541 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4547[7] + (arg0 != null ? field4547[6] : field4547[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2468(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2469(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 70;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
