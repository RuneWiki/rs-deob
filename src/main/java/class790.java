import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class790 {
   @OriginalMember(
      owner = "client!sw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11562 = new String[]{method5701(method5700("U7>\f\u001b")), method5701(method5700("U7>\u000b\u001b")), method5701(method5700("]n>aN")), method5701(method5700("H5|#")), method5701(method5700("U7>\n\u001b")), method5701(method5700("U7>\t\u001b")), method5701(method5700("U7>\r\u001b")), method5701(method5700("u(q+VT`s ^V)|*\u0013@!y#VBz")), method5701(method5700("U7>\u000e\u001b"))};
   @OriginalMember(
      owner = "client!sw",
      name = "g",
      descriptor = "Ldd;"
   )
   public static class735 field11560 = new class735(1, 2, 2, 0);
   @OriginalMember(
      owner = "client!sw",
      name = "c",
      descriptor = "I"
   )
   public static int field11555;
   @OriginalMember(
      owner = "client!sw",
      name = "b",
      descriptor = "I"
   )
   public static int field11556;
   @OriginalMember(
      owner = "client!sw",
      name = "e",
      descriptor = "I"
   )
   public static int field11557;
   @OriginalMember(
      owner = "client!sw",
      name = "f",
      descriptor = "I"
   )
   public static int field11558;
   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "I"
   )
   public static int field11559;
   @OriginalMember(
      owner = "client!sw",
      name = "h",
      descriptor = "J"
   )
   public static long field11561;
   @OriginalMember(
      owner = "client!sw",
      name = "d",
      descriptor = "Lbo;"
   )
   public static class763 field11554;

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method5694(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field11559;
         if ((class100.field1295[arg1][arg0][arg3] & 8) != 0) {
            return 0;
         } else {
            int var4 = 23 % ((arg2 - 26) / 61);
            return ~arg1 < -1 && (class100.field1295[1][arg0][arg3] & 2) != 0 ? arg1 + -1 : arg1;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field11562[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5695(byte arg0) {
      try {
         field11560 = null;
         if (arg0 != -23) {
            method5699(-128, -105);
         }

         field11554 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field11562[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(Ljava/lang/String;IILor;)Lmba;"
   )
   public static final class445 method5696(String arg0, int arg1, int arg2, class670 arg3) {
      try {
         int var4 = -87 % ((75 - arg2) / 37);
         ++field11558;
         long var5 = OpenGL.glCreateShaderObjectARB(arg1);
         OpenGL.glShaderSourceARB(var5, arg0);
         OpenGL.glCompileShaderARB(var5);
         OpenGL.glGetObjectParameterivARB(var5, 35713, class100.field1289, 0);
         if (class100.field1289[0] == 0) {
            if (class100.field1289[0] == 0) {
               System.out.println(field11562[7]);
            }

            OpenGL.glGetObjectParameterivARB(var5, 35716, class100.field1289, 1);
            if (~class100.field1289[1] < -2) {
               byte[] var7 = new byte[class100.field1289[1]];
               OpenGL.glGetInfoLogARB(var5, class100.field1289[1], class100.field1289, 0, var7, 0);
               System.out.println(new String(var7));
            }

            if (~class100.field1289[0] == -1) {
               OpenGL.glDeleteObjectARB(var5);
               return null;
            }
         }

         return new class445(arg3, var5, arg1);
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field11562[8] + (arg0 != null ? field11562[2] : field11562[3]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field11562[2] : field11562[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;IZI)V"
   )
   public static final void method5697(String arg0, String arg1, int arg2, boolean arg3, int arg4) {
      try {
         ++field11557;
         class339.method2690(true, 66, arg3, -1, arg1, arg0, arg2);
         int var5 = 38 % ((7 - arg4) / 48);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field11562[1] + (arg0 != null ? field11562[2] : field11562[3]) + ',' + (arg1 != null ? field11562[2] : field11562[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "b",
      descriptor = "(II)Z"
   )
   public static final boolean method5698(int arg0, int arg1) {
      try {
         ++field11555;
         if (arg1 > -104) {
            return false;
         } else {
            return ~arg0 == -8 || arg0 == 9;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11562[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(II)[B"
   )
   public static final byte[] method5699(int arg0, int arg1) {
      boolean var2 = client.field4273;

      try {
         ++field11556;
         class340 var3 = (class340)class178.field2214.method176(false, (long)arg0);
         if (arg1 > -34) {
            field11561 = 112L;
         }

         if (var3 == null) {
            byte[] var4 = new byte[512];
            Random var5 = new Random((long)arg0);
            int var6 = 0;
            if (var2) {
               var4[var6] = (byte)var6;
               ++var6;
            }

            while(true) {
               while(var6 < 255) {
                  var4[var6] = (byte)var6;
                  ++var6;
               }

               int var7 = 0;
               if (!var2) {
                  if (var2 || ~var7 > -256) {
                     do {
                        int var8 = -var7 + 255;
                        int var9 = class221.method1687(var5, -96, var8);
                        byte var10 = var4[var9];
                        var4[var9] = var4[var8];
                        var4[var8] = var4[-var7 + 511] = var10;
                        ++var7;
                     } while(~var7 > -256);
                  }

                  var3 = new class340(var4);
                  class178.field2214.method175(0, (long)arg0, var3);
                  break;
               }

               ++var6;
            }
         }

         return var3.field4871;
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field11562[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5700(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5701(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 38;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 16;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
