import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class583 {
   @OriginalMember(
      owner = "client!nda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8646 = new String[]{method4304(method4303("\u0016\u001bvJ\u0001")), method4304(method4303("\u0003Q9J8E")), method4304(method4303("\u0003@4\b")), method4304(method4303("\u0003Q9J?E")), method4304(method4303("\u0003Q9J\b\u0002f,\u0016\u0015\u0003Rp")), method4304(method4303("\u0003Q9J=E")), method4304(method4303("\u0003Q9J9E"))};
   @OriginalMember(
      owner = "client!nda",
      name = "e",
      descriptor = "I"
   )
   public static int field8641;
   @OriginalMember(
      owner = "client!nda",
      name = "c",
      descriptor = "I"
   )
   public static int field8643;
   @OriginalMember(
      owner = "client!nda",
      name = "d",
      descriptor = "I"
   )
   public static int field8644;
   @OriginalMember(
      owner = "client!nda",
      name = "b",
      descriptor = "I"
   )
   public static int field8645;
   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "[[B"
   )
   public static byte[][] field8642;

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(BLhv;)V",
      line = 6
   )
   public static final void method4298(byte arg0, class544 arg1) {
      try {
         ++field8643;
         if (class367.field5530) {
            ++class678.field10206;
            if (arg1.field8013 != null) {
               class544 var2 = class241.method1793(arg0 ^ 10, class200.field2500, class209.field2658);
               if (var2 != null) {
                  class662 var3 = new class662();
                  var3.field9589 = arg1;
                  var3.field9585 = var2;
                  var3.field9595 = arg1.field8013;
                  class265.method2019(var3);
               }
            }

            class180 var4 = class486.method3603(class706.field10566, (byte)-42, class48.field583);
            var4.field2211.method1094(-45, arg1.field8054);
            var4.field2211.method1103(arg1.field8048, -37);
            var4.field2211.method1079(class209.field2658, 1856);
            var4.field2211.method1051((byte)-128, class200.field2500);
            var4.field2211.method1081(arg0 ^ -139, arg1.field7969);
            var4.field2211.method1096((byte)-107, class192.field2407);
            class763.method5527(false, var4);
            if (arg0 != -11) {
               method4300(-92);
            }
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field8646[5] + arg0 + ',' + (arg1 != null ? field8646[0] : field8646[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(IIIIIB)V",
      line = 48
   )
   public static final void method4299(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
      int var6 = client.field4530;

      try {
         if (arg5 < 19) {
            method4299(-77, 44, 94, 49, 117, (byte)-124);
         }

         if (~class22.field234 <= ~arg3 && ~arg0 <= ~class506.field7472) {
            label165: {
               boolean var7;
               label145: {
                  if (~arg1 <= ~class197.field2442) {
                     if (~class100.field1232 > ~arg1) {
                        var7 = false;
                        arg1 = class100.field1232;
                        if (var6 == 0) {
                           break label145;
                        }
                     }

                     var7 = true;
                     if (var6 == 0) {
                        break label145;
                     }
                  }

                  arg1 = class197.field2442;
                  var7 = false;
               }

               boolean var8;
               label155: {
                  if (~arg2 > ~class197.field2442) {
                     var8 = false;
                     arg2 = class197.field2442;
                     if (var6 == 0) {
                        break label155;
                     }
                  }

                  if (class100.field1232 >= arg2) {
                     var8 = true;
                     if (var6 == 0) {
                        break label155;
                     }
                  }

                  arg2 = class100.field1232;
                  var8 = false;
               }

               label129: {
                  if (class506.field7472 > arg3) {
                     arg3 = class506.field7472;
                     if (var6 == 0) {
                        break label129;
                     }
                  }

                  class47.method372(arg2, class292.field4077[arg3++], arg4, (byte)97, arg1);
               }

               label124: {
                  if (arg0 > class22.field234) {
                     arg0 = class22.field234;
                     if (var6 == 0) {
                        break label124;
                     }
                  }

                  class47.method372(arg2, class292.field4077[arg0--], arg4, (byte)126, arg1);
               }

               if (!var7 || !var8) {
                  if (var7) {
                     int var9 = arg3;
                     if (var6 != 0) {
                        class292.field4077[arg3][arg1] = arg4;
                        var9 = arg3 + 1;
                     }

                     while(true) {
                        while(~arg0 <= ~var9) {
                           class292.field4077[var9][arg1] = arg4;
                           ++var9;
                        }

                        if (var6 == 0) {
                           if (var6 == 0) {
                              break label165;
                           }
                           break;
                        }

                        ++var9;
                     }
                  }

                  if (!var8) {
                     break label165;
                  }

                  int var10 = arg3;
                  if (var6 != 0) {
                     class292.field4077[arg3][arg2] = arg4;
                     var10 = arg3 + 1;
                  }

                  while(true) {
                     while(var10 <= arg0) {
                        class292.field4077[var10][arg2] = arg4;
                        ++var10;
                     }

                     if (var6 == 0) {
                        if (var6 == 0) {
                           break label165;
                        }
                        break;
                     }

                     ++var10;
                  }
               }

               int var11 = arg3;
               if (var6 != 0 || arg3 <= arg0) {
                  do {
                     int[] var12 = class292.field4077[var11];
                     var12[arg1] = var12[arg2] = arg4;
                     ++var11;
                  } while(var11 <= arg0);
               }
            }
         }

         ++field8641;
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field8646[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(I)V",
      line = 155
   )
   public static void method4300(int arg0) {
      try {
         if (arg0 <= 40) {
            method4299(80, -105, 23, 123, -20, (byte)63);
         }

         field8642 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8646[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(Ljj;I)Lqj;",
      line = 166
   )
   public static final class535 method4301(class128 arg0, int arg1) {
      try {
         ++field8644;
         return arg1 != -11872 ? null : new class535(arg0.method1066(32767), arg0.method1066(32767), arg0.method1066(32767), arg0.method1066(arg1 + 44639), arg0.method1077(-33), arg0.method1104(arg1 ^ -11937));
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8646[1] + (arg0 != null ? field8646[0] : field8646[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(Lvs;ZZ)V",
      line = 177
   )
   public static final void method4302(class616 arg0, boolean arg1, boolean arg2) {
      arg0.field8997 = arg2;
      if (class667.field9877) {
         if (arg1) {
            class688.field10367[class688.field10367.length - 1].method3074(arg0, -97);
         } else {
            int var3 = class92.method846(arg0.field9006);
            int var4 = class729.field10835[2] * arg0.method6(48) / arg0.field9000;
            int var5 = class92.method846(arg0.field9006 - var4);
            int var6 = class92.method846(arg0.field9006 + var4);
            if (var5 == var6) {
               class688.field10367[var3].method3074(arg0, -5);
            } else if (var6 - var5 == 1) {
               class688.field10367[class705.field10556 + var5].method3074(arg0, -50);
            } else {
               class688.field10367[class688.field10367.length - 1].method3074(arg0, -14);
            }
         }
      } else {
         class563.method4167(arg0, class614.field8989);
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 212
   )
   public final String toString() {
      try {
         ++field8645;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8646[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4303(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4304(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 109;
            break;
         case 1:
            var10005 = 53;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
