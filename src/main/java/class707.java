import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class707 extends class14 {
   @OriginalMember(
      owner = "client!wca",
      name = "z",
      descriptor = "Z"
   )
   private boolean field10320 = false;
   @OriginalMember(
      owner = "client!wca",
      name = "w",
      descriptor = "Z"
   )
   private boolean field10331 = false;
   @OriginalMember(
      owner = "client!wca",
      name = "y",
      descriptor = "Lds;"
   )
   private class16 field10323;
   @OriginalMember(
      owner = "client!wca",
      name = "u",
      descriptor = "Lvv;"
   )
   private class345 field10332;
   @OriginalMember(
      owner = "client!wca",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10333 = new String[]{method5145(method5144("K!>J(\u0014")), method5145(method5144("O71 \tN")), method5145(method5144("O71'\u000fP-*\u0016")), method5145(method5144("R--\t\u0001P\u0011>\t\u0010P'-")), method5145(method5144("Y,))\u0001L\u0011>\t\u0010P'-")), method5145(method5144("O71!\u0018L-1\u0001\u000eH")), method5145(method5144("^0:\u0005\u000bk#+\u0001\u0012x'/\u0010\b")), method5145(method5144("O!>\b\u0005")), method5145(method5144("K!>J#\u0014")), method5145(method5144("^0:\u0005\u000bk#+\u0001\u0012s$9\u0017\u0005H")), method5145(method5144("H+2\u0001")), method5145(method5144("K!>J!\u0014")), method5145(method5144("GlqJ\u001d")), method5145(method5144("R73\b")), method5145(method5144("K!>J'\u0014")), method5145(method5144("K!>J%\u0014")), method5145(method5144("K!>J\"\u0014")), method5145(method5144("K!>J*\u0014")), method5145(method5144("K!>J)\u0014")), method5145(method5144("J#-\u001d\tR%\u007f\u0012\u0005_q\u007f\u0013\u0016j'-\u0010\u0005DyU\u0012\u0001N;6\n\u0007\u001c$3\u000b\u0001Hb(\u0005\u0014Y0\u001b\u0001\u0010H*dn\u0015R+9\u000b\u0012Qb)\u0001\u0003\u000fb,\u0011\u000ex+-_jI,6\u0002\u000fN/\u007f\u0012\u0005_v\u007f\u0017\u0015R\u00010\b\u000fI0dn\u0015R+9\u000b\u0012Qb9\b\u000f]6\u007f\u0017\u0015R\u0007'\u0014\u000fR'1\u0010[671\r\u0006S02D\u0006P->\u0010@^0:\u0005\u000bk#+\u0001\u0012x'/\u0010\b\u0007H*\n\tZ--\t@Z.0\u0005\u0014\u001c -\u0001\u0001W\u0015>\u0010\u0005N\r9\u0002\u0013Y6dn\u0015R+9\u000b\u0012Qb,\u0005\rL.:\u0016Sxb1\u000b\u0012Q#37\u0001Q23\u0001\u0012\u0007H*\n\tZ--\t@O#2\u0014\fY0\u001c\u0011\u0002Yb:\n\u0016q#/7\u0001Q23\u0001\u0012\u0007H)\u000b\tXb2\u0005\tRjvD\u001b64:\u0007T\u001c51*\u000fN/>\b@\u0001b+\u0001\u0018H7-\u0001Sxj1\u000b\u0012Q#37\u0001Q23\u0001\u0012\u0010b8\b?h'''\u000fS0;?Pal'\u001d\u001a\u0015l-\u0006\u0007]yU\u0013\u000er--\t\u0001Pl'\u001d\u001a\u001c\u007f\u007fVN\fh(\n.S02\u0005\f\u0012:&\u001eM\rlo_jJ'<W@K,\t\u0001\u0003H--D]\u001c,0\u0016\r].6\u001e\u0005\u00145)2\u0005N6:\u001cI\u0007H)\u0001\u0003\u000fb(\n2Y$3\u0001\u0003H+0\n@\u0001b-\u0001\u0006P'<\u0010HK,\t\u0001\u0003H--H@K,\u0011\u000b\u0012Q#3J\u0018E8v_jJ'<W@Y,)'\u000fP-*\u0016@\u0001b+\u0001\u0018H7-\u0001#I :L\u0005R4\u0012\u0005\u0010o#2\u0014\fY0sD\u0017R\u0010:\u0002\fY!+\r\u000fRkq\u0016\u0007^yU\u0012\u0005_v\u007f\u0017\u0010Y!*\b\u0001N\u00010\b\u000fI0\u007fY@O71'\u000fP-*\u0016JL-(L\u0003P#2\u0014H\u0011&0\u0010HO71 \tNn\u007f\u0013\u000en'9\b\u0005_66\u000b\u000e\u0015n\u007fTN\fn\u007fUN\fksD\u0013I,\u001a\u001c\u0010S,:\n\u0014\u0015yU\u0002\fS#+D\u0013T--\u0001&]!+\u000b\u0012\u001c\u007f\u007f\u0007\f]//L\u0017]6:\u0016$Y2+\fO^0:\u0005\u000bk#+\u0001\u0012x'/\u0010\b\u0011 -\u0001\u0001W\u0015>\u0010\u0005N\r9\u0002\u0013Y6u\u0013\u000er--\t\u0001Pl(H@\floH@\rloM[6$3\u000b\u0001Hb1\u0000\u000fH'\u007fY@X-+L\u0017R\u0014:\u0007\u0014S0sD\u0017R\f0\u0016\r].q\u001c\u0019Fkdn\u0006P->\u0010@Z0:\u0017\u000eY.\u007fY@L-(LQ\u0012rr\u0005\u0002Oj1\u0000\u000fH'vH@\u000eloM[64:\u0007T\u001c1*\u0016\u0006]!:'\u000fP-*\u0016@\u0001b)\u0001\u0003\bj:\n\u0016\u007f-3\u000b\u0015Nn\u007f\u0002\u0012Y11\u0001\f\u001617\u000b\u0012Y\u0004>\u0007\u0014S0vO\u0013L'<\u0011\f]0\u001c\u000b\fS7-N\u0013T--\u0001&]!+\u000b\u0012\u0007H8\b?z0>\u0003#S.0\u0016@\u0001b)\u0001\u0003\bj2\r\u0018\u00141*\u0016\u0006]!:'\u000fP-*\u0016NN%=H@[.\u0000\"\u000f[l<\u000b\fS0q\u0016\u0007^n\u007f\u0003\fc\u00040\u0003&N#8'\u000fS0;ML\u001c1*\u0016\u0006]!:'\u000fP-*\u0016N]kdn\u001d6")), method5145(method5144("K!>J\\U,6\u0010^\u0014")), method5145(method5144("I,6\u0002\u000fN/\u007f\u0002\fS#+D\u0014U/:_jI,6\u0002\u000fN/\u007f\u0002\fS#+D\u0013_#3\u0001[64>\u0016\u0019U,8D\u0016Y!lD\u0017J\u0014:\u0016\u0014Y:dn\u0016]0&\r\u000e[b9\b\u000f]6\u007f\u0013\u0001H'- \u0005L67_jJ-6\u0000@Q#6\nH\u0015b$n\u0017]6:\u0016$Y2+\f@\u0001b8\b?q73\u0010\th'''\u000fS0;TNFyU\u0012\u0005_v\u007f\u0001\u0003j'-\u0010\u0005DbbD\u0007P\u001d\u0012\u000b\u0004Y.\t\r\u0005K\u000f>\u0010\u0012U:u\u0003\fc\u0014:\u0016\u0014Y:dn\u0017J\u0014:\u0016\u0014Y:q\u001c@\u0001b;\u000b\u0014\u0014%3;.S02\u0005\fq#+\u0016\tD\u0019o9L\u001c'<2\u0005N6:\u001cND;%M[65)2\u0005N6:\u001cNEbbD\u0004S6w\u0003\fc\f0\u0016\r].\u0012\u0005\u0014N+'?Qan\u007f\u0001\u0003j'-\u0010\u0005Dl'\u001d\u001a\u0015yU\u0013\u0016j'-\u0010\u0005Dl%D]\u001c&0\u0010H[.\u0000*\u000fN/>\b-]6-\r\u0018gp\u0002H@Y!\t\u0001\u0012H''J\u0018E8v_j[.\u00000\u0005D\u00010\u000b\u0012X\u0019o9NDbbD\u0004S6w\u0003\fc\u0016:\u001c\u0014I0:)\u0001H06\u001c;\f\u001f\u0004T=\u0010b8\b?q73\u0010\th'''\u000fS0;TI\u00161<\u0005\fYyU\u0003\fc\u0016:\u001c#S--\u0000;\f\u001fq\u001d@\u0001b;\u000b\u0014\u0014%3;4Y:+\u0011\u0012Y\u000f>\u0010\u0012U:\u0004T=gs\u0002H@[.\u0000)\u0015P660\u0005D\u00010\u000b\u0012XrvN\u0013_#3\u0001[6%3;4Y:\u001c\u000b\u000fN&\u0004T=\u00128\u007fY@H+2\u0001[6%3;4Y:\u001c\u000b\u000fN&\u0004T=\u00125\u007fY@\rlo_j[.\u0000\"\u000f[\u0004-\u0005\u0007\u007f-0\u0016\u0004\u001c\u007f\u007fUN\fo<\b\u0001Q2wL\u0007P\u001d\u0019\u000b\u0007\u0012'1\u0000KY!\t\u0001\u0012H''J\u001a\u0015h8\b?z-8J\u0013_#3\u0001L\u001crqTL\u001csqTI\u0007H8\b?l-,\r\u0014U-1D]\u001c$+\u0016\u0001R19\u000b\u0012Qjv_jAH")), method5145(method5144("K!>J+\u0014"))};
   @OriginalMember(
      owner = "client!wca",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field10328 = null;
   @OriginalMember(
      owner = "client!wca",
      name = "x",
      descriptor = "I"
   )
   public static int field10319;
   @OriginalMember(
      owner = "client!wca",
      name = "n",
      descriptor = "I"
   )
   public static int field10321;
   @OriginalMember(
      owner = "client!wca",
      name = "p",
      descriptor = "I"
   )
   public static int field10322;
   @OriginalMember(
      owner = "client!wca",
      name = "o",
      descriptor = "I"
   )
   public static int field10324;
   @OriginalMember(
      owner = "client!wca",
      name = "t",
      descriptor = "I"
   )
   public static int field10325;
   @OriginalMember(
      owner = "client!wca",
      name = "r",
      descriptor = "I"
   )
   public static int field10326;
   @OriginalMember(
      owner = "client!wca",
      name = "v",
      descriptor = "I"
   )
   public static int field10329;
   @OriginalMember(
      owner = "client!wca",
      name = "s",
      descriptor = "I"
   )
   public static int field10330;
   @OriginalMember(
      owner = "client!wca",
      name = "q",
      descriptor = "Lkf;"
   )
   public static class266 field10327;

   @OriginalMember(
      owner = "client!wca",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method85(int arg0) {
      try {
         ++field10330;
         if (this.field10331) {
            super.field157.method4112((byte)110, 1);
            super.field157.method4107(-121, (class486)null);
            super.field157.method4112((byte)107, 0);
            super.field157.method4107(92, (class486)null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field10331 = false;
         }

         if (arg0 != 17328) {
            field10327 = null;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10333[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "<init>",
      descriptor = "(Lea;Lds;)V"
   )
   public class707(class573 arg0, class16 arg1) {
      super(arg0);

      try {
         this.field10323 = arg1;
         if (this.field10323.field181 != null && super.field157.field8456 && super.field157.field8482) {
            class373 var3 = class508.method3694(true, 35633, field10333[21], super.field157);
            class373 var4 = class508.method3694(true, 35632, field10333[19], super.field157);
            this.field10332 = class672.method4888(new class373[]{var3, var4}, 120, super.field157);
            this.field10320 = this.field10332 != null;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field10333[20] + (arg0 != null ? field10333[12] : field10333[13]) + ',' + (arg1 != null ? field10333[12] : field10333[13]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public static final boolean method5141(int arg0, byte arg1, int arg2) {
      try {
         ++field10326;
         if (arg1 != -32) {
            method5143(48);
         }

         return ~(arg2 & 16) != -1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10333[18] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method82(int arg0, int arg1, int arg2) {
      try {
         if (this.field10331) {
            int var4 = 1 << (3 & arg1);
            float var5 = (float)(1 << ((arg1 & 58) >> 3)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float)((199652 & arg2) >> 16) / 8.0F;
            long var8 = this.field10332.field4666;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field10333[10]), (float)(super.field157.field8355 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field10333[7]), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field10333[6]), (float)var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field10333[9]), var7);
         }

         ++field10329;
         if (arg0 != 13880) {
            this.method85(-56);
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field10333[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method5142(int arg0) {
      try {
         if (class220.field3138 < arg0) {
            class478.field6866 = -1;
            class220.field3138 = 0;
            class74.field908 = -1;
         }

         ++field10321;
         if (~class220.field3138 < ~class650.field9524) {
            class220.field3138 = class650.field9524;
            class478.field6866 = -1;
            class74.field908 = -1;
         }

         if (~class224.field3191 > -1) {
            class224.field3191 = 0;
            class478.field6866 = -1;
            class74.field908 = -1;
         }

         if (class224.field3191 > class650.field9503) {
            class478.field6866 = -1;
            class74.field908 = -1;
            class224.field3191 = class650.field9503;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10333[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method88(int arg0, boolean arg1) {
      try {
         if (arg0 == 16) {
            ++field10319;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10333[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method5143(int arg0) {
      try {
         if (arg0 != 23890) {
            field10327 = null;
         }

         field10327 = null;
         field10328 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10333[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method84(boolean arg0, int arg1) {
      try {
         ++field10325;
         if (arg1 == 13254) {
            class212 var3 = super.field157.method4171(arg1 + -18943);
            if (this.field10320 && var3 != null) {
               super.field157.method4112((byte)118, 1);
               super.field157.method4107(-126, var3);
               super.field157.method4112((byte)-121, 0);
               super.field157.method4107(48, this.field10323.field181);
               long var4 = this.field10332.field4666;
               OpenGL.glUseProgramObjectARB(var4);
               OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field10333[3]), 0);
               OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field10333[4]), 1);
               OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, field10333[1]), -super.field157.field8405[0], -super.field157.field8405[1], -super.field157.field8405[2]);
               OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, field10333[2]), super.field157.field8402, super.field157.field8440, super.field157.field8442, 1.0F);
               OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, field10333[5]), Math.abs(super.field157.field8405[1]) * 928.0F + 96.0F);
               this.field10331 = true;
            }
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field10333[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "(BLsl;I)V"
   )
   public final void method86(byte arg0, class486 arg1, int arg2) {
      try {
         ++field10324;
         if (arg0 <= 75) {
            this.field10332 = null;
         }

         if (!this.field10331) {
            super.field157.method4107(11, arg1);
            super.field157.method4134(arg2, 2);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10333[14] + arg0 + ',' + (arg1 != null ? field10333[12] : field10333[13]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method87(int arg0) {
      try {
         if (arg0 >= -49) {
            method5141(-114, (byte)88, 93);
         }

         ++field10322;
         return false;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10333[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5144(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5145(char[] arg0) {
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
            var10005 = 66;
            break;
         case 2:
            var10005 = 95;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
