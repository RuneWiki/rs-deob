import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class88 extends class389 {
   @OriginalMember(
      owner = "client!jv",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1152 = new String[]{method780(method779("i\u000b_]\u001f")), method780(method779("i\u000b_Y\u001f")), method780(method779("m\b\u001dp")), method780(method779("i\u000b__\u001f")), method780(method779("xS_2J")), method780(method779("i\u000b_X\u001f")), method780(method779("i\u000b_^\u001f"))};
   @OriginalMember(
      owner = "client!jv",
      name = "I",
      descriptor = "Z"
   )
   public static boolean field1148 = false;
   @OriginalMember(
      owner = "client!jv",
      name = "K",
      descriptor = "[Luv;"
   )
   public static class386[] field1150 = new class386[128];
   @OriginalMember(
      owner = "client!jv",
      name = "F",
      descriptor = "I"
   )
   public static int field1145;
   @OriginalMember(
      owner = "client!jv",
      name = "G",
      descriptor = "I"
   )
   public static int field1146;
   @OriginalMember(
      owner = "client!jv",
      name = "J",
      descriptor = "I"
   )
   public static int field1147;
   @OriginalMember(
      owner = "client!jv",
      name = "H",
      descriptor = "I"
   )
   public static int field1149;
   @OriginalMember(
      owner = "client!jv",
      name = "E",
      descriptor = "I"
   )
   public static int field1151;

   @OriginalMember(
      owner = "client!jv",
      name = "a",
      descriptor = "(Lio;II[I)Lve;"
   )
   public static final class532 method774(class464 arg0, int arg1, int arg2, int[] arg3) {
      boolean var4 = client.field4360;

      try {
         ++field1147;
         int[] var5 = null;
         int[] var6 = null;
         int[] var7 = null;
         if (arg2 >= -62) {
            field1148 = false;
         }

         float[][] var8 = null;
         if (arg0.field6676 != null) {
            int var9 = arg0.field6664;
            int[] var10 = new int[var9];
            int[] var11 = new int[var9];
            int[] var12 = new int[var9];
            int[] var13 = new int[var9];
            int[] var14 = new int[var9];
            int[] var15 = new int[var9];
            int var16 = 0;
            if (var4) {
               var10[var16] = Integer.MAX_VALUE;
               var11[var16] = -2147483647;
               var12[var16] = Integer.MAX_VALUE;
               var13[var16] = -2147483647;
               var14[var16] = Integer.MAX_VALUE;
               var15[var16] = -2147483647;
               ++var16;
            }

            while(true) {
               while(~var9 < ~var16) {
                  var10[var16] = Integer.MAX_VALUE;
                  var11[var16] = -2147483647;
                  var12[var16] = Integer.MAX_VALUE;
                  var13[var16] = -2147483647;
                  var14[var16] = Integer.MAX_VALUE;
                  var15[var16] = -2147483647;
                  ++var16;
               }

               if (!var4) {
                  int var18;
                  label167: {
                     var8 = new float[var9][];
                     var6 = new int[var9];
                     var7 = new int[var9];
                     var5 = new int[var9];
                     int var17 = 0;
                     if (var4) {
                        var18 = arg3[var17];
                     } else if (~arg1 >= ~var17) {
                        var18 = 0;
                        if (!var4) {
                           break label167;
                        }
                     } else {
                        var18 = arg3[var17];
                     }

                     while(true) {
                        if (~arg0.field6676[var18] == 0) {
                           ++var17;
                        } else {
                           int var19 = arg0.field6676[var18] & 255;
                           int var20 = 0;
                           if (!var4 && var20 >= 3) {
                              ++var17;
                           } else {
                              while(true) {
                                 short var21;
                                 if (~var20 == -1) {
                                    var21 = arg0.field6674[var18];
                                    if (var4) {
                                       if (var20 != 1) {
                                          var21 = arg0.field6663[var18];
                                          if (var4) {
                                             var21 = arg0.field6683[var18];
                                          }
                                       } else {
                                          var21 = arg0.field6683[var18];
                                       }
                                    }
                                 } else if (var20 != 1) {
                                    var21 = arg0.field6663[var18];
                                    if (var4) {
                                       var21 = arg0.field6683[var18];
                                    }
                                 } else {
                                    var21 = arg0.field6683[var18];
                                 }

                                 int var22 = arg0.field6694[var21];
                                 int var23 = arg0.field6668[var21];
                                 int var24 = arg0.field6681[var21];
                                 if (var10[var19] > var22) {
                                    var10[var19] = var22;
                                 }

                                 if (var11[var19] < var22) {
                                    var11[var19] = var22;
                                 }

                                 if (~var12[var19] < ~var23) {
                                    var12[var19] = var23;
                                 }

                                 if (var23 > var13[var19]) {
                                    var13[var19] = var23;
                                 }

                                 if (var24 < var14[var19]) {
                                    var14[var19] = var24;
                                 }

                                 if (~var15[var19] > ~var24) {
                                    var15[var19] = var24;
                                 }

                                 ++var20;
                                 if (var20 >= 3) {
                                    ++var17;
                                    break;
                                 }
                              }
                           }
                        }

                        if (~arg1 >= ~var17) {
                           var18 = 0;
                           if (!var4) {
                              break;
                           }
                        } else {
                           var18 = arg3[var17];
                        }
                     }
                  }

                  if (var4 || var18 < var9) {
                     do {
                        byte var25 = arg0.field6700[var18];
                        if (~var25 >= -1) {
                           ++var18;
                        } else {
                           float var27;
                           float var28;
                           float var29;
                           label201: {
                              var5[var18] = (var10[var18] - -var11[var18]) / 2;
                              var6[var18] = (var12[var18] + var13[var18]) / 2;
                              var7[var18] = (var14[var18] - -var15[var18]) / 2;
                              if (var25 == 1) {
                                 int var26 = arg0.field6673[var18];
                                 var27 = 64.0F / (float)arg0.field6689[var18];
                                 if (~var26 != -1) {
                                    if (var26 > 0) {
                                       var28 = 1.0F;
                                       var29 = (float)var26 / 1024.0F;
                                       if (!var4) {
                                          break label201;
                                       }
                                    }

                                    var29 = 1.0F;
                                    var28 = (float)(-var26) / 1024.0F;
                                    if (!var4) {
                                       break label201;
                                    }
                                 }

                                 var28 = 1.0F;
                                 var29 = 1.0F;
                                 if (!var4) {
                                    break label201;
                                 }
                              }

                              if (~var25 == -3) {
                                 var28 = 64.0F / (float)arg0.field6673[var18];
                                 var29 = 64.0F / (float)arg0.field6659[var18];
                                 var27 = 64.0F / (float)arg0.field6689[var18];
                                 if (!var4) {
                                    break label201;
                                 }
                              }

                              var28 = (float)arg0.field6673[var18] / 1024.0F;
                              var27 = (float)arg0.field6689[var18] / 1024.0F;
                              var29 = (float)arg0.field6659[var18] / 1024.0F;
                           }

                           var8[var18] = class788.method5690(var29, arg0.field6690[var18], var27, var28, arg0.field6684[var18], (byte)-112, arg0.field6708[var18], class556.method3988(arg0.field6655[var18], 255));
                           ++var18;
                        }
                     } while(var18 < var9);
                  }
                  break;
               }

               ++var16;
            }
         }

         return new class532(var5, var6, var7, var8);
      } catch (RuntimeException var31) {
         throw class237.method1823(var31, field1152[3] + (arg0 != null ? field1152[4] : field1152[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1152[4] : field1152[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jv",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method775(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jv",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method776(byte arg0) {
      try {
         field1150 = null;
         if (arg0 != 1) {
            method776((byte)89);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1152[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jv",
      name = "<init>",
      descriptor = "(IIIIIF)V"
   )
   public class88(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      super(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!jv",
      name = "a",
      descriptor = "(IF)V"
   )
   public final void method777(int arg0, float arg1) {
      try {
         ++field1149;
         if (arg0 != -12978) {
            field1146 = 110;
         }

         super.field5649 = arg1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1152[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jv",
      name = "a",
      descriptor = "(IBII)V"
   )
   public final void method778(int arg0, byte arg1, int arg2, int arg3) {
      try {
         super.field5639 = arg3;
         if (arg1 < -121) {
            super.field5645 = arg0;
            super.field5638 = arg2;
            ++field1145;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field1152[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method779(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method780(char[] arg0) {
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
            var10005 = 125;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
