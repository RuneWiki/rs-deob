import jaggl.OpenGL;
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public abstract class class508 extends class428 {
   @OriginalMember(
      owner = "client!eu",
      name = "o",
      descriptor = "Ljagtheora/ogg/OggStreamState;"
   )
   public OggStreamState field7405;
   @OriginalMember(
      owner = "client!eu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7409 = new String[]{method3698(method3697("Lyw<f")), method3698(method3697("d?8v~Ew:}vG>5w;Q60~~Sm")), method3698(method3697("R\"w_3")), method3698(method3697("Y\"5~")), method3698(method3697("R\"w\\3")), method3698(method3697("R\"wY3")), method3698(method3697("R\"w.rY>-,3"))};
   @OriginalMember(
      owner = "client!eu",
      name = "p",
      descriptor = "I"
   )
   public static int field7404;
   @OriginalMember(
      owner = "client!eu",
      name = "m",
      descriptor = "I"
   )
   public int field7407;
   @OriginalMember(
      owner = "client!eu",
      name = "n",
      descriptor = "I"
   )
   public static int field7408;
   @OriginalMember(
      owner = "client!eu",
      name = "q",
      descriptor = "[Lip;"
   )
   public static class737[] field7406;

   @OriginalMember(
      owner = "client!eu",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method1486(int arg0);

   @OriginalMember(
      owner = "client!eu",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method3693(int arg0, int arg1) {
      class196 var2 = null;

      for(int var3 = arg0; var3 < arg1; ++var3) {
         class295 var4 = class265.field3658[var3];
         if (var4 != null) {
            for(int var5 = 0; var5 < class16.field190; ++var5) {
               for(int var6 = 0; var6 < class457.field6539; ++var6) {
                  var2 = var4.method1621(var6, var5, var2);
                  if (var2 != null) {
                     int var7 = var6 << class773.field11359;
                     int var8 = var5 << class773.field11359;

                     for(int var9 = var3 - 1; var9 >= 0; --var9) {
                        class295 var10 = class265.field3658[var9];
                        if (var10 != null) {
                           int var11 = var4.method2219(true, var6, var5) - var10.method2219(true, var6, var5);
                           int var12 = var4.method2219(true, var6 + 1, var5) - var10.method2219(true, var6 + 1, var5);
                           int var13 = var4.method2219(true, var6 + 1, var5 + 1) - var10.method2219(true, var6 + 1, var5 + 1);
                           int var14 = var4.method2219(true, var6, var5 + 1) - var10.method2219(true, var6, var5 + 1);
                           var10.method1623(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!eu",
      name = "a",
      descriptor = "(ZILjava/lang/String;Lea;)Ltc;"
   )
   public static final class373 method3694(boolean arg0, int arg1, String arg2, class573 arg3) {
      try {
         if (!arg0) {
            field7406 = null;
         }

         ++field7404;
         long var4 = OpenGL.glCreateShaderObjectARB(arg1);
         OpenGL.glShaderSourceARB(var4, arg2);
         OpenGL.glCompileShaderARB(var4);
         OpenGL.glGetObjectParameterivARB(var4, 35713, class75.field929, 0);
         if (class75.field929[0] == 0) {
            if (class75.field929[0] == 0) {
               System.out.println(field7409[1]);
            }

            OpenGL.glGetObjectParameterivARB(var4, 35716, class75.field929, 1);
            if (class75.field929[1] > 1) {
               byte[] var6 = new byte[class75.field929[1]];
               OpenGL.glGetInfoLogARB(var4, class75.field929[1], class75.field929, 0, var6, 0);
               System.out.println(new String(var6));
            }

            if (~class75.field929[0] == -1) {
               OpenGL.glDeleteObjectARB(var4);
               return null;
            }
         }

         return new class373(arg3, var4, arg1);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field7409[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7409[0] : field7409[3]) + ',' + (arg3 != null ? field7409[0] : field7409[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V"
   )
   public class508(OggStreamState arg0) {
      try {
         this.field7405 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7409[6] + (arg0 != null ? field7409[0] : field7409[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "a",
      descriptor = "(ZLjagtheora/ogg/OggPacket;)V"
   )
   public abstract void method1485(boolean arg0, OggPacket arg1);

   @OriginalMember(
      owner = "client!eu",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3695(boolean arg0) {
      try {
         if (!arg0) {
            method3694(false, -80, (String)null, (class573)null);
         }

         field7406 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7409[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "a",
      descriptor = "(Ljagtheora/ogg/OggPacket;I)V"
   )
   public final void method3696(OggPacket arg0, int arg1) {
      try {
         this.method1485(false, arg0);
         ++field7408;
         ++this.field7407;
         if (arg1 < 99) {
            field7406 = null;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7409[5] + (arg0 != null ? field7409[0] : field7409[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3697(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3698(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 87;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
