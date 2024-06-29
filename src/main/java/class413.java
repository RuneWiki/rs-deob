import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class413 {
   @OriginalMember(
      owner = "client!mda",
      name = "d",
      descriptor = "Liw;"
   )
   private class107 field6057 = new class107(64);
   @OriginalMember(
      owner = "client!mda",
      name = "e",
      descriptor = "Liw;"
   )
   public class107 field6062 = new class107(60);
   @OriginalMember(
      owner = "client!mda",
      name = "g",
      descriptor = "Lsa;"
   )
   public class39 field6052;
   @OriginalMember(
      owner = "client!mda",
      name = "l",
      descriptor = "Lsa;"
   )
   private class39 field6059;
   @OriginalMember(
      owner = "client!mda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6066 = new String[]{method3232(method3231(":nGL6\u007f")), method3232(method3231(":nGL2\u007f")), method3232(method3231(":nGL0\u007f")), method3232(method3231(":nGL3\u007f")), method3232(method3231(":nGL4\u007f")), method3232(method3231(":nGL5\u007f")), method3232(method3231(",$\bL\f")), method3232(method3231(":nGL7\u007f")), method3232(method3231("9\u007fJ\u000e")), method3232(method3231(":nGL9\u007f")), method3232(method3231(":nGLM>dO\u0016O\u007f"))};
   @OriginalMember(
      owner = "client!mda",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field6054 = false;
   @OriginalMember(
      owner = "client!mda",
      name = "h",
      descriptor = "I"
   )
   public static int field6053;
   @OriginalMember(
      owner = "client!mda",
      name = "a",
      descriptor = "I"
   )
   public static int field6055;
   @OriginalMember(
      owner = "client!mda",
      name = "k",
      descriptor = "I"
   )
   public static int field6056;
   @OriginalMember(
      owner = "client!mda",
      name = "c",
      descriptor = "I"
   )
   public static int field6058;
   @OriginalMember(
      owner = "client!mda",
      name = "m",
      descriptor = "I"
   )
   public static int field6060;
   @OriginalMember(
      owner = "client!mda",
      name = "n",
      descriptor = "I"
   )
   public static int field6061;
   @OriginalMember(
      owner = "client!mda",
      name = "i",
      descriptor = "I"
   )
   public static int field6063;
   @OriginalMember(
      owner = "client!mda",
      name = "j",
      descriptor = "I"
   )
   public int field6065;
   @OriginalMember(
      owner = "client!mda",
      name = "f",
      descriptor = "Lns;"
   )
   public static class382 field6064;

   @OriginalMember(
      owner = "client!mda",
      name = "a",
      descriptor = "(IIZ)V"
   )
   public static final void method3223(int arg0, int arg1, boolean arg2) {
      try {
         ++field6063;
         class111 var3 = class796.method5734(13, (long)arg1, (byte)-113);
         var3.method1087(0);
         var3.field1740 = arg0;
         if (arg2) {
            field6064 = null;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field6066[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3224(int arg0) {
      try {
         class107 var2 = this.field6057;
         synchronized(this.field6057) {
            this.field6057.method1045(3);
         }

         if (arg0 < 98) {
            this.field6057 = null;
         }

         ++field6060;
         class107 var3 = this.field6062;
         synchronized(this.field6062) {
            this.field6062.method1045(3);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field6066[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "a",
      descriptor = "(ILha;IIILjga;)V"
   )
   public static final void method3225(int arg0, class17 arg1, int arg2, int arg3, int arg4, class91 arg5) {
      boolean var6 = client.field10022;

      try {
         ++field6058;
         int var7 = 7;
         if (arg4 <= -91) {
            while(var7 >= 0) {
               int var8 = 127;
               if (var6 || var8 >= 0) {
                  do {
                     int var9 = arg0 << 10 & 64512 | (var7 & 7) << 7 | var8 & 127;
                     class274.method2317(true, false, (byte)24);
                     int var10 = class744.field10589[var9];
                     class130.method1327(false, true, -111);
                     arg1.method226(arg2 - -(arg5.field1513 * var8 >> 7), arg3 - -((-var7 + 7) * arg5.field1452 >> 3), (arg5.field1513 >> 7) + 1, (arg5.field1452 >> 3) - -1, var10, 0);
                     --var8;
                  } while(var8 >= 0);
               }

               --var7;
            }

         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field6066[7] + arg0 + ',' + (arg1 != null ? field6066[6] : field6066[8]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field6066[6] : field6066[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "b",
      descriptor = "(II)Ljd;"
   )
   public final class130 method3226(int arg0, int arg1) {
      try {
         ++field6053;
         if (arg1 != -31219) {
            this.method3227(-32, -117);
         }

         class107 var3 = this.field6057;
         class130 var4;
         synchronized(this.field6057) {
            var4 = (class130)this.field6057.method1041((long)arg0, 8);
         }

         if (var4 != null) {
            return var4;
         } else {
            class39 var5 = this.field6059;
            byte[] var6;
            synchronized(this.field6059) {
               var6 = this.field6059.method460((byte)-11, class500.method3785(arg0, 255), class17.method140((byte)113, arg0));
            }

            class130 var7 = new class130();
            var7.field2091 = arg0;
            var7.field2093 = this;
            if (var6 != null) {
               var7.method1332((byte)-118, new class65(var6));
            }

            class107 var8 = this.field6057;
            synchronized(this.field6057) {
               this.field6057.method1050(-121, var7, (long)arg0);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field6066[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method3227(int arg0, int arg1) {
      try {
         ++field6055;
         this.field6065 = arg1;
         if (arg0 != 19209) {
            this.method3226(-116, -83);
         }

         class107 var3 = this.field6062;
         synchronized(this.field6062) {
            this.field6062.method1052(true);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field6066[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method3228(byte arg0, int arg1) {
      try {
         if (arg0 < 36) {
            method3223(1, 82, true);
         }

         ++field6061;
         class107 var3 = this.field6057;
         synchronized(this.field6057) {
            this.field6057.method1048(arg1, -8543);
         }

         class107 var4 = this.field6062;
         synchronized(this.field6062) {
            this.field6062.method1048(arg1, -8543);
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field6066[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3229(boolean arg0) {
      try {
         field6064 = null;
         if (!arg0) {
            method3229(true);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6066[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method3230(boolean arg0) {
      try {
         ++field6056;
         class107 var2 = this.field6057;
         synchronized(this.field6057) {
            this.field6057.method1052(arg0);
         }

         class107 var3 = this.field6062;
         synchronized(this.field6062) {
            this.field6062.method1052(arg0);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field6066[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "<init>",
      descriptor = "(Ltb;ILsa;Lsa;)V"
   )
   public class413(class392 arg0, int arg1, class39 arg2, class39 arg3) {
      try {
         this.field6052 = arg3;
         this.field6059 = arg2;
         int var5 = -1 + this.field6059.method454(100);
         this.field6059.method434((byte)-106, var5);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field6066[10] + (arg0 != null ? field6066[6] : field6066[8]) + ',' + arg1 + ',' + (arg2 != null ? field6066[6] : field6066[8]) + ',' + (arg3 != null ? field6066[6] : field6066[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3231(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 113);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3232(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 87;
            break;
         case 1:
            var10005 = 10;
            break;
         case 2:
            var10005 = 38;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 113;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
