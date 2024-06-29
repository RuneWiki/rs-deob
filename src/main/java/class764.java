import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class764 extends class757 {
   @OriginalMember(
      owner = "client!cc",
      name = "h",
      descriptor = "Lee;"
   )
   private class707 field11026;
   @OriginalMember(
      owner = "client!cc",
      name = "l",
      descriptor = "Lgg;"
   )
   private class186 field11041;
   @OriginalMember(
      owner = "client!cc",
      name = "e",
      descriptor = "[F"
   )
   private float[] field11035;
   @OriginalMember(
      owner = "client!cc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11043 = new String[]{method5492(method5491("\u001dx\u0002\u0011|")), method5492(method5491("\u001dx\u0002\u001c|")), method5492(method5491("\u0010n@4")), method5492(method5491("\u001dx\u0002\u0019|")), method5492(method5491("\u00055\u0002v)")), method5492(method5491("\u001dx\u0002\u001b|")), method5492(method5491("\u001dx\u0002\u001f|")), method5492(method5491("\u001dx\u0002\u0010|")), method5492(method5491("\u001dx\u0002\u001a|")), method5492(method5491("\u001dx\u0002\u001e|")), method5492(method5491("\u001dx\u0002\u001d|")), method5492(method5491("\u001dx\u0002d=\u0010rXf|")), method5492(method5491("_:m\n\u0016\bk\u001dvdtT|\f\u001d1U\fx\u0015,Ys(;\rrX1;\u0010DE6\"\u001fiE9:\n &\u0019\u0000*Ie\u001at^r|7'^;\fxt^;\fxi^mI* \u001bc\u0002(;\rrX1;\u0010 &\u0019\u0000*Ie\u001at^ro78\u0011n^xt^;\fxi^mI* \u001bc\u0002;;\u0012t^c^?Ox\n\u001d<;\f1\u0000\u001bco7;\f\u007f\fxt^&\f.1\foI z\n~T;;\u0011iH\u0003d# &\u0017\u0001*Ky\ft^to78\u0011n^xt^;\fxi^iI+!\u0012o\u0002;;\u0012t^c^1Nx\b\u0001*;\f7\u0000\u001bco7;\f\u007f\u001cxt^&\f*1\rn@,z\n~T;;\u0011iH\u0003d# &\u0017\u0001*Ky\ft^tx=,=tC*0O;\fxi^iI+!\u0012o\u0002,1\u0006xC7&\u001a@\u001d\u0005otTy\f\u0004+O\fx;8tK\u001b;\u0011iHxt^;\u0011x&\u001bhY4 P}C?7\u0011t^<otKm\n\u00153;\fx \u0017vIxt^;\fxt^;\u0011x$\ftK*5\u00135@77\u001fwwna# &\b\u0015,Zaxt^oY*6\u000bwI67\u001b;\fxi^k^73\fzAv8\u0011xM4\u000fH/qc^.Z~\u0019\u0019^;\f4=\u0019sX\u00199\u001crI6 ^&\f(&\u0011|^99PwC;5\u0012@\u001an\tE;&\b\u0015,Zaxt^ka9 \frT\u0003`#;\fxi^`\f+ \u001foIv9\u001fo^1,Pk^7>\u001bxX1;\u0010;Qc^.Z~\u0019\u0019^;\f5\"3zX*=\u0006@\u0018\u0005t^&\f#t\roM,1PvM,&\u0017c\u00025;\u001a~@.=\u001bl\f%otKm\n\u00153;\fx=\bVM,&\u0017cwl\t^;\u0011x/^hX9 \u001b5A9 \frTv \u001bcX-&\u001b@\u001d\u0005t\u0003 &\b\u0015,Zaxt^oI \u0019\u001fo^1,%/qxtC;Wx'\nzX=z\u0013zX*=\u00065X=,\nn^=\u000fNF\f%otKm\n\u00153;\fx20tE+1%-\u0018\u0005t^;\u0011x/^k^73\fzAv8\u0011xM4\u000fN5\u0002ng#;Qc^*^a\bt^;\f6;\u0017hItt\brI/\u0004\u0011h\u0000x#\u0011i@<\u0004\u0011h\u0000x \u001bco7;\f\u007f\u0017R\u0015:_~\u001d\u0007-;B7=\r~m<0\f &\u001c\u0004J;\fx\"\u0017~[\b;\r5Ttt\u0013ma9 \frT\u0003d#7\f1\u0004\u0011h\u0017R\u0010./\fxt\brI/\u0004\u0011h\u0002!x^vZ\u00155\niE \u000fOF\u0000x=.t_c^:K\u0018xt^mE=#.t_v.R;A.\u0019\u001fo^1,%)qtt\u0017KC+ot_|lt^;Z11\tKC+z\t7\f5\"3zX*=\u0006@\u001f\u0005x^r|7'E\u0011a\u0017\u0002^;\f7\u0012\u0011|o7;\f\u007f\u0002 x^6Z11\tKC+z\u0004 &\u001c\u0004J;\fx#\u0011i@<\u0004\u0011h\u0002 x^rZ\u00155\niE \u000fNF\u0000x\"\u0017~[\b;\r &\u001c\u0004J;\fx#\u0011i@<\u0004\u0011h\u0002!x^rZ\u00155\niE \u000fOF\u0000x\"\u0017~[\b;\r &\u001c\u0004J;\fx#\u0011i@<\u0004\u0011h\u0002\"x^rZ\u00155\niE \u000fLF\u0000x\"\u0017~[\b;\r &\u001c\u0004J;\fx#\u0011i@<\u0004\u0011h\u0002/x^rZ\u00155\niE \u000fMF\u0000x\"\u0017~[\b;\r &\u0019\u0010:;\fx:\u0011r_=z\u00067\f/;\fwH\b;\r5Ttt\tt^40.t_v.EHy\u001at^;B7=\r~\u0002!x^lC*8\u001aKC+z\u00047\f/;\fwH\b;\r5Tc\u0019+W\fxt\u0010tE+1R;B7=\r~\u0000xdP+\u001cheL)\u001codM*\u001emot]~\u001bt^;B7=\r~\u0000x:\u0011r_=otVy\u0014t^;B7=\r~\u0000x:\u0011r_=x^-\u0018c^?I`xt^uC1'\u001bZH<&Pc\u0000x:\u0011r_=z\u0006 &\u0015\u001b(;\fx:\u0011r_=z\u00067\f>\u001a\u0011r_=\u000f\u0010tE+1?\u007fH*z\u0006F\u0002 otZ~\u0014t^;B7=\r~m<0\f5Ttt\u0010tE+1Pb\u0017R\u00191M\fxt\u0010tE+1Pb\u0000x20tE+1%uC1'\u001bZH<&Pcqv-E\u0011a\r\u0018^;\f6;\u0017hItt\u0010tE+1R;X-&\u001cn@=:\u001d~\u0002 ot_|lt^;X=,=tC*0Pc\u0000x \u001bca9 \frT\u0003d#7\f1\u0000\u001bco7;\f\u007f\u0017R\u0010./\fxt\n~T\u001b;\u0011iHv-R;X=,3zX*=\u0006@\u001d\u0005x^rx=,=tC*0E\u0011m\u001c\u0010^;\f7\u0000\u001bco7;\f\u007f\u001cv,\u00077\f,1\u0006XC7&\u001a7\f6;\u0017hIc^3Tzxt^tx=,=tC*0N5VttN &\u0015\u001b(;\fx;*~T\u001b;\u0011iHhz\t7\fiotVy\u0014t^;C\f1\u0006XC7&\u001a*\u0002 -R;X=,=tC*0R;\u001cveL.\u0017R\u00191M\fxt\u0011OI \u0017\u0011t^<ePa[tt\nrA=z\u0006cT/otVy\u0014t^;C\u001b;\u0012tY*z\u0006bVtt\u0017XC4;\u000bi\u0000x8\u0017|D,\u0015\u0013yE=:\n &\u0015\u001b(;\fx;=t@7!\f5[tt\u0017XC4;\u000bi\u0002/ot^b\u001c")), method5492(method5491("\u001dx\u0002\u0012|"))};
   @OriginalMember(
      owner = "client!cc",
      name = "r",
      descriptor = "[F"
   )
   public static float[] field11037 = new float[4];
   @OriginalMember(
      owner = "client!cc",
      name = "o",
      descriptor = "F"
   )
   private float field11034;
   @OriginalMember(
      owner = "client!cc",
      name = "q",
      descriptor = "I"
   )
   public static int field11027;
   @OriginalMember(
      owner = "client!cc",
      name = "g",
      descriptor = "I"
   )
   public static int field11028;
   @OriginalMember(
      owner = "client!cc",
      name = "k",
      descriptor = "I"
   )
   public static int field11031;
   @OriginalMember(
      owner = "client!cc",
      name = "s",
      descriptor = "I"
   )
   public static int field11032;
   @OriginalMember(
      owner = "client!cc",
      name = "n",
      descriptor = "I"
   )
   private int field11033;
   @OriginalMember(
      owner = "client!cc",
      name = "m",
      descriptor = "I"
   )
   public static int field11036;
   @OriginalMember(
      owner = "client!cc",
      name = "p",
      descriptor = "I"
   )
   public static int field11038;
   @OriginalMember(
      owner = "client!cc",
      name = "j",
      descriptor = "I"
   )
   public static int field11039;
   @OriginalMember(
      owner = "client!cc",
      name = "i",
      descriptor = "I"
   )
   public static int field11040;
   @OriginalMember(
      owner = "client!cc",
      name = "f",
      descriptor = "I"
   )
   public static int field11042;
   @OriginalMember(
      owner = "client!cc",
      name = "u",
      descriptor = "Laga;"
   )
   private class697 field11029;
   @OriginalMember(
      owner = "client!cc",
      name = "t",
      descriptor = "[Lbo;"
   )
   public static class763[] field11030;

   @OriginalMember(
      owner = "client!cc",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method5487(int arg0) {
      try {
         field11030 = null;
         if (arg0 != 770) {
            method5487(-95);
         }

         field11037 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field11043[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method391(int arg0, boolean arg1) {
      boolean var3 = client.field4273;

      try {
         ++field11039;
         if (this.field11029 != null) {
            this.field11029.method5070('\u0000', 4);
            if (arg0 > 24) {
               super.field10974.method4841(1, 33984);
               OpenGL.glMatrixMode(5890);
               OpenGL.glLoadMatrixf(super.field10974.field9746.method3806((byte)123), 0);
               OpenGL.glMatrixMode(5888);
               super.field10974.method4841(0, 33984);
               if (super.field10974.field9711 != this.field11033) {
                  int var4 = super.field10974.field9711 % 5000 * 128 / 5000;
                  int var5 = 0;
                  if (var3) {
                     OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field11035, var4);
                     var4 += 2;
                     ++var5;
                  }

                  while(true) {
                     int var10000;
                     if (var5 >= 64) {
                        var10000 = this.field11026.field10264;
                        if (!var3) {
                           label31: {
                              if (var10000 == 0) {
                                 OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                                 if (!var3) {
                                    break label31;
                                 }
                              }

                              this.field11034 = (float)(super.field10974.field9711 % 4000) / 4000.0F;
                           }

                           this.field11033 = super.field10974.field9711;
                           return;
                        }
                     } else {
                        var10000 = 34336;
                     }

                     OpenGL.glProgramLocalParameter4fvARB(var10000, var5, this.field11035, var4);
                     var4 += 2;
                     ++var5;
                  }
               }
            }
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field11043[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method392(int arg0) {
      try {
         ++field11028;
         if (arg0 <= 110) {
            this.field11029 = null;
         }

         return true;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11043[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(BILmd;)V"
   )
   public final void method387(byte arg0, int arg1, class573 arg2) {
      try {
         ++field11031;
         super.field10974.method4848(false, arg2);
         super.field10974.method4879(0, arg1);
         if (arg0 != -96) {
            this.field11041 = null;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field11043[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11043[4] : field11043[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method386(int arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         ++field11032;
         if (this.field11029 != null) {
            if (arg1 <= -118) {
               label61: {
                  super.field10974.method4841(1, 33984);
                  if ((arg0 & 128) == 0) {
                     if (~(arg2 & 1) == -2) {
                        if (!this.field11026.field10264) {
                           int var5 = super.field10974.field9711 % 4000 * 16 / 4000;
                           super.field10974.method4848(false, this.field11026.field10259[var5]);
                           OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                           if (!var4) {
                              break label61;
                           }
                        }

                        super.field10974.method4848(false, this.field11026.field10261);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field11034, 0.0F, 0.0F, 1.0F);
                        if (!var4) {
                           break label61;
                        }
                     }

                     label57: {
                        if (this.field11026.field10264) {
                           super.field10974.method4848(false, this.field11026.field10261);
                           if (!var4) {
                              break label57;
                           }
                        }

                        super.field10974.method4848(false, this.field11026.field10259[0]);
                     }

                     OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                     if (!var4) {
                        break label61;
                     }
                  }

                  super.field10974.method4848(false, (class573)null);
               }

               label45: {
                  super.field10974.method4841(0, 33984);
                  if (~(64 & arg0) != -1) {
                     OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
                     if (!var4) {
                        break label45;
                     }
                  }

                  class318.field4243[0] = super.field10974.field9825 * super.field10974.field9808;
                  class318.field4243[1] = super.field10974.field9808 * super.field10974.field9795;
                  class318.field4243[2] = super.field10974.field9808 * super.field10974.field9805;
                  OpenGL.glProgramLocalParameter4fvARB(34336, 66, class318.field4243, 0);
               }

               int var6 = arg0 & 3;
               if (~var6 == -3) {
                  OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
               } else if (~var6 != -4) {
                  OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
               } else {
                  OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field11043[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "b",
      descriptor = "(B)V"
   )
   private final void method5488(byte arg0) {
      try {
         this.field11029 = new class697(super.field10974, 2);
         ++field11040;
         this.field11029.method5069(111, 0);
         super.field10974.method4841(1, 33984);
         super.field10974.method4876(-95, -16777216);
         super.field10974.method4862(7681, 260, 68);
         super.field10974.method4906((byte)26, 770, 0, 34166);
         super.field10974.method4841(0, 33984);
         if (arg0 <= -8) {
            OpenGL.glBindProgramARB(34336, this.field11041.field2283);
            OpenGL.glEnable(34336);
            this.field11029.method5068((byte)119);
            this.field11029.method5069(-61, 1);
            super.field10974.method4841(1, 33984);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field10974.method4879(0, 0);
            super.field10974.method4906((byte)26, 770, 0, 5890);
            super.field10974.method4841(0, 33984);
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34336);
            OpenGL.glDisable(34820);
            this.field11029.method5068((byte)119);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11043[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(FFFI)I"
   )
   public static final int method5489(float arg0, float arg1, float arg2, int arg3) {
      try {
         ++field11038;
         float var4 = arg2 < 0.0F ? -arg2 : arg2;
         float var5 = !((float)arg3 > arg1) ? arg1 : -arg1;
         float var6 = arg0 < 0.0F ? -arg0 : arg0;
         if (var4 < var5 && var5 > var6) {
            return !(arg1 > 0.0F) ? 1 : 0;
         } else if (var4 < var6 && var5 < var6) {
            return !(arg0 > 0.0F) ? 3 : 2;
         } else {
            return !(arg2 > 0.0F) ? 5 : 4;
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field11043[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method385(boolean arg0, int arg1) {
      try {
         ++field11027;
         if (arg1 != 500) {
            this.method391(41, true);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field11043[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(ILwm;)Lsja;"
   )
   public static final class11 method5490(int arg0, class594 arg1) {
      try {
         ++field11042;
         int var2 = arg1.method4280(-19104);
         if (arg0 > -116) {
            method5487(-19);
         }

         class190 var3 = class127.method1068((byte)71)[arg1.method4288((byte)61)];
         class169 var4 = class393.method2992(81)[arg1.method4288((byte)80)];
         int var5 = arg1.method4333(-106);
         int var6 = arg1.method4333(-64);
         return new class11(var2, var3, var4, var5, var6);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field11043[13] + arg0 + ',' + (arg1 != null ? field11043[4] : field11043[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "<init>",
      descriptor = "(Lor;Lee;)V"
   )
   public class764(class670 arg0, class707 arg1) {
      boolean var3 = client.field4273;
      super(arg0);

      try {
         this.field11026 = arg1;
         if (super.field10974.field9761 && super.field10974.field9763 >= 2) {
            this.field11041 = class124.method1041(34336, -107, super.field10974, field11043[12]);
            if (this.field11041 != null) {
               int[][] var4 = class517.method3752(256, false, 4, 0, 0.4F, 4, 3, 64, -90);
               int[][] var5 = class517.method3752(256, false, 4, 8, 0.4F, 4, 3, 64, -91);
               this.field11035 = new float[32768];
               int var6 = 0;
               int var7 = 0;
               if (!var3 && var7 >= 256) {
                  this.method5488((byte)-13);
               } else {
                  do {
                     int[] var8 = var4[var7];
                     int[] var9 = var5[var7];
                     int var10 = 0;
                     if (var3) {
                        this.field11035[var6++] = (float)var8[var10] / 4096.0F;
                        this.field11035[var6++] = (float)var9[var10] / 4096.0F;
                        ++var10;
                     }

                     while(true) {
                        while(~var10 > -65) {
                           this.field11035[var6++] = (float)var8[var10] / 4096.0F;
                           this.field11035[var6++] = (float)var9[var10] / 4096.0F;
                           ++var10;
                        }

                        if (!var3) {
                           ++var7;
                           break;
                        }

                        ++var10;
                     }
                  } while(var7 < 256);

                  this.method5488((byte)-13);
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field11043[11] + (arg0 != null ? field11043[4] : field11043[2]) + ',' + (arg1 != null ? field11043[4] : field11043[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method388(byte arg0) {
      try {
         ++field11036;
         if (this.field11029 != null) {
            this.field11029.method5070('\u0001', 4);
            super.field10974.method4841(1, 33984);
            super.field10974.method4848(false, (class573)null);
            int var2 = -6 / ((48 - arg0) / 63);
            super.field10974.method4841(0, 33984);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field11043[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5491(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 84);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5492(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 126;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
