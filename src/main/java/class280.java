import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class280 extends class606 {
   @OriginalMember(
      owner = "client!oi",
      name = "D",
      descriptor = "I"
   )
   private int field4234 = 4096;
   @OriginalMember(
      owner = "client!oi",
      name = "E",
      descriptor = "I"
   )
   private int field4240 = 0;
   @OriginalMember(
      owner = "client!oi",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4242 = new String[]{method2353(method2352("Q=wQ")), method2353(method2352("Df5\u0013-")), method2353(method2352("P!5tx")), method2353(method2352("P!5ux")), method2353(method2352("P!5|x")), method2353(method2352("P!5zx")), method2353(method2352("P!5~x")), method2353(method2352("P!5xx"))};
   @OriginalMember(
      owner = "client!oi",
      name = "I",
      descriptor = "Lhha;"
   )
   public static class724 field4237 = new class724(66, 4);
   @OriginalMember(
      owner = "client!oi",
      name = "H",
      descriptor = "I"
   )
   public static int field4235;
   @OriginalMember(
      owner = "client!oi",
      name = "J",
      descriptor = "I"
   )
   public static int field4236;
   @OriginalMember(
      owner = "client!oi",
      name = "F",
      descriptor = "I"
   )
   public static int field4238;
   @OriginalMember(
      owner = "client!oi",
      name = "K",
      descriptor = "I"
   )
   public static int field4239;
   @OriginalMember(
      owner = "client!oi",
      name = "G",
      descriptor = "I"
   )
   public static int field4241;

   @OriginalMember(
      owner = "client!oi",
      name = "<init>",
      descriptor = "()V"
   )
   public class280() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!oi",
      name = "a",
      descriptor = "(ILcu;)V"
   )
   public static final void method2348(int arg0, class65 arg1) {
      boolean var2 = client.field10022;

      try {
         ++field4235;
         if (arg1.field942.length + -arg1.field945 >= 1) {
            int var3 = arg1.method665(false);
            if (var3 >= 0 && var3 <= 1) {
               if (~(arg1.field942.length + -arg1.field945) <= -3) {
                  int var4 = arg1.method685(-2);
                  if (~(var4 * 6) >= ~(arg1.field942.length - arg1.field945)) {
                     int var5 = arg0;
                     if (var2 || ~arg0 > ~var4) {
                        do {
                           int var6 = arg1.method685(arg0 ^ -2);
                           int var7 = arg1.method701(255);
                           if (~class436.field6379.length < ~var6) {
                              if (!class785.field11459[var6] && !var2) {
                                 ++var5;
                              } else if (~class767.field11013.method3584(98, var6).field3698 == -50) {
                                 if (~var7 <= 0) {
                                    if (~var7 < -2) {
                                       if (var2) {
                                          class436.field6379[var6] = var7;
                                          ++var5;
                                       } else {
                                          ++var5;
                                       }
                                    } else {
                                       class436.field6379[var6] = var7;
                                       ++var5;
                                    }
                                 } else {
                                    ++var5;
                                 }
                              } else {
                                 class436.field6379[var6] = var7;
                                 ++var5;
                              }
                           } else {
                              ++var5;
                           }
                        } while(~var5 > ~var4);

                     }
                  }
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field4242[5] + arg0 + ',' + (arg1 != null ? field4242[1] : field4242[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oi",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method2349(int arg0) {
      try {
         if (arg0 != 6) {
            field4237 = null;
         }

         field4237 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4242[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oi",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method9(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field4239;
         if (arg0 != 0) {
            field4237 = null;
         }

         int[] var4 = super.field8645.method2632(arg1, 27230);
         if (super.field8645.field4884) {
            int[] var5 = this.method4463(arg1, 13064, 0);
            int var6 = 0;
            if (var3 || class563.field8014 > var6) {
               do {
                  int var7 = var5[var6];
                  var4[var6] = this.field4240 <= var7 ? (~this.field4234 > ~var7 ? 0 : 4096) : 0;
                  ++var6;
               } while(class563.field8014 > var6);
            }
         }

         return var4;
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field4242[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oi",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         label37: {
            label36: {
               if (~arg1 != -1) {
                  if (~arg1 != -2) {
                     break label37;
                  }

                  if (!var4) {
                     break label36;
                  }
               }

               this.field4240 = arg0.method685(-2);
               if (!var4) {
                  break label37;
               }
            }

            this.field4234 = arg0.method685(-2);
         }

         if (arg2 >= -6) {
            this.field4234 = 45;
         }

         ++field4236;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field4242[4] + (arg0 != null ? field4242[1] : field4242[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oi",
      name = "b",
      descriptor = "(III)I"
   )
   public static final int method2350(int arg0, int arg1, int arg2) {
      try {
         ++field4238;
         if (~arg1 != -2 && arg1 != 3) {
            if (arg2 != 3) {
               field4237 = null;
            }

            return class55.field801[arg0 & 3];
         } else {
            return class384.field5597[arg0 & 3];
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4242[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oi",
      name = "a",
      descriptor = "(Laea;[IZI[II)Lru;"
   )
   public static final class61 method2351(class678 arg0, int[] arg1, boolean arg2, int arg3, int[] arg4, int arg5) {
      boolean var6 = client.field10022;

      try {
         ++field4241;
         byte[] var7 = new byte[arg3 * arg5];
         if (!arg2) {
            return null;
         } else {
            int var8 = 0;
            if (!var6 && var8 >= arg3) {
               return new class61(arg0, arg5, arg3, var7);
            } else {
               do {
                  int var9 = arg5 * var8 + arg4[var8];
                  int var10 = 0;
                  if (var6) {
                     var7[var9++] = -1;
                     ++var10;
                  }

                  while(true) {
                     while(~arg1[var8] < ~var10) {
                        var7[var9++] = -1;
                        ++var10;
                     }

                     if (!var6) {
                        ++var8;
                        break;
                     }

                     ++var10;
                  }
               } while(var8 < arg3);

               return new class61(arg0, arg5, arg3, var7);
            }
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field4242[2] + (arg0 != null ? field4242[1] : field4242[0]) + ',' + (arg1 != null ? field4242[1] : field4242[0]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4242[1] : field4242[0]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2352(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2353(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 61;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
