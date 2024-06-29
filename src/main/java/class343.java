import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class343 extends class757 {
   @OriginalMember(
      owner = "client!db",
      name = "q",
      descriptor = "Z"
   )
   private boolean field4918 = false;
   @OriginalMember(
      owner = "client!db",
      name = "y",
      descriptor = "Z"
   )
   private boolean field4921 = false;
   @OriginalMember(
      owner = "client!db",
      name = "k",
      descriptor = "Lee;"
   )
   private class707 field4922;
   @OriginalMember(
      owner = "client!db",
      name = "p",
      descriptor = "Lon;"
   )
   private class356 field4923;
   @OriginalMember(
      owner = "client!db",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4927 = new String[]{method2722(method2721("B\u0019\u0001QW")), method2722(method2721("B\u0019\u0001RW")), method2722(method2721("S\u0015Fr\u0010T\u0016\u000fr\u0013I\u001a[4\u000bO\u0016J/uS\u0015Fr\u0010T\u0016\u000fr\u0013I\u001a[4\fE\u001aCqD,\rNf\u0006O\u0015H4\tC\u0018\u001c4\bP-Jf\u000bC\u0003\u0014\u001e\tG\tV}\u0011A[Ix\u0010G\u000f\u000fc\u001eR\u001e]P\u001aV\u000fG/uP\u0014Fp_K\u001aFzW\u000f[T\u001e\bG\u000fJf;C\u000b[|_\u001b[Hx k\u000eC`\u0016r\u001eWW\u0010I\tK$Q\\@%b\u001aEO\u000fq\u001cp\u001e]`\u001a^[\u00124\u0018J$b{\u001bC\u0017y}\u001aQ6N`\rO\u0003\u0005s\u0013y-Jf\u000bC\u0003\u0014\u001e\bP-Jf\u000bC\u0003\u0001l_\u001b[K{\u000b\u000e\u001cCK1I\tBu\u0013k\u001a[f\u0016^ \u001fIS\u0006\u001eLB\u001aT\u000fJlQ^\u0002U=D,\fYB\u001aT\u000fJlQ_[\u00124\u001bI\u000f\u0007s\u0013y5@f\u0012G\u0017bu\u000bT\u0012WON{W\u000fq\u001cp\u001e]`\u001a^UWm\u0005\u000f@%c\tp\u001e]`\u001a^UU4B\u0006\u001f@`WA\u0017pZ\u0010T\u0016Nx2G\u000f]}\u0007}Ir8_C\u0018yq\rR\u001eW:\u0007_\u0001\u0006/uA\u0017p@\u001a^8@{\rB \u001fIQ^[\u00124\u001bI\u000f\u0007s\u0013y/Jl\u000bS\tJY\u001eR\tFl$\u0016&t$\"\n[Hx k\u000eC`\u0016r\u001eWW\u0010I\tK$V\f\bLu\u0013C@%s\u0013y/Jl<I\u0014]p$\u0016&\u0001m_\u001b[K{\u000b\u000e\u001cCK+C\u0003[a\rC6N`\rO\u0003t$\"}Jr8_A\u0017pY\nJ\u000fF@\u001a^8@{\rBK\u0006>\fE\u001aCqD,\u001cCK+C\u0003l{\u0010T\u001ft$\"\b\u0001\u000f)_R\u0012BqD,\u001cCK+C\u0003l{\u0010T\u001ft$\"\b\f\u000f)_\u0017U\u001f/uA\u0017pR\u0010A=]u\u0018e\u0014@f\u001b\u0006F\u000f%Q\u0016VLx\u001eK\u000b\u0007<\u0018J$i{\u0018\b\u001eApTC\u0018yq\rR\u001eW:\u0005\u000fQHx `\u0014H:\fE\u001aCqS\u0006K\u0001$S\u0006J\u0001$V\u001dqHx v\u0014\\}\u000bO\u0014A4B\u0006\u001d[f\u001eH\bI{\rKS\u0006/u[q")), method2722(method2721("H\u000eCx")), method2722(method2721("]U\u0001:\u0002")), method2722(method2721("B\u0019\u0001(\u0016H\u0012[*W")), method2722(method2721("P\u001a]m\u0016H\u001c\u000fb\u001aEH\u000fc\tp\u001e]`\u001a^@%b\u001eT\u0002Fz\u0018\u0006\u001dC{\u001eR[Xu\u000bC\tkq\u000fR\u0013\u0014\u001e\nH\u0012I{\rK[Yq\u001c\u0015[\\a\u0011b\u0012]/uS\u0015Fr\u0010T\u0016\u000fb\u001aEO\u000fg\nH8@x\u0010S\t\u0014\u001e\nH\u0012I{\rK[Ix\u0010G\u000f\u000fg\nH>Wd\u0010H\u001eA`D,\u000eA}\u0019I\tB4\u0019J\u0014N`_D\tJu\u0014q\u001a[q\rb\u001e_`\u0017\u001dqZz\u0016@\u0014]y_@\u0017@u\u000b\u0006\u0019]q\u001eM,N`\u001aT4Ir\fC\u000f\u0014\u001e\nH\u0012I{\rK[\\u\u0012V\u0017JfLb[A{\rK\u001aCG\u001eK\u000bCq\r\u001dqZz\u0016@\u0014]y_U\u001aBd\u0013C\tla\u001dC[Jz\tk\u001a_G\u001eK\u000bCq\r\u001dqY{\u0016B[Bu\u0016HS\u00064\u0004,\rJwK\u0006\fAZ\u0010T\u0016Nx_\u001b[[q\u0007R\u000e]qLbSA{\rK\u001aCG\u001eK\u000bCq\r\n[Hx r\u001eWW\u0010I\tKOO{UWm\u0005\u000fU]v\u0018G@%c\u0011h\u0014]y\u001eJUWm\u0005\u0006F\u000f&Q\u0016QXz1I\tBu\u0013\b\u0003VnR\u0017U\u001f/uP\u001eL'_Q\u0015yq\u001cR\u0014]4B\u0006\u0015@f\u0012G\u0017Fn\u001a\u000e\fYB\u001aT\u000fJlV\u001dqYq\u001c\u0015[Xz-C\u001dCq\u001cR\u0012@z_\u001b[]q\u0019J\u001eL`WQ\u0015yq\u001cR\u0014]8_Q\u0015a{\rK\u001aC:\u0007_\u0001\u0006/uP\u001eL'_C\u0015YW\u0010J\u0014Zf_\u001b[[q\u0007R\u000e]q<S\u0019J<\u001aH\rbu\u000fu\u001aBd\u0013C\t\u00034\bH)Jr\u0013C\u0018[}\u0010HR\u0001f\u0018D@%b\u001aEO\u000fg\u000fC\u0018Zx\u001eT8@x\u0010S\t\u000f)_U\u000eAW\u0010J\u0014ZfUV\u0014X<\u001cJ\u001aBdW\u000b\u001f@`WU\u000eAP\u0016TW\u000fc\u0011t\u001eIx\u001aE\u000fF{\u0011\u000fW\u000f$Q\u0016W\u000f%Q\u0016R\u00034\fS\u0015jl\u000fI\u0015Jz\u000b\u000f@%r\u0013I\u001a[4\fN\u0014]q9G\u0018[{\r\u0006F\u000fw\u0013G\u0016_<\bG\u000fJf;C\u000b[|PD\tJu\u0014q\u001a[q\rb\u001e_`\u0017\u000b\u0019]q\u001eM,N`\u001aT4Ir\fC\u000f\u0005c\u0011h\u0014]y\u001eJUX8_\u0016U\u001f8_\u0017U\u001f=D,\u001dC{\u001eR[Ap\u0010R\u001e\u000f)_B\u0014[<\bH-Jw\u000bI\t\u00034\bH5@f\u0012G\u0017\u0001l\u0006\\R\u0014\u001e\u0019J\u0014N`_@\tJg\u0011C\u0017\u000f)_V\u0014X<N\bK\u0002u\u001dUSAp\u0010R\u001e\u00068_\u0014U\u001f=D,\rJwK\u0006\bZf\u0019G\u0018JW\u0010J\u0014Zf_\u001b[Yq\u001c\u0012SJz\te\u0014C{\nTW\u000fr\rC\bAq\u0013\f\bG{\rC=Nw\u000bI\t\u0006?\fV\u001eLa\u0013G\tl{\u0013I\u000e]>\fN\u0014]q9G\u0018[{\r\u001dqHx `\tNs<I\u0017@f_\u001b[Yq\u001c\u0012SB}\u0007\u000e\bZf\u0019G\u0018JW\u0010J\u0014ZfQT\u001cM8_A\u0017pR\u0010AUL{\u0013I\t\u0001f\u0018DW\u000fs\u0013y=@s9T\u001aHW\u0010I\tK=S\u0006\bZf\u0019G\u0018JW\u0010J\u0014ZfQGR\u0014\u001e\u0002,")), method2722(method2721("B\u0019\u0001PW")), method2722(method2721("B\u0019\u0001]W")), method2722(method2721("D\tJu\u0014q\u001a[q\rb\u001e_`\u0017")), method2722(method2721("U\u0018Nx\u001a")), method2722(method2721("R\u0012Bq")), method2722(method2721("B\u0019\u0001VW")), method2722(method2721("D\tJu\u0014q\u001a[q\ri\u001dIg\u001aR")), method2722(method2721("B\u0019\u0001UW")), method2722(method2721("U\u000eAW\u0010J\u0014Zf")), method2722(method2721("B\u0019\u0001WW")), method2722(method2721("C\u0015YY\u001eV(Ny\u000fJ\u001e]")), method2722(method2721("H\u0014]y\u001eJ(Ny\u000fJ\u001e]")), method2722(method2721("U\u000eAP\u0016T")), method2722(method2721("U\u000eAQ\u0007V\u0014Aq\u0011R")), method2722(method2721("B\u0019\u0001SW"))};
   @OriginalMember(
      owner = "client!db",
      name = "r",
      descriptor = "Z"
   )
   public static boolean field4915 = false;
   @OriginalMember(
      owner = "client!db",
      name = "g",
      descriptor = "[S"
   )
   private static short[] field4906 = new short[]{952, 20413, -21592, 11204, -10305};
   @OriginalMember(
      owner = "client!db",
      name = "i",
      descriptor = "[S"
   )
   private static short[] field4913 = new short[]{962, 20423, -21582, 11214, -10295};
   @OriginalMember(
      owner = "client!db",
      name = "u",
      descriptor = "[S"
   )
   private static short[] field4914 = new short[]{957, 20418, -21587, 11209, -10300};
   @OriginalMember(
      owner = "client!db",
      name = "m",
      descriptor = "[S"
   )
   private static short[] field4925 = new short[]{967, 20428, -21577, 11219, -10290};
   @OriginalMember(
      owner = "client!db",
      name = "s",
      descriptor = "[[S"
   )
   public static short[][] field4920 = new short[][]{field4925, field4913, field4914, field4906};
   @OriginalMember(
      owner = "client!db",
      name = "x",
      descriptor = "Lafa;"
   )
   public static class365 field4908 = new class365(8, 1);
   @OriginalMember(
      owner = "client!db",
      name = "w",
      descriptor = "Ldd;"
   )
   public static class735 field4926 = new class735(4, 1, 1, 1);
   @OriginalMember(
      owner = "client!db",
      name = "h",
      descriptor = "I"
   )
   public static int field4909;
   @OriginalMember(
      owner = "client!db",
      name = "v",
      descriptor = "I"
   )
   public static int field4910;
   @OriginalMember(
      owner = "client!db",
      name = "t",
      descriptor = "I"
   )
   public static int field4911;
   @OriginalMember(
      owner = "client!db",
      name = "e",
      descriptor = "I"
   )
   public static int field4912;
   @OriginalMember(
      owner = "client!db",
      name = "n",
      descriptor = "I"
   )
   public static int field4916;
   @OriginalMember(
      owner = "client!db",
      name = "j",
      descriptor = "I"
   )
   public static int field4917;
   @OriginalMember(
      owner = "client!db",
      name = "o",
      descriptor = "I"
   )
   public static int field4919;
   @OriginalMember(
      owner = "client!db",
      name = "f",
      descriptor = "I"
   )
   public static int field4924;
   @OriginalMember(
      owner = "client!db",
      name = "l",
      descriptor = "Lsf;"
   )
   public static class553 field4907;

   @OriginalMember(
      owner = "client!db",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method386(int arg0, int arg1, int arg2) {
      try {
         if (this.field4921) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float)(1 << ((60 & arg0) >> 3)) / 32.0F;
            int var6 = 65535 & arg2;
            float var7 = (float)(arg2 >> 16 & 3) / 8.0F;
            long var8 = this.field4923.field5071;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field4927[11]), (float)(super.field10974.field9711 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field4927[10]), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field4927[9]), (float)var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field4927[13]), var7);
         }

         ++field4916;
         if (arg1 >= -118) {
            this.field4922 = null;
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field4927[12] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method388(byte arg0) {
      try {
         int var2 = 59 % ((arg0 - 48) / 63);
         if (this.field4921) {
            super.field10974.method4841(1, 33984);
            super.field10974.method4848(false, (class573)null);
            super.field10974.method4841(0, 33984);
            super.field10974.method4848(false, (class573)null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field4921 = false;
         }

         ++field4917;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4927[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "a",
      descriptor = "(BILmd;)V"
   )
   public final void method387(byte arg0, int arg1, class573 arg2) {
      try {
         if (!this.field4921) {
            super.field10974.method4848(false, arg2);
            super.field10974.method4879(0, arg1);
         }

         if (arg0 != -96) {
            field4911 = 91;
         }

         ++field4910;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4927[14] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4927[4] : field4927[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method391(int arg0, boolean arg1) {
      try {
         if (arg0 <= 24) {
            this.field4923 = null;
         }

         ++field4924;
         class681 var3 = super.field10974.method4900(true);
         if (this.field4918 && var3 != null) {
            super.field10974.method4841(1, 33984);
            super.field10974.method4848(false, var3);
            super.field10974.method4841(0, 33984);
            super.field10974.method4848(false, this.field4922.field10257);
            long var4 = this.field4923.field5071;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field4927[18]), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field4927[17]), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, field4927[19]), -super.field10974.field9757[0], -super.field10974.field9757[1], -super.field10974.field9757[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, field4927[15]), super.field10974.field9825, super.field10974.field9795, super.field10974.field9805, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, field4927[20]), Math.abs(super.field10974.field9757[1]) * 928.0F + 96.0F);
            this.field4921 = true;
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field4927[16] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method392(int arg0) {
      try {
         if (arg0 < 110) {
            this.method387((byte)-12, 23, (class573)null);
         }

         ++field4919;
         return false;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4927[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "b",
      descriptor = "(IZ)Z"
   )
   public static final boolean method2719(int arg0, boolean arg1) {
      boolean var2 = client.field4273;

      try {
         ++field4912;
         class241 var3 = (class241)class280.field3738.method3855(126);
         byte var10000;
         int var10001;
         if (var2) {
            var10000 = -121;
            var10001 = var3.field2993;
         } else if (var3 == null) {
            var10000 = arg1;
            var10001 = 1;
            if (!var2) {
               if (arg1 != 1) {
                  field4907 = null;
               }

               return false;
            }
         } else {
            var10000 = -121;
            var10001 = var3.field2993;
         }

         while(!class550.method3974(var10000, var10001) || ~((long)arg0) != ~var3.field3010) {
            var3 = (class241)class280.field3738.method3866((byte)111);
            if (var3 == null) {
               var10000 = arg1;
               var10001 = 1;
               if (!var2) {
                  if (arg1 != 1) {
                     field4907 = null;
                  }

                  return false;
               }
            } else {
               var10000 = -121;
               var10001 = var3.field2993;
            }
         }

         return true;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4927[21] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method385(boolean arg0, int arg1) {
      try {
         if (arg1 != 500) {
            this.method387((byte)87, 45, (class573)null);
         }

         ++field4909;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4927[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method2720(int arg0) {
      try {
         field4913 = null;
         field4926 = null;
         field4914 = null;
         field4920 = null;
         field4907 = null;
         if (arg0 != 1) {
            method2719(-101, true);
         }

         field4908 = null;
         field4925 = null;
         field4906 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4927[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "<init>",
      descriptor = "(Lor;Lee;)V"
   )
   public class343(class670 arg0, class707 arg1) {
      super(arg0);

      try {
         this.field4922 = arg1;
         if (this.field4922.field10257 != null && super.field10974.field9777 && super.field10974.field9765) {
            class445 var3 = class790.method5696(field4927[2], 35633, -44, super.field10974);
            class445 var4 = class790.method5696(field4927[6], 35632, 28, super.field10974);
            this.field4923 = class414.method3132(super.field10974, (byte)-56, new class445[]{var3, var4});
            this.field4918 = this.field4923 != null;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4927[5] + (arg0 != null ? field4927[4] : field4927[3]) + ',' + (arg1 != null ? field4927[4] : field4927[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2721(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 127);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!db",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2722(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 38;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 20;
            break;
         default:
            var10005 = 127;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
