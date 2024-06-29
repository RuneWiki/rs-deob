import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public abstract class class25 implements class505 {
   @OriginalMember(
      owner = "client!an",
      name = "k",
      descriptor = "Leaa;"
   )
   private class526 field259;
   @OriginalMember(
      owner = "client!an",
      name = "m",
      descriptor = "Ltc;"
   )
   public class370 field263;
   @OriginalMember(
      owner = "client!an",
      name = "i",
      descriptor = "Leaa;"
   )
   public class526 field270;
   @OriginalMember(
      owner = "client!an",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field273 = new String[]{method173(method172("%Z\u0002S")), method173(method172("*A@pb")), method173(method172("0\u0001@\u00117")), method173(method172("*A@}b")), method173(method172("*A@vb")), method173(method172("*A@ob")), method173(method172("*A@~b")), method173(method172("k\u0007")), method173(method172("*A@zb")), method173(method172("*A@qb")), method173(method172("*A@|b")), method173(method172("*A@\u0003#%F\u001a\u0001b"))};
   @OriginalMember(
      owner = "client!an",
      name = "o",
      descriptor = "I"
   )
   public static int field261 = -1;
   @OriginalMember(
      owner = "client!an",
      name = "a",
      descriptor = "I"
   )
   public static int field258;
   @OriginalMember(
      owner = "client!an",
      name = "e",
      descriptor = "I"
   )
   public static int field260;
   @OriginalMember(
      owner = "client!an",
      name = "b",
      descriptor = "I"
   )
   public static int field262;
   @OriginalMember(
      owner = "client!an",
      name = "g",
      descriptor = "I"
   )
   public static int field264;
   @OriginalMember(
      owner = "client!an",
      name = "l",
      descriptor = "I"
   )
   public static int field265;
   @OriginalMember(
      owner = "client!an",
      name = "h",
      descriptor = "I"
   )
   public static int field266;
   @OriginalMember(
      owner = "client!an",
      name = "j",
      descriptor = "I"
   )
   public static int field268;
   @OriginalMember(
      owner = "client!an",
      name = "n",
      descriptor = "I"
   )
   private int field269;
   @OriginalMember(
      owner = "client!an",
      name = "d",
      descriptor = "I"
   )
   public static int field271;
   @OriginalMember(
      owner = "client!an",
      name = "c",
      descriptor = "J"
   )
   private long field272;
   @OriginalMember(
      owner = "client!an",
      name = "f",
      descriptor = "Lda;"
   )
   private class67 field267;

   @OriginalMember(
      owner = "client!an",
      name = "a",
      descriptor = "(Ljava/net/Socket;BI)Lsa;"
   )
   public static final class214 method163(Socket arg0, byte arg1, int arg2) throws IOException {
      try {
         int var3 = 39 % ((-13 - arg1) / 32);
         ++field268;
         return new class88(arg0, arg2);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field273[1] + (arg0 != null ? field273[2] : field273[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method164(byte arg0) {
      int var2 = client.field4530;

      try {
         ++field260;
         int var3 = class623.field9082.method3016(0);
         if (arg0 < 80) {
            this.field270 = null;
         }

         int var4 = var3 * 100;
         if (this.field269 != var3 || var3 == 0) {
            this.field269 = var3;
            this.field272 = class188.method1462(true);
            if (var2 == 0) {
               return var4;
            }
         }

         int var5 = class623.field9082.method3011((byte)106);
         if (var3 < var5) {
            long var6 = this.field272 - class623.field9082.method3018(16777215);
            if (~var6 < -1L) {
               long var8 = var6 * 10000L / (long)var3 * (long)(-var3 + var5);
               long var10 = 10000L * (-this.field272 + class188.method1462(true));
               if (var8 <= var10) {
                  var4 = var5 * 100;
                  if (var2 == 0) {
                     return var4;
                  }
               }

               var4 = (int)((long)(-var3 + var5) * var10 * 100L / var8 - -((long)(var3 * 100)));
            }
         }

         return var4;
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field273[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "a",
      descriptor = "(I)V"
   )
   public void method165(int arg0) {
      try {
         ++field258;
         class763 var2 = class145.method1203((byte)79, this.field259, this.field263.field5638);
         if (arg0 != 25668) {
            this.field272 = -108L;
         }

         this.field267 = class786.field11439.method570(var2, class671.method4884(this.field270, this.field263.field5638), true);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field273[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method166(byte arg0) {
      int var1 = client.field4530;

      try {
         ++field264;
         int var2 = -4 / ((arg0 - 73) / 46);
         int var3 = 0;
         if (var1 != 0 || ~class690.field10400 < ~var3) {
            do {
               int var4 = class677.method4945(class690.field10400, (byte)102, class580.field8592 + var3) * class312.field4444;
               int var5 = 0;
               if (var1 != 0 || var5 < class312.field4444) {
                  do {
                     int var6 = var4 + class677.method4945(class312.field4444, (byte)120, class665.field9665 + var5);
                     if (class102.field1254[var6] == class433.field6607) {
                        class178.field2201[var6].method4581(0, 0, class186.field2315, class519.field7557, class186.field2315 * var5, class519.field7557 * var3, true, true);
                     }

                     ++var5;
                  } while(var5 < class312.field4444);
               }

               ++var3;
            } while(~class690.field10400 < ~var3);

         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field273[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "a",
      descriptor = "(IILhv;)I"
   )
   public static final int method167(int arg0, int arg1, class544 arg2) {
      try {
         ++field262;
         if (!client.method2388(arg2).method3549(arg1, -128) && arg2.field7937 == null) {
            return -1;
         } else {
            if (arg0 != 100) {
               field261 = 2;
            }

            return arg2.field8034 != null && arg1 < arg2.field8034.length ? arg2.field8034[arg1] : -1;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field273[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field273[2] : field273[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "a",
      descriptor = "(Z)Z"
   )
   public boolean method168(boolean arg0) {
      try {
         ++field271;
         boolean var2 = true;
         if (!this.field270.method3884((byte)-99, this.field263.field5638)) {
            var2 = false;
         }

         if (arg0) {
            this.field269 = -43;
         }

         if (!this.field259.method3884((byte)-99, this.field263.field5638)) {
            var2 = false;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field273[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "a",
      descriptor = "(IIBZ)V"
   )
   public abstract void method169(int arg0, int arg1, byte arg2, boolean arg3);

   @OriginalMember(
      owner = "client!an",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method90(boolean arg0, int arg1) {
      try {
         ++field266;
         int var3 = this.field263.field5647.method4343(15, class189.field2365, this.field263.field5645) + this.field263.field5636;
         int var4 = this.field263.field5640.method2922(class663.field9630, 117, this.field263.field5637) + this.field263.field5631;
         this.method171(var3, arg0, (byte)110, var4);
         this.method169(var4, var3, (byte)-56, arg0);
         String var5 = class623.field9082.method3012(14245);
         if (class188.method1462(true) + -this.field272 > 10000L) {
            var5 = var5 + field273[7] + class623.field9082.method3006(1).method1382((byte)-116) + ")";
         }

         int var6 = -128 % ((-91 - arg1) / 35);
         this.field267.method666(0, var5, this.field263.field5637 / 2 + var4 + 4 + this.field263.field5644, -1, this.field263.field5645 / 2 + var3, this.field263.field5639);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field273[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "a",
      descriptor = "(IILln;IIBI)V"
   )
   public static final void method170(int arg0, int arg1, class397 arg2, int arg3, int arg4, byte arg5, int arg6) {
      try {
         int var7 = -36 / ((-36 - arg5) / 47);
         class703.method5117(0, arg4, arg2.field9010, arg6, arg2.field9007, arg1, arg0, 117, arg2.field9003, arg3);
         ++field265;
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field273[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field273[2] : field273[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "a",
      descriptor = "(IZBI)V"
   )
   public abstract void method171(int arg0, boolean arg1, byte arg2, int arg3);

   @OriginalMember(
      owner = "client!an",
      name = "<init>",
      descriptor = "(Leaa;Leaa;Ltc;)V"
   )
   public class25(class526 arg0, class526 arg1, class370 arg2) {
      try {
         this.field259 = arg1;
         this.field263 = arg2;
         this.field270 = arg0;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field273[11] + (arg0 != null ? field273[2] : field273[0]) + ',' + (arg1 != null ? field273[2] : field273[0]) + ',' + (arg2 != null ? field273[2] : field273[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method172(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!an",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method173(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
