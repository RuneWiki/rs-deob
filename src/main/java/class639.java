import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class639 extends class347 {
   @OriginalMember(
      owner = "client!te",
      name = "x",
      descriptor = "Ltda;"
   )
   private class663 field9302;
   @OriginalMember(
      owner = "client!te",
      name = "E",
      descriptor = "I"
   )
   public int field9318;
   @OriginalMember(
      owner = "client!te",
      name = "i",
      descriptor = "Lck;"
   )
   private class667 field9314;
   @OriginalMember(
      owner = "client!te",
      name = "y",
      descriptor = "[I"
   )
   private int[] field9309;
   @OriginalMember(
      owner = "client!te",
      name = "k",
      descriptor = "I"
   )
   public int field9317;
   @OriginalMember(
      owner = "client!te",
      name = "l",
      descriptor = "I"
   )
   public int field9304;
   @OriginalMember(
      owner = "client!te",
      name = "z",
      descriptor = "F"
   )
   public float field9303;
   @OriginalMember(
      owner = "client!te",
      name = "t",
      descriptor = "I"
   )
   public int field9300;
   @OriginalMember(
      owner = "client!te",
      name = "r",
      descriptor = "Lvt;"
   )
   private class318 field9315;
   @OriginalMember(
      owner = "client!te",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9325 = new String[]{method4605(method4604(":Y\u001e:A")), method4605(method4604(":Y\u001e6A")), method4605(method4604(" I\\\u0012")), method4605(method4604("5\u0012\u001eP\u0014")), method4605(method4604(":Y\u001e<A")), method4605(method4604(":Y\u001e=A")), method4605(method4604(":Y\u001e;A")), method4605(method4604(":Y\u001e8A")), method4605(method4604(":Y\u001e?A")), method4605(method4604(":Y\u001eB\u0000 UD@A")), method4605(method4604(":Y\u001e9A"))};
   @OriginalMember(
      owner = "client!te",
      name = "v",
      descriptor = "[I"
   )
   public static int[] field9310 = new int[13];
   @OriginalMember(
      owner = "client!te",
      name = "j",
      descriptor = "I"
   )
   public static int field9316 = -1;
   @OriginalMember(
      owner = "client!te",
      name = "p",
      descriptor = "I"
   )
   public static int field9322 = -1;
   @OriginalMember(
      owner = "client!te",
      name = "F",
      descriptor = "F"
   )
   public static float field9301;
   @OriginalMember(
      owner = "client!te",
      name = "q",
      descriptor = "I"
   )
   public static int field9305;
   @OriginalMember(
      owner = "client!te",
      name = "B",
      descriptor = "I"
   )
   public static int field9306;
   @OriginalMember(
      owner = "client!te",
      name = "n",
      descriptor = "I"
   )
   public static int field9308;
   @OriginalMember(
      owner = "client!te",
      name = "m",
      descriptor = "I"
   )
   public static int field9312;
   @OriginalMember(
      owner = "client!te",
      name = "o",
      descriptor = "I"
   )
   public static int field9319;
   @OriginalMember(
      owner = "client!te",
      name = "s",
      descriptor = "I"
   )
   public static int field9320;
   @OriginalMember(
      owner = "client!te",
      name = "w",
      descriptor = "I"
   )
   public static int field9321;
   @OriginalMember(
      owner = "client!te",
      name = "C",
      descriptor = "I"
   )
   public static int field9323;
   @OriginalMember(
      owner = "client!te",
      name = "u",
      descriptor = "Lrr;"
   )
   private class380 field9311;
   @OriginalMember(
      owner = "client!te",
      name = "G",
      descriptor = "Luca;"
   )
   public static class538 field9324;
   @OriginalMember(
      owner = "client!te",
      name = "D",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field9313;
   @OriginalMember(
      owner = "client!te",
      name = "A",
      descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   private NativeHeapBuffer field9307;

   @OriginalMember(
      owner = "client!te",
      name = "b",
      descriptor = "(II)V",
      line = 3
   )
   public final void method4596(int arg0, int arg1) {
      try {
         ++field9312;
         this.field9307 = this.field9314.field9904.method5083(arg0 * 4, true);
         int var3 = -110 % ((arg1 - -5) / 52);
         this.field9313 = new Stream(this.field9307);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field9325[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "(IIBI)V",
      line = 15
   )
   public final void method4597(int arg0, int arg1, byte arg2, int arg3) {
      try {
         int var5 = 65 / ((-82 - arg2) / 36);
         this.field9309[this.field9302.field4087 * arg1 + arg3] = class379.method2928(this.field9309[this.field9302.field4087 * arg1 + arg3], 1 << arg0);
         ++field9321;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field9325[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "(II)V",
      line = 25
   )
   public final void method4598(int arg0, int arg1) {
      try {
         ++field9320;
         this.field9313.method5085();
         if (arg1 != -4838) {
            this.method4602((byte)31, (int[])null, -66);
         }

         class390 var3 = this.field9314.method4786(false, this.field9307, 24348, arg0 * 4, 4);
         this.field9311 = new class380(var3, 5121, 4, 0);
         this.field9307 = null;
         this.field9313 = null;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field9325[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "(FZIII)V",
      line = 52
   )
   public final void method4599(float arg0, boolean arg1, int arg2, int arg3, int arg4) {
      int var6 = client.field4530;

      try {
         if (~this.field9318 != 0) {
            class327 var7 = this.field9314.field813.method1159(this.field9318, 127);
            int var8 = 255 & var7.field4641;
            if (var8 != 0 && var7.field4655 != 4) {
               label106: {
                  int var9;
                  label93: {
                     if (arg4 >= 0) {
                        if (arg4 <= 127) {
                           var9 = arg4 * 131586;
                           if (var6 == 0) {
                              break label93;
                           }
                        }

                        var9 = 16777215;
                        if (var6 == 0) {
                           break label93;
                        }
                     }

                     var9 = 0;
                  }

                  if (~var8 != -257) {
                     int var11 = -var8 + 256;
                     arg2 = (-16711936 & (var9 & 16711935) * var8 - -((arg2 & 16711935) * var11)) - -(16711680 & (65280 & arg2) * var11 + (var9 & 65280) * var8) >> 8;
                     if (var6 == 0) {
                        break label106;
                     }
                  }

                  arg2 = var9;
               }
            }

            int var12 = var7.field4632 & 255;
            if (var12 != 0) {
               var12 += 256;
               int var13 = (arg2 >> 16 & 255) * var12;
               if (~var13 < -65536) {
                  var13 = 65535;
               }

               int var14 = ((arg2 & 65280) >> 8) * var12;
               if (~var14 < -65536) {
                  var14 = 65535;
               }

               int var15 = (255 & arg2) * var12;
               if (var15 > 65535) {
                  var15 = 65535;
               }

               arg2 = (var15 >> 8) + ((var13 & -771686656) << 8) + (65280 & var14);
            }
         }

         ++field9308;
         this.field9313.method5096(arg3 * 4);
         if (arg0 != 1.0F) {
            int var17;
            int var18;
            int var19;
            label76: {
               int var16 = (arg2 & 16737578) >> 16;
               var17 = (arg2 & 65431) >> 8;
               var18 = arg2 & 255;
               var19 = (int)((float)var16 * arg0);
               if (~var19 > -1) {
                  var19 = 0;
                  if (var6 == 0) {
                     break label76;
                  }
               }

               if (var19 > 255) {
                  var19 = 255;
               }
            }

            int var20;
            int var21;
            label71: {
               var20 = (int)((float)var17 * arg0);
               var21 = (int)((float)var18 * arg0);
               if (~var20 > -1) {
                  var20 = 0;
                  if (var6 == 0) {
                     break label71;
                  }
               }

               if (var20 > 255) {
                  var20 = 255;
               }
            }

            label66: {
               if (var21 < 0) {
                  var21 = 0;
                  if (var6 == 0) {
                     break label66;
                  }
               }

               if (var21 > 255) {
                  var21 = 255;
               }
            }

            arg2 = var21 | var19 << 16 | var20 << 8;
         }

         this.field9313.method5095((byte)(arg2 >> 16));
         this.field9313.method5095((byte)(arg2 >> 8));
         if (!arg1) {
            this.field9317 = -3;
         }

         this.field9313.method5095((byte)arg2);
      } catch (RuntimeException var23) {
         throw class670.method4877(var23, field9325[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "(Z)V",
      line = 164
   )
   public static void method4600(boolean arg0) {
      try {
         field9310 = null;
         if (!arg0) {
            field9305 = -15;
         }

         field9324 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9325[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "(IIZILwba;Leaa;I)V",
      line = 181
   )
   public static final void method4601(int arg0, int arg1, boolean arg2, int arg3, class55 arg4, class526 arg5, int arg6) {
      try {
         class158.method1310(arg6, arg3, (byte)-120, arg2, arg5, arg0);
         if (arg1 != 1) {
            method4601(56, -57, true, -100, (class55)null, (class526)null, 37);
         }

         ++field9319;
         class660.field9563 = arg4;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field9325[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field9325[3] : field9325[2]) + ',' + (arg5 != null ? field9325[3] : field9325[2]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "(B[II)V",
      line = 199
   )
   public final void method4602(byte arg0, int[] arg1, int arg2) {
      int var4 = client.field4530;

      try {
         int var5;
         class764 var6;
         int var7;
         int var10000;
         label231: {
            ++field9323;
            var5 = 0;
            var6 = this.field9314.field10021;
            var6.field1590 = 0;
            if (!this.field9314.field10006) {
               var7 = 0;
               if (var4 != 0 || ~var7 > ~arg2) {
                  do {
                     int var8 = arg1[var7];
                     short[] var9 = this.field9302.field9620[var8];
                     int var10 = this.field9309[var8];
                     if (var10 != 0) {
                        if (var9 == null) {
                           ++var7;
                        } else {
                           int var11 = 0;
                           int var12 = 0;
                           if (var4 == 0 && ~var12 <= ~var9.length) {
                              ++var7;
                           } else {
                              do {
                                 if (~(var10 & 1 << var11++) == -1) {
                                    var12 += 3;
                                    if (var4 == 0) {
                                       continue;
                                    }
                                 }

                                 var6.method1080(true, 65535 & var9[var12++]);
                                 ++var5;
                                 ++var5;
                                 var6.method1080(true, 65535 & var9[var12++]);
                                 var6.method1080(true, var9[var12++] & 65535);
                                 ++var5;
                              } while(~var12 > ~var9.length);

                              ++var7;
                           }
                        }
                     } else {
                        ++var7;
                     }
                  } while(~var7 > ~arg2);
               }

               if (var4 == 0) {
                  var10000 = ~var5;
                  if (var4 == 0) {
                     if (var10000 < -1) {
                        this.field9315.method998(var6.field1590, var6.field1552, (byte)-104, 5123);
                        this.field9314.method4847(this.field9302.field9650, 113, this.field9302.field9651, this.field9311, this.field9302.field9642);
                        this.field9314.method4810(~(this.field9302.field9607 & 8) != -1, this.field9318, ~(this.field9302.field9607 & 7) != -1, false);
                        if (this.field9314.field9958) {
                           this.field9314.method641(Integer.MAX_VALUE, this.field9300, this.field9304, this.field9317);
                        }

                        OpenGL.glMatrixMode(5890);
                        OpenGL.glPushMatrix();
                        OpenGL.glScalef(1.0F / this.field9303, 1.0F / this.field9303, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field9314.method4847(this.field9302.field9650, 116, this.field9302.field9651, this.field9311, this.field9302.field9642);
                        this.field9314.method4781(var5, 4, this.field9315, 0, 1024);
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glPopMatrix();
                        OpenGL.glMatrixMode(5888);
                     }

                     if (arg0 <= 11) {
                        method4601(93, 106, true, 19, (class55)null, (class526)null, -77);
                        return;
                     }

                     return;
                  }
                  break label231;
               }
            }

            var7 = 0;
            if (var4 != 0) {
               var10000 = arg1[var7];
            } else if (arg2 <= var7) {
               var10000 = ~var5;
               if (var4 == 0) {
                  if (var10000 < -1) {
                     this.field9315.method998(var6.field1590, var6.field1552, (byte)-104, 5123);
                     this.field9314.method4847(this.field9302.field9650, 113, this.field9302.field9651, this.field9311, this.field9302.field9642);
                     this.field9314.method4810(~(this.field9302.field9607 & 8) != -1, this.field9318, ~(this.field9302.field9607 & 7) != -1, false);
                     if (this.field9314.field9958) {
                        this.field9314.method641(Integer.MAX_VALUE, this.field9300, this.field9304, this.field9317);
                     }

                     OpenGL.glMatrixMode(5890);
                     OpenGL.glPushMatrix();
                     OpenGL.glScalef(1.0F / this.field9303, 1.0F / this.field9303, 1.0F);
                     OpenGL.glMatrixMode(5888);
                     this.field9314.method4847(this.field9302.field9650, 116, this.field9302.field9651, this.field9311, this.field9302.field9642);
                     this.field9314.method4781(var5, 4, this.field9315, 0, 1024);
                     OpenGL.glMatrixMode(5890);
                     OpenGL.glPopMatrix();
                     OpenGL.glMatrixMode(5888);
                  }

                  if (arg0 <= 11) {
                     method4601(93, 106, true, 19, (class55)null, (class526)null, -77);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = arg1[var7];
            }
         }

         while(true) {
            int var13 = var10000;
            short[] var14 = this.field9302.field9620[var13];
            int var15 = this.field9309[var13];
            if (var15 == 0) {
               ++var7;
            } else if (var14 == null) {
               ++var7;
            } else {
               int var16 = 0;
               int var17 = 0;
               if (var4 != 0) {
                  if ((1 << var16++ & var15) == 0) {
                     var17 += 3;
                     if (var4 != 0) {
                        var6.method1103(65535 & var14[var17++], -30);
                        ++var5;
                        var6.method1103(var14[var17++] & 65535, -74);
                        ++var5;
                        var6.method1103(var14[var17++] & 65535, -101);
                        ++var5;
                     }
                  } else {
                     var6.method1103(65535 & var14[var17++], -30);
                     ++var5;
                     var6.method1103(var14[var17++] & 65535, -74);
                     ++var5;
                     var6.method1103(var14[var17++] & 65535, -101);
                     ++var5;
                  }
               }

               while(var14.length > var17) {
                  if ((1 << var16++ & var15) == 0) {
                     var17 += 3;
                     if (var4 != 0) {
                        var6.method1103(65535 & var14[var17++], -30);
                        ++var5;
                        var6.method1103(var14[var17++] & 65535, -74);
                        ++var5;
                        var6.method1103(var14[var17++] & 65535, -101);
                        ++var5;
                     }
                  } else {
                     var6.method1103(65535 & var14[var17++], -30);
                     ++var5;
                     var6.method1103(var14[var17++] & 65535, -74);
                     ++var5;
                     var6.method1103(var14[var17++] & 65535, -101);
                     ++var5;
                  }
               }

               ++var7;
            }

            if (arg2 <= var7) {
               var10000 = ~var5;
               if (var4 == 0) {
                  if (var10000 < -1) {
                     this.field9315.method998(var6.field1590, var6.field1552, (byte)-104, 5123);
                     this.field9314.method4847(this.field9302.field9650, 113, this.field9302.field9651, this.field9311, this.field9302.field9642);
                     this.field9314.method4810(~(this.field9302.field9607 & 8) != -1, this.field9318, ~(this.field9302.field9607 & 7) != -1, false);
                     if (this.field9314.field9958) {
                        this.field9314.method641(Integer.MAX_VALUE, this.field9300, this.field9304, this.field9317);
                     }

                     OpenGL.glMatrixMode(5890);
                     OpenGL.glPushMatrix();
                     OpenGL.glScalef(1.0F / this.field9303, 1.0F / this.field9303, 1.0F);
                     OpenGL.glMatrixMode(5888);
                     this.field9314.method4847(this.field9302.field9650, 116, this.field9302.field9651, this.field9311, this.field9302.field9642);
                     this.field9314.method4781(var5, 4, this.field9315, 0, 1024);
                     OpenGL.glMatrixMode(5890);
                     OpenGL.glPopMatrix();
                     OpenGL.glMatrixMode(5888);
                  }

                  if (arg0 <= 11) {
                     method4601(93, 106, true, 19, (class55)null, (class526)null, -77);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = arg1[var7];
            }
         }
      } catch (RuntimeException var19) {
         throw class670.method4877(var19, field9325[4] + arg0 + ',' + (arg1 != null ? field9325[3] : field9325[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "<init>",
      descriptor = "(Ltda;IIIII)V",
      line = 322
   )
   public class639(class663 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field9302 = arg0;
         this.field9318 = arg1;
         this.field9314 = this.field9302.field9632;
         this.field9309 = new int[this.field9302.field4087 * this.field9302.field4081];
         this.field9317 = arg5;
         this.field9304 = arg4;
         this.field9303 = (float)arg2;
         this.field9300 = arg3;
         this.field9315 = new class318(this.field9314, 5123, (byte[])null, 1);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field9325[9] + (arg0 != null ? field9325[3] : field9325[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "(IB)V",
      line = 340
   )
   public final void method4603(int arg0, byte arg1) {
      try {
         if (arg1 != 98) {
            this.field9318 = -12;
         }

         this.field9313.method5096(arg0 * 4 + 3);
         ++field9306;
         this.field9313.method5095(-1);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9325[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4604(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!te",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4605(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 48;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
