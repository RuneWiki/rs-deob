import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public abstract class class32 {
   @OriginalMember(
      owner = "client!iha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field488 = new String[]{method238(method237("Di\n, \u0005")), method238(method237("Di\n,#\u0005"))};
   @OriginalMember(
      owner = "client!iha",
      name = "f",
      descriptor = "[C"
   )
   public static char[] field479 = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
   @OriginalMember(
      owner = "client!iha",
      name = "c",
      descriptor = "[S"
   )
   private static short[] field480 = new short[]{-1, -1, -1, -1, -1};
   @OriginalMember(
      owner = "client!iha",
      name = "b",
      descriptor = "[S"
   )
   private static short[] field485 = new short[]{-10304, 9104, 25485, 4620, 4540};
   @OriginalMember(
      owner = "client!iha",
      name = "d",
      descriptor = "[S"
   )
   private static short[] field486 = new short[]{6798, 8741, 25238, 4626, 4550};
   @OriginalMember(
      owner = "client!iha",
      name = "h",
      descriptor = "I"
   )
   public static int field487 = -1;
   @OriginalMember(
      owner = "client!iha",
      name = "e",
      descriptor = "[[S"
   )
   public static short[][] field484 = new short[][]{field486, field485, field480};
   @OriginalMember(
      owner = "client!iha",
      name = "i",
      descriptor = "I"
   )
   public static int field481;
   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "I"
   )
   public static int field483;
   @OriginalMember(
      owner = "client!iha",
      name = "g",
      descriptor = "Ldb;"
   )
   public static class340 field482;

   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method234(int arg0) {
      boolean var1 = client.field4564;

      try {
         if (arg0 == 6) {
            ++field481;
            if (class451.field6600 == null) {
               class451.field6600 = new int[65536];
               double var2 = 0.7D + (Math.random() * 0.03D - 0.015D);
               int var4 = 0;
               if (var1 || ~var4 > -65537) {
                  do {
                     double var5 = (double)(var4 >> 10 & 63) / 64.0D + 0.0078125D;
                     double var7 = (double)(7 & var4 >> 7) / 8.0D + 0.0625D;
                     double var9 = (double)(127 & var4) / 128.0D;
                     double var11 = var9;
                     double var13 = var9;
                     double var15 = var9;
                     if (var7 != 0.0D) {
                        label125: {
                           double var17;
                           label107: {
                              if (var9 < 0.5D) {
                                 var17 = (var7 + 1.0D) * var9;
                                 if (!var1) {
                                    break label107;
                                 }
                              }

                              var17 = var7 + var9 - var7 * var9;
                           }

                           double var19 = var9 * 2.0D - var17;
                           double var21 = var5 + 0.3333333333333333D;
                           if (var21 > 1.0D) {
                              --var21;
                           }

                           double var25;
                           label101: {
                              var25 = var5 + -0.3333333333333333D;
                              if (!(var5 * 6.0D < 1.0D)) {
                                 if (var5 * 2.0D < 1.0D) {
                                    var13 = var17;
                                    if (!var1) {
                                       break label101;
                                    }
                                 }

                                 if (var5 * 3.0D < 2.0D) {
                                    var13 = (var17 - var19) * (0.6666666666666666D - var5) * 6.0D + var19;
                                    if (!var1) {
                                       break label101;
                                    }
                                 }

                                 var13 = var19;
                                 if (!var1) {
                                    break label101;
                                 }
                              }

                              var13 = (-var19 + var17) * 6.0D * var5 + var19;
                           }

                           if (var25 < 0.0D) {
                              ++var25;
                           }

                           label122: {
                              if (var21 * 6.0D < 1.0D) {
                                 var11 = (-var19 + var17) * 6.0D * var21 + var19;
                                 if (!var1) {
                                    break label122;
                                 }
                              }

                              if (var21 * 2.0D < 1.0D) {
                                 var11 = var17;
                                 if (!var1) {
                                    break label122;
                                 }
                              }

                              if (var21 * 3.0D < 2.0D) {
                                 var11 = (var17 - var19) * (-var21 + 0.6666666666666666D) * 6.0D + var19;
                                 if (var1) {
                                    var11 = var19;
                                 }
                              } else {
                                 var11 = var19;
                              }
                           }

                           if (var25 * 6.0D < 1.0D) {
                              var15 = (-var19 + var17) * 6.0D * var25 + var19;
                              if (!var1) {
                                 break label125;
                              }
                           }

                           if (!(var25 * 2.0D < 1.0D)) {
                              label75: {
                                 if (var25 * 3.0D < 2.0D) {
                                    var15 = (var17 - var19) * (0.6666666666666666D - var25) * 6.0D + var19;
                                    if (!var1) {
                                       break label75;
                                    }
                                 }

                                 var15 = var19;
                                 if (var1) {
                                    var15 = var17;
                                 }
                              }
                           } else {
                              var15 = var17;
                           }
                        }
                     }

                     double var27 = Math.pow(var11, var2);
                     double var29 = Math.pow(var13, var2);
                     double var31 = Math.pow(var15, var2);
                     int var33 = (int)(var27 * 256.0D);
                     int var34 = (int)(var29 * 256.0D);
                     int var35 = (int)(var31 * 256.0D);
                     int var36 = (var33 << 16) + (var34 << 8) - -var35;
                     class451.field6600[var4] = var36;
                     ++var4;
                  } while(~var4 > -65537);

               }
            }
         }
      } catch (RuntimeException var38) {
         throw class608.method4462(var38, field488[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "(FFI[FIIIIIFF)V"
   )
   public abstract void method235(float arg0, float arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, float arg9, float arg10);

   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method236(boolean arg0) {
      try {
         field484 = null;
         field485 = null;
         if (arg0) {
            field482 = null;
         }

         field482 = null;
         field486 = null;
         field479 = null;
         field480 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field488[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method237(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 102);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method238(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 45;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 102;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
