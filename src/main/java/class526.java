import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class526 {
   @OriginalMember(
      owner = "client!cj",
      name = "h",
      descriptor = "Liw;"
   )
   private class107 field7444 = new class107(64);
   @OriginalMember(
      owner = "client!cj",
      name = "a",
      descriptor = "Lsa;"
   )
   private class39 field7450;
   @OriginalMember(
      owner = "client!cj",
      name = "f",
      descriptor = "I"
   )
   public int field7452;
   @OriginalMember(
      owner = "client!cj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7453 = new String[]{method3950(method3949("\u001e\u00034R^")), method3950(method3949("\u0013\u001cvy")), method3950(method3949("\u0006G4;\u000b")), method3950(method3949("\u001e\u00034W^")), method3950(method3949("\u001e\u00034S^")), method3950(method3949("\u001e\u00034P^")), method3950(method3949("\u001e\u00034)\u001f\u0013\u0000n+^")), method3950(method3949("\u001e\u00034Q^")), method3950(method3949("\u001e\u00034T^")), method3950(method3949("\u001e\u00034V^"))};
   @OriginalMember(
      owner = "client!cj",
      name = "g",
      descriptor = "I"
   )
   public static int field7443 = 0;
   @OriginalMember(
      owner = "client!cj",
      name = "e",
      descriptor = "I"
   )
   public static int field7442;
   @OriginalMember(
      owner = "client!cj",
      name = "k",
      descriptor = "I"
   )
   public static int field7445;
   @OriginalMember(
      owner = "client!cj",
      name = "c",
      descriptor = "I"
   )
   public static int field7446;
   @OriginalMember(
      owner = "client!cj",
      name = "i",
      descriptor = "I"
   )
   public static int field7447;
   @OriginalMember(
      owner = "client!cj",
      name = "j",
      descriptor = "I"
   )
   public static int field7448;
   @OriginalMember(
      owner = "client!cj",
      name = "d",
      descriptor = "I"
   )
   public static int field7449;
   @OriginalMember(
      owner = "client!cj",
      name = "b",
      descriptor = "I"
   )
   public static int field7451;

   @OriginalMember(
      owner = "client!cj",
      name = "a",
      descriptor = "(IILha;IIIILtea;IIII)V"
   )
   public static final void method3942(int arg0, int arg1, class17 arg2, int arg3, int arg4, int arg5, int arg6, class272 arg7, int arg8, int arg9, int arg10, int arg11) {
      try {
         ++field7445;
         if (arg11 < arg8 && arg8 < arg6 + arg11 && arg0 + -13 < arg9 && ~(arg0 + 3) < ~arg9 && arg7.field4165) {
            arg4 = arg1;
         }

         int[] var12 = null;
         if (!class536.method3997(arg10 ^ 114, arg7.field4159)) {
            if (arg7.field4161 != -1) {
               var12 = class201.field2882.method5591(arg7.field4161, (byte)-84).field8845;
            } else if (!class220.method1904(0, arg7.field4159)) {
               if (class77.method849(arg10 + 119, arg7.field4159)) {
                  class544 var13 = class549.field7834.method3850(arg10 + 3912, (int)(arg7.field4166 >>> 32 & 2147483647L));
                  if (var13.field7741 != null) {
                     var13 = var13.method4068(-24716, class344.field5074);
                  }

                  if (var13 != null) {
                     var12 = var13.field7722;
                  }
               }
            } else {
               class432 var14 = (class432)class573.field8110.method3101(-1, (long)((int)arg7.field4166));
               if (var14 != null) {
                  class799 var15 = var14.field6345;
                  class302 var16 = var15.field11618;
                  if (var16.field4550 != null) {
                     var16 = var16.method2501(class344.field5074, 126);
                  }

                  if (var16 != null) {
                     var12 = var16.field4568;
                  }
               }
            }
         } else {
            var12 = class201.field2882.method5591((int)arg7.field4166, (byte)-84).field8845;
         }

         if (arg10 == 5) {
            String var17 = class327.method2622(-8744, arg7);
            if (var12 != null) {
               var17 = var17 + class142.method1418(var12, (byte)101);
            }

            class437.field6409.method1874(var17, 0, class72.field1169, arg11 + 3, class134.field2183, arg0, 215, arg4);
            if (arg7.field4157) {
               class666.field9376.method1451(arg11 + 5 - -class705.field10143.method3430(32, var17), arg0 + -12);
            }
         }
      } catch (RuntimeException var19) {
         throw class612.method4503(var19, field7453[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7453[2] : field7453[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field7453[2] : field7453[1]) + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cj",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3943(int arg0) {
      try {
         ++field7448;
         if (arg0 > 28) {
            class107 var2 = this.field7444;
            synchronized(this.field7444) {
               this.field7444.method1052(true);
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field7453[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cj",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method3944(boolean arg0) {
      try {
         class107 var2 = this.field7444;
         synchronized(this.field7444) {
            this.field7444.method1045(3);
         }

         if (arg0) {
            ++field7449;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field7453[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cj",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method3945(int arg0, int arg1) {
      try {
         if (arg1 < 85) {
            this.field7444 = null;
         }

         ++field7451;
         class107 var3 = this.field7444;
         synchronized(this.field7444) {
            this.field7444.method1048(arg0, -8543);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field7453[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cj",
      name = "a",
      descriptor = "(Z)Lqaa;"
   )
   public static final class119 method3946(boolean arg0) {
      try {
         if (!arg0) {
            method3942(-84, 79, (class17)null, -96, -111, 109, -18, (class272)null, -37, 115, 67, -45);
         }

         ++field7446;
         return class691.field9950;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7453[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cj",
      name = "c",
      descriptor = "(II)I"
   )
   public static final int method3947(int arg0, int arg1) {
      try {
         ++field7442;
         if (arg1 >= -49) {
            method3942(-36, 9, (class17)null, -25, -45, 48, -66, (class272)null, 58, -51, -18, -22);
         }

         return 127 & arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7453[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cj",
      name = "a",
      descriptor = "(II)Ltt;"
   )
   public final class503 method3948(int arg0, int arg1) {
      try {
         ++field7447;
         class107 var3 = this.field7444;
         class503 var4;
         synchronized(this.field7444) {
            var4 = (class503)this.field7444.method1041((long)arg1, 8);
         }

         if (arg0 <= 34) {
            this.field7452 = -103;
         }

         if (var4 != null) {
            return var4;
         } else {
            class39 var5 = this.field7450;
            byte[] var6;
            synchronized(this.field7450) {
               var6 = this.field7450.method460((byte)-11, arg1, 16);
            }

            class503 var7 = new class503();
            if (var6 != null) {
               var7.method3801(0, new class65(var6));
            }

            class107 var8 = this.field7444;
            synchronized(this.field7444) {
               this.field7444.method1050(-117, var7, (long)arg1);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field7453[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cj",
      name = "<init>",
      descriptor = "(Ltb;ILsa;)V"
   )
   public class526(class392 arg0, int arg1, class39 arg2) {
      try {
         this.field7450 = arg2;
         if (this.field7450 == null) {
            this.field7452 = 0;
         } else {
            this.field7452 = this.field7450.method434((byte)-106, 16);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field7453[6] + (arg0 != null ? field7453[2] : field7453[1]) + ',' + arg1 + ',' + (arg2 != null ? field7453[2] : field7453[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3949(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3950(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 26;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
