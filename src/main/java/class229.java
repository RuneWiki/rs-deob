import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class229 extends class270 {
   @OriginalMember(
      owner = "client!sba",
      name = "q",
      descriptor = "I"
   )
   public int field3225;
   @OriginalMember(
      owner = "client!sba",
      name = "s",
      descriptor = "I"
   )
   public int field3229;
   @OriginalMember(
      owner = "client!sba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3231 = new String[]{method1788(method1787("<e?nzg")), method1788(method1787("<e?n|g")), method1788(method1787(";b2%\u0018")), method1788(method1787("<e?n{g")), method1788(method1787("4)pnE")), method1788(method1787("!r2,")), method1788(method1787("<e?n}g")), method1788(method1787("<e?n\u0004&i74\u0006g")), method1788(method1787("<e?nyg"))};
   @OriginalMember(
      owner = "client!sba",
      name = "p",
      descriptor = "I"
   )
   public static int field3224;
   @OriginalMember(
      owner = "client!sba",
      name = "t",
      descriptor = "I"
   )
   public static int field3226;
   @OriginalMember(
      owner = "client!sba",
      name = "r",
      descriptor = "I"
   )
   public static int field3227;
   @OriginalMember(
      owner = "client!sba",
      name = "u",
      descriptor = "I"
   )
   public static int field3228;
   @OriginalMember(
      owner = "client!sba",
      name = "v",
      descriptor = "Ljava/applet/Applet;"
   )
   public static Applet field3230;

   @OriginalMember(
      owner = "client!sba",
      name = "a",
      descriptor = "(IIIZ)V",
      line = 3
   )
   public static final void method1783(int arg0, int arg1, int arg2, boolean arg3) {
      try {
         ++field3228;
         String var4 = field3231[2] + arg2 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (63 & arg0) + "," + (63 & arg1);
         System.out.println(var4);
         class418.method3120(false, 0, arg3, var4);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field3231[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "d",
      descriptor = "(B)V",
      line = 15
   )
   public static void method1784(byte arg0) {
      try {
         if (arg0 >= -71) {
            field3230 = null;
         }

         field3230 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3231[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "a",
      descriptor = "(B)Lqca;",
      line = 25
   )
   public final class127 method993(byte arg0) {
      try {
         ++field3224;
         if (arg0 != -48) {
            this.field3225 = -76;
         }

         return class102.field1305;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3231[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "<init>",
      descriptor = "(Lkt;Lada;IIIIIIIIII)V",
      line = 37
   )
   public class229(class169 arg0, class175 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);

      try {
         this.field3225 = arg10;
         this.field3229 = arg11;
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field3231[7] + (arg0 != null ? field3231[4] : field3231[5]) + ',' + (arg1 != null ? field3231[4] : field3231[5]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "c",
      descriptor = "(B)V",
      line = 49
   )
   public static final void method1785(byte arg0) {
      try {
         ++field3227;
         if (arg0 != 46) {
            method1783(68, 55, -16, false);
         }

         class274.field3758.method534((0.7F + (float)class300.field4107.field6415.method1509(125) * 0.1F) * class245.field3372);
         class274.field3758.method582(class132.field1691, class565.field8055, class445.field6340, (float)(class721.field10540 << 2), (float)(class446.field6349 << 2), (float)(class37.field537 << 2));
         class274.field3758.method561(class153.field2163);
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3231[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "a",
      descriptor = "([I[ILsc;III)Llw;",
      line = 64
   )
   public static final class689 method1786(int[] arg0, int[] arg1, class369 arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field4360;

      try {
         if (arg5 != -6100) {
            method1786((int[])null, (int[])null, (class369)null, -30, -5, 107);
         }

         ++field3226;
         if (!arg2.method2636(true, class301.field4117, class46.field621)) {
            int[] var11 = new int[arg3 * arg4];
            int var12 = 0;
            if (!var6 && arg4 <= var12) {
               return new class689(arg2, arg3, arg4, var11);
            } else {
               do {
                  int var13 = arg3 * var12 + arg1[var12];
                  int var14 = 0;
                  if (var6) {
                     var11[var13++] = -16777216;
                     ++var14;
                  }

                  while(true) {
                     while(var14 < arg0[var12]) {
                        var11[var13++] = -16777216;
                        ++var14;
                     }

                     if (!var6) {
                        ++var12;
                        break;
                     }

                     ++var14;
                  }
               } while(arg4 > var12);

               return new class689(arg2, arg3, arg4, var11);
            }
         } else {
            byte[] var7 = new byte[arg3 * arg4];
            int var8 = 0;
            if (!var6 && ~arg4 >= ~var8) {
               return new class689(arg2, arg3, arg4, var7);
            } else {
               do {
                  int var9 = arg3 * var8 - -arg1[var8];
                  int var10 = 0;
                  if (var6) {
                     var7[var9++] = -1;
                     ++var10;
                  }

                  while(true) {
                     while(arg0[var8] > var10) {
                        var7[var9++] = -1;
                        ++var10;
                     }

                     if (!var6) {
                        ++var8;
                        break;
                     }

                     ++var10;
                  }
               } while(~arg4 < ~var8);

               return new class689(arg2, arg3, arg4, var7);
            }
         }
      } catch (RuntimeException var16) {
         throw class237.method1823(var16, field3231[3] + (arg0 != null ? field3231[4] : field3231[5]) + ',' + (arg1 != null ? field3231[4] : field3231[5]) + ',' + (arg2 != null ? field3231[4] : field3231[5]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1787(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1788(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 64;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
