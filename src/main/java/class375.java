import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class375 extends class294 {
   @OriginalMember(
      owner = "client!ji",
      name = "u",
      descriptor = "Lg;"
   )
   private class361 field5978;
   @OriginalMember(
      owner = "client!ji",
      name = "C",
      descriptor = "I"
   )
   public int field5970;
   @OriginalMember(
      owner = "client!ji",
      name = "p",
      descriptor = "[I"
   )
   private int[] field5968;
   @OriginalMember(
      owner = "client!ji",
      name = "q",
      descriptor = "I"
   )
   public int field5964;
   @OriginalMember(
      owner = "client!ji",
      name = "n",
      descriptor = "Lc;"
   )
   private class652 field5967;
   @OriginalMember(
      owner = "client!ji",
      name = "t",
      descriptor = "I"
   )
   public int field5969;
   @OriginalMember(
      owner = "client!ji",
      name = "w",
      descriptor = "I"
   )
   public int field5965;
   @OriginalMember(
      owner = "client!ji",
      name = "z",
      descriptor = "F"
   )
   public float field5966;
   @OriginalMember(
      owner = "client!ji",
      name = "s",
      descriptor = "Lnn;"
   )
   private class463 field5962;
   @OriginalMember(
      owner = "client!ji",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5979 = new String[]{method3080(method3079("DT\fx@")), method3080(method3079("Q\u000fN:")), method3080(method3079("U\u0013\fjTQ\u0013Vh\u0015")), method3080(method3079("U\u0013\f\u0013\u0015")), method3080(method3079("U\u0013\f\u0014\u0015")), method3080(method3079("U\u0013\f\u0011\u0015")), method3080(method3079("U\u0013\f\u0017\u0015")), method3080(method3079("U\u0013\f\u0012\u0015")), method3080(method3079("U\u0013\f\u0010\u0015")), method3080(method3079("U\u0013\f\u0015\u0015"))};
   @OriginalMember(
      owner = "client!ji",
      name = "x",
      descriptor = "I"
   )
   public static int field5961;
   @OriginalMember(
      owner = "client!ji",
      name = "o",
      descriptor = "I"
   )
   public static int field5963;
   @OriginalMember(
      owner = "client!ji",
      name = "D",
      descriptor = "I"
   )
   public static int field5972;
   @OriginalMember(
      owner = "client!ji",
      name = "r",
      descriptor = "I"
   )
   public static int field5973;
   @OriginalMember(
      owner = "client!ji",
      name = "m",
      descriptor = "I"
   )
   public static int field5975;
   @OriginalMember(
      owner = "client!ji",
      name = "B",
      descriptor = "I"
   )
   public static int field5976;
   @OriginalMember(
      owner = "client!ji",
      name = "A",
      descriptor = "I"
   )
   public static int field5977;
   @OriginalMember(
      owner = "client!ji",
      name = "v",
      descriptor = "Lgs;"
   )
   private class436 field5971;
   @OriginalMember(
      owner = "client!ji",
      name = "E",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field5960;
   @OriginalMember(
      owner = "client!ji",
      name = "y",
      descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   private NativeHeapBuffer field5974;

   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "(IIIB)V",
      line = 8
   )
   public final void method3072(int arg0, int arg1, int arg2, byte arg3) {
      try {
         if (arg3 > 115) {
            ++field5963;
            this.field5968[this.field5978.field4383 * arg0 + arg2] = class119.method1087(this.field5968[this.field5978.field4383 * arg0 + arg2], 1 << arg1);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field5979[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "(IFIII)V",
      line = 26
   )
   public final void method3073(int arg0, float arg1, int arg2, int arg3, int arg4) {
      boolean var6 = client.field1786;

      try {
         ++field5976;
         if (this.field5970 != -1) {
            class453 var7 = this.field5967.field8891.method1373(this.field5970, (byte)-54);
            int var8 = 255 & var7.field6930;
            if (var8 != 0 && ~var7.field6924 != -5) {
               label107: {
                  int var9;
                  label94: {
                     if (~arg2 <= -1) {
                        if (arg2 <= 127) {
                           var9 = arg2 * 131586;
                           if (!var6) {
                              break label94;
                           }
                        }

                        var9 = 16777215;
                        if (!var6) {
                           break label94;
                        }
                     }

                     var9 = 0;
                  }

                  if (var8 == 256) {
                     arg4 = var9;
                     if (!var6) {
                        break label107;
                     }
                  }

                  int var11 = -var8 + 256;
                  arg4 = (16711680 & (arg4 & 65280) * var11 + (65280 & var9) * var8) + (-16711936 & (16711935 & arg4) * var11 + (16711935 & var9) * var8) >> 8;
               }
            }

            int var12 = var7.field6935 & 255;
            if (var12 != 0) {
               var12 += 256;
               int var13 = ((16711680 & arg4) >> 16) * var12;
               if (var13 > 65535) {
                  var13 = 65535;
               }

               int var14 = (255 & arg4 >> 8) * var12;
               if (var14 > 65535) {
                  var14 = 65535;
               }

               int var15 = (255 & arg4) * var12;
               if (~var15 < -65536) {
                  var15 = 65535;
               }

               arg4 = (var15 >> 8) + ((167837440 & var13) << 8) + (var14 & 65280);
            }
         }

         if (arg1 != 1.0F) {
            int var18;
            int var19;
            int var20;
            label77: {
               int var16 = (16758394 & arg4) >> 16;
               int var17 = 255 & arg4 >> 8;
               var18 = (int)((float)var16 * arg1);
               var19 = arg4 & 255;
               var20 = (int)((float)var17 * arg1);
               if (var18 < 0) {
                  var18 = 0;
                  if (!var6) {
                     break label77;
                  }
               }

               if (var18 > 255) {
                  var18 = 255;
               }
            }

            label72: {
               if (~var20 > -1) {
                  var20 = 0;
                  if (!var6) {
                     break label72;
                  }
               }

               if (~var20 < -256) {
                  var20 = 255;
               }
            }

            int var21;
            label67: {
               var21 = (int)((float)var19 * arg1);
               if (~var21 <= -1) {
                  if (~var21 >= -256) {
                     break label67;
                  }

                  var21 = 255;
                  if (!var6) {
                     break label67;
                  }
               }

               var21 = 0;
            }

            arg4 = var21 | var20 << 8 | var18 << 16;
         }

         this.field5960.method5250(arg0 * 4);
         if (arg3 != 27012) {
            this.field5970 = -41;
         }

         this.field5960.method5245((byte)(arg4 >> 16));
         this.field5960.method5245((byte)(arg4 >> 8));
         this.field5960.method5245((byte)arg4);
      } catch (RuntimeException var23) {
         throw class482.method3757(var23, field5979[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "(I[IB)V",
      line = 138
   )
   public final void method3074(int arg0, int[] arg1, byte arg2) {
      boolean var4 = client.field1786;

      try {
         int var5;
         class37 var6;
         int var7;
         int var10000;
         int var18;
         label215: {
            ++field5973;
            var5 = 0;
            var6 = this.field5967.field9720;
            var6.field5436 = 0;
            if (!this.field5967.field9695) {
               var7 = 0;
               if (var4 || ~var7 > ~arg0) {
                  do {
                     int var8 = arg1[var7];
                     short[] var9 = this.field5978.field5593[var8];
                     int var10 = this.field5968[var8];
                     if (~var10 != -1) {
                        if (var9 == null) {
                           ++var7;
                        } else {
                           int var11 = 0;
                           int var12 = 0;
                           if (!var4 && ~var9.length >= ~var12) {
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
                                 var6.method2841(-3, var9[var12++] & 65535);
                                 var6.method2841(-3, var9[var12++] & 65535);
                                 ++var5;
                                 var6.method2841(-3, 65535 & var9[var12++]);
                                 ++var5;
                              } while(~var9.length < ~var12);

                              ++var7;
                           }
                        }
                     } else {
                        ++var7;
                     }
                  } while(~var7 > ~arg0);
               }

               if (!var4) {
                  var10000 = var5;
                  if (!var4) {
                     if (var5 > 0) {
                        this.field5962.method1590(var6.field5428, var6.field5436, 24668, 5123);
                        this.field5967.method4768(-677, this.field5978.field5605, this.field5971, this.field5978.field5614, this.field5978.field5610);
                        this.field5967.method4738(this.field5970, true, ~(8 & this.field5978.field5584) != -1, ~(7 & this.field5978.field5584) != -1);
                        if (this.field5967.field9667) {
                           this.field5967.method580(Integer.MAX_VALUE, this.field5965, this.field5969, this.field5964);
                        }

                        OpenGL.glMatrixMode(5890);
                        OpenGL.glPushMatrix();
                        OpenGL.glScalef(1.0F / this.field5966, 1.0F / this.field5966, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field5967.method4768(-677, this.field5978.field5605, this.field5971, this.field5978.field5614, this.field5978.field5610);
                        this.field5967.method4760(var5, this.field5962, 4, 0, -126);
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glPopMatrix();
                        OpenGL.glMatrixMode(5888);
                     }

                     var18 = 107 / ((arg2 - -44) / 63);
                     return;
                  }
                  break label215;
               }
            }

            var7 = 0;
            if (var4) {
               var10000 = arg1[var7];
            } else if (~var7 <= ~arg0) {
               var10000 = var5;
               if (!var4) {
                  if (var5 > 0) {
                     this.field5962.method1590(var6.field5428, var6.field5436, 24668, 5123);
                     this.field5967.method4768(-677, this.field5978.field5605, this.field5971, this.field5978.field5614, this.field5978.field5610);
                     this.field5967.method4738(this.field5970, true, ~(8 & this.field5978.field5584) != -1, ~(7 & this.field5978.field5584) != -1);
                     if (this.field5967.field9667) {
                        this.field5967.method580(Integer.MAX_VALUE, this.field5965, this.field5969, this.field5964);
                     }

                     OpenGL.glMatrixMode(5890);
                     OpenGL.glPushMatrix();
                     OpenGL.glScalef(1.0F / this.field5966, 1.0F / this.field5966, 1.0F);
                     OpenGL.glMatrixMode(5888);
                     this.field5967.method4768(-677, this.field5978.field5605, this.field5971, this.field5978.field5614, this.field5978.field5610);
                     this.field5967.method4760(var5, this.field5962, 4, 0, -126);
                     OpenGL.glMatrixMode(5890);
                     OpenGL.glPopMatrix();
                     OpenGL.glMatrixMode(5888);
                  }

                  var18 = 107 / ((arg2 - -44) / 63);
                  return;
               }
            } else {
               var10000 = arg1[var7];
            }
         }

         while(true) {
            int var13 = var10000;
            int var14 = this.field5968[var13];
            short[] var15 = this.field5978.field5593[var13];
            if (~var14 == -1) {
               ++var7;
            } else if (var15 == null) {
               ++var7;
            } else {
               int var16 = 0;
               int var17 = 0;
               if (var4) {
                  if ((var14 & 1 << var16++) == 0) {
                     var17 += 3;
                     if (var4) {
                        var6.method2873(65535 & var15[var17++], (byte)-123);
                        ++var5;
                        ++var5;
                        var6.method2873(var15[var17++] & 65535, (byte)121);
                        var6.method2873(var15[var17++] & 65535, (byte)-67);
                        ++var5;
                     }
                  } else {
                     var6.method2873(65535 & var15[var17++], (byte)-123);
                     ++var5;
                     ++var5;
                     var6.method2873(var15[var17++] & 65535, (byte)121);
                     var6.method2873(var15[var17++] & 65535, (byte)-67);
                     ++var5;
                  }
               }

               while(~var15.length < ~var17) {
                  if ((var14 & 1 << var16++) == 0) {
                     var17 += 3;
                     if (var4) {
                        var6.method2873(65535 & var15[var17++], (byte)-123);
                        ++var5;
                        ++var5;
                        var6.method2873(var15[var17++] & 65535, (byte)121);
                        var6.method2873(var15[var17++] & 65535, (byte)-67);
                        ++var5;
                     }
                  } else {
                     var6.method2873(65535 & var15[var17++], (byte)-123);
                     ++var5;
                     ++var5;
                     var6.method2873(var15[var17++] & 65535, (byte)121);
                     var6.method2873(var15[var17++] & 65535, (byte)-67);
                     ++var5;
                  }
               }

               ++var7;
            }

            if (~var7 <= ~arg0) {
               var10000 = var5;
               if (!var4) {
                  if (var5 > 0) {
                     this.field5962.method1590(var6.field5428, var6.field5436, 24668, 5123);
                     this.field5967.method4768(-677, this.field5978.field5605, this.field5971, this.field5978.field5614, this.field5978.field5610);
                     this.field5967.method4738(this.field5970, true, ~(8 & this.field5978.field5584) != -1, ~(7 & this.field5978.field5584) != -1);
                     if (this.field5967.field9667) {
                        this.field5967.method580(Integer.MAX_VALUE, this.field5965, this.field5969, this.field5964);
                     }

                     OpenGL.glMatrixMode(5890);
                     OpenGL.glPushMatrix();
                     OpenGL.glScalef(1.0F / this.field5966, 1.0F / this.field5966, 1.0F);
                     OpenGL.glMatrixMode(5888);
                     this.field5967.method4768(-677, this.field5978.field5605, this.field5971, this.field5978.field5614, this.field5978.field5610);
                     this.field5967.method4760(var5, this.field5962, 4, 0, -126);
                     OpenGL.glMatrixMode(5890);
                     OpenGL.glPopMatrix();
                     OpenGL.glMatrixMode(5888);
                  }

                  var18 = 107 / ((arg2 - -44) / 63);
                  return;
               }
            } else {
               var10000 = arg1[var7];
            }
         }
      } catch (RuntimeException var20) {
         throw class482.method3757(var20, field5979[6] + arg0 + ',' + (arg1 != null ? field5979[0] : field5979[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "c",
      descriptor = "(II)I",
      line = 260
   )
   public static final int method3075(int arg0, int arg1) {
      try {
         if (arg1 != 65535) {
            return 58;
         } else {
            ++field5972;
            return arg0 >>> 8;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5979[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "(II)V",
      line = 279
   )
   public final void method3076(int arg0, int arg1) {
      try {
         int var3 = 94 % ((-35 - arg1) / 53);
         this.field5960.method5250(arg0 * 4 + 3);
         ++field5961;
         this.field5960.method5245(-1);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field5979[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "(BI)V",
      line = 290
   )
   public final void method3077(byte arg0, int arg1) {
      try {
         ++field5977;
         this.field5974 = this.field5967.field9618.method5236(arg1 * 4, true);
         if (arg0 != -4) {
            method3075(75, -84);
         }

         this.field5960 = new Stream(this.field5974);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5979[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "b",
      descriptor = "(II)V",
      line = 305
   )
   public final void method3078(int arg0, int arg1) {
      try {
         ++field5975;
         this.field5960.method5253();
         class112 var3 = this.field5967.method4795(arg1 * 4, 35, false, this.field5974, 4);
         this.field5971 = new class436(var3, 5121, 4, 0);
         this.field5960 = null;
         this.field5974 = null;
         if (arg0 != -5) {
            this.method3076(-4, 61);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field5979[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "<init>",
      descriptor = "(Lg;IIIII)V",
      line = 320
   )
   public class375(class361 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field5978 = arg0;
         this.field5970 = arg1;
         this.field5968 = new int[this.field5978.field4383 * this.field5978.field4379];
         this.field5964 = arg5;
         this.field5967 = this.field5978.field5604;
         this.field5969 = arg4;
         this.field5965 = arg3;
         this.field5966 = (float)arg2;
         this.field5962 = new class463(this.field5967, 5123, (byte[])null, 1);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field5979[2] + (arg0 != null ? field5979[0] : field5979[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3079(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ji",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3080(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
