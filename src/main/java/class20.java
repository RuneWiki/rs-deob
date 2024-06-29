import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class class20 {
   @OriginalMember(
      owner = "client!lga",
      name = "e",
      descriptor = "Lsia;"
   )
   private class407 field319 = new class407(64);
   @OriginalMember(
      owner = "client!lga",
      name = "b",
      descriptor = "Lww;"
   )
   private class339 field315;
   @OriginalMember(
      owner = "client!lga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field320 = new String[]{method158(method157("`\\kke$")), method158(method157("`\\kkf$")), method158(method157("`\\kk`$")), method158(method157("`\\kk\u0018eUc1\u001a$")), method158(method157("w\u0015$kY")), method158(method157("bNf)")), method158(method157("`\\kkg$"))};
   @OriginalMember(
      owner = "client!lga",
      name = "f",
      descriptor = "I"
   )
   public static int field314;
   @OriginalMember(
      owner = "client!lga",
      name = "c",
      descriptor = "I"
   )
   public static int field316;
   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "I"
   )
   public static int field317;
   @OriginalMember(
      owner = "client!lga",
      name = "d",
      descriptor = "Lkc;"
   )
   public static class72 field318;

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(BI)Lnd;"
   )
   public final class139 method153(byte arg0, int arg1) {
      try {
         ++field316;
         class407 var3 = this.field319;
         class139 var4;
         synchronized(this.field319) {
            var4 = (class139)this.field319.method3192((long)arg1, (byte)-123);
         }

         if (var4 != null) {
            return var4;
         } else {
            class339 var5 = this.field315;
            byte[] var6;
            synchronized(this.field315) {
               var6 = this.field315.method2697(arg1, 5, false);
            }

            if (arg0 != -7) {
               method156((byte)-20);
            }

            class139 var7 = new class139();
            if (var6 != null) {
               var7.method1153(new class66(var6), -1);
            }

            class407 var8 = this.field319;
            synchronized(this.field319) {
               this.field319.method3190(var7, (long)arg1, 8);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field320[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public static final void method154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field317;
         class62.field791 = arg4;
         class550.field8112 = arg5;
         class267.field3374 = arg1;
         if (arg3 > -77) {
            field318 = null;
         }

         class175.field2264 = arg2;
         class283.field3927 = arg0;
         if (class62.field791 >= 100) {
            int var6 = class283.field3927 * 512 - -256;
            int var7 = class175.field2264 * 512 + 256;
            int var8 = class215.method1757(var6, false, class674.field9984, var7) - class550.field8112;
            int var9 = -class160.field2051 + var6;
            int var10 = -class546.field8031 + var8;
            int var11 = -class168.field2195 + var7;
            int var12 = (int)Math.sqrt((double)(var9 * var9 + var11 * var11));
            class653.field9755 = 16383 & (int)(Math.atan2((double)var10, (double)var12) * 2607.5945876176133D);
            class242.field3054 = (int)(-2607.5945876176133D * Math.atan2((double)var9, (double)var11)) & 16383;
            class673.field9969 = 0;
            if (~class653.field9755 > -1025) {
               class653.field9755 = 1024;
            }

            if (~class653.field9755 < -3073) {
               class653.field9755 = 3072;
            }
         }

         class574.field8442 = -1;
         class81.field1137 = -1;
         class784.field11454 = 2;
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field320[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method155(byte arg0) {
      try {
         ++field314;
         if (class641.field9433 != null) {
            class641.field9433 = null;
            int var1 = -68 % ((-65 - arg0) / 60);
            class436.method3369(class169.field2203, -102, class779.field11362, class288.field3984, class387.field5356);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field320[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method156(byte arg0) {
      try {
         field318 = null;
         if (arg0 > -1) {
            method156((byte)-80);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field320[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "<init>",
      descriptor = "(Lkb;ILww;)V"
   )
   public class20(class500 arg0, int arg1, class339 arg2) {
      try {
         this.field315 = arg2;
         this.field315.method2691(5, 1);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field320[3] + (arg0 != null ? field320[4] : field320[5]) + ',' + arg1 + ',' + (arg2 != null ? field320[4] : field320[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method157(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method158(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 69;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
