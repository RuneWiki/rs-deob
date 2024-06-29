import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class507 {
   @OriginalMember(
      owner = "client!hl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7209 = new String[]{method3822(method3821("\u001a\u0015\u007fO{")), method3822(method3821("\u000fN=\r")), method3822(method3821("\tW\u007f\".")), method3822(method3821("\tW\u007f%.")), method3822(method3821("\tW\u007f#.")), method3822(method3821("\tW\u007f ."))};
   @OriginalMember(
      owner = "client!hl",
      name = "a",
      descriptor = "Lbu;"
   )
   public static class234 field7203 = new class234(9, 0, 4, 1);
   @OriginalMember(
      owner = "client!hl",
      name = "b",
      descriptor = "I"
   )
   public int field7200;
   @OriginalMember(
      owner = "client!hl",
      name = "d",
      descriptor = "I"
   )
   public static int field7201;
   @OriginalMember(
      owner = "client!hl",
      name = "e",
      descriptor = "I"
   )
   public static int field7202;
   @OriginalMember(
      owner = "client!hl",
      name = "i",
      descriptor = "I"
   )
   public int field7204;
   @OriginalMember(
      owner = "client!hl",
      name = "h",
      descriptor = "I"
   )
   public int field7205;
   @OriginalMember(
      owner = "client!hl",
      name = "f",
      descriptor = "I"
   )
   public static int field7207;
   @OriginalMember(
      owner = "client!hl",
      name = "c",
      descriptor = "I"
   )
   public static int field7208;
   @OriginalMember(
      owner = "client!hl",
      name = "g",
      descriptor = "Lma;"
   )
   public static class148 field7206;

   @OriginalMember(
      owner = "client!hl",
      name = "a",
      descriptor = "(ILeq;)I"
   )
   public static final int method3817(int arg0, class799 arg1) {
      boolean var2 = client.field10022;

      try {
         ++field7202;
         class302 var3 = arg1.field11618;
         if (var3.field4550 != null) {
            var3 = var3.method2501(class344.field5074, -85);
            if (var3 == null) {
               return -1;
            }
         }

         int var4 = var3.field4559;
         class299 var5 = arg1.method3068(-127);
         int var6 = arg1.field5801.method2218(false);
         if (~var6 == arg0 || arg1.field5808) {
            var4 = var3.field4520;
            if (!var2) {
               return var4;
            }
         }

         if (~var5.field4427 == ~var6 || var5.field4431 == var6 || ~var5.field4462 == ~var6 || ~var5.field4471 == ~var6) {
            var4 = var3.field4534;
            if (!var2) {
               return var4;
            }
         }

         if (~var5.field4441 == ~var6 || ~var5.field4443 == ~var6 || ~var5.field4466 == ~var6 || var5.field4483 == var6) {
            var4 = var3.field4501;
         }

         return var4;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field7209[2] + arg0 + ',' + (arg1 != null ? field7209[0] : field7209[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hl",
      name = "a",
      descriptor = "(ILcu;I)V"
   )
   private final void method3818(int arg0, class65 arg1, int arg2) {
      try {
         if (arg0 == 1) {
            this.field7204 = arg1.method685(-2);
            this.field7200 = arg1.method665(false);
            this.field7205 = arg1.method665(false);
         }

         int var4 = 116 / ((-85 - arg2) / 38);
         ++field7208;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field7209[3] + arg0 + ',' + (arg1 != null ? field7209[0] : field7209[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hl",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3819(int arg0) {
      try {
         field7206 = null;
         field7203 = null;
         if (arg0 != 9) {
            field7207 = 104;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7209[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hl",
      name = "a",
      descriptor = "(Lcu;I)V"
   )
   public final void method3820(class65 arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         while(true) {
            int var4 = arg0.method665(false);
            if (~var4 != -1) {
               this.method3818(var4, arg0, -124);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (arg1 < 13) {
               this.field7200 = -9;
            }

            ++field7201;
            break;
         }

      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field7209[4] + (arg0 != null ? field7209[0] : field7209[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3821(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 6);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3822(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 6;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
