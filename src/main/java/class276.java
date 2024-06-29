import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class276 {
   @OriginalMember(
      owner = "client!rh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3904 = new String[]{method2171(method2170(";8\u001aU&")), method2171(method2170("2~\u001a9s")), method2171(method2170(".cX\u0017")), method2171(method2170("\u0013~U\u001f>26X\u00125+\u007fZ\u001c{&w]\u0017>$,")), method2171(method2170("2~\u001a8s"))};
   @OriginalMember(
      owner = "client!rh",
      name = "d",
      descriptor = "I"
   )
   public static int field3900 = 0;
   @OriginalMember(
      owner = "client!rh",
      name = "b",
      descriptor = "[[I"
   )
   public static int[][] field3901 = new int[][]{{0, 2}, {0, 2}, {0, 0, 2}, {2, 0, 0}, {0, 2, 0}, {0, 0, 2}, {0, 5, 1, 4}, {0, 4, 4, 4}, {4, 4, 4, 0}, {6, 6, 6, 2, 2, 2}, {2, 2, 2, 6, 6, 6}, {0, 11, 6, 6, 6, 4}, {0, 2}, {0, 4, 4, 4}, {0, 4, 4, 4}};
   @OriginalMember(
      owner = "client!rh",
      name = "a",
      descriptor = "I"
   )
   public static int field3902;
   @OriginalMember(
      owner = "client!rh",
      name = "c",
      descriptor = "I"
   )
   public static int field3903;

   @OriginalMember(
      owner = "client!rh",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2167(byte arg0) {
      try {
         field3901 = null;
         if (arg0 != -31) {
            method2168(24, -27);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3904[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rh",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method2168(int arg0, int arg1) {
      return class569.field8236 != null ? class569.field8236[arg0][arg1] & 65535 : 0;
   }

   @OriginalMember(
      owner = "client!rh",
      name = "a",
      descriptor = "(Z[Lpaa;Lbba;)Lik;"
   )
   public static final class219 method2169(boolean arg0, class648[] arg1, class124 arg2) {
      boolean var3 = client.field4564;

      try {
         ++field3903;
         int var4 = 0;
         if (var3) {
            if (arg1[var4] == null || ~arg1[var4].field9410 >= -1L) {
               return null;
            }

            ++var4;
         }

         while(true) {
            if (~arg1.length >= ~var4) {
               long var5 = OpenGL.glCreateProgramObjectARB();
               int var7 = 0;
               if (var3) {
                  break;
               }

               if (var3) {
                  OpenGL.glAttachObjectARB(var5, arg1[var7].field9410);
                  ++var7;
               }

               while(true) {
                  while(var7 < arg1.length) {
                     OpenGL.glAttachObjectARB(var5, arg1[var7].field9410);
                     ++var7;
                  }

                  OpenGL.glLinkProgramARB(var5);
                  OpenGL.glGetObjectParameterivARB(var5, 35714, class203.field3035, 0);
                  if (!var3) {
                     if (~class203.field3035[0] == -1) {
                        if (class203.field3035[0] == 0) {
                           System.out.println(field3904[3]);
                        }

                        OpenGL.glGetObjectParameterivARB(var5, 35716, class203.field3035, 1);
                        if (~class203.field3035[1] < -2) {
                           byte[] var8 = new byte[class203.field3035[1]];
                           OpenGL.glGetInfoLogARB(var5, class203.field3035[1], class203.field3035, 0, var8, 0);
                           System.out.println(new String(var8));
                        }

                        if (class203.field3035[0] == 0) {
                           int var9 = 0;
                           if (var3) {
                              OpenGL.glDetachObjectARB(var5, arg1[var9].field9410);
                              ++var9;
                           }

                           while(true) {
                              while(var9 < arg1.length) {
                                 OpenGL.glDetachObjectARB(var5, arg1[var9].field9410);
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

                     if (arg0) {
                        field3902 = 76;
                     }

                     return new class219(arg2, var5, arg1);
                  }

                  ++var7;
               }
            }

            if (arg1[var4] == null || ~arg1[var4].field9410 >= -1L) {
               break;
            }

            ++var4;
         }

         return null;
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field3904[1] + arg0 + ',' + (arg1 != null ? field3904[0] : field3904[2]) + ',' + (arg2 != null ? field3904[0] : field3904[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2170(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2171(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 64;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 123;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
