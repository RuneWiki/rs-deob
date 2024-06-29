import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class440 {
   @OriginalMember(
      owner = "client!wm",
      name = "f",
      descriptor = "[B"
   )
   private byte[] field6442;
   @OriginalMember(
      owner = "client!wm",
      name = "e",
      descriptor = "I"
   )
   public int field6439;
   @OriginalMember(
      owner = "client!wm",
      name = "m",
      descriptor = "[[B"
   )
   private byte[][] field6445;
   @OriginalMember(
      owner = "client!wm",
      name = "d",
      descriptor = "I"
   )
   public int field6459;
   @OriginalMember(
      owner = "client!wm",
      name = "s",
      descriptor = "I"
   )
   public int field6458;
   @OriginalMember(
      owner = "client!wm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6460 = new String[]{method3434(method3433("PA\u001a\u000f\u001f")), method3434(method3433("BYF,")), method3434(method3433("\\\u0002\u001amJ")), method3434(method3433("PA\u001a\n\u001f")), method3434(method3433("ING3")), method3434(method3433("@X")), method3434(method3433("DCD:")), method3434(method3433("KX")), method3434(method3433("TDM")), method3434(method3433("UIS")), method3434(method3433("\t\u0002\u001a")), method3434(method3433("IYX/")), method3434(method3433("NAS~")), method3434(method3433("SEY&D")), method3434(method3433("PA\u001a\u0006\u001f")), method3434(method3433("PA\u001a\u0004\u001f")), method3434(method3433("PA\u001a\u0002\u001f")), method3434(method3433("PA\u001a\u0000\u001f")), method3434(method3433("PA\u001a\t\u001f")), method3434(method3433("PA\u001a\b\u001f")), method3434(method3433("E^")), method3434(method3433("PA\u001a\u0007\u001f")), method3434(method3433("PA\u001a\u0001\u001f")), method3434(method3433("PA\u001a\u007f^IE@}\u001f")), method3434(method3433("PA\u001a\u000b\u001f")), method3434(method3433("PA\u001a\u0005\u001f"))};
   @OriginalMember(
      owner = "client!wm",
      name = "p",
      descriptor = "I"
   )
   public static int field6444 = -1;
   @OriginalMember(
      owner = "client!wm",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field6446 = new int[25];
   @OriginalMember(
      owner = "client!wm",
      name = "h",
      descriptor = "[Lkca;"
   )
   public static class12[] field6456 = new class12[128];
   @OriginalMember(
      owner = "client!wm",
      name = "u",
      descriptor = "I"
   )
   public static int field6440;
   @OriginalMember(
      owner = "client!wm",
      name = "b",
      descriptor = "I"
   )
   public static int field6441;
   @OriginalMember(
      owner = "client!wm",
      name = "l",
      descriptor = "I"
   )
   public static int field6443;
   @OriginalMember(
      owner = "client!wm",
      name = "k",
      descriptor = "I"
   )
   public static int field6447;
   @OriginalMember(
      owner = "client!wm",
      name = "o",
      descriptor = "I"
   )
   public static int field6448;
   @OriginalMember(
      owner = "client!wm",
      name = "i",
      descriptor = "I"
   )
   public static int field6449;
   @OriginalMember(
      owner = "client!wm",
      name = "c",
      descriptor = "I"
   )
   public static int field6450;
   @OriginalMember(
      owner = "client!wm",
      name = "g",
      descriptor = "I"
   )
   public static int field6452;
   @OriginalMember(
      owner = "client!wm",
      name = "t",
      descriptor = "I"
   )
   public static int field6453;
   @OriginalMember(
      owner = "client!wm",
      name = "j",
      descriptor = "I"
   )
   public static int field6454;
   @OriginalMember(
      owner = "client!wm",
      name = "q",
      descriptor = "I"
   )
   public static int field6455;
   @OriginalMember(
      owner = "client!wm",
      name = "n",
      descriptor = "Lcv;"
   )
   public static class249 field6451;
   @OriginalMember(
      owner = "client!wm",
      name = "r",
      descriptor = "Lcu;"
   )
   public static class65 field6457;

   @OriginalMember(
      owner = "client!wm",
      name = "a",
      descriptor = "(Ljava/lang/String;II[Lma;)I"
   )
   public final int method3421(String arg0, int arg1, int arg2, class148[] arg3) {
      try {
         if (arg2 != 3599) {
            this.method3424((String)null, (class148[])null, -67, -2, -75);
         }

         ++field6452;
         return this.method3426((byte)114, arg0, class24.field349, new int[]{arg1}, arg3);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field6460[18] + (arg0 != null ? field6460[2] : field6460[11]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6460[2] : field6460[11]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wm",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3422(byte arg0) {
      try {
         if (arg0 != 8) {
            field6451 = null;
         }

         field6456 = null;
         field6451 = null;
         field6446 = null;
         field6457 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6460[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wm",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method3423(int arg0, byte arg1) {
      try {
         ++field6448;
         return arg1 != 121 ? 43 : this.field6442[arg0] & 255;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6460[16] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wm",
      name = "a",
      descriptor = "(Ljava/lang/String;[Lma;III)I"
   )
   public final int method3424(String arg0, class148[] arg1, int arg2, int arg3, int arg4) {
      try {
         if (arg4 == 0) {
            arg4 = this.field6439;
         }

         ++field6441;
         int var6 = this.method3426((byte)115, arg0, class24.field349, new int[]{arg3}, arg1);
         if (arg2 >= -97) {
            this.field6445 = null;
         }

         int var7 = (var6 + -1) * arg4;
         return this.field6459 + var7 + this.field6458;
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field6460[17] + (arg0 != null ? field6460[2] : field6460[11]) + ',' + (arg1 != null ? field6460[2] : field6460[11]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wm",
      name = "a",
      descriptor = "(IBC)I"
   )
   public final int method3425(int arg0, byte arg1, char arg2) {
      try {
         ++field6447;
         int var4 = -109 / ((7 - arg1) / 37);
         return this.field6445 != null ? this.field6445[arg0][arg2] : 0;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field6460[21] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wm",
      name = "a",
      descriptor = "(BLjava/lang/String;[Ljava/lang/String;[I[Lma;)I"
   )
   public final int method3426(byte param1, String param2, String[] param3, int[] param4, class148[] param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wm",
      name = "a",
      descriptor = "(I[Lma;ILjava/lang/String;)Ljava/lang/String;"
   )
   public final String method3427(int param1, class148[] param2, int param3, String param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wm",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method3428(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wm",
      name = "a",
      descriptor = "(I[Lma;Ljava/lang/String;)I"
   )
   public final int method3429(int param1, class148[] param2, String param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wm",
      name = "a",
      descriptor = "(ILjava/lang/String;)I"
   )
   public final int method3430(int arg0, String arg1) {
      try {
         if (arg0 != 32) {
            return -68;
         } else {
            ++field6455;
            return this.method3429(-91, (class148[])null, arg1);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6460[15] + arg0 + ',' + (arg1 != null ? field6460[2] : field6460[11]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wm",
      name = "a",
      descriptor = "(Ljava/lang/String;I[Lma;I)I"
   )
   public final int method3431(String arg0, int arg1, class148[] arg2, int arg3) {
      boolean var5 = client.field10022;

      try {
         ++field6454;
         int var6 = this.method3426((byte)120, arg0, class24.field349, new int[]{arg1}, arg2);
         int var7 = 0;
         if (arg3 <= 64) {
            field6446 = null;
         }

         int var8 = 0;
         int var9;
         if (var5) {
            var9 = this.method3429(-109, arg2, class24.field349[var8]);
            if (~var7 > ~var9) {
               var7 = var9;
            }

            ++var8;
         }

         while(true) {
            int var10000;
            if (var6 <= var8) {
               var10000 = var7;
               if (!var5) {
                  return var7;
               }
            } else {
               var10000 = this.method3429(-109, arg2, class24.field349[var8]);
            }

            var9 = var10000;
            if (~var7 > ~var9) {
               var7 = var9;
            }

            ++var8;
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field6460[14] + (arg0 != null ? field6460[2] : field6460[11]) + ',' + arg1 + ',' + (arg2 != null ? field6460[2] : field6460[11]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wm",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method3432(int arg0) {
      boolean var1 = client.field10022;

      try {
         ++field6453;
         int[] var2 = new int[class201.field2882.field11272];
         int var3 = 0;
         int var4 = 0;
         if (var1 || class201.field2882.field11272 > var4) {
            do {
               class618 var5 = class201.field2882.method5591(var4, (byte)-84);
               if (var5.field8814 < 0) {
                  if (var5.field8832 >= 0) {
                     var2[var3++] = var4++;
                  } else {
                     ++var4;
                  }
               } else {
                  var2[var3++] = var4++;
               }
            } while(class201.field2882.field11272 > var4);
         }

         class478.field6884 = new int[var3];
         int var6 = 0;
         if (var1) {
            class478.field6884[var6] = var2[var6];
            ++var6;
         }

         while(true) {
            while(~var6 > ~var3) {
               class478.field6884[var6] = var2[var6];
               ++var6;
            }

            if (!var1) {
               if (arg0 != 1) {
                  field6457 = null;
                  return;
               }

               return;
            }

            ++var6;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field6460[25] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wm",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class440(byte[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3433(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3434(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 67;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
