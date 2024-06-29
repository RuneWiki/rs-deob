import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public abstract class class227 extends class428 {
   @OriginalMember(
      owner = "client!cea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3217 = new String[]{method1772(method1771("\u0000\u0000m+nK")), method1772(method1771("\u0018K\"+Z")), method1772(method1771("\r\u0010`i")), method1772(method1771("\u0000\u0000m+lK"))};
   @OriginalMember(
      owner = "client!cea",
      name = "p",
      descriptor = "[B"
   )
   public static byte[] field3211 = new byte[520];
   @OriginalMember(
      owner = "client!cea",
      name = "n",
      descriptor = "Lak;"
   )
   public static class371 field3212 = new class371(2);
   @OriginalMember(
      owner = "client!cea",
      name = "o",
      descriptor = "Llea;"
   )
   public static class639 field3216 = new class639(14, 8);
   @OriginalMember(
      owner = "client!cea",
      name = "q",
      descriptor = "I"
   )
   public static int field3213;
   @OriginalMember(
      owner = "client!cea",
      name = "m",
      descriptor = "I"
   )
   public static int field3214;
   @OriginalMember(
      owner = "client!cea",
      name = "r",
      descriptor = "Lbg;"
   )
   public static class492 field3215;

   @OriginalMember(
      owner = "client!cea",
      name = "e",
      descriptor = "(B)J"
   )
   public abstract long method480(byte arg0);

   @OriginalMember(
      owner = "client!cea",
      name = "a",
      descriptor = "(IIBLsv;I)Z"
   )
   public static final boolean method1768(int arg0, int arg1, byte arg2, class688 arg3, int arg4) {
      try {
         ++field3213;
         if (class696.field10207 && class273.field3754) {
            if (~class330.field4497 > -101) {
               return false;
            } else if (!class50.method405(arg0, -11, arg1, arg4)) {
               return false;
            } else {
               int var5 = arg0 << class773.field11359;
               int var6 = arg1 << class773.field11359;
               int var7 = -1 + class731.field10698[arg4].method2219(true, arg0, arg1);
               int var8 = arg3.method232(-107) + var7;
               if (arg3.field10144 == 1) {
                  if (!class247.method1873(var5, var5, var8, var8, var7, var6, class729.field10681 + var6, false, var5, var6)) {
                     return false;
                  } else if (!class247.method1873(var5, var5, var7, var8, var7, class729.field10681 + var6, var6 - -class729.field10681, false, var5, var6)) {
                     return false;
                  } else {
                     ++class428.field6129;
                     return true;
                  }
               } else if (~arg3.field10144 == -3) {
                  if (!class247.method1873(var5, class729.field10681 + var5, var8, var8, var7, var6 - -class729.field10681, class729.field10681 + var6, false, var5, class729.field10681 + var6)) {
                     return false;
                  } else if (!class247.method1873(var5, var5 - -class729.field10681, var8, var7, var7, var6 - -class729.field10681, class729.field10681 + var6, false, var5 - -class729.field10681, var6 - -class729.field10681)) {
                     return false;
                  } else {
                     ++class428.field6129;
                     return true;
                  }
               } else if (arg3.field10144 == 4) {
                  if (!class247.method1873(class729.field10681 + var5, class729.field10681 + var5, var8, var8, var7, var6, class729.field10681 + var6, false, class729.field10681 + var5, var6)) {
                     return false;
                  } else if (!class247.method1873(class729.field10681 + var5, class729.field10681 + var5, var7, var8, var7, var6 - -class729.field10681, class729.field10681 + var6, false, var5 - -class729.field10681, var6)) {
                     return false;
                  } else {
                     ++class428.field6129;
                     return true;
                  }
               } else if (~arg3.field10144 == -9) {
                  if (!class247.method1873(var5, class729.field10681 + var5, var8, var8, var7, var6, var6, false, var5, var6)) {
                     return false;
                  } else if (!class247.method1873(var5, class729.field10681 + var5, var8, var7, var7, var6, var6, false, class729.field10681 + var5, var6)) {
                     return false;
                  } else {
                     ++class428.field6129;
                     return true;
                  }
               } else if (~arg3.field10144 == -17) {
                  if (!class787.method5685(var5, class436.field6247 + var6, class436.field6247, class436.field6247, (byte)11, var7, var8)) {
                     return false;
                  } else {
                     ++class428.field6129;
                     return true;
                  }
               } else if (arg3.field10144 == 32) {
                  if (!class787.method5685(class436.field6247 + var5, var6 - -class436.field6247, class436.field6247, class436.field6247, (byte)34, var7, var8)) {
                     return false;
                  } else {
                     ++class428.field6129;
                     return true;
                  }
               } else if (~arg3.field10144 == -65) {
                  if (!class787.method5685(class436.field6247 + var5, var6, class436.field6247, class436.field6247, (byte)21, var7, var8)) {
                     return false;
                  } else {
                     ++class428.field6129;
                     return true;
                  }
               } else if (arg2 != 7) {
                  return false;
               } else if (~arg3.field10144 == -129) {
                  if (!class787.method5685(var5, var6, class436.field6247, class436.field6247, (byte)40, var7, var8)) {
                     return false;
                  } else {
                     ++class428.field6129;
                     return true;
                  }
               } else {
                  return true;
               }
            }
         } else {
            return false;
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field3217[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3217[1] : field3217[2]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cea",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1769(int arg0) {
      try {
         field3211 = null;
         field3215 = null;
         field3216 = null;
         if (arg0 < -6) {
            field3212 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3217[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cea",
      name = "d",
      descriptor = "(B)I"
   )
   public abstract int method479(byte arg0);

   @OriginalMember(
      owner = "client!cea",
      name = "c",
      descriptor = "(B)I"
   )
   public abstract int method481(byte arg0);

   @OriginalMember(
      owner = "client!cea",
      name = "a",
      descriptor = "(B)I"
   )
   public abstract int method478(byte arg0);

   @OriginalMember(
      owner = "client!cea",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;"
   )
   public static final String method1770(String arg0, String arg1, int arg2, String arg3) {
      boolean var4 = client.field4360;
      ++field3214;
      if (arg2 != -3) {
         field3211 = null;
      }

      int var5 = arg3.indexOf(arg0);
      if (var4) {
         arg3 = arg3.substring(0, var5) + arg1 + arg3.substring(var5 - -arg0.length());
         var5 = arg3.indexOf(arg0, arg1.length() + var5);
      }

      while(true) {
         while(var5 != -1) {
            arg3 = arg3.substring(0, var5) + arg1 + arg3.substring(var5 - -arg0.length());
            var5 = arg3.indexOf(arg0, arg1.length() + var5);
         }

         if (!var4) {
            return arg3;
         }

         var5 = arg3.indexOf(arg0, arg1.length() + var5);
      }
   }

   @OriginalMember(
      owner = "client!cea",
      name = "b",
      descriptor = "(B)I"
   )
   public abstract int method482(byte arg0);

   @OriginalMember(
      owner = "client!cea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1771(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1772(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 99;
            break;
         case 1:
            var10005 = 101;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
