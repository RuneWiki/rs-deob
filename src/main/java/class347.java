import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class347 {
   @OriginalMember(
      owner = "client!wb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5282 = new String[]{method2722(method2721(">6\"qHa")), method2722(method2721(">6\"oHa")), method2722(method2721("'!`M")), method2722(method2721("2z\"\u000fv")), method2722(method2721(">6\"lHa")), method2722(method2721(">6\"mHa")), method2722(method2721(">6\"pHa"))};
   @OriginalMember(
      owner = "client!wb",
      name = "b",
      descriptor = "I"
   )
   public static int field5274;
   @OriginalMember(
      owner = "client!wb",
      name = "c",
      descriptor = "I"
   )
   public static int field5275;
   @OriginalMember(
      owner = "client!wb",
      name = "f",
      descriptor = "I"
   )
   public static int field5276;
   @OriginalMember(
      owner = "client!wb",
      name = "a",
      descriptor = "I"
   )
   public static int field5279;
   @OriginalMember(
      owner = "client!wb",
      name = "e",
      descriptor = "I"
   )
   public static int field5281;
   @OriginalMember(
      owner = "client!wb",
      name = "d",
      descriptor = "J"
   )
   public long field5280;
   @OriginalMember(
      owner = "client!wb",
      name = "g",
      descriptor = "Lwb;"
   )
   public class347 field5277;
   @OriginalMember(
      owner = "client!wb",
      name = "h",
      descriptor = "Lwb;"
   )
   public class347 field5278;

   @OriginalMember(
      owner = "client!wb",
      name = "a",
      descriptor = "(IIIIIII)V",
      line = 5
   )
   public static final void method2715(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      int var7 = client.field4530;

      try {
         ++field5275;
         int var8 = -arg2 + arg6;
         int var9 = arg0 + arg2;
         int var10 = arg0;
         if (var7 != 0) {
            class47.method372(arg3, class292.field4077[arg0], arg5, (byte)115, arg1);
            var10 = arg0 + 1;
         }

         while(true) {
            while(~var10 > ~var9) {
               class47.method372(arg3, class292.field4077[var10], arg5, (byte)115, arg1);
               ++var10;
            }

            int var11 = -arg2 + arg3;
            int var12 = arg6;
            if (var7 == 0) {
               if (var7 != 0) {
                  class47.method372(arg3, class292.field4077[arg6], arg5, (byte)121, arg1);
                  var12 = arg6 - 1;
               }

               while(true) {
                  int var10000;
                  if (var12 <= var8) {
                     int var13 = arg1 + arg2;
                     int var14 = var9;
                     var10000 = arg4;
                     if (var7 == 0) {
                        if (arg4 != -15115) {
                           return;
                        }

                        while(~var14 >= ~var8) {
                           int[] var15 = class292.field4077[var14];
                           class47.method372(var13, var15, arg5, (byte)126, arg1);
                           class47.method372(arg3, var15, arg5, (byte)106, var11);
                           ++var14;
                        }

                        return;
                     }
                  } else {
                     var10000 = arg3;
                  }

                  class47.method372(var10000, class292.field4077[var12], arg5, (byte)121, arg1);
                  --var12;
               }
            }

            ++var10;
         }
      } catch (RuntimeException var17) {
         throw class670.method4877(var17, field5282[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "c",
      descriptor = "(I)Z",
      line = 49
   )
   public final boolean method2716(int arg0) {
      try {
         if (arg0 != 0) {
            method2715(-36, 59, -6, 70, -108, 67, 65);
         }

         ++field5276;
         return this.field5277 != null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5282[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "a",
      descriptor = "([IB[Ljava/lang/String;)V",
      line = 65
   )
   public static final void method2717(int[] arg0, byte arg1, String[] arg2) {
      try {
         ++field5279;
         if (arg1 == -110) {
            class621.method4488(0, arg2, arg0, arg2.length + -1, 7116);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5282[4] + (arg0 != null ? field5282[3] : field5282[2]) + ',' + arg1 + ',' + (arg2 != null ? field5282[3] : field5282[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "a",
      descriptor = "(IC)Z",
      line = 81
   )
   public static final boolean method2718(int arg0, char arg1) {
      int var2 = client.field4530;

      try {
         if (arg0 <= 15) {
            return true;
         } else {
            ++field5281;
            if (Character.isISOControl(arg1)) {
               return false;
            } else if (class443.method3349(-104, arg1)) {
               return true;
            } else {
               char[] var3 = class680.field10219;
               int var4 = 0;
               char var5;
               if (var2 != 0) {
                  var5 = var3[var4];
                  if (~arg1 == ~var5) {
                     return true;
                  }

                  ++var4;
               }

               while(true) {
                  char var10000;
                  if (~var3.length >= ~var4) {
                     char[] var6 = class302.field4315;
                     var10000 = 0;
                     if (var2 == 0) {
                        int var7 = 0;
                        char var8;
                        if (var2 != 0) {
                           var8 = var6[var7];
                           if (~arg1 == ~var8) {
                              return true;
                           }

                           ++var7;
                        }

                        while(true) {
                           if (~var7 <= ~var6.length) {
                              var10000 = 0;
                              if (var2 == 0) {
                                 return false;
                              }
                           } else {
                              var10000 = var6[var7];
                           }

                           var8 = var10000;
                           if (~arg1 == ~var8) {
                              return true;
                           }

                           ++var7;
                        }
                     }
                  } else {
                     var10000 = var3[var4];
                  }

                  var5 = var10000;
                  if (~arg1 == ~var5) {
                     return true;
                  }

                  ++var4;
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field5282[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "a",
      descriptor = "(III)Lfka;",
      line = 127
   )
   public static final class742 method2719(int arg0, int arg1, int arg2) {
      class72 var3 = class353.field5360[arg0][arg1][arg2];
      if (var3 == null) {
         return null;
      } else {
         class742 var4 = var3.field917;
         var3.field917 = null;
         class29.method205(var4);
         return var4;
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "d",
      descriptor = "(I)V",
      line = 138
   )
   public final void method2720(int arg0) {
      try {
         ++field5274;
         if (this.field5277 != null) {
            this.field5277.field5278 = this.field5278;
            this.field5278.field5277 = this.field5277;
            if (arg0 == 0) {
               this.field5277 = null;
               this.field5278 = null;
            }
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5282[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2721(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 11);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2722(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 84;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 11;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
