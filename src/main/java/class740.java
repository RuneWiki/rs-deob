import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class740 {
   @OriginalMember(
      owner = "client!lc",
      name = "b",
      descriptor = "Liu;"
   )
   private class530 field10834;
   @OriginalMember(
      owner = "client!lc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10839 = new String[]{method5377(method5376("/\nzI.3\"r^")), method5377(method5376("5\fc|#+\u0006vH")), method5377(method5376("<A=\u0000;")), method5377(method5376("+\f=on")), method5377(method5376(")\u001a\u007fB")), method5377(method5376("4\u000e~^*\"<zT#")), method5377(method5376("\u0013]3\u0003f")), method5377(method5376("+\f=mn")), method5377(method5376("gB3")), method5377(method5376("+\f=kn")), method5377(method5376("+\f=hn")), method5377(method5376("+\f=ln")), method5377(method5376("+\f=\u0012/)\u0006g\u0010n")), method5377(method5376("2\u0001zH)5\u00023H*(\u000eg\u000e4$\u001fAK*.\nu\u0015L2\u0001zH)5\u00023X#$]3]'*\u001f\u007fK\u0015.\u0015v\u0015L2\u0001zH)5\u00023]'*\u001f\u007fK4t+3F#.\b{Z\u000b&\u001f($0(\u0006w\u000e+&\u0006}\u0006og\u0014\u0019H*(\u000eg\u000e\"?O.\u000e2\"\u0017g[4\"\\W\u0006.\"\u0006tF2\n\u000ec\u0002f1\np\u001dnj\u001crC6+\n@G<\"Ak\u0002fwA#\u0002fwA#\u0007m \u0003Lz#?,|A4#4#sh?\u0016i\u0007h5O>\u000e2\"\u0017g[4\"\\W\u0006.\"\u0006tF2\n\u000ec\u0002f1\np\u001dn4\u000e~^*\"<zT#i\u0017?\u000evi_?\u000evi_:\u0005!+0GK>\u0004\u0000|\\\"\u001c_N\u0000>>\u0015:\u00004|euB)&\u001b3J?gR3Z#?\u001bf\\#t+;F#.\b{Z\u000b&\u001f?\u000e0\"\f \u0006vi_?\u000ek4\u000e~^*\"<zT#i\u0016?\u000evi_:\u0005!+0GK>\u0004\u0000|\\\"\u001c_N\u0000>>\u0015:\u00004gB3Z#?\u001bf\\#t+;F#.\b{Z\u000b&\u001f?\u000e0\"\f \u0006vi_?\u000e5&\u0002cB#\u0014\u0006iKh>C3\u001ehwF8I*\u0018;vV\u0005(\u0000aJ\u001dw2=V?=F=\\}M\b\u007fq\u00005\u000etm)+\u0000a\u000e{g\u0019vMro_=\u001bm)\u0000aC'+\u0006iKn1\np\u001dn#\u0017?\u000e\">C3\\%7=vB/\"\t:\u0007lwA&\u0002f3\nkZ35\n jn/\nzI.3\"r^jg\b\u007fq\u0012\"\u0017PA)5\u000bH\u001e\u001bi\u0017jToi\u001d:\u0015L:e")), method5377(method5376("+\f=jn"))};
   @OriginalMember(
      owner = "client!lc",
      name = "h",
      descriptor = "Laka;"
   )
   public static class418 field10833 = new class418(116, 0);
   @OriginalMember(
      owner = "client!lc",
      name = "f",
      descriptor = "I"
   )
   public static int field10831;
   @OriginalMember(
      owner = "client!lc",
      name = "g",
      descriptor = "I"
   )
   public static int field10832;
   @OriginalMember(
      owner = "client!lc",
      name = "e",
      descriptor = "I"
   )
   public static int field10835;
   @OriginalMember(
      owner = "client!lc",
      name = "d",
      descriptor = "I"
   )
   public static int field10836;
   @OriginalMember(
      owner = "client!lc",
      name = "c",
      descriptor = "I"
   )
   public static int field10837;
   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "Lua;"
   )
   private class666 field10838;

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(Lmd;FBLmd;)Z"
   )
   public final boolean method5370(class274 arg0, float arg1, byte arg2, class274 arg3) {
      boolean var5 = client.field1481;

      try {
         ++field10831;
         if (!this.method5371(arg2 ^ 35616)) {
            return false;
         } else {
            class734 var6 = this.field10834.field7701;
            if (arg2 != 16) {
               this.field10834 = null;
            }

            class324 var7 = new class324(this.field10834, 6408, arg3.field3502, arg3.field3496);
            this.field10834.method3955(var6, (byte)-52);
            int var8 = 0;
            var6.method5306(var7, 0, (byte)78);
            if (var6.method5309(-36054)) {
               int var10000;
               label50: {
                  OpenGL.glPushMatrix();
                  OpenGL.glLoadIdentity();
                  OpenGL.glMatrixMode(5889);
                  OpenGL.glPushMatrix();
                  OpenGL.glLoadIdentity();
                  OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
                  OpenGL.glPushAttrib(2048);
                  OpenGL.glViewport(0, 0, arg3.field3502, arg3.field3496);
                  OpenGL.glUseProgramObjectARB(this.field10838.field9866);
                  OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field10838.field9866, field10839[0]), 0);
                  OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field10838.field9866, field10839[1]), 1.0F / arg1);
                  OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field10838.field9866, field10839[5]), 1.0F / (float)arg0.field3502, 1.0F / (float)arg0.field3496);
                  int var9 = 0;
                  if (var5) {
                     var10000 = var9;
                  } else if (var9 >= arg3.field3499) {
                     OpenGL.glUseProgramObjectARB(0L);
                     OpenGL.glPopAttrib();
                     OpenGL.glPopMatrix();
                     OpenGL.glMatrixMode(5888);
                     var10000 = 1;
                     if (!var5) {
                        break label50;
                     }
                  } else {
                     var10000 = var9;
                  }

                  while(true) {
                     float var10 = (float)var10000 / (float)arg3.field3499;
                     this.field10834.method4006(arg0, (byte)58);
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
                     arg3.method2165(0, 0, var9, 0, arg3.field3502, arg3.field3496, arg2 ^ 16, 0);
                     ++var9;
                     if (var9 >= arg3.field3499) {
                        OpenGL.glUseProgramObjectARB(0L);
                        OpenGL.glPopAttrib();
                        OpenGL.glPopMatrix();
                        OpenGL.glMatrixMode(5888);
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
               OpenGL.glPopMatrix();
            }

            var6.method5307(0, (byte)86);
            this.field10834.method3995(var6, (byte)-29);
            return (boolean)var8;
         }
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field10839[3] + (arg0 != null ? field10839[2] : field10839[4]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10839[2] : field10839[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method5371(int arg0) {
      try {
         if (this.field10834.field7780 && this.field10834.field7759 && this.field10838 == null) {
            class8 var2 = class468.method3557(this.field10834, 2, field10839[13], 35632);
            if (var2 != null) {
               this.field10838 = class597.method4445(this.field10834, (byte)-119, new class8[]{var2});
            }
         }

         if (arg0 != 35632) {
            method5373(114, (class594)null);
         }

         ++field10835;
         return this.field10838 != null;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10839[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method5372(int arg0) {
      try {
         if (arg0 != 1) {
            method5373(75, (class594)null);
         }

         field10833 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10839[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(ILum;)Z"
   )
   public static final boolean method5373(int arg0, class594 arg1) {
      boolean var2 = client.field1481;

      try {
         ++field10836;

         try {
            return arg0 <= 3 ? true : class628.method4644(0, arg1);
         } catch (IOException var7) {
            if (~class157.field2022 == -10) {
               arg1.field8760 = null;
               return false;
            } else {
               class70.method697(-85);
               return true;
            }
         } catch (Exception var8) {
            int var10000;
            short var10001;
            label69: {
               String var4;
               label68: {
                  var4 = field10839[6] + (arg1.field8769 == null ? -1 : arg1.field8769.method3260(-115)) + "," + (arg1.field8775 != null ? arg1.field8775.method3260(-100) : -1) + "," + (arg1.field8774 == null ? -1 : arg1.field8774.method3260(-102)) + field10839[8] + arg1.field8776 + "," + (class204.field2593.field210[0] + class539.field7889) + "," + (class204.field2593.field205[0] + class353.field4940) + field10839[8];
                  int var5 = 0;
                  if (!var2) {
                     if (~var5 <= ~arg1.field8776) {
                        break label68;
                     }

                     var10000 = ~var5;
                     var10001 = -51;
                     if (var2) {
                        break label69;
                     }

                     if (var10000 <= -51) {
                        break label68;
                     }
                  }

                  do {
                     var4 = var4 + arg1.field8764.field859[var5] + ",";
                     ++var5;
                     if (~var5 <= ~arg1.field8776) {
                        break;
                     }

                     var10000 = ~var5;
                     var10001 = -51;
                     if (var2) {
                        break label69;
                     }
                  } while(var10000 > -51);
               }

               class668.method4877((byte)-21, var8, var4);
               var10000 = 0;
               var10001 = 255;
            }

            class367.method2893((boolean)var10000, var10001);
            return true;
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field10839[7] + arg0 + ',' + (arg1 != null ? field10839[2] : field10839[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(Lha;Z)V"
   )
   public static final void method5374(class479 arg0, boolean arg1) {
      boolean var2 = client.field1481;

      try {
         ++field10837;
         class91.field1238 = new class553[class211.field2686.length];
         int var3 = 0;
         int var10000;
         if (var2) {
            var10000 = class211.field2686[var3];
         } else if (~var3 <= ~class211.field2686.length) {
            var10000 = arg1;
            if (!var2) {
               if (arg1 != 1) {
                  field10833 = null;
                  return;
               }

               return;
            }
         } else {
            var10000 = class211.field2686[var3];
         }

         while(true) {
            int var4 = var10000;
            class19 var5 = class481.method3655(class28.field414, 113, var4);
            class447 var6 = arg0.method430(var5, class65.method585(class258.field3268, var4), true);
            class91.field1238[var3] = new class553(var6, var5);
            ++var3;
            if (~var3 <= ~class211.field2686.length) {
               var10000 = arg1;
               if (!var2) {
                  if (arg1 != 1) {
                     field10833 = null;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = class211.field2686[var3];
            }
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field10839[10] + (arg0 != null ? field10839[2] : field10839[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method5375(int arg0) {
      boolean var1 = client.field1481;

      try {
         int var2 = arg0;
         int var10000;
         if (var1) {
            var10000 = class684.method4985(117, class674.field9985, arg0 - -class728.field10621) * class32.field475;
         } else if (class674.field9985 <= arg0) {
            var10000 = field10832 + 1;
            if (!var1) {
               field10832 = var10000;
               return;
            }
         } else {
            var10000 = class684.method4985(117, class674.field9985, arg0 - -class728.field10621) * class32.field475;
         }

         while(true) {
            int var3 = var10000;
            int var4 = 0;
            if (var1 || ~class32.field475 < ~var4) {
               do {
                  int var5 = var3 + class684.method4985(arg0 + 117, class32.field475, class470.field6471 + var4);
                  if (~class134.field1704[var5] == ~class631.field9309) {
                     class543.field7934[var5].method1071(0, 0, class390.field5409, class139.field1759, class390.field5409 * var4, class139.field1759 * var2, true, true);
                  }

                  ++var4;
               } while(~class32.field475 < ~var4);
            }

            ++var2;
            if (class674.field9985 <= var2) {
               var10000 = field10832 + 1;
               if (!var1) {
                  field10832 = var10000;
                  return;
               }
            } else {
               var10000 = class684.method4985(117, class674.field9985, var2 - -class728.field10621) * class32.field475;
            }
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field10839[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "<init>",
      descriptor = "(Liu;)V"
   )
   public class740(class530 arg0) {
      try {
         this.field10834 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10839[12] + (arg0 != null ? field10839[2] : field10839[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5376(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5377(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 19;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
