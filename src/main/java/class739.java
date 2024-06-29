import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class739 {
   @OriginalMember(
      owner = "client!ki",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10769 = new String[]{method5359(method5358("-BQ\u0001=")), method5359(method5358("=\u0005Qlh")), method5359(method5358("(^\u0013.")), method5359(method5358("-BQ\u0003=")), method5359(method5358("\u0015C\u001e&p4\u000b\u001c-x6B\u0013'5 J\u0016.p\"\u0011")), method5359(method5358("-BQ\u0000="))};
   @OriginalMember(
      owner = "client!ki",
      name = "b",
      descriptor = "[Lbn;"
   )
   public static class471[] field10766 = new class471[300];
   @OriginalMember(
      owner = "client!ki",
      name = "d",
      descriptor = "I"
   )
   public static int field10765 = 0;
   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "I"
   )
   public static int field10763;
   @OriginalMember(
      owner = "client!ki",
      name = "e",
      descriptor = "I"
   )
   public static int field10764;
   @OriginalMember(
      owner = "client!ki",
      name = "f",
      descriptor = "I"
   )
   public static int field10767;
   @OriginalMember(
      owner = "client!ki",
      name = "c",
      descriptor = "I"
   )
   public static int field10768;

   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "(Ljava/lang/String;I[BB)I"
   )
   public static final int method5355(String arg0, int arg1, byte[] arg2, byte arg3) {
      try {
         ++field10768;
         int var4 = arg1;
         int var5 = arg0.length();
         if (arg3 != -109) {
            method5357(true);
         }

         for(int var6 = 0; ~var6 > ~var5; var6 += 4) {
            int var7 = class558.method4014(-891902748, arg0.charAt(var6));
            int var8 = var6 - -1 < var5 ? class558.method4014(-891902748, arg0.charAt(var6 + 1)) : -1;
            int var9 = ~var5 < ~(var6 - -2) ? class558.method4014(-891902748, arg0.charAt(var6 + 2)) : -1;
            int var10 = ~(var6 + 3) <= ~var5 ? -1 : class558.method4014(-891902748, arg0.charAt(var6 - -3));
            arg2[arg1++] = (byte)class283.method2155(var7 << 2, var8 >>> 4);
            if (~var9 == 0) {
               break;
            }

            arg2[arg1++] = (byte)class283.method2155(var9 >>> 2, class743.method5375(var8, 15) << 4);
            if (var10 == -1) {
               break;
            }

            arg2[arg1++] = (byte)class283.method2155(var10, class743.method5375(192, var9 << 6));
         }

         return -var4 + arg1;
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field10769[0] + (arg0 != null ? field10769[1] : field10769[2]) + ',' + arg1 + ',' + (arg2 != null ? field10769[1] : field10769[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "(Lkfa;B[BI)Lqfa;"
   )
   public static final class107 method5356(class632 arg0, byte arg1, byte[] arg2, int arg3) {
      try {
         ++field10763;
         if (arg2 != null && arg2.length != 0) {
            long var4 = OpenGL.glCreateShaderObjectARB(arg3);
            if (arg1 <= 22) {
               method5355((String)null, -81, (byte[])null, (byte)-117);
            }

            OpenGL.glShaderSourceRawARB(var4, arg2);
            OpenGL.glCompileShaderARB(var4);
            OpenGL.glGetObjectParameterivARB(var4, 35713, class382.field5354, 0);
            if (~class382.field5354[0] == -1) {
               if (~class382.field5354[0] == -1) {
                  System.out.println(field10769[4]);
               }

               OpenGL.glGetObjectParameterivARB(var4, 35716, class382.field5354, 1);
               if (class382.field5354[1] > 1) {
                  byte[] var6 = new byte[class382.field5354[1]];
                  OpenGL.glGetInfoLogARB(var4, class382.field5354[1], class382.field5354, 0, var6, 0);
                  System.out.println(new String(var6));
               }

               if (~class382.field5354[0] == -1) {
                  OpenGL.glDeleteObjectARB(var4);
                  return null;
               }
            }

            return new class107(arg0, var4, arg3);
         } else {
            return null;
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field10769[3] + (arg0 != null ? field10769[1] : field10769[2]) + ',' + arg1 + ',' + (arg2 != null ? field10769[1] : field10769[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method5357(boolean arg0) {
      try {
         if (!arg0) {
            field10766 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10769[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5358(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ki",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5359(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 70;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
