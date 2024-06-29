import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kja")
public class class375 extends class22 {
   @OriginalMember(
      owner = "client!kja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5242 = new String[]{method2964(method2963("\f\u0014\u000f'~O")), method2964(method2963("\f\u0014\u000f'\u007fO")), method2964(method2963("\u001cP@'A")), method2964(method2963("\t\u000b\u0002e")), method2964(method2963("\f\u0014\u000f'}O"))};
   @OriginalMember(
      owner = "client!kja",
      name = "f",
      descriptor = "I"
   )
   public static int field5238;
   @OriginalMember(
      owner = "client!kja",
      name = "d",
      descriptor = "I"
   )
   public static int field5239;
   @OriginalMember(
      owner = "client!kja",
      name = "e",
      descriptor = "I"
   )
   public static int field5240;
   @OriginalMember(
      owner = "client!kja",
      name = "c",
      descriptor = "[Lco;"
   )
   public static class664[] field5241;

   @OriginalMember(
      owner = "client!kja",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method2960(int arg0) {
      try {
         class791.field11561.method2948(arg0 ^ -9206);
         if (arg0 == 0) {
            ++field5238;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5242[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(IZILha;)Lrfa;"
   )
   public static final class553 method2961(int arg0, boolean arg1, int arg2, class479 arg3) {
      boolean var4 = client.field1481;

      try {
         ++field5239;
         if (arg0 == -1) {
            return null;
         } else {
            if (class211.field2686 != null) {
               int var5 = 0;
               if (var4 || ~var5 > ~class211.field2686.length) {
                  do {
                     if (class211.field2686[var5] == arg0) {
                        return class91.field1238[var5];
                     }

                     ++var5;
                  } while(~var5 > ~class211.field2686.length);
               }
            }

            class553 var6 = (class553)class44.field570.method3192((long)arg0, (byte)-107);
            if (var6 != null) {
               if (arg1 && var6.field8134 == null) {
                  class19 var7 = class481.method3655(class28.field414, 124, arg0);
                  if (var7 == null) {
                     return null;
                  }

                  var6.field8134 = var7;
               }

               return var6;
            } else {
               class65[] var8 = class65.method585(class258.field3268, arg0);
               if (var8 == null) {
                  return null;
               } else {
                  class19 var9 = class481.method3655(class28.field414, -101, arg0);
                  if (var9 == null) {
                     return null;
                  } else {
                     class553 var10;
                     label58: {
                        if (!arg1) {
                           var10 = new class553(arg3.method430(var9, var8, true));
                           if (!var4) {
                              break label58;
                           }
                        }

                        var10 = new class553(arg3.method430(var9, var8, true), var9);
                     }

                     if (arg2 != -28218) {
                        method2961(49, false, 97, (class479)null);
                     }

                     class44.field570.method3190(var10, (long)arg0, 8);
                     return var10;
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field5242[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5242[2] : field5242[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2962(boolean arg0) {
      try {
         field5241 = null;
         if (arg0) {
            method2960(13);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5242[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2963(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2964(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 103;
            break;
         case 1:
            var10005 = 126;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
