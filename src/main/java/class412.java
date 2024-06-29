import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class412 {
   @OriginalMember(
      owner = "client!en",
      name = "e",
      descriptor = "Lsia;"
   )
   private class407 field5670 = new class407(16);
   @OriginalMember(
      owner = "client!en",
      name = "d",
      descriptor = "Lww;"
   )
   private class339 field5666;
   @OriginalMember(
      owner = "client!en",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5671 = new String[]{method3238(method3237("TM:\u0007\u0004")), method3238(method3237("TM:\b\u0004")), method3238(method3237("TM:\n\u0004")), method3238(method3237("J\r:aQ")), method3238(method3237("_Vx#")), method3238(method3237("TM:\u000b\u0004")), method3238(method3237("TM:\f\u0004")), method3238(method3237("TM:sE_J`q\u0004")), method3238(method3237("TM:\t\u0004")), method3238(method3237("TM:\r\u0004")), method3238(method3237("TM:\u000e\u0004"))};
   @OriginalMember(
      owner = "client!en",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field5662 = false;
   @OriginalMember(
      owner = "client!en",
      name = "h",
      descriptor = "I"
   )
   public static int field5660;
   @OriginalMember(
      owner = "client!en",
      name = "i",
      descriptor = "I"
   )
   public static int field5661;
   @OriginalMember(
      owner = "client!en",
      name = "a",
      descriptor = "I"
   )
   public static int field5663;
   @OriginalMember(
      owner = "client!en",
      name = "g",
      descriptor = "I"
   )
   public static int field5664;
   @OriginalMember(
      owner = "client!en",
      name = "f",
      descriptor = "I"
   )
   public static int field5665;
   @OriginalMember(
      owner = "client!en",
      name = "b",
      descriptor = "I"
   )
   public static int field5667;
   @OriginalMember(
      owner = "client!en",
      name = "j",
      descriptor = "I"
   )
   public static int field5668;
   @OriginalMember(
      owner = "client!en",
      name = "c",
      descriptor = "I"
   )
   public static int field5669;

   @OriginalMember(
      owner = "client!en",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method3229(int arg0, int arg1) {
      try {
         ++field5669;
         class407 var3 = this.field5670;
         synchronized(this.field5670) {
            int var4 = -75 / ((-69 - arg1) / 55);
            this.field5670.method3197(5, arg0);
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field5671[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public static final boolean method3230(int arg0, byte arg1, int arg2) {
      try {
         int var3 = -117 % ((arg1 - 44) / 35);
         ++field5663;
         if (!(class52.method386(arg0, arg2, 0) | (65536 & arg2) != 0) && !class147.method1189(arg2, (byte)73, arg0)) {
            return (55 & arg0) == 0 && class481.method3656(true, arg0, arg2);
         } else {
            return true;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5671[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "a",
      descriptor = "(IB)Lkda;"
   )
   public final class495 method3231(int arg0, byte arg1) {
      try {
         if (arg1 < 43) {
            this.field5666 = null;
         }

         ++field5661;
         class407 var3 = this.field5670;
         class495 var4;
         synchronized(this.field5670) {
            var4 = (class495)this.field5670.method3192((long)arg0, (byte)-113);
         }

         if (var4 != null) {
            return var4;
         } else {
            class339 var5 = this.field5666;
            byte[] var6;
            synchronized(this.field5666) {
               var6 = this.field5666.method2697(arg0, 30, false);
            }

            class495 var7 = new class495();
            if (var6 != null) {
               var7.method3765(92, new class66(var6));
            }

            class407 var8 = this.field5670;
            synchronized(this.field5670) {
               this.field5670.method3190(var7, (long)arg0, 8);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field5671[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "a",
      descriptor = "(B)Z"
   )
   public static final boolean method3232(byte arg0) {
      try {
         ++field5667;

         try {
            class2 var1 = new class2();
            if (arg0 != 31) {
               return true;
            } else {
               byte[] var2 = var1.method13(-4, class563.field8280);
               class462.method3522(var2, false);
               return true;
            }
         } catch (Exception var4) {
            return false;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5671[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "a",
      descriptor = "(Loe;ILoe;)V"
   )
   public static final void method3233(class15 arg0, int arg1, class15 arg2) {
      try {
         if (arg0.field274 != null) {
            arg0.method125(13582);
         }

         ++field5665;
         arg0.field274 = arg2;
         arg0.field272 = arg2.field272;
         arg0.field274.field272 = arg0;
         arg0.field272.field274 = arg0;
         int var3 = 109 % ((arg1 - 20) / 61);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5671[5] + (arg0 != null ? field5671[3] : field5671[4]) + ',' + arg1 + ',' + (arg2 != null ? field5671[3] : field5671[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3234(int arg0) {
      try {
         ++field5668;
         if (arg0 != 16) {
            method3233((class15)null, 65, (class15)null);
         }

         class407 var2 = this.field5670;
         synchronized(this.field5670) {
            this.field5670.method3201((byte)-112);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5671[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method3235(byte arg0) {
      try {
         class407 var2 = this.field5670;
         synchronized(this.field5670) {
            this.field5670.method3187(-23825);
         }

         if (arg0 == 103) {
            ++field5664;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5671[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "a",
      descriptor = "(ZIIIIIIII)Z"
   )
   public static final boolean method3236(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         ++field5660;
         int var9 = class204.field2593.field210[arg6];
         int var10 = class204.field2593.field205[0];
         if (var9 >= 0 && ~class273.field3491 < ~var9 && var10 >= 0 && var10 < class211.field2689) {
            if (~arg4 <= -1 && ~arg4 > ~class273.field3491 && ~arg5 <= -1 && ~arg5 > ~class211.field2689) {
               int var11 = class473.method3589(arg8, arg1, arg2, class781.field11383, arg3, arg4, arg5, (byte)-118, arg7, class324.field4438[class204.field2593.field10457], var9, arg0, class316.field4367, var10, class204.field2593.method78(arg6));
               if (var11 < 1) {
                  return false;
               } else {
                  class607.field8981 = class316.field4367[var11 + -1];
                  class549.field8103 = class781.field11383[var11 + -1];
                  class104.field1351 = false;
                  class121.method1066(34);
                  return true;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field5671[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "<init>",
      descriptor = "(Lkb;ILww;)V"
   )
   public class412(class500 arg0, int arg1, class339 arg2) {
      try {
         this.field5666 = arg2;
         this.field5666.method2691(30, -12);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5671[7] + (arg0 != null ? field5671[3] : field5671[4]) + ',' + arg1 + ',' + (arg2 != null ? field5671[3] : field5671[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3237(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!en",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3238(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 49;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
