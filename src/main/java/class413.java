import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class413 extends class416 {
   @OriginalMember(
      owner = "client!rs",
      name = "k",
      descriptor = "Z"
   )
   private boolean field6430 = false;
   @OriginalMember(
      owner = "client!rs",
      name = "h",
      descriptor = "Z"
   )
   private boolean field6431 = false;
   @OriginalMember(
      owner = "client!rs",
      name = "l",
      descriptor = "Lwfa;"
   )
   private class786 field6432;
   @OriginalMember(
      owner = "client!rs",
      name = "j",
      descriptor = "Low;"
   )
   private class789 field6421;
   @OriginalMember(
      owner = "client!rs",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6434 = new String[]{method3312(method3311("-#GVk")), method3312(method3311("8x\u0005\u0014")), method3312(method3311("$~G>>")), method3312(method3311("!l\u001f\u001d_8y\f\u0016e?y\u0010")), method3312(method3311("%n\b\u0014s")), method3312(method3311("4\u007f\f\u0019}\u0001l\u001d\u001dd\u0012h\u0019\f~")), method3312(method3311("4\u007f\f\u0019}\u0001l\u001d\u001dd\u0019k\u000f\u000bs\"")), method3312(method3311("!l\u001f\u001dS.}\u0006\u0016s8y")), method3312(method3311("$~G=>")), method3312(method3311("\"d\u0004\u001d")), method3312(method3311("$~G;>")), method3312(method3311("$~G?>")), method3312(method3311("$~G1>")), method3312(method3311("$~G<>")), method3312(method3311("$~G0>")), method3312(method3311("%x\u0007=n&b\u0007\u001dx\"")), method3312(method3311("%x\u0007<\u007f$")), method3312(method3311("8b\u001b\u0015w:^\b\u0015f:h\u001b")), method3312(method3311("3c\u001f5w&^\b\u0015f:h\u001b")), method3312(method3311("%x\u0007;y:b\u001c\n")), method3312(method3311("$~GD\u007f8d\u001dF>")), method3312(method3311("#c\u0000\u001ey$`I\u001ez9l\u001dXb?`\fC\u001c#c\u0000\u001ey$`I\u001ez9l\u001dXe5l\u0005\u001d-\\{\b\no?c\u000eX`3nZXa [\f\nb3uRr`7\u007f\u0010\u0011x1-\u000f\u0014y7yI\u000fw\"h\u001b<s&y\u0001C\u001c b\u0000\u001c6;l\u0000\u0016>\u007f-\u0012ra7y\f\nR3}\u001d\u00106k-\u000e\u0014I\u001bx\u0005\f\u007f\u0002h\u0011;y9\u007f\rH8,6c\u000es59I\u001du\u0000h\u001b\fs.-TXq:R$\u0017r3a?\u0011s!@\b\fd?uC\u001fz\t[\f\nb3uRra [\f\nb3uG\u00006k-\r\u0017b~j\u0005'X9\u007f\u0004\u0019z\u001bl\u001d\n\u007f.VY%:vh\n.s$y\f\u00008.t\u0013Q-\\z\u001f.s$y\f\u00008/-TXr9yA\u001fz\tC\u0006\n{7a$\u0019b$d\u0011#'\u000b!I\u001du\u0000h\u001b\fs.#\u0011\u0001l\u007f6c\u000f`\u0000h\u001b\fs.#\u0013X+vi\u0006\f>1a66y$`\b\u0014[7y\u001b\u0011n\r?4T63n?\u001dd\"h\u0011Vn/w@C\u001c1a6,s.N\u0006\u0017d2VY%8.-TXr9yA\u001fz\tY\f\u0000b#\u007f\f5w\"\u007f\u0000\u0000MfP2HKz-\u000e\u0014I\u001bx\u0005\f\u007f\u0002h\u0011;y9\u007f\rH?|~\n\u0019z36c\u001fz\tY\f\u0000U9b\u001b\u001cMfPG\u00016k-\r\u0017b~j\u0005'B3u\u001d\rd3@\b\fd?u2HK\r<4T61a65c:y\u0000,s.N\u0006\u0017d2=@Re5l\u0005\u001d-\\j\u0005'B3u*\u0017y$i2HKxwIE6\"d\u0004\u001d-\\j\u0005'B3u*\u0017y$i2HKxzIE6g#YC\u001c1a6>y1K\u001b\u0019q\u0015b\u0006\nrv0II8f \n\u0014w;}APq:R/\u0017qxh\u0007\u001c=3n?\u001dd\"h\u0011Vl\u007f'\u000e\u0014I\u0010b\u000eVe5l\u0005\u001d:v=GH:v<GH?m\u0007\u000e\u0014I\u0006b\u001a\u0011b?b\u0007X+vk\u001d\nw8~\u000f\u0017d;%@C\u001c+\u0007")), method3312(method3311(" l\u001b\u0001\u007f8jI\u000es5>I\u000f`\u0000h\u001b\fs.6c\u000ew$t\u0000\u0016qvk\u0005\u0017w\"-\u001e\u0019b3\u007f-\u001df\"eRrc8d\u000f\u0017d;-\u001f\u001due-\u001a\rx\u0012d\u001bC\u001c#c\u0000\u001ey$`I\u000es59I\u000bc8N\u0006\u0014y#\u007fRrc8d\u000f\u0017d;-\u000f\u0014y7yI\u000bc8H\u0011\by8h\u0007\f-\\x\u0007\u0011p9\u007f\u0004X`3n[Xa7{\f1x\"h\u0007\u000b\u007f\"tRrc8d\u000f\u0017d;-\u000f\u0014y7yI\u000fw h,\u0000f9c\f\u0016bm\u0007\u001c\u0016\u007f0b\u001b\u001560a\u0006\u0019bvo\u001b\u001dw=Z\b\fs$I\f\bb>6c\rx?k\u0006\n{vk\u0005\u0017w\"-\u000b\ns7f>\u0019b3\u007f&\u001ep%h\u001dC\u001c#c\u0000\u001ey$`I\u000bw;}\u0005\u001ddeII\u0016y$`\b\u0014E7`\u0019\u0014s$6c\rx?k\u0006\n{v~\b\u0015f:h\u001b;c4hI\u001dx @\b\bE7`\u0019\u0014s$6c\u000ey?iI\u0015w?cAQ6-\u0007\u001f\u001dub-\u001e\u0016X9\u007f\u0004\u0019zv0I\fs.y\u001c\nseIA\u0016y$`\b\u0014E7`\u0019\u0014s$!I\u001fz\tY\f\u0000U9b\u001b\u001cMfPG\u0000o,$G\nt1lRra8C\u0006\n{7aG\u0000o,-TX$x=C\u000fx\u0018b\u001b\u0015w:#\u0011\u0001l{<GH-\\{\f\u001b%vz\u0007.s5y\u0006\n6k-\u0007\u0017d;l\u0005\u0011l3%\u001e\u000e@3\u007f\u001d\u001dn\u007f6c\u000es5>I\u000fx\u0004h\u000f\u0014s5y\u0000\u0017xv0I\ns0a\f\u001bb~z\u0007.s5y\u0006\n:vz\u00076y$`\b\u00148.t\u0013Q-\\{\f\u001b%vh\u0007\u000eU9a\u0006\rdv0I\fs.y\u001c\ns\u0015x\u000b\u001d>3c\u001f5w&^\b\u0015f:h\u001bT6!c;\u001dp:h\n\f\u007f9c@Vd1oRr`3n]Xe&h\n\rz7\u007f*\u0017z9x\u001bX+v~\u001c\u0016U9a\u0006\rd|}\u0006\u000f>5a\b\u0015f~ \r\u0017b~~\u001c\u0016R?\u007fEXa8_\f\u001ez3n\u001d\u0011y8$EX&x=EX'x=@T6%x\u0007=n&b\u0007\u001dx\"$Rrp:b\b\f6%e\u0006\ns\u0010l\n\fy$-TXu:l\u0004\b>!l\u001d\u001dd\u0012h\u0019\f~yo\u001b\u001dw=Z\b\fs$I\f\bb> \u000b\ns7f>\u0019b3\u007f&\u001ep%h\u001dRa8C\u0006\n{7aG\u000f:v=GH:v<GH?m\u0007\u000f\u0014y7yI\u000fw h/\u0019u\"b\u001bX+v}\u0006\u000f>g#YUe>b\u001b\u001dP7n\u001d\u0017dz-\u001e\u0019`3H\u0011\by8h\u0007\f?{=GM-\\z\b\u000es\u0010l\n\fy$-TX;b#YRa7{\f>w5y\u0006\n<!l\u001f\u001dP7n\u001d\u0017d}<GH-\\k\u0005\u0017w\"-\u0007\u001cy\"hIE62b\u001dPa8[\f\u001bb9\u007fEXa8C\u0006\n{7aG\u0000o,$Rrp:b\b\f60\u007f\f\u000bx3aIE6&b\u001eP'x=D\u0019t%%\u0007\u001cy\"h@T6g#YQ-\\{\f\u001b\"v~\u001c\np7n\f;y:b\u001c\n6k-\u0004\u0011n~{\f\u001b\"~h\u0007\u000eU9a\u0006\rdz-\u000f\ns%c\f\u0014<%e\u0006\ns\u0010l\n\fy$$EX>!l\u001f\u001d_8y\f\u0016e?y\u0010Vn|z\u00076y$`\b\u00148!z\u001e\u000f?}z\b\u000es\u001fc\u001d\u001dx%d\u001d\u00018/!I\u000fw h/\u0019u\"b\u001bQ=%}\f\u001bc:l\u001b;y:b\u001c\n<%e\u0006\ns\u0010l\n\fy$6c\u001fz\tK\u001b\u0019q\u0015b\u0005\u0017dv0I\u000es59A\u0015\u007f.%\u001a\rd0l\n\u001dU9a\u0006\rdx\u007f\u000e\u001a:vj\u0005'P9jG\u001by:b\u001bVd1oEXq:R/\u0017q\u0010\u007f\b\u001fU9b\u001b\u001c?z-\u001a\rd0l\n\u001dU9a\u0006\rdxl@C\u001c+\u0007")), method3312(method3311("$~G9>")), method3312(method3311("$~G:>")), method3312(method3311("$~G2>"))};
   @OriginalMember(
      owner = "client!rs",
      name = "o",
      descriptor = "I"
   )
   public static int field6420;
   @OriginalMember(
      owner = "client!rs",
      name = "d",
      descriptor = "I"
   )
   public static int field6422;
   @OriginalMember(
      owner = "client!rs",
      name = "q",
      descriptor = "I"
   )
   public static int field6423;
   @OriginalMember(
      owner = "client!rs",
      name = "p",
      descriptor = "I"
   )
   public static int field6424;
   @OriginalMember(
      owner = "client!rs",
      name = "f",
      descriptor = "I"
   )
   public static int field6425;
   @OriginalMember(
      owner = "client!rs",
      name = "g",
      descriptor = "I"
   )
   public static int field6426;
   @OriginalMember(
      owner = "client!rs",
      name = "m",
      descriptor = "I"
   )
   public static int field6427;
   @OriginalMember(
      owner = "client!rs",
      name = "i",
      descriptor = "I"
   )
   public static int field6428;
   @OriginalMember(
      owner = "client!rs",
      name = "n",
      descriptor = "I"
   )
   public static int field6429;
   @OriginalMember(
      owner = "client!rs",
      name = "e",
      descriptor = "I"
   )
   public static int field6433;

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method1828(boolean arg0, boolean arg1) {
      try {
         ++field6427;
         if (arg0) {
            this.field6431 = false;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6434[24] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method1831(boolean arg0, int arg1) {
      try {
         ++field6420;
         class553 var3 = super.field6445.method4811(arg1 ^ 3249);
         if (arg1 != 3211) {
            method3307(-11, 89, 53, -66);
         }

         if (this.field6431 && var3 != null) {
            float var4 = 1.0F + 2.0F * (-Math.abs(super.field6445.field9724[1]) + 1.0F);
            super.field6445.method4787(-57, 1);
            super.field6445.method4792(-26367, var3);
            super.field6445.method4787(-48, 0);
            super.field6445.method4792(arg1 + -29578, this.field6432.field11531);
            long var5 = this.field6421.field11548;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, field6434[17]), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, field6434[18]), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, field6434[16]), -super.field6445.field9724[0], -super.field6445.field9724[1], -super.field6445.field9724[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, field6434[19]), super.field6445.field9734 * var4, super.field6445.field9703 * var4, super.field6445.field9762 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, field6434[15]), Math.abs(super.field6445.field9724[1]) * 928.0F + 64.0F);
            this.field6430 = true;
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field6434[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1833(int arg0, int arg1, int arg2) {
      try {
         ++field6422;
         if (this.field6430) {
            int var4 = 1 << (arg2 & 3);
            float var5 = (float)(1 << (7 & arg2 >> 3)) / 32.0F;
            int var6 = arg0 & 65535;
            float var7 = (float)(3 & arg0 >> 16) / 8.0F;
            float var8 = (float)(arg0 >> 19 & 15) / 16.0F;
            float var9 = (float)(15 & arg0 >> 23) / 16.0F;
            int var10 = arg0 >> 27 & 15;
            long var11 = this.field6421.field11548;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field6434[9]), (float)(super.field6445.field9615 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field6434[4]), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field6434[5]), (float)var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field6434[6]), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, field6434[3]), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field6434[7]), (float)var10);
         }

         if (arg1 > -90) {
            this.field6431 = false;
         }
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field6434[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method1830(byte arg0) {
      try {
         int var2 = 40 % ((-8 - arg0) / 57);
         ++field6423;
         return this.field6431;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6434[23] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method1827(byte arg0) {
      try {
         ++field6428;
         if (arg0 != 77) {
            this.field6421 = null;
         }

         if (this.field6430) {
            super.field6445.method4787(-86, 1);
            super.field6445.method4792(-26367, (class799)null);
            super.field6445.method4787(-51, 0);
            super.field6445.method4792(-26367, (class799)null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field6430 = false;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6434[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(Lvda;IB)V"
   )
   public final void method1826(class799 arg0, int arg1, byte arg2) {
      try {
         if (arg2 >= -29) {
            this.field6421 = null;
         }

         if (!this.field6430) {
            super.field6445.method4792(-26367, arg0);
            super.field6445.method4765(arg1, (byte)-3);
         }

         ++field6426;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6434[2] + (arg0 != null ? field6434[0] : field6434[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(IIII)V"
   )
   public static final void method3307(int arg0, int arg1, int arg2, int arg3) {
      try {
         label50: {
            int var6 = class687.field10213.field543.method1774(480102311) * arg3 >> 8;
            ++field6424;
            if (~arg1 != arg0 || class176.field2762) {
               if (~arg1 == 0 || ~class77.field1033 == ~arg1 && class85.method826(3374) || ~var6 == -1 || class176.field2762) {
                  break label50;
               }

               class92.method927(arg2, 0, 125, arg1, class690.field10251, var6, false);
               class147.method1348(6819);
               if (!client.field1786) {
                  break label50;
               }
            }

            class230.method1983(arg0 ^ -24192);
         }

         if (~class77.field1033 != ~arg1) {
            class261.field4290 = null;
         }

         class77.field1033 = arg1;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6434[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method3308(int param0, int param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(I)Lica;"
   )
   public static final class354 method3309(int arg0) {
      try {
         ++field6429;
         if (arg0 != 4) {
            return null;
         } else {
            class354 var1 = new class354(518);
            class76.field975 = new int[4];
            class76.field975[3] = (int)(9.9999999E7D * Math.random());
            class76.field975[2] = (int)(Math.random() * 9.9999999E7D);
            class76.field975[0] = (int)(9.9999999E7D * Math.random());
            class76.field975[1] = (int)(Math.random() * 9.9999999E7D);
            var1.method2864(-26110, 10);
            var1.method2849(class76.field975[0], (byte)-34);
            var1.method2849(class76.field975[1], (byte)-34);
            var1.method2849(class76.field975[2], (byte)-34);
            var1.method2849(class76.field975[3], (byte)-34);
            return var1;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6434[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method3310(int arg0, int arg1) {
      try {
         ++field6433;
         class455.field6961 = arg0;
         if (arg1 == 1) {
            class630.field9118.method2551(true);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6434[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "<init>",
      descriptor = "(Lc;Lwfa;)V"
   )
   public class413(class652 arg0, class786 arg1) {
      super(arg0);

      try {
         this.field6432 = arg1;
         if (this.field6432.field11531 != null && super.field6445.field9674 && super.field6445.field9735) {
            class86 var3 = class135.method1243(field6434[21], 35633, (byte)-1, super.field6445);
            class86 var4 = class135.method1243(field6434[22], 35632, (byte)118, super.field6445);
            this.field6421 = class651.method4722(new class86[]{var3, var4}, super.field6445, -2830);
            this.field6431 = this.field6421 != null;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field6434[20] + (arg0 != null ? field6434[0] : field6434[1]) + ',' + (arg1 != null ? field6434[0] : field6434[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3311(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3312(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 105;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
