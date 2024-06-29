import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class514 {
   @OriginalMember(
      owner = "client!np",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7499 = new String[]{method3892(method3891("\f\u001b;E`")), method3892(method3891("\u0019E;)5")), method3892(method3891("\f\u001eyk")), method3892(method3891("\f\u001b;D`")), method3892(method3891("\f\u001b;B`")), method3892(method3891("\f\u001b;F`")), method3892(method3891("\f\u001b;C`"))};
   @OriginalMember(
      owner = "client!np",
      name = "f",
      descriptor = "I"
   )
   public static int field7496 = -1;
   @OriginalMember(
      owner = "client!np",
      name = "d",
      descriptor = "I"
   )
   public static int field7494;
   @OriginalMember(
      owner = "client!np",
      name = "e",
      descriptor = "I"
   )
   public static int field7495;
   @OriginalMember(
      owner = "client!np",
      name = "b",
      descriptor = "I"
   )
   public static int field7497;
   @OriginalMember(
      owner = "client!np",
      name = "a",
      descriptor = "I"
   )
   public static int field7498;
   @OriginalMember(
      owner = "client!np",
      name = "c",
      descriptor = "Ldl;"
   )
   public static class69 field7492;
   @OriginalMember(
      owner = "client!np",
      name = "g",
      descriptor = "Ljava/applet/Applet;"
   )
   public static Applet field7493;

   @OriginalMember(
      owner = "client!np",
      name = "a",
      descriptor = "(I)V",
      line = 3
   )
   public static void method3886(int arg0) {
      try {
         field7492 = null;
         field7493 = null;
         if (arg0 != 0) {
            field7496 = -124;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7499[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "a",
      descriptor = "(Luda;I)Lwha;",
      line = 16
   )
   public static final class296 method3887(class473 arg0, int arg1) {
      try {
         if (arg1 != -18338) {
            field7496 = 80;
         }

         ++field7497;
         return new class296(arg0.method3538(-128), arg0.method3538(arg1 ^ 18398), arg0.method3538(arg1 ^ 18398), arg0.method3538(-128), arg0.method3577(-2), arg0.method3577(-2), arg0.method3564((byte)-125));
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7499[3] + (arg0 != null ? field7499[1] : field7499[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "a",
      descriptor = "(Z[BB)V",
      line = 29
   )
   public static final void method3888(boolean arg0, byte[] arg1, byte arg2) {
      boolean var3 = client.field4564;

      try {
         if (arg2 != 98) {
            method3889(-103, -23);
         }

         ++field7495;
         if (class553.field8007 == null) {
            class553.field8007 = new class473(20000);
         }

         class553.field8007.method3536(0, arg1.length, arg1, arg2 + -13189);
         if (arg0) {
            class85.method844(class553.field8007.field6889, (byte)-123);
            class771.field11308 = new class203[class194.field2936];
            int var4 = 0;
            int var5 = class36.field888;
            class203 var6;
            if (var3) {
               var6 = class448.method3378(-1, var5);
               if (var6 != null) {
                  class771.field11308[var4++] = var6;
               }

               ++var5;
            }

            while(true) {
               byte var10000;
               if (~var5 < ~class262.field3733) {
                  class273.field3873 = false;
                  var10000 = 122;
                  if (!var3) {
                     class4.field44 = class57.method650(122);
                     class553.field8007 = null;
                     return;
                  }
               } else {
                  var10000 = -1;
               }

               var6 = class448.method3378(var10000, var5);
               if (var6 != null) {
                  class771.field11308[var4++] = var6;
               }

               ++var5;
            }
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field7499[4] + arg0 + ',' + (arg1 != null ? field7499[1] : field7499[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "a",
      descriptor = "(II)Z",
      line = 78
   )
   public static final boolean method3889(int arg0, int arg1) {
      try {
         if (arg1 != -4) {
            return true;
         } else {
            ++field7494;
            return arg0 >= 0 && ~arg0 >= -4 || ~arg0 == -10;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7499[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "a",
      descriptor = "(B)V",
      line = 90
   )
   public static final void method3890(byte arg0) {
      try {
         ++field7498;
         class564.field8196.method1570((byte)15);
         class195.field2947.method5675((byte)81);
         class51.field1055.method5675((byte)101);
         int var1 = -26 % ((9 - arg0) / 52);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7499[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3891(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 72);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!np",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3892(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 72;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
