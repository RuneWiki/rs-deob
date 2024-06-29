import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class749 implements Runnable {
   @OriginalMember(
      owner = "client!nk",
      name = "t",
      descriptor = "Lau;"
   )
   private class770 field11085 = new class535();
   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "Lau;"
   )
   private class770 field11097 = null;
   @OriginalMember(
      owner = "client!nk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11099 = new String[]{method5441(method5440("\\\u0011,Bq")), method5441(method5440("\\\u0011,Kq")), method5441(method5440("\\\u0011,Eq")), method5441(method5440("\\\u0011,Mq")), method5441(method5440("\\\u0011,Cq")), method5441(method5440("\u0012RPb:]\fgu<VS\"")), method5441(method5440("\\\u0011,u,\\R")), method5441(method5440("\\\u0011,Oq")), method5441(method5440("\\\u000fnk")), method5441(method5440("\\\u0011,Fq")), method5441(method5440("IT,)$")), method5441(method5440("\\\u0011,Dq")), method5441(method5440("\\\u0011,@q")), method5441(method5440("\\\u0011,Aq")), method5441(method5440("\\\u0011,Nq")), method5441(method5440("\\\u0011,Lq"))};
   @OriginalMember(
      owner = "client!nk",
      name = "n",
      descriptor = "I"
   )
   public static int field11076;
   @OriginalMember(
      owner = "client!nk",
      name = "i",
      descriptor = "I"
   )
   public static int field11078;
   @OriginalMember(
      owner = "client!nk",
      name = "q",
      descriptor = "I"
   )
   public static int field11079;
   @OriginalMember(
      owner = "client!nk",
      name = "r",
      descriptor = "I"
   )
   public static int field11080;
   @OriginalMember(
      owner = "client!nk",
      name = "h",
      descriptor = "I"
   )
   public static int field11081;
   @OriginalMember(
      owner = "client!nk",
      name = "v",
      descriptor = "I"
   )
   public static int field11083;
   @OriginalMember(
      owner = "client!nk",
      name = "b",
      descriptor = "I"
   )
   public static int field11084;
   @OriginalMember(
      owner = "client!nk",
      name = "u",
      descriptor = "I"
   )
   public static int field11086;
   @OriginalMember(
      owner = "client!nk",
      name = "k",
      descriptor = "I"
   )
   public static int field11087;
   @OriginalMember(
      owner = "client!nk",
      name = "p",
      descriptor = "I"
   )
   public static int field11089;
   @OriginalMember(
      owner = "client!nk",
      name = "m",
      descriptor = "I"
   )
   public static int field11090;
   @OriginalMember(
      owner = "client!nk",
      name = "c",
      descriptor = "I"
   )
   public static int field11091;
   @OriginalMember(
      owner = "client!nk",
      name = "o",
      descriptor = "I"
   )
   private int field11092;
   @OriginalMember(
      owner = "client!nk",
      name = "e",
      descriptor = "I"
   )
   private int field11096;
   @OriginalMember(
      owner = "client!nk",
      name = "d",
      descriptor = "J"
   )
   private long field11094;
   @OriginalMember(
      owner = "client!nk",
      name = "g",
      descriptor = "J"
   )
   private long field11095;
   @OriginalMember(
      owner = "client!nk",
      name = "l",
      descriptor = "Lcka;"
   )
   private class187 field11098;
   @OriginalMember(
      owner = "client!nk",
      name = "f",
      descriptor = "Llc;"
   )
   public static class676 field11082;
   @OriginalMember(
      owner = "client!nk",
      name = "s",
      descriptor = "Ljava/lang/String;"
   )
   private String field11093;
   @OriginalMember(
      owner = "client!nk",
      name = "w",
      descriptor = "Z"
   )
   private volatile boolean field11077;
   @OriginalMember(
      owner = "client!nk",
      name = "j",
      descriptor = "Z"
   )
   private boolean field11088;

   @OriginalMember(
      owner = "client!nk",
      name = "g",
      descriptor = "(I)Lcka;"
   )
   public final class187 method5428(int arg0) {
      try {
         if (arg0 != 0) {
            return null;
         } else {
            ++field11090;
            return this.field11098;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11099[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "(B)V"
   )
   public final synchronized void method5429(byte arg0) {
      try {
         ++field11080;
         if (arg0 < 1) {
            this.field11085 = null;
         }

         this.field11088 = true;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11099[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "d",
      descriptor = "(I)Ljava/lang/String;"
   )
   public final String method5430(int arg0) {
      try {
         if (arg0 != 0) {
            return null;
         } else {
            ++field11089;
            return this.field11093;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11099[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method5431(boolean arg0) {
      try {
         ++field11076;
         if (this.field11098 == null) {
            return 0;
         } else {
            int var2 = this.field11098.method1478(63);
            if (this.field11098.field2628 && ~this.field11092 > ~this.field11098.field2637) {
               return this.field11092 - -1;
            } else {
               if (!arg0) {
                  this.field11094 = -41L;
               }

               if (~var2 <= -1 && ~var2 > ~(class285.field3948.length - 1)) {
                  return ~this.field11098.field2630 == ~this.field11092 ? this.field11098.field2637 : this.field11098.field2630;
               } else {
                  return 100;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11099[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "(JILjava/lang/String;ILcka;)V"
   )
   public final synchronized void method5432(long arg0, int arg1, String arg2, int arg3, class187 arg4) {
      try {
         this.field11093 = arg2;
         if (arg3 > 41) {
            ++field11079;
            this.field11094 = arg0;
            this.field11092 = arg1;
            this.field11098 = arg4;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field11099[15] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11099[10] : field11099[8]) + ',' + arg3 + ',' + (arg4 != null ? field11099[10] : field11099[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method5433(int arg0) {
      try {
         if (arg0 != 255) {
            this.run();
         }

         ++field11083;
         return this.field11094;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11099[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method5434(int arg0) {
      try {
         int var2 = -31 / ((-48 - arg0) / 63);
         ++field11091;
         return this.field11092;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11099[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "(ZLau;)V"
   )
   public final synchronized void method5435(boolean arg0, class770 arg1) {
      try {
         if (!arg0) {
            this.field11096 = 21;
         }

         this.field11097 = this.field11085;
         ++field11086;
         this.field11085 = arg1;
         this.field11095 = class133.method1054(-29025);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11099[9] + arg0 + ',' + (arg1 != null ? field11099[10] : field11099[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nk",
      name = "e",
      descriptor = "(I)Z"
   )
   public final synchronized boolean method5436(int arg0) {
      try {
         ++field11081;
         return arg0 < 59 ? false : this.field11085.method3866((byte)76, this.field11095);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11099[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method5437(int arg0) {
      try {
         field11082 = null;
         if (arg0 <= 52) {
            method5437(-96);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11099[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "f",
      descriptor = "(I)I"
   )
   public final int method5438(int arg0) {
      try {
         ++field11087;
         int var2 = -13 / ((arg0 - -10) / 57);
         return this.field11096;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11099[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method5439(byte arg0) {
      try {
         if (arg0 <= 45) {
            this.method5436(-20);
         }

         ++field11078;
         this.field11077 = true;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11099[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5440(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5441(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
