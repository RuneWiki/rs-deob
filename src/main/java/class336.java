import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class336 {
   @OriginalMember(
      owner = "client!uea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4819 = new String[]{method2668(method2667("R_Z~2\u000f")), method2668(method2667("\\\u0014\u0015~\r")), method2668(method2667("IOW<")), method2668(method2667("R_Z~1\u000f"))};
   @OriginalMember(
      owner = "client!uea",
      name = "e",
      descriptor = "Lbga;"
   )
   public static class378 field4812 = new class378(113, 1);
   @OriginalMember(
      owner = "client!uea",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field4817 = false;
   @OriginalMember(
      owner = "client!uea",
      name = "c",
      descriptor = "I"
   )
   public static int field4813;
   @OriginalMember(
      owner = "client!uea",
      name = "g",
      descriptor = "I"
   )
   public static int field4815;
   @OriginalMember(
      owner = "client!uea",
      name = "b",
      descriptor = "I"
   )
   public static int field4816;
   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "J"
   )
   public static long field4814;
   @OriginalMember(
      owner = "client!uea",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field4818;

   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "(I[I[ILpl;[I)V"
   )
   public static final void method2665(int arg0, int[] arg1, int[] arg2, class680 arg3, int[] arg4) {
      boolean var5 = client.field4273;

      try {
         ++field4813;
         int var6 = 0;
         int var10000;
         if (var5) {
            var10000 = arg1[var6];
         } else if (~var6 <= ~arg1.length) {
            var10000 = arg0;
            if (!var5) {
               if (arg0 != -2) {
                  method2665(5, (int[])null, (int[])null, (class680)null, (int[])null);
                  return;
               }

               return;
            }
         } else {
            var10000 = arg1[var6];
         }

         while(true) {
            int var10001;
            label194:
            while(true) {
               label192: {
                  int var7 = var10000;
                  int var8 = arg2[var6];
                  int var9 = arg4[var6];
                  int var10 = 0;
                  if (!var5) {
                     if (~var8 == -1) {
                        ++var6;
                        var10000 = ~var6;
                        var10001 = ~arg1.length;
                        break label192;
                     }

                     var10000 = ~var10;
                     var10001 = ~arg3.field7757.length;
                     if (var5) {
                        break;
                     }

                     if (var10000 <= var10001) {
                        ++var6;
                        var10000 = ~var6;
                        var10001 = ~arg1.length;
                        break label192;
                     }
                  }

                  while(true) {
                     if ((var8 & 1) != 0) {
                        if (var7 != -1) {
                           class61 var11 = class392.field5479.method1477(1, var7);
                           int var12 = var11.field648;
                           class191 var13 = arg3.field7757[var10];
                           if (var13 != null) {
                              if (~var13.field2321 == ~var7) {
                                 if (var12 == 0) {
                                    var13 = arg3.field7757[var10] = null;
                                 } else if (~var12 != -2) {
                                    if (~var12 == -3) {
                                       var13.field2319 = 0;
                                       if (var5) {
                                          var13.field2325 = var9;
                                          var13.field2319 = 0;
                                          var13.field2324 = 0;
                                          var13.field2318 = 1;
                                          var13.field2323 = 0;
                                          if (!arg3.field7821) {
                                             class779.method5586(arg3, var11, 0, arg0 ^ 20543);
                                             if (var5 && ~var11.field654 <= ~class392.field5479.method1477(1, var13.field2321).field654) {
                                                var13 = arg3.field7757[var10] = null;
                                             }
                                          }
                                       }
                                    }
                                 } else {
                                    var13.field2325 = var9;
                                    var13.field2319 = 0;
                                    var13.field2324 = 0;
                                    var13.field2318 = 1;
                                    var13.field2323 = 0;
                                    if (!arg3.field7821) {
                                       class779.method5586(arg3, var11, 0, arg0 ^ 20543);
                                       if (var5 && ~var11.field654 <= ~class392.field5479.method1477(1, var13.field2321).field654) {
                                          var13 = arg3.field7757[var10] = null;
                                       }
                                    }
                                 }
                              } else if (~var11.field654 <= ~class392.field5479.method1477(1, var13.field2321).field654) {
                                 var13 = arg3.field7757[var10] = null;
                              }
                           }

                           if (var13 == null) {
                              class191 var14 = arg3.field7757[var10] = new class191();
                              var14.field2324 = 0;
                              var14.field2323 = 0;
                              var14.field2319 = 0;
                              var14.field2325 = var9;
                              var14.field2318 = 1;
                              var14.field2321 = var7;
                              if (!arg3.field7821) {
                                 class779.method5586(arg3, var11, 0, -20543);
                                 if (var5) {
                                    arg3.field7757[var10] = null;
                                 }
                              }
                           }

                           var8 >>>= 1;
                           ++var10;
                        } else {
                           arg3.field7757[var10] = null;
                           var8 >>>= 1;
                           ++var10;
                        }
                     } else {
                        var8 >>>= 1;
                        ++var10;
                     }

                     if (~var8 == -1) {
                        ++var6;
                        var10000 = ~var6;
                        var10001 = ~arg1.length;
                        break;
                     }

                     var10000 = ~var10;
                     var10001 = ~arg3.field7757.length;
                     if (var5) {
                        break label194;
                     }

                     if (var10000 <= var10001) {
                        ++var6;
                        var10000 = ~var6;
                        var10001 = ~arg1.length;
                        break;
                     }
                  }
               }

               if (var10000 <= var10001) {
                  var10000 = arg0;
                  if (!var5) {
                     if (arg0 != -2) {
                        method2665(5, (int[])null, (int[])null, (class680)null, (int[])null);
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = arg1[var6];
               }
            }

            if (var10000 <= var10001) {
               var10000 = arg0;
               if (!var5) {
                  if (arg0 != -2) {
                     method2665(5, (int[])null, (int[])null, (class680)null, (int[])null);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = arg1[var6];
            }
         }
      } catch (RuntimeException var16) {
         throw class534.method3846(var16, field4819[0] + arg0 + ',' + (arg1 != null ? field4819[1] : field4819[2]) + ',' + (arg2 != null ? field4819[1] : field4819[2]) + ',' + (arg3 != null ? field4819[1] : field4819[2]) + ',' + (arg4 != null ? field4819[1] : field4819[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2666(int arg0) {
      try {
         field4818 = null;
         if (arg0 == -3) {
            field4812 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4819[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2667(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2668(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 58;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
