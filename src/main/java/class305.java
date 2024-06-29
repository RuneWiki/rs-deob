import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class305 extends class428 {
   @OriginalMember(
      owner = "client!jfa",
      name = "x",
      descriptor = "I"
   )
   public int field4162 = 0;
   @OriginalMember(
      owner = "client!jfa",
      name = "w",
      descriptor = "Ldj;"
   )
   private class363 field4173;
   @OriginalMember(
      owner = "client!jfa",
      name = "s",
      descriptor = "I"
   )
   public int field4175;
   @OriginalMember(
      owner = "client!jfa",
      name = "A",
      descriptor = "Lsc;"
   )
   private class369 field4180;
   @OriginalMember(
      owner = "client!jfa",
      name = "z",
      descriptor = "I"
   )
   public int field4161;
   @OriginalMember(
      owner = "client!jfa",
      name = "H",
      descriptor = "F"
   )
   public float field4163;
   @OriginalMember(
      owner = "client!jfa",
      name = "E",
      descriptor = "[I"
   )
   private int[] field4179;
   @OriginalMember(
      owner = "client!jfa",
      name = "q",
      descriptor = "I"
   )
   public int field4182;
   @OriginalMember(
      owner = "client!jfa",
      name = "p",
      descriptor = "I"
   )
   public int field4176;
   @OriginalMember(
      owner = "client!jfa",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4183 = new String[]{method2280(method2279("A{oo\u0015\u0003")), method2280(method2279("P3 o!")), method2280(method2279("A{oo`Bsg5b\u0003")), method2280(method2279("Ehb-")), method2280(method2279("A{oo\u001e\u0003")), method2280(method2279("A{oo\u0014\u0003")), method2280(method2279("A{oo\u001b\u0003")), method2280(method2279("A{oo\u001a\u0003")), method2280(method2279("A{oo\u0019\u0003")), method2280(method2279("A{oo\u001d\u0003")), method2280(method2279("A{oo\u0018\u0003")), method2280(method2279("A{oo\u001f\u0003"))};
   @OriginalMember(
      owner = "client!jfa",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field4181 = new String[5];
   @OriginalMember(
      owner = "client!jfa",
      name = "v",
      descriptor = "I"
   )
   public static int field4165;
   @OriginalMember(
      owner = "client!jfa",
      name = "n",
      descriptor = "I"
   )
   public static int field4166;
   @OriginalMember(
      owner = "client!jfa",
      name = "F",
      descriptor = "I"
   )
   public static int field4168;
   @OriginalMember(
      owner = "client!jfa",
      name = "o",
      descriptor = "I"
   )
   public static int field4169;
   @OriginalMember(
      owner = "client!jfa",
      name = "u",
      descriptor = "I"
   )
   public static int field4170;
   @OriginalMember(
      owner = "client!jfa",
      name = "t",
      descriptor = "I"
   )
   public static int field4171;
   @OriginalMember(
      owner = "client!jfa",
      name = "C",
      descriptor = "I"
   )
   public static int field4172;
   @OriginalMember(
      owner = "client!jfa",
      name = "B",
      descriptor = "I"
   )
   public static int field4174;
   @OriginalMember(
      owner = "client!jfa",
      name = "m",
      descriptor = "I"
   )
   public static int field4177;
   @OriginalMember(
      owner = "client!jfa",
      name = "r",
      descriptor = "Lbk;"
   )
   private class398 field4178;
   @OriginalMember(
      owner = "client!jfa",
      name = "G",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field4164;
   @OriginalMember(
      owner = "client!jfa",
      name = "y",
      descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   private NativeHeapBuffer field4167;

   @OriginalMember(
      owner = "client!jfa",
      name = "b",
      descriptor = "(IIII)V",
      line = 3
   )
   public static final void method2270(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field4169;
         class755 var4 = class317.method2325((long)arg2, 115, arg0);
         var4.method5479(1288);
         var4.field11184 = arg1;
         var4.field11181 = arg3;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field4183[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "b",
      descriptor = "(II)V",
      line = 21
   )
   public final void method2271(int arg0, int arg1) {
      try {
         ++field4172;
         this.field4167 = this.field4180.method2765(true, arg1 * 4, 107);
         this.field4164 = new Stream(this.field4167, 0, arg1 * 4);
         if (arg0 != 32767) {
            this.field4176 = -59;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4183[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "<init>",
      descriptor = "(Ldj;IIIII)V",
      line = 395
   )
   public class305(class363 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field4173 = arg0;
         this.field4175 = arg3;
         this.field4180 = this.field4173.field4967;
         this.field4161 = arg1;
         this.field4163 = (float)arg2;
         this.field4179 = new int[this.field4173.field4071 * this.field4173.field4064];
         this.field4182 = arg5;
         this.field4176 = arg4;
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field4183[2] + (arg0 != null ? field4183[1] : field4183[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "a",
      descriptor = "(I[II)V",
      line = 40
   )
   public final void method2272(int arg0, int[] arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         ++field4171;
         if (arg2 != -23805) {
            this.method2275(64, 1.2072335F, 49, -13, -19);
         }

         class576 var5 = this.field4180.method2820(this.field4162 * 3, -27208);
         Buffer var6 = var5.method2283(true, (byte)119);
         if (var6 != null) {
            Stream var7;
            int var8;
            int var9;
            int var10;
            int var11;
            int var10000;
            class716 var26;
            label294: {
               var7 = this.field4180.method2805(arg2 + 23698, var6);
               var8 = 0;
               var9 = 32767;
               var10 = -32768;
               if (!Stream.method5106()) {
                  var11 = 0;
                  if (var4 || ~arg0 < ~var11) {
                     do {
                        int var12 = arg1[var11];
                        int var13 = this.field4179[var12];
                        short[] var14 = this.field4173.field4978[var12];
                        if (~var13 != -1) {
                           if (var14 == null) {
                              ++var11;
                           } else {
                              int var15 = 0;
                              int var16 = 0;
                              if (!var4 && ~var14.length >= ~var16) {
                                 ++var11;
                              } else {
                                 do {
                                    if ((1 << var15++ & var13) == 0) {
                                       var16 += 3;
                                       if (!var4) {
                                          continue;
                                       }
                                    }

                                    ++var8;
                                    int var17 = 0;
                                    if (var4 || var17 < 3) {
                                       do {
                                          int var18 = var14[var16++] & 65535;
                                          if (~var18 > ~var9) {
                                             var9 = var18;
                                          }

                                          if (~var10 > ~var18) {
                                             var10 = var18;
                                          }

                                          var7.method5099(var18);
                                          ++var17;
                                       } while(var17 < 3);
                                    }
                                 } while(~var14.length < ~var16);

                                 ++var11;
                              }
                           }
                        } else {
                           ++var11;
                        }
                     } while(~arg0 < ~var11);
                  }

                  if (!var4) {
                     var7.method5102();
                     var10000 = var5.method2282(arg2 + 23759);
                     if (!var4) {
                        if (var10000 != 0 && var8 > 0) {
                           this.field4180.method2741((8 & this.field4173.field4988) != 0, 26, this.field4161, (7 & this.field4173.field4988) != 0);
                           if (this.field4180.field5308) {
                              this.field4180.method557(Integer.MAX_VALUE, this.field4175, this.field4176, this.field4182);
                           }

                           var26 = this.field4180.method2821((byte)111);
                           var26.method5199(1.0F / this.field4163, 119, 1.0F / this.field4163, 1.0F);
                           this.field4180.method2778((byte)-120, class148.field1961);
                           this.field4180.method2585(12, 1, this.field4178);
                           this.field4180.method2621(this.field4173.field4990, -18344);
                           this.field4180.method2628(var5, (byte)107, class394.field5700, var8, 0, var9, -var9 + var10 + 1);
                           this.field4180.method2794((byte)-122);
                           return;
                        }

                        return;
                     }
                     break label294;
                  }
               }

               var11 = 0;
               if (var4) {
                  var10000 = arg1[var11];
               } else if (var11 >= arg0) {
                  var7.method5102();
                  var10000 = var5.method2282(arg2 + 23759);
                  if (!var4) {
                     if (var10000 != 0 && var8 > 0) {
                        this.field4180.method2741((8 & this.field4173.field4988) != 0, 26, this.field4161, (7 & this.field4173.field4988) != 0);
                        if (this.field4180.field5308) {
                           this.field4180.method557(Integer.MAX_VALUE, this.field4175, this.field4176, this.field4182);
                        }

                        var26 = this.field4180.method2821((byte)111);
                        var26.method5199(1.0F / this.field4163, 119, 1.0F / this.field4163, 1.0F);
                        this.field4180.method2778((byte)-120, class148.field1961);
                        this.field4180.method2585(12, 1, this.field4178);
                        this.field4180.method2621(this.field4173.field4990, -18344);
                        this.field4180.method2628(var5, (byte)107, class394.field5700, var8, 0, var9, -var9 + var10 + 1);
                        this.field4180.method2794((byte)-122);
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
               short[] var20 = this.field4173.field4978[var19];
               int var21 = this.field4179[var19];
               if (~var21 != -1) {
                  if (var20 == null) {
                     ++var11;
                  } else {
                     int var22 = 0;
                     int var23 = 0;
                     if (!var4 && var20.length <= var23) {
                        ++var11;
                     } else {
                        while(true) {
                           label308: {
                              int var24;
                              int var25;
                              if ((1 << var22++ & var21) == 0) {
                                 var23 += 3;
                                 if (!var4) {
                                    break label308;
                                 }

                                 var24 = 0;
                                 if (var4) {
                                    var25 = var20[var23++] & 65535;
                                    if (var25 < var9) {
                                       var9 = var25;
                                    }

                                    if (~var25 < ~var10) {
                                       var10 = var25;
                                    }

                                    var7.method5103(var25);
                                    ++var24;
                                 }
                              } else {
                                 var24 = 0;
                                 if (var4) {
                                    var25 = var20[var23++] & 65535;
                                    if (var25 < var9) {
                                       var9 = var25;
                                    }

                                    if (~var25 < ~var10) {
                                       var10 = var25;
                                    }

                                    var7.method5103(var25);
                                    ++var24;
                                 }
                              }

                              while(var24 < 3) {
                                 var25 = var20[var23++] & 65535;
                                 if (var25 < var9) {
                                    var9 = var25;
                                 }

                                 if (~var25 < ~var10) {
                                    var10 = var25;
                                 }

                                 var7.method5103(var25);
                                 ++var24;
                              }

                              ++var8;
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

               if (var11 >= arg0) {
                  var7.method5102();
                  var10000 = var5.method2282(arg2 + 23759);
                  if (!var4) {
                     if (var10000 != 0 && var8 > 0) {
                        this.field4180.method2741((8 & this.field4173.field4988) != 0, 26, this.field4161, (7 & this.field4173.field4988) != 0);
                        if (this.field4180.field5308) {
                           this.field4180.method557(Integer.MAX_VALUE, this.field4175, this.field4176, this.field4182);
                        }

                        var26 = this.field4180.method2821((byte)111);
                        var26.method5199(1.0F / this.field4163, 119, 1.0F / this.field4163, 1.0F);
                        this.field4180.method2778((byte)-120, class148.field1961);
                        this.field4180.method2585(12, 1, this.field4178);
                        this.field4180.method2621(this.field4173.field4990, -18344);
                        this.field4180.method2628(var5, (byte)107, class394.field5700, var8, 0, var9, -var9 + var10 + 1);
                        this.field4180.method2794((byte)-122);
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
         throw class237.method1823(var28, field4183[11] + arg0 + ',' + (arg1 != null ? field4183[1] : field4183[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "a",
      descriptor = "(I)V",
      line = 198
   )
   public static void method2273(int arg0) {
      try {
         if (arg0 != 0) {
            field4177 = -38;
         }

         field4181 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4183[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "a",
      descriptor = "(IIII)V",
      line = 208
   )
   public final void method2274(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field4179[this.field4173.field4071 * arg0 - -arg1] = class300.method2238(this.field4179[this.field4173.field4071 * arg0 - -arg1], arg3 << arg2);
         ++field4166;
         ++this.field4162;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field4183[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "a",
      descriptor = "(IFIII)V",
      line = 219
   )
   public final void method2275(int arg0, float arg1, int arg2, int arg3, int arg4) {
      boolean var6 = client.field4360;

      try {
         if (this.field4161 != -1) {
            class317 var7 = this.field4180.field802.method1354(this.field4161, (byte)-109);
            int var8 = var7.field4321 & 255;
            if (var8 != 0 && ~var7.field4308 != -5) {
               label113: {
                  int var9;
                  label100: {
                     if (arg4 >= 0) {
                        if (arg4 > 127) {
                           var9 = 16777215;
                           if (!var6) {
                              break label100;
                           }
                        }

                        var9 = arg4 * 131586;
                        if (!var6) {
                           break label100;
                        }
                     }

                     var9 = 0;
                  }

                  if (~var8 != -257) {
                     int var11 = -var8 + 256;
                     arg0 = (16711680 & (65280 & arg0) * var11 + (var9 & 65280) * var8) + (-16711936 & (arg0 & 16711935) * var11 + (var9 & 16711935) * var8) >> 8;
                     if (!var6) {
                        break label113;
                     }
                  }

                  arg0 = var9;
               }
            }

            int var12 = var7.field4324 & 255;
            if (~var12 != -1) {
               var12 += 256;
               int var13 = (255 & arg0 >> 16) * var12;
               if (var13 > 65535) {
                  var13 = 65535;
               }

               int var14 = (255 & arg0 >> 8) * var12;
               if (~var14 < -65536) {
                  var14 = 65535;
               }

               int var15 = (255 & arg0) * var12;
               if (var15 > 65535) {
                  var15 = 65535;
               }

               arg0 = (var15 >> 8) + (((var13 & -687800576) << 8) - -(var14 & 65280));
            }
         }

         ++field4168;
         if (arg1 != 1.0F) {
            int var17;
            int var18;
            int var19;
            label83: {
               int var16 = (16748491 & arg0) >> 16;
               var17 = 255 & arg0 >> 8;
               var18 = 255 & arg0;
               var19 = (int)((float)var16 * arg1);
               if (var19 >= 0) {
                  if (var19 <= 255) {
                     break label83;
                  }

                  var19 = 255;
                  if (!var6) {
                     break label83;
                  }
               }

               var19 = 0;
            }

            int var20;
            label76: {
               var20 = (int)((float)var17 * arg1);
               if (~var20 <= -1) {
                  if (var20 <= 255) {
                     break label76;
                  }

                  var20 = 255;
                  if (!var6) {
                     break label76;
                  }
               }

               var20 = 0;
            }

            int var21;
            label69: {
               var21 = (int)((float)var18 * arg1);
               if (var21 >= 0) {
                  if (var21 <= 255) {
                     break label69;
                  }

                  var21 = 255;
                  if (!var6) {
                     break label69;
                  }
               }

               var21 = 0;
            }

            arg0 = var21 | var20 << 8 | var19 << 16;
         }

         this.field4164.method5110(arg2 * 4);
         if (arg3 == 65535) {
            if (~this.field4180.field5278 == -1) {
               this.field4164.method5105((byte)arg0);
               this.field4164.method5105((byte)(arg0 >> 8));
               this.field4164.method5105((byte)(arg0 >> 16));
            } else {
               this.field4164.method5105((byte)(arg0 >> 16));
               this.field4164.method5105((byte)(arg0 >> 8));
               this.field4164.method5105((byte)arg0);
            }
         }
      } catch (RuntimeException var23) {
         throw class237.method1823(var23, field4183[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "a",
      descriptor = "(IZ)V",
      line = 342
   )
   public final void method2276(int arg0, boolean arg1) {
      try {
         ++field4170;
         if (!arg1) {
            this.field4164.method5110(arg0 * 4 + 3);
            this.field4164.method5105(-1);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4183[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "a",
      descriptor = "(IB)V",
      line = 357
   )
   public final void method2277(int arg0, byte arg1) {
      try {
         if (arg1 == 16) {
            ++field4174;
            this.field4164.method5102();
            this.field4178 = this.field4180.method2615(67, false);
            this.field4178.method1413(this.field4167, 4, arg0 * 4, arg1 + -10839);
            this.field4164 = null;
            this.field4167 = null;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4183[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "a",
      descriptor = "(II)V",
      line = 373
   )
   public static final void method2278(int arg0, int arg1) {
      try {
         ++field4165;
         if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
         }

         if (arg1 >= -87) {
            field4177 = -3;
         }

         class2.field9 = arg0;
         class785.field11517 = new class577[class360.field4920[class2.field9] + 1];
         class213.field3042 = 0;
         class362.field4934 = 0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4183[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2279(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2280(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 43;
            break;
         case 1:
            var10005 = 29;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
