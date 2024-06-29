import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class182 extends class125 {
   @OriginalMember(
      owner = "client!rc",
      name = "j",
      descriptor = "Luda;"
   )
   private class56 field2306;
   @OriginalMember(
      owner = "client!rc",
      name = "p",
      descriptor = "Ldu;"
   )
   private class429 field2315;
   @OriginalMember(
      owner = "client!rc",
      name = "s",
      descriptor = "[F"
   )
   private float[] field2304;
   @OriginalMember(
      owner = "client!rc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2317 = new String[]{method1533(method1532("\u0018{f0u")), method1533(method1532("\u0018{f2u")), method1533(method1532("\u0018{f8u")), method1533(method1532("\u0018{f=u")), method1533(method1532("\u0018{f<u")), method1533(method1532("\u0018{f>u")), method1533(method1532("\u0004m$\u0016")), method1533(method1532("\u00116fT ")), method1533(method1532("\u0018{f3u")), method1533(method1532("\u0018{f;u")), method1533(method1532("K9\t(\u001f\u001chyTm`W\u0018.\u0014%VhZ\u001c8Z\u0017\n2\u0019q<\u00132\u0004G!\u0014+\u000bj!\u001b3\u001e#B;\t>J\u00018}Jq\u0018\u0015.J8hZ}J8hZ`Jn-\b)\u000f`f\n2\u0019q<\u00132\u0004#B;\t>J\u00018}Jq\u000b\u00151\u0005m:Z}J8hZ`Jn-\b)\u000f`f\u00192\u0006w:AW+L\u001c(\u0014(8h\u0013\t\u000f`\u000b\u00152\u0018|hZ}J%h\f8\u0018l-\u0002s\u001e}0\u00192\u0005j,!m7#B5\b>H\u001d.}Jw\u000b\u00151\u0005m:Z}J8hZ`Jj-\t(\u0006lf\u00192\u0006w:AW%M\u001c*\b>8h\u0015\t\u000f`\u000b\u00152\u0018|xZ}J%h\b8\u0019m$\u000es\u001e}0\u00192\u0005j,!m7#B5\b>H\u001d.}Jw\u001c\u001f%)w'\b9[8hZ`Jj-\t(\u0006lf\u000e8\u0012{'\u0015/\u000eCy'f`W\u001d.\r?LhZ2,w/92\u0005j,Z}J8uZ/\u000fk=\u0016)D~'\u001d>\u0005w:\u001ef`H\t(\u001c'8hZ)\u0003u-Z}J8hZ}J8uZ-\u0018w/\b<\u00076$\u0015>\u000bt\u0013Lh7#B*\u001c8Y\u0005Z}Jl=\b?\u001ft-\u0014>\u000f8hZ`Jh:\u0015:\u0018y%T1\u0005{)\u0016\u0006\\,\u0015AW:Y\u001a;\u0010J8h\u00164\rp<;0\bq-\u0014)J%h\n/\u0005\u007f:\u001b0Dt'\u0019<\u0006C~L\u0000Q8B*\u001c8Y\u0005Z}Jh\u0005\u001b)\u0018q0!i78hZ`Jch\t)\u000bl-T0\u000bl:\u0013%Dh:\u00157\u000f{<\u00132\u000485AW:Y\u001a;\u0010J8h\u0017+'y<\b4\u0012C|'}J%h\u0001}\u0019l)\u000e8Du)\u000e/\u0003`f\u00172\u000e}$\f4\u000foh\u0007f`H\t(\u001c'8hZ4\u001cU)\u000e/\u0003`\u0013N\u0000J8uZ&Jk<\u001b)\u000f6%\u001b)\u0018q0T)\u000f`<\u000f/\u000fCy'}\u0017#B*\u001c8Y\u0005Z}Jl-\u0002\u0010\u000bl:\u0013%1,\u0015Z}W83Z.\u001ey<\u001fs\u0007y<\b4\u00126<\u001f%\u001em:\u001f\u0006ZEh\u0007f`H\t(\u001c'8hZ;$w!\t81.|'}J8uZ&Jh:\u0015:\u0018y%T1\u0005{)\u0016\u0006Z6fLn785AW>]\u0005*}J8h\u00142\u0003k-V}\u001cq-\r\r\u0005kdZ*\u0005j$\u001e\r\u0005kdZ)\u000f`\u000b\u00152\u0018|sp\u001c.\\\u001a?\u000e98&\u00154\u0019}\t\u001e9\u0018#B>\r^8hZ+\u0003}?*2\u001960V}\u0007n\u0005\u001b)\u0018q0!m74h\u0013\r\u0005ksp\u0019:,hZ}\u001cq-\r\r\u0005kf\u0003qJu>7<\u001ej!\u0002\u0006[EdZ4:w;AW.H|Z}Jn!\u001f*:w;T'F8%\f\u0010\u000bl:\u0013%1*\u0015V}\u0003H'\tf`\\\u0018N}J8>\u00138\u001dH'\ts\u001d4h\u0017+'y<\b4\u0012C{'qJq\u0018\u0015.Q\u0012\u00055\u000bJ8h\u0015\u001b\u0005\u007f\u000b\u00152\u0018|f\u0002qJ5>\u00138\u001dH'\ts\u0010#B>\r^8hZ*\u0005j$\u001e\r\u0005kf\u0002qJq>7<\u001ej!\u0002\u0006ZEdZ+\u0003}?*2\u0019#B>\r^8hZ*\u0005j$\u001e\r\u0005kf\u0003qJq>7<\u001ej!\u0002\u0006[EdZ+\u0003}?*2\u0019#B>\r^8hZ*\u0005j$\u001e\r\u0005kf\u0000qJq>7<\u001ej!\u0002\u0006XEdZ+\u0003}?*2\u0019#B>\r^8hZ*\u0005j$\u001e\r\u0005kf\rqJq>7<\u001ej!\u0002\u0006YEdZ+\u0003}?*2\u0019#B;\u0019.8hZ3\u0005q;\u001fs\u00124h\r2\u0018t,*2\u001960V}\u001dw:\u00169:w;T'QK\u001d8}J8&\u00154\u0019}f\u0003qJo'\b1\u000eH'\ts\u00104h\r2\u0018t,*2\u001960A\u0010?ThZ}\u0004w!\t8F8&\u00154\u0019}dZmD(xJlX*xMmY)zOf`^\u001a9}J8&\u00154\u0019}dZ3\u0005q;\u001ff`U\u001d6}J8&\u00154\u0019}dZ3\u0005q;\u001fqJ.|AW+J\u0004Z}Jv'\u0013.\u000fY,\u001e/D`dZ3\u0005q;\u001fs\u0012#B7\u0012<8hZ3\u0005q;\u001fs\u00124h\u001c\u0013\u0005q;\u001f\u0006\u0004w!\t8+|,\bs\u0012Ef\u0002f`Y\u001a6}J8&\u00154\u0019}\t\u001e9\u001860V}\u0004w!\t8Dasp\u0010%NhZ}\u0004w!\t8DadZ;$w!\t81v'\u0013.\u000fY,\u001e/D`\u0015T$Q\u0012\u0005/\u0011J8h\u00142\u0003k-V}\u0004w!\t8F8<\u000f/\bm$\u001f3\t}f\u0002f`\\\u0018N}J8<\u001f%)w'\b9D`dZ)\u000f`\u0005\u001b)\u0018q0!m74h\u0013\t\u000f`\u000b\u00152\u0018|sp\u0019:,hZ}\u001e}092\u0005j,T$F8<\u001f%'y<\b4\u0012Cy'qJq\u001c\u001f%)w'\b9Q\u0012\t>\u0019J8h\u0015\t\u000f`\u000b\u00152\u0018|xT%\u00134h\u000e8\u0012['\u0015/\u000e4h\u00142\u0003k-AW'W\u001eZ}Jw\u001c\u001f%)w'\b9Z62V}Z#B7\u0012<8hZ2>}092\u0005j,Js\u001d4hKf`U\u001d6}J8'.8\u0012['\u0015/\u000e)f\u0002$F8<\u001f%)w'\b9F8xTlX-sp\u0010%NhZ}\u0005L-\u0002\u001e\u0005w:\u001elDb?V}\u001eq%\u001fs\u0012`0\rf`U\u001d6}J8'92\u0006w=\bs\u0012a2V}\u0003['\u00162\u001fjdZ1\u0003\u007f \u000e\u001c\u0007z!\u001f3\u001e#B7\u0012<8hZ2)w$\u0015(\u00186?V}\u0003['\u00162\u001fjf\rf`]\u0006>")), method1533(method1532("\u0018{fF4\u0004q<Du")), method1533(method1532("\u0018{f?u")), method1533(method1532("\u0018{f9u"))};
   @OriginalMember(
      owner = "client!rc",
      name = "v",
      descriptor = "[[B"
   )
   public static byte[][] field2313 = new byte[250][];
   @OriginalMember(
      owner = "client!rc",
      name = "t",
      descriptor = "Lse;"
   )
   public static class6 field2316 = new class6(85, 2);
   @OriginalMember(
      owner = "client!rc",
      name = "f",
      descriptor = "F"
   )
   private float field2309;
   @OriginalMember(
      owner = "client!rc",
      name = "u",
      descriptor = "I"
   )
   public static int field2300;
   @OriginalMember(
      owner = "client!rc",
      name = "n",
      descriptor = "I"
   )
   public static int field2302;
   @OriginalMember(
      owner = "client!rc",
      name = "r",
      descriptor = "I"
   )
   public static int field2303;
   @OriginalMember(
      owner = "client!rc",
      name = "q",
      descriptor = "I"
   )
   public static int field2305;
   @OriginalMember(
      owner = "client!rc",
      name = "l",
      descriptor = "I"
   )
   public static int field2307;
   @OriginalMember(
      owner = "client!rc",
      name = "o",
      descriptor = "I"
   )
   public static int field2308;
   @OriginalMember(
      owner = "client!rc",
      name = "k",
      descriptor = "I"
   )
   public static int field2310;
   @OriginalMember(
      owner = "client!rc",
      name = "i",
      descriptor = "I"
   )
   public static int field2311;
   @OriginalMember(
      owner = "client!rc",
      name = "g",
      descriptor = "I"
   )
   public static int field2312;
   @OriginalMember(
      owner = "client!rc",
      name = "m",
      descriptor = "I"
   )
   private int field2314;
   @OriginalMember(
      owner = "client!rc",
      name = "h",
      descriptor = "Ljea;"
   )
   private class249 field2301;

   @OriginalMember(
      owner = "client!rc",
      name = "a",
      descriptor = "(Lll;II)V"
   )
   public final void method345(class549 arg0, int arg1, int arg2) {
      try {
         super.field1630.method4006(arg0, (byte)-127);
         ++field2312;
         super.field1630.method4009(arg2, arg1 ^ -23386);
         if (arg1 != -23385) {
            this.field2309 = 2.1943097F;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field2317[5] + (arg0 != null ? field2317[7] : field2317[6]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method346(boolean arg0, boolean arg1) {
      try {
         if (!arg0) {
            method1530(16, false, -9);
         }

         ++field2311;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2317[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method341(int arg0, int arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         ++field2307;
         if (this.field2301 != null) {
            label80: {
               super.field1630.method3988(-128, 1);
               if (~(arg2 & 128) != -1) {
                  super.field1630.method4006((class549)null, (byte)21);
                  if (!var4) {
                     break label80;
                  }
               }

               if (~(arg1 & 1) == -2) {
                  if (!this.field2306.field752) {
                     int var5 = super.field1630.field7640 % 4000 * 16 / 4000;
                     super.field1630.method4006(this.field2306.field751[var5], (byte)30);
                     OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                     if (!var4) {
                        break label80;
                     }
                  }

                  super.field1630.method4006(this.field2306.field748, (byte)-43);
                  OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field2309, 0.0F, 0.0F, 1.0F);
                  if (!var4) {
                     break label80;
                  }
               }

               label62: {
                  if (!this.field2306.field752) {
                     super.field1630.method4006(this.field2306.field751[0], (byte)-125);
                     if (!var4) {
                        break label62;
                     }
                  }

                  super.field1630.method4006(this.field2306.field748, (byte)52);
               }

               OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }

            label57: {
               super.field1630.method3988(-128, 0);
               if (~(64 & arg2) != -1) {
                  OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
                  if (!var4) {
                     break label57;
                  }
               }

               class381.field5305[1] = super.field1630.field7732 * super.field1630.field7713;
               class381.field5305[2] = super.field1630.field7732 * super.field1630.field7706;
               class381.field5305[0] = super.field1630.field7732 * super.field1630.field7722;
               OpenGL.glProgramLocalParameter4fvARB(34336, 66, class381.field5305, 0);
            }

            label81: {
               int var6 = 3 & arg2;
               if (~var6 == -3) {
                  OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
                  if (!var4) {
                     break label81;
                  }
               }

               if (~var6 != -4) {
                  OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
                  if (!var4) {
                     break label81;
                  }
               }

               OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            }

            if (arg0 >= -125) {
               this.field2309 = -0.36448348F;
            }
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field2317[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method343(boolean arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field2308;
         if (this.field2301 != null) {
            this.field2301.method1979('\u0000', -1);
            if (arg1 != 3) {
               this.method1531(116);
            }

            super.field1630.method3988(-128, 1);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field1630.field7677.method1550(12941), 0);
            OpenGL.glMatrixMode(5888);
            super.field1630.method3988(-128, 0);
            if (super.field1630.field7640 != this.field2314) {
               int var4 = super.field1630.field7640 % 5000 * 128 / 5000;
               int var5 = 0;
               if (var3) {
                  OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field2304, var4);
                  var4 += 2;
                  ++var5;
               }

               while(true) {
                  int var10000;
                  if (~var5 <= -65) {
                     var10000 = this.field2306.field752;
                     if (!var3) {
                        label31: {
                           if (var10000 != 0) {
                              this.field2309 = (float)(super.field1630.field7640 % 4000) / 4000.0F;
                              if (!var3) {
                                 break label31;
                              }
                           }

                           OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                        }

                        this.field2314 = super.field1630.field7640;
                        return;
                     }
                  } else {
                     var10000 = 34336;
                  }

                  OpenGL.glProgramLocalParameter4fvARB(var10000, var5, this.field2304, var4);
                  var4 += 2;
                  ++var5;
               }
            }
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field2317[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method340(int arg0) {
      try {
         ++field2303;
         if (arg0 == 5) {
            if (this.field2301 != null) {
               this.field2301.method1979('\u0001', arg0 ^ -6);
               super.field1630.method3988(-128, 1);
               super.field1630.method4006((class549)null, (byte)-121);
               super.field1630.method3988(-128, 0);
            }
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2317[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1528(byte arg0) {
      try {
         if (arg0 > 0) {
            field2313 = null;
            field2316 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2317[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "a",
      descriptor = "(IIZIIIII)V"
   )
   public static final void method1529(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         ++field2305;
         if (~(arg2 ? class757.field11093.field11008.method3351(arg0 + -18033) : class757.field11093.field10993.method3351(arg0 + -18033)) != -1 && arg7 != 0 && ~class128.field1640 > -51 && arg1 != -1) {
            client.field1479[class128.field1640++] = new class142((byte)(!arg2 ? 2 : 3), arg1, arg7, arg4, arg3, arg5, arg6, (class713)null);
         }

         if (arg0 != 0) {
            field2316 = null;
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field2317[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "<init>",
      descriptor = "(Liu;Luda;)V"
   )
   public class182(class530 arg0, class56 arg1) {
      boolean var3 = client.field1481;
      super(arg0);

      try {
         this.field2306 = arg1;
         if (super.field1630.field7688 && ~super.field1630.field7717 <= -3) {
            this.field2315 = class515.method3878(34336, field2317[10], 0, super.field1630);
            if (this.field2315 != null) {
               int[][] var4 = class91.method845(64, 10544, 3, false, 4, 0, 256, 0.4F, 4);
               int[][] var5 = class91.method845(64, 10544, 3, false, 4, 8, 256, 0.4F, 4);
               int var6 = 0;
               this.field2304 = new float[32768];
               int var7 = 0;
               if (!var3 && var7 >= 256) {
                  this.method1531(2);
               } else {
                  do {
                     int[] var8 = var4[var7];
                     int[] var9 = var5[var7];
                     int var10 = 0;
                     if (var3) {
                        this.field2304[var6++] = (float)var8[var10] / 4096.0F;
                        this.field2304[var6++] = (float)var9[var10] / 4096.0F;
                        ++var10;
                     }

                     while(true) {
                        while(~var10 > -65) {
                           this.field2304[var6++] = (float)var8[var10] / 4096.0F;
                           this.field2304[var6++] = (float)var9[var10] / 4096.0F;
                           ++var10;
                        }

                        if (!var3) {
                           ++var7;
                           break;
                        }

                        ++var10;
                     }
                  } while(var7 < 256);

                  this.method1531(2);
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field2317[11] + (arg0 != null ? field2317[7] : field2317[6]) + ',' + (arg1 != null ? field2317[7] : field2317[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method347(boolean arg0) {
      try {
         if (arg0) {
            this.field2314 = -37;
         }

         ++field2302;
         return true;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2317[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "a",
      descriptor = "(IZI)Z"
   )
   public static final boolean method1530(int arg0, boolean arg1, int arg2) {
      try {
         if (arg1) {
            field2316 = null;
         }

         ++field2300;
         return (52 & arg2) != 0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2317[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "c",
      descriptor = "(I)V"
   )
   private final void method1531(int arg0) {
      try {
         this.field2301 = new class249(super.field1630, arg0);
         ++field2310;
         this.field2301.method1977(arg0 + 4862, 0);
         super.field1630.method3988(-128, 1);
         super.field1630.method4011(-16777216, 2);
         super.field1630.method4022(7681, 34161, 260);
         super.field1630.method3969(0, 34166, (byte)-120, 770);
         super.field1630.method3988(arg0 + -130, 0);
         OpenGL.glBindProgramARB(34336, this.field2315.field5825);
         OpenGL.glEnable(34336);
         this.field2301.method1976(-126);
         this.field2301.method1977(4864, 1);
         super.field1630.method3988(-128, 1);
         OpenGL.glMatrixMode(5890);
         OpenGL.glLoadIdentity();
         OpenGL.glMatrixMode(5888);
         super.field1630.method4009(0, 1);
         super.field1630.method3969(0, 5890, (byte)-120, 770);
         super.field1630.method3988(-128, 0);
         OpenGL.glBindProgramARB(34336, 0);
         OpenGL.glDisable(34336);
         OpenGL.glDisable(34820);
         this.field2301.method1976(arg0 ^ -115);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2317[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1532(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1533(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 106;
            break;
         case 1:
            var10005 = 24;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 122;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
