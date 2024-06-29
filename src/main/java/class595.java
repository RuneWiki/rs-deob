import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class595 extends class529 {
   @OriginalMember(
      owner = "client!hj",
      name = "d",
      descriptor = "Z"
   )
   private boolean field8768 = false;
   @OriginalMember(
      owner = "client!hj",
      name = "o",
      descriptor = "Z"
   )
   private boolean field8775 = false;
   @OriginalMember(
      owner = "client!hj",
      name = "f",
      descriptor = "Lae;"
   )
   private class262 field8764;
   @OriginalMember(
      owner = "client!hj",
      name = "m",
      descriptor = "Ldja;"
   )
   private class323 field8762;
   @OriginalMember(
      owner = "client!hj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8776 = new String[]{method4367(method4366("\u0013zTUh")), method4367(method4366("\be\u0014T)\t")), method4367(method4366("\u0015\u007f\b}!\u0017C\u001b}0\u0017u\b")), method4367(method4366("\u001e~\f]!\u000bC\u001b}0\u0017u\b")), method4367(method4366("\be\u0014U8\u000b\u007f\u0014u.\u000f")), method4367(method4366("\be\u0014S/\u0017\u007f\u000fb")), method4367(method4366("\u0013zTVh")), method4367(method4366("\u0013zTQh")), method4367(method4366("\u0015e\u0016|")), method4367(method4366("\rq\bi)\u0015wZf%\u0018#Zg6-u\bd%\u0003+pf!\ti\u0013~'[v\u0016\u007f!\u000f0\rq4\u001eb>u0\u000fxA\u001a5\u0015y\u001c\u007f2\u00160\fu#H0\te.?y\b+J\u000e~\u0013v/\t}Zf%\u0018$Zc5\u0015S\u0015|/\u000ebA\u001a5\u0015y\u001c\u007f2\u00160\u001c|/\u001adZc5\u0015U\u0002`/\u0015u\u0014d{qe\u0014y&\u0014b\u00170&\u0017\u007f\u001bd`\u0019b\u001fq+,q\u000eu2?u\nd(@\u001a\u000f~)\u001d\u007f\b}`\u001d|\u0015q4[r\bu!\u0010G\u001bd%\t_\u001cv3\u001edA\u001a5\u0015y\u001c\u007f2\u00160\tq-\u000b|\u001fbs?0\u0014\u007f2\u0016q\u0016C!\u0016`\u0016u2@\u001a\u000f~)\u001d\u007f\b}`\bq\u0017`,\u001eb9e\"\u001e0\u001f~66q\nC!\u0016`\u0016u2@\u001a\f\u007f)\u001f0\u0017q)\u00158S0;qf\u001fst[g\u0014^/\t}\u001b|`F0\u000eu8\u000fe\bus?8\u0014\u007f2\u0016q\u0016C!\u0016`\u0016u2W0\u001d|\u001f/u\u0002S/\u0014b\u001eKp&>\u0002i:R>\br'\u001a+pg.5\u007f\b}!\u0017>\u0002i:[-Z\"nK:\r~\u000e\u0014b\u0017q,Uh\u0003jmJ>J+J\ru\u0019#`\f~,u#\u000f\u007f\b0}[~\u0015b-\u001a|\u0013j%Sg\fF%\td\u001fhi@\u001a\fu#H0\r~\u0012\u001ev\u0016u#\u000fy\u0015~`F0\bu&\u0017u\u0019dh\f~,u#\u000f\u007f\b<`\f~4\u007f2\u0016q\u0016>8\u0002jS+J\ru\u0019#`\u001e~\fS/\u0017\u007f\u000fb`F0\u000eu8\u000fe\bu\u0003\u000er\u001f8%\u0015f7q0(q\u0017`,\u001ebV07\u0015B\u001fv,\u001es\u000ey/\u00159Tb'\u0019+pf%\u0018$Zc0\u001es\u000f|!\tS\u0015|/\u000ebZ-`\be\u0014S/\u0017\u007f\u000fbj\u000b\u007f\r8#\u0017q\u0017`hVt\u0015dh\be\u0014T)\t<Zg.)u\u001c|%\u0018d\u0013\u007f.R<Z nK<Z!nK9V03\u000e~?h0\u0014~\u001f~4R+pv,\u0014q\u000e03\u0013\u007f\bu\u0006\u001as\u000e\u007f2[-Zs,\u001a}\n87\u001ad\u001fb\u0004\u001e`\u000exo\u0019b\u001fq+,q\u000eu2?u\nd(Vr\bu!\u0010G\u001bd%\t_\u001cv3\u001edPg.5\u007f\b}!\u0017>\r<`K>J<`J>J9{qv\u0016\u007f!\u000f0\u0014t/\u000fuZ-`\u001f\u007f\u000e87\u0015F\u001fs4\u0014bV07\u0015^\u0015b-\u001a|Th9\u00019A\u001a&\u0017\u007f\u001bd`\u001db\u001fc.\u001e|Z-`\u000b\u007f\r8qU Wq\"\b8\u0014t/\u000fuS<`I>J9{qf\u001fst[c\u000fb&\u001as\u001fS/\u0017\u007f\u000fb`F0\fu#O8\u001f~68\u007f\u0016\u007f5\t<Zv2\u001ec\u0014u,Qc\u0012\u007f2\u001eV\u001bs4\u0014bS;3\u000bu\u0019e,\u001ab9\u007f,\u0014e\b:3\u0013\u007f\bu\u0006\u001as\u000e\u007f2@\u001a\u001d|\u001f=b\u001bw\u0003\u0014|\u0015b`F0\fu#O8\u0017y8Sc\u000fb&\u001as\u001fS/\u0017\u007f\u000fbn\tw\u0018<`\u001c|%V/\u001c>\u0019\u007f,\u0014bTb'\u0019<Zw,$V\u0015w\u0006\tq\u001dS/\u0014b\u001e9l[c\u000fb&\u001as\u001fS/\u0017\u007f\u000fbn\u001a9A\u001a=q")), method4367(method4366("\u000e~\u0013v/\t}Zv,\u0014q\u000e04\u0012}\u001f+J\u000e~\u0013v/\t}Zv,\u0014q\u000e03\u0018q\u0016u{qf\u001bb9\u0012~\u001d06\u001esI07\rF\u001fb4\u001ehA\u001a6\u001ab\u0003y.\u001c0\u001c|/\u001adZg!\u000fu\bT%\u000bd\u0012+J\r\u007f\u0013t`\u0016q\u0013~hR0\u0001\u001a7\u001ad\u001fb\u0004\u001e`\u000ex`F0\u001d|\u001f6e\u0016d)/u\u0002S/\u0014b\u001e n\u0001+pf%\u0018$Zu#-u\bd%\u00030G0'\u0017O7\u007f$\u001e|,y%\f]\u001bd2\u0012hPw,$F\u001fb4\u001ehA\u001a7\rF\u001fb4\u001ehTh`F0\u001e\u007f4Sw\u0016O\u000e\u0014b\u0017q,6q\u000eb)\u0003KJMl[u\u0019F%\td\u001fhn\u0003i\u00009{qg\fF%\td\u001fhn\u00020G0$\u0014dRw,$^\u0015b-\u001a|7q4\ty\u0002Kq&<Zu#-u\bd%\u0003>\u0002i:R+pg6-u\bd%\u0003>\u00000}[t\u0015dh\u001c|%^/\t}\u001b|\r\u001ad\by8 \"'<`\u001es,u2\u000fu\u0002>8\u0002jS+J\u001c|%D%\u0003S\u0015\u007f2\u001fKJMn\u00030G0$\u0014dRw,$D\u001fh4\u000eb\u001f]!\u000fb\u0013h\u001bKM! \u001dW0\u001d|\u001f6e\u0016d)/u\u0002S/\u0014b\u001e iQc\u0019q,\u001e+pw,$D\u001fh\u0003\u0014\u007f\bt\u001bKMTi`F0\u001e\u007f4Sw\u0016O\u0014\u001eh\u000ee2\u001e]\u001bd2\u0012h! \u001d !'<`\u001c|%]5\u0017d\u0013D%\u0003S\u0015\u007f2\u001f S:3\u0018q\u0016u{qw\u0016O\u0014\u001eh9\u007f/\tt! \u001dUjZ-`\u000fy\u0017u{qw\u0016O\u0014\u001eh9\u007f/\tt! \u001dUgZ-`J>J+J\u001c|%V/\u001cV\bq'8\u007f\u0015b$[-Z!nK=\u0019|!\u0016`R8'\u0017O<\u007f'Uu\u0014tk\u001es,u2\u000fu\u0002>:R:\u001d|\u001f=\u007f\u001d>3\u0018q\u0016ul[ T l[!T i@\u001a\u001d|\u001f+\u007f\ty4\u0012\u007f\u00140}[v\u000eb!\u0015c\u001c\u007f2\u00168S+J\u0006\u001a")), method4367(method4366("\u0000>T>=")), method4367(method4366("\u0013zT,)\u0015y\u000e.h")), method4367(method4366("\u0013zTTh")), method4367(method4366("\u0013zTSh")), method4367(method4366("\u0013zTRh")), method4367(method4366("\u000fy\u0017u")), method4367(method4366("\u0019b\u001fq+,q\u000eu2?u\nd(")), method4367(method4366("\bs\u001b|%")), method4367(method4366("\u0019b\u001fq+,q\u000eu24v\u001cc%\u000f")), method4367(method4366("\u0013zTXh")), method4367(method4366("\u0013zTWh"))};
   @OriginalMember(
      owner = "client!hj",
      name = "g",
      descriptor = "Lsd;"
   )
   public static class101 field8763 = new class101(99, 6);
   @OriginalMember(
      owner = "client!hj",
      name = "k",
      descriptor = "Lsd;"
   )
   public static class101 field8774 = new class101(98, 8);
   @OriginalMember(
      owner = "client!hj",
      name = "n",
      descriptor = "I"
   )
   public static int field8765;
   @OriginalMember(
      owner = "client!hj",
      name = "h",
      descriptor = "I"
   )
   public static int field8766;
   @OriginalMember(
      owner = "client!hj",
      name = "j",
      descriptor = "I"
   )
   public static int field8767;
   @OriginalMember(
      owner = "client!hj",
      name = "i",
      descriptor = "I"
   )
   public static int field8769;
   @OriginalMember(
      owner = "client!hj",
      name = "q",
      descriptor = "I"
   )
   public static int field8770;
   @OriginalMember(
      owner = "client!hj",
      name = "l",
      descriptor = "I"
   )
   public static int field8771;
   @OriginalMember(
      owner = "client!hj",
      name = "e",
      descriptor = "I"
   )
   public static int field8773;
   @OriginalMember(
      owner = "client!hj",
      name = "p",
      descriptor = "Lpg;"
   )
   public static class763 field8772;

   @OriginalMember(
      owner = "client!hj",
      name = "<init>",
      descriptor = "(Lck;Lae;)V",
      line = 3
   )
   public class595(class667 arg0, class262 arg1) {
      super(arg0);

      try {
         this.field8764 = arg1;
         if (this.field8764.field3576 != null && super.field7700.field9975 && super.field7700.field10018) {
            class481 var3 = class48.method385((byte)-94, 35633, field8776[10], super.field7700);
            class481 var4 = class48.method385((byte)-118, 35632, field8776[9], super.field7700);
            this.field8762 = class519.method3826(super.field7700, new class481[]{var3, var4}, 7113);
            this.field8768 = this.field8762 != null;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field8776[12] + (arg0 != null ? field8776[11] : field8776[8]) + ',' + (arg1 != null ? field8776[11] : field8776[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(Z)V",
      line = 22
   )
   public static void method4364(boolean arg0) {
      try {
         field8763 = null;
         field8772 = null;
         if (arg0) {
            field8774 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8776[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(ILbca;I)V",
      line = 36
   )
   public final void method870(int arg0, class689 arg1, int arg2) {
      try {
         ++field8767;
         if (arg2 == -1) {
            if (!this.field8775) {
               super.field7700.method4818((byte)-126, arg1);
               super.field7700.method4796(false, arg0);
            }
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field8776[15] + arg0 + ',' + (arg1 != null ? field8776[11] : field8776[8]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "c",
      descriptor = "(I)Z",
      line = 55
   )
   public final boolean method873(int arg0) {
      try {
         ++field8765;
         return arg0 != 0 ? false : false;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8776[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "b",
      descriptor = "(IZ)V",
      line = 70
   )
   public final void method872(int arg0, boolean arg1) {
      try {
         if (arg0 < 12) {
            this.method870(63, (class689)null, -6);
         }

         ++field8769;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8776[21] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(III)V",
      line = 84
   )
   public final void method871(int arg0, int arg1, int arg2) {
      try {
         int var4 = 110 / ((75 - arg1) / 37);
         if (this.field8775) {
            int var5 = 1 << (3 & arg0);
            float var6 = (float)(1 << (arg0 >> 3 & 7)) / 32.0F;
            int var7 = arg2 & 65535;
            float var8 = (float)((arg2 & 196646) >> 16) / 8.0F;
            long var9 = this.field8762.field4604;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var9, field8776[16]), (float)(super.field7700.field9898 * var5 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var9, field8776[18]), var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var9, field8776[17]), (float)var7);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var9, field8776[19]), var8);
         }

         ++field8766;
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field8776[20] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(IZ)V",
      line = 112
   )
   public final void method878(int arg0, boolean arg1) {
      try {
         ++field8771;
         if (arg0 != 0) {
            this.field8775 = false;
         }

         class355 var3 = super.field7700.method4851((byte)-30);
         if (this.field8768 && var3 != null) {
            super.field7700.method4828(1, (byte)66);
            super.field7700.method4818((byte)22, var3);
            super.field7700.method4828(0, (byte)66);
            super.field7700.method4818((byte)40, this.field8764.field3576);
            long var4 = this.field8762.field4604;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field8776[2]), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field8776[3]), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, field8776[1]), -super.field7700.field9987[0], -super.field7700.field9987[1], -super.field7700.field9987[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, field8776[5]), super.field7700.field9978, super.field7700.field10017, super.field7700.field9955, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, field8776[4]), 928.0F * Math.abs(super.field7700.field9987[1]) + 96.0F);
            this.field8775 = true;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field8776[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "b",
      descriptor = "(I)V",
      line = 142
   )
   public final void method874(int arg0) {
      try {
         if (arg0 != 1) {
            this.field8764 = null;
         }

         if (this.field8775) {
            super.field7700.method4828(1, (byte)66);
            super.field7700.method4818((byte)36, (class689)null);
            super.field7700.method4828(0, (byte)66);
            super.field7700.method4818((byte)-109, (class689)null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field8775 = false;
         }

         ++field8770;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8776[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(ZIIIZ)I",
      line = 168
   )
   public static final int method4365(boolean arg0, int arg1, int arg2, int arg3, boolean arg4) {
      int var5 = client.field4530;

      try {
         ++field8773;
         int var6 = 107 / ((-7 - arg2) / 40);
         class5 var7 = class289.method2200(arg3, 0, arg0);
         if (var7 == null) {
            return 0;
         } else {
            int var8 = 0;
            int var9 = 0;
            int var10000;
            if (var5 != 0) {
               var10000 = var7.field88[var9];
            } else if (~var9 <= ~var7.field88.length) {
               var10000 = var8;
               if (var5 == 0) {
                  return var8;
               }
            } else {
               var10000 = var7.field88[var9];
            }

            while(true) {
               if (var10000 >= 0) {
                  if (~class54.field616.field2842 < ~var7.field88[var9]) {
                     class91 var10 = class54.field616.method1689(var7.field88[var9], (byte)-35);
                     int var11 = var10.method839(class170.field2105.method3799(-121, arg1).field6933, true, arg1);
                     if (arg4) {
                        var8 += var7.field87[var9] * var11;
                        if (var5 != 0) {
                           var8 += var11;
                           ++var9;
                        } else {
                           ++var9;
                        }
                     } else {
                        var8 += var11;
                        ++var9;
                     }
                  } else {
                     ++var9;
                  }
               } else {
                  ++var9;
               }

               if (~var9 <= ~var7.field88.length) {
                  var10000 = var8;
                  if (var5 == 0) {
                     return var8;
                  }
               } else {
                  var10000 = var7.field88[var9];
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field8776[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4366(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4367(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 16;
            break;
         case 2:
            var10005 = 122;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
