import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class111 {
   @OriginalMember(
      owner = "client!qda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1356 = new String[]{method950(method949("?\r\u0001\u0004.")), method950(method949("5GN\u0004\u0017l")), method950(method949("*VCF")), method950(method949("5GN\u0004\u0011l")), method950(method949("5GN\u0004\u0012l")), method950(method949("5GN\u0004\u0010l"))};
   @OriginalMember(
      owner = "client!qda",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   public static String field1351 = null;
   @OriginalMember(
      owner = "client!qda",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field1354 = false;
   @OriginalMember(
      owner = "client!qda",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field1355 = new int[]{7, 8, 9, 10, 11, 12, 13, 15};
   @OriginalMember(
      owner = "client!qda",
      name = "d",
      descriptor = "I"
   )
   public static int field1350;
   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "I"
   )
   public static int field1352;
   @OriginalMember(
      owner = "client!qda",
      name = "e",
      descriptor = "I"
   )
   public static int field1353;

   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "(IBIIII)V",
      line = 3
   )
   public static final void method945(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
      int var6 = client.field4530;

      try {
         ++field1350;
         int var7 = 0;
         if (arg1 <= 72) {
            method946(-59, 90);
         }

         int var8 = arg5;
         int var9 = arg4 * arg4;
         int var10 = arg5 * arg5;
         int var11 = var10 << 1;
         int var12 = var9 << 1;
         int var13 = arg5 << 1;
         int var14 = (-var13 + 1) * var9 + var11;
         int var15 = -((var13 - 1) * var12) + var10;
         int var16 = var9 << 2;
         int var17 = var10 << 2;
         int var18 = ((var7 << 1) - -3) * var11;
         int var19 = ((arg5 << 1) - 3) * var12;
         int var20 = (var7 + 1) * var17;
         int var21 = (arg5 + -1) * var16;
         int var10000;
         int var10001;
         if (class506.field7472 <= arg3) {
            if (~arg3 >= ~class22.field234) {
               int var22 = class768.method5559(arg2 - -arg4, class100.field1232, class197.field2442, 71);
               int var23 = class768.method5559(-arg4 + arg2, class100.field1232, class197.field2442, 71);
               class47.method372(var22, class292.field4077[arg3], arg0, (byte)102, var23);
               if (var6 != 0) {
                  var10000 = ~var14;
                  var10001 = -1;
               } else {
                  if (arg5 <= 0) {
                     return;
                  }

                  var10000 = ~var14;
                  var10001 = -1;
               }
            } else {
               if (arg5 <= 0) {
                  return;
               }

               var10000 = ~var14;
               var10001 = -1;
            }
         } else {
            if (arg5 <= 0) {
               return;
            }

            var10000 = ~var14;
            var10001 = -1;
         }

         while(true) {
            while(true) {
               byte var30;
               label97: {
                  if (var10000 > var10001) {
                     if (var6 != 0) {
                        var15 += var20;
                        var14 += var18;
                        var18 += var17;
                        ++var7;
                        var20 += var17;
                     }
                  } else {
                     var10000 = ~var15;
                     var30 = -1;
                     if (var6 == 0) {
                        break label97;
                     }

                     var20 = var10000 + -1;
                  }

                  while(true) {
                     while(var14 < 0) {
                        var15 += var20;
                        var14 += var18;
                        var18 += var17;
                        ++var7;
                        var20 += var17;
                     }

                     var10000 = ~var15;
                     var30 = -1;
                     if (var6 == 0) {
                        break;
                     }

                     var20 = var10000 + -1;
                  }
               }

               if (var10000 > var30) {
                  var14 += var18;
                  var15 += var20;
                  ++var7;
                  var20 += var17;
                  var18 += var17;
               }

               var14 += -var21;
               var15 += -var19;
               var21 -= var16;
               --var8;
               var19 -= var16;
               int var24 = -var8 + arg3;
               int var25 = arg3 + var8;
               if (~class506.field7472 < ~var25) {
                  break;
               }

               var10000 = ~class22.field234;
               var10001 = ~var24;
               if (var6 == 0) {
                  if (var10000 <= var10001) {
                     int var26 = class768.method5559(arg2 + var7, class100.field1232, class197.field2442, 71);
                     int var27 = class768.method5559(-var7 + arg2, class100.field1232, class197.field2442, 71);
                     if (class506.field7472 <= var24) {
                        class47.method372(var26, class292.field4077[var24], arg0, (byte)101, var27);
                     }

                     if (class22.field234 >= var25) {
                        class47.method372(var26, class292.field4077[var25], arg0, (byte)104, var27);
                     }
                  }
                  break;
               }
            }

            if (var8 <= 0) {
               return;
            }

            var10000 = ~var14;
            var10001 = -1;
         }
      } catch (RuntimeException var29) {
         throw class670.method4877(var29, field1356[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "(II)V",
      line = 110
   )
   public static final void method946(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "(I)V",
      line = 144
   )
   public static void method947(int arg0) {
      try {
         if (arg0 != 11163) {
            field1351 = null;
         }

         field1355 = null;
         field1351 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1356[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "(IIIIII[[[BIIIILha;I)V",
      line = 156
   )
   public static final void method948(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[][][] arg6, int arg7, int arg8, int arg9, int arg10, class66 arg11, int arg12) {
      try {
         ++field1352;
         if (arg8 != arg12 && arg4 != 0) {
            if (~arg12 == -10) {
               arg7 = 3 & arg7 + 1;
               arg12 = 1;
            }

            if (arg12 == 10) {
               arg7 = arg7 + 3 & 3;
               arg12 = 1;
            }

            if (~arg12 == -12) {
               arg12 = 8;
               arg7 = arg7 + 3 & 3;
            }

            arg11.method546(arg3, arg5, arg9, arg0, arg10, arg1, arg6[arg12 + -1][arg7], arg4, arg2);
         }
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field1356[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field1356[0] : field1356[2]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + (arg11 != null ? field1356[0] : field1356[2]) + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method949(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method950(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
