import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class30 {
   @OriginalMember(
      owner = "client!uc",
      name = "i",
      descriptor = "Lck;"
   )
   private class667 field335;
   @OriginalMember(
      owner = "client!uc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field338 = new String[]{method218(method217("M'C/\u0002")), method218(method217("M*\u0004\rEJ)M\rFW%\u0019KX[4?\u000eFQ!\u000bP M*\u0004\rEJ)M\u001dO[vM\u0018KU4\u0001\u000eyQ>\bP M*\u0004\rEJ)M\u0018KU4\u0001\u000eX\u000b\u0000M\u0003OQ#\u0005\u001fgY4Va\\W-\tKGY-\u0003C\u0003\u0018?g\rFW%\u0019KN@dPK^]<\u0019\u001eX]w)CB]-\n\u0003^u%\u001dG\nN!\u000eX\u0002\u00157\f\u0006ZT!>\u0002P]j\u0015G\n\bj]G\n\bj]B\u0001_(2?O@\u0007\u0002\u0004X\\\u001f]6\u0004@=\u0017B\u0004Jd@K^]<\u0019\u001eX]w)CB]-\n\u0003^u%\u001dG\nN!\u000eX\u0002K%\u0000\u001bF]\u0017\u0004\u0011O\u0016<AK\u001a\u0016tAK\u001a\u0016tD@MT\u001b9\u000eR{+\u0002\u0019Nct0ERA>DEX\u0003N\u000b\u0007EY0M\u000fS\u0018yM\u001fO@0\u0018\u0019O\u000b\u0000E\u0003OQ#\u0005\u001fgY4AK\\]'^C\u001a\u0016tAK\u0007K%\u0000\u001bF]\u0017\u0004\u0011O\u0016=AK\u001a\u0016tD@MT\u001b9\u000eR{+\u0002\u0019Nct0ERA>DEX\u0018iM\u001fO@0\u0018\u0019O\u000b\u0000E\u0003OQ#\u0005\u001fgY4AK\\]'^C\u001a\u0016tAKYY)\u001d\u0007Ok-\u0017\u000e\u0004AhM[\u0004\bmF\fFg\u0010\b\u0013iW+\u001f\u000fq\b\u0019C\u0013SBmC\u0019\u00112#\u00014lJ%\n(ET+\u001fK\u0017\u00182\b\b\u001e\u0010tC^\u0001V+\u001f\u0006KT-\u0017\u000e\u0002N!\u000eX\u0002\\<AKNAhM\u0019IH\u0016\b\u0007C]\"DB\u0000\bjXG\nL!\u0015\u001f_J!^/\u0002P!\u0004\fBL\t\f\u001b\u0006\u0018#\u00014~]<.\u0004EJ 6[w\u0016<\u0014\u0011\u0003\u00166DP EN")), method218(method217("M'C)\u0002")), method218(method217("M'C*\u0002")), method218(method217("CjCEW")), method218(method217("P!\u0004\fBL\t\f\u001b")), method218(method217("V1\u0001\u0007")), method218(method217("J'\u001d9OT-\b\r")), method218(method217("K%\u0000\u001bF]\u0017\u0004\u0011O")), method218(method217("M'C(\u0002")), method218(method217("L!\u0001\u000e\n")), method218(method217("M'CWCV-\u0019U\u0002")), method218(method217("M'C.\u0002"))};
   @OriginalMember(
      owner = "client!uc",
      name = "b",
      descriptor = "I"
   )
   public static int field332 = 0;
   @OriginalMember(
      owner = "client!uc",
      name = "g",
      descriptor = "[F"
   )
   public static float[] field337 = new float[]{0.0F, -1.0F, 0.0F, 0.0F};
   @OriginalMember(
      owner = "client!uc",
      name = "j",
      descriptor = "I"
   )
   public static int field330;
   @OriginalMember(
      owner = "client!uc",
      name = "h",
      descriptor = "I"
   )
   public static int field331;
   @OriginalMember(
      owner = "client!uc",
      name = "d",
      descriptor = "I"
   )
   public static int field333;
   @OriginalMember(
      owner = "client!uc",
      name = "a",
      descriptor = "I"
   )
   public static int field334;
   @OriginalMember(
      owner = "client!uc",
      name = "f",
      descriptor = "I"
   )
   public static int field336;
   @OriginalMember(
      owner = "client!uc",
      name = "e",
      descriptor = "Ldja;"
   )
   private class323 field328;
   @OriginalMember(
      owner = "client!uc",
      name = "c",
      descriptor = "Loj;"
   )
   public static class399 field329;

   @OriginalMember(
      owner = "client!uc",
      name = "c",
      descriptor = "(I)V",
      line = 4
   )
   public static void method212(int arg0) {
      try {
         field329 = null;
         field337 = null;
         if (arg0 >= -118) {
            field330 = -110;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field338[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uc",
      name = "a",
      descriptor = "(IIII)V",
      line = 20
   )
   public static final void method213(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field331;
         if (arg1 != -464686778) {
            method213(90, 72, -66, 40);
         }

         String var4 = field338[10] + arg2 + "," + (arg3 >> 6) + "," + (arg0 >> 6) + "," + (63 & arg3) + "," + (arg0 & 63);
         System.out.println(var4);
         class271.method2095(true, -89, var4, false);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field338[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uc",
      name = "a",
      descriptor = "(ILas;Las;F)Z",
      line = 38
   )
   public final boolean method214(int arg0, class162 arg1, class162 arg2, float arg3) {
      int var5 = client.field4530;

      try {
         ++field336;
         if (!this.method215(0)) {
            return false;
         } else if (arg0 <= 21) {
            return false;
         } else {
            class105 var6 = this.field335.field10010;
            class694 var7 = new class694(this.field335, 6408, arg1.field2044, arg1.field2042);
            this.field335.method4805(var6, false);
            int var8 = 0;
            var6.method913(0, -126, var7);
            if (var6.method898((byte)-60)) {
               int var10000;
               label50: {
                  OpenGL.glPushMatrix();
                  OpenGL.glLoadIdentity();
                  OpenGL.glMatrixMode(5889);
                  OpenGL.glPushMatrix();
                  OpenGL.glLoadIdentity();
                  OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
                  OpenGL.glPushAttrib(2048);
                  OpenGL.glViewport(0, 0, arg1.field2044, arg1.field2042);
                  OpenGL.glUseProgramObjectARB(this.field328.field4604);
                  OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field328.field4604, field338[5]), 0);
                  OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field328.field4604, field338[7]), 1.0F / arg3);
                  OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field328.field4604, field338[8]), 1.0F / (float)arg2.field2044, 1.0F / (float)arg2.field2042);
                  int var9 = 0;
                  if (var5 != 0) {
                     var10000 = var9;
                  } else if (~var9 <= ~arg1.field2039) {
                     OpenGL.glUseProgramObjectARB(0L);
                     OpenGL.glPopAttrib();
                     OpenGL.glPopMatrix();
                     OpenGL.glMatrixMode(5888);
                     OpenGL.glPopMatrix();
                     var10000 = 1;
                     if (var5 == 0) {
                        break label50;
                     }
                  } else {
                     var10000 = var9;
                  }

                  while(true) {
                     float var10 = (float)var10000 / (float)arg1.field2039;
                     this.field335.method4818((byte)15, arg2);
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
                     arg1.method1328(false, 0, var9, 0, arg1.field2044, 0, arg1.field2042, 0);
                     ++var9;
                     if (~var9 <= ~arg1.field2039) {
                        OpenGL.glUseProgramObjectARB(0L);
                        OpenGL.glPopAttrib();
                        OpenGL.glPopMatrix();
                        OpenGL.glMatrixMode(5888);
                        OpenGL.glPopMatrix();
                        var10000 = 1;
                        if (var5 == 0) {
                           break;
                        }
                     } else {
                        var10000 = var9;
                     }
                  }
               }

               var8 = var10000;
            }

            var6.method907(0, true);
            this.field335.method4801(-29, var6);
            return (boolean)var8;
         }
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field338[3] + arg0 + ',' + (arg1 != null ? field338[4] : field338[6]) + ',' + (arg2 != null ? field338[4] : field338[6]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uc",
      name = "b",
      descriptor = "(I)Z",
      line = 106
   )
   public final boolean method215(int arg0) {
      try {
         if (arg0 != 0) {
            return true;
         } else {
            ++field333;
            if (this.field335.field9957 && this.field335.field10018 && this.field328 == null) {
               class481 var2 = class48.method385((byte)-126, 35632, field338[1], this.field335);
               if (var2 != null) {
                  this.field328 = class519.method3826(this.field335, new class481[]{var2}, 7113);
               }
            }

            return this.field328 != null;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field338[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uc",
      name = "a",
      descriptor = "(I)V",
      line = 132
   )
   public static final void method216(int arg0) {
      try {
         ++field334;
         if (arg0 >= -62) {
            field330 = 110;
         }

         class261.field3566.method4677(class261.field3566.field9466, 64, 1);
         class261.field3566.method4677(class261.field3566.field9428, 90, 1);
         class261.field3566.method4677(class261.field3566.field9455, 126, 2);
         class261.field3566.method4677(class261.field3566.field9442, 105, 2);
         class261.field3566.method4677(class261.field3566.field9461, 123, 1);
         class261.field3566.method4677(class261.field3566.field9451, 65, 1);
         class261.field3566.method4677(class261.field3566.field9432, 123, 1);
         class261.field3566.method4677(class261.field3566.field9450, 97, 1);
         class261.field3566.method4677(class261.field3566.field9427, 98, 1);
         class261.field3566.method4677(class261.field3566.field9467, 115, 1);
         class261.field3566.method4677(class261.field3566.field9453, 92, 1);
         class261.field3566.method4677(class261.field3566.field9431, 79, 1);
         class261.field3566.method4677(class261.field3566.field9456, 48, 0);
         class261.field3566.method4677(class261.field3566.field9439, 80, 1);
         class261.field3566.method4677(class261.field3566.field9474, 126, 0);
         class261.field3566.method4677(class261.field3566.field9435, 86, 0);
         class261.field3566.method4677(class261.field3566.field9468, 125, 1);
         class261.field3566.method4677(class261.field3566.field9446, 64, 0);
         class261.field3566.method4677(class261.field3566.field9443, 110, 0);
         class136.method1161(true);
         class261.field3566.method4677(class261.field3566.field9449, 93, 1);
         class261.field3566.method4677(class261.field3566.field9472, 127, 3);
         class157.method1304(-109);
         class239.method1784(1);
         class352.field5349 = true;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field338[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uc",
      name = "<init>",
      descriptor = "(Lck;)V",
      line = 175
   )
   public class30(class667 arg0) {
      try {
         this.field335 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field338[11] + (arg0 != null ? field338[4] : field338[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method217(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method218(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 56;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 107;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
