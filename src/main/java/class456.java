import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class456 {
   @OriginalMember(
      owner = "client!mea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6256 = new String[]{method3357(method3356("%~\u0000^;`")), method3357(method3356("%~\u0000^8`")), method3357(method3356("35O^\u0004")), method3357(method3356("&n\r\u001c"))};
   @OriginalMember(
      owner = "client!mea",
      name = "b",
      descriptor = "I"
   )
   public static int field6254 = 0;
   @OriginalMember(
      owner = "client!mea",
      name = "d",
      descriptor = "I"
   )
   public static int field6252 = 0;
   @OriginalMember(
      owner = "client!mea",
      name = "e",
      descriptor = "D"
   )
   public static double field6255;
   @OriginalMember(
      owner = "client!mea",
      name = "f",
      descriptor = "I"
   )
   public static int field6250;
   @OriginalMember(
      owner = "client!mea",
      name = "a",
      descriptor = "I"
   )
   public static int field6251;
   @OriginalMember(
      owner = "client!mea",
      name = "c",
      descriptor = "I"
   )
   public static int field6253;

   @OriginalMember(
      owner = "client!mea",
      name = "a",
      descriptor = "(ILaha;[I[I[I)V"
   )
   public static final void method3354(int arg0, class404 arg1, int[] arg2, int[] arg3, int[] arg4) {
      boolean var5 = client.field4273;

      try {
         int var6 = 0;
         int var10000;
         if (var5) {
            var10000 = arg2[var6];
         } else if (~arg2.length >= ~var6) {
            var10000 = arg0;
            if (!var5) {
               if (arg0 != 24714) {
                  method3354(111, (class404)null, (int[])null, (int[])null, (int[])null);
               }

               ++field6253;
               return;
            }
         } else {
            var10000 = arg2[var6];
         }

         while(true) {
            int var10001;
            label188:
            while(true) {
               label186: {
                  int var7 = var10000;
                  int var8 = arg4[var6];
                  int var9 = arg3[var6];
                  int var10 = 0;
                  if (!var5) {
                     if (~var8 == -1) {
                        ++var6;
                        var10000 = ~arg2.length;
                        var10001 = ~var6;
                        break label186;
                     }

                     var10000 = arg1.field7757.length;
                     var10001 = var10;
                     if (var5) {
                        break;
                     }

                     if (var10000 <= var10) {
                        ++var6;
                        var10000 = ~arg2.length;
                        var10001 = ~var6;
                        break label186;
                     }
                  }

                  while(true) {
                     if (~(var8 & 1) != -1) {
                        if (var7 != -1) {
                           class61 var11 = class392.field5479.method1477(1, var7);
                           int var12 = var11.field648;
                           class191 var13 = arg1.field7757[var10];
                           if (var13 != null) {
                              if (~var13.field2321 == ~var7) {
                                 if (~var12 != -1) {
                                    if (var12 == 1) {
                                       var13.field2323 = 0;
                                       var13.field2318 = 1;
                                       var13.field2324 = 0;
                                       var13.field2325 = var9;
                                       var13.field2319 = 0;
                                       if (!arg1.field7821) {
                                          class779.method5586(arg1, var11, 0, arg0 ^ -12469);
                                          if (var5 && ~var12 == -3) {
                                             var13.field2319 = 0;
                                             if (var5) {
                                                var13 = arg1.field7757[var10] = null;
                                             }
                                          }
                                       }
                                    } else if (~var12 == -3) {
                                       var13.field2319 = 0;
                                       if (var5) {
                                          var13 = arg1.field7757[var10] = null;
                                       }
                                    }
                                 } else {
                                    var13 = arg1.field7757[var10] = null;
                                 }
                              } else if (~var11.field654 <= ~class392.field5479.method1477(1, var13.field2321).field654) {
                                 var13 = arg1.field7757[var10] = null;
                              }
                           }

                           if (var13 == null) {
                              class191 var14 = arg1.field7757[var10] = new class191();
                              var14.field2321 = var7;
                              var14.field2323 = 0;
                              var14.field2325 = var9;
                              var14.field2318 = 1;
                              var14.field2324 = 0;
                              var14.field2319 = 0;
                              if (!arg1.field7821) {
                                 class779.method5586(arg1, var11, 0, -20543);
                                 if (var5) {
                                    arg1.field7757[var10] = null;
                                 }
                              }
                           }

                           var8 >>>= 1;
                           ++var10;
                        } else {
                           arg1.field7757[var10] = null;
                           var8 >>>= 1;
                           ++var10;
                        }
                     } else {
                        var8 >>>= 1;
                        ++var10;
                     }

                     if (~var8 == -1) {
                        ++var6;
                        var10000 = ~arg2.length;
                        var10001 = ~var6;
                        break;
                     }

                     var10000 = arg1.field7757.length;
                     var10001 = var10;
                     if (var5) {
                        break label188;
                     }

                     if (var10000 <= var10) {
                        ++var6;
                        var10000 = ~arg2.length;
                        var10001 = ~var6;
                        break;
                     }
                  }
               }

               if (var10000 >= var10001) {
                  var10000 = arg0;
                  if (!var5) {
                     if (arg0 != 24714) {
                        method3354(111, (class404)null, (int[])null, (int[])null, (int[])null);
                     }

                     ++field6253;
                     return;
                  }
               } else {
                  var10000 = arg2[var6];
               }
            }

            if (var10000 >= var10001) {
               var10000 = arg0;
               if (!var5) {
                  if (arg0 != 24714) {
                     method3354(111, (class404)null, (int[])null, (int[])null, (int[])null);
                  }

                  ++field6253;
                  return;
               }
            } else {
               var10000 = arg2[var6];
            }
         }
      } catch (RuntimeException var16) {
         throw class534.method3846(var16, field6256[1] + arg0 + ',' + (arg1 != null ? field6256[2] : field6256[3]) + ',' + (arg2 != null ? field6256[2] : field6256[3]) + ',' + (arg3 != null ? field6256[2] : field6256[3]) + ',' + (arg4 != null ? field6256[2] : field6256[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mea",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public static final boolean method3355(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 >= -68) {
            method3355(19, (byte)-128, 38);
         }

         ++field6250;
         return (arg0 & 458752) != 0 | class443.method3290(arg0, arg2, (byte)-116) || class430.method3224(arg2, arg0, 112);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6256[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3356(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3357(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
