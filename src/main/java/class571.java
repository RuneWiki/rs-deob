import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class571 {
   @OriginalMember(
      owner = "client!nd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8129 = new String[]{method4088(method4087("JBsO\u000e")), method4088(method4087("_\bs%[")), method4088(method4087("JS1g")), method4088(method4087("JBsI\u000e")), method4088(method4087("JBsH\u000e"))};
   @OriginalMember(
      owner = "client!nd",
      name = "e",
      descriptor = "I"
   )
   public static int field8123 = 0;
   @OriginalMember(
      owner = "client!nd",
      name = "a",
      descriptor = "[F"
   )
   public static float[] field8126 = new float[16384];
   @OriginalMember(
      owner = "client!nd",
      name = "d",
      descriptor = "[F"
   )
   public static float[] field8124 = new float[16384];
   @OriginalMember(
      owner = "client!nd",
      name = "f",
      descriptor = "I"
   )
   public static int field8127;
   @OriginalMember(
      owner = "client!nd",
      name = "b",
      descriptor = "I"
   )
   public static int field8128;
   @OriginalMember(
      owner = "client!nd",
      name = "c",
      descriptor = "Lkf;"
   )
   public static class266 field8125;

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; ~var2 > -16385; ++var2) {
         field8126[var2] = (float)Math.sin((double)var2 * var0);
         field8124[var2] = (float)Math.cos((double)var2 * var0);
      }

   }

   @OriginalMember(
      owner = "client!nd",
      name = "a",
      descriptor = "(IBII)I",
      line = 8
   )
   public static final int method4083(int arg0, byte arg1, int arg2, int arg3) {
      try {
         int var6 = arg3 & 3;
         ++field8128;
         if (~var6 == -1) {
            return arg0;
         } else if (arg1 != -77) {
            return 41;
         } else if (var6 == 1) {
            return 4095 - arg2;
         } else {
            return ~var6 == -3 ? -arg0 + 4095 : arg2;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8129[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "a",
      descriptor = "([I[I[IILlia;)V",
      line = 36
   )
   public static final void method4084(int[] arg0, int[] arg1, int[] arg2, int arg3, class506 arg4) {
      boolean var5 = client.field4360;

      try {
         int var6 = 0;
         int var10000;
         if (var5) {
            var10000 = arg2[var6];
         } else if (arg2.length <= var6) {
            var10000 = arg3;
            if (!var5) {
               if (arg3 != 3882) {
                  return;
               }

               ++field8127;
               return;
            }
         } else {
            var10000 = arg2[var6];
         }

         while(true) {
            int var10001;
            label187:
            while(true) {
               label185: {
                  int var7 = var10000;
                  int var8 = arg0[var6];
                  int var9 = arg1[var6];
                  int var10 = 0;
                  if (!var5) {
                     if (var8 == 0) {
                        ++var6;
                        var10000 = arg2.length;
                        var10001 = var6;
                        break label185;
                     }

                     var10000 = ~var10;
                     var10001 = ~arg4.field3809.length;
                     if (var5) {
                        break;
                     }

                     if (var10000 <= var10001) {
                        ++var6;
                        var10000 = arg2.length;
                        var10001 = var6;
                        break label185;
                     }
                  }

                  while(true) {
                     if (~(1 & var8) != -1) {
                        label195: {
                           if (~var7 == 0) {
                              arg4.field3809[var10] = null;
                              if (!var5) {
                                 var8 >>>= 1;
                                 ++var10;
                                 break label195;
                              }
                           }

                           class85 var11 = class190.field2702.method4411(var7, arg3 + -3781);
                           int var12 = var11.field1106;
                           class100 var13 = arg4.field3809[var10];
                           if (var13 != null) {
                              if (~var13.field1280 != ~var7) {
                                 if (~var11.field1107 <= ~class190.field2702.method4411(var13.field1280, 103).field1107) {
                                    var13 = arg4.field3809[var10] = null;
                                 }
                              } else if (~var12 != -1) {
                                 if (~var12 != -2) {
                                    if (var12 == 2) {
                                       var13.field1277 = 0;
                                       if (var5) {
                                          var13.field1278 = 0;
                                          var13.field1287 = 0;
                                          var13.field1277 = 0;
                                          var13.field1281 = 1;
                                          var13.field1282 = var9;
                                          if (!arg4.field3801) {
                                             class478.method3485(0, var11, 734475305, arg4);
                                             if (var5) {
                                                var13 = arg4.field3809[var10] = null;
                                             }
                                          }
                                       }
                                    }
                                 } else {
                                    var13.field1278 = 0;
                                    var13.field1287 = 0;
                                    var13.field1277 = 0;
                                    var13.field1281 = 1;
                                    var13.field1282 = var9;
                                    if (!arg4.field3801) {
                                       class478.method3485(0, var11, 734475305, arg4);
                                       if (var5) {
                                          var13 = arg4.field3809[var10] = null;
                                       }
                                    }
                                 }
                              } else {
                                 var13 = arg4.field3809[var10] = null;
                              }
                           }

                           if (var13 == null) {
                              class100 var14 = arg4.field3809[var10] = new class100();
                              var14.field1281 = 1;
                              var14.field1287 = 0;
                              var14.field1278 = 0;
                              var14.field1280 = var7;
                              var14.field1282 = var9;
                              var14.field1277 = 0;
                              if (!arg4.field3801) {
                                 class478.method3485(0, var11, 734475305, arg4);
                              }
                           }

                           var8 >>>= 1;
                           ++var10;
                        }
                     } else {
                        var8 >>>= 1;
                        ++var10;
                     }

                     if (var8 == 0) {
                        ++var6;
                        var10000 = arg2.length;
                        var10001 = var6;
                        break;
                     }

                     var10000 = ~var10;
                     var10001 = ~arg4.field3809.length;
                     if (var5) {
                        break label187;
                     }

                     if (var10000 <= var10001) {
                        ++var6;
                        var10000 = arg2.length;
                        var10001 = var6;
                        break;
                     }
                  }
               }

               if (var10000 <= var10001) {
                  var10000 = arg3;
                  if (!var5) {
                     if (arg3 != 3882) {
                        return;
                     }

                     ++field8127;
                     return;
                  }
               } else {
                  var10000 = arg2[var6];
               }
            }

            if (var10000 <= var10001) {
               var10000 = arg3;
               if (!var5) {
                  if (arg3 != 3882) {
                     return;
                  }

                  ++field8127;
                  return;
               }
            } else {
               var10000 = arg2[var6];
            }
         }
      } catch (RuntimeException var16) {
         throw class237.method1823(var16, field8129[0] + (arg0 != null ? field8129[1] : field8129[2]) + ',' + (arg1 != null ? field8129[1] : field8129[2]) + ',' + (arg2 != null ? field8129[1] : field8129[2]) + ',' + arg3 + ',' + (arg4 != null ? field8129[1] : field8129[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "a",
      descriptor = "(B)V",
      line = 135
   )
   public static void method4085(byte arg0) {
      try {
         field8125 = null;
         field8124 = null;
         field8126 = null;
         if (arg0 < 105) {
            method4085((byte)119);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8129[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "a",
      descriptor = "(Lda;)V",
      line = 151
   )
   public static final void method4086(class67 arg0) {
      class607.field8908 = arg0;
   }

   @OriginalMember(
      owner = "client!nd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4087(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4088(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 38;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 11;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
