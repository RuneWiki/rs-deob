import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class441 extends class385 {
   @OriginalMember(
      owner = "client!ij",
      name = "o",
      descriptor = "I"
   )
   private int field6440;
   @OriginalMember(
      owner = "client!ij",
      name = "n",
      descriptor = "I"
   )
   private int field6433;
   @OriginalMember(
      owner = "client!ij",
      name = "l",
      descriptor = "I"
   )
   private int field6439;
   @OriginalMember(
      owner = "client!ij",
      name = "i",
      descriptor = "I"
   )
   private int field6442;
   @OriginalMember(
      owner = "client!ij",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6445 = new String[]{method3324(method3323("\u0006\b\u007f*=")), method3324(method3323("\u0006\b\u007fT|\u0001\u000b%V=")), method3324(method3323("\u0006\b\u007f.=")), method3324(method3323("\u0006\b\u007f)=")), method3324(method3323("\u0001\u0017=\u0004")), method3324(method3323("\u0006\b\u007f+=")), method3324(method3323("\u0014L\u007fFh")), method3324(method3323("S\u000e%V")), method3324(method3323("S\u0005%V")), method3324(method3323("\u0006\b\u007f-=")), method3324(method3323("\u0006\b\u007f,="))};
   @OriginalMember(
      owner = "client!ij",
      name = "q",
      descriptor = "[I"
   )
   public static int[] field6443 = new int[5];
   @OriginalMember(
      owner = "client!ij",
      name = "m",
      descriptor = "Luw;"
   )
   public static class435 field6435 = new class435(42, 3);
   @OriginalMember(
      owner = "client!ij",
      name = "h",
      descriptor = "I"
   )
   public static int field6434;
   @OriginalMember(
      owner = "client!ij",
      name = "r",
      descriptor = "I"
   )
   public static int field6436;
   @OriginalMember(
      owner = "client!ij",
      name = "k",
      descriptor = "I"
   )
   public static int field6437;
   @OriginalMember(
      owner = "client!ij",
      name = "j",
      descriptor = "I"
   )
   public static int field6438;
   @OriginalMember(
      owner = "client!ij",
      name = "s",
      descriptor = "I"
   )
   public static int field6441;
   @OriginalMember(
      owner = "client!ij",
      name = "p",
      descriptor = "[Ltn;"
   )
   public static class94[] field6444;

   @OriginalMember(
      owner = "client!ij",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method2104(int arg0, int arg1, int arg2) {
      try {
         ++field6436;
         int var4 = this.field6442 * arg1 >> 12;
         int var5 = this.field6440 * arg1 >> 12;
         int var6 = this.field6433 * arg0 >> 12;
         int var7 = this.field6439 * arg0 >> 12;
         class141.method1341(var7, var4, super.field5687, var5, var6, -1, super.field5688);
         if (arg2 != 5598) {
            this.method2103((byte)-89, 37, -41);
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field6445[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "a",
      descriptor = "(IBI)V"
   )
   public final void method2108(int arg0, byte arg1, int arg2) {
      try {
         ++field6434;
         int var4 = this.field6442 * arg2 >> 12;
         int var5 = this.field6440 * arg2 >> 12;
         int var6 = 5 % ((-3 - arg1) / 51);
         int var7 = this.field6433 * arg0 >> 12;
         int var8 = this.field6439 * arg0 >> 12;
         class188.method1644(super.field5689, var4, var5, var7, super.field5687, super.field5688, 3, var8);
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field6445[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "a",
      descriptor = "(IIIIFIZII)[[I"
   )
   public static final int[][] method3320(int arg0, int arg1, int arg2, int arg3, float arg4, int arg5, boolean arg6, int arg7, int arg8) {
      boolean var9 = client.field4564;

      try {
         ++field6438;
         int[][] var10 = new int[arg1][arg0];
         class573 var11 = new class573();
         var11.field8278 = arg2;
         var11.field8290 = arg7;
         var11.field8289 = arg3;
         var11.field8283 = (int)(arg4 * 4096.0F);
         var11.field8293 = arg6;
         var11.method901(245880940);
         class558.method4168(arg1, 0, arg0);
         int var12 = 0;
         if (var9) {
            var11.method4244(0, var10[var12], var12);
            ++var12;
         }

         while(true) {
            while(arg1 > var12) {
               var11.method4244(0, var10[var12], var12);
               ++var12;
            }

            int var13 = 37 / ((18 - arg8) / 40);
            if (!var9) {
               return var10;
            }

            ++var12;
         }
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field6445[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "a",
      descriptor = "(ILjava/lang/String;)Ljava/lang/String;"
   )
   public static final String method3321(int arg0, String arg1) {
      boolean var2 = client.field4564;

      try {
         if (arg0 <= 124) {
            return null;
         } else {
            ++field6437;
            int var3 = arg1.length();
            int var4 = 0;
            int var5 = 0;
            char var6;
            if (var2) {
               var6 = arg1.charAt(var5);
               if (~var6 != -61) {
                  if (~var6 == -63) {
                     var4 += 3;
                     ++var5;
                  } else {
                     ++var5;
                  }
               } else {
                  var4 += 3;
                  ++var5;
               }
            }

            while(true) {
               char var10000;
               if (var3 <= var5) {
                  StringBuffer var7 = new StringBuffer(var3 - -var4);
                  var10000 = 0;
                  if (!var2) {
                     int var8 = 0;
                     String var12;
                     if (var2) {
                        var12 = arg1;
                     } else if (var3 <= var8) {
                        var12 = var7.toString();
                        if (!var2) {
                           return var12;
                        }
                     } else {
                        var12 = arg1;
                     }

                     while(true) {
                        label113: {
                           char var9 = var12.charAt(var8);
                           if (~var9 == -61) {
                              var7.append(field6445[7]);
                              if (!var2) {
                                 ++var8;
                                 break label113;
                              }
                           }

                           if (var9 == '>') {
                              var7.append(field6445[8]);
                              if (var2) {
                                 var7.append(var9);
                                 ++var8;
                              } else {
                                 ++var8;
                              }
                           } else {
                              var7.append(var9);
                              ++var8;
                           }
                        }

                        if (var3 <= var8) {
                           var12 = var7.toString();
                           if (!var2) {
                              return var12;
                           }
                        } else {
                           var12 = arg1;
                        }
                     }
                  }
               } else {
                  var10000 = arg1.charAt(var5);
               }

               var6 = var10000;
               if (~var6 != -61) {
                  if (~var6 == -63) {
                     var4 += 3;
                     ++var5;
                  } else {
                     ++var5;
                  }
               } else {
                  var4 += 3;
                  ++var5;
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field6445[5] + arg0 + ',' + (arg1 != null ? field6445[6] : field6445[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "<init>",
      descriptor = "(IIIIIII)V"
   )
   public class441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      super(arg4, arg5, arg6);

      try {
         this.field6440 = arg2;
         this.field6433 = arg1;
         this.field6439 = arg3;
         this.field6442 = arg0;
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field6445[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3322(int arg0) {
      try {
         field6444 = null;
         field6435 = null;
         field6443 = null;
         if (arg0 != 5) {
            method3320(0, 106, 56, 110, 0.39252874F, -59, true, 51, 86);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6445[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "a",
      descriptor = "(BII)V"
   )
   public final void method2103(byte arg0, int arg1, int arg2) {
      try {
         if (arg0 != -38) {
            this.field6439 = 2;
         }

         ++field6441;
         int var4 = this.field6442 * arg1 >> 12;
         int var5 = this.field6440 * arg1 >> 12;
         int var6 = this.field6433 * arg2 >> 12;
         int var7 = this.field6439 * arg2 >> 12;
         class464.method3481(var5, var7, var4, super.field5689, (byte)-32, var6);
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field6445[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3323(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ij",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3324(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 111;
            break;
         case 1:
            var10005 = 98;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
