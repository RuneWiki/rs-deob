import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class169 {
   @OriginalMember(
      owner = "client!lu",
      name = "l",
      descriptor = "I"
   )
   public int field2584;
   @OriginalMember(
      owner = "client!lu",
      name = "g",
      descriptor = "Ljava/lang/String;"
   )
   public String field2590;
   @OriginalMember(
      owner = "client!lu",
      name = "h",
      descriptor = "Ljava/lang/String;"
   )
   public String field2587;
   @OriginalMember(
      owner = "client!lu",
      name = "j",
      descriptor = "Ljava/lang/String;"
   )
   public String field2592;
   @OriginalMember(
      owner = "client!lu",
      name = "m",
      descriptor = "I"
   )
   public int field2581;
   @OriginalMember(
      owner = "client!lu",
      name = "f",
      descriptor = "I"
   )
   public int field2585;
   @OriginalMember(
      owner = "client!lu",
      name = "i",
      descriptor = "I"
   )
   public int field2593;
   @OriginalMember(
      owner = "client!lu",
      name = "d",
      descriptor = "I"
   )
   public int field2582;
   @OriginalMember(
      owner = "client!lu",
      name = "n",
      descriptor = "Ljava/lang/String;"
   )
   public String field2588;
   @OriginalMember(
      owner = "client!lu",
      name = "b",
      descriptor = "Ljava/lang/String;"
   )
   public String field2595;
   @OriginalMember(
      owner = "client!lu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2596 = new String[]{method1573(method1572("k\u001f\u007fV<")), method1573(method1572("|D\u007f:i")), method1573(method1572("i\u001f=x")), method1573(method1572("k\u001f\u007f(}i\u0003%*<")), method1573(method1572("k\u001f\u007fW<")), method1573(method1572("k\u001f\u007fP<")), method1573(method1572("k\u001f\u007fU<"))};
   @OriginalMember(
      owner = "client!lu",
      name = "o",
      descriptor = "Lgv;"
   )
   public static class12 field2583 = new class12(method1573(method1572("P>\u0000U")), method1573(method1572("h\f7}wb")), method1573(method1572("X\u001b0")), 2);
   @OriginalMember(
      owner = "client!lu",
      name = "c",
      descriptor = "I"
   )
   public static int field2594 = 0;
   @OriginalMember(
      owner = "client!lu",
      name = "k",
      descriptor = "I"
   )
   public static int field2586;
   @OriginalMember(
      owner = "client!lu",
      name = "a",
      descriptor = "I"
   )
   public static int field2589;
   @OriginalMember(
      owner = "client!lu",
      name = "e",
      descriptor = "I"
   )
   public static int field2591;

   @OriginalMember(
      owner = "client!lu",
      name = "a",
      descriptor = "(B)V",
      line = 3
   )
   public static void method1568(byte arg0) {
      try {
         field2583 = null;
         if (arg0 != 57) {
            field2583 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2596[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;IBLjava/lang/String;)V",
      line = 15
   )
   public final void method1569(String arg0, String arg1, int arg2, String arg3, int arg4, String arg5, int arg6, byte arg7, String arg8) {
      try {
         ++field2586;
         this.field2584 = class342.method2764((byte)74);
         this.field2593 = class308.field4801;
         this.field2588 = arg5;
         this.field2587 = arg0;
         this.field2585 = arg2;
         this.field2590 = arg8;
         this.field2581 = arg6;
         this.field2592 = arg3;
         this.field2582 = arg4;
         this.field2595 = arg1;
         if (arg7 != -86) {
            method1571(-17, false, -106);
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field2596[4] + (arg0 != null ? field2596[1] : field2596[2]) + ',' + (arg1 != null ? field2596[1] : field2596[2]) + ',' + arg2 + ',' + (arg3 != null ? field2596[1] : field2596[2]) + ',' + arg4 + ',' + (arg5 != null ? field2596[1] : field2596[2]) + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field2596[1] : field2596[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "a",
      descriptor = "(I[II[Ljava/lang/Object;I)V",
      line = 52
   )
   public static final void method1570(int arg0, int[] arg1, int arg2, Object[] arg3, int arg4) {
      boolean var5 = client.field1786;

      try {
         if (arg2 != -1) {
            method1570(66, (int[])null, 45, (Object[])null, 18);
         }

         if (~arg0 > ~arg4) {
            int var6 = (arg0 + arg4) / 2;
            int var7 = arg0;
            int var8 = arg1[var6];
            arg1[var6] = arg1[arg4];
            arg1[arg4] = var8;
            Object var9 = arg3[var6];
            arg3[var6] = arg3[arg4];
            arg3[arg4] = var9;
            int var10 = ~var8 != Integer.MIN_VALUE ? 1 : 0;
            int var11 = arg0;
            int var12;
            Object var13;
            if (var5) {
               if (~arg1[arg0] > ~((var10 & arg0) + var8)) {
                  var12 = arg1[arg0];
                  arg1[arg0] = arg1[arg0];
                  arg1[arg0] = var12;
                  var13 = arg3[arg0];
                  arg3[arg0] = arg3[arg0];
                  var7 = arg0 + 1;
                  arg3[arg0] = var13;
               }

               var11 = arg0 + 1;
            }

            while(true) {
               int var10000;
               if (~var11 <= ~arg4) {
                  arg1[arg4] = arg1[var7];
                  arg1[var7] = var8;
                  arg3[arg4] = arg3[var7];
                  arg3[var7] = var9;
                  method1570(arg0, arg1, arg2, arg3, var7 - 1);
                  var10000 = var7 - -1;
                  if (!var5) {
                     method1570(var10000, arg1, -1, arg3, arg4);
                     break;
                  }
               } else {
                  var10000 = ~arg1[var11];
               }

               if (var10000 > ~((var10 & var11) + var8)) {
                  var12 = arg1[var11];
                  arg1[var11] = arg1[var7];
                  arg1[var7] = var12;
                  var13 = arg3[var11];
                  arg3[var11] = arg3[var7];
                  arg3[var7++] = var13;
               }

               ++var11;
            }
         }

         ++field2591;
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field2596[5] + arg0 + ',' + (arg1 != null ? field2596[1] : field2596[2]) + ',' + arg2 + ',' + (arg3 != null ? field2596[1] : field2596[2]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "a",
      descriptor = "(IZI)Z",
      line = 111
   )
   public static final boolean method1571(int arg0, boolean arg1, int arg2) {
      try {
         if (arg1) {
            field2583 = null;
         }

         ++field2589;
         return class126.method1188(arg2, true, arg0) || class233.method2003(arg0, (byte)126, arg2);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2596[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "<init>",
      descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V",
      line = 123
   )
   public class169(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
      try {
         this.field2584 = class342.method2764((byte)84);
         this.field2590 = arg7;
         this.field2587 = arg3;
         this.field2592 = arg2;
         this.field2581 = arg0;
         this.field2585 = arg1;
         this.field2593 = class308.field4801;
         this.field2582 = arg6;
         this.field2588 = arg4;
         this.field2595 = arg5;
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field2596[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2596[1] : field2596[2]) + ',' + (arg3 != null ? field2596[1] : field2596[2]) + ',' + (arg4 != null ? field2596[1] : field2596[2]) + ',' + (arg5 != null ? field2596[1] : field2596[2]) + ',' + arg6 + ',' + (arg7 != null ? field2596[1] : field2596[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1572(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1573(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 20;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
