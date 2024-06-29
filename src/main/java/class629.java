import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class629 {
   @OriginalMember(
      owner = "client!cf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9157 = new String[]{method4537(method4536("\nzJ\fM")), method4537(method4536("Io\r7\u0000S")), method4537(method4536("\u000er\u0014\u007fE\u0019s\u0017w")), method4537(method4536("\u000er\u0014yE\u001cw^")), method4537(method4536("\u000er\u0014|E\u0019s\u0017w")), method4537(method4536("\nzJ\bM")), method4537(method4536("Il\u0017$\u001f\f&")), method4537(method4536("\u000er\u0014~E\u0004u\u0017w")), method4537(method4536("\nzJ\tM")), method4537(method4536("\u00122Jc\u0018")), method4537(method4536("\nzJ\u000eM")), method4537(method4536("\u0007i\b!")), method4537(method4536("\nzJ\u000fM"))};
   @OriginalMember(
      owner = "client!cf",
      name = "e",
      descriptor = "Lsda;"
   )
   public static class269 field9151 = new class269(9, -1);
   @OriginalMember(
      owner = "client!cf",
      name = "g",
      descriptor = "Lum;"
   )
   public static class550 field9155 = new class550();
   @OriginalMember(
      owner = "client!cf",
      name = "a",
      descriptor = "Lsda;"
   )
   public static class269 field9156 = new class269(59, 1);
   @OriginalMember(
      owner = "client!cf",
      name = "b",
      descriptor = "I"
   )
   public static int field9150;
   @OriginalMember(
      owner = "client!cf",
      name = "f",
      descriptor = "I"
   )
   public static int field9152;
   @OriginalMember(
      owner = "client!cf",
      name = "d",
      descriptor = "I"
   )
   public static int field9153;
   @OriginalMember(
      owner = "client!cf",
      name = "c",
      descriptor = "I"
   )
   public static int field9154;

   @OriginalMember(
      owner = "client!cf",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4531(byte arg0) {
      try {
         field9151 = null;
         if (arg0 != -85) {
            method4535(-80);
         }

         field9156 = null;
         field9155 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9157[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cf",
      name = "a",
      descriptor = "(BIIIIII)V"
   )
   public static final void method4532(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         if (class261.field3566.field9430.method1271(86) != 0 && ~arg3 != -1 && class130.field1612 < 50 && ~arg1 != 0) {
            class321.field4575[class130.field1612++] = new class581((byte)1, arg1, arg3, arg5, arg6, arg4, arg2, (class616)null);
         }

         if (arg0 == -98) {
            ++field9152;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field9157[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cf",
      name = "a",
      descriptor = "(BLeaa;ZLjava/lang/String;)Lpga;"
   )
   public static final class560 method4533(byte arg0, class526 arg1, boolean arg2, String arg3) {
      int var4 = client.field4530;

      try {
         ++field9154;
         if (arg0 < 57) {
            method4532((byte)106, 55, 62, -32, -103, -90, 24);
         }

         int var5 = arg1.method3902(arg3, 64);
         if (~var5 == 0) {
            return new class560(0);
         } else {
            int[] var6 = arg1.method3894(true, var5);
            class560 var7 = new class560(var6.length);
            int var8 = 0;
            int var9 = 0;
            class128 var10;
            int var11;
            int var12;
            int var13;
            class560 var10000;
            if (var4 != 0) {
               var10 = new class128(arg1.method3899(-92, var6[var9++], var5));
               var11 = var10.method1041(4758);
               var12 = var10.method1038((byte)-98);
               var13 = var10.method1104(255);
               if (!arg2) {
                  if (var13 != 1) {
                     var7.field8373[var8] = var11;
                     var7.field8380[var8] = var12;
                     ++var8;
                     if (var4 != 0) {
                        --var7.field8378;
                        var10000 = var7;
                     } else {
                        var10000 = var7;
                     }
                  } else {
                     --var7.field8378;
                     var10000 = var7;
                  }
               } else {
                  var7.field8373[var8] = var11;
                  var7.field8380[var8] = var12;
                  ++var8;
                  if (var4 != 0) {
                     --var7.field8378;
                     var10000 = var7;
                  } else {
                     var10000 = var7;
                  }
               }
            } else {
               var10000 = var7;
            }

            do {
               while(var10000.field8378 > var8) {
                  var10 = new class128(arg1.method3899(-92, var6[var9++], var5));
                  var11 = var10.method1041(4758);
                  var12 = var10.method1038((byte)-98);
                  var13 = var10.method1104(255);
                  if (!arg2) {
                     if (var13 != 1) {
                        var7.field8373[var8] = var11;
                        var7.field8380[var8] = var12;
                        ++var8;
                        if (var4 != 0) {
                           --var7.field8378;
                           var10000 = var7;
                        } else {
                           var10000 = var7;
                        }
                     } else {
                        --var7.field8378;
                        var10000 = var7;
                     }
                  } else {
                     var7.field8373[var8] = var11;
                     var7.field8380[var8] = var12;
                     ++var8;
                     if (var4 != 0) {
                        --var7.field8378;
                        var10000 = var7;
                     } else {
                        var10000 = var7;
                     }
                  }
               }

               var10000 = var7;
            } while(var4 != 0);

            return var7;
         }
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field9157[10] + arg0 + ',' + (arg1 != null ? field9157[9] : field9157[11]) + ',' + arg2 + ',' + (arg3 != null ? field9157[9] : field9157[11]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cf",
      name = "a",
      descriptor = "(ZLku;I)V"
   )
   public static final void method4534(boolean arg0, class395 arg1, int arg2) {
      int var3 = client.field4530;

      try {
         label118: {
            ++field9153;
            if (!arg1.field6013) {
               if (!arg1.field6002 || ~arg1.field6011 > -2 || arg1.field6010 < 1 || ~arg1.field6011 < ~(class323.field4603 + -2) || ~(class178.field2197 + -2) > ~arg1.field6010 || arg1.field6008 >= 0 && !class384.method2953(arg1.field6008, -30, arg1.field6000)) {
                  break label118;
               }

               label109: {
                  if (arg0) {
                     class41.method286(arg1.field6006, arg1.field6010, -2, arg1.field6011, arg1.field6012, arg1.field6007);
                     if (var3 == 0) {
                        break label109;
                     }
                  }

                  class788.method5655(arg1.field6006, arg1.field6007, arg1.field6011, arg1.field6010, -2, arg1.field6005, arg1.field6000, -1, arg1.field6008);
               }

               arg1.field6002 = false;
               if (arg0 || ~arg1.field6009 != ~arg1.field6008 || ~arg1.field6009 != 0) {
                  if (arg0 || arg1.field6009 != arg1.field6008 || ~arg1.field6005 != ~arg1.field6001 || ~arg1.field6003 != ~arg1.field6000) {
                     break label118;
                  }

                  arg1.method2720(0);
                  if (var3 == 0) {
                     break label118;
                  }
               }

               arg1.method2720(0);
               if (var3 == 0) {
                  break label118;
               }
            }

            if (~arg1.field6009 > -1 || class384.method2953(arg1.field6009, -92, arg1.field6003)) {
               label71: {
                  if (arg0) {
                     class41.method286(arg1.field6006, arg1.field6010, -2, arg1.field6011, (class661)null, arg1.field6007);
                     if (var3 == 0) {
                        break label71;
                     }
                  }

                  class788.method5655(arg1.field6006, arg1.field6007, arg1.field6011, arg1.field6010, -2, arg1.field6001, arg1.field6003, -1, arg1.field6009);
               }

               arg1.method2720(0);
            }
         }

         if (arg2 <= 56) {
            field9155 = null;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field9157[12] + arg0 + ',' + (arg1 != null ? field9157[9] : field9157[11]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cf",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4535(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4536(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4537(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
