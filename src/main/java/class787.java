import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class787 extends class465 {
   @OriginalMember(
      owner = "client!sw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11456 = new String[]{method5652(method5651("9l{4o")), method5652(method5651("9l{5o")), method5652(method5651("9l{6o")), method5652(method5651("15{]:")), method5652(method5651("$n9\u001f")), method5652(method5651("9l{0o")), method5652(method5651("9l{7o")), method5652(method5651("9l{2o")), method5652(method5651("9l{1o")), method5652(method5651("9l{;o"))};
   @OriginalMember(
      owner = "client!sw",
      name = "h",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field11446 = new String[200];
   @OriginalMember(
      owner = "client!sw",
      name = "k",
      descriptor = "I"
   )
   public static int field11449 = 1;
   @OriginalMember(
      owner = "client!sw",
      name = "f",
      descriptor = "[[Z"
   )
   public static boolean[][] field11453 = new boolean[][]{new boolean[13], {false, false, true, true, true, true, true, false, false, false, false, false, true}, {true, true, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, false, false, true, true, true, false, false, false, false, false}, {true, false, false, false, false, true, true, true, false, false, false, false, false}, {false, false, true, true, true, true, false, false, false, false, false, false, false}, {false, true, true, true, true, true, false, false, false, false, false, false, true}, {false, true, true, true, true, true, true, true, false, false, false, false, true}, {true, true, false, false, false, false, false, true, false, false, false, false, false}, {true, true, true, true, true, false, false, false, true, true, false, false, false}, {true, false, false, false, true, true, true, true, true, true, false, false, false}, {true, false, true, true, true, true, true, true, false, false, true, true, false}, {true, true, true, true, true, true, true, true, true, true, true, true, true}, new boolean[13], {true, true, true, true, true, true, true, true, true, true, true, true, true}};
   @OriginalMember(
      owner = "client!sw",
      name = "m",
      descriptor = "I"
   )
   public static int field11447 = 0;
   @OriginalMember(
      owner = "client!sw",
      name = "i",
      descriptor = "Lum;"
   )
   public static class550 field11448 = new class550();
   @OriginalMember(
      owner = "client!sw",
      name = "o",
      descriptor = "I"
   )
   public static int field11442;
   @OriginalMember(
      owner = "client!sw",
      name = "s",
      descriptor = "I"
   )
   public static int field11443;
   @OriginalMember(
      owner = "client!sw",
      name = "q",
      descriptor = "I"
   )
   public static int field11444;
   @OriginalMember(
      owner = "client!sw",
      name = "n",
      descriptor = "I"
   )
   public static int field11451;
   @OriginalMember(
      owner = "client!sw",
      name = "p",
      descriptor = "I"
   )
   public static int field11452;
   @OriginalMember(
      owner = "client!sw",
      name = "g",
      descriptor = "I"
   )
   public static int field11454;
   @OriginalMember(
      owner = "client!sw",
      name = "l",
      descriptor = "I"
   )
   public static int field11455;
   @OriginalMember(
      owner = "client!sw",
      name = "j",
      descriptor = "Luaa;"
   )
   public static class126 field11445;
   @OriginalMember(
      owner = "client!sw",
      name = "r",
      descriptor = "[[[I"
   )
   public static int[][][] field11450;

   @OriginalMember(
      owner = "client!sw",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method5647(int arg0) {
      try {
         if (arg0 <= 81) {
            this.method5647(-88);
         }

         ++field11455;
         return super.field6984;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11456[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "<init>",
      descriptor = "(ILsk;)V"
   )
   public class787(int arg0, class648 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!sw",
      name = "c",
      descriptor = "(Z)V"
   )
   public static final void method5648(boolean arg0) {
      int var1 = client.field4530;

      try {
         ++field11451;
         if (class164.field2064 != -1 && class108.field1315 != -1) {
            label84: {
               int var2 = ((-class134.field1720 + class360.field5436) * class97.field1194 >> 16) + class134.field1720;
               class97.field1194 += var2;
               if (class97.field1194 < 65535) {
                  class784.field11427 = false;
                  class16.field196 = false;
                  if (var1 == 0) {
                     break label84;
                  }
               }

               label71: {
                  class97.field1194 = 65535;
                  if (!class16.field196) {
                     class784.field11427 = true;
                     if (var1 == 0) {
                        break label71;
                     }
                  }

                  class784.field11427 = false;
               }

               class16.field196 = true;
            }

            float var3;
            float[] var4;
            int var5;
            float[] var14;
            int var15;
            int var10000;
            label54: {
               var3 = (float)class97.field1194 / 65535.0F;
               var4 = new float[3];
               var5 = class54.field617 * 2;
               int var6 = 0;
               if (var1 != 0) {
                  var10000 = class769.field11285[class164.field2064][var5][var6] * 3;
               } else if (var6 >= 3) {
                  class232.field2947 = (int)var4[2] + -(class669.field10064 * 512);
                  class731.field10844 = (int)var4[0] + -(class718.field10676 * 512);
                  class733.field10871 = (int)var4[1] * -1;
                  var14 = new float[3];
                  var15 = class334.field4775 * 2;
                  var10000 = 0;
                  if (var1 == 0) {
                     break label54;
                  }
               } else {
                  var10000 = class769.field11285[class164.field2064][var5][var6] * 3;
               }

               while(true) {
                  int var7 = var10000;
                  int var8 = class769.field11285[class164.field2064][var5 + 1][var6] * 3;
                  int var9 = (class769.field11285[class164.field2064][var5 + 2][var6] + -class769.field11285[class164.field2064][var5 + 3][var6] - -class769.field11285[class164.field2064][var5 + 2][var6]) * 3;
                  int var10 = class769.field11285[class164.field2064][var5][var6];
                  int var11 = -var7 + var8;
                  int var12 = -(var8 * 2) + var7 + var9;
                  int var13 = class769.field11285[class164.field2064][var5 + 2][var6] + -var10 + -var9 + var8;
                  var4[var6] = (((float)var13 * var3 + (float)var12) * var3 + (float)var11) * var3 + (float)var10;
                  ++var6;
                  if (var6 >= 3) {
                     class232.field2947 = (int)var4[2] + -(class669.field10064 * 512);
                     class731.field10844 = (int)var4[0] + -(class718.field10676 * 512);
                     class733.field10871 = (int)var4[1] * -1;
                     var14 = new float[3];
                     var15 = class334.field4775 * 2;
                     var10000 = 0;
                     if (var1 == 0) {
                        break;
                     }
                  } else {
                     var10000 = class769.field11285[class164.field2064][var5][var6] * 3;
                  }
               }
            }

            int var16 = var10000;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            int var23;
            if (var1 != 0) {
               var17 = class769.field11285[class108.field1315][var15][var16] * 3;
               var18 = class769.field11285[class108.field1315][var15 + 1][var16] * 3;
               var19 = (class769.field11285[class108.field1315][var15 + 2][var16] + -class769.field11285[class108.field1315][var15 + 3][var16] + class769.field11285[class108.field1315][var15 + 2][var16]) * 3;
               var20 = class769.field11285[class108.field1315][var15][var16];
               var21 = var18 - var17;
               var22 = var17 - (var18 * 2 - var19);
               var23 = -var19 + var18 + -var20 + class769.field11285[class108.field1315][var15 + 2][var16];
               var14[var16] = (((float)var23 * var3 + (float)var22) * var3 + (float)var21) * var3 + (float)var20;
               ++var16;
            }

            while(true) {
               byte var10001;
               if (var16 >= 3) {
                  float var24 = var14[0] + -var4[0];
                  var10000 = arg0;
                  var10001 = 1;
                  if (var1 == 0) {
                     if (arg0 != 1) {
                        return;
                     }

                     float var25 = (var14[1] - var4[1]) * -1.0F;
                     float var26 = var14[2] + -var4[2];
                     double var27 = Math.sqrt((double)(var24 * var24 + var26 * var26));
                     class713.field10637 = 16383 & (int)(2607.5945876176133D * Math.atan2((double)var25, var27));
                     class292.field4078 = (int)(2607.5945876176133D * -Math.atan2((double)var24, (double)var26)) & 16383;
                     class503.field7464 = class769.field11285[class164.field2064][var5][3] - -((class769.field11285[class164.field2064][var5 - -2][3] + -class769.field11285[class164.field2064][var5][3]) * class97.field1194 >> 16);
                     return;
                  }
               } else {
                  var10000 = class769.field11285[class108.field1315][var15][var16];
                  var10001 = 3;
               }

               var17 = var10000 * var10001;
               var18 = class769.field11285[class108.field1315][var15 + 1][var16] * 3;
               var19 = (class769.field11285[class108.field1315][var15 + 2][var16] + -class769.field11285[class108.field1315][var15 + 3][var16] + class769.field11285[class108.field1315][var15 + 2][var16]) * 3;
               var20 = class769.field11285[class108.field1315][var15][var16];
               var21 = var18 - var17;
               var22 = var17 - (var18 * 2 - var19);
               var23 = -var19 + var18 + -var20 + class769.field11285[class108.field1315][var15 + 2][var16];
               var14[var16] = (((float)var23 * var3 + (float)var22) * var3 + (float)var21) * var3 + (float)var20;
               ++var16;
            }
         }
      } catch (RuntimeException var30) {
         throw class670.method4877(var30, field11456[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method69(boolean arg0) {
      try {
         if (arg0) {
            field11446 = null;
         }

         if (~super.field6984 > -1 && ~super.field6984 < -5) {
            super.field6984 = this.method78(16726277);
         }

         ++field11442;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11456[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method77(int arg0, int arg1) {
      try {
         if (arg0 != -14812) {
            method5649(-49, 16, (float[])null);
         }

         ++field11444;
         super.field6984 = arg1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field11456[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method70(int arg0, byte arg1) {
      try {
         int var3 = 99 % ((arg1 - -51) / 60);
         ++field11443;
         return 1;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field11456[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "<init>",
      descriptor = "(Lsk;)V"
   )
   public class787(class648 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method78(int arg0) {
      try {
         ++field11452;
         if (super.field6980.method4673((byte)-76).method3318((byte)76) > 1) {
            return 4;
         } else {
            if (arg0 != 16726277) {
               method5648(true);
            }

            return 2;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11456[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(II[F)[F"
   )
   public static final float[] method5649(int arg0, int arg1, float[] arg2) {
      try {
         ++field11454;
         float[] var3 = new float[arg1];
         int var4 = -5 / ((-16 - arg0) / 59);
         class195.method1491(arg2, 0, var3, 0, arg1);
         return var3;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field11456[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11456[3] : field11456[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method5650(int arg0) {
      try {
         if (arg0 != 65535) {
            method5649(-109, 33, (float[])null);
         }

         field11446 = null;
         field11453 = null;
         field11450 = null;
         field11448 = null;
         field11445 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11456[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5651(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 71);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5652(char[] arg0) {
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
            var10005 = 27;
            break;
         case 2:
            var10005 = 85;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 71;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
