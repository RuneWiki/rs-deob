import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class699 {
   @OriginalMember(
      owner = "client!cb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10077 = new String[]{method5111(method5110("\u0018'")), method5111(method5110("\u0012$\f1c"))};
   @OriginalMember(
      owner = "client!cb",
      name = "e",
      descriptor = "I"
   )
   public static int field10075 = 0;
   @OriginalMember(
      owner = "client!cb",
      name = "d",
      descriptor = "I"
   )
   public static int field10072;
   @OriginalMember(
      owner = "client!cb",
      name = "a",
      descriptor = "I"
   )
   public static int field10073;
   @OriginalMember(
      owner = "client!cb",
      name = "c",
      descriptor = "Lss;"
   )
   public class723 field10074;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!cb",
      name = "b",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field10076;

   @OriginalMember(
      owner = "client!cb",
      name = "a",
      descriptor = "(IIIZIIII)V"
   )
   public static final void method5108(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         if (arg3) {
            method5108(-75, -74, 9, false, -6, 46, 42, 33);
         }

         ++field10072;
         if (arg2 >= 0 && ~arg7 <= -1 && class234.field3626 + -1 > arg2 && arg7 < class209.field2989 + -1) {
            if (class324.field4826 == null) {
               return;
            }

            if (arg5 != 0) {
               if (~arg5 != -2) {
                  if (~arg5 == -3) {
                     class338 var8 = (class338)class331.method2653(arg6, arg2, arg7, field10076 != null ? field10076 : (field10076 = method5109(field10077[0])));
                     if (var8 != null) {
                        if (arg4 == 11) {
                           arg4 = 10;
                        }

                        if (var8 instanceof class69) {
                           ((class69)var8).field991.method5321(arg0, (byte)113);
                           return;
                        }

                        class431.method3363(arg6, arg0, var8.method724(23976), arg1, arg4, arg2, arg5, -2, arg7);
                        return;
                     }

                     return;
                  }

                  if (~arg5 == -4) {
                     class338 var9 = (class338)class495.method3755(arg6, arg2, arg7);
                     if (var9 != null) {
                        if (!(var9 instanceof class155)) {
                           class431.method3363(arg6, arg0, var9.method724(23976), arg1, arg4, arg2, arg5, -2, arg7);
                           return;
                        }

                        ((class155)var9).field2367.method5321(arg0, (byte)-94);
                        return;
                     }
                  }
               } else {
                  class338 var10 = (class338)class336.method2692(arg6, arg2, arg7);
                  if (var10 == null) {
                     return;
                  }

                  if (var10 instanceof class737) {
                     ((class737)var10).field10503.method5321(arg0, (byte)-35);
                     return;
                  }

                  int var11 = var10.method724(23976);
                  if (arg4 == 4 || ~arg4 == -6) {
                     class431.method3363(arg6, arg0, var11, arg1, 4, arg2, arg5, -2, arg7);
                     return;
                  }

                  if (~arg4 == -7) {
                     class431.method3363(arg6, arg0, var11, arg1 - -4, 4, arg2, arg5, -2, arg7);
                     return;
                  }

                  if (arg4 != 7) {
                     if (~arg4 == -9) {
                        class431.method3363(arg6, arg0, var11, arg1 + 4, 4, arg2, arg5, -2, arg7);
                        class431.method3363(arg6, arg0, var11, (arg1 + 2 & 3) - -4, 4, arg2, arg5, -2, arg7);
                        return;
                     }
                  } else {
                     class431.method3363(arg6, arg0, var11, (3 & arg1 - -2) - -4, 4, arg2, arg5, -2, arg7);
                  }
               }

               return;
            }

            class338 var12 = (class338)class421.method3284(arg6, arg2, arg7);
            class338 var13 = (class338)class106.method1033(arg6, arg2, arg7);
            if (var12 != null && arg4 != 2) {
               label138: {
                  if (!(var12 instanceof class501)) {
                     class431.method3363(arg6, arg0, var12.method724(23976), arg1, arg4, arg2, arg5, -2, arg7);
                     if (!client.field10022) {
                        break label138;
                     }
                  }

                  ((class501)var12).field7153.method5321(arg0, (byte)-86);
               }
            }

            if (var13 != null) {
               if (var13 instanceof class501) {
                  ((class501)var13).field7153.method5321(arg0, (byte)-81);
                  return;
               }

               class431.method3363(arg6, arg0, var13.method724(23976), arg1, arg4, arg2, arg5, -2, arg7);
               return;
            }
         }

      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field10077[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!cb",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method5109(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!cb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5110(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5111(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 113;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
