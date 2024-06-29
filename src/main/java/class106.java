import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class106 {
   @OriginalMember(
      owner = "client!iv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1765 = new String[]{method1031(method1030("\u001d_\u001d\\\u001c")), method1031(method1030("\u001d_\u001dZ\u001c")), method1031(method1030("\u001d_\u001d[\u001c")), method1031(method1030("\u000f\u0007\u001d6I")), method1031(method1030("\u001a\\_t")), method1031(method1030("\u001d_\u001dY\u001c")), method1031(method1030("\u001d_\u001d]\u001c"))};
   @OriginalMember(
      owner = "client!iv",
      name = "e",
      descriptor = "I"
   )
   public static int field1755;
   @OriginalMember(
      owner = "client!iv",
      name = "h",
      descriptor = "I"
   )
   public static int field1756;
   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "I"
   )
   public static int field1758;
   @OriginalMember(
      owner = "client!iv",
      name = "f",
      descriptor = "I"
   )
   public static int field1760;
   @OriginalMember(
      owner = "client!iv",
      name = "i",
      descriptor = "I"
   )
   public static int field1763;
   @OriginalMember(
      owner = "client!iv",
      name = "j",
      descriptor = "Lhw;"
   )
   public static class141 field1761;
   @OriginalMember(
      owner = "client!iv",
      name = "g",
      descriptor = "[B"
   )
   public byte[] field1762;
   @OriginalMember(
      owner = "client!iv",
      name = "d",
      descriptor = "[S"
   )
   public short[] field1757;
   @OriginalMember(
      owner = "client!iv",
      name = "c",
      descriptor = "[S"
   )
   public short[] field1759;
   @OriginalMember(
      owner = "client!iv",
      name = "b",
      descriptor = "[S"
   )
   public short[] field1764;

   @OriginalMember(
      owner = "client!iv",
      name = "b",
      descriptor = "(B)V",
      line = 5
   )
   public static void method1025(byte arg0) {
      try {
         int var1 = 3 / ((-28 - arg0) / 58);
         field1761 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1765[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(IIIIBI)Z",
      line = 14
   )
   public static final boolean method1026(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
      boolean var6 = client.field4564;

      try {
         ++field1763;
         int var7 = arg5;
         int var10000;
         if (var6) {
            var10000 = arg2;
         } else if (~arg3 > ~arg5) {
            var10000 = arg4;
            if (!var6) {
               if (arg4 != 24) {
                  field1760 = -127;
               }

               return false;
            }
         } else {
            var10000 = arg2;
         }

         while(true) {
            int var8 = var10000;
            if (var6) {
               if (~class655.field9550[var7][var8] == ~arg1 && class422.field6147[var7][var8] <= 1) {
                  return true;
               }

               ++var8;
            }

            while(true) {
               while(arg0 >= var8) {
                  if (~class655.field9550[var7][var8] == ~arg1 && class422.field6147[var7][var8] <= 1) {
                     return true;
                  }

                  ++var8;
               }

               if (!var6) {
                  ++var7;
                  if (~arg3 > ~var7) {
                     var10000 = arg4;
                     if (!var6) {
                        if (arg4 != 24) {
                           field1760 = -127;
                        }

                        return false;
                     }
                  } else {
                     var10000 = arg2;
                  }
                  break;
               }

               ++var8;
            }
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field1765[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(IIIIIILjava/lang/String;Lha;)V",
      line = 50
   )
   public static final void method1027(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, class65 arg7) {
      boolean var8 = client.field4564;

      try {
         if (class587.field8493 == null || class689.field10130 == null) {
            label97: {
               if (!class392.field5782.method1335((byte)115, class490.field7144) || !class392.field5782.method1335((byte)115, class764.field11094)) {
                  arg7.method295(arg5, arg0, arg3, arg4, class382.field5655 | -class381.field5651 + 255 << 24, 1);
                  if (!var8) {
                     break label97;
                  }
               }

               class587.field8493 = arg7.method307(class94.method913(class392.field5782, class490.field7144, 0), true);
               class94 var9 = class94.method913(class392.field5782, class764.field11094, 0);
               class689.field10130 = arg7.method307(var9, true);
               var9.method918();
               class202.field3020 = arg7.method307(var9, true);
            }
         }

         if (arg1 == -357) {
            ++field1758;
            if (class587.field8493 != null && class689.field10130 != null) {
               int var10 = (arg3 + -(2 * class689.field10130.method3002())) / class587.field8493.method3002();
               int var11 = 0;
               if (var8) {
                  class587.field8493.method3609(arg5 - (-class689.field10130.method3002() + -(class587.field8493.method3002() * var11)), arg0);
                  ++var11;
               }

               while(true) {
                  while(var10 > var11) {
                     class587.field8493.method3609(arg5 - (-class689.field10130.method3002() + -(class587.field8493.method3002() * var11)), arg0);
                     ++var11;
                  }

                  class689.field10130.method3609(arg5, arg0);
                  class476 var10000 = class202.field3020;
                  int var10001 = arg5 - -arg3 + -class202.field3020.method3002();
                  if (!var8) {
                     var10000.method3609(var10001, arg0);
                     break;
                  }

                  var10000.method3609(var10001, arg0);
                  ++var11;
               }
            }

            class296.field4151.method711(arg5 + 3, -1, arg0 + 14, 0, class220.field3314 | -16777216, arg6);
            arg7.method295(arg5, arg0 + arg4, arg3, -arg4 + arg2, class382.field5655 | -class381.field5651 + 255 << 24, 1);
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field1765[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field1765[3] : field1765[4]) + ',' + (arg7 != null ? field1765[3] : field1765[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(I)V",
      line = 95
   )
   public static final void method1028(int arg0) {
      boolean var1 = client.field4564;

      try {
         ++field1756;
         if (~client.field4560 != 0 && ~class567.field8229 != 0) {
            label71: {
               int var2 = ((class108.field1776 - class284.field3964) * class220.field3312 >> 16) + class284.field3964;
               class220.field3312 += var2;
               if (class220.field3312 >= 65535) {
                  label68: {
                     class220.field3312 = 65535;
                     if (class201.field3016) {
                        class534.field7778 = false;
                        if (!var1) {
                           break label68;
                        }
                     }

                     class534.field7778 = true;
                  }

                  class201.field3016 = true;
                  if (!var1) {
                     break label71;
                  }
               }

               class201.field3016 = false;
               class534.field7778 = false;
            }

            float var3;
            float[] var4;
            int var5;
            float[] var14;
            int var15;
            int var10000;
            label49: {
               var3 = (float)class220.field3312 / 65535.0F;
               var4 = new float[3];
               var5 = class263.field3739 * 2;
               int var6 = 0;
               if (var1) {
                  var10000 = class502.field7310[client.field4560][var5][var6] * 3;
               } else if (~var6 <= -4) {
                  class677.field9932 = (int)var4[2] + -(class753.field10887 * 512);
                  class494.field7193 = (int)var4[1] * -1;
                  class583.field8442 = (int)var4[0] + -(class347.field4939 * 512);
                  var14 = new float[arg0];
                  var15 = class248.field3574 * 2;
                  var10000 = 0;
                  if (!var1) {
                     break label49;
                  }
               } else {
                  var10000 = class502.field7310[client.field4560][var5][var6] * 3;
               }

               while(true) {
                  int var7 = var10000;
                  int var8 = class502.field7310[client.field4560][var5 + 1][var6] * 3;
                  int var9 = (class502.field7310[client.field4560][var5 - -2][var6] + -class502.field7310[client.field4560][var5 - -3][var6] - -class502.field7310[client.field4560][var5 + 2][var6]) * 3;
                  int var10 = class502.field7310[client.field4560][var5][var6];
                  int var11 = -var7 + var8;
                  int var12 = -(var8 * 2) + var9 + var7;
                  int var13 = class502.field7310[client.field4560][var5 + 2][var6] - -var8 + -var9 + -var10;
                  var4[var6] = (((float)var13 * var3 + (float)var12) * var3 + (float)var11) * var3 + (float)var10;
                  ++var6;
                  if (~var6 <= -4) {
                     class677.field9932 = (int)var4[2] + -(class753.field10887 * 512);
                     class494.field7193 = (int)var4[1] * -1;
                     class583.field8442 = (int)var4[0] + -(class347.field4939 * 512);
                     var14 = new float[arg0];
                     var15 = class248.field3574 * 2;
                     var10000 = 0;
                     if (!var1) {
                        break;
                     }
                  } else {
                     var10000 = class502.field7310[client.field4560][var5][var6] * 3;
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
            if (var1) {
               var17 = class502.field7310[class567.field8229][var15][var16] * 3;
               var18 = class502.field7310[class567.field8229][var15 + 1][var16] * 3;
               var19 = (class502.field7310[class567.field8229][var15 + 2][var16] + class502.field7310[class567.field8229][var15 + 2][var16] + -class502.field7310[class567.field8229][var15 + 3][var16]) * 3;
               var20 = class502.field7310[class567.field8229][var15][var16];
               var21 = -var17 + var18;
               var22 = -(var18 * 2) + var17 + var19;
               var23 = class502.field7310[class567.field8229][var15 + 2][var16] - var20 + -var19 + var18;
               var14[var16] = (((float)var23 * var3 + (float)var22) * var3 + (float)var21) * var3 + (float)var20;
               ++var16;
            }

            while(true) {
               if (var16 >= 3) {
                  float var24 = var14[0] + -var4[0];
                  float var25 = (var14[1] - var4[1]) * -1.0F;
                  float var26 = var14[2] + -var4[2];
                  double var27 = Math.sqrt((double)(var24 * var24 + var26 * var26));
                  class414.field6073 = (int)(Math.atan2((double)var25, var27) * 2607.5945876176133D) & 16383;
                  class373.field5548 = (int)(2607.5945876176133D * -Math.atan2((double)var24, (double)var26)) & 16383;
                  var10000 = ((class502.field7310[client.field4560][var5 - -2][3] + -class502.field7310[client.field4560][var5][3]) * class220.field3312 >> 16) + class502.field7310[client.field4560][var5][3];
                  if (!var1) {
                     class127.field2133 = var10000;
                     return;
                  }
               } else {
                  var10000 = class502.field7310[class567.field8229][var15][var16] * 3;
               }

               var17 = var10000;
               var18 = class502.field7310[class567.field8229][var15 + 1][var16] * 3;
               var19 = (class502.field7310[class567.field8229][var15 + 2][var16] + class502.field7310[class567.field8229][var15 + 2][var16] + -class502.field7310[class567.field8229][var15 + 3][var16]) * 3;
               var20 = class502.field7310[class567.field8229][var15][var16];
               var21 = -var17 + var18;
               var22 = -(var18 * 2) + var17 + var19;
               var23 = class502.field7310[class567.field8229][var15 + 2][var16] - var20 + -var19 + var18;
               var14[var16] = (((float)var23 * var3 + (float)var22) * var3 + (float)var21) * var3 + (float)var20;
               ++var16;
            }
         }
      } catch (RuntimeException var30) {
         throw class608.method4462(var30, field1765[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(B)V",
      line = 199
   )
   public static final void method1029(byte arg0) {
      try {
         label128: {
            ++field1755;
            int var1 = class417.field6103 * 512 + 256;
            int var2 = class39.field931 * 512 + 256;
            int var3 = class663.method4851(var2, var1, class731.field10504, 102) + -class66.field1221;
            if (~class687.field10098 > -101) {
               if (~var1 < ~class583.field8442) {
                  class583.field8442 += (-class583.field8442 + var1) * class687.field10098 / 1000 + class505.field7354;
                  if (var1 < class583.field8442) {
                     class583.field8442 = var1;
                  }
               }

               if (~class494.field7193 > ~var3) {
                  class494.field7193 += (-class494.field7193 + var3) * class687.field10098 / 1000 + class505.field7354;
                  if (var3 < class494.field7193) {
                     class494.field7193 = var3;
                  }
               }

               if (~class583.field8442 < ~var1) {
                  class583.field8442 -= (-var1 + class583.field8442) * class687.field10098 / 1000 + class505.field7354;
                  if (~var1 < ~class583.field8442) {
                     class583.field8442 = var1;
                  }
               }

               if (var3 < class494.field7193) {
                  class494.field7193 -= (-var3 + class494.field7193) * class687.field10098 / 1000 + class505.field7354;
                  if (~class494.field7193 > ~var3) {
                     class494.field7193 = var3;
                  }
               }

               if (~var2 < ~class677.field9932) {
                  class677.field9932 += (var2 - class677.field9932) * class687.field10098 / 1000 + class505.field7354;
                  if (class677.field9932 > var2) {
                     class677.field9932 = var2;
                  }
               }

               if (~var2 <= ~class677.field9932) {
                  break label128;
               }

               class677.field9932 -= class505.field7354 - -((-var2 + class677.field9932) * class687.field10098 / 1000);
               if (~var2 >= ~class677.field9932) {
                  break label128;
               }

               class677.field9932 = var2;
               if (!client.field4564) {
                  break label128;
               }
            }

            class677.field9932 = class39.field931 * 512 - -256;
            class583.field8442 = class417.field6103 * 512 - -256;
            class494.field7193 = class663.method4851(class677.field9932, class583.field8442, class731.field10504, 127) + -class66.field1221;
         }

         int var4 = class315.field4536 * 512 - -256;
         int var5 = class775.field11349 * 512 + 256;
         int var6 = class663.method4851(var4, var5, class731.field10504, 118) + -class555.field8076;
         int var7 = -class583.field8442 + var5;
         int var8 = -class494.field7193 + var6;
         int var9 = -class677.field9932 + var4;
         if (arg0 > -114) {
            method1029((byte)50);
         }

         int var10 = (int)Math.sqrt((double)(var7 * var7 - -(var9 * var9)));
         int var11 = (int)(Math.atan2((double)var8, (double)var10) * 2607.5945876176133D) & 16383;
         if (var11 < 1024) {
            var11 = 1024;
         }

         int var12 = 16383 & (int)(-2607.5945876176133D * Math.atan2((double)var7, (double)var9));
         if (~var11 < -3073) {
            var11 = 3072;
         }

         if (class414.field6073 < var11) {
            class414.field6073 += (-class414.field6073 + var11 >> 3) * class746.field10771 / 1000 + class680.field9980 << 3;
            if (class414.field6073 > var11) {
               class414.field6073 = var11;
            }
         }

         if (var11 < class414.field6073) {
            class414.field6073 -= class680.field9980 - -((-var11 + class414.field6073 >> 3) * class746.field10771 / 1000) << 3;
            if (~class414.field6073 > ~var11) {
               class414.field6073 = var11;
            }
         }

         int var13 = -class373.field5548 + var12;
         if (~var13 < -8193) {
            var13 -= 16384;
         }

         if (~var13 > 8191) {
            var13 += 16384;
         }

         int var14 = var13 >> 3;
         if (~var14 < -1) {
            class373.field5548 += class680.field9980 - -(class746.field10771 * var14 / 1000) << 3;
            class373.field5548 &= 16383;
         }

         if (var14 < 0) {
            class373.field5548 -= -var14 * class746.field10771 / 1000 + class680.field9980 << 3;
            class373.field5548 &= 16383;
         }

         int var15 = -class373.field5548 + var12;
         if (var15 > 8192) {
            var15 -= 16384;
         }

         if (var15 < -8192) {
            var15 += 16384;
         }

         class127.field2133 = 0;
         if (~var15 > -1 && ~var14 < -1 || var15 > 0 && ~var14 > -1) {
            class373.field5548 = var12;
         }
      } catch (RuntimeException var17) {
         throw class608.method4462(var17, field1765[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1030(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1031(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 51;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
