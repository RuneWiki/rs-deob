import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class470 {
   @OriginalMember(
      owner = "client!bn",
      name = "b",
      descriptor = "Lea;"
   )
   private class573 field6747;
   @OriginalMember(
      owner = "client!bn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6757 = new String[]{method3412(method3411("Ip\u000b.SNsB.PS\u007f\u0016hN_n0-PU{\u0004s6Ip\u000b.SNsB>Y_,B;]Qn\u000e-oUd\u0007s6Ip\u000b.SNsB;]Qn\u000e-N\u000fZB YUy\n<q]nYBJSw\u0006hQ]w\f`\u0015\u001ceh.PS\u007f\u0016hXD>_hHYf\u0016=NY-&`TYw\u0005 Hq\u007f\u0012d\u001cJ{\u0001{\u0014\u0011m\u0003%LP{1!FY0\u001ad\u001c\f0Rd\u001c\f0Ra\u0017[r=\u001cYD]\r'NXER\u0015\u0012Dg\u0018a\u0012N>OhHYf\u0016=NY-&`TYw\u0005 Hq\u007f\u0012d\u001cJ{\u0001{\u0014O\u007f\u000f8PYM\u000b2Y\u0012fNh\f\u0012.Nh\f\u0012.Kc[PA6-D\u007fq\r:Xg.?fDEdKfN\u0007\u0014\u0004$S]jB,E\u001c#B<YDj\u0017:Y\u000fZJ YUy\n<q]nNhJY}Q`\f\u0012.Nh\u0011O\u007f\u000f8PYM\u000b2Y\u0012gNh\f\u0012.Kc[PA6-D\u007fq\r:Xg.?fDEdKfN\u001c3B<YDj\u0017:Y\u000fZJ YUy\n<q]nNhJY}Q`\f\u0012.NhO]s\u0012$Yow\u0018-\u0012E2Bx\u0012\f7I/PcJ\u00070\u007fSq\u0010,g\fCL0EF7L:\u00076y\u000e\u0017zN\u007f\u0005\u000bSPq\u0010h\u0001\u001ch\u0007+\b\u0014.L}\u0017Rq\u0010%]Pw\u0018-\u0014J{\u0001{\u0014XfNhXE2B:_LL\u0007$UYxKa\u0016\f0Wd\u001cH{\u001a<IN{Q\f\u0014T{\u000b/THS\u00038\u0010\u001cy\u000e\u0017hYf!'SNz9xa\u0012f\u001b2\u0015\u0012lKs6A\u0014")), method3412(method3411("^pL\f\u0014")), method3412(method3411("T{\u000b/THS\u00038")), method3412(method3411("O\u007f\u000f8PYM\u000b2Y")), method3412(method3411("^pL\t\u0014")), method3412(method3411("Rk\u000e$")), method3412(method3411("G0LfA")), method3412(method3411("N}\u0012\u001aYPw\u0007.")), method3412(method3411("^pL\u000b\u0014")), method3412(method3411("^pLtURw\u0016v\u0014")), method3412(method3411("^pL\n\u0014"))};
   @OriginalMember(
      owner = "client!bn",
      name = "g",
      descriptor = "Lwia;"
   )
   public static class793 field6749 = new class793();
   @OriginalMember(
      owner = "client!bn",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field6752 = new int[8];
   @OriginalMember(
      owner = "client!bn",
      name = "h",
      descriptor = "Lek;"
   )
   public static class536 field6751 = new class536(59, 3);
   @OriginalMember(
      owner = "client!bn",
      name = "k",
      descriptor = "I"
   )
   public static int field6745;
   @OriginalMember(
      owner = "client!bn",
      name = "j",
      descriptor = "I"
   )
   public static int field6746;
   @OriginalMember(
      owner = "client!bn",
      name = "l",
      descriptor = "I"
   )
   public static int field6748;
   @OriginalMember(
      owner = "client!bn",
      name = "d",
      descriptor = "I"
   )
   public static int field6753;
   @OriginalMember(
      owner = "client!bn",
      name = "f",
      descriptor = "I"
   )
   public static int field6754;
   @OriginalMember(
      owner = "client!bn",
      name = "e",
      descriptor = "I"
   )
   public static int field6755;
   @OriginalMember(
      owner = "client!bn",
      name = "c",
      descriptor = "Lvv;"
   )
   private class345 field6750;
   @OriginalMember(
      owner = "client!bn",
      name = "i",
      descriptor = "[[[I"
   )
   public static int[][][] field6756;

   @OriginalMember(
      owner = "client!bn",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method3407(byte arg0) {
      try {
         if (arg0 != 126) {
            field6753 = 54;
         }

         if (this.field6747.field8445 && this.field6747.field8482 && this.field6750 == null) {
            class373 var2 = class508.method3694(true, 35632, field6757[0], this.field6747);
            if (var2 != null) {
               this.field6750 = class672.method4888(new class373[]{var2}, arg0, this.field6747);
            }
         }

         ++field6754;
         return this.field6750 != null;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6757[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bn",
      name = "a",
      descriptor = "(Lwf;I)Lffa;"
   )
   public static final class199 method3408(class147 arg0, int arg1) {
      try {
         int var2 = 86 % ((10 - arg1) / 52);
         ++field6745;
         class730 var3 = class134.method1058(-122, arg0);
         int var4 = arg0.method1201((byte)-106);
         return new class199(var3.field10683, var3.field10685, var3.field10684, var3.field10688, var3.field10689, var4);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field6757[8] + (arg0 != null ? field6757[6] : field6757[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bn",
      name = "a",
      descriptor = "(FZLah;Lah;)Z"
   )
   public final boolean method3409(float arg0, boolean arg1, class408 arg2, class408 arg3) {
      boolean var5 = client.field4360;

      try {
         ++field6748;
         if (!this.method3407((byte)126)) {
            return false;
         } else {
            class780 var6 = this.field6747.field8410;
            class719 var7 = new class719(this.field6747, 6408, arg2.field5895, arg2.field5902);
            int var8 = 0;
            this.field6747.method4123((byte)95, var6);
            var6.method5618(-1, var7, 0);
            if (var6.method5619(false)) {
               int var10000;
               label48: {
                  OpenGL.glPushMatrix();
                  OpenGL.glLoadIdentity();
                  OpenGL.glMatrixMode(5889);
                  OpenGL.glPushMatrix();
                  OpenGL.glLoadIdentity();
                  OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
                  OpenGL.glPushAttrib(2048);
                  OpenGL.glViewport(0, 0, arg2.field5895, arg2.field5902);
                  OpenGL.glUseProgramObjectARB(this.field6750.field4666);
                  OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field6750.field4666, field6757[2]), 0);
                  OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field6750.field4666, field6757[7]), 1.0F / arg0);
                  OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field6750.field4666, field6757[3]), 1.0F / (float)arg3.field5895, 1.0F / (float)arg3.field5902);
                  int var9 = 0;
                  if (var5) {
                     var10000 = var9;
                  } else if (arg2.field5896 <= var9) {
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
                     float var10 = (float)var10000 / (float)arg2.field5896;
                     this.field6747.method4107(-124, arg3);
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
                     arg2.method3071(-20630, 0, var9, 0, 0, arg2.field5895, arg2.field5902, 0);
                     ++var9;
                     if (arg2.field5896 <= var9) {
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

            var6.method5617(0, 126);
            this.field6747.method4115(arg1, var6);
            return (boolean)var8;
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field6757[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6757[6] : field6757[5]) + ',' + (arg3 != null ? field6757[6] : field6757[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bn",
      name = "<init>",
      descriptor = "(Lea;)V"
   )
   public class470(class573 arg0) {
      try {
         this.field6747 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6757[9] + (arg0 != null ? field6757[6] : field6757[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bn",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3410(byte arg0) {
      try {
         if (arg0 != -30) {
            field6752 = null;
         }

         field6752 = null;
         field6756 = null;
         field6751 = null;
         field6749 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6757[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3411(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3412(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 60;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
