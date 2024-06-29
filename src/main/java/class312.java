import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class312 extends class416 {
   @OriginalMember(
      owner = "client!nv",
      name = "k",
      descriptor = "Lwfa;"
   )
   private class786 field4838;
   @OriginalMember(
      owner = "client!nv",
      name = "i",
      descriptor = "Lep;"
   )
   private class454 field4832;
   @OriginalMember(
      owner = "client!nv",
      name = "j",
      descriptor = "[F"
   )
   private float[] field4847;
   @OriginalMember(
      owner = "client!nv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4848 = new String[]{method2603(method2602("-{z\u001cj")), method2603(method2602("8#zq?")), method2603(method2602("-x83")), method2603(method2602("7o&:$1h'7")), method2603(method2602("-{z\u0015j")), method2603(method2602("-{z\u001ej")), method2603(method2602("-{z\u0017j")), method2603(method2602("-{z\u0016j")), method2603(method2602("-{z\u0019j")), method2603(method2602("-{z\u001dj")), method2603(method2602("-{z\u001bj")), method2603(method2602("-{zc+-d aj")), method2603(method2602("b,\u0015\r\u00005}eqrIB\u0004\u000b\u000b\fCt\u007f\u0003\u0011O\u000b/-0d 6--R=14\"\u007f=>,76^\u001e\u0016\u0017_\u001d\u001dbcd\u000401c-t\u007fbc-t\u007f\u007fc{1-6&uz/-0d 6--6^\u001e\u0016\u0017_\u001d\u001dbcd\u00170.,x&\u007fbc-t\u007f\u007fc{1-6&uz<-/b&dH\u0002Y\u0000\r\u000b\u0001-t6\u0016&u\u00170-1it\u007fbc0t)'1y1'l7h,<-,\u007f0\u0004r\u001e6^\u0010\u0017\u0017]\u0001\u000bbcb\u00170.,x&\u007fbc-t\u007f\u007fc\u007f1,7/yz<-/b&dH\fX\u0000\u000f\u0017\u0017-t0\u0016&u\u00170-1id\u007fbc0t-'0x8+l7h,<-,\u007f0\u0004r\u001e6^\u0010\u0017\u0017]\u0001\u000bbcb\u0000::\u0000b;-&r-t\u007f\u007fc\u007f1,7/yz+';n;00'Ve\u0002yIB\u0001\u000b\u0012\u0016Yt\u007f-\u0005b3\u001c-,\u007f0\u007fbc-i\u007f0&~!36mk;8!,b&;yI]\u0015\r\u0003\u000e-t\u007f6*`1\u007fbc-t\u007fbc-i\u007f21b3-#.#80!\"a\u000fiw\u001e6^\u000f\u0003\u0011L\u0019\u007fbcy!- 6a11!&-t\u007f\u007fc}&0%1l9q.,n53\u0019u9\tdH\u0013L\u0006\u001e\u000fc-t3+$e \u001e/!d116c0t/0,j&>/ma;<#/Vbi\u001fx-^\u000f\u0003\u0011L\u0019\u007fbc}\u0019>61d,\u0004v\u001e-t\u007f\u007fcvt,6\"y1q/\"y&6:m}&0(&n 6---)dH\u0013L\u0006\u001e\u000fc-t24\u000el -+;V`\u0002bc0t$b0y5+'m`5+0*uz2-'h8)+&zt\"yI]\u0015\r\u0003\u000e-t\u007f+5@5+0*u\u000fk\u001fc-i\u007f9c~ >6&#9>61d,q6&u *0&Ve\u0002b>6^\u000f\u0003\u0011L\u0019\u007fbcy1'\u000f\"y&6:\u00189\t\u007fb~-/\u007f17l :l.l -+;# ::7x&:\u0019sPt\"yI]\u0015\r\u0003\u000e-t\u007f$\rb=,'\u0018;`\u0002bc-i\u007f9c}&0%1l9q.,n53\u0019s#ziq\u001e-)dH\u0017H\u0019\u000fbc-t1-*~1sb5d1(\u0012,~x\u007f5,\u007f8;\u0012,~x\u007f6&u\u00170-1ioU\u0003\u0007I\u0006\u001a\u0011\u0010-:0+0h\u0015;&16^\u001b\u0012w-t\u007f4*h#\u000f-0#,sb.{\u0019>61d,\u0004r\u001e!t6\u0012,~oU\u0006\u00139t\u007fb5d1(\u0012,~z&nc`\"\u0012#7\u007f='\u0019rPx\u007f+\u0013b'dH\u0007]`\u007fbc{=:5\u0013b'q8o-9)\u000f\"y&6:\u0018?\tsb*];,yII\u0004kbc-\"6'4];,l4!t24\u000el -+;Vg\u0002ncd\u000401x\u0007\u0019\u0010\u0014c-t0\u0004,j\u00170-1iz'nc \"6'4];,l96^\u001b\u0012w-t\u007f5,\u007f8;\u0012,~z'ncd\"\u0012#7\u007f='\u0019sPx\u007f4*h#\u000f-06^\u001b\u0012w-t\u007f5,\u007f8;\u0012,~z&ncd\"\u0012#7\u007f='\u0019rPx\u007f4*h#\u000f-06^\u001b\u0012w-t\u007f5,\u007f8;\u0012,~z%ncd\"\u0012#7\u007f='\u0019qPx\u007f4*h#\u000f-06^\u001b\u0012w-t\u007f5,\u007f8;\u0012,~z(ncd\"\u0012#7\u007f='\u0019pPx\u007f4*h#\u000f-06^\u001e\u0006\u0007-t\u007f,,d':l;!t(-1a0\u000f-0#,sb4b&3&\u0013b'q8x^\u0001\u001dbc-:0+0hz&ncz;-.'];,l9!t(-1a0\u000f-0#,d\u000f\u0016At\u007fb-b=,'o-:0+0hx\u007frm=dosq?dhrp<fjyIK\u0006\u001cbc-:0+0hx\u007f,,d':yI@\u0001\u0013bc-:0+0hx\u007f,,d':nc;`dH\u0002_\u0018\u007fbcc;61&L0;0mux\u007f,,d':l;6^\u0012\r\u0015-t\u007f,,d':l;!t9\f,d':\u0019-b=,'\u0002i0-l;Pz'yIL\u0006\u0013bc-:0+0h\u0015;&1#,sb-b=,'mtoU\u000f\f[t\u007fb-b=,'mtx\u007f$\rb=,'\u0018c;61&L0;0mu\tq;x\u0007\u0019\n\u000ec-t1-*~1sb-b=,'o- *0!x8:, hz'yII\u0004kbc- ::\u0000b;-&mux\u007f6&u\u0019>61d,\u0004r\u001e!t6\u0016&u\u00170-1ioU\u0006\u00139t\u007fb7h,\u001c-,\u007f0q;o- ::\u000el -+;Ve\u0002ncd\u0000::\u0000b;-&x\u0007\u0015\u001b\u0006c-t0\u0016&u\u00170-1idq::!t+';N;00'!t1-*~1dH\u000eB\u0002\u007fbcb\u0000::\u0000b;-&s#.sbs6^\u0012\r\u0015-t\u007f-\u0017h,\u001c-,\u007f0ol4!tnyI@\u0001\u0013bc-;\u000b';N;00'<z';o- ::\u0000b;-&o-dqsq8oU\u000f\f[t\u007fb,Y1'\u0001,b&;smw#sb7d9:l;u,(yI@\u0001\u0013bc-;\u001c-/b!-l;t.sb*N;3-6\u007fx\u007f.*j<+\u0003.o=:,76^\u0012\r\u0015-t\u007f-\u0000b8071##sb*N;3-6\u007fz(yIH\u001a\u001b")), method2603(method2602("-{z\u001aj")), method2603(method2602("-{z\u0018j")), method2603(method2602("-{z\u0014j"))};
   @OriginalMember(
      owner = "client!nv",
      name = "m",
      descriptor = "F"
   )
   private float field4836;
   @OriginalMember(
      owner = "client!nv",
      name = "f",
      descriptor = "I"
   )
   public static int field4830;
   @OriginalMember(
      owner = "client!nv",
      name = "p",
      descriptor = "I"
   )
   public static int field4831;
   @OriginalMember(
      owner = "client!nv",
      name = "o",
      descriptor = "I"
   )
   public static int field4834;
   @OriginalMember(
      owner = "client!nv",
      name = "q",
      descriptor = "I"
   )
   private int field4835;
   @OriginalMember(
      owner = "client!nv",
      name = "l",
      descriptor = "I"
   )
   public static int field4837;
   @OriginalMember(
      owner = "client!nv",
      name = "g",
      descriptor = "I"
   )
   public static int field4839;
   @OriginalMember(
      owner = "client!nv",
      name = "s",
      descriptor = "I"
   )
   public static int field4840;
   @OriginalMember(
      owner = "client!nv",
      name = "d",
      descriptor = "I"
   )
   public static int field4841;
   @OriginalMember(
      owner = "client!nv",
      name = "h",
      descriptor = "I"
   )
   public static int field4843;
   @OriginalMember(
      owner = "client!nv",
      name = "r",
      descriptor = "I"
   )
   public static int field4844;
   @OriginalMember(
      owner = "client!nv",
      name = "u",
      descriptor = "I"
   )
   public static int field4846;
   @OriginalMember(
      owner = "client!nv",
      name = "n",
      descriptor = "Lis;"
   )
   public static class435 field4845;
   @OriginalMember(
      owner = "client!nv",
      name = "e",
      descriptor = "Luf;"
   )
   private class701 field4833;
   @OriginalMember(
      owner = "client!nv",
      name = "t",
      descriptor = "[[[Z"
   )
   public static boolean[][][] field4842;

   @OriginalMember(
      owner = "client!nv",
      name = "b",
      descriptor = "(I)[Lbda;"
   )
   public static final class783[] method2597(int arg0) {
      try {
         ++field4844;
         if (arg0 > -28) {
            field4845 = null;
         }

         return new class783[]{class716.field10728, class751.field11145, class696.field10344, class288.field4528, class147.field2205, class82.field1164, class759.field11226, class650.field9377, class186.field2916, class133.field1892};
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4848[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "<init>",
      descriptor = "(Lc;Lwfa;)V"
   )
   public class312(class652 arg0, class786 arg1) {
      boolean var3 = client.field1786;
      super(arg0);

      try {
         this.field4838 = arg1;
         if (super.field6445.field9716 && ~super.field6445.field9704 <= -3) {
            this.field4832 = class659.method4854(field4848[12], super.field6445, -80, 34336);
            if (this.field4832 != null) {
               int[][] var4 = class170.method1574(4, 4096, 0.4F, 0, 256, 64, false, 4, 3);
               int[][] var5 = class170.method1574(4, 4096, 0.4F, 8, 256, 64, false, 4, 3);
               this.field4847 = new float[32768];
               int var6 = 0;
               int var7 = 0;
               if (!var3 && var7 >= 256) {
                  this.method2599(113);
               } else {
                  do {
                     int[] var8 = var4[var7];
                     int[] var9 = var5[var7];
                     int var10 = 0;
                     if (var3) {
                        this.field4847[var6++] = (float)var8[var10] / 4096.0F;
                        this.field4847[var6++] = (float)var9[var10] / 4096.0F;
                        ++var10;
                     }

                     while(true) {
                        while(var10 < 64) {
                           this.field4847[var6++] = (float)var8[var10] / 4096.0F;
                           this.field4847[var6++] = (float)var9[var10] / 4096.0F;
                           ++var10;
                        }

                        if (!var3) {
                           ++var7;
                           break;
                        }

                        ++var10;
                     }
                  } while(var7 < 256);

                  this.method2599(113);
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field4848[11] + (arg0 != null ? field4848[1] : field4848[2]) + ',' + (arg1 != null ? field4848[1] : field4848[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method2598(int arg0) {
      try {
         ++field4843;
         if (class657.field9823 != class129.field1851) {
            try {
               class676.method4989(class798.field11616, field4848[3], -23226);
            } catch (Throwable var2) {
            }

            if (arg0 != 1) {
               field4842 = null;
            }
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4848[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method1831(boolean arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field4839;
         if (this.field4833 != null) {
            this.field4833.method5160((byte)-76, '\u0000');
            super.field6445.method4787(-71, 1);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field6445.field9651.method1543((byte)116), 0);
            OpenGL.glMatrixMode(5888);
            if (arg1 != 3211) {
               method2601(-92, -22, -53, true, -53, 73, -62, 61, 14, (class482)null, -69);
            }

            super.field6445.method4787(-53, 0);
            if (~super.field6445.field9615 != ~this.field4835) {
               int var4 = super.field6445.field9615 % 5000 * 128 / 5000;
               int var5 = 0;
               if (var3) {
                  OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field4847, var4);
                  var4 += 2;
                  ++var5;
               }

               while(true) {
                  int var10000;
                  if (~var5 <= -65) {
                     var10000 = this.field4838.field11530;
                     if (!var3) {
                        label31: {
                           if (var10000 == 0) {
                              OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                              if (!var3) {
                                 break label31;
                              }
                           }

                           this.field4836 = (float)(super.field6445.field9615 % 4000) / 4000.0F;
                        }

                        this.field4835 = super.field6445.field9615;
                        return;
                     }
                  } else {
                     var10000 = 34336;
                  }

                  OpenGL.glProgramLocalParameter4fvARB(var10000, var5, this.field4847, var4);
                  var4 += 2;
                  ++var5;
               }
            }
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field4848[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method1827(byte arg0) {
      try {
         ++field4831;
         if (arg0 != 77) {
            method2601(18, -13, -68, true, 117, -53, 66, 111, 79, (class482)null, 127);
         }

         if (this.field4833 != null) {
            this.field4833.method5160((byte)-76, '\u0001');
            super.field6445.method4787(arg0 ^ -33, 1);
            super.field6445.method4792(arg0 ^ -26292, (class799)null);
            super.field6445.method4787(arg0 + -167, 0);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4848[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "(I)V"
   )
   private final void method2599(int arg0) {
      try {
         this.field4833 = new class701(super.field6445, 2);
         if (arg0 < 86) {
            this.field4835 = -42;
         }

         ++field4830;
         this.field4833.method5162(0, -6177);
         super.field6445.method4787(-113, 1);
         super.field6445.method4756(-16777216, 111);
         super.field6445.method4803(260, 7681, true);
         super.field6445.method4737(111, 0, 770, 34166);
         super.field6445.method4787(-117, 0);
         OpenGL.glBindProgramARB(34336, this.field4832.field6947);
         OpenGL.glEnable(34336);
         this.field4833.method5163(-3623);
         this.field4833.method5162(1, -6177);
         super.field6445.method4787(-119, 1);
         OpenGL.glMatrixMode(5890);
         OpenGL.glLoadIdentity();
         OpenGL.glMatrixMode(5888);
         super.field6445.method4765(0, (byte)-3);
         super.field6445.method4737(109, 0, 770, 5890);
         super.field6445.method4787(-63, 0);
         OpenGL.glBindProgramARB(34336, 0);
         OpenGL.glDisable(34336);
         OpenGL.glDisable(34820);
         this.field4833.method5163(-3623);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4848[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "d",
      descriptor = "(B)V"
   )
   public static void method2600(byte arg0) {
      try {
         field4845 = null;
         field4842 = null;
         if (arg0 <= 65) {
            field4845 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4848[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method1830(byte arg0) {
      try {
         int var2 = 127 / ((-8 - arg0) / 57);
         ++field4840;
         return true;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4848[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "(IIIZIIIIILfr;I)Z"
   )
   public static final boolean method2601(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class482 arg9, int arg10) {
      boolean var11 = client.field1786;

      try {
         ++field4837;
         byte var14 = 64;
         byte var15 = 64;
         int var16 = -var14 + arg2;
         class589.field8691[var14][var15] = 99;
         int var17 = -var15 + arg7;
         if (!arg3) {
            return true;
         } else {
            class456.field6995[var14][var15] = 0;
            byte var18 = 0;
            int var19 = 0;
            class703.field10469[var18] = arg2;
            byte var10001 = var18;
            int var28 = var18 + 1;
            class524.field7994[var10001] = arg7;
            int[][] var20 = arg9.field7339;
            if (!var11 && ~var28 == ~var19) {
               class76.field982 = arg7;
               class583.field8603 = arg2;
               return false;
            } else {
               int var12;
               int var13;
               label218:
               do {
                  var13 = class524.field7994[var19];
                  var12 = class703.field10469[var19];
                  int var21 = -arg9.field7337 + var13;
                  int var22 = var13 - var17;
                  int var23 = -var16 + var12;
                  int var24 = -arg9.field7329 + var12;
                  var19 = 4095 & var19 + 1;
                  int var25 = arg6;
                  int var10000 = ~arg6;
                  var10001 = 3;

                  do {
                     if (var10000 != var10001) {
                        if (var25 != -3) {
                           if (var25 != -2) {
                              if (~var25 != 0) {
                                 label205: {
                                    if (~var25 != -1 && ~var25 != -2 && ~var25 != -3 && ~var25 != -4) {
                                       if (var25 != 9) {
                                          if (arg9.method3758(arg6, 1, var13, arg4, var12, arg10, false, arg5)) {
                                             class76.field982 = var13;
                                             class583.field8603 = var12;
                                             return true;
                                          }
                                          break label205;
                                       }

                                       if (var11) {
                                          if (~arg5 == ~var12 && ~arg4 == ~var13) {
                                             class76.field982 = var13;
                                             class583.field8603 = var12;
                                             return true;
                                          }
                                          break label205;
                                       }
                                    }

                                    if (arg9.method3752(arg6, var12, var13, arg4, arg5, -1, 1, arg10)) {
                                       class76.field982 = var13;
                                       class583.field8603 = var12;
                                       return true;
                                    }
                                 }
                              } else if (arg9.method3755(var12, arg8, arg0, var13, arg4, 1, arg1, arg5, 0)) {
                                 class76.field982 = var13;
                                 class583.field8603 = var12;
                                 return true;
                              }
                           } else if (arg9.method3743(arg0, -82, arg1, var12, arg8, 1, var13, arg4, 1, arg5)) {
                              class76.field982 = var13;
                              class583.field8603 = var12;
                              return true;
                           }
                        } else if (class56.method414(arg5, false, var12, arg0, arg4, arg1, var13, 1, 1)) {
                           class76.field982 = var13;
                           class583.field8603 = var12;
                           return true;
                        }
                     } else if (~arg5 == ~var12 && ~arg4 == ~var13) {
                        class76.field982 = var13;
                        class583.field8603 = var12;
                        return true;
                     }

                     var25 = class456.field6995[var23][var22] - -1;
                     if (~var23 < -1 && class589.field8691[var23 - 1][var22] == 0 && ~(var20[var24 + -1][var21] & 1109655552) == -1) {
                        class703.field10469[var28] = var12 + -1;
                        class524.field7994[var28] = var13;
                        class589.field8691[var23 + -1][var22] = 2;
                        var28 = 4095 & var28 - -1;
                        class456.field6995[var23 + -1][var22] = var25;
                     }

                     if (var23 < 127 && class589.field8691[var23 + 1][var22] == 0 && (1612972032 & var20[var24 - -1][var21]) == 0) {
                        class703.field10469[var28] = var12 + 1;
                        class524.field7994[var28] = var13;
                        var28 = 4095 & var28 + 1;
                        class589.field8691[var23 - -1][var22] = 8;
                        class456.field6995[var23 + 1][var22] = var25;
                     }

                     if (var22 > 0 && class589.field8691[var23][var22 + -1] == 0 && (var20[var24][var21 + -1] & 1084489728) == 0) {
                        class703.field10469[var28] = var12;
                        class524.field7994[var28] = var13 + -1;
                        var28 = 4095 & var28 + 1;
                        class589.field8691[var23][var22 + -1] = 1;
                        class456.field6995[var23][var22 + -1] = var25;
                     }

                     if (~var22 > -128 && ~class589.field8691[var23][var22 + 1] == -1 && ~(1210318848 & var20[var24][var21 + 1]) == -1) {
                        class703.field10469[var28] = var12;
                        class524.field7994[var28] = var13 + 1;
                        var28 = 4095 & var28 + 1;
                        class589.field8691[var23][var22 + 1] = 4;
                        class456.field6995[var23][var22 + 1] = var25;
                     }

                     if (var23 > 0 && var22 > 0 && class589.field8691[var23 + -1][var22 + -1] == 0 && ~(1134821376 & var20[var24 + -1][var21 - 1]) == -1 && ~(var20[var24 - 1][var21] & 1109655552) == -1 && (var20[var24][var21 + -1] & 1084489728) == 0) {
                        class703.field10469[var28] = var12 - 1;
                        class524.field7994[var28] = var13 + -1;
                        class589.field8691[var23 - 1][var22 + -1] = 3;
                        var28 = var28 - -1 & 4095;
                        class456.field6995[var23 + -1][var22 + -1] = var25;
                     }

                     if (~var23 > -128 && ~var22 < -1 && ~class589.field8691[var23 + 1][var22 - 1] == -1 && ~(var20[var24 + 1][var21 - 1] & 1625554944) == -1 && ~(1612972032 & var20[var24 + 1][var21]) == -1 && ~(var20[var24][var21 + -1] & 1084489728) == -1) {
                        class703.field10469[var28] = var12 + 1;
                        class524.field7994[var28] = var13 - 1;
                        class589.field8691[var23 + 1][var22 + -1] = 9;
                        var28 = 4095 & var28 + 1;
                        class456.field6995[var23 + 1][var22 + -1] = var25;
                     }

                     if (var23 > 0 && var22 < 127 && class589.field8691[var23 + -1][var22 + 1] == 0 && (var20[var24 - 1][var21 + 1] & 1310982144) == 0 && (1109655552 & var20[var24 + -1][var21]) == 0 && ~(var20[var24][var21 - -1] & 1210318848) == -1) {
                        class703.field10469[var28] = var12 + -1;
                        class524.field7994[var28] = var13 + 1;
                        class589.field8691[var23 + -1][var22 + 1] = 6;
                        var28 = var28 + 1 & 4095;
                        class456.field6995[var23 + -1][var22 - -1] = var25;
                     }

                     if (var23 >= 127) {
                        continue label218;
                     }

                     var10000 = var22;
                     var10001 = 127;
                  } while(var11);

                  if (var22 < 127 && class589.field8691[var23 + 1][var22 - -1] == 0 && ~(var20[var24 + 1][var21 + 1] & 2015625216) == -1 && (var20[var24 + 1][var21] & 1612972032) == 0 && ~(var20[var24][var21 + 1] & 1210318848) == -1) {
                     class703.field10469[var28] = var12 + 1;
                     class524.field7994[var28] = var13 + 1;
                     class589.field8691[var23 + 1][var22 + 1] = 12;
                     var28 = 4095 & var28 + 1;
                     class456.field6995[var23 + 1][var22 - -1] = var25;
                  }
               } while(~var28 != ~var19);

               class76.field982 = var13;
               class583.field8603 = var12;
               return false;
            }
         }
      } catch (RuntimeException var27) {
         throw class482.method3757(var27, field4848[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field4848[1] : field4848[2]) + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "(Lvda;IB)V"
   )
   public final void method1826(class799 arg0, int arg1, byte arg2) {
      try {
         if (arg2 < -29) {
            ++field4846;
            super.field6445.method4792(-26367, arg0);
            super.field6445.method4765(arg1, (byte)-3);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4848[8] + (arg0 != null ? field4848[1] : field4848[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1833(int arg0, int arg1, int arg2) {
      boolean var4 = client.field1786;

      try {
         ++field4834;
         if (this.field4833 != null) {
            label63: {
               super.field6445.method4787(-43, 1);
               if (~(128 & arg2) == -1) {
                  if (~(1 & arg0) == -2) {
                     if (!this.field4838.field11530) {
                        int var5 = super.field6445.field9615 % 4000 * 16 / 4000;
                        super.field6445.method4792(-26367, this.field4838.field11527[var5]);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                        if (!var4) {
                           break label63;
                        }
                     }

                     super.field6445.method4792(-26367, this.field4838.field11533);
                     OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field4836, 0.0F, 0.0F, 1.0F);
                     if (!var4) {
                        break label63;
                     }
                  }

                  label59: {
                     if (this.field4838.field11530) {
                        super.field6445.method4792(-26367, this.field4838.field11533);
                        if (!var4) {
                           break label59;
                        }
                     }

                     super.field6445.method4792(-26367, this.field4838.field11527[0]);
                  }

                  OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                  if (!var4) {
                     break label63;
                  }
               }

               super.field6445.method4792(-26367, (class799)null);
            }

            label47: {
               super.field6445.method4787(-45, 0);
               if (~(64 & arg2) == -1) {
                  class767.field11324[2] = super.field6445.field9762 * super.field6445.field9725;
                  class767.field11324[1] = super.field6445.field9725 * super.field6445.field9703;
                  class767.field11324[0] = super.field6445.field9734 * super.field6445.field9725;
                  OpenGL.glProgramLocalParameter4fvARB(34336, 66, class767.field11324, 0);
                  if (!var4) {
                     break label47;
                  }
               }

               OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            if (arg1 <= -90) {
               int var6 = 3 & arg2;
               if (~var6 == -3) {
                  OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
               } else if (var6 == 3) {
                  OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
               } else {
                  OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field4848[13] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method1828(boolean arg0, boolean arg1) {
      try {
         if (!arg0) {
            ++field4841;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4848[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2602(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2603(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 67;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 95;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
