import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public class class709 extends class247 {
   @OriginalMember(
      owner = "client!oia",
      name = "x",
      descriptor = "I"
   )
   public int field10174 = 0;
   @OriginalMember(
      owner = "client!oia",
      name = "t",
      descriptor = "Lpj;"
   )
   private class423 field10183;
   @OriginalMember(
      owner = "client!oia",
      name = "s",
      descriptor = "F"
   )
   public float field10177;
   @OriginalMember(
      owner = "client!oia",
      name = "A",
      descriptor = "[I"
   )
   private int[] field10179;
   @OriginalMember(
      owner = "client!oia",
      name = "w",
      descriptor = "I"
   )
   public int field10172;
   @OriginalMember(
      owner = "client!oia",
      name = "o",
      descriptor = "Ldaa;"
   )
   private class226 field10171;
   @OriginalMember(
      owner = "client!oia",
      name = "m",
      descriptor = "I"
   )
   public int field10169;
   @OriginalMember(
      owner = "client!oia",
      name = "D",
      descriptor = "I"
   )
   public int field10185;
   @OriginalMember(
      owner = "client!oia",
      name = "B",
      descriptor = "I"
   )
   public int field10167;
   @OriginalMember(
      owner = "client!oia",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10190 = new String[]{method5160(method5159("gu\u0013\t( ")), method5160(method5159("gu\u0013\t/ ")), method5160(method5159("gu\u0013\t) ")), method5160(method5159("gu\u0013\t. ")), method5160(method5159("gu\u0013\t* ")), method5160(method5159("fi\u001eK")), method5160(method5159("s2\\\t\u0011")), method5160(method5159("gu\u0013\tPar\u001bSR ")), method5160(method5159("gu\u0013\t- ")), method5160(method5159("gu\u0013\t+ "))};
   @OriginalMember(
      owner = "client!oia",
      name = "j",
      descriptor = "Lmj;"
   )
   public static class730 field10173 = new class730();
   @OriginalMember(
      owner = "client!oia",
      name = "l",
      descriptor = "I"
   )
   public static int field10182 = 0;
   @OriginalMember(
      owner = "client!oia",
      name = "z",
      descriptor = "[[I"
   )
   public static int[][] field10186 = new int[][]{{2, 4, 6, 0}, {0, 2, 4, 6}, {0, 2, 4}, {4, 0, 2}, {2, 4, 0}, {0, 2, 4}, {6, 0, 1, 2, 4, 5}, {0, 4, 7, 6}, {4, 7, 6, 0}, {0, 8, 6, 2, 9, 4}, {2, 9, 4, 0, 8, 6}, {2, 11, 4, 6, 10, 0}, {2, 4, 6, 0}};
   @OriginalMember(
      owner = "client!oia",
      name = "q",
      descriptor = "S"
   )
   public static short field10188 = 1;
   @OriginalMember(
      owner = "client!oia",
      name = "E",
      descriptor = "Z"
   )
   public static boolean field10189 = false;
   @OriginalMember(
      owner = "client!oia",
      name = "C",
      descriptor = "I"
   )
   public static int field10168;
   @OriginalMember(
      owner = "client!oia",
      name = "p",
      descriptor = "I"
   )
   public static int field10170;
   @OriginalMember(
      owner = "client!oia",
      name = "r",
      descriptor = "I"
   )
   public static int field10178;
   @OriginalMember(
      owner = "client!oia",
      name = "F",
      descriptor = "I"
   )
   public static int field10181;
   @OriginalMember(
      owner = "client!oia",
      name = "y",
      descriptor = "I"
   )
   public static int field10184;
   @OriginalMember(
      owner = "client!oia",
      name = "n",
      descriptor = "I"
   )
   public static int field10187;
   @OriginalMember(
      owner = "client!oia",
      name = "k",
      descriptor = "Ldca;"
   )
   private class581 field10180;
   @OriginalMember(
      owner = "client!oia",
      name = "v",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field10175;
   @OriginalMember(
      owner = "client!oia",
      name = "u",
      descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   private NativeHeapBuffer field10176;

   @OriginalMember(
      owner = "client!oia",
      name = "a",
      descriptor = "([III)V"
   )
   public final void method5152(int[] arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         ++field10178;
         class99 var5 = this.field10171.method1982(this.field10174 * 3, 2);
         Buffer var6 = var5.method979(true, true);
         if (var6 != null) {
            Stream var7;
            int var8;
            int var9;
            int var10;
            int var11;
            int var10000;
            class522 var26;
            label279: {
               var7 = this.field10171.method1952((byte)-81, var6);
               var8 = arg1;
               var9 = 32767;
               var10 = -32768;
               if (Stream.method3185()) {
                  var11 = 0;
                  if (var4 || arg2 > var11) {
                     do {
                        int var12 = arg0[var11];
                        short[] var13 = this.field10183.field6174[var12];
                        int var14 = this.field10179[var12];
                        if (~var14 != -1) {
                           if (var13 == null) {
                              ++var11;
                           } else {
                              int var15 = 0;
                              int var16 = 0;
                              if (!var4 && ~var16 <= ~var13.length) {
                                 ++var11;
                              } else {
                                 do {
                                    if ((var14 & 1 << var15++) == 0) {
                                       var16 += 3;
                                       if (!var4) {
                                          continue;
                                       }
                                    }

                                    int var17 = 0;
                                    if (!var4 && ~var17 <= -4) {
                                       ++var8;
                                    } else {
                                       do {
                                          int var18 = var13[var16++] & 65535;
                                          if (~var18 < ~var10) {
                                             var10 = var18;
                                          }

                                          if (var18 < var9) {
                                             var9 = var18;
                                          }

                                          var7.method3181(var18);
                                          ++var17;
                                       } while(~var17 > -4);

                                       ++var8;
                                    }
                                 } while(~var16 > ~var13.length);

                                 ++var11;
                              }
                           }
                        } else {
                           ++var11;
                        }
                     } while(arg2 > var11);
                  }

                  if (!var4) {
                     var7.method3187();
                     var10000 = var5.method982(-23434);
                     if (!var4) {
                        if (var10000 != 0 && var8 > 0) {
                           this.field10171.method2010((this.field10183.field6141 & 7) != 0, 3, this.field10172, ~(8 & this.field10183.field6141) != -1);
                           if (this.field10171.field3404) {
                              this.field10171.method250(Integer.MAX_VALUE, this.field10185, this.field10167, this.field10169);
                           }

                           var26 = this.field10171.method1992((byte)92);
                           var26.method3905(1.0F / this.field10177, 1.0F / this.field10177, (byte)70, 1.0F);
                           this.field10171.method2015(class183.field2686, (byte)117);
                           this.field10171.method1254(1, this.field10180, 4);
                           this.field10171.method1263(this.field10183.field6188, 98);
                           this.field10171.method1230(-var9 + var10 + 1, var8, var5, (byte)92, class482.field6912, var9, 0);
                           this.field10171.method1958(0);
                           return;
                        }

                        return;
                     }
                     break label279;
                  }
               }

               var11 = 0;
               if (var4) {
                  var10000 = arg0[var11];
               } else if (~var11 <= ~arg2) {
                  var7.method3187();
                  var10000 = var5.method982(-23434);
                  if (!var4) {
                     if (var10000 != 0 && var8 > 0) {
                        this.field10171.method2010((this.field10183.field6141 & 7) != 0, 3, this.field10172, ~(8 & this.field10183.field6141) != -1);
                        if (this.field10171.field3404) {
                           this.field10171.method250(Integer.MAX_VALUE, this.field10185, this.field10167, this.field10169);
                        }

                        var26 = this.field10171.method1992((byte)92);
                        var26.method3905(1.0F / this.field10177, 1.0F / this.field10177, (byte)70, 1.0F);
                        this.field10171.method2015(class183.field2686, (byte)117);
                        this.field10171.method1254(1, this.field10180, 4);
                        this.field10171.method1263(this.field10183.field6188, 98);
                        this.field10171.method1230(-var9 + var10 + 1, var8, var5, (byte)92, class482.field6912, var9, 0);
                        this.field10171.method1958(0);
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
               short[] var20 = this.field10183.field6174[var19];
               int var21 = this.field10179[var19];
               if (var21 != 0) {
                  if (var20 == null) {
                     ++var11;
                  } else {
                     int var22 = 0;
                     int var23 = 0;
                     if (!var4 && var20.length <= var23) {
                        ++var11;
                     } else {
                        while(true) {
                           if ((var21 & 1 << var22++) == 0) {
                              var23 += 3;
                           } else {
                              int var24 = 0;
                              int var25;
                              if (var4) {
                                 var25 = var20[var23++] & 65535;
                                 if (var10 < var25) {
                                    var10 = var25;
                                 }

                                 var7.method3178(var25);
                                 if (~var25 > ~var9) {
                                    var9 = var25;
                                 }

                                 ++var24;
                              }

                              while(~var24 > -4) {
                                 var25 = var20[var23++] & 65535;
                                 if (var10 < var25) {
                                    var10 = var25;
                                 }

                                 var7.method3178(var25);
                                 if (~var25 > ~var9) {
                                    var9 = var25;
                                 }

                                 ++var24;
                              }

                              ++var8;
                              if (var4) {
                                 var23 += 3;
                              }
                           }

                           if (var20.length <= var23) {
                              ++var11;
                              break;
                           }
                        }
                     }
                  }
               } else {
                  ++var11;
               }

               if (~var11 <= ~arg2) {
                  var7.method3187();
                  var10000 = var5.method982(-23434);
                  if (!var4) {
                     if (var10000 != 0 && var8 > 0) {
                        this.field10171.method2010((this.field10183.field6141 & 7) != 0, 3, this.field10172, ~(8 & this.field10183.field6141) != -1);
                        if (this.field10171.field3404) {
                           this.field10171.method250(Integer.MAX_VALUE, this.field10185, this.field10167, this.field10169);
                        }

                        var26 = this.field10171.method1992((byte)92);
                        var26.method3905(1.0F / this.field10177, 1.0F / this.field10177, (byte)70, 1.0F);
                        this.field10171.method2015(class183.field2686, (byte)117);
                        this.field10171.method1254(1, this.field10180, 4);
                        this.field10171.method1263(this.field10183.field6188, 98);
                        this.field10171.method1230(-var9 + var10 + 1, var8, var5, (byte)92, class482.field6912, var9, 0);
                        this.field10171.method1958(0);
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = arg0[var11];
               }
            }
         }
      } catch (RuntimeException var28) {
         throw class612.method4503(var28, field10190[9] + (arg0 != null ? field10190[6] : field10190[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oia",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method5153(int arg0, int arg1) {
      try {
         if (arg1 == 5210) {
            ++field10187;
            this.field10175.method3176(arg0 * 4 + 3);
            this.field10175.method3183(-1);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10190[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oia",
      name = "c",
      descriptor = "(II)V"
   )
   public final void method5154(int arg0, int arg1) {
      try {
         ++field10184;
         this.field10175.method3187();
         this.field10180 = this.field10171.method1286(false, false);
         this.field10180.method355(arg1, -23537, this.field10176, arg0 * 4);
         this.field10175 = null;
         this.field10176 = null;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10190[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oia",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method5155(int arg0, int arg1) {
      try {
         ++field10170;
         this.field10176 = this.field10171.method1996((byte)-101, arg0 * 4, true);
         this.field10175 = new Stream(this.field10176, arg1, arg0 * 4);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10190[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oia",
      name = "a",
      descriptor = "(BIIIF)V"
   )
   public final void method5156(byte arg0, int arg1, int arg2, int arg3, float arg4) {
      boolean var6 = client.field10022;

      try {
         if (arg0 <= -117) {
            ++field10181;
            if (this.field10172 != -1) {
               class390 var7 = this.field10171.field240.method2043(-104, this.field10172);
               int var8 = var7.field5679 & 255;
               if (var8 != 0 && ~var7.field5668 != -5) {
                  label114: {
                     int var9;
                     label109: {
                        if (~arg1 > -1) {
                           var9 = 0;
                           if (!var6) {
                              break label109;
                           }
                        }

                        if (~arg1 < -128) {
                           var9 = 16777215;
                           if (!var6) {
                              break label109;
                           }
                        }

                        var9 = arg1 * 131586;
                     }

                     if (var8 == 256) {
                        arg2 = var9;
                        if (!var6) {
                           break label114;
                        }
                     }

                     int var11 = -var8 + 256;
                     arg2 = (16711680 & (var9 & 65280) * var8 - -((65280 & arg2) * var11)) + (-16711936 & (16711935 & arg2) * var11 + (var9 & 16711935) * var8) >> 8;
                  }
               }

               int var12 = 255 & var7.field5677;
               if (~var12 != -1) {
                  var12 += 256;
                  int var13 = ((16711680 & arg2) >> 16) * var12;
                  if (~var13 < -65536) {
                     var13 = 65535;
                  }

                  int var14 = (arg2 >> 8 & 255) * var12;
                  if (~var14 < -65536) {
                     var14 = 65535;
                  }

                  int var15 = (arg2 & 255) * var12;
                  if (var15 > 65535) {
                     var15 = 65535;
                  }

                  arg2 = (16711890 & var13 << 8) + (var15 >> 8) + (var14 & 65280);
               }
            }

            if (arg4 != 1.0F) {
               int var17;
               int var18;
               int var19;
               label80: {
                  int var16 = arg2 >> 16 & 255;
                  var17 = (arg2 & 65313) >> 8;
                  var18 = arg2 & 255;
                  var19 = (int)((float)var16 * arg4);
                  if (var19 < 0) {
                     var19 = 0;
                     if (!var6) {
                        break label80;
                     }
                  }

                  if (~var19 < -256) {
                     var19 = 255;
                  }
               }

               int var20;
               label75: {
                  var20 = (int)((float)var17 * arg4);
                  if (~var20 > -1) {
                     var20 = 0;
                     if (!var6) {
                        break label75;
                     }
                  }

                  if (var20 > 255) {
                     var20 = 255;
                  }
               }

               int var21;
               label70: {
                  var21 = (int)((float)var18 * arg4);
                  if (var21 >= 0) {
                     if (var21 <= 255) {
                        break label70;
                     }

                     var21 = 255;
                     if (!var6) {
                        break label70;
                     }
                  }

                  var21 = 0;
               }

               arg2 = var19 << 16 | var20 << 8 | var21;
            }

            this.field10175.method3176(arg3 * 4);
            if (this.field10171.field3442 != 0) {
               this.field10175.method3183((byte)(arg2 >> 16));
               this.field10175.method3183((byte)(arg2 >> 8));
               this.field10175.method3183((byte)arg2);
            } else {
               this.field10175.method3183((byte)arg2);
               this.field10175.method3183((byte)(arg2 >> 8));
               this.field10175.method3183((byte)(arg2 >> 16));
            }
         }
      } catch (RuntimeException var23) {
         throw class612.method4503(var23, field10190[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oia",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method5157(boolean arg0) {
      try {
         field10173 = null;
         field10186 = null;
         if (!arg0) {
            field10186 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10190[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oia",
      name = "a",
      descriptor = "(IZII)V"
   )
   public final void method5158(int arg0, boolean arg1, int arg2, int arg3) {
      try {
         ++field10168;
         this.field10179[this.field10183.field10665 * arg0 + arg3] = class91.method932(this.field10179[this.field10183.field10665 * arg0 + arg3], 1 << arg2);
         if (!arg1) {
            this.method5152((int[])null, -106, 45);
         }

         ++this.field10174;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field10190[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oia",
      name = "<init>",
      descriptor = "(Lpj;IIIII)V"
   )
   public class709(class423 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field10183 = arg0;
         this.field10177 = (float)arg2;
         this.field10179 = new int[this.field10183.field10666 * this.field10183.field10665];
         this.field10172 = arg1;
         this.field10171 = this.field10183.field6179;
         this.field10169 = arg5;
         this.field10185 = arg3;
         this.field10167 = arg4;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field10190[7] + (arg0 != null ? field10190[6] : field10190[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5159(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 108);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5160(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 8;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 114;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 108;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
