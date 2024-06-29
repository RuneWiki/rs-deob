import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class346 {
   @OriginalMember(
      owner = "client!hs",
      name = "c",
      descriptor = "[[F"
   )
   public float[][] field4955;
   @OriginalMember(
      owner = "client!hs",
      name = "f",
      descriptor = "[I"
   )
   public int[] field4958;
   @OriginalMember(
      owner = "client!hs",
      name = "g",
      descriptor = "[I"
   )
   public int[] field4959;
   @OriginalMember(
      owner = "client!hs",
      name = "h",
      descriptor = "[I"
   )
   public int[] field4956;
   @OriginalMember(
      owner = "client!hs",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4962 = new String[]{method2736(method2735("Q\u007f\u0016\u0017<WeL\u0015}")), method2736(method2735("WyTG")), method2736(method2735("B\"\u0016\u0005(")), method2736(method2735("Q\u007f\u0016j}")), method2736(method2735("Q\u007f\u0016i}"))};
   @OriginalMember(
      owner = "client!hs",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field4957 = false;
   @OriginalMember(
      owner = "client!hs",
      name = "e",
      descriptor = "Lnm;"
   )
   public static class502 field4954 = new class502();
   @OriginalMember(
      owner = "client!hs",
      name = "d",
      descriptor = "Luk;"
   )
   public static class273 field4961 = new class273();
   @OriginalMember(
      owner = "client!hs",
      name = "a",
      descriptor = "I"
   )
   public static int field4960;

   @OriginalMember(
      owner = "client!hs",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method2733(int arg0, int arg1, int arg2) {
      boolean var3 = client.field4273;

      try {
         if (arg1 != -773) {
            field4957 = true;
         }

         int var4;
         int var7;
         label114: {
            ++field4960;
            var4 = class101.field1304.method4803(class551.field7545.method3980(class494.field6787, true), (byte)93);
            int var10000;
            if (class107.field1366) {
               label105: {
                  class85 var5 = (class85)class193.field2360.method3964((byte)26);
                  if (var3) {
                     var10000 = ~var5.field1099;
                  } else if (var5 == null) {
                     var7 = class432.field6026 * 16 + 21;
                     var10000 = class336.field4817;
                     if (!var3) {
                        break label105;
                     }
                  } else {
                     var10000 = ~var5.field1099;
                  }

                  while(true) {
                     int var6;
                     if (var10000 != -2) {
                        var6 = class459.method3379((byte)-24, var5);
                        if (var3) {
                           var6 = class244.method1833((byte)61, (class241)var5.field1105.field7496.field7453);
                        }
                     } else {
                        var6 = class244.method1833((byte)61, (class241)var5.field1105.field7496.field7453);
                     }

                     if (var6 > var4) {
                        var4 = var6;
                     }

                     var5 = (class85)class193.field2360.method3965(true);
                     if (var5 == null) {
                        var7 = class432.field6026 * 16 + 21;
                        var10000 = class336.field4817;
                        if (!var3) {
                           break;
                        }
                     } else {
                        var10000 = ~var5.field1099;
                     }
                  }
               }

               class378.field5305 = (var10000 != 0 ? 26 : 22) + class432.field6026 * 16;
               var4 += 8;
               if (!var3) {
                  break label114;
               }
            }

            class241 var8 = (class241)class280.field3738.method3855(arg1 ^ 811);
            int var9;
            if (var3) {
               var9 = class244.method1833((byte)114, var8);
               if (var9 > var4) {
                  var4 = var9;
               }

               var8 = (class241)class280.field3738.method3866((byte)126);
            }

            while(true) {
               if (var8 == null) {
                  var4 += 8;
                  var7 = class234.field2899 * 16 + 21;
                  var10000 = class336.field4817;
                  if (!var3) {
                     class378.field5305 = (var10000 != 0 ? 26 : 22) + class234.field2899 * 16;
                     break;
                  }
               } else {
                  var10000 = class244.method1833((byte)114, var8);
               }

               var9 = var10000;
               if (var9 > var4) {
                  var4 = var9;
               }

               var8 = (class241)class280.field3738.method3866((byte)126);
            }
         }

         int var10 = -(var4 / 2) + arg2;
         if (~(var4 + var10) < ~class252.field3194) {
            var10 = -var4 + class252.field3194;
         }

         if (var10 < 0) {
            var10 = 0;
         }

         int var11 = arg0;
         if (class41.field479 < var7 + arg0) {
            var11 = -var7 + class41.field479;
         }

         class441.field6118 = var10;
         if (~var11 > -1) {
            var11 = 0;
         }

         class67.field776 = var4;
         class666.field9473 = true;
         class604.field8417 = var11;
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field4962[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hs",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2734(byte arg0) {
      try {
         if (arg0 == 71) {
            field4954 = null;
            field4961 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4962[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hs",
      name = "<init>",
      descriptor = "([I[I[I[[F)V"
   )
   public class346(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
      try {
         this.field4955 = arg3;
         this.field4958 = arg1;
         this.field4959 = arg0;
         this.field4956 = arg2;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4962[0] + (arg0 != null ? field4962[2] : field4962[1]) + ',' + (arg1 != null ? field4962[2] : field4962[1]) + ',' + (arg2 != null ? field4962[2] : field4962[1]) + ',' + (arg3 != null ? field4962[2] : field4962[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2735(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2736(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 57;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
