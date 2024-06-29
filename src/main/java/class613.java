import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public class class613 extends class500 {
   @OriginalMember(
      owner = "client!kha",
      name = "p",
      descriptor = "I"
   )
   public int field8559 = 0;
   @OriginalMember(
      owner = "client!kha",
      name = "m",
      descriptor = "Lio;"
   )
   private class465 field8554;
   @OriginalMember(
      owner = "client!kha",
      name = "x",
      descriptor = "Lce;"
   )
   private class327 field8566;
   @OriginalMember(
      owner = "client!kha",
      name = "w",
      descriptor = "I"
   )
   public int field8555;
   @OriginalMember(
      owner = "client!kha",
      name = "u",
      descriptor = "I"
   )
   public int field8563;
   @OriginalMember(
      owner = "client!kha",
      name = "r",
      descriptor = "[I"
   )
   private int[] field8564;
   @OriginalMember(
      owner = "client!kha",
      name = "C",
      descriptor = "F"
   )
   public float field8556;
   @OriginalMember(
      owner = "client!kha",
      name = "n",
      descriptor = "I"
   )
   public int field8553;
   @OriginalMember(
      owner = "client!kha",
      name = "y",
      descriptor = "I"
   )
   public int field8557;
   @OriginalMember(
      owner = "client!kha",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8574 = new String[]{method4461(method4460("Bw0\u001c\u0011\u0001")), method4461(method4460("Bw0\u001c\u0017\u0001")), method4461(method4460("R1\u007f\u001c.")), method4461(method4460("Bw0\u001co@q8Fm\u0001")), method4461(method4460("Gj=^")), method4461(method4460("Bw0\u001c\u0016\u0001")), method4461(method4460("Bw0\u001c\u0010\u0001")), method4461(method4460("Bw0\u001c\u0015\u0001")), method4461(method4460("Bw0\u001c\u0012\u0001")), method4461(method4460("Bw0\u001c\u0014\u0001"))};
   @OriginalMember(
      owner = "client!kha",
      name = "t",
      descriptor = "Lod;"
   )
   public static class536 field8571 = new class536();
   @OriginalMember(
      owner = "client!kha",
      name = "o",
      descriptor = "I"
   )
   public static int field8558;
   @OriginalMember(
      owner = "client!kha",
      name = "k",
      descriptor = "I"
   )
   public static int field8560;
   @OriginalMember(
      owner = "client!kha",
      name = "A",
      descriptor = "I"
   )
   public static int field8562;
   @OriginalMember(
      owner = "client!kha",
      name = "D",
      descriptor = "I"
   )
   public static int field8568;
   @OriginalMember(
      owner = "client!kha",
      name = "B",
      descriptor = "I"
   )
   public static int field8569;
   @OriginalMember(
      owner = "client!kha",
      name = "z",
      descriptor = "I"
   )
   public static int field8570;
   @OriginalMember(
      owner = "client!kha",
      name = "l",
      descriptor = "Lri;"
   )
   public static class122 field8572;
   @OriginalMember(
      owner = "client!kha",
      name = "v",
      descriptor = "Lui;"
   )
   public static class241 field8573;
   @OriginalMember(
      owner = "client!kha",
      name = "j",
      descriptor = "Lso;"
   )
   private class499 field8561;
   @OriginalMember(
      owner = "client!kha",
      name = "q",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field8567;
   @OriginalMember(
      owner = "client!kha",
      name = "s",
      descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   private NativeHeapBuffer field8565;

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method4453(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field8564[this.field8554.field3873 * arg1 + arg0] = class283.method2155(this.field8564[this.field8554.field3873 * arg1 + arg0], arg2 << arg3);
         ++field8569;
         ++this.field8559;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field8574[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method4454(int arg0, int arg1) {
      try {
         if (arg1 <= 46) {
            method4459((byte)-97);
         }

         ++field8568;
         this.field8567.method5109();
         this.field8561 = this.field8566.method2584((byte)-100, false);
         this.field8561.method792(4, false, arg0 * 4, this.field8565);
         this.field8567 = null;
         this.field8565 = null;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8574[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method4455(byte arg0, int arg1) {
      try {
         int var3 = 6 % ((arg0 - 65) / 54);
         ++field8558;
         this.field8565 = this.field8566.method2553(1, true, arg1 * 4);
         this.field8567 = new Stream(this.field8565, 0, arg1 * 4);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field8574[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "([IBI)V"
   )
   public final void method4456(int[] arg0, byte arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         ++field8562;
         class96 var5 = this.field8566.method2497(this.field8559 * 3, -10033);
         Buffer var6 = var5.method896(true, -24730);
         if (var6 != null) {
            if (arg1 <= 22) {
               method4459((byte)-127);
            }

            Stream var7;
            int var8;
            int var9;
            int var10;
            int var11;
            int var10000;
            class251 var26;
            label279: {
               var7 = this.field8566.method2560(var6, 122);
               var8 = 0;
               var9 = 32767;
               var10 = -32768;
               if (Stream.method5101()) {
                  var11 = 0;
                  if (var4 || arg2 > var11) {
                     do {
                        int var12 = arg0[var11];
                        short[] var13 = this.field8554.field6395[var12];
                        int var14 = this.field8564[var12];
                        if (~var14 != -1) {
                           if (var13 == null) {
                              ++var11;
                           } else {
                              int var15 = 0;
                              int var16 = 0;
                              if (!var4 && var16 >= var13.length) {
                                 ++var11;
                              } else {
                                 do {
                                    if (~(1 << var15++ & var14) == -1) {
                                       var16 += 3;
                                       if (!var4) {
                                          continue;
                                       }
                                    }

                                    ++var8;
                                    int var17 = 0;
                                    if (var4 || var17 < 3) {
                                       do {
                                          int var18 = 65535 & var13[var16++];
                                          if (~var9 < ~var18) {
                                             var9 = var18;
                                          }

                                          if (var18 > var10) {
                                             var10 = var18;
                                          }

                                          var7.method5113(var18);
                                          ++var17;
                                       } while(var17 < 3);
                                    }
                                 } while(var16 < var13.length);

                                 ++var11;
                              }
                           }
                        } else {
                           ++var11;
                        }
                     } while(arg2 > var11);
                  }

                  if (!var4) {
                     var7.method5109();
                     var10000 = var5.method898((byte)56);
                     if (!var4) {
                        if (var10000 != 0 && var8 > 0) {
                           this.field8566.method2471(~(8 & this.field8554.field6397) != -1, (byte)-85, this.field8563, ~(7 & this.field8554.field6397) != -1);
                           if (this.field8566.field4612) {
                              this.field8566.method564(Integer.MAX_VALUE, this.field8557, this.field8553, this.field8555);
                           }

                           var26 = this.field8566.method2527(-123);
                           var26.method1888(1.0F, 1.0F / this.field8556, 1.0F / this.field8556, (byte)-35);
                           this.field8566.method2503((byte)10, class489.field6745);
                           this.field8566.method2580(-8833, 1, this.field8561);
                           this.field8566.method2529(-84, this.field8554.field6402);
                           this.field8566.method2483(var10 - -1 + -var9, var8, 0, var9, 72, class631.field8832, var5);
                           this.field8566.method2524((byte)91);
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
               } else if (arg2 <= var11) {
                  var7.method5109();
                  var10000 = var5.method898((byte)56);
                  if (!var4) {
                     if (var10000 != 0 && var8 > 0) {
                        this.field8566.method2471(~(8 & this.field8554.field6397) != -1, (byte)-85, this.field8563, ~(7 & this.field8554.field6397) != -1);
                        if (this.field8566.field4612) {
                           this.field8566.method564(Integer.MAX_VALUE, this.field8557, this.field8553, this.field8555);
                        }

                        var26 = this.field8566.method2527(-123);
                        var26.method1888(1.0F, 1.0F / this.field8556, 1.0F / this.field8556, (byte)-35);
                        this.field8566.method2503((byte)10, class489.field6745);
                        this.field8566.method2580(-8833, 1, this.field8561);
                        this.field8566.method2529(-84, this.field8554.field6402);
                        this.field8566.method2483(var10 - -1 + -var9, var8, 0, var9, 72, class631.field8832, var5);
                        this.field8566.method2524((byte)91);
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
               int var20 = this.field8564[var19];
               short[] var21 = this.field8554.field6395[var19];
               if (var20 != 0) {
                  if (var21 == null) {
                     ++var11;
                  } else {
                     int var22 = 0;
                     int var23 = 0;
                     if (!var4 && ~var23 <= ~var21.length) {
                        ++var11;
                     } else {
                        while(true) {
                           if ((1 << var22++ & var20) == 0) {
                              var23 += 3;
                           } else {
                              int var24 = 0;
                              int var25;
                              if (var4) {
                                 var25 = var21[var23++] & 65535;
                                 if (~var9 < ~var25) {
                                    var9 = var25;
                                 }

                                 if (var10 < var25) {
                                    var10 = var25;
                                 }

                                 var7.method5102(var25);
                                 ++var24;
                              }

                              while(var24 < 3) {
                                 var25 = var21[var23++] & 65535;
                                 if (~var9 < ~var25) {
                                    var9 = var25;
                                 }

                                 if (var10 < var25) {
                                    var10 = var25;
                                 }

                                 var7.method5102(var25);
                                 ++var24;
                              }

                              ++var8;
                              if (var4) {
                                 var23 += 3;
                              }
                           }

                           if (~var23 <= ~var21.length) {
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
                  var7.method5109();
                  var10000 = var5.method898((byte)56);
                  if (!var4) {
                     if (var10000 != 0 && var8 > 0) {
                        this.field8566.method2471(~(8 & this.field8554.field6397) != -1, (byte)-85, this.field8563, ~(7 & this.field8554.field6397) != -1);
                        if (this.field8566.field4612) {
                           this.field8566.method564(Integer.MAX_VALUE, this.field8557, this.field8553, this.field8555);
                        }

                        var26 = this.field8566.method2527(-123);
                        var26.method1888(1.0F, 1.0F / this.field8556, 1.0F / this.field8556, (byte)-35);
                        this.field8566.method2503((byte)10, class489.field6745);
                        this.field8566.method2580(-8833, 1, this.field8561);
                        this.field8566.method2529(-84, this.field8554.field6402);
                        this.field8566.method2483(var10 - -1 + -var9, var8, 0, var9, 72, class631.field8832, var5);
                        this.field8566.method2524((byte)91);
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
         throw class534.method3846(var28, field8574[5] + (arg0 != null ? field8574[2] : field8574[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "(IIIFI)V"
   )
   public final void method4457(int arg0, int arg1, int arg2, float arg3, int arg4) {
      boolean var6 = client.field4273;

      try {
         if (this.field8563 != -1) {
            class359 var7 = this.field8566.field726.method1293(this.field8563, -5150);
            int var8 = var7.field5105 & 255;
            if (var8 != 0 && ~var7.field5114 != -5) {
               label114: {
                  int var9;
                  label110: {
                     if (arg0 < 0) {
                        var9 = 0;
                        if (!var6) {
                           break label110;
                        }
                     }

                     if (~arg0 >= -128) {
                        var9 = arg0 * 131586;
                        if (!var6) {
                           break label110;
                        }
                     }

                     var9 = 16777215;
                  }

                  if (~var8 == -257) {
                     arg2 = var9;
                     if (!var6) {
                        break label114;
                     }
                  }

                  int var11 = -var8 + 256;
                  arg2 = ((65280 & var9) * var8 - -((arg2 & 65280) * var11) & 16711680) + ((arg2 & 16711935) * var11 + (var9 & 16711935) * var8 & -16711936) >> 8;
               }
            }

            int var12 = 255 & var7.field5111;
            if (~var12 != -1) {
               var12 += 256;
               int var13 = (255 & arg2 >> 16) * var12;
               if (var13 > 65535) {
                  var13 = 65535;
               }

               int var14 = (arg2 >> 8 & 255) * var12;
               if (var14 > 65535) {
                  var14 = 65535;
               }

               int var15 = (arg2 & 255) * var12;
               if (var15 > 65535) {
                  var15 = 65535;
               }

               arg2 = ((var13 & 1040252672) << 8) + (var14 & 65280) - -(var15 >> 8);
            }
         }

         ++field8570;
         if (arg1 >= 9) {
            if (arg3 != 1.0F) {
               int var18;
               int var19;
               int var20;
               label81: {
                  int var16 = arg2 >> 16 & 255;
                  int var17 = (65329 & arg2) >> 8;
                  var18 = 255 & arg2;
                  var19 = (int)((float)var16 * arg3);
                  var20 = (int)((float)var17 * arg3);
                  if (var19 >= 0) {
                     if (~var19 >= -256) {
                        break label81;
                     }

                     var19 = 255;
                     if (!var6) {
                        break label81;
                     }
                  }

                  var19 = 0;
               }

               label74: {
                  if (var20 >= 0) {
                     if (var20 <= 255) {
                        break label74;
                     }

                     var20 = 255;
                     if (!var6) {
                        break label74;
                     }
                  }

                  var20 = 0;
               }

               int var21;
               label67: {
                  var21 = (int)((float)var18 * arg3);
                  if (~var21 > -1) {
                     var21 = 0;
                     if (!var6) {
                        break label67;
                     }
                  }

                  if (~var21 < -256) {
                     var21 = 255;
                  }
               }

               arg2 = var20 << 8 | var19 << 16 | var21;
            }

            this.field8567.method5110(arg4 * 4);
            if (~this.field8566.field4604 == -1) {
               this.field8567.method5108((byte)arg2);
               this.field8567.method5108((byte)(arg2 >> 8));
               this.field8567.method5108((byte)(arg2 >> 16));
            } else {
               this.field8567.method5108((byte)(arg2 >> 16));
               this.field8567.method5108((byte)(arg2 >> 8));
               this.field8567.method5108((byte)arg2);
            }
         }
      } catch (RuntimeException var23) {
         throw class534.method3846(var23, field8574[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method4458(int arg0, int arg1) {
      try {
         this.field8567.method5110(arg1 * 4 + 3);
         if (arg0 == 637792840) {
            ++field8560;
            this.field8567.method5108(-1);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8574[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "<init>",
      descriptor = "(Lio;IIIII)V"
   )
   public class613(class465 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field8554 = arg0;
         this.field8566 = this.field8554.field6370;
         this.field8555 = arg5;
         this.field8563 = arg1;
         this.field8564 = new int[this.field8554.field3873 * this.field8554.field3871];
         this.field8556 = (float)arg2;
         this.field8553 = arg4;
         this.field8557 = arg3;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field8574[3] + (arg0 != null ? field8574[2] : field8574[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4459(byte arg0) {
      try {
         field8573 = null;
         field8571 = null;
         if (arg0 == -87) {
            field8572 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8574[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4460(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4461(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 41;
            break;
         case 1:
            var10005 = 31;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 50;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
