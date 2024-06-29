import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public class class32 extends class76 {
   @OriginalMember(
      owner = "client!iha",
      name = "O",
      descriptor = "I"
   )
   public int field463;
   @OriginalMember(
      owner = "client!iha",
      name = "G",
      descriptor = "I"
   )
   public int field458;
   @OriginalMember(
      owner = "client!iha",
      name = "P",
      descriptor = "Z"
   )
   public boolean field468;
   @OriginalMember(
      owner = "client!iha",
      name = "C",
      descriptor = "J"
   )
   public long field465;
   @OriginalMember(
      owner = "client!iha",
      name = "K",
      descriptor = "Ljava/lang/String;"
   )
   public String field459;
   @OriginalMember(
      owner = "client!iha",
      name = "F",
      descriptor = "Z"
   )
   public boolean field469;
   @OriginalMember(
      owner = "client!iha",
      name = "N",
      descriptor = "Ljava/lang/String;"
   )
   public String field471;
   @OriginalMember(
      owner = "client!iha",
      name = "z",
      descriptor = "J"
   )
   public long field456;
   @OriginalMember(
      owner = "client!iha",
      name = "I",
      descriptor = "I"
   )
   public int field462;
   @OriginalMember(
      owner = "client!iha",
      name = "L",
      descriptor = "Z"
   )
   public boolean field461;
   @OriginalMember(
      owner = "client!iha",
      name = "D",
      descriptor = "I"
   )
   public int field457;
   @OriginalMember(
      owner = "client!iha",
      name = "Q",
      descriptor = "I"
   )
   public int field460;
   @OriginalMember(
      owner = "client!iha",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field472 = new String[]{method292(method291("G\u001d\u001a\u001a")), method292(method291("@\u0000\u0017Xo\u0001")), method292(method291("z\u0000\u0017\u0012O[H\u0015\u0019GY\u0001\u001a\u0013\nO\t\u001f\u001aOMR")), method292(method291("RFXXW")), method292(method291("@\u0000\u0017Xh\u0001")), method292(method291("@\u0000\u0017Xi\u0001")), method292(method291("@\u0000\u0017Xk\u0001")), method292(method291("@\u0000\u0017X\u0016@\u0006\u001f\u0002\u0014\u0001"))};
   @OriginalMember(
      owner = "client!iha",
      name = "B",
      descriptor = "I"
   )
   public static int field455;
   @OriginalMember(
      owner = "client!iha",
      name = "J",
      descriptor = "I"
   )
   public static int field464;
   @OriginalMember(
      owner = "client!iha",
      name = "A",
      descriptor = "I"
   )
   public static int field466;
   @OriginalMember(
      owner = "client!iha",
      name = "M",
      descriptor = "I"
   )
   public static int field470;
   @OriginalMember(
      owner = "client!iha",
      name = "E",
      descriptor = "Ljava/lang/String;"
   )
   public String field467;

   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "(Lgn;)V"
   )
   public static final void method286(class731 arg0) {
      if (arg0 != null) {
         for(int var1 = 0; var1 < 2; ++var1) {
            class731 var2 = null;

            for(class731 var3 = class591.field8705[var1]; var3 != null; var3 = var3.field10695) {
               if (arg0 == var3) {
                  if (var2 != null) {
                     var2.field10695 = var3.field10695;
                  } else {
                     class591.field8705[var1] = var3.field10695;
                  }

                  class171.field2384 = true;
                  return;
               }

               var2 = var3;
            }

            class731 var4 = null;

            for(class731 var5 = class392.field5677[var1]; var5 != null; var5 = var5.field10695) {
               if (arg0 == var5) {
                  if (var4 != null) {
                     var4.field10695 = var5.field10695;
                  } else {
                     class392.field5677[var1] = var5.field10695;
                  }

                  class171.field2384 = true;
                  return;
               }

               var4 = var5;
            }

            class731 var6 = null;

            for(class731 var7 = class756.field11204[var1]; var7 != null; var7 = var7.field10695) {
               if (arg0 == var7) {
                  if (var6 != null) {
                     var6.field10695 = var7.field10695;
                  } else {
                     class756.field11204[var1] = var7.field10695;
                  }

                  class171.field2384 = true;
                  return;
               }

               var6 = var7;
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "(ZI[BLwi;)Llha;"
   )
   public static final class653 method287(boolean arg0, int arg1, byte[] arg2, class494 arg3) {
      try {
         ++field455;
         if (arg2 != null && ~arg2.length != -1) {
            if (arg0) {
               return null;
            } else {
               long var4 = OpenGL.glCreateShaderObjectARB(arg1);
               OpenGL.glShaderSourceRawARB(var4, arg2);
               OpenGL.glCompileShaderARB(var4);
               OpenGL.glGetObjectParameterivARB(var4, 35713, class336.field4577, 0);
               if (~class336.field4577[0] == -1) {
                  if (class336.field4577[0] == 0) {
                     System.out.println(field472[2]);
                  }

                  OpenGL.glGetObjectParameterivARB(var4, 35716, class336.field4577, 1);
                  if (class336.field4577[1] > 1) {
                     byte[] var6 = new byte[class336.field4577[1]];
                     OpenGL.glGetInfoLogARB(var4, class336.field4577[1], class336.field4577, 0, var6, 0);
                     System.out.println(new String(var6));
                  }

                  if (~class336.field4577[0] == -1) {
                     OpenGL.glDeleteObjectARB(var4);
                     return null;
                  }
               }

               return new class653(arg3, var4, arg1);
            }
         } else {
            return null;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field472[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field472[3] : field472[0]) + ',' + (arg3 != null ? field472[3] : field472[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method288(byte arg0) {
      try {
         ++field466;
         class630.field9241.method731(0);
         int var1 = -2 / ((78 - arg0) / 35);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field472[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "d",
      descriptor = "(B)V"
   )
   public static final void method289(byte arg0) {
      try {
         ++field464;
         class206.field2957 = new class32(class180.field2483.method1437(class608.field8920, 50), "", class146.field1843, 1012, -1, 0L, 0, 0, true, false, 0L, true);
         if (arg0 == 110) {
            ;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field472[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method290(int arg0) {
      boolean var1 = client.field4360;

      try {
         if (class383.field5543 != null) {
            if (class681.field10034) {
               class311.method2299(-117);
            }

            class146.field1851.method2008(true);
            class29.method268();
            class188.method1492(-1);
            class399.method3006((byte)66);
            class52.method410(-25933);
            class253.method1935((byte)105);
            if (class566.field8064 != null) {
               class566.field8064.method3886(false);
            }

            class303.method2249(5041);
            class84.method750(-127);
            class274.method2091(19963);
            class20.method122(false);
            class389.method2954(false, (byte)-107);
            int var2 = 0;
            if (var1 || ~var2 > -2049) {
               do {
                  class121 var3 = class380.field5483[var2];
                  if (var3 == null) {
                     ++var2;
                  } else {
                     int var4 = 0;
                     if (var1) {
                        var3.field3882[var4] = null;
                        ++var4;
                     }

                     while(var4 < var3.field3882.length) {
                        var3.field3882[var4] = null;
                        ++var4;
                     }

                     ++var2;
                  }
               } while(~var2 > -2049);
            }

            int var5 = 0;
            if (var1 || class213.field3041 > var5) {
               do {
                  class506 var6 = class566.field8074[var5].field7559;
                  if (var6 == null) {
                     ++var5;
                  } else {
                     int var7 = 0;
                     if (var1) {
                        var6.field3882[var7] = null;
                        ++var7;
                     }

                     while(var6.field3882.length > var7) {
                        var6.field3882[var7] = null;
                        ++var7;
                     }

                     ++var5;
                  }
               } while(class213.field3041 > var5);
            }

            class405.field5861 = null;
            class89.field1160 = null;
            class383.field5543.method567((byte)-125);
            class383.field5543 = null;
         }

         ++field470;
         int var8 = 93 % ((20 - arg0) / 58);
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field472[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V"
   )
   public class32(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
      try {
         this.field463 = arg4;
         this.field458 = arg3;
         this.field468 = arg11;
         this.field465 = arg10;
         this.field459 = arg0;
         this.field469 = arg8;
         this.field471 = arg1;
         this.field456 = arg5;
         this.field462 = arg2;
         this.field461 = arg9;
         this.field457 = arg6;
         this.field460 = arg7;
      } catch (RuntimeException var16) {
         throw class237.method1823(var16, field472[7] + (arg0 != null ? field472[3] : field472[0]) + ',' + (arg1 != null ? field472[3] : field472[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method291(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method292(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 41;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
