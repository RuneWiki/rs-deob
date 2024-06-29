import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class170 extends class14 {
   @OriginalMember(
      owner = "client!hq",
      name = "x",
      descriptor = "Z"
   )
   private boolean field2371 = false;
   @OriginalMember(
      owner = "client!hq",
      name = "z",
      descriptor = "Z"
   )
   private boolean field2376 = false;
   @OriginalMember(
      owner = "client!hq",
      name = "w",
      descriptor = "Lds;"
   )
   private class16 field2368;
   @OriginalMember(
      owner = "client!hq",
      name = "m",
      descriptor = "Lvv;"
   )
   private class345 field2369;
   @OriginalMember(
      owner = "client!hq",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2382 = new String[]{method1393(method1392("\u0017;\u001b\u0019$")), method1393(method1392("\f?[\u001bc\u0013%@*")), method1393(method1392("\f?[\u001dt\u000f%[=b\u000b")), method1393(method1392("\f?[\u001ce\r")), method1393(method1392("\u0011%G5m\u0013\u0019T5|\u0013/G")), method1393(method1392("\u001a$C\u0015m\u000f\u0019T5|\u0013/G")), method1393(method1392("\u0017;\u001b\u0010$")), method1393(method1392("\u0004d\u001bvq")), method1393(method1392("\u0017;\u001b\u001f$")), method1393(method1392("\u0011?Y4")), method1393(method1392("\u0017;\u001b\u0011$")), method1393(method1392("\u0017;\u001b\u001a$")), method1393(method1392("\u0017;\u001b\u0012$")), method1393(method1392("\u0017;\u001b\u001d$")), method1393(method1392("\b+C=I\u0007:Z6i\u0011>")), method1393(method1392("\u001d8P9g(+A=~0,S+i\u000b")), method1393(method1392("\f)T4i")), method1393(method1392("\u000b#X=")), method1393(method1392("\u0017;\u001b\u001b$")), method1393(method1392("\u001d8P9g(+A=~;/E,d")), method1393(method1392("\b+C=E\u0011>P6\u007f\u0016>L")), method1393(method1392("\u0017;\u001bde\u0011#Af$")), method1393(method1392("\n$\\>c\r'\u0015>`\u0010+Axx\u0016'Pc\u0006\n$\\>c\r'\u0015>`\u0010+Ax\u007f\u001c+Y=7u<T*u\u0016$Rxz\u001a)\u0006x{\t\u001cP*x\u001a2\u000eRz\u001e8L1b\u0018jS4c\u001e>\u0015/m\u000b/G\u001ci\u000f>]c\u0006\t%\\<,\u0012+\\6$VjNR{\u001e>P*H\u001a:A0,BjR4S2?Y,e+/M\u001bc\u00108Qh\"\u0005q?.i\u001c~\u0015=o)/G,i\u0007j\bxk\u0013\u0015x7h\u001a&c1i\b\u0007T,~\u00162\u001f?` \u001cP*x\u001a2\u000eR{\t\u001cP*x\u001a2\u001b ,BjQ7xW-Y\u0007B\u00108X9`2+A*e\u0007\u0011\u0005\u0005 _/V\u000ei\r>P \"\u00073Oq7u=C\u000ei\r>P \"\u0006j\bxh\u0010>\u001d?` \u0004Z*a\u001e&x9x\r#M\u0003=\"f\u0015=o)/G,i\u0007dM!vVq?/z)/G,i\u0007dOx1_.Z,$\u0018&j\u0016c\r'T4A\u001e>G1t$xht,\u001a)c=~\u000b/Mvt\u00060\u001cc\u0006\u0018&j\fi\u0007\tZ7~\u001b\u0011\u0005\u0005\"\u0007j\bxh\u0010>\u001d?` \u001eP x\n8P\u0015m\u000b8\\ WO\u0017nhQSjR4S2?Y,e+/M\u001bc\u00108Qh%U9V9`\u001aq??` \u001eP O\u0010%G<WO\u0017\u001b!,BjQ7xW-Y\u0007X\u001a2A-~\u001a\u0007T,~\u00162nhQ${ht,\u0018&j\u0015y\u0013>\\\fi\u0007\tZ7~\u001bz\u001cr\u007f\u001c+Y=7u-Y\u0007X\u001a2v7c\r.nhQQ0\u0015e,\u000b#X=7u-Y\u0007X\u001a2v7c\r.nhQQ=\u0015e,Nd\u0005c\u0006\u0018&j\u001ec\u0018\fG9k<%Z*h_w\u0015i\"OgV4m\u0012:\u001dpk\u0013\u0015s7kQ/[<'\u001a)c=~\u000b/MvvV`R4S9%Rv\u007f\u001c+Y= _z\u001bh _{\u001bh%D@R4S/%F1x\u0016%[x1_,A*m\u00119S7~\u0012b\u001cc\u0006\u0002@")), method1393(method1392("\t+G!e\u0011-\u0015.i\u001cy\u0015/z)/G,i\u0007q?.m\r3\\6k_,Y7m\u000bjB9x\u001a8q=|\u000b\"\u000eRy\u0011#S7~\u0012jC=oLjF-b;#Gc\u0006\n$\\>c\r'\u0015.i\u001c~\u0015+y\u0011\tZ4c\n8\u000eRy\u0011#S7~\u0012jS4c\u001e>\u0015+y\u0011\u000fM(c\u0011/[,7u?[1j\u00108Xxz\u001a)\u0007x{\u001e<P\u0011b\u000b/[+e\u000b3\u000eRy\u0011#S7~\u0012jS4c\u001e>\u0015/m\t/p |\u0010$P6xD@@6e\u0019%G5,\u0019&Z9x_(G=m\u0014\u001dT,i\r\u000eP(x\u0017q?-b\u0016,Z*a_,Y7m\u000bjW*i\u001e!b9x\u001a8z>j\f/Ac\u0006\n$\\>c\r'\u0015+m\u0012:Y=~L\u000e\u00156c\r'T4_\u001e'E4i\rq?-b\u0016,Z*a_9T5|\u0013/G\u001by\u001d/\u0015=b\t\u0007T(_\u001e'E4i\rq?.c\u0016.\u00155m\u0016$\u001dq,\u0004@C=oKjB6B\u00108X9`_w\u0015,i\u0007>@*iL\u000e\u001d6c\r'T4_\u001e'E4i\rf\u0015?` \u001eP O\u0010%G<WO\u0017\u001b u\u0005c\u001b*n\u0018+\u000eR{\u0011\u0004Z*a\u001e&\u001b u\u0005j\bx>Qz\u001f/b1%G5m\u0013dM!vR{\u001bh7u<P;?_=[\u000ei\u001c>Z*,Bj[7~\u0012+Y1v\u001abB.Z\u001a8A=tVq?.i\u001cy\u0015/b-/S4i\u001c>\\7b_w\u0015*i\u0019&P;xW=[\u000ei\u001c>Z* _=[\u0016c\r'T4\"\u00073Oq7u<P;?_/[.O\u0010&Z-~_w\u0015,i\u0007>@*i<?W=$\u001a$C\u0015m\u000f\u0019T5|\u0013/Gt,\b$g=j\u0013/V,e\u0010$\u001cv~\u0018(\u000eRz\u001a)\u0001x\u007f\u000f/V-`\u001e8v7`\u0010?Gx1_9@6O\u0010&Z-~U:Z/$\u001c&T5|WgQ7xW9@6H\u00168\u0019x{\u0011\u0018P>`\u001a)A1c\u0011c\u0019x<Qz\u0019x=Qz\u001ct,\f?[\u001dt\u000f%[=b\u000bc\u000eRj\u0013%T,,\f\"Z*i9+V,c\rj\bxo\u0013+X($\b+A=~;/E,dP(G=m\u0014\u001dT,i\r\u000eP(x\u0017gW*i\u001e!b9x\u001a8z>j\f/Ar{\u0011\u0004Z*a\u001e&\u001b/ _z\u001bh _{\u001bh%D@S4c\u001e>\u0015/m\t/s9o\u000b%Gx1_:Z/$Nd\u0005u\u007f\u0017%G=J\u001e)A7~SjB9z\u001a\u000fM(c\u0011/[,%Rz\u001bm7u=T.i9+V,c\rj\bx!Kd\u0005r{\u001e<P\u001em\u001c>Z*&\b+C=J\u001e)A7~T{\u001bh7u,Y7m\u000bj[<c\u000b/\u0015e,\u001b%Ap{\u0011\u001cP;x\u00108\u0019x{\u0011\u0004Z*a\u001e&\u001b u\u0005c\u000eRj\u0013%T,,\u00198P+b\u001a&\u0015e,\u000f%Bp=Qz\u00189n\fb[<c\u000b/\u001ct,Nd\u0005q7u<P;8_9@*j\u001e)P\u001bc\u0013%@*,BjX1tW<P;8W/[.O\u0010&Z-~SjS*i\f$P4&\f\"Z*i9+V,c\rc\u0019x$\b+C=E\u0011>P6\u007f\u0016>LvtU=[\u0016c\r'T4\"\b=B/%T=T.i6$A=b\f#A!\"\u0006f\u0015/m\t/s9o\u000b%Gq'\f:P;y\u0013+G\u001bc\u0013%@*&\f\"Z*i9+V,c\rq??` \fG9k<%Y7~_w\u0015.i\u001c~\u001d5e\u0007bF-~\u0019+V=O\u0010&Z-~Q8R: _-Y\u0007J\u0010-\u001b;c\u0013%Gv~\u0018(\u0019xk\u0013\u0015s7k98T?O\u0010%G<%SjF-~\u0019+V=O\u0010&Z-~Q+\u001cc\u0006\u0002@"))};
   @OriginalMember(
      owner = "client!hq",
      name = "n",
      descriptor = "[Len;"
   )
   public static class339[] field2378 = new class339[8];
   @OriginalMember(
      owner = "client!hq",
      name = "t",
      descriptor = "D"
   )
   public static double field2375;
   @OriginalMember(
      owner = "client!hq",
      name = "v",
      descriptor = "I"
   )
   public static int field2372;
   @OriginalMember(
      owner = "client!hq",
      name = "q",
      descriptor = "I"
   )
   public static int field2373;
   @OriginalMember(
      owner = "client!hq",
      name = "u",
      descriptor = "I"
   )
   public static int field2374;
   @OriginalMember(
      owner = "client!hq",
      name = "p",
      descriptor = "I"
   )
   public static int field2377;
   @OriginalMember(
      owner = "client!hq",
      name = "o",
      descriptor = "I"
   )
   public static int field2379;
   @OriginalMember(
      owner = "client!hq",
      name = "r",
      descriptor = "I"
   )
   public static int field2380;
   @OriginalMember(
      owner = "client!hq",
      name = "y",
      descriptor = "I"
   )
   public static int field2381;
   @OriginalMember(
      owner = "client!hq",
      name = "s",
      descriptor = "Lkf;"
   )
   public static class266 field2370;

   @OriginalMember(
      owner = "client!hq",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method84(boolean arg0, int arg1) {
      try {
         ++field2377;
         if (arg1 != 13254) {
            this.method82(22, -18, 11);
         }

         class212 var3 = super.field157.method4171(arg1 + -18943);
         if (this.field2371 && var3 != null) {
            float var4 = 1.0F + 2.0F * (-Math.abs(super.field157.field8405[1]) + 1.0F);
            super.field157.method4112((byte)-35, 1);
            super.field157.method4107(arg1 + -13380, var3);
            super.field157.method4112((byte)-9, 0);
            super.field157.method4107(63, this.field2368.field181);
            long var5 = this.field2369.field4666;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, field2382[4]), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, field2382[5]), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, field2382[3]), -super.field157.field8405[0], -super.field157.field8405[1], -super.field157.field8405[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, field2382[1]), super.field157.field8402 * var4, super.field157.field8440 * var4, super.field157.field8442 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, field2382[2]), 64.0F + Math.abs(super.field157.field8405[1]) * 928.0F);
            this.field2376 = true;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field2382[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method87(int arg0) {
      try {
         if (arg0 > -49) {
            return false;
         } else {
            ++field2372;
            return this.field2371;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2382[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method88(int arg0, boolean arg1) {
      try {
         ++field2373;
         if (arg0 != 16) {
            method1391(-84, 100, -107);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2382[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method82(int arg0, int arg1, int arg2) {
      try {
         if (this.field2376) {
            int var4 = 1 << (3 & arg1);
            float var5 = (float)(1 << ((arg1 & 62) >> 3)) / 32.0F;
            int var6 = 65535 & arg2;
            float var7 = (float)((226435 & arg2) >> 16) / 8.0F;
            float var8 = (float)((8226535 & arg2) >> 19) / 16.0F;
            float var9 = (float)((arg2 & 130434263) >> 23) / 16.0F;
            int var10 = 15 & arg2 >> 27;
            long var11 = this.field2369.field4666;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field2382[17]), (float)(super.field157.field8355 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field2382[16]), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field2382[19]), (float)var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field2382[15]), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, field2382[20]), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, field2382[14]), (float)var10);
         }

         ++field2374;
         if (arg0 != 13880) {
            this.field2371 = true;
         }
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field2382[18] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1390(int arg0) {
      try {
         int var1 = -56 % ((arg0 - -47) / 41);
         field2378 = null;
         field2370 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2382[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "<init>",
      descriptor = "(Lea;Lds;)V"
   )
   public class170(class573 arg0, class16 arg1) {
      super(arg0);

      try {
         this.field2368 = arg1;
         if (this.field2368.field181 != null && super.field157.field8456 && super.field157.field8482) {
            class373 var3 = class508.method3694(true, 35633, field2382[22], super.field157);
            class373 var4 = class508.method3694(true, 35632, field2382[23], super.field157);
            this.field2369 = class672.method4888(new class373[]{var3, var4}, 115, super.field157);
            this.field2371 = this.field2369 != null;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field2382[21] + (arg0 != null ? field2382[7] : field2382[9]) + ',' + (arg1 != null ? field2382[7] : field2382[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "a",
      descriptor = "(BLsl;I)V"
   )
   public final void method86(byte arg0, class486 arg1, int arg2) {
      try {
         ++field2380;
         if (arg0 <= 75) {
            field2378 = null;
         }

         if (!this.field2376) {
            super.field157.method4107(-119, arg1);
            super.field157.method4134(arg2, 2);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field2382[8] + arg0 + ',' + (arg1 != null ? field2382[7] : field2382[9]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "b",
      descriptor = "(III)I"
   )
   public static final int method1391(int arg0, int arg1, int arg2) {
      try {
         ++field2379;
         if (~arg2 == 0) {
            return 12345678;
         } else {
            label25: {
               arg0 = (127 & arg2) * arg0 >> 7;
               if (arg0 >= 2) {
                  if (arg0 <= 126) {
                     break label25;
                  }

                  arg0 = 126;
                  if (!client.field4360) {
                     break label25;
                  }
               }

               arg0 = 2;
            }

            if (arg1 > -120) {
               field2370 = null;
            }

            return (arg2 & 65408) + arg0;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2382[12] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method85(int arg0) {
      try {
         ++field2381;
         if (arg0 != 17328) {
            this.method82(-53, 97, -52);
         }

         if (this.field2376) {
            super.field157.method4112((byte)103, 1);
            super.field157.method4107(32, (class486)null);
            super.field157.method4112((byte)-56, 0);
            super.field157.method4107(-122, (class486)null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field2376 = false;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2382[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1392(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 12);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1393(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 12;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
