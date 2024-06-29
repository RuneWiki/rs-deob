import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class762 {
   @OriginalMember(
      owner = "client!cm",
      name = "c",
      descriptor = "Lor;"
   )
   private class670 field11019;
   @OriginalMember(
      owner = "client!cm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11025 = new String[]{method5475(method5474(",ukZ/!q1Xn")), method5475(method5474("46kH;")), method5475(method5474("!m)\n")), method5475(method5474("'},\u0001.;U$\u0016")), method5475(method5474(",uk$n")), method5475(method5474("={54##q \u0000")), method5475(method5474("<y(\u0016**K,\u001c#")), method5475(method5474(":v,\u0000)=ue\u0000* y1F4,h\u0017\u0003*&}#]L:v,\u0000)=ue\u0010#,*e\u0015'\"h)\u0003\u0015&b ]L:v,\u0000)=ue\u0015'\"h)\u00034|\\e\u000e#&\u007f-\u0012\u000b.h~l0 q!F+.q+NoocO\u0000* y1F\"78xF2*`1\u00134*+\u0001N.*q\"\u000e2\u0002y5Jf9}&Unbk$\u000b6#}\u0016\u000f<*6=Jf\u007f6uJf\u007f6uOm(t\u001a2#7[*\t4+Cu;h7a?Oh=8hF2*`1\u00134*+\u0001N.*q\"\u000e2\u0002y5Jf9}&Un<y(\u0016**K,\u001c#a`iFva(iFva(lM!#G\u0011\u0003>\fw*\u0014\"\u0014(\u0018H>6blH4t\u0012#\n).le\u0002?o%e\u0012#7l0\u0014#|\\m\u000e#&\u007f-\u0012\u000b.hiF0*{vNva(iFk<y(\u0016**K,\u001c#aaiFva(lM!#G\u0011\u0003>\fw*\u0014\"\u0014(\u0018H>6blH4o5e\u0012#7l0\u0014#|\\m\u000e#&\u007f-\u0012\u000b.hiF0*{vNva(iF5.u5\n#\u001cq?\u0003h64eVh\u007f1n\u0001*\u0010L \u001e\u0005 w7\u0002\u001d\u007fEk\u001e?51k\u0014}E\u007f)9\u0000=y\"%)#w7F{on \u0005rg(kSm!w7\u000b'#q?\u0003n9}&Un+`iF\"64e\u0014%?J \n/*~lOl\u007f6pJf;}=\u00123=}v\"n'},\u0001.;U$\u0016jo\u007f)9\u0012*`\u0006\t)=|\u001eV\u001ba`<\u001coajl]L2\u0012")), method5475(method5474(",uk'n")), method5475(method5474(",uk%n"))};
   @OriginalMember(
      owner = "client!cm",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public static String field11020 = "";
   @OriginalMember(
      owner = "client!cm",
      name = "g",
      descriptor = "I"
   )
   public static int field11018 = -1;
   @OriginalMember(
      owner = "client!cm",
      name = "b",
      descriptor = "Lbga;"
   )
   public static class378 field11023 = new class378(60, -2);
   @OriginalMember(
      owner = "client!cm",
      name = "e",
      descriptor = "I"
   )
   public static int field11021;
   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "I"
   )
   public static int field11024;
   @OriginalMember(
      owner = "client!cm",
      name = "f",
      descriptor = "Lon;"
   )
   private class356 field11022;

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(Lpja;Lpja;FB)Z"
   )
   public final boolean method5471(class42 arg0, class42 arg1, float arg2, byte arg3) {
      boolean var5 = client.field4273;

      try {
         if (arg3 >= -111) {
            this.field11019 = null;
         }

         ++field11024;
         if (!this.method5473(false)) {
            return false;
         } else {
            class325 var6 = this.field11019.field9801;
            class655 var7 = new class655(this.field11019, 6408, arg1.field492, arg1.field490);
            int var8 = 0;
            this.field11019.method4899((byte)-101, var6);
            var6.method2461(true, 0, var7);
            if (var6.method2453(92)) {
               int var10000;
               label50: {
                  OpenGL.glPushMatrix();
                  OpenGL.glLoadIdentity();
                  OpenGL.glMatrixMode(5889);
                  OpenGL.glPushMatrix();
                  OpenGL.glLoadIdentity();
                  OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
                  OpenGL.glPushAttrib(2048);
                  OpenGL.glViewport(0, 0, arg1.field492, arg1.field490);
                  OpenGL.glUseProgramObjectARB(this.field11022.field5071);
                  OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field11022.field5071, field11025[3]), 0);
                  OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field11022.field5071, field11025[5]), 1.0F / arg2);
                  OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field11022.field5071, field11025[6]), 1.0F / (float)arg0.field492, 1.0F / (float)arg0.field490);
                  int var9 = 0;
                  if (var5) {
                     var10000 = var9;
                  } else if (~var9 <= ~arg1.field486) {
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
                     float var10 = (float)var10000 / (float)arg1.field486;
                     this.field11019.method4848(false, arg0);
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
                     arg1.method313(0, arg1.field490, var9, arg1.field492, 0, 0, -1, 0);
                     ++var9;
                     if (~var9 <= ~arg1.field486) {
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

            var6.method2446(0, (byte)81);
            this.field11019.method4864((byte)-48, var6);
            return (boolean)var8;
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field11025[4] + (arg0 != null ? field11025[1] : field11025[2]) + ',' + (arg1 != null ? field11025[1] : field11025[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5472(int arg0) {
      try {
         field11020 = null;
         field11023 = null;
         int var1 = -43 / ((-20 - arg0) / 55);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11025[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method5473(boolean arg0) {
      try {
         if (this.field11019.field9857 && this.field11019.field9765 && this.field11022 == null) {
            class445 var2 = class790.method5696(field11025[7], 35632, -76, this.field11019);
            if (var2 != null) {
               this.field11022 = class414.method3132(this.field11019, (byte)124, new class445[]{var2});
            }
         }

         ++field11021;
         if (arg0) {
            this.method5473(false);
         }

         return this.field11022 != null;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field11025[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "<init>",
      descriptor = "(Lor;)V"
   )
   public class762(class670 arg0) {
      try {
         this.field11019 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11025[0] + (arg0 != null ? field11025[1] : field11025[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5474(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5475(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 24;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 102;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
