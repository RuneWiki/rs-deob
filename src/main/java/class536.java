import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class536 extends class247 {
   @OriginalMember(
      owner = "client!bn",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7542 = new String[]{method4000(method3999("\t\u007fb8i")), method4000(method3999("\u0005d \u0015")), method4000(method3999("\u0010?bW<")), method4000(method3999("\t\u007fb:i")), method4000(method3999("\t\u007fb<i")), method4000(method3999("\t\u007fb;i")), method4000(method3999("\t\u007fb=i"))};
   @OriginalMember(
      owner = "client!bn",
      name = "B",
      descriptor = "I"
   )
   public static int field7533 = 0;
   @OriginalMember(
      owner = "client!bn",
      name = "p",
      descriptor = "I"
   )
   public static int field7525;
   @OriginalMember(
      owner = "client!bn",
      name = "v",
      descriptor = "I"
   )
   public static int field7526;
   @OriginalMember(
      owner = "client!bn",
      name = "z",
      descriptor = "I"
   )
   public int field7527;
   @OriginalMember(
      owner = "client!bn",
      name = "j",
      descriptor = "I"
   )
   public int field7528;
   @OriginalMember(
      owner = "client!bn",
      name = "n",
      descriptor = "I"
   )
   public int field7530;
   @OriginalMember(
      owner = "client!bn",
      name = "A",
      descriptor = "I"
   )
   public static int field7531;
   @OriginalMember(
      owner = "client!bn",
      name = "u",
      descriptor = "I"
   )
   public int field7532;
   @OriginalMember(
      owner = "client!bn",
      name = "q",
      descriptor = "I"
   )
   public int field7535;
   @OriginalMember(
      owner = "client!bn",
      name = "o",
      descriptor = "I"
   )
   public int field7536;
   @OriginalMember(
      owner = "client!bn",
      name = "m",
      descriptor = "I"
   )
   public static int field7537;
   @OriginalMember(
      owner = "client!bn",
      name = "s",
      descriptor = "I"
   )
   public static int field7538;
   @OriginalMember(
      owner = "client!bn",
      name = "l",
      descriptor = "I"
   )
   public static int field7539;
   @OriginalMember(
      owner = "client!bn",
      name = "k",
      descriptor = "Ljga;"
   )
   public class91 field7524;
   @OriginalMember(
      owner = "client!bn",
      name = "w",
      descriptor = "Ljga;"
   )
   public class91 field7540;
   @OriginalMember(
      owner = "client!bn",
      name = "y",
      descriptor = "Ljava/lang/String;"
   )
   public String field7534;
   @OriginalMember(
      owner = "client!bn",
      name = "x",
      descriptor = "Z"
   )
   public boolean field7541;
   @OriginalMember(
      owner = "client!bn",
      name = "r",
      descriptor = "[I"
   )
   public static int[] field7523;
   @OriginalMember(
      owner = "client!bn",
      name = "t",
      descriptor = "[Ljava/lang/Object;"
   )
   public Object[] field7529;

   @OriginalMember(
      owner = "client!bn",
      name = "a",
      descriptor = "(B)Z"
   )
   public static final boolean method3994(byte arg0) {
      try {
         ++class478.field6882;
         class570.field8077 = true;
         ++field7537;
         return arg0 < -63;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7542[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bn",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method3995(byte arg0) {
      boolean var1 = client.field10022;

      try {
         ++field7526;
         if (class584.field8198 == null) {
            class584.field8198 = new int[65536];
            if (!var1) {
               double var2 = 0.7D + (Math.random() * 0.03D - 0.015D);
               int var4 = 0;
               if (arg0 != -3) {
                  method3998((int[])null, 115, true, 116, -10, (class678)null, 118, (byte)-77);
               }

               int var5 = 0;
               if (!var1 && ~var5 <= -513) {
                  return;
               }

               do {
                  float var6 = ((float)(var5 >> 3) / 64.0F + 0.0078125F) * 360.0F;
                  float var7 = (float)(var5 & 7) / 8.0F + 0.0625F;
                  int var8 = 0;
                  if (var1 || var8 < 128) {
                     do {
                        float var10;
                        float var11;
                        float var12;
                        label91: {
                           float var9 = (float)var8 / 128.0F;
                           var10 = 0.0F;
                           var11 = 0.0F;
                           var12 = 0.0F;
                           float var13 = var6 / 60.0F;
                           int var14 = (int)var13;
                           int var15 = var14 % 6;
                           float var16 = var13 - (float)var14;
                           float var17 = (1.0F - var7) * var9;
                           float var18 = (1.0F - var7 * var16) * var9;
                           float var19 = (1.0F - (-var16 + 1.0F) * var7) * var9;
                           if (~var15 == -1) {
                              var11 = var19;
                              var12 = var17;
                              var10 = var9;
                              if (!var1) {
                                 break label91;
                              }
                           }

                           if (var15 != 1) {
                              label70: {
                                 if (var15 != 2) {
                                    if (var15 == 3) {
                                       var10 = var17;
                                       var11 = var18;
                                       var12 = var9;
                                       if (!var1) {
                                          break label70;
                                       }
                                    }

                                    if (var15 == 4) {
                                       var11 = var17;
                                       var12 = var9;
                                       var10 = var19;
                                       if (!var1) {
                                          break label70;
                                       }
                                    }

                                    if (~var15 != -6) {
                                       break label70;
                                    }

                                    var10 = var9;
                                    var11 = var17;
                                    var12 = var18;
                                    if (!var1) {
                                       break label70;
                                    }
                                 }

                                 var11 = var9;
                                 var10 = var17;
                                 var12 = var19;
                                 if (var1) {
                                    var10 = var18;
                                    var11 = var9;
                                    var12 = var17;
                                 }
                              }
                           } else {
                              var10 = var18;
                              var11 = var9;
                              var12 = var17;
                           }
                        }

                        float var20 = (float)Math.pow((double)var10, var2);
                        float var21 = (float)Math.pow((double)var11, var2);
                        float var22 = (float)Math.pow((double)var12, var2);
                        int var23 = (int)(var20 * 256.0F);
                        int var24 = (int)(var21 * 256.0F);
                        int var25 = (int)(var22 * 256.0F);
                        int var26 = (var24 << 8) + -16777216 - (-(var23 << 16) - var25);
                        class584.field8198[var4++] = var26;
                        ++var8;
                     } while(var8 < 128);
                  }

                  ++var5;
               } while(~var5 > -513);

               return;
            }
         }

      } catch (RuntimeException var28) {
         throw class612.method4503(var28, field7542[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bn",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3996(int arg0) {
      try {
         if (arg0 == 65536) {
            field7523 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7542[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bn",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method3997(int arg0, int arg1) {
      try {
         ++field7539;
         if (~arg1 != -3 && ~arg1 != -14 && ~arg1 != -6 && arg1 != 23 && ~arg1 != -48 && arg1 != 1007) {
            if (arg0 < 112) {
               method3995((byte)-127);
            }

            return ~arg1 == -23;
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7542[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bn",
      name = "a",
      descriptor = "([IIZIILaea;IB)Lefa;"
   )
   public static final class436 method3998(int[] arg0, int arg1, boolean arg2, int arg3, int arg4, class678 arg5, int arg6, byte arg7) {
      try {
         ++field7538;
         if (arg7 >= -106) {
            method3994((byte)55);
         }

         if (arg5.field9791 || class122.method1209(arg1, -70) && class122.method1209(arg3, 124)) {
            return new class436(arg5, 3553, arg1, arg3, arg2, arg0, arg4, arg6);
         } else {
            return arg5.field9777 ? new class436(arg5, 34037, arg1, arg3, arg2, arg0, arg4, arg6) : new class436(arg5, arg1, arg3, class645.method4694(arg1, (byte)-128), class645.method4694(arg3, (byte)-128), arg0);
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field7542[0] + (arg0 != null ? field7542[2] : field7542[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field7542[2] : field7542[1]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3999(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 65);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4000(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 76;
            break;
         case 3:
            var10005 = 121;
            break;
         default:
            var10005 = 65;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
