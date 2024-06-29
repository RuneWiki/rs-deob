import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class672 extends class141 {
   @OriginalMember(
      owner = "client!ph",
      name = "x",
      descriptor = "Laq;"
   )
   private class172 field9745;
   @OriginalMember(
      owner = "client!ph",
      name = "o",
      descriptor = "Lls;"
   )
   private class151 field9744;
   @OriginalMember(
      owner = "client!ph",
      name = "p",
      descriptor = "Z"
   )
   private boolean field9733;
   @OriginalMember(
      owner = "client!ph",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9750 = new String[]{method4892(method4891("3\u000f\u001f\u001a")), method4892(method4891("\u000e\u0012\u0012\u0012\u001b/Z\u001f\u001f\u00106\u0013\u001d\u0011^;\u001b\u001a\u001a\u001b9@")), method4892(method4891("-\u0012]<V")), method4892(method4891("&T]X\u0003")), method4892(method4891(".\u000f\u001d3\u0006-\u0015\u001d\u0013\u0010)")), method4892(method4891(".\u000f\u001d2\u0017/")), method4892(method4891("8\u0014\u0005;\u001f-)\u0012\u001b\u000e1\u001f\u0001")), method4892(method4891("3\u0015\u0001\u001b\u001f1)\u0012\u001b\u000e1\u001f\u0001")), method4892(method4891(".\u000f\u001d5\u00111\u0015\u0006\u0004")), method4892(method4891("-\u0012]1V")), method4892(method4891("-\u0012]0V")), method4892(method4891("-\u0012]4V")), method4892(method4891("-\u0012]?V")), method4892(method4891("?\b\u0016\u0017\u0015\n\u001b\u0007\u0013\f\u0019\u001f\u0003\u0002\u0016")), method4892(method4891("-\u0012]2V")), method4892(method4891(")\u0013\u001e\u0013")), method4892(method4891(".\u0019\u0012\u001a\u001b")), method4892(method4891("?\b\u0016\u0017\u0015\n\u001b\u0007\u0013\f\u0012\u001c\u0015\u0005\u001b)")), method4892(method4891("-\u0012]5V")), method4892(method4891("-\u0012]7V")), method4892(method4891(":\u0016")), method4892(method4891("8\u0014\u0005\u001f\f2\u0014\u001e\u0013\u0010)%\u001e\u0017\u000e-\u001f\u0017)\t<\u000e\u0016\u0004!+")), method4892(method4891("-\u0012]J\u00173\u0013\u0007HV")), method4892(method4891("8\u0014\u0005\u001f\f2\u0014\u001e\u0013\u0010)%\u001e\u0017\u000e-\u001f\u0017)\t<\u000e\u0016\u0004!;")), method4892(method4891("-\u0012]>V")), method4892(method4891("-\u0012]3V"))};
   @OriginalMember(
      owner = "client!ph",
      name = "z",
      descriptor = "F"
   )
   public static float field9748;
   @OriginalMember(
      owner = "client!ph",
      name = "C",
      descriptor = "I"
   )
   public static int field9734;
   @OriginalMember(
      owner = "client!ph",
      name = "m",
      descriptor = "I"
   )
   public static int field9735;
   @OriginalMember(
      owner = "client!ph",
      name = "t",
      descriptor = "I"
   )
   public static int field9737;
   @OriginalMember(
      owner = "client!ph",
      name = "u",
      descriptor = "I"
   )
   public static int field9738;
   @OriginalMember(
      owner = "client!ph",
      name = "A",
      descriptor = "I"
   )
   public static int field9739;
   @OriginalMember(
      owner = "client!ph",
      name = "w",
      descriptor = "I"
   )
   public static int field9740;
   @OriginalMember(
      owner = "client!ph",
      name = "n",
      descriptor = "I"
   )
   public static int field9741;
   @OriginalMember(
      owner = "client!ph",
      name = "q",
      descriptor = "I"
   )
   public static int field9743;
   @OriginalMember(
      owner = "client!ph",
      name = "s",
      descriptor = "I"
   )
   public static int field9746;
   @OriginalMember(
      owner = "client!ph",
      name = "B",
      descriptor = "I"
   )
   public static int field9749;
   @OriginalMember(
      owner = "client!ph",
      name = "v",
      descriptor = "Lkf;"
   )
   public static class266 field9747;
   @OriginalMember(
      owner = "client!ph",
      name = "r",
      descriptor = "Z"
   )
   private boolean field9742;
   @OriginalMember(
      owner = "client!ph",
      name = "y",
      descriptor = "[Lbg;"
   )
   public static class492[] field9736;

   @OriginalMember(
      owner = "client!ph",
      name = "f",
      descriptor = "(B)V",
      line = 9
   )
   public final void method307(byte arg0) {
      try {
         ++field9739;
         if (arg0 <= 102) {
            this.method309(true, true);
         }

         if (this.field9742) {
            super.field1801.method2763(1, -124);
            super.field1801.method2804((class205)null, -2);
            super.field1801.method2763(0, -116);
            super.field1801.method2804((class205)null, -2);
            OpenGL.glUseProgramObjectARB(0L);
            this.field9742 = false;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9750[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "a",
      descriptor = "(Lm;II)V",
      line = 31
   )
   public final void method310(class205 arg0, int arg1, int arg2) {
      try {
         ++field9746;
         if (arg2 != 0) {
            field9736 = null;
         }

         if (!this.field9742) {
            super.field1801.method2804(arg0, -2);
            super.field1801.method2747((byte)-115, arg1);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field9750[11] + (arg0 != null ? field9750[3] : field9750[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "a",
      descriptor = "(Z)Z",
      line = 48
   )
   public final boolean method313(boolean arg0) {
      try {
         ++field9749;
         if (!arg0) {
            this.method307((byte)32);
         }

         return this.field9733;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9750[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "a",
      descriptor = "(III)V",
      line = 61
   )
   public final void method317(int arg0, int arg1, int arg2) {
      try {
         if (this.field9742) {
            int var4 = 1 << (arg2 & 3);
            float var5 = (float)(1 << (arg2 >> 3 & 7)) / 32.0F;
            int var6 = 65535 & arg1;
            float var7 = (float)(arg1 >> 16 & 3) / 8.0F;
            long var8 = this.field9744.field2110;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field9750[15]), (float)(super.field1801.field5301 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field9750[16]), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field9750[13]), (float)var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field9750[17]), var7);
         }

         ++field9737;
         if (arg0 != 0) {
            field9740 = 25;
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field9750[14] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "<init>",
      descriptor = "(Lwi;Lkf;Laq;)V",
      line = 89
   )
   public class672(class494 arg0, class266 arg1, class172 arg2) {
      super(arg0);

      try {
         this.field9745 = arg2;
         if (arg1 != null && arg0.field7164 && arg0.field7159) {
            class653 var4 = class32.method287(false, 35633, arg1.method2032(field9750[21], (byte)-72, field9750[20]), arg0);
            class653 var5 = class32.method287(false, 35632, arg1.method2032(field9750[23], (byte)-72, field9750[20]), arg0);
            this.field9744 = class441.method3247(0, new class653[]{var4, var5}, arg0);
            this.field9733 = this.field9744 != null && this.field9745.method1398(-65);
         } else {
            this.field9733 = false;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field9750[22] + (arg0 != null ? field9750[3] : field9750[0]) + ',' + (arg1 != null ? field9750[3] : field9750[0]) + ',' + (arg2 != null ? field9750[3] : field9750[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "a",
      descriptor = "(ZZ)V",
      line = 111
   )
   public final void method311(boolean arg0, boolean arg1) {
      try {
         if (arg0) {
            this.method317(-20, -44, -112);
         }

         ++field9738;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9750[18] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "a",
      descriptor = "(IIB)V",
      line = 121
   )
   public static final void method4887(int arg0, int arg1, byte arg2) {
      try {
         ++field9743;
         if (arg2 == 45) {
            class755 var3 = class317.method2325((long)arg1, arg2 + 60, 7);
            var3.method5479(1288);
            var3.field11184 = arg0;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field9750[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "a",
      descriptor = "([Ltc;ILea;)Lvv;",
      line = 136
   )
   public static final class345 method4888(class373[] arg0, int arg1, class573 arg2) {
      boolean var3 = client.field4360;

      try {
         ++field9741;
         int var4 = 0;
         if (var3) {
            if (arg0[var4] == null || ~arg0[var4].field5403 >= -1L) {
               return null;
            }

            ++var4;
         }

         while(true) {
            while(~arg0.length < ~var4) {
               if (arg0[var4] == null || ~arg0[var4].field5403 >= -1L) {
                  return null;
               }

               ++var4;
            }

            if (!var3) {
               if (arg1 <= 109) {
                  field9748 = 0.12821266F;
               }

               long var5 = OpenGL.glCreateProgramObjectARB();
               int var7 = 0;
               if (var3) {
                  OpenGL.glAttachObjectARB(var5, arg0[var7].field5403);
                  ++var7;
               }

               while(true) {
                  while(var7 < arg0.length) {
                     OpenGL.glAttachObjectARB(var5, arg0[var7].field5403);
                     ++var7;
                  }

                  OpenGL.glLinkProgramARB(var5);
                  OpenGL.glGetObjectParameterivARB(var5, 35714, class374.field5413, 0);
                  if (!var3) {
                     if (~class374.field5413[0] == -1) {
                        if (class374.field5413[0] == 0) {
                           System.out.println(field9750[1]);
                        }

                        OpenGL.glGetObjectParameterivARB(var5, 35716, class374.field5413, 1);
                        if (class374.field5413[1] > 1) {
                           byte[] var8 = new byte[class374.field5413[1]];
                           OpenGL.glGetInfoLogARB(var5, class374.field5413[1], class374.field5413, 0, var8, 0);
                           System.out.println(new String(var8));
                        }

                        if (class374.field5413[0] == 0) {
                           int var9 = 0;
                           if (var3) {
                              OpenGL.glDetachObjectARB(var5, arg0[var9].field5403);
                              ++var9;
                           }

                           while(true) {
                              while(~var9 > ~arg0.length) {
                                 OpenGL.glDetachObjectARB(var5, arg0[var9].field5403);
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

                     return new class345(arg2, var5, arg0);
                  }

                  ++var7;
               }
            }

            if (arg1 >= 0) {
               return null;
            }

            ++var4;
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field9750[2] + (arg0 != null ? field9750[3] : field9750[0]) + ',' + arg1 + ',' + (arg2 != null ? field9750[3] : field9750[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "b",
      descriptor = "(ZZ)V",
      line = 204
   )
   public final void method309(boolean arg0, boolean arg1) {
      try {
         if (arg0) {
            this.method310((class205)null, 30, 65);
         }

         ++field9734;
         class349 var3 = super.field1801.method2779(66);
         if (this.field9733 && var3 != null) {
            super.field1801.method2763(1, -47);
            super.field1801.method2804(var3, -2);
            super.field1801.method2763(0, -117);
            super.field1801.method2804(this.field9745.field2386, -2);
            long var4 = this.field9744.field2110;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field9750[7]), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field9750[6]), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, field9750[5]), -super.field1801.field5338[0], -super.field1801.field5338[1], -super.field1801.field5338[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, field9750[8]), super.field1801.field5296, super.field1801.field5322, super.field1801.field5283, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, field9750[4]), 928.0F * Math.abs(super.field1801.field5338[1]) + 96.0F);
            this.field9742 = true;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field9750[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "b",
      descriptor = "(I)V",
      line = 234
   )
   public static void method4889(int arg0) {
      try {
         if (arg0 <= 84) {
            method4888((class373[])null, 45, (class573)null);
         }

         field9736 = null;
         field9747 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9750[25] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "a",
      descriptor = "(II)V",
      line = 248
   )
   public static final void method4890(int arg0, int arg1) {
      try {
         int var2 = 59 % ((arg1 - 23) / 51);
         ++field9735;
         if (class147.field1874 == null || arg0 > class147.field1874.length) {
            class147.field1874 = new int[arg0];
         }

      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9750[24] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4891(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 126);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ph",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4892(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 115;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 126;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
