import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class182 extends class14 {
   @OriginalMember(
      owner = "client!ld",
      name = "q",
      descriptor = "Lds;"
   )
   private class16 field2566;
   @OriginalMember(
      owner = "client!ld",
      name = "z",
      descriptor = "Lko;"
   )
   private class533 field2559;
   @OriginalMember(
      owner = "client!ld",
      name = "v",
      descriptor = "[F"
   )
   private float[] field2562;
   @OriginalMember(
      owner = "client!ld",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2567 = new String[]{method1451(method1450("\u0014=\u000ebr\u00160T`3")), method1451(method1450("Yxa\fY\u000e)\u0011p+r\u0016p\nR7\u0017\u0000~Z*\u001b\u007f.t\u000b0T7t\u0016\u0006I0m\u0019+I?u\fb*\u001fO,\u000bi\u001c;X0p1hXy\u0000~;Xy\u0000~&X/E,o\u001d!\u000e.t\u000b0T7t\u0016b*\u001fO,\u000bi\u001c;X0c1w\u0017,R~;Xy\u0000~&X/E,o\u001d!\u000e=t\u00146Re\u00119\rt\fR:y\u00007O\u001d!c1t\n=\u0000~;Xd\u0000(~\n-E&5\f<X=t\u0017+D\u0005+%b*\u0011N,\tu\n;X6c1w\u0017,R~;Xy\u0000~&X+E-n\u0014-\u000e=t\u00146Re\u00117\ft\u000eN,y\u00001O\u001d!c1t\n=\u0010~;Xd\u0000,~\u000b,L*5\f<X=t\u0017+D\u0005+%b*\u0011N,\tu\n;X6t;c;6O,\u007fIy\u0000~&X+E-n\u0014-\u000e*~\u0000:O1i\u001c\u0002\u0011\u0003 r\u0016u\nK-\r\u0000~t>6G\u001dt\u0017+D~;Xy\u001d~i\u001d*U2oV?O9x\u00176R: r\ta\fZ5y\u0000~o\u00114E~;Xy\u0000~;Xy\u001d~k\n6G,z\u0015wL1x\u00195{h.%b*\u000eZ*\u0018m~;X-U,y\r5E0x\u001dy\u0000~&X)R1|\n8Mpw\u0017:A2@Nm}e\u0011(\u0018r\u001fVXy\u00002r\u001f1T\u001fv\u001a0E0oXd\u0000.i\u0017>R?vV5O=z\u0014\u0002\u0016hFCy*\u000eZ*\u0018m~;X)m?o\n0X\u0005/%y\u0000~&X\"\u0000-o\u0019-Epv\u0019-R7cV)R1q\u001d:T7t\u0016y]e\u0011(\u0018r\u001fVXy\u00003m58T,r\u0000\u0002\u0014\u0003;Xd\u0000%;\u000b-A*~V4A*i\u0011!\u000e3t\u001c<L(r\u001d.\u0000# r\ta\fZ5y\u0000~r\u000e\u0014A*i\u0011!{jFXy\u001d~`X*T?o\u001dwM?o\n0Xpo\u001d!T+i\u001d\u0002\u0011\u0003;\u0005b*\u000eZ*\u0018m~;X-E&V\u0019-R7c#m}~;Ey[~h\f8T;5\u00158T,r\u0000wT;c\f,R;@H\u0004\u0000# r\ta\fZ5y\u0000~}66I-~#o\u0014\u0003;Xy\u001d~`X)R1|\n8Mpw\u0017:A2@Hw\u000eh(%y]e\u0011,\u001cm\u000e;Xy\u00000t\u0011*Er;\u000e0E)K\u0017*\f~l\u0017+L:K\u0017*\f~o\u001d!c1t\n=\u001bTZ<\u001dr\u001bH+yN1r\u000b<a:\u007f\nb*\u001aKLy\u0000~m\u0011<W\u000et\u000bwXr;\u0015/m?o\n0X\u0005+%u\u00007K\u0017*\u001bT_(m\u0000~;\u000e0E)K\u0017*\u000e'7X4V\u0013z\f+I&@I\u0004\f~r(6Se\u0011<\t\u0014~;X/I;l(6SpaTyM(V\u0019-R7c#k}r;\u0011\tO- r\u001dpj;XyV7~\u000f\tO-5\u000fu\u00003m58T,r\u0000\u0002\u0013\u00037X0p1hCSm\u0011MXy\u00001]\u0017>c1t\n=\u000e&7XtV7~\u000f\tO-5\u0002b*\u001aKLy\u0000~l\u0017+L:K\u0017*\u000e&7X0V\u0013z\f+I&@H\u0004\f~m\u0011<W\u000et\u000bb*\u001aKLy\u0000~l\u0017+L:K\u0017*\u000e'7X0V\u0013z\f+I&@I\u0004\f~m\u0011<W\u000et\u000bb*\u001aKLy\u0000~l\u0017+L:K\u0017*\u000e$7X0V\u0013z\f+I&@J\u0004\f~m\u0011<W\u000et\u000bb*\u001aKLy\u0000~l\u0017+L:K\u0017*\u000e)7X0V\u0013z\f+I&@K\u0004\f~m\u0011<W\u000et\u000bb*\u001f_<y\u0000~u\u00170S;5\u0000u\u0000)t\n5D\u000et\u000bwXr;\u000f6R2\u007f(6SpaC\nu\u001c;XyN1r\u000b<\u000e'7X.O,w\u001c\tO-5\u0002u\u0000)t\n5D\u000et\u000bwXeV-\u0015\u0000~;\u00166I-~TyN1r\u000b<\f~+Vi\u0010n*Jk\u0010i+Kh\u0012k r\u001fr\u001d;XyN1r\u000b<\f~u\u00170S; r\u0014u\u0012;XyN1r\u000b<\f~u\u00170S;7Xo\u0014e\u00119\u000bl~;X7O7h\u001d\u0018D:iV!\f~u\u00170S;5\u0000b*\u0013T.y\u0000~u\u00170S;5\u0000u\u00008U\u00170S;@\u00166I-~9=D,5\u0000\u0004\u000e& r\u0018r\u0012;XyN1r\u000b<a:\u007f\nwXr;\u00166I-~V \u001bTV7\u000f\u0000~;\u00166I-~V \f~}66I-~#7O7h\u001d\u0018D:iV!}pbCSm\u000bWXy\u00000t\u0011*Er;\u00166I-~TyT+i\u001a,L;u\u001b<\u000e& r\u001dpj;XyT;c;6O,\u007fV!\f~o\u001d!m?o\n0X\u0005+%u\u00007O\u001d!c1t\n=\u001bT_(m\u0000~;\f<X\u001dt\u0017+DpbTyT;c58T,r\u0000\u0002\u0011\u00037X0t;c;6O,\u007fCSa\u001a_Xy\u00001O\u001d!c1t\n=\u0010pc\u0001u\u0000*~\u0000\u001aO1i\u001cu\u00000t\u0011*Ee\u00115\u0016v~;X6t;c;6O,\u007fHwZr;Hb*\u0013T.y\u0000~t,<X\u001dt\u0017+Dn5\u000fu\u0000o r\u0014u\u0012;XyO\n~\u0000\u001aO1i\u001ch\u000e&bTyT;c;6O,\u007fTy\u0010p*Jl\u001bTV7\u000f\u0000~;\u0017\rE&X\u00176R:*V#Wr;\f0M;5\u0000!X) r\u0014u\u0012;XyO\u001dt\u00146U,5\u0000 Zr;\u0011\u001aO2t\r+\f~w\u0011>H*Z\u0015;I;u\fb*\u0013T.y\u0000~t;6L1n\nwWr;\u0011\u001aO2t\r+\u000e) r\u001cn\u001a")), method1451(method1450("\u0016,L2")), method1451(method1450("\u0003w\u000epf")), method1451(method1450("\u0014=\u000e\u001d3")), method1451(method1450("\u0014=\u000e\u001f3")), method1451(method1450("\u0014=\u000e\u00143")), method1451(method1450("\u0014=\u000e\u00123")), method1451(method1450("\u0014=\u000e\u00133")), method1451(method1450("\u0014=\u000e\u00153")), method1451(method1450("TyR+u\u00160N9!X")), method1451(method1450("\u0015*")), method1451(method1450("Vyt7v\u001dyT?p\u001d7\u001a~")), method1451(method1450("(8R*r\u001b5E~h\u0001*T;vX:O+u\fc\u0000")), method1451(method1450("=4I*o\u001d+Sd;")), method1451(method1450("X\tA,o\u0011:L;hBy")), method1451(method1450("\u0014=\u000e\u00173")), method1451(method1450("\u0014=\u000e\u001b3")), method1451(method1450("\u0014=\u000e\u001c3")), method1451(method1450("\u0014=\u000e\u00193")), method1451(method1450("\u0014=\u000e\u00163")), method1451(method1450("\u0014=\u000e\u00103"))};
   @OriginalMember(
      owner = "client!ld",
      name = "D",
      descriptor = "Z"
   )
   public static boolean field2548 = false;
   @OriginalMember(
      owner = "client!ld",
      name = "y",
      descriptor = "Lbl;"
   )
   public static class678 field2549 = null;
   @OriginalMember(
      owner = "client!ld",
      name = "s",
      descriptor = "F"
   )
   private float field2554;
   @OriginalMember(
      owner = "client!ld",
      name = "B",
      descriptor = "I"
   )
   public static int field2550;
   @OriginalMember(
      owner = "client!ld",
      name = "C",
      descriptor = "I"
   )
   public static int field2551;
   @OriginalMember(
      owner = "client!ld",
      name = "u",
      descriptor = "I"
   )
   public static int field2552;
   @OriginalMember(
      owner = "client!ld",
      name = "o",
      descriptor = "I"
   )
   private int field2553;
   @OriginalMember(
      owner = "client!ld",
      name = "w",
      descriptor = "I"
   )
   public static int field2555;
   @OriginalMember(
      owner = "client!ld",
      name = "x",
      descriptor = "I"
   )
   public static int field2556;
   @OriginalMember(
      owner = "client!ld",
      name = "n",
      descriptor = "I"
   )
   public static int field2557;
   @OriginalMember(
      owner = "client!ld",
      name = "p",
      descriptor = "I"
   )
   public static int field2558;
   @OriginalMember(
      owner = "client!ld",
      name = "t",
      descriptor = "I"
   )
   public static int field2560;
   @OriginalMember(
      owner = "client!ld",
      name = "E",
      descriptor = "I"
   )
   public static int field2561;
   @OriginalMember(
      owner = "client!ld",
      name = "m",
      descriptor = "I"
   )
   public static int field2563;
   @OriginalMember(
      owner = "client!ld",
      name = "A",
      descriptor = "I"
   )
   public static int field2565;
   @OriginalMember(
      owner = "client!ld",
      name = "r",
      descriptor = "Lcf;"
   )
   private class631 field2564;

   @OriginalMember(
      owner = "client!ld",
      name = "b",
      descriptor = "(III)V",
      line = 5
   )
   public static final void method1444(int arg0, int arg1, int arg2) {
      try {
         ++field2560;
         if (class236.method1817((byte)-5)) {
            class686.field10122 = arg0;
            if (~class203.field2883 != ~arg2) {
               class43.field597 = "";
            }

            class203.field2883 = arg2;
            class731.method5321(arg1, (byte)-88);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2567[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(ZI)V",
      line = 22
   )
   public final void method84(boolean arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field2552;
         if (this.field2564 != null) {
            this.field2564.method4571(false, '\u0000');
            super.field157.method4112((byte)-80, 1);
            OpenGL.glMatrixMode(5890);
            if (arg1 == 13254) {
               OpenGL.glLoadMatrixf(super.field157.field8387.method3687((byte)88), 0);
               OpenGL.glMatrixMode(5888);
               super.field157.method4112((byte)-31, 0);
               if (~super.field157.field8355 != ~this.field2553) {
                  int var4 = super.field157.field8355 % 5000 * 128 / 5000;
                  int var5 = 0;
                  if (var3) {
                     OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field2562, var4);
                     var4 += 2;
                     ++var5;
                  }

                  while(true) {
                     int var10000;
                     if (var5 >= 64) {
                        var10000 = this.field2566.field179;
                        if (!var3) {
                           label31: {
                              if (var10000 != 0) {
                                 this.field2554 = (float)(super.field157.field8355 % 4000) / 4000.0F;
                                 if (!var3) {
                                    break label31;
                                 }
                              }

                              OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                           }

                           this.field2553 = super.field157.field8355;
                           return;
                        }
                     } else {
                        var10000 = 34336;
                     }

                     OpenGL.glProgramLocalParameter4fvARB(var10000, var5, this.field2562, var4);
                     var4 += 2;
                     ++var5;
                  }
               }
            }
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field2567[20] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(IILkf;Ld;Ljava/awt/Canvas;Z)Lha;",
      line = 71
   )
   public static final class66 method1445(int arg0, int arg1, class266 arg2, class162 arg3, Canvas arg4, boolean arg5) {
      try {
         ++field2557;
         int var6 = 0;
         if (!arg5) {
            method1445(-30, -45, (class266)null, (class162)null, (Canvas)null, false);
         }

         int var7 = 0;
         if (arg4 != null) {
            Dimension var8 = arg4.getSize();
            var7 = var8.height;
            var6 = var8.width;
         }

         return class66.method522(arg3, var7, arg0, var6, arg2, arg4, 62, arg1);
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field2567[21] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2567[3] : field2567[2]) + ',' + (arg3 != null ? field2567[3] : field2567[2]) + ',' + (arg4 != null ? field2567[3] : field2567[2]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(BLsl;I)V",
      line = 94
   )
   public final void method86(byte arg0, class486 arg1, int arg2) {
      try {
         ++field2565;
         super.field157.method4107(25, arg1);
         super.field157.method4134(arg2, 2);
         if (arg0 <= 75) {
            method1444(-69, 54, 17);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field2567[19] + arg0 + ',' + (arg1 != null ? field2567[3] : field2567[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(IZ)V",
      line = 107
   )
   public final void method88(int arg0, boolean arg1) {
      try {
         ++field2551;
         if (arg0 != 16) {
            this.field2562 = null;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2567[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "c",
      descriptor = "(I)V",
      line = 121
   )
   private final void method1446(int arg0) {
      try {
         this.field2564 = new class631(super.field157, 2);
         ++field2556;
         this.field2564.method4569((char)arg0, (byte)-110);
         super.field157.method4112((byte)-80, 1);
         super.field157.method4160(-16777216, 2);
         super.field157.method4117(260, 7681, -1);
         super.field157.method4141(false, 0, 770, 34166);
         super.field157.method4112((byte)122, 0);
         OpenGL.glBindProgramARB(34336, this.field2559.field7600);
         OpenGL.glEnable(34336);
         this.field2564.method4570(arg0 ^ 256);
         this.field2564.method4569(1, (byte)-99);
         super.field157.method4112((byte)-39, 1);
         OpenGL.glMatrixMode(5890);
         OpenGL.glLoadIdentity();
         OpenGL.glMatrixMode(5888);
         super.field157.method4134(0, 2);
         super.field157.method4141(false, 0, 770, 5890);
         super.field157.method4112((byte)-7, 0);
         OpenGL.glBindProgramARB(34336, 0);
         OpenGL.glDisable(34336);
         OpenGL.glDisable(34820);
         this.field2564.method4570(256);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2567[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(I)Z",
      line = 150
   )
   public final boolean method87(int arg0) {
      try {
         ++field2555;
         return arg0 < -49;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2567[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "b",
      descriptor = "(I)V",
      line = 164
   )
   public final void method85(int arg0) {
      try {
         ++field2561;
         if (this.field2564 != null) {
            this.field2564.method4571(false, '\u0001');
            super.field157.method4112((byte)117, 1);
            super.field157.method4107(-128, (class486)null);
            super.field157.method4112((byte)104, 0);
            if (arg0 != 17328) {
               this.field2559 = null;
            }
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2567[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(III)V",
      line = 182
   )
   public final void method82(int arg0, int arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         ++field2563;
         if (this.field2564 != null) {
            label66: {
               super.field157.method4112((byte)111, 1);
               if (~(128 & arg1) == -1) {
                  if ((arg2 & 1) != 1) {
                     label61: {
                        if (!this.field2566.field179) {
                           super.field157.method4107(39, this.field2566.field184[0]);
                           if (!var4) {
                              break label61;
                           }
                        }

                        super.field157.method4107(arg0 + -14007, this.field2566.field189);
                     }

                     OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                     if (!var4) {
                        break label66;
                     }
                  }

                  if (this.field2566.field179) {
                     super.field157.method4107(-127, this.field2566.field189);
                     OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field2554, 0.0F, 0.0F, 1.0F);
                     if (!var4) {
                        break label66;
                     }
                  }

                  int var5 = super.field157.field8355 % 4000 * 16 / 4000;
                  super.field157.method4107(-124, this.field2566.field184[var5]);
                  OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                  if (!var4) {
                     break label66;
                  }
               }

               super.field157.method4107(arg0 + -13787, (class486)null);
            }

            label48: {
               super.field157.method4112((byte)-7, 0);
               if (~(64 & arg1) == -1) {
                  class776.field11385[0] = super.field157.field8471 * super.field157.field8402;
                  class776.field11385[1] = super.field157.field8471 * super.field157.field8440;
                  class776.field11385[2] = super.field157.field8471 * super.field157.field8442;
                  OpenGL.glProgramLocalParameter4fvARB(34336, 66, class776.field11385, 0);
                  if (!var4) {
                     break label48;
                  }
               }

               OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            int var6 = arg1 & 3;
            if (arg0 == 13880) {
               if (var6 != 2) {
                  if (~var6 == -4) {
                     OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
                  } else {
                     OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
                  }
               } else {
                  OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field2567[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(ILha;J)V",
      line = 255
   )
   public static final void method1447(int arg0, class66 arg1, long arg2) {
      boolean var4 = client.field4360;

      try {
         class552.field7915 = 0;
         class652.field9559 = 0;
         ++field2550;
         class343.field4654 = class22.field255;
         class22.field255 = arg0;
         long var5 = class133.method1054(-29025);
         class577 var7 = (class577)class663.field9658.method5529((byte)-42);
         if (var4) {
            if (var7.method4195(arg1, arg2)) {
               ++class552.field7915;
            }

            var7 = (class577)class663.field9658.method5527((byte)45);
         }

         while(true) {
            boolean var10000;
            if (var7 == null) {
               var10000 = class328.field4480;
               if (!var4) {
                  if (var10000 && arg2 % 100L == 0L) {
                     System.out.println(field2567[13] + class663.field9658.method5524(true) + field2567[10] + class552.field7915);
                     System.out.println(field2567[14] + class652.field9559 + field2567[15] + class22.field255 + field2567[12] + (-var5 + class133.method1054(-29025)) + field2567[11]);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = var7.method4195(arg1, arg2);
            }

            if (var10000) {
               ++class552.field7915;
            }

            var7 = (class577)class663.field9658.method5527((byte)45);
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field2567[9] + arg0 + ',' + (arg1 != null ? field2567[3] : field2567[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(Ld;BLkf;)V",
      line = 287
   )
   public static final void method1448(class162 arg0, byte arg1, class266 arg2) {
      try {
         ++field2558;
         class265.field3655 = arg0;
         if (arg1 < -56) {
            class57.field702 = arg2;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2567[6] + (arg0 != null ? field2567[3] : field2567[2]) + ',' + arg1 + ',' + (arg2 != null ? field2567[3] : field2567[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(B)V",
      line = 302
   )
   public static void method1449(byte arg0) {
      try {
         if (arg0 >= -89) {
            method1444(-113, -119, -10);
         }

         field2549 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2567[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "<init>",
      descriptor = "(Lea;Lds;)V",
      line = 317
   )
   public class182(class573 arg0, class16 arg1) {
      boolean var3 = client.field4360;
      super(arg0);

      try {
         this.field2566 = arg1;
         if (super.field157.field8489 && ~super.field157.field8422 <= -3) {
            this.field2559 = class137.method1084(super.field157, false, 34336, field2567[1]);
            if (this.field2559 != null) {
               int[][] var4 = class84.method749(256, 0, false, 4, 3, (byte)-122, 64, 0.4F, 4);
               int[][] var5 = class84.method749(256, 8, false, 4, 3, (byte)-127, 64, 0.4F, 4);
               this.field2562 = new float[32768];
               int var6 = 0;
               int var7 = 0;
               if (!var3 && var7 >= 256) {
                  this.method1446(0);
               } else {
                  do {
                     int[] var8 = var4[var7];
                     int[] var9 = var5[var7];
                     int var10 = 0;
                     if (var3) {
                        this.field2562[var6++] = (float)var8[var10] / 4096.0F;
                        this.field2562[var6++] = (float)var9[var10] / 4096.0F;
                        ++var10;
                     }

                     while(true) {
                        while(var10 < 64) {
                           this.field2562[var6++] = (float)var8[var10] / 4096.0F;
                           this.field2562[var6++] = (float)var9[var10] / 4096.0F;
                           ++var10;
                        }

                        if (!var3) {
                           ++var7;
                           break;
                        }

                        ++var10;
                     }
                  } while(var7 < 256);

                  this.method1446(0);
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field2567[0] + (arg0 != null ? field2567[3] : field2567[2]) + ',' + (arg1 != null ? field2567[3] : field2567[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1450(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1451(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 89;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
