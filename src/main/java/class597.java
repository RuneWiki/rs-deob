import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class597 {
   @OriginalMember(
      owner = "client!cda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8828 = new String[]{method4447(method4446("ad|fC@,qkHYese\u0006TmtnCV6")), method4447(method4446("\\yqn")), method4447(method4446("Qh|,g\u001a")), method4447(method4446("I\"3,[")), method4447(method4446("Qh|,d\u001a"))};
   @OriginalMember(
      owner = "client!cda",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field8823 = false;
   @OriginalMember(
      owner = "client!cda",
      name = "c",
      descriptor = "I"
   )
   public static int field8825 = 0;
   @OriginalMember(
      owner = "client!cda",
      name = "d",
      descriptor = "I"
   )
   public static int field8826;
   @OriginalMember(
      owner = "client!cda",
      name = "a",
      descriptor = "I"
   )
   public static int field8827;
   @OriginalMember(
      owner = "client!cda",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field8824;

   @OriginalMember(
      owner = "client!cda",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4444(int arg0) {
      try {
         field8824 = null;
         if (arg0 != -6692) {
            method4444(-37);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8828[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cda",
      name = "a",
      descriptor = "(Liu;B[Llj;)Lua;"
   )
   public static final class666 method4445(class530 arg0, byte arg1, class8[] arg2) {
      boolean var3 = client.field1481;

      try {
         ++field8826;
         int var4 = 0;
         if (var3) {
            if (arg2[var4] == null || ~arg2[var4].field100 >= -1L) {
               return null;
            }

            ++var4;
         }

         while(true) {
            if (arg2.length <= var4) {
               long var5 = OpenGL.glCreateProgramObjectARB();
               int var7 = 0;
               if (var3) {
                  break;
               }

               if (var3) {
                  OpenGL.glAttachObjectARB(var5, arg2[var7].field100);
                  ++var7;
               }

               while(true) {
                  while(arg2.length > var7) {
                     OpenGL.glAttachObjectARB(var5, arg2[var7].field100);
                     ++var7;
                  }

                  OpenGL.glLinkProgramARB(var5);
                  if (!var3) {
                     if (arg1 > -88) {
                        method4444(71);
                     }

                     OpenGL.glGetObjectParameterivARB(var5, 35714, class495.field6913, 0);
                     if (class495.field6913[0] == 0) {
                        if (~class495.field6913[0] == -1) {
                           System.out.println(field8828[0]);
                        }

                        OpenGL.glGetObjectParameterivARB(var5, 35716, class495.field6913, 1);
                        if (class495.field6913[1] > 1) {
                           byte[] var8 = new byte[class495.field6913[1]];
                           OpenGL.glGetInfoLogARB(var5, class495.field6913[1], class495.field6913, 0, var8, 0);
                           System.out.println(new String(var8));
                        }

                        if (~class495.field6913[0] == -1) {
                           int var9 = 0;
                           if (var3) {
                              OpenGL.glDetachObjectARB(var5, arg2[var9].field100);
                              ++var9;
                           }

                           while(true) {
                              while(var9 < arg2.length) {
                                 OpenGL.glDetachObjectARB(var5, arg2[var9].field100);
                                 ++var9;
                              }

                              OpenGL.glDeleteObjectARB(var5);
                              if (!var3) {
                                 return null;
                              }

                              ++var9;
                           }
                        }
                     }

                     return new class666(arg0, var5, arg2);
                  }

                  ++var7;
               }
            }

            if (arg2[var4] == null || ~arg2[var4].field100 >= -1L) {
               break;
            }

            ++var4;
         }

         return null;
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field8828[2] + (arg0 != null ? field8828[3] : field8828[1]) + ',' + arg1 + ',' + (arg2 != null ? field8828[3] : field8828[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4446(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4447(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 29;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
