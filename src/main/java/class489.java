import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class489 extends class673 {
   @OriginalMember(
      owner = "client!vfa",
      name = "m",
      descriptor = "I"
   )
   public int field6815 = 0;
   @OriginalMember(
      owner = "client!vfa",
      name = "r",
      descriptor = "Laja;"
   )
   private class106 field6827;
   @OriginalMember(
      owner = "client!vfa",
      name = "G",
      descriptor = "[I"
   )
   private int[] field6833;
   @OriginalMember(
      owner = "client!vfa",
      name = "B",
      descriptor = "F"
   )
   public float field6828;
   @OriginalMember(
      owner = "client!vfa",
      name = "s",
      descriptor = "I"
   )
   public int field6819;
   @OriginalMember(
      owner = "client!vfa",
      name = "u",
      descriptor = "I"
   )
   public int field6831;
   @OriginalMember(
      owner = "client!vfa",
      name = "w",
      descriptor = "I"
   )
   public int field6812;
   @OriginalMember(
      owner = "client!vfa",
      name = "H",
      descriptor = "Lfm;"
   )
   private class281 field6830;
   @OriginalMember(
      owner = "client!vfa",
      name = "A",
      descriptor = "I"
   )
   public int field6829;
   @OriginalMember(
      owner = "client!vfa",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6834 = new String[]{method3717(method3716("faW2\u00158")), method3717(method3716("faW2\u00198")), method3717(method3716("faW2`yi_hb8")), method3717(method3716("k)\u00182!")), method3717(method3716("~rZp")), method3717(method3716("faW2\u00188")), method3717(method3716("faW2\u00148")), method3717(method3716("faW2\u001e8")), method3717(method3716("faW2\u001a8")), method3717(method3716("faW2\u001b8")), method3717(method3716("faW2\u001f8")), method3717(method3716("faW2\u001d8"))};
   @OriginalMember(
      owner = "client!vfa",
      name = "t",
      descriptor = "[I"
   )
   public static int[] field6820 = new int[3];
   @OriginalMember(
      owner = "client!vfa",
      name = "q",
      descriptor = "Lse;"
   )
   public static class6 field6816 = new class6(34, 8);
   @OriginalMember(
      owner = "client!vfa",
      name = "D",
      descriptor = "I"
   )
   public static int field6813;
   @OriginalMember(
      owner = "client!vfa",
      name = "F",
      descriptor = "I"
   )
   public static int field6814;
   @OriginalMember(
      owner = "client!vfa",
      name = "l",
      descriptor = "I"
   )
   public static int field6817;
   @OriginalMember(
      owner = "client!vfa",
      name = "z",
      descriptor = "I"
   )
   public static int field6818;
   @OriginalMember(
      owner = "client!vfa",
      name = "E",
      descriptor = "I"
   )
   public static int field6823;
   @OriginalMember(
      owner = "client!vfa",
      name = "x",
      descriptor = "I"
   )
   public static int field6824;
   @OriginalMember(
      owner = "client!vfa",
      name = "y",
      descriptor = "I"
   )
   public static int field6826;
   @OriginalMember(
      owner = "client!vfa",
      name = "p",
      descriptor = "I"
   )
   public static int field6832;
   @OriginalMember(
      owner = "client!vfa",
      name = "o",
      descriptor = "Lbc;"
   )
   private class11 field6821;
   @OriginalMember(
      owner = "client!vfa",
      name = "n",
      descriptor = "Let;"
   )
   public static class753 field6822;
   @OriginalMember(
      owner = "client!vfa",
      name = "I",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field6825;
   @OriginalMember(
      owner = "client!vfa",
      name = "v",
      descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   private NativeHeapBuffer field6811;

   @OriginalMember(
      owner = "client!vfa",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method3707(int arg0, int arg1) {
      try {
         this.field6825.method3004(arg1 * 4 + 3);
         if (arg0 != 23101) {
            this.field6811 = null;
         }

         ++field6817;
         this.field6825.method2993(-1);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6834[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "a",
      descriptor = "(IIIFI)V"
   )
   public final void method3708(int arg0, int arg1, int arg2, float arg3, int arg4) {
      boolean var6 = client.field1481;

      try {
         ++field6813;
         int var7 = 75 % ((-14 - arg1) / 60);
         if (~this.field6829 != 0) {
            class668 var8 = this.field6830.field6667.method911(this.field6829, -93);
            int var9 = var8.field9887 & 255;
            if (var9 != 0 && ~var8.field9911 != -5) {
               label109: {
                  int var10;
                  label96: {
                     if (~arg2 <= -1) {
                        if (arg2 <= 127) {
                           var10 = arg2 * 131586;
                           if (!var6) {
                              break label96;
                           }
                        }

                        var10 = 16777215;
                        if (!var6) {
                           break label96;
                        }
                     }

                     var10 = 0;
                  }

                  if (~var9 != -257) {
                     int var12 = 256 - var9;
                     arg0 = ((arg0 & 65280) * var12 + (65280 & var10) * var9 & 16711680) + (-16711936 & (arg0 & 16711935) * var12 + (var10 & 16711935) * var9) >> 8;
                     if (!var6) {
                        break label109;
                     }
                  }

                  arg0 = var10;
               }
            }

            int var13 = var8.field9891 & 255;
            if (var13 != 0) {
               var13 += 256;
               int var14 = (255 & arg0 >> 16) * var13;
               if (~var14 < -65536) {
                  var14 = 65535;
               }

               int var15 = (255 & arg0 >> 8) * var13;
               if (~var15 < -65536) {
                  var15 = 65535;
               }

               int var16 = (255 & arg0) * var13;
               if (var16 > 65535) {
                  var16 = 65535;
               }

               arg0 = ((var14 & -1778319616) << 8) - (-(var15 & 65280) - (var16 >> 8));
            }
         }

         this.field6825.method3004(arg4 * 4);
         if (arg3 != 1.0F) {
            int var19;
            int var20;
            int var21;
            label79: {
               int var17 = (16767287 & arg0) >> 16;
               int var18 = 255 & arg0 >> 8;
               var19 = 255 & arg0;
               var20 = (int)((float)var17 * arg3);
               var21 = (int)((float)var18 * arg3);
               if (var20 >= 0) {
                  if (var20 <= 255) {
                     break label79;
                  }

                  var20 = 255;
                  if (!var6) {
                     break label79;
                  }
               }

               var20 = 0;
            }

            int var22;
            label72: {
               var22 = (int)((float)var19 * arg3);
               if (~var21 <= -1) {
                  if (~var21 >= -256) {
                     break label72;
                  }

                  var21 = 255;
                  if (!var6) {
                     break label72;
                  }
               }

               var21 = 0;
            }

            label65: {
               if (~var22 <= -1) {
                  if (~var22 >= -256) {
                     break label65;
                  }

                  var22 = 255;
                  if (!var6) {
                     break label65;
                  }
               }

               var22 = 0;
            }

            arg0 = var20 << 16 | var21 << 8 | var22;
         }

         if (~this.field6830.field3867 != -1) {
            this.field6825.method2993((byte)(arg0 >> 16));
            this.field6825.method2993((byte)(arg0 >> 8));
            this.field6825.method2993((byte)arg0);
         } else {
            this.field6825.method2993((byte)arg0);
            this.field6825.method2993((byte)(arg0 >> 8));
            this.field6825.method2993((byte)(arg0 >> 16));
         }
      } catch (RuntimeException var24) {
         throw class93.method866(var24, field6834[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "a",
      descriptor = "([III)V"
   )
   public final void method3709(int[] arg0, int arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         ++field6824;
         class265 var5 = this.field6830.method2281(this.field6815 * 3, -29);
         Buffer var6 = var5.method1195(true, -4298);
         if (var6 != null) {
            Stream var7 = this.field6830.method2235(true, var6);
            if (arg1 < -39) {
               int var8;
               int var9;
               int var10;
               int var11;
               int var10000;
               class620 var26;
               label292: {
                  var8 = 0;
                  var9 = 32767;
                  var10 = -32768;
                  if (!Stream.method2990()) {
                     var11 = 0;
                     if (var4 || var11 < arg2) {
                        do {
                           int var12 = arg0[var11];
                           short[] var13 = this.field6827.field1380[var12];
                           int var14 = this.field6833[var12];
                           if (var14 != 0) {
                              if (var13 == null) {
                                 ++var11;
                              } else {
                                 int var15 = 0;
                                 int var16 = 0;
                                 if (!var4 && var13.length <= var16) {
                                    ++var11;
                                 } else {
                                    do {
                                       if (~(var14 & 1 << var15++) == -1) {
                                          var16 += 3;
                                          if (!var4) {
                                             continue;
                                          }
                                       }

                                       ++var8;
                                       int var17 = 0;
                                       if (var4 || var17 < 3) {
                                          do {
                                             int var18 = var13[var16++] & 65535;
                                             var7.method2992(var18);
                                             if (var18 < var9) {
                                                var9 = var18;
                                             }

                                             if (~var10 > ~var18) {
                                                var10 = var18;
                                             }

                                             ++var17;
                                          } while(var17 < 3);
                                       }
                                    } while(var13.length > var16);

                                    ++var11;
                                 }
                              }
                           } else {
                              ++var11;
                           }
                        } while(var11 < arg2);
                     }

                     if (!var4) {
                        var7.method2995();
                        var10000 = var5.method1194((byte)111);
                        if (!var4) {
                           if (var10000 != 0 && ~var8 < -1) {
                              this.field6830.method2236(this.field6829, (8 & this.field6827.field1389) != 0, true, (this.field6827.field1389 & 7) != 0);
                              if (this.field6830.field3782) {
                                 this.field6830.method439(Integer.MAX_VALUE, this.field6819, this.field6812, this.field6831);
                              }

                              var26 = this.field6830.method2264((byte)95);
                              var26.method4594(1.0F, 1.0F / this.field6828, 1.0F / this.field6828, (byte)-119);
                              this.field6830.method2223(false, class152.field1892);
                              this.field6830.method1375(this.field6821, true, 1);
                              this.field6830.method1402(1, this.field6827.field1409);
                              this.field6830.method1419(var9, 0, 104, class629.field9286, var8, var10 + 1 - var9, var5);
                              this.field6830.method2282(false);
                              return;
                           }

                           return;
                        }
                        break label292;
                     }
                  }

                  var11 = 0;
                  if (var4) {
                     var10000 = arg0[var11];
                  } else if (arg2 <= var11) {
                     var7.method2995();
                     var10000 = var5.method1194((byte)111);
                     if (!var4) {
                        if (var10000 != 0 && ~var8 < -1) {
                           this.field6830.method2236(this.field6829, (8 & this.field6827.field1389) != 0, true, (this.field6827.field1389 & 7) != 0);
                           if (this.field6830.field3782) {
                              this.field6830.method439(Integer.MAX_VALUE, this.field6819, this.field6812, this.field6831);
                           }

                           var26 = this.field6830.method2264((byte)95);
                           var26.method4594(1.0F, 1.0F / this.field6828, 1.0F / this.field6828, (byte)-119);
                           this.field6830.method2223(false, class152.field1892);
                           this.field6830.method1375(this.field6821, true, 1);
                           this.field6830.method1402(1, this.field6827.field1409);
                           this.field6830.method1419(var9, 0, 104, class629.field9286, var8, var10 + 1 - var9, var5);
                           this.field6830.method2282(false);
                           return;
                        }

                        return;
                     }
                  } else {
                     var10000 = arg0[var11];
                  }
               }

               while(true) {
                  int var19 = var10000;
                  short[] var20 = this.field6827.field1380[var19];
                  int var21 = this.field6833[var19];
                  if (~var21 != -1) {
                     if (var20 == null) {
                        ++var11;
                     } else {
                        int var22 = 0;
                        int var23 = 0;
                        if (!var4 && var23 >= var20.length) {
                           ++var11;
                        } else {
                           while(true) {
                              label279: {
                                 int var24;
                                 int var25;
                                 if (~(var21 & 1 << var22++) == -1) {
                                    var23 += 3;
                                    if (!var4) {
                                       break label279;
                                    }

                                    ++var8;
                                    var24 = 0;
                                    if (var4) {
                                       var25 = 65535 & var20[var23++];
                                       if (var10 < var25) {
                                          var10 = var25;
                                       }

                                       if (~var25 > ~var9) {
                                          var9 = var25;
                                       }

                                       var7.method3002(var25);
                                       ++var24;
                                    }
                                 } else {
                                    ++var8;
                                    var24 = 0;
                                    if (var4) {
                                       var25 = 65535 & var20[var23++];
                                       if (var10 < var25) {
                                          var10 = var25;
                                       }

                                       if (~var25 > ~var9) {
                                          var9 = var25;
                                       }

                                       var7.method3002(var25);
                                       ++var24;
                                    }
                                 }

                                 while(~var24 > -4) {
                                    var25 = 65535 & var20[var23++];
                                    if (var10 < var25) {
                                       var10 = var25;
                                    }

                                    if (~var25 > ~var9) {
                                       var9 = var25;
                                    }

                                    var7.method3002(var25);
                                    ++var24;
                                 }
                              }

                              if (var23 >= var20.length) {
                                 ++var11;
                                 break;
                              }
                           }
                        }
                     }
                  } else {
                     ++var11;
                  }

                  if (arg2 <= var11) {
                     var7.method2995();
                     var10000 = var5.method1194((byte)111);
                     if (!var4) {
                        if (var10000 != 0 && ~var8 < -1) {
                           this.field6830.method2236(this.field6829, (8 & this.field6827.field1389) != 0, true, (this.field6827.field1389 & 7) != 0);
                           if (this.field6830.field3782) {
                              this.field6830.method439(Integer.MAX_VALUE, this.field6819, this.field6812, this.field6831);
                           }

                           var26 = this.field6830.method2264((byte)95);
                           var26.method4594(1.0F, 1.0F / this.field6828, 1.0F / this.field6828, (byte)-119);
                           this.field6830.method2223(false, class152.field1892);
                           this.field6830.method1375(this.field6821, true, 1);
                           this.field6830.method1402(1, this.field6827.field1409);
                           this.field6830.method1419(var9, 0, 104, class629.field9286, var8, var10 + 1 - var9, var5);
                           this.field6830.method2282(false);
                           return;
                        }

                        return;
                     }
                  } else {
                     var10000 = arg0[var11];
                  }
               }
            }
         }
      } catch (RuntimeException var28) {
         throw class93.method866(var28, field6834[10] + (arg0 != null ? field6834[3] : field6834[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "a",
      descriptor = "(BI)Z"
   )
   public static final boolean method3710(byte arg0, int arg1) {
      try {
         if (arg0 != -27) {
            return true;
         } else {
            ++field6823;
            return ~arg1 <= -13 && ~arg1 >= -18;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6834[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method3711(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field6826;
         this.field6833[this.field6827.field5769 * arg3 + arg1] = class2.method15(this.field6833[this.field6827.field5769 * arg3 + arg1], 1 << arg2);
         int var5 = -102 % ((23 - arg0) / 39);
         ++this.field6815;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field6834[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3712(byte arg0) {
      boolean var1 = client.field1481;

      try {
         int var2 = 0;
         if (var1) {
            class458.field6304[var2] = null;
            ++var2;
         }

         while(true) {
            while(~var2 > -101) {
               class458.field6304[var2] = null;
               ++var2;
            }

            ++field6832;
            if (!var1) {
               if (arg0 != -100) {
                  return;
               }

               class334.field4590 = 0;
               return;
            }

            ++var2;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6834[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method3713(int arg0, int arg1) {
      try {
         this.field6825.method2995();
         ++field6818;
         this.field6821 = this.field6830.method1398(false, (byte)98);
         this.field6821.method103(arg0 * 4, this.field6811, 4, (byte)-101);
         if (arg1 == 65535) {
            this.field6825 = null;
            this.field6811 = null;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6834[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "c",
      descriptor = "(II)V"
   )
   public final void method3714(int arg0, int arg1) {
      try {
         ++field6814;
         this.field6811 = this.field6830.method2280((byte)118, arg0 * arg1, true);
         this.field6825 = new Stream(this.field6811, 0, arg0 * 4);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6834[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3715(int arg0) {
      try {
         if (arg0 != -23583) {
            method3715(-73);
         }

         field6822 = null;
         field6816 = null;
         field6820 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6834[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "<init>",
      descriptor = "(Laja;IIIII)V"
   )
   public class489(class106 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field6827 = arg0;
         this.field6833 = new int[this.field6827.field5769 * this.field6827.field5767];
         this.field6828 = (float)arg2;
         this.field6819 = arg3;
         this.field6831 = arg5;
         this.field6812 = arg4;
         this.field6830 = this.field6827.field1386;
         this.field6829 = arg1;
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field6834[2] + (arg0 != null ? field6834[3] : field6834[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3716(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3717(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
