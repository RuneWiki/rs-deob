import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class689 extends class117 {
   @OriginalMember(
      owner = "client!gv",
      name = "t",
      descriptor = "I"
   )
   private int field9922;
   @OriginalMember(
      owner = "client!gv",
      name = "m",
      descriptor = "I"
   )
   private int field9929;
   @OriginalMember(
      owner = "client!gv",
      name = "s",
      descriptor = "I"
   )
   private int field9926;
   @OriginalMember(
      owner = "client!gv",
      name = "p",
      descriptor = "Laea;"
   )
   private class678 field9923;
   @OriginalMember(
      owner = "client!gv",
      name = "o",
      descriptor = "I"
   )
   private int field9930;
   @OriginalMember(
      owner = "client!gv",
      name = "n",
      descriptor = "I"
   )
   private int field9927;
   @OriginalMember(
      owner = "client!gv",
      name = "q",
      descriptor = "I"
   )
   private int field9921;
   @OriginalMember(
      owner = "client!gv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9931 = new String[]{method5005(method5004("0k'W0")), method5005(method5004("0k'T0")), method5005(method5004("9hez")), method5005(method5004(",3'8e")), method5005(method5004("0k'*q9t}(0"))};
   @OriginalMember(
      owner = "client!gv",
      name = "u",
      descriptor = "I"
   )
   public static int field9925;
   @OriginalMember(
      owner = "client!gv",
      name = "r",
      descriptor = "Lcfa;"
   )
   private class763 field9924;
   @OriginalMember(
      owner = "client!gv",
      name = "l",
      descriptor = "Lnf;"
   )
   public static class773 field9928;

   @OriginalMember(
      owner = "client!gv",
      name = "d",
      descriptor = "(B)V"
   )
   public static void method5003(byte arg0) {
      try {
         if (arg0 > -16) {
            method5003((byte)50);
         }

         field9928 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9931[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "a",
      descriptor = "(I)Lcfa;"
   )
   public final class763 method1142(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field9925;
         if (arg0 >= -70) {
            return null;
         } else {
            if (this.field9924 == null) {
               class672 var3;
               byte var4;
               int var5;
               int var9;
               label88: {
                  class759.field10839[3] = this.field9929;
                  class759.field10839[2] = this.field9927;
                  class759.field10839[1] = this.field9922;
                  class759.field10839[5] = this.field9926;
                  var3 = this.field9923.field240;
                  class759.field10839[4] = this.field9930;
                  class759.field10839[0] = this.field9921;
                  var4 = 0;
                  var5 = 0;
                  int var6 = 0;
                  if (var2) {
                     if (!var3.method2036(class759.field10839[var6], (byte)-120)) {
                        return null;
                     }
                  } else if (var6 >= 6) {
                     var9 = 0;
                     if (!var2) {
                        break label88;
                     }
                  } else if (!var3.method2036(class759.field10839[var6], (byte)-120)) {
                     return null;
                  }

                  while(true) {
                     class390 var7 = var3.method2043(-82, class759.field10839[var6]);
                     int var8 = !var7.field5685 ? 128 : 64;
                     if (var8 > var5) {
                        var5 = var8;
                     }

                     if (~var7.field5675 < -1) {
                        var4 = 1;
                     }

                     ++var6;
                     if (var6 >= 6) {
                        var9 = 0;
                        if (!var2) {
                           break;
                        }
                     } else if (!var3.method2036(class759.field10839[var6], (byte)-120)) {
                        return null;
                     }
                  }
               }

               if (var2) {
                  class531.field7491[var9] = var3.method2038(1.0F, var5, false, class759.field10839[var9], var5, -23361);
                  ++var9;
               }

               while(true) {
                  while(~var9 > -7) {
                     class531.field7491[var9] = var3.method2038(1.0F, var5, false, class759.field10839[var9], var5, -23361);
                     ++var9;
                  }

                  if (!var2) {
                     this.field9924 = new class763(this.field9923, 6407, var5, ~var4 != -1, class531.field7491);
                     break;
                  }

                  ++var9;
               }
            }

            return this.field9924;
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field9931[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "<init>",
      descriptor = "(Laea;IIIIII)V"
   )
   public class689(class678 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         this.field9922 = arg2;
         this.field9929 = arg4;
         this.field9926 = arg6;
         this.field9923 = arg0;
         this.field9930 = arg5;
         this.field9927 = arg3;
         this.field9921 = arg1;
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field9931[4] + (arg0 != null ? field9931[3] : field9931[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5004(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5005(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 87;
            break;
         case 1:
            var10005 = 29;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
