import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class427 {
   @OriginalMember(
      owner = "client!pi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6590 = new String[]{method3383(method3382("ERJs}fO\u0016n|R\u0013")), method3383(method3382("ERJF:")), method3383(method3382("N\u0015J)o")), method3383(method3382("[N\bk"))};
   @OriginalMember(
      owner = "client!pi",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field6586 = false;
   @OriginalMember(
      owner = "client!pi",
      name = "b",
      descriptor = "I"
   )
   public static int field6587;
   @OriginalMember(
      owner = "client!pi",
      name = "c",
      descriptor = "I"
   )
   public static int field6588;
   @OriginalMember(
      owner = "client!pi",
      name = "a",
      descriptor = "I"
   )
   public static int field6589;

   @OriginalMember(
      owner = "client!pi",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field6587;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6590[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pi",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;"
   )
   public static final String method3381(String arg0, int arg1) {
      boolean var2 = client.field1786;

      try {
         ++field6588;
         if (arg0 == null) {
            return null;
         } else {
            int var3;
            int var4;
            int var10000;
            label118: {
               var3 = arg1;
               var4 = arg0.length();
               if (var2) {
                  var3 = arg1 + 1;
               }

               label110:
               while(true) {
                  if (var3 < var4) {
                     var10000 = class764.method5594(-119, arg0.charAt(var3));
                     if (!var2) {
                        if (var10000 != 0) {
                           ++var3;
                           continue;
                        }

                        if (var2) {
                           --var4;
                        }

                        var10000 = ~var4;
                     }
                  } else {
                     var10000 = ~var4;
                  }

                  while(true) {
                     if (var10000 >= ~var3) {
                        break label110;
                     }

                     var10000 = class764.method5594(33, arg0.charAt(var4 + -1));
                     if (var2) {
                        break label118;
                     }

                     if (var10000 == 0) {
                        break label110;
                     }

                     --var4;
                     var10000 = ~var4;
                  }
               }

               var10000 = -var3 + var4;
            }

            int var5 = var10000;
            if (var5 >= 1 && var5 <= 12) {
               StringBuffer var6 = new StringBuffer(var5);
               int var7 = var3;
               char var9;
               if (var2) {
                  char var8 = arg0.charAt(var3);
                  if (class83.method806((byte)-91, var8)) {
                     var9 = class518.method4000(var8, -92);
                     if (var9 != 0) {
                        var6.append(var9);
                     }
                  }

                  var7 = var3 + 1;
               }

               while(true) {
                  if (var7 >= var4) {
                     var10000 = var6.length();
                     if (!var2) {
                        if (var10000 == 0) {
                           return null;
                        }

                        return var6.toString();
                     }
                  } else {
                     var10000 = arg0.charAt(var7);
                  }

                  int var12 = var10000;
                  if (class83.method806((byte)-91, (char)var12)) {
                     var9 = class518.method4000((char)var12, -92);
                     if (var9 != 0) {
                        var6.append(var9);
                     }
                  }

                  ++var7;
               }
            } else {
               return null;
            }
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field6590[1] + (arg0 != null ? field6590[2] : field6590[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3382(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3383(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
