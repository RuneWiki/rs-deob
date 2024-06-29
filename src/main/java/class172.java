import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class172 {
   @OriginalMember(
      owner = "client!ll",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2579 = new String[]{method1600(method1599("w\u0003j\u000fA")), method1600(method1599("w\u0003j\tA")), method1600(method1599("`Ajc\u0014")), method1600(method1599("u\u001a(!")), method1600(method1599("w\u0003j\bA")), method1600(method1599("w\u0003j\fA")), method1600(method1599("w\u0003j\u000eA")), method1600(method1599("w\u0003j\u000bA"))};
   @OriginalMember(
      owner = "client!ll",
      name = "g",
      descriptor = "J"
   )
   public static long field2576 = -1L;
   @OriginalMember(
      owner = "client!ll",
      name = "c",
      descriptor = "Lhj;"
   )
   public static class670 field2572 = new class670();
   @OriginalMember(
      owner = "client!ll",
      name = "i",
      descriptor = "I"
   )
   public static int field2570;
   @OriginalMember(
      owner = "client!ll",
      name = "f",
      descriptor = "I"
   )
   public static int field2571;
   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "I"
   )
   public static int field2573;
   @OriginalMember(
      owner = "client!ll",
      name = "b",
      descriptor = "I"
   )
   public static int field2574;
   @OriginalMember(
      owner = "client!ll",
      name = "h",
      descriptor = "I"
   )
   public static int field2575;
   @OriginalMember(
      owner = "client!ll",
      name = "d",
      descriptor = "I"
   )
   public static int field2577;
   @OriginalMember(
      owner = "client!ll",
      name = "e",
      descriptor = "Ljava/awt/Font;"
   )
   public static Font field2578;

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "([BB)Lffa;"
   )
   public static final class248 method1593(byte[] arg0, byte arg1) {
      boolean var2 = client.field10022;

      try {
         ++field2573;
         class248 var3 = new class248();
         class65 var4 = new class65(arg0);
         var4.field945 = var4.field942.length + -2;
         int var5 = var4.method685(-2);
         int var6 = var4.field942.length + -16 - (2 - -var5);
         var4.field945 = var6;
         int var7 = var4.method701(255);
         var3.field3790 = var4.method685(-2);
         var3.field3787 = var4.method685(-2);
         var3.field3801 = var4.method685(-2);
         var3.field3795 = var4.method685(-2);
         var3.field3800 = var4.method685(-2);
         var3.field3792 = var4.method685(-2);
         int var8 = -27 / ((-7 - arg1) / 50);
         int var9 = var4.method665(false);
         if (~var9 < -1) {
            var3.field3789 = new class398[var9];
            int var10 = 0;
            if (var2 || var9 > var10) {
               do {
                  int var11 = var4.method685(-2);
                  class398 var12 = new class398(class645.method4694(var11, (byte)-128));
                  var3.field3789[var10] = var12;
                  if (var2 || var11-- > 0) {
                     do {
                        int var13 = var4.method701(255);
                        int var14 = var4.method701(255);
                        var12.method3098((long)var13, new class288(var14), -1);
                     } while(var11-- > 0);
                  }

                  ++var10;
               } while(var9 > var10);
            }
         }

         var4.field945 = 0;
         var3.field3798 = var4.method641((byte)68);
         var3.field3786 = new int[var7];
         int var15 = 0;
         if (!var2 && ~var4.field945 <= ~var6) {
            return var3;
         } else {
            do {
               int var16;
               label111: {
                  var16 = var4.method685(-2);
                  if (var16 == 3) {
                     if (var3.field3788 == null) {
                        var3.field3788 = new String[var7];
                     }

                     var3.field3788[var15] = var4.method640((byte)51).intern();
                     if (!var2) {
                        break label111;
                     }
                  }

                  if (var16 != 54) {
                     if (var3.field3794 == null) {
                        var3.field3794 = new int[var7];
                     }

                     if (~var16 <= -151 || ~var16 == -22 || var16 == 38 || ~var16 == -40) {
                        var3.field3794[var15] = var4.method665(false);
                        if (!var2) {
                           break label111;
                        }
                     }

                     var3.field3794[var15] = var4.method701(255);
                     if (!var2) {
                        break label111;
                     }
                  }

                  if (var3.field3799 == null) {
                     var3.field3799 = new long[var7];
                  }

                  var3.field3799[var15] = var4.method680(-129);
               }

               var3.field3786[var15++] = var16;
            } while(~var4.field945 > ~var6);

            return var3;
         }
      } catch (RuntimeException var18) {
         throw class612.method4503(var18, field2579[1] + (arg0 != null ? field2579[2] : field2579[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1594(int arg0) {
      try {
         class513.field7286.method1052(true);
         ++field2575;
         if (arg0 == -29908) {
            class53.field783.method1052(true);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2579[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method1595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field10022;

      try {
         label53: {
            if (arg5 == 8 || arg5 == 16) {
               if (arg5 != 8) {
                  int var8 = (arg4 << class313.field4707) + class44.field655;
                  int var9 = var8 - class44.field655;
                  int var10 = arg1 << class313.field4707;
                  int var11 = class44.field655 + var10;
                  int var12 = class558.field7922[arg6].method5400(-1, arg1, arg4 + 1);
                  int var13 = class558.field7922[arg6].method5400(-1, arg1 + 1, arg4);
                  class114.field1804[class229.field3566++] = new class662(arg5, arg6, var8, var9, var9, var8, var12, var13, -arg2 + var13, -arg2 + var12, var10, var11, var11, var10);
                  if (!var7) {
                     break label53;
                  }
               }

               int var14 = arg4 << class313.field4707;
               int var15 = class44.field655 + var14;
               int var16 = arg1 << class313.field4707;
               int var17 = class44.field655 + var16;
               int var18 = class558.field7922[arg6].method5400(-1, arg1, arg4);
               int var19 = class558.field7922[arg6].method5400(-1, arg1 + 1, arg4 + 1);
               class114.field1804[class229.field3566++] = new class662(arg5, arg6, var14, var15, var15, var14, var18, var19, -arg2 + var19, -arg2 + var18, var16, var17, var17, var16);
               if (!var7) {
                  break label53;
               }
            }

            class312 var20 = class324.field4826[arg6][arg4][arg1];
            if (var20 == null) {
               var20 = new class312(arg6);
            }

            label34: {
               if (~arg5 != -2) {
                  if (~arg5 != -3) {
                     break label34;
                  }

                  var20.field4682 = (short)arg2;
                  var20.field4684 = (short)arg3;
                  if (!var7) {
                     break label34;
                  }
               }

               var20.field4681 = (short)arg2;
               var20.field4683 = (short)arg3;
            }

            if (class703.field10124) {
               class37.method421((byte)-117);
            }
         }

         int var21 = 72 / ((arg0 - -41) / 50);
         ++field2571;
      } catch (RuntimeException var23) {
         throw class612.method4503(var23, field2579[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(Lsa;I)V"
   )
   public static final void method1596(class39 arg0, int arg1) {
      try {
         class255.field3871 = arg0;
         if (arg1 != -12521) {
            field2576 = -109L;
         }

         ++field2574;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2579[6] + (arg0 != null ? field2579[2] : field2579[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1597(int arg0) {
      try {
         if (arg0 != 0) {
            method1593((byte[])null, (byte)-108);
         }

         field2572 = null;
         field2578 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2579[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1598(int arg0, int arg1, int arg2) {
      try {
         ++field2570;
         if (arg1 >= 0 && ~arg0 <= -1 && arg1 < class644.field9070[1].length && class644.field9070[1][arg1].length > arg0) {
            if (arg2 < 71) {
               return false;
            } else {
               return (class644.field9070[1][arg1][arg0] & 2) != 0;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2579[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1599(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ll",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1600(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 27;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 68;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
