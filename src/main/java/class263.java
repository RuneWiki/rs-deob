import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class263 {
   @OriginalMember(
      owner = "client!gca",
      name = "f",
      descriptor = "I"
   )
   public int field3436;
   @OriginalMember(
      owner = "client!gca",
      name = "j",
      descriptor = "[I"
   )
   public int[] field3435;
   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "[I"
   )
   public int[] field3438;
   @OriginalMember(
      owner = "client!gca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3444 = new String[]{method2027(method2026("C?\u0011\u001dW\f")), method2027(method2026("C?\u0011\u001dV\f")), method2027(method2026("C?\u0011\u001dT\f")), method2027(method2026("C?\u0011\u001dQ\f")), method2027(method2026("C?\u0011\u001d)M2\u0019G+\f")), method2027(method2026("J)\u001c_")), method2027(method2026("_r^\u001dh")), method2027(method2026("C?\u0011\u001dP\f")), method2027(method2026("C?\u0011\u001dS\f"))};
   @OriginalMember(
      owner = "client!gca",
      name = "d",
      descriptor = "I"
   )
   public static int field3434;
   @OriginalMember(
      owner = "client!gca",
      name = "b",
      descriptor = "I"
   )
   public static int field3437;
   @OriginalMember(
      owner = "client!gca",
      name = "i",
      descriptor = "I"
   )
   public static int field3439;
   @OriginalMember(
      owner = "client!gca",
      name = "h",
      descriptor = "I"
   )
   public static int field3440;
   @OriginalMember(
      owner = "client!gca",
      name = "g",
      descriptor = "I"
   )
   public static int field3441;
   @OriginalMember(
      owner = "client!gca",
      name = "c",
      descriptor = "I"
   )
   public static int field3442;
   @OriginalMember(
      owner = "client!gca",
      name = "e",
      descriptor = "I"
   )
   public static int field3443;

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(ZII)Z"
   )
   public static final boolean method2020(boolean arg0, int arg1, int arg2) {
      try {
         if (arg0) {
            return true;
         } else {
            ++field3442;
            boolean var3 = (55 & arg2) == 0 ? class370.method2863(arg2, arg1, 113) : class335.method2660(arg2, true, arg1);
            return var3 | class222.method1690(54, arg2, arg1) | (65536 & arg1) != 0;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field3444[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(IIII)Lvi;"
   )
   public static final class569 method2021(int arg0, int arg1, int arg2, int arg3) {
      boolean var4 = client.field4273;

      try {
         ++field3440;
         class225 var5 = class111.field1404[arg3][arg2][arg0];
         if (var5 == null) {
            return null;
         } else {
            class569 var6 = null;
            if (arg1 != 5353) {
               return null;
            } else {
               int var7 = -1;
               class752 var8 = var5.field2821;

               while(true) {
                  class47 var10000;
                  if (var8 == null) {
                     var10000 = var6;
                     if (!var4) {
                        return var6;
                     }
                  } else {
                     var10000 = var8.field10922;
                  }

                  class47 var9 = var10000;
                  if (var9 instanceof class569) {
                     class569 var10 = (class569)var9;
                     int var11 = -256 + var10.method3060((byte)38) * 256 + 252;
                     int var12 = -var11 + var10.field999 >> 9;
                     int var13 = -var11 + var10.field1003 >> 9;
                     int var14 = var10.field999 + var11 >> 9;
                     int var15 = var10.field1003 + var11 >> 9;
                     if (arg2 >= var12 && ~var13 >= ~arg0 && arg2 <= var14 && arg0 <= var15) {
                        int var16 = (var14 - -1 - arg2) * (var15 + 1 - arg0);
                        if (~var16 < ~var7) {
                           var6 = var10;
                           var7 = var16;
                        }
                     }
                  }

                  var8 = var8.field10923;
               }
            }
         }
      } catch (RuntimeException var18) {
         throw class534.method3846(var18, field3444[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method2022(byte arg0) {
      try {
         ++field3437;
         if (~class545.field7442 == -11) {
            class545.field7442 = 11;
            int var1 = 121 / ((-62 - arg0) / 43);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3444[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(IJ)Ljava/lang/String;"
   )
   public static final String method2023(int arg0, long arg1) {
      boolean var3 = client.field4273;

      try {
         ++field3434;
         if (~arg1 < -1L && ~arg1 > -6582952005840035282L) {
            if (arg1 % 37L == 0L) {
               return null;
            } else {
               int var4 = 0;
               long var5 = arg1;
               if (var3) {
                  ++var4;
                  var5 = arg1 / 37L;
               }

               while(true) {
                  if (var5 == 0L) {
                     StringBuffer var7 = new StringBuffer(var4);
                     if (!var3) {
                        if (arg0 >= -119) {
                           field3443 = 45;
                           if (!var3 && arg1 == 0L) {
                              return var7.reverse().toString();
                           }
                        } else if (arg1 == 0L) {
                           return var7.reverse().toString();
                        }

                        do {
                           long var8 = arg1;
                           arg1 /= 37L;
                           var7.append(class657.field9333[(int)(-(arg1 * 37L) + var8)]);
                        } while(arg1 != 0L);

                        return var7.reverse().toString();
                     }
                  } else {
                     ++var4;
                  }

                  var5 /= 37L;
               }
            }
         } else {
            return null;
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field3444[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(II[BI)I"
   )
   public static final int method2024(int arg0, int arg1, byte[] arg2, int arg3) {
      try {
         ++field3441;
         int var4 = arg0;

         for(int var5 = arg1; ~arg3 < ~var5; ++var5) {
            var4 = var4 >>> 8 ^ class715.field10458[(var4 ^ arg2[var5]) & 255];
         }

         return ~var4;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field3444[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3444[6] : field3444[5]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class263(int arg0) {
      try {
         this.field3436 = arg0;
         this.field3435 = new int[this.field3436];
         this.field3438 = new int[this.field3436];
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3444[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method2025(byte arg0) {
      boolean var1 = client.field4273;

      try {
         ++field3439;
         if (~class762.field11018 != 0 && ~class183.field2259 != 0) {
            label82: {
               int var2 = ((class582.field7987 - class511.field7073) * class110.field1390 >> 16) + class511.field7073;
               class110.field1390 += var2;
               if (~class110.field1390 <= -65536) {
                  label79: {
                     if (class39.field456) {
                        class21.field268 = false;
                        if (!var1) {
                           break label79;
                        }
                     }

                     class21.field268 = true;
                  }

                  class110.field1390 = 65535;
                  class39.field456 = true;
                  if (!var1) {
                     break label82;
                  }
               }

               class39.field456 = false;
               class21.field268 = false;
            }

            float var3 = (float)class110.field1390 / 65535.0F;
            if (arg0 == -88) {
               float[] var4;
               int var5;
               float[] var14;
               int var15;
               int var10000;
               label52: {
                  var4 = new float[3];
                  var5 = class362.field5131 * 2;
                  int var6 = 0;
                  if (var1) {
                     var10000 = class339.field4864[class762.field11018][var5][var6] * 3;
                  } else if (var6 >= 3) {
                     class331.field4733 = (int)var4[1] * -1;
                     class532.field7284 = (int)var4[2] - class17.field237 * 512;
                     class737.field10747 = (int)var4[0] + -(class752.field10921 * 512);
                     var14 = new float[3];
                     var15 = class766.field11061 * 2;
                     var10000 = 0;
                     if (!var1) {
                        break label52;
                     }
                  } else {
                     var10000 = class339.field4864[class762.field11018][var5][var6] * 3;
                  }

                  while(true) {
                     int var7 = var10000;
                     int var8 = class339.field4864[class762.field11018][var5 - -1][var6] * 3;
                     int var9 = (class339.field4864[class762.field11018][var5 + 2][var6] + -class339.field4864[class762.field11018][var5 + 3][var6] + class339.field4864[class762.field11018][var5 - -2][var6]) * 3;
                     int var10 = class339.field4864[class762.field11018][var5][var6];
                     int var11 = -var7 + var8;
                     int var12 = -(var8 * 2) + var9 + var7;
                     int var13 = -var9 + var8 + -var10 + class339.field4864[class762.field11018][var5 - -2][var6];
                     var4[var6] = (((float)var13 * var3 + (float)var12) * var3 + (float)var11) * var3 + (float)var10;
                     ++var6;
                     if (var6 >= 3) {
                        class331.field4733 = (int)var4[1] * -1;
                        class532.field7284 = (int)var4[2] - class17.field237 * 512;
                        class737.field10747 = (int)var4[0] + -(class752.field10921 * 512);
                        var14 = new float[3];
                        var15 = class766.field11061 * 2;
                        var10000 = 0;
                        if (!var1) {
                           break;
                        }
                     } else {
                        var10000 = class339.field4864[class762.field11018][var5][var6] * 3;
                     }
                  }
               }

               int var16 = var10000;
               float var24;
               float var25;
               float var26;
               double var27;
               if (var1) {
                  var10000 = class339.field4864[class183.field2259][var15][var16] * 3;
               } else if (var16 >= 3) {
                  var24 = var14[0] + -var4[0];
                  var25 = (var14[1] - var4[1]) * -1.0F;
                  var26 = var14[2] + -var4[2];
                  var27 = Math.sqrt((double)(var24 * var24 + var26 * var26));
                  class171.field2144 = (int)(2607.5945876176133D * Math.atan2((double)var25, var27)) & 16383;
                  class749.field10899 = 16383 & (int)(-Math.atan2((double)var24, (double)var26) * 2607.5945876176133D);
                  var10000 = ((class339.field4864[class762.field11018][var5 + 2][3] - class339.field4864[class762.field11018][var5][3]) * class110.field1390 >> 16) + class339.field4864[class762.field11018][var5][3];
                  if (!var1) {
                     class191.field2317 = var10000;
                     return;
                  }
               } else {
                  var10000 = class339.field4864[class183.field2259][var15][var16] * 3;
               }

               while(true) {
                  int var17 = var10000;
                  int var18 = class339.field4864[class183.field2259][var15 + 1][var16] * 3;
                  int var19 = (-class339.field4864[class183.field2259][var15 - -3][var16] - (-class339.field4864[class183.field2259][var15 + 2][var16] - class339.field4864[class183.field2259][var15 + 2][var16])) * 3;
                  int var20 = class339.field4864[class183.field2259][var15][var16];
                  int var21 = var18 - var17;
                  int var22 = -(var18 * 2) + var19 + var17;
                  int var23 = class339.field4864[class183.field2259][var15 - -2][var16] + -var20 + var18 + -var19;
                  var14[var16] = (((float)var23 * var3 + (float)var22) * var3 + (float)var21) * var3 + (float)var20;
                  ++var16;
                  if (var16 >= 3) {
                     var24 = var14[0] + -var4[0];
                     var25 = (var14[1] - var4[1]) * -1.0F;
                     var26 = var14[2] + -var4[2];
                     var27 = Math.sqrt((double)(var24 * var24 + var26 * var26));
                     class171.field2144 = (int)(2607.5945876176133D * Math.atan2((double)var25, var27)) & 16383;
                     class749.field10899 = 16383 & (int)(-Math.atan2((double)var24, (double)var26) * 2607.5945876176133D);
                     var10000 = ((class339.field4864[class762.field11018][var5 + 2][3] - class339.field4864[class762.field11018][var5][3]) * class110.field1390 >> 16) + class339.field4864[class762.field11018][var5][3];
                     if (!var1) {
                        class191.field2317 = var10000;
                        return;
                     }
                  } else {
                     var10000 = class339.field4864[class183.field2259][var15][var16] * 3;
                  }
               }
            }
         }
      } catch (RuntimeException var30) {
         throw class534.method3846(var30, field3444[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2026(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2027(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
