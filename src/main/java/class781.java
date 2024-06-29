import java.awt.Canvas;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class781 extends Canvas {
   @OriginalMember(
      owner = "client!m",
      name = "d",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field11386;
   @OriginalMember(
      owner = "client!m",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11390 = new String[]{method5645(method5644("*@\u0015pV")), method5645(method5644("?\u001bW2")), method5645(method5644("<@K?B?\u001a\u0013")), method5645(method5644("<@N.O0\u001a^v")), method5645(method5644("<@\u00077E8\u001a\u0005v")), method5645(method5644("<@zv")), method5645(method5644("<@yv"))};
   @OriginalMember(
      owner = "client!m",
      name = "c",
      descriptor = "I"
   )
   public static int field11385;
   @OriginalMember(
      owner = "client!m",
      name = "a",
      descriptor = "I"
   )
   public static int field11387;
   @OriginalMember(
      owner = "client!m",
      name = "e",
      descriptor = "I"
   )
   public static int field11388;
   @OriginalMember(
      owner = "client!m",
      name = "b",
      descriptor = "I"
   )
   public static int field11389;

   @OriginalMember(
      owner = "client!m",
      name = "paint",
      descriptor = "(Ljava/awt/Graphics;)V"
   )
   public final void paint(Graphics arg0) {
      try {
         ++field11387;
         this.field11386.paint(arg0);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11390[2] + (arg0 != null ? field11390[0] : field11390[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "update",
      descriptor = "(Ljava/awt/Graphics;)V"
   )
   public final void update(Graphics arg0) {
      try {
         ++field11388;
         this.field11386.update(arg0);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11390[3] + (arg0 != null ? field11390[0] : field11390[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public static final void method5642(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         ++field11385;
         if (arg1 == arg3) {
            class141.method1411(arg0, arg4, -75, arg3, arg2, arg6, arg7);
         } else {
            label40: {
               if (class729.field10384 > -arg3 + arg0 || arg0 + arg3 > class604.field8618 || ~class587.field8239 < ~(-arg1 + arg2) || arg1 + arg2 > class767.field11011) {
                  class356.method2797(arg1, arg2, arg6, arg7, arg0, arg4, arg3, arg5 + 1946797947);
                  if (!client.field10022) {
                     break label40;
                  }
               }

               class269.method2295(true, arg2, arg6, arg4, arg1, arg0, arg3, arg7);
            }

            if (arg5 != 8849) {
               method5642(6, -103, 59, 52, 124, -41, -102, -48);
            }
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field11390[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method5643(int arg0) {
      boolean var1 = client.field10022;

      try {
         label25: {
            if (class54.field794.method249()) {
               label22: {
                  class54.field794.method153(class729.field10389);
                  class759.method5480(3030);
                  if (!class563.field8012) {
                     Dimension var2 = class729.field10389.getSize();
                     class54.field794.method146(class729.field10389, var2.width, var2.height);
                     if (!var1) {
                        break label22;
                     }
                  }

                  class330.method2648(class729.field10389, (byte)-98);
               }

               class54.field794.method158(class729.field10389);
               if (!var1) {
                  break label25;
               }
            }

            class508.method3828(1, false, class476.field6870.field9109.method4676(-94));
         }

         int var3 = 63 / ((65 - arg0) / 51);
         ++field11389;
         class258.method2194(-75);
         class248.field3804 = true;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field11390[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "<init>",
      descriptor = "(Ljava/awt/Component;)V"
   )
   public class781(Component arg0) {
      try {
         this.field11386 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11390[4] + (arg0 != null ? field11390[0] : field11390[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5644(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 43);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!m",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5645(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 81;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
