import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class390 extends class3 {
   @OriginalMember(
      owner = "client!vk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5662 = new String[]{method2971(method2970("96e*\u001c")), method2971(method2970("96e(\u001c")), method2971(method2970("96e+\u001c")), method2971(method2970("96e-\u001c")), method2971(method2970("!('\r")), method2971(method2970("4seOI"))};
   @OriginalMember(
      owner = "client!vk",
      name = "k",
      descriptor = "I"
   )
   public static int field5657 = 0;
   @OriginalMember(
      owner = "client!vk",
      name = "q",
      descriptor = "Leg;"
   )
   public static class118 field5660 = new class118(27, 6);
   @OriginalMember(
      owner = "client!vk",
      name = "m",
      descriptor = "I"
   )
   public static int field5655;
   @OriginalMember(
      owner = "client!vk",
      name = "n",
      descriptor = "I"
   )
   public static int field5656;
   @OriginalMember(
      owner = "client!vk",
      name = "j",
      descriptor = "I"
   )
   public static int field5659;
   @OriginalMember(
      owner = "client!vk",
      name = "p",
      descriptor = "I"
   )
   public static int field5661;
   @OriginalMember(
      owner = "client!vk",
      name = "o",
      descriptor = "Lvk;"
   )
   public class390 field5653;
   @OriginalMember(
      owner = "client!vk",
      name = "l",
      descriptor = "Lvk;"
   )
   public class390 field5658;
   @OriginalMember(
      owner = "client!vk",
      name = "r",
      descriptor = "[Lqga;"
   )
   public static class198[] field5654;

   @OriginalMember(
      owner = "client!vk",
      name = "a",
      descriptor = "(ZLkf;)I"
   )
   public static final int method2966(boolean arg0, class266 arg1) {
      try {
         ++field5659;
         int var2 = 0;
         if (arg1.method2051(class524.field7517, (byte)60)) {
            ++var2;
         }

         if (arg1.method2051(class74.field913, (byte)60)) {
            ++var2;
         }

         if (arg1.method2051(class666.field9669, (byte)60)) {
            ++var2;
         }

         if (arg0) {
            return -77;
         } else {
            if (arg1.method2051(class172.field2395, (byte)60)) {
               ++var2;
            }

            if (arg1.method2051(class281.field3907, (byte)60)) {
               ++var2;
            }

            if (arg1.method2051(class607.field8904, (byte)60)) {
               ++var2;
            }

            if (arg1.method2051(class549.field7864, (byte)60)) {
               ++var2;
            }

            if (arg1.method2051(class80.field1028, (byte)60)) {
               ++var2;
            }

            if (arg1.method2051(class400.field5788, (byte)60)) {
               ++var2;
            }

            if (arg1.method2051(class403.field5825, (byte)60)) {
               ++var2;
            }

            if (arg1.method2051(class677.field9799, (byte)60)) {
               ++var2;
            }

            if (arg1.method2051(class581.field8548, (byte)60)) {
               ++var2;
            }

            if (arg1.method2051(class290.field4011, (byte)60)) {
               ++var2;
            }

            if (arg1.method2051(class470.field6753, (byte)60)) {
               ++var2;
            }

            if (arg1.method2051(class763.field11276, (byte)60)) {
               ++var2;
            }

            if (arg1.method2051(class165.field2328, (byte)60)) {
               ++var2;
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5662[3] + arg0 + ',' + (arg1 != null ? field5662[5] : field5662[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vk",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2967(int arg0) {
      try {
         ++field5656;
         if (this.field5658 != null) {
            if (arg0 <= -85) {
               this.field5658.field5653 = this.field5653;
               this.field5653.field5658 = this.field5658;
               this.field5653 = null;
               this.field5658 = null;
            }
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5662[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vk",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method2968(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field5655;
         class755 var5 = class317.method2325((long)arg3 << 32 | (long)arg4, 112, arg2);
         var5.method5479(arg2 + 1269);
         var5.field11181 = arg0;
         var5.field11184 = arg1;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field5662[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vk",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2969(int arg0) {
      try {
         if (arg0 == 19) {
            field5654 = null;
            field5660 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5662[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2970(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2971(char[] arg0) {
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
            var10005 = 93;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
