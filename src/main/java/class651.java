import jaggl.OpenGL;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class651 extends class670 {
   @OriginalMember(
      owner = "client!aw",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9398 = new String[]{method4727(method4726("\u0004\u0019k\u000b\u0007")), method4727(method4726("\u0004\u0019k\n\u0007")), method4727(method4726("\u0004\u0019k\f\u0007")), method4727(method4726("\u0004\u0019k\u000f\u0007")), method4727(method4726("\u0004\u0019k\b\u0007")), method4727(method4726("\u0004\u0019k\t\u0007")), method4727(method4726("\u0004\u0019k\u0004\u0007")), method4727(method4726("\u0004\u0019k\u0005\u0007")), method4727(method4726("\u000b\u001b)!")), method4727(method4726("\u0004\u0019k\u000e\u0007")), method4727(method4726("\u001e@kcR")), method4727(method4726("6\u0006$)J\u0017N)$A\u000e\u0007+*\u000f\u0003\u000f,!J\u0001T"))};
   @OriginalMember(
      owner = "client!aw",
      name = "G",
      descriptor = "[Lica;"
   )
   public static class354[] field9384 = new class354[2048];
   @OriginalMember(
      owner = "client!aw",
      name = "F",
      descriptor = "I"
   )
   public static int field9393 = 0;
   @OriginalMember(
      owner = "client!aw",
      name = "u",
      descriptor = "I"
   )
   public static int field9395 = 0;
   @OriginalMember(
      owner = "client!aw",
      name = "A",
      descriptor = "I"
   )
   public static int field9381;
   @OriginalMember(
      owner = "client!aw",
      name = "y",
      descriptor = "I"
   )
   public int field9382;
   @OriginalMember(
      owner = "client!aw",
      name = "E",
      descriptor = "I"
   )
   public static int field9385;
   @OriginalMember(
      owner = "client!aw",
      name = "r",
      descriptor = "I"
   )
   public static int field9386;
   @OriginalMember(
      owner = "client!aw",
      name = "x",
      descriptor = "I"
   )
   public static int field9387;
   @OriginalMember(
      owner = "client!aw",
      name = "w",
      descriptor = "I"
   )
   public int field9388;
   @OriginalMember(
      owner = "client!aw",
      name = "C",
      descriptor = "I"
   )
   public static int field9389;
   @OriginalMember(
      owner = "client!aw",
      name = "z",
      descriptor = "I"
   )
   public int field9390;
   @OriginalMember(
      owner = "client!aw",
      name = "t",
      descriptor = "I"
   )
   public static int field9391;
   @OriginalMember(
      owner = "client!aw",
      name = "H",
      descriptor = "I"
   )
   public static int field9392;
   @OriginalMember(
      owner = "client!aw",
      name = "v",
      descriptor = "I"
   )
   public int field9394;
   @OriginalMember(
      owner = "client!aw",
      name = "s",
      descriptor = "I"
   )
   public static int field9396;
   @OriginalMember(
      owner = "client!aw",
      name = "q",
      descriptor = "I"
   )
   public static int field9397;
   @OriginalMember(
      owner = "client!aw",
      name = "B",
      descriptor = "J"
   )
   public long field9380;
   @OriginalMember(
      owner = "client!aw",
      name = "D",
      descriptor = "[Lbaa;"
   )
   public static class109[] field9383;

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "([Lim;Lc;I)Low;",
      line = 7
   )
   public static final class789 method4722(class86[] arg0, class652 arg1, int arg2) {
      try {
         ++field9392;
         if (arg2 != -2830) {
            field9397 = 110;
         }

         for(int var3 = 0; var3 < arg0.length; ++var3) {
            if (arg0[var3] == null || arg0[var3].field1254 <= 0L) {
               return null;
            }
         }

         long var4 = OpenGL.glCreateProgramObjectARB();

         for(int var6 = 0; arg0.length > var6; ++var6) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field1254);
         }

         OpenGL.glLinkProgramARB(var4);
         OpenGL.glGetObjectParameterivARB(var4, 35714, class258.field4043, 0);
         if (class258.field4043[0] == 0) {
            if (class258.field4043[0] == 0) {
               System.out.println(field9398[11]);
            }

            OpenGL.glGetObjectParameterivARB(var4, 35716, class258.field4043, 1);
            if (class258.field4043[1] > 1) {
               byte[] var7 = new byte[class258.field4043[1]];
               OpenGL.glGetInfoLogARB(var4, class258.field4043[1], class258.field4043, 0, var7, 0);
               System.out.println(new String(var7));
            }

            if (class258.field4043[0] == 0) {
               for(int var8 = 0; ~var8 > ~arg0.length; ++var8) {
                  OpenGL.glDetachObjectARB(var4, arg0[var8].field1254);
               }

               OpenGL.glDeleteObjectARB(var4);
               return null;
            }
         }

         return new class789(arg1, var4, arg0);
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field9398[9] + (arg0 != null ? field9398[10] : field9398[8]) + ',' + (arg1 != null ? field9398[10] : field9398[8]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "g",
      descriptor = "(I)V",
      line = 77
   )
   public static void method4723(int arg0) {
      try {
         field9384 = null;
         if (arg0 != -1) {
            method4722((class86[])null, (class652)null, 13);
         }

         field9383 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9398[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "c",
      descriptor = "(I)I",
      line = 88
   )
   public final int method3790(int arg0) {
      try {
         ++field9389;
         if (arg0 != 8) {
            this.field9388 = -112;
         }

         return this.field9394;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9398[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "c",
      descriptor = "(B)J",
      line = 102
   )
   public final long method3791(byte arg0) {
      try {
         if (arg0 > -21) {
            method4723(23);
         }

         ++field9391;
         return this.field9380;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9398[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "h",
      descriptor = "(I)V",
      line = 114
   )
   public static final void method4724(int arg0) {
      boolean var1 = client.field1786;

      try {
         ++field9396;
         if (class751.field11144 == null) {
            int var2 = class16.field213;
            int var3 = class519.field7895;
            int var4 = -class316.field4878 + class155.field2322 - var2;
            int var5 = class145.field2067 - class692.field10301 - var3;
            if (arg0 > ~var2 || ~var4 < -1 || var3 > 0 || ~var5 < -1) {
               try {
                  Container var6;
                  label53: {
                     if (class479.field7289 == null) {
                        if (class684.field10176 == null) {
                           var6 = class92.field1327;
                           if (!var1) {
                              break label53;
                           }
                        }

                        var6 = class684.field10176;
                        if (!var1) {
                           break label53;
                        }
                     }

                     var6 = class479.field7289;
                  }

                  int var7 = 0;
                  int var8 = 0;
                  if (class479.field7289 == var6) {
                     Insets var9 = class479.field7289.getInsets();
                     var7 = var9.left;
                     var8 = var9.top;
                  }

                  Graphics var10 = var6.getGraphics();
                  var10.setColor(Color.black);
                  if (~var2 < -1) {
                     var10.fillRect(var7, var8, var2, class145.field2067);
                  }

                  if (var3 > 0) {
                     var10.fillRect(var7, var8, class155.field2322, var3);
                  }

                  if (~var4 < -1) {
                     var10.fillRect(class155.field2322 + var7 + -var4, var8, var4, class145.field2067);
                  }

                  if (var5 > 0) {
                     var10.fillRect(var7, class145.field2067 + var8 - var5, class155.field2322, var5);
                     return;
                  }
               } catch (Exception var12) {
                  return;
               }
            }

         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field9398[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "b",
      descriptor = "(B)I",
      line = 180
   )
   public final int method3792(byte arg0) {
      try {
         ++field9385;
         if (arg0 <= 97) {
            this.method3789(-42);
         }

         return this.field9388;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9398[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "(I)I",
      line = 194
   )
   public final int method3789(int arg0) {
      try {
         if (arg0 >= -31) {
            this.field9388 = -111;
         }

         ++field9386;
         return this.field9390;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9398[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "b",
      descriptor = "(I)I",
      line = 213
   )
   public final int method3793(int arg0) {
      try {
         if (arg0 != 1) {
            return -41;
         } else {
            ++field9387;
            return this.field9382;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9398[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "(ZII)I",
      line = 231
   )
   public static final int method4725(boolean arg0, int arg1, int arg2) {
      boolean var3 = client.field1786;

      try {
         ++field9381;
         if (arg0) {
            return 0;
         } else {
            class503 var4 = class291.method2454(arg0, (byte)-26, arg2);
            if (var4 == null) {
               return class639.field9250.method3982(89, arg2).field3798;
            } else if (arg1 <= 79) {
               return 93;
            } else {
               int var5 = 0;
               int var6 = 0;
               if (var3) {
                  if (var4.field7680[var6] == -1) {
                     ++var5;
                  }

                  ++var6;
               }

               while(true) {
                  while(var4.field7680.length > var6) {
                     if (var4.field7680[var6] == -1) {
                        ++var5;
                     }

                     ++var6;
                  }

                  var5 += class639.field9250.method3982(120, arg2).field3798 - var4.field7680.length;
                  if (!var3) {
                     return var5;
                  }

                  if (var5 == -1) {
                     ++var5;
                  }

                  ++var6;
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field9398[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4726(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4727(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
