import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gja")
public class class654 extends class125 {
   @OriginalMember(
      owner = "client!gja",
      name = "m",
      descriptor = "Z"
   )
   private boolean field9774 = false;
   @OriginalMember(
      owner = "client!gja",
      name = "g",
      descriptor = "Z"
   )
   private boolean field9775 = false;
   @OriginalMember(
      owner = "client!gja",
      name = "p",
      descriptor = "Luda;"
   )
   private class56 field9765;
   @OriginalMember(
      owner = "client!gja",
      name = "n",
      descriptor = "Lua;"
   )
   private class666 field9776;
   @OriginalMember(
      owner = "client!gja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9778 = new String[]{method4806(method4805(">V:\u00037q")), method4806(method4805("\"\u0012u\u0003\u000e")), method4806(method4805("7I7A")), method4806(method4805(">V:\u00030q")), method4806(method4805(">V:\u00034q")), method4806(method4805(">V:\u00036q")), method4806(method4805("*_:A\u0016")), method4806(method4805(";N>L\u0018\u000e]/H\u0001\u001dY+Y\u001b")), method4806(method4805("-U6H")), method4806(method4805(">V:\u00035q")), method4806(method4805(".]-H6!L4C\u00167H")), method4806(method4805(".]-H:7H>C\u00000H\"")), method4806(method4805(";N>L\u0018\u000e]/H\u0001\u0016Z=^\u0016-")), method4806(method4805(",R2K\u001c+Q{K\u001f6]/\r\u00070Q>\u0016y,R2K\u001c+Q{K\u001f6]/\r\u0000:]7HHSJ:_\n0R<\r\u0005<_h\r\u0004/j>_\u0007<D`'\u00058N\"D\u001d>\u001c=A\u001c8H{Z\u0012-Y)i\u0016)H3\u0016y/S2IS4]2C[p\u001c '\u00048H>_7<L/ESd\u001c<A,\u0014I7Y\u001a\rY#n\u001c6N?\u001d]#\u0007Q[\u0016:\b{H\u0010\u000fY)Y\u0016!\u001cf\r\u00145c\u0016B\u0017<P\rD\u0016.q:Y\u00010DqJ\u001f\u0006j>_\u0007<D`'\u0004/j>_\u0007<DuUSd\u001c?B\u0007q[7r=6N6L\u001f\u0014]/_\u001a!gkp_yY8{\u0016+H>U]!E!\u0004HSK-{\u0016+H>U] \u001cf\r\u00176HsJ\u001f\u0006r4_\u001e8P\u0016L\u0007+U#vB\u0004\u0010{H\u0010\u000fY)Y\u0016!\u0012#T\tp\u0007QZ\u0005\u000fY)Y\u0016!\u0012!\rNyX4Y[>P\u0004c\u001c+Q:A>8H)D\u000b\u0002\u000e\u0006\u0001S<_\rH\u0001-Y#\u0003\u000b Fr\u0016y>P\u0004y\u0016!\u007f4B\u0001=gkp]!\u001cf\r\u00176HsJ\u001f\u0006h>U\u0007,N>`\u0012-N2U(ia\u0000\u001d.u\u001c<A,\u0014I7Y\u001a\rY#n\u001c6N?\u001dZsO8L\u001f<\u0007QJ\u001f\u0006h>U06S)I(iauTSd\u001c?B\u0007q[7r'<D/X\u0001<q:Y\u00010D\u0000\u001d.\u0002\r\u0006\u0001S>P\u0004`\u00065H2y\u0016!\u007f4B\u0001=\fr\u0007\u0000:]7HHS[7r'<D\u0018B\u001c+X\u0000\u001d.wF{\u0010S-U6HHS[7r'<D\u0018B\u001c+X\u0000\u001d.wK{\u0010Sh\u0012k\u0016y>P\u0004k\u001c>z)L\u0014\u001aS4_\u0017y\u0001{\u001c]i\u00118A\u00124Ls\u0005\u00145c\u001dB\u0014wY5IX<_\rH\u0001-Y#\u0003\tp\u0016<A,\u001fS<\u0003\u0000:]7H_y\fu\u001d_y\ru\u001dZb6<A,\tS(D\u00070S5\rNyZ/_\u00127O=B\u00014\u0014r\u0016y$6")), method4806(method4805(">V:\u0003O0R2YMq")), method4806(method4805("/])T\u001a7[{[\u0016:\u000f{Z\u0005\u000fY)Y\u0016!\u0007Q[\u0012+E2C\u0014yZ7B\u0012-\u001c,L\u0007<N\u001fH\u0003-T`'\u00067U=B\u00014\u001c-H\u0010j\u001c(X\u001d\u001dU)\u0016y,R2K\u001c+Q{[\u0016:\b{^\u00067\u007f4A\u001c,N`'\u00067U=B\u00014\u001c=A\u001c8H{^\u00067y#]\u001c7Y5YHSI5D\u00156N6\r\u0005<_i\r\u00048J>d\u001d-Y5^\u001a-E`'\u00067U=B\u00014\u001c=A\u001c8H{Z\u0012/Y\u001eU\u00036R>C\u0007b6.C\u001a?S)@S?P4L\u0007y^)H\u00122k:Y\u0016+x>]\u00071\u0007QX\u001d0Z4_\u001eyZ7B\u0012-\u001c9_\u00168W\fL\u0007<N\u0014K\u0015*Y/\u0016y,R2K\u001c+Q{^\u00124L7H\u0001jx{C\u001c+Q:A 8Q+A\u0016+\u0007QX\u001d0Z4_\u001eyO:@\u00035Y)n\u0006;Y{H\u001d/q:] 8Q+A\u0016+\u0007Q[\u001c0X{@\u00120Rs\u0004S\"6-H\u0010m\u001c,C=6N6L\u001fy\u0001{Y\u0016!H._\u0016jxsC\u001c+Q:A 8Q+A\u0016+\u0010{J\u001f\u0006h>U06S)I(iauU\n#\u0015u_\u0011>]`'\u00047r4_\u001e8PuU\n#\u001cf\rAw\fqZ\u001d\u0017S)@\u00125\u0012#T\tt\ru\u001dHSJ>N@yK5{\u0016:H4_Sd\u001c5B\u00014]7D\t<\u0014,[%<N/H\u000bp\u0007Q[\u0016:\u000f{Z\u001d\u000bY=A\u0016:H2B\u001dy\u0001{_\u0016?P>N\u0007qK5{\u0016:H4__yK5c\u001c+Q:A]!E!\u0004HSJ>N@yY5[06P4X\u0001y\u0001{Y\u0016!H._\u0016\u001aI9H[<R-`\u0012)o:@\u00035Y)\u0001S.R\tH\u00155Y8Y\u001a6Rr\u0003\u0001>^`'\u0005<_o\r\u0000)Y8X\u001f8N\u0018B\u001f6I)\rNyO.C06P4X\u0001sL4Z[:P:@\u0003q\u0011?B\u0007qO.C70Nw\r\u00047n>K\u001f<_/D\u001c7\u0015w\rCw\fw\rBw\fr\u0001S*I5h\u000b)S5H\u001d-\u0015`'\u00155S:YS*T4_\u0016\u001f]8Y\u001c+\u001cf\r\u00105]6][.]/H\u0001\u001dY+Y\u001bv^)H\u00122k:Y\u0016+x>]\u00071\u00119_\u00168W\fL\u0007<N\u0014K\u0015*Y/\u0007\u00047r4_\u001e8PuZ_y\fu\u001d_y\ru\u001dZb6=A\u001c8H{Z\u0012/Y\u001dL\u0010-S)\rNyL4Z[h\u0012k\u0000\u00001S)H58_/B\u0001u\u001c,L\u0005<y#]\u001c7Y5YZt\fu\u0018HSK:[\u0016\u001f]8Y\u001c+\u001cf\r^m\u0012k\u0007\u00048J>k\u0012:H4_Y.]-H58_/B\u0001r\ru\u001dHSZ7B\u0012-\u001c5I\u001c-Y{\u0010S=S/\u0005\u00047j>N\u00076Nw\r\u00047r4_\u001e8PuU\n#\u0015`'\u00155S:YS?N>^\u001d<P{\u0010S)S,\u0005Bw\fvL\u0011*\u00145I\u001c-Yr\u0001Sh\u0012k\u0004HSJ>NGyO._\u00158_>n\u001c5S._Sd\u001c6D\u000bqJ>NGqY5[06P4X\u0001u\u001c=_\u0016*R>AY*T4_\u0016\u001f]8Y\u001c+\u0015w\r[.]-H:7H>C\u00000H\"\u0003\u000bsK5c\u001c+Q:A].K,ZZrK:[\u0016\u0010R/H\u001d*U/T] \u0010{Z\u0012/Y\u001dL\u0010-S)\u0004X*L>N\u00065])n\u001c5S._Y*T4_\u0016\u001f]8Y\u001c+\u0007QJ\u001f\u0006z)L\u0014\u001aS7B\u0001y\u0001{[\u0016:\bs@\u001a!\u0014(X\u0001?]8H06P4X\u0001wN<O_y[7r56[uN\u001c5S)\u0003\u0001>^w\r\u00145c\u001dB\u0014\u001fN:J06S)IZu\u001c(X\u0001?]8H06P4X\u0001w]r\u0016y$6")), method4806(method4805(">V:\u00032q")), method4806(method4805("*I5h\u000b)S5H\u001d-")), method4806(method4805("*I5i\u001a+")), method4806(method4805(">V:\u00039q")), method4806(method4805("<R-`\u0012)o:@\u00035Y)")), method4806(method4805("*I5n\u001c5S._")), method4806(method4805("7S)@\u00125o:@\u00035Y)")), method4806(method4805(">V:\u00031q"))};
   @OriginalMember(
      owner = "client!gja",
      name = "h",
      descriptor = "Lse;"
   )
   public static class6 field9777 = new class6(57, 0);
   @OriginalMember(
      owner = "client!gja",
      name = "o",
      descriptor = "I"
   )
   public static int field9766;
   @OriginalMember(
      owner = "client!gja",
      name = "q",
      descriptor = "I"
   )
   public static int field9767;
   @OriginalMember(
      owner = "client!gja",
      name = "l",
      descriptor = "I"
   )
   public static int field9769;
   @OriginalMember(
      owner = "client!gja",
      name = "k",
      descriptor = "I"
   )
   public static int field9770;
   @OriginalMember(
      owner = "client!gja",
      name = "j",
      descriptor = "I"
   )
   public static int field9771;
   @OriginalMember(
      owner = "client!gja",
      name = "f",
      descriptor = "I"
   )
   public static int field9772;
   @OriginalMember(
      owner = "client!gja",
      name = "r",
      descriptor = "I"
   )
   public static int field9773;
   @OriginalMember(
      owner = "client!gja",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field9768;

   @OriginalMember(
      owner = "client!gja",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method341(int arg0, int arg1, int arg2) {
      try {
         if (arg0 >= -125) {
            this.field9774 = true;
         }

         if (this.field9775) {
            int var4 = 1 << (arg2 & 3);
            float var5 = (float)(1 << (arg2 >> 3 & 7)) / 32.0F;
            int var6 = 65535 & arg1;
            float var7 = (float)(3 & arg1 >> 16) / 8.0F;
            float var8 = (float)((arg1 & 8010169) >> 19) / 16.0F;
            float var9 = (float)((133266239 & arg1) >> 23) / 16.0F;
            int var10 = (arg1 & 2084569224) >> 27;
            long var11 = this.field9776.field9866;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field9778[8]), (float)(super.field1630.field7640 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field9778[6]), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field9778[7]), (float)var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field9778[12]), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, field9778[11]), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field9778[10]), (float)var10);
         }

         ++field9772;
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field9778[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gja",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method340(int arg0) {
      try {
         ++field9767;
         if (this.field9775) {
            super.field1630.method3988(arg0 ^ -123, 1);
            super.field1630.method4006((class549)null, (byte)82);
            super.field1630.method3988(-128, 0);
            super.field1630.method4006((class549)null, (byte)-122);
            OpenGL.glUseProgramObjectARB(0L);
            this.field9775 = false;
         }

         if (arg0 != 5) {
            this.method347(false);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9778[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gja",
      name = "<init>",
      descriptor = "(Liu;Luda;)V"
   )
   public class654(class530 arg0, class56 arg1) {
      super(arg0);

      try {
         this.field9765 = arg1;
         if (this.field9765.field754 != null && super.field1630.field7687 && super.field1630.field7759) {
            class8 var3 = class468.method3557(super.field1630, 2, field9778[13], 35633);
            class8 var4 = class468.method3557(super.field1630, 2, field9778[15], 35632);
            this.field9776 = class597.method4445(super.field1630, (byte)-128, new class8[]{var3, var4});
            this.field9774 = this.field9776 != null;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field9778[14] + (arg0 != null ? field9778[1] : field9778[2]) + ',' + (arg1 != null ? field9778[1] : field9778[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gja",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method347(boolean arg0) {
      try {
         if (arg0) {
            return true;
         } else {
            ++field9770;
            return this.field9774;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9778[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gja",
      name = "a",
      descriptor = "(Lll;II)V"
   )
   public final void method345(class549 arg0, int arg1, int arg2) {
      try {
         ++field9773;
         if (!this.field9775) {
            super.field1630.method4006(arg0, (byte)91);
            super.field1630.method4009(arg2, 1);
         }

         if (arg1 != -23385) {
            this.method345((class549)null, -76, -61);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field9778[0] + (arg0 != null ? field9778[1] : field9778[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gja",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4803(byte arg0) {
      try {
         field9768 = null;
         field9777 = null;
         if (arg0 < 99) {
            method4803((byte)-80);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9778[23] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gja",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method4804(byte arg0) {
      boolean var1 = client.field1481;

      try {
         ++field9771;
         class492 var2 = null;

         try {
            class769 var3 = class366.field5092.method5332("", (byte)-14, true);
            if (var1) {
               class340.method2717(1L, (byte)-119);
            }

            while(var3.field11210 == 0) {
               class340.method2717(1L, (byte)-119);
            }

            if (~var3.field11210 == -2) {
               var2 = (class492)var3.field11212;
               class66 var4 = class757.field11093.method5447(-68);
               var2.method3741(var4.field864, 0, var4.field859, 1);
            }
         } catch (Exception var8) {
         }

         try {
            int var5 = 27 / ((arg0 - -15) / 56);
            if (var2 != null) {
               var2.method3744(1571);
            }
         } catch (Exception var7) {
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field9778[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gja",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method343(boolean arg0, int arg1) {
      try {
         if (arg1 == 3) {
            ++field9766;
            class789 var3 = super.field1630.method3986(3042);
            if (this.field9774 && var3 != null) {
               float var4 = 1.0F + 2.0F * (-Math.abs(super.field1630.field7684[1]) + 1.0F);
               super.field1630.method3988(-128, 1);
               super.field1630.method4006(var3, (byte)-125);
               super.field1630.method3988(-128, 0);
               super.field1630.method4006(this.field9765.field754, (byte)-122);
               long var5 = this.field9776.field9866;
               OpenGL.glUseProgramObjectARB(var5);
               OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, field9778[22]), 0);
               OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, field9778[20]), 1);
               OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, field9778[18]), -super.field1630.field7684[0], -super.field1630.field7684[1], -super.field1630.field7684[2]);
               OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, field9778[21]), super.field1630.field7722 * var4, super.field1630.field7713 * var4, super.field1630.field7706 * var4, 1.0F);
               OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, field9778[17]), 64.0F + 928.0F * Math.abs(super.field1630.field7684[1]));
               this.field9775 = true;
            }
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field9778[19] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gja",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method346(boolean arg0, boolean arg1) {
      try {
         ++field9769;
         if (!arg0) {
            this.field9765 = null;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9778[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4805(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 115);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4806(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 115;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
