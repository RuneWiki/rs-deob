import jaggl.OpenGL;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public class class794 extends class125 {
   @OriginalMember(
      owner = "client!tea",
      name = "f",
      descriptor = "Z"
   )
   private boolean field11613 = false;
   @OriginalMember(
      owner = "client!tea",
      name = "i",
      descriptor = "Z"
   )
   private boolean field11615 = false;
   @OriginalMember(
      owner = "client!tea",
      name = "o",
      descriptor = "Luda;"
   )
   private class56 field11607;
   @OriginalMember(
      owner = "client!tea",
      name = "q",
      descriptor = "Lua;"
   )
   private class666 field11619;
   @OriginalMember(
      owner = "client!tea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11621 = new String[]{method5731(method5730("gR\u0007Eo;")), method5731(method5730("h\u0019HEZ")), method5731(method5730("}B\n\u0007")), method5731(method5730("fY\u000f\rHaZF\rK|V\u0012KSzZ\u0003P-fY\u000f\rHaZF\rK|V\u0012KTpV\n\u000e\u001c\u0019A\u0007\u0019^zY\u0001KQvTUKPea\u0003\u0019SvO]aQrE\u001f\u0002It\u0017\u0000\u0007HrCF\u001cFgR\u0014/BcC\u000eP-eX\u000f\u000f\u0007~V\u000f\u0005\u000f:\u0017\u001daPrC\u0003\u0019cvG\u0012\u0003\u0007.\u0017\u0001\u0007x^B\n\u001fNGR\u001e(H|E\u0002[\ti\fl\u001dBp\u0003F\u000eDER\u0014\u001fBk\u0017[K@\u007fh+\u0004Cv[0\u0002Bdz\u0007\u001fUzOL\fKLa\u0003\u0019SvO]aPea\u0003\u0019SvOH\u0013\u0007.\u0017\u0002\u0004S;P\n4i|E\u000b\nK^V\u0012\u0019NklV6\u000b3R\u0005=BaC\u0003\u0013\tkN\u001cB\u001c\u0019@\u0010=BaC\u0003\u0013\tj\u0017[KC|CN\fKLy\t\u0019Jr[+\nSa^\u001e0\u0016N\u001bF\u000eDER\u0014\u001fBk\u0019\u001e\u0012]:\fl\u001cQER\u0014\u001fBk\u0019\u001cK\u001a3S\t\u001f\u000ft[9%HaZ\u0007\u0007jrC\u0014\u0002_H\u0005;G\u0007vT0\u000eUgR\u001eE_jMOP-t[9?Bkt\t\u0004UwlV6\tk\u0017[KC|CN\fKLc\u0003\u0013SfE\u0003&FgE\u000f\u0013|#j=[z?\u0017\u0001\u0007x^B\n\u001fNGR\u001e(H|E\u0002[\u000e9D\u0005\nKv\fl\fKLc\u0003\u0013d|X\u0014\u000f|#jH\u0012\u0007.\u0017\u0002\u0004S;P\n4svO\u0012\u001eUvz\u0007\u001fUzO=[zH\u0006;G\u0007t[9&R\u007fC\u000f?Bkt\t\u0004Uw\u0007OATpV\n\u000e\u001c\u0019P\n4svO%\u0004HaS=[z=MFV\u0007g^\u000b\u000e\u001c\u0019P\n4svO%\u0004HaS=[z=@FV\u0007\"\u0019VP-t[9-Htq\u0014\n@PX\t\u0019C3\nFZ\t#\u001a\u0005\u0007F~GNC@\u007fh \u0004@=R\b\u000f\fvT0\u000eUgR\u001eE]:\u001d\u0001\u0007xUX\u0001ETpV\n\u000e\u000b3\u0007H[\u000b3\u0006H[\u000e(=\u0001\u0007xCX\u0015\u0002SzX\bK\u001a3Q\u0012\u0019F}D\u0000\u0004U~\u001fOP-n=")), method5731(method5730("gR\u0007E\u001bzY\u000f\u001f\u0019;")), method5731(method5730("eV\u0014\u0012N}PF\u001dBp\u0004F\u001cQER\u0014\u001fBk\fl\u001dFaN\u000f\u0005@3Q\n\u0004Fg\u0017\u0011\nSvE\"\u000eWg_]aR}^\u0000\u0004U~\u0017\u0010\u000eD \u0017\u0015\u001eIW^\u0014P-fY\u000f\rHaZF\u001dBp\u0003F\u0018R}t\t\u0007HfE]aR}^\u0000\u0004U~\u0017\u0000\u0007HrCF\u0018R}r\u001e\u001bH}R\b\u001f\u001c\u0019B\b\u0002A|E\u000bKA\u007fX\u0007\u001f\u0007qE\u0003\nLDV\u0012\u000eUWR\u0016\u001fO(=\u0013\u0005NuX\u0014\u0006\u0007u[\t\nS3U\u0014\u000eFx`\u0007\u001fBax\u0000\rTvC]aR}^\u0000\u0004U~\u0017\u0015\nJc[\u0003\u0019\u0014W\u0017\b\u0004U~V\n8F~G\n\u000eU(=\u0013\u0005NuX\u0014\u0006\u0007`V\u000b\u001bKvE%\u001eEv\u0017\u0003\u0005Q^V\u00168F~G\n\u000eU(=\u0010\u0004Nw\u0017\u000b\nN}\u001fOK\\\u0019A\u0003\b\u00133@\b%HaZ\u0007\u0007\u0007.\u0017\u0012\u000e_gB\u0014\u000e\u0014W\u001f\b\u0004U~V\n8F~G\n\u000eU?\u0017\u0001\u0007xGR\u001e(H|E\u00020\u0017N\u0019\u001e\u0012]:\u0019\u0014\t@r\fl\u001cI]X\u0014\u0006F\u007f\u0019\u001e\u0012]3\nFY\t#\u001d\u0011\u0005i|E\u000b\nK=O\u001f\u0011\n\"\u0019VP-eR\u0005X\u0007dY0\u000eDgX\u0014K\u001a3Y\t\u0019Jr[\u000f\u0011B;@\u0010=BaC\u0003\u0013\u000e(=\u0010\u000eD \u0017\u0011\u0005uvQ\n\u000eDg^\t\u0005\u0007.\u0017\u0014\u000eA\u007fR\u0005\u001f\u000fdY0\u000eDgX\u0014G\u0007dY(\u0004U~V\nE_jMOP-eR\u0005X\u0007vY\u0010(H\u007fX\u0013\u0019\u0007.\u0017\u0012\u000e_gB\u0014\u000edfU\u0003CB}A+\nW@V\u000b\u001bKvEJKP}e\u0003\rKvT\u0012\u0002H}\u001eH\u0019@q\fl\u001dBp\u0003F\u0018WvT\u0013\u0007Fat\t\u0007HfEFV\u0007`B\b(H\u007fX\u0013\u0019\rcX\u0011CD\u007fV\u000b\u001b\u000f>S\t\u001f\u000f`B\b/Na\u001bF\u001cIAR\u0000\u0007BpC\u000f\u0004I:\u001bF[\t#\u001bFZ\t#\u001eJKTfY#\u0013W|Y\u0003\u0005S:\fl\rK|V\u0012KT{X\u0014\u000earT\u0012\u0004U3\nF\bKrZ\u0016CPrC\u0003\u0019cvG\u0012\u0003\bqE\u0003\nLDV\u0012\u000eUWR\u0016\u001fO>U\u0014\u000eFx`\u0007\u001fBax\u0000\rTvCL\u001cI]X\u0014\u0006F\u007f\u0019\u0011G\u0007#\u0019VG\u0007\"\u0019VB\u001c\u0019Q\n\u0004Fg\u0017\b\u000fHgRFV\u0007wX\u0012CP}a\u0003\bS|EJKP}y\t\u0019Jr[H\u0013^i\u001e]aA\u007fX\u0007\u001f\u0007uE\u0003\u0018Iv[FV\u0007cX\u0011C\u0016=\u0007K\nE`\u001f\b\u000fHgROG\u0007!\u0019VB\u001c\u0019A\u0003\b\u00133D\u0013\u0019ArT\u0003(H\u007fX\u0013\u0019\u0007.\u0017\u0010\u000eD'\u001f\u0003\u0005QPX\n\u0004Ra\u001bF\rUvD\b\u000eK9D\u000e\u0004Uvq\u0007\bS|EO@TcR\u0005\u001eKrE%\u0004K|B\u0014AT{X\u0014\u000earT\u0012\u0004U(=\u0001\u0007xUE\u0007\fd|[\t\u0019\u0007.\u0017\u0010\u000eD'\u001f\u000b\u0002_;D\u0013\u0019ArT\u0003(H\u007fX\u0013\u0019\taP\u0004G\u0007t[9-Ht\u0019\u0005\u0004K|EH\u0019@q\u001bF\fKLq\t\faaV\u0001(H|E\u0002B\u000b3D\u0013\u0019ArT\u0003(H\u007fX\u0013\u0019\tr\u001e]aZ\u0019")), method5731(method5730("gR\u0007Ef;")), method5731(method5730("gR\u0007Ec;")), method5731(method5730("gR\u0007E`;")), method5731(method5730("gR\u0007Ed;")), method5731(method5730("`B\b._cX\b\u000eIg")), method5731(method5730("vY\u0010&Fcd\u0007\u0006W\u007fR\u0014")), method5731(method5730("gR\u0007Em;")), method5731(method5730("`B\b/Na")), method5731(method5730("`B\b(H\u007fX\u0013\u0019")), method5731(method5730("}X\u0014\u0006F\u007fd\u0007\u0006W\u007fR\u0014")), method5731(method5730("qE\u0003\nLDV\u0012\u000eU\\Q\u0000\u0018Bg")), method5731(method5730("gR\u0007Ea;")), method5731(method5730("g^\u000b\u000e")), method5731(method5730("qE\u0003\nLDV\u0012\u000eUWR\u0016\u001fO")), method5731(method5730("`T\u0007\u0007B")), method5731(method5730("gR\u0007Eb;"))};
   @OriginalMember(
      owner = "client!tea",
      name = "s",
      descriptor = "I"
   )
   public static int field11611 = -1;
   @OriginalMember(
      owner = "client!tea",
      name = "u",
      descriptor = "Lifa;"
   )
   public static class75 field11616 = new class75(6, 8);
   @OriginalMember(
      owner = "client!tea",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field11617 = new int[13];
   @OriginalMember(
      owner = "client!tea",
      name = "n",
      descriptor = "I"
   )
   public static int field11605;
   @OriginalMember(
      owner = "client!tea",
      name = "p",
      descriptor = "I"
   )
   public static int field11606;
   @OriginalMember(
      owner = "client!tea",
      name = "m",
      descriptor = "I"
   )
   public static int field11608;
   @OriginalMember(
      owner = "client!tea",
      name = "t",
      descriptor = "I"
   )
   public static int field11609;
   @OriginalMember(
      owner = "client!tea",
      name = "r",
      descriptor = "I"
   )
   public static int field11610;
   @OriginalMember(
      owner = "client!tea",
      name = "h",
      descriptor = "I"
   )
   public static int field11612;
   @OriginalMember(
      owner = "client!tea",
      name = "g",
      descriptor = "I"
   )
   public static int field11614;
   @OriginalMember(
      owner = "client!tea",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field11620;
   @OriginalMember(
      owner = "client!tea",
      name = "l",
      descriptor = "[Lpd;"
   )
   public static class648[] field11618;

   @OriginalMember(
      owner = "client!tea",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method343(boolean arg0, int arg1) {
      try {
         ++field11610;
         if (arg1 != 3) {
            this.method340(65);
         }

         class789 var3 = super.field1630.method3986(3042);
         if (this.field11615 && var3 != null) {
            super.field1630.method3988(-128, 1);
            super.field1630.method4006(var3, (byte)-121);
            super.field1630.method3988(arg1 ^ -125, 0);
            super.field1630.method4006(this.field11607.field754, (byte)21);
            long var4 = this.field11619.field9866;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field11621[15]), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field11621[11]), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, field11621[13]), -super.field1630.field7684[0], -super.field1630.field7684[1], -super.field1630.field7684[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, field11621[14]), super.field1630.field7722, super.field1630.field7713, super.field1630.field7706, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, field11621[10]), 96.0F + Math.abs(super.field1630.field7684[1]) * 928.0F);
            this.field11613 = true;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field11621[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tea",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method341(int arg0, int arg1, int arg2) {
      try {
         if (arg0 > -125) {
            field11620 = null;
         }

         if (this.field11613) {
            int var4 = 1 << (arg2 & 3);
            float var5 = (float)(1 << ((57 & arg2) >> 3)) / 32.0F;
            int var6 = 65535 & arg1;
            float var7 = (float)((257533 & arg1) >> 16) / 8.0F;
            long var8 = this.field11619.field9866;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field11621[18]), (float)(super.field1630.field7640 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field11621[20]), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field11621[19]), (float)var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field11621[16]), var7);
         }

         ++field11605;
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field11621[17] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tea",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method340(int arg0) {
      try {
         if (this.field11613) {
            super.field1630.method3988(-128, 1);
            super.field1630.method4006((class549)null, (byte)-127);
            super.field1630.method3988(-128, 0);
            super.field1630.method4006((class549)null, (byte)61);
            OpenGL.glUseProgramObjectARB(0L);
            this.field11613 = false;
         }

         if (arg0 != 5) {
            this.field11615 = true;
         }

         ++field11606;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11621[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tea",
      name = "<init>",
      descriptor = "(Liu;Luda;)V"
   )
   public class794(class530 arg0, class56 arg1) {
      super(arg0);

      try {
         this.field11607 = arg1;
         if (this.field11607.field754 != null && super.field1630.field7687 && super.field1630.field7759) {
            class8 var3 = class468.method3557(super.field1630, 2, field11621[3], 35633);
            class8 var4 = class468.method3557(super.field1630, 2, field11621[5], 35632);
            this.field11619 = class597.method4445(super.field1630, (byte)-115, new class8[]{var3, var4});
            this.field11615 = this.field11619 != null;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field11621[4] + (arg0 != null ? field11621[1] : field11621[2]) + ',' + (arg1 != null ? field11621[1] : field11621[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tea",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method5727(int arg0) {
      try {
         field11616 = null;
         field11620 = null;
         field11618 = null;
         field11617 = null;
         if (arg0 < 72) {
            method5728(-92, -112);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11621[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tea",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method5728(int arg0, int arg1) {
      class731 var2 = class548.field8080[0][arg0][arg1];

      for(int var3 = 0; var3 < 3; ++var3) {
         class731 var4 = class548.field8080[var3][arg0][arg1] = class548.field8080[var3 + 1][arg0][arg1];
         if (var4 != null) {
            for(class131 var5 = var4.field10654; var5 != null; var5 = var5.field1670) {
               class680 var6 = var5.field1676;
               if (var6.field10010 == arg0 && var6.field10011 == arg1) {
                  --var6.field10457;
               }
            }

            if (var4.field10649 != null) {
               --var4.field10649.field10457;
            }

            if (var4.field10656 != null) {
               --var4.field10656.field10457;
            }

            if (var4.field10642 != null) {
               --var4.field10642.field10457;
            }

            if (var4.field10655 != null) {
               --var4.field10655.field10457;
            }

            if (var4.field10651 != null) {
               --var4.field10651.field10457;
            }
         }
      }

      if (class548.field8080[0][arg0][arg1] == null) {
         class548.field8080[0][arg0][arg1] = new class731(0);
         class548.field8080[0][arg0][arg1].field10647 = 1;
      }

      class548.field8080[0][arg0][arg1].field10646 = var2;
      class548.field8080[3][arg0][arg1] = null;
   }

   @OriginalMember(
      owner = "client!tea",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;II)V"
   )
   public static final void method5729(Rectangle[] arg0, int arg1, int arg2) throws class221 {
      try {
         ++field11612;
         if (arg1 != 3) {
            method5727(110);
         }

         if (~class175.field2258 == -2) {
            class497.field6954.method472(arg0, arg2, class453.field6250, class409.field5641);
         } else {
            class497.field6954.method472(arg0, arg2, 0, 0);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field11621[0] + (arg0 != null ? field11621[1] : field11621[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tea",
      name = "a",
      descriptor = "(Lll;II)V"
   )
   public final void method345(class549 arg0, int arg1, int arg2) {
      try {
         if (arg1 != -23385) {
            this.field11615 = false;
         }

         ++field11614;
         if (!this.field11613) {
            super.field1630.method4006(arg0, (byte)-125);
            super.field1630.method4009(arg2, 1);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field11621[7] + (arg0 != null ? field11621[1] : field11621[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tea",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method346(boolean arg0, boolean arg1) {
      try {
         if (arg0) {
            ++field11608;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field11621[21] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tea",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method347(boolean arg0) {
      try {
         if (arg0) {
            this.method345((class549)null, 101, -56);
         }

         ++field11609;
         return false;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11621[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5730(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5731(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 107;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
