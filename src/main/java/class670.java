import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class670 {
   @OriginalMember(
      owner = "client!hj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9409 = new String[]{method4861(method4860("3\u0005Fbp")), method4861(method4860("3\u0005FR7\b\u001b\u001aO6<G")), method4861(method4860("3\u0005Fep")), method4861(method4860(" AF\b%")), method4861(method4860("5\u001a\u0004J")), method4861(method4860("3\u0005Fgp")), method4861(method4860("3\u0005Fdp"))};
   @OriginalMember(
      owner = "client!hj",
      name = "g",
      descriptor = "I"
   )
   public static int field9408 = 0;
   @OriginalMember(
      owner = "client!hj",
      name = "e",
      descriptor = "I"
   )
   public static int field9402;
   @OriginalMember(
      owner = "client!hj",
      name = "b",
      descriptor = "I"
   )
   public static int field9403;
   @OriginalMember(
      owner = "client!hj",
      name = "f",
      descriptor = "I"
   )
   public static int field9405;
   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "I"
   )
   public static int field9406;
   @OriginalMember(
      owner = "client!hj",
      name = "c",
      descriptor = "I"
   )
   public static int field9407;
   @OriginalMember(
      owner = "client!hj",
      name = "d",
      descriptor = "Lea;"
   )
   public static class456 field9404;

   @OriginalMember(
      owner = "client!hj",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field9403;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9409[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4856(int arg0) {
      try {
         field9404 = null;
         if (arg0 < 78) {
            field9408 = -81;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9409[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method4857(boolean arg0) {
      boolean var1 = client.field10022;

      try {
         ++field9402;
         if (!arg0) {
            field9404 = null;
         }

         label31: {
            int var2 = class476.field6870.field9145.method3261(-55);
            if (~var2 != -1) {
               if (var2 == 1) {
                  class273.method2313(-126, (byte)0);
                  class356.method2801(true, 512);
                  if (class644.field9070 == null) {
                     break label31;
                  }

                  class383.method2986(-68);
                  if (!var1) {
                     break label31;
                  }
               }

               class273.method2313(-119, (byte)(class495.field7065 + -4 & 255));
               class356.method2801(arg0, 2);
               if (!var1) {
                  break label31;
               }
            }

            class643.field9050 = null;
            class356.method2801(true, 0);
         }

         class394.field5767 = class128.field2049;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9409[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(Ld;ILjava/awt/Canvas;II)Lha;"
   )
   public static final class17 method4858(class672 arg0, int arg1, Canvas arg2, int arg3, int arg4) {
      try {
         ++field9406;
         if (arg4 != 0) {
            method4859((char)65474, -56, (String)null, (String)null);
         }

         return new class20(arg2, arg0, arg3, arg1);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9409[5] + (arg0 != null ? field9409[3] : field9409[4]) + ',' + arg1 + ',' + (arg2 != null ? field9409[3] : field9409[4]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(CILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;"
   )
   public static final String method4859(char arg0, int arg1, String arg2, String arg3) {
      boolean var4 = client.field10022;

      try {
         ++field9405;
         if (arg1 < 48) {
            method4857(false);
         }

         int var5 = arg2.length();
         int var6 = arg3.length();
         int var7 = var5;
         int var8 = var6 + -1;
         if (var8 != 0) {
            int var9 = 0;

            do {
               var9 = arg2.indexOf(arg0, var9);
               if (~var9 > -1) {
                  break;
               }

               var7 += var8;
               ++var9;
            } while(!var4);
         }

         StringBuffer var10 = new StringBuffer(var7);
         int var11 = 0;

         while(true) {
            int var12 = arg2.indexOf(arg0, var11);
            if (var12 >= 0) {
               var10.append(arg2.substring(var11, var12));
               var11 = var12 + 1;
               var10.append(arg3);
               if (var4) {
                  break;
               }

               if (!var4) {
                  continue;
               }
            }

            var10.append(arg2.substring(var11));
            break;
         }

         return var10.toString();
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field9409[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9409[3] : field9409[4]) + ',' + (arg3 != null ? field9409[3] : field9409[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4860(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4861(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 38;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
