import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public class class231 extends class316 {
   @OriginalMember(
      owner = "client!rha",
      name = "j",
      descriptor = "Z"
   )
   private boolean field3391 = false;
   @OriginalMember(
      owner = "client!rha",
      name = "d",
      descriptor = "Z"
   )
   private boolean field3393 = false;
   @OriginalMember(
      owner = "client!rha",
      name = "m",
      descriptor = "Ltaa;"
   )
   private class426 field3387;
   @OriginalMember(
      owner = "client!rha",
      name = "n",
      descriptor = "Lud;"
   )
   private class39 field3385;
   @OriginalMember(
      owner = "client!rha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3396 = new String[]{method1915(method1914(";sIZTa")), method1915(method1914("25\u0006Zl")), method1915(method1914("'nD\u0018")), method1915(method1914(";sIZPa")), method1915(method1914("'tZ\u0019p%HI\u0019a%~Z")), method1915(method1914(":nF0x;")), method1915(method1914(",u^9p9HI\u0019a%~Z")), method1915(method1914(":nF7~%t]\u0006")), method1915(method1914(":nF1i9tF\u0011\u007f=")), method1915(method1914("+iM\u0015z\u001ez\\\u0011c\r~X\u0000y")), method1915(method1914(":xI\u0018t")), method1915(method1914("+iM\u0015z\u001ez\\\u0011c\u0006}N\u0007t=")), method1915(method1914("=rE\u0011")), method1915(method1914(";sIZXa")), method1915(method1914("<uA\u0012~;v\b\u0012}&z\\Te vMO\u001b<uA\u0012~;v\b\u0012}&z\\Tb*zD\u0011*CmI\u0006h uOTg,x\u001bTf?MM\u0006e,c\u0013~g(iQ\u001d\u007f.;N\u0018~(o\b\u0003p=~Z0t9o@O\u001b?tA\u00101$zA\u001a9`;S~f(oM\u0006U,k\\\u001c1t;O\u0018N\u0004nD\u0000x\u001d~P7~&iLD?3 \"\u0002t*/\b\u0011r\u001f~Z\u0000t1;\u0015Tv%De\u001bu,w~\u001dt>VI\u0000c c\u0002\u0013}\u0016MM\u0006e,c\u0013~f?MM\u0006e,c\u0006\f1t;L\u001bea|D+_&iE\u0015}\u0004z\\\u0006x1@\u0018)=i~K\"t;oM\f?1bR]*Cl^\"t;oM\f?0;\u0015Tu&o\u0000\u0013}\u0016UG\u0006|(we\u0015e;rP/ \u00147\b\u0011r\u001f~Z\u0000t15P\rk` \"\u0003g\u001f~Z\u0000t15RT,i\u007fG\u00009.ww:~;vI\u0018\\(oZ\u001di\u0012)uX1,x~\u0011c=~PZi0a\u0001O\u001b.ww t1XG\u001bc-@\u0018)?1;\u0015Tu&o\u0000\u0013}\u0016OM\fe<iM9p=iA\fJyFsDLe;O\u0018N\u0004nD\u0000x\u001d~P7~&iLD8chK\u0015}, \"\u0013}\u0016OM\fR&tZ\u0010JyF\u0006\r1t;L\u001bea|D+E,c\\\u0001c,VI\u0000c csDL\u0012*uX1.ww9d%oA t1XG\u001bc-+\u0001^b*zD\u0011*C|D+E,ck\u001b~;\u007fsDLga\bI1=rE\u0011*C|D+E,ck\u001b~;\u007fsDLgl\bI1x5\u0018O\u001b.ww2~.]Z\u0015v\ntG\u0006ui&\bE?y6K\u0018p$k\u0000\\v%Dn\u001bvg~F\u0010:,x~\u0011c=~PZk`1O\u0018N\u000ftOZb*zD\u0011=i+\u0006D=i*\u0006D8r\u0011O\u0018N\u0019t[\u001de tFT,i}\\\u0006p'hN\u001bc$3\u0001O\u001b4\u0011")), method1915(method1914(";sIZ- uA\u0000/a")), method1915(method1914("?zZ\rx'|\b\u0002t*(\b\u0003g\u001f~Z\u0000t1 \"\u0002p;bA\u001avi}D\u001bp=;_\u0015e,il\u0011a=s\u0013~d'rN\u001bc$;^\u0011rz;[\u0001\u007f\rrZO\u001b<uA\u0012~;v\b\u0002t*/\b\u0007d'XG\u0018~<i\u0013~d'rN\u001bc$;N\u0018~(o\b\u0007d'^P\u0004~'~F\u0000*CnF\u001dw&iETw%tI\u00001+iM\u0015z\u001ez\\\u0011c\r~X\u0000yr\u0011]\u001ax/tZ\u00191/wG\u0015eiyZ\u0011p\"LI\u0000t;TN\u0012b,o\u0013~d'rN\u001bc$;[\u0015|9wM\u0006\"\r;F\u001bc$zD'p$kD\u0011cr\u0011]\u001ax/tZ\u00191:zE\u0004},ik\u0001s,;M\u001ag\u0004zX'p$kD\u0011cr\u0011^\u001bx-;E\u0015x'3\u0001TjCmM\u0017%ilF:~;vI\u00181t;\\\u0011i=nZ\u0011\"\r3F\u001bc$zD'p$kD\u0011ce;O\u0018N\u001d~P7~&iL/!\u00145P\rk`5Z\u0016v( \"\u0003\u007f\u0007tZ\u0019p%5P\rki&\bF?y1_\u001a_&iE\u0015}gcQ\u000e<x5\u0018O\u001b?~KG1>u~\u0011r=tZT,iuG\u0006|(wA\u000etal^\"t;oM\f8r\u0011^\u0011rz;_\u001aC,}D\u0011r=rG\u001a1t;Z\u0011w%~K\u00009>u~\u0011r=tZX1>uf\u001bc$zDZi0a\u0001O\u001b?~KG1,u^7~%t]\u00061t;\\\u0011i=nZ\u0011R<yM\\t'me\u0015a\u001azE\u0004},i\u0004Tf'IM\u0012},x\\\u001d~'2\u0006\u0006v+ \"\u0002t*/\b\u0007a,x]\u0018p;XG\u0018~<i\bI1:nF7~%t]\u0006;9t_\\r%zE\u00049d\u007fG\u00009:nF0x;7\b\u0003\u007f\u001b~N\u0018t*oA\u001b\u007f`7\bD?y7\bE?y2\u0004Tb<um\fa&uM\u001ae` \"\u0012}&z\\Tb!tZ\u0011W(x\\\u001bci&\b\u0017}(vX\\f(oM\u0006U,k\\\u001c>+iM\u0015z\u001ez\\\u0011c\r~X\u0000ydyZ\u0011p\"LI\u0000t;TN\u0012b,o\u0002\u0003\u007f\u0007tZ\u0019p%5_X1y5\u0018X1x5\u0018]*C}D\u001bp=;F\u0010~=~\bI1-t\\\\f'MM\u0017e&i\u0004Tf'UG\u0006|(w\u0006\fh32\u0013~w%tI\u00001/iM\u0007\u007f,w\bI19t_\\ g+\u0005\u0015s:3F\u0010~=~\u0001X1{5\u0018]*CmM\u0017%ih]\u0006w(xM7~%t]\u00061t;^\u0011r}3M\u001ag\ntD\u001bd;7\b\u0012c,hF\u0011}ch@\u001bc,]I\u0017e&i\u0001_b9~K\u0001}(ik\u001b}&nZ^b!tZ\u0011W(x\\\u001bcr\u0011O\u0018N\u000fiI\u0013R&wG\u00061t;^\u0011r}3E\u001diah]\u0006w(xM7~%t]\u0006?;|JX1.ww2~.5K\u001b}&i\u0006\u0006v+7\b\u0013}\u0016]G\u0013W;zO7~&iL]=ih]\u0006w(xM7~%t]\u0006?(2\u0013~lC")), method1915(method1914(";sIZUa")), method1915(method1914(";sIZSa")), method1915(method1914(";sIZRa")), method1915(method1914(";sIZVa")), method1915(method1914(";sIZWa"))};
   @OriginalMember(
      owner = "client!rha",
      name = "f",
      descriptor = "Liw;"
   )
   public static class332 field3383 = new class332();
   @OriginalMember(
      owner = "client!rha",
      name = "k",
      descriptor = "I"
   )
   public static int field3395 = 2;
   @OriginalMember(
      owner = "client!rha",
      name = "c",
      descriptor = "I"
   )
   public static int field3384;
   @OriginalMember(
      owner = "client!rha",
      name = "l",
      descriptor = "I"
   )
   public static int field3386;
   @OriginalMember(
      owner = "client!rha",
      name = "o",
      descriptor = "I"
   )
   public static int field3388;
   @OriginalMember(
      owner = "client!rha",
      name = "e",
      descriptor = "I"
   )
   public static int field3389;
   @OriginalMember(
      owner = "client!rha",
      name = "g",
      descriptor = "I"
   )
   public static int field3390;
   @OriginalMember(
      owner = "client!rha",
      name = "i",
      descriptor = "I"
   )
   public static int field3392;
   @OriginalMember(
      owner = "client!rha",
      name = "h",
      descriptor = "I"
   )
   public static int field3394;

   @OriginalMember(
      owner = "client!rha",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1912(int arg0) {
      try {
         if (arg0 == -23721) {
            field3383 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3396[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rha",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method810(int arg0, int arg1, int arg2) {
      try {
         if (this.field3393) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float)(1 << (7 & arg0 >> 3)) / 32.0F;
            int var6 = arg1 & 65535;
            float var7 = (float)(arg1 >> 16 & 3) / 8.0F;
            long var8 = this.field3385.field935;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field3396[12]), (float)(super.field4567.field728 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field3396[10]), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field3396[9]), (float)var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field3396[11]), var7);
         }

         if (arg2 == 0) {
            ++field3384;
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field3396[13] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rha",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method807(int arg0) {
      try {
         ++field3394;
         return arg0 != -18913;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3396[21] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rha",
      name = "b",
      descriptor = "(BZ)V"
   )
   public final void method811(byte arg0, boolean arg1) {
      try {
         if (arg0 != 51) {
            field3383 = null;
         }

         ++field3388;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3396[18] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rha",
      name = "<init>",
      descriptor = "(Lrk;Ltaa;)V"
   )
   public class231(class35 arg0, class426 arg1) {
      super(arg0);

      try {
         this.field3387 = arg1;
         if (this.field3387.field6177 != null && super.field4567.field869 && super.field4567.field837) {
            class366 var3 = class383.method2979(super.field4567, 12203, 35633, field3396[14]);
            class366 var4 = class383.method2979(super.field4567, 12203, 35632, field3396[16]);
            this.field3385 = class105.method1020(new class366[]{var3, var4}, super.field4567, (byte)104);
            this.field3391 = this.field3385 != null;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field3396[15] + (arg0 != null ? field3396[1] : field3396[2]) + ',' + (arg1 != null ? field3396[1] : field3396[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rha",
      name = "a",
      descriptor = "(BZ)V"
   )
   public final void method806(byte arg0, boolean arg1) {
      try {
         int var3 = 125 / ((-44 - arg0) / 38);
         ++field3389;
         class14 var4 = super.field4567.method350(0);
         if (this.field3391 && var4 != null) {
            super.field4567.method259(32, 1);
            super.field4567.method252(var4, (byte)-62);
            super.field4567.method259(32, 0);
            super.field4567.method252(this.field3387.field6177, (byte)-67);
            long var5 = this.field3385.field935;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, field3396[4]), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, field3396[6]), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, field3396[5]), -super.field4567.field830[0], -super.field4567.field830[1], -super.field4567.field830[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, field3396[7]), super.field4567.field858, super.field4567.field780, super.field4567.field856, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, field3396[8]), 96.0F + Math.abs(super.field4567.field830[1]) * 928.0F);
            this.field3393 = true;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field3396[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rha",
      name = "a",
      descriptor = "(IIILda;Ljfa;IILaa;Ljava/lang/String;Lika;II)V"
   )
   public static final void method1913(int arg0, int arg1, int arg2, class66 arg3, class303 arg4, int arg5, int arg6, class510 arg7, String arg8, class445 arg9, int arg10, int arg11) {
      try {
         if (arg2 < -23) {
            int var12;
            label66: {
               ++field3392;
               if (class590.field8514 != 4) {
                  var12 = (int)class756.field10975 + class395.field5809 & 16383;
                  if (!client.field4564) {
                     break label66;
                  }
               }

               var12 = (int)class756.field10975 & 16383;
            }

            int var13 = 10 + Math.max(arg4.field4308 / 2, arg4.field4226 / 2);
            int var14 = arg0 * arg0 + arg10 * arg10;
            if (~(var13 * var13) <= ~var14) {
               int var15 = class593.field8539[var12];
               int var16 = class593.field8548[var12];
               if (class590.field8514 != 4) {
                  var16 = var16 * 256 / (class449.field6559 + 256);
                  var15 = var15 * 256 / (class449.field6559 + 256);
               }

               int var17 = arg0 * var16 + arg10 * var15 >> 14;
               int var18 = arg10 * var16 - arg0 * var15 >> 14;
               int var19 = arg9.method3344(-18283, (class476[])null, arg8, 100);
               int var20 = var17 - var19 / 2;
               int var21 = arg9.method3350(100, 7766, (class476[])null, 0, arg8);
               if (-arg4.field4308 <= var20 && ~arg4.field4308 <= ~var20 && ~(-arg4.field4226) >= ~var18 && ~arg4.field4226 <= ~var18) {
                  arg3.method717((int[])null, var20 - -(arg4.field4308 / 2) + arg1, arg1, 50, arg6, (class476[])null, 0, var19, 0, -var18 + arg6 - -(arg4.field4226 / 2) + (-arg5 - var21), arg8, 0, arg7, arg11, 1, 255);
               }
            }
         }
      } catch (RuntimeException var23) {
         throw class608.method4462(var23, field3396[17] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3396[1] : field3396[2]) + ',' + (arg4 != null ? field3396[1] : field3396[2]) + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field3396[1] : field3396[2]) + ',' + (arg8 != null ? field3396[1] : field3396[2]) + ',' + (arg9 != null ? field3396[1] : field3396[2]) + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rha",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method805(int arg0) {
      try {
         int var2 = 22 % ((-18 - arg0) / 63);
         if (this.field3393) {
            super.field4567.method259(32, 1);
            super.field4567.method252((class707)null, (byte)-58);
            super.field4567.method259(32, 0);
            super.field4567.method252((class707)null, (byte)-122);
            OpenGL.glUseProgramObjectARB(0L);
            this.field3393 = false;
         }

         ++field3386;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3396[20] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rha",
      name = "a",
      descriptor = "(IILufa;)V"
   )
   public final void method804(int arg0, int arg1, class707 arg2) {
      try {
         if (!this.field3393) {
            super.field4567.method252(arg2, (byte)-87);
            super.field4567.method322(-96, arg1);
         }

         ++field3390;
         if (arg0 != 0) {
            this.method804(92, 50, (class707)null);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3396[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3396[1] : field3396[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1914(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1915(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
