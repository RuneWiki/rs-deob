import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class84 extends class294 {
   @OriginalMember(
      owner = "client!wd",
      name = "B",
      descriptor = "I"
   )
   public int field1202 = 0;
   @OriginalMember(
      owner = "client!wd",
      name = "G",
      descriptor = "Lnd;"
   )
   private class121 field1217;
   @OriginalMember(
      owner = "client!wd",
      name = "s",
      descriptor = "I"
   )
   public int field1215;
   @OriginalMember(
      owner = "client!wd",
      name = "A",
      descriptor = "I"
   )
   public int field1206;
   @OriginalMember(
      owner = "client!wd",
      name = "w",
      descriptor = "Lmu;"
   )
   private class258 field1221;
   @OriginalMember(
      owner = "client!wd",
      name = "r",
      descriptor = "F"
   )
   public float field1209;
   @OriginalMember(
      owner = "client!wd",
      name = "n",
      descriptor = "I"
   )
   public int field1210;
   @OriginalMember(
      owner = "client!wd",
      name = "C",
      descriptor = "I"
   )
   public int field1203;
   @OriginalMember(
      owner = "client!wd",
      name = "y",
      descriptor = "[I"
   )
   private int[] field1207;
   @OriginalMember(
      owner = "client!wd",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1225 = new String[]{method823(method822("l\u000bM\u001a\u000f")), method823(method822("l\u000bM\u001b\u000f")), method823(method822("l\u000bM\u0012\u000f")), method823(method822("u\u001a\u000f?")), method823(method822("l\u000bM\u0017\u000f")), method823(method822("`AM}Z")), method823(method822("l\u000bM\u0016\u000f")), method823(method822("l\u000bM\u0011\u000f")), method823(method822("l\u000bM\u0014\u000f")), method823(method822("l\u000bM\u0015\u000f")), method823(method822("l\u000bM\u0010\u000f")), method823(method822("l\u000bMoNu\u0006\u0017m\u000f"))};
   @OriginalMember(
      owner = "client!wd",
      name = "x",
      descriptor = "I"
   )
   public static int field1212 = 100;
   @OriginalMember(
      owner = "client!wd",
      name = "v",
      descriptor = "I"
   )
   public static int field1223 = 0;
   @OriginalMember(
      owner = "client!wd",
      name = "t",
      descriptor = "I"
   )
   public static int field1205;
   @OriginalMember(
      owner = "client!wd",
      name = "p",
      descriptor = "I"
   )
   public static int field1208;
   @OriginalMember(
      owner = "client!wd",
      name = "E",
      descriptor = "I"
   )
   public static int field1211;
   @OriginalMember(
      owner = "client!wd",
      name = "q",
      descriptor = "I"
   )
   public static int field1213;
   @OriginalMember(
      owner = "client!wd",
      name = "m",
      descriptor = "I"
   )
   public static int field1218;
   @OriginalMember(
      owner = "client!wd",
      name = "F",
      descriptor = "I"
   )
   public static int field1219;
   @OriginalMember(
      owner = "client!wd",
      name = "H",
      descriptor = "I"
   )
   public static int field1220;
   @OriginalMember(
      owner = "client!wd",
      name = "u",
      descriptor = "I"
   )
   public static int field1224;
   @OriginalMember(
      owner = "client!wd",
      name = "o",
      descriptor = "Lgfa;"
   )
   private class631 field1216;
   @OriginalMember(
      owner = "client!wd",
      name = "D",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field1214;
   @OriginalMember(
      owner = "client!wd",
      name = "I",
      descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   private NativeHeapBuffer field1204;
   @OriginalMember(
      owner = "client!wd",
      name = "z",
      descriptor = "[I"
   )
   public static int[] field1222;

   @OriginalMember(
      owner = "client!wd",
      name = "a",
      descriptor = "(IB[JI[I)V",
      line = 5
   )
   public static final void method813(int arg0, byte arg1, long[] arg2, int arg3, int[] arg4) {
      boolean var5 = client.field1786;

      try {
         if (arg3 > arg0) {
            int var6 = (arg0 + arg3) / 2;
            int var7 = arg0;
            long var8 = arg2[var6];
            arg2[var6] = arg2[arg3];
            arg2[arg3] = var8;
            int var10 = arg4[var6];
            arg4[var6] = arg4[arg3];
            arg4[arg3] = var10;
            int var11 = ~var8 == Long.MIN_VALUE ? 0 : 1;
            int var12 = arg0;
            long var13;
            int var15;
            if (var5) {
               if (arg2[arg0] < (long)(var11 & arg0) + var8) {
                  var13 = arg2[arg0];
                  arg2[arg0] = arg2[arg0];
                  arg2[arg0] = var13;
                  var15 = arg4[arg0];
                  arg4[arg0] = arg4[arg0];
                  var7 = arg0 + 1;
                  arg4[arg0] = var15;
               }

               var12 = arg0 + 1;
            }

            while(true) {
               int var10000;
               if (arg3 <= var12) {
                  arg2[arg3] = arg2[var7];
                  arg2[var7] = var8;
                  arg4[arg3] = arg4[var7];
                  arg4[var7] = var10;
                  method813(arg0, (byte)-98, arg2, var7 - 1, arg4);
                  var10000 = var7 + 1;
                  if (!var5) {
                     method813(var10000, (byte)-37, arg2, arg3, arg4);
                     break;
                  }
               } else {
                  long var19;
                  var10000 = (var19 = arg2[var12] - ((long)(var11 & var12) + var8)) == 0L ? 0 : (var19 < 0L ? -1 : 1);
               }

               if (var10000 < 0) {
                  var13 = arg2[var12];
                  arg2[var12] = arg2[var7];
                  arg2[var7] = var13;
                  var15 = arg4[var12];
                  arg4[var12] = arg4[var7];
                  arg4[var7++] = var15;
               }

               ++var12;
            }
         }

         ++field1208;
         int var16 = 61 / ((73 - arg1) / 47);
      } catch (RuntimeException var18) {
         throw class482.method3757(var18, field1225[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1225[5] : field1225[3]) + ',' + arg3 + ',' + (arg4 != null ? field1225[5] : field1225[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "b",
      descriptor = "(II)I",
      line = 62
   )
   public static final int method814(int arg0, int arg1) {
      try {
         int var4 = (arg1 >>> 1 & 1431655765) + (arg1 & 1431655765);
         ++field1211;
         if (arg0 != -1) {
            return 93;
         } else {
            var4 = (var4 >>> 2 & 858993459) + (858993459 & var4);
            var4 = (var4 >>> 4) + var4 & 252645135;
            var4 += var4 >>> 8;
            var4 += var4 >>> 16;
            return 255 & var4;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1225[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "<init>",
      descriptor = "(Lnd;IIIII)V",
      line = 440
   )
   public class84(class121 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field1217 = arg0;
         this.field1215 = arg3;
         this.field1206 = arg4;
         this.field1221 = this.field1217.field1730;
         this.field1209 = (float)arg2;
         this.field1210 = arg5;
         this.field1203 = arg1;
         this.field1207 = new int[this.field1217.field4383 * this.field1217.field4379];
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field1225[11] + (arg0 != null ? field1225[5] : field1225[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "a",
      descriptor = "(II)V",
      line = 82
   )
   public final void method815(int arg0, int arg1) {
      try {
         this.field1214.method5253();
         ++field1219;
         this.field1216 = this.field1221.method1472(false, 117);
         this.field1216.method1536(this.field1204, 6701, arg0 * arg1, 4);
         this.field1214 = null;
         this.field1204 = null;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1225[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "a",
      descriptor = "(I)V",
      line = 94
   )
   public static void method816(int arg0) {
      try {
         field1222 = null;
         if (arg0 != -436142336) {
            field1222 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1225[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "c",
      descriptor = "(II)V",
      line = 104
   )
   public final void method817(int arg0, int arg1) {
      try {
         if (arg1 == -22630) {
            ++field1224;
            this.field1204 = this.field1221.method2206(true, (byte)-37, arg0 * 4);
            this.field1214 = new Stream(this.field1204, 0, arg0 * 4);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1225[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "b",
      descriptor = "(IIII)V",
      line = 121
   )
   public final void method818(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field1205;
         this.field1207[this.field1217.field4383 * arg0 + arg2] = class119.method1087(this.field1207[this.field1217.field4383 * arg0 + arg2], 1 << arg1);
         ++this.field1202;
         if (arg3 != 65535) {
            field1223 = -112;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field1225[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "d",
      descriptor = "(II)V",
      line = 137
   )
   public final void method819(int arg0, int arg1) {
      try {
         this.field1214.method5250(arg1 * 4 + 3);
         ++field1218;
         if (arg0 <= 64) {
            field1212 = 112;
         }

         this.field1214.method5245(-1);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1225[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "a",
      descriptor = "(I[II)V",
      line = 155
   )
   public final void method820(int arg0, int[] arg1, int arg2) {
      boolean var4 = client.field1786;

      try {
         if (arg0 == 858993459) {
            ++field1220;
            class800 var5 = this.field1221.method2236(this.field1202 * 3, (byte)-66);
            Buffer var6 = var5.method2519(true, 125);
            if (var6 != null) {
               Stream var7;
               int var8;
               int var9;
               int var10;
               int var11;
               int var10000;
               class504 var26;
               label286: {
                  var7 = this.field1221.method2245((byte)73, var6);
                  var8 = 0;
                  var9 = 32767;
                  var10 = -32768;
                  if (Stream.method5249()) {
                     var11 = 0;
                     if (var4 || var11 < arg2) {
                        do {
                           int var12 = arg1[var11];
                           int var13 = this.field1207[var12];
                           short[] var14 = this.field1217.field1718[var12];
                           if (var13 != 0) {
                              if (var14 == null) {
                                 ++var11;
                              } else {
                                 int var15 = 0;
                                 int var16 = 0;
                                 if (!var4 && var16 >= var14.length) {
                                    ++var11;
                                 } else {
                                    do {
                                       if (~(var13 & 1 << var15++) == -1) {
                                          var16 += 3;
                                       } else {
                                          ++var8;
                                          int var17 = 0;
                                          if (!var4 && ~var17 <= -4) {
                                             if (var4) {
                                                var16 += 3;
                                             }
                                          } else {
                                             do {
                                                int var18 = 65535 & var14[var16++];
                                                if (var18 > var10) {
                                                   var10 = var18;
                                                }

                                                if (~var18 > ~var9) {
                                                   var9 = var18;
                                                }

                                                var7.method5242(var18);
                                                ++var17;
                                             } while(~var17 > -4);

                                             if (var4) {
                                                var16 += 3;
                                             }
                                          }
                                       }
                                    } while(var16 < var14.length);

                                    ++var11;
                                 }
                              }
                           } else {
                              ++var11;
                           }
                        } while(var11 < arg2);
                     }

                     if (!var4) {
                        var7.method5253();
                        var10000 = var5.method2517(-21369);
                        if (!var4) {
                           if (var10000 != 0 && var8 > 0) {
                              this.field1221.method2191(0, this.field1203, ~(this.field1217.field1727 & 7) != -1, (8 & this.field1217.field1727) != 0);
                              if (this.field1221.field4171) {
                                 this.field1221.method580(Integer.MAX_VALUE, this.field1215, this.field1206, this.field1210);
                              }

                              var26 = this.field1221.method2188(arg0 + -858993459);
                              var26.method3920(1.0F / this.field1209, 1.0F, 0, 1.0F / this.field1209);
                              this.field1221.method2247(11901, class655.field9787);
                              this.field1221.method1507(this.field1216, 1, (byte)15);
                              this.field1221.method1502(this.field1217.field1748, 116);
                              this.field1221.method1493((byte)-103, var8, var9, 0, var5, class331.field5019, -var9 + var10 + 1);
                              this.field1221.method2233((byte)-73);
                              return;
                           }

                           return;
                        }
                        break label286;
                     }
                  }

                  var11 = 0;
                  if (var4) {
                     var10000 = arg1[var11];
                  } else if (~arg2 >= ~var11) {
                     var7.method5253();
                     var10000 = var5.method2517(-21369);
                     if (!var4) {
                        if (var10000 != 0 && var8 > 0) {
                           this.field1221.method2191(0, this.field1203, ~(this.field1217.field1727 & 7) != -1, (8 & this.field1217.field1727) != 0);
                           if (this.field1221.field4171) {
                              this.field1221.method580(Integer.MAX_VALUE, this.field1215, this.field1206, this.field1210);
                           }

                           var26 = this.field1221.method2188(arg0 + -858993459);
                           var26.method3920(1.0F / this.field1209, 1.0F, 0, 1.0F / this.field1209);
                           this.field1221.method2247(11901, class655.field9787);
                           this.field1221.method1507(this.field1216, 1, (byte)15);
                           this.field1221.method1502(this.field1217.field1748, 116);
                           this.field1221.method1493((byte)-103, var8, var9, 0, var5, class331.field5019, -var9 + var10 + 1);
                           this.field1221.method2233((byte)-73);
                           return;
                        }

                        return;
                     }
                  } else {
                     var10000 = arg1[var11];
                  }
               }

               while(true) {
                  int var19 = var10000;
                  int var20 = this.field1207[var19];
                  short[] var21 = this.field1217.field1718[var19];
                  if (var20 != 0) {
                     if (var21 == null) {
                        ++var11;
                     } else {
                        int var22 = 0;
                        int var23 = 0;
                        if (!var4 && ~var21.length >= ~var23) {
                           ++var11;
                        } else {
                           while(true) {
                              if ((1 << var22++ & var20) == 0) {
                                 var23 += 3;
                              } else {
                                 int var24 = 0;
                                 int var25;
                                 if (var4) {
                                    var25 = 65535 & var21[var23++];
                                    if (~var9 < ~var25) {
                                       var9 = var25;
                                    }

                                    if (~var10 > ~var25) {
                                       var10 = var25;
                                    }

                                    var7.method5251(var25);
                                    ++var24;
                                 }

                                 while(~var24 > -4) {
                                    var25 = 65535 & var21[var23++];
                                    if (~var9 < ~var25) {
                                       var9 = var25;
                                    }

                                    if (~var10 > ~var25) {
                                       var10 = var25;
                                    }

                                    var7.method5251(var25);
                                    ++var24;
                                 }

                                 ++var8;
                                 if (var4) {
                                    var23 += 3;
                                 }
                              }

                              if (~var21.length >= ~var23) {
                                 ++var11;
                                 break;
                              }
                           }
                        }
                     }
                  } else {
                     ++var11;
                  }

                  if (~arg2 >= ~var11) {
                     var7.method5253();
                     var10000 = var5.method2517(-21369);
                     if (!var4) {
                        if (var10000 != 0 && var8 > 0) {
                           this.field1221.method2191(0, this.field1203, ~(this.field1217.field1727 & 7) != -1, (8 & this.field1217.field1727) != 0);
                           if (this.field1221.field4171) {
                              this.field1221.method580(Integer.MAX_VALUE, this.field1215, this.field1206, this.field1210);
                           }

                           var26 = this.field1221.method2188(arg0 + -858993459);
                           var26.method3920(1.0F / this.field1209, 1.0F, 0, 1.0F / this.field1209);
                           this.field1221.method2247(11901, class655.field9787);
                           this.field1221.method1507(this.field1216, 1, (byte)15);
                           this.field1221.method1502(this.field1217.field1748, 116);
                           this.field1221.method1493((byte)-103, var8, var9, 0, var5, class331.field5019, -var9 + var10 + 1);
                           this.field1221.method2233((byte)-73);
                           return;
                        }

                        return;
                     }
                  } else {
                     var10000 = arg1[var11];
                  }
               }
            }
         }
      } catch (RuntimeException var28) {
         throw class482.method3757(var28, field1225[8] + arg0 + ',' + (arg1 != null ? field1225[5] : field1225[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "a",
      descriptor = "(FIIIB)V",
      line = 311
   )
   public final void method821(float arg0, int arg1, int arg2, int arg3, byte arg4) {
      boolean var6 = client.field1786;

      try {
         ++field1213;
         if (arg4 < -7) {
            if (this.field1203 != -1) {
               class453 var7 = this.field1221.field8891.method1373(this.field1203, (byte)-54);
               int var8 = var7.field6930 & 255;
               if (~var8 != -1 && ~var7.field6924 != -5) {
                  label111: {
                     int var9;
                     label96: {
                        if (~arg3 <= -1) {
                           if (~arg3 < -128) {
                              var9 = 16777215;
                              if (!var6) {
                                 break label96;
                              }
                           }

                           var9 = arg3 * 131586;
                           if (!var6) {
                              break label96;
                           }
                        }

                        var9 = 0;
                     }

                     if (var8 == 256) {
                        arg1 = var9;
                        if (!var6) {
                           break label111;
                        }
                     }

                     int var11 = -var8 + 256;
                     arg1 = ((65280 & var9) * var8 - -((arg1 & 65280) * var11) & 16711680) + ((arg1 & 16711935) * var11 + (16711935 & var9) * var8 & -16711936) >> 8;
                  }
               }

               int var12 = var7.field6935 & 255;
               if (~var12 != -1) {
                  var12 += 256;
                  int var13 = ((arg1 & 16711680) >> 16) * var12;
                  if (~var13 < -65536) {
                     var13 = 65535;
                  }

                  int var14 = ((65280 & arg1) >> 8) * var12;
                  if (~var14 < -65536) {
                     var14 = 65535;
                  }

                  int var15 = (arg1 & 255) * var12;
                  if (~var15 < -65536) {
                     var15 = 65535;
                  }

                  arg1 = (var15 >> 8) + ((-436142336 & var13) << 8) + (65280 & var14);
               }
            }

            if (arg0 != 1.0F) {
               int var17;
               int var18;
               int var19;
               label79: {
                  int var16 = (16764799 & arg1) >> 16;
                  var17 = arg1 >> 8 & 255;
                  var18 = arg1 & 255;
                  var19 = (int)((float)var16 * arg0);
                  if (var19 < 0) {
                     var19 = 0;
                     if (!var6) {
                        break label79;
                     }
                  }

                  if (var19 > 255) {
                     var19 = 255;
                  }
               }

               int var20;
               label74: {
                  var20 = (int)((float)var17 * arg0);
                  if (var20 < 0) {
                     var20 = 0;
                     if (!var6) {
                        break label74;
                     }
                  }

                  if (~var20 < -256) {
                     var20 = 255;
                  }
               }

               int var21;
               label69: {
                  var21 = (int)((float)var18 * arg0);
                  if (~var21 > -1) {
                     var21 = 0;
                     if (!var6) {
                        break label69;
                     }
                  }

                  if (var21 > 255) {
                     var21 = 255;
                  }
               }

               arg1 = var19 << 16 | var20 << 8 | var21;
            }

            this.field1214.method5250(arg2 * 4);
            if (~this.field1221.field4192 != -1) {
               this.field1214.method5245((byte)(arg1 >> 16));
               this.field1214.method5245((byte)(arg1 >> 8));
               this.field1214.method5245((byte)arg1);
            } else {
               this.field1214.method5245((byte)arg1);
               this.field1214.method5245((byte)(arg1 >> 8));
               this.field1214.method5245((byte)(arg1 >> 16));
            }
         }
      } catch (RuntimeException var23) {
         throw class482.method3757(var23, field1225[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method822(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method823(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 27;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
