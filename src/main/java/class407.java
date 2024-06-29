import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class407 {
   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "Lpg;"
   )
   public class763 field6218 = null;
   @OriginalMember(
      owner = "client!ml",
      name = "f",
      descriptor = "Lda;"
   )
   public class67 field6220 = null;
   @OriginalMember(
      owner = "client!ml",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6221 = new String[]{method3117(method3116("nVi\r'")), method3117(method3116("x\u0014igr")), method3117(method3116("mO+%")), method3117(method3116("nViufmS3w'")), method3117(method3116("nVi\u000b'")), method3117(method3116("nVi\n'")), method3117(method3116("nVi\b'"))};
   @OriginalMember(
      owner = "client!ml",
      name = "b",
      descriptor = "Lsd;"
   )
   public static class101 field6217 = new class101(84, 0);
   @OriginalMember(
      owner = "client!ml",
      name = "e",
      descriptor = "I"
   )
   public static int field6215;
   @OriginalMember(
      owner = "client!ml",
      name = "c",
      descriptor = "I"
   )
   public static int field6216;
   @OriginalMember(
      owner = "client!ml",
      name = "d",
      descriptor = "I"
   )
   public static int field6219;

   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "(IB)Z",
      line = 7
   )
   public static final boolean method3112(int arg0, byte arg1) {
      try {
         if (arg1 < 98) {
            method3114(-89);
         }

         ++field6215;
         return arg0 == 7 || ~arg0 == -10;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6221[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "(IIIZIIIIII)Z",
      line = 18
   )
   public static final boolean method3113(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      try {
         ++field6219;
         if (!class180.method1413(-74, arg4, arg9, arg5)) {
            return false;
         } else {
            int var15 = class746.field11058[0];
            int var16 = class746.field11058[2];
            int var20 = class746.field11058[1];
            if (!class180.method1413(-116, arg2, arg7, arg0)) {
               return false;
            } else {
               int var12 = class746.field11058[2];
               int var18 = class746.field11058[1];
               int var14 = class746.field11058[0];
               if (!class180.method1413(-105, arg8, arg1, arg6)) {
                  return false;
               } else {
                  if (!arg3) {
                     field6217 = null;
                  }

                  int var19 = class746.field11058[0];
                  int var17 = class746.field11058[2];
                  int var13 = class746.field11058[1];
                  return class75.method733(var17, var20, var12, (byte)-37, var16, var19, var13, var15, var14, var18);
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field6221[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ml",
      name = "<init>",
      descriptor = "(Lda;)V",
      line = 65
   )
   public class407(class67 arg0) {
      try {
         this.field6220 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6221[3] + (arg0 != null ? field6221[1] : field6221[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ml",
      name = "<init>",
      descriptor = "(Lda;Lpg;)V",
      line = 82
   )
   public class407(class67 arg0, class763 arg1) {
      try {
         this.field6218 = arg1;
         this.field6220 = arg0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6221[3] + (arg0 != null ? field6221[1] : field6221[2]) + ',' + (arg1 != null ? field6221[1] : field6221[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "(I)V",
      line = 73
   )
   public static void method3114(int arg0) {
      try {
         if (arg0 == 0) {
            field6217 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6221[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "(III[BIII)Z",
      line = 92
   )
   public static final boolean method3115(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
      int var7 = client.field4530;

      try {
         ++field6216;
         if (arg1 > -47) {
            return true;
         } else {
            int var9;
            label45: {
               int var8 = arg0 % arg2;
               if (var8 == 0) {
                  var9 = 0;
                  if (var7 == 0) {
                     break label45;
                  }
               }

               var9 = -var8 + arg2;
            }

            int var10 = -((arg6 + -1 + arg2) / arg2);
            int var11 = -((arg2 - 1 + arg0) / arg2);
            int var12 = var10;
            int var10000;
            if (var7 != 0) {
               var10000 = var11;
            } else if (var10 >= 0) {
               var10000 = 0;
               if (var7 == 0) {
                  return false;
               }
            } else {
               var10000 = var11;
            }

            while(true) {
               int var13 = var10000;
               if (var7 != 0) {
                  if (~arg3[arg4] == -1) {
                     return true;
                  }

                  arg4 += arg2;
                  ++var13;
               }

               while(true) {
                  if (var13 >= 0) {
                     arg4 -= var9;
                     var10000 = arg3[arg4 + -1];
                     if (var7 == 0) {
                        if (var10000 == 0) {
                           return true;
                        }

                        arg4 += arg5;
                        ++var12;
                        if (var12 >= 0) {
                           var10000 = 0;
                           if (var7 == 0) {
                              return false;
                           }
                        } else {
                           var10000 = var11;
                        }
                        break;
                     }
                  } else {
                     var10000 = ~arg3[arg4];
                  }

                  if (var10000 == -1) {
                     return true;
                  }

                  arg4 += arg2;
                  ++var13;
               }
            }
         }
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field6221[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6221[1] : field6221[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ml",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3116(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 15);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ml",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3117(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 3;
            break;
         case 1:
            var10005 = 58;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 73;
            break;
         default:
            var10005 = 15;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
