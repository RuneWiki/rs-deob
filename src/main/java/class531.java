import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public class class531 extends class454 {
   @OriginalMember(
      owner = "client!qia",
      name = "m",
      descriptor = "I"
   )
   private int field7484;
   @OriginalMember(
      owner = "client!qia",
      name = "u",
      descriptor = "Ldaa;"
   )
   private class226 field7494;
   @OriginalMember(
      owner = "client!qia",
      name = "j",
      descriptor = "I"
   )
   private int field7483;
   @OriginalMember(
      owner = "client!qia",
      name = "t",
      descriptor = "I"
   )
   private int field7487;
   @OriginalMember(
      owner = "client!qia",
      name = "i",
      descriptor = "I"
   )
   private int field7488;
   @OriginalMember(
      owner = "client!qia",
      name = "n",
      descriptor = "I"
   )
   private int field7486;
   @OriginalMember(
      owner = "client!qia",
      name = "r",
      descriptor = "I"
   )
   private int field7492;
   @OriginalMember(
      owner = "client!qia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7495 = new String[]{method3968(method3967("~Bt0\b'")), method3968(method3967("a^yr")), method3968(method3967("t\u0005;00")), method3968(method3967("~Bt0\t'")), method3968(method3967("~Bt0\u000f'")), method3968(method3967("~Bt0\u000b'")), method3968(method3967("~Bt0qfE|js'"))};
   @OriginalMember(
      owner = "client!qia",
      name = "l",
      descriptor = "Z"
   )
   public static boolean field7490 = true;
   @OriginalMember(
      owner = "client!qia",
      name = "q",
      descriptor = "[[I"
   )
   public static int[][] field7491 = new int[6][];
   @OriginalMember(
      owner = "client!qia",
      name = "o",
      descriptor = "I"
   )
   public static int field7482;
   @OriginalMember(
      owner = "client!qia",
      name = "k",
      descriptor = "I"
   )
   public static int field7489;
   @OriginalMember(
      owner = "client!qia",
      name = "p",
      descriptor = "I"
   )
   public static int field7493;
   @OriginalMember(
      owner = "client!qia",
      name = "s",
      descriptor = "Lcca;"
   )
   private class293 field7485;

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3964(boolean arg0) {
      try {
         if (arg0) {
            method3965(25, 30, 52, -86, 95, -79, 63, -24, -16);
         }

         field7491 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7495[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public static final void method3965(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         class548.field7815[class517.field7317++] = new class662(arg3, arg0, arg6, arg2, arg2, arg6, arg8, arg7, arg7, arg8, arg4, arg4, arg1, arg1);
         ++field7489;
         if (arg5 <= 82) {
            field7491 = null;
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field7495[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(I)Lcca;"
   )
   public final class293 method3498(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field7493;
         if (arg0 != 18) {
            return null;
         } else {
            if (this.field7485 == null) {
               class672 var3;
               boolean var4;
               int var5;
               int var9;
               label88: {
                  class231.field3590[3] = this.field7483;
                  class231.field3590[2] = this.field7492;
                  class231.field3590[0] = this.field7488;
                  var3 = this.field7494.field240;
                  class231.field3590[1] = this.field7487;
                  class231.field3590[4] = this.field7486;
                  class231.field3590[5] = this.field7484;
                  var4 = false;
                  var5 = 0;
                  int var6 = 0;
                  if (var2) {
                     if (!var3.method2036(class231.field3590[var6], (byte)-119)) {
                        return null;
                     }
                  } else if (var6 >= 6) {
                     var9 = 0;
                     if (!var2) {
                        break label88;
                     }
                  } else if (!var3.method2036(class231.field3590[var6], (byte)-119)) {
                     return null;
                  }

                  while(true) {
                     class390 var7 = var3.method2043(-71, class231.field3590[var6]);
                     int var8 = !var7.field5685 ? 128 : 64;
                     if (var8 > var5) {
                        var5 = var8;
                     }

                     if (~var7.field5675 < -1) {
                        var4 = true;
                     }

                     ++var6;
                     if (var6 >= 6) {
                        var9 = 0;
                        if (!var2) {
                           break;
                        }
                     } else if (!var3.method2036(class231.field3590[var6], (byte)-119)) {
                        return null;
                     }
                  }
               }

               if (var2) {
                  class169.field2529[var9] = var3.method2038(1.0F, var5, false, class231.field3590[var9], var5, class607.method4473(arg0, -23379));
                  ++var9;
               }

               while(true) {
                  while(var9 < 6) {
                     class169.field2529[var9] = var3.method2038(1.0F, var5, false, class231.field3590[var9], var5, class607.method4473(arg0, -23379));
                     ++var9;
                  }

                  if (!var2) {
                     this.field7485 = this.field7494.method1269(0, class169.field2529, var5, var4);
                     break;
                  }

                  ++var9;
               }
            }

            return this.field7485;
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field7495[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(Lcu;B)V"
   )
   public static final void method3966(class65 arg0, byte arg1) {
      boolean var2 = client.field10022;

      try {
         if (arg1 != -1) {
            field7490 = false;
         }

         ++field7482;
         byte[] var3 = new byte[24];
         if (class365.field5401 != null) {
            try {
               int var10000;
               byte var10001;
               label85: {
                  class365.field5401.method1788(0L, 0);
                  class365.field5401.method1782(var3, false);
                  int var4 = 0;
                  if (var2) {
                     var10000 = ~var3[var4];
                     var10001 = -1;
                  } else if (var4 >= 24) {
                     var10000 = var4;
                     var10001 = 24;
                     if (!var2) {
                        break label85;
                     }
                  } else {
                     var10000 = ~var3[var4];
                     var10001 = -1;
                  }

                  label84:
                  do {
                     while(true) {
                        if (var10000 != var10001) {
                           if (!var2) {
                              var10000 = var4;
                              var10001 = 24;
                              break;
                           }

                           ++var4;
                        } else {
                           ++var4;
                        }

                        if (var4 >= 24) {
                           var10000 = var4;
                           var10001 = 24;
                           if (!var2) {
                              break label84;
                           }
                        } else {
                           var10000 = ~var3[var4];
                           var10001 = -1;
                        }
                     }
                  } while(var2);
               }

               if (var10000 >= var10001) {
                  throw new IOException();
               }
            } catch (Exception var7) {
               int var5 = 0;
               if (var2) {
                  var3[var5] = -1;
                  ++var5;
               }

               while(true) {
                  while(~var5 > -25) {
                     var3[var5] = -1;
                     ++var5;
                  }

                  if (!var2) {
                     break;
                  }

                  ++var5;
               }
            }
         }

         arg0.method694(0, 24, var3, -7033);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field7495[3] + (arg0 != null ? field7495[2] : field7495[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "<init>",
      descriptor = "(Ldaa;IIIIII)V"
   )
   public class531(class226 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         this.field7484 = arg6;
         this.field7494 = arg0;
         this.field7483 = arg4;
         this.field7487 = arg2;
         this.field7488 = arg1;
         this.field7486 = arg5;
         this.field7492 = arg3;
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field7495[6] + (arg0 != null ? field7495[2] : field7495[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3967(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 77);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3968(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 77;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
