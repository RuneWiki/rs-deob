import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class728 extends class316 {
   @OriginalMember(
      owner = "client!gn",
      name = "j",
      descriptor = "Ltaa;"
   )
   private class426 field10475;
   @OriginalMember(
      owner = "client!gn",
      name = "d",
      descriptor = "Lvi;"
   )
   private class563 field10474;
   @OriginalMember(
      owner = "client!gn",
      name = "l",
      descriptor = "[F"
   )
   private float[] field10481;
   @OriginalMember(
      owner = "client!gn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10489 = new String[]{method5263(method5262("\u0015x\u0018\u000fp")), method5263(method5262("S7w\u001c\u001a\u0004f\u0007`hxYf\u001a\u0011=X\u0016n\u0019 Ti>7\u0001\u007fB'7\u001cI_ .\u0013d_/6\u0006-<\u000f\f&D\u007f\fxR\u007ff!+R6\u0016nxR6\u0016neR`S<,\u0017n\u0018>7\u0001\u007fB'7\u001c-<\u000f\f&D\u007f\fxR\u007fu!4\u001dcDnxR6\u0016neR`S<,\u0017n\u0018-7\u001eyDuR3Bb\u001c\u001106\u0016'\f\u0017nu!7\u0000r\u0016nxR+\u00168=\u0000bS6v\u0006sN-7\u001ddR\u0015h/-<\u0001\r&Fc\u001axRyu!4\u001dcDnxR6\u0016neRdS=-\u001eb\u0018-7\u001eyDuR=Cb\u001e\r&6\u0016!\f\u0017nu!7\u0000r\u0006nxR+\u0016<=\u0001cZ:v\u0006sN-7\u001ddR\u0015h/-<\u0001\r&Fc\u001axRyb+ 1yY<<C6\u0016neRdS=-\u001eb\u0018:=\nuY!*\u0016M\u0007\u0013cxYc\u001a\b'B\u0016n74yQ\r7\u001ddRnxR6\u000bn*\u0017eC\",\\pY);\u001dyD*cxFw\u001c\u0019?6\u0016n,\u001b{SnxR6\u0016nxR6\u000bn(\u0000yQ<9\u001f8Z!;\u0013zmxm/-<\u001e\u0019 W{nxRbC<:\u0007zS ;\u00176\u0016neRfD!?\u0000w[`4\u001duW\"\u0003D\"kuR\"Wd\u000f\u0015R6\u0016\"1\u0015~B\u000f5\u0010\u007fS ,R+\u0016>*\u001dqD/5\\zY-9\u001eM\u0000x\u0005I6<\u001e\u0019 W{nxRf{/,\u0000\u007fN\u0015l/6\u0016neRm\u0016=,\u0013bS`5\u0013bD' \\fD!2\u0017uB'7\u001c6KuR\"Wd\u000f\u0015R6\u0016#.?wB<1\nM\u0002\u0013xR+\u00165x\u0001bW:=\\{W:*\u001bn\u0018#7\u0016sZ81\u0017a\u00163cxFw\u001c\u0019?6\u0016n1\u0004[W:*\u001bnmz\u0005R6\u000bn#ReB/,\u00178[/,\u0000\u007fN`,\u0017nB;*\u0017M\u0007\u0013x\u000f-<\u001e\u0019 W{nxRbS6\u0015\u0013bD' )\"knxO6Mn+\u0006wB+v\u001fwB<1\n8B+ \u0006cD+\u0003BK\u00163cxFw\u001c\u0019?6\u0016n><y_==) \u0002\u0013xR6\u000bn#RfD!?\u0000w[`4\u001duW\"\u0003B8\u0018xk/6KuR&S{\u001exR6\u0016 7\u001beSbx\u0004\u007fS9\b\u001de\u001an/\u001ddZ*\b\u001de\u001an,\u0017nu!7\u0000r\rD\u00196Rd\u000b\u000b!6X!1\u0001sw*<\u0000-<\n\bF6\u0016n.\u001bsA\u001e7\u00018Nbx\u001f`{/,\u0000\u007fN\u0015h/:\u0016'\b\u001de\rD\u001c\"\"\u0016nx\u0004\u007fS9\b\u001de\u00187tR{@\u00039\u0006d_6\u0003CK\u001an1\"yEuR6F\u0002nxR`_+/\"yE`\"^6[8\u0015\u0013bD' )$kbx\u001bFY=cxRfzxR6@'=\u0005FY=v\u0005:\u0016#.?wB<1\nM\u0005\u0013tR\u007ff!+I\u001c{\u0001\u000eR6\u0016!\u001e\u001dqu!7\u0000r\u00186tR;@'=\u0005FY=v\b-<\n\bF6\u0016n/\u001ddZ*\b\u001de\u00186tR\u007f@\u00039\u0006d_6\u0003BK\u001an.\u001bsA\u001e7\u0001-<\n\bF6\u0016n/\u001ddZ*\b\u001de\u00187tR\u007f@\u00039\u0006d_6\u0003CK\u001an.\u001bsA\u001e7\u0001-<\n\bF6\u0016n/\u001ddZ*\b\u001de\u00184tR\u007f@\u00039\u0006d_6\u0003@K\u001an.\u001bsA\u001e7\u0001-<\n\bF6\u0016n/\u001ddZ*\b\u001de\u00189tR\u007f@\u00039\u0006d_6\u0003AK\u001an.\u001bsA\u001e7\u0001-<\u000f\u001c66\u0016n6\u001d\u007fE+v\n:\u001697\u0000zR\u001e7\u00018Nbx\u0005yD\"<\"yE`\"IEc\fxR6X!1\u0001s\u00187tRaY<4\u0016FY=v\b:\u001697\u0000zR\u001e7\u00018Nu\u0015'Z\u0016nx\u001cy_==^6X!1\u0001s\u001anh\\&\u0006~i@$\u0006yhA'\u0004{cxPd\rxR6X!1\u0001s\u001an6\u001d\u007fE+cx[c\u0002xR6X!1\u0001s\u001an6\u001d\u007fE+tR \u0002uR3DznxRxY'+\u0017WR**\\n\u001an6\u001d\u007fE+v\n-<\u0003\u0017$6\u0016n6\u001d\u007fE+v\n:\u0016(\u0016\u001d\u007fE+\u0003\u001cy_==3rR<v\nK\u00186cxWd\u0002xR6X!1\u0001sw*<\u00008Nbx\u001cy_==\\o\rD\u0015=@\u0016nx\u001cy_==\\o\u001an><y_==)xY'+\u0017WR**\\nk`!I\u001c{\u001b\u0014R6\u0016 7\u001beSbx\u001cy_==^6B;*\u0010cZ+6\u0011s\u00186cxRfzxR6B+ 1yY<<\\n\u001an,\u0017n{/,\u0000\u007fN\u0015h/:\u0016'\f\u0017nu!7\u0000r\rD\u001c\"\"\u0016nx\u0006sN\r7\u001ddR`!^6B+ ?wB<1\nM\u0007\u0013tR\u007fb+ 1yY<<I\u001cw\n\u001cR6\u0016!\f\u0017nu!7\u0000r\u0006` \u000b:\u0016:=\nUY!*\u0016:\u0016 7\u001beSuR?Y`nxRyb+ 1yY<<B8LbxB-<\u0003\u0017$6\u0016n7&sN\r7\u001ddR~v\u0005:\u0016\u007fcx[c\u0002xR6Y\u001a=\nUY!*\u0016'\u00186!^6B+ 1yY<<^6\u0006`i@#\rD\u0015=@\u0016nx\u001dBS6\u001b\u001dyD*i\\lAbx\u0006\u007f[+v\nnN9cx[c\u0002xR6Y\r7\u001eyC<v\noLbx\u001bUY\"7\u0007d\u001an4\u001bq^:\u0019\u001ft_+6\u0006-<\u0003\u0017$6\u0016n71yZ!-\u00008Abx\u001bUY\"7\u0007d\u00189cxSx\n")), method5263(method5262("\u001ccZ\"")), method5263(method5262("\u0015x\u0018r1\u001c\u007fBpp")), method5263(method5262("\t8\u0018`%")), method5263(method5262("\u0015x\u0018\u0007p")), method5263(method5262("\u0015x\u0018\u0006p")), method5263(method5262("\u0015x\u0018\tp")), method5263(method5262("\u0015x\u0018\np")), method5263(method5262("\u0015x\u0018\u000bp")), method5263(method5262("\u0015x\u0018\bp")), method5263(method5262("\u0015x\u0018\fp")), method5263(method5262("\u0015x\u0018\rp")), method5263(method5262("\u0015x\u0018\u0005p"))};
   @OriginalMember(
      owner = "client!gn",
      name = "u",
      descriptor = "[I"
   )
   public static int[] field10471 = new int[1];
   @OriginalMember(
      owner = "client!gn",
      name = "p",
      descriptor = "F"
   )
   private float field10478;
   @OriginalMember(
      owner = "client!gn",
      name = "s",
      descriptor = "F"
   )
   public static float field10484;
   @OriginalMember(
      owner = "client!gn",
      name = "q",
      descriptor = "I"
   )
   public static int field10469;
   @OriginalMember(
      owner = "client!gn",
      name = "n",
      descriptor = "I"
   )
   public static int field10470;
   @OriginalMember(
      owner = "client!gn",
      name = "g",
      descriptor = "I"
   )
   public static int field10472;
   @OriginalMember(
      owner = "client!gn",
      name = "i",
      descriptor = "I"
   )
   public static int field10473;
   @OriginalMember(
      owner = "client!gn",
      name = "t",
      descriptor = "I"
   )
   public static int field10476;
   @OriginalMember(
      owner = "client!gn",
      name = "e",
      descriptor = "I"
   )
   public static int field10477;
   @OriginalMember(
      owner = "client!gn",
      name = "r",
      descriptor = "I"
   )
   public static int field10479;
   @OriginalMember(
      owner = "client!gn",
      name = "c",
      descriptor = "I"
   )
   public static int field10480;
   @OriginalMember(
      owner = "client!gn",
      name = "h",
      descriptor = "I"
   )
   private int field10482;
   @OriginalMember(
      owner = "client!gn",
      name = "o",
      descriptor = "I"
   )
   public static int field10485;
   @OriginalMember(
      owner = "client!gn",
      name = "f",
      descriptor = "I"
   )
   public static int field10487;
   @OriginalMember(
      owner = "client!gn",
      name = "k",
      descriptor = "I"
   )
   public static int field10488;
   @OriginalMember(
      owner = "client!gn",
      name = "m",
      descriptor = "Lha;"
   )
   public static class65 field10486;
   @OriginalMember(
      owner = "client!gn",
      name = "v",
      descriptor = "Llt;"
   )
   private class702 field10483;

   @OriginalMember(
      owner = "client!gn",
      name = "a",
      descriptor = "(IILufa;)V"
   )
   public final void method804(int arg0, int arg1, class707 arg2) {
      try {
         ++field10477;
         super.field4567.method252(arg2, (byte)-18);
         super.field4567.method322(-37, arg1);
         if (arg0 != 0) {
            this.method806((byte)-14, false);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10489[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10489[4] : field10489[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method805(int arg0) {
      try {
         ++field10487;
         int var2 = -7 % ((arg0 - -18) / 63);
         if (this.field10483 != null) {
            this.field10483.method5117('\u0001', 5);
            super.field4567.method259(32, 1);
            super.field4567.method252((class707)null, (byte)-125);
            super.field4567.method259(32, 0);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10489[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method5258(int arg0) {
      try {
         if (arg0 == 2) {
            field10471 = null;
            field10486 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10489[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method5259(int arg0) {
      try {
         class302.field4214 = -1;
         class88.field1436 = null;
         ++field10476;
         class718.field10369 = null;
         int var1 = -24 % ((arg0 - -24) / 58);
         class768.field11174 = -1;
         class74.field1314 = null;
         class75.field1330 = null;
         class528.field7696 = -1;
         class402.field5939 = -1;
         class56.field1115 = null;
         class393.field5787 = null;
         class80.field1360 = null;
         class664.field9657.method1647(0);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10489[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "a",
      descriptor = "(IIIFILiha;FFFFI)[B"
   )
   public static final byte[] method5260(int arg0, int arg1, int arg2, float arg3, int arg4, class32 arg5, float arg6, float arg7, float arg8, float arg9, int arg10) {
      try {
         ++field10485;
         byte[] var11 = new byte[arg1 * arg4 * arg2];
         int var12 = 96 % ((arg10 - -59) / 42);
         class253.method2041(arg3, arg0, arg6, arg2, arg4, var11, arg1, arg8, arg7, arg9, -1814, arg5, 0);
         return var11;
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field10489[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field10489[4] : field10489[2]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method807(int arg0) {
      try {
         ++field10469;
         if (arg0 != -18913) {
            field10473 = -67;
         }

         return true;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10489[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "a",
      descriptor = "(B)V"
   )
   private final void method5261(byte arg0) {
      try {
         this.field10483 = new class702(super.field4567, 2);
         ++field10480;
         this.field10483.method5116((byte)111, 0);
         super.field4567.method259(32, 1);
         super.field4567.method284(-31405, -16777216);
         super.field4567.method314(260, 117, 7681);
         super.field4567.method387(0, arg0 + 34178, 34166, 770);
         super.field4567.method259(32, 0);
         if (arg0 != 6) {
            this.field10483 = null;
         }

         OpenGL.glBindProgramARB(34336, this.field10474.field8186);
         OpenGL.glEnable(34336);
         this.field10483.method5115((byte)-126);
         this.field10483.method5116((byte)111, 1);
         super.field4567.method259(32, 1);
         OpenGL.glMatrixMode(5890);
         OpenGL.glLoadIdentity();
         OpenGL.glMatrixMode(5888);
         super.field4567.method322(-99, 0);
         super.field4567.method387(0, 34184, 5890, 770);
         super.field4567.method259(32, 0);
         OpenGL.glBindProgramARB(34336, 0);
         OpenGL.glDisable(34336);
         OpenGL.glDisable(34820);
         this.field10483.method5115((byte)-60);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10489[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "a",
      descriptor = "(BZ)V"
   )
   public final void method806(byte arg0, boolean arg1) {
      boolean var3 = client.field4564;

      try {
         ++field10479;
         if (this.field10483 != null) {
            this.field10483.method5117('\u0000', 5);
            super.field4567.method259(32, 1);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field4567.field761.method4160(0), 0);
            OpenGL.glMatrixMode(5888);
            super.field4567.method259(32, 0);
            int var4 = -65 % ((-44 - arg0) / 38);
            if (super.field4567.field728 != this.field10482) {
               int var5 = super.field4567.field728 % 5000 * 128 / 5000;
               int var6 = 0;
               if (var3) {
                  OpenGL.glProgramLocalParameter4fvARB(34336, var6, this.field10481, var5);
                  var5 += 2;
                  ++var6;
               }

               while(true) {
                  int var10000;
                  if (~var6 <= -65) {
                     var10000 = this.field10475.field6173;
                     if (!var3) {
                        label28: {
                           if (var10000 == 0) {
                              OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                              if (!var3) {
                                 break label28;
                              }
                           }

                           this.field10478 = (float)(super.field4567.field728 % 4000) / 4000.0F;
                        }

                        this.field10482 = super.field4567.field728;
                        return;
                     }
                  } else {
                     var10000 = 34336;
                  }

                  OpenGL.glProgramLocalParameter4fvARB(var10000, var6, this.field10481, var5);
                  var5 += 2;
                  ++var6;
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field10489[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "<init>",
      descriptor = "(Lrk;Ltaa;)V"
   )
   public class728(class35 arg0, class426 arg1) {
      boolean var3 = client.field4564;
      super(arg0);

      try {
         this.field10475 = arg1;
         if (super.field4567.field840 && ~super.field4567.field808 <= -3) {
            this.field10474 = class345.method2669(field10489[1], -8812, 34336, super.field4567);
            if (this.field10474 != null) {
               int[][] var4 = class441.method3320(64, 256, 4, 4, 0.4F, 0, false, 3, -125);
               int[][] var5 = class441.method3320(64, 256, 4, 4, 0.4F, 8, false, 3, -89);
               int var6 = 0;
               this.field10481 = new float[32768];
               int var7 = 0;
               if (!var3 && var7 >= 256) {
                  this.method5261((byte)6);
               } else {
                  do {
                     int[] var8 = var4[var7];
                     int[] var9 = var5[var7];
                     int var10 = 0;
                     if (var3) {
                        this.field10481[var6++] = (float)var8[var10] / 4096.0F;
                        this.field10481[var6++] = (float)var9[var10] / 4096.0F;
                        ++var10;
                     }

                     while(true) {
                        while(~var10 > -65) {
                           this.field10481[var6++] = (float)var8[var10] / 4096.0F;
                           this.field10481[var6++] = (float)var9[var10] / 4096.0F;
                           ++var10;
                        }

                        if (!var3) {
                           ++var7;
                           break;
                        }

                        ++var10;
                     }
                  } while(var7 < 256);

                  this.method5261((byte)6);
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field10489[3] + (arg0 != null ? field10489[4] : field10489[2]) + ',' + (arg1 != null ? field10489[4] : field10489[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method810(int arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         ++field10488;
         if (this.field10483 != null) {
            label68: {
               super.field4567.method259(32, 1);
               if (~(128 & arg0) != -1) {
                  super.field4567.method252((class707)null, (byte)-107);
                  if (!var4) {
                     break label68;
                  }
               }

               if ((arg1 & 1) == 1) {
                  if (this.field10475.field6173) {
                     super.field4567.method252(this.field10475.field6178, (byte)-125);
                     OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field10478, 0.0F, 0.0F, 1.0F);
                     if (!var4) {
                        break label68;
                     }
                  }

                  int var5 = super.field4567.field728 % 4000 * 16 / 4000;
                  super.field4567.method252(this.field10475.field6174[var5], (byte)-95);
                  OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                  if (!var4) {
                     break label68;
                  }
               }

               label50: {
                  if (this.field10475.field6173) {
                     super.field4567.method252(this.field10475.field6178, (byte)-31);
                     if (!var4) {
                        break label50;
                     }
                  }

                  super.field4567.method252(this.field10475.field6174[0], (byte)-23);
               }

               OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }

            label45: {
               super.field4567.method259(32, arg2);
               if (~(arg0 & 64) == -1) {
                  class558.field8104[1] = super.field4567.field862 * super.field4567.field780;
                  class558.field8104[0] = super.field4567.field862 * super.field4567.field858;
                  class558.field8104[2] = super.field4567.field862 * super.field4567.field856;
                  OpenGL.glProgramLocalParameter4fvARB(34336, 66, class558.field8104, 0);
                  if (!var4) {
                     break label45;
                  }
               }

               OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            int var6 = arg0 & 3;
            if (~var6 != -3) {
               if (~var6 == -4) {
                  OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
               } else {
                  OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
               }
            } else {
               OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            }
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field10489[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "b",
      descriptor = "(BZ)V"
   )
   public final void method811(byte arg0, boolean arg1) {
      try {
         if (arg0 != 51) {
            this.method804(117, -118, (class707)null);
         }

         ++field10470;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10489[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5262(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5263(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 114;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 78;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
