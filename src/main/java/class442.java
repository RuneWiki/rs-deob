import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class442 {
   @OriginalMember(
      owner = "client!un",
      name = "h",
      descriptor = "Lrk;"
   )
   private class35 field6454;
   @OriginalMember(
      owner = "client!un",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6457 = new String[]{method3331(method3330("XqR}7")), method3331(method3330("V1Ro#M6\bmb")), method3331(method3330("M*\u0010?")), method3331(method3330("V1R\u0011b")), method3331(method3330("P>\u0011#&F\f\u0015)/")), method3331(method3330("Q<\f\u0001/O6\u00195")), method3331(method3330("K:\u00154\"W\u0012\u001d#")), method3331(method3330("V1R\u0012b")), method3331(method3330("V1R\u0017b")), method3331(method3330("V1\u00155%Q2\\5&L>\bs8@/.6&J:\u001ah@V1\u00155%Q2\\%/@m\\ +N/\u00106\u0019J%\u0019h@V1\u00155%Q2\\ +N/\u001068\u0010\u001b\\;/J8\u0014'\u0007B/GY<L6\u0018s'B6\u0012{c\u0003$v5&L>\bs.[\u007fAs>F'\b&8Fl8{\"F6\u001b;>n>\f\u007fjU:\u001f`b\u000e,\u001d>:O:/:0Fq\u0004\u007fj\u0013qL\u007fj\u0013qLzaD3#\u0007/[\u001c\u0013<8G\u0004L\u000ed[&\u0006zdQ\u007fQs>F'\b&8Fl8{\"F6\u001b;>n>\f\u007fjU:\u001f`bP>\u0011#&F\f\u0015)/\r'Psz\roPsz\roUx-O\u0000(62`0\u0013!.xo!}2Z%U}8\u0018U\u001a?%B+\\73\u0003b\\'/[+\t!/\u0010\u001bT;/J8\u0014'\u0007B/Ps<F<O{z\roPsgP>\u0011#&F\f\u0015)/\r&Psz\roUx-O\u0000(62`0\u0013!.xo!}2Z%U}8\u0003r\\'/[+\t!/\u0010\u001bT;/J8\u0014'\u0007B/Ps<F<O{z\roPs9B2\f?/p6\u00066dZs\\cd\u0013vW4&|\u000b\u0019+\tL0\u000e7\u0011\u0013\u0002R+3YvR!q)8\u0010\f\fQ>\u001b\u0010%O0\u000esw\u0003)\u00190~\u000boRfaM0\u000e>+O6\u00066bU:\u001f`bG'Ps.Zs\\!)S\r\u0019?#F9Uz`\u0013qI\u007fjW:\u0004'?Q:O\u0017bK:\u00154\"W\u0012\u001d#f\u00038\u0010\f\u001eF'?<%Q;'c\u0017\r'\u0005)c\r-Uh@^U")), method3331(method3330("V1R\u0016b")), method3331(method3330("V1R\u0010b"))};
   @OriginalMember(
      owner = "client!un",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field6446 = new int[2048];
   @OriginalMember(
      owner = "client!un",
      name = "g",
      descriptor = "I"
   )
   public static int field6447 = 0;
   @OriginalMember(
      owner = "client!un",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field6452 = false;
   @OriginalMember(
      owner = "client!un",
      name = "i",
      descriptor = "I"
   )
   public static int field6449;
   @OriginalMember(
      owner = "client!un",
      name = "c",
      descriptor = "I"
   )
   public static int field6450;
   @OriginalMember(
      owner = "client!un",
      name = "b",
      descriptor = "I"
   )
   public static int field6451;
   @OriginalMember(
      owner = "client!un",
      name = "f",
      descriptor = "I"
   )
   public static int field6455;
   @OriginalMember(
      owner = "client!un",
      name = "a",
      descriptor = "I"
   )
   public static int field6456;
   @OriginalMember(
      owner = "client!un",
      name = "d",
      descriptor = "Lud;"
   )
   private class39 field6453;
   @OriginalMember(
      owner = "client!un",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field6448;

   @OriginalMember(
      owner = "client!un",
      name = "b",
      descriptor = "(I)Z",
      line = 4
   )
   public final boolean method3325(int arg0) {
      try {
         ++field6450;
         if (this.field6454.field771 && this.field6454.field837 && this.field6453 == null) {
            class366 var2 = class383.method2979(this.field6454, 12203, 35632, field6457[9]);
            if (var2 != null) {
               this.field6453 = class105.method1020(new class366[]{var2}, this.field6454, (byte)109);
            }
         }

         if (arg0 != 35632) {
            this.field6453 = null;
         }

         return this.field6453 != null;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6457[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "a",
      descriptor = "(I)V",
      line = 32
   )
   public static void method3326(int arg0) {
      try {
         if (arg0 != 31060) {
            method3328(-51, 4, -68, -104, 72, 62);
         }

         field6448 = null;
         field6446 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6457[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "a",
      descriptor = "(ZZ)V",
      line = 44
   )
   public static final void method3327(boolean arg0, boolean arg1) {
      try {
         ++field6449;
         class743.method5393(4);
         if (class543.method4060(class376.field5588, (byte)-99)) {
            if (arg1) {
               ++class463.field6768;
               if (~class463.field6768 <= -51 || arg0) {
                  class463.field6768 = 0;
                  if (!class232.field3401 && class361.field5404 != null) {
                     ++class237.field3449;
                     class542 var2 = class549.method4093((byte)-113, class647.field9399, class126.field2108);
                     class740.method5332(var2, (byte)77);

                     try {
                        class349.method2694(-1);
                     } catch (IOException var4) {
                        class232.field3401 = true;
                     }
                  }

                  class743.method5393(4);
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field6457[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "a",
      descriptor = "(IIIIII)V",
      line = 94
   )
   public static final void method3328(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field4564;

      try {
         if (class581.field8354 >= arg2 && ~class3.field16 >= ~arg1) {
            label160: {
               boolean var7;
               label150: {
                  if (~arg3 > ~class515.field7502) {
                     var7 = false;
                     arg3 = class515.field7502;
                     if (!var6) {
                        break label150;
                     }
                  }

                  if (~arg3 >= ~class130.field2163) {
                     var7 = true;
                     if (!var6) {
                        break label150;
                     }
                  }

                  var7 = false;
                  arg3 = class130.field2163;
               }

               boolean var8;
               label134: {
                  if (~arg0 <= ~class515.field7502) {
                     if (~arg0 >= ~class130.field2163) {
                        var8 = true;
                        if (!var6) {
                           break label134;
                        }
                     }

                     arg0 = class130.field2163;
                     var8 = false;
                     if (!var6) {
                        break label134;
                     }
                  }

                  arg0 = class515.field7502;
                  var8 = false;
               }

               label126: {
                  if (arg2 < class3.field16) {
                     arg2 = class3.field16;
                     if (!var6) {
                        break label126;
                     }
                  }

                  class18.method132(false, arg3, arg0, arg4, class448.field6542[arg2++]);
               }

               label121: {
                  if (~arg1 < ~class581.field8354) {
                     arg1 = class581.field8354;
                     if (!var6) {
                        break label121;
                     }
                  }

                  class18.method132(false, arg3, arg0, arg4, class448.field6542[arg1--]);
               }

               if (!var7 || !var8) {
                  if (var7) {
                     int var9 = arg2;
                     if (var6) {
                        class448.field6542[arg2][arg3] = arg4;
                        var9 = arg2 + 1;
                     }

                     while(true) {
                        while(var9 <= arg1) {
                           class448.field6542[var9][arg3] = arg4;
                           ++var9;
                        }

                        if (!var6) {
                           if (!var6) {
                              break label160;
                           }
                           break;
                        }

                        ++var9;
                     }
                  }

                  if (!var8) {
                     break label160;
                  }

                  int var10 = arg2;
                  if (var6) {
                     class448.field6542[arg2][arg0] = arg4;
                     var10 = arg2 + 1;
                  }

                  while(true) {
                     while(~var10 >= ~arg1) {
                        class448.field6542[var10][arg0] = arg4;
                        ++var10;
                     }

                     if (!var6) {
                        if (!var6) {
                           break label160;
                        }
                        break;
                     }

                     ++var10;
                  }
               }

               int var11 = arg2;
               if (var6 || ~arg1 <= ~arg2) {
                  do {
                     int[] var12 = class448.field6542[var11];
                     var12[arg3] = var12[arg0] = arg4;
                     ++var11;
                  } while(~arg1 <= ~var11);
               }
            }
         }

         ++field6451;
         int var13 = -45 % ((arg5 - 73) / 50);
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field6457[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "a",
      descriptor = "(FLiia;Liia;I)Z",
      line = 196
   )
   public final boolean method3329(float arg0, class95 arg1, class95 arg2, int arg3) {
      boolean var5 = client.field4564;

      try {
         ++field6456;
         if (!this.method3325(arg3 + 35632)) {
            return false;
         } else {
            class98 var6 = this.field6454.field835;
            class421 var7 = new class421(this.field6454, 6408, arg1.field1529, arg1.field1530);
            int var8 = 0;
            this.field6454.method428(var6, (byte)-117);
            var6.method941((byte)123, var7, 0);
            if (var6.method950(arg3 ^ -4)) {
               int var10000;
               label48: {
                  OpenGL.glPushMatrix();
                  OpenGL.glLoadIdentity();
                  OpenGL.glMatrixMode(5889);
                  OpenGL.glPushMatrix();
                  OpenGL.glLoadIdentity();
                  OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
                  OpenGL.glPushAttrib(2048);
                  OpenGL.glViewport(0, 0, arg1.field1529, arg1.field1530);
                  OpenGL.glUseProgramObjectARB(this.field6453.field935);
                  OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field6453.field935, field6457[6]), 0);
                  OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field6453.field935, field6457[5]), 1.0F / arg0);
                  OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field6453.field935, field6457[4]), 1.0F / (float)arg2.field1529, 1.0F / (float)arg2.field1530);
                  int var9 = 0;
                  if (var5) {
                     var10000 = var9;
                  } else if (var9 >= arg1.field1533) {
                     OpenGL.glUseProgramObjectARB(0L);
                     OpenGL.glPopAttrib();
                     OpenGL.glPopMatrix();
                     OpenGL.glMatrixMode(5888);
                     OpenGL.glPopMatrix();
                     var10000 = 1;
                     if (!var5) {
                        break label48;
                     }
                  } else {
                     var10000 = var9;
                  }

                  while(true) {
                     float var10 = (float)var10000 / (float)arg1.field1533;
                     this.field6454.method252(arg2, (byte)-11);
                     OpenGL.glBegin(7);
                     OpenGL.glTexCoord3f(0.0F, 0.0F, var10);
                     OpenGL.glVertex2f(0.0F, 0.0F);
                     OpenGL.glTexCoord3f(1.0F, 0.0F, var10);
                     OpenGL.glVertex2f(1.0F, 0.0F);
                     OpenGL.glTexCoord3f(1.0F, 1.0F, var10);
                     OpenGL.glVertex2f(1.0F, 1.0F);
                     OpenGL.glTexCoord3f(0.0F, 1.0F, var10);
                     OpenGL.glVertex2f(0.0F, 1.0F);
                     OpenGL.glEnd();
                     arg1.method920(arg1.field1530, 0, 0, 0, var9, -127, arg1.field1529, 0);
                     ++var9;
                     if (var9 >= arg1.field1533) {
                        OpenGL.glUseProgramObjectARB(0L);
                        OpenGL.glPopAttrib();
                        OpenGL.glPopMatrix();
                        OpenGL.glMatrixMode(5888);
                        OpenGL.glPopMatrix();
                        var10000 = 1;
                        if (!var5) {
                           break;
                        }
                     } else {
                        var10000 = var9;
                     }
                  }
               }

               var8 = var10000;
            }

            var6.method931(arg3, 1);
            this.field6454.method400(var6, arg3 ^ 20547);
            return (boolean)var8;
         }
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field6457[3] + arg0 + ',' + (arg1 != null ? field6457[0] : field6457[2]) + ',' + (arg2 != null ? field6457[0] : field6457[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "<init>",
      descriptor = "(Lrk;)V",
      line = 260
   )
   public class442(class35 arg0) {
      try {
         this.field6454 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6457[1] + (arg0 != null ? field6457[0] : field6457[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3330(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!un",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3331(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 124;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
