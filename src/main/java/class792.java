import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class792 extends class347 {
   @OriginalMember(
      owner = "client!ms",
      name = "B",
      descriptor = "I"
   )
   public int field11526 = 0;
   @OriginalMember(
      owner = "client!ms",
      name = "z",
      descriptor = "Lvda;"
   )
   private class192 field11528;
   @OriginalMember(
      owner = "client!ms",
      name = "y",
      descriptor = "F"
   )
   public float field11523;
   @OriginalMember(
      owner = "client!ms",
      name = "m",
      descriptor = "I"
   )
   public int field11508;
   @OriginalMember(
      owner = "client!ms",
      name = "q",
      descriptor = "Ldh;"
   )
   private class338 field11510;
   @OriginalMember(
      owner = "client!ms",
      name = "s",
      descriptor = "[I"
   )
   private int[] field11524;
   @OriginalMember(
      owner = "client!ms",
      name = "k",
      descriptor = "I"
   )
   public int field11518;
   @OriginalMember(
      owner = "client!ms",
      name = "x",
      descriptor = "I"
   )
   public int field11516;
   @OriginalMember(
      owner = "client!ms",
      name = "r",
      descriptor = "I"
   )
   public int field11520;
   @OriginalMember(
      owner = "client!ms",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11529 = new String[]{method5693(method5692("-\u001es@\u000f")), method5693(method5692(".\u00181o")), method5693(method5692(";Cs-Z")), method5693(method5692("-\u001es?N.\u0004)=\u000f")), method5693(method5692("-\u001esF\u000f")), method5693(method5692("-\u001esB\u000f")), method5693(method5692("-\u001esA\u000f")), method5693(method5692("-\u001esG\u000f")), method5693(method5692("-\u001esE\u000f")), method5693(method5692("-\u001esD\u000f"))};
   @OriginalMember(
      owner = "client!ms",
      name = "w",
      descriptor = "Z"
   )
   public static boolean field11511 = false;
   @OriginalMember(
      owner = "client!ms",
      name = "j",
      descriptor = "Lma;"
   )
   public static class14 field11509 = new class14();
   @OriginalMember(
      owner = "client!ms",
      name = "C",
      descriptor = "I"
   )
   public static int field11512;
   @OriginalMember(
      owner = "client!ms",
      name = "i",
      descriptor = "I"
   )
   public static int field11513;
   @OriginalMember(
      owner = "client!ms",
      name = "v",
      descriptor = "I"
   )
   public static int field11514;
   @OriginalMember(
      owner = "client!ms",
      name = "l",
      descriptor = "I"
   )
   public static int field11515;
   @OriginalMember(
      owner = "client!ms",
      name = "u",
      descriptor = "I"
   )
   public static int field11519;
   @OriginalMember(
      owner = "client!ms",
      name = "p",
      descriptor = "I"
   )
   public static int field11522;
   @OriginalMember(
      owner = "client!ms",
      name = "n",
      descriptor = "Lgp;"
   )
   private class53 field11527;
   @OriginalMember(
      owner = "client!ms",
      name = "A",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field11525;
   @OriginalMember(
      owner = "client!ms",
      name = "o",
      descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   private NativeHeapBuffer field11521;
   @OriginalMember(
      owner = "client!ms",
      name = "t",
      descriptor = "[S"
   )
   public static short[] field11517;

   @OriginalMember(
      owner = "client!ms",
      name = "a",
      descriptor = "(BI)V",
      line = 8
   )
   public final void method5685(byte arg0, int arg1) {
      try {
         ++field11514;
         int var3 = 31 % ((-11 - arg0) / 48);
         this.field11525.method5096(arg1 * 4 + 3);
         this.field11525.method5095(-1);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field11529[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ms",
      name = "a",
      descriptor = "(I[IB)V",
      line = 24
   )
   public final void method5686(int arg0, int[] arg1, byte arg2) {
      int var4 = client.field4530;

      try {
         ++field11522;
         class215 var5 = this.field11510.method2582(arg2 ^ 88, this.field11526 * 3);
         Buffer var6 = var5.method1625(true, true);
         if (var6 != null) {
            Stream var7;
            int var8;
            int var9;
            int var10;
            int var11;
            int var10000;
            class495 var26;
            label295: {
               var7 = this.field11510.method2593(var6, 0);
               var8 = 0;
               var9 = 32767;
               var10 = -32768;
               if (!Stream.method5098()) {
                  var11 = 0;
                  if (var4 != 0 || arg0 > var11) {
                     do {
                        int var12 = arg1[var11];
                        int var13 = this.field11524[var12];
                        short[] var14 = this.field11528.field2383[var12];
                        if (var13 != 0) {
                           if (var14 == null) {
                              ++var11;
                           } else {
                              int var15 = 0;
                              int var16 = 0;
                              if (var4 == 0 && var16 >= var14.length) {
                                 ++var11;
                              } else {
                                 do {
                                    if ((1 << var15++ & var13) == 0) {
                                       var16 += 3;
                                       if (var4 == 0) {
                                          continue;
                                       }
                                    }

                                    int var17 = 0;
                                    if (var4 == 0 && ~var17 <= -4) {
                                       ++var8;
                                    } else {
                                       do {
                                          int var18 = 65535 & var14[var16++];
                                          if (~var9 < ~var18) {
                                             var9 = var18;
                                          }

                                          if (var10 < var18) {
                                             var10 = var18;
                                          }

                                          var7.method5088(var18);
                                          ++var17;
                                       } while(~var17 > -4);

                                       ++var8;
                                    }
                                 } while(var16 < var14.length);

                                 ++var11;
                              }
                           }
                        } else {
                           ++var11;
                        }
                     } while(arg0 > var11);
                  }

                  if (var4 == 0) {
                     var10000 = arg2;
                     if (var4 == 0) {
                        if (arg2 != 88) {
                           return;
                        }

                        var7.method5085();
                        if (var5.method1624(-7695) && var8 > 0) {
                           this.field11510.method2571((8 & this.field11528.field2398) != 0, this.field11516, (7 & this.field11528.field2398) != 0, (byte)117);
                           if (this.field11510.field5029) {
                              this.field11510.method641(Integer.MAX_VALUE, this.field11520, this.field11518, this.field11508);
                           }

                           var26 = this.field11510.method2616(arg2 ^ -36);
                           var26.method3675(1.0F / this.field11523, 1.0F, true, 1.0F / this.field11523);
                           this.field11510.method2614(class66.field817, 6);
                           this.field11510.method2659(121, this.field11527, 1);
                           this.field11510.method2642(this.field11528.field2418, (byte)118);
                           this.field11510.method2628(var10 + 1 - var9, 0, var9, arg2 + -72, class260.field3546, var8, var5);
                           this.field11510.method2652(arg2 ^ -13370);
                           return;
                        }

                        return;
                     }
                     break label295;
                  }
               }

               var11 = 0;
               if (var4 != 0) {
                  var10000 = arg1[var11];
               } else if (arg0 <= var11) {
                  var10000 = arg2;
                  if (var4 == 0) {
                     if (arg2 != 88) {
                        return;
                     }

                     var7.method5085();
                     if (var5.method1624(-7695) && var8 > 0) {
                        this.field11510.method2571((8 & this.field11528.field2398) != 0, this.field11516, (7 & this.field11528.field2398) != 0, (byte)117);
                        if (this.field11510.field5029) {
                           this.field11510.method641(Integer.MAX_VALUE, this.field11520, this.field11518, this.field11508);
                        }

                        var26 = this.field11510.method2616(arg2 ^ -36);
                        var26.method3675(1.0F / this.field11523, 1.0F, true, 1.0F / this.field11523);
                        this.field11510.method2614(class66.field817, 6);
                        this.field11510.method2659(121, this.field11527, 1);
                        this.field11510.method2642(this.field11528.field2418, (byte)118);
                        this.field11510.method2628(var10 + 1 - var9, 0, var9, arg2 + -72, class260.field3546, var8, var5);
                        this.field11510.method2652(arg2 ^ -13370);
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
               short[] var20 = this.field11528.field2383[var19];
               int var21 = this.field11524[var19];
               if (var21 != 0) {
                  if (var20 == null) {
                     ++var11;
                  } else {
                     int var22 = 0;
                     int var23 = 0;
                     if (var4 == 0 && ~var20.length >= ~var23) {
                        ++var11;
                     } else {
                        while(true) {
                           if (~(1 << var22++ & var21) == -1) {
                              var23 += 3;
                           } else {
                              int var24 = 0;
                              int var25;
                              if (var4 != 0) {
                                 var25 = 65535 & var20[var23++];
                                 if (~var9 < ~var25) {
                                    var9 = var25;
                                 }

                                 var7.method5087(var25);
                                 if (var10 < var25) {
                                    var10 = var25;
                                 }

                                 ++var24;
                              }

                              while(var24 < 3) {
                                 var25 = 65535 & var20[var23++];
                                 if (~var9 < ~var25) {
                                    var9 = var25;
                                 }

                                 var7.method5087(var25);
                                 if (var10 < var25) {
                                    var10 = var25;
                                 }

                                 ++var24;
                              }

                              ++var8;
                              if (var4 != 0) {
                                 var23 += 3;
                              }
                           }

                           if (~var20.length >= ~var23) {
                              ++var11;
                              break;
                           }
                        }
                     }
                  }
               } else {
                  ++var11;
               }

               if (arg0 <= var11) {
                  var10000 = arg2;
                  if (var4 == 0) {
                     if (arg2 != 88) {
                        return;
                     }

                     var7.method5085();
                     if (var5.method1624(-7695) && var8 > 0) {
                        this.field11510.method2571((8 & this.field11528.field2398) != 0, this.field11516, (7 & this.field11528.field2398) != 0, (byte)117);
                        if (this.field11510.field5029) {
                           this.field11510.method641(Integer.MAX_VALUE, this.field11520, this.field11518, this.field11508);
                        }

                        var26 = this.field11510.method2616(arg2 ^ -36);
                        var26.method3675(1.0F / this.field11523, 1.0F, true, 1.0F / this.field11523);
                        this.field11510.method2614(class66.field817, 6);
                        this.field11510.method2659(121, this.field11527, 1);
                        this.field11510.method2642(this.field11528.field2418, (byte)118);
                        this.field11510.method2628(var10 + 1 - var9, 0, var9, arg2 + -72, class260.field3546, var8, var5);
                        this.field11510.method2652(arg2 ^ -13370);
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = arg1[var11];
               }
            }
         }
      } catch (RuntimeException var28) {
         throw class670.method4877(var28, field11529[9] + arg0 + ',' + (arg1 != null ? field11529[2] : field11529[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ms",
      name = "a",
      descriptor = "(IIZI)V",
      line = 185
   )
   public final void method5687(int arg0, int arg1, boolean arg2, int arg3) {
      try {
         this.field11524[this.field11528.field4087 * arg1 - -arg3] = class379.method2928(this.field11524[this.field11528.field4087 * arg1 - -arg3], 1 << arg0);
         ++field11512;
         if (arg2) {
            this.field11526 = -63;
         }

         ++this.field11526;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field11529[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ms",
      name = "a",
      descriptor = "(IFBII)V",
      line = 198
   )
   public final void method5688(int arg0, float arg1, byte arg2, int arg3, int arg4) {
      int var6 = client.field4530;

      try {
         if (~this.field11516 != 0) {
            class327 var7 = this.field11510.field813.method1159(this.field11516, 123);
            int var8 = var7.field4641 & 255;
            if (~var8 != -1 && var7.field4655 != 4) {
               label114: {
                  int var9;
                  label110: {
                     if (arg3 < 0) {
                        var9 = 0;
                        if (var6 == 0) {
                           break label110;
                        }
                     }

                     if (~arg3 < -128) {
                        var9 = 16777215;
                        if (var6 == 0) {
                           break label110;
                        }
                     }

                     var9 = arg3 * 131586;
                  }

                  if (~var8 != -257) {
                     int var11 = -var8 + 256;
                     arg4 = ((arg4 & 65280) * var11 + (65280 & var9) * var8 & 16711680) + (-16711936 & (16711935 & arg4) * var11 + (16711935 & var9) * var8) >> 8;
                     if (var6 == 0) {
                        break label114;
                     }
                  }

                  arg4 = var9;
               }
            }

            int var12 = 255 & var7.field4632;
            if (var12 != 0) {
               var12 += 256;
               int var13 = (255 & arg4 >> 16) * var12;
               if (var13 > 65535) {
                  var13 = 65535;
               }

               int var14 = ((arg4 & 65280) >> 8) * var12;
               if (~var14 < -65536) {
                  var14 = 65535;
               }

               int var15 = (arg4 & 255) * var12;
               if (~var15 < -65536) {
                  var15 = 65535;
               }

               arg4 = (16711878 & var13 << 8) - -(65280 & var14) - -(var15 >> 8);
            }
         }

         if (arg2 >= -117) {
            field11511 = false;
         }

         ++field11519;
         this.field11525.method5096(arg0 * 4);
         if (arg1 != 1.0F) {
            int var18;
            int var19;
            int var20;
            label81: {
               int var16 = arg4 >> 16 & 255;
               int var17 = (arg4 & 65375) >> 8;
               var18 = (int)((float)var16 * arg1);
               var19 = 255 & arg4;
               var20 = (int)((float)var17 * arg1);
               if (~var18 <= -1) {
                  if (~var18 >= -256) {
                     break label81;
                  }

                  var18 = 255;
                  if (var6 == 0) {
                     break label81;
                  }
               }

               var18 = 0;
            }

            int var21;
            label74: {
               var21 = (int)((float)var19 * arg1);
               if (~var20 > -1) {
                  var20 = 0;
                  if (var6 == 0) {
                     break label74;
                  }
               }

               if (~var20 < -256) {
                  var20 = 255;
               }
            }

            label69: {
               if (~var21 <= -1) {
                  if (~var21 >= -256) {
                     break label69;
                  }

                  var21 = 255;
                  if (var6 == 0) {
                     break label69;
                  }
               }

               var21 = 0;
            }

            arg4 = var20 << 8 | var18 << 16 | var21;
         }

         if (this.field11510.field5034 == 0) {
            this.field11525.method5095((byte)arg4);
            this.field11525.method5095((byte)(arg4 >> 8));
            this.field11525.method5095((byte)(arg4 >> 16));
         } else {
            this.field11525.method5095((byte)(arg4 >> 16));
            this.field11525.method5095((byte)(arg4 >> 8));
            this.field11525.method5095((byte)arg4);
         }
      } catch (RuntimeException var23) {
         throw class670.method4877(var23, field11529[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ms",
      name = "b",
      descriptor = "(II)V",
      line = 322
   )
   public final void method5689(int arg0, int arg1) {
      try {
         if (arg0 > 66) {
            ++field11515;
            this.field11521 = this.field11510.method2673((byte)126, true, arg1 * 4);
            this.field11525 = new Stream(this.field11521, 0, arg1 * 4);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field11529[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ms",
      name = "a",
      descriptor = "(I)V",
      line = 337
   )
   public static void method5690(int arg0) {
      try {
         field11509 = null;
         field11517 = null;
         if (arg0 != -2614) {
            field11511 = false;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11529[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ms",
      name = "a",
      descriptor = "(II)V",
      line = 357
   )
   public final void method5691(int arg0, int arg1) {
      try {
         ++field11513;
         this.field11525.method5085();
         this.field11527 = this.field11510.method2610(-2, false);
         if (arg1 != -28431) {
            this.field11520 = -52;
         }

         this.field11527.method420(arg0 * 4, this.field11521, 7491, 4);
         this.field11521 = null;
         this.field11525 = null;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field11529[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ms",
      name = "<init>",
      descriptor = "(Lvda;IIIII)V",
      line = 375
   )
   public class792(class192 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field11528 = arg0;
         this.field11523 = (float)arg2;
         this.field11508 = arg5;
         this.field11510 = this.field11528.field2380;
         this.field11524 = new int[this.field11528.field4087 * this.field11528.field4081];
         this.field11518 = arg4;
         this.field11516 = arg1;
         this.field11520 = arg3;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field11529[3] + (arg0 != null ? field11529[2] : field11529[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ms",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5692(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ms",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5693(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 64;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
