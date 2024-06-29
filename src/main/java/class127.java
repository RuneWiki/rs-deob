import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class127 extends class22 {
   @OriginalMember(
      owner = "client!uaa",
      name = "r",
      descriptor = "I"
   )
   public int field2129 = 0;
   @OriginalMember(
      owner = "client!uaa",
      name = "j",
      descriptor = "Lmaa;"
   )
   private class494 field2124;
   @OriginalMember(
      owner = "client!uaa",
      name = "s",
      descriptor = "I"
   )
   public int field2116;
   @OriginalMember(
      owner = "client!uaa",
      name = "m",
      descriptor = "I"
   )
   public int field2118;
   @OriginalMember(
      owner = "client!uaa",
      name = "D",
      descriptor = "Lcs;"
   )
   private class357 field2136;
   @OriginalMember(
      owner = "client!uaa",
      name = "q",
      descriptor = "[I"
   )
   private int[] field2137;
   @OriginalMember(
      owner = "client!uaa",
      name = "E",
      descriptor = "I"
   )
   public int field2120;
   @OriginalMember(
      owner = "client!uaa",
      name = "o",
      descriptor = "F"
   )
   public float field2138;
   @OriginalMember(
      owner = "client!uaa",
      name = "z",
      descriptor = "I"
   )
   public int field2135;
   @OriginalMember(
      owner = "client!uaa",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2139 = new String[]{method1239(method1238("Z\u001a,\u0018&\u0007")), method1239(method1238("Z\u001a,\u0018 \u0007")), method1239(method1238("A\u000e!Z")), method1239(method1238("TUc\u0018\u001a")), method1239(method1238("Z\u001a,\u0018[F\u0015$BY\u0007")), method1239(method1238("Z\u001a,\u0018%\u0007")), method1239(method1238("Z\u001a,\u0018$\u0007")), method1239(method1238("Z\u001a,\u0018!\u0007")), method1239(method1238("Z\u001a,\u0018#\u0007")), method1239(method1238("Z\u001a,\u0018\"\u0007"))};
   @OriginalMember(
      owner = "client!uaa",
      name = "x",
      descriptor = "I"
   )
   public static int field2131 = 13156520;
   @OriginalMember(
      owner = "client!uaa",
      name = "y",
      descriptor = "F"
   )
   public static float field2130;
   @OriginalMember(
      owner = "client!uaa",
      name = "v",
      descriptor = "I"
   )
   public static int field2117;
   @OriginalMember(
      owner = "client!uaa",
      name = "u",
      descriptor = "I"
   )
   public static int field2119;
   @OriginalMember(
      owner = "client!uaa",
      name = "l",
      descriptor = "I"
   )
   public static int field2121;
   @OriginalMember(
      owner = "client!uaa",
      name = "A",
      descriptor = "I"
   )
   public static int field2123;
   @OriginalMember(
      owner = "client!uaa",
      name = "B",
      descriptor = "I"
   )
   public static int field2126;
   @OriginalMember(
      owner = "client!uaa",
      name = "C",
      descriptor = "I"
   )
   public static int field2127;
   @OriginalMember(
      owner = "client!uaa",
      name = "k",
      descriptor = "I"
   )
   public static int field2132;
   @OriginalMember(
      owner = "client!uaa",
      name = "w",
      descriptor = "I"
   )
   public static int field2133;
   @OriginalMember(
      owner = "client!uaa",
      name = "p",
      descriptor = "I"
   )
   public static int field2134;
   @OriginalMember(
      owner = "client!uaa",
      name = "F",
      descriptor = "Lsd;"
   )
   private class102 field2125;
   @OriginalMember(
      owner = "client!uaa",
      name = "t",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field2128;
   @OriginalMember(
      owner = "client!uaa",
      name = "n",
      descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   private NativeHeapBuffer field2122;

   @OriginalMember(
      owner = "client!uaa",
      name = "b",
      descriptor = "(ZI)V",
      line = 6
   )
   public final void method1231(boolean arg0, int arg1) {
      try {
         this.field2122 = this.field2136.method2753(true, (byte)21, arg1 * 4);
         if (arg0) {
            this.method1232(45, -59, 97, -15);
         }

         ++field2117;
         this.field2128 = new Stream(this.field2122, 0, arg1 * 4);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2139[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "a",
      descriptor = "(IIII)V",
      line = 22
   )
   public final void method1232(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field2137[this.field2124.field4080 * arg2 + arg0] = class93.method899(this.field2137[this.field2124.field4080 * arg2 + arg0], 1 << arg1);
         ++field2119;
         ++this.field2129;
         int var5 = 127 % ((arg3 - -56) / 45);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field2139[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "b",
      descriptor = "(BI)V",
      line = 33
   )
   public final void method1233(byte arg0, int arg1) {
      try {
         if (arg0 == -23) {
            this.field2128.method5086();
            ++field2127;
            this.field2125 = this.field2136.method1194((byte)106, false);
            this.field2125.method573(arg1 * 4, 4, false, this.field2122);
            this.field2128 = null;
            this.field2122 = null;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2139[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "a",
      descriptor = "(ZI)V",
      line = 48
   )
   public final void method1234(boolean arg0, int arg1) {
      try {
         ++field2132;
         if (!arg0) {
            method1236(27);
         }

         this.field2128.method5085(arg1 * 4 + 3);
         this.field2128.method5084(-1);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2139[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "a",
      descriptor = "(IFIII)V",
      line = 71
   )
   public final void method1235(int arg0, float arg1, int arg2, int arg3, int arg4) {
      boolean var6 = client.field4564;

      try {
         if (~this.field2118 != 0) {
            class693 var7 = this.field2136.field1192.method1456(-8988, this.field2118);
            int var8 = var7.field10154 & 255;
            if (~var8 != -1 && ~var7.field10167 != -5) {
               label113: {
                  int var9;
                  label109: {
                     if (arg2 < 0) {
                        var9 = 0;
                        if (!var6) {
                           break label109;
                        }
                     }

                     if (~arg2 < -128) {
                        var9 = 16777215;
                        if (!var6) {
                           break label109;
                        }
                     }

                     var9 = arg2 * 131586;
                  }

                  if (var8 == 256) {
                     arg4 = var9;
                     if (!var6) {
                        break label113;
                     }
                  }

                  int var11 = -var8 + 256;
                  arg4 = ((var9 & 16711935) * var8 - -((16711935 & arg4) * var11) & -16711936) + ((65280 & var9) * var8 - -((65280 & arg4) * var11) & 16711680) >> 8;
               }
            }

            int var12 = var7.field10170 & 255;
            if (var12 != 0) {
               var12 += 256;
               int var13 = ((16711680 & arg4) >> 16) * var12;
               if (~var13 < -65536) {
                  var13 = 65535;
               }

               int var14 = ((arg4 & 65280) >> 8) * var12;
               if (var14 > 65535) {
                  var14 = 65535;
               }

               int var15 = (arg4 & 255) * var12;
               if (~var15 < -65536) {
                  var15 = 65535;
               }

               arg4 = (var15 >> 8) + ((var13 & -385810688) << 8) + (var14 & 65280);
            }
         }

         ++field2134;
         if (arg1 != 1.0F) {
            int var17;
            int var18;
            int var19;
            label81: {
               int var16 = (16729773 & arg4) >> 16;
               var17 = (arg4 & 65517) >> 8;
               var18 = arg4 & 255;
               var19 = (int)((float)var16 * arg1);
               if (var19 >= 0) {
                  if (var19 <= 255) {
                     break label81;
                  }

                  var19 = 255;
                  if (!var6) {
                     break label81;
                  }
               }

               var19 = 0;
            }

            int var20;
            int var21;
            label74: {
               var20 = (int)((float)var17 * arg1);
               var21 = (int)((float)var18 * arg1);
               if (var20 < 0) {
                  var20 = 0;
                  if (!var6) {
                     break label74;
                  }
               }

               if (var20 > 255) {
                  var20 = 255;
               }
            }

            label69: {
               if (var21 < 0) {
                  var21 = 0;
                  if (!var6) {
                     break label69;
                  }
               }

               if (~var21 < -256) {
                  var21 = 255;
               }
            }

            arg4 = var21 | var19 << 16 | var20 << 8;
         }

         this.field2128.method5085(arg0 * 4);
         if (arg3 == -1550114872) {
            if (~this.field2136.field5281 != -1) {
               this.field2128.method5084((byte)(arg4 >> 16));
               this.field2128.method5084((byte)(arg4 >> 8));
               this.field2128.method5084((byte)arg4);
            } else {
               this.field2128.method5084((byte)arg4);
               this.field2128.method5084((byte)(arg4 >> 8));
               this.field2128.method5084((byte)(arg4 >> 16));
            }
         }
      } catch (RuntimeException var23) {
         throw class608.method4462(var23, field2139[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "<init>",
      descriptor = "(Lmaa;IIIII)V",
      line = 378
   )
   public class127(class494 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field2124 = arg0;
         this.field2116 = arg3;
         this.field2118 = arg1;
         this.field2136 = this.field2124.field7204;
         this.field2137 = new int[this.field2124.field4080 * this.field2124.field4077];
         this.field2120 = arg5;
         this.field2138 = (float)arg2;
         this.field2135 = arg4;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field2139[4] + (arg0 != null ? field2139[3] : field2139[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "a",
      descriptor = "(I)V",
      line = 194
   )
   public static final void method1236(int arg0) {
      try {
         class41.field961 = null;
         class151.field2423 = null;
         class252.field3606 = false;
         class320.field4613 = null;
         ++field2126;
         if (arg0 == 131586) {
            class157.field2513 = null;
            class226.field3347 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2139[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "a",
      descriptor = "(II[I)V",
      line = 217
   )
   public final void method1237(int arg0, int arg1, int[] arg2) {
      boolean var4 = client.field4564;

      try {
         ++field2123;
         class280 var5 = this.field2136.method2786(this.field2129 * 3, false);
         Buffer var6 = var5.method2188((byte)-46, true);
         if (var6 != null) {
            Stream var7;
            int var8;
            int var9;
            int var10;
            int var11;
            int var10000;
            class104 var26;
            label310: {
               var7 = this.field2136.method2759((byte)37, var6);
               var8 = 0;
               var9 = 32767;
               var10 = -32768;
               if (!Stream.method5090()) {
                  var11 = 0;
                  if (var4 || ~arg0 < ~var11) {
                     do {
                        int var12 = arg2[var11];
                        int var13 = this.field2137[var12];
                        short[] var14 = this.field2124.field7224[var12];
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
                                    if ((1 << var15++ & var13) == 0) {
                                       var16 += 3;
                                       if (!var4) {
                                          continue;
                                       }
                                    }

                                    int var17 = 0;
                                    if (!var4 && var17 >= 3) {
                                       ++var8;
                                    } else {
                                       do {
                                          int var18 = var14[var16++] & 65535;
                                          var7.method5093(var18);
                                          if (var18 < var9) {
                                             var9 = var18;
                                          }

                                          if (~var10 > ~var18) {
                                             var10 = var18;
                                          }

                                          ++var17;
                                       } while(var17 < 3);

                                       ++var8;
                                    }
                                 } while(var16 < var14.length);

                                 ++var11;
                              }
                           }
                        } else {
                           ++var11;
                        }
                     } while(~arg0 < ~var11);
                  }

                  if (!var4) {
                     var10000 = arg1;
                     if (!var4) {
                        if (arg1 != -20301) {
                           this.method1237(-71, 93, (int[])null);
                        }

                        var7.method5086();
                        if (var5.method2190(-28008) && var8 > 0) {
                           this.field2136.method2757(~(7 & this.field2124.field7205) != -1, (byte)20, this.field2118, ~(8 & this.field2124.field7205) != -1);
                           if (this.field2136.field5285) {
                              this.field2136.method325(Integer.MAX_VALUE, this.field2116, this.field2135, this.field2120);
                           }

                           var26 = this.field2136.method2776((byte)97);
                           var26.method984(1.0F / this.field2138, (byte)-125, 1.0F / this.field2138, 1.0F);
                           this.field2136.method2765(class392.field5781, arg1 + 20441);
                           this.field2136.method1202(1, this.field2125, 10);
                           this.field2136.method1166((byte)121, this.field2124.field7235);
                           this.field2136.method1175(var9, 0, var5, 0, var8, class421.field6132, -var9 + var10 - -1);
                           this.field2136.method2744(false);
                           return;
                        }

                        return;
                     }
                     break label310;
                  }
               }

               var11 = 0;
               if (var4) {
                  var10000 = arg2[var11];
               } else if (arg0 <= var11) {
                  var10000 = arg1;
                  if (!var4) {
                     if (arg1 != -20301) {
                        this.method1237(-71, 93, (int[])null);
                     }

                     var7.method5086();
                     if (var5.method2190(-28008) && var8 > 0) {
                        this.field2136.method2757(~(7 & this.field2124.field7205) != -1, (byte)20, this.field2118, ~(8 & this.field2124.field7205) != -1);
                        if (this.field2136.field5285) {
                           this.field2136.method325(Integer.MAX_VALUE, this.field2116, this.field2135, this.field2120);
                        }

                        var26 = this.field2136.method2776((byte)97);
                        var26.method984(1.0F / this.field2138, (byte)-125, 1.0F / this.field2138, 1.0F);
                        this.field2136.method2765(class392.field5781, arg1 + 20441);
                        this.field2136.method1202(1, this.field2125, 10);
                        this.field2136.method1166((byte)121, this.field2124.field7235);
                        this.field2136.method1175(var9, 0, var5, 0, var8, class421.field6132, -var9 + var10 - -1);
                        this.field2136.method2744(false);
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = arg2[var11];
               }
            }

            while(true) {
               int var19 = var10000;
               short[] var20 = this.field2124.field7224[var19];
               int var21 = this.field2137[var19];
               if (var21 != 0) {
                  if (var20 == null) {
                     ++var11;
                  } else {
                     int var22 = 0;
                     int var23 = 0;
                     if (!var4 && ~var23 <= ~var20.length) {
                        ++var11;
                     } else {
                        while(true) {
                           label324: {
                              int var24;
                              int var25;
                              if ((1 << var22++ & var21) == 0) {
                                 var23 += 3;
                                 if (!var4) {
                                    break label324;
                                 }

                                 var24 = 0;
                                 if (var4) {
                                    var25 = var20[var23++] & 65535;
                                    if (~var10 > ~var25) {
                                       var10 = var25;
                                    }

                                    if (~var25 > ~var9) {
                                       var9 = var25;
                                    }

                                    var7.method5094(var25);
                                    ++var24;
                                 }
                              } else {
                                 var24 = 0;
                                 if (var4) {
                                    var25 = var20[var23++] & 65535;
                                    if (~var10 > ~var25) {
                                       var10 = var25;
                                    }

                                    if (~var25 > ~var9) {
                                       var9 = var25;
                                    }

                                    var7.method5094(var25);
                                    ++var24;
                                 }
                              }

                              while(var24 < 3) {
                                 var25 = var20[var23++] & 65535;
                                 if (~var10 > ~var25) {
                                    var10 = var25;
                                 }

                                 if (~var25 > ~var9) {
                                    var9 = var25;
                                 }

                                 var7.method5094(var25);
                                 ++var24;
                              }

                              ++var8;
                           }

                           if (~var23 <= ~var20.length) {
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
                  var10000 = arg1;
                  if (!var4) {
                     if (arg1 != -20301) {
                        this.method1237(-71, 93, (int[])null);
                     }

                     var7.method5086();
                     if (var5.method2190(-28008) && var8 > 0) {
                        this.field2136.method2757(~(7 & this.field2124.field7205) != -1, (byte)20, this.field2118, ~(8 & this.field2124.field7205) != -1);
                        if (this.field2136.field5285) {
                           this.field2136.method325(Integer.MAX_VALUE, this.field2116, this.field2135, this.field2120);
                        }

                        var26 = this.field2136.method2776((byte)97);
                        var26.method984(1.0F / this.field2138, (byte)-125, 1.0F / this.field2138, 1.0F);
                        this.field2136.method2765(class392.field5781, arg1 + 20441);
                        this.field2136.method1202(1, this.field2125, 10);
                        this.field2136.method1166((byte)121, this.field2124.field7235);
                        this.field2136.method1175(var9, 0, var5, 0, var8, class421.field6132, -var9 + var10 - -1);
                        this.field2136.method2744(false);
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = arg2[var11];
               }
            }
         }
      } catch (RuntimeException var28) {
         throw class608.method4462(var28, field2139[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2139[3] : field2139[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1238(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1239(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
