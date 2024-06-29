import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class467 extends class500 {
   @OriginalMember(
      owner = "client!jc",
      name = "u",
      descriptor = "Lvj;"
   )
   private class469 field6423;
   @OriginalMember(
      owner = "client!jc",
      name = "y",
      descriptor = "[I"
   )
   private int[] field6438;
   @OriginalMember(
      owner = "client!jc",
      name = "t",
      descriptor = "F"
   )
   public float field6421;
   @OriginalMember(
      owner = "client!jc",
      name = "A",
      descriptor = "I"
   )
   public int field6422;
   @OriginalMember(
      owner = "client!jc",
      name = "r",
      descriptor = "I"
   )
   public int field6428;
   @OriginalMember(
      owner = "client!jc",
      name = "s",
      descriptor = "Lor;"
   )
   private class670 field6419;
   @OriginalMember(
      owner = "client!jc",
      name = "k",
      descriptor = "I"
   )
   public int field6431;
   @OriginalMember(
      owner = "client!jc",
      name = "p",
      descriptor = "I"
   )
   public int field6435;
   @OriginalMember(
      owner = "client!jc",
      name = "B",
      descriptor = "Lfm;"
   )
   private class768 field6426;
   @OriginalMember(
      owner = "client!jc",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6439 = new String[]{method3428(method3427("5&Z\u0019g")), method3428(method3427("5&Z\u001bg")), method3428(method3427("5&Z\u001ag")), method3428(method3427("5&Z\u0015g")), method3428(method3427("5&Z\u001eg")), method3428(method3427("10\u00181")), method3428(method3427("$kZs2")), method3428(method3427("5&Za&1,\u0000cg")), method3428(method3427("5&Z\u001cg")), method3428(method3427("5&Z\u0018g")), method3428(method3427("5&Z\u001fg"))};
   @OriginalMember(
      owner = "client!jc",
      name = "m",
      descriptor = "Lve;"
   )
   public static class533 field6437 = class246.method1855((byte)66);
   @OriginalMember(
      owner = "client!jc",
      name = "j",
      descriptor = "F"
   )
   public static float field6432;
   @OriginalMember(
      owner = "client!jc",
      name = "D",
      descriptor = "I"
   )
   public static int field6418;
   @OriginalMember(
      owner = "client!jc",
      name = "v",
      descriptor = "I"
   )
   public static int field6424;
   @OriginalMember(
      owner = "client!jc",
      name = "C",
      descriptor = "I"
   )
   public static int field6427;
   @OriginalMember(
      owner = "client!jc",
      name = "z",
      descriptor = "I"
   )
   public static int field6429;
   @OriginalMember(
      owner = "client!jc",
      name = "o",
      descriptor = "I"
   )
   public static int field6430;
   @OriginalMember(
      owner = "client!jc",
      name = "n",
      descriptor = "I"
   )
   public static int field6434;
   @OriginalMember(
      owner = "client!jc",
      name = "x",
      descriptor = "I"
   )
   public static int field6436;
   @OriginalMember(
      owner = "client!jc",
      name = "q",
      descriptor = "Lwq;"
   )
   private class178 field6433;
   @OriginalMember(
      owner = "client!jc",
      name = "w",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field6420;
   @OriginalMember(
      owner = "client!jc",
      name = "l",
      descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   private NativeHeapBuffer field6425;

   @OriginalMember(
      owner = "client!jc",
      name = "b",
      descriptor = "(IIII)V"
   )
   public final void method3419(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field6424;
         this.field6438[this.field6423.field3873 * arg2 - -arg0] = class283.method2155(this.field6438[this.field6423.field3873 * arg2 - -arg0], arg3 << arg1);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field6439[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jc",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method3420(int arg0, int arg1) {
      try {
         this.field6420.method5109();
         ++field6436;
         class189 var3 = this.field6419.method4857(false, this.field6425, arg1 * 4, (byte)122, 4);
         this.field6433 = new class178(var3, 5121, 4, arg0);
         this.field6420 = null;
         this.field6425 = null;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6439[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jc",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method3421(int arg0, int arg1) {
      try {
         ++field6427;
         this.field6425 = this.field6419.field9714.method5098(arg1 * 4, true);
         this.field6420 = new Stream(this.field6425);
         if (arg0 >= -15) {
            this.method3419(-54, 86, 121, 7);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6439[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jc",
      name = "a",
      descriptor = "([III)V"
   )
   public final void method3422(int[] arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         ++field6434;
         int var5 = 0;
         if (arg1 == -18760) {
            class608 var6;
            int var7;
            int var10000;
            label219: {
               var6 = this.field6419.field9769;
               var6.field8243 = 0;
               if (!this.field6419.field9773) {
                  var7 = 0;
                  if (var4 || ~arg2 < ~var7) {
                     do {
                        int var8 = arg0[var7];
                        short[] var9 = this.field6423.field6470[var8];
                        int var10 = this.field6438[var8];
                        if (var10 != 0) {
                           if (var9 == null) {
                              ++var7;
                           } else {
                              int var11 = 0;
                              int var12 = 0;
                              if (!var4 && var12 >= var9.length) {
                                 ++var7;
                              } else {
                                 do {
                                    if (~(var10 & 1 << var11++) == -1) {
                                       var12 += 3;
                                       if (!var4) {
                                          continue;
                                       }
                                    }

                                    ++var5;
                                    var6.method4330(var9[var12++] & 65535, (byte)-86);
                                    ++var5;
                                    var6.method4330(var9[var12++] & 65535, (byte)-103);
                                    ++var5;
                                    var6.method4330(var9[var12++] & 65535, (byte)-106);
                                 } while(var12 < var9.length);

                                 ++var7;
                              }
                           }
                        } else {
                           ++var7;
                        }
                     } while(~arg2 < ~var7);
                  }

                  if (!var4) {
                     var10000 = var5;
                     if (!var4) {
                        if (var5 > 0) {
                           this.field6426.method4375(var6.field8243, 5123, var6.field8227, -21583);
                           this.field6419.method4874(this.field6433, this.field6423.field6503, 125, this.field6423.field6502, this.field6423.field6492);
                           this.field6419.method4913(~(7 & this.field6423.field6489) != -1, (this.field6423.field6489 & 8) != 0, false, this.field6428);
                           if (this.field6419.field9830) {
                              this.field6419.method564(Integer.MAX_VALUE, this.field6422, this.field6431, this.field6435);
                           }

                           OpenGL.glMatrixMode(5890);
                           OpenGL.glPushMatrix();
                           OpenGL.glScalef(1.0F / this.field6421, 1.0F / this.field6421, 1.0F);
                           OpenGL.glMatrixMode(5888);
                           this.field6419.method4874(this.field6433, this.field6423.field6503, arg1 + 18862, this.field6423.field6502, this.field6423.field6492);
                           this.field6419.method4866(0, (byte)116, this.field6426, 4, var5);
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
               } else if (var7 >= arg2) {
                  var10000 = var5;
                  if (!var4) {
                     if (var5 > 0) {
                        this.field6426.method4375(var6.field8243, 5123, var6.field8227, -21583);
                        this.field6419.method4874(this.field6433, this.field6423.field6503, 125, this.field6423.field6502, this.field6423.field6492);
                        this.field6419.method4913(~(7 & this.field6423.field6489) != -1, (this.field6423.field6489 & 8) != 0, false, this.field6428);
                        if (this.field6419.field9830) {
                           this.field6419.method564(Integer.MAX_VALUE, this.field6422, this.field6431, this.field6435);
                        }

                        OpenGL.glMatrixMode(5890);
                        OpenGL.glPushMatrix();
                        OpenGL.glScalef(1.0F / this.field6421, 1.0F / this.field6421, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field6419.method4874(this.field6433, this.field6423.field6503, arg1 + 18862, this.field6423.field6502, this.field6423.field6492);
                        this.field6419.method4866(0, (byte)116, this.field6426, 4, var5);
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
               short[] var14 = this.field6423.field6470[var13];
               int var15 = this.field6438[var13];
               if (~var15 == -1) {
                  ++var7;
               } else if (var14 == null) {
                  ++var7;
               } else {
                  int var16 = 0;
                  int var17 = 0;
                  if (var4) {
                     if (~(var15 & 1 << var16++) == -1) {
                        var17 += 3;
                        if (var4) {
                           var6.method4284(var14[var17++] & 65535, -31429);
                           ++var5;
                           var6.method4284(var14[var17++] & 65535, -31429);
                           ++var5;
                           var6.method4284(var14[var17++] & 65535, -31429);
                           ++var5;
                        }
                     } else {
                        var6.method4284(var14[var17++] & 65535, -31429);
                        ++var5;
                        var6.method4284(var14[var17++] & 65535, -31429);
                        ++var5;
                        var6.method4284(var14[var17++] & 65535, -31429);
                        ++var5;
                     }
                  }

                  while(var14.length > var17) {
                     if (~(var15 & 1 << var16++) == -1) {
                        var17 += 3;
                        if (var4) {
                           var6.method4284(var14[var17++] & 65535, -31429);
                           ++var5;
                           var6.method4284(var14[var17++] & 65535, -31429);
                           ++var5;
                           var6.method4284(var14[var17++] & 65535, -31429);
                           ++var5;
                        }
                     } else {
                        var6.method4284(var14[var17++] & 65535, -31429);
                        ++var5;
                        var6.method4284(var14[var17++] & 65535, -31429);
                        ++var5;
                        var6.method4284(var14[var17++] & 65535, -31429);
                        ++var5;
                     }
                  }

                  ++var7;
               }

               if (var7 >= arg2) {
                  var10000 = var5;
                  if (!var4) {
                     if (var5 > 0) {
                        this.field6426.method4375(var6.field8243, 5123, var6.field8227, -21583);
                        this.field6419.method4874(this.field6433, this.field6423.field6503, 125, this.field6423.field6502, this.field6423.field6492);
                        this.field6419.method4913(~(7 & this.field6423.field6489) != -1, (this.field6423.field6489 & 8) != 0, false, this.field6428);
                        if (this.field6419.field9830) {
                           this.field6419.method564(Integer.MAX_VALUE, this.field6422, this.field6431, this.field6435);
                        }

                        OpenGL.glMatrixMode(5890);
                        OpenGL.glPushMatrix();
                        OpenGL.glScalef(1.0F / this.field6421, 1.0F / this.field6421, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field6419.method4874(this.field6433, this.field6423.field6503, arg1 + 18862, this.field6423.field6502, this.field6423.field6492);
                        this.field6419.method4866(0, (byte)116, this.field6426, 4, var5);
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
         throw class534.method3846(var19, field6439[8] + (arg0 != null ? field6439[6] : field6439[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jc",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3423(byte arg0) {
      try {
         if (arg0 >= -16) {
            method3423((byte)84);
         }

         field6437 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6439[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jc",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method3424(int arg0, byte arg1) {
      try {
         ++field6429;
         this.field6420.method5110(arg0 * 4 - -3);
         this.field6420.method5108(arg1);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6439[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jc",
      name = "a",
      descriptor = "(IIIFI)V"
   )
   public final void method3425(int arg0, int arg1, int arg2, float arg3, int arg4) {
      boolean var6 = client.field4273;

      try {
         if (~this.field6428 != 0) {
            class359 var7 = this.field6419.field726.method1293(this.field6428, -5150);
            int var8 = var7.field5105 & 255;
            if (var8 != 0 && ~var7.field5114 != -5) {
               label110: {
                  int var9;
                  label106: {
                     if (arg2 < 0) {
                        var9 = 0;
                        if (!var6) {
                           break label106;
                        }
                     }

                     if (arg2 > 127) {
                        var9 = 16777215;
                        if (!var6) {
                           break label106;
                        }
                     }

                     var9 = arg2 * 131586;
                  }

                  if (~var8 != -257) {
                     int var11 = -var8 + 256;
                     arg0 = (16711680 & (65280 & arg0) * var11 + (65280 & var9) * var8) + (-16711936 & (arg0 & 16711935) * var11 + (var9 & 16711935) * var8) >> 8;
                     if (!var6) {
                        break label110;
                     }
                  }

                  arg0 = var9;
               }
            }

            int var12 = 255 & var7.field5111;
            if (~var12 != -1) {
               var12 += 256;
               int var13 = (arg0 >> 16 & 255) * var12;
               if (~var13 < -65536) {
                  var13 = 65535;
               }

               int var14 = ((arg0 & 65280) >> 8) * var12;
               if (~var14 < -65536) {
                  var14 = 65535;
               }

               int var15 = (255 & arg0) * var12;
               if (var15 > 65535) {
                  var15 = 65535;
               }

               arg0 = (var15 >> 8) + ((-1207894272 & var13) << 8) + (65280 & var14);
            }
         }

         ++field6430;
         if (arg3 != 1.0F) {
            int var17;
            int var18;
            int var19;
            label78: {
               int var16 = (16774106 & arg0) >> 16;
               var17 = (arg0 & 65375) >> 8;
               var18 = (int)((float)var16 * arg3);
               var19 = 255 & arg0;
               if (var18 < 0) {
                  var18 = 0;
                  if (!var6) {
                     break label78;
                  }
               }

               if (~var18 < -256) {
                  var18 = 255;
               }
            }

            int var20;
            int var21;
            label73: {
               var20 = (int)((float)var17 * arg3);
               var21 = (int)((float)var19 * arg3);
               if (~var20 <= -1) {
                  if (var20 <= 255) {
                     break label73;
                  }

                  var20 = 255;
                  if (!var6) {
                     break label73;
                  }
               }

               var20 = 0;
            }

            label66: {
               if (var21 >= 0) {
                  if (~var21 >= -256) {
                     break label66;
                  }

                  var21 = 255;
                  if (!var6) {
                     break label66;
                  }
               }

               var21 = 0;
            }

            arg0 = var21 | var20 << 8 | var18 << 16;
         }

         this.field6420.method5110(arg4 * 4);
         this.field6420.method5108((byte)(arg0 >> 16));
         this.field6420.method5108((byte)(arg0 >> 8));
         this.field6420.method5108((byte)arg0);
         if (arg1 != -31820) {
            this.method3420(90, -64);
         }
      } catch (RuntimeException var23) {
         throw class534.method3846(var23, field6439[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jc",
      name = "a",
      descriptor = "(IIII)V"
   )
   public static final void method3426(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field6418;
         class446 var4 = class635.method4607(122, (long)arg3, 9);
         var4.method3311(true);
         var4.field6177 = arg0;
         var4.field6167 = arg1;
         if (arg2 != 65535) {
            field6432 = -1.1470248F;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field6439[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jc",
      name = "<init>",
      descriptor = "(Lvj;IIIII)V"
   )
   public class467(class469 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field6423 = arg0;
         this.field6438 = new int[this.field6423.field3873 * this.field6423.field3871];
         this.field6421 = (float)arg2;
         this.field6422 = arg3;
         this.field6428 = arg1;
         this.field6419 = this.field6423.field6483;
         this.field6431 = arg4;
         this.field6435 = arg5;
         this.field6426 = new class768(this.field6419, 5123, (byte[])null, 1);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field6439[7] + (arg0 != null ? field6439[6] : field6439[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3427(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3428(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 95;
            break;
         case 1:
            var10005 = 69;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
