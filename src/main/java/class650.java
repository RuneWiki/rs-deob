import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class650 {
   @OriginalMember(
      owner = "client!us",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9199 = new String[]{method4743(method4742("?'\u00165n")), method4743(method4742("?'\u00161n")), method4743(method4742("1z\u0016^;")), method4743(method4742("$!T\u001c")), method4743(method4742("?'\u00164n")), method4743(method4742("?'\u00162n")), method4743(method4742("?'\u00163n"))};
   @OriginalMember(
      owner = "client!us",
      name = "a",
      descriptor = "I"
   )
   public int field9191;
   @OriginalMember(
      owner = "client!us",
      name = "d",
      descriptor = "I"
   )
   public int field9192;
   @OriginalMember(
      owner = "client!us",
      name = "b",
      descriptor = "I"
   )
   public static int field9193;
   @OriginalMember(
      owner = "client!us",
      name = "f",
      descriptor = "I"
   )
   public static int field9194;
   @OriginalMember(
      owner = "client!us",
      name = "h",
      descriptor = "I"
   )
   public static int field9195;
   @OriginalMember(
      owner = "client!us",
      name = "e",
      descriptor = "I"
   )
   public static int field9196;
   @OriginalMember(
      owner = "client!us",
      name = "g",
      descriptor = "I"
   )
   public static int field9197;
   @OriginalMember(
      owner = "client!us",
      name = "c",
      descriptor = "I"
   )
   public int field9198;

   @OriginalMember(
      owner = "client!us",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4737(int arg0) {
      try {
         if (arg0 != 0) {
            method4739((byte)-110, (class65)null);
         }

         ++field9197;
         class513.field7285.method195(class566.field8039, class236.field3656, class405.field5959);
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9199[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!us",
      name = "a",
      descriptor = "(IIIIIIIIII)V"
   )
   public static final void method4738(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      boolean var10 = client.field10022;

      try {
         label52: {
            if (~arg6 != ~arg8 || ~arg4 != ~arg9 || ~arg3 != ~arg5 || arg0 != arg2) {
               int var11 = arg8;
               int var12 = arg4;
               int var13 = arg8 * 3;
               int var14 = arg4 * 3;
               int var15 = arg6 * 3;
               int var16 = arg9 * 3;
               int var17 = arg3 * 3;
               int var18 = arg0 * 3;
               int var19 = -var17 + var15 + arg5 - arg8;
               int var20 = -arg4 + -var18 + arg2 + var16;
               int var21 = -var15 + var17 + -var15 - -var13;
               int var22 = -var16 + var18 + var14 - var16;
               int var23 = -var13 + var15;
               int var24 = -var14 + var16;
               int var25 = 128;
               if (var10 || var25 <= 4096) {
                  do {
                     int var26 = var25 * var25 >> 12;
                     int var27 = var25 * var26 >> 12;
                     int var28 = var19 * var27;
                     int var29 = var20 * var27;
                     int var30 = var21 * var26;
                     int var31 = var22 * var26;
                     int var32 = var23 * var25;
                     int var33 = var24 * var25;
                     int var34 = arg8 - -(var28 + var32 + var30 >> 12);
                     int var35 = arg4 - -(var31 + var33 + var29 >> 12);
                     class228.method2029(var12, var34, var35, arg1, 117, var11);
                     var11 = var34;
                     var12 = var35;
                     var25 += 128;
                  } while(var25 <= 4096);
               }

               if (!var10) {
                  break label52;
               }
            }

            class228.method2029(arg4, arg5, arg2, arg1, arg7 ^ -16782, arg8);
         }

         ++field9196;
         if (arg7 == -16885) {
            ;
         }
      } catch (RuntimeException var37) {
         throw class612.method4503(var37, field9199[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!us",
      name = "a",
      descriptor = "(BLcu;)Lpi;"
   )
   public static final class217 method4739(byte arg0, class65 arg1) {
      try {
         if (arg0 != -99) {
            return null;
         } else {
            ++field9195;
            return new class217(arg1.method655((byte)75), arg1.method655((byte)99), arg1.method655((byte)45), arg1.method655((byte)124), arg1.method691((byte)-128), arg1.method665(false));
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9199[5] + arg0 + ',' + (arg1 != null ? field9199[2] : field9199[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!us",
      name = "a",
      descriptor = "(ILha;Lju;Ljca;)V"
   )
   public static final void method4740(int arg0, class17 arg1, class270 arg2, class541 arg3) {
      boolean var4 = client.field10022;

      try {
         ++field9193;
         class148 var5 = arg3.method4028(arg1, true);
         if (var5 != null) {
            int var6 = var5.method1350();
            if (var5.method1354() > var6) {
               var6 = var5.method1354();
            }

            byte var7 = 10;
            int var8 = arg2.field4132;
            int var9 = arg2.field4129;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            if (arg3.field7588 != null) {
               var10 = class537.field7543.method3426((byte)124, arg3.field7588, class720.field10314, (int[])null, (class148[])null);
               int var13 = 0;
               if (var4 || var13 < var10) {
                  do {
                     String var14 = class720.field10314[var13];
                     if (~var13 > ~(var10 + -1)) {
                        var14 = var14.substring(0, var14.length() + -4);
                     }

                     int var15 = class84.field1304.method4218(var14);
                     if (var15 > var11) {
                        var11 = var15;
                     }

                     ++var13;
                  } while(var13 < var10);
               }

               var12 = var10 * class84.field1304.method4215() + class84.field1304.method4213() / 2;
            }

            int var16;
            int var17;
            label107: {
               var16 = var6 / 2 + arg2.field4132;
               var17 = arg2.field4129;
               if (var8 >= class651.field9226 + var6) {
                  if (class651.field9222 - var6 >= var8) {
                     break label107;
                  }

                  var8 = -var6 + class651.field9222;
                  var16 = -(var11 / 2) + class651.field9222 - (var6 / 2 - (-var7 - 5));
                  if (!var4) {
                     break label107;
                  }
               }

               var8 = class651.field9226;
               var16 = var6 / 2 - (-(var11 / 2) + -5) + class651.field9226 + var7;
            }

            label100: {
               if (class651.field9236 - -var6 <= var9) {
                  if (var9 <= -var6 + class651.field9240) {
                     break label100;
                  }

                  var17 = -(var6 / 2) + -var7 + -var12 + class651.field9240;
                  var9 = -var6 + class651.field9240;
                  if (!var4) {
                     break label100;
                  }
               }

               var9 = class651.field9236;
               var17 = class651.field9236 - (-(var6 / 2) + -var7);
            }

            int var18 = 65535 & (int)(Math.atan2((double)(-arg2.field4132 + var8), (double)(-arg2.field4129 + var9)) / 3.141592653589793D * 32767.0D);
            var5.method1445((float)var6 / 2.0F + (float)var8, (float)var6 / 2.0F + (float)var9, 4096, var18);
            if (arg0 <= -42) {
               int var19 = -2;
               int var20 = -2;
               int var21 = -2;
               int var22 = -2;
               if (arg3.field7588 != null) {
                  var19 = var16 - var11 / 2 + -5;
                  var20 = var17;
                  var21 = var11 + 10 + var19;
                  var22 = var17 - -(class84.field1304.method4215() * var10) - -3;
                  if (~arg3.field7593 != -1) {
                     arg1.method223(var17, var21 - var19, 1, var19, arg3.field7593, -var17 + var22);
                  }

                  if (~arg3.field7594 != -1) {
                     arg1.method186(var21 - var19, -var17 + var22, (byte)-11, arg3.field7594, var17, var19);
                  }

                  int var23 = 0;
                  if (var4 || ~var23 > ~var10) {
                     do {
                        String var24 = class720.field10314[var23];
                        if (var10 + -1 > var23) {
                           var24 = var24.substring(0, var24.length() - 4);
                        }

                        class84.field1304.method4216(arg1, var24, var16, var17, arg3.field7587, true);
                        var17 += class84.field1304.method4215();
                        ++var23;
                     } while(~var23 > ~var10);
                  }
               }

               if (arg3.field7628 != -1 || arg3.field7588 != null) {
                  class48 var25 = new class48(arg2);
                  int var26 = var6 >> 1;
                  var25.field742 = var20;
                  var25.field731 = -var26 + var8;
                  var25.field734 = var9 - var26;
                  var25.field738 = var8 + var26;
                  var25.field732 = var9 + var26;
                  var25.field730 = var22;
                  var25.field737 = var21;
                  var25.field743 = var19;
                  class418.field6115.method2238(var25, 13);
               }

            }
         }
      } catch (RuntimeException var28) {
         throw class612.method4503(var28, field9199[1] + arg0 + ',' + (arg1 != null ? field9199[2] : field9199[3]) + ',' + (arg2 != null ? field9199[2] : field9199[3]) + ',' + (arg3 != null ? field9199[2] : field9199[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!us",
      name = "a",
      descriptor = "(BII)V"
   )
   public static final void method4741(byte arg0, int arg1, int arg2) {
      try {
         ++field9194;
         if (arg0 != 41) {
            method4739((byte)-8, (class65)null);
         }

         class111 var3 = class796.method5734(12, (long)arg2, (byte)-124);
         var3.method1087(0);
         var3.field1740 = arg1;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field9199[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!us",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4742(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!us",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4743(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 84;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
