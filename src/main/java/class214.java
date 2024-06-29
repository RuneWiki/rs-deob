import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class214 {
   @OriginalMember(
      owner = "client!rv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3255 = new String[]{method1869(method1868(".\u0001a|\u0011")), method1869(method1868("2\u0002#T")), method1869(method1868(".\u0001a}\u0011")), method1869(method1868("'Ya\u0016D")), method1869(method1868(".\u0001a{\u0011")), method1869(method1868(".\u0001ay\u0011")), method1869(method1868(".\u0001az\u0011"))};
   @OriginalMember(
      owner = "client!rv",
      name = "d",
      descriptor = "Luk;"
   )
   public static class498 field3250 = new class498(6, 3);
   @OriginalMember(
      owner = "client!rv",
      name = "e",
      descriptor = "I"
   )
   public static int field3254 = 0;
   @OriginalMember(
      owner = "client!rv",
      name = "b",
      descriptor = "[F"
   )
   public static float[] field3253 = new float[16];
   @OriginalMember(
      owner = "client!rv",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field3252 = new int[]{4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1};
   @OriginalMember(
      owner = "client!rv",
      name = "h",
      descriptor = "I"
   )
   public static int field3243;
   @OriginalMember(
      owner = "client!rv",
      name = "j",
      descriptor = "I"
   )
   public static int field3245;
   @OriginalMember(
      owner = "client!rv",
      name = "c",
      descriptor = "I"
   )
   public static int field3246;
   @OriginalMember(
      owner = "client!rv",
      name = "g",
      descriptor = "I"
   )
   public static int field3247;
   @OriginalMember(
      owner = "client!rv",
      name = "k",
      descriptor = "I"
   )
   public static int field3248;
   @OriginalMember(
      owner = "client!rv",
      name = "i",
      descriptor = "I"
   )
   public int field3251;
   @OriginalMember(
      owner = "client!rv",
      name = "l",
      descriptor = "Lvm;"
   )
   public class367 field3244;
   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "[I"
   )
   public int[] field3249;

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(I)V",
      line = 3
   )
   public static void method1863(int arg0) {
      try {
         field3250 = null;
         field3252 = null;
         if (arg0 != -1) {
            field3250 = null;
         }

         field3253 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3255[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(IBI)V",
      line = 16
   )
   public static final void method1864(int arg0, byte arg1, int arg2) {
      boolean var3 = client.field1786;

      try {
         label32: {
            ++field3246;
            class208.field3176 = arg2;
            class86.field1255 = arg0;
            if (class67.field883 != 0) {
               if (~class67.field883 != -2) {
                  if (~class67.field883 != -3) {
                     break label32;
                  }

                  class790.field11557 = class86.field1255;
                  class63.field837 = class208.field3176;
                  if (!var3) {
                     break label32;
                  }
               }

               class13.field166 = class86.field1255 / class155.field2316 + 2 - -class221.field3330;
               class395.field6185 = class208.field3176 / class37.field444 + class686.field10198 + 2;
               class63.field837 = class395.field6185 * class37.field444;
               class790.field11557 = class155.field2316 * class13.field166;
               class263.field4324 = class63.field837 - class208.field3176 >> 1;
               class1.field7 = -class86.field1255 + class790.field11557 >> 1;
               if (!var3) {
                  break label32;
               }
            }

            class790.field11557 = class1.field7 * 2 + class86.field1255;
            class63.field837 = class263.field4324 * 2 + class208.field3176;
         }

         if (arg1 != 7) {
            field3254 = -55;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3255[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(ILjava/lang/String;Z)V",
      line = 62
   )
   public static final void method1865(int arg0, String arg1, boolean arg2) {
      try {
         class353.method2830((byte)46, arg1, arg2, -1, -1);
         if (arg0 == -20015) {
            ++field3248;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3255[2] + arg0 + ',' + (arg1 != null ? field3255[3] : field3255[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(IB)I",
      line = 73
   )
   public static final int method1866(int arg0, byte arg1) {
      boolean var2 = client.field1786;

      try {
         ++field3243;
         double var3 = (double)(255 & arg0 >> 16) / 256.0D;
         double var5 = (double)((65420 & arg0) >> 8) / 256.0D;
         if (arg1 != -122) {
            return -15;
         } else {
            double var7 = (double)(arg0 & 255) / 256.0D;
            double var9 = var3;
            if (var3 > var5) {
               var9 = var5;
            }

            if (var7 < var9) {
               var9 = var7;
            }

            double var11 = var3;
            if (var3 < var5) {
               var11 = var5;
            }

            if (var7 > var11) {
               var11 = var7;
            }

            double var13 = 0.0D;
            double var15 = 0.0D;
            double var17 = (var9 + var11) / 2.0D;
            if (var9 != var11) {
               label107: {
                  if (var17 < 0.5D) {
                     var15 = (-var9 + var11) / (var9 + var11);
                  }

                  if (var17 >= 0.5D) {
                     var15 = (-var9 + var11) / (-var11 + 2.0D + -var9);
                  }

                  if (var3 == var11) {
                     var13 = (var5 - var7) / (-var9 + var11);
                     if (!var2) {
                        break label107;
                     }
                  }

                  if (var5 == var11) {
                     var13 = (var7 - var3) / (-var9 + var11) + 2.0D;
                     if (!var2) {
                        break label107;
                     }
                  }

                  if (var7 == var11) {
                     var13 = (var3 - var5) / (-var9 + var11) + 4.0D;
                  }
               }
            }

            int var21;
            int var22;
            int var23;
            label82: {
               double var19 = var13 / 6.0D;
               var21 = (int)(var19 * 256.0D);
               var22 = (int)(var15 * 256.0D);
               var23 = (int)(var17 * 256.0D);
               if (var22 < 0) {
                  var22 = 0;
                  if (!var2) {
                     break label82;
                  }
               }

               if (~var22 < -256) {
                  var22 = 255;
               }
            }

            label77: {
               if (~var23 > -1) {
                  var23 = 0;
                  if (!var2) {
                     break label77;
                  }
               }

               if (~var23 < -256) {
                  var23 = 255;
               }
            }

            if (var23 <= 243) {
               if (~var23 < -218) {
                  var22 >>= 3;
                  if (!var2) {
                     return ((255 & var21) >> 2 << 10) - (-(var22 >> 5 << 7) + -(var23 >> 1));
                  }
               }

               if (var23 > 192) {
                  var22 >>= 2;
                  if (!var2) {
                     return ((255 & var21) >> 2 << 10) - (-(var22 >> 5 << 7) + -(var23 >> 1));
                  }
               }

               if (var23 <= 179) {
                  return ((255 & var21) >> 2 << 10) - (-(var22 >> 5 << 7) + -(var23 >> 1));
               }

               var22 >>= 1;
               if (!var2) {
                  return ((255 & var21) >> 2 << 10) - (-(var22 >> 5 << 7) + -(var23 >> 1));
               }
            }

            var22 >>= 4;
            return ((255 & var21) >> 2 << 10) - (-(var22 >> 5 << 7) + -(var23 >> 1));
         }
      } catch (RuntimeException var25) {
         throw class482.method3757(var25, field3255[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(BLha;)V",
      line = 182
   )
   public static final void method1867(byte arg0, class610 arg1) {
      boolean var2 = client.field1786;

      try {
         ++field3245;
         int var3 = 0;
         int var4 = 0;
         if (class281.field4472) {
            var3 = class600.method4443(0);
            var4 = class218.method1890(0);
         }

         label104: {
            int var5 = -10660793;
            class604.method4461(class344.field5235, var5, class190.field2947 + var4, arg1, (byte)68, class108.field1490 + var3, class572.field8475, -16777216);
            class156.field2324.method2414(class190.field2947 + 14 + var4, class108.field1490 + 3 - -var3, class499.field7612.method3875(class493.field7455, arg0 ^ 4), true, var5, -1);
            int var6 = class690.field10254.method2571(86) - -var3;
            int var7 = var4 + class690.field10254.method2578(true);
            if (!class510.field7804) {
               int var8 = 0;
               class185 var9 = (class185)class326.field4958.method4972((byte)-84);
               if (var2 || var9 != null) {
                  do {
                     int var10 = (class558.field8307 + -1 - var8) * 16 + class190.field2947 + var4 + 31;
                     ++var8;
                     class473.method3681(var6, -1, class572.field8475, -256, 77, arg1, class190.field2947 - -var4, var10, class344.field5235, var9, class108.field1490 + var3, var7);
                     var9 = (class185)class326.field4958.method4975((byte)105);
                  } while(var9 != null);
               }

               if (!var2) {
                  break label104;
               }
            }

            int var11 = 0;
            class525 var12 = (class525)class681.field10158.method3688(true);
            if (var2 || var12 != null) {
               do {
                  label75: {
                     int var13 = var11 * 16 + class190.field2947 + 31 + var4;
                     ++var11;
                     if (var12.field8004 == 1) {
                        class473.method3681(var6, -1, class572.field8475, -256, 102, arg1, class190.field2947 + var4, var13, class344.field5235, (class185)var12.field8005.field7220.field4682, class108.field1490 + var3, var7);
                        if (!var2) {
                           break label75;
                        }
                     }

                     class265.method2288(-1, var7, class190.field2947 - -var4, -113, var13, class344.field5235, -256, arg1, var6, class108.field1490 + var3, var12, class572.field8475);
                  }

                  var12 = (class525)class681.field10158.method3691(20);
               } while(var12 != null);
            }

            if (class525.field7997 != null) {
               int var10000;
               int var10001;
               byte var10002;
               label62: {
                  class604.method4461(class785.field11521, var5, class255.field3853, arg1, (byte)68, class532.field8084, class430.field6640, -16777216);
                  int var14 = 0;
                  class156.field2324.method2414(class255.field3853 + 14, class532.field8084 + 3, class525.field7997.field8002, true, var5, -1);
                  class185 var15 = (class185)class525.field7997.field8005.method3688(true);
                  if (var2) {
                     var10000 = var14 * 16;
                     var10001 = class255.field3853;
                     var10002 = 31;
                  } else if (var15 == null) {
                     var10000 = class255.field3853;
                     var10001 = class532.field8084;
                     var10002 = 0;
                     if (!var2) {
                        break label62;
                     }
                  } else {
                     var10000 = var14 * 16;
                     var10001 = class255.field3853;
                     var10002 = 31;
                  }

                  while(true) {
                     int var16 = var10000 + var10001 + var10002;
                     class473.method3681(var6, -1, class430.field6640, -256, 67, arg1, class255.field3853, var16, class785.field11521, var15, class532.field8084, var7);
                     ++var14;
                     var15 = (class185)class525.field7997.field8005.method3691(arg0 + -82);
                     if (var15 == null) {
                        var10000 = class255.field3853;
                        var10001 = class532.field8084;
                        var10002 = 0;
                        if (!var2) {
                           break;
                        }
                     } else {
                        var10000 = var14 * 16;
                        var10001 = class255.field3853;
                        var10002 = 31;
                     }
                  }
               }

               class547.method4161(var10000, var10001, var10002, class785.field11521, class430.field6640);
            }
         }

         class547.method4161(class190.field2947 + var4, class108.field1490 - -var3, 0, class344.field5235, class572.field8475);
         if (arg0 != 102) {
            field3252 = null;
         }
      } catch (RuntimeException var18) {
         throw class482.method3757(var18, field3255[4] + arg0 + ',' + (arg1 != null ? field3255[3] : field3255[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1868(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1869(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 79;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
