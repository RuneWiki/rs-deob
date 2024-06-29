import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class10 extends class673 {
   @OriginalMember(
      owner = "client!eb",
      name = "q",
      descriptor = "Lod;"
   )
   private class761 field227;
   @OriginalMember(
      owner = "client!eb",
      name = "x",
      descriptor = "I"
   )
   public int field223;
   @OriginalMember(
      owner = "client!eb",
      name = "o",
      descriptor = "Liu;"
   )
   private class530 field232;
   @OriginalMember(
      owner = "client!eb",
      name = "v",
      descriptor = "I"
   )
   public int field222;
   @OriginalMember(
      owner = "client!eb",
      name = "t",
      descriptor = "F"
   )
   public float field217;
   @OriginalMember(
      owner = "client!eb",
      name = "s",
      descriptor = "I"
   )
   public int field233;
   @OriginalMember(
      owner = "client!eb",
      name = "r",
      descriptor = "[I"
   )
   private int[] field216;
   @OriginalMember(
      owner = "client!eb",
      name = "H",
      descriptor = "I"
   )
   public int field234;
   @OriginalMember(
      owner = "client!eb",
      name = "E",
      descriptor = "Lot;"
   )
   private class750 field218;
   @OriginalMember(
      owner = "client!eb",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field237 = new String[]{method100(method99("\u00118\t\u000fG")), method100(method99("\u00118\t\rG")), method100(method99("\u00118\t\u000bG")), method100(method99("\u000ft\tf\u0012")), method100(method99("\u00118\t\u000eG")), method100(method99("\u001a/K$")), method100(method99("\u00118\t\fG")), method100(method99("\u00118\t\nG")), method100(method99("\u00118\tt\u0006\u001a3SvG")), method100(method99("\u00118\t\tG"))};
   @OriginalMember(
      owner = "client!eb",
      name = "w",
      descriptor = "J"
   )
   public static long field235 = 0L;
   @OriginalMember(
      owner = "client!eb",
      name = "p",
      descriptor = "I"
   )
   public static int field229 = 1;
   @OriginalMember(
      owner = "client!eb",
      name = "m",
      descriptor = "I"
   )
   public static int field215;
   @OriginalMember(
      owner = "client!eb",
      name = "n",
      descriptor = "I"
   )
   public static int field219;
   @OriginalMember(
      owner = "client!eb",
      name = "D",
      descriptor = "I"
   )
   public static int field220;
   @OriginalMember(
      owner = "client!eb",
      name = "B",
      descriptor = "I"
   )
   public static int field224;
   @OriginalMember(
      owner = "client!eb",
      name = "A",
      descriptor = "I"
   )
   public static int field225;
   @OriginalMember(
      owner = "client!eb",
      name = "u",
      descriptor = "I"
   )
   public static int field226;
   @OriginalMember(
      owner = "client!eb",
      name = "F",
      descriptor = "I"
   )
   public static int field231;
   @OriginalMember(
      owner = "client!eb",
      name = "G",
      descriptor = "I"
   )
   public static int field236;
   @OriginalMember(
      owner = "client!eb",
      name = "z",
      descriptor = "Lrga;"
   )
   private class71 field221;
   @OriginalMember(
      owner = "client!eb",
      name = "y",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field228;
   @OriginalMember(
      owner = "client!eb",
      name = "l",
      descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   private NativeHeapBuffer field230;

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(IIFII)V"
   )
   public final void method92(int arg0, int arg1, float arg2, int arg3, int arg4) {
      boolean var6 = client.field1481;

      try {
         if (this.field233 != -1) {
            class668 var7 = this.field232.field6667.method911(this.field233, -98);
            int var8 = 255 & var7.field9887;
            if (~var8 != -1 && ~var7.field9911 != -5) {
               label109: {
                  int var9;
                  label96: {
                     if (arg1 >= 0) {
                        if (arg1 > 127) {
                           var9 = 16777215;
                           if (!var6) {
                              break label96;
                           }
                        }

                        var9 = arg1 * 131586;
                        if (!var6) {
                           break label96;
                        }
                     }

                     var9 = 0;
                  }

                  if (~var8 != -257) {
                     int var11 = 256 - var8;
                     arg4 = (16711680 & (65280 & arg4) * var11 + (65280 & var9) * var8) + ((16711935 & arg4) * var11 + (16711935 & var9) * var8 & -16711936) >> 8;
                     if (!var6) {
                        break label109;
                     }
                  }

                  arg4 = var9;
               }
            }

            int var12 = var7.field9891 & 255;
            if (~var12 != -1) {
               var12 += 256;
               int var13 = (255 & arg4 >> 16) * var12;
               if (var13 > 65535) {
                  var13 = 65535;
               }

               int var14 = (255 & arg4 >> 8) * var12;
               if (~var14 < -65536) {
                  var14 = 65535;
               }

               int var15 = (arg4 & 255) * var12;
               if (~var15 < -65536) {
                  var15 = 65535;
               }

               arg4 = (var13 << 8 & 16711710) + (var15 >> 8) + (65280 & var14);
            }
         }

         ++field236;
         if (arg2 != 1.0F) {
            int var17;
            int var18;
            int var19;
            label79: {
               int var16 = arg4 >> 16 & 255;
               var17 = (arg4 & 65282) >> 8;
               var18 = (int)((float)var16 * arg2);
               var19 = 255 & arg4;
               if (var18 >= 0) {
                  if (~var18 >= -256) {
                     break label79;
                  }

                  var18 = 255;
                  if (!var6) {
                     break label79;
                  }
               }

               var18 = 0;
            }

            int var20;
            int var21;
            label72: {
               var20 = (int)((float)var17 * arg2);
               var21 = (int)((float)var19 * arg2);
               if (var20 >= 0) {
                  if (var20 <= 255) {
                     break label72;
                  }

                  var20 = 255;
                  if (!var6) {
                     break label72;
                  }
               }

               var20 = 0;
            }

            label65: {
               if (~var21 <= -1) {
                  if (var21 <= 255) {
                     break label65;
                  }

                  var21 = 255;
                  if (!var6) {
                     break label65;
                  }
               }

               var21 = 0;
            }

            arg4 = var21 | var18 << 16 | var20 << 8;
         }

         this.field228.method3004(arg3 * 4);
         this.field228.method2993((byte)(arg4 >> 16));
         this.field228.method2993((byte)(arg4 >> 8));
         this.field228.method2993((byte)arg4);
         if (arg0 >= -66) {
            this.field228 = null;
         }
      } catch (RuntimeException var23) {
         throw class93.method866(var23, field237[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method93(int arg0, boolean arg1) {
      try {
         if (arg1) {
            this.field223 = 67;
         }

         ++field225;
         this.field230 = this.field232.field7646.method2987(arg0 * 4, true);
         this.field228 = new Stream(this.field230);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field237[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method94(int arg0, int arg1) {
      try {
         if (arg1 == -15243) {
            ++field215;
            this.field228.method2995();
            class83 var3 = this.field232.method4040(false, arg0 * 4, 4, true, this.field230);
            this.field221 = new class71(var3, 5121, 4, 0);
            this.field228 = null;
            this.field230 = null;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field237[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method95(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field220;
         this.field216[this.field227.field5769 * arg3 + arg1] = class2.method15(this.field216[this.field227.field5769 * arg3 + arg1], 1 << arg2);
         if (arg0 != 65535) {
            this.field227 = null;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field237[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(IIIB)V"
   )
   public static final void method96(int arg0, int arg1, int arg2, byte arg3) {
      boolean var4 = client.field1481;

      try {
         label42: {
            int var5 = 23 / ((arg3 - -49) / 58);
            if (arg1 != 1006) {
               if (arg1 != 1007) {
                  if (~arg1 != -1010) {
                     if (arg1 == 1001) {
                        class256.method2059(class737.field10779, arg2, arg0);
                        if (!var4) {
                           break label42;
                        }
                     }

                     if (~arg1 != -1004) {
                        break label42;
                     }

                     class256.method2059(class652.field9738, arg2, arg0);
                     if (!var4) {
                        break label42;
                     }
                  }

                  class256.method2059(class621.field9189, arg2, arg0);
                  if (!var4) {
                     break label42;
                  }
               }

               class256.method2059(class644.field9662, arg2, arg0);
               if (!var4) {
                  break label42;
               }
            }

            class256.method2059(class314.field4352, arg2, arg0);
         }

         ++field224;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field237[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "([IBI)V"
   )
   public final void method97(int[] arg0, byte arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         ++field231;
         if (arg1 == 91) {
            int var5;
            class771 var6;
            int var7;
            int var10000;
            label219: {
               var5 = 0;
               var6 = this.field232.field7694;
               var6.field864 = 0;
               if (!this.field232.field7781) {
                  var7 = 0;
                  if (var4 || var7 < arg2) {
                     do {
                        int var8 = arg0[var7];
                        int var9 = this.field216[var8];
                        short[] var10 = this.field227.field11131[var8];
                        if (var9 != 0) {
                           if (var10 == null) {
                              ++var7;
                           } else {
                              int var11 = 0;
                              int var12 = 0;
                              if (!var4 && var10.length <= var12) {
                                 ++var7;
                              } else {
                                 do {
                                    if (~(1 << var11++ & var9) != -1) {
                                       ++var5;
                                       var6.method644((byte)-65, 65535 & var10[var12++]);
                                       ++var5;
                                       var6.method644((byte)-65, 65535 & var10[var12++]);
                                       ++var5;
                                       var6.method644((byte)-65, 65535 & var10[var12++]);
                                       if (var4) {
                                          var12 += 3;
                                       }
                                    } else {
                                       var12 += 3;
                                    }
                                 } while(var10.length > var12);

                                 ++var7;
                              }
                           }
                        } else {
                           ++var7;
                        }
                     } while(var7 < arg2);
                  }

                  if (!var4) {
                     var10000 = var5;
                     if (!var4) {
                        if (var5 > 0) {
                           this.field218.method1122(var6.field864, true, 5123, var6.field859);
                           this.field232.method4028((byte)-125, this.field227.field11144, this.field221, this.field227.field11139, this.field227.field11149);
                           this.field232.method4007((byte)-117, ~(this.field227.field11129 & 8) != -1, (7 & this.field227.field11129) != 0, this.field233);
                           if (this.field232.field7740) {
                              this.field232.method439(Integer.MAX_VALUE, this.field234, this.field223, this.field222);
                           }

                           OpenGL.glMatrixMode(5890);
                           OpenGL.glPushMatrix();
                           OpenGL.glScalef(1.0F / this.field217, 1.0F / this.field217, 1.0F);
                           OpenGL.glMatrixMode(5888);
                           this.field232.method4028((byte)-122, this.field227.field11144, this.field221, this.field227.field11139, this.field227.field11149);
                           this.field232.method3962(var5, this.field218, (byte)89, 0, 4);
                           OpenGL.glMatrixMode(5890);
                           OpenGL.glPopMatrix();
                           OpenGL.glMatrixMode(5888);
                           return;
                        }

                        return;
                     }
                     break label219;
                  }
               }

               var7 = 0;
               if (var4) {
                  var10000 = arg0[var7];
               } else if (~arg2 >= ~var7) {
                  var10000 = var5;
                  if (!var4) {
                     if (var5 > 0) {
                        this.field218.method1122(var6.field864, true, 5123, var6.field859);
                        this.field232.method4028((byte)-125, this.field227.field11144, this.field221, this.field227.field11139, this.field227.field11149);
                        this.field232.method4007((byte)-117, ~(this.field227.field11129 & 8) != -1, (7 & this.field227.field11129) != 0, this.field233);
                        if (this.field232.field7740) {
                           this.field232.method439(Integer.MAX_VALUE, this.field234, this.field223, this.field222);
                        }

                        OpenGL.glMatrixMode(5890);
                        OpenGL.glPushMatrix();
                        OpenGL.glScalef(1.0F / this.field217, 1.0F / this.field217, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field232.method4028((byte)-122, this.field227.field11144, this.field221, this.field227.field11139, this.field227.field11149);
                        this.field232.method3962(var5, this.field218, (byte)89, 0, 4);
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glPopMatrix();
                        OpenGL.glMatrixMode(5888);
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = arg0[var7];
               }
            }

            while(true) {
               int var13 = var10000;
               int var14 = this.field216[var13];
               short[] var15 = this.field227.field11131[var13];
               if (~var14 == -1) {
                  ++var7;
               } else if (var15 == null) {
                  ++var7;
               } else {
                  int var16 = 0;
                  int var17 = 0;
                  if (var4) {
                     if (~(var14 & 1 << var16++) != -1) {
                        ++var5;
                        var6.method611(var15[var17++] & 65535, -1344798296);
                        ++var5;
                        var6.method611(65535 & var15[var17++], -1344798296);
                        var6.method611(65535 & var15[var17++], arg1 + -1344798387);
                        ++var5;
                        if (var4) {
                           var17 += 3;
                        }
                     } else {
                        var17 += 3;
                     }
                  }

                  while(~var17 > ~var15.length) {
                     if (~(var14 & 1 << var16++) != -1) {
                        ++var5;
                        var6.method611(var15[var17++] & 65535, -1344798296);
                        ++var5;
                        var6.method611(65535 & var15[var17++], -1344798296);
                        var6.method611(65535 & var15[var17++], arg1 + -1344798387);
                        ++var5;
                        if (var4) {
                           var17 += 3;
                        }
                     } else {
                        var17 += 3;
                     }
                  }

                  ++var7;
               }

               if (~arg2 >= ~var7) {
                  var10000 = var5;
                  if (!var4) {
                     if (var5 > 0) {
                        this.field218.method1122(var6.field864, true, 5123, var6.field859);
                        this.field232.method4028((byte)-125, this.field227.field11144, this.field221, this.field227.field11139, this.field227.field11149);
                        this.field232.method4007((byte)-117, ~(this.field227.field11129 & 8) != -1, (7 & this.field227.field11129) != 0, this.field233);
                        if (this.field232.field7740) {
                           this.field232.method439(Integer.MAX_VALUE, this.field234, this.field223, this.field222);
                        }

                        OpenGL.glMatrixMode(5890);
                        OpenGL.glPushMatrix();
                        OpenGL.glScalef(1.0F / this.field217, 1.0F / this.field217, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field232.method4028((byte)-122, this.field227.field11144, this.field221, this.field227.field11139, this.field227.field11149);
                        this.field232.method3962(var5, this.field218, (byte)89, 0, 4);
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glPopMatrix();
                        OpenGL.glMatrixMode(5888);
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = arg0[var7];
               }
            }
         }
      } catch (RuntimeException var19) {
         throw class93.method866(var19, field237[4] + (arg0 != null ? field237[3] : field237[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "<init>",
      descriptor = "(Lod;IIIII)V"
   )
   public class10(class761 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field227 = arg0;
         this.field223 = arg4;
         this.field232 = this.field227.field11104;
         this.field222 = arg5;
         this.field217 = (float)arg2;
         this.field233 = arg1;
         this.field216 = new int[this.field227.field5769 * this.field227.field5767];
         this.field234 = arg3;
         this.field218 = new class750(this.field232, 5123, (byte[])null, 1);
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field237[8] + (arg0 != null ? field237[3] : field237[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method98(int arg0, int arg1) {
      try {
         if (arg0 == 1) {
            this.field228.method3004(arg1 * 4 + 3);
            ++field219;
            this.field228.method2993(-1);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field237[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method99(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 111);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method100(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 111;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
