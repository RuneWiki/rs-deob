import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class179 extends class446 {
   @OriginalMember(
      owner = "client!mg",
      name = "x",
      descriptor = "I"
   )
   private int field2783 = -1;
   @OriginalMember(
      owner = "client!mg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2789 = new String[]{method1630(method1629("L\u0012(9\u001d")), method1630(method1629("L\u0012(3\u001d")), method1630(method1629("Z[(_H")), method1630(method1629("O\u0000j\u001d")), method1630(method1629("L\u0012(0\u001d")), method1630(method1629("L\u0012(8\u001d")), method1630(method1629("L\u0012(2\u001d"))};
   @OriginalMember(
      owner = "client!mg",
      name = "r",
      descriptor = "I"
   )
   public static int field2782;
   @OriginalMember(
      owner = "client!mg",
      name = "w",
      descriptor = "I"
   )
   public static int field2784;
   @OriginalMember(
      owner = "client!mg",
      name = "u",
      descriptor = "I"
   )
   public static int field2785;
   @OriginalMember(
      owner = "client!mg",
      name = "s",
      descriptor = "I"
   )
   public static int field2786;
   @OriginalMember(
      owner = "client!mg",
      name = "t",
      descriptor = "I"
   )
   public static int field2787;
   @OriginalMember(
      owner = "client!mg",
      name = "v",
      descriptor = "I"
   )
   public static int field2788;

   @OriginalMember(
      owner = "client!mg",
      name = "a",
      descriptor = "(ILaka;)V"
   )
   public final void method810(int arg0, class637 arg1) {
      try {
         if (arg0 != 32061) {
            method1628(true);
         }

         arg1.method4655(5185, this.field2783);
         ++field2782;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2789[6] + arg0 + ',' + (arg1 != null ? field2789[2] : field2789[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mg",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public static final void method1626(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         label29: {
            if (~class443.field6806 >= ~arg1 && ~class182.field2833 <= ~arg2 && ~class368.field5724 >= ~arg0 && ~arg4 >= ~class84.field1212) {
               class250.method2123(arg0, arg2, arg3, arg1, -25124, arg4);
               if (!client.field1786) {
                  break label29;
               }
            }

            class452.method3545(arg0, arg4, arg1, arg5 ^ -122, arg2, arg3);
         }

         if (arg5 != 0) {
            method1626(67, -43, 86, -36, 18, -81);
         }

         ++field2786;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field2789[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mg",
      name = "a",
      descriptor = "(Lica;I)V"
   )
   public final void method805(class354 arg0, int arg1) {
      try {
         if (arg1 != 0) {
            this.method805((class354)null, -82);
         }

         ++field2784;
         this.field2783 = arg0.method2848(-120);
         arg0.method2855(arg1 ^ -31007);
         if (arg0.method2855(-31007) != 255) {
            --arg0.field5436;
            arg0.method2898(32109);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2789[4] + (arg0 != null ? field2789[2] : field2789[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mg",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method1627(int arg0, int arg1, int arg2) {
      try {
         ++field2787;
         int var3 = class432.method3414(arg0 + -1, -1584834189, arg2 + -1) - -class432.method3414(arg0 + 1, -1584834189, arg2 + -1) + (class432.method3414(arg0 + -1, -1584834189, arg2 - -1) - -class432.method3414(arg0 - -1, -1584834189, arg2 + 1));
         int var4 = class432.method3414(arg0 + -1, -1584834189, arg2) - -class432.method3414(arg0 - -1, -1584834189, arg2) + class432.method3414(arg0, arg1 + -1584834188, arg1 + arg2) + class432.method3414(arg0, -1584834189, arg2 + 1);
         int var5 = class432.method3414(arg0, -1584834189, arg2);
         return var3 / 16 + var4 / 8 + var5 / 4;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field2789[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mg",
      name = "a",
      descriptor = "(Z)Lln;"
   )
   public static final class433 method1628(boolean arg0) {
      try {
         class244.field3715 = 0;
         if (!arg0) {
            return null;
         } else {
            ++field2788;
            return class550.method4176((byte)38);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2789[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1629(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 53);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1630(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 33;
            break;
         case 1:
            var10005 = 117;
            break;
         case 2:
            var10005 = 6;
            break;
         case 3:
            var10005 = 113;
            break;
         default:
            var10005 = 53;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
