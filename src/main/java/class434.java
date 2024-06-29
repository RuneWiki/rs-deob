import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ija")
public class class434 extends class539 {
   @OriginalMember(
      owner = "client!ija",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6365 = new String[]{method3388(method3387("p9{]\u0012")), method3388(method3387("b}4].#")), method3388(method3387("+DoS")), method3388(method3387("eb9\u001f"))};
   @OriginalMember(
      owner = "client!ija",
      name = "f",
      descriptor = "I"
   )
   public static int field6363 = -1;
   @OriginalMember(
      owner = "client!ija",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field6364 = false;
   @OriginalMember(
      owner = "client!ija",
      name = "h",
      descriptor = "I"
   )
   public static int field6362;

   @OriginalMember(
      owner = "client!ija",
      name = "a",
      descriptor = "(IIILhf;)Lffa;"
   )
   public static final class248 method3386(int arg0, int arg1, int arg2, class198 arg3) {
      try {
         ++field6362;
         int var4 = arg3.field2869 | arg1 << 10;
         class248 var5 = (class248)class798.field11597.method78(0, (long)var4 << 16);
         if (var5 != null) {
            return var5;
         } else {
            byte[] var6 = class577.field8143.method449(class577.field8143.method461(var4, arg2 ^ -1818584914), (byte)-62);
            if (var6 != null) {
               if (var6.length <= 1) {
                  return null;
               } else {
                  class248 var7;
                  try {
                     var7 = class172.method1593(var6, (byte)-68);
                  } catch (Exception var20) {
                     throw new RuntimeException(var20.getMessage() + field6365[2] + var4);
                  }

                  var7.field3797 = arg3;
                  class798.field11597.method73((byte)108, (long)var4 << 16, var7);
                  return var7;
               }
            } else {
               int var9 = arg3.field2869 | arg0 + 65536 << 10;
               class248 var10 = (class248)class798.field11597.method78(0, (long)var9 << 16);
               if (var10 != null) {
                  return var10;
               } else {
                  byte[] var11 = class577.field8143.method449(class577.field8143.method461(var9, 27070), (byte)-62);
                  if (var11 != null) {
                     if (var11.length <= 1) {
                        return null;
                     } else {
                        class248 var12;
                        try {
                           var12 = class172.method1593(var11, (byte)46);
                        } catch (Exception var21) {
                           throw new RuntimeException(var21.getMessage() + field6365[2] + var9);
                        }

                        var12.field3797 = arg3;
                        class798.field11597.method73((byte)108, (long)var9 << 16, var12);
                        return var12;
                     }
                  } else {
                     int var14 = 67107840 | arg3.field2869;
                     if (arg2 != -1818562288) {
                        return null;
                     } else {
                        class248 var15 = (class248)class798.field11597.method78(0, (long)var14 << 16);
                        if (var15 != null) {
                           return var15;
                        } else {
                           byte[] var16 = class577.field8143.method449(class577.field8143.method461(var14, 27070), (byte)-62);
                           if (var16 != null) {
                              if (var16.length <= 1) {
                                 return null;
                              } else {
                                 class248 var17;
                                 try {
                                    var17 = class172.method1593(var16, (byte)-96);
                                 } catch (Exception var22) {
                                    throw new RuntimeException(var22.getMessage() + field6365[2] + var14);
                                 }

                                 var17.field3797 = arg3;
                                 class798.field11597.method73((byte)108, (long)var14 << 16, var17);
                                 return var17;
                              }
                           } else {
                              return null;
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var23) {
         throw class612.method4503(var23, field6365[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6365[0] : field6365[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ija",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3387(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 111);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ija",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3388(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 11;
            break;
         case 1:
            var10005 = 23;
            break;
         case 2:
            var10005 = 85;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 111;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
