import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nja")
public class class453 {
   @OriginalMember(
      owner = "client!nja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6631 = new String[]{method3415(method3414("sW\u0010hQ5")), method3415(method3414("sW\u0010hR5")), method3415(method3414("sW\u0010hP5"))};
   @OriginalMember(
      owner = "client!nja",
      name = "c",
      descriptor = "[C"
   )
   private static char[] field6629 = new char[64];
   @OriginalMember(
      owner = "client!nja",
      name = "a",
      descriptor = "I"
   )
   public static int field6627;
   @OriginalMember(
      owner = "client!nja",
      name = "d",
      descriptor = "I"
   )
   public static int field6628;
   @OriginalMember(
      owner = "client!nja",
      name = "b",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field6630;

   @OriginalMember(
      owner = "client!nja",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3411(byte arg0) {
      try {
         ++field6628;
         class475.field6939 = -1;
         class743.field10700 = 1;
         String var1 = null;
         if (class780.field11425 != null) {
            class473 var2 = new class473(class780.field11425);
            var1 = class166.method1512(true, var2.method3523(-116));
            class749.field10797 = var2.method3523(-113);
         }

         if (var1 == null) {
            class359.method2826((byte)-113, 35);
         } else {
            class672.method4915("", (byte)121, false, true, var1);
            if (arg0 != 40) {
               field6630 = null;
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6631[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nja",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public static final void method3412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field4564;

      try {
         ++field6627;
         int var7 = 0;
         int var8 = arg3;
         int var9 = arg5 * arg5;
         int var10 = arg3 * arg3;
         int var11 = var10 << 1;
         int var12 = var9 << 1;
         int var13 = arg3 << 1;
         int var14 = (-var13 + 1) * var9 - -var11;
         if (arg2 != 1184079329) {
            method3411((byte)16);
         }

         int var15 = var10 - (var13 + -1) * var12;
         int var16 = var9 << 2;
         int var17 = var10 << 2;
         int var18 = ((var7 << 1) + 3) * var11;
         int var19 = ((arg3 << 1) - 3) * var12;
         int var20 = (var7 + 1) * var17;
         if (~class3.field16 >= ~arg1 && class581.field8354 >= arg1) {
            int var21 = class741.method5346(arg4 + arg5, class515.field7502, class130.field2163, -1);
            int var22 = class741.method5346(-arg5 + arg4, class515.field7502, class130.field2163, -1);
            class18.method132(false, var22, var21, arg0, class448.field6542[arg1]);
         }

         int var23 = (arg3 + -1) * var16;
         int var10000;
         int var10001;
         if (var6) {
            var10000 = ~var14;
            var10001 = -1;
         } else {
            if (~arg3 >= -1) {
               return;
            }

            var10000 = ~var14;
            var10001 = -1;
         }

         while(true) {
            while(true) {
               label81: {
                  if (var10000 > var10001) {
                     if (var6) {
                        var14 += var18;
                        var15 += var20;
                        var18 += var17;
                        var20 += var17;
                        ++var7;
                     }
                  } else {
                     var10000 = var15;
                     if (!var6) {
                        break label81;
                     }

                     var20 = var15;
                     ++var7;
                  }

                  while(true) {
                     while(~var14 > -1) {
                        var14 += var18;
                        var15 += var20;
                        var18 += var17;
                        var20 += var17;
                        ++var7;
                     }

                     var10000 = var15;
                     if (!var6) {
                        break;
                     }

                     var20 = var15;
                     ++var7;
                  }
               }

               if (var10000 < 0) {
                  var15 += var20;
                  var14 += var18;
                  var20 += var17;
                  ++var7;
                  var18 += var17;
               }

               var14 += -var23;
               var15 += -var19;
               --var8;
               var19 -= var16;
               var23 -= var16;
               int var24 = arg1 - var8;
               int var25 = arg1 + var8;
               if (var25 < class3.field16) {
                  break;
               }

               var10000 = var24;
               var10001 = class581.field8354;
               if (!var6) {
                  if (var24 <= var10001) {
                     int var26 = class741.method5346(arg4 + var7, class515.field7502, class130.field2163, -1);
                     int var27 = class741.method5346(-var7 + arg4, class515.field7502, class130.field2163, -1);
                     if (class3.field16 <= var24) {
                        class18.method132(false, var27, var26, arg0, class448.field6542[var24]);
                     }

                     if (var25 <= class581.field8354) {
                        class18.method132(false, var27, var26, arg0, class448.field6542[var25]);
                     }
                  }
                  break;
               }
            }

            if (~var8 >= -1) {
               return;
            }

            var10000 = ~var14;
            var10001 = -1;
         }
      } catch (RuntimeException var29) {
         throw class608.method4462(var29, field6631[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nja",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3413(boolean arg0) {
      try {
         if (!arg0) {
            field6630 = null;
         }

         field6630 = null;
         field6629 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6631[2] + arg0 + ')');
      }
   }

   static {
      for(int var0 = 0; var0 < 26; ++var0) {
         field6629[var0] = (char)(var0 + 65);
      }

      for(int var1 = 26; var1 < 52; ++var1) {
         field6629[var1] = (char)(var1 + 71);
      }

      for(int var2 = 52; var2 < 62; ++var2) {
         field6629[var2] = (char)(var2 + 48 + -52);
      }

      field6629[63] = '/';
      field6629[62] = '+';
   }

   @OriginalMember(
      owner = "client!nja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3414(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3415(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 29;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
