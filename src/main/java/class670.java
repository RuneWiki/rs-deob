import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public abstract class class670 extends class294 {
   @OriginalMember(
      owner = "client!uw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9998 = new String[]{method4938(method4937("'\u0007q\u0011A\u0006Os\u001aI\u0004\u0006|\u0010\u0004\u0012\u000ey\u0019A\u0010U")), method4938(method4937("\u001a\u001a|\u0019")), method4938(method4937("\u0001\u0018>>\f")), method4938(method4937("\u000fA>[Y")), method4938(method4937("\u0001\u0018>9\f")), method4938(method4937("\u001e\u000ew\u0012H")), method4938(method4937("\u0001\u0018>?\f"))};
   @OriginalMember(
      owner = "client!uw",
      name = "n",
      descriptor = "Llj;"
   )
   public static class304 field9994 = new class304(260);
   @OriginalMember(
      owner = "client!uw",
      name = "p",
      descriptor = "I"
   )
   public static int field9995;
   @OriginalMember(
      owner = "client!uw",
      name = "m",
      descriptor = "I"
   )
   public static int field9996;
   @OriginalMember(
      owner = "client!uw",
      name = "o",
      descriptor = "I"
   )
   public static int field9997;

   @OriginalMember(
      owner = "client!uw",
      name = "a",
      descriptor = "(B)V",
      line = 11
   )
   public static void method4934(byte arg0) {
      try {
         if (arg0 > -32) {
            method4934((byte)-71);
         }

         field9994 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9998[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "a",
      descriptor = "(Z[BILcka;)Llf;",
      line = 21
   )
   public static final class513 method4935(boolean arg0, byte[] arg1, int arg2, class174 arg3) {
      try {
         ++field9997;
         if (arg1 != null && arg1.length != 0) {
            if (!arg0) {
               method4934((byte)5);
            }

            long var4 = OpenGL.glCreateShaderObjectARB(arg2);
            OpenGL.glShaderSourceRawARB(var4, arg1);
            OpenGL.glCompileShaderARB(var4);
            OpenGL.glGetObjectParameterivARB(var4, 35713, class564.field8379, 0);
            if (~class564.field8379[0] == -1) {
               if (class564.field8379[0] == 0) {
                  System.out.println(field9998[0]);
               }

               OpenGL.glGetObjectParameterivARB(var4, 35716, class564.field8379, 1);
               if (class564.field8379[1] > 1) {
                  byte[] var6 = new byte[class564.field8379[1]];
                  OpenGL.glGetInfoLogARB(var4, class564.field8379[1], class564.field8379, 0, var6, 0);
                  System.out.println(new String(var6));
               }

               if (~class564.field8379[0] == -1) {
                  OpenGL.glDeleteObjectARB(var4);
                  return null;
               }
            }

            return new class513(arg3, var4, arg2);
         } else {
            return null;
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field9998[2] + arg0 + ',' + (arg1 != null ? field9998[3] : field9998[1]) + ',' + arg2 + ',' + (arg3 != null ? field9998[3] : field9998[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "a",
      descriptor = "(ILjava/awt/Canvas;Ld;ZLrr;)Lha;",
      line = 66
   )
   public static final class610 method4936(int arg0, Canvas arg1, class150 arg2, boolean arg3, class678 arg4) {
      try {
         ++field9996;
         if (!class479.method3725((byte)-6)) {
            throw new RuntimeException("");
         } else if (!class158.method1410((byte)-93, field9998[5])) {
            throw new RuntimeException("");
         } else {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg1, 8, 8, 8, 24, 0, arg0);
            if (~var6 == -1L) {
               throw new RuntimeException("");
            } else {
               class174 var8 = new class174(var5, arg1, var6, arg2, arg4, arg0);
               var8.method2227(1);
               if (arg3) {
                  method4936(36, (Canvas)null, (class150)null, false, (class678)null);
               }

               return var8;
            }
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field9998[6] + arg0 + ',' + (arg1 != null ? field9998[3] : field9998[1]) + ',' + (arg2 != null ? field9998[3] : field9998[1]) + ',' + arg3 + ',' + (arg4 != null ? field9998[3] : field9998[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "c",
      descriptor = "(I)I"
   )
   public abstract int method3790(int arg0);

   @OriginalMember(
      owner = "client!uw",
      name = "b",
      descriptor = "(I)I"
   )
   public abstract int method3793(int arg0);

   @OriginalMember(
      owner = "client!uw",
      name = "c",
      descriptor = "(B)J"
   )
   public abstract long method3791(byte arg0);

   @OriginalMember(
      owner = "client!uw",
      name = "a",
      descriptor = "(I)I"
   )
   public abstract int method3789(int arg0);

   @OriginalMember(
      owner = "client!uw",
      name = "b",
      descriptor = "(B)I"
   )
   public abstract int method3792(byte arg0);

   @OriginalMember(
      owner = "client!uw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4937(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4938(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 16;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
