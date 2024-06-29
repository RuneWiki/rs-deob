import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public abstract class class757 implements class603 {
   @OriginalMember(
      owner = "client!ad",
      name = "k",
      descriptor = "Liq;"
   )
   public class228 field11086;
   @OriginalMember(
      owner = "client!ad",
      name = "a",
      descriptor = "Lww;"
   )
   private class339 field11088;
   @OriginalMember(
      owner = "client!ad",
      name = "m",
      descriptor = "Lww;"
   )
   public class339 field11092;
   @OriginalMember(
      owner = "client!ad",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11095 = new String[]{method5485(method5484("VNj\u0017?")), method5485(method5484("VNj\u0014?")), method5485(method5484("VNj\u0011?")), method5485(method5484("VNj\u0016?")), method5485(method5484("VNj\u001c?")), method5485(method5484("VNj\u0015?")), method5485(method5484("VNj\u001d?")), method5485(method5484("\u0017\u0002")), method5485(method5484("L\u0004jtj")), method5485(method5484("VNjf~YC0d?")), method5485(method5484("Y_(6")), method5485(method5484("VNj\u001e?"))};
   @OriginalMember(
      owner = "client!ad",
      name = "p",
      descriptor = "I"
   )
   public static int field11079;
   @OriginalMember(
      owner = "client!ad",
      name = "b",
      descriptor = "I"
   )
   public static int field11080;
   @OriginalMember(
      owner = "client!ad",
      name = "c",
      descriptor = "I"
   )
   private int field11081;
   @OriginalMember(
      owner = "client!ad",
      name = "e",
      descriptor = "I"
   )
   public static int field11082;
   @OriginalMember(
      owner = "client!ad",
      name = "g",
      descriptor = "I"
   )
   public static int field11083;
   @OriginalMember(
      owner = "client!ad",
      name = "l",
      descriptor = "I"
   )
   public static int field11085;
   @OriginalMember(
      owner = "client!ad",
      name = "f",
      descriptor = "I"
   )
   public static int field11087;
   @OriginalMember(
      owner = "client!ad",
      name = "h",
      descriptor = "I"
   )
   public static int field11089;
   @OriginalMember(
      owner = "client!ad",
      name = "d",
      descriptor = "I"
   )
   public static int field11091;
   @OriginalMember(
      owner = "client!ad",
      name = "j",
      descriptor = "J"
   )
   private long field11094;
   @OriginalMember(
      owner = "client!ad",
      name = "n",
      descriptor = "Lda;"
   )
   private class447 field11090;
   @OriginalMember(
      owner = "client!ad",
      name = "o",
      descriptor = "Lgka;"
   )
   public static class669 field11084;
   @OriginalMember(
      owner = "client!ad",
      name = "i",
      descriptor = "Lme;"
   )
   public static class752 field11093;

   @OriginalMember(
      owner = "client!ad",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method222(int arg0, boolean arg1) {
      try {
         ++field11087;
         int var3 = this.field11086.field2861.method1893((byte)-49, this.field11086.field2853, class286.field3961) + this.field11086.field2855;
         int var4 = this.field11086.field2857.method4440(class627.field9254, arg0 + 22528, this.field11086.field2850) + this.field11086.field2854;
         this.method3508(var4, var3, arg1, 1);
         this.method3506(arg1, (byte)62, var4, var3);
         String var5 = class532.field7800.method729(0);
         if (arg0 != -22493) {
            this.field11081 = 103;
         }

         if (class163.method1353(arg0 + 22366) + -this.field11094 > 10000L) {
            var5 = var5 + field11095[7] + class532.field7800.method727(-111).method4230(arg0 + 2774) + ")";
         }

         this.field11090.method3421(-1, var4 - -(this.field11086.field2850 / 2) + this.field11086.field2856 + 4, this.field11086.field2853 / 2 + var3, 8364, var5, this.field11086.field2862);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field11095[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "a",
      descriptor = "(ZBII)V"
   )
   public abstract void method3506(boolean arg0, byte arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ad",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method5479(int arg0) {
      boolean var2 = client.field1481;

      try {
         ++field11082;
         int var3 = class532.field7800.method723(-488818536);
         int var4 = var3 * 100;
         if (arg0 < 9) {
            this.field11086 = null;
         }

         if (~this.field11081 == ~var3 && var3 != 0) {
            int var5 = class532.field7800.method726((byte)122);
            if (var5 <= var3) {
               return var4;
            }

            long var6 = this.field11094 - class532.field7800.method730(71);
            if (var6 <= 0L) {
               return var4;
            }

            long var8 = var6 * 10000L / (long)var3 * (long)(-var3 + var5);
            long var10 = 10000L * (class163.method1353(-124) + -this.field11094);
            if (~var8 < ~var10) {
               var4 = (int)(var10 * 100L * (long)(-var3 + var5) / var8 + (long)(var3 * 100));
               if (!var2) {
                  return var4;
               }
            }

            var4 = var5 * 100;
            if (!var2) {
               return var4;
            }
         }

         this.field11081 = var3;
         this.field11094 = class163.method1353(-125);
         return var4;
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field11095[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "f",
      descriptor = "(I)V"
   )
   public static final void method5480(int arg0) {
      try {
         class47.field593 = new class37();
         if (arg0 >= -67) {
            field11093 = null;
         }

         ++field11091;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11095[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method5481(int arg0) {
      try {
         if (arg0 <= 118) {
            field11089 = 100;
         }

         class549.method4162(0);
         ++field11085;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11095[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "a",
      descriptor = "(IIZI)V"
   )
   public abstract void method3508(int arg0, int arg1, boolean arg2, int arg3);

   @OriginalMember(
      owner = "client!ad",
      name = "a",
      descriptor = "(I)V"
   )
   public void method223(int arg0) {
      try {
         ++field11079;
         if (arg0 != -28722) {
            this.field11086 = null;
         }

         class19 var2 = class481.method3655(this.field11088, arg0 + 28839, this.field11086.field2859);
         this.field11090 = class629.field9294.method430(var2, class65.method585(this.field11092, this.field11086.field2859), true);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field11095[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "b",
      descriptor = "(I)Z"
   )
   public boolean method221(int arg0) {
      try {
         ++field11080;
         if (arg0 != -10439) {
            return false;
         } else {
            boolean var2 = true;
            if (!this.field11092.method2681((byte)87, this.field11086.field2859)) {
               var2 = false;
            }

            if (!this.field11088.method2681((byte)69, this.field11086.field2859)) {
               var2 = false;
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field11095[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5482(byte arg0) {
      try {
         if (arg0 == 29) {
            field11084 = null;
            field11093 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11095[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "e",
      descriptor = "(I)[Ltia;"
   )
   public static final class17[] method5483(int arg0) {
      try {
         ++field11083;
         int var1 = -63 % ((-60 - arg0) / 32);
         return new class17[]{class1.field2, class151.field1886, class590.field8684};
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11095[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "<init>",
      descriptor = "(Lww;Lww;Liq;)V"
   )
   public class757(class339 arg0, class339 arg1, class228 arg2) {
      try {
         this.field11086 = arg2;
         this.field11088 = arg1;
         this.field11092 = arg0;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field11095[9] + (arg0 != null ? field11095[8] : field11095[10]) + ',' + (arg1 != null ? field11095[8] : field11095[10]) + ',' + (arg2 != null ? field11095[8] : field11095[10]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5484(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 23);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ad",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5485(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 42;
            break;
         case 2:
            var10005 = 68;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 23;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
