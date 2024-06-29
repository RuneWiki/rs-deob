import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class224 {
   @OriginalMember(
      owner = "client!lc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3403 = new String[]{method1951(method1950("B~;\u00182")), method1951(method1950("B~;\u001e2")), method1951(method1950("B~;\u00192")), method1951(method1950("B~;\u001a2")), method1951(method1950("B~;\u001f2")), method1951(method1950("U3;ug")), method1951(method1950("@hy7")), method1951(method1950("}ut?\u007f\\=y2tEt{<:H||7\u007fJ'"))};
   @OriginalMember(
      owner = "client!lc",
      name = "b",
      descriptor = "I"
   )
   public static int field3397;
   @OriginalMember(
      owner = "client!lc",
      name = "f",
      descriptor = "I"
   )
   public static int field3399;
   @OriginalMember(
      owner = "client!lc",
      name = "e",
      descriptor = "I"
   )
   public static int field3400;
   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "I"
   )
   public static int field3402;
   @OriginalMember(
      owner = "client!lc",
      name = "c",
      descriptor = "J"
   )
   public static long field3398;
   @OriginalMember(
      owner = "client!lc",
      name = "d",
      descriptor = "Lpka;"
   )
   public static class143 field3401;

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(DI)V"
   )
   public static final void method1945(double arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         if (class207.field3140 != arg0) {
            int var4 = 0;
            int var5;
            if (var3) {
               var5 = (int)(255.0D * Math.pow((double)var4 / 255.0D, arg0));
               class571.field8457[var4] = ~var5 < -256 ? 255 : var5;
               ++var4;
            }

            while(true) {
               double var10000;
               if (var4 >= 256) {
                  var10000 = arg0;
                  if (!var3) {
                     class207.field3140 = arg0;
                     break;
                  }
               } else {
                  var10000 = 255.0D * Math.pow((double)var4 / 255.0D, arg0);
               }

               var5 = (int)var10000;
               class571.field8457[var4] = ~var5 < -256 ? 255 : var5;
               ++var4;
            }
         }

         ++field3399;
         int var6 = -51 / ((-24 - arg1) / 56);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field3403[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method1946(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lc",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method1947(byte arg0) {
      try {
         if (arg0 < -91) {
            field3401 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3403[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1948(int arg0, int arg1, int arg2) {
      try {
         ++field3402;
         if (arg2 != 13981) {
            method1949(34, (class174)null, (class513[])null);
         }

         return class309.method2587(arg0, (byte)110, arg1) | (arg1 & 458752) != 0 || class8.method34(arg0, 0, arg1);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3403[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(ILcka;[Llf;)Lpo;"
   )
   public static final class739 method1949(int arg0, class174 arg1, class513[] arg2) {
      boolean var3 = client.field1786;

      try {
         ++field3400;
         int var4 = 0;
         if (var3) {
            if (arg2[var4] == null || ~arg2[var4].field7825 >= -1L) {
               return null;
            }

            ++var4;
         }

         while(true) {
            if (~var4 <= ~arg2.length) {
               long var5 = OpenGL.glCreateProgramObjectARB();
               int var7 = 0;
               if (var3) {
                  break;
               }

               if (var3) {
                  OpenGL.glAttachObjectARB(var5, arg2[var7].field7825);
                  ++var7;
               }

               while(true) {
                  while(~var7 > ~arg2.length) {
                     OpenGL.glAttachObjectARB(var5, arg2[var7].field7825);
                     ++var7;
                  }

                  OpenGL.glLinkProgramARB(var5);
                  OpenGL.glGetObjectParameterivARB(var5, 35714, class265.field4339, arg0);
                  if (!var3) {
                     if (class265.field4339[0] == 0) {
                        if (class265.field4339[0] == 0) {
                           System.out.println(field3403[7]);
                        }

                        OpenGL.glGetObjectParameterivARB(var5, 35716, class265.field4339, 1);
                        if (~class265.field4339[1] < -2) {
                           byte[] var8 = new byte[class265.field4339[1]];
                           OpenGL.glGetInfoLogARB(var5, class265.field4339[1], class265.field4339, 0, var8, 0);
                           System.out.println(new String(var8));
                        }

                        if (class265.field4339[0] == 0) {
                           int var9 = 0;
                           if (var3) {
                              OpenGL.glDetachObjectARB(var5, arg2[var9].field7825);
                              ++var9;
                           }

                           while(true) {
                              while(var9 < arg2.length) {
                                 OpenGL.glDetachObjectARB(var5, arg2[var9].field7825);
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

                     return new class739(arg1, var5, arg2);
                  }

                  ++var7;
               }
            }

            if (arg2[var4] == null || ~arg2[var4].field7825 >= -1L) {
               break;
            }

            ++var4;
         }

         return null;
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field3403[4] + arg0 + ',' + (arg1 != null ? field3403[5] : field3403[6]) + ',' + (arg2 != null ? field3403[5] : field3403[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1950(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1951(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 29;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 91;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
