import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class500 {
   @OriginalMember(
      owner = "client!kb",
      name = "d",
      descriptor = "I"
   )
   public int field6966;
   @OriginalMember(
      owner = "client!kb",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public String field6964;
   @OriginalMember(
      owner = "client!kb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6975 = new String[]{method3793(method3792("zG\b:w")), method3793(method3792("zG\b;w")), method3793(method3792("zG\b9w")), method3793(method3792("zG\b\f0BQT\u00111v\r")), method3793(method3792("\u007fPJ\u0014")), method3793(method3792("j\u000b\bV\"")), method3793(method3792("zG\bD6\u007fLRFw")), method3793(method3792("zG\b<w"))};
   @OriginalMember(
      owner = "client!kb",
      name = "l",
      descriptor = "Lrca;"
   )
   public static class37 field6967 = new class37();
   @OriginalMember(
      owner = "client!kb",
      name = "h",
      descriptor = "J"
   )
   public static long field6972 = -1L;
   @OriginalMember(
      owner = "client!kb",
      name = "j",
      descriptor = "I"
   )
   public static int field6963;
   @OriginalMember(
      owner = "client!kb",
      name = "b",
      descriptor = "I"
   )
   public static int field6965;
   @OriginalMember(
      owner = "client!kb",
      name = "c",
      descriptor = "I"
   )
   public static int field6968;
   @OriginalMember(
      owner = "client!kb",
      name = "f",
      descriptor = "I"
   )
   public static int field6969;
   @OriginalMember(
      owner = "client!kb",
      name = "g",
      descriptor = "I"
   )
   public static int field6971;
   @OriginalMember(
      owner = "client!kb",
      name = "e",
      descriptor = "I"
   )
   public static int field6974;
   @OriginalMember(
      owner = "client!kb",
      name = "i",
      descriptor = "Ltia;"
   )
   public static class17 field6973;
   @OriginalMember(
      owner = "client!kb",
      name = "k",
      descriptor = "[Lnl;"
   )
   public static class713[] field6970;

   @OriginalMember(
      owner = "client!kb",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method3788(int arg0, int arg1, int arg2) {
      boolean var3 = client.field1481;

      try {
         int var4;
         int var7;
         label111: {
            ++field6963;
            var4 = class492.field6871.method139(46, class606.field8927.method4490(class782.field11389, -16777216));
            int var10000;
            if (!class341.field4710) {
               label103: {
                  class541 var5 = (class541)field6967.method288(0);
                  if (var3) {
                     var10000 = class653.method4796(var5, -1);
                  } else if (var5 == null) {
                     var10000 = class455.field6279 * 16;
                     if (!var3) {
                        break label103;
                     }
                  } else {
                     var10000 = class653.method4796(var5, -1);
                  }

                  while(true) {
                     int var6 = var10000;
                     if (var6 > var4) {
                        var4 = var6;
                     }

                     var5 = (class541)field6967.method290(17958);
                     if (var5 == null) {
                        var10000 = class455.field6279 * 16;
                        if (!var3) {
                           break;
                        }
                     } else {
                        var10000 = class653.method4796(var5, -1);
                     }
                  }
               }

               class99.field1314 = var10000 - -(class476.field6634 ? 26 : 22);
               var4 += 8;
               var7 = class455.field6279 * 16 + 21;
               if (!var3) {
                  break label111;
               }
            }

            label82: {
               class438 var8 = (class438)class723.field10572.method5265(-127);
               if (var3) {
                  var10000 = var8.field5970;
               } else if (var8 == null) {
                  var10000 = class476.field6634;
                  if (!var3) {
                     break label82;
                  }
               } else {
                  var10000 = var8.field5970;
               }

               while(true) {
                  int var9;
                  if (var10000 == 1) {
                     var9 = class653.method4796((class541)var8.field5971.field10622.field272, -1);
                     if (var3) {
                        var9 = class125.method1084(var8, 30623);
                     }
                  } else {
                     var9 = class125.method1084(var8, 30623);
                  }

                  if (var9 > var4) {
                     var4 = var9;
                  }

                  var8 = (class438)class723.field10572.method5266(false);
                  if (var8 == null) {
                     var10000 = class476.field6634;
                     if (!var3) {
                        break;
                     }
                  } else {
                     var10000 = var8.field5970;
                  }
               }
            }

            class99.field1314 = (var10000 != 0 ? 26 : 22) + class254.field3207 * 16;
            var4 += 8;
            var7 = class254.field3207 * 16 + 21;
         }

         int var10 = -(var4 / 2) + arg1;
         if (~class204.field2605 > ~(var4 + var10)) {
            var10 = -var4 + class204.field2605;
         }

         if (var10 < 0) {
            var10 = 0;
         }

         int var11 = arg2;
         if (~class91.field1242 > ~(var7 + arg2)) {
            var11 = -var7 + class91.field1242;
         }

         class664.field9834 = var10;
         if (var11 < 0) {
            var11 = 0;
         }

         class338.field4629 = var11;
         int var12 = 66 % ((arg0 - -68) / 49);
         class457.field6293 = var4;
         class652.field9742 = true;
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field6975[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kb",
      name = "a",
      descriptor = "(IIB)I"
   )
   public static final int method3789(int arg0, int arg1, byte arg2) {
      boolean var3 = client.field1481;

      try {
         if (arg1 < arg0) {
            int var4 = arg1;
            arg1 = arg0;
            arg0 = var4;
         }

         ++field6965;
         int var5;
         if (var3) {
            var5 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var5;
         }

         while(true) {
            int var10000;
            int var10001;
            if (arg0 == 0) {
               var10000 = arg2;
               var10001 = 111;
               if (!var3) {
                  if (arg2 != 111) {
                     field6967 = null;
                  }

                  return arg1;
               }
            } else {
               var10000 = arg1;
               var10001 = arg0;
            }

            var5 = var10000 % var10001;
            arg1 = arg0;
            arg0 = var5;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field6975[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kb",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field6971;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6975[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!kb",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V"
   )
   public class500(String arg0, String arg1, int arg2) {
      try {
         this.field6966 = arg2;
         this.field6964 = arg0;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field6975[6] + (arg0 != null ? field6975[5] : field6975[4]) + ',' + (arg1 != null ? field6975[5] : field6975[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kb",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3790(int arg0) {
      try {
         field6973 = null;
         if (arg0 >= 8) {
            field6967 = null;
            field6970 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6975[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kb",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3791(byte arg0) {
      try {
         ++field6968;
         if (!class237.field3000) {
            class784.field11461 += (-class784.field11461 + -24.0F) / 2.0F;
            class193.field2447 = true;
            if (arg0 != -125) {
               field6967 = null;
            }

            class237.field3000 = true;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6975[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3792(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 95);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3793(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 37;
            break;
         case 2:
            var10005 = 38;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 95;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
