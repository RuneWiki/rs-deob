import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class758 {
   @OriginalMember(
      owner = "client!oea",
      name = "c",
      descriptor = "Lc;"
   )
   private class652 field11220;
   @OriginalMember(
      owner = "client!oea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11224 = new String[]{method5563(method5562("cL770$")), method5563(method5562("w\u0007x7\u000e")), method5563(method5562("b\\:u")), method5563(method5562("cL77OeG?mM$")), method5563(method5562("\u007fH;i\u001fiz?c\u0016")), method5563(method5562("dL?~\u001bxd7i")), method5563(method5562("~J&K\u0016`@3\u007f")), method5563(method5562("cL771$")), method5563(method5562("cL776$")), method5563(method5562("cL772$")), method5563(method5562("cL777$")), method5563(method5562("yG?\u007f\u001c~Dv\u007f\u001fcH\"9\u0001oY\u0004|\u001feL0\"yyG?\u007f\u001c~Dvo\u0016o\u001bvj\u0012aY:| eS3\"yyG?\u007f\u001c~Dvj\u0012aY:|\u0001?mvq\u0016eN>m>mYm\u0013\u0005c@29\u001em@81Z,R\\\u007f\u001fcH\"9\u0017t\tk9\u0007iQ\"l\u0001i\u001a\u00121\u001bi@1q\u0007AH&5SzL5*[!Z7t\u0003`L\u0005p\ti\u0007.5S<\u0007f5S<\u0007f0XkE\tM\u0016tj9v\u0001hrfD]tP,0]~\t{9\u0007iQ\"l\u0001i\u001a\u00121\u001bi@1q\u0007AH&5SzL5*[\u007fH;i\u001fiz?c\u0016\"Qz9C\"\u0019z9C\"\u0019\u007f2\u0014`v\u0002|\u000bOF9k\u0017W\u0019\u000b7\u000buS\u007f7\u00017#0u\u001cm]v}\n,\u0014vm\u0016t]#k\u0016?m~q\u0016eN>m>mYz9\u0005iJe1C\"\u0019z9^\u007fH;i\u001fiz?c\u0016\"Pz9C\"\u0019\u007f2\u0014`v\u0002|\u000bOF9k\u0017W\u0019\u000b7\u000buS\u007f7\u0001,\u0004vm\u0016t]#k\u0016?m~q\u0016eN>m>mYz9\u0005iJe1C\"\u0019z9\u0000mD&u\u0016_@,|]u\u0005v)]<\u0000}~\u001fS}3a0cF$}(<txa\nv\u0000xkH\u0006N:F5~H1Z\u001c`F$9N,_3zG$\u0019x,XbF$t\u0012`@,|[zL5*[hQz9\u0017u\u0005vk\u0010|{3u\u001aiO\u007f0Y<\u0007c5SxL.m\u0006~Le][dL?~\u001bxd7i_,N:F'iQ\u0015v\u001c~M\r).\"Q/cZ\"[\u007f\"yq#"))};
   @OriginalMember(
      owner = "client!oea",
      name = "h",
      descriptor = "I"
   )
   public static int field11216;
   @OriginalMember(
      owner = "client!oea",
      name = "g",
      descriptor = "I"
   )
   public static int field11218;
   @OriginalMember(
      owner = "client!oea",
      name = "a",
      descriptor = "I"
   )
   public static int field11221;
   @OriginalMember(
      owner = "client!oea",
      name = "d",
      descriptor = "I"
   )
   public static int field11222;
   @OriginalMember(
      owner = "client!oea",
      name = "b",
      descriptor = "I"
   )
   public static int field11223;
   @OriginalMember(
      owner = "client!oea",
      name = "e",
      descriptor = "Lrr;"
   )
   public static class678 field11219;
   @OriginalMember(
      owner = "client!oea",
      name = "f",
      descriptor = "Low;"
   )
   private class789 field11217;

   @OriginalMember(
      owner = "client!oea",
      name = "a",
      descriptor = "(JZ)I"
   )
   public static final int method5557(long arg0, boolean arg1) {
      try {
         ++field11216;
         if (!arg1) {
            method5560(-30);
         }

         return (int)(arg0 / 86400000L) + -11745;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11224[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oea",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method5558(int arg0) {
      try {
         ++field11222;
         if (arg0 != 35632) {
            this.method5561((class187)null, -0.07455302F, (class187)null, (byte)22);
         }

         if (this.field11220.field9737 && this.field11220.field9735 && this.field11217 == null) {
            class86 var2 = class135.method1243(field11224[11], 35632, (byte)6, this.field11220);
            if (var2 != null) {
               this.field11217 = class651.method4722(new class86[]{var2}, this.field11220, arg0 + -38462);
            }
         }

         return this.field11217 != null;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11224[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oea",
      name = "b",
      descriptor = "(I)I"
   )
   public static final int method5559(int arg0) {
      try {
         ++field11218;
         class304 var1 = class670.field9994;
         synchronized(class670.field9994) {
            if (arg0 != -601) {
               method5560(76);
            }

            return class670.field9994.method2543(false);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field11224[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oea",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method5560(int arg0) {
      try {
         if (arg0 > -70) {
            method5557(-28L, true);
         }

         field11219 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11224[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oea",
      name = "a",
      descriptor = "(Ldba;FLdba;B)Z"
   )
   public final boolean method5561(class187 arg0, float arg1, class187 arg2, byte arg3) {
      try {
         ++field11223;
         if (!this.method5558(arg3 + 35523)) {
            return false;
         } else {
            class358 var5 = this.field11220.field9669;
            class688 var6 = new class688(this.field11220, 6408, arg2.field2923, arg2.field2920);
            this.field11220.method4796(true, var5);
            boolean var7 = false;
            var5.method2927(var6, 0, arg3 ^ 22);
            if (var5.method2929((byte)-80)) {
               OpenGL.glPushMatrix();
               OpenGL.glLoadIdentity();
               OpenGL.glMatrixMode(5889);
               OpenGL.glPushMatrix();
               OpenGL.glLoadIdentity();
               OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
               OpenGL.glPushAttrib(2048);
               OpenGL.glViewport(0, 0, arg2.field2923, arg2.field2920);
               OpenGL.glUseProgramObjectARB(this.field11217.field11548);
               OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field11217.field11548, field11224[5]), 0);
               OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field11217.field11548, field11224[6]), 1.0F / arg1);
               OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field11217.field11548, field11224[4]), 1.0F / (float)arg0.field2923, 1.0F / (float)arg0.field2920);

               for(int var8 = 0; ~var8 > ~arg2.field2932; ++var8) {
                  float var9 = (float)var8 / (float)arg2.field2932;
                  this.field11220.method4792(arg3 ^ -26260, arg0);
                  OpenGL.glBegin(7);
                  OpenGL.glTexCoord3f(0.0F, 0.0F, var9);
                  OpenGL.glVertex2f(0.0F, 0.0F);
                  OpenGL.glTexCoord3f(1.0F, 0.0F, var9);
                  OpenGL.glVertex2f(1.0F, 0.0F);
                  OpenGL.glTexCoord3f(1.0F, 1.0F, var9);
                  OpenGL.glVertex2f(1.0F, 1.0F);
                  OpenGL.glTexCoord3f(0.0F, 1.0F, var9);
                  OpenGL.glVertex2f(0.0F, 1.0F);
                  OpenGL.glEnd();
                  arg2.method1677(arg2.field2920, 0, var8, 0, 0, 0, (byte)-81, arg2.field2923);
               }

               OpenGL.glUseProgramObjectARB(0L);
               OpenGL.glPopAttrib();
               OpenGL.glPopMatrix();
               OpenGL.glMatrixMode(5888);
               var7 = true;
               OpenGL.glPopMatrix();
            }

            if (arg3 != 109) {
               return true;
            } else {
               var5.method2933(0, -16640);
               this.field11220.method4746(-1, var5);
               return var7;
            }
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field11224[7] + (arg0 != null ? field11224[1] : field11224[2]) + ',' + arg1 + ',' + (arg2 != null ? field11224[1] : field11224[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oea",
      name = "<init>",
      descriptor = "(Lc;)V"
   )
   public class758(class652 arg0) {
      try {
         this.field11220 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11224[3] + (arg0 != null ? field11224[1] : field11224[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5562(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 115);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5563(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 86;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 115;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
