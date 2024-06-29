import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class353 extends class465 {
   @OriginalMember(
      owner = "client!on",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5361 = new String[]{method2759(method2758("952\u0002N")), method2759(method2758("952\u0000N")), method2759(method2758("952\u0006N")), method2759(method2758("952\u0005N")), method2759(method2758("952\u0007N")), method2759(method2758("952\u0004N")), method2759(method2758("952\tN")), method2759(method2758("952\u0003N"))};
   @OriginalMember(
      owner = "client!on",
      name = "g",
      descriptor = "I"
   )
   public static int field5353;
   @OriginalMember(
      owner = "client!on",
      name = "m",
      descriptor = "I"
   )
   public static int field5354;
   @OriginalMember(
      owner = "client!on",
      name = "f",
      descriptor = "I"
   )
   public static int field5355;
   @OriginalMember(
      owner = "client!on",
      name = "j",
      descriptor = "I"
   )
   public static int field5356;
   @OriginalMember(
      owner = "client!on",
      name = "h",
      descriptor = "I"
   )
   public static int field5357;
   @OriginalMember(
      owner = "client!on",
      name = "i",
      descriptor = "I"
   )
   public static int field5358;
   @OriginalMember(
      owner = "client!on",
      name = "l",
      descriptor = "I"
   )
   public static int field5359;
   @OriginalMember(
      owner = "client!on",
      name = "k",
      descriptor = "[[[Lqr;"
   )
   public static class72[][][] field5360;

   @OriginalMember(
      owner = "client!on",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method2754(int arg0) {
      try {
         if (arg0 <= 81) {
            return 55;
         } else {
            ++field5355;
            return super.field6984;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5361[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method2755(int arg0) {
      try {
         if (arg0 != -3) {
            field5360 = null;
         }

         field5360 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5361[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public static final void method2756(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      int var6 = client.field4530;

      try {
         ++field5357;
         int var7 = -arg4 + arg1;
         int var8 = -arg0 + arg5;
         if (~var7 != -1) {
            if (var8 == 0) {
               class277.method2132(arg1, arg4, -74, arg0, arg2);
            } else {
               int var9;
               int var10;
               int var11;
               int var12;
               label74: {
                  var9 = (var8 << 12) / var7;
                  var10 = -(arg4 * var9 >> 12) + arg0;
                  if (class197.field2442 <= arg4) {
                     if (class100.field1232 >= arg4) {
                        var11 = arg4;
                        var12 = arg0;
                        if (var6 == 0) {
                           break label74;
                        }
                     }

                     var12 = (class100.field1232 * var9 >> 12) + var10;
                     var11 = class100.field1232;
                     if (var6 == 0) {
                        break label74;
                     }
                  }

                  var11 = class197.field2442;
                  var12 = (class197.field2442 * var9 >> 12) + var10;
               }

               int var13;
               int var14;
               label66: {
                  if (~arg1 <= ~class197.field2442) {
                     if (~arg1 >= ~class100.field1232) {
                        var13 = arg5;
                        var14 = arg1;
                        if (var6 == 0) {
                           break label66;
                        }
                     }

                     var14 = class100.field1232;
                     var13 = (class100.field1232 * var9 >> 12) + var10;
                     if (var6 == 0) {
                        break label66;
                     }
                  }

                  var14 = class197.field2442;
                  var13 = var10 - -(class197.field2442 * var9 >> 12);
               }

               label58: {
                  if (~class506.field7472 >= ~var13) {
                     if (class22.field234 >= var13) {
                        break label58;
                     }

                     var14 = (-var10 + class22.field234 << 12) / var9;
                     var13 = class22.field234;
                     if (var6 == 0) {
                        break label58;
                     }
                  }

                  var13 = class506.field7472;
                  var14 = (-var10 + class506.field7472 << 12) / var9;
               }

               label51: {
                  if (~class506.field7472 >= ~var12) {
                     if (class22.field234 >= var12) {
                        break label51;
                     }

                     var11 = (-var10 + class22.field234 << 12) / var9;
                     var12 = class22.field234;
                     if (var6 == 0) {
                        break label51;
                     }
                  }

                  var12 = class506.field7472;
                  var11 = (-var10 + class506.field7472 << 12) / var9;
               }

               if (arg3 == 4095) {
                  class592.method4353(var12, var13, arg3 + -4039, arg2, var14, var11);
               }
            }
         } else {
            if (~var8 != -1) {
               class197.method1505(arg2, arg0, arg5, arg4, 1);
            }

         }
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field5361[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method78(int arg0) {
      try {
         ++field5354;
         return arg0 != 16726277 ? -109 : 0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5361[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "<init>",
      descriptor = "(Lsk;)V"
   )
   public class353(class648 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!on",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method77(int arg0, int arg1) {
      try {
         ++field5353;
         if (arg0 != -14812) {
            field5360 = null;
         }

         super.field6984 = arg1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5361[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method69(boolean arg0) {
      try {
         if (arg0) {
            method2757(56, 36, (byte)44, -49);
         }

         ++field5356;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5361[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "<init>",
      descriptor = "(ILsk;)V"
   )
   public class353(int arg0, class648 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method70(int arg0, byte arg1) {
      try {
         ++field5358;
         int var3 = -92 % ((-51 - arg1) / 60);
         return 1;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5361[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "(IIBI)I"
   )
   public static final int method2757(int arg0, int arg1, byte arg2, int arg3) {
      try {
         int var6 = arg3 & 3;
         ++field5359;
         if (arg2 < 38) {
            method2755(106);
         }

         if (var6 == 0) {
            return arg0;
         } else if (var6 == 1) {
            return -arg1 + 4095;
         } else {
            return ~var6 == -3 ? -arg0 + 4095 : arg1;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5361[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2758(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 102);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!on",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2759(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 102;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
