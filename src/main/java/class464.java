import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public class class464 {
   @OriginalMember(
      owner = "client!sha",
      name = "e",
      descriptor = "Llj;"
   )
   private class304 field7039 = new class304(16);
   @OriginalMember(
      owner = "client!sha",
      name = "i",
      descriptor = "Lrr;"
   )
   private class678 field7044;
   @OriginalMember(
      owner = "client!sha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7055 = new String[]{method3608(method3607("dK\n8\u0018?")), method3608(method3607("dK\n8\u0019?")), method3608(method3607("l\rE8,")), method3608(method3607("dK\n8\u0017?")), method3608(method3607("yV\u0007z")), method3608(method3607("dK\n8\u0016?")), method3608(method3607("dK\n8m~M\u0002bo?")), method3608(method3607("dK\n8\u0012?")), method3608(method3607("dK\n8\u001b?")), method3608(method3607("dK\n8\u0013?")), method3608(method3607("dK\n8\u0015?")), method3608(method3607("dK\n8\u001a?")), method3608(method3607("dK\n8\u0014?")), method3608(method3607("dK\n8\u0010?"))};
   @OriginalMember(
      owner = "client!sha",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field7043 = new int[]{1, -1, -1, 1};
   @OriginalMember(
      owner = "client!sha",
      name = "b",
      descriptor = "Luk;"
   )
   public static class498 field7041 = new class498(62, 1);
   @OriginalMember(
      owner = "client!sha",
      name = "h",
      descriptor = "I"
   )
   public static int field7049 = 0;
   @OriginalMember(
      owner = "client!sha",
      name = "q",
      descriptor = "I"
   )
   public static int field7053 = 1339;
   @OriginalMember(
      owner = "client!sha",
      name = "p",
      descriptor = "I"
   )
   public static int field7038;
   @OriginalMember(
      owner = "client!sha",
      name = "n",
      descriptor = "I"
   )
   public static int field7040;
   @OriginalMember(
      owner = "client!sha",
      name = "o",
      descriptor = "I"
   )
   public static int field7042;
   @OriginalMember(
      owner = "client!sha",
      name = "l",
      descriptor = "I"
   )
   public static int field7045;
   @OriginalMember(
      owner = "client!sha",
      name = "j",
      descriptor = "I"
   )
   public static int field7046;
   @OriginalMember(
      owner = "client!sha",
      name = "m",
      descriptor = "I"
   )
   public static int field7047;
   @OriginalMember(
      owner = "client!sha",
      name = "a",
      descriptor = "I"
   )
   public static int field7048;
   @OriginalMember(
      owner = "client!sha",
      name = "g",
      descriptor = "I"
   )
   public static int field7050;
   @OriginalMember(
      owner = "client!sha",
      name = "f",
      descriptor = "I"
   )
   public static int field7051;
   @OriginalMember(
      owner = "client!sha",
      name = "k",
      descriptor = "I"
   )
   public static int field7052;
   @OriginalMember(
      owner = "client!sha",
      name = "c",
      descriptor = "I"
   )
   public static int field7054;

   @OriginalMember(
      owner = "client!sha",
      name = "a",
      descriptor = "(BI)I",
      line = 3
   )
   public static final int method3596(byte arg0, int arg1) {
      try {
         ++field7046;
         return arg0 != 103 ? 14 : arg1 >>> 10;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7055[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sha",
      name = "c",
      descriptor = "(I)V",
      line = 14
   )
   public static void method3597(int arg0) {
      try {
         field7043 = null;
         int var1 = -88 / ((-79 - arg0) / 44);
         field7041 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7055[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sha",
      name = "a",
      descriptor = "(IB)Lvja;",
      line = 24
   )
   private final class145 method3598(int arg0, byte arg1) {
      try {
         ++field7040;
         class304 var3 = this.field7039;
         class145 var5;
         synchronized(this.field7039) {
            int var4 = 123 / ((-23 - arg1) / 42);
            var5 = (class145)this.field7039.method2544(false, (long)arg0);
         }

         if (var5 != null) {
            return var5;
         } else {
            class678 var6 = this.field7044;
            byte[] var7;
            synchronized(this.field7044) {
               var7 = this.field7044.method5017(29, arg0, (byte)71);
            }

            class145 var8 = new class145();
            if (var7 != null) {
               var8.method1314(new class354(var7), -123);
            }

            class304 var9 = this.field7039;
            synchronized(this.field7039) {
               this.field7039.method2545((long)arg0, 126, var8);
               return var8;
            }
         }
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field7055[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sha",
      name = "d",
      descriptor = "(I)V",
      line = 54
   )
   public final void method3599(int arg0) {
      try {
         class304 var2 = this.field7039;
         synchronized(this.field7039) {
            this.field7039.method2551(true);
         }

         ++field7048;
         if (arg0 != 1) {
            method3606(-75, -26, -122, 31, 18);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7055[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sha",
      name = "a",
      descriptor = "(II[FII[FIIIIF)V",
      line = 73
   )
   public static final void method3600(int arg0, int arg1, float[] arg2, int arg3, int arg4, float[] arg5, int arg6, int arg7, int arg8, int arg9, float arg10) {
      boolean var11 = client.field1786;

      try {
         int var24 = arg6 - arg4;
         ++field7042;
         int var22 = arg0 - arg7;
         if (arg3 <= 4) {
            method3602(-120);
         }

         float var16;
         float var17;
         label41: {
            int var23 = arg1 - arg9;
            float var12 = arg2[2] * (float)var24 + arg2[1] * (float)var23 + arg2[0] * (float)var22;
            float var13 = arg2[5] * (float)var24 + arg2[4] * (float)var23 + arg2[3] * (float)var22;
            float var14 = arg2[8] * (float)var24 + arg2[7] * (float)var23 + arg2[6] * (float)var22;
            float var15 = (float)Math.sqrt((double)(var14 * var14 + var12 * var12 + var13 * var13));
            var16 = (float)Math.atan2((double)var12, (double)var14) / 6.2831855F + 0.5F;
            var17 = arg10 + 0.5F + (float)Math.asin((double)(var13 / var15)) / 3.1415927F;
            if (arg8 != 1) {
               if (arg8 == 2) {
                  var17 = -var17;
                  var16 = -var16;
                  if (!var11) {
                     break label41;
                  }
               }

               if (~arg8 != -4) {
                  break label41;
               }

               float var18 = var16;
               var16 = var17;
               var17 = -var18;
               if (!var11) {
                  break label41;
               }
            }

            float var19 = var16;
            var16 = -var17;
            var17 = var19;
         }

         arg5[1] = var17;
         arg5[0] = var16;
      } catch (RuntimeException var21) {
         throw class482.method3757(var21, field7055[11] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7055[2] : field7055[4]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field7055[2] : field7055[4]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sha",
      name = "a",
      descriptor = "(IIIILoja;I)Lgg;",
      line = 125
   )
   public final class429 method3601(int arg0, int arg1, int arg2, int arg3, class238 arg4, int arg5) {
      boolean var7 = client.field1786;

      try {
         ++field7050;
         class15[] var8 = null;
         class145 var9 = this.method3598(arg3, (byte)55);
         int var10 = 70 % ((arg0 - -54) / 49);
         if (var9.field2066 != null) {
            var8 = new class15[var9.field2066.length];
            int var11 = 0;
            if (var7 || var8.length > var11) {
               do {
                  class801 var12 = arg4.method2029(var9.field2066[var11], (byte)-42);
                  var8[var11] = new class15(var12.field11658, var12.field11651, var12.field11659, var12.field11649, var12.field11647, var12.field11653, var12.field11660, var12.field11648, var12.field11646, var12.field11655, var12.field11650);
                  ++var11;
               } while(var8.length > var11);
            }
         }

         return new class429(var9.field2069, var8, var9.field2068, arg5, arg1, arg2, var9.field2061, var9.field2062);
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field7055[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field7055[2] : field7055[4]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sha",
      name = "b",
      descriptor = "(I)[I",
      line = 155
   )
   public static final int[] method3602(int arg0) {
      try {
         if (arg0 >= -88) {
            return null;
         } else {
            ++field7051;
            return new int[]{class633.field9161, class20.field255, class553.field8274};
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7055[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sha",
      name = "b",
      descriptor = "(BI)V",
      line = 171
   )
   public final void method3603(byte arg0, int arg1) {
      try {
         class304 var3 = this.field7039;
         synchronized(this.field7039) {
            this.field7039.method2552(arg1, arg0 ^ -21592);
         }

         ++field7038;
         if (arg0 != -75) {
            method3606(-26, 97, -67, -17, -88);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field7055[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sha",
      name = "a",
      descriptor = "(I)V",
      line = 186
   )
   public final void method3604(int arg0) {
      try {
         ++field7047;
         class304 var2 = this.field7039;
         synchronized(this.field7039) {
            this.field7039.method2554(-120);
         }

         if (arg0 <= 101) {
            this.field7039 = null;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7055[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sha",
      name = "a",
      descriptor = "(IIIIIII)V",
      line = 208
   )
   public static final void method3605(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field1786;

      try {
         label55: {
            if (~arg3 > ~class443.field6806 || ~arg5 < ~class182.field2833 || arg4 < class368.field5724 || arg6 > class84.field1212) {
               if (~arg0 == -2) {
                  class259.method2259((byte)75, arg5, arg1, arg4, arg3, arg6);
                  if (!var7) {
                     break label55;
                  }
               }

               class12.method93(arg3, arg1, arg5, arg0, arg6, arg4, (byte)40);
               if (!var7) {
                  break label55;
               }
            }

            if (~arg0 != -2) {
               class573.method4309(arg6, (byte)-128, arg4, arg3, arg1, arg5, arg0);
               if (!var7) {
                  break label55;
               }
            }

            class287.method2399(arg1, arg3, arg4, arg6, 88, arg5);
         }

         if (arg2 != -5462) {
            field7054 = -45;
         }

         ++field7045;
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field7055[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sha",
      name = "a",
      descriptor = "(IIIII)Lgg;",
      line = 244
   )
   public static final class429 method3606(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field7052;
         if (arg1 != 27718) {
            field7041 = null;
         }

         long var5 = ((long)arg4 & 65535L) << 32 | ((long)arg0 & 65535L) << 48 | ((long)arg3 & 65535L) << 16 | (long)arg2 & 65535L;
         class429 var7 = (class429)class790.field11558.method2544(false, var5);
         if (var7 == null) {
            var7 = class739.field10975.method3601(-120, arg4, arg3, arg2, class88.field1274, arg0);
            class790.field11558.method2545(var5, 110, var7);
         }

         return var7;
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field7055[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sha",
      name = "<init>",
      descriptor = "(Ltv;ILrr;)V",
      line = 270
   )
   public class464(class311 arg0, int arg1, class678 arg2) {
      try {
         this.field7044 = arg2;
         this.field7044.method4998((byte)-82, 29);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7055[6] + (arg0 != null ? field7055[2] : field7055[4]) + ',' + arg1 + ',' + (arg2 != null ? field7055[2] : field7055[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3607(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3608(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 23;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
